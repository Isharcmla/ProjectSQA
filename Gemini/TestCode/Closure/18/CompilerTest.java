package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

public class CompilerTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
  }

  @Test
  public void testConstructors() {
    Compiler c1 = new Compiler();
    Assert.assertNotNull(c1.recentChange);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    Compiler c2 = new Compiler(ps);
    Assert.assertNotNull(c2);

    LoggerErrorManager errorManager = new LoggerErrorManager(new LightweightMessageFormatter(c1), java.util.logging.Logger.getAnonymousLogger());
    Compiler c3 = new Compiler(errorManager);
    Assert.assertEquals(errorManager, c3.getErrorManager());
  }

  @Test(expected = NullPointerException.class)
  public void testSetErrorManager_nullThrows() {
    compiler.setErrorManager(null);
  }

  @Test
  public void testInitOptions_variousConfigurations() {
    Compiler c = new Compiler();
    CompilerOptions opt = new CompilerOptions();
    opt.checkTypes = true;
    opt.checkGlobalThisLevel = CheckLevel.ERROR;
    opt.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT);
    opt.checkSymbols = false;
    c.initOptions(opt);

    Assert.assertEquals(opt, c.getOptions());
    Assert.assertTrue(c.acceptEcmaScript5());
    Assert.assertEquals(LanguageMode.ECMASCRIPT5_STRICT, c.languageMode());
    Assert.assertTrue(c.isTypeCheckingEnabled());
  }

  @Test
  public void testInitOptions_withPrintStream() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    Compiler c = new Compiler(ps);
    CompilerOptions opt = new CompilerOptions();
    opt.summaryDetailLevel = 0;
    c.initOptions(opt);
    Assert.assertNotNull(c.getErrorManager());
  }

  @Test
  public void testInitOptions_diagnosticGroupsCheckTypes() {
    Compiler c = new Compiler();
    CompilerOptions opt = new CompilerOptions();
    opt.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);
    c.initOptions(opt);
    Assert.assertTrue(opt.checkTypes);

    Compiler c2 = new Compiler();
    CompilerOptions opt2 = new CompilerOptions();
    opt2.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.OFF);
    c2.initOptions(opt2);
    Assert.assertFalse(opt2.checkTypes);
  }

  @Test
  public void testCompile_singleSourceFile() {
    SourceFile extern = SourceFile.fromCode("externs.js", "function alert(x) {}");
    SourceFile input = SourceFile.fromCode("input.js", "var x = 1 + 1; alert(x);");
    Result result = compiler.compile(extern, input, options);

    Assert.assertTrue(result.success);
    Assert.assertEquals(0, compiler.getErrorCount());
    String source = compiler.toSource();
    Assert.assertTrue(source.contains("alert"));
  }

  @Test
  public void testCompile_sourceFileArrays() {
    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("externs.js", "var console;")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("input1.js", "var a = 1;"),
        JSSourceFile.fromCode("input2.js", "var b = 2;")
    };
    Result result = compiler.compile(externs, inputs, options);
    Assert.assertTrue(result.success);
    Assert.assertEquals(2, compiler.toSourceArray().length);
  }

  @Test
  public void testCompile_sourceFileListAndArrayOverloads() {
    SourceFile extern = SourceFile.fromCode("externs.js", "");
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("input.js", "var a = 10;")
    };
    Result result = compiler.compile(extern, inputs, options);
    Assert.assertTrue(result.success);

    JSError[] errors = compiler.getErrors();
    JSError[] warnings = compiler.getWarnings();
    JSError[] messages = compiler.getMessages();
    Assert.assertEquals(0, errors.length);
    Assert.assertEquals(0, warnings.length);
    Assert.assertEquals(0, messages.length);
  }

  @Test
  public void testCompileModules_normalAndDegenerateGraph() {
    JSModule mod1 = new JSModule("mod1");
    mod1.add(SourceFile.fromCode("mod1.js", "var m1 = 1;"));

    JSModule mod2 = new JSModule("mod2");
    mod2.add(SourceFile.fromCode("mod2.js", "var m2 = 2;"));
    mod2.addDependency(mod1);

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSModule[] modules = new JSModule[] { mod1, mod2 };

    Result result = compiler.compile(extern, modules, options);
    Assert.assertTrue(result.success);
    Assert.assertNotNull(compiler.getModuleGraph());
    Assert.assertNotNull(compiler.getDegenerateModuleGraph());

    String mod1Source = compiler.toSource(mod1);
    Assert.assertTrue(mod1Source.contains("m1"));

    String[] modSources = compiler.toSourceArray(mod2);
    Assert.assertEquals(1, modSources.length);

    JSModule emptyMod = new JSModule("emptyMod");
    Assert.assertEquals("", compiler.toSource(emptyMod));
    Assert.assertEquals(0, compiler.toSourceArray(emptyMod).length);
  }

  @Test
  public void testCompileModules_arrayOverload() {
    JSSourceFile[] externs = new JSSourceFile[] { JSSourceFile.fromCode("extern.js", "") };
    JSModule mod = new JSModule("root");
    mod.add(SourceFile.fromCode("main.js", "var root = true;"));
    JSModule[] modules = new JSModule[] { mod };

    Result result = compiler.compile(externs, modules, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompileModules_circularDependencyError() {
    JSModule mod1 = new JSModule("mod1");
    JSModule mod2 = new JSModule("mod2");
    mod1.add(SourceFile.fromCode("m1.js", "var a = 1;"));
    mod2.add(SourceFile.fromCode("m2.js", "var b = 2;"));

    mod1.addDependency(mod2);
    mod2.addDependency(mod1);

    Compiler c = new Compiler();
    Result res = c.compileModules(
        Lists.<SourceFile>newArrayList(),
        Lists.newArrayList(mod1, mod2),
        options);
    Assert.assertFalse(res.success);
    Assert.assertTrue(c.hasErrors());
  }

  @Test
  public void testCheckFirstModule_emptyModuleList() {
    Compiler c = new Compiler();
    c.initModules(Lists.<SourceFile>newArrayList(), Lists.<JSModule>newArrayList(), options);
    Assert.assertTrue(c.hasErrors());
  }

  @Test
  public void testCheckFirstModule_emptyRootModuleInMultiModule() {
    JSModule mod1 = new JSModule("root");
    JSModule mod2 = new JSModule("m2");
    mod2.add(SourceFile.fromCode("m2.js", "var x;"));

    Compiler c = new Compiler();
    c.initModules(Lists.<SourceFile>newArrayList(), Lists.newArrayList(mod1, mod2), options);
    Assert.assertTrue(c.hasErrors());
  }

  @Test
  public void testDuplicateInputs() {
    Compiler c = new Compiler();
    SourceFile file1 = SourceFile.fromCode("dup.js", "var x;");
    SourceFile file2 = SourceFile.fromCode("dup.js", "var y;");

    c.init(Lists.newArrayList(file1), Lists.newArrayList(file2), options);
    Assert.assertTrue(c.hasErrors());
  }

  @Test
  public void testDuplicateExternInputs() {
    Compiler c = new Compiler();
    SourceFile file1 = SourceFile.fromCode("extern.js", "var x;");
    SourceFile file2 = SourceFile.fromCode("extern.js", "var y;");

    c.init(Lists.newArrayList(file1, file2), Lists.<SourceFile>newArrayList(), options);
    Assert.assertTrue(c.hasErrors());
  }

  @Test(expected = IllegalStateException.class)
  public void testCompile_calledTwiceThrows() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, options);
    compiler.compile(extern, input, options);
  }

  @Test
  public void testDisableThreads() {
    compiler.disableThreads();
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCodeBuilder() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    Assert.assertEquals(0, cb.getLength());
    Assert.assertEquals(0, cb.getLineIndex());
    Assert.assertEquals(0, cb.getColumnIndex());

    cb.append("foo\nbar\n");
    Assert.assertEquals(2, cb.getLineIndex());
    Assert.assertEquals(0, cb.getColumnIndex());
    Assert.assertTrue(cb.endsWith("\n"));
    Assert.assertTrue(cb.endsWith("bar\n"));
    Assert.assertFalse(cb.endsWith("baz"));
    Assert.assertEquals("foo\nbar\n", cb.toString());
    Assert.assertEquals(8, cb.getLength());

    cb.append("baz");
    Assert.assertEquals(2, cb.getLineIndex());
    Assert.assertEquals(3, cb.getColumnIndex());

    cb.reset();
    Assert.assertEquals(0, cb.getLength());
    Assert.assertEquals(2, cb.getLineIndex());
    Assert.assertEquals("", cb.toString());
  }

  @Test
  public void testToSource_withInputDelimiterAndLicense() {
    Compiler c = new Compiler();
    CompilerOptions opt = new CompilerOptions();
    opt.printInputDelimiter = true;
    opt.inputDelimiter = "// [%name% - %num%]";

    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("test.js", "/** @license MIT */ var z = 1;");

    c.compile(extern, input, opt);
    String src = c.toSource();
    Assert.assertTrue(src.contains("// [test.js - 0]"));
    Assert.assertTrue(src.contains("MIT"));
  }

  @Test
  public void testToSource_nodeOnly() {
    Node node = compiler.parseTestCode("var a = 1;");
    String src = compiler.toSource(node);
    Assert.assertTrue(src.contains("var a=1"));
  }

  @Test
  public void testParseSyntheticAndTestCode() {
    Node node1 = compiler.parseTestCode("var test = 10;");
    Assert.assertNotNull(node1);

    Node node2 = compiler.parseSyntheticCode("var syn = 20;");
    Assert.assertNotNull(node2);

    Node node3 = compiler.parseSyntheticCode("namedSyn.js", "var named = 30;");
    Assert.assertNotNull(node3);

    SourceFile sf = SourceFile.fromCode("standalone.js", "var st = 40;");
    Node node4 = compiler.parse(sf);
    Assert.assertNotNull(node4);
  }

  @Test
  public void testGetPassConfig_andSetPassConfig() {
    PassConfig pc = compiler.getPassConfig();
    Assert.assertNotNull(pc);
    Assert.assertNotNull(compiler.ensureDefaultPassConfig());

    Compiler freshCompiler = new Compiler();
    DefaultPassConfig customConfig = new DefaultPassConfig(new CompilerOptions());
    freshCompiler.setPassConfig(customConfig);
    Assert.assertEquals(customConfig, freshCompiler.getPassConfig());
  }

  @Test(expected = NullPointerException.class)
  public void testSetPassConfig_nullThrows() {
    compiler.setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfig_alreadyAssignedThrows() {
    compiler.getPassConfig();
    compiler.setPassConfig(new DefaultPassConfig(options));
  }

  @Test
  public void testProgressBoundaries() {
    compiler.setProgress(-0.5);
    Assert.assertEquals(0.0, compiler.getProgress(), 0.001);

    compiler.setProgress(0.5);
    Assert.assertEquals(0.5, compiler.getProgress(), 0.001);

    compiler.setProgress(1.5);
    Assert.assertEquals(1.0, compiler.getProgress(), 0.001);
  }

  @Test
  public void testNewAndRemoveExternInput() {
    compiler.init(Lists.<SourceFile>newArrayList(), Lists.<SourceFile>newArrayList(), options);
    compiler.parseInputs();

    CompilerInput input = compiler.newExternInput("custom_extern.js");
    Assert.assertNotNull(input);
    Assert.assertEquals("custom_extern.js", input.getName());
    Assert.assertTrue(input.isExtern());
    Assert.assertEquals(input, compiler.getInput(input.getInputId()));

    compiler.removeExternInput(input.getInputId());
    Assert.assertNull(compiler.getInput(input.getInputId()));

    compiler.removeExternInput(new InputId("non_existent.js"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInput_conflictThrows() {
    compiler.init(Lists.<SourceFile>newArrayList(), Lists.<SourceFile>newArrayList(), options);
    compiler.parseInputs();

    compiler.newExternInput("conflict.js");
    compiler.newExternInput("conflict.js");
  }

  @Test
  public void testAddNewScriptAndReplaceScript() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("main.js", "var x = 1;");
    compiler.compile(extern, input, options);

    JsAst newAst = new JsAst(SourceFile.fromCode("extra.js", "var y = 2;"));
    boolean added = compiler.addNewSourceAst(newAst);
    Assert.assertTrue(added);

    boolean duplicateAdded = compiler.addNewSourceAst(newAst);
    Assert.assertFalse(duplicateAdded);

    JsAst replaceAst = new JsAst(SourceFile.fromCode("main.js", "var x = 99;"));
    compiler.replaceScript(replaceAst);
    Assert.assertEquals("main.js", compiler.getInput(new InputId("main.js")).getName());

    JsAst brandNewAst = new JsAst(SourceFile.fromCode("added_via_script.js", "var z = 3;"));
    compiler.addNewScript(brandNewAst);
    Assert.assertNotNull(compiler.getInput(new InputId("added_via_script.js")));
  }

  @Test
  public void testStateSaveAndRestore() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("main.js", "var x = 1;");
    compiler.compile(extern, input, options);

    Compiler.IntermediateState state = compiler.getState();
    Assert.assertNotNull(state);

    Compiler newCompiler = new Compiler();
    newCompiler.init(Lists.newArrayList(extern), Lists.newArrayList(input), options);
    newCompiler.setState(state);
    Assert.assertEquals(state.externsRoot, newCompiler.externsRoot);
  }

  @Test
  public void testGetSourceLineAndRegion() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("main.js", "line 1\nline 2\nline 3");
    compiler.compile(extern, input, options);

    Assert.assertNull(compiler.getSourceLine("main.js", 0));
    Assert.assertNull(compiler.getSourceLine("main.js", -1));
    Assert.assertNull(compiler.getSourceRegion("main.js", 0));
    Assert.assertNull(compiler.getSourceRegion("main.js", -1));

    Assert.assertEquals("line 2", compiler.getSourceLine("main.js", 2));
    Assert.assertNotNull(compiler.getSourceRegion("main.js", 2));

    Assert.assertNull(compiler.getSourceLine("unknown.js", 1));
    Assert.assertNull(compiler.getSourceRegion("unknown.js", 1));
  }

  @Test
  public void testDotGraph() throws IOException {
    Assert.assertEquals("", compiler.getAstDotGraph());

    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("main.js", "function foo() { return 1; }");
    compiler.compile(extern, input, options);

    String dotGraph = compiler.getAstDotGraph();
    Assert.assertNotNull(dotGraph);
    Assert.assertTrue(dotGraph.contains("digraph"));
  }

  @Test
  public void testChangeHandlerAndUniqueNameSupplier() {
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

    compiler.removeChangeHandler(handler);
    changed[0] = false;
    compiler.reportCodeChange();
    Assert.assertFalse(changed[0]);

    com.google.common.base.Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
    Assert.assertEquals("0", supplier.get());
    Assert.assertEquals("1", supplier.get());
    compiler.resetUniqueNameId();
    Assert.assertEquals("0", supplier.get());
  }

  @Test
  public void testTypeRegistryAndSymbolTable() {
    SourceFile extern = SourceFile.fromCode("extern.js", "/** @type {number} */ var num;");
    SourceFile input = SourceFile.fromCode("main.js", "/** @type {string} */ var str = 'hello';");
    options.checkTypes = true;
    compiler.compile(extern, input, options);

    Assert.assertNotNull(compiler.getTypeRegistry());
    Assert.assertNotNull(compiler.getTypeValidator());
    Assert.assertNotNull(compiler.getReverseAbstractInterpreter());

    SymbolTable st = compiler.buildKnownSymbolTable();
    Assert.assertNotNull(st);
  }

  @Test
  public void testAreNodesEqualForInlining() {
    Node n1 = Node.newString("a");
    Node n2 = Node.newString("a");
    Assert.assertTrue(compiler.areNodesEqualForInlining(n1, n2));

    options.ambiguateProperties = true;
    Assert.assertTrue(compiler.areNodesEqualForInlining(n1, n2));
  }

  @Test
  public void testInliningForbiddenAndCodingConvention() {
    options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
    Assert.assertTrue(compiler.isInliningForbidden());

    options.propertyRenaming = PropertyRenamingPolicy.OFF;
    Assert.assertFalse(compiler.isInliningForbidden());

    Assert.assertNotNull(compiler.getCodingConvention());
    Assert.assertFalse(compiler.isIdeMode());
    Assert.assertFalse(compiler.acceptConstKeyword());
  }

  @Test
  public void testErrorReportingAndLevels() {
    DiagnosticType customDiag = DiagnosticType.error("JSC_CUSTOM_ERR", "custom msg");
    JSError error = JSError.make("test.js", 1, 1, customDiag);
    compiler.initOptions(options);

    compiler.report(error);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertTrue(compiler.hasHaltingErrors());
    Assert.assertNotNull(compiler.getErrorLevel(error));
  }

  @Test(expected = RuntimeException.class)
  public void testThrowInternalError() {
    compiler.throwInternalError("Test internal crash", new IllegalStateException("cause"));
  }

  @Test
  public void testLoggingAndDebugLog() {
    Compiler.setLoggingLevel(Level.OFF);
    compiler.addToDebugLog("test debug message");
  }

  @Test
  public void testReleaseInfo() {
    Assert.assertNotNull(Compiler.getReleaseVersion());
    Assert.assertNotNull(Compiler.getReleaseDate());
  }

  @Test
  public void testRunCallableWithLargeStack() {
    String res = Compiler.runCallableWithLargeStack(new java.util.concurrent.Callable<String>() {
      @Override
      public String call() {
        return "success";
      }
    });
    Assert.assertEquals("success", res);
  }

  @Test
  public void testRebuildInputsFromModulesAndGetters() {
    JSModule module = new JSModule("mod");
    module.add(SourceFile.fromCode("input.js", "var x = 1;"));
    compiler.initModules(
        Lists.<SourceFile>newArrayList(),
        Lists.newArrayList(module),
        options);

    Assert.assertEquals(1, compiler.getInputsInOrder().size());
    Assert.assertEquals(1, compiler.getInputsById().size());
    Assert.assertEquals(0, compiler.getExternsInOrder().size());
    Assert.assertNotNull(compiler.getInputsForTesting());
    Assert.assertNotNull(compiler.getExternsForTesting());

    compiler.rebuildInputsFromModules();
    Assert.assertEquals(1, compiler.getInputsInOrder().size());
  }

  @Test
  public void testCssRenamingMapAndRegExpReferences() {
    CssRenamingMap map = new CssRenamingMap() {
      @Override
      public String get(String value) {
        return value;
      }
      @Override
      public CssRenamingMap.Style getStyle() {
        return CssRenamingMap.Style.BY_WHOLE;
      }
    };
    compiler.setCssRenamingMap(map);
    Assert.assertEquals(map, compiler.getCssRenamingMap());

    Assert.assertTrue(compiler.hasRegExpGlobalReferences());
    compiler.setHasRegExpGlobalReferences(false);
    Assert.assertFalse(compiler.hasRegExpGlobalReferences());
  }

  @Test
  public void testGetSynthesizedExternsInput() {
    compiler.init(Lists.<SourceFile>newArrayList(), Lists.<SourceFile>newArrayList(), options);
    compiler.parseInputs();

    CompilerInput synth = compiler.getSynthesizedExternsInput();
    Assert.assertNotNull(synth);
    Assert.assertEquals(Compiler.SYNTHETIC_EXTERNS, synth.getName());
    Assert.assertEquals(synth, compiler.getSynthesizedExternsInput());
  }

  @Test
  public void testProcessDefines_andNormalize_andComputeCFG() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "/** @define {boolean} */ var DEF = true; if (DEF) { var y = 2; }");
    compiler.compile(extern, input, options);

    compiler.processDefines();
    compiler.normalize();
    ControlFlowGraph<Node> cfg = compiler.computeCFG();
    Assert.assertNotNull(cfg);

    Node root = compiler.getRoot();
    Assert.assertNotNull(root);
    compiler.prepareAst(root);
  }

  @Test
  public void testEnsureLibraryInjected() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, options);

    Node baseNode = compiler.ensureLibraryInjected("base");
    Assert.assertNotNull(baseNode);

    Node cachedNode = compiler.ensureLibraryInjected("base");
    Assert.assertNull(cachedNode);
  }

  @Test
  public void testStripCodeAndRemoveTryCatch() {
    compiler.initOptions(options);
    compiler.parseTestCode("try { var x = 1; } catch(e) {} finally {}");
    compiler.removeTryCatchFinally();

    compiler.stripCode(
        Collections.singleton("goog.debug"),
        Collections.singleton("Logger"),
        Collections.singleton("goog.debug"),
        Collections.singleton("dbg_"));
  }

  @Test
  public void testNodeForCodeInsertion_noModule() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    Node node = compiler.getNodeForCodeInsertion(null);
    Assert.assertNotNull(node);
  }

  @Test(expected = IllegalStateException.class)
  public void testNodeForCodeInsertion_emptyModuleThrows() {
    JSModule emptyMod = new JSModule("emptyMod");
    compiler.getNodeForCodeInsertion(emptyMod);
  }

  @Test
  public void testUpdateGlobalVarReferences() {
    compiler.init(Lists.<SourceFile>newArrayList(), Lists.<SourceFile>newArrayList(), options);
    Node script = new Node(Token.SCRIPT);
    compiler.updateGlobalVarReferences(Collections.<Scope.Var, ReferenceCollectingCallback.ReferenceCollection>emptyMap(), script);
    Assert.assertNotNull(compiler.getGlobalVarReferences());
  }

  @Test
  public void testCreateFillFileName() {
    String name = Compiler.createFillFileName("testModule");
    Assert.assertEquals("[testModule]", name);
  }

  @Test
  public void testDefaultErrorReporter() {
    Assert.assertNotNull(compiler.getDefaultErrorReporter());
  }
}
