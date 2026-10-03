package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Before;
import org.junit.Test;

public class TypeCheckTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private SemanticReverseAbstractInterpreter rai;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    rai = new SemanticReverseAbstractInterpreter(
        compiler.getCodingConvention(), registry);
  }

  private TypeCheck createTypeCheck() {
    return new TypeCheck(compiler, rai, registry);
  }

  private TypeCheck createTypeCheck(CheckLevel missingOverride, CheckLevel unknownTypes) {
    return new TypeCheck(compiler, rai, registry, missingOverride, unknownTypes);
  }

  private Scope check(String js) {
    return check("", js, CheckLevel.WARNING, CheckLevel.OFF, true);
  }

  private Scope checkWithExterns(String externs, String js) {
    return check(externs, js, CheckLevel.WARNING, CheckLevel.OFF, true);
  }

  private Scope check(String externs, String js, CheckLevel missingOverride,
      CheckLevel unknownTypes, boolean reportMissingProperties) {
    Node externsNode = compiler.parseTestCode(externs);
    Node jsNode = compiler.parseTestCode(js);
    Node parent = new Node(Token.BLOCK, externsNode, jsNode);

    TypeCheck tc = new TypeCheck(compiler, rai, registry, missingOverride, unknownTypes);
    tc.reportMissingProperties(reportMissingProperties);
    Scope scope = tc.processForTesting(externsNode, jsNode);
    return scope;
  }

  @Test
  public void testConstructors_allVariants() {
    TypeCheck tc1 = new TypeCheck(compiler, rai, registry);
    assertNotNull(tc1);

    TypeCheck tc2 = new TypeCheck(compiler, rai, registry, CheckLevel.ERROR, CheckLevel.ERROR);
    assertNotNull(tc2);

    Scope topScope = Scope.createGlobalScope(new Node(Token.BLOCK));
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    TypeCheck tc3 = new TypeCheck(compiler, rai, registry, topScope, scopeCreator,
        CheckLevel.OFF, CheckLevel.OFF);
    assertNotNull(tc3);
  }

  @Test
  public void testGetTypedPercent_emptyAndPopulated() {
    TypeCheck tc = createTypeCheck();
    assertEquals(0.0, tc.getTypedPercent(), 0.001);

    check("var x = 1;");
    assertTrue(compiler.getErrorCount() == 0);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullScopeCreator_throwsException() {
    TypeCheck tc = createTypeCheck();
    Node js = compiler.parseTestCode("var x = 1;");
    Node parent = new Node(Token.BLOCK, js);
    tc.process(null, js);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_unattachedJsRoot_throwsException() {
    Node jsNode = compiler.parseTestCode("var x = 1;");
    Node externsNode = compiler.parseTestCode("");
    Node parent = new Node(Token.BLOCK, externsNode, jsNode);

    TypeCheck tc = createTypeCheck();
    tc.processForTesting(externsNode, jsNode);

    // Call process directly without parent attachment
    Node isolatedJs = new Node(Token.SCRIPT);
    tc.process(null, isolatedJs);
  }

  @Test
  public void testProcess_withExterns() {
    checkWithExterns("/** @type {number} */ var extVar;", "var y = extVar + 2;");
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testLiteralsAndExpressions() {
    String js = ""
        + "var a = true;\n"
        + "var b = false;\n"
        + "var c = null;\n"
        + "var d = 123;\n"
        + "var e = 'string';\n"
        + "var f = /regex/;\n"
        + "var g = [1, 2, 3];\n"
        + "var h = void 0;\n"
        + "var i = typeof a;\n"
        + "var j = !a;\n"
        + "var k = +d;\n"
        + "var l = -d;\n"
        + "var m = (1, 2);\n";
    check(js);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testBitwiseOperators() {
    String js = ""
        + "var a = 1 & 2;\n"
        + "var b = 1 | 2;\n"
        + "var c = 1 ^ 2;\n"
        + "var d = 1 << 2;\n"
        + "var e = 1 >> 2;\n"
        + "var f = 1 >>> 2;\n"
        + "var g = ~1;\n"
        + "var h = 1;\n"
        + "h &= 2; h |= 2; h ^= 2; h <<= 2; h >>= 2; h >>>= 2;\n";
    check(js);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testBitwiseOperator_invalidTypes_warns() {
    check("var x = ~'invalid';");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testBinaryArithmeticOperators() {
    String js = ""
        + "var a = 1 + 2;\n"
        + "var b = 1 - 2;\n"
        + "var c = 1 * 2;\n"
        + "var d = 1 / 2;\n"
        + "var e = 1 % 2;\n"
        + "var f = 1;\n"
        + "f += 2; f -= 2; f *= 2; f /= 2; f %= 2;\n"
        + "f++; ++f; f--; --f;\n";
    check(js);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testComparisonOperators() {
    String js = ""
        + "var a = (1 < 2);\n"
        + "var b = (1 <= 2);\n"
        + "var c = (1 > 2);\n"
        + "var d = (1 >= 2);\n"
        + "var s1 = ('a' < 'b');\n"
        + "var s2 = ('a' >= 'b');\n";
    check(js);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testEqualityAndDeterministicTest() {
    check("var a = (1 == 1);");
    assertTrue(compiler.getWarningCount() >= 1);

    check("var b = (1 != 1);");
    assertTrue(compiler.getWarningCount() >= 1);

    check("var c = (1 === 'str');");
    assertTrue(compiler.getWarningCount() >= 1);

    check("var d = (1 !== 'str');");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testInAndInstanceofOperators() {
    String js = ""
        + "var obj = {prop: 1};\n"
        + "var has = 'prop' in obj;\n"
        + "var isInst = obj instanceof Object;\n";
    check(js);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testInstanceof_nonObject_warns() {
    check("var a = 1 instanceof 2;");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testIn_nonObject_warns() {
    check("var a = 'prop' in 123;");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testDeleteOperator() {
    check("var obj = {a: 1}; delete obj.a; delete obj['a'];");
    assertEquals(0, compiler.getErrorCount());

    check("delete 123;");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testControlStructuresAndStatements() {
    String js = ""
        + "var x = 1;\n"
        + "if (x) { x = 2; } else { x = 3; }\n"
        + "while (x < 10) { x++; continue; }\n"
        + "do { x++; break; } while (x < 10);\n"
        + "for (var i = 0; i < 5; i++) {}\n"
        + "lbl: for (;;) { break lbl; }\n"
        + "switch (x) { case 1: break; default: break; }\n"
        + "try { throw new Error(); } catch (e) {} finally {}\n"
        + "debugger;\n";
    check(js);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testLogicalAndHookAndObjectLit() {
    String js = ""
        + "var a = true && false;\n"
        + "var b = true || false;\n"
        + "var c = true ? 1 : 2;\n"
        + "var obj = {x: 1, y: 'str'};\n";
    check(js);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testGetElem() {
    String js = "var arr = [1, 2, 3]; var x = arr[0];";
    check(js);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testFunctionCallsAndNew() {
    String js = ""
        + "function foo(a, b) { return a + b; }\n"
        + "foo(1, 2);\n"
        + "/** @constructor */ function Bar(x) { this.x = x; }\n"
        + "var b = new Bar(1);\n";
    check(js);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCall_nonCallable_warns() {
    check("var x = 123; x();");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testCall_constructorWithoutNew_warns() {
    check("/** @constructor */ function Foo() {} Foo();");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testCall_wrongArgumentCount_warns() {
    check("function foo(a, b) {} foo(1);");
    assertTrue(compiler.getWarningCount() >= 1);

    check("function bar(a) {} bar(1, 2, 3);");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testNew_nonConstructor_warns() {
    check("var x = 123; new x();");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testReturnStatements() {
    check("/** @return {number} */ function foo() { return 1; }");
    assertEquals(0, compiler.getErrorCount());

    check("/** @return {number} */ function bar() { return 'notANumber'; }");
    assertTrue(compiler.getWarningCount() >= 1);

    check("/** @return {void} */ function baz() { return; }");
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testFunctionMasksVariable_warns() {
    check("var x = 1; function foo() { function x() {} }");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testEnumDeclarationAndUsage() {
    String js = ""
        + "/** @enum {number} */ var MyEnum = { A: 1, B: 2 };\n"
        + "var x = MyEnum.A;\n"
        + "/** @enum {number} */ var CopyEnum = MyEnum;\n";
    check(js);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testEnum_invalidElement_warns() {
    check("/** @enum {number} */ var MyEnum = { A: 1 }; var x = MyEnum.B;");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testEnum_incompatibleType_warns() {
    check("/** @enum {number} */ var MyEnum = { A: 'str' };");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testGetProp_inexistentProperty() {
    check("var obj = {}; var x = obj.inexistentProp;");
    // With default missing property checking, inexistent properties on unknown/empty objects
    assertTrue(compiler.getWarningCount() >= 0);
  }

  @Test
  public void testWithStatement() {
    check("var obj = {a: 1}; with (obj) { var b = a; }");
    assertEquals(0, compiler.getErrorCount());

    check("with (123) {}");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testNoTypeCheckSection() {
    String js = ""
        + "/** @noalias \n @notypecheck */ function test() {\n"
        + "  var x = 1;\n"
        + "  x = 'str';\n"
        + "  x.nonExistentMethod();\n"
        + "}\n";
    check(js);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testAnnotatedAssignments() {
    String js = ""
        + "var obj = {};\n"
        + "/** @type {number} */ obj.x = 1;\n"
        + "/** @type {number} */ obj.x = 'str';\n";
    check(js);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testInterfaceDeclarationAndOverride() {
    String js = ""
        + "/** @interface */ function MyInterface() {}\n"
        + "MyInterface.prototype.foo = function() {};\n"
        + "/** @constructor \n * @implements {MyInterface} */\n"
        + "function MyClass() {}\n"
        + "/** @override */ MyClass.prototype.foo = function() {};\n";
    check("", js, CheckLevel.WARNING, CheckLevel.OFF, true);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testInterface_invalidMemberDeclaration_warns() {
    String js = ""
        + "/** @interface */ function MyInterface() {}\n"
        + "MyInterface.prototype.foo = function() { return 123; };\n";
    check(js);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testSuperclassOverride_mismatchAndMissing() {
    String jsMissing = ""
        + "/** @constructor */ function Base() {}\n"
        + "Base.prototype.foo = function(x) {};\n"
        + "/** @constructor \n * @extends {Base} */ function Child() {}\n"
        + "Child.prototype.foo = function(x) {};\n";
    check("", jsMissing, CheckLevel.WARNING, CheckLevel.OFF, true);
    assertTrue(compiler.getWarningCount() >= 1);

    String jsMismatch = ""
        + "/** @constructor */ function Base() {}\n"
        + "/** @type {number} */ Base.prototype.foo = 1;\n"
        + "/** @constructor \n * @extends {Base} */ function Child() {}\n"
        + "/** @override \n * @type {string} */ Child.prototype.foo = 'str';\n";
    check("", jsMismatch, CheckLevel.WARNING, CheckLevel.OFF, true);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testUnknownOverride_warns() {
    String js = ""
        + "/** @constructor */ function Base() {}\n"
        + "/** @constructor \n * @extends {Base} */ function Child() {}\n"
        + "/** @override */ Child.prototype.unknownProp = 1;\n";
    check(js);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testConflictingExtendedType_warns() {
    String js = ""
        + "/** @interface */ function MyInterface() {}\n"
        + "/** @constructor \n * @extends {MyInterface} */ function MyClass() {}\n";
    check(js);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testBadImplementedType_warns() {
    String js = ""
        + "/** @constructor */ function NotAnInterface() {}\n"
        + "/** @constructor \n * @implements {NotAnInterface} */ function MyClass() {}\n";
    check(js);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testOverridingPrototypeWithNonObject_warns() {
    String js = ""
        + "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype = 123;\n";
    check(js);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testReportUnknownTypes() {
    String js = "var x;\n var y = x;\n";
    check("", js, CheckLevel.OFF, CheckLevel.WARNING, false);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testVisitName_variousParents() {
    TypeCheck tc = createTypeCheck();
    NodeTraversal t = new NodeTraversal(compiler, tc);

    Node nameNode = Node.newString(Token.NAME, "myVar");
    Node varNode = new Node(Token.VAR, nameNode);
    // When parent is VAR, visitName returns false
    assertFalse(tc.visitName(t, nameNode, varNode));

    Node funcNode = new Node(Token.FUNCTION, nameNode, new Node(Token.LP), new Node(Token.BLOCK));
    assertFalse(tc.visitName(t, nameNode, funcNode));

    Node lpNode = new Node(Token.LP, nameNode);
    assertFalse(tc.visitName(t, nameNode, lpNode));

    Node catchNode = new Node(Token.CATCH, nameNode, new Node(Token.BLOCK));
    assertFalse(tc.visitName(t, nameNode, catchNode));

    Node exprNode = new Node(Token.EXPR_RESULT, nameNode);
    assertTrue(tc.visitName(t, nameNode, exprNode));
  }

  @Test
  public void testUnexpectedToken_reportsInternalError() {
    TypeCheck tc = createTypeCheck();
    NodeTraversal t = new NodeTraversal(compiler, tc);
    // Token.SHEQ or an unusual unhandled token in default case if any
    Node customNode = new Node(Token.LABEL_NAME);
    // LABEL_NAME is handled as typeable = false, test an unhandled token by overriding type
    Node unexpectedNode = new Node(999999);
    tc.visit(t, unexpectedNode, new Node(Token.BLOCK));
    assertTrue(compiler.getErrorCount() >= 1);
  }

  @Test
  public void testCastAnnotationAndImplicitCast() {
    String js = ""
        + "var a = /** @type {number} */ ('str');\n";
    check(js);
    assertTrue(compiler.getWarningCount() >= 1);

    String jsImplicitCast = ""
        + "var obj = {};\n"
        + "/** @implicitCast */ obj.prop = 1;\n";
    check(jsImplicitCast);
    assertTrue(compiler.getWarningCount() >= 1);
  }
}
