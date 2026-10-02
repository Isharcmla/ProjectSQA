package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class CollectionDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();
    private final JsonFactory jsonFactory = new JsonFactory();

    // Helper classes for testing
    static class StringListWrapper {
        @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
        public List<String> singleWrapped;

        @JsonFormat(without = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
        public List<String> singleNotWrapped;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
    static abstract class BaseItem {
        public String name;
    }

    static class SubItem extends BaseItem {
        public int id;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class IdentifiedItem {
        public int id;
        public String value;

        public IdentifiedItem() {}
        public IdentifiedItem(int id, String value) {
            this.id = id;
            this.value = value;
        }
    }

    static class CustomListInstantiator extends ValueInstantiator {
        private final boolean canDelegate;
        private final boolean returnNullDelegateType;

        public CustomListInstantiator(boolean canDelegate, boolean returnNullDelegateType) {
            this.canDelegate = canDelegate;
            this.returnNullDelegateType = returnNullDelegateType;
        }

        @Override
        public String getValueTypeDesc() {
            return "CustomList";
        }

        @Override
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override
        public Object createUsingDefault(DeserializationContext ctxt) {
            return new ArrayList<Object>();
        }

        @Override
        public boolean canCreateFromString() {
            return true;
        }

        @Override
        public Object createFromString(DeserializationContext ctxt, String value) {
            ArrayList<Object> list = new ArrayList<Object>();
            if (value != null && !value.isEmpty()) {
                list.add(value);
            }
            return list;
        }

        @Override
        public boolean canCreateUsingDelegate() {
            return canDelegate;
        }

        @Override
        public JavaType getDelegateType(DeserializationConfig config) {
            if (returnNullDelegateType) {
                return null;
            }
            return TypeFactory.defaultInstance().constructType(String.class);
        }

        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) {
            ArrayList<Object> list = new ArrayList<Object>();
            list.add(delegate);
            return list;
        }
    }

    // Subclass to expose protected methods
    static class TestableCollectionDeserializer extends CollectionDeserializer {
        private static final long serialVersionUID = 1L;

        public TestableCollectionDeserializer(JavaType collectionType,
                                             JsonDeserializer<Object> valueDeser,
                                             TypeDeserializer valueTypeDeser,
                                             ValueInstantiator valueInstantiator) {
            super(collectionType, valueDeser, valueTypeDeser, valueInstantiator);
        }

        public TestableCollectionDeserializer(JavaType collectionType,
                                             JsonDeserializer<Object> valueDeser,
                                             TypeDeserializer valueTypeDeser,
                                             ValueInstantiator valueInstantiator,
                                             JsonDeserializer<Object> delegateDeser,
                                             Boolean unwrapSingle) {
            super(collectionType, valueDeser, valueTypeDeser, valueInstantiator, delegateDeser, unwrapSingle);
        }

        public TestableCollectionDeserializer(CollectionDeserializer src) {
            super(src);
        }

        @Override
        public CollectionDeserializer withResolved(JsonDeserializer<?> dd, JsonDeserializer<?> vd,
                                                   TypeDeserializer vtd, Boolean unwrapSingle) {
            return super.withResolved(dd, vd, vtd, unwrapSingle);
        }

        @Override
        public CollectionDeserializer withResolved(JsonDeserializer<?> dd, JsonDeserializer<?> vd,
                                                   TypeDeserializer vtd) {
            return super.withResolved(dd, vd, vtd);
        }

        @Override
        public Collection<Object> handleNonArray(JsonParser p, DeserializationContext ctxt,
                                                Collection<Object> result) throws IOException {
            return super.handleNonArray(p, ctxt, result);
        }
    }

    @Test
    public void testConstructorsAndAccessors() {
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        CustomListInstantiator instantiator = new CustomListInstantiator(false, false);
        
        TestableCollectionDeserializer deser = new TestableCollectionDeserializer(listType, null, null, instantiator);
        Assert.assertEquals(TypeFactory.defaultInstance().constructType(String.class), deser.getContentType());
        Assert.assertNull(deser.getContentDeserializer());
        Assert.assertTrue(deser.isCachable());

        TestableCollectionDeserializer copyDeser = new TestableCollectionDeserializer(deser);
        Assert.assertEquals(listType.getContentType(), copyDeser.getContentType());
        Assert.assertTrue(copyDeser.isCachable());
    }

    @Test
    public void testIsCachable() {
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        CustomListInstantiator instantiator = new CustomListInstantiator(false, false);
        JsonDeserializer<Object> dummyDeser = new StdDeserializer<Object>(String.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        };

        // All null -> cachable
        TestableCollectionDeserializer deser1 = new TestableCollectionDeserializer(listType, null, null, instantiator, null, null);
        Assert.assertTrue(deser1.isCachable());

        // Value deserializer present -> not cachable
        TestableCollectionDeserializer deser2 = new TestableCollectionDeserializer(listType, dummyDeser, null, instantiator, null, null);
        Assert.assertFalse(deser2.isCachable());

        // Delegate deserializer present -> not cachable
        TestableCollectionDeserializer deser3 = new TestableCollectionDeserializer(listType, null, null, instantiator, dummyDeser, null);
        Assert.assertFalse(deser3.isCachable());
    }

    @Test
    public void testWithResolved() {
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        CustomListInstantiator instantiator = new CustomListInstantiator(false, false);
        TestableCollectionDeserializer deser = new TestableCollectionDeserializer(listType, null, null, instantiator, null, Boolean.TRUE);

        // Same parameters -> returns same instance
        CollectionDeserializer sameDeser = deser.withResolved(null, null, null, Boolean.TRUE);
        Assert.assertSame(deser, sameDeser);

        // Different parameters -> returns new instance
        CollectionDeserializer diffDeser = deser.withResolved(null, null, null, Boolean.FALSE);
        Assert.assertNotSame(deser, diffDeser);

        // Deprecated 3-arg overload
        CollectionDeserializer depDeser = deser.withResolved(null, null, null);
        Assert.assertSame(deser, depDeser);
    }

    @Test
    public void testDeserializeNormalArray() throws Exception {
        String json = "[\"a\", \"b\", null, \"c\"]";
        List<?> result = mapper.readValue(json, List.class);
        Assert.assertEquals(4, result.size());
        Assert.assertEquals("a", result.get(0));
        Assert.assertEquals("b", result.get(1));
        Assert.assertNull(result.get(2));
        Assert.assertEquals("c", result.get(3));
    }

    @Test
    public void testDeserializeEmptyArray() throws Exception {
        String json = "[]";
        List<?> result = mapper.readValue(json, List.class);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testDeserializeEmptyString() throws Exception {
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        CustomListInstantiator instantiator = new CustomListInstantiator(false, false);
        CollectionDeserializer deser = new CollectionDeserializer(listType, null, null, instantiator);

        JsonParser parser = jsonFactory.createParser("\"\"");
        parser.nextToken(); // Move to VALUE_STRING
        DeserializationContext ctxt = mapper.getDeserializationContext();

        Collection<Object> res = deser.deserialize(parser, ctxt);
        Assert.assertNotNull(res);
        Assert.assertTrue(res.isEmpty());
    }

    @Test
    public void testDeserializeWithDelegate() throws Exception {
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        CustomListInstantiator instantiator = new CustomListInstantiator(true, false);
        JsonDeserializer<Object> stringDeser = new StdDeserializer<Object>(String.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return p.getText();
            }
        };
        CollectionDeserializer deser = new CollectionDeserializer(listType, null, null, instantiator, stringDeser, null);

        JsonParser parser = jsonFactory.createParser("\"delegated_value\"");
        DeserializationContext ctxt = mapper.getDeserializationContext();

        Collection<Object> res = deser.deserialize(parser, ctxt);
        Assert.assertNotNull(res);
        Assert.assertEquals(1, res.size());
        Assert.assertEquals("delegated_value", res.iterator().next());
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        SubItem item = new SubItem();
        item.name = "sub1";
        item.id = 123;
        List<BaseItem> list = Collections.singletonList(item);

        String json = mapper.writeValueAsString(list);
        JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, BaseItem.class);
        List<BaseItem> result = mapper.readValue(json, type);

        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.get(0) instanceof SubItem);
        Assert.assertEquals("sub1", result.get(0).name);
        Assert.assertEquals(123, ((SubItem) result.get(0)).id);
    }

    @Test
    public void testSingleValueAsArrayFeature() throws Exception {
        ObjectMapper mapperSingle = new ObjectMapper();
        mapperSingle.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        String json = "\"single_item\"";
        JavaType type = mapperSingle.getTypeFactory().constructCollectionType(ArrayList.class, String.class);
        List<String> result = mapperSingle.readValue(json, type);

        Assert.assertEquals(1, result.size());
        Assert.assertEquals("single_item", result.get(0));
    }

    @Test
    public void testSingleValueAsArrayAnnotation() throws Exception {
        String json = "{\"singleWrapped\":\"onlyOne\", \"singleNotWrapped\":[\"one\"]}";
        StringListWrapper wrapper = mapper.readValue(json, StringListWrapper.class);

        Assert.assertNotNull(wrapper.singleWrapped);
        Assert.assertEquals(1, wrapper.singleWrapped.size());
        Assert.assertEquals("onlyOne", wrapper.singleWrapped.get(0));
    }

    @Test(expected = JsonMappingException.class)
    public void testNonArrayThrowsWhenFeatureDisabled() throws Exception {
        ObjectMapper strictMapper = new ObjectMapper();
        strictMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        String json = "\"not_an_array\"";
        JavaType type = strictMapper.getTypeFactory().constructCollectionType(ArrayList.class, String.class);
        strictMapper.readValue(json, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testSingleValueAnnotationDisabledThrows() throws Exception {
        ObjectMapper mapperStrict = new ObjectMapper();
        mapperStrict.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY); // Global enabled, but property disabled

        String json = "{\"singleNotWrapped\":\"should_fail\"}";
        mapperStrict.readValue(json, StringListWrapper.class);
    }

    @Test
    public void testHandleNonArrayNullValue() throws Exception {
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        CustomListInstantiator instantiator = new CustomListInstantiator(false, false);
        JsonDeserializer<Object> dummyDeser = new StdDeserializer<Object>(String.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) { return "val"; }
            @Override
            public Object getNullValue(DeserializationContext ctxt) { return "NULL_OVERRIDE"; }
        };

        TestableCollectionDeserializer deser = new TestableCollectionDeserializer(listType, dummyDeser, null, instantiator, null, Boolean.TRUE);

        JsonParser parser = jsonFactory.createParser("null");
        parser.nextToken();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        Collection<Object> list = new ArrayList<Object>();
        deser.handleNonArray(parser, ctxt, list);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("NULL_OVERRIDE", list.iterator().next());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateContextualInvalidDelegateDefinitionThrows() throws Exception {
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        // Returns canCreateUsingDelegate = true, but getDelegateType = null
        CustomListInstantiator instantiator = new CustomListInstantiator(true, true);
        CollectionDeserializer deser = new CollectionDeserializer(listType, null, null, instantiator);

        DeserializationContext ctxt = mapper.getDeserializationContext();
        deser.createContextual(ctxt, null);
    }

    @Test
    public void testExceptionHandlingWithWrapExceptionsDisabled() throws Exception {
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        CustomListInstantiator instantiator = new CustomListInstantiator(false, false);
        JsonDeserializer<Object> throwingDeser = new StdDeserializer<Object>(String.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                throw new IllegalStateException("Custom error");
            }
        };

        CollectionDeserializer deser = new CollectionDeserializer(listType, throwingDeser, null, instantiator);
        ObjectMapper unwrappedMapper = new ObjectMapper();
        unwrappedMapper.disable(DeserializationFeature.WRAP_EXCEPTIONS);

        JsonParser parser = jsonFactory.createParser("[\"fail\"]");
        DeserializationContext ctxt = unwrappedMapper.getDeserializationContext();

        try {
            deser.deserialize(parser, ctxt);
            Assert.fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertEquals("Custom error", e.getMessage());
        }
    }

    @Test
    public void testCollectionReferringAccumulatorNormalAndChained() throws Exception {
        Collection<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);

        // Add regular value
        accumulator.add("item1");
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("item1", result.iterator().next());

        // Create unresolved reference 1
        UnresolvedForwardReference ref1 = new UnresolvedForwardReference(null, "Unresolved 1", new JsonLocation(null, 0, 0, 0),
                new ReadableObjectId(1));
        Referring referring1 = accumulator.handleUnresolvedReference(ref1);

        // Add value following unresolved 1
        accumulator.add("afterRef1");

        // Create unresolved reference 2
        UnresolvedForwardReference ref2 = new UnresolvedForwardReference(null, "Unresolved 2", new JsonLocation(null, 0, 0, 0),
                new ReadableObjectId(2));
        Referring referring2 = accumulator.handleUnresolvedReference(ref2);

        accumulator.add("afterRef2");

        // Resolve ref 1
        referring1.handleResolvedForwardReference(1, "resolvedItem1");
        // Resolve ref 2
        referring2.handleResolvedForwardReference(2, "resolvedItem2");

        List<Object> resultList = (List<Object>) result;
        Assert.assertEquals(5, resultList.size());
        Assert.assertEquals("item1", resultList.get(0));
        Assert.assertEquals("resolvedItem1", resultList.get(1));
        Assert.assertEquals("afterRef1", resultList.get(2));
        Assert.assertEquals("resolvedItem2", resultList.get(3));
        Assert.assertEquals("afterRef2", resultList.get(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCollectionReferringAccumulatorUnknownIdThrows() throws Exception {
        Collection<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator accumulator =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);

        UnresolvedForwardReference ref = new UnresolvedForwardReference(null, "Unresolved", new JsonLocation(null, 0, 0, 0),
                new ReadableObjectId(100));
        accumulator.handleUnresolvedReference(ref);

        // Resolving an ID that does not exist in accumulator
        accumulator.resolveForwardReference(999, "unknown");
    }

    @Test(expected = JsonMappingException.class)
    public void testUnresolvedForwardReferenceWithoutObjectIdReaderThrows() throws Exception {
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        CustomListInstantiator instantiator = new CustomListInstantiator(false, false);
        JsonDeserializer<Object> unresDeser = new StdDeserializer<Object>(String.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                throw new UnresolvedForwardReference(p, "No ID Info", p.getCurrentLocation(), new ReadableObjectId("key"));
            }
            @Override
            public ObjectIdReader getObjectIdReader() {
                return null;
            }
        };

        CollectionDeserializer deser = new CollectionDeserializer(listType, unresDeser, null, instantiator);
        JsonParser parser = jsonFactory.createParser("[\"unresolved\"]");
        DeserializationContext ctxt = mapper.getDeserializationContext();

        deser.deserialize(parser, ctxt);
    }

    @Test
    public void testDeserializeWithForwardReferencesEndToEnd() throws Exception {
        String json = "[ {\"@id\": 1, \"id\": 1, \"value\": \"first\"}, 1 ]";
        JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, IdentifiedItem.class);
        List<IdentifiedItem> list = mapper.readValue(json, type);

        Assert.assertEquals(2, list.size());
        Assert.assertEquals(list.get(0), list.get(1));
        Assert.assertEquals("first", list.get(1).value);
    }
}
