package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.CatchClause;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.ExpressionStatement;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.Token.CommentType;
import com.google.javascript.rhino.jstype.StaticSourceFile;

import org.junit.Test;

import java.util.Collections;

public class IRFactoryTest {

  private static class TestErrorReporter implements ErrorReporter {
    int errorCount = 0;
    int warningCount = 0;
    String lastMessage = null;

    @Override
    public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {
      warningCount++;
      lastMessage = message;
    }

    @Override
    public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {
      errorCount++;
      lastMessage = message;
    }

    @Override
    public EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
      errorCount++;
      lastMessage = message;
      return new EvaluatorException(message, sourceName, line, lineSource, lineOffset);
    }
  }

  private Config createConfig(LanguageMode mode, boolean isIdeMode, boolean acceptConst) {
    return new Config(
        Collections.<String>emptySet(),
        Collections.<String>emptySet(),
        isIdeMode,
        mode,
        acceptConst);
  }

  private Node parse(String source, Config config, TestErrorReporter reporter) {
    CompilerEnvirons env = new CompilerEnvirons();
    env.setLanguageVersion(Context.VERSION_1_8);
    env.setRecordingComments(true);
    env.setRecordingLocalJsDocComments(true);
    env.setWarnTrailingComma(false);
    env.setStrictMode(false);
    env.setRecoverFromErrors(true);

    com.google.javascript.rhino.head.Parser parser =
        new com.google.javascript.rhino.head.Parser(env, reporter);
    AstRoot root = parser.parse(source, "test.js", 1);
    return IRFactory.transformTree(root, null, source, config, reporter);
  }

  private Node parseWithSourceFile(String source, Config config, TestErrorReporter reporter, final String fileName) {
    CompilerEnvirons env = new CompilerEnvirons();
    env.setLanguageVersion(Context.VERSION_1_8);
    env.setRecordingComments(true);
    env.setRecordingLocalJsDocComments(true);

    com.google.javascript.rhino.head.Parser parser =
        new com.google.javascript.rhino.head.Parser(env, reporter);
    AstRoot root = parser.parse(source, fileName, 1);

    StaticSourceFile sourceFile = new StaticSourceFile() {
      @Override public String getName() { return fileName; }
      @Override public boolean isExtern() { return false; }
      @Override public int getLineOffset(int lineno) { return 0; }
    };

    return IRFactory.transformTree(root, sourceFile, source, config, reporter);
  }

  @Test
  public void testTransformTree_basicScript() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    Node script = parse("var x = 1;", config, reporter);
    assertNotNull(script);
    assertEquals(Token.SCRIPT, script.getType());
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testTransformTree_withSourceFile() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    Node script = parseWithSourceFile("var a = 10;", config, reporter, "my_file.js");
    assertNotNull(script);
    assertEquals(Token.SCRIPT, script.getType());
    assertEquals("my_file.js", script.getStaticSourceFile().getName());
  }

  @Test
  public void testLanguageModes() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config es3Config = createConfig(LanguageMode.ECMASCRIPT3, false, true);
    Node es3 = parse("var x = 1;", es3Config, reporter);
    assertNotNull(es3);

    Config es5Config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    Node es5 = parse("var x = 1;", es5Config, reporter);
    assertNotNull(es5);

    Config es5StrictConfig = createConfig(LanguageMode.ECMASCRIPT5_STRICT, false, true);
    Node es5Strict = parse("var x = 1;", es5StrictConfig, reporter);
    assertNotNull(es5Strict);
  }

  @Test
  public void testReservedKeywords_es5Strict() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5_STRICT, false, true);
    parse("var let = 1;", config, reporter);
    assertTrue(reporter.errorCount > 0);
    assertTrue(reporter.lastMessage.contains("reserved word"));
  }

  @Test
  public void testReservedKeywords_es5() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("var super = 1;", config, reporter);
    assertTrue(reporter.errorCount > 0);
    assertTrue(reporter.lastMessage.contains("reserved word"));
  }

  @Test
  public void testDirectives_scriptAndFunction() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    String code = "'use strict';\nfunction foo() {\n 'use strict';\n return 1;\n}";
    Node script = parse(code, config, reporter);
    assertNotNull(script.getDirectives());
    assertTrue(script.getDirectives().contains("use strict"));

    Node fn = script.getFirstChild();
    assertEquals(Token.FUNCTION, fn.getType());
    Node fnBody = fn.getLastChild();
    assertNotNull(fnBody.getDirectives());
    assertTrue(fnBody.getDirectives().contains("use strict"));
  }

  @Test
  public void testSuspiciousComments_warningTriggered() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    String code = "/* @type {number} */ var x = 1;\n/*\n * @param {string} a\n */ var y = 2;";
    parse(code, config, reporter);
    assertTrue(reporter.warningCount >= 2);
    assertEquals(IRFactory.SUSPICIOUS_COMMENT_WARNING, reporter.lastMessage);
  }

  @Test
  public void testFileOverviewAndJsDoc() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    String code = "/**\n * @fileoverview Test file\n * @license MIT\n */\n/** @type {number} */ var a = 1;";
    Node script = parse(code, config, reporter);
    assertNotNull(script.getJSDocInfo());
    assertEquals("MIT", script.getJSDocInfo().getLicense());
  }

  @Test
  public void testArrayLiteral_normal() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    Node script = parse("var arr = [1, 2, 'hello', null];", config, reporter);
    assertEquals(0, reporter.errorCount);
    Node varNode = script.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Node arrayLit = nameNode.getFirstChild();
    assertEquals(Token.ARRAYLIT, arrayLit.getType());
    assertEquals(4, arrayLit.getChildCount());
  }

  @Test
  public void testArrayLiteral_destructuringError() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);

    AstRoot root = new AstRoot();
    ArrayLiteral arrayLit = new ArrayLiteral();
    arrayLit.setDestructuring(true);
    ExpressionStatement stmt = new ExpressionStatement(arrayLit);
    root.addChild(stmt);

    IRFactory.transformTree(root, null, "", config, reporter);
    assertTrue(reporter.errorCount > 0);
    assertTrue(reporter.lastMessage.contains("destructuring"));
  }

  @Test
  public void testAssignment_validAndInvalid() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("a = 1; a.b = 2; a[3] = 4; a += 5;", config, reporter);
    assertEquals(0, reporter.errorCount);

    AstRoot root = new AstRoot();
    Assignment assignment = new Assignment();
    assignment.setType(com.google.javascript.rhino.head.Token.ASSIGN);
    assignment.setLeft(new NumberLiteral(123));
    assignment.setRight(new NumberLiteral(456));
    root.addChild(new ExpressionStatement(assignment));

    IRFactory.transformTree(root, null, "123 = 456;", config, reporter);
    assertTrue(reporter.errorCount > 0);
    assertTrue(reporter.lastMessage.contains("invalid assignment target"));
  }

  @Test
  public void testBreakAndContinue_withAndWithoutLabels() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    String code = "loop1: while(true) { if (false) continue; if (true) continue loop1; break; break loop1; }";
    Node script = parse(code, config, reporter);
    assertEquals(0, reporter.errorCount);
    assertNotNull(script);
  }

  @Test
  public void testTryCatchFinally() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("try { x(); } catch(e) { y(); } finally { z(); }", config, reporter);
    parse("try { x(); } finally { z(); }", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testCatchCondition_unsupportedError() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);

    AstRoot root = new AstRoot();
    com.google.javascript.rhino.head.ast.TryStatement tryStmt = new com.google.javascript.rhino.head.ast.TryStatement();
    tryStmt.setTryBlock(new com.google.javascript.rhino.head.ast.Block());

    CatchClause catchClause = new CatchClause();
    catchClause.setVarName(new Name(0, "e"));
    catchClause.setCatchCondition(new Name(0, "cond"));
    catchClause.setBody(new com.google.javascript.rhino.head.ast.Block());
    tryStmt.addCatchClause(catchClause);
    root.addChild(tryStmt);

    IRFactory.transformTree(root, null, "", config, reporter);
    assertTrue(reporter.errorCount > 0);
    assertTrue(reporter.lastMessage.contains("Catch clauses are not supported"));
  }

  @Test
  public void testConditionalExpression_hook() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    Node script = parse("var x = a ? b : c;", config, reporter);
    Node hook = script.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.HOOK, hook.getType());
  }

  @Test
  public void testLoops_doWhileForForIn() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("do { a++; } while(a < 10);", config, reporter);
    parse("while (b) { b--; }", config, reporter);
    parse("for (var i = 0; i < 10; i++) {}", config, reporter);
    parse("for (;;) { break; }", config, reporter);
    parse("for (var k in obj) { console.log(k); }", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testEmptyExpressionAndBlock() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("if (true) ; else ;", config, reporter);
    parse(";", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testFunctionDeclarationsAndCalls() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("function named(a, b) { return a + b; }", config, reporter);
    parse("var anon = function(x) { return x * 2; };", config, reporter);
    parse("named(1, 2);", config, reporter);
    parse("new named(1, 2);", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testUnnamedFunctionStatement_error() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);

    AstRoot root = new AstRoot();
    FunctionNode fn = new FunctionNode();
    fn.setFunctionType(FunctionNode.FUNCTION_STATEMENT);
    fn.setBody(new com.google.javascript.rhino.head.ast.Block());
    root.addChild(fn);

    Node result = IRFactory.transformTree(root, null, "", config, reporter);
    assertTrue(reporter.errorCount > 0);
    assertTrue(reporter.lastMessage.contains("unnamed function statement"));
    assertEquals(Token.EXPR_RESULT, result.getFirstChild().getType());
  }

  @Test
  public void testIfStatement_withAndWithoutElse() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("if (x) { y(); }", config, reporter);
    parse("if (x) { y(); } else { z(); }", config, reporter);
    parse("if (x) y(); else z();", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testInfixExpressions_allOperators() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    String code = "var r = (a | b) ^ (c & d) + (e - f) * (g / h) % (i << 1) >> (j >>> 2); "
        + "var cmp = (a == b) && (c != d) || (e < f) && (g <= h) || (i > j) && (k >= l); "
        + "var seq = (a === b, c !== d, 'x' in obj, obj instanceof Object);";
    parse(code, config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testKeywordLiterals() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("var a = true, b = false, c = null, d = this, e = void 0; debugger;", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testLabeledStatement_multipleLabels() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("lbl1: lbl2: while(true) { break lbl1; }", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testNumberLiterals_integersAndFloats() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("var a = 0, b = 1, c = 1.5, d = -10, e = -3.14;", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testObjectLiteral_keysAndProperties() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("var obj = { a: 1, 'b': 2, 3: 4, 5.5: 6 };", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testObjectLiteral_gettersAndSetters_es5() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("var obj = { get x() { return 1; }, set x(val) { this._x = val; } };", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testObjectLiteral_getterAndSetterInES3_error() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT3, false, true);
    parse("var obj = { get x() { return 1; }, set x(v) {} };", config, reporter);
    assertTrue(reporter.errorCount >= 2);
    assertTrue(reporter.lastMessage.contains("Internet Explorer"));
  }

  @Test
  public void testObjectLiteral_invalidGetterSetterParams() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);

    AstRoot root = new AstRoot();
    ObjectLiteral objLit = new ObjectLiteral();

    ObjectProperty getterProp = new ObjectProperty();
    getterProp.setType(com.google.javascript.rhino.head.Token.GET);
    getterProp.setLeft(new Name(0, "prop1"));
    FunctionNode getterFn = new FunctionNode();
    getterFn.addParam(new Name(0, "param1"));
    getterFn.setBody(new com.google.javascript.rhino.head.ast.Block());
    getterProp.setRight(getterFn);
    objLit.addElement(getterProp);

    ObjectProperty setterProp = new ObjectProperty();
    setterProp.setType(com.google.javascript.rhino.head.Token.SET);
    setterProp.setLeft(new Name(0, "prop2"));
    FunctionNode setterFn = new FunctionNode();
    setterFn.setBody(new com.google.javascript.rhino.head.ast.Block());
    setterProp.setRight(setterFn);
    objLit.addElement(setterProp);

    root.addChild(new ExpressionStatement(objLit));
    IRFactory.transformTree(root, null, "", config, reporter);

    assertTrue(reporter.errorCount >= 2);
  }

  @Test
  public void testObjectLiteral_destructuringError() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);

    AstRoot root = new AstRoot();
    ObjectLiteral objLit = new ObjectLiteral();
    objLit.setDestructuring(true);
    root.addChild(new ExpressionStatement(objLit));

    IRFactory.transformTree(root, null, "", config, reporter);
    assertTrue(reporter.errorCount > 0);
    assertTrue(reporter.lastMessage.contains("destructuring"));
  }

  @Test
  public void testParenthesizedAndPropertyGet() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    Node script = parse("var x = (a.b).c;", config, reporter);
    assertEquals(0, reporter.errorCount);
    assertNotNull(script);
  }

  @Test
  public void testRegExpLiteral() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("var r1 = /abc/; var r2 = /abc/gim;", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testReturnStatement() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("function f() { return; } function g() { return 123; }", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testStringLiteral_verticalTabHandling() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    String code = "var s1 = 'abc\\vdef'; var s2 = 'abc\u000Bdef';";
    Node script = parse(code, config, reporter);
    assertEquals(0, reporter.errorCount);
    assertNotNull(script);
  }

  @Test
  public void testSwitchStatement() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("switch(x) { case 1: a(); break; case 2: default: b(); }", config, reporter);
    parse("switch(x) {}", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testThrowAndWithStatement() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("throw new Error('err');", config, reporter);
    parse("with(obj) { x = 1; }", config, reporter);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testUnaryExpressions_validAndInvalid() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("var a = +x, b = -y, c = !z, d = ~w, e = typeof v, f = delete obj.p, g = delete arr[0], h = delete obj;", config, reporter);
    parse("var i = ++a, j = a++, k = --b, l = b--;", config, reporter);
    assertEquals(0, reporter.errorCount);

    parse("delete 123;", config, reporter);
    assertTrue(reporter.errorCount > 0);
    assertTrue(reporter.lastMessage.contains("Invalid delete operand"));

    reporter.errorCount = 0;
    parse("++123;", config, reporter);
    assertTrue(reporter.errorCount > 0);
    assertTrue(reporter.lastMessage.contains("invalid increment target"));

    reporter.errorCount = 0;
    parse("--123;", config, reporter);
    assertTrue(reporter.errorCount > 0);
    assertTrue(reporter.lastMessage.contains("invalid decrement target"));
  }

  @Test
  public void testVariableDeclaration_constKeyword() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config acceptConstConfig = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    parse("const X = 10;", acceptConstConfig, reporter);
    assertEquals(0, reporter.errorCount);

    Config rejectConstConfig = createConfig(LanguageMode.ECMASCRIPT5, false, false);
    parse("const X = 10;", rejectConstConfig, reporter);
    assertTrue(reporter.errorCount > 0);
    assertTrue(reporter.lastMessage.contains("Unsupported syntax"));
  }

  @Test
  public void testIdeMode_setLengthFrom() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, true, true);
    String code = "function foo(x) { var y = x + 1; return y; }";
    Node script = parse(code, config, reporter);
    assertEquals(0, reporter.errorCount);
    assertTrue(script.getFirstChild().getLength() > 0);
  }

  @Test
  public void testCommentsHandling_noComments() {
    AstRoot root = new AstRoot();
    root.addChild(new ExpressionStatement(new NumberLiteral(1)));
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    TestErrorReporter reporter = new TestErrorReporter();

    Node result = IRFactory.transformTree(root, null, "1;", config, reporter);
    assertNotNull(result);
    assertEquals(0, reporter.errorCount);
  }

  @Test
  public void testFileOverviewLicenseMerging() {
    TestErrorReporter reporter = new TestErrorReporter();
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    String code = "/**\n * @fileoverview Description\n */\n/**\n * @license Apache\n */\nvar x = 1;";
    Node script = parse(code, config, reporter);
    assertNotNull(script.getJSDocInfo());
  }

  @Test(expected = IllegalStateException.class)
  public void testTransformTokenType_invalidToken() {
    AstRoot root = new AstRoot();
    AstNode unknownNode = new AstNode() {
      @Override
      public String toSource(int depth) { return ""; }
      @Override
      public int getType() { return 999999; }
    };
    root.addChild(new ExpressionStatement(unknownNode));
    Config config = createConfig(LanguageMode.ECMASCRIPT5, false, true);
    TestErrorReporter reporter = new TestErrorReporter();
    IRFactory.transformTree(root, null, "", config, reporter);
  }
}
