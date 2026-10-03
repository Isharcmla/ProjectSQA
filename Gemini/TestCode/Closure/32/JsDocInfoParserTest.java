package com.google.javascript.jscomp.parsing;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ast.Comment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class JsDocInfoParserTest {

  private static class TestErrorReporter implements ErrorReporter {
    private final List<String> warnings = new ArrayList<String>();
    private final List<String> errors = new ArrayList<String>();

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
      return new EvaluatorException(message);
    }

    public boolean hasWarnings() {
      return !warnings.isEmpty();
    }

    public boolean hasErrors() {
      return !errors.isEmpty();
    }
  }

  private TestErrorReporter errorReporter;
  private Set<String> extraAnnotations;
  private Set<String> extraSuppressions;

  @Before
  public void setUp() {
    errorReporter = new TestErrorReporter();
    extraAnnotations = Sets.newHashSet();
    extraSuppressions = Sets.newHashSet("checkVars", "duplicate");
  }

  private Config createConfig(boolean parseDocumentation) {
    return new Config(
        extraAnnotations,
        extraSuppressions,
        parseDocumentation,
        LanguageMode.ECMASCRIPT5,
        false);
  }

  private JsDocInfoParser createParser(String comment, boolean parseDocumentation) {
    JsDocTokenStream stream = new JsDocTokenStream(comment);
    Comment commentNode = new Comment(0, comment.length(), Comment.CommentType.JSDOC, comment);
    Node script = IR.script();
    return new JsDocInfoParser(
        stream,
        commentNode,
        script,
        createConfig(parseDocumentation),
        errorReporter);
  }

  private JSDocInfo parse(String comment) {
    return parse(comment, true);
  }

  private JSDocInfo parse(String comment, boolean parseDocumentation) {
    JsDocInfoParser parser = createParser(comment, parseDocumentation);
    boolean success = parser.parse();
    Assert.assertTrue("Parser should succeed", success);
    return parser.retrieveAndResetParsedJSDocInfo();
  }

  @Test
  public void testParseTypeString_primitiveTypes() {
    Node node = JsDocInfoParser.parseTypeString("number");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.NAME, node.getType());
    Assert.assertEquals("number", node.getString());

    node = JsDocInfoParser.parseTypeString("string");
    Assert.assertNotNull(node);
    Assert.assertEquals("string", node.getString());

    node = JsDocInfoParser.parseTypeString("boolean");
    Assert.assertNotNull(node);
    Assert.assertEquals("boolean", node.getString());

    node = JsDocInfoParser.parseTypeString("null");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.NAME, node.getType());
    Assert.assertEquals("null", node.getString());

    node = JsDocInfoParser.parseTypeString("undefined");
    Assert.assertNotNull(node);
    Assert.assertEquals("undefined", node.getString());

    node = JsDocInfoParser.parseTypeString("*");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.STAR, node.getType());
  }

  @Test
  public void testParseTypeString_unionsAndModifiers() {
    Node node = JsDocInfoParser.parseTypeString("number|string");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.PIPE, node.getType());

    node = JsDocInfoParser.parseTypeString("(number|string|boolean)");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.PIPE, node.getType());

    node = JsDocInfoParser.parseTypeString("?number");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.QMARK, node.getType());

    node = JsDocInfoParser.parseTypeString("!number");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.BANG, node.getType());

    node = JsDocInfoParser.parseTypeString("number?");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.QMARK, node.getType());

    node = JsDocInfoParser.parseTypeString("number!");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.BANG, node.getType());

    node = JsDocInfoParser.parseTypeString("?");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.QMARK, node.getType());
  }

  @Test
  public void testParseTypeString_typeApplication() {
    Node node = JsDocInfoParser.parseTypeString("Array.<string>");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.NAME, node.getType());
    Assert.assertEquals("Array", node.getString());
    Assert.assertTrue(node.hasChildren());

    node = JsDocInfoParser.parseTypeString("Object.<string, number>");
    Assert.assertNotNull(node);
    Assert.assertEquals("Object", node.getString());
  }

  @Test
  public void testParseTypeString_functionTypes() {
    Node node = JsDocInfoParser.parseTypeString("function(string, number): boolean");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.FUNCTION, node.getType());

    node = JsDocInfoParser.parseTypeString("function(this:Object, ...[number]): void");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.FUNCTION, node.getType());

    node = JsDocInfoParser.parseTypeString("function(new:Date): void");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.FUNCTION, node.getType());

    node = JsDocInfoParser.parseTypeString("function(string=): void");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.FUNCTION, node.getType());

    node = JsDocInfoParser.parseTypeString("function(): void");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.FUNCTION, node.getType());

    node = JsDocInfoParser.parseTypeString("function(...)");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.FUNCTION, node.getType());
  }

  @Test
  public void testParseTypeString_recordAndArrayTypes() {
    Node node = JsDocInfoParser.parseTypeString("{a: string, b: number}");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.LC, node.getType());

    node = JsDocInfoParser.parseTypeString("{a, b}");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.LC, node.getType());

    node = JsDocInfoParser.parseTypeString("[string, number]");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.LB, node.getType());

    node = JsDocInfoParser.parseTypeString("[...string]");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.LB, node.getType());
  }

  @Test
  public void testParseTypeString_invalidSyntax() {
    Assert.assertNull(JsDocInfoParser.parseTypeString("{"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("("));
    Assert.assertNull(JsDocInfoParser.parseTypeString("function("));
    Assert.assertNull(JsDocInfoParser.parseTypeString("Array.<"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("]"));
    Assert.assertNull(JsDocInfoParser.parseTypeString("}"));
  }

  @Test
  public void testParse_authorAndBlockDescription() {
    String comment = "/**\n * A class description.\n * @author John Doe\n */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertEquals("A class description.", info.getBlockDescription());
    Assert.assertEquals(ImmutableSet.of("John Doe"), ImmutableSet.copyOf(info.getAuthors()));
  }

  @Test
  public void testParse_authorWithoutDocumentationParsing() {
    String comment = "/** @author John Doe */";
    JSDocInfo info = parse(comment, false);
    Assert.assertNotNull(info);
  }

  @Test
  public void testParse_authorMissing() {
    String comment = "/** @author \n */";
    parse(comment);
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testParse_consistentIdGenerator() {
    String comment = "/** @consistentIdGenerator */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isConsistentIdGenerator());
  }

  @Test
  public void testParse_constAndConstant() {
    String comment = "/** @const */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isConstant());

    comment = "/** @constant */";
    info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isConstant());
  }

  @Test
  public void testParse_constructorAndInterface() {
    String comment = "/** @constructor */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isConstructor());

    comment = "/** @interface */";
    info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isInterface());
  }

  @Test
  public void testParse_constructorAndInterfaceConflict() {
    String comment = "/** @constructor\n * @interface */";
    parse(comment);
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testParse_deprecated() {
    String comment = "/** @deprecated Use newMethod instead. */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isDeprecated());
    Assert.assertEquals("Use newMethod instead.", info.getDeprecationReason());
  }

  @Test
  public void testParse_desc() {
    String comment = "/** @desc A description for i18n */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertEquals("A description for i18n", info.getDescription());
  }

  @Test
  public void testParse_duplicateDesc() {
    String comment = "/** @desc First\n * @desc Second */";
    parse(comment);
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testParse_fileOverview() {
    String comment = "/** @fileoverview This is a file description. */";
    JsDocInfoParser parser = createParser(comment, true);
    parser.parse();
    JSDocInfo info = parser.getFileOverviewJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertEquals("This is a file description.", info.getFileOverview());
  }

  @Test
  public void testParse_fileOverviewDuplicate() {
    String comment = "/** @fileoverview First\n * @fileoverview Second */";
    JsDocInfoParser parser = createParser(comment, true);
    parser.setFileOverviewJSDocInfo(new JSDocInfo());
    parser.parse();
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testParse_licenseAndPreserve() {
    String comment = "/** @license MIT License\n * @preserve Copyright 2020 */";
    Node script = IR.script();
    Node.FileLevelJsDocBuilder builder = script.getJsDocBuilderForNode();
    JsDocInfoParser parser = createParser(comment, true);
    parser.setFileLevelJsDocBuilder(builder);
    parser.parse();
    Assert.assertNotNull(script.getJSDocInfo());
  }

  @Test
  public void testParse_enum() {
    String comment = "/** @enum {string} */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.hasEnumParameterType());

    comment = "/** @enum */";
    info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.hasEnumParameterType());
  }

  @Test
  public void testParse_exportExposeExternsJavaDispatch() {
    String comment = "/** @export\n * @expose\n * @externs\n * @javadispatch */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isExport());
    Assert.assertTrue(info.isExpose());
    Assert.assertTrue(info.isExterns());
    Assert.assertTrue(info.isJavaDispatch());
  }

  @Test
  public void testParse_extendsAndImplements() {
    String comment = "/** @constructor\n * @extends {BaseClass}\n * @implements {Interface1}\n * @implements {Interface2} */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getBaseType());
    Assert.assertEquals(2, info.getImplementedInterfaceCount());
  }

  @Test
  public void testParse_interfaceExtendsMultiple() {
    String comment = "/** @interface\n * @extends {InterfaceA}\n * @extends {InterfaceB} */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertEquals(2, info.getExtendedInterfacesCount());
  }

  @Test
  public void testParse_extendsMissingTypeName() {
    String comment = "/** @extends {} */";
    parse(comment);
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testParse_hiddenLendsMeaning() {
    String comment = "/** @hidden\n * @lends {Namespace}\n * @meaning Some special meaning */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isHidden());
    Assert.assertEquals("Namespace", info.getLendsName());
    Assert.assertEquals("Some special meaning", info.getMeaning());
  }

  @Test
  public void testParse_noAliasNoCompileNoTypeCheckOverride() {
    String comment = "/** @noalias\n * @nocompile\n * @nocheck\n * @override */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isNoAlias());
    Assert.assertTrue(info.isNoCompile());
    Assert.assertTrue(info.isNoTypeCheck());
    Assert.assertTrue(info.isOverride());
  }

  @Test
  public void testParse_throws() {
    String comment = "/** @throws {Error} When something goes wrong */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertEquals(1, info.getThrownTypes().size());
  }

  @Test
  public void testParse_param() {
    String comment = "/**\n"
        + " * @param {string} a First param\n"
        + " * @param {number=} [b=1] Optional param\n"
        + " * @param {boolean} opt.c Ignored dot param\n"
        + " */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.hasParameter("a"));
    Assert.assertTrue(info.hasParameter("b"));
    Assert.assertEquals("First param", info.getParameterDescription("a"));
    Assert.assertEquals("Optional param", info.getParameterDescription("b"));
  }

  @Test
  public void testParse_paramMissingName() {
    String comment = "/** @param {string} */";
    parse(comment);
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testParse_paramDuplicate() {
    String comment = "/** @param {string} a\n * @param {number} a */";
    parse(comment);
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testParse_visibility() {
    String comment = "/** @private */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertEquals(Visibility.PRIVATE, info.getVisibility());

    comment = "/** @protected */";
    info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertEquals(Visibility.PROTECTED, info.getVisibility());

    comment = "/** @public */";
    info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertEquals(Visibility.PUBLIC, info.getVisibility());
  }

  @Test
  public void testParse_flagsAndAnnotations() {
    String comment = "/**\n"
        + " * @preserveTry\n"
        + " * @nosideeffects\n"
        + " * @noshadow\n"
        + " * @implicitCast\n"
        + " * @idGenerator\n"
        + " * @version 1.0\n"
        + " * @template T\n"
        + " * @see http://example.com\n"
        + " */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertTrue(info.shouldPreserveTry());
    Assert.assertTrue(info.hasNoSideEffects());
    Assert.assertTrue(info.isNoShadow());
    Assert.assertTrue(info.isImplicitCast());
    Assert.assertTrue(info.isIdGenerator());
    Assert.assertEquals("1.0", info.getVersion());
    Assert.assertEquals(ImmutableSet.of("T"), ImmutableSet.copyOf(info.getTemplateTypeNames()));
    Assert.assertEquals(ImmutableSet.of("http://example.com"), ImmutableSet.copyOf(info.getReferences()));
  }

  @Test
  public void testParse_suppressAndModifies() {
    String comment = "/**\n"
        + " * @param {Object} x\n"
        + " * @suppress {checkVars|duplicate}\n"
        + " * @modifies {this|arguments|x}\n"
        + " */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertEquals(Sets.newHashSet("checkVars", "duplicate"), info.getSuppressions());
    Assert.assertEquals(Sets.newHashSet("this", "arguments", "x"), info.getModifies());
  }

  @Test
  public void testParse_defineReturnThisTypeTypedef() {
    String comment = "/**\n"
        + " * @define {boolean}\n"
        + " * @this {Window}\n"
        + " * @return {number} The count\n"
        + " */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getType());
    Assert.assertNotNull(info.getThisType());
    Assert.assertNotNull(info.getReturnType());
    Assert.assertEquals("The count", info.getReturnDescription());

    comment = "/** @typedef {(string|number)} */";
    info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getTypedefType());

    comment = "/** @type {string} */";
    info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getType());
  }

  @Test
  public void testParse_returnWithoutType() {
    String comment = "/** @return Result description without type */";
    JSDocInfo info = parse(comment);
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getReturnType());
    Assert.assertEquals("Result description without type", info.getReturnDescription());
  }

  @Test
  public void testParse_unknownAnnotation() {
    String comment = "/** @unknownTag */";
    parse(comment);
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testParse_unexpectedEOF() {
    String comment = "/** @param {string";
    JsDocInfoParser parser = createParser(comment, true);
    boolean success = parser.parse();
    Assert.assertFalse(success);
    Assert.assertTrue(errorReporter.hasWarnings());
  }

  @Test
  public void testParse_hasParsedJSDocInfo() {
    JsDocInfoParser parser = createParser("/** @constructor */", true);
    Assert.assertFalse(parser.hasParsedJSDocInfo());
    parser.parse();
    Assert.assertTrue(parser.hasParsedJSDocInfo());
  }
}
