package com.google.javascript.jscomp;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ScopedAliasesTest {

  private static class TestTransformationHandler implements AliasTransformationHandler {
    final List<String> loggedFiles = new ArrayList<String>();
    final List<String> aliases = new ArrayList<String>();

    @Override
    public AliasTransformation logAliasTransformation(
        String sourceFile, SourcePosition<AliasTransformation> position) {
      loggedFiles.add(sourceFile);
      return new AliasTransformation() {
        @Override
        public void addAlias(String alias, String qualifiedName) {
          aliases.add(alias + " -> " + qualifiedName);
        }
      };
    }
  }

  private Compiler compile(String js, PreprocessorSymbolTable preprocessorTable,
                          AliasTransformationHandler handler) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    ScopedAliases pass = new ScopedAliases(compiler, preprocessorTable, handler);
    Node externs = new Node(Token.BLOCK);
    pass.process(externs, root);
    return compiler;
  }

  private void testTransformation(String js, String expectedJs) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    ScopedAliases pass = new ScopedAliases(
        compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
    Node expectedRoot = compiler.parseTestCode(expectedJs);
    Assert.assertEquals(
        compiler.toSource(expectedRoot),
        compiler.toSource(root));
  }

  private void testError(String js, DiagnosticType expectedError) {
    Compiler compiler = compile(
        js, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Assert.assertTrue("Expected errors, but none were reported",
        compiler.getErrorCount() > 0);
    boolean found = false;
    for (JSError error : compiler.getErrors()) {
      if (error.getType() == expectedError) {
        found = true;
        break;
      }
    }
    Assert.assertTrue(
        "Expected error " + expectedError.key + " not found among: "
            + java.util.Arrays.toString(compiler.getErrors()),
        found);
  }

  @Test
  public void testProcess_simpleAlias_replacesAliasAndRemovesDefinition() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  dom.createElement('div');\n"
        + "});";
    String expected = "goog.dom.createElement('div');";
    testTransformation(js, expected);
  }

  @Test
  public void testHotSwapScript_transitiveAlias_replacesCorrectly() {
    String js = "goog.scope(function() {\n"
        + "  var g = goog;\n"
        + "  var d = g.dom;\n"
        + "  d.createElement('div');\n"
        + "});";
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    ScopedAliases pass = new ScopedAliases(
        compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    pass.hotSwapScript(root, null);
    Assert.assertEquals(0, compiler.getErrorCount());
    Node expectedRoot = compiler.parseTestCode("goog.dom.createElement('div');");
    Assert.assertEquals(
        compiler.toSource(expectedRoot),
        compiler.toSource(root));
  }

  @Test
  public void testProcess_multipleAliasesInOneVarStatement_detachesProperly() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom, events = goog.events;\n"
        + "  dom.createElement('div');\n"
        + "  events.listen();\n"
        + "});";
    String expected = "goog.dom.createElement('div'); goog.events.listen();";
    testTransformation(js, expected);
  }

  @Test
  public void testProcess_withPreprocessorSymbolTable_recordsReference() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  dom.createElement('div');\n"
        + "});";
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    PreprocessorSymbolTable table = new PreprocessorSymbolTable(root);
    ScopedAliases pass = new ScopedAliases(
        compiler, table, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_withCustomTransformationHandler_logsTransformations() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  dom.createElement('div');\n"
        + "});";
    TestTransformationHandler handler = new TestTransformationHandler();
    compile(js, null, handler);
    Assert.assertEquals(1, handler.loggedFiles.size());
    Assert.assertEquals(1, handler.aliases.size());
    Assert.assertEquals("dom -> goog.dom", handler.aliases.get(0));
  }

  @Test
  public void testProcess_jsdocTypeReferences_fixedProperly() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  /** @type {dom.Element} */ var el;\n"
        + "  /** @type {dom} */ var d;\n"
        + "  /** @type {Array.<dom.Element>} */ var list;\n"
        + "});";
    Compiler compiler = compile(
        js, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_globalFunctionsOutsideGoogScope_traversedCorrectly() {
    String js = "function globalFunction() { var a = 1; }\n"
        + "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  dom.createElement('div');\n"
        + "});";
    String expected = "function globalFunction() { var a = 1; }\n"
        + "goog.dom.createElement('div');";
    testTransformation(js, expected);
  }

  @Test
  public void testProcess_nestedScopeInsideGoogScope_aliasesResolvedInNestedScope() {
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
    testTransformation(js, expected);
  }

  @Test
  public void testProcess_noScopeCalls_noCodeChangesReported() {
    String js = "var x = 10; var y = 20;";
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    ScopedAliases pass = new ScopedAliases(
        compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getChangeStamp());
  }

  @Test
  public void testError_scopeUsedImproperly_notAnExpressionStatement() {
    testError("var x = goog.scope(function() {});",
        ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
    testError("if (goog.scope(function() {})) {}",
        ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void testError_scopeHasBadParameters_zeroParameters() {
    testError("goog.scope();",
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_scopeHasBadParameters_tooManyParameters() {
    testError("goog.scope(function() {}, 123);",
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_scopeHasBadParameters_notAFunction() {
    testError("goog.scope(123);",
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
    testError("goog.scope('not a fn');",
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_scopeHasBadParameters_namedFunction() {
    testError("goog.scope(function named() {});",
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_scopeHasBadParameters_functionWithParameters() {
    testError("goog.scope(function(param) {});",
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_referencesThis_atTopLevelOfScope() {
    testError("goog.scope(function() { this.foo = 1; });",
        ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void testError_usesReturn_atTopLevelOfScope() {
    testError("goog.scope(function() { return; });",
        ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void testError_usesThrow_atTopLevelOfScope() {
    testError("goog.scope(function() { throw 'error'; });",
        ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  @Test
  public void testError_nonAliasLocal_unassignedVar() {
    testError("goog.scope(function() { var a; });",
        ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void testError_nonAliasLocal_assignedLiteral() {
    testError("goog.scope(function() { var a = 123; });",
        ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
    testError("goog.scope(function() { var a = 'str'; });",
        ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
    testError("goog.scope(function() { var a = 1 + 2; });",
        ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void testError_aliasRedefined_reassignedLater() {
    testError("goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  dom = goog.otherDom;\n"
        + "});", ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void testMultipleSequentialScopes_handledIndependently() {
    String js = "goog.scope(function() {\n"
        + "  var dom = goog.dom;\n"
        + "  dom.createElement('div');\n"
        + "});\n"
        + "goog.scope(function() {\n"
        + "  var events = goog.events;\n"
        + "  events.listen();\n"
        + "});";
    String expected = "goog.dom.createElement('div');\n"
        + "goog.events.listen();";
    testTransformation(js, expected);
  }
}
