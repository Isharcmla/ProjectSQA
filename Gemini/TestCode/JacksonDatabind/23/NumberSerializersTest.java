package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

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
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class NumberSerializersTest {

    private final ObjectMapper mapper = new ObjectMapper();
    private final JsonFactory jsonFactory = new JsonFactory();

    static class SubNumberSerializers extends NumberSerializers {
        public SubNumberSerializers() {
            super();
        }
    }

    static class CustomIntBaseSerializer extends NumberSerializers.Base<Object> {
        public CustomIntBaseSerializer(Class<?> cls, JsonParser.NumberType numberType, String schemaType) {
            super(cls, numberType, schemaType);
        }

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeNumber(((Number) value).intValue());
        }
    }

    static class FormattedBean {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public int stringInt = 123;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public double stringDouble = 45.67;

        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public int normalInt = 999;

        public long unannotatedLong = 1000L;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
    static class TypedWrapper {
        public Object value;

        public TypedWrapper(Object value) {
            this.value = value;
        }
    }

    @Test
    public void testConstructor_instantiation_success() {
        NumberSerializers ns = new SubNumberSerializers();
        Assert.assertNotNull(ns);
    }

    @Test
    public void testAddAll_populatesAllPrimitiveAndWrapperTypes() {
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
        Assert.assertTrue(map.containsKey(Float.class.getName()));
        Assert.assertTrue(map.containsKey(Float.TYPE.getName()));
        Assert.assertTrue(map.containsKey(Double.class.getName()));
        Assert.assertTrue(map.containsKey(Double.TYPE.getName()));
        Assert.assertEquals(12, map.size());
    }

    @Test
    public void testShortSerializer_serialize_validValues() throws IOException {
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProviderInstance();

        serializer.serialize((short) 0, gen, prov);
        serializer.serialize((short) -42, gen, prov);
        serializer.serialize(Short.MAX_VALUE, gen, prov);
        serializer.serialize(Short.MIN_VALUE, gen, prov);
        gen.flush();

        Assert.assertEquals("0 -42 32767 -32768", sw.toString().trim().replaceAll("\\s+", " "));
    }

    @Test
    public void testIntegerSerializer_serialize_validValues() throws IOException {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProviderInstance();

        serializer.serialize(0, gen, prov);
        serializer.serialize(-100, gen, prov);
        serializer.serialize(Integer.MAX_VALUE, gen, prov);
        serializer.serialize(Integer.MIN_VALUE, gen, prov);
        gen.flush();

        Assert.assertEquals("0 -100 2147483647 -2147483648", sw.toString().trim().replaceAll("\\s+", " "));
    }

    @Test
    public void testIntegerSerializer_serializeWithType_ignoresTypeInfo() throws IOException {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        TypeSerializer typeSer = mapper.getSerializerFactory().createTypeSerializer(
                mapper.getSerializationConfig(),
                TypeFactory.defaultInstance().constructType(Integer.class)
        );

        serializer.serializeWithType(42, gen, prov, typeSer);
        gen.flush();

        Assert.assertEquals("42", sw.toString().trim());
    }

    @Test
    public void testIntLikeSerializer_serialize_validValues() throws IOException {
        NumberSerializers.IntLikeSerializer serializer = new NumberSerializers.IntLikeSerializer();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProviderInstance();

        serializer.serialize((byte) 5, gen, prov);
        serializer.serialize((short) 10, gen, prov);
        serializer.serialize(15, gen, prov);
        serializer.serialize(new AtomicInteger(-50), gen, prov);
        gen.flush();

        Assert.assertEquals("5 10 15 -50", sw.toString().trim().replaceAll("\\s+", " "));
    }

    @Test
    public void testLongSerializer_serialize_validValues() throws IOException {
        NumberSerializers.LongSerializer serializer = new NumberSerializers.LongSerializer();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProviderInstance();

        serializer.serialize(0L, gen, prov);
        serializer.serialize(-1234567890123L, gen, prov);
        serializer.serialize(Long.MAX_VALUE, gen, prov);
        serializer.serialize(Long.MIN_VALUE, gen, prov);
        gen.flush();

        Assert.assertEquals("0 -1234567890123 9223372036854775807 -9223372036854775808", sw.toString().trim().replaceAll("\\s+", " "));
    }

    @Test
    public void testFloatSerializer_serialize_validValues() throws IOException {
        NumberSerializers.FloatSerializer serializer = new NumberSerializers.FloatSerializer();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProviderInstance();

        serializer.serialize(0.0f, gen, prov);
        serializer.serialize(-1.5f, gen, prov);
        serializer.serialize(3.14159f, gen, prov);
        gen.flush();

        Assert.assertTrue(sw.toString().contains("0.0"));
        Assert.assertTrue(sw.toString().contains("-1.5"));
        Assert.assertTrue(sw.toString().contains("3.14159"));
    }

    @Test
    public void testDoubleSerializer_serialize_validValues() throws IOException {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProviderInstance();

        serializer.serialize(0.0d, gen, prov);
        serializer.serialize(-100.25d, gen, prov);
        serializer.serialize(Double.MAX_VALUE, gen, prov);
        gen.flush();

        Assert.assertTrue(sw.toString().contains("0.0"));
        Assert.assertTrue(sw.toString().contains("-100.25"));
    }

    @Test
    public void testDoubleSerializer_serializeWithType_ignoresTypeInfo() throws IOException {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        TypeSerializer typeSer = mapper.getSerializerFactory().createTypeSerializer(
                mapper.getSerializationConfig(),
                TypeFactory.defaultInstance().constructType(Double.class)
        );

        serializer.serializeWithType(12.34d, gen, prov, typeSer);
        gen.flush();

        Assert.assertEquals("12.34", sw.toString().trim());
    }

    @Test
    public void testGetSchema_allSerializers() {
        SerializerProvider prov = mapper.getSerializerProviderInstance();

        JsonNode intSchema = new NumberSerializers.IntegerSerializer().getSchema(prov, (Type) null);
        Assert.assertEquals("integer", intSchema.get("type").asText());

        JsonNode shortSchema = new NumberSerializers.ShortSerializer().getSchema(prov, (Type) null);
        Assert.assertEquals("number", shortSchema.get("type").asText());

        JsonNode intLikeSchema = new NumberSerializers.IntLikeSerializer().getSchema(prov, (Type) null);
        Assert.assertEquals("integer", intLikeSchema.get("type").asText());

        JsonNode longSchema = new NumberSerializers.LongSerializer().getSchema(prov, (Type) null);
        Assert.assertEquals("number", longSchema.get("type").asText());

        JsonNode floatSchema = new NumberSerializers.FloatSerializer().getSchema(prov, (Type) null);
        Assert.assertEquals("number", floatSchema.get("type").asText());

        JsonNode doubleSchema = new NumberSerializers.DoubleSerializer().getSchema(prov, (Type) null);
        Assert.assertEquals("number", doubleSchema.get("type").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitor_integerTypes_nonNullVisitor() throws Exception {
        final boolean[] visited = new boolean[1];
        final JsonParser.NumberType[] assignedType = new JsonParser.NumberType[1];

        JsonIntegerFormatVisitor intVisitor = new JsonIntegerFormatVisitor.Base() {
            @Override
            public void numberType(JsonParser.NumberType type) {
                visited[0] = true;
                assignedType[0] = type;
            }
        };

        JsonFormatVisitorWrapper wrapper = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
                return intVisitor;
            }
        };

        NumberSerializers.IntegerSerializer intSer = new NumberSerializers.IntegerSerializer();
        JavaType typeHint = TypeFactory.defaultInstance().constructType(Integer.class);
        intSer.acceptJsonFormatVisitor(wrapper, typeHint);

        Assert.assertTrue(visited[0]);
        Assert.assertEquals(JsonParser.NumberType.INT, assignedType[0]);

        visited[0] = false;
        assignedType[0] = null;
        NumberSerializers.LongSerializer longSer = new NumberSerializers.LongSerializer();
        longSer.acceptJsonFormatVisitor(wrapper, TypeFactory.defaultInstance().constructType(Long.class));

        Assert.assertTrue(visited[0]);
        Assert.assertEquals(JsonParser.NumberType.LONG, assignedType[0]);

        visited[0] = false;
        assignedType[0] = null;
        CustomIntBaseSerializer bigIntSer = new CustomIntBaseSerializer(Object.class, JsonParser.NumberType.BIG_INTEGER, "integer");
        bigIntSer.acceptJsonFormatVisitor(wrapper, typeHint);

        Assert.assertTrue(visited[0]);
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, assignedType[0]);
    }

    @Test
    public void testAcceptJsonFormatVisitor_integerTypes_nullVisitor() throws Exception {
        JsonFormatVisitorWrapper wrapper = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
                return null;
            }
        };

        NumberSerializers.IntegerSerializer intSer = new NumberSerializers.IntegerSerializer();
        intSer.acceptJsonFormatVisitor(wrapper, TypeFactory.defaultInstance().constructType(Integer.class));
    }

    @Test
    public void testAcceptJsonFormatVisitor_numberTypes_nonNullVisitor() throws Exception {
        final boolean[] visited = new boolean[1];
        final JsonParser.NumberType[] assignedType = new JsonParser.NumberType[1];

        JsonNumberFormatVisitor numVisitor = new JsonNumberFormatVisitor.Base() {
            @Override
            public void numberType(JsonParser.NumberType type) {
                visited[0] = true;
                assignedType[0] = type;
            }
        };

        JsonFormatVisitorWrapper wrapper = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
                return numVisitor;
            }
        };

        NumberSerializers.FloatSerializer floatSer = new NumberSerializers.FloatSerializer();
        floatSer.acceptJsonFormatVisitor(wrapper, TypeFactory.defaultInstance().constructType(Float.class));

        Assert.assertTrue(visited[0]);
        Assert.assertEquals(JsonParser.NumberType.FLOAT, assignedType[0]);

        visited[0] = false;
        assignedType[0] = null;
        NumberSerializers.DoubleSerializer doubleSer = new NumberSerializers.DoubleSerializer();
        doubleSer.acceptJsonFormatVisitor(wrapper, TypeFactory.defaultInstance().constructType(Double.class));

        Assert.assertTrue(visited[0]);
        Assert.assertEquals(JsonParser.NumberType.DOUBLE, assignedType[0]);
    }

    @Test
    public void testAcceptJsonFormatVisitor_numberTypes_nullVisitor() throws Exception {
        JsonFormatVisitorWrapper wrapper = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
                return null;
            }
        };

        NumberSerializers.DoubleSerializer doubleSer = new NumberSerializers.DoubleSerializer();
        doubleSer.acceptJsonFormatVisitor(wrapper, TypeFactory.defaultInstance().constructType(Double.class));
    }

    @Test
    public void testCreateContextual_nullProperty_returnsSelf() throws Exception {
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        NumberSerializers.IntegerSerializer intSer = new NumberSerializers.IntegerSerializer();
        JsonSerializer<?> contextual = intSer.createContextual(prov, null);

        Assert.assertSame(intSer, contextual);
    }

    @Test
    public void testCreateContextual_propertyWithoutMember_returnsSelf() throws Exception {
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        NumberSerializers.IntegerSerializer intSer = new NumberSerializers.IntegerSerializer();
        BeanProperty.Bogus bogus = new BeanProperty.Bogus();

        JsonSerializer<?> contextual = intSer.createContextual(prov, bogus);
        Assert.assertSame(intSer, contextual);
    }

    @Test
    public void testContextualSerialization_withJsonFormatStringShape() throws Exception {
        FormattedBean bean = new FormattedBean();
        String json = mapper.writeValueAsString(bean);

        Assert.assertTrue(json.contains("\"stringInt\":\"123\""));
        Assert.assertTrue(json.contains("\"stringDouble\":\"45.67\""));
        Assert.assertTrue(json.contains("\"normalInt\":999"));
        Assert.assertTrue(json.contains("\"unannotatedLong\":1000"));
    }

    @Test
    public void testSubclassBase_isIntFlag_evaluation() {
        CustomIntBaseSerializer intBase = new CustomIntBaseSerializer(Integer.class, JsonParser.NumberType.INT, "integer");
        Assert.assertTrue(intBase._isInt);

        CustomIntBaseSerializer longBase = new CustomIntBaseSerializer(Long.class, JsonParser.NumberType.LONG, "number");
        Assert.assertTrue(longBase._isInt);

        CustomIntBaseSerializer bigIntBase = new CustomIntBaseSerializer(Object.class, JsonParser.NumberType.BIG_INTEGER, "integer");
        Assert.assertTrue(bigIntBase._isInt);

        CustomIntBaseSerializer floatBase = new CustomIntBaseSerializer(Float.class, JsonParser.NumberType.FLOAT, "number");
        Assert.assertFalse(floatBase._isInt);

        CustomIntBaseSerializer doubleBase = new CustomIntBaseSerializer(Double.class, JsonParser.NumberType.DOUBLE, "number");
        Assert.assertFalse(doubleBase._isInt);

        CustomIntBaseSerializer bigDecBase = new CustomIntBaseSerializer(Object.class, JsonParser.NumberType.BIG_DECIMAL, "number");
        Assert.assertFalse(bigDecBase._isInt);
    }

    @Test(expected = NullPointerException.class)
    public void testShortSerializer_serialize_nullValue_throwsException() throws IOException {
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }

    @Test(expected = NullPointerException.class)
    public void testIntegerSerializer_serialize_nullValue_throwsException() throws IOException {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }

    @Test(expected = NullPointerException.class)
    public void testLongSerializer_serialize_nullValue_throwsException() throws IOException {
        NumberSerializers.LongSerializer serializer = new NumberSerializers.LongSerializer();
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }

    @Test(expected = NullPointerException.class)
    public void testFloatSerializer_serialize_nullValue_throwsException() throws IOException {
        NumberSerializers.FloatSerializer serializer = new NumberSerializers.FloatSerializer();
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }

    @Test(expected = NullPointerException.class)
    public void testDoubleSerializer_serialize_nullValue_throwsException() throws IOException {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }

    @Test(expected = NullPointerException.class)
    public void testIntLikeSerializer_serialize_nullValue_throwsException() throws IOException {
        NumberSerializers.IntLikeSerializer serializer = new NumberSerializers.IntLikeSerializer();
        serializer.serialize(null, jsonFactory.createGenerator(new StringWriter()), mapper.getSerializerProviderInstance());
    }
}
