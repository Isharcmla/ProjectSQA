package com.google.javascript.jscomp;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScopedAliasesTest {

  private Compiler compiler;
  private PreprocessorSymbolTable preprocessorSymbolTable;
  private AliasTransformationHandler transformationHandler;

  private static class TestAliasTransformation implements AliasTransformation {
    @Override
    public void addAlias(String alias, String expanded) {}
  }

  private static class TestAliasTransformationHandler implements AliasTransformationHandler {
    @Override
    public AliasTransformation logAliasTransformation(
        String sourceFile, SourcePosition<AliasTransformation> position) {
      return new TestAliasTransformation();
    }
  }

  @Before
  public void setUp() {
    compiler = new Compiler();
    preprocessorSymbolTable = new PreprocessorSymbolTable(new Node(0));
    transformationHandler = new TestAliasTransformationHandler();
  }

  private void testScopedAliases(String js, String expectedJs) {
    testScopedAliases(js, expectedJs, null);
  }

  private void testScopedAliases(String js, DiagnosticType expectedError) {
    testScopedAliases(js, null, expectedError);
  }

  private void testScopedAliases(String js, String expectedJs, DiagnosticType expectedError) {
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node externs = new Node(0);
    Node root = compiler.parseTestCode(js);

    ScopedAliases pass = new ScopedAliases(compiler, preprocessorSymbolTable, transformationHandler);
    pass.process(externs, root);

    if (expectedError != null) {
      Assert.assertTrue("Expected error: " + expectedError.key, compiler.getErrorCount() > 0);
      boolean found = false;
      for (JSError error : compiler.getErrors()) {
        if (error.getType().equals(expectedError)) {
          found = true;
          break;
        }
      }
      Assert.assertTrue("Expected diagnostic type: " + expectedError.key, found);
    } else {
      Assert.assertEquals("Expected no errors: " + compiler.getErrors(), 0, compiler.getErrorCount());
      if (expectedJs != null) {
        Node expectedRoot = compiler.parseTestCode(expectedJs);
        String actualCode = compiler.toSource(root);
        String expectedCode = compiler.toSource(expectedRoot);
        Assert.assertEquals(expectedCode, actualCode);
      }
    }
  }

  @Test
  public void testProcess_simpleAlias_inlinedSuccessfully() {
    String js = "goog.scope(function() { var dom = goog.dom; dom.createElement('div'); });";
    String expected = "goog.dom.createElement('div');";
    testScopedAliases(js, expected);
  }

  @Test
  public void testProcess_multipleAliases_inlinedSuccessfully() {
    String js = "goog.scope(function() { var dom = goog.dom; var TagName = dom.TagName; dom.createElement(TagName.DIV); });";
    String expected = "goog.dom.createElement(goog.dom.TagName.DIV);";
    testScopedAliases(js, expected);
  }

  @Test
  public void testProcess_nullPreprocessorSymbolTable_inlinedSuccessfully() {
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node externs = new Node(0);
    Node root = compiler.parseTestCode("goog.scope(function() { var d = goog.dom; d.create(); });");

    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.process(externs, root);

    Assert.assertEquals(0, compiler.getErrorCount());
    String actualCode = compiler.toSource(root);
    Node expectedRoot = compiler.parseTestCode("goog.dom.create();");
    Assert.assertEquals(compiler.toSource(expectedRoot), actualCode);
  }

  @Test
  public void testProcess_aliasCycle_reportsError() {
    String js = "goog.scope(function() { var a = b; var b = a; a.foo(); });";
    testScopedAliases(js, ScopedAliases.GOOG_SCOPE_ALIAS_CYCLE);
  }

  @Test
  public void testProcess_scopeUsedImproperly_notInExprResult_reportsError() {
    String js = "var x = goog.scope(function() {});";
    testScopedAliases(js, ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void testProcess_scopeHasBadParameters_tooManyArgs_reportsError() {
    String js = "goog.scope(function() {}, 1);";
    testScopedAliases(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testProcess_scopeHasBadParameters_namedFunction_reportsError() {
    String js = "goog.scope(function foo() {});";
    testScopedAliases(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testProcess_scopeHasBadParameters_functionWithParameters_reportsError() {
    String js = "goog.scope(function(a) {});";
    testScopedAliases(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testProcess_scopeHasBadParameters_nonFunctionArg_reportsError() {
    String js = "goog.scope(123);";
    testScopedAliases(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testProcess_scopeReferencesThis_reportsError() {
    String js = "goog.scope(function() { this.foo = 1; });";
    testScopedAliases(js, ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void testProcess_scopeUsesReturn_reportsError() {
    String js = "goog.scope(function() { return 1; });";
    testScopedAliases(js, ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void testProcess_scopeUsesThrow_reportsError() {
    String js = "goog.scope(function() { throw 'error'; });";
    testScopedAliases(js, ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  @Test
  public void testProcess_aliasRedefined_reportsError() {
    String js = "goog.scope(function() { var a = goog.a; a = goog.b; });";
    testScopedAliases(js, ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void testProcess_nonAliasLocalVariable_transformsToScopedGlobal() {
    String js = "goog.scope(function() { var localVal = 123; use(localVal); });";
    String expected = "$jscomp.scope.localVal = 123; use($jscomp.scope.localVal);";
    testScopedAliases(js, expected);
  }

  @Test
  public void testProcess_repeatedNonAliasLocalVariableNames_incrementsSuffix() {
    String js = "goog.scope(function() { var a = 1; use(a); }); goog.scope(function() { var a = 2; use(a); });";
    String expected = "$jscomp.scope.a = 1; use($jscomp.scope.a); $jscomp.scope.a$1 = 2; use($jscomp.scope.a$1);";
    testScopedAliases(js, expected);
  }

  @Test
  public void testProcess_functionDeclaration_transformsToScopedGlobal() {
    String js = "goog.scope(function() { function foo() { return 1; } foo(); });";
    String expected = "$jscomp.scope.foo = function() { return 1; }; $jscomp.scope.foo();";
    testScopedAliases(js, expected);
  }

  @Test
  public void testProcess_uninitializedVar_transformsToScopedGlobal() {
    String js = "goog.scope(function() { var a; a = 1; use(a); });";
    String expected = "use($jscomp.scope.a);";
    testScopedAliases(js, expected);
  }

  @Test
  public void testProcess_catchClauseInScope_reportsError() {
    String js = "goog.scope(function() { try {} catch (e) {} });";
    testScopedAliases(js, ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void testProcess_namespaceShadowing_renamesShadowedVariable() {
    String js = "goog.scope(function() { var dom = goog.dom; function inner() { var goog = 1; return goog; } dom.createElement(inner()); });";
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node externs = new Node(0);
    Node root = compiler.parseTestCode(js);

    ScopedAliases pass = new ScopedAliases(compiler, preprocessorSymbolTable, transformationHandler);
    pass.process(externs, root);

    Assert.assertEquals(0, compiler.getErrorCount());
    String actualCode = compiler.toSource(root);
    Assert.assertTrue(actualCode.contains("goog.dom.createElement"));
  }

  @Test
  public void testProcess_jsdocTypeReferences_inlinedSuccessfully() {
    String js = "goog.scope(function() { var dom = goog.dom; /** @type {dom.Element} */ var el; });";
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node externs = new Node(0);
    Node root = compiler.parseTestCode(js);

    ScopedAliases pass = new ScopedAliases(compiler, preprocessorSymbolTable, transformationHandler);
    pass.process(externs, root);

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_topLevelNonScopeFunction_isNotTraversed() {
    String js = "function normalFn() { var x = 1; return x; }";
    String expected = "function normalFn() { var x = 1; return x; }";
    testScopedAliases(js, expected);
  }

  @Test
  public void testProcess_emptyRoot_noChangesAndNoErrors() {
    String js = "";
    String expected = "";
    testScopedAliases(js, expected);
  }

  @Test
  public void testHotSwapScript_directCall_executesSuccessfully() {
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node root = compiler.parseTestCode("goog.scope(function() { var d = goog.dom; d.foo(); });");
    ScopedAliases pass = new ScopedAliases(compiler, preprocessorSymbolTable, transformationHandler);
    pass.hotSwapScript(root, null);

    Assert.assertEquals(0, compiler.getErrorCount());
    String actualCode = compiler.toSource(root);
    Node expectedRoot = compiler.parseTestCode("goog.dom.foo();");
    Assert.assertEquals(compiler.toSource(expectedRoot), actualCode);
  }

  @Test
  public void testProcess_multipleVarsInSingleVarStatement_detachedCorrectly() {
    String js = "goog.scope(function() { var a = goog.a, b = goog.b; a(); b(); });";
    String expected = "goog.a(); goog.b();";
    testScopedAliases(js, expected);
  }
}
