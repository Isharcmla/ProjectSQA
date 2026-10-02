package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanPropertyWriterTest {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface CustomAnnotation {
        String value() default "test";
    }

    public static class SampleBean {
        @CustomAnnotation("fieldVal")
        public String textField = "fieldValue";
        public Integer intField = 42;
        public SampleBean selfRef;
        public Object emptyObj = "";

        public String getMethodProp() {
            return "methodValue";
        }

        public List<String> getGenericList() {
            return Collections.emptyList();
        }
    }

    public static class DummySchemaAwareSerializer extends JsonSerializer<Object> implements SchemaAware {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("dummy");
        }

        @Override
        public JsonNode getSchema(SerializerProvider provider, Type typeHint) {
            return getSchema(provider, typeHint, false);
        }

        @Override
        public JsonNode getSchema(SerializerProvider provider, Type typeHint, boolean isOptional) {
            ObjectNode n = JsonNodeFactory.instance.objectNode();
            n.put("type", "dummy");
            n.put("optional", isOptional);
            return n;
        }
    }

    public static class CustomVirtualPropertyWriter extends BeanPropertyWriter {
        public CustomVirtualPropertyWriter() {
            super();
        }

        public CustomVirtualPropertyWriter(BeanPropertyWriter base) {
            super(base);
        }

        public CustomVirtualPropertyWriter(BeanPropertyWriter base, PropertyName name) {
            super(base, name);
        }

        public CustomVirtualPropertyWriter(BeanPropertyWriter base, SerializedString name) {
            super(base, name);
        }
    }

    private ObjectMapper mapper;
    private SerializationConfig config;
    private SerializerProvider serializerProvider;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
        serializerProvider = mapper.getSerializerProviderInstance();
    }

    private BeanPropertyWriter buildFieldWriter(String fieldName, boolean suppressNulls, Object suppressableValue) throws Exception {
        JavaType beanType = mapper.constructType(SampleBean.class);
        BeanDescription desc = config.introspect(beanType);
        AnnotatedClass ac = desc.getClassInfo();
        Field field = SampleBean.class.getField(fieldName);
        AnnotatedField af = new AnnotatedField(ac, field, new AnnotationMap());

        PropertyName propName = new PropertyName(fieldName);
        PropertyMetadata md = PropertyMetadata.STD_OPTIONAL;
        BeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(config, af, propName, md, JsonInclude.Include.ALWAYS);
        JavaType type = mapper.constructType(field.getGenericType());

        return new BeanPropertyWriter(propDef, af, ac.getAnnotations(), type, null, null, null, suppressNulls, suppressableValue);
    }

    private BeanPropertyWriter buildMethodWriter(String methodName, String propNameStr, boolean isRequired) throws Exception {
        JavaType beanType = mapper.constructType(SampleBean.class);
        BeanDescription desc = config.introspect(beanType);
        AnnotatedClass ac = desc.getClassInfo();
        Method method = SampleBean.class.getMethod(methodName);
        AnnotatedMethod am = new AnnotatedMethod(ac, method, new AnnotationMap(), new AnnotationMap[0]);

        PropertyName propName = new PropertyName(propNameStr);
        PropertyMetadata md = isRequired ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        BeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(config, am, propName, md, JsonInclude.Include.ALWAYS);
        JavaType type = mapper.constructType(method.getGenericReturnType());

        return new BeanPropertyWriter(propDef, am, ac.getAnnotations(), type, null, null, null, false, null);
    }

    private BeanPropertyWriter buildVirtualWriter(String name) {
        PropertyName propName = new PropertyName(name);
        PropertyMetadata md = PropertyMetadata.STD_OPTIONAL;
        BeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(config, null, propName, md, JsonInclude.Include.ALWAYS);
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);

        return new BeanPropertyWriter(propDef, null, null, type, null, null, null, false, null);
    }

    @Test
    public void testDefaultAndCopyConstructors() throws Exception {
        CustomVirtualPropertyWriter emptyWriter = new CustomVirtualPropertyWriter();
        assertNull(emptyWriter.getName());
        assertNull(emptyWriter.getMember());
        assertNull(emptyWriter.getType());
        assertNull(emptyWriter.getMetadata());
        assertFalse(emptyWriter.willSuppressNulls());

        BeanPropertyWriter baseFieldWriter = buildFieldWriter("textField", true, "suppressed");
        baseFieldWriter.setInternalSetting("key1", "val1");

        CustomVirtualPropertyWriter copy1 = new CustomVirtualPropertyWriter(baseFieldWriter);
        assertEquals("textField", copy1.getName());
        assertEquals("val1", copy1.getInternalSetting("key1"));
        assertTrue(copy1.willSuppressNulls());

        CustomVirtualPropertyWriter copy2 = new CustomVirtualPropertyWriter(baseFieldWriter, new PropertyName("renamed1"));
        assertEquals("renamed1", copy2.getName());

        CustomVirtualPropertyWriter copy3 = new CustomVirtualPropertyWriter(baseFieldWriter, new SerializedString("renamed2"));
        assertEquals("renamed2", copy3.getName());
    }

    @Test
    public void testRename_sameAndDifferentName() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);

        NameTransformer noopTransformer = NameTransformer.NOP;
        BeanPropertyWriter same = bpw.rename(noopTransformer);
        assertSame(bpw, same);

        NameTransformer prefixTransformer = NameTransformer.simpleTransformer("prefix_", "");
        BeanPropertyWriter renamed = bpw.rename(prefixTransformer);
        assertNotSame(bpw, renamed);
        assertEquals("prefix_textField", renamed.getName());
    }

    @Test
    public void testAssignSerializer_successAndOverrideException() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);
        assertFalse(bpw.hasSerializer());
        assertNull(bpw.getSerializer());

        JsonSerializer<Object> ser1 = new StringSerializer();
        bpw.assignSerializer(ser1);
        assertTrue(bpw.hasSerializer());
        assertSame(ser1, bpw.getSerializer());

        bpw.assignSerializer(ser1); // same serializer is allowed

        try {
            bpw.assignSerializer(new NumberSerializers.IntegerSerializer(Integer.class));
            fail("Expected IllegalStateException on overriding serializer");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Can not override serializer"));
        }
    }

    @Test
    public void testAssignNullSerializer_successAndOverrideException() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);
        assertFalse(bpw.hasNullSerializer());

        JsonSerializer<Object> nullSer1 = NullSerializer.instance;
        bpw.assignNullSerializer(nullSer1);
        assertTrue(bpw.hasNullSerializer());

        bpw.assignNullSerializer(nullSer1); // same serializer allowed

        try {
            bpw.assignNullSerializer(new StringSerializer());
            fail("Expected IllegalStateException on overriding null serializer");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Can not override null serializer"));
        }
    }

    @Test
    public void testAssignTypeSerializerAndGetters() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);
        assertNull(bpw.getTypeSerializer());

        TypeSerializer mockTypeSer = mapper.getSerializerProviderInstance().findTypeSerializer(mapper.constructType(SampleBean.class));
        bpw.assignTypeSerializer(mockTypeSer);
        assertEquals(mockTypeSer, bpw.getTypeSerializer());
    }

    @Test
    public void testUnwrappingWriter() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);
        assertFalse(bpw.isUnwrapping());

        BeanPropertyWriter unwrapping = bpw.unwrappingWriter(NameTransformer.simpleTransformer("pre_", "_post"));
        assertTrue(unwrapping.isUnwrapping());
    }

    @Test
    public void testSetNonTrivialBaseType() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);
        JavaType listType = mapper.constructType(List.class);
        bpw.setNonTrivialBaseType(listType);
    }

    @Test
    public void testReadResolve_fieldMethodVirtual() throws Exception {
        BeanPropertyWriter fieldBpw = buildFieldWriter("textField", false, null);
        Object resolvedField = fieldBpw.readResolve();
        assertSame(fieldBpw, resolvedField);
        assertEquals(String.class, fieldBpw.getPropertyType());

        BeanPropertyWriter methodBpw = buildMethodWriter("getMethodProp", "methodProp", false);
        Object resolvedMethod = methodBpw.readResolve();
        assertSame(methodBpw, resolvedMethod);
        assertEquals(String.class, methodBpw.getPropertyType());

        BeanPropertyWriter virtualBpw = buildVirtualWriter("virtualProp");
        Object resolvedVirtual = virtualBpw.readResolve();
        assertSame(virtualBpw, resolvedVirtual);
    }

    @Test
    public void testMetadataAndAnnotations() throws Exception {
        BeanPropertyWriter fieldBpw = buildFieldWriter("textField", false, null);
        assertEquals("textField", fieldBpw.getName());
        assertEquals(new PropertyName("textField"), fieldBpw.getFullName());
        assertEquals(mapper.constructType(String.class), fieldBpw.getType());
        assertNull(fieldBpw.getWrapperName());
        assertFalse(fieldBpw.isRequired());
        assertNotNull(fieldBpw.getMetadata());
        assertFalse(fieldBpw.isVirtual());
        assertNotNull(fieldBpw.getMember());

        assertNull(fieldBpw.getContextAnnotation(CustomAnnotation.class));

        BeanPropertyWriter requiredMethodBpw = buildMethodWriter("getMethodProp", "methodProp", true);
        assertTrue(requiredMethodBpw.isRequired());
        assertEquals(String.class, requiredMethodBpw.getPropertyType());
        assertEquals(String.class, requiredMethodBpw.getGenericPropertyType());

        BeanPropertyWriter virtualBpw = buildVirtualWriter("virtualProp");
        assertNull(virtualBpw.getAnnotation(CustomAnnotation.class));
        assertNull(virtualBpw.getContextAnnotation(CustomAnnotation.class));
        assertNull(virtualBpw.getGenericPropertyType());
    }

    @Test
    public void testFindFormatOverrides() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);
        assertNull(bpw.findFormatOverrides(null));

        AnnotationIntrospector intr = config.getAnnotationIntrospector();
        assertNull(bpw.findFormatOverrides(intr));
        assertNull(bpw.findFormatOverrides(intr)); // cached lookup

        BeanPropertyWriter virtualBpw = buildVirtualWriter("virtual");
        assertNull(virtualBpw.findFormatOverrides(intr));
    }

    @Test
    public void testInternalSettings_addGetRemove() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);
        assertNull(bpw.getInternalSetting("k1"));
        assertNull(bpw.removeInternalSetting("k1"));

        Object old1 = bpw.setInternalSetting("k1", "v1");
        assertNull(old1);
        assertEquals("v1", bpw.getInternalSetting("k1"));

        Object old2 = bpw.setInternalSetting("k1", "v2");
        assertEquals("v1", old2);
        assertEquals("v2", bpw.getInternalSetting("k1"));

        bpw.setInternalSetting("k2", "v3");
        assertEquals("v3", bpw.removeInternalSetting("k2"));
        assertEquals("v2", bpw.removeInternalSetting("k1"));
        assertNull(bpw.getInternalSetting("k1"));
    }

    @Test
    public void testWouldConflictWithName() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);

        assertTrue(bpw.wouldConflictWithName(new PropertyName("textField")));
        assertFalse(bpw.wouldConflictWithName(new PropertyName("textField", "http://ns.com")));
        assertFalse(bpw.wouldConflictWithName(new PropertyName("otherField")));

        PropertyName wrapper = new PropertyName("wrapperField");
        PropertyMetadata md = PropertyMetadata.STD_OPTIONAL;
        AnnotatedField af = (AnnotatedField) bpw.getMember();
        BeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(config, af, wrapper, md, JsonInclude.Include.ALWAYS);
        BeanPropertyWriter bpwWithWrapper = new BeanPropertyWriter(propDef, af, null, bpw.getType(), null, null, null, false, null);

        assertTrue(bpwWithWrapper.wouldConflictWithName(new PropertyName("wrapperField")));
        assertFalse(bpwWithWrapper.wouldConflictWithName(new PropertyName("textField")));
    }

    @Test
    public void testTypeAndRawSerializationType() throws Exception {
        JavaType stringType = mapper.constructType(String.class);
        JavaType beanType = mapper.constructType(SampleBean.class);
        BeanDescription desc = config.introspect(beanType);
        AnnotatedClass ac = desc.getClassInfo();
        Field field = SampleBean.class.getField("textField");
        AnnotatedField af = new AnnotatedField(ac, field, new AnnotationMap());

        PropertyName propName = new PropertyName("textField");
        BeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(config, af, propName, PropertyMetadata.STD_OPTIONAL, JsonInclude.Include.ALWAYS);

        BeanPropertyWriter bpwWithoutSerType = new BeanPropertyWriter(propDef, af, ac.getAnnotations(), stringType, null, null, null, false, null);
        assertNull(bpwWithoutSerType.getSerializationType());
        assertNull(bpwWithoutSerType.getRawSerializationType());

        BeanPropertyWriter bpwWithSerType = new BeanPropertyWriter(propDef, af, ac.getAnnotations(), stringType, null, null, stringType, false, null);
        assertEquals(stringType, bpwWithSerType.getSerializationType());
        assertEquals(String.class, bpwWithSerType.getRawSerializationType());
    }

    @Test
    public void testSerializeAsField_normalAndDynamicSerializer() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);
        SampleBean bean = new SampleBean();
        bean.textField = "hello";

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        bpw.serializeAsField(bean, gen, serializerProvider);
        gen.writeEndObject();
        gen.close();

        assertEquals("{\"textField\":\"hello\"}", sw.toString());

        // second serialize uses cached dynamic serializer
        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        bpw.serializeAsField(bean, gen, serializerProvider);
        gen.writeEndObject();
        gen.close();

        assertEquals("{\"textField\":\"hello\"}", sw.toString());
    }

    @Test
    public void testSerializeAsField_nullHandling() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", true, null);
        SampleBean bean = new SampleBean();
        bean.textField = null;

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        bpw.serializeAsField(bean, gen, serializerProvider);
        gen.writeEndObject();
        gen.close();

        assertEquals("{}", sw.toString());

        bpw.assignNullSerializer(NullSerializer.instance);
        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        bpw.serializeAsField(bean, gen, serializerProvider);
        gen.writeEndObject();
        gen.close();

        assertEquals("{\"textField\":null}", sw.toString());
    }

    @Test
    public void testSerializeAsField_suppression() throws Exception {
        BeanPropertyWriter bpwEmpty = buildFieldWriter("emptyObj", false, BeanPropertyWriter.MARKER_FOR_EMPTY);
        SampleBean bean = new SampleBean();
        bean.emptyObj = "";

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        bpwEmpty.serializeAsField(bean, gen, serializerProvider);
        gen.writeEndObject();
        gen.close();

        assertEquals("{}", sw.toString());

        bean.emptyObj = "non-empty";
        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        bpwEmpty.serializeAsField(bean, gen, serializerProvider);
        gen.writeEndObject();
        gen.close();

        assertEquals("{\"emptyObj\":\"non-empty\"}", sw.toString());

        BeanPropertyWriter bpwDefault = buildFieldWriter("textField", false, "defaultVal");
        bean.textField = "defaultVal";
        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        bpwDefault.serializeAsField(bean, gen, serializerProvider);
        gen.writeEndObject();
        gen.close();

        assertEquals("{}", sw.toString());
    }

    @Test
    public void testSerializeAsField_selfReference() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("selfRef", false, null);
        SampleBean bean = new SampleBean();
        bean.selfRef = bean;

        // With self reference feature enabled and BeanSerializerBase
        DefaultSerializerProvider.Impl prov = (DefaultSerializerProvider.Impl) mapper.getSerializerProviderInstance();
        prov = (DefaultSerializerProvider.Impl) prov.createInstance(config.with(SerializationFeature.FAIL_ON_SELF_REFERENCES), mapper.getSerializerFactory());

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        try {
            bpw.serializeAsField(bean, gen, prov);
            fail("Expected JsonMappingException on self reference");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Direct self-reference leading to cycle"));
        }
        gen.close();

        // With self reference feature disabled
        DefaultSerializerProvider.Impl provDisabled = (DefaultSerializerProvider.Impl) prov.createInstance(config.without(SerializationFeature.FAIL_ON_SELF_REFERENCES), mapper.getSerializerFactory());
        bpw.assignSerializer(new DummySchemaAwareSerializer());
        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        bpw.serializeAsField(bean, gen, provDisabled);
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"selfRef\":\"dummy\"}", sw.toString());
    }

    @Test
    public void testSerializeAsOmittedField() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);
        SampleBean bean = new SampleBean();

        StringWriter sw = new StringWriter();
        JsonGenerator standardGen = mapper.getFactory().createGenerator(sw);
        bpw.serializeAsOmittedField(bean, standardGen, serializerProvider);
        standardGen.close();
        assertEquals("", sw.toString());

        final boolean[] omittedCalled = new boolean[1];
        JsonGenerator customGen = new JsonGeneratorDelegate(standardGen) {
            @Override
            public boolean canOmitFields() {
                return false;
            }

            @Override
            public void writeOmittedField(String fieldName) {
                omittedCalled[0] = true;
            }
        };
        bpw.serializeAsOmittedField(bean, customGen, serializerProvider);
        assertTrue(omittedCalled[0]);
    }

    @Test
    public void testSerializeAsElement_andPlaceholder() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);
        SampleBean bean = new SampleBean();
        bean.textField = "elemVal";

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartArray();
        bpw.serializeAsElement(bean, gen, serializerProvider);
        gen.writeEndArray();
        gen.close();
        assertEquals("[\"elemVal\"]", sw.toString());

        // null value without nullSerializer
        bean.textField = null;
        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartArray();
        bpw.serializeAsElement(bean, gen, serializerProvider);
        gen.writeEndArray();
        gen.close();
        assertEquals("[null]", sw.toString());

        // null value with nullSerializer
        bpw.assignNullSerializer(NullSerializer.instance);
        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartArray();
        bpw.serializeAsElement(bean, gen, serializerProvider);
        gen.writeEndArray();
        gen.close();
        assertEquals("[null]", sw.toString());

        // suppressed empty as element calls placeholder
        BeanPropertyWriter bpwEmpty = buildFieldWriter("emptyObj", false, BeanPropertyWriter.MARKER_FOR_EMPTY);
        bean.emptyObj = "";
        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartArray();
        bpwEmpty.serializeAsElement(bean, gen, serializerProvider);
        gen.writeEndArray();
        gen.close();
        assertEquals("[null]", sw.toString());

        // suppressed default value as element calls placeholder
        BeanPropertyWriter bpwDefault = buildFieldWriter("textField", false, "defaultVal");
        bean.textField = "defaultVal";
        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartArray();
        bpwDefault.serializeAsElement(bean, gen, serializerProvider);
        gen.writeEndArray();
        gen.close();
        assertEquals("[null]", sw.toString());

        // serializeAsPlaceholder directly
        bpwDefault.assignNullSerializer(NullSerializer.instance);
        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartArray();
        bpwDefault.serializeAsPlaceholder(bean, gen, serializerProvider);
        gen.writeEndArray();
        gen.close();
        assertEquals("[null]", sw.toString());
    }

    @Test
    public void testDepositSchemaProperty_visitor() throws Exception {
        BeanPropertyWriter optionalBpw = buildFieldWriter("textField", false, null);
        final boolean[] visitedOptional = new boolean[1];
        final boolean[] visitedRequired = new boolean[1];

        JsonObjectFormatVisitor.Base visitor = new JsonObjectFormatVisitor.Base(serializerProvider) {
            @Override
            public void optionalProperty(BeanProperty prop) {
                visitedOptional[0] = true;
            }

            @Override
            public void property(BeanProperty prop) {
                visitedRequired[0] = true;
            }
        };

        optionalBpw.depositSchemaProperty((JsonObjectFormatVisitor) null); // should not fail

        optionalBpw.depositSchemaProperty(visitor);
        assertTrue(visitedOptional[0]);

        BeanPropertyWriter requiredBpw = buildMethodWriter("getMethodProp", "methodProp", true);
        requiredBpw.depositSchemaProperty(visitor);
        assertTrue(visitedRequired[0]);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDepositSchemaProperty_objectNode() throws Exception {
        ObjectNode propertiesNode = JsonNodeFactory.instance.objectNode();
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);

        bpw.depositSchemaProperty(propertiesNode, serializerProvider);
        assertTrue(propertiesNode.has("textField"));

        // SchemaAware serializer branch
        ObjectNode customPropertiesNode = JsonNodeFactory.instance.objectNode();
        bpw.assignSerializer(new DummySchemaAwareSerializer());
        bpw.depositSchemaProperty(customPropertiesNode, serializerProvider);
        assertTrue(customPropertiesNode.has("textField"));
        assertEquals("dummy", customPropertiesNode.get("textField").get("type").asText());
    }

    @Test
    public void testFindAndAddDynamic_withNonTrivialBaseType() throws Exception {
        BeanPropertyWriter bpw = buildMethodWriter("getGenericList", "genericList", false);
        JavaType collectionType = mapper.constructType(List.class);
        bpw.setNonTrivialBaseType(collectionType);

        SampleBean bean = new SampleBean();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        bpw.serializeAsField(bean, gen, serializerProvider);
        gen.writeEndObject();
        gen.close();

        assertEquals("{\"genericList\":[]}", sw.toString());
    }

    @Test
    public void testGetAndToString() throws Exception {
        BeanPropertyWriter fieldBpw = buildFieldWriter("textField", false, null);
        SampleBean bean = new SampleBean();
        bean.textField = "val123";
        assertEquals("val123", fieldBpw.get(bean));
        assertTrue(fieldBpw.toString().contains("field \""));
        assertTrue(fieldBpw.toString().contains("no static serializer"));

        fieldBpw.assignSerializer(new StringSerializer());
        assertTrue(fieldBpw.toString().contains("static serializer of type"));

        BeanPropertyWriter methodBpw = buildMethodWriter("getMethodProp", "methodProp", false);
        assertEquals("methodValue", methodBpw.get(bean));
        assertTrue(methodBpw.toString().contains("via method "));

        BeanPropertyWriter virtualBpw = buildVirtualWriter("virtualProp");
        assertTrue(virtualBpw.toString().contains("virtual"));
    }

    @Test
    public void testGetSerializedNameAndViews() throws Exception {
        BeanPropertyWriter bpw = buildFieldWriter("textField", false, null);
        assertEquals("textField", bpw.getSerializedName().getValue());
        assertNull(bpw.getViews());
    }
}
