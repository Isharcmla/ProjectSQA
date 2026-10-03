package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TypedScopeCreatorTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Node parse(String js) {
    Node n = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    return n;
  }

  private Scope createGlobalScope(Node root) {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    return creator.createScope(root, null);
  }

  @Test
  public void testConstructor_defaultCodingConvention() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    assertNotNull(creator);
  }

  @Test
  public void testConstructor_customCodingConvention() {
    CodingConvention convention = new GoogleCodingConvention();
    TypedScopeCreator creator = new TypedScopeCreator(compiler, convention);
    assertNotNull(creator);
  }

  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = parse("");
    Scope s = creator.createInitialScope(root);
    assertNotNull(s);
    assertTrue(s.isGlobal());

    assertNotNull(s.getVar("Object"));
    assertNotNull(s.getVar("Array"));
    assertNotNull(s.getVar("Function"));
    assertNotNull(s.getVar("Date"));
    assertNotNull(s.getVar("RegExp"));
    assertNotNull(s.getVar("Error"));
    assertNotNull(s.getVar("EvalError"));
    assertNotNull(s.getVar("RangeError"));
    assertNotNull(s.getVar("ReferenceError"));
    assertNotNull(s.getVar("SyntaxError"));
    assertNotNull(s.getVar("TypeError"));
    assertNotNull(s.getVar("URIError"));
    assertNotNull(s.getVar("undefined"));
    assertNotNull(s.getVar("ActiveXObject"));
  }

  @Test
  public void testCreateScope_basicLiteralsAndVars() {
    String js = "var a = null; var b = void 0; var c = 'hello'; var d = 42; var e = true; var f = /abc/;";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    assertNotNull(scope.getVar("a"));
    assertNotNull(scope.getVar("b"));
    assertNotNull(scope.getVar("c"));
    assertNotNull(scope.getVar("d"));
    assertNotNull(scope.getVar("e"));
    assertNotNull(scope.getVar("f"));
  }

  @Test
  public void testCreateScope_functionDeclarationAndHoisting() {
    String js = "foo(); function foo() { return 1; }";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    Scope.Var varFoo = scope.getVar("foo");
    assertNotNull(varFoo);
    assertTrue(varFoo.getType().isFunctionType());
  }

  @Test
  public void testCreateScope_localScopeAndParameters() {
    String js = "function f(x, y) { var z = 10; return x + y + z; }";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node fnNode = root.getFirstChild();
    Scope localScope = creator.createScope(fnNode.getLastChild(), globalScope);

    assertNotNull(localScope.getVar("x"));
    assertNotNull(localScope.getVar("y"));
    assertNotNull(localScope.getVar("z"));
    assertFalse(localScope.isGlobal());
  }

  @Test
  public void testCreateScope_catchBlock() {
    String js = "function f() { try { } catch (e) { var x = e; } }";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node fnNode = root.getFirstChild();
    Scope localScope = creator.createScope(fnNode.getLastChild(), globalScope);

    assertNotNull(localScope.getVar("e"));
    assertNotNull(localScope.getVar("x"));
  }

  @Test
  public void testCreateScope_constructorAndPrototype() {
    String js = "/** @constructor */ function Foo() { this.x = 1; }\n"
        + "Foo.prototype.bar = function() {};";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    Scope.Var fooVar = scope.getVar("Foo");
    assertNotNull(fooVar);
    assertTrue(fooVar.getType().isConstructor());

    Scope.Var protoVar = scope.getVar("Foo.prototype");
    assertNotNull(protoVar);

    Scope.Var barVar = scope.getVar("Foo.prototype.bar");
    assertNotNull(barVar);
  }

  @Test
  public void testCreateScope_interfaceDeclaration() {
    String js = "/** @interface */ function AnInterface() {}\n"
        + "AnInterface.prototype.doSomething = function() {};";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    Scope.Var ifaceVar = scope.getVar("AnInterface");
    assertNotNull(ifaceVar);
    assertTrue(ifaceVar.getType().isInterface());
  }

  @Test
  public void testCreateScope_enumDeclarationAndProperties() {
    String js = "/** @enum {string} */ var Color = { RED: 'red', GREEN: 'green' };";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    Scope.Var enumVar = scope.getVar("Color");
    assertNotNull(enumVar);
    assertTrue(enumVar.getType().isEnumType());
  }

  @Test
  public void testCreateScope_aliasedEnum() {
    String js = "/** @enum {number} */ var E1 = { A: 1 };\n"
        + "/** @enum {number} */ var E2 = E1;";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    assertNotNull(scope.getVar("E1"));
    assertNotNull(scope.getVar("E2"));
  }

  @Test
  public void testCreateScope_invalidEnumKeyReported() {
    String js = "/** @enum {number} */ var E = { 'invalid-key': 1 };";
    Node root = compiler.parseTestCode(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0 || compiler.getErrorCount() > 0);
  }

  @Test
  public void testCreateScope_enumInitializerWarning() {
    String js = "/** @enum {number} */ var E = 123;";
    Node root = compiler.parseTestCode(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_typedef() {
    String js = "/** @typedef {(string|number)} */ var StringOrNum;\n"
        + "/** @type {StringOrNum} */ var val = 1;";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    assertNotNull(scope.getVar("val"));
    assertNotNull(compiler.getTypeRegistry().getType("StringOrNum"));
  }

  @Test
  public void testCreateScope_qualifiedTypedef() {
    String js = "var ns = {};\n"
        + "/** @typedef {number} */ ns.MyType;\n"
        + "/** @type {ns.MyType} */ var x = 5;";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    assertNotNull(scope.getVar("x"));
    assertNotNull(compiler.getTypeRegistry().getType("ns.MyType"));
  }

  @Test
  public void testCreateScope_malformedTypedef() {
    String js = "/** @typedef */ var BadTypedef;";
    Node root = compiler.parseTestCode(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_multipleVarDefWarning() {
    String js = "/** @type {number} */ var a = 1, b = 2;";
    Node root = compiler.parseTestCode(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_lendsAnnotation() {
    String js = "/** @constructor */ function Person() {}\n"
        + "var p = /** @lends {Person.prototype} */ ({ sayHi: function() {} });";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    assertNotNull(scope.getVar("Person"));
    assertNotNull(scope.getVar("p"));
  }

  @Test
  public void testCreateScope_unknownLendsWarning() {
    String js = "var obj = /** @lends {NonExistentClass.prototype} */ ({ a: 1 });";
    Node root = compiler.parseTestCode(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_lendsOnNonObjectWarning() {
    String js = "var num = 123;\n"
        + "var obj = /** @lends {num} */ ({ a: 1 });";
    Node root = compiler.parseTestCode(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_windowGlobalConstructor() {
    String js = "/** @constructor */ function Window() {}";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    Scope.Var windowVar = scope.getVar("Window");
    assertNotNull(windowVar);
    assertTrue(windowVar.getType().isConstructor());
  }

  @Test
  public void testCreateScope_classDefiningInheritsCall() {
    CodingConvention convention = new ClosureCodingConvention();
    TypedScopeCreator creator = new TypedScopeCreator(compiler, convention);
    String js = "var goog = {}; goog.inherits = function(sub, sup) {};\n"
        + "/** @constructor */ function Super() {}\n"
        + "/** @constructor */ function Sub() {}\n"
        + "goog.inherits(Sub, Super);";
    Node root = compiler.parseTestCode(js);
    Scope scope = creator.createScope(root, null);

    Scope.Var subVar = scope.getVar("Sub");
    assertNotNull(subVar);
  }

  @Test
  public void testCreateScope_singletonGetter() {
    CodingConvention convention = new ClosureCodingConvention();
    TypedScopeCreator creator = new TypedScopeCreator(compiler, convention);
    String js = "var goog = {}; goog.addSingletonGetter = function(ctor) {};\n"
        + "/** @constructor */ function Single() {}\n"
        + "goog.addSingletonGetter(Single);";
    Node root = compiler.parseTestCode(js);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope.getVar("Single"));
  }

  @Test
  public void testCreateScope_objectLiteralCast() {
    CodingConvention convention = new ClosureCodingConvention();
    TypedScopeCreator creator = new TypedScopeCreator(compiler, convention);
    String js = "var goog = {}; goog.reflect = {}; goog.reflect.object = function(ctor, obj) {};\n"
        + "/** @constructor */ function MyType() { this.foo = 1; }\n"
        + "goog.reflect.object(MyType, { foo: 2 });";
    Node root = compiler.parseTestCode(js);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope.getVar("MyType"));
  }

  @Test
  public void testCreateScope_objectLiteralCast_expectedConstructorWarning() {
    CodingConvention convention = new ClosureCodingConvention();
    TypedScopeCreator creator = new TypedScopeCreator(compiler, convention);
    String js = "var goog = {}; goog.reflect = {}; goog.reflect.object = function(ctor, obj) {};\n"
        + "goog.reflect.object(NonExistentType, { foo: 2 });";
    Node root = compiler.parseTestCode(js);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_constantWithOrFallback() {
    String js = "var goog = goog || {};";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    assertNotNull(scope.getVar("goog"));
  }

  @Test
  public void testCreateScope_bleedingFunctionExpression() {
    String js = "var f = function bleeding(x) { return bleeding(x - 1); };";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node fnNode = root.getFirstChild().getFirstChild().getFirstChild();
    Scope localScope = creator.createScope(fnNode.getLastChild(), globalScope);

    assertNotNull(localScope.getVar("bleeding"));
    assertNotNull(localScope.getVar("x"));
  }

  @Test
  public void testCreateScope_escapedVariables() {
    String js = "function outer() { var captured = 1; function inner() { captured = 2; } return inner; }";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node outerFn = root.getFirstChild();
    Scope outerScope = creator.createScope(outerFn.getLastChild(), globalScope);

    Scope.Var capturedVar = outerScope.getVar("captured");
    assertNotNull(capturedVar);
    assertTrue(capturedVar.isEscaped());
  }

  @Test
  public void testPatchGlobalScope_replacesScript() {
    String scriptName = "test.js";
    String js1 = "var x = 1; var y = 2;";
    Node script1 = compiler.parseTestCode(js1);
    script1.setSourceFileName(scriptName);

    Node root = new Node(Token.BLOCK, script1);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertNotNull(globalScope.getVar("x"));
    assertNotNull(globalScope.getVar("y"));

    String js2 = "var x = 'new_x'; var z = 3;";
    Node script2 = compiler.parseTestCode(js2);
    script2.setSourceFileName(scriptName);

    creator.patchGlobalScope(globalScope, script2);

    assertNotNull(globalScope.getVar("x"));
    assertNotNull(globalScope.getVar("z"));
    assertNull(globalScope.getVar("y"));
  }

  @Test
  public void testCreateScope_stubDeclarations() {
    String js = "var ns = {}; ns.prop;";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    assertNotNull(scope.getVar("ns.prop"));
  }

  @Test
  public void testCreateScope_prototypeAssignmentToObjectLiteral() {
    String js = "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype = { a: 1, b: 2 };";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    assertNotNull(scope.getVar("Foo"));
    assertNotNull(scope.getVar("Foo.prototype"));
  }

  @Test
  public void testCreateScope_thisPropertyCollection() {
    String js = "/** @constructor */ function Widget() {\n"
        + "  /** @type {number} */ this.width = 100;\n"
        + "  /** @type {string} */ this.name = 'w';\n"
        + "}";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    Scope.Var widgetVar = scope.getVar("Widget");
    assertNotNull(widgetVar);
    FunctionType fnType = widgetVar.getType().toMaybeFunctionType();
    assertNotNull(fnType);
    ObjectType instanceType = fnType.getInstanceType();
    assertTrue(instanceType.hasProperty("width"));
    assertTrue(instanceType.hasProperty("name"));
  }

  @Test
  public void testCreateScope_constructorAliasing() {
    String js = "/** @constructor */ function Original() {}\n"
        + "var Alias = Original;";
    Node root = parse(js);
    Scope scope = createGlobalScope(root);

    assertNotNull(scope.getVar("Original"));
    assertNotNull(scope.getVar("Alias"));
    assertTrue(scope.getVar("Alias").getType().isConstructor());
  }

  @Test
  public void testCreateScope_emptyInput() {
    Node root = parse("");
    Scope scope = createGlobalScope(root);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }
}
