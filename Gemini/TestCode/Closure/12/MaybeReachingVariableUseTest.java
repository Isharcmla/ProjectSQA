package com.google.javascript.jscomp;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaybeReachingVariableUseTest {

  private MaybeReachingVariableUse computePass(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node root = compiler.parseTestCode(js);
    Assert.assertNotNull(root);
    Assert.assertEquals(0, compiler.getErrorCount());

    Node script = root.getFirstChild();
    Node function = null;

    if (script.isFunction()) {
      function = script;
    } else if (script.getFirstChild() != null && script.getFirstChild().isFunction()) {
      function = script.getFirstChild();
    } else if (script.getFirstChild() != null && script.getFirstChild().isExprResult()
        && script.getFirstChild().getFirstChild().isFunction()) {
      function = script.getFirstChild().getFirstChild();
    }

    Assert.assertNotNull("Must contain a function", function);

    SyntacticScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(root, null);
    Scope functionScope = scopeCreator.createScope(function, globalScope);

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, function.getLastChild());
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    MaybeReachingVariableUse analysis =
        new MaybeReachingVariableUse(cfg, functionScope, compiler);
    analysis.analyze();

    return analysis;
  }

  private Node findFirstNode(Node root, int tokenType) {
    if (root.getType() == tokenType) {
      return root;
    }
    for (Node child = root.getFirstChild(); child != null; child = child.getNext()) {
      Node found = findFirstNode(child, tokenType);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  private Node findNodeByString(Node root, int tokenType, String name) {
    if (root.getType() == tokenType && name.equals(root.getString())) {
      return root;
    }
    for (Node child = root.getFirstChild(); child != null; child = child.getNext()) {
      Node found = findNodeByString(child, tokenType, name);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  @Test
  public void testReachingUses_equalsAndHashCode() {
    MaybeReachingVariableUse.ReachingUses empty1 = new MaybeReachingVariableUse.ReachingUses();
    MaybeReachingVariableUse.ReachingUses empty2 = new MaybeReachingVariableUse.ReachingUses();

    Assert.assertEquals(empty1, empty2);
    Assert.assertEquals(empty1.hashCode(), empty2.hashCode());
    Assert.assertEquals(empty1, empty1);
    Assert.assertNotEquals(empty1, null);
    Assert.assertNotEquals(empty1, new Object());

    MaybeReachingVariableUse.ReachingUses copy = new MaybeReachingVariableUse.ReachingUses(empty1);
    Assert.assertEquals(empty1, copy);
    Assert.assertEquals(empty1.hashCode(), copy.hashCode());
  }

  @Test
  public void testLatticeElementMethods() {
    String js = "function f() { var x = 1; x = x + 1; return x; }";
    MaybeReachingVariableUse analysis = computePass(js);

    Assert.assertFalse(analysis.isForward());

    MaybeReachingVariableUse.ReachingUses entry = analysis.createEntryLattice();
    Assert.assertNotNull(entry);
    Assert.assertTrue(entry.mayUseMap.isEmpty());

    MaybeReachingVariableUse.ReachingUses initial = analysis.createInitialEstimateLattice();
    Assert.assertNotNull(initial);
    Assert.assertTrue(initial.mayUseMap.isEmpty());

    MaybeReachingVariableUse.ReachingUses flowResult =
        analysis.flowThrough(new Node(Token.BLOCK), entry);
    Assert.assertNotNull(flowResult);
    Assert.assertTrue(flowResult.mayUseMap.isEmpty());
  }

  @Test
  public void testSimpleVariableAssignmentAndUse() {
    String js = "function f() { var x = 1; var y = x; return y; }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();
    Assert.assertNotNull(root);

    Node varXNode = findNodeByString(root, Token.NAME, "x").getParent();
    Collection<Node> uses = analysis.getUses("x", varXNode);

    Assert.assertNotNull(uses);
    Assert.assertEquals(1, uses.size());
  }

  @Test
  public void testUnusedVariable_returnsEmptyUses() {
    String js = "function f() { var x = 1; var y = 2; return y; }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node varXNode = findNodeByString(root, Token.NAME, "x").getParent();
    Collection<Node> uses = analysis.getUses("x", varXNode);

    Assert.assertNotNull(uses);
    Assert.assertTrue(uses.isEmpty());
  }

  @Test
  public void testVariableReassigned_overridesPreviousDef() {
    String js = "function f() { var x = 1; x = 2; return x; }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node varXNode = findNodeByString(root, Token.NAME, "x").getParent();
    Collection<Node> usesOfFirstDef = analysis.getUses("x", varXNode);

    Assert.assertNotNull(usesOfFirstDef);
    Assert.assertTrue(usesOfFirstDef.isEmpty());

    Node assignExpr = findFirstNode(root, Token.ASSIGN).getParent();
    Collection<Node> usesOfSecondDef = analysis.getUses("x", assignExpr);

    Assert.assertNotNull(usesOfSecondDef);
    Assert.assertEquals(1, usesOfSecondDef.size());
  }

  @Test
  public void testCompoundAssignmentOp() {
    String js = "function f() { var x = 1; x += 2; return x; }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node varXNode = findNodeByString(root, Token.NAME, "x").getParent();
    Collection<Node> uses = analysis.getUses("x", varXNode);

    Assert.assertNotNull(uses);
    Assert.assertEquals(1, uses.size());
  }

  @Test
  public void testIfConditionAndBranches() {
    String js = "function f(p) { var x = 1; if (x > 0) { return x; } else { return 0; } }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node varXNode = findNodeByString(root, Token.NAME, "x").getParent();
    Collection<Node> uses = analysis.getUses("x", varXNode);

    Assert.assertNotNull(uses);
    Assert.assertEquals(2, uses.size());
  }

  @Test
  public void testWhileAndDoLoops() {
    String js = "function f() { var x = 1; while (x < 10) { x = x + 1; } do { x = x - 1; } while (x > 0); return x; }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node varXNode = findNodeByString(root, Token.NAME, "x").getParent();
    Collection<Node> uses = analysis.getUses("x", varXNode);

    Assert.assertNotNull(uses);
    Assert.assertFalse(uses.isEmpty());
  }

  @Test
  public void testForLoop_standard() {
    String js = "function f() { var x = 0; for (; x < 10;) { x = x + 1; } return x; }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node varXNode = findNodeByString(root, Token.NAME, "x").getParent();
    Collection<Node> uses = analysis.getUses("x", varXNode);

    Assert.assertNotNull(uses);
    Assert.assertFalse(uses.isEmpty());
  }

  @Test
  public void testForInLoop_withVarDeclaration() {
    String js = "function f(obj) { var x = 10; for (var y in obj) { x = y; } return x; }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node varXNode = findNodeByString(root, Token.NAME, "x").getParent();
    Collection<Node> uses = analysis.getUses("x", varXNode);

    Assert.assertNotNull(uses);
    Assert.assertFalse(uses.isEmpty());
  }

  @Test
  public void testForInLoop_withExistingVariable() {
    String js = "function f(obj) { var y; for (y in obj) { alert(y); } return y; }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node varYNode = findNodeByString(root, Token.NAME, "y").getParent();
    Collection<Node> uses = analysis.getUses("y", varYNode);

    Assert.assertNotNull(uses);
  }

  @Test
  public void testLogicalAndOrAndHookExpressions() {
    String js = "function f(cond, a, b) { var x = 1; var y = (x && a) ? (x || b) : x; return y; }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node varXNode = findNodeByString(root, Token.NAME, "x").getParent();
    Collection<Node> uses = analysis.getUses("x", varXNode);

    Assert.assertNotNull(uses);
    Assert.assertFalse(uses.isEmpty());
  }

  @Test
  public void testVarWithoutInitExpression() {
    String js = "function f() { var x; x = 5; return x; }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node varXNode = findNodeByString(root, Token.NAME, "x").getParent();
    Collection<Node> uses = analysis.getUses("x", varXNode);

    Assert.assertNotNull(uses);
    Assert.assertTrue(uses.isEmpty());
  }

  @Test
  public void testEscapedVariable_notTrackedInUses() {
    String js = "function f() { var x = 1; function inner() { return x; } return inner(); }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node varXNode = findNodeByString(root, Token.NAME, "x").getParent();
    Collection<Node> uses = analysis.getUses("x", varXNode);

    Assert.assertNotNull(uses);
    Assert.assertTrue(uses.isEmpty());
  }

  @Test
  public void testGlobalOrNonLocalVariable_ignored() {
    String js = "function f() { globalVar = 10; return globalVar; }";
    MaybeReachingVariableUse analysis = computePass(js);
    Node root = analysis.getCfg().getEntry().getValue();

    Node assignExpr = findFirstNode(root, Token.EXPR_RESULT);
    Collection<Node> uses = analysis.getUses("globalVar", assignExpr);

    Assert.assertNotNull(uses);
    Assert.assertTrue(uses.isEmpty());
  }

  @Test(expected = NullPointerException.class)
  public void testGetUses_withNullDefNode_throwsException() {
    String js = "function f() { var x = 1; return x; }";
    MaybeReachingVariableUse analysis = computePass(js);
    analysis.getUses("x", null);
  }

  @Test(expected = NullPointerException.class)
  public void testGetUses_withNonCfgNode_throwsException() {
    String js = "function f() { var x = 1; return x; }";
    MaybeReachingVariableUse analysis = computePass(js);
    analysis.getUses("x", new Node(Token.EMPTY));
  }
}
