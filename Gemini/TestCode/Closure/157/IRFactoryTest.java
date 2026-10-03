package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.EvaluatorException;
import com.google.javascript.jscomp.mozilla.rhino.Parser;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class IRFactoryTest {

  private static class TestErrorReporter implements ErrorReporter {
    private final List<String> errors = new ArrayList<String>();
    private final List<String> warnings = new ArrayList<String>();

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

  private Node parseAndTransform(String js, LanguageMode mode, boolean acceptConst, TestErrorReporter reporter) {
    CompilerEnvirons env = new CompilerEnvirons();
    env.setLanguageVersion(com.google.javascript.jscomp.mozilla.rhino.Context.VERSION_1_8);
    env.setRecordingComments(true);
    env.setRecordingLocalJsDocComments(true);
    env.setStrictMode(mode == LanguageMode.ECMASCRIPT5_STRICT);

    Parser parser = new Parser(env, reporter);
    AstRoot root = parser.parse(js, "testcode.js", 1);
    Set<String> emptySet = ImmutableSet.of();
    Config config = new Config(emptySet, emptySet, false, mode, acceptConst);
    return IRFactory.transformTree(root, js, config, reporter);
  }

  private Node parseAndTransform(String js, LanguageMode mode) {
    TestErrorReporter reporter = new TestErrorReporter();
    return parseAndTransform(js, mode, true, reporter);
  }

  private Node parseAndTransform(String js) {
    return parseAndTransform(js, LanguageMode.ECMASCRIPT5);
  }

  @Test
  public void testEmptyScript_emptyString_returnsScriptNode() {
    Node node = parseAndTransform("");
    assertNotNull(node);
    assertEquals(Token.SCRIPT, node.getType());
    assertEquals(0, node.getChildCount());
  }

  @Test
  public void testDirectives_useStrict_setsDirectives() {
    Node node = parseAndTransform("'use strict'; var x = 1;");
    assertNotNull(node);
    assertEquals(Token.SCRIPT, node.getType());
    assertNotNull(node.getDirectives());
    assertTrue(node.getDirectives().contains("use strict"));
    assertEquals(1, node.getChildCount());
  }

  @Test
  public void testFileOverviewAndLicenseJSDoc_validComments_attachesJSDoc() {
    String js = "/**\n * @fileoverview Test overview\n * @license MIT\n */\nvar x = 1;";
    Node node = parseAndTransform(js);
    assertNotNull(node);
    JSDocInfo info = node.getJSDocInfo();
    assertNotNull(info);
    assertNotNull(info.getLicense());
  }

  @Test
  public void testVariableDeclaration_varAndConst_parsesCorrectly() {
    Node node = parseAndTransform("var a = 1, b = 'hello', c;");
    assertEquals(Token.SCRIPT, node.getType());
    Node varNode = node.getFirstChild();
    assertEquals(Token.VAR, varNode.getType());
    assertEquals(3, varNode.getChildCount());
  }

  @Test
  public void testConstKeyword_whenNotAccepted_reportsError() {
    TestErrorReporter reporter = new TestErrorReporter();
    parseAndTransform("const x = 10;", LanguageMode.ECMASCRIPT3, false, reporter);
    assertTrue(reporter.hasErrors());
  }

  @Test
  public void testFunctionDeclarations_namedAndAnonymous_parsesCorrectly() {
    Node node = parseAndTransform("function foo(a, b) { 'use strict'; return a + b; }\nvar f = function(x) {};");
    assertEquals(Token.SCRIPT, node.getType());
    Node fn = node.getFirstChild();
    assertEquals(Token.FUNCTION, fn.getType());
    assertEquals("foo", fn.getFirstChild().getString());

    Node varNode = fn.getNext();
    Node assignOrVar = varNode.getFirstChild();
    Node anonFn = assignOrVar.getFirstChild();
    assertEquals(Token.FUNCTION, anonFn.getType());
    assertEquals("", anonFn.getFirstChild().getString());
  }

  @Test
  public void testIfStatement_withAndWithoutElse_parsesCorrectly() {
    Node node = parseAndTransform("if (true) { x = 1; } else { x = 2; } if (false) y = 3;");
    Node if1 = node.getFirstChild();
    assertEquals(Token.IF, if1.getType());
    assertEquals(3, if1.getChildCount());

    Node if2 = if1.getNext();
    assertEquals(Token.IF, if2.getType());
    assertEquals(2, if2.getChildCount());
  }

  @Test
  public void testLoops_whileDoForForIn_parsesCorrectly() {
    String js = "while (x < 10) { x++; }\n"
        + "do { x--; } while (x > 0);\n"
        + "for (var i = 0; i < 5; i++) { continue; }\n"
        + "for (var k in obj) { break; }";
    Node node = parseAndTransform(js);

    Node cur = node.getFirstChild();
    assertEquals(Token.WHILE, cur.getType());
    cur = cur.getNext();
    assertEquals(Token.DO, cur.getType());
    cur = cur.getNext();
    assertEquals(Token.FOR, cur.getType());
    assertEquals(4, cur.getChildCount());
    cur = cur.getNext();
    assertEquals(Token.FOR, cur.getType());
    assertEquals(3, cur.getChildCount());
  }

  @Test
  public void testSwitchStatement_caseAndDefault_parsesCorrectly() {
    String js = "switch (x) { case 1: x = 2; break; default: x = 0; }";
    Node node = parseAndTransform(js);
    Node switchNode = node.getFirstChild();
    assertEquals(Token.SWITCH, switchNode.getType());
    Node case1 = switchNode.getFirstChild().getNext();
    assertEquals(Token.CASE, case1.getType());
    Node defaultCase = case1.getNext();
    assertEquals(Token.DEFAULT, defaultCase.getType());
  }

  @Test
  public void testTryCatchFinally_allVariations_parsesCorrectly() {
    String js = "try { throw new Error('err'); } catch (e) { log(e); } finally { cleanup(); }\n"
        + "try { throw 1; } finally { cleanup(); }";
    Node node = parseAndTransform(js);

    Node try1 = node.getFirstChild();
    assertEquals(Token.TRY, try1.getType());
    assertEquals(3, try1.getChildCount());

    Node try2 = try1.getNext();
    assertEquals(Token.TRY, try2.getType());
    assertEquals(3, try2.getChildCount());
  }

  @Test
  public void testLabels_singleAndMultipleChained_parsesCorrectly() {
    String js = "outer: inner: for (;;) { break outer; continue inner; }";
    Node node = parseAndTransform(js);
    Node labelNode = node.getFirstChild();
    assertEquals(Token.LABEL, labelNode.getType());
    assertEquals(Token.LABEL_NAME, labelNode.getFirstChild().getType());
  }

  @Test
  public void testUnaryExpressions_numberFoldingAndIncDec_parsesCorrectly() {
    String js = "var a = -5; var b = -x; var c = +x; var d = !x; var e = ~x; var f = typeof x; var g = void 0;";
    Node node = parseAndTransform(js);
    Node varNode = node.getFirstChild();
    Node firstVar = varNode.getFirstChild();
    assertEquals(Token.NUMBER, firstVar.getFirstChild().getType());
    assertEquals(-5.0, firstVar.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testUnaryExpressions_incrementDecrement_validAndInvalid() {
    Node node = parseAndTransform("x++; ++x; x--; --x;");
    assertNotNull(node);

    TestErrorReporter reporter = new TestErrorReporter();
    parseAndTransform("5++;", LanguageMode.ECMASCRIPT5, true, reporter);
    assertTrue(reporter.hasErrors());

    TestErrorReporter decReporter = new TestErrorReporter();
    parseAndTransform("5--;", LanguageMode.ECMASCRIPT5, true, decReporter);
    assertTrue(decReporter.hasErrors());
  }

  @Test
  public void testAssignment_invalidTarget_reportsError() {
    TestErrorReporter reporter = new TestErrorReporter();
    parseAndTransform("1 = 2;", LanguageMode.ECMASCRIPT5, true, reporter);
    assertTrue(reporter.hasErrors());
  }

  @Test
  public void testBinaryAndTernaryExpressions_parsesCorrectly() {
    String js = "var res = (a + b * c / d % e - f == g != h === i !== j < k <= l > m >= n && o || p) ? q : r;";
    Node node = parseAndTransform(js);
    Node hookNode = node.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.HOOK, hookNode.getType());
  }

  @Test
  public void testParenthesizedExpression_setsParenProp() {
    Node node = parseAndTransform("var a = (x + y);");
    Node addNode = node.getFirstChild().getFirstChild().getFirstChild();
    assertTrue(addNode.getBooleanProp(Node.PARENTHESIZED_PROP));
  }

  @Test
  public void testObjectLiteral_keysAndGettersSetters_parsesCorrectly() {
    String js = "var o = { a: 1, 'b': 2, 3: 4, get x() { return 5; }, set x(v) { this.val = v; } };";
    Node node = parseAndTransform(js, LanguageMode.ECMASCRIPT5);
    Node objLit = node.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.OBJECTLIT, objLit.getType());

    Node keyA = objLit.getFirstChild();
    assertEquals(Token.STRING, keyA.getType());
    assertFalse(keyA.getBooleanProp(Node.QUOTED_PROP));

    Node keyB = keyA.getNext();
    assertEquals(Token.STRING, keyB.getType());
    assertTrue(keyB.getBooleanProp(Node.QUOTED_PROP));

    Node key3 = keyB.getNext();
    assertEquals(Token.NUMBER, key3.getType());

    Node getX = key3.getNext();
    assertEquals(Token.GET, getX.getType());

    Node setX = getX.getNext();
    assertEquals(Token.SET, setX.getType());
  }

  @Test
  public void testObjectLiteral_getterSetterErrors_reported() {
    TestErrorReporter reporterES3 = new TestErrorReporter();
    parseAndTransform("var o = { get x() { return 1; }, set x(v) {} };", LanguageMode.ECMASCRIPT3, true, reporterES3);
    assertTrue(reporterES3.hasErrors());

    TestErrorReporter reporterGetterParam = new TestErrorReporter();
    parseAndTransform("var o = { get x(param) { return 1; } };", LanguageMode.ECMASCRIPT5, true, reporterGetterParam);
    assertTrue(reporterGetterParam.hasErrors());

    TestErrorReporter reporterSetterParam = new TestErrorReporter();
    parseAndTransform("var o = { set x() {} };", LanguageMode.ECMASCRIPT5, true, reporterSetterParam);
    assertTrue(reporterSetterParam.hasErrors());
  }

  @Test
  public void testReservedKeywords_inES5AndES5Strict() {
    TestErrorReporter reporterES5 = new TestErrorReporter();
    parseAndTransform("var class = 1;", LanguageMode.ECMASCRIPT5, true, reporterES5);
    assertTrue(reporterES5.hasErrors());

    TestErrorReporter reporterStrict = new TestErrorReporter();
    parseAndTransform("var yield = 1;", LanguageMode.ECMASCRIPT5_STRICT, true, reporterStrict);
    assertTrue(reporterStrict.hasErrors());

    TestErrorReporter reporterES3 = new TestErrorReporter();
    parseAndTransform("var o = { class: 1 };", LanguageMode.ECMASCRIPT3, true, reporterES3);
    assertNotNull(reporterES3);
  }

  @Test
  public void testArrayLiteralAndEmptyExpression_parsesCorrectly() {
    Node node = parseAndTransform("var arr = [1, , 2]; ;");
    Node varNode = node.getFirstChild();
    Node arrLit = varNode.getFirstChild().getFirstChild();
    assertEquals(Token.ARRAYLIT, arrLit.getType());
    assertEquals(Token.NUMBER, arrLit.getFirstChild().getType());
    assertEquals(Token.EMPTY, arrLit.getFirstChild().getNext().getType());
    assertEquals(Token.EMPTY, varNode.getNext().getType());
  }

  @Test
  public void testPropertyGetAndElementGet_parsesCorrectly() {
    Node node = parseAndTransform("a.b = c[d];");
    Node exprResult = node.getFirstChild();
    Node assign = exprResult.getFirstChild();
    assertEquals(Token.ASSIGN, assign.getType());
    assertEquals(Token.GETPROP, assign.getFirstChild().getType());
    assertEquals(Token.GETELEM, assign.getLastChild().getType());
  }

  @Test
  public void testRegExpLiteral_withAndWithoutFlags_parsesCorrectly() {
    Node node = parseAndTransform("var r1 = /abc/g; var r2 = /xyz/;");
    Node varNode = node.getFirstChild();
    Node r1 = varNode.getFirstChild().getFirstChild();
    assertEquals(Token.REGEXP, r1.getType());
    assertEquals(2, r1.getChildCount());

    Node r2 = varNode.getNext().getFirstChild().getFirstChild();
    assertEquals(Token.REGEXP, r2.getType());
    assertEquals(1, r2.getChildCount());
  }

  @Test
  public void testNewExpressionAndCall_parsesCorrectly() {
    Node node = parseAndTransform("new Foo(1, 2); bar(3);");
    Node newExpr = node.getFirstChild().getFirstChild();
    assertEquals(Token.NEW, newExpr.getType());
    assertEquals(3, newExpr.getChildCount());

    Node callExpr = node.getLastChild().getFirstChild();
    assertEquals(Token.CALL, callExpr.getType());
    assertEquals(2, callExpr.getChildCount());
  }

  @Test
  public void testWithStatement_parsesCorrectly() {
    Node node = parseAndTransform("with (obj) { a = 1; }");
    Node withNode = node.getFirstChild();
    assertEquals(Token.WITH, withNode.getType());
    assertEquals(Token.NAME, withNode.getFirstChild().getType());
    assertEquals(Token.BLOCK, withNode.getLastChild().getType());
  }

  @Test
  public void testReturnStatement_withAndWithoutValue_parsesCorrectly() {
    Node node = parseAndTransform("function f() { return 1; return; }");
    Node fn = node.getFirstChild();
    Node body = fn.getLastChild();
    Node ret1 = body.getFirstChild();
    assertEquals(Token.RETURN, ret1.getType());
    assertEquals(1, ret1.getChildCount());

    Node ret2 = ret1.getNext();
    assertEquals(Token.RETURN, ret2.getType());
    assertEquals(0, ret2.getChildCount());
  }

  @Test
  public void testKeywords_debuggerNullTrueFalseThis_parsesCorrectly() {
    Node node = parseAndTransform("debugger; null; true; false; this;");
    Node cur = node.getFirstChild();
    assertEquals(Token.DEBUGGER, cur.getType());
    cur = cur.getNext();
    assertEquals(Token.EXPR_RESULT, cur.getType());
    assertEquals(Token.NULL, cur.getFirstChild().getType());
    cur = cur.getNext();
    assertEquals(Token.TRUE, cur.getFirstChild().getType());
    cur = cur.getNext();
    assertEquals(Token.FALSE, cur.getFirstChild().getType());
    cur = cur.getNext();
    assertEquals(Token.THIS, cur.getFirstChild().getType());
  }

  @Test
  public void testDestructuring_reportsForbidden() {
    TestErrorReporter reporter = new TestErrorReporter();
    AstRoot root = new AstRoot();
    ArrayLiteral arr = new ArrayLiteral();
    arr.setIsDestructuring(true);
    root.addChild(arr);

    ObjectLiteral obj = new ObjectLiteral();
    obj.setIsDestructuring(true);
    root.addChild(obj);

    Config config = new Config(ImmutableSet.<String>of(), ImmutableSet.<String>of(), false, LanguageMode.ECMASCRIPT5, true);
    IRFactory.transformTree(root, "", config, reporter);
    assertTrue(reporter.hasErrors());
  }

  @Test
  public void testCatchWithCondition_reportsError() {
    TestErrorReporter reporter = new TestErrorReporter();
    AstRoot root = new AstRoot();
    CatchClause catchClause = new CatchClause();
    Name varName = new Name();
    varName.setIdentifier("e");
    catchClause.setVarName(varName);
    catchClause.setCatchCondition(new NumberLiteral(1));
    com.google.javascript.jscomp.mozilla.rhino.ast.Block body = new com.google.javascript.jscomp.mozilla.rhino.ast.Block();
    catchClause.setBody(body);

    com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement tryStmt = new com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement();
    tryStmt.setTryBlock(body);
    tryStmt.addCatchClause(catchClause);
    root.addChild(tryStmt);

    Config config = new Config(ImmutableSet.<String>of(), ImmutableSet.<String>of(), false, LanguageMode.ECMASCRIPT5, true);
    IRFactory.transformTree(root, "", config, reporter);
    assertTrue(reporter.hasErrors());
  }

  @Test
  public void testUnnamedFunctionStatement_reportsError() {
    TestErrorReporter reporter = new TestErrorReporter();
    AstRoot root = new AstRoot();
    FunctionNode fnNode = new FunctionNode();
    fnNode.setFunctionType(FunctionNode.FUNCTION_STATEMENT);
    fnNode.setBody(new com.google.javascript.jscomp.mozilla.rhino.ast.Block());
    root.addChild(fnNode);

    Config config = new Config(ImmutableSet.<String>of(), ImmutableSet.<String>of(), false, LanguageMode.ECMASCRIPT5, true);
    IRFactory.transformTree(root, "", config, reporter);
    assertTrue(reporter.hasErrors());
  }

  @Test
  public void testIllegalToken_reportsError() {
    TestErrorReporter reporter = new TestErrorReporter();
    AstRoot root = new AstRoot();
    AstNode illegalNode = new AstNode(com.google.javascript.jscomp.mozilla.rhino.Token.RESERVED) {
      @Override
      public String toSource(int depth) {
        return "";
      }
    };
    root.addChild(illegalNode);

    Config config = new Config(ImmutableSet.<String>of(), ImmutableSet.<String>of(), false, LanguageMode.ECMASCRIPT5, true);
    IRFactory.transformTree(root, "", config, reporter);
    assertTrue(reporter.hasErrors());
  }
}
