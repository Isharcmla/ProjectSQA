package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

public class TypeDeserializerBaseTest {

    // Helper classes for testing type hierarchies
    static class Animal {
        public String name;
    }

    static class Dog extends Animal {
        public int barkVolume;
    }

    static class CustomTypeIdResolverBase extends TypeIdResolverBase {
        private final String _desc;

        public CustomTypeIdResolverBase(JavaType baseType, TypeFactory typeFactory, String desc) {
            super(baseType, typeFactory);
            _desc = desc;
        }

        @Override
        public String idFromValue(Object value) {
            return "dog";
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return "dog";
        }

        @Override
        public JsonTypeInfo.Id getMechanism() {
            return JsonTypeInfo.Id.CUSTOM;
        }

        @Override
        public JavaType typeFromId(DatabindContext context, String id) {
            if ("dog".equals(id)) {
                return _typeFactory.constructType(Dog.class);
            }
            return null;
        }

        @Override
        public String getDescForKnownTypeIds() {
            return _desc;
        }
    }

    static class CustomDirectTypeIdResolver implements TypeIdResolver {
        private final TypeFactory _typeFactory;

        public CustomDirectTypeIdResolver(TypeFactory typeFactory) {
            _typeFactory = typeFactory;
        }

        @Override
        public void init(JavaType baseType) { }

        @Override
        public String idFromValue(Object value) { return null; }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) { return null; }

        @Override
        public String idFromBaseType() { return null; }

        @Override
        public JavaType typeFromId(String id) { return null; }

        @Override
        public JavaType typeFromId(DatabindContext context, String id) {
            if ("dog".equals(id)) {
                return _typeFactory.constructType(Dog.class);
            }
            return null;
        }

        @Override
        public String getDescForKnownTypeIds() { return null; }

        @Override
        public JsonTypeInfo.Id getMechanism() { return JsonTypeInfo.Id.CUSTOM; }
    }

    static class ConcreteTypeDeserializer extends TypeDeserializerBase {
        private static final long serialVersionUID = 1L;
        private final JsonTypeInfo.As _inclusion;

        public ConcreteTypeDeserializer(JavaType baseType, TypeIdResolver idRes,
                                        String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
            _inclusion = JsonTypeInfo.As.PROPERTY;
        }

        public ConcreteTypeDeserializer(ConcreteTypeDeserializer src, BeanProperty property) {
            super(src, property);
            _inclusion = src._inclusion;
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new ConcreteTypeDeserializer(this, prop);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return _inclusion;
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

        public JsonDeserializer<Object> testFindDeserializer(DeserializationContext ctxt, String typeId) throws IOException {
            return _findDeserializer(ctxt, typeId);
        }

        public JsonDeserializer<Object> testFindDefaultImplDeserializer(DeserializationContext ctxt) throws IOException {
            return _findDefaultImplDeserializer(ctxt);
        }

        @SuppressWarnings("deprecation")
        public Object testDeserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt);
        }

        public Object testDeserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt, Object typeId) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt, typeId);
        }

        public JsonDeserializer<Object> testHandleUnknownTypeId(DeserializationContext ctxt, String typeId,
                                                               TypeIdResolver idResolver, JavaType baseType) throws IOException {
            return _handleUnknownTypeId(ctxt, typeId, idResolver, baseType);
        }
    }

    private ObjectMapper _mapper;
    private TypeFactory _typeFactory;
    private JavaType _animalType;

    @Before
    public void setUp() {
        _mapper = new ObjectMapper();
        _typeFactory = _mapper.getTypeFactory();
        _animalType = _typeFactory.constructType(Animal.class);
    }

    private DeserializationContext createDeserializationContext(String json) throws IOException {
        JsonParser parser = _mapper.getFactory().createParser(json);
        return ((DefaultDeserializationContext) _mapper.getDeserializationContext())
                .createInstance(_mapper.getDeserializationConfig(), parser, _mapper.getInjectableValues());
    }

    @Test
    public void testGettersAndLifeCycle_nullDefaultImpl() {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "typeProp", true, null);

        Assert.assertEquals(Animal.class.getName(), deser.baseTypeName());
        Assert.assertEquals("typeProp", deser.getPropertyName());
        Assert.assertSame(resolver, deser.getTypeIdResolver());
        Assert.assertNull(deser.getDefaultImpl());
        Assert.assertEquals(JsonTypeInfo.As.PROPERTY, deser.getTypeInclusion());

        String str = deser.toString();
        Assert.assertTrue(str.contains(ConcreteTypeDeserializer.class.getName()));
        Assert.assertTrue(str.contains("base-type:"));
        Assert.assertTrue(str.contains("id-resolver:"));

        BeanProperty.Bogus bogusProp = new BeanProperty.Bogus();
        TypeDeserializer copy = deser.forProperty(bogusProp);
        Assert.assertNotNull(copy);
        Assert.assertEquals(Animal.class.getName(), ((TypeDeserializerBase) copy).baseTypeName());
        Assert.assertEquals("typeProp", copy.getPropertyName());
    }

    @Test
    public void testGettersAndLifeCycle_withDefaultImpl() {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, Dog.class);

        Assert.assertEquals(Dog.class, deser.getDefaultImpl());
    }

    @Test
    public void testFindDeserializer_successAndCaching() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, null);
        DeserializationContext ctxt = createDeserializationContext("{\"barkVolume\": 5}");

        JsonDeserializer<Object> first = deser.testFindDeserializer(ctxt, "dog");
        Assert.assertNotNull(first);

        JsonDeserializer<Object> second = deser.testFindDeserializer(ctxt, "dog");
        Assert.assertSame(first, second);
    }

    @Test
    public void testFindDeserializer_typeNull_fallbackToDefaultImpl() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, Dog.class);
        DeserializationContext ctxt = createDeserializationContext("{\"barkVolume\": 5}");

        JsonDeserializer<Object> foundDeser = deser.testFindDeserializer(ctxt, "unknown_type");
        Assert.assertNotNull(foundDeser);
    }

    @Test
    public void testFindDeserializer_typeNull_andNoDefaultImpl_failOnInvalidSubtype() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, null);
        _mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, true);
        DeserializationContext ctxt = createDeserializationContext("{}");

        try {
            deser.testFindDeserializer(ctxt, "unknown_type");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("unknown_type"));
        }
    }

    @Test
    public void testFindDefaultImplDeserializer_nullDefaultImpl() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, null);

        _mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        DeserializationContext ctxtFalse = createDeserializationContext("{}");
        JsonDeserializer<Object> nullifying = deser.testFindDefaultImplDeserializer(ctxtFalse);
        Assert.assertSame(NullifyingDeserializer.instance, nullifying);

        _mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, true);
        DeserializationContext ctxtTrue = createDeserializationContext("{}");
        JsonDeserializer<Object> nullDeser = deser.testFindDefaultImplDeserializer(ctxtTrue);
        Assert.assertNull(nullDeser);
    }

    @Test
    public void testFindDefaultImplDeserializer_bogusClass() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, Void.class);
        DeserializationContext ctxt = createDeserializationContext("{}");

        JsonDeserializer<Object> nullifying = deser.testFindDefaultImplDeserializer(ctxt);
        Assert.assertSame(NullifyingDeserializer.instance, nullifying);
    }

    @Test
    public void testFindDefaultImplDeserializer_validClass_caching() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, Dog.class);
        DeserializationContext ctxt = createDeserializationContext("{}");

        JsonDeserializer<Object> first = deser.testFindDefaultImplDeserializer(ctxt);
        Assert.assertNotNull(first);
        JsonDeserializer<Object> second = deser.testFindDefaultImplDeserializer(ctxt);
        Assert.assertSame(first, second);
    }

    @Test
    public void testDeserializeWithNativeTypeId_nullTypeId_withDefaultImpl() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, Dog.class);

        String json = "{\"barkVolume\": 10}";
        JsonParser parser = _mapper.getFactory().createParser(json);
        parser.nextToken(); // position to START_OBJECT
        DeserializationContext ctxt = ((DefaultDeserializationContext) _mapper.getDeserializationContext())
                .createInstance(_mapper.getDeserializationConfig(), parser, _mapper.getInjectableValues());

        Object result = deser.testDeserializeWithNativeTypeId(parser, ctxt, null);
        Assert.assertTrue(result instanceof Dog);
        Assert.assertEquals(10, ((Dog) result).barkVolume);
    }

    @Test
    public void testDeserializeWithNativeTypeId_nullTypeId_noDefaultImpl_throws() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, null);
        _mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, true);

        String json = "{}";
        JsonParser parser = _mapper.getFactory().createParser(json);
        DeserializationContext ctxt = ((DefaultDeserializationContext) _mapper.getDeserializationContext())
                .createInstance(_mapper.getDeserializationConfig(), parser, _mapper.getInjectableValues());

        try {
            deser.testDeserializeWithNativeTypeId(parser, ctxt, null);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("No (native) type id found"));
        }
    }

    @Test
    public void testDeserializeWithNativeTypeId_nonStringTypeId() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog") {
            @Override
            public JavaType typeFromId(DatabindContext context, String id) {
                if ("123".equals(id)) {
                    return _typeFactory.constructType(Dog.class);
                }
                return null;
            }
        };
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, null);

        String json = "{\"barkVolume\": 3}";
        JsonParser parser = _mapper.getFactory().createParser(json);
        parser.nextToken();
        DeserializationContext ctxt = ((DefaultDeserializationContext) _mapper.getDeserializationContext())
                .createInstance(_mapper.getDeserializationConfig(), parser, _mapper.getInjectableValues());

        Object result = deser.testDeserializeWithNativeTypeId(parser, ctxt, 123);
        Assert.assertTrue(result instanceof Dog);
        Assert.assertEquals(3, ((Dog) result).barkVolume);
    }

    @Test
    public void testDeserializeWithNativeTypeId_deprecatedMethod() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "dog");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, Dog.class);

        String json = "{\"barkVolume\": 7}";
        JsonParser parser = _mapper.getFactory().createParser(json);
        parser.nextToken();
        DeserializationContext ctxt = ((DefaultDeserializationContext) _mapper.getDeserializationContext())
                .createInstance(_mapper.getDeserializationConfig(), parser, _mapper.getInjectableValues());

        Object result = deser.testDeserializeWithNativeTypeId(parser, ctxt);
        Assert.assertTrue(result instanceof Dog);
        Assert.assertEquals(7, ((Dog) result).barkVolume);
    }

    @Test
    public void testHandleUnknownTypeId_resolverBase_withDesc() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, "'cat', 'dog'");
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, null);
        DeserializationContext ctxt = createDeserializationContext("{}");

        try {
            deser.testHandleUnknownTypeId(ctxt, "bird", resolver, _animalType);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("known type ids = 'cat', 'dog'"));
        }
    }

    @Test
    public void testHandleUnknownTypeId_resolverBase_nullDesc() throws IOException {
        CustomTypeIdResolverBase resolver = new CustomTypeIdResolverBase(_animalType, _typeFactory, null);
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, null);
        DeserializationContext ctxt = createDeserializationContext("{}");

        try {
            deser.testHandleUnknownTypeId(ctxt, "bird", resolver, _animalType);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("known type ids are not statically known"));
        }
    }

    @Test
    public void testHandleUnknownTypeId_notResolverBase() throws IOException {
        CustomDirectTypeIdResolver resolver = new CustomDirectTypeIdResolver(_typeFactory);
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(_animalType, resolver, "@type", false, null);
        DeserializationContext ctxt = createDeserializationContext("{}");

        try {
            deser.testHandleUnknownTypeId(ctxt, "bird", resolver, _animalType);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("bird"));
        }
    }
}
