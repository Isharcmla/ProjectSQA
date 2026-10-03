package com.google.javascript.jscomp;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class ControlFlowAnalysisTest {

  private ControlFlowAnalysis createAndRunCFA(String js, boolean traverseFunctions, boolean edgeAnnotations) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, traverseFunctions, edgeAnnotations);
    cfa.process(null, root);
    return cfa;
  }

  @Test
  public void testProcess_simpleStatements_createsCfg() {
    ControlFlowAnalysis cfa = createAndRunCFA("var x = 1; var y = 2;", true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
    Assert.assertNotNull(cfg.getEntry());
    Assert.assertNotNull(cfg.getImplicitReturn());
  }

  @Test
  public void testProcess_ifElseStatement_createsBranches() {
    ControlFlowAnalysis cfa = createAndRunCFA("if (a) { b(); } else { c(); }", true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_ifWithoutElse_createsFollowBranch() {
    ControlFlowAnalysis cfa = createAndRunCFA("if (a) { b(); } c();", true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_whileLoop_createsLoopEdges() {
    ControlFlowAnalysis cfa = createAndRunCFA("while (a) { b(); }", true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_doWhileLoop_createsEdges() {
    ControlFlowAnalysis cfa = createAndRunCFA("do { b(); } while (a);", true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_forLoopWithFourChildren_createsEdges() {
    ControlFlowAnalysis cfa = createAndRunCFA("for (var i = 0; i < 10; i++) { foo(); }", true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_forInLoop_createsEdges() {
    ControlFlowAnalysis cfa = createAndRunCFA("for (var k in obj) { foo(k); }", true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_switchCaseWithDefault_createsEdges() {
    String js = "switch (x) { case 1: a(); break; case 2: b(); default: c(); }";
    ControlFlowAnalysis cfa = createAndRunCFA(js, true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_switchCaseWithoutDefault_createsEdges() {
    String js = "switch (x) { case 1: a(); break; case 2: b(); }";
    ControlFlowAnalysis cfa = createAndRunCFA(js, true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_switchEmpty_createsEdges() {
    ControlFlowAnalysis cfa = createAndRunCFA("switch (x) {}", true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_switchWithOnlyDefault_createsEdges() {
    ControlFlowAnalysis cfa = createAndRunCFA("switch (x) { default: foo(); }", true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_tryCatchFinally_createsExceptionEdges() {
    String js = "try { foo(); } catch (e) { handle(e); } finally { cleanup(); }";
    ControlFlowAnalysis cfa = createAndRunCFA(js, true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_tryFinallyWithoutCatch_createsExceptionEdges() {
    String js = "try { foo(); } finally { cleanup(); }";
    ControlFlowAnalysis cfa = createAndRunCFA(js, true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_nestedTryCatchFinallyWithBreaksAndReturns_createsEdges() {
    String js = "while (x) {"
        + "  try {"
        + "    try {"
        + "      break;"
        + "    } catch (a) {"
        + "    } finally {"
        + "      foo();"
        + "    }"
        + "    fooFollow();"
        + "  } catch (b) {"
        + "  } finally {"
        + "    bar();"
        + "  }"
        + "  barFollow();"
        + "}"
        + "function f() {"
        + "  try { return 1; } finally { cleanup(); }"
        + "}";
    ControlFlowAnalysis cfa = createAndRunCFA(js, true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_labeledBreakAndContinue_createsEdges() {
    String js = "OUTER: for (var i = 0; i < 10; i++) {"
        + "  INNER: while (true) {"
        + "    if (i == 1) continue OUTER;"
        + "    if (i == 2) break OUTER;"
        + "    if (i == 3) continue INNER;"
        + "    if (i == 4) break INNER;"
        + "  }"
        + "}";
    ControlFlowAnalysis cfa = createAndRunCFA(js, true, false);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_withStatementAndThrow_createsEdges() {
    String js = "with (obj) { throw new Error('err'); }";
    ControlFlowAnalysis cfa = createAndRunCFA(js, true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_functionTraversed_innerFunctionsPrioritized() {
    String js = "function outer() { function inner() { var a = 1; } inner(); } outer();";
    ControlFlowAnalysis cfa = createAndRunCFA(js, true, true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);

    Comparator<DiGraphNode<Node, Branch>> forwardComp = cfg.getOptionalNodeComparator(true);
    Comparator<DiGraphNode<Node, Branch>> backwardComp = cfg.getOptionalNodeComparator(false);
    Assert.assertNotNull(forwardComp);
    Assert.assertNotNull(backwardComp);

    DiGraphNode<Node, Branch> entryNode = cfg.getEntry();
    DiGraphNode<Node, Branch> returnNode = cfg.getImplicitReturn();
    Assert.assertTrue(forwardComp.compare(entryNode, returnNode) < 0);
    Assert.assertTrue(backwardComp.compare(entryNode, returnNode) > 0);
  }

  @Test
  public void testProcess_functionNotTraversed_skipsInnerFunctions() {
    String js = "var x = 1; function f() { var y = 2; } var z = 3;";
    ControlFlowAnalysis cfa = createAndRunCFA(js, false, false);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testProcess_syntheticBlock_handled() {
    Compiler compiler = new Compiler();
    Node script = compiler.parseTestCode("var a = 1;");
    Node synBlock = IR.block();
    synBlock.setIsSyntheticBlock(true);
    synBlock.addChildToBack(IR.exprResult(IR.name("syn")));
    script.addChildToBack(synBlock);

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true, true);
    cfa.process(null, script);
    Assert.assertNotNull(cfa.getCfg());
  }

  @Test
  public void testProcess_breakWithoutValidTarget_throwsExceptionInNonIdeMode() {
    Compiler compiler = new Compiler();
    Node script = compiler.parseTestCode("break;");
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true, true);
    try {
      cfa.process(null, script);
      Assert.fail("Expected IllegalStateException for break without target");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().contains("Cannot find break target"));
    }
  }

  @Test
  public void testProcess_breakWithoutValidTarget_ignoredInIdeMode() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ideMode = true;
    compiler.initOptions(options);

    Node script = compiler.parseTestCode("break;");
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true, true);
    cfa.process(null, script);
    Assert.assertNotNull(cfa.getCfg());
  }

  @Test
  public void testComputeFollowNode_variousConstructs() {
    Compiler compiler = new Compiler();
    Node script = compiler.parseTestCode("function f() { if (a) { return 1; } else { return 2; } }");
    Node ifNode = script.getFirstChild().getLastChild().getFirstChild();

    Node follow = ControlFlowAnalysis.computeFollowNode(ifNode);
    Assert.assertNull(follow);

    Node nullFollow = ControlFlowAnalysis.computeFollowNode(script);
    Assert.assertNull(nullFollow);
  }

  @Test
  public void testComputeFallThrough_variousTypes() {
    Node varNode = IR.var(IR.name("a"));
    Assert.assertSame(varNode, ControlFlowAnalysis.computeFallThrough(varNode));

    Node doNode = IR.doNode(IR.block(IR.exprResult(IR.name("x"))), IR.name("cond"));
    Assert.assertSame(doNode.getFirstChild(), ControlFlowAnalysis.computeFallThrough(doNode));

    Node forNode = IR.forNode(IR.var(IR.name("i")), IR.name("cond"), IR.inc(IR.name("i"), false), IR.block());
    Assert.assertSame(forNode.getFirstChild(), ControlFlowAnalysis.computeFallThrough(forNode));

    Node forInNode = IR.forIn(IR.name("k"), IR.name("obj"), IR.block());
    Assert.assertSame(forInNode.getFirstChild().getNext(), ControlFlowAnalysis.computeFallThrough(forInNode));

    Node labelNode = IR.label(IR.labelName("L"), IR.exprResult(IR.name("y")));
    Assert.assertSame(labelNode.getLastChild(), ControlFlowAnalysis.computeFallThrough(labelNode));
  }

  @Test
  public void testIsBreakTarget_and_isBreakStructure() {
    Node forNode = IR.forNode(IR.var(IR.name("i")), IR.name("c"), IR.name("inc"), IR.block());
    Node labeledFor = IR.label(IR.labelName("LoopLabel"), forNode);

    Assert.assertTrue(ControlFlowAnalysis.isBreakTarget(forNode, null));
    Assert.assertTrue(ControlFlowAnalysis.isBreakTarget(forNode, "LoopLabel"));
    Assert.assertFalse(ControlFlowAnalysis.isBreakTarget(forNode, "OtherLabel"));

    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.FOR), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.DO), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.WHILE), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.SWITCH), false));
    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), true));
    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.IF), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.IF), true));
    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), true));
    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.VAR), true));
  }

  @Test
  public void testIsContinueStructure() {
    Assert.assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.FOR)));
    Assert.assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.DO)));
    Assert.assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.WHILE)));
    Assert.assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.SWITCH)));
    Assert.assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.IF)));
    Assert.assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.BLOCK)));
  }

  @Test
  public void testMayThrowException_allTokens() {
    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.CALL)));
    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.GETPROP)));
    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.GETELEM)));
    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.THROW)));
    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.NEW)));
    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.ASSIGN)));
    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.INC)));
    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.DEC)));
    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(new Node(Token.INSTANCEOF)));

    Node func = new Node(Token.FUNCTION);
    Assert.assertFalse(ControlFlowAnalysis.mayThrowException(func));

    Node block = IR.block(IR.exprResult(IR.call(IR.name("foo"))));
    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(block));

    Node safeBlock = IR.block(IR.number(1));
    Assert.assertFalse(ControlFlowAnalysis.mayThrowException(safeBlock));
  }

  @Test
  public void testGetExceptionHandler_and_getCatchHandlerForBlock() {
    Compiler compiler = new Compiler();
    Node script = compiler.parseTestCode("try { var x = 1; } catch (e) { var y = 2; }");
    Node tryNode = script.getFirstChild();
    Node tryBlock = tryNode.getFirstChild();
    Node stmtInTry = tryBlock.getFirstChild();

    Node catchHandler = ControlFlowAnalysis.getExceptionHandler(stmtInTry);
    Assert.assertNotNull(catchHandler);
    Assert.assertEquals(Token.BLOCK, catchHandler.getType());

    Node blockHandler = ControlFlowAnalysis.getCatchHandlerForBlock(tryBlock);
    Assert.assertNotNull(blockHandler);
    Assert.assertEquals(catchHandler, blockHandler);

    Node scriptNoCatch = compiler.parseTestCode("var x = 1;");
    Assert.assertNull(ControlFlowAnalysis.getExceptionHandler(scriptNoCatch.getFirstChild()));
    Assert.assertNull(ControlFlowAnalysis.getCatchHandlerForBlock(scriptNoCatch));
  }
}
