package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.StdConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanSerializerFactoryTest {

    private BeanSerializerFactory factory;
    private ObjectMapper mapper;
    private DefaultSerializerProvider serializerProvider;

    @Before
    public void setUp() {
        factory = BeanSerializerFactory.instance;
        mapper = new ObjectMapper();
        serializerProvider = (DefaultSerializerProvider) mapper.getSerializerProviderInstance();
    }

    // ==========================================
    // 1. Lifecycle and Configuration tests
    // ==========================================

    @Test
    public void testInstance_notNull() {
        Assert.assertNotNull(BeanSerializerFactory.instance);
        Assert.assertTrue(BeanSerializerFactory.instance instanceof Serializable);
    }

    @Test
    public void testWithConfig_sameConfig_returnsSameInstance() {
        SerializerFactoryConfig config = factory.getFactoryConfig();
        SerializerFactory newFactory = factory.withConfig(config);
        Assert.assertSame(factory, newFactory);
    }

    @Test
    public void testWithConfig_differentConfig_returnsNewInstance() {
        SerializerFactoryConfig config = new SerializerFactoryConfig();
        SerializerFactory newFactory = factory.withConfig(config);
        Assert.assertNotNull(newFactory);
        Assert.assertNotSame(factory, newFactory);
        Assert.assertEquals(BeanSerializerFactory.class, newFactory.getClass());
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subtype_throwsIllegalStateException() {
        class CustomSubFactory extends BeanSerializerFactory {
            public CustomSubFactory(SerializerFactoryConfig config) {
                super(config);
            }
        }

        CustomSubFactory subFactory = new CustomSubFactory(new SerializerFactoryConfig());
        subFactory.withConfig(new SerializerFactoryConfig());
    }

    @Test
    public void testCustomSerializers_accessible() {
        SerializerFactoryConfig config = new SerializerFactoryConfig();
        BeanSerializerFactory customFactory = new BeanSerializerFactory(config);
        Assert.assertNotNull(customFactory.customSerializers());
    }

    // ==========================================
    // 2. createSerializer and _createSerializer2 tests
    // ==========================================

    static class CustomAnnotatedClassSerializer extends StdSerializer<AnnotatedCustomClass> {
        public CustomAnnotatedClassSerializer() {
            super(AnnotatedCustomClass.class);
        }
        @Override
        public void serialize(AnnotatedCustomClass value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString("custom_annotated");
        }
    }

    @JsonSerialize(using = CustomAnnotatedClassSerializer.class)
    static class AnnotatedCustomClass {}

    @Test
    public void testCreateSerializer_explicitSerializerAnnotation() throws Exception {
        JavaType type = mapper.constructType(AnnotatedCustomClass.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof CustomAnnotatedClassSerializer);
    }

    public static class StringToHolderConverter extends StdConverter<StringHolder, String> {
        @Override
        public String convert(StringHolder value) {
            return value.text;
        }
    }

    @JsonSerialize(converter = StringToHolderConverter.class)
    static class StringHolder {
        public String text = "hello";
    }

    @Test
    public void testCreateSerializer_withConverter() throws Exception {
        JavaType type = mapper.constructType(StringHolder.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof StdDelegatingSerializer);

        String json = mapper.writeValueAsString(new StringHolder());
        Assert.assertEquals("\"hello\"", json);
    }

    public static class ObjectConverter extends StdConverter<ObjectHolder, Object> {
        @Override
        public Object convert(ObjectHolder value) {
            return value.data;
        }
    }

    @JsonSerialize(converter = ObjectConverter.class)
    static class ObjectHolder {
        public Object data = "plain_data";
    }

    @Test
    public void testCreateSerializer_withConverterReturningObject() throws Exception {
        JavaType type = mapper.constructType(ObjectHolder.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof StdDelegatingSerializer);
    }

    static class BaseType {
        public String a = "base";
    }

    @JsonSerialize(as = BaseType.class)
    static class SubType extends BaseType {
        public String b = "sub";
    }

    @Test
    public void testCreateSerializer_modifiedTypeByAnnotation() throws Exception {
        JavaType type = mapper.constructType(SubType.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);

        String json = mapper.writeValueAsString(new SubType());
        Assert.assertTrue(json.contains("\"a\":\"base\""));
        Assert.assertFalse(json.contains("\"b\""));
    }

    @Test
    public void testCreateSerializer_containerTypes() throws Exception {
        JavaType listType = mapper.constructType(List.class);
        JsonSerializer<Object> serList = factory.createSerializer(serializerProvider, listType);
        Assert.assertNotNull(serList);

        JavaType mapType = mapper.constructType(Map.class);
        JsonSerializer<Object> serMap = factory.createSerializer(serializerProvider, mapType);
        Assert.assertNotNull(serMap);

        JavaType arrayType = mapper.constructType(String[].class);
        JsonSerializer<Object> serArray = factory.createSerializer(serializerProvider, arrayType);
        Assert.assertNotNull(serArray);
    }

    static class CustomPOJO {
        public String name = "test";
    }

    @Test
    public void testCreateSerializer_customSerializersConfig() throws Exception {
        SimpleSerializers simpleSerializers = new SimpleSerializers();
        JsonSerializer<CustomPOJO> customSer = new StdSerializer<CustomPOJO>(CustomPOJO.class) {
            @Override
            public void serialize(CustomPOJO value, JsonGenerator gen, SerializerProvider provider) throws IOException {
                gen.writeString("custom_pojo");
            }
        };
        simpleSerializers.addSerializer(CustomPOJO.class, customSer);

        SerializerFactoryConfig config = new SerializerFactoryConfig().withAdditionalSerializers(simpleSerializers);
        BeanSerializerFactory customFactory = (BeanSerializerFactory) factory.withConfig(config);

        JavaType type = mapper.constructType(CustomPOJO.class);
        JsonSerializer<Object> ser = customFactory.createSerializer(serializerProvider, type);
        Assert.assertSame(customSer, ser);
    }

    static class JsonValueBean {
        @JsonValue
        public String getValue() {
            return "json_value_result";
        }
    }

    @Test
    public void testCreateSerializer_jsonValueAnnotation() throws Exception {
        JavaType type = mapper.constructType(JsonValueBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);

        String json = mapper.writeValueAsString(new JsonValueBean());
        Assert.assertEquals("\"json_value_result\"", json);
    }

    static class ModifierBean {
        public String prop = "mod";
    }

    @Test
    public void testCreateSerializer_withSerializerModifier() throws Exception {
        final boolean[] modifierCalled = new boolean[]{false, false, false, false};

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
        BeanSerializerFactory customFactory = (BeanSerializerFactory) factory.withConfig(config);

        JavaType type = mapper.constructType(ModifierBean.class);
        JsonSerializer<Object> ser = customFactory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);

        Assert.assertTrue(modifierCalled[0]);
        Assert.assertTrue(modifierCalled[1]);
        Assert.assertTrue(modifierCalled[2]);
        Assert.assertTrue(modifierCalled[3]);
    }

    @Test
    public void testCreateSerializer_plainObject() throws Exception {
        JavaType type = mapper.constructType(Object.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
    }

    @JsonRootName("EmptyAnnotated")
    static class EmptyAnnotatedBean {}

    @Test
    public void testCreateSerializer_emptyBeanWithKnownAnnotations() throws Exception {
        JavaType type = mapper.constructType(EmptyAnnotatedBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);
        Assert.assertFalse(ser.isUnwrappingSerializer());
    }

    // ==========================================
    // 3. findBeanSerializer & isPotentialBeanType tests
    // ==========================================

    enum TestEnum { A, B }

    @Test
    public void testFindBeanSerializer_enumType() throws Exception {
        JavaType type = mapper.constructType(TestEnum.class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(type);
        JsonSerializer<Object> ser = factory.findBeanSerializer(serializerProvider, type, desc);
        Assert.assertNotNull(ser);
    }

    @Test
    public void testFindBeanSerializer_primitiveAndArray() throws Exception {
        JavaType intType = mapper.constructType(int.class);
        BeanDescription descInt = mapper.getSerializationConfig().introspect(intType);
        Assert.assertNull(factory.findBeanSerializer(serializerProvider, intType, descInt));

        JavaType arrayType = mapper.constructType(int[].class);
        BeanDescription descArray = mapper.getSerializationConfig().introspect(arrayType);
        Assert.assertNull(factory.findBeanSerializer(serializerProvider, arrayType, descArray));
    }

    @Test
    public void testIsPotentialBeanType() {
        Assert.assertTrue(factory.isPotentialBeanType(CustomPOJO.class));
        Assert.assertFalse(factory.isPotentialBeanType(int.class));
        Assert.assertFalse(factory.isPotentialBeanType(int[].class));
        Assert.assertFalse(factory.isPotentialBeanType(TestEnum.class));
    }

    // ==========================================
    // 4. TypeSerializer methods tests
    // ==========================================

    static class PolymorphicContainer {
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
        public Object polyField = "val";

        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
        public List<String> polyList = Collections.singletonList("item");

        public String nonPolyField = "plain";
    }

    @Test
    public void testFindPropertyTypeSerializer_withAndWithoutTypeInfo() throws Exception {
        JavaType type = mapper.constructType(PolymorphicContainer.class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(type);

        AnnotatedMember polyMember = null;
        AnnotatedMember nonPolyMember = null;
        for (BeanPropertyDefinition prop : desc.findProperties()) {
            if ("polyField".equals(prop.getName())) {
                polyMember = prop.getAccessor();
            } else if ("nonPolyField".equals(prop.getName())) {
                nonPolyMember = prop.getAccessor();
            }
        }

        Assert.assertNotNull(polyMember);
        Assert.assertNotNull(nonPolyMember);

        TypeSerializer polySer = factory.findPropertyTypeSerializer(
                polyMember.getType(desc.bindingsForBeanType()),
                mapper.getSerializationConfig(),
                polyMember
        );
        Assert.assertNotNull(polySer);

        TypeSerializer nonPolySer = factory.findPropertyTypeSerializer(
                nonPolyMember.getType(desc.bindingsForBeanType()),
                mapper.getSerializationConfig(),
                nonPolyMember
        );
        Assert.assertNull(nonPolySer);
    }

    @Test
    public void testFindPropertyContentTypeSerializer_withAndWithoutTypeInfo() throws Exception {
        JavaType type = mapper.constructType(PolymorphicContainer.class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(type);

        AnnotatedMember polyListMember = null;
        for (BeanPropertyDefinition prop : desc.findProperties()) {
            if ("polyList".equals(prop.getName())) {
                polyListMember = prop.getAccessor();
            }
        }

        Assert.assertNotNull(polyListMember);

        TypeSerializer contentTypeSer = factory.findPropertyContentTypeSerializer(
                polyListMember.getType(desc.bindingsForBeanType()),
                mapper.getSerializationConfig(),
                polyListMember
        );
        Assert.assertNotNull(contentTypeSer);
    }

    // ==========================================
    // 5. constructBeanSerializer & helper methods
    // ==========================================

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class PropertyIdBean {
        public int id = 123;
        public String name = "prop_id";
    }

    @Test
    public void testConstructObjectIdHandler_propertyGenerator() throws Exception {
        String json = mapper.writeValueAsString(new PropertyIdBean());
        Assert.assertTrue(json.contains("\"id\":123"));
        Assert.assertTrue(json.contains("\"name\":\"prop_id\""));
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nonExistentId")
    static class InvalidPropertyIdBean {
        public int id = 1;
    }

    @Test(expected = JsonMappingException.class)
    public void testConstructObjectIdHandler_invalidPropertyGenerator_throwsException() throws Exception {
        mapper.writeValueAsString(new InvalidPropertyIdBean());
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class IntSequenceIdBean {
        public String name = "seq_id";
    }

    @Test
    public void testConstructObjectIdHandler_intSequenceGenerator() throws Exception {
        String json = mapper.writeValueAsString(new IntSequenceIdBean());
        Assert.assertTrue(json.contains("\"@id\":1"));
    }

    static class AnyGetterBean {
        private final Map<String, Object> map = new HashMap<String, Object>();

        public AnyGetterBean() {
            map.put("k1", "v1");
            map.put("k2", 42);
        }

        @JsonAnyGetter
        public Map<String, Object> any() {
            return map;
        }
    }

    @Test
    public void testAnyGetter() throws Exception {
        String json = mapper.writeValueAsString(new AnyGetterBean());
        Assert.assertTrue(json.contains("\"k1\":\"v1\""));
        Assert.assertTrue(json.contains("\"k2\":42"));
    }

    static class ViewA {}
    static class ViewB {}

    static class ViewsBean {
        @JsonView(ViewA.class)
        public String viewA = "A";

        @JsonView(ViewB.class)
        public String viewB = "B";

        public String nonView = "all";
    }

    @Test
    public void testProcessViews_defaultInclusionTrue() throws Exception {
        ObjectMapper viewMapper = new ObjectMapper();
        viewMapper.enable(MapperFeature.DEFAULT_VIEW_INCLUSION);

        String json = viewMapper.writerWithView(ViewA.class).writeValueAsString(new ViewsBean());
        Assert.assertTrue(json.contains("\"viewA\":\"A\""));
        Assert.assertFalse(json.contains("\"viewB\":\"B\""));
        Assert.assertTrue(json.contains("\"nonView\":\"all\""));
    }

    @Test
    public void testProcessViews_defaultInclusionFalse() throws Exception {
        ObjectMapper viewMapper = new ObjectMapper();
        viewMapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);

        String json = viewMapper.writerWithView(ViewA.class).writeValueAsString(new ViewsBean());
        Assert.assertTrue(json.contains("\"viewA\":\"A\""));
        Assert.assertFalse(json.contains("\"viewB\":\"B\""));
        Assert.assertFalse(json.contains("\"nonView\":\"all\""));
    }

    @JsonIgnoreProperties({"ignoreMe"})
    static class FilterPropsBean {
        public String keepMe = "kept";
        public String ignoreMe = "ignored";
    }

    @Test
    public void testFilterBeanProperties() throws Exception {
        String json = mapper.writeValueAsString(new FilterPropsBean());
        Assert.assertTrue(json.contains("\"keepMe\":\"kept\""));
        Assert.assertFalse(json.contains("\"ignoreMe\""));
    }

    @JsonIgnoreType
    static class IgnoredClass {
        public String data = "data";
    }

    static class ContainerOfIgnoredType {
        public IgnoredClass ignored = new IgnoredClass();
        public String valid = "valid";
    }

    @Test
    public void testRemoveIgnorableTypes() throws Exception {
        String json = mapper.writeValueAsString(new ContainerOfIgnoredType());
        Assert.assertTrue(json.contains("\"valid\":\"valid\""));
        Assert.assertFalse(json.contains("\"ignored\""));
    }

    static class SetterlessBean {
        public String getReadOnly() {
            return "read_only";
        }
    }

    @Test
    public void testRemoveSetterlessGetters_enabledFeature() throws Exception {
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.enable(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS);
        customMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);

        String json = customMapper.writeValueAsString(new SetterlessBean());
        Assert.assertEquals("{}", json);
    }

    @Test
    public void testRemoveSetterlessGetters_disabledFeature() throws Exception {
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.disable(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS);

        String json = customMapper.writeValueAsString(new SetterlessBean());
        Assert.assertEquals("{\"readOnly\":\"read_only\"}", json);
    }

    static class OverlappingTypeIdsBean {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "extType")
        public Object extProp = "data";

        public String extType = "text";
    }

    @Test
    public void testRemoveOverlappingTypeIds() throws Exception {
        String json = mapper.writeValueAsString(new OverlappingTypeIdsBean());
        Assert.assertNotNull(json);
        Assert.assertTrue(json.contains("\"extProp\":\"data\""));
        Assert.assertTrue(json.contains("\"extType\":\"text\""));
    }

    static class ReferenceParent {
        @JsonManagedReference
        public ReferenceChild child = new ReferenceChild();
        public String name = "parent";
    }

    static class ReferenceChild {
        @JsonBackReference
        public ReferenceParent parent;
        public String childName = "child";
    }

    @Test
    public void testBackReferenceOmitted() throws Exception {
        ReferenceParent parent = new ReferenceParent();
        parent.child.parent = parent;

        String json = mapper.writeValueAsString(parent);
        Assert.assertTrue(json.contains("\"parent\""));
        Assert.assertTrue(json.contains("\"childName\":\"child\""));
        Assert.assertFalse(json.contains("\"child\":{\"parent\""));
    }

    static class TypeIdBean {
        @JsonTypeId
        public String getCustomTypeId() {
            return "customType";
        }

        public String value = "val";
    }

    @Test
    public void testTypeIdPropertyHandling() throws Exception {
        JavaType type = mapper.constructType(TypeIdBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(serializerProvider, type);
        Assert.assertNotNull(ser);

        String json = mapper.writeValueAsString(new TypeIdBean());
        Assert.assertTrue(json.contains("\"value\":\"val\""));
    }

    public static class ResolvableMemberSerializer extends StdSerializer<String> implements ResolvableSerializer {
        private boolean resolved = false;

        public ResolvableMemberSerializer() {
            super(String.class);
        }

        @Override
        public void resolve(SerializerProvider provider) {
            resolved = true;
        }

        @Override
        public void serialize(String value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString(value + (resolved ? ":resolved" : ":unresolved"));
        }
    }

    static class ResolvablePropertyBean {
        @JsonSerialize(using = ResolvableMemberSerializer.class)
        public String prop = "status";
    }

    @Test
    public void testConstructWriter_resolvesResolvableSerializer() throws Exception {
        String json = mapper.writeValueAsString(new ResolvablePropertyBean());
        Assert.assertEquals("{\"prop\":\"status:resolved\"}", json);
    }
}
