package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScopedAliasesTest {

  private Compiler compiler;
  private CompilerOptions.AliasTransformationHandler transformationHandler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    transformationHandler = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
  }

  private void test(String js, String expected) {
    Node root = compiler.parseTestCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    Node externs = new Node(3120); // Token.BLOCK or empty node
    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.process(externs, root);
    Assert.assertEquals(0, compiler.getErrorCount());
    if (expected != null) {
      Node expectedRoot = compiler.parseTestCode(expected);
      String explanation = compiler.toSource(root) + " != " + compiler.toSource(expectedRoot);
      Assert.assertEquals(explanation, compiler.toSource(expectedRoot), compiler.toSource(root));
    }
  }

  private void testError(String js, DiagnosticType expectedError) {
    Node root = compiler.parseTestCode(js);
    Node externs = new Node(3120);
    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.process(externs, root);
    Assert.assertTrue("Expected errors", compiler.getErrorCount() > 0);
    Assert.assertEquals(expectedError, compiler.getErrors()[0].getType());
  }

  @Test
  public void testProcess_simpleAlias_success() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  var DIV = dom.TagName.DIV;\n"
        + "  dom.createElement(DIV);\n"
        + "});";
    String expected = "goog.dom.createElement(goog.dom.TagName.DIV);";
    test(js, expected);
  }

  @Test
  public void testProcess_multipleVarsInSingleDeclaration_success() {
    String js = "goog.scope(function() {\n"
        + "  var a = goog.a, b = goog.b;\n"
        + "  a(b);\n"
        + "});";
    String expected = "goog.a(goog.b);";
    test(js, expected);
  }

  @Test
  public void testProcess_transitiveAlias_success() {
    String js = "goog.scope(function() {\n"
        + "  var g = goog;\n"
        + "  var d = g.dom;\n"
        + "  d.createElement('div');\n"
        + "});";
    String expected = "goog.dom.createElement('div');";
    test(js, expected);
  }

  @Test
  public void testProcess_aliasWithJsDocType_updatesJsDoc() {
    String js = "goog.scope(function() {\n"
        + "  var Button = goog.ui.Button;\n"
        + "  /** @type {Button} */ var b;\n"
        + "  /** @type {Button.Sub} */ var sub;\n"
        + "});";
    Node root = compiler.parseTestCode(js);
    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_withPreprocessorSymbolTable_success() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  dom.createElement('div');\n"
        + "});";
    Node root = compiler.parseTestCode(js);
    PreprocessorSymbolTable table = new PreprocessorSymbolTable(root);
    ScopedAliases pass = new ScopedAliases(compiler, table, transformationHandler);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_namespaceShadowing_renamesShadowedVariable() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  function foo(goog) {\n"
        + "    return goog;\n"
        + "  }\n"
        + "  dom.createElement(foo(1));\n"
        + "});";
    Node root = compiler.parseTestCode(js);
    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testHotSwapScript_directlyCalled_success() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  dom.createElement('div');\n"
        + "});";
    Node root = compiler.parseTestCode(js);
    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.hotSwapScript(root, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testError_scopeUsedImproperly_notAnExprResult() {
    String js = "var x = goog.scope(function() {});";
    testError(js, ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void testError_scopeNoParameters() {
    String js = "goog.scope();";
    testError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_scopeTooManyParameters() {
    String js = "goog.scope(function() {}, 123);";
    testError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_scopeNonFunctionParameter() {
    String js = "goog.scope('not a function');";
    testError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_scopeNamedFunction() {
    String js = "goog.scope(function foo() {});";
    testError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_scopeFunctionHasParameters() {
    String js = "goog.scope(function(param) {});";
    testError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_scopeReferencesThis() {
    String js = "goog.scope(function() {\n"
        + "  this.foo = 1;\n"
        + "});";
    testError(js, ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void testError_scopeUsesReturn() {
    String js = "goog.scope(function() {\n"
        + "  return 1;\n"
        + "});";
    testError(js, ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void testError_scopeUsesThrow() {
    String js = "goog.scope(function() {\n"
        + "  throw 'error';\n"
        + "});";
    testError(js, ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  @Test
  public void testError_aliasRedefined() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  dom = goog.otherDom;\n"
        + "});";
    testError(js, ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void testError_nonAliasLocalVariable() {
    String js = "goog.scope(function() {\n"
        + "  var nonAlias = 123;\n"
        + "});";
    testError(js, ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void testProcess_noScopeCalls_doesNothing() {
    String js = "var a = 1; function foo() { var b = 2; }";
    test(js, js);
  }

  @Test
  public void testProcess_regularGlobalFunctionNotTraversedAsScope() {
    String js = "function regularFunction() { var dom = 1; }";
    test(js, js);
  }

  @Test
  public void testProcess_innerScopeFunctionWithValidUsage() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  function inner() {\n"
        + "    dom.createElement('div');\n"
        + "  }\n"
        + "  inner();\n"
        + "});";
    String expected = "function inner() {\n"
        + "  goog.dom.createElement('div');\n"
        + "}\n"
        + "inner();";
    test(js, expected);
  }
}
