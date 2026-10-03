package com.google.javascript.jscomp;

import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AbstractCommandLineRunnerTest {

  private static class TestCommandLineRunner
      extends AbstractCommandLineRunner<Compiler, CompilerOptions> {
    private Compiler lastCompiler;
    private CompilerOptions lastOptions;

    TestCommandLineRunner() {
      super();
    }

    TestCommandLineRunner(PrintStream out, PrintStream err) {
      super(out, err);
    }

    @Override
    protected Compiler createCompiler() {
      lastCompiler = new Compiler(getErrorPrintStream());
      return lastCompiler;
    }

    @Override
    protected CompilerOptions createOptions() {
      lastOptions = new CompilerOptions();
      return lastOptions;
    }
  }

  private ByteArrayOutputStream outStream;
  private ByteArrayOutputStream errStream;
  private PrintStream out;
  private PrintStream err;
  private TestCommandLineRunner runner;

  @Before
  public void setUp() {
    outStream = new ByteArrayOutputStream();
    errStream = new ByteArrayOutputStream();
    out = new PrintStream(outStream);
    err = new PrintStream(errStream);
    runner = new TestCommandLineRunner(out, err);
  }

  @Test
  public void testDefaultConstructor_initializesCorrectly() {
    TestCommandLineRunner defaultRunner = new TestCommandLineRunner();
    Assert.assertNotNull(defaultRunner.getCommandLineConfig());
    Assert.assertNotNull(defaultRunner.getErrorPrintStream());
    Assert.assertFalse(defaultRunner.isInTestMode());
    Assert.assertNotNull(defaultRunner.getDiagnosticGroups());
  }

  @Test
  public void testEnableTestMode_validInputs_setsTestMode() {
    Supplier<List<JSSourceFile>> externsSupplier = new Supplier<List<JSSourceFile>>() {
      @Override
      public List<JSSourceFile> get() {
        return ImmutableList.of();
      }
    };
    Supplier<List<JSSourceFile>> inputsSupplier = new Supplier<List<JSSourceFile>>() {
      @Override
      public List<JSSourceFile> get() {
        return ImmutableList.of(JSSourceFile.fromCode("in.js", "var x = 1;"));
      }
    };
    Function<Integer, Boolean> receiver = new Function<Integer, Boolean>() {
      @Override
      public Boolean apply(Integer input) {
        return true;
      }
    };

    runner.enableTestMode(externsSupplier, inputsSupplier, null, receiver);
    Assert.assertTrue(runner.isInTestMode());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEnableTestMode_bothInputsAndModulesNonNull_throwsException() {
    Supplier<List<JSSourceFile>> dummyList = new Supplier<List<JSSourceFile>>() {
      @Override
      public List<JSSourceFile> get() {
        return ImmutableList.of();
      }
    };
    Supplier<List<JSModule>> dummyModules = new Supplier<List<JSModule>>() {
      @Override
      public List<JSModule> get() {
        return ImmutableList.of();
      }
    };
    runner.enableTestMode(dummyList, dummyList, dummyModules, null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEnableTestMode_bothInputsAndModulesNull_throwsException() {
    Supplier<List<JSSourceFile>> dummyList = new Supplier<List<JSSourceFile>>() {
      @Override
      public List<JSSourceFile> get() {
        return ImmutableList.of();
      }
    };
    runner.enableTestMode(dummyList, null, null, null);
  }

  @Test
  public void testFlagUsageException_constructorAndMessage() {
    AbstractCommandLineRunner.FlagUsageException ex =
        new AbstractCommandLineRunner.FlagUsageException("test error");
    Assert.assertEquals("test error", ex.getMessage());
  }

  @Test
  public void testCommandLineConfig_fluentSetters() {
    AbstractCommandLineRunner.CommandLineConfig config = runner.getCommandLineConfig();
    CodingConvention customConvention = new ClosureCodingConvention();

    config.setPrintTree(true)
        .setComputePhaseOrdering(true)
        .setPrintAst(true)
        .setPrintPassGraph(true)
        .setJscompDevMode(CompilerOptions.DevMode.START_AND_END)
        .setLoggingLevel("INFO")
        .setExterns(ImmutableList.of("extern1.js"))
        .setJs(ImmutableList.of("file1.js"))
        .setJsOutputFile("out.js")
        .setModule(ImmutableList.of("mod1:1"))
        .setVariableMapInputFile("varMapIn.txt")
        .setPropertyMapInputFile("propMapIn.txt")
        .setVariableMapOutputFile("varMapOut.txt")
        .setCreateNameMapFiles(true)
        .setPropertyMapOutputFile("propMapOut.txt")
        .setCodingConvention(customConvention)
        .setSummaryDetailLevel(2)
        .setOutputWrapper("(function(){%output%})();")
        .setModuleWrapper(ImmutableList.of("mod1:%s"))
        .setModuleOutputPathPrefix("mod_prefix_")
        .setCreateSourceMap("map.out")
        .setSourceMapDetailLevel(SourceMap.DetailLevel.SYMBOLS)
        .setSourceMapFormat(SourceMap.Format.V3)
        .setJscompError(ImmutableList.of("checkVars"))
        .setJscompWarning(ImmutableList.of("undefinedVars"))
        .setJscompOff(ImmutableList.of("deprecated"))
        .setDefine(ImmutableList.of("DEF=1"))
        .setTweak(ImmutableList.of("TWK=2"))
        .setTweakProcessing(CompilerOptions.TweakProcessing.CHECK)
        .setCharset("UTF-8")
        .setManageClosureDependencies(true)
        .setClosureEntryPoints(ImmutableList.of("goog.dom"))
        .setOutputManifest("manifest.txt")
        .setAcceptConstKeyword(true)
        .setLanguageIn("ECMASCRIPT5");

    Assert.assertNotNull(config);
  }

  @Test
  public void testCreateDefineOrTweakReplacements_allTypesValid() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList(
        "FLAG_BOOL_TRUE=true",
        "FLAG_BOOL_FALSE=false",
        "FLAG_IMPLICIT_TRUE",
        "FLAG_STRING_SINGLE='hello'",
        "FLAG_STRING_DOUBLE=\"world\"",
        "FLAG_NUMBER=123.45"
    );

    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, false);
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, true);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineOrTweakReplacements_invalidDefineFormat_throwsException() {
    CompilerOptions options = new CompilerOptions();
    AbstractCommandLineRunner.createDefineOrTweakReplacements(
        ImmutableList.of("INVALID_DEF=unquoted_string"), options, false);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineOrTweakReplacements_invalidTweakFormat_throwsException() {
    CompilerOptions options = new CompilerOptions();
    AbstractCommandLineRunner.createDefineOrTweakReplacements(
        ImmutableList.of("INVALID_TWK=unquoted_string"), options, true);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineOrTweakReplacements_emptyEntry_throwsException() {
    CompilerOptions options = new CompilerOptions();
    AbstractCommandLineRunner.createDefineOrTweakReplacements(
        ImmutableList.of(""), options, false);
  }

  @Test
  public void testCheckModuleName_validAndInvalidNames() throws Exception {
    runner.checkModuleName("validModuleName123");
    runner.checkModuleName("$valid_name");

    try {
      runner.checkModuleName("invalid-module-name");
      Assert.fail("Expected FlagUsageException for '-' in module name");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }

    try {
      runner.checkModuleName("123invalidStart");
      Assert.fail("Expected FlagUsageException for digit start");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }
  }

  @Test
  public void testParseModuleWrappers_validAndInvalid() throws Exception {
    JSModule m1 = new JSModule("mod1");
    JSModule m2 = new JSModule("mod2");
    List<JSModule> modules = ImmutableList.of(m1, m2);

    List<String> specs = ImmutableList.of("mod1:(function(){%s})();");
    Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(specs, modules);

    Assert.assertEquals("(function(){%s})();", wrappers.get("mod1"));
    Assert.assertEquals("", wrappers.get("mod2"));

    try {
      AbstractCommandLineRunner.parseModuleWrappers(ImmutableList.of("noColonWrapper"), modules);
      Assert.fail("Expected FlagUsageException for missing colon");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }

    try {
      AbstractCommandLineRunner.parseModuleWrappers(ImmutableList.of("unknownMod:%s"), modules);
      Assert.fail("Expected FlagUsageException for unknown module");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }

    try {
      AbstractCommandLineRunner.parseModuleWrappers(ImmutableList.of("mod1:noPlaceholder"), modules);
      Assert.fail("Expected FlagUsageException for missing %s");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }
  }

  @Test
  public void testWriteOutput_withAndWithoutWrapper() throws Exception {
    StringBuilder outBuilder = new StringBuilder();

    AbstractCommandLineRunner.writeOutput(outBuilder, null, "var a = 1;", "", "%output%");
    Assert.assertEquals("var a = 1;\n", outBuilder.toString());

    outBuilder.setLength(0);
    AbstractCommandLineRunner.writeOutput(
        outBuilder, null, "var a = 1;", "prefix(%output%)suffix;", "%output%");
    Assert.assertEquals("prefix(var a = 1;)suffix;\n", outBuilder.toString());

    outBuilder.setLength(0);
    AbstractCommandLineRunner.writeOutput(
        outBuilder, null, "var a = 1;", "%output%tail", "%output%");
    Assert.assertEquals("var a = 1;tail\n", outBuilder.toString());
  }

  @Test
  public void testCreateInputs_normalFilesAndStdIn() throws Exception {
    File tempFile = File.createTempFile("closure_test", ".js");
    tempFile.deleteOnExit();

    List<String> fileList = Lists.newArrayList(tempFile.getAbsolutePath(), "-");
    List<JSSourceFile> inputs = runner.createInputs(fileList, true);
    Assert.assertEquals(2, inputs.size());
    Assert.assertEquals(tempFile.getAbsolutePath(), inputs.get(0).getName());
    Assert.assertEquals("stdin", inputs.get(1).getName());

    try {
      runner.createInputs(ImmutableList.of("-"), false);
      Assert.fail("Expected FlagUsageException for stdin when allowStdIn is false");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }

    try {
      runner.createInputs(ImmutableList.of("-", "-"), true);
      Assert.fail("Expected FlagUsageException for multiple stdins");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }
  }

  @Test
  public void testCreateJsModules_validAndInvalidSpecs() throws Exception {
    List<String> specs = ImmutableList.of("m1:1", "m2:1:m1");
    List<String> files = ImmutableList.of("f1.js", "f2.js");

    List<JSModule> modules = runner.createJsModules(specs, files);
    Assert.assertEquals(2, modules.size());
    Assert.assertEquals("m1", modules.get(0).getName());
    Assert.assertEquals("m2", modules.get(1).getName());
    Assert.assertEquals(1, modules.get(1).getDependencies().size());

    try {
      runner.createJsModules(ImmutableList.of("invalid_spec_without_count"), files);
      Assert.fail("Expected FlagUsageException for invalid spec format");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }

    try {
      runner.createJsModules(ImmutableList.of("m1:notAnInt"), files);
      Assert.fail("Expected FlagUsageException for invalid integer in spec");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }

    try {
      runner.createJsModules(ImmutableList.of("m1:5"), files);
      Assert.fail("Expected FlagUsageException for not enough js files");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }

    try {
      runner.createJsModules(ImmutableList.of("m1:1"), files);
      Assert.fail("Expected FlagUsageException for too many js files");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }

    try {
      runner.createJsModules(ImmutableList.of("m1:1", "m1:1"), files);
      Assert.fail("Expected FlagUsageException for duplicate module name");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }

    try {
      runner.createJsModules(ImmutableList.of("m1:1:unknownDep", "m2:1"), files);
      Assert.fail("Expected FlagUsageException for unknown module dependency");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }
  }

  @Test
  public void testSetRunOptions_languageModesAndOptions() throws Exception {
    CompilerOptions options = new CompilerOptions();

    runner.getCommandLineConfig().setLanguageIn("ECMASCRIPT5");
    runner.setRunOptions(options);
    Assert.assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT5, options.getLanguageIn());

    runner.getCommandLineConfig().setLanguageIn("ES5_STRICT");
    runner.setRunOptions(options);
    Assert.assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT5, options.getLanguageIn());

    runner.getCommandLineConfig().setLanguageIn("ECMASCRIPT3");
    runner.setRunOptions(options);
    Assert.assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, options.getLanguageIn());

    runner.getCommandLineConfig().setLanguageIn("ES3");
    runner.setRunOptions(options);
    Assert.assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, options.getLanguageIn());

    runner.getCommandLineConfig().setLanguageIn("UNKNOWN_LANG");
    try {
      runner.setRunOptions(options);
      Assert.fail("Expected FlagUsageException for unknown language");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }

    runner.getCommandLineConfig().setLanguageIn("");
    runner.getCommandLineConfig().setCharset("INVALID_CHARSET_NAME_123");
    try {
      runner.setRunOptions(options);
      Assert.fail("Expected FlagUsageException for unsupported charset");
    } catch (AbstractCommandLineRunner.FlagUsageException expected) {
    }
  }

  @Test
  public void testExpandPaths_sourceMapAndManifest() {
    CompilerOptions options = new CompilerOptions();
    options.sourceMapOutputPath = "%outname%.map";
    runner.getCommandLineConfig().setOutputManifest("%outname%.manifest");
    runner.getCommandLineConfig().setJsOutputFile("bundle.js");

    JSModule module = new JSModule("modA");
    runner.getCommandLineConfig().setModuleOutputPathPrefix("dist/");

    String expandedMap = runner.expandSourceMapPath(options, null);
    Assert.assertEquals("bundle.js.map", expandedMap);

    String expandedModMap = runner.expandSourceMapPath(options, module);
    Assert.assertEquals("dist/modA.js.map", expandedModMap);

    String expandedManifest = runner.expandManifest(null);
    Assert.assertEquals("bundle.js.manifest", expandedManifest);

    String expandedModManifest = runner.expandManifest(module);
    Assert.assertEquals("dist/modA.js.manifest", expandedModManifest);

    options.sourceMapOutputPath = "";
    Assert.assertNull(runner.expandSourceMapPath(options, null));

    runner.getCommandLineConfig().setOutputManifest("");
    Assert.assertNull(runner.expandManifest(null));
  }

  @Test
  public void testPrintModuleGraphManifestTo_printsCorrectFormat() throws IOException {
    JSModule m1 = new JSModule("m1");
    CompilerInput input1 = new CompilerInput(JSSourceFile.fromCode("input1.js", "var a=1;"));
    m1.add(input1);

    JSModule m2 = new JSModule("m2");
    CompilerInput input2 = new CompilerInput(JSSourceFile.fromCode("input2.js", "var b=2;"));
    m2.add(input2);
    m2.addDependency(m1);

    JSModuleGraph graph = new JSModuleGraph(new JSModule[]{m1, m2});
    StringWriter writer = new StringWriter();
    runner.printModuleGraphManifestTo(graph, writer);

    String result = writer.toString();
    Assert.assertTrue(result.contains("{m1}\ninput1.js"));
    Assert.assertTrue(result.contains("{m2:m1}\ninput2.js"));
  }

  @Test
  public void testRun_inTestMode_successfulCompilation() {
    final int[] exitCode = new int[]{-999};
    runner.enableTestMode(
        new Supplier<List<JSSourceFile>>() {
          @Override
          public List<JSSourceFile> get() {
            return ImmutableList.of();
          }
        },
        new Supplier<List<JSSourceFile>>() {
          @Override
          public List<JSSourceFile> get() {
            return ImmutableList.of(JSSourceFile.fromCode("test.js", "var x = 10;"));
          }
        },
        null,
        new Function<Integer, Boolean>() {
          @Override
          public Boolean apply(Integer code) {
            exitCode[0] = code;
            return true;
          }
        });

    runner.run();
    Assert.assertEquals(0, exitCode[0]);
    Assert.assertNotNull(runner.getCompiler());
  }

  @Test
  public void testRun_inTestMode_withModules() {
    final int[] exitCode = new int[]{-999};
    final JSModule module = new JSModule("mod1");
    module.add(JSSourceFile.fromCode("m1.js", "var a = 1;"));

    runner.getCommandLineConfig().setModule(ImmutableList.of("mod1:1"));
    runner.enableTestMode(
        new Supplier<List<JSSourceFile>>() {
          @Override
          public List<JSSourceFile> get() {
            return ImmutableList.of();
          }
        },
        null,
        new Supplier<List<JSModule>>() {
          @Override
          public List<JSModule> get() {
            return ImmutableList.of(module);
          }
        },
        new Function<Integer, Boolean>() {
          @Override
          public Boolean apply(Integer code) {
            exitCode[0] = code;
            return true;
          }
        });

    runner.run();
    Assert.assertEquals(0, exitCode[0]);
  }

  @Test
  public void testRun_inTestMode_flagUsageExceptionHandled() {
    final int[] exitCode = new int[]{0};
    runner.getCommandLineConfig().setLanguageIn("UNSUPPORTED_LANGUAGE");

    runner.enableTestMode(
        new Supplier<List<JSSourceFile>>() {
          @Override
          public List<JSSourceFile> get() {
            return ImmutableList.of();
          }
        },
        new Supplier<List<JSSourceFile>>() {
          @Override
          public List<JSSourceFile> get() {
            return ImmutableList.of(JSSourceFile.fromCode("test.js", "var x = 1;"));
          }
        },
        null,
        new Function<Integer, Boolean>() {
          @Override
          public Boolean apply(Integer code) {
            exitCode[0] = code;
            return true;
          }
        });

    runner.run();
    Assert.assertEquals(-1, exitCode[0]);
  }

  @Test
  public void testFilenameToOutputStream_andInitOptionsFromFlags() throws Exception {
    File temp = File.createTempFile("test_output", ".txt");
    temp.deleteOnExit();

    OutputStream stream = runner.filenameToOutputStream(temp.getAbsolutePath());
    Assert.assertNotNull(stream);
    stream.close();

    Assert.assertNull(runner.filenameToOutputStream(null));

    CompilerOptions options = new CompilerOptions();
    runner.initOptionsFromFlags(options);
  }

  @Test
  public void testSetRunOptions_variableAndPropertyMaps() throws Exception {
    File varMapFile = File.createTempFile("varMap", ".txt");
    varMapFile.deleteOnExit();
    FileOutputStream fos = new FileOutputStream(varMapFile);
    fos.write("a:b\n".getBytes());
    fos.close();

    File propMapFile = File.createTempFile("propMap", ".txt");
    propMapFile.deleteOnExit();
    FileOutputStream fos2 = new FileOutputStream(propMapFile);
    fos2.write("c:d\n".getBytes());
    fos2.close();

    runner.getCommandLineConfig().setVariableMapInputFile(varMapFile.getAbsolutePath());
    runner.getCommandLineConfig().setPropertyMapInputFile(propMapFile.getAbsolutePath());
    runner.getCommandLineConfig().setJsOutputFile("out.js");
    runner.getCommandLineConfig().setCreateSourceMap("map.out");

    CompilerOptions options = new CompilerOptions();
    runner.setRunOptions(options);

    Assert.assertNotNull(options.inputVariableMapSerialized);
    Assert.assertNotNull(options.inputPropertyMapSerialized);
    Assert.assertEquals("out.js", options.jsOutputFile);
    Assert.assertEquals("map.out", options.sourceMapOutputPath);
  }
}
