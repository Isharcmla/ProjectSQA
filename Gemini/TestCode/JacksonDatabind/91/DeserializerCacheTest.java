package com.fasterxml.jackson.databind.deser;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.StdConverter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeserializerCacheTest {

    private DeserializerCache cache;
    private ObjectMapper mapper;
    private DeserializationContext ctxt;
    private DeserializerFactory factory;
    private TypeFactory typeFactory;

    // Test helper classes
    enum TestEnum { A, B }

    static class SimpleBean {
        public int x;
        public String y;
    }

    static class CustomStringDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) {
            return "custom";
        }
    }

    static class CustomKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return "key:" + key;
        }
    }

    @JsonDeserialize(using = CustomStringDeserializer.class)
    static class AnnotatedBean {
        public String val;
    }

    static class StringToBeanConverter extends StdConverter<String, ConvertedBean> {
        @Override
        public ConvertedBean convert(String value) {
            ConvertedBean b = new ConvertedBean();
            b.text = value;
            return b;
        }
    }

    @JsonDeserialize(converter = StringToBeanConverter.class)
    static class ConvertedBean {
        public String text;
    }

    @JsonDeserialize(builder = BuilderBean.Builder.class)
    static class BuilderBean {
        final int value;
        private BuilderBean(int v) { this.value = v; }

        @JsonPOJOBuilder(withPrefix = "set")
        static class Builder {
            private int v;
            public Builder setV(int v) { this.v = v; return this; }
            public BuilderBean build() { return new BuilderBean(v); }
        }
    }

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    static class ObjectFormattedCollection extends ArrayList<String> {
        private static final long serialVersionUID = 1L;
    }

    static class CustomMapWrapper {
        @JsonDeserialize(keyUsing = CustomKeyDeserializer.class, contentUsing = CustomStringDeserializer.class)
        public Map<String, String> map;
    }

    static class RecursiveBean {
        public RecursiveBean next;
    }

    abstract static class AbstractBean {
        public int id;
    }

    static class NonConstructibleKey {
        private final int a;
        private final int b;
        public NonConstructibleKey(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    @Before
    public void setUp() {
        cache = new DeserializerCache();
        mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
        factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        typeFactory = mapper.getTypeFactory();
    }

    @Test
    public void testCachedDeserializersCountAndFlush() throws Exception {
        Assert.assertEquals(0, cache.cachedDeserializersCount());
        JavaType type = typeFactory.constructType(SimpleBean.class);
        
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
        Assert.assertTrue(cache.cachedDeserializersCount() > 0);

        cache.flushCachedDeserializers();
        Assert.assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testSerializationWriteReplace() throws Exception {
        JavaType type = typeFactory.constructType(SimpleBean.class);
        cache.findValueDeserializer(ctxt, factory, type);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(cache);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof DeserializerCache);
    }

    @Test
    public void testFindValueDeserializer_simpleBean() throws Exception {
        JavaType type = typeFactory.constructType(SimpleBean.class);
        JsonDeserializer<Object> deser1 = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser1);
        
        // Second call should fetch from cache
        JsonDeserializer<Object> deser2 = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertSame(deser1, deser2);
    }

    @Test
    public void testFindValueDeserializer_enumType() throws Exception {
        JavaType type = typeFactory.constructType(TestEnum.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_arrayType() throws Exception {
        JavaType type = typeFactory.constructArrayType(SimpleBean.class);
        Assert.assertTrue(type.isArrayType());
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_collectionType() throws Exception {
        JavaType type = typeFactory.constructCollectionType(List.class, SimpleBean.class);
        Assert.assertTrue(type.isCollectionLikeType());
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_collectionLikeTypeCustom() throws Exception {
        JavaType type = typeFactory.constructCollectionLikeType(String.class, Integer.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_mapType() throws Exception {
        JavaType type = typeFactory.constructMapType(Map.class, String.class, SimpleBean.class);
        Assert.assertTrue(type.isMapLikeType());
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_mapLikeTypeCustom() throws Exception {
        JavaType type = typeFactory.constructMapLikeType(String.class, String.class, Integer.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_referenceType() throws Exception {
        JavaType type = typeFactory.constructReferenceType(AtomicReference.class, typeFactory.constructType(String.class));
        Assert.assertTrue(type.isReferenceType());
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_treeType() throws Exception {
        JavaType type = typeFactory.constructType(JsonNode.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);

        JavaType subType = typeFactory.constructType(ObjectNode.class);
        JsonDeserializer<Object> deserSub = cache.findValueDeserializer(ctxt, factory, subType);
        Assert.assertNotNull(deserSub);
    }

    @Test
    public void testFindValueDeserializer_annotatedBean() throws Exception {
        JavaType type = typeFactory.constructType(AnnotatedBean.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_convertedBean() throws Exception {
        JavaType type = typeFactory.constructType(ConvertedBean.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_builderBean() throws Exception {
        JavaType type = typeFactory.constructType(BuilderBean.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_collectionShapeObject() throws Exception {
        JavaType type = typeFactory.constructType(ObjectFormattedCollection.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_cyclicDependency() throws Exception {
        JavaType type = typeFactory.constructType(RecursiveBean.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_typeWithCustomHandler() throws Exception {
        JavaType type = typeFactory.constructType(CustomMapWrapper.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);

        // Type with content type value handler should bypass caching
        JavaType listType = typeFactory.constructCollectionType(List.class, String.class);
        JavaType listWithHandler = listType.withContentValueHandler(new CustomStringDeserializer());
        JsonDeserializer<Object> deser1 = cache.findValueDeserializer(ctxt, factory, listWithHandler);
        Assert.assertNotNull(deser1);
        Assert.assertNull(cache._findCachedDeserializer(listWithHandler));
    }

    @Test
    public void testFindValueDeserializer_nullTypeThrowsException() throws Exception {
        try {
            cache.findValueDeserializer(ctxt, factory, null);
            Assert.fail("Expected IllegalArgumentException on null type");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Null JavaType passed"));
        }
    }

    @Test
    public void testFindKeyDeserializer_success() throws Exception {
        JavaType type = typeFactory.constructType(String.class);
        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, factory, type);
        Assert.assertNotNull(kd);
    }

    @Test
    public void testFindKeyDeserializer_resolvable() throws Exception {
        JavaType type = typeFactory.constructType(TestEnum.class);
        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, factory, type);
        Assert.assertNotNull(kd);
    }

    @Test
    public void testFindKeyDeserializer_unknownTypeThrowsMappingException() {
        JavaType type = typeFactory.constructType(NonConstructibleKey.class);
        try {
            cache.findKeyDeserializer(ctxt, factory, type);
            Assert.fail("Expected JsonMappingException for unconstructible key");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Can not find a (Map) Key deserializer"));
        }
    }

    @Test
    public void testHasValueDeserializerFor() throws Exception {
        JavaType type = typeFactory.constructType(SimpleBean.class);
        Assert.assertTrue(cache.hasValueDeserializerFor(ctxt, factory, type));
        // Check true again when already cached
        Assert.assertTrue(cache.hasValueDeserializerFor(ctxt, factory, type));
    }

    @Test
    public void testHandleUnknownValueDeserializer_abstractClass() {
        JavaType type = typeFactory.constructType(AbstractBean.class);
        try {
            cache._handleUnknownValueDeserializer(ctxt, type);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Can not find a Value deserializer for abstract type"));
        }
    }

    @Test
    public void testHandleUnknownValueDeserializer_concreteClass() {
        JavaType type = typeFactory.constructType(SimpleBean.class);
        try {
            cache._handleUnknownValueDeserializer(ctxt, type);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Can not find a Value deserializer for type"));
        }
    }

    @Test
    public void testCreateAndCache2_illegalArgumentHandled() {
        // Construct invalid type that might cause IllegalArgumentException in factory
        DeserializerFactory badFactory = new BeanDeserializerFactory(new DeserializerFactoryConfig()) {
            private static final long serialVersionUID = 1L;
            @Override
            public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) {
                throw new IllegalArgumentException("Forced illegal argument");
            }
        };

        JavaType type = typeFactory.constructType(SimpleBean.class);
        try {
            cache.findValueDeserializer(ctxt, badFactory, type);
            Assert.fail("Expected JsonMappingException wrapping IllegalArgumentException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Forced illegal argument"));
        }
    }
}
