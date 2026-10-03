package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.JSDocInfo;
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

  private Node parseAndCreateRoot(String js) {
    return compiler.parseTestCode(js);
  }

  private Node findFirstNode(Node root, int tokenType) {
    if (root.getType() == tokenType) {
      return root;
    }
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      Node res = findFirstNode(c, tokenType);
      if (res != null) {
        return res;
      }
    }
    return null;
  }

  @Test
  public void testConstructor_withDefaultAndCustomCodingConvention() {
    TypedScopeCreator creator1 = new TypedScopeCreator(compiler);
    assertNotNull(creator1);

    CodingConvention convention = new GoogleCodingConvention();
    TypedScopeCreator creator2 = new TypedScopeCreator(compiler, convention);
    assertNotNull(creator2);
  }

  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = parseAndCreateRoot("");
    Scope scope = creator.createInitialScope(root);

    assertNotNull(scope);
    assertTrue(scope.isDeclared("Object", false));
    assertTrue(scope.isDeclared("Array", false));
    assertTrue(scope.isDeclared("Function", false));
    assertTrue(scope.isDeclared("Date", false));
    assertTrue(scope.isDeclared("RegExp", false));
    assertTrue(scope.isDeclared("Error", false));
    assertTrue(scope.isDeclared("undefined", false));
    assertTrue(scope.isDeclared("ActiveXObject", false));
    assertTrue(scope.isDeclared("goog.typedef", false));
  }

  @Test
  public void testCreateScope_literalsAndBasicTypes() {
    String js = "var n = null;\n"
        + "var v = void 0;\n"
        + "var s = 'hello';\n"
        + "var num = 42;\n"
        + "var bTrue = true;\n"
        + "var bFalse = false;\n"
        + "var re = /abc/;\n"
        + "var obj = { a: 1, b: 'str' };";
    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope.getVar("n"));
    assertNotNull(scope.getVar("s"));
    assertNotNull(scope.getVar("num"));
    assertNotNull(scope.getVar("bTrue"));
    assertNotNull(scope.getVar("re"));
    assertNotNull(scope.getVar("obj"));
  }

  @Test
  public void testCreateScope_functionDeclarationAndLocalScope() {
    String js = "function outer(param1, param2) {\n"
        + "  var localVar = 10;\n"
        + "  try {\n"
        + "    var innerVar = localVar;\n"
        + "  } catch (err) {\n"
        + "    var inCatch = err;\n"
        + "  }\n"
        + "  return param1;\n"
        + "}";
    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertNotNull(globalScope.getVar("outer"));
    assertTrue(globalScope.getVar("outer").getType().isFunctionType());

    Node fnNode = findFirstNode(root, Token.FUNCTION);
    assertNotNull(fnNode);

    Scope localScope = creator.createScope(fnNode, globalScope);
    assertNotNull(localScope);
    assertNotNull(localScope.getVar("param1"));
    assertNotNull(localScope.getVar("param2"));
    assertNotNull(localScope.getVar("localVar"));
    assertNotNull(localScope.getVar("innerVar"));
    assertNotNull(localScope.getVar("err"));
  }

  @Test
  public void testCreateScope_constructorInterfaceAndPrototype() {
    String js = "/** @constructor */\n"
        + "function Person(name) {\n"
        + "  /** @type {string} */ this.name = name;\n"
        + "}\n"
        + "Person.prototype.getName = function() { return this.name; };\n"
        + "/** @interface */\n"
        + "function Greeter() {}\n"
        + "Greeter.prototype.greet = function() {};";

    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    Scope.Var personVar = scope.getVar("Person");
    assertNotNull(personVar);
    assertTrue(personVar.getType().isConstructor());
    assertNotNull(scope.getVar("Person.prototype"));
    assertNotNull(scope.getVar("Person.prototype.getName"));

    Scope.Var greeterVar = scope.getVar("Greeter");
    assertNotNull(greeterVar);
    assertTrue(greeterVar.getType().isInterface());
    assertNotNull(scope.getVar("Greeter.prototype"));
  }

  @Test
  public void testCreateScope_enumsValidAndDuplicate() {
    String js = "/** @enum {number} */\n"
        + "var ValidEnum = {\n"
        + "  A: 1,\n"
        + "  B: 2\n"
        + "};\n"
        + "/** @enum {string} */\n"
        + "var DupEnum = {\n"
        + "  X: '1',\n"
        + "  X: '2'\n"
        + "};";

    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    Scope.Var enumVar = scope.getVar("ValidEnum");
    assertNotNull(enumVar);
    assertTrue(enumVar.getType() instanceof EnumType);
    assertTrue(compiler.getWarningCount() > 0 || compiler.getErrorCount() > 0);
  }

  @Test
  public void testCreateScope_enumInvalidInitializer() {
    String js = "/** @enum {number} */ var InvalidEnumInit = 123;";
    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_constructorWithoutInitializerWarning() {
    String js = "/** @constructor */ var UninitializedCtor;";
    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_interfaceWithoutInitializerWarning() {
    String js = "/** @interface */ var UninitializedIface;";
    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_multipleVarDefWarning() {
    String js = "/** @type {number} */ var a = 1, b = 2;";
    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_typedefs() {
    String js = "/** @typedef {{name: string, age: number}} */\n"
        + "var PersonRecord;\n"
        + "/** @typedef {number} */\n"
        + "goog.typedef;";

    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope);
    assertNotNull(compiler.getTypeRegistry().getType("PersonRecord"));
  }

  @Test
  public void testCreateScope_lendsAnnotation() {
    String js = "/** @constructor */ function Foo() {}\n"
        + "var obj = /** @lends {Foo.prototype} */ { bar: function() {} };\n"
        + "var badLends1 = /** @lends {nonExistentVar} */ { a: 1 };\n"
        + "var notAnObj = 42;\n"
        + "var badLends2 = /** @lends {notAnObj} */ { b: 2 };";

    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope);
    assertTrue(compiler.getWarningCount() >= 2);
  }

  @Test
  public void testCreateScope_googInheritsAndSingletonGetter() {
    String js = "/** @constructor */ function SuperClass() {}\n"
        + "/** @constructor \n @extends {SuperClass} */ function SubClass() {}\n"
        + "goog.inherits(SubClass, SuperClass);\n"
        + "goog.addSingletonGetter(SubClass);";

    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope.getVar("SubClass"));
    assertNotNull(scope.getVar("SuperClass"));
  }

  @Test
  public void testCreateScope_objectLiteralCast() {
    String js = "/** @constructor */ function TargetType() {}\n"
        + "var casted = goog.reflect.object(TargetType, { k: 1 });\n"
        + "var badCast = goog.reflect.object(123, { k: 2 });";

    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_stubsAndQualifiedNames() {
    String js = "/** @constructor */ function Namespace() {}\n"
        + "Namespace.prototype.stubMethod;\n"
        + "Namespace.stubProperty;\n"
        + "Namespace.value = 100;";

    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope.getVar("Namespace.prototype.stubMethod"));
    assertNotNull(scope.getVar("Namespace.stubProperty"));
    assertNotNull(scope.getVar("Namespace.value"));
  }

  @Test
  public void testCreateScope_windowConstructorRedefinition() {
    String js = "/** @constructor */ function Window() {}";
    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope.getVar("Window"));
    ObjectType globalThis = compiler.getTypeRegistry().getNativeObjectType(JSTypeNative.GLOBAL_THIS);
    assertNotNull(globalThis.getConstructor());
  }

  @Test
  public void testCreateScope_hoistedFunctionAndMethodOverride() {
    String js = "function testHoisting() {\n"
        + "  return hoisted();\n"
        + "  function hoisted() { return 1; }\n"
        + "}\n"
        + "/** @constructor */ function Parent() {}\n"
        + "Parent.prototype.foo = function(x) {};\n"
        + "/** @constructor \n @extends {Parent} */ function Child() {}\n"
        + "Child.prototype.foo = function(x) {};";

    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope.getVar("testHoisting"));
    assertNotNull(scope.getVar("Child.prototype.foo"));
  }

  @Test
  public void testCreateScope_constantAndOrIdiom() {
    String js = "/** @const */ var MY_CONST = 10;\n"
        + "var ns = ns || {};";

    Node root = parseAndCreateRoot(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope.getVar("MY_CONST"));
    assertNotNull(scope.getVar("ns"));
  }

  @Test
  public void testGetBestJSDocInfo() {
    String js = "/** @type {number} */ var x = 1;\n"
        + "/** @param {string} p */ function f(p) {}\n"
        + "var obj = { /** @type {boolean} */ prop: true };";

    Node root = parseAndCreateRoot(js);
    assertNotNull(TypedScopeCreator.getBestJSDocInfo(root));

    Node varNode = findFirstNode(root, Token.VAR);
    assertNotNull(varNode);
    JSDocInfo info = TypedScopeCreator.getBestJSDocInfo(varNode.getFirstChild());
    assertNotNull(info);
    assertTrue(info.hasType());

    Node fnNode = findFirstNode(root, Token.FUNCTION);
    assertNotNull(fnNode);
    JSDocInfo fnInfo = TypedScopeCreator.getBestJSDocInfo(fnNode);
    assertNotNull(fnInfo);
  }

  @Test
  public void testConstantsAndDiagnosticTypes() {
    assertEquals(ObjectType.createDelegateSuffix("Proxy"), TypedScopeCreator.DELEGATE_PROXY_SUFFIX);
    assertNotNull(TypedScopeCreator.MALFORMED_TYPEDEF);
    assertNotNull(TypedScopeCreator.ENUM_INITIALIZER);
    assertNotNull(TypedScopeCreator.CTOR_INITIALIZER);
    assertNotNull(TypedScopeCreator.IFACE_INITIALIZER);
    assertNotNull(TypedScopeCreator.CONSTRUCTOR_EXPECTED);
    assertNotNull(TypedScopeCreator.UNKNOWN_LENDS);
    assertNotNull(TypedScopeCreator.LENDS_ON_NON_OBJECT);
  }
}
