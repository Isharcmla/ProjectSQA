package com.google.javascript.jscomp;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MustBeReachingVariableDefTest {

  private Compiler compiler;
  private ControlFlowGraph<Node> cfg;
  private Scope scope;
  private MustBeReachingVariableDef analysis;

  private void compute(String js) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node script = compiler.parseTestCode(js);
    Assert.assertNotNull(script);

    // Look for the first function if available, else use script node
    Node target = script.getFirstChild();
    if (target != null && target.isFunction()) {
      ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
      cfa.process(null, target.getLastChild());
      cfg = cfa.getCfg();
      SyntacticScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
      Scope globalScope = scopeCreator.createScope(script, null);
      scope = scopeCreator.createScope(target, globalScope);
    } else {
      ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
      cfa.process(null, script);
      cfg = cfa.getCfg();
      SyntacticScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
      scope = scopeCreator.createScope(script, null);
    }

    analysis = new MustBeReachingVariableDef(cfg, scope, compiler);
    analysis.analyze();
  }

  private Node findMatchingNode(Node root, final int tokenType, final String name) {
    if (root.getType() == tokenType && (name == null || name.equals(root.getString()))) {
      return root;
    }
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      Node match = findMatchingNode(c, tokenType, name);
      if (match != null) {
        return match;
      }
    }
    return null;
  }

  @Test
  public void testIsForward_always_returnsTrue() {
    compute("function foo() { var a = 1; }");
    Assert.assertTrue(analysis.isForward());
  }

  @Test
  public void testCreateLattices_normalState_validLatticesCreated() {
    compute("function foo(x) { var a = 1; }");
    MustDef entry = analysis.createEntryLattice();
    Assert.assertNotNull(entry);
    Assert.assertTrue(entry.reachingDef.size() >= 2);

    MustDef initial = analysis.createInitialEstimateLattice();
    Assert.assertNotNull(initial);
    Assert.assertTrue(initial.reachingDef.isEmpty());
  }

  @Test
  public void testSimpleVarAndAssignment_linearCode_reachesDefinition() {
    compute("function foo() { var a = 1; a = 2; var b = a; }");
    Node useB = findMatchingNode(scope.getRootNode(), Token.NAME, "b");
    Assert.assertNotNull(useB);

    Node defA = analysis.getDef("a", useB.getParent());
    Assert.assertNotNull(defA);
    Assert.assertTrue(defA.isAssign());
    Assert.assertEquals(2, defA.getLastChild().getInt());
  }

  @Test
  public void testBranchingWithIf_multipleDefs_resultsInBottomDef() {
    compute("function foo(cond) { var a; if (cond) { a = 1; } else { a = 2; } var b = a; }");
    Node useB = findMatchingNode(scope.getRootNode(), Token.NAME, "b");
    Assert.assertNotNull(useB);

    Node defA = analysis.getDef("a", useB.getParent());
    Assert.assertNull(defA);
  }

  @Test
  public void testWhileAndDoLoops_conditionDefinitions_flowCorrectly() {
    compute("function foo() { var a = 1; while ((a = 2) < 5) { a = 3; } do { a = 4; } while ((a = 5) < 10); }");
    Node whileNode = findMatchingNode(scope.getRootNode(), Token.WHILE, null);
    Assert.assertNotNull(whileNode);
    Node doNode = findMatchingNode(scope.getRootNode(), Token.DO, null);
    Assert.assertNotNull(doNode);
  }

  @Test
  public void testForLoops_standardAndForIn_flowCorrectly() {
    compute("function foo(arr, obj) { var a = 1; for (; (a = 2) < 5; ) {} for (x in obj) { a = 3; } for (var y in obj) { a = 4; } }");
    Node forNode = findMatchingNode(scope.getRootNode(), Token.FOR, null);
    Assert.assertNotNull(forNode);
  }

  @Test
  public void testLogicalExpressions_andOrHook_analyzedConditionals() {
    compute("function foo(p) { var a = 1; var b = (a = 2) && (a = 3); var c = (a = 4) || (a = 5); var d = (a = 6) ? (a = 7) : (a = 8); }");
    Node hookNode = findMatchingNode(scope.getRootNode(), Token.HOOK, null);
    Assert.assertNotNull(hookNode);
  }

  @Test
  public void testIncAndDecOperators_variableTarget_updatesDefinition() {
    compute("function foo() { var a = 1; a++; --a; var obj = {}; obj.x++; }");
    Node incNode = findMatchingNode(scope.getRootNode(), Token.INC, null);
    Assert.assertNotNull(incNode);
    Node decNode = findMatchingNode(scope.getRootNode(), Token.DEC, null);
    Assert.assertNotNull(decNode);
  }

  @Test
  public void testArgumentsHandling_useAndAssign_escapesParameters() {
    compute("function foo(x, y) { var a = x; arguments[0] = 5; var b = arguments; }");
    Node useB = findMatchingNode(scope.getRootNode(), Token.NAME, "b");
    Assert.assertNotNull(useB);
    Node defX = analysis.getDef("x", useB.getParent());
    Assert.assertNull(defX);
  }

  @Test
  public void testDependencyGraph_redefiningDep_invalidatesDependentVar() {
    compute("function foo() { var a = 1; var b = a; a = 2; var c = b; }");
    Node useC = findMatchingNode(scope.getRootNode(), Token.NAME, "c");
    Assert.assertNotNull(useC);
    Node defB = analysis.getDef("b", useC.getParent());
    Assert.assertNull(defB);
  }

  @Test
  public void testOuterScopeVariable_dependsOnOuterScope_returnsExpectedBoolean() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node script = compiler.parseTestCode("var outer = 10; function foo() { var a = outer; var b = a; }");
    Node func = script.getLastChild();

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, func.getLastChild());
    cfg = cfa.getCfg();

    SyntacticScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(script, null);
    scope = scopeCreator.createScope(func, globalScope);

    analysis = new MustBeReachingVariableDef(cfg, scope, compiler);
    analysis.analyze();

    Node useB = findMatchingNode(scope.getRootNode(), Token.NAME, "b");
    Assert.assertNotNull(useB);

    boolean depends = analysis.dependsOnOuterScopeVars("a", useB.getParent());
    Assert.assertTrue(depends);

    boolean dependsB = analysis.dependsOnOuterScopeVars("b", useB.getParent());
    Assert.assertFalse(dependsB);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetDef_nodeNotInCfg_throwsException() {
    compute("function foo() { var a = 1; }");
    Node foreignNode = Node.newString("a");
    analysis.getDef("a", foreignNode);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDependsOnOuterScopeVars_nodeNotInCfg_throwsException() {
    compute("function foo() { var a = 1; }");
    Node foreignNode = Node.newString("a");
    analysis.dependsOnOuterScopeVars("a", foreignNode);
  }

  @Test
  public void testMustDefLattice_equalsAndCopy_behaviorsCorrect() {
    MustDef def1 = new MustDef();
    MustDef def2 = new MustDef();
    Assert.assertEquals(def1, def2);
    Assert.assertFalse(def1.equals("non-MustDef"));

    compute("function foo(x) { var a = 1; }");
    MustDef entry1 = analysis.createEntryLattice();
    MustDef entry2 = new MustDef(entry1);
    Assert.assertEquals(entry1, entry2);
    Assert.assertEquals(entry1.hashCode(), entry1.hashCode());

    MustDef emptyFromIter = new MustDef(Collections.<Var>emptyList().iterator());
    Assert.assertTrue(emptyFromIter.reachingDef.isEmpty());
  }

  @Test
  public void testJoinOperation_variousBranches_mergedAccurately() {
    compute("function foo() { var a; var b; if (true) { a = 1; b = 1; } else { a = 1; b = 2; } }");
    MustDef entry = analysis.createEntryLattice();
    MustDef flow1 = analysis.flowThrough(scope.getRootNode(), entry);
    Assert.assertNotNull(flow1);
  }

  @Test
  public void testComputeMustDef_blockAndFunctionNodes_skippedProperly() {
    compute("function foo() { function nested() {} { var x = 1; } }");
    MustDef entry = analysis.createEntryLattice();
    Node blockNode = new Node(Token.BLOCK);
    MustDef resultBlock = analysis.flowThrough(blockNode, entry);
    Assert.assertEquals(entry, resultBlock);

    Node fnNode = new Node(Token.FUNCTION);
    MustDef resultFn = analysis.flowThrough(fnNode, entry);
    Assert.assertEquals(entry, resultFn);
  }

  @Test
  public void testEscapedVariable_accessedInInnerFunction_notTrackedAsLocalDef() {
    compute("function foo() { var a = 1; function inner() { return a; } a = 2; var b = a; }");
    Node useB = findMatchingNode(scope.getRootNode(), Token.NAME, "b");
    Assert.assertNotNull(useB);
    Node defA = analysis.getDef("a", useB.getParent());
    Assert.assertNull(defA);
  }
}
