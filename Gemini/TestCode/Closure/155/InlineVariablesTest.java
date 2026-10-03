package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class InlineVariablesTest {

  private String testInline(String js, InlineVariables.Mode mode, boolean inlineAllStrings) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode(js);

    InlineVariables pass = new InlineVariables(compiler, mode, inlineAllStrings);
    pass.process(externs, root);

    return compiler.toSource(root).trim();
  }

  @Test
  public void testProcess_modeAll_singleUseVarInlined() {
    String js = "function f() { var x = 1; return x; }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(){return 1}", result);
  }

  @Test
  public void testProcess_modeAll_immutableMultiUseVarInlined() {
    String js = "function f() { var x = 5; return x + x; }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(){return 5+5}", result);
  }

  @Test
  public void testProcess_modeConstantsOnly_constantInlined() {
    String js = "var CONST_VAL = 10; function f() { return CONST_VAL; }";
    String result = testInline(js, InlineVariables.Mode.CONSTANTS_ONLY, false);
    Assert.assertEquals("function f(){return 10}", result);
  }

  @Test
  public void testProcess_modeConstantsOnly_nonConstantNotInlined() {
    String js = "var normalVal = 10; function f() { return normalVal; }";
    String result = testInline(js, InlineVariables.Mode.CONSTANTS_ONLY, false);
    Assert.assertEquals("var normalVal=10;function f(){return normalVal}", result);
  }

  @Test
  public void testProcess_modeLocalsOnly_localInlinedGlobalNot() {
    String js = "var globalVar = 1; function f() { var localVar = 2; return globalVar + localVar; }";
    String result = testInline(js, InlineVariables.Mode.LOCALS_ONLY, false);
    Assert.assertEquals("var globalVar=1;function f(){return globalVar+2}", result);
  }

  @Test
  public void testProcess_inlineAllStrings_true() {
    String js = "var CONST_STR = 'very_long_string_constant_value'; function f() { return CONST_STR + CONST_STR; }";
    String result = testInline(js, InlineVariables.Mode.ALL, true);
    Assert.assertEquals("function f(){return\"very_long_string_constant_value\"+\"very_long_string_constant_value\"}", result);
  }

  @Test
  public void testProcess_inlineAllStrings_false_longStringNotWorthInlining() {
    String js = "var CONST_STR = 'very_long_string_constant_value_that_is_repeated_many_times'; " +
        "function f() { return CONST_STR + CONST_STR + CONST_STR + CONST_STR + CONST_STR; }";
    String result = testInline(js, InlineVariables.Mode.CONSTANTS_ONLY, false);
    Assert.assertTrue(result.contains("CONST_STR"));
  }

  @Test
  public void testProcess_getPropCall_notInlinedToPreserveContext() {
    String js = "function f(obj) { var a = obj.method; a(); }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(obj){var a=obj.method;a()}", result);
  }

  @Test
  public void testProcess_getPropPassedAsArgument_inlined() {
    String js = "function f(obj, g) { var a = obj.property; g(a); }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(obj,g){g(obj.property)}", result);
  }

  @Test
  public void testProcess_declarationSeparatedFromAssignment_inlined() {
    String js = "function f() { var a; a = 1; return a; }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(){return 1}", result);
  }

  @Test
  public void testProcess_uninitializedVar_inlinedAsUndefined() {
    String js = "function f() { var a; return a + a; }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(){return void 0+void 0}", result);
  }

  @Test
  public void testProcess_aliasCandidate_inlined() {
    String js = "function f(x) { var a = x; var b = a; return b; }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(x){return x}", result);
  }

  @Test
  public void testProcess_thisAlias_inlined() {
    String js = "function f() { var self = this; return self.foo() + self.bar(); }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(){return this.foo()+this.bar()}", result);
  }

  @Test
  public void testProcess_sideEffectsBetweenDeclarationAndReference_notInlined() {
    String js = "function f(obj) { var a = obj.foo; bar(); return a; }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(obj){var a=obj.foo;bar();return a}", result);
  }

  @Test
  public void testProcess_forLoopVarDeclaration_notInlined() {
    String js = "for (var i = 0; i < 10; i++) { alert(i); }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("for(var i=0;i<10;i++){alert(i)}", result);
  }

  @Test
  public void testProcess_specialRenamePropertyFunction_notInlined() {
    String js = "function JSCompiler_renameProperty(p) { return p; } var x = JSCompiler_renameProperty('foo');";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertTrue(result.contains("JSCompiler_renameProperty"));
  }

  @Test
  public void testProcess_functionExpression_inlined() {
    String js = "function f() { var g = function() { return 1; }; return g(); }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(){return(function(){return 1})()}", result);
  }

  @Test
  public void testProcess_unusedAssignedVar_removed() {
    String js = "function f() { var a; a = 1; }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(){1}", result);
  }

  @Test
  public void testProcess_crossBasicBlock_notInlined() {
    String js = "function f(cond) { var a = 1; if (cond) { return a; } return 2; }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(cond){var a=1;if(cond)return a;return 2}", result);
  }

  @Test
  public void testProcess_multipleVarsInSingleDeclaration_onlyInlinableRemoved() {
    String js = "function f() { var a = 1, b = 2; return a + b + b; }";
    String result = testInline(js, InlineVariables.Mode.ALL, false);
    Assert.assertEquals("function f(){return 1+2+2}", result);
  }
}
