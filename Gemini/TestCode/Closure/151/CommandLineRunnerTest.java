package com.google.javascript.jscomp;

import com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CommandLineRunnerTest {

  private static class SubCommandLineRunner extends CommandLineRunner {
    public SubCommandLineRunner(String[] args) {
      super(args);
    }

    public SubCommandLineRunner(String[] args, PrintStream out, PrintStream err) {
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
  public void testConstructor_emptyArgs_success() {
    SubCommandLineRunner runner = new SubCommandLineRunner(new String[]{});
    Assert.assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_withPrintStreams_success() {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    PrintStream outStream = new PrintStream(out);
    PrintStream errStream = new PrintStream(err);

    SubCommandLineRunner runner = new SubCommandLineRunner(new String[]{}, outStream, errStream);
    Assert.assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_helpFlag_shouldNotRunCompiler() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[]{"--help"},
        System.out,
        new PrintStream(err));
    Assert.assertFalse(runner.shouldRunCompiler());
    Assert.assertTrue(err.toString().length() > 0);
  }

  @Test
  public void testConstructor_invalidFlag_shouldNotRunCompiler() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[]{"--invalid_flag_name_xyz=123"},
        System.out,
        new PrintStream(err));
    Assert.assertFalse(runner.shouldRunCompiler());
    Assert.assertTrue(err.toString().length() > 0);
  }

  @Test
  public void testConstructor_quotedArguments_parsedCorrectly() {
    String[] args = new String[]{
        "--output_wrapper='(function(){%output%})();'",
        "--js=\"file1.js\"",
        "--charset=UTF-8"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    Assert.assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_allValidFlags_parsedCorrectly() {
    String[] args = new String[]{
        "--print_tree=true",
        "--compute_phase_ordering=true",
        "--print_ast=true",
        "--print_pass_graph=true",
        "--jscomp_dev_mode=OFF",
        "--logging_level=INFO",
        "--externs=extern1.js",
        "--js=input.js",
        "--js_output_file=out.js",
        "--module=m1:1:",
        "--variable_map_input_file=vmap_in.txt",
        "--property_map_input_file=pmap_in.txt",
        "--variable_map_output_file=vmap_out.txt",
        "--property_map_output_file=pmap_out.txt",
        "--third_party=true",
        "--summary_detail_level=2",
        "--output_wrapper=%output%",
        "--output_wrapper_marker=%output%",
        "--module_wrapper=m1:%s",
        "--module_output_path_prefix=prefix_",
        "--create_source_map=map.out",
        "--jscomp_error=checkVars",
        "--jscomp_warning=checkVars",
        "--jscomp_off=checkVars",
        "--define=FOO=true",
        "--compilation_level=ADVANCED_OPTIMIZATIONS",
        "--warning_level=VERBOSE",
        "--use_only_custom_externs=true",
        "--debug=true",
        "--formatting=PRETTY_PRINT",
        "--formatting=PRINT_INPUT_DELIMITER",
        "--process_closure_primitives=false",
        "--manage_closure_dependencies=true",
        "--output_manifest=manifest.out"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    Assert.assertTrue(runner.shouldRunCompiler());

    CompilerOptions options = runner.createOptions();
    Assert.assertNotNull(options);
    Assert.assertTrue(options.prettyPrint);
    Assert.assertTrue(options.printInputDelimiter);
    Assert.assertFalse(options.closurePass);
  }

  @Test
  public void testConstructor_createNameMapFilesFlag_success() {
    String[] args = new String[]{
        "--create_name_map_files=true"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    Assert.assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testCreateOptions_compilationLevelWhitespace_success() {
    String[] args = new String[]{
        "--compilation_level=WHITESPACE_ONLY",
        "--warning_level=QUIET"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    Assert.assertNotNull(options);
  }

  @Test
  public void testCreateOptions_compilationLevelSimple_success() {
    String[] args = new String[]{
        "--compilation_level=SIMPLE_OPTIMIZATIONS",
        "--warning_level=DEFAULT"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    Assert.assertNotNull(options);
  }

  @Test
  public void testCreateCompiler_returnsValidCompilerInstance() {
    SubCommandLineRunner runner = new SubCommandLineRunner(new String[]{});
    Compiler compiler = runner.createCompiler();
    Assert.assertNotNull(compiler);
  }

  @Test
  public void testCreateExterns_withUseOnlyCustomExterns() throws Exception {
    SubCommandLineRunner runner = new SubCommandLineRunner(new String[]{"--use_only_custom_externs=true"});
    List<JSSourceFile> externs = runner.createExterns();
    Assert.assertNotNull(externs);
  }

  @Test
  public void testCreateExterns_defaultExternsLoaded() throws Exception {
    SubCommandLineRunner runner = new SubCommandLineRunner(new String[]{});
    List<JSSourceFile> externs = runner.createExterns();
    Assert.assertNotNull(externs);
    Assert.assertFalse(externs.isEmpty());
  }

  @Test
  public void testGetDefaultExterns_returnsNonEmptyList() throws IOException {
    List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
    Assert.assertNotNull(externs);
    Assert.assertFalse(externs.isEmpty());
  }

  @Test
  public void testBooleanOptionHandler_parseArguments_trueValues() throws Exception {
    final List<Boolean> result = new ArrayList<Boolean>();
    Setter<Boolean> setter = new Setter<Boolean>() {
      public Class<Boolean> getType() {
        return Boolean.class;
      }
      public boolean isMultiValued() {
        return false;
      }
      public void addValue(Boolean value) {
        result.add(value);
      }
    };

    CommandLineRunner.Flags.BooleanOptionHandler handler =
        new CommandLineRunner.Flags.BooleanOptionHandler(null, null, setter);

    Assert.assertNull(handler.getDefaultMetaVariable());

    String[] truthy = new String[]{"true", "on", "yes", "1"};
    for (final String val : truthy) {
      result.clear();
      Parameters params = new Parameters() {
        public String getParameter(int idx) {
          return val;
        }
        public int size() {
          return 1;
        }
      };
      int consumed = handler.parseArguments(params);
      Assert.assertEquals(1, consumed);
      Assert.assertEquals(1, result.size());
      Assert.assertEquals(Boolean.TRUE, result.get(0));
    }
  }

  @Test
  public void testBooleanOptionHandler_parseArguments_falseValues() throws Exception {
    final List<Boolean> result = new ArrayList<Boolean>();
    Setter<Boolean> setter = new Setter<Boolean>() {
      public Class<Boolean> getType() {
        return Boolean.class;
      }
      public boolean isMultiValued() {
        return false;
      }
      public void addValue(Boolean value) {
        result.add(value);
      }
    };

    CommandLineRunner.Flags.BooleanOptionHandler handler =
        new CommandLineRunner.Flags.BooleanOptionHandler(null, null, setter);

    String[] falsy = new String[]{"false", "off", "no", "0"};
    for (final String val : falsy) {
      result.clear();
      Parameters params = new Parameters() {
        public String getParameter(int idx) {
          return val;
        }
        public int size() {
          return 1;
        }
      };
      int consumed = handler.parseArguments(params);
      Assert.assertEquals(1, consumed);
      Assert.assertEquals(1, result.size());
      Assert.assertEquals(Boolean.FALSE, result.get(0));
    }
  }

  @Test
  public void testBooleanOptionHandler_parseArguments_nullParam() throws Exception {
    final List<Boolean> result = new ArrayList<Boolean>();
    Setter<Boolean> setter = new Setter<Boolean>() {
      public Class<Boolean> getType() {
        return Boolean.class;
      }
      public boolean isMultiValued() {
        return false;
      }
      public void addValue(Boolean value) {
        result.add(value);
      }
    };

    CommandLineRunner.Flags.BooleanOptionHandler handler =
        new CommandLineRunner.Flags.BooleanOptionHandler(null, null, setter);

    Parameters params = new Parameters() {
      public String getParameter(int idx) {
        return null;
      }
      public int size() {
        return 0;
      }
    };
    int consumed = handler.parseArguments(params);
    Assert.assertEquals(0, consumed);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(Boolean.TRUE, result.get(0));
  }

  @Test(expected = CmdLineException.class)
  public void testBooleanOptionHandler_parseArguments_illegalValue_throwsException() throws Exception {
    CommandLineRunner.Flags.BooleanOptionHandler handler =
        new CommandLineRunner.Flags.BooleanOptionHandler(new CmdLineParser(new Object()), null, new Setter<Boolean>() {
          public Class<Boolean> getType() {
            return Boolean.class;
          }
          public boolean isMultiValued() {
            return false;
          }
          public void addValue(Boolean value) {}
        });

    Parameters params = new Parameters() {
      public String getParameter(int idx) {
        return "not_a_boolean";
      }
      public int size() {
        return 1;
      }
    };
    handler.parseArguments(params);
  }
}
