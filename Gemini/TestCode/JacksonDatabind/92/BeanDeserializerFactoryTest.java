package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanDeserializerFactoryTest {

    private BeanDeserializerFactory factory;
    private ObjectMapper mapper;
    private DeserializationContext ctxt;

    // Test helper classes
    static class SimpleBean {
        private String name;
        private int age;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    static class CustomThrowable extends Throwable {
        private static final long serialVersionUID = 1L;
        private String extraInfo;

        public CustomThrowable() { super(); }
        public CustomThrowable(String msg) { super(msg); }

        public String getExtraInfo() { return extraInfo; }
        public void setExtraInfo(String extraInfo) { this.extraInfo = extraInfo; }
    }

    interface MyInterface {
        String getValue();
    }

    static class MyInterfaceImpl implements MyInterface {
        private String value;
        public String getValue() { return value; }
        public void setValue(String value) { this.value = value; }
    }

    static abstract class AbstractBase {
        public String id;
    }

    static class CreatorBean {
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

    static class AnySetterBean {
        private Map<String, Object> others = new HashMap<String, Object>();

        @JsonAnySetter
        public void handleUnknown(String key, Object value) {
            others.put(key, value);
        }

        public Map<String, Object> getOthers() { return others; }
    }

    @JsonIgnoreProperties({"ignoredField"})
    static class IgnoredPropsBean {
        public String regularField;
        public String ignoredField;
        @JsonIgnore
        public String annotationIgnored;
    }

    static class SetterlessBean {
        private List<String> items = new ArrayList<String>();
        private Map<String, String> map = new HashMap<String, String>();

        public List<String> getItems() { return items; }
        public Map<String, String> getMap() { return map; }
    }

    static class InjectBean {
        @JacksonInject("injectedValue")
        public String injected;
        public String regular;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class IdPropertyBean {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class IdGeneratorBean {
        public String name;
    }

    static class ParentRefBean {
        public String name;
        @JsonManagedReference
        public ChildRefBean child;
    }

    static class ChildRefBean {
        public String value;
        @JsonBackReference
        public ParentRefBean parent;
    }

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "set")
    static class PojoBuilder {
        private String field;

        public PojoBuilder setField(String field) {
            this.field = field;
            return this;
        }

        public BuiltValue build() {
            return new BuiltValue(field);
        }
    }

    static class BuiltValue {
        private final String field;

        public BuiltValue(String field) {
            this.field = field;
        }

        public String getField() {
            return field;
        }
    }

    static class TestSubclassFactory extends BeanDeserializerFactory {
        private static final long serialVersionUID = 1L;

        public TestSubclassFactory(DeserializerFactoryConfig config) {
            super(config);
        }
    }

    @Before
    public void setUp() {
        factory = BeanDeserializerFactory.instance;
        mapper = new ObjectMapper();
        ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) mapper.getDeserializationContext())
                .createInstance(mapper.getDeserializationConfig(), null, mapper.getInjectableValues());
    }

    @Test
    public void testWithConfig_sameConfig_returnsSameInstance() {
        DeserializerFactoryConfig config = factory.getFactoryConfig();
        DeserializerFactory result = factory.withConfig(config);
        Assert.assertSame(factory, result);
    }

    @Test
    public void testWithConfig_differentConfig_returnsNewInstance() {
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        DeserializerFactory result = factory.withConfig(newConfig);
        Assert.assertNotNull(result);
        Assert.assertNotSame(factory, result);
        Assert.assertEquals(BeanDeserializerFactory.class, result.getClass());
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclassWithoutOverride_throwsIllegalStateException() {
        TestSubclassFactory subFactory = new TestSubclassFactory(new DeserializerFactoryConfig());
        subFactory.withConfig(new DeserializerFactoryConfig());
    }

    @Test
    public void testCreateBeanDeserializer_simpleBean_returnsDeserializer() throws Exception {
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
        Assert.assertTrue(deser.isCachable());
    }

    @Test
    public void testCreateBeanDeserializer_customDeserializerOverridden_returnsCustom() throws Exception {
        SimpleModule module = new SimpleModule();
        final JsonDeserializer<SimpleBean> customDeser = new JsonDeserializer<SimpleBean>() {
            @Override
            public SimpleBean deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) {
                return new SimpleBean();
            }
        };
        module.addDeserializer(SimpleBean.class, customDeser);
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.registerModule(module);

        DeserializationContext customCtxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) customMapper.getDeserializationContext())
                .createInstance(customMapper.getDeserializationConfig(), null, customMapper.getInjectableValues());

        JavaType type = customMapper.constructType(SimpleBean.class);
        BeanDescription desc = customMapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = customMapper.getDeserializationContext().getFactory().createBeanDeserializer(customCtxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testCreateBeanDeserializer_throwable_returnsThrowableDeserializer() throws Exception {
        JavaType type = mapper.constructType(CustomThrowable.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
        Assert.assertTrue(deser instanceof ThrowableDeserializer);
    }

    @Test
    public void testCreateBeanDeserializer_materializeAbstractType_returnsConcreteDeserializer() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(MyInterface.class, MyInterfaceImpl.class);

        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withAbstractTypeResolver(resolver);
        BeanDeserializerFactory customFactory = (BeanDeserializerFactory) factory.withConfig(config);

        JavaType type = mapper.constructType(MyInterface.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = customFactory.createBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testCreateBeanDeserializer_abstractClassWithoutResolver_returnsAbstractDeserializer() throws Exception {
        JavaType type = mapper.constructType(AbstractBase.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testCreateBeanDeserializer_stdDeserializer_returnsStandardDeserializer() throws Exception {
        JavaType type = mapper.constructType(String.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateBeanDeserializer_primitiveType_throwsIllegalArgumentException() throws Exception {
        JavaType type = mapper.constructType(int.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspectClassAnnotations(type);
        factory.isPotentialBeanType(type.getRawClass());
    }

    @Test
    public void testCreateBeanDeserializer_illegalType_throwsJsonMappingException() throws Exception {
        TestSubclassFactory customFactory = new TestSubclassFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);

        customFactory._cfgIllegalClassNames = java.util.Collections.singleton(SimpleBean.class.getName());
        try {
            customFactory.checkIllegalTypes(ctxt, type, desc);
            Assert.fail("Should have thrown JsonMappingException for illegal class name");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type"));
            Assert.assertTrue(e.getMessage().contains("prevented for security reasons"));
        }
    }

    @Test
    public void testCreateBuilderBasedDeserializer_validBuilder_returnsDeserializer() throws Exception {
        JavaType valueType = mapper.constructType(BuiltValue.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(valueType);
        JsonDeserializer<Object> deser = factory.createBuilderBasedDeserializer(ctxt, valueType, desc, PojoBuilder.class);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testBuildBeanDeserializer_withCreatorProperties_returnsValidDeserializer() throws Exception {
        JavaType type = mapper.constructType(CreatorBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testBuildBeanDeserializer_withAnySetter_returnsValidDeserializer() throws Exception {
        JavaType type = mapper.constructType(AnySetterBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testBuildBeanDeserializer_withIgnoredProperties_returnsValidDeserializer() throws Exception {
        JavaType type = mapper.constructType(IgnoredPropsBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testBuildBeanDeserializer_withSetterlessProperties_returnsValidDeserializer() throws Exception {
        JavaType type = mapper.constructType(SetterlessBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testBuildBeanDeserializer_withInjectables_returnsValidDeserializer() throws Exception {
        JavaType type = mapper.constructType(InjectBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testBuildBeanDeserializer_withObjectIdPropertyGenerator_returnsValidDeserializer() throws Exception {
        JavaType type = mapper.constructType(IdPropertyBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testBuildBeanDeserializer_withObjectIdSequenceGenerator_returnsValidDeserializer() throws Exception {
        JavaType type = mapper.constructType(IdGeneratorBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testBuildBeanDeserializer_withBackAndManagedReferences_returnsValidDeserializer() throws Exception {
        JavaType type = mapper.constructType(ParentRefBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
    }

    @Test
    public void testBuildBeanDeserializer_withModifiers_appliesModifications() throws Exception {
        final boolean[] flags = new boolean[3];

        BeanDeserializerModifier modifier = new BeanDeserializerModifier() {
            @Override
            public BeanDeserializerBuilder updateBuilder(DeserializationConfig config, BeanDescription beanDesc, BeanDeserializerBuilder builder) {
                flags[0] = true;
                return builder;
            }

            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                flags[1] = true;
                return deserializer;
            }

            @Override
            public List<BeanPropertyDefinition> updateProperties(DeserializationConfig config, BeanDescription beanDesc, List<BeanPropertyDefinition> propDefs) {
                flags[2] = true;
                return propDefs;
            }
        };

        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withDeserializerModifier(modifier);
        BeanDeserializerFactory customFactory = (BeanDeserializerFactory) factory.withConfig(config);

        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = customFactory.buildBeanDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
        Assert.assertTrue(flags[0]);
        Assert.assertTrue(flags[1]);
        Assert.assertTrue(flags[2]);
    }

    @Test
    public void testBuildThrowableDeserializer_withModifiers_appliesModifications() throws Exception {
        final boolean[] flags = new boolean[2];

        BeanDeserializerModifier modifier = new BeanDeserializerModifier() {
            @Override
            public BeanDeserializerBuilder updateBuilder(DeserializationConfig config, BeanDescription beanDesc, BeanDeserializerBuilder builder) {
                flags[0] = true;
                return builder;
            }

            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                flags[1] = true;
                return deserializer;
            }
        };

        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withDeserializerModifier(modifier);
        BeanDeserializerFactory customFactory = (BeanDeserializerFactory) factory.withConfig(config);

        JavaType type = mapper.constructType(CustomThrowable.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = customFactory.buildThrowableDeserializer(ctxt, type, desc);

        Assert.assertNotNull(deser);
        Assert.assertTrue(flags[0]);
        Assert.assertTrue(flags[1]);
    }

    @Test
    public void testBuildBuilderBasedDeserializer_withModifiers_appliesModifications() throws Exception {
        final boolean[] flags = new boolean[2];

        BeanDeserializerModifier modifier = new BeanDeserializerModifier() {
            @Override
            public BeanDeserializerBuilder updateBuilder(DeserializationConfig config, BeanDescription beanDesc, BeanDeserializerBuilder builder) {
                flags[0] = true;
                return builder;
            }

            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                flags[1] = true;
                return deserializer;
            }
        };

        DeserializerFactoryConfig config = new DeserializerFactoryConfig().withDeserializerModifier(modifier);
        BeanDeserializerFactory customFactory = (BeanDeserializerFactory) factory.withConfig(config);

        JavaType valueType = mapper.constructType(BuiltValue.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(valueType);
        JsonDeserializer<Object> deser = customFactory.createBuilderBasedDeserializer(ctxt, valueType, desc, PojoBuilder.class);

        Assert.assertNotNull(deser);
        Assert.assertTrue(flags[0]);
        Assert.assertTrue(flags[1]);
    }

    @Test
    public void testIsPotentialBeanType_validClasses_returnsTrue() {
        Assert.assertTrue(factory.isPotentialBeanType(SimpleBean.class));
        Assert.assertTrue(factory.isPotentialBeanType(CustomThrowable.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_arrayType_throwsIllegalArgumentException() {
        factory.isPotentialBeanType(SimpleBean[].class);
    }

    @Test
    public void testIsPotentialBeanType_localClass_throwsIllegalArgumentException() {
        class LocalClass {}
        try {
            factory.isPotentialBeanType(LocalClass.class);
            Assert.fail("Should have thrown IllegalArgumentException for local class");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not deserialize Class"));
        }
    }

    @Test
    public void testDefaultIllegalClassNames_containsExpectedClasses() {
        Assert.assertTrue(BeanDeserializerFactory.DEFAULT_NO_DESER_CLASS_NAMES.contains("org.apache.commons.collections.functors.InvokerTransformer"));
        Assert.assertTrue(BeanDeserializerFactory.DEFAULT_NO_DESER_CLASS_NAMES.contains("com.sun.rowset.JdbcRowSetImpl"));
        Assert.assertTrue(BeanDeserializerFactory.DEFAULT_NO_DESER_CLASS_NAMES.contains("org.springframework.beans.factory.ObjectFactory"));
    }

    @Test
    public void testEndToEndSerializationAndDeserialization() throws IOException {
        SimpleBean original = new SimpleBean();
        original.setName("Jackson");
        original.setAge(10);

        String json = mapper.writeValueAsString(original);
        SimpleBean deserialized = mapper.readValue(json, SimpleBean.class);

        Assert.assertNotNull(deserialized);
        Assert.assertEquals("Jackson", deserialized.getName());
        Assert.assertEquals(10, deserialized.getAge());
    }

    @Test
    public void testEndToEndThrowableDeserialization() throws IOException {
        CustomThrowable original = new CustomThrowable("custom error");
        original.setExtraInfo("detail");

        String json = mapper.writeValueAsString(original);
        CustomThrowable result = mapper.readValue(json, CustomThrowable.class);

        Assert.assertNotNull(result);
        Assert.assertEquals("custom error", result.getMessage());
        Assert.assertEquals("detail", result.getExtraInfo());
    }
}
