package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Test;

public class InlineVariablesTest extends CompilerTestCase {

  private InlineVariables.Mode mode = InlineVariables.Mode.ALL;
  private boolean inlineAllStrings = true;

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new InlineVariables(compiler, mode, inlineAllStrings);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Test
  public void testProcess_allMode_inlinesSingleUseVariable() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    test("function f() { var a = 1; var b = a; }", "function f() { var b = 1; }");
  }

  @Test
  public void testProcess_allMode_inlinesImmutableMultipleUses() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    test("function f() { var a = 1; var b = a; var c = a; }",
         "function f() { var b = 1; var c = 1; }");
  }

  @Test
  public void testProcess_allMode_inlinesUninitializedVariable() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    test("function f() { var a; var b = a; var c = a; }",
         "function f() { var b = void 0; var c = void 0; }");
  }

  @Test
  public void testProcess_allMode_inlinesThisAlias() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    test("function f() { var self = this; self.foo(); self.bar(); }",
         "function f() { this.foo(); this.bar(); }");
  }

  @Test
  public void testProcess_allMode_separateDeclarationAndInitialization() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    test("function f() { var a; a = 1; var b = a; }",
         "function f() { var b = 1; }");
  }

  @Test
  public void testProcess_allMode_separateDeclarationAndInitWithoutSubsequentUse() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    test("function f() { var a; a = 1; }", "function f() {}");
  }

  @Test
  public void testProcess_allMode_inlinesFunctionDeclaration() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    test("function f() { function g() { return 42; } return g(); }",
         "function f() { return function g() { return 42; }(); }");
  }

  @Test
  public void testProcess_allMode_inlinesAliases() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    test("function f(x) { var a = x; var b = a; return b + b; }",
         "function f(x) { var a = x; return a + a; }");
  }

  @Test
  public void testProcess_allMode_doesNotInlineGetPropIntoCall() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    testSame("function f(o) { var a = o.m; a(); }");
  }

  @Test
  public void testProcess_allMode_inlinesGetPropIntoNonCall() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    test("function f(o, g) { var a = o.m; g(a); }",
         "function f(o, g) { g(o.m); }");
  }

  @Test
  public void testProcess_allMode_argumentsEscaped_doesNotInlineAlias() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    testSame("function f(x) { var a = x; var b = a; var args = arguments; return b + b; }");
  }

  @Test
  public void testProcess_allMode_argumentsPropertyRead_allowsInlining() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    test("function f(x) { var a = x; var b = a; var len = arguments.length; return b + b; }",
         "function f(x) { var a = x; var len = arguments.length; return a + a; }");
  }

  @Test
  public void testProcess_allMode_argumentsModified_preventsAliasInlining() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    testSame("function f(x) { var a = x; var b = a; arguments[0] = 2; return b + b; }");
  }

  @Test
  public void testProcess_allMode_argumentsIncremented_preventsAliasInlining() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    testSame("function f(x) { var a = x; var b = a; arguments.length++; return b + b; }");
  }

  @Test
  public void testProcess_allMode_stringHeuristic_notWorthInlining() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = false;
    testSame("var a = 'this_is_a_very_long_string_that_should_not_be_duplicated'; var b = a; var c = a; var d = a;");
  }

  @Test
  public void testProcess_allMode_stringHeuristic_worthInlining() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = false;
    test("function f() { var a = 's'; var b = a; }",
         "function f() { var b = 's'; }");
  }

  @Test
  public void testProcess_allMode_varDeclaredInForLoop_doesNotInline() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    testSame("for (var a = 1; a < 2; a++) { var b = a; }");
  }

  @Test
  public void testProcess_allMode_crossBasicBlocks_doesNotInlineNonLiteral() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    testSame("function f(o) { var a = o.x; if (true) { return a; } }");
  }

  @Test
  public void testProcess_allMode_intermediateSideEffects_preventsInlining() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    testSame("function f(o, g) { var a = o.x; g(); return a; }");
  }

  @Test
  public void testProcess_localsOnlyMode_inlinesLocalsIgnoresGlobals() {
    mode = InlineVariables.Mode.LOCALS_ONLY;
    inlineAllStrings = true;
    test("var globalVar = 1; var useGlobal = globalVar; function f() { var localVar = 2; var useLocal = localVar; }",
         "var globalVar = 1; var useGlobal = globalVar; function f() { var useLocal = 2; }");
  }

  @Test
  public void testProcess_constantsOnlyMode_inlinesConstantsOnly() {
    mode = InlineVariables.Mode.CONSTANTS_ONLY;
    inlineAllStrings = true;
    test("var CONST_A = 1; var b = CONST_A; var normalVar = 2; var d = normalVar;",
         "var b = 1; var normalVar = 2; var d = normalVar;");
  }

  @Test
  public void testProcess_constantsOnlyMode_jsdocConstInlined() {
    mode = InlineVariables.Mode.CONSTANTS_ONLY;
    inlineAllStrings = true;
    test("/** @const */ var a = 1; var b = a;",
         "var b = 1;");
  }

  @Test
  public void testProcess_constantsOnlyMode_multipleDeclarationsInOneVar() {
    mode = InlineVariables.Mode.CONSTANTS_ONLY;
    inlineAllStrings = true;
    test("var CONST_A = 1, CONST_B = 2; var c = CONST_A + CONST_B;",
         "var c = 1 + 2;");
  }

  @Test
  public void testProcess_constantsOnlyMode_reassignedConstant_doesNotInlining() {
    mode = InlineVariables.Mode.CONSTANTS_ONLY;
    inlineAllStrings = true;
    testSame("var CONST_A = 1; CONST_A = 2; var b = CONST_A;");
  }

  @Test
  public void testProcess_constantsOnlyMode_nonImmutableConstant_doesNotInlining() {
    mode = InlineVariables.Mode.CONSTANTS_ONLY;
    inlineAllStrings = true;
    testSame("var CONST_A = Math.random(); var b = CONST_A;");
  }

  @Test
  public void testProcess_modeEnumCoverage() {
    InlineVariables.Mode[] modes = InlineVariables.Mode.values();
    Assert.assertEquals(3, modes.length);
    Assert.assertEquals(InlineVariables.Mode.CONSTANTS_ONLY, InlineVariables.Mode.valueOf("CONSTANTS_ONLY"));
    Assert.assertEquals(InlineVariables.Mode.LOCALS_ONLY, InlineVariables.Mode.valueOf("LOCALS_ONLY"));
    Assert.assertEquals(InlineVariables.Mode.ALL, InlineVariables.Mode.valueOf("ALL"));
  }

  @Test
  public void testProcess_specialProperties_forbiddenInlining() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    testSame("function f() { var JSCompiler_renameProperty = function(p) { return p; }; var x = JSCompiler_renameProperty('foo'); }");
  }

  @Test
  public void testProcess_emptyProgram() {
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = true;
    test("", "");
  }
}
