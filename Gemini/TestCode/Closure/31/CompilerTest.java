package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.CompilerOptions.TweakProcessing;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
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

  @Test
  public void testConstructors() {
    Compiler c1 = new Compiler();
    assertNotNull(c1.getErrorManager());

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    Compiler c2 = new Compiler(ps);
    assertNotNull(c2);

    BasicErrorManager errorManager = new PrintStreamErrorManager(ps);
    Compiler c3 = new Compiler(errorManager);
    assertSame(errorManager, c3.getErrorManager());
  }

  @Test(expected = NullPointerException.class)
  public void testSetErrorManager_nullThrowsException() {
    compiler.setErrorManager(null);
  }

  @Test
  public void testInitOptions_variousConfigurations() {
    CompilerOptions opt = new CompilerOptions();
    opt.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT);
    opt.checkGlobalThisLevel = CheckLevel.ERROR;
    opt.setCheckTypes(true);
    compiler.initOptions(opt);

    assertTrue(compiler.acceptEcmaScript5());
    assertEquals(LanguageMode.ECMASCRIPT5_STRICT, compiler.languageMode());
    assertTrue(compiler.isTypeCheckingEnabled());

    CompilerOptions opt2 = new CompilerOptions();
    opt2.setCheckTypes(false);
    opt2.checkSymbols = false;
    compiler.initOptions(opt2);
    assertFalse(compiler.isTypeCheckingEnabled());

    CompilerOptions opt3 = new CompilerOptions();
    opt3.enables(DiagnosticGroups.CHECK_TYPES);
    compiler.initOptions(opt3);
  }

  @Test
  public void testCompile_simpleSourceFiles() {
    SourceFile extern = SourceFile.fromCode("extern.js", "var window;");
    SourceFile input = SourceFile.fromCode("input.js", "var x = 1 + 2;");
    Result result = compiler.compile(extern, input, options);
    assertTrue(result.success);
    assertEquals(0, compiler.getErrorCount());
    assertNotNull(compiler.toSource());
    assertNotNull(compiler.getRoot());
  }

  @Test
  public void testCompile_sourceFileArrays() {
    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("extern.js", "function alert(x) {}")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("input.js", "alert('hello');")
    };
    Result result = compiler.compile(externs, inputs, options);
    assertTrue(result.success);
    String[] sources = compiler.toSourceArray();
    assertEquals(1, sources.length);
    assertTrue(sources[0].contains("alert"));
  }

  @Test
  public void testCompile_modules() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    JSModule m1 = new JSModule("m1");
    m1.add(SourceFile.fromCode("m1.js", "var a = 1;"));
    JSModule m2 = new JSModule("m2");
    m2.add(SourceFile.fromCode("m2.js", "var b = a + 1;"));
    m2.addDependency(m1);

    JSModule[] modules = new JSModule[] { m1, m2 };
    Result result = compiler.compile(JSSourceFile.fromCode("extern.js", ""), modules, options);
    assertTrue(result.success);
    assertNotNull(compiler.getModuleGraph());
    assertEquals(2, compiler.getDegenerateModuleGraph().getModuleCount());

    String m1Src = compiler.toSource(m1);
    assertTrue(m1Src.contains("var a=1"));
    String[] m1SrcArray = compiler.toSourceArray(m1);
    assertEquals(1, m1SrcArray.length);

    JSModule emptyMod = new JSModule("empty");
    assertEquals("", compiler.toSource(emptyMod));
    assertEquals(0, compiler.toSourceArray(emptyMod).length);
  }

  @Test(expected = IllegalStateException.class)
  public void testCompile_calledTwiceThrowsException() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);
    compiler.compile(extern, input, options);
  }

  @Test
  public void testCompile_withEmptyModulesAndFillFileName() {
    assertEquals("[mod]", Compiler.createFillFileName("mod"));
    JSModule m1 = new JSModule("m1");
    List<JSModule> modules = Lists.newArrayList(m1);
    compiler.initModules(Lists.<SourceFile>newArrayList(), modules, options);
    assertEquals(1, m1.getInputs().size());
  }

  @Test
  public void testCompile_emptyModuleListReportsError() {
    List<JSModule> modules = Lists.newArrayList();
    compiler.initModules(Lists.<SourceFile>newArrayList(), modules, options);
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testCompile_duplicateInputsReporting() {
    SourceFile f1 = SourceFile.fromCode("same.js", "var a = 1;");
    SourceFile f2 = SourceFile.fromCode("same.js", "var b = 2;");
    compiler.init(Lists.newArrayList(f1), Lists.newArrayList(f2), options);
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testDisableThreadsAndRunCallable() {
    compiler.disableThreads();
    String res = Compiler.runCallableWithLargeStack(new Callable<String>() {
      @Override
      public String call() {
        return "success";
      }
    });
    assertEquals("success", res);

    String res2 = Compiler.runCallable(new Callable<String>() {
      @Override
      public String call() {
        return "not-threaded";
      }
    }, false, false);
    assertEquals("not-threaded", res2);
  }

  @Test(expected = RuntimeException.class)
  public void testRunCallable_throwsException() {
    Compiler.runCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        throw new IOException("fail");
      }
    }, false, false);
  }

  @Test
  public void testPassConfigManagement() {
    PassConfig config = compiler.getPassConfig();
    assertNotNull(config);

    Compiler c2 = new Compiler();
    PassConfig custom = new DefaultPassConfig(new CompilerOptions());
    c2.setPassConfig(custom);
    assertSame(custom, c2.getPassConfig());
  }

  @Test(expected = NullPointerException.class)
  public void testSetPassConfig_nullThrows() {
    compiler.setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfig_twiceThrows() {
    compiler.getPassConfig();
    compiler.setPassConfig(new DefaultPassConfig(new CompilerOptions()));
  }

  @Test
  public void testCodeBuilder() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    assertEquals(0, cb.getLength());
    assertEquals(0, cb.getLineIndex());
    assertEquals(0, cb.getColumnIndex());

    cb.append("foo\nbar");
    assertEquals("foo\nbar", cb.toString());
    assertEquals(7, cb.getLength());
    assertEquals(1, cb.getLineIndex());
    assertEquals(3, cb.getColumnIndex());
    assertTrue(cb.endsWith("bar"));
    assertFalse(cb.endsWith("baz"));

    cb.reset();
    assertEquals("", cb.toString());
    assertEquals(0, cb.getLength());
    assertEquals(1, cb.getLineIndex());
  }

  @Test
  public void testToSource_withDelimitersAndSourceMap() {
    options.printInputDelimiter = true;
    options.inputDelimiter = "// %name% (%num%)";
    options.sourceMapOutputPath = "%outname%.map";
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("test.js", "/** @license MIT */ var x = 1;");
    compiler.compile(extern, input, options);

    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    compiler.toSource(cb, 1, compiler.getInputsInOrder().get(0).getAstRoot(compiler));
    String out = cb.toString();
    assertTrue(out.contains("// test.js (1)"));
    assertTrue(out.contains("MIT"));
    assertNotNull(compiler.getSourceMap());
  }

  @Test
  public void testParsingMethods() {
    Node n1 = compiler.parseSyntheticCode("var a = 1;");
    assertNotNull(n1);

    Node n2 = compiler.parseSyntheticCode("syn.js", "var b = 2;");
    assertNotNull(n2);

    Node n3 = compiler.parseTestCode("var c = 3;");
    assertNotNull(n3);

    Node n4 = compiler.parse(SourceFile.fromCode("file.js", "var d = 4;"));
    assertNotNull(n4);

    assertNotNull(compiler.getDefaultErrorReporter());
    assertNotNull(compiler.getParserConfig());
  }

  @Test
  public void testParseSyntheticCode_differentLanguageModes() {
    Compiler c1 = new Compiler();
    CompilerOptions o1 = new CompilerOptions();
    o1.setLanguageIn(LanguageMode.ECMASCRIPT3);
    c1.initOptions(o1);
    assertNotNull(c1.getParserConfig());

    Compiler c2 = new Compiler();
    CompilerOptions o2 = new CompilerOptions();
    o2.setLanguageIn(LanguageMode.ECMASCRIPT5);
    c2.initOptions(o2);
    assertNotNull(c2.getParserConfig());
  }

  @Test
  public void testGetSourceLineAndRegion() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "line1\nline2\nline3\n");
    compiler.compile(extern, input, options);

    assertNull(compiler.getSourceLine("input.js", 0));
    assertNull(compiler.getSourceLine("input.js", -1));
    assertEquals("line2", compiler.getSourceLine("input.js", 2));
    assertNull(compiler.getSourceLine("nonexistent.js", 1));

    assertNull(compiler.getSourceRegion("input.js", 0));
    assertNull(compiler.getSourceRegion("input.js", -1));
    Region r = compiler.getSourceRegion("input.js", 2);
    assertNotNull(r);
    assertNull(compiler.getSourceRegion("nonexistent.js", 1));
  }

  @Test
  public void testInputManagement() {
    SourceFile extern = SourceFile.fromCode("extern.js", "var ext = 1;");
    SourceFile input = SourceFile.fromCode("input.js", "var inp = 2;");
    compiler.compile(extern, input, options);

    InputId inputId = new InputId("input.js");
    CompilerInput compInput = compiler.getInput(inputId);
    assertNotNull(compInput);
    assertEquals("input.js", compInput.getName());

    CompilerInput newExt = compiler.newExternInput("synthetic_extern.js");
    assertNotNull(newExt);
    assertNotNull(compiler.getInput(newExt.getInputId()));

    compiler.removeExternInput(newExt.getInputId());
    assertNull(compiler.getInput(newExt.getInputId()));

    // remove non-existent
    compiler.removeExternInput(new InputId("non-existent"));

    assertEquals(1, compiler.getInputsInOrder().size());
    assertEquals(1, compiler.getInputsForTesting().size());
    assertFalse(compiler.getExternsInOrder().isEmpty());
    assertFalse(compiler.getExternsForTesting().isEmpty());
    assertNotNull(compiler.getInputsById());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInput_duplicateThrows() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var inp = 2;");
    compiler.compile(extern, input, options);

    compiler.newExternInput("dup.js");
    compiler.newExternInput("dup.js");
  }

  @Test
  public void testIncrementalAst() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, options);

    JsAst ast = new JsAst(SourceFile.fromCode("new_inc.js", "var y = 2;"));
    compiler.addIncrementalSourceAst(ast);
    assertNotNull(compiler.getInput(ast.getInputId()));

    JsAst replaceAst = new JsAst(SourceFile.fromCode("input.js", "var x = 3;"));
    boolean replaced = compiler.replaceIncrementalSourceAst(replaceAst);
    assertTrue(replaced);

    JsAst addedAst = new JsAst(SourceFile.fromCode("added.js", "var z = 4;"));
    boolean added = compiler.addNewSourceAst(addedAst);
    assertTrue(added);

    JsAst dupAst = new JsAst(SourceFile.fromCode("added.js", "var z = 5;"));
    try {
      compiler.addNewSourceAst(dupAst);
      fail("Should throw on duplicate add");
    } catch (IllegalStateException expected) {}
  }

  @Test
  public void testHotSwapScriptAndAddNewScript() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    JsAst updated = new JsAst(SourceFile.fromCode("input.js", "var a = 2;"));
    compiler.replaceScript(updated);

    JsAst newScript = new JsAst(SourceFile.fromCode("new_script.js", "var b = 3;"));
    compiler.addNewScript(newScript);
    assertNotNull(compiler.getInput(newScript.getInputId()));
  }

  @Test
  public void testStateSaveAndRestore() {
    SourceFile extern = SourceFile.fromCode("extern.js", "var e = 1;");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    Compiler.IntermediateState state = compiler.getState();
    assertNotNull(state);

    Compiler newComp = new Compiler();
    newComp.init(Lists.newArrayList(extern), Lists.newArrayList(input), options);
    newComp.setState(state);
    assertNotNull(newComp.getRoot());
  }

  @Test
  public void testProgressClamping() {
    compiler.setProgress(-0.5);
    assertEquals(0.0, compiler.getProgress(), 0.0001);

    compiler.setProgress(0.42);
    assertEquals(0.42, compiler.getProgress(), 0.0001);

    compiler.setProgress(1.5);
    assertEquals(1.0, compiler.getProgress(), 0.0001);
  }

  @Test
  public void testRegExpGlobalReferencesAndUniqueNames() {
    assertTrue(compiler.hasRegExpGlobalReferences());
    compiler.setHasRegExpGlobalReferences(false);
    assertFalse(compiler.hasRegExpGlobalReferences());

    com.google.common.base.Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
    assertEquals("0", supplier.get());
    assertEquals("1", supplier.get());
    compiler.resetUniqueNameId();
    assertEquals("0", supplier.get());
  }

  @Test
  public void testAreNodesEqualForInlining() {
    Node n1 = IR.number(1);
    Node n2 = IR.number(1);
    Node n3 = IR.number(2);

    compiler.initCompilerOptionsIfTesting();
    assertTrue(compiler.areNodesEqualForInlining(n1, n2));
    assertFalse(compiler.areNodesEqualForInlining(n1, n3));

    options.ambiguateProperties = true;
    assertTrue(compiler.areNodesEqualForInlining(n1, n2));
  }

  @Test
  public void testErrorAndWarningReporting() {
    compiler.initCompilerOptionsIfTesting();
    JSError err = JSError.make("test.js", 1, 1, CheckLevel.ERROR, DiagnosticType.error("ERR", "Error msg"));
    compiler.report(err);
    assertEquals(1, compiler.getErrorCount());
    assertEquals(1, compiler.getErrors().length);
    assertEquals(1, compiler.getMessages().length);
    assertTrue(compiler.hasErrors());
    assertTrue(compiler.hasHaltingErrors());

    JSError warn = JSError.make("test.js", 2, 1, CheckLevel.WARNING, DiagnosticType.warning("WARN", "Warning msg"));
    compiler.report(warn);
    assertEquals(1, compiler.getWarningCount());
    assertEquals(1, compiler.getWarnings().length);

    CheckLevel level = compiler.getErrorLevel(err);
    assertEquals(CheckLevel.ERROR, level);
  }

  @Test
  public void testIdeModeBehavior() {
    options.ideMode = true;
    compiler.initOptions(options);
    assertTrue(compiler.isIdeMode());
    assertFalse(compiler.hasHaltingErrors());
  }

  @Test
  public void testCodingConventionAndLanguageMode() {
    compiler.initCompilerOptionsIfTesting();
    assertNotNull(compiler.getCodingConvention());
    assertFalse(compiler.acceptConstKeyword());
  }

  @Test
  public void testDebugLogAndLoggingLevel() {
    Compiler.setLoggingLevel(Level.FINEST);
    compiler.addToDebugLog("debug test entry");
  }

  @Test
  public void testThrowInternalError() {
    try {
      compiler.throwInternalError("custom msg", new RuntimeException("cause"));
      fail("Should have thrown");
    } catch (RuntimeException e) {
      assertTrue(e.getMessage().contains("INTERNAL COMPILER ERROR"));
      assertTrue(e.getMessage().contains("custom msg"));
    }
  }

  @Test
  public void testSymbolTableAndTypeRegistry() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1; function foo(x) { return x; }");
    compiler.compile(extern, input, options);

    assertNotNull(compiler.getTypeRegistry());
    assertNotNull(compiler.getTypeValidator());
    assertNotNull(compiler.getReverseAbstractInterpreter());
    assertNotNull(compiler.ensureDefaultPassConfig());

    SymbolTable st = compiler.buildKnownSymbolTable();
    assertNotNull(st);
  }

  @Test
  public void testNormalizeAndPrepareAst() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "function f() { var x = 1; }");
    compiler.compile(extern, input, options);

    compiler.normalize();
    compiler.prepareAst(compiler.getRoot());
  }

  @Test
  public void testComputeCFGAndDotGraph() throws IOException {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "if (true) { var a = 1; } else { var a = 2; }");
    compiler.compile(extern, input, options);

    ControlFlowGraph<Node> cfg = compiler.computeCFG();
    assertNotNull(cfg);
    String dot = compiler.getAstDotGraph();
    assertNotNull(dot);
    assertTrue(dot.contains("digraph"));
  }

  @Test
  public void testGetAstDotGraph_nullJsRoot() throws IOException {
    Compiler c = new Compiler();
    assertEquals("", c.getAstDotGraph());
  }

  @Test
  public void testOptimizationFlowOptions() {
    options.removeTryCatchFinally = true;
    options.stripTypes = Sets.newHashSet("goog.debug.Logger");
    options.stripNameSuffixes = Sets.newHashSet("logger");
    options.stripTypePrefixes = Sets.newHashSet("goog.debug");
    options.stripNamePrefixes = Sets.newHashSet("dbg_");
    options.setTweakProcessing(TweakProcessing.STRIP);
    options.devMode = DevMode.START_AND_END;
    options.recordFunctionInformation = true;

    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js",
        "try { var dbg_x = 1; } catch(e) {} function f(){} f();");
    Result res = compiler.compile(extern, input, options);
    assertTrue(res.success);
    assertNotNull(compiler.getFunctionalInformationMap());
  }

  @Test
  public void testCssRenamingMap() {
    compiler.initCompilerOptionsIfTesting();
    assertNull(compiler.getCssRenamingMap());
    CssRenamingMap map = new CssRenamingMap() {
      @Override
      public String get(String value) {
        return "a";
      }
      @Override
      public Style getStyle() {
        return Style.BY_WHOLE;
      }
    };
    compiler.setCssRenamingMap(map);
    assertSame(map, compiler.getCssRenamingMap());
  }

  @Test
  public void testProcessDefines() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "/** @define {boolean} */ var DEF = true;");
    compiler.compile(extern, input, options);
    compiler.processDefines();
  }

  @Test
  public void testIsInliningForbidden() {
    compiler.initCompilerOptionsIfTesting();
    assertFalse(compiler.isInliningForbidden());

    options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
    assertTrue(compiler.isInliningForbidden());

    options.propertyRenaming = PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
    assertTrue(compiler.isInliningForbidden());
  }

  @Test
  public void testCodeChangeHandlers() {
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
  public void testGetSynthesizedExternsInput() {
    compiler.init(Lists.<SourceFile>newArrayList(), Lists.<SourceFile>newArrayList(), options);
    compiler.parseInputs();
    CompilerInput syn = compiler.getSynthesizedExternsInput();
    assertNotNull(syn);
    assertEquals(Compiler.SYNTHETIC_EXTERNS, syn.getName());
  }

  @Test
  public void testUpdateGlobalVarReferences() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    Map<Scope.Var, ReferenceCollectingCallback.ReferenceCollection> refMap = new HashMap<Scope.Var, ReferenceCollectingCallback.ReferenceCollection>();
    compiler.updateGlobalVarReferences(refMap, compiler.getRoot());
    assertNotNull(compiler.getGlobalVarReferences());
  }

  @Test
  public void testGetTopScope() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    assertNotNull(compiler.getTopScope());
    assertNotNull(compiler.getTypedScopeCreator());
  }

  @Test
  public void testGetNodeForCodeInsertion_singletonAndSpecificModule() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    Node n1 = compiler.getNodeForCodeInsertion(null);
    assertNotNull(n1);

    JSModule mod = new JSModule("mod");
    mod.add(SourceFile.fromCode("mod.js", "var b = 2;"));
    Compiler c2 = new Compiler();
    c2.compileModules(Lists.newArrayList(extern), Lists.newArrayList(mod), options);
    Node n2 = c2.getNodeForCodeInsertion(mod);
    assertNotNull(n2);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertion_emptyThrows() {
    compiler.init(Lists.<SourceFile>newArrayList(), Lists.<SourceFile>newArrayList(), options);
    compiler.getNodeForCodeInsertion(null);
  }

  @Test
  public void testCustomPassesExecution() {
    CompilerPass pass = new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        root.addChildToBack(IR.var(IR.name("custom_injected")));
      }
    };

    options.customPasses = com.google.common.collect.ArrayListMultimap.create();
    options.customPasses.put(CustomPassExecutionTime.BEFORE_CHECKS, pass);
    options.customPasses.put(CustomPassExecutionTime.BEFORE_OPTIMIZATIONS, pass);

    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    assertTrue(result.success);
  }

  @Test
  public void testTracingOptions() {
    options.tracer = CompilerOptions.TracerMode.ALL;
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    Result res = compiler.compile(extern, input, options);
    assertTrue(res.success);
  }

  @Test
  public void testGetOptionsAndMaps() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    assertSame(options, compiler.getOptions());
    assertNull(compiler.getVariableMap());
    assertNull(compiler.getPropertyMap());
  }

  @Test
  public void testExternExports() {
    options.externExportsPath = "exports.js";
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "/** @export */ function testExport() {}");
    Result res = compiler.compile(extern, input, options);
    assertTrue(res.success);
    assertNotNull(res.externExport);
  }

  @Test
  public void testDependencyManagementWithCircularDepsReporting() {
    options.dependencyOptions.setDependencySorting(true);
    options.closurePass = true;

    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile f1 = SourceFile.fromCode("f1.js", "goog.provide('mod1'); goog.require('mod2');");
    SourceFile f2 = SourceFile.fromCode("f2.js", "goog.provide('mod2'); goog.require('mod1');");

    compiler.compile(Lists.newArrayList(extern), Lists.newArrayList(f1, f2), options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testDependencyManagementWithMissingProvide() {
    options.dependencyOptions.setDependencySorting(true);
    options.dependencyOptions.setEntryPoints(ImmutableList.of("missing.entry"));
    options.closurePass = true;

    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile f1 = SourceFile.fromCode("f1.js", "goog.provide('mod1');");

    compiler.compile(Lists.newArrayList(extern), Lists.newArrayList(f1), options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testDevModeEveryPass() {
    options.devMode = DevMode.EVERY_PASS;
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var x = 1;");
    Result res = compiler.compile(extern, input, options);
    assertTrue(res.success);
  }

  @Test
  public void testSourceWithSpecialJsDocTags() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile in1 = SourceFile.fromCode("externInput.js", "/** @externs */ var extVar;");
    SourceFile in2 = SourceFile.fromCode("noCompile.js", "/** @nocompile */ var ignoreMe = 1;");
    SourceFile in3 = SourceFile.fromCode("normal.js", "var ok = 1;");

    Result res = compiler.compile(Lists.newArrayList(extern), Lists.newArrayList(in1, in2, in3), options);
    assertTrue(res.success);
  }

  @Test
  public void testEnsureLibraryInjected() {
    SourceFile extern = SourceFile.fromCode("extern.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    Node n1 = compiler.ensureLibraryInjected("base");
    assertNotNull(n1);
    // duplicate inject returns null
    Node n2 = compiler.ensureLibraryInjected("base");
    assertNull(n2);
  }

  @Test
  public void testGetDiagnosticGroups() {
    DiagnosticGroups groups = compiler.getDiagnosticGroups();
    assertNotNull(groups);
  }
}
