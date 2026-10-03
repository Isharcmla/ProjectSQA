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
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

public class TypedScopeCreatorTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
  }

  private Node parse(String js) {
    Node root = compiler.parseSyntheticCode("test.js", js);
    assertEquals(0, compiler.getErrorCount());
    return root;
  }

  private Node parseWithWarnings(String js) {
    return compiler.parseSyntheticCode("test.js", js);
  }

  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = new Node(Token.SCRIPT);
    Scope scope = scopeCreator.createInitialScope(root);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Function"));
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("String"));
    assertNotNull(scope.getVar("Boolean"));
    assertNotNull(scope.getVar("Number"));
    assertNotNull(scope.getVar("Date"));
    assertNotNull(scope.getVar("RegExp"));
    assertNotNull(scope.getVar("Error"));
    assertNotNull(scope.getVar("EvalError"));
    assertNotNull(scope.getVar("RangeError"));
    assertNotNull(scope.getVar("ReferenceError"));
    assertNotNull(scope.getVar("SyntaxError"));
    assertNotNull(scope.getVar("TypeError"));
    assertNotNull(scope.getVar("URIError"));
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("goog.typedef"));
    assertNotNull(scope.getVar("ActiveXObject"));
  }

  @Test
  public void testCreateScope_globalEmptyScript() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Node root = parse("");
    Scope scope = scopeCreator.createScope(root, null);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScope_globalVarDeclaration() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parse("var a = 1; /** @type {string} */ var b = 'hello'; var c;");
    Scope scope = scopeCreator.createScope(root, null);

    assertNotNull(scope.getVar("a"));
    assertNotNull(scope.getVar("b"));
    assertNotNull(scope.getVar("c"));

    JSType typeB = scope.getVar("b").getType();
    assertNotNull(typeB);
    assertTrue(typeB.isString());
  }

  @Test
  public void testCreateScope_globalMultipleVarDefWithJsDoc_reportsWarning() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parseWithWarnings("/** @type {number} */ var a = 1, b = 2;");
    Scope scope = scopeCreator.createScope(root, null);

    assertNotNull(scope.getVar("a"));
    assertNotNull(scope.getVar("b"));
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testCreateScope_functionDeclarationAndLocalScope() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parse("function foo(x, y) { var z = 10; return x + y + z; }");
    Scope globalScope = scopeCreator.createScope(root, null);

    assertNotNull(globalScope.getVar("foo"));
    assertTrue(globalScope.getVar("foo").getType().isFunctionType());

    Node fnNode = root.getFirstChild();
    Scope localScope = scopeCreator.createScope(fnNode, globalScope);

    assertNotNull(localScope);
    assertTrue(localScope.isLocal());
    assertEquals(globalScope, localScope.getParent());
    assertNotNull(localScope.getVar("x"));
    assertNotNull(localScope.getVar("y"));
    assertNotNull(localScope.getVar("z"));
  }

  @Test
  public void testCreateScope_functionExpressionBleedingName() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parse("var f = function myNamedFunc(a) { return a; };");
    Scope globalScope = scopeCreator.createScope(root, null);

    assertNotNull(globalScope.getVar("f"));

    Node varNode = root.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Node fnNode = nameNode.getFirstChild();

    Scope localScope = scopeCreator.createScope(fnNode, globalScope);
    assertNotNull(localScope.getVar("myNamedFunc"));
    assertNotNull(localScope.getVar("a"));
  }

  @Test
  public void testCreateScope_catchBlockInLocalScope() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parse("function testCatch() { try { } catch (err) { var x = 1; } }");
    Scope globalScope = scopeCreator.createScope(root, null);

    Node fnNode = root.getFirstChild();
    Scope localScope = scopeCreator.createScope(fnNode, globalScope);

    assertNotNull(localScope.getVar("err"));
    assertNotNull(localScope.getVar("x"));
  }

  @Test
  public void testCreateScope_constructorAndThisProperties() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parse(
        "/** @constructor */\n" +
        "function Person(name) {\n" +
        "  /** @type {string} */\n" +
        "  this.name = name;\n" +
        "}\n" +
        "Person.prototype.greet = function() { return this.name; };");
    Scope globalScope = scopeCreator.createScope(root, null);

    Scope.Var personVar = globalScope.getVar("Person");
    assertNotNull(personVar);
    assertTrue(personVar.getType().isConstructor());

    FunctionType personCtor = (FunctionType) personVar.getType();
    ObjectType instanceType = personCtor.getInstanceType();
    assertTrue(instanceType.hasProperty("name"));
    assertNotNull(globalScope.getVar("Person.prototype"));
  }

  @Test
  public void testCreateScope_prototypeRedefinition() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parse(
        "function Foo() {}\n" +
        "Foo.prototype = { a: function() {} };");
    Scope globalScope = scopeCreator.createScope(root, null);
    assertNotNull(globalScope.getVar("Foo"));
  }

  @Test
  public void testCreateScope_enumDefinition() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Node root = parse(
        "/** @enum {number} */\n" +
        "var Status = {\n" +
        "  OK: 1,\n" +
        "  ERROR: 2\n" +
        "};");
    Scope globalScope = scopeCreator.createScope(root, null);

    Scope.Var statusVar = globalScope.getVar("Status");
    assertNotNull(statusVar);
    assertTrue(statusVar.getType().isEnumType());

    EnumType enumType = (EnumType) statusVar.getType();
    assertTrue(enumType.hasOwnProperty("OK"));
    assertTrue(enumType.hasOwnProperty("ERROR"));
  }

  @Test
  public void testCreateScope_enumDuplicateKey_reportsWarning() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Node root = parseWithWarnings(
        "/** @enum {number} */\n" +
        "var DupEnum = {\n" +
        "  A: 1,\n" +
        "  A: 2\n" +
        "};");
    scopeCreator.createScope(root, null);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testCreateScope_enumNonConstantKey_reportsWarning() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Node root = parseWithWarnings(
        "/** @enum {number} */\n" +
        "var InvalidEnum = {\n" +
        "  lowerCaseKey: 1\n" +
        "};");
    scopeCreator.createScope(root, null);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testCreateScope_enumInvalidInitializer_reportsWarning() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parseWithWarnings(
        "/** @enum {number} */\n" +
        "var BadEnum = 123;");
    scopeCreator.createScope(root, null);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testCreateScope_enumAlias() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Node root = parse(
        "/** @enum {string} */\n" +
        "var E1 = { FOO: 'foo' };\n" +
        "/** @enum {string} */\n" +
        "var E2 = E1;");
    Scope globalScope = scopeCreator.createScope(root, null);

    Scope.Var e2Var = globalScope.getVar("E2");
    assertNotNull(e2Var);
    assertTrue(e2Var.getType().isEnumType());
  }

  @Test
  public void testCreateScope_typedefDeclaration() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parse(
        "/** @typedef {string|number} */\n" +
        "var MyType;");
    Scope globalScope = scopeCreator.createScope(root, null);

    assertNotNull(globalScope.getVar("MyType"));
    assertNotNull(compiler.getTypeRegistry().getType("MyType"));
  }

  @Test
  public void testCreateScope_malformedTypedef_reportsWarning() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parseWithWarnings(
        "/** @typedef {NonExistentType} */\n" +
        "var BadTypedef;");
    scopeCreator.createScope(root, null);
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_inheritsAndSubclassRelationship() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Node root = parse(
        "var goog = {};\n" +
        "goog.inherits = function(child, parent) {};\n" +
        "/** @constructor */ function SuperClass() {}\n" +
        "/** @constructor */ function SubClass() {}\n" +
        "goog.inherits(SubClass, SuperClass);");
    Scope globalScope = scopeCreator.createScope(root, null);

    Scope.Var subClassVar = globalScope.getVar("SubClass");
    assertNotNull(subClassVar);
    FunctionType subClassCtor = (FunctionType) subClassVar.getType();
    assertNotNull(subClassCtor.getSuperClassConstructor());
    assertEquals("SuperClass", subClassCtor.getSuperClassConstructor().getReferenceName());
  }

  @Test
  public void testCreateScope_singletonGetter() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Node root = parse(
        "var goog = {};\n" +
        "goog.addSingletonGetter = function(cls) {};\n" +
        "/** @constructor */ function MySingleton() {}\n" +
        "goog.addSingletonGetter(MySingleton);");
    Scope globalScope = scopeCreator.createScope(root, null);

    Scope.Var singletonVar = globalScope.getVar("MySingleton");
    assertNotNull(singletonVar);
    FunctionType ctor = (FunctionType) singletonVar.getType();
    assertTrue(ctor.hasProperty("getInstance"));
  }

  @Test
  public void testCreateScope_objectLiteralCast() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Node root = parse(
        "var goog = {};\n" +
        "goog.reflect = {};\n" +
        "goog.reflect.object = function(type, obj) { return obj; };\n" +
        "/** @constructor */ function TargetType() {}\n" +
        "var casted = goog.reflect.object(TargetType, { a: 1 });");
    Scope globalScope = scopeCreator.createScope(root, null);

    assertNotNull(globalScope.getVar("casted"));
  }

  @Test
  public void testCreateScope_objectLiteralCastInvalidConstructor_reportsWarning() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Node root = parseWithWarnings(
        "var goog = {};\n" +
        "goog.reflect = {};\n" +
        "goog.reflect.object = function(type, obj) { return obj; };\n" +
        "var casted = goog.reflect.object(NonExistentCtor, { a: 1 });");
    scopeCreator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testCreateScope_stubDeclarations() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parse(
        "var ns = {};\n" +
        "ns.stubProperty;\n" +
        "ns.anotherStub;");
    Scope globalScope = scopeCreator.createScope(root, null);

    assertNotNull(globalScope.getVar("ns.stubProperty"));
    assertNotNull(globalScope.getVar("ns.anotherStub"));
  }

  @Test
  public void testCreateScope_redeclaredVariable_reportsWarning() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parseWithWarnings(
        "/** @type {number} */ var x = 1;\n" +
        "/** @type {string} */ var x = 'dup';");
    scopeCreator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_functionAlias() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parse(
        "/** @constructor */ function Original() {}\n" +
        "var Alias = Original;");
    Scope globalScope = scopeCreator.createScope(root, null);

    Scope.Var aliasVar = globalScope.getVar("Alias");
    assertNotNull(aliasVar);
    assertTrue(aliasVar.getType().isConstructor());
  }

  @Test
  public void testCreateScope_assignPropertyWithFunction() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parse(
        "var obj = {};\n" +
        "/** @param {number} x */\n" +
        "obj.method = function(x) { return x; };");
    Scope globalScope = scopeCreator.createScope(root, null);

    assertNotNull(globalScope.getVar("obj.method"));
    assertTrue(globalScope.getVar("obj.method").getType().isFunctionType());
  }

  @Test
  public void testCreateScope_interfaceAndOverriddenMethod() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = parse(
        "/** @interface */\n" +
        "function Formatter() {}\n" +
        "/** @param {string} val @return {string} */\n" +
        "Formatter.prototype.format = function(val) {};\n" +
        "/** @constructor @implements {Formatter} */\n" +
        "function UpperFormatter() {}\n" +
        "/** @override */\n" +
        "UpperFormatter.prototype.format = function(val) { return val; };");
    Scope globalScope = scopeCreator.createScope(root, null);

    assertNotNull(globalScope.getVar("Formatter"));
    assertNotNull(globalScope.getVar("UpperFormatter"));
    assertTrue(globalScope.getVar("UpperFormatter.prototype.format").getType().isFunctionType());
  }

  @Test
  public void testCreateScope_assignEnumProperty() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Node root = parse(
        "var goog = {};\n" +
        "/** @enum {number} */\n" +
        "goog.MyEnum = { FIRST: 1, SECOND: 2 };");
    Scope globalScope = scopeCreator.createScope(root, null);

    assertNotNull(globalScope.getVar("goog.MyEnum"));
    assertTrue(globalScope.getVar("goog.MyEnum").getType().isEnumType());
  }
}
