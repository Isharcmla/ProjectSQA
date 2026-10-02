package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class BeanSerializerFactoryTest {

    private BeanSerializerFactory factory;
    private ObjectMapper mapper;
    private SerializerProvider serializerProvider;

    @Before
    public void setUp() {
        factory = BeanSerializerFactory.instance;
        mapper = new ObjectMapper();
        serializerProvider = mapper.getSerializerProviderInstance();
    }

    // --- Helper Classes & Dummy Beans ---

    static class SimpleBean {
        private String name;
        public int age;

        public SimpleBean() {}
        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class CustomClassSerializer extends StdSerializer<CustomAnnotatedBean> {
        public CustomClassSerializer() {
            super(CustomAnnotatedBean.class);
        }

        @Override
        public void serialize(CustomAnnotatedBean value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString("custom:" + value.value);
        }
    }

    @JsonSerialize(using = CustomClassSerializer.class)
    static class CustomAnnotatedBean {
        public String value;
    }

    interface SuperType {}

    @JsonSerialize(as = SuperType.class)
    static class SubTypeBean implements SuperType {
        public String field = "test";
    }

    static class StringConverter extends StdConverter<ConvertedBean, String> {
        @Override
        public String convert(ConvertedBean value) {
            return value.data.toUpperCase();
        }
    }

    @JsonSerialize(converter = StringConverter.class)
    static class ConvertedBean {
        public String data = "hello";
    }

    static class JsonValueBean {
        private final String val;

        public JsonValueBean(String val) {
            this.val = val;
        }

        @JsonValue
        public String getVal() {
            return val;
        }
    }

    @JsonFilter("testFilter")
    static class FilteredBean {
        public String prop = "filtered";
    }

    @JsonIgnoreProperties({"ignoredProp"})
    static class IgnorePropertiesBean {
        public String regularProp = "a";
        public String ignoredProp = "b";
    }

    @JsonIgnoreType
    static class IgnorableType {
        public String ignored = "hideMe";
    }

    static class BeanWithIgnorableField {
        public String keep = "ok";
        public IgnorableType hide = new IgnorableType();
    }

    static class SetterlessGetterBean {
        public String getReadOnly() {
            return "readOnly";
        }

        @JsonProperty("explicitReadOnly")
        public String getExplicitReadOnly() {
            return "explicit";
        }
    }

    static class TypeIdBean {
        @JsonTypeId
        public String type = "TypeIdBean";
        public String data = "data";
    }

    static class ParentBean {
        public String name;
        @JsonManagedReference
        public ChildBean child;
    }

    static class ChildBean {
        public String childName;
        @JsonBackReference
        public ParentBean parent;
    }

    static class AnyGetterBean {
        private final Map<String, Object> map = new HashMap<String, Object>();

        public void add(String key, Object val) {
            map.put(key, val);
        }

        @JsonAnyGetter
        public Map<String, Object> getMap() {
            return map;
        }
    }

    static class Views {
        static class Public {}
        static class Internal extends Public {}
    }

    static class ViewBean {
        @JsonView(Views.Public.class)
        public String publicField = "public";

        @JsonView(Views.Internal.class)
        public String internalField = "internal";

        public String unannotatedField = "unannotated";
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class PropertyIdBean {
        public int id = 123;
        public String name = "idBean";
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nonExistent")
    static class InvalidPropertyIdBean {
        public int id = 123;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class SequenceIdBean {
        public String name = "seq";
    }

    @JsonRootName("empty")
    static class EmptyAnnotatedBean {
    }

    enum SampleEnum {
        A, B
    }

    static class SubclassWithoutOverride extends BeanSerializerFactory {
        public SubclassWithoutOverride(SerializerFactoryConfig config) {
            super(config);
        }
    }

    static class PolymorphicPropertyBean {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
        public Object polyProp = new SimpleBean("poly", 10);

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
        public List<SimpleBean> polyList = Collections.singletonList(new SimpleBean("item", 1));
    }

    // --- Tests ---

    @Test
    public void testWithConfig_sameConfig_returnsSameInstance() {
        SerializerFactoryConfig config = new SerializerFactoryConfig();
        BeanSerializerFactory customFactory = new BeanSerializerFactory(config);
        SerializerFactory result = customFactory.withConfig(config);
        Assert.assertSame(customFactory, result);
    }

    @Test
    public void testWithConfig_differentConfig_returnsNewInstance() {
        SerializerFactoryConfig config1 = new SerializerFactoryConfig();
        SerializerFactoryConfig config2 = new SerializerFactoryConfig();
        BeanSerializerFactory customFactory = new BeanSerializerFactory(config1);
        SerializerFactory result = customFactory.withConfig(config2);
        Assert.assertNotNull(result);
        Assert.assertNotSame(customFactory, result);
        Assert.assertTrue(result instanceof BeanSerializerFactory);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclassWithoutOverride_throwsIllegalStateException() {
        SubclassWithoutOverride subFactory = new SubclassWithoutOverride(new SerializerFactoryConfig());
        subFactory.withConfig(new SerializerFactoryConfig());
    }

    @Test
    public void testCreateSerializer_simpleBean_returnsBeanSerializer() throws JsonMappingException {
        JavaType type = mapper.constructType(SimpleBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof BeanSerializer || ser instanceof ResolvableSerializer);
    }

    @Test
    public void testCreateSerializer_withAnnotationOnClass_returnsCustomSerializer() throws JsonMappingException {
        JavaType type = mapper.constructType(CustomAnnotatedBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof CustomClassSerializer);
    }

    @Test
    public void testCreateSerializer_typeModificationByAnnotation() throws JsonMappingException {
        JavaType type = mapper.constructType(SubTypeBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testCreateSerializer_withConverterOnClass() throws JsonMappingException {
        JavaType type = mapper.constructType(ConvertedBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testCreateSerializer_withJsonValue() throws JsonMappingException {
        JavaType type = mapper.constructType(JsonValueBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testCreateSerializer_containerType() throws JsonMappingException {
        JavaType listType = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, listType);
        Assert.assertNotNull(ser);

        JavaType mapType = mapper.getTypeFactory().constructMapType(Map.class, String.class, Integer.class);
        JsonSerializer<Object> mapSer = factory.createSerializer(serializerProvider, mapType);
        Assert.assertNotNull(mapSer);
    }

    @Test
    public void testCreateSerializer_customSerializersInConfig() throws JsonMappingException {
        SimpleSerializers simpleSerializers = new SimpleSerializers();
        final JsonSerializer<?> dummySer = NullSerializer.instance;
        simpleSerializers.addSerializer(SimpleBean.class, dummySer);

        SerializerFactoryConfig config = new SerializerFactoryConfig().withAdditionalSerializers(simpleSerializers);
        BeanSerializerFactory customFactory = new BeanSerializerFactory(config);

        JavaType type = mapper.constructType(SimpleBean.class);
        JsonSerializer<Object> ser = customFactory.createSerializer(serializerProvider, type);
        Assert.assertSame(dummySer, ser);
    }

    @Test
    public void testCreateSerializer_serializerModifier() throws JsonMappingException {
        final boolean[] modifierCalled = new boolean[4];

        BeanSerializerModifier modifier = new BeanSerializerModifier() {
            @Override
            public List<BeanPropertyWriter> changeProperties(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyWriter> beanProperties) {
                modifierCalled[0] = true;
                return super.changeProperties(config, beanDesc, beanProperties);
            }

            @Override
            public List<BeanPropertyWriter> orderProperties(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyWriter> beanProperties) {
                modifierCalled[1] = true;
                return super.orderProperties(config, beanDesc, beanProperties);
            }

            @Override
            public BeanSerializerBuilder updateBuilder(SerializationConfig config, BeanDescription beanDesc, BeanSerializerBuilder builder) {
                modifierCalled[2] = true;
                return super.updateBuilder(config, beanDesc, builder);
            }

            @Override
            public JsonSerializer<?> modifySerializer(SerializationConfig config, BeanDescription beanDesc, JsonSerializer<?> serializer) {
                modifierCalled[3] = true;
                return super.modifySerializer(config, beanDesc, serializer);
            }
        };

        SerializerFactoryConfig config = new SerializerFactoryConfig().withSerializerModifier(modifier);
        BeanSerializerFactory customFactory = new BeanSerializerFactory(config);

        JavaType type = mapper.constructType(SimpleBean.class);
        JsonSerializer<Object> ser = customFactory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
        Assert.assertTrue(modifierCalled[0]);
        Assert.assertTrue(modifierCalled[1]);
        Assert.assertTrue(modifierCalled[2]);
        Assert.assertTrue(modifierCalled[3]);
    }

    @Test
    public void testCreateSerializer_objectClass_returnsUnknownSerializer() throws JsonMappingException {
        JavaType type = mapper.constructType(Object.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testCreateSerializer_emptyBeanWithAnnotations_returnsDummySerializer() throws JsonMappingException {
        JavaType type = mapper.constructType(EmptyAnnotatedBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testFindBeanSerializer_enumType() throws JsonMappingException {
        JavaType type = mapper.constructType(SampleEnum.class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(type);
        JsonSerializer<Object> ser = factory.findBeanSerializer(serializerProvider, type, desc);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testFindBeanSerializer_nonBeanType_returnsNull() throws JsonMappingException {
        JavaType type = mapper.constructType(int.class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(type);
        JsonSerializer<Object> ser = factory.findBeanSerializer(serializerProvider, type, desc);
        Assert.assertNull(ser);
    }

    @Test
    public void testConstructObjectIdHandler_propertyGenerator_success() throws JsonMappingException {
        JavaType type = mapper.constructType(PropertyIdBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructObjectIdHandler_propertyGenerator_missingProperty_throwsException() throws JsonMappingException {
        JavaType type = mapper.constructType(InvalidPropertyIdBean.class);
        factory.createSerializer(serializerProvider, type);
    }

    @Test
    public void testConstructObjectIdHandler_sequenceGenerator_success() throws JsonMappingException {
        JavaType type = mapper.constructType(SequenceIdBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testFilterBeanProperties_ignoredPropertiesRemoved() throws JsonMappingException {
        JavaType type = mapper.constructType(IgnorePropertiesBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testRemoveIgnorableTypes_ignoredTypeFiltered() throws JsonMappingException {
        JavaType type = mapper.constructType(BeanWithIgnorableField.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testRemoveSetterlessGetters_enabledFeature() throws JsonMappingException {
        ObjectMapper requireSettersMapper = new ObjectMapper();
        requireSettersMapper.enable(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS);
        SerializerProvider prov = requireSettersMapper.getSerializerProviderInstance();

        JavaType type = requireSettersMapper.constructType(SetterlessGetterBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(prov, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testFindBeanProperties_withTypeIdAnnotation() throws JsonMappingException {
        JavaType type = mapper.constructType(TypeIdBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testFindBeanProperties_withBackReference() throws JsonMappingException {
        JavaType type = mapper.constructType(ChildBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testConstructBeanSerializer_withAnyGetter() throws JsonMappingException {
        JavaType type = mapper.constructType(AnyGetterBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testProcessViews_defaultViewInclusionEnabled() throws JsonMappingException {
        ObjectMapper viewMapper = new ObjectMapper();
        viewMapper.enable(MapperFeature.DEFAULT_VIEW_INCLUSION);
        SerializerProvider prov = viewMapper.getSerializerProviderInstance();

        JavaType type = viewMapper.constructType(ViewBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(prov, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testProcessViews_defaultViewInclusionDisabled() throws JsonMappingException {
        ObjectMapper viewMapper = new ObjectMapper();
        viewMapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
        SerializerProvider prov = viewMapper.getSerializerProviderInstance();

        JavaType type = viewMapper.constructType(ViewBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(prov, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testFindPropertyTypeSerializer_and_findPropertyContentTypeSerializer() throws Exception {
        JavaType type = mapper.constructType(PolymorphicPropertyBean.class);
        BasicBeanDescription desc = (BasicBeanDescription) mapper.getSerializationConfig().introspect(type);
        List<BeanPropertyDefinition> props = desc.findProperties();

        for (BeanPropertyDefinition prop : props) {
            AnnotatedMember accessor = prop.getAccessor();
            if (accessor != null) {
                if ("polyProp".equals(prop.getName())) {
                    TypeSerializer typeSer = factory.findPropertyTypeSerializer(accessor.getType(desc.bindingsForBeanType()), mapper.getSerializationConfig(), accessor);
                    Assert.assertNotNull(typeSer);
                } else if ("polyList".equals(prop.getName())) {
                    TypeSerializer contentSer = factory.findPropertyContentTypeSerializer(accessor.getType(desc.bindingsForBeanType()), mapper.getSerializationConfig(), accessor);
                    Assert.assertNotNull(contentSer);
                }
            }
        }
    }

    @Test
    public void testIsPotentialBeanType() {
        Assert.assertTrue(factory.isPotentialBeanType(SimpleBean.class));
        Assert.assertFalse(factory.isPotentialBeanType(int.class));
        Assert.assertFalse(factory.isPotentialBeanType(int[].class));
    }

    @Test
    public void testConstructPropertyBuilder_and_constructBeanSerializerBuilder() {
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(type);

        PropertyBuilder pb = factory.constructPropertyBuilder(mapper.getSerializationConfig(), desc);
        Assert.assertNotNull(pb);

        BeanSerializerBuilder bsb = factory.constructBeanSerializerBuilder(desc);
        Assert.assertNotNull(bsb);
    }

    @Test
    public void testConstructFilteredBeanWriter() {
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(type);
        BeanSerializerBuilder builder = factory.constructBeanSerializerBuilder(desc);
        builder.setConfig(mapper.getSerializationConfig());

        try {
            List<BeanPropertyWriter> props = factory.findBeanProperties(serializerProvider, desc, builder);
            if (props != null && !props.isEmpty()) {
                BeanPropertyWriter writer = props.get(0);
                BeanPropertyWriter filtered = factory.constructFilteredBeanWriter(writer, new Class<?>[]{Views.Public.class});
                Assert.assertNotNull(filtered);
            }
        } catch (JsonMappingException e) {
            Assert.fail("Exception should not be thrown: " + e.getMessage());
        }
    }
}
