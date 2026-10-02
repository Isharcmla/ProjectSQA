package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TokenBufferTest {

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructorsAndBasicConfig() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        
        TokenBuffer tb1 = new TokenBuffer(mapper);
        Assert.assertNotNull(tb1.getCodec());
        Assert.assertFalse(tb1.canWriteTypeId());
        Assert.assertFalse(tb1.canWriteObjectId());
        
        TokenBuffer tb2 = new TokenBuffer(mapper, true);
        Assert.assertTrue(tb2.canWriteTypeId());
        Assert.assertTrue(tb2.canWriteObjectId());

        JsonParser parser = mapper.getFactory().createParser("{\"a\":1}");
        TokenBuffer tb3 = new TokenBuffer(parser);
        Assert.assertNotNull(tb3.getCodec());

        DeserializationContext ctxt = mapper.getDeserializationContext();
        TokenBuffer tb4 = new TokenBuffer(parser, ctxt);
        Assert.assertNotNull(tb4.getCodec());

        tb4.forceUseOfBigDecimal(true);
        Assert.assertNotNull(tb4.version());
        
        Assert.assertTrue(tb4.canWriteBinaryNatively());
        Assert.assertSame(tb4, tb4.useDefaultPrettyPrinter());
    }

    @Test
    public void testFeatures() {
        TokenBuffer tb = new TokenBuffer(null, false);
        int defaultMask = tb.getFeatureMask();

        tb.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        Assert.assertTrue(tb.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN));

        tb.disable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        Assert.assertFalse(tb.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN));

        tb.setFeatureMask(defaultMask);
        Assert.assertEquals(defaultMask, tb.getFeatureMask());

        tb.setCodec(null);
        Assert.assertNull(tb.getCodec());
    }

    @Test
    public void testCloseAndFlush() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        Assert.assertFalse(tb.isClosed());
        tb.flush();
        tb.close();
        Assert.assertTrue(tb.isClosed());

        JsonParser p = tb.asParser();
        Assert.assertFalse(p.isClosed());
        p.close();
        Assert.assertTrue(p.isClosed());
        Assert.assertNull(p.nextToken());
        Assert.assertNull(p.peekNextToken());
        Assert.assertNull(p.nextFieldName());
    }

    @Test
    public void testWriteAndReadStructureAndSegmentOverflow() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        Assert.assertNull(tb.firstToken());

        tb.writeStartObject();
        Assert.assertEquals(JsonToken.START_OBJECT, tb.firstToken());

        // Write > 16 tokens to force creation of additional Segments
        for (int i = 0; i < 20; i++) {
            tb.writeFieldName("field" + i);
            tb.writeNumber(i);
        }
        tb.writeEndObject();

        JsonParser p = tb.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertNotNull(p.getParsingContext());
        
        for (int i = 0; i < 20; i++) {
            Assert.assertEquals("field" + i, p.nextFieldName());
            Assert.assertEquals("field" + i, p.getCurrentName());
            Assert.assertEquals(JsonToken.FIELD_NAME, p.getCurrentToken());
            Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            Assert.assertEquals(i, p.getIntValue());
        }
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
    }

    @Test
    public void testWriteAndReadPrimitives() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        
        tb.writeStartArray();
        tb.writeString("test");
        tb.writeString((String) null);
        tb.writeString(new SerializedString("serialized"));
        tb.writeString((SerializableString) null);
        tb.writeString(new char[]{'a', 'b', 'c'}, 0, 3);
        
        tb.writeNumber((short) 1);
        tb.writeNumber(2);
        tb.writeNumber(3L);
        tb.writeNumber(4.5f);
        tb.writeNumber(5.5d);
        tb.writeNumber(new BigDecimal("6.5"));
        tb.writeNumber((BigDecimal) null);
        tb.writeNumber(new BigInteger("7"));
        tb.writeNumber((BigInteger) null);
        tb.writeNumber("8.5");
        
        tb.writeBoolean(true);
        tb.writeBoolean(false);
        tb.writeNull();
        tb.writeEndArray();

        JsonParser p = tb.asParser();
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("test", p.getText());
        Assert.assertArrayEquals("test".toCharArray(), p.getTextCharacters());
        Assert.assertEquals(4, p.getTextLength());
        Assert.assertEquals(0, p.getTextOffset());
        Assert.assertFalse(p.hasTextCharacters());

        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("serialized", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("abc", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1, p.getIntValue());
        Assert.assertEquals(JsonParser.NumberType.INT, p.getNumberType());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(2, p.getIntValue());
        Assert.assertEquals(2L, p.getLongValue());
        Assert.assertEquals(JsonParser.NumberType.INT, p.getNumberType());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(3L, p.getLongValue());
        Assert.assertEquals(JsonParser.NumberType.LONG, p.getNumberType());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(4.5f, p.getFloatValue(), 0.001);
        Assert.assertEquals(JsonParser.NumberType.FLOAT, p.getNumberType());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(5.5d, p.getDoubleValue(), 0.001);
        Assert.assertEquals(JsonParser.NumberType.DOUBLE, p.getNumberType());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(new BigDecimal("6.5"), p.getDecimalValue());
        Assert.assertEquals(new BigInteger("6"), p.getBigIntegerValue());
        Assert.assertEquals(JsonParser.NumberType.BIG_DECIMAL, p.getNumberType());

        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(new BigInteger("7"), p.getBigIntegerValue());
        Assert.assertEquals(new BigDecimal("7"), p.getDecimalValue());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, p.getNumberType());

        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals("8.5", p.getText());
        Assert.assertEquals(8.5d, p.getDoubleValue(), 0.001);

        Assert.assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        Assert.assertEquals("true", p.getText());

        Assert.assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        Assert.assertEquals("false", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        Assert.assertEquals("null", p.getText());

        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        Assert.assertNull(p.nextToken());
    }

    @Test
    public void testParserNumericConversions() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeStartArray();
        tb.writeNumber(100);
        tb.writeNumber(200L);
        tb.writeNumber(300.75);
        tb.writeNumber("400");
        tb.writeNumber("500.5");
        tb.writeEndArray();

        JsonParser p = tb.asParser();
        p.nextToken(); // START_ARRAY

        p.nextToken(); // 100
        Assert.assertEquals(100, p.getIntValue());
        Assert.assertEquals(100L, p.getLongValue());
        Assert.assertEquals(100.0, p.getDoubleValue(), 0.01);
        Assert.assertEquals(BigInteger.valueOf(100), p.getBigIntegerValue());
        Assert.assertEquals(BigDecimal.valueOf(100), p.getDecimalValue());

        p.nextToken(); // 200L
        Assert.assertEquals(200, p.getIntValue());
        Assert.assertEquals(BigInteger.valueOf(200), p.getBigIntegerValue());
        Assert.assertEquals(BigDecimal.valueOf(200), p.getDecimalValue());

        p.nextToken(); // 300.75
        Assert.assertEquals(300, p.getIntValue());
        Assert.assertEquals(300L, p.getLongValue());
        Assert.assertEquals(300.75f, p.getFloatValue(), 0.01f);
        Assert.assertEquals(BigInteger.valueOf(300), p.getBigIntegerValue());
        Assert.assertEquals(BigDecimal.valueOf(300.75), p.getDecimalValue());

        p.nextToken(); // "400"
        Assert.assertEquals(400, p.getIntValue());
        Assert.assertEquals(400L, p.getLongValue());

        p.nextToken(); // "500.5"
        Assert.assertEquals(500.5, p.getDoubleValue(), 0.01);
    }

    @Test
    public void testRawValues() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeRawValue("raw1");
        tb.writeRawValue("xxraw2xx", 2, 4);
        tb.writeRawValue(new char[]{'r', 'a', 'w', '3'}, 0, 4);

        JsonParser p = tb.asParser();
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        Object obj1 = p.getEmbeddedObject();
        Assert.assertTrue(obj1 instanceof RawValue);

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        Object obj2 = p.getEmbeddedObject();
        Assert.assertTrue(obj2 instanceof RawValue);

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        Assert.assertEquals("raw3", p.getEmbeddedObject());
    }

    @Test
    public void testBinaryData() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        tb.writeBinary(Base64Variants.MIME, data, 0, data.length);
        
        tb.writeString(Base64Variants.MIME.encode(data));

        JsonParser p = tb.asParser();
        
        // Embedded byte array
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        byte[] read1 = p.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(data, read1);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(Base64Variants.MIME, out);
        Assert.assertEquals(5, len);
        Assert.assertArrayEquals(data, out.toByteArray());

        // Base64 text string
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] read2 = p.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(data, read2);
    }

    @Test
    public void testNativeIds() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeObjectId("obj-123");
        tb.writeTypeId("type-abc");
        tb.writeStartObject();
        
        tb.writeFieldName("test");
        tb.writeObjectId("obj-456");
        tb.writeTypeId("type-def");
        tb.writeString("val");
        
        tb.writeEndObject();

        JsonParser p = tb.asParser();
        Assert.assertTrue(p.canReadObjectId());
        Assert.assertTrue(p.canReadTypeId());

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals("obj-123", p.getObjectId());
        Assert.assertEquals("type-abc", p.getTypeId());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("obj-456", p.getObjectId());
        Assert.assertEquals("type-def", p.getTypeId());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testAppendAndSerialize() throws IOException {
        TokenBuffer src = new TokenBuffer(null, true);
        src.writeObjectId("id-1");
        src.writeTypeId("type-1");
        src.writeStartObject();
        src.writeFieldName(new SerializedString("num"));
        src.writeNumber(Short.valueOf((short) 10));
        src.writeFieldName("bigInt");
        src.writeNumber(BigInteger.valueOf(1000));
        src.writeFieldName("bigDec");
        src.writeNumber(new BigDecimal("123.456"));
        src.writeFieldName("raw");
        src.writeRawValue("raw-content");
        src.writeFieldName("str");
        src.writeString(new SerializedString("str-val"));
        src.writeFieldName("nullField");
        src.writeNull();
        src.writeEndObject();

        TokenBuffer dest = new TokenBuffer(null, false);
        dest.append(src);

        TokenBuffer serializedDest = new TokenBuffer(null, true);
        dest.serialize(serializedDest);

        JsonParser p = serializedDest.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("num", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(10, p.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("bigInt", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1000, p.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("bigDec", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(new BigDecimal("123.456"), p.getDecimalValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("raw", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("str", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("str-val", p.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("nullField", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testPeekAndContextOperations() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeStartObject();
        tb.writeFieldName("arr");
        tb.writeStartArray();
        tb.writeString("item");
        tb.writeEndArray();
        tb.writeEndObject();

        JsonParser p = tb.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, p.peekNextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.peekNextToken());
        Assert.assertEquals("arr", p.nextFieldName());

        p.overrideCurrentName("overriddenArr");
        Assert.assertEquals("overriddenArr", p.getCurrentName());

        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals("overriddenArr", p.getCurrentName());

        p.overrideCurrentName("overriddenInArray");
        Assert.assertEquals("overriddenInArray", p.getCurrentName());

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("item", p.getText());

        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
    }

    @Test
    public void testToStringAndTruncation() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeTypeId("t-id");
        tb.writeStartObject();
        for (int i = 0; i < 110; i++) {
            tb.writeFieldName("f" + i);
            tb.writeNumber(i);
        }
        tb.writeEndObject();

        String str = tb.toString();
        Assert.assertTrue(str.startsWith("[TokenBuffer:"));
        Assert.assertTrue(str.contains("truncated"));
    }

    @Test
    public void testObjectAndTreeWriting() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        
        TokenBuffer tbWithCodec = new TokenBuffer(mapper, false);
        tbWithCodec.writeObject(Integer.valueOf(42));
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        node.put("key", "value");
        tbWithCodec.writeTree(node);
        tbWithCodec.writeObject(null);
        tbWithCodec.writeTree(null);

        JsonParser p1 = tbWithCodec.asParser();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p1.nextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, p1.nextToken());

        TokenBuffer tbWithoutCodec = new TokenBuffer(null, false);
        tbWithoutCodec.writeObject("rawObject");
        tbWithoutCodec.writeTree(node);

        JsonParser p2 = tbWithoutCodec.asParser();
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p2.nextToken());
        Assert.assertEquals("rawObject", p2.getEmbeddedObject());
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p2.nextToken());
        Assert.assertEquals(node, p2.getEmbeddedObject());
    }

    @Test
    public void testCopyCurrentStructureAndEvent() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("{\"obj\":{\"a\":[1,2,3],\"b\":true,\"c\":null,\"d\":1.5}}");
        
        TokenBuffer tb = new TokenBuffer(mapper, true);
        p.nextToken(); // START_OBJECT
        tb.copyCurrentStructure(p);

        JsonParser reader = tb.asParser(p);
        Assert.assertEquals(JsonToken.START_OBJECT, reader.nextToken());
        Assert.assertEquals("obj", reader.nextFieldName());
        Assert.assertEquals(JsonToken.START_OBJECT, reader.nextToken());
        Assert.assertEquals("a", reader.nextFieldName());
        Assert.assertEquals(JsonToken.START_ARRAY, reader.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, reader.nextToken());
        Assert.assertEquals(1, reader.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, reader.nextToken());
        Assert.assertEquals(2, reader.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, reader.nextToken());
        Assert.assertEquals(3, reader.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, reader.nextToken());
        Assert.assertEquals("b", reader.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_TRUE, reader.nextToken());
        Assert.assertEquals("c", reader.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NULL, reader.nextToken());
        Assert.assertEquals("d", reader.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, reader.nextToken());
        Assert.assertEquals(1.5, reader.getDoubleValue(), 0.01);
        Assert.assertEquals(JsonToken.END_OBJECT, reader.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, reader.nextToken());
    }

    @Test
    public void testDeserializeHelper() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        
        JsonParser p1 = mapper.getFactory().createParser("{\"field\":\"val\"}");
        p1.nextToken(); // START_OBJECT
        p1.nextToken(); // FIELD_NAME
        
        TokenBuffer tb1 = new TokenBuffer(mapper, false);
        tb1.deserialize(p1, ctxt);
        
        JsonParser read1 = tb1.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, read1.nextToken());
        Assert.assertEquals("field", read1.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, read1.nextToken());
        Assert.assertEquals("val", read1.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, read1.nextToken());

        JsonParser p2 = mapper.getFactory().createParser("[1, 2]");
        p2.nextToken(); // START_ARRAY
        TokenBuffer tb2 = new TokenBuffer(mapper, false);
        tb2.deserialize(p2, ctxt);
        
        JsonParser read2 = tb2.asParser();
        Assert.assertEquals(JsonToken.START_ARRAY, read2.nextToken());
    }

    @Test
    public void testSegmentDirectOperations() {
        TokenBuffer.Segment seg = new TokenBuffer.Segment();
        Assert.assertFalse(seg.hasIds());
        Assert.assertNull(seg.next());
        
        for (int i = 0; i < TokenBuffer.Segment.TOKENS_PER_SEGMENT; i++) {
            seg.append(i, JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
        }
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, seg.type(0));
        Assert.assertEquals(Integer.valueOf(0), seg.get(0));

        TokenBuffer.Segment nextSeg = seg.append(TokenBuffer.Segment.TOKENS_PER_SEGMENT, JsonToken.START_OBJECT);
        Assert.assertNotNull(nextSeg);

        TokenBuffer.Segment segWithIds = new TokenBuffer.Segment();
        segWithIds.append(0, JsonToken.VALUE_STRING, "val", "objId", "typeId");
        Assert.assertTrue(segWithIds.hasIds());
        Assert.assertEquals("objId", segWithIds.findObjectId(0));
        Assert.assertEquals("typeId", segWithIds.findTypeId(0));
        Assert.assertEquals(JsonToken.VALUE_STRING, segWithIds.type(0));
        Assert.assertEquals(JsonToken.VALUE_STRING.ordinal(), segWithIds.rawType(0));

        TokenBuffer.Segment nextIdSeg = segWithIds.append(TokenBuffer.Segment.TOKENS_PER_SEGMENT, JsonToken.VALUE_TRUE, "obj2", "type2");
        Assert.assertNotNull(nextIdSeg);
        Assert.assertEquals("obj2", nextIdSeg.findObjectId(0));
        Assert.assertEquals("type2", nextIdSeg.findTypeId(0));

        TokenBuffer.Segment rawSeg = new TokenBuffer.Segment();
        rawSeg.appendRaw(0, 1, "raw1");
        Assert.assertEquals(1, rawSeg.rawType(0));
        TokenBuffer.Segment nextRaw = rawSeg.appendRaw(TokenBuffer.Segment.TOKENS_PER_SEGMENT, 2, "raw2", "oid", "tid");
        Assert.assertNotNull(nextRaw);
        Assert.assertEquals("oid", nextRaw.findObjectId(0));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedWriteRaw1() throws IOException {
        new TokenBuffer(null, false).writeRaw("text");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedWriteRaw2() throws IOException {
        new TokenBuffer(null, false).writeRaw("text", 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedWriteRaw3() throws IOException {
        new TokenBuffer(null, false).writeRaw(new SerializedString("text"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedWriteRaw4() throws IOException {
        new TokenBuffer(null, false).writeRaw(new char[]{'a'}, 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedWriteRaw5() throws IOException {
        new TokenBuffer(null, false).writeRaw('c');
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedWriteRawUTF8() throws IOException {
        new TokenBuffer(null, false).writeRawUTF8String(new byte[]{1}, 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedWriteUTF8() throws IOException {
        new TokenBuffer(null, false).writeUTF8String(new byte[]{1}, 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedWriteBinaryStream() {
        new TokenBuffer(null, false).writeBinary(Base64Variants.MIME, (InputStream) null, 0);
    }

    @Test(expected = JsonParseException.class)
    public void testNonNumberThrowsExceptionOnNumericAccess() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeString("notANumber");
        JsonParser p = tb.asParser();
        p.nextToken();
        p.getIntValue();
    }

    @Test(expected = JsonParseException.class)
    public void testNonBinaryThrowsException() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, false);
        tb.writeNumber(123);
        JsonParser p = tb.asParser();
        p.nextToken();
        p.getBinaryValue(Base64Variants.MIME);
    }
}
