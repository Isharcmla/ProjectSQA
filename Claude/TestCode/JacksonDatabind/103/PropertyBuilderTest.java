package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.Annotations;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

import java.io.IOException;
import java.util.List;

public class PropertyBuilderTest {

    // ---------- Helper POJOs ----------

    public static class SimpleBean {
        public String name = "abc";
        public int value = 5;
        public SimpleBean() {}
    }

    public static class NoDefaultCtorBean {
        private final String x;
        public NoDefaultCtorBean(String x) { this.x = x; }
        public String getX() { return x; }
    }

    public static class BeanAlways {
        public String name = "hello";
    }

    public static class BeanNonNull {
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public String name = null;
        public String other = "x";
    }

    public static class BeanNonEmpty {
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        public String name = "";
        public String other = "y";
    }

    public static class BeanNonDefaultProp {
        @JsonInclude(JsonInclude.Include.NON_DEFAULT)
        public int value = 0;
    }

    public static class BeanNonDefaultPropNonZero {
        @JsonInclude(JsonInclude.Include.NON_DEFAULT)
        public int value = 5;
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class BeanClassNonDefaultSame {
        public int value = 0;
        public String name = "hello";
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class BeanClassNonDefaultDiff {
        public int value = 9;
        public String name = "world";
    }

    public static class ZeroFilter {
        @Override
        public boolean equals(Object o) {
            return (o instanceof Integer) && ((Integer) o).intValue() == 0;
        }
        @Override
        public int hashCode() { return 0; }
    }

    public static class BeanCustomZero {
        @JsonInclude(value = JsonInclude.Include.CUSTOM, valueFilter = ZeroFilter.class)
        public int value = 0;
    }

    public static class BeanCustomNonZero {
        @JsonInclude(value = JsonInclude.Include.CUSTOM, valueFilter = ZeroFilter.class)
        public int value = 5;
    }

    public static class Inner {
        public String innerName = "innerVal";
    }

    public static class Outer {
        @JsonUnwrapped
        public Inner inner = new Inner();
    }

    public static class MyNullSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("NULL_VALUE");
        }
    }

    public static class BeanNullSer {
        @JsonSerialize(nullsUsing = MyNullSerializer.class)
        public String name = null;
    }

    public static class BadTypeBean {
        @JsonSerialize(as = Integer.class)
        public String name = "x";
    }

    // ---------- Common fields ----------

    private ObjectMapper mapper;
    private SerializationConfig config;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
    }

    private BeanDescription introspect(Class<?> cls) {
        JavaType type = config.getTypeFactory().constructType(cls);
        return config.introspect(type);
    }

    private AnnotatedMember getAccessorFor(BeanDescription beanDesc, String propName) {
        List<BeanPropertyDefinition> defs = beanDesc.findProperties();
        for (BeanPropertyDefinition def : defs) {
            if (def.getName().equals(propName)) {
                return def.getAccessor();
            }
        }
        return null;
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalBean_createsInstance() {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        assertNotNull(builder);
    }

    @Test
    public void testConstructor_beanWithoutDefaultCtor_createsInstance() {
        BeanDescription beanDesc = introspect(NoDefaultCtorBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        assertNotNull(builder);
    }

    // ---------- getClassAnnotations ----------

    @Test
    public void testGetClassAnnotations_normalBean_returnsNonNull() {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        Annotations ann = builder.getClassAnnotations();
        assertNotNull(ann);
    }

    // ---------- getDefaultBean ----------

    @Test
    public void testGetDefaultBean_beanWithDefaultCtor_returnsInstance() {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        Object def = builder.getDefaultBean();
        assertNotNull(def);
        assertTrue(def instanceof SimpleBean);
    }

    @Test
    public void testGetDefaultBean_beanWithoutDefaultCtor_returnsNull() {
        BeanDescription beanDesc = introspect(NoDefaultCtorBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        Object def = builder.getDefaultBean();
        assertNull(def);
    }

    @Test
    public void testGetDefaultBean_calledTwice_cachedBehaviorConsistent() {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        Object def1 = builder.getDefaultBean();
        Object def2 = builder.getDefaultBean();
        assertNotNull(def1);
        assertNotNull(def2);
        assertEquals(def1.getClass(), def2.getClass());
    }

    // ---------- getDefaultValue (deprecated) ----------

    @Test
    public void testGetDefaultValue_intType_returnsZero() {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        JavaType intType = config.getTypeFactory().constructType(int.class);
        Object def = builder.getDefaultValue(intType);
        assertEquals(Integer.valueOf(0), def);
    }

    @Test
    public void testGetDefaultValue_stringType_returnsNull() {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        JavaType strType = config.getTypeFactory().constructType(String.class);
        Object def = builder.getDefaultValue(strType);
        assertNull(def);
    }

    // ---------- getPropertyDefaultValue (deprecated) ----------

    @Test
    public void testGetPropertyDefaultValue_beanWithDefaultCtor_returnsFieldValue() {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        AnnotatedMember member = getAccessorFor(beanDesc, "value");
        assertNotNull(member);
        JavaType intType = config.getTypeFactory().constructType(int.class);
        Object val = builder.getPropertyDefaultValue("value", member, intType);
        assertEquals(Integer.valueOf(5), val);
    }

    @Test
    public void testGetPropertyDefaultValue_beanWithoutDefaultCtor_fallsBackToTypeDefault() {
        BeanDescription beanDesc = introspect(NoDefaultCtorBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        AnnotatedMember member = getAccessorFor(beanDesc, "x");
        assertNotNull(member);
        JavaType strType = config.getTypeFactory().constructType(String.class);
        Object val = builder.getPropertyDefaultValue("x", member, strType);
        assertNull(val);
    }

    // ---------- findSerializationType ----------

    @Test
    public void testFindSerializationType_noAnnotationNoStatic_returnsNull() throws Exception {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        AnnotatedMember member = getAccessorFor(beanDesc, "name");
        assertNotNull(member);
        JavaType declaredType = config.getTypeFactory().constructType(String.class);
        JavaType result = builder.findSerializationType(member, false, declaredType);
        assertNull(result);
    }

    @Test
    public void testFindSerializationType_useStaticTyping_returnsStaticType() throws Exception {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        AnnotatedMember member = getAccessorFor(beanDesc, "name");
        assertNotNull(member);
        JavaType declaredType = config.getTypeFactory().constructType(String.class);
        JavaType result = builder.findSerializationType(member, true, declaredType);
        assertNotNull(result);
        assertEquals(String.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSerializationType_incompatibleForcedType_throwsIllegalArgumentException() throws Exception {
        BeanDescription beanDesc = introspect(BadTypeBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        AnnotatedMember member = getAccessorFor(beanDesc, "name");
        assertNotNull(member);
        JavaType declaredType = config.getTypeFactory().constructType(String.class);
        builder.findSerializationType(member, false, declaredType);
    }

    // ---------- _throwWrapped ----------

    @Test(expected = IllegalArgumentException.class)
    public void testThrowWrapped_plainException_throwsIllegalArgumentException() {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        Exception e = new Exception("boom");
        builder._throwWrapped(e, "propName", new Object());
    }

    @Test
    public void testThrowWrapped_causeIsRuntimeException_rethrowsOriginal() {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        RuntimeException inner = new RuntimeException("inner-rte");
        Exception outer = new Exception("outer", inner);
        try {
            builder._throwWrapped(outer, "propName", new Object());
            fail("Should have thrown");
        } catch (RuntimeException rte) {
            assertEquals("inner-rte", rte.getMessage());
        }
    }

    @Test
    public void testThrowWrapped_causeIsError_rethrowsOriginalError() {
        BeanDescription beanDesc = introspect(SimpleBean.class);
        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);
        Error innerError = new OutOfMemoryError("oom-simulated");
        Exception outer = new Exception("outer", innerError);
        try {
            builder._throwWrapped(outer, "propName", new Object());
            fail("Should have thrown");
        } catch (Error err) {
            assertEquals("oom-simulated", err.getMessage());
        }
    }

    // ---------- buildWriter (indirect, via full serialization through public ObjectMapper API) ----------

    @Test
    public void testBuildWriter_defaultAlwaysInclusion_includesValue() throws Exception {
        String json = mapper.writeValueAsString(new BeanAlways());
        assertTrue(json.contains("hello"));
    }

    @Test
    public void testBuildWriter_nonNullInclusion_suppressesNullField() throws Exception {
        String json = mapper.writeValueAsString(new BeanNonNull());
        assertFalse(json.contains("\"name\""));
        assertTrue(json.contains("\"other\""));
    }

    @Test
    public void testBuildWriter_nonEmptyInclusion_suppressesEmptyString() throws Exception {
        String json = mapper.writeValueAsString(new BeanNonEmpty());
        assertFalse(json.contains("\"name\""));
        assertTrue(json.contains("\"other\""));
    }

    @Test
    public void testBuildWriter_nonDefaultPropertyZeroValue_suppressesField() throws Exception {
        String json = mapper.writeValueAsString(new BeanNonDefaultProp());
        assertFalse(json.contains("\"value\""));
    }

    @Test
    public void testBuildWriter_nonDefaultPropertyNonZeroValue_includesField() throws Exception {
        String json = mapper.writeValueAsString(new BeanNonDefaultPropNonZero());
        assertTrue(json.contains("\"value\""));
        assertTrue(json.contains("5"));
    }

    @Test
    public void testBuildWriter_classLevelNonDefaultSameAsDefault_suppressesAll() throws Exception {
        String json = mapper.writeValueAsString(new BeanClassNonDefaultSame());
        assertEquals("{}", json);
    }

    @Test
    public void testBuildWriter_classLevelNonDefaultDifferentFromDefault_includesFields() throws Exception {
        String json = mapper.writeValueAsString(new BeanClassNonDefaultDiff());
        assertTrue(json.contains("\"value\""));
        assertTrue(json.contains("\"name\""));
        assertTrue(json.contains("world"));
    }

    @Test
    public void testBuildWriter_customInclusionMatchesFilter_suppressesField() throws Exception {
        String json = mapper.writeValueAsString(new BeanCustomZero());
        assertFalse(json.contains("\"value\""));
    }

    @Test
    public void testBuildWriter_customInclusionDoesNotMatchFilter_includesField() throws Exception {
        String json = mapper.writeValueAsString(new BeanCustomNonZero());
        assertTrue(json.contains("\"value\""));
        assertTrue(json.contains("5"));
    }

    @Test
    public void testBuildWriter_unwrappedProperty_flattensJson() throws Exception {
        String json = mapper.writeValueAsString(new Outer());
        assertTrue(json.contains("innerName"));
        assertFalse(json.contains("\"inner\""));
    }

    @Test
    public void testBuildWriter_customNullSerializer_usesCustomOutput() throws Exception {
        String json = mapper.writeValueAsString(new BeanNullSer());
        assertTrue(json.contains("NULL_VALUE"));
    }

    @Test
    public void testBuildWriter_simpleBean_serializesNormally() throws Exception {
        SimpleBean bean = new SimpleBean();
        String json = mapper.writeValueAsString(bean);
        assertTrue(json.contains("abc"));
        assertTrue(json.contains("5"));
    }
}
