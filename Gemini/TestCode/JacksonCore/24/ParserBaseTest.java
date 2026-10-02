package com.fasterxml.jackson.core.base;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;

public class ParserBaseTest {

    static class StubParser extends ParserBase {
        private String _text;
        private boolean _inputClosed = false;
        private char _escapedChar = 'n';

        public StubParser(IOContext ctxt, int features) {
            super(ctxt, features);
        }

        public void setCurrToken(JsonToken t) {
            _currToken = t;
        }

        public void setText(String text) {
            _text = text;
            _textBuffer.resetWithString(text);
        }

        public void setEscapedChar(char c) {
            _escapedChar = c;
        }

        public void setParsingContext(JsonReadContext ctxt) {
            _parsingContext = ctxt;
        }

        public void setNameCopied(boolean b) {
            _nameCopied = b;
        }

        public void setInputPtr(int ptr) {
            _inputPtr = ptr;
        }

        public void setInputEnd(int end) {
            _inputEnd = end;
        }

        public void setCurrInputRow(int row) {
            _currInputRow = row;
        }

        public void setCurrInputRowStart(int start) {
            _currInputRowStart = start;
        }

        public void setCurrInputProcessed(long proc) {
            _currInputProcessed = proc;
        }

        public void setTokenInputTotal(long total) {
            _tokenInputTotal = total;
        }

        public void setTokenInputRow(int row) {
            _tokenInputRow = row;
        }

        public void setTokenInputCol(int col) {
            _tokenInputCol = col;
        }

        public void setNameCopyBuffer(char[] buf) {
            _nameCopyBuffer = buf;
        }

        @Override
        protected void _closeInput() throws IOException {
            _inputClosed = true;
        }

        @Override
        protected char _decodeEscaped() throws IOException {
            return _escapedChar;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            return _currToken;
        }

        @Override
        public String getText() throws IOException {
            if (_currToken == JsonToken.VALUE_STRING) {
                return _textBuffer.contentsAsString();
            }
            if (_currToken == JsonToken.FIELD_NAME) {
                return getCurrentName();
            }
            if (_currToken != null && _currToken.isNumeric()) {
                return _textBuffer.contentsAsString();
            }
            return _text;
        }

        @Override
        public char[] getTextCharacters() throws IOException {
            return _textBuffer.getTextBuffer();
        }

        @Override
        public int getTextLength() throws IOException {
            return _textBuffer.size();
        }

        @Override
        public int getTextOffset() throws IOException {
            return _textBuffer.getTextOffset();
        }

        @Override
        public ObjectCodec getCodec() {
            return null;
        }

        @Override
        public void setCodec(ObjectCodec c) {
        }
    }

    private StubParser createParser(int features) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, ContentReference.rawReference("test-src"), false);
        return new StubParser(ctxt, features);
    }

    private StubParser createParser() {
        return createParser(0);
    }

    @Test
    public void testVersion_notNull() {
        StubParser parser = createParser();
        Version v = parser.version();
        Assert.assertNotNull(v);
        Assert.assertFalse(v.isUnknownVersion());
    }

    @Test
    public void testCurrentValue_getterAndSetter() {
        StubParser parser = createParser();
        Assert.assertNull(parser.getCurrentValue());
        Object val = new Object();
        parser.setCurrentValue(val);
        Assert.assertSame(val, parser.getCurrentValue());
    }

    @Test
    public void testFeatureEnableDisable_strictDuplicateDetection() {
        StubParser parser = createParser(0);
        Assert.assertNull(parser.getParsingContext().getDupDetector());

        parser.enable(Feature.STRICT_DUPLICATE_DETECTION);
        Assert.assertTrue(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        Assert.assertNotNull(parser.getParsingContext().getDupDetector());

        // Enabling again should keep existing dup detector
        DupDetector dup = parser.getParsingContext().getDupDetector();
        parser.enable(Feature.STRICT_DUPLICATE_DETECTION);
        Assert.assertSame(dup, parser.getParsingContext().getDupDetector());

        // Disable feature
        parser.disable(Feature.STRICT_DUPLICATE_DETECTION);
        Assert.assertFalse(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        Assert.assertNull(parser.getParsingContext().getDupDetector());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testSetFeatureMask_duplicateDetection() {
        StubParser parser = createParser(0);
        int mask = Feature.STRICT_DUPLICATE_DETECTION.getMask();

        parser.setFeatureMask(mask);
        Assert.assertTrue(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        Assert.assertNotNull(parser.getParsingContext().getDupDetector());

        // Call again with same mask (no change)
        parser.setFeatureMask(mask);
        Assert.assertTrue(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));

        // Unset
        parser.setFeatureMask(0);
        Assert.assertFalse(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        Assert.assertNull(parser.getParsingContext().getDupDetector());
    }

    @Test
    public void testOverrideStdFeatures() {
        StubParser parser = createParser(0);
        int dupMask = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        int autoCloseMask = Feature.AUTO_CLOSE_SOURCE.getMask();

        // Turn on STRICT_DUPLICATE_DETECTION
        parser.overrideStdFeatures(dupMask, dupMask);
        Assert.assertTrue(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        Assert.assertNotNull(parser.getParsingContext().getDupDetector());

        // Turn on AUTO_CLOSE_SOURCE with no change to duplicate detection
        parser.overrideStdFeatures(autoCloseMask, autoCloseMask);
        Assert.assertTrue(parser.isEnabled(Feature.AUTO_CLOSE_SOURCE));
        Assert.assertTrue(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));

        // Turn off duplicate detection
        parser.overrideStdFeatures(0, dupMask);
        Assert.assertFalse(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        Assert.assertNull(parser.getParsingContext().getDupDetector());

        // No-op override
        parser.overrideStdFeatures(0, 0);
        Assert.assertFalse(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testCurrentName_andOverrideCurrentName() throws IOException {
        StubParser parser = createParser();
        JsonReadContext root = parser.getParsingContext();
        JsonReadContext objCtx = root.createChildObjectContext(1, 1);
        parser.setParsingContext(objCtx);

        parser.overrideCurrentName("initialName");
        Assert.assertEquals("initialName", parser.getCurrentName());

        // Test start array and start object lookups from parent
        parser.setCurrToken(JsonToken.START_OBJECT);
        JsonReadContext childObj = objCtx.createChildObjectContext(1, 2);
        parser.setParsingContext(childObj);
        Assert.assertEquals("initialName", parser.getCurrentName());

        parser.overrideCurrentName("updatedParentName");
        Assert.assertEquals("updatedParentName", parser.getCurrentName());

        parser.setCurrToken(JsonToken.START_ARRAY);
        Assert.assertEquals("updatedParentName", parser.getCurrentName());

        parser.setCurrToken(JsonToken.VALUE_STRING);
        Assert.assertNull(parser.getCurrentName());
    }

    @Test
    public void testClose_lifecycle() throws IOException {
        StubParser parser = createParser();
        parser.setInputPtr(5);
        parser.setInputEnd(10);
        parser.setNameCopyBuffer(new char[16]);

        Assert.assertFalse(parser.isClosed());
        parser.close();
        Assert.assertTrue(parser.isClosed());
        Assert.assertTrue(parser._inputClosed);
        Assert.assertTrue(parser._inputPtr >= 10);

        // Multiple close calls should be safe
        parser.close();
        Assert.assertTrue(parser.isClosed());
    }

    @Test
    public void testLocations() {
        StubParser parser = createParser(Feature.INCLUDE_SOURCE_IN_LOCATION.getMask());
        parser.setInputPtr(10);
        parser.setCurrInputRowStart(5);
        parser.setCurrInputProcessed(100);
        parser.setCurrInputRow(3);

        parser.setTokenInputTotal(50);
        parser.setTokenInputRow(2);
        parser.setTokenInputCol(4);

        JsonLocation curLoc = parser.getCurrentLocation();
        Assert.assertEquals(3, curLoc.getLineNr());
        Assert.assertEquals(6, curLoc.getColumnNr());
        Assert.assertEquals(110L, curLoc.getCharOffset());
        Assert.assertNotNull(curLoc.getSourceRef());

        JsonLocation tokLoc = parser.getTokenLocation();
        Assert.assertEquals(2, tokLoc.getLineNr());
        Assert.assertEquals(5, tokLoc.getColumnNr());
        Assert.assertEquals(50L, tokLoc.getCharOffset());

        // Negative column test
        parser.setTokenInputCol(-1);
        Assert.assertEquals(-1, parser.getTokenColumnNr());

        Assert.assertEquals(50L, parser.getTokenCharacterOffset());
        Assert.assertEquals(2, parser.getTokenLineNr());

        // Disabled source reference
        parser.disable(Feature.INCLUDE_SOURCE_IN_LOCATION);
        Assert.assertNull(parser._getSourceReference());
    }

    @Test
    public void testHasTextCharacters() {
        StubParser parser = createParser();

        parser.setCurrToken(JsonToken.VALUE_STRING);
        Assert.assertTrue(parser.hasTextCharacters());

        parser.setCurrToken(JsonToken.FIELD_NAME);
        parser.setNameCopied(false);
        Assert.assertFalse(parser.hasTextCharacters());
        parser.setNameCopied(true);
        Assert.assertTrue(parser.hasTextCharacters());

        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        Assert.assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetBinaryValue_validAndCached() throws IOException {
        StubParser parser = createParser();
        parser.setCurrToken(JsonToken.VALUE_STRING);
        // Base64 encoding of "Hello" is "SGVsbG8="
        parser.setText("SGVsbG8=");

        byte[] b1 = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals("Hello".getBytes("UTF-8"), b1);

        // Call again should return cached instance
        byte[] b2 = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertSame(b1, b2);
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValue_invalidToken() throws IOException {
        StubParser parser = createParser();
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.getBinaryValue(Base64Variants.MIME);
    }

    @Test
    public void testGetByteArrayBuilder() {
        StubParser parser = createParser();
        ByteArrayBuilder b1 = parser._getByteArrayBuilder();
        Assert.assertNotNull(b1);
        b1.append(123);

        ByteArrayBuilder b2 = parser._getByteArrayBuilder();
        Assert.assertSame(b1, b2);
        Assert.assertEquals(0, b2.size());
    }

    @Test
    public void testHandleEOF() {
        StubParser parser = createParser();
        // In root context, EOF is legal
        try {
            parser._handleEOF();
        } catch (JsonParseException e) {
            Assert.fail("EOF in root should be allowed");
        }

        // Inside array context
        JsonReadContext arrCtx = parser.getParsingContext().createChildArrayContext(1, 1);
        parser.setParsingContext(arrCtx);
        try {
            parser._handleEOF();
            Assert.fail("Expected JsonParseException for EOF in array");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("expected close marker for Array"));
        }

        // Inside object context
        JsonReadContext root = JsonReadContext.createRootContext(null);
        JsonReadContext objCtx = root.createChildObjectContext(1, 1);
        parser.setParsingContext(objCtx);
        try {
            parser._eofAsNextChar();
            Assert.fail("Expected JsonParseException for EOF in object");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("expected close marker for Object"));
        }
    }

    @Test
    public void testResetAndNumberTypes() {
        StubParser parser = createParser();

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.reset(false, 5, 0, 0));
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.reset(true, 3, 2, 1));
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.resetInt(true, 4).equals(JsonToken.VALUE_NUMBER_INT)
                ? parser.resetFloat(true, 4, 2, 1) : null);
    }

    @Test
    public void testResetAsNaN_andIsNaN() {
        StubParser parser = createParser();
        Assert.assertFalse(parser.isNaN());

        JsonToken t = parser.resetAsNaN("NaN", Double.NaN);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, t);
        parser.setCurrToken(t);
        Assert.assertTrue(parser.isNaN());

        parser.resetAsNaN("Infinity", Double.POSITIVE_INFINITY);
        Assert.assertTrue(parser.isNaN());

        parser.resetAsNaN("-Infinity", Double.NEGATIVE_INFINITY);
        Assert.assertTrue(parser.isNaN());

        parser.resetAsNaN("123.45", 123.45);
        Assert.assertFalse(parser.isNaN());
    }

    @Test
    public void testNumericIntParsing_smallAndMediumAndLarge() throws IOException {
        StubParser parser = createParser();

        // 1. Small int (<= 9 chars)
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.resetInt(false, 5);
        parser.setText("12345");
        Assert.assertEquals(12345, parser.getIntValue());
        Assert.assertEquals(12345L, parser.getLongValue());
        Assert.assertEquals(12345.0, parser.getDoubleValue(), 0.001);
        Assert.assertEquals(12345.0f, parser.getFloatValue(), 0.001f);
        Assert.assertEquals(BigInteger.valueOf(12345), parser.getBigIntegerValue());
        Assert.assertEquals(BigDecimal.valueOf(12345), parser.getDecimalValue());
        Assert.assertEquals(NumberType.INT, parser.getNumberType());
        Assert.assertEquals(Integer.valueOf(12345), parser.getNumberValue());

        // 2. Negative 10-char int within MIN_VALUE
        parser.resetInt(true, 10);
        parser.setText("-2147483648");
        Assert.assertEquals(Integer.MIN_VALUE, parser.getIntValue());
        Assert.assertEquals(NumberType.INT, parser.getNumberType());

        // 3. Positive 10-char int within MAX_VALUE
        parser.resetInt(false, 10);
        parser.setText("2147483647");
        Assert.assertEquals(Integer.MAX_VALUE, parser.getIntValue());
        Assert.assertEquals(NumberType.INT, parser.getNumberType());

        // 4. Positive 10-char exceeding int -> long
        parser.resetInt(false, 10);
        parser.setText("3000000000");
        Assert.assertEquals(3000000000L, parser.getLongValue());
        Assert.assertEquals(NumberType.LONG, parser.getNumberType());
        Assert.assertEquals(Long.valueOf(3000000000L), parser.getNumberValue());

        // 5. Negative 10-char exceeding int -> long
        parser.resetInt(true, 10);
        parser.setText("-3000000000");
        Assert.assertEquals(-3000000000L, parser.getLongValue());
        Assert.assertEquals(NumberType.LONG, parser.getNumberType());

        // 6. Medium long (11-18 chars)
        parser.resetInt(false, 15);
        parser.setText("123456789012345");
        Assert.assertEquals(123456789012345L, parser.getLongValue());
        Assert.assertEquals(NumberType.LONG, parser.getNumberType());

        // 7. Slow long in Long range (19 chars)
        parser.resetInt(false, 19);
        parser.setText("9223372036854775806");
        Assert.assertEquals(9223372036854775806L, parser.getLongValue());
        Assert.assertEquals(NumberType.LONG, parser.getNumberType());

        // 8. BigInteger (> Long.MAX_VALUE)
        parser.resetInt(false, 25);
        parser.setText("1234567890123456789012345");
        Assert.assertEquals(new BigInteger("1234567890123456789012345"), parser.getBigIntegerValue());
        Assert.assertEquals(NumberType.BIG_INTEGER, parser.getNumberType());
        Assert.assertEquals(new BigInteger("1234567890123456789012345"), parser.getNumberValue());
    }

    @Test
    public void testNumericFloatParsing() throws IOException {
        StubParser parser = createParser();

        // Standard float -> Double
        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.resetFloat(false, 3, 2, 0);
        parser.setText("123.45");
        Assert.assertEquals(123.45, parser.getDoubleValue(), 0.001);
        Assert.assertEquals(123.45f, parser.getFloatValue(), 0.001f);
        Assert.assertEquals(NumberType.DOUBLE, parser.getNumberType());
        Assert.assertEquals(Double.valueOf(123.45), parser.getNumberValue());

        // Decimal requested directly
        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.resetFloat(false, 3, 2, 0);
        parser.setText("123.45");
        Assert.assertEquals(new BigDecimal("123.45"), parser.getDecimalValue());
        Assert.assertEquals(NumberType.BIG_DECIMAL, parser.getNumberType());
        Assert.assertEquals(new BigDecimal("123.45"), parser.getNumberValue());
    }

    @Test
    public void testNumericConversionsAndOverflows() throws IOException {
        StubParser parser = createParser();

        // 1. Long to Int overflow
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.resetInt(false, 15);
        parser.setText("999999999999");
        try {
            parser.getIntValue();
            Assert.fail("Expected overflow error");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("out of range of int"));
        }

        // 2. BigInteger to Int and Long overflow
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.resetInt(false, 25);
        parser.setText("1000000000000000000000000");
        try {
            parser.getIntValue();
            Assert.fail("Expected int overflow");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Numeric value") || e.getMessage().contains("out of range"));
        }

        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.resetInt(false, 25);
        parser.setText("1000000000000000000000000");
        try {
            parser.getLongValue();
            Assert.fail("Expected long overflow");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Numeric value") || e.getMessage().contains("out of range"));
        }

        // 3. Double to Int and Long overflow
        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.resetFloat(false, 20, 1, 0);
        parser.setText("1e30");
        try {
            parser.getIntValue();
            Assert.fail("Expected double to int overflow");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Overflow") || e.getMessage().contains("out of range"));
        }

        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.resetFloat(false, 20, 1, 0);
        parser.setText("1e30");
        try {
            parser.getLongValue();
            Assert.fail("Expected double to long overflow");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Overflow") || e.getMessage().contains("out of range"));
        }

        // 4. BigDecimal to Int and Long overflow
        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.resetFloat(false, 20, 1, 0);
        parser.setText("1e30");
        parser.getDecimalValue(); // force BigDecimal parse
        try {
            parser.getIntValue();
            Assert.fail("Expected BD to int overflow");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Overflow") || e.getMessage().contains("out of range"));
        }

        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.resetFloat(false, 20, 1, 0);
        parser.setText("1e30");
        parser.getDecimalValue();
        try {
            parser.getLongValue();
            Assert.fail("Expected BD to long overflow");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Overflow") || e.getMessage().contains("out of range"));
        }
    }

    @Test
    public void testConvertNumberToBigInteger_allSources() throws IOException {
        StubParser parser = createParser();

        // From BD
        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.resetFloat(false, 3, 2, 0);
        parser.setText("123.45");
        parser.getDecimalValue();
        Assert.assertEquals(BigInteger.valueOf(123), parser.getBigIntegerValue());

        // From Long
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.resetInt(false, 12);
        parser.setText("123456789012");
        Assert.assertEquals(new BigInteger("123456789012"), parser.getBigIntegerValue());

        // From Double
        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.resetFloat(false, 3, 1, 0);
        parser.setText("500.5");
        Assert.assertEquals(BigInteger.valueOf(500), parser.getBigIntegerValue());
    }

    @Test
    public void testConvertNumberToDouble_allSources() throws IOException {
        StubParser parser = createParser();

        // From BD
        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.resetFloat(false, 2, 2, 0);
        parser.setText("10.50");
        parser.getDecimalValue();
        Assert.assertEquals(10.5, parser.getDoubleValue(), 0.001);

        // From BigInt
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.resetInt(false, 20);
        parser.setText("10000000000000000000");
        Assert.assertEquals(1e19, parser.getDoubleValue(), 1e15);

        // From Long
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.resetInt(false, 11);
        parser.setText("12345678901");
        Assert.assertEquals(12345678901.0, parser.getDoubleValue(), 0.001);
    }

    @Test
    public void testConvertNumberToBigDecimal_allSources() throws IOException {
        StubParser parser = createParser();

        // From BigInt
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.resetInt(false, 20);
        parser.setText("10000000000000000000");
        Assert.assertEquals(new BigDecimal("10000000000000000000"), parser.getDecimalValue());

        // From Long
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.resetInt(false, 11);
        parser.setText("12345678901");
        Assert.assertEquals(BigDecimal.valueOf(12345678901L), parser.getDecimalValue());

        // From Int
        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.resetInt(false, 3);
        parser.setText("123");
        Assert.assertEquals(BigDecimal.valueOf(123), parser.getDecimalValue());
    }

    @Test(expected = JsonParseException.class)
    public void testParseNumericValue_nonNumericToken() throws IOException {
        StubParser parser = createParser();
        parser.setCurrToken(JsonToken.VALUE_STRING);
        parser.getIntValue();
    }

    @Test
    public void testErrorReportingMethods() {
        StubParser parser = createParser();

        // Mismatched end marker
        try {
            parser._reportMismatchedEndMarker(']', '}');
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected close marker ']'"));
        }

        // Unrecognized character escape
        try {
            parser._handleUnrecognizedCharacterEscape('z');
            Assert.fail("Expected JsonParseException");
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().contains("Unrecognized character escape 'z'"));
        }

        // Enabled backslash escaping any character
        parser.enable(Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER);
        try {
            char res = parser._handleUnrecognizedCharacterEscape('z');
            Assert.assertEquals('z', res);
        } catch (Exception e) {
            Assert.fail("Should allow escaped character");
        }
        parser.disable(Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER);

        // Single quote escape allowed
        parser.enable(Feature.ALLOW_SINGLE_QUOTES);
        try {
            char res = parser._handleUnrecognizedCharacterEscape('\'');
            Assert.assertEquals('\'', res);
        } catch (Exception e) {
            Assert.fail("Should allow escaped single quote");
        }
        parser.disable(Feature.ALLOW_SINGLE_QUOTES);

        // Unquoted space / control chars
        try {
            parser._throwUnquotedSpace(0, "string value");
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal unquoted character"));
        }

        parser.enable(Feature.ALLOW_UNQUOTED_CONTROL_CHARS);
        try {
            parser._throwUnquotedSpace(0, "string value"); // should pass when enabled and <= 32
        } catch (JsonParseException e) {
            Assert.fail("Should not throw when ALLOW_UNQUOTED_CONTROL_CHARS is enabled");
        }
        parser.disable(Feature.ALLOW_UNQUOTED_CONTROL_CHARS);
    }

    @Test
    public void testBase64EscapeDecoding() throws IOException {
        StubParser parser = createParser();
        Base64Variant variant = Base64Variants.MIME;

        // Valid base64 escaped char '\' followed by 'A' (char 'A' decodes to 0)
        parser.setEscapedChar('A');
        int bits = parser._decodeBase64Escape(variant, '\\', 0);
        Assert.assertEquals(0, bits);

        bits = parser._decodeBase64Escape(variant, (int) '\\', 0);
        Assert.assertEquals(0, bits);

        // Escaped whitespace at index 0 (should skip / return -1)
        parser.setEscapedChar(' ');
        Assert.assertEquals(-1, parser._decodeBase64Escape(variant, '\\', 0));
        Assert.assertEquals(-1, parser._decodeBase64Escape(variant, (int) '\\', 0));

        // Escaped whitespace at index 1 (illegal)
        try {
            parser._decodeBase64Escape(variant, '\\', 1);
            Assert.fail("Expected IllegalArgumentException for whitespace at index 1");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal white space character"));
        }

        // Invalid non-backslash initial char
        try {
            parser._decodeBase64Escape(variant, 'X', 0);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal character 'X'"));
        }

        // Padding character at invalid index 0
        parser.setEscapedChar('=');
        try {
            parser._decodeBase64Escape(variant, '\\', 0);
            Assert.fail("Expected IllegalArgumentException for padding at index 0");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected padding character"));
        }

        // Padding character at valid index 2
        int padBits = parser._decodeBase64Escape(variant, '\\', 2);
        Assert.assertEquals(Base64Variant.BASE64_VALUE_PADDING, padBits);
    }

    @Test
    public void testReportInvalidBase64CharVariants() {
        StubParser parser = createParser();
        Base64Variant variant = Base64Variants.MIME;

        IllegalArgumentException ex = parser.reportInvalidBase64Char(variant, ' ', 1);
        Assert.assertTrue(ex.getMessage().contains("Illegal white space character"));

        ex = parser.reportInvalidBase64Char(variant, '=', 0);
        Assert.assertTrue(ex.getMessage().contains("Unexpected padding character"));

        ex = parser.reportInvalidBase64Char(variant, 0x07, 0); // Bell control char
        Assert.assertTrue(ex.getMessage().contains("Illegal character (code 0x7)"));

        ex = parser.reportInvalidBase64Char(variant, '$', 0, "custom msg");
        Assert.assertTrue(ex.getMessage().contains("Illegal character '$'") && ex.getMessage().contains("custom msg"));
    }

    @Test
    public void testHandleBase64MissingPadding() {
        StubParser parser = createParser();
        try {
            parser._handleBase64MissingPadding(Base64Variants.MIME);
            Assert.fail("Expected JsonParseException");
        } catch (IOException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testGrowArrayBy() {
        int[] empty = ParserBase.growArrayBy(null, 5);
        Assert.assertNotNull(empty);
        Assert.assertEquals(5, empty.length);

        int[] original = new int[]{1, 2, 3};
        int[] grown = ParserBase.growArrayBy(original, 2);
        Assert.assertEquals(5, grown.length);
        Assert.assertEquals(1, grown[0]);
        Assert.assertEquals(2, grown[1]);
        Assert.assertEquals(3, grown[2]);
        Assert.assertEquals(0, grown[3]);
        Assert.assertEquals(0, grown[4]);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedMethods() throws IOException {
        StubParser parser = createParser();
        Assert.assertFalse(parser.loadMore());

        parser._finishString(); // should do nothing without exception

        try {
            parser.loadMoreGuaranteed();
            Assert.fail("Expected EOF exception");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-input"));
        }
    }
}
