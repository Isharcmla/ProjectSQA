package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.junit.Assert;
import org.junit.Test;

public class BeanDeserializerFactoryTest {

    // ----------------------------------------------------------------------
    // Test Dummy Classes & Interfaces
    // ----------------------------------------------------------------------

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

    @JsonIgnoreProperties({"ignoredProp"})
    public static class IgnoredPropsBean {
        public String normal;
        public String ignoredProp;
        @JsonIgnore
        public String explicitlyIgnored;
    }

    @JsonIgnoreType
    public static class IgnoredTypeObject {
        public String value;
    }

    public static class BeanWithIgnoredTypeField {
        public String id;
        public IgnoredTypeObject ignored;
    }

    public static class SetterlessBean {
        private final List<String> list = new ArrayList<String>();
        private final Map<String, String> map = new HashMap<String, String>();

        public List<String> getList() { return list; }
        public Map<String, String> getMap() { return map; }
    }

    public static class AnySetterMethodBean {
        public Map<String, Object> extra = new HashMap<String, Object>();

        @JsonAnySetter
        public void setExtra(String key, Object value) {
            extra.put(key, value);
        }
    }

    public static class AnySetterFieldBean {
        @JsonAnySetter
        public Map<String, Object> extra = new HashMap<String, Object>();
    }

    public static class ParentRefBean {
        @JsonManagedReference
        public ChildRefBean child;
    }

    public static class ChildRefBean {
        @JsonBackReference
        public ParentRefBean parent;
        public String name;
    }

    public static class InjectableBean {
        @JacksonInject("injectedId")
        public String injectedId;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class PropertyIdBean {
        public int id;
        public PropertyIdBean next;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    public static class GeneratorIdBean {
        public int value;
        public GeneratorIdBean next;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nonExistentId")
    public static class InvalidPropertyIdBean {
        public int id;
    }

    public static class CreatorBean {
        public String a;
        public int b;

        @JsonCreator
        public CreatorBean(@JsonProperty("a") String a, @JsonProperty("b") int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static class Views {
        public interface PublicView {}
        public interface PrivateView {}
    }

    public static class ViewBean {
        @JsonView(Views.PublicView.class)
        public String publicField;

        @JsonView(Views.PrivateView.class)
        public String privateField;
    }

    @JsonDeserialize(builder = CustomPOJOBuilder.class)
    public static class BuilderBasedBean {
        private final String x;
        private final int y;

        BuilderBasedBean(String x, int y) {
            this.x = x;
            this.y = y;
        }

        public String getX() { return x; }
        public int getY() { return y; }
    }

    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "with")
    public static class CustomPOJOBuilder {
        private String x;
        private int y;

        public CustomPOJOBuilder withX(String x) {
            this.x = x;
            return this;
        }

        public CustomPOJOBuilder withY(int y) {
            this.y = y;
            return this;
        }

        public BuilderBasedBean create() {
            return new BuilderBasedBean(x, y);
        }
    }

    public static class CustomException extends Throwable {
        private static final long serialVersionUID = 1L;
        private int customCode;

        public CustomException() { super(); }
        public CustomException(String msg) { super(msg); }

        public int getCustomCode() { return customCode; }
        public void setCustomCode(int code) { this.customCode = code; }
    }

    public interface AbstractInterface {
        int getNum();
    }

    public static class ConcreteInterfaceImpl implements AbstractInterface {
        public int num;
        @Override
        public int getNum() { return num; }
        public void setNum(int num) { this.num = num; }
    }

    public static abstract class AbstractClassWithoutImpl {
        public int val;
    }

    public enum DummyEnum {
        ONE, TWO
    }

    private static class SubFactoryWithoutOverride extends BeanDeserializerFactory {
        private static final long serialVersionUID = 1L;

        public SubFactoryWithoutOverride(DeserializerFactoryConfig config) {
            super(config);
        }
    }

    // ----------------------------------------------------------------------
    // Test Cases
    // ----------------------------------------------------------------------

    @Test
    public void testWithConfig_sameConfig_returnsSameInstance() {
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
    public void testWithConfig_subclassWithoutOverride_throwsIllegalStateException() {
        SubFactoryWithoutOverride subFactory = new SubFactoryWithoutOverride(new DeserializerFactoryConfig());
        subFactory.withConfig(new DeserializerFactoryConfig());
    }

    @Test
    public void testCreateBeanDeserializer_simpleBean_deserializesCorrectly() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"John\",\"age\":30}";
        SimpleBean bean = mapper.readValue(json, SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("John", bean.getName());
        Assert.assertEquals(30, bean.getAge());
    }

    @Test
    public void testCreateBeanDeserializer_customBeanDeserializer_usesCustom() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(SimpleBean.class, new JsonDeserializer<SimpleBean>() {
            @Override
            public SimpleBean deserialize(JsonParser p, DeserializationContext ctxt) {
                return new SimpleBean("CUSTOM", 999);
            }
        });
        mapper.registerModule(module);

        SimpleBean bean = mapper.readValue("{}", SimpleBean.class);
        Assert.assertEquals("CUSTOM", bean.getName());
        Assert.assertEquals(999, bean.getAge());
    }

    @Test
    public void testCreateBeanDeserializer_throwable_usesThrowableDeserializer() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"message\":\"Error occurred\",\"customCode\":404}";
        CustomException ex = mapper.readValue(json, CustomException.class);
        Assert.assertNotNull(ex);
        Assert.assertEquals("Error occurred", ex.getMessage());
        Assert.assertEquals(404, ex.getCustomCode());
    }

    @Test
    public void testCreateBeanDeserializer_abstractTypeMaterialization_resolvesConcrete() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(AbstractInterface.class, ConcreteInterfaceImpl.class);
        module.setAbstractTypes(resolver);
        mapper.registerModule(module);

        AbstractInterface obj = mapper.readValue("{\"num\":42}", AbstractInterface.class);
        Assert.assertNotNull(obj);
        Assert.assertTrue(obj instanceof ConcreteInterfaceImpl);
        Assert.assertEquals(42, obj.getNum());
    }

    @Test
    public void testCreateBeanDeserializer_abstractTypeWithoutMaterialization_buildsAbstractDeserializer() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{\"val\":10}", AbstractClassWithoutImpl.class);
            Assert.fail("Should have failed to instantiate abstract type");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("abstract") || e.getMessage().contains("Cannot construct"));
        } catch (IOException e) {
            Assert.fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateBeanDeserializer_nonPotentialBeanTypes_returnsNullOrHandlesViaStd() throws Exception {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType primitiveType = mapper.constructType(int.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(primitiveType);

        JsonDeserializer<?> deser = factory.createBeanDeserializer(ctxt, primitiveType, beanDesc);
        Assert.assertNotNull(deser); // Std deserializer found for int
    }

    @Test
    public void testCreateBeanDeserializer_illegalType_throwsJsonMappingException() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{}", org.apache.xalan.xsltc.trax.TemplatesImpl.class);
            Assert.fail("Should block illegal class deserialization");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("prevented for security reasons") || e.getMessage().contains("Illegal type"));
        } catch (Exception e) {
            Assert.fail("Expected JsonMappingException but got: " + e.getClass().getName());
        }
    }

    @Test
    public void testCreateBuilderBasedDeserializer_validBuilder_deserializesCorrectly() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"x\":\"hello\",\"y\":123}";
        BuilderBasedBean bean = mapper.readValue(json, BuilderBasedBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("hello", bean.getX());
        Assert.assertEquals(123, bean.getY());
    }

    @Test
    public void testAddBeanProps_ignoredPropertiesAndType_ignoredCorrectly() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"normal\":\"value\",\"ignoredProp\":\"val2\",\"explicitlyIgnored\":\"val3\"}";
        IgnoredPropsBean bean = mapper.readValue(json, IgnoredPropsBean.class);
        Assert.assertEquals("value", bean.normal);
        Assert.assertNull(bean.ignoredProp);
        Assert.assertNull(bean.explicitlyIgnored);

        String jsonWithType = "{\"id\":\"123\",\"ignored\":{\"value\":\"abc\"}}";
        BeanWithIgnoredTypeField beanWithType = mapper.readValue(jsonWithType, BeanWithIgnoredTypeField.class);
        Assert.assertEquals("123", beanWithType.id);
        Assert.assertNull(beanWithType.ignored);
    }

    @Test
    public void testAddBeanProps_anySetterMethodAndField_handlesExtraProperties() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"k1\":\"v1\",\"k2\":\"v2\"}";

        AnySetterMethodBean methodBean = mapper.readValue(json, AnySetterMethodBean.class);
        Assert.assertEquals("v1", methodBean.extra.get("k1"));
        Assert.assertEquals("v2", methodBean.extra.get("k2"));

        AnySetterFieldBean fieldBean = mapper.readValue(json, AnySetterFieldBean.class);
        Assert.assertEquals("v1", fieldBean.extra.get("k1"));
        Assert.assertEquals("v2", fieldBean.extra.get("k2"));
    }

    @Test
    public void testAddBeanProps_setterlessCollectionAndMap_populatesProperly() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"list\":[\"a\",\"b\"],\"map\":{\"key\":\"val\"}}";
        SetterlessBean bean = mapper.readValue(json, SetterlessBean.class);
        Assert.assertEquals(2, bean.getList().size());
        Assert.assertEquals("a", bean.getList().get(0));
        Assert.assertEquals("val", bean.getMap().get("key"));
    }

    @Test
    public void testAddBeanProps_creatorProperties_constructsWithParams() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"a\":\"foo\",\"b\":50}";
        CreatorBean bean = mapper.readValue(json, CreatorBean.class);
        Assert.assertEquals("foo", bean.a);
        Assert.assertEquals(50, bean.b);
    }

    @Test
    public void testAddReferenceProperties_managedAndBackReferences_linksObjects() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"child\":{\"name\":\"kid\"}}";
        ParentRefBean parent = mapper.readValue(json, ParentRefBean.class);
        Assert.assertNotNull(parent.child);
        Assert.assertEquals("kid", parent.child.name);
        Assert.assertSame(parent, parent.child.parent);
    }

    @Test
    public void testAddInjectables_injectsValuesProperly() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std injectables = new InjectableValues.Std();
        injectables.addValue("injectedId", "INJECTED_123");

        String json = "{\"name\":\"test\"}";
        InjectBean bean = mapper.reader(injectables).forType(InjectBean.class).readValue(json);
        Assert.assertEquals("test", bean.name);
        Assert.assertEquals("INJECTED_123", bean.injectedId);
    }

    @Test
    public void testAddObjectIdReader_propertyAndGeneratorId_resolvesCycles() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonProp = "{\"id\":1,\"next\":1}";
        PropertyIdBean propBean = mapper.readValue(jsonProp, PropertyIdBean.class);
        Assert.assertNotNull(propBean);
        Assert.assertSame(propBean, propBean.next);

        String jsonGen = "{\"@id\":1,\"value\":100,\"next\":1}";
        GeneratorIdBean genBean = mapper.readValue(jsonGen, GeneratorIdBean.class);
        Assert.assertNotNull(genBean);
        Assert.assertSame(genBean, genBean.next);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddObjectIdReader_invalidPropertyId_throwsIllegalArgumentException() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"id\":1}", InvalidPropertyIdBean.class);
    }

    @Test
    public void testViews_defaultInclusionEnabledAndDisabled() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"publicField\":\"pub\",\"privateField\":\"priv\"}";

        ViewBean beanIncluded = mapper.readerWithView(Views.PublicView.class).forType(ViewBean.class).readValue(json);
        Assert.assertEquals("pub", beanIncluded.publicField);
        Assert.assertNull(beanIncluded.privateField);

        mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
        ViewBean beanNoDefault = mapper.readerWithView(Views.PublicView.class).forType(ViewBean.class).readValue(json);
        Assert.assertEquals("pub", beanNoDefault.publicField);
        Assert.assertNull(beanNoDefault.privateField);
    }

    @Test
    public void testDeserializerModifier_hooksExecuted() throws IOException {
        final boolean[] updatedBuilder = new boolean[1];
        final boolean[] modifiedDeser = new boolean[1];
        final boolean[] updatedProps = new boolean[1];

        BeanDeserializerModifier modifier = new BeanDeserializerModifier() {
            @Override
            public BeanDeserializerBuilder updateBuilder(DeserializationConfig config, BeanDescription beanDesc, BeanDeserializerBuilder builder) {
                updatedBuilder[0] = true;
                return builder;
            }

            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deser) {
                modifiedDeser[0] = true;
                return deser;
            }

            @Override
            public List<BeanPropertyDefinition> updateProperties(DeserializationConfig config, BeanDescription beanDesc, List<BeanPropertyDefinition> propDefs) {
                updatedProps[0] = true;
                return propDefs;
            }
        };

        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.setDeserializerModifier(modifier);
        mapper.registerModule(module);

        SimpleBean bean = mapper.readValue("{\"name\":\"test\",\"age\":1}", SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(updatedBuilder[0]);
        Assert.assertTrue(modifiedDeser[0]);
        Assert.assertTrue(updatedProps[0]);
    }

    @Test
    public void testIsPotentialBeanType_localClass_throwsIllegalArgumentException() {
        class LocalClass {
            @SuppressWarnings("unused")
            public int x;
        }

        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        try {
            factory.isPotentialBeanType(LocalClass.class);
            Assert.fail("Local class should not be a potential bean type");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("as a Bean"));
        }
    }

    @Test
    public void testIsPotentialBeanType_primitiveAndArray_throwsIllegalArgumentException() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;

        try {
            factory.isPotentialBeanType(int[].class);
            Assert.fail("Array should not be a potential bean type");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("as a Bean"));
        }

        try {
            factory.isPotentialBeanType(int.class);
            Assert.fail("Primitive should not be a potential bean type");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("as a Bean"));
        }
    }

    @Test
    public void testIsPotentialBeanType_validBean_returnsTrue() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        Assert.assertTrue(factory.isPotentialBeanType(SimpleBean.class));
    }

    @Test
    public void testConstructBeanDeserializerBuilder_returnsBuilder() {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(type);

        BeanDeserializerBuilder builder = factory.constructBeanDeserializerBuilder(ctxt, beanDesc);
        Assert.assertNotNull(builder);
    }
}
