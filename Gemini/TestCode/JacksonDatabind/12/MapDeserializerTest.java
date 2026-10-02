package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // --- Helper classes for tests ---

    static class CustomKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return "custom:" + key;
        }
    }

    static class CustomValueDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return "customVal:" + p.getText();
        }

        @Override
        public String getNullValue() {
            return "customNull";
        }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
    static class PolymorphicValue {
        public String name;
    }

    static class SubPolymorphicValue extends PolymorphicValue {
        public int count;
    }

    static class ContainerBean {
        @JsonIgnoreProperties({"ignoredKey"})
        public Map<String, String> mapWithIgnored;

        @JsonDeserialize(keyUsing = CustomKeyDeserializer.class, contentUsing = CustomValueDeserializer.class)
        public Map<String, String> mapWithCustom;
    }

    static class MapWithPropertyCreator extends HashMap<String, Object> {
        private final String header;

        @JsonCreator
        public MapWithPropertyCreator(@JsonProperty("header") String header) {
            this.header = header;
        }

        public String getHeader() {
            return header;
        }
    }

    static class MapWithDelegateCreator extends HashMap<String, Object> {
        @JsonCreator
        public MapWithDelegateCreator(String json) {
            put("fromDelegate", json);
        }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class IdentifiedValue {
        public int id;
        public String name;
        public IdentifiedValue next;
    }

    // --- Tests ---

    @Test
    public void testBasicDeserialization_stringKeys_success() throws Exception {
        String json = "{\"key1\":\"val1\",\"key2\":\"val2\",\"key3\":null}";
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        Map<String, String> result = mapper.readValue(json, type);

        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.size());
        Assert.assertEquals("val1", result.get("key1"));
        Assert.assertEquals("val2", result.get("key2"));
        Assert.assertNull(result.get("key3"));
    }

    @Test
    public void testBasicDeserialization_nonStringKeys_success() throws Exception {
        String json = "{\"1\":\"one\",\"2\":\"two\"}";
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, Integer.class, String.class);
        Map<Integer, String> result = mapper.readValue(json, type);

        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals("one", result.get(1));
        Assert.assertEquals("two", result.get(2));
    }

    @Test
    public void testDeserialize_intoExistingMap_success() throws Exception {
        String json = "{\"k2\":\"v2\",\"k3\":\"v3\"}";
        Map<Object, Object> existing = new HashMap<Object, Object>();
        existing.put("k1", "v1");

        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        Map<?, ?> result = mapper.readerForUpdating(existing).forType(type).readValue(json);

        Assert.assertSame(existing, result);
        Assert.assertEquals(3, existing.size());
        Assert.assertEquals("v1", existing.get("k1"));
        Assert.assertEquals("v2", existing.get("k2"));
        Assert.assertEquals("v3", existing.get("k3"));
    }

    @Test
    public void testDeserialize_intoExistingMap_nonStringKey() throws Exception {
        String json = "{\"10\":\"ten\",\"20\":\"twenty\"}";
        Map<Integer, String> existing = new HashMap<Integer, String>();
        existing.put(5, "five");

        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, Integer.class, String.class);
        Map<?, ?> result = mapper.readerForUpdating(existing).forType(type).readValue(json);

        Assert.assertSame(existing, result);
        Assert.assertEquals(3, existing.size());
        Assert.assertEquals("five", existing.get(5));
        Assert.assertEquals("ten", existing.get(10));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_intoExistingMap_invalidToken_throws() throws Exception {
        String json = "[\"item1\"]";
        Map<String, String> existing = new HashMap<String, String>();
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        mapper.readerForUpdating(existing).forType(type).readValue(json);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_invalidToken_throws() throws Exception {
        String json = "[1, 2, 3]";
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        mapper.readValue(json, type);
    }

    @Test
    public void testDeserialize_emptyObject_success() throws Exception {
        String json = "{}";
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        Map<String, String> result = mapper.readValue(json, type);

        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testSetIgnorableProperties_nullAndEmpty() {
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        ValueInstantiator vi = new StdValueInstantiator(null, type);
        MapDeserializer deser = new MapDeserializer(type, vi, null, null, null);

        deser.setIgnorableProperties(new String[]{"a", "b"});
        Assert.assertFalse(deser.isCachable());

        deser.setIgnorableProperties(new String[0]);
        Assert.assertTrue(deser.isCachable());

        deser.setIgnorableProperties(null);
        Assert.assertTrue(deser.isCachable());
    }

    @Test
    public void testIgnorableProperties_duringDeserialization() throws Exception {
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        ValueInstantiator vi = new StdValueInstantiator(null, type);
        MapDeserializer deser = new MapDeserializer(type, vi, null, null, null);
        deser.setIgnorableProperties(new String[]{"ignoreMe"});

        String json = "{\"keepMe\":\"value1\",\"ignoreMe\":{\"nested\":\"obj\"}}";
        ContainerBean bean = mapper.readValue("{\"mapWithIgnored\":" + json + "}", ContainerBean.class);

        Assert.assertNotNull(bean.mapWithIgnored);
        Assert.assertEquals(1, bean.mapWithIgnored.size());
        Assert.assertEquals("value1", bean.mapWithIgnored.get("keepMe"));
        Assert.assertFalse(bean.mapWithIgnored.containsKey("ignoreMe"));
    }

    @Test
    public void testIgnorableProperties_nonStringKey() throws Exception {
        String json = "{\"mapWithIgnored\":{\"1\":\"val1\",\"ignoredKey\":\"val2\"}}";
        ContainerBean bean = mapper.readValue(json, ContainerBean.class);
        Assert.assertNotNull(bean.mapWithIgnored);
        Assert.assertEquals("val1", bean.mapWithIgnored.get("1"));
        Assert.assertFalse(bean.mapWithIgnored.containsKey("ignoredKey"));
    }

    @Test
    public void testPolymorphicValueDeserialization() throws Exception {
        mapper.registerSubtypes(SubPolymorphicValue.class);
        String json = "{\"item\":{\"@type\":\"SubPolymorphicValue\",\"name\":\"polyName\",\"count\":42}}";

        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, PolymorphicValue.class);
        Map<String, PolymorphicValue> map = mapper.readValue(json, type);

        Assert.assertNotNull(map);
        Assert.assertTrue(map.get("item") instanceof SubPolymorphicValue);
        SubPolymorphicValue sub = (SubPolymorphicValue) map.get("item");
        Assert.assertEquals("polyName", sub.name);
        Assert.assertEquals(42, sub.count);
    }

    @Test
    public void testPolymorphicValue_nonStringKey() throws Exception {
        mapper.registerSubtypes(SubPolymorphicValue.class);
        String json = "{\"100\":{\"@type\":\"SubPolymorphicValue\",\"name\":\"polyName\",\"count\":7}}";

        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, Integer.class, PolymorphicValue.class);
        Map<Integer, PolymorphicValue> map = mapper.readValue(json, type);

        Assert.assertNotNull(map);
        SubPolymorphicValue sub = (SubPolymorphicValue) map.get(100);
        Assert.assertEquals("polyName", sub.name);
        Assert.assertEquals(7, sub.count);
    }

    @Test
    public void testPropertyBasedCreator() throws Exception {
        String json = "{\"header\":\"myHeader\",\"extra1\":\"val1\",\"extra2\":123}";
        MapWithPropertyCreator result = mapper.readValue(json, MapWithPropertyCreator.class);

        Assert.assertNotNull(result);
        Assert.assertEquals("myHeader", result.getHeader());
        Assert.assertEquals("val1", result.get("extra1"));
        Assert.assertEquals(123, result.get("extra2"));
    }

    @Test
    public void testDelegateCreator() throws Exception {
        String json = "\"a delegate string\"";
        MapWithDelegateCreator result = mapper.readValue(json, MapWithDelegateCreator.class);

        Assert.assertNotNull(result);
        Assert.assertEquals("a delegate string", result.get("fromDelegate"));
    }

    @Test
    public void testContextualAndCustomDeserializers() throws Exception {
        String json = "{\"mapWithCustom\":{\"alpha\":null,\"beta\":\"hello\"}}";
        ContainerBean bean = mapper.readValue(json, ContainerBean.class);

        Assert.assertNotNull(bean.mapWithCustom);
        Assert.assertEquals("customNull", bean.mapWithCustom.get("custom:alpha"));
        Assert.assertEquals("customVal:hello", bean.mapWithCustom.get("custom:beta"));
    }

    @Test
    public void testGetContentTypeAndContentDeserializerAndValueType() {
        JavaType type = mapper.getTypeFactory().constructMapType(TreeMap.class, String.class, Integer.class);
        ValueInstantiator vi = new StdValueInstantiator(null, type);
        MapDeserializer deser = new MapDeserializer(type, vi, null, null, null);

        Assert.assertEquals(Integer.class, deser.getContentType().getRawClass());
        Assert.assertNull(deser.getContentDeserializer());
        Assert.assertEquals(type, deser.getValueType());
        Assert.assertEquals(TreeMap.class, deser.getMapClass());
    }

    @Test
    public void testWithResolved_sameInstanceIfNoChange() {
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        ValueInstantiator vi = new StdValueInstantiator(null, type);
        MapDeserializer deser = new MapDeserializer(type, vi, null, null, null);

        MapDeserializer resolved = deser.withResolved(null, null, null, null);
        Assert.assertSame(deser, resolved);

        HashSet<String> ignorable = new HashSet<String>(Collections.singletonList("ignore"));
        MapDeserializer changed = deser.withResolved(null, null, null, ignorable);
        Assert.assertNotSame(deser, changed);
    }

    @Test
    public void testCopyConstructor() {
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        ValueInstantiator vi = new StdValueInstantiator(null, type);
        MapDeserializer deser = new MapDeserializer(type, vi, null, null, null);

        MapDeserializer copy = new MapDeserializer(deser);
        Assert.assertEquals(deser.getValueType(), copy.getValueType());
        Assert.assertEquals(deser.getMapClass(), copy.getMapClass());
        Assert.assertTrue(copy.isCachable());
    }

    @Test(expected = JsonMappingException.class)
    public void testNoDefaultConstructor_throwsMappingException() throws Exception {
        JavaType type = mapper.getTypeFactory().constructMapType(Collections.unmodifiableMap(new HashMap<Object, Object>()).getClass(), String.class, String.class);
        mapper.readValue("{\"k\":\"v\"}", type);
    }

    @Test
    public void testWrapAndThrow_variants() throws Exception {
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        ValueInstantiator vi = new StdValueInstantiator(null, type);
        MapDeserializer deser = new MapDeserializer(type, vi, null, null, null);

        // InvocationTargetException unwrap & Error
        try {
            InvocationTargetException ite = new InvocationTargetException(new OutOfMemoryError("oom"));
            deser.wrapAndThrow(ite, this, "key");
            Assert.fail("Should throw OutOfMemoryError");
        } catch (OutOfMemoryError expected) {
            // Success
        }

        // IOException without JsonMappingException
        try {
            deser.wrapAndThrow(new IOException("io error"), this, "key");
            Assert.fail("Should throw IOException");
        } catch (IOException expected) {
            Assert.assertFalse(expected instanceof JsonMappingException);
        }

        // Deprecated wrapAndThrow(t, ref)
        try {
            deser.wrapAndThrow(new RuntimeException("runtime error"), this);
            Assert.fail("Should throw JsonMappingException");
        } catch (JsonMappingException expected) {
            Assert.assertNotNull(expected.getPath());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResolve_delegateWithoutDelegateType_throwsException() throws Exception {
        JavaType type = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        ValueInstantiator vi = new ValueInstantiator() {
            @Override
            public String getValueTypeDesc() { return "TestType"; }
            @Override
            public boolean canCreateUsingDelegate() { return true; }
            @Override
            public JavaType getDelegateType(DeserializationConfig config) { return null; }
        };

        MapDeserializer deser = new MapDeserializer(type, vi, null, null, null);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        deser.resolve(ctxt);
    }

    @Test
    public void testObjectId_forwardReferenceHandling() throws Exception {
        String json = "{\"items\":[{\"@id\":1,\"name\":\"first\",\"next\":2},{\"@id\":2,\"name\":\"second\",\"next\":1}]}";
        
        JavaType mapType = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, IdentifiedValue.class);
        JavaType wrapperType = mapper.getTypeFactory().constructParametricType(Map.class, String.class, Object.class);

        // Deserializing with object identity references resolving forward
        Map<String, Object> result = mapper.readValue(
                "{\"map\":{\"a\":{\"@id\":1,\"name\":\"A\",\"next\":2},\"b\":{\"@id\":2,\"name\":\"B\",\"next\":1}}}",
                wrapperType
        );

        Assert.assertNotNull(result);
        Assert.assertTrue(result.containsKey("map"));
    }

    @Test
    public void testIsStdKeyDeser_branches() {
        JavaType stringMapType = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        JavaType objectMapType = mapper.getTypeFactory().constructMapType(HashMap.class, Object.class, String.class);
        JavaType intMapType = mapper.getTypeFactory().constructMapType(HashMap.class, Integer.class, String.class);

        ValueInstantiator vi = new StdValueInstantiator(null, stringMapType);
        MapDeserializer deser = new MapDeserializer(stringMapType, vi, null, null, null);

        Assert.assertTrue(deser._isStdKeyDeser(stringMapType, null));
        Assert.assertTrue(deser._isStdKeyDeser(objectMapType, null));
        Assert.assertTrue(deser._isStdKeyDeser(intMapType, null)); // null keyDeser defaults to true

        CustomKeyDeserializer customKeyDeser = new CustomKeyDeserializer();
        Assert.assertFalse(deser._isStdKeyDeser(stringMapType, customKeyDeser));
        Assert.assertFalse(deser._isStdKeyDeser(intMapType, customKeyDeser));
    }
}
