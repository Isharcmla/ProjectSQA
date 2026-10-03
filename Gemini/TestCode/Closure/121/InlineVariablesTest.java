package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class InlineVariablesTest {

  private void test(String js, String expected, InlineVariables.Mode mode, boolean inlineAllStrings) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node root = compiler.parseTestCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());

    InlineVariables pass = new InlineVariables(compiler, mode, inlineAllStrings);
    pass.process(externs, root);

    Node expectedRoot = compiler.parseTestCode(expected);
    String actualCode = compiler.toSource(root);
    String expectedCode = compiler.toSource(expectedRoot);

    Assert.assertEquals(expectedCode, actualCode);
  }

  private void testSame(String js, InlineVariables.Mode mode, boolean inlineAllStrings) {
    test(js, js, mode, inlineAllStrings);
  }

  @Test
  public void testProcess_allMode_inlinesSingleUseVariable() {
    String js = "function f() { var x = 1; return x; }";
    String expected = "function f() { return 1; }";
    test(js, expected, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_allMode_inlinesImmutableMultipleUses() {
    String js = "function f() { var x = 1; return x + x; }";
    String expected = "function f() { return 1 + 1; }";
    test(js, expected, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_constantsOnlyMode_inlinesConstants() {
    String js = "var CONST_VAL = 10; var y = CONST_VAL + 1;";
    String expected = "var y = 10 + 1;";
    test(js, expected, InlineVariables.Mode.CONSTANTS_ONLY, true);
  }

  @Test
  public void testProcess_constantsOnlyMode_doesNotInliningNonConstants() {
    String js = "var val = 10; var y = val + 1;";
    testSame(js, InlineVariables.Mode.CONSTANTS_ONLY, true);
  }

  @Test
  public void testProcess_localsOnlyMode_inlinesLocalsOnly() {
    String js = "var global = 1; function f() { var local = 2; return local + global; }";
    String expected = "var global = 1; function f() { return 2 + global; }";
    test(js, expected, InlineVariables.Mode.LOCALS_ONLY, true);
  }

  @Test
  public void testProcess_separateDeclarationAndInitialization() {
    String js = "function f() { var x; x = 1; return x; }";
    String expected = "function f() { return 1; }";
    test(js, expected, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_uninitializedVariable_inlinesUndefined() {
    String js = "function f() { var x; return x + x; }";
    String expected = "function f() { return void 0 + void 0; }";
    test(js, expected, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_unusedVariableWithInit_removesDeclarationAndAssignment() {
    String js = "function f() { var x; x = 1; }";
    String expected = "function f() { }";
    test(js, expected, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_thisAlias_inlinesThis() {
    String js = "function f() { var self = this; return self.foo(); }";
    String expected = "function f() { return this.foo(); }";
    test(js, expected, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_aliasCandidateInlining() {
    String js = "function f(a) { var b = a; var c = b; return c; }";
    String expected = "function f(a) { var b = a; return b; }";
    test(js, expected, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_stringNotWorthInlining_whenInlineAllStringsFalse() {
    String js = "var CONST_STR = 'a_very_long_string_literal_here_that_exceeds_threshold'; var a = CONST_STR; var b = CONST_STR;";
    testSame(js, InlineVariables.Mode.CONSTANTS_ONLY, false);
  }

  @Test
  public void testProcess_stringWorthInlining_whenInlineAllStringsTrue() {
    String js = "var CONST_STR = 'a_very_long_string_literal_here_that_exceeds_threshold'; var a = CONST_STR;";
    String expected = "var a = 'a_very_long_string_literal_here_that_exceeds_threshold';";
    test(js, expected, InlineVariables.Mode.CONSTANTS_ONLY, true);
  }

  @Test
  public void testProcess_stringShort_inlinesEvenWhenInlineAllStringsFalse() {
    String js = "var CONST_STR = 's'; var a = CONST_STR;";
    String expected = "var a = 's';";
    test(js, expected, InlineVariables.Mode.CONSTANTS_ONLY, false);
  }

  @Test
  public void testProcess_argumentsModified_doesNotInlineAlias() {
    String js = "function f(a) { var b = a; arguments[0] = 2; return b; }";
    testSame(js, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_argumentsPassedOrEscaped_doesNotInlineAlias() {
    String js = "function f(a) { var b = a; g(arguments); return b; }";
    testSame(js, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_argumentsRead_inlinesAliasSafely() {
    String js = "function f(a) { var b = a; var x = arguments[0]; var c = b; return c + x; }";
    String expected = "function f(a) { var b = a; var x = arguments[0]; return b + x; }";
    test(js, expected, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_methodCallContext_doesNotInliningGetPropIntoCall() {
    String js = "var a = obj.method; a();";
    testSame(js, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_getPropPassedAsArgument_inlinesSafely() {
    String js = "var a = obj.method; f(a);";
    String expected = "f(obj.method);";
    test(js, expected, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_multipleVarsInSingleDeclaration() {
    String js = "function f() { var x = 1, y = 2; return x + y; }";
    String expected = "function f() { return 1 + 2; }";
    test(js, expected, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_acrossControlFlow_doesNotInlining() {
    String js = "function f(cond) { var x = 1; if (cond) { return x; } return 0; }";
    testSame(js, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_sideEffectInterference_doesNotInlining() {
    String js = "function f() { var x = g(); doSomething(); return x; }";
    testSame(js, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_functionDeclarationInlined() {
    String js = "function f() { function g() { return 42; } return g(); }";
    String expected = "function f() { return (function() { return 42; })(); }";
    test(js, expected, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_lValueVariable_doesNotInlining() {
    String js = "function f() { var x = 1; x++; return x; }";
    testSame(js, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_exportedVariable_doesNotInlining() {
    String js = "var _exportName = 1; var y = _exportName;";
    testSame(js, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_emptyBlockAndNoVariables() {
    String js = "function f() {}";
    testSame(js, InlineVariables.Mode.ALL, true);
  }

  @Test
  public void testProcess_modeEnumCoverage() {
    Assert.assertEquals(3, InlineVariables.Mode.values().length);
    Assert.assertEquals(InlineVariables.Mode.CONSTANTS_ONLY, InlineVariables.Mode.valueOf("CONSTANTS_ONLY"));
    Assert.assertEquals(InlineVariables.Mode.LOCALS_ONLY, InlineVariables.Mode.valueOf("LOCALS_ONLY"));
    Assert.assertEquals(InlineVariables.Mode.ALL, InlineVariables.Mode.valueOf("ALL"));
  }
}
