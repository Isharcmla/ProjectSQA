import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class StringArrayDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // -------------------------------------------------------------------
    // Custom element deserializer used to trigger _deserializeCustom() path
    // and createContextual() non-default branch.
    // -------------------------------------------------------------------
    public static class UpperCaseStringDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return p.getText() == null ? null : p.getText().toUpperCase();
        }
    }

    public static class BeanWithCustomElementDeserializer {
        @JsonDeserialize(contentUsing = UpperCaseStringDeserializer.class)
        public String[] values;
    }

    public static class PolymorphicWrapper {
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
        public Object data;
    }

    // -------------------------------------------------------------------
    // instance field test
    // -------------------------------------------------------------------
    @Test
    public void testInstance_staticField_notNullAndIsCorrectType() {
        assertNotNull(StringArrayDeserializer.instance);
        assertTrue(StringArrayDeserializer.instance instanceof StringArrayDeserializer);
    }

    // -------------------------------------------------------------------
    // Default constructor
    // -------------------------------------------------------------------
    @Test
    public void testConstructor_default_createsInstance() {
        StringArrayDeserializer deser = new StringArrayDeserializer();
        assertNotNull(deser);
    }

    // -------------------------------------------------------------------
    // deserialize(): normal input
    // -------------------------------------------------------------------
    @Test
    public void testDeserialize_normalStringArray_returnsCorrectArray() throws IOException {
        String[] result = mapper.readValue("[\"a\",\"b\",\"c\"]", String[].class);
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
    }

    @Test
    public void testDeserialize_emptyArray_returnsEmptyArray() throws IOException {
        String[] result = mapper.readValue("[]", String[].class);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testDeserialize_arrayWithNullElement_returnsArrayWithNull() throws IOException {
        String[] result = mapper.readValue("[\"a\", null, \"c\"]", String[].class);
        assertArrayEquals(new String[]{"a", null, "c"}, result);
    }

    @Test
    public void testDeserialize_arrayWithNumbers_convertsToStrings() throws IOException {
        String[] result = mapper.readValue("[1, 2, 3]", String[].class);
        assertArrayEquals(new String[]{"1", "2", "3"}, result);
    }

    @Test
    public void testDeserialize_arrayWithBooleans_convertsToStrings() throws IOException {
        String[] result = mapper.readValue("[true, false]", String[].class);
        assertArrayEquals(new String[]{"true", "false"}, result);
    }

    // Edge case: large array to force ObjectBuffer chunk resize (branch ix >= chunk.length)
    @Test
    public void testDeserialize_largeArray_triggersChunkResizeAndReturnsCorrectArray() throws IOException {
        StringBuilder sb = new StringBuilder("[");
        int size = 500;
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("\"v").append(i).append("\"");
        }
        sb.append("]");
        String[] result = mapper.readValue(sb.toString(), String[].class);
        assertEquals(size, result.length);
        assertEquals("v0", result[0]);
        assertEquals("v499", result[size - 1]);
    }

    // -------------------------------------------------------------------
    // deserialize(): single value as array feature (handleNonArray branch)
    // -------------------------------------------------------------------
    @Test
    public void testDeserialize_singleValueAsArrayEnabled_wrapsSingleValue() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        String[] result = m.readValue("\"hello\"", String[].class);
        assertArrayEquals(new String[]{"hello"}, result);
    }

    @Test
    public void testDeserialize_singleValueAsArrayEnabledWithNull_wrapsNull() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        String[] result = m.readValue("null", String[].class);
        // top-level null typically returns null directly (handled before deserializer),
        // so this simply verifies no exception occurs.
        assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_singleValueNotArrayAndFeatureDisabled_throwsException() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, false);
        m.readValue("\"hello\"", String[].class);
    }

    // Edge case: empty string with ACCEPT_EMPTY_STRING_AS_NULL_OBJECT enabled
    @Test
    public void testDeserialize_emptyStringWithFeatureEnabled_returnsNull() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, false);
        m.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        String[] result = m.readValue("\"\"", String[].class);
        assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_nonEmptyStringWithFeatureEnabledButSingleValueDisabled_throwsException() throws IOException {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, false);
        m.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        m.readValue("\"nonempty\"", String[].class);
    }

    // -------------------------------------------------------------------
    // deserialize(): exception case - invalid token inside array (e.g. nested object)
    // -------------------------------------------------------------------
    @Test
    public void testDeserialize_invalidTokenInsideArray_throwsIOException() {
        boolean caught = false;
        try {
            mapper.readValue("[{\"a\":1}]", String[].class);
        } catch (IOException e) {
            caught = true;
        }
        assertTrue(caught);
    }

    // -------------------------------------------------------------------
    // _deserializeCustom() path via custom element deserializer (through createContextual)
    // -------------------------------------------------------------------
    @Test
    public void testDeserialize_withCustomElementDeserializer_appliesCustomLogic() throws IOException {
        BeanWithCustomElementDeserializer bean =
                mapper.readValue("{\"values\":[\"a\",\"b\",\"c\"]}", BeanWithCustomElementDeserializer.class);
        assertArrayEquals(new String[]{"A", "B", "C"}, bean.values);
    }

    @Test
    public void testDeserialize_withCustomElementDeserializerAndNull_appliesNullValue() throws IOException {
        BeanWithCustomElementDeserializer bean =
                mapper.readValue("{\"values\":[\"a\", null, \"c\"]}", BeanWithCustomElementDeserializer.class);
        assertEquals("A", bean.values[0]);
        assertNull(bean.values[1]);
        assertEquals("C", bean.values[2]);
    }

    // -------------------------------------------------------------------
    // deserializeWithType(): tested indirectly through polymorphic handling
    // -------------------------------------------------------------------
    @Test
    public void testDeserializeWithType_polymorphicArray_returnsCorrectArray() throws IOException {
        ObjectMapper m = new ObjectMapper();
        PolymorphicWrapper w = new PolymorphicWrapper();
        w.data = new String[]{"x", "y", "z"};
        String json = m.writeValueAsString(w);
        PolymorphicWrapper w2 = m.readValue(json, PolymorphicWrapper.class);
        assertTrue(w2.data instanceof String[]);
        assertArrayEquals(new String[]{"x", "y", "z"}, (String[]) w2.data);
    }

    // -------------------------------------------------------------------
    // createContextual(): default deserializer branch (deser stays null -> returns 'this')
    // -------------------------------------------------------------------
    @Test
    public void testCreateContextual_defaultStringDeserializer_returnsSameOrEquivalentBehavior() throws IOException {
        // No custom annotation - default String deserializer should be used,
        // exercising the branch where isDefaultDeserializer(deser) == true.
        String[] result = mapper.readValue("[\"p\",\"q\"]", String[].class);
        assertArrayEquals(new String[]{"p", "q"}, result);
    }

    // -------------------------------------------------------------------
    // Edge case: array containing only nulls
    // -------------------------------------------------------------------
    @Test
    public void testDeserialize_arrayWithAllNulls_returnsAllNullArray() throws IOException {
        String[] result = mapper.readValue("[null, null, null]", String[].class);
        assertEquals(3, result.length);
        assertNull(result[0]);
        assertNull(result[1]);
        assertNull(result[2]);
    }
}
