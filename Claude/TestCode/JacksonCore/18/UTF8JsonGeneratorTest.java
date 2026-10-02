import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class UTF8JsonGeneratorTest {

    private JsonFactory factory;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() {
        factory = new JsonFactory();
        out = new ByteArrayOutputStream();
    }

    @After
    public void tearDown() {
        // no-op
    }

    private UTF8JsonGenerator createGenerator() throws IOException {
        JsonGenerator gen = factory.createGenerator(out, JsonEncoding.UTF8);
        assertTrue(gen instanceof UTF8JsonGenerator);
        return (UTF8JsonGenerator) gen;
    }

    private UTF8JsonGenerator createGenerator(ByteArrayOutputStream target) throws IOException {
        JsonGenerator gen = factory.createGenerator(target, JsonEncoding.UTF8);
        assertTrue(gen instanceof UTF8JsonGenerator);
        return (UTF8JsonGenerator) gen;
    }

    // -----------------------------------------------------------------
    // Basic structural tests
    // -----------------------------------------------------------------

    @Test
    public void testWriteStartEndArray_normal_producesBrackets() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartArray();
        gen.writeEndArray();
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("[]", json);
    }

    @Test
    public void testWriteStartEndObject_normal_producesBraces() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartObject();
        gen.writeEndObject();
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("{}", json);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndArray_notInArray_throwsException() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartObject();
        gen.writeEndArray();
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObject_notInObject_throwsException() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartArray();
        gen.writeEndObject();
    }

    // -----------------------------------------------------------------
    // Field name tests
    // -----------------------------------------------------------------

    @Test
    public void testWriteFieldName_normal_writesQuotedName() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartObject();
        gen.writeFieldName("field1");
        gen.writeNumber(1);
        gen.writeFieldName("field2");
        gen.writeNumber(2);
        gen.writeEndObject();
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("{\"field1\":1,\"field2\":2}", json);
    }

    @Test
    public void testWriteFieldName_serializableString_writesQuotedName() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("field1"));
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("{\"field1\":1}", json);
    }

    @Test
    public void testWriteFieldName_unquotedNames_writesUnquoted() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        gen.writeStartObject();
        gen.writeFieldName("field1");
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("{field1:1}", json);
    }

    @Test
    public void testWriteFieldName_unquotedNamesSerializableString_writesUnquoted() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("field1"));
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("{field1:1}", json);
    }

    @Test
    public void testWriteFieldName_longName_exceedsCharBuffer_writesCorrectly() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3000; i++) {
            sb.append('a');
        }
        String longName = sb.toString();
        gen.writeStartObject();
        gen.writeFieldName(longName);
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        String json = out.toString("UTF-8");
        assertTrue(json.contains(longName));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldName_expectingValue_throwsException() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartObject();
        gen.writeFieldName("field1");
        gen.writeFieldName("field2"); // expecting a value now, should throw
    }

    @Test
    public void testWriteFieldName_withPrettyPrinter_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.writeStartObject();
        gen.writeFieldName("field1");
        gen.writeNumber(1);
        gen.writeFieldName("field2");
        gen.writeNumber(2);
        gen.writeEndObject();
        gen.close();
        String json = out.toString("UTF-8");
        assertTrue(json.contains("field1"));
        assertTrue(json.contains("field2"));
    }

    @Test
    public void testWriteFieldName_serializableStringWithPrettyPrinter_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("field1"));
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        String json = out.toString("UTF-8");
        assertTrue(json.contains("field1"));
    }

    // -----------------------------------------------------------------
    // writeString tests
    // -----------------------------------------------------------------

    @Test
    public void testWriteString_normal_writesQuotedString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeString("hello");
        gen.close();
        assertEquals("\"hello\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteString_null_writesNullLiteral() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeString((String) null);
        gen.close();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteString_empty_writesEmptyQuotedString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeString("");
        gen.close();
        assertEquals("\"\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteString_longString_exceedsMaxContiguous_writesCorrectly() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) {
            sb.append('x');
        }
        String longStr = sb.toString();
        gen.writeString(longStr);
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("\"" + longStr + "\"", json);
    }

    @Test
    public void testWriteString_withEscapeChars_writesEscaped() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeString("a\"b\\c\nd\te");
        gen.close();
        String json = out.toString("UTF-8");
        assertTrue(json.contains("\\\""));
        assertTrue(json.contains("\\\\"));
        assertTrue(json.contains("\\n"));
        assertTrue(json.contains("\\t"));
    }

    @Test
    public void testWriteString_charArray_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        char[] chars = "hello".toCharArray();
        gen.writeString(chars, 0, chars.length);
        gen.close();
        assertEquals("\"hello\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteString_charArray_longExceedsMaxContiguous() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        char[] chars = new char[5000];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = 'y';
        }
        gen.writeString(chars, 0, chars.length);
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals(5002, json.length());
    }

    @Test
    public void testWriteString_serializableString_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeString(new SerializedString("hello"));
        gen.close();
        assertEquals("\"hello\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawUTF8String_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        byte[] bytes = "hello".getBytes("UTF-8");
        gen.writeRawUTF8String(bytes, 0, bytes.length);
        gen.close();
        assertEquals("\"hello\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteUTF8String_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        byte[] bytes = "hello".getBytes("UTF-8");
        gen.writeUTF8String(bytes, 0, bytes.length);
        gen.close();
        assertEquals("\"hello\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteUTF8String_withEscapeChars_writesEscaped() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        byte[] bytes = "a\"b".getBytes("UTF-8");
        gen.writeUTF8String(bytes, 0, bytes.length);
        gen.close();
        String json = out.toString("UTF-8");
        assertTrue(json.contains("\\\""));
    }

    @Test
    public void testWriteUTF8String_longExceedsMaxContiguous() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) {
            sb.append('z');
        }
        byte[] bytes = sb.toString().getBytes("UTF-8");
        gen.writeUTF8String(bytes, 0, bytes.length);
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals(5002, json.length());
    }

    // -----------------------------------------------------------------
    // writeRaw tests
    // -----------------------------------------------------------------

    @Test
    public void testWriteRaw_stringNormal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeRaw("rawcontent");
        gen.close();
        assertEquals("rawcontent", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_stringLongerThanCharBuffer() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) {
            sb.append('r');
        }
        String raw = sb.toString();
        gen.writeRaw(raw);
        gen.close();
        assertEquals(raw, out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_stringOffsetLen_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeRaw("helloworld", 0, 5);
        gen.close();
        assertEquals("hello", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_serializableString_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeRaw(new SerializedString("rawvalue"));
        gen.close();
        assertEquals("rawvalue", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawValue_serializableString_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeRawValue(new SerializedString("123"));
        gen.close();
        assertEquals("123", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_charArray_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        char[] chars = "abcdef".toCharArray();
        gen.writeRaw(chars, 0, chars.length);
        gen.close();
        assertEquals("abcdef", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_singleChar_ascii() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeRaw('x');
        gen.close();
        assertEquals("x", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRaw_singleChar_multiByte() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeRaw('\u00e9'); // e with accent, 2-byte UTF-8
        gen.close();
        byte[] resultBytes = out.toByteArray();
        assertTrue(resultBytes.length >= 2);
    }

    @Test
    public void testWriteRaw_charArray_withMultiByteChars() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        char[] chars = "\u00e9\u00e8".toCharArray();
        gen.writeRaw(chars, 0, chars.length);
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("\u00e9\u00e8", json);
    }

    // -----------------------------------------------------------------
    // writeBinary tests
    // -----------------------------------------------------------------

    @Test
    public void testWriteBinary_byteArray_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        byte[] data = { 1, 2, 3, 4, 5 };
        gen.writeBinary(data);
        gen.close();
        String json = out.toString("UTF-8");
        assertTrue(json.startsWith("\""));
        assertTrue(json.endsWith("\""));
    }

    @Test
    public void testWriteBinary_inputStream_knownLength() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        byte[] data = { 10, 20, 30, 40, 50, 60 };
        InputStream is = new ByteArrayInputStream(data);
        int written = gen.writeBinary(com.fasterxml.jackson.core.Base64Variants.getDefaultVariant(), is, data.length);
        gen.close();
        assertEquals(data.length, written);
        String json = out.toString("UTF-8");
        assertTrue(json.startsWith("\""));
    }

    @Test
    public void testWriteBinary_inputStream_unknownLength() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        byte[] data = { 1, 2, 3, 4, 5, 6, 7 };
        InputStream is = new ByteArrayInputStream(data);
        int written = gen.writeBinary(com.fasterxml.jackson.core.Base64Variants.getDefaultVariant(), is, -1);
        gen.close();
        assertEquals(data.length, written);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteBinary_inputStream_tooFewBytes_throwsException() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        byte[] data = { 1, 2, 3 };
        InputStream is = new ByteArrayInputStream(data);
        gen.writeBinary(com.fasterxml.jackson.core.Base64Variants.getDefaultVariant(), is, 10);
    }

    // -----------------------------------------------------------------
    // writeNumber tests
    // -----------------------------------------------------------------

    @Test
    public void testWriteNumber_short_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNumber((short) 123);
        gen.close();
        assertEquals("123", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_short_asString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        gen.writeNumber((short) 42);
        gen.close();
        assertEquals("\"42\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_int_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNumber(12345);
        gen.close();
        assertEquals("12345", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_int_negative() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNumber(-98765);
        gen.close();
        assertEquals("-98765", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_int_asString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        gen.writeNumber(99);
        gen.close();
        assertEquals("\"99\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_long_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNumber(1234567890123L);
        gen.close();
        assertEquals("1234567890123", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_long_asString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        gen.writeNumber(123456789L);
        gen.close();
        assertEquals("\"123456789\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_bigInteger_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNumber(BigInteger.valueOf(123456789));
        gen.close();
        assertEquals("123456789", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_bigInteger_null_writesNull() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNumber((BigInteger) null);
        gen.close();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_bigInteger_asString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        gen.writeNumber(BigInteger.valueOf(42));
        gen.close();
        assertEquals("\"42\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_double_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNumber(3.14);
        gen.close();
        assertEquals("3.14", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_double_nanWithQuoteFeature_writesString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        gen.writeNumber(Double.NaN);
        gen.close();
        assertEquals("\"NaN\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_double_asString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        gen.writeNumber(1.5);
        gen.close();
        assertEquals("\"1.5\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_float_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNumber(2.5f);
        gen.close();
        assertEquals("2.5", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_float_infinityWithQuoteFeature_writesString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        gen.writeNumber(Float.POSITIVE_INFINITY);
        gen.close();
        assertEquals("\"Infinity\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_float_asString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        gen.writeNumber(1.0f);
        gen.close();
        assertEquals("\"1.0\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_bigDecimal_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNumber(new BigDecimal("123.456"));
        gen.close();
        assertEquals("123.456", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_bigDecimal_null_writesNull() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNumber((BigDecimal) null);
        gen.close();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_bigDecimal_asString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        gen.writeNumber(new BigDecimal("7.89"));
        gen.close();
        assertEquals("\"7.89\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_bigDecimal_asPlainString() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        gen.writeNumber(new BigDecimal("1E+2"));
        gen.close();
        assertEquals("100", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_bigDecimal_asStringAndPlain() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        gen.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        gen.writeNumber(new BigDecimal("1E+2"));
        gen.close();
        assertEquals("\"100\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_stringEncoded_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNumber("12345");
        gen.close();
        assertEquals("12345", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_stringEncoded_asQuoted() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        gen.writeNumber("999");
        gen.close();
        assertEquals("\"999\"", out.toString("UTF-8"));
    }

    // -----------------------------------------------------------------
    // writeBoolean / writeNull
    // -----------------------------------------------------------------

    @Test
    public void testWriteBoolean_true_writesTrueLiteral() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeBoolean(true);
        gen.close();
        assertEquals("true", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBoolean_false_writesFalseLiteral() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeBoolean(false);
        gen.close();
        assertEquals("false", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNull_normal_writesNullLiteral() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeNull();
        gen.close();
        assertEquals("null", out.toString("UTF-8"));
    }

    // -----------------------------------------------------------------
    // getOutputTarget / getOutputBuffered
    // -----------------------------------------------------------------

    @Test
    public void testGetOutputTarget_returnsOutputStream() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        assertSame(out, gen.getOutputTarget());
        gen.close();
    }

    @Test
    public void testGetOutputBuffered_afterWrite_returnsPositiveValue() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartArray();
        gen.writeNumber(1);
        int buffered = gen.getOutputBuffered();
        assertTrue(buffered > 0);
        gen.writeEndArray();
        gen.close();
    }

    // -----------------------------------------------------------------
    // flush / close
    // -----------------------------------------------------------------

    @Test
    public void testFlush_normal_flushesBuffer() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartArray();
        gen.writeNumber(1);
        gen.flush();
        assertTrue(out.toByteArray().length > 0);
        gen.writeEndArray();
        gen.close();
    }

    @Test
    public void testClose_autoClosesOpenArray() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartArray();
        gen.writeNumber(1);
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("[1]", json);
    }

    @Test
    public void testClose_autoClosesOpenObject() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeNumber(1);
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("{\"a\":1}", json);
    }

    @Test
    public void testClose_autoCloseDisabled_doesNotAutoClose() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        gen.writeStartArray();
        gen.writeNumber(1);
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("[1", json);
    }

    @Test
    public void testClose_multipleNestedContexts_autoClosesAll() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartObject();
        gen.writeFieldName("arr");
        gen.writeStartArray();
        gen.writeNumber(1);
        gen.writeNumber(2);
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("{\"arr\":[1,2]}", json);
    }

    // -----------------------------------------------------------------
    // Nested/combined complex tests
    // -----------------------------------------------------------------

    @Test
    public void testComplexDocument_normal() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        gen.writeStartObject();
        gen.writeFieldName("name");
        gen.writeString("John");
        gen.writeFieldName("age");
        gen.writeNumber(30);
        gen.writeFieldName("active");
        gen.writeBoolean(true);
        gen.writeFieldName("tags");
        gen.writeStartArray();
        gen.writeString("a");
        gen.writeString("b");
        gen.writeEndArray();
        gen.writeFieldName("address");
        gen.writeNull();
        gen.writeEndObject();
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("{\"name\":\"John\",\"age\":30,\"active\":true,\"tags\":[\"a\",\"b\"],\"address\":null}", json);
    }

    @Test
    public void testWriteString_nonAsciiCharacters_escapedWhenConfigured() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        ByteArrayOutputStream localOut = new ByteArrayOutputStream();
        JsonGenerator gen = f.createGenerator(localOut, JsonEncoding.UTF8);
        gen.writeString("\u00e9\u00e8");
        gen.close();
        String json = localOut.toString("UTF-8");
        assertTrue(json.contains("\\u"));
    }

    @Test
    public void testWriteString_surrogatePair_encodesCorrectly() throws IOException {
        UTF8JsonGenerator gen = createGenerator();
        String withSurrogate = "\uD83D\uDE00"; // emoji
        gen.writeString(withSurrogate);
        gen.close();
        String json = out.toString("UTF-8");
        assertEquals("\"" + withSurrogate + "\"", json);
    }
}
