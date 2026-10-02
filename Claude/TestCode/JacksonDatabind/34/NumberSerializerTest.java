import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberSerializerTest {

    private JsonFactory jsonFactory;

    /**
     * Simple stub implementation of JsonFormatVisitorWrapper.
     * (No mocking framework used - a hand-written stub implementing the real interface.)
     * All expect* methods return null which is safe because the internal helper
     * methods (visitIntFormat / visitFloatFormat) are expected to null-check the
     * returned visitor before using it.
     */
    private static class StubFormatVisitorWrapper implements JsonFormatVisitorWrapper {
        private SerializerProvider provider;

        @Override
        public SerializerProvider getProvider() {
            return provider;
        }

        @Override
        public void setProvider(SerializerProvider provider) {
            this.provider = provider;
        }

        @Override
        public JsonObjectFormatVisitor expectObjectFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonArrayFormatVisitor expectArrayFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonStringFormatVisitor expectStringFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonNullFormatVisitor expectNullFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonAnyFormatVisitor expectAnyFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonMapFormatVisitor expectMapFormat(JavaType type) throws JsonMappingException {
            return null;
        }
    }

    /**
     * Custom Number subclass used to exercise the "fallback" branch of serialize()
     * where none of the known Number subtypes match.
     */
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

    @Before
    public void setUp() {
        jsonFactory = new JsonFactory();
    }

    private String serializeAndGetOutput(NumberSerializer serializer, Number value) throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        serializer.serialize(value, gen, (SerializerProvider) null);
        gen.flush();
        gen.close();
        return sw.toString();
    }

    // ---------------------------------------------------------------------
    // Constructor / handledType tests
    // ---------------------------------------------------------------------

    @Test
    public void testConstructor_bigIntegerType_isIntTrue() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        assertEquals(BigInteger.class, serializer.handledType());
    }

    @Test
    public void testConstructor_bigDecimalType_isIntFalse() {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        assertEquals(BigDecimal.class, serializer.handledType());
    }

    @Test
    public void testStaticInstance_isNumberClass() {
        assertEquals(Number.class, NumberSerializer.instance.handledType());
    }

    // ---------------------------------------------------------------------
    // serialize() - normal/typical inputs
    // ---------------------------------------------------------------------

    @Test
    public void testSerialize_bigDecimalValue_writesCorrectNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        String output = serializeAndGetOutput(serializer, new BigDecimal("123.456"));
        assertEquals("123.456", output);
    }

    @Test
    public void testSerialize_bigIntegerValue_writesCorrectNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        String output = serializeAndGetOutput(serializer, new BigInteger("123456789012345"));
        assertEquals("123456789012345", output);
    }

    @Test
    public void testSerialize_integerValue_writesCorrectNumber() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        String output = serializeAndGetOutput(serializer, Integer.valueOf(42));
        assertEquals("42", output);
    }

    @Test
    public void testSerialize_longValue_writesCorrectNumber() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        String output = serializeAndGetOutput(serializer, Long.valueOf(1234567890123L));
        assertEquals("1234567890123", output);
    }

    @Test
    public void testSerialize_doubleValue_writesCorrectNumber() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        String output = serializeAndGetOutput(serializer, Double.valueOf(3.14));
        assertEquals("3.14", output);
    }

    @Test
    public void testSerialize_floatValue_writesCorrectNumber() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        String output = serializeAndGetOutput(serializer, Float.valueOf(2.5f));
        assertEquals("2.5", output);
    }

    @Test
    public void testSerialize_byteValue_writesCorrectNumber() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        String output = serializeAndGetOutput(serializer, Byte.valueOf((byte) 7));
        assertEquals("7", output);
    }

    @Test
    public void testSerialize_shortValue_writesCorrectNumber() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        String output = serializeAndGetOutput(serializer, Short.valueOf((short) 99));
        assertEquals("99", output);
    }

    @Test
    public void testSerialize_customNumberSubtype_usesFallbackToString() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        String output = serializeAndGetOutput(serializer, new CustomNumber("999"));
        assertEquals("999", output);
    }

    // ---------------------------------------------------------------------
    // serialize() - edge cases (0, negative numbers)
    // ---------------------------------------------------------------------

    @Test
    public void testSerialize_zeroInteger_writesZero() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        String output = serializeAndGetOutput(serializer, Integer.valueOf(0));
        assertEquals("0", output);
    }

    @Test
    public void testSerialize_negativeLong_writesNegativeNumber() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        String output = serializeAndGetOutput(serializer, Long.valueOf(-9999L));
        assertEquals("-9999", output);
    }

    @Test
    public void testSerialize_negativeBigDecimal_writesNegativeNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        String output = serializeAndGetOutput(serializer, new BigDecimal("-0.001"));
        assertEquals("-0.001", output);
    }

    @Test
    public void testSerialize_negativeBigInteger_writesNegativeNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        String output = serializeAndGetOutput(serializer, new BigInteger("-42"));
        assertEquals("-42", output);
    }

    // ---------------------------------------------------------------------
    // serialize() - exception case (null value)
    // ---------------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testSerialize_nullValue_throwsNullPointerException() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        serializeAndGetOutput(serializer, null);
    }

    // ---------------------------------------------------------------------
    // getSchema() tests
    // ---------------------------------------------------------------------

    @Test
    public void testGetSchema_isIntTrue_returnsIntegerType() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        JsonNode schema = serializer.getSchema((SerializerProvider) null, null);
        assertNotNull(schema);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_isIntFalse_returnsNumberType() {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        JsonNode schema = serializer.getSchema((SerializerProvider) null, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    // ---------------------------------------------------------------------
    // acceptJsonFormatVisitor() tests
    // ---------------------------------------------------------------------

    @Test
    public void testAcceptJsonFormatVisitor_bigIntegerType_usesIntFormatBranch() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(BigInteger.class);
        StubFormatVisitorWrapper visitor = new StubFormatVisitorWrapper();
        // Should not throw - exercises visitIntFormat internal branch
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
    }

    @Test
    public void testAcceptJsonFormatVisitor_bigDecimalType_usesFloatFormatBranch() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(BigDecimal.class);
        StubFormatVisitorWrapper visitor = new StubFormatVisitorWrapper();
        // Should not throw - exercises visitFloatFormat internal branch
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
    }

    @Test
    public void testAcceptJsonFormatVisitor_otherNumberType_usesExpectNumberFormatBranch() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Long.class);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(Long.class);
        StubFormatVisitorWrapper visitor = new StubFormatVisitorWrapper();
        // Should not throw - exercises else branch calling visitor.expectNumberFormat
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
    }

    @Test
    public void testAcceptJsonFormatVisitor_numberClass_usesExpectNumberFormatBranch() throws Exception {
        NumberSerializer serializer = NumberSerializer.instance;
        JavaType typeHint = TypeFactory.defaultInstance().constructType(Number.class);
        StubFormatVisitorWrapper visitor = new StubFormatVisitorWrapper();
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
    }
}
