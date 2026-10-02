package com.fasterxml.jackson.databind.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.TextNode;

import org.junit.Assert;
import org.junit.Test;

public class TokenBufferTest {

    @Test
    public void testConstructorsAndVersion() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        
        TokenBuffer buf1 = new TokenBuffer(mapper);
        Assert.assertNotNull(buf1.getCodec());
        Assert.assertFalse(buf1.canWriteTypeId());
        Assert.assertFalse(buf1.canWriteObjectId());

        TokenBuffer buf2 = new TokenBuffer(mapper, true);
        Assert.assertTrue(buf2.canWriteTypeId());
        Assert.assertTrue(buf2.canWriteObjectId());

        JsonParser parser = mapper.getFactory().createParser("{\"a\":1}");
        TokenBuffer buf3 = new TokenBuffer(parser);
        Assert.assertNotNull(buf3.version());
        Assert.assertEquals(PackageVersion.VERSION, buf3.version());
        parser.close();
    }

    @Test
    public void testGeneratorFeatureConfiguration() {
        TokenBuffer buf = new TokenBuffer(null);
        int initialMask = buf.getFeatureMask();

        buf.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        Assert.assertTrue(buf.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));

        buf.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        Assert.assertFalse(buf.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));

        buf.setFeatureMask(initialMask);
        Assert.assertEquals(initialMask, buf.getFeatureMask());

        Assert.assertSame(buf, buf.useDefaultPrettyPrinter());
        
        ObjectMapper mapper = new ObjectMapper();
        buf.setCodec(mapper);
        Assert.assertSame(mapper, buf.getCodec());
        Assert.assertTrue(buf.canWriteBinaryNatively());
    }

    @Test
    public void testBasicWritingAndParsing() throws IOException {
        TokenBuffer buf = new TokenBuffer(null);
        Assert.assertNull(buf.firstToken());

        buf.writeStartObject();
        Assert.assertEquals(JsonToken.START_OBJECT, buf.firstToken());
        buf.writeFieldName("str");
        buf.writeString("hello");
        buf.writeFieldName(new SerializedString("strSer"));
        buf.writeString(new SerializedString("world"));
        buf.writeFieldName("chars");
        buf.writeString(new char[]{'a', 'b', 'c'}, 1, 2);
        buf.writeFieldName("nullStr");
        buf.writeString((String) null);
        buf.writeFieldName("nullSerStr");
        buf.writeString((SerializedString) null);
        buf.writeFieldName("boolT");
        buf.writeBoolean(true);
        buf.writeFieldName("boolF");
        buf.writeBoolean(false);
        buf.writeFieldName("nullVal");
        buf.writeNull();
        buf.writeEndObject();

        JsonParser p = buf.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("str", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("hello", p.getText());
        Assert.assertArrayEquals("hello".toCharArray(), p.getTextCharacters());
        Assert.assertEquals(5, p.getTextLength());
        Assert.assertEquals(0, p.getTextOffset());
        Assert.assertFalse(p.hasTextCharacters());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("strSer", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("world", p.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("chars", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("bc", p.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("nullStr", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("nullSerStr", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("boolT", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_TRUE, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("boolF", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_FALSE, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("nullVal", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNumericTypesAndConversions() throws IOException {
        TokenBuffer buf = new TokenBuffer(null);
        buf.writeStartArray();
        buf.writeNumber((short) 10);
        buf.writeNumber(20);
        buf.writeNumber(30L);
        buf.writeNumber(40.5);
        buf.writeNumber(50.5f);
        buf.writeNumber(new BigDecimal("60.5"));
        buf.writeNumber((BigDecimal) null);
        buf.writeNumber(new BigInteger("70"));
        buf.writeNumber((BigInteger) null);
        buf.writeNumber("80.5");
        buf.writeNumber("90");
        buf.writeEndArray();

        JsonParser p = buf.asParser();
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonParser.NumberType.INT, p.getNumberType());
        Assert.assertEquals(10, p.getIntValue());
        Assert.assertEquals(10L, p.getLongValue());
        Assert.assertEquals(10.0, p.getDoubleValue(), 0.0001);
        Assert.assertEquals(10.0f, p.getFloatValue(), 0.0001f);
        Assert.assertEquals(BigInteger.valueOf(10), p.getBigIntegerValue());
        Assert.assertEquals(BigDecimal.valueOf(10), p.getDecimalValue());
        Assert.assertEquals("10", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonParser.NumberType.INT, p.getNumberType());
        Assert.assertEquals(20, p.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonParser.NumberType.LONG, p.getNumberType());
        Assert.assertEquals(30L, p.getLongValue());
        Assert.assertEquals(BigDecimal.valueOf(30L), p.getDecimalValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(JsonParser.NumberType.DOUBLE, p.getNumberType());
        Assert.assertEquals(40.5, p.getDoubleValue(), 0.0001);
        Assert.assertEquals(BigInteger.valueOf(40), p.getBigIntegerValue());
        Assert.assertEquals(BigDecimal.valueOf(40.5), p.getDecimalValue());
        Assert.assertEquals("40.5", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(JsonParser.NumberType.FLOAT, p.getNumberType());
        Assert.assertEquals(50.5f, p.getFloatValue(), 0.0001f);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(JsonParser.NumberType.BIG_DECIMAL, p.getNumberType());
        Assert.assertEquals(new BigDecimal("60.5"), p.getDecimalValue());
        Assert.assertEquals(new BigInteger("60"), p.getBigIntegerValue());

        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, p.getNumberType());
        Assert.assertEquals(new BigInteger("70"), p.getBigIntegerValue());
        Assert.assertEquals(new BigDecimal("70"), p.getDecimalValue());

        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(80.5, p.getDoubleValue(), 0.0001);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(90L, p.getLongValue());

        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testSegmentRolloverAndPeekNextToken() throws IOException {
        TokenBuffer buf = new TokenBuffer(null);
        for (int i = 0; i < 35; i++) {
            buf.writeNumber(i);
        }

        JsonParser p = buf.asParser();
        TokenBuffer.Parser tbParser = (TokenBuffer.Parser) p;

        for (int i = 0; i < 35; i++) {
            JsonToken peeked = tbParser.peekNextToken();
            Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, peeked);
            Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            Assert.assertEquals(i, p.getIntValue());
        }

        Assert.assertNull(tbParser.peekNextToken());
        Assert.assertNull(p.nextToken());
        p.close();
        Assert.assertTrue(p.isClosed());
        Assert.assertNull(tbParser.peekNextToken());
    }

    @Test
    public void testObjectsTreesAndBinary() throws IOException {
        TokenBuffer buf = new TokenBuffer(new ObjectMapper());
        byte[] binaryData = new byte[]{1, 2, 3, 4, 5};
        Object customObj = new Object();
        TextNode treeNode = new TextNode("treeText");

        buf.writeStartArray();
        buf.writeObject(customObj);
        buf.writeTree(treeNode);
        buf.writeBinary(binaryData, 1, 3);
        buf.writeString("QUJD"); // Base64 for "ABC"
        buf.writeEndArray();

        JsonParser p = buf.asParser();
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        Assert.assertSame(customObj, p.getEmbeddedObject());

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        Assert.assertSame(treeNode, p.getEmbeddedObject());

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        byte[] readBin1 = p.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(new byte[]{2, 3, 4}, readBin1);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int bytesRead = p.readBinaryValue(Base64Variants.MIME, baos);
        Assert.assertEquals(3, bytesRead);
        Assert.assertArrayEquals(new byte[]{2, 3, 4}, baos.toByteArray());

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] readBin2 = p.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(new byte[]{'A', 'B', 'C'}, readBin2);

        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testNativeIdsAndSerialization() throws IOException {
        TokenBuffer buf = new TokenBuffer(null, true);
        buf.writeTypeId("CustomType");
        buf.writeObjectId("id123");
        buf.writeStartObject();
        buf.writeFieldName("field");
        buf.writeTypeId("FieldType");
        buf.writeString("value");
        buf.writeEndObject();

        JsonParser p = buf.asParser();
        TokenBuffer.Parser tbp = (TokenBuffer.Parser) p;
        Assert.assertTrue(tbp.canReadTypeId());
        Assert.assertTrue(tbp.canReadObjectId());

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals("CustomType", tbp.getTypeId());
        Assert.assertEquals("id123", tbp.getObjectId());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("FieldType", tbp.getTypeId());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();

        TokenBuffer target = new TokenBuffer(null, true);
        buf.serialize(target);
        String targetStr = target.toString();
        Assert.assertTrue(targetStr.contains("START_OBJECT"));
        Assert.assertTrue(targetStr.contains("field"));
    }

    @Test
    public void testCopyCurrentStructureAndEvent() throws IOException {
        String json = "{\"obj\":{\"num\":123,\"arr\":[true,false,null,1.25,99999999999999999999999999999999]}}";
        JsonFactory factory = new JsonFactory();
        JsonParser srcParser = factory.createParser(json);

        TokenBuffer buf = new TokenBuffer(null);
        srcParser.nextToken(); // Move to START_OBJECT
        buf.copyCurrentStructure(srcParser);
        srcParser.close();

        JsonParser p = buf.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("obj", p.getCurrentName());
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("num", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(123, p.getIntValue());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("arr", p.getCurrentName());
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(1.25, p.getDoubleValue(), 0.001);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken()); // Big Integer/Decimal
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testAppendAndDeserialize() throws IOException {
        TokenBuffer buf1 = new TokenBuffer(null);
        buf1.writeNumber(1);
        TokenBuffer buf2 = new TokenBuffer(null);
        buf2.writeNumber(2);

        buf1.append(buf2);
        JsonParser p = buf1.asParser();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1, p.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(2, p.getIntValue());
        p.close();

        JsonParser src = new JsonFactory().createParser("{\"val\":100}");
        src.nextToken();
        TokenBuffer deserializedBuf = new TokenBuffer(null);
        deserializedBuf.deserialize(src, (DeserializationContext) null);
        src.close();

        JsonParser dp = deserializedBuf.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, dp.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, dp.nextToken());
        Assert.assertEquals("val", dp.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, dp.nextToken());
        Assert.assertEquals(100, dp.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, dp.nextToken());
        dp.close();
    }

    @Test
    public void testParserContextAndNameOverride() throws IOException {
        TokenBuffer buf = new TokenBuffer(null);
        buf.writeStartObject();
        buf.writeFieldName("oldName");
        buf.writeString("val");
        buf.writeStartArray();
        buf.writeEndArray();
        buf.writeEndObject();

        JsonParser p = buf.asParser();
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.overrideCurrentName("overriddenRoot");

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("oldName", p.getCurrentName());
        p.overrideCurrentName("newName");
        Assert.assertEquals("newName", p.getCurrentName());

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        p.overrideCurrentName("arrayName");
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testParserLocationsAndCodec() throws IOException {
        TokenBuffer buf = new TokenBuffer(null);
        buf.writeNumber(1);

        JsonFactory jf = new JsonFactory();
        JsonParser srcParser = jf.createParser("123");
        JsonParser p = buf.asParser(srcParser);
        srcParser.close();

        Assert.assertEquals(JsonLocation.NA, p.getCurrentLocation());
        Assert.assertEquals(JsonLocation.NA, p.getTokenLocation());

        JsonLocation loc = new JsonLocation("src", 10, 1, 10);
        ((TokenBuffer.Parser) p).setLocation(loc);
        Assert.assertEquals(loc, p.getCurrentLocation());
        Assert.assertEquals(loc, p.getTokenLocation());

        ObjectMapper mapper = new ObjectMapper();
        p.setCodec(mapper);
        Assert.assertSame(mapper, p.getCodec());
        Assert.assertNotNull(p.version());
        p.close();
    }

    @Test
    public void testUnbalancedContextTransitions() throws IOException {
        TokenBuffer buf = new TokenBuffer(null);
        buf.writeEndObject();
        buf.writeEndArray();

        JsonParser p = buf.asParser();
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testToStringTruncation() throws IOException {
        TokenBuffer buf = new TokenBuffer(null);
        for (int i = 0; i < 110; i++) {
            buf.writeNumber(i);
        }
        String str = buf.toString();
        Assert.assertTrue(str.contains("... (truncated 10 entries)"));
    }

    @Test
    public void testFlushCloseStatus() throws IOException {
        TokenBuffer buf = new TokenBuffer(null);
        Assert.assertFalse(buf.isClosed());
        buf.flush();
        Assert.assertNotNull(buf.getOutputContext());
        buf.close();
        Assert.assertTrue(buf.isClosed());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUTF8StringUnsupported() throws IOException {
        new TokenBuffer(null).writeRawUTF8String(new byte[1], 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteUTF8StringUnsupported() throws IOException {
        new TokenBuffer(null).writeUTF8String(new byte[1], 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawStringUnsupported() throws IOException {
        new TokenBuffer(null).writeRaw("text");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawSubstringUnsupported() throws IOException {
        new TokenBuffer(null).writeRaw("text", 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawSerializableStringUnsupported() throws IOException {
        new TokenBuffer(null).writeRaw(new SerializedString("text"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawCharArrayUnsupported() throws IOException {
        new TokenBuffer(null).writeRaw(new char[]{'a'}, 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawCharUnsupported() throws IOException {
        new TokenBuffer(null).writeRaw('c');
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValueStringUnsupported() throws IOException {
        new TokenBuffer(null).writeRawValue("text");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValueSubstringUnsupported() throws IOException {
        new TokenBuffer(null).writeRawValue("text", 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValueCharArrayUnsupported() throws IOException {
        new TokenBuffer(null).writeRawValue(new char[]{'a'}, 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinaryStreamUnsupported() {
        new TokenBuffer(null).writeBinary(Base64Variants.MIME, new ByteArrayInputStream(new byte[0]), 0);
    }

    @Test(expected = JsonParseException.class)
    public void testGetNumberValueOnNonNumericToken() throws IOException {
        TokenBuffer buf = new TokenBuffer(null);
        buf.writeString("notANumber");
        JsonParser p = buf.asParser();
        p.nextToken();
        try {
            p.getNumberValue();
        } finally {
            p.close();
        }
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueOnInvalidToken() throws IOException {
        TokenBuffer buf = new TokenBuffer(null);
        buf.writeNumber(123);
        JsonParser p = buf.asParser();
        p.nextToken();
        try {
            p.getBinaryValue(Base64Variants.MIME);
        } finally {
            p.close();
        }
    }

    @Test
    public void testSegmentDirectMethods() {
        TokenBuffer.Segment segment = new TokenBuffer.Segment();
        Assert.assertFalse(segment.hasIds());
        Assert.assertNull(segment.next());

        TokenBuffer.Segment nextSeg = segment.append(0, JsonToken.START_OBJECT, "objId", "typeId");
        Assert.assertNull(nextSeg);
        Assert.assertTrue(segment.hasIds());
        Assert.assertEquals("objId", segment.findObjectId(0));
        Assert.assertEquals("typeId", segment.findTypeId(0));
        Assert.assertEquals(JsonToken.START_OBJECT, segment.type(0));
        Assert.assertEquals(JsonToken.START_OBJECT.ordinal(), segment.rawType(0));

        TokenBuffer.Segment overflowSeg = segment.append(TokenBuffer.Segment.TOKENS_PER_SEGMENT, JsonToken.VALUE_NULL);
        Assert.assertNotNull(overflowSeg);
        Assert.assertSame(overflowSeg, segment.next());
        Assert.assertEquals(JsonToken.VALUE_NULL, overflowSeg.type(0));

        TokenBuffer.Segment rawOverflow = segment.appendRaw(TokenBuffer.Segment.TOKENS_PER_SEGMENT, 5, "rawVal", "oId", "tId");
        Assert.assertNotNull(rawOverflow);
        Assert.assertEquals(5, rawOverflow.rawType(0));
        Assert.assertEquals("rawVal", rawOverflow.get(0));
        Assert.assertEquals("oId", rawOverflow.findObjectId(0));
        Assert.assertEquals("tId", rawOverflow.findTypeId(0));
    }
}
