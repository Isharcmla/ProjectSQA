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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class PropertyBuilderTest {

    private ObjectMapper mapper;
    private SerializationConfig config;
    private DefaultSerializerProvider.Impl serializerProvider;

    public static class SimpleBean {
        public String name = "defaultName";
        public int count = 42;
        public int[] array = new int[]{1, 2};
        public List<String> list = new ArrayList<String>();
        public AtomicReference<String> ref = new AtomicReference<String>("val");
        public String unwrapMe;

        public String getThrowing() {
            throw new IllegalStateException("Simulated getter error");
        }

        public String getCheckedThrowing() throws Exception {
            throw new Exception("Simulated checked exception");
        }

        public String getErrorThrowing() {
            throw new AssertionError("Simulated assertion error");
        }
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class NonDefaultBean {
        public String text = "abc";
        public int number = 10;
        public int[] numbers = new int[]{1, 2, 3};
        public Object obj = null;

        public NonDefaultBean() {}
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class NoDefaultConstructorBean {
        public String val;

        public NoDefaultConstructorBean(String val) {
            this.val = val;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public static class NonAbsentBean {
        public AtomicReference<String> ref;
        public String normal;
    }

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public static class NonEmptyBean {
        public List<String> items = new ArrayList<String>();
        public String str = "";
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class NonNullBean {
        public String value;
    }

    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    public static class UseDefaultsBean {
        public String value;
        public List<String> emptyList = new ArrayList<String>();
    }

    public static class CustomNullSer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("CUSTOM_NULL");
        }
    }

    public static class AnnotatedBean {
        @JsonSerialize(nullsUsing = CustomNullSer.class)
        public String nullAnnotated;

        @JsonUnwrapped
        public SimpleBean unwrapped;

        @JsonSerialize(as = CharSequence.class)
        public String superTypeProp;

        @JsonSerialize(as = String.class)
        public Object subTypeProp;

        @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
        public Object staticTypedProp;

        @JsonSerialize(typing = JsonSerialize.Typing.DYNAMIC)
        public Object dynamicTypedProp;

        @JsonSerialize(as = Integer.class)
        public String invalidTypeProp;
    }

    static class SubPropertyBuilder extends PropertyBuilder {
        public SubPropertyBuilder(SerializationConfig config, BeanDescription beanDesc) {
            super(config, beanDesc);
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
        public JavaType findSerializationType(Annotated a, boolean useStaticTyping, JavaType declaredType) throws JsonMappingException {
            return super.findSerializationType(a, useStaticTyping, declaredType);
        }

        @Override
        public Object _throwWrapped(Exception e, String propName, Object defaultBean) {
            return super._throwWrapped(e, propName, defaultBean);
        }

        @Override
        public BeanPropertyWriter buildWriter(SerializerProvider prov,
                BeanPropertyDefinition propDef, JavaType declaredType, JsonSerializer<?> ser,
                TypeSerializer typeSer, TypeSerializer contentTypeSer,
                AnnotatedMember am, boolean defaultUseStaticTyping) throws JsonMappingException {
            return super.buildWriter(prov, propDef, declaredType, ser, typeSer, contentTypeSer, am, defaultUseStaticTyping);
        }
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
        serializerProvider = new DefaultSerializerProvider.Impl();
        serializerProvider = (DefaultSerializerProvider.Impl) serializerProvider.createInstance(config, mapper.getSerializerFactory());
    }

    private SubPropertyBuilder createBuilder(Class<?> cls) {
        JavaType type = mapper.constructType(cls);
        BeanDescription beanDesc = config.introspect(type);
        return new SubPropertyBuilder(config, beanDesc);
    }

    private BeanPropertyDefinition findPropDef(BeanDescription beanDesc, String propName) {
        for (BeanPropertyDefinition prop : beanDesc.findProperties()) {
            if (prop.getName().equals(propName)) {
                return prop;
            }
        }
        return null;
    }

    @Test
    public void testGetClassAnnotations_validBean_returnsNonNull() {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);
        Assert.assertNotNull(builder.getClassAnnotations());
    }

    @Test
    public void testGetDefaultValue_variousTypes_returnsExpectedDefaults() {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);

        Assert.assertEquals(0, builder.getDefaultValue(mapper.constructType(int.class)));
        Assert.assertEquals(0, builder.getDefaultValue(mapper.constructType(Integer.class)));
        Assert.assertEquals(false, builder.getDefaultValue(mapper.constructType(boolean.class)));
        Assert.assertEquals((byte) 0, builder.getDefaultValue(mapper.constructType(byte.class)));
        Assert.assertEquals((short) 0, builder.getDefaultValue(mapper.constructType(short.class)));
        Assert.assertEquals(0L, builder.getDefaultValue(mapper.constructType(long.class)));
        Assert.assertEquals(0.0f, builder.getDefaultValue(mapper.constructType(float.class)));
        Assert.assertEquals(0.0d, builder.getDefaultValue(mapper.constructType(double.class)));
        Assert.assertEquals('\0', builder.getDefaultValue(mapper.constructType(char.class)));

        Assert.assertEquals("", builder.getDefaultValue(mapper.constructType(String.class)));
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, builder.getDefaultValue(mapper.constructType(List.class)));
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, builder.getDefaultValue(mapper.constructType(Map.class)));
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, builder.getDefaultValue(mapper.constructType(int[].class)));
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, builder.getDefaultValue(mapper.constructType(AtomicReference.class)));

        Assert.assertNull(builder.getDefaultValue(mapper.constructType(Object.class)));
    }

    @Test
    public void testGetDefaultBean_noDefaultConstructor_returnsNull() {
        SubPropertyBuilder builder = createBuilder(NoDefaultConstructorBean.class);
        Object defaultBean = builder.getDefaultBean();
        Assert.assertNull(defaultBean);
    }

    @Test
    public void testGetDefaultBean_withDefaultConstructor_returnsInstance() {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);
        Object defaultBean = builder.getDefaultBean();
        Assert.assertNotNull(defaultBean);
        Assert.assertTrue(defaultBean instanceof SimpleBean);
        Assert.assertSame(defaultBean, builder.getDefaultBean());
    }

    @Test
    public void testGetPropertyDefaultValue_normalAndFallback() {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));
        BeanPropertyDefinition prop = findPropDef(beanDesc, "name");
        Assert.assertNotNull(prop);

        Object val = builder.getPropertyDefaultValue("name", prop.getPrimaryMember(), mapper.constructType(String.class));
        Assert.assertEquals("defaultName", val);

        SubPropertyBuilder noCtorBuilder = createBuilder(NoDefaultConstructorBean.class);
        BeanDescription noCtorDesc = config.introspect(mapper.constructType(NoDefaultConstructorBean.class));
        BeanPropertyDefinition noCtorProp = findPropDef(noCtorDesc, "val");
        Assert.assertNotNull(noCtorProp);
        Object fallbackVal = noCtorBuilder.getPropertyDefaultValue("val", noCtorProp.getPrimaryMember(), mapper.constructType(String.class));
        Assert.assertEquals("", fallbackVal);
    }

    @Test
    public void testThrowWrapped_runtimeException_rethrownDirectly() {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);
        IllegalStateException ex = new IllegalStateException("Test runtime");
        try {
            builder._throwWrapped(ex, "testProp", new SimpleBean());
            Assert.fail("Should throw RuntimeException");
        } catch (IllegalStateException e) {
            Assert.assertEquals("Test runtime", e.getMessage());
        }
    }

    @Test
    public void testThrowWrapped_error_rethrownDirectly() {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);
        AssertionError err = new AssertionError("Test error");
        try {
            builder._throwWrapped(new Exception(err), "testProp", new SimpleBean());
            Assert.fail("Should throw Error");
        } catch (AssertionError e) {
            Assert.assertEquals("Test error", e.getMessage());
        }
    }

    @Test
    public void testThrowWrapped_checkedException_wrappedInIllegalArgumentException() {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);
        Exception ex = new Exception("Test checked");
        try {
            builder._throwWrapped(ex, "testProp", new SimpleBean());
            Assert.fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to get property 'testProp'"));
        }
    }

    @Test
    public void testBuildWriter_nonDefaultWithRealDefaults_success() throws Exception {
        SubPropertyBuilder builder = createBuilder(NonDefaultBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(NonDefaultBean.class));

        BeanPropertyDefinition textProp = findPropDef(beanDesc, "text");
        BeanPropertyWriter writerText = builder.buildWriter(serializerProvider, textProp, mapper.constructType(String.class),
                null, null, null, textProp.getPrimaryMember(), false);
        Assert.assertNotNull(writerText);

        BeanPropertyDefinition numProp = findPropDef(beanDesc, "number");
        BeanPropertyWriter writerNum = builder.buildWriter(serializerProvider, numProp, mapper.constructType(int.class),
                null, null, null, numProp.getPrimaryMember(), false);
        Assert.assertNotNull(writerNum);

        BeanPropertyDefinition arrProp = findPropDef(beanDesc, "numbers");
        BeanPropertyWriter writerArr = builder.buildWriter(serializerProvider, arrProp, mapper.constructType(int[].class),
                null, null, null, arrProp.getPrimaryMember(), false);
        Assert.assertNotNull(writerArr);

        BeanPropertyDefinition objProp = findPropDef(beanDesc, "obj");
        BeanPropertyWriter writerObj = builder.buildWriter(serializerProvider, objProp, mapper.constructType(Object.class),
                null, null, null, objProp.getPrimaryMember(), false);
        Assert.assertNotNull(writerObj);
    }

    @Test
    public void testBuildWriter_globalNonDefault_suppressNullsTrue() throws Exception {
        ObjectMapper nonDefMapper = new ObjectMapper();
        nonDefMapper.setDefaultPropertyInclusion(JsonInclude.Value.construct(JsonInclude.Include.NON_DEFAULT, JsonInclude.Include.NON_DEFAULT));
        SerializationConfig cfg = nonDefMapper.getSerializationConfig();
        BeanDescription desc = cfg.introspect(nonDefMapper.constructType(SimpleBean.class));

        SubPropertyBuilder builder = new SubPropertyBuilder(cfg, desc);
        BeanPropertyDefinition prop = findPropDef(desc, "name");

        BeanPropertyWriter writer = builder.buildWriter(serializerProvider, prop, mapper.constructType(String.class),
                null, null, null, prop.getPrimaryMember(), false);
        Assert.assertNotNull(writer);
        Assert.assertTrue(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriter_nonAbsentInclusion_suppressesAbsent() throws Exception {
        SubPropertyBuilder builder = createBuilder(NonAbsentBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(NonAbsentBean.class));

        BeanPropertyDefinition refProp = findPropDef(beanDesc, "ref");
        BeanPropertyWriter writerRef = builder.buildWriter(serializerProvider, refProp, mapper.constructType(AtomicReference.class),
                null, null, null, refProp.getPrimaryMember(), false);
        Assert.assertNotNull(writerRef);
        Assert.assertTrue(writerRef.willSuppressNulls());

        BeanPropertyDefinition normalProp = findPropDef(beanDesc, "normal");
        BeanPropertyWriter writerNormal = builder.buildWriter(serializerProvider, normalProp, mapper.constructType(String.class),
                null, null, null, normalProp.getPrimaryMember(), false);
        Assert.assertNotNull(writerNormal);
        Assert.assertTrue(writerNormal.willSuppressNulls());
    }

    @Test
    public void testBuildWriter_nonEmptyInclusion() throws Exception {
        SubPropertyBuilder builder = createBuilder(NonEmptyBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(NonEmptyBean.class));

        BeanPropertyDefinition itemsProp = findPropDef(beanDesc, "items");
        BeanPropertyWriter writer = builder.buildWriter(serializerProvider, itemsProp, mapper.constructType(List.class),
                null, null, null, itemsProp.getPrimaryMember(), false);
        Assert.assertNotNull(writer);
        Assert.assertTrue(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriter_nonNullInclusion() throws Exception {
        SubPropertyBuilder builder = createBuilder(NonNullBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(NonNullBean.class));

        BeanPropertyDefinition valueProp = findPropDef(beanDesc, "value");
        BeanPropertyWriter writer = builder.buildWriter(serializerProvider, valueProp, mapper.constructType(String.class),
                null, null, null, valueProp.getPrimaryMember(), false);
        Assert.assertNotNull(writer);
        Assert.assertTrue(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriter_useDefaultsInclusion_andWriteEmptyJsonArraysDisabled() throws Exception {
        ObjectMapper arrayDisabledMapper = new ObjectMapper();
        arrayDisabledMapper.disable(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        SerializationConfig cfg = arrayDisabledMapper.getSerializationConfig();
        BeanDescription desc = cfg.introspect(arrayDisabledMapper.constructType(UseDefaultsBean.class));

        SubPropertyBuilder builder = new SubPropertyBuilder(cfg, desc);
        BeanPropertyDefinition listProp = findPropDef(desc, "emptyList");

        BeanPropertyWriter writer = builder.buildWriter(serializerProvider, listProp, mapper.constructType(List.class),
                null, null, null, listProp.getPrimaryMember(), false);
        Assert.assertNotNull(writer);
    }

    @Test
    public void testBuildWriter_customNullSerializerAndUnwrapping() throws Exception {
        SubPropertyBuilder builder = createBuilder(AnnotatedBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(AnnotatedBean.class));

        BeanPropertyDefinition nullProp = findPropDef(beanDesc, "nullAnnotated");
        BeanPropertyWriter writerNull = builder.buildWriter(serializerProvider, nullProp, mapper.constructType(String.class),
                null, null, null, nullProp.getPrimaryMember(), false);
        Assert.assertNotNull(writerNull);
        Assert.assertTrue(writerNull.hasNullSerializer());

        BeanPropertyDefinition unwrapProp = findPropDef(beanDesc, "unwrapped");
        BeanPropertyWriter writerUnwrap = builder.buildWriter(serializerProvider, unwrapProp, mapper.constructType(SimpleBean.class),
                null, null, null, unwrapProp.getPrimaryMember(), false);
        Assert.assertNotNull(writerUnwrap);
        Assert.assertTrue(writerUnwrap.isUnwrapping());
    }

    @Test
    public void testBuildWriter_withContentTypeSerializer_validContainer() throws Exception {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));
        BeanPropertyDefinition listProp = findPropDef(beanDesc, "list");

        JavaType listType = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        TypeSerializer contentTypeSer = mapper.getSerializerFactory().createTypeSerializer(config, mapper.constructType(String.class));

        BeanPropertyWriter writer = builder.buildWriter(serializerProvider, listProp, listType,
                null, null, contentTypeSer, listProp.getPrimaryMember(), false);
        Assert.assertNotNull(writer);
    }

    @Test
    public void testBuildWriter_withContentTypeSerializer_nonContainerReportsBadDefinition() throws Exception {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));
        BeanPropertyDefinition nameProp = findPropDef(beanDesc, "name");

        JavaType stringType = mapper.constructType(String.class);
        TypeSerializer contentTypeSer = mapper.getSerializerFactory().createTypeSerializer(config, mapper.constructType(String.class));

        try {
            builder.buildWriter(serializerProvider, nameProp, stringType,
                    null, null, contentTypeSer, nameProp.getPrimaryMember(), false);
            Assert.fail("Should report bad property definition when content type serializer is used on non-container type");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("has no content"));
        }
    }

    @Test
    public void testFindSerializationType_asSuperType_success() throws Exception {
        SubPropertyBuilder builder = createBuilder(AnnotatedBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(AnnotatedBean.class));

        BeanPropertyDefinition superProp = findPropDef(beanDesc, "superTypeProp");
        JavaType serType = builder.findSerializationType(superProp.getPrimaryMember(), false, mapper.constructType(String.class));
        Assert.assertNotNull(serType);
        Assert.assertEquals(CharSequence.class, serType.getRawClass());
    }

    @Test
    public void testFindSerializationType_asSubType_success() throws Exception {
        SubPropertyBuilder builder = createBuilder(AnnotatedBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(AnnotatedBean.class));

        BeanPropertyDefinition subProp = findPropDef(beanDesc, "subTypeProp");
        JavaType serType = builder.findSerializationType(subProp.getPrimaryMember(), false, mapper.constructType(Object.class));
        Assert.assertNotNull(serType);
        Assert.assertEquals(String.class, serType.getRawClass());
    }

    @Test
    public void testFindSerializationType_staticTypingAnnotation_enablesStaticTyping() throws Exception {
        SubPropertyBuilder builder = createBuilder(AnnotatedBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(AnnotatedBean.class));

        BeanPropertyDefinition staticProp = findPropDef(beanDesc, "staticTypedProp");
        JavaType serType = builder.findSerializationType(staticProp.getPrimaryMember(), false, mapper.constructType(Object.class));
        Assert.assertNotNull(serType);
        Assert.assertTrue(serType.useStaticType());
    }

    @Test
    public void testFindSerializationType_dynamicTypingAnnotation_returnsNull() throws Exception {
        SubPropertyBuilder builder = createBuilder(AnnotatedBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(AnnotatedBean.class));

        BeanPropertyDefinition dynamicProp = findPropDef(beanDesc, "dynamicTypedProp");
        JavaType serType = builder.findSerializationType(dynamicProp.getPrimaryMember(), true, mapper.constructType(Object.class));
        Assert.assertNull(serType);
    }

    @Test
    public void testFindSerializationType_useStaticTypingTrue_returnsStaticType() throws Exception {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));

        BeanPropertyDefinition nameProp = findPropDef(beanDesc, "name");
        JavaType serType = builder.findSerializationType(nameProp.getPrimaryMember(), true, mapper.constructType(String.class));
        Assert.assertNotNull(serType);
        Assert.assertTrue(serType.useStaticType());
    }

    @Test
    public void testFindSerializationType_noAnnotationsAndDynamic_returnsNull() throws Exception {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));

        BeanPropertyDefinition nameProp = findPropDef(beanDesc, "name");
        JavaType serType = builder.findSerializationType(nameProp.getPrimaryMember(), false, mapper.constructType(String.class));
        Assert.assertNull(serType);
    }

    @Test
    public void testBuildWriter_invalidSerializationTypeAnnotation_reportsBadPropertyDefinition() {
        SubPropertyBuilder builder = createBuilder(AnnotatedBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(AnnotatedBean.class));
        BeanPropertyDefinition invalidProp = findPropDef(beanDesc, "invalidTypeProp");

        try {
            builder.buildWriter(serializerProvider, invalidProp, mapper.constructType(String.class),
                    null, null, null, invalidProp.getPrimaryMember(), false);
            Assert.fail("Should fail due to invalid concrete-type annotation");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal concrete-type annotation")
                    || e.getMessage().contains("Failed to narrow type"));
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal concrete-type annotation"));
        }
    }

    @Test
    public void testGetPropertyDefaultValue_getterThrowsException_handledProperly() {
        SubPropertyBuilder builder = createBuilder(SimpleBean.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));

        BeanPropertyDefinition throwingProp = findPropDef(beanDesc, "throwing");
        try {
            builder.getPropertyDefaultValue("throwing", throwingProp.getPrimaryMember(), mapper.constructType(String.class));
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertEquals("Simulated getter error", e.getMessage());
        }

        BeanPropertyDefinition errorProp = findPropDef(beanDesc, "errorThrowing");
        try {
            builder.getPropertyDefaultValue("errorThrowing", errorProp.getPrimaryMember(), mapper.constructType(String.class));
            Assert.fail("Expected AssertionError");
        } catch (AssertionError e) {
            Assert.assertEquals("Simulated assertion error", e.getMessage());
        }

        BeanPropertyDefinition checkedProp = findPropDef(beanDesc, "checkedThrowing");
        try {
            builder.getPropertyDefaultValue("checkedThrowing", checkedProp.getPrimaryMember(), mapper.constructType(String.class));
            Assert.fail("Expected IllegalArgumentException wrapping checked exception");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to get property 'checkedThrowing'"));
        }
    }
}
