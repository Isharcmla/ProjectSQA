package com.fasterxml.jackson.core.base;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonEOFException;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;

public class ParserMinimalBaseTest {

    private static class StubParser extends ParserMinimalBase {
        private final List<JsonToken> tokenQueue = new ArrayList<JsonToken>();
        private int tokenIndex = 0;
        private String currentName;
        private String textValue;
        private int intVal;
        private long longVal;
        private double doubleVal;
        private Object embeddedObj;
        private boolean closed = false;
        private boolean eofHandled = false;

        public StubParser() {
            super();
        }

        public StubParser(int features) {
            super(features);
        }

        public void setTokens(JsonToken... tokens) {
            tokenQueue.clear();
            tokenQueue.addAll(Arrays.asList(tokens));
            tokenIndex = 0;
        }

        public void setCurrentToken(JsonToken t) {
            this._currToken = t;
        }

        public void setTextValue(String text) {
            this.textValue = text;
        }

        public void setIntValue(int val) {
            this.intVal = val;
        }

        public void setLongValue(long val) {
            this.longVal = val;
        }

        public void setDoubleValue(double val) {
            this.doubleVal = val;
        }

        public void setEmbeddedObject(Object obj) {
            this.embeddedObj = obj;
        }

        public boolean isEofHandled() {
            return eofHandled;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            if (tokenIndex < tokenQueue.size()) {
                _currToken = tokenQueue.get(tokenIndex++);
                return _currToken;
            }
            _currToken = null;
            return null;
        }

        @Override
        protected void _handleEOF() throws JsonParseException {
            eofHandled = true;
            _reportInvalidEOF();
        }

        @Override
        public String getCurrentName() throws IOException {
            return currentName;
        }

        public void setCurrentName(String name) {
            this.currentName = name;
        }

        @Override
        public void overrideCurrentName(String name) {
            this.currentName = name;
        }

        @Override
        public void close() throws IOException {
            closed = true;
        }

        @Override
        public boolean isClosed() {
            return closed;
        }

        @Override
        public JsonStreamContext getParsingContext() {
            return null;
        }

        @Override
        public JsonLocation getTokenLocation() {
            return JsonLocation.NA;
        }

        @Override
        public JsonLocation getCurrentLocation() {
            return JsonLocation.NA;
        }

        @Override
        public ObjectCodec getCodec() {
            return null;
        }

        @Override
        public void setCodec(ObjectCodec c) {
        }

        @Override
        public Version version() {
            return Version.unknownVersion();
        }

        @Override
        public String getText() throws IOException {
            return textValue;
        }

        @Override
        public char[] getTextCharacters() throws IOException {
            return (textValue == null) ? null : textValue.toCharArray();
        }

        @Override
        public boolean hasTextCharacters() {
            return textValue != null;
        }

        @Override
        public int getTextLength() throws IOException {
            return (textValue == null) ? 0 : textValue.length();
        }

        @Override
        public int getTextOffset() throws IOException {
            return 0;
        }

        @Override
        public byte[] getBinaryValue(Base64Variant b64variant) throws IOException {
            ByteArrayBuilder builder = new ByteArrayBuilder();
            _decodeBase64(textValue, builder, b64variant);
            return builder.toByteArray();
        }

        @Override
        public Number getNumberValue() throws IOException {
            return intVal;
        }

        @Override
        public NumberType getNumberType() throws IOException {
            return NumberType.INT;
        }

        @Override
        public int getIntValue() throws IOException {
            return intVal;
        }

        @Override
        public long getLongValue() throws IOException {
            return longVal;
        }

        @Override
        public BigInteger getBigIntegerValue() throws IOException {
            return BigInteger.valueOf(longVal);
        }

        @Override
        public float getFloatValue() throws IOException {
            return (float) doubleVal;
        }

        @Override
        public double getDoubleValue() throws IOException {
            return doubleVal;
        }

        @Override
        public BigDecimal getDecimalValue() throws IOException {
            return BigDecimal.valueOf(doubleVal);
        }

        @Override
        public Object getEmbeddedObject() throws IOException {
            return embeddedObj;
        }

        // Public delegators to protected methods for testing
        public void testDecodeBase64(String str, ByteArrayBuilder builder, Base64Variant b64variant) throws IOException {
            _decodeBase64(str, builder, b64variant);
        }

        public boolean testHasTextualNull(String val) {
            return _hasTextualNull(val);
        }

        public void testReportUnexpectedNumberChar(int ch, String comment) throws JsonParseException {
            reportUnexpectedNumberChar(ch, comment);
        }

        public void testReportInvalidNumber(String msg) throws JsonParseException {
            reportInvalidNumber(msg);
        }

        public void testReportOverflowInt() throws IOException {
            reportOverflowInt();
        }

        public void testReportOverflowInt(String numDesc) throws IOException {
            reportOverflowInt(numDesc);
        }

        public void testReportOverflowLong() throws IOException {
            reportOverflowLong();
        }

        public void testReportOverflowLong(String numDesc) throws IOException {
            reportOverflowLong(numDesc);
        }

        public void testReportInputCoercion(String msg, JsonToken inputType, Class<?> targetType) throws InputCoercionException {
            _reportInputCoercion(msg, inputType, targetType);
        }

        public String testLongIntegerDesc(String raw) {
            return _longIntegerDesc(raw);
        }

        public String testLongNumberDesc(String raw) {
            return _longNumberDesc(raw);
        }

        public void testReportUnexpectedChar(int ch, String comment) throws JsonParseException {
            _reportUnexpectedChar(ch, comment);
        }

        public void testReportInvalidEOF() throws JsonParseException {
            _reportInvalidEOF();
        }

        public void testReportInvalidEOFInValue(JsonToken type) throws JsonParseException {
            _reportInvalidEOFInValue(type);
        }

        @SuppressWarnings("deprecation")
        public void testReportInvalidEOFInValueDeprecated() throws JsonParseException {
            _reportInvalidEOFInValue();
        }

        @SuppressWarnings("deprecation")
        public void testReportInvalidEOFDeprecated(String msg) throws JsonParseException {
            _reportInvalidEOF(msg);
        }

        public void testReportInvalidEOF(String msg, JsonToken currToken) throws JsonParseException {
            _reportInvalidEOF(msg, currToken);
        }

        public void testReportMissingRootWS(int ch) throws JsonParseException {
            _reportMissingRootWS(ch);
        }

        public void testThrowInvalidSpace(int i) throws JsonParseException {
            _throwInvalidSpace(i);
        }

        public static String testGetCharDesc(int ch) {
            return ParserMinimalBase._getCharDesc(ch);
        }

        public void testReportError(String msg) throws JsonParseException {
            _reportError(msg);
        }

        public void testReportError(String msg, Object arg) throws JsonParseException {
            _reportError(msg, arg);
        }

        public void testReportError(String msg, Object arg1, Object arg2) throws JsonParseException {
            _reportError(msg, arg1, arg2);
        }

        public void testWrapError(String msg, Throwable t) throws JsonParseException {
            _wrapError(msg, t);
        }

        public void testThrowInternal() {
            _throwInternal();
        }

        public JsonParseException testConstructError(String msg, Throwable t) {
            return _constructError(msg, t);
        }

        public static byte[] testAsciiBytes(String str) {
            return ParserMinimalBase._asciiBytes(str);
        }

        public static String testAscii(byte[] b) {
            return ParserMinimalBase._ascii(b);
        }
    }

    @Test
    public void testConstructors_defaultAndFeatures_successfulInitialization() {
        StubParser p1 = new StubParser();
        Assert.assertNull(p1.currentToken());
        Assert.assertFalse(p1.hasCurrentToken());

        StubParser p2 = new StubParser(JsonParser.Feature.ALLOW_COMMENTS.getMask());
        Assert.assertTrue(p2.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        Assert.assertFalse(p2.isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS));
    }

    @Test
    public void testConstants_verifyValues() {
        Assert.assertEquals(0, ParserMinimalBase.NO_BYTES.length);
        Assert.assertEquals(0, ParserMinimalBase.NO_INTS.length);
        Assert.assertEquals(256, ParserMinimalBase.MAX_ERROR_TOKEN_LENGTH);
        Assert.assertEquals(0, ParserMinimalBase.NR_UNKNOWN);
        Assert.assertEquals(1, ParserMinimalBase.NR_INT);
        Assert.assertEquals(2, ParserMinimalBase.NR_LONG);
        Assert.assertEquals(4, ParserMinimalBase.NR_BIGINT);
        Assert.assertEquals(8, ParserMinimalBase.NR_DOUBLE);
        Assert.assertEquals(16, ParserMinimalBase.NR_BIGDECIMAL);
        Assert.assertEquals(32, ParserMinimalBase.NR_FLOAT);
    }

    @Test
    public void testCurrentToken_nullAndNonNull_returnsCorrectTokenAndId() {
        StubParser p = new StubParser();
        Assert.assertNull(p.currentToken());
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, p.currentTokenId());
        Assert.assertNull(p.getCurrentToken());
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, p.getCurrentTokenId());
        Assert.assertFalse(p.hasCurrentToken());

        p.setCurrentToken(JsonToken.VALUE_STRING);
        Assert.assertEquals(JsonToken.VALUE_STRING, p.currentToken());
        Assert.assertEquals(JsonTokenId.ID_STRING, p.currentTokenId());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.getCurrentToken());
        Assert.assertEquals(JsonTokenId.ID_STRING, p.getCurrentTokenId());
        Assert.assertTrue(p.hasCurrentToken());
    }

    @Test
    public void testHasTokenAndHasTokenId_matchedAndUnmatched_returnsExpectedBoolean() {
        StubParser p = new StubParser();
        Assert.assertTrue(p.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        Assert.assertFalse(p.hasTokenId(JsonTokenId.ID_STRING));
        Assert.assertTrue(p.hasToken(null));
        Assert.assertFalse(p.hasToken(JsonToken.START_OBJECT));

        p.setCurrentToken(JsonToken.START_OBJECT);
        Assert.assertTrue(p.hasTokenId(JsonTokenId.ID_START_OBJECT));
        Assert.assertFalse(p.hasTokenId(JsonTokenId.ID_START_ARRAY));
        Assert.assertTrue(p.hasToken(JsonToken.START_OBJECT));
        Assert.assertFalse(p.hasToken(JsonToken.START_ARRAY));
    }

    @Test
    public void testIsExpectedStartArrayAndObjectToken_variousTokens_returnsExpectedBoolean() {
        StubParser p = new StubParser();
        Assert.assertFalse(p.isExpectedStartArrayToken());
        Assert.assertFalse(p.isExpectedStartObjectToken());

        p.setCurrentToken(JsonToken.START_ARRAY);
        Assert.assertTrue(p.isExpectedStartArrayToken());
        Assert.assertFalse(p.isExpectedStartObjectToken());

        p.setCurrentToken(JsonToken.START_OBJECT);
        Assert.assertFalse(p.isExpectedStartArrayToken());
        Assert.assertTrue(p.isExpectedStartObjectToken());

        p.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        Assert.assertFalse(p.isExpectedStartArrayToken());
        Assert.assertFalse(p.isExpectedStartObjectToken());
    }

    @Test
    public void testClearCurrentToken_clearsStateAndStoresLastClearedToken() {
        StubParser p = new StubParser();
        Assert.assertNull(p.getLastClearedToken());
        p.clearCurrentToken(); // Should be safe on null
        Assert.assertNull(p.getLastClearedToken());

        p.setCurrentToken(JsonToken.VALUE_TRUE);
        p.clearCurrentToken();
        Assert.assertNull(p.currentToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, p.getLastClearedToken());
    }

    @Test
    public void testNextValue_withFieldName_skipsFieldName() throws IOException {
        StubParser p = new StubParser();
        p.setTokens(JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.VALUE_NUMBER_INT);

        JsonToken t1 = p.nextValue();
        Assert.assertEquals(JsonToken.VALUE_STRING, t1);

        JsonToken t2 = p.nextValue();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, t2);

        JsonToken t3 = p.nextValue();
        Assert.assertNull(t3);
    }

    @Test
    public void testSkipChildren_onScalarToken_returnsImmediately() throws IOException {
        StubParser p = new StubParser();
        p.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        JsonParser res = p.skipChildren();
        Assert.assertSame(p, res);
    }

    @Test
    public void testSkipChildren_nestedObjectsAndArrays_skipsSuccessfully() throws IOException {
        StubParser p = new StubParser();
        p.setCurrentToken(JsonToken.START_OBJECT);
        p.setTokens(
            JsonToken.FIELD_NAME,
            JsonToken.START_ARRAY,
            JsonToken.VALUE_NUMBER_INT,
            JsonToken.END_ARRAY,
            JsonToken.END_OBJECT
        );
        JsonParser res = p.skipChildren();
        Assert.assertSame(p, res);
        Assert.assertEquals(JsonToken.END_OBJECT, p.currentToken());
    }

    @Test(expected = JsonParseException.class)
    public void testSkipChildren_unexpectedEOF_invokesHandleEOFAndThrows() throws IOException {
        StubParser p = new StubParser();
        p.setCurrentToken(JsonToken.START_ARRAY);
        p.setTokens(JsonToken.VALUE_STRING); // EOF reached without END_ARRAY
        p.skipChildren();
    }

    @Test(expected = JsonParseException.class)
    public void testSkipChildren_notAvailableToken_throwsError() throws IOException {
        StubParser p = new StubParser();
        p.setCurrentToken(JsonToken.START_OBJECT);
        p.setTokens(JsonToken.NOT_AVAILABLE);
        p.skipChildren();
    }

    @Test
    public void testGetValueAsBoolean_allTokenTypes_correctBooleanReturned() throws IOException {
        StubParser p = new StubParser();

        // Null token -> default
        Assert.assertTrue(p.getValueAsBoolean(true));
        Assert.assertFalse(p.getValueAsBoolean(false));

        // String "true", "false", "null", other
        p.setCurrentToken(JsonToken.VALUE_STRING);
        p.setTextValue("true");
        Assert.assertTrue(p.getValueAsBoolean(false));

        p.setTextValue("false");
        Assert.assertFalse(p.getValueAsBoolean(true));

        p.setTextValue("null");
        Assert.assertFalse(p.getValueAsBoolean(true));

        p.setTextValue("   true   ");
        Assert.assertTrue(p.getValueAsBoolean(false));

        p.setTextValue("unknown");
        Assert.assertTrue(p.getValueAsBoolean(true));
        Assert.assertFalse(p.getValueAsBoolean(false));

        // Number Int
        p.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        p.setIntValue(1);
        Assert.assertTrue(p.getValueAsBoolean(false));
        p.setIntValue(0);
        Assert.assertFalse(p.getValueAsBoolean(true));

        // True / False / Null
        p.setCurrentToken(JsonToken.VALUE_TRUE);
        Assert.assertTrue(p.getValueAsBoolean(false));

        p.setCurrentToken(JsonToken.VALUE_FALSE);
        Assert.assertFalse(p.getValueAsBoolean(true));

        p.setCurrentToken(JsonToken.VALUE_NULL);
        Assert.assertFalse(p.getValueAsBoolean(true));

        // Embedded Object
        p.setCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Boolean.TRUE);
        Assert.assertTrue(p.getValueAsBoolean(false));

        p.setEmbeddedObject(Boolean.FALSE);
        Assert.assertFalse(p.getValueAsBoolean(true));

        p.setEmbeddedObject("not-boolean");
        Assert.assertTrue(p.getValueAsBoolean(true));

        // Default branch
        p.setCurrentToken(JsonToken.START_ARRAY);
        Assert.assertTrue(p.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsInt_allTokenTypes_correctIntReturned() throws IOException {
        StubParser p = new StubParser();

        // Default without args
        Assert.assertEquals(0, p.getValueAsInt());
        Assert.assertEquals(42, p.getValueAsInt(42));

        // Int / Float
        p.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        p.setIntValue(123);
        Assert.assertEquals(123, p.getValueAsInt());
        Assert.assertEquals(123, p.getValueAsInt(99));

        p.setCurrentToken(JsonToken.VALUE_NUMBER_FLOAT);
        p.setIntValue(456);
        Assert.assertEquals(456, p.getValueAsInt());

        // String
        p.setCurrentToken(JsonToken.VALUE_STRING);
        p.setTextValue("null");
        Assert.assertEquals(0, p.getValueAsInt(77));

        p.setTextValue("789");
        Assert.assertEquals(789, p.getValueAsInt(0));

        p.setTextValue("invalid");
        Assert.assertEquals(88, p.getValueAsInt(88));

        // Boolean & Null
        p.setCurrentToken(JsonToken.VALUE_TRUE);
        Assert.assertEquals(1, p.getValueAsInt(0));

        p.setCurrentToken(JsonToken.VALUE_FALSE);
        Assert.assertEquals(0, p.getValueAsInt(99));

        p.setCurrentToken(JsonToken.VALUE_NULL);
        Assert.assertEquals(0, p.getValueAsInt(99));

        // Embedded object
        p.setCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Integer.valueOf(321));
        Assert.assertEquals(321, p.getValueAsInt(0));

        p.setEmbeddedObject("not a number");
        Assert.assertEquals(55, p.getValueAsInt(55));

        // Unhandled token
        p.setCurrentToken(JsonToken.START_ARRAY);
        Assert.assertEquals(66, p.getValueAsInt(66));
    }

    @Test
    public void testGetValueAsLong_allTokenTypes_correctLongReturned() throws IOException {
        StubParser p = new StubParser();

        Assert.assertEquals(0L, p.getValueAsLong());
        Assert.assertEquals(99L, p.getValueAsLong(99L));

        p.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        p.setLongValue(1000L);
        Assert.assertEquals(1000L, p.getValueAsLong());

        p.setCurrentToken(JsonToken.VALUE_NUMBER_FLOAT);
        p.setLongValue(2000L);
        Assert.assertEquals(2000L, p.getValueAsLong(50L));

        p.setCurrentToken(JsonToken.VALUE_STRING);
        p.setTextValue("null");
        Assert.assertEquals(0L, p.getValueAsLong(123L));

        p.setTextValue("1234567890123");
        Assert.assertEquals(1234567890123L, p.getValueAsLong(0L));

        p.setTextValue("invalid");
        Assert.assertEquals(44L, p.getValueAsLong(44L));

        p.setCurrentToken(JsonToken.VALUE_TRUE);
        Assert.assertEquals(1L, p.getValueAsLong(0L));

        p.setCurrentToken(JsonToken.VALUE_FALSE);
        Assert.assertEquals(0L, p.getValueAsLong(55L));

        p.setCurrentToken(JsonToken.VALUE_NULL);
        Assert.assertEquals(0L, p.getValueAsLong(55L));

        p.setCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Long.valueOf(9876543210L));
        Assert.assertEquals(9876543210L, p.getValueAsLong(0L));

        p.setEmbeddedObject("abc");
        Assert.assertEquals(77L, p.getValueAsLong(77L));

        p.setCurrentToken(JsonToken.START_ARRAY);
        Assert.assertEquals(88L, p.getValueAsLong(88L));
    }

    @Test
    public void testGetValueAsDouble_allTokenTypes_correctDoubleReturned() throws IOException {
        StubParser p = new StubParser();

        Assert.assertEquals(3.14, p.getValueAsDouble(3.14), 0.0001);

        p.setCurrentToken(JsonToken.VALUE_STRING);
        p.setTextValue("null");
        Assert.assertEquals(0.0, p.getValueAsDouble(5.5), 0.0001);

        p.setTextValue("12.34");
        Assert.assertEquals(12.34, p.getValueAsDouble(0.0), 0.0001);

        p.setTextValue("invalid");
        Assert.assertEquals(9.9, p.getValueAsDouble(9.9), 0.0001);

        p.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        p.setDoubleValue(42.0);
        Assert.assertEquals(42.0, p.getValueAsDouble(0.0), 0.0001);

        p.setCurrentToken(JsonToken.VALUE_NUMBER_FLOAT);
        p.setDoubleValue(55.5);
        Assert.assertEquals(55.5, p.getValueAsDouble(0.0), 0.0001);

        p.setCurrentToken(JsonToken.VALUE_TRUE);
        Assert.assertEquals(1.0, p.getValueAsDouble(0.0), 0.0001);

        p.setCurrentToken(JsonToken.VALUE_FALSE);
        Assert.assertEquals(0.0, p.getValueAsDouble(5.0), 0.0001);

        p.setCurrentToken(JsonToken.VALUE_NULL);
        Assert.assertEquals(0.0, p.getValueAsDouble(5.0), 0.0001);

        p.setCurrentToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Double.valueOf(88.8));
        Assert.assertEquals(88.8, p.getValueAsDouble(0.0), 0.0001);

        p.setEmbeddedObject("abc");
        Assert.assertEquals(2.2, p.getValueAsDouble(2.2), 0.0001);

        p.setCurrentToken(JsonToken.START_OBJECT);
        Assert.assertEquals(1.1, p.getValueAsDouble(1.1), 0.0001);
    }

    @Test
    public void testGetValueAsString_allTokenTypes_correctStringReturned() throws IOException {
        StubParser p = new StubParser();

        Assert.assertNull(p.getValueAsString());
        Assert.assertEquals("def", p.getValueAsString("def"));

        p.setCurrentToken(JsonToken.VALUE_STRING);
        p.setTextValue("hello");
        Assert.assertEquals("hello", p.getValueAsString());
        Assert.assertEquals("hello", p.getValueAsString("default"));

        p.setCurrentToken(JsonToken.FIELD_NAME);
        p.setCurrentName("myField");
        Assert.assertEquals("myField", p.getValueAsString());
        Assert.assertEquals("myField", p.getValueAsString("default"));

        p.setCurrentToken(JsonToken.VALUE_NULL);
        Assert.assertNull(p.getValueAsString());
        Assert.assertEquals("default", p.getValueAsString("default"));

        p.setCurrentToken(JsonToken.START_ARRAY);
        Assert.assertNull(p.getValueAsString());
        Assert.assertEquals("default", p.getValueAsString("default"));

        p.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        p.setTextValue("100");
        Assert.assertEquals("100", p.getValueAsString());
        Assert.assertEquals("100", p.getValueAsString("default"));
    }

    @Test
    public void testDecodeBase64_validAndInvalid_handlesCorrectly() throws IOException {
        StubParser p = new StubParser();
        ByteArrayBuilder builder = new ByteArrayBuilder();
        p.testDecodeBase64("QUJD", builder, Base64Variants.MIME);
        Assert.assertArrayEquals(new byte[] { 'A', 'B', 'C' }, builder.toByteArray());

        p.setTextValue("QUJD");
        byte[] bytes = p.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(new byte[] { 'A', 'B', 'C' }, bytes);
    }

    @Test(expected = JsonParseException.class)
    public void testDecodeBase64_invalidString_throwsException() throws IOException {
        StubParser p = new StubParser();
        ByteArrayBuilder builder = new ByteArrayBuilder();
        p.testDecodeBase64("!!not-valid-base64!!", builder, Base64Variants.MIME);
    }

    @Test
    public void testHasTextualNull_edgeCases() {
        StubParser p = new StubParser();
        Assert.assertTrue(p.testHasTextualNull("null"));
        Assert.assertFalse(p.testHasTextualNull("NULL"));
        Assert.assertFalse(p.testHasTextualNull(""));
        Assert.assertFalse(p.testHasTextualNull(null));
    }

    @Test
    public void testReportUnexpectedNumberChar_withAndWithoutComment_throwsException() {
        StubParser p = new StubParser();
        try {
            p.testReportUnexpectedNumberChar('x', "extra info");
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected character ('x') in numeric value: extra info"));
        }

        try {
            p.testReportUnexpectedNumberChar('y', null);
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected character ('y') in numeric value"));
        }
    }

    @Test(expected = JsonParseException.class)
    public void testReportInvalidNumber_throwsException() throws JsonParseException {
        StubParser p = new StubParser();
        p.testReportInvalidNumber("bad number format");
    }

    @Test(expected = JsonParseException.class)
    public void testReportOverflowInt_withAndWithoutText_throwsException() throws IOException {
        StubParser p = new StubParser();
        p.setTextValue("999999999999");
        p.testReportOverflowInt();
    }

    @Test(expected = JsonParseException.class)
    public void testReportOverflowInt_customDesc_throwsException() throws IOException {
        StubParser p = new StubParser();
        p.testReportOverflowInt("12345");
    }

    @Test(expected = JsonParseException.class)
    public void testReportOverflowLong_withAndWithoutText_throwsException() throws IOException {
        StubParser p = new StubParser();
        p.setTextValue("9999999999999999999999999");
        p.testReportOverflowLong();
    }

    @Test(expected = JsonParseException.class)
    public void testReportOverflowLong_customDesc_throwsException() throws IOException {
        StubParser p = new StubParser();
        p.testReportOverflowLong("99999");
    }

    @Test(expected = InputCoercionException.class)
    public void testReportInputCoercion_throwsException() throws InputCoercionException {
        StubParser p = new StubParser();
        p.testReportInputCoercion("cannot coerce", JsonToken.VALUE_STRING, Integer.class);
    }

    @Test
    public void testLongIntegerAndNumberDesc_shortAndLongStrings_returnsTruncatedDesc() {
        StubParser p = new StubParser();
        Assert.assertEquals("123", p.testLongIntegerDesc("123"));
        Assert.assertEquals("456", p.testLongNumberDesc("456"));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1005; i++) {
            sb.append('9');
        }
        String longPositive = sb.toString();
        String longNegative = "-" + longPositive;

        Assert.assertEquals("[Integer with 1005 digits]", p.testLongIntegerDesc(longPositive));
        Assert.assertEquals("[Integer with 1005 digits]", p.testLongIntegerDesc(longNegative));

        Assert.assertEquals("[number with 1005 characters]", p.testLongNumberDesc(longPositive));
        Assert.assertEquals("[number with 1005 characters]", p.testLongNumberDesc(longNegative));
    }

    @Test
    public void testReportUnexpectedChar_validAndNegativeChar_throwsException() {
        StubParser p = new StubParser();
        try {
            p.testReportUnexpectedChar('a', "custom comment");
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected character ('a'): custom comment"));
        }

        try {
            p.testReportUnexpectedChar('b', null);
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected character ('b')"));
        }

        try {
            p.testReportUnexpectedChar(-1, null);
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-input"));
        }
    }

    @Test
    public void testReportInvalidEOF_variousSignatures() {
        StubParser p = new StubParser();
        try {
            p.testReportInvalidEOF();
            Assert.fail("Expected JsonEOFException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e instanceof JsonEOFException);
        }

        try {
            p.testReportInvalidEOFInValue(JsonToken.VALUE_STRING);
            Assert.fail("Expected JsonEOFException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("in a String value"));
        }

        try {
            p.testReportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
            Assert.fail("Expected JsonEOFException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("in a Number value"));
        }

        try {
            p.testReportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            Assert.fail("Expected JsonEOFException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("in a Number value"));
        }

        try {
            p.testReportInvalidEOFInValue(JsonToken.START_OBJECT);
            Assert.fail("Expected JsonEOFException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("in a value"));
        }

        try {
            p.testReportInvalidEOFInValueDeprecated();
            Assert.fail("Expected JsonEOFException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("in a value"));
        }

        try {
            p.testReportInvalidEOFDeprecated(" custom msg");
            Assert.fail("Expected JsonEOFException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-input custom msg"));
        }

        try {
            p.testReportInvalidEOF(" ending", JsonToken.VALUE_TRUE);
            Assert.fail("Expected JsonEOFException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-input ending"));
        }
    }

    @Test(expected = JsonParseException.class)
    public void testReportMissingRootWS_throwsException() throws JsonParseException {
        StubParser p = new StubParser();
        p.testReportMissingRootWS('x');
    }

    @Test(expected = JsonParseException.class)
    public void testThrowInvalidSpace_throwsException() throws JsonParseException {
        StubParser p = new StubParser();
        p.testThrowInvalidSpace(0x00A0);
    }

    @Test
    public void testGetCharDesc_variousChars_correctDescription() {
        Assert.assertEquals("(CTRL-CHAR, code 10)", StubParser.testGetCharDesc('\n'));
        Assert.assertEquals("'a' (code 97)", StubParser.testGetCharDesc('a'));
        Assert.assertEquals("'\u0100' (code 256 / 0x100)", StubParser.testGetCharDesc(256));
    }

    @Test
    public void testReportError_formattedAndUnformatted_throwsJsonParseException() {
        StubParser p = new StubParser();
        try {
            p.testReportError("simple error");
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertEquals("simple error", e.getOriginalMessage());
        }

        try {
            p.testReportError("arg1 error: %s", "val1");
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertEquals("arg1 error: val1", e.getOriginalMessage());
        }

        try {
            p.testReportError("arg2 error: %s - %d", "val2", 123);
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertEquals("arg2 error: val2 - 123", e.getOriginalMessage());
        }
    }

    @Test
    public void testWrapError_constructsParseExceptionWithCause() {
        StubParser p = new StubParser();
        Exception cause = new RuntimeException("root cause");
        try {
            p.testWrapError("wrapped error", cause);
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("wrapped error"));
            Assert.assertEquals(cause, e.getCause());
        }
    }

    @Test(expected = RuntimeException.class)
    public void testThrowInternal_throwsInternalError() {
        StubParser p = new StubParser();
        p.testThrowInternal();
    }

    @Test
    public void testConstructError_returnsJsonParseException() {
        StubParser p = new StubParser();
        Exception cause = new Exception("cause");
        JsonParseException ex = p.testConstructError("constructed error", cause);
        Assert.assertNotNull(ex);
        Assert.assertTrue(ex.getMessage().contains("constructed error"));
        Assert.assertEquals(cause, ex.getCause());
    }

    @Test
    public void testAsciiBytesAndAscii_roundTripConversion() {
        String testStr = "Hello, World! 123";
        byte[] bytes = StubParser.testAsciiBytes(testStr);
        Assert.assertEquals(testStr.length(), bytes.length);
        String restored = StubParser.testAscii(bytes);
        Assert.assertEquals(testStr, restored);

        // Empty string
        byte[] emptyBytes = StubParser.testAsciiBytes("");
        Assert.assertEquals(0, emptyBytes.length);
        Assert.assertEquals("", StubParser.testAscii(emptyBytes));
    }

    @Test
    public void testOverrideCurrentNameAndClose_behavior() throws IOException {
        StubParser p = new StubParser();
        Assert.assertFalse(p.isClosed());
        p.setCurrentName("initial");
        Assert.assertEquals("initial", p.getCurrentName());
        p.overrideCurrentName("overridden");
        Assert.assertEquals("overridden", p.getCurrentName());
        p.close();
        Assert.assertTrue(p.isClosed());
    }

    @Test
    public void testTextCharactersAccessors_nullAndNonNull() throws IOException {
        StubParser p = new StubParser();
        Assert.assertNull(p.getTextCharacters());
        Assert.assertFalse(p.hasTextCharacters());
        Assert.assertEquals(0, p.getTextLength());
        Assert.assertEquals(0, p.getTextOffset());

        p.setTextValue("sample text");
        Assert.assertArrayEquals("sample text".toCharArray(), p.getTextCharacters());
        Assert.assertTrue(p.hasTextCharacters());
        Assert.assertEquals(11, p.getTextLength());
        Assert.assertEquals(0, p.getTextOffset());
    }
}
