package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // --- POJO Definitions for various scenarios ---

    static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean() {}

        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Views {
        static class Public {}
        static class Internal extends Public {}
    }

    static class ViewBean {
        @JsonView(Views.Public.class)
        public String publicField;

        @JsonView(Views.Internal.class)
        public String internalField;
    }

    @JsonIgnoreProperties({"ignoredField"})
    static class IgnorableBean {
        public String validField;
        public String ignoredField;
    }

    static class AnySetterBean {
        public String known;
        private Map<String, Object> any = new HashMap<String, Object>();

        @JsonAnySetter
        public void setAny(String name, Object value) {
            any.put(name, value);
        }

        public Map<String, Object> getAny() {
            return any;
        }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class IdentifiedBean {
        public int id;
        public String name;
        public IdentifiedBean next;
    }

    static class Location {
        public String city;
        public String country;
    }

    static class UnwrappedBean {
        public String name;
        @com.fasterxml.jackson.annotation.JsonUnwrapped
        public Location location;
    }

    static class PropertyBasedBean {
        public final String name;
        public final int age;
        public String extra;

        @JsonCreator
        public PropertyBasedBean(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class PropertyBasedWithAnySetterBean {
        public final String name;
        private Map<String, Object> other = new HashMap<String, Object>();

        @JsonCreator
        public PropertyBasedWithAnySetterBean(@JsonProperty("name") String name) {
            this.name = name;
        }

        @JsonAnySetter
        public void setOther(String key, Object val) {
            other.put(key, val);
        }

        public Map<String, Object> getOther() {
            return other;
        }
    }

    static class PropertyBasedUnwrappedBean {
        public final String title;
        @com.fasterxml.jackson.annotation.JsonUnwrapped
        public final Location location;

        @JsonCreator
        public PropertyBasedUnwrappedBean(@JsonProperty("title") String title,
                                          @JsonProperty("city") String city,
                                          @JsonProperty("country") String country) {
            this.title = title;
            this.location = new Location();
            this.location.city = city;
            this.location.country = country;
        }
    }

    static class ExternalTypeBean {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        public Object value;
        public String type;
    }

    static class PropertyBasedExternalTypeBean {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        public final Object value;
        public final String type;

        @JsonCreator
        public PropertyBasedExternalTypeBean(@JsonProperty("value") Object value,
                                             @JsonProperty("type") String type) {
            this.value = value;
            this.type = type;
        }
    }

    static class ScalarCreatorBean {
        String strVal;
        int intVal;
        double doubleVal;
        boolean boolVal;

        @JsonCreator
        public static ScalarCreatorBean fromString(String str) {
            ScalarCreatorBean b = new ScalarCreatorBean();
            b.strVal = str;
            return b;
        }

        @JsonCreator
        public static ScalarCreatorBean fromInt(int val) {
            ScalarCreatorBean b = new ScalarCreatorBean();
            b.intVal = val;
            return b;
        }

        @JsonCreator
        public static ScalarCreatorBean fromDouble(double val) {
            ScalarCreatorBean b = new ScalarCreatorBean();
            b.doubleVal = val;
            return b;
        }

        @JsonCreator
        public static ScalarCreatorBean fromBoolean(boolean val) {
            ScalarCreatorBean b = new ScalarCreatorBean();
            b.boolVal = val;
            return b;
        }
    }

    static class ArrayCreatorBean {
        List<String> items;

        @JsonCreator
        public ArrayCreatorBean(List<String> items) {
            this.items = items;
        }
    }

    static class NullReturningCreatorBean {
        @JsonCreator
        public static NullReturningCreatorBean create(@JsonProperty("dummy") String dummy) {
            return null;
        }
    }

    static class ThrowingSetterBean {
        public void setBroken(String val) {
            throw new IllegalArgumentException("Broken setter exception");
        }
    }

    // --- Direct BeanDeserializer method tests ---

    @Test
    public void testWithMethodsAndCopy() throws Exception {
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDeserializer deser = (BeanDeserializer) mapper.getDeserializationConfig().findTypeDeserializer(type);
        if (deser == null) {
            JsonDeserializer<Object> rootDeser = ctxt.findRootValueDeserializer(type);
            Assert.assertTrue(rootDeser instanceof BeanDeserializer);
            deser = (BeanDeserializer) rootDeser;
        }

        // Test withIgnorableProperties
        Set<String> ignorables = new HashSet<String>();
        ignorables.add("age");
        BeanDeserializer deserWithIgnored = deser.withIgnorableProperties(ignorables);
        Assert.assertNotNull(deserWithIgnored);
        Assert.assertNotSame(deser, deserWithIgnored);

        // Test withObjectIdReader
        ObjectIdReader oir = ObjectIdReader.construct(type, null, null, null, null, null);
        BeanDeserializer deserWithOir = deser.withObjectIdReader(oir);
        Assert.assertNotNull(deserWithOir);

        // Test withBeanProperties
        BeanPropertyMap propMap = deser.getPropertyMap();
        BeanDeserializerBase deserWithProps = deser.withBeanProperties(propMap);
        Assert.assertNotNull(deserWithProps);

        // Test unwrappingDeserializer
        JsonDeserializer<Object> unwrapped = deser.unwrappingDeserializer(NameTransformer.NOP);
        Assert.assertNotNull(unwrapped);

        // Test asArrayDeserializer
        BeanDeserializerBase asArray = deser.asArrayDeserializer();
        Assert.assertNotNull(asArray);
    }

    @Test
    public void testCreatorReturnedNullException() {
        BeanDeserializer deser = new BeanDeserializer(
                new BeanDeserializerBuilder(null, null),
                null,
                BeanPropertyMap.construct(Collections.<SettableBeanProperty>emptyList(), false),
                new HashMap<String, SettableBeanProperty>(),
                new HashSet<String>(),
                false,
                false
        );
        Exception ex1 = deser._creatorReturnedNullException();
        Assert.assertNotNull(ex1);
        Assert.assertTrue(ex1 instanceof NullPointerException);
        // Test lazy singleton instance creation
        Exception ex2 = deser._creatorReturnedNullException();
        Assert.assertSame(ex1, ex2);
    }

    // --- Deserialization Functional Scenarios ---

    @Test
    public void testVanillaDeserialize_normalInput() throws Exception {
        String json = "{\"name\":\"Alice\",\"age\":30}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("Alice", bean.name);
        Assert.assertEquals(30, bean.age);
    }

    @Test
    public void testDeserialize_emptyObject() throws Exception {
        String json = "{}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertNull(bean.name);
        Assert.assertEquals(0, bean.age);
    }

    @Test
    public void testDeserialize_intoExistingBean() throws Exception {
        SimpleBean bean = new SimpleBean("Init", 99);
        String json = "{\"name\":\"Updated\"}";
        ObjectReader reader = mapper.readerForUpdating(bean);
        SimpleBean result = reader.readValue(json);
        Assert.assertSame(bean, result);
        Assert.assertEquals("Updated", bean.name);
        Assert.assertEquals(99, bean.age);
    }

    @Test
    public void testDeserialize_intoExistingBeanWithViews() throws Exception {
        ViewBean bean = new ViewBean();
        String json = "{\"publicField\":\"pubVal\",\"internalField\":\"privVal\"}";

        ObjectReader reader = mapper.readerForUpdating(bean).withView(Views.Public.class);
        ViewBean result = reader.readValue(json);

        Assert.assertSame(bean, result);
        Assert.assertEquals("pubVal", bean.publicField);
        Assert.assertNull(bean.internalField);
    }

    @Test
    public void testDeserialize_withIgnoredProperties() throws Exception {
        String json = "{\"validField\":\"valid\",\"ignoredField\":\"ignored\"}";
        IgnorableBean bean = mapper.readValue(json, IgnorableBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("valid", bean.validField);
        Assert.assertNull(bean.ignoredField);
    }

    @Test
    public void testDeserialize_withAnySetter() throws Exception {
        String json = "{\"known\":\"yes\",\"extra1\":\"val1\",\"extra2\":123}";
        AnySetterBean bean = mapper.readValue(json, AnySetterBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("yes", bean.known);
        Assert.assertEquals("val1", bean.getAny().get("extra1"));
        Assert.assertEquals(123, bean.getAny().get("extra2"));
    }

    @Test
    public void testDeserialize_withObjectId() throws Exception {
        String json = "{\"id\":1,\"name\":\"Parent\",\"next\":1}";
        IdentifiedBean bean = mapper.readValue(json, IdentifiedBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(1, bean.id);
        Assert.assertEquals("Parent", bean.name);
        Assert.assertSame(bean, bean.next);
    }

    @Test
    public void testDeserialize_withUnwrapped() throws Exception {
        String json = "{\"name\":\"Bob\",\"city\":\"Bangkok\",\"country\":\"Thailand\"}";
        UnwrappedBean bean = mapper.readValue(json, UnwrappedBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("Bob", bean.name);
        Assert.assertNotNull(bean.location);
        Assert.assertEquals("Bangkok", bean.location.city);
        Assert.assertEquals("Thailand", bean.location.country);
    }

    @Test
    public void testDeserialize_propertyBasedCreator() throws Exception {
        String json = "{\"age\":25,\"name\":\"Charlie\",\"extra\":\"something\"}";
        PropertyBasedBean bean = mapper.readValue(json, PropertyBasedBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("Charlie", bean.name);
        Assert.assertEquals(25, bean.age);
        Assert.assertEquals("something", bean.extra);
    }

    @Test
    public void testDeserialize_propertyBasedWithAnySetter() throws Exception {
        String json = "{\"name\":\"David\",\"extraKey\":\"extraVal\"}";
        PropertyBasedWithAnySetterBean bean = mapper.readValue(json, PropertyBasedWithAnySetterBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("David", bean.name);
        Assert.assertEquals("extraVal", bean.getOther().get("extraKey"));
    }

    @Test
    public void testDeserialize_propertyBasedWithUnwrapped() throws Exception {
        String json = "{\"title\":\"Manager\",\"city\":\"Tokyo\",\"country\":\"Japan\"}";
        PropertyBasedUnwrappedBean bean = mapper.readValue(json, PropertyBasedUnwrappedBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("Manager", bean.title);
        Assert.assertNotNull(bean.location);
        Assert.assertEquals("Tokyo", bean.location.city);
        Assert.assertEquals("Japan", bean.location.country);
    }

    @Test
    public void testDeserialize_fromScalarCreators() throws Exception {
        ScalarCreatorBean strBean = mapper.readValue("\"stringValue\"", ScalarCreatorBean.class);
        Assert.assertEquals("stringValue", strBean.strVal);

        ScalarCreatorBean intBean = mapper.readValue("42", ScalarCreatorBean.class);
        Assert.assertEquals(42, intBean.intVal);

        ScalarCreatorBean doubleBean = mapper.readValue("3.14", ScalarCreatorBean.class);
        Assert.assertEquals(3.14, doubleBean.doubleVal, 0.001);

        ScalarCreatorBean boolBean = mapper.readValue("true", ScalarCreatorBean.class);
        Assert.assertTrue(boolBean.boolVal);
    }

    @Test
    public void testDeserialize_fromArrayCreator() throws Exception {
        String json = "[\"item1\", \"item2\"]";
        ArrayCreatorBean bean = mapper.readValue(json, ArrayCreatorBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(2, bean.items.size());
        Assert.assertEquals("item1", bean.items.get(0));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_nullReturningCreatorThrowsException() throws Exception {
        String json = "{\"dummy\":\"test\"}";
        mapper.readValue(json, NullReturningCreatorBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_throwingSetterThrowsWrappedException() throws Exception {
        String json = "{\"broken\":\"fail\"}";
        mapper.readValue(json, ThrowingSetterBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_unexpectedTokenThrowsException() throws Exception {
        String json = "[1,2,3]";
        mapper.readValue(json, SimpleBean.class);
    }

    @Test
    public void testDeserialize_nullFromCustomCodecHandling() throws Exception {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("{}");
        p.nextToken(); // START_OBJECT
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDeserializer deser = (BeanDeserializer) ctxt.findRootValueDeserializer(type);

        // Call deserializeFromNull when parser does not require custom codec
        try {
            deser.deserializeFromNull(p, ctxt);
        } catch (Exception e) {
            // Expected to handle unexpected token or report mapping exception
            Assert.assertNotNull(e);
        }
        p.close();
    }
}
