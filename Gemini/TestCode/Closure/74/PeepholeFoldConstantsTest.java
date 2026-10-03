package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class PeepholeFoldConstantsTest {

  private Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    return compiler;
  }

  private void fold(String js, String expected) {
    Compiler compiler = createCompiler();
    Node root = compiler.parseTestCode(js);
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(
        compiler, new PeepholeFoldConstants());
    pass.process(null, root);
    String actual = compiler.toSource(root).trim();
    if (actual.endsWith(";")) {
      actual = actual.substring(0, actual.length() - 1);
    }
    Assert.assertEquals(expected, actual);
  }

  private void foldSame(String js) {
    fold(js, js);
  }

  @Test
  public void testTypeof_literals_folded() {
    fold("typeof 'hello'", "\"string\"");
    fold("typeof 123", "\"number\"");
    fold("typeof true", "\"boolean\"");
    fold("typeof false", "\"boolean\"");
    fold("typeof null", "\"object\"");
    fold("typeof {}", "\"object\"");
    fold("typeof []", "\"object\"");
    fold("typeof void 0", "\"undefined\"");
    fold("typeof undefined", "\"undefined\"");
    fold("typeof function() {}", "\"function\"");
  }

  @Test
  public void testTypeof_unknownVariable_notFolded() {
    foldSame("typeof x");
  }

  @Test
  public void testUnaryNot_booleanAndNumbers() {
    fold("!true", "false");
    fold("!false", "true");
    fold("!'hello'", "false");
    fold("!''", "true");
    foldSame("!0");
    foldSame("!1");
    fold("!2", "false");
    foldSame("!x");
  }

  @Test
  public void testUnaryPos_numericAndNonNumeric() {
    fold("+123", "123");
    fold("+'123'", "123");
    fold("+true", "1");
    fold("+false", "0");
    fold("+null", "0");
    fold("+undefined", "NaN");
    fold("+Infinity", "Infinity");
  }

  @Test
  public void testUnaryNeg_numbersAndSpecialValues() {
    fold("-123", "-123");
    fold("-(-5)", "5");
    fold("-'5'", "-5");
    fold("-NaN", "NaN");
    foldSame("-Infinity");
    fold("-true", "-1");
  }

  @Test
  public void testUnaryBitNot_integersAndErrors() {
    fold("~0", "-1");
    fold("~1", "-2");
    fold("~'3'", "-4");
    foldSame("~1.5");
    foldSame("~1e20");
  }

  @Test
  public void testReduceVoid_variousOperands() {
    fold("void 1", "void 0");
    fold("void 'hello'", "void 0");
    foldSame("void 0");
    foldSame("void foo()");
  }

  @Test
  public void testBinaryAdd_stringsAndNumbers() {
    fold("'a' + 'b'", "\"ab\"");
    fold("'a' + 1", "\"a1\"");
    fold("1 + 'a'", "\"1a\"");
    fold("1 + 2", "3");
    fold("1 + 2 + 3", "6");
    fold("x + 1 + 2", "x + 3");
    fold("x + 'a' + 'b'", "x + \"ab\"");
    fold("'a' + ('b' + x)", "\"ab\" + x");
  }

  @Test
  public void testArithmeticOps_subMulDivMod() {
    fold("5 - 2", "3");
    fold("2 * 3", "6");
    fold("6 / 2", "3");
    fold("7 % 3", "1");
    fold("x * 2 * 3", "x * 6");
    foldSame("5 / 0");
    foldSame("5 % 0");
  }

  @Test
  public void testBitwiseOps_andOrXor() {
    fold("1 & 3", "1");
    fold("1 | 2", "3");
    fold("1 ^ 3", "2");
    fold("x & 1 & 3", "x & 1");
    fold("x | 1 | 2", "x | 3");
    fold("x ^ 1 ^ 3", "x ^ 2");
  }

  @Test
  public void testBitwiseShifts_lshRshUrsh() {
    fold("1 << 2", "4");
    fold("8 >> 2", "2");
    fold("-1 >>> 0", "4294967295");
    foldSame("1 << 35");
    foldSame("1.5 << 2");
    foldSame("1 << 2.5");
    foldSame("1e20 << 2");
  }

  @Test
  public void testAssignments_compounds() {
    fold("x = x + y", "x += y");
    fold("x = y + x", "x += y");
    fold("x = x - y", "x -= y");
    fold("x = x * y", "x *= y");
    fold("x = x / y", "x /= y");
    fold("x = x % y", "x %= y");
    fold("x = x & y", "x &= y");
    fold("x = x | y", "x |= y");
    fold("x = x ^ y", "x ^= y");
    fold("x = x << y", "x <<= y");
    fold("x = x >> y", "x >>= y");
    fold("x = x >>> y", "x >>>= y");
    foldSame("x = y - x");
  }

  @Test
  public void testAndOr_booleanShortCircuits() {
    fold("true && x", "x");
    fold("false && x", "false");
    fold("true || x", "true");
    fold("false || x", "x");
    fold("1 || x", "1");
    fold("0 && x", "0");
    foldSame("foo() && x");
    foldSame("foo() || x");
  }

  @Test
  public void testComparison_equalityAndOrdering() {
    fold("'a' == 'a'", "true");
    fold("'a' == 'b'", "false");
    fold("'a' === 'a'", "true");
    fold("'a' != 'b'", "true");
    fold("'a' !== 'a'", "false");
    fold("1 == 1", "true");
    fold("1 == 2", "false");
    fold("1 != 2", "true");
    fold("1 < 2", "true");
    fold("2 < 1", "false");
    fold("1 <= 1", "true");
    fold("2 > 1", "true");
    fold("1 >= 2", "false");
    fold("null == null", "true");
    fold("true == true", "true");
    fold("false == true", "false");
    fold("null == undefined", "true");
    fold("null === undefined", "false");
    fold("void 0 == undefined", "true");
    fold("this === this", "true");
    fold("this !== this", "false");
    fold("x < x", "false");
    fold("x > x", "false");
    foldSame("x == y");
  }

  @Test
  public void testInstanceof_folding() {
    fold("1 instanceof Object", "false");
    fold("'a' instanceof Object", "false");
    fold("true instanceof Object", "false");
    fold("({}) instanceof Object", "true");
    fold("[] instanceof Object", "true");
    foldSame("({}) instanceof Foo");
    foldSame("x instanceof Object");
  }

  @Test
  public void testGetProp_lengthAndObjects() {
    fold("[1, 2, 3].length", "3");
    fold("[].length", "0");
    fold("'hello'.length", "5");
    fold("({a: 1}).a", "1");
    fold("({get a() { return 1; }}).a", "({get a() { return 1; }}).a()");
    foldSame("({a: 1}).b");
    foldSame("({a: x}).a = 2");
    foldSame("({a: function() { this.x; }}).a");
  }

  @Test
  public void testGetElem_arraysAndObjects() {
    fold("[1, 2, 3][1]", "2");
    fold("[1, 2, 3][0]", "1");
    fold("[1, , 3][1]", "void 0");
    fold("({a: 'foo'})['a']", "\"foo\"");
    foldSame("[1, 2, 3][5]");
    foldSame("[1, 2, 3][-1]");
    foldSame("[1, 2, 3][1.5]");
    foldSame("[1, 2, 3]['x']");
  }

  @Test
  public void testStringMethods_folding() {
    fold("'HELLO'.toLowerCase()", "\"hello\"");
    fold("'hello'.toUpperCase()", "\"HELLO\"");
    fold("'abcdef'.indexOf('cd')", "2");
    fold("'abcdef'.indexOf('gh')", "-1");
    fold("'abcdefcd'.indexOf('cd', 3)", "6");
    fold("'abcdefcd'.lastIndexOf('cd')", "6");
    fold("'abcdefcd'.lastIndexOf('cd', 3)", "2");
    fold("'abcdef'.substr(1, 2)", "\"bc\"");
    fold("'abcdef'.substr(2)", "\"cdef\"");
    fold("'abcdef'.substring(1, 3)", "\"bc\"");
    fold("'abcdef'.substring(2)", "\"cdef\"");
    foldSame("'abcdef'.substr(-1, 2)");
    foldSame("'abcdef'.substr(1, 10)");
    foldSame("'abcdef'.substring(-1, 2)");
    foldSame("'abcdef'.substring(3, 1)");
    foldSame("'abcdef'.substring(1, 10)");
  }

  @Test
  public void testArrayJoin_folding() {
    fold("[].join()", "\"\"");
    fold("['a'].join()", "\"a\"");
    fold("[1].join()", "\"\" + 1");
    fold("['a', 'b', 'c'].join('')", "\"abc\"");
    fold("['a', 'b', 'c'].join(',')", "\"a,b,c\"");
    fold("['a', 'b'].join('-')", "\"a-b\"");
    fold("[1, 2, 3].join(',')", "\"1,2,3\"");
    fold("[1, , 2].join(',')", "\"1,,2\"");
    foldSame("[foo(), 'a'].join(',')");
  }

  @Test
  public void testConstructorCall_inForcedStringContext() {
    fold("o[new String('prop')]", "o['prop']");
    fold("o[new String()]", "o['']");
    foldSame("new String('prop')");
    foldSame("o[new Object('prop')]");
  }

  @Test
  public void testOptimizeSubtreeDirectly_handlesCornerNodes() {
    PeepholeFoldConstants foldConstants = new PeepholeFoldConstants();

    Node leaf = Node.newString("a");
    Node resLeaf = foldConstants.optimizeSubtree(leaf);
    Assert.assertSame(leaf, resLeaf);

    Node emptyAdd = new Node(Token.ADD);
    Node resEmptyAdd = foldConstants.optimizeSubtree(emptyAdd);
    Assert.assertSame(emptyAdd, resEmptyAdd);

    Node singleChildAdd = new Node(Token.ADD, Node.newString("a"));
    Node resSingle = foldConstants.optimizeSubtree(singleChildAdd);
    Assert.assertSame(singleChildAdd, resSingle);

    Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
    Node resComma = foldConstants.optimizeSubtree(comma);
    Assert.assertSame(comma, resComma);
  }
}
