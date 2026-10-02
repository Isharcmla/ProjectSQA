package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class StringArrayDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    static class Wrapper {
        public String[] values;
    }

    static class PolymorphicWrapper {
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.WRAPPER_ARRAY)
        public Object data;
    }

    static class CustomUpperStringDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return jp.getText().toUpperCase();
        }

        @Override
        public String getNullValue() {
            return "NULL_VALUE";
        }
    }

    @Test
    public void testInstanceAndConstructors() {
        Assert.assertNotNull(StringArrayDeserializer.instance);
        StringArrayDeserializer deserDefault = new StringArrayDeserializer();
        Assert.assertNotNull(deserDefault);

        CustomUpperStringDeserializer custom = new CustomUpperStringDeserializer();
        StringArrayDeserializer deserCustom = new StringArrayDeserializer(custom);
        Assert.assertNotNull(deserCustom);
    }

    @Test
    public void testDeserialize_standardArray_returnsStringArray() throws Exception {
        String json = "[\"hello\", \"world\", \"123\"]";
        String[] result = mapper.readValue(json, String[].class);

        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("hello", result[0]);
        Assert.assertEquals("world", result[1]);
        Assert.assertEquals("123", result[2]);
    }

    @Test
    public void testDeserialize_emptyArray_returnsEmptyArray() throws Exception {
        String json = "[]";
        String[] result = mapper.readValue(json, String[].class);

        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void testDeserialize_typeCoercion_coercesToString() throws Exception {
        String json = "[123, true, 45.67]";
        String[] result = mapper.readValue(json, String[].class);

        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("123", result[0]);
        Assert.assertEquals("true", result[1]);
        Assert.assertEquals("45.67", result[2]);
    }

    @Test
    public void testDeserialize_largeArray_handlesBufferChunkGrowth() throws Exception {
        int count = 5000;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < count; i++) {
            if (i > 0) sb.append(",");
            sb.append("\"item").append(i).append("\"");
        }
        sb.append("]");

        String[] result = mapper.readValue(sb.toString(), String[].class);
        Assert.assertNotNull(result);
        Assert.assertEquals(count, result.length);
        Assert.assertEquals("item0", result[0]);
        Assert.assertEquals("item4999", result[4999]);
    }

    @Test
    public void testDeserialize_customElementDeserializer_modifiesValues() throws Exception {
        ObjectMapper customMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule("CustomModule", Version.unknownVersion());
        module.addDeserializer(String.class, new CustomUpperStringDeserializer());
        customMapper.registerModule(module);

        String json = "[\"abc\", \"def\", null]";
        String[] result = customMapper.readValue(json, String[].class);

        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("ABC", result[0]);
        Assert.assertEquals("DEF", result[1]);
        Assert.assertNull(result[2]);
    }

    @Test
    public void testDeserialize_customElementDeserializerLargeArray() throws Exception {
        ObjectMapper customMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule("CustomModule", Version.unknownVersion());
        module.addDeserializer(String.class, new CustomUpperStringDeserializer());
        customMapper.registerModule(module);

        int count = 5000;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < count; i++) {
            if (i > 0) sb.append(",");
            sb.append("\"item").append(i).append("\"");
        }
        sb.append("]");

        String[] result = customMapper.readValue(sb.toString(), String[].class);
        Assert.assertNotNull(result);
        Assert.assertEquals(count, result.length);
        Assert.assertEquals("ITEM0", result[0]);
        Assert.assertEquals("ITEM4999", result[4999]);
    }

    @Test
    public void testDeserialize_singleValueAsArray_string() throws Exception {
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String json = "\"single\"";
        String[] result = mapper.readValue(json, String[].class);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("single", result[0]);
    }

    @Test
    public void testDeserialize_singleValueAsArray_number() throws Exception {
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String json = "999";
        String[] result = mapper.readValue(json, String[].class);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("999", result[0]);
    }

    @Test
    public void testDeserialize_singleValueAsArray_null() throws Exception {
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String json = "null";
        String[] result = mapper.readValue(json, String[].class);

        Assert.assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_nonArrayDisabledSingleValue_throwsException() throws Exception {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String json = "\"notAnArray\"";
        mapper.readValue(json, String[].class);
    }

    @Test
    public void testDeserialize_emptyStringAsNullObject_returnsNull() throws Exception {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        String json = "\"\"";
        String[] result = mapper.readValue(json, String[].class);

        Assert.assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_emptyStringWithoutFeature_throwsException() throws Exception {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.disable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        String json = "\"\"";
        mapper.readValue(json, String[].class);
    }

    @Test
    public void testDeserializeWithType_polymorphicArray() throws Exception {
        PolymorphicWrapper wrapper = new PolymorphicWrapper();
        wrapper.data = new String[] { "poly1", "poly2" };

        String json = mapper.writeValueAsString(wrapper);
        PolymorphicWrapper result = mapper.readValue(json, PolymorphicWrapper.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result.data instanceof String[]);
        String[] array = (String[]) result.data;
        Assert.assertEquals(2, array.length);
        Assert.assertEquals("poly1", array[0]);
        Assert.assertEquals("poly2", array[1]);
    }

    @Test
    public void testCreateContextual_defaultDeserializerReturnsSameInstance() throws Exception {
        StringArrayDeserializer deser = new StringArrayDeserializer();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JsonDeserializer<?> contextual = deser.createContextual(ctxt, null);

        Assert.assertSame(deser, contextual);
    }

    @Test
    public void testCreateContextual_withCustomDeserializer() throws Exception {
        CustomUpperStringDeserializer customElementDeser = new CustomUpperStringDeserializer();
        StringArrayDeserializer deser = new StringArrayDeserializer(customElementDeser);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JsonDeserializer<?> contextual = deser.createContextual(ctxt, null);

        Assert.assertNotNull(contextual);
        Assert.assertTrue(contextual instanceof StringArrayDeserializer);
    }

    @Test
    public void testDirectDeserialize_emptyArrayParser() throws IOException {
        StringArrayDeserializer deser = new StringArrayDeserializer();
        JsonParser jp = mapper.getFactory().createParser("[]");
        jp.nextToken();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        String[] result = deser.deserialize(jp, ctxt);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void testDirectDeserializeCustom_nullAndValues() throws IOException {
        CustomUpperStringDeserializer custom = new CustomUpperStringDeserializer();
        StringArrayDeserializer deser = new StringArrayDeserializer(custom);
        JsonParser jp = mapper.getFactory().createParser("[\"test\", null]");
        jp.nextToken();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        String[] result = deser.deserialize(jp, ctxt);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.length);
        Assert.assertEquals("TEST", result[0]);
        Assert.assertNull(result[1]);
    }
}
