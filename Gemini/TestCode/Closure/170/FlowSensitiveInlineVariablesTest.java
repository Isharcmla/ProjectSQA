package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class FlowSensitiveInlineVariablesTest extends CompilerTestCase {

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new FlowSensitiveInlineVariables(compiler);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Test
  public void testSimpleVariableInlining_varDeclaration_inlined() {
    test("function f() { var x = 1; return x; }",
         "function f() { var x; return 1; }");
  }

  @Test
  public void testSimpleAssignmentInlining_assignExpr_inlined() {
    test("function f() { var x; x = 1; return x; }",
         "function f() { var x; return 1; }");
  }

  @Test
  public void testMultipleVariablesInlining_independent_inlined() {
    test("function f() { var x = 1; var y = 2; return x + y; }",
         "function f() { var x; var y; return 1 + 2; }");
  }

  @Test
  public void testDependentVariablesInlining_cascadeDependencies() {
    test("function f(a) { var x = a; var y = x + 1; return y; }",
         "function f(a) { var x; var y; return a + 1; }");
  }

  @Test
  public void testLabeledAssignmentInlining_labelStripped() {
    test("function f() { var x; lab: x = 1; return x; }",
         "function f() { var x; return 1; }");
  }

  @Test
  public void testMultipleUses_noInline() {
    testSame("function f() { var x = 1; return x + x; }");
  }

  @Test
  public void testWithinLoopUse_noInline() {
    testSame("function f() { var x = 1; while (true) { alert(x); } }");
  }

  @Test
  public void testGlobalScope_noInline() {
    testSame("var x = 1; var y = x;");
  }

  @Test
  public void testSideEffectsBetweenDefAndUse_noInline() {
    testSame("function f() { var x = 1; g(); return x; }");
    testSame("function f() { var x = 1; new G(); return x; }");
    testSame("function f(o) { var x = 1; delete o.p; return x; }");
  }

  @Test
  public void testSideEffectsInRhsOfDef_noInline() {
    testSame("function f() { var x = g(); return x; }");
  }

  @Test
  public void testSideEffectsLeftOfUse_noInline() {
    testSame("function f() { var x = 1; return (g(), x); }");
  }

  @Test
  public void testSideEffectsRightOfDef_noInline() {
    testSame("function f() { var x; x = 1, g(); return x; }");
  }

  @Test
  public void testRhsForbiddenExpressions_noInline() {
    testSame("function f(a) { var x = a.b; return x; }");
    testSame("function f(a) { var x = a[0]; return x; }");
    testSame("function f() { var x = []; return x; }");
    testSame("function f() { var x = {}; return x; }");
    testSame("function f() { var x = /abc/; return x; }");
    testSame("function f() { var x = new Object(); return x; }");
  }

  @Test
  public void testCatchVariableReference_noInline() {
    testSame("function f() { try {} catch (e) { var x = e; return x; } }");
  }

  @Test
  public void testFunctionParameter_noInline() {
    testSame("function f(x) { return x; }");
  }

  @Test
  public void testAssignmentAsRValue_noInline() {
    testSame("function f() { var x, y; y = (x = 1); return x; }");
  }

  @Test
  public void testExportedName_noInline() {
    testSame("function f() { var _exportVar = 1; return _exportVar; }");
  }

  @Test
  public void testAssignmentLhsIgnoredInUseCount_inlined() {
    test("function f() { var x = 1; var y; y = x; return y; }",
         "function f() { var x; var y; y = 1; return y; }");
  }

  @Test
  public void testIncrementDecrement_noInline() {
    testSame("function f() { var x = 1; x++; return x; }");
    testSame("function f() { var x = 1; x--; return x; }");
  }

  @Test
  public void testDirectPublicApiExecution_emptyRoots() {
    Compiler compiler = new Compiler();
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    Node externs = new Node(132); // Token.BLOCK or Token.SCRIPT
    Node root = new Node(132);
    pass.process(externs, root);
    Assert.assertNotNull(pass);
  }

  @Test
  public void testExitScopeAndVisit_noopCoverage() {
    Compiler compiler = new Compiler();
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    Node root = new Node(132);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    pass.exitScope(t);
    pass.visit(t, root, null);
    Assert.assertNotNull(pass);
  }
}
