package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

import static org.junit.Assert.*;

public class CompilerTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
  }

  // --- Constructors & Initialization ---

  @Test
  public void testConstructor_default_initializesCorrectly() {
    Compiler comp = new Compiler();
    assertNotNull(comp.getErrorManager());
    assertNull(comp.options);
    assertNull(comp.getRoot());
  }

  @Test
  public void testConstructor_withPrintStream_initializesPrinterManager() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    Compiler comp = new Compiler(ps);
    CompilerOptions opt = new CompilerOptions();
    comp.initOptions(opt);
    assertNotNull(comp.getErrorManager());
  }

  @Test
  public void testConstructor_withErrorManager_usesCustomManager() {
    BasicErrorManager customManager = new BasicErrorManager() {
      @Override
      public void println(CheckLevel level, JSError error) {}
      @Override
      public void printSummary() {}
    };
    Compiler comp = new Compiler(customManager);
    assertSame(customManager, comp.getErrorManager());
  }

  @Test(expected = NullPointerException.class)
  public void testSetErrorManager_null_throwsException() {
    compiler.setErrorManager(null);
  }

  @Test
  public void testInitOptions_setsOptionsAndInitializesErrorManager() {
    options.sourceMapOutputPath = "%outname%.map";
    compiler.initOptions(options);
    assertSame(options, compiler.getOptions());
    assertNotNull(compiler.getErrorManager());
  }

  // --- init & initModules overloads ---

  @Test
  public void testInit_arrayInputs_success() {
    JSSourceFile[] externs = new JSSourceFile[] { JSSourceFile.fromCode("ext.js", "var ext;") };
    JSSourceFile[] inputs = new JSSourceFile[] { JSSourceFile.fromCode("in.js", "var a = 1;") };
    compiler.init(externs, inputs, options);

    assertEquals(1, compiler.getInputsForTesting().size());
    assertEquals(1, compiler.getExternsForTesting().size());
    assertNotNull(compiler.getInput("in.js"));
    assertNotNull(compiler.getInput("ext.js"));
  }

  @Test
  public void testInit_listInputs_success() {
    List<JSSourceFile> externs = Lists.newArrayList(JSSourceFile.fromCode("ext.js", "var ext;"));
    List<JSSourceFile> inputs = Lists.newArrayList(JSSourceFile.fromCode("in.js", "var b = 2;"));
    compiler.init(externs, inputs, options);

    assertEquals(1, compiler.getInputsForTesting().size());
    assertEquals(1, compiler.getExternsForTesting().size());
  }

  @Test
  public void testInit_moduleArray_success() {
    JSSourceFile[] externs = new JSSourceFile[] { JSSourceFile.fromCode("ext.js", "") };
    JSModule m1 = new JSModule("m1");
    m1.add(JSSourceFile.fromCode("m1.js", "var m1 = 1;"));
    JSModule[] modules = new JSModule[] { m1 };

    compiler.init(externs, modules, options);
    assertEquals(1, compiler.getInputsForTesting().size());
    assertNull(compiler.getModuleGraph());
  }

  @Test
  public void testInitModules_multipleModules_createsModuleGraph() {
    List<JSSourceFile> externs = Lists.newArrayList();
    JSModule m1 = new JSModule("m1");
    m1.add(JSSourceFile.fromCode("m1.js", "var m1 = 1;"));
    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    m2.add(JSSourceFile.fromCode("m2.js", "var m2 = 2;"));

    compiler.initModules(externs, Lists.newArrayList(m1, m2), options);
    assertNotNull(compiler.getModuleGraph());
    assertEquals(2, compiler.getInputsForTesting().size());
  }

  @Test
  public void testInitModules_circularDependency_reportsError() {
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    m1.addDependency(m2);
    m2.addDependency(m1);
    m1.add(JSSourceFile.fromCode("m1.js", ""));
    m2.add(JSSourceFile.fromCode("m2.js", ""));

    compiler.initModules(Lists.<JSSourceFile>newArrayList(), Lists.newArrayList(m1, m2), options);
    assertTrue(compiler.hasErrors());
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testInitModules_emptyModuleList_reportsError() {
    compiler.initModules(Lists.<JSSourceFile>newArrayList(), Lists.<JSModule>newArrayList(), options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInitModules_emptyRootModuleWithMultipleModules_reportsError() {
    JSModule root = new JSModule("root");
    JSModule child = new JSModule("child");
    child.addDependency(root);
    child.add(JSSourceFile.fromCode("child.js", "var c = 1;"));

    compiler.initModules(Lists.<JSSourceFile>newArrayList(), Lists.newArrayList(root, child), options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInit_duplicateInput_reportsError() {
    JSSourceFile[] externs = new JSSourceFile[0];
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("dup.js", "var a = 1;"),
        JSSourceFile.fromCode("dup.js", "var b = 2;")
    };
    compiler.init(externs, inputs, options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInit_duplicateExternInput_reportsError() {
    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("dup.js", "var a;"),
        JSSourceFile.fromCode("dup.js", "var b;")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("in.js", "var c = 1;")
    };
    compiler.init(externs, inputs, options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testRebuildInputsFromModules_updatesInputs() {
    JSModule m = new JSModule("m");
    m.add(JSSourceFile.fromCode("a.js", "var a = 1;"));
    compiler.initModules(Lists.<JSSourceFile>newArrayList(), Lists.newArrayList(m), options);
    assertEquals(1, compiler.getInputsInOrder().size());

    m.add(JSSourceFile.fromCode("b.js", "var b = 2;"));
    compiler.rebuildInputsFromModules();
    assertEquals(2, compiler.getInputsInOrder().size());
  }

  // --- Compile overloads ---

  @Test
  public void testCompile_singleExternSingleInput_success() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var ext;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    Result result = compiler.compile(extern, input, options);
    assertTrue(result.success);
    assertEquals(0, result.errors.length);
  }

  @Test
  public void testCompile_singleExternInputArray_success() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var ext;");
    JSSourceFile[] inputs = new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x = 1;") };
    Result result = compiler.compile(extern, inputs, options);
    assertTrue(result.success);
  }

  @Test
  public void testCompile_singleExternModuleArray_success() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var ext;");
    JSModule m = new JSModule("m");
    m.add(JSSourceFile.fromCode("input.js", "var x = 1;"));
    Result result = compiler.compile(extern, new JSModule[] { m }, options);
    assertTrue(result.success);
  }

  @Test
  public void testCompile_arrayExternsAndInputs_success() {
    JSSourceFile[] externs = new JSSourceFile[] { JSSourceFile.fromCode("extern.js", "") };
    JSSourceFile[] inputs = new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function foo() { return 42; }") };
    Result result = compiler.compile(externs, inputs, options);
    assertTrue(result.success);
  }

  @Test
  public void testCompile_moduleArray_success() {
    JSSourceFile[] externs = new JSSourceFile[0];
    JSModule m = new JSModule("m");
    m.add(JSSourceFile.fromCode("input.js", "var x = 1;"));
    Result result = compiler.compile(externs, new JSModule[] { m }, options);
    assertTrue(result.success);
  }

  @Test
  public void testCompileModules_listArgs_success() {
    List<JSSourceFile> externs = Lists.newArrayList();
    JSModule m = new JSModule("m");
    m.add(JSSourceFile.fromCode("input.js", "var x = 1;"));
    Result result = compiler.compileModules(externs, Lists.newArrayList(m), options);
    assertTrue(result.success);
  }

  @Test
  public void testCompile_withSyntaxError_returnsResultWithErrors() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("bad.js", "var x = ;");
    Result result = compiler.compile(extern, input, options);
    assertFalse(result.success);
    assertTrue(result.errors.length > 0);
  }

  @Test(expected = IllegalStateException.class)
  public void testCompile_calledTwice_throwsIllegalStateException() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var x = 1;");
    compiler.compile(extern, input, options);
    compiler.compile(extern, input, options);
  }

  @Test
  public void testCompile_withVariousOptionsFlags_executesCorrectly() {
    options.nameAnonymousFunctionsOnly = true;
    options.devMode = DevMode.START_AND_END;
    options.recordFunctionInformation = true;
    options.externExportsPath = "exports.js";
    options.removeTryCatchFinally = true;
    options.stripTypes = Sets.newHashSet("goog.debug.Logger");

    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "function f() { try { var a = 1; } catch(e){} }");
    Result result = compiler.compile(extern, input, options);
    assertTrue(result.success);
    assertNotNull(compiler.getFunctionalInformationMap());
  }

  @Test
  public void testCompile_skipAllPasses_success() {
    options.skipAllPasses = true;
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    assertTrue(result.success);
  }

  @Test
  public void testCompile_ideMode_success() {
    options.ideMode = true;
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    assertTrue(result.success);
    assertTrue(compiler.isIdeMode());
  }

  @Test
  public void testDisableThreads_runsInSameThread() {
    compiler.disableThreads();
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    assertTrue(result.success);
  }

  // --- PassConfig & Custom Passes ---

  @Test
  public void testGetPassConfig_createsDefaultPassConfig() {
    compiler.initOptions(options);
    PassConfig passConfig = compiler.getPassConfig();
    assertNotNull(passConfig);
  }

  @Test
  public void testSetPassConfig_customPassConfig_success() {
    compiler.initOptions(options);
    PassConfig customConfig = new DefaultPassConfig(options);
    compiler.setPassConfig(customConfig);
    assertSame(customConfig, compiler.getPassConfig());
  }

  @Test(expected = NullPointerException.class)
  public void testSetPassConfig_null_throwsException() {
    compiler.setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfig_calledTwice_throwsIllegalStateException() {
    compiler.initOptions(options);
    PassConfig custom1 = new DefaultPassConfig(options);
    PassConfig custom2 = new DefaultPassConfig(options);
    compiler.setPassConfig(custom1);
    compiler.setPassConfig(custom2);
  }

  // --- Parsing and AST Methods ---

  @Test
  public void testParse_sourceFile_returnsRoot() {
    JSSourceFile file = JSSourceFile.fromCode("test.js", "var x = 10;");
    Node n = compiler.parse(file);
    assertNotNull(n);
    assertEquals(Token.SCRIPT, n.getType());
  }

  @Test
  public void testParseSyntheticCode_withoutFilename() {
    Node n = compiler.parseSyntheticCode("var y = 20;");
    assertNotNull(n);
    assertEquals(Token.SCRIPT, n.getType());
  }

  @Test
  public void testParseSyntheticCode_withFilename() {
    Node n = compiler.parseSyntheticCode("synth.js", "var z = 30;");
    assertNotNull(n);
    assertEquals(Token.SCRIPT, n.getType());
  }

  @Test
  public void testParseTestCode_success() {
    Node n = compiler.parseTestCode("var a = 1;");
    assertNotNull(n);
    assertEquals(Token.SCRIPT, n.getType());
  }

  @Test
  public void testParseInputs_manageClosureDependencies() {
    options.manageClosureDependencies = true;
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile in1 = JSSourceFile.fromCode("in1.js", "goog.provide('ns.B'); goog.require('ns.A'); ns.B = 2;");
    JSSourceFile in2 = JSSourceFile.fromCode("in2.js", "goog.provide('ns.A'); ns.A = 1;");
    compiler.init(new JSSourceFile[] { extern }, new JSSourceFile[] { in1, in2 }, options);
    Node root = compiler.parseInputs();
    assertNotNull(root);
  }

  @Test
  public void testParseInputs_withExternsAndNoCompileJSDoc() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile in1 = JSSourceFile.fromCode("externDoc.js", "/** @externs */ var extA;");
    JSSourceFile in2 = JSSourceFile.fromCode("noCompile.js", "/** @nocompile */ var ignoreMe = 1;");
    JSSourceFile in3 = JSSourceFile.fromCode("main.js", "var keepMe = 2;");
    compiler.init(new JSSourceFile[] { extern }, new JSSourceFile[] { in1, in2, in3 }, options);
    Node root = compiler.parseInputs();
    assertNotNull(root);
  }

  @Test
  public void testParseInputs_withTracerAndSourceMapOptions() {
    options.tracer = TracerMode.ALL;
    options.sourceMapOutputPath = "test.map";
    options.nameReferenceReportPath = "report.txt";
    options.devMode = DevMode.EVERY_PASS;

    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile in = JSSourceFile.fromCode("in.js", "var a = 1;");
    compiler.init(new JSSourceFile[] { extern }, new JSSourceFile[] { in }, options);
    Node root = compiler.parseInputs();
    assertNotNull(root);
  }

  @Test
  public void testNewExternInput_addsNewExtern() {
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { JSSourceFile.fromCode("in.js", "var a = 1;") }, options);
    compiler.parseInputs();
    CompilerInput input = compiler.newExternInput("synthetic_extern.js");
    assertNotNull(input);
    assertTrue(input.isExtern());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInput_duplicateName_throwsException() {
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("ext.js", "") }, new JSSourceFile[0], options);
    compiler.parseInputs();
    compiler.newExternInput("ext.js");
  }

  @Test
  public void testAddIncrementalSourceAst_success() {
    compiler.init(new JSSourceFile[0], new JSSourceFile[0], options);
    JsAst ast = new JsAst(JSSourceFile.fromCode("dyn.js", "var d = 1;"));
    compiler.addIncrementalSourceAst(ast);
    assertNotNull(compiler.getInput("dyn.js"));
  }

  @Test(expected = IllegalStateException.class)
  public void testAddIncrementalSourceAst_duplicate_throwsException() {
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { JSSourceFile.fromCode("dyn.js", "") }, options);
    JsAst ast = new JsAst(JSSourceFile.fromCode("dyn.js", "var d = 1;"));
    compiler.addIncrementalSourceAst(ast);
  }

  // --- Source Generation / toSource ---

  @Test
  public void testToSource_singleScript_returnsCode() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var x = 10;");
    compiler.compile(extern, input, options);
    String source = compiler.toSource();
    assertTrue(source.contains("var x=10"));
  }

  @Test
  public void testToSourceArray_returnsArrayOfSources() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("in1.js", "var x = 1;"),
        JSSourceFile.fromCode("in2.js", "var y = 2;")
    };
    compiler.compile(extern, inputs, options);
    String[] sources = compiler.toSourceArray();
    assertEquals(2, sources.length);
    assertTrue(sources[0].contains("var x=1"));
    assertTrue(sources[1].contains("var y=2"));
  }

  @Test
  public void testToSource_forModule_returnsCombinedCode() {
    JSModule m = new JSModule("m");
    m.add(JSSourceFile.fromCode("in1.js", "var x = 1;"));
    m.add(JSSourceFile.fromCode("in2.js", "var y = 2;"));
    compiler.compile(new JSSourceFile[0], new JSModule[] { m }, options);

    String source = compiler.toSource(m);
    assertTrue(source.contains("var x=1"));
    assertTrue(source.contains("var y=2"));
  }

  @Test
  public void testToSource_forEmptyModule_returnsEmptyString() {
    JSModule m = new JSModule("empty");
    String source = compiler.toSource(m);
    assertEquals("", source);
  }

  @Test
  public void testToSourceArray_forModule_returnsArray() {
    JSModule m = new JSModule("m");
    m.add(JSSourceFile.fromCode("in1.js", "var x = 1;"));
    compiler.compile(new JSSourceFile[0], new JSModule[] { m }, options);

    String[] array = compiler.toSourceArray(m);
    assertEquals(1, array.length);
    assertTrue(array[0].contains("var x=1"));
  }

  @Test
  public void testToSourceArray_forEmptyModule_returnsEmptyArray() {
    JSModule m = new JSModule("empty");
    String[] array = compiler.toSourceArray(m);
    assertEquals(0, array.length);
  }

  @Test
  public void testToSource_withCodeBuilderAndOptions() {
    options.printInputDelimiter = true;
    options.inputDelimiter = "// [%name%]";
    options.sourceMapOutputPath = "test.map";
    compiler.initOptions(options);

    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("// Pre-existing\n");

    Node scriptNode = compiler.parse(JSSourceFile.fromCode("test.js", "var a = 1;\nvar b = 2;"));
    JSDocInfo docInfo = new JSDocInfo();
    docInfo.addLicense("My License");
    scriptNode.setJSDocInfo(docInfo);

    compiler.toSource(cb, 0, scriptNode);
    String out = cb.toString();
    assertTrue(out.contains("// [test.js]"));
    assertTrue(out.contains("/*\nMy License*/"));
    assertTrue(out.contains("var a=1"));
  }

  @Test
  public void testToSource_nodeOnly_returnsSource() {
    Node node = compiler.parseTestCode("var answer = 42;");
    String src = compiler.toSource(node);
    assertTrue(src.contains("var answer=42"));
  }

  // --- CodeBuilder ---

  @Test
  public void testCodeBuilder_operations() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    assertEquals(0, cb.getLength());
    assertEquals(0, cb.getLineIndex());
    assertEquals(0, cb.getColumnIndex());
    assertFalse(cb.endsWith("foo"));

    cb.append("hello");
    assertEquals(5, cb.getLength());
    assertEquals(0, cb.getLineIndex());
    assertEquals(5, cb.getColumnIndex());
    assertTrue(cb.endsWith("lo"));
    assertFalse(cb.endsWith("longer than hello"));

    cb.append("\nworld\n");
    assertEquals(12, cb.getLength());
    assertEquals(2, cb.getLineIndex());
    assertEquals(0, cb.getColumnIndex());

    cb.reset();
    assertEquals(0, cb.getLength());
    assertEquals(2, cb.getLineIndex()); // line count unchanged on reset
  }

  // --- State save and restore ---

  @Test
  public void testStateSaveAndRestore() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "var ext;");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    compiler.init(new JSSourceFile[] { extern }, new JSSourceFile[] { input }, options);
    compiler.parseInputs();

    compiler.setNormalized();
    Compiler.IntermediateState state = compiler.getState();
    assertNotNull(state);

    compiler.setUnnormalized();
    assertFalse(compiler.isNormalized());

    compiler.setState(state);
    assertTrue(compiler.isNormalized());
  }

  // --- Reporting & Error Management ---

  @Test
  public void testReport_andGetErrorLevel() {
    compiler.initOptions(options);
    JSError error = JSError.make("test.js", 1, 1, CheckLevel.ERROR, Compiler.OPTIMIZE_LOOP_ERROR, "10");
    compiler.report(error);

    assertEquals(1, compiler.getErrorCount());
    assertEquals(0, compiler.getWarningCount());
    assertEquals(CheckLevel.ERROR, compiler.getErrorLevel(error));
    assertEquals(1, compiler.getMessages().length);
    assertEquals(1, compiler.getErrors().length);
    assertEquals(0, compiler.getWarnings().length);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testReport_withWarningsGuard() {
    options.addWarningsGuard(new DiagnosticGroupWarningsGuard(
        DiagnosticGroups.CHECK_VARIABLES, CheckLevel.WARNING));
    compiler.initOptions(options);

    JSError error = JSError.make("test.js", 1, 1, CheckLevel.ERROR, VarCheck.UNDEFINED_VAR_ERROR, "foo");
    compiler.report(error);

    assertEquals(0, compiler.getErrorCount());
    assertEquals(1, compiler.getWarningCount());
    assertEquals(CheckLevel.WARNING, compiler.getErrorLevel(error));
  }

  @Test(expected = RuntimeException.class)
  public void testThrowInternalError_throwsRuntimeException() {
    compiler.throwInternalError("Something went wrong", new IllegalArgumentException("cause"));
  }

  @Test
  public void testGetSourceLineAndRegion() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "line1\nline2\nline3\n");
    compiler.init(new JSSourceFile[] { extern }, new JSSourceFile[] { input }, options);

    assertNull(compiler.getSourceLine("in.js", 0));
    assertNull(compiler.getSourceLine("in.js", -1));
    assertEquals("line2", compiler.getSourceLine("in.js", 2));
    assertNull(compiler.getSourceLine("nonexistent.js", 1));

    assertNull(compiler.getSourceRegion("in.js", 0));
    assertNull(compiler.getSourceRegion("in.js", -1));
    assertNotNull(compiler.getSourceRegion("in.js", 2));
    assertNull(compiler.getSourceRegion("nonexistent.js", 1));
  }

  // --- Other Methods & Coverage ---

  @Test
  public void testGetCodingConvention_defaultAndCustom() {
    CodingConvention defaultConvention = compiler.getCodingConvention();
    assertTrue(defaultConvention instanceof GoogleCodingConvention);

    CodingConvention custom = new DefaultCodingConvention();
    options.setCodingConvention(custom);
    assertSame(custom, compiler.getCodingConvention());
  }

  @Test
  public void testTypeRegistryAndValidator() {
    compiler.initOptions(options);
    JSTypeRegistry registry = compiler.getTypeRegistry();
    assertNotNull(registry);
    assertSame(registry, compiler.getTypeRegistry());

    TypeValidator validator = compiler.getTypeValidator();
    assertNotNull(validator);
  }

  @Test
  public void testReverseAbstractInterpreter() {
    compiler.initOptions(options);
    ReverseAbstractInterpreter rai1 = compiler.getReverseAbstractInterpreter();
    assertNotNull(rai1);

    Compiler comp2 = new Compiler();
    CompilerOptions opt2 = new CompilerOptions();
    opt2.closurePass = true;
    comp2.initOptions(opt2);
    ReverseAbstractInterpreter rai2 = comp2.getReverseAbstractInterpreter();
    assertNotNull(rai2);
  }

  @Test
  public void testUniqueNameIdSupplier() {
    assertEquals("0", compiler.getUniqueNameIdSupplier().get());
    assertEquals("1", compiler.getUniqueNameIdSupplier().get());
    compiler.resetUniqueNameId();
    assertEquals("0", compiler.getUniqueNameIdSupplier().get());
  }

  @Test
  public void testAreNodesEqualForInlining() {
    compiler.initOptions(options);
    Node n1 = compiler.parseTestCode("var a = 1;");
    Node n2 = compiler.parseTestCode("var a = 1;");
    assertTrue(compiler.areNodesEqualForInlining(n1, n2));

    options.ambiguateProperties = true;
    assertTrue(compiler.areNodesEqualForInlining(n1, n2));
  }

  @Test
  public void testGetAstDotGraph() throws IOException {
    assertEquals("", compiler.getAstDotGraph());

    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1; if(a) { a = 2; }");
    compiler.compile(extern, input, options);
    String dot = compiler.getAstDotGraph();
    assertNotNull(dot);
    assertTrue(dot.contains("digraph"));
  }

  @Test
  public void testComputeCFG() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "function f(x) { if (x) return 1; return 0; }");
    compiler.compile(extern, input, options);
    ControlFlowGraph<Node> cfg = compiler.computeCFG();
    assertNotNull(cfg);
  }

  @Test
  public void testPrepareAst() {
    Node node = compiler.parseTestCode("var x = 1;");
    compiler.prepareAst(node);
    assertNotNull(node);
  }

  @Test
  public void testProcessDefines() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "/** @define {boolean} */ var DEF = true;");
    compiler.compile(extern, input, options);
    compiler.processDefines();
  }

  @Test
  public void testIsInliningForbidden() {
    options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
    assertTrue(compiler.isInliningForbidden());

    options.propertyRenaming = PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
    assertTrue(compiler.isInliningForbidden());

    options.propertyRenaming = PropertyRenamingPolicy.OFF;
    assertFalse(compiler.isInliningForbidden());
  }

  @Test
  public void testCssRenamingMap() {
    CssRenamingMap map = new CssRenamingMap() {
      @Override
      public String get(String value) {
        return "renamed-" + value;
      }
    };
    compiler.initOptions(options);
    compiler.setCssRenamingMap(map);
    assertSame(map, compiler.getCssRenamingMap());
  }

  @Test
  public void testCodeChangeHandler() {
    final boolean[] changed = new boolean[] { false };
    CodeChangeHandler handler = new CodeChangeHandler() {
      @Override
      public void reportChange() {
        changed[0] = true;
      }
    };
    compiler.addChangeHandler(handler);
    compiler.reportCodeChange();
    assertTrue(changed[0]);

    changed[0] = false;
    compiler.removeChangeHandler(handler);
    compiler.reportCodeChange();
    assertFalse(changed[0]);
  }

  @Test
  public void testGetNodeForCodeInsertion_nullModule() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    compiler.init(new JSSourceFile[] { extern }, new JSSourceFile[] { input }, options);
    compiler.parseInputs();

    Node insertionNode = compiler.getNodeForCodeInsertion(null);
    assertNotNull(insertionNode);
    assertEquals(Token.SCRIPT, insertionNode.getType());
  }

  @Test
  public void testGetNodeForCodeInsertion_withModule() {
    JSModule m = new JSModule("m");
    m.add(JSSourceFile.fromCode("in.js", "var a = 1;"));
    compiler.initModules(Lists.<JSSourceFile>newArrayList(), Lists.newArrayList(m), options);
    compiler.parseInputs();

    Node insertionNode = compiler.getNodeForCodeInsertion(m);
    assertNotNull(insertionNode);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertion_emptyModule_throwsException() {
    JSModule m = new JSModule("empty");
    compiler.getNodeForCodeInsertion(m);
  }

  @Test
  public void testRegExpGlobalReferences() {
    assertTrue(compiler.hasRegExpGlobalReferences());
    compiler.setHasRegExpGlobalReferences(false);
    assertFalse(compiler.hasRegExpGlobalReferences());
  }

  @Test
  public void testSetLoggingLevel() {
    Compiler.setLoggingLevel(Level.FINEST);
    Compiler.setLoggingLevel(Level.INFO);
  }

  @Test
  public void testGetParserConfig_andErrorReporter() {
    assertNotNull(compiler.getParserConfig());
    assertNotNull(compiler.getDefaultErrorReporter());
    assertFalse(compiler.isTypeCheckingEnabled());
    options.checkTypes = true;
    compiler.initOptions(options);
    assertTrue(compiler.isTypeCheckingEnabled());
  }

  @Test
  public void testGetScopeCreatorAndTopScope() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    compiler.compile(extern, input, options);
    assertNotNull(compiler.getScopeCreator());
    assertNull(compiler.getTopScope());
  }

  @Test
  public void testGetVariableMapAndPropertyMap() {
    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    compiler.compile(extern, input, options);
    assertNull(compiler.getVariableMap());
    assertNull(compiler.getPropertyMap());
  }

  @Test
  public void testCustomPassesExecution() {
    final boolean[] passRan = new boolean[] { false, false };
    CompilerPass pass1 = new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        passRan[0] = true;
      }
    };
    CompilerPass pass2 = new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        passRan[1] = true;
      }
    };

    options.customPasses = ImmutableMap.<CustomPassExecutionTime, List<CompilerPass>>of(
        CustomPassExecutionTime.BEFORE_CHECKS, ImmutableList.of(pass1),
        CustomPassExecutionTime.BEFORE_OPTIMIZATIONS, ImmutableList.of(pass2)
    );

    JSSourceFile extern = JSSourceFile.fromCode("ext.js", "");
    JSSourceFile input = JSSourceFile.fromCode("in.js", "var a = 1;");
    compiler.compile(extern, input, options);

    assertTrue(passRan[0]);
    assertTrue(passRan[1]);
  }
}
