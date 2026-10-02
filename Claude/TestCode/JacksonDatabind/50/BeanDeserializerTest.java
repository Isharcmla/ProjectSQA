import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

/**
 * Test suite for BeanDeserializer.
 *
 * NOTE: BeanDeserializer cannot be instantiated directly without complex internal
 * Jackson objects (BeanDeserializerBuilder, BeanPropertyMap, ValueInstantiator, etc.)
 * which are not part of the public API and would require mocking. Since mocking
 * frameworks are disallowed, this test suite exercises BeanDeserializer indirectly
 * through the public ObjectMapper API, which internally constructs and uses
 * BeanDeserializer instances to perform deserialization. This approach covers the
 * various code paths (vanilla deserialize, object-id handling, unwrapped properties,
 * any-setter, property-based creator, array-shaped beans, views, polymorphic types,
 * unknown property handling, etc.) declared in BeanDeserializer.
 */
public class BeanDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------------------------------------------------------------
    // Simple POJOs used for testing
    // ---------------------------------------------------------------

    public static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean() { }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class IgnoreUnknownBean {
        public String name;
    }

    public static class CreatorBean {
        public final String value;

        @JsonCreator
        public CreatorBean(@JsonProperty("value") String value) {
            this.value = value;
        }
    }

    public static class FromStringBean {
        public String value;

        @JsonCreator
        public FromStringBean(String value) {
            this.value = value;
        }
    }

    public static class FromIntBean {
        public int value;

        @JsonCreator
        public FromIntBean(int value) {
            this.value = value;
        }
    }

    public static class AnySetterBean {
        public String known;
        private Map<String, Object> extra = new HashMap<String, Object>();

        @JsonAnySetter
        public void setExtra(String key, Object value) {
            extra.put(key, value);
        }

        public Map<String, Object> getExtra() {
            return extra;
        }
    }

    public static class Name {
        public String first;
        public String last;
    }

    public static class UnwrappedBean {
        public int id;

        @JsonUnwrapped
        public Name name;
    }

    public static class Views {
        public static class Public { }
    }

    public static class ViewBean {
        @JsonView(Views.Public.class)
        public String publicField;
        public String alwaysField;
    }

    @JsonPropertyOrder({ "a", "b" })
    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    public static class ArrayBean {
        public String a;
        public int b;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
    @JsonSubTypes({ @JsonSubTypes.Type(value = Sub1.class, name = "sub1") })
    public abstract static class Base {
        public String common;
    }

    public static class Sub1 extends Base {
        public String extra;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    public static class IdentityBean {
        public int id;
        public String value;
        public IdentityBean ref;
    }

    public static class NegativeBean {
        public int value;
    }

    // ---------------------------------------------------------------
    // Normal / typical cases
    // ---------------------------------------------------------------

    @Test
    public void testDeserialize_normalObject_returnsPopulatedBean() throws IOException {
        String json = "{\"name\":\"John\",\"age\":30}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertEquals("John", bean.name);
        assertEquals(30, bean.age);
    }

    @Test
    public void testDeserialize_emptyObject_returnsDefaultBean() throws IOException {
        String json = "{}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertNull(bean.name);
        assertEquals(0, bean.age);
    }

    @Test
    public void testDeserialize_ignoreUnknownProperty_returnsBean() throws IOException {
        String json = "{\"name\":\"Alice\",\"unknownField\":\"value\"}";
        IgnoreUnknownBean bean = mapper.readValue(json, IgnoreUnknownBean.class);
        assertNotNull(bean);
        assertEquals("Alice", bean.name);
    }

    @Test
    public void testDeserialize_propertyBasedCreator_returnsBean() throws IOException {
        String json = "{\"value\":\"hello\"}";
        CreatorBean bean = mapper.readValue(json, CreatorBean.class);
        assertNotNull(bean);
        assertEquals("hello", bean.value);
    }

    @Test
    public void testDeserialize_fromString_usesDelegateCreator() throws IOException {
        String json = "\"delegateValue\"";
        FromStringBean bean = mapper.readValue(json, FromStringBean.class);
        assertNotNull(bean);
        assertEquals("delegateValue", bean.value);
    }

    @Test
    public void testDeserialize_fromInt_usesDelegateCreator() throws IOException {
        String json = "42";
        FromIntBean bean = mapper.readValue(json, FromIntBean.class);
        assertNotNull(bean);
        assertEquals(42, bean.value);
    }

    @Test
    public void testDeserialize_anySetter_capturesExtraProperties() throws IOException {
        String json = "{\"known\":\"k\",\"extraKey\":\"extraVal\"}";
        AnySetterBean bean = mapper.readValue(json, AnySetterBean.class);
        assertNotNull(bean);
        assertEquals("k", bean.known);
        assertEquals("extraVal", bean.getExtra().get("extraKey"));
    }

    @Test
    public void testDeserialize_unwrappedProperty_populatesNestedFields() throws IOException {
        String json = "{\"id\":1,\"first\":\"John\",\"last\":\"Doe\"}";
        UnwrappedBean bean = mapper.readValue(json, UnwrappedBean.class);
        assertNotNull(bean);
        assertEquals(1, bean.id);
        assertNotNull(bean.name);
        assertEquals("John", bean.name.first);
        assertEquals("Doe", bean.name.last);
    }

    @Test
    public void testDeserialize_withView_onlyIncludesVisibleField() throws IOException {
        String json = "{\"publicField\":\"pub\",\"alwaysField\":\"always\"}";
        ViewBean bean = mapper.readerWithView(Views.Public.class)
                .forType(ViewBean.class)
                .readValue(json);
        assertNotNull(bean);
        assertEquals("pub", bean.publicField);
        // alwaysField has no view annotation so is included regardless in default Jackson behavior
        assertEquals("always", bean.alwaysField);
    }

    @Test
    public void testDeserialize_arrayShapedBean_usesArrayDeserializer() throws IOException {
        String json = "[\"aValue\",5]";
        ArrayBean bean = mapper.readValue(json, ArrayBean.class);
        assertNotNull(bean);
        assertEquals("aValue", bean.a);
        assertEquals(5, bean.b);
    }

    @Test
    public void testDeserialize_polymorphicType_returnsCorrectSubtype() throws IOException {
        String json = "{\"type\":\"sub1\",\"common\":\"c\",\"extra\":\"e\"}";
        Base bean = mapper.readValue(json, Base.class);
        assertNotNull(bean);
        assertTrue(bean instanceof Sub1);
        Sub1 sub1 = (Sub1) bean;
        assertEquals("c", sub1.common);
        assertEquals("e", sub1.extra);
    }

    @Test
    public void testDeserialize_objectIdentity_resolvesReference() throws IOException {
        String json = "{\"id\":1,\"value\":\"first\",\"ref\":1}";
        IdentityBean bean = mapper.readValue(json, IdentityBean.class);
        assertNotNull(bean);
        assertEquals(1, bean.id);
        assertEquals("first", bean.value);
        // self-reference resolved via object id
        assertSame(bean, bean.ref);
    }

    // ---------------------------------------------------------------
    // Edge cases: null, zero, negative, empty string, boundary values
    // ---------------------------------------------------------------

    @Test
    public void testDeserialize_nullFieldValue_setsNull() throws IOException {
        String json = "{\"name\":null,\"age\":0}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertNull(bean.name);
        assertEquals(0, bean.age);
    }

    @Test
    public void testDeserialize_zeroValue_setsZero() throws IOException {
        String json = "{\"value\":0}";
        NegativeBean bean = mapper.readValue(json, NegativeBean.class);
        assertNotNull(bean);
        assertEquals(0, bean.value);
    }

    @Test
    public void testDeserialize_negativeValue_setsNegative() throws IOException {
        String json = "{\"value\":-100}";
        NegativeBean bean = mapper.readValue(json, NegativeBean.class);
        assertNotNull(bean);
        assertEquals(-100, bean.value);
    }

    @Test
    public void testDeserialize_emptyStringField_setsEmptyString() throws IOException {
        String json = "{\"name\":\"\",\"age\":1}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertEquals("", bean.name);
        assertEquals(1, bean.age);
    }

    @Test
    public void testDeserialize_topLevelNull_returnsNull() throws IOException {
        SimpleBean bean = mapper.readValue("null", SimpleBean.class);
        assertNull(bean);
    }

    @Test
    public void testDeserialize_boundaryIntValue_setsCorrectly() throws IOException {
        String json = "{\"value\":" + Integer.MAX_VALUE + "}";
        NegativeBean bean = mapper.readValue(json, NegativeBean.class);
        assertNotNull(bean);
        assertEquals(Integer.MAX_VALUE, bean.value);
    }

    // ---------------------------------------------------------------
    // Exception cases
    // ---------------------------------------------------------------

    @Test(expected = UnrecognizedPropertyException.class)
    public void testDeserialize_unknownProperty_throwsUnrecognizedPropertyException() throws IOException {
        String json = "{\"name\":\"John\",\"age\":30,\"unknownProp\":\"x\"}";
        mapper.readValue(json, SimpleBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_malformedJson_throwsMappingException() throws IOException {
        // Missing closing brace causes premature end-of-input during object parsing
        String json = "{\"name\":\"John\"";
        mapper.readValue(json, SimpleBean.class);
    }

    @Test(expected = com.fasterxml.jackson.core.JsonParseException.class)
    public void testDeserialize_invalidJsonSyntax_throwsParseException() throws IOException {
        String json = "{name:John}"; // unquoted field name is invalid by default
        mapper.readValue(json, SimpleBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_wrongTypeForRequiredField_throwsMappingException() throws IOException {
        // age expects an int, providing an object should trigger a mapping exception
        String json = "{\"name\":\"John\",\"age\":{\"nested\":1}}";
        mapper.readValue(json, SimpleBean.class);
    }
}
