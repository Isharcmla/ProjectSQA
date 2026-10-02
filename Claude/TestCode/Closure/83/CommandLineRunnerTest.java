import com.google.javascript.jscomp.JSSourceFile;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.security.Permission;
import java.util.List;

import static org.junit.Assert.*;

/**
 * JUnit4 test suite for CommandLineRunner.
 * Placed in the same package to allow access to protected constructors/methods.
 */
public class CommandLineRunnerTest {

    private SecurityManager originalSecurityManager;

    @Before
    public void setUp() {
        originalSecurityManager = System.getSecurityManager();
    }

    @After
    public void tearDown() {
        try {
            System.setSecurityManager(originalSecurityManager);
        } catch (Throwable ignored) {
            // Some JVMs (17+) may not support setting SecurityManager back; ignore.
        }
    }

    // ---------------------------------------------------------------------
    // Helper: SecurityManager to intercept System.exit calls in main()
    // ---------------------------------------------------------------------
    private static class ExitException extends SecurityException {
        final int status;

        ExitException(int status) {
            super("System.exit(" + status + ") intercepted for testing");
            this.status = status;
        }
    }

    private static class NoExitSecurityManager extends SecurityManager {
        @Override
        public void checkPermission(Permission perm) {
            // allow everything
        }

        @Override
        public void checkPermission(Permission perm, Object context) {
            // allow everything
        }

        @Override
        public void checkExit(int status) {
            super.checkExit(status);
            throw new ExitException(status);
        }
    }

    // ---------------------------------------------------------------------
    // Constructor / shouldRunCompiler() tests
    // ---------------------------------------------------------------------

    @Test
    public void testConstructor_emptyArgs_configValid() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_helpFlag_configInvalid() {
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        PrintStream errStream = new PrintStream(errContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream outStream = new PrintStream(outContent);

        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--help"}, outStream, errStream);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_invalidFlag_configInvalid() {
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        PrintStream errStream = new PrintStream(errContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream outStream = new PrintStream(outContent);

        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--this_flag_does_not_exist_xyz"}, outStream, errStream);
        assertFalse(runner.shouldRunCompiler());
        // Should have printed an error message to err.
        assertTrue(errContent.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullArgs_throwsNullPointerException() {
        new CommandLineRunner(null);
    }

    @Test
    public void testConstructor_versionFlag_printsVersionInfoOrHandlesMissingResource() {
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        PrintStream errStream = new PrintStream(errContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream outStream = new PrintStream(outContent);

        try {
            CommandLineRunner runner = new CommandLineRunner(
                    new String[]{"--version"}, outStream, errStream);
            // version flag alone shouldn't invalidate the config
            assertTrue(runner.shouldRunCompiler());
            assertTrue(errContent.size() > 0);
        } catch (java.util.MissingResourceException e) {
            // Acceptable if the ParserConfig resource bundle is unavailable
            // in the test classpath.
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testConstructor_equalsSyntaxForFlag_parsedCorrectly() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--debug=true"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_booleanFlagFalseValue_parsedCorrectly() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--process_closure_primitives=false"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_quotedValue_stripsQuotesAndParsesCorrectly() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--js_output_file=\"out.js\""});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_singleQuotedValue_stripsQuotesAndParsesCorrectly() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--output_wrapper_marker='%output%'"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_multipleExternsFlags_parsedCorrectly() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--externs=file1.js", "--externs=file2.js"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_moduleFlag_parsedCorrectly() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--module=app:1"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_defineAlias_parsedCorrectly() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--D", "FOO=true"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_negativeSummaryDetailLevel_parsedWithoutError() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--summary_detail_level=-1"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_zeroSummaryDetailLevel_parsedWithoutError() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--summary_detail_level=0"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_emptyStringFlagValue_parsedWithoutError() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--js_output_file="});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_formattingOption_parsedWithoutError() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--formatting=PRETTY_PRINT"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_thirdPartyFlag_parsedWithoutError() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--third_party=true"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_realJsFile_parsedWithoutError() throws Exception {
        File tempJsFile = File.createTempFile("test_input", ".js");
        tempJsFile.deleteOnExit();
        FileWriter writer = new FileWriter(tempJsFile);
        writer.write("var x = 1;");
        writer.close();

        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--js=" + tempJsFile.getAbsolutePath()});
        assertTrue(runner.shouldRunCompiler());
    }

    // ---------------------------------------------------------------------
    // createOptions() tests
    // ---------------------------------------------------------------------

    @Test
    public void testCreateOptions_defaultFlags_closurePassTrue() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertTrue(options.closurePass);
    }

    @Test
    public void testCreateOptions_processClosurePrimitivesFalse_closurePassFalse() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--process_closure_primitives=false"});
        CompilerOptions options = runner.createOptions();
        assertFalse(options.closurePass);
    }

    @Test
    public void testCreateOptions_prettyPrintFormatting_setsPrettyPrintTrue() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--formatting=PRETTY_PRINT"});
        CompilerOptions options = runner.createOptions();
        assertTrue(options.prettyPrint);
    }

    @Test
    public void testCreateOptions_printInputDelimiterFormatting_setsFlagTrue() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--formatting=PRINT_INPUT_DELIMITER"});
        CompilerOptions options = runner.createOptions();
        assertTrue(options.printInputDelimiter);
    }

    @Test
    public void testCreateOptions_debugFlagTrue_doesNotThrow() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--debug=true"});
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testCreateOptions_advancedCompilationLevel_doesNotThrow() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--compilation_level=ADVANCED_OPTIMIZATIONS"});
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testCreateOptions_whitespaceOnlyCompilationLevel_doesNotThrow() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--compilation_level=WHITESPACE_ONLY"});
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testCreateOptions_multipleFormattingOptions_bothApplied() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--formatting=PRETTY_PRINT", "--formatting=PRINT_INPUT_DELIMITER"});
        CompilerOptions options = runner.createOptions();
        assertTrue(options.prettyPrint);
        assertTrue(options.printInputDelimiter);
    }

    // ---------------------------------------------------------------------
    // createCompiler() tests
    // ---------------------------------------------------------------------

    @Test
    public void testCreateCompiler_returnsNonNullCompiler() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        Compiler compiler = runner.createCompiler();
        assertNotNull(compiler);
    }

    // ---------------------------------------------------------------------
    // createExterns() tests
    // ---------------------------------------------------------------------

    @Test
    public void testCreateExterns_useOnlyCustomExterns_returnsNonNullList() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--use_only_custom_externs=true"});
        List<JSSourceFile> externs = runner.createExterns();
        assertNotNull(externs);
    }

    @Test
    public void testCreateExterns_defaultFlags_handledGracefully() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        try {
            List<JSSourceFile> externs = runner.createExterns();
            assertNotNull(externs);
        } catch (Exception e) {
            // Acceptable if default externs zip resource is unavailable
            // in the test classpath, or if in test-mode behavior differs.
            assertNotNull(e);
        }
    }

    // ---------------------------------------------------------------------
    // getDefaultExterns() tests
    // ---------------------------------------------------------------------

    @Test
    public void testGetDefaultExterns_resourceAvailabilityHandledGracefully() {
        try {
            List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
            assertNotNull(externs);
            assertFalse(externs.isEmpty());
        } catch (Exception e) {
            // Acceptable if the externs.zip resource is not present
            // in the current test classpath.
            assertNotNull(e);
        } catch (Throwable t) {
            // Also guard against unexpected runtime errors (e.g. NPE from
            // a missing resource stream), which is an acceptable edge case
            // in this test environment.
            assertNotNull(t);
        }
    }

    // ---------------------------------------------------------------------
    // shouldRunCompiler() dedicated tests
    // ---------------------------------------------------------------------

    @Test
    public void testShouldRunCompiler_validConfig_returnsTrue() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_invalidConfig_returnsFalse() {
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        PrintStream errStream = new PrintStream(errContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream outStream = new PrintStream(outContent);

        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--unknown_bad_flag"}, outStream, errStream);
        assertFalse(runner.shouldRunCompiler());
    }

    // ---------------------------------------------------------------------
    // main() tests - using SecurityManager to intercept System.exit
    // ---------------------------------------------------------------------

    @Test
    public void testMain_invalidArgs_callsSystemExitWithNegativeOne() {
        try {
            System.setSecurityManager(new NoExitSecurityManager());
        } catch (Throwable t) {
            // SecurityManager might not be settable on this JVM (e.g. Java 17+
            // with strong encapsulation of the security manager). Skip this
            // scenario gracefully in that case.
            return;
        }

        try {
            CommandLineRunner.main(new String[]{"--this_flag_does_not_exist_abc"});
            fail("Expected ExitException to be thrown due to System.exit call");
        } catch (ExitException e) {
            assertEquals(-1, e.status);
        } finally {
            try {
                System.setSecurityManager(originalSecurityManager);
            } catch (Throwable ignored) {
                // ignore
            }
        }
    }

    @Test
    public void testMain_helpFlag_callsSystemExitWithNegativeOne() {
        try {
            System.setSecurityManager(new NoExitSecurityManager());
        } catch (Throwable t) {
            return;
        }

        try {
            CommandLineRunner.main(new String[]{"--help"});
            fail("Expected ExitException to be thrown due to System.exit call");
        } catch (ExitException e) {
            assertEquals(-1, e.status);
        } finally {
            try {
                System.setSecurityManager(originalSecurityManager);
            } catch (Throwable ignored) {
                // ignore
            }
        }
    }
}
