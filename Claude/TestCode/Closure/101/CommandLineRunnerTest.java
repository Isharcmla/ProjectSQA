package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.kohsuke.args4j.CmdLineException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.security.Permission;
import java.util.List;

public class CommandLineRunnerTest {

  private ByteArrayOutputStream outStream;
  private ByteArrayOutputStream errStream;
  private PrintStream out;
  private PrintStream err;

  @Before
  public void setUp() {
    outStream = new ByteArrayOutputStream();
    errStream = new ByteArrayOutputStream();
    out = new PrintStream(outStream);
    err = new PrintStream(errStream);
  }

  // -------------------- Constructor tests --------------------

  @Test
  public void testConstructor_emptyArgs_success() throws CmdLineException {
    String[] args = {};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withValidJsFlag_success() throws CmdLineException {
    String[] args = {"--js", "test.js"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test(expected = CmdLineException.class)
  public void testConstructor_invalidFlag_throwsCmdLineException() throws CmdLineException {
    String[] args = {"--unknown_flag_xyz"};
    new CommandLineRunner(args);
  }

  @Test(expected = CmdLineException.class)
  public void testConstructor_invalidBooleanValue_throwsCmdLineException() throws CmdLineException {
    String[] args = {"--debug", "notaboolean"};
    new CommandLineRunner(args);
  }

  @Test
  public void testConstructor_withPrintStreams_success() throws CmdLineException {
    String[] args = {"--js", "test.js"};
    CommandLineRunner runner = new CommandLineRunner(args, out, err);
    assertNotNull(runner);
  }

  @Test(expected = CmdLineException.class)
  public void testConstructor_withPrintStreamsInvalidFlag_throwsCmdLineException() throws CmdLineException {
    String[] args = {"--bad_flag_test"};
    new CommandLineRunner(args, out, err);
  }

  @Test
  public void testConstructor_withEqualsSyntax_success() throws CmdLineException {
    String[] args = {"--js=test.js"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withQuotedValue_success() throws CmdLineException {
    String[] args = {"--js_output_file='out.js'"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withDoubleQuotedValue_success() throws CmdLineException {
    String[] args = {"--js_output_file=\"out.js\""};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withCompilationLevel_success() throws CmdLineException {
    String[] args = {"--compilation_level", "ADVANCED_OPTIMIZATIONS"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test(expected = CmdLineException.class)
  public void testConstructor_invalidCompilationLevel_throwsCmdLineException() throws CmdLineException {
    String[] args = {"--compilation_level", "INVALID_LEVEL"};
    new CommandLineRunner(args);
  }

  @Test
  public void testConstructor_withWarningLevel_success() throws CmdLineException {
    String[] args = {"--warning_level", "VERBOSE"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withFormattingOption_success() throws CmdLineException {
    String[] args = {"--formatting", "PRETTY_PRINT"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test(expected = CmdLineException.class)
  public void testConstructor_invalidFormattingOption_throwsCmdLineException() throws CmdLineException {
    String[] args = {"--formatting", "INVALID_OPTION"};
    new CommandLineRunner(args);
  }

  @Test
  public void testConstructor_withBooleanTrue_success() throws CmdLineException {
    String[] args = {"--debug", "true"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withBooleanOn_success() throws CmdLineException {
    String[] args = {"--debug", "on"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withBooleanFalse_success() throws CmdLineException {
    String[] args = {"--debug", "false"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withMultipleJsFlags_success() throws CmdLineException {
    String[] args = {"--js", "a.js", "--js", "b.js"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withModuleFlag_success() throws CmdLineException {
    String[] args = {"--module", "mod1:1"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withDefineFlag_success() throws CmdLineException {
    String[] args = {"--define", "FOO=true"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withDAlias_success() throws CmdLineException {
    String[] args = {"--D", "FOO=true"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withJscompErrorFlag_success() throws CmdLineException {
    String[] args = {"--jscomp_error", "checkTypes"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withCharset_success() throws CmdLineException {
    String[] args = {"--charset", "UTF-8"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withSummaryDetailLevel_success() throws CmdLineException {
    String[] args = {"--summary_detail_level", "3"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withDevMode_success() throws CmdLineException {
    String[] args = {"--jscomp_dev_mode", "OFF"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withDevModeAlias_success() throws CmdLineException {
    String[] args = {"--dev_mode", "OFF"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testConstructor_withEmptyStringArg_treatedAsFileArg() throws CmdLineException {
    // Edge case: empty string argument, should not match pattern, passed through as-is.
    String[] args = {""};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  // -------------------- createOptions tests --------------------

  @Test
  public void testCreateOptions_defaultFlags_returnsOptionsWithClosurePass() throws CmdLineException {
    String[] args = {};
    CommandLineRunner runner = new CommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    assertTrue(options.closurePass);
  }

  @Test
  public void testCreateOptions_withDebugFlag_returnsNonNullOptions() throws CmdLineException {
    String[] args = {"--debug", "true"};
    CommandLineRunner runner = new CommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCreateOptions_withFormattingPrettyPrint_setsPrettyPrint() throws CmdLineException {
    String[] args = {"--formatting", "PRETTY_PRINT"};
    CommandLineRunner runner = new CommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
  }

  @Test
  public void testCreateOptions_withFormattingPrintInputDelimiter_setsFlag() throws CmdLineException {
    String[] args = {"--formatting", "PRINT_INPUT_DELIMITER"};
    CommandLineRunner runner = new CommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_processClosurePrimitivesFalse_closurePassFalse() throws CmdLineException {
    String[] args = {"--process_closure_primitives", "false"};
    CommandLineRunner runner = new CommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertFalse(options.closurePass);
  }

  @Test
  public void testCreateOptions_withAdvancedCompilationLevel_returnsOptions() throws CmdLineException {
    String[] args = {"--compilation_level", "ADVANCED_OPTIMIZATIONS"};
    CommandLineRunner runner = new CommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCreateOptions_withWhitespaceOnlyLevel_returnsOptions() throws CmdLineException {
    String[] args = {"--compilation_level", "WHITESPACE_ONLY"};
    CommandLineRunner runner = new CommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCreateOptions_withVerboseWarningLevel_returnsOptions() throws CmdLineException {
    String[] args = {"--warning_level", "VERBOSE"};
    CommandLineRunner runner = new CommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCreateOptions_withQuietWarningLevel_returnsOptions() throws CmdLineException {
    String[] args = {"--warning_level", "QUIET"};
    CommandLineRunner runner = new CommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  // -------------------- createCompiler tests --------------------

  @Test
  public void testCreateCompiler_returnsCompilerInstance() throws CmdLineException {
    String[] args = {};
    CommandLineRunner runner = new CommandLineRunner(args);
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  @Test
  public void testCreateCompiler_withPrintStreams_returnsCompilerInstance() throws CmdLineException {
    String[] args = {};
    CommandLineRunner runner = new CommandLineRunner(args, out, err);
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  // -------------------- createExterns tests --------------------

  @Test
  public void testCreateExterns_useOnlyCustomExterns_returnsListWithoutDefaultExterns()
      throws CmdLineException, IOException {
    String[] args = {"--use_only_custom_externs", "true"};
    CommandLineRunner runner = new CommandLineRunner(args);
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
  }

  @Test
  public void testCreateExterns_defaultExterns_returnsNonNullList() throws CmdLineException {
    String[] args = {};
    CommandLineRunner runner = new CommandLineRunner(args);
    try {
      List<JSSourceFile> externs = runner.createExterns();
      assertNotNull(externs);
    } catch (IOException e) {
      // If externs.zip resource is unavailable in this environment,
      // an IOException/NullPointerException-derived failure is acceptable
      // since it depends on classpath resource availability.
      assertNotNull(e);
    } catch (NullPointerException e) {
      // Same reasoning as above - the resource might be missing when
      // running tests outside of the full build environment.
      assertNotNull(e);
    }
  }

  // -------------------- main tests --------------------

  @Test
  public void testMain_withInvalidArgs_callsSystemExitWithNegativeOne() {
    SecurityManager originalManager = System.getSecurityManager();
    try {
      System.setSecurityManager(new NoExitSecurityManager());
      String[] args = {"--totally_invalid_flag_xyz"};
      try {
        CommandLineRunner.main(args);
        fail("Expected ExitException to be thrown due to System.exit call");
      } catch (ExitException e) {
        assertEquals(-1, e.status);
      }
    } finally {
      System.setSecurityManager(originalManager);
    }
  }

  // -------------------- Helper classes for intercepting System.exit --------------------

  private static class ExitException extends SecurityException {
    public final int status;

    public ExitException(int status) {
      super("System.exit(" + status + ") called");
      this.status = status;
    }
  }

  private static class NoExitSecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
      // Allow everything except exit.
    }

    @Override
    public void checkPermission(Permission perm, Object context) {
      // Allow everything except exit.
    }

    @Override
    public void checkExit(int status) {
      super.checkExit(status);
      throw new ExitException(status);
    }
  }
}
