package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class StringCollectionDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    public static class UpperCaseDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            String text = p.getText();
            return (text == null) ? null : text.toUpperCase();
        }
    }

    public static class CustomListWrapper {
        @JsonDeserialize(contentUsing = UpperCaseDeserializer.class)
        public List<String> items;
    }

    public static class FormatAcceptSingleWrapper {
        @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
        public Collection<String> items;
    }

    public static class SkipNullContentWrapper {
        @JsonSetter(contentNulls = Nulls.SKIP)
        public Collection<String> items;
    }

    public static class DelegatingStringList extends ArrayList<String> {
        public DelegatingStringList() {
            super();
        }

        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public DelegatingStringList(String val) {
            super();
            add("delegated:" + val);
        }
    }

    public static class DelegatingWrapper {
        public DelegatingStringList list;
    }

    public static class TypedWrapper {
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
        public Object data;
    }

    @Test
    public void testConstructorAndGetters() {
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        ValueInstantiator.Base vi = new ValueInstantiator.Base(type);
        StringCollectionDeserializer deser = new StringCollectionDeserializer(type, null, vi);

        Assert.assertNull(deser.getContentDeserializer());
        Assert.assertSame(vi, deser.getValueInstantiator());
        Assert.assertTrue(deser.isCachable());
    }

    @Test
    public void testIsCachable_WithCustomDeserializers_ReturnsFalse() {
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        ValueInstantiator.Base vi = new ValueInstantiator.Base(type);
        UpperCaseDeserializer valDeser = new UpperCaseDeserializer();

        StringCollectionDeserializer deserWithValue = new StringCollectionDeserializer(type, vi, null, valDeser, null, null);
        Assert.assertFalse(deserWithValue.isCachable());
        Assert.assertSame(valDeser, deserWithValue.getContentDeserializer());

        StringCollectionDeserializer deserWithDelegate = new StringCollectionDeserializer(type, vi, valDeser, null, null, null);
        Assert.assertFalse(deserWithDelegate.isCachable());
    }

    @Test
    public void testWithResolved_IdenticalParams_ReturnsSameInstance() {
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        ValueInstantiator.Base vi = new ValueInstantiator.Base(type);
        NullValueProvider nuller = NullsConstantProvider.nuller();

        StringCollectionDeserializer deser = new StringCollectionDeserializer(type, vi, null, null, nuller, Boolean.TRUE);
        StringCollectionDeserializer same = deser.withResolved(null, null, nuller, Boolean.TRUE);
        Assert.assertSame(deser, same);

        StringCollectionDeserializer modified = deser.withResolved(null, null, nuller, Boolean.FALSE);
        Assert.assertNotSame(deser, modified);
    }

    @Test
    public void testDeserialize_StandardArrayOfStrings() throws Exception {
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        List<String> result = mapper.readValue("[\"apple\", \"banana\", \"cherry\"]", type);

        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.size());
        Assert.assertEquals(Arrays.asList("apple", "banana", "cherry"), result);
    }

    @Test
    public void testDeserialize_EmptyArray() throws Exception {
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        List<String> result = mapper.readValue("[]", type);

        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testDeserialize_NonStringTokens_ParsedAsString() throws Exception {
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        List<String> result = mapper.readValue("[123, true, 45.67]", type);

        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.size());
        Assert.assertEquals("123", result.get(0));
        Assert.assertEquals("true", result.get(1));
        Assert.assertEquals("45.67", result.get(2));
    }

    @Test
    public void testDeserialize_WithNullValues_DefaultNullProvider() throws Exception {
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        List<String> result = mapper.readValue("[\"a\", null, \"b\"]", type);

        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.size());
        Assert.assertEquals("a", result.get(0));
        Assert.assertNull(result.get(1));
        Assert.assertEquals("b", result.get(2));
    }

    @Test
    public void testDeserialize_WithNullValues_SkipNull() throws Exception {
        SkipNullContentWrapper result = mapper.readValue("{\"items\": [\"a\", null, \"b\"]}", SkipNullContentWrapper.class);

        Assert.assertNotNull(result.items);
        Assert.assertEquals(2, result.items.size());
        Assert.assertEquals(Arrays.asList("a", "b"), new ArrayList<String>(result.items));
    }

    @Test
    public void testDeserialize_CustomContentDeserializer_NormalAndNull() throws Exception {
        CustomListWrapper result = mapper.readValue("{\"items\": [\"first\", \"second\", null]}", CustomListWrapper.class);

        Assert.assertNotNull(result.items);
        Assert.assertEquals(3, result.items.size());
        Assert.assertEquals("FIRST", result.items.get(0));
        Assert.assertEquals("SECOND", result.items.get(1));
        Assert.assertNull(result.items.get(2));
    }

    @Test
    public void testDeserialize_SingleValue_UnwrapSingleViaAnnotation() throws Exception {
        FormatAcceptSingleWrapper result = mapper.readValue("{\"items\": \"standalone\"}", FormatAcceptSingleWrapper.class);

        Assert.assertNotNull(result.items);
        Assert.assertEquals(1, result.items.size());
        Assert.assertEquals("standalone", result.items.iterator().next());
    }

    @Test
    public void testDeserialize_SingleValue_UnwrapSingleViaFeature() throws Exception {
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);

        List<String> result = mapper.readValue("\"standalone\"", type);
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("standalone", result.get(0));
    }

    @Test
    public void testDeserialize_SingleValue_Null_FeatureEnabled() throws Exception {
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);

        List<String> result = mapper.readValue("null", type);
        Assert.assertNull(result);
    }

    @Test
    public void testDeserialize_SingleValue_CustomContentDeserializer() throws Exception {
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        CustomListWrapper result = mapper.readValue("{\"items\": \"standalone\"}", CustomListWrapper.class);

        Assert.assertNotNull(result.items);
        Assert.assertEquals(1, result.items.size());
        Assert.assertEquals("STANDALONE", result.items.get(0));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_SingleValue_DisabledThrowsException() throws Exception {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);

        mapper.readValue("12345", type);
    }

    @Test
    public void testDeserialize_IntoExistingCollection() throws Exception {
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JsonParser parser = mapper.getFactory().createParser("[\"foo\", \"bar\"]");
        parser.nextToken();

        JsonDeserializer<Object> deser = ctxt.findRootValueDeserializer(type);
        Assert.assertTrue(deser instanceof StringCollectionDeserializer);

        List<String> existing = new ArrayList<String>();
        existing.add("initial");
        ((StringCollectionDeserializer) deser).deserialize(parser, ctxt, existing);

        Assert.assertEquals(3, existing.size());
        Assert.assertEquals(Arrays.asList("initial", "foo", "bar"), existing);
        parser.close();
    }

    @Test
    public void testDeserialize_DelegatingCreator() throws Exception {
        DelegatingWrapper result = mapper.readValue("{\"list\": \"delegateArg\"}", DelegatingWrapper.class);

        Assert.assertNotNull(result.list);
        Assert.assertEquals(1, result.list.size());
        Assert.assertEquals("delegated:delegateArg", result.list.get(0));
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, String.class);
        TypeDeserializer typeDeser = new AsArrayTypeDeserializer(type,
                new ClassNameIdResolver(type, TypeFactory.defaultInstance()),
                null, false, type);

        DeserializationContext ctxt = mapper.getDeserializationContext();
        String json = "[\"java.util.ArrayList\", [\"val1\", \"val2\"]]";
        JsonParser p = mapper.getFactory().createParser(json);
        p.nextToken();

        StringCollectionDeserializer deser = new StringCollectionDeserializer(type, null, new ValueInstantiator.Base(type));
        @SuppressWarnings("unchecked")
        Collection<String> result = (Collection<String>) deser.deserializeWithType(p, ctxt, typeDeser);

        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(Arrays.asList("val1", "val2"), new ArrayList<String>(result));
        p.close();
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_ExceptionWrapping() throws Exception {
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        JsonParser parser = mapper.getFactory().createParser("[\"valid\", { \"invalid\": \"object\" }]");
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        JsonDeserializer<Object> deser = ctxt.findRootValueDeserializer(type);

        deser.deserialize(parser, ctxt);
        parser.close();
    }

    @Test
    public void testCreateContextual_CustomContentConverter() throws Exception {
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        StringCollectionDeserializer deser = new StringCollectionDeserializer(type, null, new ValueInstantiator.Base(type));

        JsonDeserializer<?> contextual = deser.createContextual(ctxt, null);
        Assert.assertNotNull(contextual);
        Assert.assertTrue(contextual instanceof StringCollectionDeserializer);
    }
}
