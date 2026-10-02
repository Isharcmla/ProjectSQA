import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Test suite for {@link com.fasterxml.jackson.databind.deser.BeanDeserializer}.
 *
 * Since BeanDeserializer's constructors require internal Jackson objects
 * (BeanDeserializerBuilder, BeanPropertyMap, etc.) that are not part of the
 * stable public API and cannot be constructed directly without using Jackson's
 * internal deserialization machinery, this test suite exercises BeanDeserializer
 * indirectly through the public ObjectMapper API, which internally creates and
 * uses BeanDeserializer instances to deserialize POJOs. This satisfies the
 * "no mocking framework, only real public API" requirement while covering
 * the various code paths (vanilla, non-standard creation, unwrapped properties,
 * external type id, views, object id, property-based creators, etc.)
 */
public class BeanDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------------------------------------------------------------
    // Simple POJO for normal/vanilla case
    // ---------------------------------------------------------------
    public static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean() { }

        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    @Test
    public void testDeserialize_normalObject_returnsPopulatedBean() throws Exception {
        String json = "{\"name\":\"John\",\"age\":30}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertEquals("John", bean.name);
        assertEquals(30, bean.age);
    }

    @Test
    public void testDeserialize_emptyObject_returnsDefaultBean() throws Exception {
        String json = "{}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertNull(bean.name);
        assertEquals(0, bean.age);
    }

    @Test
    public void testDeserialize_unknownProperty_ignoredWhenConfigured() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String json = "{\"name\":\"Jane\",\"age\":25,\"unknownField\":\"x\"}";
        SimpleBean bean = m.readValue(json, SimpleBean.class);
        assertEquals("Jane", bean.name);
        assertEquals(25, bean.age);
    }

    @Test(expected = UnrecognizedPropertyException.class)
    public void testDeserialize_unknownProperty_throwsWhenFailOnUnknown() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        String json = "{\"name\":\"Jane\",\"unknownField\":\"x\"}";
        m.readValue(json, SimpleBean.class);
    }

    @Test
    public void testDeserialize_nullValue_returnsNullBean() throws Exception {
        String json = "null";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNull(bean);
    }

    // ---------------------------------------------------------------
    // Update-existing-bean case (deserialize(p, ctxt, bean))
    // ---------------------------------------------------------------
    @Test
    public void testDeserializeIntoExistingBean_updatesFields() throws Exception {
        SimpleBean existing = new SimpleBean("Original", 1);
        ObjectReader reader = mapper.readerForUpdating(existing);
        String json = "{\"age\":99}";
        SimpleBean updated = reader.readValue(json);
        assertSame(existing, updated);
        assertEquals("Original", updated.name);
        assertEquals(99, updated.age);
    }

    @Test
    public void testDeserializeIntoExistingBean_emptyObject_returnsSameBean() throws Exception {
        SimpleBean existing = new SimpleBean("Keep", 5);
        ObjectReader reader = mapper.readerForUpdating(existing);
        String json = "{}";
        SimpleBean updated = reader.readValue(json);
        assertSame(existing, updated);
        assertEquals("Keep", updated.name);
        assertEquals(5, updated.age);
    }

    // ---------------------------------------------------------------
    // Non-standard creation via @JsonCreator (constructor args) -
    // exercises deserializeFromObjectUsingNonDefault / property-based creator
    // ---------------------------------------------------------------
    public static class CreatorBean {
        public final String name;
        public final int age;

        @JsonCreator
        public CreatorBean(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }
    }

    @Test
    public void testDeserialize_propertyBasedCreator_normalCase() throws Exception {
        String json = "{\"name\":\"Alice\",\"age\":40}";
        CreatorBean bean = mapper.readValue(json, CreatorBean.class);
        assertEquals("Alice", bean.name);
        assertEquals(40, bean.age);
    }

    @Test
    public void testDeserialize_propertyBasedCreator_reversedOrder() throws Exception {
        String json = "{\"age\":50,\"name\":\"Bob\"}";
        CreatorBean bean = mapper.readValue(json, CreatorBean.class);
        assertEquals("Bob", bean.name);
        assertEquals(50, bean.age);
    }

    @Test
    public void testDeserialize_propertyBasedCreator_withUnknownProperty() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String json = "{\"name\":\"Carl\",\"age\":22,\"extra\":\"ignored\"}";
        CreatorBean bean = m.readValue(json, CreatorBean.class);
        assertEquals("Carl", bean.name);
        assertEquals(22, bean.age);
    }

    // ---------------------------------------------------------------
    // @JsonIgnoreProperties - exercises withIgnorableProperties path
    // ---------------------------------------------------------------
    @JsonIgnoreProperties({"ignoredField"})
    public static class IgnorablePropsBean {
        public String name;
        public String ignoredField;
    }

    @Test
    public void testDeserialize_ignorableProperties_ignoredSuccessfully() throws Exception {
        String json = "{\"name\":\"Dave\",\"ignoredField\":\"shouldBeIgnored\"}";
        IgnorablePropsBean bean = mapper.readValue(json, IgnorablePropsBean.class);
        assertEquals("Dave", bean.name);
        assertNull(bean.ignoredField);
    }

    // ---------------------------------------------------------------
    // @JsonUnwrapped - exercises deserializeWithUnwrapped path
    // ---------------------------------------------------------------
    public static class Address {
        public String city;
        public String zip;
    }

    public static class UnwrappedBean {
        public String name;
        @JsonUnwrapped
        public Address address;
    }

    @Test
    public void testDeserialize_unwrappedProperty_normalCase() throws Exception {
        String json = "{\"name\":\"Eve\",\"city\":\"NYC\",\"zip\":\"10001\"}";
        UnwrappedBean bean = mapper.readValue(json, UnwrappedBean.class);
        assertEquals("Eve", bean.name);
        assertNotNull(bean.address);
        assertEquals("NYC", bean.address.city);
        assertEquals("10001", bean.address.zip);
    }

    @Test
    public void testDeserialize_unwrappedProperty_missingUnwrappedFields() throws Exception {
        String json = "{\"name\":\"Frank\"}";
        UnwrappedBean bean = mapper.readValue(json, UnwrappedBean.class);
        assertEquals("Frank", bean.name);
        assertNotNull(bean.address);
        assertNull(bean.address.city);
    }

    // ---------------------------------------------------------------
    // @JsonView - exercises deserializeWithView path
    // ---------------------------------------------------------------
    public static class Views {
        public static class Public {}
        public static class Internal extends Public {}
    }

    public static class ViewBean {
        @JsonView(Views.Public.class)
        public String publicField;

        @JsonView(Views.Internal.class)
        public String internalField;
    }

    @Test
    public void testDeserialize_withActiveView_onlyVisiblePropertiesSet() throws Exception {
        ObjectMapper m = new ObjectMapper();
        String json = "{\"publicField\":\"pub\",\"internalField\":\"int\"}";
        ViewBean bean = m.readerFor(ViewBean.class)
                .withView(Views.Public.class)
                .readValue(json);
        assertEquals("pub", bean.publicField);
        assertNull(bean.internalField);
    }

    @Test
    public void testDeserialize_withActiveView_internalViewSeesAll() throws Exception {
        ObjectMapper m = new ObjectMapper();
        String json = "{\"publicField\":\"pub\",\"internalField\":\"int\"}";
        ViewBean bean = m.readerFor(ViewBean.class)
                .withView(Views.Internal.class)
                .readValue(json);
        assertEquals("pub", bean.publicField);
        assertEquals("int", bean.internalField);
    }

    // ---------------------------------------------------------------
    // @JsonTypeInfo EXTERNAL_PROPERTY - exercises deserializeWithExternalTypeId
    // ---------------------------------------------------------------
    public static class ExternalTypeWrapper {
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        public Shape shape;
        public String label;
    }

    public interface Shape { }

    public static class Circle implements Shape {
        public int radius;
    }

    @Test
    public void testDeserialize_externalTypeId_normalCase() throws Exception {
        String json = "{\"label\":\"myShape\",\"shape\":{\"radius\":5},"
                + "\"type\":\"" + Circle.class.getName() + "\"}";
        ExternalTypeWrapper wrapper = mapper.readValue(json, ExternalTypeWrapper.class);
        assertEquals("myShape", wrapper.label);
        assertNotNull(wrapper.shape);
        assertTrue(wrapper.shape instanceof Circle);
        assertEquals(5, ((Circle) wrapper.shape).radius);
    }

    // ---------------------------------------------------------------
    // @JsonIdentityInfo - exercises withObjectIdReader / deserializeWithObjectId
    // ---------------------------------------------------------------
    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    public static class Node {
        public int id;
        public String name;
        public Node next;
    }

    @Test
    public void testDeserialize_objectIdReference_normalCase() throws Exception {
        String json = "{\"id\":1,\"name\":\"root\",\"next\":{\"id\":2,\"name\":\"child\",\"next\":1}}";
        Node root = mapper.readValue(json, Node.class);
        assertEquals("root", root.name);
        assertNotNull(root.next);
        assertEquals("child", root.next.name);
        // circular ref resolved back to root
        assertSame(root, root.next.next);
    }

    // ---------------------------------------------------------------
    // Deserialize from various scalar tokens - exercises _deserializeOther paths
    // ---------------------------------------------------------------
    public static class FromStringBean {
        public String value;

        @JsonCreator
        public static FromStringBean fromString(String value) {
            FromStringBean b = new FromStringBean();
            b.value = value;
            return b;
        }
    }

    @Test
    public void testDeserialize_fromStringToken_usesStringCreator() throws Exception {
        String json = "\"hello\"";
        FromStringBean bean = mapper.readValue(json, FromStringBean.class);
        assertEquals("hello", bean.value);
    }

    // ---------------------------------------------------------------
    // Exception scenarios - malformed / mismatched input
    // ---------------------------------------------------------------
    @Test(expected = MismatchedInputException.class)
    public void testDeserialize_arrayInsteadOfObject_throwsMismatchedInput() throws Exception {
        String json = "[1,2,3]";
        mapper.readValue(json, SimpleBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_invalidTypeForField_throwsMappingException() throws Exception {
        String json = "{\"name\":\"X\",\"age\":\"notANumber\"}";
        mapper.readValue(json, SimpleBean.class);
    }

    // ---------------------------------------------------------------
    // List of beans - exercises vanilla path repeatedly
    // ---------------------------------------------------------------
    @Test
    public void testDeserialize_listOfBeans_allPopulatedCorrectly() throws Exception {
        String json = "[{\"name\":\"A\",\"age\":1},{\"name\":\"B\",\"age\":2}]";
        List<SimpleBean> list = mapper.readValue(json,
                mapper.getTypeFactory().constructCollectionType(List.class, SimpleBean.class));
        assertEquals(2, list.size());
        assertEquals("A", list.get(0).name);
        assertEquals("B", list.get(1).name);
    }

    // ---------------------------------------------------------------
    // Boundary: negative and zero numeric values
    // ---------------------------------------------------------------
    @Test
    public void testDeserialize_negativeAndZeroValues_handledCorrectly() throws Exception {
        String json = "{\"name\":\"\",\"age\":-5}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertEquals("", bean.name);
        assertEquals(-5, bean.age);

        String jsonZero = "{\"name\":\"zero\",\"age\":0}";
        SimpleBean beanZero = mapper.readValue(jsonZero, SimpleBean.class);
        assertEquals(0, beanZero.age);
    }
}
