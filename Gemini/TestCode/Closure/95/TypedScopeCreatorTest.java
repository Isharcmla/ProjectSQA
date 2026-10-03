package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

public class TypedScopeCreatorTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  private Scope createGlobalScope(String js) {
    return createGlobalScope(js, new GoogleCodingConvention());
  }

  private Scope createGlobalScope(String js, CodingConvention convention) {
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, convention);
    return creator.createScope(root, null);
  }

  private Scope createLocalScope(Scope parent, Node functionNode) {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    return creator.createScope(functionNode, parent);
  }

  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = parse("");
    Scope scope = creator.createInitialScope(root);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("Function"));
    assertNotNull(scope.getVar("Date"));
    assertNotNull(scope.getVar("RegExp"));
    assertNotNull(scope.getVar("Error"));
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("goog.typedef"));
    assertNotNull(scope.getVar("ActiveXObject"));
  }

  @Test
  public void testConstructorWithSingleCompilerArg() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = parse("var a = 10;");
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope.getVar("a"));
  }

  @Test
  public void testLiteralTypeInference() {
    String js = "var n = null;\n"
        + "var v = void 0;\n"
        + "var s = 'hello';\n"
        + "var num = 42;\n"
        + "var t = true;\n"
        + "var f = false;\n"
        + "var r = /abc/;\n"
        + "var obj = {};";
    Scope scope = createGlobalScope(js);

    assertEquals(0, compiler.getErrorCount());
    assertNotNull(scope.getVar("n"));
    assertNotNull(scope.getVar("v"));
    assertNotNull(scope.getVar("s"));
    assertNotNull(scope.getVar("num"));
    assertNotNull(scope.getVar("t"));
    assertNotNull(scope.getVar("f"));
    assertNotNull(scope.getVar("r"));
    assertNotNull(scope.getVar("obj"));
  }

  @Test
  public void testVarDeclarations_typedAndUntyped() {
    String js = "var a = 1;\n"
        + "/** @type {string} */ var b;\n"
        + "/** @type {boolean} */ var c = true;\n"
        + "var d = 'str', e = 2;";
    Scope scope = createGlobalScope(js);

    assertTrue(scope.isDeclared("a", false));
    assertTrue(scope.isDeclared("b", false));
    assertTrue(scope.isDeclared("c", false));
    assertTrue(scope.isDeclared("d", false));
    assertTrue(scope.isDeclared("e", false));

    assertEquals(
        compiler.getTypeRegistry().getNativeType(JSTypeNative.STRING_TYPE),
        scope.getVar("b").getType());
    assertEquals(
        compiler.getTypeRegistry().getNativeType(JSTypeNative.BOOLEAN_TYPE),
        scope.getVar("c").getType());
  }

  @Test
  public void testMultipleVarDefinitionsWithDocWarning() {
    String js = "/** @type {number} */ var a = 1, b = 2;";
    createGlobalScope(js);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testFunctionDeclarationsAndGlobalThis() {
    String js = "function globalFn(p1, p2) { return p1; }\n"
        + "/** @param {number} x\n"
        + "  * @return {string} */\n"
        + "function typedFn(x) { return '' + x; }";
    Scope scope = createGlobalScope(js);

    Scope.Var globalFnVar = scope.getVar("globalFn");
    assertNotNull(globalFnVar);
    assertTrue(globalFnVar.getType().isFunctionType());

    Scope.Var typedFnVar = scope.getVar("typedFn");
    assertNotNull(typedFnVar);
    assertTrue(typedFnVar.getType().isFunctionType());
  }

  @Test
  public void testConstructorAndPrototypeProperties() {
    String js = "/** @constructor */\n"
        + "function Foo() {\n"
        + "  /** @type {number} */\n"
        + "  this.bar = 123;\n"
        + "}\n"
        + "Foo.prototype.getBar = function() { return this.bar; };\n"
        + "/** @type {string} */\n"
        + "Foo.prototype.name = 'foo';";
    Scope scope = createGlobalScope(js);

    Scope.Var fooVar = scope.getVar("Foo");
    assertNotNull(fooVar);
    FunctionType fooType = (FunctionType) fooVar.getType();
    assertTrue(fooType.isConstructor());

    ObjectType instanceType = fooType.getInstanceType();
    assertTrue(instanceType.hasProperty("bar"));
    assertEquals(
        compiler.getTypeRegistry().getNativeType(JSTypeNative.NUMBER_TYPE),
        instanceType.getPropertyType("bar"));

    assertTrue(scope.isDeclared("Foo.prototype.getBar", false));
    assertTrue(scope.isDeclared("Foo.prototype.name", false));
  }

  @Test
  public void testLocalScopeCreationAndParameters() {
    String js = "/** @param {number} a\n"
        + "  * @param {string} b */\n"
        + "function testLocal(a, b) {\n"
        + "  var localVar = 10;\n"
        + "  try {\n"
        + "    var insideTry = 20;\n"
        + "  } catch (err) {\n"
        + "    var insideCatch = 30;\n"
        + "  }\n"
        + "  return function inner(c) { return a + c; };\n"
        + "}";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node fnNode = root.getFirstChild();
    Scope localScope = creator.createScope(fnNode, globalScope);

    assertTrue(localScope.isDeclared("a", false));
    assertTrue(localScope.isDeclared("b", false));
    assertTrue(localScope.isDeclared("localVar", false));
    assertTrue(localScope.isDeclared("insideTry", false));
    assertTrue(localScope.isDeclared("err", false));
    assertTrue(localScope.isDeclared("insideCatch", false));

    assertEquals(
        compiler.getTypeRegistry().getNativeType(JSTypeNative.NUMBER_TYPE),
        localScope.getVar("a").getType());
    assertEquals(
        compiler.getTypeRegistry().getNativeType(JSTypeNative.STRING_TYPE),
        localScope.getVar("b").getType());

    // Bleeding function expression check
    Node returnNode = fnNode.getLastChild().getLastChild();
    Node innerFnNode = returnNode.getFirstChild();
    Scope innerScope = creator.createScope(innerFnNode, localScope);
    assertTrue(innerScope.isDeclared("inner", false));
    assertTrue(innerScope.isDeclared("c", false));
  }

  @Test
  public void testEnumDeclaration_valid() {
    String js = "/** @enum {number} */\n"
        + "var MyEnum = {\n"
        + "  FIRST: 1,\n"
        + "  SECOND: 2\n"
        + "};\n"
        + "/** @enum {number} */\n"
        + "var EnumAlias = MyEnum;";
    Scope scope = createGlobalScope(js);

    assertEquals(0, compiler.getErrorCount());
    assertEquals(0, compiler.getWarningCount());

    Scope.Var enumVar = scope.getVar("MyEnum");
    assertNotNull(enumVar);
    assertTrue(enumVar.getType() instanceof EnumType);

    Scope.Var aliasVar = scope.getVar("EnumAlias");
    assertNotNull(aliasVar);
    assertTrue(aliasVar.getType() instanceof EnumType);
  }

  @Test
  public void testEnumDeclaration_duplicateKeys() {
    String js = "/** @enum {number} */\n"
        + "var DupEnum = {\n"
        + "  A: 1,\n"
        + "  A: 2\n"
        + "};";
    createGlobalScope(js);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testEnumDeclaration_nonConstantKey() {
    String js = "/** @enum {number} */\n"
        + "var BadEnum = {\n"
        + "  invalidKey: 1\n"
        + "};";
    createGlobalScope(js);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testEnumDeclaration_invalidInitializer() {
    String js = "/** @enum {number} */\n"
        + "var InvalidEnum = 123;";
    createGlobalScope(js);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testTypedef_valid() {
    String js = "/** @typedef {number|string} */\n"
        + "var NumOrStr;\n"
        + "/** @type {NumOrStr} */\n"
        + "var val = 1;";
    Scope scope = createGlobalScope(js);

    assertEquals(0, compiler.getErrorCount());
    assertEquals(0, compiler.getWarningCount());
    assertNotNull(scope.getVar("val"));
  }

  @Test
  public void testTypedef_malformed() {
    String js = "/** @typedef */\n"
        + "var BadTypedef;";
    createGlobalScope(js);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testOldStyleTypedef() {
    String js = "/** @typedef {string} */\n"
        + "goog.typedef = true;";
    createGlobalScope(js);
    assertNotNull(compiler.getTypeRegistry().getType("goog.typedef"));
  }

  @Test
  public void testInheritanceAndClassDefiningCalls() {
    String js = "/** @constructor */\n"
        + "function SuperClass() {}\n"
        + "SuperClass.prototype.foo = function() {};\n"
        + "/** @constructor\n"
        + "  * @extends {SuperClass} */\n"
        + "function SubClass() {}\n"
        + "goog.inherits(SubClass, SuperClass);\n"
        + "SubClass.prototype.foo = function() {};";
    Scope scope = createGlobalScope(js);

    assertEquals(0, compiler.getErrorCount());
    assertNotNull(scope.getVar("SuperClass"));
    assertNotNull(scope.getVar("SubClass"));
  }

  @Test
  public void testSingletonGetter() {
    String js = "/** @constructor */\n"
        + "function Singleton() {}\n"
        + "goog.addSingletonGetter(Singleton);";
    Scope scope = createGlobalScope(js);

    assertEquals(0, compiler.getErrorCount());
    Scope.Var var = scope.getVar("Singleton");
    assertNotNull(var);
    ObjectType type = ((FunctionType) var.getType()).getInstanceType();
    assertTrue(type.hasProperty("getInstance") || ((FunctionType) var.getType()).hasProperty("getInstance"));
  }

  @Test
  public void testObjectLiteralCast() {
    String js = "/** @constructor */\n"
        + "function TargetType() {}\n"
        + "var obj = goog.reflect.object(TargetType, { a: 1 });\n"
        + "var invalidCast = goog.reflect.object(NonExistent, { b: 2 });";
    Scope scope = createGlobalScope(js);

    assertNotNull(scope.getVar("obj"));
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testStubDeclarations() {
    String js = "/** @constructor */\n"
        + "function Base() {}\n"
        + "Base.prototype.untypedStub;\n"
        + "/** @type {number} */\n"
        + "Base.prototype.typedStub;";
    Scope scope = createGlobalScope(js);

    assertEquals(0, compiler.getErrorCount());
    assertTrue(scope.isDeclared("Base.prototype.untypedStub", false));
    assertTrue(scope.isDeclared("Base.prototype.typedStub", false));
  }

  @Test
  public void testOverriddenFunctionFromSuperclassAndInterface() {
    String js = "/** @interface */\n"
        + "function AnInterface() {}\n"
        + "/** @return {number} */\n"
        + "AnInterface.prototype.getValue = function() {};\n"
        + "/** @constructor\n"
        + "  * @implements {AnInterface} */\n"
        + "function Impl() {}\n"
        + "Impl.prototype.getValue = function() { return 1; };";
    Scope scope = createGlobalScope(js);

    assertEquals(0, compiler.getErrorCount());
    Scope.Var methodVar = scope.getVar("Impl.prototype.getValue");
    assertNotNull(methodVar);
  }

  @Test
  public void testRedeclaredVariableReportsError() {
    String js = "/** @type {number} */ var a = 1;\n"
        + "/** @type {string} */ var a = 'hello';";
    createGlobalScope(js);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testEmptyAndNullEdgeCases() {
    Scope emptyScope = createGlobalScope("");
    assertNotNull(emptyScope);
    assertTrue(emptyScope.isGlobal());

    Node emptyRoot = parse(";;;");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(emptyRoot, null);
    assertNotNull(scope);
  }

  @Test(expected = NullPointerException.class)
  public void testCreateScope_nullRootThrowsException() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(null, null);
  }
}
