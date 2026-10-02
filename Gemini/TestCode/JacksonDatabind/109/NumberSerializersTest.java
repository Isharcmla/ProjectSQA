package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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

public class NumberSerializersTest {

    private final ObjectMapper mapper = new ObjectMapper();
    private final JsonFactory jsonFactory = new JsonFactory();

    static class DummyNumberSerializers extends NumberSerializers {
        public DummyNumberSerializers() {
            super();
        }
    }

    static class DummyIntBaseSerializer extends NumberSerializers.Base<Object> {
        public DummyIntBaseSerializer(JsonParser.NumberType numberType) {
            super(Object.class, numberType, "integer");
        }

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeNumber(0);
        }
    }

    static class StringFormattedNumbers {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public int intVal = 123;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public long longVal = 456L;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public short shortVal = 78;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public byte byteVal = 9;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public double doubleVal = 10.5;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public float floatVal = 12.25f;
    }

    static class NumberFormattedNumbers {
        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public int intVal = 123;

        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public double doubleVal = 10.5;
    }

    static class TypedNumberWrapper {
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
        public Object value;

        public TypedNumberWrapper(Object value) {
            this.value = value;
        }
    }

    static class TestFormatVisitor extends JsonFormatVisitorWrapper.Base {
        boolean visitedInt = false;
        boolean visitedFloat = false;

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            visitedInt = true;
            return new JsonIntegerFormatVisitor.Base();
        }

        @Override
        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
            visitedFloat = true;
            return new JsonNumberFormatVisitor.Base();
        }
    }

    @Test
    public void testConstructor_instantiation_success() {
        DummyNumberSerializers instance = new DummyNumberSerializers();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testAddAll_populatesAllExpectedMappings() {
        Map<String, JsonSerializer<?>> map = new HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(map);

        Assert.assertTrue(map.containsKey(Integer.class.getName()));
        Assert.assertTrue(map.containsKey(Integer.TYPE.getName()));
        Assert.assertTrue(map.containsKey(Long.class.getName()));
        Assert.assertTrue(map.containsKey(Long.TYPE.getName()));
        Assert.assertTrue(map.containsKey(Byte.class.getName()));
        Assert.assertTrue(map.containsKey(Byte.TYPE.getName()));
        Assert.assertTrue(map.containsKey(Short.class.getName()));
        Assert.assertTrue(map.containsKey(Short.TYPE.getName()));
        Assert.assertTrue(map.containsKey(Double.class.getName()));
        Assert.assertTrue(map.containsKey(Double.TYPE.getName()));
        Assert.assertTrue(map.containsKey(Float.class.getName()));
        Assert.assertTrue(map.containsKey(Float.TYPE.getName()));

        Assert.assertTrue(map.get(Integer.class.getName()) instanceof NumberSerializers.IntegerSerializer);
        Assert.assertTrue(map.get(Long.class.getName()) instanceof NumberSerializers.LongSerializer);
        Assert.assertTrue(map.get(Byte.class.getName()) instanceof NumberSerializers.IntLikeSerializer);
        Assert.assertTrue(map.get(Short.class.getName()) instanceof NumberSerializers.ShortSerializer);
        Assert.assertTrue(map.get(Double.class.getName()) instanceof NumberSerializers.DoubleSerializer);
        Assert.assertTrue(map.get(Float.class.getName()) instanceof NumberSerializers.FloatSerializer);
    }

    @Test
    public void testShortSerializer_serialize_success() throws IOException {
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        serializer.serialize((short) 42, gen, provider);
        serializer.serialize(Short.MIN_VALUE, gen, provider);
        serializer.serialize(Short.MAX_VALUE, gen, provider);
        serializer.serialize((short) 0, gen, provider);
        serializer.serialize((short) -1, gen, provider);
        gen.flush();

        Assert.assertEquals("42-32768327670-1", sw.toString());
    }

    @Test
    public void testIntegerSerializer_serialize_success() throws IOException {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer(Integer.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        serializer.serialize(12345, gen, provider);
        serializer.serialize(Integer.MIN_VALUE, gen, provider);
        serializer.serialize(Integer.MAX_VALUE, gen, provider);
        serializer.serialize(0, gen, provider);
        serializer.serialize(-1, gen, provider);
        gen.flush();

        Assert.assertEquals("12345-214748364821474836470-1", sw.toString());
    }

    @Test
    public void testIntegerSerializer_serializeWithType_success() throws IOException {
        TypedNumberWrapper wrapper = new TypedNumberWrapper(Integer.valueOf(100));
        String json = mapper.writeValueAsString(wrapper);
        Assert.assertEquals("{\"value\":100}", json);
    }

    @Test
    public void testIntLikeSerializer_serialize_success() throws IOException {
        NumberSerializers.IntLikeSerializer serializer = NumberSerializers.IntLikeSerializer.instance;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        serializer.serialize(Byte.valueOf((byte) 5), gen, provider);
        serializer.serialize(Short.valueOf((short) 10), gen, provider);
        serializer.serialize(Integer.valueOf(15), gen, provider);
        serializer.serialize(Long.valueOf(20L), gen, provider);
        serializer.serialize(Float.valueOf(25.5f), gen, provider);
        serializer.serialize(Double.valueOf(30.9), gen, provider);
        gen.flush();

        Assert.assertEquals("51015202530", sw.toString());
    }

    @Test
    public void testLongSerializer_serialize_success() throws IOException {
        NumberSerializers.LongSerializer serializer = new NumberSerializers.LongSerializer(Long.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        serializer.serialize(9876543210L, gen, provider);
        serializer.serialize(Long.MIN_VALUE, gen, provider);
        serializer.serialize(Long.MAX_VALUE, gen, provider);
        serializer.serialize(0L, gen, provider);
        serializer.serialize(-1L, gen, provider);
        gen.flush();

        Assert.assertEquals("9876543210-922337203685477580892233720368547758070-1", sw.toString());
    }

    @Test
    public void testFloatSerializer_serialize_success() throws IOException {
        NumberSerializers.FloatSerializer serializer = NumberSerializers.FloatSerializer.instance;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        serializer.serialize(3.14f, gen, provider);
        serializer.serialize(0.0f, gen, provider);
        serializer.serialize(-1.5f, gen, provider);
        serializer.serialize(Float.MIN_VALUE, gen, provider);
        serializer.serialize(Float.MAX_VALUE, gen, provider);
        gen.flush();

        Assert.assertEquals("3.140.0-1.51.4E-453.4028235E38", sw.toString());
    }

    @Test
    public void testDoubleSerializer_serialize_success() throws IOException {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer(Double.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        serializer.serialize(3.1415926535, gen, provider);
        serializer.serialize(0.0, gen, provider);
        serializer.serialize(-2.71828, gen, provider);
        serializer.serialize(Double.MIN_VALUE, gen, provider);
        serializer.serialize(Double.MAX_VALUE, gen, provider);
        gen.flush();

        Assert.assertEquals("3.14159265350.0-2.718284.9E-3241.7976931348623157E308", sw.toString());
    }

    @Test
    public void testDoubleSerializer_serializeWithType_success() throws IOException {
        TypedNumberWrapper wrapper = new TypedNumberWrapper(Double.valueOf(99.9));
        String json = mapper.writeValueAsString(wrapper);
        Assert.assertEquals("{\"value\":99.9}", json);
    }

    @Test
    public void testBase_getSchema_returnsExpectedNodes() throws Exception {
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        NumberSerializers.IntegerSerializer intSer = new NumberSerializers.IntegerSerializer(Integer.class);
        JsonNode intSchema = intSer.getSchema(provider, null);
        Assert.assertEquals("integer", intSchema.get("type").asText());

        NumberSerializers.LongSerializer longSer = new NumberSerializers.LongSerializer(Long.class);
        JsonNode longSchema = longSer.getSchema(provider, null);
        Assert.assertEquals("number", longSchema.get("type").asText());

        NumberSerializers.ShortSerializer shortSer = new NumberSerializers.ShortSerializer();
        JsonNode shortSchema = shortSer.getSchema(provider, null);
        Assert.assertEquals("number", shortSchema.get("type").asText());

        NumberSerializers.FloatSerializer floatSer = new NumberSerializers.FloatSerializer();
        JsonNode floatSchema = floatSer.getSchema(provider, null);
        Assert.assertEquals("number", floatSchema.get("type").asText());

        NumberSerializers.DoubleSerializer doubleSer = new NumberSerializers.DoubleSerializer(Double.class);
        JsonNode doubleSchema = doubleSer.getSchema(provider, null);
        Assert.assertEquals("number", doubleSchema.get("type").asText());
    }

    @Test
    public void testBase_acceptJsonFormatVisitor_intAndFloatBranches() throws Exception {
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        JavaType intType = mapper.constructType(Integer.class);
        JavaType doubleType = mapper.constructType(Double.class);

        TestFormatVisitor intVisitor = new TestFormatVisitor();
        NumberSerializers.IntegerSerializer intSer = new NumberSerializers.IntegerSerializer(Integer.class);
        intSer.acceptJsonFormatVisitor(intVisitor, intType);
        Assert.assertTrue(intVisitor.visitedInt);
        Assert.assertFalse(intVisitor.visitedFloat);

        TestFormatVisitor floatVisitor = new TestFormatVisitor();
        NumberSerializers.DoubleSerializer doubleSer = new NumberSerializers.DoubleSerializer(Double.class);
        doubleSer.acceptJsonFormatVisitor(floatVisitor, doubleType);
        Assert.assertFalse(floatVisitor.visitedInt);
        Assert.assertTrue(floatVisitor.visitedFloat);

        TestFormatVisitor bigIntVisitor = new TestFormatVisitor();
        DummyIntBaseSerializer bigIntSer = new DummyIntBaseSerializer(JsonParser.NumberType.BIG_INTEGER);
        bigIntSer.acceptJsonFormatVisitor(bigIntVisitor, intType);
        Assert.assertTrue(bigIntVisitor.visitedInt);

        TestFormatVisitor bigDecimalVisitor = new TestFormatVisitor();
        DummyIntBaseSerializer bigDecSer = new DummyIntBaseSerializer(JsonParser.NumberType.BIG_DECIMAL);
        bigDecSer.acceptJsonFormatVisitor(bigDecimalVisitor, doubleType);
        Assert.assertTrue(bigDecimalVisitor.visitedFloat);
    }

    @Test
    public void testBase_createContextual_stringShapeOverride() throws Exception {
        String json = mapper.writeValueAsString(new StringFormattedNumbers());
        Assert.assertTrue(json.contains("\"intVal\":\"123\""));
        Assert.assertTrue(json.contains("\"longVal\":\"456\""));
        Assert.assertTrue(json.contains("\"shortVal\":\"78\""));
        Assert.assertTrue(json.contains("\"byteVal\":\"9\""));
        Assert.assertTrue(json.contains("\"doubleVal\":\"10.5\""));
        Assert.assertTrue(json.contains("\"floatVal\":\"12.25\""));
    }

    @Test
    public void testBase_createContextual_defaultAndNonStringShape() throws Exception {
        String json = mapper.writeValueAsString(new NumberFormattedNumbers());
        Assert.assertTrue(json.contains("\"intVal\":123"));
        Assert.assertTrue(json.contains("\"doubleVal\":10.5"));

        NumberSerializers.IntegerSerializer intSer = new NumberSerializers.IntegerSerializer(Integer.class);
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        JsonSerializer<?> contextualNullProp = intSer.createContextual(provider, null);
        Assert.assertSame(intSer, contextualNullProp);
    }

    @Test(expected = NullPointerException.class)
    public void testShortSerializer_nullValue_throwsException() throws IOException {
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }

    @Test(expected = NullPointerException.class)
    public void testIntegerSerializer_nullValue_throwsException() throws IOException {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer(Integer.class);
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }

    @Test(expected = NullPointerException.class)
    public void testLongSerializer_nullValue_throwsException() throws IOException {
        NumberSerializers.LongSerializer serializer = new NumberSerializers.LongSerializer(Long.class);
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }

    @Test(expected = NullPointerException.class)
    public void testFloatSerializer_nullValue_throwsException() throws IOException {
        NumberSerializers.FloatSerializer serializer = NumberSerializers.FloatSerializer.instance;
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }

    @Test(expected = NullPointerException.class)
    public void testDoubleSerializer_nullValue_throwsException() throws IOException {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer(Double.class);
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }

    @Test(expected = NullPointerException.class)
    public void testIntLikeSerializer_nullValue_throwsException() throws IOException {
        NumberSerializers.IntLikeSerializer serializer = NumberSerializers.IntLikeSerializer.instance;
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }
}
