package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlowSensitiveInlineVariablesTest {

  private void test(String js, String expected) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode(js);
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(externs, root);
    String actual = compiler.toSource(root);
    Node expectedRoot = compiler.parseTestCode(expected);
    String expectedSource = compiler.toSource(expectedRoot);
    assertEquals(expectedSource, actual);
  }

  private void testSame(String js) {
    test(js, js);
  }

  @Test
  public void testProcess_globalScope_noInlining() {
    testSame("var x = 1; var y = x;");
  }

  @Test
  public void testProcess_simpleVarInlined_inlinedSuccessfully() {
    test(
        "function f() { var x = 1; return x; }",
        "function f() { return 1; }"
    );
  }

  @Test
  public void testProcess_simpleAssignInlined_inlinedSuccessfully() {
    test(
        "function f(x) { x = 1; return x; }",
        "function f(x) { return 1; }"
    );
  }

  @Test
  public void testProcess_labeledAssignInlined_inlinedSuccessfully() {
    test(
        "function f(x) { L: x = 1; return x; }",
        "function f(x) { return 1; }"
    );
  }

  @Test
  public void testProcess_nestedLabelsAssignInlined_inlinedSuccessfully() {
    test(
        "function f(x) { L1: L2: x = 1; return x; }",
        "function f(x) { return 1; }"
    );
  }

  @Test
  public void testProcess_multipleUsesInSameCfgNode_noInlining() {
    testSame("function f() { var x = 1; return x + x; }");
  }

  @Test
  public void testProcess_useWithinLoop_noInlining() {
    testSame("function f() { var x = 1; while (true) { return x; } }");
  }

  @Test
  public void testProcess_multipleUsesAcrossBranches_noInlining() {
    testSame("function f(c) { var x = 1; if (c) { return x; } else { return x; } }");
  }

  @Test
  public void testProcess_functionParamDef_noInlining() {
    testSame("function f(x) { return x; }");
  }

  @Test
  public void testProcess_assignUsedAsRValue_noInlining() {
    testSame("function f(a) { var x; if ((x = a) == 1) return x; }");
  }

  @Test
  public void testProcess_rhsHasSideEffectsCall_noInlining() {
    testSame("function f() { var x = g(); return x; }");
  }

  @Test
  public void testProcess_rhsGetProp_noInlining() {
    testSame("function f(a) { var x = a.b; return x; }");
  }

  @Test
  public void testProcess_rhsGetElem_noInlining() {
    testSame("function f(a) { var x = a[0]; return x; }");
  }

  @Test
  public void testProcess_rhsArrayLiteral_noInlining() {
    testSame("function f() { var x = [1, 2]; return x; }");
  }

  @Test
  public void testProcess_rhsObjectLiteral_noInlining() {
    testSame("function f() { var x = {a: 1}; return x; }");
  }

  @Test
  public void testProcess_rhsRegexp_noInlining() {
    testSame("function f() { var x = /abc/; return x; }");
  }

  @Test
  public void testProcess_rhsNew_noInlining() {
    testSame("function f() { var x = new Object(); return x; }");
  }

  @Test
  public void testProcess_sideEffectOnRightOfDef_noInlining() {
    testSame("function f(x) { x = (1, g()); return x; }");
  }

  @Test
  public void testProcess_sideEffectOnLeftOfUse_noInlining() {
    testSame("function f() { var y = 1; return g(), y; }");
  }

  @Test
  public void testProcess_sideEffectAlongPath_noInlining() {
    testSame("function f() { var x = 1; while (g()) {} return x; }");
  }

  @Test
  public void testProcess_deletePropertyAlongPath_noInlining() {
    testSame("function f(obj) { var x = 1; delete obj.p; return x; }");
  }

  @Test
  public void testProcess_constructorCallSideEffectAlongPath_noInlining() {
    testSame("function f() { var x = 1; new Foo(); return x; }");
  }

  @Test
  public void testProcess_nonAdjacentNoSideEffects_inlinedSuccessfully() {
    test(
        "function f() { var x = 1; var y = 2; return x; }",
        "function f() { var y = 2; return 1; }"
    );
  }

  @Test
  public void testProcess_dependentVariablesInlined() {
    test(
        "function f() { var x = 1; var y = x; return y; }",
        "function f() { var x = 1; return x; }"
    );
  }

  @Test
  public void testProcess_outerScopeVariableDependency_noInlining() {
    testSame("function outer() { var a = 1; function inner() { var b = a; return b; } }");
  }

  @Test
  public void testProcess_incrementAndDecrementIgnored() {
    testSame("function f() { var x = 1; x++; return x; }");
    testSame("function f() { var x = 1; x--; return x; }");
  }

  @Test
  public void testProcess_catchClauseVariable() {
    test(
        "function f() { try {} catch (e) { var x = 1; return x; } }",
        "function f() { try {} catch (e) { return 1; } }"
    );
  }

  @Test
  public void testProcess_exceedMaxVariablesToAnalyze_abortsGracefully() {
    StringBuilder sb = new StringBuilder();
    sb.append("function f() {");
    for (int i = 0; i < 105; i++) {
      sb.append("var v").append(i).append(" = ").append(i).append(";");
    }
    sb.append("return v0; }");
    testSame(sb.toString());
  }

  @Test
  public void testExitScopeAndVisit_calledDirectly_noException() {
    Compiler compiler = new Compiler();
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.exitScope(null);
    pass.visit(null, null, null);
    Assert.assertNotNull(pass);
  }

  @Test
  public void testProcess_emptyRootAndExterns_noException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode("");
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(externs, root);
    assertEquals("", compiler.toSource(root));
  }
}
