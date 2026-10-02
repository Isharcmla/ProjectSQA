package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class FilteringParserDelegateTest {

    private final JsonFactory jsonFactory = new JsonFactory();

    @Test
    public void testGetFilterAndMatchCount_initialState_returnsExpectedValues() throws IOException {
        String json = "{\"a\":1}";
        JsonParser p = jsonFactory.createParser(json);
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, true, true);

        assertSame(filter, delegate.getFilter());
        assertEquals(0, delegate.getMatchCount());
        assertNull(delegate.getCurrentToken());
        assertNull(delegate.currentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
        assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.currentTokenId());
        assertFalse(delegate.hasCurrentToken());
        assertTrue(delegate.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(delegate.hasTokenId(JsonTokenId.ID_START_OBJECT));
        assertTrue(delegate.hasToken(null));
        assertFalse(delegate.hasToken(JsonToken.START_OBJECT));
        assertFalse(delegate.isExpectedStartArrayToken());
        assertFalse(delegate.isExpectedStartObjectToken());
        assertNull(delegate.getLastClearedToken());
        assertNotNull(delegate.getParsingContext());
        assertNull(delegate.getCurrentName());
        p.close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentName_always_throwsUnsupportedOperationException() throws IOException {
        String json = "{\"a\":1}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        try {
            delegate.overrideCurrentName("newName");
        } finally {
            p.close();
        }
    }

    @Test
    public void testClearCurrentToken_tokenSet_clearsAndRecordsLastToken() throws IOException {
        String json = "{\"a\":1}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertTrue(delegate.hasCurrentToken());
        assertTrue(delegate.isExpectedStartObjectToken());
        assertFalse(delegate.isExpectedStartArrayToken());

        delegate.clearCurrentToken();
        assertNull(delegate.getCurrentToken());
        assertNull(delegate.currentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
        assertFalse(delegate.hasCurrentToken());
        assertEquals(JsonToken.START_OBJECT, delegate.getLastClearedToken());

        // Calling clearCurrentToken when null should not overwrite lastClearedToken
        delegate.clearCurrentToken();
        assertEquals(JsonToken.START_OBJECT, delegate.getLastClearedToken());
        p.close();
    }

    @Test
    public void testScalarTokenAccessors_allDataTypes_returnsCorrectValues() throws IOException {
        String json = "{\"str\":\"hello\", \"int\":100, \"long\":999999999999, \"double\":12.34, \"bigInt\":12345678901234567890, \"dec\":12.3456789, \"bool\":true, \"bin\":\"AQID\"}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertNotNull(delegate.getCurrentLocation());
        assertNotNull(delegate.getTokenLocation());

        // "str":"hello"
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("str", delegate.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, delegate.nextToken());
        assertEquals("hello", delegate.getText());
        assertTrue(delegate.hasTextCharacters());
        assertNotNull(delegate.getTextCharacters());
        assertEquals(5, delegate.getTextLength());
        assertEquals(0, delegate.getTextOffset());
        assertEquals("hello", delegate.getValueAsString());
        assertEquals("hello", delegate.getValueAsString("def"));
        assertNull(delegate.getEmbeddedObject());

        // "int":100
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        assertEquals(100, delegate.getIntValue());
        assertEquals((byte) 100, delegate.getByteValue());
        assertEquals((short) 100, delegate.getShortValue());
        assertEquals(100, delegate.getValueAsInt());
        assertEquals(100, delegate.getValueAsInt(0));
        assertEquals(100L, delegate.getLongValue());
        assertEquals(100L, delegate.getValueAsLong());
        assertEquals(100L, delegate.getValueAsLong(0L));
        assertEquals(100.0, delegate.getDoubleValue(), 0.001);
        assertEquals(100.0, delegate.getValueAsDouble(), 0.001);
        assertEquals(100.0, delegate.getValueAsDouble(0.0), 0.001);
        assertEquals(100.0f, delegate.getFloatValue(), 0.001f);
        assertEquals(JsonParser.NumberType.INT, delegate.getNumberType());
        assertEquals(100, delegate.getNumberValue());

        // "long":999999999999
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        assertEquals(999999999999L, delegate.getLongValue());
        assertEquals(999999999999L, delegate.getValueAsLong());

        // "double":12.34
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, delegate.nextToken());
        assertEquals(12.34, delegate.getDoubleValue(), 0.001);
        assertEquals(12.34f, delegate.getFloatValue(), 0.001f);

        // "bigInt":12345678901234567890
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        assertEquals(new BigInteger("12345678901234567890"), delegate.getBigIntegerValue());

        // "dec":12.3456789
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, delegate.nextToken());
        assertEquals(new BigDecimal("12.3456789"), delegate.getDecimalValue());

        // "bool":true
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, delegate.nextToken());
        assertTrue(delegate.getBooleanValue());
        assertTrue(delegate.getValueAsBoolean());
        assertTrue(delegate.getValueAsBoolean(false));

        // "bin":"AQID"
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals(JsonToken.VALUE_STRING, delegate.nextToken());
        byte[] bytes = delegate.getBinaryValue(Base64Variants.MIME);
        assertArrayEquals(new byte[]{1, 2, 3}, bytes);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = delegate.readBinaryValue(Base64Variants.MIME, out);
        assertEquals(3, count);
        assertArrayEquals(new byte[]{1, 2, 3}, out.toByteArray());

        assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        assertNull(delegate.nextToken());
        p.close();
    }

    @Test
    public void testFiltering_includePath_findSinglePropertyInNestedStructure() throws IOException {
        String json = "{\"a\": 1, \"nested\": {\"target\": 42, \"other\": 99}, \"arr\": [10, 20]}";
        JsonParser p = jsonFactory.createParser(json);

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("nested".equals(name)) {
                    return this;
                }
                if ("target".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };

        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, true, true);

        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("nested", delegate.getCurrentName());
        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("target", delegate.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        assertEquals(42, delegate.getIntValue());
        assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        assertNull(delegate.nextToken());
        p.close();
    }

    @Test
    public void testFiltering_noIncludePath_findSingleProperty() throws IOException {
        String json = "{\"a\": 1, \"b\": {\"target\": 42, \"other\": 99}}";
        JsonParser p = jsonFactory.createParser(json);

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

        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, false, true);

        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("target", delegate.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        assertEquals(42, delegate.getIntValue());
        assertNull(delegate.nextToken());
        p.close();
    }

    @Test
    public void testFiltering_singleMatchDisallowingMultipleMatches_scalar() throws IOException {
        String json = "42";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, false, false);

        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        assertEquals(42, delegate.getIntValue());
        assertNull(delegate.nextToken());
        p.close();
    }

    @Test
    public void testFiltering_arraysWithBufferingAndExclusion() throws IOException {
        String json = "{\"data\": [1, 2, {\"sub\": \"match\"}, 4]}";
        JsonParser p = jsonFactory.createParser(json);

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("data".equals(name) || "sub".equals(name)) {
                    return this;
                }
                return null;
            }

            @Override
            public TokenFilter includeElement(int index) {
                return this;
            }

            @Override
            public TokenFilter filterStartObject() {
                return this;
            }

            @Override
            public TokenFilter filterStartArray() {
                return this;
            }

            @Override
            public boolean includeValue(JsonParser p) throws IOException {
                return "match".equals(p.getText());
            }
        };

        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, true, true);

        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("data", delegate.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, delegate.nextToken());
        assertTrue(delegate.isExpectedStartArrayToken());
        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("sub", delegate.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, delegate.nextToken());
        assertEquals("match", delegate.getText());
        assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        assertEquals(JsonToken.END_ARRAY, delegate.nextToken());
        assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        assertNull(delegate.nextToken());
        p.close();
    }

    @Test
    public void testFiltering_nullFiltersSkipSubtrees() throws IOException {
        String json = "{\"skipObj\": {\"a\": 1}, \"skipArr\": [1, 2], \"keep\": 10}";
        JsonParser p = jsonFactory.createParser(json);

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("keep".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null; // Will skip subtree for skipObj and skipArr
            }
        };

        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, true, true);

        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("keep", delegate.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        assertEquals(10, delegate.getIntValue());
        assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        assertNull(delegate.nextToken());
        p.close();
    }

    @Test
    public void testSkipChildren_onStartObjectAndStartArray() throws IOException {
        String json = "{\"skipMe\": {\"a\": 1, \"b\": 2}, \"after\": 3, \"arr\": [10, 20], \"end\": 4}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken()); // skipMe
        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());

        // Skip the inner object
        assertSame(delegate, delegate.skipChildren());
        assertEquals(JsonToken.END_OBJECT, delegate.getCurrentToken());

        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("after", delegate.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());

        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken()); // arr
        assertEquals(JsonToken.START_ARRAY, delegate.nextToken());
        // Skip array
        assertSame(delegate, delegate.skipChildren());
        assertEquals(JsonToken.END_ARRAY, delegate.getCurrentToken());

        // Skip non-struct token should be no-op
        assertSame(delegate, delegate.skipChildren());

        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("end", delegate.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        assertNull(delegate.nextToken());

        // Calling skipChildren when current is null
        assertSame(delegate, delegate.skipChildren());
        p.close();
    }

    @Test
    public void testNextValue_navigatesProperly() throws IOException {
        String json = "{\"a\": 1, \"b\": 2}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, delegate.nextValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextValue());
        assertEquals("a", delegate.getCurrentName());
        assertEquals(1, delegate.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextValue());
        assertEquals("b", delegate.getCurrentName());
        assertEquals(2, delegate.getIntValue());
        assertEquals(JsonToken.END_OBJECT, delegate.nextValue());
        assertNull(delegate.nextValue());
        p.close();
    }

    @Test
    public void testGetCurrentName_parentContextChecks() throws IOException {
        String json = "{\"nestedObj\": {\"val\": 1}, \"nestedArr\": [1]}";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertNull(delegate.getCurrentName());

        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("nestedObj", delegate.getCurrentName());

        assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        assertEquals("nestedObj", delegate.getCurrentName());

        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("val", delegate.getCurrentName());

        assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        assertEquals("val", delegate.getCurrentName());

        assertEquals(JsonToken.END_OBJECT, delegate.nextToken());

        assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        assertEquals("nestedArr", delegate.getCurrentName());

        assertEquals(JsonToken.START_ARRAY, delegate.nextToken());
        assertEquals("nestedArr", delegate.getCurrentName());

        p.close();
    }

    @Test
    public void testEmptyJson_returnsNullImmediately() throws IOException {
        String json = "";
        JsonParser p = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertNull(delegate.nextToken());
        assertNull(delegate.getCurrentToken());
        p.close();
    }

    @Test
    public void testTokenFilterFinishArrayAndObjectCalled() throws IOException {
        String json = "{\"arr\": [1], \"obj\": {\"x\": 2}}";
        JsonParser p = jsonFactory.createParser(json);

        final int[] finishes = new int[1];
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter filterStartArray() {
                return new TokenFilter() {
                    @Override
                    public void filterFinishArray() {
                        finishes[0]++;
                    }
                };
            }

            @Override
            public TokenFilter filterStartObject() {
                return new TokenFilter() {
                    @Override
                    public void filterFinishObject() {
                        finishes[0]++;
                    }
                };
            }

            @Override
            public TokenFilter includeProperty(String name) {
                return this;
            }
        };

        FilteringParserDelegate delegate = new FilteringParserDelegate(p, filter, true, true);
        while (delegate.nextToken() != null) {
            // consume
        }
        assertTrue(finishes[0] >= 1);
        p.close();
    }
}
