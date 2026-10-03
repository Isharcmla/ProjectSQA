package com.google.javascript.jscomp.parsing;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ast.Comment;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Set;

public class JsDocInfoParserTest {

  private static final Set<String> DEFAULT_SUPPRESSIONS = Sets.newHashSet(
      "checkTypes", "visibility", "deprecated", "accessControls", "missingProperties");

  private JsDocInfoParser createParser(String jsdoc, boolean parseDocumentation) {
    Config config = new Config(
        Sets.<String>newHashSet(),
        DEFAULT_SUPPRESSIONS,
        parseDocumentation,
        LanguageMode.ECMASCRIPT3,
        false);
    JsDocTokenStream stream = new JsDocTokenStream(jsdoc);
    Comment comment = new Comment(0, jsdoc.length(), Comment.CommentType.JSDOC, jsdoc);
    return new JsDocInfoParser(
        stream,
        comment,
        null,
        config,
        NullErrorReporter.forNewRhino());
  }

  private JsDocInfoParser createParser(String jsdoc) {
    return createParser(jsdoc, true);
  }

  private JSDocInfo parseSuccessfully(String jsdoc) {
    JsDocInfoParser parser = createParser(jsdoc);
    boolean result = parser.parse();
    Assert.assertTrue("Expected parsing to succeed for: " + jsdoc, result);
    return parser.retrieveAndResetParsedJSDocInfo();
  }

  @Test
  public void testParseTypeString_primitives() {
    Node node = JsDocInfoParser.parseTypeString("number");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.STRING, node.getType());
    Assert.assertEquals("number", node.getString());

    Assert.assertNotNull(JsDocInfoParser.parseTypeString("string"));
    Assert.assertNotNull(JsDocInfoParser.parseTypeString("boolean"));
    Assert.assertNotNull(JsDocInfoParser.parseTypeString("null"));
    Assert.assertNotNull(JsDocInfoParser.parseTypeString("undefined"));
    Assert.assertNotNull(JsDocInfoParser.parseTypeString("*"));
  }

  @Test
  public void testParseTypeString_nullableAndModifiers() {
    Node qmark = JsDocInfoParser.parseTypeString("?");
    Assert.assertNotNull(qmark);
    Assert.assertEquals(Token.QMARK, qmark.getType());

    Node nullable = JsDocInfoParser.parseTypeString("?number");
    Assert.assertNotNull(nullable);
    Assert.assertEquals(Token.QMARK, nullable.getType());

    Node nonNullable = JsDocInfoParser.parseTypeString("!number");
    Assert.assertNotNull(nonNullable);
    Assert.assertEquals(Token.BANG, nonNullable.getType());

    Node postNullable = JsDocInfoParser.parseTypeString("number?");
    Assert.assertNotNull(postNullable);
    Assert.assertEquals(Token.QMARK, postNullable.getType());

    Node postNonNullable = JsDocInfoParser.parseTypeString("number!");
    Assert.assertNotNull(postNonNullable);
    Assert.assertEquals(Token.BANG, postNonNullable.getType());
  }

  @Test
  public void testParseTypeString_unionAndPipes() {
    Node union1 = JsDocInfoParser.parseTypeString("(number|string)");
    Assert.assertNotNull(union1);
    Assert.assertEquals(Token.PIPE, union1.getType());

    Node union2 = JsDocInfoParser.parseTypeString("number|string");
    Assert.assertNotNull(union2);
    Assert.assertEquals(Token.PIPE, union2.getType());

    Node unionDoublePipe = JsDocInfoParser.parseTypeString("number||string");
    Assert.assertNotNull(unionDoublePipe);

    Node unionComma = JsDocInfoParser.parseTypeString("(number,string)");
    Assert.assertNotNull(unionComma);
  }

  @Test
  public void testParseTypeString_recordAndArray() {
    Node record = JsDocInfoParser.parseTypeString("{a: number, b: string}");
    Assert.assertNotNull(record);
    Assert.assertEquals(Token.LC, record.getType());

    Node recordSimple = JsDocInfoParser.parseTypeString("{a, b}");
    Assert.assertNotNull(recordSimple);

    Node array = JsDocInfoParser.parseTypeString("[number, string]");
    Assert.assertNotNull(array);
    Assert.assertEquals(Token.LB, array.getType());

    Node varArgsArray = JsDocInfoParser.parseTypeString("[...number]");
    Assert.assertNotNull(varArgsArray);
  }

  @Test
  public void testParseTypeString_functionTypes() {
    Node fn1 = JsDocInfoParser.parseTypeString("function(): void");
    Assert.assertNotNull(fn1);
    Assert.assertEquals(Token.FUNCTION, fn1.getType());

    Node fn2 = JsDocInfoParser.parseTypeString("function(this:Object, number): boolean");
    Assert.assertNotNull(fn2);

    Node fn3 = JsDocInfoParser.parseTypeString("function(new:Array, ...[number]): number");
    Assert.assertNotNull(fn3);

    Node fn4 = JsDocInfoParser.parseTypeString("function(number=, ...): ?");
    Assert.assertNotNull(fn4);

    Node fn5 = JsDocInfoParser.parseTypeString("function()");
    Assert.assertNotNull(fn5);
  }

  @Test
  public void testParseTypeString_typeApplication() {
    Node app = JsDocInfoParser.parseTypeString("Array.<string>");
    Assert.assertNotNull(app);
    Assert.assertEquals(Token.STRING, app.getType());
    Assert.assertEquals("Array", app.getString());

    Node mapApp = JsDocInfoParser.parseTypeString("Object.<string, number>");
    Assert.assertNotNull(mapApp);
  }

  @Test
  public void testParseTypeString_invalidSyntax() {
    Assert.assertNull(JsDocInfoParser.parseTypeString(""));
    Assert.assertNull(JsDocInfoParser.parseTypeString("{a:"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("Array.<string"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("function(this)"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("(number"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("[number"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("function(.."));
  }

  @Test
  public void testParseInlineTypeDoc() {
    JsDocInfoParser parser1 = createParser("/** number */");
    JSDocInfo info1 = parser1.parseInlineTypeDoc();
    Assert.assertNotNull(info1);
    Assert.assertNotNull(info1.getType());

    JsDocInfoParser parser2 = createParser("/** {string} */");
    JSDocInfo info2 = parser2.parseInlineTypeDoc();
    Assert.assertNotNull(info2);
    Assert.assertNotNull(info2.getType());

    JsDocInfoParser parser3 = createParser("/** ? */");
    JSDocInfo info3 = parser3.parseInlineTypeDoc();
    Assert.assertNotNull(info3);

    JsDocInfoParser parserInvalid = createParser("/** @invalid */");
    JSDocInfo infoInvalid = parserInvalid.parseInlineTypeDoc();
    Assert.assertNull(infoInvalid);
  }

  @Test
  public void testParse_simpleAnnotations() {
    String jsdoc = "/**\n"
        + " * @constructor\n"
        + " * @struct\n"
        + " * @export\n"
        + " * @expose\n"
        + " * @externs\n"
        + " * @javadispatch\n"
        + " * @hidden\n"
        + " * @noalias\n"
        + " * @nocompile\n"
        + " * @nocheck\n"
        + " * @override\n"
        + " * @preservertry\n"
        + " * @noshadow\n"
        + " * @nosideeffects\n"
        + " * @implicitcast\n"
        + " * @consistentIdGenerator\n"
        + " * @stableIdGenerator\n"
        + " * @wizaction\n"
        + " * @ngInject\n"
        + " * @jaggerInject\n"
        + " * @jaggerModule\n"
        + " * @jaggerProvide\n"
        + " */";
    JSDocInfo info = parseSuccessfully(jsdoc);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isConstructor());
    Assert.assertTrue(info.makesDictsCreated());
    Assert.assertTrue(info.isExport());
    Assert.assertTrue(info.isExpose());
    Assert.assertTrue(info.isExterns());
    Assert.assertTrue(info.isJavaDispatch());
    Assert.assertTrue(info.isHidden());
    Assert.assertTrue(info.isNoAlias());
    Assert.assertTrue(info.isNoCompile());
    Assert.assertTrue(info.isNoTypeCheck());
    Assert.assertTrue(info.isOverride());
    Assert.assertTrue(info.isPreserveTry());
    Assert.assertTrue(info.isNoShadow());
    Assert.assertTrue(info.isNoSideEffects());
    Assert.assertTrue(info.isImplicitCast());
    Assert.assertTrue(info.isConsistentIdGenerator());
    Assert.assertTrue(info.isStableIdGenerator());
    Assert.assertTrue(info.isWizaction());
    Assert.assertTrue(info.isNgInject());
    Assert.assertTrue(info.isJaggerInject());
    Assert.assertTrue(info.isJaggerModule());
    Assert.assertTrue(info.isJaggerProvide());
  }

  @Test
  public void testParse_interfaceAndDict() {
    String jsdoc = "/**\n"
        + " * @interface\n"
        + " * @dict\n"
        + " */";
    JSDocInfo info = parseSuccessfully(jsdoc);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isInterface());
    Assert.assertTrue(info.makesDictsCreated());
  }

  @Test
  public void testParse_authorAndDescription() {
    String jsdoc = "/**\n"
        + " * Leading block description.\n"
        + " * @author Jane Doe\n"
        + " * @desc A sample description\n"
        + " * @meaning Some meaning\n"
        + " * @version 1.0.0\n"
        + " * @see http://example.com\n"
        + " */";
    JSDocInfo info = parseSuccessfully(jsdoc);
    Assert.assertNotNull(info);
    Assert.assertEquals("Leading block description.", info.getBlockDescription());
    Assert.assertTrue(info.getAuthors().contains("Jane Doe"));
    Assert.assertEquals("A sample description", info.getDescription());
    Assert.assertEquals("Some meaning", info.getMeaning());
    Assert.assertEquals("1.0.0", info.getVersion());
    Assert.assertTrue(info.getReferences().contains("http://example.com"));
  }

  @Test
  public void testParse_paramsAndReturns() {
    String jsdoc = "/**\n"
        + " * @param {string} p1 Parameter 1 desc\n"
        + " * @param {[number=]} opt_p2 Optional param\n"
        + " * @param {boolean} p3.subprop Ignored subprop\n"
        + " * @param {...string} var_args Rest args\n"
        + " * @return {number} Return value description\n"
        + " * @throws {Error} When something fails\n"
        + " */";
    JSDocInfo info = parseSuccessfully(jsdoc);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.hasParameter("p1"));
    Assert.assertNotNull(info.getParameterType("p1"));
    Assert.assertEquals("Parameter 1 desc", info.getDescriptionForParameter("p1"));
    Assert.assertTrue(info.hasParameter("opt_p2"));
    Assert.assertTrue(info.hasParameter("var_args"));
    Assert.assertNotNull(info.getReturnType());
    Assert.assertEquals("Return value description", info.getReturnDescription());
    Assert.assertEquals(1, info.getThrows().size());
  }

  @Test
  public void testParse_extendsAndImplements() {
    String jsdoc = "/**\n"
        + " * @extends {BaseClass}\n"
        + " * @implements {InterfaceOne}\n"
        + " * @implements {InterfaceTwo}\n"
        + " */";
    JSDocInfo info = parseSuccessfully(jsdoc);
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getBaseType());
    Assert.assertEquals(2, info.getImplementedInterfaces().size());
  }

  @Test
  public void testParse_interfaceExtendsMultiple() {
    String jsdoc = "/**\n"
        + " * @interface\n"
        + " * @extends {SuperInterface1}\n"
        + " * @extends {SuperInterface2}\n"
        + " */";
    JSDocInfo info = parseSuccessfully(jsdoc);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isInterface());
    Assert.assertEquals(2, info.getExtendedInterfaces().size());
  }

  @Test
  public void testParse_visibilityAndConstAndDefine() {
    String jsdocPrivate = "/** @private {string} */";
    JSDocInfo infoPrivate = parseSuccessfully(jsdocPrivate);
    Assert.assertEquals(Visibility.PRIVATE, infoPrivate.getVisibility());
    Assert.assertNotNull(infoPrivate.getType());

    String jsdocProtected = "/** @protected */";
    JSDocInfo infoProtected = parseSuccessfully(jsdocProtected);
    Assert.assertEquals(Visibility.PROTECTED, infoProtected.getVisibility());

    String jsdocPublic = "/** @public */";
    JSDocInfo infoPublic = parseSuccessfully(jsdocPublic);
    Assert.assertEquals(Visibility.PUBLIC, infoPublic.getVisibility());

    String jsdocConst = "/** @const {number} */";
    JSDocInfo infoConst = parseSuccessfully(jsdocConst);
    Assert.assertTrue(infoConst.isConstant());

    String jsdocDefine = "/** @define {boolean} Description */";
    JSDocInfo infoDefine = parseSuccessfully(jsdocDefine);
    Assert.assertTrue(infoDefine.isDefine());
  }

  @Test
  public void testParse_thisAndTypedefAndType() {
    String jsdocThis = "/** @this {Object} */";
    JSDocInfo infoThis = parseSuccessfully(jsdocThis);
    Assert.assertNotNull(infoThis.getThisType());

    String jsdocTypedef = "/** @typedef {number|string} */";
    JSDocInfo infoTypedef = parseSuccessfully(jsdocTypedef);
    Assert.assertNotNull(infoTypedef.getTypedefType());

    String jsdocType = "/** @type {Array.<string>} */";
    JSDocInfo infoType = parseSuccessfully(jsdocType);
    Assert.assertNotNull(infoType.getType());
  }

  @Test
  public void testParse_enumAndLends() {
    String jsdocEnum = "/** @enum {string} */";
    JSDocInfo infoEnum = parseSuccessfully(jsdocEnum);
    Assert.assertNotNull(infoEnum.getEnumParameterType());

    String jsdocEnumDefault = "/** @enum */";
    JSDocInfo infoEnumDefault = parseSuccessfully(jsdocEnumDefault);
    Assert.assertNotNull(infoEnumDefault.getEnumParameterType());

    String jsdocLends = "/** @lends {MyClass.prototype} */";
    JSDocInfo infoLends = parseSuccessfully(jsdocLends);
    Assert.assertEquals("MyClass.prototype", infoLends.getLendsName());
  }

  @Test
  public void testParse_modifiesAndSuppress() {
    String jsdoc = "/**\n"
        + " * @param {Object} a\n"
        + " * @modifies {this|arguments|a}\n"
        + " * @suppress {checkTypes|deprecated}\n"
        + " */";
    JSDocInfo info = parseSuccessfully(jsdoc);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.getModifies().contains("this"));
    Assert.assertTrue(info.getModifies().contains("arguments"));
    Assert.assertTrue(info.getModifies().contains("a"));
    Assert.assertTrue(info.getSuppressions().contains("checkTypes"));
    Assert.assertTrue(info.getSuppressions().contains("deprecated"));
  }

  @Test
  public void testParse_idGeneratorTags() {
    String jsdoc1 = "/** @idgenerator */";
    JSDocInfo info1 = parseSuccessfully(jsdoc1);
    Assert.assertTrue(info1.isIdGenerator());

    String jsdoc2 = "/** @idgenerator {consistent} */";
    JSDocInfo info2 = parseSuccessfully(jsdoc2);
    Assert.assertTrue(info2.isConsistentIdGenerator());

    String jsdoc3 = "/** @idgenerator {stable} */";
    JSDocInfo info3 = parseSuccessfully(jsdoc3);
    Assert.assertTrue(info3.isStableIdGenerator());

    String jsdoc4 = "/** @idgenerator {mapped} */";
    JSDocInfo info4 = parseSuccessfully(jsdoc4);
    Assert.assertTrue(info4.isMappedIdGenerator());
  }

  @Test
  public void testParse_templateAndDisposes() {
    String jsdoc = "/**\n"
        + " * @template T, U\n"
        + " * @disposes {a, b}\n"
        + " */";
    JSDocInfo info = parseSuccessfully(jsdoc);
    Assert.assertNotNull(info);
    Assert.assertEquals(2, info.getTemplateTypeNames().size());
    Assert.assertEquals("T", info.getTemplateTypeNames().get(0));
    Assert.assertEquals("U", info.getTemplateTypeNames().get(1));
  }

  @Test
  public void testParse_fileOverviewAndPreserve() {
    String jsdoc = "/**\n"
        + " * @fileoverview File overview documentation.\n"
        + " * @preserve Copyright 2023\n"
        + " * @license Apache 2.0\n"
        + " */";
    JsDocInfoParser parser = createParser(jsdoc);
    Node.FileLevelJsDocBuilder fileLevelBuilder = new Node.FileLevelJsDocBuilder();
    parser.setFileLevelJsDocBuilder(fileLevelBuilder);
    boolean result = parser.parse();
    Assert.assertTrue(result);
    JSDocInfo overview = parser.getFileOverviewJSDocInfo();
    Assert.assertNotNull(overview);
    Assert.assertEquals("File overview documentation.", overview.getFileOverview());
  }

  @Test
  public void testParse_setFileOverviewJSDocInfo() {
    JsDocInfoParser parser = createParser("/** @fileoverview First */");
    parser.parse();
    JSDocInfo firstOverview = parser.getFileOverviewJSDocInfo();

    JsDocInfoParser parser2 = createParser("/** @fileoverview Second */");
    parser2.setFileOverviewJSDocInfo(firstOverview);
    Assert.assertEquals(firstOverview, parser2.getFileOverviewJSDocInfo());
  }

  @Test
  public void testParse_duplicateAndIncompatibleWarningsHandledGracefully() {
    String jsdoc = "/**\n"
        + " * @constructor\n"
        + " * @interface\n"
        + " * @const\n"
        + " * @const\n"
        + " * @desc First\n"
        + " * @desc Second\n"
        + " * @ngInject\n"
        + " * @ngInject\n"
        + " * @version 1\n"
        + " * @version 2\n"
        + " * @author\n"
        + " * @see\n"
        + " * @template\n"
        + " * @disposes\n"
        + " * @param\n"
        + " * @param {string} a\n"
        + " * @param {number} a\n"
        + " * @suppress {unknown_suppress}\n"
        + " * @modifies {unknown_param}\n"
        + " * @idgenerator {unknown_idgen}\n"
        + " * @badtag\n"
        + " */";
    JsDocInfoParser parser = createParser(jsdoc);
    boolean result = parser.parse();
    Assert.assertTrue(result);
  }

  @Test
  public void testParse_withoutDocumentationParsing() {
    String jsdoc = "/**\n"
        + " * Some block description\n"
        + " * @author Jane\n"
        + " * @see http://example.com\n"
        + " * @fileoverview File overview\n"
        + " * @return {number} Desc\n"
        + " * @param {string} x Param desc\n"
        + " */";
    JsDocInfoParser parser = createParser(jsdoc, false);
    boolean result = parser.parse();
    Assert.assertTrue(result);
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.getAuthors().isEmpty());
    Assert.assertTrue(info.getReferences().isEmpty());
    Assert.assertNull(info.getDescriptionForParameter("x"));
  }

  @Test
  public void testParseAndRecordTypeNode_and_createJSTypeExpression() {
    JsDocInfoParser parser = createParser("/** {number} */");
    Node typeNode = parser.parseAndRecordTypeNode(JsDocToken.LC);
    Assert.assertNotNull(typeNode);

    JSTypeExpression expr = parser.createJSTypeExpression(typeNode);
    Assert.assertNotNull(expr);

    Assert.assertNull(parser.createJSTypeExpression(null));
  }

  @Test
  public void testHasParsedJSDocInfo() {
    JsDocInfoParser parser = createParser("/** @const */");
    Assert.assertFalse(parser.hasParsedJSDocInfo());
    parser.parse();
    Assert.assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_unexpectedEOF() {
    Config config = new Config(
        Sets.<String>newHashSet(),
        DEFAULT_SUPPRESSIONS,
        true,
        LanguageMode.ECMASCRIPT3,
        false);
    JsDocTokenStream stream = new JsDocTokenStream("@type {number");
    JsDocInfoParser parser = new JsDocInfoParser(
        stream,
        null,
        null,
        config,
        NullErrorReporter.forNewRhino());
    boolean result = parser.parse();
    Assert.assertFalse(result);
  }
}
