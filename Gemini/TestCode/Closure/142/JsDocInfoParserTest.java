package com.google.javascript.jscomp.parsing;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.EvaluatorException;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JsDocInfoParserTest {

  private static class TestErrorReporter implements ErrorReporter {
    final List<String> warnings = new ArrayList<String>();
    final List<String> errors = new ArrayList<String>();

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
      return new EvaluatorException(message, sourceName, line, lineSource, lineOffset);
    }

    public boolean hasWarnings() {
      return !warnings.isEmpty();
    }
  }

  private JsDocInfoParser createParser(String comment, TestErrorReporter errorReporter) {
    Config config = new Config(
        new JSTypeRegistry(NullErrorReporter.forOldRhino()),
        Sets.<String>newHashSet(),
        true);
    JsDocTokenStream stream = new JsDocTokenStream(comment);
    return new JsDocInfoParser(stream, "test.js", config, errorReporter);
  }

  private JsDocInfo parseAndGetDocInfo(String comment) {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser(comment, reporter);
    Assert.assertTrue(parser.parse());
    return parser.retrieveAndResetParsedJSDocInfo();
  }

  @Test
  public void testParseTypeString_primitivesAndBasicTypes() {
    Assert.assertNotNull(JsDocInfoParser.parseTypeString("number"));
    Assert.assertNotNull(JsDocInfoParser.parseTypeString("string"));
    Assert.assertNotNull(JsDocInfoParser.parseTypeString("boolean"));
    Assert.assertNotNull(JsDocInfoParser.parseTypeString("null"));
    Assert.assertNotNull(JsDocInfoParser.parseTypeString("undefined"));
    Assert.assertNotNull(JsDocInfoParser.parseTypeString("*"));
  }

  @Test
  public void testParseTypeString_typeModifiers() {
    Node qmarkPre = JsDocInfoParser.parseTypeString("?number");
    Assert.assertNotNull(qmarkPre);
    Assert.assertEquals(Token.QMARK, qmarkPre.getType());

    Node bangPre = JsDocInfoParser.parseTypeString("!number");
    Assert.assertNotNull(bangPre);
    Assert.assertEquals(Token.BANG, bangPre.getType());

    Node qmarkPost = JsDocInfoParser.parseTypeString("number?");
    Assert.assertNotNull(qmarkPost);
    Assert.assertEquals(Token.QMARK, qmarkPost.getType());

    Node bangPost = JsDocInfoParser.parseTypeString("number!");
    Assert.assertNotNull(bangPost);
    Assert.assertEquals(Token.BANG, bangPost.getType());
  }

  @Test
  public void testParseTypeString_unions() {
    Node union1 = JsDocInfoParser.parseTypeString("number|string");
    Assert.assertNotNull(union1);
    Assert.assertEquals(Token.PIPE, union1.getType());

    Node union2 = JsDocInfoParser.parseTypeString("number||string");
    Assert.assertNotNull(union2);
    Assert.assertEquals(Token.PIPE, union2.getType());

    Node unionParen = JsDocInfoParser.parseTypeString("(number|string|boolean)");
    Assert.assertNotNull(unionParen);
    Assert.assertEquals(Token.PIPE, unionParen.getType());

    Node unionComma = JsDocInfoParser.parseTypeString("(number, string)");
    Assert.assertNotNull(unionComma);
    Assert.assertEquals(Token.PIPE, unionComma.getType());
  }

  @Test
  public void testParseTypeString_typeApplication() {
    Node typeApp = JsDocInfoParser.parseTypeString("Array.<string>");
    Assert.assertNotNull(typeApp);
    Assert.assertEquals(Token.STRING, typeApp.getType());
    Assert.assertEquals("Array", typeApp.getString());
    Assert.assertTrue(typeApp.hasChildren());

    Node mapApp = JsDocInfoParser.parseTypeString("Object.<string, number>");
    Assert.assertNotNull(mapApp);
  }

  @Test
  public void testParseTypeString_arrayTypes() {
    Node array1 = JsDocInfoParser.parseTypeString("[number]");
    Assert.assertNotNull(array1);
    Assert.assertEquals(Token.LB, array1.getType());

    Node array2 = JsDocInfoParser.parseTypeString("[number, string]");
    Assert.assertNotNull(array2);

    Node arrayVarArgs = JsDocInfoParser.parseTypeString("[...number]");
    Assert.assertNotNull(arrayVarArgs);
  }

  @Test
  public void testParseTypeString_recordTypes() {
    Node rec1 = JsDocInfoParser.parseTypeString("{a: number, b: string}");
    Assert.assertNotNull(rec1);
    Assert.assertEquals(Token.LC, rec1.getType());

    Node rec2 = JsDocInfoParser.parseTypeString("{a, b}");
    Assert.assertNotNull(rec2);
  }

  @Test
  public void testParseTypeString_functionTypes() {
    Node fn1 = JsDocInfoParser.parseTypeString("function()");
    Assert.assertNotNull(fn1);
    Assert.assertEquals(Token.FUNCTION, fn1.getType());

    Node fn2 = JsDocInfoParser.parseTypeString("function(): void");
    Assert.assertNotNull(fn2);

    Node fn3 = JsDocInfoParser.parseTypeString("function(this:Object, number=, ...[string]): boolean");
    Assert.assertNotNull(fn3);

    Node fn4 = JsDocInfoParser.parseTypeString("function(...)");
    Assert.assertNotNull(fn4);

    Node fn5 = JsDocInfoParser.parseTypeString("function(this:Object)");
    Assert.assertNotNull(fn5);
  }

  @Test
  public void testParseTypeString_invalidSyntaxReturnsNull() {
    Assert.assertNull(JsDocInfoParser.parseTypeString(""));
    Assert.assertNull(JsDocInfoParser.parseTypeString("   "));
    Assert.assertNull(JsDocInfoParser.parseTypeString("[number"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("{a:"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("function("));
    Assert.assertNull(JsDocInfoParser.parseTypeString("(number"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("Array.<string"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("function(this)"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("function(...[number], string)"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("?"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("!"));
  }

  @Test
  public void testParse_blockCommentDescription() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * This is a block description.\n * Second line.\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(parser.hasParsedJSDocInfo());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertEquals("This is a block description.\nSecond line.", info.getBlockDescription());
  }

  @Test
  public void testParse_authorTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @author John Doe\n * @author \n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.getAuthors().contains("John Doe"));
  }

  @Test
  public void testParse_constantTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @const\n * @const\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isConstant());
  }

  @Test
  public void testParse_constructorAndInterfaceTags() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @constructor\n * @interface\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isConstructor());

    reporter = new TestErrorReporter();
    parser = createParser("/**\n * @interface\n * @constructor\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isInterface());
  }

  @Test
  public void testParse_deprecatedTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @deprecated Use newMethod instead.\n * @deprecated Duplicate\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isDeprecated());
    Assert.assertEquals("Use newMethod instead.", info.getDeprecationReason());
  }

  @Test
  public void testParse_descTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @desc Hello world description\n * @desc Duplicate\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertEquals("Hello world description", info.getDescription());
  }

  @Test
  public void testParse_fileoverviewTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @fileoverview File level summary\n * @fileoverview Extra\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo fileInfo = parser.getFileOverviewJSDocInfo();
    Assert.assertNotNull(fileInfo);
    Assert.assertEquals("File level summary", fileInfo.getFileOverview());

    parser.setFileOverviewJSDocInfo(fileInfo);
    Assert.assertEquals(fileInfo, parser.getFileOverviewJSDocInfo());
  }

  @Test
  public void testParse_licenseAndPreserveTags() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @license MIT License\n * @preserve Copyright 2023\n */", reporter);
    Node scriptNode = new Node(Token.SCRIPT);
    Node.FileLevelJsDocBuilder builder = scriptNode.getJsDocBuilderForNode();
    parser.setFileLevelJsDocBuilder(builder);
    Assert.assertTrue(parser.parse());
  }

  @Test
  public void testParse_enumTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @enum {string}\n * @enum {number}\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getEnumParameterType());

    reporter = new TestErrorReporter();
    parser = createParser("/**\n * @enum\n */", reporter);
    Assert.assertTrue(parser.parse());
    info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getEnumParameterType());
  }

  @Test
  public void testParse_simpleFlagAnnotations() {
    String comment = "/**\n"
        + " * @export\n"
        + " * @export\n"
        + " * @externs\n"
        + " * @externs\n"
        + " * @javadispatch\n"
        + " * @javadispatch\n"
        + " * @hidden\n"
        + " * @hidden\n"
        + " * @noalias\n"
        + " * @noalias\n"
        + " * @nocheck\n"
        + " * @nocheck\n"
        + " * @notimplemented\n"
        + " * @override\n"
        + " * @inheritDoc\n"
        + " * @preserveTry\n"
        + " * @preserveTry\n"
        + " * @private\n"
        + " * @private\n"
        + " * @protected\n"
        + " * @protected\n"
        + " * @public\n"
        + " * @public\n"
        + " * @noshadow\n"
        + " * @noshadow\n"
        + " * @nosideeffects\n"
        + " * @nosideeffects\n"
        + " * @implicitcast\n"
        + " * @implicitcast\n"
        + " */";
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser(comment, reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isExport());
    Assert.assertTrue(info.isOverride());
    Assert.assertTrue(info.hasFileOverview());
  }

  @Test
  public void testParse_extendsAndImplementsTags() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @extends {BaseClass}\n * @implements {InterfaceA}\n * @implements {InterfaceA}\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getBaseType());
    Assert.assertEquals(1, info.getImplementedInterfaceCount());

    reporter = new TestErrorReporter();
    parser = createParser("/**\n * @extends BaseClass\n * @implements InterfaceB\n */", reporter);
    Assert.assertTrue(parser.parse());
    info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getBaseType());

    reporter = new TestErrorReporter();
    parser = createParser("/**\n * @extends {BaseClass extra}\n * @implements\n * @extends\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
  }

  @Test
  public void testParse_throwsTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @throws {TypeError} When type is invalid.\n * @throws String error\n * @throws {InvalidType\n */", reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.getThrownTypes().size() >= 1);
  }

  @Test
  public void testParse_paramTag_variations() {
    String comment = "/**\n"
        + " * @param {string} p1 Simple string param\n"
        + " * @param [p2=10] Bracketed param with default\n"
        + " * @param [p3] Optional param without type\n"
        + " * @param {number} [p4] Optional bracketed param with type\n"
        + " * @param {...string} p5 Rest param\n"
        + " * @param {string=} p6 Optional param syntax\n"
        + " * @param {string} p7.subProp Ignored sub-property\n"
        + " * @param {number} p1 Duplicate name warning\n"
        + " * @param [p8 Missing bracket\n"
        + " * @param {InvalidType p9\n"
        + " * @param\n"
        + " */";
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser(comment, reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.hasParameter("p1"));
    Assert.assertTrue(info.hasParameter("p2"));
    Assert.assertEquals("Simple string param", info.getParameterDescription("p1"));
  }

  @Test
  public void testParse_seeTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @see http://example.com\n * @see \n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.getReferences().contains("http://example.com"));
  }

  @Test
  public void testParse_suppressTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @suppress {checkTypes|globalThis}\n * @suppress {checkTypes}\n * @suppress invalid\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.getSuppressions().contains("checkTypes"));
    Assert.assertTrue(info.getSuppressions().contains("globalThis"));
  }

  @Test
  public void testParse_templateTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @template T\n * @template T\n * @template \n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertEquals("T", info.getTemplateTypeName());
  }

  @Test
  public void testParse_versionTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @version 1.0.0\n * @version 2.0.0\n * @version \n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertEquals("1.0.0", info.getVersion());
  }

  @Test
  public void testParse_defineTag() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @define {boolean}\n * @define {boolean}\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getType());

    reporter = new TestErrorReporter();
    parser = createParser("/**\n * @define {Object}\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
  }

  @Test
  public void testParse_returnThisTypeTypedefTags() {
    String comment = "/**\n"
        + " * @return {string} Return value description\n"
        + " * @return {number} Extra return\n"
        + " * @this {Object}\n"
        + " * @this {number}\n"
        + " * @type {string}\n"
        + " * @type {number}\n"
        + " * @typedef {number}\n"
        + " * @typedef {string}\n"
        + " */";
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser(comment, reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getReturnType());
    Assert.assertEquals("Return value description", info.getReturnDescription());
    Assert.assertNotNull(info.getThisType());
    Assert.assertNotNull(info.getType());
    Assert.assertNotNull(info.getTypedefType());
  }

  @Test
  public void testParse_unknownAnnotation() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @unrecognizedAnnotationTag someValue\n */", reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
  }

  @Test
  public void testParse_unexpectedEof() {
    TestErrorReporter reporter = new TestErrorReporter();
    JsDocInfoParser parser = createParser("/**\n * @param {string} name", reporter);
    Assert.assertFalse(parser.parse());
    Assert.assertTrue(reporter.hasWarnings());
  }

  @Test
  public void testParse_emptyOrWhitespaceOnlyComment() {
    JSDocInfo info = parseAndGetDocInfo("/** */");
    Assert.assertNull(info);

    info = parseAndGetDocInfo("/**\n * \n *\n */");
    Assert.assertNull(info);
  }
}
