package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Set;

public class JsonValueSerializerTest {

    // --- Helper Dummy Classes for Testing ---

    static class StringValueBean {
        private final String value;
        public StringValueBean(String value) { this.value = value; }
        @JsonValue
        public String getValue() { return value; }
    }

    static class PrimitiveIntBean {
        private final int value;
        public PrimitiveIntBean(int value) { this.value = value; }
        @JsonValue
        public int getVal() { return value; }
    }

    static class PrimitiveBooleanBean {
        @JsonValue
        public boolean isTrue() { return true; }
    }

    static class PrimitiveDoubleBean {
        @JsonValue
        public double getDouble() { return 3.14; }
    }

    static class PrimitiveLongBean {
        @JsonValue
        public long getLong() { return 100L; }
    }

    static class PrimitiveFloatBean {
        @JsonValue
        public float getFloat() { return 1.5f; }
    }

    static class ObjectIntegerBean {
        @JsonValue
        public Integer getInt() { return 10; }
    }

    static class ObjectBooleanBean {
        @JsonValue
        public Boolean getBool() { return Boolean.TRUE; }
    }

    static class ObjectDoubleBean {
        @JsonValue
        public Double getD() { return 2.5; }
    }

    static class NonFinalTypeBean {
        private final Object val;
        public NonFinalTypeBean(Object val) { this.val = val; }
        @JsonValue
        public Object getVal() { return val; }
    }

    static class ExceptionBean {
        @JsonValue
        public String fail() {
            throw new IllegalStateException("Intentional accessor exception");
        }
    }

    static class ErrorBean {
        @JsonValue
        public String fatal() {
            throw new StackOverflowError("Intentional accessor error");
        }
    }

    enum SimpleEnum {
        FIRST, SECOND;
        @JsonValue
        public String toVal() {
            return name().toLowerCase();
        }
    }

    enum ErrorEnum {
        BAD;
        @JsonValue
        public String toVal() {
            throw new IllegalStateException("Enum failure");
        }
    }

    enum FatalEnum {
        FATAL;
        @JsonValue
        public String toVal() {
            throw new OutOfMemoryError("Enum fatal error");
        }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
    static class PolymorphicBean {
        @JsonValue
        public String getVal() { return "poly-val"; }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
    static class PolymorphicNullBean {
        @JsonValue
        public String getVal() { return null; }
    }

    static class CustomSchemaAwareSerializer extends JsonSerializer<Object> implements SchemaAware {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(String.valueOf(value));
        }

        @Override
        public JsonNode getSchema(SerializerProvider provider, Type typeHint) {
            ObjectNode node = JsonNodeFactory.instance.objectNode();
            node.put("type", "custom-schema");
            return node;
        }
    }

    static class CustomNonSchemaSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(String.valueOf(value));
        }
    }

    // --- Helper Methods ---

    private AnnotatedMethod extractJsonValueMethod(ObjectMapper mapper, Class<?> cls) {
        JavaType type = mapper.constructType(cls);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        return beanDesc.findJsonValueMethod();
    }

    private SerializerProvider getSerializerProvider(ObjectMapper mapper) {
        return mapper.getSerializerProviderInstance();
    }

    // --- Tests ---

    @Test
    public void testConstructorAndToString() {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, StringValueBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        String desc = ser.toString();
        Assert.assertNotNull(desc);
        Assert.assertTrue(desc.contains("@JsonValue serializer for method"));
        Assert.assertTrue(desc.contains(StringValueBean.class.getName()));
        Assert.assertTrue(desc.contains("getValue"));
    }

    @Test
    public void testWithResolved_sameInstance() {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, StringValueBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        JsonValueSerializer same = ser.withResolved(null, null, true);
        Assert.assertSame(ser, same);
    }

    @Test
    public void testWithResolved_newInstance() {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, StringValueBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        JsonSerializer<Object> dummySer = new CustomNonSchemaSerializer();
        JsonValueSerializer modified = ser.withResolved(null, dummySer, false);

        Assert.assertNotSame(ser, modified);
    }

    @Test
    public void testCreateContextual_finalTypeWithoutStaticTyping() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, StringValueBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        SerializerProvider provider = getSerializerProvider(mapper);
        JsonSerializer<?> contextual = ser.createContextual(provider, null);

        Assert.assertNotNull(contextual);
        Assert.assertNotSame(ser, contextual);
    }

    @Test
    public void testCreateContextual_nonFinalTypeWithoutStaticTyping_returnsSelf() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, NonFinalTypeBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        SerializerProvider provider = getSerializerProvider(mapper);
        JsonSerializer<?> contextual = ser.createContextual(provider, null);

        Assert.assertSame(ser, contextual);
    }

    @Test
    public void testCreateContextual_nonFinalTypeWithStaticTyping_resolves() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.USE_STATIC_TYPING);
        AnnotatedMethod method = extractJsonValueMethod(mapper, NonFinalTypeBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        SerializerProvider provider = getSerializerProvider(mapper);
        JsonSerializer<?> contextual = ser.createContextual(provider, null);

        Assert.assertNotNull(contextual);
        Assert.assertNotSame(ser, contextual);
    }

    @Test
    public void testCreateContextual_withPreexistingSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, StringValueBean.class);
        JsonSerializer<Object> existingSer = new CustomNonSchemaSerializer();
        JsonValueSerializer ser = new JsonValueSerializer(method, existingSer);

        SerializerProvider provider = getSerializerProvider(mapper);
        JsonSerializer<?> contextual = ser.createContextual(provider, null);

        Assert.assertNotNull(contextual);
    }

    @Test
    public void testSerialize_normalValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new StringValueBean("test-string"));
        Assert.assertEquals("\"test-string\"", json);
    }

    @Test
    public void testSerialize_nullValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new StringValueBean(null));
        Assert.assertEquals("null", json);
    }

    @Test
    public void testSerialize_nullSerializerLazyLookup() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, NonFinalTypeBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = getSerializerProvider(mapper);

        ser.serialize(new NonFinalTypeBean("lazy"), gen, provider);
        gen.flush();
        Assert.assertEquals("\"lazy\"", sw.toString());
    }

    @Test
    public void testSerialize_exceptionHandling_wrapped() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValueAsString(new ExceptionBean());
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Intentional accessor exception"));
            Assert.assertTrue(e.getPath().size() > 0);
            Assert.assertEquals("fail()", e.getPath().get(0).getFieldName());
        }
    }

    @Test(expected = StackOverflowError.class)
    public void testSerialize_errorHandling_rethrowsError() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValueAsString(new ErrorBean());
    }

    @Test
    public void testSerializeWithType_normal() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        PolymorphicBean bean = new PolymorphicBean();
        String json = mapper.writeValueAsString(bean);
        Assert.assertNotNull(json);
        Assert.assertTrue(json.contains("poly-val"));
    }

    @Test
    public void testSerializeWithType_nullValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        PolymorphicNullBean bean = new PolymorphicNullBean();
        String json = mapper.writeValueAsString(bean);
        Assert.assertEquals("null", json);
    }

    @Test
    public void testSerializeWithType_forceTypeInformation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, StringValueBean.class);
        JsonSerializer<Object> strSer = mapper.getSerializerProviderInstance().findValueSerializer(String.class);

        JsonValueSerializer ser = new JsonValueSerializer(new JsonValueSerializer(method, null), null, strSer, true);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        TypeSerializer typeSer = prov.findTypeSerializer(mapper.constructType(StringValueBean.class));

        if (typeSer != null) {
            ser.serializeWithType(new StringValueBean("scalar"), gen, prov, typeSer);
            gen.flush();
            Assert.assertFalse(sw.toString().isEmpty());
        }
    }

    @Test
    public void testSerializeWithType_exceptionHandling() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, ExceptionBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        SerializerProvider prov = getSerializerProvider(mapper);
        TypeSerializer typeSer = prov.findTypeSerializer(mapper.constructType(ExceptionBean.class));

        try {
            ser.serializeWithType(new ExceptionBean(), mapper.getFactory().createGenerator(new StringWriter()), prov, typeSer);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Intentional accessor exception"));
        }
    }

    @Test(expected = StackOverflowError.class)
    public void testSerializeWithType_errorHandling() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, ErrorBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        SerializerProvider prov = getSerializerProvider(mapper);
        TypeSerializer typeSer = prov.findTypeSerializer(mapper.constructType(ErrorBean.class));

        ser.serializeWithType(new ErrorBean(), mapper.getFactory().createGenerator(new StringWriter()), prov, typeSer);
    }

    @Test
    public void testGetSchema_withSchemaAwareSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, StringValueBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, new CustomSchemaAwareSerializer());

        JsonNode schema = ser.getSchema(getSerializerProvider(mapper), null);
        Assert.assertNotNull(schema);
        Assert.assertEquals("custom-schema", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_withNonSchemaAwareSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, StringValueBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, new CustomNonSchemaSerializer());

        JsonNode schema = ser.getSchema(getSerializerProvider(mapper), null);
        Assert.assertEquals(JsonSchema.getDefaultSchemaNode(), schema);
    }

    @Test
    public void testAcceptJsonFormatVisitor_forEnum() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, SimpleEnum.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        final boolean[] stringVisitorCalled = new boolean[]{false};
        final Set<String>[] recordedEnums = new Set[1];

        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base(getSerializerProvider(mapper)) {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) {
                stringVisitorCalled[0] = true;
                return new JsonStringFormatVisitor.Base() {
                    @Override
                    public void enumTypes(Set<String> enums) {
                        recordedEnums[0] = enums;
                    }
                };
            }
        };

        ser.acceptJsonFormatVisitor(visitor, mapper.constructType(SimpleEnum.class));
        Assert.assertTrue(stringVisitorCalled[0]);
        Assert.assertNotNull(recordedEnums[0]);
        Assert.assertTrue(recordedEnums[0].contains("first"));
        Assert.assertTrue(recordedEnums[0].contains("second"));
    }

    @Test
    public void testAcceptJsonFormatVisitor_forEnum_visitorReturnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, SimpleEnum.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base(getSerializerProvider(mapper)) {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) {
                return null;
            }
        };

        ser.acceptJsonFormatVisitor(visitor, mapper.constructType(SimpleEnum.class));
    }

    @Test
    public void testAcceptJsonFormatVisitor_forEnum_throwsException() {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, ErrorEnum.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base(getSerializerProvider(mapper)) {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) {
                return new JsonStringFormatVisitor.Base();
            }
        };

        try {
            ser.acceptJsonFormatVisitor(visitor, mapper.constructType(ErrorEnum.class));
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Enum failure"));
        }
    }

    @Test(expected = OutOfMemoryError.class)
    public void testAcceptJsonFormatVisitor_forEnum_throwsError() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, FatalEnum.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base(getSerializerProvider(mapper)) {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) {
                return new JsonStringFormatVisitor.Base();
            }
        };

        ser.acceptJsonFormatVisitor(visitor, mapper.constructType(FatalEnum.class));
    }

    @Test
    public void testAcceptJsonFormatVisitor_nonEnum() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedMethod method = extractJsonValueMethod(mapper, StringValueBean.class);
        JsonValueSerializer ser = new JsonValueSerializer(method, null);

        final boolean[] stringVisitorCalled = new boolean[]{false};
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base(getSerializerProvider(mapper)) {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) {
                stringVisitorCalled[0] = true;
                return new JsonStringFormatVisitor.Base();
            }
        };

        ser.acceptJsonFormatVisitor(visitor, mapper.constructType(StringValueBean.class));
        Assert.assertTrue(stringVisitorCalled[0]);
    }

    @Test
    public void testIsNaturalTypeWithStdHandling_allBranches() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = getSerializerProvider(mapper);

        // Primitive types: int, boolean, double vs float, long
        Class<?>[] truePrimitiveClasses = {PrimitiveIntBean.class, PrimitiveBooleanBean.class, PrimitiveDoubleBean.class};
        for (Class<?> cls : truePrimitiveClasses) {
            AnnotatedMethod m = extractJsonValueMethod(mapper, cls);
            JsonValueSerializer ser = new JsonValueSerializer(m, null);
            ser = (JsonValueSerializer) ser.createContextual(prov, null);
            Assert.assertTrue("Expected forceTypeInformation=true for " + cls.getSimpleName(), ser._forceTypeInformation);
        }

        Class<?>[] falsePrimitiveClasses = {PrimitiveFloatBean.class, PrimitiveLongBean.class};
        for (Class<?> cls : falsePrimitiveClasses) {
            AnnotatedMethod m = extractJsonValueMethod(mapper, cls);
            JsonValueSerializer ser = new JsonValueSerializer(m, null);
            ser = (JsonValueSerializer) ser.createContextual(prov, null);
            Assert.assertFalse("Expected forceTypeInformation=false for " + cls.getSimpleName(), ser._forceTypeInformation);
        }

        // Object wrappers: String, Integer, Boolean, Double vs others
        Class<?>[] trueObjectClasses = {StringValueBean.class, ObjectIntegerBean.class, ObjectBooleanBean.class, ObjectDoubleBean.class};
        for (Class<?> cls : trueObjectClasses) {
            AnnotatedMethod m = extractJsonValueMethod(mapper, cls);
            JsonValueSerializer ser = new JsonValueSerializer(m, null);
            ser = (JsonValueSerializer) ser.createContextual(prov, null);
            Assert.assertTrue("Expected forceTypeInformation=true for " + cls.getSimpleName(), ser._forceTypeInformation);
        }

        // Non-natural object type
        AnnotatedMethod mObj = extractJsonValueMethod(mapper, NonFinalTypeBean.class);
        JsonValueSerializer serObj = new JsonValueSerializer(mObj, null);
        Assert.assertFalse(serObj.isNaturalTypeWithStdHandling(Object.class, new CustomNonSchemaSerializer()));
    }
}
