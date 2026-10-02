package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.IntNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TokenBufferTest {

    @Test
    public void testConstructorsAndVersion() throws Exception {
        TokenBuffer tb1 = new TokenBuffer((ObjectCodec) null);
        Assert.assertNotNull(tb1.version());
        Assert.assertNull(tb1.getCodec());

        TokenBuffer tb2 = new TokenBuffer((ObjectCodec) null, true);
        Assert.assertTrue(tb2.canWriteTypeId());
        Assert.assertTrue(tb2.canWriteObjectId());

        ObjectMapper mapper = new ObjectMapper();
        JsonParser jp = mapper.getFactory().createParser("{\"a\":123}");
        TokenBuffer tb3 = new TokenBuffer(jp);
        Assert.assertEquals(mapper, tb3.getCodec());

        TokenBuffer tb4 = new TokenBuffer(jp, null);
        Assert.assertEquals(mapper, tb4.getCodec());
        jp.close();
    }

    @Test
    public void testBasicWritingAndReading() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, false);
        Assert.assertNull(tb.firstToken());

        tb.writeStartObject();
        Assert.assertEquals(JsonToken.START_OBJECT, tb.firstToken());
        tb.writeFieldName("str");
        tb.writeString("value");
        tb.writeFieldName(new SerializedString("strNull"));
        tb.writeString((String) null);
        tb.writeFieldName("strNullSer");
        tb.writeString((SerializableString) null);
        tb.writeFieldName("strSer");
        tb.writeString(new SerializedString("serVal"));
        tb.writeFieldName("chars");
        char[] cbuf = "hello world".toCharArray();
        tb.writeString(cbuf, 0, 5);

        tb.writeFieldName("boolTrue");
        tb.writeBoolean(true);
        tb.writeFieldName("boolFalse");
        tb.writeBoolean(false);
        tb.writeFieldName("nullVal");
        tb.writeNull();

        tb.writeFieldName("numShort");
        tb.writeNumber((short) 10);
        tb.writeFieldName("numInt");
        tb.writeNumber(100);
        tb.writeFieldName("numLong");
        tb.writeNumber(1000L);
        tb.writeFieldName("numBigInt");
        tb.writeNumber(new BigInteger("12345678901234567890"));
        tb.writeFieldName("numBigIntNull");
        tb.writeNumber((BigInteger) null);
        tb.writeFieldName("numDouble");
        tb.writeNumber(1.23d);
        tb.writeFieldName("numFloat");
        tb.writeNumber(4.56f);
        tb.writeFieldName("numBigDec");
        tb.writeNumber(new BigDecimal("78.90"));
        tb.writeFieldName("numBigDecNull");
        tb.writeNumber((BigDecimal) null);
        tb.writeFieldName("numEncoded");
        tb.writeNumber("999");

        tb.writeFieldName("arr");
        tb.writeStartArray();
        tb.writeEndArray();

        tb.writeEndObject();

        Assert.assertFalse(tb.isClosed());
        tb.flush();
        tb.close();
        Assert.assertTrue(tb.isClosed());

        JsonParser p = tb.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals("str", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("value", p.getText());
        Assert.assertArrayEquals("value".toCharArray(), p.getTextCharacters());
        Assert.assertEquals(5, p.getTextLength());
        Assert.assertEquals(0, p.getTextOffset());
        Assert.assertFalse(p.hasTextCharacters());

        Assert.assertEquals("strNull", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        Assert.assertEquals("null", p.getText());

        Assert.assertEquals("strNullSer", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals("strSer", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("serVal", p.getText());

        Assert.assertEquals("chars", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("hello", p.getText());

        Assert.assertEquals("boolTrue", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        Assert.assertEquals("true", p.getText());

        Assert.assertEquals("boolFalse", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        Assert.assertEquals("false", p.getText());

        Assert.assertEquals("nullVal", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals("numShort", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(10, p.getIntValue());
        Assert.assertEquals(10L, p.getLongValue());
        Assert.assertEquals(JsonParser.NumberType.INT, p.getNumberType());
        Assert.assertEquals(BigInteger.valueOf(10), p.getBigIntegerValue());
        Assert.assertEquals(BigDecimal.valueOf(10), p.getDecimalValue());
        Assert.assertEquals(10.0, p.getDoubleValue(), 0.001);
        Assert.assertEquals(10.0f, p.getFloatValue(), 0.001f);

        Assert.assertEquals("numInt", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(100, p.getIntValue());

        Assert.assertEquals("numLong", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1000L, p.getLongValue());
        Assert.assertEquals(JsonParser.NumberType.LONG, p.getNumberType());

        Assert.assertEquals("numBigInt", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(new BigInteger("12345678901234567890"), p.getBigIntegerValue());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, p.getNumberType());
        Assert.assertEquals(new BigDecimal(new BigInteger("12345678901234567890")), p.getDecimalValue());

        Assert.assertEquals("numBigIntNull", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals("numDouble", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(1.23d, p.getDoubleValue(), 0.0001);
        Assert.assertEquals(JsonParser.NumberType.DOUBLE, p.getNumberType());
        Assert.assertEquals(BigDecimal.valueOf(1.23d), p.getDecimalValue());
        Assert.assertEquals(BigInteger.valueOf(1), p.getBigIntegerValue());

        Assert.assertEquals("numFloat", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(4.56f, p.getFloatValue(), 0.0001f);
        Assert.assertEquals(JsonParser.NumberType.FLOAT, p.getNumberType());

        Assert.assertEquals("numBigDec", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(new BigDecimal("78.90"), p.getDecimalValue());
        Assert.assertEquals(JsonParser.NumberType.BIG_DECIMAL, p.getNumberType());
        Assert.assertEquals(new BigInteger("78"), p.getBigIntegerValue());

        Assert.assertEquals("numBigDecNull", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals("numEncoded", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(999L, p.getLongValue());
        Assert.assertEquals(999, p.getIntValue());

        Assert.assertEquals("arr", p.nextFieldName());
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
        p.close();
        Assert.assertTrue(p.isClosed());
    }

    @Test
    public void testSegmentOverflowAndManyTokens() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, false);
        for (int i = 0; i < 40; i++) {
            tb.writeNumber(i);
        }
        JsonParser p = tb.asParser();
        for (int i = 0; i < 40; i++) {
            Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            Assert.assertEquals(i, p.getIntValue());
        }
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testRawValuesAndBinary() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeRawValue("raw1");
        tb.writeRawValue("raw2_long", 0, 4);
        tb.writeRawValue(new char[]{'a', 'b', 'c', 'd'}, 1, 2);

        byte[] binaryData = new byte[]{1, 2, 3, 4, 5};
        tb.writeBinary(Base64Variants.MIME, binaryData, 0, binaryData.length);

        tb.writeString(Base64Variants.MIME.encode(binaryData));

        JsonParser p = tb.asParser();

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        Assert.assertTrue(p.getEmbeddedObject() instanceof RawValue);

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        Assert.assertEquals("bc", p.getEmbeddedObject());

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        byte[] readBin1 = p.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(binaryData, readBin1);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len = p.readBinaryValue(Base64Variants.MIME, baos);
        Assert.assertEquals(5, len);
        Assert.assertArrayEquals(binaryData, baos.toByteArray());

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] readBin2 = p.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(binaryData, readBin2);

        p.close();
    }

    @Test
    public void testNativeIds() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeTypeId("myTypeId");
        tb.writeObjectId("myObjectId");
        tb.writeStartObject();

        tb.writeFieldName("prop");
        tb.writeString("val");
        tb.writeEndObject();

        TokenBuffer.Parser p = (TokenBuffer.Parser) tb.asParser();
        Assert.assertTrue(p.canReadTypeId());
        Assert.assertTrue(p.canReadObjectId());

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals("myTypeId", p.getTypeId());
        Assert.assertEquals("myObjectId", p.getObjectId());

        Assert.assertEquals("prop", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertNull(p.getTypeId());
        Assert.assertNull(p.getObjectId());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testNativeIdsMultiSegment() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, true);
        for (int i = 0; i < 20; i++) {
            tb.writeTypeId("type-" + i);
            tb.writeObjectId("obj-" + i);
            tb.writeNumber(i);
        }

        TokenBuffer.Parser p = (TokenBuffer.Parser) tb.asParser();
        for (int i = 0; i < 20; i++) {
            Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            Assert.assertEquals("type-" + i, p.getTypeId());
            Assert.assertEquals("obj-" + i, p.getObjectId());
            Assert.assertEquals(i, p.getIntValue());
        }
        p.close();
    }

    @Test
    public void testSerializationAllTypes() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeTypeId("TID");
        tb.writeObjectId("OID");
        tb.writeStartObject();

        tb.writeFieldName("fStr");
        tb.writeString("strVal");
        tb.writeFieldName(new SerializedString("fSerStr"));
        tb.writeString(new SerializedString("serVal"));

        tb.writeFieldName("fInt");
        tb.writeNumber(1);
        tb.writeFieldName("fBigInt");
        tb.writeNumber(BigInteger.TEN);
        tb.writeFieldName("fLong");
        tb.writeNumber(100L);
        tb.writeFieldName("fShort");
        tb.writeNumber((short) 5);
        tb.writeFieldName("fByteNum");
        tb._append(JsonToken.VALUE_NUMBER_INT, Byte.valueOf((byte) 3));

        tb.writeFieldName("fDouble");
        tb.writeNumber(1.5d);
        tb.writeFieldName("fBigDec");
        tb.writeNumber(new BigDecimal("3.14"));
        tb.writeFieldName("fFloat");
        tb.writeNumber(2.5f);
        tb.writeFieldName("fNullFloat");
        tb._append(JsonToken.VALUE_NUMBER_FLOAT, null);
        tb.writeFieldName("fStrFloat");
        tb.writeNumber("4.56");

        tb.writeFieldName("fTrue");
        tb.writeBoolean(true);
        tb.writeFieldName("fFalse");
        tb.writeBoolean(false);
        tb.writeFieldName("fNull");
        tb.writeNull();

        tb.writeFieldName("fRaw");
        tb.writeRawValue("{\"raw\":true}");
        tb.writeFieldName("fEmbedded");
        tb.writeObject(new byte[]{1, 2, 3});

        tb.writeFieldName("fArr");
        tb.writeStartArray();
        tb.writeEndArray();

        tb.writeEndObject();

        TokenBuffer target = new TokenBuffer(null, true);
        tb.serialize(target);

        JsonParser p = target.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        while (p.nextToken() != null) {
            // consume
        }
        p.close();
    }

    @Test(expected = JsonGenerationException.class)
    public void testSerializeUnrecognizedFloatThrows() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb._append(JsonToken.VALUE_NUMBER_FLOAT, new Object());
        TokenBuffer target = new TokenBuffer(null, false);
        tb.serialize(target);
    }

    @Test
    public void testAppendBuffer() throws Exception {
        TokenBuffer tb1 = new TokenBuffer(null, true);
        tb1.writeStartObject();
        tb1.writeFieldName("a");
        tb1.writeNumber(1);
        tb1.writeEndObject();

        TokenBuffer tb2 = new TokenBuffer(null, false);
        tb2.writeStartObject();
        tb2.writeFieldName("b");
        tb2.writeNumber(2);
        tb2.writeEndObject();

        tb2.append(tb1);

        JsonParser p = tb2.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals("b", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals("a", p.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testDeserializeAndCopyStructure() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        JsonParser p1 = mapper.getFactory().createParser("{\"k\":\"v\",\"arr\":[1,2]}");
        p1.nextToken();
        TokenBuffer tb1 = new TokenBuffer(mapper);
        tb1.deserialize(p1, ctxt);
        p1.close();

        JsonParser res1 = tb1.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, res1.nextToken());
        Assert.assertEquals("k", res1.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, res1.nextToken());
        Assert.assertEquals("arr", res1.nextFieldName());
        Assert.assertEquals(JsonToken.START_ARRAY, res1.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, res1.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, res1.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, res1.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, res1.nextToken());
        res1.close();

        JsonParser p2 = mapper.getFactory().createParser("{\"k1\":\"v1\",\"k2\":\"v2\"}");
        p2.nextToken(); // START_OBJECT
        p2.nextToken(); // FIELD_NAME
        TokenBuffer tb2 = new TokenBuffer(mapper);
        tb2.deserialize(p2, ctxt);
        p2.close();

        JsonParser res2 = tb2.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, res2.nextToken());
        Assert.assertEquals("k1", res2.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, res2.nextToken());
        Assert.assertEquals("k2", res2.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, res2.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, res2.nextToken());
        res2.close();
    }

    @Test
    public void testToStringFormatting() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeTypeId("TypeIdVal");
        tb.writeObjectId("ObjectIdVal");
        tb.writeStartObject();
        tb.writeFieldName("testField");
        tb.writeString("val");
        tb.writeEndObject();

        String str = tb.toString();
        Assert.assertTrue(str.contains("START_OBJECT"));
        Assert.assertTrue(str.contains("FIELD_NAME(testField)"));
        Assert.assertTrue(str.contains("VALUE_STRING"));
        Assert.assertTrue(str.contains("END_OBJECT"));

        TokenBuffer bigTb = new TokenBuffer(null, false);
        for (int i = 0; i < 110; i++) {
            bigTb.writeNumber(i);
        }
        String bigStr = bigTb.toString();
        Assert.assertTrue(bigStr.contains("truncated"));
    }

    @Test
    public void testGeneratorFeatureControls() {
        TokenBuffer tb = new TokenBuffer(null);
        Assert.assertFalse(tb.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        tb.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        Assert.assertTrue(tb.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        tb.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        Assert.assertFalse(tb.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));

        int mask = tb.getFeatureMask();
        tb.setFeatureMask(mask | JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask());
        Assert.assertTrue(tb.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));

        Assert.assertSame(tb, tb.useDefaultPrettyPrinter());
        Assert.assertTrue(tb.canWriteBinaryNatively());
    }

    @Test
    public void testCodecAndTreeHandling() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer tb = new TokenBuffer(mapper);
        Assert.assertSame(mapper, tb.getCodec());

        tb.setCodec(null);
        Assert.assertNull(tb.getCodec());

        tb.writeObject(null);
        tb.writeObject("plainString");
        tb.writeTree(null);
        tb.writeTree(IntNode.valueOf(42));

        tb.setCodec(mapper);
        tb.writeObject("codecString");
        tb.writeTree(IntNode.valueOf(100));

        JsonParser p = tb.asParser(mapper);
        Assert.assertSame(mapper, p.getCodec());
        p.setCodec(null);
        Assert.assertNull(p.getCodec());
        p.close();
    }

    @Test
    public void testParserNavigationAndPeeking() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeStartObject();
        tb.writeFieldName("first");
        tb.writeNumber(1);
        tb.writeEndObject();

        TokenBuffer.Parser p = (TokenBuffer.Parser) tb.asParser();
        Assert.assertNull(p.getCurrentToken());
        Assert.assertNull(p.getCurrentName());
        Assert.assertNotNull(p.getParsingContext());
        Assert.assertEquals(JsonLocation.NA, p.getCurrentLocation());
        Assert.assertEquals(JsonLocation.NA, p.getTokenLocation());

        p.setLocation(new JsonLocation("src", 100L, 1, 1));
        Assert.assertEquals(100L, p.getCurrentLocation().getByteOffset());

        Assert.assertEquals(JsonToken.START_OBJECT, p.peekNextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.peekNextToken());

        Assert.assertEquals("first", p.nextFieldName());
        Assert.assertEquals("first", p.getCurrentName());

        p.overrideCurrentName("overridden");
        Assert.assertEquals("overridden", p.getCurrentName());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.peekNextToken());
        Assert.assertNull(p.nextToken());
        Assert.assertNull(p.peekNextToken());
        p.close();
        Assert.assertNull(p.peekNextToken());
    }

    @Test
    public void testParserUnbalancedStructures() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeEndArray();
        tb.writeEndObject();

        JsonParser p = tb.asParser();
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testParserNumericStringConversions() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb._append(JsonToken.VALUE_NUMBER_INT, "12345");
        tb._append(JsonToken.VALUE_NUMBER_FLOAT, "123.45");

        JsonParser p = tb.asParser();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(12345L, p.getNumberValue().longValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(123.45d, p.getNumberValue().doubleValue(), 0.001);
        p.close();
    }

    @Test(expected = IllegalStateException.class)
    public void testParserInvalidNumericValueTypeThrows() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb._append(JsonToken.VALUE_NUMBER_INT, new Object());
        JsonParser p = tb.asParser();
        p.nextToken();
        p.getNumberValue();
    }

    @Test(expected = JsonParseException.class)
    public void testParserNumericAccessOnNonNumericTokenThrows() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeString("abc");
        JsonParser p = tb.asParser();
        p.nextToken();
        p.getIntValue();
    }

    @Test(expected = JsonParseException.class)
    public void testParserGetBinaryOnNonBinaryTokenThrows() throws Exception {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeNumber(123);
        JsonParser p = tb.asParser();
        p.nextToken();
        p.getBinaryValue(Base64Variants.MIME);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinaryWithInputStreamThrows() {
        TokenBuffer tb = new TokenBuffer(null);
        tb.writeBinary(Base64Variants.MIME, new ByteArrayInputStream(new byte[0]), 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUTF8StringThrows() throws Exception {
        new TokenBuffer(null).writeRawUTF8String(new byte[0], 0, 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteUTF8StringThrows() throws Exception {
        new TokenBuffer(null).writeUTF8String(new byte[0], 0, 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawStringThrows() throws Exception {
        new TokenBuffer(null).writeRaw("abc");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawSubstringThrows() throws Exception {
        new TokenBuffer(null).writeRaw("abc", 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawSerializableThrows() throws Exception {
        new TokenBuffer(null).writeRaw(new SerializedString("abc"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawCharArrayThrows() throws Exception {
        new TokenBuffer(null).writeRaw(new char[]{'a'}, 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawCharThrows() throws Exception {
        new TokenBuffer(null).writeRaw('a');
    }

    @Test
    public void testParserAsParserWithSourceParser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser src = mapper.getFactory().createParser("{\"src\":1}");
        src.nextToken();
        TokenBuffer tb = new TokenBuffer(mapper);
        tb.writeNumber(99);

        JsonParser p = tb.asParser(src);
        Assert.assertEquals(mapper, p.getCodec());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(99, p.getIntValue());
        p.close();
        src.close();
    }

    @Test
    public void testAppendRawSegmentOperations() {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeTypeId("tid");
        tb.writeObjectId("oid");
        tb._appendRaw(JsonToken.VALUE_STRING.id(), "rawVal");
        for (int i = 0; i < 20; i++) {
            tb._appendRaw(JsonToken.VALUE_NUMBER_INT.id(), i);
        }
        Assert.assertNotNull(tb._first);
        Assert.assertEquals(JsonToken.VALUE_STRING.id(), tb._first.rawType(0));
        Assert.assertEquals("rawVal", tb._first.get(0));
        Assert.assertEquals("tid", tb._first.findTypeId(0));
        Assert.assertEquals("oid", tb._first.findObjectId(0));
    }
}
