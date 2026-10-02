import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer;

import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberSerializersTest {

    private ObjectMapper mapper;
    private JsonFactory factory;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        factory = new JsonFactory();
    }

    // ------------------------------------------------------------
    // Bean classes used for createContextual() tests via ObjectMapper
    // ------------------------------------------------------------

    public static class PlainIntBean {
        public int value;
        public PlainIntBean(int v) { this.value = v; }
    }

    public static class ShapeStringIntBean {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public int value;
        public ShapeStringIntBean(int v) { this.value = v; }
    }

    public static class ShapeStringDoubleBean {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public double value;
        public ShapeStringDoubleBean(double v) { this.value = v; }
    }

    public static class ShapeStringLongBean {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public long value;
        public ShapeStringLongBean(long v) { this.value = v; }
    }

    // ------------------------------------------------------------
    // addAll()
    // ------------------------------------------------------------

    @Test
    public void testAddAll_normal_mapPopulatedWithAllTypes() {
        Map<String, JsonSerializer<?>> map = new HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(map);

        assertEquals(12, map.size());

        assertTrue(map.get(Integer.class.getName()) instanceof IntegerSerializer);
        assertTrue(map.get(Integer.TYPE.getName()) instanceof IntegerSerializer);
        assertTrue(map.get(Long.class.getName()) instanceof LongSerializer);
        assertTrue(map.get(Long.TYPE.getName()) instanceof LongSerializer);

        assertTrue(map.get(Byte.class.getName()) instanceof IntLikeSerializer);
        assertTrue(map.get(Byte.TYPE.getName()) instanceof IntLikeSerializer);
        assertTrue(map.get(Short.class.getName()) instanceof ShortSerializer);
        assertTrue(map.get(Short.TYPE.getName()) instanceof ShortSerializer);

        assertTrue(map.get(Double.class.getName()) instanceof DoubleSerializer);
        assertTrue(map.get(Double.TYPE.getName()) instanceof DoubleSerializer);
        assertTrue(map.get(Float.class.getName()) instanceof FloatSerializer);
        assertTrue(map.get(Float.TYPE.getName()) instanceof FloatSerializer);
    }

    @Test
    public void testAddAll_edgeCase_emptyMapBeforeCall() {
        Map<String, JsonSerializer<?>> map = new HashMap<String, JsonSerializer<?>>();
        assertTrue(map.isEmpty());
        NumberSerializers.addAll(map);
        assertFalse(map.isEmpty());
    }

    // ------------------------------------------------------------
    // IntegerSerializer
    // ------------------------------------------------------------

    @Test
    public void testIntegerSerializer_serialize_normalValue() throws Exception {
        IntegerSerializer ser = new IntegerSerializer(Integer.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize(Integer.valueOf(42), gen, null);
        gen.flush();
        assertEquals("42", sw.toString());
    }

    @Test
    public void testIntegerSerializer_serialize_edgeCaseMinMaxAndZero() throws Exception {
        IntegerSerializer ser = new IntegerSerializer(Integer.TYPE);

        StringWriter sw1 = new StringWriter();
        JsonGenerator gen1 = factory.createGenerator(sw1);
        ser.serialize(Integer.valueOf(0), gen1, null);
        gen1.flush();
        assertEquals("0", sw1.toString());

        StringWriter sw2 = new StringWriter();
        JsonGenerator gen2 = factory.createGenerator(sw2);
        ser.serialize(Integer.valueOf(Integer.MIN_VALUE), gen2, null);
        gen2.flush();
        assertEquals(String.valueOf(Integer.MIN_VALUE), sw2.toString());

        StringWriter sw3 = new StringWriter();
        JsonGenerator gen3 = factory.createGenerator(sw3);
        ser.serialize(Integer.valueOf(Integer.MAX_VALUE), gen3, null);
        gen3.flush();
        assertEquals(String.valueOf(Integer.MAX_VALUE), sw3.toString());
    }

    @Test(expected = ClassCastException.class)
    public void testIntegerSerializer_serialize_wrongTypeThrowsException() throws Exception {
        IntegerSerializer ser = new IntegerSerializer(Integer.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize("not an integer", gen, null);
    }

    @Test
    public void testIntegerSerializer_serializeWithType_delegatesToSerialize() throws Exception {
        IntegerSerializer ser = new IntegerSerializer(Integer.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serializeWithType(Integer.valueOf(7), gen, null, null);
        gen.flush();
        assertEquals("7", sw.toString());
    }

    @Test
    public void testIntegerSerializer_viaObjectMapper_normal() throws Exception {
        String json = mapper.writeValueAsString(Integer.valueOf(100));
        assertEquals("100", json);
    }

    @Test
    public void testIntegerSerializer_getSchema_returnsSchemaWithIntegerType() {
        IntegerSerializer ser = new IntegerSerializer(Integer.class);
        JsonNode node = ser.getSchema(null, null);
        assertNotNull(node);
    }

    @Test
    public void testIntegerSerializer_acceptJsonFormatVisitor_nullVisitorThrowsException() {
        IntegerSerializer ser = new IntegerSerializer(Integer.class);
        try {
            ser.acceptJsonFormatVisitor(null, null);
            fail("Expected NullPointerException when visitor is null");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    @Test
    public void testIntegerSerializer_createContextual_shapeStringUsesToStringSerializer() throws Exception {
        String json = mapper.writeValueAsString(new ShapeStringIntBean(5));
        assertEquals("{\"value\":\"5\"}", json);
    }

    @Test
    public void testIntegerSerializer_createContextual_defaultShapeKeepsThis() throws Exception {
        String json = mapper.writeValueAsString(new PlainIntBean(5));
        assertEquals("{\"value\":5}", json);
    }

    // ------------------------------------------------------------
    // LongSerializer
    // ------------------------------------------------------------

    @Test
    public void testLongSerializer_serialize_normalValue() throws Exception {
        LongSerializer ser = new LongSerializer(Long.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize(Long.valueOf(123456789012L), gen, null);
        gen.flush();
        assertEquals("123456789012", sw.toString());
    }

    @Test
    public void testLongSerializer_serialize_edgeCaseMinMaxAndZero() throws Exception {
        LongSerializer ser = new LongSerializer(Long.TYPE);

        StringWriter sw1 = new StringWriter();
        JsonGenerator gen1 = factory.createGenerator(sw1);
        ser.serialize(Long.valueOf(0L), gen1, null);
        gen1.flush();
        assertEquals("0", sw1.toString());

        StringWriter sw2 = new StringWriter();
        JsonGenerator gen2 = factory.createGenerator(sw2);
        ser.serialize(Long.valueOf(Long.MIN_VALUE), gen2, null);
        gen2.flush();
        assertEquals(String.valueOf(Long.MIN_VALUE), sw2.toString());

        StringWriter sw3 = new StringWriter();
        JsonGenerator gen3 = factory.createGenerator(sw3);
        ser.serialize(Long.valueOf(Long.MAX_VALUE), gen3, null);
        gen3.flush();
        assertEquals(String.valueOf(Long.MAX_VALUE), sw3.toString());
    }

    @Test(expected = ClassCastException.class)
    public void testLongSerializer_serialize_wrongTypeThrowsException() throws Exception {
        LongSerializer ser = new LongSerializer(Long.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize(Integer.valueOf(1), gen, null);
    }

    @Test
    public void testLongSerializer_viaObjectMapper_normal() throws Exception {
        String json = mapper.writeValueAsString(Long.valueOf(999L));
        assertEquals("999", json);
    }

    @Test
    public void testLongSerializer_getSchema_returnsNotNull() {
        LongSerializer ser = new LongSerializer(Long.class);
        JsonNode node = ser.getSchema(null, null);
        assertNotNull(node);
    }

    @Test
    public void testLongSerializer_acceptJsonFormatVisitor_nullVisitorThrowsException() {
        LongSerializer ser = new LongSerializer(Long.class);
        try {
            ser.acceptJsonFormatVisitor(null, null);
            fail("Expected NullPointerException when visitor is null");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    @Test
    public void testLongSerializer_createContextual_shapeStringUsesToStringSerializer() throws Exception {
        String json = mapper.writeValueAsString(new ShapeStringLongBean(123L));
        assertEquals("{\"value\":\"123\"}", json);
    }

    // ------------------------------------------------------------
    // ShortSerializer
    // ------------------------------------------------------------

    @Test
    public void testShortSerializer_serialize_normalValue() throws Exception {
        ShortSerializer ser = ShortSerializer.instance;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize(Short.valueOf((short) 7), gen, null);
        gen.flush();
        assertEquals("7", sw.toString());
    }

    @Test
    public void testShortSerializer_serialize_edgeCaseNegativeAndZero() throws Exception {
        ShortSerializer ser = ShortSerializer.instance;

        StringWriter sw1 = new StringWriter();
        JsonGenerator gen1 = factory.createGenerator(sw1);
        ser.serialize(Short.valueOf((short) 0), gen1, null);
        gen1.flush();
        assertEquals("0", sw1.toString());

        StringWriter sw2 = new StringWriter();
        JsonGenerator gen2 = factory.createGenerator(sw2);
        ser.serialize(Short.valueOf((short) -5), gen2, null);
        gen2.flush();
        assertEquals("-5", sw2.toString());
    }

    @Test(expected = ClassCastException.class)
    public void testShortSerializer_serialize_wrongTypeThrowsException() throws Exception {
        ShortSerializer ser = ShortSerializer.instance;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize("wrong", gen, null);
    }

    @Test
    public void testShortSerializer_viaObjectMapper_normal() throws Exception {
        String json = mapper.writeValueAsString(Short.valueOf((short) 30));
        assertEquals("30", json);
    }

    @Test
    public void testShortSerializer_getSchema_returnsNotNull() {
        ShortSerializer ser = ShortSerializer.instance;
        JsonNode node = ser.getSchema(null, null);
        assertNotNull(node);
    }

    @Test
    public void testShortSerializer_acceptJsonFormatVisitor_nullVisitorThrowsException() {
        ShortSerializer ser = ShortSerializer.instance;
        try {
            ser.acceptJsonFormatVisitor(null, null);
            fail("Expected NullPointerException when visitor is null");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    // ------------------------------------------------------------
    // IntLikeSerializer (Byte)
    // ------------------------------------------------------------

    @Test
    public void testIntLikeSerializer_serialize_normalValue() throws Exception {
        IntLikeSerializer ser = IntLikeSerializer.instance;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize(Byte.valueOf((byte) 5), gen, null);
        gen.flush();
        assertEquals("5", sw.toString());
    }

    @Test
    public void testIntLikeSerializer_serialize_edgeCaseNegativeAndZero() throws Exception {
        IntLikeSerializer ser = IntLikeSerializer.instance;

        StringWriter sw1 = new StringWriter();
        JsonGenerator gen1 = factory.createGenerator(sw1);
        ser.serialize(Byte.valueOf((byte) 0), gen1, null);
        gen1.flush();
        assertEquals("0", sw1.toString());

        StringWriter sw2 = new StringWriter();
        JsonGenerator gen2 = factory.createGenerator(sw2);
        ser.serialize(Byte.valueOf((byte) -1), gen2, null);
        gen2.flush();
        assertEquals("-1", sw2.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testIntLikeSerializer_serialize_nullValueThrowsException() throws Exception {
        IntLikeSerializer ser = IntLikeSerializer.instance;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize(null, gen, null);
    }

    @Test
    public void testIntLikeSerializer_viaObjectMapper_normal() throws Exception {
        String json = mapper.writeValueAsString(Byte.valueOf((byte) 9));
        assertEquals("9", json);
    }

    @Test
    public void testIntLikeSerializer_getSchema_returnsNotNull() {
        IntLikeSerializer ser = IntLikeSerializer.instance;
        JsonNode node = ser.getSchema(null, null);
        assertNotNull(node);
    }

    @Test
    public void testIntLikeSerializer_acceptJsonFormatVisitor_nullVisitorThrowsException() {
        IntLikeSerializer ser = IntLikeSerializer.instance;
        try {
            ser.acceptJsonFormatVisitor(null, null);
            fail("Expected NullPointerException when visitor is null");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    // ------------------------------------------------------------
    // FloatSerializer
    // ------------------------------------------------------------

    @Test
    public void testFloatSerializer_serialize_normalValue() throws Exception {
        FloatSerializer ser = FloatSerializer.instance;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize(Float.valueOf(3.14f), gen, null);
        gen.flush();
        assertEquals("3.14", sw.toString());
    }

    @Test
    public void testFloatSerializer_serialize_edgeCaseNegativeAndZero() throws Exception {
        FloatSerializer ser = FloatSerializer.instance;

        StringWriter sw1 = new StringWriter();
        JsonGenerator gen1 = factory.createGenerator(sw1);
        ser.serialize(Float.valueOf(0.0f), gen1, null);
        gen1.flush();
        assertEquals("0.0", sw1.toString());

        StringWriter sw2 = new StringWriter();
        JsonGenerator gen2 = factory.createGenerator(sw2);
        ser.serialize(Float.valueOf(-2.5f), gen2, null);
        gen2.flush();
        assertEquals("-2.5", sw2.toString());
    }

    @Test(expected = ClassCastException.class)
    public void testFloatSerializer_serialize_wrongTypeThrowsException() throws Exception {
        FloatSerializer ser = FloatSerializer.instance;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize("wrong", gen, null);
    }

    @Test
    public void testFloatSerializer_viaObjectMapper_normal() throws Exception {
        String json = mapper.writeValueAsString(Float.valueOf(1.5f));
        assertEquals("1.5", json);
    }

    @Test
    public void testFloatSerializer_getSchema_returnsNotNull() {
        FloatSerializer ser = FloatSerializer.instance;
        JsonNode node = ser.getSchema(null, null);
        assertNotNull(node);
    }

    @Test
    public void testFloatSerializer_acceptJsonFormatVisitor_nullVisitorThrowsException() {
        FloatSerializer ser = FloatSerializer.instance;
        try {
            ser.acceptJsonFormatVisitor(null, null);
            fail("Expected NullPointerException when visitor is null");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    // ------------------------------------------------------------
    // DoubleSerializer
    // ------------------------------------------------------------

    @Test
    public void testDoubleSerializer_serialize_normalValue() throws Exception {
        DoubleSerializer ser = new DoubleSerializer(Double.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize(Double.valueOf(3.14159), gen, null);
        gen.flush();
        assertEquals("3.14159", sw.toString());
    }

    @Test
    public void testDoubleSerializer_serialize_edgeCaseNegativeAndZero() throws Exception {
        DoubleSerializer ser = new DoubleSerializer(Double.TYPE);

        StringWriter sw1 = new StringWriter();
        JsonGenerator gen1 = factory.createGenerator(sw1);
        ser.serialize(Double.valueOf(0.0), gen1, null);
        gen1.flush();
        assertEquals("0.0", sw1.toString());

        StringWriter sw2 = new StringWriter();
        JsonGenerator gen2 = factory.createGenerator(sw2);
        ser.serialize(Double.valueOf(-9.99), gen2, null);
        gen2.flush();
        assertEquals("-9.99", sw2.toString());
    }

    @Test(expected = ClassCastException.class)
    public void testDoubleSerializer_serialize_wrongTypeThrowsException() throws Exception {
        DoubleSerializer ser = new DoubleSerializer(Double.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serialize("wrong", gen, null);
    }

    @Test
    public void testDoubleSerializer_serializeWithType_delegatesToSerialize() throws Exception {
        DoubleSerializer ser = new DoubleSerializer(Double.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        ser.serializeWithType(Double.valueOf(2.5), gen, null, null);
        gen.flush();
        assertEquals("2.5", sw.toString());
    }

    @Test
    public void testDoubleSerializer_viaObjectMapper_normal() throws Exception {
        String json = mapper.writeValueAsString(Double.valueOf(7.5));
        assertEquals("7.5", json);
    }

    @Test
    public void testDoubleSerializer_getSchema_returnsNotNull() {
        DoubleSerializer ser = new DoubleSerializer(Double.class);
        JsonNode node = ser.getSchema(null, null);
        assertNotNull(node);
    }

    @Test
    public void testDoubleSerializer_acceptJsonFormatVisitor_nullVisitorThrowsException() {
        DoubleSerializer ser = new DoubleSerializer(Double.class);
        try {
            ser.acceptJsonFormatVisitor(null, null);
            fail("Expected NullPointerException when visitor is null");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    @Test
    public void testDoubleSerializer_createContextual_shapeStringUsesToStringSerializer() throws Exception {
        String json = mapper.writeValueAsString(new ShapeStringDoubleBean(4.5));
        assertEquals("{\"value\":\"4.5\"}", json);
    }
}
