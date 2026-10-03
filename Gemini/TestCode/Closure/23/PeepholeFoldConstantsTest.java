package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

public class PeepholeFoldConstantsTest {

  private Node fold(Node root, boolean late) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    PeepholeOptimizationsPass pass =
        new PeepholeOptimizationsPass(compiler, new PeepholeFoldConstants(late));
    pass.process(null, root);
    return root;
  }

  private void test(String js, String expected) {
    test(js, expected, false);
  }

  private void testLate(String js, String expected) {
    test(js, expected, true);
  }

  private void test(String js, String expected, boolean late) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = compiler.parseTestCode(js);
    PeepholeOptimizationsPass pass =
        new PeepholeOptimizationsPass(compiler, new PeepholeFoldConstants(late));
    pass.process(null, root);
    String actual = compiler.toSource(root);
    assertEquals(expected, actual.trim());
  }

  private void testSame(String js) {
    test(js, js, false);
  }

  private void testSameLate(String js) {
    test(js, js, true);
  }

  private void testError(String js, DiagnosticType diagnosticType) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = compiler.parseTestCode(js);
    PeepholeOptimizationsPass pass =
        new PeepholeOptimizationsPass(compiler, new PeepholeFoldConstants(false));
    pass.process(null, root);
    boolean found = false;
    for (JSError error : compiler.getErrors()) {
      if (error.getType().equals(diagnosticType)) {
        found = true;
        break;
      }
    }
    for (JSError warning : compiler.getWarnings()) {
      if (warning.getType().equals(diagnosticType)) {
        found = true;
        break;
      }
    }
    assertTrue("Expected error " + diagnosticType.key, found);
  }

  @Test
  public void testTypeofFolding() {
    test("typeof 'abc'", "\"string\";");
    test("typeof 123", "\"number\";");
    test("typeof true", "\"boolean\";");
    test("typeof false", "\"boolean\";");
    test("typeof null", "\"object\";");
    test("typeof {}", "\"object\";");
    test("typeof []", "\"object\";");
    test("typeof void 0", "\"undefined\";");
    test("typeof undefined", "\"undefined\";");
    test("typeof function() {}", "\"function\";");
    testSame("typeof x;");
  }

  @Test
  public void testUnaryOperators() {
    test("!true", "false;");
    test("!false", "true;");
    test("!null", "true;");
    test("!\"hello\"", "false;");
    test("!0", "true;", false);
    testSameLate("!0;");
    testSameLate("!1;");

    test("+1", "1;");
    testSame("+x;");

    test("-5", "-5;");
    testSame("-Infinity;");
    test("-NaN", "NaN;");

    test("~5", "-6;");
  }

  @Test
  public void testUnaryOperatorErrors() {
    testError("-\"abc\"", PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR);
    testError("~\"abc\"", PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR);
    testError("~1.5", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
    testError("~1e20", PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE);
  }

  @Test
  public void testReduceVoid() {
    test("void 1", "void 0;");
    test("void 'abc'", "void 0;");
    testSame("void 0;");
    testSame("void foo();");
  }

  @Test
  public void testInstanceOfFolding() {
    test("'hello' instanceof Object", "false;");
    test("123 instanceof Object", "false;");
    test("({}) instanceof Object", "true;");
    testSame("x instanceof Object;");
    testSame("({}) instanceof Function;");
  }

  @Test
  public void testAssignFolding() {
    testLate("x = x + y", "x += y;");
    testLate("x = y + x", "x += y;");
    testLate("x = x - y", "x -= y;");
    testLate("x = x * y", "x *= y;");
    testLate("x = x / y", "x /= y;");
    testLate("x = x % y", "x %= y;");
    testLate("x = x & y", "x &= y;");
    testLate("x = x | y", "x |= y;");
    testLate("x = x ^ y", "x ^= y;");
    testLate("x = x << y", "x <<= y;");
    testLate("x = x >> y", "x >>= y;");
    testLate("x = x >>> y", "x >>>= y;");
    testSame("x = x + y;");
  }

  @Test
  public void testUnfoldAssignOp() {
    test("x += y", "x = x + y;");
    test("x -= y", "x = x - y;");
    test("x *= y", "x = x * y;");
    test("x /= y", "x = x / y;");
    test("x %= y", "x = x % y;");
    test("x &= y", "x = x & y;");
    test("x |= y", "x = x | y;");
    test("x ^= y", "x = x ^ y;");
    test("x <<= y", "x = x << y;");
    test("x >>= y", "x = x >> y;");
    test("x >>>= y", "x = x >>> y;");
    testSameLate("x += y;");
  }

  @Test
  public void testAndOrFolding() {
    test("true || x", "true;");
    test("3 || x", "3;");
    test("false || x", "x;");
    test("false && x", "false;");
    test("true && x", "x;");
    test("0 && x", "0;");
    testSame("foo() || x;");
    testSame("foo() && x;");
  }

  @Test
  public void testStringAddFolding() {
    test("'a' + 'b'", "\"ab\";");
    test("'a' + 1", "\"a1\";");
    test("1 + 'a'", "\"1a\";");
    test("(foo() + 'a') + 'b'", "foo() + \"ab\";");
    test("'a' + ('b' + foo())", "\"ab\" + foo();");
  }

  @Test
  public void testArithmeticFolding() {
    test("1 + 2", "3;");
    test("5 - 2", "3;");
    test("2 * 3", "6;");
    test("8 / 2", "4;");
    test("7 % 3", "1;");
    testSame("8 / 0;");
    testSame("7 % 0;");
    test("(foo() * 2) * 3", "foo() * 6;");
    test("(2 * foo()) * 3", "foo() * 6;");
    test("(foo() + 2) + 3", "foo() + 5;");
  }

  @Test
  public void testBitwiseFolding() {
    test("5 & 3", "1;");
    test("5 | 2", "7;");
    test("5 ^ 1", "4;");
    test("(foo() & 5) & 3", "foo() & 1;");
    test("(foo() | 5) | 2", "foo() | 7;");
    test("(foo() ^ 5) ^ 1", "foo() ^ 4;");
  }

  @Test
  public void testShiftFolding() {
    test("1 << 2", "4;");
    test("8 >> 2", "2;");
    test("-1 >>> 1", "2147483647;");
  }

  @Test
  public void testShiftErrors() {
    testError("1e20 << 2", PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE);
    testError("1 << 35", PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS);
    testError("1 << -1", PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS);
    testError("1.5 << 2", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
    testError("1 << 2.5", PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND);
  }

  @Test
  public void testComparisons() {
    test("1 < 2", "true;");
    test("2 < 1", "false;");
    test("1 <= 1", "true;");
    test("2 <= 1", "false;");
    test("2 > 1", "true;");
    test("1 > 2", "false;");
    test("2 >= 2", "true;");
    test("1 >= 2", "false;");
    test("1 == 1", "true;");
    test("1 == 2", "false;");
    test("1 != 2", "true;");
    test("1 != 1", "false;");
    test("1 === 1", "true;");
    test("1 === 2", "false;");
    test("1 !== 2", "true;");
    test("1 !== 1", "false;");

    test("'abc' == 'abc'", "true;");
    test("'abc' == 'def'", "false;");
    test("'abc' != 'def'", "true;");
    test("'abc' === 'abc'", "true;");
    test("'abc' !== 'def'", "true;");
    testSame("'\u000B' == '\u000B';");

    test("true == true", "true;");
    test("true == false", "false;");
    test("true != false", "true;");
    test("true === true", "true;");
    test("true !== false", "true;");
    test("true < false", "false;");
    test("false < true", "true;");

    test("this == this", "true;");
    test("this === this", "true;");
    test("this != this", "false;");
    test("this !== this", "false;");
    testSame("this == x;");

    test("undefined == undefined", "true;");
    test("undefined === undefined", "true;");
    test("undefined == null", "true;");
    test("undefined === null", "false;");
    test("undefined != null", "false;");
    test("undefined !== null", "true;");
    test("null == null", "true;");
    test("null === null", "true;");
    test("null == false", "false;");
    test("null === false", "false;");
    test("void 0 == undefined", "true;");
    test("void 0 === undefined", "true;");
    test("void 0 < undefined", "false;");
    test("(-1) == null", "false;");
    test("[] == null", "false;");
    test("({}) == undefined", "false;");
    test("/a/ == null", "false;");

    test("x < x", "false;");
    test("x > x", "false;");
    testSame("x == x;");
  }

  @Test
  public void testConstructorCallFolding() {
    test("this[new String('eval')]", "this[\"eval\"];");
    test("this[new String()]", "this[\"\"];");
    test("'' + new String('abc')", "\"abc\";");
    testSame("new String('abc');");
    testSame("this[new String(x)];");
    testSame("this[new Number(1)];");
  }

  @Test
  public void testArrayAccessFolding() {
    test("[10, 20, 30][1]", "20;");
    test("[10, , 30][1]", "void 0;");
    testSame("[][0] = 1;");
    testSame("[10][x];");
  }

  @Test
  public void testArrayAccessErrors() {
    testError("[10][1.5]", PeepholeFoldConstants.INVALID_GETELEM_INDEX_ERROR);
    testError("[10][-1]", PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR);
    testError("[10][5]", PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR);
  }

  @Test
  public void testGetPropFolding() {
    test("[1, 2, 3].length", "3;");
    test("'hello'.length", "5;");
    testSame("[foo()].length;");
    test("({a: 1}).a", "1;");
    test("({get a() { return 1; }}).a", "1();");
    testSame("({set a(v) {}}).a;");
    testSame("({a: function() { this.x; }}).a;");
    testSame("({a: x, b: y}).b;");
    testSame("({a: 1}).a += 1;");
    test("({a: 1})['a']", "1;");
  }

  @Test
  public void testTryConvertToNumberConversions() {
    test("true - 1", "0;");
    test("false + 2", "2;");
    test("null * 5", "0;");
    test("(x ? 1 : 2) - 1", "(x ? 1 : 2) - 1;");
    test("(x, 3) - 1", "(x, 3) - 1;");
    test("(x && 4) - 1", "(x && 4) - 1;");
    test("(x || 4) - 1", "(x || 4) - 1;");
  }

  @Test
  public void testOptimizeSubtreeDirectly() {
    PeepholeFoldConstants folder = new PeepholeFoldConstants(false);
    Node emptyNode = IR.empty();
    assertSame(emptyNode, folder.optimizeSubtree(emptyNode));

    Node singleChildAdd = new Node(Token.ADD, IR.number(1));
    assertSame(singleChildAdd, folder.optimizeSubtree(singleChildAdd));

    Node binaryNoKids = new Node(Token.ADD);
    assertSame(binaryNoKids, folder.optimizeSubtree(binaryNoKids));

    Node block = IR.block();
    Node unaryNot = IR.not(IR.name("x"));
    block.addChildToFront(unaryNot);
    assertSame(unaryNot, folder.optimizeSubtree(unaryNot));
    assertNotNull(folder);
  }
}
