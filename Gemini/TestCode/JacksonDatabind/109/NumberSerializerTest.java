package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class NumberSerializerTest {

    private final ObjectMapper mapper = new ObjectMapper();
    private final JsonFactory jsonFactory = new JsonFactory();

    static class CustomNumber extends Number {
        private static final long serialVersionUID = 1L;
        private final String value;

        public CustomNumber(String value) {
            this.value = value;
        }

        @Override
        public int intValue() { return Integer.parseInt(value); }

        @Override
        public long longValue() { return Long.parseLong(value); }

        @Override
        public float floatValue() { return Float.parseFloat(value); }

        @Override
        public double doubleValue() { return Double.parseDouble(value); }

        @Override
        public String toString() { return value; }
    }

    static class FormattedAsStringBean {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public BigDecimal bigDecimal = new BigDecimal("123.45");

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public BigInteger bigInteger = new BigInteger("9999");
    }

    static class FormattedAsNumberBean {
        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public BigDecimal bigDecimal = new BigDecimal("67.89");
    }

    private String serializeNumber(NumberSerializer serializer, Number value) throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        serializer.serialize(value, g, provider);
        g.flush();
        return sw.toString();
    }

    @Test
    public void testSerialize_bigDecimal_writesNumber() throws IOException {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        Assert.assertEquals("123.45", serializeNumber(ser, new BigDecimal("123.45")));
        Assert.assertEquals("-123.45", serializeNumber(ser, new BigDecimal("-123.45")));
        Assert.assertEquals("0", serializeNumber(ser, BigDecimal.ZERO));
    }

    @Test
    public void testSerialize_bigInteger_writesNumber() throws IOException {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        Assert.assertEquals("12345678901234567890", serializeNumber(ser, new BigInteger("12345678901234567890")));
        Assert.assertEquals("-999999999999999999", serializeNumber(ser, new BigInteger("-999999999999999999")));
        Assert.assertEquals("0", serializeNumber(ser, BigInteger.ZERO));
    }

    @Test
    public void testSerialize_long_writesNumber() throws IOException {
        NumberSerializer ser = NumberSerializer.instance;
        Assert.assertEquals("1234567890123", serializeNumber(ser, 1234567890123L));
        Assert.assertEquals("0", serializeNumber(ser, 0L));
        Assert.assertEquals("-1234567890123", serializeNumber(ser, -1234567890123L));
        Assert.assertEquals(String.valueOf(Long.MAX_VALUE), serializeNumber(ser, Long.MAX_VALUE));
        Assert.assertEquals(String.valueOf(Long.MIN_VALUE), serializeNumber(ser, Long.MIN_VALUE));
    }

    @Test
    public void testSerialize_double_writesNumber() throws IOException {
        NumberSerializer ser = NumberSerializer.instance;
        Assert.assertEquals("123.5", serializeNumber(ser, 123.5d));
        Assert.assertEquals("0.0", serializeNumber(ser, 0.0d));
        Assert.assertEquals("-123.5", serializeNumber(ser, -123.5d));
    }

    @Test
    public void testSerialize_float_writesNumber() throws IOException {
        NumberSerializer ser = NumberSerializer.instance;
        Assert.assertEquals("123.5", serializeNumber(ser, 123.5f));
        Assert.assertEquals("0.0", serializeNumber(ser, 0.0f));
        Assert.assertEquals("-123.5", serializeNumber(ser, -123.5f));
    }

    @Test
    public void testSerialize_integer_writesNumber() throws IOException {
        NumberSerializer ser = NumberSerializer.instance;
        Assert.assertEquals("42", serializeNumber(ser, 42));
        Assert.assertEquals("0", serializeNumber(ser, 0));
        Assert.assertEquals("-42", serializeNumber(ser, -42));
        Assert.assertEquals(String.valueOf(Integer.MAX_VALUE), serializeNumber(ser, Integer.MAX_VALUE));
        Assert.assertEquals(String.valueOf(Integer.MIN_VALUE), serializeNumber(ser, Integer.MIN_VALUE));
    }

    @Test
    public void testSerialize_byte_writesNumber() throws IOException {
        NumberSerializer ser = NumberSerializer.instance;
        Assert.assertEquals("8", serializeNumber(ser, (byte) 8));
        Assert.assertEquals("0", serializeNumber(ser, (byte) 0));
        Assert.assertEquals("-8", serializeNumber(ser, (byte) -8));
    }

    @Test
    public void testSerialize_short_writesNumber() throws IOException {
        NumberSerializer ser = NumberSerializer.instance;
        Assert.assertEquals("16", serializeNumber(ser, (short) 16));
        Assert.assertEquals("0", serializeNumber(ser, (short) 0));
        Assert.assertEquals("-16", serializeNumber(ser, (short) -16));
    }

    @Test
    public void testSerialize_customNumber_writesUntypedNumber() throws IOException {
        NumberSerializer ser = NumberSerializer.instance;
        Assert.assertEquals("12345.6789", serializeNumber(ser, new CustomNumber("12345.6789")));
        Assert.assertEquals("-9876.54321", serializeNumber(ser, new CustomNumber("-9876.54321")));
        Assert.assertEquals("0", serializeNumber(ser, new CustomNumber("0")));
    }

    @Test
    public void testCreateContextual_nullProperty_returnsSelf() throws Exception {
        NumberSerializer ser = NumberSerializer.instance;
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        JsonSerializer<?> contextual = ser.createContextual(prov, null);
        Assert.assertSame(ser, contextual);
    }

    @Test
    public void testCreateContextual_shapeString_returnsToStringSerializer() throws Exception {
        String json = mapper.writeValueAsString(new FormattedAsStringBean());
        Assert.assertTrue(json.contains("\"bigDecimal\":\"123.45\""));
        Assert.assertTrue(json.contains("\"bigInteger\":\"9999\""));
    }

    @Test
    public void testCreateContextual_shapeNumber_returnsSelf() throws Exception {
        String json = mapper.writeValueAsString(new FormattedAsNumberBean());
        Assert.assertTrue(json.contains("\"bigDecimal\":67.89"));
    }

    @Test
    public void testCreateContextual_withBeanPropertyDirect() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        JavaType type = mapper.constructType(FormattedAsStringBean.class);
        BeanProperty prop = new BeanProperty.Std(
                com.fasterxml.jackson.databind.PropertyName.construct("bigDecimal"),
                mapper.constructType(BigDecimal.class),
                null,
                mapper.getSerializationConfig().introspect(type).findProperties().get(0).getMutator()
        );
        JsonSerializer<?> contextual = ser.createContextual(prov, prop);
        Assert.assertTrue(contextual instanceof ToStringSerializer);
    }

    @Test
    public void testGetSchema_isIntTrue_returnsIntegerSchema() {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        JsonNode schema = ser.getSchema(prov, null);
        Assert.assertNotNull(schema);
        Assert.assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_isIntFalse_returnsNumberSchema() {
        NumberSerializer serBigDecimal = new NumberSerializer(BigDecimal.class);
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        JsonNode schemaBigDecimal = serBigDecimal.getSchema(prov, null);
        Assert.assertNotNull(schemaBigDecimal);
        Assert.assertEquals("number", schemaBigDecimal.get("type").asText());

        JsonNode schemaNumber = NumberSerializer.instance.getSchema(prov, null);
        Assert.assertNotNull(schemaNumber);
        Assert.assertEquals("number", schemaNumber.get("type").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitor_bigInteger() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        final AtomicBoolean visitedInt = new AtomicBoolean(false);
        final JsonParser.NumberType[] numberTypeHolder = new JsonParser.NumberType[1];

        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
                return new JsonIntegerFormatVisitor.Base() {
                    @Override
                    public void numberType(JsonParser.NumberType type) {
                        visitedInt.set(true);
                        numberTypeHolder[0] = type;
                    }
                };
            }
        };

        JavaType javaType = TypeFactory.defaultInstance().constructType(BigInteger.class);
        ser.acceptJsonFormatVisitor(visitor, javaType);

        Assert.assertTrue(visitedInt.get());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, numberTypeHolder[0]);
    }

    @Test
    public void testAcceptJsonFormatVisitor_bigDecimal() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        final AtomicBoolean visitedNumber = new AtomicBoolean(false);
        final JsonParser.NumberType[] numberTypeHolder = new JsonParser.NumberType[1];

        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
                return new JsonNumberFormatVisitor.Base() {
                    @Override
                    public void numberType(JsonParser.NumberType type) {
                        visitedNumber.set(true);
                        numberTypeHolder[0] = type;
                    }
                };
            }
        };

        JavaType javaType = TypeFactory.defaultInstance().constructType(BigDecimal.class);
        ser.acceptJsonFormatVisitor(visitor, javaType);

        Assert.assertTrue(visitedNumber.get());
        Assert.assertEquals(JsonParser.NumberType.BIG_DECIMAL, numberTypeHolder[0]);
    }

    @Test
    public void testAcceptJsonFormatVisitor_genericNumber() throws Exception {
        NumberSerializer ser = NumberSerializer.instance;
        final AtomicBoolean visitedNumberFormat = new AtomicBoolean(false);

        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
                visitedNumberFormat.set(true);
                return new JsonNumberFormatVisitor.Base();
            }
        };

        JavaType javaType = TypeFactory.defaultInstance().constructType(Number.class);
        ser.acceptJsonFormatVisitor(visitor, javaType);

        Assert.assertTrue(visitedNumberFormat.get());
    }
}
