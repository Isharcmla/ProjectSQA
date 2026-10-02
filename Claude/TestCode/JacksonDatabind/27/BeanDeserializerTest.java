package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.util.*;
import java.io.IOException;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

public class BeanDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------- Test POJOs ----------

    public static class SimpleBean {
        public String name;
        public int age;
        public SimpleBean() {}
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class IgnoreUnknownBean {
        public String name;
    }

    public static class StrictBean {
        public String name;
    }

    public static class FromStringBean {
        public final String value;
        @JsonCreator
        public FromStringBean(String value) {
            this.value = value;
        }
    }

    public static class FromIntBean {
        public final int value;
        @JsonCreator
        public FromIntBean(int value) {
            this.value = value;
        }
    }

    public static class FromDoubleBean {
        public final double value;
        @JsonCreator
        public FromDoubleBean(double value) {
            this.value = value;
        }
    }

    public static class FromBooleanBean {
        public final boolean value;
        @JsonCreator
        public FromBooleanBean(boolean value) {
            this.value = value;
        }
    }

    public static class FromArrayBean {
        public final List<Integer> values;
        @JsonCreator
        public FromArrayBean(List<Integer> values) {
            this.values = values;
        }
    }

    public static class PropertyCreatorBean {
        public final String name;
        public final int age;
        @JsonCreator
        public PropertyCreatorBean(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class AnySetterBean {
        public String name;
        public Map<String, Object> extra = new HashMap<String, Object>();
        @JsonAnySetter
        public void setExtra(String key, Object value) {
            extra.put(key, value);
        }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    public static class IdentityBean {
        public int id;
        public String name;
        public IdentityBean child;
    }

    public static class NestedBean {
        public SimpleBean inner;
        public String outerName;
    }

    public static class ViewA {}
    public static class ViewB {}

    public static class ViewBean {
        @JsonView(ViewA.class)
        public String fieldA;
        @JsonView(ViewB.class)
        public String fieldB;
    }

    @JsonIgnoreProperties({"age"})
    public static class IgnoreSpecificFieldBean {
        public String name;
    }

    // ---------- Tests ----------

    @Test
    public void testDeserialize_normalObject_success() throws IOException {
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
    public void testDeserialize_unknownProperty_ignoredWhenConfigured() throws IOException {
        String json = "{\"name\":\"John\",\"unknownField\":\"value\"}";
        IgnoreUnknownBean bean = mapper.readValue(json, IgnoreUnknownBean.class);
        assertNotNull(bean);
        assertEquals("John", bean.name);
    }

    @Test(expected = UnrecognizedPropertyException.class)
    public void testDeserialize_unknownProperty_throwsExceptionWhenNotIgnored() throws IOException {
        String json = "{\"name\":\"John\",\"unknownField\":\"value\"}";
        mapper.readValue(json, StrictBean.class);
    }

    @Test
    public void testDeserialize_fromString_usingCreator() throws IOException {
        String json = "\"hello\"";
        FromStringBean bean = mapper.readValue(json, FromStringBean.class);
        assertNotNull(bean);
        assertEquals("hello", bean.value);
    }

    @Test
    public void testDeserialize_fromInt_usingCreator() throws IOException {
        String json = "42";
        FromIntBean bean = mapper.readValue(json, FromIntBean.class);
        assertNotNull(bean);
        assertEquals(42, bean.value);
    }

    @Test
    public void testDeserialize_fromDouble_usingCreator() throws IOException {
        String json = "3.14";
        FromDoubleBean bean = mapper.readValue(json, FromDoubleBean.class);
        assertNotNull(bean);
        assertEquals(3.14, bean.value, 0.0001);
    }

    @Test
    public void testDeserialize_fromBoolean_usingCreator() throws IOException {
        String json = "true";
        FromBooleanBean bean = mapper.readValue(json, FromBooleanBean.class);
        assertNotNull(bean);
        assertTrue(bean.value);
    }

    @Test
    public void testDeserialize_booleanFalse_usingCreator() throws IOException {
        String json = "false";
        FromBooleanBean bean = mapper.readValue(json, FromBooleanBean.class);
        assertNotNull(bean);
        assertFalse(bean.value);
    }

    @Test
    public void testDeserialize_negativeIntValue_usingCreator() throws IOException {
        String json = "-5";
        FromIntBean bean = mapper.readValue(json, FromIntBean.class);
        assertNotNull(bean);
        assertEquals(-5, bean.value);
    }

    @Test
    public void testDeserialize_fromArray_usingCreator() throws IOException {
        String json = "[1,2,3]";
        FromArrayBean bean = mapper.readValue(json, FromArrayBean.class);
        assertNotNull(bean);
        assertEquals(3, bean.values.size());
    }

    @Test
    public void testDeserialize_propertyBasedCreator_success() throws IOException {
        String json = "{\"name\":\"Alice\",\"age\":25}";
        PropertyCreatorBean bean = mapper.readValue(json, PropertyCreatorBean.class);
        assertNotNull(bean);
        assertEquals("Alice", bean.name);
        assertEquals(25, bean.age);
    }

    @Test
    public void testDeserialize_propertyBasedCreator_withUnknownProperty_ignored() throws IOException {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String json = "{\"name\":\"Alice\",\"age\":25,\"extra\":\"ignored\"}";
        PropertyCreatorBean bean = localMapper.readValue(json, PropertyCreatorBean.class);
        assertNotNull(bean);
        assertEquals("Alice", bean.name);
        assertEquals(25, bean.age);
    }

    @Test
    public void testDeserialize_anySetter_success() throws IOException {
        String json = "{\"name\":\"Bob\",\"customField\":\"customValue\"}";
        AnySetterBean bean = mapper.readValue(json, AnySetterBean.class);
        assertNotNull(bean);
        assertEquals("Bob", bean.name);
        assertEquals("customValue", bean.extra.get("customField"));
    }

    @Test
    public void testDeserialize_nestedObject_success() throws IOException {
        String json = "{\"outerName\":\"Outer\",\"inner\":{\"name\":\"Inner\",\"age\":5}}";
        NestedBean bean = mapper.readValue(json, NestedBean.class);
        assertNotNull(bean);
        assertEquals("Outer", bean.outerName);
        assertNotNull(bean.inner);
        assertEquals("Inner", bean.inner.name);
        assertEquals(5, bean.inner.age);
    }

    @Test
    public void testDeserialize_withView_success() throws IOException {
        ObjectMapper viewMapper = new ObjectMapper();
        String json = "{\"fieldA\":\"A\",\"fieldB\":\"B\"}";
        ViewBean bean = viewMapper.readerWithView(ViewA.class).forType(ViewBean.class).readValue(json);
        assertNotNull(bean);
        assertEquals("A", bean.fieldA);
        assertNull(bean.fieldB);
    }

    @Test
    public void testDeserialize_withObjectId_success() throws IOException {
        String json = "{\"id\":1,\"name\":\"Parent\",\"child\":{\"id\":2,\"name\":\"Child\",\"child\":null}}";
        IdentityBean bean = mapper.readValue(json, IdentityBean.class);
        assertNotNull(bean);
        assertEquals(1, bean.id);
        assertEquals("Parent", bean.name);
        assertNotNull(bean.child);
        assertEquals(2, bean.child.id);
    }

    @Test
    public void testDeserialize_updateExistingBean_success() throws IOException {
        SimpleBean existing = new SimpleBean();
        existing.name = "Initial";
        existing.age = 1;
        String json = "{\"name\":\"Updated\",\"age\":99}";
        SimpleBean updated = mapper.readerForUpdating(existing).readValue(json);
        assertSame(existing, updated);
        assertEquals("Updated", updated.name);
        assertEquals(99, updated.age);
    }

    @Test
    public void testDeserialize_updateExistingBean_emptyJson_returnsUnmodifiedBean() throws IOException {
        SimpleBean existing = new SimpleBean();
        existing.name = "Unchanged";
        existing.age = 7;
        String json = "{}";
        SimpleBean updated = mapper.readerForUpdating(existing).readValue(json);
        assertSame(existing, updated);
        assertEquals("Unchanged", updated.name);
        assertEquals(7, updated.age);
    }

    @Test(expected = JsonProcessingException.class)
    public void testDeserialize_malformedJson_throwsException() throws IOException {
        String json = "{\"name\": \"John\", \"age\": }";
        mapper.readValue(json, SimpleBean.class);
    }

    @Test
    public void testDeserialize_nullLiteral_returnsNull() throws IOException {
        String json = "null";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNull(bean);
    }

    @Test
    public void testWithIgnorableProperties_viaAnnotation_ignoresSpecifiedField() throws IOException {
        String json = "{\"name\":\"X\",\"age\":5}";
        IgnoreSpecificFieldBean bean = mapper.readValue(json, IgnoreSpecificFieldBean.class);
        assertNotNull(bean);
        assertEquals("X", bean.name);
    }

    @Test
    public void testDeserialize_zeroAndEmptyString_normal() throws IOException {
        String json = "{\"name\":\"\",\"age\":0}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertEquals("", bean.name);
        assertEquals(0, bean.age);
    }

    @Test
    public void testDeserialize_fieldNameAtRoot_success() throws IOException {
        String json = "{\"name\":\"Root\",\"age\":1}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertEquals("Root", bean.name);
        assertEquals(1, bean.age);
    }

    @Test
    public void testDeserialize_multipleBeansInArray_success() throws IOException {
        String json = "[{\"name\":\"A\",\"age\":1},{\"name\":\"B\",\"age\":2}]";
        SimpleBean[] beans = mapper.readValue(json, SimpleBean[].class);
        assertNotNull(beans);
        assertEquals(2, beans.length);
        assertEquals("A", beans[0].name);
        assertEquals("B", beans[1].name);
    }

    @Test
    public void testDeserialize_largeAgeValue_boundary() throws IOException {
        String json = "{\"name\":\"Max\",\"age\":" + Integer.MAX_VALUE + "}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertEquals(Integer.MAX_VALUE, bean.age);
    }

    @Test
    public void testDeserialize_negativeAgeValue_boundary() throws IOException {
        String json = "{\"name\":\"Min\",\"age\":" + Integer.MIN_VALUE + "}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertEquals(Integer.MIN_VALUE, bean.age);
    }
}
