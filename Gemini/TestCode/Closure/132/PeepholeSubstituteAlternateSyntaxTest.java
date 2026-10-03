package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class PeepholeSubstituteAlternateSyntaxTest {

  private Node parseAndFold(String js, boolean late, boolean normalize) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node root = compiler.parseTestCode(js);
    if (normalize) {
      NodeUtil.markNewScopesRoot(root, compiler);
      compiler.setNormalized();
    }
    PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(late);
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, peephole);
    pass.process(null, root);
    return root;
  }

  private String toSource(Node n) {
    Compiler compiler = new Compiler();
    return compiler.toSource(n);
  }

  @Test
  public void testOptimizeSubtree_defaultUnchanged() {
    Compiler compiler = new Compiler();
    PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);
    Node emptyNode = IR.empty();
    Node result = peephole.optimizeSubtree(emptyNode);
    Assert.assertSame(emptyNode, result);
  }

  @Test
  public void testTrueFalseReduction_lateMode() {
    Node foldedTrue = parseAndFold("var x = true;", true, false);
    String srcTrue = toSource(foldedTrue);
    Assert.assertTrue(srcTrue.contains("!0"));

    Node foldedFalse = parseAndFold("var x = false;", true, false);
    String srcFalse = toSource(foldedFalse);
    Assert.assertTrue(srcFalse.contains("!1"));

    Node foldedEarly = parseAndFold("var x = true;", false, false);
    String srcEarly = toSource(foldedEarly);
    Assert.assertTrue(srcEarly.contains("true"));
  }

  @Test
  public void testFoldReturnUndefined() {
    Node root = parseAndFold("function f() { return undefined; }", false, false);
    String src = toSource(root);
    Assert.assertTrue(src.contains("return"));
    Assert.assertFalse(src.contains("undefined"));

    Node rootVoid = parseAndFold("function f() { return void 0; }", false, false);
    String srcVoid = toSource(rootVoid);
    Assert.assertTrue(srcVoid.contains("return;"));

    Node rootVoidSideEffect = parseAndFold("function f() { return void g(); }", false, false);
    String srcVoidSideEffect = toSource(rootVoidSideEffect);
    Assert.assertTrue(srcVoidSideEffect.contains("void g()"));
  }

  @Test
  public void testRedundantExitRemoval() {
    Node root = parseAndFold("function f() { if (a) { return 1; } return 1; }", false, false);
    String src = toSource(root);
    Assert.assertNotNull(src);

    Node rootVoid = parseAndFold("function f() { return; }", false, false);
    String srcVoid = toSource(rootVoid);
    Assert.assertFalse(srcVoid.contains("return;"));
  }

  @Test
  public void testReplaceExitWithBreak() {
    Node root = parseAndFold("function f() { while (a) { return f(); } return f(); }", false, false);
    String src = toSource(root);
    Assert.assertTrue(src.contains("break"));

    Node rootThrow = parseAndFold("function f() { while (a) { throw 'err'; } throw 'err'; }", false, false);
    String srcThrow = toSource(rootThrow);
    Assert.assertTrue(srcThrow.contains("break"));
  }

  @Test
  public void testMinimizeNotOperators() {
    Node eq = parseAndFold("if (!(x == y)) foo();", false, false);
    Assert.assertTrue(toSource(eq).contains("x != y"));

    Node ne = parseAndFold("if (!(x != y)) foo();", false, false);
    Assert.assertTrue(toSource(ne).contains("x == y"));

    Node sheq = parseAndFold("if (!(x === y)) foo();", false, false);
    Assert.assertTrue(toSource(sheq).contains("x !== y"));

    Node shne = parseAndFold("if (!(x !== y)) foo();", false, false);
    Assert.assertTrue(toSource(shne).contains("x === y"));

    Node gt = parseAndFold("if (!(x > y)) foo();", false, false);
    Assert.assertTrue(toSource(gt).contains("!(x > y)"));
  }

  @Test
  public void testMinimizeCondition() {
    Node doubleNot = parseAndFold("if (!!x) foo();", false, false);
    Assert.assertTrue(toSource(doubleNot).contains("if(x)"));

    Node deMorganAnd = parseAndFold("if (!(x && y)) foo();", false, false);
    String srcAnd = toSource(deMorganAnd);
    Assert.assertTrue(srcAnd.contains("!x || !y"));

    Node deMorganOr = parseAndFold("if (!(x || y)) foo();", false, false);
    String srcOr = toSource(deMorganOr);
    Assert.assertTrue(srcOr.contains("!x && !y"));

    Node deMorganNotLeft = parseAndFold("if (!(!x && y)) foo();", false, false);
    Assert.assertTrue(toSource(deMorganNotLeft).contains("x || !y"));

    Node deMorganNotRight = parseAndFold("if (!(x && !y)) foo();", false, false);
    Assert.assertTrue(toSource(deMorganNotRight).contains("!x || y"));

    Node hookTrueFalse = parseAndFold("if (x ? true : false) foo();", false, false);
    Assert.assertTrue(toSource(hookTrueFalse).contains("if(x)"));

    Node hookFalseTrue = parseAndFold("if (x ? false : true) foo();", false, false);
    Assert.assertTrue(toSource(hookFalseTrue).contains("if(!x)"));

    Node hookTrueY = parseAndFold("if (x ? true : y) foo();", false, false);
    Assert.assertTrue(toSource(hookTrueY).contains("x || y"));

    Node hookYFalse = parseAndFold("if (x ? y : false) foo();", false, false);
    Assert.assertTrue(toSource(hookYFalse).contains("x && y"));

    Node whileTrue = parseAndFold("while (true) {}", false, false);
    Assert.assertTrue(toSource(whileTrue).contains("while(1)"));

    Node whileFalse = parseAndFold("while (false) {}", false, false);
    Assert.assertTrue(toSource(whileFalse).contains("while(0)"));

    Node doWhile = parseAndFold("do {} while (true);", false, false);
    Assert.assertTrue(toSource(doWhile).contains("while(1)"));

    Node orFalse = parseAndFold("if (x || false) foo();", false, false);
    Assert.assertTrue(toSource(orFalse).contains("if(x)"));

    Node andTrue = parseAndFold("if (x && true) foo();", false, false);
    Assert.assertTrue(toSource(andTrue).contains("if(x)"));

    Node andFalse = parseAndFold("if (x && false) foo();", false, false);
    Assert.assertTrue(toSource(andFalse).contains("0"));
  }

  @Test
  public void testMinimizeIf() {
    Node simpleIf = parseAndFold("if (x) foo();", false, false);
    Assert.assertTrue(toSource(simpleIf).contains("x && foo()"));

    Node notIf = parseAndFold("if (!x) foo();", false, false);
    Assert.assertTrue(toSource(notIf).contains("x || foo()"));

    Node nestedIf = parseAndFold("if (x) { if (y) foo(); }", false, false);
    Assert.assertTrue(toSource(nestedIf).contains("x && y && foo()"));

    Node ifElseNot = parseAndFold("if (!x) foo(); else bar();", false, false);
    Assert.assertTrue(toSource(ifElseNot).contains("if(x)bar();else foo()"));

    Node returnHook = parseAndFold("function f() { if (x) return 1; else return 2; }", false, false);
    Assert.assertTrue(toSource(returnHook).contains("return x ? 1 : 2"));

    Node assignHook = parseAndFold("if (x) a = 1; else a = 2;", false, false);
    Assert.assertTrue(toSource(assignHook).contains("a = x ? 1 : 2"));

    Node exprHook = parseAndFold("if (x) foo(); else bar();", false, false);
    Assert.assertTrue(toSource(exprHook).contains("x ? foo() : bar()"));

    Node varThenHook = parseAndFold("if (x) var y = 1; else y = 2;", false, false);
    Assert.assertTrue(toSource(varThenHook).contains("var y = x ? 1 : 2"));

    Node varElseHook = parseAndFold("if (x) y = 1; else var y = 2;", false, false);
    Assert.assertTrue(toSource(varElseHook).contains("var y = x ? 1 : 2"));

    Node repeatedStmt = parseAndFold("if (x) { a = 1; return true; } else { a = 2; return true; }", false, false);
    String repSrc = toSource(repeatedStmt);
    Assert.assertTrue(repSrc.contains("return true") || repSrc.contains("return!0"));
  }

  @Test
  public void testReplaceIfInBlock() {
    Node joinOr = parseAndFold("function f() { if (x) return 1; if (y) return 1; }", false, false);
    Assert.assertTrue(toSource(joinOr).contains("x || y"));

    Node joinAnd = parseAndFold("function f() { if (x) return 1; if (y) foo(); else return 1; }", false, false);
    Assert.assertTrue(toSource(joinAnd).contains("!x && y"));

    Node returnHook2 = parseAndFold("function f() { if (x) return 1; return 2; }", false, false);
    Assert.assertTrue(toSource(returnHook2).contains("return x ? 1 : 2"));

    Node returnHookUndef = parseAndFold("function f() { if (x) return; return 1; }", false, false);
    Assert.assertTrue(toSource(returnHookUndef).contains("return x ? void 0 : 1"));

    Node moveElse = parseAndFold("function f() { if (x) { return 1; } else { foo(); } }", false, false);
    String srcMoveElse = toSource(moveElse);
    Assert.assertFalse(srcMoveElse.contains("else"));
  }

  @Test
  public void testTryJoinForCondition() {
    Node forLate = parseAndFold("for (;;) { if (x) break; foo(); }", true, false);
    Assert.assertTrue(toSource(forLate).contains("for(;!x;)"));

    Node forWithCondLate = parseAndFold("for (;y;) { if (x) break; foo(); }", true, false);
    Assert.assertTrue(toSource(forWithCondLate).contains("y && !x"));

    Node forElseLate = parseAndFold("for (;;) { if (x) break; else bar(); foo(); }", true, false);
    Assert.assertTrue(toSource(forElseLate).contains("bar()"));

    Node forEarly = parseAndFold("for (;;) { if (x) break; foo(); }", false, false);
    Assert.assertTrue(toSource(forEarly).contains("if(x)break"));
  }

  @Test
  public void testStandardConstructorsFolding() {
    Node foldedObj = parseAndFold("var x = new Object();", false, true);
    Assert.assertTrue(toSource(foldedObj).contains("{}"));

    Node foldedArr = parseAndFold("var x = new Array();", false, true);
    Assert.assertTrue(toSource(foldedArr).contains("[]"));

    Node foldedArrArgs = parseAndFold("var x = new Array(1, 2, 3);", false, true);
    Assert.assertTrue(toSource(foldedArrArgs).contains("[1, 2, 3]"));

    Node foldedArrSingleStr = parseAndFold("var x = new Array('hello');", false, true);
    Assert.assertTrue(toSource(foldedArrSingleStr).contains("['hello']"));

    Node foldedArrZero = parseAndFold("var x = new Array(0);", false, true);
    Assert.assertTrue(toSource(foldedArrZero).contains("[]"));

    Node foldedArrLit = parseAndFold("var x = new Array([1, 2]);", false, true);
    Assert.assertTrue(toSource(foldedArrLit).contains("[[1, 2]]"));

    Node foldedCallArr = parseAndFold("var x = Array('a', 'b');", false, true);
    Assert.assertTrue(toSource(foldedCallArr).contains("['a', 'b']"));
  }

  @Test
  public void testFoldRegularExpressionConstructor() {
    Node foldedReg = parseAndFold("var x = new RegExp('foobar', 'i');", false, true);
    Assert.assertTrue(toSource(foldedReg).contains("/foobar/i"));

    Node foldedRegNoFlags = parseAndFold("var x = new RegExp('foobar');", false, true);
    Assert.assertTrue(toSource(foldedRegNoFlags).contains("/foobar/"));

    Node slashEscaped = parseAndFold("var x = new RegExp('foo/bar');", false, true);
    Assert.assertTrue(toSource(slashEscaped).contains("/foo\\/bar/"));

    Node lineTerminator = parseAndFold("var x = new RegExp('foo\\nbar');", false, true);
    Assert.assertTrue(toSource(lineTerminator).contains("/foo\\nbar/"));

    Node invalidFlags = parseAndFold("var x = new RegExp('foobar', 'invalid');", false, true);
    Assert.assertTrue(toSource(invalidFlags).contains("RegExp"));
  }

  @Test
  public void testFoldSimpleFunctionCall() {
    Node strLit = parseAndFold("var x = String('abc');", false, false);
    Assert.assertTrue(toSource(strLit).contains("'' + 'abc'") || toSource(strLit).contains("\"\" + \"abc\""));

    Node strNum = parseAndFold("var x = String(123);", false, false);
    Assert.assertTrue(toSource(strNum).contains("'' + 123") || toSource(strNum).contains("\"\" + 123"));

    Node strVar = parseAndFold("var x = String(y);", false, false);
    Assert.assertTrue(toSource(strVar).contains("String(y)"));
  }

  @Test
  public void testFoldImmediateCallToBoundFunction() {
    Node bound = parseAndFold("goog.bind(fn, obj, a, b)();", false, false);
    String src = toSource(bound);
    Assert.assertTrue(src.contains("fn.call(obj, a, b)"));

    Node boundNoThis = parseAndFold("goog.bind(fn, null, a)();", false, false);
    String srcNoThis = toSource(boundNoThis);
    Assert.assertNotNull(srcNoThis);
  }

  @Test
  public void testSplitComma_earlyMode() {
    Node comma = parseAndFold("a(), b();", false, false);
    String src = toSource(comma);
    Assert.assertTrue(src.contains("a();") && src.contains("b();"));

    Node commaLate = parseAndFold("a(), b();", true, false);
    Assert.assertTrue(toSource(commaLate).contains("a(), b()"));
  }

  @Test
  public void testReplaceUndefined() {
    Node undef = parseAndFold("var x = undefined;", false, true);
    Assert.assertTrue(toSource(undef).contains("void 0"));
  }

  @Test
  public void testMinimizeArrayLiteral_lateMode() {
    Node strArr = parseAndFold("var x = ['alpha', 'beta', 'gamma', 'delta', 'epsilon', 'zeta', 'eta', 'theta'];", true, false);
    String src = toSource(strArr);
    Assert.assertTrue(src.contains(".split("));

    Node singleCharArr = parseAndFold("var x = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'];", true, false);
    String srcSingle = toSource(singleCharArr);
    Assert.assertTrue(srcSingle.contains(".split(\"\")") || srcSingle.contains(".split('')"));

    Node mixedArr = parseAndFold("var x = ['a', 1, 'c'];", true, false);
    Assert.assertFalse(toSource(mixedArr).contains(".split"));
  }

  @Test
  public void testContainsUnicodeEscape() {
    Assert.assertFalse(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("abc"));
    Assert.assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\u0000"));
    Assert.assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\uFFFF"));
  }

  @Test
  public void testPredicateAndHelperMethods() {
    Node func = IR.function(IR.name("f"), IR.paramList(), IR.block());
    Node nonFunc = IR.name("x");
    Assert.assertFalse(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE.apply(func));
    Assert.assertTrue(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE.apply(nonFunc));

    PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(false);
    Assert.assertTrue(opt.isPure(null));
    Assert.assertTrue(opt.isPure(IR.number(42)));
    Assert.assertFalse(opt.isPure(IR.call(IR.name("fn"))));

    Node ret = IR.returnNode(IR.number(1));
    Node sameRet = IR.returnNode(IR.number(1));
    Node diffRet = IR.returnNode(IR.number(2));
    Assert.assertTrue(opt.areMatchingExits(ret, sameRet));
    Assert.assertFalse(opt.areMatchingExits(ret, diffRet));

    Assert.assertFalse(opt.isExceptionPossible(ret));
    Assert.assertTrue(opt.isExceptionPossible(IR.throwNode(IR.string("error"))));
    Assert.assertNull(opt.skipFinallyNodes(null));
  }
}
