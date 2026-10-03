package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons;
import com.google.javascript.jscomp.mozilla.rhino.Context;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.EvaluatorException;
import com.google.javascript.jscomp.mozilla.rhino.Parser;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Block;
import com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty;
import com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class IRFactoryTest {

  private TestErrorReporter errorReporter;
  private Config defaultConfig;
  private Config es5Config;
  private Config es3Config;

  private static class TestErrorReporter implements ErrorReporter {
    final List<String> errors = new ArrayList<String>();
    final List<String> warnings = new ArrayList<String>();

    @Override
    public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {
      errors.add(message);
    }

    @Override
    public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {
      warnings.add(message);
    }

    @Override
    public EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
      errors.add(message);
      return new EvaluatorException(message, sourceName, line, lineSource, lineOffset);
    }
  }

  @Before
  public void setUp() {
    errorReporter = new TestErrorReporter();
    Set<String> annotations = Sets.newHashSet("type", "param", "return", "fileoverview", "license");
    Set<String> suppressions = Collections.emptySet();
    defaultConfig = new Config(annotations, suppressions, true, Config.LanguageMode.ECMASCRIPT5, true);
    es5Config = new Config(annotations, suppressions, true, Config.LanguageMode.ECMASCRIPT5, true);
    es3Config = new Config(annotations, suppressions, true, Config.LanguageMode.ECMASCRIPT3, false);
  }

  private Node transform(String js, Config config) {
    CompilerEnvirons env = new CompilerEnvirons();
    env.setRecordingComments(true);
    env.setRecordingLocalJsDocComments(true);
    env.setLanguageVersion(Context.VERSION_1_8);
    env.setReservedKeywordAsIdentifier(true);

    Parser parser = new Parser(env, errorReporter);
    AstRoot root = parser.parse(js, "test.js", 1);
    return IRFactory.transformTree(root, js, config, errorReporter);
  }

  private Node transform(String js) {
    return transform(js, defaultConfig);
  }

  @Test
  public void testTransformTree_emptyScript_returnsScriptNode() {
    Node script = transform("");
    assertNotNull(script);
    assertEquals(Token.SCRIPT, script.getType());
    assertEquals(0, script.getChildCount());
  }

  @Test
  public void testTransformTree_withDirectives_parsesDirectives() {
    String code = "'use strict'; var x = 1;";
    Node script = transform(code);
    assertEquals(Token.SCRIPT, script.getType());
    Set<String> directives = script.getDirectives();
    assertNotNull(directives);
    assertTrue(directives.contains("use strict"));
    assertEquals(Token.VAR, script.getFirstChild().getType());
  }

  @Test
  public void testTransformTree_fileOverviewAndLicenseComments_setsJsDocInfo() {
    String code = "/**\n * @fileoverview A test file\n * @license MIT\n */\nvar a = 10;";
    Node script = transform(code);
    JSDocInfo info = script.getJSDocInfo();
    assertNotNull(info);
    assertEquals("MIT", info.getLicense());
  }

  @Test
  public void testTransformTree_varDeclarationAndInitializer_returnsVarNode() {
    Node script = transform("var a = 1, b;");
    Node varNode = script.getFirstChild();
    assertEquals(Token.VAR, varNode.getType());
    assertEquals(2, varNode.getChildCount());

    Node firstVar = varNode.getFirstChild();
    assertEquals(Token.NAME, firstVar.getType());
    assertEquals("a", firstVar.getString());
    assertEquals(1, firstVar.getChildCount());
    assertEquals(Token.NUMBER, firstVar.getFirstChild().getType());

    Node secondVar = varNode.getLastChild();
    assertEquals(Token.NAME, secondVar.getType());
    assertEquals("b", secondVar.getString());
    assertEquals(0, secondVar.getChildCount());
  }

  @Test
  public void testTransformTree_arrayLiteralWithHoles_setsSkipIndexes() {
    Node script = transform("var arr = [1, , 3, , 5];");
    Node varNode = script.getFirstChild();
    Node arrLit = varNode.getFirstChild().getFirstChild();
    assertEquals(Token.ARRAYLIT, arrLit.getType());
    assertEquals(3, arrLit.getChildCount());
    int[] skipIndexes = (int[]) arrLit.getProp(Node.SKIP_INDEXES_PROP);
    assertNotNull(skipIndexes);
    assertEquals(2, skipIndexes.length);
    assertEquals(1, skipIndexes[0]);
    assertEquals(3, skipIndexes[1]);
  }

  @Test
  public void testTransformTree_assignments_returnsAssignNodes() {
    Node script = transform("x = 1; x += 2; x -= 3; x *= 4; x /= 5; x %= 6;");
    assertEquals(6, script.getChildCount());
    Node firstExpr = script.getFirstChild();
    assertEquals(Token.EXPR_RESULT, firstExpr.getType());
    assertEquals(Token.ASSIGN, firstExpr.getFirstChild().getType());
  }

  @Test
  public void testTransformTree_blockStatements_createsSyntheticBlocks() {
    Node script = transform("{ var x = 1; { var y = 2; } }");
    Node block = script.getFirstChild();
    assertEquals(Token.BLOCK, block.getType());
  }

  @Test
  public void testTransformTree_breakAndContinue_withAndWithoutLabels() {
    String code = "loop: for (;;) { if (true) continue loop; else continue; break loop; break; }";
    Node script = transform(code);
    Node labelNode = script.getFirstChild();
    assertEquals(Token.LABEL, labelNode.getType());
  }

  @Test
  public void testTransformTree_conditionalExpression_returnsHook() {
    Node script = transform("var x = a ? b : c;");
    Node hook = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.HOOK, hook.getType());
    assertEquals(3, hook.getChildCount());
  }

  @Test
  public void testTransformTree_doWhileAndWhileLoops_returnsCorrectTokens() {
    Node script = transform("do { x++; } while (x < 10); while (x > 0) { x--; }");
    assertEquals(2, script.getChildCount());
    assertEquals(Token.DO, script.getFirstChild().getType());
    assertEquals(Token.WHILE, script.getLastChild().getType());
  }

  @Test
  public void testTransformTree_forAndForInLoops_returnsForNodes() {
    Node script = transform("for (var i = 0; i < 10; i++) {} for (var k in obj) {}");
    assertEquals(2, script.getChildCount());
    assertEquals(Token.FOR, script.getFirstChild().getType());
    assertEquals(Token.FOR, script.getLastChild().getType());
  }

  @Test
  public void testTransformTree_functionDeclarationNamedAndAnonymous_returnsFunctionNodes() {
    Node script = transform("function named(a, b) { 'use strict'; return a + b; } var anon = function(c) {};");
    Node fnNode = script.getFirstChild();
    assertEquals(Token.FUNCTION, fnNode.getType());
    Node nameNode = fnNode.getFirstChild();
    assertEquals("named", nameNode.getString());
    Node lpNode = nameNode.getNext();
    assertEquals(Token.LP, lpNode.getType());
    assertEquals(2, lpNode.getChildCount());
    Node bodyNode = lpNode.getNext();
    assertEquals(Token.BLOCK, bodyNode.getType());
    assertTrue(bodyNode.getDirectives().contains("use strict"));

    Node anonVar = script.getLastChild();
    Node anonFn = anonVar.getFirstChild().getFirstChild();
    assertEquals(Token.FUNCTION, anonFn.getType());
    assertEquals("", anonFn.getFirstChild().getString());
  }

  @Test
  public void testTransformTree_ifElseStatement_returnsIfNode() {
    Node script = transform("if (a) { b(); } else if (c) { d(); } else { e(); }");
    Node ifNode = script.getFirstChild();
    assertEquals(Token.IF, ifNode.getType());
    assertEquals(3, ifNode.getChildCount());
  }

  @Test
  public void testTransformTree_infixAndUnaryExpressions_handlesAllOperators() {
    String code = "var r = 1 + 2 - 3 * 4 / 5 % 6 | 7 ^ 8 & 9 << 1 >> 2 >>> 3 == 4 != 5 === 6 !== 7 < 8 <= 9 > 10 >= 11 in obj instanceof Cls;";
    Node script = transform(code);
    assertNotNull(script.getFirstChild());

    String unaryCode = "var u = +a + -b + !c + ~d + typeof e + void 0 + delete obj.prop + ++x + x++ + --y + y--;";
    Node unaryScript = transform(unaryCode);
    assertNotNull(unaryScript.getFirstChild());
  }

  @Test
  public void testTransformTree_negativeNumberFolding_foldsDirectly() {
    Node script = transform("var x = -5;");
    Node numNode = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.NUMBER, numNode.getType());
    assertEquals(-5.0, numNode.getDouble(), 0.0);
  }

  @Test
  public void testTransformTree_keywordLiterals_returnsExpectedTokens() {
    Node script = transform("var a = true, b = false, c = null, d = this;");
    Node varNode = script.getFirstChild();
    assertEquals(Token.TRUE, varNode.getFirstChild().getFirstChild().getType());
    assertEquals(Token.FALSE, varNode.getFirstChild().getNext().getFirstChild().getType());
    assertEquals(Token.NULL, varNode.getFirstChild().getNext().getNext().getFirstChild().getType());
    assertEquals(Token.THIS, varNode.getLastChild().getFirstChild().getType());
  }

  @Test
  public void testTransformTree_newAndCallExpressions_returnsCorrectTokens() {
    Node script = transform("new MyClass(1, 2); myFunc(3, 4);");
    Node newExpr = script.getFirstChild().getFirstChild();
    assertEquals(Token.NEW, newExpr.getType());
    Node callExpr = script.getLastChild().getFirstChild();
    assertEquals(Token.CALL, callExpr.getType());
  }

  @Test
  public void testTransformTree_objectLiteralWithGettersAndSetters_es5Accepted() {
    String code = "var obj = { a: 1, 'b': 2, get c() { return 3; }, set d(v) { this.x = v; } };";
    Node script = transform(code, es5Config);
    Node objLit = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.OBJECTLIT, objLit.getType());
    assertEquals(4, objLit.getChildCount());

    Node propA = objLit.getFirstChild();
    assertEquals(Token.STRING, propA.getType());
    assertNull(propA.getProp(Node.QUOTED_PROP));

    Node propB = propA.getNext();
    assertEquals(Token.STRING, propB.getType());
    assertEquals(Boolean.TRUE, propB.getProp(Node.QUOTED_PROP));

    Node propC = propB.getNext();
    assertEquals(Token.GET, propC.getType());

    Node propD = propC.getNext();
    assertEquals(Token.SET, propD.getType());
  }

  @Test
  public void testTransformTree_objectLiteralGettersSetters_es3Rejected() {
    String code = "var obj = { get c() { return 1; }, set d(v) {} };";
    Node script = transform(code, es3Config);
    Node objLit = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(0, objLit.getChildCount());
    assertTrue(errorReporter.errors.size() >= 2);
  }

  @Test
  public void testTransformTree_parenthesizedExpression_marksProp() {
    Node script = transform("var x = (a + b) * c;");
    Node mult = script.getFirstChild().getFirstChild().getFirstChild();
    Node add = mult.getFirstChild();
    assertEquals(Boolean.TRUE, add.getProp(Node.PARENTHESIZED_PROP));
  }

  @Test
  public void testTransformTree_propertyGetAndElementGet_returnsCorrectNodes() {
    Node script = transform("obj.prop; arr[0];");
    assertEquals(Token.GETPROP, script.getFirstChild().getFirstChild().getType());
    assertEquals(Token.GETELEM, script.getLastChild().getFirstChild().getType());
  }

  @Test
  public void testTransformTree_regExpLiteral_withAndWithoutFlags() {
    Node script = transform("var r1 = /abc/g; var r2 = /xyz/;");
    Node r1 = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.REGEXP, r1.getType());
    assertEquals(2, r1.getChildCount());
    assertEquals("abc", r1.getFirstChild().getString());
    assertEquals("g", r1.getLastChild().getString());

    Node r2 = script.getLastChild().getFirstChild().getFirstChild();
    assertEquals(Token.REGEXP, r2.getType());
    assertEquals(1, r2.getChildCount());
  }

  @Test
  public void testTransformTree_switchStatement_handlesCasesAndDefault() {
    String code = "switch (x) { case 1: break; case 2: y = 2; break; default: y = 0; }";
    Node script = transform(code);
    Node switchNode = script.getFirstChild();
    assertEquals(Token.SWITCH, switchNode.getType());
    assertEquals(4, switchNode.getChildCount());
    Node case1 = switchNode.getFirstChild().getNext();
    assertEquals(Token.CASE, case1.getType());
    Node defaultCase = switchNode.getLastChild();
    assertEquals(Token.DEFAULT, defaultCase.getType());
  }

  @Test
  public void testTransformTree_tryCatchFinally_constructsTryNode() {
    String code = "try { x(); } catch (e) { y(e); } finally { z(); }";
    Node script = transform(code);
    Node tryNode = script.getFirstChild();
    assertEquals(Token.TRY, tryNode.getType());
    assertEquals(3, tryNode.getChildCount());
    assertEquals(Token.BLOCK, tryNode.getFirstChild().getType());
    assertEquals(Token.BLOCK, tryNode.getFirstChild().getNext().getType());
    assertEquals(Token.BLOCK, tryNode.getLastChild().getType());
  }

  @Test
  public void testTransformTree_tryFinallyWithoutCatch_setsBlockLineno() {
    String code = "try { x(); } finally { z(); }";
    Node script = transform(code);
    Node tryNode = script.getFirstChild();
    assertEquals(Token.TRY, tryNode.getType());
    assertEquals(3, tryNode.getChildCount());
    Node catchBlock = tryNode.getFirstChild().getNext();
    assertEquals(0, catchBlock.getChildCount());
  }

  @Test
  public void testTransformTree_throwAndWithStatements_returnsExpectedTokens() {
    Node script = transform("throw new Error(); with (obj) { x = 1; }");
    assertEquals(Token.THROW, script.getFirstChild().getType());
    assertEquals(Token.WITH, script.getLastChild().getType());
  }

  @Test
  public void testTransformTree_multilinePosition_calculatesCharnoCorrectly() {
    String code = "\n\n  var target = 100;";
    Node script = transform(code);
    Node varNode = script.getFirstChild();
    assertEquals(3, varNode.getLineno());
    assertEquals(2, varNode.getCharno());
  }

  @Test
  public void testTransformTree_jsdocOnVariableAndFunction_attachesJSDocInfo() {
    String code = "/** @type {number} */ var x = 1;\n/** @return {void} */ function f() {}";
    Node script = transform(code);
    Node varNode = script.getFirstChild();
    assertNotNull(varNode.getJSDocInfo());

    Node fnNode = script.getLastChild();
    assertNotNull(fnNode.getJSDocInfo());
  }

  @Test
  public void testTransformTree_destructuringArrayAndObject_reportsDestructuringError() {
    AstRoot root = new AstRoot();
    root.setSourceName("test.js");

    ArrayLiteral arrayLit = new ArrayLiteral();
    arrayLit.setIsDestructuring(true);
    arrayLit.setLineno(1);
    root.addChild(arrayLit);

    ObjectLiteral objLit = new ObjectLiteral();
    objLit.setIsDestructuring(true);
    objLit.setLineno(2);
    root.addChild(objLit);

    Node node = IRFactory.transformTree(root, "", defaultConfig, errorReporter);
    assertNotNull(node);
    assertEquals(2, errorReporter.errors.size());
    assertTrue(errorReporter.errors.get(0).contains("destructuring"));
    assertTrue(errorReporter.errors.get(1).contains("destructuring"));
  }

  @Test
  public void testTransformTree_catchClauseWithCondition_reportsError() {
    AstRoot root = new AstRoot();
    root.setSourceName("test.js");

    TryStatement tryStmt = new TryStatement();
    tryStmt.setTryBlock(new Block());
    CatchClause catchClause = new CatchClause();
    Name varName = new Name(0, "e");
    catchClause.setVarName(varName);
    Name cond = new Name(0, "e instanceof Error");
    cond.setLineno(1);
    catchClause.setCatchCondition(cond);
    catchClause.setBody(new Block());
    tryStmt.addCatchClause(catchClause);

    root.addChild(tryStmt);

    Node node = IRFactory.transformTree(root, "try {} catch (e if cond) {}", defaultConfig, errorReporter);
    assertNotNull(node);
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("Catch clauses are not supported"));
  }

  @Test
  public void testTransformTree_unsupportedSyntax_reportsIllegalToken() {
    AstRoot root = new AstRoot();
    root.setSourceName("test.js");

    AstNode dummy = new AstNode(com.google.javascript.jscomp.mozilla.rhino.Token.RESERVED) {
      @Override
      public String toSource(int depth) {
        return "";
      }
    };
    dummy.setLineno(5);
    root.addChild(dummy);

    Node node = IRFactory.transformTree(root, "reserved", defaultConfig, errorReporter);
    assertNotNull(node);
    assertFalse(errorReporter.errors.isEmpty());
    assertTrue(errorReporter.errors.get(0).contains("Unsupported syntax"));
  }

  @Test
  public void testTransformTree_emptyBlockTransformation_createsBlockNode() {
    AstRoot root = new AstRoot();
    root.setSourceName("test.js");
    EmptyExpression empty = new EmptyExpression();
    empty.setLineno(1);
    root.addChild(empty);

    Node node = IRFactory.transformTree(root, ";", defaultConfig, errorReporter);
    assertNotNull(node);
  }

  @Test
  public void testTransformTree_multipleLabeledStatements_nestsLabels() {
    String code = "lbl1: lbl2: while(true) { break lbl1; }";
    Node script = transform(code);
    Node topLabel = script.getFirstChild();
    assertEquals(Token.LABEL, topLabel.getType());
    Node innerLabel = topLabel.getLastChild();
    assertEquals(Token.LABEL, innerLabel.getType());
  }

  @Test
  public void testTransformTree_returnStatementWithoutValue_createsEmptyReturnNode() {
    String code = "function test() { return; }";
    Node script = transform(code);
    Node fn = script.getFirstChild();
    Node body = fn.getLastChild();
    Node returnNode = body.getFirstChild();
    assertEquals(Token.RETURN, returnNode.getType());
    assertEquals(0, returnNode.getChildCount());
  }
}
