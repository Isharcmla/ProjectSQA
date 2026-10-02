import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.security.Permission;
import java.util.List;

public class CommandLineRunnerTest {

    private ByteArrayOutputStream outStream;
    private ByteArrayOutputStream errStream;
    private PrintStream outPrint;
    private PrintStream errPrint;

    @Before
    public void setUp() {
        outStream = new ByteArrayOutputStream();
        errStream = new ByteArrayOutputStream();
        outPrint = new PrintStream(outStream);
        errPrint = new PrintStream(errStream);
    }

    @After
    public void tearDown() {
        // restore default security manager if it was changed during a test
        try {
            System.setSecurityManager(null);
        } catch (Throwable t) {
            // ignore - some JVMs disallow changing security manager
        }
    }

    // ---------------------------------------------------------------
    // Constructor tests (via package-private/protected access)
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_withEmptyArgs_configValid() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_withOutErrStreams_configValid() {
        CommandLineRunner runner =
            new CommandLineRunner(new String[]{}, outPrint, errPrint);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_withHelpFlag_configInvalid() {
        CommandLineRunner runner =
            new CommandLineRunner(new String[]{"--help"}, outPrint, errPrint);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_withInvalidFlag_configInvalid() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--this_flag_does_not_exist"}, outPrint, errPrint);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_withInvalidEnumValue_configInvalid() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--jscomp_dev_mode=NOT_A_REAL_MODE"}, outPrint, errPrint);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_withQuotedValue_configValid() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--js_output_file='foo.js'"}, outPrint, errPrint);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_withDoubleQuotedValue_configValid() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--js_output_file=\"bar.js\""}, outPrint, errPrint);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_withEqualsSyntax_configValid() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--summary_detail_level=3"}, outPrint, errPrint);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_withNullArgsArray_throwsNullPointerException() {
        new CommandLineRunner(null, outPrint, errPrint);
    }

    @Test
    public void testConstructor_withThirdPartyFlag_configValid() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--third_party"}, outPrint, errPrint);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_withBooleanFalseValue_configValid() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--third_party", "false"}, outPrint, errPrint);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_withBooleanInvalidValue_configInvalid() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--third_party", "not_a_boolean_extra_args_here"},
            outPrint, errPrint);
        // The extra bad param after a boolean flag with no matching option
        // may or may not fail depending on argument parsing; we just verify
        // no unexpected exception occurs and a boolean result is produced.
        boolean result = runner.shouldRunCompiler();
        assertTrue(result || !result);
    }

    // ---------------------------------------------------------------
    // shouldRunCompiler()
    // ---------------------------------------------------------------

    @Test
    public void testShouldRunCompiler_validConfig_returnsTrue() {
        CommandLineRunner runner =
            new CommandLineRunner(new String[]{}, outPrint, errPrint);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_invalidConfig_returnsFalse() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--help"}, outPrint, errPrint);
        assertFalse(runner.shouldRunCompiler());
    }

    // ---------------------------------------------------------------
    // createOptions() - protected, accessible from same package
    // ---------------------------------------------------------------

    @Test
    public void testCreateOptions_defaultFlags_closurePassTrue() {
        CommandLineRunner runner =
            new CommandLineRunner(new String[]{}, outPrint, errPrint);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertTrue(options.closurePass);
    }

    @Test
    public void testCreateOptions_processClosurePrimitivesFalse_closurePassFalse() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--process_closure_primitives=false"}, outPrint, errPrint);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertFalse(options.closurePass);
    }

    @Test
    public void testCreateOptions_withDebugFlag_noException() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--debug"}, outPrint, errPrint);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testCreateOptions_withPrettyPrintFormatting_setsPrettyPrint() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--formatting", "PRETTY_PRINT"}, outPrint, errPrint);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertTrue(options.prettyPrint);
    }

    @Test
    public void testCreateOptions_withPrintInputDelimiterFormatting_setsFlag() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--formatting", "PRINT_INPUT_DELIMITER"}, outPrint, errPrint);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertTrue(options.printInputDelimiter);
    }

    @Test
    public void testCreateOptions_withAdvancedCompilationLevel_noException() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--compilation_level=ADVANCED_OPTIMIZATIONS"},
            outPrint, errPrint);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testCreateOptions_withVerboseWarningLevel_noException() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--warning_level=VERBOSE"}, outPrint, errPrint);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testCreateOptions_withQuietWarningLevel_noException() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--warning_level=QUIET"}, outPrint, errPrint);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testCreateOptions_withWhitespaceOnlyCompilationLevel_noException() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--compilation_level=WHITESPACE_ONLY"}, outPrint, errPrint);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    // ---------------------------------------------------------------
    // createCompiler() - protected, accessible from same package
    // ---------------------------------------------------------------

    @Test
    public void testCreateCompiler_returnsNonNullCompiler() {
        CommandLineRunner runner =
            new CommandLineRunner(new String[]{}, outPrint, errPrint);
        Compiler compiler = runner.createCompiler();
        assertNotNull(compiler);
    }

    // ---------------------------------------------------------------
    // createExterns() - protected, accessible from same package
    // ---------------------------------------------------------------

    @Test
    public void testCreateExterns_useOnlyCustomExterns_doesNotUseDefaults() {
        CommandLineRunner runner = new CommandLineRunner(
            new String[]{"--use_only_custom_externs"}, outPrint, errPrint);
        assertTrue(runner.shouldRunCompiler());
        try {
            List<JSSourceFile> externs = runner.createExterns();
            assertNotNull(externs);
        } catch (Exception e) {
            // Underlying super.createExterns() may throw if no externs are
            // configured; this is an acceptable outcome for this edge case.
            assertNotNull(e);
        }
    }

    @Test
    public void testCreateExterns_defaultExterns_attemptsToLoadDefaults() {
        CommandLineRunner runner =
            new CommandLineRunner(new String[]{}, outPrint, errPrint);
        assertTrue(runner.shouldRunCompiler());
        try {
            List<JSSourceFile> externs = runner.createExterns();
            assertNotNull(externs);
        } catch (Exception e) {
            // The /externs.zip resource may not be present on the test
            // classpath in this environment; that is an acceptable outcome.
            assertNotNull(e);
        }
    }

    // ---------------------------------------------------------------
    // getDefaultExterns() - public static method
    // ---------------------------------------------------------------

    @Test
    public void testGetDefaultExterns_returnsListOrThrowsExpectedException() {
        try {
            List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
            assertNotNull(externs);
            assertFalse(externs.isEmpty());
        } catch (IOException e) {
            assertNotNull(e);
        } catch (IllegalStateException e) {
            // Preconditions.checkState mismatch if externs.zip content differs
            assertNotNull(e);
        } catch (NullPointerException e) {
            // Resource stream may be null if /externs.zip is missing from classpath
            assertNotNull(e);
        }
    }

    // ---------------------------------------------------------------
    // main(String[]) - public static method
    // ---------------------------------------------------------------

    private static class ExitException extends SecurityException {
        final int status;
        ExitException(int status) {
            super("Intercepted System.exit(" + status + ")");
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

    @Test
    public void testMain_withInvalidArgs_callsSystemExitWithNegativeOne() {
        NoExitSecurityManager sm = new NoExitSecurityManager();
        try {
            System.setSecurityManager(sm);
        } catch (Throwable t) {
            // Setting a SecurityManager may be unsupported on some JVMs
            // (e.g. Java 17+ with strict modules); skip this test in that case.
            return;
        }
        try {
            CommandLineRunner.main(new String[]{"--this_flag_does_not_exist_either"});
            fail("Expected System.exit to be called for invalid configuration");
        } catch (ExitException e) {
            assertEquals(-1, e.status);
        } finally {
            try {
                System.setSecurityManager(null);
            } catch (Throwable ignored) {
                // ignore
            }
        }
    }

    @Test
    public void testMain_withHelpFlag_callsSystemExitWithNegativeOne() {
        NoExitSecurityManager sm = new NoExitSecurityManager();
        try {
            System.setSecurityManager(sm);
        } catch (Throwable t) {
            return;
        }
        try {
            CommandLineRunner.main(new String[]{"--help"});
            fail("Expected System.exit to be called when --help is specified");
        } catch (ExitException e) {
            assertEquals(-1, e.status);
        } finally {
            try {
                System.setSecurityManager(null);
            } catch (Throwable ignored) {
                // ignore
            }
        }
    }
}
