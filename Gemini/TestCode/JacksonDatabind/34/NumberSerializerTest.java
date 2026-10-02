package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class NumberSerializerTest {

    private JsonFactory jsonFactory;
    private SerializerProvider serializerProvider;

    @Before
    public void setUp() {
        ObjectMapper mapper = new ObjectMapper();
        this.jsonFactory = mapper.getFactory();
        this.serializerProvider = mapper.getSerializerProviderInstance();
    }

    private String serializeToString(NumberSerializer serializer, Number value) throws IOException {
        StringWriter writer = new StringWriter();
        JsonGenerator generator = jsonFactory.createGenerator(writer);
        serializer.serialize(value, generator, serializerProvider);
        generator.flush();
        generator.close();
        return writer.toString();
    }

    private static class CustomNumber extends Number {
        private final String representation;

        public CustomNumber(String representation) {
            this.representation = representation;
        }

        @Override
        public int intValue() {
            return 0;
        }

        @Override
        public long longValue() {
            return 0L;
        }

        @Override
        public float floatValue() {
            return 0.0f;
        }

        @Override
        public double doubleValue() {
            return 0.0d;
        }

        @Override
        public String toString() {
            return representation;
        }
    }

    @Test
    public void testConstructor_bigIntegerType_setsIsIntTrue() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        Assert.assertTrue(serializer._isInt);
    }

    @Test
    public void testConstructor_otherNumberTypes_setsIsIntFalse() {
        NumberSerializer numSerializer = new NumberSerializer(Number.class);
        Assert.assertFalse(numSerializer._isInt);

        NumberSerializer bigDecSerializer = new NumberSerializer(BigDecimal.class);
        Assert.assertFalse(bigDecSerializer._isInt);

        NumberSerializer doubleSerializer = new NumberSerializer(Double.class);
        Assert.assertFalse(doubleSerializer._isInt);
    }

    @Test
    public void testSerialize_bigDecimal_writesNumber() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;

        Assert.assertEquals("123.45", serializeToString(serializer, new BigDecimal("123.45")));
        Assert.assertEquals("0", serializeToString(serializer, BigDecimal.ZERO));
        Assert.assertEquals("-99.99", serializeToString(serializer, new BigDecimal("-99.99")));
    }

    @Test
    public void testSerialize_bigInteger_writesNumber() throws IOException {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);

        Assert.assertEquals("12345678901234567890", serializeToString(serializer, new BigInteger("12345678901234567890")));
        Assert.assertEquals("0", serializeToString(serializer, BigInteger.ZERO));
        Assert.assertEquals("-12345678901234567890", serializeToString(serializer, new BigInteger("-12345678901234567890")));
    }

    @Test
    public void testSerialize_integer_writesNumber() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;

        Assert.assertEquals("42", serializeToString(serializer, Integer.valueOf(42)));
        Assert.assertEquals("0", serializeToString(serializer, Integer.valueOf(0)));
        Assert.assertEquals("-42", serializeToString(serializer, Integer.valueOf(-42)));
        Assert.assertEquals(String.valueOf(Integer.MAX_VALUE), serializeToString(serializer, Integer.MAX_VALUE));
        Assert.assertEquals(String.valueOf(Integer.MIN_VALUE), serializeToString(serializer, Integer.MIN_VALUE));
    }

    @Test
    public void testSerialize_long_writesNumber() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;

        Assert.assertEquals("1234567890123", serializeToString(serializer, Long.valueOf(1234567890123L)));
        Assert.assertEquals("0", serializeToString(serializer, Long.valueOf(0L)));
        Assert.assertEquals("-1234567890123", serializeToString(serializer, Long.valueOf(-1234567890123L)));
    }

    @Test
    public void testSerialize_double_writesNumber() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;

        Assert.assertEquals("3.14159", serializeToString(serializer, Double.valueOf(3.14159)));
        Assert.assertEquals("0.0", serializeToString(serializer, Double.valueOf(0.0)));
        Assert.assertEquals("-3.14159", serializeToString(serializer, Double.valueOf(-3.14159)));
    }

    @Test
    public void testSerialize_float_writesNumber() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;

        Assert.assertEquals("2.5", serializeToString(serializer, Float.valueOf(2.5f)));
        Assert.assertEquals("0.0", serializeToString(serializer, Float.valueOf(0.0f)));
        Assert.assertEquals("-2.5", serializeToString(serializer, Float.valueOf(-2.5f)));
    }

    @Test
    public void testSerialize_byte_writesNumber() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;

        Assert.assertEquals("8", serializeToString(serializer, Byte.valueOf((byte) 8)));
        Assert.assertEquals("0", serializeToString(serializer, Byte.valueOf((byte) 0)));
        Assert.assertEquals("-8", serializeToString(serializer, Byte.valueOf((byte) -8)));
    }

    @Test
    public void testSerialize_short_writesNumber() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;

        Assert.assertEquals("16", serializeToString(serializer, Short.valueOf((short) 16)));
        Assert.assertEquals("0", serializeToString(serializer, Short.valueOf((short) 0)));
        Assert.assertEquals("-16", serializeToString(serializer, Short.valueOf((short) -16)));
    }

    @Test
    public void testSerialize_customNumberFallback_writesUntypedNumber() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;

        CustomNumber customNum = new CustomNumber("9876543210.123456789");
        Assert.assertEquals("9876543210.123456789", serializeToString(serializer, customNum));

        CustomNumber zeroCustomNum = new CustomNumber("0");
        Assert.assertEquals("0", serializeToString(serializer, zeroCustomNum));

        CustomNumber negativeCustomNum = new CustomNumber("-100");
        Assert.assertEquals("-100", serializeToString(serializer, negativeCustomNum));
    }

    @Test(expected = NullPointerException.class)
    public void testSerialize_nullValue_throwsNullPointerException() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        StringWriter writer = new StringWriter();
        JsonGenerator generator = jsonFactory.createGenerator(writer);
        serializer.serialize(null, generator, serializerProvider);
    }

    @Test
    public void testGetSchema_whenIsIntTrue_returnsIntegerSchemaNode() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        JsonNode schemaNode = serializer.getSchema(serializerProvider, BigInteger.class);

        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("integer", schemaNode.get("type").asText());
        Assert.assertTrue(schemaNode.get("required").asBoolean());
    }

    @Test
    public void testGetSchema_whenIsIntFalse_returnsNumberSchemaNode() {
        NumberSerializer numSerializer = NumberSerializer.instance;
        JsonNode numSchemaNode = numSerializer.getSchema(serializerProvider, Number.class);

        Assert.assertNotNull(numSchemaNode);
        Assert.assertEquals("number", numSchemaNode.get("type").asText());
        Assert.assertTrue(numSchemaNode.get("required").asBoolean());

        NumberSerializer bigDecimalSerializer = new NumberSerializer(BigDecimal.class);
        JsonNode bigDecSchemaNode = bigDecimalSerializer.getSchema(serializerProvider, BigDecimal.class);

        Assert.assertNotNull(bigDecSchemaNode);
        Assert.assertEquals("number", bigDecSchemaNode.get("type").asText());
        Assert.assertTrue(bigDecSchemaNode.get("required").asBoolean());
    }

    @Test
    public void testAcceptJsonFormatVisitor_whenIsIntTrue_visitsIntFormat() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        JavaType type = TypeFactory.defaultInstance().constructType(BigInteger.class);

        final AtomicBoolean visited = new AtomicBoolean(false);
        final AtomicReference<JsonParser.NumberType> numberTypeRef = new AtomicReference<JsonParser.NumberType>();

        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
                visited.set(true);
                return new JsonIntegerFormatVisitor.Base() {
                    @Override
                    public void numberType(JsonParser.NumberType type) {
                        numberTypeRef.set(type);
                    }
                };
            }
        };

        serializer.acceptJsonFormatVisitor(visitor, type);

        Assert.assertTrue(visited.get());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, numberTypeRef.get());
    }

    @Test
    public void testAcceptJsonFormatVisitor_whenBigDecimal_visitsFloatFormat() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        JavaType type = TypeFactory.defaultInstance().constructType(BigDecimal.class);

        final AtomicBoolean visited = new AtomicBoolean(false);
        final AtomicReference<JsonParser.NumberType> numberTypeRef = new AtomicReference<JsonParser.NumberType>();

        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
                visited.set(true);
                return new JsonNumberFormatVisitor.Base() {
                    @Override
                    public void numberType(JsonParser.NumberType type) {
                        numberTypeRef.set(type);
                    }
                };
            }
        };

        serializer.acceptJsonFormatVisitor(visitor, type);

        Assert.assertTrue(visited.get());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, numberTypeRef.get());
    }

    @Test
    public void testAcceptJsonFormatVisitor_whenOtherNumberType_callsExpectNumberFormat() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        JavaType type = TypeFactory.defaultInstance().constructType(Number.class);

        final AtomicBoolean visited = new AtomicBoolean(false);

        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
                visited.set(true);
                return new JsonNumberFormatVisitor.Base();
            }
        };

        serializer.acceptJsonFormatVisitor(visitor, type);

        Assert.assertTrue(visited.get());
    }
}
