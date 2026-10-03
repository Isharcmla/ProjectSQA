package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public class AbstractCommandLineRunnerTest {

  @Rule
  public TemporaryFolder tmpFolder = new TemporaryFolder();

  private ByteArrayOutputStream outContent;
  private ByteArrayOutputStream errContent;
  private PrintStream outStream;
  private PrintStream errStream;

  private static class TestCommandLineRunner
      extends AbstractCommandLineRunner<Compiler, CompilerOptions> {

    TestCommandLineRunner(PrintStream out, PrintStream err) {
      super(out, err);
    }

    TestCommandLineRunner() {
      super();
    }

    @Override
    protected Compiler createCompiler() {
      return new Compiler(getErrorPrintStream());
    }

    @Override
    protected CompilerOptions createOptions() {
      CompilerOptions options = new CompilerOptions();
      initOptionsFromFlags(options);
      return options;
    }
  }

  @Before
  public void setUp() {
    outContent = new ByteArrayOutputStream();
    errContent = new ByteArrayOutputStream();
    outStream = new PrintStream(outContent);
    errStream = new PrintStream(errContent);
  }

  @After
  public void tearDown() {
    outStream.close();
    errStream.close();
  }

  @Test
  public void testConstructor_defaultAndCustomStreams() {
    TestCommandLineRunner defaultRunner = new TestCommandLineRunner();
    Assert.assertNotNull(defaultRunner.getCommandLineConfig());
    Assert.assertNotNull(defaultRunner.getErrorPrintStream());

    TestCommandLineRunner customRunner = new TestCommandLineRunner(outStream, errStream);
    Assert.assertSame(errStream, customRunner.getErrorPrintStream());
    Assert.assertNotNull(customRunner.getDiagnosticGroups());
  }

  @Test
  public void testCommandLineConfig_fluentSetters() {
    AbstractCommandLineRunner.CommandLineConfig config =
        new AbstractCommandLineRunner.CommandLineConfig();

    CodingConvention convention = new ClosureCodingConvention();
    List<String> list = Lists.newArrayList("a", "b");

    Assert.assertSame(config, config.setPrintTree(true));
    Assert.assertSame(config, config.setComputePhaseOrdering(true));
    Assert.assertSame(config, config.setPrintAst(true));
    Assert.assertSame(config, config.setPrintPassGraph(true));
    Assert.assertSame(config, config.setJscompDevMode(CompilerOptions.DevMode.EVERY_PASS));
    Assert.assertSame(config, config.setLoggingLevel(Level.FINE.getName()));
    Assert.assertSame(config, config.setExterns(list));
    Assert.assertSame(config, config.setJs(list));
    Assert.assertSame(config, config.setJsOutputFile("out.js"));
    Assert.assertSame(config, config.setModule(list));
    Assert.assertSame(config, config.setVariableMapInputFile("var_in.txt"));
    Assert.assertSame(config, config.setPropertyMapInputFile("prop_in.txt"));
    Assert.assertSame(config, config.setVariableMapOutputFile("var_out.txt"));
    Assert.assertSame(config, config.setCreateNameMapFiles(true));
    Assert.assertSame(config, config.setPropertyMapOutputFile("prop_out.txt"));
    Assert.assertSame(config, config.setCodingConvention(convention));
    Assert.assertSame(config, config.setSummaryDetailLevel(2));
    Assert.assertSame(config, config.setOutputWrapper("(function(){%output%})();"));
    Assert.assertSame(config, config.setOutputWrapperMarker("%output%"));
    Assert.assertSame(config, config.setModuleWrapper(list));
    Assert.assertSame(config, config.setModuleOutputPathPrefix("mod_prefix_"));
    Assert.assertSame(config, config.setCreateSourceMap("map.out"));
    Assert.assertSame(config, config.setJscompError(list));
    Assert.assertSame(config, config.setJscompWarning(list));
    Assert.assertSame(config, config.setJscompOff(list));
    Assert.assertSame(config, config.setDefine(list));
    Assert.assertSame(config, config.setCharset("UTF-8"));
  }

  @Test
  public void testFlagUsageException_message() {
    AbstractCommandLineRunner.FlagUsageException ex =
        new AbstractCommandLineRunner.FlagUsageException("Error occurred");
    Assert.assertEquals("Error occurred", ex.getMessage());
  }

  @Test
  public void testCreateDefineReplacements_validTypes() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList(
        "FLAG_BOOL_IMPLICIT",
        "FLAG_BOOL_TRUE=true",
        "FLAG_BOOL_FALSE=false",
        "FLAG_STRING='some_string'",
        "FLAG_DOUBLE=3.1415",
        "FLAG_INT=42"
    );

    AbstractCommandLineRunner.createDefineReplacements(defs, options);
    // Verified that no exceptions are thrown and assignments processed
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_emptyDefName_throwsException() {
    CompilerOptions options = new CompilerOptions();
    AbstractCommandLineRunner.createDefineReplacements(
        Collections.singletonList("=value"), options);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_invalidNumber_throwsException() {
    CompilerOptions options = new CompilerOptions();
    AbstractCommandLineRunner.createDefineReplacements(
        Collections.singletonList("FLAG=invalid_val"), options);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_unclosedString_throwsException() {
    CompilerOptions options = new CompilerOptions();
    AbstractCommandLineRunner.createDefineReplacements(
        Collections.singletonList("FLAG='unclosed"), options);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_stringWithInnerSingleQuote_throwsException() {
    CompilerOptions options = new CompilerOptions();
    AbstractCommandLineRunner.createDefineReplacements(
        Collections.singletonList("FLAG='inner'quote'"), options);
  }

  @Test
  public void testCreateJsModules_validSpecs() throws Exception {
    File f1 = tmpFolder.newFile("f1.js");
    File f2 = tmpFolder.newFile("f2.js");
    File f3 = tmpFolder.newFile("f3.js");

    List<String> specs = Lists.newArrayList("m0:1", "m1:2:m0");
    List<String> jsFiles = Lists.newArrayList(
        f1.getAbsolutePath(), f2.getAbsolutePath(), f3.getAbsolutePath());

    JSModule[] modules = AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    Assert.assertEquals(2, modules.length);
    Assert.assertEquals("m0", modules[0].getName());
    Assert.assertEquals("m1", modules[1].getName());
    Assert.assertEquals(1, modules[0].getInputs().size());
    Assert.assertEquals(2, modules[1].getInputs().size());
    Assert.assertTrue(modules[1].getDependencies().contains(modules[0]));
  }

  @Test
  public void testCreateJsModules_fourPartSpec() throws Exception {
    File f1 = tmpFolder.newFile("f1.js");
    List<String> specs = Lists.newArrayList("m0:1::");
    List<String> jsFiles = Lists.newArrayList(f1.getAbsolutePath());

    JSModule[] modules = AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    Assert.assertEquals(1, modules.length);
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_invalidPartsCount_throwsException() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Collections.singletonList("m0"), Collections.<String>emptyList());
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_tooManyParts_throwsException() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Collections.singletonList("m0:1:dep:extra:more"), Collections.<String>emptyList());
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_invalidModuleName_throwsException() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Collections.singletonList("invalid-name:0"), Collections.<String>emptyList());
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_duplicateModuleName_throwsException() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Lists.newArrayList("m0:0", "m0:0"), Collections.<String>emptyList());
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_invalidFileCount_throwsException() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Collections.singletonList("m0:not_a_num"), Collections.<String>emptyList());
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_notEnoughFiles_throwsException() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Collections.singletonList("m0:2"), Collections.singletonList("file1.js"));
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_tooManyFiles_throwsException() throws Exception {
    File f1 = tmpFolder.newFile("f1.js");
    File f2 = tmpFolder.newFile("f2.js");
    AbstractCommandLineRunner.createJsModules(
        Collections.singletonList("m0:1"),
        Lists.newArrayList(f1.getAbsolutePath(), f2.getAbsolutePath()));
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testCreateJsModules_unknownDependency_throwsException() throws Exception {
    File f1 = tmpFolder.newFile("f1.js");
    AbstractCommandLineRunner.createJsModules(
        Collections.singletonList("m0:1:unknownMod"),
        Collections.singletonList(f1.getAbsolutePath()));
  }

  @Test
  public void testParseModuleWrappers_valid() throws Exception {
    JSModule m1 = new JSModule("mod1");
    JSModule m2 = new JSModule("mod2");
    JSModule[] modules = new JSModule[]{m1, m2};

    List<String> specs = Lists.newArrayList("mod1:(function(){%s})();");
    Map<String, String> result = AbstractCommandLineRunner.parseModuleWrappers(specs, modules);

    Assert.assertEquals(2, result.size());
    Assert.assertEquals("(function(){%s})();", result.get("mod1"));
    Assert.assertEquals("", result.get("mod2"));
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testParseModuleWrappers_missingColon_throwsException() throws Exception {
    JSModule[] modules = new JSModule[]{new JSModule("mod1")};
    AbstractCommandLineRunner.parseModuleWrappers(
        Collections.singletonList("mod1_no_colon"), modules);
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testParseModuleWrappers_unknownModule_throwsException() throws Exception {
    JSModule[] modules = new JSModule[]{new JSModule("mod1")};
    AbstractCommandLineRunner.parseModuleWrappers(
        Collections.singletonList("unknownMod:%s"), modules);
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testParseModuleWrappers_missingPlaceholder_throwsException() throws Exception {
    JSModule[] modules = new JSModule[]{new JSModule("mod1")};
    AbstractCommandLineRunner.parseModuleWrappers(
        Collections.singletonList("mod1:no_placeholder"), modules);
  }

  @Test
  public void testWriteOutput_variations() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);

    // No wrapper match
    AbstractCommandLineRunner.writeOutput(ps, null, "var a=1;", "", "%s");
    Assert.assertEquals("var a=1;\n", baos.toString().replace("\r\n", "\n"));

    baos.reset();
    // Wrapper with prefix and suffix
    AbstractCommandLineRunner.writeOutput(ps, null, "var a=1;", "prefix(%s);", "%s");
    Assert.assertEquals("prefix(var a=1;);\n", baos.toString().replace("\r\n", "\n"));

    baos.reset();
    // Wrapper with placeholder at the end
    AbstractCommandLineRunner.writeOutput(ps, null, "var a=1;", "prefix:%s", "%s");
    Assert.assertEquals("prefix:var a=1;\n", baos.toString().replace("\r\n", "\n"));

    baos.reset();
    // Wrapper with placeholder at index 0
    AbstractCommandLineRunner.writeOutput(ps, null, "var a=1;", "%s//suffix", "%s");
    Assert.assertEquals("var a=1;//suffix\n", baos.toString().replace("\r\n", "\n"));
  }

  @Test
  public void testDoRun_basicCompile() throws Exception {
    File jsFile = tmpFolder.newFile("test.js");
    FileOutputStream fos = new FileOutputStream(jsFile);
    fos.write("var x = 10;".getBytes(Charsets.UTF_8));
    fos.close();

    TestCommandLineRunner runner = new TestCommandLineRunner(outStream, errStream);
    runner.getCommandLineConfig()
        .setJs(Collections.singletonList(jsFile.getAbsolutePath()))
        .setLoggingLevel(Level.OFF.getName());

    int result = runner.doRun();
    Assert.assertEquals(0, result);
    Assert.assertNotNull(runner.getCompiler());
    Assert.assertTrue(outContent.toString().contains("var x=10"));
  }

  @Test
  public void testDoRun_withOutputFileAndCustomCharset() throws Exception {
    File jsFile = tmpFolder.newFile("test_in.js");
    File outFile = tmpFolder.newFile("test_out.js");
    FileOutputStream fos = new FileOutputStream(jsFile);
    fos.write("var hello = 'world';".getBytes(Charsets.UTF_8));
    fos.close();

    TestCommandLineRunner runner = new TestCommandLineRunner(outStream, errStream);
    runner.getCommandLineConfig()
        .setJs(Collections.singletonList(jsFile.getAbsolutePath()))
        .setJsOutputFile(outFile.getAbsolutePath())
        .setCharset("ISO-8859-1")
        .setLoggingLevel(Level.OFF.getName());

    int result = runner.doRun();
    Assert.assertEquals(0, result);
    Assert.assertTrue(outFile.length() > 0);
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testDoRun_invalidCharset_throwsException() throws Exception {
    TestCommandLineRunner runner = new TestCommandLineRunner(outStream, errStream);
    runner.getCommandLineConfig().setCharset("INVALID_CHARSET_NAME_12345");
    runner.doRun();
  }

  @Test
  public void testDoRun_moduleCompilation() throws Exception {
    File js1 = tmpFolder.newFile("mod1.js");
    FileOutputStream fos1 = new FileOutputStream(js1);
    fos1.write("var a = 1;".getBytes(Charsets.UTF_8));
    fos1.close();

    File js2 = tmpFolder.newFile("mod2.js");
    FileOutputStream fos2 = new FileOutputStream(js2);
    fos2.write("var b = 2;".getBytes(Charsets.UTF_8));
    fos2.close();

    File outDir = tmpFolder.newFolder("modules_out");

    TestCommandLineRunner runner = new TestCommandLineRunner(outStream, errStream);
    runner.getCommandLineConfig()
        .setJs(Lists.newArrayList(js1.getAbsolutePath(), js2.getAbsolutePath()))
        .setModule(Lists.newArrayList("m1:1", "m2:1:m1"))
        .setModuleOutputPathPrefix(outDir.getAbsolutePath() + File.separator + "out_")
        .setModuleWrapper(Collections.singletonList("m1:(function(){%s})();"))
        .setLoggingLevel(Level.OFF.getName());

    int result = runner.doRun();
    Assert.assertEquals(0, result);

    File outM1 = new File(outDir, "out_m1.js");
    File outM2 = new File(outDir, "out_m2.js");
    Assert.assertTrue(outM1.exists());
    Assert.assertTrue(outM2.exists());
  }

  @Test
  public void testProcessResults_printFlags() throws Exception {
    TestCommandLineRunner runner = new TestCommandLineRunner(outStream, errStream);
    Compiler compiler = runner.createCompiler();
    CompilerOptions options = runner.createOptions();
    Result result = new Result(new JSError[0], new JSError[0], null, null, null, null, null);

    // 1. computePhaseOrdering = true
    runner.getCommandLineConfig().setComputePhaseOrdering(true);
    Assert.assertEquals(0, runner.processResults(result, null, options));
    runner.getCommandLineConfig().setComputePhaseOrdering(false);

    // 2. printPassGraph = true with compiler root null
    runner.getCommandLineConfig().setPrintPassGraph(true);
    Assert.assertEquals(1, runner.processResults(result, null, options));
    runner.getCommandLineConfig().setPrintPassGraph(false);

    // 3. printAst = true with compiler root null
    runner.getCommandLineConfig().setPrintAst(true);
    Assert.assertEquals(1, runner.processResults(result, null, options));
    runner.getCommandLineConfig().setPrintAst(false);

    // 4. printTree = true with compiler root null
    runner.getCommandLineConfig().setPrintTree(true);
    Assert.assertEquals(1, runner.processResults(result, null, options));
    Assert.assertTrue(outContent.toString().contains("Code contains errors"));
    runner.getCommandLineConfig().setPrintTree(false);
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testOutputNameMaps_conflictVariableMap_throwsException() throws Exception {
    TestCommandLineRunner runner = new TestCommandLineRunner(outStream, errStream);
    File js1 = tmpFolder.newFile("f.js");
    FileOutputStream fos = new FileOutputStream(js1);
    fos.write("var x = 1;".getBytes(Charsets.UTF_8));
    fos.close();

    runner.getCommandLineConfig()
        .setJs(Collections.singletonList(js1.getAbsolutePath()))
        .setCreateNameMapFiles(true)
        .setVariableMapOutputFile("var_map.txt");

    runner.doRun();
  }

  @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
  public void testOutputNameMaps_conflictPropertyMap_throwsException() throws Exception {
    TestCommandLineRunner runner = new TestCommandLineRunner(outStream, errStream);
    File js1 = tmpFolder.newFile("f.js");
    FileOutputStream fos = new FileOutputStream(js1);
    fos.write("var x = 1;".getBytes(Charsets.UTF_8));
    fos.close();

    runner.getCommandLineConfig()
        .setJs(Collections.singletonList(js1.getAbsolutePath()))
        .setCreateNameMapFiles(true)
        .setPropertyMapOutputFile("prop_map.txt");

    runner.doRun();
  }

  @Test
  public void testSetRunOptions_allBranches() throws Exception {
    TestCommandLineRunner runner = new TestCommandLineRunner(outStream, errStream);
    CompilerOptions options = new CompilerOptions();

    File varIn = tmpFolder.newFile("var_in.txt");
    VariableMap varMap = new VariableMap(Collections.singletonMap("a", "b"));
    varMap.save(varIn.getAbsolutePath());

    File propIn = tmpFolder.newFile("prop_in.txt");
    VariableMap propMap = new VariableMap(Collections.singletonMap("c", "d"));
    propMap.save(propIn.getAbsolutePath());

    runner.getCommandLineConfig()
        .setJsOutputFile("output.js")
        .setCreateSourceMap("output.js.map")
        .setVariableMapInputFile(varIn.getAbsolutePath())
        .setPropertyMapInputFile(propIn.getAbsolutePath())
        .setSummaryDetailLevel(3);

    runner.setRunOptions(options);

    Assert.assertEquals("output.js", options.jsOutputFile);
    Assert.assertEquals("output.js.map", options.sourceMapOutputPath);
    Assert.assertNotNull(options.inputVariableMapSerialized);
    Assert.assertNotNull(options.inputPropertyMapSerialized);
    Assert.assertEquals(3, options.summaryDetailLevel);
  }

  @Test
  public void testCreateExterns_emptyAndNonEmpty() throws Exception {
    TestCommandLineRunner runner = new TestCommandLineRunner(outStream, errStream);

    // Empty externs configuration produces a dummy /dev/null extern input
    List<JSSourceFile> externs = runner.createExterns();
    Assert.assertEquals(1, externs.size());
    Assert.assertEquals("/dev/null", externs.get(0).getName());

    // Non-empty externs
    File extFile = tmpFolder.newFile("ext.js");
    runner.getCommandLineConfig().setExterns(Collections.singletonList(extFile.getAbsolutePath()));
    List<JSSourceFile> customExterns = runner.createExterns();
    Assert.assertEquals(1, customExterns.size());
    Assert.assertEquals(extFile.getAbsolutePath(), customExterns.get(0).getName());
  }
}
