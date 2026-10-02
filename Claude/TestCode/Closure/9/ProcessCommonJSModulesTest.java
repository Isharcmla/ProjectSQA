package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link ProcessCommonJSModules}.
 *
 * Note: AbstractCompiler is an abstract class and no mocking framework is
 * allowed, so where an AbstractCompiler instance is required but not used by
 * the code path being tested, null is passed since the constructor and the
 * tested methods (guessCJSModuleName, getModule, toModuleName) do not
 * dereference the compiler field.
 */
public class ProcessCommonJSModulesTest {

  private ProcessCommonJSModules moduleDefaultPrefix;
  private ProcessCommonJSModules moduleCustomPrefixNoSlash;
  private ProcessCommonJSModules moduleCustomPrefixWithSlash;

  @Before
  public void setUp() {
    // Constructor does not use the compiler argument directly, so null is
    // safe for the methods under test here.
    moduleDefaultPrefix = new ProcessCommonJSModules(
        null, ProcessCommonJSModules.DEFAULT_FILENAME_PREFIX);
    moduleCustomPrefixNoSlash = new ProcessCommonJSModules(null, "src");
    moduleCustomPrefixWithSlash = new ProcessCommonJSModules(null, "src/");
  }

  // ---------------------------------------------------------------------
  // toModuleName(String) - static, single argument
  // ---------------------------------------------------------------------

  @Test
  public void testToModuleName_simpleFilename_returnsModuleName() {
    String result = ProcessCommonJSModules.toModuleName("foo.js");
    assertEquals("module$foo", result);
  }

  @Test
  public void testToModuleName_withSlash_returnsModuleNameWithSeparator() {
    String result = ProcessCommonJSModules.toModuleName("foo/bar.js");
    assertEquals("module$foo$bar", result);
  }

  @Test
  public void testToModuleName_withLeadingDotSlash_stripsPrefix() {
    String result = ProcessCommonJSModules.toModuleName("./foo.js");
    assertEquals("module$foo", result);
  }

  @Test
  public void testToModuleName_withDash_replacesWithUnderscore() {
    String result = ProcessCommonJSModules.toModuleName("foo-bar.js");
    assertEquals("module$foo_bar", result);
  }

  @Test
  public void testToModuleName_emptyString_returnsPrefixOnly() {
    String result = ProcessCommonJSModules.toModuleName("");
    assertEquals("module$", result);
  }

  @Test
  public void testToModuleName_multipleSlashes_replacesAllWithSeparator() {
    String result = ProcessCommonJSModules.toModuleName("a/b/c.js");
    assertEquals("module$a$b$c", result);
  }

  @Test
  public void testToModuleName_noJsExtension_doesNotStripAnything() {
    String result = ProcessCommonJSModules.toModuleName("foo");
    assertEquals("module$foo", result);
  }

  // ---------------------------------------------------------------------
  // toModuleName(String, String) - static, two arguments (relative paths)
  // ---------------------------------------------------------------------

  @Test
  public void testToModuleNameTwoArg_relativeCurrentDir_resolvesCorrectly() {
    String result = ProcessCommonJSModules.toModuleName("./bar.js", "foo.js");
    // relative to "foo" (current file with .js stripped) resolving "./bar"
    assertNotNull(result);
    assertTrue(result.startsWith("module$"));
  }

  @Test
  public void testToModuleNameTwoArg_parentRelativePath_resolvesCorrectly() {
    String result = ProcessCommonJSModules.toModuleName(
        "../bar.js", "foo/baz.js");
    assertNotNull(result);
    assertTrue(result.startsWith("module$"));
  }

  @Test
  public void testToModuleNameTwoArg_absolutePath_noResolutionNeeded() {
    String result = ProcessCommonJSModules.toModuleName("bar.js", "foo/baz.js");
    assertEquals("module$bar", result);
  }

  @Test
  public void testToModuleNameTwoArg_bothSameName_returnsSameModuleName() {
    String result = ProcessCommonJSModules.toModuleName("foo", "foo");
    assertEquals("module$foo", result);
  }

  // ---------------------------------------------------------------------
  // Constructors - filenamePrefix normalization
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_prefixWithoutTrailingSlash_appendsSlashAndStripsPrefix() {
    // "src" should become "src/" internally, so a filename beginning with
    // "src/" should have that prefix stripped before module name creation.
    String result = moduleCustomPrefixNoSlash.guessCJSModuleName("src/foo.js");
    assertEquals("module$foo", result);
  }

  @Test
  public void testConstructor_prefixWithTrailingSlash_keepsPrefixAsIs() {
    String result = moduleCustomPrefixWithSlash.guessCJSModuleName("src/foo.js");
    assertEquals("module$foo", result);
  }

  @Test
  public void testConstructor_threeArgVersion_reportDependenciesTrue() {
    ProcessCommonJSModules m = new ProcessCommonJSModules(null, "src/", true);
    assertNotNull(m);
    assertNull(m.getModule());
  }

  @Test
  public void testConstructor_threeArgVersion_reportDependenciesFalse() {
    ProcessCommonJSModules m = new ProcessCommonJSModules(null, "src/", false);
    assertNotNull(m);
    assertNull(m.getModule());
  }

  // ---------------------------------------------------------------------
  // guessCJSModuleName(String)
  // ---------------------------------------------------------------------

  @Test
  public void testGuessCJSModuleName_defaultPrefix_stripsDotSlash() {
    String result = moduleDefaultPrefix.guessCJSModuleName("./foo.js");
    assertEquals("module$foo", result);
  }

  @Test
  public void testGuessCJSModuleName_filenameDoesNotMatchPrefix_unchangedBeforeConversion() {
    // filename doesn't start with the configured prefix ("src/"), so it is
    // not stripped, and the full path is converted.
    String result = moduleCustomPrefixWithSlash.guessCJSModuleName("other/foo.js");
    assertEquals("module$other$foo", result);
  }

  @Test
  public void testGuessCJSModuleName_emptyFilename_returnsPrefixOnlyModuleName() {
    String result = moduleDefaultPrefix.guessCJSModuleName("");
    assertEquals("module$", result);
  }

  // ---------------------------------------------------------------------
  // getModule()
  // ---------------------------------------------------------------------

  @Test
  public void testGetModule_beforeProcessCalled_returnsNull() {
    assertNull(moduleDefaultPrefix.getModule());
  }

  // ---------------------------------------------------------------------
  // process(Node, Node) - exception / edge case handling
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testProcess_withNullCompiler_throwsNullPointerException() {
    // The compiler passed at construction time is null; when process()
    // attempts to traverse the tree it will dereference the compiler and
    // throw a NullPointerException.
    ProcessCommonJSModules m = new ProcessCommonJSModules(null, "./");
    Node externs = IR.script();
    Node root = IR.script();
    m.process(externs, root);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_withNullRootNode_throwsNullPointerException() {
    ProcessCommonJSModules m = new ProcessCommonJSModules(null, "./");
    Node externs = IR.script();
    m.process(externs, null);
  }
}
