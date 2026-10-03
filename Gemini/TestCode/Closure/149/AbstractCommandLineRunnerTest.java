package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AbstractCommandLineRunnerTest {

  private ByteArrayOutputStream outStream;
  private ByteArrayOutputStream errStream;
  private PrintStream out;
  private PrintStream err;
  private List<File> tempFiles;

  private static class TestableCommandLineRunner
      extends AbstractCommandLineRunner<Compiler, CompilerOptions> {

    private final Compiler testCompiler;
    private final CompilerOptions testOptions;
    int lastExitCode = 0;
    Throwable lastError = null;

    TestableCommandLineRunner(Compiler compiler, CompilerOptions options, PrintStream out, PrintStream err) {
      super(out, err);
      this.testCompiler = compiler;
      this.testOptions = options;
    }

    TestableCommandLineRunner() {
      super();
      this.testCompiler = new Compiler();
      this.testOptions = new CompilerOptions();
    }

    @Override
    protected Compiler createCompiler() {
      return testCompiler;
    }

    @Override
    protected CompilerOptions createOptions() {
      return testOptions;
    }

    @Override
    void exit(RunTimeStats runTimeStats, Throwable error) {
      this.lastError = error;
      if (error instanceof AbstractCommandLineRunner.FlagUsageException) {
        lastExitCode = -1;
      } else if (error != null) {
        lastExitCode = -2;
      } else {
        lastExitCode = 0;
      }
      if (getCommandLineConfig().setComputePhaseOrdering(false) != null) {
        // no-op check
      }
    }
  }

  @Before
  public void setUp() {
    outStream = new ByteArrayOutputStream();
    errStream = new ByteArrayOutputStream();
    out = new PrintStream(outStream);
    err = new PrintStream(errStream);
    tempFiles = new ArrayList<File>();
  }

  @After
  public void tearDown() {
    for (File f : tempFiles) {
      if (f.exists()) {
        f.delete();
      }
    }
  }

  private File createTempFile(String prefix, String suffix, String content) throws IOException {
    File temp = File.createTempFile(prefix, suffix);
    temp.deleteOnExit();
    tempFiles.add(temp);
    if (content != null) {
      FileOutputStream fos = new FileOutputStream(temp);
      fos.write(content.getBytes(Charsets.UTF_8));
      fos.close();
    }
    return temp;
  }

  @Test
  public void testDefaultConstructor() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner();
    Assert.assertNotNull(runner.getCommandLineConfig());
    Assert.assertNotNull(runner.getErrorPrintStream());
    Assert.assertNotNull(runner.getDiagnosticGroups());
    runner.initOptionsFromFlags(new CompilerOptions());
  }

  @Test
  public void testCommandLineConfigSetters() {
    AbstractCommandLineRunner.CommandLineConfig config =
        new AbstractCommandLineRunner.CommandLineConfig();

    config.setPrintTree(true)
          .setComputePhaseOrdering(true)
          .setPrintAst(true)
          .setPrintPassGraph(true)
          .setJscompDevMode(CompilerOptions.DevMode.EVERY_PASS)
          .setLoggingLevel("FINE")
          .setExterns(ImmutableList.of("ext1.js"))
          .setJs(ImmutableList.of("file1.js", "file2.js"))
          .setJsOutputFile("out.js")
          .setModule(ImmutableList.of("mod1:1", "mod2:1:mod1"))
          .setVariableMapInputFile("vars.in")
          .setPropertyMapInputFile("props.in")
          .setVariableMapOutputFile("vars.out")
          .setCreateNameMapFiles(true)
          .setPropertyMapOutputFile("props.out")
          .setCodingConvention(new ClosureCodingConvention())
          .setSummaryDetailLevel(2)
          .setOutputWrapper("(function(){%output%})();")
          .setOutputWrapperMarker("%output%")
          .setModuleWrapper(ImmutableList.of("mod1:%s"))
          .setModuleOutputPathPrefix("mod_prefix_")
          .setCreateSourceMap("map.out")
          .setSourceMapDetailLevel(SourceMap.DetailLevel.DEFAULT)
          .setJscompError(ImmutableList.of("checkTypes"))
          .setJscompWarning(ImmutableList.of("deprecated"))
          .setJscompOff(ImmutableList.of("fileoverviewTags"))
          .setDefine(ImmutableList.of("DEF1=true"))
          .setCharset("UTF-8")
          .setManageClosureDependencies(true)
          .setOutputManifest("manifest.txt");

    Assert.assertNotNull(config);
  }

  @Test
  public void testCreateDefineReplacements_variousTypes() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList(
        "BOOL_TRUE=true",
        "BOOL_FALSE=false",
        "NO_VAL",
        "STR_SINGLE='hello'",
        "STR_DOUBLE=\"world\"",
        "DOUBLE_VAL=3.1415",
        "INT_VAL=42"
    );

    AbstractCommandLineRunner.createDefineReplacements(defs, options);
    Assert.assertNotNull(options);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_invalidSyntax_emptyName() {
    CompilerOptions options = new CompilerOptions();
    AbstractCommandLineRunner.createDefineReplacements(ImmutableList.of("=val"), options);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_invalidSyntax_invalidNumber() {
    CompilerOptions options = new CompilerOptions();
    AbstractCommandLineRunner.createDefineReplacements(ImmutableList.of("NAME=123abc"), options);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_invalidSyntax_quoteMismatch() {
    CompilerOptions options = new CompilerOptions();
    AbstractCommandLineRunner.createDefineReplacements(ImmutableList.of("NAME='test\""), options);
  }

  @Test
  public void testCreateJsModules_success() throws Exception {
    File f1 = createTempFile("f1", ".js", "var a = 1;");
    File f2 = createTempFile("f2", ".js", "var b = 2;");
    File f3 = createTempFile("f3", ".js", "var c = 3;");

    List<String> specs = Lists.newArrayList("m1:1", "m2:2:m1");
    List<String> jsFiles = Lists.newArrayList(f1.getAbsolutePath(), f2.getAbsolutePath(), f3.getAbsolutePath());

    JSModule[] modules = AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    Assert.assertEquals(2, modules.length);
    Assert.assertEquals("m1", modules[0].getName());
    Assert.assertEquals("m2", modules[1].getName());
    Assert.assertEquals(1, modules[0].getInputs().size());
    Assert.assertEquals(2, modules[1].getInputs().size());
    Assert.assertTrue(modules[1].getDependencies().contains(modules[0]));
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_invalidSpecFormat() throws Exception {
    AbstractCommandLineRunner.createJsModules(ImmutableList.of("onlyonepart"), ImmutableList.<String>of());
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_invalidModuleName() throws Exception {
    AbstractCommandLineRunner.createJsModules(ImmutableList.of("123bad:1"), ImmutableList.<String>of());
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_duplicateModule() throws Exception {
    File f1 = createTempFile("f1", ".js", "var a = 1;");
    File f2 = createTempFile("f2", ".js", "var b = 2;");
    List<String> specs = Lists.newArrayList("m1:1", "m1:1");
    List<String> jsFiles = Lists.newArrayList(f1.getAbsolutePath(), f2.getAbsolutePath());
    AbstractCommandLineRunner.createJsModules(specs, jsFiles);
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_invalidFileCount() throws Exception {
    AbstractCommandLineRunner.createJsModules(ImmutableList.of("m1:invalid"), ImmutableList.<String>of());
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_notEnoughJsFiles() throws Exception {
    AbstractCommandLineRunner.createJsModules(ImmutableList.of("m1:2"), ImmutableList.of("only_one.js"));
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_unknownDependency() throws Exception {
    File f1 = createTempFile("f1", ".js", "var a = 1;");
    AbstractCommandLineRunner.createJsModules(ImmutableList.of("m1:1:unknownMod"), ImmutableList.of(f1.getAbsolutePath()));
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_tooManyJsFiles() throws Exception {
    File f1 = createTempFile("f1", ".js", "var a = 1;");
    File f2 = createTempFile("f2", ".js", "var b = 2;");
    AbstractCommandLineRunner.createJsModules(ImmutableList.of("m1:1"), ImmutableList.of(f1.getAbsolutePath(), f2.getAbsolutePath()));
  }

  @Test
  public void testParseModuleWrappers_success() throws Exception {
    JSModule m1 = new JSModule("mod1");
    JSModule m2 = new JSModule("mod2");
    JSModule[] modules = new JSModule[] { m1, m2 };

    List<String> specs = Lists.newArrayList("mod1:(function(){%s})();");
    Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(specs, modules);

    Assert.assertEquals("(function(){%s})();", wrappers.get("mod1"));
    Assert.assertEquals("", wrappers.get("mod2"));
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testParseModuleWrappers_missingColon() throws Exception {
    JSModule[] modules = new JSModule[] { new JSModule("m1") };
    AbstractCommandLineRunner.parseModuleWrappers(ImmutableList.of("m1wrapper"), modules);
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testParseModuleWrappers_unknownModule() throws Exception {
    JSModule[] modules = new JSModule[] { new JSModule("m1") };
    AbstractCommandLineRunner.parseModuleWrappers(ImmutableList.of("unknown:%s"), modules);
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testParseModuleWrappers_missingPlaceholder() throws Exception {
    JSModule[] modules = new JSModule[] { new JSModule("m1") };
    AbstractCommandLineRunner.parseModuleWrappers(ImmutableList.of("m1:prefix_suffix"), modules);
  }

  @Test
  public void testWriteOutput_withWrapper() throws Exception {
    StringBuilder sb = new StringBuilder();
    AbstractCommandLineRunner.writeOutput(sb, null, "var a = 1;", "(function(){%s})();", "%s");
    Assert.assertEquals("(function(){var a = 1;})();\n", sb.toString());
  }

  @Test
  public void testWriteOutput_withoutWrapper() throws Exception {
    StringBuilder sb = new StringBuilder();
    AbstractCommandLineRunner.writeOutput(sb, null, "var a = 1;", "", "%s");
    Assert.assertEquals("var a = 1;\n", sb.toString());
  }

  @Test
  public void testWriteOutput_prefixAndSuffix() throws Exception {
    StringBuilder sb = new StringBuilder();
    AbstractCommandLineRunner.writeOutput(sb, null, "code();", "PRE-%s-POST", "%s");
    Assert.assertEquals("PRE-code();-POST\n", sb.toString());
  }

  @Test
  public void testSetRunOptions_normal() throws Exception {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(new Compiler(), new CompilerOptions(), out, err);
    CompilerOptions options = new CompilerOptions();

    File varIn = createTempFile("vars", ".in", "");
    File propIn = createTempFile("props", ".in", "");

    Map<String, String> varMap = Maps.newHashMap();
    varMap.put("oldVar", "newVar");
    new VariableMap(varMap).save(varIn.getAbsolutePath());

    Map<String, String> propMap = Maps.newHashMap();
    propMap.put("oldProp", "newProp");
    new VariableMap(propMap).save(propIn.getAbsolutePath());

    runner.getCommandLineConfig()
        .setJsOutputFile("out.js")
        .setCreateSourceMap("map.out")
        .setSourceMapDetailLevel(SourceMap.DetailLevel.DEFAULT)
        .setVariableMapInputFile(varIn.getAbsolutePath())
        .setPropertyMapInputFile(propIn.getAbsolutePath())
        .setCharset("UTF-8")
        .setManageClosureDependencies(true)
        .setJscompDevMode(CompilerOptions.DevMode.OFF)
        .setSummaryDetailLevel(3);

    runner.setRunOptions(options);

    Assert.assertEquals("out.js", options.jsOutputFile);
    Assert.assertEquals("map.out", options.sourceMapOutputPath);
    Assert.assertTrue(options.manageClosureDependencies);
    Assert.assertNotNull(options.inputVariableMapSerialized);
    Assert.assertNotNull(options.inputPropertyMapSerialized);
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testSetRunOptions_invalidCharset() throws Exception {
    TestableCommandLineRunner runner = new TestableCommandLineRunner();
    runner.getCommandLineConfig().setCharset("INVALID_CHARSET_NAME_123");
    runner.setRunOptions(new CompilerOptions());
  }

  @Test
  public void testExpandSourceMapPathAndManifest() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner();
    CompilerOptions options = new CompilerOptions();

    Assert.assertNull(runner.expandSourceMapPath(options, null));
    Assert.assertNull(runner.expandManifest(null));

    options.sourceMapOutputPath = "path/to/%outname%.map";
    runner.getCommandLineConfig()
        .setJsOutputFile("bin/app.js")
        .setOutputManifest("manifest/%outname%.MF");

    Assert.assertEquals("path/to/bin/app.js.map", runner.expandSourceMapPath(options, null));
    Assert.assertEquals("manifest/bin/app.js.MF", runner.expandManifest(null));

    JSModule mod = new JSModule("core");
    runner.getCommandLineConfig().setModuleOutputPathPrefix("dist/");
    Assert.assertEquals("path/to/dist/core.js.map", runner.expandSourceMapPath(options, mod));
    Assert.assertEquals("manifest/dist/core.js.MF", runner.expandManifest(mod));
  }

  @Test
  public void testProcessResults_printAst_nullRoot() throws Exception {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(compiler, options, out, err);
    runner.getCommandLineConfig().setPrintAst(true);

    Result result = new Result(new JSError[0], new JSError[0], "", null, null, null, null);
    int code = runner.processResults(result, null, options);
    Assert.assertEquals(1, code);
  }

  @Test
  public void testProcessResults_printTree_nullRoot() throws Exception {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(compiler, options, out, err);
    runner.getCommandLineConfig().setPrintTree(true);

    Result result = new Result(new JSError[0], new JSError[0], "", null, null, null, null);
    int code = runner.processResults(result, null, options);
    Assert.assertEquals(1, code);
    Assert.assertTrue(outStream.toString().contains("Code contains errors"));
  }

  @Test
  public void testProcessResults_printPassGraph_nullRoot() throws Exception {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(compiler, options, out, err);
    runner.getCommandLineConfig().setPrintPassGraph(true);

    Result result = new Result(new JSError[0], new JSError[0], "", null, null, null, null);
    int code = runner.processResults(result, null, options);
    Assert.assertEquals(1, code);
  }

  @Test
  public void testProcessResults_computePhaseOrdering() throws Exception {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(compiler, options, out, err);
    runner.getCommandLineConfig().setComputePhaseOrdering(true);

    Result result = new Result(new JSError[0], new JSError[0], "", null, null, null, null);
    int code = runner.processResults(result, null, options);
    Assert.assertEquals(0, code);
  }

  @Test
  public void testProcessResults_nameMapConflict() throws Exception {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(compiler, options, out, err);

    runner.getCommandLineConfig()
        .setCreateNameMapFiles(true)
        .setVariableMapOutputFile("var_map.out");

    Result result = new Result(new JSError[0], new JSError[0], "", null, null, null, null);
    try {
      runner.processResults(result, null, options);
      Assert.fail("Expected FlagUsageException");
    } catch (AbstractCommandLineRunner.FlagUsageException e) {
      Assert.assertTrue(e.getMessage().contains("create_name_map_files"));
    }
  }

  @Test
  public void testProcessResults_propertyMapConflict() throws Exception {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(compiler, options, out, err);

    runner.getCommandLineConfig()
        .setCreateNameMapFiles(true)
        .setPropertyMapOutputFile("prop_map.out");

    Result result = new Result(new JSError[0], new JSError[0], "", null, null, null, null);
    try {
      runner.processResults(result, null, options);
      Assert.fail("Expected FlagUsageException");
    } catch (AbstractCommandLineRunner.FlagUsageException e) {
      Assert.assertTrue(e.getMessage().contains("create_name_map_files"));
    }
  }

  @Test
  public void testDoRun_singleFileSuccess() throws Exception {
    File src = createTempFile("code", ".js", "function test() { var x = 1; return x; }");
    File outJs = createTempFile("out", ".js", null);

    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(compiler, options, out, err);

    runner.getCommandLineConfig()
        .setJs(ImmutableList.of(src.getAbsolutePath()))
        .setJsOutputFile(outJs.getAbsolutePath());

    int exitCode = runner.doRun();
    Assert.assertEquals(0, exitCode);
    Assert.assertNotNull(runner.getCompiler());
  }

  @Test
  public void testDoRun_moduleCompilationSuccess() throws Exception {
    File src1 = createTempFile("mod1", ".js", "var x = 1;");
    File src2 = createTempFile("mod2", ".js", "var y = 2;");
    File outDir = createTempFile("out_dir", "", null);
    outDir.delete();
    outDir.mkdirs();
    tempFiles.add(outDir);

    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(compiler, options, out, err);

    runner.getCommandLineConfig()
        .setJs(ImmutableList.of(src1.getAbsolutePath(), src2.getAbsolutePath()))
        .setModule(ImmutableList.of("m1:1", "m2:1:m1"))
        .setModuleOutputPathPrefix(outDir.getAbsolutePath() + File.separator + "module_")
        .setModuleWrapper(ImmutableList.of("m1:(function(){%s})();"));

    int exitCode = runner.doRun();
    Assert.assertEquals(0, exitCode);
  }

  @Test
  public void testRun_executionSuccess() throws Exception {
    File src = createTempFile("code", ".js", "var hello = 'world';");
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(compiler, options, out, err);
    runner.getCommandLineConfig().setJs(ImmutableList.of(src.getAbsolutePath()));

    runner.run();
    Assert.assertEquals(0, runner.lastExitCode);
    Assert.assertNull(runner.lastError);
  }

  @Test
  public void testRun_flagUsageExceptionHandled() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(compiler, options, out, err);
    runner.getCommandLineConfig().setCharset("ILLEGAL_CHARSET_FOR_TEST");

    runner.run();
    Assert.assertEquals(-1, runner.lastExitCode);
    Assert.assertNotNull(runner.lastError);
  }

  @Test
  public void testRun_generalExceptionHandled() {
    TestableCommandLineRunner runner = new TestableCommandLineRunner(null, null, out, err) {
      @Override
      protected int doRun() throws IOException {
        throw new NullPointerException("Simulated error");
      }
    };

    runner.run();
    Assert.assertEquals(-2, runner.lastExitCode);
    Assert.assertTrue(runner.lastError instanceof NullPointerException);
  }

  @Test
  public void testPrintModuleGraphManifestTo() throws Exception {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    TestableCommandLineRunner runner = new TestableCommandLineRunner(compiler, options, out, err);

    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);

    CompilerInput in1 = new CompilerInput(JSSourceFile.fromCode("in1.js", "var a;"));
    CompilerInput in2 = new CompilerInput(JSSourceFile.fromCode("in2.js", "var b;"));
    m1.add(in1);
    m2.add(in2);

    JSModuleGraph graph = new JSModuleGraph(new JSModule[] { m1, m2 });
    StringWriter writer = new StringWriter();
    runner.printModuleGraphManifestTo(graph, writer);

    String output = writer.toString();
    Assert.assertTrue(output.contains("{m1}"));
    Assert.assertTrue(output.contains("in1.js"));
    Assert.assertTrue(output.contains("{m2:m1}"));
    Assert.assertTrue(output.contains("in2.js"));
  }

  @Test
  public void testCreateExterns_empty() throws Exception {
    TestableCommandLineRunner runner = new TestableCommandLineRunner();
    List<JSSourceFile> externs = runner.createExterns();
    Assert.assertEquals(1, externs.length > 0 ? externs.size() : 0);
    Assert.assertEquals("/dev/null", externs.get(0).getName());
  }

  @Test
  public void testCreateExterns_nonEmpty() throws Exception {
    File ext = createTempFile("ext", ".js", "var extVar;");
    TestableCommandLineRunner runner = new TestableCommandLineRunner();
    runner.getCommandLineConfig().setExterns(ImmutableList.of(ext.getAbsolutePath()));

    List<JSSourceFile> externs = runner.createExterns();
    Assert.assertEquals(1, externs.size());
    Assert.assertEquals(ext.getAbsolutePath(), externs.get(0).getName());
  }

  @Test
  public void testFlagUsageException() {
    AbstractCommandLineRunner.FlagUsageException ex =
        new AbstractCommandLineRunner.FlagUsageException("test error message");
    Assert.assertEquals("test error message", ex.getMessage());
  }
}
