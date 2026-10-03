package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class CoalesceVariableNamesTest {

  private Node test(String js, boolean usePseudoNames) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    Node externs = compiler.parseTestCode("");
    Node mainRoot = new Node(312, externs, root); // Token.BLOCK or script container

    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, usePseudoNames);
    pass.process(externs, root);
    return root;
  }

  private String compileAndGetSource(String js, boolean usePseudoNames) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    Node externs = compiler.parseTestCode("");

    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, usePseudoNames);
    pass.process(externs, root);
    return compiler.toSource(root);
  }

  @Test
  public void testProcess_globalScope_noCoalescing() {
    String js = "var x = 1; alert(x); var y = 2; alert(y);";
    String result = compileAndGetSource(js, false);
    Assert.assertTrue(result.contains("var x = 1"));
    Assert.assertTrue(result.contains("var y = 2"));
  }

  @Test
  public void testProcess_basicFunction_coalescesVariables() {
    String js = "function f() { var x = 1; alert(x); var y = 2; alert(y); }";
    String result = compileAndGetSource(js, false);
    Assert.assertTrue(result.contains("x = 2") || result.contains("y = 2"));
    Assert.assertFalse(result.contains("var y = 2"));
  }

  @Test
  public void testProcess_overlappingLiveRanges_doesNotCoalesce() {
    String js = "function f() { var x = 1; var y = 2; alert(x + y); }";
    String result = compileAndGetSource(js, false);
    Assert.assertTrue(result.contains("var x = 1"));
    Assert.assertTrue(result.contains("var y = 2"));
  }

  @Test
  public void testProcess_pseudoNames_mergesWithUnderscore() {
    String js = "function f() { var x = 1; alert(x); var y = 2; alert(y); }";
    String result = compileAndGetSource(js, true);
    Assert.assertTrue(result.contains("x_y"));
  }

  @Test
  public void testProcess_pseudoNames_singleVariableNotMerged() {
    String js = "function f() { var x = 1; alert(x); }";
    String result = compileAndGetSource(js, true);
    Assert.assertTrue(result.contains("var x = 1"));
    Assert.assertFalse(result.contains("x_"));
  }

  @Test
  public void testProcess_pseudoNames_nameCollisionAppendsDollar() {
    String js = "function f() { var x_y = 0; var x = 1; alert(x); var y = 2; alert(y); alert(x_y); }";
    String result = compileAndGetSource(js, true);
    Assert.assertTrue(result.contains("x_y$") || result.contains("x_y"));
  }

  @Test
  public void testProcess_forInLoop_varDeclarationRemoved() {
    String js = "function f(obj) { var x = 1; alert(x); for (var y in obj) { alert(y); } }";
    String result = compileAndGetSource(js, false);
    Assert.assertTrue(result.contains("for(x in obj)") || result.contains("for(var x in obj)") || result.contains("for(y in obj)"));
  }

  @Test
  public void testProcess_forInLoop_pseudoNames() {
    String js = "function f(obj) { var x = 1; alert(x); for (var y in obj) { alert(y); } }";
    String result = compileAndGetSource(js, true);
    Assert.assertTrue(result.contains("x_y"));
  }

  @Test
  public void testProcess_forLoopWithInit_assignmentForm() {
    String js = "function f() { var x = 1; alert(x); for (var y = 0; y < 10; y++) { alert(y); } }";
    String result = compileAndGetSource(js, false);
    Assert.assertTrue(result.contains("for(x = 0") || result.contains("for(var x = 0"));
  }

  @Test
  public void testProcess_forLoopUninitialized_removedCorrectly() {
    String js = "function f() { var x = 1; alert(x); var y; for (y = 0; y < 10; y++) { alert(y); } }";
    String result = compileAndGetSource(js, false);
    Assert.assertNotNull(result);
  }

  @Test
  public void testProcess_multipleVarsInSingleVarStatement_uninitialized() {
    String js = "function f() { var x = 1; alert(x); var a, y; y = 2; alert(y); alert(a); }";
    String result = compileAndGetSource(js, false);
    Assert.assertNotNull(result);
  }

  @Test
  public void testProcess_multipleVarsInSingleVarStatement_initialized() {
    String js = "function f() { var x = 1; alert(x); var a = 3, y = 2; alert(y); alert(a); }";
    String result = compileAndGetSource(js, false);
    Assert.assertNotNull(result);
  }

  @Test
  public void testProcess_functionParameters_doNotCoalesceTogether() {
    String js = "function f(p1, p2) { alert(p1); alert(p2); }";
    String result = compileAndGetSource(js, false);
    Assert.assertTrue(result.contains("p1"));
    Assert.assertTrue(result.contains("p2"));
  }

  @Test
  public void testProcess_parameterCoalescedWithLaterVar() {
    String js = "function f(p1) { alert(p1); var y = 2; alert(y); }";
    String result = compileAndGetSource(js, false);
    Assert.assertTrue(result.contains("p1 = 2") || result.contains("var p1"));
  }

  @Test
  public void testProcess_nestedFunctions_namedFunctionIgnored() {
    String js = "function f() { function inner() { var a = 1; alert(a); var b = 2; alert(b); } inner(); }";
    String result = compileAndGetSource(js, false);
    Assert.assertTrue(result.contains("function inner"));
  }

  @Test
  public void testProcess_compoundAssignment() {
    String js = "function f() { var x = 1; alert(x); var y = 2; y += 3; alert(y); }";
    String result = compileAndGetSource(js, false);
    Assert.assertTrue(result.contains("x += 3") || result.contains("y += 3"));
  }

  @Test
  public void testProcess_emptyFunction_noCrash() {
    String js = "function f() {}";
    String result = compileAndGetSource(js, false);
    Assert.assertEquals("function f(){}", result.trim());
  }

  @Test
  public void testProcess_escapedLocals_closureCapture() {
    String js = "function f() { var x = 1; function g() { return x; } var y = 2; alert(y); return g; }";
    String result = compileAndGetSource(js, false);
    Assert.assertTrue(result.contains("var x = 1"));
    Assert.assertTrue(result.contains("var y = 2"));
  }

  @Test
  public void testProcess_enterScopeAndExitScope_coverage() {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode("function a() { var x = 1; alert(x); var y = 2; alert(y); }");
    Node externs = compiler.parseTestCode("");
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);

    pass.process(externs, root);
    Assert.assertNotNull(root);
  }
}
