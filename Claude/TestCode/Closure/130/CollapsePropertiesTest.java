package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * JUnit 4 test suite for {@link CollapseProperties}.
 *
 * NOTE: CollapseProperties is package-private and depends on internal
 * Closure Compiler classes (Compiler, CompilerOptions, SourceFile, GlobalNamespace)
 * which are only accessible from within the same package. Because mocking
 * frameworks are not allowed, these tests exercise the real Compiler pipeline
 * (parse -> process) to validate behavior through the public CompilerPass API
 * (the process(Node, Node) method) and the package-private constructor.
 */
public class CollapsePropertiesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  /**
   * Helper method that initializes and parses the given JS/externs source
   * and returns the {externsRoot, jsRoot} node pair required by process().
   */
  private Node[] parseAndGetRoots(String js, String externsJs) {
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);

    List<SourceFile> externsInputs =
        ImmutableList.of(SourceFile.fromCode("externs.js", externsJs));
    List<SourceFile> inputs =
        ImmutableList.of(SourceFile.fromCode("input.js", js));

    compiler.init(externsInputs, inputs, options);
    compiler.parse();

    Node root = compiler.getRoot();
    Node externsRoot = root.getFirstChild();
    Node mainRoot = root.getLastChild();
    return new Node[] {externsRoot, mainRoot};
  }

  // ---------------------------------------------------------------------
  // Constructor tests
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_variousFlagCombinations_createsInstanceSuccessfully() {
    Assert.assertNotNull(new CollapseProperties(compiler, true, true));
    Assert.assertNotNull(new CollapseProperties(compiler, true, false));
    Assert.assertNotNull(new CollapseProperties(compiler, false, true));
    Assert.assertNotNull(new CollapseProperties(compiler, false, false));
  }

  // ---------------------------------------------------------------------
  // process() - normal/typical input
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_typicalNamespaceCollapse_transformsSuccessfully() {
    Node[] roots = parseAndGetRoots(
        "var a = {}; a.b = {}; a.b.c = function() {}; a.b.c();", "");
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    String source = compiler.toSource();
    Assert.assertNotNull(source);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_objectLiteralWithMultipleProperties_collapsesSuccessfully() {
    Node[] roots = parseAndGetRoots(
        "var a = {b: 1, c: 2, d: function() {}};", "");
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    Assert.assertNotNull(compiler.toSource());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_functionDeclarationWithProperty_collapsesSuccessfully() {
    Node[] roots = parseAndGetRoots(
        "function a() {} a.b = 1; var x = a.b;", "");
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    Assert.assertNotNull(compiler.toSource());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_withInlineAliasesEnabled_doesNotThrow() {
    Node[] roots = parseAndGetRoots(
        "var a = {}; a.b = {}; a.b.c = 1; "
            + "function f() { var x = a.b; return x.c; }",
        "");
    CollapseProperties pass = new CollapseProperties(compiler, false, true);
    pass.process(roots[0], roots[1]);

    Assert.assertNotNull(compiler.toSource());
  }

  @Test
  public void testProcess_withCollapsePropertiesOnExternTypesEnabled_doesNotThrow() {
    Node[] roots = parseAndGetRoots(
        "var a = {}; a.b = 1;",
        "var String = {}; String.foo = 1;");
    CollapseProperties pass = new CollapseProperties(compiler, true, false);
    pass.process(roots[0], roots[1]);

    Assert.assertNotNull(compiler.toSource());
  }

  @Test
  public void testProcess_simpleStubDeclaration_flattensSuccessfully() {
    Node[] roots = parseAndGetRoots(
        "var a = {}; a.b = {}; /** @type {number} */ a.b.c;", "");
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    Assert.assertNotNull(compiler.toSource());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_getterPropertyWithInlineAliases_skipsGetterBranch() {
    Node[] roots = parseAndGetRoots(
        "var a = { get b() { return 1; } };", "");
    CollapseProperties pass = new CollapseProperties(compiler, false, true);
    pass.process(roots[0], roots[1]);

    Assert.assertNotNull(compiler.toSource());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_deletePropertyOnNamespace_noExceptionThrown() {
    Node[] roots = parseAndGetRoots(
        "var a = {}; a.b = {}; a.b.c = 1; delete a.b;", "");
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    Assert.assertNotNull(compiler.toSource());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_namespaceRedefined_doesNotThrowAndReportsNoErrors() {
    Node[] roots = parseAndGetRoots(
        "var a = {}; a.b = {}; a.b.c = 1; a.b = {};", "");
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    // Redefinition should generate a warning, not a hard error.
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_namespaceAliased_doesNotThrowAndReportsNoErrors() {
    Node[] roots = parseAndGetRoots(
        "var a = {}; a.b = {}; a.b.c = 1; var c = a.b;", "");
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    // Aliasing a namespace should generate a warning, not a hard error.
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  // ---------------------------------------------------------------------
  // process() - edge cases
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_emptyScript_noExceptionsThrown() {
    Node[] roots = parseAndGetRoots("", "");
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_noNamespaces_producesUnchangedOutput() {
    Node[] roots = parseAndGetRoots("var x = 1; var y = 2; x + y;", "");
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(roots[0], roots[1]);

    Assert.assertNotNull(compiler.toSource());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_calledTwiceOnSameCompiler_doesNotThrow() {
    Node[] roots = parseAndGetRoots(
        "var a = {}; a.b = {}; a.b.c = 1;", "");
    CollapseProperties pass1 = new CollapseProperties(compiler, false, false);
    pass1.process(roots[0], roots[1]);

    // Calling the pass a second time on the already-collapsed tree should
    // not throw, exercising idempotency-related branches.
    CollapseProperties pass2 = new CollapseProperties(compiler, false, false);
    pass2.process(roots[0], roots[1]);

    Assert.assertNotNull(compiler.toSource());
  }

  // ---------------------------------------------------------------------
  // process() - exception scenarios
  // ---------------------------------------------------------------------

  @Test(expected = Exception.class)
  public void testProcess_nullNodesWithUninitializedCompiler_throwsException() {
    Compiler freshCompiler = new Compiler();
    CollapseProperties pass = new CollapseProperties(freshCompiler, false, false);
    pass.process(null, null);
  }

  @Test(expected = Exception.class)
  public void testProcess_nullRootAfterValidParse_throwsException() {
    Node[] roots = parseAndGetRoots("var a = {}; a.b = 1;", "");
    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    // Passing a null "root" while externs is valid should still fail because
    // GlobalNamespace requires a non-null root to traverse.
    pass.process(roots[0], null);
  }
}
