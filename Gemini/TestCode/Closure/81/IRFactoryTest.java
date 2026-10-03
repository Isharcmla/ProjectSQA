package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons;
import com.google.javascript.jscomp.mozilla.rhino.Context;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.EvaluatorException;
import com.google.javascript.jscomp.mozilla.rhino.Parser;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Block;
import com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IRFactoryTest {

  private TestErrorReporter errorReporter;
  private Config defaultConfig;
  private Config es3Config;
  private Config noConstConfig;

  private static class TestErrorReporter implements ErrorReporter {
    final List<String> errors = new ArrayList<String>();
    final List<String> warnings = new ArrayList<String>();

    @Override
    public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {
      warnings.add(message);
    }

    @Override
    public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {
      errors.add(message);
    }

    @Override
    public EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
      errors.add(message);
      return new EvaluatorException(message, sourceName, line, lineSource, lineOffset);
    }

    public boolean hasErrors() {
      return !errors.isEmpty();
    }
  }

  @Before
  public void setUp() {
    errorReporter = new TestErrorReporter();
    defaultConfig = ParserRunner.createConfig(true, Config.LanguageMode.ECMASCRIPT5, true);
    es3Config = ParserRunner.createConfig(true, Config.LanguageMode.ECMASCRIPT3, true);
    noConstConfig = ParserRunner.createConfig(true, Config.LanguageMode.ECMASCRIPT5, false);
  }

  private AstRoot parseRhino(String js) {
    CompilerEnvirons env = new CompilerEnvirons();
    env.setRecordingComments(true);
    env.setRecordingLocalJsDocComments(true);
    env.setLanguageVersion(Context.VERSION_1_8);
    env.setStrictMode(false);
    env.setRecoverFromErrors(true);
    Parser parser = new Parser(env, errorReporter);
    return parser.parse(js, "test.js", 1);
  }

  private Node testTransform(String js) {
    return testTransform(js, defaultConfig);
  }

  private Node testTransform(String js, Config config) {
    AstRoot astRoot = parseRhino(js);
    Node root = IRFactory.transformTree(astRoot, js, config, errorReporter);
    Assert.assertNotNull(root);
    Assert.assertEquals(Token.SCRIPT, root.getType());
    return root;
  }

  @Test
  public void testTransformTree_emptySource_returnsScriptNode() {
    Node node = testTransform("");
    Assert.assertEquals(Token.SCRIPT, node.getType());
    Assert.assertFalse(node.hasChildren());
  }

  @Test
  public void testTransformTree_commentsAndFileOverview_attachesJsDoc() {
    String js = "/**\n * @fileoverview This is a file description.\n * @license MIT License\n */\nvar x = 1;";
    Node node = testTransform(js);
    Assert.assertNotNull(node.getJSDocInfo());
  }

  @Test
  public void testTransformTree_nodeLevelJsDoc_parsedCorrectly() {
    String js = "/** @type {number} */ var a = 10;";
    Node root = testTransform(js);
    Node varNode = root.getFirstChild();
    Assert.assertEquals(Token.VAR, varNode.getType());
    Assert.assertNotNull(varNode.getJSDocInfo());
  }

  @Test
  public void testTransformTree_directives_parsedInScriptAndFunction() {
    String js = "'use strict'; function f() { 'use strict'; return 1; }";
    Node root = testTransform(js);
    Assert.assertNotNull(root.getDirectives());
    Assert.assertTrue(root.getDirectives().contains("use strict"));

    Node fnNode = root.getLastChild();
    Assert.assertEquals(Token.FUNCTION, fnNode.getType());
    Node blockNode = fnNode.getLastChild();
    Assert.assertNotNull(blockNode.getDirectives());
    Assert.assertTrue(blockNode.getDirectives().contains("use strict"));
  }

  @Test
  public void testTransformTree_namedFunctionDeclaration_setsLineNumbers() {
    String js = "\n\nfunction add(a, b) {\n  return a + b;\n}";
    Node root = testTransform(js);
    Node fn = root.getFirstChild();
    Assert.assertEquals(Token.FUNCTION, fn.getType());
    Assert.assertEquals("add", fn.getFirstChild().getString());
    Assert.assertTrue(fn.getLineno() >= 3);
  }

  @Test
  public void testTransformTree_anonymousFunction_handlesEmptyName() {
    String js = "(function() { return 42; });";
    Node root = testTransform(js);
    Node expr = root.getFirstChild();
    Node fn = expr.getFirstChild();
    Assert.assertEquals(Token.FUNCTION, fn.getType());
    Assert.assertEquals("", fn.getFirstChild().getString());
  }

  @Test
  public void testTransformTree_varDeclarationsAndInitializers_createsVarNodes() {
    String js = "var a = 1, b, c = 'hello';";
    Node root = testTransform(js);
    Node varNode = root.getFirstChild();
    Assert.assertEquals(Token.VAR, varNode.getType());
    Assert.assertEquals(3, varNode.getChildCount());
  }

  @Test
  public void testTransformTree_constDeclaration_disallowedWhenNotConfigured() {
    String js = "const x = 5;";
    testTransform(js, noConstConfig);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_arrayLiterals_withSkipsAndHoles() {
    String js = "var arr = [1, , 2, , ];";
    Node root = testTransform(js);
    Node varNode = root.getFirstChild();
    Node arrLit = varNode.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.ARRAYLIT, arrLit.getType());
    int[] skips = (int[]) arrLit.getProp(Node.SKIP_INDEXES_PROP);
    Assert.assertNotNull(skips);
    Assert.assertTrue(skips.length > 0);
  }

  @Test
  public void testTransformTree_objectLiteral_propertiesAndMethods() {
    String js = "var obj = { a: 1, 'b': 2, 3: 4 };";
    Node root = testTransform(js);
    Node objLit = root.getFirstChild().getFirstChild().getFirstChild();
    Assert.assertEquals(Token.OBJECTLIT, objLit.getType());
    Assert.assertEquals(3, objLit.getChildCount());
    Assert.assertEquals(Token.STRING, objLit.getFirstChild().getType());
  }

  @Test
  public void testTransformTree_objectLiteral_es5GetterSetter_valid() {
    String js = "var obj = { get x() { return 1; }, set x(val) { this._x = val; } };";
    Node root = testTransform(js);
    Node objLit = root.getFirstChild().getFirstChild().getFirstChild();
    Assert.assertEquals(Token.OBJECTLIT, objLit.getType());
    Assert.assertEquals(2, objLit.getChildCount());
    Assert.assertEquals(Token.GET, objLit.getFirstChild().getType());
    Assert.assertEquals(Token.SET, objLit.getLastChild().getType());
  }

  @Test
  public void testTransformTree_objectLiteral_es5GetterSetter_rejectedInEs3() {
    String js = "var obj = { get x() { return 1; } };";
    testTransform(js, es3Config);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_objectLiteral_getterWithParams_reportsError() {
    String js = "var obj = { get x(a) { return a; } };";
    testTransform(js);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_objectLiteral_setterWithInvalidParams_reportsError() {
    String js = "var obj = { set x() {} };";
    testTransform(js);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_controlFlow_ifElseAndBlocks() {
    String js = "if (true) { a = 1; } else if (false) a = 2; else { a = 3; }";
    Node root = testTransform(js);
    Node ifNode = root.getFirstChild();
    Assert.assertEquals(Token.IF, ifNode.getType());
  }

  @Test
  public void testTransformTree_controlFlow_loopsAndLabels() {
    String js = "outer: while (true) { do { for (var i = 0; i < 10; i++) { break outer; } } while (false); }";
    Node root = testTransform(js);
    Node labelNode = root.getFirstChild();
    Assert.assertEquals(Token.LABEL, labelNode.getType());
  }

  @Test
  public void testTransformTree_controlFlow_forInLoop() {
    String js = "for (var key in obj) { continue; }";
    Node root = testTransform(js);
    Assert.assertEquals(Token.FOR, root.getFirstChild().getType());
  }

  @Test
  public void testTransformTree_controlFlow_forLoopEmptyParts() {
    String js = "for (;;) { break; }";
    Node root = testTransform(js);
    Assert.assertEquals(Token.FOR, root.getFirstChild().getType());
  }

  @Test
  public void testTransformTree_controlFlow_switchCaseAndDefault() {
    String js = "switch (x) { case 1: a(); break; case 2: break; default: b(); }";
    Node root = testTransform(js);
    Node switchNode = root.getFirstChild();
    Assert.assertEquals(Token.SWITCH, switchNode.getType());
    Assert.assertEquals(4, switchNode.getChildCount());
  }

  @Test
  public void testTransformTree_tryCatchFinally() {
    String js = "try { a(); } catch (e) { b(e); } finally { c(); }";
    Node root = testTransform(js);
    Node tryNode = root.getFirstChild();
    Assert.assertEquals(Token.TRY, tryNode.getType());
    Assert.assertEquals(3, tryNode.getChildCount());
  }

  @Test
  public void testTransformTree_tryFinallyOnly() {
    String js = "try { a(); } finally { c(); }";
    Node root = testTransform(js);
    Node tryNode = root.getFirstChild();
    Assert.assertEquals(Token.TRY, tryNode.getType());
  }

  @Test
  public void testTransformTree_catchClauseWithCondition_reportsError() {
    CatchClause catchClause = new CatchClause();
    catchClause.setVarName(new Name(0, "e"));
    catchClause.setBody(new Block());
    catchClause.setCatchCondition(new Name(0, "cond"));

    AstRoot astRoot = new AstRoot();
    com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement tryNode =
        new com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement();
    tryNode.setTryBlock(new Block());
    tryNode.addCatchClause(catchClause);
    astRoot.addChild(tryNode);

    IRFactory.transformTree(astRoot, "", defaultConfig, errorReporter);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_expressions_infixAndUnary() {
    String js = "var res = +(1 + 2 * 3 / 4 % 5 - (6 & 7 | 8 ^ 9 << 1 >> 2 >>> 3) == 0 != false === null !== true < 1 <= 2 > 3 >= 4 && !false || ~0);";
    Node root = testTransform(js);
    Assert.assertEquals(Token.VAR, root.getFirstChild().getType());
  }

  @Test
  public void testTransformTree_unaryNegativeNumber_foldsSign() {
    String js = "var x = -5;";
    Node root = testTransform(js);
    Node numNode = root.getFirstChild().getFirstChild().getFirstChild();
    Assert.assertEquals(Token.NUMBER, numNode.getType());
    Assert.assertEquals(-5.0, numNode.getDouble(), 0.001);
  }

  @Test
  public void testTransformTree_expressions_incDecValidTargets() {
    String js = "a++; ++a; a.b--; --a[0];";
    Node root = testTransform(js);
    Assert.assertEquals(4, root.getChildCount());
  }

  @Test
  public void testTransformTree_expressions_invalidIncTarget_reportsError() {
    String js = "5++;";
    testTransform(js);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_expressions_invalidAssignmentTarget_reportsError() {
    String js = "5 = 10;";
    testTransform(js);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_expressions_callsAndNews() {
    String js = "new Foo(1, 2); bar(3, 4);";
    Node root = testTransform(js);
    Node newExpr = root.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.NEW, newExpr.getType());
    Node callExpr = root.getLastChild().getFirstChild();
    Assert.assertEquals(Token.CALL, callExpr.getType());
  }

  @Test
  public void testTransformTree_expressions_propertyAndElementGet() {
    String js = "var val = obj.prop + arr[0];";
    Node root = testTransform(js);
    Assert.assertEquals(Token.VAR, root.getFirstChild().getType());
  }

  @Test
  public void testTransformTree_expressions_hookConditional() {
    String js = "var x = a ? b : c;";
    Node root = testTransform(js);
    Node hookNode = root.getFirstChild().getFirstChild().getFirstChild();
    Assert.assertEquals(Token.HOOK, hookNode.getType());
  }

  @Test
  public void testTransformTree_expressions_parenthesizedSetsProperty() {
    String js = "var x = (a + b);";
    Node root = testTransform(js);
    Node addNode = root.getFirstChild().getFirstChild().getFirstChild();
    Assert.assertTrue(addNode.getBooleanProp(Node.PARENTHESIZED_PROP));
  }

  @Test
  public void testTransformTree_regexpLiteral_withAndWithoutFlags() {
    String js = "var r1 = /abc/gim; var r2 = /xyz/;";
    Node root = testTransform(js);
    Assert.assertEquals(2, root.getChildCount());
    Node r1 = root.getFirstChild().getFirstChild().getFirstChild();
    Assert.assertEquals(Token.REGEXP, r1.getType());
    Assert.assertEquals(2, r1.getChildCount());
    Node r2 = root.getLastChild().getFirstChild().getFirstChild();
    Assert.assertEquals(Token.REGEXP, r2.getType());
    Assert.assertEquals(1, r2.getChildCount());
  }

  @Test
  public void testTransformTree_throwAndWithStatements() {
    String js = "with (scope) { throw new Error('fail'); }";
    Node root = testTransform(js);
    Node withNode = root.getFirstChild();
    Assert.assertEquals(Token.WITH, withNode.getType());
  }

  @Test
  public void testTransformTree_emptyStatementInBlock() {
    String js = "if (true) ;";
    Node root = testTransform(js);
    Node ifNode = root.getFirstChild();
    Node thenBlock = ifNode.getLastChild();
    Assert.assertEquals(Token.BLOCK, thenBlock.getType());
    Assert.assertTrue(thenBlock.wasEmptyNode());
  }

  @Test
  public void testTransformTree_multipleLabels() {
    String js = "l1: l2: while (true) { break l1; }";
    Node root = testTransform(js);
    Node label1 = root.getFirstChild();
    Assert.assertEquals(Token.LABEL, label1.getType());
    Node label2 = label1.getLastChild();
    Assert.assertEquals(Token.LABEL, label2.getType());
  }
}
