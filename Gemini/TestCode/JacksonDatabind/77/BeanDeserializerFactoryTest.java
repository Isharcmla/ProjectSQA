package com.fasterxml.jackson.databind.deser;

import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.CreatorProperty;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class BeanDeserializerFactoryTest {

    // Helper classes and interfaces for testing scenarios

    static class SimpleBean {
        public String name;
        private int age;

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    static class SubclassFactory extends BeanDeserializerFactory {
        public SubclassFactory(DeserializerFactoryConfig config) {
            super(config);
        }
    }

    static class ExposableBeanDeserializerFactory extends BeanDeserializerFactory {
        public ExposableBeanDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        public boolean isPotentialBeanType(Class<?> type) {
            return super.isPotentialBeanType(type);
        }

        @Override
        public boolean isIgnorableType(DeserializationConfig config, BeanDescription beanDesc,
                                      Class<?> type, Map<Class<?>, Boolean> ignoredTypes) {
            return super.isIgnorableType(config, beanDesc, type, ignoredTypes);
        }

        @Override
        public JavaType materializeAbstractType(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc)
                throws JsonMappingException {
            return super.materializeAbstractType(ctxt, type, beanDesc);
        }

        @Override
        public JsonDeserializer<?> findStdDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc)
                throws JsonMappingException {
            return super.findStdDeserializer(ctxt, type, beanDesc);
        }

        @Override
        public BeanDeserializerBuilder constructBeanDeserializerBuilder(DeserializationContext ctxt, BeanDescription beanDesc) {
            return super.constructBeanDeserializerBuilder(ctxt, beanDesc);
        }

        @Override
        public void addBeanProps(DeserializationContext ctxt, BeanDescription beanDesc, BeanDeserializerBuilder builder)
                throws JsonMappingException {
            super.addBeanProps(ctxt, beanDesc, builder);
        }

        @Override
        public List<BeanPropertyDefinition> filterBeanProps(DeserializationContext ctxt, BeanDescription beanDesc,
                                                             BeanDeserializerBuilder builder, List<BeanPropertyDefinition> propDefsIn,
                                                             Set<String> ignored) throws JsonMappingException {
            return super.filterBeanProps(ctxt, beanDesc, builder, propDefsIn, ignored);
        }

        @Override
        public void addReferenceProperties(DeserializationContext ctxt, BeanDescription beanDesc, BeanDeserializerBuilder builder)
                throws JsonMappingException {
            super.addReferenceProperties(ctxt, beanDesc, builder);
        }

        @Override
        public void addInjectables(DeserializationContext ctxt, BeanDescription beanDesc, BeanDeserializerBuilder builder)
                throws JsonMappingException {
            super.addInjectables(ctxt, beanDesc, builder);
        }

        @Override
        public SettableAnyProperty constructAnySetter(DeserializationContext ctxt, BeanDescription beanDesc, AnnotatedMethod setter)
                throws JsonMappingException {
            return super.constructAnySetter(ctxt, beanDesc, setter);
        }

        @Override
        public SettableBeanProperty constructSettableProperty(DeserializationContext ctxt, BeanDescription beanDesc,
                                                              BeanPropertyDefinition propDef, JavaType propType0)
                throws JsonMappingException {
            return super.constructSettableProperty(ctxt, beanDesc, propDef, propType0);
        }

        @Override
        public SettableBeanProperty constructSetterlessProperty(DeserializationContext ctxt, BeanDescription beanDesc,
                                                                BeanPropertyDefinition propDef)
                throws JsonMappingException {
            return super.constructSetterlessProperty(ctxt, beanDesc, propDef);
        }

        @Override
        public void addObjectIdReader(DeserializationContext ctxt, BeanDescription beanDesc, BeanDeserializerBuilder builder)
                throws JsonMappingException {
            super.addObjectIdReader(ctxt, beanDesc, builder);
        }
    }

    interface TestInterface {
        String getValue();
    }

    static class TestInterfaceImpl implements TestInterface {
        public String value;
        @Override public String getValue() { return value; }
        public void setValue(String value) { this.value = value; }
    }

    static class CustomException extends Throwable {
        private static final long serialVersionUID = 1L;
        private String extra;

        public CustomException() { super(); }
        public CustomException(String msg) { super(msg); }
        public String getExtra() { return extra; }
        public void setExtra(String extra) { this.extra = extra; }
    }

    @JsonIgnoreProperties({"ignoredField"})
    static class IgnoredPropsBean {
        public String keptField;
        public String ignoredField;
        @JsonIgnore
        public String annotationIgnoredField;
    }

    @JsonIgnoreType
    static class IgnorableTypeMember {
        public String data;
    }

    static class ContainerWithIgnorableType {
        public String name;
        public IgnorableTypeMember ignorable;
    }

    static class AnySetterBean {
        private final Map<String, Object> other = new HashMap<String, Object>();

        @JsonAnySetter
        public void setOther(String name, Object value) {
            other.put(name, value);
        }

        public Map<String, Object> getOther() { return other; }
    }

    static class SetterlessBean {
        private final List<String> items = new ArrayList<String>();
        private final Map<String, String> map = new HashMap<String, String>();

        public List<String> getItems() { return items; }
        public Map<String, String> getMap() { return map; }
    }

    static class InjectableBean {
        @JacksonInject("id")
        public String injectedId;
        public String name;
    }

    static class ParentRef {
        public String name;
        @JsonManagedReference
        public ChildRef child;
    }

    static class ChildRef {
        public String value;
        @JsonBackReference
        public ParentRef parent;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class ObjectIdPropertyBean {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class ObjectIdSequenceBean {
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nonExistentId")
    static class InvalidObjectIdBean {
        public String name;
    }

    static class CreatorBean {
        private final String first;
        private final int second;

        @JsonCreator
        public CreatorBean(@JsonProperty("first") String first, @JsonProperty("second") int second) {
            this.first = first;
            this.second = second;
        }

        public String getFirst() { return first; }
        public int getSecond() { return second; }
    }

    static class ViewsBean {
        public interface PublicView {}
        public interface InternalView {}

        @JsonView(PublicView.class)
        public String publicData;

        @JsonView(InternalView.class)
        public String internalData;
    }

    @JsonDeserialize(builder = ValueClass.Builder.class)
    static class ValueClass {
        final int x, y;

        protected ValueClass(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @JsonPOJOBuilder(withPrefix = "with", buildMethodName = "create")
        static class Builder {
            int x, y;
            public Builder withX(int x) { this.x = x; return this; }
            public Builder withY(int y) { this.y = y; return this; }
            public ValueClass create() { return new ValueClass(x, y); }
        }
    }

    static class DefaultBuilderBean {
        final String text;
        protected DefaultBuilderBean(String text) { this.text = text; }

        static class Builder {
            String text;
            public Builder withText(String text) { this.text = text; return this; }
            public DefaultBuilderBean build() { return new DefaultBuilderBean(text); }
        }
    }

    // --- Tests ---

    @Test
    public void testWithConfig_sameConfig_returnsSameInstance() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        DeserializerFactoryConfig config = factory.getFactoryConfig();
        DeserializerFactory newFactory = factory.withConfig(config);
        Assert.assertSame(factory, newFactory);
    }

    @Test
    public void testWithConfig_differentConfig_returnsNewInstance() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        DeserializerFactory newFactory = factory.withConfig(newConfig);
        Assert.assertNotSame(factory, newFactory);
        Assert.assertEquals(BeanDeserializerFactory.class, newFactory.getClass());
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclassThrowsIllegalStateException() {
        SubclassFactory subclass = new SubclassFactory(new DeserializerFactoryConfig());
        subclass.withConfig(new DeserializerFactoryConfig());
    }

    @Test
    public void testCreateBeanDeserializer_customDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(SimpleBean.class, new StdDeserializer<SimpleBean>(SimpleBean.class) {
            @Override
            public SimpleBean deserialize(JsonParser p, DeserializationContext ctxt) {
                SimpleBean bean = new SimpleBean();
                bean.name = "custom";
                return bean;
            }
        });
        mapper.registerModule(module);

        SimpleBean bean = mapper.readValue("{\"name\":\"test\"}", SimpleBean.class);
        Assert.assertEquals("custom", bean.name);
    }

    @Test
    public void testCreateBeanDeserializer_throwable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"message\":\"something wrong\",\"extra\":\"valuable data\"}";
        CustomException ex = mapper.readValue(json, CustomException.class);
        Assert.assertEquals("something wrong", ex.getMessage());
        Assert.assertEquals("valuable data", ex.getExtra());
    }

    @Test
    public void testCreateBeanDeserializer_abstractTypeMaterialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(TestInterface.class, TestInterfaceImpl.class);
        module.setAbstractTypes(resolver);
        mapper.registerModule(module);

        TestInterface result = mapper.readValue("{\"value\":\"hello\"}", TestInterface.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("hello", result.getValue());
    }

    @Test
    public void testCreateBeanDeserializer_abstractTypeWithoutMaterialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(TestInterface.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deser = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, desc);
        Assert.assertNull(deser);
    }

    @Test
    public void testCreateBeanDeserializer_standardTypesReturnStdDeser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(String.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deser = BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, desc);
        Assert.assertNotNull(deser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateBeanDeserializer_primitiveTypeThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(int.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);

        BeanDeserializerFactory.instance.createBeanDeserializer(ctxt, type, desc);
    }

    @Test
    public void testCreateBuilderBasedDeserializer_customBuilderConfig() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"x\":10,\"y\":20}";
        ValueClass value = mapper.readValue(json, ValueClass.class);
        Assert.assertNotNull(value);
        Assert.assertEquals(10, value.x);
        Assert.assertEquals(20, value.y);
    }

    @Test
    public void testCreateBuilderBasedDeserializer_directCall() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType valueType = mapper.constructType(DefaultBuilderBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(valueType);

        JsonDeserializer<Object> deser = BeanDeserializerFactory.instance.createBuilderBasedDeserializer(
                ctxt, valueType, desc, DefaultBuilderBean.Builder.class);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testDeserializerModifier_updateBuilderAndModifyDeserializer() throws Exception {
        final boolean[] updated = new boolean[]{false, false};
        BeanDeserializerModifier modifier = new BeanDeserializerModifier() {
            @Override
            public BeanDeserializerBuilder updateBuilder(DeserializationConfig config, BeanDescription beanDesc,
                                                         BeanDeserializerBuilder builder) {
                updated[0] = true;
                return builder;
            }

            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc,
                                                           JsonDeserializer<?> deserializer) {
                updated[1] = true;
                return deserializer;
            }
        };

        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withDeserializerModifier(modifier);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);

        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt, type, desc);
        Assert.assertNotNull(deser);
        Assert.assertTrue(updated[0]);
        Assert.assertTrue(updated[1]);
    }

    @Test
    public void testAddObjectIdReader_propertyGenerator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"id\":123,\"name\":\"Item\"}";
        ObjectIdPropertyBean bean = mapper.readValue(json, ObjectIdPropertyBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(123, bean.id);
        Assert.assertEquals("Item", bean.name);
    }

    @Test
    public void testAddObjectIdReader_sequenceGenerator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"@id\":1,\"name\":\"Item\"}";
        ObjectIdSequenceBean bean = mapper.readValue(json, ObjectIdSequenceBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("Item", bean.name);
    }

    @Test(expected = JsonMappingException.class)
    public void testAddObjectIdReader_missingPropertyThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"name\":\"Test\"}", InvalidObjectIdBean.class);
    }

    @Test
    public void testAddBeanProps_withIgnoredAndIgnorableProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"keptField\":\"keep\",\"ignoredField\":\"drop\",\"annotationIgnoredField\":\"drop\"}";
        IgnoredPropsBean bean = mapper.readValue(json, IgnoredPropsBean.class);
        Assert.assertEquals("keep", bean.keptField);
        Assert.assertNull(bean.ignoredField);
        Assert.assertNull(bean.annotationIgnoredField);

        ContainerWithIgnorableType container = mapper.readValue(
                "{\"name\":\"cont\",\"ignorable\":{\"data\":\"test\"}}", ContainerWithIgnorableType.class);
        Assert.assertEquals("cont", container.name);
        Assert.assertNull(container.ignorable);
    }

    @Test
    public void testAddBeanProps_withAnySetter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"extra1\":\"val1\",\"extra2\":\"val2\"}";
        AnySetterBean bean = mapper.readValue(json, AnySetterBean.class);
        Assert.assertEquals("val1", bean.getOther().get("extra1"));
        Assert.assertEquals("val2", bean.getOther().get("extra2"));
    }

    @Test
    public void testAddBeanProps_setterlessProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"items\":[\"a\",\"b\"],\"map\":{\"key\":\"val\"}}";
        SetterlessBean bean = mapper.readValue(json, SetterlessBean.class);
        Assert.assertEquals(2, bean.getItems().size());
        Assert.assertEquals("val", bean.getMap().get("key"));
    }

    @Test
    public void testAddInjectables() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std injectables = new InjectableValues.Std();
        injectables.addValue("id", "INJECTED_123");

        InjectableBean bean = mapper.reader(injectables)
                .forType(InjectableBean.class)
                .readValue("{\"name\":\"Test\"}");
        Assert.assertEquals("INJECTED_123", bean.injectedId);
        Assert.assertEquals("Test", bean.name);
    }

    @Test
    public void testAddReferenceProperties_managedAndBackRef() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"parent\",\"child\":{\"value\":\"childVal\"}}";
        ParentRef parent = mapper.readValue(json, ParentRef.class);
        Assert.assertNotNull(parent);
        Assert.assertEquals("parent", parent.name);
        Assert.assertNotNull(parent.child);
        Assert.assertEquals("childVal", parent.child.value);
        Assert.assertSame(parent, parent.child.parent);
    }

    @Test
    public void testCreatorProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"first\":\"one\",\"second\":2}";
        CreatorBean bean = mapper.readValue(json, CreatorBean.class);
        Assert.assertEquals("one", bean.getFirst());
        Assert.assertEquals(2, bean.getSecond());
    }

    @Test
    public void testViewsInclusionConfig() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);

        String json = "{\"publicData\":\"pub\",\"internalData\":\"priv\"}";
        ViewsBean bean = mapper.readerWithView(ViewsBean.PublicView.class)
                .forType(ViewsBean.ViewsBean.class)
                .readValue(json);

        Assert.assertEquals("pub", bean.publicData);
        Assert.assertNull(bean.internalData);
    }

    @Test
    public void testIsPotentialBeanType_allBranches() {
        ExposableBeanDeserializerFactory factory = new ExposableBeanDeserializerFactory(new DeserializerFactoryConfig());

        Assert.assertTrue(factory.isPotentialBeanType(SimpleBean.class));

        try {
            factory.isPotentialBeanType(int.class);
            Assert.fail("Expected exception for primitive");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not deserialize Class int"));
        }

        try {
            factory.isPotentialBeanType(int[].class);
            Assert.fail("Expected exception for array");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not deserialize Class"));
        }

        Object proxyInstance = Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{TestInterface.class},
                new java.lang.reflect.InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) {
                        return null;
                    }
                });

        try {
            factory.isPotentialBeanType(proxyInstance.getClass());
            Assert.fail("Expected exception for proxy class");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Proxy"));
        }

        class LocalClass {}
        try {
            factory.isPotentialBeanType(LocalClass.class);
            Assert.fail("Expected exception for local class");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("as a Bean"));
        }
    }

    @Test
    public void testIsIgnorableType_cachedAndAnnotationCheck() {
        ExposableBeanDeserializerFactory factory = new ExposableBeanDeserializerFactory(new DeserializerFactoryConfig());
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        BeanDescription desc = config.introspect(mapper.constructType(ContainerWithIgnorableType.class));

        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        cache.put(String.class, Boolean.FALSE);

        boolean cachedResult = factory.isIgnorableType(config, desc, String.class, cache);
        Assert.assertFalse(cachedResult);

        boolean ignorableResult = factory.isIgnorableType(config, desc, IgnorableTypeMember.class, cache);
        Assert.assertTrue(ignorableResult);

        boolean nonIgnorableResult = factory.isIgnorableType(config, desc, SimpleBean.class, cache);
        Assert.assertFalse(nonIgnorableResult);
    }

    @Test
    public void testMaterializeAbstractType_returnsNullWhenNoResolvers() throws Exception {
        ExposableBeanDeserializerFactory factory = new ExposableBeanDeserializerFactory(new DeserializerFactoryConfig());
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(TestInterface.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);

        JavaType result = factory.materializeAbstractType(ctxt, type, desc);
        Assert.assertNull(result);
    }
}
