package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import org.junit.Test;

public class PeepholeFoldConstantsTest {

  private void test(String js, String expected) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    PeepholeOptimizationsPass pass =
        new PeepholeOptimizationsPass(compiler, new PeepholeFoldConstants());
    pass.process(null, root);
    Node expectedRoot = compiler.parseTestCode(expected);
    assertEquals(compiler.toSource(expectedRoot), compiler.toSource(root));
  }

  private void testSame(String js) {
    test(js, js);
  }

  private void testError(String js, DiagnosticType expectedError) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    PeepholeOptimizationsPass pass =
        new PeepholeOptimizationsPass(compiler, new PeepholeFoldConstants());
    pass.process(null, root);
    assertTrue(compiler.getErrorCount() > 0);
    assertEquals(expectedError, compiler.getErrors()[0].getType());
  }

  @Test
  public void testTypeof_stringLiteral_foldsToTypeString() {
    test("typeof 'hello'", "'string'");
  }

  @Test
  public void testTypeof_numberLiteral_foldsToTypeNumber() {
    test("typeof 123", "'number'");
  }

  @Test
  public void testTypeof_booleanLiteral_foldsToTypeBoolean() {
    test("typeof true", "'boolean'");
    test("typeof false", "'boolean'");
  }

  @Test
  public void testTypeof_objectLiteralAndNull_foldsToTypeObject() {
    test("typeof null", "'object'");
    test("typeof {}", "'object'");
    test("typeof []", "'object'");
  }

  @Test
  public void testTypeof_voidAndUndefined_foldsToTypeUndefined() {
    test("typeof void 0", "'undefined'");
    test("typeof undefined", "'undefined'");
  }

  @Test
  public void testTypeof_nonLiteral_doesNotFold() {
    testSame("typeof x");
    testSame("typeof foo()");
  }

  @Test
  public void testUnaryNot_booleanAndFalsyValues_foldsCorrectly() {
    test("!true", "false");
    test("!false", "true");
    test("!0", "true");
    test("!1", "false");
    test("!''", "true");
    test("!'a'", "false");
    test("!null", "true");
    test("!void 0", "true");
    testSame("!x");
  }

  @Test
  public void testUnaryNeg_numbersAndSpecialCases_foldsCorrectly() {
    test("- -5", "5");
    test("-5", "-5");
    test("-Infinity", "-Infinity");
    test("-NaN", "NaN");
  }

  @Test
  public void testUnaryNeg_nonNumber_reportsError() {
    testError("-'abc'", PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR);
  }

  @Test
  public void testUnaryBitNot_integers_foldsCorrectly() {
    test("~0", "-1");
    test("~1", "-2");
    test("~ -1", "0");
  }

  @Test
  public void testUnaryBitNot_fractionalNumber_reportsError() {
    testError("~1.5", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  @Test
  public void testUnaryBitNot_outOfRange_reportsError() {
    testError("~1e20", PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE);
  }

  @Test
  public void testUnaryBitNot_nonNumber_reportsError() {
    testError("~'abc'", PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR);
  }

  @Test
  public void testUnary_unusedExpressionStatement_dropsUnaryOperator() {
    test("!x;", "x;");
  }

  @Test
  public void testInstanceof_immutableValues_foldsToFalse() {
    test("'hello' instanceof Object", "false");
    test("123 instanceof Object", "false");
    test("true instanceof Object", "false");
  }

  @Test
  public void testInstanceof_objectLiteralWithObject_foldsToTrue() {
    test("({}) instanceof Object", "true");
    test("[] instanceof Object", "true");
  }

  @Test
  public void testInstanceof_nonFoldable_doesNotFold() {
    testSame("({}) instanceof Array");
    testSame("x instanceof Object");
    testSame("({}) instanceof foo()");
  }

  @Test
  public void testAssign_compoundAssignmentOperations_foldsCorrectly() {
    test("x = x + y", "x += y");
    test("x = x - y", "x -= y");
    test("x = x * y", "x *= y");
    test("x = x / y", "x /= y");
    test("x = x % y", "x %= y");
    test("x = x & y", "x &= y");
    test("x = x | y", "x |= y");
    test("x = x ^ y", "x ^= y");
    test("x = x << y", "x <<= y");
    test("x = x >> y", "x >>= y");
    test("x = x >>> y", "x >>>= y");
  }

  @Test
  public void testAssign_differentLHSOrRHS_doesNotFold() {
    testSame("x = y + z");
    testSame("x = x");
    testSame("foo().x = foo().x + 1");
  }

  @Test
  public void testAndOr_leftLiteralKnown_foldsCorrectly() {
    test("true || x", "true");
    test("3 || x", "3");
    test("false || x", "x");
    test("false && x", "false");
    test("0 && x", "0");
    test("true && x", "x");
  }

  @Test
  public void testAndOr_inConditionalContext_foldsRightConstant() {
    test("if (x || false) { foo(); }", "if (x) { foo(); }");
    test("if (x && true) { foo(); }", "if (x) { foo(); }");
    test("if (x || true) { foo(); }", "if (true) { foo(); }");
    test("if (x && false) { foo(); }", "if (false) { foo(); }");
    test("while (x || false) { foo(); }", "while (x) { foo(); }");
    test("do { foo(); } while (x && true);", "do { foo(); } while (x);");
    test("for (; x || false;) { foo(); }", "for (; x;) { foo(); }");
    test("var res = (x || false) ? 1 : 2;", "var res = x ? 1 : 2;");
  }

  @Test
  public void testAndOr_nonConditionParentWithRightConst_doesNotFold() {
    testSame("var a = x || 0;");
    testSame("if (foo() || true) { bar(); }");
  }

  @Test
  public void testAdd_constantFolding_foldsStringAndNumber() {
    test("'a' + 'b'", "'ab'");
    test("'a' + 1", "'a1'");
    test("1 + 'b'", "'1b'");
    test("1 + 2", "3");
  }

  @Test
  public void testAdd_leftChildAdd_foldsLeftStringConcat() {
    test("foo() + 'a' + 'b'", "foo() + 'ab'");
    testSame("foo() + 1 + 2");
  }

  @Test
  public void testArithmetic_basicOperations_foldsCorrectly() {
    test("10 - 3", "7");
    test("4 * 5", "20");
    test("20 / 4", "5");
  }

  @Test
  public void testArithmetic_divideByZero_reportsError() {
    testError("10 / 0", PeepholeFoldConstants.DIVIDE_BY_0_ERROR);
  }

  @Test
  public void testArithmetic_longResultOrTooLarge_doesNotFold() {
    testSame("1 / 3");
    testSame("1e50 * 1e50");
  }

  @Test
  public void testBitAndOr_integers_foldsCorrectly() {
    test("6 & 3", "2");
    test("6 | 3", "7");
  }

  @Test
  public void testBitAndOr_nonIntegerOrOutOfRange_doesNotFold() {
    testSame("1.5 & 3");
    testSame("6 & 3.5");
    testSame("1e20 & 3");
  }

  @Test
  public void testShift_validIntegers_foldsCorrectly() {
    test("8 << 2", "32");
    test("8 >> 1", "4");
    test("-16 >>> 2", "1073741820");
  }

  @Test
  public void testShift_shiftAmountOutOfBounds_reportsError() {
    testError("1 << 32", PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS);
    testError("1 << -1", PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS);
  }

  @Test
  public void testShift_fractionalOperand_reportsError() {
    testError("1.5 << 2", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
    testError("1 << 2.5", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  @Test
  public void testShift_operandOutOfRange_reportsError() {
    testError("1e20 << 1", PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE);
  }

  @Test
  public void testComparison_undefinedAndNull_foldsCorrectly() {
    test("undefined == undefined", "true");
    test("undefined == null", "true");
    test("undefined != null", "false");
    test("undefined === undefined", "true");
    test("undefined === null", "false");
    test("undefined !== null", "true");
    test("undefined < null", "false");
    test("undefined > null", "false");
    test("undefined <= null", "false");
    test("undefined >= null", "false");

    test("void 0 == null", "true");
    test("void 0 === void 0", "true");
    test("void 0 === null", "false");
    test("void 0 !== null", "true");
    test("void 0 < null", "false");
    testSame("void x == null");

    test("null == undefined", "true");
    test("null === null", "true");
    test("null !== null", "false");
    test("null == null", "true");
    test("null != null", "false");
  }

  @Test
  public void testComparison_booleans_foldsCorrectly() {
    test("true == true", "true");
    test("true == false", "false");
    test("true === true", "true");
    test("true != false", "true");
    test("true !== false", "true");
    test("true == undefined", "false");
  }

  @Test
  public void testComparison_this_foldsCorrectly() {
    test("this == this", "true");
    test("this != this", "false");
    testSame("this == x");
  }

  @Test
  public void testComparison_strings_foldsCorrectly() {
    test("'a' == 'a'", "true");
    test("'a' == 'b'", "false");
    test("'a' != 'b'", "true");
    test("'a' === 'a'", "true");
    test("'a' !== 'b'", "true");
    test("'a' == undefined", "false");
    testSame("'a' == 1");
  }

  @Test
  public void testComparison_numbers_foldsCorrectly() {
    test("1 == 1", "true");
    test("1 == 2", "false");
    test("1 != 2", "true");
    test("1 < 2", "true");
    test("2 < 1", "false");
    test("1 <= 1", "true");
    test("2 <= 1", "false");
    test("2 > 1", "true");
    test("1 > 2", "false");
    test("2 >= 2", "true");
    test("1 >= 2", "false");
    test("1 === 1", "true");
    test("1 !== 2", "true");
    test("1 == undefined", "false");
  }

  @Test
  public void testComparison_names_foldsCorrectly() {
    test("x < x", "false");
    test("x > x", "false");
    testSame("x == x");
    testSame("x == y");
    test("undefined == 0", "false");
  }

  @Test
  public void testStringIndexOf_constantFolding_foldsCorrectly() {
    test("'abcdef'.indexOf('bc')", "1");
    test("'abcdefbc'.indexOf('bc', 3)", "6");
    test("'abcdef'.lastIndexOf('cd')", "2");
    test("'abcdefcd'.lastIndexOf('cd', 3)", "2");
    test("'abcdef'.indexOf('xyz')", "-1");
  }

  @Test
  public void testStringIndexOf_invalidArguments_doesNotFold() {
    testSame("'abcdef'.indexOf('b', 1, 2)");
    testSame("'abcdef'.indexOf('b', 'x')");
    testSame("'abcdef'.indexOf(x)");
    testSame("x.indexOf('a')");
    testSame("'abcdef'.otherMethod('a')");
  }

  @Test
  public void testArrayJoin_constantFolding_foldsCorrectly() {
    test("[].join(',')", "''");
    test("['a', 'b', 'c'].join(',')", "'a,b,c'");
    test("['a', 'b', 'c'].join('')", "'abc'");
    test("['a'].join('')", "'a'");
    test("[1].join('')", "'' + 1");
    test("[a, 'b', 'c'].join(',')", "[a, 'b,c'].join(',')");
  }

  @Test
  public void testArrayJoin_nonFoldable_doesNotFold() {
    testSame("['a', 'b'].join(sep)");
    testSame("x.join(',')");
  }

  @Test
  public void testGetProp_lengthProperty_foldsCorrectly() {
    test("'hello'.length", "5");
    test("[1, 2, 3].length", "3");
    test("[].length", "0");
    testSame("[foo()].length");
    testSame("x.length");
    testSame("'hello'.otherProp");
  }

  @Test
  public void testGetElem_validIndex_foldsElement() {
    test("[10, 20, 30][0]", "10");
    test("[10, 20, 30][1]", "20");
    test("[10, 20, 30][2]", "30");
  }

  @Test
  public void testGetElem_outOfBoundsIndex_reportsError() {
    testError("[10, 20, 30][3]", PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR);
    testError("[10, 20, 30][-1]", PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR);
  }

  @Test
  public void testGetElem_nonIntegerIndex_reportsError() {
    testError("[10, 20, 30][1.5]", PeepholeFoldConstants.INVALID_GETELEM_INDEX_ERROR);
  }

  @Test
  public void testGetElem_nonFoldable_doesNotFold() {
    testSame("[10, 20, 30]['foo']");
    testSame("x[0]");
  }

  @Test
  public void testOptimizeSubtree_directInvocation_handlesFallthroughAndDefault() {
    PeepholeFoldConstants peephole = new PeepholeFoldConstants();
    Node node = Node.newNumber(42);
    Node result = peephole.optimizeSubtree(node);
    assertNotNull(result);
    assertEquals(node, result);
  }
}
