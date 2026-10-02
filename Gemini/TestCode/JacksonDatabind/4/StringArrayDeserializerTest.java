package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.util.StdConverter;
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

    static class CustomUppercaseStringDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            String val = p.getText();
            return (val != null) ? val.toUpperCase() : null;
        }

        @Override
        public String getNullValue() {
            return "NULL_VALUE";
        }
    }

    static class UpperCaseConverter extends StdConverter<String, String> {
        @Override
        public String convert(String value) {
            return value == null ? null : value.toUpperCase();
        }
    }

    static class BeanWithConvertedArray {
        @JsonDeserialize(contentConverter = UpperCaseConverter.class)
        public String[] values;
    }

    static class BeanWithCustomDeserializerArray {
        @JsonDeserialize(contentUsing = CustomUppercaseStringDeserializer.class)
        public String[] values;
    }

    static class ArrayWrapper {
        public Object array;

        @JsonCreator
        public ArrayWrapper(@JsonProperty("array") Object array) {
            this.array = array;
        }
    }

    @Test
    public void testInstanceAndConstructor() {
        StringArrayDeserializer defaultDeser = StringArrayDeserializer.instance;
        Assert.assertNotNull(defaultDeser);

        StringArrayDeserializer customDeser = new StringArrayDeserializer(new CustomUppercaseStringDeserializer());
        Assert.assertNotNull(customDeser);
    }

    @Test
    public void testDeserialize_standardEmptyArray() throws IOException {
        String json = "[]";
        String[] result = mapper.readValue(json, String[].class);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void testDeserialize_standardStrings() throws IOException {
        String json = "[\"a\", \"b\", \"hello world\", \"\"]";
        String[] result = mapper.readValue(json, String[].class);
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(new String[]{"a", "b", "hello world", ""}, result);
    }

    @Test
    public void testDeserialize_standardWithNull() throws IOException {
        String json = "[\"first\", null, \"second\"]";
        String[] result = mapper.readValue(json, String[].class);
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(new String[]{"first", null, "second"}, result);
    }

    @Test
    public void testDeserialize_standardNonStringTokensCoercedToString() throws IOException {
        String json = "[123, true, false, 45.67]";
        String[] result = mapper.readValue(json, String[].class);
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(new String[]{"123", "true", "false", "45.67"}, result);
    }

    @Test
    public void testDeserialize_standardLargeArrayChunking() throws IOException {
        StringBuilder sb = new StringBuilder("[");
        int count = 15000;
        for (int i = 0; i < count; i++) {
            if (i > 0) sb.append(",");
            sb.append("\"item").append(i).append("\"");
        }
        sb.append("]");

        String[] result = mapper.readValue(sb.toString(), String[].class);
        Assert.assertNotNull(result);
        Assert.assertEquals(count, result.length);
        Assert.assertEquals("item0", result[0]);
        Assert.assertEquals("item14999", result[count - 1]);
    }

    @Test
    public void testDeserialize_customDeserializerStringsAndNull() throws IOException {
        String json = "{\"values\": [\"foo\", \"bar\", null]}";
        BeanWithCustomDeserializerArray result = mapper.readValue(json, BeanWithCustomDeserializerArray.class);
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(new String[]{"FOO", "BAR", "NULL_VALUE"}, result.values);
    }

    @Test
    public void testDeserialize_customDeserializerLargeArrayChunking() throws IOException {
        StringBuilder sb = new StringBuilder("{\"values\": [");
        int count = 15000;
        for (int i = 0; i < count; i++) {
            if (i > 0) sb.append(",");
            sb.append("\"val").append(i).append("\"");
        }
        sb.append("]}");

        BeanWithCustomDeserializerArray result = mapper.readValue(sb.toString(), BeanWithCustomDeserializerArray.class);
        Assert.assertNotNull(result);
        Assert.assertEquals(count, result.values.length);
        Assert.assertEquals("VAL0", result.values[0]);
        Assert.assertEquals("VAL14999", result.values[count - 1]);
    }

    @Test
    public void testDeserialize_contentConverterViaContextual() throws IOException {
        String json = "{\"values\": [\"test\", \"case\"]";
        json += "}";
        BeanWithConvertedArray result = mapper.readValue(json, BeanWithConvertedArray.class);
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(new String[]{"TEST", "CASE"}, result.values);
    }

    @Test
    public void testDeserialize_singleValueAsArrayEnabled() throws IOException {
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        String jsonString = "\"single\"";
        String[] resultString = mapper.readValue(jsonString, String[].class);
        Assert.assertArrayEquals(new String[]{"single"}, resultString);

        String jsonNull = "null";
        String[] resultNull = mapper.readValue(jsonNull, String[].class);
        Assert.assertNull(resultNull);

        String jsonInt = "12345";
        String[] resultInt = mapper.readValue(jsonInt, String[].class);
        Assert.assertArrayEquals(new String[]{"12345"}, resultInt);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_nonArrayWhenFeatureDisabled_shouldThrow() throws IOException {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.readValue("123", String[].class);
    }

    @Test
    public void testDeserialize_emptyStringAsNullObjectEnabled() throws IOException {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        String[] result = mapper.readValue("\"\"", String[].class);
        Assert.assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_emptyStringAsNullObjectDisabled_shouldThrow() throws IOException {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.disable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        mapper.readValue("\"\"", String[].class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_nonEmptyStringWhenSingleValueDisabled_shouldThrow() throws IOException {
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        mapper.readValue("\"nonEmpty\"", String[].class);
    }

    @Test
    public void testDeserializeWithType_polymorphicArray() throws IOException {
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);

        String[] original = new String[]{"one", "two"};
        ArrayWrapper wrapper = new ArrayWrapper(original);

        String json = mapper.writeValueAsString(wrapper);
        ArrayWrapper deserializedWrapper = mapper.readValue(json, ArrayWrapper.class);

        Assert.assertNotNull(deserializedWrapper);
        Assert.assertTrue(deserializedWrapper.array instanceof String[]);
        Assert.assertArrayEquals(original, (String[]) deserializedWrapper.array);
    }

    @Test
    public void testCreateContextual_defaultDeserializerOptimization() throws IOException {
        String json = "[\"a\", \"b\"]";
        String[] result = mapper.readValue(json, String[].class);
        Assert.assertArrayEquals(new String[]{"a", "b"}, result);
    }

    @Test
    public void testCreateContextual_globalCustomDeserializer() throws IOException {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(String.class, new CustomUppercaseStringDeserializer());
        mapper.registerModule(module);

        String[] result = mapper.readValue("[\"apple\", \"banana\"]", String[].class);
        Assert.assertArrayEquals(new String[]{"APPLE", "BANANA"}, result);
    }
}
