package com.fasterxml.jackson.databind.deser;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;

public class BeanDeserializerFactoryTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------------------------------------------------------------
    // Helper test classes
    // ---------------------------------------------------------------

    public static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean() {}

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    public static class MyException extends Exception {
        private static final long serialVersionUID = 1L;

        public MyException() {}
        public MyException(String message) { super(message); }
    }

    @JsonDeserialize(builder = PersonBuilder.class)
    public static class Person {
        private final String name;
        private final int age;

        private Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
    }

    @JsonPOJOBuilder(withPrefix = "with", buildMethodName = "build")
    public static class PersonBuilder {
        private String name;
        private int age;

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, age);
        }
    }

    public abstract static class AbstractBean {
        public abstract String getName();
    }

    // Subclass that does NOT override withConfig -> should throw when
    // withConfig is invoked, per implementation contract.
    static class CustomFactory extends BeanDeserializerFactory {
        private static final long serialVersionUID = 1L;

        public CustomFactory(DeserializerFactoryConfig config) {
            super(config);
        }
    }

    // ---------------------------------------------------------------
    // Constructor & static instance tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_createsNonNullInstance() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        assertNotNull(factory);
    }

    @Test
    public void testStaticInstance_isNotNull() {
        assertNotNull(BeanDeserializerFactory.instance);
    }

    // ---------------------------------------------------------------
    // withConfig tests
    // ---------------------------------------------------------------

    @Test
    public void testWithConfig_sameConfig_returnsSameInstance() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        DeserializerFactory result = factory.withConfig(config);
        assertSame(factory, result);
    }

    @Test
    public void testWithConfig_differentConfig_returnsNewInstance() {
        DeserializerFactoryConfig config1 = new DeserializerFactoryConfig();
        DeserializerFactoryConfig config2 = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config1);
        DeserializerFactory result = factory.withConfig(config2);
        assertNotNull(result);
        assertNotSame(factory, result);
        assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclassWithoutOverride_throwsIllegalStateException() {
        DeserializerFactoryConfig config1 = new DeserializerFactoryConfig();
        DeserializerFactoryConfig config2 = new DeserializerFactoryConfig();
        CustomFactory customFactory = new CustomFactory(config1);
        customFactory.withConfig(config2);
    }

    // ---------------------------------------------------------------
    // createBeanDeserializer (indirect, via ObjectMapper) - normal case
    // ---------------------------------------------------------------

    @Test
    public void testCreateBeanDeserializer_normalBean_deserializesCorrectly() throws IOException {
        String json = "{\"name\":\"John\",\"age\":30}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertEquals("John", bean.getName());
        assertEquals(30, bean.getAge());
    }

    @Test
    public void testCreateBeanDeserializer_emptyJsonObject_returnsBeanWithDefaults() throws IOException {
        String json = "{}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        assertNotNull(bean);
        assertNull(bean.getName());
        assertEquals(0, bean.getAge());
    }

    @Test
    public void testCreateBeanDeserializer_unknownProperty_throwsJsonMappingException() {
        String json = "{\"unknownField\":\"value\"}";
        try {
            mapper.readValue(json, SimpleBean.class);
            fail("Expected JsonMappingException for unknown property");
        } catch (JsonMappingException e) {
            // expected
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    // ---------------------------------------------------------------
    // buildThrowableDeserializer (indirect, via ObjectMapper)
    // ---------------------------------------------------------------

    @Test
    public void testCreateBeanDeserializer_throwableType_deserializesCorrectly() throws IOException {
        String json = "{\"message\":\"test error\"}";
        MyException ex = mapper.readValue(json, MyException.class);
        assertNotNull(ex);
        assertEquals("test error", ex.getMessage());
    }

    @Test
    public void testCreateBeanDeserializer_throwableTypeEmptyMessage_deserializesCorrectly() throws IOException {
        String json = "{}";
        MyException ex = mapper.readValue(json, MyException.class);
        assertNotNull(ex);
    }

    // ---------------------------------------------------------------
    // createBuilderBasedDeserializer (indirect, via ObjectMapper)
    // ---------------------------------------------------------------

    @Test
    public void testCreateBuilderBasedDeserializer_normalCase_deserializesCorrectly() throws IOException {
        String json = "{\"name\":\"Alice\",\"age\":25}";
        Person p = mapper.readValue(json, Person.class);
        assertNotNull(p);
        assertEquals("Alice", p.getName());
        assertEquals(25, p.getAge());
    }

    @Test
    public void testCreateBuilderBasedDeserializer_emptyJson_returnsPersonWithDefaults() throws IOException {
        String json = "{}";
        Person p = mapper.readValue(json, Person.class);
        assertNotNull(p);
        assertNull(p.getName());
        assertEquals(0, p.getAge());
    }

    // ---------------------------------------------------------------
    // Abstract type edge case - should fail since no concrete impl/materializer
    // ---------------------------------------------------------------

    @Test
    public void testCreateBeanDeserializer_abstractTypeWithoutMaterializer_throwsException() {
        String json = "{\"name\":\"x\"}";
        try {
            mapper.readValue(json, AbstractBean.class);
            fail("Expected exception when deserializing abstract type without materializer");
        } catch (JsonMappingException e) {
            // expected
        } catch (IOException e) {
            // Some Jackson versions might throw a different IOException subtype;
            // this is also considered acceptable failure behavior.
            assertTrue(true);
        }
    }

    // ---------------------------------------------------------------
    // Null / invalid input edge cases
    // ---------------------------------------------------------------

    @Test
    public void testCreateBeanDeserializer_nullJsonString_throwsException() {
        try {
            mapper.readValue((String) null, SimpleBean.class);
            fail("Expected exception for null input");
        } catch (Exception e) {
            // expected: IllegalArgumentException or NullPointerException depending on version
            assertTrue(true);
        }
    }

    @Test
    public void testCreateBeanDeserializer_malformedJson_throwsException() {
        String malformedJson = "{name:John,age:}";
        try {
            mapper.readValue(malformedJson, SimpleBean.class);
            fail("Expected exception for malformed JSON");
        } catch (IOException e) {
            // expected
            assertTrue(true);
        }
    }
}
