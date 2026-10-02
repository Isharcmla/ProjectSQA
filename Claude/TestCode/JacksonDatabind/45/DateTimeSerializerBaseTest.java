package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeSerializerBaseTest {

    /**
     * Minimal concrete implementation used purely for testing the
     * abstract base class behavior through its public API.
     */
    static class TestDateTimeSerializer extends DateTimeSerializerBase<Date> {
        private static final long serialVersionUID = 1L;

        protected TestDateTimeSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new TestDateTimeSerializer(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return (value == null) ? 0L : value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (value == null) {
                gen.writeNull();
            } else {
                gen.writeNumber(value.getTime());
            }
        }
    }

    // ---------------------------------------------------------------
    // Constructor / withFormat
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_withValidParams_createsInstance() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(Boolean.TRUE, null);
        assertNotNull(serializer);
        assertEquals(Date.class, serializer.handledType());
    }

    @Test
    public void testWithFormat_returnsNewInstance() {
        TestDateTimeSerializer original = new TestDateTimeSerializer(null, null);
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeSerializerBase<Date> updated = original.withFormat(Boolean.FALSE, fmt);
        assertNotNull(updated);
        assertNotSame(original, updated);
    }

    @Test
    public void testWithFormat_setsTimestampFlag_verifiedViaGetSchema() {
        TestDateTimeSerializer original = new TestDateTimeSerializer(null, null);
        DateTimeSerializerBase<Date> updated = original.withFormat(Boolean.TRUE, null);
        JsonNode schema = updated.getSchema(null, null);
        assertEquals("number", schema.get("type").asText());
    }

    // ---------------------------------------------------------------
    // isEmpty(T value) - deprecated single-arg overload
    // ---------------------------------------------------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testIsEmptyDeprecated_nullValue_returnsTrue() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        assertTrue(serializer.isEmpty((Date) null));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testIsEmptyDeprecated_zeroTimestamp_returnsTrue() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        Date zeroDate = new Date(0L);
        assertTrue(serializer.isEmpty(zeroDate));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testIsEmptyDeprecated_nonZeroTimestamp_returnsFalse() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        Date nonZeroDate = new Date(123456789L);
        assertFalse(serializer.isEmpty(nonZeroDate));
    }

    // ---------------------------------------------------------------
    // isEmpty(SerializerProvider, T value)
    // ---------------------------------------------------------------

    @Test
    public void testIsEmptySerializerProvider_nullValue_returnsTrue() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        assertTrue(serializer.isEmpty((SerializerProvider) null, null));
    }

    @Test
    public void testIsEmptySerializerProvider_zeroTimestamp_returnsTrue() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        Date zeroDate = new Date(0L);
        assertTrue(serializer.isEmpty(null, zeroDate));
    }

    @Test
    public void testIsEmptySerializerProvider_nonZeroTimestamp_returnsFalse() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        Date nonZeroDate = new Date(987654321L);
        assertFalse(serializer.isEmpty(null, nonZeroDate));
    }

    @Test
    public void testIsEmptySerializerProvider_negativeTimestamp_returnsFalse() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        Date negativeDate = new Date(-500L);
        assertFalse(serializer.isEmpty(null, negativeDate));
    }

    // ---------------------------------------------------------------
    // getSchema (exercises _asTimestamp branches)
    // ---------------------------------------------------------------

    @Test
    public void testGetSchema_useTimestampTrue_returnsNumberSchema() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(Boolean.TRUE, null);
        JsonNode schema = serializer.getSchema(null, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_useTimestampFalse_returnsStringSchema() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(Boolean.FALSE, null);
        JsonNode schema = serializer.getSchema(null, null);
        assertNotNull(schema);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_customFormatSetNoUseTimestamp_returnsStringSchema() {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, fmt);
        JsonNode schema = serializer.getSchema(null, null);
        assertNotNull(schema);
        assertEquals("string", schema.get("type").asText());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSchema_noUseTimestampNoCustomFormatNullProvider_throwsIllegalArgumentException() {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        serializer.getSchema(null, null);
    }

    // ---------------------------------------------------------------
    // createContextual
    // ---------------------------------------------------------------

    @Test
    public void testCreateContextual_nullProperty_returnsSameInstance() throws JsonMappingException {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        Object result = serializer.createContextual(null, null);
        assertSame(serializer, result);
    }

    // ---------------------------------------------------------------
    // acceptJsonFormatVisitor
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testAcceptJsonFormatVisitor_nullVisitor_throwsNullPointerException() throws JsonMappingException {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(Boolean.TRUE, null);
        serializer.acceptJsonFormatVisitor((JsonFormatVisitorWrapper) null, null);
    }

    // ---------------------------------------------------------------
    // serialize (concrete implementation exercised through real JsonGenerator)
    // ---------------------------------------------------------------

    @Test
    public void testSerialize_withNonNullValue_writesNumericTimestamp() throws IOException {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(baos);
        Date value = new Date(123456L);
        serializer.serialize(value, gen, null);
        gen.flush();
        gen.close();
        String output = baos.toString("UTF-8").trim();
        assertEquals("123456", output);
    }

    @Test
    public void testSerialize_withNullValue_writesNullToken() throws IOException {
        TestDateTimeSerializer serializer = new TestDateTimeSerializer(null, null);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(baos);
        serializer.serialize(null, gen, null);
        gen.flush();
        gen.close();
        String output = baos.toString("UTF-8").trim();
        assertEquals("null", output);
    }
}
