package com.fasterxml.jackson.databind.ser;

import java.io.IOException;
import java.io.StringWriter;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class DefaultSerializerProviderTest {

    private ObjectMapper _mapper;
    private DefaultSerializerProvider.Impl _provider;
    private SerializationConfig _config;
    private SerializerFactory _factory;
    private JsonFactory _jsonFactory;

    @Before
    public void setUp() {
        _mapper = new ObjectMapper();
        _config = _mapper.getSerializationConfig();
        _factory = _mapper.getSerializerFactory();
        _provider = new DefaultSerializerProvider.Impl().createInstance(_config, _factory);
        _jsonFactory = new JsonFactory();
    }

    // --- Helper classes for tests ---

    public static class CustomTestSerializer extends JsonSerializer<String> {
        @Override
        public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("custom:" + value);
        }
    }

    public static class DummyBean {
        public String name = "test";
    }

    public static class EmptyBean {
    }

    public static class FaultyBean {
    }

    public static class FaultySerializer extends JsonSerializer<FaultyBean> {
        @Override
        public void serialize(FaultyBean value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            throw new RuntimeException("Serializer error");
        }
    }

    public static class FaultyNoMsgSerializer extends JsonSerializer<FaultyBean> {
        @Override
        public void serialize(FaultyBean value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            throw new RuntimeException((String) null);
        }
    }

    public static class FaultyIOSerializer extends JsonSerializer<FaultyBean> {
        @Override
        public void serialize(FaultyBean value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            throw new IOException("Custom IO Error");
        }
    }

    public static class CustomDefaultProvider extends DefaultSerializerProvider {
        private static final long serialVersionUID = 1L;

        public CustomDefaultProvider() {
            super();
        }

        public CustomDefaultProvider(CustomDefaultProvider src) {
            super(src);
        }

        public CustomDefaultProvider(SerializerProvider src, SerializationConfig config, SerializerFactory f) {
            super(src, config, f);
        }

        @Override
        public DefaultSerializerProvider createInstance(SerializationConfig config, SerializerFactory jsf) {
            return new CustomDefaultProvider(this, config, jsf);
        }
    }

    public static class FilterThrowsOnEquals {
        @Override
        public boolean equals(Object obj) {
            throw new RuntimeException("Filter equals error");
        }

        @Override
        public int hashCode() {
            return 1;
        }
    }

    public static class CustomIncludeFilter {
        @Override
        public boolean equals(Object obj) {
            return obj == null;
        }

        @Override
        public int hashCode() {
            return 1;
        }
    }

    // --- Constructors & Copy & Lifecycle Tests ---

    @Test
    public void testConstructorsAndCreateInstance() {
        DefaultSerializerProvider.Impl defaultImpl = new DefaultSerializerProvider.Impl();
        Assert.assertNull(defaultImpl.getGenerator());

        DefaultSerializerProvider.Impl copyImpl = new DefaultSerializerProvider.Impl(defaultImpl);
        Assert.assertNotNull(copyImpl);

        DefaultSerializerProvider copy = defaultImpl.copy();
        Assert.assertNotNull(copy);
        Assert.assertTrue(copy instanceof DefaultSerializerProvider.Impl);

        DefaultSerializerProvider created = defaultImpl.createInstance(_config, _factory);
        Assert.assertNotNull(created);
        Assert.assertSame(_config, created.getConfig());
    }

    @Test(expected = IllegalStateException.class)
    public void testCopy_customSubclassWithoutOverride_throwsIllegalStateException() {
        CustomDefaultProvider custom = new CustomDefaultProvider();
        custom.copy();
    }

    @Test(expected = IllegalStateException.class)
    public void testCopy_implAnonymousSubclass_throwsIllegalStateException() {
        DefaultSerializerProvider.Impl subImpl = new DefaultSerializerProvider.Impl() {
            private static final long serialVersionUID = 1L;
        };
        subImpl.copy();
    }

    // --- serializerInstance Tests ---

    @Test
    public void testSerializerInstance_nullSerDef_returnsNull() throws JsonMappingException {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(_config, TypeFactory.defaultInstance().constructType(String.class), null);
        JsonSerializer<Object> ser = _provider.serializerInstance(ac, null);
        Assert.assertNull(ser);
    }

    @Test
    public void testSerializerInstance_instanceOfJsonSerializer_returnsSameInstance() throws JsonMappingException {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(_config, TypeFactory.defaultInstance().constructType(String.class), null);
        CustomTestSerializer customSer = new CustomTestSerializer();
        JsonSerializer<Object> ser = _provider.serializerInstance(ac, customSer);
        Assert.assertSame(customSer, ser);
    }

    @Test
    public void testSerializerInstance_noneOrBogusClass_returnsNull() throws JsonMappingException {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(_config, TypeFactory.defaultInstance().constructType(String.class), null);

        JsonSerializer<Object> ser1 = _provider.serializerInstance(ac, JsonSerializer.None.class);
        Assert.assertNull(ser1);

        JsonSerializer<Object> ser2 = _provider.serializerInstance(ac, com.fasterxml.jackson.databind.annotation.NoClass.class);
        Assert.assertNull(ser2);

        JsonSerializer<Object> ser3 = _provider.serializerInstance(ac, Void.class);
        Assert.assertNull(ser3);
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializerInstance_notClassOrSerializer_throwsException() throws JsonMappingException {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(_config, TypeFactory.defaultInstance().constructType(String.class), null);
        _provider.serializerInstance(ac, "InvalidSerializerDefString");
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializerInstance_classNotExtendingJsonSerializer_throwsException() throws JsonMappingException {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(_config, TypeFactory.defaultInstance().constructType(String.class), null);
        _provider.serializerInstance(ac, String.class);
    }

    @Test
    public void testSerializerInstance_validSerializerClass_instantiates() throws JsonMappingException {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(_config, TypeFactory.defaultInstance().constructType(String.class), null);
        JsonSerializer<Object> ser = _provider.serializerInstance(ac, CustomTestSerializer.class);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof CustomTestSerializer);
    }

    @Test
    public void testSerializerInstance_withHandlerInstantiator() throws JsonMappingException {
        final CustomTestSerializer customSer = new CustomTestSerializer();
        HandlerInstantiator hi = new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) { return null; }
            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) { return null; }
            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) {
                if (serClass == CustomTestSerializer.class) {
                    return customSer;
                }
                return null;
            }
            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass) { return null; }
            @Override
            public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) { return null; }
        };

        SerializationConfig configWithHI = _config.withHandlerInstantiator(hi);
        DefaultSerializerProvider.Impl providerWithHI = _provider.createInstance(configWithHI, _factory);
        AnnotatedClass ac = AnnotatedClassResolver.resolve(configWithHI, TypeFactory.defaultInstance().constructType(String.class), null);

        JsonSerializer<Object> ser = providerWithHI.serializerInstance(ac, CustomTestSerializer.class);
        Assert.assertSame(customSer, ser);
    }

    // --- includeFilterInstance & includeFilterSuppressNulls Tests ---

    @Test
    public void testIncludeFilterInstance_nullClass_returnsNull() {
        Assert.assertNull(_provider.includeFilterInstance(null, null));
    }

    @Test
    public void testIncludeFilterInstance_validClass_instantiates() {
        Object filter = _provider.includeFilterInstance(null, CustomIncludeFilter.class);
        Assert.assertNotNull(filter);
        Assert.assertTrue(filter instanceof CustomIncludeFilter);
    }

    @Test
    public void testIncludeFilterInstance_withHandlerInstantiator() {
        final CustomIncludeFilter customFilter = new CustomIncludeFilter();
        HandlerInstantiator hi = new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) { return null; }
            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) { return null; }
            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) { return null; }
            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass) { return null; }
            @Override
            public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) { return null; }
            @Override
            public Object includeFilterInstance(SerializationConfig config, BeanPropertyDefinition forProperty, Class<?> filterClass) {
                if (filterClass == CustomIncludeFilter.class) {
                    return customFilter;
                }
                return null;
            }
        };

        SerializationConfig configWithHI = _config.withHandlerInstantiator(hi);
        DefaultSerializerProvider.Impl providerWithHI = _provider.createInstance(configWithHI, _factory);
        Object filter = providerWithHI.includeFilterInstance(null, CustomIncludeFilter.class);
        Assert.assertSame(customFilter, filter);
    }

    @Test
    public void testIncludeFilterSuppressNulls_nullFilter_returnsTrue() throws JsonMappingException {
        Assert.assertTrue(_provider.includeFilterSuppressNulls(null));
    }

    @Test
    public void testIncludeFilterSuppressNulls_normalFilter() throws JsonMappingException {
        Assert.assertTrue(_provider.includeFilterSuppressNulls(new CustomIncludeFilter()));
        Assert.assertFalse(_provider.includeFilterSuppressNulls("non-null-matching-string"));
    }

    @Test(expected = JsonMappingException.class)
    public void testIncludeFilterSuppressNulls_throwingFilter_throwsJsonMappingException() throws JsonMappingException {
        _provider.includeFilterSuppressNulls(new FilterThrowsOnEquals());
    }

    // --- findObjectId Tests ---

    @Test
    public void testFindObjectId_normalAndReuse() {
        ObjectIdGenerator<?> gen1 = new ObjectIdGenerators.IntSequenceGenerator();
        Object pojo1 = new DummyBean();
        Object pojo2 = new DummyBean();

        WritableObjectId oid1 = _provider.findObjectId(pojo1, gen1);
        Assert.assertNotNull(oid1);

        WritableObjectId oid1Again = _provider.findObjectId(pojo1, gen1);
        Assert.assertSame(oid1, oid1Again);

        WritableObjectId oid2 = _provider.findObjectId(pojo2, gen1);
        Assert.assertNotSame(oid1, oid2);

        ObjectIdGenerator<?> gen2 = new ObjectIdGenerators.UUIDGenerator();
        WritableObjectId oid3 = _provider.findObjectId(new DummyBean(), gen2);
        Assert.assertNotNull(oid3);
    }

    @Test
    public void testFindObjectId_useEqualityForObjectId() {
        SerializationConfig configWithEq = _config.with(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID);
        DefaultSerializerProvider.Impl providerWithEq = _provider.createInstance(configWithEq, _factory);

        ObjectIdGenerator<?> gen = new ObjectIdGenerators.IntSequenceGenerator();
        String pojo1 = new String("test_oid");
        String pojo2 = new String("test_oid");

        WritableObjectId oid1 = providerWithEq.findObjectId(pojo1, gen);
        WritableObjectId oid2 = providerWithEq.findObjectId(pojo2, gen);

        Assert.assertSame(oid1, oid2);
    }

    // --- hasSerializerFor Tests ---

    @Test
    public void testHasSerializerFor_standardClass() {
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        Assert.assertTrue(_provider.hasSerializerFor(String.class, cause));
        Assert.assertNull(cause.get());
    }

    @Test
    public void testHasSerializerFor_objectClassWithFailOnEmptyBeans() {
        SerializationConfig configFail = _config.with(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        DefaultSerializerProvider.Impl provFail = _provider.createInstance(configFail, _factory);
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        Assert.assertFalse(provFail.hasSerializerFor(Object.class, cause));
        Assert.assertNotNull(cause.get());

        SerializationConfig configNoFail = _config.without(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        DefaultSerializerProvider.Impl provNoFail = _provider.createInstance(configNoFail, _factory);
        cause.set(null);
        Assert.assertTrue(provNoFail.hasSerializerFor(Object.class, cause));
        Assert.assertNull(cause.get());
    }

    @Test
    public void testHasSerializerFor_emptyBean() {
        SerializationConfig configFail = _config.with(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        DefaultSerializerProvider.Impl prov = _provider.createInstance(configFail, _factory);

        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        boolean hasSer = prov.hasSerializerFor(EmptyBean.class, cause);
        Assert.assertFalse(hasSer);
        Assert.assertNotNull(cause.get());

        // Without cause parameter capturing
        try {
            prov.hasSerializerFor(EmptyBean.class, null);
        } catch (RuntimeException e) {
            Assert.assertNotNull(e);
        }
    }

    // --- serializeValue Tests ---

    @Test
    public void testSerializeValue_nullValue() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);

        _provider.serializeValue(gen, null);
        gen.flush();

        Assert.assertSame(gen, _provider.getGenerator());
        Assert.assertEquals("null", sw.toString());
    }

    @Test
    public void testSerializeValue_normalValue() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);

        _provider.serializeValue(gen, new DummyBean());
        gen.flush();

        Assert.assertEquals("{\"name\":\"test\"}", sw.toString());
    }

    @Test
    public void testSerializeValue_wrapRootValueFeature() throws IOException {
        SerializationConfig configWrap = _config.with(SerializationFeature.WRAP_ROOT_VALUE);
        DefaultSerializerProvider.Impl provWrap = _provider.createInstance(configWrap, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);

        provWrap.serializeValue(gen, new DummyBean());
        gen.flush();

        Assert.assertTrue(sw.toString().startsWith("{\"DummyBean\":{\"name\":\"test\"}}"));
    }

    @Test
    public void testSerializeValue_explicitRootName() throws IOException {
        SerializationConfig configRootName = _config.withRootName("CustomRoot");
        DefaultSerializerProvider.Impl provRoot = _provider.createInstance(configRootName, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);

        provRoot.serializeValue(gen, new DummyBean());
        gen.flush();

        Assert.assertEquals("{\"CustomRoot\":{\"name\":\"test\"}}", sw.toString());
    }

    @Test
    public void testSerializeValue_emptyExplicitRootName() throws IOException {
        SerializationConfig configEmptyRoot = _config.withRootName(PropertyName.construct(""));
        DefaultSerializerProvider.Impl provRoot = _provider.createInstance(configEmptyRoot, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);

        provRoot.serializeValue(gen, new DummyBean());
        gen.flush();

        Assert.assertEquals("{\"name\":\"test\"}", sw.toString());
    }

    // --- serializeValue with JavaType Tests ---

    @Test
    public void testSerializeValueWithType_nullValue() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(DummyBean.class);

        _provider.serializeValue(gen, null, type);
        gen.flush();

        Assert.assertEquals("null", sw.toString());
    }

    @Test
    public void testSerializeValueWithType_normalValue() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(DummyBean.class);

        _provider.serializeValue(gen, new DummyBean(), type);
        gen.flush();

        Assert.assertEquals("{\"name\":\"test\"}", sw.toString());
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeValueWithType_incompatibleType_throwsJsonMappingException() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);

        _provider.serializeValue(gen, new DummyBean(), type);
    }

    @Test
    public void testSerializeValueWithType_wrapRootValueFeature() throws IOException {
        SerializationConfig configWrap = _config.with(SerializationFeature.WRAP_ROOT_VALUE);
        DefaultSerializerProvider.Impl provWrap = _provider.createInstance(configWrap, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(DummyBean.class);

        provWrap.serializeValue(gen, new DummyBean(), type);
        gen.flush();

        Assert.assertTrue(sw.toString().startsWith("{\"DummyBean\":{\"name\":\"test\"}}"));
    }

    @Test
    public void testSerializeValueWithType_explicitRootName() throws IOException {
        SerializationConfig configRootName = _config.withRootName("CustomRootType");
        DefaultSerializerProvider.Impl provRoot = _provider.createInstance(configRootName, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(DummyBean.class);

        provRoot.serializeValue(gen, new DummyBean(), type);
        gen.flush();

        Assert.assertEquals("{\"CustomRootType\":{\"name\":\"test\"}}", sw.toString());
    }

    @Test
    public void testSerializeValueWithType_emptyRootName() throws IOException {
        SerializationConfig configEmptyRoot = _config.withRootName(PropertyName.construct(""));
        DefaultSerializerProvider.Impl provRoot = _provider.createInstance(configEmptyRoot, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(DummyBean.class);

        provRoot.serializeValue(gen, new DummyBean(), type);
        gen.flush();

        Assert.assertEquals("{\"name\":\"test\"}", sw.toString());
    }

    // --- serializeValue with JavaType & JsonSerializer Tests ---

    @Test
    public void testSerializeValueWithTypeAndSer_nullValue() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);

        _provider.serializeValue(gen, null, null, null);
        gen.flush();

        Assert.assertEquals("null", sw.toString());
    }

    @Test
    public void testSerializeValueWithTypeAndSer_explicitSerializer() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);

        @SuppressWarnings("unchecked")
        JsonSerializer<Object> ser = (JsonSerializer<Object>) (JsonSerializer<?>) new CustomTestSerializer();
        _provider.serializeValue(gen, "hello", type, ser);
        gen.flush();

        Assert.assertEquals("\"custom:hello\"", sw.toString());
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeValueWithTypeAndSer_incompatibleType_throwsJsonMappingException() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);

        _provider.serializeValue(gen, "hello", type, null);
    }

    @Test
    public void testSerializeValueWithTypeAndSer_wrapRootValueFeature() throws IOException {
        SerializationConfig configWrap = _config.with(SerializationFeature.WRAP_ROOT_VALUE);
        DefaultSerializerProvider.Impl provWrap = _provider.createInstance(configWrap, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);

        // rootType is null
        provWrap.serializeValue(gen, new DummyBean(), null, null);
        gen.flush();
        Assert.assertTrue(sw.toString().startsWith("{\"DummyBean\":{\"name\":\"test\"}}"));

        // rootType is non-null
        sw = new StringWriter();
        gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(DummyBean.class);
        provWrap.serializeValue(gen, new DummyBean(), type, null);
        gen.flush();
        Assert.assertTrue(sw.toString().startsWith("{\"DummyBean\":{\"name\":\"test\"}}"));
    }

    @Test
    public void testSerializeValueWithTypeAndSer_explicitRootName() throws IOException {
        SerializationConfig configRoot = _config.withRootName("ExplicitRoot");
        DefaultSerializerProvider.Impl provRoot = _provider.createInstance(configRoot, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);

        provRoot.serializeValue(gen, new DummyBean(), null, null);
        gen.flush();

        Assert.assertEquals("{\"ExplicitRoot\":{\"name\":\"test\"}}", sw.toString());
    }

    @Test
    public void testSerializeValueWithTypeAndSer_emptyRootName() throws IOException {
        SerializationConfig configRoot = _config.withRootName(PropertyName.construct(""));
        DefaultSerializerProvider.Impl provRoot = _provider.createInstance(configRoot, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);

        provRoot.serializeValue(gen, new DummyBean(), null, null);
        gen.flush();

        Assert.assertEquals("{\"name\":\"test\"}", sw.toString());
    }

    // --- serializePolymorphic Tests ---

    @Test
    public void testSerializePolymorphic_nullValue() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);

        _provider.serializePolymorphic(gen, null, null, null, null);
        gen.flush();

        Assert.assertEquals("null", sw.toString());
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializePolymorphic_incompatibleType_throwsJsonMappingException() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);

        _provider.serializePolymorphic(gen, "string_value", type, null, null);
    }

    @Test
    public void testSerializePolymorphic_withContainerType() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        TypeSerializer typeSer = _mapper.getSerializerFactory().createTypeSerializer(_config, listType);

        List<String> list = Arrays.asList("a", "b");
        _provider.serializePolymorphic(gen, list, listType, null, typeSer);
        gen.flush();

        Assert.assertEquals("[\"a\",\"b\"]", sw.toString());
    }

    @Test
    public void testSerializePolymorphic_wrapRootValueFeature() throws IOException {
        SerializationConfig configWrap = _config.with(SerializationFeature.WRAP_ROOT_VALUE);
        DefaultSerializerProvider.Impl provWrap = _provider.createInstance(configWrap, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(DummyBean.class);
        TypeSerializer typeSer = _mapper.getSerializerFactory().createTypeSerializer(configWrap, type);

        provWrap.serializePolymorphic(gen, new DummyBean(), type, null, typeSer);
        gen.flush();

        Assert.assertTrue(sw.toString().startsWith("{\"DummyBean\":{\"name\":\"test\"}}"));
    }

    @Test
    public void testSerializePolymorphic_explicitRootName() throws IOException {
        SerializationConfig configRoot = _config.withRootName("PolyRoot");
        DefaultSerializerProvider.Impl provRoot = _provider.createInstance(configRoot, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(DummyBean.class);
        TypeSerializer typeSer = _mapper.getSerializerFactory().createTypeSerializer(configRoot, type);

        provRoot.serializePolymorphic(gen, new DummyBean(), type, null, typeSer);
        gen.flush();

        Assert.assertEquals("{\"PolyRoot\":{\"name\":\"test\"}}", sw.toString());
    }

    @Test
    public void testSerializePolymorphic_emptyRootName() throws IOException {
        SerializationConfig configRoot = _config.withRootName(PropertyName.construct(""));
        DefaultSerializerProvider.Impl provRoot = _provider.createInstance(configRoot, _factory);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = _jsonFactory.createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(DummyBean.class);
        TypeSerializer typeSer = _mapper.getSerializerFactory().createTypeSerializer(configRoot, type);

        provRoot.serializePolymorphic(gen, new DummyBean(), type, null, typeSer);
        gen.flush();

        Assert.assertEquals("{\"name\":\"test\"}", sw.toString());
    }

    // --- Exception wrapping tests in serialization ---

    @Test
    public void testSerialize_runtimeExceptionWrapped() {
        StringWriter sw = new StringWriter();
        try {
            JsonGenerator gen = _jsonFactory.createGenerator(sw);
            @SuppressWarnings("unchecked")
            JsonSerializer<Object> ser = (JsonSerializer<Object>) (JsonSerializer<?>) new FaultySerializer();
            _provider.serializeValue(gen, new FaultyBean(), null, ser);
            Assert.fail("Expected JsonMappingException");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof JsonMappingException);
            Assert.assertTrue(e.getMessage().contains("Serializer error"));
        }
    }

    @Test
    public void testSerialize_runtimeExceptionWithNoMessageWrapped() {
        StringWriter sw = new StringWriter();
        try {
            JsonGenerator gen = _jsonFactory.createGenerator(sw);
            @SuppressWarnings("unchecked")
            JsonSerializer<Object> ser = (JsonSerializer<Object>) (JsonSerializer<?>) new FaultyNoMsgSerializer();
            _provider.serializeValue(gen, new FaultyBean(), null, ser);
            Assert.fail("Expected JsonMappingException");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof JsonMappingException);
            Assert.assertTrue(e.getMessage().contains("no message for java.lang.RuntimeException"));
        }
    }

    @Test
    public void testSerialize_ioExceptionNotDoubleWrapped() {
        StringWriter sw = new StringWriter();
        try {
            JsonGenerator gen = _jsonFactory.createGenerator(sw);
            @SuppressWarnings("unchecked")
            JsonSerializer<Object> ser = (JsonSerializer<Object>) (JsonSerializer<?>) new FaultyIOSerializer();
            _provider.serializeValue(gen, new FaultyBean(), null, ser);
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertEquals("Custom IO Error", e.getMessage());
        }
    }

    @Test
    public void testSerializeNull_exceptionWrapped() {
        DefaultSerializerProvider.Impl prov = new DefaultSerializerProvider.Impl() {
            private static final long serialVersionUID = 1L;
            @Override
            public JsonSerializer<Object> getDefaultNullValueSerializer() {
                return new JsonSerializer<Object>() {
                    @Override
                    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                        throw new RuntimeException("Null ser failed");
                    }
                };
            }
        }.createInstance(_config, _factory);

        StringWriter sw = new StringWriter();
        try {
            JsonGenerator gen = _jsonFactory.createGenerator(sw);
            prov.serializeValue(gen, null);
            Assert.fail("Expected JsonMappingException");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof JsonMappingException);
            Assert.assertTrue(e.getMessage().contains("Null ser failed"));
        }
    }

    // --- Cache details Tests ---

    @Test
    public void testCacheSerializersCountAndFlush() throws JsonMappingException {
        int initialCount = _provider.cachedSerializersCount();
        _provider.findValueSerializer(String.class, null);
        _provider.findValueSerializer(DummyBean.class, null);
        Assert.assertTrue(_provider.cachedSerializersCount() >= initialCount + 2);

        _provider.flushCachedSerializers();
        Assert.assertEquals(0, _provider.cachedSerializersCount());
    }

    // --- acceptJsonFormatVisitor & generateJsonSchema Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitor_nullJavaType_throwsException() throws JsonMappingException {
        _provider.acceptJsonFormatVisitor(null, new JsonFormatVisitorWrapper.Base());
    }

    @Test
    public void testAcceptJsonFormatVisitor_validType() throws JsonMappingException {
        final boolean[] providerSet = new boolean[]{false};
        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public void setProvider(SerializerProvider provider) {
                super.setProvider(provider);
                providerSet[0] = (provider != null);
            }
        };

        JavaType type = TypeFactory.defaultInstance().constructType(DummyBean.class);
        _provider.acceptJsonFormatVisitor(type, visitor);
        Assert.assertTrue(providerSet[0]);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testGenerateJsonSchema_beanClass() throws JsonMappingException {
        JsonSchema schema = _provider.generateJsonSchema(DummyBean.class);
        Assert.assertNotNull(schema);
        Assert.assertNotNull(schema.getSchemaNode());
        Assert.assertEquals("object", schema.getSchemaNode().get("type").asText());
    }

    @SuppressWarnings("deprecation")
    @Test(expected = IllegalArgumentException.class)
    public void testGenerateJsonSchema_primitiveOrNonObjectSchema_throwsException() throws JsonMappingException {
        _provider.generateJsonSchema(String.class);
    }
}
