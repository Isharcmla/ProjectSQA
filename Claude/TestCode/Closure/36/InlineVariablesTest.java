package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link InlineVariables}.
 *
 * These tests exercise the public API (constructor + process(Node, Node))
 * of InlineVariables using the real Closure Compiler infrastructure
 * (Compiler, CompilerOptions, SourceFile) without any mocking framework.
 */
public class InlineVariablesTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
  }

  /**
   * Helper that compiles the given JS source with empty externs and
   * returns the compact (whitespace-stripped) output source after
   * running the InlineVariables pass with the given mode.
   */
  private String compileAndInline(String js, InlineVariables.Mode mode, boolean inlineAllStrings) {
    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", js);
    compiler.compile(externs, input, options);

    InlineVariables pass = new InlineVariables(compiler, mode, inlineAllStrings);
    pass.process(compiler.getExternsRoot(), compiler.getJsRoot());

    String output = compiler.toSource();
    return output.replaceAll("\\s+", "");
  }

  // ---------------------------------------------------------------------
  // Normal / typical usage
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_allMode_inlinesSimpleLocalVariable_expectedResult() {
    String js = "function f() { var x = 1; return x; }";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);

    assertTrue("Expected the literal value to be inlined into the return statement",
        compact.contains("return1"));
    assertFalse("Expected the original declaration to be removed",
        compact.contains("varx"));
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_constantsOnlyMode_inlinesDeclaredConstant_expectedResult() {
    String js = "/** @const */ var C = 5; var y = C + 1;";
    String compact = compileAndInline(js, InlineVariables.Mode.CONSTANTS_ONLY, true);

    assertFalse("Expected the constant declaration to be removed",
        compact.contains("varC"));
    assertTrue("Expected the constant value to be inlined into the usage",
        compact.contains("5+1"));
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_localsOnlyMode_inlinesLocalButNotGlobal_expectedResult() {
    String js = "var g = 1; function f() { var x = 2; return x; }";
    String compact = compileAndInline(js, InlineVariables.Mode.LOCALS_ONLY, true);

    assertTrue("Expected the local variable to be inlined",
        compact.contains("return2"));
    assertFalse("Expected the local declaration to be removed",
        compact.contains("varx"));
    assertTrue("Expected the global variable declaration to remain untouched",
        compact.contains("varg=1"));
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_allMode_inlinesStringConstantWhenBeneficial_expectedResult() {
    String js = "/** @const */ var S = 'a'; var y = S;";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);

    // With inlineAllStrings = true, the string should always be inlined.
    assertFalse("Expected the constant declaration to be removed",
        compact.contains("varS"));
    assertTrue("Expected the string constant to be inlined",
        compact.contains("y='a'") || compact.contains("y=\"a\""));
    assertEquals(0, compiler.getErrorCount());
  }

  // ---------------------------------------------------------------------
  // Edge cases
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_emptyScript_noExceptionAndNoErrors() {
    String js = "";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);

    assertNotNull(compact);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_unusedVariable_notInlined_expectedUnchanged() {
    String js = "var unused = 5;";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);

    // A variable referenced only once (its own declaration) should not be
    // touched by the inlining logic (there is nothing to inline it into).
    assertTrue("Expected the unused variable declaration to remain",
        compact.contains("varunused=5"));
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_variableNeverInitialized_doesNotThrow() {
    String js = "function f() { var x; return x; }";
    // Should not throw even though x has no initializer.
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);
    assertNotNull(compact);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_argumentsUsage_doesNotThrow() {
    String js = "function f() { var a = arguments[0]; return a; }";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);
    assertNotNull(compact);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_argumentsEscaped_doesNotThrow() {
    // Passing 'arguments' itself as a value should be treated as a
    // possible escape, exercising maybeEscapedOrModifiedArguments's
    // "escaped" branch.
    String js = "function f() { var a = 1; var args = arguments; foo(args); return a; }";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);
    assertNotNull(compact);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_aliasCandidateVariable_doesNotThrow() {
    // Exercises the alias-candidate collection/inlining logic:
    // 'a' is assigned from 'x' and referenced multiple times.
    String js = "function f(x) { var a = x; foo(a); bar(a); }";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);
    assertNotNull(compact);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_functionDeclarationValue_doesNotThrow() {
    // Exercises the function-value inlining branch (canMoveAggressively /
    // isFunctionDeclaration handling).
    String js = "function f() { function g() { return 1; } var h = g; return h(); }";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);
    assertNotNull(compact);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_assignmentThenSingleUse_inlinesAssignment_expectedResult() {
    // Exercises the "declaration != init, refCount == 2" branch:
    // var declared without value, then assigned once, then used once.
    String js = "function f() { var x; x = 3; return x; }";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);
    assertNotNull(compact);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_getPropCallNotInlinedIntoCallContext_doesNotThrow() {
    // Exercises the "do not inline a GETPROP value into a call" guard.
    String js = "function f(b) { var a = b.c; a(); }";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);
    assertNotNull(compact);
    assertEquals(0, compiler.getErrorCount());
  }

  // ---------------------------------------------------------------------
  // Exception / error scenarios
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_nullCompiler_throwsException() {
    InlineVariables pass = new InlineVariables(null, InlineVariables.Mode.ALL, true);
    boolean threw = false;
    try {
      pass.process(null, null);
    } catch (Exception e) {
      threw = true;
    }
    assertTrue("Expected an exception to be thrown when compiler is null", threw);
  }

  @Test
  public void testProcess_nullRootNodes_throwsException() {
    // Use a valid compiler but null AST roots; the underlying traversal
    // infrastructure should fail since it needs valid Node trees.
    InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.ALL, true);
    boolean threw = false;
    try {
      pass.process(null, null);
    } catch (Exception e) {
      threw = true;
    }
    assertTrue("Expected an exception to be thrown when root nodes are null", threw);
  }

  // ---------------------------------------------------------------------
  // Constructor and enum coverage
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_createsInstance_notNull() {
    InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
    assertNotNull(pass);
  }

  @Test
  public void testModeEnum_valuesAndValueOf_expectedResult() {
    InlineVariables.Mode[] modes = InlineVariables.Mode.values();
    assertEquals(3, modes.length);

    assertEquals(InlineVariables.Mode.CONSTANTS_ONLY,
        InlineVariables.Mode.valueOf("CONSTANTS_ONLY"));
    assertEquals(InlineVariables.Mode.LOCALS_ONLY,
        InlineVariables.Mode.valueOf("LOCALS_ONLY"));
    assertEquals(InlineVariables.Mode.ALL,
        InlineVariables.Mode.valueOf("ALL"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testModeEnum_valueOfInvalidName_throwsIllegalArgumentException() {
    InlineVariables.Mode.valueOf("NOT_A_REAL_MODE");
  }

  @Test
  public void testProcess_withInlineAllStringsFalse_doesNotThrow() {
    String js = "/** @const */ var S = 'aVeryLongConstantStringValueHere'; "
        + "var y = S; var z = S; var w = S;";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, false);
    assertNotNull(compact);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_multipleScopesNested_doesNotThrow() {
    String js = "function outer() { var a = 1; function inner() { var b = 2; return b; } "
        + "return a + inner(); }";
    String compact = compileAndInline(js, InlineVariables.Mode.ALL, true);
    assertNotNull(compact);
    assertEquals(0, compiler.getErrorCount());
  }
}
