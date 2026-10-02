package com.fasterxml.jackson.databind.deser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;

import org.junit.Assert;
import org.junit.Test;

public class BeanDeserializerFactoryTest {

    // --- Helper POJOs for tests ---

    public static class SimpleBean {
        public String name;
        public int age;

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

    public static class CustomException extends Exception {
        private static final long serialVersionUID = 1L;
        public CustomException() { super(); }
        public CustomException(String msg) { super(msg); }
    }

    public interface InterfaceBean {
        String getValue();
    }

    public static class InterfaceBeanImpl implements InterfaceBean {
        private String value;
        public InterfaceBeanImpl() {}
        public InterfaceBeanImpl(String v) { this.value = v; }
        @Override
        public String getValue() { return value; }
        public void setValue(String value) { this.value = value; }
    }

    @JsonDeserialize(builder = ValueClassBuilder.class)
    public static class ValueClass {
        final int a;
        final String b;

        ValueClass(int a, String b) {
            this.a = a;
            this.b = b;
        }
    }

    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "with")
    public static class ValueClassBuilder {
        private int a;
        private String b;

        public ValueClassBuilder withA(int a) { this.a = a; return this; }
        public ValueClassBuilder withB(String b) { this.b = b; return this; }
        public ValueClass create() { return new ValueClass(a, b); }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class IdPropertyBean {
        public int id;
        public String text;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "missingId")
    public static class InvalidIdPropertyBean {
        public int id;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    public static class IdSequenceBean {
        public String name;
    }

    public static class AnySetterMethodBean {
        private final Map<String, Object> extra = new HashMap<>();

        @JsonAnySetter
        public void setAny(String name, Object value) {
            extra.put(name, value);
        }

        public Map<String, Object> getExtra() { return extra; }
    }

    public static class AnySetterFieldBean {
        @JsonAnySetter
        public Map<String, Object> extra = new HashMap<>();
    }

    @JsonIgnoreProperties({"ignoredField", "implicitIgnored"})
    public static class IgnoredPropsBean {
        public String validField;
        public String ignoredField;
        public String implicitIgnored;
    }

    @JsonIgnoreType
    public static class IgnoredTypeClass {
        public String data;
    }

    public static class BeanWithIgnoredType {
        public String name;
        public IgnoredTypeClass ignorable;
    }

    public static class SetterlessCollectionBean {
        private final List<String> items = new ArrayList<>();
        private final Map<String, String> map = new HashMap<>();

        public List<String> getItems() { return items; }
        public Map<String, String> getMap() { return map; }
    }

    public static class InjectableBean {
        @JacksonInject("injectId")
        public String injected;
        public String normal;
    }

    public static class ParentBean {
        @JsonManagedReference
        public ChildBean child;
    }

    public static class ChildBean {
        public String name;
        @JsonBackReference
        public ParentBean parent;
    }

    public static class Views {
        public static class Public {}
        public static class Internal extends Views.Public {}
    }

    public static class ViewBean {
        @JsonView(Views.Public.class)
        public String pub;
        @JsonView(Views.Internal.class)
        public String internal;
    }

    public static class CreatorBean {
        public final int x;
        public String y;

        @JsonCreator
        public CreatorBean(@JsonProperty("x") int x) {
            this.x = x;
        }

        public void setY(String y) {
            this.y = y;
        }
    }

    public static class CustomSubclassFactory extends BeanDeserializerFactory {
        private static final long serialVersionUID = 1L;

        public CustomSubclassFactory(DeserializerFactoryConfig config) {
            super(config);
        }
    }

    // --- Tests ---

    @Test
    public void testWithConfig_sameConfig_returnsSelf() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        DeserializerFactoryConfig config = factory.getFactoryConfig();
        DeserializerFactory result = factory.withConfig(config);
        Assert.assertSame(factory, result);
    }

    @Test
    public void testWithConfig_newConfig_returnsNewInstance() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        DeserializerFactory result = factory.withConfig(newConfig);
        Assert.assertNotSame(factory, result);
        Assert.assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclassNotOverriding_throwsIllegalStateException() {
        CustomSubclassFactory customFactory = new CustomSubclassFactory(new DeserializerFactoryConfig());
        customFactory.withConfig(new DeserializerFactoryConfig());
    }

    @Test
    public void testCreateBeanDeserializer_simpleBean_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);

        JsonDeserializer<Object> deser = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testCreateBeanDeserializer_throwable_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(CustomException.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);

        JsonDeserializer<Object> deser = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertNotNull(deser);

        CustomException result = mapper.readValue("{\"message\":\"test error\"}", CustomException.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("test error", result.getMessage());
    }

    @Test
    public void testCreateBeanDeserializer_abstractTypeMaterialization_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(InterfaceBean.class, InterfaceBeanImpl.class);

        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withAbstractTypeResolver(resolver);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);

        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(InterfaceBean.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);

        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertNotNull(deser);

        SimpleModule module = new SimpleModule();
        module.setAbstractTypes(resolver);
        mapper.registerModule(module);

        InterfaceBean result = mapper.readValue("{\"value\":\"mapped\"}", InterfaceBean.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("mapped", result.getValue());
    }

    @Test
    public void testCreateBeanDeserializer_customDeserializerOverride() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDeserializers customDesers = new SimpleDeserializers();
        JsonDeserializer<SimpleBean> customDeser = new StdDeserializer<SimpleBean>(SimpleBean.class) {
            private static final long serialVersionUID = 1L;
            @Override
            public SimpleBean deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) {
                return new SimpleBean("custom", 99);
            }
        };
        customDesers.addDeserializer(SimpleBean.class, customDeser);

        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withAdditionalDeserializers(customDesers);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);

        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);

        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertSame(customDeser, deser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateBeanDeserializer_primitiveType_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(int.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);

        BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateBeanDeserializer_arrayType_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(String[].class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);

        BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, beanDesc);
    }

    @Test
    public void testCreateBuilderBasedDeserializer_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(ValueClass.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);

        JsonDeserializer<Object> deser = BeanDeserializerFactory.instance.createBuilderBasedDeserializer(
                ctxt, type, beanDesc, ValueClassBuilder.class);
        Assert.assertNotNull(deser);

        ValueClass val = mapper.readValue("{\"a\":12,\"b\":\"builder\"}", ValueClass.class);
        Assert.assertEquals(12, val.a);
        Assert.assertEquals("builder", val.b);
    }

    @Test
    public void testAddObjectIdReader_propertyGenerator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IdPropertyBean result = mapper.readValue("{\"id\":42,\"text\":\"hello\"}", IdPropertyBean.class);
        Assert.assertNotNull(result);
        Assert.assertEquals(42, result.id);
        Assert.assertEquals("hello", result.text);
    }

    @Test(expected = JsonMappingException.class)
    public void testAddObjectIdReader_invalidPropertyGenerator_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"id\":42}", InvalidIdPropertyBean.class);
    }

    @Test
    public void testAddObjectIdReader_sequenceGenerator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IdSequenceBean result = mapper.readValue("{\"@id\":1,\"name\":\"seq\"}", IdSequenceBean.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("seq", result.name);
    }

    @Test
    public void testAnySetter_methodAndField() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        AnySetterMethodBean methodBean = mapper.readValue("{\"foo\":\"bar\",\"num\":123}", AnySetterMethodBean.class);
        Assert.assertEquals("bar", methodBean.getExtra().get("foo"));
        Assert.assertEquals(123, methodBean.getExtra().get("num"));

        AnySetterFieldBean fieldBean = mapper.readValue("{\"k1\":\"v1\",\"k2\":true}", AnySetterFieldBean.class);
        Assert.assertEquals("v1", fieldBean.extra.get("k1"));
        Assert.assertEquals(true, fieldBean.extra.get("k2"));
    }

    @Test
    public void testIgnoredPropertiesAndTypes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        IgnoredPropsBean bean = mapper.readValue(
                "{\"validField\":\"yes\",\"ignoredField\":\"skip\",\"implicitIgnored\":\"skip2\"}",
                IgnoredPropsBean.class);
        Assert.assertEquals("yes", bean.validField);
        Assert.assertNull(bean.ignoredField);
        Assert.assertNull(bean.implicitIgnored);

        BeanWithIgnoredType bean2 = mapper.readValue(
                "{\"name\":\"test\",\"ignorable\":{\"data\":\"hide\"}}",
                BeanWithIgnoredType.class);
        Assert.assertEquals("test", bean2.name);
        Assert.assertNull(bean2.ignorable);
    }

    @Test
    public void testSetterlessProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SetterlessCollectionBean bean = mapper.readValue(
                "{\"items\":[\"a\",\"b\"],\"map\":{\"k\":\"v\"}}",
                SetterlessCollectionBean.class);
        Assert.assertEquals(2, bean.getItems().size());
        Assert.assertTrue(bean.getItems().contains("a"));
        Assert.assertEquals("v", bean.getMap().get("k"));
    }

    @Test
    public void testInjectables() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std inject = new InjectableValues.Std();
        inject.addValue("injectId", "injectedValue");
        mapper.setInjectableValues(inject);

        InjectableBean bean = mapper.readValue("{\"normal\":\"normalValue\"}", InjectableBean.class);
        Assert.assertEquals("injectedValue", bean.injected);
        Assert.assertEquals("normalValue", bean.normal);
    }

    @Test
    public void testManagedAndBackReferences() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ParentBean parent = mapper.readValue("{\"child\":{\"name\":\"kid\"}}", ParentBean.class);
        Assert.assertNotNull(parent.child);
        Assert.assertEquals("kid", parent.child.name);
        Assert.assertSame(parent, parent.child.parent);
    }

    @Test
    public void testViewsAndDefaultViewInclusionDisabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);

        ViewBean bean = mapper.readerWithView(Views.Public.class)
                .forType(ViewBean.class)
                .readValue("{\"pub\":\"publicVal\",\"internal\":\"internalVal\"}");
        Assert.assertEquals("publicVal", bean.pub);
        Assert.assertNull(bean.internal);
    }

    @Test
    public void testCreatorProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CreatorBean bean = mapper.readValue("{\"x\":7,\"y\":\"val\"}", CreatorBean.class);
        Assert.assertEquals(7, bean.x);
        Assert.assertEquals("val", bean.y);
    }

    @Test
    public void testDeserializerModifierHooks() throws Exception {
        final boolean[] hooksCalled = new boolean[3]; // [updateBuilder, updateProperties, modifyDeserializer]

        BeanDeserializerModifier modifier = new BeanDeserializerModifier() {
            @Override
            public BeanDeserializerBuilder updateBuilder(DeserializationConfig config,
                    BeanDescription beanDesc, BeanDeserializerBuilder builder) {
                hooksCalled[0] = true;
                return super.updateBuilder(config, beanDesc, builder);
            }

            @Override
            public List<BeanPropertyDefinition> updateProperties(DeserializationConfig config,
                    BeanDescription beanDesc, List<BeanPropertyDefinition> propDefs) {
                hooksCalled[1] = true;
                return super.updateProperties(config, beanDesc, propDefs);
            }

            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config,
                    BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                hooksCalled[2] = true;
                return super.modifyDeserializer(config, beanDesc, deserializer);
            }
        };

        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withDeserializerModifier(modifier);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);

        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);

        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertNotNull(deser);
        Assert.assertTrue(hooksCalled[0]);
        Assert.assertTrue(hooksCalled[1]);
        Assert.assertTrue(hooksCalled[2]);
    }
}
