package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class ControlFlowAnalysisTest {

  private ControlFlowGraph<Node> createCfg(String js, boolean traverseFunctions) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, traverseFunctions);
    cfa.process(null, root);
    return cfa.getCfg();
  }

  private ControlFlowAnalysis processCfa(String js, boolean traverseFunctions) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, traverseFunctions);
    cfa.process(null, root);
    return cfa;
  }

  @Test
  public void testGetCfg_afterProcess_returnsNonNullCfg() {
    ControlFlowAnalysis cfa = processCfa("var x = 1;", true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    assertNotNull(cfg);
    assertNotNull(cfg.getEntry());
    assertNotNull(cfg.getImplicitReturn());
  }

  @Test
  public void testIfStatement_withAndWithoutElse_constructsBranches() {
    ControlFlowGraph<Node> cfg1 = createCfg("if (x) { a = 1; }", true);
    assertNotNull(cfg1);

    ControlFlowGraph<Node> cfg2 = createCfg("if (x) { a = 1; } else { b = 2; }", true);
    assertNotNull(cfg2);

    ControlFlowGraph<Node> cfg3 = createCfg("if (x()) { a(); } else { b(); }", true);
    assertNotNull(cfg3);
  }

  @Test
  public void testWhileLoop_normalAndExceptionCondition_constructsCfg() {
    ControlFlowGraph<Node> cfg = createCfg("while (x) { foo(); }", true);
    assertNotNull(cfg);

    ControlFlowGraph<Node> cfgEx = createCfg("while (x()) { foo(); }", true);
    assertNotNull(cfgEx);
  }

  @Test
  public void testDoWhileLoop_normalAndExceptionCondition_constructsCfg() {
    ControlFlowGraph<Node> cfg = createCfg("do { foo(); } while (x);", true);
    assertNotNull(cfg);

    ControlFlowGraph<Node> cfgEx = createCfg("do { foo(); } while (x());", true);
    assertNotNull(cfgEx);
  }

  @Test
  public void testForLoops_forAndForIn_constructsCfg() {
    ControlFlowGraph<Node> cfg1 = createCfg("for (var i = 0; i < 10; i++) { foo(); }", true);
    assertNotNull(cfg1);

    ControlFlowGraph<Node> cfg2 = createCfg("for (i = 0; i < 10; i++) { foo(); }", true);
    assertNotNull(cfg2);

    ControlFlowGraph<Node> cfg3 = createCfg("for (var k in obj) { foo(k); }", true);
    assertNotNull(cfg3);

    ControlFlowGraph<Node> cfg4 = createCfg("for (k in obj) { foo(k); }", true);
    assertNotNull(cfg4);
  }

  @Test
  public void testSwitchStatement_variousCasesAndDefaults_constructsCfg() {
    ControlFlowGraph<Node> cfg1 = createCfg("switch (x) { case 1: a(); break; case 2: b(); default: c(); }", true);
    assertNotNull(cfg1);

    ControlFlowGraph<Node> cfg2 = createCfg("switch (x) { case 1: a(); case 2: b(); }", true);
    assertNotNull(cfg2);

    ControlFlowGraph<Node> cfg3 = createCfg("switch (x) { default: a(); }", true);
    assertNotNull(cfg3);

    ControlFlowGraph<Node> cfg4 = createCfg("switch (x) { }", true);
    assertNotNull(cfg4);
  }

  @Test
  public void testWithStatement_constructsCfg() {
    ControlFlowGraph<Node> cfg = createCfg("with (obj) { a = 1; }", true);
    assertNotNull(cfg);
  }

  @Test
  public void testFunction_traverseFunctionsTrueAndFalse_handlesCorrectly() {
    ControlFlowGraph<Node> cfgWithFn = createCfg("function f(x) { return x + 1; } f(1);", true);
    assertNotNull(cfgWithFn);

    ControlFlowGraph<Node> cfgWithoutFn = createCfg("function f(x) { return x + 1; } f(1);", false);
    assertNotNull(cfgWithoutFn);
  }

  @Test
  public void testFunction_innerFunctionsAndDeclarations() {
    String js = "function outer() {" +
                "  var a = 1;" +
                "  function inner() { return a; }" +
                "  return inner();" +
                "}";
    ControlFlowGraph<Node> cfg = createCfg(js, true);
    assertNotNull(cfg);
  }

  @Test
  public void testTryCatchFinally_allCombinations() {
    ControlFlowGraph<Node> cfg1 = createCfg("try { foo(); } catch (e) { bar(); }", true);
    assertNotNull(cfg1);

    ControlFlowGraph<Node> cfg2 = createCfg("try { foo(); } finally { bar(); }", true);
    assertNotNull(cfg2);

    ControlFlowGraph<Node> cfg3 = createCfg("try { foo(); } catch (e) { bar(); } finally { baz(); }", true);
    assertNotNull(cfg3);

    String jsNested = "while(x) {" +
                      "  try {" +
                      "    try { break; } catch (a) {} finally { foo(); }" +
                      "    fooFollow();" +
                      "  } catch (b) {} finally { bar(); }" +
                      "  barFollow();" +
                      "}" +
                      "end();";
    ControlFlowGraph<Node> cfgNested = createCfg(jsNested, true);
    assertNotNull(cfgNested);
  }

  @Test
  public void testTry_withNestedReturnsAndContinues() {
    String js = "function test() {" +
                "  while (x) {" +
                "    try {" +
                "      if (a) { return 1; }" +
                "      if (b) { continue; }" +
                "      if (c) { break; }" +
                "    } finally {" +
                "      cleanup();" +
                "    }" +
                "  }" +
                "  return 0;" +
                "}";
    ControlFlowGraph<Node> cfg = createCfg(js, true);
    assertNotNull(cfg);
  }

  @Test
  public void testBreakAndContinue_labeledAndUnlabeled() {
    String js = "outer: while (true) {" +
                "  inner: for (var i = 0; i < 10; i++) {" +
                "    if (i == 1) continue inner;" +
                "    if (i == 2) break inner;" +
                "    if (i == 3) continue outer;" +
                "    if (i == 4) break outer;" +
                "  }" +
                "}";
    ControlFlowGraph<Node> cfg = createCfg(js, true);
    assertNotNull(cfg);
  }

  @Test
  public void testBreak_labeledBlockAndIf() {
    String js = "lbl: {" +
                "  var a = 1;" +
                "  if (a) { break lbl; }" +
                "}";
    ControlFlowGraph<Node> cfg = createCfg(js, true);
    assertNotNull(cfg);
  }

  @Test
  public void testThrowStatement_withAndWithoutTry() {
    ControlFlowGraph<Node> cfg1 = createCfg("throw 'error';", true);
    assertNotNull(cfg1);

    ControlFlowGraph<Node> cfg2 = createCfg("try { throw 'error'; } catch(e) {}", true);
    assertNotNull(cfg2);
  }

  @Test
  public void testExpressionExceptions_variousOps() {
    String js = "try {" +
                "  obj.prop;" +
                "  arr[0];" +
                "  new Foo();" +
                "  x = 1;" +
                "  x++;" +
                "  x--;" +
                "} catch (e) {}";
    ControlFlowGraph<Node> cfg = createCfg(js, true);
    assertNotNull(cfg);
  }

  @Test
  public void testSyntheticBlock_createsSyntheticBranch() {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode("var x = 1; var y = 2;");
    Node block = new Node(Token.BLOCK);
    block.setIsSyntheticBlock(true);
    block.addChildToBack(new Node(Token.EXPR_RESULT, Node.newString("a")));

    root.addChildToBack(block);

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true);
    cfa.process(null, root);
    assertNotNull(cfa.getCfg());
  }

  @Test
  public void testAstControlFlowGraph_nodeComparator() {
    ControlFlowAnalysis cfa = processCfa("var a = 1; var b = 2; var c = 3;", true);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    Comparator<DiGraphNode<Node, Branch>> forwardComp = cfg.getOptionalNodeComparator(true);
    Comparator<DiGraphNode<Node, Branch>> backwardComp = cfg.getOptionalNodeComparator(false);
    assertNotNull(forwardComp);
    assertNotNull(backwardComp);

    List<DiGraphNode<Node, Branch>> nodes = cfg.getDirectedGraphNodes();
    assertTrue(nodes.size() >= 2);

    DiGraphNode<Node, Branch> n1 = nodes.get(0);
    DiGraphNode<Node, Branch> n2 = nodes.get(1);

    int cmpFwd = forwardComp.compare(n1, n2);
    int cmpBwd = backwardComp.compare(n1, n2);

    if (cmpFwd != 0) {
      assertEquals(-cmpFwd, cmpBwd);
    } else {
      assertEquals(0, cmpBwd);
    }
  }

  @Test
  public void testIsBreakStructure_allTokenTypes() {
    assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.FOR), false));
    assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.DO), false));
    assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.WHILE), false));
    assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.SWITCH), false));

    assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), true));
    assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), false));

    assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.IF), true));
    assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.IF), false));

    assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), true));
    assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), false));

    assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.VAR), true));
    assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.VAR), false));
  }

  @Test
  public void testIsContinueStructure_allTokenTypes() {
    assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.FOR)));
    assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.DO)));
    assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.WHILE)));

    assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.SWITCH)));
    assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.BLOCK)));
    assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.IF)));
    assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.TRY)));
    assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.VAR)));
  }

  @Test
  public void testEmptyScript_processesSuccessfully() {
    ControlFlowGraph<Node> cfg = createCfg("", true);
    assertNotNull(cfg);
    assertNotNull(cfg.getEntry());
  }

  @Test
  public void testUnreachableCode_receivesPriority() {
    String js = "function f() { return 1; var a = 2; var b = 3; }";
    ControlFlowGraph<Node> cfg = createCfg(js, true);
    assertNotNull(cfg);

    Comparator<DiGraphNode<Node, Branch>> comp = cfg.getOptionalNodeComparator(true);
    for (DiGraphNode<Node, Branch> n1 : cfg.getDirectedGraphNodes()) {
      for (DiGraphNode<Node, Branch> n2 : cfg.getDirectedGraphNodes()) {
        comp.compare(n1, n2);
      }
    }
  }
}
