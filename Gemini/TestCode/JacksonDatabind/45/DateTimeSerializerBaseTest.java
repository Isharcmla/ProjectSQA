package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

public class DateTimeSerializerBaseTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    static class DummyDateTimeSerializer extends DateTimeSerializerBase<Date> {
        private static final long serialVersionUID = 1L;

        public DummyDateTimeSerializer() {
            this(null, null);
        }

        public DummyDateTimeSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public DummyDateTimeSerializer withFormat(Boolean timestamp, DateFormat customFormat) {
            return new DummyDateTimeSerializer(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return (value == null) ? 0L : value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (_asTimestamp(serializers)) {
                gen.writeNumber(_timestamp(value));
            } else if (_customFormat != null) {
                synchronized (_customFormat) {
                    gen.writeString(_customFormat.format(value));
                }
            } else {
                gen.writeString(serializers.getConfig().getDateFormat().format(value));
            }
        }

        public Boolean getUseTimestamp() {
            return _useTimestamp;
        }

        public DateFormat getCustomFormat() {
            return _customFormat;
        }

        public boolean checkAsTimestamp(SerializerProvider serializers) {
            return _asTimestamp(serializers);
        }
    }

    static class FormatBeanNumeric {
        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public Date date;
    }

    static class FormatBeanStringWithCustomValues {
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", locale = "fr_FR", timezone = "GMT+2")
        public Date date;
    }

    static class FormatBeanStringDefaults {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public Date date;
    }

    static class FormatBeanObject {
        @JsonFormat(shape = JsonFormat.Shape.OBJECT)
        public Date date;
    }

    static class FormatBeanNone {
        public Date date;
    }

    static class DummyFormatVisitor extends JsonFormatVisitorWrapper.Base {
        boolean integerVisited = false;
        boolean stringVisited = false;
        JsonParser.NumberType numberType;
        JsonValueFormat valueFormat;

        public DummyFormatVisitor(SerializerProvider provider) {
            super(provider);
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            integerVisited = true;
            return new JsonIntegerFormatVisitor.Base() {
                @Override
                public void numberType(JsonParser.NumberType type) {
                    numberType = type;
                }

                @Override
                public void format(JsonValueFormat format) {
                    valueFormat = format;
                }
            };
        }

        @Override
        public JsonStringFormatVisitor expectStringFormat(JavaType type) {
            stringVisited = true;
            return new JsonStringFormatVisitor.Base() {
                @Override
                public void format(JsonValueFormat format) {
                    valueFormat = format;
                }
            };
        }
    }

    private BeanProperty createBeanProperty(Class<?> containingClass) {
        JavaType javaType = objectMapper.constructType(containingClass);
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(javaType);
        for (BeanPropertyDefinition propDef : beanDesc.findProperties()) {
            if ("date".equals(propDef.getName())) {
                AnnotatedMember member = propDef.getPrimaryMember();
                return new BeanProperty.Std(
                        PropertyName.construct("date"),
                        objectMapper.constructType(Date.class),
                        null,
                        beanDesc.getClassAnnotations(),
                        member,
                        PropertyMetadata.STD_REQUIRED);
            }
        }
        return null;
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testIsEmpty_deprecatedSingleArg_returnsExpected() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        Assert.assertTrue(serializer.isEmpty(null));
        Assert.assertTrue(serializer.isEmpty(new Date(0L)));
        Assert.assertFalse(serializer.isEmpty(new Date(100L)));
        Assert.assertFalse(serializer.isEmpty(new Date(-100L)));
    }

    @Test
    public void testIsEmpty_withSerializerProvider_returnsExpected() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();

        Assert.assertTrue(serializer.isEmpty(provider, null));
        Assert.assertTrue(serializer.isEmpty(provider, new Date(0L)));
        Assert.assertFalse(serializer.isEmpty(provider, new Date(123456789L)));
        Assert.assertFalse(serializer.isEmpty(provider, new Date(-1L)));
    }

    @Test
    public void testAsTimestamp_explicitUseTimestampTrue_returnsTrue() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.TRUE, null);
        Assert.assertTrue(serializer.checkAsTimestamp(null));
    }

    @Test
    public void testAsTimestamp_explicitUseTimestampFalse_returnsFalse() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.FALSE, null);
        Assert.assertFalse(serializer.checkAsTimestamp(null));
    }

    @Test
    public void testAsTimestamp_customFormatNonNull_returnsFalse() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(null, new SimpleDateFormat("yyyy-MM-dd"));
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        Assert.assertFalse(serializer.checkAsTimestamp(provider));
    }

    @Test
    public void testAsTimestamp_nullUseTimestampAndNullCustomFormat_usesProviderFeature() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(null, null);

        objectMapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        SerializerProvider providerWithTimestamp = objectMapper.getSerializerProviderInstance();
        Assert.assertTrue(serializer.checkAsTimestamp(providerWithTimestamp));

        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        SerializerProvider providerWithoutTimestamp = objectMapper.getSerializerProviderInstance();
        Assert.assertFalse(serializer.checkAsTimestamp(providerWithoutTimestamp));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsTimestamp_nullProviderWithNullFormat_throwsIllegalArgumentException() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(null, null);
        serializer.checkAsTimestamp(null);
    }

    @Test
    public void testGetSchema_asTimestamp_returnsNumberSchema() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.TRUE, null);
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        JsonNode schema = serializer.getSchema(provider, Date.class);

        Assert.assertNotNull(schema);
        Assert.assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testGetSchema_asString_returnsStringSchema() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.FALSE, null);
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        JsonNode schema = serializer.getSchema(provider, Date.class);

        Assert.assertNotNull(schema);
        Assert.assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitor_asNumber_visitsIntegerFormat() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.TRUE, null);
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        DummyFormatVisitor visitor = new DummyFormatVisitor(provider);

        serializer.acceptJsonFormatVisitor(visitor, objectMapper.constructType(Date.class));

        Assert.assertTrue(visitor.integerVisited);
        Assert.assertFalse(visitor.stringVisited);
        Assert.assertEquals(JsonParser.NumberType.LONG, visitor.numberType);
        Assert.assertEquals(JsonValueFormat.UTC_MILLISEC, visitor.valueFormat);
    }

    @Test
    public void testAcceptJsonFormatVisitor_asString_visitsStringFormat() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.FALSE, null);
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        DummyFormatVisitor visitor = new DummyFormatVisitor(provider);

        serializer.acceptJsonFormatVisitor(visitor, objectMapper.constructType(Date.class));

        Assert.assertFalse(visitor.integerVisited);
        Assert.assertTrue(visitor.stringVisited);
        Assert.assertEquals(JsonValueFormat.DATE_TIME, visitor.valueFormat);
    }

    @Test
    public void testCreateContextual_nullProperty_returnsSameInstance() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();

        JsonSerializer<?> contextual = serializer.createContextual(provider, null);
        Assert.assertSame(serializer, contextual);
    }

    @Test
    public void testCreateContextual_noAnnotation_returnsSameInstance() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        BeanProperty property = createBeanProperty(FormatBeanNone.class);

        JsonSerializer<?> contextual = serializer.createContextual(provider, property);
        Assert.assertSame(serializer, contextual);
    }

    @Test
    public void testCreateContextual_shapeNumeric_returnsWithTimestampTrue() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        BeanProperty property = createBeanProperty(FormatBeanNumeric.class);

        JsonSerializer<?> contextual = serializer.createContextual(provider, property);
        Assert.assertTrue(contextual instanceof DummyDateTimeSerializer);
        DummyDateTimeSerializer contextualSerializer = (DummyDateTimeSerializer) contextual;

        Assert.assertEquals(Boolean.TRUE, contextualSerializer.getUseTimestamp());
        Assert.assertNull(contextualSerializer.getCustomFormat());
    }

    @Test
    public void testCreateContextual_shapeStringWithPatternLocaleAndTimezone_configuresCustomFormat() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        BeanProperty property = createBeanProperty(FormatBeanStringWithCustomValues.class);

        JsonSerializer<?> contextual = serializer.createContextual(provider, property);
        Assert.assertTrue(contextual instanceof DummyDateTimeSerializer);
        DummyDateTimeSerializer contextualSerializer = (DummyDateTimeSerializer) contextual;

        Assert.assertEquals(Boolean.FALSE, contextualSerializer.getUseTimestamp());
        Assert.assertNotNull(contextualSerializer.getCustomFormat());
        Assert.assertTrue(contextualSerializer.getCustomFormat() instanceof SimpleDateFormat);

        SimpleDateFormat sdf = (SimpleDateFormat) contextualSerializer.getCustomFormat();
        Assert.assertEquals("yyyy/MM/dd", sdf.toPattern());
        Assert.assertEquals(TimeZone.getTimeZone("GMT+2"), sdf.getTimeZone());
    }

    @Test
    public void testCreateContextual_shapeStringDefaults_usesContextDefaults() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        BeanProperty property = createBeanProperty(FormatBeanStringDefaults.class);

        JsonSerializer<?> contextual = serializer.createContextual(provider, property);
        Assert.assertTrue(contextual instanceof DummyDateTimeSerializer);
        DummyDateTimeSerializer contextualSerializer = (DummyDateTimeSerializer) contextual;

        Assert.assertEquals(Boolean.FALSE, contextualSerializer.getUseTimestamp());
        Assert.assertNotNull(contextualSerializer.getCustomFormat());
        Assert.assertTrue(contextualSerializer.getCustomFormat() instanceof SimpleDateFormat);

        SimpleDateFormat sdf = (SimpleDateFormat) contextualSerializer.getCustomFormat();
        Assert.assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSSZ", sdf.toPattern());
        Assert.assertEquals(provider.getTimeZone(), sdf.getTimeZone());
    }

    @Test
    public void testCreateContextual_shapeOther_returnsSameInstance() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        BeanProperty property = createBeanProperty(FormatBeanObject.class);

        JsonSerializer<?> contextual = serializer.createContextual(provider, property);
        Assert.assertSame(serializer, contextual);
    }

    @Test
    public void testSerialize_asTimestamp_writesNumericValue() throws IOException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.TRUE, null);
        StringWriter writer = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(writer);
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();

        serializer.serialize(new Date(1600000000000L), gen, provider);
        gen.flush();

        Assert.assertEquals("1600000000000", writer.toString());
    }

    @Test
    public void testSerialize_withCustomFormat_writesFormattedString() throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.FALSE, sdf);

        StringWriter writer = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(writer);
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();

        serializer.serialize(new Date(0L), gen, provider);
        gen.flush();

        Assert.assertEquals("\"1970-01-01\"", writer.toString());
    }
}
