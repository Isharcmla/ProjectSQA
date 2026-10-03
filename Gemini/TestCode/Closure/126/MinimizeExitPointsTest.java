package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimizeExitPointsTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private Node parseAndProcess(String js) {
    Node root = compiler.parseTestCode(js);
    MinimizeExitPoints pass = new MinimizeExitPoints(compiler);
    pass.process(null, root);
    return root;
  }

  @Test
  public void testProcess_functionWithRedundantReturn_removesReturn() {
    Node root = parseAndProcess("function f() { return; }");
    Node fn = root.getFirstChild();
    Node body = fn.getLastChild();
    Assert.assertEquals(0, body.getChildCount());
  }

  @Test
  public void testProcess_functionWithReturnVal_doesNotRemoveReturn() {
    Node root = parseAndProcess("function f() { return 1; }");
    Node fn = root.getFirstChild();
    Node body = fn.getLastChild();
    Assert.assertEquals(1, body.getChildCount());
    Assert.assertTrue(body.getFirstChild().isReturn());
    Assert.assertTrue(body.getFirstChild().hasChildren());
  }

  @Test
  public void testProcess_ifReturn_movesFollowingStatementsToElse() {
    Node root = parseAndProcess("function f() { if (x) return; foo(); }");
    Node fn = root.getFirstChild();
    Node body = fn.getLastChild();
    Assert.assertEquals(1, body.getChildCount());
    Node ifNode = body.getFirstChild();
    Assert.assertTrue(ifNode.isIf());
    Node elseBlock = ifNode.getLastChild();
    Assert.assertTrue(elseBlock.isBlock());
    Assert.assertEquals(1, elseBlock.getChildCount());
  }

  @Test
  public void testProcess_ifElseWithReturn_movesFollowingStatementsToIfBlock() {
    Node root = parseAndProcess("function f() { if (x) foo(); else return; bar(); }");
    Node fn = root.getFirstChild();
    Node body = fn.getLastChild();
    Assert.assertEquals(1, body.getChildCount());
    Node ifNode = body.getFirstChild();
    Assert.assertTrue(ifNode.isIf());
    Node thenBlock = ifNode.getFirstChild().getNext();
    Assert.assertTrue(thenBlock.isBlock());
    Assert.assertEquals(2, thenBlock.getChildCount());
  }

  @Test
  public void testProcess_ifElseBothBlocksExist_movesStatementsCorrectly() {
    Node root = parseAndProcess("function f() { if (x) { return; } else { foo(); } bar(); }");
    Node fn = root.getFirstChild();
    Node body = fn.getLastChild();
    Assert.assertEquals(1, body.getChildCount());
  }

  @Test
  public void testProcess_ifWithEmptyElse_movesStatements() {
    Node root = parseAndProcess("function f() { if (x) return; else ; bar(); }");
    Node fn = root.getFirstChild();
    Node body = fn.getLastChild();
    Assert.assertEquals(1, body.getChildCount());
  }

  @Test
  public void testProcess_followingFunctionDeclaration_movesToFront() {
    Node root = parseAndProcess("function f() { if (x) return; bar(); function g() {} }");
    Node fn = root.getFirstChild();
    Node body = fn.getLastChild();
    Assert.assertEquals(1, body.getChildCount());
    Node ifNode = body.getFirstChild();
    Node elseBlock = ifNode.getLastChild();
    Assert.assertTrue(elseBlock.getFirstChild().isFunction());
  }

  @Test
  public void testProcess_multipleIfExits_convertedInSinglePass() {
    Node root = parseAndProcess("function f() { if (a) return; if (b) return; foo(); }");
    Node fn = root.getFirstChild();
    Node body = fn.getLastChild();
    Assert.assertEquals(1, body.getChildCount());
  }

  @Test
  public void testProcess_whileLoopContinue_removesContinue() {
    Node root = parseAndProcess("while (true) { if (x) continue; foo(); }");
    Node whileNode = root.getFirstChild();
    Node body = whileNode.getLastChild();
    Assert.assertEquals(1, body.getChildCount());
  }

  @Test
  public void testProcess_forLoopContinue_removesContinue() {
    Node root = parseAndProcess("for (var i = 0; i < 10; i++) { if (x) continue; foo(); }");
    Node forNode = root.getFirstChild();
    Node body = forNode.getLastChild();
    Assert.assertEquals(1, body.getChildCount());
  }

  @Test
  public void testProcess_doWhileFalseBreak_removesBreak() {
    Node root = parseAndProcess("do { if (x) break; foo(); } while (false);");
    Node doNode = root.getFirstChild();
    Node body = doNode.getFirstChild();
    Assert.assertEquals(1, body.getChildCount());
  }

  @Test
  public void testProcess_doWhileTrueBreak_doesNotRemoveBreak() {
    Node root = parseAndProcess("do { if (x) break; foo(); } while (true);");
    Node doNode = root.getFirstChild();
    Node body = doNode.getFirstChild();
    Assert.assertEquals(2, body.getChildCount());
  }

  @Test
  public void testProcess_labelBreak_removesMatchingBreak() {
    Node root = parseAndProcess("myLabel: { if (x) break myLabel; foo(); }");
    Node labelNode = root.getFirstChild();
    Node body = labelNode.getLastChild();
    Assert.assertEquals(1, body.getChildCount());
  }

  @Test
  public void testProcess_labelBreak_nonMatchingLabelNotRemoved() {
    Node root = parseAndProcess("outer: myLabel: { if (x) break outer; foo(); }");
    Node outerLabel = root.getFirstChild();
    Node innerLabel = outerLabel.getLastChild();
    Node body = innerLabel.getLastChild();
    Assert.assertEquals(2, body.getChildCount());
  }

  @Test
  public void testProcess_tryCatchFinally_minimizesExits() {
    Node root = parseAndProcess(
        "function f() { try { return; } catch (e) { return; } finally { return; } }");
    Node fn = root.getFirstChild();
    Node body = fn.getLastChild();
    Assert.assertEquals(1, body.getChildCount());
    Node tryNode = body.getFirstChild();
    Assert.assertTrue(tryNode.isTry());
    Node tryBlock = tryNode.getFirstChild();
    Assert.assertEquals(0, tryBlock.getChildCount());
    Node catchBlock = tryNode.getFirstChild().getNext();
    Node catchBody = catchBlock.getFirstChild().getLastChild();
    Assert.assertEquals(0, catchBody.getChildCount());
    Node finallyBlock = tryNode.getLastChild();
    Assert.assertEquals(0, finallyBlock.getChildCount());
  }

  @Test
  public void testProcess_tryWithoutCatch_minimizesTryAndFinally() {
    Node root = parseAndProcess("function f() { try { return; } finally { foo(); } }");
    Node fn = root.getFirstChild();
    Node tryNode = fn.getLastChild().getFirstChild();
    Assert.assertEquals(0, tryNode.getFirstChild().getChildCount());
  }

  @Test
  public void testProcess_nestedLabelInFunction_minimizesLabelExits() {
    Node root = parseAndProcess("function f() { lbl: { if (x) break lbl; foo(); } }");
    Node fn = root.getFirstChild();
    Node body = fn.getLastChild();
    Node lbl = body.getFirstChild();
    Assert.assertEquals(1, lbl.getLastChild().getChildCount());
  }

  @Test
  public void testTryMinimizeExits_nonBlockNode_returnsSafely() {
    MinimizeExitPoints pass = new MinimizeExitPoints(compiler);
    Node num = IR.number(1);
    pass.tryMinimizeExits(num, Token.RETURN, null);
    Assert.assertEquals(Token.NUMBER, num.getType());
  }

  @Test
  public void testTryMinimizeExits_emptyBlock_returnsSafely() {
    MinimizeExitPoints pass = new MinimizeExitPoints(compiler);
    Node block = IR.block();
    pass.tryMinimizeExits(block, Token.RETURN, null);
    Assert.assertEquals(0, block.getChildCount());
  }

  @Test
  public void testTryMinimizeExits_matchingDirectExit_removesFromParent() {
    MinimizeExitPoints pass = new MinimizeExitPoints(compiler);
    Node ret = IR.returnNode();
    Node block = IR.block(ret);
    pass.tryMinimizeExits(ret, Token.RETURN, null);
    Assert.assertEquals(0, block.getChildCount());
  }

  @Test
  public void testVisit_nonTargetTokens_doNothing() {
    MinimizeExitPoints pass = new MinimizeExitPoints(compiler);
    Node expr = IR.exprResult(IR.number(42));
    NodeTraversal t = new NodeTraversal(compiler, pass);
    pass.visit(t, expr, null);
    Assert.assertEquals(Token.EXPR_RESULT, expr.getType());
  }
}
