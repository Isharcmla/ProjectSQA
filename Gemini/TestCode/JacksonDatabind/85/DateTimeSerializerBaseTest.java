package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

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
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeSerializerBaseTest {

    private ObjectMapper mapper;
    private SerializerProvider defaultProvider;

    static class DummyDateTimeSerializer extends DateTimeSerializerBase<Date> {
        private static final long serialVersionUID = 1L;

        public DummyDateTimeSerializer() {
            super(Date.class, null, null);
        }

        public DummyDateTimeSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        public Boolean getUseTimestamp() {
            return _useTimestamp;
        }

        public DateFormat getCustomFormat() {
            return _customFormat;
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new DummyDateTimeSerializer(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return value == null ? 0L : value.getTime();
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
                gen.writeString(value.toString());
            }
        }

        public boolean publicAsTimestamp(SerializerProvider serializers) {
            return _asTimestamp(serializers);
        }

        public void publicAcceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint, boolean asNumber)
                throws JsonMappingException {
            _acceptJsonFormatVisitor(visitor, typeHint, asNumber);
        }
    }

    static class FormattedBean {
        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public Date dateNumber;

        @JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
        public Date dateNumberInt;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public Date dateStringDefault;

        @JsonFormat(pattern = "yyyy/MM/dd")
        public Date datePatternOnly;

        @JsonFormat(locale = "fr_FR")
        public Date dateLocaleOnly;

        @JsonFormat(timezone = "PST")
        public Date dateTimeZoneOnly;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", locale = "en_US", timezone = "GMT+5")
        public Date dateFullyCustom;

        @JsonFormat(shape = JsonFormat.Shape.OBJECT)
        public Date dateShapeObject;

        public Date datePlain;
    }

    static class TrackingVisitor extends JsonFormatVisitorWrapper.Base {
        public boolean intVisited = false;
        public boolean stringVisited = false;
        public JsonParser.NumberType numberType;
        public JsonValueFormat valueFormat;

        public TrackingVisitor(SerializerProvider p) {
            super(p);
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            intVisited = true;
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

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        defaultProvider = mapper.getSerializerProviderInstance();
    }

    private BeanProperty getBeanProperty(Class<?> cls, String propertyName) {
        JavaType javaType = mapper.constructType(cls);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(javaType);
        List<BeanPropertyDefinition> props = beanDesc.findProperties();
        for (BeanPropertyDefinition propDef : props) {
            if (propDef.getName().equals(propertyName)) {
                AnnotatedMember member = propDef.getPrimaryMember();
                return new BeanProperty.Std(
                        PropertyName.construct(propDef.getName()),
                        propDef.getPrimaryType(),
                        null,
                        member,
                        propDef.getMetadata()
                );
            }
        }
        return null;
    }

    @Test
    public void testIsEmpty_deprecated_nullValue_returnsTrue() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        Assert.assertTrue(serializer.isEmpty(null));
    }

    @Test
    public void testIsEmpty_deprecated_zeroTimestamp_returnsTrue() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        Assert.assertTrue(serializer.isEmpty(new Date(0L)));
    }

    @Test
    public void testIsEmpty_deprecated_nonZeroTimestamp_returnsFalse() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        Assert.assertFalse(serializer.isEmpty(new Date(123456789L)));
        Assert.assertFalse(serializer.isEmpty(new Date(-123456789L)));
    }

    @Test
    public void testIsEmpty_withProvider_nullValue_returnsTrue() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        Assert.assertTrue(serializer.isEmpty(defaultProvider, null));
    }

    @Test
    public void testIsEmpty_withProvider_zeroTimestamp_returnsTrue() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        Assert.assertTrue(serializer.isEmpty(defaultProvider, new Date(0L)));
    }

    @Test
    public void testIsEmpty_withProvider_nonZeroTimestamp_returnsFalse() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        Assert.assertFalse(serializer.isEmpty(defaultProvider, new Date(123456789L)));
        Assert.assertFalse(serializer.isEmpty(defaultProvider, new Date(-123456789L)));
    }

    @Test
    public void testAsTimestamp_useTimestampExplicitTrue_returnsTrue() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.TRUE, null);
        Assert.assertTrue(serializer.publicAsTimestamp(null));
        Assert.assertTrue(serializer.publicAsTimestamp(defaultProvider));
    }

    @Test
    public void testAsTimestamp_useTimestampExplicitFalse_returnsFalse() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.FALSE, null);
        Assert.assertFalse(serializer.publicAsTimestamp(null));
        Assert.assertFalse(serializer.publicAsTimestamp(defaultProvider));
    }

    @Test
    public void testAsTimestamp_customFormatNonNull_returnsFalse() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(null, df);
        Assert.assertFalse(serializer.publicAsTimestamp(null));
        Assert.assertFalse(serializer.publicAsTimestamp(defaultProvider));
    }

    @Test
    public void testAsTimestamp_nullUseTimestampAndNullCustomFormat_usesProviderSettings() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(null, null);

        mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        SerializerProvider providerTimestampOn = mapper.getSerializerProviderInstance();
        Assert.assertTrue(serializer.publicAsTimestamp(providerTimestampOn));

        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        SerializerProvider providerTimestampOff = mapper.getSerializerProviderInstance();
        Assert.assertFalse(serializer.publicAsTimestamp(providerTimestampOff));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsTimestamp_nullProviderWhenFormatAndFlagAreNull_throwsException() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(null, null);
        serializer.publicAsTimestamp(null);
    }

    @Test
    public void testGetSchema_asTimestampTrue_returnsNumberType() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.TRUE, null);
        JsonNode schemaNode = serializer.getSchema(defaultProvider, null);
        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("number", schemaNode.get("type").asText());
    }

    @Test
    public void testGetSchema_asTimestampFalse_returnsStringType() {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.FALSE, null);
        JsonNode schemaNode = serializer.getSchema(defaultProvider, null);
        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("string", schemaNode.get("type").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitor_asNumberTrue_callsVisitIntFormat() throws Exception {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.TRUE, null);
        TrackingVisitor visitor = new TrackingVisitor(defaultProvider);
        JavaType type = mapper.constructType(Date.class);

        serializer.acceptJsonFormatVisitor(visitor, type);

        Assert.assertTrue(visitor.intVisited);
        Assert.assertFalse(visitor.stringVisited);
        Assert.assertEquals(JsonParser.NumberType.LONG, visitor.numberType);
        Assert.assertEquals(JsonValueFormat.UTC_MILLISEC, visitor.valueFormat);
    }

    @Test
    public void testAcceptJsonFormatVisitor_asNumberFalse_callsVisitStringFormat() throws Exception {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.FALSE, null);
        TrackingVisitor visitor = new TrackingVisitor(defaultProvider);
        JavaType type = mapper.constructType(Date.class);

        serializer.acceptJsonFormatVisitor(visitor, type);

        Assert.assertFalse(visitor.intVisited);
        Assert.assertTrue(visitor.stringVisited);
        Assert.assertEquals(JsonValueFormat.DATE_TIME, visitor.valueFormat);
    }

    @Test
    public void testAcceptJsonFormatVisitor_directHelperInvocation() throws Exception {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        JavaType type = mapper.constructType(Date.class);

        TrackingVisitor intVisitor = new TrackingVisitor(defaultProvider);
        serializer.publicAcceptJsonFormatVisitor(intVisitor, type, true);
        Assert.assertTrue(intVisitor.intVisited);
        Assert.assertFalse(intVisitor.stringVisited);

        TrackingVisitor strVisitor = new TrackingVisitor(defaultProvider);
        serializer.publicAcceptJsonFormatVisitor(strVisitor, type, false);
        Assert.assertFalse(strVisitor.intVisited);
        Assert.assertTrue(strVisitor.stringVisited);
    }

    @Test
    public void testCreateContextual_nullProperty_returnsThis() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        JsonSerializer<?> contextual = serializer.createContextual(defaultProvider, null);
        Assert.assertSame(serializer, contextual);
    }

    @Test
    public void testCreateContextual_propertyWithoutFormatAnnotation_returnsThis() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        BeanProperty prop = getBeanProperty(FormattedBean.class, "datePlain");
        JsonSerializer<?> contextual = serializer.createContextual(defaultProvider, prop);
        Assert.assertSame(serializer, contextual);
    }

    @Test
    public void testCreateContextual_numericShape_returnsWithTimestampTrue() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        BeanProperty propNumber = getBeanProperty(FormattedBean.class, "dateNumber");
        JsonSerializer<?> resultNumber = serializer.createContextual(defaultProvider, propNumber);
        Assert.assertTrue(resultNumber instanceof DummyDateTimeSerializer);
        DummyDateTimeSerializer dummyResult = (DummyDateTimeSerializer) resultNumber;
        Assert.assertEquals(Boolean.TRUE, dummyResult.getUseTimestamp());
        Assert.assertNull(dummyResult.getCustomFormat());

        BeanProperty propNumberInt = getBeanProperty(FormattedBean.class, "dateNumberInt");
        JsonSerializer<?> resultNumberInt = serializer.createContextual(defaultProvider, propNumberInt);
        Assert.assertTrue(resultNumberInt instanceof DummyDateTimeSerializer);
        DummyDateTimeSerializer dummyResultInt = (DummyDateTimeSerializer) resultNumberInt;
        Assert.assertEquals(Boolean.TRUE, dummyResultInt.getUseTimestamp());
        Assert.assertNull(dummyResultInt.getCustomFormat());
    }

    @Test
    public void testCreateContextual_shapeStringDefault_configuresIsoPatternAndDefaultTzLocale() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        BeanProperty prop = getBeanProperty(FormattedBean.class, "dateStringDefault");
        JsonSerializer<?> result = serializer.createContextual(defaultProvider, prop);

        Assert.assertTrue(result instanceof DummyDateTimeSerializer);
        DummyDateTimeSerializer dummyResult = (DummyDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, dummyResult.getUseTimestamp());
        Assert.assertNotNull(dummyResult.getCustomFormat());
        Assert.assertTrue(dummyResult.getCustomFormat() instanceof SimpleDateFormat);

        SimpleDateFormat sdf = (SimpleDateFormat) dummyResult.getCustomFormat();
        Assert.assertEquals(defaultProvider.getTimeZone(), sdf.getTimeZone());
    }

    @Test
    public void testCreateContextual_patternOnly_configuresPattern() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        BeanProperty prop = getBeanProperty(FormattedBean.class, "datePatternOnly");
        JsonSerializer<?> result = serializer.createContextual(defaultProvider, prop);

        Assert.assertTrue(result instanceof DummyDateTimeSerializer);
        DummyDateTimeSerializer dummyResult = (DummyDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, dummyResult.getUseTimestamp());
        Assert.assertNotNull(dummyResult.getCustomFormat());

        SimpleDateFormat sdf = (SimpleDateFormat) dummyResult.getCustomFormat();
        Assert.assertEquals("yyyy/MM/dd", sdf.toPattern());
        Assert.assertEquals(defaultProvider.getTimeZone(), sdf.getTimeZone());
    }

    @Test
    public void testCreateContextual_localeOnly_configuresLocale() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        BeanProperty prop = getBeanProperty(FormattedBean.class, "dateLocaleOnly");
        JsonSerializer<?> result = serializer.createContextual(defaultProvider, prop);

        Assert.assertTrue(result instanceof DummyDateTimeSerializer);
        DummyDateTimeSerializer dummyResult = (DummyDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, dummyResult.getUseTimestamp());
        Assert.assertNotNull(dummyResult.getCustomFormat());

        SimpleDateFormat sdf = (SimpleDateFormat) dummyResult.getCustomFormat();
        Assert.assertEquals(defaultProvider.getTimeZone(), sdf.getTimeZone());
    }

    @Test
    public void testCreateContextual_timezoneOnly_configuresTimeZone() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        BeanProperty prop = getBeanProperty(FormattedBean.class, "dateTimeZoneOnly");
        JsonSerializer<?> result = serializer.createContextual(defaultProvider, prop);

        Assert.assertTrue(result instanceof DummyDateTimeSerializer);
        DummyDateTimeSerializer dummyResult = (DummyDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, dummyResult.getUseTimestamp());
        Assert.assertNotNull(dummyResult.getCustomFormat());

        SimpleDateFormat sdf = (SimpleDateFormat) dummyResult.getCustomFormat();
        Assert.assertEquals(TimeZone.getTimeZone("PST"), sdf.getTimeZone());
    }

    @Test
    public void testCreateContextual_fullyCustomFormat_configuresAllFields() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        BeanProperty prop = getBeanProperty(FormattedBean.class, "dateFullyCustom");
        JsonSerializer<?> result = serializer.createContextual(defaultProvider, prop);

        Assert.assertTrue(result instanceof DummyDateTimeSerializer);
        DummyDateTimeSerializer dummyResult = (DummyDateTimeSerializer) result;
        Assert.assertEquals(Boolean.FALSE, dummyResult.getUseTimestamp());
        Assert.assertNotNull(dummyResult.getCustomFormat());

        SimpleDateFormat sdf = (SimpleDateFormat) dummyResult.getCustomFormat();
        Assert.assertEquals("dd-MM-yyyy HH:mm:ss", sdf.toPattern());
        Assert.assertEquals(TimeZone.getTimeZone("GMT+5"), sdf.getTimeZone());
    }

    @Test
    public void testCreateContextual_otherShapeWithoutPatternLocaleTz_returnsThis() throws JsonMappingException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer();
        BeanProperty prop = getBeanProperty(FormattedBean.class, "dateShapeObject");
        JsonSerializer<?> result = serializer.createContextual(defaultProvider, prop);
        Assert.assertSame(serializer, result);
    }

    @Test
    public void testSerialize_asTimestamp() throws IOException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.TRUE, null);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        Date date = new Date(1600000000000L);

        serializer.serialize(date, gen, defaultProvider);
        gen.flush();

        Assert.assertEquals("1600000000000", sw.toString());
    }

    @Test
    public void testSerialize_withCustomFormat() throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.FALSE, sdf);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        Date date = new Date(0L); // 1970-01-01

        serializer.serialize(date, gen, defaultProvider);
        gen.flush();

        Assert.assertEquals("\"1970-01-01\"", sw.toString());
    }

    @Test
    public void testSerialize_defaultToString() throws IOException {
        DummyDateTimeSerializer serializer = new DummyDateTimeSerializer(Boolean.FALSE, null);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        Date date = new Date(1000L);

        serializer.serialize(date, gen, defaultProvider);
        gen.flush();

        Assert.assertEquals("\"" + date.toString() + "\"", sw.toString());
    }
}
