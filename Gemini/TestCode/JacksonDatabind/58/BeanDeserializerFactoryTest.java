package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class BeanDeserializerFactoryTest {

    // Subclass for testing withConfig inheritance validation
    static class CustomSubclassFactory extends BeanDeserializerFactory {
        public CustomSubclassFactory(DeserializerFactoryConfig config) {
            super(config);
        }
    }

    // Helper Beans
    public static class SimpleBean {
        public String name;
        private int age;

        public SimpleBean() {}

        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    public static class CreatorBean {
        private final String item;
        private final int count;

        @JsonCreator
        public CreatorBean(@JsonProperty("item") String item, @JsonProperty("count") int count) {
            this.item = item;
            this.count = count;
        }

        public String getItem() { return item; }
        public int getCount() { return count; }
    }

    @JsonIgnoreProperties({"ignoredField"})
    public static class IgnoredBean {
        public String kept;
        public String ignoredField;
    }

    @JsonIgnoreType
    public static class IgnorableType {
        public String secret;
    }

    public static class BeanWithIgnorableType {
        public String id;
        public IgnorableType ignorable;
    }

    public static class AnySetterBean {
        private final Map<String, Object> other = new HashMap<String, Object>();

        @JsonAnySetter
        public void setOther(String name, Object value) {
            other.put(name, value);
        }

        public Map<String, Object> getOther() { return other; }
    }

    public static class SetterlessBean {
        private final List<String> items = new ArrayList<String>();
        private final Map<String, String> map = new HashMap<String, String>();

        public List<String> getItems() { return items; }
        public Map<String, String> getMap() { return map; }
    }

    public static class ViewsBean {
        public interface PublicView {}
        public interface PrivateView extends PublicView {}

        @JsonView(PublicView.class)
        public String publicData;

        @JsonView(PrivateView.class)
        public String privateData;
    }

    public static class Parent {
        public String name;
        @JsonManagedReference
        public Child child;
    }

    public static class Child {
        public String title;
        @JsonBackReference
        public Parent parent;
    }

    public static class InjectableBean {
        @JacksonInject("injectedVal")
        public String injected;
        public String normal;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class PropertyIdBean {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    public static class SequenceIdBean {
        public String name;
    }

    public static class CustomException extends Exception {
        private String extraInfo;

        public CustomException() { super(); }
        public CustomException(String msg) { super(msg); }

        public String getExtraInfo() { return extraInfo; }
        public void setExtraInfo(String extraInfo) { this.extraInfo = extraInfo; }
    }

    @JsonDeserialize(builder = ValueObject.Builder.class)
    public static class ValueObject {
        private final String a;
        private final int b;

        ValueObject(String a, int b) {
            this.a = a;
            this.b = b;
        }

        public String getA() { return a; }
        public int getB() { return b; }

        @JsonPOJOBuilder(withPrefix = "set", buildMethodName = "create")
        public static class Builder {
            private String a;
            private int b;

            public Builder setA(String a) { this.a = a; return this; }
            public Builder setB(int b) { this.b = b; return this; }
            public ValueObject create() { return new ValueObject(a, b); }
        }
    }

    public interface AbstractInterface {
        String getValue();
    }

    public static class ConcreteImpl implements AbstractInterface {
        private String value;
        public ConcreteImpl() {}
        public ConcreteImpl(String value) { this.value = value; }
        @Override
        public String getValue() { return value; }
        public void setValue(String value) { this.value = value; }
    }

    public abstract static class NonInstantiatableAbstract {
        public String name;
    }

    @Test
    public void testWithConfig_sameConfig_returnsSameInstance() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        DeserializerFactoryConfig config = factory.getFactoryConfig();
        DeserializerFactory sameFactory = factory.withConfig(config);
        Assert.assertSame(factory, sameFactory);
    }

    @Test
    public void testWithConfig_newConfig_returnsNewInstance() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        DeserializerFactory newFactory = factory.withConfig(newConfig);
        Assert.assertNotSame(factory, newFactory);
        Assert.assertTrue(newFactory instanceof BeanDeserializerFactory);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclassWithoutOverride_throwsException() {
        CustomSubclassFactory customFactory = new CustomSubclassFactory(new DeserializerFactoryConfig());
        customFactory.withConfig(new DeserializerFactoryConfig());
    }

    @Test
    public void testCreateBeanDeserializer_simpleBean_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"John\",\"age\":30}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("John", bean.name);
        Assert.assertEquals(30, bean.getAge());
    }

    @Test
    public void testCreateBeanDeserializer_creatorBean_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"item\":\"pen\",\"count\":5}";
        CreatorBean bean = mapper.readValue(json, CreatorBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("pen", bean.getItem());
        Assert.assertEquals(5, bean.getCount());
    }

    @Test
    public void testCreateBeanDeserializer_ignoredProperties_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"kept\":\"ok\",\"ignoredField\":\"skip\"}";
        IgnoredBean bean = mapper.readValue(json, IgnoredBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("ok", bean.kept);
        Assert.assertNull(bean.ignoredField);
    }

    @Test
    public void testCreateBeanDeserializer_ignorableType_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"id\":\"123\",\"ignorable\":{\"secret\":\"hidden\"}}";
        BeanWithIgnorableType bean = mapper.readValue(json, BeanWithIgnorableType.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("123", bean.id);
        Assert.assertNull(bean.ignorable);
    }

    @Test
    public void testCreateBeanDeserializer_anySetter_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"k1\":\"v1\",\"k2\":\"v2\"}";
        AnySetterBean bean = mapper.readValue(json, AnySetterBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("v1", bean.getOther().get("k1"));
        Assert.assertEquals("v2", bean.getOther().get("k2"));
    }

    @Test
    public void testCreateBeanDeserializer_setterlessProperties_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.USE_GETTERS_AS_SETTERS);
        String json = "{\"items\":[\"a\",\"b\"],\"map\":{\"key\":\"value\"}}";
        SetterlessBean bean = mapper.readValue(json, SetterlessBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(Arrays.asList("a", "b"), bean.getItems());
        Assert.assertEquals("value", bean.getMap().get("key"));
    }

    @Test
    public void testCreateBeanDeserializer_views_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"publicData\":\"pub\",\"privateData\":\"priv\"}";

        ViewsBean publicOnly = mapper.readerWithView(ViewsBean.PublicView.class)
                .forType(ViewsBean.class)
                .readValue(json);
        Assert.assertEquals("pub", publicOnly.publicData);
        Assert.assertNull(publicOnly.privateData);

        ViewsBean full = mapper.readerWithView(ViewsBean.PrivateView.class)
                .forType(ViewsBean.class)
                .readValue(json);
        Assert.assertEquals("pub", full.publicData);
        Assert.assertEquals("priv", full.privateData);
    }

    @Test
    public void testCreateBeanDeserializer_managedAndBackReference_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"Parent\",\"child\":{\"title\":\"Child\"}}";
        Parent parent = mapper.readValue(json, Parent.class);
        Assert.assertNotNull(parent);
        Assert.assertEquals("Parent", parent.name);
        Assert.assertNotNull(parent.child);
        Assert.assertEquals("Child", parent.child.title);
        Assert.assertSame(parent, parent.child.parent);
    }

    @Test
    public void testCreateBeanDeserializer_injectables_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std inject = new InjectableValues.Std();
        inject.addValue("injectedVal", "injected-content");

        String json = "{\"normal\":\"normal-content\"}";
        InjectableBean bean = mapper.reader(inject).forType(InjectableBean.class).readValue(json);
        Assert.assertNotNull(bean);
        Assert.assertEquals("injected-content", bean.injected);
        Assert.assertEquals("normal-content", bean.normal);
    }

    @Test
    public void testCreateBeanDeserializer_propertyObjectId_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"id\":101,\"name\":\"test-obj\"}";
        PropertyIdBean bean = mapper.readValue(json, PropertyIdBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(101, bean.id);
        Assert.assertEquals("test-obj", bean.name);
    }

    @Test
    public void testCreateBeanDeserializer_sequenceObjectId_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"@id\":1,\"name\":\"seq-obj\"}";
        SequenceIdBean bean = mapper.readValue(json, SequenceIdBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("seq-obj", bean.name);
    }

    @Test
    public void testCreateBeanDeserializer_throwableType_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"message\":\"error occurred\",\"extraInfo\":\"debug-trace\"}";
        CustomException ex = mapper.readValue(json, CustomException.class);
        Assert.assertNotNull(ex);
        Assert.assertEquals("error occurred", ex.getMessage());
        Assert.assertEquals("debug-trace", ex.getExtraInfo());
    }

    @Test
    public void testCreateBeanDeserializer_abstractTypeMaterialization_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(AbstractInterface.class, ConcreteImpl.class);
        module.setAbstractTypes(resolver);
        mapper.registerModule(module);

        String json = "{\"value\":\"abstract-resolved\"}";
        AbstractInterface result = mapper.readValue(json, AbstractInterface.class);
        Assert.assertTrue(result instanceof ConcreteImpl);
        Assert.assertEquals("abstract-resolved", result.getValue());
    }

    @Test
    public void testCreateBeanDeserializer_nonInstantiatableAbstract_buildsAbstractDeserializer() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{\"name\":\"abc\"}", NonInstantiatableAbstract.class);
            Assert.fail("Expected JsonMappingException for abstract class without instantiator");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        } catch (IOException e) {
            Assert.fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateBuilderBasedDeserializer_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"a\":\"hello\",\"b\":42}";
        ValueObject vo = mapper.readValue(json, ValueObject.class);
        Assert.assertNotNull(vo);
        Assert.assertEquals("hello", vo.getA());
        Assert.assertEquals(42, vo.getB());
    }

    @Test
    public void testDeserializerModifier_hooksExecuted() throws IOException {
        final boolean[] flags = new boolean[3]; // [updateProperties, updateBuilder, modifyDeserializer]

        BeanDeserializerModifier modifier = new BeanDeserializerModifier() {
            @Override
            public List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> updateProperties(
                    DeserializationConfig config, BeanDescription beanDesc,
                    List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> propDefs) {
                if (beanDesc.getBeanClass() == SimpleBean.class) {
                    flags[0] = true;
                }
                return propDefs;
            }

            @Override
            public BeanDeserializerBuilder updateBuilder(DeserializationConfig config, BeanDescription beanDesc, BeanDeserializerBuilder builder) {
                if (beanDesc.getBeanClass() == SimpleBean.class) {
                    flags[1] = true;
                }
                return builder;
            }

            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                if (beanDesc.getBeanClass() == SimpleBean.class) {
                    flags[2] = true;
                }
                return deserializer;
            }
        };

        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.setDeserializerModifier(modifier);
        mapper.registerModule(module);

        SimpleBean bean = mapper.readValue("{\"name\":\"mod\",\"age\":20}", SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(flags[0]);
        Assert.assertTrue(flags[1]);
        Assert.assertTrue(flags[2]);
    }

    @Test
    public void testIsPotentialBeanType_primitiveThrowsException() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        try {
            factory.isPotentialBeanType(int.class);
            Assert.fail("Expected IllegalArgumentException for primitive type");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("as a Bean"));
        }
    }

    @Test
    public void testIsPotentialBeanType_arrayThrowsException() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        try {
            factory.isPotentialBeanType(String[].class);
            Assert.fail("Expected IllegalArgumentException for array type");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("as a Bean"));
        }
    }

    @Test
    public void testIsPotentialBeanType_localClassThrowsException() {
        class LocalClass {}
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        try {
            factory.isPotentialBeanType(LocalClass.class);
            Assert.fail("Expected IllegalArgumentException for local class");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("as a Bean"));
        }
    }

    @Test
    public void testIsPotentialBeanType_validPojoReturnsTrue() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        boolean result = factory.isPotentialBeanType(SimpleBean.class);
        Assert.assertTrue(result);
    }

    public static class CustomDeserializerTarget {
        public String value;
    }

    public static class CustomTargetDeserializer extends StdDeserializer<CustomDeserializerTarget> {
        public CustomTargetDeserializer() {
            super(CustomDeserializerTarget.class);
        }

        @Override
        public CustomDeserializerTarget deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) {
            CustomDeserializerTarget target = new CustomDeserializerTarget();
            target.value = "custom-deserialized";
            return target;
        }
    }

    @Test
    public void testCreateBeanDeserializer_customDeserializerOverride_returnsCustom() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(CustomDeserializerTarget.class, new CustomTargetDeserializer());
        mapper.registerModule(module);

        CustomDeserializerTarget target = mapper.readValue("{}", CustomDeserializerTarget.class);
        Assert.assertNotNull(target);
        Assert.assertEquals("custom-deserialized", target.value);
    }
}
