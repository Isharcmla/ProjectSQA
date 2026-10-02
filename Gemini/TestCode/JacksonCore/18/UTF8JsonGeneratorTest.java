package com.fasterxml.jackson.core.json;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public class UTF8JsonGeneratorTest {

    private IOContext createIOContext() {
        return new IOContext(new BufferRecycler(), "test", false);
    }

    private UTF8JsonGenerator createGenerator(ByteArrayOutputStream out, int features) {
        return new UTF8JsonGenerator(createIOContext(), features, null, out);
    }

    private UTF8JsonGenerator createGenerator(ByteArrayOutputStream out) {
        return createGenerator(out, 0);
    }

    @Test
    public void testConstructorsAndTargetBuffered() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOContext ctxt = createIOContext();
        byte[] buf = new byte[100];
        UTF8JsonGenerator gen = new UTF8JsonGenerator(ctxt, 0, null, out, buf, 10, false);

        Assert.assertSame(out, gen.getOutputTarget());
        Assert.assertEquals(10, gen.getOutputBuffered());

        // Test constructor with ESCAPE_NON_ASCII feature
        int features = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
        UTF8JsonGenerator gen2 = new UTF8JsonGenerator(ctxt, features, null, out);
        Assert.assertEquals(127, gen2.getHighestEscapedChar());
        gen.close();
        gen2.close();
    }

    @Test
    public void testWriteStartAndEndObject() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartObject();
        gen.writeFieldName("key");
        gen.writeString("val");
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{\"key\":\"val\"}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStartAndEndArray() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeNumber(1);
        gen.writeNumber(2);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[1,2]", out.toString("UTF-8"));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObject_mismatchContext_throwsException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartArray();
        gen.writeEndObject();
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndArray_mismatchContext_throwsException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartObject();
        gen.writeEndArray();
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldName_expectingValue_throwsException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartObject();
        gen.writeFieldName("key");
        gen.writeFieldName("key2");
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteValue_expectingFieldName_throwsException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.writeStartObject();
        gen.writeString("valueWithoutKey");
    }

    @Test
    public void testWriteFieldName_unquotedAndMultiple() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int features = 0; // QUOTE_FIELD_NAMES disabled by removing flag
        UTF8JsonGenerator gen = createGenerator(out, features);
        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);

        gen.writeStartObject();
        gen.writeFieldName("field1");
        gen.writeNumber(1);
        gen.writeFieldName("field2");
        gen.writeNumber(2);
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{field1:1,field2:2}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteFieldName_serializableString() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("key1"));
        gen.writeString("val1");
        gen.writeFieldName(new SerializedString("key2"));
        gen.writeString("val2");
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{\"key1\":\"val1\",\"key2\":\"val2\"}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteFieldName_serializableString_unquoted() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);

        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("key1"));
        gen.writeString("val1");
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{key1:\"val1\"}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteFieldName_longName() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3000; i++) {
            sb.append('a');
        }
        String longName = sb.toString();

        gen.writeStartObject();
        gen.writeFieldName(longName);
        gen.writeBoolean(true);
        gen.writeEndObject();
        gen.close();

        String expected = "{\"" + longName + "\":true}";
        Assert.assertEquals(expected, out.toString("UTF-8"));
    }

    @Test
    public void testWriteString_allVariants() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeString((String) null);
        gen.writeString("simple");
        gen.writeString(new SerializedString("serializable"));

        char[] chars = "charArray".toCharArray();
        gen.writeString(chars, 0, chars.length);

        byte[] rawUtf8 = "rawUtf8".getBytes("UTF-8");
        gen.writeRawUTF8String(rawUtf8, 0, rawUtf8.length);

        byte[] utf8 = "utf8String".getBytes("UTF-8");
        gen.writeUTF8String(utf8, 0, utf8.length);

        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[null,\"simple\",\"serializable\",\"charArray\",\"rawUtf8\",\"utf8String\"]",
                out.toString("UTF-8"));
    }

    @Test
    public void testWriteString_longStringWithEscapes() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2000; i++) {
            sb.append("a\nb\tc\"d\\");
        }
        String text = sb.toString();

        gen.writeStartArray();
        gen.writeString(text);
        char[] cbuf = text.toCharArray();
        gen.writeString(cbuf, 0, cbuf.length);
        byte[] ubuf = text.getBytes("UTF-8");
        gen.writeUTF8String(ubuf, 0, ubuf.length);
        gen.writeEndArray();
        gen.close();

        Assert.assertTrue(out.size() > 0);
    }

    @Test
    public void testWriteString_unicodeAndSurrogates() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        // 2-byte UTF-8, 3-byte UTF-8, and surrogate pair for code point U+1F600
        String text = "\u00E9 \u4E2D \uD83D\uDE00 \u0001";
        gen.writeStartArray();
        gen.writeString(text);
        gen.writeString(text.toCharArray(), 0, text.length());
        gen.writeEndArray();
        gen.close();

        Assert.assertTrue(out.toString("UTF-8").contains("\\u0001"));
    }

    @Test
    public void testWriteString_escapeNonAscii() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int features = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
        UTF8JsonGenerator gen = createGenerator(out, features);

        String text = "\u00E9\u4E2D";
        gen.writeStartArray();
        gen.writeString(text);
        gen.writeString(text.toCharArray(), 0, text.length());
        gen.writeEndArray();
        gen.close();

        String result = out.toString("UTF-8");
        Assert.assertTrue(result.contains("\\u00e9"));
        Assert.assertTrue(result.contains("\\u4e2d"));
    }

    @Test
    public void testWriteCustomCharacterEscapes() throws Exception {
        CharacterEscapes customEscapes = new CharacterEscapes() {
            @Override
            public int[] getEscapeCodesForAscii() {
                int[] codes = standardAsciiEscapesForJSON();
                codes['a'] = CharacterEscapes.ESCAPE_CUSTOM;
                return codes;
            }

            @Override
            public SerializableString getEscapeSequence(int ch) {
                if (ch == 'a') {
                    return new SerializedString("[ESCAPED_A_LONGER_THAN_6]");
                }
                if (ch == 0x4E2D) {
                    return new SerializedString("[ZH]");
                }
                return null;
            }
        };

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.setCharacterEscapes(customEscapes);

        gen.writeStartArray();
        gen.writeString("abc\u4E2D");
        gen.writeString("abc\u4E2D".toCharArray(), 0, 4);
        gen.writeEndArray();
        gen.close();

        String result = out.toString("UTF-8");
        Assert.assertTrue(result.contains("[ESCAPED_A_LONGER_THAN_6]"));
        Assert.assertTrue(result.contains("[ZH]"));
    }

    @Test
    public void testWriteRaw_variants() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeRaw("123");
        gen.writeRaw("prefix_456_suffix", 7, 3);
        gen.writeRaw(new SerializedString(",789"));
        gen.writeRaw(new SerializedString("")); // empty test
        gen.writeRaw(',');
        gen.writeRaw('\u00E9'); // 2-byte
        gen.writeRaw(',');
        gen.writeRaw('\u4E2D'); // 3-byte
        gen.writeRaw(',');

        char[] rawChars = "101112".toCharArray();
        gen.writeRaw(rawChars, 0, rawChars.length);
        gen.writeEndArray();
        gen.close();

        Assert.assertTrue(out.toString("UTF-8").contains("123"));
        Assert.assertTrue(out.toString("UTF-8").contains("456"));
        Assert.assertTrue(out.toString("UTF-8").contains("789"));
        Assert.assertTrue(out.toString("UTF-8").contains("101112"));
    }

    @Test
    public void testWriteRaw_largeStringAndSurrogates() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1500; i++) {
            sb.append("ascii \u00E9 \u4E2D \uD83D\uDE00 ");
        }
        String text = sb.toString();

        gen.writeStartArray();
        gen.writeRaw(text);
        gen.writeRaw(text, 0, text.length());
        char[] cbuf = text.toCharArray();
        gen.writeRaw(cbuf, 0, cbuf.length);
        gen.writeEndArray();
        gen.close();

        Assert.assertTrue(out.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testWriteRaw_splitSurrogateThrowsException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        char[] splitSurrogate = new char[] { '\uD83D' };
        gen.writeRaw(splitSurrogate, 0, 1);
    }

    @Test
    public void testWriteRawValue() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeRawValue(new SerializedString("{\"k\":\"v\"}"));
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[{\"k\":\"v\"}]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBinary_byteArray() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }

        gen.writeStartArray();
        gen.writeBinary(Base64Variants.MIME, data, 0, data.length);
        gen.writeBinary(Base64Variants.MIME, data, 0, 1);
        gen.writeBinary(Base64Variants.MIME, data, 0, 2);
        gen.writeBinary(Base64Variants.MIME, data, 0, 0);
        gen.writeEndArray();
        gen.close();

        Assert.assertTrue(out.size() > 0);
    }

    @Test
    public void testWriteBinary_inputStreamKnownLength() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        byte[] data = new byte[200];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }

        gen.writeStartArray();
        InputStream in = new ByteArrayInputStream(data);
        int written = gen.writeBinary(Base64Variants.MIME, in, data.length);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals(data.length, written);
    }

    @Test
    public void testWriteBinary_inputStreamUnknownLength() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        byte[] data = new byte[200];
        InputStream in = new ByteArrayInputStream(data);

        gen.writeStartArray();
        int written = gen.writeBinary(Base64Variants.MIME, in, -1);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals(data.length, written);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteBinary_inputStreamMissingBytes_throwsException() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        InputStream in = new ByteArrayInputStream(new byte[10]);
        gen.writeBinary(Base64Variants.MIME, in, 100);
    }

    @Test
    public void testWriteNumbers() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeNumber((short) 123);
        gen.writeNumber((short) -123);
        gen.writeNumber(456);
        gen.writeNumber(-456);
        gen.writeNumber(789L);
        gen.writeNumber(-789L);
        gen.writeNumber(BigInteger.valueOf(1000000L));
        gen.writeNumber((BigInteger) null);
        gen.writeNumber(12.34d);
        gen.writeNumber(56.78f);
        gen.writeNumber(new BigDecimal("123.456"));
        gen.writeNumber((BigDecimal) null);
        gen.writeNumber("9999");
        gen.writeEndArray();
        gen.close();

        String result = out.toString("UTF-8");
        Assert.assertTrue(result.contains("123"));
        Assert.assertTrue(result.contains("-123"));
        Assert.assertTrue(result.contains("456"));
        Assert.assertTrue(result.contains("789"));
        Assert.assertTrue(result.contains("1000000"));
        Assert.assertTrue(result.contains("null"));
        Assert.assertTrue(result.contains("12.34"));
        Assert.assertTrue(result.contains("56.78"));
        Assert.assertTrue(result.contains("123.456"));
        Assert.assertTrue(result.contains("9999"));
    }

    @Test
    public void testWriteNumbers_asStrings() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);

        gen.writeStartArray();
        gen.writeNumber((short) 10);
        gen.writeNumber(20);
        gen.writeNumber(30L);
        gen.writeNumber(BigInteger.valueOf(40));
        gen.writeNumber(50.5d);
        gen.writeNumber(60.5f);
        gen.writeNumber(new BigDecimal("70.7"));
        gen.writeNumber("80");
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[\"10\",\"20\",\"30\",\"40\",\"50.5\",\"60.5\",\"70.7\",\"80\"]",
                out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumbers_specialFloatingPoints() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);

        gen.writeStartArray();
        gen.writeNumber(Double.NaN);
        gen.writeNumber(Double.POSITIVE_INFINITY);
        gen.writeNumber(Double.NEGATIVE_INFINITY);
        gen.writeNumber(Float.NaN);
        gen.writeNumber(Float.POSITIVE_INFINITY);
        gen.writeNumber(Float.NEGATIVE_INFINITY);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[\"NaN\",\"Infinity\",\"-Infinity\",\"NaN\",\"Infinity\",\"-Infinity\"]",
                out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumbers_bigDecimalAsPlain() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);

        BigDecimal bd = new BigDecimal("1E-6");
        gen.writeStartArray();
        gen.writeNumber(bd);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[0.000001]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBooleanAndNull() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeBoolean(true);
        gen.writeBoolean(false);
        gen.writeNull();
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[true,false,null]", out.toString("UTF-8"));
    }

    @Test
    public void testPrettyPrinterSupport() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.setPrettyPrinter(new DefaultPrettyPrinter());

        gen.writeStartObject();
        gen.writeFieldName("field1");
        gen.writeString("val1");
        gen.writeFieldName(new SerializedString("field2"));
        gen.writeNumber(2);
        gen.writeFieldName("arr");
        gen.writeStartArray();
        gen.writeBoolean(true);
        gen.writeEndArray();
        gen.writeEndObject();
        gen.close();

        String result = out.toString("UTF-8");
        Assert.assertTrue(result.contains("\n"));
        Assert.assertTrue(result.contains("\"field1\" : \"val1\""));
    }

    @Test
    public void testPrettyPrinter_unquotedFieldNames() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.setPrettyPrinter(new DefaultPrettyPrinter());
        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);

        gen.writeStartObject();
        gen.writeFieldName("k1");
        gen.writeString("v1");
        gen.writeFieldName(new SerializedString("k2"));
        gen.writeString("v2");
        gen.writeEndObject();
        gen.close();

        String result = out.toString("UTF-8");
        Assert.assertTrue(result.contains("k1 : \"v1\""));
        Assert.assertTrue(result.contains("k2 : \"v2\""));
    }

    @Test
    public void testRootValueSeparator() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.setRootValueSeparator(new SerializedString(" | "));

        gen.writeNumber(1);
        gen.writeNumber(2);
        gen.writeNumber(3);
        gen.close();

        Assert.assertEquals("1 | 2 | 3", out.toString("UTF-8"));
    }

    @Test
    public void testAutoCloseJsonContent() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.enable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);

        gen.writeStartObject();
        gen.writeFieldName("arr");
        gen.writeStartArray();
        gen.writeString("item");
        // Not explicitly closing array and object
        gen.close();

        Assert.assertEquals("{\"arr\":[\"item\"]}", out.toString("UTF-8"));
    }

    @Test
    public void testAutoCloseTarget() throws Exception {
        final boolean[] closed = new boolean[1];
        OutputStream mockOut = new OutputStream() {
            @Override
            public void write(int b) {
            }

            @Override
            public void close() {
                closed[0] = true;
            }
        };

        IOContext ctxt = createIOContext();
        UTF8JsonGenerator gen = new UTF8JsonGenerator(ctxt, JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask(), null, mockOut);
        gen.writeNumber(123);
        gen.close();

        Assert.assertTrue(closed[0]);
    }

    @Test
    public void testFlush() throws Exception {
        final boolean[] flushed = new boolean[1];
        OutputStream mockOut = new OutputStream() {
            @Override
            public void write(int b) {
            }

            @Override
            public void flush() {
                flushed[0] = true;
            }
        };

        IOContext ctxt = createIOContext();
        UTF8JsonGenerator gen = new UTF8JsonGenerator(ctxt, JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.getMask(), null, mockOut);
        gen.writeNumber(123);
        gen.flush();

        Assert.assertTrue(flushed[0]);
        gen.close();
    }
}
