package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FilteringParserDelegateTest {

    private final JsonFactory jsonFactory = new JsonFactory();

    private FilteringParserDelegate createFilteringParser(String json, TokenFilter filter, boolean includePath, boolean allowMultipleMatches) throws IOException {
        JsonParser p = jsonFactory.createParser(json);
        return new FilteringParserDelegate(p, filter, includePath, allowMultipleMatches);
    }

    @Test
    public void testConstructorAndInitialState_normalInput_expectedInitialValues() throws IOException {
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate parser = createFilteringParser("{\"a\":1}", filter, true, false);

        Assert.assertSame(filter, parser.getFilter());
        Assert.assertEquals(0, parser.getMatchCount());
        Assert.assertNull(parser.getCurrentToken());
        Assert.assertNull(parser.currentToken());
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, parser.currentTokenId());
        Assert.assertFalse(parser.hasCurrentToken());
        Assert.assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        Assert.assertFalse(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));
        Assert.assertTrue(parser.hasToken(null));
        Assert.assertFalse(parser.hasToken(JsonToken.START_OBJECT));
        Assert.assertFalse(parser.isExpectedStartArrayToken());
        Assert.assertFalse(parser.isExpectedStartObjectToken());
        Assert.assertNull(parser.getLastClearedToken());
        Assert.assertNotNull(parser.getParsingContext());
        Assert.assertNotNull(parser.getCurrentLocation());

        parser.close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentName_alwaysThrowsUnsupportedOperationException() throws IOException {
        FilteringParserDelegate parser = createFilteringParser("{\"a\":1}", TokenFilter.INCLUDE_ALL, true, true);
        try {
            parser.overrideCurrentName("otherName");
        } finally {
            parser.close();
        }
    }

    @Test
    public void testClearCurrentTokenAndGetLastClearedToken_withActiveToken_updatesClearedToken() throws IOException {
        FilteringParserDelegate parser = createFilteringParser("{\"a\":1}", TokenFilter.INCLUDE_ALL, true, true);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertTrue(parser.hasCurrentToken());
        Assert.assertTrue(parser.isExpectedStartObjectToken());

        parser.clearCurrentToken();
        Assert.assertNull(parser.getCurrentToken());
        Assert.assertFalse(parser.hasCurrentToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.getLastClearedToken());

        // Calling clear again when _currToken is null shouldn't overwrite _lastClearedToken
        parser.clearCurrentToken();
        Assert.assertEquals(JsonToken.START_OBJECT, parser.getLastClearedToken());

        parser.close();
    }

    @Test
    public void testTokensAndPredicates_arrayAndObjectInputs_expectedTokenIdentification() throws IOException {
        FilteringParserDelegate parser = createFilteringParser("[123]", TokenFilter.INCLUDE_ALL, true, true);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertTrue(parser.isExpectedStartArrayToken());
        Assert.assertFalse(parser.isExpectedStartObjectToken());
        Assert.assertTrue(parser.hasToken(JsonToken.START_ARRAY));
        Assert.assertTrue(parser.hasTokenId(JsonTokenId.ID_START_ARRAY));
        Assert.assertEquals(JsonTokenId.ID_START_ARRAY, parser.getCurrentTokenId());
        Assert.assertEquals(JsonTokenId.ID_START_ARRAY, parser.currentTokenId());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertFalse(parser.isExpectedStartArrayToken());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testGetCurrentName_variousTokenPositions_returnsExpectedNames() throws IOException {
        String json = "{\"obj\":{\"nested\":1}, \"arr\":[2]}";
        FilteringParserDelegate parser = createFilteringParser(json, TokenFilter.INCLUDE_ALL, true, true);

        // START_OBJECT (root)
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertNull(parser.getCurrentName());

        // FIELD_NAME 'obj'
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("obj", parser.getCurrentName());

        // START_OBJECT nested
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals("obj", parser.getCurrentName());

        // FIELD_NAME 'nested'
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("nested", parser.getCurrentName());

        // VALUE_NUMBER_INT 1
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("nested", parser.getCurrentName());

        // END_OBJECT
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        // FIELD_NAME 'arr'
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("arr", parser.getCurrentName());

        // START_ARRAY
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals("arr", parser.getCurrentName());

        // VALUE_NUMBER_INT 2
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        // END_ARRAY
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        // END_OBJECT (root)
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        parser.close();
    }

    @Test
    public void testNextValue_withObjectProperties_skipsFieldNameAndReturnsValue() throws IOException {
        FilteringParserDelegate parser = createFilteringParser("{\"a\":1, \"b\":\"text\"}", TokenFilter.INCLUDE_ALL, true, true);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextValue());
        Assert.assertEquals("a", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextValue());
        Assert.assertEquals("b", parser.getCurrentName());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextValue());
        Assert.assertNull(parser.nextValue());

        parser.close();
    }

    @Test
    public void testSkipChildren_onObjectAndArray_skipsEntireStructure() throws IOException {
        FilteringParserDelegate parser = createFilteringParser("{\"a\":[1,2,{\"k\":\"v\"}], \"b\":42}", TokenFilter.INCLUDE_ALL, true, true);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("a", parser.getCurrentName());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        // Skip the array
        parser.skipChildren();
        Assert.assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());

        // Next token should be the field 'b'
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("b", parser.getCurrentName());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(42, parser.getIntValue());

        // Calling skipChildren on a scalar is a no-op
        parser.skipChildren();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testSkipChildren_onRootObject_skipsToEnd() throws IOException {
        FilteringParserDelegate parser = createFilteringParser("{\"x\":1,\"y\":2}", TokenFilter.INCLUDE_ALL, true, true);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.skipChildren();
        Assert.assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testSkipChildren_unclosedJson_handlesNullGracefully() throws IOException {
        FilteringParserDelegate parser = createFilteringParser("{\"x\":1", TokenFilter.INCLUDE_ALL, true, true);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        // Skip children will encounter EOF before matching END_OBJECT
        parser.skipChildren();
        parser.close();
    }

    @Test
    public void testValueAccessors_scalarJsonTypes_delegatesCorrectly() throws IOException {
        String json = "{\"intVal\": 100, \"longVal\": 9876543210, \"doubleVal\": 12.34, \"boolVal\": true, \"strVal\": \"hello\", \"binVal\": \"aGVsbG8=\"}";
        FilteringParserDelegate parser = createFilteringParser(json, TokenFilter.INCLUDE_ALL, true, true);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        // intVal
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(100, parser.getIntValue());
        Assert.assertEquals(100, parser.getValueAsInt());
        Assert.assertEquals(100, parser.getValueAsInt(5));
        Assert.assertEquals((byte) 100, parser.getByteValue());
        Assert.assertEquals((short) 100, parser.getShortValue());
        Assert.assertEquals(100L, parser.getLongValue());
        Assert.assertEquals(100L, parser.getValueAsLong());
        Assert.assertEquals(100L, parser.getValueAsLong(50L));
        Assert.assertEquals(100.0f, parser.getFloatValue(), 0.001f);
        Assert.assertEquals(100.0, parser.getDoubleValue(), 0.001);
        Assert.assertEquals(100.0, parser.getValueAsDouble(), 0.001);
        Assert.assertEquals(100.0, parser.getValueAsDouble(50.0), 0.001);
        Assert.assertEquals(BigInteger.valueOf(100), parser.getBigIntegerValue());
        Assert.assertEquals(BigDecimal.valueOf(100), parser.getDecimalValue());
        Assert.assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
        Assert.assertEquals(100, parser.getNumberValue().intValue());
        Assert.assertEquals("100", parser.getText());
        Assert.assertTrue(parser.hasTextCharacters());
        Assert.assertNotNull(parser.getTextCharacters());
        Assert.assertEquals(3, parser.getTextLength());
        Assert.assertEquals(0, parser.getTextOffset());

        // longVal
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(9876543210L, parser.getLongValue());
        Assert.assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());

        // doubleVal
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(12.34, parser.getDoubleValue(), 0.001);
        Assert.assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());

        // boolVal
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        Assert.assertTrue(parser.getBooleanValue());
        Assert.assertTrue(parser.getValueAsBoolean());
        Assert.assertTrue(parser.getValueAsBoolean(false));

        // strVal
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("hello", parser.getText());
        Assert.assertEquals("hello", parser.getValueAsString());
        Assert.assertEquals("hello", parser.getValueAsString("default"));
        Assert.assertNull(parser.getEmbeddedObject());

        // binVal
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] binary = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals("hello".getBytes(), binary);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int readBytes = parser.readBinaryValue(Base64Variants.MIME, baos);
        Assert.assertEquals(5, readBytes);
        Assert.assertArrayEquals("hello".getBytes(), baos.toByteArray());

        Assert.assertNotNull(parser.getTokenLocation());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testFiltering_specificPropertyIncludedWithPath_buffersContext() throws IOException {
        String json = "{\"header\":{\"id\":1}, \"payload\":{\"target\":99, \"other\":100}}";
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("payload".equals(name) || "target".equals(name)) {
                    return this;
                }
                return null;
            }

            @Override
            public boolean includeValue(JsonParser p) {
                return true;
            }
        };

        FilteringParserDelegate parser = createFilteringParser(json, filter, true, true);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("payload", parser.getCurrentName());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("target", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(99, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFiltering_includePropertyWithoutPath_emitsOnlyTarget() throws IOException {
        String json = "{\"payload\":{\"target\":99}}";
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("payload".equals(name)) {
                    return this;
                }
                if ("target".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };

        FilteringParserDelegate parser = createFilteringParser(json, filter, false, true);

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("target", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(99, parser.getIntValue());
        Assert.assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFiltering_singleMatchNotAllowMultipleMatches_scalarRoot() throws IOException {
        String json = "123";
        FilteringParserDelegate parser = createFilteringParser(json, TokenFilter.INCLUDE_ALL, false, false);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());
        // Next token should be null as multiple matches are disabled
        Assert.assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFiltering_singleMatchNotAllowMultipleMatches_structRoot() throws IOException {
        String json = "{\"a\":1}";
        FilteringParserDelegate parser = createFilteringParser(json, TokenFilter.INCLUDE_ALL, true, false);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("a", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        // After end of structure match, should return null immediately
        Assert.assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFiltering_filterStartArrayAndStartObjectReturningIncludeAll() throws IOException {
        String json = "{\"items\":[1, 2], \"data\":{\"k\":\"v\"}}";
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                return this;
            }

            @Override
            public TokenFilter filterStartArray() {
                return TokenFilter.INCLUDE_ALL;
            }

            @Override
            public TokenFilter filterStartObject() {
                return TokenFilter.INCLUDE_ALL;
            }
        };

        FilteringParserDelegate parser = createFilteringParser(json, filter, true, true);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("items", parser.getCurrentName());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(1, parser.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(2, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("data", parser.getCurrentName());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("k", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("v", parser.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFiltering_filterRejectsArrayAndObject_skipsCorrectly() throws IOException {
        String json = "{\"skipArr\":[1,2,3], \"skipObj\":{\"x\":1}, \"keep\":42}";
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("keep".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                if ("skipArr".equals(name) || "skipObj".equals(name)) {
                    return this;
                }
                return null;
            }

            @Override
            public TokenFilter filterStartArray() {
                return null; // Skip array contents
            }

            @Override
            public TokenFilter filterStartObject() {
                return null; // Skip object contents
            }
        };

        FilteringParserDelegate parser = createFilteringParser(json, filter, true, true);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("keep", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(42, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFiltering_arrayWithNestedFilter_buffersAndOutputsCorrectly() throws IOException {
        String json = "[{\"a\":1}, {\"a\":2, \"b\":3}]";
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeElement(int index) {
                return this;
            }

            @Override
            public TokenFilter includeProperty(String name) {
                if ("b".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };

        FilteringParserDelegate parser = createFilteringParser(json, filter, true, true);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("b", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(3, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFiltering_nestedArrayAndIncludeAll() throws IOException {
        String json = "[[1, 2], [3, 4]]";
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeElement(int index) {
                if (index == 1) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };

        FilteringParserDelegate parser = createFilteringParser(json, filter, true, true);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(3, parser.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(4, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFiltering_emptyObjectAndEmptyArray_handledCorrectly() throws IOException {
        String json = "{\"emptyObj\":{}, \"emptyArr\":[]}";
        FilteringParserDelegate parser = createFilteringParser(json, TokenFilter.INCLUDE_ALL, true, true);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("emptyObj", parser.getCurrentName());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("emptyArr", parser.getCurrentName());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFiltering_emptyInput_returnsNullToken() throws IOException {
        FilteringParserDelegate parser = createFilteringParser("", TokenFilter.INCLUDE_ALL, true, true);
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testFiltering_includeValueReturnsFalse_skipsValues() throws IOException {
        String json = "{\"a\": 1, \"b\": 2}";
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                return this;
            }

            @Override
            public boolean includeValue(JsonParser p) throws IOException {
                return p.getIntValue() == 2;
            }
        };

        FilteringParserDelegate parser = createFilteringParser(json, filter, true, true);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("b", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(2, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void testFiltering_finishFilterCalls_invokesFilterFinishArray() throws IOException {
        final boolean[] arrayFinished = new boolean[1];
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeElement(int index) {
                return this;
            }

            @Override
            public void filterFinishArray() {
                arrayFinished[0] = true;
            }
        };

        FilteringParserDelegate parser = createFilteringParser("[1, 2]", filter, true, true);

        while (parser.nextToken() != null) {
            // consume all
        }
        Assert.assertTrue(arrayFinished[0]);

        parser.close();
    }
}
