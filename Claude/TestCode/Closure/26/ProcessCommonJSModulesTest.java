package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.File;

public class ProcessCommonJSModulesTest {

    private ProcessCommonJSModules module;

    @Before
    public void setUp() {
        // compiler is not used by guessCJSModuleName/getModule/toModuleName,
        // so passing null is safe for these tests since AbstractCompiler
        // dependency is not available for real instantiation here.
        module = new ProcessCommonJSModules(null, "prefix");
    }

    // ---------- Tests for static toModuleName(String) ----------

    @Test
    public void testToModuleName_singleArg_normalFilename_returnsPrefixedName() {
        String result = ProcessCommonJSModules.toModuleName("foo/bar.js");
        assertEquals("module$foo$bar", result);
    }

    @Test
    public void testToModuleName_singleArg_withDashes_replacesWithUnderscore() {
        String result = ProcessCommonJSModules.toModuleName("foo-bar.js");
        assertEquals("module$foo_bar", result);
    }

    @Test
    public void testToModuleName_singleArg_withLeadingDotSlash_stripsPrefix() {
        String result = ProcessCommonJSModules.toModuleName("./foo.js");
        assertEquals("module$foo", result);
    }

    @Test
    public void testToModuleName_singleArg_emptyString_returnsPrefixOnly() {
        String result = ProcessCommonJSModules.toModuleName("");
        assertEquals("module$", result);
    }

    @Test(expected = NullPointerException.class)
    public void testToModuleName_singleArg_nullInput_throwsNullPointerException() {
        ProcessCommonJSModules.toModuleName(null);
    }

    @Test
    public void testToModuleName_singleArg_noExtension_returnsUnchangedNameWithPrefix() {
        String result = ProcessCommonJSModules.toModuleName("foo/bar");
        assertEquals("module$foo$bar", result);
    }

    // ---------- Tests for static toModuleName(String, String) ----------

    @Test
    public void testToModuleName_twoArgs_nonRelativePath_returnsSimpleModuleName() {
        String result = ProcessCommonJSModules.toModuleName("foo.js", "bar.js");
        assertEquals("module$foo", result);
    }

    @Test
    public void testToModuleName_twoArgs_relativeDotSlash_resolvesAgainstCurrent() {
        String result = ProcessCommonJSModules.toModuleName("./foo.js", "dir/bar.js");
        assertEquals("module$dir$foo", result);
    }

    @Test
    public void testToModuleName_twoArgs_relativeDotDotSlash_resolvesUpOneLevel() {
        String result = ProcessCommonJSModules.toModuleName("../foo.js", "dir/sub/bar.js");
        assertEquals("module$dir$foo", result);
    }

    @Test
    public void testToModuleName_twoArgs_emptyStrings_returnsPrefixOnly() {
        String result = ProcessCommonJSModules.toModuleName("", "");
        assertEquals("module$", result);
    }

    @Test(expected = NullPointerException.class)
    public void testToModuleName_twoArgs_nullRequiredFilename_throwsNullPointerException() {
        ProcessCommonJSModules.toModuleName(null, "bar.js");
    }

    @Test(expected = NullPointerException.class)
    public void testToModuleName_twoArgs_nullCurrentFilename_throwsNullPointerException() {
        ProcessCommonJSModules.toModuleName("./foo.js", null);
    }

    // ---------- Tests for guessCJSModuleName ----------

    @Test
    public void testGuessCJSModuleName_normalFilenameWithoutPrefix_returnsModuleName() {
        String result = module.guessCJSModuleName("somefile.js");
        assertEquals("module$somefile", result);
    }

    @Test
    public void testGuessCJSModuleName_filenameWithPrefix_stripsPrefixBeforeConverting() {
        // filenamePrefix passed to constructor was "prefix" -> becomes
        // "prefix" + File.separator internally.
        String fullPath = "prefix" + File.separator + "somefile.js";
        String result = module.guessCJSModuleName(fullPath);
        assertEquals("module$somefile", result);
    }

    @Test
    public void testGuessCJSModuleName_emptyFilename_returnsPrefixOnly() {
        String result = module.guessCJSModuleName("");
        assertEquals("module$", result);
    }

    @Test(expected = NullPointerException.class)
    public void testGuessCJSModuleName_nullFilename_throwsNullPointerException() {
        module.guessCJSModuleName(null);
    }

    // ---------- Tests for getModule ----------

    @Test
    public void testGetModule_beforeProcessing_returnsNull() {
        assertNull(module.getModule());
    }

    // ---------- Tests for constructors ----------

    @Test
    public void testConstructor_filenamePrefixWithoutTrailingSeparator_appendsSeparator() {
        ProcessCommonJSModules m = new ProcessCommonJSModules(null, "myprefix");
        // Indirectly verify via guessCJSModuleName that the separator was appended
        String fullPath = "myprefix" + File.separator + "file.js";
        String result = m.guessCJSModuleName(fullPath);
        assertEquals("module$file", result);
    }

    @Test
    public void testConstructor_filenamePrefixWithTrailingSeparator_doesNotDuplicateSeparator() {
        String prefixWithSeparator = "myprefix" + File.separator;
        ProcessCommonJSModules m = new ProcessCommonJSModules(null, prefixWithSeparator);
        String fullPath = "myprefix" + File.separator + "file.js";
        String result = m.guessCJSModuleName(fullPath);
        assertEquals("module$file", result);
    }

    @Test
    public void testConstructor_threeArgWithReportDependenciesFalse_createsInstance() {
        ProcessCommonJSModules m = new ProcessCommonJSModules(null, "prefix", false);
        assertNotNull(m);
        assertNull(m.getModule());
    }

    @Test
    public void testConstructor_threeArgWithReportDependenciesTrue_createsInstance() {
        ProcessCommonJSModules m = new ProcessCommonJSModules(null, "prefix", true);
        assertNotNull(m);
        assertNull(m.getModule());
    }

    // ---------- Tests for process (public API, requires CompilerPass contract) ----------

    @Test(expected = NullPointerException.class)
    public void testProcess_withNullCompilerAndNullRoot_throwsNullPointerException() {
        // Since AbstractCompiler dependency cannot be constructed without
        // mocking framework or full implementation, we verify that calling
        // process() with a null compiler results in a NullPointerException
        // originating from NodeTraversal.traverse's internal null checks.
        module.process(null, null);
    }

    // ---------- Additional edge-case tests for DEFAULT_FILENAME_PREFIX ----------

    @Test
    public void testDefaultFilenamePrefix_matchesExpectedValue() {
        String expected = "." + File.separator;
        assertEquals(expected, ProcessCommonJSModules.DEFAULT_FILENAME_PREFIX);
    }
}
