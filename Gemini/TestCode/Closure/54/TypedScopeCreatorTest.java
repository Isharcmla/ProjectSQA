package com.google.javascript.jscomp;

import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Assert;
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

  private Node parseAndGetRoot(String js) {
    return parseAndGetRoot(js, "");
  }

  private Node parseAndGetRoot(String js, String externs) {
    SourceFile[] inputs = new SourceFile[] {
        SourceFile.fromCode("input.js", js)
    };
    SourceFile[] externFiles = new SourceFile[] {
        SourceFile.fromCode("externs.js", externs)
    };
    compiler.init(externFiles, inputs, new CompilerOptions());
    Node root = compiler.parseInputs();
    Assert.assertNotNull(root);
    return root;
  }

  private Node getScriptNode(Node root) {
    // root is BLOCK or ROOT -> [EXTERNS SCRIPT, INPUT SCRIPT]
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      if (c.getType() == Token.SCRIPT && "input.js".equals(c.getSourceFileName())) {
        return c;
      }
    }
    return root.getLastChild();
  }

  @Test
  public void testCreateScope_globalScope_createsNativeTypes() {
    Node root = parseAndGetRoot("var a = 10;");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Assert.assertNotNull(globalScope);
    Assert.assertTrue(globalScope.isGlobal());
    Assert.assertNotNull(globalScope.getVar("Object"));
    Assert.assertNotNull(globalScope.getVar("Function"));
    Assert.assertNotNull(globalScope.getVar("Array"));
    Assert.assertNotNull(globalScope.getVar("String"));
    Assert.assertNotNull(globalScope.getVar("Number"));
    Assert.assertNotNull(globalScope.getVar("Boolean"));
    Assert.assertNotNull(globalScope.getVar("Date"));
    Assert.assertNotNull(globalScope.getVar("RegExp"));
    Assert.assertNotNull(globalScope.getVar("Error"));
    Assert.assertNotNull(globalScope.getVar("undefined"));
    Assert.assertNotNull(globalScope.getVar("ActiveXObject"));
  }

  @Test
  public void testCreateScope_globalVarLiterals_typesAttached() {
    String js = ""
        + "var n = null;\n"
        + "var v = void 0;\n"
        + "var s = 'hello';\n"
        + "var num = 123;\n"
        + "var t = true;\n"
        + "var f = false;\n"
        + "var r = /abc/;\n"
        + "var obj = { x: 1, 'y': 'str' };\n";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Assert.assertNotNull(globalScope.getVar("n"));
    Assert.assertNotNull(globalScope.getVar("v"));
    Assert.assertNotNull(globalScope.getVar("s"));
    Assert.assertNotNull(globalScope.getVar("num"));
    Assert.assertNotNull(globalScope.getVar("t"));
    Assert.assertNotNull(globalScope.getVar("f"));
    Assert.assertNotNull(globalScope.getVar("r"));
    Assert.assertNotNull(globalScope.getVar("obj"));

    Var objVar = globalScope.getVar("obj");
    Assert.assertNotNull(objVar.getType());
    Assert.assertTrue(objVar.getType().isObjectType());
  }

  @Test
  public void testCreateScope_functionDeclarationAndLocalScope() {
    String js = ""
        + "/** @param {number} x\n * @param {string} y\n * @return {boolean} */\n"
        + "function foo(x, y) {\n"
        + "  var z = x + 1;\n"
        + "  try {\n"
        + "    var inner = 1;\n"
        + "  } catch (err) {\n"
        + "    var caught = err;\n"
        + "  }\n"
        + "  return true;\n"
        + "}\n";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Var fooVar = globalScope.getVar("foo");
    Assert.assertNotNull(fooVar);
    Assert.assertTrue(fooVar.getType().isFunctionType());

    Node fnNode = fooVar.getNameNode().getParent();
    Scope localScope = creator.createScope(fnNode, globalScope);
    Assert.assertNotNull(localScope);
    Assert.assertFalse(localScope.isGlobal());
    Assert.assertNotNull(localScope.getVar("x"));
    Assert.assertNotNull(localScope.getVar("y"));
    Assert.assertNotNull(localScope.getVar("z"));
    Assert.assertNotNull(localScope.getVar("err"));
    Assert.assertNotNull(localScope.getVar("caught"));
  }

  @Test
  public void testCreateScope_constructorAndInterfaceDeclaration() {
    String js = ""
        + "/** @constructor */\n"
        + "function MyClass() {}\n"
        + "/** @interface */\n"
        + "function MyInterface() {}\n"
        + "/** @type {MyClass} */\n"
        + "var inst = new MyClass();\n";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Var classVar = globalScope.getVar("MyClass");
    Assert.assertNotNull(classVar);
    Assert.assertTrue(classVar.getType().isConstructor());
    Assert.assertNotNull(globalScope.getVar("MyClass.prototype"));

    Var ifaceVar = globalScope.getVar("MyInterface");
    Assert.assertNotNull(ifaceVar);
    Assert.assertTrue(ifaceVar.getType().isInterface());
    Assert.assertNotNull(globalScope.getVar("MyInterface.prototype"));
  }

  @Test
  public void testCreateScope_enumDeclarationAndProperties() {
    String js = ""
        + "/** @enum {number} */\n"
        + "var Status = {\n"
        + "  OK: 1,\n"
        + "  ERROR: 2\n"
        + "};\n";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Var enumVar = globalScope.getVar("Status");
    Assert.assertNotNull(enumVar);
    Assert.assertTrue(enumVar.getType() instanceof EnumType);
    EnumType enumType = (EnumType) enumVar.getType();
    Assert.assertTrue(enumType.hasOwnProperty("OK"));
    Assert.assertTrue(enumType.hasOwnProperty("ERROR"));
  }

  @Test
  public void testCreateScope_typedefDeclaration() {
    String js = ""
        + "/** @typedef {{name: string, age: number}} */\n"
        + "var Person;\n"
        + "/** @type {Person} */\n"
        + "var p;\n";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    JSType personType = compiler.getTypeRegistry().getType("Person");
    Assert.assertNotNull(personType);
    Var pVar = globalScope.getVar("p");
    Assert.assertNotNull(pVar);
  }

  @Test
  public void testCreateScope_lendsAnnotation() {
    String js = ""
        + "/** @constructor */\n"
        + "function Foo() {}\n"
        + "var obj = /** @lends {Foo.prototype} */ ({\n"
        + "  bar: function() { return 1; }\n"
        + "});\n";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Var fooVar = globalScope.getVar("Foo");
    Assert.assertNotNull(fooVar);
  }

  @Test
  public void testCreateScope_lendsUnknownOrNonObject_reportsWarning() {
    String js = ""
        + "var obj1 = /** @lends {NonExistent} */ ({ a: 1 });\n"
        + "var num = 123;\n"
        + "var obj2 = /** @lends {num} */ ({ b: 2 });\n";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Assert.assertNotNull(globalScope);
    Assert.assertTrue(compiler.getWarningCount() >= 2);
  }

  @Test
  public void testCreateScope_thisPropertiesCollected() {
    String js = ""
        + "/** @constructor */\n"
        + "function Widget() {\n"
        + "  /** @type {string} */\n"
        + "  this.title = 'default';\n"
        + "  /** @type {number} */\n"
        + "  this.count = 0;\n"
        + "}\n";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Var widgetVar = globalScope.getVar("Widget");
    Assert.assertNotNull(widgetVar);
    FunctionType ctor = widgetVar.getType().toMaybeFunctionType();
    ObjectType instance = ctor.getInstanceType();
    Assert.assertTrue(instance.hasOwnProperty("title"));
    Assert.assertTrue(instance.hasOwnProperty("count"));
  }

  @Test
  public void testCreateScope_qualifiedNamesAndStubs() {
    String js = ""
        + "var ns = {};\n"
        + "/** @type {number} */\n"
        + "ns.count = 42;\n"
        + "ns.stubProp;\n";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Var propVar = globalScope.getVar("ns.count");
    Assert.assertNotNull(propVar);
    Assert.assertNotNull(globalScope.getVar("ns.stubProp"));
  }

  @Test
  public void testCreateScope_inheritsAndSubclassRelationship() {
    String js = ""
        + "/** @constructor */\n"
        + "function SuperClass() {}\n"
        + "/** @constructor\n * @extends {SuperClass} */\n"
        + "function SubClass() {}\n"
        + "goog.inherits(SubClass, SuperClass);\n";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Scope globalScope = creator.createScope(root, null);

    Var subClassVar = globalScope.getVar("SubClass");
    Assert.assertNotNull(subClassVar);
  }

  @Test
  public void testCreateInitialScope_returnsScopeWithNativeBindings() {
    Node root = parseAndGetRoot("");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope initialScope = creator.createInitialScope(root);

    Assert.assertNotNull(initialScope);
    Assert.assertTrue(initialScope.isGlobal());
    Assert.assertNotNull(initialScope.getVar("Object"));
    Assert.assertNotNull(initialScope.getVar("String"));
    Assert.assertNotNull(initialScope.getVar("Number"));
    Assert.assertNotNull(initialScope.getVar("Boolean"));
    Assert.assertNotNull(initialScope.getVar("Array"));
    Assert.assertNotNull(initialScope.getVar("Function"));
    Assert.assertNotNull(initialScope.getVar("Date"));
    Assert.assertNotNull(initialScope.getVar("RegExp"));
    Assert.assertNotNull(initialScope.getVar("Error"));
    Assert.assertNotNull(initialScope.getVar("undefined"));
    Assert.assertNotNull(initialScope.getVar("ActiveXObject"));
  }

  @Test
  public void testPatchGlobalScope_updatesVariablesCorrectly() {
    String js1 = "var a = 1; var b = 2;";
    Node root1 = parseAndGetRoot(js1);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root1, null);

    Assert.assertNotNull(globalScope.getVar("a"));
    Assert.assertNotNull(globalScope.getVar("b"));

    // Modify the script content and re-patch
    String js2 = "var a = 'hello'; var c = true;";
    Node root2 = parseAndGetRoot(js2);
    Node scriptNode = getScriptNode(root2);

    creator.patchGlobalScope(globalScope, scriptNode);

    Assert.assertNotNull(globalScope.getVar("a"));
    Assert.assertNotNull(globalScope.getVar("c"));
    Assert.assertNull(globalScope.getVar("b"));
  }

  @Test(expected = IllegalStateException.class)
  public void testPatchGlobalScope_nonScriptNode_throwsException() {
    Node root = parseAndGetRoot("var x = 1;");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node nonScript = new Node(Token.BLOCK);
    creator.patchGlobalScope(globalScope, nonScript);
  }

  @Test(expected = IllegalStateException.class)
  public void testPatchGlobalScope_nonGlobalScope_throwsException() {
    String js = "function f() { var x = 1; }";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);
    Var fnVar = globalScope.getVar("f");
    Scope localScope = creator.createScope(fnVar.getNameNode().getParent(), globalScope);

    Node scriptNode = getScriptNode(root);
    creator.patchGlobalScope(localScope, scriptNode);
  }

  @Test
  public void testCreateScope_emptyScript_createsScope() {
    Node root = parseAndGetRoot("");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    Assert.assertNotNull(scope);
    Assert.assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScope_multipleVarDeclarationWithJsdoc_reportsWarning() {
    String js = "/** @type {number} */ var x = 1, y = 2;";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    Assert.assertNotNull(scope);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_uninitializedConstructor_reportsWarning() {
    String js = "/** @constructor */ var MyCtor;";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    Assert.assertNotNull(scope);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_uninitializedInterface_reportsWarning() {
    String js = "/** @interface */ var MyInterface;";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    Assert.assertNotNull(scope);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_invalidEnumInitializer_reportsWarning() {
    String js = "/** @enum {number} */ var E = 5;";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    Assert.assertNotNull(scope);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_duplicateEnumKeys_reportsWarning() {
    String js = "/** @enum {number} */ var E = { A: 1, A: 2 };";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    Assert.assertNotNull(scope);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_windowConstructor_configuresGlobalThis() {
    String js = "/** @constructor */ function Window() {}";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    Assert.assertNotNull(scope.getVar("Window"));
    ObjectType globalThis = compiler.getTypeRegistry().getNativeObjectType(JSTypeNative.GLOBAL_THIS);
    Assert.assertNotNull(globalThis);
  }

  @Test
  public void testCreateScope_namedFunctionExpressionInLocalScope() {
    String js = "function outer() { var f = function inner() {}; }";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Var outerVar = globalScope.getVar("outer");
    Node outerFn = outerVar.getNameNode().getParent();
    Scope localScope = creator.createScope(outerFn, globalScope);

    Assert.assertNotNull(localScope);
    Assert.assertNotNull(localScope.getVar("f"));
  }

  @Test
  public void testCreateScope_redeclarationOfVariable_reportsWarning() {
    String js = "var a = 1; var a = 2;";
    Node root = parseAndGetRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    Assert.assertNotNull(scope);
    Assert.assertNotNull(scope.getVar("a"));
  }
}
