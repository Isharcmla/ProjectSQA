package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.InputId;
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
  private TypedScopeCreator scopeCreator;
  private Node root;
  private Node externsRoot;
  private Node mainRoot;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    scopeCreator = new TypedScopeCreator(compiler);
  }

  private Scope buildGlobalScope(String js) {
    return buildGlobalScope("", js);
  }

  private Scope buildGlobalScope(String externsJs, String mainJs) {
    root = new Node(Token.BLOCK);
    externsRoot = new Node(Token.BLOCK);
    externsRoot.setIsSyntheticBlock(true);
    mainRoot = new Node(Token.BLOCK);
    mainRoot.setIsSyntheticBlock(true);
    root.addChildToBack(externsRoot);
    root.addChildToBack(mainRoot);

    if (!externsJs.isEmpty()) {
      Node externScript = compiler.parseTestCode(externsJs);
      externScript.setInputId(new InputId("externs"));
      for (Node child : externScript.children()) {
        child.putProp(Node.SOURCENAME_PROP, "externs");
      }
      externsRoot.addChildToBack(externScript);
    }

    Node mainScript = compiler.parseTestCode(mainJs);
    mainScript.setInputId(new InputId("input"));
    for (Node child : mainScript.children()) {
      child.putProp(Node.SOURCENAME_PROP, "input");
    }
    mainRoot.addChildToBack(mainScript);

    return scopeCreator.createScope(root, null);
  }

  private Node findFunctionNode(Node parent, String name) {
    if (parent.isFunction()) {
      Node nameNode = parent.getFirstChild();
      if (nameNode != null && name.equals(nameNode.getString())) {
        return parent;
      }
    }
    for (Node child = parent.getFirstChild(); child != null; child = child.getNext()) {
      Node res = findFunctionNode(child, name);
      if (res != null) {
        return res;
      }
    }
    return null;
  }

  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    Node block = new Node(Token.BLOCK);
    Scope initialScope = scopeCreator.createInitialScope(block);

    assertNotNull(initialScope.getVar("Object"));
    assertNotNull(initialScope.getVar("Array"));
    assertNotNull(initialScope.getVar("Date"));
    assertNotNull(initialScope.getVar("String"));
    assertNotNull(initialScope.getVar("Number"));
    assertNotNull(initialScope.getVar("Boolean"));
    assertNotNull(initialScope.getVar("RegExp"));
    assertNotNull(initialScope.getVar("Error"));
    assertNotNull(initialScope.getVar("EvalError"));
    assertNotNull(initialScope.getVar("RangeError"));
    assertNotNull(initialScope.getVar("ReferenceError"));
    assertNotNull(initialScope.getVar("SyntaxError"));
    assertNotNull(initialScope.getVar("TypeError"));
    assertNotNull(initialScope.getVar("URIError"));
    assertNotNull(initialScope.getVar("undefined"));
    assertNotNull(initialScope.getVar("ActiveXObject"));
  }

  @Test
  public void testPrimitiveLiteralsAndInferredVars() {
    Scope scope = buildGlobalScope(
        "var a = 'hello';",
        "var b = 42;\n"
            + "var c = true;\n"
            + "var d = false;\n"
            + "var e = null;\n"
            + "var f = void 0;\n"
            + "var g = /abc/;\n"
            + "var h = {};");

    assertNotNull(scope.getVar("a"));
    assertNotNull(scope.getVar("b"));
    assertNotNull(scope.getVar("c"));
    assertNotNull(scope.getVar("d"));
    assertNotNull(scope.getVar("e"));
    assertNotNull(scope.getVar("f"));
    assertNotNull(scope.getVar("g"));
    assertNotNull(scope.getVar("h"));
  }

  @Test
  public void testFunctionDeclarationsAndHoisting() {
    Scope scope = buildGlobalScope(
        "function foo(x, y) { return x + y; }\n"
            + "var bar = function(a) { return a; };");

    assertNotNull(scope.getVar("foo"));
    assertNotNull(scope.getVar("bar"));

    Node fooNode = findFunctionNode(mainRoot, "foo");
    assertNotNull(fooNode);

    Scope localScope = scopeCreator.createScope(fooNode, scope);
    assertNotNull(localScope.getVar("x"));
    assertNotNull(localScope.getVar("y"));
    assertEquals(localScope.getParent(), scope);
  }

  @Test
  public void testLocalScope_catchClauseAndEscapedVariables() {
    String js = "function outer() {\n"
        + "  var x = 1;\n"
        + "  try {\n"
        + "    var y = 2;\n"
        + "  } catch (e) {\n"
        + "    var z = e;\n"
        + "  }\n"
        + "  function inner() {\n"
        + "    x = 2;\n"
        + "    return x;\n"
        + "  }\n"
        + "  return inner;\n"
        + "}";

    Scope globalScope = buildGlobalScope(js);
    Node outerNode = findFunctionNode(mainRoot, "outer");
    assertNotNull(outerNode);

    Scope outerScope = scopeCreator.createScope(outerNode, globalScope);
    assertNotNull(outerScope.getVar("x"));
    assertNotNull(outerScope.getVar("y"));
    assertNotNull(outerScope.getVar("e"));
    assertNotNull(outerScope.getVar("inner"));
  }

  @Test
  public void testTypedefDeclaration_globalVarAndGetProp() {
    String js = "/** @typedef {number|string} */ var MyType;\n"
        + "var ns = {};\n"
        + "/** @typedef {boolean} */ ns.BoolType;";

    Scope scope = buildGlobalScope(js);
    assertNotNull(scope.getVar("MyType"));
    assertNotNull(compiler.getTypeRegistry().getType("MyType"));
    assertNotNull(compiler.getTypeRegistry().getType("ns.BoolType"));
  }

  @Test
  public void testMalformedTypedef_reportsWarning() {
    String js = "/** @typedef */ var BadTypedef;";
    buildGlobalScope(js);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testEnumDeclaration_validAndInvalid() {
    String js = "/** @enum {number} */ var ValidEnum = { ONE: 1, TWO: 2 };\n"
        + "/** @enum {string} */ var AliasedEnum = ValidEnum;\n"
        + "/** @enum {number} */ var InvalidEnum = 123;";

    Scope scope = buildGlobalScope(js);
    assertNotNull(scope.getVar("ValidEnum"));
    assertTrue(scope.getVar("ValidEnum").getType() instanceof EnumType);
    assertNotNull(scope.getVar("AliasedEnum"));
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testEnumWithInvalidKeyName_reportsWarning() {
    String js = "/** @enum {number} */ var CustomEnum = { 'invalid-key': 1 };";
    buildGlobalScope(js);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testConstructorAndInterfaceDeclaration() {
    String js = "/** @constructor */ function Foo() {\n"
        + "  /** @type {number} */ this.num = 1;\n"
        + "}\n"
        + "Foo.prototype.method = function() {};\n"
        + "/** @interface */ function AnInterface() {}\n"
        + "AnInterface.prototype.draw = function() {};";

    Scope scope = buildGlobalScope(js);
    assertNotNull(scope.getVar("Foo"));
    assertNotNull(scope.getVar("Foo.prototype"));
    assertNotNull(scope.getVar("AnInterface"));
    assertNotNull(scope.getVar("AnInterface.prototype"));

    JSType fooType = scope.getVar("Foo").getType();
    assertTrue(fooType.isFunctionType());
    assertTrue(fooType.toMaybeFunctionType().isConstructor());
  }

  @Test
  public void testUninitializedConstructor_reportsWarning() {
    String js = "/** @constructor */ var UninitFoo;";
    buildGlobalScope(js);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testWindowConstructorRedefinition() {
    String js = "/** @constructor */ function Window() {}";
    Scope scope = buildGlobalScope(js);
    assertNotNull(scope.getVar("Window"));
  }

  @Test
  public void testLendsAnnotation_validAndUnknown() {
    String js = "var ns = {};\n"
        + "ns.obj = /** @lends {ns} */ ({ prop: 1 });\n"
        + "var invalidLends = /** @lends {NonExistent} */ ({ a: 2 });\n"
        + "var numVar = 10;\n"
        + "var nonObjLends = /** @lends {numVar} */ ({ b: 3 });";

    Scope scope = buildGlobalScope(js);
    assertNotNull(scope.getVar("ns"));
    assertTrue(compiler.getWarningCount() >= 2);
  }

  @Test
  public void testSubclassRelationship_googInherits() {
    String js = "/** @constructor */ function Parent() {}\n"
        + "/** @constructor */ function Child() {}\n"
        + "goog.inherits(Child, Parent);";

    Scope scope = buildGlobalScope(
        "var goog = {}; goog.inherits = function(child, parent) {};",
        js);

    assertNotNull(scope.getVar("Parent"));
    assertNotNull(scope.getVar("Child"));
  }

  @Test
  public void testSingletonGetter() {
    String js = "/** @constructor */ function MySingleton() {}\n"
        + "goog.addSingletonGetter(MySingleton);";

    Scope scope = buildGlobalScope(
        "var goog = {}; goog.addSingletonGetter = function(ctor) {};",
        js);

    assertNotNull(scope.getVar("MySingleton"));
  }

  @Test
  public void testObjectLiteralCast() {
    String js = "/** @constructor */ function TargetType() {}\n"
        + "goog.reflect.object(TargetType, { x: 1 });\n"
        + "goog.reflect.object(NonExistentType, { y: 2 });";

    buildGlobalScope(
        "var goog = {}; goog.reflect = {}; goog.reflect.object = function(t, o) {};",
        js);

    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testMultipleVarDefinitions_reportsWarningWhenDocPresent() {
    String js = "/** @type {number} */ var a = 1, b = 2;";
    buildGlobalScope(js);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testConstantSymbolsAndOrPattern() {
    String js = "/** @const */ var CONST_VAL = 100;\n"
        + "/** @const */ var ns = ns || {};\n"
        + "var x = /** @type {number} */ (5);";

    Scope scope = buildGlobalScope(js);
    assertNotNull(scope.getVar("CONST_VAL"));
    assertNotNull(scope.getVar("ns"));
    assertNotNull(scope.getVar("x"));
  }

  @Test
  public void testPrototypeRedefinition() {
    String js = "/** @constructor */ function Base() {}\n"
        + "Base.prototype = { m1: function() {}, m2: function() {} };";

    Scope scope = buildGlobalScope(js);
    assertNotNull(scope.getVar("Base"));
    assertNotNull(scope.getVar("Base.prototype"));
  }

  @Test
  public void testStubDeclarationsInExternsAndCode() {
    String externs = "var ExtObj = {}; ExtObj.stubProp;";
    String main = "var MainObj = {}; MainObj.codeStub;";

    Scope scope = buildGlobalScope(externs, main);
    assertNotNull(scope.getVar("ExtObj"));
    assertNotNull(scope.getVar("MainObj"));
  }

  @Test
  public void testPatchGlobalScope_replacesVarsInScript() {
    String js1 = "var scriptVar1 = 10; function testFn() { return scriptVar1; }";
    Scope scope = buildGlobalScope(js1);
    assertNotNull(scope.getVar("scriptVar1"));
    assertNotNull(scope.getVar("testFn"));

    Node newScript = compiler.parseTestCode("var scriptVar2 = 20;");
    newScript.setInputId(new InputId("input"));
    newScript.putProp(Node.SOURCENAME_PROP, "input");
    for (Node child : newScript.children()) {
      child.putProp(Node.SOURCENAME_PROP, "input");
    }

    scopeCreator.patchGlobalScope(scope, newScript);
    assertNull(scope.getVar("scriptVar1"));
    assertNotNull(scope.getVar("scriptVar2"));
  }

  @Test(expected = IllegalStateException.class)
  public void testPatchGlobalScope_nonScriptThrows() {
    Scope scope = buildGlobalScope("var x = 1;");
    Node nonScript = new Node(Token.BLOCK);
    scopeCreator.patchGlobalScope(scope, nonScript);
  }

  @Test
  public void testBleedingFunctionNameAndIIFEArguments() {
    String js = "var outer = function inner(param) {\n"
        + "  return inner(param);\n"
        + "};\n"
        + "(function(iifeParam) {\n"
        + "  return iifeParam;\n"
        + "})(outer);";

    Scope globalScope = buildGlobalScope(js);
    Node innerNode = findFunctionNode(mainRoot, "inner");
    assertNotNull(innerNode);

    Scope innerScope = scopeCreator.createScope(innerNode, globalScope);
    assertNotNull(innerScope.getVar("inner"));
    assertNotNull(innerScope.getVar("param"));
  }

  @Test
  public void testOverriddenFunctionInSubclass() {
    String js = "/** @constructor */ function SuperClass() {}\n"
        + "SuperClass.prototype.foo = function(/** string */ a) {};\n"
        + "/** @constructor @extends {SuperClass} */ function SubClass() {}\n"
        + "goog.inherits(SubClass, SuperClass);\n"
        + "/** @override */ SubClass.prototype.foo = function(a) {};";

    Scope scope = buildGlobalScope(
        "var goog = {}; goog.inherits = function(sub, sup) {};",
        js);

    assertNotNull(scope.getVar("SuperClass"));
    assertNotNull(scope.getVar("SubClass"));
  }

  @Test
  public void testCustomCodingConventionConstructor() {
    CodingConvention customConvention = new GoogleCodingConvention();
    TypedScopeCreator customCreator = new TypedScopeCreator(compiler, customConvention);
    Node testRoot = new Node(Token.BLOCK);
    Node extRoot = new Node(Token.BLOCK);
    extRoot.setIsSyntheticBlock(true);
    Node mRoot = new Node(Token.BLOCK);
    mRoot.setIsSyntheticBlock(true);
    testRoot.addChildToBack(extRoot);
    testRoot.addChildToBack(mRoot);

    Node script = compiler.parseTestCode("var a = 1;");
    script.setInputId(new InputId("input"));
    mRoot.addChildToBack(script);

    Scope s = customCreator.createScope(testRoot, null);
    assertNotNull(s.getVar("a"));
  }
}
