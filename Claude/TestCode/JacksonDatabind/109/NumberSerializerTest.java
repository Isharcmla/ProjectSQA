import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

@SuppressWarnings("deprecation")
public class NumberSerializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------- Helper custom Number subclass for fallback test ----------
    private static class CustomNumber extends Number {
        private final String repr;

        CustomNumber(String repr) {
            this.repr = repr;
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
            return 0f;
        }

        @Override
        public double doubleValue() {
            return 0d;
        }

        @Override
        public String toString() {
            return repr;
        }
    }

    private JsonGenerator createGenerator(StringWriter sw) throws IOException {
        return new JsonFactory().createGenerator(sw);
    }

    // ============================================================
    // Constructor / getSchema tests
    // ============================================================

    @Test
    public void testGetSchema_BigInteger_returnsIntegerType() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        JsonNode schema = ser.getSchema(mapper.getSerializerProviderInstance(), null);
        assertNotNull(schema);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_BigDecimal_returnsNumberType() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        JsonNode schema = ser.getSchema(mapper.getSerializerProviderInstance(), null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_StaticInstance_returnsNumberType() throws Exception {
        JsonNode schema = NumberSerializer.instance.getSchema(mapper.getSerializerProviderInstance(), null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    // ============================================================
    // createContextual tests
    // ============================================================

    @Test
    public void testCreateContextual_noFormatOverride_returnsSameInstance() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        JsonSerializer<?> result = ser.createContextual(provider, null);
        assertSame(ser, result);
    }

    @Test
    public void testCreateContextual_stringFormatOverride_returnsToStringSerializer() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.configOverride(BigDecimal.class)
                .setFormat(JsonFormat.Value.forShape(JsonFormat.Shape.STRING));

        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        SerializerProvider provider = localMapper.getSerializerProviderInstance();
        JsonSerializer<?> result = ser.createContextual(provider, null);

        assertTrue(result instanceof ToStringSerializer);
    }

    @Test
    public void testCreateContextual_numberShapeFormatOverride_returnsSameInstance() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.configOverride(BigDecimal.class)
                .setFormat(JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER));

        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        SerializerProvider provider = localMapper.getSerializerProviderInstance();
        JsonSerializer<?> result = ser.createContextual(provider, null);

        assertSame(ser, result);
    }

    // ============================================================
    // serialize tests
    // ============================================================

    @Test
    public void testSerialize_BigDecimal_writesCorrectValue() throws IOException {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(new BigDecimal("123.456"), g, provider);
        g.flush();
        g.close();

        assertEquals("123.456", sw.toString());
    }

    @Test
    public void testSerialize_BigInteger_writesCorrectValue() throws IOException {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(new BigInteger("123456789"), g, provider);
        g.flush();
        g.close();

        assertEquals("123456789", sw.toString());
    }

    @Test
    public void testSerialize_Long_writesCorrectValue() throws IOException {
        NumberSerializer ser = new NumberSerializer(Number.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(Long.valueOf(123456789L), g, provider);
        g.flush();
        g.close();

        assertEquals("123456789", sw.toString());
    }

    @Test
    public void testSerialize_Double_writesCorrectValue() throws IOException {
        NumberSerializer ser = new NumberSerializer(Number.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(Double.valueOf(1.5d), g, provider);
        g.flush();
        g.close();

        assertEquals("1.5", sw.toString());
    }

    @Test
    public void testSerialize_Float_writesCorrectValue() throws IOException {
        NumberSerializer ser = new NumberSerializer(Number.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(Float.valueOf(2.5f), g, provider);
        g.flush();
        g.close();

        assertEquals("2.5", sw.toString());
    }

    @Test
    public void testSerialize_Integer_writesCorrectValue() throws IOException {
        NumberSerializer ser = new NumberSerializer(Number.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(Integer.valueOf(42), g, provider);
        g.flush();
        g.close();

        assertEquals("42", sw.toString());
    }

    @Test
    public void testSerialize_Byte_writesCorrectValue() throws IOException {
        NumberSerializer ser = new NumberSerializer(Number.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(Byte.valueOf((byte) 7), g, provider);
        g.flush();
        g.close();

        assertEquals("7", sw.toString());
    }

    @Test
    public void testSerialize_Short_writesCorrectValue() throws IOException {
        NumberSerializer ser = new NumberSerializer(Number.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(Short.valueOf((short) 99), g, provider);
        g.flush();
        g.close();

        assertEquals("99", sw.toString());
    }

    @Test
    public void testSerialize_customNumberSubclass_fallbackToStringWrite() throws IOException {
        NumberSerializer ser = new NumberSerializer(Number.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(new CustomNumber("999"), g, provider);
        g.flush();
        g.close();

        assertEquals("999", sw.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testSerialize_nullValue_throwsNullPointerException() throws IOException {
        NumberSerializer ser = new NumberSerializer(Number.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(null, g, provider);
    }

    @Test
    public void testSerialize_zeroValue_writesZero() throws IOException {
        NumberSerializer ser = new NumberSerializer(Number.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(Integer.valueOf(0), g, provider);
        g.flush();
        g.close();

        assertEquals("0", sw.toString());
    }

    @Test
    public void testSerialize_negativeValue_writesNegative() throws IOException {
        NumberSerializer ser = new NumberSerializer(Number.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize(Integer.valueOf(-100), g, provider);
        g.flush();
        g.close();

        assertEquals("-100", sw.toString());
    }

    // ============================================================
    // acceptJsonFormatVisitor tests
    // ============================================================

    @Test
    public void testAcceptJsonFormatVisitor_BigInteger_noExceptionThrown() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base();
        JavaType typeHint = mapper.getTypeFactory().constructType(BigInteger.class);

        ser.acceptJsonFormatVisitor(visitor, typeHint);
        // no exception means success
        assertTrue(true);
    }

    @Test
    public void testAcceptJsonFormatVisitor_BigDecimal_noExceptionThrown() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base();
        JavaType typeHint = mapper.getTypeFactory().constructType(BigDecimal.class);

        ser.acceptJsonFormatVisitor(visitor, typeHint);
        assertTrue(true);
    }

    @Test
    public void testAcceptJsonFormatVisitor_otherNumberType_noExceptionThrown() throws Exception {
        NumberSerializer ser = new NumberSerializer(Number.class);
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base();
        JavaType typeHint = mapper.getTypeFactory().constructType(Number.class);

        ser.acceptJsonFormatVisitor(visitor, typeHint);
        assertTrue(true);
    }
}
