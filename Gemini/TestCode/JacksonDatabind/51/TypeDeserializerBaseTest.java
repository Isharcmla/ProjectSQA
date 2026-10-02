package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TypeDeserializerBaseTest {

    private ObjectMapper mapper;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        typeFactory = mapper.getTypeFactory();
    }

    private DeserializationContext createDeserializationContext(JsonParser parser) {
        DefaultDeserializationContext original = (DefaultDeserializationContext) mapper.getDeserializationContext();
        return original.createInstance(mapper.getDeserializationConfig(), parser, mapper.getInjectableValues());
    }

    // Concrete dummy implementation for testing abstract TypeDeserializerBase
    private static class TestTypeDeserializer extends TypeDeserializerBase {
        private static final long serialVersionUID = 1L;

        public TestTypeDeserializer(JavaType baseType, TypeIdResolver idRes,
                                    String typePropertyName, boolean typeIdVisible, JavaType defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        public TestTypeDeserializer(TestTypeDeserializer src, BeanProperty property) {
            super(src, property);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new TestTypeDeserializer(this, prop);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        // Public delegators for protected methods to test coverage
        public JsonDeserializer<Object> findDeserializer(DeserializationContext ctxt, String typeId) throws IOException {
            return _findDeserializer(ctxt, typeId);
        }

        public JsonDeserializer<Object> findDefaultImplDeserializer(DeserializationContext ctxt) throws IOException {
            return _findDefaultImplDeserializer(ctxt);
        }

        public Object deserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt);
        }

        public Object deserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt, Object typeId) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt, typeId);
        }

        public JavaType handleUnknownTypeId(DeserializationContext ctxt, String typeId, TypeIdResolver idResolver, JavaType baseType) throws IOException {
            return _handleUnknownTypeId(ctxt, typeId, idResolver, baseType);
        }

        public Map<String, JsonDeserializer<Object>> getDeserializersMap() {
            return _deserializers;
        }
    }

    private static class CustomTypeIdResolverBase extends TypeIdResolverBase {
        private final Map<String, JavaType> typeMap = new HashMap<String, JavaType>();
        private String knownDesc;

        public CustomTypeIdResolverBase(JavaType baseType, TypeFactory typeFactory) {
            super(baseType, typeFactory);
        }

        public void register(String id, JavaType type) {
            typeMap.put(id, type);
        }

        public void setKnownDesc(String desc) {
            this.knownDesc = desc;
        }

        @Override
        public String idFromValue(Object value) {
            return null;
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return null;
        }

        @Override
        public JsonTypeInfo.Id getMechanism() {
            return JsonTypeInfo.Id.CUSTOM;
        }

        @Override
        public JavaType typeFromId(DatabindContext context, String id) {
            return typeMap.get(id);
        }

        @Override
        public String getDescForKnownTypeIds() {
            return knownDesc;
        }
    }

    private static class PlainTypeIdResolver implements TypeIdResolver {
        @Override
        public void init(JavaType baseType) {}

        @Override
        public String idFromValue(Object value) {
            return null;
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return null;
        }

        @Override
        public String idFromBaseType() {
            return null;
        }

        @Override
        public JavaType typeFromId(DatabindContext context, String id) {
            return null;
        }

        @Override
        public String getDescForKnownTypeIds() {
            return null;
        }

        @Override
        public JsonTypeInfo.Id getMechanism() {
            return JsonTypeInfo.Id.CUSTOM;
        }
    }

    @Test
    public void testAccessors_validInputs_returnCorrectValues() {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType defaultType = typeFactory.constructType(Integer.class);
        CustomTypeIdResolverBase idRes = new CustomTypeIdResolverBase(baseType, typeFactory);

        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, idRes, "@type", true, defaultType);

        Assert.assertEquals("java.lang.Number", deser.baseTypeName());
        Assert.assertEquals("@type", deser.getPropertyName());
        Assert.assertSame(idRes, deser.getTypeIdResolver());
        Assert.assertEquals(Integer.class, deser.getDefaultImpl());
        Assert.assertEquals(JsonTypeInfo.As.PROPERTY, deser.getTypeInclusion());

        String str = deser.toString();
        Assert.assertTrue(str.contains(TestTypeDeserializer.class.getName()));
        Assert.assertTrue(str.contains("base-type:"));
        Assert.assertTrue(str.contains("id-resolver:"));
    }

    @Test
    public void testConstructor_nullPropertyName_defaultsToEmptyString() {
        JavaType baseType = typeFactory.constructType(Object.class);
        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, null, null, false, null);

        Assert.assertEquals("", deser.getPropertyName());
        Assert.assertNull(deser.getDefaultImpl());
    }

    @Test
    public void testForProperty_createsCopyWithProperty() {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType defaultType = typeFactory.constructType(Integer.class);
        CustomTypeIdResolverBase idRes = new CustomTypeIdResolverBase(baseType, typeFactory);

        TestTypeDeserializer original = new TestTypeDeserializer(baseType, idRes, "type", false, defaultType);
        BeanProperty prop = new BeanProperty.Bogus();
        TypeDeserializer copy = original.forProperty(prop);

        Assert.assertTrue(copy instanceof TestTypeDeserializer);
        Assert.assertEquals("type", copy.getPropertyName());
        Assert.assertEquals(Integer.class, copy.getDefaultImpl());
        Assert.assertSame(idRes, copy.getTypeIdResolver());
    }

    @Test
    public void testFindDeserializer_knownTypeAndCaching_success() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType subType = typeFactory.constructType(Integer.class);
        CustomTypeIdResolverBase idRes = new CustomTypeIdResolverBase(baseType, typeFactory);
        idRes.register("int", subType);

        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, idRes, "type", true, null);
        JsonParser parser = mapper.getFactory().createParser("123");
        DeserializationContext ctxt = createDeserializationContext(parser);

        Assert.assertEquals(0, deser.getDeserializersMap().size());

        JsonDeserializer<Object> resDeser1 = deser.findDeserializer(ctxt, "int");
        Assert.assertNotNull(resDeser1);
        Assert.assertEquals(1, deser.getDeserializersMap().size());

        // Call again to hit the cache
        JsonDeserializer<Object> resDeser2 = deser.findDeserializer(ctxt, "int");
        Assert.assertSame(resDeser1, resDeser2);
    }

    @Test
    public void testFindDeserializer_differentJavaTypeClass_success() throws IOException {
        JavaType baseType = typeFactory.constructType(Object.class);
        JavaType mapType = typeFactory.constructMapType(HashMap.class, String.class, Object.class);
        CustomTypeIdResolverBase idRes = new CustomTypeIdResolverBase(baseType, typeFactory);
        idRes.register("map", mapType);

        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, idRes, "type", true, null);
        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createDeserializationContext(parser);

        JsonDeserializer<Object> resDeser = deser.findDeserializer(ctxt, "map");
        Assert.assertNotNull(resDeser);
    }

    @Test
    public void testFindDefaultImplDeserializer_nullDefaultImpl_failOnInvalidSubtypeDisabled() throws IOException {
        mapper.disable(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);
        JavaType baseType = typeFactory.constructType(Number.class);
        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, null, "type", true, null);

        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createDeserializationContext(parser);

        JsonDeserializer<Object> res = deser.findDefaultImplDeserializer(ctxt);
        Assert.assertSame(NullifyingDeserializer.instance, res);
    }

    @Test
    public void testFindDefaultImplDeserializer_nullDefaultImpl_failOnInvalidSubtypeEnabled() throws IOException {
        mapper.enable(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);
        JavaType baseType = typeFactory.constructType(Number.class);
        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, null, "type", true, null);

        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createDeserializationContext(parser);

        JsonDeserializer<Object> res = deser.findDefaultImplDeserializer(ctxt);
        Assert.assertNull(res);
    }

    @Test
    public void testFindDefaultImplDeserializer_voidBogusClass_returnsNullifyingDeserializer() throws IOException {
        JavaType baseType = typeFactory.constructType(Object.class);
        JavaType voidType = typeFactory.constructType(Void.class);
        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, null, "type", true, voidType);

        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createDeserializationContext(parser);

        JsonDeserializer<Object> res = deser.findDefaultImplDeserializer(ctxt);
        Assert.assertSame(NullifyingDeserializer.instance, res);
    }

    @Test
    public void testFindDefaultImplDeserializer_validDefaultImpl_cachesAndReturns() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType defaultType = typeFactory.constructType(Long.class);
        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, null, "type", true, defaultType);

        JsonParser parser = mapper.getFactory().createParser("123");
        DeserializationContext ctxt = createDeserializationContext(parser);

        JsonDeserializer<Object> res1 = deser.findDefaultImplDeserializer(ctxt);
        Assert.assertNotNull(res1);

        // Second call should return cached instance
        JsonDeserializer<Object> res2 = deser.findDefaultImplDeserializer(ctxt);
        Assert.assertSame(res1, res2);
    }

    @Test
    public void testFindDeserializer_unknownTypeId_resolvesToDefaultImpl() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType defaultType = typeFactory.constructType(Long.class);
        CustomTypeIdResolverBase idRes = new CustomTypeIdResolverBase(baseType, typeFactory);

        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, idRes, "type", true, defaultType);
        JsonParser parser = mapper.getFactory().createParser("123");
        DeserializationContext ctxt = createDeserializationContext(parser);

        JsonDeserializer<Object> res = deser.findDeserializer(ctxt, "unknown_type_id");
        Assert.assertNotNull(res);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindDeserializer_unknownTypeId_noDefaultImpl_throwsException() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        CustomTypeIdResolverBase idRes = new CustomTypeIdResolverBase(baseType, typeFactory);

        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, idRes, "type", true, null);
        JsonParser parser = mapper.getFactory().createParser("123");
        DeserializationContext ctxt = createDeserializationContext(parser);

        deser.findDeserializer(ctxt, "unregistered_id");
    }

    @Test
    public void testDeserializeWithNativeTypeId_validStringId_success() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType intType = typeFactory.constructType(Integer.class);
        CustomTypeIdResolverBase idRes = new CustomTypeIdResolverBase(baseType, typeFactory);
        idRes.register("int", intType);

        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, idRes, "type", true, null);
        JsonParser parser = mapper.getFactory().createParser("42");
        parser.nextToken(); // position to VALUE_NUMBER_INT
        DeserializationContext ctxt = createDeserializationContext(parser);

        Object result = deser.deserializeWithNativeTypeId(parser, ctxt, "int");
        Assert.assertEquals(42, result);
    }

    @Test
    public void testDeserializeWithNativeTypeId_nonStringId_success() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType intType = typeFactory.constructType(Integer.class);
        CustomTypeIdResolverBase idRes = new CustomTypeIdResolverBase(baseType, typeFactory);
        idRes.register("100", intType);

        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, idRes, "type", true, null);
        JsonParser parser = mapper.getFactory().createParser("42");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(parser);

        Object result = deser.deserializeWithNativeTypeId(parser, ctxt, Integer.valueOf(100));
        Assert.assertEquals(42, result);
    }

    @Test
    public void testDeserializeWithNativeTypeId_nullTypeId_usesDefaultImpl() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType defaultType = typeFactory.constructType(Integer.class);
        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, null, "type", true, defaultType);

        JsonParser parser = mapper.getFactory().createParser("42");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(parser);

        Object result = deser.deserializeWithNativeTypeId(parser, ctxt, null);
        Assert.assertEquals(42, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeWithNativeTypeId_nullTypeId_noDefaultImpl_throwsException() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, null, "type", true, null);

        JsonParser parser = mapper.getFactory().createParser("42");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(parser);

        deser.deserializeWithNativeTypeId(parser, ctxt, null);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeserializeWithNativeTypeId_deprecatedMethod_usesParserNativeTypeId() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType defaultType = typeFactory.constructType(Integer.class);
        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, null, "type", true, defaultType);

        JsonParser parser = mapper.getFactory().createParser("42");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(parser);

        Object result = deser.deserializeWithNativeTypeId(parser, ctxt);
        Assert.assertEquals(42, result);
    }

    @Test
    public void testHandleUnknownTypeId_typeIdResolverBaseWithKnownDesc() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        CustomTypeIdResolverBase idRes = new CustomTypeIdResolverBase(baseType, typeFactory);
        idRes.setKnownDesc("int, double");

        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, idRes, "type", true, null);
        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createDeserializationContext(parser);

        try {
            deser.handleUnknownTypeId(ctxt, "invalidId", idRes, baseType);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("known type ids = int, double"));
        }
    }

    @Test
    public void testHandleUnknownTypeId_typeIdResolverBaseWithNullDesc() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        CustomTypeIdResolverBase idRes = new CustomTypeIdResolverBase(baseType, typeFactory);
        idRes.setKnownDesc(null);

        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, idRes, "type", true, null);
        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createDeserializationContext(parser);

        try {
            deser.handleUnknownTypeId(ctxt, "invalidId", idRes, baseType);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("known type ids are not statically known"));
        }
    }

    @Test
    public void testHandleUnknownTypeId_nonTypeIdResolverBase() throws IOException {
        JavaType baseType = typeFactory.constructType(Number.class);
        PlainTypeIdResolver idRes = new PlainTypeIdResolver();

        TestTypeDeserializer deser = new TestTypeDeserializer(baseType, idRes, "type", true, null);
        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createDeserializationContext(parser);

        try {
            deser.handleUnknownTypeId(ctxt, "invalidId", idRes, baseType);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }
}
