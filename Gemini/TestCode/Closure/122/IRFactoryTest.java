package com.google.javascript.jscomp.parsing;

import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.Token.CommentType;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.ast.KeywordLiteral;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public org.junit.runner.notification.Failure runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
      errors.add(message);
      return null;
    }

    public boolean hasErrors() {
      return !errors.isEmpty();
    }

    public boolean hasWarnings() {
      return !warnings.isEmpty();
    }
  }

  private TestErrorReporter errorReporter;
  private Config es5Config;
  private Config es3Config;
  private Config es5StrictConfig;

  @Before
  public void setUp() {
    errorReporter = new TestErrorReporter();
    es5Config = new Config(
        Collections.<String>emptySet(),
        Collections.<String>emptySet(),
        true,
        LanguageMode.ECMASCRIPT5,
        false);
    es3Config = new Config(
        Collections.<String>emptySet(),
        Collections.<String>emptySet(),
        true,
        LanguageMode.ECMASCRIPT3,
        false);
    es5StrictConfig = new Config(
        Collections.<String>emptySet(),
        Collections.<String>emptySet(),
        true,
        LanguageMode.ECMASCRIPT5_STRICT,
        false);
  }

  private AstRoot parseRhino(String source, LanguageMode mode, boolean ideMode) {
    CompilerEnvirons env = new CompilerEnvirons();
    env.setRecordingComments(true);
    env.setRecordingLocalJsDocComments(true);
    env.setWarnTrailingComma(true);
    int langVer = Context.VERSION_1_5;
    if (mode == LanguageMode.ECMASCRIPT5 || mode == LanguageMode.ECMASCRIPT5_STRICT) {
      langVer = Context.VERSION_1_8;
    }
    env.setLanguageVersion(langVer);
    env.setIdeMode(ideMode);
    if (ideMode) {
      env.setErrorReporter(new ErrorCollector());
    }
    Parser p = new Parser(env);
    return p.parse(source, "test.js", 1);
  }

  private Node parseAndTransform(String source, Config config, StaticSourceFile sourceFile) {
    AstRoot root = parseRhino(source, config.languageMode, config.isIdeMode);
    return IRFactory.transformTree(root, sourceFile, source, config, errorReporter);
  }

  private Node parseAndTransform(String source, Config config) {
    StaticSourceFile file = new SimpleSourceFile("test.js", false);
    return parseAndTransform(source, config, file);
  }

  private Node parseAndTransform(String source) {
    return parseAndTransform(source, es5Config);
  }

  @Test
  public void testTransformTree_emptyScript() {
    Node node = parseAndTransform("", es5Config, null);
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.SCRIPT, node.getType());
    Assert.assertFalse(node.hasChildren());
  }

  @Test
  public void testTransformTree_varAndLiterals() {
    String js = "var a = 1, b = 2.5, c = 'hello', d = true, e = false, f = null, g = /abc/gi;";
    Node node = parseAndTransform(js);
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.SCRIPT, node.getType());
    Node varNode = node.getFirstChild();
    Assert.assertEquals(Token.VAR, varNode.getType());
    Assert.assertEquals(7, varNode.getChildCount());
  }

  @Test
  public void testTransformTree_verticalTabInString() {
    String js = "var s = '\\v';";
    Node node = parseAndTransform(js);
    Node varNode = node.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Node stringVal = nameNode.getFirstChild();
    Assert.assertTrue(stringVal.getBooleanProp(Node.SLASH_V));
  }

  @Test
  public void testTransformTree_directives() {
    String js = "'use strict'; var x = 1;";
    Node node = parseAndTransform(js);
    Assert.assertNotNull(node.getDirectives());
    Assert.assertTrue(node.getDirectives().contains("use strict"));
    Assert.assertEquals(Token.VAR, node.getFirstChild().getType());
  }

  @Test
  public void testTransformTree_controlFlowStatements() {
    String js = "if (true) { while (false) { do { for (var i=0; i<10; i++) { continue; } } while (false); } } else { break; }";
    Node node = parseAndTransform(js);
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.SCRIPT, node.getType());
    Node ifNode = node.getFirstChild();
    Assert.assertEquals(Token.IF, ifNode.getType());
  }

  @Test
  public void testTransformTree_forInLoop() {
    String js = "for (var k in obj) { ; }";
    Node node = parseAndTransform(js);
    Assert.assertEquals(Token.FOR, node.getFirstChild().getType());
  }

  @Test
  public void testTransformTree_tryCatchFinally() {
    String js = "try { throw new Error('err'); } catch (e) { } finally { }";
    Node node = parseAndTransform(js);
    Node tryNode = node.getFirstChild();
    Assert.assertEquals(Token.TRY, tryNode.getType());
    Assert.assertEquals(3, tryNode.getChildCount());
  }

  @Test
  public void testTransformTree_switchStatement() {
    String js = "switch (x) { case 1: case 2: break; default: break; }";
    Node node = parseAndTransform(js);
    Node switchNode = node.getFirstChild();
    Assert.assertEquals(Token.SWITCH, switchNode.getType());
    Assert.assertEquals(3, switchNode.getChildCount());
  }

  @Test
  public void testTransformTree_labeledStatement() {
    String js = "lbl: while(true) { break lbl; continue lbl; }";
    Node node = parseAndTransform(js);
    Node labelNode = node.getFirstChild();
    Assert.assertEquals(Token.LABEL, labelNode.getType());
  }

  @Test
  public void testTransformTree_withStatement() {
    String js = "with (obj) { a = 1; }";
    Node node = parseAndTransform(js);
    Node withNode = node.getFirstChild();
    Assert.assertEquals(Token.WITH, withNode.getType());
  }

  @Test
  public void testTransformTree_expressionsAndOperators() {
    String js = "var res = (a + b - c * d / e % f | g & h ^ i << 1 >> 2 >>> 3 == j != k === l !== m < n <= o > p >= q && r || s ? t : typeof u instanceof v ? void 0 : !+~-delete obj.prop[0]);";
    Node node = parseAndTransform(js);
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.SCRIPT, node.getType());
  }

  @Test
  public void testTransformTree_incrementDecrement() {
    String js = "x++; ++x; x--; --x; (a.b)++;";
    Node node = parseAndTransform(js);
    Assert.assertEquals(5, node.getChildCount());
  }

  @Test
  public void testTransformTree_functionsAndCalls() {
    String js = "function named(a, b) { 'use strict'; return a + b; } var anon = function(c) {}; (function(){})(); new Object(1, 2);";
    Node node = parseAndTransform(js);
    Assert.assertEquals(4, node.getChildCount());
  }

  @Test
  public void testTransformTree_objectLiteral() {
    String js = "var o = { a: 1, 'b': 2, 3: 4, get getter() { return 1; }, set setter(v) { this.x = v; } };";
    Node node = parseAndTransform(js);
    Node varNode = node.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Node objLit = nameNode.getFirstChild();
    Assert.assertEquals(Token.OBJECTLIT, objLit.getType());
  }

  @Test
  public void testTransformTree_fileOverviewAndLicense() {
    String js = "/**\n * @fileoverview Description\n * @license MIT\n */\nvar x = 1;";
    Node node = parseAndTransform(js);
    JSDocInfo info = node.getJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertEquals("MIT", info.getLicense());
  }

  @Test
  public void testTransformTree_suspiciousCommentWarning() {
    String js = "/* @type {number} */ var x = 1;\n/*\n * @param {string} a\n */ function f(a) {}";
    parseAndTransform(js);
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testTransformTree_typeCastAndAnnotations() {
    String js = "var x = /** @type {string} */ (foo);";
    Node node = parseAndTransform(js);
    Node varNode = node.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Node castNode = nameNode.getFirstChild();
    Assert.assertEquals(Token.CAST, castNode.getType());
  }

  @Test
  public void testTransformTree_inlineParamJsDoc() {
    String js = "function f(/** string */ x) {}";
    Node node = parseAndTransform(js);
    Node fn = node.getFirstChild();
    Node paramList = fn.getFirstChild().getNext();
    Node param = paramList.getFirstChild();
    Assert.assertNotNull(param.getJSDocInfo());
  }

  @Test
  public void testTransformTree_misplacedTypeAnnotation() {
    String js = "var x = /** @type {number} */ 5;";
    parseAndTransform(js);
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testTransformTree_es3ReservedWords() {
    String js = "var o = { class: 1 }; o.class = 2;";
    parseAndTransform(js, es3Config);
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testTransformTree_es3GettersSettersError() {
    AstRoot root = new AstRoot();
    ObjectLiteral obj = new ObjectLiteral();
    ObjectProperty prop = new ObjectProperty();
    prop.setType(com.google.javascript.rhino.head.Token.GET);
    prop.setLeft(new Name(0, "g"));
    com.google.javascript.rhino.head.ast.FunctionNode fn = new com.google.javascript.rhino.head.ast.FunctionNode();
    prop.setRight(fn);
    obj.addElement(prop);
    root.addChild(new com.google.javascript.rhino.head.ast.ExpressionStatement(obj));

    IRFactory.transformTree(root, null, "", es3Config, errorReporter);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_invalidAssignmentTarget() {
    AstRoot root = new AstRoot();
    com.google.javascript.rhino.head.ast.Assignment assign = new com.google.javascript.rhino.head.ast.Assignment();
    assign.setType(com.google.javascript.rhino.head.Token.ASSIGN);
    assign.setLeft(new NumberLiteral(0, 5.0));
    assign.setRight(new NumberLiteral(0, 6.0));
    root.addChild(new com.google.javascript.rhino.head.ast.ExpressionStatement(assign));

    IRFactory.transformTree(root, null, "5 = 6;", es5Config, errorReporter);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_invalidDeleteAndIncrTarget() {
    AstRoot root = new AstRoot();
    com.google.javascript.rhino.head.ast.UnaryExpression del = new com.google.javascript.rhino.head.ast.UnaryExpression();
    del.setType(com.google.javascript.rhino.head.Token.DELPROP);
    del.setOperand(new NumberLiteral(0, 1.0));
    root.addChild(new com.google.javascript.rhino.head.ast.ExpressionStatement(del));

    com.google.javascript.rhino.head.ast.UnaryExpression inc = new com.google.javascript.rhino.head.ast.UnaryExpression();
    inc.setType(com.google.javascript.rhino.head.Token.INC);
    inc.setOperand(new NumberLiteral(0, 1.0));
    root.addChild(new com.google.javascript.rhino.head.ast.ExpressionStatement(inc));

    IRFactory.transformTree(root, null, "delete 1; ++1;", es5Config, errorReporter);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_es5StrictReservedWordIdentifier() {
    AstRoot root = new AstRoot();
    root.addChild(new com.google.javascript.rhino.head.ast.ExpressionStatement(new Name(0, "let")));

    IRFactory.transformTree(root, null, "let", es5StrictConfig, errorReporter);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_destructuringReporting() {
    AstRoot root = new AstRoot();
    com.google.javascript.rhino.head.ast.ArrayLiteral arr = new com.google.javascript.rhino.head.ast.ArrayLiteral();
    arr.setIsDestructuring(true);
    root.addChild(new com.google.javascript.rhino.head.ast.ExpressionStatement(arr));

    com.google.javascript.rhino.head.ast.ObjectLiteral obj = new com.google.javascript.rhino.head.ast.ObjectLiteral();
    obj.setIsDestructuring(true);
    root.addChild(new com.google.javascript.rhino.head.ast.ExpressionStatement(obj));

    IRFactory.transformTree(root, null, "[] = []; ({}) = {};", es5Config, errorReporter);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_ideModeLengthSet() {
    Config ideConfig = new Config(
        Collections.<String>emptySet(),
        Collections.<String>emptySet(),
        true,
        LanguageMode.ECMASCRIPT5,
        true);
    String js = "var x = 123;";
    Node node = parseAndTransform(js, ideConfig);
    Assert.assertNotNull(node);
    Assert.assertTrue(node.getFirstChild().getLength() >= 0);
  }

  @Test
  public void testTransformTree_unsupportedSyntaxNode() {
    AstRoot root = new AstRoot();
    KeywordLiteral illegal = new KeywordLiteral();
    illegal.setType(com.google.javascript.rhino.head.Token.YIELD);
    root.addChild(new com.google.javascript.rhino.head.ast.ExpressionStatement(illegal));

    IRFactory.transformTree(root, null, "yield", es5Config, errorReporter);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_getterSetterParamChecks() {
    AstRoot root = new AstRoot();
    ObjectLiteral obj = new ObjectLiteral();

    // Invalid getter with a param
    ObjectProperty getProp = new ObjectProperty();
    getProp.setType(com.google.javascript.rhino.head.Token.GET);
    getProp.setLeft(new Name(0, "g"));
    com.google.javascript.rhino.head.ast.FunctionNode getFn = new com.google.javascript.rhino.head.ast.FunctionNode();
    getFn.addParam(new Name(0, "param"));
    getFn.setBody(new com.google.javascript.rhino.head.ast.Block());
    getProp.setRight(getFn);
    obj.addElement(getProp);

    // Invalid setter with 0 params
    ObjectProperty setProp = new ObjectProperty();
    setProp.setType(com.google.javascript.rhino.head.Token.SET);
    setProp.setLeft(new Name(0, "s"));
    com.google.javascript.rhino.head.ast.FunctionNode setFn = new com.google.javascript.rhino.head.ast.FunctionNode();
    setFn.setBody(new com.google.javascript.rhino.head.ast.Block());
    setProp.setRight(setFn);
    obj.addElement(setProp);

    root.addChild(new com.google.javascript.rhino.head.ast.ExpressionStatement(obj));

    IRFactory.transformTree(root, null, "", es5Config, errorReporter);
    Assert.assertTrue(errorReporter.hasErrors());
  }

  @Test
  public void testTransformTree_commentsAttachedToFileOverview() {
    AstRoot root = new AstRoot();
    Comment comment = new Comment(0, 10, CommentType.JSDOC, "/** @fileoverview Test overview */");
    root.addComment(comment);
    Comment blockComment = new Comment(15, 10, CommentType.BLOCK_COMMENT, "/* @warning text */");
    root.addComment(blockComment);

    Node node = IRFactory.transformTree(root, null, "/** @fileoverview Test overview */\n/* @warning text */", es5Config, errorReporter);
    Assert.assertNotNull(node);
    Assert.assertNotNull(node.getJSDocInfo());
    Assert.assertTrue(errorReporter.hasWarnings());
  }
}
