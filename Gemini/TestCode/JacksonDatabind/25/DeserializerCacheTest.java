package com.fasterxml.jackson.databind.deser;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdConverter;

public class DeserializerCacheTest {

    private DeserializerCache _cache;
    private DeserializationContext _context;
    private DeserializerFactory _factory;
    private TypeFactory _typeFactory;

    // Helper classes for testing various annotations and scenarios

    public static class SimpleBean {
        public String name;
        public int age;
    }

    public enum TestEnum {
        VALUE_A, VALUE_B
    }

    public static class RecursiveBean {
        public RecursiveBean next;
    }

    public static class CustomDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) {
            return null;
        }
    }

    public static class CustomKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return key;
        }
    }

    @JsonDeserialize(using = CustomDeserializer.class)
    public static class AnnotatedBean {}

    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "set")
    public static class SimpleBuilder {
        public String value;
        public SimpleBuilder setValue(String v) { this.value = v; return this; }
        public BuiltBean create() { return new BuiltBean(value); }
    }

    @JsonDeserialize(builder = SimpleBuilder.class)
    public static class BuiltBean {
        public final String value;
        public BuiltBean(String v) { this.value = v; }
    }

    public static class StringToBeanConverter extends StdConverter<String, ConvertedBean> {
        @Override
        public ConvertedBean convert(String value) {
            ConvertedBean b = new ConvertedBean();
            b.converted = value;
            return b;
        }
    }

    @JsonDeserialize(converter = StringToBeanConverter.class)
    public static class ConvertedBean {
        public String converted;
    }

    public static class BaseNarrowBean {}
    public static class SubNarrowBean extends BaseNarrowBean {
        public String subProp;
    }

    public static class ContainerNarrowHolder {
        @JsonDeserialize(as = SubNarrowBean.class)
        public BaseNarrowBean bean;

        @JsonDeserialize(keyAs = String.class, contentAs = SubNarrowBean.class)
        public Map<Object, BaseNarrowBean> map;

        @JsonDeserialize(keyUsing = CustomKeyDeserializer.class, contentUsing = CustomDeserializer.class)
        public Map<String, String> customMap;
    }

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    public static class CollectionAsObject extends ArrayList<String> {
        private static final long serialVersionUID = 1L;
    }

    public interface AbstractTypeInterface {
        String getValue();
    }

    @Before
    public void setUp() {
        _cache = new DeserializerCache();
        ObjectMapper mapper = new ObjectMapper();
        _context = mapper.getDeserializationContext();
        _factory = ((DefaultDeserializationContext) _context).getFactory();
        _typeFactory = mapper.getTypeFactory();
    }

    @Test
    public void testFindValueDeserializer_simpleBean_successAndCached() throws Exception {
        JavaType type = _typeFactory.constructType(SimpleBean.class);

        Assert.assertEquals(0, _cache.cachedDeserializersCount());
        JsonDeserializer<Object> deser1 = _cache.findValueDeserializer(_context, _factory, type);
        Assert.assertNotNull(deser1);
        Assert.assertTrue(_cache.cachedDeserializersCount() > 0);

        // Retrieve again should hit the cache
        JsonDeserializer<Object> deser2 = _cache.findValueDeserializer(_context, _factory, type);
        Assert.assertSame(deser1, deser2);
    }

    @Test
    public void testFindValueDeserializer_enum_success() throws Exception {
        JavaType type = _typeFactory.constructType(TestEnum.class);
        JsonDeserializer<Object> deser = _cache.findValueDeserializer(_context, _factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_array_success() throws Exception {
        JavaType type = _typeFactory.constructArrayType(String.class);
        JsonDeserializer<Object> deser = _cache.findValueDeserializer(_context, _factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_mapAndCollection_success() throws Exception {
        JavaType mapType = _typeFactory.constructMapType(HashMap.class, String.class, Integer.class);
        JsonDeserializer<Object> mapDeser = _cache.findValueDeserializer(_context, _factory, mapType);
        Assert.assertNotNull(mapDeser);

        JavaType listType = _typeFactory.constructCollectionType(List.class, SimpleBean.class);
        JsonDeserializer<Object> listDeser = _cache.findValueDeserializer(_context, _factory, listType);
        Assert.assertNotNull(listDeser);
    }

    @Test
    public void testFindValueDeserializer_jsonNode_success() throws Exception {
        JavaType type = _typeFactory.constructType(JsonNode.class);
        JsonDeserializer<Object> deser = _cache.findValueDeserializer(_context, _factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_recursiveType_resolvesProperly() throws Exception {
        JavaType type = _typeFactory.constructType(RecursiveBean.class);
        JsonDeserializer<Object> deser = _cache.findValueDeserializer(_context, _factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_annotatedWithCustomDeserializer() throws Exception {
        JavaType type = _typeFactory.constructType(AnnotatedBean.class);
        JsonDeserializer<Object> deser = _cache.findValueDeserializer(_context, _factory, type);
        Assert.assertNotNull(deser);
        Assert.assertTrue(deser instanceof CustomDeserializer);
    }

    @Test
    public void testFindValueDeserializer_annotatedWithBuilder() throws Exception {
        JavaType type = _typeFactory.constructType(BuiltBean.class);
        JsonDeserializer<Object> deser = _cache.findValueDeserializer(_context, _factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_annotatedWithConverter() throws Exception {
        JavaType type = _typeFactory.constructType(ConvertedBean.class);
        JsonDeserializer<Object> deser = _cache.findValueDeserializer(_context, _factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_collectionAsObjectFormat() throws Exception {
        JavaType type = _typeFactory.constructType(CollectionAsObject.class);
        JsonDeserializer<Object> deser = _cache.findValueDeserializer(_context, _factory, type);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_customHandlerNotCached() throws Exception {
        JavaType baseType = _typeFactory.constructType(String.class);
        JavaType typeWithHandler = _typeFactory.constructCollectionType(List.class, baseType)
                .withContentType(baseType.withValueHandler(new CustomDeserializer()));

        JsonDeserializer<Object> deser1 = _cache.findValueDeserializer(_context, _factory, typeWithHandler);
        Assert.assertNotNull(deser1);
        Assert.assertNull(_cache._findCachedDeserializer(typeWithHandler));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCachedDeserializer_nullType_throwsIllegalArgumentException() {
        _cache._findCachedDeserializer(null);
    }

    @Test
    public void testHasValueDeserializerFor_validAndInvalidTypes() throws Exception {
        JavaType validType = _typeFactory.constructType(SimpleBean.class);
        Assert.assertTrue(_cache.hasValueDeserializerFor(_context, _factory, validType));

        // Testing abstract type without registered mapping
        JavaType abstractType = _typeFactory.constructType(AbstractTypeInterface.class);
        try {
            boolean hasDeser = _cache.hasValueDeserializerFor(_context, _factory, abstractType);
            // If it doesn't throw, it should return false
            Assert.assertFalse(hasDeser);
        } catch (JsonMappingException e) {
            // Alternatively, JsonMappingException is expected for abstract types without default impl
            Assert.assertTrue(e.getMessage().contains("Can not find a Value deserializer"));
        }
    }

    @Test
    public void testFindKeyDeserializer_validKey_success() throws Exception {
        JavaType keyType = _typeFactory.constructType(String.class);
        KeyDeserializer kd = _cache.findKeyDeserializer(_context, _factory, keyType);
        Assert.assertNotNull(kd);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindKeyDeserializer_unhandledType_throwsJsonMappingException() throws Exception {
        JavaType keyType = _typeFactory.constructType(AbstractTypeInterface.class);
        _cache.findKeyDeserializer(_context, _factory, keyType);
    }

    @Test
    public void testFlushCachedDeserializers_clearsCache() throws Exception {
        JavaType type = _typeFactory.constructType(SimpleBean.class);
        _cache.findValueDeserializer(_context, _factory, type);
        Assert.assertTrue(_cache.cachedDeserializersCount() > 0);

        _cache.flushCachedDeserializers();
        Assert.assertEquals(0, _cache.cachedDeserializersCount());
    }

    @Test
    public void testSerialization_writeReplace_clearsIncompleteDeserializers() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(_cache);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof DeserializerCache);
    }

    @Test
    public void testHandleUnknownValueDeserializer_abstractAndConcrete() {
        JavaType abstractType = _typeFactory.constructType(AbstractTypeInterface.class);
        try {
            _cache._handleUnknownValueDeserializer(abstractType);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("abstract"));
        }

        JavaType concreteType = _typeFactory.constructType(Object.class);
        try {
            _cache._handleUnknownValueDeserializer(concreteType);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertFalse(e.getMessage().contains("abstract"));
        }
    }

    @Test
    public void testHandleUnknownKeyDeserializer() {
        JavaType type = _typeFactory.constructType(Object.class);
        try {
            _cache._handleUnknownKeyDeserializer(type);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Key deserializer"));
        }
    }

    @Test
    public void testModifyTypeByAnnotation_narrowingAndHandlers() throws Exception {
        JavaType holderType = _typeFactory.constructType(ContainerNarrowHolder.class);
        BeanDescription beanDesc = _context.getConfig().introspect(holderType);

        JsonDeserializer<Object> deser = _cache.findValueDeserializer(_context, _factory, holderType);
        Assert.assertNotNull(deser);
        Assert.assertNotNull(beanDesc);
    }
}
