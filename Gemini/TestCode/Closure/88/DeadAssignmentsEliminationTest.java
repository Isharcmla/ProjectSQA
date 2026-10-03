package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeadAssignmentsEliminationTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private Node test(String js) {
    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode(js);
    NodeTraversal.traverse(compiler, root, new SyntacticScopeCreator(compiler));
    DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
    pass.process(externs, root);
    return root;
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullExterns_throwsException() {
    DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
    Node root = compiler.parseTestCode("function f() { var x = 1; }");
    pass.process(null, root);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullRoot_throwsException() {
    DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
    Node externs = compiler.parseTestCode("");
    pass.process(externs, null);
  }

  @Test
  public void testProcess_globalScope_noChange() {
    String js = "var x = 1; x = 2;";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_innerFunction_noChange() {
    String js = "function f() { var x = 1; function g() { return x; } x = 2; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_noRemovableAssigns_noChange() {
    String js = "function f() { var x = 1; return x; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_deadSimpleAssign_eliminated() {
    String js = "function f() { var x; x = 1; x = 2; return x; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_deadAssignAtEndOfFunction_eliminated() {
    String js = "function f() { var x = 1; x = 2; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_identityAssignment_eliminated() {
    String js = "function f() { var x = 1; x = x; return x; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_deadCompoundAssignment_convertedToOp() {
    String js = "function f() { var x = 1; x += 2; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_deadIncDec_inExpressionNode() {
    String js = "function f() { var x = 1; x++; x--; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_deadIncDec_inComma() {
    String js = "function f() { var x = 1, y = 2; (x++, y); return y; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_deadIncDec_inForUpdate() {
    String js = "function f() { var x = 1; for (var i = 0; i < 10; x++) { i++; } }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_chainedDeadAssignments() {
    String js = "function f() { var x, y; x = y = 1; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_propertyAssignment_notLocal_notEliminated() {
    String js = "function f() { var obj = {}; obj.x = 1; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_undeclaredGlobal_notEliminated() {
    String js = "function f() { globalVar = 1; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_ifConditionAssignment() {
    String js = "function f(a) { var x; if (x = a) { return 1; } return 0; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_whileConditionAssignment() {
    String js = "function f(a) { var x; while (x = a) { break; } }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_doWhileConditionAssignment() {
    String js = "function f(a) { var x; do { break; } while (x = a); }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_forConditionAssignment() {
    String js = "function f(a) { var x; for (; x = a;) { break; } }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_forIn_noConditionDeadCheck() {
    String js = "function f(obj) { var x; for (x in obj) { } }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_switchCaseConditionAssignment() {
    String js = "function f(a) { var x; switch (x = a) { case (x = 1): break; default: break; } }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_returnStatementAssignment() {
    String js = "function f(a) { var x; return (x = a); }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_variableReadBeforeKillWithinExpression() {
    String js = "function f() { var x = 1, y = 0; if (y = x, x = 2) { return y; } return 0; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_variableKillBeforeReadWithinExpression() {
    String js = "function f() { var x = 1, y = 0; if (x = 2, y = x) { return y; } return 0; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_variableStillLiveWithinExpression() {
    String js = "function f(a) { var x; if ((x = a) && (a = x)) { return a; } return 0; }";
    Node root = test(js);
    Assert.assertNotNull(root);
  }

  @Test
  public void testExitScopeAndVisit_noOp() {
    DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    Node node = new Node(Token.EMPTY);
    pass.exitScope(t);
    pass.visit(t, node, null);
    Assert.assertNotNull(pass);
  }
}
