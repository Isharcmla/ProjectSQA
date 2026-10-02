package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.EnumValues;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EnumSerializerTest {

    enum SampleEnum {
        FIRST,
        SECOND;

        @Override
        public String toString() {
            return "toString_" + name();
        }
    }

    static class WrapperBean {
        public SampleEnum defaultEnum = SampleEnum.FIRST;

        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public SampleEnum numberEnum = SampleEnum.FIRST;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public SampleEnum stringEnum = SampleEnum.SECOND;

        @JsonFormat(shape = JsonFormat.Shape.ARRAY)
        public SampleEnum arrayEnum = SampleEnum.FIRST;

        @JsonFormat(shape = JsonFormat.Shape.NATURAL)
        public SampleEnum naturalEnum = SampleEnum.SECOND;

        @JsonFormat(shape = JsonFormat.Shape.SCALAR)
        public SampleEnum scalarEnum = SampleEnum.FIRST;

        @JsonFormat(shape = JsonFormat.Shape.ANY)
        public SampleEnum anyEnum = SampleEnum.FIRST;

        @JsonFormat(shape = JsonFormat.Shape.OBJECT)
        public SampleEnum objectEnum = SampleEnum.FIRST;
    }

    private EnumValues createEnumValues(ObjectMapper mapper, Class<SampleEnum> enumClass) {
        return EnumValues.constructFromName(mapper.getSerializationConfig(), enumClass);
    }

    private DefaultSerializerProvider getSerializerProvider(ObjectMapper mapper) {
        return ((DefaultSerializerProvider) mapper.getSerializerProvider())
                .createInstance(mapper.getSerializationConfig(), mapper.getSerializerFactory());
    }

    private BeanProperty findBeanProperty(ObjectMapper mapper, Class<?> beanClass, String propertyName) {
        JavaType javaType = mapper.constructType(beanClass);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(javaType);
        for (BeanPropertyDefinition def : beanDesc.findProperties()) {
            if (def.getName().equals(propertyName)) {
                AnnotatedMember member = def.getAccessor();
                return new BeanProperty.Std(
                        def.getFullName(),
                        def.getPrimaryType(),
                        def.getWrapperName(),
                        member,
                        def.getMetadata()
                );
            }
        }
        return null;
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructor_initializedProperly() {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values);

        Assert.assertSame(values, serializer.getEnumValues());
        Assert.assertEquals(SampleEnum.class, serializer.handledType());
    }

    @Test
    public void testTwoArgConstructor_initializedProperly() {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        
        EnumSerializer serializerIndexTrue = new EnumSerializer(values, Boolean.TRUE);
        Assert.assertSame(values, serializerIndexTrue.getEnumValues());

        EnumSerializer serializerIndexFalse = new EnumSerializer(values, Boolean.FALSE);
        Assert.assertSame(values, serializerIndexFalse.getEnumValues());

        EnumSerializer serializerIndexNull = new EnumSerializer(values, null);
        Assert.assertSame(values, serializerIndexNull.getEnumValues());
    }

    @Test
    public void testConstructFactory_withValidFormats() {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(mapper.constructType(SampleEnum.class));

        EnumSerializer serDefault = EnumSerializer.construct(SampleEnum.class, config, beanDesc, null);
        Assert.assertNotNull(serDefault);

        EnumSerializer serNumber = EnumSerializer.construct(
                SampleEnum.class, config, beanDesc, JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER));
        Assert.assertNotNull(serNumber);

        EnumSerializer serString = EnumSerializer.construct(
                SampleEnum.class, config, beanDesc, JsonFormat.Value.forShape(JsonFormat.Shape.STRING));
        Assert.assertNotNull(serString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFactory_withUnsupportedShape_throwsException() {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(mapper.constructType(SampleEnum.class));

        EnumSerializer.construct(
                SampleEnum.class, config, beanDesc, JsonFormat.Value.forShape(JsonFormat.Shape.OBJECT));
    }

    @Test
    public void testCreateContextual_nullProperty_returnsSame() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, null);
        SerializerProvider provider = getSerializerProvider(mapper);

        JsonSerializer<?> contextual = serializer.createContextual(provider, null);
        Assert.assertSame(serializer, contextual);
    }

    @Test
    public void testCreateContextual_propertyWithoutFormatOverride_returnsSame() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, null);
        SerializerProvider provider = getSerializerProvider(mapper);
        BeanProperty prop = findBeanProperty(mapper, WrapperBean.class, "defaultEnum");

        JsonSerializer<?> contextual = serializer.createContextual(provider, prop);
        Assert.assertSame(serializer, contextual);
    }

    @Test
    public void testCreateContextual_propertyWithNumberFormat_returnsNewInstanceWithIndexTrue() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, null);
        SerializerProvider provider = getSerializerProvider(mapper);
        BeanProperty prop = findBeanProperty(mapper, WrapperBean.class, "numberEnum");

        JsonSerializer<?> contextual = serializer.createContextual(provider, prop);
        Assert.assertNotSame(serializer, contextual);
        Assert.assertTrue(contextual instanceof EnumSerializer);

        // If contextual serializer already matches shape, calling createContextual should return same
        JsonSerializer<?> sameContextual = ((EnumSerializer) contextual).createContextual(provider, prop);
        Assert.assertSame(contextual, sameContextual);
    }

    @Test
    public void testCreateContextual_propertyWithStringFormat_returnsNewInstanceWithIndexFalse() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, null);
        SerializerProvider provider = getSerializerProvider(mapper);
        BeanProperty prop = findBeanProperty(mapper, WrapperBean.class, "stringEnum");

        JsonSerializer<?> contextual = serializer.createContextual(provider, prop);
        Assert.assertNotSame(serializer, contextual);
        Assert.assertTrue(contextual instanceof EnumSerializer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateContextual_propertyWithObjectFormat_throwsException() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, null);
        SerializerProvider provider = getSerializerProvider(mapper);
        BeanProperty prop = findBeanProperty(mapper, WrapperBean.class, "objectEnum");

        serializer.createContextual(provider, prop);
    }

    @Test
    public void testSerialize_explicitIndexTrue_writesOrdinal() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, Boolean.TRUE);
        SerializerProvider provider = getSerializerProvider(mapper);

        StringWriter writer = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(writer);
        serializer.serialize(SampleEnum.SECOND, gen, provider);
        gen.flush();

        Assert.assertEquals("1", writer.toString());
    }

    @Test
    public void testSerialize_explicitIndexFalse_writesName() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, Boolean.FALSE);
        SerializerProvider provider = getSerializerProvider(mapper);

        StringWriter writer = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(writer);
        serializer.serialize(SampleEnum.FIRST, gen, provider);
        gen.flush();

        Assert.assertEquals("\"FIRST\"", writer.toString());
    }

    @Test
    public void testSerialize_dynamicIndexFeatureEnabled_writesOrdinal() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_INDEX);
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, null);
        SerializerProvider provider = getSerializerProvider(mapper);

        StringWriter writer = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(writer);
        serializer.serialize(SampleEnum.SECOND, gen, provider);
        gen.flush();

        Assert.assertEquals("1", writer.toString());
    }

    @Test
    public void testSerialize_dynamicToStringFeatureEnabled_writesToString() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, null);
        SerializerProvider provider = getSerializerProvider(mapper);

        StringWriter writer = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(writer);
        serializer.serialize(SampleEnum.FIRST, gen, provider);
        gen.flush();

        Assert.assertEquals("\"toString_FIRST\"", writer.toString());
    }

    @Test
    public void testSerialize_defaultSettings_writesName() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, null);
        SerializerProvider provider = getSerializerProvider(mapper);

        StringWriter writer = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(writer);
        serializer.serialize(SampleEnum.SECOND, gen, provider);
        gen.flush();

        Assert.assertEquals("\"SECOND\"", writer.toString());
    }

    @Test
    public void testGetSchema_indexTrue_returnsIntegerSchema() {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, Boolean.TRUE);
        SerializerProvider provider = getSerializerProvider(mapper);

        JsonNode schema = serializer.getSchema(provider, SampleEnum.class);
        Assert.assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_indexFalseWithEnumType_returnsStringSchemaWithEnums() {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, Boolean.FALSE);
        SerializerProvider provider = getSerializerProvider(mapper);

        JsonNode schema = serializer.getSchema(provider, SampleEnum.class);
        Assert.assertEquals("string", schema.get("type").asText());
        Assert.assertNotNull(schema.get("enum"));
        Assert.assertEquals(2, schema.get("enum").size());
        Assert.assertEquals("FIRST", schema.get("enum").get(0).asText());
        Assert.assertEquals("SECOND", schema.get("enum").get(1).asText());
    }

    @Test
    public void testGetSchema_indexFalseWithNullTypeHint_returnsStringSchemaWithoutEnums() {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, Boolean.FALSE);
        SerializerProvider provider = getSerializerProvider(mapper);

        JsonNode schema = serializer.getSchema(provider, null);
        Assert.assertEquals("string", schema.get("type").asText());
        Assert.assertNull(schema.get("enum"));
    }

    @Test
    public void testGetSchema_indexFalseWithNonEnumTypeHint_returnsStringSchemaWithoutEnums() {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, Boolean.FALSE);
        SerializerProvider provider = getSerializerProvider(mapper);

        JsonNode schema = serializer.getSchema(provider, String.class);
        Assert.assertEquals("string", schema.get("type").asText());
        Assert.assertNull(schema.get("enum"));
    }

    @Test
    public void testAcceptJsonFormatVisitor_serializeAsIndex_visitsIntFormat() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, Boolean.TRUE);
        final SerializerProvider provider = getSerializerProvider(mapper);

        final boolean[] intVisited = new boolean[1];
        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base(provider) {
            @Override
            public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
                intVisited[0] = true;
                return new JsonIntegerFormatVisitor.Base();
            }
        };

        serializer.acceptJsonFormatVisitor(visitor, mapper.constructType(SampleEnum.class));
        Assert.assertTrue(intVisited[0]);
    }

    @Test
    public void testAcceptJsonFormatVisitor_stringFormat_defaultNames() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, Boolean.FALSE);
        final SerializerProvider provider = getSerializerProvider(mapper);

        final Set<String> capturedEnums = new HashSet<String>();
        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base(provider) {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) {
                return new JsonStringFormatVisitor.Base() {
                    @Override
                    public void enumTypes(Set<String> enums) {
                        capturedEnums.addAll(enums);
                    }
                };
            }
        };

        serializer.acceptJsonFormatVisitor(visitor, mapper.constructType(SampleEnum.class));
        Assert.assertTrue(capturedEnums.contains("FIRST"));
        Assert.assertTrue(capturedEnums.contains("SECOND"));
    }

    @Test
    public void testAcceptJsonFormatVisitor_stringFormat_withToStringEnabled() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, null);
        final SerializerProvider provider = getSerializerProvider(mapper);

        final Set<String> capturedEnums = new HashSet<String>();
        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base(provider) {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) {
                return new JsonStringFormatVisitor.Base() {
                    @Override
                    public void enumTypes(Set<String> enums) {
                        capturedEnums.addAll(enums);
                    }
                };
            }
        };

        serializer.acceptJsonFormatVisitor(visitor, mapper.constructType(SampleEnum.class));
        Assert.assertTrue(capturedEnums.contains("toString_FIRST"));
        Assert.assertTrue(capturedEnums.contains("toString_SECOND"));
    }

    @Test
    public void testAcceptJsonFormatVisitor_stringFormatVisitorNull_doesNotThrow() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        EnumValues values = createEnumValues(mapper, SampleEnum.class);
        EnumSerializer serializer = new EnumSerializer(values, Boolean.FALSE);
        final SerializerProvider provider = getSerializerProvider(mapper);

        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base(provider) {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) {
                return null;
            }
        };

        serializer.acceptJsonFormatVisitor(visitor, mapper.constructType(SampleEnum.class));
    }

    @Test
    public void testIsShapeWrittenUsingIndex_allBranches() {
        Assert.assertNull(EnumSerializer._isShapeWrittenUsingIndex(SampleEnum.class, null, true));

        Assert.assertNull(EnumSerializer._isShapeWrittenUsingIndex(
                SampleEnum.class, JsonFormat.Value.forShape(JsonFormat.Shape.ANY), true));
        Assert.assertNull(EnumSerializer._isShapeWrittenUsingIndex(
                SampleEnum.class, JsonFormat.Value.forShape(JsonFormat.Shape.SCALAR), true));

        Assert.assertEquals(Boolean.FALSE, EnumSerializer._isShapeWrittenUsingIndex(
                SampleEnum.class, JsonFormat.Value.forShape(JsonFormat.Shape.STRING), true));
        Assert.assertEquals(Boolean.FALSE, EnumSerializer._isShapeWrittenUsingIndex(
                SampleEnum.class, JsonFormat.Value.forShape(JsonFormat.Shape.NATURAL), true));

        Assert.assertEquals(Boolean.TRUE, EnumSerializer._isShapeWrittenUsingIndex(
                SampleEnum.class, JsonFormat.Value.forShape(JsonFormat.Shape.ARRAY), true));
        Assert.assertEquals(Boolean.TRUE, EnumSerializer._isShapeWrittenUsingIndex(
                SampleEnum.class, JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER), true));
        Assert.assertEquals(Boolean.TRUE, EnumSerializer._isShapeWrittenUsingIndex(
                SampleEnum.class, JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER_INT), true));
        Assert.assertEquals(Boolean.TRUE, EnumSerializer._isShapeWrittenUsingIndex(
                SampleEnum.class, JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER_FLOAT), true));

        try {
            EnumSerializer._isShapeWrittenUsingIndex(
                    SampleEnum.class, JsonFormat.Value.forShape(JsonFormat.Shape.BOOLEAN), false);
            Assert.fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("property"));
        }

        try {
            EnumSerializer._isShapeWrittenUsingIndex(
                    SampleEnum.class, JsonFormat.Value.forShape(JsonFormat.Shape.OBJECT), true);
            Assert.fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("class"));
        }
    }

    @Test
    public void testFullSerializationIntegration() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        WrapperBean bean = new WrapperBean();
        String json = mapper.writeValueAsString(bean);

        Assert.assertTrue(json.contains("\"defaultEnum\":\"FIRST\""));
        Assert.assertTrue(json.contains("\"numberEnum\":0"));
        Assert.assertTrue(json.contains("\"stringEnum\":\"SECOND\""));
        Assert.assertTrue(json.contains("\"arrayEnum\":0"));
        Assert.assertTrue(json.contains("\"naturalEnum\":\"SECOND\""));
        Assert.assertTrue(json.contains("\"scalarEnum\":\"FIRST\""));
        Assert.assertTrue(json.contains("\"anyEnum\":\"FIRST\""));
    }
}
