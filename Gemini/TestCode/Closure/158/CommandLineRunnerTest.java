package com.google.javascript.jscomp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CommandLineRunnerTest {

    private ByteArrayOutputStream outStream;
    private ByteArrayOutputStream errStream;
    private PrintStream outPrintStream;
    private PrintStream errPrintStream;
    private List<File> tempFiles;

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
        public List<JSSourceFile> createExterns() throws FlagUsageException, IOException {
            return super.createExterns();
        }
    }

    @Before
    public void setUp() {
        outStream = new ByteArrayOutputStream();
        errStream = new ByteArrayOutputStream();
        outPrintStream = new PrintStream(outStream);
        errPrintStream = new PrintStream(errStream);
        tempFiles = new ArrayList<File>();
    }

    @After
    public void tearDown() {
        for (File file : tempFiles) {
            if (file.exists()) {
                file.delete();
            }
        }
    }

    private File createTempFile(String prefix, String suffix, String content) throws IOException {
        File temp = File.createTempFile(prefix, suffix);
        tempFiles.add(temp);
        FileOutputStream fos = new FileOutputStream(temp);
        try {
            fos.write(content.getBytes("UTF-8"));
        } finally {
            fos.close();
        }
        return temp;
    }

    @Test
    public void testConstructor_emptyArgs_shouldBeValid() {
        String[] args = new String[0];
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_singleArgConstructor() {
        String[] args = new String[] { "--language_in=ECMASCRIPT3" };
        CommandLineRunner runner = new CommandLineRunner(args);
        Assert.assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testHelpFlag_setsShouldRunCompilerFalse() {
        String[] args = new String[] { "--help" };
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertFalse(runner.shouldRunCompiler());
        Assert.assertTrue(errStream.toString().contains("--help"));
    }

    @Test
    public void testVersionFlag_printsVersionInfo() {
        String[] args = new String[] { "--version" };
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertTrue(runner.shouldRunCompiler());
        String errOutput = errStream.toString();
        Assert.assertTrue(errOutput.contains("Closure Compiler"));
        Assert.assertTrue(errOutput.contains("Version:"));
    }

    @Test
    public void testInvalidFlag_setsShouldRunCompilerFalse() {
        String[] args = new String[] { "--non_existent_flag_xyz" };
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessArgs_withQuotesAndEquals() {
        String[] args = new String[] {
            "--js_output_file=\"test_out.js\"",
            "--output_wrapper='(function(){%output%})();'",
            "--charset=UTF-8",
            "plain_arg.js"
        };
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertTrue(runner.shouldRunCompiler());
        Assert.assertEquals("test_out.js", runner.getCommandLineConfig().jsOutputFile);
        Assert.assertEquals("(function(){%output%})();", runner.getCommandLineConfig().outputWrapper);
        Assert.assertEquals("UTF-8", runner.getCommandLineConfig().charset);
    }

    @Test
    public void testFlagFile_validFile() throws IOException {
        File flagFile = createTempFile("flagfile", ".txt", "--warning_level=VERBOSE --compilation_level=ADVANCED_OPTIMIZATIONS");
        String[] args = new String[] { "--flagfile=" + flagFile.getAbsolutePath() };
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertTrue(runner.shouldRunCompiler());
        CompilerOptions options = runner.createOptions();
        Assert.assertTrue(options.checkGlobalThisLevel.isOn());
    }

    @Test
    public void testFlagFile_recursiveFlagFile_causesError() throws IOException {
        File flagFile = createTempFile("flagfile", ".txt", "--flagfile=other.txt");
        String[] args = new String[] { "--flagfile=" + flagFile.getAbsolutePath() };
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertFalse(runner.shouldRunCompiler());
        Assert.assertTrue(errStream.toString().contains("ERROR - Arguments in the file cannot contain --flagfile option."));
    }

    @Test
    public void testFlagFile_nonExistentFile_causesIOException() {
        String[] args = new String[] { "--flagfile=non_existent_file_path_123456.txt" };
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertFalse(runner.shouldRunCompiler());
        Assert.assertTrue(errStream.toString().contains("read error"));
    }

    @Test
    public void testCreateOptions_allCompilationAndWarningLevels() {
        String[] args = new String[] {
            "--compilation_level=ADVANCED_OPTIMIZATIONS",
            "--warning_level=QUIET",
            "--debug=true",
            "--generate_exports=true",
            "--formatting=PRETTY_PRINT",
            "--formatting=PRINT_INPUT_DELIMITER",
            "--process_closure_primitives=false"
        };
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertTrue(runner.shouldRunCompiler());
        CompilerOptions options = runner.createOptions();

        Assert.assertTrue(options.prettyPrint);
        Assert.assertTrue(options.printInputDelimiter);
        Assert.assertFalse(options.closurePass);
    }

    @Test
    public void testCreateOptions_whitespaceOnlyAndDefaultWarning() {
        String[] args = new String[] {
            "--compilation_level=WHITESPACE_ONLY",
            "--warning_level=DEFAULT",
            "--debug=false"
        };
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertTrue(runner.shouldRunCompiler());
        CompilerOptions options = runner.createOptions();
        Assert.assertNotNull(options);
    }

    @Test
    public void testCommandLineConfigMapping() {
        String[] args = new String[] {
            "--print_tree=true",
            "--compute_phase_ordering=true",
            "--print_ast=true",
            "--print_pass_graph=true",
            "--jscomp_dev_mode=START",
            "--logging_level=INFO",
            "--externs=ext1.js",
            "--externs=ext2.js",
            "--js=file1.js",
            "--js=file2.js",
            "--js_output_file=out.js",
            "--module=mod1:1",
            "--variable_map_input_file=var_in.map",
            "--property_map_input_file=prop_in.map",
            "--variable_map_output_file=var_out.map",
            "--create_name_map_files=true",
            "--property_map_output_file=prop_out.map",
            "--third_party=true",
            "--summary_detail_level=3",
            "--output_wrapper=wrap_%output%",
            "--module_wrapper=mod1:wrap_%s",
            "--module_output_path_prefix=prefix_",
            "--create_source_map=map.out",
            "--jscomp_error=checkVars",
            "--jscomp_warning=undefinedVars",
            "--jscomp_off=checkTypes",
            "--define=FLAG_A=true",
            "--D", "FLAG_B=123",
            "-D", "FLAG_C='test'",
            "--charset=UTF-8",
            "--manage_closure_dependencies=true",
            "--closure_entry_point=entry.point",
            "--output_manifest=manifest.out",
            "--accept_const_keyword=true",
            "--language_in=ECMASCRIPT5"
        };

        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertTrue(runner.shouldRunCompiler());

        AbstractCommandLineRunner.CommandLineConfig config = runner.getCommandLineConfig();
        Assert.assertTrue(config.printTree);
        Assert.assertTrue(config.computePhaseOrdering);
        Assert.assertTrue(config.printAst);
        Assert.assertTrue(config.printPassGraph);
        Assert.assertEquals(CompilerOptions.DevMode.START, config.jscompDevMode);
        Assert.assertEquals("INFO", config.loggingLevel);
        Assert.assertEquals(2, config.externs.size());
        Assert.assertEquals(2, config.js.size());
        Assert.assertEquals("out.js", config.jsOutputFile);
        Assert.assertEquals(1, config.module.size());
        Assert.assertEquals("var_in.map", config.variableMapInputFile);
        Assert.assertEquals("prop_in.map", config.propertyMapInputFile);
        Assert.assertEquals("var_out.map", config.variableMapOutputFile);
        Assert.assertTrue(config.createNameMapFiles);
        Assert.assertEquals("prop_out.map", config.propertyMapOutputFile);
        Assert.assertTrue(config.codingConvention instanceof DefaultCodingConvention);
        Assert.assertEquals(3, config.summaryDetailLevel);
        Assert.assertEquals("wrap_%output%", config.outputWrapper);
        Assert.assertEquals(1, config.moduleWrapper.size());
        Assert.assertEquals("prefix_", config.moduleOutputPathPrefix);
        Assert.assertEquals("map.out", config.createSourceMap);
        Assert.assertEquals(1, config.jscompError.size());
        Assert.assertEquals(1, config.jscompWarning.size());
        Assert.assertEquals(1, config.jscompOff.size());
        Assert.assertEquals(3, config.define.size());
        Assert.assertEquals("UTF-8", config.charset);
        Assert.assertTrue(config.manageClosureDependencies);
        Assert.assertEquals(1, config.closureEntryPoint.size());
        Assert.assertEquals("manifest.out", config.outputManifest);
        Assert.assertTrue(config.acceptConstKeyword);
        Assert.assertEquals("ECMASCRIPT5", config.languageIn);
    }

    @Test
    public void testCodingConvention_closureDefault() {
        String[] args = new String[] { "--third_party=false" };
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Assert.assertTrue(runner.getCommandLineConfig().codingConvention instanceof ClosureCodingConvention);
    }

    @Test
    public void testCreateCompiler() {
        String[] args = new String[0];
        SubCommandLineRunner runner = new SubCommandLineRunner(args, outPrintStream, errPrintStream);
        Compiler compiler = runner.createCompiler();
        Assert.assertNotNull(compiler);
        Assert.assertEquals(errPrintStream, runner.getErrorPrintStream());
    }

    @Test
    public void testCreateExterns_defaultAndCustom() throws Exception {
        String[] argsWithDefault = new String[0];
        SubCommandLineRunner runnerWithDefault = new SubCommandLineRunner(argsWithDefault, outPrintStream, errPrintStream);
        List<JSSourceFile> defaultExterns = runnerWithDefault.createExterns();
        Assert.assertNotNull(defaultExterns);
        Assert.assertTrue(defaultExterns.size() > 0);

        String[] argsCustomOnly = new String[] { "--use_only_custom_externs=true" };
        SubCommandLineRunner runnerCustomOnly = new SubCommandLineRunner(argsCustomOnly, outPrintStream, errPrintStream);
        List<JSSourceFile> customExterns = runnerCustomOnly.createExterns();
        Assert.assertNotNull(customExterns);
        Assert.assertEquals(0, customExterns.size());
    }

    @Test
    public void testGetDefaultExterns() throws IOException {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        Assert.assertNotNull(externs);
        Assert.assertFalse(externs.isEmpty());
        Assert.assertTrue(externs.get(0).getName().contains("es3.js"));
    }

    @Test
    public void testBooleanOptionHandler_parsingVariations() throws Exception {
        final List<Boolean> assigned = new ArrayList<Boolean>();
        Setter<Boolean> setter = new Setter<Boolean>() {
            @Override
            public void addValue(Boolean value) {
                assigned.add(value);
            }
            @Override
            public Class<Boolean> getType() {
                return Boolean.class;
            }
            @Override
            public boolean isMultiValued() {
                return false;
            }
        };

        CmdLineParser parser = new CmdLineParser(new Object());
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(parser, (OptionDef) null, setter);

        Assert.assertNull(handler.getDefaultMetaVariable());

        // Parameter throwing CmdLineException / null param (no args passed)
        Parameters emptyParams = new Parameters() {
            @Override
            public String getParameter(int idx) throws CmdLineException {
                throw new CmdLineException(parser, "No param");
            }
            @Override
            public int size() {
                return 0;
            }
        };
        int consumed = handler.parseArguments(emptyParams);
        Assert.assertEquals(0, consumed);
        Assert.assertEquals(Boolean.TRUE, assigned.get(assigned.size() - 1));

        // Truthy parameters
        String[] trues = new String[] { "true", "on", "yes", "1", "TRUE", "ON" };
        for (final String val : trues) {
            Parameters params = new Parameters() {
                @Override
                public String getParameter(int idx) {
                    return val;
                }
                @Override
                public int size() {
                    return 1;
                }
            };
            consumed = handler.parseArguments(params);
            Assert.assertEquals(1, consumed);
            Assert.assertEquals(Boolean.TRUE, assigned.get(assigned.size() - 1));
        }

        // Falsy parameters
        String[] falses = new String[] { "false", "off", "no", "0", "FALSE", "OFF" };
        for (final String val : falses) {
            Parameters params = new Parameters() {
                @Override
                public String getParameter(int idx) {
                    return val;
                }
                @Override
                public int size() {
                    return 1;
                }
            };
            consumed = handler.parseArguments(params);
            Assert.assertEquals(1, consumed);
            Assert.assertEquals(Boolean.FALSE, assigned.get(assigned.size() - 1));
        }

        // Other non-boolean string parameter (interpreted as next flag/arg)
        Parameters otherParams = new Parameters() {
            @Override
            public String getParameter(int idx) {
                return "--next_flag";
            }
            @Override
            public int size() {
                return 1;
            }
        };
        consumed = handler.parseArguments(otherParams);
        Assert.assertEquals(0, consumed);
        Assert.assertEquals(Boolean.TRUE, assigned.get(assigned.size() - 1));
    }
}
