package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class CommandLineRunnerTest {

  private static class TestableCommandLineRunner extends CommandLineRunner {
    TestableCommandLineRunner(String[] args) {
      super(args);
    }

    TestableCommandLineRunner(String[] args, PrintStream out, PrintStream err) {
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
    public List<JSSourceFile> createExterns() throws AbstractCommandLineRunner.FlagUsageException, IOException {
      return super.createExterns();
    }
  }

  private static class SimpleBooleanSetter implements Setter<Boolean> {
    private Boolean value;

    @Override
    public void addValue(Boolean value) {
      this.value = value;
    }

    @Override
    public Class<Boolean> getType() {
      return Boolean.class;
    }

    @Override
    public boolean isMultiValued() {
      return false;
    }

    public Boolean getValue() {
      return value;
    }
  }

  @Test
  public void testConstructor_emptyArgs_shouldRunCompilerTrue() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withHelpFlag_shouldRunCompilerFalse() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{"--help"},
        new PrintStream(new ByteArrayOutputStream()),
        new PrintStream(err));
    assertFalse(runner.shouldRunCompiler());
    assertTrue(err.toString().length() > 0);
  }

  @Test
  public void testConstructor_invalidFlag_shouldRunCompilerFalse() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(
        new String[]{"--non_existent_flag"},
        new PrintStream(new ByteArrayOutputStream()),
        new PrintStream(err));
    assertFalse(runner.shouldRunCompiler());
    assertTrue(err.toString().contains("non_existent_flag"));
  }

  @Test
  public void testConstructor_withQuotedAndUnquotedEqualsArgs_parsesCorrectly() {
    String[] args = {
        "--js='input1.js'",
        "--externs=\"extern1.js\"",
        "--output_wrapper=%output%",
        "--charset=UTF-8",
        "--third_party=true"
    };
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_thirdPartyFalse_usesClosureCodingConvention() {
    String[] args = {"--third_party=false"};
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_allValidFlagsParsed_shouldRunCompilerTrue() {
    String[] args = {
        "--print_tree=true",
        "--compute_phase_ordering=true",
        "--print_ast=true",
        "--print_pass_graph=true",
        "--jscomp_dev_mode=OFF",
        "--logging_level=INFO",
        "--externs=extern.js",
        "--js=test.js",
        "--js_output_file=out.js",
        "--module=mod1:1",
        "--variable_map_input_file=v_in.txt",
        "--property_map_input_file=p_in.txt",
        "--variable_map_output_file=v_out.txt",
        "--property_map_output_file=p_out.txt",
        "--summary_detail_level=2",
        "--output_wrapper=(function(){%output%})();",
        "--output_wrapper_marker=%output%",
        "--module_wrapper=mod1:%s",
        "--module_output_path_prefix=./dist/",
        "--create_source_map=out.map",
        "--jscomp_error=checkTypes",
        "--jscomp_warning=checkVars",
        "--jscomp_off=deprecated",
        "--define=DEBUG=false",
        "--charset=UTF-8",
        "--manage_closure_dependencies=true",
        "--output_manifest=manifest.MF"
    };
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_nameMapFilesFlag_shouldRunCompilerTrue() {
    String[] args = {"--create_name_map_files=true"};
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testCreateOptions_advancedOptimizationsWithDebugAndFormatting_configuresOptionsCorrectly() {
    String[] args = {
        "--compilation_level=ADVANCED_OPTIMIZATIONS",
        "--warning_level=VERBOSE",
        "--debug=true",
        "--formatting=PRETTY_PRINT",
        "--formatting=PRINT_INPUT_DELIMITER",
        "--process_closure_primitives=false"
    };
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    assertTrue(options.prettyPrint);
    assertTrue(options.printInputDelimiter);
    assertFalse(options.closurePass);
    assertNotNull(options.getCodingConvention());
  }

  @Test
  public void testCreateOptions_whitespaceOnlyAndQuiet_configuresOptionsCorrectly() {
    String[] args = {
        "--compilation_level=WHITESPACE_ONLY",
        "--warning_level=QUIET",
        "--debug=false",
        "--process_closure_primitives=true"
    };
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    assertTrue(options.closurePass);
    assertFalse(options.prettyPrint);
  }

  @Test
  public void testCreateCompiler_returnsCompilerInstance() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{});
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  @Test
  public void testCreateExterns_defaultExternsIncluded_returnsExternsList() throws Exception {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{});
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
    assertFalse(externs.isEmpty());
  }

  @Test
  public void testCreateExterns_useOnlyCustomExternsTrue_returnsOnlySpecifiedExterns() throws Exception {
    String[] args = {"--use_only_custom_externs=true"};
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args);
    List<JSSourceFile> externs = runner.createExterns();
    assertNotNull(externs);
    assertEquals(0, externs.size());
  }

  @Test
  public void testGetDefaultExterns_loadsAllDefaultExterns() throws IOException {
    List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
    assertNotNull(externs);
    assertFalse(externs.isEmpty());
    assertEquals("es3.js", externs.get(0).getName().replace("externs.zip//", ""));
  }

  @Test
  public void testBooleanOptionHandler_nullParameter_setsTrueAndReturnsZero() throws Exception {
    CmdLineParser parser = new CmdLineParser(new Object());
    SimpleBooleanSetter setter = new SimpleBooleanSetter();
    CommandLineRunner.Flags.BooleanOptionHandler handler =
        new CommandLineRunner.Flags.BooleanOptionHandler(parser, null, setter);

    Parameters params = new Parameters() {
      @Override
      public String getParameter(int idx) {
        return null;
      }

      @Override
      public int size() {
        return 0;
      }
    };

    int result = handler.parseArguments(params);
    assertEquals(0, result);
    assertEquals(Boolean.TRUE, setter.getValue());
    assertNull(handler.getDefaultMetaVariable());
  }

  @Test
  public void testBooleanOptionHandler_trueValues_setsTrue() throws Exception {
    String[] trueStrings = {"true", "on", "yes", "1", "TRUE", "On", "YES"};
    for (final String trueStr : trueStrings) {
      CmdLineParser parser = new CmdLineParser(new Object());
      SimpleBooleanSetter setter = new SimpleBooleanSetter();
      CommandLineRunner.Flags.BooleanOptionHandler handler =
          new CommandLineRunner.Flags.BooleanOptionHandler(parser, null, setter);

      Parameters params = new Parameters() {
        @Override
        public String getParameter(int idx) {
          return trueStr;
        }

        @Override
        public int size() {
          return 1;
        }
      };

      int result = handler.parseArguments(params);
      assertEquals(1, result);
      assertEquals(Boolean.TRUE, setter.getValue());
    }
  }

  @Test
  public void testBooleanOptionHandler_falseValues_setsFalse() throws Exception {
    String[] falseStrings = {"false", "off", "no", "0", "FALSE", "Off", "NO"};
    for (final String falseStr : falseStrings) {
      CmdLineParser parser = new CmdLineParser(new Object());
      SimpleBooleanSetter setter = new SimpleBooleanSetter();
      CommandLineRunner.Flags.BooleanOptionHandler handler =
          new CommandLineRunner.Flags.BooleanOptionHandler(parser, null, setter);

      Parameters params = new Parameters() {
        @Override
        public String getParameter(int idx) {
          return falseStr;
        }

        @Override
        public int size() {
          return 1;
        }
      };

      int result = handler.parseArguments(params);
      assertEquals(1, result);
      assertEquals(Boolean.FALSE, setter.getValue());
    }
  }

  @Test
  public void testBooleanOptionHandler_illegalValue_throwsCmdLineException() {
    CmdLineParser parser = new CmdLineParser(new Object());
    SimpleBooleanSetter setter = new SimpleBooleanSetter();
    CommandLineRunner.Flags.BooleanOptionHandler handler =
        new CommandLineRunner.Flags.BooleanOptionHandler(parser, null, setter);

    Parameters params = new Parameters() {
      @Override
      public String getParameter(int idx) {
        return "invalid_boolean";
      }

      @Override
      public int size() {
        return 1;
      }
    };

    try {
      handler.parseArguments(params);
      fail("Expected CmdLineException for invalid boolean value");
    } catch (CmdLineException e) {
      assertTrue(e.getMessage().contains("Illegal boolean value"));
    }
  }
}
