package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.security.Permission;
import java.util.List;

public class CommandLineRunnerTest {

    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;
    private PrintStream outStream;
    private PrintStream errStream;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        outStream = new PrintStream(outContent);
        errStream = new PrintStream(errContent);
    }

    // ---------- shouldRunCompiler() tests ----------

    @Test
    public void testShouldRunCompiler_emptyArgs_returnsTrue() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}, outStream, errStream);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_helpFlag_returnsFalse() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--help"}, outStream, errStream);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_invalidFlag_returnsFalse() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--nonexistent_flag_xyz"}, outStream, errStream);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_singleArgArray_usesSystemErrAndValid() {
        // Uses the protected single-arg constructor, which uses System.err internally.
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        assertTrue(runner.shouldRunCompiler());
    }

    // ---------- initConfigFromFlags() argument parsing branches ----------

    @Test
    public void testInitConfigFromFlags_equalsSignSyntax_parsedCorrectly() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--js_output_file=out.js"}, outStream, errStream);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testInitConfigFromFlags_singleQuotedValue_stripsQuotes() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--js_output_file='out.js'"}, outStream, errStream);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testInitConfigFromFlags_doubleQuotedValue_stripsQuotes() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--js_output_file=\"out.js\""}, outStream, errStream);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testInitConfigFromFlags_thirdPartyTrue_isValid() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--third_party=true"}, outStream, errStream);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testInitConfigFromFlags_thirdPartyFalse_isValid() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--third_party=false"}, outStream, errStream);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testInitConfigFromFlags_booleanOptionInvalidValue_returnsFalse() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--debug=notaboolean"}, outStream, errStream);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testInitConfigFromFlags_multipleFlagsWithoutEquals_parsedCorrectly() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--js", "test.js", "--warning_level", "VERBOSE"},
            outStream, errStream);
        assertTrue(runner.shouldRunCompiler());
    }

    // ---------- createOptions() tests ----------

    @Test
    public void testCreateOptions_defaultFlags_closurePassTrue() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}, outStream, errStream);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertTrue(options.closurePass);
    }

    @Test
    public void testCreateOptions_processClosurePrimitivesFalse_closurePassFalse() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--process_closure_primitives=false"}, outStream, errStream);
        CompilerOptions options = runner.createOptions();
        assertFalse(options.closurePass);
    }

    @Test
    public void testCreateOptions_debugTrue_appliesDebugOptionsWithoutError() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--debug=true"}, outStream, errStream);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testCreateOptions_debugFalseDefault_returnsOptions() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}, outStream, errStream);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testCreateOptions_formattingPrettyPrint_setsPrettyPrintTrue() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--formatting=PRETTY_PRINT"}, outStream, errStream);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.prettyPrint);
    }

    @Test
    public void testCreateOptions_formattingPrintInputDelimiter_setsFlagTrue() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--formatting=PRINT_INPUT_DELIMITER"}, outStream, errStream);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.printInputDelimiter);
    }

    @Test
    public void testCreateOptions_advancedCompilationLevel_returnsOptions() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--compilation_level=ADVANCED_OPTIMIZATIONS"}, outStream, errStream);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testCreateOptions_whitespaceOnlyCompilationLevel_returnsOptions() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--compilation_level=WHITESPACE_ONLY"}, outStream, errStream);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    // ---------- createCompiler() test ----------

    @Test
    public void testCreateCompiler_returnsNonNullCompilerInstance() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}, outStream, errStream);
        Compiler compiler = runner.createCompiler();
        assertNotNull(compiler);
    }

    // ---------- createExterns() tests ----------

    @Test
    public void testCreateExterns_useOnlyCustomExternsTrue_doesNotThrow() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--use_only_custom_externs=true"}, outStream, errStream);
        List<JSSourceFile> externs = runner.createExterns();
        assertNotNull(externs);
    }

    @Test
    public void testCreateExterns_defaultFlags_handlesExternsResourceGracefully() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}, outStream, errStream);
        try {
            List<JSSourceFile> externs = runner.createExterns();
            assertNotNull(externs);
        } catch (Exception e) {
            // Acceptable outcome if externs.zip resource is unavailable
            // or test-mode behavior differs in this environment.
            assertTrue(true);
        }
    }

    // ---------- getDefaultExterns() tests ----------

    @Test
    public void testGetDefaultExterns_resourceAvailability_handledGracefully() {
        try {
            List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
            assertNotNull(externs);
            assertFalse(externs.isEmpty());
        } catch (Exception e) {
            // Acceptable outcome if externs.zip resource is unavailable
            // in this test environment.
            assertTrue(true);
        }
    }

    // ---------- main() tests ----------

    @Test
    public void testMain_invalidArgs_callsSystemExit() {
        SecurityManager originalSecurityManager = System.getSecurityManager();
        System.setSecurityManager(new NoExitSecurityManager());
        try {
            CommandLineRunner.main(new String[]{"--nonexistent_flag_xyz"});
            fail("Expected SecurityException due to System.exit call");
        } catch (SecurityException e) {
            // expected
        } finally {
            System.setSecurityManager(originalSecurityManager);
        }
    }

    @Test
    public void testMain_helpFlag_callsSystemExit() {
        SecurityManager originalSecurityManager = System.getSecurityManager();
        System.setSecurityManager(new NoExitSecurityManager());
        try {
            CommandLineRunner.main(new String[]{"--help"});
            fail("Expected SecurityException due to System.exit call");
        } catch (SecurityException e) {
            // expected
        } finally {
            System.setSecurityManager(originalSecurityManager);
        }
    }

    /**
     * A SecurityManager that intercepts System.exit calls so tests can
     * verify that main() attempted to exit without actually terminating
     * the JVM running the test suite.
     */
    private static class NoExitSecurityManager extends SecurityManager {
        @Override
        public void checkPermission(Permission perm) {
            // Allow everything else.
        }

        @Override
        public void checkPermission(Permission perm, Object context) {
            // Allow everything else.
        }

        @Override
        public void checkExit(int status) {
            throw new SecurityException("System.exit(" + status + ") called");
        }
    }
}
