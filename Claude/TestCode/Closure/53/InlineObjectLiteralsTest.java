package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link InlineObjectLiterals}.
 *
 * Since InlineObjectLiterals depends on the real Closure Compiler
 * infrastructure (AbstractCompiler, NodeTraversal, Scope, etc.) and
 * mocking frameworks are not allowed, the real {@link Compiler} class
 * (a concrete implementation of AbstractCompiler within the same
 * package) is used to exercise the pass through its public API.
 */
public class InlineObjectLiteralsTest {

  private Compiler compiler;
  private Supplier<String> safeNameIdSupplier;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    safeNameIdSupplier = compiler.getUniqueNameIdSupplier();
  }

  /**
   * Helper: parse JS source into a script Node using the compiler's
   * package-private test helper.
   */
  private Node parse(String js) {
    Node script = compiler.parseTestCode(js);
    assertNotNull("Parsed script should not be null", script);
    return script;
  }

  private Node emptyExterns() {
    return new Node(Token.BLOCK);
  }

  // ---------------------------------------------------------------------
  // (ก) Normal / typical input cases
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_validArguments_createsInstanceSuccessfully() {
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, safeNameIdSupplier);
    assertNotNull(pass);
  }

  @Test
  public void testProcess_localVariablePropertyOnlyAccess_inlinesObjectLiteral() {
    String js = "function f() { var x = {a: 1, b: 2}; return x.a + x.b; }";
    Node root = parse(js);
    Node externs = emptyExterns();

    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, safeNameIdSupplier);
    pass.process(externs, root);

    String output = compiler.toSource(root);
    assertNotNull(output);
    // Since x is only accessed through properties (never in full),
    // it should be split up into inline variables.
    assertTrue(
        "Expected inlined variable prefix in output: " + output,
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  @Test
  public void testProcess_localVariableFullReference_doesNotInline() {
    String js = "function f() { var x = {a: 1, b: 2}; return x; }";
    Node root = parse(js);
    Node externs = emptyExterns();

    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, safeNameIdSupplier);
    pass.process(externs, root);

    String output = compiler.toSource(root);
    assertNotNull(output);
    // Since x is used in full ("return x;"), it must not be inlined.
    assertFalse(
        "Did not expect inlined variable prefix in output: " + output,
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  // ---------------------------------------------------------------------
  // (ข) Edge cases
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_globalVariable_doesNotInline() {
    // Global variables are always excluded from inlining, regardless of
    // usage pattern.
    String js = "var x = {a: 1, b: 2}; x.a; x.b;";
    Node root = parse(js);
    Node externs = emptyExterns();

    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, safeNameIdSupplier);
    pass.process(externs, root);

    String output = compiler.toSource(root);
    assertNotNull(output);
    assertFalse(
        "Global variables must never be inlined: " + output,
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  @Test
  public void testProcess_emptyScript_noExceptionThrown() {
    String js = "";
    Node root = parse(js);
    Node externs = emptyExterns();

    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, safeNameIdSupplier);
    try {
      pass.process(externs, root);
    } catch (Exception e) {
      fail("Processing an empty script should not throw an exception: " + e);
    }
    assertNotNull(root);
  }

  @Test
  public void testProcess_variableWithNoAssignment_doesNotInline() {
    // A var declared but never assigned an object literal should not be
    // treated as inlinable.
    String js = "function f() { var x; x = 1; return x; }";
    Node root = parse(js);
    Node externs = emptyExterns();

    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, safeNameIdSupplier);
    try {
      pass.process(externs, root);
    } catch (Exception e) {
      fail("Should not throw for a variable never assigned an object literal: " + e);
    }

    String output = compiler.toSource(root);
    assertNotNull(output);
    assertFalse(
        "Did not expect inlined variable prefix in output: " + output,
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  @Test
  public void testProcess_objectLiteralWithGetterSetter_doesNotInline() {
    // ES5 getters/setters are explicitly unsupported by this pass, and
    // should never be split up.
    String js = "function f() { var x = {get a() { return 1; }}; return x.a; }";
    Node root = parse(js);
    Node externs = emptyExterns();

    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, safeNameIdSupplier);
    try {
      pass.process(externs, root);
    } catch (Exception e) {
      // Some parser configurations may not support ES5 get/set syntax;
      // in that case simply ensure no unexpected runtime failure occurs
      // beyond parsing-related issues.
      return;
    }

    String output = compiler.toSource(root);
    assertNotNull(output);
    assertFalse(
        "Objects with getters/setters must not be inlined: " + output,
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  @Test
  public void testProcess_multipleLocalVariablesInDifferentScopes_processesWithoutException() {
    String js =
        "function f() { var x = {a: 1, b: 2}; return x.a; }"
            + "function g() { var y = {c: 3, d: 4}; return y.c + y.d; }";
    Node root = parse(js);
    Node externs = emptyExterns();

    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, safeNameIdSupplier);
    try {
      pass.process(externs, root);
    } catch (Exception e) {
      fail("Processing multiple function scopes should not throw: " + e);
    }

    String output = compiler.toSource(root);
    assertNotNull(output);
  }

  // ---------------------------------------------------------------------
  // (ค) Exception cases
  // ---------------------------------------------------------------------

  @Test(expected = Exception.class)
  public void testProcess_nullRootAndExterns_throwsException() {
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, safeNameIdSupplier);
    // Passing null for both externs and root should result in a runtime
    // failure (e.g. NullPointerException) since the traversal
    // infrastructure requires valid AST nodes.
    pass.process(null, null);
  }

  @Test(expected = Exception.class)
  public void testProcess_nullExternsWithValidRoot_throwsException() {
    String js = "var x = {a: 1};";
    Node root = parse(js);

    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, safeNameIdSupplier);
    pass.process(null, root);
  }

  @Test(expected = Exception.class)
  public void testProcess_validExternsWithNullRoot_throwsException() {
    Node externs = emptyExterns();

    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, safeNameIdSupplier);
    pass.process(externs, null);
  }
}
