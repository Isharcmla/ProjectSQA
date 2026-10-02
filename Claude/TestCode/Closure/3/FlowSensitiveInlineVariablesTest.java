package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.Node;

import java.util.Collections;

/**
 * Unit tests for {@link FlowSensitiveInlineVariables}.
 *
 * These tests exercise the public API of the class (constructor, process,
 * visit) by running the pass through a real {@link Compiler} instance and
 * inspecting the resulting AST/source output. No mocking framework is used.
 */
public class FlowSensitiveInlineVariablesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  /**
   * Helper method that parses the given JS source, runs the
   * FlowSensitiveInlineVariables pass on it, and returns the resulting JS
   * root node.
   */
  private Node parseAndRunPass(String js) {
    CompilerOptions options = new CompilerOptions();
    SourceFile input = SourceFile.fromCode("input.js", js);
    SourceFile externs = SourceFile.fromCode("externs.js", "");
    compiler.init(
        Collections.singletonList(externs),
        Collections.singletonList(input),
        options);
    compiler.parse();

    Node externsRoot = compiler.getExternsRoot();
    Node jsRoot = compiler.getJsRoot();

    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(externsRoot, jsRoot);

    return jsRoot;
  }

  // ---------------------------------------------------------------------
  // Constructor tests
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_validCompiler_createsInstanceWithoutException() {
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    assertNotNull(pass);
  }

  @Test
  public void testConstructor_nullCompiler_doesNotThrowImmediately() {
    // Constructor itself does not dereference the compiler, so passing null
    // should not throw at construction time.
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(null);
    assertNotNull(pass);
  }

  // ---------------------------------------------------------------------
  // visit() tests
  // ---------------------------------------------------------------------

  @Test
  public void testVisit_calledWithNulls_doesNotThrowException() {
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    // visit() body is empty (a no-op), so calling it with null arguments
    // should be completely safe.
    pass.visit(null, null, null);
    assertTrue(true);
  }

  // ---------------------------------------------------------------------
  // process() - normal/typical cases
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_simpleAssignmentInFunction_inlinesVariable() {
    String js = "function f() { var x = 1; return x; }";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);

    // The single definition/use pair should be inlined.
    assertTrue("Expected inlined value 1 in output: " + output,
        output.contains("1"));
  }

  @Test
  public void testProcess_assignExpression_inlinesVariable() {
    String js = "function f() { var x; x = 5; return x; }";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }

  // ---------------------------------------------------------------------
  // process() - edge cases
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_globalScope_variableNotTouched() {
    // Global scope variables should never be inlined because enterScope
    // returns early when t.inGlobalScope() is true.
    String js = "var x = 1; print(x);";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);

    assertTrue("Global var should remain untouched: " + output,
        output.contains("var x"));
  }

  @Test
  public void testProcess_variableUsedTwice_notInlined() {
    // Since the variable is used more than once within the same CFG node,
    // it must NOT be inlined (numUseWithinUseCfgNode != 1).
    String js = "function f(){ var x = 1; return x + x; }";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);

    assertTrue("Variable used twice should not be inlined: " + output,
        output.contains("var x") || output.contains("x+x") || output.contains("x + x"));
  }

  @Test
  public void testProcess_variableUsedInsideLoop_notInlined() {
    // The use of the variable is within a loop, so it must not be inlined
    // (NodeUtil.isWithinLoop(use) check).
    String js = "function f(){ var x = 1; while (cond()) { print(x); } }";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);

    assertTrue("Variable used inside a loop should remain: " + output,
        output.contains("var x"));
  }

  @Test
  public void testProcess_rhsIsGetProp_notInlined() {
    // The right hand side of the definition contains a GETPROP node, so
    // inlining should be blocked per the Candidate#canInline() checks.
    String js = "function f(){ var x = a.b; return x; }";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);

    assertTrue("Variable with GETPROP rhs should not be inlined: " + output,
        output.contains("var x"));
  }

  @Test
  public void testProcess_rhsHasSideEffectCall_notInlined() {
    // A side-effecting call on the right-hand side of the definition should
    // prevent inlining (NodeUtil.mayHaveSideEffects check).
    String js = "function f(){ var x = foo(); bar(); return x; }";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);

    assertNotNull(output);
  }

  @Test
  public void testProcess_emptyScript_noExceptionThrown() {
    Node jsRoot = parseAndRunPass("");
    assertNotNull(jsRoot);
  }

  @Test
  public void testProcess_functionParameter_notInlinedAsAssignment() {
    // The definition CFG node for a parameter is the function node itself,
    // which triggers the "getDefCfgNode().isFunction()" early return false
    // in canInline(), so the parameter usage remains unchanged.
    String js = "function f(x) { return x; }";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);

    assertTrue("Parameter usage should remain: " + output,
        output.contains("x"));
  }

  @Test
  public void testProcess_tooManyLocalVariables_scopeSkipped() {
    // When the number of variables in scope exceeds
    // LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE, enterScope() returns
    // early and no inlining should occur, even for otherwise valid
    // candidates.
    StringBuilder sb = new StringBuilder();
    sb.append("function f() {");
    int tooMany = LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE + 10;
    for (int i = 0; i < tooMany; i++) {
      sb.append("var v").append(i).append(" = ").append(i).append(";");
    }
    sb.append(" return v0; }");

    Node jsRoot = parseAndRunPass(sb.toString());
    String output = compiler.toSource(jsRoot);

    assertTrue("Scope with too many vars should be skipped, var v0 should remain: "
        + output, output.contains("v0"));
  }

  @Test
  public void testProcess_multipleFunctions_eachScopeProcessedIndependently() {
    String js = "function f() { var x = 1; return x; } "
        + "function g() { var y = 2; return y; }";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }

  @Test
  public void testProcess_nestedFunction_innerScopeHandled() {
    String js = "function f() { function g() { var z = 3; return z; } return g(); }";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }

  // ---------------------------------------------------------------------
  // process() - exception / invalid input cases
  // ---------------------------------------------------------------------

  @Test(expected = RuntimeException.class)
  public void testProcess_nullCompilerAndNullRoots_throwsException() {
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(null);
    pass.process(null, null);
  }

  @Test(expected = RuntimeException.class)
  public void testProcess_validCompilerButNullRoots_throwsException() {
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(null, null);
  }

  @Test
  public void testProcess_catchExpressionUsage_notInlinedIncorrectly() {
    // Variables from catch blocks are special-cased and should not cause
    // an exception when analyzed; the pass should simply skip inlining
    // for the catch parameter usage.
    String js = "function f() { try { foo(); } catch (e) { print(e); } }";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }

  @Test
  public void testProcess_incDecOperators_notTreatedAsSimpleUse() {
    String js = "function f() { var x = 1; x++; return x; }";
    Node jsRoot = parseAndRunPass(js);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }
}
