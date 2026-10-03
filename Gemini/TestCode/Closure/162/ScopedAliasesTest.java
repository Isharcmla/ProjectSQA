package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScopedAliasesTest {

  private Compiler compiler;
  private AliasTransformationHandler transformationHandler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    transformationHandler = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
  }

  private void test(String js, String expected) {
    Node root = compiler.parseTestCode(js);
    Node externs = new Node(0);
    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.process(externs, root);
    assertEquals(0, compiler.getErrorCount());
    String actual = compiler.toSource(root);
    assertEquals(expected, actual.trim());
  }

  private void testHotSwap(String js, String expected) {
    Node root = compiler.parseTestCode(js);
    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.hotSwapScript(root, null);
    assertEquals(0, compiler.getErrorCount());
    String actual = compiler.toSource(root);
    assertEquals(expected, actual.trim());
  }

  private void testError(String js, DiagnosticType expectedError) {
    Node root = compiler.parseTestCode(js);
    Node externs = new Node(0);
    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.process(externs, root);
    assertEquals(1, compiler.getErrorCount());
    assertEquals(expectedError, compiler.getErrors()[0].getType());
  }

  @Test
  public void testProcess_standardAliasing_success() {
    test(
        "goog.scope(function() {\n"
            + "  var dom = goog.dom;\n"
            + "  var DIV = dom.TagName.DIV;\n"
            + "  dom.createElement(DIV);\n"
            + "});",
        "goog.dom.createElement(goog.dom.TagName.DIV);");
  }

  @Test
  public void testHotSwapScript_transitiveAliases_success() {
    testHotSwap(
        "goog.scope(function() {\n"
            + "  var g = goog;\n"
            + "  var d = g.dom;\n"
            + "  d.createElement('DIV');\n"
            + "});",
        "goog.dom.createElement(\"DIV\");");
  }

  @Test
  public void testProcess_multipleVarsInSingleVarDeclaration_removesOnlyAlias() {
    test(
        "goog.scope(function() {\n"
            + "  var a = goog.a, b = goog.b;\n"
            + "  a();\n"
            + "  b();\n"
            + "});",
        "goog.a();\ngoog.b();");
  }

  @Test
  public void testProcess_emptyScopeBlock_collapsesScope() {
    test("goog.scope(function() {});", "");
  }

  @Test
  public void testProcess_noScopeCalls_noChanges() {
    test("var x = 10;", "var x = 10;");
  }

  @Test
  public void testProcess_globalFunctions_skippedByTraversal() {
    test(
        "function globalFn() { var x = 1; }\n"
            + "goog.scope(function() {\n"
            + "  var d = goog.dom;\n"
            + "  d.create();\n"
            + "});",
        "function globalFn() {\n  var x = 1;\n}\ngoog.dom.create();");
  }

  @Test
  public void testProcess_nestedFunctionsAndInnerScopes_resolvesAliasesCorrectly() {
    test(
        "goog.scope(function() {\n"
            + "  var d = goog.dom;\n"
            + "  function helper() {\n"
            + "    d.create();\n"
            + "    var d = localOverride;\n"
            + "    d.create();\n"
            + "  }\n"
            + "  helper();\n"
            + "});",
        "function helper() {\n  goog.dom.create();\n  var d = localOverride;\n  d.create();\n}\nhelper();");
  }

  @Test
  public void testProcess_withPreprocessorSymbolTable_recordsReference() {
    Node root = compiler.parseTestCode(
        "goog.scope(function() {\n"
            + "  var d = goog.dom;\n"
            + "  d.create();\n"
            + "});");
    Node externs = new Node(0);
    PreprocessorSymbolTable symbolTable = new PreprocessorSymbolTable(root);
    ScopedAliases pass = new ScopedAliases(compiler, symbolTable, transformationHandler);
    pass.process(externs, root);

    assertEquals(0, compiler.getErrorCount());
    assertNotNull(symbolTable.getReferences(root.getFirstChild().getFirstChild().getFirstChild()));
  }

  @Test
  public void testProcess_customAliasTransformationHandler_capturesAliases() {
    final Map<String, String> recordedAliases = new HashMap<String, String>();
    final List<SourcePosition<AliasTransformation>> recordedPositions =
        new ArrayList<SourcePosition<AliasTransformation>>();

    AliasTransformationHandler customHandler = new AliasTransformationHandler() {
      @Override
      public AliasTransformation logAliasTransformation(
          String sourceFile, SourcePosition<AliasTransformation> position) {
        recordedPositions.add(position);
        return new AliasTransformation() {
          @Override
          public void addAlias(String alias, String qualifiedName) {
            recordedAliases.put(alias, qualifiedName);
          }
        };
      }
    };

    Node root = compiler.parseTestCode(
        "goog.scope(function() {\n"
            + "  var dom = goog.dom;\n"
            + "  dom.create();\n"
            + "});");
    Node externs = new Node(0);
    ScopedAliases pass = new ScopedAliases(compiler, null, customHandler);
    pass.process(externs, root);

    assertEquals(0, compiler.getErrorCount());
    assertEquals("goog.dom", recordedAliases.get("dom"));
    assertEquals(1, recordedPositions.size());
  }

  @Test
  public void testProcess_jsdocTypeAnnotation_rewritesTypeNames() {
    test(
        "goog.scope(function() {\n"
            + "  var dom = goog.dom;\n"
            + "  /** @type {dom.Element} */ var el;\n"
            + "  /** @type {dom} */ var d;\n"
            + "  /** @type {Array<dom.Element>} */ var list;\n"
            + "});",
        "var el;\nvar d;\nvar list;");
  }

  @Test
  public void testError_googScopeUsedImproperly_assignment() {
    testError("var x = goog.scope(function() {});", ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void testError_googScopeUsedImproperly_expressionStatement() {
    testError("goog.scope(function() {}) + 1;", ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void testError_googScopeHasBadParameters_noArguments() {
    testError("goog.scope();", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_googScopeHasBadParameters_tooManyArguments() {
    testError("goog.scope(function() {}, 1);", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_googScopeHasBadParameters_notAFunction() {
    testError("goog.scope(123);", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_googScopeHasBadParameters_namedFunction() {
    testError("goog.scope(function named() {});", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_googScopeHasBadParameters_functionWithParameters() {
    testError("goog.scope(function(param) {});", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testError_googScopeReferencesThis() {
    testError(
        "goog.scope(function() {\n"
            + "  this.foo();\n"
            + "});",
        ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void testError_googScopeUsesReturn() {
    testError(
        "goog.scope(function() {\n"
            + "  return;\n"
            + "});",
        ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void testError_googScopeUsesThrow() {
    testError(
        "goog.scope(function() {\n"
            + "  throw new Error();\n"
            + "});",
        ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  @Test
  public void testError_googScopeAliasRedefined() {
    testError(
        "goog.scope(function() {\n"
            + "  var a = goog.a;\n"
            + "  a = goog.b;\n"
            + "});",
        ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void testError_googScopeNonAliasLocal_uninitialized() {
    testError(
        "goog.scope(function() {\n"
            + "  var a;\n"
            + "});",
        ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void testError_googScopeNonAliasLocal_nonQualifiedNameExpression() {
    testError(
        "goog.scope(function() {\n"
            + "  var a = 1 + 2;\n"
            + "});",
        ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void testError_googScopeNonAliasLocal_functionCallValue() {
    testError(
        "goog.scope(function() {\n"
            + "  var a = Math.random();\n"
            + "});",
        ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }
}
