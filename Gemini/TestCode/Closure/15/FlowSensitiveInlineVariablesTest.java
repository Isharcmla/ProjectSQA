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
  public void testSimpleInline_varDeclaration_inlinesValue() {
    test("function f() { var x = 1; return x; }",
         "function f() { var x; return 1; }");
  }

  @Test
  public void testSimpleInline_assignment_inlinesValueAndRemovesAssignment() {
    test("function f() { var x; x = 1; return x; }",
         "function f() { var x; return 1; }");
  }

  @Test
  public void testLabeledAssignment_inlinesValueAndRemovesLabelledStatement() {
    test("function f() { var x; label: x = 1; return x; }",
         "function f() { var x; return 1; }");
  }

  @Test
  public void testNestedLabeledAssignment_inlinesValueAndRemovesAllLabels() {
    test("function f() { var x; l1: l2: x = 1; return x; }",
         "function f() { var x; return 1; }");
  }

  @Test
  public void testGlobalScope_noInline() {
    testSame("var x = 1; var y = x;");
  }

  @Test
  public void testMultipleUses_noInline() {
    testSame("function f() { var x = 1; return x + x; }");
  }

  @Test
  public void testMultipleUsesAcrossStatements_noInline() {
    testSame("function f() { var x = 1; print(x); return x; }");
  }

  @Test
  public void testAssignmentUsedAsRValue_noInline() {
    testSame("function f() { var x, y; y = (x = 1); return x; }");
  }

  @Test
  public void testDefHasSideEffects_noInline() {
    testSame("function f() { var x = ext(); return x; }");
  }

  @Test
  public void testConstructorCallHasSideEffects_noInline() {
    testSame("function f() { var x = new Ext(); return x; }");
  }

  @Test
  public void testCheckRightOfSideEffects_noInline() {
    testSame("function f() { var x; (x = 1), ext(); return x; }");
  }

  @Test
  public void testCheckLeftOfSideEffects_noInline() {
    testSame("function f() { var x = 1; ext(), print(x); }");
  }

  @Test
  public void testDefWithGetProp_noInline() {
    testSame("function f() { var x = a.b; return x; }");
  }

  @Test
  public void testDefWithGetElem_noInline() {
    testSame("function f() { var x = a[b]; return x; }");
  }

  @Test
  public void testDefWithArrayLit_noInline() {
    testSame("function f() { var x = [1, 2]; return x; }");
  }

  @Test
  public void testDefWithObjectLit_noInline() {
    testSame("function f() { var x = {a: 1}; return x; }");
  }

  @Test
  public void testDefWithRegExp_noInline() {
    testSame("function f() { var x = /abc/; return x; }");
  }

  @Test
  public void testDefWithNew_noInline() {
    testSame("function f() { var x = new Object(); return x; }");
  }

  @Test
  public void testFunctionInsideDef_ignoresInternalGetProp() {
    test("function f() { var x = function() { return a.b; }; return x; }",
         "function f() { var x; return function() { return a.b; }; }");
  }

  @Test
  public void testUseWithinLoop_noInline() {
    testSame("function f() { var x = 1; while (true) { print(x); } }");
    testSame("function f() { var x = 1; for (var i = 0; i < 10; i++) { print(x); } }");
    testSame("function f() { var x = 1; do { print(x); } while (true); }");
  }

  @Test
  public void testSideEffectBetweenDefAndUse_noInline() {
    testSame("function f() { var x = 1; ext(); return x; }");
  }

  @Test
  public void testNoSideEffectBetweenDefAndUse_inlinesValue() {
    test("function f() { var x = 1; var y = 2; return x; }",
         "function f() { var x; var y = 2; return 1; }");
  }

  @Test
  public void testReachingDefDependsOnOuterScope_noInline() {
    testSame("var y = 1; function f() { var x = y; return x; }");
  }

  @Test
  public void testNonReadUses_excludedFromGatherCandidates() {
    testSame("function f() { var x = 1; x++; return x; }");
    testSame("function f() { var x = 1; x--; return x; }");
    testSame("function f() { var x = 1; x += 2; return x; }");
    testSame("function f() { try {} catch(x) { return x; } }");
  }

  @Test
  public void testFunctionParameter_noInline() {
    testSame("function f(x) { return x; }");
  }

  @Test
  public void testPublicApiDirectInvocations_emptyRoots() {
    Compiler compiler = new Compiler();
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    Node externs = new Node(0);
    Node root = new Node(0);
    pass.process(externs, root);
    Assert.assertNotNull(pass);
  }

  @Test
  public void testPublicApiDirectInvocations_withTraversedTree() {
    Compiler compiler = new Compiler();
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    Node root = compiler.parseTestCode("function f() { var x = 1; return x; }");
    Node externs = new Node(0);
    pass.process(externs, root);
    Assert.assertNotNull(root);
  }

  @Test
  public void testPublicCallbacksDirectly() {
    Compiler compiler = new Compiler();
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    Node node = new Node(0);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    pass.visit(t, node, null);
    pass.exitScope(t);
  }

  @Test
  public void testExcessiveVariablesInScope_skipsAnalysis() {
    StringBuilder sb = new StringBuilder();
    sb.append("function f() {");
    for (int i = 0; i < LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE + 5; i++) {
      sb.append("var v").append(i).append(" = ").append(i).append(";");
    }
    sb.append("return v0;");
    sb.append("}");
    testSame(sb.toString());
  }

  @Test
  public void testExportedVariable_noInline() {
    testSame("function f() { var _x = 1; return _x; }");
  }
}
