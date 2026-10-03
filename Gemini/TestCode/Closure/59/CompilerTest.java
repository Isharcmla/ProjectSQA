package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;
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
  public void testDefaultConstructor_initializesProperly() {
    Compiler c = new Compiler();
    assertNotNull(c.getErrorManager());
    assertEquals(0, c.getErrorCount());
    assertEquals(0, c.getWarningCount());
  }

  @Test
  public void testPrintStreamConstructor_initializesProperly() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    Compiler c = new Compiler(ps);
    c.initOptions(new CompilerOptions());
    assertNotNull(c.getErrorManager());
    assertTrue(c.getErrorManager() instanceof PrintStreamErrorManager);
  }

  @Test
  public void testErrorManagerConstructor_setsGivenErrorManager() {
    BasicErrorManager customManager = new LoggerErrorManager(new TextErrorFormatter(new Compiler()), Compiler.logger);
    Compiler c = new Compiler(customManager);
    assertSame(customManager, c.getErrorManager());
  }

  @Test(expected = NullPointerException.class)
  public void testSetErrorManager_null_throwsException() {
    compiler.setErrorManager(null);
  }

  @Test
  public void testInitOptions_checkTypesAndWarningsGuards() {
    options.checkTypes = true;
    options.checkGlobalThisLevel = CheckLevel.ERROR;
    options.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT);
    compiler.initOptions(options);

    assertTrue(compiler.isTypeCheckingEnabled());
    assertTrue(compiler.acceptEcmaScript5());
    assertEquals(LanguageMode.ECMASCRIPT5_STRICT, compiler.languageMode());
  }

  @Test
  public void testInitOptions_typeParseErrorDisabledWhenCheckTypesFalse() {
    options.checkTypes = false;
    compiler.initOptions(options);
    assertFalse(compiler.isTypeCheckingEnabled());
  }

  @Test
  public void testInit_withSourceArrays() {
    JSSourceFile[] externs = new JSSourceFile[] { JSSourceFile.fromCode("extern.js", "var ext;") };
    JSSourceFile[] inputs = new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a = 1;") };
    compiler.init(externs, inputs, options);

    assertEquals(1, compiler.getInputsInOrder().size());
    assertEquals(1, compiler.getExternsInOrder().size());
    assertNotNull(compiler.getInput("input.js"));
    assertNotNull(compiler.getInput("extern.js"));
  }

  @Test
  public void testInit_withSourceLists() {
    List<JSSourceFile> externs = Lists.newArrayList(JSSourceFile.fromCode("ext.js", ""));
    List<JSSourceFile> inputs = Lists.newArrayList(JSSourceFile.fromCode("in.js", "var x = 2;"));
    compiler.init(externs, inputs, options);

    assertEquals(1, compiler.getInputsForTesting().size());
    assertEquals(1, compiler.getExternsForTesting().size());
  }

  @Test
  public void testInit_withModulesArray() {
    JSSourceFile[] externs = new JSSourceFile[] { JSSourceFile.fromCode("ext.js", "") };
    JSModule mod1 = new JSModule("m1");
    mod1.add(JSSourceFile.fromCode("m1.js", "var a = 1;"));
    JSModule[] modules = new JSModule[] { mod1 };

    compiler.init(externs, modules, options);
    assertEquals(1, compiler.getInputsInOrder().size());
  }

  @Test
  public void testInitModules_multipleModulesWithDependencies() {
    JSModule m1 = new JSModule("m1");
    m1.add(JSSourceFile.fromCode("m1.js", "var a = 1;"));
    JSModule m2 = new JSModule("m2");
    m2.add(JSSourceFile.fromCode("m2.js", "var b = 2;"));
    m2.addDependency(m1);

    List<JSSourceFile> externs = Lists.newArrayList();
    List<JSModule> modules = Lists.newArrayList(m1, m2);
    compiler.initModules(externs, modules, options);

    assertNotNull(compiler.getModuleGraph());
    assertEquals(2, compiler.getInputsInOrder().size());
  }

  @Test
  public void testInitModules_emptyModuleList_reportsError() {
    compiler.initModules(Lists.<JSSourceFile>newArrayList(), Lists.<JSModule>newArrayList(), options);
    assertTrue(compiler.hasErrors());
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testInitModules_emptyRootModuleInMultiModule_reportsError() {
    JSModule m1 = new JSModule("m1"); // empty
    JSModule m2 = new JSModule("m2");
    m2.add(JSSourceFile.fromCode("m2.js", "var b = 2;"));

    compiler.initModules(Lists.<JSSourceFile>newArrayList(), Lists.newArrayList(m1, m2), options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInitModules_duplicateInputs_reportsError() {
    JSSourceFile ext1 = JSSourceFile.fromCode("dup.js", "");
    JSSourceFile ext2 = JSSourceFile.fromCode("dup.js", "");
    compiler.initModules(Lists.newArrayList(ext1, ext2), Lists.newArrayList(new JSModule("m1")), options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInitModules_duplicateCodeInputs_reportsError() {
    JSModule m1 = new JSModule("m1");
    m1.add(JSSourceFile.fromCode("dup.js", "var a = 1;"));
    m1.add(JSSourceFile.fromCode("dup.js", "var b = 2;"));
    compiler.initModules(Lists.<JSSourceFile>newArrayList(), Lists.newArrayList(m1), options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testCompile_singleExternAndInput() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var window;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 10; function getX() { return x; }");
    Result result = compiler.compile(extern, input, options);
    assertTrue(result.success);
    assertEquals(0, result.errors.length);
  }

  @Test
  public void testCompile_singleExternAndMultipleInputs() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("input1.js", "var a = 1;"),
        JSSourceFile.fromCode("input2.js", "var b = 2;")
    };
    Result result = compiler.compile(extern, inputs, options);
    assertTrue(result.success);
  }

  @Test
  public void testCompile_singleExternAndModules() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSModule m1 = new JSModule("m1");
    m1.add(JSSourceFile.fromCode("input1.js", "var a = 1;"));
    Result result = compiler.compile(extern, new JSModule[] { m1 }, options);
    assertTrue(result.success);
  }

  @Test
  public void testCompile_arraysAndLists() {
    JSSourceFile[] externs = new JSSourceFile[] { JSSourceFile.fromCode("extern.js", "") };
    JSSourceFile[] inputs = new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function f() {}") };
    Result result = compiler.compile(externs, inputs, options);
    assertTrue(result.success);
  }

  @Test
  public void testCompile_modulesArray() {
    JSSourceFile[] externs = new JSSourceFile[] {};
    JSModule m1 = new JSModule("m1");
    m1.add(JSSourceFile.fromCode("m1.js", "var x = 1;"));
    Result result = compiler.compile(externs, new JSModule[] { m1 }, options);
    assertTrue(result.success);
  }

  @Test(expected = IllegalStateException.class)
  public void testCompile_calledTwice_throwsException() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);
    compiler.compile(extern, input, options);
  }

  @Test
  public void testDisableThreads() {
    compiler.disableThreads();
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    Result result = compiler.compile(extern, input, options);
    assertTrue(result.success);
  }

  @Test
  public void testRunCallableWithLargeStack() {
    Integer res = Compiler.runCallableWithLargeStack(new Callable<Integer>() {
      public Integer call() {
        return 42;
      }
    });
    assertEquals(Integer.valueOf(42), res);
  }

  @Test(expected = RuntimeException.class)
  public void testRunCallable_exceptionThrown() {
    Compiler.runCallable(new Callable<Void>() {
      public Void call() throws Exception {
        throw new IOException("error");
      }
    }, false, false);
  }

  @Test
  public void testSetPassConfig() {
    PassConfig passConfig = new DefaultPassConfig(options);
    compiler.setPassConfig(passConfig);
    assertSame(passConfig, compiler.getPassConfig());
  }

  @Test(expected = NullPointerException.class)
  public void testSetPassConfig_null_throwsException() {
    compiler.setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfig_alreadyAssigned_throwsException() {
    PassConfig p1 = new DefaultPassConfig(options);
    PassConfig p2 = new DefaultPassConfig(options);
    compiler.setPassConfig(p1);
    compiler.setPassConfig(p2);
  }

  @Test
  public void testPrecheck_returnsTrue() {
    assertTrue(compiler.precheck());
  }

  @Test
  public void testToSource_singleScript() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a=1;");
    compiler.compile(extern, input, options);
    String source = compiler.toSource();
    assertTrue(source.contains("var a=1"));
  }

  @Test
  public void testToSourceArray_multipleInputs() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("in1.js", "var a=1;"),
        JSSourceFile.fromCode("in2.js", "var b=2;")
    };
    compiler.compile(extern, inputs, options);
    String[] sources = compiler.toSourceArray();
    assertEquals(2, sources.length);
    assertTrue(sources[0].contains("var a=1"));
    assertTrue(sources[1].contains("var b=2"));
  }

  @Test
  public void testToSource_withModule() {
    JSModule mod = new JSModule("mod");
    mod.add(JSSourceFile.fromCode("mod.js", "var msg='hello';"));
    compiler.compile(new JSSourceFile[]{}, new JSModule[]{mod}, options);
    String src = compiler.toSource(mod);
    assertTrue(src.contains("var msg=\"hello\"") || src.contains("var msg='hello'"));

    String[] srcArray = compiler.toSourceArray(mod);
    assertEquals(1, srcArray.length);

    JSModule emptyMod = new JSModule("empty");
    assertEquals("", compiler.toSource(emptyMod));
    assertEquals(0, compiler.toSourceArray(emptyMod).length);
  }

  @Test
  public void testToSource_withCodeBuilderAndDelimiters() {
    options.printInputDelimiter = true;
    options.inputDelimiter = "// %name% : %num%";
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 10;");
    compiler.compile(extern, input, options);

    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    Node scriptNode = compiler.getInputsInOrder().get(0).getAstRoot(compiler);
    compiler.toSource(cb, 0, scriptNode);
    assertTrue(cb.toString().contains("// input.js : 0"));
  }

  @Test
  public void testCodeBuilder_helperMethods() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("line1\nline2");
    assertEquals(1, cb.getLineIndex());
    assertEquals(5, cb.getColumnIndex());
    assertEquals(11, cb.getLength());
    assertTrue(cb.endsWith("line2"));
    assertFalse(cb.endsWith("line1"));

    cb.reset();
    assertEquals(0, cb.getLength());
    assertEquals(1, cb.getLineIndex());
  }

  @Test
  public void testToSource_nodeOnly() {
    Node node = compiler.parseTestCode("var a = 1;");
    String src = compiler.toSource(node);
    assertTrue(src.contains("var a=1"));
  }

  @Test
  public void testGetMessages_andErrorsAndWarnings() {
    compiler.initOptions(options);
    assertEquals(0, compiler.getMessages().length);
    assertEquals(0, compiler.getErrors().length);
    assertEquals(0, compiler.getWarnings().length);
  }

  @Test
  public void testGetRoot_andNodes() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);
    assertNotNull(compiler.getRoot());
  }

  @Test
  public void testUniqueNameIdSupplier() {
    compiler.resetUniqueNameId();
    Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
    assertEquals("0", supplier.get());
    assertEquals("1", supplier.get());
    compiler.resetUniqueNameId();
    assertEquals("0", supplier.get());
  }

  @Test
  public void testAreNodesEqualForInlining() {
    Node n1 = Node.newString("a");
    Node n2 = Node.newString("a");
    Node n3 = Node.newString("b");
    assertTrue(compiler.areNodesEqualForInlining(n1, n2));
    assertFalse(compiler.areNodesEqualForInlining(n1, n3));

    options.ambiguateProperties = true;
    assertTrue(compiler.areNodesEqualForInlining(n1, n2));
  }

  @Test
  public void testRemoveExternInput_andNewExternInput() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var e = 1;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    compiler.removeExternInput("nonExistent.js");
    assertNotNull(compiler.getInput("extern.js"));

    CompilerInput newExt = compiler.newExternInput("synthetic_extern.js");
    assertNotNull(newExt);
    assertNotNull(compiler.getInput("synthetic_extern.js"));

    compiler.removeExternInput("extern.js");
    assertNull(compiler.getInput("extern.js"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInput_duplicate_throwsException() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);
    compiler.newExternInput("extern.js");
  }

  @Test
  public void testAddAndReplaceIncrementalSourceAst() {
    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(extern, input, options);

    JsAst incAst = new JsAst(JSSourceFile.fromCode("inc.js", "var inc = 10;"));
    compiler.addIncrementalSourceAst(incAst);
    assertNotNull(compiler.getInput("inc.js"));

    JsAst replaceAst = new JsAst(JSSourceFile.fromCode("input.js", "var a = 2;"));
    boolean replaced = compiler.replaceIncrementalSourceAst(replaceAst);
    assertTrue(replaced);
    assertEquals("input.js", compiler.getInput("input.js").getName());
  }

  @Test
  public void testGetTypeRegistry_andScopeCreators() {
    JSTypeRegistry registry = compiler.getTypeRegistry();
    assertNotNull(registry);
    assertSame(registry, compiler.getTypeRegistry());
    assertNull(compiler.getTypedScopeCreator());
    assertNotNull(compiler.ensureDefaultPassConfig());
    assertNotNull(compiler.buildKnownSymbolTable());
    assertNull(compiler.getTopScope());
    assertNotNull(compiler.getReverseAbstractInterpreter());
    assertNotNull(compiler.getTypeValidator());
  }

  @Test
  public void testParseSyntheticCode_andTestCode() {
    Node node1 = compiler.parseSyntheticCode("var x = 1;");
    assertNotNull(node1);
    Node node2 = compiler.parseSyntheticCode("synth.js", "var y = 2;");
    assertNotNull(node2);
    Node node3 = compiler.parseTestCode("var z = 3;");
    assertNotNull(node3);
    assertNotNull(compiler.getDefaultErrorReporter());
  }

  @Test
  public void testParseFile() {
    JSSourceFile file = JSSourceFile.fromCode("test.js", "var x = 100;");
    Node n = compiler.parse(file);
    assertNotNull(n);
  }

  @Test
  public void testManageClosureDependencies() {
    options.manageClosureDependencies = true;
    options.setManageClosureDependencies(true);
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in1 = JSSourceFile.fromCode("in1.js", "goog.provide('a'); var a = 1;");
    JSSourceFile in2 = JSSourceFile.fromCode("in2.js", "goog.require('a'); var b = a;");
    Result result = compiler.compile(ext, new JSSourceFile[] { in2, in1 }, options);
    assertTrue(result.success);
  }

  @Test
  public void testManageClosureDependencies_missingProvide_reportsError() {
    options.manageClosureDependencies = true;
    options.manageClosureDependenciesEntryPoints = Lists.newArrayList("non_existent_entry");
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in1 = JSSourceFile.fromCode("in1.js", "goog.provide('a');");
    Result result = compiler.compile(ext, new JSSourceFile[] { in1 }, options);
    assertFalse(result.success);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testExternExports() {
    options.setExternExportsPath("exports.js");
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("in.js", "goog.exportSymbol('myExport', function() {});");
    Result res = compiler.compile(ext, in, options);
    assertTrue(res.success);
    assertNotNull(res.externExport);
  }

  @Test
  public void testRemoveTryCatchFinally() {
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("in.js", "try { var x = 1; } catch (e) { var y = 2; } finally { var z = 3; }");
    options.removeTryCatchFinally = true;
    Result res = compiler.compile(ext, in, options);
    assertTrue(res.success);
  }

  @Test
  public void testStripCode() {
    options.stripTypes = Sets.newHashSet("goog.debug.Logger");
    options.stripNameSuffixes = Sets.newHashSet("logger");
    options.stripTypePrefixes = Sets.newHashSet("goog.debug");
    options.stripNamePrefixes = Sets.newHashSet("dbg_");

    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("in.js", "var dbg_foo = 1;");
    Result res = compiler.compile(ext, in, options);
    assertTrue(res.success);
  }

  @Test
  public void testCssRenamingMap() {
    CssRenamingMap map = new CssRenamingMap() {
      public String get(String value) {
        return "renamed-" + value;
      }
      public Style getStyle() {
        return Style.BY_WHOLE;
      }
    };
    compiler.setCssRenamingMap(map);
    assertSame(map, compiler.getCssRenamingMap());
  }

  @Test
  public void testProcessDefines_andInliningForbidden() {
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("in.js", "/** @define {boolean} */ var DEF = true;");
    compiler.compile(ext, in, options);
    compiler.processDefines();

    options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
    assertTrue(compiler.isInliningForbidden());
  }

  @Test
  public void testComputeCFG_andNormalize() {
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("in.js", "function f(x) { if (x > 0) return 1; else return 2; }");
    compiler.compile(ext, in, options);

    ControlFlowGraph<Node> cfg = compiler.computeCFG();
    assertNotNull(cfg);

    compiler.normalize();
  }

  @Test
  public void testPrepareAst() {
    Node node = compiler.parseTestCode("var a = 1;");
    compiler.prepareAst(node);
    assertNotNull(node);
  }

  @Test
  public void testRecordFunctionInformation() {
    options.recordFunctionInformation = true;
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("in.js", "function hello() { return 'world'; }");
    Result res = compiler.compile(ext, in, options);
    assertTrue(res.success);
    assertNotNull(compiler.getFunctionalInformationMap());
  }

  @Test
  public void testCodeChangeHandlers() {
    final boolean[] changed = new boolean[] { false };
    CodeChangeHandler handler = new CodeChangeHandler() {
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
  public void testCodingConvention_andIdeMode_andConstKeyword() {
    CodingConvention customConv = new GoogleCodingConvention();
    options.setCodingConvention(customConv);
    assertSame(customConv, compiler.getCodingConvention());

    options.ideMode = true;
    assertTrue(compiler.isIdeMode());

    options.acceptConstKeyword = true;
    assertTrue(compiler.acceptConstKeyword());
  }

  @Test
  public void testGetParserConfig_modes() {
    options.setLanguageIn(LanguageMode.ECMASCRIPT3);
    assertNotNull(compiler.getParserConfig());

    compiler = new Compiler();
    options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
    assertNotNull(compiler.getParserConfig());
  }

  @Test
  public void testDiagnosticGroups_andReporting() {
    assertNotNull(compiler.getDiagnosticGroups());

    JSError err = JSError.make("test.js", 1, 1, CheckLevel.ERROR, DiagnosticType.error("ERR", "Error msg"));
    compiler.initOptions(options);
    compiler.report(err);
    assertEquals(1, compiler.getErrorCount());
    assertTrue(compiler.hasErrors());
    assertEquals(CheckLevel.ERROR, compiler.getErrorLevel(err));
  }

  @Test(expected = RuntimeException.class)
  public void testThrowInternalError() {
    compiler.throwInternalError("Some internal error", new IllegalArgumentException("cause"));
  }

  @Test
  public void testGetSourceLineAndRegion() {
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("input.js", "line1\nline2\nline3\nline4");
    compiler.compile(ext, in, options);

    assertNull(compiler.getSourceLine("input.js", 0));
    assertNull(compiler.getSourceLine("nonExistent.js", 1));
    assertEquals("line2", compiler.getSourceLine("input.js", 2));

    assertNull(compiler.getSourceRegion("input.js", 0));
    assertNull(compiler.getSourceRegion("nonExistent.js", 1));
    Region region = compiler.getSourceRegion("input.js", 2);
    assertNotNull(region);
  }

  @Test
  public void testGetNodeForCodeInsertion_nullModule() {
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(ext, in, options);

    Node n = compiler.getNodeForCodeInsertion(null);
    assertNotNull(n);
  }

  @Test
  public void testGetNodeForCodeInsertion_withModule() {
    JSModule mod = new JSModule("mod");
    mod.add(JSSourceFile.fromCode("mod.js", "var a = 1;"));
    compiler.compile(new JSSourceFile[]{}, new JSModule[]{mod}, options);

    Node n = compiler.getNodeForCodeInsertion(mod);
    assertNotNull(n);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertion_emptyInputs_throwsException() {
    compiler.getNodeForCodeInsertion(null);
  }

  @Test
  public void testGetSourceMap_getVariableMap_getPropertyMap_getOptions() {
    assertNull(compiler.getSourceMap());
    compiler.initOptions(options);
    assertSame(options, compiler.getOptions());
    assertNull(compiler.getVariableMap());
    assertNull(compiler.getPropertyMap());
  }

  @Test
  public void testSetLoggingLevel() {
    Compiler.setLoggingLevel(Level.WARNING);
  }

  @Test
  public void testGetAstDotGraph() throws IOException {
    assertEquals("", compiler.getAstDotGraph());

    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(ext, in, options);

    String dot = compiler.getAstDotGraph();
    assertNotNull(dot);
    assertTrue(dot.contains("digraph"));
  }

  @Test
  public void testGetState_andSetState() {
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(ext, in, options);

    Compiler.IntermediateState state = compiler.getState();
    assertNotNull(state);

    Compiler anotherCompiler = new Compiler();
    anotherCompiler.init(new JSSourceFile[]{ext}, new JSSourceFile[]{in}, options);
    anotherCompiler.setState(state);
    assertNotNull(anotherCompiler.getRoot());
  }

  @Test
  public void testHasRegExpGlobalReferences() {
    assertTrue(compiler.hasRegExpGlobalReferences());
    compiler.setHasRegExpGlobalReferences(false);
    assertFalse(compiler.hasRegExpGlobalReferences());
  }

  @Test
  public void testUpdateGlobalVarReferences() {
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("input.js", "var a = 1;");
    compiler.compile(ext, in, options);

    Node script = compiler.getInputsInOrder().get(0).getAstRoot(compiler);
    compiler.updateGlobalVarReferences(Maps.<Scope.Var, ReferenceCollectingCallback.ReferenceCollection>newHashMap(), script);
    assertNotNull(compiler.getGlobalVarReferences());
  }

  @Test
  public void testDevMode_everyPass_andSanityCheck() {
    options.devMode = DevMode.EVERY_PASS;
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("input.js", "var a = 1;");
    Result res = compiler.compile(ext, in, options);
    assertTrue(res.success);
  }

  @Test
  public void testDevMode_startAndEnd() {
    options.devMode = DevMode.START_AND_END;
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("input.js", "var a = 1;");
    Result res = compiler.compile(ext, in, options);
    assertTrue(res.success);
  }

  @Test
  public void testTracerMode_all() {
    options.tracer = TracerMode.ALL;
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile in = JSSourceFile.fromCode("input.js", "var a = 1;");
    Result res = compiler.compile(ext, in, options);
    assertTrue(res.success);
  }

  @Test
  public void testSourceFileMarkedAsExternOrNoCompile() {
    JSSourceFile ext = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile inExtern = JSSourceFile.fromCode("inExtern.js", "/** @externs */ var extA;");
    JSSourceFile inNoCompile = JSSourceFile.fromCode("inNoCompile.js", "/** @nocompile */ var ignored = 1;");
    JSSourceFile inNormal = JSSourceFile.fromCode("normal.js", "var normalVar = 2;");

    Result res = compiler.compile(ext, new JSSourceFile[] { inExtern, inNoCompile, inNormal }, options);
    assertTrue(res.success);
    assertEquals(1, compiler.getInputsInOrder().size());
  }

  @Test
  public void testRebuildInputsFromModules() {
    JSModule mod = new JSModule("mod");
    mod.add(JSSourceFile.fromCode("m1.js", "var a = 1;"));
    compiler.init(new JSSourceFile[]{}, new JSModule[]{mod}, options);

    mod.add(JSSourceFile.fromCode("m2.js", "var b = 2;"));
    compiler.rebuildInputsFromModules();
    assertEquals(2, compiler.getInputsInOrder().size());
    assertNotNull(compiler.getInput("m2.js"));
  }
}
