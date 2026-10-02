package com.fasterxml.jackson.databind.ser.std;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;

public class NumberSerializersTest {

    private JsonGenerator createGenerator(StringWriter writer) throws Exception {
        JsonFactory factory = new JsonFactory();
        return factory.createGenerator(writer);
    }

    // ---------------------------------------------------------
    // addAll() tests
    // ---------------------------------------------------------

    @Test
    public void testAddAll_populatesMapWithAllExpectedKeys_correctInstances() {
        Map<String, JsonSerializer<?>> map = new HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(map);

        assertTrue(map.containsKey(Integer.class.getName()));
        assertTrue(map.containsKey(Integer.TYPE.getName()));
        assertTrue(map.containsKey(Long.class.getName()));
        assertTrue(map.containsKey(Long.TYPE.getName()));
        assertTrue(map.containsKey(Byte.class.getName()));
        assertTrue(map.containsKey(Byte.TYPE.getName()));
        assertTrue(map.containsKey(Short.class.getName()));
        assertTrue(map.containsKey(Short.TYPE.getName()));
        assertTrue(map.containsKey(Float.class.getName()));
        assertTrue(map.containsKey(Float.TYPE.getName()));
        assertTrue(map.containsKey(Double.class.getName()));
        assertTrue(map.containsKey(Double.TYPE.getName()));

        assertTrue(map.get(Integer.class.getName()) instanceof NumberSerializers.IntegerSerializer);
        assertSame(map.get(Integer.class.getName()), map.get(Integer.TYPE.getName()));

        assertSame(NumberSerializers.LongSerializer.instance, map.get(Long.class.getName()));
        assertSame(NumberSerializers.LongSerializer.instance, map.get(Long.TYPE.getName()));

        assertSame(NumberSerializers.IntLikeSerializer.instance, map.get(Byte.class.getName()));
        assertSame(NumberSerializers.IntLikeSerializer.instance, map.get(Byte.TYPE.getName()));

        assertSame(NumberSerializers.ShortSerializer.instance, map.get(Short.class.getName()));
        assertSame(NumberSerializers.ShortSerializer.instance, map.get(Short.TYPE.getName()));

        assertSame(NumberSerializers.FloatSerializer.instance, map.get(Float.class.getName()));
        assertSame(NumberSerializers.FloatSerializer.instance, map.get(Float.TYPE.getName()));

        assertSame(NumberSerializers.DoubleSerializer.instance, map.get(Double.class.getName()));
        assertSame(NumberSerializers.DoubleSerializer.instance, map.get(Double.TYPE.getName()));
    }

    @Test
    public void testAddAll_calledOnEmptyMap_mapSizeIsTwelve() {
        Map<String, JsonSerializer<?>> map = new HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(map);
        assertEquals(12, map.size());
    }

    // ---------------------------------------------------------
    // ShortSerializer
    // ---------------------------------------------------------

    @Test
    public void testShortSerializer_serialize_normalValue_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        serializer.serialize((short) 42, gen, null);
        gen.close();
        assertEquals("42", writer.toString());
    }

    @Test
    public void testShortSerializer_serialize_boundaryValues_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        serializer.serialize(Short.MIN_VALUE, gen, null);
        gen.close();
        assertEquals(String.valueOf(Short.MIN_VALUE), writer.toString());
    }

    @Test
    public void testShortSerializer_serialize_zeroValue_writesZero() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        serializer.serialize((short) 0, gen, null);
        gen.close();
        assertEquals("0", writer.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testShortSerializer_serialize_nullValue_throwsNPE() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        serializer.serialize(null, gen, null);
    }

    // ---------------------------------------------------------
    // IntegerSerializer
    // ---------------------------------------------------------

    @Test
    public void testIntegerSerializer_serialize_normalValue_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        serializer.serialize(Integer.valueOf(123), gen, null);
        gen.close();
        assertEquals("123", writer.toString());
    }

    @Test
    public void testIntegerSerializer_serialize_negativeValue_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        serializer.serialize(Integer.valueOf(-99), gen, null);
        gen.close();
        assertEquals("-99", writer.toString());
    }

    @Test
    public void testIntegerSerializer_serialize_boundaryValue_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        serializer.serialize(Integer.valueOf(Integer.MAX_VALUE), gen, null);
        gen.close();
        assertEquals(String.valueOf(Integer.MAX_VALUE), writer.toString());
    }

    @Test
    public void testIntegerSerializer_serializeWithType_delegatesToSerialize() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        serializer.serializeWithType(Integer.valueOf(7), gen, null, null);
        gen.close();
        assertEquals("7", writer.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testIntegerSerializer_serialize_nullValue_throwsNPE() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        serializer.serialize(null, gen, null);
    }

    // ---------------------------------------------------------
    // IntLikeSerializer
    // ---------------------------------------------------------

    @Test
    public void testIntLikeSerializer_serialize_byteValue_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.IntLikeSerializer serializer = new NumberSerializers.IntLikeSerializer();
        serializer.serialize(Byte.valueOf((byte) 5), gen, null);
        gen.close();
        assertEquals("5", writer.toString());
    }

    @Test
    public void testIntLikeSerializer_serialize_negativeValue_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.IntLikeSerializer serializer = new NumberSerializers.IntLikeSerializer();
        serializer.serialize(Byte.valueOf((byte) -5), gen, null);
        gen.close();
        assertEquals("-5", writer.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testIntLikeSerializer_serialize_nullValue_throwsNPE() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.IntLikeSerializer serializer = new NumberSerializers.IntLikeSerializer();
        serializer.serialize(null, gen, null);
    }

    // ---------------------------------------------------------
    // LongSerializer
    // ---------------------------------------------------------

    @Test
    public void testLongSerializer_serialize_normalValue_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.LongSerializer serializer = new NumberSerializers.LongSerializer();
        serializer.serialize(Long.valueOf(9999999999L), gen, null);
        gen.close();
        assertEquals("9999999999", writer.toString());
    }

    @Test
    public void testLongSerializer_serialize_boundaryValue_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.LongSerializer serializer = new NumberSerializers.LongSerializer();
        serializer.serialize(Long.valueOf(Long.MIN_VALUE), gen, null);
        gen.close();
        assertEquals(String.valueOf(Long.MIN_VALUE), writer.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testLongSerializer_serialize_nullValue_throwsNPE() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.LongSerializer serializer = new NumberSerializers.LongSerializer();
        serializer.serialize(null, gen, null);
    }

    // ---------------------------------------------------------
    // FloatSerializer
    // ---------------------------------------------------------

    @Test
    public void testFloatSerializer_serialize_normalValue_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.FloatSerializer serializer = new NumberSerializers.FloatSerializer();
        serializer.serialize(Float.valueOf(3.14f), gen, null);
        gen.close();
        assertEquals("3.14", writer.toString());
    }

    @Test
    public void testFloatSerializer_serialize_zeroValue_writesZero() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.FloatSerializer serializer = new NumberSerializers.FloatSerializer();
        serializer.serialize(Float.valueOf(0.0f), gen, null);
        gen.close();
        assertEquals("0.0", writer.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testFloatSerializer_serialize_nullValue_throwsNPE() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.FloatSerializer serializer = new NumberSerializers.FloatSerializer();
        serializer.serialize(null, gen, null);
    }

    // ---------------------------------------------------------
    // DoubleSerializer
    // ---------------------------------------------------------

    @Test
    public void testDoubleSerializer_serialize_normalValue_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();
        serializer.serialize(Double.valueOf(2.71828), gen, null);
        gen.close();
        assertEquals("2.71828", writer.toString());
    }

    @Test
    public void testDoubleSerializer_serialize_negativeValue_writesCorrectNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();
        serializer.serialize(Double.valueOf(-1.5), gen, null);
        gen.close();
        assertEquals("-1.5", writer.toString());
    }

    @Test
    public void testDoubleSerializer_serializeWithType_delegatesToSerialize() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();
        serializer.serializeWithType(Double.valueOf(9.9), gen, null, null);
        gen.close();
        assertEquals("9.9", writer.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testDoubleSerializer_serialize_nullValue_throwsNPE() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = createGenerator(writer);
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();
        serializer.serialize(null, gen, null);
    }

    // ---------------------------------------------------------
    // getSchema()
    // ---------------------------------------------------------

    @Test
    public void testGetSchema_integerSerializer_returnsNonNullSchema() {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        JsonNode schema = serializer.getSchema(null, null);
        assertNotNull(schema);
    }

    @Test
    public void testGetSchema_doubleSerializer_returnsNonNullSchema() {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();
        JsonNode schema = serializer.getSchema(null, null);
        assertNotNull(schema);
    }

    @Test
    public void testGetSchema_shortSerializer_returnsNonNullSchema() {
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        JsonNode schema = serializer.getSchema(null, null);
        assertNotNull(schema);
    }

    // ---------------------------------------------------------
    // createContextual()
    // ---------------------------------------------------------

    @Test
    public void testCreateContextual_nullProperty_returnsSameInstance_integerSerializer() throws Exception {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        JsonSerializer<?> result = serializer.createContextual(null, null);
        assertSame(serializer, result);
    }

    @Test
    public void testCreateContextual_nullProperty_returnsSameInstance_longSerializer() throws Exception {
        NumberSerializers.LongSerializer serializer = new NumberSerializers.LongSerializer();
        JsonSerializer<?> result = serializer.createContextual(null, null);
        assertSame(serializer, result);
    }

    @Test
    public void testCreateContextual_nullProperty_returnsSameInstance_shortSerializer() throws Exception {
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        JsonSerializer<?> result = serializer.createContextual(null, null);
        assertSame(serializer, result);
    }

    @Test
    public void testCreateContextual_nullProperty_returnsSameInstance_floatSerializer() throws Exception {
        NumberSerializers.FloatSerializer serializer = new NumberSerializers.FloatSerializer();
        JsonSerializer<?> result = serializer.createContextual(null, null);
        assertSame(serializer, result);
    }

    @Test
    public void testCreateContextual_nullProperty_returnsSameInstance_doubleSerializer() throws Exception {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();
        JsonSerializer<?> result = serializer.createContextual(null, null);
        assertSame(serializer, result);
    }

    @Test
    public void testCreateContextual_nullProperty_returnsSameInstance_intLikeSerializer() throws Exception {
        NumberSerializers.IntLikeSerializer serializer = new NumberSerializers.IntLikeSerializer();
        JsonSerializer<?> result = serializer.createContextual(null, null);
        assertSame(serializer, result);
    }

    // ---------------------------------------------------------
    // acceptJsonFormatVisitor()
    // ---------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testAcceptJsonFormatVisitor_intTypeSerializer_nullVisitor_throwsNPE() throws Exception {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        serializer.acceptJsonFormatVisitor(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testAcceptJsonFormatVisitor_numberTypeSerializer_nullVisitor_throwsNPE() throws Exception {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();
        serializer.acceptJsonFormatVisitor(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testAcceptJsonFormatVisitor_floatSerializer_nullVisitor_throwsNPE() throws Exception {
        NumberSerializers.FloatSerializer serializer = new NumberSerializers.FloatSerializer();
        serializer.acceptJsonFormatVisitor(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testAcceptJsonFormatVisitor_shortSerializer_nullVisitor_throwsNPE() throws Exception {
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        serializer.acceptJsonFormatVisitor(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testAcceptJsonFormatVisitor_intLikeSerializer_nullVisitor_throwsNPE() throws Exception {
        NumberSerializers.IntLikeSerializer serializer = new NumberSerializers.IntLikeSerializer();
        serializer.acceptJsonFormatVisitor(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testAcceptJsonFormatVisitor_longSerializer_nullVisitor_throwsNPE() throws Exception {
        NumberSerializers.LongSerializer serializer = new NumberSerializers.LongSerializer();
        serializer.acceptJsonFormatVisitor(null, null);
    }

    // ---------------------------------------------------------
    // Instance identity checks (static instance fields)
    // ---------------------------------------------------------

    @Test
    public void testStaticInstances_notNull() {
        assertNotNull(NumberSerializers.ShortSerializer.instance);
        assertNotNull(NumberSerializers.IntLikeSerializer.instance);
        assertNotNull(NumberSerializers.LongSerializer.instance);
        assertNotNull(NumberSerializers.FloatSerializer.instance);
        assertNotNull(NumberSerializers.DoubleSerializer.instance);
    }
}
