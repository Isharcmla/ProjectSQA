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
    compiler.initOptions(options);
  }

  private Node parse(String js) {
    Node root = compiler.parseTestCode(js);
    assertEquals("Parsing should not produce errors", 0, compiler.getErrorCount());
    return root;
  }

  private Node parseWithErrors(String js) {
    return compiler.parseTestCode(js);
  }

  @Test
  public void testCreateInitialScope_returnsScopeWithNativeTypes() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = parse("");
    Scope scope = creator.createInitialScope(root);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Function"));
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("String"));
    assertNotNull(scope.getVar("Number"));
    assertNotNull(scope.getVar("Boolean"));
    assertNotNull(scope.getVar("Date"));
    assertNotNull(scope.getVar("RegExp"));
    assertNotNull(scope.getVar("Error"));
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("ActiveXObject"));
  }

  @Test
  public void testCreateScope_globalLiteralsAndVariables() {
    String js = ""
        + "var a = null;\n"
        + "var b = void 0;\n"
        + "var c = 'hello';\n"
        + "var d = 123;\n"
        + "var e = true;\n"
        + "var f = false;\n"
        + "var g = /abc/;\n"
        + "var h = {};\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Scope globalScope = creator.createScope(root, null);

    assertNotNull(globalScope);
    assertTrue(globalScope.isDeclared("a", false));
    assertTrue(globalScope.isDeclared("b", false));
    assertTrue(globalScope.isDeclared("c", false));
    assertTrue(globalScope.isDeclared("d", false));
    assertTrue(globalScope.isDeclared("e", false));
    assertTrue(globalScope.isDeclared("f", false));
    assertTrue(globalScope.isDeclared("g", false));
    assertTrue(globalScope.isDeclared("h", false));
  }

  @Test
  public void testCreateScope_localScopeAndArguments() {
    String js = ""
        + "/** @param {number} x\n"
        + "  * @param {string} y\n"
        + "  */\n"
        + "function foo(x, y) {\n"
        + "  var z = x;\n"
        + "  return z;\n"
        + "}\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);
    assertNotNull(globalScope);

    Node functionNode = root.getFirstChild();
    Scope localScope = creator.createScope(functionNode, globalScope);

    assertNotNull(localScope);
    assertFalse(localScope.isGlobal());
    assertEquals(globalScope, localScope.getParent());
    assertTrue(localScope.isDeclared("x", false));
    assertTrue(localScope.isDeclared("y", false));
    assertTrue(localScope.isDeclared("z", false));

    JSType xType = localScope.getVar("x").getType();
    assertNotNull(xType);
    assertTrue(xType.isNumber());

    JSType yType = localScope.getVar("y").getType();
    assertNotNull(yType);
    assertTrue(yType.isString());
  }

  @Test
  public void testCreateScope_catchBlock() {
    String js = ""
        + "function f() {\n"
        + "  try {\n"
        + "  } catch (err) {\n"
        + "    var inner = 1;\n"
        + "  }\n"
        + "}\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node functionNode = root.getFirstChild();
    Scope localScope = creator.createScope(functionNode, globalScope);

    assertTrue(localScope.isDeclared("err", false));
    assertTrue(localScope.isDeclared("inner", false));
  }

  @Test
  public void testCreateScope_functionConstructorAndInterface() {
    String js = ""
        + "/** @constructor */\n"
        + "function MyClass() {\n"
        + "  /** @type {number} */\n"
        + "  this.num = 42;\n"
        + "}\n"
        + "/** @interface */\n"
        + "function MyInterface() {}\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("MyClass", false));
    assertTrue(globalScope.isDeclared("MyClass.prototype", false));
    assertTrue(globalScope.isDeclared("MyInterface", false));

    JSType classType = globalScope.getVar("MyClass").getType();
    assertNotNull(classType);
    assertTrue(classType.isConstructor());

    JSType ifaceType = globalScope.getVar("MyInterface").getType();
    assertNotNull(ifaceType);
    assertTrue(ifaceType.isInterface());
  }

  @Test
  public void testCreateScope_enumDeclarationAndElements() {
    String js = ""
        + "/** @enum {number} */\n"
        + "var StatusCode = {\n"
        + "  OK: 200,\n"
        + "  ERROR: 500\n"
        + "};\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("StatusCode", false));
    JSType enumType = globalScope.getVar("StatusCode").getType();
    assertNotNull(enumType);
    assertTrue(enumType.isEnumType());

    EnumType et = (EnumType) enumType;
    assertTrue(et.getElementsType().isNumber());
    assertTrue(et.hasOwnProperty("OK"));
    assertTrue(et.hasOwnProperty("ERROR"));
  }

  @Test
  public void testCreateScope_typedefDeclaration() {
    String js = ""
        + "/** @typedef {{name: string, age: number}} */\n"
        + "var PersonType;\n"
        + "/** @type {PersonType} */\n"
        + "var person;\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("person", false));
    JSType personType = globalScope.getVar("person").getType();
    assertNotNull(personType);
    assertTrue(personType.isRecordType() || personType.isObjectType());
  }

  @Test
  public void testCreateScope_stubDeclarations() {
    String js = ""
        + "var Foo = {};\n"
        + "Foo.bar;\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("Foo", false));
    assertTrue(globalScope.isDeclared("Foo.bar", false));
  }

  @Test
  public void testCreateScope_lendsAnnotationOnObjectLiteral() {
    String js = ""
        + "/** @constructor */\n"
        + "function ParentClass() {}\n"
        + "var obj = /** @lends {ParentClass.prototype} */ ({\n"
        + "  foo: function() { return 1; }\n"
        + "});\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("obj", false));
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testCreateScope_lendsAnnotationUnknownTarget_reportsWarning() {
    String js = ""
        + "var obj = /** @lends {NonExistent.prototype} */ ({\n"
        + "  foo: function() { return 1; }\n"
        + "});\n";

    Node root = parseWithErrors(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_lendsAnnotationNonObject_reportsWarning() {
    String js = ""
        + "var nonObj = 123;\n"
        + "var obj = /** @lends {nonObj} */ ({\n"
        + "  foo: function() { return 1; }\n"
        + "});\n";

    Node root = parseWithErrors(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_multipleVarDeclarationsWithDoc_reportsWarning() {
    String js = ""
        + "/** @type {number} */\n"
        + "var x = 1, y = 2;\n";

    Node root = parseWithErrors(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_googInherits() {
    String js = ""
        + "var goog = {};\n"
        + "goog.inherits = function(child, parent) {};\n"
        + "/** @constructor */\n"
        + "function SuperClass() {}\n"
        + "/** @constructor\n"
        + "  * @extends {SuperClass} */\n"
        + "function SubClass() {}\n"
        + "goog.inherits(SubClass, SuperClass);\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("SubClass", false));
    assertTrue(globalScope.isDeclared("SuperClass", false));

    FunctionType subType = globalScope.getVar("SubClass").getType().toMaybeFunctionType();
    assertNotNull(subType);
    FunctionType superType = globalScope.getVar("SuperClass").getType().toMaybeFunctionType();
    assertNotNull(superType);
    assertEquals(superType, subType.getSuperClassConstructor());
  }

  @Test
  public void testCreateScope_singletonGetter() {
    String js = ""
        + "var goog = {};\n"
        + "goog.addSingletonGetter = function(cls) {};\n"
        + "/** @constructor */\n"
        + "function Singleton() {}\n"
        + "goog.addSingletonGetter(Singleton);\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("Singleton", false));
    FunctionType singletonType = globalScope.getVar("Singleton").getType().toMaybeFunctionType();
    assertNotNull(singletonType);
    assertTrue(singletonType.hasProperty("getInstance"));
  }

  @Test
  public void testCreateScope_objectLiteralCast() {
    String js = ""
        + "var goog = {};\n"
        + "goog.reflect = {};\n"
        + "goog.reflect.object = function(type, obj) { return obj; };\n"
        + "/** @constructor */\n"
        + "function MyType() {}\n"
        + "var x = goog.reflect.object(MyType, { key: 1 });\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("x", false));
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testCreateScope_objectLiteralCastInvalid_reportsWarning() {
    String js = ""
        + "var goog = {};\n"
        + "goog.reflect = {};\n"
        + "goog.reflect.object = function(type, obj) { return obj; };\n"
        + "var x = goog.reflect.object(NonExistentType, { key: 1 });\n";

    Node root = parseWithErrors(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler, new GoogleCodingConvention());
    creator.createScope(root, null);

    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCreateScope_windowConstructorAlias() {
    String js = ""
        + "/** @constructor */\n"
        + "function Window() {}\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("Window", false));
  }

  @Test
  public void testCreateScope_bleedingFunctionExpression() {
    String js = ""
        + "var f = function myBleedingName() {\n"
        + "  return myBleedingName;\n"
        + "};\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node fnNode = root.getFirstChild().getFirstChild().getFirstChild();
    Scope localScope = creator.createScope(fnNode, globalScope);

    assertTrue(localScope.isDeclared("myBleedingName", false));
  }

  @Test
  public void testCreateScope_escapedVariablesAnalysis() {
    String js = ""
        + "function outer() {\n"
        + "  var x = 1;\n"
        + "  function inner() {\n"
        + "    x = 2;\n"
        + "    return x;\n"
        + "  }\n"
        + "  return inner;\n"
        + "}\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node outerFn = root.getFirstChild();
    Scope outerScope = creator.createScope(outerFn, globalScope);

    Scope.Var xVar = outerScope.getVar("x");
    assertNotNull(xVar);
    assertTrue(xVar.isEscaped());
  }

  @Test
  public void testCreateScope_redeclaredVariableInSameScope() {
    String js = ""
        + "var a = 1;\n"
        + "var a = 2;\n";

    Node root = parseWithErrors(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("a", false));
  }

  @Test
  public void testPatchGlobalScope_replacesOldDeclarations() {
    String js = "var oldVar = 1;";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("oldVar", false));

    String updatedJs = "var newVar = 2;";
    Node scriptRoot = compiler.parseTestCode(updatedJs);
    creator.patchGlobalScope(globalScope, scriptRoot);

    assertFalse(globalScope.isDeclared("oldVar", false));
    assertTrue(globalScope.isDeclared("newVar", false));
  }

  @Test(expected = IllegalStateException.class)
  public void testPatchGlobalScope_nonScriptNodeThrowsException() {
    String js = "var x = 1;";
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    Node nonScript = new Node(com.google.javascript.rhino.Token.BLOCK);
    creator.patchGlobalScope(globalScope, nonScript);
  }

  @Test(expected = NullPointerException.class)
  public void testPatchGlobalScope_nullScopeThrowsException() {
    Node scriptRoot = parse("var x = 1;");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.patchGlobalScope(null, scriptRoot);
  }

  @Test
  public void testCreateScope_constOrIdiomInitialization() {
    String js = ""
        + "/** @const */ var goog = goog || {};\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("goog", false));
  }

  @Test
  public void testCreateScope_prototypeAssignmentToObjectLit() {
    String js = ""
        + "/** @constructor */\n"
        + "function MyClass() {}\n"
        + "MyClass.prototype = {\n"
        + "  sayHello: function() { return 'hello'; }\n"
        + "};\n";

    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);

    assertTrue(globalScope.isDeclared("MyClass", false));
    assertTrue(globalScope.isDeclared("MyClass.prototype", false));
    assertTrue(globalScope.isDeclared("MyClass.prototype.sayHello", false));
  }
}
