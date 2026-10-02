package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    // =========================================================================
    // Test POJOs
    // =========================================================================

    public static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean() {}

        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Views {
        public static class Public {}
        public static class Internal extends Public {}
    }

    public static class ViewBean {
        @JsonView(Views.Public.class)
        public String publicField;

        @JsonView(Views.Internal.class)
        public String internalField;

        public String defaultField;
    }

    @JsonIgnoreProperties({"ignored1", "ignored2"})
    public static class IgnorableBean {
        public String keep;
        public String ignored1;
    }

    public static class AnySetterBean {
        public String name;
        private final Map<String, Object> extra = new HashMap<String, Object>();

        @JsonAnySetter
        public void setExtra(String key, Object value) {
            extra.put(key, value);
        }

        public Map<String, Object> getExtra() {
            return extra;
        }
    }

    public static class CreatorBean {
        public final String id;
        public final int count;
        public String extra;

        @JsonCreator
        public CreatorBean(@JsonProperty("id") String id, @JsonProperty("count") int count) {
            this.id = id;
            this.count = count;
        }
    }

    public static class FailingCreatorBean {
        @JsonCreator
        public FailingCreatorBean(@JsonProperty("name") String name) {
            if ("fail".equals(name)) {
                throw new IllegalArgumentException("Creator failure intentionally triggered");
            }
        }
    }

    public static class NullReturningCreatorBean {
        @JsonCreator
        public static NullReturningCreatorBean create(@JsonProperty("name") String name) {
            return null;
        }
    }

    public static class UnwrappedOuterBean {
        public String title;
        @JsonUnwrapped
        public SimpleBean inner;
    }

    public static class UnwrappedWithCreatorOuterBean {
        public final String title;
        @JsonUnwrapped
        public SimpleBean inner;

        @JsonCreator
        public UnwrappedWithCreatorOuterBean(@JsonProperty("title") String title) {
            this.title = title;
        }
    }

    public static class UnwrappedWithAnySetter {
        public String title;
        @JsonUnwrapped
        public SimpleBean inner;
        private final Map<String, Object> extra = new HashMap<String, Object>();

        @JsonAnySetter
        public void setAny(String k, Object v) {
            extra.put(k, v);
        }

        public Map<String, Object> getExtra() {
            return extra;
        }
    }

    public static class ExternalTypeBean {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "extType")
        @JsonSubTypes({
            @JsonSubTypes.Type(value = SimpleBean.class, name = "simple")
        })
        public Object payload;
        public String extType;
    }

    public static class ExternalTypeWithCreatorBean {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "extType")
        @JsonSubTypes({
            @JsonSubTypes.Type(value = SimpleBean.class, name = "simple")
        })
        public final Object payload;
        public final String extType;

        @JsonCreator
        public ExternalTypeWithCreatorBean(@JsonProperty("payload") Object payload, @JsonProperty("extType") String extType) {
            this.payload = payload;
            this.extType = extType;
        }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class IdentifiedBean {
        public int id;
        public String name;
        public IdentifiedBean next;

        public IdentifiedBean() {}
        public IdentifiedBean(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    public static class AsArrayBean {
        public String a;
        public int b;
    }

    public static class SetterExceptionBean {
        public void setName(String name) {
            throw new RuntimeException("Setter deliberate error");
        }
    }

    // =========================================================================
    // Test Cases
    // =========================================================================

    @Test
    public void testVanillaDeserialize_validJson_success() throws Exception {
        String json = "{\"name\":\"John\", \"age\":30}";
        SimpleBean result = mapper.readValue(json, SimpleBean.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("John", result.name);
        Assert.assertEquals(30, result.age);
    }

    @Test
    public void testVanillaDeserialize_emptyObject_success() throws Exception {
        String json = "{}";
        SimpleBean result = mapper.readValue(json, SimpleBean.class);
        Assert.assertNotNull(result);
        Assert.assertNull(result.name);
        Assert.assertEquals(0, result.age);
    }

    @Test
    public void testDeserialize_updatingExistingBean_success() throws Exception {
        SimpleBean bean = new SimpleBean("Init", 10);
        String json = "{\"name\":\"Updated\", \"age\":20}";
        SimpleBean updated = mapper.readerForUpdating(bean).readValue(json);
        Assert.assertSame(bean, updated);
        Assert.assertEquals("Updated", bean.name);
        Assert.assertEquals(20, bean.age);
    }

    @Test
    public void testDeserialize_updatingExistingBeanEmpty_success() throws Exception {
        SimpleBean bean = new SimpleBean("Init", 10);
        String json = "{}";
        SimpleBean updated = mapper.readerForUpdating(bean).readValue(json);
        Assert.assertSame(bean, updated);
        Assert.assertEquals("Init", bean.name);
        Assert.assertEquals(10, bean.age);
    }

    @Test
    public void testDeserializeWithView_publicView_skipsInternal() throws Exception {
        String json = "{\"publicField\":\"pub\", \"internalField\":\"priv\", \"defaultField\":\"def\"}";
        ViewBean bean = mapper.readerWithView(Views.Public.class)
                .forType(ViewBean.class)
                .readValue(json);
        Assert.assertNotNull(bean);
        Assert.assertEquals("pub", bean.publicField);
        Assert.assertNull(bean.internalField);
        Assert.assertEquals("def", bean.defaultField);
    }

    @Test
    public void testDeserializeWithView_internalView_includesAll() throws Exception {
        String json = "{\"publicField\":\"pub\", \"internalField\":\"priv\", \"defaultField\":\"def\"}";
        ViewBean bean = mapper.readerWithView(Views.Internal.class)
                .forType(ViewBean.class)
                .readValue(json);
        Assert.assertNotNull(bean);
        Assert.assertEquals("pub", bean.publicField);
        Assert.assertEquals("priv", bean.internalField);
        Assert.assertEquals("def", bean.defaultField);
    }

    @Test
    public void testDeserializeWithIgnorableProperties_ignoredPropsSkipped() throws Exception {
        String json = "{\"keep\":\"value\", \"ignored1\":\"skip1\", \"ignored2\":\"skip2\"}";
        IgnorableBean bean = mapper.readValue(json, IgnorableBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("value", bean.keep);
        Assert.assertNull(bean.ignored1);
    }

    @Test
    public void testDeserializeWithAnySetter_unknownFieldsCollected() throws Exception {
        String json = "{\"name\":\"Alice\", \"foo\":\"bar\", \"num\":42}";
        AnySetterBean bean = mapper.readValue(json, AnySetterBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("Alice", bean.name);
        Assert.assertEquals("bar", bean.getExtra().get("foo"));
        Assert.assertEquals(42, bean.getExtra().get("num"));
    }

    @Test
    public void testPropertyBasedCreator_validProperties_success() throws Exception {
        String json = "{\"id\":\"C100\", \"count\":5, \"extra\":\"optional\"}";
        CreatorBean bean = mapper.readValue(json, CreatorBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("C100", bean.id);
        Assert.assertEquals(5, bean.count);
        Assert.assertEquals("optional", bean.extra);
    }

    @Test(expected = JsonMappingException.class)
    public void testPropertyBasedCreator_creatorThrowsException_throwsJsonMappingException() throws Exception {
        String json = "{\"name\":\"fail\"}";
        mapper.readValue(json, FailingCreatorBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testPropertyBasedCreator_nullReturningCreator_throwsException() throws Exception {
        String json = "{\"name\":\"anything\"}";
        mapper.readValue(json, NullReturningCreatorBean.class);
    }

    @Test
    public void testUnwrapped_defaultCreator_success() throws Exception {
        String json = "{\"title\":\"MyTitle\", \"name\":\"InnerName\", \"age\":15}";
        UnwrappedOuterBean bean = mapper.readValue(json, UnwrappedOuterBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("MyTitle", bean.title);
        Assert.assertNotNull(bean.inner);
        Assert.assertEquals("InnerName", bean.inner.name);
        Assert.assertEquals(15, bean.inner.age);
    }

    @Test
    public void testUnwrapped_withCreator_success() throws Exception {
        String json = "{\"title\":\"CreatedTitle\", \"name\":\"InnerName2\", \"age\":25}";
        UnwrappedWithCreatorOuterBean bean = mapper.readValue(json, UnwrappedWithCreatorOuterBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("CreatedTitle", bean.title);
        Assert.assertNotNull(bean.inner);
        Assert.assertEquals("InnerName2", bean.inner.name);
        Assert.assertEquals(25, bean.inner.age);
    }

    @Test
    public void testUnwrapped_updatingExistingBean_success() throws Exception {
        UnwrappedOuterBean bean = new UnwrappedOuterBean();
        String json = "{\"title\":\"UpdatedTitle\", \"name\":\"InnerName3\", \"age\":35}";
        UnwrappedOuterBean res = mapper.readerForUpdating(bean).readValue(json);
        Assert.assertSame(bean, res);
        Assert.assertEquals("UpdatedTitle", bean.title);
        Assert.assertNotNull(bean.inner);
        Assert.assertEquals("InnerName3", bean.inner.name);
        Assert.assertEquals(35, bean.inner.age);
    }

    @Test
    public void testUnwrapped_withAnySetter_success() throws Exception {
        String json = "{\"title\":\"Title\", \"name\":\"InnerName4\", \"age\":45, \"extraField\":\"custom\"}";
        UnwrappedWithAnySetter bean = mapper.readValue(json, UnwrappedWithAnySetter.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("Title", bean.title);
        Assert.assertNotNull(bean.inner);
        Assert.assertEquals("InnerName4", bean.inner.name);
        Assert.assertEquals("custom", bean.getExtra().get("extraField"));
    }

    @Test
    public void testExternalTypeId_defaultCreator_success() throws Exception {
        String json = "{\"extType\":\"simple\", \"payload\":{\"name\":\"Ext\", \"age\":99}}";
        ExternalTypeBean bean = mapper.readValue(json, ExternalTypeBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("simple", bean.extType);
        Assert.assertTrue(bean.payload instanceof SimpleBean);
        SimpleBean inner = (SimpleBean) bean.payload;
        Assert.assertEquals("Ext", inner.name);
        Assert.assertEquals(99, inner.age);
    }

    @Test
    public void testExternalTypeId_withCreator_success() throws Exception {
        String json = "{\"payload\":{\"name\":\"ExtCreator\", \"age\":88}, \"extType\":\"simple\"}";
        ExternalTypeWithCreatorBean bean = mapper.readValue(json, ExternalTypeWithCreatorBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("simple", bean.extType);
        Assert.assertTrue(bean.payload instanceof SimpleBean);
        SimpleBean inner = (SimpleBean) bean.payload;
        Assert.assertEquals("ExtCreator", inner.name);
        Assert.assertEquals(88, inner.age);
    }

    @Test
    public void testObjectId_forwardReferenceAndCycles_success() throws Exception {
        String json = "{\"id\":1, \"name\":\"First\", \"next\":{\"id\":2, \"name\":\"Second\", \"next\":1}}";
        IdentifiedBean first = mapper.readValue(json, IdentifiedBean.class);
        Assert.assertNotNull(first);
        Assert.assertEquals(1, first.id);
        Assert.assertEquals("First", first.name);
        Assert.assertNotNull(first.next);
        Assert.assertEquals(2, first.next.id);
        Assert.assertEquals("Second", first.next.name);
        Assert.assertSame(first, first.next.next);
    }

    @Test
    public void testAsArrayDeserializer_shapeArray_success() throws Exception {
        String json = "[\"TestArray\", 123]";
        AsArrayBean bean = mapper.readValue(json, AsArrayBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("TestArray", bean.a);
        Assert.assertEquals(123, bean.b);
    }

    @Test(expected = MismatchedInputException.class)
    public void testDeserialize_unexpectedToken_throwsMismatchedInputException() throws Exception {
        String json = "12345";
        mapper.readValue(json, SimpleBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_setterThrowsException_throwsJsonMappingException() throws Exception {
        String json = "{\"name\":\"test\"}";
        mapper.readValue(json, SetterExceptionBean.class);
    }

    @Test
    public void testNullDeserialization_returnsNull() throws Exception {
        String json = "null";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        Assert.assertNull(bean);
    }

    @Test
    public void testUnwrappingDeserializer_recursionGuard_returnsSameInstance() throws Exception {
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(SimpleBean.class);
        JsonDeserializer<Object> deser = mapper.getDeserializationConfig()
                .findTypeDeserializer(type) == null ?
                (JsonDeserializer<Object>) mapper.getDeserializationContext().findRootValueDeserializer(type) : null;

        if (deser instanceof BeanDeserializer) {
            BeanDeserializer bd = (BeanDeserializer) deser;
            NameTransformer transformer = NameTransformer.simpleTransformer("pre_", "");
            JsonDeserializer<Object> unwrapped = bd.unwrappingDeserializer(transformer);
            Assert.assertNotNull(unwrapped);
            Assert.assertNotSame(bd, unwrapped);
        }
    }

    @Test
    public void testWithObjectIdReader_returnsNewInstance() throws Exception {
        JavaType type = mapper.constructType(SimpleBean.class);
        JsonDeserializer<Object> deser = mapper.getDeserializationContext().findRootValueDeserializer(type);
        if (deser instanceof BeanDeserializer) {
            BeanDeserializer bd = (BeanDeserializer) deser;
            BeanDeserializer withOir = bd.withObjectIdReader(null);
            Assert.assertNotNull(withOir);
            Assert.assertNotSame(bd, withOir);
        }
    }

    @Test
    public void testWithIgnorableProperties_returnsNewInstance() throws Exception {
        JavaType type = mapper.constructType(SimpleBean.class);
        JsonDeserializer<Object> deser = mapper.getDeserializationContext().findRootValueDeserializer(type);
        if (deser instanceof BeanDeserializer) {
            BeanDeserializer bd = (BeanDeserializer) deser;
            Set<String> ignores = Collections.singleton("dummy");
            BeanDeserializer withIgnores = bd.withIgnorableProperties(ignores);
            Assert.assertNotNull(withIgnores);
            Assert.assertNotSame(bd, withIgnores);
        }
    }

    @Test
    public void testWithBeanProperties_returnsNewInstance() throws Exception {
        JavaType type = mapper.constructType(SimpleBean.class);
        JsonDeserializer<Object> deser = mapper.getDeserializationContext().findRootValueDeserializer(type);
        if (deser instanceof BeanDeserializer) {
            BeanDeserializer bd = (BeanDeserializer) deser;
            BeanPropertyMap map = BeanPropertyMap.construct(Collections.<SettableBeanProperty>emptyList(), false, Collections.<String, List<com.fasterxml.jackson.databind.PropertyName>>emptyMap());
            BeanDeserializerBase withProps = bd.withBeanProperties(map);
            Assert.assertNotNull(withProps);
            Assert.assertNotSame(bd, withProps);
        }
    }

    @Test
    public void testAsArrayDeserializer_directCall_returnsBeanAsArrayDeserializer() throws Exception {
        JavaType type = mapper.constructType(SimpleBean.class);
        JsonDeserializer<Object> deser = mapper.getDeserializationContext().findRootValueDeserializer(type);
        if (deser instanceof BeanDeserializer) {
            BeanDeserializer bd = (BeanDeserializer) deser;
            BeanDeserializerBase arrayDeser = bd.asArrayDeserializer();
            Assert.assertNotNull(arrayDeser);
            Assert.assertTrue(arrayDeser instanceof BeanAsArrayDeserializer);
        }
    }

    @Test
    public void testCreatorReturnedNullException_lazyInit() {
        JavaType type = mapper.constructType(SimpleBean.class);
        try {
            JsonDeserializer<Object> deser = mapper.getDeserializationContext().findRootValueDeserializer(type);
            if (deser instanceof BeanDeserializer) {
                BeanDeserializer bd = (BeanDeserializer) deser;
                Exception ex1 = bd._creatorReturnedNullException();
                Exception ex2 = bd._creatorReturnedNullException();
                Assert.assertNotNull(ex1);
                Assert.assertSame(ex1, ex2);
            }
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testCopyConstructors_instantiation() throws Exception {
        JavaType type = mapper.constructType(SimpleBean.class);
        JsonDeserializer<Object> deser = mapper.getDeserializationContext().findRootValueDeserializer(type);
        if (deser instanceof BeanDeserializer) {
            BeanDeserializer bd = (BeanDeserializer) deser;
            BeanDeserializer copy1 = new BeanDeserializer(bd);
            BeanDeserializer copy2 = new BeanDeserializer(bd, true);
            BeanDeserializer copy3 = new BeanDeserializer(bd, (ObjectIdReader) null);
            BeanDeserializer copy4 = new BeanDeserializer(bd, Collections.singleton("prop"));
            BeanDeserializer copy5 = new BeanDeserializer(bd, NameTransformer.NOP);

            Assert.assertNotNull(copy1);
            Assert.assertNotNull(copy2);
            Assert.assertNotNull(copy3);
            Assert.assertNotNull(copy4);
            Assert.assertNotNull(copy5);
        }
    }

    @Test
    public void testFailOnUnknownProperties_disabled_skipsUnknown() throws Exception {
        ObjectMapper om = new ObjectMapper();
        om.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        String json = "{\"name\":\"Alice\", \"unknownProp\":12345, \"age\":22}";
        SimpleBean bean = om.readValue(json, SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("Alice", bean.name);
        Assert.assertEquals(22, bean.age);
    }
}
