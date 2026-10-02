import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;

public class StringArrayDeserializerTest {

    // ---------- Helper custom deserializer used to force the "custom element deserializer" path ----------
    public static class UpperCaseStringDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            String text = p.getText();
            return text == null ? null : text.toUpperCase();
        }
    }

    // ---------- Helper holder classes for custom-content / polymorphic tests ----------
    public static class CustomHolder {
        @JsonDeserialize(contentUsing = UpperCaseStringDeserializer.class)
        public String[] values;
    }

    public static class TypedHolder {
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.WRAPPER_ARRAY)
        public String[] values;
    }

    // ---------------------------------------------------------------------
    // Basic instance / constructor tests
    // ---------------------------------------------------------------------

    @Test
    public void testInstance_singleton_notNull() {
        assertNotNull(StringArrayDeserializer.instance);
        assertSame(StringArrayDeserializer.instance, StringArrayDeserializer.instance);
    }

    @Test
    public void testDefaultConstructor_createsUsableDeserializer() {
        StringArrayDeserializer deser = new StringArrayDeserializer();
        assertNotNull(deser);
    }

    // ---------------------------------------------------------------------
    // Normal / typical cases via ObjectMapper (uses StringArrayDeserializer internally)
    // ---------------------------------------------------------------------

    @Test
    public void testDeserialize_normalStringArray_returnsCorrectArray() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String[] result = mapper.readValue("[\"a\",\"b\",\"c\"]", String[].class);
        assertArrayEquals(new String[] {"a", "b", "c"}, result);
    }

    @Test
    public void testDeserialize_emptyArray_returnsEmptyArray() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String[] result = mapper.readValue("[]", String[].class);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testDeserialize_numberElements_convertedToStrings() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String[] result = mapper.readValue("[1,2,3]", String[].class);
        assertArrayEquals(new String[] {"1", "2", "3"}, result);
    }

    @Test
    public void testDeserialize_booleanElements_convertedToStrings() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String[] result = mapper.readValue("[true,false]", String[].class);
        assertArrayEquals(new String[] {"true", "false"}, result);
    }

    @Test
    public void testDeserialize_largeArray_triggersBufferChunkGrowth() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int count = 60;
        String[] expected = new String[count];
        for (int i = 0; i < count; i++) {
            if (i > 0) {
                sb.append(",");
            }
            String val = "e" + i;
            sb.append("\"").append(val).append("\"");
            expected[i] = val;
        }
        sb.append("]");

        String[] result = mapper.readValue(sb.toString(), String[].class);
        assertArrayEquals(expected, result);
    }

    // ---------------------------------------------------------------------
    // Edge cases: null handling
    // ---------------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testDeserialize_nullElementWithDefaultDeserializer_throwsNPE() throws IOException {
        // Default StringArrayDeserializer has a null _elementDeserializer.
        // When encountering VALUE_NULL, the standard path incorrectly calls
        // _elementDeserializer.getNullValue() which triggers a NullPointerException.
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("[\"a\",null,\"b\"]", String[].class);
    }

    @Test
    public void testDeserialize_nullElementWithCustomDeserializer_returnsNullEntry() throws IOException {
        // Using a custom content deserializer routes execution through _deserializeCustom,
        // where VALUE_NULL is handled directly without NPE.
        ObjectMapper mapper = new ObjectMapper();
        CustomHolder holder = mapper.readValue("{\"values\":[\"a\",null,\"b\"]}", CustomHolder.class);
        assertNotNull(holder.values);
        assertArrayEquals(new String[] {"A", null, "B"}, holder.values);
    }

    @Test
    public void testDeserialize_customContentDeserializer_upperCasesValues() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        CustomHolder holder = mapper.readValue("{\"values\":[\"a\",\"b\",\"c\"]}", CustomHolder.class);
        assertArrayEquals(new String[] {"A", "B", "C"}, holder.values);
    }

    // ---------------------------------------------------------------------
    // Edge cases: non-array input (handleNonArray)
    // ---------------------------------------------------------------------

    @Test
    public void testDeserialize_singleValueAsArrayEnabled_wrapsValueInArray() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        String[] result = mapper.readValue("\"hello\"", String[].class);
        assertArrayEquals(new String[] {"hello"}, result);
    }

    @Test
    public void testDeserialize_singleValueAsArrayEnabledWithNull_returnsArrayWithNull() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        String[] result = mapper.readValue("null", String[].class);
        // top-level null is typically handled before reaching deserializer,
        // resulting in a null result rather than an array.
        assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_nonArrayWithoutFeatureEnabled_throwsMappingException() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // Feature ACCEPT_SINGLE_VALUE_AS_ARRAY is disabled by default.
        mapper.readValue("\"hello\"", String[].class);
    }

    @Test
    public void testDeserialize_emptyStringWithEmptyAsNullFeatureEnabled_returnsNull() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        String[] result = mapper.readValue("\"\"", String[].class);
        assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_nonEmptyStringWithEmptyAsNullFeature_stillThrows() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        // Non-empty string still triggers the mapping exception because
        // ACCEPT_SINGLE_VALUE_AS_ARRAY remains disabled.
        mapper.readValue("\"hello\"", String[].class);
    }

    // ---------------------------------------------------------------------
    // deserializeWithType via polymorphic type handling
    // ---------------------------------------------------------------------

    @Test
    public void testDeserializeWithType_typedArrayProperty_roundTripsCorrectly() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TypedHolder original = new TypedHolder();
        original.values = new String[] {"x", "y", "z"};

        String json = mapper.writeValueAsString(original);
        TypedHolder result = mapper.readValue(json, TypedHolder.class);

        assertNotNull(result.values);
        assertArrayEquals(original.values, result.values);
    }

    // ---------------------------------------------------------------------
    // Additional boundary/edge cases
    // ---------------------------------------------------------------------

    @Test
    public void testDeserialize_singleElementArray_returnsSingleElementArray() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String[] result = mapper.readValue("[\"onlyOne\"]", String[].class);
        assertArrayEquals(new String[] {"onlyOne"}, result);
    }

    @Test
    public void testDeserialize_arrayWithEmptyStringElement_returnsEmptyStringElement() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String[] result = mapper.readValue("[\"\"]", String[].class);
        assertArrayEquals(new String[] {""}, result);
    }
}
