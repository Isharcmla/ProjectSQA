package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.StdConverter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;

public class StdDelegatingSerializerTest {

    private static class SimpleStringConverter extends StdConverter<String, Integer> {
        @Override
        public Integer convert(String value) {
            if (value == null || value.isEmpty()) {
                return null;
            }
            return value.length();
        }
    }

    private static class CustomSubclassDelegatingSerializer extends StdDelegatingSerializer {
        public CustomSubclassDelegatingSerializer(Converter<?, ?> converter) {
            super(converter);
        }

        public StdDelegatingSerializer callWithDelegate(Converter<Object, ?> converter,
                                                        JavaType delegateType,
                                                        JsonSerializer<?> delegateSerializer) {
            return withDelegate(converter, delegateType, delegateSerializer);
        }
    }

    private static class ResolvableAndContextualSerializer extends JsonSerializer<Object>
            implements ResolvableSerializer, ContextualSerializer, SchemaAware {
        boolean resolved = false;
        boolean contextualized = false;
        boolean visited = false;

        @Override
        public void resolve(SerializerProvider provider) {
            this.resolved = true;
        }

        @Override
        public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) {
            this.contextualized = true;
            return this;
        }

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("custom:" + value);
        }

        @Override
        public void serializeWithType(Object value, JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer) throws IOException {
            gen.writeString("typed:" + value);
        }

        @Override
        public boolean isEmpty(Object value) {
            return value == null || "empty".equals(value);
        }

        @Override
        public boolean isEmpty(SerializerProvider provider, Object value) {
            return value == null || "empty".equals(value);
        }

        @Override
        public JsonNode getSchema(SerializerProvider provider, Type typeHint) {
            ObjectNode node = JsonNodeFactory.instance.objectNode();
            node.put("type", "customSchema");
            return node;
        }

        @Override
        public JsonNode getSchema(SerializerProvider provider, Type typeHint, boolean isOptional) {
            ObjectNode node = JsonNodeFactory.instance.objectNode();
            node.put("type", "customSchemaOptional");
            node.put("optional", isOptional);
            return node;
        }

        @Override
        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) {
            this.visited = true;
        }
    }

    private static class NonSchemaAwareSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(String.valueOf(value));
        }
    }

    private static class PojoWithConverter {
        @JsonSerialize(converter = SimpleStringConverter.class)
        public String value;

        public PojoWithConverter(String value) {
            this.value = value;
        }
    }

    private SerializerProvider createSerializerProvider() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getSerializerProviderInstance();
    }

    @Test
    public void testConstructor_oneArg_initializesCorrectly() {
        SimpleStringConverter converter = new SimpleStringConverter();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(converter);

        Assert.assertSame(converter, ser.getConverter());
        Assert.assertNull(ser.getDelegatee());
        Assert.assertEquals(Object.class, ser.handledType());
    }

    @Test
    public void testConstructor_twoArgs_initializesCorrectly() {
        SimpleStringConverter converter = new SimpleStringConverter();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(String.class, converter);

        Assert.assertSame(converter, ser.getConverter());
        Assert.assertNull(ser.getDelegatee());
        Assert.assertEquals(String.class, ser.handledType());
    }

    @Test
    public void testConstructor_threeArgs_initializesCorrectly() {
        SimpleStringConverter converter = new SimpleStringConverter();
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();

        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;
        StdDelegatingSerializer ser = new StdDelegatingSerializer(objConverter, javaType, delSer);

        Assert.assertSame(converter, ser.getConverter());
        Assert.assertSame(delSer, ser.getDelegatee());
        Assert.assertEquals(Integer.class, ser.handledType());
    }

    @Test
    public void testWithDelegate_directCall_returnsNewInstance() {
        SimpleStringConverter converter = new SimpleStringConverter();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(converter);
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();

        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;
        StdDelegatingSerializer result = ser.withDelegate(objConverter, javaType, delSer);

        Assert.assertNotNull(result);
        Assert.assertSame(delSer, result.getDelegatee());
    }

    @Test(expected = IllegalStateException.class)
    public void testWithDelegate_subclassWithoutOverride_throwsException() {
        SimpleStringConverter converter = new SimpleStringConverter();
        CustomSubclassDelegatingSerializer subclassSerializer = new CustomSubclassDelegatingSerializer(converter);
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();

        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;
        subclassSerializer.callWithDelegate(objConverter, javaType, delSer);
    }

    @Test
    public void testResolve_whenDelegateIsResolvable_callsResolve() throws JsonMappingException {
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        SimpleStringConverter converter = new SimpleStringConverter();
        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;

        StdDelegatingSerializer ser = new StdDelegatingSerializer(objConverter, javaType, delSer);
        SerializerProvider provider = createSerializerProvider();

        ser.resolve(provider);
        Assert.assertTrue(delSer.resolved);
    }

    @Test
    public void testResolve_whenDelegateIsNotResolvableOrNull_doesNotThrow() throws JsonMappingException {
        SimpleStringConverter converter = new SimpleStringConverter();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(converter);
        SerializerProvider provider = createSerializerProvider();

        ser.resolve(provider);

        NonSchemaAwareSerializer nonResolvable = new NonSchemaAwareSerializer();
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;
        StdDelegatingSerializer ser2 = new StdDelegatingSerializer(objConverter, javaType, nonResolvable);
        ser2.resolve(provider);
    }

    @Test
    public void testCreateContextual_whenDelegateIsNull_locatesDelegateSerializer() throws JsonMappingException {
        SimpleStringConverter converter = new SimpleStringConverter();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(converter);
        SerializerProvider provider = createSerializerProvider();

        JsonSerializer<?> contextual = ser.createContextual(provider, null);

        Assert.assertNotNull(contextual);
        Assert.assertTrue(contextual instanceof StdDelegatingSerializer);
        StdDelegatingSerializer contextualDelegating = (StdDelegatingSerializer) contextual;
        Assert.assertNotNull(contextualDelegating.getDelegatee());
    }

    @Test
    public void testCreateContextual_whenDelegateAlreadyContextualized_returnsThisIfSame() throws JsonMappingException {
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        SimpleStringConverter converter = new SimpleStringConverter();
        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;

        StdDelegatingSerializer ser = new StdDelegatingSerializer(objConverter, javaType, delSer);
        SerializerProvider provider = createSerializerProvider();

        JsonSerializer<?> result = ser.createContextual(provider, null);
        Assert.assertSame(ser, result);
        Assert.assertTrue(delSer.contextualized);
    }

    @Test
    public void testSerialize_convertsAndDelegatesNonNull() throws IOException {
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        SimpleStringConverter converter = new SimpleStringConverter();
        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;

        StdDelegatingSerializer ser = new StdDelegatingSerializer(objConverter, javaType, delSer);

        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serialize("hello", gen, provider);
        gen.flush();

        Assert.assertEquals("\"custom:5\"", sw.toString());
    }

    @Test
    public void testSerialize_convertsNull_serializesNull() throws IOException {
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        SimpleStringConverter converter = new SimpleStringConverter();
        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;

        StdDelegatingSerializer ser = new StdDelegatingSerializer(objConverter, javaType, delSer);

        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        // empty string converts to null according to SimpleStringConverter
        ser.serialize("", gen, provider);
        gen.flush();

        Assert.assertEquals("null", sw.toString());
    }

    @Test
    public void testSerializeWithType_delegatesSuccessfully() throws IOException {
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        SimpleStringConverter converter = new SimpleStringConverter();
        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;

        StdDelegatingSerializer ser = new StdDelegatingSerializer(objConverter, javaType, delSer);

        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ser.serializeWithType("test", gen, provider, null);
        gen.flush();

        Assert.assertEquals("\"typed:4\"", sw.toString());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testIsEmpty_deprecatedMethod() {
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();
        JavaType javaType = TypeFactory.defaultInstance().constructType(String.class);

        Converter<Object, Object> identityConverter = new StdConverter<Object, Object>() {
            @Override
            public Object convert(Object value) {
                return value;
            }
        };

        StdDelegatingSerializer ser = new StdDelegatingSerializer(identityConverter, javaType, delSer);

        Assert.assertTrue(ser.isEmpty("empty"));
        Assert.assertFalse(ser.isEmpty("not-empty"));
    }

    @Test
    public void testIsEmpty_withProviderMethod() {
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();
        JavaType javaType = TypeFactory.defaultInstance().constructType(String.class);

        Converter<Object, Object> identityConverter = new StdConverter<Object, Object>() {
            @Override
            public Object convert(Object value) {
                return value;
            }
        };

        StdDelegatingSerializer ser = new StdDelegatingSerializer(identityConverter, javaType, delSer);
        SerializerProvider provider = createSerializerProvider();

        Assert.assertTrue(ser.isEmpty(provider, "empty"));
        Assert.assertFalse(ser.isEmpty(provider, "full"));
    }

    @Test
    public void testGetSchema_whenDelegateIsSchemaAware() throws JsonMappingException {
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        SimpleStringConverter converter = new SimpleStringConverter();
        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;

        StdDelegatingSerializer ser = new StdDelegatingSerializer(objConverter, javaType, delSer);
        SerializerProvider provider = createSerializerProvider();

        JsonNode schemaNode = ser.getSchema(provider, String.class);
        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("customSchema", schemaNode.get("type").asText());

        JsonNode schemaNodeOpt = ser.getSchema(provider, String.class, true);
        Assert.assertNotNull(schemaNodeOpt);
        Assert.assertEquals("customSchemaOptional", schemaNodeOpt.get("type").asText());
        Assert.assertTrue(schemaNodeOpt.get("optional").asBoolean());
    }

    @Test
    public void testGetSchema_whenDelegateIsNotSchemaAware() throws JsonMappingException {
        NonSchemaAwareSerializer delSer = new NonSchemaAwareSerializer();
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        SimpleStringConverter converter = new SimpleStringConverter();
        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;

        StdDelegatingSerializer ser = new StdDelegatingSerializer(objConverter, javaType, delSer);
        SerializerProvider provider = createSerializerProvider();

        JsonNode schemaNode = ser.getSchema(provider, String.class);
        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("string", schemaNode.get("type").asText());

        JsonNode schemaNodeOpt = ser.getSchema(provider, String.class, false);
        Assert.assertNotNull(schemaNodeOpt);
        Assert.assertEquals("string", schemaNodeOpt.get("type").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitor_callsDelegateVisitor() throws JsonMappingException {
        ResolvableAndContextualSerializer delSer = new ResolvableAndContextualSerializer();
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        SimpleStringConverter converter = new SimpleStringConverter();
        @SuppressWarnings("unchecked")
        Converter<Object, ?> objConverter = (Converter<Object, ?>) (Converter<?, ?>) converter;

        StdDelegatingSerializer ser = new StdDelegatingSerializer(objConverter, javaType, delSer);
        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base();

        ser.acceptJsonFormatVisitor(visitor, javaType);
        Assert.assertTrue(delSer.visited);
    }

    @Test
    public void testIntegration_objectMapperSerialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        PojoWithConverter pojo1 = new PojoWithConverter("Hello");
        String json1 = mapper.writeValueAsString(pojo1);
        Assert.assertEquals("{\"value\":5}", json1);

        PojoWithConverter pojo2 = new PojoWithConverter("");
        String json2 = mapper.writeValueAsString(pojo2);
        Assert.assertEquals("{\"value\":null}", json2);

        PojoWithConverter pojo3 = new PojoWithConverter(null);
        String json3 = mapper.writeValueAsString(pojo3);
        Assert.assertEquals("{\"value\":null}", json3);
    }
}
