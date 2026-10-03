package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    public com.google.javascript.jscomp.mozilla.rhino.EvaluatorException runtimeError(
        String message, String sourceName, int line, String lineSource, int lineOffset) {
      return new com.google.javascript.jscomp.mozilla.rhino.EvaluatorException(message, sourceName, line, lineSource, lineOffset);
    }
  }

  private Map<String, Annotation> annotationNames;
  private Set<String> suppressionNames;
  private TestErrorReporter errorReporter;

  @Before
  public void setUp() {
    annotationNames = Maps.newHashMap();
    annotationNames.put("author", Annotation.AUTHOR);
    annotationNames.put("const", Annotation.CONSTANT);
    annotationNames.put("constant", Annotation.CONSTANT);
    annotationNames.put("constructor", Annotation.CONSTRUCTOR);
    annotationNames.put("deprecated", Annotation.DEPRECATED);
    annotationNames.put("interface", Annotation.INTERFACE);
    annotationNames.put("desc", Annotation.DESC);
    annotationNames.put("fileoverview", Annotation.FILE_OVERVIEW);
    annotationNames.put("license", Annotation.LICENSE);
    annotationNames.put("preserve", Annotation.PRESERVE);
    annotationNames.put("enum", Annotation.ENUM);
    annotationNames.put("export", Annotation.EXPORT);
    annotationNames.put("externs", Annotation.EXTERNS);
    annotationNames.put("javadispatch", Annotation.JAVA_DISPATCH);
    annotationNames.put("extends", Annotation.EXTENDS);
    annotationNames.put("implements", Annotation.IMPLEMENTS);
    annotationNames.put("hidden", Annotation.HIDDEN);
    annotationNames.put("lends", Annotation.LENDS);
    annotationNames.put("meaning", Annotation.MEANING);
    annotationNames.put("noalias", Annotation.NO_ALIAS);
    annotationNames.put("nocompile", Annotation.NO_COMPILE);
    annotationNames.put("notypecheck", Annotation.NO_TYPE_CHECK);
    annotationNames.put("notimplemented", Annotation.NOT_IMPLEMENTED);
    annotationNames.put("inheritDoc", Annotation.INHERIT_DOC);
    annotationNames.put("override", Annotation.OVERRIDE);
    annotationNames.put("throws", Annotation.THROWS);
    annotationNames.put("param", Annotation.PARAM);
    annotationNames.put("preserveTry", Annotation.PRESERVE_TRY);
    annotationNames.put("private", Annotation.PRIVATE);
    annotationNames.put("protected", Annotation.PROTECTED);
    annotationNames.put("public", Annotation.PUBLIC);
    annotationNames.put("noshadow", Annotation.NO_SHADOW);
    annotationNames.put("nosideeffects", Annotation.NO_SIDE_EFFECTS);
    annotationNames.put("modifies", Annotation.MODIFIES);
    annotationNames.put("implicitCast", Annotation.IMPLICIT_CAST);
    annotationNames.put("see", Annotation.SEE);
    annotationNames.put("suppress", Annotation.SUPPRESS);
    annotationNames.put("template", Annotation.TEMPLATE);
    annotationNames.put("version", Annotation.VERSION);
    annotationNames.put("define", Annotation.DEFINE);
    annotationNames.put("return", Annotation.RETURN);
    annotationNames.put("returns", Annotation.RETURN);
    annotationNames.put("this", Annotation.THIS);
    annotationNames.put("type", Annotation.TYPE);
    annotationNames.put("typedef", Annotation.TYPEDEF);

    suppressionNames = Sets.newHashSet("checkTypes", "accessControls", "unknownDef");
    errorReporter = new TestErrorReporter();
  }

  private Config createConfig(boolean parseDoc) {
    return new Config(annotationNames, suppressionNames, parseDoc, LanguageMode.ECMASCRIPT5, false);
  }

  private JsDocInfoParser createParser(String comment, boolean parseDoc) {
    JsDocTokenStream stream = new JsDocTokenStream(comment);
    Comment commentNode = new Comment(0, comment.length(), Comment.CommentType.JSDOC, comment);
    return new JsDocInfoParser(stream, commentNode, "test.js", createConfig(parseDoc), errorReporter);
  }

  private JsDocInfo parseAndGetInfo(String comment) {
    JsDocInfoParser parser = createParser(comment, true);
    assertTrue(parser.parse());
    return parser.retrieveAndResetParsedJSDocInfo();
  }

  @Test
  public void testParseTypeString_primitivesAndSpecial() {
    assertNotNull(JsDocInfoParser.parseTypeString("number"));
    assertNotNull(JsDocInfoParser.parseTypeString("string"));
    assertNotNull(JsDocInfoParser.parseTypeString("boolean"));
    assertNotNull(JsDocInfoParser.parseTypeString("null"));
    assertNotNull(JsDocInfoParser.parseTypeString("undefined"));
    assertNotNull(JsDocInfoParser.parseTypeString("*"));
    assertNotNull(JsDocInfoParser.parseTypeString("?"));
    assertNotNull(JsDocInfoParser.parseTypeString("?string"));
    assertNotNull(JsDocInfoParser.parseTypeString("!number"));
    assertNotNull(JsDocInfoParser.parseTypeString("boolean?"));
    assertNotNull(JsDocInfoParser.parseTypeString("boolean!"));
  }

  @Test
  public void testParseTypeString_unions() {
    Node union1 = JsDocInfoParser.parseTypeString("(string|number)");
    assertNotNull(union1);
    assertEquals(Token.PIPE, union1.getType());

    Node union2 = JsDocInfoParser.parseTypeString("string|number");
    assertNotNull(union2);
    assertEquals(Token.PIPE, union2.getType());

    Node union3 = JsDocInfoParser.parseTypeString("(string, number)");
    assertNotNull(union3);

    Node union4 = JsDocInfoParser.parseTypeString("string||number");
    assertNotNull(union4);
  }

  @Test
  public void testParseTypeString_typeApplication() {
    Node app = JsDocInfoParser.parseTypeString("Array.<string>");
    assertNotNull(app);
    assertEquals(Token.STRING, app.getType());
    assertEquals("Array", app.getString());

    Node app2 = JsDocInfoParser.parseTypeString("Object.<string, number>");
    assertNotNull(app2);
  }

  @Test
  public void testParseTypeString_recordsAndArrays() {
    Node rec = JsDocInfoParser.parseTypeString("{a: string, b: number}");
    assertNotNull(rec);
    assertEquals(Token.LC, rec.getType());

    Node recFieldOnly = JsDocInfoParser.parseTypeString("{a, b}");
    assertNotNull(recFieldOnly);

    Node arr = JsDocInfoParser.parseTypeString("[string, ...number]");
    assertNotNull(arr);
    assertEquals(Token.LB, arr.getType());
  }

  @Test
  public void testParseTypeString_functions() {
    Node fn1 = JsDocInfoParser.parseTypeString("function(): void");
    assertNotNull(fn1);
    assertEquals(Token.FUNCTION, fn1.getType());

    Node fn2 = JsDocInfoParser.parseTypeString("function(this:Object, new:Date, string, ...[number]): boolean");
    assertNotNull(fn2);

    Node fn3 = JsDocInfoParser.parseTypeString("function(string=): string");
    assertNotNull(fn3);

    Node fn4 = JsDocInfoParser.parseTypeString("function(...)");
    assertNotNull(fn4);
  }

  @Test
  public void testParseTypeString_invalidOrNullInputs() {
    assertNull(JsDocInfoParser.parseTypeString(""));
    assertNull(JsDocInfoParser.parseTypeString("123"));
    assertNull(JsDocInfoParser.parseTypeString("{a:"));
    assertNull(JsDocInfoParser.parseTypeString("Array.<string"));
    assertNull(JsDocInfoParser.parseTypeString("(string|number"));
    assertNull(JsDocInfoParser.parseTypeString("[string,"));
    assertNull(JsDocInfoParser.parseTypeString("function(this)"));
    assertNull(JsDocInfoParser.parseTypeString("function(...[string], number)"));
  }

  @Test
  public void testParse_authorTag() {
    JSDocInfo info = parseAndGetInfo("/** @author John Doe */");
    assertNotNull(info);
    assertTrue(info.getAuthors().contains("John Doe"));

    JsDocInfoParser emptyAuthorParser = createParser("/** @author \n */", true);
    emptyAuthorParser.parse();
    assertFalse(errorReporter.warnings.isEmpty());

    JsDocInfoParser noDocAuthorParser = createParser("/** @author John Doe */", false);
    assertTrue(noDocAuthorParser.parse());
  }

  @Test
  public void testParse_constAndConstructorAndInterface() {
    JSDocInfo info = parseAndGetInfo("/** @const \n @constructor */");
    assertNotNull(info);
    assertTrue(info.isConstant());
    assertTrue(info.isConstructor());

    JsDocInfoParser dupConst = createParser("/** @const \n @const */", true);
    dupConst.parse();
    assertFalse(errorReporter.warnings.isEmpty());

    errorReporter.warnings.clear();
    JsDocInfoParser conflict = createParser("/** @constructor \n @interface */", true);
    conflict.parse();
    assertFalse(errorReporter.warnings.isEmpty());
  }

  @Test
  public void testParse_deprecatedAndDescAndMeaning() {
    JSDocInfo info = parseAndGetInfo("/** @deprecated Use bar instead.\n @desc Description \n @meaning Meaning */");
    assertNotNull(info);
    assertTrue(info.isDeprecated());
    assertEquals("Use bar instead.", info.getDeprecationReason());
    assertEquals("Description", info.getDescription());
    assertEquals("Meaning", info.getMeaning());

    JsDocInfoParser dupDesc = createParser("/** @desc D1 \n @desc D2 */", true);
    dupDesc.parse();
    assertFalse(errorReporter.warnings.isEmpty());
  }

  @Test
  public void testParse_fileoverviewAndLicense() {
    JsDocInfoParser parser = createParser("/** @fileoverview Overview text \n @preserve Preserve text */", true);
    Node scriptNode = new Node(Token.SCRIPT);
    Node.FileLevelJsDocBuilder builder = scriptNode.getJsDocBuilderForNode();
    parser.setFileLevelJsDocBuilder(builder);
    assertTrue(parser.parse());
    assertNotNull(parser.getFileOverviewJSDocInfo());
    assertEquals("Overview text", parser.getFileOverviewJSDocInfo().getFileOverview());

    JsDocInfoParser dupFile = createParser("/** @fileoverview Extra overview */", true);
    dupFile.setFileOverviewJSDocInfo(parser.getFileOverviewJSDocInfo());
    dupFile.parse();
    assertFalse(errorReporter.warnings.isEmpty());
  }

  @Test
  public void testParse_enum() {
    JSDocInfo info1 = parseAndGetInfo("/** @enum {string} */");
    assertNotNull(info1);
    assertNotNull(info1.getEnumParameterType());

    JSDocInfo info2 = parseAndGetInfo("/** @enum */");
    assertNotNull(info2);
    assertNotNull(info2.getEnumParameterType());
  }

  @Test
  public void testParse_exportExternsJavaDispatch() {
    JSDocInfo info = parseAndGetInfo("/** @export \n @externs \n @javadispatch */");
    assertNotNull(info);
    assertTrue(info.isExport());
    assertTrue(info.isJavaDispatch());

    JsDocInfoParser dupExport = createParser("/** @export \n @export */", true);
    dupExport.parse();
    assertFalse(errorReporter.warnings.isEmpty());
  }

  @Test
  public void testParse_extendsAndImplements() {
    JSDocInfo info = parseAndGetInfo("/** @constructor \n @extends {SuperClass} \n @implements {InterfaceA} */");
    assertNotNull(info);
    assertNotNull(info.getBaseType());
    assertEquals(1, info.getImplementedInterfaceCount());

    JSDocInfo infoBraceless = parseAndGetInfo("/** @constructor \n @extends SuperClass \n @implements InterfaceA */");
    assertNotNull(infoBraceless);

    JsDocInfoParser interfaceExtends = createParser("/** @interface \n @extends {InterfaceA} \n @extends {InterfaceB} */", true);
    assertTrue(interfaceExtends.parse());
    JSDocInfo ifaceInfo = interfaceExtends.retrieveAndResetParsedJSDocInfo();
    assertEquals(2, ifaceInfo.getExtendedInterfacesCount());

    JsDocInfoParser invalidExtends = createParser("/** @extends {SuperClass */", true);
    invalidExtends.parse();
    assertFalse(errorReporter.warnings.isEmpty());
  }

  @Test
  public void testParse_lendsAndHidden() {
    JSDocInfo info = parseAndGetInfo("/** @lends {Target} \n @hidden */");
    assertNotNull(info);
    assertEquals("Target", info.getLendsName());
    assertTrue(info.isHidden());

    JsDocInfoParser missingLends = createParser("/** @lends */", true);
    missingLends.parse();
    assertFalse(errorReporter.warnings.isEmpty());
  }

  @Test
  public void testParse_flagsAndDirectives() {
    JSDocInfo info = parseAndGetInfo("/** @noalias \n @nocompile \n @notypecheck \n @notimplemented \n @preserveTry \n @noshadow \n @nosideeffects \n @implicitCast */");
    assertNotNull(info);
    assertTrue(info.isNoAlias());
    assertTrue(info.isNoCompile());
    assertTrue(info.isNoTypeCheck());
    assertTrue(info.shouldPreserveTry());
    assertTrue(info.isNoShadow());
    assertTrue(info.isNoSideEffects());
    assertTrue(info.isImplicitCast());
  }

  @Test
  public void testParse_overrideAndInheritDoc() {
    JSDocInfo info = parseAndGetInfo("/** @override */");
    assertNotNull(info);
    assertTrue(info.isOverride());

    JSDocInfo info2 = parseAndGetInfo("/** @inheritDoc */");
    assertNotNull(info2);
    assertTrue(info2.isOverride());
  }

  @Test
  public void testParse_throws() {
    JSDocInfo info = parseAndGetInfo("/** @throws {Error} When bad things happen. */");
    assertNotNull(info);
    assertEquals(1, info.getThrownTypes().size());

    JSDocInfo infoNoType = parseAndGetInfo("/** @throws When bad things happen. */");
    assertNotNull(infoNoType);
    assertEquals(1, infoNoType.getThrownTypes().size());
  }

  @Test
  public void testParse_params() {
    JSDocInfo info = parseAndGetInfo("/** @param {string} a First param\n @param {number=} [b=1] Optional param\n @param {...*} c Varargs */");
    assertNotNull(info);
    assertTrue(info.hasParameter("a"));
    assertTrue(info.hasParameter("b"));
    assertTrue(info.hasParameter("c"));
    assertEquals("First param", info.getParameterDescription("a"));

    JsDocInfoParser dupParam = createParser("/** @param {string} a \n @param {string} a */", true);
    dupParam.parse();
    assertFalse(errorReporter.warnings.isEmpty());

    JsDocInfoParser dotParam = createParser("/** @param {string} a.b */", true);
    assertTrue(dotParam.parse());

    JsDocInfoParser missingParamName = createParser("/** @param {string} */", true);
    missingParamName.parse();
    assertFalse(errorReporter.warnings.isEmpty());
  }

  @Test
  public void testParse_visibility() {
    JSDocInfo infoPriv = parseAndGetInfo("/** @private */");
    assertEquals(Visibility.PRIVATE, infoPriv.getVisibility());

    JSDocInfo infoProt = parseAndGetInfo("/** @protected */");
    assertEquals(Visibility.PROTECTED, infoProt.getVisibility());

    JSDocInfo infoPub = parseAndGetInfo("/** @public */");
    assertEquals(Visibility.PUBLIC, infoPub.getVisibility());
  }

  @Test
  public void testParse_modifiesAndSuppress() {
    JSDocInfo info = parseAndGetInfo("/** @modifies {this|arguments} \n @suppress {checkTypes|accessControls} */");
    assertNotNull(info);
    assertTrue(info.getModifies().contains("this"));
    assertTrue(info.getModifies().contains("arguments"));
    assertTrue(info.getSuppressions().contains("checkTypes"));
    assertTrue(info.getSuppressions().contains("accessControls"));

    JsDocInfoParser unknownMod = createParser("/** @modifies {unknown} */", true);
    unknownMod.parse();
    assertFalse(errorReporter.warnings.isEmpty());

    errorReporter.warnings.clear();
    JsDocInfoParser unknownSupp = createParser("/** @suppress {nonExistent} */", true);
    unknownSupp.parse();
    assertFalse(errorReporter.warnings.isEmpty());
  }

  @Test
  public void testParse_seeTemplateVersion() {
    JSDocInfo info = parseAndGetInfo("/** @see http://example.com \n @template T \n @version 1.0 */");
    assertNotNull(info);
    assertTrue(info.getReferences().contains("http://example.com"));
    assertTrue(info.getTemplateTypeNames().contains("T"));
    assertEquals("1.0", info.getVersion());

    JsDocInfoParser emptySee = createParser("/** @see \n */", true);
    emptySee.parse();
    assertFalse(errorReporter.warnings.isEmpty());
  }

  @Test
  public void testParse_defineReturnThisTypeTypedef() {
    JSDocInfo info = parseAndGetInfo("/** @define {boolean} \n @return {string} Result description\n @this {Object} \n @type {number} \n @typedef {string|number} */");
    assertNotNull(info);
    assertNotNull(info.getDefineType());
    assertNotNull(info.getReturnType());
    assertEquals("Result description", info.getReturnDescription());
    assertNotNull(info.getThisType());
    assertNotNull(info.getType());
    assertNotNull(info.getTypedefType());

    JSDocInfo infoReturnNoType = parseAndGetInfo("/** @return Some return description without type */");
    assertNotNull(infoReturnNoType);
    assertNotNull(infoReturnNoType.getReturnType());
  }

  @Test
  public void testParse_blockCommentDescriptionAndStarLines() {
    JsDocInfoParser parser = createParser("/**\n * Block comment description\n * on multiple lines.\n * @type {string}\n */", true);
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertEquals("Block comment description\non multiple lines.", info.getBlockDescription());
  }

  @Test
  public void testParse_unknownAnnotation() {
    JsDocInfoParser parser = createParser("/** @unknownTag */", true);
    assertTrue(parser.parse());
    assertFalse(errorReporter.warnings.isEmpty());
  }

  @Test
  public void testParse_unexpectedEof() {
    JsDocTokenStream stream = new JsDocTokenStream("/** @type {string");
    JsDocInfoParser parser = new JsDocInfoParser(stream, null, "test.js", createConfig(true), errorReporter);
    assertFalse(parser.parse());
    assertFalse(errorReporter.warnings.isEmpty());
  }
}
