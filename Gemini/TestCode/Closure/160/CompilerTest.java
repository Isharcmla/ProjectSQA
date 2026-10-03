package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public class CompilerTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  @After
  public void tearDown() {
    Compiler.setLoggingLevel(Level.INFO);
  }

  @Test
  public void testConstructor_default() {
    Compiler comp = new Compiler();
    Assert.assertNotNull(comp);
    Assert.assertNull(comp.getOptions());
  }

  @Test
  public void testConstructor_withPrintStream() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    Compiler comp = new Compiler(ps);
    Assert.assertNotNull(comp);
  }

  @Test
  public void testConstructor_withErrorManager() {
    PrintStreamErrorManager errorManager = new PrintStreamErrorManager(new LightweightMessageFormatter(compiler), System.err);
    Compiler comp = new Compiler(errorManager);
    Assert.assertSame(errorManager, comp.getErrorManager());
  }

  @Test(expected = NullPointerException.class)
  public void testSetErrorManager_nullThrowsException() {
    compiler.setErrorManager(null);
  }

  @Test
  public void testSetErrorManager_validManager() {
    BasicErrorManager customManager = new BasicErrorManager() {
      @Override
      public void println(CheckLevel level, JSError error) {}
      @Override
      public void printSummary() {}
    };
    compiler.setErrorManager(customManager);
    Assert.assertSame(customManager, compiler.getErrorManager());
  }

  @Test
  public void testInitOptions_variousOptions() {
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = false;
    options.checkGlobalThisLevel = CheckLevel.ERROR;
    options.checkSymbols = true;
    compiler.initOptions(options);

    Assert.assertSame(options, compiler.getOptions());
    Assert.assertNotNull(compiler.getErrorManager());
  }

  @Test
  public void testInitOptions_withCheckTypesDiagnosticGroup() {
    CompilerOptions options = new CompilerOptions();
    options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);
    compiler.initOptions(options);
    Assert.assertTrue(options.checkTypes);

    Compiler compiler2 = new Compiler();
    CompilerOptions options2 = new CompilerOptions();
    options2.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.OFF);
    compiler2.initOptions(options2);
    Assert.assertFalse(options2.checkTypes);
  }

  @Test
  public void testInitOptions_withPrintStreamErrorManager() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    Compiler comp = new Compiler(new PrintStream(baos));
    CompilerOptions options = new CompilerOptions();
    comp.initOptions(options);
    Assert.assertNotNull(comp.getErrorManager());
  }

  @Test
  public void testInit_withSourceFileArrays() {
    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("externs.js", "var window;")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("input.js", "var a = 1;")
    };
    CompilerOptions options = new CompilerOptions();
    compiler.init(externs, inputs, options);

    Assert.assertEquals(1, compiler.getInputsForTesting().size());
    Assert.assertEquals(1, compiler.getExternsForTesting().size());
  }

  @Test
  public void testInit_withSourceFileLists() {
    List<JSSourceFile> externs = Lists.newArrayList(
        JSSourceFile.fromCode("externs.js", "var window;")
    );
    List<JSSourceFile> inputs = Lists.newArrayList(
        JSSourceFile.fromCode("input.js", "var a = 1;")
    );
    CompilerOptions options = new CompilerOptions();
    compiler.init(externs, inputs, options);

    Assert.assertEquals(1, compiler.getInputsForTesting().size());
    Assert.assertEquals(1, compiler.getExternsForTesting().size());
  }

  @Test
  public void testInit_withModulesArray() {
    JSSourceFile[] externs = new JSSourceFile[] {};
    JSModule[] modules = new JSModule[] { new JSModule("m1") };
    modules[0].add(JSSourceFile.fromCode("m1.js", "var x = 1;"));
    CompilerOptions options = new CompilerOptions();

    compiler.init(externs, modules, options);
    Assert.assertEquals(1, compiler.getInputsForTesting().size());
  }

  @Test
  public void testInitModules_emptyModuleListReportsError() {
    CompilerOptions options = new CompilerOptions();
    compiler.initModules(
        Lists.<JSSourceFile>newArrayList(),
        Lists.<JSModule>newArrayList(),
        options
    );
    Assert.assertTrue(compiler.hasErrors());
    Assert.assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testInitModules_emptyRootModuleMultipleModulesReportsError() {
    CompilerOptions options = new CompilerOptions();
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    m2.add(JSSourceFile.fromCode("m2.js", "var b = 2;"));
    m2.addDependency(m1);

    compiler.initModules(
        Lists.<JSSourceFile>newArrayList(),
        Lists.newArrayList(m1, m2),
        options
    );
    Assert.assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInitModules_moduleDependencyError() {
    CompilerOptions options = new CompilerOptions();
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    m1.add(JSSourceFile.fromCode("m1.js", "var a = 1;"));
    m2.add(JSSourceFile.fromCode("m2.js", "var b = 2;"));
    m1.addDependency(m2);

    compiler.initModules(
        Lists.<JSSourceFile>newArrayList(),
        Lists.newArrayList(m1, m2),
        options
    );
    Assert.assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInitInputsByNameMap_duplicateInputsReportError() {
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = Lists.newArrayList(
        JSSourceFile.fromCode("same.js", "var x;"),
        JSSourceFile.fromCode("same.js", "var y;")
    );
    List<JSSourceFile> inputs = Lists.newArrayList(
        JSSourceFile.fromCode("input.js", "var a = 1;"),
        JSSourceFile.fromCode("input.js", "var a = 2;")
    );
    compiler.init(externs, inputs, options);
    Assert.assertTrue(compiler.getErrorCount() >= 2);
  }

  @Test
  public void testCompile_singleExternSingleInput() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 10;");
    CompilerOptions options = new CompilerOptions();

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
    Assert.assertEquals(0, result.errors.length);
  }

  @Test
  public void testCompile_singleExternInputArray() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("input.js", "function foo() { return 1; }")
    };
    CompilerOptions options = new CompilerOptions();

    Result result = compiler.compile(extern, inputs, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_singleExternModuleArray() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSModule module = new JSModule("mod");
    module.add(JSSourceFile.fromCode("input.js", "var a = 1;"));
    CompilerOptions options = new CompilerOptions();

    Result result = compiler.compile(extern, new JSModule[] { module }, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_arrays() {
    JSSourceFile[] externs = new JSSourceFile[] { JSSourceFile.fromCode("ext.js", "") };
    JSSourceFile[] inputs = new JSSourceFile[] { JSSourceFile.fromCode("in.js", "var a = 5;") };
    CompilerOptions options = new CompilerOptions();

    Result result = compiler.compile(externs, inputs, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_moduleArrays() {
    JSSourceFile[] externs = new JSSourceFile[] {};
    JSModule module = new JSModule("mod");
    module.add(JSSourceFile.fromCode("in.js", "var a = 5;"));
    CompilerOptions options = new CompilerOptions();

    Result result = compiler.compile(externs, new JSModule[] { module }, options);
    Assert.assertTrue(result.success);
  }

  @Test(expected = IllegalStateException.class)
  public void testCompile_calledTwiceThrowsException() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 10;");
    CompilerOptions options = new CompilerOptions();

    compiler.compile(extern, input, options);
    compiler.compile(extern, input, options);
  }

  @Test
  public void testCompile_withSyntaxError() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = ;");
    CompilerOptions options = new CompilerOptions();

    Result result = compiler.compile(extern, input, options);
    Assert.assertFalse(result.success);
    Assert.assertTrue(result.errors.length > 0);
  }

  @Test
  public void testDisableThreads() {
    compiler.disableThreads();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    CompilerOptions options = new CompilerOptions();
    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testRunCallableWithLargeStack() {
    Integer res = Compiler.runCallableWithLargeStack(new java.util.concurrent.Callable<Integer>() {
      @Override
      public Integer call() {
        return 42;
      }
    });
    Assert.assertEquals(Integer.valueOf(42), res);
  }

  @Test(expected = RuntimeException.class)
  public void testRunCallable_exceptionThrown() {
    Compiler.runCallable(new java.util.concurrent.Callable<Void>() {
      @Override
      public Void call() throws Exception {
        throw new IOException("Test exception");
      }
    }, false, false);
  }

  @Test
  public void testSetPassConfig_valid() {
    CompilerOptions options = new CompilerOptions();
    PassConfig passConfig = new DefaultPassConfig(options);
    compiler.setPassConfig(passConfig);
    Assert.assertSame(passConfig, compiler.getPassConfig());
  }

  @Test(expected = NullPointerException.class)
  public void testSetPassConfig_nullThrowsException() {
    compiler.setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfig_alreadyAssignedThrowsException() {
    CompilerOptions options = new CompilerOptions();
    PassConfig passConfig1 = new DefaultPassConfig(options);
    PassConfig passConfig2 = new DefaultPassConfig(options);
    compiler.setPassConfig(passConfig1);
    compiler.setPassConfig(passConfig2);
  }

  @Test
  public void testCompileOptions_variousFlags() {
    CompilerOptions options = new CompilerOptions();
    options.devMode = DevMode.START_AND_END;
    options.checkSymbols = true;
    options.nameAnonymousFunctionsOnly = true;

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var f = function() {};");
    Result res = compiler.compile(extern, input, options);
    Assert.assertTrue(res.success);
  }

  @Test
  public void testCompileOptions_skipAllPassesAndIdeMode() {
    CompilerOptions options = new CompilerOptions();
    options.skipAllPasses = false;
    options.ideMode = true;
    options.recordFunctionInformation = true;

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function foo(a) { return a; }");
    Result res = compiler.compile(extern, input, options);
    Assert.assertTrue(res.success);
    Assert.assertNotNull(compiler.getFunctionalInformationMap());
  }

  @Test
  public void testCompileOptions_stripAndRemoveTryCatch() {
    CompilerOptions options = new CompilerOptions();
    options.removeTryCatchFinally = true;
    options.stripTypes.add("DebugLogger");

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "try { var x = 1; } catch (e) {}");
    Result res = compiler.compile(extern, input, options);
    Assert.assertTrue(res.success);
  }

  @Test
  public void testCompileOptions_externExports() {
    CompilerOptions options = new CompilerOptions();
    options.externExportsPath = "exports.js";

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "goog.exportSymbol('myExport', function() {});");
    Result res = compiler.compile(extern, input, options);
    Assert.assertTrue(res.success);
  }

  @Test
  public void testCustomPasses() {
    CompilerOptions options = new CompilerOptions();
    final boolean[] passRan = new boolean[1];
    CompilerPass customPass = new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        passRan[0] = true;
      }
    };
    options.addCustomPass(CustomPassExecutionTime.BEFORE_CHECKS, customPass);

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    Result res = compiler.compile(extern, input, options);

    Assert.assertTrue(res.success);
    Assert.assertTrue(passRan[0]);
  }

  @Test
  public void testParseSyntheticCode_andTestCode() {
    Node node1 = compiler.parseSyntheticCode("var synt = 1;");
    Assert.assertNotNull(node1);

    Node node2 = compiler.parseSyntheticCode("synth.js", "var synt2 = 2;");
    Assert.assertNotNull(node2);

    Node node3 = compiler.parseTestCode("var test = 3;");
    Assert.assertNotNull(node3);
  }

  @Test
  public void testParse_sourceFile() {
    JSSourceFile file = JSSourceFile.fromCode("testfile.js", "var x = 100;");
    Node root = compiler.parse(file);
    Assert.assertNotNull(root);
  }

  @Test
  public void testToSource_singleInputAndArray() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1; var b = 2;");
    CompilerOptions options = new CompilerOptions();
    compiler.compile(extern, input, options);

    String src = compiler.toSource();
    Assert.assertTrue(src.contains("var a=1"));

    String[] srcArray = compiler.toSourceArray();
    Assert.assertEquals(1, srcArray.length);
    Assert.assertTrue(srcArray[0].contains("var a=1"));
  }

  @Test
  public void testToSource_modules() {
    JSModule module = new JSModule("mod");
    module.add(JSSourceFile.fromCode("m1.js", "var x = 10;"));
    CompilerOptions options = new CompilerOptions();
    compiler.compile(new JSSourceFile[]{}, new JSModule[]{ module }, options);

    String src = compiler.toSource(module);
    Assert.assertTrue(src.contains("var x=10"));

    String[] srcArray = compiler.toSourceArray(module);
    Assert.assertEquals(1, srcArray.length);
    Assert.assertTrue(srcArray[0].contains("var x=10"));

    JSModule emptyMod = new JSModule("emptyMod");
    Assert.assertEquals("", compiler.toSource(emptyMod));
    Assert.assertEquals(0, compiler.toSourceArray(emptyMod).length);
  }

  @Test
  public void testToSource_codeBuilderWithDelimiterAndLicense() {
    CompilerOptions options = new CompilerOptions();
    options.printInputDelimiter = true;
    options.inputDelimiter = "// [%name% - %num%]";
    compiler.initOptions(options);

    Node scriptNode = compiler.parseSyntheticCode("file1.js", "/** @license MIT */ var x = 1;");
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    compiler.toSource(cb, 0, scriptNode);
    String out = cb.toString();

    Assert.assertTrue(out.contains("// [file1.js - 0]"));
    Assert.assertTrue(out.contains("MIT"));
  }

  @Test
  public void testToSource_nodeDirect() {
    Node node = compiler.parseTestCode("var y = 20;");
    String src = compiler.toSource(node);
    Assert.assertTrue(src.contains("var y=20"));
  }

  @Test
  public void testCodeBuilder_helperMethods() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("foo\nbar");
    Assert.assertEquals(1, cb.getLineIndex());
    Assert.assertEquals(3, cb.getColumnIndex());
    Assert.assertEquals(7, cb.getLength());
    Assert.assertTrue(cb.endsWith("bar"));
    Assert.assertFalse(cb.endsWith("baz"));
    Assert.assertEquals("foo\nbar", cb.toString());

    cb.reset();
    Assert.assertEquals(0, cb.getLength());
    Assert.assertEquals(1, cb.getLineIndex());
  }

  @Test
  public void testUniqueNameId() {
    compiler.resetUniqueNameId();
    com.google.common.base.Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
    Assert.assertEquals("0", supplier.get());
    Assert.assertEquals("1", supplier.get());
    compiler.resetUniqueNameId();
    Assert.assertEquals("0", supplier.get());
  }

  @Test
  public void testAreNodesEqualForInlining() {
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node n1 = compiler.parseTestCode("var a = 1;");
    Node n2 = compiler.parseTestCode("var a = 1;");
    Assert.assertTrue(compiler.areNodesEqualForInlining(n1, n2));

    options.ambiguateProperties = true;
    Assert.assertTrue(compiler.areNodesEqualForInlining(n1, n2));
  }

  @Test
  public void testInputsManagement() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var ext;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    CompilerOptions options = new CompilerOptions();
    compiler.compile(extern, input, options);

    CompilerInput in = compiler.getInput("input.js");
    Assert.assertNotNull(in);

    CompilerInput newExt = compiler.newExternInput("synthetic_extern.js");
    Assert.assertNotNull(newExt);

    JsAst newAst = new JsAst(JSSourceFile.fromCode("added.js", "var z = 3;"));
    compiler.addIncrementalSourceAst(newAst);
    Assert.assertNotNull(compiler.getInput("added.js"));

    JsAst replacedAst = new JsAst(JSSourceFile.fromCode("added.js", "var z = 4;"));
    boolean replaced = compiler.replaceIncrementalSourceAst(replacedAst);
    Assert.assertTrue(replaced);

    compiler.removeInput("added.js");
    Assert.assertNull(compiler.getInput("added.js"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInput_duplicateThrowsException() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var ext;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    CompilerOptions options = new CompilerOptions();
    compiler.compile(extern, input, options);
    compiler.newExternInput("extern.js");
  }

  @Test
  public void testGettersAndSetters() {
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    options.acceptConstKeyword = true;
    compiler.initOptions(options);

    Assert.assertTrue(compiler.acceptEcmaScript5());
    Assert.assertTrue(compiler.acceptConstKeyword());
    Assert.assertEquals(LanguageMode.ECMASCRIPT5, compiler.languageMode());
    Assert.assertNotNull(compiler.getParserConfig());
    Assert.assertNotNull(compiler.getCodingConvention());
    Assert.assertFalse(compiler.isIdeMode());
    Assert.assertFalse(compiler.isTypeCheckingEnabled());
    Assert.assertNotNull(compiler.getDefaultErrorReporter());
    Assert.assertNotNull(compiler.getTypeValidator());
    Assert.assertNotNull(compiler.getTypeRegistry());
    Assert.assertNotNull(compiler.getReverseAbstractInterpreter());
    Assert.assertNull(compiler.getModuleGraph());

    CssRenamingMap map = new CssRenamingMap() {
      @Override
      public String get(String value) {
        return value;
      }
    };
    compiler.setCssRenamingMap(map);
    Assert.assertSame(map, compiler.getCssRenamingMap());

    compiler.setHasRegExpGlobalReferences(true);
    Assert.assertTrue(compiler.hasRegExpGlobalReferences());
    compiler.setHasRegExpGlobalReferences(false);
    Assert.assertFalse(compiler.hasRegExpGlobalReferences());
  }

  @Test
  public void testReverseAbstractInterpreter_withClosurePass() {
    CompilerOptions options = new CompilerOptions();
    options.closurePass = true;
    compiler.initOptions(options);
    Assert.assertNotNull(compiler.getReverseAbstractInterpreter());
  }

  @Test
  public void testLanguageModesInParserConfig() {
    Compiler comp3 = new Compiler();
    CompilerOptions opt3 = new CompilerOptions();
    opt3.setLanguageIn(LanguageMode.ECMASCRIPT3);
    comp3.initOptions(opt3);
    Assert.assertNotNull(comp3.getParserConfig());

    Compiler comp5s = new Compiler();
    CompilerOptions opt5s = new CompilerOptions();
    opt5s.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT);
    comp5s.initOptions(opt5s);
    Assert.assertNotNull(comp5s.getParserConfig());
  }

  @Test
  public void testReportingAndErrors() {
    compiler.initOptions(new CompilerOptions());
    JSError error = JSError.make("test.js", 1, 1, CheckLevel.ERROR, DiagnosticType.error("TEST", "msg"));
    compiler.report(error);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertTrue(compiler.hasHaltingErrors());
    Assert.assertTrue(compiler.hasErrors());
    Assert.assertEquals(1, compiler.getErrors().length);
    Assert.assertEquals(1, compiler.getMessages().length);
    Assert.assertNotNull(compiler.getDiagnosticGroups());
    Assert.assertEquals(CheckLevel.ERROR, compiler.getErrorLevel(error));
  }

  @Test(expected = RuntimeException.class)
  public void testThrowInternalError() {
    compiler.throwInternalError("Fatal test error", new IllegalStateException("Cause"));
  }

  @Test
  public void testSourceLinesAndRegions() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "line1\nline2\nline3");
    CompilerOptions options = new CompilerOptions();
    compiler.compile(extern, input, options);

    Assert.assertNull(compiler.getSourceLine("input.js", 0));
    Assert.assertNull(compiler.getSourceLine("input.js", -1));
    Assert.assertNull(compiler.getSourceLine("unknown.js", 1));
    Assert.assertEquals("line1", compiler.getSourceLine("input.js", 1));
    Assert.assertEquals("line2", compiler.getSourceLine("input.js", 2));

    Assert.assertNull(compiler.getSourceRegion("input.js", 0));
    Assert.assertNull(compiler.getSourceRegion("input.js", -1));
    Assert.assertNull(compiler.getSourceRegion("unknown.js", 1));
    Assert.assertNotNull(compiler.getSourceRegion("input.js", 1));
  }

  @Test
  public void testIntermediateState() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    CompilerOptions options = new CompilerOptions();
    compiler.compile(extern, input, options);

    Compiler.IntermediateState state = compiler.getState();
    Assert.assertNotNull(state);

    Compiler newComp = new Compiler();
    newComp.initOptions(options);
    newComp.setState(state);
    Assert.assertEquals(compiler.getRoot(), newComp.getRoot());
  }

  @Test
  public void testGetAstDotGraph() throws IOException {
    Assert.assertEquals("", compiler.getAstDotGraph());

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    CompilerOptions options = new CompilerOptions();
    compiler.compile(extern, input, options);

    String dotGraph = compiler.getAstDotGraph();
    Assert.assertNotNull(dotGraph);
    Assert.assertTrue(dotGraph.contains("digraph"));
  }

  @Test
  public void testCodeChangeHandlers() {
    final boolean[] changed = new boolean[1];
    CodeChangeHandler handler = new CodeChangeHandler() {
      @Override
      public void reportChange() {
        changed[0] = true;
      }
    };

    compiler.addChangeHandler(handler);
    compiler.reportCodeChange();
    Assert.assertTrue(changed[0]);

    changed[0] = false;
    compiler.removeChangeHandler(handler);
    compiler.reportCodeChange();
    Assert.assertFalse(changed[0]);
  }

  @Test
  public void testManageClosureDependencies() {
    CompilerOptions options = new CompilerOptions();
    options.manageClosureDependencies = true;
    options.setManageClosureDependencies(ImmutableList.of("entry"));

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input1 = JSSourceFile.fromCode("dep.js", "goog.provide('dep'); var depVal = 1;");
    JSSourceFile input2 = JSSourceFile.fromCode("entry.js", "goog.provide('entry'); goog.require('dep'); var entryVal = 2;");

    Result result = compiler.compile(extern, new JSSourceFile[] { input1, input2 }, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testClosureSpecialJsDocs() {
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input1 = JSSourceFile.fromCode("extInput.js", "/** @externs */ var externVar;");
    JSSourceFile input2 = JSSourceFile.fromCode("noComp.js", "/** @nocompile */ var ignoredVar = 1;");
    JSSourceFile input3 = JSSourceFile.fromCode("main.js", "var ok = 1;");

    Result result = compiler.compile(extern, new JSSourceFile[] { input1, input2, input3 }, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testComputeCFG_andProcessDefines() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @define {boolean} */ var DEF = true; if (DEF) { var x = 1; }");
    CompilerOptions options = new CompilerOptions();
    compiler.compile(extern, input, options);

    ControlFlowGraph<Node> cfg = compiler.computeCFG();
    Assert.assertNotNull(cfg);

    compiler.processDefines();
  }

  @Test
  public void testIsInliningForbidden() {
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Assert.assertFalse(compiler.isInliningForbidden());

    options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
    Assert.assertTrue(compiler.isInliningForbidden());

    options.propertyRenaming = PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
    Assert.assertTrue(compiler.isInliningForbidden());
  }

  @Test
  public void testGetNodeForCodeInsertion() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    CompilerOptions options = new CompilerOptions();
    compiler.compile(extern, input, options);

    Node n1 = compiler.getNodeForCodeInsertion(null);
    Assert.assertNotNull(n1);

    JSModule mod = new JSModule("m");
    mod.add(JSSourceFile.fromCode("m.js", "var b = 2;"));
    Node n2 = compiler.getNodeForCodeInsertion(mod);
    Assert.assertNotNull(n2);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertion_emptyModuleThrows() {
    compiler.getNodeForCodeInsertion(new JSModule("empty"));
  }

  @Test
  public void testGlobalVarReferences() {
    Node scriptNode = compiler.parseSyntheticCode("collection.js", "var g = 1;");
    compiler.updateGlobalVarReferences(new HashMap<Scope.Var, ReferenceCollectingCallback.ReferenceCollection>(), scriptNode);
    Assert.assertNotNull(compiler.getGlobalVarReferences());
  }

  @Test
  public void testPassTracerCoverage() {
    CompilerOptions options = new CompilerOptions();
    options.tracer = TracerMode.ALL;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testPrepareAst() {
    Node node = compiler.parseSyntheticCode("ast.js", "function f() { var x = 10; }");
    compiler.prepareAst(node);
    Assert.assertNotNull(node);
  }

  @Test
  public void testMapsAndScopes() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    CompilerOptions options = new CompilerOptions();
    compiler.compile(extern, input, options);

    Assert.assertNull(compiler.getSourceMap());
    Assert.assertNull(compiler.getVariableMap());
    Assert.assertNull(compiler.getPropertyMap());
    Assert.assertNull(compiler.getTopScope());
    Assert.assertNotNull(compiler.getTypedScopeCreator());
    Assert.assertEquals(1, compiler.getInputsInOrder().size());
  }
}
