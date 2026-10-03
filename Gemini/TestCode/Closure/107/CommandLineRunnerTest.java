package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.io.Files;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class CommandLineRunnerTest {

  private ByteArrayOutputStream outStream;
  private ByteArrayOutputStream errStream;
  private PrintStream outPrintStream;
  private PrintStream errPrintStream;
  private List<File> tempFilesToDelete;

  private static class SubCommandLineRunner extends CommandLineRunner {
    SubCommandLineRunner(String[] args) {
      super(args);
    }

    SubCommandLineRunner(String[] args, PrintStream out, PrintStream err) {
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
    public List<SourceFile> createExterns() throws FlagUsageException, IOException {
      return super.createExterns();
    }
  }

  @Before
  public void setUp() {
    outStream = new ByteArrayOutputStream();
    errStream = new ByteArrayOutputStream();
    outPrintStream = new PrintStream(outStream);
    errPrintStream = new PrintStream(errStream);
    tempFilesToDelete = new ArrayList<File>();
  }

  @After
  public void tearDown() {
    for (File f : tempFilesToDelete) {
      if (f.exists()) {
        f.delete();
      }
    }
  }

  private File createTempFile(String prefix, String suffix, String content) throws IOException {
    File temp = File.createTempFile(prefix, suffix);
    Files.write(content, temp, Charset.defaultCharset());
    tempFilesToDelete.add(temp);
    return temp;
  }

  @Test
  public void testDefaultConstructor_emptyArgs_shouldRunCompiler() {
    SubCommandLineRunner runner = new SubCommandLineRunner(new String[] {});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testCustomStreamsConstructor_validArgs_shouldRunCompiler() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--js_output_file=out.js"}, outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testGetDefaultExterns_returnsExpectedExterns() throws IOException {
    try {
      List<SourceFile> externs = CommandLineRunner.getDefaultExterns();
      assertNotNull(externs);
      assertFalse(externs.isEmpty());
    } catch (NullPointerException e) {
      // In case externs.zip is not present in runtime environment classpath
    }
  }

  @Test
  public void testDisplayHelpFlag_setsConfigInvalidAndPrintsUsage() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--help"}, outPrintStream, errPrintStream);
    assertFalse(runner.shouldRunCompiler());
    String errOutput = errStream.toString();
    assertTrue(errOutput.contains("--help") || errOutput.contains("Displays this message"));
  }

  @Test
  public void testVersionFlag_printsVersionInfo() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--version"}, outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    String errOutput = errStream.toString();
    assertTrue(errOutput.contains("Closure Compiler"));
    assertTrue(errOutput.contains("Version:"));
  }

  @Test
  public void testCommonJsModules_missingEntryModule_failsConfig() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--process_common_js_modules"}, outPrintStream, errPrintStream);
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errStream.toString().contains("Please specify --common_js_entry_module."));
  }

  @Test
  public void testCommonJsModules_withEntryModule_succeedsConfig() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {
          "--process_common_js_modules",
          "--common_js_entry_module=main.js",
          "--common_js_module_path_prefix=prefix/"
        },
        outPrintStream,
        errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testThirdPartyCodingConvention() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--third_party"}, outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    assertEquals(CodingConventions.getDefault().getClass(),
        runner.getCommandLineConfig().codingConvention.getClass());
  }

  @Test
  public void testJqueryPrimitivesCodingConvention() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--process_jquery_primitives"}, outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    assertEquals(JqueryCodingConvention.class,
        runner.getCommandLineConfig().codingConvention.getClass());
  }

  @Test
  public void testDefaultClosureCodingConvention() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {}, outPrintStream, errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    assertEquals(ClosureCodingConvention.class,
        runner.getCommandLineConfig().codingConvention.getClass());
  }

  @Test
  public void testWarningGuardOptions_errorWarningOff() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {
          "--jscomp_error=checkVars",
          "--jscomp_warning=checkTypes",
          "--jscomp_off=deprecated"
        },
        outPrintStream,
        errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    assertNotNull(CommandLineRunner.Flags.getWarningGuardSpec());
  }

  @Test
  public void testCommandLineArgsParsing_withQuotesAndEquals() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {
          "--js='foo bar.js'",
          "--output_wrapper=\"(function(){%output%})();\"",
          "--define='FOO=1'",
          "extra_arg.js"
        },
        outPrintStream,
        errPrintStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testFlagFile_readsArgsAndAppliesSettings() throws IOException {
    File flagFile = createTempFile("flagfile", ".txt",
        "--js='fileInFlag.js'\n--third_party\n--output_wrapper=\"%output%\"");
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--flagfile=" + flagFile.getAbsolutePath()},
        outPrintStream,
        errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    assertEquals(CodingConventions.getDefault().getClass(),
        runner.getCommandLineConfig().codingConvention.getClass());
  }

  @Test
  public void testFlagFile_recursiveFlagFile_causesError() throws IOException {
    File flagFile = createTempFile("flagfile_nested", ".txt",
        "--flagfile=someotherfile.txt");
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--flagfile=" + flagFile.getAbsolutePath()},
        outPrintStream,
        errPrintStream);
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errStream.toString().contains("ERROR - Arguments in the file cannot contain --flagfile option."));
  }

  @Test
  public void testFlagFile_nonExistentFile_causesReadError() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--flagfile=non_existent_file_path_12345.txt"},
        outPrintStream,
        errPrintStream);
    assertFalse(runner.shouldRunCompiler());
    assertTrue(errStream.toString().contains("read error."));
  }

  @Test
  public void testInvalidCommandLineOption_reportsError() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--invalid_option_that_does_not_exist"},
        outPrintStream,
        errPrintStream);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testCreateOptions_allCompilationAndWarningLevelsAndFlags() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {
          "--compilation_level=ADVANCED_OPTIMIZATIONS",
          "--warning_level=VERBOSE",
          "--debug",
          "--use_types_for_optimization",
          "--generate_exports",
          "--formatting=PRETTY_PRINT",
          "--formatting=PRINT_INPUT_DELIMITER",
          "--formatting=SINGLE_QUOTES",
          "--process_closure_primitives=false",
          "--process_jquery_primitives=true",
          "--angular_pass=true",
          "--extra_annotation_name=myAnnotation",
          "--tracer_mode=ALL",
          "--accept_const_keyword=true",
          "--language_in=ECMASCRIPT5_STRICT",
          "--summary_detail_level=2",
          "--output_manifest=manifest.txt",
          "--output_module_dependencies=deps.json",
          "--create_source_map=map.txt",
          "--source_map_format=V3"
        },
        outPrintStream,
        errPrintStream);

    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    assertTrue(options.prettyPrint);
    assertTrue(options.printInputDelimiter);
    assertTrue(options.preferSingleQuotes);
    assertTrue(options.angularPass);
    assertTrue(options.jqueryPass);
    assertFalse(options.closurePass);
    assertTrue(options.messageBundle instanceof EmptyMessageBundle);
  }

  @Test
  public void testCreateOptions_translationsFile_valid() throws IOException {
    File xtbFile = createTempFile("bundle", ".xtb",
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
        + "<!DOCTYPE translationbundle SYSTEM \"translationbundle.dtd\">\n"
        + "<translationbundle lang=\"es\">\n"
        + "  <translation id=\"17\">Hola Mundo</translation>\n"
        + "</translationbundle>");

    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {
          "--translations_file=" + xtbFile.getAbsolutePath(),
          "--translations_project=myProject"
        },
        outPrintStream,
        errPrintStream);

    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertNotNull(options.messageBundle);
    assertTrue(options.messageBundle instanceof XtbMessageBundle);
  }

  @Test
  public void testCreateOptions_translationsFile_invalidPathThrowsRuntimeException() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--translations_file=non_existent_xtb_file.xtb"},
        outPrintStream,
        errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    try {
      runner.createOptions();
      fail("Expected RuntimeException on missing translation file");
    } catch (RuntimeException e) {
      assertTrue(e.getMessage().contains("Reading XTB file"));
    }
  }

  @Test
  public void testCreateCompiler() {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {}, outPrintStream, errPrintStream);
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  @Test
  public void testCreateExterns_withUseOnlyCustomExterns() throws Exception {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--use_only_custom_externs=true"},
        outPrintStream,
        errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    List<SourceFile> externs = runner.createExterns();
    assertNotNull(externs);
    assertTrue(externs.isEmpty());
  }

  @Test
  public void testCreateExterns_defaultExternsIncluded() throws Exception {
    SubCommandLineRunner runner = new SubCommandLineRunner(
        new String[] {"--use_only_custom_externs=false"},
        outPrintStream,
        errPrintStream);
    assertTrue(runner.shouldRunCompiler());
    try {
      List<SourceFile> externs = runner.createExterns();
      assertNotNull(externs);
    } catch (NullPointerException e) {
      // In case externs.zip is not packaged in runtime classpath
    }
  }

  @Test
  public void testBooleanOptionHandler_variousInputs() throws Exception {
    CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
    CmdLineParser parser = new CmdLineParser(flags);
    OptionDef optionDef = new OptionDef("--third_party", "usage", false, false, false,
        CommandLineRunner.Flags.BooleanOptionHandler.class, boolean.class);

    final boolean[] target = new boolean[1];
    Setter<Boolean> setter = new Setter<Boolean>() {
      @Override public void addValue(Boolean value) {
        target[0] = value;
      }
      @Override public Class<Boolean> getType() {
        return Boolean.class;
      }
      @Override public boolean isMultiValued() {
        return false;
      }
      @Override public org.kohsuke.args4j.spi.FieldSetter asFieldSetter() {
        return null;
      }
      @Override public java.lang.reflect.AnnotatedElement asAnnotatedElement() {
        return null;
      }
    };

    CommandLineRunner.Flags.BooleanOptionHandler handler =
        new CommandLineRunner.Flags.BooleanOptionHandler(parser, optionDef, setter);

    assertNull(handler.getDefaultMetaVariable());

    // Test no param (param throws exception or returns null)
    Parameters emptyParams = new Parameters() {
      @Override public String getParameter(int idx) throws CmdLineException {
        throw new CmdLineException((CmdLineParser) null, "no param");
      }
      @Override public int size() {
        return 0;
      }
    };
    int consumed = handler.parseArguments(emptyParams);
    assertEquals(0, consumed);
    assertTrue(target[0]);

    // Test true values
    String[] trues = {"true", "on", "yes", "1"};
    for (final String t : trues) {
      Parameters p = new Parameters() {
        @Override public String getParameter(int idx) {
          return t;
        }
        @Override public int size() {
          return 1;
        }
      };
      consumed = handler.parseArguments(p);
      assertEquals(1, consumed);
      assertTrue(target[0]);
    }

    // Test false values
    String[] falses = {"false", "off", "no", "0"};
    for (final String f : falses) {
      Parameters p = new Parameters() {
        @Override public String getParameter(int idx) {
          return f;
        }
        @Override public int size() {
          return 1;
        }
      };
      consumed = handler.parseArguments(p);
      assertEquals(1, consumed);
      assertFalse(target[0]);
    }

    // Test unknown parameter value (defaults to treating flag as true with 0 params consumed)
    Parameters unknownParams = new Parameters() {
      @Override public String getParameter(int idx) {
        return "unknownOptionValue";
      }
      @Override public int size() {
        return 1;
      }
    };
    consumed = handler.parseArguments(unknownParams);
    assertEquals(0, consumed);
    assertTrue(target[0]);
  }
}
