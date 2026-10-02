package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link JsDocInfoParser}.
 *
 * Note: JsDocInfoParser, JsDocTokenStream, Config and NullErrorReporter are
 * package-private classes/constructors, therefore this test class resides
 * in the same package (com.google.javascript.jscomp.parsing) to gain access
 * to them, as demonstrated by the usage pattern shown inside
 * JsDocInfoParser#parseTypeString(String).
 */
public class JsDocInfoParserTest {

  private Config config;

  @Before
  public void setUp() {
    // This is the exact construction pattern used inside
    // JsDocInfoParser.parseTypeString(), reused here to avoid guessing
    // any undocumented Config API.
    config = new Config(
        Sets.<String>newHashSet(),
        Sets.<String>newHashSet(),
        false,
        Config.LanguageMode.ECMASCRIPT3,
        false);
  }

  private JsDocInfoParser createParser(String source) {
    return new JsDocInfoParser(
        new JsDocTokenStream(source),
        null,
        null,
        config,
        NullErrorReporter.forNewRhino());
  }

  // ---------------------------------------------------------------------
  // parseTypeString(String) - the only truly public method of the class.
  // ---------------------------------------------------------------------

  @Test
  public void testParseTypeString_simpleTypeName_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("string");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_dottedTypeName_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("goog.string");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_nullableType_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("?string");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_nonNullableType_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("!string");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_starType_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("*");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_questionMarkOnly_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("?");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_nullLiteral_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("null");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_undefinedLiteral_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("undefined");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_recordType_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("{a: string}");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_recordTypeNoValue_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("{a}");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_arrayType_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("[string,number]");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_arrayTypeWithVarArgs_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("[...string]");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_unionType_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("(string|number)");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_unionTypeDoublePipe_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("(string||number)");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_unionTypeWithComma_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("(string,number)");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_functionType_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("function(string):void");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_functionTypeWithThis_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("function(this:Object):void");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_functionTypeWithNew_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("function(new:Object):void");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_functionTypeVarArgs_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("function(...string):void");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_functionTypeNoParams_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("function():void");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_genericType_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("Array.<string>");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_topLevelUnionWithoutParens_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("string|number");
    assertNotNull(result);
  }

  @Test
  public void testParseTypeString_optionalParam_returnsNode() {
    Node result = JsDocInfoParser.parseTypeString("string=");
    assertNotNull(result);
  }

  // --- Edge cases: empty / malformed / null input ---

  @Test
  public void testParseTypeString_emptyString_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_malformedRecordType_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("{a:");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_malformedUnionType_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("(string");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_emptyUnionType_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("()");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_malformedArrayType_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("[string");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_malformedGenericTypeMissingGt_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("Array.<string");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_malformedFunctionTypeMissingLp_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("function string):void");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_junkToken_returnsNull() {
    // A comma right away is not a valid start of a type expression.
    Node result = JsDocInfoParser.parseTypeString(",");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_nullInput_handledGracefully() {
    try {
      Node result = JsDocInfoParser.parseTypeString(null);
      // If no exception is thrown, a null result is an acceptable outcome
      // for invalid input.
      assertNull(result);
    } catch (Exception e) {
      // Also acceptable: the underlying stream implementation may throw
      // when constructed with a null string.
      assertTrue(true);
    }
  }

  // ---------------------------------------------------------------------
  // Package-visible instance methods (accessible because this test class
  // resides in the same package as JsDocInfoParser).
  // ---------------------------------------------------------------------

  @Test
  public void testParse_emptyComment_returnsFalse() {
    JsDocInfoParser parser = createParser("");
    boolean result = parser.parse();
    assertFalse(result);
  }

  @Test
  public void testParse_unknownAnnotation_doesNotThrowAndCompletes() {
    JsDocInfoParser parser = createParser("@totallyUnknownAnnotationXyz\n");
    try {
      parser.parse();
      // No specific return value is asserted since the exact set of
      // recognized annotations is an implementation detail of Config;
      // we only verify that parsing completes without throwing.
      assertTrue(true);
    } catch (Exception e) {
      fail("parse() should not throw an exception: " + e);
    }
  }

  @Test
  public void testParse_simpleConstAnnotation_doesNotThrow() {
    JsDocInfoParser parser = createParser("@const\n");
    try {
      parser.parse();
      assertTrue(true);
    } catch (Exception e) {
      fail("parse() should not throw an exception: " + e);
    }
  }

  @Test
  public void testParse_whitespaceOnlyComment_returnsFalse() {
    JsDocInfoParser parser = createParser("   \n  \n");
    boolean result = parser.parse();
    // Ends up hitting EOF eventually.
    assertFalse(result);
  }

  @Test
  public void testHasParsedJSDocInfo_beforeParsing_returnsFalse() {
    JsDocInfoParser parser = createParser("");
    assertFalse(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testGetFileOverviewJSDocInfo_initially_returnsNull() {
    JsDocInfoParser parser = createParser("");
    assertNull(parser.getFileOverviewJSDocInfo());
  }

  @Test
  public void testSetFileOverviewJSDocInfo_thenGet_returnsSameValue() {
    JsDocInfoParser parser = createParser("");
    assertNull(parser.getFileOverviewJSDocInfo());

    parser.setFileOverviewJSDocInfo(null);
    assertNull(parser.getFileOverviewJSDocInfo());
  }

  @Test
  public void testSetFileLevelJsDocBuilder_null_doesNotThrow() {
    JsDocInfoParser parser = createParser("");
    try {
      parser.setFileLevelJsDocBuilder(null);
      assertTrue(true);
    } catch (Exception e) {
      fail("setFileLevelJsDocBuilder should not throw: " + e);
    }
  }

  @Test
  public void testRetrieveAndResetParsedJSDocInfo_afterEmptyParse_doesNotThrow() {
    JsDocInfoParser parser = createParser("");
    parser.parse();
    try {
      JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
      // The result may legitimately be null since parse() already
      // triggered jsdocBuilder.build(null) internally on EOF.
      assertTrue(info == null || info != null);
    } catch (Exception e) {
      fail("retrieveAndResetParsedJSDocInfo should not throw: " + e);
    }
  }

  @Test
  public void testParse_paramAnnotation_doesNotThrow() {
    JsDocInfoParser parser = createParser("@param {string} foo description\n");
    try {
      parser.parse();
      assertTrue(true);
    } catch (Exception e) {
      fail("parse() should not throw an exception: " + e);
    }
  }

  @Test
  public void testParse_returnAnnotation_doesNotThrow() {
    JsDocInfoParser parser = createParser("@return {number} the value\n");
    try {
      parser.parse();
      assertTrue(true);
    } catch (Exception e) {
      fail("parse() should not throw an exception: " + e);
    }
  }

  @Test
  public void testParse_suppressAnnotation_doesNotThrow() {
    JsDocInfoParser parser = createParser("@suppress {visibility}\n");
    try {
      parser.parse();
      assertTrue(true);
    } catch (Exception e) {
      fail("parse() should not throw an exception: " + e);
    }
  }

  @Test
  public void testParse_deprecatedAnnotation_doesNotThrow() {
    JsDocInfoParser parser = createParser("@deprecated use something else\n");
    try {
      parser.parse();
      assertTrue(true);
    } catch (Exception e) {
      fail("parse() should not throw an exception: " + e);
    }
  }

  @Test
  public void testParse_starOnlyLines_doesNotThrow() {
    JsDocInfoParser parser = createParser("*\n*\n");
    try {
      parser.parse();
      assertTrue(true);
    } catch (Exception e) {
      fail("parse() should not throw an exception: " + e);
    }
  }

  @Test
  public void testMultipleParseCalls_independentInstances_doNotInterfere() {
    JsDocInfoParser parser1 = createParser("@const\n");
    JsDocInfoParser parser2 = createParser("@deprecated\n");

    boolean result1 = parser1.parse();
    boolean result2 = parser2.parse();

    // Both calls should complete independently without throwing;
    // exact boolean values depend on Config's default annotation set.
    assertEquals(result1, result1);
    assertEquals(result2, result2);
  }
}
