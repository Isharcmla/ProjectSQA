package com.google.javascript.jscomp;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScopedAliasesTest {

  private Compiler compiler;
  private TestAliasTransformationHandler transformationHandler;

  private static class TestAliasTransformationHandler implements AliasTransformationHandler {
    final Map<String, String> aliases = new HashMap<String, String>();
    final List<SourcePosition<AliasTransformation>> positions =
        new ArrayList<SourcePosition<AliasTransformation>>();

    @Override
    public AliasTransformation logAliasTransformation(
        String sourceFileName, SourcePosition<AliasTransformation> pos) {
      positions.add(pos);
      return new AliasTransformation() {
        @Override
        public void addAlias(String alias, String qualifiedName) {
          aliases.put(alias, qualifiedName);
        }
      };
    }
  }

  @Before
  public void setUp() {
    compiler = new Compiler();
    transformationHandler = new TestAliasTransformationHandler();
  }

  private Node testProcess(String js, DiagnosticType... expectedErrors) {
    Node root = compiler.parseTestCode(js);
    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node mainRoot = new Node(com.google.javascript.rhino.Token.BLOCK, externs, root);

    PreprocessorSymbolTable table = new PreprocessorSymbolTable(root);
    ScopedAliases pass = new ScopedAliases(compiler, table, transformationHandler);
    pass.process(externs, root);

    JSError[] errors = compiler.getErrors();
    Assert.assertEquals(
        "Expected " + expectedErrors.length + " errors, but got: " + java.util.Arrays.toString(errors),
        expectedErrors.length,
        errors.length);

    for (int i = 0; i < expectedErrors.length; i++) {
      Assert.assertEquals(expectedErrors[i], errors[i].getType());
    }

    return root;
  }

  @Test
  public void testProcess_basicAlias_inlinesAlias() {
    String js = "goog.scope(function() {"
        + "  var dom = goog.dom;"
        + "  var DIV = dom.TagName.DIV;"
        + "  dom.createElement(DIV);"
        + "});";

    Node root = testProcess(js);
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("goog.dom.createElement(goog.dom.TagName.DIV)"));
    Assert.assertFalse(output.contains("var dom"));
    Assert.assertFalse(output.contains("var DIV"));
    Assert.assertTrue(transformationHandler.aliases.containsKey("dom"));
    Assert.assertEquals("goog.dom", transformationHandler.aliases.get("dom"));
    Assert.assertTrue(transformationHandler.aliases.containsKey("DIV"));
  }

  @Test
  public void testProcess_multipleVarsInSingleStatement_inlinesCorrectly() {
    String js = "goog.scope(function() {"
        + "  var a = foo.a, b = foo.b;"
        + "  a();"
        + "  b();"
        + "});";

    Node root = testProcess(js);
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("foo.a()"));
    Assert.assertTrue(output.contains("foo.b()"));
  }

  @Test
  public void testProcess_transitiveAliases_resolvedInCorrectOrder() {
    String js = "goog.scope(function() {"
        + "  var g = goog;"
        + "  var d = g.dom;"
        + "  d.createElement();"
        + "});";

    Node root = testProcess(js);
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("goog.dom.createElement()"));
  }

  @Test
  public void testProcess_aliasCycle_reportsError() {
    String js = "goog.scope(function() {"
        + "  var a = b.c;"
        + "  var b = a.c;"
        + "  a();"
        + "});";

    testProcess(js, ScopedAliases.GOOG_SCOPE_ALIAS_CYCLE);
  }

  @Test
  public void testProcess_scopeUsedImproperly_notInExprResult_reportsError() {
    String js = "var x = goog.scope(function() {});";
    testProcess(js, ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void testProcess_scopeHasBadParameters_noArgs_reportsError() {
    String js = "goog.scope();";
    testProcess(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testProcess_scopeHasBadParameters_tooManyArgs_reportsError() {
    String js = "goog.scope(function() {}, 123);";
    testProcess(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testProcess_scopeHasBadParameters_nonFunction_reportsError() {
    String js = "goog.scope(123);";
    testProcess(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testProcess_scopeHasBadParameters_namedFunction_reportsError() {
    String js = "goog.scope(function named() {});";
    testProcess(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testProcess_scopeHasBadParameters_functionWithParams_reportsError() {
    String js = "goog.scope(function(param) {});";
    testProcess(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testProcess_scopeReferencesThis_reportsError() {
    String js = "goog.scope(function() {"
        + "  this.foo = 1;"
        + "});";
    testProcess(js, ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void testProcess_scopeUsesReturn_reportsError() {
    String js = "goog.scope(function() {"
        + "  return;"
        + "});";
    testProcess(js, ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void testProcess_scopeUsesThrow_reportsError() {
    String js = "goog.scope(function() {"
        + "  throw 'error';"
        + "});";
    testProcess(js, ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  @Test
  public void testProcess_scopeAliasRedefined_reportsError() {
    String js = "goog.scope(function() {"
        + "  var x = goog.x;"
        + "  x = goog.y;"
        + "});";
    testProcess(js, ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void testProcess_nonAliasLocalFunction_reportsError() {
    String js = "goog.scope(function() {"
        + "  function localFn() {}"
        + "  localFn();"
        + "});";
    testProcess(js, ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void testProcess_nonQualifiedNameAssignment_createsScopedVariable() {
    String js = "goog.scope(function() {"
        + "  var x = 1 + 2;"
        + "  var y = x + 3;"
        + "  use(y);"
        + "});";

    Node root = testProcess(js);
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("$jscomp.scope.x"));
    Assert.assertTrue(output.contains("$jscomp.scope.y"));
  }

  @Test
  public void testProcess_repeatedScopedName_incrementsCounter() {
    String js = "goog.scope(function() {"
        + "  var x = 1 + 2;"
        + "});"
        + "goog.scope(function() {"
        + "  var x = 3 + 4;"
        + "});";

    Node root = testProcess(js);
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("$jscomp.scope.x = 1 + 2"));
    Assert.assertTrue(output.contains("$jscomp.scope.x$1 = 3 + 4"));
  }

  @Test
  public void testProcess_jsdocTypeAnnotation_updatesType() {
    String js = "goog.scope(function() {"
        + "  var MyType = ns.MyType;"
        + "  /** @type {MyType} */"
        + "  var instance;"
        + "  /** @type {MyType.Subtype} */"
        + "  var subInstance;"
        + "});";

    Node root = testProcess(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(root);
  }

  @Test
  public void testProcess_namespaceShadowing_renamesShadowedVariable() {
    String js = "goog.scope(function() {"
        + "  var bar = foo.bar;"
        + "  function inner() {"
        + "    var foo = 10;"
        + "    alert(foo);"
        + "  }"
        + "  bar();"
        + "});";

    Node root = testProcess(js);
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("foo.bar()"));
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_globalFunctionOutsideScope_isIgnored() {
    String js = "function globalFn() { var x = 1; }\n"
        + "goog.scope(function() {"
        + "  var x = goog.x;"
        + "  x();"
        + "});";

    Node root = testProcess(js);
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("function globalFn()"));
    Assert.assertTrue(output.contains("goog.x()"));
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testHotSwapScript_nullPreprocessorSymbolTable_runsSuccessfully() {
    String js = "goog.scope(function() {"
        + "  var Button = goog.ui.Button;"
        + "  var b = new Button();"
        + "});";

    Node root = compiler.parseTestCode(js);
    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.hotSwapScript(root, null);

    Assert.assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("new goog.ui.Button()"));
  }

  @Test
  public void testProcess_noAliasesOrScopeCalls_doesNotThrow() {
    String js = "var x = 10; var y = 20;";
    Node root = compiler.parseTestCode(js);
    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);

    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.process(externs, root);

    Assert.assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource(root);
    Assert.assertTrue(output.contains("var x = 10"));
  }
}
