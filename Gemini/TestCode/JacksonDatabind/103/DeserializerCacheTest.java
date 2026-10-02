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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
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
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdConverter;

public class DeserializerCacheTest {

    private DeserializerCache cache;
    private ObjectMapper mapper;
    private DeserializationContext ctxt;
    private DeserializerFactory factory;
    private TypeFactory typeFactory;

    // Test helper classes
    public static class SimpleBean {
        public String name;
        public int age;
    }

    public enum TestEnum {
        A, B, C
    }

    public static class CustomDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) {
            return "custom";
        }
    }

    public static class CustomKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return "key:" + key;
        }
    }

    @JsonDeserialize(using = CustomDeserializer.class)
    public static class AnnotatedWithDeserBean {
    }

    @JsonDeserialize(builder = BuilderBean.Builder.class)
    public static class BuilderBean {
        final String value;

        BuilderBean(String value) {
            this.value = value;
        }

        @JsonPOJOBuilder(withPrefix = "set")
        public static class Builder {
            private String value;

            public Builder setValue(String value) {
                this.value = value;
                return this;
            }

            public BuilderBean build() {
                return new BuilderBean(value);
            }
        }
    }

    public static class StringToBeanConverter extends StdConverter<String, ConvertedBean> {
        @Override
        public ConvertedBean convert(String value) {
            ConvertedBean bean = new ConvertedBean();
            bean.text = value;
            return bean;
        }
    }

    @JsonDeserialize(converter = StringToBeanConverter.class)
    public static class ConvertedBean {
        public String text;
    }

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    public static class MapAsObject extends HashMap<String, String> {
        private static final long serialVersionUID = 1L;
    }

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    public static class ListAsObject extends ArrayList<String> {
        private static final long serialVersionUID = 1L;
    }

    public static class AnnotatedMapHolder {
        @JsonDeserialize(keyUsing = CustomKeyDeserializer.class, contentUsing = CustomDeserializer.class)
        public Map<String, String> map;
    }

    public static abstract class AbstractUnmapped {
        public abstract void doSomething();
    }

    public static class NonDeserializableKey {
        private final int x;

        public NonDeserializableKey(int x, int y) {
            this.x = x + y;
        }

        public int getX() {
            return x;
        }
    }

    @Before
    public void setUp() throws Exception {
        cache = new DeserializerCache();
        mapper = new ObjectMapper();
        ctxt = ((DefaultDeserializationContext) mapper.getDeserializationContext())
                .createInstance(mapper.getDeserializationConfig(), mapper.createParser("{}"), null);
        factory = mapper.getDeserializationContext().getFactory();
        typeFactory = mapper.getTypeFactory();
    }

    @Test
    public void testCachedDeserializersCount_initiallyZero() {
        Assert.assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushCachedDeserializers_clearsCache() throws Exception {
        JavaType type = typeFactory.constructType(SimpleBean.class);
        cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertTrue(cache.cachedDeserializersCount() > 0);

        cache.flushCachedDeserializers();
        Assert.assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindValueDeserializer_simpleBean_cachedProperly() throws Exception {
        JavaType type = typeFactory.constructType(SimpleBean.class);
        JsonDeserializer<Object> deser1 = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser1);

        int count = cache.cachedDeserializersCount();
        Assert.assertTrue(count > 0);

        // Fetch again, should return cached instance
        JsonDeserializer<Object> deser2 = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertSame(deser1, deser2);
        Assert.assertEquals(count, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindValueDeserializer_enumType() throws Exception {
        JavaType type = typeFactory.constructType(TestEnum.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_arrayType() throws Exception {
        ArrayType type = typeFactory.constructArrayType(String.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_collectionType() throws Exception {
        CollectionType type = typeFactory.constructCollectionType(List.class, String.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_collectionLikeType_shapeObject() throws Exception {
        JavaType type = typeFactory.constructType(ListAsObject.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_mapType() throws Exception {
        MapType type = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_mapLikeType_shapeObject() throws Exception {
        JavaType type = typeFactory.constructType(MapAsObject.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_referenceType() throws Exception {
        JavaType type = typeFactory.constructType(AtomicReference.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_jsonNode() throws Exception {
        JavaType typeNode = typeFactory.constructType(JsonNode.class);
        JsonDeserializer<Object> deserNode = cache.findValueDeserializer(ctxt, factory, typeNode);
        Assert.assertNotNull(deserNode);

        JavaType typeObjNode = typeFactory.constructType(ObjectNode.class);
        JsonDeserializer<Object> deserObjNode = cache.findValueDeserializer(ctxt, factory, typeObjNode);
        Assert.assertNotNull(deserObjNode);
    }

    @Test
    public void testFindValueDeserializer_annotatedWithCustomDeserializer() throws Exception {
        JavaType type = typeFactory.constructType(AnnotatedWithDeserBean.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
        Assert.assertTrue(deser instanceof CustomDeserializer);
    }

    @Test
    public void testFindValueDeserializer_builderBasedDeserializer() throws Exception {
        JavaType type = typeFactory.constructType(BuilderBean.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_withConverter() throws Exception {
        JavaType type = typeFactory.constructType(ConvertedBean.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_typeWithCustomHandlers_notCached() throws Exception {
        JavaType mapType = typeFactory.constructMapType(Map.class, String.class, String.class);
        JavaType customKeyType = mapType.getKeyType().withValueHandler(new CustomKeyDeserializer());
        JavaType customContentType = mapType.getContentType().withValueHandler(new CustomDeserializer());
        JavaType customMapType = ((MapType) mapType).withKeyType(customKeyType).withContentType(customContentType);

        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, customMapType);
        Assert.assertNotNull(deser);
        // Custom handlers should bypass caching
        Assert.assertNull(cache._findCachedDeserializer(customMapType));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_findCachedDeserializer_nullType_throwsException() {
        cache._findCachedDeserializer(null);
    }

    @Test
    public void testHasValueDeserializerFor_existingType_returnsTrue() throws Exception {
        JavaType type = typeFactory.constructType(SimpleBean.class);
        boolean hasDeser = cache.hasValueDeserializerFor(ctxt, factory, type);
        Assert.assertTrue(hasDeser);

        // Subsequent call when cached
        boolean hasDeserCached = cache.hasValueDeserializerFor(ctxt, factory, type);
        Assert.assertTrue(hasDeserCached);
    }

    @Test
    public void testFindKeyDeserializer_validKeyType() throws Exception {
        JavaType type = typeFactory.constructType(String.class);
        KeyDeserializer keyDeser = cache.findKeyDeserializer(ctxt, factory, type);
        Assert.assertNotNull(keyDeser);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindKeyDeserializer_unhandledKeyType_throwsException() throws Exception {
        JavaType type = typeFactory.constructType(NonDeserializableKey.class);
        cache.findKeyDeserializer(ctxt, factory, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindValueDeserializer_abstractTypeWithoutMapping_throwsException() throws Exception {
        JavaType type = typeFactory.constructType(AbstractUnmapped.class);
        cache.findValueDeserializer(ctxt, factory, type);
    }

    @Test
    public void test_handleUnknownValueDeserializer_concreteType() {
        JavaType type = typeFactory.constructType(SimpleBean.class);
        try {
            cache._handleUnknownValueDeserializer(ctxt, type);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot find a Value deserializer for type"));
        }
    }

    @Test
    public void test_handleUnknownValueDeserializer_abstractType() {
        JavaType type = typeFactory.constructType(AbstractUnmapped.class);
        try {
            cache._handleUnknownValueDeserializer(ctxt, type);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot find a Value deserializer for abstract type"));
        }
    }

    @Test
    public void test_handleUnknownKeyDeserializer() {
        JavaType type = typeFactory.constructType(SimpleBean.class);
        try {
            cache._handleUnknownKeyDeserializer(ctxt, type);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot find a (Map) Key deserializer for type"));
        }
    }

    @Test
    public void testWriteReplace_serializationHandling() throws Exception {
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
    public void testModifyTypeByAnnotation_handlingFieldAnnotations() throws Exception {
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(typeFactory.constructType(AnnotatedMapHolder.class));
        Assert.assertNotNull(beanDesc);
    }
}
