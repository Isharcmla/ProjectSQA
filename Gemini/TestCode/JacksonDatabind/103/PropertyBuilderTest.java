package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class PropertyBuilderTest {

    private ObjectMapper _mapper;
    private SerializationConfig _config;

    @Before
    public void setUp() {
        _mapper = new ObjectMapper();
        _config = _mapper.getSerializationConfig();
    }

    // --- Helper classes for testing scenarios ---

    static class SimpleBean {
        public String name = "defaultName";
        public int age = 10;
        public int[] numbers = new int[]{1, 2, 3};
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    static class NonDefaultBean {
        public String field1 = "def";
        public int field2 = 42;
        public int[] arrayField = new int[]{1};
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    static class NoDefaultConstructorBean {
        public String field;
        public NoDefaultConstructorBean(String field) {
            this.field = field;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    static class ThrowingGetterBean {
        public String getFailing() {
            throw new RuntimeException("Simulated failure in getter");
        }
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    static class ThrowingCheckedExceptionBean {
        public String getFailing() throws Exception {
            throw new Exception("Simulated checked failure");
        }
    }

    static class ViewA {}
    static class ViewB {}

    static class VariousInclusionsBean {
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public Optional<String> optField = Optional.empty();

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public List<String> emptyList = Collections.emptyList();

        @JsonInclude(JsonInclude.Include.NON_NULL)
        public String nonNullField = null;

        @JsonInclude(JsonInclude.Include.ALWAYS)
        public List<String> alwaysList = Collections.emptyList();

        @JsonInclude(value = JsonInclude.Include.CUSTOM, valueFilter = CustomFilter.class)
        public String customField = "filterMe";

        @JsonInclude(value = JsonInclude.Include.CUSTOM, valueFilter = NullFilter.class)
        public String customNullFilterField = "filterNull";

        @JsonView(ViewA.class)
        public String viewedField = "viewA";

        @JsonSerialize(nullsUsing = CustomNullSerializer.class)
        public String customNullSer = null;

        @JsonUnwrapped
        public UnwrappedChild unwrapped = new UnwrappedChild();
    }

    static class CustomFilter {
        @Override
        public boolean equals(Object obj) {
            return "filterMe".equals(obj);
        }
    }

    static class NullFilter {
        // No equals override that handles filter, will be instantiated by provider
    }

    static class CustomNullSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator gen,
                              com.fasterxml.jackson.databind.SerializerProvider serializers) throws IOException {
            gen.writeString("CUSTOM_NULL");
        }
    }

    static class UnwrappedChild {
        public String childProp = "child";
    }

    static class StaticTypingBean {
        @JsonSerialize(as = CharSequence.class, typing = JsonSerialize.Typing.STATIC)
        public String staticTyped = "test";

        @JsonSerialize(typing = JsonSerialize.Typing.DEFAULT_TYPING)
        public String defaultTyping = "def";

        @JsonSerialize(as = Integer.class)
        public String invalidType = "invalid";
    }

    static class PolymorphicContainerBean {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
        public List<SimpleBean> items;
    }

    // Subclass of PropertyBuilder to access protected methods directly
    static class TestablePropertyBuilder extends PropertyBuilder {
        public TestablePropertyBuilder(SerializationConfig config, BeanDescription beanDesc) {
            super(config, beanDesc);
        }

        @Override
        public BeanPropertyWriter buildWriter(com.fasterxml.jackson.databind.SerializerProvider prov,
                                              BeanPropertyDefinition propDef, JavaType declaredType, JsonSerializer<?> ser,
                                              TypeSerializer typeSer, TypeSerializer contentTypeSer,
                                              AnnotatedMember am, boolean defaultUseStaticTyping)
                throws JsonMappingException {
            return super.buildWriter(prov, propDef, declaredType, ser, typeSer, contentTypeSer, am, defaultUseStaticTyping);
        }

        @Override
        public JavaType findSerializationType(Annotated a, boolean useStaticTyping, JavaType declaredType)
                throws JsonMappingException {
            return super.findSerializationType(a, useStaticTyping, declaredType);
        }

        @Override
        public Object getDefaultBean() {
            return super.getDefaultBean();
        }

        @Override
        public Object getPropertyDefaultValue(String name, AnnotatedMember member, JavaType type) {
            return super.getPropertyDefaultValue(name, member, type);
        }

        @Override
        public Object getDefaultValue(JavaType type) {
            return super.getDefaultValue(type);
        }

        @Override
        public Object _throwWrapped(Exception e, String propName, Object defaultBean) {
            return super._throwWrapped(e, propName, defaultBean);
        }
    }

    private TestablePropertyBuilder createPropertyBuilder(Class<?> cls) {
        JavaType javaType = _mapper.constructType(cls);
        BeanDescription beanDesc = _config.introspect(javaType);
        return new TestablePropertyBuilder(_config, beanDesc);
    }

    private TestablePropertyBuilder createPropertyBuilder(SerializationConfig config, Class<?> cls) {
        JavaType javaType = _mapper.constructType(cls);
        BeanDescription beanDesc = config.introspect(javaType);
        return new TestablePropertyBuilder(config, beanDesc);
    }

    private BeanPropertyDefinition findPropDef(BeanDescription beanDesc, String propName) {
        for (BeanPropertyDefinition prop : beanDesc.findProperties()) {
            if (prop.getName().equals(propName)) {
                return prop;
            }
        }
        return null;
    }

    // --- Tests ---

    @Test
    public void testGetClassAnnotations_simpleBean_returnsNonNull() {
        TestablePropertyBuilder builder = createPropertyBuilder(SimpleBean.class);
        Annotations annotations = builder.getClassAnnotations();
        Assert.assertNotNull(annotations);
    }

    @Test
    public void testBuildWriter_standardProperties_createsWriters() throws Exception {
        TestablePropertyBuilder builder = createPropertyBuilder(SimpleBean.class);
        DefaultSerializerProviderImpl prov = new DefaultSerializerProviderImpl.Impl();
        prov = (DefaultSerializerProviderImpl) prov.createInstance(_config, _mapper.getSerializerFactory());

        BeanDescription beanDesc = _config.introspect(_mapper.constructType(SimpleBean.class));
        for (BeanPropertyDefinition propDef : beanDesc.findProperties()) {
            AnnotatedMember am = propDef.getAccessor();
            JavaType type = am.getType();
            BeanPropertyWriter bpw = builder.buildWriter(prov, propDef, type, null, null, null, am, false);
            Assert.assertNotNull(bpw);
            Assert.assertEquals(propDef.getName(), bpw.getName());
        }
    }

    @Test
    public void testBuildWriter_nonDefaultInclusionWithRealDefaults_success() throws Exception {
        TestablePropertyBuilder builder = createPropertyBuilder(NonDefaultBean.class);
        DefaultSerializerProviderImpl prov = new DefaultSerializerProviderImpl.Impl();
        prov = (DefaultSerializerProviderImpl) prov.createInstance(_config, _mapper.getSerializerFactory());

        BeanDescription beanDesc = _config.introspect(_mapper.constructType(NonDefaultBean.class));

        BeanPropertyDefinition propDefStr = findPropDef(beanDesc, "field1");
        BeanPropertyWriter bpwStr = builder.buildWriter(prov, propDefStr, propDefStr.getAccessor().getType(),
                null, null, null, propDefStr.getAccessor(), false);
        Assert.assertNotNull(bpwStr);

        BeanPropertyDefinition propDefArray = findPropDef(beanDesc, "arrayField");
        BeanPropertyWriter bpwArray = builder.buildWriter(prov, propDefArray, propDefArray.getAccessor().getType(),
                null, null, null, propDefArray.getAccessor(), false);
        Assert.assertNotNull(bpwArray);
    }

    @Test
    public void testBuildWriter_nonDefaultInclusionNoDefaultConstructor_fallbackHandled() throws Exception {
        TestablePropertyBuilder builder = createPropertyBuilder(NoDefaultConstructorBean.class);
        DefaultSerializerProviderImpl prov = new DefaultSerializerProviderImpl.Impl();
        prov = (DefaultSerializerProviderImpl) prov.createInstance(_config, _mapper.getSerializerFactory());

        BeanDescription beanDesc = _config.introspect(_mapper.constructType(NoDefaultConstructorBean.class));
        BeanPropertyDefinition propDef = findPropDef(beanDesc, "field");
        BeanPropertyWriter bpw = builder.buildWriter(prov, propDef, propDef.getAccessor().getType(),
                null, null, null, propDef.getAccessor(), false);
        Assert.assertNotNull(bpw);
    }

    @Test(expected = RuntimeException.class)
    public void testBuildWriter_throwingGetterInNonDefault_throwsException() throws Exception {
        TestablePropertyBuilder builder = createPropertyBuilder(ThrowingGetterBean.class);
        DefaultSerializerProviderImpl prov = new DefaultSerializerProviderImpl.Impl();
        prov = (DefaultSerializerProviderImpl) prov.createInstance(_config, _mapper.getSerializerFactory());

        BeanDescription beanDesc = _config.introspect(_mapper.constructType(ThrowingGetterBean.class));
        BeanPropertyDefinition propDef = findPropDef(beanDesc, "failing");
        builder.buildWriter(prov, propDef, propDef.getAccessor().getType(),
                null, null, null, propDef.getAccessor(), false);
    }

    @Test
    public void testBuildWriter_variousInclusions_handledProperly() throws Exception {
        TestablePropertyBuilder builder = createPropertyBuilder(VariousInclusionsBean.class);
        DefaultSerializerProviderImpl prov = new DefaultSerializerProviderImpl.Impl();
        prov = (DefaultSerializerProviderImpl) prov.createInstance(_config, _mapper.getSerializerFactory());

        BeanDescription beanDesc = _config.introspect(_mapper.constructType(VariousInclusionsBean.class));

        // NON_ABSENT
        BeanPropertyDefinition propDefOpt = findPropDef(beanDesc, "optField");
        BeanPropertyWriter bpwOpt = builder.buildWriter(prov, propDefOpt, propDefOpt.getAccessor().getType(),
                null, null, null, propDefOpt.getAccessor(), false);
        Assert.assertNotNull(bpwOpt);

        // NON_EMPTY
        BeanPropertyDefinition propDefEmpty = findPropDef(beanDesc, "emptyList");
        BeanPropertyWriter bpwEmpty = builder.buildWriter(prov, propDefEmpty, propDefEmpty.getAccessor().getType(),
                null, null, null, propDefEmpty.getAccessor(), false);
        Assert.assertNotNull(bpwEmpty);

        // NON_NULL
        BeanPropertyDefinition propDefNonNull = findPropDef(beanDesc, "nonNullField");
        BeanPropertyWriter bpwNonNull = builder.buildWriter(prov, propDefNonNull, propDefNonNull.getAccessor().getType(),
                null, null, null, propDefNonNull.getAccessor(), false);
        Assert.assertNotNull(bpwNonNull);

        // ALWAYS with WRITE_EMPTY_JSON_ARRAYS disabled
        SerializationConfig configWithoutEmptyArrays = _config.without(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        TestablePropertyBuilder builderWithoutArrays = createPropertyBuilder(configWithoutEmptyArrays, VariousInclusionsBean.class);
        DefaultSerializerProviderImpl provWithoutArrays = (DefaultSerializerProviderImpl) new DefaultSerializerProviderImpl.Impl()
                .createInstance(configWithoutEmptyArrays, _mapper.getSerializerFactory());
        BeanPropertyWriter bpwAlways = builderWithoutArrays.buildWriter(provWithoutArrays, propDefEmpty, propDefEmpty.getAccessor().getType(),
                null, null, null, propDefEmpty.getAccessor(), false);
        Assert.assertNotNull(bpwAlways);

        // CUSTOM filter
        BeanPropertyDefinition propDefCustom = findPropDef(beanDesc, "customField");
        BeanPropertyWriter bpwCustom = builder.buildWriter(prov, propDefCustom, propDefCustom.getAccessor().getType(),
                null, null, null, propDefCustom.getAccessor(), false);
        Assert.assertNotNull(bpwCustom);

        // Views
        BeanPropertyDefinition propDefViewed = findPropDef(beanDesc, "viewedField");
        BeanPropertyWriter bpwViewed = builder.buildWriter(prov, propDefViewed, propDefViewed.getAccessor().getType(),
                null, null, null, propDefViewed.getAccessor(), false);
        Assert.assertNotNull(bpwViewed);

        // Custom Null Serializer
        BeanPropertyDefinition propDefNullSer = findPropDef(beanDesc, "customNullSer");
        BeanPropertyWriter bpwNullSer = builder.buildWriter(prov, propDefNullSer, propDefNullSer.getAccessor().getType(),
                null, null, null, propDefNullSer.getAccessor(), false);
        Assert.assertNotNull(bpwNullSer);

        // Unwrapped
        BeanPropertyDefinition propDefUnwrapped = findPropDef(beanDesc, "unwrapped");
        BeanPropertyWriter bpwUnwrapped = builder.buildWriter(prov, propDefUnwrapped, propDefUnwrapped.getAccessor().getType(),
                null, null, null, propDefUnwrapped.getAccessor(), false);
        Assert.assertNotNull(bpwUnwrapped);
        Assert.assertTrue(bpwUnwrapped.isUnwrapping());
    }

    @Test
    public void testBuildWriter_withContentTypeSerializer_success() throws Exception {
        TestablePropertyBuilder builder = createPropertyBuilder(PolymorphicContainerBean.class);
        DefaultSerializerProviderImpl prov = new DefaultSerializerProviderImpl.Impl();
        prov = (DefaultSerializerProviderImpl) prov.createInstance(_config, _mapper.getSerializerFactory());

        BeanDescription beanDesc = _config.introspect(_mapper.constructType(PolymorphicContainerBean.class));
        BeanPropertyDefinition propDef = findPropDef(beanDesc, "items");

        JavaType declaredType = propDef.getAccessor().getType();
        TypeSerializer contentTypeSer = _config.getDefaultTyper(declaredType.getContentType())
                .buildTypeSerializer(_config, declaredType.getContentType(), Collections.emptyList());

        BeanPropertyWriter bpw = builder.buildWriter(prov, propDef, declaredType, null, null, contentTypeSer,
                propDef.getAccessor(), true);
        Assert.assertNotNull(bpw);
    }

    @Test(expected = JsonMappingException.class)
    public void testBuildWriter_withContentTypeSerializerOnNonContainerType_reportsBadPropertyDefinition() throws Exception {
        TestablePropertyBuilder builder = createPropertyBuilder(SimpleBean.class);
        DefaultSerializerProviderImpl prov = new DefaultSerializerProviderImpl.Impl();
        prov = (DefaultSerializerProviderImpl) prov.createInstance(_config, _mapper.getSerializerFactory());

        BeanDescription beanDesc = _config.introspect(_mapper.constructType(SimpleBean.class));
        BeanPropertyDefinition propDef = findPropDef(beanDesc, "name");

        JavaType declaredType = propDef.getAccessor().getType();
        JavaType dummyType = _mapper.constructType(SimpleBean.class);
        TypeSerializer contentTypeSer = _config.getDefaultTyper(dummyType)
                .buildTypeSerializer(_config, dummyType, Collections.emptyList());

        builder.buildWriter(prov, propDef, declaredType, null, null, contentTypeSer, propDef.getAccessor(), true);
    }

    @Test(expected = JsonMappingException.class)
    public void testBuildWriter_nullAccessor_reportsBadPropertyDefinition() throws Exception {
        TestablePropertyBuilder builder = createPropertyBuilder(SimpleBean.class);
        DefaultSerializerProviderImpl prov = new DefaultSerializerProviderImpl.Impl();
        prov = (DefaultSerializerProviderImpl) prov.createInstance(_config, _mapper.getSerializerFactory());

        BeanPropertyDefinition dummyDef = new BeanPropertyDefinition() {
            @Override
            public com.fasterxml.jackson.databind.PropertyName getFullName() {
                return new com.fasterxml.jackson.databind.PropertyName("dummy");
            }

            @Override
            public String getName() {
                return "dummy";
            }

            @Override
            public com.fasterxml.jackson.databind.PropertyName getWrapperName() {
                return null;
            }

            @Override
            public com.fasterxml.jackson.databind.PropertyMetadata getMetadata() {
                return com.fasterxml.jackson.databind.PropertyMetadata.STD_REQUIRED;
            }

            @Override
            public AnnotatedMember getAccessor() {
                return null; // Force null accessor
            }

            @Override
            public AnnotatedMember getPrimaryMember() {
                return null;
            }

            @Override
            public AnnotatedMember getMutator() {
                return null;
            }

            @Override
            public boolean hasGetter() {
                return false;
            }

            @Override
            public boolean hasSetter() {
                return false;
            }

            @Override
            public boolean hasField() {
                return false;
            }

            @Override
            public boolean hasConstructorParameter() {
                return false;
            }
        };

        builder.buildWriter(prov, dummyDef, _mapper.constructType(String.class), null, null, null, null, false);
    }

    @Test
    public void testFindSerializationType_staticTypingAndRefinement() throws Exception {
        TestablePropertyBuilder builder = createPropertyBuilder(StaticTypingBean.class);
        BeanDescription beanDesc = _config.introspect(_mapper.constructType(StaticTypingBean.class));

        // Static typing with supertype refinement
        BeanPropertyDefinition propDefStatic = findPropDef(beanDesc, "staticTyped");
        JavaType staticType = builder.findSerializationType(propDefStatic.getAccessor(), false, propDefStatic.getAccessor().getType());
        Assert.assertNotNull(staticType);
        Assert.assertEquals(CharSequence.class, staticType.getRawClass());
        Assert.assertTrue(staticType.useStaticTyping());

        // Default typing setting
        BeanPropertyDefinition propDefDef = findPropDef(beanDesc, "defaultTyping");
        JavaType defType = builder.findSerializationType(propDefDef.getAccessor(), false, propDefDef.getAccessor().getType());
        Assert.assertNull(defType); // Not static typing
    }

    @Test(expected = JsonMappingException.class)
    public void testFindSerializationType_incompatibleTypeOverride_throwsException() throws Exception {
        TestablePropertyBuilder builder = createPropertyBuilder(StaticTypingBean.class);
        DefaultSerializerProviderImpl prov = new DefaultSerializerProviderImpl.Impl();
        prov = (DefaultSerializerProviderImpl) prov.createInstance(_config, _mapper.getSerializerFactory());

        BeanDescription beanDesc = _config.introspect(_mapper.constructType(StaticTypingBean.class));
        BeanPropertyDefinition propDefInvalid = findPropDef(beanDesc, "invalidType");

        // Should trigger bad definition when building writer
        builder.buildWriter(prov, propDefInvalid, propDefInvalid.getAccessor().getType(), null, null, null,
                propDefInvalid.getAccessor(), false);
    }

    @Test
    public void testGetDefaultBean_normalAndCaching() {
        TestablePropertyBuilder builder = createPropertyBuilder(SimpleBean.class);
        Object defaultBean1 = builder.getDefaultBean();
        Assert.assertNotNull(defaultBean1);
        Assert.assertTrue(defaultBean1 instanceof SimpleBean);

        // Verify caching returns same instance
        Object defaultBean2 = builder.getDefaultBean();
        Assert.assertSame(defaultBean1, defaultBean2);
    }

    @Test
    public void testGetDefaultBean_noDefaultConstructor_returnsNull() {
        TestablePropertyBuilder builder = createPropertyBuilder(NoDefaultConstructorBean.class);
        Object defaultBean = builder.getDefaultBean();
        Assert.assertNull(defaultBean);
    }

    @Test
    public void testGetPropertyDefaultValue_deprecatedMethod() {
        TestablePropertyBuilder builder = createPropertyBuilder(SimpleBean.class);
        BeanDescription beanDesc = _config.introspect(_mapper.constructType(SimpleBean.class));
        BeanPropertyDefinition propDef = findPropDef(beanDesc, "name");

        Object val = builder.getPropertyDefaultValue("name", propDef.getAccessor(), propDef.getAccessor().getType());
        Assert.assertEquals("defaultName", val);
    }

    @Test
    public void testGetPropertyDefaultValue_noDefaultBean_returnsDefaultTypeValue() {
        TestablePropertyBuilder builder = createPropertyBuilder(NoDefaultConstructorBean.class);
        BeanDescription beanDesc = _config.introspect(_mapper.constructType(NoDefaultConstructorBean.class));
        BeanPropertyDefinition propDef = findPropDef(beanDesc, "field");

        Object val = builder.getPropertyDefaultValue("field", propDef.getAccessor(), propDef.getAccessor().getType());
        Assert.assertNull(val);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertyDefaultValue_throwingCheckedException_wrappedInIllegalArgumentException() {
        TestablePropertyBuilder builder = createPropertyBuilder(ThrowingCheckedExceptionBean.class);
        BeanDescription beanDesc = _config.introspect(_mapper.constructType(ThrowingCheckedExceptionBean.class));
        BeanPropertyDefinition propDef = findPropDef(beanDesc, "failing");

        builder.getPropertyDefaultValue("failing", propDef.getAccessor(), propDef.getAccessor().getType());
    }

    @Test
    public void testGetDefaultValue_deprecatedMethod() {
        TestablePropertyBuilder builder = createPropertyBuilder(SimpleBean.class);
        Object intDefault = builder.getDefaultValue(_mapper.constructType(int.class));
        Assert.assertEquals(0, intDefault);

        Object booleanDefault = builder.getDefaultValue(_mapper.constructType(boolean.class));
        Assert.assertEquals(false, booleanDefault);

        Object objDefault = builder.getDefaultValue(_mapper.constructType(String.class));
        Assert.assertNull(objDefault);
    }

    @Test
    public void testThrowWrapped_runtimeException_rethrowsDirectly() {
        TestablePropertyBuilder builder = createPropertyBuilder(SimpleBean.class);
        IllegalStateException ise = new IllegalStateException("Test exception");
        try {
            builder._throwWrapped(ise, "testProp", new SimpleBean());
            Assert.fail("Should have thrown exception");
        } catch (IllegalStateException e) {
            Assert.assertEquals("Test exception", e.getMessage());
        }
    }

    @Test
    public void testThrowWrapped_checkedException_throwsIllegalArgumentException() {
        TestablePropertyBuilder builder = createPropertyBuilder(SimpleBean.class);
        Exception checked = new Exception("Checked root cause");
        try {
            builder._throwWrapped(checked, "testProp", new SimpleBean());
            Assert.fail("Should have thrown exception");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to get property 'testProp'"));
        }
    }
}
