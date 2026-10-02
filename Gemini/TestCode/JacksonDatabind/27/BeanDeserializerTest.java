package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class BeanDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ==========================================
    // Test POJOs
    // ==========================================

    static class SimpleBean {
        private String name;
        private int age;

        public SimpleBean() {}

        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    static class Views {
        interface Public {}
        interface Internal extends Public {}
    }

    static class ViewBean {
        @JsonView(Views.Public.class)
        public String pub;
        @JsonView(Views.Internal.class)
        public String priv;
    }

    static class UnwrappedChild {
        public String childField;
    }

    static class UnwrappedParent {
        public String parentField;
        @JsonUnwrapped
        public UnwrappedChild child;
    }

    static class CreatorParentUnwrapped {
        public String parentField;
        @JsonUnwrapped
        public UnwrappedChild child;

        @JsonCreator
        public CreatorParentUnwrapped(@JsonProperty("parentField") String parentField,
                                      @JsonProperty("childField") String childField) {
            this.parentField = parentField;
            this.child = new UnwrappedChild();
            this.child.childField = childField;
        }
    }

    static class AnySetterBean {
        public String normal;
        private final Map<String, Object> any = new HashMap<String, Object>();

        @JsonAnySetter
        public void setAny(String key, Object value) {
            any.put(key, value);
        }

        public Map<String, Object> getAny() { return any; }
    }

    static class IgnorableBean {
        public String keep;
        @JsonIgnore
        public String ignored;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class IdentifiedBean {
        public int id;
        public String name;
        public IdentifiedBean next;
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    static class ArrayBean {
        public String a;
        public int b;
    }

    static class ExceptionBean {
        public void setFail(String val) {
            throw new IllegalArgumentException("Forced setter error: " + val);
        }
    }

    static class CreatorBean {
        public final String a;
        public final int b;
        public String c;

        @JsonCreator
        public CreatorBean(@JsonProperty("a") String a, @JsonProperty("b") int b) {
            this.a = a;
            this.b = b;
        }
    }

    static class CreatorWithAnyAndIgnoreBean {
        public final String a;
        public String b;
        private final Map<String, Object> other = new HashMap<String, Object>();

        @JsonCreator
        public CreatorWithAnyAndIgnoreBean(@JsonProperty("a") String a) {
            this.a = a;
        }

        @JsonAnySetter
        public void setOther(String k, Object v) {
            other.put(k, v);
        }
    }

    static class BasePolymorphicCreator {
        public String type;

        @JsonCreator
        public static BasePolymorphicCreator create(@JsonProperty("type") String type) {
            if ("sub".equals(type)) {
                return new SubPolymorphicCreator();
            }
            BasePolymorphicCreator base = new BasePolymorphicCreator();
            base.type = type;
            return base;
        }
    }

    static class SubPolymorphicCreator extends BasePolymorphicCreator {
        public String extra;
    }

    static class NullCreatorBean {
        @JsonCreator
        public static NullCreatorBean create(@JsonProperty("val") String val) {
            return null;
        }
    }

    static class StringCreatorBean {
        public String value;
        @JsonCreator
        public StringCreatorBean(String val) { this.value = val; }
    }

    static class IntCreatorBean {
        public int value;
        @JsonCreator
        public IntCreatorBean(int val) { this.value = val; }
    }

    static class DoubleCreatorBean {
        public double value;
        @JsonCreator
        public DoubleCreatorBean(double val) { this.value = val; }
    }

    static class BooleanCreatorBean {
        public boolean value;
        @JsonCreator
        public BooleanCreatorBean(boolean val) { this.value = val; }
    }

    static class ArrayCreatorBean {
        public List<String> values;
        @JsonCreator
        public ArrayCreatorBean(List<String> values) { this.values = values; }
    }

    static class ExternalTypeHelper {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "extType")
        @JsonSubTypes({
                @JsonSubTypes.Type(value = ExtVal1.class, name = "v1"),
                @JsonSubTypes.Type(value = ExtVal2.class, name = "v2")
        })
        public Object value;
        public String extType;
        public String regular;
    }

    static class ExternalTypeWithCreatorHelper {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "extType")
        @JsonSubTypes({
                @JsonSubTypes.Type(value = ExtVal1.class, name = "v1")
        })
        public Object value;
        public String extType;
        public String creatorProp;

        @JsonCreator
        public ExternalTypeWithCreatorHelper(@JsonProperty("creatorProp") String creatorProp) {
            this.creatorProp = creatorProp;
        }
    }

    static class ExtVal1 {
        public int x;
    }

    static class ExtVal2 {
        public String y;
    }

    // ==========================================
    // Tests: Vanilla & Standard Deserialization
    // ==========================================

    @Test
    public void testDeserialize_vanillaObject_success() throws IOException {
        String json = "{\"name\":\"John\",\"age\":30}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("John", bean.getName());
        Assert.assertEquals(30, bean.getAge());
    }

    @Test
    public void testDeserialize_emptyObject_success() throws IOException {
        SimpleBean bean = mapper.readValue("{}", SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertNull(bean.getName());
        Assert.assertEquals(0, bean.getAge());
    }

    @Test(expected = UnrecognizedPropertyException.class)
    public void testDeserialize_unknownProperty_throwsException() throws IOException {
        mapper.readValue("{\"unknown\":123}", SimpleBean.class);
    }

    @Test
    public void testDeserialize_ignoreUnknownProperties_success() throws IOException {
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        SimpleBean bean = customMapper.readValue("{\"unknown\":123,\"name\":\"Alice\"}", SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("Alice", bean.getName());
    }

    @Test
    public void testDeserialize_updatingExistingBean_success() throws IOException {
        SimpleBean bean = new SimpleBean("Init", 10);
        mapper.readerForUpdating(bean).readValue("{\"name\":\"Updated\",\"age\":20}");
        Assert.assertEquals("Updated", bean.getName());
        Assert.assertEquals(20, bean.getAge());
    }

    @Test
    public void testDeserialize_updatingExistingBean_emptyObject() throws IOException {
        SimpleBean bean = new SimpleBean("Init", 10);
        mapper.readerForUpdating(bean).readValue("{}");
        Assert.assertEquals("Init", bean.getName());
        Assert.assertEquals(10, bean.getAge());
    }

    // ==========================================
    // Tests: Secondary deserialization & Views
    // ==========================================

    @Test
    public void testDeserializeWithView_activeView_skipsInactiveFields() throws IOException {
        String json = "{\"pub\":\"publicVal\",\"priv\":\"secretVal\"}";

        ViewBean resultPub = mapper.readerWithView(Views.Public.class)
                .forType(ViewBean.class)
                .readValue(json);
        Assert.assertEquals("publicVal", resultPub.pub);
        Assert.assertNull(resultPub.priv);

        ViewBean resultInternal = mapper.readerWithView(Views.Internal.class)
                .forType(ViewBean.class)
                .readValue(json);
        Assert.assertEquals("publicVal", resultInternal.pub);
        Assert.assertEquals("secretVal", resultInternal.priv);
    }

    @Test
    public void testDeserializeWithView_updatingExistingBean() throws IOException {
        ViewBean bean = new ViewBean();
        bean.pub = "initialPub";
        bean.priv = "initialPriv";

        mapper.readerWithView(Views.Public.class)
                .forType(ViewBean.class)
                .readerForUpdating(bean)
                .readValue("{\"pub\":\"newPub\",\"priv\":\"newPriv\"}");

        Assert.assertEquals("newPub", bean.pub);
        Assert.assertEquals("initialPriv", bean.priv);
    }

    // ==========================================
    // Tests: ObjectId Handling
    // ==========================================

    @Test
    public void testDeserialize_withObjectId_success() throws IOException {
        String json = "{\"id\":1,\"name\":\"Parent\",\"next\":{\"id\":2,\"name\":\"Child\",\"next\":1}}";
        IdentifiedBean parent = mapper.readValue(json, IdentifiedBean.class);
        Assert.assertNotNull(parent);
        Assert.assertEquals(1, parent.id);
        Assert.assertNotNull(parent.next);
        Assert.assertEquals(2, parent.next.id);
        Assert.assertSame(parent, parent.next.next);
    }

    // ==========================================
    // Tests: Unwrapped Properties
    // ==========================================

    @Test
    public void testDeserialize_unwrappedProperties_success() throws IOException {
        String json = "{\"parentField\":\"pVal\",\"childField\":\"cVal\"}";
        UnwrappedParent parent = mapper.readValue(json, UnwrappedParent.class);
        Assert.assertNotNull(parent);
        Assert.assertEquals("pVal", parent.parentField);
        Assert.assertNotNull(parent.child);
        Assert.assertEquals("cVal", parent.child.childField);
    }

    @Test
    public void testDeserialize_unwrappedProperties_updatingExistingBean() throws IOException {
        UnwrappedParent parent = new UnwrappedParent();
        mapper.readerForUpdating(parent).readValue("{\"parentField\":\"p1\",\"childField\":\"c1\"}");
        Assert.assertEquals("p1", parent.parentField);
        Assert.assertNotNull(parent.child);
        Assert.assertEquals("c1", parent.child.childField);
    }

    @Test
    public void testDeserialize_creatorWithUnwrapped_success() throws IOException {
        String json = "{\"parentField\":\"creatorP\",\"childField\":\"creatorC\"}";
        CreatorParentUnwrapped result = mapper.readValue(json, CreatorParentUnwrapped.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("creatorP", result.parentField);
        Assert.assertNotNull(result.child);
        Assert.assertEquals("creatorC", result.child.childField);
    }

    // ==========================================
    // Tests: Property-Based Creator & Buffering
    // ==========================================

    @Test
    public void testDeserialize_propertyBasedCreator_success() throws IOException {
        String json = "{\"b\":42,\"a\":\"strA\",\"c\":\"regular\"}";
        CreatorBean result = mapper.readValue(json, CreatorBean.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("strA", result.a);
        Assert.assertEquals(42, result.b);
        Assert.assertEquals("regular", result.c);
    }

    @Test
    public void testDeserialize_creatorWithAnyAndIgnoredAndUnknown() throws IOException {
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String json = "{\"extra1\":\"anyVal\",\"a\":\"valA\",\"b\":\"valB\",\"unknownField\":\"discard\"}";
        CreatorWithAnyAndIgnoreBean result = customMapper.readValue(json, CreatorWithAnyAndIgnoreBean.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("valA", result.a);
        Assert.assertEquals("valB", result.b);
        Assert.assertEquals("anyVal", result.other.get("extra1"));
    }

    @Test
    public void testDeserialize_polymorphicCreator_returnsSubclass() throws IOException {
        String json = "{\"type\":\"sub\",\"extra\":\"subVal\"}";
        BasePolymorphicCreator result = mapper.readValue(json, BasePolymorphicCreator.class);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SubPolymorphicCreator);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_nullCreator_throwsException() throws IOException {
        mapper.readValue("{\"val\":\"hello\"}", NullCreatorBean.class);
    }

    // ==========================================
    // Tests: AnySetter and Ignored Properties
    // ==========================================

    @Test
    public void testDeserialize_anySetter_success() throws IOException {
        String json = "{\"normal\":\"norm\",\"key1\":\"val1\",\"key2\":100}";
        AnySetterBean bean = mapper.readValue(json, AnySetterBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("norm", bean.normal);
        Assert.assertEquals("val1", bean.getAny().get("key1"));
        Assert.assertEquals(100, bean.getAny().get("key2"));
    }

    @Test
    public void testDeserialize_ignoredProperty_success() throws IOException {
        String json = "{\"keep\":\"ok\",\"ignored\":\"skipMe\"}";
        IgnorableBean bean = mapper.readValue(json, IgnorableBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("ok", bean.keep);
        Assert.assertNull(bean.ignored);
    }

    // ==========================================
    // Tests: External Type Id
    // ==========================================

    @Test
    public void testDeserialize_externalTypeId_standardObject() throws IOException {
        String json = "{\"extType\":\"v1\",\"value\":{\"x\":55},\"regular\":\"reg\"}";
        ExternalTypeHelper helper = mapper.readValue(json, ExternalTypeHelper.class);
        Assert.assertNotNull(helper);
        Assert.assertEquals("reg", helper.regular);
        Assert.assertEquals("v1", helper.extType);
        Assert.assertTrue(helper.value instanceof ExtVal1);
        Assert.assertEquals(55, ((ExtVal1) helper.value).x);
    }

    @Test
    public void testDeserialize_externalTypeId_withPropertyBasedCreator() throws IOException {
        String json = "{\"creatorProp\":\"cr\",\"extType\":\"v1\",\"value\":{\"x\":99}}";
        ExternalTypeWithCreatorHelper helper = mapper.readValue(json, ExternalTypeWithCreatorHelper.class);
        Assert.assertNotNull(helper);
        Assert.assertEquals("cr", helper.creatorProp);
        Assert.assertTrue(helper.value instanceof ExtVal1);
        Assert.assertEquals(99, ((ExtVal1) helper.value).x);
    }

    // ==========================================
    // Tests: _deserializeOther (Alternative Tokens)
    // ==========================================

    @Test
    public void testDeserialize_fromScalarTokens() throws IOException {
        StringCreatorBean strBean = mapper.readValue("\"helloString\"", StringCreatorBean.class);
        Assert.assertEquals("helloString", strBean.value);

        IntCreatorBean intBean = mapper.readValue("123", IntCreatorBean.class);
        Assert.assertEquals(123, intBean.value);

        DoubleCreatorBean dblBean = mapper.readValue("45.67", DoubleCreatorBean.class);
        Assert.assertEquals(45.67, dblBean.value, 0.0001);

        BooleanCreatorBean boolBean = mapper.readValue("true", BooleanCreatorBean.class);
        Assert.assertTrue(boolBean.value);

        ArrayCreatorBean arrBean = mapper.readValue("[\"item1\",\"item2\"]", ArrayCreatorBean.class);
        Assert.assertEquals(2, arrBean.values.size());
        Assert.assertEquals("item1", arrBean.values.get(0));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_unexpectedToken_throwsMappingException() throws IOException {
        mapper.readValue("true", SimpleBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_missingToken_throwsException() throws IOException {
        mapper.readValue("", SimpleBean.class);
    }

    // ==========================================
    // Tests: AsArray Deserialization
    // ==========================================

    @Test
    public void testDeserialize_asArrayDeserializer() throws IOException {
        String json = "[\"firstVal\", 42]";
        ArrayBean bean = mapper.readValue(json, ArrayBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("firstVal", bean.a);
        Assert.assertEquals(42, bean.b);
    }

    // ==========================================
    // Tests: Exceptions and Error Handling
    // ==========================================

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_setterException_wrappedAndThrown() throws IOException {
        mapper.readValue("{\"fail\":\"causeError\"}", ExceptionBean.class);
    }

    // ==========================================
    // Tests: Mutators & Helper Methods of BeanDeserializer
    // ==========================================

    @Test
    public void testBeanDeserializer_mutatorMethods() throws IOException {
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(SimpleBean.class);
        JsonDeserializer<?> deser = mapper.getDeserializationContext().findRootValueDeserializer(type);

        if (deser instanceof BeanDeserializer) {
            BeanDeserializer beanDeser = (BeanDeserializer) deser;

            // unwrappingDeserializer
            JsonDeserializer<Object> unwrapped = beanDeser.unwrappingDeserializer(NameTransformer.simpleTransformer("pre_", ""));
            Assert.assertNotNull(unwrapped);

            // withObjectIdReader
            BeanDeserializer withOir = beanDeser.withObjectIdReader(null);
            Assert.assertNotNull(withOir);

            // withIgnorableProperties
            HashSet<String> set = new HashSet<String>();
            set.add("dummy");
            BeanDeserializer withIgn = beanDeser.withIgnorableProperties(set);
            Assert.assertNotNull(withIgn);

            // asArrayDeserializer
            BeanDeserializerBase asArr = beanDeser.asArrayDeserializer();
            Assert.assertNotNull(asArr);
            Assert.assertTrue(asArr instanceof BeanAsArrayDeserializer);
        }
    }
}
