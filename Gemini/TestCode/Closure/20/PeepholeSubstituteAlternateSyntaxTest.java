package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class PeepholeSubstituteAlternateSyntaxTest {

  private Node parseAndOptimize(String js, boolean late) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = compiler.parseTestCode(js);
    Node block = root;
    PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(late);
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, peephole);
    pass.process(null, block);
    return root;
  }

  private Node parseAndNormalizeAndOptimize(String js, boolean late) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = compiler.parseTestCode(js);
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(null, root);
    PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(late);
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, peephole);
    pass.process(null, root);
    return root;
  }

  private String toSource(Node root) {
    Compiler compiler = new Compiler();
    return compiler.toSource(root);
  }

  @Test
  public void testOptimizeSubtree_defaultUnchanged() {
    PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);
    Node num = IR.number(42);
    Node result = peephole.optimizeSubtree(num);
    Assert.assertSame(num, result);
  }

  @Test
  public void testReduceTrueFalse_lateTrue() {
    Node root = parseAndOptimize("var a = true; var b = false;", true);
    String source = toSource(root);
    Assert.assertTrue(source.contains("!0"));
    Assert.assertTrue(source.contains("!1"));
  }

  @Test
  public void testReduceTrueFalse_lateFalse() {
    Node root = parseAndOptimize("var a = true; var b = false;", false);
    String source = toSource(root);
    Assert.assertTrue(source.contains("true"));
    Assert.assertTrue(source.contains("false"));
  }

  @Test
  public void testMinimizeNot_operators() {
    Node root = parseAndOptimize("var a = !(x == y); var b = !(x != y); var c = !(x === y); var d = !(x !== y); var e = !(x > y);", false);
    String source = toSource(root);
    Assert.assertTrue(source.contains("x != y"));
    Assert.assertTrue(source.contains("x == y"));
    Assert.assertTrue(source.contains("x !== y"));
    Assert.assertTrue(source.contains("x === y"));
    Assert.assertTrue(source.contains("!(x > y)"));
  }

  @Test
  public void testMinimizeCondition_deMorgansAndDoubleNot() {
    Node root1 = parseAndOptimize("if (!(!a)) { foo(); }", false);
    Assert.assertTrue(toSource(root1).contains("a && foo()"));

    Node root2 = parseAndOptimize("if (!(a || b)) { foo(); }", false);
    Assert.assertTrue(toSource(root2).contains("!a && !b && foo()"));

    Node root3 = parseAndOptimize("if (!(!a && !b)) { foo(); }", false);
    Assert.assertTrue(toSource(root3).contains("(a || b) && foo()"));

    Node root4 = parseAndOptimize("if (!(!a || b)) { foo(); }", false);
    Assert.assertTrue(toSource(root4).contains("a && !b && foo()"));

    Node root5 = parseAndOptimize("if (!(a && !b)) { foo(); }", false);
    Assert.assertTrue(toSource(root5).contains("(!a || b) && foo()"));

    Node root6 = parseAndOptimize("if (!true) { foo(); }", false);
    Assert.assertTrue(toSource(root6).contains("0"));
  }

  @Test
  public void testMinimizeCondition_andOrShortCircuits() {
    Node root1 = parseAndOptimize("if (x || false) { foo(); }", false);
    Assert.assertTrue(toSource(root1).contains("x && foo()"));

    Node root2 = parseAndOptimize("if (x && true) { foo(); }", false);
    Assert.assertTrue(toSource(root2).contains("x && foo()"));

    Node root3 = parseAndOptimize("if (x && false) { foo(); }", false);
    Assert.assertTrue(toSource(root3).contains("0 && foo()"));

    Node root4 = parseAndOptimize("if (x || true) { foo(); }", false);
    Assert.assertTrue(toSource(root4).contains("1 && foo()"));
  }

  @Test
  public void testMinimizeCondition_hookExpressions() {
    Node root1 = parseAndOptimize("if (x ? true : false) { foo(); }", false);
    Assert.assertTrue(toSource(root1).contains("x && foo()"));

    Node root2 = parseAndOptimize("if (x ? false : true) { foo(); }", false);
    Assert.assertTrue(toSource(root2).contains("!x && foo()"));

    Node root3 = parseAndOptimize("if (x ? true : y) { foo(); }", false);
    Assert.assertTrue(toSource(root3).contains("(x || y) && foo()"));

    Node root4 = parseAndOptimize("if (x ? y : false) { foo(); }", false);
    Assert.assertTrue(toSource(root4).contains("x && y && foo()"));
  }

  @Test
  public void testMinimizeCondition_loops() {
    Node rootWhile = parseAndOptimize("while (true) { foo(); }", false);
    Assert.assertTrue(toSource(rootWhile).contains("while (1)"));

    Node rootDoWhile = parseAndOptimize("do { foo(); } while (true);", false);
    Assert.assertTrue(toSource(rootDoWhile).contains("while (1)"));
  }

  @Test
  public void testTryMinimizeIf_toAndOrHook() {
    Node root1 = parseAndOptimize("if (x) { foo(); }", false);
    Assert.assertTrue(toSource(root1).contains("x && foo()"));

    Node root2 = parseAndOptimize("if (!x) { foo(); }", false);
    Assert.assertTrue(toSource(root2).contains("x || foo()"));

    Node root3 = parseAndOptimize("if (!x) { foo(); } else { bar(); }", false);
    Assert.assertTrue(toSource(root3).contains("if (x) bar(); else foo()"));

    Node root4 = parseAndOptimize("if (x) { a = 1; } else { a = 2; }", false);
    Assert.assertTrue(toSource(root4).contains("a = x ? 1 : 2"));

    Node root5 = parseAndOptimize("if (x) { foo(); } else { bar(); }", false);
    Assert.assertTrue(toSource(root5).contains("x ? foo() : bar()"));

    Node root6 = parseAndOptimize("if (x) { var y = 1; } else { y = 2; }", false);
    Assert.assertTrue(toSource(root6).contains("var y = x ? 1 : 2"));

    Node root7 = parseAndOptimize("if (x) { y = 1; } else { var y = 2; }", false);
    Assert.assertTrue(toSource(root7).contains("var y = x ? 1 : 2"));

    Node root8 = parseAndOptimize("if (x) { if (y) { foo(); } }", false);
    Assert.assertTrue(toSource(root8).contains("x && y && foo()"));

    Node root9 = parseAndOptimize("if (x) { return 1; } else { return 2; }", false);
    Assert.assertTrue(toSource(root9).contains("return x ? 1 : 2"));
  }

  @Test
  public void testTryRemoveRepeatedStatements() {
    Node root = parseAndOptimize("if (a) { x = 1; return true; } else { x = 2; return true; }", false);
    String source = toSource(root);
    Assert.assertTrue(source.contains("return true"));
  }

  @Test
  public void testTryReplaceIf_blockOptimizations() {
    Node root1 = parseAndOptimize("function f() { if (x) return 1; if (y) return 1; }", false);
    Assert.assertTrue(toSource(root1).contains("if (x || y) return 1"));

    Node root2 = parseAndOptimize("function f() { if (x) return 1; if (y) foo(); else return 1; }", false);
    Assert.assertTrue(toSource(root2).contains("if (!x && y) foo(); else return 1"));

    Node root3 = parseAndOptimize("function f() { if (x) return 1; return 2; }", false);
    Assert.assertTrue(toSource(root3).contains("return x ? 1 : 2"));

    Node root4 = parseAndOptimize("function f() { if (x) return; return 1; }", false);
    Assert.assertTrue(toSource(root4).contains("return x ? void 0 : 1"));

    Node root5 = parseAndOptimize("function f() { if (x) { return 1; } else { y = 2; } }", false);
    String source5 = toSource(root5);
    Assert.assertTrue(source5.contains("if (x) return 1;"));
    Assert.assertTrue(source5.contains("y = 2;"));
  }

  @Test
  public void testTryReduceReturn_andExitReplacement() {
    Node root1 = parseAndOptimize("function f() { return undefined; }", false);
    Assert.assertTrue(toSource(root1).contains("return;"));

    Node root2 = parseAndOptimize("function f() { return void 0; }", false);
    Assert.assertTrue(toSource(root2).contains("return;"));

    Node root3 = parseAndOptimize("function f() { while (a) { return 1; } return 1; }", false);
    Assert.assertTrue(toSource(root3).contains("break"));

    Node root4 = parseAndOptimize("function f() { if (a) { return 1; } return 1; }", false);
    String source4 = toSource(root4);
    Assert.assertFalse(source4.contains("return 1; } return 1"));
  }

  @Test
  public void testTryJoinForCondition() {
    Node root1 = parseAndOptimize("for (; a; ) { if (b) break; }", true);
    Assert.assertTrue(toSource(root1).contains("a && !b"));

    Node root2 = parseAndOptimize("for (;;) { if (b) break; }", true);
    Assert.assertTrue(toSource(root2).contains("for (; !b;)"));

    Node root3 = parseAndOptimize("for (; a; ) { if (b) break; else { foo(); } }", true);
    Assert.assertTrue(toSource(root3).contains("foo()"));
  }

  @Test
  public void testTrySplitComma() {
    Node rootLateFalse = parseAndOptimize("a, b;", false);
    Assert.assertEquals("a; b;\n", toSource(rootLateFalse));

    Node rootLateTrue = parseAndOptimize("a, b;", true);
    Assert.assertTrue(toSource(rootLateTrue).contains("a, b;"));
  }

  @Test
  public void testTryReplaceUndefined() {
    Node root = parseAndNormalizeAndOptimize("var x = undefined;", false);
    Assert.assertTrue(toSource(root).contains("void 0"));
  }

  @Test
  public void testTryFoldSimpleFunctionCall_String() {
    Node root = parseAndOptimize("var x = String(123);", false);
    Assert.assertTrue(toSource(root).contains("\"\" + 123"));
  }

  @Test
  public void testTryFoldImmediateCallToBoundFunction() {
    Node root = parseAndOptimize("(fn.bind(obj, 1, 2))();", false);
    Assert.assertTrue(toSource(root).contains("fn.call(obj, 1, 2)"));
  }

  @Test
  public void testTryFoldStandardConstructors_andLiterals() {
    Node rootObj = parseAndNormalizeAndOptimize("var a = new Object(); var b = Object();", false);
    String srcObj = toSource(rootObj);
    Assert.assertTrue(srcObj.contains("var a = {}"));
    Assert.assertTrue(srcObj.contains("var b = {}"));

    Node rootArr = parseAndNormalizeAndOptimize("var a = new Array(); var b = Array(); var c = Array('x'); var d = Array(0); var e = Array(1, 2); var f = Array([1]);", false);
    String srcArr = toSource(rootArr);
    Assert.assertTrue(srcArr.contains("var a = []"));
    Assert.assertTrue(srcArr.contains("var b = []"));
    Assert.assertTrue(srcArr.contains("var c = [\"x\"]"));
    Assert.assertTrue(srcArr.contains("var d = []"));
    Assert.assertTrue(srcArr.contains("var e = [1, 2]"));
    Assert.assertTrue(srcArr.contains("var f = [[1]]"));
  }

  @Test
  public void testTryFoldRegularExpressionConstructor() {
    Node root1 = parseAndNormalizeAndOptimize("var r = new RegExp('abc', 'i');", false);
    Assert.assertTrue(toSource(root1).contains("/abc/i"));

    Node root2 = parseAndNormalizeAndOptimize("var r = new RegExp('abc');", false);
    Assert.assertTrue(toSource(root2).contains("/abc/"));

    Node rootSlash = parseAndNormalizeAndOptimize("var r = new RegExp('a/b\\n');", false);
    Assert.assertTrue(toSource(rootSlash).contains("/a\\/b\\n/"));

    Node rootInvalid = parseAndNormalizeAndOptimize("var r = new RegExp('abc', 'invalid');", false);
    Assert.assertTrue(toSource(rootInvalid).contains("RegExp"));
  }

  @Test
  public void testTryMinimizeStringArrayLiteral() {
    Node root = parseAndOptimize("var arr = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'];", true);
    Assert.assertTrue(toSource(root).contains(".split("));

    Node rootLateFalse = parseAndOptimize("var arr = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'];", false);
    Assert.assertFalse(toSource(rootLateFalse).contains(".split("));

    Node rootMixed = parseAndOptimize("var arr = ['a', 1, 'c'];", true);
    Assert.assertFalse(toSource(rootMixed).contains(".split("));
  }

  @Test
  public void testContainsUnicodeEscape() {
    Assert.assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\u0000"));
    Assert.assertFalse(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("abc"));
  }

  @Test
  public void testPredicate_dontTraverseFunctions() {
    Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
    Node notFn = IR.name("x");
    Assert.assertFalse(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE.apply(fn));
    Assert.assertTrue(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE.apply(notFn));
  }

  @Test
  public void testIsPure() {
    PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);
    Assert.assertTrue(peephole.isPure(null));
    Assert.assertTrue(peephole.isPure(IR.number(5)));
    Assert.assertTrue(peephole.isPure(IR.string("hello")));
    Assert.assertFalse(peephole.isPure(IR.call(IR.name("foo"))));
  }

  @Test
  public void testIsExceptionPossible() {
    PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);
    Node throwNode = IR.throwNode(IR.string("error"));
    Assert.assertTrue(peephole.isExceptionPossible(throwNode));

    Node returnLit = IR.returnNode(IR.number(1));
    Assert.assertFalse(peephole.isExceptionPossible(returnLit));

    Node returnCall = IR.returnNode(IR.call(IR.name("foo")));
    Assert.assertTrue(peephole.isExceptionPossible(returnCall));
  }

  @Test(expected = IllegalStateException.class)
  public void testIsExceptionPossible_invalidNode() {
    PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);
    peephole.isExceptionPossible(IR.exprResult(IR.number(1)));
  }

  @Test
  public void testAreMatchingExits_andGetExceptionHandler() {
    PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);
    Node ret1 = IR.returnNode(IR.number(1));
    Node ret2 = IR.returnNode(IR.number(1));
    Node ret3 = IR.returnNode(IR.number(2));

    Assert.assertTrue(peephole.areMatchingExits(ret1, ret2));
    Assert.assertFalse(peephole.areMatchingExits(ret1, ret3));
    Assert.assertNull(peephole.getExceptionHandler(ret1));
  }

  @Test
  public void testSkipFinallyNodes() {
    PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);
    Assert.assertNull(peephole.skipFinallyNodes(null));
    Node num = IR.number(1);
    Assert.assertSame(num, peephole.skipFinallyNodes(num));
  }
}
