package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.kohsuke.args4j.CmdLineException;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class CommandLineRunnerTest {

  private static class SubCommandLineRunner extends CommandLineRunner {
    public SubCommandLineRunner(String[] args) throws CmdLineException {
      super(args);
    }

    public SubCommandLineRunner(String[] args, PrintStream out, PrintStream err)
        throws CmdLineException {
      super(args, out, err);
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
  public void testConstructor_defaultArgs() throws Exception {
    String[] args = new String[] {};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    assertNotNull(runner);
    assertNotNull(runner.createCompiler());
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    assertTrue(options.closurePass);
  }

  @Test
  public void testConstructor_withPrintStreams() throws Exception {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    PrintStream psOut = new PrintStream(out);
    PrintStream psErr = new PrintStream(err);

    String[] args = new String[] {"--js", "test.js"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args, psOut, psErr);
    assertNotNull(runner);
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  @Test
  public void testConstructor_invalidFlag_throwsException() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    PrintStream psErr = new PrintStream(err);
    try {
      new SubCommandLineRunner(new String[] {"--unknown_flag_12345"}, System.out, psErr);
      fail("Expected CmdLineException for unknown flag");
    } catch (CmdLineException e) {
      assertTrue(err.toString().length() > 0);
    }
  }

  @Test
  public void testArgumentParsing_equalsAndQuotes() throws Exception {
    String[] args = new String[] {
        "--js_output_file=out.js",
        "--output_wrapper=\"%output%\"",
        "--charset='UTF-8'",
        "--summary_detail_level=3"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    assertNotNull(runner);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testBooleanOptionHandler_truthyValues() throws Exception {
    String[] truthy = new String[] {"true", "on", "yes", "1"};
    for (String val : truthy) {
      String[] args = new String[] {"--print_tree=" + val};
      SubCommandLineRunner runner = new SubCommandLineRunner(args);
      assertNotNull(runner);
    }
  }

  @Test
  public void testBooleanOptionHandler_falsyValues() throws Exception {
    String[] falsy = new String[] {"false", "off", "no", "0"};
    for (String val : falsy) {
      String[] args = new String[] {"--print_tree=" + val};
      SubCommandLineRunner runner = new SubCommandLineRunner(args);
      assertNotNull(runner);
    }
  }

  @Test
  public void testBooleanOptionHandler_flagWithoutValue() throws Exception {
    String[] args = new String[] {"--print_tree"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test
  public void testBooleanOptionHandler_invalidValue_throwsException() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    PrintStream psErr = new PrintStream(err);
    try {
      new SubCommandLineRunner(new String[] {"--print_tree=invalid_bool"}, System.out, psErr);
      fail("Expected CmdLineException on invalid boolean value");
    } catch (CmdLineException e) {
      assertTrue(e.getMessage().contains("Illegal boolean value"));
    }
  }

  @Test
  public void testCompilationLevel_whitespaceOnly() throws Exception {
    String[] args = new String[] {"--compilation_level", "WHITESPACE_ONLY"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCompilationLevel_simpleOptimizations() throws Exception {
    String[] args = new String[] {"--compilation_level", "SIMPLE_OPTIMIZATIONS"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCompilationLevel_advancedOptimizations_withDebug() throws Exception {
    String[] args = new String[] {
        "--compilation_level", "ADVANCED_OPTIMIZATIONS",
        "--debug=true"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    assertTrue(options.checkGlobalThisLevel.isOn());
  }

  @Test
  public void testWarningLevel_options() throws Exception {
    for (WarningLevel level : WarningLevel.values()) {
      String[] args = new String[] {"--warning_level", level.name()};
      SubCommandLineRunner runner = new SubCommandLineRunner(args);
      CompilerOptions options = runner.createOptions();
      assertNotNull(options);
    }
  }

  @Test
  public void testFormattingOptions() throws Exception {
    String[] args = new String[] {
        "--formatting", "PRETTY_PRINT",
        "--formatting", "PRINT_INPUT_DELIMITER"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertTrue(options.prettyPrint);
    assertTrue(options.printInputDelimiter);
  }

  @Test
  public void testProcessClosurePrimitives_false() throws Exception {
    String[] args = new String[] {"--process_closure_primitives=false"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertFalse(options.closurePass);
  }

  @Test
  public void testComprehensiveFlagsInitialization() throws Exception {
    String[] args = new String[] {
        "--compute_phase_ordering=true",
        "--print_ast=true",
        "--print_pass_graph=true",
        "--jscomp_dev_mode=START",
        "--logging_level=FINE",
        "--variable_map_input_file=vmap.in",
        "--property_map_input_file=pmap.in",
        "--variable_map_output_file=vmap.out",
        "--create_name_map_files=false",
        "--property_map_output_file=pmap.out",
        "--third_party=true",
        "--summary_detail_level=2",
        "--output_wrapper=%output%",
        "--output_wrapper_marker=%output%",
        "--module=m1:1",
        "--module_wrapper=m1:%s",
        "--module_output_path_prefix=./out/",
        "--create_source_map=map.out",
        "--jscomp_error=checkVars",
        "--jscomp_warning=checkTypes",
        "--jscomp_off=deprecated",
        "--define=DEBUG=false",
        "--charset=US-ASCII"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testCreateExterns_defaultExterns() throws Exception {
    String[] args = new String[] {"--use_only_custom_externs=false"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
    assertTrue(externs.size() > 0);
  }

  @Test
  public void testCreateExterns_customExternsOnly() throws Exception {
    File tempExtern = File.createTempFile("custom_extern", ".js");
    tempExtern.deleteOnExit();
    FileOutputStream fos = new FileOutputStream(tempExtern);
    fos.write("var myCustomExtern;".getBytes("UTF-8"));
    fos.close();

    String[] args = new String[] {
        "--use_only_custom_externs=true",
        "--externs", tempExtern.getAbsolutePath()
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
    assertEquals(1, externs.size());
  }

  @Test
  public void testCreateCompiler() throws Exception {
    SubCommandLineRunner runner = new SubCommandLineRunner(new String[] {});
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }
}
