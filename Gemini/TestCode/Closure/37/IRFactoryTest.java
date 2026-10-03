package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IRFactoryTest {

  private List<String> errors;
  private List<String> warnings;
  private ErrorReporter errorReporter;

  @Before
  public void setUp() {
    errors = new ArrayList<String>();
    warnings = new ArrayList<String>();
    errorReporter = new ErrorReporter() {
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
    };
  }

  private Node parse(String source, Config config, StaticSourceFile sourceFile) {
    CompilerEnvirons env = new CompilerEnvirons();
    env.setRecordingComments(true);
    env.setRecordingLocalJsDocComments(true);
    env.setWarnTrailingComma(true);
    env.setLanguageMode(
        config.languageMode == LanguageMode.ECMASCRIPT3
            ? com.google.javascript.rhino.head.Context.VERSION_1_5
            : com.google.javascript.rhino.head.Context.VERSION_1_8);
    env.setReservedKeywordAsIdentifier(config.languageMode != LanguageMode.ECMASCRIPT3);
    env.setIdeMode(config.isIdeMode);

    Parser parser = new Parser(env, errorReporter);
    AstRoot root = parser.parse(source, sourceFile == null ? null : sourceFile.getName(), 1);
    return IRFactory.transformTree(root, sourceFile, source, config, errorReporter);
  }

  private Node parse(String source) {
    return parse(source, LanguageMode.ECMASCRIPT5, false, true);
  }

  private Node parse(String source, LanguageMode mode, boolean isIdeMode, boolean acceptConst) {
    Config config = new Config(
        ImmutableSet.<String>of(),
        ImmutableSet.<String>of(),
        isIdeMode,
        mode,
        acceptConst);
    SimpleSourceFile sourceFile = new SimpleSourceFile("test.js", false);
    return parse(source, config, sourceFile);
  }

  @Test
  public void testTransformTree_emptyScript_returnsScriptNode() {
    Node node = parse("");
    assertNotNull(node);
    assertEquals(Token.SCRIPT, node.getType());
    assertEquals(0, node.getChildCount());
  }

  @Test
  public void testTransformTree_nullSourceFile_parsesSuccessfully() {
    Config config = new Config(
        ImmutableSet.<String>of(),
        ImmutableSet.<String>of(),
        false,
        LanguageMode.ECMASCRIPT5,
        true);
    CompilerEnvirons env = new CompilerEnvirons();
    Parser parser = new Parser(env, errorReporter);
    AstRoot root = parser.parse("var a = 1;", null, 1);
    Node node = IRFactory.transformTree(root, null, "var a = 1;", config, errorReporter);
    assertNotNull(node);
    assertEquals(Token.SCRIPT, node.getType());
  }

  @Test
  public void testTransformTree_directives_extractedToScriptNode() {
    Node node = parse("'use strict'; var x = 1;");
    assertNotNull(node.getDirectives());
    assertTrue(node.getDirectives().contains("use strict"));
    assertEquals(1, node.getChildCount());
  }

  @Test
  public void testTransformTree_varAndExpressions_validAst() {
    Node node = parse("var a = 1 + 2 * 3; var b = 'str';");
    assertEquals(Token.SCRIPT, node.getType());
    assertEquals(2, node.getChildCount());
    Node var1 = node.getFirstChild();
    assertEquals(Token.VAR, var1.getType());
    Node nameNode = var1.getFirstChild();
    assertEquals("a", nameNode.getString());
    Node addNode = nameNode.getFirstChild();
    assertEquals(Token.ADD, addNode.getType());
  }

  @Test
  public void testTransformTree_functions_namedAndAnonymous() {
    Node node = parse("function foo(x, y) { return x + y; } (function(z) { return z; });");
    assertEquals(2, node.getChildCount());
    Node fn1 = node.getFirstChild();
    assertEquals(Token.FUNCTION, fn1.getType());
    Node name = fn1.getFirstChild();
    assertEquals("foo", name.getString());
    Node params = name.getNext();
    assertEquals(Token.PARAM_LIST, params.getType());
    assertEquals(2, params.getChildCount());
    Node body = params.getNext();
    assertEquals(Token.BLOCK, body.getType());
  }

  @Test
  public void testTransformTree_functionCallAndNewExpression_validAst() {
    Node node = parse("new Foo(1, 2); bar('hello');");
    assertEquals(2, node.getChildCount());
    Node newExpr = node.getFirstChild().getFirstChild();
    assertEquals(Token.NEW, newExpr.getType());
    Node callExpr = node.getLastChild().getFirstChild();
    assertEquals(Token.CALL, callExpr.getType());
  }

  @Test
  public void testTransformTree_controlFlow_ifElseDoWhileForIn() {
    String code = "if (a) { b(); } else { c(); }\n" +
                  "while (a) { break; }\n" +
                  "do { continue; } while (b);\n" +
                  "for (var i = 0; i < 10; i++) { }\n" +
                  "for (var k in obj) { }";
    Node node = parse(code);
    assertEquals(5, node.getChildCount());

    Node ifNode = node.getFirstChild();
    assertEquals(Token.IF, ifNode.getType());

    Node whileNode = ifNode.getNext();
    assertEquals(Token.WHILE, whileNode.getType());

    Node doNode = whileNode.getNext();
    assertEquals(Token.DO, doNode.getType());

    Node forNode = doNode.getNext();
    assertEquals(Token.FOR, forNode.getType());

    Node forInNode = forNode.getNext();
    assertEquals(Token.FOR, forInNode.getType());
  }

  @Test
  public void testTransformTree_switchCaseDefault_validAst() {
    String code = "switch (x) { case 1: a(); break; default: b(); }";
    Node node = parse(code);
    Node switchNode = node.getFirstChild();
    assertEquals(Token.SWITCH, switchNode.getType());
    assertEquals(Token.NAME, switchNode.getFirstChild().getType());
    Node caseNode = switchNode.getFirstChild().getNext();
    assertEquals(Token.CASE, caseNode.getType());
    Node defaultNode = caseNode.getNext();
    assertEquals(Token.DEFAULT_CASE, defaultNode.getType());
  }

  @Test
  public void testTransformTree_tryCatchFinally_validAst() {
    String code = "try { a(); } catch (e) { b(); } finally { c(); }";
    Node node = parse(code);
    Node tryNode = node.getFirstChild();
    assertEquals(Token.TRY, tryNode.getType());
    assertEquals(3, tryNode.getChildCount());
    Node catchBlock = tryNode.getFirstChild().getNext();
    assertEquals(Token.BLOCK, catchBlock.getType());
    Node catchNode = catchBlock.getFirstChild();
    assertEquals(Token.CATCH, catchNode.getType());
  }

  @Test
  public void testTransformTree_tryFinallyWithoutCatch_validAst() {
    String code = "try { a(); } finally { c(); }";
    Node node = parse(code);
    Node tryNode = node.getFirstChild();
    assertEquals(Token.TRY, tryNode.getType());
    assertEquals(2, tryNode.getChildCount());
  }

  @Test
  public void testTransformTree_labelsAndLabeledStatements_validAst() {
    String code = "myLabel: while(true) { break myLabel; continue myLabel; }";
    Node node = parse(code);
    Node labelNode = node.getFirstChild();
    assertEquals(Token.LABEL, labelNode.getType());
    Node labelName = labelNode.getFirstChild();
    assertEquals(Token.LABEL_NAME, labelName.getType());
    assertEquals("myLabel", labelName.getString());
  }

  @Test
  public void testTransformTree_arrayAndObjectLiterals_validAst() {
    String code = "var arr = [1, , 'text']; var obj = {a: 1, 'b': 2, 3: 4, get x() { return 5; }, set x(v) { }};";
    Node node = parse(code, LanguageMode.ECMASCRIPT5, false, true);
    assertEquals(2, node.getChildCount());

    Node objLit = node.getLastChild().getFirstChild().getFirstChild();
    assertEquals(Token.OBJECTLIT, objLit.getType());
    assertEquals(5, objLit.getChildCount());
    Node getter = objLit.getChildAtIndex(3);
    assertEquals(Token.GETTER_DEF, getter.getType());
    Node setter = objLit.getChildAtIndex(4);
    assertEquals(Token.SETTER_DEF, setter.getType());
  }

  @Test
  public void testTransformTree_unaryOperators_validAst() {
    String code = "-5; +x; !y; ~z; typeof a; void 0; delete obj.prop; ++x; x--;";
    Node node = parse(code);
    assertNotNull(node);
    assertEquals(9, node.getChildCount());
    Node negNum = node.getFirstChild().getFirstChild();
    assertEquals(Token.NUMBER, negNum.getType());
    assertEquals(-5.0, negNum.getDouble(), 0.0001);
  }

  @Test
  public void testTransformTree_verticalTabStringLiteral_setsSlashVProp() {
    String code = "var s = '\\v';";
    Node node = parse(code);
    Node strNode = node.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.STRING, strNode.getType());
    assertTrue(strNode.getBooleanProp(Node.SLASH_V));
  }

  @Test
  public void testTransformTree_regExpLiteralWithFlags_validAst() {
    String code = "var r = /abc/gi;";
    Node node = parse(code);
    Node regexNode = node.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.REGEXP, regexNode.getType());
    assertEquals(2, regexNode.getChildCount());
    assertEquals("abc", regexNode.getFirstChild().getString());
    assertEquals("gi", regexNode.getLastChild().getString());
  }

  @Test
  public void testTransformTree_commentsAndFileOverview_extracted() {
    String code = "/** @fileoverview Test overview\n * @license MIT\n */\n" +
                  "/** Normal JSDoc */\nvar x = 10;\n" +
                  "/* @suspicious comment */";
    Node node = parse(code);
    assertNotNull(node);
    assertNotNull(node.getJSDocInfo());
    assertTrue(warnings.size() > 0);
  }

  @Test
  public void testTransformTree_parenthesizedExpression_setsParenProp() {
    String code = "var x = (1 + 2);";
    Node node = parse(code);
    Node expr = node.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Boolean.TRUE, expr.getProp(Node.PARENTHESIZED_PROP));
  }

  @Test
  public void testTransformTree_withStatementAndThrow_validAst() {
    String code = "with (obj) { throw new Error('err'); }";
    Node node = parse(code);
    Node withNode = node.getFirstChild();
    assertEquals(Token.WITH, withNode.getType());
  }

  @Test
  public void testTransformTree_ideMode_setsLength() {
    String code = "var a = 1;";
    Node node = parse(code, LanguageMode.ECMASCRIPT5, true, true);
    assertTrue(node.getLength() > 0);
  }

  @Test
  public void testTransformTree_ecmaScript3Mode_disallowsGettersSetters() {
    String code = "var obj = { get x() { return 1; } };";
    parse(code, LanguageMode.ECMASCRIPT3, false, true);
    assertTrue(errors.size() > 0);
  }

  @Test
  public void testTransformTree_strictReservedKeyword_reportsError() {
    String code = "var let = 1;";
    parse(code, LanguageMode.ECMASCRIPT5_STRICT, false, true);
    assertTrue(errors.size() > 0);
  }

  @Test
  public void testTransformTree_invalidDeleteOperand_reportsError() {
    String code = "delete 123;";
    parse(code);
    assertTrue(errors.size() > 0);
  }

  @Test
  public void testTransformTree_invalidIncrementOperand_reportsError() {
    String code = "++(1+2);";
    parse(code);
    assertTrue(errors.size() > 0);
  }
}
