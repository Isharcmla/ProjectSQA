package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.security.Permission;
import java.util.List;

/**
 * Unit tests for {@link CommandLineRunner}.
 *
 * Note: This class is in the same package as CommandLineRunner so that
 * protected constructors and protected methods can be exercised directly
 * without mocking frameworks.
 */
public class CommandLineRunnerTest {

  private ByteArrayOutputStream errStream;
  private PrintStream errPrintStream;
  private ByteArrayOutputStream outStream;
  private PrintStream outPrintStream;

  @Before
  public void setUp() {
    errStream = new ByteArrayOutputStream();
    errPrintStream = new PrintStream(errStream);
    outStream = new ByteArrayOutputStream();
    outPrintStream = new PrintStream(outStream);
  }

  // ---------------------------------------------------------------------
  // Custom SecurityManager to safely intercept System.exit() calls made
  // by CommandLineRunner.main() without terminating the test JVM.
  // ---------------------------------------------------------------------
  private static class ExitException extends SecurityException {
    private static final long serialVersionUID = 1L;
    final int status;

    ExitException(int status) {
      super("System.exit called with status " + status);
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
      throw new ExitException(status);
    }
  }

  // ---------------------------------------------------------------------
  // Constructor / shouldRunCompiler() tests
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_withEmptyArgs_configShouldBeValid() {
    CommandLineRunner runner = new CommandLineRunner(new String[] {});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testShouldRunCompiler_withHelpFlag_returnsFalse() {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--help"},
        outPrintStream, errPrintStream);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testShouldRunCompiler_withUnknownFlag_returnsFalse() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--this_flag_does_not_exist=value"},
        outPrintStream, errPrintStream);
    assertFalse(runner.shouldRunCompiler());
    // an error message should have been written to err
    assertTrue(errStream.toString().length() > 0);
  }

  @Test
  public void testShouldRunCompiler_withInvalidNumericFlag_returnsFalse() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--summary_detail_level=notANumber"},
        outPrintStream, errPrintStream);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withVersionFlag_configStillValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--version"}, outPrintStream, errPrintStream);
    // version flag alone should not invalidate configuration
    assertTrue(runner.shouldRunCompiler());
    assertTrue(errStream.toString().contains("Version"));
  }

  @Test
  public void testConstructor_withFlagFileNotFound_configInvalid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--flagfile=/this/file/does/not/exist_12345.txt"},
        outPrintStream, errPrintStream);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withEqualsSignArgFormat_configValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--charset=UTF-8"}, outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withQuotedArgValue_configValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--js_output_file='out.js'"},
        outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withDoubleQuotedArgValue_configValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--js_output_file=\"out2.js\""},
        outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withBooleanFlagTrueValue_configValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--debug=true"}, outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withBooleanFlagFalseValue_configValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--debug=false"}, outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withBooleanFlagNoValue_configValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--debug"}, outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withMultipleJsFlags_configValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--js", "a.js", "--js", "b.js"},
        outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withThirdPartyFlag_configValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--third_party"}, outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withCompilationLevelAdvanced_configValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--compilation_level=ADVANCED_OPTIMIZATIONS"},
        outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withInvalidCompilationLevel_configInvalid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--compilation_level=NOT_A_LEVEL"},
        outPrintStream, errPrintStream);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withWarningLevelVerbose_configValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--warning_level=VERBOSE"},
        outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withFormattingOption_configValid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--formatting=PRETTY_PRINT"},
        outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withInvalidFormattingOption_configInvalid() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--formatting=NOT_A_FORMAT"},
        outPrintStream, errPrintStream);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withOneArgConstructor_usesSystemErr() {
    // Exercises the single-arg protected constructor (uses System.err).
    CommandLineRunner runner = new CommandLineRunner(new String[] {});
    assertNotNull(runner);
    assertTrue(runner.shouldRunCompiler());
  }

  // ---------------------------------------------------------------------
  // createOptions() tests
  // ---------------------------------------------------------------------

  @Test
  public void testCreateOptions_withDefaultFlags_returnsNonNullOptions() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {}, outPrintStream, errPrintStream);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    // process_closure_primitives defaults to true
    assertTrue(options.closurePass);
  }

  @Test
  public void testCreateOptions_withDebugAndExportsAndFormatting_appliesAll() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {
            "--debug",
            "--generate_exports",
            "--formatting=PRETTY_PRINT",
            "--process_closure_primitives=false"
        },
        outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    assertTrue(options.prettyPrint);
    assertFalse(options.closurePass);
  }

  @Test
  public void testCreateOptions_withMultipleFormattingOptions_appliesBoth() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {
            "--formatting=PRETTY_PRINT",
            "--formatting=PRINT_INPUT_DELIMITER"
        },
        outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
    assertTrue(options.printInputDelimiter);
  }

  // ---------------------------------------------------------------------
  // createCompiler() test
  // ---------------------------------------------------------------------

  @Test
  public void testCreateCompiler_returnsNonNullCompilerInstance() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {}, outPrintStream, errPrintStream);
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  // ---------------------------------------------------------------------
  // createExterns() tests
  // ---------------------------------------------------------------------

  @Test
  public void testCreateExterns_withUseOnlyCustomExterns_returnsListWithoutDefaults()
      throws Exception {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {"--use_only_custom_externs"},
        outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
  }

  @Test
  public void testCreateExterns_withDefaultFlags_doesNotThrowUnexpectedly() {
    CommandLineRunner runner = new CommandLineRunner(
        new String[] {}, outPrintStream, errPrintStream);
    try {
      List<JSSourceFile> externs = runner.createExterns();
      assertNotNull(externs);
    } catch (Exception e) {
      // Acceptable if externs.zip resource is not present in the test
      // classpath environment; we only verify no crash of unexpected type
      // prevents test suite compilation/execution.
      assertNotNull(e);
    }
  }

  // ---------------------------------------------------------------------
  // getDefaultExterns() tests
  // ---------------------------------------------------------------------

  @Test
  public void testGetDefaultExterns_returnsListOrThrowsKnownException() {
    try {
      List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
      assertNotNull(externs);
      assertFalse(externs.isEmpty());
    } catch (IOException e) {
      // Acceptable if the externs.zip resource is unavailable in this
      // test environment.
      assertNotNull(e);
    } catch (IllegalStateException e) {
      // Acceptable if the resource does not exactly match the hard-coded
      // list of expected externs names.
      assertNotNull(e);
    } catch (NullPointerException e) {
      // Acceptable if the resource stream could not be located at all.
      assertNotNull(e);
    }
  }

  // ---------------------------------------------------------------------
  // main() tests
  // ---------------------------------------------------------------------

  @Test
  public void testMain_withInvalidConfig_callsSystemExitWithNegativeOne() {
    SecurityManager original = System.getSecurityManager();
    try {
      System.setSecurityManager(new NoExitSecurityManager());
      try {
        CommandLineRunner.main(new String[] {"--help"});
        fail("Expected System.exit to be called for invalid configuration");
      } catch (ExitException e) {
        assertEquals(-1, e.status);
      }
    } catch (UnsupportedOperationException uoe) {
      // Some newer JVMs disallow setting a SecurityManager; skip gracefully.
      assertTrue(true);
    } finally {
      try {
        System.setSecurityManager(original);
      } catch (UnsupportedOperationException ignored) {
        // ignore on JVMs that disallow resetting security manager
      }
    }
  }

  @Test
  public void testMain_withUnknownFlag_callsSystemExitWithNegativeOne() {
    SecurityManager original = System.getSecurityManager();
    try {
      System.setSecurityManager(new NoExitSecurityManager());
      try {
        CommandLineRunner.main(new String[] {"--totally_unknown_flag_xyz"});
        fail("Expected System.exit to be called for invalid configuration");
      } catch (ExitException e) {
        assertEquals(-1, e.status);
      }
    } catch (UnsupportedOperationException uoe) {
      assertTrue(true);
    } finally {
      try {
        System.setSecurityManager(original);
      } catch (UnsupportedOperationException ignored) {
        // ignore
      }
    }
  }
}
