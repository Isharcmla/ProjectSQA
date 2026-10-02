package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class SerializerProviderTest {

    private ObjectMapper mapper;
    private SerializationConfig config;
    private DefaultSerializerProvider.Impl provider;

    private static class ConcreteTestSerializerProvider extends SerializerProvider {
        public ConcreteTestSerializerProvider() {
            super();
        }

        public ConcreteTestSerializerProvider(SerializerProvider src, SerializationConfig config, SerializerFactory f) {
            super(src, config, f);
        }

        public ConcreteTestSerializerProvider(SerializerProvider src) {
            super(src);
        }

        @Override
        public WritableObjectId findObjectId(Object forPojo, ObjectIdGenerator<?> generatorType) {
            return null;
        }

        @Override
        public JsonSerializer<Object> serializerInstance(Annotated annotated, Object serDef) {
            return null;
        }

        @Override
        public Object includeFilterInstance(BeanPropertyDefinition forProperty, Class<?> filterClass) {
            return null;
        }

        @Override
        public boolean includeFilterSuppressNulls(Object filter) {
            return false;
        }

        public DateFormat callDateFormat() {
            return _dateFormat();
        }

        public void callReportIncompatibleRootType(Object value, JavaType rootType) throws IOException {
            _reportIncompatibleRootType(value, rootType);
        }

        public JsonSerializer<Object> callFindExplicitUntypedSerializer(Class<?> runtimeType) throws JsonMappingException {
            return _findExplicitUntypedSerializer(runtimeType);
        }

        public JsonSerializer<Object> callCreateAndCacheUntypedSerializer(Class<?> rawType) throws JsonMappingException {
            return _createAndCacheUntypedSerializer(rawType);
        }

        public JsonSerializer<Object> callCreateAndCacheUntypedSerializer(JavaType type) throws JsonMappingException {
            return _createAndCacheUntypedSerializer(type);
        }

        public JsonSerializer<Object> callCreateUntypedSerializer(JavaType type) throws JsonMappingException {
            return _createUntypedSerializer(type);
        }

        public JsonSerializer<Object> callHandleContextualResolvable(JsonSerializer<?> ser, BeanProperty property) throws JsonMappingException {
            return _handleContextualResolvable(ser, property);
        }

        public JsonSerializer<Object> callHandleResolvable(JsonSerializer<?> ser) throws JsonMappingException {
            return _handleResolvable(ser);
        }
    }

    private static class ContextualAndResolvableSerializer extends StdSerializer<Object>
            implements ContextualSerializer, ResolvableSerializer {
        public boolean resolved = false;
        public boolean contextualized = false;

        public ContextualAndResolvableSerializer() {
            super(Object.class);
        }

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString("custom");
        }

        @Override
        public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) {
            this.contextualized = true;
            return this;
        }

        @Override
        public void resolve(SerializerProvider provider) {
            this.resolved = true;
        }
    }

    private static class CustomNullSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("NULL_VALUE");
        }
    }

    private static class PolymorphicBase {
    }

    private static class PolymorphicSub extends PolymorphicBase {
        public int x = 10;
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
        provider = new DefaultSerializerProvider.Impl();
        provider = (DefaultSerializerProvider.Impl) provider.createInstance(config, BeanSerializerFactory.instance);
    }

    @Test
    public void testConstructors_blueprintAndCopy() {
        ConcreteTestSerializerProvider blueprint = new ConcreteTestSerializerProvider();
        Assert.assertNull(blueprint.getConfig());
        Assert.assertNull(blueprint.getActiveView());
        Assert.assertTrue(blueprint._stdNullValueSerializer);

        ConcreteTestSerializerProvider copyBlueprint = new ConcreteTestSerializerProvider(blueprint);
        Assert.assertNull(copyBlueprint.getConfig());
        Assert.assertNull(copyBlueprint.getActiveView());
        Assert.assertTrue(copyBlueprint._stdNullValueSerializer);

        ConcreteTestSerializerProvider active = new ConcreteTestSerializerProvider(blueprint, config, BeanSerializerFactory.instance);
        Assert.assertNotNull(active.getConfig());
        Assert.assertSame(config, active.getConfig());
        Assert.assertNotNull(active.getTypeFactory());
        Assert.assertNotNull(active.getAnnotationIntrospector());
    }

    @Test
    public void testSetDefaultKeySerializer_validAndNull() {
        JsonSerializer<Object> custom = ToStringSerializer.instance;
        provider.setDefaultKeySerializer(custom);
        Assert.assertSame(custom, provider._keySerializer);

        try {
            provider.setDefaultKeySerializer(null);
            Assert.fail("Expected IllegalArgumentException on null key serializer");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Cannot pass null JsonSerializer", e.getMessage());
        }
    }

    @Test
    public void testSetNullValueSerializer_validAndNull() {
        JsonSerializer<Object> customNull = new CustomNullSerializer();
        provider.setNullValueSerializer(customNull);
        Assert.assertSame(customNull, provider.getDefaultNullValueSerializer());
        Assert.assertSame(customNull, provider._nullValueSerializer);

        try {
            provider.setNullValueSerializer(null);
            Assert.fail("Expected IllegalArgumentException on null serializer");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Cannot pass null JsonSerializer", e.getMessage());
        }
    }

    @Test
    public void testSetNullKeySerializer_validAndNull() {
        JsonSerializer<Object> customNullKey = ToStringSerializer.instance;
        provider.setNullKeySerializer(customNullKey);
        Assert.assertSame(customNullKey, provider.getDefaultNullKeySerializer());
        Assert.assertSame(customNullKey, provider._nullKeySerializer);

        try {
            provider.setNullKeySerializer(null);
            Assert.fail("Expected IllegalArgumentException on null serializer");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Cannot pass null JsonSerializer", e.getMessage());
        }
    }

    @Test
    public void testConfigAccessors() {
        Assert.assertNotNull(provider.getConfig());
        Assert.assertNotNull(provider.getAnnotationIntrospector());
        Assert.assertNotNull(provider.getTypeFactory());
        Assert.assertNull(provider.getActiveView());
        Assert.assertNull(provider.getSerializationView());
        Assert.assertTrue(provider.canOverrideAccessModifiers());
        Assert.assertTrue(provider.isEnabled(MapperFeature.USE_ANNOTATIONS));
        Assert.assertNotNull(provider.getDefaultPropertyFormat(String.class));
        Assert.assertNotNull(provider.getDefaultPropertyInclusion(String.class));
        Assert.assertNotNull(provider.getLocale());
        Assert.assertNotNull(provider.getTimeZone());
        Assert.assertTrue(provider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS));
        Assert.assertTrue(provider.hasSerializationFeatures(SerializationFeature.FAIL_ON_EMPTY_BEANS.getMask()));
        Assert.assertNull(provider.getFilterProvider());
        Assert.assertNull(provider.getGenerator());
    }

    @Test
    public void testAttributes_getAndSet() {
        Assert.assertNull(provider.getAttribute("key1"));
        SerializerProvider chained = provider.setAttribute("key1", "val1");
        Assert.assertSame(provider, chained);
        Assert.assertEquals("val1", provider.getAttribute("key1"));
        provider.setAttribute("key2", 123);
        Assert.assertEquals(123, provider.getAttribute("key2"));
    }

    @Test
    public void testFindValueSerializer_classAndJavaType() throws Exception {
        JsonSerializer<Object> strSer = provider.findValueSerializer(String.class, null);
        Assert.assertNotNull(strSer);

        JsonSerializer<Object> strSer2 = provider.findValueSerializer(String.class);
        Assert.assertSame(strSer, strSer2);

        JavaType intType = provider.constructType(Integer.class);
        JsonSerializer<Object> intSer = provider.findValueSerializer(intType, null);
        Assert.assertNotNull(intSer);

        JsonSerializer<Object> intSer2 = provider.findValueSerializer(intType);
        Assert.assertSame(intSer, intSer2);
    }

    @Test
    public void testFindValueSerializer_nullValueType() {
        try {
            provider.findValueSerializer((JavaType) null, null);
            Assert.fail("Expected exception for null JavaType");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Null passed for `valueType`"));
        }
    }

    @Test
    public void testFindPrimaryPropertySerializer() throws Exception {
        JsonSerializer<Object> ser1 = provider.findPrimaryPropertySerializer(String.class, null);
        Assert.assertNotNull(ser1);

        JavaType intType = provider.constructType(Integer.class);
        JsonSerializer<Object> ser2 = provider.findPrimaryPropertySerializer(intType, null);
        Assert.assertNotNull(ser2);
    }

    @Test
    public void testFindTypedValueSerializer_classAndType() throws Exception {
        JsonSerializer<Object> ser1 = provider.findTypedValueSerializer(String.class, true, null);
        Assert.assertNotNull(ser1);

        // Call again to hit the cached branch
        JsonSerializer<Object> serCached = provider.findTypedValueSerializer(String.class, true, null);
        Assert.assertSame(ser1, serCached);

        JavaType intType = provider.constructType(Integer.class);
        JsonSerializer<Object> ser2 = provider.findTypedValueSerializer(intType, true, null);
        Assert.assertNotNull(ser2);

        // Call again to hit the type-cached branch
        JsonSerializer<Object> ser2Cached = provider.findTypedValueSerializer(intType, true, null);
        Assert.assertSame(ser2, ser2Cached);
    }

    @Test
    public void testFindTypeSerializer() throws Exception {
        JavaType strType = provider.constructType(String.class);
        TypeSerializer typeSer = provider.findTypeSerializer(strType);
        Assert.assertNull(typeSer);
    }

    @Test
    public void testFindKeySerializer() throws Exception {
        JsonSerializer<Object> keySer1 = provider.findKeySerializer(String.class, null);
        Assert.assertNotNull(keySer1);

        JavaType intType = provider.constructType(Integer.class);
        JsonSerializer<Object> keySer2 = provider.findKeySerializer(intType, null);
        Assert.assertNotNull(keySer2);
    }

    @Test
    public void testFindNullKeySerializerAndNullValueSerializer() throws Exception {
        JavaType strType = provider.constructType(String.class);
        JsonSerializer<Object> nullKeySer = provider.findNullKeySerializer(strType, null);
        Assert.assertSame(provider.getDefaultNullKeySerializer(), nullKeySer);

        JsonSerializer<Object> nullValSer = provider.findNullValueSerializer(null);
        Assert.assertSame(provider.getDefaultNullValueSerializer(), nullValSer);
    }

    @Test
    public void testGetUnknownTypeSerializer_and_isUnknownTypeSerializer() {
        JsonSerializer<Object> defaultUnknown = provider.getUnknownTypeSerializer(Object.class);
        Assert.assertNotNull(defaultUnknown);
        Assert.assertTrue(provider.isUnknownTypeSerializer(defaultUnknown));

        JsonSerializer<Object> specificUnknown = provider.getUnknownTypeSerializer(Void.class);
        Assert.assertNotNull(specificUnknown);
        Assert.assertTrue(provider.isUnknownTypeSerializer(specificUnknown));

        Assert.assertTrue(provider.isUnknownTypeSerializer(null));

        JsonSerializer<Object> standardSer = provider.getDefaultNullValueSerializer();
        Assert.assertFalse(provider.isUnknownTypeSerializer(standardSer));

        // When FAIL_ON_EMPTY_BEANS is disabled
        ObjectMapper disabledMapper = new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        SerializerProvider disabledProvider = disabledMapper.getSerializerProviderInstance();
        Assert.assertFalse(disabledProvider.isUnknownTypeSerializer(new UnknownSerializer(Void.class)));
    }

    @Test
    public void testHandleContextualization() throws Exception {
        ContextualAndResolvableSerializer custom = new ContextualAndResolvableSerializer();
        JsonSerializer<?> result1 = provider.handlePrimaryContextualization(custom, null);
        Assert.assertSame(custom, result1);
        Assert.assertTrue(custom.contextualized);

        custom.contextualized = false;
        JsonSerializer<?> result2 = provider.handleSecondaryContextualization(custom, null);
        Assert.assertSame(custom, result2);
        Assert.assertTrue(custom.contextualized);

        Assert.assertNull(provider.handlePrimaryContextualization(null, null));
        Assert.assertNull(provider.handleSecondaryContextualization(null, null));
    }

    @Test
    public void testDefaultSerializeValue_and_defaultSerializeField() throws Exception {
        JsonFactory f = new JsonFactory();

        // 1. Serialize standard non-null
        StringWriter sw = new StringWriter();
        JsonGenerator gen = f.createGenerator(sw);
        provider.defaultSerializeValue("hello", gen);
        gen.flush();
        Assert.assertEquals("\"hello\"", sw.toString());

        // 2. Serialize default null
        sw = new StringWriter();
        gen = f.createGenerator(sw);
        provider.defaultSerializeValue(null, gen);
        gen.flush();
        Assert.assertEquals("null", sw.toString());

        // 3. Serialize non-standard null
        ConcreteTestSerializerProvider customProvider = new ConcreteTestSerializerProvider(
                new ConcreteTestSerializerProvider(), config, BeanSerializerFactory.instance);
        customProvider.setNullValueSerializer(new CustomNullSerializer());
        sw = new StringWriter();
        gen = f.createGenerator(sw);
        customProvider.defaultSerializeValue(null, gen);
        gen.flush();
        Assert.assertEquals("\"NULL_VALUE\"", sw.toString());

        // 4. Default serialize field (non-null and null)
        sw = new StringWriter();
        gen = f.createGenerator(sw);
        gen.writeStartObject();
        provider.defaultSerializeField("field1", "value1", gen);
        provider.defaultSerializeField("field2", null, gen);
        gen.writeEndObject();
        gen.flush();
        Assert.assertEquals("{\"field1\":\"value1\",\"field2\":null}", sw.toString());

        // 5. Default serialize field with custom null serializer
        sw = new StringWriter();
        gen = f.createGenerator(sw);
        gen.writeStartObject();
        customProvider.defaultSerializeField("fieldNull", null, gen);
        gen.writeEndObject();
        gen.flush();
        Assert.assertEquals("{\"fieldNull\":\"NULL_VALUE\"}", sw.toString());
    }

    @Test
    public void testDefaultSerializeNull() throws Exception {
        JsonFactory f = new JsonFactory();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = f.createGenerator(sw);
        provider.defaultSerializeNull(gen);
        gen.flush();
        Assert.assertEquals("null", sw.toString());

        ConcreteTestSerializerProvider customProvider = new ConcreteTestSerializerProvider(
                new ConcreteTestSerializerProvider(), config, BeanSerializerFactory.instance);
        customProvider.setNullValueSerializer(new CustomNullSerializer());
        sw = new StringWriter();
        gen = f.createGenerator(sw);
        customProvider.defaultSerializeNull(gen);
        gen.flush();
        Assert.assertEquals("\"NULL_VALUE\"", sw.toString());
    }

    @Test
    public void testDefaultSerializeDateValue_and_Keys() throws Exception {
        long timestamp = 1577836800000L; // 2020-01-01 00:00:00 UTC
        Date date = new Date(timestamp);
        JsonFactory f = new JsonFactory();

        // 1. As timestamp (default is true in Jackson)
        StringWriter sw = new StringWriter();
        JsonGenerator gen = f.createGenerator(sw);
        provider.defaultSerializeDateValue(timestamp, gen);
        provider.defaultSerializeDateValue(date, gen);
        gen.flush();
        Assert.assertEquals("15778368000001577836800000", sw.toString());

        // 2. Date keys as timestamp
        SerializationConfig configWithKeyTimestamps = config.with(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS);
        SerializerProvider provKeyTimestamps = provider.createInstance(configWithKeyTimestamps, BeanSerializerFactory.instance);

        sw = new StringWriter();
        gen = f.createGenerator(sw);
        gen.writeStartObject();
        provKeyTimestamps.defaultSerializeDateKey(timestamp, gen);
        gen.writeString("v1");
        provKeyTimestamps.defaultSerializeDateKey(date, gen);
        gen.writeString("v2");
        gen.writeEndObject();
        gen.flush();
        Assert.assertEquals("{\"1577836800000\":\"v1\",\"1577836800000\":\"v2\"}", sw.toString());

        // 3. Dates as formatted text
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        SerializationConfig textConfig = config.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .without(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)
                .with(sdf);
        SerializerProvider provText = provider.createInstance(textConfig, BeanSerializerFactory.instance);

        sw = new StringWriter();
        gen = f.createGenerator(sw);
        provText.defaultSerializeDateValue(timestamp, gen);
        provText.defaultSerializeDateValue(date, gen);
        gen.writeStartObject();
        provText.defaultSerializeDateKey(timestamp, gen);
        gen.writeString("v1");
        provText.defaultSerializeDateKey(date, gen);
        gen.writeString("v2");
        gen.writeEndObject();
        gen.flush();
        Assert.assertEquals("\"2020-01-01\"\"2020-01-01\"{\"2020-01-01\":\"v1\",\"2020-01-01\":\"v2\"}", sw.toString());
    }

    @Test
    public void testErrorReportingMethods() {
        JavaType type = provider.constructType(String.class);

        try {
            provider.reportMappingProblem("Problem %s", "A");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Problem A"));
        }

        try {
            provider.reportMappingProblem(new RuntimeException("cause"), "Problem with cause %d", 42);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Problem with cause 42"));
            Assert.assertEquals("cause", e.getCause().getMessage());
        }

        try {
            provider.reportBadDefinition(type, "Bad type def");
            Assert.fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("Bad type def"));
            Assert.assertEquals(type, e.getType());
        }

        try {
            provider.reportBadDefinition(type, "Bad type def with cause", new RuntimeException("root"));
            Assert.fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("Bad type def with cause"));
            Assert.assertEquals("root", e.getCause().getMessage());
        }

        try {
            provider.reportBadDefinition(String.class, "Bad raw class", new RuntimeException("raw-root"));
            Assert.fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("Bad raw class"));
            Assert.assertEquals("raw-root", e.getCause().getMessage());
        }

        try {
            provider.reportBadTypeDefinition(null, "Null bean desc %s", "arg");
            Assert.fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("Invalid type definition for type N/A: Null bean desc arg"));
        }

        try {
            provider.reportBadPropertyDefinition(null, null, "Null prop desc %s", "arg2");
            Assert.fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("Invalid definition for property N/A (of type N/A): Null prop desc arg2"));
        }

        InvalidTypeIdException ite = provider.invalidTypeIdException(type, "myTypeId", "extra explanation");
        Assert.assertNotNull(ite);
        Assert.assertTrue(ite.getMessage().contains("Could not resolve type id 'myTypeId'"));
        Assert.assertTrue(ite.getMessage().contains("extra explanation"));
        Assert.assertEquals("myTypeId", ite.getTypeId());
        Assert.assertEquals(type, ite.getBaseType());

        // Deprecated mappingException
        @SuppressWarnings("deprecation")
        JsonMappingException me1 = provider.mappingException("msg %s", "foo");
        Assert.assertTrue(me1.getMessage().contains("msg foo"));

        @SuppressWarnings("deprecation")
        JsonMappingException me2 = provider.mappingException(new IOException("io"), "msg2 %s", "bar");
        Assert.assertTrue(me2.getMessage().contains("msg2 bar"));
        Assert.assertEquals("io", me2.getCause().getMessage());
    }

    @Test
    public void testProtectedHelperMethods() throws Exception {
        ConcreteTestSerializerProvider custom = new ConcreteTestSerializerProvider(
                new ConcreteTestSerializerProvider(), config, BeanSerializerFactory.instance);

        // DateFormat helper
        DateFormat df1 = custom.callDateFormat();
        Assert.assertNotNull(df1);
        DateFormat df2 = custom.callDateFormat();
        Assert.assertSame(df1, df2);

        // Resolvable and contextual helpers
        ContextualAndResolvableSerializer resolvable = new ContextualAndResolvableSerializer();
        Assert.assertFalse(resolvable.resolved);
        custom.callHandleResolvable(resolvable);
        Assert.assertTrue(resolvable.resolved);

        ContextualAndResolvableSerializer ctxResolvable = new ContextualAndResolvableSerializer();
        custom.callHandleContextualResolvable(ctxResolvable, null);
        Assert.assertTrue(ctxResolvable.resolved);
        Assert.assertTrue(ctxResolvable.contextualized);

        // Explicit untyped serializer
        JsonSerializer<Object> stringSer = custom.callFindExplicitUntypedSerializer(String.class);
        Assert.assertNotNull(stringSer);
        // Call again to hit the known serializers cache
        JsonSerializer<Object> stringSerCached = custom.callFindExplicitUntypedSerializer(String.class);
        Assert.assertSame(stringSer, stringSerCached);

        // Incompatible root type checks
        JavaType intType = custom.constructType(int.class);
        custom.callReportIncompatibleRootType(123, intType); // Compatible primitive wrapper

        try {
            custom.callReportIncompatibleRootType("not an int", intType);
            Assert.fail("Expected exception for incompatible type");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("Incompatible types"));
        }

        try {
            custom.callReportIncompatibleRootType(123, custom.constructType(String.class));
            Assert.fail("Expected exception for incompatible type");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("Incompatible types"));
        }

        // Untyped serializer creation helpers
        JsonSerializer<Object> ser1 = custom.callCreateAndCacheUntypedSerializer(Long.class);
        Assert.assertNotNull(ser1);

        JsonSerializer<Object> ser2 = custom.callCreateAndCacheUntypedSerializer(custom.constructType(Double.class));
        Assert.assertNotNull(ser2);

        JsonSerializer<Object> ser3 = custom.callCreateUntypedSerializer(custom.constructType(Boolean.class));
        Assert.assertNotNull(ser3);
    }
}
