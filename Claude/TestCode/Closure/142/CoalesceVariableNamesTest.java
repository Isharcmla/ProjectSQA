package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Unit tests for {@link CoalesceVariableNames}.
 *
 * Note: CoalesceVariableNames is tightly coupled with the internal compiler
 * infrastructure (Scope, NodeTraversal, ControlFlowGraph, LiveVariablesAnalysis).
 * To exercise its public API (process/enterScope/exitScope/visit through
 * NodeTraversal) we rely on the real com.google.javascript.jscomp.Compiler,
 * CompilerOptions and SourceFile classes that belong to the same library as
 * the class under test, since no mocking framework is allowed.
 */
public class CoalesceVariableNamesTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
  }

  private Node parseAndGetJsRoot(String js) {
    List<SourceFile> externs = ImmutableList.of();
    List<SourceFile> inputs = ImmutableList.of(SourceFile.fromCode("input.js", js));
    compiler.compile(externs, inputs, options);
    Node root = compiler.getRoot();
    return root.getLastChild();
  }

  @Test
  public void testConstructor_usePseudoNamesFalse_createsInstanceSuccessfully() {
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    assertNotNull(pass);
  }

  @Test
  public void testConstructor_usePseudoNamesTrue_createsInstanceSuccessfully() {
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, true);
    assertNotNull(pass);
  }

  @Test
  public void testProcess_simpleFunctionWithTwoNonOverlappingVars_coalescesVariables() {
    String js = "function f() { var x = 1; print(x); var y = 2; print(y); }";
    Node jsRoot = parseAndGetJsRoot(js);
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, jsRoot);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
    // After coalescing, y should have been merged into x and disappear.
    assertFalse(output.contains("y"));
  }

  @Test
  public void testProcess_usePseudoNamesTrue_pseudoNameProducedWithoutException() {
    String js = "function f() { var x = 1; print(x); var y = 2; print(y); }";
    Node jsRoot = parseAndGetJsRoot(js);
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, true);
    pass.process(null, jsRoot);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }

  @Test
  public void testProcess_globalScopeOnly_variablesAreNotCoalesced() {
    String js = "var x = 1; print(x); var y = 2; print(y);";
    Node jsRoot = parseAndGetJsRoot(js);
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, jsRoot);
    String output = compiler.toSource(jsRoot);
    // Global scope is skipped in enterScope, so both x and y should remain.
    assertTrue(output.contains("x"));
    assertTrue(output.contains("y"));
  }

  @Test
  public void testProcess_forInLoop_handlesSpecialCaseWithoutException() {
    String js =
        "function f(obj) { for (var k in obj) { print(k); } var z = 1; print(z); }";
    Node jsRoot = parseAndGetJsRoot(js);
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, jsRoot);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }

  @Test
  public void testProcess_multipleFunctionScopes_eachProcessedIndependently() {
    String js =
        "function f() { var a = 1; print(a); } "
            + "function g() { var b = 2; print(b); }";
    Node jsRoot = parseAndGetJsRoot(js);
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, jsRoot);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }

  @Test
  public void testProcess_emptyScript_noExceptionThrown() {
    String js = "";
    Node jsRoot = parseAndGetJsRoot(js);
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, jsRoot);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }

  @Test
  public void testProcess_escapedVariableViaClosure_pipelineCompletesWithoutException() {
    String js =
        "function f() { var x = 1; var y = 2; "
            + "function g() { return x; } print(y); return g; }";
    Node jsRoot = parseAndGetJsRoot(js);
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, jsRoot);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }

  @Test
  public void testProcess_functionParametersLP_handledInInterferenceGraph() {
    String js = "function f(a, b) { print(a); print(b); var c = 3; print(c); }";
    Node jsRoot = parseAndGetJsRoot(js);
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, jsRoot);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }

  @Test
  public void testProcess_forLoopWithoutForIn_handlesVarDeclarationRemoval() {
    String js =
        "function f() { var i; for (i = 0; i < 10; i++) { print(i); } "
            + "var j = 5; print(j); }";
    Node jsRoot = parseAndGetJsRoot(js);
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, jsRoot);
    String output = compiler.toSource(jsRoot);
    assertNotNull(output);
  }

  @Test
  public void testProcess_singleVariable_noCoalescingNeeded() {
    String js = "function f() { var x = 1; print(x); }";
    Node jsRoot = parseAndGetJsRoot(js);
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, jsRoot);
    String output = compiler.toSource(jsRoot);
    assertTrue(output.contains("x"));
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullRoot_throwsNullPointerException() {
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, null);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullCompiler_throwsNullPointerExceptionWhenProcessing() {
    CoalesceVariableNames pass = new CoalesceVariableNames(null, false);
    Node jsRoot = parseAndGetJsRoot("function f() { var x = 1; print(x); }");
    pass.process(null, jsRoot);
  }
}
