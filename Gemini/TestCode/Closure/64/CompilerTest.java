package com.google.javascript.jscomp;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.Compiler.CodeBuilder;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public class CompilerTest {

  @Test
  public void testConstructor_default_initializesCorrectly() {
    Compiler compiler = new Compiler();
    Assert.assertNotNull(compiler.getErrorManager());
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testConstructor_withPrintStream_initializesCorrectly() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    Compiler compiler = new Compiler(ps);
    Assert.assertNotNull(compiler.getErrorManager());
  }

  @Test
  public void testConstructor_withCustomErrorManager_initializesCorrectly() {
    PrintStreamErrorManager errorManager =
        new PrintStreamErrorManager(new LightweightMessageFormatter(new Compiler()), System.err);
    Compiler compiler = new Compiler(errorManager);
    Assert.assertSame(errorManager, compiler.getErrorManager());
  }

  @Test(expected = NullPointerException.class)
  public void testSetErrorManager_null_throwsException() {
    Compiler compiler = new Compiler();
    compiler.setErrorManager(null);
  }

  @Test
  public void testInitOptions_variousOptions_configuredProperly() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    options.checkGlobalThisLevel = CheckLevel.ERROR;
    options.checkSymbols = false;
    options.sourceMapOutputPath = "%outname%.map";
    options.tracer = TracerMode.ALL;

    compiler.initOptions(options);

    Assert.assertSame(options, compiler.getOptions());
    Assert.assertTrue(compiler.isTypeCheckingEnabled());
    Assert.assertNotNull(compiler.getErrorManager());
  }

  @Test
  public void testInitOptions_diagnosticGroupsTypeCheck_enablesAndDisables() {
    Compiler compiler = new Compiler();
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
  public void testCompile_singleFile_success() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "function alert(x) {}");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1 + 2; alert(a);");

    Result result = compiler.compile(extern, input, options);

    Assert.assertTrue(result.success);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(compiler.getRoot());
    Assert.assertNotNull(compiler.toSource());
    Assert.assertTrue(compiler.toSource().contains("alert"));
  }

  @Test
  public void testCompile_sourceFileArrays_success() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("extern.js", "var window;")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("input1.js", "var x = 1;"),
        JSSourceFile.fromCode("input2.js", "var y = 2;")
    };

    Result result = compiler.compile(externs, inputs, options);

    Assert.assertTrue(result.success);
    String[] sources = compiler.toSourceArray();
    Assert.assertEquals(2, sources.length);
  }

  @Test
  public void testCompile_sourceFileList_success() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = Lists.newArrayList(
        JSSourceFile.fromCode("extern.js", "")
    );
    List<JSSourceFile> inputs = Lists.newArrayList(
        JSSourceFile.fromCode("input.js", "function foo() { return 42; }")
    );

    Result result = compiler.compile(externs, inputs, options);

    Assert.assertTrue(result.success);
    Assert.assertEquals(1, compiler.getInputsForTesting().size());
    Assert.assertEquals(1, compiler.getExternsForTesting().size());
  }

  @Test
  public void testCompile_singleExternMultipleInputsArray_success() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("in.js", "var z = 3;")
    };

    Result result = compiler.compile(extern, inputs, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_modules_success() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    JSModule mod1 = new JSModule("m1");
    mod1.add(JSSourceFile.fromCode("m1.js", "var m1_var = 1;"));

    JSModule mod2 = new JSModule("m2");
    mod2.add(JSSourceFile.fromCode("m2.js", "var m2_var = 2;"));
    mod2.addDependency(mod1);

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    Result result = compiler.compile(extern, new JSModule[] { mod1, mod2 }, options);

    Assert.assertTrue(result.success);
    Assert.assertNotNull(compiler.getModuleGraph());
    String srcMod1 = compiler.toSource(mod1);
    Assert.assertTrue(srcMod1.contains("m1_var"));

    String[] srcMod2Arr = compiler.toSourceArray(mod2);
    Assert.assertEquals(1, srcMod2Arr.length);
  }

  @Test
  public void testCompile_modulesArrayWithExternsArray_success() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile[] externs = new JSSourceFile[] { JSSourceFile.fromCode("ext.js", "") };
    JSModule mod = new JSModule("main");
    mod.add(JSSourceFile.fromCode("main.js", "var a = 1;"));

    Result result = compiler.compile(externs, new JSModule[] { mod }, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_modulesList_success() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = Lists.newArrayList(JSSourceFile.fromCode("ext.js", ""));
    JSModule mod = new JSModule("root");
    mod.add(JSSourceFile.fromCode("root.js", "var val = 10;"));
    List<JSModule> modules = Lists.newArrayList(mod);

    Result result = compiler.compileModules(externs, modules, options);
    Assert.assertTrue(result.success);
  }

  @Test(expected = IllegalStateException.class)
  public void testCompile_calledTwice_throwsException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");

    compiler.compile(extern, input, options);
    compiler.compile(extern, input, options);
  }

  @Test
  public void testCompile_emptyModuleList_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = Lists.newArrayList();
    List<JSModule> modules = Lists.newArrayList();

    Result result = compiler.compileModules(externs, modules, options);

    Assert.assertFalse(result.success);
    Assert.assertTrue(compiler.hasErrors());
  }

  @Test
  public void testCompile_emptyRootModuleInMultiModule_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = Lists.newArrayList();

    JSModule mod1 = new JSModule("mod1");
    JSModule mod2 = new JSModule("mod2");
    mod2.add(JSSourceFile.fromCode("m2.js", "var y = 2;"));
    mod2.addDependency(mod1);

    List<JSModule> modules = Lists.newArrayList(mod1, mod2);
    Result result = compiler.compileModules(externs, modules, options);

    Assert.assertFalse(result.success);
    Assert.assertTrue(compiler.hasErrors());
  }

  @Test
  public void testCompile_duplicateInput_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile[] externs = new JSSourceFile[0];
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("dup.js", "var x = 1;"),
        JSSourceFile.fromCode("dup.js", "var x = 2;")
    };

    Result result = compiler.compile(externs, inputs, options);
    Assert.assertFalse(result.success);
    Assert.assertTrue(compiler.hasErrors());
  }

  @Test
  public void testCompile_duplicateExternInput_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("dupExt.js", "var x;"),
        JSSourceFile.fromCode("dupExt.js", "var y;")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("in.js", "var z = 3;")
    };

    Result result = compiler.compile(externs, inputs, options);
    Assert.assertFalse(result.success);
    Assert.assertTrue(compiler.hasErrors());
  }

  @Test
  public void testCompile_withDevModeStartAndEnd() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.devMode = DevMode.START_AND_END;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_withDevModeEveryPass() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.devMode = DevMode.EVERY_PASS;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_withSkipAllPasses() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.skipAllPasses = true;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_withNameAnonymousFunctionsOnly() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.nameAnonymousFunctionsOnly = true;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var f = function() {};");

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_withIdeMode() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ideMode = true;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
    Assert.assertTrue(compiler.isIdeMode());
  }

  @Test
  public void testCompile_withRecordFunctionInformation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.recordFunctionInformation = true;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function test() {}");

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
    Assert.assertNotNull(compiler.getFunctionalInformationMap());
  }

  @Test
  public void testCompile_withRemoveTryCatchFinally() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.removeTryCatchFinally = true;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "try { var a = 1; } catch(e) {}");

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_withStripCodeOptions() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.stripTypes.add("goog.debug.Logger");
    options.stripNameSuffixes.add("logger");
    options.stripTypePrefixes.add("goog.debug");
    options.stripNamePrefixes.add("debug_");
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var debug_var = 1;");

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_withExternExports() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.externExportsPath = "exports.js";
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "function googExport(a, b) {}");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "googExport('foo', 123);");

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_manageClosureDependencies() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.manageClosureDependencies = true;
    options.manageClosureDependenciesEntryPoints = Lists.newArrayList("app");
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "function googProvide(a) {}");
    JSSourceFile input1 = JSSourceFile.fromCode("lib.js", "goog.provide('lib'); var libVal = 1;");
    JSSourceFile input2 = JSSourceFile.fromCode("app.js", "goog.provide('app'); goog.require('lib'); var appVal = libVal;");

    Result result = compiler.compile(extern, new JSSourceFile[] { input2, input1 }, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_jsdocExternsAndNoCompile() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule mod = new JSModule("mod");
    mod.add(JSSourceFile.fromCode("ext.js", "/** @externs */ var externVar;"));
    mod.add(JSSourceFile.fromCode("nocompile.js", "/** @nocompile */ var ignoredVar = 1;"));
    mod.add(JSSourceFile.fromCode("code.js", "var normalVar = 2;"));

    Result result = compiler.compileModules(
        Lists.<JSSourceFile>newArrayList(), Lists.newArrayList(mod), options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testDisableThreads() {
    Compiler compiler = new Compiler();
    compiler.disableThreads();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testParseSyntheticCode_andTestCode() {
    Compiler compiler = new Compiler();
    Node node = compiler.parseSyntheticCode("var synth = 1;");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.SCRIPT, node.getType());

    Node node2 = compiler.parseSyntheticCode("custom.js", "var custom = 2;");
    Assert.assertNotNull(node2);

    Node node3 = compiler.parseTestCode("var test = 3;");
    Assert.assertNotNull(node3);
  }

  @Test
  public void testParse_sourceFile() {
    Compiler compiler = new Compiler();
    JSSourceFile file = JSSourceFile.fromCode("file.js", "var x = 100;");
    Node root = compiler.parse(file);
    Assert.assertNotNull(root);
  }

  @Test
  public void testSetPassConfig() {
    Compiler compiler = new Compiler();
    PassConfig passConfig = compiler.createPassConfigInternal();
    compiler.setPassConfig(passConfig);
    Assert.assertSame(passConfig, compiler.getPassConfig());
  }

  @Test(expected = NullPointerException.class)
  public void testSetPassConfig_null_throwsException() {
    Compiler compiler = new Compiler();
    compiler.setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfig_alreadyAssigned_throwsException() {
    Compiler compiler = new Compiler();
    compiler.getPassConfig(); // initializes passes
    compiler.setPassConfig(compiler.createPassConfigInternal());
  }

  @Test
  public void testNewExternInput_andGetInput_andRemoveInput() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { JSSourceFile.fromCode("in.js", "var a = 1;") }, options);
    compiler.parseInputs();

    CompilerInput input = compiler.newExternInput("syntheticExtern.js");
    Assert.assertNotNull(input);
    Assert.assertSame(input, compiler.getInput("syntheticExtern.js"));

    compiler.removeInput("syntheticExtern.js");
    Assert.assertNull(compiler.getInput("syntheticExtern.js"));

    // remove non-existent input should be safe
    compiler.removeInput("nonexistent.js");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInput_duplicateName_throwsException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { JSSourceFile.fromCode("in.js", "var a = 1;") }, options);
    compiler.parseInputs();

    compiler.newExternInput("dup.js");
    compiler.newExternInput("dup.js");
  }

  @Test
  public void testAddAndReplaceIncrementalSourceAst() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile file = JSSourceFile.fromCode("incr.js", "var incr = 1;");
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { file }, options);
    compiler.parseInputs();

    JsAst newAst = new JsAst(JSSourceFile.fromCode("incr.js", "var incr = 2;"));
    boolean replaced = compiler.replaceIncrementalSourceAst(newAst);
    Assert.assertTrue(replaced);

    JsAst addedAst = new JsAst(JSSourceFile.fromCode("new_file.js", "var newF = 3;"));
    compiler.addIncrementalSourceAst(addedAst);
    Assert.assertNotNull(compiler.getInput("new_file.js"));
  }

  @Test
  public void testReplaceIncrementalSourceAst_parseError_returnsFalse() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile file = JSSourceFile.fromCode("incr.js", "var incr = 1;");
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { file }, options);
    compiler.parseInputs();

    JsAst invalidAst = new JsAst(JSSourceFile.fromCode("incr.js", "var = ;"));
    boolean replaced = compiler.replaceIncrementalSourceAst(invalidAst);
    Assert.assertFalse(replaced);
  }

  @Test
  public void testGetTopScopeAndTypedScopeCreator() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { JSSourceFile.fromCode("in.js", "var a = 1;") }, options);
    compiler.parseInputs();
    compiler.check();

    Assert.assertNotNull(compiler.getTypeRegistry());
    Assert.assertNotNull(compiler.getReverseAbstractInterpreter());
    Assert.assertNotNull(compiler.getTypeValidator());
    Assert.assertNotNull(compiler.getTypedScopeCreator());
    Assert.assertNotNull(compiler.getTopScope());
  }

  @Test
  public void testGetReverseAbstractInterpreter_withClosurePass() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = true;
    compiler.initOptions(options);

    Assert.assertNotNull(compiler.getReverseAbstractInterpreter());
  }

  @Test
  public void testGetSourceLineAndRegion() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile file = JSSourceFile.fromCode("test.js", "line1\nline2\nline3");
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { file }, options);

    Assert.assertNull(compiler.getSourceLine("test.js", 0));
    Assert.assertNull(compiler.getSourceLine("test.js", -1));
    Assert.assertNull(compiler.getSourceLine("unknown.js", 1));
    Assert.assertEquals("line1", compiler.getSourceLine("test.js", 1));
    Assert.assertEquals("line2", compiler.getSourceLine("test.js", 2));

    Assert.assertNull(compiler.getSourceRegion("test.js", 0));
    Assert.assertNull(compiler.getSourceRegion("test.js", -5));
    Assert.assertNull(compiler.getSourceRegion("unknown.js", 1));
    Assert.assertNotNull(compiler.getSourceRegion("test.js", 1));
  }

  @Test
  public void testGetNodeForCodeInsertion_singletonAndModule() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile file = JSSourceFile.fromCode("singleton.js", "var a = 1;");
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { file }, options);
    compiler.parseInputs();

    Node insertionNode = compiler.getNodeForCodeInsertion(null);
    Assert.assertNotNull(insertionNode);

    JSModule mod = new JSModule("mod");
    mod.add(file);
    Node modInsertionNode = compiler.getNodeForCodeInsertion(mod);
    Assert.assertNotNull(modInsertionNode);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertion_emptyModule_throwsException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { JSSourceFile.fromCode("in.js", "var a = 1;") }, options);
    compiler.parseInputs();

    JSModule emptyMod = new JSModule("emptyMod");
    compiler.getNodeForCodeInsertion(emptyMod);
  }

  @Test
  public void testAreNodesEqualForInlining() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node n1 = Node.newString("foo");
    Node n2 = Node.newString("foo");
    Node n3 = Node.newString("bar");

    Assert.assertTrue(compiler.areNodesEqualForInlining(n1, n2));
    Assert.assertFalse(compiler.areNodesEqualForInlining(n1, n3));

    options.ambiguateProperties = true;
    Assert.assertTrue(compiler.areNodesEqualForInlining(n1, n2));
    Assert.assertFalse(compiler.areNodesEqualForInlining(n1, n3));
  }

  @Test
  public void testUniqueNameIdSupplier_andReset() {
    Compiler compiler = new Compiler();
    com.google.common.base.Supplier<String> supplier = compiler.getUniqueNameIdSupplier();

    Assert.assertEquals("0", supplier.get());
    Assert.assertEquals("1", supplier.get());

    compiler.resetUniqueNameId();
    Assert.assertEquals("0", supplier.get());
  }

  @Test
  public void testChangeHandler_addRemoveReport() {
    Compiler compiler = new Compiler();
    final boolean[] changed = new boolean[] { false };
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
  public void testProcessDefines_andComputeCFG_andPrepareAst() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @define {boolean} */ var DEF = true; if (DEF) { var b = 2; }");

    compiler.compile(extern, input, options);

    compiler.processDefines();
    ControlFlowGraph<Node> cfg = compiler.computeCFG();
    Assert.assertNotNull(cfg);

    Node scriptNode = compiler.getInputsForTesting().get(0).getAstRoot(compiler);
    compiler.prepareAst(scriptNode);
  }

  @Test
  public void testGetAstDotGraph() throws IOException {
    Compiler compiler = new Compiler();
    Assert.assertEquals("", compiler.getAstDotGraph());

    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    String dotGraph = compiler.getAstDotGraph();
    Assert.assertNotNull(dotGraph);
    Assert.assertTrue(dotGraph.contains("digraph"));
  }

  @Test
  public void testToSource_withDelimitersAndLicenses() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.printInputDelimiter = true;
    options.inputDelimiter = "// [%name%]";
    options.sourceMapOutputPath = "out.map";
    compiler.initOptions(options);

    Node scriptNode = new Node(Token.SCRIPT);
    scriptNode.putProp(Node.SOURCENAME_PROP, "testInput.js");
    JSDocInfo jsDocInfo = new JSDocInfo();
    jsDocInfo.setLicense("Test License");
    scriptNode.setJSDocInfo(jsDocInfo);

    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    scriptNode.addChildToBack(varNode);

    CodeBuilder cb = new CodeBuilder();
    compiler.toSource(cb, 1, scriptNode);

    String code = cb.toString();
    Assert.assertTrue(code.contains("// [testInput.js]"));
    Assert.assertTrue(code.contains("Test License"));
    Assert.assertTrue(code.contains("var x"));
  }

  @Test
  public void testToSource_moduleEmpty_returnsEmpty() {
    Compiler compiler = new Compiler();
    JSModule module = new JSModule("emptyModule");
    Assert.assertEquals("", compiler.toSource(module));
    Assert.assertEquals(0, compiler.toSourceArray(module).length);
  }

  @Test
  public void testLanguageMode_andAcceptEcmaScript5() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    options.setLanguageIn(LanguageMode.ECMASCRIPT3);
    compiler.initOptions(options);
    Assert.assertFalse(compiler.acceptEcmaScript5());
    Assert.assertEquals(LanguageMode.ECMASCRIPT3, compiler.languageMode());
    Assert.assertNotNull(compiler.getParserConfig());

    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    Assert.assertTrue(compiler.acceptEcmaScript5());
    Assert.assertNotNull(compiler.getParserConfig());

    options.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT);
    Assert.assertTrue(compiler.acceptEcmaScript5());
  }

  @Test
  public void testAcceptConstKeyword() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.acceptConstKeyword = true;
    compiler.initOptions(options);
    Assert.assertTrue(compiler.acceptConstKeyword());
  }

  @Test
  public void testCodingConvention_andCssRenamingMap() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Assert.assertNotNull(compiler.getCodingConvention());

    CssRenamingMap cssMap = new CssRenamingMap() {
      @Override
      public String get(String value) {
        return "renamed-" + value;
      }

      @Override
      public Style getStyle() {
        return Style.BY_WHOLE;
      }
    };

    compiler.setCssRenamingMap(cssMap);
    Assert.assertSame(cssMap, compiler.getCssRenamingMap());
  }

  @Test
  public void testHasRegExpGlobalReferences() {
    Compiler compiler = new Compiler();
    Assert.assertTrue(compiler.hasRegExpGlobalReferences());

    compiler.setHasRegExpGlobalReferences(false);
    Assert.assertFalse(compiler.hasRegExpGlobalReferences());
  }

  @Test
  public void testIntermediateState_saveAndRestore() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    Compiler.IntermediateState state = compiler.getState();
    Assert.assertNotNull(state);

    Compiler newCompiler = new Compiler();
    newCompiler.init(new JSSourceFile[] { extern }, new JSSourceFile[] { input }, options);
    newCompiler.setState(state);
    Assert.assertEquals(compiler.getRoot(), newCompiler.getRoot());
  }

  @Test
  public void testErrorReporting_andMessages() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSError error = JSError.make("test.js", 1, 1, CheckLevel.ERROR, DiagnosticType.error("ERR", "Test Error"));
    compiler.report(error);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(1, compiler.getErrors().length);
    Assert.assertEquals(1, compiler.getMessages().length);
    Assert.assertTrue(compiler.hasErrors());
    Assert.assertEquals(CheckLevel.ERROR, compiler.getErrorLevel(error));
  }

  @Test(expected = RuntimeException.class)
  public void testThrowInternalError_throwsException() {
    Compiler compiler = new Compiler();
    compiler.throwInternalError("Something went wrong", new IllegalStateException("Cause"));
  }

  @Test
  public void testSetLoggingLevel() {
    Compiler.setLoggingLevel(Level.WARNING);
  }

  @Test
  public void testRunCallableWithLargeStack() {
    String result = Compiler.runCallableWithLargeStack(new java.util.concurrent.Callable<String>() {
      @Override
      public String call() {
        return "success";
      }
    });
    Assert.assertEquals("success", result);
  }

  @Test
  public void testCodeBuilder_allMethods() {
    CodeBuilder cb = new CodeBuilder();
    Assert.assertEquals(0, cb.getLength());
    Assert.assertEquals(0, cb.getLineIndex());
    Assert.assertEquals(0, cb.getColumnIndex());
    Assert.assertEquals("", cb.toString());

    cb.append("hello");
    Assert.assertEquals(5, cb.getLength());
    Assert.assertEquals(0, cb.getLineIndex());
    Assert.assertEquals(5, cb.getColumnIndex());
    Assert.assertTrue(cb.endsWith("lo"));
    Assert.assertFalse(cb.endsWith("world"));
    Assert.assertFalse(cb.endsWith("longsuffixthatdoesnotmatch"));

    cb.append("\nworld\n");
    Assert.assertEquals(13, cb.getLength());
    Assert.assertEquals(2, cb.getLineIndex());
    Assert.assertEquals(0, cb.getColumnIndex());

    cb.reset();
    Assert.assertEquals(0, cb.getLength());
    Assert.assertEquals(2, cb.getLineIndex()); // line index preserved on reset
    Assert.assertEquals("", cb.toString());
  }

  @Test
  public void testIsInliningForbidden() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
    compiler.initOptions(options);
    Assert.assertTrue(compiler.isInliningForbidden());

    options.propertyRenaming = PropertyRenamingPolicy.OFF;
    Assert.assertFalse(compiler.isInliningForbidden());
  }

  @Test
  public void testUpdateGlobalVarReferences() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    Node scriptNode = compiler.getInputsForTesting().get(0).getAstRoot(compiler);
    Map<Scope.Var, ReferenceCollectingCallback.ReferenceCollection> map = Maps.newHashMap();
    compiler.updateGlobalVarReferences(map, scriptNode);

    Assert.assertNotNull(compiler.getGlobalVarReferences());
  }
}
