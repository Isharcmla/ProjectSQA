package com.fasterxml.jackson.databind.node;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Assert;
import org.junit.Test;

public class TreeTraversingParserTest {

    private final JsonNodeFactory nf = JsonNodeFactory.instance;

    @Test
    public void testConstructor_withValueNode_initializesRootCursor() throws IOException {
        IntNode node = nf.numberNode(123);
        TreeTraversingParser parser = new TreeTraversingParser(node);

        Assert.assertNull(parser.getCodec());
        Assert.assertFalse(parser.isClosed());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());
        Assert.assertNull(parser.nextToken());
        Assert.assertTrue(parser.isClosed());
        parser.close();
    }

    @Test
    public void testConstructor_withObjectNodeAndCodec_initializesObjectCursor() throws IOException {
        ObjectNode node = nf.objectNode();
        node.put("key", "value");
        ObjectMapper mapper = new ObjectMapper();
        TreeTraversingParser parser = new TreeTraversingParser(node, mapper);

        Assert.assertSame(mapper, parser.getCodec());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("key", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("value", parser.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testSetAndGetCodec_updatesCodecSuccessfully() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(nf.nullNode());
        Assert.assertNull(parser.getCodec());

        ObjectMapper mapper = new ObjectMapper();
        parser.setCodec(mapper);
        Assert.assertSame(mapper, parser.getCodec());
        parser.close();
    }

    @Test
    public void testVersion_returnsNonNullVersion() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(nf.nullNode());
        Version v = parser.version();
        Assert.assertNotNull(v);
        Assert.assertFalse(v.isUnknownVersion());
        parser.close();
    }

    @Test
    public void testClose_setsClosedAndClearsState() throws IOException {
        ObjectNode node = nf.objectNode();
        node.put("a", 1);
        TreeTraversingParser parser = new TreeTraversingParser(node);

        Assert.assertFalse(parser.isClosed());
        parser.close();
        Assert.assertTrue(parser.isClosed());
        Assert.assertNull(parser.getText());
        Assert.assertNull(parser.getCurrentName());
        Assert.assertNull(parser.getEmbeddedObject());
        Assert.assertFalse(parser.isNaN());

        // Calling close again should be a no-op
        parser.close();
        Assert.assertTrue(parser.isClosed());
    }

    @Test
    public void testTraverse_emptyObjectAndEmptyArray() throws IOException {
        ObjectNode root = nf.objectNode();
        root.putObject("emptyObj");
        root.putArray("emptyArr");

        TreeTraversingParser parser = new TreeTraversingParser(root);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("emptyObj", parser.getCurrentName());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("emptyArr", parser.getCurrentName());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testTraverse_nestedArrayAndObjects() throws IOException {
        ArrayNode root = nf.arrayNode();
        root.add(1);
        ObjectNode childObj = root.addObject();
        childObj.put("name", "test");
        ArrayNode childArr = root.addArray();
        childArr.add(true);
        childArr.addNull();

        TreeTraversingParser parser = new TreeTraversingParser(root);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(1, parser.getIntValue());

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("name", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("test", parser.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testSkipChildren_onStartObject() throws IOException {
        ObjectNode root = nf.objectNode();
        ObjectNode sub = root.putObject("sub");
        sub.put("k1", "v1");
        sub.put("k2", "v2");
        root.put("after", "ok");

        TreeTraversingParser parser = new TreeTraversingParser(root);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        // Skip the child object
        JsonParser skipped = parser.skipChildren();
        Assert.assertSame(parser, skipped);
        Assert.assertEquals(JsonToken.END_OBJECT, parser.currentToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("after", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("ok", parser.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testSkipChildren_onStartArray() throws IOException {
        ArrayNode root = nf.arrayNode();
        ArrayNode sub = root.addArray();
        sub.add("a");
        sub.add("b");
        root.add("after");

        TreeTraversingParser parser = new TreeTraversingParser(root);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        JsonParser skipped = parser.skipChildren();
        Assert.assertSame(parser, skipped);
        Assert.assertEquals(JsonToken.END_ARRAY, parser.currentToken());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("after", parser.getText());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testSkipChildren_onScalarNode_noOp() throws IOException {
        TextNode node = nf.textNode("hello");
        TreeTraversingParser parser = new TreeTraversingParser(node);
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        parser.skipChildren();
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.currentToken());
        parser.close();
    }

    @Test
    public void testOverrideCurrentName_modifiesFieldName() throws IOException {
        ObjectNode root = nf.objectNode();
        root.put("oldName", "value");

        TreeTraversingParser parser = new TreeTraversingParser(root);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("oldName", parser.getCurrentName());

        parser.overrideCurrentName("newName");
        Assert.assertEquals("newName", parser.getCurrentName());
        Assert.assertEquals("newName", parser.getText());

        parser.close();
        parser.overrideCurrentName("ignoredWhenClosed");
    }

    @Test
    public void testGetParsingContextAndLocations() throws IOException {
        ObjectNode root = nf.objectNode();
        root.put("a", 1);
        TreeTraversingParser parser = new TreeTraversingParser(root);

        Assert.assertNotNull(parser.getParsingContext());
        Assert.assertEquals(JsonLocation.NA, parser.getTokenLocation());
        Assert.assertEquals(JsonLocation.NA, parser.getCurrentLocation());
        parser.close();
    }

    @Test
    public void testGetText_variousTokenTypes() throws IOException {
        ObjectNode root = nf.objectNode();
        root.put("str", "testString");
        root.put("emptyStr", "");
        root.put("intVal", 42);
        root.put("floatVal", 3.14);
        root.put("boolVal", false);
        root.putNull("nullVal");

        TreeTraversingParser parser = new TreeTraversingParser(root);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals("{", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("str", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("testString", parser.getText());
        Assert.assertArrayEquals("testString".toCharArray(), parser.getTextCharacters());
        Assert.assertEquals(10, parser.getTextLength());
        Assert.assertEquals(0, parser.getTextOffset());
        Assert.assertFalse(parser.hasTextCharacters());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("emptyStr", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("", parser.getText());
        Assert.assertEquals(0, parser.getTextLength());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("intVal", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("42", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("floatVal", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("3.14", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("boolVal", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        Assert.assertEquals("false", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("nullVal", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals("null", parser.getText());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals("}", parser.getText());

        Assert.assertNull(parser.nextToken());
        Assert.assertNull(parser.getText());
        parser.close();
    }

    @Test
    public void testGetText_withEmbeddedBinaryNode() throws IOException {
        byte[] data = new byte[]{1, 2, 3, 4};
        BinaryNode binaryNode = nf.binaryNode(data);
        TreeTraversingParser parser = new TreeTraversingParser(binaryNode);

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        String text = parser.getText();
        Assert.assertNotNull(text);
        Assert.assertEquals(Base64Variants.getDefaultVariant().encode(data), text);
        parser.close();
    }

    @Test
    public void testNumericAccessors_intAndLong() throws IOException {
        ArrayNode arr = nf.arrayNode();
        arr.add(0);
        arr.add(-100);
        arr.add(Integer.MAX_VALUE);
        arr.add(Long.MAX_VALUE);

        TreeTraversingParser parser = new TreeTraversingParser(arr);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
        Assert.assertEquals(0, parser.getIntValue());
        Assert.assertEquals(0L, parser.getLongValue());
        Assert.assertEquals(0, parser.getNumberValue().intValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(-100, parser.getIntValue());
        Assert.assertEquals(-100L, parser.getLongValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(Integer.MAX_VALUE, parser.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());
        Assert.assertEquals(Long.MAX_VALUE, parser.getLongValue());
        Assert.assertEquals(BigInteger.valueOf(Long.MAX_VALUE), parser.getBigIntegerValue());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNumericAccessors_floatingPointAndBigNumbers() throws IOException {
        ArrayNode arr = nf.arrayNode();
        arr.add(12.345);
        arr.add(new BigDecimal("12345678901234567890.123456789"));
        arr.add(new BigInteger("999999999999999999999999999999"));

        TreeTraversingParser parser = new TreeTraversingParser(arr);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
        Assert.assertEquals(12.345, parser.getDoubleValue(), 0.0001);
        Assert.assertEquals(12.345f, parser.getFloatValue(), 0.0001f);
        Assert.assertEquals(BigDecimal.valueOf(12.345), parser.getDecimalValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());
        Assert.assertEquals(new BigDecimal("12345678901234567890.123456789"), parser.getDecimalValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());
        Assert.assertEquals(new BigInteger("999999999999999999999999999999"), parser.getBigIntegerValue());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNumericAccessors_onNonNumericNode_throwsException() throws IOException {
        TextNode node = nf.textNode("not_a_number");
        TreeTraversingParser parser = new TreeTraversingParser(node);
        parser.nextToken();
        try {
            parser.getIntValue();
        } finally {
            parser.close();
        }
    }

    @Test(expected = JsonParseException.class)
    public void testNumericAccessors_whenNodeIsNull_throwsException() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(nf.nullNode());
        parser.close();
        parser.getIntValue();
    }

    @Test
    public void testGetEmbeddedObject_pojoAndBinaryNodes() throws IOException {
        Object pojo = new Object() {
            @Override
            public String toString() {
                return "myPojo";
            }
        };
        POJONode pojoNode = nf.pojoNode(pojo);
        byte[] bytes = new byte[]{10, 20, 30};
        BinaryNode binaryNode = nf.binaryNode(bytes);

        ArrayNode arr = nf.arrayNode();
        arr.add(pojoNode);
        arr.add(binaryNode);
        arr.add("plainString");

        TreeTraversingParser parser = new TreeTraversingParser(arr);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertNull(parser.getEmbeddedObject());

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        Assert.assertSame(pojo, parser.getEmbeddedObject());

        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        Assert.assertArrayEquals(bytes, (byte[]) parser.getEmbeddedObject());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertNull(parser.getEmbeddedObject());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
        Assert.assertNull(parser.getEmbeddedObject());
    }

    @Test
    public void testIsNaN() throws IOException {
        DoubleNode nanNode = nf.numberNode(Double.NaN);
        DoubleNode normalNode = nf.numberNode(1.23);
        TextNode textNode = nf.textNode("str");

        ArrayNode arr = nf.arrayNode();
        arr.add(nanNode);
        arr.add(normalNode);
        arr.add(textNode);

        TreeTraversingParser parser = new TreeTraversingParser(arr);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertFalse(parser.isNaN());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertTrue(parser.isNaN());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertFalse(parser.isNaN());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertFalse(parser.isNaN());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
        Assert.assertFalse(parser.isNaN());
    }

    @Test
    public void testGetBinaryValue_fromBinaryNodeAndTextNode() throws IOException {
        byte[] rawData = "Hello Jackson".getBytes("UTF-8");
        String b64 = Base64Variants.MIME.encode(rawData);

        ArrayNode arr = nf.arrayNode();
        arr.add(nf.binaryNode(rawData));
        arr.add(nf.textNode(b64));
        arr.add(nf.nullNode());

        TreeTraversingParser parser = new TreeTraversingParser(arr);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertNull(parser.getBinaryValue(Base64Variants.MIME));

        // BinaryNode
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        Assert.assertArrayEquals(rawData, parser.getBinaryValue(Base64Variants.MIME));

        // TextNode
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertArrayEquals(rawData, parser.getBinaryValue(Base64Variants.MIME));

        // NullNode
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertNull(parser.getBinaryValue(Base64Variants.MIME));

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testReadBinaryValue_writesToOutputStream() throws IOException {
        byte[] rawData = "Streaming bytes test".getBytes("UTF-8");
        BinaryNode node = nf.binaryNode(rawData);

        TreeTraversingParser parser = new TreeTraversingParser(node);
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int count = parser.readBinaryValue(Base64Variants.getDefaultVariant(), baos);
        Assert.assertEquals(rawData.length, count);
        Assert.assertArrayEquals(rawData, baos.toByteArray());

        // When closed or no binary content
        parser.close();
        ByteArrayOutputStream emptyOut = new ByteArrayOutputStream();
        int emptyCount = parser.readBinaryValue(Base64Variants.getDefaultVariant(), emptyOut);
        Assert.assertEquals(0, emptyCount);
        Assert.assertEquals(0, emptyOut.size());
    }

    @Test
    public void testHandleEOF_throwsInternalError() {
        TreeTraversingParser parser = new TreeTraversingParser(nf.nullNode());
        try {
            parser._handleEOF();
            Assert.fail("Expected RuntimeException / InternalError");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().contains("Internal error"));
        } catch (JsonParseException e) {
            Assert.fail("Unexpected JsonParseException: " + e.getMessage());
        }
    }
}
