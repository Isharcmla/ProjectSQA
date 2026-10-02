package com.fasterxml.jackson.databind.deser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BeanDeserializerFactoryTest {

    private BeanDeserializerFactory factory;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        factory = BeanDeserializerFactory.instance;
        mapper = new ObjectMapper();
    }

    // =========================================================================
    // Test Models
    // =========================================================================

    public static class SimpleBean {
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

    public static class BeanWithIgnoredAndViews {
        @JsonView(Views.Public.class)
        public String pub;
        @JsonView(Views.Internal.class)
        public String priv;
        @JsonIgnore
        public String secret;
    }

    public static class Views {
        public static class Public {}
        public static class Internal extends Public {}
    }

    public static class CreatorBean {
        private final String item;
        private final int qty;

        @JsonCreator
        public CreatorBean(@JsonProperty("item") String item, @JsonProperty("qty") int qty) {
            this.item = item;
            this.qty = qty;
        }

        public String getItem() { return item; }
        public int getQty() { return qty; }
    }

    public static class SetterlessBean {
        private final List<String> list = new ArrayList<String>();
        private final Map<String, String> map = new HashMap<String, String>();

        public List<String> getList() { return list; }
        public Map<String, String> getMap() { return map; }
    }

    @JsonIgnoreProperties({"ign1", "ign2"})
    public static class IgnoralsBean {
        public String ign1;
        public String ign2;
        public String valid;
    }

    @JsonIgnoreType
    public static class NonDeserializableType {
        public String value;
    }

    public static class BeanWithIgnorableType {
        public NonDeserializableType ignoredType;
        public String name;
    }

    public static class AnySetterMethodBean {
        private Map<String, Object> values = new HashMap<String, Object>();

        @JsonAnySetter
        public void setOther(String name, Object value) {
            values.put(name, value);
        }

        public Map<String, Object> getValues() { return values; }
    }

    public static class AnySetterFieldBean {
        @JsonAnySetter
        public Map<String, Object> values = new HashMap<String, Object>();
    }

    public static class InjectableBean {
        @JacksonInject("injectId")
        public String injected;
        public String normal;
    }

    public static class ParentRef {
        public String name;
        @JsonManagedReference
        public ChildRef child;
    }

    public static class ChildRef {
        public String value;
        @JsonBackReference
        public ParentRef parent;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class ObjectIdPropertyBean {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    public static class ObjectIdSequenceBean {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nonExistentId")
    public static class InvalidObjectIdBean {
        public int id;
    }

    @JsonDeserialize(builder = SimplePOJOBuilder.class)
    public static class BuilderBean {
        private final String data;

        public BuilderBean(String data) {
            this.data = data;
        }

        public String getData() { return data; }
    }

    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "with")
    public static class SimplePOJOBuilder {
        private String data;

        public SimplePOJOBuilder withData(String data) {
            this.data = data;
            return this;
        }

        public BuilderBean create() {
            return new BuilderBean(data);
        }
    }

    public static class CustomException extends Throwable {
        private static final long serialVersionUID = 1L;
        private String extra;

        public CustomException() {}
        public CustomException(String msg) { super(msg); }

        public String getExtra() { return extra; }
        public void setExtra(String extra) { this.extra = extra; }
    }

    public interface AbstractService {
        String serve();
    }

    public static class ConcreteService implements AbstractService {
        private String name;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        @Override
        public String serve() { return name; }
    }

    // Subclass to test protected methods
    public static class SubclassedBeanDeserializerFactory extends BeanDeserializerFactory {
        public SubclassedBeanDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        public DeserializerFactory withConfig(DeserializerFactoryConfig config) {
            return new SubclassedBeanDeserializerFactory(config);
        }

        public void testAddReferenceProperties(DeserializationContext ctxt, BeanDescription beanDesc, BeanDeserializerBuilder builder) throws Exception {
            super.addReferenceProperties(ctxt, beanDesc, builder);
        }

        public boolean testIsPotentialBeanType(Class<?> type) {
            return super.isPotentialBeanType(type);
        }

        public boolean testIsIgnorableType(DeserializationConfig config, BeanPropertyDefinition propDef,
                Class<?> type, Map<Class<?>, Boolean> map) {
            return super.isIgnorableType(config, propDef, type, map);
        }
    }

    // =========================================================================
    // Test Cases
    // =========================================================================

    @Test
    public void testInstanceAndWithConfig_sameConfig_returnsSameInstance() {
        DeserializerFactoryConfig config = factory.getFactoryConfig();
        DeserializerFactory sameFactory = factory.withConfig(config);
        Assert.assertSame(factory, sameFactory);
    }

    @Test
    public void testWithConfig_differentConfig_returnsNewInstance() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        DeserializerFactory newFactory = factory.withConfig(config);
        Assert.assertNotNull(newFactory);
        Assert.assertNotSame(factory, newFactory);
        Assert.assertEquals(BeanDeserializerFactory.class, newFactory.getClass());
    }

    @Test
    public void testCreateBeanDeserializer_simpleBean_createsDeserializer() throws Exception {
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertNotNull(deser);
        Assert.assertTrue(deser.isCachable());
    }

    @Test
    public void testCreateBeanDeserializer_customDeserializer_returnsCustom() throws Exception {
        ObjectMapper customMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        final JsonDeserializer<SimpleBean> customDeser = new StdDeserializer<SimpleBean>(SimpleBean.class) {
            @Override
            public SimpleBean deserialize(JsonParser p, DeserializationContext ctxt) {
                return new SimpleBean("custom", 99);
            }
        };
        module.addDeserializer(SimpleBean.class, customDeser);
        customMapper.registerModule(module);

        DeserializationContext ctxt = customMapper.getDeserializationContext();
        JavaType type = customMapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = customMapper.getDeserializationConfig().introspect(type);

        DeserializerFactory customFactory = factory.withConfig(
                factory.getFactoryConfig().withAdditionalDeserializers(new SimpleDeserializers(Collections.singletonMap(SimpleBean.class, (JsonDeserializer<?>) customDeser))));

        JsonDeserializer<Object> deser = customFactory.createBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertSame(customDeser, deser);
    }

    @Test
    public void testCreateBeanDeserializer_throwable_createsThrowableDeserializer() throws Exception {
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(CustomException.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertNotNull(deser);

        CustomException result = mapper.readValue("{\"message\":\"boom\",\"extra\":\"info\"}", CustomException.class);
        Assert.assertEquals("boom", result.getMessage());
        Assert.assertEquals("info", result.getExtra());
    }

    @Test
    public void testCreateBeanDeserializer_abstractTypeMaterialization_materializesConcreteType() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(AbstractService.class, ConcreteService.class);

        DeserializerFactory customFactory = factory.withConfig(
                factory.getFactoryConfig().withAbstractTypeResolver(resolver));

        ObjectMapper customMapper = new ObjectMapper();
        DeserializationContext ctxt = customMapper.getDeserializationContext();
        JavaType type = customMapper.constructType(AbstractService.class);
        BeanDescription beanDesc = customMapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deser = customFactory.createBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertNotNull(deser);

        customMapper.registerModule(new SimpleModule().setAbstractTypes(resolver));
        AbstractService svc = customMapper.readValue("{\"name\":\"jackson\"}", AbstractService.class);
        Assert.assertNotNull(svc);
        Assert.assertEquals("jackson", svc.serve());
    }

    @Test
    public void testCreateBeanDeserializer_unmaterializableAbstractClass_returnsAbstractDeserializer() throws Exception {
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(AbstractService.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testCreateBeanDeserializer_primitiveType_returnsNullOrStd() throws Exception {
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(int.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testCreateBuilderBasedDeserializer_validBuilder_buildsSuccessfully() throws Exception {
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType valueType = mapper.constructType(BuilderBean.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(valueType);

        JsonDeserializer<Object> deser = factory.createBuilderBasedDeserializer(
                ctxt, valueType, beanDesc, SimplePOJOBuilder.class);
        Assert.assertNotNull(deser);

        BuilderBean result = mapper.readValue("{\"data\":\"hello\"}", BuilderBean.class);
        Assert.assertEquals("hello", result.getData());
    }

    @Test
    public void testBuildBeanDeserializer_creatorProperties_constructsProperly() throws Exception {
        CreatorBean bean = mapper.readValue("{\"item\":\"book\",\"qty\":5}", CreatorBean.class);
        Assert.assertEquals("book", bean.getItem());
        Assert.assertEquals(5, bean.getQty());
    }

    @Test
    public void testBuildBeanDeserializer_setterlessProperties_populatesCollections() throws Exception {
        SetterlessBean bean = mapper.readValue("{\"list\":[\"a\",\"b\"],\"map\":{\"k\":\"v\"}}", SetterlessBean.class);
        Assert.assertEquals(2, bean.getList().size());
        Assert.assertEquals("v", bean.getMap().get("k"));
    }

    @Test
    public void testBuildBeanDeserializer_anySetterMethod_handlesExtraProperties() throws Exception {
        AnySetterMethodBean bean = mapper.readValue("{\"customKey\":\"customValue\"}", AnySetterMethodBean.class);
        Assert.assertEquals("customValue", bean.getValues().get("customKey"));
    }

    @Test
    public void testBuildBeanDeserializer_anySetterField_handlesExtraProperties() throws Exception {
        AnySetterFieldBean bean = mapper.readValue("{\"fieldKey\":\"fieldVal\"}", AnySetterFieldBean.class);
        Assert.assertEquals("fieldVal", bean.values.get("fieldKey"));
    }

    @Test
    public void testBuildBeanDeserializer_injectables_injectsValue() throws Exception {
        InjectableValues.Std injectables = new InjectableValues.Std();
        injectables.addValue("injectId", "injectedValue");
        ObjectMapper injectedMapper = new ObjectMapper().setInjectableValues(injectables);

        InjectableBean bean = injectedMapper.readValue("{\"normal\":\"normalValue\"}", InjectableBean.class);
        Assert.assertEquals("injectedValue", bean.injected);
        Assert.assertEquals("normalValue", bean.normal);
    }

    @Test
    public void testBuildBeanDeserializer_managedAndBackReferences_linksCorrectly() throws Exception {
        String json = "{\"name\":\"parent\",\"child\":{\"value\":\"childVal\"}}";
        ParentRef parent = mapper.readValue(json, ParentRef.class);
        Assert.assertNotNull(parent);
        Assert.assertNotNull(parent.child);
        Assert.assertSame(parent, parent.child.parent);
    }

    @Test
    public void testBuildBeanDeserializer_objectIdProperty_resolvesReference() throws Exception {
        String json = "{\"id\":123,\"name\":\"foo\"}";
        ObjectIdPropertyBean bean = mapper.readValue(json, ObjectIdPropertyBean.class);
        Assert.assertEquals(123, bean.id);
        Assert.assertEquals("foo", bean.name);
    }

    @Test
    public void testBuildBeanDeserializer_objectIdSequence_resolvesReference() throws Exception {
        String json = "{\"id\":1,\"name\":\"seqFoo\"}";
        ObjectIdSequenceBean bean = mapper.readValue(json, ObjectIdSequenceBean.class);
        Assert.assertEquals(1, bean.id);
        Assert.assertEquals("seqFoo", bean.name);
    }

    @Test(expected = JsonMappingException.class)
    public void testBuildBeanDeserializer_invalidObjectIdProperty_throwsException() throws Exception {
        mapper.readValue("{\"id\":1}", InvalidObjectIdBean.class);
    }

    @Test
    public void testBuildBeanDeserializer_ignorableType_skipsField() throws Exception {
        String json = "{\"name\":\"test\",\"ignoredType\":{\"value\":\"skipMe\"}}";
        BeanWithIgnorableType bean = mapper.readValue(json, BeanWithIgnorableType.class);
        Assert.assertEquals("test", bean.name);
        Assert.assertNull(bean.ignoredType);
    }

    @Test
    public void testBuildBeanDeserializer_deserializerModifier_modifiesBehavior() throws Exception {
        final boolean[] builderUpdated = new boolean[1];
        final boolean[] deserModified = new boolean[1];
        final boolean[] propsUpdated = new boolean[1];

        BeanDeserializerModifier modifier = new BeanDeserializerModifier() {
            @Override
            public BeanDeserializerBuilder updateBuilder(DeserializationConfig config, BeanDescription beanDesc, BeanDeserializerBuilder builder) {
                builderUpdated[0] = true;
                return builder;
            }

            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                deserModified[0] = true;
                return deserializer;
            }

            @Override
            public List<BeanPropertyDefinition> updateProperties(DeserializationConfig config, BeanDescription beanDesc, List<BeanPropertyDefinition> propDefs) {
                propsUpdated[0] = true;
                return propDefs;
            }
        };

        DeserializerFactory customFactory = factory.withConfig(
                factory.getFactoryConfig().withDeserializerModifier(modifier));

        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deser = customFactory.createBeanDeserializer(ctxt, type, beanDesc);
        Assert.assertNotNull(deser);
        Assert.assertTrue(builderUpdated[0]);
        Assert.assertTrue(deserModified[0]);
        Assert.assertTrue(propsUpdated[0]);
    }

    @Test
    public void testIsPotentialBeanType_validAndInvalidTypes() {
        SubclassedBeanDeserializerFactory subFactory = new SubclassedBeanDeserializerFactory(new DeserializerFactoryConfig());
        Assert.assertTrue(subFactory.testIsPotentialBeanType(SimpleBean.class));

        try {
            subFactory.testIsPotentialBeanType(int[].class);
            Assert.fail("Expected IllegalArgumentException for array type");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot deserialize Class"));
        }

        class LocalClass {
            public int x;
        }

        try {
            subFactory.testIsPotentialBeanType(LocalClass.class);
            Assert.fail("Expected IllegalArgumentException for local class");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot deserialize Class"));
        }
    }

    @Test
    public void testIsIgnorableType_primitivesAndStrings() {
        SubclassedBeanDeserializerFactory subFactory = new SubclassedBeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializationConfig config = mapper.getDeserializationConfig();
        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();

        Assert.assertFalse(subFactory.testIsIgnorableType(config, null, String.class, cache));
        Assert.assertFalse(subFactory.testIsIgnorableType(config, null, int.class, cache));
        Assert.assertTrue(subFactory.testIsIgnorableType(config, null, NonDeserializableType.class, cache));
        // Check cache hit
        Assert.assertTrue(subFactory.testIsIgnorableType(config, null, NonDeserializableType.class, cache));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testAddReferenceProperties_deprecatedMethod_delegatesProperly() throws Exception {
        SubclassedBeanDeserializerFactory subFactory = new SubclassedBeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(ChildRef.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, ctxt);

        subFactory.testAddReferenceProperties(ctxt, beanDesc, builder);
        Assert.assertNotNull(builder.hasValueDeserializerFor(new PropertyName("parent")));
    }

    @Test
    public void testBuildThrowableDeserializer_directInvocation() throws Exception {
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(CustomException.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);

        JsonDeserializer<Object> deser = factory.buildThrowableDeserializer(ctxt, type, beanDesc);
        Assert.assertNotNull(deser);
    }
}
