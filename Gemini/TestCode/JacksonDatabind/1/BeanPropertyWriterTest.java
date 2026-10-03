package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public class BeanPropertyWriterTest {

    public interface View1 {}
    public interface View2 {}

    @Retention(RetentionPolicy.RUNTIME)
    public @interface CustomAnnotation {
        String value() default "test";
    }

    public static class TestBean {
        @CustomAnnotation("fieldVal")
        @JsonProperty("fieldProp")
        public String fieldProperty = "fieldValue";

        @JsonProperty("getterProp")
        @JsonView(View1.class)
        public String getGetterProperty() {
            return "getterValue";
        }

        public Object cycleObj;

        public Object getCycleObj() {
            return cycleObj;
        }

        public List<String> listProp = Collections.singletonList("item");

        public List<String> getListProp() {
            return listProp;
        }
    }

    private ObjectMapper _mapper;
    private JavaType _stringType;
    private JavaType _testBeanType;

    @Before
    public void setUp() {
        _mapper = new ObjectMapper();
        _stringType = TypeFactory.defaultInstance().constructType(String.class);
        _testBeanType = TypeFactory.defaultInstance().constructType(TestBean.class);
    }

    private BeanPropertyWriter createMethodWriter(String propName, boolean isRequired, JsonSerializer<?> ser,
                                                  TypeSerializer typeSer, JavaType serType, boolean suppressNulls,
                                                  Object suppressableVal) throws Exception {
        Method method = TestBean.class.getMethod("getGetterProperty");
        AnnotatedMethod annotatedMember = new AnnotatedMethod(method, new AnnotationMap(), new AnnotationMap[0]);
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(
                _mapper.getSerializationConfig(), annotatedMember, propName);
        return new BeanPropertyWriter(propDef, annotatedMember, new AnnotationMap(), _stringType,
                ser, typeSer, serType, suppressNulls, suppressableVal);
    }

    private BeanPropertyWriter createFieldWriter(String propName, boolean isRequired, JsonSerializer<?> ser,
                                                 TypeSerializer typeSer, JavaType serType, boolean suppressNulls,
                                                 Object suppressableVal) throws Exception {
        Field field = TestBean.class.getField("fieldProperty");
        AnnotatedField annotatedMember = new AnnotatedField(field, new AnnotationMap());
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(
                _mapper.getSerializationConfig(), annotatedMember, propName);
        return new BeanPropertyWriter(propDef, annotatedMember, new AnnotationMap(), _stringType,
                ser, typeSer, serType, suppressNulls, suppressableVal);
    }

    @Test
    public void testConstructorsAndAccessors_methodAndFieldProperties_success() throws Exception {
        BeanPropertyWriter methodWriter = createMethodWriter("getterProp", false, null, null, null, false, null);
        BeanPropertyWriter fieldWriter = createFieldWriter("fieldProp", false, null, null, null, false, null);

        Assert.assertEquals("getterProp", methodWriter.getName());
        Assert.assertEquals(new SerializedString("getterProp"), methodWriter.getSerializedName());
        Assert.assertEquals(_stringType, methodWriter.getType());
        Assert.assertNull(methodWriter.getWrapperName());
        Assert.assertFalse(methodWriter.isRequired());
        Assert.assertEquals(String.class, methodWriter.getPropertyType());
        Assert.assertEquals(String.class, methodWriter.getGenericPropertyType());
        Assert.assertNotNull(methodWriter.getMember());
        Assert.assertFalse(methodWriter.hasSerializer());
        Assert.assertFalse(methodWriter.hasNullSerializer());
        Assert.assertFalse(methodWriter.willSuppressNulls());
        Assert.assertNull(methodWriter.getSerializer());
        Assert.assertNull(methodWriter.getSerializationType());
        Assert.assertNull(methodWriter.getRawSerializationType());

        Assert.assertEquals("fieldProp", fieldWriter.getName());
        Assert.assertEquals(String.class, fieldWriter.getPropertyType());
        Assert.assertEquals(String.class, fieldWriter.getGenericPropertyType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidMemberType_throwsIllegalArgumentException() {
        AnnotatedParameter invalidMember = new AnnotatedParameter(null, null, null, 0);
        BeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(
                _mapper.getSerializationConfig(), invalidMember, "testProp");
        new BeanPropertyWriter(propDef, invalidMember, new AnnotationMap(), _stringType,
                null, null, null, false, null);
    }

    @Test
    public void testCopyConstructor_preservesAllState() throws Exception {
        BeanPropertyWriter base = createMethodWriter("baseProp", false, null, null, _stringType, true, "default");
        base.setInternalSetting("key1", "val1");

        BeanPropertyWriter copy = new BeanPropertyWriter(base);
        Assert.assertEquals(base.getName(), copy.getName());
        Assert.assertEquals(base.getType(), copy.getType());
        Assert.assertEquals(base.getSerializationType(), copy.getSerializationType());
        Assert.assertEquals(base.willSuppressNulls(), copy.willSuppressNulls());
        Assert.assertEquals("val1", copy.getInternalSetting("key1"));
    }

    @Test
    public void testRename_differentNameAndSameName_returnsAppropriateInstance() throws Exception {
        BeanPropertyWriter writer = createMethodWriter("prop", false, null, null, null, false, null);

        BeanPropertyWriter renamed = writer.rename(new NameTransformer() {
            @Override
            public String transform(String name) {
                return "prefix_" + name;
            }

            @Override
            public String reverse(String transformed) {
                return transformed.substring("prefix_".length());
            }
        });
        Assert.assertEquals("prefix_prop", renamed.getName());

        BeanPropertyWriter unchanged = writer.rename(NameTransformer.NOP);
        Assert.assertSame(writer, unchanged);
    }

    @Test
    public void testAssignSerializer_successAndOverrideException() throws Exception {
        BeanPropertyWriter writer = createMethodWriter("prop", false, null, null, null, false, null);
        Assert.assertFalse(writer.hasSerializer());

        JsonSerializer<Object> ser1 = _mapper.getSerializerProviderInstance().findValueSerializer(String.class, writer);
        writer.assignSerializer(ser1);
        Assert.assertTrue(writer.hasSerializer());
        Assert.assertSame(ser1, writer.getSerializer());

        // Assign same instance should succeed
        writer.assignSerializer(ser1);

        // Assign different instance should throw IllegalStateException
        JsonSerializer<Object> ser2 = _mapper.getSerializerProviderInstance().findValueSerializer(Integer.class, writer);
        try {
            writer.assignSerializer(ser2);
            Assert.fail("Expected IllegalStateException on overriding serializer");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("Can not override serializer"));
        }
    }

    @Test
    public void testAssignNullSerializer_successAndOverrideException() throws Exception {
        BeanPropertyWriter writer = createMethodWriter("prop", false, null, null, null, false, null);
        Assert.assertFalse(writer.hasNullSerializer());

        JsonSerializer<Object> nullSer1 = _mapper.getSerializerProviderInstance().findNullValueSerializer(writer);
        writer.assignNullSerializer(nullSer1);
        Assert.assertTrue(writer.hasNullSerializer());

        // Assign same instance should succeed
        writer.assignNullSerializer(nullSer1);

        // Assign different instance should throw IllegalStateException
        JsonSerializer<Object> nullSer2 = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) {}
        };
        try {
            writer.assignNullSerializer(nullSer2);
            Assert.fail("Expected IllegalStateException on overriding null serializer");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("Can not override null serializer"));
        }
    }

    @Test
    public void testUnwrappingWriter_createsUnwrappingBeanPropertyWriter() throws Exception {
        BeanPropertyWriter writer = createMethodWriter("prop", false, null, null, null, false, null);
        BeanPropertyWriter unwrapping = writer.unwrappingWriter(NameTransformer.NOP);
        Assert.assertNotNull(unwrapping);
        Assert.assertTrue(unwrapping instanceof UnwrappingBeanPropertyWriter);
    }

    @Test
    public void testInternalSettings_putGetRemoveOperations() throws Exception {
        BeanPropertyWriter writer = createMethodWriter("prop", false, null, null, null, false, null);

        Assert.assertNull(writer.getInternalSetting("nonExistent"));
        Assert.assertNull(writer.removeInternalSetting("nonExistent"));

        Assert.assertNull(writer.setInternalSetting("key1", "value1"));
        Assert.assertEquals("value1", writer.getInternalSetting("key1"));

        Assert.assertEquals("value1", writer.setInternalSetting("key1", "value2"));
        Assert.assertEquals("value2", writer.getInternalSetting("key1"));

        Assert.assertNull(writer.setInternalSetting("key2", "value3"));
        Assert.assertEquals("value2", writer.removeInternalSetting("key1"));
        Assert.assertNull(writer.getInternalSetting("key1"));
        Assert.assertEquals("value3", writer.removeInternalSetting("key2"));
        Assert.assertNull(writer.getInternalSetting("key2"));
        Assert.assertNull(writer.removeInternalSetting("key2"));
    }

    @Test
    public void testAnnotations_getAnnotationAndGetContextAnnotation() throws Exception {
        AnnotationMap memberAnnos = new AnnotationMap();
        CustomAnnotation ca = TestBean.class.getField("fieldProperty").getAnnotation(CustomAnnotation.class);
        memberAnnos.add(ca);

        Field field = TestBean.class.getField("fieldProperty");
        AnnotatedField annotatedMember = new AnnotatedField(field, memberAnnos);

        AnnotationMap contextAnnos = new AnnotationMap();
        contextAnnos.add(ca);

        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(
                _mapper.getSerializationConfig(), annotatedMember, "fieldProp");

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, annotatedMember, contextAnnos, _stringType,
                null, null, null, false, null);

        Assert.assertNotNull(writer.getAnnotation(CustomAnnotation.class));
        Assert.assertEquals("fieldVal", writer.getAnnotation(CustomAnnotation.class).value());
        Assert.assertNull(writer.getAnnotation(JsonProperty.class));

        Assert.assertNotNull(writer.getContextAnnotation(CustomAnnotation.class));
        Assert.assertEquals("fieldVal", writer.getContextAnnotation(CustomAnnotation.class).value());
        Assert.assertNull(writer.getContextAnnotation(JsonProperty.class));
    }

    @Test
    public void testDepositSchemaProperty_visitorVariants() throws Exception {
        BeanPropertyWriter writer = createMethodWriter("prop", false, null, null, null, false, null);

        // Null visitor should not fail
        writer.depositSchemaProperty((JsonObjectFormatVisitor) null);

        final boolean[] visited = new boolean[]{false, false};
        JsonObjectFormatVisitor.Base visitor = new JsonObjectFormatVisitor.Base() {
            @Override
            public void property(BeanProperty prop) {
                visited[0] = true;
            }

            @Override
            public void optionalProperty(BeanProperty prop) {
                visited[1] = true;
            }
        };

        writer.depositSchemaProperty(visitor);
        Assert.assertFalse(visited[0]);
        Assert.assertTrue(visited[1]);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDepositSchemaProperty_objectNodeWithAndWithoutSerializer() throws Exception {
        SerializerProvider prov = _mapper.getSerializerProviderInstance();
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();

        // 1. Without pre-configured serializer, dynamic lookup
        BeanPropertyWriter writer = createMethodWriter("prop", false, null, null, null, false, null);
        writer.depositSchemaProperty(objectNode, prov);
        Assert.assertTrue(objectNode.has("prop"));

        // 2. With pre-configured serializer and serialization type
        ObjectNode objectNode2 = JsonNodeFactory.instance.objectNode();
        JsonSerializer<Object> ser = prov.findValueSerializer(String.class, writer);
        BeanPropertyWriter writerWithSer = createMethodWriter("prop2", false, ser, null, _stringType, false, null);
        writerWithSer.depositSchemaProperty(objectNode2, prov);
        Assert.assertTrue(objectNode2.has("prop2"));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testIsRequiredDeprecated() throws Exception {
        BeanPropertyWriter writer = createMethodWriter("prop", false, null, null, null, false, null);
        Assert.assertFalse(writer.isRequired(null));
    }

    @Test
    public void testSerializeAsField_normalAndSuppressions() throws Exception {
        SerializerProvider prov = _mapper.getSerializerProviderInstance();
        TestBean bean = new TestBean();

        // 1. Normal field serialization with dynamic serializer lookup
        BeanPropertyWriter writer = createMethodWriter("getterProp", false, null, null, null, false, null);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        writer.serializeAsField(bean, gen, prov);
        gen.writeEndObject();
        gen.close();
        Assert.assertEquals("{\"getterProp\":\"getterValue\"}", sw.toString());

        // 2. Self-referential object serialization throws JsonMappingException
        Method cycleMethod = TestBean.class.getMethod("getCycleObj");
        AnnotatedMethod cycleMember = new AnnotatedMethod(cycleMethod, new AnnotationMap(), new AnnotationMap[0]);
        SimpleBeanPropertyDefinition cyclePropDef = SimpleBeanPropertyDefinition.construct(
                _mapper.getSerializationConfig(), cycleMember, "cycleObj");
        BeanPropertyWriter cycleWriter = new BeanPropertyWriter(cyclePropDef, cycleMember, new AnnotationMap(),
                _testBeanType, null, null, null, false, null);

        bean.cycleObj = bean;
        StringWriter swCycle = new StringWriter();
        JsonGenerator genCycle = _mapper.getFactory().createGenerator(swCycle);
        genCycle.writeStartObject();
        try {
            cycleWriter.serializeAsField(bean, genCycle, prov);
            Assert.fail("Expected JsonMappingException on self reference");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Direct self-reference leading to cycle"));
        }
        genCycle.close();
    }

    @Test
    public void testSerializeAsField_nullHandling() throws Exception {
        SerializerProvider prov = _mapper.getSerializerProviderInstance();
        TestBean bean = new TestBean();
        bean.fieldProperty = null;

        // Null value without null serializer -> suppressed
        BeanPropertyWriter writer = createFieldWriter("fieldProp", false, null, null, null, false, null);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        writer.serializeAsField(bean, gen, prov);
        gen.writeEndObject();
        gen.close();
        Assert.assertEquals("{}", sw.toString());

        // Null value with null serializer -> written as null
        writer.assignNullSerializer(prov.findNullValueSerializer(writer));
        StringWriter sw2 = new StringWriter();
        JsonGenerator gen2 = _mapper.getFactory().createGenerator(sw2);
        gen2.writeStartObject();
        writer.serializeAsField(bean, gen2, prov);
        gen2.writeEndObject();
        gen2.close();
        Assert.assertEquals("{\"fieldProp\":null}", sw2.toString());
    }

    @Test
    public void testSerializeAsField_suppressValueMarkerAndDefault() throws Exception {
        SerializerProvider prov = _mapper.getSerializerProviderInstance();
        TestBean bean = new TestBean();

        // Suppress matching value
        BeanPropertyWriter suppressValWriter = createFieldWriter("fieldProp", false, null, null, null,
                true, "fieldValue");
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        suppressValWriter.serializeAsField(bean, gen, prov);
        gen.writeEndObject();
        gen.close();
        Assert.assertEquals("{}", sw.toString());

        // Suppress MARKER_FOR_EMPTY
        BeanPropertyWriter markerWriter = createFieldWriter("fieldProp", false, null, null, null,
                true, BeanPropertyWriter.MARKER_FOR_EMPTY);
        bean.fieldProperty = "";
        StringWriter sw2 = new StringWriter();
        JsonGenerator gen2 = _mapper.getFactory().createGenerator(sw2);
        gen2.writeStartObject();
        markerWriter.serializeAsField(bean, gen2, prov);
        gen2.writeEndObject();
        gen2.close();
        Assert.assertEquals("{}", sw2.toString());
    }

    @Test
    public void testSerializeAsColumn_normalAndPlaceholders() throws Exception {
        SerializerProvider prov = _mapper.getSerializerProviderInstance();
        TestBean bean = new TestBean();

        // 1. Normal column serialization
        BeanPropertyWriter writer = createFieldWriter("fieldProp", false, null, null, null, false, null);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _mapper.getFactory().createGenerator(sw);
        gen.writeStartArray();
        writer.serializeAsColumn(bean, gen, prov);
        gen.writeEndArray();
        gen.close();
        Assert.assertEquals("[\"fieldValue\"]", sw.toString());

        // 2. Null value without null serializer -> writes null
        bean.fieldProperty = null;
        StringWriter sw2 = new StringWriter();
        JsonGenerator gen2 = _mapper.getFactory().createGenerator(sw2);
        gen2.writeStartArray();
        writer.serializeAsColumn(bean, gen2, prov);
        gen2.writeEndArray();
        gen2.close();
        Assert.assertEquals("[null]", sw2.toString());

        // 3. Null value with null serializer
        writer.assignNullSerializer(prov.findNullValueSerializer(writer));
        StringWriter sw3 = new StringWriter();
        JsonGenerator gen3 = _mapper.getFactory().createGenerator(sw3);
        gen3.writeStartArray();
        writer.serializeAsColumn(bean, gen3, prov);
        gen3.writeEndArray();
        gen3.close();
        Assert.assertEquals("[null]", sw3.toString());

        // 4. Suppress value in column -> outputs placeholder
        BeanPropertyWriter suppressValWriter = createFieldWriter("fieldProp", false, null, null, null,
                true, "suppressMe");
        bean.fieldProperty = "suppressMe";
        StringWriter sw4 = new StringWriter();
        JsonGenerator gen4 = _mapper.getFactory().createGenerator(sw4);
        gen4.writeStartArray();
        suppressValWriter.serializeAsColumn(bean, gen4, prov);
        gen4.writeEndArray();
        gen4.close();
        Assert.assertEquals("[null]", sw4.toString());

        // 5. Suppress MARKER_FOR_EMPTY in column -> outputs placeholder
        BeanPropertyWriter emptyMarkerWriter = createFieldWriter("fieldProp", false, null, null, null,
                true, BeanPropertyWriter.MARKER_FOR_EMPTY);
        bean.fieldProperty = "";
        StringWriter sw5 = new StringWriter();
        JsonGenerator gen5 = _mapper.getFactory().createGenerator(sw5);
        gen5.writeStartArray();
        emptyMarkerWriter.serializeAsColumn(bean, gen5, prov);
        gen5.writeEndArray();
        gen5.close();
        Assert.assertEquals("[null]", sw5.toString());
    }

    @Test
    public void testSerializeAsPlaceholder_nullSerializerVariants() throws Exception {
        SerializerProvider prov = _mapper.getSerializerProviderInstance();
        TestBean bean = new TestBean();
        BeanPropertyWriter writer = createFieldWriter("fieldProp", false, null, null, null, false, null);

        // Without null serializer
        StringWriter sw1 = new StringWriter();
        JsonGenerator gen1 = _mapper.getFactory().createGenerator(sw1);
        writer.serializeAsPlaceholder(bean, gen1, prov);
        gen1.close();
        Assert.assertEquals("null", sw1.toString());

        // With null serializer
        writer.assignNullSerializer(prov.findNullValueSerializer(writer));
        StringWriter sw2 = new StringWriter();
        JsonGenerator gen2 = _mapper.getFactory().createGenerator(sw2);
        writer.serializeAsPlaceholder(bean, gen2, prov);
        gen2.close();
        Assert.assertEquals("null", sw2.toString());
    }

    @Test
    public void testNonTrivialBaseType_dynamicSerializerLookup() throws Exception {
        Method method = TestBean.class.getMethod("getListProp");
        AnnotatedMethod annotatedMember = new AnnotatedMethod(method, new AnnotationMap(), new AnnotationMap[0]);
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(
                _mapper.getSerializationConfig(), annotatedMember, "listProp");

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, annotatedMember, new AnnotationMap(),
                listType, null, null, null, false, null);
        writer.setNonTrivialBaseType(listType);

        TestBean bean = new TestBean();
        SerializerProvider prov = _mapper.getSerializerProviderInstance();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = _mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
        writer.serializeAsField(bean, gen, prov);
        gen.writeEndObject();
        gen.close();
        Assert.assertEquals("{\"listProp\":[\"item\"]}", sw.toString());
    }

    @Test
    public void testGetViews_returnsConfiguredViews() throws Exception {
        Method method = TestBean.class.getMethod("getGetterProperty");
        AnnotatedMethod annotatedMember = new AnnotatedMethod(method, new AnnotationMap(), new AnnotationMap[0]);
        POJOPropertyBuilder propDef = new POJOPropertyBuilder(new PropertyName("getterProp"),
                _mapper.getSerializationConfig().getAnnotationIntrospector(), true);
        propDef.addGetter(annotatedMember, new PropertyName("getterProp"), false, true, false);

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, annotatedMember, new AnnotationMap(),
                _stringType, null, null, null, false, null);

        Class<?>[] views = writer.getViews();
        Assert.assertNotNull(views);
        Assert.assertEquals(1, views.length);
        Assert.assertEquals(View1.class, views[0]);
    }

    @Test
    public void testToString_formattingMethodAndField() throws Exception {
        BeanPropertyWriter methodWriter = createMethodWriter("getterProp", false, null, null, null, false, null);
        String methodStr = methodWriter.toString();
        Assert.assertTrue(methodStr.contains("property 'getterProp'"));
        Assert.assertTrue(methodStr.contains("via method"));
        Assert.assertTrue(methodStr.contains("no static serializer"));

        BeanPropertyWriter fieldWriter = createFieldWriter("fieldProp", false, null, null, null, false, null);
        fieldWriter.assignSerializer(_mapper.getSerializerProviderInstance().findValueSerializer(String.class, fieldWriter));
        String fieldStr = fieldWriter.toString();
        Assert.assertTrue(fieldStr.contains("property 'fieldProp'"));
        Assert.assertTrue(fieldStr.contains("field \""));
        Assert.assertTrue(fieldStr.contains("static serializer of type"));
    }
}
