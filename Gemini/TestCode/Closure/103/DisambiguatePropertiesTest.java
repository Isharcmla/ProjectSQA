package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.UnionType;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;

public class DisambiguatePropertiesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private Node compileAndCheck(String externsJs, String codeJs) {
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.init(
        Collections.singletonList(SourceFile.fromCode("externs.js", externsJs)),
        Collections.singletonList(SourceFile.fromCode("testcode.js", codeJs)),
        options);
    Node root = compiler.parseInputs();
    assertNotNull(root);
    TypeCheck typeCheck = new TypeCheck(
        compiler,
        new SemanticReverseAbstractInterpreter(
            compiler.getCodingConvention(), compiler.getTypeRegistry()),
        compiler.getTypeRegistry());
    Node externsNode = root.getFirstChild();
    Node mainRoot = root.getLastChild();
    typeCheck.process(externsNode, mainRoot);
    return root;
  }

  @Test
  public void testForJSTypeSystem_creation_nonNull() {
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    assertNotNull(pass);
  }

  @Test
  public void testForConcreteTypeSystem_creation_nonNull() {
    TightenTypes tt = new TightenTypes(compiler);
    DisambiguateProperties<ConcreteType> pass =
        DisambiguateProperties.forConcreteTypeSystem(compiler, tt);
    assertNotNull(pass);
  }

  @Test
  public void testProcess_disjointTypes_renamesProperties() {
    String externs = "";
    String js =
        "/** @constructor */ function Foo() { this.a = 1; }\n"
        + "/** @constructor */ function Bar() { this.a = 2; }\n"
        + "var f = new Foo(); f.a;\n"
        + "var b = new Bar(); b.a;\n";
    Node root = compileAndCheck(externs, js);
    Node externsNode = root.getFirstChild();
    Node mainRoot = root.getLastChild();

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(externsNode, mainRoot);

    Multimap<String, Collection<JSType>> renamed =
        pass.getRenamedTypesForTesting();
    assertTrue(renamed.containsKey("a"));
    assertEquals(2, renamed.get("a").size());
  }

  @Test
  public void testProcess_singleTypeProperty_notRenamed() {
    String externs = "";
    String js =
        "/** @constructor */ function Foo() { this.onlyFoo = 1; }\n"
        + "var f = new Foo(); f.onlyFoo;\n";
    Node root = compileAndCheck(externs, js);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(root.getFirstChild(), root.getLastChild());

    Multimap<String, Collection<JSType>> renamed =
        pass.getRenamedTypesForTesting();
    assertFalse(renamed.containsKey("onlyFoo"));
  }

  @Test
  public void testProcess_externProperties_skipped() {
    String externs = "var window; window.alert;";
    String js =
        "/** @constructor */ function Foo() { this.alert = 1; }\n"
        + "var f = new Foo(); f.alert;\n";
    Node root = compileAndCheck(externs, js);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(root.getFirstChild(), root.getLastChild());

    Multimap<String, Collection<JSType>> renamed =
        pass.getRenamedTypesForTesting();
    assertTrue(renamed.get("alert").isEmpty());
  }

  @Test
  public void testProcess_externPrototypeProperty_skipped() {
    String externs = "/** @constructor */ function External() {} External.prototype.testProp;";
    String js =
        "/** @constructor */ function Foo() { this.testProp = 1; }\n"
        + "var f = new Foo(); f.testProp;\n"
        + "var ext = new External(); ext.testProp;\n";
    Node root = compileAndCheck(externs, js);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(root.getFirstChild(), root.getLastChild());

    Multimap<String, Collection<JSType>> renamed =
        pass.getRenamedTypesForTesting();
    assertTrue(renamed.get("testProp").isEmpty());
  }

  @Test
  public void testProcess_objectLiterals_renamed() {
    String externs = "";
    String js =
        "/** @constructor */ function Foo() { this.b = 1; }\n"
        + "var f = new Foo(); f.b;\n"
        + "var obj = { 'b': 2 };\n";
    Node root = compileAndCheck(externs, js);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(root.getFirstChild(), root.getLastChild());

    assertNotNull(pass.getProperty("b"));
  }

  @Test
  public void testProcess_unionTypes_handled() {
    String externs = "";
    String js =
        "/** @constructor */ function A() { this.x = 1; }\n"
        + "/** @constructor */ function B() { this.x = 2; }\n"
        + "/** @constructor */ function C() { this.x = 3; }\n"
        + "/** @type {A|B} */ var u = new A(); u.x;\n"
        + "var c = new C(); c.x;\n";
    Node root = compileAndCheck(externs, js);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(root.getFirstChild(), root.getLastChild());

    Multimap<String, Collection<JSType>> renamed =
        pass.getRenamedTypesForTesting();
    assertTrue(renamed.containsKey("x"));
  }

  @Test
  public void testProcess_interfaceImplementation_recordsInterfaces() {
    String externs = "";
    String js =
        "/** @interface */ function IntA() {}\n"
        + "IntA.prototype.bar = function() {};\n"
        + "/** @constructor @implements {IntA} */ function ImplA() {}\n"
        + "ImplA.prototype.bar = function() {};\n"
        + "/** @constructor */ function Other() { this.bar = 1; }\n"
        + "var a = new ImplA(); a.bar();\n"
        + "var o = new Other(); o.bar;\n";
    Node root = compileAndCheck(externs, js);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(root.getFirstChild(), root.getLastChild());

    Multimap<String, Collection<JSType>> renamed =
        pass.getRenamedTypesForTesting();
    assertTrue(renamed.containsKey("bar"));
  }

  @Test
  public void testProcess_superInterfaceImplementation_recordsHierarchy() {
    String externs = "";
    String js =
        "/** @interface */ function SuperInt() {}\n"
        + "SuperInt.prototype.bar = function() {};\n"
        + "/** @interface @extends {SuperInt} */ function SubInt() {}\n"
        + "/** @constructor @implements {SubInt} */ function ImplSub() {}\n"
        + "ImplSub.prototype.bar = function() {};\n"
        + "/** @constructor */ function Unrelated() { this.bar = 2; }\n"
        + "var s = new ImplSub(); s.bar();\n"
        + "var u = new Unrelated(); u.bar;\n";
    Node root = compileAndCheck(externs, js);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(root.getFirstChild(), root.getLastChild());

    Multimap<String, Collection<JSType>> renamed =
        pass.getRenamedTypesForTesting();
    assertNotNull(renamed);
  }

  @Test
  public void testProcess_typeMismatch_invalidatesTypes() {
    String externs = "";
    String js =
        "/** @constructor */ function Foo() { this.z = 1; }\n"
        + "/** @constructor */ function Bar() { this.z = 2; }\n"
        + "/** @type {Foo} */ var f = new Foo();\n"
        + "/** @type {Bar} */ var b = new Bar();\n"
        + "f = b;\n" // Causes TypeMismatch
        + "f.z; b.z;\n";
    Node root = compileAndCheck(externs, js);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(root.getFirstChild(), root.getLastChild());

    Multimap<String, Collection<JSType>> renamed =
        pass.getRenamedTypesForTesting();
    assertTrue(renamed.get("z").isEmpty());
  }

  @Test
  public void testProcess_anonymousObject_skippedRenaming() {
    String externs = "";
    String js =
        "/** @constructor */ function Foo() { this.anonProp = 1; }\n"
        + "var f = new Foo(); f.anonProp;\n"
        + "var anon = {}; anon.anonProp = 2;\n";
    Node root = compileAndCheck(externs, js);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(root.getFirstChild(), root.getLastChild());

    Multimap<String, Collection<JSType>> renamed =
        pass.getRenamedTypesForTesting();
    assertTrue(renamed.get("anonProp").isEmpty());
  }

  @Test
  public void testProcess_enumsAndAutoboxing_skipped() {
    String externs = "";
    String js =
        "/** @enum {string} */ var MyEnum = { A: 'a', B: 'b' };\n"
        + "/** @constructor */ function Foo() { this.length = 10; }\n"
        + "var f = new Foo(); f.length;\n"
        + "var str = 'hello'; str.length;\n";
    Node root = compileAndCheck(externs, js);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(root.getFirstChild(), root.getLastChild());

    Multimap<String, Collection<JSType>> renamed =
        pass.getRenamedTypesForTesting();
    assertNotNull(renamed);
  }

  @Test
  public void testGetTypeWithProperty_prototypeProperty_returnsNull() {
    compileAndCheck("", "var x = 1;");
    JSTypeRegistry registry = compiler.getTypeRegistry();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);

    ObjectType objType = registry.createAnonymousObjectType();
    objType.defineDeclaredProperty("prototype", registry.getNativeType(JSTypeNative.OBJECT_TYPE), null);

    JSType result = pass.getTypeWithProperty("prototype", objType);
    assertNull(result);
  }

  @Test
  public void testGetTypeWithProperty_autoboxedPrimitive_findsProperty() {
    compileAndCheck("", "var x = 1;");
    JSTypeRegistry registry = compiler.getTypeRegistry();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);

    JSType stringPrimitive = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType result = pass.getTypeWithProperty("charAt", stringPrimitive);
    assertNotNull(result);

    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    assertNull(pass.getTypeWithProperty("charAt", nullType));
  }

  @Test
  public void testGetTypeWithProperty_inheritedProperty_returnsTopType() {
    compileAndCheck("", "var x = 1;");
    JSTypeRegistry registry = compiler.getTypeRegistry();
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);

    FunctionType parentFunc = registry.createConstructorType("Parent", null, null, null);
    ObjectType parentInstance = parentFunc.getInstanceType();
    parentInstance.defineDeclaredProperty("inheritedProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

    FunctionType childFunc = registry.createConstructorType("Child", null, null, null);
    ObjectType childInstance = childFunc.getInstanceType();
    childInstance.setImplicitPrototype(parentInstance);

    JSType top = pass.getTypeWithProperty("inheritedProp", childInstance);
    assertEquals(parentInstance, top);
  }

  @Test
  public void testConcreteTypeSystem_processWithTightenTypes() {
    String externs = "";
    String js =
        "function Foo() { this.propA = 1; }\n"
        + "function Bar() { this.propA = 2; }\n"
        + "var f = new Foo(); f.propA;\n"
        + "var b = new Bar(); b.propA;\n";
    Node root = compileAndCheck(externs, js);

    TightenTypes tt = new TightenTypes(compiler);
    tt.process(root.getFirstChild(), root.getLastChild());
    DisambiguateProperties<ConcreteType> pass =
        DisambiguateProperties.forConcreteTypeSystem(compiler, tt);
    pass.process(root.getFirstChild(), root.getLastChild());

    Multimap<String, Collection<ConcreteType>> renamed =
        pass.getRenamedTypesForTesting();
    assertNotNull(renamed);
  }

  @Test
  public void testConcreteTypeSystem_getTypeWithProperty_variousConcreteTypes() {
    compileAndCheck("", "var x = 1;");
    TightenTypes tt = new TightenTypes(compiler);
    DisambiguateProperties<ConcreteType> pass =
        DisambiguateProperties.forConcreteTypeSystem(compiler, tt);

    // NONE concrete type
    ConcreteType noneType = ConcreteType.NONE;
    ConcreteType resultNone = pass.getTypeWithProperty("testNone", noneType);
    assertNotNull(resultNone);
    assertTrue(resultNone.isUnique());

    // ALL concrete type
    ConcreteType allType = ConcreteType.ALL;
    ConcreteType resultAll = pass.getTypeWithProperty("testAll", allType);
    assertNull(resultAll);

    // Function concrete type
    ConcreteType funcType = tt.createConcreteFunction(
        new Node(Token.FUNCTION, Node.newString(Token.NAME, "fn"), new Node(Token.LP), new Node(Token.BLOCK)),
        tt.getTopScope());
    ConcreteType resultProto = pass.getTypeWithProperty("prototype", funcType);
    assertEquals(funcType, resultProto);

    ConcreteType resultOther = pass.getTypeWithProperty("other", funcType);
    assertNull(resultOther);

    // Union concrete type
    ConcreteType unionType = ConcreteType.createUnion(resultNone, funcType);
    ConcreteType resultUnion = pass.getTypeWithProperty("prototype", unionType);
    assertEquals(funcType, resultUnion);

    ConcreteType resultUnionMissing = pass.getTypeWithProperty("missing", unionType);
    assertNotNull(resultUnionMissing); // Returns unique type from none
  }

  @Test
  public void testProperty_invalidateAndAddType() {
    compileAndCheck("", "var x = 1;");
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    JSTypeRegistry registry = compiler.getTypeRegistry();
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    ObjectType fooType = registry.createAnonymousObjectType();
    fooType.defineDeclaredProperty("field", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("testField");

    assertFalse(prop.skipRenaming);
    assertTrue(prop.invalidate());
    assertTrue(prop.skipRenaming);
    assertFalse(prop.invalidate()); // Second time returns false (no state change)

    // Property on invalidating type returns false
    DisambiguateProperties<JSType>.Property prop2 = pass.getProperty("testInvalid");
    boolean added = prop2.addType(unknownType, unknownType, null);
    assertFalse(added);
    assertTrue(prop2.skipRenaming);
  }

  @Test(expected = IllegalStateException.class)
  public void testProperty_addType_throwsWhenAlreadySkipped() {
    compileAndCheck("", "var x = 1;");
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    JSTypeRegistry registry = compiler.getTypeRegistry();
    ObjectType fooType = registry.createAnonymousObjectType();

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("thrownField");
    prop.invalidate();
    prop.addType(fooType, fooType, null);
  }

  @Test
  public void testProperty_scheduleRenaming_withInvalidatingType() {
    compileAndCheck("", "var x = 1;");
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    JSTypeRegistry registry = compiler.getTypeRegistry();
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("scheduled");
    Node propNode = Node.newString(Token.NAME, "scheduled");

    boolean scheduled = prop.scheduleRenaming(propNode, unknownType);
    assertFalse(scheduled);
    assertTrue(prop.skipRenaming);

    // If already skipped, returns true without scheduling
    boolean scheduledAgain = prop.scheduleRenaming(propNode, unknownType);
    assertTrue(scheduledAgain);
  }

  @Test
  public void testProperty_expandTypesToSkip_unionsAndTransitiveSkip() {
    compileAndCheck("", "var x = 1;");
    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    JSTypeRegistry registry = compiler.getTypeRegistry();

    FunctionType typeA = registry.createConstructorType("TypeA", null, null, null);
    FunctionType typeB = registry.createConstructorType("TypeB", null, null, null);
    FunctionType typeC = registry.createConstructorType("TypeC", null, null, null);

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("expandField");
    prop.addType(typeA.getInstanceType(), typeA.getInstanceType(), null);
    prop.addType(typeB.getInstanceType(), typeB.getInstanceType(), null);
    prop.addType(typeC.getInstanceType(), typeC.getInstanceType(), null);

    // Join TypeA and TypeB into an equivalence class
    prop.getTypes().union(typeA.getInstanceType(), typeB.getInstanceType());

    // Mark TypeA as skipped
    prop.addTypeToSkip(typeA.getInstanceType());

    assertTrue(prop.shouldRename());
    prop.expandTypesToSkip();

    // TypeB should now also be marked as skipped because it is in the same class
    assertTrue(prop.typesToSkip.contains(typeB.getInstanceType()));
    assertFalse(prop.shouldRename(typeA.getInstanceType()));
    assertFalse(prop.shouldRename(typeB.getInstanceType()));
    assertTrue(prop.shouldRename(typeC.getInstanceType()));
  }

  @Test
  public void testProcess_namedTypeUnknown_handledProperly() {
    compileAndCheck("", "var x = 1;");
    JSTypeRegistry registry = compiler.getTypeRegistry();
    NamedType namedType = new NamedType(registry, "NonExistentType", "source.js", 1, 1);
    namedType.resolve(null, registry.getEmptyScope());

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("namedProp");
    boolean added = prop.addType(namedType, namedType, null);
    assertFalse(added);
    assertTrue(prop.skipRenaming);
  }

  @Test
  public void testProcess_deepInterfaceChain_handled() {
    String externs = "";
    String js =
        "/** @interface */ function BaseInt() {}\n"
        + "BaseInt.prototype.method = function() {};\n"
        + "/** @interface @extends {BaseInt} */ function MidInt() {}\n"
        + "/** @constructor @implements {MidInt} */ function SuperClass() {}\n"
        + "SuperClass.prototype.method = function() {};\n"
        + "/** @constructor @extends {SuperClass} */ function SubClass() {}\n"
        + "/** @constructor */ function OtherClass() { this.method = function() {}; }\n"
        + "var s = new SubClass(); s.method();\n"
        + "var o = new OtherClass(); o.method();\n";
    Node root = compileAndCheck(externs, js);

    DisambiguateProperties<JSType> pass =
        DisambiguateProperties.forJSTypeSystem(compiler);
    pass.process(root.getFirstChild(), root.getLastChild());

    Multimap<String, Collection<JSType>> renamed =
        pass.getRenamedTypesForTesting();
    assertNotNull(renamed);
  }
}
