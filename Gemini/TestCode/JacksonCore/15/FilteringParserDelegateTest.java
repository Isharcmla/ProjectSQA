package com.fasterxml.jackson.core.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilteringParserDelegateTest {

    private final JsonFactory JSON_F = new JsonFactory();

    @Test
    public void testInitialStateAndTokenAccessors_beforeAndAfterFirstToken() throws IOException {
        String json = "{\"name\":\"test\"}";
        JsonParser p = JSON_F.createParser(json);
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate parser = new FilteringParserDelegate(p, filter, true, true);

        assertSame(filter, parser.getFilter());
        assertEquals(0, parser.getMatchCount());
        assertNull(parser.getCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
        assertFalse(parser.hasCurrentToken());
        assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));
        assertTrue(parser.hasToken(null));
        assertFalse(parser.hasToken(JsonToken.START_OBJECT));
        assertFalse(parser.isExpectedStartArrayToken());
        assertFalse(parser.isExpectedStartObjectToken());
        assertNull(parser.getLastClearedToken());

        JsonToken t = parser.nextToken();
        assertEquals(JsonToken.START_OBJECT, t);
        assertSame(JsonToken.START_OBJECT, parser.getCurrentToken());
        assertEquals(JsonTokenId.ID_START_OBJECT, parser.getCurrentTokenId());
        assertTrue(parser.hasCurrentToken());
        assertTrue(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertTrue(parser.hasToken(JsonToken.START_OBJECT));
        assertTrue(parser.isExpectedStartObjectToken());
        assertFalse(parser.isExpectedStartArrayToken());

        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
        assertEquals(JsonToken.START_OBJECT, parser.getLastClearedToken());
        assertFalse(parser.hasCurrentToken());

        parser.close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentName_throwsUnsupportedOperationException() throws IOException {
        String json = "{\"a\": 1}";
        JsonParser p = JSON_F.createParser(json);
        FilteringParserDelegate parser = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        parser.nextToken();
        parser.overrideCurrentName("b");
    }

    @Test
    public void testIncludeAll_objectAndArrayTraversal() throws IOException {
        String json = "{\"a\": [1, 2], \"b\": {\"c\": true}}";
        JsonParser p = JSON_F.createParser(json);
        FilteringParserDelegate parser = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertTrue(parser.isExpectedStartArrayToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("c", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertTrue(parser.getBooleanValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFilterByPropertyName_includePathTrue() throws IOException {
        String json = "{\"a\": 1, \"b\": {\"target\": 42, \"ignore\": 10}, \"c\": 3}";
        JsonParser p = JSON_F.createParser(json);

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("b".equals(name)) {
                    return this;
                }
                if ("target".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };

        FilteringParserDelegate parser = new FilteringParserDelegate(p, filter, true, false);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("target", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFilterByPropertyName_includePathFalse() throws IOException {
        String json = "{\"a\": 1, \"b\": 2, \"c\": 3}";
        JsonParser p = JSON_F.createParser(json);

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("b".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };

        FilteringParserDelegate parser = new FilteringParserDelegate(p, filter, false, false);

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFilterArrayElements_withPath() throws IOException {
        String json = "[10, [20, 30], 40]";
        JsonParser p = JSON_F.createParser(json);

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeElement(int index) {
                return this;
            }

            @Override
            public TokenFilter filterStartArray() {
                return this;
            }

            @Override
            public boolean includeValue(JsonParser p) throws IOException {
                return p.getIntValue() == 30;
            }
        };

        FilteringParserDelegate parser = new FilteringParserDelegate(p, filter, true, true);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(30, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFilter_skipStartObjectAndStartArray() throws IOException {
        String json = "{\"arr\": [1, 2], \"obj\": {\"x\": 1}, \"val\": 99}";
        JsonParser p = JSON_F.createParser(json);

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter filterStartObject() {
                return null;
            }

            @Override
            public TokenFilter filterStartArray() {
                return null;
            }

            @Override
            public TokenFilter includeProperty(String name) {
                return this;
            }

            @Override
            public boolean includeValue(JsonParser p) throws IOException {
                return p.getIntValue() == 99;
            }
        };

        FilteringParserDelegate parser = new FilteringParserDelegate(p, filter, false, false);

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(99, parser.getIntValue());
        assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFilter_filterStartObjectAndArrayReturningIncludeAll() throws IOException {
        String json = "{\"obj\": {\"x\": 1}, \"arr\": [1, 2]}";
        JsonParser p = JSON_F.createParser(json);

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter filterStartObject() {
                return TokenFilter.INCLUDE_ALL;
            }

            @Override
            public TokenFilter filterStartArray() {
                return TokenFilter.INCLUDE_ALL;
            }

            @Override
            public TokenFilter includeProperty(String name) {
                return this;
            }
        };

        FilteringParserDelegate parser = new FilteringParserDelegate(p, filter, true, true);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("obj", parser.getCurrentName());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("x", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("arr", parser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testNextValue_skipsFieldName() throws IOException {
        String json = "{\"a\": 1, \"b\": 2}";
        JsonParser p = JSON_F.createParser(json);
        FilteringParserDelegate parser = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, parser.nextValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextValue());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextValue());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextValue());
        assertNull(parser.nextValue());

        parser.close();
    }

    @Test
    public void testSkipChildren_onStartObjectAndStartArray() throws IOException {
        String json = "{\"a\": {\"nested\": 1}, \"b\": [2, 3], \"c\": 4}";
        JsonParser p = JSON_F.createParser(json);
        FilteringParserDelegate parser = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertSame(parser, parser.skipChildren());
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertSame(parser, parser.skipChildren());
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertSame(parser, parser.skipChildren());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testDelegatedAccessors_textAndNumericAndCoercions() throws IOException {
        String json = "{\n" +
                "  \"str\": \"hello world\",\n" +
                "  \"int\": 123,\n" +
                "  \"long\": 9876543210,\n" +
                "  \"double\": 45.67,\n" +
                "  \"float\": 1.25,\n" +
                "  \"bigInt\": 12345678901234567890,\n" +
                "  \"bigDec\": 12345.67890,\n" +
                "  \"bool\": true,\n" +
                "  \"null\": null,\n" +
                "  \"bin\": \"AQIDBA==\"\n" +
                "}";

        JsonParser p = JSON_F.createParser(json);
        FilteringParserDelegate parser = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertNotNull(parser.getCurrentLocation());
        assertNotNull(parser.getTokenLocation());
        assertNotNull(parser.getParsingContext());
        assertNull(parser.getCurrentName());

        // "str"
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("str", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello world", parser.getText());
        assertTrue(parser.hasTextCharacters());
        assertNotNull(parser.getTextCharacters());
        assertEquals(11, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertEquals("hello world", parser.getValueAsString());
        assertEquals("hello world", parser.getValueAsString("default"));

        // "int"
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals(123, parser.getValueAsInt());
        assertEquals(123, parser.getValueAsInt(0));
        assertEquals(123L, parser.getValueAsLong());
        assertEquals(123L, parser.getValueAsLong(0L));
        assertEquals(123.0, parser.getValueAsDouble(), 0.001);
        assertEquals(123.0, parser.getValueAsDouble(0.0), 0.001);
        assertEquals((byte) 123, parser.getByteValue());
        assertEquals((short) 123, parser.getShortValue());
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
        assertEquals(Integer.valueOf(123), parser.getNumberValue());

        // "long"
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(9876543210L, parser.getLongValue());
        assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());

        // "double"
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(45.67, parser.getDoubleValue(), 0.0001);
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());

        // "float"
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1.25f, parser.getFloatValue(), 0.001f);

        // "bigInt"
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(new BigInteger("12345678901234567890"), parser.getBigIntegerValue());
        assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());

        // "bigDec"
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(new BigDecimal("12345.67890"), parser.getDecimalValue());
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());

        // "bool"
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertTrue(parser.getBooleanValue());
        assertTrue(parser.getValueAsBoolean());
        assertTrue(parser.getValueAsBoolean(false));

        // "null"
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.getEmbeddedObject());

        // "bin"
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] bytes = parser.getBinaryValue(Base64Variants.MIME);
        assertArrayEquals(new byte[]{1, 2, 3, 4}, bytes);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int bytesRead = parser.readBinaryValue(Base64Variants.MIME, baos);
        assertEquals(4, bytesRead);
        assertArrayEquals(new byte[]{1, 2, 3, 4}, baos.toByteArray());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testEmptyJsonStructures_andContextNames() throws IOException {
        String json = "{\"emptyObj\": {}, \"emptyArr\": []}";
        JsonParser p = JSON_F.createParser(json);
        FilteringParserDelegate parser = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertNull(parser.getCurrentName());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("emptyObj", parser.getCurrentName());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals("emptyObj", parser.getCurrentName());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("emptyArr", parser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals("emptyArr", parser.getCurrentName());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testScalarFilter_includeValueFalse() throws IOException {
        String json = "[1, 2, 3]";
        JsonParser p = JSON_F.createParser(json);

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter filterStartArray() {
                return this;
            }

            @Override
            public boolean includeValue(JsonParser p) throws IOException {
                return p.getIntValue() == 2;
            }
        };

        FilteringParserDelegate parser = new FilteringParserDelegate(p, filter, false, false);

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testMultipleMatches_nestedObjectsAndArrays() throws IOException {
        String json = "{\"items\": [{\"id\": 1, \"val\": \"a\"}, {\"id\": 2, \"val\": \"b\"}]}";
        JsonParser p = JSON_F.createParser(json);

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("items".equals(name) || "id".equals(name)) {
                    return this;
                }
                return null;
            }

            @Override
            public TokenFilter filterStartArray() {
                return this;
            }

            @Override
            public TokenFilter filterStartObject() {
                return this;
            }

            @Override
            public boolean includeValue(JsonParser p) {
                return true;
            }
        };

        FilteringParserDelegate parser = new FilteringParserDelegate(p, filter, true, true);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("items", parser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("id", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("id", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
    }
}
