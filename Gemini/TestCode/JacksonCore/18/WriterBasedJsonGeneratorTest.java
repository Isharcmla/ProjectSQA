package com.fasterxml.jackson.core.json;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public class WriterBasedJsonGeneratorTest {

    private WriterBasedJsonGenerator createGenerator(Writer writer, int features) {
        IOContext ctxt = new IOContext(new BufferRecycler(), writer, false);
        return new WriterBasedJsonGenerator(ctxt, features, null, writer);
    }

    private WriterBasedJsonGenerator createGenerator(Writer writer, int features, boolean resourceManaged) {
        IOContext ctxt = new IOContext(new BufferRecycler(), writer, resourceManaged);
        return new WriterBasedJsonGenerator(ctxt, features, null, writer);
    }

    @Test
    public void testGetOutputTargetAndBuffered() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        Assert.assertSame(sw, gen.getOutputTarget());
        Assert.assertEquals(0, gen.getOutputBuffered());

        gen.writeRaw("123");
        Assert.assertEquals(3, gen.getOutputBuffered());

        gen.flush();
        Assert.assertEquals(0, gen.getOutputBuffered());
        gen.close();
    }

    @Test
    public void testWriteStartAndEndObject() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartObject();
        gen.writeFieldName("key");
        gen.writeString("val");
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{\"key\":\"val\"}", sw.toString());
    }

    @Test
    public void testWriteStartAndEndArray() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartArray();
        gen.writeNumber(1);
        gen.writeNumber(2);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[1,2]", sw.toString());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObject_mismatchContext_throwsException() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartArray();
        gen.writeEndObject();
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndArray_mismatchContext_throwsException() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartObject();
        gen.writeEndArray();
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldName_whenExpectingValue_throwsException() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeFieldName("b");
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldNameSerializable_whenExpectingValue_throwsException() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("a"));
        gen.writeFieldName(new SerializedString("b"));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteValue_whenExpectingFieldName_throwsException() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartObject();
        gen.writeString("valueWithoutField");
    }

    @Test
    public void testWriteFieldName_unquotedAndSerializedString() throws IOException {
        StringWriter sw = new StringWriter();
        int features = 0; // QUOTE_FIELD_NAMES disabled by default if bit is 0
        WriterBasedJsonGenerator gen = createGenerator(sw, features);
        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);

        gen.writeStartObject();
        gen.writeFieldName("unq1");
        gen.writeNumber(10);
        gen.writeFieldName(new SerializedString("unq2"));
        gen.writeNumber(20);
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{unq1:10,unq2:20}", sw.toString());
    }

    @Test
    public void testWriteFieldName_serializableString_quotedNormalAndOverflow() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask());

        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("shortKey"));
        gen.writeBoolean(true);

        char[] longChars = new char[5000];
        Arrays.fill(longChars, 'k');
        String longKey = new String(longChars);
        gen.writeFieldName(new SerializedString(longKey));
        gen.writeBoolean(false);
        gen.writeEndObject();
        gen.close();

        String result = sw.toString();
        Assert.assertTrue(result.startsWith("{\"shortKey\":true,\""));
        Assert.assertTrue(result.endsWith(":false}"));
    }

    @Test
    public void testWriteString_nullAndNormalAndEscapes() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartArray();
        gen.writeString((String) null);
        gen.writeString("");
        gen.writeString("hello world");
        gen.writeString("quotes: \" and backslash: \\ and controls: \b\t\n\f\r \u0001 \u001F");
        gen.writeEndArray();
        gen.close();

        String result = sw.toString();
        Assert.assertTrue(result.contains("null"));
        Assert.assertTrue(result.contains("\"\""));
        Assert.assertTrue(result.contains("\"hello world\""));
        Assert.assertTrue(result.contains("\\\""));
        Assert.assertTrue(result.contains("\\\\"));
        Assert.assertTrue(result.contains("\\b\\t\\n\\f\\r"));
        Assert.assertTrue(result.contains("\\u0001"));
    }

    @Test
    public void testWriteString_charArrayAndSerializableString() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartArray();
        char[] text = "abcdefgh".toCharArray();
        gen.writeString(text, 2, 4); // "cdef"

        SerializedString shortSStr = new SerializedString("short");
        gen.writeString(shortSStr);

        char[] longChars = new char[100];
        Arrays.fill(longChars, 'y');
        SerializedString longSStr = new SerializedString(new String(longChars));
        gen.writeString(longSStr);

        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[\"cdef\",\"short\",\"" + new String(longChars) + "\"]", sw.toString());
    }

    @Test
    public void testWriteString_longStringSegmenting() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        char[] chars = new char[6000];
        Arrays.fill(chars, 'a');
        chars[1000] = '"';
        chars[2000] = '\n';
        chars[3000] = '\u0005';
        String longStr = new String(chars);

        gen.writeStartArray();
        gen.writeString(longStr);
        gen.writeEndArray();
        gen.close();

        String output = sw.toString();
        Assert.assertTrue(output.startsWith("[\""));
        Assert.assertTrue(output.contains("\\\""));
        Assert.assertTrue(output.contains("\\n"));
        Assert.assertTrue(output.contains("\\u0005"));
        Assert.assertTrue(output.endsWith("\"]"));
    }

    @Test
    public void testWriteRaw_variants() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeRaw("/*raw1*/");
        gen.writeRaw("/*raw2LongRange*/", 2, 4); // "raw2"
        gen.writeRaw(new SerializedString("/*raw3*/"));

        char[] rawCharsShort = "/*raw4*/".toCharArray();
        gen.writeRaw(rawCharsShort, 0, rawCharsShort.length);

        char[] rawCharsLong = new char[100];
        Arrays.fill(rawCharsLong, 'z');
        gen.writeRaw(rawCharsLong, 0, rawCharsLong.length);

        gen.writeRaw('!');

        char[] hugeChars = new char[9000];
        Arrays.fill(hugeChars, 'H');
        gen.writeRaw(new String(hugeChars));

        gen.close();

        String res = sw.toString();
        Assert.assertTrue(res.startsWith("/*raw1*/raw2/*raw3*//*raw4*/"));
        Assert.assertTrue(res.contains("!"));
        Assert.assertTrue(res.contains(new String(hugeChars)));
    }

    @Test
    public void testWriteRaw_stringOffsetLengthLong() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        char[] hugeChars = new char[8000];
        Arrays.fill(hugeChars, 'X');
        String hugeStr = "PREFIX" + new String(hugeChars) + "SUFFIX";

        gen.writeRaw(hugeStr, 6, 8000);
        gen.close();

        Assert.assertEquals(new String(hugeChars), sw.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUTF8String_unsupported() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);
        gen.writeRawUTF8String(new byte[]{1, 2}, 0, 2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteUTF8String_unsupported() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);
        gen.writeUTF8String(new byte[]{1, 2}, 0, 2);
    }

    @Test
    public void testWriteNumbers_primitives() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartArray();
        gen.writeNumber((short) -123);
        gen.writeNumber((int) -456789);
        gen.writeNumber((long) -12345678901234L);
        gen.writeNumber(3.1415926535);
        gen.writeNumber(2.71828f);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[-123,-456789,-12345678901234,3.1415926535,2.71828]", sw.toString());
    }

    @Test
    public void testWriteNumbers_asStringsFeature() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask());

        gen.writeStartArray();
        gen.writeNumber((short) 1);
        gen.writeNumber(2);
        gen.writeNumber(3L);
        gen.writeNumber(BigInteger.valueOf(4));
        gen.writeNumber(5.5d);
        gen.writeNumber(6.5f);
        gen.writeNumber(new BigDecimal("7.89"));
        gen.writeNumber("999");
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[\"1\",\"2\",\"3\",\"4\",\"5.5\",\"6.5\",\"7.89\",\"999\"]", sw.toString());
    }

    @Test
    public void testWriteNumbers_specialDoublesAndFloats() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.getMask());

        gen.writeStartArray();
        gen.writeNumber(Double.NaN);
        gen.writeNumber(Double.POSITIVE_INFINITY);
        gen.writeNumber(Double.NEGATIVE_INFINITY);
        gen.writeNumber(Float.NaN);
        gen.writeNumber(Float.POSITIVE_INFINITY);
        gen.writeNumber(Float.NEGATIVE_INFINITY);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[\"NaN\",\"Infinity\",\"-Infinity\",\"NaN\",\"Infinity\",\"-Infinity\"]", sw.toString());
    }

    @Test
    public void testWriteNumbers_bigIntegerAndBigDecimalAndEncoded() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartArray();
        gen.writeNumber((BigInteger) null);
        gen.writeNumber(new BigInteger("12345678901234567890"));
        gen.writeNumber((BigDecimal) null);
        gen.writeNumber(new BigDecimal("1E-5"));
        gen.writeNumber("12345");
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[null,12345678901234567890,null,0.00001,12345]", sw.toString());
    }

    @Test
    public void testWriteNumber_bigDecimalAsPlain() throws IOException {
        StringWriter sw = new StringWriter();
        int features = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
        WriterBasedJsonGenerator gen = createGenerator(sw, features);

        gen.writeStartArray();
        gen.writeNumber(new BigDecimal("1E-5"));
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[0.00001]", sw.toString());

        StringWriter sw2 = new StringWriter();
        int features2 = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask()
                | JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        WriterBasedJsonGenerator gen2 = createGenerator(sw2, features2);
        gen2.writeStartArray();
        gen2.writeNumber(new BigDecimal("1E-5"));
        gen2.writeEndArray();
        gen2.close();

        Assert.assertEquals("[\"0.00001\"]", sw2.toString());
    }

    @Test
    public void testWriteBooleanAndNull() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartArray();
        gen.writeBoolean(true);
        gen.writeBoolean(false);
        gen.writeNull();
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals("[true,false,null]", sw.toString());
    }

    @Test
    public void testWriteBinary_byteArray() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        byte[] data = "Hello Jackson Base64 Testing World!".getBytes("UTF-8");
        gen.writeStartArray();
        gen.writeBinary(Base64Variants.MIME, data, 0, data.length);
        gen.writeBinary(Base64Variants.MIME, data, 0, 1);
        gen.writeBinary(Base64Variants.MIME, data, 0, 2);
        gen.writeEndArray();
        gen.close();

        String res = sw.toString();
        Assert.assertTrue(res.startsWith("[\""));
        Assert.assertTrue(res.endsWith("\"]"));
    }

    @Test
    public void testWriteBinary_byteArray_withLineBreaks() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        byte[] data = new byte[200];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }

        gen.writeStartArray();
        gen.writeBinary(Base64Variants.MIME, data, 0, data.length);
        gen.writeEndArray();
        gen.close();

        String res = sw.toString();
        Assert.assertTrue(res.contains("\\n"));
    }

    @Test
    public void testWriteBinary_inputStream_knownLength() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        byte[] data = "BinaryStreamDataJackson".getBytes("UTF-8");
        gen.writeStartArray();
        int written = gen.writeBinary(Base64Variants.MIME, new ByteArrayInputStream(data), data.length);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals(data.length, written);
        Assert.assertTrue(sw.toString().startsWith("[\""));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteBinary_inputStream_missingBytes() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        byte[] data = "TooShort".getBytes("UTF-8");
        gen.writeBinary(Base64Variants.MIME, new ByteArrayInputStream(data), data.length + 10);
    }

    @Test
    public void testWriteBinary_inputStream_unknownLength() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        byte[] data = new byte[150];
        Arrays.fill(data, (byte) 'B');

        gen.writeStartArray();
        int written = gen.writeBinary(Base64Variants.MIME, new ByteArrayInputStream(data), -1);
        gen.writeEndArray();
        gen.close();

        Assert.assertEquals(150, written);
    }

    @Test
    public void testWriteBinary_inputStream_partialTripletsAndEmpty() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);

        gen.writeStartArray();
        gen.writeBinary(Base64Variants.MIME, new ByteArrayInputStream(new byte[]{1}), -1);
        gen.writeBinary(Base64Variants.MIME, new ByteArrayInputStream(new byte[]{1, 2}), -1);
        gen.writeBinary(Base64Variants.MIME, new ByteArrayInputStream(new byte[0]), -1);
        gen.writeEndArray();
        gen.close();

        Assert.assertTrue(sw.toString().startsWith("[\""));
    }

    @Test
    public void testPrettyPrinter_allPaths() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);
        gen.setPrettyPrinter(new DefaultPrettyPrinter());

        gen.writeStartObject();
        gen.writeFieldName("arr");
        gen.writeStartArray();
        gen.writeNumber(1);
        gen.writeNumber(2);
        gen.writeEndArray();
        gen.writeFieldName(new SerializedString("obj"));
        gen.writeStartObject();
        gen.writeFieldName("k");
        gen.writeString("v");
        gen.writeEndObject();
        gen.writeEndObject();
        gen.close();

        String res = sw.toString();
        Assert.assertTrue(res.contains("{\n"));
        Assert.assertTrue(res.contains("\"arr\" : ["));
    }

    @Test
    public void testPrettyPrinter_unquotedFieldNames() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);
        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        gen.setPrettyPrinter(new DefaultPrettyPrinter());

        gen.writeStartObject();
        gen.writeFieldName("rawField");
        gen.writeString("value");
        gen.writeFieldName(new SerializedString("rawField2"));
        gen.writeString("value2");
        gen.writeEndObject();
        gen.close();

        String res = sw.toString();
        Assert.assertTrue(res.contains("rawField : \"value\""));
        Assert.assertTrue(res.contains("rawField2 : \"value2\""));
    }

    @Test
    public void testEscapes_highestNonEscapedChar() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);
        gen.setHighestNonEscapedChar(127);

        gen.writeStartArray();
        gen.writeString("ascii only: \u00E9 \u1234");
        char[] text = "arr: \u00E9 \u1234".toCharArray();
        gen.writeString(text, 0, text.length);

        char[] longChars = new char[5000];
        Arrays.fill(longChars, 'A');
        longChars[2000] = '\u00FC';
        longChars[4000] = '\u2345';
        gen.writeString(new String(longChars));
        gen.writeEndArray();
        gen.close();

        String res = sw.toString();
        Assert.assertTrue(res.contains("\\u00e9") || res.contains("\\u00E9"));
        Assert.assertTrue(res.contains("\\u1234"));
        Assert.assertTrue(res.contains("\\u00fc") || res.contains("\\u00FC"));
    }

    @Test
    public void testEscapes_customCharacterEscapes() throws IOException {
        CharacterEscapes custom = new CharacterEscapes() {
            @Override
            public int[] getEscapeCodesForAscii() {
                int[] escapes = CharacterEscapes.standardAsciiEscapesForJSON();
                escapes['a'] = CharacterEscapes.ESCAPE_CUSTOM;
                escapes['b'] = CharacterEscapes.ESCAPE_STANDARD;
                return escapes;
            }

            @Override
            public SerializableString getEscapeSequence(int ch) {
                if (ch == 'a') {
                    return new SerializedString("[customA]");
                }
                return null;
            }
        };

        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);
        gen.setCharacterEscapes(custom);

        gen.writeStartArray();
        gen.writeString("abc \u0105");
        char[] buf = "abc \u0105".toCharArray();
        gen.writeString(buf, 0, buf.length);

        char[] longChars = new char[5000];
        Arrays.fill(longChars, 'x');
        longChars[100] = 'a';
        longChars[200] = 'b';
        longChars[300] = '\u0200';
        gen.writeString(new String(longChars));
        gen.writeEndArray();
        gen.close();

        String res = sw.toString();
        Assert.assertTrue(res.contains("[customA]"));
        Assert.assertTrue(res.contains("\\u0062"));
    }

    @Test
    public void testAutoCloseJsonContent() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.getMask());

        gen.writeStartObject();
        gen.writeFieldName("arr");
        gen.writeStartArray();
        gen.writeNumber(1);

        gen.close();

        Assert.assertEquals("{\"arr\":[1]}", sw.toString());
    }

    @Test
    public void testAutoCloseTargetEnabled() throws IOException {
        TestWriter tw = new TestWriter();
        WriterBasedJsonGenerator gen = createGenerator(tw, JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask(), false);
        gen.writeNumber(123);
        gen.close();

        Assert.assertTrue(tw.closed);
    }

    @Test
    public void testAutoCloseTargetDisabledWithFlushPassed() throws IOException {
        TestWriter tw = new TestWriter();
        int features = JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.getMask();
        WriterBasedJsonGenerator gen = createGenerator(tw, features, false);
        gen.writeNumber(456);
        gen.flush();
        Assert.assertTrue(tw.flushed);

        gen.close();
        Assert.assertFalse(tw.closed);
    }

    @Test
    public void testAutoCloseTargetManagedResource() throws IOException {
        TestWriter tw = new TestWriter();
        WriterBasedJsonGenerator gen = createGenerator(tw, 0, true);
        gen.writeNumber(789);
        gen.close();

        Assert.assertTrue(tw.closed);
    }

    @Test
    public void testRootValueSeparator() throws IOException {
        StringWriter sw = new StringWriter();
        WriterBasedJsonGenerator gen = createGenerator(sw, 0);
        gen.setRootValueSeparator(new SerializedString(" "));

        gen.writeNumber(1);
        gen.writeNumber(2);
        gen.writeNumber(3);
        gen.close();

        Assert.assertEquals("1 2 3", sw.toString());
    }

    private static class TestWriter extends Writer {
        boolean closed = false;
        boolean flushed = false;
        final StringBuilder sb = new StringBuilder();

        @Override
        public void write(char[] cbuf, int off, int len) {
            sb.append(cbuf, off, len);
        }

        @Override
        public void flush() {
            flushed = true;
        }

        @Override
        public void close() {
            closed = true;
        }
    }
}
