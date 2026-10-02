package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TreeTraversingParserTest {

    private final JsonNodeFactory nodeFactory = JsonNodeFactory.instance;

    @Test
    public void testConstructorsAndCodecAndVersion() {
        JsonNode root = nodeFactory.textNode("test");
        TreeTraversingParser parser1 = new TreeTraversingParser(root);
        Assert.assertNull(parser1.getCodec());

        ObjectCodec codec = new ObjectMapper();
        TreeTraversingParser parser2 = new TreeTraversingParser(root, codec);
        Assert.assertSame(codec, parser2.getCodec());

        parser1.setCodec(codec);
        Assert.assertSame(codec, parser1.getCodec());

        Version version = parser1.version();
        Assert.assertNotNull(version);
        Assert.assertFalse(version.isUnknownVersion());
    }

    @Test
    public void testCloseAndIsClosed() throws IOException {
        JsonNode root = nodeFactory.textNode("value");
        TreeTraversingParser parser = new TreeTraversingParser(root);

        Assert.assertFalse(parser.isClosed());
        parser.close();
        Assert.assertTrue(parser.isClosed());
        // Second close to cover idempotent branch
        parser.close();
        Assert.assertTrue(parser.isClosed());
        Assert.assertNull(parser.nextToken());
        Assert.assertNull(parser.getCurrentName());
        Assert.assertNull(parser.getText());
        Assert.assertNull(parser.getEmbeddedObject());
        Assert.assertFalse(parser.isNaN());
    }

    @Test
    public void testEmptyArrayTraversal() throws IOException {
        ArrayNode array = nodeFactory.arrayNode();
        TreeTraversingParser parser = new TreeTraversingParser(array);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        Assert.assertTrue(parser.isClosed());
    }

    @Test
    public void testEmptyObjectTraversal() throws IOException {
        ObjectNode object = nodeFactory.objectNode();
        TreeTraversingParser parser = new TreeTraversingParser(object);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        Assert.assertTrue(parser.isClosed());
    }

    @Test
    public void testNestedArrayTraversal() throws IOException {
        ArrayNode array = nodeFactory.arrayNode();
        ArrayNode innerArray = nodeFactory.arrayNode();
        innerArray.add(100);
        innerArray.add("hello");
        array.add(innerArray);

        TreeTraversingParser parser = new TreeTraversingParser(array);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(100, parser.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("hello", parser.getText());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNestedObjectTraversal() throws IOException {
        ObjectNode root = nodeFactory.objectNode();
        ObjectNode child = nodeFactory.objectNode();
        child.put("innerKey", true);
        root.set("childObj", child);
        root.put("nullField", (String) null);

        TreeTraversingParser parser = new TreeTraversingParser(root);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("childObj", parser.getCurrentName());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("innerKey", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("nullField", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testRootValueTraversal() throws IOException {
        JsonNode root = nodeFactory.numberNode(12345);
        TreeTraversingParser parser = new TreeTraversingParser(root);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(12345, parser.getIntValue());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testSkipChildrenOnStartObject() throws IOException {
        ObjectNode root = nodeFactory.objectNode();
        root.put("key1", "val1");
        root.put("key2", "val2");

        TreeTraversingParser parser = new TreeTraversingParser(root);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.skipChildren();
        Assert.assertEquals(JsonToken.END_OBJECT, parser.currentToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testSkipChildrenOnStartArray() throws IOException {
        ArrayNode root = nodeFactory.arrayNode();
        root.add(1);
        root.add(2);

        TreeTraversingParser parser = new TreeTraversingParser(root);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.skipChildren();
        Assert.assertEquals(JsonToken.END_ARRAY, parser.currentToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testSkipChildrenOnScalar() throws IOException {
        JsonNode root = nodeFactory.textNode("value");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        parser.skipChildren();
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.currentToken());
    }

    @Test
    public void testCurrentNameAndOverrideName() throws IOException {
        ObjectNode root = nodeFactory.objectNode();
        root.put("original", "val");

        TreeTraversingParser parser = new TreeTraversingParser(root);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("original", parser.getCurrentName());

        parser.overrideCurrentName("overridden");
        Assert.assertEquals("overridden", parser.getCurrentName());

        parser.close();
        parser.overrideCurrentName("shouldNotThrow");
        Assert.assertNull(parser.getCurrentName());
    }

    @Test
    public void testLocationsAndParsingContext() throws IOException {
        JsonNode root = nodeFactory.textNode("xyz");
        TreeTraversingParser parser = new TreeTraversingParser(root);

        Assert.assertEquals(JsonLocation.NA, parser.getTokenLocation());
        Assert.assertEquals(JsonLocation.NA, parser.getCurrentLocation());
        Assert.assertNotNull(parser.getParsingContext());
        parser.close();
        Assert.assertNull(parser.getParsingContext());
    }

    @Test
    public void testTextAccessors() throws IOException {
        ObjectNode root = nodeFactory.objectNode();
        root.put("str", "abc");
        root.put("numInt", 999);
        root.put("numFloat", 12.34);
        byte[] binaryData = new byte[]{1, 2, 3};
        root.put("bin", binaryData);
        root.put("bool", false);

        TreeTraversingParser parser = new TreeTraversingParser(root);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals("{", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("str", parser.getText());
        Assert.assertArrayEquals("str".toCharArray(), parser.getTextCharacters());
        Assert.assertEquals(3, parser.getTextLength());
        Assert.assertEquals(0, parser.getTextOffset());
        Assert.assertFalse(parser.hasTextCharacters());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("abc", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("numInt", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("999", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("numFloat", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("12.34", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("bin", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        Assert.assertNotNull(parser.getText()); // Base64 representation

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        Assert.assertEquals("false", parser.getText());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals("}", parser.getText());
    }

    @Test
    public void testNumericAccessors_IntNode() throws IOException {
        IntNode intNode = nodeFactory.numberNode(42);
        TreeTraversingParser parser = new TreeTraversingParser(intNode);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        Assert.assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
        Assert.assertEquals(42, parser.getIntValue());
        Assert.assertEquals(42L, parser.getLongValue());
        Assert.assertEquals(42.0, parser.getDoubleValue(), 0.0001);
        Assert.assertEquals(42.0f, parser.getFloatValue(), 0.0001f);
        Assert.assertEquals(BigInteger.valueOf(42), parser.getBigIntegerValue());
        Assert.assertEquals(new BigDecimal("42"), parser.getDecimalValue());
        Assert.assertEquals(42, parser.getNumberValue());
        Assert.assertFalse(parser.isNaN());
    }

    @Test
    public void testNumericAccessors_LongAndFloatAndDoubleAndBigValues() throws IOException {
        long bigLong = 987654321012345678L;
        TreeTraversingParser parser = new TreeTraversingParser(nodeFactory.numberNode(bigLong));
        parser.nextToken();
        Assert.assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());
        Assert.assertEquals(bigLong, parser.getLongValue());

        TreeTraversingParser parserDouble = new TreeTraversingParser(nodeFactory.numberNode(-12.5));
        parserDouble.nextToken();
        Assert.assertEquals(JsonParser.NumberType.DOUBLE, parserDouble.getNumberType());
        Assert.assertEquals(-12.5, parserDouble.getDoubleValue(), 0.0001);
        Assert.assertEquals(-12.5f, parserDouble.getFloatValue(), 0.0001f);
        Assert.assertFalse(parserDouble.isNaN());

        TreeTraversingParser parserNaN = new TreeTraversingParser(DoubleNode.valueOf(Double.NaN));
        parserNaN.nextToken();
        Assert.assertTrue(parserNaN.isNaN());

        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        TreeTraversingParser parserBigInt = new TreeTraversingParser(nodeFactory.numberNode(bigInt));
        parserBigInt.nextToken();
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, parserBigInt.getNumberType());
        Assert.assertEquals(bigInt, parserBigInt.getBigIntegerValue());

        BigDecimal bigDec = new BigDecimal("1234567890.0987654321");
        TreeTraversingParser parserBigDec = new TreeTraversingParser(nodeFactory.numberNode(bigDec));
        parserBigDec.nextToken();
        Assert.assertEquals(JsonParser.NumberType.BIG_DECIMAL, parserBigDec.getNumberType());
        Assert.assertEquals(bigDec, parserBigDec.getDecimalValue());
    }

    @Test(expected = JsonParseException.class)
    public void testNumericAccessors_OnNonNumericNode_ThrowsException() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(nodeFactory.textNode("not_a_number"));
        parser.nextToken();
        parser.getIntValue();
    }

    @Test(expected = JsonParseException.class)
    public void testGetNumberType_OnNonNumericNode_ThrowsException() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(nodeFactory.booleanNode(true));
        parser.nextToken();
        parser.getNumberType();
    }

    @Test
    public void testEmbeddedObject_POJONodeAndBinaryNode() throws IOException {
        String customPojo = "customPojoObject";
        POJONode pojoNode = nodeFactory.pojoNode(customPojo);
        TreeTraversingParser parserPojo = new TreeTraversingParser(pojoNode);
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parserPojo.nextToken());
        Assert.assertEquals(customPojo, parserPojo.getEmbeddedObject());

        byte[] rawBytes = new byte[]{10, 20, 30};
        BinaryNode binaryNode = nodeFactory.binaryNode(rawBytes);
        TreeTraversingParser parserBin = new TreeTraversingParser(binaryNode);
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parserBin.nextToken());
        Assert.assertArrayEquals(rawBytes, (byte[]) parserBin.getEmbeddedObject());

        TreeTraversingParser parserText = new TreeTraversingParser(nodeFactory.textNode("regular"));
        parserText.nextToken();
        Assert.assertNull(parserText.getEmbeddedObject());
    }

    @Test
    public void testBinaryValueAccessors() throws IOException {
        byte[] expected = new byte[]{4, 5, 6, 7};
        BinaryNode binaryNode = nodeFactory.binaryNode(expected);
        TreeTraversingParser parser = new TreeTraversingParser(binaryNode);
        parser.nextToken();

        byte[] result = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(expected, result);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int readCount = parser.readBinaryValue(Base64Variants.MIME, baos);
        Assert.assertEquals(expected.length, readCount);
        Assert.assertArrayEquals(expected, baos.toByteArray());

        POJONode pojoWithBytes = nodeFactory.pojoNode(new byte[]{8, 9});
        TreeTraversingParser parserPojoBytes = new TreeTraversingParser(pojoWithBytes);
        parserPojoBytes.nextToken();
        Assert.assertArrayEquals(new byte[]{8, 9}, parserPojoBytes.getBinaryValue(Base64Variants.MIME));

        POJONode pojoWithOther = nodeFactory.pojoNode(Integer.valueOf(123));
        TreeTraversingParser parserPojoOther = new TreeTraversingParser(pojoWithOther);
        parserPojoOther.nextToken();
        Assert.assertNull(parserPojoOther.getBinaryValue(Base64Variants.MIME));

        TreeTraversingParser parserEmpty = new TreeTraversingParser(nodeFactory.nullNode());
        parserEmpty.nextToken();
        Assert.assertNull(parserEmpty.getBinaryValue(Base64Variants.MIME));
        ByteArrayOutputStream emptyBaos = new ByteArrayOutputStream();
        Assert.assertEquals(0, parserEmpty.readBinaryValue(Base64Variants.MIME, emptyBaos));
        Assert.assertEquals(0, emptyBaos.size());
    }

    @Test(expected = RuntimeException.class)
    public void testHandleEOFThrowsInternalError() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(nodeFactory.nullNode());
        parser._handleEOF();
    }
}
