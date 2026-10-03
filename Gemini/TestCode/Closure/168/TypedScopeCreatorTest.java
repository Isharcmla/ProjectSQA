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
    options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);
    compiler.initOptions(options);
  }

  private Scope buildGlobalScope(String js) {
    return buildGlobalScope("", js);
  }

  private Scope buildGlobalScope(String externsJs, String js) {
    Node externsRoot = parseCode("externs.js", externsJs, true);
    Node mainRoot = parseCode("testcode.js", js, false);
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK, externsRoot, mainRoot);
    root.setIsSyntheticBlock(true);

    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    return scopeCreator.createScope(root, null);
  }

  private Node parseCode(String filename, String js, boolean isExtern) {
    SourceFile file = isExtern ? SourceFile.fromCode(filename, js) : SourceFile.fromCode(filename, js);
    CompilerInput input = new CompilerInput(file, isExtern);
    Node script = input.getAstRoot(compiler);
    if (script == null) {
      CompilerOptions options = new CompilerOptions();
      CompilerInput compilerInput = new CompilerInput(SourceFile.fromCode(filename, js), isExtern);
      JsAst ast = new JsAst(SourceFile.fromCode(filename, js));
      script = ast.getAstRoot(compiler);
    }
    return script;
  }

  @Test
  public void testCreateScope_globalLiterals_typesAttached() {
    String js = "var n = 123;\n" +
                "var s = 'hello';\n" +
                "var b = true;\n" +
                "var bf = false;\n" +
                "var nl = null;\n" +
                "var u = void 0;\n" +
                "var r = /abc/;\n" +
                "var o = {};\n";
    Scope scope = buildGlobalScope(js);

    assertNotNull(scope.getVar("n"));
    assertEquals(compiler.getTypeRegistry().getNativeType(JSTypeNative.NUMBER_TYPE), scope.getVar("n").getType());
    assertEquals(compiler.getTypeRegistry().getNativeType(JSTypeNative.STRING_TYPE), scope.getVar("s").getType());
    assertEquals(compiler.getTypeRegistry().getNativeType(JSTypeNative.BOOLEAN_TYPE), scope.getVar("b").getType());
    assertEquals(compiler.getTypeRegistry().getNativeType(JSTypeNative.BOOLEAN_TYPE), scope.getVar("bf").getType());
    assertEquals(compiler.getTypeRegistry().getNativeType(JSTypeNative.NULL_TYPE), scope.getVar("nl").getType());
    assertEquals(compiler.getTypeRegistry().getNativeType(JSTypeNative.VOID_TYPE), scope.getVar("u").getType());
    assertEquals(compiler.getTypeRegistry().getNativeType(JSTypeNative.REGEXP_TYPE), scope.getVar("r").getType());
    assertTrue(scope.getVar("o").getType().isAnonymousObjectType());
  }

  @Test
  public void testCreateScope_functionDeclarationAndLocalScope_success() {
    String js = "/**\n" +
                " * @param {number} x\n" +
                " * @return {string}\n" +
                " */\n" +
                "function foo(x) {\n" +
                "  var local = 'result: ' + x;\n" +
                "  try {\n" +
                "    return local;\n" +
                "  } catch (e) {\n" +
                "    return '';\n" +
                "  }\n" +
                "}\n";
    Node mainRoot = parseCode("testcode.js", js, false);
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK, new Node(com.google.javascript.rhino.Token.BLOCK), mainRoot);
    root.setIsSyntheticBlock(true);

    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(root, null);

    assertNotNull(globalScope.getVar("foo"));
    FunctionType fnType = globalScope.getVar("foo").getType().toMaybeFunctionType();
    assertNotNull(fnType);

    Node fnNode = mainRoot.getFirstChild();
    Scope localScope = scopeCreator.createScope(fnNode, globalScope);

    assertNotNull(localScope.getVar("x"));
    assertEquals(compiler.getTypeRegistry().getNativeType(JSTypeNative.NUMBER_TYPE), localScope.getVar("x").getType());
    assertNotNull(localScope.getVar("local"));
    assertNotNull(localScope.getVar("e"));
  }

  @Test
  public void testCreateScope_constructorAndPrototypeProperties_success() {
    String js = "/** @constructor */\n" +
                "function Foo() {\n" +
                "  /** @type {number} */\n" +
                "  this.bar = 42;\n" +
                "}\n" +
                "Foo.prototype.baz = 'str';\n";
    Scope scope = buildGlobalScope(js);

    Scope.Var fooVar = scope.getVar("Foo");
    assertNotNull(fooVar);
    FunctionType fooType = fooVar.getType().toMaybeFunctionType();
    assertTrue(fooType.isConstructor());

    assertNotNull(scope.getVar("Foo.prototype"));
    assertNotNull(scope.getVar("Foo.prototype.baz"));

    ObjectType instanceType = fooType.getInstanceType();
    assertTrue(instanceType.hasProperty("bar"));
  }

  @Test
  public void testCreateScope_enumDeclaration_success() {
    String js = "/** @enum {string} */\n" +
                "var MyEnum = {\n" +
                "  FIRST: 'first',\n" +
                "  SECOND: 'second'\n" +
                "};\n";
    Scope scope = buildGlobalScope(js);

    Scope.Var enumVar = scope.getVar("MyEnum");
    assertNotNull(enumVar);
    assertTrue(enumVar.getType().isEnumType());
    EnumType enumType = (EnumType) enumVar.getType();
    assertTrue(enumType.getElements().contains("FIRST"));
    assertTrue(enumType.getElements().contains("SECOND"));
  }

  @Test
  public void testCreateScope_typedefDeclaration_success() {
    String js = "/** @typedef {{x: number, y: number}} */\n" +
                "var Point;\n";
    Scope scope = buildGlobalScope(js);
    JSType pointType = compiler.getTypeRegistry().getType("Point");
    assertNotNull(pointType);
    assertTrue(pointType.isRecordType());
  }

  @Test
  public void testCreateScope_lendsAnnotation_success() {
    String js = "/** @constructor */\n" +
                "function Foo() {}\n" +
                "var mixin = /** @lends {Foo.prototype} */ ({\n" +
                "  propA: 1,\n" +
                "  methodB: function() {}\n" +
                "});\n";
    Scope scope = buildGlobalScope(js);
    Scope.Var fooVar = scope.getVar("Foo");
    FunctionType fooType = fooVar.getType().toMaybeFunctionType();
    ObjectType protoType = fooType.getPrototype();
    assertTrue(protoType.hasProperty("propA"));
    assertTrue(protoType.hasProperty("methodB"));
  }

  @Test
  public void testCreateScope_subclassInheritance_closureStyle() {
    String js = "/** @constructor */\n" +
                "function SuperClass() {}\n" +
                "/** @constructor */\n" +
                "function SubClass() {}\n" +
                "goog.inherits(SubClass, SuperClass);\n";

    CodingConvention convention = new ClosureCodingConvention();
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, convention);

    Node mainRoot = parseCode("testcode.js", js, false);
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK, new Node(com.google.javascript.rhino.Token.BLOCK), mainRoot);
    root.setIsSyntheticBlock(true);

    Scope scope = scopeCreator.createScope(root, null);
    FunctionType subCtor = scope.getVar("SubClass").getType().toMaybeFunctionType();
    FunctionType superCtor = scope.getVar("SuperClass").getType().toMaybeFunctionType();

    assertEquals(superCtor.getInstanceType(), subCtor.getSuperClassConstructor().getInstanceType());
  }

  @Test
  public void testCreateScope_singletonGetter_closureStyle() {
    String js = "/** @constructor */\n" +
                "function Singleton() {}\n" +
                "goog.addSingletonGetter(Singleton);\n";

    CodingConvention convention = new ClosureCodingConvention();
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler, convention);

    Node mainRoot = parseCode("testcode.js", js, false);
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK, new Node(com.google.javascript.rhino.Token.BLOCK), mainRoot);
    root.setIsSyntheticBlock(true);

    Scope scope = scopeCreator.createScope(root, null);
    Scope.Var singletonVar = scope.getVar("Singleton");
    FunctionType ctor = singletonVar.getType().toMaybeFunctionType();
    assertTrue(ctor.hasProperty("getInstance"));
  }

  @Test
  public void testPatchGlobalScope_success() {
    String jsOriginal = "var a = 10; var b = 20;";
    String jsModified = "var a = 30; var c = 40;";

    Node externsRoot = parseCode("externs.js", "", true);
    Node originalScript = parseCode("script.js", jsOriginal, false);
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK, externsRoot, originalScript);
    root.setIsSyntheticBlock(true);

    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(root, null);

    assertNotNull(globalScope.getVar("a"));
    assertNotNull(globalScope.getVar("b"));
    assertNull(globalScope.getVar("c"));

    Node modifiedScript = parseCode("script.js", jsModified, false);
    scopeCreator.patchGlobalScope(globalScope, modifiedScript);

    assertNotNull(globalScope.getVar("a"));
    assertNull(globalScope.getVar("b"));
    assertNotNull(globalScope.getVar("c"));
  }

  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK);
    Scope scope = scopeCreator.createInitialScope(root);

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
  public void testWarnings_unknownLends_reportsWarning() {
    String js = "var obj = /** @lends {NonExistentClass.prototype} */ ({ prop: 1 });";
    buildGlobalScope(js);
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarnings_lendsOnNonObject_reportsWarning() {
    String js = "var num = 5;\n" +
                "var obj = /** @lends {num} */ ({ prop: 1 });";
    buildGlobalScope(js);
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarnings_multipleVarDefWithJSDoc_reportsWarning() {
    String js = "/** @type {number} */ var a = 1, b = 2;";
    buildGlobalScope(js);
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarnings_uninitializedConstructor_reportsWarning() {
    String js = "/** @constructor */ var MyClass;";
    buildGlobalScope(js);
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarnings_uninitializedInterface_reportsWarning() {
    String js = "/** @interface */ var MyInterface;";
    buildGlobalScope(js);
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testWarnings_invalidEnumInitializer_reportsWarning() {
    String js = "/** @enum {number} */ var MyEnum = 5;";
    buildGlobalScope(js);
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test(expected = IllegalStateException.class)
  public void testPatchGlobalScope_nonScriptNode_throwsException() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node nonScript = new Node(com.google.javascript.rhino.Token.VAR);
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK);
    Scope globalScope = scopeCreator.createInitialScope(root);
    scopeCreator.patchGlobalScope(globalScope, nonScript);
  }

  @Test(expected = NullPointerException.class)
  public void testPatchGlobalScope_nullGlobalScope_throwsException() {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Node script = new Node(com.google.javascript.rhino.Token.SCRIPT);
    scopeCreator.patchGlobalScope(null, script);
  }
}
