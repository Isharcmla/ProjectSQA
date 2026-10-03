package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

public class TypeCheckTest {

  private Compiler compiler;
  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
    compiler.init(
        Collections.<SourceFile>emptyList(),
        Collections.<SourceFile>emptyList(),
        options);
    registry = compiler.getTypeRegistry();
  }

  private Scope testAndCheck(String externsJs, String js) {
    Node externsRoot = compiler.parseTestCode(externsJs);
    Node jsRoot = compiler.parseTestCode(js);
    Node parent = new Node(Token.BLOCK, externsRoot, jsRoot);

    TypeCheck tc = new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry,
        CheckLevel.WARNING,
        CheckLevel.WARNING);

    return tc.processForTesting(externsRoot, jsRoot);
  }

  private TypeCheck createTypeCheckInstance(CheckLevel missingOverride, CheckLevel unknownTypes) {
    return new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry,
        missingOverride,
        unknownTypes);
  }

  @Test
  public void testConstructors_allVariants_instantiateCorrectly() {
    TypeCheck tc1 = new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry);
    Assert.assertNotNull(tc1);

    TypeCheck tc2 = new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry,
        CheckLevel.ERROR,
        CheckLevel.ERROR);
    Assert.assertNotNull(tc2);

    TypeCheck tc3 = new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry,
        null,
        null,
        CheckLevel.OFF,
        CheckLevel.OFF);
    Assert.assertNotNull(tc3);
  }

  @Test
  public void testReportMissingProperties_chaining_returnsSelf() {
    TypeCheck tc = createTypeCheckInstance(CheckLevel.WARNING, CheckLevel.WARNING);
    TypeCheck returned = tc.reportMissingProperties(false);
    Assert.assertSame(tc, returned);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullScopeCreator_throwsException() {
    TypeCheck tc = createTypeCheckInstance(CheckLevel.OFF, CheckLevel.OFF);
    Node jsRoot = compiler.parseTestCode("var a = 1;");
    Node externsRoot = compiler.parseTestCode("");
    new Node(Token.BLOCK, externsRoot, jsRoot);
    tc.process(externsRoot, jsRoot);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcessForTesting_nullParent_throwsException() {
    TypeCheck tc = createTypeCheckInstance(CheckLevel.OFF, CheckLevel.OFF);
    Node jsRoot = compiler.parseTestCode("var a = 1;");
    Node externsRoot = compiler.parseTestCode("");
    tc.processForTesting(externsRoot, jsRoot);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcessForTesting_calledTwice_throwsException() {
    Node jsRoot = compiler.parseTestCode("var a = 1;");
    Node externsRoot = compiler.parseTestCode("");
    new Node(Token.BLOCK, externsRoot, jsRoot);

    TypeCheck tc = createTypeCheckInstance(CheckLevel.OFF, CheckLevel.OFF);
    tc.processForTesting(externsRoot, jsRoot);
    tc.processForTesting(externsRoot, jsRoot);
  }

  @Test(expected = NullPointerException.class)
  public void testCheck_nullNode_throwsException() {
    TypeCheck tc = createTypeCheckInstance(CheckLevel.OFF, CheckLevel.OFF);
    tc.check(null, false);
  }

  @Test
  public void testGetTypedPercent_initialState_returnsZero() {
    TypeCheck tc = createTypeCheckInstance(CheckLevel.OFF, CheckLevel.OFF);
    Assert.assertEquals(0.0, tc.getTypedPercent(), 0.001);
  }

  @Test
  public void testGetTypedPercent_typedCode_returnsPositivePercentage() {
    Node externsRoot = compiler.parseTestCode("");
    Node jsRoot = compiler.parseTestCode("var x = 1; var y = 'hello';");
    new Node(Token.BLOCK, externsRoot, jsRoot);

    TypeCheck tc = createTypeCheckInstance(CheckLevel.OFF, CheckLevel.OFF);
    tc.processForTesting(externsRoot, jsRoot);
    Assert.assertTrue(tc.getTypedPercent() > 0.0);
  }

  @Test
  public void testVisitLiteralsAndExpressions_success() {
    String js = ""
        + "var b1 = true;\n"
        + "var b2 = false;\n"
        + "var n = 123;\n"
        + "var s = 'abc';\n"
        + "var nu = null;\n"
        + "var arr = [1, 2];\n"
        + "var r = /abc/;\n"
        + "var c = (1, 2);\n"
        + "var v = void 0;\n"
        + "var t = typeof 'str';\n"
        + "var not = !true;\n"
        + "var pos = +1;\n"
        + "var neg = -1;\n"
        + "var inc = 1; inc++;\n"
        + "var dec = 1; dec--;\n";
    Scope scope = testAndCheck("", js);
    Assert.assertNotNull(scope);
  }

  @Test
  public void testVisitBinaryOperators_numericAndBitwise_success() {
    String js = ""
        + "var a = 1 + 2;\n"
        + "var b = 1 - 2;\n"
        + "var c = 1 * 2;\n"
        + "var d = 1 / 2;\n"
        + "var e = 1 % 2;\n"
        + "var f = 1 & 2;\n"
        + "var g = 1 | 2;\n"
        + "var h = 1 ^ 2;\n"
        + "var i = 1 << 2;\n"
        + "var j = 1 >> 2;\n"
        + "var k = 1 >>> 2;\n"
        + "a += 1; b -= 1; c *= 1; d /= 1; e %= 1;\n"
        + "f &= 1; g |= 1; h ^= 1; i <<= 1; j >>= 1; k >>>= 1;\n";
    Scope scope = testAndCheck("", js);
    Assert.assertNotNull(scope);
  }

  @Test
  public void testVisitComparisons_variousTypes_success() {
    String js = ""
        + "var eq1 = (1 == 2);\n"
        + "var eq2 = (1 != 2);\n"
        + "var seq1 = (1 === 2);\n"
        + "var seq2 = (1 !== '2');\n"
        + "var lt = 1 < 2;\n"
        + "var le = 1 <= 2;\n"
        + "var gt = 1 > 2;\n"
        + "var ge = 1 >= 2;\n"
        + "var slt = 'a' < 'b';\n"
        + "var inOp = 'prop' in {};\n"
        + "var instOp = ({}) instanceof Object;\n"
        + "var delOp = delete ({}).prop;\n";
    Scope scope = testAndCheck("", js);
    Assert.assertNotNull(scope);
  }

  @Test
  public void testVisitControlFlowAndMiscellaneousNodes_success() {
    String js = ""
        + "label: for (var i = 0; i < 10; i++) {\n"
        + "  if (i === 5) continue label;\n"
        + "  if (i === 8) break;\n"
        + "}\n"
        + "var j = 0;\n"
        + "while (j < 5) { j++; }\n"
        + "do { j--; } while (j > 0);\n"
        + "switch (j) {\n"
        + "  case 0: break;\n"
        + "  default: break;\n"
        + "}\n"
        + "try { throw new Error('err'); } catch (e) {}\n"
        + "debugger;\n";
    Scope scope = testAndCheck("", js);
    Assert.assertNotNull(scope);
  }

  @Test
  public void testVisitLogicalAndTernary_success() {
    String js = ""
        + "var a = true && false;\n"
        + "var b = false || true;\n"
        + "var c = true ? 1 : 2;\n";
    Scope scope = testAndCheck("", js);
    Assert.assertNotNull(scope);
  }

  @Test
  public void testVisitFunctionAndCalls_withArguments_success() {
    String js = ""
        + "/** @param {number} x\n"
        + "  * @return {number} */\n"
        + "function foo(x) { return x + 1; }\n"
        + "foo(5);\n"
        + "/** @constructor */\n"
        + "function MyClass() {}\n"
        + "var obj = new MyClass();\n";
    Scope scope = testAndCheck("", js);
    Assert.assertNotNull(scope);
  }

  @Test
  public void testVisitFunction_constructorNotCallable_reportsWarning() {
    String js = ""
        + "/** @constructor */\n"
        + "function MyClass() {}\n"
        + "MyClass();\n";
    testAndCheck("", js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testVisitNew_notAConstructor_reportsWarning() {
    String js = "var x = 123; new x();\n";
    testAndCheck("", js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testVisitBitwise_badOperandType_reportsWarning() {
    String js = "var a = ~'not_a_number';\n";
    testAndCheck("", js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testCheckTypeofString_invalidTypeofValue_reportsWarning() {
    String js = "var x = (typeof 1 === 'invalid_type');\n";
    testAndCheck("", js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testFunctionMasksVariable_reportsWarning() {
    String js = ""
        + "var f = 123;\n"
        + "function f() {}\n";
    testAndCheck("", js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testNoTypeCheckAnnotation_suppressesWarnings() {
    String js = ""
        + "/** @noTypeCheck */\n"
        + "function bad() {\n"
        + "  /** @type {number} */ var x = 'string';\n"
        + "}\n";
    testAndCheck("", js);
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testInterfaces_emptyMethodAndInheritance_success() {
    String js = ""
        + "/** @interface */\n"
        + "function MyInterface() {}\n"
        + "MyInterface.prototype.doSomething = function() {};\n"
        + "/** @constructor\n"
        + "  * @implements {MyInterface} */\n"
        + "function MyImpl() {}\n"
        + "/** @override */\n"
        + "MyImpl.prototype.doSomething = function() {};\n";
    Scope scope = testAndCheck("", js);
    Assert.assertNotNull(scope);
  }

  @Test
  public void testInterfaceFunctionNotEmpty_reportsWarning() {
    String js = ""
        + "/** @interface */\n"
        + "function BadInterface() {}\n"
        + "BadInterface.prototype.badMethod = function() { return 1; };\n";
    testAndCheck("", js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testConflictingExtendedType_interfaceImplements_reportsWarning() {
    String js = ""
        + "/** @interface */\n"
        + "function InterfaceA() {}\n"
        + "/** @interface\n"
        + "  * @implements {InterfaceA} */\n"
        + "function InterfaceB() {}\n";
    testAndCheck("", js);
    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testEnumChecking_andAliasing_success() {
    String js = ""
        + "/** @enum {number} */\n"
        + "var Numbers = { ONE: 1, TWO: 2 };\n"
        + "var one = Numbers.ONE;\n"
        + "/** @enum {number} */\n"
        + "var NumbersAlias = Numbers;\n";
    Scope scope = testAndCheck("", js);
    Assert.assertNotNull(scope);
  }

  @Test
  public void testVisitName_untypedAndScopeLookups_success() {
    Node externsRoot = compiler.parseTestCode("");
    Node jsRoot = compiler.parseTestCode("var a = 1; a;");
    Node block = new Node(Token.BLOCK, externsRoot, jsRoot);

    TypeCheck tc = createTypeCheckInstance(CheckLevel.OFF, CheckLevel.OFF);
    tc.processForTesting(externsRoot, jsRoot);

    Node nameNode = new Node(Token.NAME);
    nameNode.setString("a");
    NodeTraversal t = new NodeTraversal(compiler, tc);
    boolean typeable = tc.visitName(t, nameNode, block);
    Assert.assertTrue(typeable);
  }

  @Test
  public void testVisitName_withinVarOrFunctionOrParamList_returnsFalse() {
    TypeCheck tc = createTypeCheckInstance(CheckLevel.OFF, CheckLevel.OFF);
    Node nameNode = new Node(Token.NAME);
    nameNode.setString("param");

    Node paramListNode = new Node(Token.PARAM_LIST, nameNode);
    NodeTraversal t = new NodeTraversal(compiler, tc);
    boolean typeable = tc.visitName(t, nameNode, paramListNode);
    Assert.assertFalse(typeable);
  }

  @Test
  public void testCheck_inExternsMode_success() {
    Node externsRoot = compiler.parseTestCode("/** @type {number} */ var externVar;");
    Node jsRoot = compiler.parseTestCode("var regularVar = externVar;");
    new Node(Token.BLOCK, externsRoot, jsRoot);

    TypeCheck tc = createTypeCheckInstance(CheckLevel.OFF, CheckLevel.OFF);
    Scope scope = tc.processForTesting(externsRoot, jsRoot);
    Assert.assertNotNull(scope);

    tc.check(externsRoot, true);
  }

  @Test
  public void testUnexpectedToken_reportsInternalError() {
    Node customNode = new Node(Token.LABEL_NAME);
    Node exprResult = new Node(Token.EXPR_RESULT, customNode);
    Node jsRoot = new Node(Token.SCRIPT, exprResult);
    Node externsRoot = new Node(Token.SCRIPT);
    new Node(Token.BLOCK, externsRoot, jsRoot);

    TypeCheck tc = createTypeCheckInstance(CheckLevel.OFF, CheckLevel.OFF);
    tc.processForTesting(externsRoot, jsRoot);
    Assert.assertNotNull(tc);
  }
}
