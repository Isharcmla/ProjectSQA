package com.google.javascript.jscomp;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TypedScopeCreatorTest {

  private Compiler compiler;
  private TypedScopeCreator scopeCreator;
  private Scope globalScope;
  private Node root;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Scope compile(String js) {
    return compile("", js);
  }

  private Scope compile(String externs, String js) {
    Node externsAndJs = compiler.parseTestCode(externs, js);
    Assert.assertNotNull(externsAndJs);
    root = externsAndJs;
    scopeCreator = new TypedScopeCreator(compiler);
    globalScope = scopeCreator.createScope(root, null);
    return globalScope;
  }

  private Scope createLocalScope(String functionJs) {
    compile(functionJs);
    Node scriptNode = root.getLastChild().getFirstChild();
    Node fnNode = null;
    if (scriptNode.isFunction()) {
      fnNode = scriptNode;
    } else if (scriptNode.isVar() || scriptNode.isExprResult()) {
      Node child = scriptNode.getFirstChild();
      if (child.isAssign()) {
        fnNode = child.getLastChild();
      } else if (child.isName() && child.getFirstChild() != null) {
        fnNode = child.getFirstChild();
      }
    }
    Assert.assertNotNull("Could not find function node", fnNode);
    return scopeCreator.createScope(fnNode, globalScope);
  }

  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    compile("");
    Scope initialScope = scopeCreator.createInitialScope(root);
    Assert.assertNotNull(initialScope.getVar("Object"));
    Assert.assertNotNull(initialScope.getVar("Function"));
    Assert.assertNotNull(initialScope.getVar("Array"));
    Assert.assertNotNull(initialScope.getVar("String"));
    Assert.assertNotNull(initialScope.getVar("Number"));
    Assert.assertNotNull(initialScope.getVar("Boolean"));
    Assert.assertNotNull(initialScope.getVar("Date"));
    Assert.assertNotNull(initialScope.getVar("RegExp"));
    Assert.assertNotNull(initialScope.getVar("Error"));
    Assert.assertNotNull(initialScope.getVar("undefined"));
    Assert.assertNotNull(initialScope.getVar("ActiveXObject"));
  }

  @Test
  public void testCreateScope_globalLiterals() {
    Scope s = compile(
        "var n = null; var u = undefined; var str = 'hello'; " +
        "var num = 42; var b1 = true; var b2 = false; var re = /abc/;");
    Assert.assertEquals(JSTypeNative.NULL_TYPE, s.getVar("n").getType().findNativeType());
    Assert.assertEquals(JSTypeNative.STRING_TYPE, s.getVar("str").getType().findNativeType());
    Assert.assertEquals(JSTypeNative.NUMBER_TYPE, s.getVar("num").getType().findNativeType());
    Assert.assertEquals(JSTypeNative.BOOLEAN_TYPE, s.getVar("b1").getType().findNativeType());
    Assert.assertEquals(JSTypeNative.BOOLEAN_TYPE, s.getVar("b2").getType().findNativeType());
    Assert.assertEquals(JSTypeNative.REGEXP_TYPE, s.getVar("re").getType().findNativeType());
  }

  @Test
  public void testCreateScope_varDeclarationsMultiple() {
    Scope s = compile("/** @type {number} */ var a = 1, b = 2;");
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertNotNull(s.getVar("a"));
    Assert.assertNotNull(s.getVar("b"));
  }

  @Test
  public void testCreateScope_constructorAndPrototypes() {
    Scope s = compile(
        "/** @constructor */ function Foo() { /** @type {number} */ this.x = 1; }\n" +
        "Foo.prototype.bar = function() { return this.x; };\n" +
        "/** @type {Foo} */ var f = new Foo();");
    Assert.assertNotNull(s.getVar("Foo"));
    Assert.assertTrue(s.getVar("Foo").getType().isConstructor());
    Assert.assertNotNull(s.getVar("Foo.prototype"));
    Assert.assertNotNull(s.getVar("Foo.prototype.bar"));
  }

  @Test
  public void testCreateScope_uninitializedConstructor_reportsWarning() {
    compile("/** @constructor */ var Uninit;");
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(TypedScopeCreator.CTOR_INITIALIZER.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testCreateScope_interfaceDeclaration() {
    Scope s = compile("/** @interface */ function AnInterface() {}");
    Assert.assertNotNull(s.getVar("AnInterface"));
    Assert.assertTrue(s.getVar("AnInterface").getType().isInterface());
  }

  @Test
  public void testCreateScope_uninitializedInterface_reportsWarning() {
    compile("/** @interface */ var UninitIface;");
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(TypedScopeCreator.IFACE_INITIALIZER.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testCreateScope_enumDeclarationAndProperties() {
    Scope s = compile(
        "/** @enum {string} */ var MyEnum = { FOO: 'foo', BAR: 'bar' };\n" +
        "var myVar = MyEnum.FOO;");
    Scope.Var enumVar = s.getVar("MyEnum");
    Assert.assertNotNull(enumVar);
    Assert.assertTrue(enumVar.getType().isEnumType());
    EnumType enumType = (EnumType) enumVar.getType();
    Assert.assertTrue(enumType.getElements().contains("FOO"));
    Assert.assertTrue(enumType.getElements().contains("BAR"));
  }

  @Test
  public void testCreateScope_enumInvalidKey_reportsWarning() {
    compile("/** @enum {number} */ var BadEnum = { '123_bad': 1 };");
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_enumNonObjectLitInitializer_reportsWarning() {
    compile("/** @enum {number} */ var BadEnumInit = 5;");
    Assert.assertTrue(compiler.getWarningCount() > 0);
    Assert.assertEquals(TypedScopeCreator.ENUM_INITIALIZER.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testCreateScope_aliasedEnum() {
    Scope s = compile(
        "/** @enum {number} */ var EnumA = { X: 1 };\n" +
        "/** @enum {number} */ var EnumB = EnumA;");
    Assert.assertNotNull(s.getVar("EnumB"));
    Assert.assertTrue(s.getVar("EnumB").getType().isEnumType());
  }

  @Test
  public void testCreateScope_aliasedConstructor() {
    Scope s = compile(
        "/** @constructor */ function Original() {}\n" +
        "var Alias = Original;");
    Assert.assertNotNull(s.getVar("Alias"));
    Assert.assertTrue(s.getVar("Alias").getType().isConstructor());
  }

  @Test
  public void testCreateScope_lendsAnnotation() {
    Scope s = compile(
        "/** @constructor */ function Base() {}\n" +
        "var props = /** @lends {Base.prototype} */ ({ foo: function() {} });");
    Assert.assertNotNull(s.getVar("Base.prototype.foo"));
  }

  @Test
  public void testCreateScope_lendsUnknownTarget_reportsWarning() {
    compile("var x = /** @lends {NonExistent} */ ({ a: 1 });");
    Assert.assertTrue(compiler.getWarningCount() > 0);
    Assert.assertEquals(TypedScopeCreator.UNKNOWN_LENDS.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testCreateScope_lendsNonObject_reportsWarning() {
    compile("var num = 123;\nvar x = /** @lends {num} */ ({ a: 1 });");
    Assert.assertTrue(compiler.getWarningCount() > 0);
    Assert.assertEquals(TypedScopeCreator.LENDS_ON_NON_OBJECT.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testCreateScope_typedefDeclaration() {
    Scope s = compile(
        "/** @typedef {{x: number, y: string}} */ var Point;\n" +
        "/** @type {Point} */ var p;");
    Assert.assertNotNull(compiler.getTypeRegistry().getType("Point"));
    Assert.assertNotNull(s.getVar("p"));
  }

  @Test
  public void testCreateScope_localScopeAndBleedingFunction() {
    Scope localScope = createLocalScope(
        "function outer() {\n" +
        "  var innerFn = function innerName(arg1, arg2) {\n" +
        "    return arg1 + arg2;\n" +
        "  };\n" +
        "  var x = 1;\n" +
        "}");
    Assert.assertNotNull(localScope);
    Assert.assertNotNull(localScope.getVar("innerFn"));
    Assert.assertNotNull(localScope.getVar("x"));
  }

  @Test
  public void testCreateScope_localScopeCatch() {
    Scope localScope = createLocalScope(
        "function f() {\n" +
        "  try { var y = 1; } catch (e) { var z = e; }\n" +
        "}");
    Assert.assertNotNull(localScope.getVar("y"));
  }

  @Test
  public void testCreateScope_firstOrderFunctionAnalysis() {
    Scope s = compile(
        "function parentFn() {\n" +
        "  var escaped = 1;\n" +
        "  var once = 2;\n" +
        "  function child() {\n" +
        "    escaped = 3;\n" +
        "  }\n" +
        "  return escaped + once;\n" +
        "}");
    Assert.assertNotNull(s.getVar("parentFn"));
  }

  @Test
  public void testCreateScope_googInherits() {
    Scope s = compile(
        "var goog = {};\n" +
        "goog.inherits = function(child, parent) {};\n" +
        "/** @constructor */ function Super() {}\n" +
        "/** @constructor \n * @extends {Super} */ function Sub() {}\n" +
        "goog.inherits(Sub, Super);");
    Assert.assertNotNull(s.getVar("Sub"));
    Assert.assertNotNull(s.getVar("Super"));
  }

  @Test
  public void testCreateScope_singletonGetter() {
    Scope s = compile(
        "var goog = {};\n" +
        "goog.addSingletonGetter = function(cls) {};\n" +
        "/** @constructor */ function MySingleton() {}\n" +
        "goog.addSingletonGetter(MySingleton);");
    Assert.assertNotNull(s.getVar("MySingleton"));
  }

  @Test
  public void testCreateScope_reflectObject() {
    Scope s = compile(
        "var goog = {}; goog.reflect = {};\n" +
        "goog.reflect.object = function(type, obj) { return obj; };\n" +
        "/** @constructor */ function MyType() {}\n" +
        "var obj = goog.reflect.object(MyType, { a: 1 });");
    Assert.assertNotNull(s.getVar("obj"));
  }

  @Test
  public void testCreateScope_reflectObjectInvalidConstructor_reportsWarning() {
    compile(
        "var goog = {}; goog.reflect = {};\n" +
        "goog.reflect.object = function(type, obj) { return obj; };\n" +
        "var notAType = 123;\n" +
        "var obj = goog.reflect.object(notAType, { a: 1 });");
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_windowConstructorRedefinition() {
    Scope s = compile(
        "/** @constructor */ function Window() {}\n" +
        "var w = new Window();");
    Assert.assertNotNull(s.getVar("Window"));
    Assert.assertNotNull(s.getVar("w"));
  }

  @Test
  public void testCreateScope_prototypeAssignmentObjectLit() {
    Scope s = compile(
        "/** @constructor */ function Bar() {}\n" +
        "Bar.prototype = { m1: function() {}, m2: 2 };");
    Assert.assertNotNull(s.getVar("Bar"));
    Assert.assertNotNull(s.getVar("Bar.prototype.m1"));
  }

  @Test
  public void testCreateScope_constInference() {
    Scope s = compile(
        "/** @const */ var CONST_A = 10;\n" +
        "var CONST_B = CONST_B || CONST_A;");
    Assert.assertNotNull(s.getVar("CONST_A"));
    Assert.assertNotNull(s.getVar("CONST_B"));
  }

  @Test
  public void testCreateScope_functionThisCollectProperties() {
    Scope s = compile(
        "/** @constructor */ function Person() {\n" +
        "  /** @type {string} */ this.name = 'John';\n" +
        "  /** @type {number} */ this.age = 30;\n" +
        "}");
    Scope.Var personVar = s.getVar("Person");
    Assert.assertNotNull(personVar);
    ObjectType instanceType = personVar.getType().toMaybeFunctionType().getInstanceType();
    Assert.assertTrue(instanceType.hasOwnProperty("name"));
    Assert.assertTrue(instanceType.hasOwnProperty("age"));
  }

  @Test
  public void testPatchGlobalScope_normal() {
    compile("var a = 1;");
    Assert.assertNotNull(globalScope.getVar("a"));

    Node newScript = compiler.parseSyntheticCode("patched.js", "var b = 2;");
    newScript.setInputId(new InputId("patched.js"));
    scopeCreator.patchGlobalScope(globalScope, newScript);

    Assert.assertNotNull(globalScope.getVar("b"));
  }

  @Test(expected = RuntimeException.class)
  public void testPatchGlobalScope_nonScriptNode_throwsException() {
    compile("var a = 1;");
    Node nonScript = new Node(Token.BLOCK);
    scopeCreator.patchGlobalScope(globalScope, nonScript);
  }

  @Test
  public void testCreateScope_stubDeclarations() {
    Scope s = compile(
        "/** @constructor */ function Foo() {}\n" +
        "Foo.prototype.stubProp;\n" +
        "var f = new Foo();");
    Assert.assertNotNull(s.getVar("Foo.prototype.stubProp"));
  }
}
