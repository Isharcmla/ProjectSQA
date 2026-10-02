package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class PropertyBuilderTest {

    private ObjectMapper _mapper;
    private SerializationConfig _config;
    private SerializerProvider _provider;

    static class BasicBean {
        public String strVal = "default";
        public int intVal = 42;
        public int[] arrayVal = new int[]{1, 2};
        public List<String> listVal = new ArrayList<String>();
        public AtomicReference<String> refVal = new AtomicReference<String>("ref");

        public String getThrowing() {
            throw new IllegalStateException("Simulated getter error");
        }

        public String getCheckedThrowing() throws Exception {
            throw new Exception("Checked exception");
        }

        public String getErrorThrowing() {
            throw new StackOverflowError("Simulated error");
        }
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    static class NonDefaultBean {
        public String name = "hello";
        public int count = 5;
        public int[] nums = new int[]{1};
        public Object obj = null;
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    static class NoDefaultConstructorBean {
        public String field;
        public NoDefaultConstructorBean(String field) {
            this.field = field;
        }
    }

    static class AnnotatedBean {
        @JsonSerialize(as = CharSequence.class)
        public String superTypeProp = "test";

        @JsonSerialize(as = ArrayList.class)
        public List<String> subTypeProp = new ArrayList<String>();

        @JsonSerialize(as = Integer.class)
        public String illegalTypeProp = "test";

        @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
        public Object staticTypingProp = "static";

        @JsonSerialize(typing = JsonSerialize.Typing.DYNAMIC)
        public Object dynamicTypingProp = "dynamic";

        @JsonSerialize(nullsUsing = CustomNullSerializer.class)
        public String customNullProp;

        @JsonUnwrapped
        public BasicBean unwrappedProp;

        @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
        public String useDefaultsProp = "def";

        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public AtomicReference<String> nonAbsentRef;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String nonEmptyProp;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        public String nonNullProp;

        @JsonInclude(JsonInclude.Include.NON_DEFAULT)
        public String nonDefaultProp = "propDef";

        @JsonInclude(JsonInclude.Include.ALWAYS)
        public List<String> alwaysProp = new ArrayList<String>();
    }

    static class CustomNullSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("CUSTOM_NULL");
        }
    }

    @Before
    public void setUp() {
        _mapper = new ObjectMapper();
        _config = _mapper.getSerializationConfig();
        _provider = _mapper.getSerializerProviderInstance();
    }

    private PropertyBuilder createPropertyBuilder(Class<?> cls) {
        JavaType type = _config.constructType(cls);
        BeanDescription desc = _config.introspect(type);
        return new PropertyBuilder(_config, desc);
    }

    private BeanPropertyDefinition findProperty(BeanDescription desc, String name) {
        for (BeanPropertyDefinition prop : desc.findProperties()) {
            if (prop.getName().equals(name)) {
                return prop;
            }
        }
        return null;
    }

    @Test
    public void testGetClassAnnotations_success() {
        PropertyBuilder builder = createPropertyBuilder(BasicBean.class);
        Assert.assertNotNull(builder.getClassAnnotations());
    }

    @Test
    public void testGetDefaultValue_variousTypes() {
        PropertyBuilder builder = createPropertyBuilder(BasicBean.class);

        // Primitive int
        JavaType intType = _config.constructType(int.class);
        Assert.assertEquals(0, builder.getDefaultValue(intType));

        // Primitive boolean
        JavaType boolType = _config.constructType(boolean.class);
        Assert.assertEquals(Boolean.FALSE, builder.getDefaultValue(boolType));

        // Primitive wrapper (Integer)
        JavaType integerType = _config.constructType(Integer.class);
        Assert.assertEquals(0, builder.getDefaultValue(integerType));

        // String
        JavaType stringType = _config.constructType(String.class);
        Assert.assertEquals("", builder.getDefaultValue(stringType));

        // Container (List)
        JavaType listType = _config.constructType(List.class);
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, builder.getDefaultValue(listType));

        // Reference (AtomicReference)
        JavaType refType = _config.constructType(AtomicReference.class);
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, builder.getDefaultValue(refType));

        // Object (Other)
        JavaType objType = _config.constructType(Object.class);
        Assert.assertNull(builder.getDefaultValue(objType));
    }

    @Test
    public void testGetDefaultBean_instantiable() {
        PropertyBuilder builder = createPropertyBuilder(BasicBean.class);
        Object defaultBean1 = builder.getDefaultBean();
        Assert.assertNotNull(defaultBean1);
        Assert.assertTrue(defaultBean1 instanceof BasicBean);

        // Test caching
        Object defaultBean2 = builder.getDefaultBean();
        Assert.assertSame(defaultBean1, defaultBean2);
    }

    @Test
    public void testGetDefaultBean_noDefaultConstructor() {
        PropertyBuilder builder = createPropertyBuilder(NoDefaultConstructorBean.class);
        Object defaultBean1 = builder.getDefaultBean();
        Assert.assertNull(defaultBean1);

        // Test cached marker behavior
        Object defaultBean2 = builder.getDefaultBean();
        Assert.assertNull(defaultBean2);
    }

    @Test
    public void testGetPropertyDefaultValue_successAndFallbacks() {
        PropertyBuilder builder = createPropertyBuilder(BasicBean.class);
        BeanDescription desc = builder._beanDesc;
        BeanPropertyDefinition prop = findProperty(desc, "strVal");
        Assert.assertNotNull(prop);

        Object val = builder.getPropertyDefaultValue("strVal", prop.getPrimaryMember(), prop.getPrimaryType());
        Assert.assertEquals("default", val);

        // When default bean cannot be instantiated
        PropertyBuilder noCtorBuilder = createPropertyBuilder(NoDefaultConstructorBean.class);
        BeanPropertyDefinition noCtorProp = findProperty(noCtorBuilder._beanDesc, "field");
        Assert.assertNotNull(noCtorProp);
        Object fallbackVal = noCtorBuilder.getPropertyDefaultValue("field", noCtorProp.getPrimaryMember(), noCtorProp.getPrimaryType());
        Assert.assertEquals("", fallbackVal);
    }

    @Test
    public void testThrowWrapped_runtimeException() {
        PropertyBuilder builder = createPropertyBuilder(BasicBean.class);
        BeanDescription desc = builder._beanDesc;
        BeanPropertyDefinition prop = findProperty(desc, "throwing");
        Assert.assertNotNull(prop);

        try {
            builder.getPropertyDefaultValue("throwing", prop.getPrimaryMember(), prop.getPrimaryType());
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertEquals("Simulated getter error", e.getMessage());
        }
    }

    @Test
    public void testThrowWrapped_error() {
        PropertyBuilder builder = createPropertyBuilder(BasicBean.class);
        BeanDescription desc = builder._beanDesc;
        BeanPropertyDefinition prop = findProperty(desc, "errorThrowing");
        Assert.assertNotNull(prop);

        try {
            builder.getPropertyDefaultValue("errorThrowing", prop.getPrimaryMember(), prop.getPrimaryType());
            Assert.fail("Expected StackOverflowError");
        } catch (StackOverflowError e) {
            Assert.assertEquals("Simulated error", e.getMessage());
        }
    }

    @Test
    public void testThrowWrapped_checkedExceptionDirectCall() {
        PropertyBuilder builder = createPropertyBuilder(BasicBean.class);
        Exception cause = new Exception("Root checked exception");
        Exception wrapper = new Exception("Wrapped", cause);

        try {
            builder._throwWrapped(wrapper, "testProp", new BasicBean());
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to get property 'testProp'"));
        }
    }

    @Test
    public void testFindSerializationType_superTypeRefinement() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(AnnotatedBean.class);
        BeanPropertyDefinition prop = findProperty(builder._beanDesc, "superTypeProp");
        Assert.assertNotNull(prop);

        JavaType type = builder.findSerializationType(prop.getPrimaryMember(), false, prop.getPrimaryType());
        Assert.assertNotNull(type);
        Assert.assertEquals(CharSequence.class, type.getRawClass());
        Assert.assertTrue(type.useStaticTyping());
    }

    @Test
    public void testFindSerializationType_subTypeRefinement() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(AnnotatedBean.class);
        BeanPropertyDefinition prop = findProperty(builder._beanDesc, "subTypeProp");
        Assert.assertNotNull(prop);

        JavaType type = builder.findSerializationType(prop.getPrimaryMember(), false, prop.getPrimaryType());
        Assert.assertNotNull(type);
        Assert.assertEquals(ArrayList.class, type.getRawClass());
        Assert.assertTrue(type.useStaticTyping());
    }

    @Test
    public void testFindSerializationType_illegalTypeRefinement() {
        PropertyBuilder builder = createPropertyBuilder(AnnotatedBean.class);
        BeanPropertyDefinition prop = findProperty(builder._beanDesc, "illegalTypeProp");
        Assert.assertNotNull(prop);

        try {
            builder.findSerializationType(prop.getPrimaryMember(), false, prop.getPrimaryType());
            Assert.fail("Expected IllegalArgumentException");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
            Assert.assertTrue(e.getMessage().contains("Illegal concrete-type annotation"));
        }
    }

    @Test
    public void testFindSerializationType_staticAndDynamicTypingAnnotation() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(AnnotatedBean.class);

        BeanPropertyDefinition staticProp = findProperty(builder._beanDesc, "staticTypingProp");
        JavaType staticType = builder.findSerializationType(staticProp.getPrimaryMember(), false, staticProp.getPrimaryType());
        Assert.assertNotNull(staticType);
        Assert.assertTrue(staticType.useStaticTyping());

        BeanPropertyDefinition dynamicProp = findProperty(builder._beanDesc, "dynamicTypingProp");
        JavaType dynamicType = builder.findSerializationType(dynamicProp.getPrimaryMember(), true, dynamicProp.getPrimaryType());
        Assert.assertNull(dynamicType);

        // When useStaticTyping default is true and no annotation overrides it
        BeanPropertyDefinition superProp = findProperty(builder._beanDesc, "unwrappedProp");
        JavaType defaultStaticType = builder.findSerializationType(superProp.getPrimaryMember(), true, superProp.getPrimaryType());
        Assert.assertNotNull(defaultStaticType);
        Assert.assertTrue(defaultStaticType.useStaticTyping());
    }

    @Test
    public void testBuildWriter_nonDefaultInclusion_classLevel() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(NonDefaultBean.class);

        BeanPropertyDefinition nameProp = findProperty(builder._beanDesc, "name");
        BeanPropertyWriter nameWriter = builder.buildWriter(_provider, nameProp, nameProp.getPrimaryType(),
                null, null, null, nameProp.getPrimaryMember(), false);
        Assert.assertNotNull(nameWriter);

        BeanPropertyDefinition numsProp = findProperty(builder._beanDesc, "nums");
        BeanPropertyWriter numsWriter = builder.buildWriter(_provider, numsProp, numsProp.getPrimaryType(),
                null, null, null, numsProp.getPrimaryMember(), false);
        Assert.assertNotNull(numsWriter);

        BeanPropertyDefinition objProp = findProperty(builder._beanDesc, "obj");
        BeanPropertyWriter objWriter = builder.buildWriter(_provider, objProp, objProp.getPrimaryType(),
                null, null, null, objProp.getPrimaryMember(), false);
        Assert.assertNotNull(objWriter);
    }

    @Test
    public void testBuildWriter_nonDefaultInclusion_propertyLevel() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(AnnotatedBean.class);
        BeanPropertyDefinition prop = findProperty(builder._beanDesc, "nonDefaultProp");
        BeanPropertyWriter writer = builder.buildWriter(_provider, prop, prop.getPrimaryType(),
                null, null, null, prop.getPrimaryMember(), false);
        Assert.assertNotNull(writer);
    }

    @Test
    public void testBuildWriter_nonAbsentInclusion() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(AnnotatedBean.class);
        BeanPropertyDefinition prop = findProperty(builder._beanDesc, "nonAbsentRef");
        BeanPropertyWriter writer = builder.buildWriter(_provider, prop, prop.getPrimaryType(),
                null, null, null, prop.getPrimaryMember(), false);
        Assert.assertNotNull(writer);
        Assert.assertTrue(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriter_nonEmptyInclusion() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(AnnotatedBean.class);
        BeanPropertyDefinition prop = findProperty(builder._beanDesc, "nonEmptyProp");
        BeanPropertyWriter writer = builder.buildWriter(_provider, prop, prop.getPrimaryType(),
                null, null, null, prop.getPrimaryMember(), false);
        Assert.assertNotNull(writer);
        Assert.assertTrue(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriter_nonNullInclusion() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(AnnotatedBean.class);
        BeanPropertyDefinition prop = findProperty(builder._beanDesc, "nonNullProp");
        BeanPropertyWriter writer = builder.buildWriter(_provider, prop, prop.getPrimaryType(),
                null, null, null, prop.getPrimaryMember(), false);
        Assert.assertNotNull(writer);
        Assert.assertTrue(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriter_useDefaultsInclusion() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(AnnotatedBean.class);
        BeanPropertyDefinition prop = findProperty(builder._beanDesc, "useDefaultsProp");
        BeanPropertyWriter writer = builder.buildWriter(_provider, prop, prop.getPrimaryType(),
                null, null, null, prop.getPrimaryMember(), false);
        Assert.assertNotNull(writer);
    }

    @Test
    public void testBuildWriter_writeEmptyJsonArrays_disabledAndEnabled() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(AnnotatedBean.class);
        BeanPropertyDefinition prop = findProperty(builder._beanDesc, "alwaysProp");

        // Feature disabled
        SerializationConfig configWithoutEmptyArrays = _config.without(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        PropertyBuilder builderNoArrays = new PropertyBuilder(configWithoutEmptyArrays, builder._beanDesc);
        BeanPropertyWriter writer1 = builderNoArrays.buildWriter(_provider, prop, prop.getPrimaryType(),
                null, null, null, prop.getPrimaryMember(), false);
        Assert.assertNotNull(writer1);

        // Feature enabled
        SerializationConfig configWithEmptyArrays = _config.with(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        PropertyBuilder builderWithArrays = new PropertyBuilder(configWithEmptyArrays, builder._beanDesc);
        BeanPropertyWriter writer2 = builderWithArrays.buildWriter(_provider, prop, prop.getPrimaryType(),
                null, null, null, prop.getPrimaryMember(), false);
        Assert.assertNotNull(writer2);
    }

    @Test
    public void testBuildWriter_customNullSerializerAndUnwrapped() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(AnnotatedBean.class);

        // Custom null serializer
        BeanPropertyDefinition nullProp = findProperty(builder._beanDesc, "customNullProp");
        BeanPropertyWriter nullWriter = builder.buildWriter(_provider, nullProp, nullProp.getPrimaryType(),
                null, null, null, nullProp.getPrimaryMember(), false);
        Assert.assertNotNull(nullWriter);

        // Unwrapped writer
        BeanPropertyDefinition unwrappedProp = findProperty(builder._beanDesc, "unwrappedProp");
        BeanPropertyWriter unwrappedWriter = builder.buildWriter(_provider, unwrappedProp, unwrappedProp.getPrimaryType(),
                null, null, null, unwrappedProp.getPrimaryMember(), false);
        Assert.assertNotNull(unwrappedWriter);
        Assert.assertTrue(unwrappedWriter.isUnwrapping());
    }

    @Test
    public void testBuildWriter_withContentTypeSerializer_validContainer() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(BasicBean.class);
        BeanPropertyDefinition prop = findProperty(builder._beanDesc, "listVal");

        TypeSerializer mockTypeSer = _config.getDefaultTyper(TypeFactory.defaultInstance().constructType(String.class))
                .buildTypeSerializer(_config, TypeFactory.defaultInstance().constructType(String.class), Collections.<com.fasterxml.jackson.databind.jsontype.NamedType>emptyList());

        BeanPropertyWriter writer = builder.buildWriter(_provider, prop, prop.getPrimaryType(),
                null, null, mockTypeSer, prop.getPrimaryMember(), false);
        Assert.assertNotNull(writer);
    }

    @Test
    public void testBuildWriter_withContentTypeSerializer_invalidNonContainer() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(BasicBean.class);
        BeanPropertyDefinition prop = findProperty(builder._beanDesc, "strVal");

        TypeSerializer mockTypeSer = _config.getDefaultTyper(TypeFactory.defaultInstance().constructType(String.class))
                .buildTypeSerializer(_config, TypeFactory.defaultInstance().constructType(String.class), Collections.<com.fasterxml.jackson.databind.jsontype.NamedType>emptyList());

        try {
            builder.buildWriter(_provider, prop, prop.getPrimaryType(),
                    null, null, mockTypeSer, prop.getPrimaryMember(), false);
            Assert.fail("Expected IllegalStateException because String is not a container type");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("has no content"));
        }
    }
}
