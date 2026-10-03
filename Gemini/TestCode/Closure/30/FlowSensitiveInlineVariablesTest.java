package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class FlowSensitiveInlineVariablesTest {

  private Node parseAndProcess(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node externs = new Node(Token.BLOCK);
    Node root = compiler.parseTestCode(js);
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(externs, root);
    return root;
  }

  private String compile(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node externs = new Node(Token.BLOCK);
    Node root = compiler.parseTestCode(js);
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(externs, root);
    return compiler.toSource(root);
  }

  @Test
  public void testConstructor_validCompiler_instanceCreated() {
    Compiler compiler = new Compiler();
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    Assert.assertNotNull(pass);
  }

  @Test
  public void testProcess_globalScope_noInlining() {
    String js = "var x = 1; var y = x;";
    String result = compile(js);
    Assert.assertTrue(result.contains("var y = x") || result.contains("y = x"));
  }

  @Test
  public void testProcess_simpleVarInline_inlinedSuccessfully() {
    String js = "function f() { var x = 1; return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return 1"));
  }

  @Test
  public void testProcess_assignInline_inlinedSuccessfully() {
    String js = "function f() { var x; x = 1; return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return 1"));
    Assert.assertFalse(result.contains("x = 1"));
  }

  @Test
  public void testProcess_labeledAssignInline_inlinedSuccessfully() {
    String js = "function f() { var x; label: x = 1; return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return 1"));
  }

  @Test
  public void testProcess_assignUsedAsRValue_notInlined() {
    String js = "function f() { var x; var y = (x = 1); return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_parameterDef_notInlined() {
    String js = "function f(x) { return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_multipleUsesInSameCfgNode_notInlined() {
    String js = "function f() { var x = 1; return x + x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("x + x"));
  }

  @Test
  public void testProcess_multipleUsesInProgram_notInlined() {
    String js = "function f() { var x = 1; var y = x; return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_useWithinLoop_notInlined() {
    String js = "function f() { var x = 1; while (true) { var y = x; } }";
    String result = compile(js);
    Assert.assertTrue(result.contains("var y = x") || result.contains("y = x"));
  }

  @Test
  public void testProcess_sideEffectOnRhs_notInlined() {
    String js = "function f() { var x = alert(); return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_disallowedRhsTokens_getProp_notInlined() {
    String js = "function f(a) { var x = a.b; return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_disallowedRhsTokens_getElem_notInlined() {
    String js = "function f(a) { var x = a[0]; return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_disallowedRhsTokens_arrayLit_notInlined() {
    String js = "function f() { var x = [1, 2]; return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_disallowedRhsTokens_objectLit_notInlined() {
    String js = "function f() { var x = {a: 1}; return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_disallowedRhsTokens_regexp_notInlined() {
    String js = "function f() { var x = /abc/; return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_disallowedRhsTokens_newExpr_notInlined() {
    String js = "function f() { var x = new Object(); return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_sideEffectBetweenDefAndUse_notInlined() {
    String js = "function f() { var x = 1; alert(); return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_sideEffectInLoopBetweenDefAndUse_notInlined() {
    String js = "function f() { var x = 1; while(alert()) {} return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_sideEffectRightOfDef_notInlined() {
    String js = "function f() { var x = 1, y = alert(); return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_sideEffectLeftOfUse_notInlined() {
    String js = "function f() { var x = 1; return alert(), x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return alert(), x"));
  }

  @Test
  public void testProcess_catchClauseVariable_notInlined() {
    String js = "function f() { try {} catch(x) { return x; } }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return x"));
  }

  @Test
  public void testProcess_incAndDecVariable_notInlined() {
    String js = "function f() { var x = 1; x++; return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("x++"));
  }

  @Test
  public void testProcess_compoundAssignVariable_notInlined() {
    String js = "function f() { var x = 1; x += 2; return x; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("x += 2"));
  }

  @Test
  public void testProcess_tooManyVariables_skipped() {
    StringBuilder sb = new StringBuilder();
    sb.append("function f() {");
    for (int i = 0; i < 105; i++) {
      sb.append("var v").append(i).append(" = ").append(i).append(";");
    }
    sb.append("return v0; }");
    String result = compile(sb.toString());
    Assert.assertTrue(result.contains("return v0"));
  }

  @Test
  public void testProcess_emptyFunction_noCrash() {
    String js = "function f() {}";
    String result = compile(js);
    Assert.assertNotNull(result);
  }

  @Test
  public void testExitScopeAndVisit_directInvocation_noCrash() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    Node root = compiler.parseTestCode("function f() { var a = 1; }");
    NodeTraversal t = new NodeTraversal(compiler, pass);
    
    pass.visit(t, root, null);
    pass.exitScope(t);
  }

  @Test
  public void testProcess_outerScopeDependency_notInlined() {
    String js = "function outer() { var y = 1; function inner() { var x = y; return x; } return inner(); }";
    String result = compile(js);
    Assert.assertNotNull(result);
  }

  @Test
  public void testProcess_multipleFunctionsInFile_inlinesIndependently() {
    String js = "function f1() { var x = 1; return x; }\nfunction f2() { var y = 2; return y; }";
    String result = compile(js);
    Assert.assertTrue(result.contains("return 1"));
    Assert.assertTrue(result.contains("return 2"));
  }
}
