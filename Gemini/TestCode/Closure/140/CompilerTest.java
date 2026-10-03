package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

public class CompilerTest {

  @Test
  public void testConstructor_default_initializesCorrectly() {
    Compiler compiler = new Compiler();
    Assert.assertNotNull(compiler.getTypeValidator());
    Assert.assertNotNull(compiler.getDefaultErrorReporter());
    Assert.assertFalse(compiler.isNormalized());
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
  public void testConstructor_withErrorManager_initializesCorrectly() {
    BasicErrorManager customManager = new LoggerErrorManager(new LightweightMessageFormatter(null), null);
    Compiler compiler = new Compiler(customManager);
    Assert.assertSame(customManager, compiler.getErrorManager());
  }

  @Test(expected = NullPointerException.class)
  public void testSetErrorManager_null_throwsException() {
    Compiler compiler = new Compiler();
    compiler.setErrorManager(null);
  }

  @Test
  public void testAcquireSymbolTable_returnsTableAndAcquires() {
    Compiler compiler = new Compiler();
    SymbolTable st1 = compiler.acquireSymbolTable();
    Assert.assertNotNull(st1);
    SymbolTable st2 = compiler.acquireSymbolTable();
    Assert.assertSame(st1, st2);
  }

  @Test
  public void testInitOptions_createsAppropriateErrorManager() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Assert.assertNotNull(compiler.getErrorManager());
    Assert.assertSame(options, compiler.getOptions());
  }

  @Test
  public void testInit_filesAndOptions_initializesInputsAndRoots() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("externs.js", "var window;")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("input.js", "var a = 1;")
    };
    compiler.init(externs, inputs, options);

    Assert.assertNotNull(compiler.getInput("externs.js"));
    Assert.assertNotNull(compiler.getInput("input.js"));
    Assert.assertNull(compiler.getInput("nonexistent.js"));
  }

  @Test
  public void testInit_duplicateInputs_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("dup.js", "var window;"),
        JSSourceFile.fromCode("dup.js", "var document;")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("in.js", "var a = 1;"),
        JSSourceFile.fromCode("in.js", "var b = 2;")
    };
    compiler.init(externs, inputs, options);
    Assert.assertTrue(compiler.hasErrors());
    Assert.assertEquals(2, compiler.getErrorCount());
  }

  @Test
  public void testInit_modules_initializesCorrectly() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("externs.js", "var window;")
    };

    JSModule mod1 = new JSModule("m1");
    mod1.add(JSSourceFile.fromCode("input1.js", "var x = 1;"));
    JSModule mod2 = new JSModule("m2");
    mod2.add(JSSourceFile.fromCode("input2.js", "var y = 2;"));
    mod2.addDependency(mod1);

    compiler.init(externs, new JSModule[] { mod1, mod2 }, options);
    Assert.assertNotNull(compiler.getModuleGraph());
    Assert.assertNotNull(compiler.getInput("input1.js"));
    Assert.assertNotNull(compiler.getInput("input2.js"));
  }

  @Test
  public void testInit_emptyModules_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[0], new JSModule[0], options);
    Assert.assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInit_emptyRootModule_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule mod1 = new JSModule("m1");
    compiler.init(new JSSourceFile[0], new JSModule[] { mod1 }, options);
    Assert.assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInit_duplicateInputInModules_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule mod1 = new JSModule("m1");
    mod1.add(JSSourceFile.fromCode("shared.js", "var a = 1;"));
    JSModule mod2 = new JSModule("m2");
    mod2.add(JSSourceFile.fromCode("shared.js", "var b = 2;"));

    compiler.init(new JSSourceFile[0], new JSModule[] { mod1, mod2 }, options);
    Assert.assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInit_circularModuleDependencies_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule mod1 = new JSModule("m1");
    mod1.add(JSSourceFile.fromCode("input1.js", "var a = 1;"));
    JSModule mod2 = new JSModule("m2");
    mod2.add(JSSourceFile.fromCode("input2.js", "var b = 2;"));
    mod1.addDependency(mod2);
    mod2.addDependency(mod1);

    compiler.init(new JSSourceFile[0], new JSModule[] { mod1, mod2 }, options);
    Assert.assertTrue(compiler.hasErrors());
  }

  @Test
  public void testRebuildInputsFromModules_updatesInputs() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule mod1 = new JSModule("m1");
    mod1.add(JSSourceFile.fromCode("input1.js", "var a = 1;"));
    compiler.init(new JSSourceFile[0], new JSModule[] { mod1 }, options);

    mod1.add(JSSourceFile.fromCode("input2.js", "var b = 2;"));
    compiler.rebuildInputsFromModules();
    Assert.assertNotNull(compiler.getInput("input2.js"));
  }

  @Test
  public void testCompile_singleExternAndInput_compilesSuccessfully() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var customGlobal;");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "function test() { var x = 10; return x; }");

    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
    Assert.assertNotNull(compiler.getRoot());
    Assert.assertTrue(compiler.toSource().contains("function test"));
  }

  @Test
  public void testCompile_singleExternMultipleInputs_compilesSuccessfully() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("in1.js", "var a = 1;"),
        JSSourceFile.fromCode("in2.js", "var b = 2;")
    };

    Result result = compiler.compile(extern, inputs, options);
    Assert.assertTrue(result.success);
    String[] sources = compiler.toSourceArray();
    Assert.assertEquals(2, sources.length);
  }

  @Test
  public void testCompile_singleExternModuleArray_compilesSuccessfully() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSModule mod = new JSModule("m1");
    mod.add(JSSourceFile.fromCode("in1.js", "var a = 1;"));
    JSModule[] modules = new JSModule[] { mod };

    Result result = compiler.compile(extern, modules, options);
    Assert.assertTrue(result.success);
    Assert.assertEquals("var a=1;", compiler.toSource(mod).trim());
    String[] modSources = compiler.toSourceArray(mod);
    Assert.assertEquals(1, modSources.length);
  }

  @Test(expected = IllegalStateException.class)
  public void testCompile_calledTwice_throwsException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    compiler.compile(extern, input, options);
    compiler.compile(extern, input, options);
  }

  @Test
  public void testCompile_withSyntaxError_returnsFailedResult() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = ;");
    Result result = compiler.compile(extern, input, options);
    Assert.assertFalse(result.success);
    Assert.assertTrue(compiler.hasErrors());
    Assert.assertTrue(compiler.getErrors().length > 0);
    Assert.assertEquals(compiler.getErrors().length, compiler.getMessages().length);
  }

  @Test
  public void testCompile_disableThreads_executesOnCallingThread() {
    Compiler compiler = new Compiler();
    compiler.disableThreads();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_withDevModeEveryPass_runsSanityChecks() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.devMode = DevMode.EVERY_PASS;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_withDevModeStartAndEnd_runsSanityChecks() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.devMode = DevMode.START_AND_END;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_withTracerAll_runsPerformanceTracker() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.tracer = TracerMode.ALL;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
    Assert.assertNotNull(compiler.tracker);
  }

  @Test
  public void testCompile_nameAnonymousFunctionsOnly_runsPartialPasses() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.nameAnonymousFunctionsOnly = true;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var f = function() {};");
    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_skipAllPasses_skipsChecksAndOptimizations() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.skipAllPasses = true;
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_withOptionsForStripAndRemoveTryCatch_compiles() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.removeTryCatchFinally = true;
    options.stripTypes = new HashSet<String>();
    options.stripTypes.add("goog.debug.Logger");
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "try { var x = 1; } catch (e) {}");
    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
  }

  @Test
  public void testCompile_withSourceMapAndInputDelimiter_rendersHeaders() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.sourceMapOutputPath = "test.map";
    options.printInputDelimiter = true;
    options.inputDelimiter = "// [%name% : %num%]";
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var x = 1;");
    Result result = compiler.compile(extern, input, options);
    Assert.assertTrue(result.success);
    Assert.assertNotNull(compiler.getSourceMap());
  }

  @Test
  public void testPassConfig_customPassConfig_setAndGet() {
    Compiler compiler = new Compiler();
    PassConfig passConfig = new DefaultPassConfig(new CompilerOptions());
    compiler.setPassConfig(passConfig);
    Assert.assertSame(passConfig, compiler.getPassConfig());
  }

  @Test(expected = NullPointerException.class)
  public void testSetPassConfig_null_throwsException() {
    Compiler compiler = new Compiler();
    compiler.setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfig_twice_throwsException() {
    Compiler compiler = new Compiler();
    PassConfig passConfig = new DefaultPassConfig(new CompilerOptions());
    compiler.setPassConfig(passConfig);
    compiler.setPassConfig(passConfig);
  }

  @Test
  public void testNewExternInput_addsNewInputAndNode() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { JSSourceFile.fromCode("in.js", "var a = 1;") }, options);
    compiler.parseInputs();

    CompilerInput newInput = compiler.newExternInput("synthetic_extern.js");
    Assert.assertNotNull(newInput);
    Assert.assertSame(newInput, compiler.getInput("synthetic_extern.js"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInput_duplicateName_throwsException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("ext.js", "") }, new JSSourceFile[0], options);
    compiler.parseInputs();
    compiler.newExternInput("ext.js");
  }

  @Test
  public void testAddIncrementalSourceAst_addsInputSuccessfully() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[0], new JSSourceFile[0], options);
    JsAst ast = new JsAst(JSSourceFile.fromCode("incremental.js", "var inc = 1;"));
    compiler.addIncrementalSourceAst(ast);
    Assert.assertNotNull(compiler.getInput("incremental.js"));
  }

  @Test
  public void testParseSyntheticCode_parsesAndReturnsNode() {
    Compiler compiler = new Compiler();
    Node node = compiler.parseSyntheticCode("var synt = 123;");
    Assert.assertNotNull(node);
    Node namedNode = compiler.parseSyntheticCode("customName.js", "var x = 456;");
    Assert.assertNotNull(namedNode);
  }

  @Test
  public void testParseTestCode_parsesAndReturnsNode() {
    Compiler compiler = new Compiler();
    Node node = compiler.parseTestCode("function testCode() {}");
    Assert.assertNotNull(node);
  }

  @Test
  public void testParse_singleFile_parsesAndReturnsNode() {
    Compiler compiler = new Compiler();
    JSSourceFile file = JSSourceFile.fromCode("single.js", "var single = 1;");
    Node node = compiler.parse(file);
    Assert.assertNotNull(node);
  }

  @Test
  public void testGetUniqueNameIdSupplier_generatesSequentialIds() {
    Compiler compiler = new Compiler();
    Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
    Assert.assertEquals("0", supplier.get());
    Assert.assertEquals("1", supplier.get());
    compiler.resetUniqueNameId();
    Assert.assertEquals("0", supplier.get());
  }

  @Test
  public void testNormalizedState_getSetUnset() {
    Compiler compiler = new Compiler();
    Assert.assertFalse(compiler.isNormalized());
    compiler.setNormalized();
    Assert.assertTrue(compiler.isNormalized());
    compiler.setUnnormalized();
    Assert.assertFalse(compiler.isNormalized());
  }

  @Test
  public void testAreNodesEqualForInlining_comparesNodes() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node n1 = compiler.parseTestCode("var x = 1;");
    Node n2 = compiler.parseTestCode("var x = 1;");
    Node n3 = compiler.parseTestCode("var y = 2;");

    Assert.assertTrue(compiler.areNodesEqualForInlining(n1, n2));
    Assert.assertFalse(compiler.areNodesEqualForInlining(n1, n3));

    options.ambiguateProperties = true;
    Assert.assertTrue(compiler.areNodesEqualForInlining(n1, n2));
  }

  @Test
  public void testTypeRegistryAndValidator_gettersReturnNonNull() {
    Compiler compiler = new Compiler();
    JSTypeRegistry registry = compiler.getTypeRegistry();
    Assert.assertNotNull(registry);
    Assert.assertSame(registry, compiler.getTypeRegistry());
    Assert.assertNotNull(compiler.getTypeValidator());
  }

  @Test
  public void testReverseAbstractInterpreter_createsInterpreter() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = true;
    compiler.initOptions(options);

    ReverseAbstractInterpreter rai = compiler.getReverseAbstractInterpreter();
    Assert.assertNotNull(rai);
  }

  @Test
  public void testCodingConventionAndIdeMode() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ideMode = true;
    compiler.initOptions(options);

    Assert.assertTrue(compiler.isIdeMode());
    Assert.assertNotNull(compiler.getCodingConvention());
    Assert.assertNotNull(compiler.getParserConfig());
    Assert.assertFalse(compiler.isTypeCheckingEnabled());
  }

  @Test
  public void testCssRenamingMap_getSet() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    CssRenamingMap map = new CssRenamingMap() {
      public String get(String value) {
        return value + "-renamed";
      }
    };
    compiler.setCssRenamingMap(map);
    Assert.assertSame(map, compiler.getCssRenamingMap());
  }

  @Test
  public void testComputeCFG_generatesControlFlowGraph() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "if (x) { y(); } else { z(); }");
    compiler.compile(extern, input, options);

    ControlFlowGraph<Node> cfg = compiler.computeCFG();
    Assert.assertNotNull(cfg);
  }

  @Test
  public void testPrepareAst_processesNode() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node node = compiler.parseTestCode("var a = 1;");
    compiler.prepareAst(node);
  }

  @Test
  public void testCodeChangeHandlers_addRemoveAndReport() {
    Compiler compiler = new Compiler();
    final boolean[] changed = new boolean[1];
    CodeChangeHandler handler = new CodeChangeHandler() {
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
  public void testGetSourceLineAndRegion() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile input = JSSourceFile.fromCode("test.js", "line 1\nline 2\nline 3");
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { input }, options);

    Assert.assertNull(compiler.getSourceLine("test.js", 0));
    Assert.assertNull(compiler.getSourceLine("test.js", -1));
    Assert.assertEquals("line 1", compiler.getSourceLine("test.js", 1));
    Assert.assertEquals("line 2", compiler.getSourceLine("test.js", 2));
    Assert.assertNull(compiler.getSourceLine("nonexistent.js", 1));

    Assert.assertNull(compiler.getSourceRegion("test.js", 0));
    Assert.assertNull(compiler.getSourceRegion("nonexistent.js", 1));
    Region region = compiler.getSourceRegion("test.js", 2);
    Assert.assertNotNull(region);
  }

  @Test
  public void testGetNodeForCodeInsertion() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule mod1 = new JSModule("m1");
    mod1.add(JSSourceFile.fromCode("m1_in.js", "var m1 = 1;"));
    JSModule mod2 = new JSModule("m2");
    mod2.add(JSSourceFile.fromCode("m2_in.js", "var m2 = 2;"));
    mod2.addDependency(mod1);

    compiler.init(new JSSourceFile[0], new JSModule[] { mod1, mod2 }, options);
    compiler.parseInputs();

    Node rootNode = compiler.getNodeForCodeInsertion(null);
    Assert.assertNotNull(rootNode);

    Node mod1Node = compiler.getNodeForCodeInsertion(mod1);
    Assert.assertNotNull(mod1Node);

    Node mod2Node = compiler.getNodeForCodeInsertion(mod2);
    Assert.assertNotNull(mod2Node);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertion_noInputs_throwsException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[0], new JSSourceFile[0], options);
    compiler.getNodeForCodeInsertion(null);
  }

  @Test
  public void testGetAstDotGraph() throws IOException {
    Compiler compiler = new Compiler();
    Assert.assertEquals("", compiler.getAstDotGraph());

    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    compiler.compile(extern, input, options);

    String dotGraph = compiler.getAstDotGraph();
    Assert.assertNotNull(dotGraph);
    Assert.assertTrue(dotGraph.contains("digraph"));
  }

  @Test
  public void testGetAndSetState_savesAndRestoresState() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    compiler.compile(extern, input, options);

    Compiler.IntermediateState state = compiler.getState();
    Assert.assertNotNull(state);

    Compiler compiler2 = new Compiler();
    compiler2.initOptions(options);
    compiler2.setState(state);

    Assert.assertNotNull(compiler2.getRoot());
    Assert.assertEquals(compiler.isNormalized(), compiler2.isNormalized());
  }

  @Test(expected = RuntimeException.class)
  public void testThrowInternalError_throwsRuntimeException() {
    Compiler compiler = new Compiler();
    compiler.throwInternalError("Test error", new IllegalArgumentException("cause"));
  }

  @Test
  public void testSetLoggingLevel() {
    Compiler.setLoggingLevel(Level.WARNING);
  }

  @Test
  public void testCodeBuilder_variousOperations() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    Assert.assertEquals(0, cb.getLength());
    Assert.assertEquals(0, cb.getLineIndex());
    Assert.assertEquals(0, cb.getColumnIndex());
    Assert.assertTrue(cb.endsWith(""));

    cb.append("hello\nworld");
    Assert.assertEquals(11, cb.getLength());
    Assert.assertEquals(1, cb.getLineIndex());
    Assert.assertEquals(5, cb.getColumnIndex());
    Assert.assertTrue(cb.endsWith("world"));
    Assert.assertFalse(cb.endsWith("hello"));

    cb.reset();
    Assert.assertEquals(0, cb.getLength());
    Assert.assertEquals(1, cb.getLineIndex());
  }

  @Test
  public void testProcessDefines_runsWithoutError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "/** @define {boolean} */ var DEF = true;");
    compiler.compile(extern, input, options);
    compiler.processDefines();
  }

  @Test
  public void testToSource_emptyModule_returnsEmptyString() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule mod = new JSModule("empty");
    compiler.init(new JSSourceFile[0], new JSModule[] { mod }, options);

    String src = compiler.toSource(mod);
    Assert.assertEquals("", src);

    String[] srcArray = compiler.toSourceArray(mod);
    Assert.assertEquals(0, srcArray.length);
  }
}
