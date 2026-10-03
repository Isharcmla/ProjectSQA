package com.google.javascript.jscomp;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ScopedAliasesTest {

  private Compiler compiler;
  private TestAliasTransformationHandler transformationHandler;

  private static class TestAliasTransformation implements AliasTransformation {
    final List<String> aliases = new ArrayList<String>();

    @Override
    public void addAlias(String alias, String expanded) {
      aliases.add(alias + " -> " + expanded);
    }
  }

  private static class TestAliasTransformationHandler implements AliasTransformationHandler {
    final List<TestAliasTransformation> transformations = new ArrayList<TestAliasTransformation>();

    @Override
    public AliasTransformation logAliasTransformation(
        String sourceFile, SourcePosition<AliasTransformation> position) {
      TestAliasTransformation trans = new TestAliasTransformation();
      transformations.add(trans);
      return trans;
    }
  }

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    transformationHandler = new TestAliasTransformationHandler();
  }

  private Node test(String js) {
    Node root = compiler.parseSyntheticCode("test.js", js);
    Assert.assertEquals(0, compiler.getErrorCount());
    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node parent = new Node(com.google.javascript.rhino.Token.BLOCK, externs, root);

    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.process(externs, root);
    return root;
  }

  private Node testWithTable(String js, PreprocessorSymbolTable table) {
    Node root = compiler.parseSyntheticCode("test.js", js);
    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node parent = new Node(com.google.javascript.rhino.Token.BLOCK, externs, root);

    ScopedAliases pass = new ScopedAliases(compiler, table, transformationHandler);
    pass.process(externs, root);
    return root;
  }

  private void testError(String js, DiagnosticType expectedError) {
    Node root = compiler.parseSyntheticCode("test.js", js);
    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node parent = new Node(com.google.javascript.rhino.Token.BLOCK, externs, root);

    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.process(externs, root);

    Assert.assertTrue("Expected errors, but got none", compiler.getErrorCount() > 0);
    boolean found = false;
    for (JSError error : compiler.getErrors()) {
      if (error.getType().equals(expectedError)) {
        found = true;
        break;
      }
    }
    Assert.assertTrue("Expected diagnostic: " + expectedError.key, found);
  }

  @Test
  public void testBasicAliasExpansion() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  var DIV = dom.TagName.DIV;\n"
        + "  dom.createElement(DIV);\n"
        + "});";
    Node root = test(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    String generated = compiler.toSource(root);
    Assert.assertTrue(generated.contains("goog.dom.createElement(goog.dom.TagName.DIV)"));
  }

  @Test
  public void testChainedAliases() {
    String js = "goog.scope(function() {\n"
        + "  var g = goog;\n"
        + "  var d = g.dom;\n"
        + "  d.createElement('div');\n"
        + "});";
    Node root = test(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    String generated = compiler.toSource(root);
    Assert.assertTrue(generated.contains("goog.dom.createElement(\"div\")"));
  }

  @Test
  public void testAliasCycle_reportsError() {
    String js = "goog.scope(function() {\n"
        + "  var a = b.c;\n"
        + "  var b = a.d;\n"
        + "  a.foo();\n"
        + "});";
    testError(js, ScopedAliases.GOOG_SCOPE_ALIAS_CYCLE);
  }

  @Test
  public void testGoogScopeUsedImproperly_notExprResult() {
    String js = "var x = goog.scope(function() {});";
    testError(js, ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void testGoogScopeHasBadParameters_zeroArgs() {
    String js = "goog.scope();";
    testError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testGoogScopeHasBadParameters_multipleArgs() {
    String js = "goog.scope(function() {}, 123);";
    testError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testGoogScopeHasBadParameters_notFunction() {
    String js = "goog.scope(123);";
    testError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testGoogScopeHasBadParameters_namedFunction() {
    String js = "goog.scope(function named() {});";
    testError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testGoogScopeHasBadParameters_functionWithParameters() {
    String js = "goog.scope(function(a) {});";
    testError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testGoogScopeReferencesThis_reportsError() {
    String js = "goog.scope(function() {\n"
        + "  this.foo = 1;\n"
        + "});";
    testError(js, ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void testGoogScopeUsesReturn_reportsError() {
    String js = "goog.scope(function() {\n"
        + "  return 1;\n"
        + "});";
    testError(js, ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void testGoogScopeUsesThrow_reportsError() {
    String js = "goog.scope(function() {\n"
        + "  throw 'error';\n"
        + "});";
    testError(js, ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  @Test
  public void testGoogScopeAliasRedefined_reportsError() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  dom = goog.otherDom;\n"
        + "});";
    testError(js, ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void testNonAliasLocal_catchBlock_reportsError() {
    String js = "goog.scope(function() {\n"
        + "  try {} catch (e) {}\n"
        + "});";
    testError(js, ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void testNonAliasLocalVariable_hoistedToGlobalScope() {
    String js = "goog.scope(function() {\n"
        + "  var x = 10;\n"
        + "  var y = function() { return x; };\n"
        + "  alert(x);\n"
        + "});";
    Node root = test(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    String generated = compiler.toSource(root);
    Assert.assertTrue(generated.contains("$jscomp.scope.x = 10"));
    Assert.assertTrue(generated.contains("alert($jscomp.scope.x)"));
  }

  @Test
  public void testNonAliasLocalVariableWithoutValue() {
    String js = "goog.scope(function() {\n"
        + "  var unassigned;\n"
        + "  alert(unassigned);\n"
        + "});";
    Node root = test(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    String generated = compiler.toSource(root);
    Assert.assertTrue(generated.contains("alert($jscomp.scope.unassigned)"));
  }

  @Test
  public void testNonAliasLocalVariableNameCollision() {
    String js = "goog.scope(function() {\n"
        + "  var x = 1;\n"
        + "});\n"
        + "goog.scope(function() {\n"
        + "  var x = 2;\n"
        + "});";
    Node root = test(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    String generated = compiler.toSource(root);
    Assert.assertTrue(generated.contains("$jscomp.scope.x = 1"));
    Assert.assertTrue(generated.contains("$jscomp.scope.x$1 = 2"));
  }

  @Test
  public void testNamespaceShadowRenaming() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  function inner() {\n"
        + "    var goog = 1;\n"
        + "    dom.call(goog);\n"
        + "  }\n"
        + "});";
    Node root = test(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    String generated = compiler.toSource(root);
    Assert.assertTrue(generated.contains("goog$jscomp$1"));
  }

  @Test
  public void testJsDocTypeTransformation() {
    String js = "goog.scope(function() {\n"
        + "  var Button = goog.ui.Button;\n"
        + "  /** @type {Button.EventType} */ var type;\n"
        + "  /** @type {Button} */ var instance;\n"
        + "});";
    Node root = test(js);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testMultipleDeclarationsInOneVarStatement() {
    String js = "goog.scope(function() {\n"
        + "  var a = goog.a, b = goog.b;\n"
        + "  a.foo();\n"
        + "  b.bar();\n"
        + "});";
    Node root = test(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    String generated = compiler.toSource(root);
    Assert.assertTrue(generated.contains("goog.a.foo()"));
    Assert.assertTrue(generated.contains("goog.b.bar()"));
  }

  @Test
  public void testPreprocessorSymbolTableIntegration() {
    Node root = compiler.parseSyntheticCode("test.js", "goog.scope(function() { var d = goog.dom; });");
    PreprocessorSymbolTable table = new PreprocessorSymbolTable(root);
    testWithTable("goog.scope(function() { var d = goog.dom; d.foo(); });", table);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testHotSwapScriptDirectly() {
    Node root = compiler.parseSyntheticCode("test.js", "goog.scope(function() { var d = goog.dom; d.bar(); });");
    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node parent = new Node(com.google.javascript.rhino.Token.BLOCK, externs, root);

    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.hotSwapScript(root, null);
    Assert.assertEquals(0, compiler.getErrorCount());
    String generated = compiler.toSource(root);
    Assert.assertTrue(generated.contains("goog.dom.bar()"));
  }

  @Test
  public void testGlobalFunctionsIgnoredByTraversal() {
    String js = "function outside() { var x = 1; }\n"
        + "var f = function() { var y = 2; };\n"
        + "goog.scope(function() { var d = goog.dom; d.init(); });";
    Node root = test(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    String generated = compiler.toSource(root);
    Assert.assertTrue(generated.contains("function outside()"));
    Assert.assertTrue(generated.contains("goog.dom.init()"));
  }

  @Test
  public void testNonScopedScriptNoChange() {
    String js = "var a = 1; var b = 2;";
    Node root = test(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    String generated = compiler.toSource(root);
    Assert.assertTrue(generated.contains("var a = 1"));
  }
}
