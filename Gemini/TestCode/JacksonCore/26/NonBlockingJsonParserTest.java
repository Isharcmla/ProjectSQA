package com.fasterxml.jackson.core.json.async;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.async.ByteArrayFeeder;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class NonBlockingJsonParserTest {

    private NonBlockingJsonParser createParser() throws IOException {
        return createParser(new JsonFactory());
    }

    private NonBlockingJsonParser createParser(JsonFactory jf) throws IOException {
        return (NonBlockingJsonParser) jf.createNonBlockingByteArrayParser();
    }

    private byte[] utf8(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    @Test
    public void testConstructorAndFeeder_basic_success() throws IOException {
        IOContext ctxt = new IOContext(new BufferRecycler(), ContentReference.rawReference("test"), false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot(0).makeChild(JsonFactory.Feature.collectDefaults());
        NonBlockingJsonParser parser = new NonBlockingJsonParser(ctxt, 0, sym);

        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();
        Assert.assertNotNull(feeder);
        Assert.assertSame(parser, feeder);
        Assert.assertTrue(parser.needMoreInput());

        byte[] input = utf8("123");
        parser.feedInput(input, 0, input.length);
        Assert.assertFalse(parser.needMoreInput());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());
        parser.endOfInput();
        Assert.assertNull(parser.nextToken());
    }

    @Test(expected = IOException.class)
    public void testFeedInput_undecodedBytesRemaining_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] input = utf8("123 456");
        parser.feedInput(input, 0, input.length);
        parser.nextToken(); // consumed '123', ' 456' remains
        parser.feedInput(input, 0, input.length);
    }

    @Test(expected = IOException.class)
    public void testFeedInput_endBeforeStart_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] input = utf8("123");
        parser.feedInput(input, 2, 1);
    }

    @Test(expected = IOException.class)
    public void testFeedInput_alreadyClosed_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        parser.endOfInput();
        byte[] input = utf8("123");
        parser.feedInput(input, 0, input.length);
    }

    @Test(expected = RuntimeException.class)
    public void testDecodeEscaped_throwsInternalError() throws IOException {
        NonBlockingJsonParser parser = createParser();
        parser._decodeEscaped();
    }

    @Test
    public void testReleaseBuffered_withAndWithoutRemainingBytes() throws IOException {
        NonBlockingJsonParser parser = createParser();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Assert.assertEquals(0, parser.releaseBuffered(out));

        byte[] input = utf8("123 456");
        parser.feedInput(input, 0, input.length);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        int released = parser.releaseBuffered(out);
        Assert.assertEquals(4, released);
        Assert.assertEquals(" 456", out.toString(StandardCharsets.UTF_8.name()));
    }

    @Test
    public void testParseDocument_fullObjectAndArray_allAtOnce() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] input = utf8("{\"k1\": \"v1\", \"k2\": true, \"k3\": false, \"k4\": null, \"k5\": [1, 2.5, -3e2]}");
        parser.feedInput(input, 0, input.length);
        parser.endOfInput();

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("k1", parser.currentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("v1", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("k2", parser.currentName());
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("k3", parser.currentName());
        Assert.assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("k4", parser.currentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("k5", parser.currentName());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(1, parser.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(2.5, parser.getDoubleValue(), 0.001);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(-300.0, parser.getDoubleValue(), 0.001);
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testParseByteByByte_tokensAndSplits() throws IOException {
        String json = "{\"a\": 123, \"b\": [true, false, null, -0, 0, 0.5, -12.34e+2]}";
        byte[] data = utf8(json);
        NonBlockingJsonParser parser = createParser();

        int i = 0;
        JsonToken token;
        while (i < data.length) {
            parser.feedInput(data, i, i + 1);
            i++;
            while ((token = parser.nextToken()) != JsonToken.NOT_AVAILABLE) {
                Assert.assertNotNull(token);
            }
        }
        parser.endOfInput();
        token = parser.nextToken();
        Assert.assertEquals(JsonToken.END_OBJECT, token);
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testParseBOM_validAndByteByByte() throws IOException {
        byte[] bomJson = new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF, '{', '}' };
        NonBlockingJsonParser parser = createParser();

        for (int i = 0; i < bomJson.length; i++) {
            parser.feedInput(bomJson, i, i + 1);
            parser.nextToken();
        }
        parser.endOfInput();
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testParseBOM_invalidSecondByte_throwsException() throws IOException {
        byte[] badBom = new byte[] { (byte) 0xEF, (byte) 0x00, (byte) 0xBF, '{', '}' };
        NonBlockingJsonParser parser = createParser();
        parser.feedInput(badBom, 0, badBom.length);
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testParseBOM_invalidThirdByte_throwsException() throws IOException {
        byte[] badBom = new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0x00, '{', '}' };
        NonBlockingJsonParser parser = createParser();
        parser.feedInput(badBom, 0, badBom.length);
        parser.nextToken();
    }

    @Test
    public void testParseFieldNames_variousLengths_fastAndMediumParse() throws IOException {
        String json = "{"
                + "\"\": 0,"
                + "\"a\": 1,"
                + "\"ab\": 2,"
                + "\"abc\": 3,"
                + "\"abcd\": 4,"
                + "\"abcde\": 5,"
                + "\"abcdef\": 6,"
                + "\"abcdefg\": 7,"
                + "\"abcdefgh\": 8,"
                + "\"abcdefghi\": 9,"
                + "\"abcdefghij\": 10,"
                + "\"abcdefghijk\": 11,"
                + "\"abcdefghijkl\": 12,"
                + "\"abcdefghijklm_long_name\": 13"
                + "}";

        NonBlockingJsonParser parser = createParser();
        byte[] input = utf8(json);
        parser.feedInput(input, 0, input.length);
        parser.endOfInput();

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        String[] expectedNames = new String[] {
                "", "a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg",
                "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl",
                "abcdefghijklm_long_name"
        };
        for (int i = 0; i < expectedNames.length; i++) {
            Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
            Assert.assertEquals(expectedNames[i], parser.currentName());
            Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            Assert.assertEquals(i, parser.getIntValue());
        }
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testParseEscapedFieldNames_splitAndMultiByte() throws IOException {
        String json = "{\"escaped\\nname\\u0041\\u00e9\\u4e2d\": 1}";
        byte[] data = utf8(json);
        NonBlockingJsonParser parser = createParser();

        for (int i = 0; i < data.length; i++) {
            parser.feedInput(data, i, i + 1);
            parser.nextToken();
        }
        parser.endOfInput();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testParseStrings_escapesAndMultiByteUtf8() throws IOException {
        String json = "[\"\\\" \\\\ \\/ \\b \\f \\n \\r \\t \\u0041 \u00a2 \u20ac \uD83D\uDE00\"]";
        byte[] data = utf8(json);

        NonBlockingJsonParser parser = createParser();
        for (int i = 0; i < data.length; i++) {
            parser.feedInput(data, i, i + 1);
            parser.nextToken();
        }
        parser.endOfInput();
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testSingleQuotes_featureEnabled() throws IOException {
        JsonFactory jf = new JsonFactory().enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        NonBlockingJsonParser parser = createParser(jf);
        String json = "{'field': 'value \\' \\n \u00a2 \u20ac \uD83D\uDE00'}";
        byte[] data = utf8(json);

        for (int i = 0; i < data.length; i++) {
            parser.feedInput(data, i, i + 1);
            parser.nextToken();
        }
        parser.endOfInput();
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testUnquotedFieldNames_featureEnabled() throws IOException {
        JsonFactory jf = new JsonFactory().enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        NonBlockingJsonParser parser = createParser(jf);
        String json = "{foo: 1, bar_baz_123: 2}";
        byte[] data = utf8(json);

        for (int i = 0; i < data.length; i++) {
            parser.feedInput(data, i, i + 1);
            parser.nextToken();
        }
        parser.endOfInput();
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testComments_javaAndYaml_featureEnabled() throws IOException {
        JsonFactory jf = new JsonFactory()
                .enable(JsonParser.Feature.ALLOW_COMMENTS)
                .enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);
        NonBlockingJsonParser parser = createParser(jf);

        String json = "/* comment */ { // cpp comment\n"
                + "# yaml comment\n"
                + "\"a\" /* c */ : /* c */ 1 /* c */ , // cpp\n"
                + "# yaml\n"
                + "\"b\": [ 2 /* c */ , 3 // cpp\n"
                + " ] }";
        byte[] data = utf8(json);

        for (int i = 0; i < data.length; i++) {
            parser.feedInput(data, i, i + 1);
            parser.nextToken();
        }
        parser.endOfInput();
        Assert.assertNull(parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testComments_disabled_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8("/* comment */ 123");
        parser.feedInput(data, 0, data.length);
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testYamlComments_disabled_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8("# yaml\n123");
        parser.feedInput(data, 0, data.length);
        parser.nextToken();
    }

    @Test
    public void testTrailingCommaAndMissingValues() throws IOException {
        JsonFactory jf = new JsonFactory()
                .enable(JsonParser.Feature.ALLOW_TRAILING_COMMA)
                .enable(JsonParser.Feature.ALLOW_MISSING_VALUES);
        NonBlockingJsonParser parser = createParser(jf);

        String json = "{\"a\": 1, } [1, , 2, ]";
        byte[] data = utf8(json);
        parser.feedInput(data, 0, data.length);
        parser.endOfInput();

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNonStandardNumbers_NaN_Infinity() throws IOException {
        JsonFactory jf = new JsonFactory().enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        NonBlockingJsonParser parser = createParser(jf);
        String json = "[NaN, Infinity, +Infinity, -Infinity]";
        byte[] data = utf8(json);

        for (int i = 0; i < data.length; i++) {
            parser.feedInput(data, i, i + 1);
            parser.nextToken();
        }
        parser.endOfInput();
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testLeadingZeros_featureEnabled() throws IOException {
        JsonFactory jf = new JsonFactory().enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        NonBlockingJsonParser parser = createParser(jf);
        String json = "[0123, -0123, 0005]";
        byte[] data = utf8(json);
        parser.feedInput(data, 0, data.length);
        parser.endOfInput();

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(-123, parser.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(5, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNumbers_variousFormatsAndEOF() throws IOException {
        String json = "1234567890123456789 -9876543210 0 -0 0.123 -0.123 1e5 1E-5 1.25e+3";
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8(json);
        parser.feedInput(data, 0, data.length);
        parser.endOfInput();

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testFinishTokenWithEOF_rootSeparatorsAndKeywords() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8("   null");
        parser.feedInput(data, 0, data.length);
        parser.endOfInput();
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertNull(parser.nextToken());

        parser = createParser();
        data = utf8("true");
        parser.feedInput(data, 0, data.length);
        parser.endOfInput();
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());

        parser = createParser();
        data = utf8("false");
        parser.feedInput(data, 0, data.length);
        parser.endOfInput();
        Assert.assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testUnrecognizedToken_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8("invalidToken");
        parser.feedInput(data, 0, data.length);
        parser.endOfInput();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCharacterInValue_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8("@");
        parser.feedInput(data, 0, data.length);
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedColonMissing_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8("{\"key\" 123}");
        parser.feedInput(data, 0, data.length);
        parser.nextToken(); // {
        parser.nextToken(); // "key"
        parser.nextToken(); // throws expecting colon
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCommaMissing_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8("[1 2]");
        parser.feedInput(data, 0, data.length);
        parser.nextToken(); // [
        parser.nextToken(); // 1
        parser.nextToken(); // throws expecting comma
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidNumber_minusAloneEOF_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8("-");
        parser.feedInput(data, 0, data.length);
        parser.endOfInput();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidNumber_exponentAloneEOF_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8("1e");
        parser.feedInput(data, 0, data.length);
        parser.endOfInput();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidEscape_hexDigitExpected_throwsException() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8("\"\\u004Z\"");
        parser.feedInput(data, 0, data.length);
        parser.nextToken();
    }

    @Test
    public void testWhitespace_crlfTracking() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = utf8("\r\n\t  {\"a\":\r\n\t 1}");
        parser.feedInput(data, 0, data.length);
        parser.endOfInput();

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testClosedParser_nextTokenReturnsNull() throws IOException {
        NonBlockingJsonParser parser = createParser();
        parser.close();
        Assert.assertTrue(parser.isClosed());
        Assert.assertNull(parser.nextToken());
    }
}
