package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import com.fasterxml.jackson.databind.ser.std.StdConverter;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class BeanSerializerFactoryTest {

    private BeanSerializerFactory factory;
    private ObjectMapper mapper;
    private DefaultSerializerProvider provider;

    @Before
    public void setUp() {
        factory = BeanSerializerFactory.instance;
        mapper = new ObjectMapper();
        provider = ((DefaultSerializerProvider) mapper.getSerializerProvider())
                .createInstance(mapper.getSerializationConfig(), factory);
    }

    // --- Helper Classes for Testing ---

    public static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
    }

    public static class CustomSerializedBeanSerializer extends StdSerializer<CustomSerializedBean> {
        public CustomSerializedBeanSerializer() { super(CustomSerializedBean.class); }
        @Override
        public void serialize(CustomSerializedBean value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString("custom:" + value.value);
        }
    }

    @JsonSerialize(using = CustomSerializedBeanSerializer.class)
    public static class CustomSerializedBean {
        public String value;
    }

    public static class StringWrapperConverter extends StdConverter<StringWrapper, String> {
        @Override
        public String convert(StringWrapper value) {
            return value.text;
        }
    }

    @JsonSerialize(converter = StringWrapperConverter.class)
    public static class StringWrapper {
        public String text;
        public StringWrapper(String text) { this.text = text; }
    }

    @JsonSerialize(as = BaseType.class)
    public static class SubType extends BaseType {
        public String extra = "extra";
    }

    public static class BaseType {
        public String base = "base";
    }

    public static class JsonValueBean {
        private final String val;
        public JsonValueBean(String val) { this.val = val; }
        @JsonValue
        public String getVal() { return val; }
    }

    public enum SampleEnum {
        A, B
    }

    public static class EmptyAnnotatedBean {
        // No properties, but Jackson should consider it a bean if annotated or handle dummy
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class PropertyIdBean {
        public String name;
        public int id;
        public PropertyIdBean(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nonExistent")
    public static class InvalidPropertyIdBean {
        public int id;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    public static class IntSequenceIdBean {
        public String name;
    }

    @JsonIgnoreProperties({"secret"})
    public static class FilteredPropsBean {
        public String name;
        public String secret;
    }

    @JsonIgnoreType
    public static class IgnoredType {
        public String data = "ignored";
    }

    public static class BeanWithIgnoredTypeProp {
        public String title = "title";
        public IgnoredType ignored = new IgnoredType();
    }

    public static class SetterlessBean {
        public String getReadOnly() { return "readonly"; }
        public String getWritable() { return "writable"; }
        public void setWritable(String w) {}
        @JsonProperty
        public String getExplicit() { return "explicit"; }
    }

    public static class AnyGetterBean {
        private Map<String, Object> map = new HashMap<String, Object>();
        public AnyGetterBean() {
            map.put("k1", "v1");
        }
        @JsonAnyGetter
        public Map<String, Object> any() {
            return map;
        }
    }

    public static class Views {
        public static class ViewA {}
        public static class ViewB {}
    }

    public static class ViewBean {
        @JsonView(Views.ViewA.class)
        public String propA = "A";
        @JsonView(Views.ViewB.class)
        public String propB = "B";
        public String unannotated = "U";
    }

    public static class ParentRefBean {
        public String name = "parent";
        @JsonManagedReference
        public ChildRefBean child;
    }

    public static class ChildRefBean {
        public String name = "child";
        @JsonBackReference
        public ParentRefBean parent;
    }

    public static class TypeIdBean {
        @JsonTypeId
        public String typeIdField = "customType";
        public String value = "val";
    }

    public static class PolyWrapper {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
        @JsonSubTypes({@JsonSubTypes.Type(value = SubType.class, name = "sub")})
        public BaseType polyProp;
    }

    public static class PolyContainerWrapper {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
        @JsonSubTypes({@JsonSubTypes.Type(value = SubType.class, name = "sub")})
        public List<BaseType> polyList = new ArrayList<BaseType>();
    }

    public static class SubBeanSerializerFactory extends BeanSerializerFactory {
        public SubBeanSerializerFactory(SerializerFactoryConfig config) {
            super(config);
        }
    }

    // --- Tests ---

    @Test
    public void testSingletonInstance_isNotNull() {
        Assert.assertNotNull(BeanSerializerFactory.instance);
    }

    @Test
    public void testWithConfig_sameConfig_returnsSameInstance() {
        SerializerFactoryConfig config = factory.getFactoryConfig();
        SerializerFactory newFactory = factory.withConfig(config);
        Assert.assertSame(factory, newFactory);
    }

    @Test
    public void testWithConfig_newConfig_returnsNewInstance() {
        SerializerFactoryConfig newConfig = new SerializerFactoryConfig();
        SerializerFactory newFactory = factory.withConfig(newConfig);
        Assert.assertNotSame(factory, newFactory);
        Assert.assertTrue(newFactory instanceof BeanSerializerFactory);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclassThrowsIllegalStateException() {
        SubBeanSerializerFactory subFactory = new SubBeanSerializerFactory(null);
        subFactory.withConfig(new SerializerFactoryConfig());
    }

    @Test
    public void testCustomSerializers_returnsConfigSerializers() {
        Iterable<Serializers> it = factory.customSerializers();
        Assert.assertNotNull(it);
        Assert.assertFalse(it.iterator().hasNext());
    }

    @Test
    public void testCreateSerializer_explicitAnnotation() throws Exception {
        JavaType type = mapper.constructType(CustomSerializedBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(provider, type);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof CustomSerializedBeanSerializer);
    }

    @Test
    public void testCreateSerializer_withConverter() throws Exception {
        JavaType type = mapper.constructType(StringWrapper.class);
        JsonSerializer<Object> ser = factory.createSerializer(provider, type);
        Assert.assertNotNull(ser);
        Assert.assertEquals("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", ser.getClass().getName());
    }

    @Test
    public void testCreateSerializer_typeModifiedByAnnotation() throws Exception {
        JavaType type = mapper.constructType(SubType.class);
        JsonSerializer<Object> ser = factory.createSerializer(provider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testCreateSerializer_jsonValue() throws Exception {
        JavaType type = mapper.constructType(JsonValueBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(provider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testCreateSerializer_containerType() throws Exception {
        JavaType listType = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        JsonSerializer<Object> ser = factory.createSerializer(provider, listType);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testCreateSerializer_customModuleSerializers() throws Exception {
        SimpleSerializers custom = new SimpleSerializers();
        final JsonSerializer<SimpleBean> customBeanSer = new StdSerializer<SimpleBean>(SimpleBean.class) {
            @Override
            public void serialize(SimpleBean value, JsonGenerator gen, SerializerProvider provider) throws IOException {
                gen.writeString("simple");
            }
        };
        custom.addSerializer(SimpleBean.class, customBeanSer);
        SerializerFactory customFactory = factory.withConfig(new SerializerFactoryConfig().withAdditionalSerializers(custom));
        DefaultSerializerProvider customProv = provider.createInstance(mapper.getSerializationConfig(), customFactory);

        JavaType type = mapper.constructType(SimpleBean.class);
        JsonSerializer<Object> ser = customFactory.createSerializer(customProv, type);
        Assert.assertSame(customBeanSer, ser);
    }

    @Test
    public void testCreateSerializer_serializerModifier() throws Exception {
        final boolean[] modified = new boolean[]{false};
        BeanSerializerModifier modifier = new BeanSerializerModifier() {
            @Override
            public JsonSerializer<?> modifySerializer(SerializationConfig config, BeanDescription beanDesc, JsonSerializer<?> serializer) {
                modified[0] = true;
                return serializer;
            }
        };
        SerializerFactory modFactory = factory.withConfig(new SerializerFactoryConfig().withSerializerModifier(modifier));
        DefaultSerializerProvider customProv = provider.createInstance(mapper.getSerializationConfig(), modFactory);

        JavaType type = mapper.constructType(SimpleBean.class);
        JsonSerializer<Object> ser = modFactory.createSerializer(customProv, type);
        Assert.assertNotNull(ser);
        Assert.assertTrue(modified[0]);
    }

    @Test
    public void testCreateSerializer_plainObjectReturnsUnknownTypeSerializer() throws Exception {
        JavaType type = mapper.constructType(Object.class);
        JsonSerializer<Object> ser = factory.createSerializer(provider, type);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testFindBeanSerializer_nonBeanTypes() throws Exception {
        JavaType intType = mapper.constructType(int.class);
        BeanDescription intDesc = mapper.getSerializationConfig().introspect(intType);
        Assert.assertNull(factory.findBeanSerializer(provider, intType, intDesc));

        JavaType arrayType = mapper.constructType(int[].class);
        BeanDescription arrayDesc = mapper.getSerializationConfig().introspect(arrayType);
        Assert.assertNull(factory.findBeanSerializer(provider, arrayType, arrayDesc));

        JavaType enumType = mapper.constructType(SampleEnum.class);
        BeanDescription enumDesc = mapper.getSerializationConfig().introspect(enumType);
        Assert.assertNotNull(factory.findBeanSerializer(provider, enumType, enumDesc));
    }

    @Test
    public void testFindPropertyTypeSerializer() throws Exception {
        JavaType wrapperType = mapper.constructType(PolyWrapper.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(wrapperType);
        List<BeanPropertyDefinition> props = beanDesc.findProperties();
        AnnotatedMember accessor = null;
        for (BeanPropertyDefinition prop : props) {
            if ("polyProp".equals(prop.getName())) {
                accessor = prop.getAccessor();
                break;
            }
        }
        Assert.assertNotNull(accessor);
        JavaType propType = accessor.getType(beanDesc.bindingsForBeanType());
        TypeSerializer ts = factory.findPropertyTypeSerializer(propType, mapper.getSerializationConfig(), accessor);
        Assert.assertNotNull(ts);
    }

    @Test
    public void testFindPropertyTypeSerializer_noResolver_returnsDefault() throws Exception {
        JavaType simpleType = mapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(simpleType);
        AnnotatedMember accessor = beanDesc.findProperties().get(0).getAccessor();
        JavaType propType = accessor.getType(beanDesc.bindingsForBeanType());

        TypeSerializer ts = factory.findPropertyTypeSerializer(propType, mapper.getSerializationConfig(), accessor);
        Assert.assertNull(ts);
    }

    @Test
    public void testFindPropertyContentTypeSerializer() throws Exception {
        JavaType wrapperType = mapper.constructType(PolyContainerWrapper.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(wrapperType);
        AnnotatedMember accessor = null;
        for (BeanPropertyDefinition prop : props(beanDesc)) {
            if ("polyList".equals(prop.getName())) {
                accessor = prop.getAccessor();
                break;
            }
        }
        Assert.assertNotNull(accessor);
        JavaType containerType = accessor.getType(beanDesc.bindingsForBeanType());
        TypeSerializer ts = factory.findPropertyContentTypeSerializer(containerType, mapper.getSerializationConfig(), accessor);
        Assert.assertNull(ts);
    }

    private List<BeanPropertyDefinition> props(BeanDescription desc) {
        return desc.findProperties();
    }

    @Test
    public void testConstructBeanSerializer_objectIdPropertyGenerator() throws Exception {
        JavaType type = mapper.constructType(PropertyIdBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(provider, type);
        Assert.assertNotNull(ser);

        String json = mapper.writeValueAsString(new PropertyIdBean(123, "test"));
        Assert.assertTrue(json.contains("\"id\":123"));
    }

    @Test(expected = JsonMappingException.class)
    public void testConstructBeanSerializer_invalidObjectIdProperty_throwsException() throws Exception {
        JavaType type = mapper.constructType(InvalidPropertyIdBean.class);
        factory.createSerializer(provider, type);
    }

    @Test
    public void testConstructBeanSerializer_objectIdIntSequenceGenerator() throws Exception {
        JavaType type = mapper.constructType(IntSequenceIdBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(provider, type);
        Assert.assertNotNull(ser);

        IntSequenceIdBean bean = new IntSequenceIdBean();
        bean.name = "seq";
        String json = mapper.writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"@id\":1"));
    }

    @Test
    public void testConstructBeanSerializer_filterBeanProperties() throws Exception {
        FilteredPropsBean bean = new FilteredPropsBean();
        bean.name = "visible";
        bean.secret = "hidden";
        String json = mapper.writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"name\":\"visible\""));
        Assert.assertFalse(json.contains("secret"));
    }

    @Test
    public void testConstructBeanSerializer_ignoredType() throws Exception {
        BeanWithIgnoredTypeProp bean = new BeanWithIgnoredTypeProp();
        String json = mapper.writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"title\":\"title\""));
        Assert.assertFalse(json.contains("ignored"));
    }

    @Test
    public void testConstructBeanSerializer_setterlessGetters() throws Exception {
        ObjectMapper requireSettersMapper = new ObjectMapper();
        requireSettersMapper.enable(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS);

        SetterlessBean bean = new SetterlessBean();
        String json = requireSettersMapper.writeValueAsString(bean);
        Assert.assertFalse(json.contains("readOnly"));
        Assert.assertTrue(json.contains("writable"));
        Assert.assertTrue(json.contains("explicit"));
    }

    @Test
    public void testConstructBeanSerializer_anyGetter() throws Exception {
        AnyGetterBean bean = new AnyGetterBean();
        String json = mapper.writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"k1\":\"v1\""));
    }

    @Test
    public void testConstructBeanSerializer_viewsDefaultInclusionTrue() throws Exception {
        ViewBean bean = new ViewBean();
        String json = mapper.writerWithView(Views.ViewA.class).writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"propA\":\"A\""));
        Assert.assertFalse(json.contains("propB"));
        Assert.assertTrue(json.contains("\"unannotated\":\"U\""));
    }

    @Test
    public void testConstructBeanSerializer_viewsDefaultInclusionFalse() throws Exception {
        ObjectMapper viewMapper = new ObjectMapper();
        viewMapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
        ViewBean bean = new ViewBean();
        String json = viewMapper.writerWithView(Views.ViewA.class).writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"propA\":\"A\""));
        Assert.assertFalse(json.contains("propB"));
        Assert.assertFalse(json.contains("unannotated"));
    }

    @Test
    public void testConstructBeanSerializer_backReferenceSuppression() throws Exception {
        ParentRefBean parent = new ParentRefBean();
        ChildRefBean child = new ChildRefBean();
        parent.child = child;
        child.parent = parent;

        String json = mapper.writeValueAsString(parent);
        Assert.assertTrue(json.contains("\"name\":\"parent\""));
        Assert.assertTrue(json.contains("\"child\":{\"name\":\"child\"}"));
    }

    @Test
    public void testConstructBeanSerializer_typeIdAnnotation() throws Exception {
        TypeIdBean bean = new TypeIdBean();
        String json = mapper.writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"typeIdField\":\"customType\""));
        Assert.assertTrue(json.contains("\"value\":\"val\""));
    }

    @Test
    public void testConstructBeanSerializer_modifiersChangeAndOrderProperties() throws Exception {
        final List<String> changePropCalls = new ArrayList<String>();
        final List<String> orderPropCalls = new ArrayList<String>();
        final List<String> updateBuilderCalls = new ArrayList<String>();

        BeanSerializerModifier mod = new BeanSerializerModifier() {
            @Override
            public List<BeanPropertyWriter> changeProperties(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyWriter> beanProperties) {
                changePropCalls.add(beanDesc.getBeanClass().getSimpleName());
                return beanProperties;
            }

            @Override
            public List<BeanPropertyWriter> orderProperties(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyWriter> beanProperties) {
                orderPropCalls.add(beanDesc.getBeanClass().getSimpleName());
                return beanProperties;
            }

            @Override
            public BeanSerializerBuilder updateBuilder(SerializationConfig config, BeanDescription beanDesc, BeanSerializerBuilder builder) {
                updateBuilderCalls.add(beanDesc.getBeanClass().getSimpleName());
                return builder;
            }
        };

        SerializerFactory modFactory = factory.withConfig(new SerializerFactoryConfig().withSerializerModifier(mod));
        DefaultSerializerProvider customProv = provider.createInstance(mapper.getSerializationConfig(), modFactory);
        JavaType type = mapper.constructType(SimpleBean.class);
        JsonSerializer<Object> ser = modFactory.createSerializer(customProv, type);

        Assert.assertNotNull(ser);
        Assert.assertTrue(changePropCalls.contains("SimpleBean"));
        Assert.assertTrue(orderPropCalls.contains("SimpleBean"));
        Assert.assertTrue(updateBuilderCalls.contains("SimpleBean"));
    }

    @Test
    public void testConstructBeanSerializer_isPotentialBeanType() {
        Assert.assertTrue(factory.isPotentialBeanType(SimpleBean.class));
        Assert.assertFalse(factory.isPotentialBeanType(int.class));
        Assert.assertFalse(factory.isPotentialBeanType(int[].class));
    }
}
