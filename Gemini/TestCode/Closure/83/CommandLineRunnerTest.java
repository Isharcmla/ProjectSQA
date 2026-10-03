package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import org.junit.Test;

public class CommandLineRunnerTest {

  private static class TestableCommandLineRunner extends CommandLineRunner {
    private boolean testMode = false;

    TestableCommandLineRunner(String[] args) {
      super(args);
    }

    TestableCommandLineRunner(String[] args, PrintStream out, PrintStream err) {
      super(args, out, err);
    }

    void setTestMode(boolean testMode) {
      this.testMode = testMode;
    }

    @Override
    protected boolean isInTestMode() {
      return this.testMode;
    }

    @Override
    public CompilerOptions createOptions() {
      return super.createOptions();
    }

    @Override
    public Compiler createCompiler() {
      return super.createCompiler();
    }

    @Override
    public List<JSSourceFile> createExterns() throws FlagUsageException, IOException {
      return super.createExterns();
    }
  }

  @Test
  public void testGetDefaultExterns_returnsNonEmptyListInExpectedOrder() throws IOException {
    List<JSSourceFile> defaultExterns = CommandLineRunner.getDefaultExterns();
    assertNotNull(defaultExterns);
    assertFalse(defaultExterns.isEmpty());
    assertEquals("externs.zip//es3.js", defaultExterns.get(0).getName());
  }

  @Test
  public void testConstructor_withEmptyArgs_shouldRunCompilerReturnsTrue() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withCustomStreams_shouldRunCompilerReturnsTrue() {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{}, new PrintStream(out), new PrintStream(err));
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_helpFlag_shouldRunCompilerReturnsFalseAndPrintsUsage() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{"--help"}, System.out, new PrintStream(err));
    assertFalse(runner.shouldRunCompiler());
    assertTrue(err.toString().contains("--help"));
  }

  @Test
  public void testConstructor_versionFlag_printsVersionInfo() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{"--version"}, System.out, new PrintStream(err));
    assertTrue(runner.shouldRunCompiler());
    assertTrue(err.toString().contains("Closure Compiler"));
    assertTrue(err.toString().contains("Version:"));
  }

  @Test
  public void testConstructor_invalidFlag_shouldRunCompilerReturnsFalse() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{"--non_existent_flag_xyz"}, System.out, new PrintStream(err));
    assertFalse(runner.shouldRunCompiler());
    assertTrue(err.toString().length() > 0);
  }

  @Test
  public void testConstructor_quotedArguments_parsedCorrectly() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{"--js='test.js'", "--js_output_file=\"out.js\""});
    assertTrue(runner.shouldRunCompiler());
    assertEquals("out.js", runner.getCommandLineConfig().jsOutputFile);
  }

  @Test
  public void testBooleanOptionHandler_variousTrueValues() {
    String[] trues = new String[]{"true", "on", "yes", "1"};
    for (String val : trues) {
      TestableCommandLineRunner runner = new TestableCommandLineRunner(
          new String[]{"--debug=" + val});
      assertTrue(runner.shouldRunCompiler());
      CompilerOptions options = runner.createOptions();
      assertTrue(options.anonymousFunctionNaming == AnonymousFunctionNamingPolicy.UNMAPPED);
    }
  }

  @Test
  public void testBooleanOptionHandler_variousFalseValues() {
    String[] falses = new String[]{"false", "off", "no", "0"};
    for (String val : falses) {
      TestableCommandLineRunner runner = new TestableCommandLineRunner(
          new String[]{"--debug=" + val});
      assertTrue(runner.shouldRunCompiler());
      CompilerOptions options = runner.createOptions();
      assertFalse(options.anonymousFunctionNaming == AnonymousFunctionNamingPolicy.UNMAPPED);
    }
  }

  @Test
  public void testBooleanOptionHandler_noParamAndUnrecognizedParam() {
    TestableCommandLineRunner runner1 = new TestableCommandLineRunner(
        new String[]{"--debug"});
    assertTrue(runner1.shouldRunCompiler());
    assertTrue(runner1.createOptions().anonymousFunctionNaming == AnonymousFunctionNamingPolicy.UNMAPPED);

    TestableCommandLineRunner runner2 = new TestableCommandLineRunner(
        new String[]{"--debug=other_string"});
    assertTrue(runner2.shouldRunCompiler());
    assertTrue(runner2.createOptions().anonymousFunctionNaming == AnonymousFunctionNamingPolicy.UNMAPPED);
  }

  @Test
  public void testCreateOptions_formattingOptionsApplied() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{
            "--formatting=PRETTY_PRINT",
            "--formatting=PRINT_INPUT_DELIMITER"
        });
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testCreateOptions_compilationAndWarningLevels() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{
            "--compilation_level=ADVANCED_OPTIMIZATIONS",
            "--warning_level=VERBOSE",
            "--process_closure_primitives=false"
        });
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertTrue(options.checkGlobalThisLevel.isOn());
    assertFalse(options.closurePass);
  }

  @Test
  public void testCreateCompiler_returnsNonNullInstance() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{});
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  @Test
  public void testCreateExterns_includeDefaultExternsWhenNotCustomOnly() throws Exception {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{});
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
    assertFalse(externs.isEmpty());
  }

  @Test
  public void testCreateExterns_useOnlyCustomExternsFlag() throws Exception {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{"--use_only_custom_externs=true"});
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
    assertTrue(externs.isEmpty());
  }

  @Test
  public void testCreateExterns_inTestModeReturnsOnlySpecifiedExterns() throws Exception {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{});
    runner.setTestMode(true);
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
    assertTrue(externs.isEmpty());
  }

  @Test
  public void testAllCommandLineFlags_validAssignment() {
    String[] args = new String[]{
        "--print_tree",
        "--compute_phase_ordering",
        "--print_ast",
        "--print_pass_graph",
        "--jscomp_dev_mode=START",
        "--logging_level=INFO",
        "--externs=my_extern.js",
        "--js=my_source.js",
        "--js_output_file=out.js",
        "--module=mod:1",
        "--variable_map_input_file=var_in.map",
        "--property_map_input_file=prop_in.map",
        "--variable_map_output_file=var_out.map",
        "--property_map_output_file=prop_out.map",
        "--third_party=true",
        "--summary_detail_level=3",
        "--output_wrapper=%output%",
        "--output_wrapper_marker=%output%",
        "--module_wrapper=mod:%s",
        "--module_output_path_prefix=prefix_",
        "--create_source_map=map.out",
        "--jscomp_error=checkVars",
        "--jscomp_warning=undefinedVars",
        "--jscomp_off=fileoverviewTags",
        "--define=FLAG=true",
        "-D", "OTHER_FLAG=1",
        "--D", "ANOTHER_FLAG='val'",
        "--charset=UTF-8",
        "--manage_closure_dependencies=true",
        "--closure_entry_point=my.app",
        "--output_manifest=manifest.txt"
    };

    TestableCommandLineRunner runner = new TestableCommandLineRunner(args);
    assertTrue(runner.shouldRunCompiler());
    AbstractCommandLineRunner.CommandLineConfig config = runner.getCommandLineConfig();

    assertTrue(config.printTree);
    assertTrue(config.computePhaseOrdering);
    assertTrue(config.printAst);
    assertTrue(config.printPassGraph);
    assertEquals(CompilerOptions.DevMode.START, config.jscompDevMode);
    assertEquals("INFO", config.loggingLevel);
    assertTrue(config.externs.contains("my_extern.js"));
    assertTrue(config.js.contains("my_source.js"));
    assertEquals("out.js", config.jsOutputFile);
    assertTrue(config.module.contains("mod:1"));
    assertEquals("var_in.map", config.variableMapInputFile);
    assertEquals("prop_in.map", config.propertyMapInputFile);
    assertEquals("var_out.map", config.variableMapOutputFile);
    assertEquals("prop_out.map", config.propertyMapOutputFile);
    assertTrue(config.codingConvention instanceof DefaultCodingConvention);
    assertEquals(3, config.summaryDetailLevel);
    assertEquals("%output%", config.outputWrapper);
    assertEquals("%output%", config.outputWrapperMarker);
    assertTrue(config.moduleWrapper.contains("mod:%s"));
    assertEquals("prefix_", config.moduleOutputPathPrefix);
    assertEquals("map.out", config.createSourceMap);
    assertTrue(config.jscompError.contains("checkVars"));
    assertTrue(config.jscompWarning.contains("undefinedVars"));
    assertTrue(config.jscompOff.contains("fileoverviewTags"));
    assertTrue(config.define.contains("FLAG=true"));
    assertTrue(config.define.contains("OTHER_FLAG=1"));
    assertTrue(config.define.contains("ANOTHER_FLAG='val'"));
    assertEquals("UTF-8", config.charset);
    assertTrue(config.manageClosureDependencies);
    assertTrue(config.closureEntryPoints.contains("my.app"));
    assertEquals("manifest.txt", config.outputManifest);
  }

  @Test
  public void testThirdPartyFlagFalse_usesClosureCodingConvention() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{"--third_party=false"});
    assertTrue(runner.shouldRunCompiler());
    assertTrue(runner.getCommandLineConfig().codingConvention instanceof ClosureCodingConvention);
  }

  @Test
  public void testCreateNameMapFilesFlag_configuredCorrectly() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{"--create_name_map_files=true"});
    assertTrue(runner.shouldRunCompiler());
    assertTrue(runner.getCommandLineConfig().createNameMapFiles);
  }
}
