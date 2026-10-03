package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DisambiguatePropertiesTest {

  private Compiler compiler;
  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        Collections.<SourceFile>emptyList(),
        Collections.<SourceFile>emptyList(),
        options);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
    registry = compiler.getTypeRegistry();
  }

  private Compiler compileAndTypeCheck(String externsJs, String codeJs) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true);
    SourceFile externs = SourceFile.fromCode("externs.js", externsJs);
    SourceFile code = SourceFile.fromCode("code.js", codeJs);
    compiler.compile(ImmutableList.of(externs), ImmutableList.of(code), options);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
    return compiler;
  }

  @Test
  public void testForJSTypeSystem_initialization() {
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);
    assertNotNull(pass);
  }

  @Test
  public void testForConcreteTypeSystem_initialization() {
    TightenTypes tightenTypes = new TightenTypes(compiler);
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<ConcreteType> pass =
        DisambiguateProperties.forConcreteTypeSystem(compiler, tightenTypes, propertiesToErrorFor);
    assertNotNull(pass);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_unnormalizedStage_throwsException() {
    compiler.setLifeCycleStage(LifeCycleStage.RAW);
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Node externs = IR.root();
    Node root = IR.root();
    pass.process(externs, root);
  }

  @Test
  public void testProcess_emptyTrees_success() {
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Node externs = IR.root();
    Node root = IR.root();
    pass.process(externs, root);

    Multimap<String, Collection<JSType>> renamed = pass.getRenamedTypesForTesting();
    assertTrue(renamed.isEmpty());
  }

  @Test
  public void testProcess_disambiguatesDistinctTypes() {
    String js = ""
        + "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.display = function() { return 1; };\n"
        + "/** @constructor */ function Bar() {}\n"
        + "Bar.prototype.display = function() { return 2; };\n"
        + "var f = new Foo();\n"
        + "f.display();\n"
        + "var b = new Bar();\n"
        + "b.display();\n";

    Compiler comp = compileAndTypeCheck("", js);
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(comp, propertiesToErrorFor);

    pass.process(comp.getRoot().getFirstChild(), comp.getRoot().getLastChild());

    Multimap<String, Collection<JSType>> renamed = pass.getRenamedTypesForTesting();
    assertTrue(renamed.containsKey("display"));
  }

  @Test
  public void testProcess_externProperty_skipsRenaming() {
    String externs = "var console; console.log = function(x) {};";
    String js = ""
        + "/** @constructor */ function Logger() {}\n"
        + "Logger.prototype.log = function(x) {};\n"
        + "var l = new Logger();\n"
        + "l.log('test');\n"
        + "console.log('test');\n";

    Compiler comp = compileAndTypeCheck(externs, js);
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(comp, propertiesToErrorFor);

    pass.process(comp.getRoot().getFirstChild(), comp.getRoot().getLastChild());
    Multimap<String, Collection<JSType>> renamed = pass.getRenamedTypesForTesting();
    assertFalse(renamed.containsKey("log"));
  }

  @Test
  public void testProcess_objectLiteralProperties() {
    String js = ""
        + "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.foo = function() {};\n"
        + "/** @constructor */ function Bar() {}\n"
        + "Bar.prototype.foo = function() {};\n"
        + "var x = { foo: 1 };\n";

    Compiler comp = compileAndTypeCheck("", js);
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(comp, propertiesToErrorFor);

    pass.process(comp.getRoot().getFirstChild(), comp.getRoot().getLastChild());
    assertNotNull(pass.getRenamedTypesForTesting());
  }

  @Test
  public void testProcess_propertiesToErrorFor_reportsWarning() {
    String js = ""
        + "function test(unknownObj) {\n"
        + "  return unknownObj.specialProp;\n"
        + "}\n";

    Compiler comp = compileAndTypeCheck("", js);
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    propertiesToErrorFor.put("specialProp", CheckLevel.WARNING);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(comp, propertiesToErrorFor);

    pass.process(comp.getRoot().getFirstChild(), comp.getRoot().getLastChild());
    assertTrue(comp.getWarningCount() > 0);
  }

  @Test
  public void testProcess_withInterfaceInheritance() {
    String js = ""
        + "/** @interface */ function InterfaceA() {}\n"
        + "InterfaceA.prototype.run = function() {};\n"
        + "/** @interface \n"
        + " *  @extends {InterfaceA} */ function InterfaceB() {}\n"
        + "/** @constructor \n"
        + " *  @implements {InterfaceB} */ function Impl() {}\n"
        + "Impl.prototype.run = function() {};\n"
        + "var item = new Impl();\n"
        + "item.run();\n";

    Compiler comp = compileAndTypeCheck("", js);
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(comp, propertiesToErrorFor);

    pass.process(comp.getRoot().getFirstChild(), comp.getRoot().getLastChild());
    assertNotNull(pass.getRenamedTypesForTesting());
  }

  @Test
  public void testProcess_typeMismatchHandling() {
    String js = ""
        + "/** @constructor */ function Foo() { this.prop = 1; }\n"
        + "/** @constructor */ function Bar() { this.prop = 2; }\n"
        + "/** @param {Foo} f */ function testMismatch(f) {}\n"
        + "testMismatch(new Bar());\n";

    Compiler comp = compileAndTypeCheck("", js);
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(comp, propertiesToErrorFor);

    pass.process(comp.getRoot().getFirstChild(), comp.getRoot().getLastChild());
    assertNotNull(pass.getRenamedTypesForTesting());
  }

  @Test
  public void testGetTypeWithProperty_nullType_returnsNull() {
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    assertNull(pass.getTypeWithProperty("foo", null));
  }

  @Test
  public void testGetTypeWithProperty_prototypeProperty_returnsNull() {
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertNull(pass.getTypeWithProperty("prototype", objectType));
  }

  @Test
  public void testGetTypeWithProperty_autoboxesPrimitive() {
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    ObjectType typeWithProp = (ObjectType) pass.getTypeWithProperty("charAt", stringType);
    assertNotNull(typeWithProp);
  }

  @Test
  public void testGetTypeWithProperty_customObjectType() {
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    FunctionType constructor = registry.createConstructorType(
        "CustomType", null, null, null, null);
    ObjectType instance = constructor.getInstanceType();
    instance.defineDeclaredProperty("customField", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

    ObjectType found = (ObjectType) pass.getTypeWithProperty("customField", instance);
    assertNotNull(found);
    assertEquals(instance, found);
  }

  @Test
  public void testGetTypeWithProperty_enumElementType() {
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    EnumType enumType = registry.createEnumType("MyEnum", null, registry.getNativeType(JSTypeNative.STRING_TYPE));
    JSType enumElementType = enumType.getElementsType();

    ObjectType found = (ObjectType) pass.getTypeWithProperty("charAt", enumElementType);
    assertNotNull(found);
  }

  @Test
  public void testConcreteTypeSystem_process() {
    String js = ""
        + "function Foo() {}\n"
        + "Foo.prototype.foo = function() {};\n"
        + "function Bar() {}\n"
        + "Bar.prototype.foo = function() {};\n"
        + "var f = new Foo(); f.foo();\n"
        + "var b = new Bar(); b.foo();\n";

    Compiler comp = compileAndTypeCheck("", js);
    TightenTypes tightenTypes = new TightenTypes(comp);
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<ConcreteType> pass =
        DisambiguateProperties.forConcreteTypeSystem(comp, tightenTypes, propertiesToErrorFor);

    pass.process(comp.getRoot().getFirstChild(), comp.getRoot().getLastChild());
    Multimap<String, Collection<ConcreteType>> renamed = pass.getRenamedTypesForTesting();
    assertNotNull(renamed);
  }

  @Test
  public void testConcreteTypeSystem_getTypeWithProperty_noneAndUnion() {
    TightenTypes tightenTypes = new TightenTypes(compiler);
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<ConcreteType> pass =
        DisambiguateProperties.forConcreteTypeSystem(compiler, tightenTypes, propertiesToErrorFor);

    ConcreteType noneType = ConcreteType.NONE;
    ConcreteType unique = pass.getTypeWithProperty("foo", noneType);
    assertNotNull(unique);

    ConcreteType allType = ConcreteType.ALL;
    ConcreteType fromAll = pass.getTypeWithProperty("foo", allType);
    assertNull(fromAll);
  }

  @Test
  public void testGetProperty_createsAndReturnsSameProperty() {
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    DisambiguateProperties<JSType>.Property p1 = pass.getProperty("customProp");
    DisambiguateProperties<JSType>.Property p2 = pass.getProperty("customProp");
    assertNotNull(p1);
    assertEquals(p1, p2);
    assertEquals("customProp", p1.name);
  }

  @Test
  public void testWarningsConstants() {
    assertNotNull(DisambiguateProperties.Warnings.INVALIDATION);
    assertNotNull(DisambiguateProperties.Warnings.INVALIDATION_ON_TYPE);
  }
}
