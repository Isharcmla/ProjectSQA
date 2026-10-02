package com.fasterxml.jackson.databind.deser.impl;

import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

public class JavaUtilCollectionsDeserializersTest {

    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
    }

    @Test
    public void testFindForCollection_arraysAsList_returnsDeserializer() throws Exception {
        JavaType type = typeFactory.constructType(Arrays.asList("a", "b").getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);

        Assert.assertNotNull(deser);
        Assert.assertTrue(deser instanceof StdDelegatingDeserializer);

        StdDelegatingDeserializer<?> delegatingDeser = (StdDelegatingDeserializer<?>) deser;
        Converter<Object, Object> conv = delegatingDeser.getConverter();

        List<String> input = new ArrayList<String>(Arrays.asList("1", "2"));
        Object result = conv.convert(input);
        Assert.assertSame(input, result);
    }

    @Test
    public void testFindForCollection_singletonList_returnsDeserializer() throws Exception {
        JavaType type = typeFactory.constructType(Collections.singletonList("a").getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);

        Assert.assertNotNull(deser);
        Assert.assertTrue(deser instanceof StdDelegatingDeserializer);

        StdDelegatingDeserializer<?> delegatingDeser = (StdDelegatingDeserializer<?>) deser;
        Converter<Object, Object> conv = delegatingDeser.getConverter();

        Object result = conv.convert(Collections.singletonList("item"));
        Assert.assertEquals(Collections.singletonList("item"), result);
    }

    @Test
    public void testFindForCollection_singletonSet_returnsDeserializer() throws Exception {
        JavaType type = typeFactory.constructType(Collections.singleton("a").getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);

        Assert.assertNotNull(deser);
        Assert.assertTrue(deser instanceof StdDelegatingDeserializer);

        StdDelegatingDeserializer<?> delegatingDeser = (StdDelegatingDeserializer<?>) deser;
        Converter<Object, Object> conv = delegatingDeser.getConverter();

        Object result = conv.convert(Collections.singleton("item"));
        Assert.assertEquals(Collections.singleton("item"), result);
    }

    @Test
    public void testFindForCollection_unmodifiableList_returnsDeserializer() throws Exception {
        JavaType type = typeFactory.constructType(Collections.unmodifiableList(new ArrayList<String>()).getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);

        Assert.assertNotNull(deser);
        Assert.assertTrue(deser instanceof StdDelegatingDeserializer);

        StdDelegatingDeserializer<?> delegatingDeser = (StdDelegatingDeserializer<?>) deser;
        Converter<Object, Object> conv = delegatingDeser.getConverter();

        List<String> input = new ArrayList<String>(Arrays.asList("a", "b"));
        Object result = conv.convert(input);
        Assert.assertEquals(input, result);
    }

    @Test
    public void testFindForCollection_unmodifiableSet_returnsDeserializer() throws Exception {
        JavaType type = typeFactory.constructType(Collections.unmodifiableSet(new HashSet<String>()).getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);

        Assert.assertNotNull(deser);
        Assert.assertTrue(deser instanceof StdDelegatingDeserializer);

        StdDelegatingDeserializer<?> delegatingDeser = (StdDelegatingDeserializer<?>) deser;
        Converter<Object, Object> conv = delegatingDeser.getConverter();

        Set<String> input = new HashSet<String>(Arrays.asList("a", "b"));
        Object result = conv.convert(input);
        Assert.assertEquals(input, result);
    }

    @Test
    public void testFindForCollection_unsupportedType_returnsNull() throws Exception {
        JavaType type = typeFactory.constructType(ArrayList.class);
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        Assert.assertNull(deser);
    }

    @Test
    public void testFindForMap_singletonMap_returnsDeserializer() throws Exception {
        JavaType type = typeFactory.constructType(Collections.singletonMap("key", "val").getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(null, type);

        Assert.assertNotNull(deser);
        Assert.assertTrue(deser instanceof StdDelegatingDeserializer);

        StdDelegatingDeserializer<?> delegatingDeser = (StdDelegatingDeserializer<?>) deser;
        Converter<Object, Object> conv = delegatingDeser.getConverter();

        Map<String, String> input = Collections.singletonMap("k1", "v1");
        Object result = conv.convert(input);
        Assert.assertEquals(input, result);
    }

    @Test
    public void testFindForMap_unmodifiableMap_returnsDeserializer() throws Exception {
        JavaType type = typeFactory.constructType(Collections.unmodifiableMap(new HashMap<String, String>()).getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(null, type);

        Assert.assertNotNull(deser);
        Assert.assertTrue(deser instanceof StdDelegatingDeserializer);

        StdDelegatingDeserializer<?> delegatingDeser = (StdDelegatingDeserializer<?>) deser;
        Converter<Object, Object> conv = delegatingDeser.getConverter();

        Map<String, String> input = new HashMap<String, String>();
        input.put("k1", "v1");
        Object result = conv.convert(input);
        Assert.assertEquals(input, result);
    }

    @Test
    public void testFindForMap_unsupportedType_returnsNull() throws Exception {
        JavaType type = typeFactory.constructType(HashMap.class);
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(null, type);
        Assert.assertNull(deser);
    }

    @Test
    public void testConverter_convertNull_returnsNull() {
        JavaType type = typeFactory.constructType(Collections.singletonList("a").getClass());
        Converter<Object, Object> conv = JavaUtilCollectionsDeserializers.converter(2, type, List.class);
        Assert.assertNull(conv.convert(null));
    }

    @Test
    public void testConverter_getInputTypeAndOutputType_returnExpectedType() {
        JavaType type = typeFactory.constructType(Collections.singletonList("a").getClass());
        Converter<Object, Object> conv = JavaUtilCollectionsDeserializers.converter(2, type, List.class);

        JavaType inputType = conv.getInputType(typeFactory);
        JavaType outputType = conv.getOutputType(typeFactory);

        Assert.assertNotNull(inputType);
        Assert.assertSame(inputType, outputType);
        Assert.assertEquals(List.class, inputType.getRawClass());
    }

    @Test
    public void testConverter_singletonList_emptyListThrowsException() {
        JavaType type = typeFactory.constructType(Collections.singletonList("a").getClass());
        Converter<Object, Object> conv = JavaUtilCollectionsDeserializers.converter(2, type, List.class);

        try {
            conv.convert(Collections.emptyList());
            Assert.fail("Expected IllegalArgumentException for empty list");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 0 entries"));
        }
    }

    @Test
    public void testConverter_singletonList_multipleEntriesThrowsException() {
        JavaType type = typeFactory.constructType(Collections.singletonList("a").getClass());
        Converter<Object, Object> conv = JavaUtilCollectionsDeserializers.converter(2, type, List.class);

        try {
            conv.convert(Arrays.asList("a", "b"));
            Assert.fail("Expected IllegalArgumentException for list with multiple elements");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 2 entries"));
        }
    }

    @Test
    public void testConverter_singletonSet_emptySetThrowsException() {
        JavaType type = typeFactory.constructType(Collections.singleton("a").getClass());
        Converter<Object, Object> conv = JavaUtilCollectionsDeserializers.converter(1, type, Set.class);

        try {
            conv.convert(Collections.emptySet());
            Assert.fail("Expected IllegalArgumentException for empty set");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 0 entries"));
        }
    }

    @Test
    public void testConverter_singletonSet_multipleEntriesThrowsException() {
        JavaType type = typeFactory.constructType(Collections.singleton("a").getClass());
        Converter<Object, Object> conv = JavaUtilCollectionsDeserializers.converter(1, type, Set.class);

        try {
            conv.convert(new HashSet<String>(Arrays.asList("a", "b")));
            Assert.fail("Expected IllegalArgumentException for set with multiple elements");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 2 entries"));
        }
    }

    @Test
    public void testConverter_singletonMap_emptyMapThrowsException() {
        JavaType type = typeFactory.constructType(Collections.singletonMap("k", "v").getClass());
        Converter<Object, Object> conv = JavaUtilCollectionsDeserializers.converter(3, type, Map.class);

        try {
            conv.convert(Collections.emptyMap());
            Assert.fail("Expected IllegalArgumentException for empty map");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 0 entries"));
        }
    }

    @Test
    public void testConverter_singletonMap_multipleEntriesThrowsException() {
        JavaType type = typeFactory.constructType(Collections.singletonMap("k", "v").getClass());
        Converter<Object, Object> conv = JavaUtilCollectionsDeserializers.converter(3, type, Map.class);

        Map<String, String> multiMap = new HashMap<String, String>();
        multiMap.put("k1", "v1");
        multiMap.put("k2", "v2");

        try {
            conv.convert(multiMap);
            Assert.fail("Expected IllegalArgumentException for map with multiple elements");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 2 entries"));
        }
    }

    @Test
    public void testConverter_defaultKind_returnsValueAsIs() {
        JavaType type = typeFactory.constructType(ArrayList.class);
        Converter<Object, Object> conv = JavaUtilCollectionsDeserializers.converter(999, type, List.class);

        String sample = "unchanged";
        Object result = conv.convert(sample);
        Assert.assertSame(sample, result);
    }
}
