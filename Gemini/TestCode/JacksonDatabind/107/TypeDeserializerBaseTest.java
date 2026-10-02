package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TypeDeserializerBaseTest {

    private static class DummyTypeIdResolver implements TypeIdResolver {
        private JavaType baseType;
        private final Map<String, JavaType> idToType = new HashMap<String, JavaType>();
        private String knownIdsDesc;

        public DummyTypeIdResolver(JavaType baseType) {
            this.baseType = baseType;
        }

        public void registerType(String id, JavaType type) {
            idToType.put(id, type);
        }

        public void setKnownIdsDesc(String desc) {
            this.knownIdsDesc = desc;
        }

        @Override
        public void init(JavaType baseType) {
            this.baseType = baseType;
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
        public String idFromBaseType() {
            return null;
        }

        @Override
        public JavaType typeFromId(DatabindException context, String id) {
            return idToType.get(id);
        }

        @Override
        public JavaType typeFromId(DeserializationContext context, String id) {
            return idToType.get(id);
        }

        @Override
        public String getDescForKnownTypeIds() {
            return knownIdsDesc;
        }

        @Override
        public JsonTypeInfo.Id getMechanism() {
            return JsonTypeInfo.Id.CUSTOM;
        }
    }

    private static class ConcreteTypeDeserializer extends TypeDeserializerBase {
        private static final long serialVersionUID = 1L;

        public ConcreteTypeDeserializer(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, JavaType defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        public ConcreteTypeDeserializer(ConcreteTypeDeserializer src, BeanProperty property) {
            super(src, property);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new ConcreteTypeDeserializer(this, prop);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt);
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt);
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt);
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt);
        }

        // Public helper bridges to invoke protected methods
        public JsonDeserializer<Object> findDeserializer(DeserializationContext ctxt, String typeId) throws IOException {
            return _findDeserializer(ctxt, typeId);
        }

        public JsonDeserializer<Object> findDefaultImplDeserializer(DeserializationContext ctxt) throws IOException {
            return _findDefaultImplDeserializer(ctxt);
        }

        @SuppressWarnings("deprecation")
        public Object deserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt);
        }

        public Object deserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt, Object typeId) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt, typeId);
        }

        public JavaType handleUnknownTypeId(DeserializationContext ctxt, String typeId) throws IOException {
            return _handleUnknownTypeId(ctxt, typeId);
        }

        public JavaType handleMissingTypeId(DeserializationContext ctxt, String extraDesc) throws IOException {
            return _handleMissingTypeId(ctxt, extraDesc);
        }

        public Map<String, JsonDeserializer<Object>> getDeserializersMap() {
            return _deserializers;
        }
    }

    private DeserializationContext createContext(ObjectMapper mapper, JsonParser parser) {
        DefaultDeserializationContext dc = (DefaultDeserializationContext) mapper.getDeserializationContext();
        DeserializationConfig config = mapper.getDeserializationConfig();
        return dc.createInstance(config, parser, mapper.getInjectableValues());
    }

    @Test
    public void testConstructorAndAccessors_validInputs_returnsExpectedValues() {
        ObjectMapper mapper = new ObjectMapper();
        JavaType baseType = mapper.constructType(Number.class);
        JavaType defaultImpl = mapper.constructType(Integer.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "typeProp", true, defaultImpl);

        Assert.assertEquals(Number.class.getName(), deser.baseTypeName());
        Assert.assertEquals("typeProp", deser.getPropertyName());
        Assert.assertSame(idRes, deser.getTypeIdResolver());
        Assert.assertEquals(Integer.class, deser.getDefaultImpl());
        Assert.assertSame(baseType, deser.baseType());
        Assert.assertEquals(JsonTypeInfo.As.PROPERTY, deser.getTypeInclusion());

        String toString = deser.toString();
        Assert.assertTrue(toString.contains(ConcreteTypeDeserializer.class.getName()));
        Assert.assertTrue(toString.contains("base-type:" + baseType));
        Assert.assertTrue(toString.contains("id-resolver: " + idRes));
    }

    @Test
    public void testConstructor_nullTypePropertyNameAndNullDefaultImpl_handlesGracefully() {
        ObjectMapper mapper = new ObjectMapper();
        JavaType baseType = mapper.constructType(Object.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, null, false, null);

        Assert.assertEquals("", deser.getPropertyName());
        Assert.assertNull(deser.getDefaultImpl());
        Assert.assertSame(baseType, deser.baseType());
    }

    @Test
    public void testForProperty_createsCopyWithProperty() {
        ObjectMapper mapper = new ObjectMapper();
        JavaType baseType = mapper.constructType(String.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);

        ConcreteTypeDeserializer original = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);
        BeanProperty.Std prop = new BeanProperty.Std(PropertyName.construct("myProp"), baseType, null, null, PropertyMetadata.STD_OPTIONAL);

        TypeDeserializer copy = original.forProperty(prop);
        Assert.assertNotNull(copy);
        Assert.assertNotSame(original, copy);
        Assert.assertEquals(original.getPropertyName(), copy.getPropertyName());
        Assert.assertSame(original.getTypeIdResolver(), copy.getTypeIdResolver());
    }

    @Test
    public void testFindDefaultImplDeserializer_nullDefaultImpl_failOnInvalidSubtypeDisabled() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);
        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Object.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);

        JsonDeserializer<Object> defaultDeser = deser.findDefaultImplDeserializer(ctxt);
        Assert.assertSame(NullifyingDeserializer.instance, defaultDeser);
    }

    @Test
    public void testFindDefaultImplDeserializer_nullDefaultImpl_failOnInvalidSubtypeEnabled() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);
        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Object.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);

        JsonDeserializer<Object> defaultDeser = deser.findDefaultImplDeserializer(ctxt);
        Assert.assertNull(defaultDeser);
    }

    @Test
    public void testFindDefaultImplDeserializer_bogusDefaultImpl_returnsNullifyingDeserializer() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Object.class);
        JavaType bogusType = mapper.constructType(Void.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, bogusType);

        JsonDeserializer<Object> defaultDeser = deser.findDefaultImplDeserializer(ctxt);
        Assert.assertSame(NullifyingDeserializer.instance, defaultDeser);
    }

    @Test
    public void testFindDefaultImplDeserializer_validDefaultImpl_returnsAndCachesDeserializer() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("123");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Number.class);
        JavaType defaultImpl = mapper.constructType(Integer.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, defaultImpl);

        JsonDeserializer<Object> firstCall = deser.findDefaultImplDeserializer(ctxt);
        Assert.assertNotNull(firstCall);

        JsonDeserializer<Object> secondCall = deser.findDefaultImplDeserializer(ctxt);
        Assert.assertSame(firstCall, secondCall);
    }

    @Test
    public void testFindDeserializer_typeIdKnown_specializesTypeWhenNoGenerics() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("[]");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.getTypeFactory().constructCollectionType(Collection.class, String.class);
        JavaType rawSubType = mapper.getTypeFactory().constructType(List.class);

        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        idRes.registerType("list", rawSubType);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);

        JsonDeserializer<Object> foundDeser = deser.findDeserializer(ctxt, "list");
        Assert.assertNotNull(foundDeser);
        Assert.assertTrue(deser.getDeserializersMap().containsKey("list"));

        JsonDeserializer<Object> cachedDeser = deser.findDeserializer(ctxt, "list");
        Assert.assertSame(foundDeser, cachedDeser);
    }

    @Test
    public void testFindDeserializer_typeIdKnown_retainsGenerics() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("[]");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.getTypeFactory().constructCollectionType(Collection.class, Object.class);
        JavaType genericSubType = mapper.getTypeFactory().constructCollectionType(List.class, String.class);

        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        idRes.registerType("genList", genericSubType);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);

        JsonDeserializer<Object> foundDeser = deser.findDeserializer(ctxt, "genList");
        Assert.assertNotNull(foundDeser);
    }

    @Test
    public void testFindDeserializer_typeIdKnown_differentBaseTypeClass() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("[]");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Object.class);
        JavaType subType = mapper.getTypeFactory().constructCollectionType(List.class, String.class);

        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        idRes.registerType("list", subType);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);

        JsonDeserializer<Object> foundDeser = deser.findDeserializer(ctxt, "list");
        Assert.assertNotNull(foundDeser);
    }

    @Test
    public void testFindDeserializer_unknownTypeId_usesDefaultImpl() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("123");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Number.class);
        JavaType defaultImpl = mapper.constructType(Integer.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, defaultImpl);

        JsonDeserializer<Object> resultDeser = deser.findDeserializer(ctxt, "unknownId");
        Assert.assertNotNull(resultDeser);
    }

    @Test
    public void testFindDeserializer_unknownTypeId_handledByProblemHandlerReturningType() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addHandler(new DeserializationProblemHandler() {
            @Override
            public JavaType handleUnknownTypeId(DeserializationContext ctxt, JavaType baseType,
                    String subTypeId, TypeIdResolver idResolver, String failureMsg) {
                return ctxt.constructType(String.class);
            }
        });

        JsonParser parser = mapper.getFactory().createParser("\"text\"");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Object.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);

        JsonDeserializer<Object> resultDeser = deser.findDeserializer(ctxt, "unknownId");
        Assert.assertNotNull(resultDeser);
    }

    @Test
    public void testFindDeserializer_unknownTypeId_handledByProblemHandlerReturningNull() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addHandler(new DeserializationProblemHandler() {
            @Override
            public JavaType handleUnknownTypeId(DeserializationContext ctxt, JavaType baseType,
                    String subTypeId, TypeIdResolver idResolver, String failureMsg) {
                return null;
            }
        });

        JsonParser parser = mapper.getFactory().createParser("\"text\"");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Object.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);

        JsonDeserializer<Object> resultDeser = deser.findDeserializer(ctxt, "unknownId");
        Assert.assertNull(resultDeser);
    }

    @Test
    public void testDeserializeWithNativeTypeId_nullTypeId_hasDefaultImpl_deserializesValue() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("42");
        parser.nextToken();
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Number.class);
        JavaType defaultImpl = mapper.constructType(Integer.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, defaultImpl);

        Object result = deser.deserializeWithNativeTypeId(parser, ctxt, null);
        Assert.assertEquals(42, result);
    }

    @Test
    public void testDeserializeWithNativeTypeId_nullTypeId_noDefaultImpl_throwsException() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("42");
        parser.nextToken();
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Number.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);

        try {
            deser.deserializeWithNativeTypeId(parser, ctxt, null);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("No (native) type id found"));
        }
    }

    @Test
    public void testDeserializeWithNativeTypeId_withStringAndNonStringTypeId() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("100");
        parser.nextToken();
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Number.class);
        JavaType intType = mapper.constructType(Integer.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        idRes.registerType("10", intType);
        idRes.registerType("strId", intType);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);

        Object result1 = deser.deserializeWithNativeTypeId(parser, ctxt, "strId");
        Assert.assertEquals(100, result1);

        parser = mapper.getFactory().createParser("200");
        parser.nextToken();
        ctxt = createContext(mapper, parser);
        Object result2 = deser.deserializeWithNativeTypeId(parser, ctxt, Integer.valueOf(10));
        Assert.assertEquals(200, result2);
    }

    @Test
    public void testDeserializeWithNativeTypeId_deprecatedTwoArgMethod() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("42");
        parser.nextToken();
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Number.class);
        JavaType defaultImpl = mapper.constructType(Integer.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);

        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, defaultImpl);

        Object result = deser.deserializeWithNativeTypeId(parser, ctxt);
        Assert.assertEquals(42, result);
    }

    @Test
    public void testHandleUnknownTypeId_knownIdsNullAndNonNull_withAndWithoutProperty() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Number.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);

        // Case 1: knownIdsDesc is null, property is null
        try {
            deser.handleUnknownTypeId(ctxt, "unresolved1");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("type ids are not statically known"));
        }

        // Case 2: knownIdsDesc is present, property is present
        idRes.setKnownIdsDesc("idA, idB");
        BeanProperty.Std prop = new BeanProperty.Std(PropertyName.construct("propName"), baseType, null, null, PropertyMetadata.STD_OPTIONAL);
        ConcreteTypeDeserializer deserWithProp = (ConcreteTypeDeserializer) deser.forProperty(prop);

        try {
            deserWithProp.handleUnknownTypeId(ctxt, "unresolved2");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("known type ids = idA, idB"));
            Assert.assertTrue(e.getMessage().contains("for POJO property 'propName'"));
        }
    }

    @Test
    public void testHandleMissingTypeId_throwsException() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("{}");
        DeserializationContext ctxt = createContext(mapper, parser);

        JavaType baseType = mapper.constructType(Number.class);
        DummyTypeIdResolver idRes = new DummyTypeIdResolver(baseType);
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(baseType, idRes, "type", false, null);

        try {
            deser.handleMissingTypeId(ctxt, "extra info for missing id");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("extra info for missing id") || e.getMessage().contains("missing type id"));
        }
    }
}
