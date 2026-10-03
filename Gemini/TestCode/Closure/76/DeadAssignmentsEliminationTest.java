package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

public class DeadAssignmentsEliminationTest {

  private void test(String js, String expected) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    Node externs = new Node(Token.BLOCK);
    DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
    pass.process(externs, root);
    String actual = compiler.toSource(root);
    assertEquals(expected.replaceAll("\\s+", " ").trim(), actual.replaceAll("\\s+", " ").trim());
  }

  private void testSame(String js) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    Node externs = new Node(Token.BLOCK);
    DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
    pass.process(externs, root);
    String actual = compiler.toSource(root);
    assertEquals(js.replaceAll("\\s+", " ").trim(), actual.replaceAll("\\s+", " ").trim());
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullExterns_throwsException() {
    Compiler compiler = new Compiler();
    DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
    Node root = compiler.parseTestCode("var a = 1;");
    pass.process(null, root);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullRoot_throwsException() {
    Compiler compiler = new Compiler();
    DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
    Node externs = new Node(Token.BLOCK);
    pass.process(externs, null);
  }

  @Test
  public void testExitScopeAndVisit_noop() {
    Compiler compiler = new Compiler();
    DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
    Node node = new Node(Token.BLOCK);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    pass.exitScope(t);
    pass.visit(t, node, null);
    assertNotNull(pass);
  }

  @Test
  public void testGlobalScope_ignored() {
    testSame("var a = 1; a = 2;");
  }

  @Test
  public void testInnerFunction_escapesLocals_notEliminated() {
    testSame("function f() { var x = 1; x = 2; function g() { return x; } return g(); }");
  }

  @Test
  public void testNoRemovableAssigns_ignored() {
    testSame("function f() { var x = 1; return x; }");
  }

  @Test
  public void testSimpleDeadAssignment_eliminated() {
    test("function f() { var x; x = 1; x = 2; return x; }",
         "function f() { var x; 1; x = 2; return x; }");
  }

  @Test
  public void testIdentityAssignment_eliminated() {
    test("function f() { var a = 1; a = a; return a; }",
         "function f() { var a = 1; a; return a; }");
  }

  @Test
  public void testDeadCompoundAssignmentOp_convertedToBinaryOp() {
    test("function f() { var x = 1; x += 2; }",
         "function f() { var x = 1; x + 2; }");
  }

  @Test
  public void testDeadIncDecInExpressionNode_replacedWithVoid() {
    test("function f() { var x = 1; x++; }",
         "function f() { var x = 1; void 0; }");
    test("function f() { var x = 1; x--; }",
         "function f() { var x = 1; void 0; }");
  }

  @Test
  public void testDeadIncDecInForLoopUpdate_replacedWithEmpty() {
    test("function f() { var x = 0; for (; false; x++) {} }",
         "function f() { var x = 0; for (; false; ) {} }");
  }

  @Test
  public void testIncDecInSubExpression_notRemovable() {
    testSame("function f() { var x = 1; var y = x++; return y; }");
  }

  @Test
  public void testNonNameLhs_notEliminated() {
    testSame("function f() { var obj = {}; obj.x = 1; }");
  }

  @Test
  public void testUndeclaredVariable_notEliminated() {
    testSame("function f() { undeclared = 1; }");
  }

  @Test
  public void testChainedDeadAssignment() {
    test("function f() { var x; var y; x = y = 1; return y; }",
         "function f() { var x; var y; y = 1; return y; }");
  }

  @Test
  public void testDeadAssignmentInConditions_ifWhileDoFor() {
    test("function f() { var x; if (x = 1) { x = 2; return x; } }",
         "function f() { var x; if (1) { x = 2; return x; } }");

    test("function f() { var x; while (x = 1) { x = 2; break; } return x; }",
         "function f() { var x; while (1) { x = 2; break; } return x; }");

    test("function f() { var x; do { x = 2; break; } while (x = 1); return x; }",
         "function f() { var x; do { x = 2; break; } while (1); return x; }");

    test("function f() { var x; for (; x = 1;) { x = 2; break; } return x; }",
         "function f() { var x; for (; 1;) { x = 2; break; } return x; }");
  }

  @Test
  public void testForInCondition_notAltered() {
    testSame("function f(obj) { var x; for (x in obj) { return x; } }");
  }

  @Test
  public void testDeadAssignmentInSwitchCaseReturn() {
    test("function f() { var x, y, z; switch (x = 1) { case y = 2: return z = 3; } }",
         "function f() { var x, y, z; switch (1) { case 2: return 3; } }");
  }

  @Test
  public void testShortCircuitAndOr_readBeforeKill() {
    testSame("function f() { var a, X; if (X = a && (a = 1)) {} a = 2; return a; }");
    testSame("function f() { var a, X; if (X = a || (a = 1)) {} a = 2; return a; }");
  }

  @Test
  public void testHookBranch_bothKill() {
    test("function f(cond) { var a = 0; (cond ? (a = 1) : (a = 2)); a = 3; return a; }",
         "function f(cond) { var a = 0; (cond ? 1 : 2); a = 3; return a; }");
  }

  @Test
  public void testHookBranch_oneRead() {
    testSame("function f(cond) { var a = 0; (cond ? a : (a = 2)); a = 3; return a; }");
    testSame("function f(cond) { var a = 0; (cond ? (a = 2) : a); a = 3; return a; }");
  }

  @Test
  public void testHookBranch_maybeLive() {
    testSame("function f(cond) { var a = 0; (cond ? (a = 1) : 2); return a; }");
  }

  @Test
  public void testVariableReadInRhs_evaluatedBeforeKill() {
    testSame("function f() { var a; a = a + 1; return a; }");
  }
}
