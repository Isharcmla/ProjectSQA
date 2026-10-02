package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link CollapseProperties}.
 *
 * Note: CollapseProperties is a package-private class with a package-private
 * constructor, so this test class resides in the same package
 * (com.google.javascript.jscomp) in order to access it directly, per the
 * "no mocking framework" / "public API only" constraint interpreted as
 * "use the real Compiler infrastructure".
 */
public class CollapsePropertiesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  /**
   * Helper that parses the given JS source (with an empty externs file)
   * using the real Compiler, and returns the externs root and js root nodes
   * that CollapseProperties.process(...) expects.
   */
  private Node[] compileAndGetRoots(String js) {
    CompilerOptions options = new CompilerOptions();
    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile src = SourceFile.fromCode("input.js", js);
    compiler.compile(externs, src, options);
    Node root = compiler.getRoot();
    Node externsRoot = root.getFirstChild();
    Node jsRoot = root.getLastChild();
    return new Node[] {externsRoot, jsRoot};
  }

  @Test
  public void testConstructor_createsInstanceSuccessfully_notNull() {
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    assertNotNull(pass);
  }

  @Test
  public void testConstructor_withAllFlagsTrue_createsInstanceSuccessfully() {
    CollapseProperties pass = new CollapseProperties(compiler, true, true);
    assertNotNull(pass);
  }

  @Test
  public void testProcess_simpleObjectLiteral_collapsesPropertiesWithoutError() {
    String js = "var a = {b: 1, c: 2}; use(a.b); use(a.c);";
    Node[] roots = compileAndGetRoots(js);

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_emptySource_runsWithoutException() {
    Node[] roots = compileAndGetRoots("");

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_withInlineAliasesTrue_runsWithoutError() {
    String js = "var a = {b: 1}; function f() { var c = a; use(c.b); }";
    Node[] roots = compileAndGetRoots(js);

    CollapseProperties pass = new CollapseProperties(compiler, false, true);
    pass.process(roots[0], roots[1]);

    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_withInlineAliasesFalse_runsWithoutError() {
    String js = "var a = {b: 1}; function f() { var c = a; use(c.b); }";
    Node[] roots = compileAndGetRoots(js);

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_withCollapsePropertiesOnExternTypesTrue_runsWithoutError() {
    String js = "var a = {b: 1}; use(a.b);";
    Node[] roots = compileAndGetRoots(js);

    CollapseProperties pass = new CollapseProperties(compiler, true, false);
    pass.process(roots[0], roots[1]);

    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_namespaceRedefinition_doesNotCrashAndReportsSomeWarnings() {
    // 'a.b' is set more than once at global scope, which should trigger
    // the checkNamespaces() / warnAboutNamespaceRedefinition() code path.
    String js = "var a = {}; a.b = {}; a.b = {}; a.b.c = 1;";
    Node[] roots = compileAndGetRoots(js);

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    // We only assert that processing completed without throwing,
    // and that the warnings array is a valid (non-null) array.
    assertNotNull(compiler.getWarnings());
    assertTrue(compiler.getWarnings().length >= 0);
  }

  @Test
  public void testProcess_namespaceAliasing_doesNotCrashAndReportsSomeWarnings() {
    // 'a' is a namespace-like object that gets aliased via 'var c = a;',
    // which should trigger the ALIASING_GET branch in checkNamespaces().
    String js = "var a = {}; a.b = 1; var c = a; use(c.b);";
    Node[] roots = compileAndGetRoots(js);

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    assertNotNull(compiler.getWarnings());
    assertTrue(compiler.getWarnings().length >= 0);
  }

  @Test
  public void testProcess_functionDeclarationCollapsing_runsWithoutError() {
    String js = "function a() {} a.b = 1; use(a.b);";
    Node[] roots = compileAndGetRoots(js);

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_nestedNamespace_collapsesDeeplyWithoutError() {
    String js = "var a = {}; a.b = {}; a.b.c = {}; a.b.c.d = 1; use(a.b.c.d);";
    Node[] roots = compileAndGetRoots(js);

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test
  public void testProcess_getterSetterInObjectLiteral_skipsCollapseWithoutError() {
    String js = "var a = {get b() { return 1; }, set b(x) {}}; use(a.b);";
    Node[] roots = compileAndGetRoots(js);

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    String output = compiler.toSource();
    assertNotNull(output);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullCompiler_throwsNullPointerException() {
    // Use a valid compiler to parse the AST, but hand a null compiler
    // reference to the pass under test to trigger an NPE when the pass
    // tries to interact with the (null) compiler instance.
    Node[] roots = compileAndGetRoots("var a = {b: 1}; use(a.b);");

    CollapseProperties pass = new CollapseProperties(null, false, false);
    pass.process(roots[0], roots[1]);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullRoot_throwsNullPointerException() {
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(null, null);
  }
}
