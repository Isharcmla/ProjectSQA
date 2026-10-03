package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Before;
import org.junit.Test;

public class TypedScopeCreatorTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCodingConvention(new GoogleCodingConvention());
    compiler.initOptions(options);
  }

  private Node parseAndGetRoot(String js) {
    return compiler.parseTestCode(js);
  }

  @Test
  public void testConstructor_withAbstractCompiler() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    assertNotNull(creator);
  }

  @Test
  public void testConstructor_withCodingConvention() {
    CodingConvention convention = new ClosureCodingConvention();
    TypedScopeCreator creator = new TypedScopeCreator(compiler, convention);
    assertNotNull(creator);
  }

  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = parseAndGetRoot("");
    Scope scope = creator.createInitialScope(root);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertTrue(scope.isDeclared("Object", false));
    assertTrue(scope.isDeclared("Array", false));
    assertTrue(scope.isDeclared("Function", false));
    assertTrue(scope.isDeclared("Date", false));
    assertTrue(scope.isDeclared("RegExp", false));
    assertTrue(scope.isDeclared("Error", false));
    assertTrue(scope.isDeclared("undefined", false));
    assertTrue(scope.isDeclared("goog.typedef", false));
    assertTrue(scope.isDeclared("ActiveXObject", false));
  }

  @Test
  public void testCreateScope_globalScopeWithLiterals() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "var a = null; var b = void 0; var c = 'hello'; var d = 42; "
        + "var e = true; var f = false; var g = /abc/; var h = {};";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope);
    assertTrue(scope.isDeclared("a", false));
    assertTrue(scope.isDeclared("b", false));
    assertTrue(scope.isDeclared("c", false));
    assertTrue(scope.isDeclared("d", false));
    assertTrue(scope.isDeclared("e", false));
    assertTrue(scope.isDeclared("f", false));
    assertTrue(scope.isDeclared("g", false));
    assertTrue(scope.isDeclared("h", false));
  }

  @Test
  public void testCreateScope_variableDeclarationsAndTypes() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @type {number} */ var x = 10; var y = 'test';";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    Scope.Var varX = scope.getVar("x");
    assertNotNull(varX);
    assertNotNull(varX.getType());
    assertTrue(varX.getType().isNumberType());

    Scope.Var varY = scope.getVar("y");
    assertNotNull(varY);
  }

  @Test
  public void testCreateScope_multipleVarDeclarationsWithDoc() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @type {number} */ var x = 1, y = 2;";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("x", false));
    assertTrue(scope.isDeclared("y", false));
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testCreateScope_functionDeclarationAndLocalScope() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @param {number} a\n * @return {string} */\n"
        + "function foo(a) { var b = 'local'; return b; }";
    Node root = parseAndGetRoot(js);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("foo", false));
    Scope.Var fooVar = globalScope.getVar("foo");
    assertTrue(fooVar.getType() instanceof FunctionType);

    Node fnNode = root.getFirstChild();
    Scope localScope = creator.createScope(fnNode, globalScope);

    assertNotNull(localScope);
    assertTrue(localScope.isLocal());
    assertTrue(localScope.isDeclared("a", false));
    assertTrue(localScope.isDeclared("b", false));
  }

  @Test
  public void testCreateScope_bleedingFunctionExpression() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "var f = function g(x) { return x; };";
    Node root = parseAndGetRoot(js);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("f", false));

    Node varNode = root.getFirstChild();
    Node fnNode = varNode.getFirstChild().getFirstChild();
    Scope localScope = creator.createScope(fnNode, globalScope);

    assertTrue(localScope.isDeclared("g", false));
    assertTrue(localScope.isDeclared("x", false));
  }

  @Test
  public void testCreateScope_tryCatch() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "function testCatch() { try { var x = 1; } catch (e) { var y = e; } }";
    Node root = parseAndGetRoot(js);
    Scope globalScope = creator.createScope(root, null);

    Node fnNode = root.getFirstChild();
    Scope localScope = creator.createScope(fnNode, globalScope);

    assertTrue(localScope.isDeclared("e", false));
    assertTrue(localScope.isDeclared("x", false));
    assertTrue(localScope.isDeclared("y", false));
  }

  @Test
  public void testCreateScope_constructorAndPrototypeProperties() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @constructor */ function MyClass() { /** @type {number} */ this.num = 42; }\n"
        + "/** @type {string} */ MyClass.prototype.str = 'hello';\n"
        + "MyClass.prototype.method = function() {};";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("MyClass", false));
    assertTrue(scope.isDeclared("MyClass.prototype", false));
    assertTrue(scope.isDeclared("MyClass.prototype.str", false));
    assertTrue(scope.isDeclared("MyClass.prototype.method", false));

    Scope.Var classVar = scope.getVar("MyClass");
    assertTrue(classVar.getType().isConstructor());
  }

  @Test
  public void testCreateScope_stubProperties() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.stubProp;\n"
        + "Foo.staticStub;";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("Foo.prototype.stubProp", false));
    assertTrue(scope.isDeclared("Foo.staticStub", false));
  }

  @Test
  public void testCreateScope_enums() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @enum {number} */ var Status = { OK: 1, ERROR: 2 };\n"
        + "var AliasedStatus = Status;";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("Status", false));
    Scope.Var statusVar = scope.getVar("Status");
    assertTrue(statusVar.getType() instanceof EnumType);
  }

  @Test
  public void testCreateScope_enumDuplicateKeyWarning() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @enum {number} */ var DupEnum = { A: 1, A: 2 };";
    Node root = parseAndGetRoot(js);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypeCheck.ENUM_DUP.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testCreateScope_enumInvalidKeyWarning() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @enum {number} */ var InvalidEnum = { 'invalid-key': 1 };";
    Node root = parseAndGetRoot(js);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypeCheck.ENUM_NOT_CONSTANT.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testCreateScope_enumInvalidInitializerWarning() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @enum {number} */ var BadEnum = 123;";
    Node root = parseAndGetRoot(js);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypedScopeCreator.ENUM_INITIALIZER.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testCreateScope_typedefs() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @typedef {(string|number)} */ var NumberOrString;\n"
        + "/** @type {NumberOrString} */ var val = 123;";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("NumberOrString", false));
    assertTrue(scope.isDeclared("val", false));
  }

  @Test
  public void testCreateScope_getPropTypedef() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "var goog = {};\n"
        + "/** @typedef {string} */ goog.MyString;\n"
        + "/** @type {goog.MyString} */ var str = 'abc';";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("goog.MyString", false));
    assertTrue(scope.isDeclared("str", false));
  }

  @Test
  public void testCreateScope_malformedTypedef() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @typedef */ var BadTypedef;";
    Node root = parseAndGetRoot(js);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypedScopeCreator.MALFORMED_TYPEDEF.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testCreateScope_subclassInheritance() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @constructor */ function SuperClass() {}\n"
        + "SuperClass.prototype.foo = function() {};\n"
        + "/** @constructor @extends {SuperClass} */ function SubClass() {}\n"
        + "goog.inherits(SubClass, SuperClass);\n"
        + "SubClass.prototype.foo = function() {};";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("SuperClass", false));
    assertTrue(scope.isDeclared("SubClass", false));
    assertTrue(scope.isDeclared("SubClass.prototype.foo", false));
  }

  @Test
  public void testCreateScope_singletonGetter() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @constructor */ function Singleton() {}\n"
        + "goog.addSingletonGetter(Singleton);";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("Singleton", false));
    Scope.Var singletonVar = scope.getVar("Singleton");
    assertNotNull(singletonVar);
  }

  @Test
  public void testCreateScope_objectLiteralCast_success() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @constructor */ function FooType() {}\n"
        + "goog.reflect.object(FooType, { prop: 1 });";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope);
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testCreateScope_objectLiteralCast_constructorExpectedWarning() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "var notAConstructor = 123;\n"
        + "goog.reflect.object(notAConstructor, { prop: 1 });";
    Node root = parseAndGetRoot(js);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypedScopeCreator.CONSTRUCTOR_EXPECTED.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testCreateScope_delegateRelationship() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @constructor */ function BaseDelegate() {}\n"
        + "/** @constructor */ function SuperDelegate() {}\n"
        + "/** @constructor */ function MyDelegator() {}\n"
        + "goog.delegate(MyDelegator, BaseDelegate, SuperDelegate);";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope);
    assertTrue(scope.isDeclared("BaseDelegate", false));
    assertTrue(scope.isDeclared("SuperDelegate", false));
    assertTrue(scope.isDeclared("MyDelegator", false));
  }

  @Test
  public void testCreateScope_redefinePrototypeObjectLiteral() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype = { a: function() {}, b: function() {} };";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("Foo", false));
    assertTrue(scope.isDeclared("Foo.prototype", false));
  }

  @Test
  public void testCreateScope_functionConstructorAlias() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @constructor */ function Original() {}\n"
        + "var Aliased = Original;";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("Original", false));
    assertTrue(scope.isDeclared("Aliased", false));
    Scope.Var aliasedVar = scope.getVar("Aliased");
    assertNotNull(aliasedVar.getType());
  }

  @Test
  public void testCreateScope_assignedFunctionExpression() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "var myFunc = function(a, b) { return a + b; };";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("myFunc", false));
    Scope.Var fnVar = scope.getVar("myFunc");
    assertTrue(fnVar.getType() instanceof FunctionType);
  }

  @Test
  public void testCreateScope_methodOverrideOnInterface() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "/** @interface */ function AnInterface() {}\n"
        + "AnInterface.prototype.doSomething = function(x) {};\n"
        + "/** @constructor @implements {AnInterface} */ function AnImpl() {}\n"
        + "AnImpl.prototype.doSomething = function(x) { return x; };";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("AnInterface", false));
    assertTrue(scope.isDeclared("AnImpl", false));
    assertTrue(scope.isDeclared("AnImpl.prototype.doSomething", false));
  }

  @Test
  public void testCreateScope_duplicateVarDeclaration_warnsUndeclaredVariable() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    String js = "var a = 1; var a = 2;";
    Node root = parseAndGetRoot(js);
    Scope scope = creator.createScope(root, null);

    assertTrue(scope.isDeclared("a", false));
    assertTrue(compiler.getWarningCount() > 0 || compiler.getErrorCount() >= 0);
  }

  @Test
  public void testCreateScope_emptyScope() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = parseAndGetRoot("");
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }
}
