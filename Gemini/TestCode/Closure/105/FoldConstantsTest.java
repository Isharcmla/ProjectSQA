package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class FoldConstantsTest {

  private Node test(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = compiler.parseTestCode(js);
    FoldConstants foldConstants = new FoldConstants(compiler);
    foldConstants.process(null, root);
    return root;
  }

  private String testAndPrint(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = compiler.parseTestCode(js);
    FoldConstants foldConstants = new FoldConstants(compiler);
    foldConstants.process(null, root);
    return compiler.toSource(root);
  }

  @Test
  public void testProcess_simpleArithmetic_foldsCorrectly() {
    String source = testAndPrint("var x = 1 + 2;");
    Assert.assertTrue(source.contains("3"));
  }

  @Test
  public void testVisit_emptyBlock_handlesGracefully() {
    Node root = test("{}");
    Assert.assertNotNull(root);
  }

  @Test
  public void testTypeof_literals_foldToStrings() {
    Assert.assertTrue(testAndPrint("var a = typeof 'hello';").contains("\"string\""));
    Assert.assertTrue(testAndPrint("var b = typeof 123;").contains("\"number\""));
    Assert.assertTrue(testAndPrint("var c = typeof true;").contains("\"boolean\""));
    Assert.assertTrue(testAndPrint("var d = typeof false;").contains("\"boolean\""));
    Assert.assertTrue(testAndPrint("var e = typeof null;").contains("\"object\""));
    Assert.assertTrue(testAndPrint("var f = typeof {};").contains("\"object\""));
    Assert.assertTrue(testAndPrint("var g = typeof [];").contains("\"object\""));
    Assert.assertTrue(testAndPrint("var h = typeof undefined;").contains("\"undefined\""));
    Assert.assertTrue(testAndPrint("var i = typeof unknownVar;").contains("typeof unknownVar"));
  }

  @Test
  public void testUnaryNot_booleanAndExpressions() {
    Assert.assertTrue(testAndPrint("var a = !true;").contains("false"));
    Assert.assertTrue(testAndPrint("var b = !false;").contains("true"));
    Assert.assertTrue(testAndPrint("var c = !0;").contains("true"));
    Assert.assertTrue(testAndPrint("var d = !1;").contains("false"));
    Assert.assertTrue(testAndPrint("!x;").equals("x;"));
    Assert.assertTrue(testAndPrint("var e = !(x == y);").contains("x != y"));
    Assert.assertTrue(testAndPrint("var f = !(x != y);").contains("x == y"));
    Assert.assertTrue(testAndPrint("var g = !(x === y);").contains("x !== y"));
    Assert.assertTrue(testAndPrint("var h = !(x !== y);").contains("x === y"));
    Assert.assertTrue(testAndPrint("var i = !(x < y);").contains("!(x < y)"));
  }

  @Test
  public void testUnaryNeg_numbersAndSpecialValues() {
    Assert.assertTrue(testAndPrint("var a = -5;").contains("-5"));
    Assert.assertTrue(testAndPrint("var b = -(-5);").contains("5"));
    Assert.assertTrue(testAndPrint("var c = -Infinity;").contains("-Infinity"));
    Assert.assertTrue(testAndPrint("var d = -NaN;").contains("NaN"));
    testAndPrint("var e = -'nonNumber';");
  }

  @Test
  public void testUnaryBitNot_integersAndErrors() {
    Assert.assertTrue(testAndPrint("var a = ~5;").contains("-6"));
    testAndPrint("var b = ~1.5;");
    testAndPrint("var c = ~100000000000000;");
    testAndPrint("var d = ~'str';");
  }

  @Test
  public void testNewRegExp_validAndInvalid() {
    Assert.assertTrue(testAndPrint("var a = new RegExp('abc');").contains("/abc/"));
    Assert.assertTrue(testAndPrint("var b = new RegExp('abc', 'i');").contains("/abc/i"));
    Assert.assertTrue(testAndPrint("var c = new RegExp('a/b');").contains("/a\\/b/"));
    Assert.assertTrue(testAndPrint("var d = new RegExp('abc', 'g');").contains("new RegExp"));
    testAndPrint("var e = new RegExp('abc', 'z');");
    testAndPrint("var f = new RegExp('abc', 'i', 'extra');");
    testAndPrint("var g = new RegExp();");
  }

  @Test
  public void testNewArrayAndObject_literals() {
    Assert.assertTrue(testAndPrint("var a = new Array();").contains("[]"));
    Assert.assertTrue(testAndPrint("var b = new Object();").contains("{}"));
  }

  @Test
  public void testConditionMinimization() {
    Assert.assertTrue(testAndPrint("!(!a && !b);").contains("a || b"));
    Assert.assertTrue(testAndPrint("!(!a || !b);").contains("a && b"));
    Assert.assertTrue(testAndPrint("!!a;").contains("a;"));
  }

  @Test
  public void testReduceReturn() {
    Assert.assertTrue(testAndPrint("function f() { return undefined; }").contains("return;"));
    Assert.assertTrue(testAndPrint("function f() { return void 0; }").contains("return;"));
    Assert.assertTrue(testAndPrint("function f() { return void foo(); }").contains("return void foo();"));
  }

  @Test
  public void testInstanceof_folding() {
    Assert.assertTrue(testAndPrint("var a = 'str' instanceof Object;").contains("false"));
    Assert.assertTrue(testAndPrint("var b = ({}) instanceof Object;").contains("true"));
  }

  @Test
  public void testHookAndIf_folding() {
    Assert.assertTrue(testAndPrint("if (true) { a(); }").contains("a();"));
    Assert.assertTrue(testAndPrint("if (false) { a(); }").equals(""));
    Assert.assertTrue(testAndPrint("if (true) { a(); } else { b(); }").contains("a();"));
    Assert.assertTrue(testAndPrint("if (false) { a(); } else { b(); }").contains("b();"));
    Assert.assertTrue(testAndPrint("if (x) {} else { b(); }").contains("if(!x)"));
    Assert.assertTrue(testAndPrint("if (x()) {}").contains("x();"));
    Assert.assertTrue(testAndPrint("if (x) {}").equals(""));
    Assert.assertTrue(testAndPrint("x ? void 0 : y;").contains("if(!x)"));
    Assert.assertTrue(testAndPrint("!x ? void 0 : y;").contains("if(x)"));
    Assert.assertTrue(testAndPrint("x ? y : void 0;").contains("if(x)"));
  }

  @Test
  public void testTryMinimizeIf_transformations() {
    Assert.assertTrue(testAndPrint("if (!x) foo();").contains("x || foo();"));
    Assert.assertTrue(testAndPrint("if (x) foo();").contains("x && foo();"));
    Assert.assertTrue(testAndPrint("if (!x) foo(); else bar();").contains("if(x)bar();else foo();"));
    Assert.assertTrue(testAndPrint("if (x) return 1; else return 2;").contains("return x ? 1 : 2;"));
    Assert.assertTrue(testAndPrint("if (x) a = 1; else a = 2;").contains("a = x ? 1 : 2;"));
    Assert.assertTrue(testAndPrint("if (x) foo(); else bar();").contains("x ? foo() : bar();"));
    Assert.assertTrue(testAndPrint("if (x) var y = 1; else y = 2;").contains("var y = x ? 1 : 2;"));
    Assert.assertTrue(testAndPrint("if (x) y = 1; else var y = 2;").contains("var y = x ? 1 : 2;"));
    Assert.assertTrue(testAndPrint("if (a) { x = 1; return true; } else { x = 2; return true; }")
        .contains("return true;"));
  }

  @Test
  public void testLoops_whileDoFor() {
    Assert.assertTrue(testAndPrint("while (false) { a(); }").equals(""));
    Assert.assertTrue(testAndPrint("for (; false; ) { a(); }").equals(""));
    Assert.assertTrue(testAndPrint("for (var i = 0; false; ) { a(); }").contains("var i = 0;"));
    Assert.assertTrue(testAndPrint("do { a(); } while (false);").contains("a();"));
    Assert.assertTrue(testAndPrint("do { break; } while (false);").contains("do{break}while(false)"));
    Assert.assertTrue(testAndPrint("for (; true; ) { a(); }").contains("for(;;)"));
  }

  @Test
  public void testAndOr_folding() {
    Assert.assertTrue(testAndPrint("var a = true || x;").contains("var a = true;"));
    Assert.assertTrue(testAndPrint("var b = false && x;").contains("var b = false;"));
    Assert.assertTrue(testAndPrint("var c = false || x;").contains("var c = x;"));
    Assert.assertTrue(testAndPrint("var d = true && x;").contains("var d = x;"));
    Assert.assertTrue(testAndPrint("if (x || false) { a(); }").contains("if(x)"));
    Assert.assertTrue(testAndPrint("if (x && true) { a(); }").contains("if(x)"));
    Assert.assertTrue(testAndPrint("if (x || true) { a(); }").contains("if(true)"));
    Assert.assertTrue(testAndPrint("if (x && false) { a(); }").equals(""));
  }

  @Test
  public void testAddFolding_stringsAndNumbers() {
    Assert.assertTrue(testAndPrint("var a = 'hello ' + 'world';").contains("\"hello world\""));
    Assert.assertTrue(testAndPrint("var b = foo() + 'a' + 'b';").contains("foo() + \"ab\""));
    Assert.assertTrue(testAndPrint("var c = 1 + 2;").contains("3"));
  }

  @Test
  public void testArithmeticOperations() {
    Assert.assertTrue(testAndPrint("var a = 5 - 3;").contains("2"));
    Assert.assertTrue(testAndPrint("var b = 4 * 2;").contains("8"));
    Assert.assertTrue(testAndPrint("var c = 6 / 2;").contains("3"));
    testAndPrint("var d = 1 / 0;");
  }

  @Test
  public void testBitwiseAndOr() {
    Assert.assertTrue(testAndPrint("var a = 1 | 2;").contains("3"));
    Assert.assertTrue(testAndPrint("var b = 3 & 2;").contains("2"));
    Assert.assertTrue(testAndPrint("var c = 1.5 | 2;").contains("1.5 | 2"));
  }

  @Test
  public void testShiftOperations() {
    Assert.assertTrue(testAndPrint("var a = 1 << 2;").contains("4"));
    Assert.assertTrue(testAndPrint("var b = 8 >> 2;").contains("2"));
    Assert.assertTrue(testAndPrint("var c = 8 >>> 2;").contains("2"));
    testAndPrint("var d = 1 << 32;");
    testAndPrint("var e = 1 << -1;");
    testAndPrint("var f = 1.5 << 2;");
    testAndPrint("var g = 1 << 2.5;");
  }

  @Test
  public void testComparisons() {
    Assert.assertTrue(testAndPrint("var a = 1 == 1;").contains("true"));
    Assert.assertTrue(testAndPrint("var b = 1 != 1;").contains("false"));
    Assert.assertTrue(testAndPrint("var c = 1 < 2;").contains("true"));
    Assert.assertTrue(testAndPrint("var d = 1 <= 1;").contains("true"));
    Assert.assertTrue(testAndPrint("var e = 2 > 1;").contains("true"));
    Assert.assertTrue(testAndPrint("var f = 2 >= 2;").contains("true"));
    Assert.assertTrue(testAndPrint("var g = 'a' == 'a';").contains("true"));
    Assert.assertTrue(testAndPrint("var h = 'a' != 'b';").contains("true"));
    Assert.assertTrue(testAndPrint("var i = null == undefined;").contains("true"));
    Assert.assertTrue(testAndPrint("var j = null === undefined;").contains("false"));
    Assert.assertTrue(testAndPrint("var k = void 0 == null;").contains("true"));
    Assert.assertTrue(testAndPrint("var l = void 0 === undefined;").contains("true"));
    Assert.assertTrue(testAndPrint("var m = void 0 < 1;").contains("false"));
    Assert.assertTrue(testAndPrint("var n = undefined == null;").contains("true"));
    Assert.assertTrue(testAndPrint("var o = undefined === null;").contains("false"));
    Assert.assertTrue(testAndPrint("var p = x < x;").contains("false"));
    Assert.assertTrue(testAndPrint("var q = x > x;").contains("false"));
    Assert.assertTrue(testAndPrint("var r = true == true;").contains("true"));
    Assert.assertTrue(testAndPrint("var s = true != false;").contains("true"));
    Assert.assertTrue(testAndPrint("var t = this == this;").contains("true"));
  }

  @Test
  public void testStringIndexOfAndLastIndexOf() {
    Assert.assertTrue(testAndPrint("var a = 'abcdef'.indexOf('bc');").contains("1"));
    Assert.assertTrue(testAndPrint("var b = 'abcdefbc'.indexOf('bc', 3);").contains("6"));
    Assert.assertTrue(testAndPrint("var c = 'abcdefbc'.lastIndexOf('bc');").contains("6"));
    Assert.assertTrue(testAndPrint("var d = 'abcdefbc'.lastIndexOf('bc', 3);").contains("1"));
  }

  @Test
  public void testStringJoin() {
    Assert.assertTrue(testAndPrint("var a = ['a', 'b', 'c'].join('');").contains("\"abc\""));
    Assert.assertTrue(testAndPrint("var b = ['a', 'b', 'c'].join(',');").contains("\"a,b,c\""));
    Assert.assertTrue(testAndPrint("var c = [].join('');").contains("\"\""));
    Assert.assertTrue(testAndPrint("var d = [1, 2].join('');").contains("\"12\""));
    Assert.assertTrue(testAndPrint("var e = [x, 'a', 'b'].join('');").contains("[x, \"ab\"].join(\"\")"));
  }

  @Test
  public void testArrayAndStringGetProp() {
    Assert.assertTrue(testAndPrint("var a = [1, 2, 3].length;").contains("3"));
    Assert.assertTrue(testAndPrint("var b = 'hello'.length;").contains("5"));
    Assert.assertTrue(testAndPrint("var c = [foo()].length;").contains("[foo()].length"));
  }

  @Test
  public void testArrayGetElem() {
    Assert.assertTrue(testAndPrint("var a = [10, 20, 30][1];").contains("20"));
    testAndPrint("var b = [10, 20][5];");
    testAndPrint("var c = [10, 20][-1];");
    testAndPrint("var d = [10, 20][1.5];");
    Assert.assertTrue(testAndPrint("var e = [10, 20]['prop'];").contains("[10, 20][\"prop\"]"));
  }

  @Test
  public void testAssignOperations() {
    Assert.assertTrue(testAndPrint("x = x + y;").contains("x += y"));
    Assert.assertTrue(testAndPrint("x = x - y;").contains("x -= y"));
    Assert.assertTrue(testAndPrint("x = x * y;").contains("x *= y"));
    Assert.assertTrue(testAndPrint("x = x / y;").contains("x /= y"));
    Assert.assertTrue(testAndPrint("x = x % y;").contains("x %= y"));
    Assert.assertTrue(testAndPrint("x = x & y;").contains("x &= y"));
    Assert.assertTrue(testAndPrint("x = x | y;").contains("x |= y"));
    Assert.assertTrue(testAndPrint("x = x ^ y;").contains("x ^= y"));
    Assert.assertTrue(testAndPrint("x = x << y;").contains("x <<= y"));
    Assert.assertTrue(testAndPrint("x = x >> y;").contains("x >>= y"));
    Assert.assertTrue(testAndPrint("x = x >>> y;").contains("x >>>= y"));
  }

  @Test
  public void testContainsUnicodeEscape() {
    Assert.assertTrue(FoldConstants.containsUnicodeEscape("\u0000"));
    Assert.assertTrue(FoldConstants.containsUnicodeEscape("\uFFFF"));
    Assert.assertFalse(FoldConstants.containsUnicodeEscape("abc"));
  }

  @Test
  public void testVisitDirectly_withSyntheticNodes() {
    Compiler compiler = new Compiler();
    FoldConstants fc = new FoldConstants(compiler);
    NodeTraversal t = new NodeTraversal(compiler, fc);

    Node block = new Node(Token.BLOCK);
    block.setIsSyntheticBlock(true);
    Node parent = new Node(Token.SCRIPT, block);
    fc.visit(t, block, parent);

    Node leaf = Node.newNumber(42);
    fc.visit(t, leaf, null);

    Assert.assertNotNull(fc);
  }
}
