package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.IntNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TokenBufferTest {

    @Test
    public void testConstructorsAndVersion() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        
        TokenBuffer tb1 = new TokenBuffer(mapper);
        Assert.assertNotNull(tb1.version());
        Assert.assertSame(mapper, tb1.getCodec());
        Assert.assertFalse(tb1.canWriteTypeId());
        Assert.assertFalse(tb1.canWriteObjectId());
        
        TokenBuffer tb2 = new TokenBuffer(mapper, true);
        Assert.assertTrue(tb2.canWriteTypeId());
        Assert.assertTrue(tb2.canWriteObjectId());
        
        JsonParser jp = mapper.getFactory().createParser("{\"a\":1}");
        TokenBuffer tb3 = new TokenBuffer(jp);
        Assert.assertNotNull(tb3.getCodec());
        Assert.assertEquals(jp.canReadTypeId(), tb3.canWriteTypeId());
        Assert.assertEquals(jp.canReadObjectId(), tb3.canWriteObjectId());
        jp.close();
    }

    @Test
    public void testConfigurationAndFeatures() throws IOException {
        TokenBuffer tb = new TokenBuffer(null);
        Assert.assertTrue(tb.canWriteBinaryNatively());
        Assert.assertFalse(tb.isClosed());

        tb.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        Assert.assertTrue(tb.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        
        tb.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        Assert.assertFalse(tb.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));

        int mask = tb.getFeatureMask();
        tb.setFeatureMask(mask | JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask());
        Assert.assertTrue(tb.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));

        tb.useDefaultPrettyPrinter();
        
        ObjectMapper mapper = new ObjectMapper();
        tb.setCodec(mapper);
        Assert.assertSame(mapper, tb.getCodec());

        tb.flush();
        tb.close();
        Assert.assertTrue(tb.isClosed());
    }

    @Test
    public void testStructuralAndBasicWrites() throws IOException {
        TokenBuffer tb = new TokenBuffer(null);
        Assert.assertNull(tb.firstToken());

        tb.writeStartObject();
        Assert.assertEquals(JsonToken.START_OBJECT, tb.firstToken());
        Assert.assertNotNull(tb.getOutputContext());

        tb.writeFieldName("strField");
        tb.writeString("hello");
        tb.writeFieldName(new SerializedString("serializableField"));
        tb.writeString(new SerializedString("world"));
        
        tb.writeFieldName("nullField");
        tb.writeString((String) null);
        tb.writeFieldName("nullSerialField");
        tb.writeString((SerializableString) null);

        tb.writeFieldName("charArrayField");
        char[] chars = "abcdef".toCharArray();
        tb.writeString(chars, 1, 3); // "bcd"

        tb.writeFieldName("boolTrue");
        tb.writeBoolean(true);
        tb.writeFieldName("boolFalse");
        tb.writeBoolean(false);

        tb.writeFieldName("nullValue");
        tb.writeNull();

        tb.writeFieldName("arrayField");
        tb.writeStartArray();
        tb.writeEndArray();

        tb.writeEndObject();

        // Unbalanced end checks
        tb.writeEndObject();
        tb.writeEndArray();

        JsonParser parser = tb.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("strField", parser.getCurrentName());
        Assert.assertEquals("strField", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("hello", parser.getText());
        Assert.assertArrayEquals("hello".toCharArray(), parser.getTextCharacters());
        Assert.assertEquals(5, parser.getTextLength());
        Assert.assertEquals(0, parser.getTextOffset());
        Assert.assertFalse(parser.hasTextCharacters());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("serializableField", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("world", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("nullField", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("nullSerialField", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("charArrayField", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("bcd", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        Assert.assertEquals("true", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        Assert.assertEquals("false", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals("null", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        
        parser.close();
    }

    @Test
    public void testNumericWritesAndReads() throws IOException {
        TokenBuffer tb = new TokenBuffer(null);

        tb.writeNumber((short) 10);
        tb.writeNumber(20);
        tb.writeNumber(30L);
        tb.writeNumber(40.5d);
        tb.writeNumber(50.5f);
        tb.writeNumber(new BigDecimal("60.75"));
        tb.writeNumber((BigDecimal) null);
        tb.writeNumber(BigInteger.valueOf(70));
        tb.writeNumber((BigInteger) null);
        tb.writeNumber("80.25");
        tb.writeNumber("90");

        JsonParser parser = tb.asParser();

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(10, parser.getIntValue());
        Assert.assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
        Assert.assertEquals(BigInteger.valueOf(10), parser.getBigIntegerValue());
        Assert.assertEquals(new BigDecimal("10"), parser.getDecimalValue());
        Assert.assertEquals(10L, parser.getLongValue());
        Assert.assertEquals(10.0, parser.getDoubleValue(), 0.001);
        Assert.assertEquals(10.0f, parser.getFloatValue(), 0.001f);
        Assert.assertEquals("10", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(20, parser.getIntValue());
        Assert.assertEquals(JsonParser.NumberType.INT, parser.getNumberType());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(30L, parser.getLongValue());
        Assert.assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());
        Assert.assertEquals(new BigDecimal("30"), parser.getDecimalValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(40.5d, parser.getDoubleValue(), 0.001);
        Assert.assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
        Assert.assertEquals(BigInteger.valueOf(40), parser.getBigIntegerValue());
        Assert.assertEquals(BigDecimal.valueOf(40.5d), parser.getDecimalValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(50.5f, parser.getFloatValue(), 0.001f);
        Assert.assertEquals(JsonParser.NumberType.FLOAT, parser.getNumberType());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(new BigDecimal("60.75"), parser.getDecimalValue());
        Assert.assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());
        Assert.assertEquals(new BigInteger("60"), parser.getBigIntegerValue());

        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(BigInteger.valueOf(70), parser.getBigIntegerValue());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());
        Assert.assertEquals(new BigDecimal(BigInteger.valueOf(70)), parser.getDecimalValue());

        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());

        // Number encoded as String with '.'
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(80.25, parser.getDoubleValue(), 0.001);
        Assert.assertEquals(80, parser.getIntValue());

        // Number encoded as String without '.'
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(90L, parser.getLongValue());

        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testObjectsTreesAndBinary() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer tb = new TokenBuffer(mapper);

        tb.writeObject(null);
        byte[] binaryData = new byte[]{1, 2, 3, 4, 5};
        tb.writeObject(binaryData);
        tb.writeObject("aStringObj");

        tb.writeTree(null);
        IntNode treeNode = IntNode.valueOf(123);
        tb.writeTree(treeNode);

        byte[] rawBinary = new byte[]{10, 20, 30, 40, 50};
        tb.writeBinary(Base64Variants.MIME, rawBinary, 1, 3); // 20, 30, 40

        // Without codec
        TokenBuffer tbNoCodec = new TokenBuffer(null);
        tbNoCodec.writeObject("plainObject");
        tbNoCodec.writeTree(treeNode);

        JsonParser pNoCodec = tbNoCodec.asParser();
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, pNoCodec.nextToken());
        Assert.assertEquals("plainObject", pNoCodec.getEmbeddedObject());
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, pNoCodec.nextToken());
        Assert.assertEquals(treeNode, pNoCodec.getEmbeddedObject());
        pNoCodec.close();

        JsonParser parser = tb.asParser();
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertNull(parser.getEmbeddedObject());

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        Assert.assertArrayEquals(binaryData, (byte[]) parser.getEmbeddedObject());
        Assert.assertArrayEquals(binaryData, parser.getBinaryValue(Base64Variants.MIME));
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int read = parser.readBinaryValue(Base64Variants.MIME, baos);
        Assert.assertEquals(binaryData.length, read);
        Assert.assertArrayEquals(binaryData, baos.toByteArray());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        Assert.assertArrayEquals(new byte[]{20, 30, 40}, parser.getBinaryValue(Base64Variants.MIME));

        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testBinaryFromString() throws IOException {
        TokenBuffer tb = new TokenBuffer(null);
        String base64 = Base64Variants.MIME.encode(new byte[]{7, 8, 9});
        tb.writeString(base64);

        JsonParser parser = tb.asParser();
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertArrayEquals(new byte[]{7, 8, 9}, parser.getBinaryValue(Base64Variants.MIME));
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int read = parser.readBinaryValue(Base64Variants.MIME, baos);
        Assert.assertEquals(3, read);
        Assert.assertArrayEquals(new byte[]{7, 8, 9}, baos.toByteArray());
        parser.close();
    }

    @Test
    public void testSegmentOverflowAndTraversal() throws IOException {
        TokenBuffer tb = new TokenBuffer(null);
        for (int i = 0; i < 35; i++) {
            tb.writeNumber(i);
        }

        JsonParser parser = tb.asParser();
        for (int i = 0; i < 35; i++) {
            Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.peekNextToken());
            Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            Assert.assertEquals(i, parser.getIntValue());
        }
        Assert.assertNull(parser.peekNextToken());
        Assert.assertNull(parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
        Assert.assertNull(parser.peekNextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNativeIds() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeTypeId("myTypeId");
        tb.writeObjectId("myObjectId");
        tb.writeStartObject();
        tb.writeFieldName("f");
        tb.writeTypeId("intType");
        tb.writeObjectId("intId");
        tb.writeNumber(100);
        tb.writeEndObject();

        JsonParser parser = tb.asParser();
        Assert.assertTrue(parser.canReadTypeId());
        Assert.assertTrue(parser.canReadObjectId());

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals("myTypeId", parser.getTypeId());
        Assert.assertEquals("myObjectId", parser.getObjectId());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("intType", parser.getTypeId());
        Assert.assertEquals("intId", parser.getObjectId());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testAppendAndSerialization() throws IOException {
        TokenBuffer tb1 = new TokenBuffer(null, true);
        tb1.writeStartObject();
        tb1.writeFieldName("a");
        tb1.writeNumber(1);
        tb1.writeEndObject();

        TokenBuffer tb2 = new TokenBuffer(null, false);
        tb2.writeStartArray();
        tb2.writeString("item");
        tb2.writeEndArray();

        tb1.append(tb2);

        TokenBuffer target = new TokenBuffer(null);
        tb1.serialize(target);

        JsonParser parser = target.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("a", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(1, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("item", parser.getText());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testSerializeAllTypes() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeStartObject();
        tb.writeFieldName(new SerializedString("f1"));
        tb.writeString(new SerializedString("str1"));
        tb.writeFieldName("f2");
        tb.writeString("str2");
        tb.writeFieldName("f3");
        tb.writeNumber((short) 1);
        tb.writeFieldName("f4");
        tb.writeNumber(2);
        tb.writeFieldName("f5");
        tb.writeNumber(3L);
        tb.writeFieldName("f6");
        tb.writeNumber(BigInteger.valueOf(4));
        tb.writeFieldName("f7");
        tb.writeNumber(5.5d);
        tb.writeFieldName("f8");
        tb.writeNumber(6.5f);
        tb.writeFieldName("f9");
        tb.writeNumber(new BigDecimal("7.5"));
        tb.writeFieldName("f10");
        tb.writeNumber((BigDecimal) null);
        tb.writeFieldName("f11");
        tb.writeNumber("8.5");
        tb.writeFieldName("f12");
        tb.writeBoolean(true);
        tb.writeFieldName("f13");
        tb.writeBoolean(false);
        tb.writeFieldName("f14");
        tb.writeNull();
        tb.writeFieldName("f15");
        tb.writeObject(new byte[]{1, 2});
        tb.writeFieldName("arr");
        tb.writeStartArray();
        tb.writeEndArray();
        tb.writeEndObject();

        TokenBuffer output = new TokenBuffer(null);
        tb.serialize(output);

        JsonParser parser = output.asParser();
        while (parser.nextToken() != null) {
            // traverse all
        }
        parser.close();
    }

    @Test
    public void testCopyCurrentStructureAndEvent() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"obj\":{\"a\":1,\"b\":true,\"c\":false,\"d\":null,\"e\":\"text\",\"f\":1.5,\"g\":1000000000000},\"arr\":[1,2]}";
        
        JsonParser srcParser = mapper.getFactory().createParser(json);
        srcParser.nextToken(); // START_OBJECT
        
        TokenBuffer tb = new TokenBuffer(mapper);
        tb.copyCurrentStructure(srcParser);
        srcParser.close();

        JsonParser p = tb.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("obj", p.getCurrentName());
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.close();

        // Test copyCurrentStructure starting at FIELD_NAME
        srcParser = mapper.getFactory().createParser("{\"k\":\"v\"}");
        srcParser.nextToken(); // START_OBJECT
        srcParser.nextToken(); // FIELD_NAME
        TokenBuffer tbField = new TokenBuffer(mapper);
        tbField.copyCurrentStructure(srcParser);
        srcParser.close();

        p = tbField.asParser();
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("k", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("v", p.getText());
        p.close();
    }

    @Test
    public void testParserContextAndNameOverride() throws IOException {
        TokenBuffer tb = new TokenBuffer(null);
        tb.writeStartObject();
        tb.writeFieldName("orig");
        tb.writeStartArray();
        tb.writeEndArray();
        tb.writeEndObject();

        JsonParser parser = tb.asParser();
        Assert.assertNull(parser.getCurrentToken());
        Assert.assertNull(parser.getText());
        Assert.assertEquals(JsonLocation.NA, parser.getTokenLocation());
        Assert.assertEquals(JsonLocation.NA, parser.getCurrentLocation());

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertNotNull(parser.getParsingContext());
        parser.overrideCurrentName("newRoot");
        
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("orig", parser.getCurrentName());
        parser.overrideCurrentName("renamedField");
        Assert.assertEquals("renamedField", parser.getCurrentName());

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.overrideCurrentName("arrayName");
        
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());

        parser.close();
        Assert.assertTrue(parser.isClosed());
    }

    @Test
    public void testParserAsParserVariants() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer tb = new TokenBuffer(mapper);
        tb.writeNumber(1);

        JsonParser p1 = tb.asParser(mapper);
        Assert.assertSame(mapper, p1.getCodec());
        p1.setCodec(null);
        Assert.assertNull(p1.getCodec());
        Assert.assertNotNull(p1.version());
        p1.close();

        JsonParser src = mapper.getFactory().createParser("123");
        JsonParser p2 = tb.asParser(src);
        Assert.assertNotNull(p2.getCurrentLocation());
        p2.close();
        src.close();
    }

    @Test
    public void testToStringFormatting() throws IOException {
        TokenBuffer tb = new TokenBuffer(null, true);
        tb.writeTypeId("type1");
        tb.writeObjectId("obj1");
        tb.writeStartObject();
        tb.writeFieldName("name");
        tb.writeString("John");
        tb.writeEndObject();

        String str = tb.toString();
        Assert.assertTrue(str.startsWith("[TokenBuffer:"));
        Assert.assertTrue(str.contains("START_OBJECT"));
        Assert.assertTrue(str.contains("FIELD_NAME(name)"));
        Assert.assertTrue(str.contains("VALUE_STRING"));
        Assert.assertTrue(str.contains("END_OBJECT"));

        // Truncated string test (>100 tokens)
        TokenBuffer longTb = new TokenBuffer(null);
        for (int i = 0; i < 110; i++) {
            longTb.writeNumber(i);
        }
        String longStr = longTb.toString();
        Assert.assertTrue(longStr.contains("truncated 10 entries"));
    }

    @Test
    public void testDeserializeHelper() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser jp = mapper.getFactory().createParser("{\"a\":123}");
        jp.nextToken(); // START_OBJECT
        
        TokenBuffer tb = new TokenBuffer(mapper);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        tb.deserialize(jp, ctxt);
        jp.close();

        JsonParser parser = tb.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testUnsupportedOperations() throws IOException {
        TokenBuffer tb = new TokenBuffer(null);
        
        try {
            tb.writeRawUTF8String(new byte[0], 0, 0);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ignored) {}

        try {
            tb.writeUTF8String(new byte[0], 0, 0);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ignored) {}

        try {
            tb.writeRaw("test");
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ignored) {}

        try {
            tb.writeRaw("test", 0, 1);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ignored) {}

        try {
            tb.writeRaw(new SerializedString("test"));
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ignored) {}

        try {
            tb.writeRaw(new char[]{'a'}, 0, 1);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ignored) {}

        try {
            tb.writeRaw('a');
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ignored) {}

        try {
            tb.writeRawValue("test");
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ignored) {}

        try {
            tb.writeRawValue("test", 0, 1);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ignored) {}

        try {
            tb.writeRawValue(new char[]{'a'}, 0, 1);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ignored) {}

        try {
            tb.writeBinary(Base64Variants.MIME, (InputStream) null, 0);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ignored) {}
    }

    @Test
    public void testParserExceptionOnNonNumericAccessors() throws IOException {
        TokenBuffer tb = new TokenBuffer(null);
        tb.writeString("not_a_number");

        JsonParser parser = tb.asParser();
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        
        try {
            parser.getIntValue();
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException ignored) {}

        try {
            parser.getDecimalValue();
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException ignored) {}

        try {
            parser.getBigIntegerValue();
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException ignored) {}

        try {
            parser.getDoubleValue();
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException ignored) {}

        try {
            parser.getFloatValue();
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException ignored) {}

        try {
            parser.getLongValue();
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException ignored) {}

        parser.close();
    }

    @Test
    public void testParserExceptionOnInvalidBinaryAccess() throws IOException {
        TokenBuffer tb = new TokenBuffer(null);
        tb.writeNumber(12345);

        JsonParser parser = tb.asParser();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        try {
            parser.getBinaryValue(Base64Variants.MIME);
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException ignored) {}
        
        parser.close();
    }

    @Test
    public void testSegmentRawTypesAndAppendRaw() {
        TokenBuffer.Segment segment = new TokenBuffer.Segment();
        Assert.assertFalse(segment.hasIds());

        segment.appendRaw(0, 5, "rawVal0", "obj0", "type0");
        Assert.assertTrue(segment.hasIds());
        Assert.assertEquals(5, segment.rawType(0));
        Assert.assertEquals("rawVal0", segment.get(0));
        Assert.assertEquals("obj0", segment.findObjectId(0));
        Assert.assertEquals("type0", segment.findTypeId(0));

        TokenBuffer.Segment nextSeg = segment.appendRaw(16, 6, "rawVal16", "obj16", "type16");
        Assert.assertNotNull(nextSeg);
        Assert.assertEquals(6, nextSeg.rawType(0));
        Assert.assertEquals("rawVal16", nextSeg.get(0));
        Assert.assertEquals("obj16", nextSeg.findObjectId(0));
        Assert.assertEquals("type16", nextSeg.findTypeId(0));
    }
}
