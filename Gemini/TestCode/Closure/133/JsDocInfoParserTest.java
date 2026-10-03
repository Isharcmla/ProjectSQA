package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JsDocInfoParserTest {

  private Set<String> extraAnnotations;
  private Set<String> extraSuppressions;
  private SimpleErrorReporter errorReporter;

  @Before
  public void setUp() {
    extraAnnotations = new HashSet<String>();
    extraSuppressions = new HashSet<String>();
    errorReporter = new SimpleErrorReporter();
  }

  private Config createConfig(boolean parseJsDocDocumentation) {
    Map<String, Annotation> annotations = buildAnnotationMap();
    Set<String> suppressions = new HashSet<String>();
    suppressions.add("duplicate");
    suppressions.add("checkTypes");
    suppressions.addAll(extraSuppressions);

    return new Config(
        annotations.keySet(),
        suppressions,
        parseJsDocDocumentation,
        LanguageMode.ECMASCRIPT5,
        false);
  }

  private Map<String, Annotation> buildAnnotationMap() {
    ImmutableMap.Builder<String, Annotation> builder = ImmutableMap.builder();
    for (Annotation a : Annotation.values()) {
      builder.put(a.toString(), a);
    }
    return builder.build();
  }

  private JsDocInfoParser createParser(String comment, boolean parseJsDocDocumentation) {
    return createParser(comment, parseJsDocDocumentation, null, null);
  }

  private JsDocInfoParser createParser(String comment, boolean parseJsDocDocumentation,
                                       Comment commentNode, Node associatedNode) {
    Config config = createConfig(parseJsDocDocumentation);
    JsDocTokenStream stream = new JsDocTokenStream(comment);
    return new JsDocInfoParser(stream, commentNode, associatedNode, config, errorReporter);
  }

  private JSDocInfo parseSuccessfully(String jsdoc) {
    return parseSuccessfully(jsdoc, true);
  }

  private JSDocInfo parseSuccessfully(String jsdoc, boolean parseDocs) {
    JsDocInfoParser parser = createParser(jsdoc, parseDocs);
    boolean result = parser.parse();
    assertTrue("Parsing should succeed for: " + jsdoc, result);
    return parser.retrieveAndResetParsedJSDocInfo();
  }

  @Test
  public void testParseTypeString_validBasicTypes_returnsNodes() {
    Node node = JsDocInfoParser.parseTypeString("number");
    assertNotNull(node);
    assertEquals(Token.STRING, node.getType());
    assertEquals("number", node.getString());

    node = JsDocInfoParser.parseTypeString("string");
    assertNotNull(node);
    assertEquals("string", node.getString());

    node = JsDocInfoParser.parseTypeString("boolean");
    assertNotNull(node);
    assertEquals("boolean", node.getString());

    node = JsDocInfoParser.parseTypeString("null");
    assertNotNull(node);
    assertEquals("null", node.getString());

    node = JsDocInfoParser.parseTypeString("undefined");
    assertNotNull(node);
    assertEquals("undefined", node.getString());

    node = JsDocInfoParser.parseTypeString("*");
    assertNotNull(node);
    assertEquals(Token.STAR, node.getType());

    node = JsDocInfoParser.parseTypeString("?");
    assertNotNull(node);
    assertEquals(Token.QMARK, node.getType());
  }

  @Test
  public void testParseTypeString_modifiersAndUnions_returnsNodes() {
    Node node = JsDocInfoParser.parseTypeString("!number");
    assertNotNull(node);
    assertEquals(Token.BANG, node.getType());
    assertEquals("number", node.getFirstChild().getString());

    node = JsDocInfoParser.parseTypeString("?number");
    assertNotNull(node);
    assertEquals(Token.QMARK, node.getType());
    assertEquals("number", node.getFirstChild().getString());

    node = JsDocInfoParser.parseTypeString("number?");
    assertNotNull(node);
    assertEquals(Token.QMARK, node.getType());

    node = JsDocInfoParser.parseTypeString("number!");
    assertNotNull(node);
    assertEquals(Token.BANG, node.getType());

    node = JsDocInfoParser.parseTypeString("(number|string)");
    assertNotNull(node);
    assertEquals(Token.PIPE, node.getType());

    node = JsDocInfoParser.parseTypeString("number|string");
    assertNotNull(node);
    assertEquals(Token.PIPE, node.getType());

    node = JsDocInfoParser.parseTypeString("number||string");
    assertNotNull(node);
    assertEquals(Token.PIPE, node.getType());
  }

  @Test
  public void testParseTypeString_complexTypes_returnsNodes() {
    Node node = JsDocInfoParser.parseTypeString("Array.<string>");
    assertNotNull(node);
    assertEquals("Array", node.getString());
    assertNotNull(node.getFirstChild());

    node = JsDocInfoParser.parseTypeString("Object.<string, number>");
    assertNotNull(node);
    assertEquals("Object", node.getString());

    node = JsDocInfoParser.parseTypeString("[number, string, ...boolean]");
    assertNotNull(node);
    assertEquals(Token.LB, node.getType());

    node = JsDocInfoParser.parseTypeString("{foo: number, bar: string, baz}");
    assertNotNull(node);
    assertEquals(Token.LC, node.getType());
  }

  @Test
  public void testParseTypeString_functionTypes_returnsNodes() {
    Node node = JsDocInfoParser.parseTypeString("function(this:Object, string, number=, ...[boolean]): void");
    assertNotNull(node);
    assertEquals(Token.FUNCTION, node.getType());

    node = JsDocInfoParser.parseTypeString("function(new:Object, ...)");
    assertNotNull(node);
    assertEquals(Token.FUNCTION, node.getType());

    node = JsDocInfoParser.parseTypeString("function(): number");
    assertNotNull(node);
    assertEquals(Token.FUNCTION, node.getType());

    node = JsDocInfoParser.parseTypeString("function()");
    assertNotNull(node);
    assertEquals(Token.FUNCTION, node.getType());
  }

  @Test
  public void testParseTypeString_invalidOrEdgeCases_returnsNullOrHandles() {
    Node node = JsDocInfoParser.parseTypeString("");
    assertNull(node);

    node = JsDocInfoParser.parseTypeString("{invalid:");
    assertNull(node);

    node = JsDocInfoParser.parseTypeString("Array.<string");
    assertNull(node);

    node = JsDocInfoParser.parseTypeString("[number, string");
    assertNull(node);

    node = JsDocInfoParser.parseTypeString("(number|string");
    assertNull(node);

    node = JsDocInfoParser.parseTypeString("function(this): void");
    assertNull(node);

    node = JsDocInfoParser.parseTypeString("function(this:Object");
    assertNull(node);

    node = JsDocInfoParser.parseTypeString("function(...[number], string): void");
    assertNull(node);
  }

  @Test
  public void testParseInlineTypeDoc_validAndInvalid() {
    JsDocInfoParser parser = createParser("{number} */", true);
    JSDocInfo info = parser.parseInlineTypeDoc();
    assertNotNull(info);
    assertNotNull(info.getType());

    JsDocInfoParser invalidParser = createParser("{invalid..type} */", true);
    JSDocInfo invalidInfo = invalidParser.parseInlineTypeDoc();
    assertNull(invalidInfo);
  }

  @Test
  public void testParse_emptyAndCommentOnlyDoc() {
    JSDocInfo info = parseSuccessfully("/** */");
    assertNotNull(info);

    info = parseSuccessfully("/** Description text only. \n * line two \n */");
    assertNotNull(info);
    assertEquals("Description text only.\nline two", info.getBlockDescription());

    info = parseSuccessfully("/** Description text */", false);
    assertNotNull(info);
    assertEquals("", info.getBlockDescription());
  }

  @Test
  public void testParse_allBooleanAndFlagAnnotations() {
    String comment = "/**\n"
        + " * @ngInject\n"
        + " * @consistentIdGenerator\n"
        + " * @struct\n"
        + " * @dict\n"
        + " * @constructor\n"
        + " * @export\n"
        + " * @expose\n"
        + " * @externs\n"
        + " * @javaDispatch\n"
        + " * @noalias\n"
        + " * @nocompile\n"
        + " * @nocheck\n"
        + " * @nosideeffects\n"
        + " * @noshadow\n"
        + " * @preserveTry\n"
        + " * @implicitCast\n"
        + " * @stableIdGenerator\n"
        + " * @idGenerator\n"
        + " * @override\n"
        + " */";
    JSDocInfo info = parseSuccessfully(comment);
    assertNotNull(info);
    assertTrue(info.isNgInject());
    assertTrue(info.isConsistentIdGenerator());
    assertTrue(info.makesStructs());
    assertTrue(info.makesDicts());
    assertTrue(info.isConstructor());
    assertTrue(info.isExport());
    assertTrue(info.isExpose());
    assertTrue(info.isExterns());
    assertTrue(info.isJavaDispatch());
    assertTrue(info.isNoAlias());
    assertTrue(info.isNoCompile());
    assertTrue(info.isNoTypeCheck());
    assertTrue(info.hasNoSideEffects());
    assertTrue(info.isNoShadow());
    assertTrue(info.isPreserveTry());
    assertTrue(info.isImplicitCast());
    assertTrue(info.isStableIdGenerator());
    assertTrue(info.isIdGenerator());
    assertTrue(info.isOverride());
  }

  @Test
  public void testParse_authorAndVersionAndSee() {
    String comment = "/**\n"
        + " * @author John Doe\n"
        + " * @version 1.2.3\n"
        + " * @see http://example.com\n"
        + " */";
    JSDocInfo info = parseSuccessfully(comment);
    assertNotNull(info);
    Collection<String> authors = info.getAuthors();
    assertNotNull(authors);
    assertTrue(authors.contains("John Doe"));
    assertEquals("1.2.3", info.getVersion());
    Collection<String> references = info.getReferences();
    assertNotNull(references);
    assertTrue(references.contains("http://example.com"));

    // Documentation parsing disabled branch
    parseSuccessfully(comment, false);
  }

  @Test
  public void testParse_deprecatedDescMeaning() {
    String comment = "/**\n"
        + " * @deprecated Use something else.\n"
        + " * @desc A description.\n"
        + " * @meaning Intended meaning.\n"
        + " */";
    JSDocInfo info = parseSuccessfully(comment);
    assertNotNull(info);
    assertTrue(info.isDeprecated());
    assertEquals("Use something else.", info.getDeprecationReason());
    assertEquals("A description.", info.getDescription());
    assertEquals("Intended meaning.", info.getMeaning());
  }

  @Test
  public void testParse_fileOverviewAndLicenseAndPreserve() {
    String comment = "/**\n"
        + " * @fileoverview File documentation.\n"
        + " * @license Apache License 2.0\n"
        + " * @preserve Do not remove.\n"
        + " */";
    JsDocInfoParser parser = createParser(comment, true);
    final StringBuilder fileLevelJsDoc = new StringBuilder();
    parser.setFileLevelJsDocBuilder(new Node.FileLevelJsDocBuilder() {
      @Override
      public void append(String text) {
        fileLevelJsDoc.append(text);
      }
    });
    assertTrue(parser.parse());
    assertNotNull(parser.getFileOverviewJSDocInfo());
    assertEquals("File documentation.", parser.getFileOverviewJSDocInfo().getFileOverview());
    assertTrue(fileLevelJsDoc.toString().contains("Apache License 2.0"));
    assertTrue(fileLevelJsDoc.toString().contains("Do not remove."));

    // Test with parseDocumentation = false
    JsDocInfoParser parserNoDocs = createParser(comment, false);
    assertTrue(parserNoDocs.parse());
  }

  @Test
  public void testParse_enumAndType() {
    String comment = "/**\n"
        + " * @enum {number}\n"
        + " * @type {string}\n"
        + " */";
    JSDocInfo info = parseSuccessfully(comment);
    assertNotNull(info);
    assertNotNull(info.getEnumParameterType());
    assertNotNull(info.getType());

    String commentDefaultEnum = "/** @enum */";
    JSDocInfo infoDefaultEnum = parseSuccessfully(commentDefaultEnum);
    assertNotNull(infoDefaultEnum);
    assertNotNull(infoDefaultEnum.getEnumParameterType());
  }

  @Test
  public void testParse_extendsAndImplements() {
    String comment = "/**\n"
        + " * @extends {BaseClass}\n"
        + " * @implements {InterfaceOne}\n"
        + " * @implements {InterfaceTwo}\n"
        + " */";
    JSDocInfo info = parseSuccessfully(comment);
    assertNotNull(info);
    assertNotNull(info.getBaseType());
    assertEquals(2, info.getImplementedInterfacesCount());

    String ifaceComment = "/**\n"
        + " * @interface\n"
        + " * @extends {SuperInterface}\n"
        + " */";
    JSDocInfo ifaceInfo = parseSuccessfully(ifaceComment);
    assertNotNull(ifaceInfo);
    assertTrue(ifaceInfo.isInterface());
    assertEquals(1, ifaceInfo.getExtendedInterfacesCount());
  }

  @Test
  public void testParse_lends() {
    String comment = "/**\n"
        + " * @lends {TargetClass.prototype}\n"
        + " */";
    JSDocInfo info = parseSuccessfully(comment);
    assertNotNull(info);
    assertEquals("TargetClass.prototype", info.getLendsName());

    String simpleLends = "/** @lends TargetClass */";
    JSDocInfo simpleInfo = parseSuccessfully(simpleLends);
    assertNotNull(simpleInfo);
    assertEquals("TargetClass", simpleInfo.getLendsName());
  }

  @Test
  public void testParse_paramsAndThrowsAndReturns() {
    String comment = "/**\n"
        + " * @param {string} a First param\n"
        + " * @param {number=} [b=1] Optional param\n"
        + " * @param {boolean} [c] Bracketed optional\n"
        + " * @param ignore.property Ignored\n"
        + " * @throws {Error} When it fails\n"
        + " * @return {boolean} Return description\n"
        + " */";
    JSDocInfo info = parseSuccessfully(comment);
    assertNotNull(info);
    assertEquals(3, info.getParameterCount());
    assertTrue(info.hasParameter("a"));
    assertTrue(info.hasParameter("b"));
    assertTrue(info.hasParameter("c"));
    assertEquals("First param", info.getParameterDescription("a"));
    assertEquals("Optional param", info.getParameterDescription("b"));
    assertEquals("Bracketed optional", info.getParameterDescription("c"));
    assertEquals(1, info.getThrownTypes().size());
    assertNotNull(info.getReturnType());
    assertEquals("Return description", info.getReturnDescription());

    // Test with parseDocumentation = false
    parseSuccessfully(comment, false);
  }

  @Test
  public void testParse_returnsWithoutTypeAndDesc() {
    String comment = "/** @return */";
    JSDocInfo info = parseSuccessfully(comment);
    assertNotNull(info);
    assertNotNull(info.getReturnType());
  }

  @Test
  public void testParse_visibilityAndConstantDefineTypedefThis() {
    String commentPrivate = "/** @private {string} */";
    JSDocInfo infoPrivate = parseSuccessfully(commentPrivate);
    assertNotNull(infoPrivate);
    assertEquals(Visibility.PRIVATE, infoPrivate.getVisibility());
    assertNotNull(infoPrivate.getType());

    String commentProtected = "/** @protected */";
    JSDocInfo infoProtected = parseSuccessfully(commentProtected);
    assertNotNull(infoProtected);
    assertEquals(Visibility.PROTECTED, infoProtected.getVisibility());

    String commentPublic = "/** @public */";
    JSDocInfo infoPublic = parseSuccessfully(commentPublic);
    assertNotNull(infoPublic);
    assertEquals(Visibility.PUBLIC, infoPublic.getVisibility());

    String commentConst = "/** @const {number} */";
    JSDocInfo infoConst = parseSuccessfully(commentConst);
    assertNotNull(infoConst);
    assertTrue(infoConst.isConstant());

    String commentDefine = "/** @define {boolean} */";
    JSDocInfo infoDefine = parseSuccessfully(commentDefine);
    assertNotNull(infoDefine);
    assertTrue(infoDefine.isDefine());

    String commentThis = "/** @this {Object} */";
    JSDocInfo infoThis = parseSuccessfully(commentThis);
    assertNotNull(infoThis);
    assertNotNull(infoThis.getThisType());

    String commentTypedef = "/** @typedef {string|number} */";
    JSDocInfo infoTypedef = parseSuccessfully(commentTypedef);
    assertNotNull(infoTypedef);
    assertNotNull(infoTypedef.getTypedefType());
  }

  @Test
  public void testParse_suppressAndModifies() {
    String comment = "/**\n"
        + " * @suppress {duplicate|checkTypes}\n"
        + " * @modifies {this|arguments}\n"
        + " */";
    JSDocInfo info = parseSuccessfully(comment);
    assertNotNull(info);
    Set<String> suppressions = info.getSuppressions();
    assertTrue(suppressions.contains("duplicate"));
    assertTrue(suppressions.contains("checkTypes"));
    Set<String> modifies = info.getModifies();
    assertTrue(modifies.contains("this"));
    assertTrue(modifies.contains("arguments"));
  }

  @Test
  public void testParse_templateAndClassTemplate() {
    String comment = "/**\n"
        + " * @template T, U\n"
        + " * @classTemplate V, W\n"
        + " */";
    JSDocInfo info = parseSuccessfully(comment);
    assertNotNull(info);
    ImmutableList<String> templates = info.getTemplateTypeNames();
    assertEquals(2, templates.size());
    assertTrue(templates.contains("T"));
    assertTrue(templates.contains("U"));

    ImmutableList<String> classTemplates = info.getClassTemplateTypeNames();
    assertEquals(2, classTemplates.size());
    assertTrue(classTemplates.contains("V"));
    assertTrue(classTemplates.contains("W"));
  }

  @Test
  public void testParse_warningBranchesAndDuplicateAnnotations() {
    String comment = "/**\n"
        + " * @unknownTag\n"
        + " * @ngInject\n"
        + " * @ngInject\n"
        + " * @consistentIdGenerator\n"
        + " * @consistentIdGenerator\n"
        + " * @struct\n"
        + " * @dict\n"
        + " * @constructor\n"
        + " * @interface\n"
        + " * @desc First\n"
        + " * @desc Second\n"
        + " * @fileoverview First\n"
        + " * @fileoverview Second\n"
        + " * @export\n"
        + " * @export\n"
        + " * @author\n"
        + " * @see\n"
        + " * @template\n"
        + " * @classTemplate\n"
        + " * @version\n"
        + " * @version 2.0\n"
        + " * @param {number} a\n"
        + " * @param {number} a\n"
        + " * @suppress {not_closed\n"
        + " * @modifies {not_closed\n"
        + " */";
    JsDocInfoParser parser = createParser(comment, true);
    parser.parse();
    assertTrue(errorReporter.hasEncounteredWarning());
  }

  @Test
  public void testParse_withSourceNodeAndCommentNode() {
    StaticSourceFile sourceFile = new SimpleSourceFile("test.js", false);
    Node script = IR.script();
    script.setStaticSourceFile(sourceFile);
    Comment comment = new Comment(0, 10, null, "/** @type {number} */");

    JsDocInfoParser parser = createParser("/** @type {number} */", true, comment, script);
    parser.setFileOverviewJSDocInfo(new JSDocInfo());
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertNotNull(info);
    assertEquals("/** @type {number} */", info.getOriginalCommentString());
    assertNotNull(parser.getFileOverviewJSDocInfo());
  }

  @Test
  public void testParse_unexpectedEOF_returnsFalse() {
    JsDocInfoParser parser = createParser("/** @type {number", true);
    boolean result = parser.parse();
    assertFalse(result);
    assertTrue(errorReporter.hasEncounteredWarning());
  }
}
