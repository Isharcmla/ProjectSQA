package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class UTF8JsonGeneratorTest {

    private UTF8JsonGenerator createGenerator(OutputStream out, int features) {
        IOContext ctxt = new IOContext(new BufferRecycler(), "test", false);
        return new UTF8JsonGenerator(ctxt, features, null, out);
    }

    private UTF8JsonGenerator createGenerator(OutputStream out) {
        return createGenerator(out, 0);
    }

    @Test
    public void testConstructorsAndTargetGetters_validInputs_returnsExpected() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOContext ctxt = new IOContext(new BufferRecycler(), "test", false);
        
        UTF8JsonGenerator gen = new UTF8JsonGenerator(ctxt, 0, null, out);
        Assert.assertSame(out, gen.getOutputTarget());
        Assert.assertEquals(0, gen.getOutputBuffered());
        gen.close();

        byte[] customBuffer = new byte[100];
        IOContext ctxt2 = new IOContext(new BufferRecycler(), "test2", false);
        UTF8JsonGenerator gen2 = new UTF8JsonGenerator(ctxt2, 0, null, out, customBuffer, 5, false);
        Assert.assertSame(out, gen2.getOutputTarget());
        Assert.assertEquals(5, gen2.getOutputBuffered());
        gen2.close();
    }

    @Test
    public void testWriteStartEndObjectAndArray_basicUsage_matchesJsonStructure() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartObject();
        gen.writeFieldName("arr");
        gen.writeStartArray();
        gen.writeNumber(1);
        gen.writeNumber(2);
        gen.writeEndArray();
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{\"arr\":[1,2]}", out.toString("UTF-8"));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObject_whenInArray_throwsException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeEndObject();
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndArray_whenInObject_throwsException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartObject();
        gen.writeEndArray();
    }

    @Test
    public void testWriteFieldName_variousCases_success() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartObject();
        gen.writeFieldName("shortName");
        gen.writeBoolean(true);

        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < 3000; i++) {
            longName.append("a");
        }
        gen.writeFieldName(longName.toString());
        gen.writeBoolean(false);

        SerializableString sStr = new SerializedString("serializableField");
        gen.writeFieldName(sStr);
        gen.writeNull();

        gen.writeEndObject();
        gen.close();

        String json = out.toString("UTF-8");
        Assert.assertTrue(json.startsWith("{\"shortName\":true,\""));
        Assert.assertTrue(json.contains("\"serializableField\":null}"));
    }

    @Test
    public void testWriteFieldName_unquotedFeatureEnabled_writesUnquotedNames() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int features = 0; // Disable QUOTE_FIELD_NAMES
        UTF8JsonGenerator gen = createGenerator(out, features);
        gen.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);

        gen.writeStartObject();
        gen.writeFieldName("unquotedKey");
        gen.writeNumber(123);
        gen.writeFieldName(new SerializedString("sKey"));
        gen.writeNumber(456);
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{unquotedKey:123,sKey:456}", out.toString("UTF-8"));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldName_whenExpectingValue_throwsException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartObject();
        gen.writeFieldName("key1");
        gen.writeFieldName("key2");
    }

    @Test
    public void testPrettyPrinter_allStructuralAndFieldMethods_formattedOutput() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.setPrettyPrinter(new DefaultPrettyPrinter());

        gen.writeStartObject();
        gen.writeFieldName("field1");
        gen.writeString("value1");
        gen.writeFieldName(new SerializedString("field2"));
        gen.writeStartArray();
        gen.writeNumber(10);
        gen.writeNumber(20);
        gen.writeEndArray();
        gen.writeEndObject();
        gen.close();

        String json = out.toString("UTF-8");
        Assert.assertTrue(json.contains("\n"));
        Assert.assertTrue(json.contains("\"field1\" : \"value1\""));
    }

    @Test
    public void testPrettyPrinter_unquotedFieldNames_formattedOutput() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
        gen.setPrettyPrinter(new DefaultPrettyPrinter());

        gen.writeStartObject();
        gen.writeFieldName("f1");
        gen.writeString("v1");
        gen.writeFieldName(new SerializedString("f2"));
        gen.writeString("v2");
        gen.writeEndObject();
        gen.close();

        String json = out.toString("UTF-8");
        Assert.assertTrue(json.contains("f1 : \"v1\""));
        Assert.assertTrue(json.contains("f2 : \"v2\""));
    }

    @Test
    public void testWriteString_nullAndNormalAndEscaped_correctlySerialized() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeString((String) null);
        gen.writeString("");
        gen.writeString("hello \t \n \r \" \\ \u0001 world");
        gen.writeString("2-byte UTF-8: \u00E9, 3-byte: \u4E2D");
        gen.writeString(new SerializedString("serializableText"));
        
        char[] chars = "charArrayText".toCharArray();
        gen.writeString(chars, 0, chars.length);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4000; i++) {
            sb.append("A");
        }
        gen.writeString(sb.toString());

        gen.writeEndArray();
        gen.close();

        String json = out.toString("UTF-8");
        Assert.assertTrue(json.startsWith("[null,\"\",\"hello \\t \\n \\r \\\" \\\\ \\u0001 world\""));
        Assert.assertTrue(json.contains("serializableText"));
        Assert.assertTrue(json.contains("charArrayText"));
    }

    @Test
    public void testWriteUTF8StringAndRawUTF8String_validInputs_success() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        byte[] raw = "raw UTF-8 \t test".getBytes("UTF-8");
        gen.writeRawUTF8String(raw, 0, raw.length);
        gen.writeUTF8String(raw, 0, raw.length);

        byte[] longUtf8 = new byte[3000];
        for (int i = 0; i < longUtf8.length; i++) {
            longUtf8[i] = (byte) ('a' + (i % 26));
        }
        gen.writeUTF8String(longUtf8, 0, longUtf8.length);

        gen.writeEndArray();
        gen.close();

        String json = out.toString("UTF-8");
        Assert.assertTrue(json.contains("raw UTF-8 \t test"));
    }

    @Test
    public void testWriteRaw_variousOverloads_success() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeRaw("123,");
        gen.writeRaw("456,789", 0, 4);
        gen.writeRaw(new SerializedString("111,"));
        gen.writeRaw(new char[]{'2', '2', '2', ','}, 0, 4);
        gen.writeRaw('3');
        gen.writeRaw('\u00E9');
        gen.writeRaw('\u4E2D');
        gen.writeRawValue(new SerializedString("999"));
        gen.writeEndArray();
        gen.close();

        String json = out.toString("UTF-8");
        Assert.assertTrue(json.contains("123,456,111,222,3\u00E9\u4E2D999"));
    }

    @Test
    public void testWriteRaw_surrogatePairs_success() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        String emoji = "\uD83D\uDE00";
        gen.writeRaw(emoji);
        gen.writeRaw(emoji.toCharArray(), 0, 2);
        gen.writeEndArray();
        gen.close();

        String json = out.toString("UTF-8");
        Assert.assertTrue(json.contains("\uD83D\uDE00"));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteRaw_splitSurrogate_throwsException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        char[] split = new char[]{'\uD83D'};
        gen.writeRaw(split, 0, 1);
    }

    @Test
    public void testWriteNumber_primitives_standardAndQuoted() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeNumber((short) 123);
        gen.writeNumber((short) -123);
        gen.writeNumber(456789);
        gen.writeNumber(-456789);
        gen.writeNumber(123456789012345L);
        gen.writeNumber(-123456789012345L);
        gen.writeNumber(12.34d);
        gen.writeNumber(56.78f);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[123,-123,456789,-456789,123456789012345,-123456789012345,12.34,56.78]", out.toString("UTF-8"));

        out.reset();
        UTF8JsonGenerator genQuoted = createGenerator(out);
        genQuoted.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);

        genQuoted.writeStartArray();
        genQuoted.writeNumber((short) 1);
        genQuoted.writeNumber(2);
        genQuoted.writeNumber(3L);
        genQuoted.writeNumber(4.5d);
        genQuoted.writeNumber(6.7f);
        genQuoted.writeNumber(new BigInteger("8"));
        genQuoted.writeNumber(new BigDecimal("9.10"));
        genQuoted.writeNumber("11.12");
        genQuoted.writeEndArray();
        genQuoted.close();

        Assert.assertEquals("[\"1\",\"2\",\"3\",\"4.5\",\"6.7\",\"8\",\"9.10\",\"11.12\"]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_specialDoubleAndFloat_handledCorrectly() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeNumber(Double.NaN);
        gen.writeNumber(Double.POSITIVE_INFINITY);
        gen.writeNumber(Double.NEGATIVE_INFINITY);
        gen.writeNumber(Float.NaN);
        gen.writeNumber(Float.POSITIVE_INFINITY);
        gen.writeNumber(Float.NEGATIVE_INFINITY);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[\"NaN\",\"Infinity\",\"-Infinity\",\"NaN\",\"Infinity\",\"-Infinity\"]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumber_bigNumbers_standardAndPlain() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartArray();
        gen.writeNumber((BigInteger) null);
        gen.writeNumber(new BigInteger("12345678901234567890"));
        gen.writeNumber((BigDecimal) null);
        gen.writeNumber(new BigDecimal("1e-5"));
        gen.writeNumber("99999");
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[null,12345678901234567890,null,1e-5,99999]", out.toString("UTF-8"));

        out.reset();
        UTF8JsonGenerator genPlain = createGenerator(out);
        genPlain.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, true);

        genPlain.writeStartArray();
        genPlain.writeNumber(new BigDecimal("1e-5"));
        genPlain.writeEndArray();
        genPlain.close();

        Assert.assertEquals("[0.00001]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBooleanAndNull_various_success() throws IOException {
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
    public void testWriteBinary_byteArray_encodedProperly() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        byte[] data = "Hello Jackson Base64 Encoding World!".getBytes("UTF-8");
        gen.writeStartArray();
        gen.writeBinary(Base64Variants.MIME, data, 0, data.length);
        gen.writeBinary(Base64Variants.MIME, data, 0, 1);
        gen.writeBinary(Base64Variants.MIME, data, 0, 2);
        gen.writeEndArray();
        gen.close();

        String json = out.toString("UTF-8");
        Assert.assertTrue(json.startsWith("[\""));
        Assert.assertTrue(json.endsWith("\"]"));
    }

    @Test
    public void testWriteBinary_inputStream_fixedAndUnknownLength() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        byte[] data = new byte[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }

        gen.writeStartArray();
        InputStream in1 = new ByteArrayInputStream(data);
        int bytes1 = gen.writeBinary(Base64Variants.MIME, in1, data.length);
        Assert.assertEquals(data.length, bytes1);

        InputStream in2 = new ByteArrayInputStream(data);
        int bytes2 = gen.writeBinary(Base64Variants.MIME, in2, -1);
        Assert.assertEquals(data.length, bytes2);
        gen.writeEndArray();
        gen.close();
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteBinary_inputStreamMissingBytes_throwsException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        byte[] data = new byte[10];
        InputStream in = new ByteArrayInputStream(data);
        gen.writeStartArray();
        gen.writeBinary(Base64Variants.MIME, in, 20);
    }

    @Test
    public void testCharacterEscapes_customEscapes_escapedAsConfigured() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        CharacterEscapes customEscapes = new CharacterEscapes() {
            @Override
            public int[] getEscapeCodesForAscii() {
                int[] codes = standardAsciiEscapesForJSON();
                codes['a'] = CharacterEscapes.ESCAPE_CUSTOM;
                codes['b'] = CharacterEscapes.ESCAPE_STANDARD;
                return codes;
            }

            @Override
            public SerializableString getEscapeSequence(int ch) {
                if (ch == 'a') {
                    return new SerializedString("[custom_a]");
                }
                return null;
            }
        };

        gen.setCharacterEscapes(customEscapes);

        gen.writeStartArray();
        gen.writeString("abc");
        gen.writeString(new char[]{'a', 'b', 'c'}, 0, 3);
        gen.writeEndArray();
        gen.close();

        String json = out.toString("UTF-8");
        Assert.assertTrue(json.contains("[custom_a]"));
    }

    @Test
    public void testEscapeNonAscii_featureEnabled_escapesUnicodeToHex() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);
        gen.configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);
        gen.setHighestNonEscapedChar(127);

        gen.writeStartArray();
        gen.writeString("Café \u4E2D");
        gen.writeString(new char[]{'C', 'a', 'f', '\u00E9'}, 0, 4);
        gen.writeEndArray();
        gen.close();

        String json = out.toString("UTF-8");
        Assert.assertTrue(json.contains("\\u00E9") || json.contains("\\u00e9"));
    }

    @Test
    public void testFlushAndClose_autoCloseFeatures_properlyClosesScopesAndStreams() throws IOException {
        final boolean[] streamClosed = new boolean[]{false};
        final boolean[] streamFlushed = new boolean[]{false};
        OutputStream trackingOut = new OutputStream() {
            private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

            @Override
            public void write(int b) {
                bos.write(b);
            }

            @Override
            public void write(byte[] b, int off, int len) {
                bos.write(b, off, len);
            }

            @Override
            public void flush() {
                streamFlushed[0] = true;
            }

            @Override
            public void close() {
                streamClosed[0] = true;
            }
        };

        UTF8JsonGenerator gen = createGenerator(trackingOut);
        gen.configure(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT, true);
        gen.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, true);
        gen.configure(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM, true);

        gen.writeStartObject();
        gen.writeFieldName("array");
        gen.writeStartArray();
        gen.writeNumber(1);

        gen.flush();
        Assert.assertTrue(streamFlushed[0]);

        gen.close();
        Assert.assertTrue(streamClosed[0]);
        Assert.assertTrue(gen.isClosed());
    }

    @Test(expected = JsonGenerationException.class)
    public void testVerifyValueWrite_valueWhenExpectingFieldName_throwsException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        UTF8JsonGenerator gen = createGenerator(out);

        gen.writeStartObject();
        gen.writeNumber(100);
    }
}
