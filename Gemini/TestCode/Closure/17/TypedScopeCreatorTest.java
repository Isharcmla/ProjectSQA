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

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
  }

  private Node parse(String js) {
    Node n = compiler.parseTestCode(js);
    assertEquals("Parsing errors exist: " + compiler.getErrors(), 0, compiler.getErrorCount());
    return n;
  }

  private Node parseExterns(String js) {
    Node n = compiler.parseSyntheticCode("externs.js", js);
    n.setIsSyntheticBlock(true);
    return n;
  }

  private Node findNodeByPredicate(Node root, java.util.function.Predicate<Node> predicate) {
    if (predicate.test(root)) {
      return root;
    }
    for (Node child = root.getFirstChild(); child != null; child = child.getNext()) {
      Node found = findNodeByPredicate(child, predicate);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  private Node findFunctionNode(Node root, final String name) {
    return findNodeByPredicate(root, new java.util.function.Predicate<Node>() {
      @Override
      public boolean test(Node n) {
        if (n.isFunction()) {
          Node fnName = n.getFirstChild();
          if (fnName != null && name.equals(fnName.getString())) {
            return true;
          }
          Node parent = n.getParent();
          if (parent != null && parent.isName() && name.equals(parent.getString())) {
            return true;
          }
          if (parent != null && parent.isAssign()) {
            Node lhs = parent.getFirstChild();
            if (lhs != null && name.equals(lhs.getQualifiedName())) {
              return true;
            }
          }
        }
        return false;
      }
    });
  }

  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    Node root = new Node(Token.BLOCK);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createInitialScope(root);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("Date"));
    assertNotNull(scope.getVar("Function"));
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("ActiveXObject"));
  }

  @Test
  public void testCreateScope_withCodingConvention() {
    CodingConvention convention = new GoogleCodingConvention();
    TypedScopeCreator creator = new TypedScopeCreator(compiler, convention);
    Node root = parse("var x = 1;");
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope);
    assertNotNull(scope.getVar("x"));
  }

  @Test
  public void testLiteralTypesInference() {
    String js = "var a = null; var b = void 0; var c = 'hello'; var d = 42; var e = true; var f = false; var g = /abc/;";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    assertNotNull(scope.getVar("a"));
    assertNotNull(scope.getVar("b"));
    assertNotNull(scope.getVar("c"));
    assertNotNull(scope.getVar("d"));
    assertNotNull(scope.getVar("e"));
    assertNotNull(scope.getVar("f"));
    assertNotNull(scope.getVar("g"));
  }

  @Test
  public void testMultipleVarDefWarning() {
    String js = "/** @type {number} */ var x = 1, y = 2;";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypeCheck.MULTIPLE_VAR_DEF.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testFunctionDeclarationsAndLocalScope() {
    String js = "function foo(a, b) { var c = a + b; return c; }";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Scope.Var fooVar = globalScope.getVar("foo");
    assertNotNull(fooVar);
    assertTrue(fooVar.getType().isFunctionType());

    Node fnNode = findFunctionNode(root, "foo");
    assertNotNull(fnNode);
    Scope localScope = creator.createScope(fnNode, globalScope);
    assertNotNull(localScope);
    assertNotNull(localScope.getVar("a"));
    assertNotNull(localScope.getVar("b"));
    assertNotNull(localScope.getVar("c"));
  }

  @Test
  public void testCatchClauseInLocalScope() {
    String js = "function testCatch() { try { var x = 1; } catch (err) { var y = err; } }";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node fnNode = findFunctionNode(root, "testCatch");
    assertNotNull(fnNode);
    Scope localScope = creator.createScope(fnNode, globalScope);
    assertNotNull(localScope.getVar("err"));
    assertNotNull(localScope.getVar("y"));
  }

  @Test
  public void testBleedingFunctionName() {
    String js = "var myFn = function innerName(p) { return p; };";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node fnNode = findFunctionNode(root, "innerName");
    assertNotNull(fnNode);
    Scope localScope = creator.createScope(fnNode, globalScope);
    assertNotNull(localScope.getVar("innerName"));
    assertNotNull(localScope.getVar("p"));
  }

  @Test
  public void testConstructorAndPrototypeInitialization() {
    String js = "/** @constructor */ function Person(name) { this.name = name; }";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Scope.Var personVar = globalScope.getVar("Person");
    assertNotNull(personVar);
    assertTrue(personVar.getType().isConstructor());

    Scope.Var protoVar = globalScope.getVar("Person.prototype");
    assertNotNull(protoVar);
  }

  @Test
  public void testConstructorUninitializedWarning() {
    String js = "/** @constructor */ var UninitPerson;";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypedScopeCreator.CTOR_INITIALIZER.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInterfaceUninitializedWarning() {
    String js = "/** @interface */ var UninitInterface;";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypedScopeCreator.IFACE_INITIALIZER.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testEnumDeclarationAndProperties() {
    String js = "/** @enum {number} */ var MyEnum = { OK: 1, ERROR: 2 };";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Scope.Var enumVar = globalScope.getVar("MyEnum");
    assertNotNull(enumVar);
    assertTrue(enumVar.getType().isEnumType());
    EnumType enumType = enumVar.getType().toMaybeEnumType();
    assertTrue(enumType.getElements().contains("OK"));
    assertTrue(enumType.getElements().contains("ERROR"));
  }

  @Test
  public void testEnumWithInvalidKeyWarning() {
    String js = "/** @enum {number} */ var InvalidEnum = { 'not an ident': 1 };";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypeCheck.ENUM_NOT_CONSTANT.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testEnumInitializerNotObjectLitWarning() {
    String js = "/** @enum {number} */ var BadEnum = 42;";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypedScopeCreator.ENUM_INITIALIZER.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testAliasedEnum() {
    String js = "/** @enum {string} */ var OriginalEnum = { A: 'a' };\n"
              + "/** @enum {string} */ var AliasedEnum = OriginalEnum;";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Scope.Var aliasVar = globalScope.getVar("AliasedEnum");
    assertNotNull(aliasVar);
    assertTrue(aliasVar.getType().isEnumType());
  }

  @Test
  public void testTypedefDeclaration() {
    String js = "/** @typedef {{x: number, y: number}} */ var Point;";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertNotNull(globalScope.getVar("Point"));
    assertNotNull(compiler.getTypeRegistry().getType("Point"));
  }

  @Test
  public void testMalformedTypedefWarning() {
    String js = "/** @typedef {NonExistentType} */ var BadTypedef;";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypedScopeCreator.MALFORMED_TYPEDEF.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testLendsAnnotationValid() {
    String js = "/** @constructor */ function Foo() {}\n"
              + "var props = /** @lends {Foo.prototype} */ ({ bar: function() {} });";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertNotNull(globalScope.getVar("Foo"));
    assertNotNull(globalScope.getVar("props"));
  }

  @Test
  public void testLendsAnnotationUnknownTargetWarning() {
    String js = "var obj = /** @lends {UnknownTarget} */ ({ a: 1 });";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypedScopeCreator.UNKNOWN_LENDS.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testLendsAnnotationOnNonObjectWarning() {
    String js = "var num = 123;\n"
              + "var obj = /** @lends {num} */ ({ a: 1 });";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypedScopeCreator.LENDS_ON_NON_OBJECT.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testSubclassInheritance() {
    String js = "var goog = {};\n"
              + "goog.inherits = function(subCtor, superCtor) {};\n"
              + "/** @constructor */ function Super() {}\n"
              + "Super.prototype.method = function() {};\n"
              + "/** @constructor \n * @extends {Super} */ function Sub() {}\n"
              + "goog.inherits(Sub, Super);\n"
              + "/** @override */ Sub.prototype.method = function() {};";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Scope globalScope = creator.createScope(root, null);

    assertNotNull(globalScope.getVar("Sub"));
    assertNotNull(globalScope.getVar("Super"));
  }

  @Test
  public void testSingletonGetter() {
    String js = "var goog = {};\n"
              + "goog.addSingletonGetter = function(ctor) {};\n"
              + "/** @constructor */ function Service() {}\n"
              + "goog.addSingletonGetter(Service);";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Scope globalScope = creator.createScope(root, null);

    assertNotNull(globalScope.getVar("Service"));
    Scope.Var getInstanceVar = globalScope.getVar("Service.getInstance");
    assertNotNull(getInstanceVar);
  }

  @Test
  public void testObjectLiteralCast() {
    String js = "var goog = {}; goog.reflect = {};\n"
              + "goog.reflect.object = function(type, obj) { return obj; };\n"
              + "/** @constructor */ function Target() {}\n"
              + "var casted = goog.reflect.object(Target, { foo: 1 });";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Scope globalScope = creator.createScope(root, null);

    assertNotNull(globalScope.getVar("casted"));
  }

  @Test
  public void testObjectLiteralCastConstructorExpectedWarning() {
    String js = "var goog = {}; goog.reflect = {};\n"
              + "goog.reflect.object = function(type, obj) { return obj; };\n"
              + "var nonCtor = 123;\n"
              + "var casted = goog.reflect.object(nonCtor, { foo: 1 });";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    creator.createScope(root, null);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypedScopeCreator.CONSTRUCTOR_EXPECTED.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testWindowConstructorUpdatesGlobalThis() {
    String js = "/** @constructor */ function Window() {}";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Scope.Var windowVar = globalScope.getVar("Window");
    assertNotNull(windowVar);
    ObjectType globalThis = compiler.getTypeRegistry().getNativeObjectType(JSTypeNative.GLOBAL_THIS);
    assertNotNull(globalThis.getConstructor());
  }

  @Test
  public void testPatchGlobalScope() {
    String js1 = "var a = 1; var b = 2;";
    Node script1 = parse(js1);
    Node root = new Node(Token.BLOCK, script1);

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertNotNull(globalScope.getVar("a"));
    assertNotNull(globalScope.getVar("b"));

    String js2 = "var b = 3; var c = 4;";
    Node script2 = parse(js2);
    script2.setStaticSourceFile(script1.getStaticSourceFile());

    creator.patchGlobalScope(globalScope, script2);

    assertNull(globalScope.getVar("a"));
    assertNotNull(globalScope.getVar("b"));
    assertNotNull(globalScope.getVar("c"));
  }

  @Test
  public void testStubPropertyDeclarations() {
    String js = "var ns = {}; ns.prop;";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertNotNull(globalScope.getVar("ns"));
    assertNotNull(globalScope.getVar("ns.prop"));
  }

  @Test
  public void testClosureNamespaceIdiom() {
    String js = "var ns = ns || {};\n"
              + "/** @const */ var goog = goog || {};";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertNotNull(globalScope.getVar("ns"));
    assertNotNull(globalScope.getVar("goog"));
  }

  @Test
  public void testEscapedVariablesAnalysis() {
    String js = "function outer() {\n"
              + "  var x = 1;\n"
              + "  var ns = {};\n"
              + "  function inner() {\n"
              + "    function deepest() {\n"
              + "      x = 2;\n"
              + "      ns.prop = 3;\n"
              + "    }\n"
              + "    return deepest;\n"
              + "  }\n"
              + "  return inner;\n"
              + "}";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node outerFn = findFunctionNode(root, "outer");
    assertNotNull(outerFn);
    Scope outerScope = creator.createScope(outerFn, globalScope);
    Scope.Var xVar = outerScope.getVar("x");
    assertNotNull(xVar);
    assertTrue(xVar.isEscaped());
  }

  @Test
  public void testCollectPropertiesFromThisInGlobalScope() {
    String js = "/** @constructor */ function Widget() {\n"
              + "  /** @type {number} */ this.width = 100;\n"
              + "  /** @type {string} */ this.title;\n"
              + "}";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Scope.Var widgetVar = globalScope.getVar("Widget");
    assertNotNull(widgetVar);
    FunctionType widgetFn = widgetVar.getType().toMaybeFunctionType();
    ObjectType instanceType = widgetFn.getInstanceType();
    assertTrue(instanceType.hasOwnProperty("width"));
    assertTrue(instanceType.hasOwnProperty("title"));
  }

  @Test
  public void testPrototypeAssignedToObjectLiteral() {
    String js = "/** @constructor */ function Base() {}\n"
              + "Base.prototype = { methodA: function() {}, methodB: function() {} };";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Scope.Var baseVar = globalScope.getVar("Base");
    assertNotNull(baseVar);
    Scope.Var protoVar = globalScope.getVar("Base.prototype");
    assertNotNull(protoVar);
  }
}
