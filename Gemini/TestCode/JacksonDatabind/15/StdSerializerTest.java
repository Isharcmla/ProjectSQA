package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.StdConverter;

public class StdSerializerTest {

    private ObjectMapper mapper;
    private SerializerProvider defaultProvider;

    @JacksonStdImpl
    static class StdAnnotatedSerializer extends StdSerializer<Object> {
        private static final long serialVersionUID = 1L;

        public StdAnnotatedSerializer() {
            super(Object.class);
        }

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        }
    }

    static class ConcreteStdSerializer<T> extends StdSerializer<T> {
        private static final long serialVersionUID = 1L;

        public ConcreteStdSerializer(Class<T> t) {
            super(t);
        }

        public ConcreteStdSerializer(JavaType type) {
            super(type);
        }

        public ConcreteStdSerializer(Class<?> t, boolean dummy) {
            super(t, dummy);
        }

        @Override
        public void serialize(T value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        }

        @Override
        public ObjectNode createObjectNode() {
            return super.createObjectNode();
        }

        @Override
        public ObjectNode createSchemaNode(String type) {
            return super.createSchemaNode(type);
        }

        @Override
        public ObjectNode createSchemaNode(String type, boolean isOptional) {
            return super.createSchemaNode(type, isOptional);
        }

        @Override
        public boolean isDefaultSerializer(JsonSerializer<?> serializer) {
            return super.isDefaultSerializer(serializer);
        }

        @Override
        public JsonSerializer<?> findConvertingContentSerializer(SerializerProvider provider,
                BeanProperty prop, JsonSerializer<?> existingSerializer) throws JsonMappingException {
            return super.findConvertingContentSerializer(provider, prop, existingSerializer);
        }

        @Override
        public PropertyFilter findPropertyFilter(SerializerProvider provider,
                Object filterId, Object valueToFilter) throws JsonMappingException {
            return super.findPropertyFilter(provider, filterId, valueToFilter);
        }
    }

    static class DummyFormatVisitor extends JsonFormatVisitorWrapper.Base {
        public JavaType visitedType;

        @Override
        public JsonAnyFormatVisitor expectAnyFormat(JavaType type) throws JsonMappingException {
            this.visitedType = type;
            return null;
        }
    }

    static class StringToLengthConverter extends StdConverter<String, Integer> {
        @Override
        public Integer convert(String value) {
            return value == null ? 0 : value.length();
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface CustomContentConverter {
        Class<? extends Converter<?, ?>> value();
    }

    static class CustomAnnotationIntrospector extends JacksonAnnotationIntrospector {
        private static final long serialVersionUID = 1L;

        @Override
        public Object findSerializationContentConverter(AnnotatedMember a) {
            CustomContentConverter ann = a.getAnnotation(CustomContentConverter.class);
            if (ann != null) {
                return ann.value();
            }
            return super.findSerializationContentConverter(a);
        }
    }

    static class DummyBean {
        @CustomContentConverter(StringToLengthConverter.class)
        public String convertedField;

        public String normalField;
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        defaultProvider = mapper.getSerializerProviderInstance();
    }

    @Test
    public void testConstructor_withClass_setsHandledType() {
        ConcreteStdSerializer<String> serializer = new ConcreteStdSerializer<String>(String.class);
        Assert.assertEquals(String.class, serializer.handledType());
    }

    @Test
    public void testConstructor_withJavaType_setsHandledType() {
        JavaType javaType = TypeFactory.defaultInstance().constructType(Integer.class);
        ConcreteStdSerializer<Integer> serializer = new ConcreteStdSerializer<Integer>(javaType);
        Assert.assertEquals(Integer.class, serializer.handledType());
    }

    @Test
    public void testConstructor_withClassAndDummyFlag_setsHandledType() {
        ConcreteStdSerializer<Long> serializer = new ConcreteStdSerializer<Long>(Long.class, true);
        Assert.assertEquals(Long.class, serializer.handledType());
    }

    @Test
    public void testGetSchema_twoParams_returnsStringSchema() throws Exception {
        ConcreteStdSerializer<String> serializer = new ConcreteStdSerializer<String>(String.class);
        JsonNode schema = serializer.getSchema(defaultProvider, String.class);

        Assert.assertNotNull(schema);
        Assert.assertTrue(schema.isObject());
        Assert.assertEquals("string", schema.get("type").asText());
        Assert.assertNull(schema.get("required"));
    }

    @Test
    public void testGetSchema_threeParams_optionalTrue_requiredNotSet() throws Exception {
        ConcreteStdSerializer<String> serializer = new ConcreteStdSerializer<String>(String.class);
        JsonNode schema = serializer.getSchema(defaultProvider, String.class, true);

        Assert.assertNotNull(schema);
        Assert.assertEquals("string", schema.get("type").asText());
        Assert.assertNull(schema.get("required"));
    }

    @Test
    public void testGetSchema_threeParams_optionalFalse_requiredSetToTrue() throws Exception {
        ConcreteStdSerializer<String> serializer = new ConcreteStdSerializer<String>(String.class);
        JsonNode schema = serializer.getSchema(defaultProvider, String.class, false);

        Assert.assertNotNull(schema);
        Assert.assertEquals("string", schema.get("type").asText());
        Assert.assertNotNull(schema.get("required"));
        Assert.assertTrue(schema.get("required").asBoolean());
    }

    @Test
    public void testCreateObjectNode_returnsEmptyObjectNode() {
        ConcreteStdSerializer<String> serializer = new ConcreteStdSerializer<String>(String.class);
        ObjectNode node = serializer.createObjectNode();

        Assert.assertNotNull(node);
        Assert.assertEquals(0, node.size());
    }

    @Test
    public void testCreateSchemaNode_typeOnly_returnsNodeWithType() {
        ConcreteStdSerializer<String> serializer = new ConcreteStdSerializer<String>(String.class);
        ObjectNode node = serializer.createSchemaNode("integer");

        Assert.assertNotNull(node);
        Assert.assertEquals("integer", node.get("type").asText());
        Assert.assertNull(node.get("required"));
    }

    @Test
    public void testCreateSchemaNode_withOptionalFlag() {
        ConcreteStdSerializer<String> serializer = new ConcreteStdSerializer<String>(String.class);

        ObjectNode optionalNode = serializer.createSchemaNode("boolean", true);
        Assert.assertEquals("boolean", optionalNode.get("type").asText());
        Assert.assertNull(optionalNode.get("required"));

        ObjectNode requiredNode = serializer.createSchemaNode("boolean", false);
        Assert.assertEquals("boolean", requiredNode.get("type").asText());
        Assert.assertNotNull(requiredNode.get("required"));
        Assert.assertTrue(requiredNode.get("required").asBoolean());
    }

    @Test
    public void testAcceptJsonFormatVisitor_callsExpectAnyFormat() throws Exception {
        ConcreteStdSerializer<String> serializer = new ConcreteStdSerializer<String>(String.class);
        DummyFormatVisitor visitor = new DummyFormatVisitor();
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);

        serializer.acceptJsonFormatVisitor(visitor, type);

        Assert.assertSame(type, visitor.visitedType);
    }

    @Test
    public void testWrapAndThrow_withFieldName_unwrapsInvocationTargetException() throws Exception {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        NullPointerException npe = new NullPointerException("nested");
        InvocationTargetException ite2 = new InvocationTargetException(npe);
        InvocationTargetException ite1 = new InvocationTargetException(ite2);

        try {
            serializer.wrapAndThrow(defaultProvider, ite1, "myBean", "myField");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertSame(npe, e.getCause());
            Assert.assertTrue(e.getPathReference().contains("myField"));
        }
    }

    @Test(expected = OutOfMemoryError.class)
    public void testWrapAndThrow_withFieldName_throwsErrorDirectly() throws Exception {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        Error error = new OutOfMemoryError("OOM");
        serializer.wrapAndThrow(defaultProvider, error, "myBean", "myField");
    }

    @Test
    public void testWrapAndThrow_withFieldName_plainIOException_wrapDisabled() {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        ObjectMapper noWrapMapper = new ObjectMapper();
        noWrapMapper.disable(SerializationFeature.WRAP_EXCEPTIONS);
        SerializerProvider provider = noWrapMapper.getSerializerProviderInstance();

        IOException originalIoException = new IOException("IO issue");
        try {
            serializer.wrapAndThrow(provider, originalIoException, "myBean", "myField");
            Assert.fail("Expected plain IOException");
        } catch (IOException e) {
            Assert.assertSame(originalIoException, e);
        }
    }

    @Test
    public void testWrapAndThrow_withFieldName_plainIOException_wrapEnabled() throws Exception {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        IOException originalIoException = new IOException("IO issue");

        try {
            serializer.wrapAndThrow(defaultProvider, originalIoException, "myBean", "myField");
            Assert.fail("Expected IOException to be rethrown directly");
        } catch (IOException e) {
            Assert.assertSame(originalIoException, e);
        }
    }

    @Test
    public void testWrapAndThrow_withFieldName_jsonMappingException_wrapEnabled() {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        JsonMappingException jme = new JsonMappingException("Mapping failed");

        try {
            serializer.wrapAndThrow(defaultProvider, jme, "myBean", "myField");
            Assert.fail("Expected JsonMappingException");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof JsonMappingException);
            Assert.assertTrue(((JsonMappingException) e).getPathReference().contains("myField"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapAndThrow_withFieldName_runtimeException_wrapDisabled() throws Exception {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        ObjectMapper noWrapMapper = new ObjectMapper();
        noWrapMapper.disable(SerializationFeature.WRAP_EXCEPTIONS);
        SerializerProvider provider = noWrapMapper.getSerializerProviderInstance();

        serializer.wrapAndThrow(provider, new IllegalArgumentException("Invalid arg"), "myBean", "myField");
    }

    @Test
    public void testWrapAndThrow_withFieldName_nullProvider_defaultsWrapToTrue() {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        RuntimeException re = new RuntimeException("runtime err");

        try {
            serializer.wrapAndThrow(null, re, "myBean", "myField");
            Assert.fail("Expected JsonMappingException");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof JsonMappingException);
            Assert.assertSame(re, e.getCause());
        }
    }

    @Test
    public void testWrapAndThrow_withIndex_unwrapsInvocationTargetException() throws Exception {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        NullPointerException npe = new NullPointerException("nested");
        InvocationTargetException ite = new InvocationTargetException(npe);

        try {
            serializer.wrapAndThrow(defaultProvider, ite, "myBean", 2);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertSame(npe, e.getCause());
            Assert.assertTrue(e.getPathReference().contains("[2]"));
        }
    }

    @Test(expected = AssertionError.class)
    public void testWrapAndThrow_withIndex_throwsErrorDirectly() throws Exception {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        serializer.wrapAndThrow(defaultProvider, new AssertionError("assert"), "myBean", 0);
    }

    @Test
    public void testWrapAndThrow_withIndex_plainIOException_wrapDisabled() {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        ObjectMapper noWrapMapper = new ObjectMapper();
        noWrapMapper.disable(SerializationFeature.WRAP_EXCEPTIONS);
        SerializerProvider provider = noWrapMapper.getSerializerProviderInstance();

        IOException originalIoException = new IOException("IO error");
        try {
            serializer.wrapAndThrow(provider, originalIoException, "myBean", 1);
            Assert.fail("Expected plain IOException");
        } catch (IOException e) {
            Assert.assertSame(originalIoException, e);
        }
    }

    @Test
    public void testWrapAndThrow_withIndex_plainIOException_wrapEnabled() throws Exception {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        IOException originalIoException = new IOException("IO error");

        try {
            serializer.wrapAndThrow(defaultProvider, originalIoException, "myBean", 1);
            Assert.fail("Expected plain IOException");
        } catch (IOException e) {
            Assert.assertSame(originalIoException, e);
        }
    }

    @Test
    public void testWrapAndThrow_withIndex_jsonMappingException_wrapEnabled() {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        JsonMappingException jme = new JsonMappingException("Mapping failed");

        try {
            serializer.wrapAndThrow(defaultProvider, jme, "myBean", 5);
            Assert.fail("Expected JsonMappingException");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof JsonMappingException);
            Assert.assertTrue(((JsonMappingException) e).getPathReference().contains("[5]"));
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testWrapAndThrow_withIndex_runtimeException_wrapDisabled() throws Exception {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        ObjectMapper noWrapMapper = new ObjectMapper();
        noWrapMapper.disable(SerializationFeature.WRAP_EXCEPTIONS);
        SerializerProvider provider = noWrapMapper.getSerializerProviderInstance();

        serializer.wrapAndThrow(provider, new IllegalStateException("State err"), "myBean", 3);
    }

    @Test
    public void testWrapAndThrow_withIndex_nullProvider_defaultsWrapToTrue() {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        RuntimeException re = new RuntimeException("runtime err");

        try {
            serializer.wrapAndThrow(null, re, "myBean", 0);
            Assert.fail("Expected JsonMappingException");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof JsonMappingException);
            Assert.assertSame(re, e.getCause());
        }
    }

    @Test
    public void testIsDefaultSerializer_withAndWithoutAnnotation() {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        StdAnnotatedSerializer defaultSerializer = new StdAnnotatedSerializer();

        Assert.assertTrue(serializer.isDefaultSerializer(defaultSerializer));
        Assert.assertFalse(serializer.isDefaultSerializer(serializer));
    }

    @Test
    public void testFindConvertingContentSerializer_nullIntrospectorOrProp() throws Exception {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        JsonSerializer<Object> existing = new ConcreteStdSerializer<Object>(Object.class);

        JsonSerializer<?> result1 = serializer.findConvertingContentSerializer(defaultProvider, null, existing);
        Assert.assertSame(existing, result1);

        ObjectMapper noIntrospectorMapper = new ObjectMapper();
        SerializationConfig config = noIntrospectorMapper.getSerializationConfig().with((AnnotationIntrospector) null);
        SerializerProvider providerNoIntr = noIntrospectorMapper.getSerializerProviderInstance();
        providerNoIntr = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider) providerNoIntr).createInstance(config, noIntrospectorMapper.getSerializerFactory());

        BeanProperty.Std prop = new BeanProperty.Std(PropertyName.construct("test"),
                TypeFactory.defaultInstance().constructType(String.class), null, null, null, null);
        JsonSerializer<?> result2 = serializer.findConvertingContentSerializer(providerNoIntr, prop, existing);
        Assert.assertSame(existing, result2);
    }

    @Test
    public void testFindConvertingContentSerializer_withConverterOnProperty() throws Exception {
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.setAnnotationIntrospector(new CustomAnnotationIntrospector());
        SerializerProvider provider = customMapper.getSerializerProviderInstance();

        JavaType beanType = TypeFactory.defaultInstance().constructType(DummyBean.class);
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(DummyBean.class, customMapper.getDeserializationConfig());
        
        AnnotatedMember convertedMember = null;
        AnnotatedMember normalMember = null;
        for (AnnotatedMember m : ac.fields()) {
            if ("convertedField".equals(m.getName())) {
                convertedMember = m;
            } else if ("normalField".equals(m.getName())) {
                normalMember = m;
            }
        }

        Assert.assertNotNull(convertedMember);
        Assert.assertNotNull(normalMember);

        BeanProperty.Std propWithConv = new BeanProperty.Std(PropertyName.construct("convertedField"),
                TypeFactory.defaultInstance().constructType(String.class), null, null, convertedMember, null);

        BeanProperty.Std propWithoutConv = new BeanProperty.Std(PropertyName.construct("normalField"),
                TypeFactory.defaultInstance().constructType(String.class), null, null, normalMember, null);

        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);

        JsonSerializer<?> resultNoConv = serializer.findConvertingContentSerializer(provider, propWithoutConv, null);
        Assert.assertNull(resultNoConv);

        JsonSerializer<?> resultWithConv = serializer.findConvertingContentSerializer(provider, propWithConv, null);
        Assert.assertNotNull(resultWithConv);
        Assert.assertTrue(resultWithConv instanceof StdDelegatingSerializer);

        JsonSerializer<Object> existing = new ConcreteStdSerializer<Object>(Integer.class);
        JsonSerializer<?> resultWithConvAndExisting = serializer.findConvertingContentSerializer(provider, propWithConv, existing);
        Assert.assertNotNull(resultWithConvAndExisting);
        Assert.assertTrue(resultWithConvAndExisting instanceof StdDelegatingSerializer);
    }

    @Test
    public void testFindPropertyFilter_whenFiltersNull_throwsJsonMappingException() {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);

        try {
            serializer.findPropertyFilter(defaultProvider, "filterId", "value");
            Assert.fail("Expected JsonMappingException because FilterProvider is null");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("no FilterProvider configured"));
        }
    }

    @Test
    public void testFindPropertyFilter_whenFiltersConfigured_returnsFilter() throws Exception {
        ConcreteStdSerializer<Object> serializer = new ConcreteStdSerializer<Object>(Object.class);
        PropertyFilter mockFilter = SimpleBeanPropertyFilter.serializeAll();

        SimpleFilterProvider filterProvider = new SimpleFilterProvider();
        filterProvider.addFilter("myFilter", mockFilter);

        ObjectMapper filterMapper = new ObjectMapper();
        filterMapper.setFilterProvider(filterProvider);
        SerializerProvider provider = filterMapper.getSerializerProviderInstance();

        PropertyFilter filter = serializer.findPropertyFilter(provider, "myFilter", "testValue");
        Assert.assertSame(mockFilter, filter);

        PropertyFilter unknownFilter = serializer.findPropertyFilter(provider, "unknownFilter", "testValue");
        Assert.assertNull(unknownFilter);
    }
}
