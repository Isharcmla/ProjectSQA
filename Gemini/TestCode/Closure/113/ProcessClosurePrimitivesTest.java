package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class ProcessClosurePrimitivesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Node testProcess(String js, CheckLevel requiresLevel) {
    return testProcess(js, null, requiresLevel);
  }

  private Node testProcess(String js, PreprocessorSymbolTable symbolTable, CheckLevel requiresLevel) {
    Node root = compiler.parseTestCode(js);
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, symbolTable, requiresLevel);
    pass.process(null, root);
    return root;
  }

  @Test
  public void testSimpleProvide_generatesVarDeclaration() {
    Node root = testProcess("goog.provide('foo');", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertTrue(root.getFirstChild().isVar());
  }

  @Test
  public void testProvideHierarchy_generatesPrefixes() {
    Node root = testProcess("goog.provide('foo.bar.baz');", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(root);
  }

  @Test
  public void testProvideWithExistingVarDeclaration_reusesDeclaration() {
    Node root = testProcess("goog.provide('foo'); var foo = 123;", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(root);
  }

  @Test
  public void testProvideWithExistingAssignment_convertsToVar() {
    Node root = testProcess("goog.provide('foo'); foo = {};", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(root);
  }

  @Test
  public void testProvideWithExistingFunctionDecl_reportsError() {
    testProcess("goog.provide('foo'); function foo() {}", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.FUNCTION_NAMESPACE_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testDuplicateProvide_reportsError() {
    testProcess("goog.provide('foo'); goog.provide('foo');", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.DUPLICATE_NAMESPACE_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testInvalidProvideIdentifier_reportsError() {
    testProcess("goog.provide('foo.123');", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_PROVIDE_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testProvideNullArgument_reportsError() {
    testProcess("goog.provide();", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.NULL_ARGUMENT_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testProvideInvalidArgumentType_reportsError() {
    testProcess("goog.provide(123);", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testProvideTooManyArguments_reportsError() {
    testProcess("goog.provide('foo', 'bar');", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testRequireProvidedNamespace_removesRequire() {
    Node root = testProcess("goog.provide('foo'); goog.require('foo');", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(root);
  }

  @Test
  public void testRequireMissingProvide_checkLevelError_reportsError() {
    testProcess("goog.require('missing.ns');", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.MISSING_PROVIDE_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testRequireMissingProvide_checkLevelOff_reportsNoError() {
    testProcess("goog.require('missing.ns');", CheckLevel.OFF);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testRequireLateProvide_reportsLateProvideError() {
    testProcess("goog.require('foo'); goog.provide('foo');", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.LATE_PROVIDE_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testRequireNullArgument_reportsError() {
    testProcess("goog.require();", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.NULL_ARGUMENT_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testRequireInvalidArgument_reportsError() {
    testProcess("goog.require(123);", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testExportSymbol_collectsNames() {
    Node root = compiler.parseTestCode(
        "goog.exportSymbol('globalName', x);\n" +
        "goog.exportSymbol('ns.subName', y);");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR);
    pass.process(null, root);

    Set<String> exported = pass.getExportedVariableNames();
    Assert.assertTrue(exported.contains("globalName"));
    Assert.assertTrue(exported.contains("ns"));
  }

  @Test
  public void testAddDependency_replacesWithZero() {
    Node root = testProcess("goog.addDependency('path/file.js', ['provide.name'], ['require.name']);", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertTrue(root.getFirstChild().getFirstChild().isNumber());
    Assert.assertEquals(0.0, root.getFirstChild().getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testSetCssNameMapping_validByPart() {
    testProcess("goog.setCssNameMapping({'button': 'btn', 'header': 'hdr'});", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertNotNull(compiler.getCssRenamingMap());
    Assert.assertEquals("btn", compiler.getCssRenamingMap().get("button"));
    Assert.assertEquals("other", compiler.getCssRenamingMap().get("other"));
  }

  @Test
  public void testSetCssNameMapping_validByWhole() {
    testProcess("goog.setCssNameMapping({'btn-primary': 'btn-p', 'btn': 'b', 'primary': 'p'}, 'BY_WHOLE');", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertNotNull(compiler.getCssRenamingMap());
    Assert.assertEquals(CssRenamingMap.Style.BY_WHOLE, compiler.getCssRenamingMap().getStyle());
  }

  @Test
  public void testSetCssNameMapping_byPartWithDash_reportsWarning() {
    testProcess("goog.setCssNameMapping({'btn-primary': 'btn-p'}, 'BY_PART');", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_CSS_RENAMING_MAP.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testSetCssNameMapping_byWholeMismatch_reportsWarning() {
    testProcess("goog.setCssNameMapping({'a-b': 'x', 'a': '1', 'b': '2'}, 'BY_WHOLE');", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_CSS_RENAMING_MAP.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testSetCssNameMapping_invalidStyle_reportsError() {
    testProcess("goog.setCssNameMapping({}, 'INVALID_STYLE');", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_STYLE_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testSetCssNameMapping_nonStringValue_reportsError() {
    testProcess("goog.setCssNameMapping({'key': 123});", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testSetCssNameMapping_nullArg_reportsError() {
    testProcess("goog.setCssNameMapping();", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.NULL_ARGUMENT_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testSetCssNameMapping_nonObjectLit_reportsError() {
    testProcess("goog.setCssNameMapping('notAnObject');", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.EXPECTED_OBJECTLIT_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testSetCssNameMapping_secondArgNotString_reportsError() {
    testProcess("goog.setCssNameMapping({}, 123);", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.EXPECTED_STRING_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testSetCssNameMapping_tooManyArgs_reportsError() {
    testProcess("goog.setCssNameMapping({}, 'BY_PART', 'extra');", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testDefine_validCall() {
    Node root = testProcess("/** @define {boolean} */ goog.define('FLAG', true);", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertTrue(root.getFirstChild().isVar());
    Assert.assertEquals("FLAG", root.getFirstChild().getFirstChild().getString());
  }

  @Test
  public void testDefine_missingAnnotation_reportsError() {
    testProcess("goog.define('FLAG', true);", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.MISSING_DEFINE_ANNOTATION.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testDefine_invalidIdentifier_reportsError() {
    testProcess("/** @define {boolean} */ goog.define('invalid-name', true);", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_DEFINE_NAME_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testDefine_missingArgs_reportsError() {
    testProcess("/** @define {boolean} */ goog.define();", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.NULL_ARGUMENT_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testDefine_singleArg_reportsError() {
    testProcess("/** @define {boolean} */ goog.define('FLAG');", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.NULL_ARGUMENT_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testDefine_tooManyArgs_reportsError() {
    testProcess("/** @define {boolean} */ goog.define('FLAG', true, 'extra');", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testBaseClass_constructor_rewritesCorrectly() {
    testProcess(
        "function Base() {}\n" +
        "function Sub() { goog.base(this); }\n" +
        "goog.inherits(Sub, Base);",
        CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testBaseClass_method_rewritesCorrectly() {
    testProcess(
        "function Base() {}\n" +
        "function Sub() {}\n" +
        "goog.inherits(Sub, Base);\n" +
        "Sub.prototype.foo = function(x) { goog.base(this, 'foo', x); };",
        CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testBaseClass_notCalledOnThis_reportsError() {
    testProcess(
        "function Sub() { goog.base(); }\n" +
        "goog.inherits(Sub, Base);",
        CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testBaseClass_notDirectCall_reportsError() {
    testProcess("var x = goog.base;", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testBaseClass_methodMissingMethodName_reportsError() {
    testProcess(
        "Sub.prototype.foo = function() { goog.base(this); };",
        CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testBaseClass_methodNameMismatch_reportsError() {
    testProcess(
        "Sub.prototype.foo = function() { goog.base(this, 'bar'); };",
        CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testBaseClass_constructorMissingInherits_reportsError() {
    testProcess("function Sub() { goog.base(this); }", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testBaseClass_outsideMethod_reportsError() {
    testProcess("goog.base(this);", CheckLevel.ERROR);
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testTypedefHandling() {
    testProcess("goog.provide('ns.MyType'); /** @typedef {number} */ ns.MyType;", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testSymbolTableIntegration() {
    Node root = compiler.parseTestCode("goog.provide('foo.bar'); goog.require('foo.bar');");
    PreprocessorSymbolTable table = new PreprocessorSymbolTable(root);
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, table, CheckLevel.ERROR);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testHotSwapScript() {
    Node root = compiler.parseTestCode("goog.provide('foo');");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR);
    pass.hotSwapScript(root, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testModulesCrossModuleRequire_missingDependency_reportsWarning() {
    JSModule m1 = new JSModule("m1");
    m1.add(SourceFile.fromCode("m1.js", "goog.provide('ns.foo');"));

    JSModule m2 = new JSModule("m2");
    m2.add(SourceFile.fromCode("m2.js", "goog.require('ns.foo');"));

    JSModule[] modules = new JSModule[] { m1, m2 };
    Compiler moduleCompiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    moduleCompiler.initModules(java.util.Arrays.asList(SourceFile.fromCode("externs.js", "")),
        java.util.Arrays.asList(modules), options);
    Node root = moduleCompiler.parseInputs();

    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(moduleCompiler, null, CheckLevel.ERROR);
    pass.process(null, root);
    Assert.assertEquals(1, moduleCompiler.getWarningCount());
    Assert.assertEquals(ProcessClosurePrimitives.XMODULE_REQUIRE_ERROR.key,
        moduleCompiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testImplicitProvideAcrossModules_promotedToCommonModule() {
    JSModule rootMod = new JSModule("root");
    rootMod.add(SourceFile.fromCode("root.js", ""));

    JSModule m1 = new JSModule("m1");
    m1.add(SourceFile.fromCode("m1.js", "goog.provide('ns.a');"));
    m1.addDependency(rootMod);

    JSModule m2 = new JSModule("m2");
    m2.add(SourceFile.fromCode("m2.js", "goog.provide('ns.b');"));
    m2.addDependency(rootMod);

    JSModule[] modules = new JSModule[] { rootMod, m1, m2 };
    Compiler moduleCompiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    moduleCompiler.initModules(java.util.Arrays.asList(SourceFile.fromCode("externs.js", "")),
        java.util.Arrays.asList(modules), options);
    Node root = moduleCompiler.parseInputs();

    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(moduleCompiler, null, CheckLevel.ERROR);
    pass.process(null, root);
    Assert.assertEquals(0, moduleCompiler.getErrorCount());
  }

  @Test
  public void testCandidateProvideDefinition_previousPassPlaceholderRemoval() {
    Node root = compiler.parseTestCode("goog.provide('foo'); var foo = {};");
    Node varNode = root.getLastChild();
    varNode.putBooleanProp(Node.IS_NAMESPACE, true);
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCallOutsideExprResult_ignored() {
    testProcess("var x = goog.provide('foo');", CheckLevel.ERROR);
    Assert.assertEquals(0, compiler.getErrorCount());
  }
}
