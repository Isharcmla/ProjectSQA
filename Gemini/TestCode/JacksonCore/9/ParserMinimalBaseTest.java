package com.fasterxml.jackson.core.base;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;

public class ParserMinimalBaseTest {

    static class MinimalParserImpl extends ParserMinimalBase {
        private Queue<JsonToken> tokens = new LinkedList<JsonToken>();
        private String textValue;
        private int intVal;
        private long longVal;
        private double doubleVal;
        private Object embeddedObj;
        private boolean closed = false;
        private String currentName;

        public MinimalParserImpl() {
            super();
        }

        public MinimalParserImpl(int features) {
            super(features);
        }

        public void setTokens(JsonToken... tokens) {
            this.tokens = new LinkedList<JsonToken>(Arrays.asList(tokens));
        }

        public void setCurrToken(JsonToken t) {
            this._currToken = t;
        }

        public void setTextValue(String text) {
            this.textValue = text;
        }

        public void setIntValue(int v) {
            this.intVal = v;
        }

        public void setLongValue(long v) {
            this.longVal = v;
        }

        public void setDoubleValue(double v) {
            this.doubleVal = v;
        }

        public void setEmbeddedObject(Object obj) {
            this.embeddedObj = obj;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            _currToken = tokens.poll();
            return _currToken;
        }

        @Override
        protected void _handleEOF() throws JsonParseException {
            _reportInvalidEOF();
        }

        @Override
        public String getCurrentName() throws IOException {
            return currentName;
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
        public String getText() throws IOException {
            return textValue;
        }

        @Override
        public char[] getTextCharacters() throws IOException {
            return textValue == null ? null : textValue.toCharArray();
        }

        @Override
        public boolean hasTextCharacters() {
            return textValue != null;
        }

        @Override
        public int getTextLength() throws IOException {
            return textValue == null ? 0 : textValue.length();
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
        public ObjectCodec getCodec() {
            return null;
        }

        @Override
        public void setCodec(ObjectCodec c) { }

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
    }

    @Test
    public void testConstructorsAndFeatureInitialization() {
        MinimalParserImpl p1 = new MinimalParserImpl();
        Assert.assertNull(p1.getCurrentToken());

        MinimalParserImpl p2 = new MinimalParserImpl(Feature.ALLOW_SINGLE_QUOTES.getMask());
        Assert.assertTrue(p2.isEnabled(Feature.ALLOW_SINGLE_QUOTES));
        Assert.assertFalse(p2.isEnabled(Feature.ALLOW_UNQUOTED_CONTROL_CHARS));
    }

    @Test
    public void testTokenInspectionAndStateManagement() {
        MinimalParserImpl p = new MinimalParserImpl();

        Assert.assertNull(p.getCurrentToken());
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, p.getCurrentTokenId());
        Assert.assertFalse(p.hasCurrentToken());
        Assert.assertTrue(p.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        Assert.assertFalse(p.hasTokenId(JsonTokenId.ID_START_OBJECT));
        Assert.assertTrue(p.hasToken(null));
        Assert.assertFalse(p.hasToken(JsonToken.START_OBJECT));
        Assert.assertFalse(p.isExpectedStartArrayToken());
        Assert.assertFalse(p.isExpectedStartObjectToken());

        p.setCurrToken(JsonToken.START_OBJECT);
        Assert.assertEquals(JsonToken.START_OBJECT, p.getCurrentToken());
        Assert.assertEquals(JsonTokenId.ID_START_OBJECT, p.getCurrentTokenId());
        Assert.assertTrue(p.hasCurrentToken());
        Assert.assertTrue(p.hasTokenId(JsonTokenId.ID_START_OBJECT));
        Assert.assertFalse(p.hasTokenId(JsonTokenId.ID_START_ARRAY));
        Assert.assertTrue(p.hasToken(JsonToken.START_OBJECT));
        Assert.assertFalse(p.hasToken(JsonToken.START_ARRAY));
        Assert.assertFalse(p.isExpectedStartArrayToken());
        Assert.assertTrue(p.isExpectedStartObjectToken());

        p.setCurrToken(JsonToken.START_ARRAY);
        Assert.assertTrue(p.isExpectedStartArrayToken());
        Assert.assertFalse(p.isExpectedStartObjectToken());

        p.clearCurrentToken();
        Assert.assertNull(p.getCurrentToken());
        Assert.assertEquals(JsonToken.START_ARRAY, p.getLastClearedToken());

        p.clearCurrentToken();
        Assert.assertEquals(JsonToken.START_ARRAY, p.getLastClearedToken());
    }

    @Test
    public void testNextValue() throws IOException {
        MinimalParserImpl p = new MinimalParserImpl();
        p.setTokens(JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.VALUE_NUMBER_INT);

        JsonToken t1 = p.nextValue();
        Assert.assertEquals(JsonToken.VALUE_STRING, t1);

        JsonToken t2 = p.nextValue();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, t2);

        JsonToken t3 = p.nextValue();
        Assert.assertNull(t3);
    }

    @Test
    public void testSkipChildren_nonStructToken() throws IOException {
        MinimalParserImpl p = new MinimalParserImpl();
        p.setCurrToken(JsonToken.VALUE_STRING);
        Assert.assertSame(p, p.skipChildren());
    }

    @Test
    public void testSkipChildren_nestedObjectAndArray() throws IOException {
        MinimalParserImpl p = new MinimalParserImpl();
        p.setTokens(JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.START_ARRAY,
                JsonToken.VALUE_NUMBER_INT, JsonToken.END_ARRAY, JsonToken.END_OBJECT, JsonToken.VALUE_TRUE);

        p.nextToken();
        Assert.assertEquals(JsonToken.START_OBJECT, p.getCurrentToken());
        Assert.assertSame(p, p.skipChildren());
        Assert.assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
    }

    @Test
    public void testSkipChildren_eofThrowsException() {
        MinimalParserImpl p = new MinimalParserImpl();
        p.setTokens(JsonToken.START_ARRAY, JsonToken.VALUE_NUMBER_INT);

        try {
            p.nextToken();
            p.skipChildren();
            Assert.fail("Expected JsonParseException on premature EOF");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-input"));
        } catch (IOException e) {
            Assert.fail("Unexpected IOException type: " + e);
        }
    }

    @Test
    public void testGetValueAsBoolean() throws IOException {
        MinimalParserImpl p = new MinimalParserImpl();

        Assert.assertTrue(p.getValueAsBoolean(true));
        Assert.assertFalse(p.getValueAsBoolean(false));

        p.setCurrToken(JsonToken.VALUE_STRING);
        p.setTextValue("true");
        Assert.assertTrue(p.getValueAsBoolean(false));

        p.setTextValue("false");
        Assert.assertFalse(p.getValueAsBoolean(true));

        p.setTextValue("null");
        Assert.assertFalse(p.getValueAsBoolean(true));

        p.setTextValue("randomText");
        Assert.assertTrue(p.getValueAsBoolean(true));
        Assert.assertFalse(p.getValueAsBoolean(false));

        p.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        p.setIntValue(0);
        Assert.assertFalse(p.getValueAsBoolean(true));
        p.setIntValue(1);
        Assert.assertTrue(p.getValueAsBoolean(false));
        p.setIntValue(-5);
        Assert.assertTrue(p.getValueAsBoolean(false));

        p.setCurrToken(JsonToken.VALUE_TRUE);
        Assert.assertTrue(p.getValueAsBoolean(false));

        p.setCurrToken(JsonToken.VALUE_FALSE);
        Assert.assertFalse(p.getValueAsBoolean(true));

        p.setCurrToken(JsonToken.VALUE_NULL);
        Assert.assertFalse(p.getValueAsBoolean(true));

        p.setCurrToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Boolean.TRUE);
        Assert.assertTrue(p.getValueAsBoolean(false));
        p.setEmbeddedObject(Boolean.FALSE);
        Assert.assertFalse(p.getValueAsBoolean(true));
        p.setEmbeddedObject("NotBoolean");
        Assert.assertTrue(p.getValueAsBoolean(true));

        p.setCurrToken(JsonToken.START_OBJECT);
        Assert.assertTrue(p.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsInt() throws IOException {
        MinimalParserImpl p = new MinimalParserImpl();

        Assert.assertEquals(0, p.getValueAsInt());
        Assert.assertEquals(42, p.getValueAsInt(42));

        p.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        p.setIntValue(123);
        Assert.assertEquals(123, p.getValueAsInt());
        Assert.assertEquals(123, p.getValueAsInt(99));

        p.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        p.setIntValue(456);
        Assert.assertEquals(456, p.getValueAsInt());
        Assert.assertEquals(456, p.getValueAsInt(99));

        p.setCurrToken(JsonToken.VALUE_STRING);
        p.setTextValue("null");
        Assert.assertEquals(0, p.getValueAsInt(99));

        p.setTextValue("789");
        Assert.assertEquals(789, p.getValueAsInt(99));

        p.setTextValue("not_a_number");
        Assert.assertEquals(99, p.getValueAsInt(99));

        p.setCurrToken(JsonToken.VALUE_TRUE);
        Assert.assertEquals(1, p.getValueAsInt(99));

        p.setCurrToken(JsonToken.VALUE_FALSE);
        Assert.assertEquals(0, p.getValueAsInt(99));

        p.setCurrToken(JsonToken.VALUE_NULL);
        Assert.assertEquals(0, p.getValueAsInt(99));

        p.setCurrToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Integer.valueOf(1024));
        Assert.assertEquals(1024, p.getValueAsInt(99));
        p.setEmbeddedObject("NotANumber");
        Assert.assertEquals(99, p.getValueAsInt(99));

        p.setCurrToken(JsonToken.START_ARRAY);
        Assert.assertEquals(99, p.getValueAsInt(99));
    }

    @Test
    public void testGetValueAsLong() throws IOException {
        MinimalParserImpl p = new MinimalParserImpl();

        Assert.assertEquals(0L, p.getValueAsLong());
        Assert.assertEquals(42L, p.getValueAsLong(42L));

        p.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        p.setLongValue(1234567890123L);
        Assert.assertEquals(1234567890123L, p.getValueAsLong());
        Assert.assertEquals(1234567890123L, p.getValueAsLong(99L));

        p.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        p.setLongValue(9876543210987L);
        Assert.assertEquals(9876543210987L, p.getValueAsLong());
        Assert.assertEquals(9876543210987L, p.getValueAsLong(99L));

        p.setCurrToken(JsonToken.VALUE_STRING);
        p.setTextValue("null");
        Assert.assertEquals(0L, p.getValueAsLong(99L));

        p.setTextValue("5555555555");
        Assert.assertEquals(5555555555L, p.getValueAsLong(99L));

        p.setTextValue("invalid_long");
        Assert.assertEquals(99L, p.getValueAsLong(99L));

        p.setCurrToken(JsonToken.VALUE_TRUE);
        Assert.assertEquals(1L, p.getValueAsLong(99L));

        p.setCurrToken(JsonToken.VALUE_FALSE);
        Assert.assertEquals(0L, p.getValueAsLong(99L));

        p.setCurrToken(JsonToken.VALUE_NULL);
        Assert.assertEquals(0L, p.getValueAsLong(99L));

        p.setCurrToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Long.valueOf(2048L));
        Assert.assertEquals(2048L, p.getValueAsLong(99L));
        p.setEmbeddedObject("NotANumber");
        Assert.assertEquals(99L, p.getValueAsLong(99L));

        p.setCurrToken(JsonToken.START_OBJECT);
        Assert.assertEquals(99L, p.getValueAsLong(99L));
    }

    @Test
    public void testGetValueAsDouble() throws IOException {
        MinimalParserImpl p = new MinimalParserImpl();

        Assert.assertEquals(0.0, p.getValueAsDouble(0.0), 0.0001);
        Assert.assertEquals(4.2, p.getValueAsDouble(4.2), 0.0001);

        p.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        p.setDoubleValue(100.0);
        Assert.assertEquals(100.0, p.getValueAsDouble(0.0), 0.0001);

        p.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        p.setDoubleValue(123.456);
        Assert.assertEquals(123.456, p.getValueAsDouble(0.0), 0.0001);

        p.setCurrToken(JsonToken.VALUE_STRING);
        p.setTextValue("null");
        Assert.assertEquals(0.0, p.getValueAsDouble(9.9), 0.0001);

        p.setTextValue("78.9");
        Assert.assertEquals(78.9, p.getValueAsDouble(9.9), 0.0001);

        p.setTextValue("not_double");
        Assert.assertEquals(9.9, p.getValueAsDouble(9.9), 0.0001);

        p.setCurrToken(JsonToken.VALUE_TRUE);
        Assert.assertEquals(1.0, p.getValueAsDouble(9.9), 0.0001);

        p.setCurrToken(JsonToken.VALUE_FALSE);
        Assert.assertEquals(0.0, p.getValueAsDouble(9.9), 0.0001);

        p.setCurrToken(JsonToken.VALUE_NULL);
        Assert.assertEquals(0.0, p.getValueAsDouble(9.9), 0.0001);

        p.setCurrToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Double.valueOf(3.14159));
        Assert.assertEquals(3.14159, p.getValueAsDouble(9.9), 0.0001);
        p.setEmbeddedObject("NotANumber");
        Assert.assertEquals(9.9, p.getValueAsDouble(9.9), 0.0001);

        p.setCurrToken(JsonToken.START_OBJECT);
        Assert.assertEquals(9.9, p.getValueAsDouble(9.9), 0.0001);
    }

    @Test
    public void testGetValueAsString() throws IOException {
        MinimalParserImpl p = new MinimalParserImpl();

        Assert.assertNull(p.getValueAsString());
        Assert.assertEquals("default", p.getValueAsString("default"));

        p.setCurrToken(JsonToken.VALUE_STRING);
        p.setTextValue("hello");
        Assert.assertEquals("hello", p.getValueAsString());
        Assert.assertEquals("hello", p.getValueAsString("default"));

        p.setCurrToken(JsonToken.VALUE_NULL);
        Assert.assertNull(p.getValueAsString());
        Assert.assertEquals("default", p.getValueAsString("default"));

        p.setCurrToken(JsonToken.START_ARRAY);
        Assert.assertNull(p.getValueAsString());
        Assert.assertEquals("default", p.getValueAsString("default"));

        p.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        p.setTextValue("123");
        Assert.assertEquals("123", p.getValueAsString("default"));
    }

    @Test
    public void testBase64Decoding_validAndInvalid() throws IOException {
        MinimalParserImpl p = new MinimalParserImpl();
        Base64Variant variant = Base64Variants.MIME;

        p.setTextValue("AQIDBA==");
        byte[] bytes = p.getBinaryValue(variant);
        Assert.assertArrayEquals(new byte[]{1, 2, 3, 4}, bytes);

        p.setTextValue("!@#$%^&*");
        try {
            p.getBinaryValue(variant);
            Assert.fail("Expected JsonParseException for invalid base64");
        } catch (JsonParseException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedBase64ReportingMethods() {
        MinimalParserImpl p = new MinimalParserImpl();
        Base64Variant variant = Base64Variants.MIME;

        try {
            p._reportInvalidBase64(variant, ' ', 0, "space issue");
            Assert.fail("Expected exception");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal white space character"));
            Assert.assertTrue(e.getMessage().contains("space issue"));
        }

        try {
            p._reportInvalidBase64(variant, '=', 0, null);
            Assert.fail("Expected exception");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected padding character"));
        }

        try {
            p._reportInvalidBase64(variant, '\u0000', 0, "control char");
            Assert.fail("Expected exception");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal character (code 0x0)"));
        }

        try {
            p._reportInvalidBase64(variant, '?', 0, "custom msg");
            Assert.fail("Expected exception");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal character '?'"));
            Assert.assertTrue(e.getMessage().contains("custom msg"));
        }

        try {
            p._reportBase64EOF();
            Assert.fail("Expected exception");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-String in base64 content"));
        }
    }

    @Test
    public void testErrorReportingMethods() {
        MinimalParserImpl p = new MinimalParserImpl();
        p.setCurrToken(JsonToken.VALUE_STRING);

        try {
            p._reportUnexpectedChar('a', "comment");
            Assert.fail();
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected character ('a' (code 97)): comment"));
        }

        try {
            p._reportUnexpectedChar(-1, null);
            Assert.fail();
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-input in VALUE_STRING"));
        }

        try {
            p._reportInvalidEOF();
            Assert.fail();
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-input in VALUE_STRING"));
        }

        try {
            p._reportInvalidEOF(" custom");
            Assert.fail();
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-input custom"));
        }

        try {
            p._reportInvalidEOFInValue();
            Assert.fail();
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-input in a value"));
        }

        try {
            p._reportMissingRootWS('x');
            Assert.fail();
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Expected space separating root-level values"));
        }

        try {
            p._throwInvalidSpace('\b');
            Assert.fail();
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("only regular white space"));
        }

        try {
            p._wrapError("wrapped", new RuntimeException("cause"));
            Assert.fail();
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("wrapped"));
            Assert.assertNotNull(e.getCause());
        }

        try {
            p._throwInternal();
            Assert.fail();
        } catch (RuntimeException e) {
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void testUnquotedSpaceHandling() throws Exception {
        MinimalParserImpl pDisabled = new MinimalParserImpl();
        try {
            pDisabled._throwUnquotedSpace(10, "string value");
            Assert.fail();
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal unquoted character"));
        }

        MinimalParserImpl pEnabled = new MinimalParserImpl(Feature.ALLOW_UNQUOTED_CONTROL_CHARS.getMask());
        pEnabled._throwUnquotedSpace(10, "string value"); // suppressed

        try {
            pEnabled._throwUnquotedSpace(0x0021, "string value");
            Assert.fail();
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal unquoted character"));
        }
    }

    @Test
    public void testHandleUnrecognizedCharacterEscape() throws Exception {
        MinimalParserImpl pDefault = new MinimalParserImpl();
        try {
            pDefault._handleUnrecognizedCharacterEscape('z');
            Assert.fail();
        } catch (JsonProcessingException e) {
            Assert.assertTrue(e.getMessage().contains("Unrecognized character escape"));
        }

        MinimalParserImpl pBackslashAny = new MinimalParserImpl(Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER.getMask());
        char escaped = pBackslashAny._handleUnrecognizedCharacterEscape('z');
        Assert.assertEquals('z', escaped);

        MinimalParserImpl pSingleQuote = new MinimalParserImpl(Feature.ALLOW_SINGLE_QUOTES.getMask());
        char sq = pSingleQuote._handleUnrecognizedCharacterEscape('\'');
        Assert.assertEquals('\'', sq);
    }

    @Test
    public void testGetCharDesc() {
        Assert.assertEquals("(CTRL-CHAR, code 0)", ParserMinimalBase._getCharDesc(0));
        Assert.assertEquals("'a' (code 97)", ParserMinimalBase._getCharDesc('a'));
        Assert.assertEquals("'\u0100' (code 256 / 0x100)", ParserMinimalBase._getCharDesc(256));
    }

    @Test
    public void testAsciiConversionHelpers() {
        String testStr = "Jackson Parser";
        byte[] bytes = ParserMinimalBase._asciiBytes(testStr);
        Assert.assertEquals(testStr.length(), bytes.length);

        String roundTrip = ParserMinimalBase._ascii(bytes);
        Assert.assertEquals(testStr, roundTrip);

        byte[] emptyBytes = ParserMinimalBase._asciiBytes("");
        Assert.assertEquals(0, emptyBytes.length);
        Assert.assertEquals("", ParserMinimalBase._ascii(emptyBytes));
    }
}
