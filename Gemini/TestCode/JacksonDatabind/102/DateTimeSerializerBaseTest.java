package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class DateTimeSerializerBaseTest {

    static class ConcreteDateTimeSerializer extends DateTimeSerializerBase<Date> {
        private static final long serialVersionUID = 1L;

        public ConcreteDateTimeSerializer() {
            this(null, null);
        }

        public ConcreteDateTimeSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }

        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new ConcreteDateTimeSerializer(timestamp, customFormat);
        }

        @Override
        protected long _timestamp(Date value) {
            return value == null ? 0L : value.getTime();
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (_asTimestamp(serializers)) {
                gen.writeNumber(_timestamp(value));
            } else {
                _serializeAsString(value, gen, serializers);
            }
        }

        public boolean callAsTimestamp(SerializerProvider serializers) {
            return _asTimestamp(serializers);
        }

        public void callSerializeAsString(Date value, JsonGenerator g, SerializerProvider provider) throws IOException {
            _serializeAsString(value, g, provider);
        }

        public void callAcceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint, boolean asNumber) throws JsonMappingException {
            _acceptJsonFormatVisitor(visitor, typeHint, asNumber);
        }
    }

    static class DummyNumericBean {
        @JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
        public Date date = new Date(1000L);
    }

    static class DummyPatternWithLocaleAndTzBean {
        @JsonFormat(pattern = "yyyy-MM-dd", locale = "fr", timezone = "UTC")
        public Date date = new Date(0L);
    }

    static class DummyPatternDefaultLocaleAndTzBean {
        @JsonFormat(pattern = "yyyy-MM-dd")
        public Date date = new Date(0L);
    }

    static class DummyStringShapeBean {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public Date date = new Date(0L);
    }

    static class DummyLocaleAndTzBean {
        @JsonFormat(locale = "de", timezone = "GMT+1")
        public Date date = new Date(0L);
    }

    static class DummyTzOnlyBean {
        @JsonFormat(timezone = "GMT+5")
        public Date date = new Date(0L);
    }

    static class DummyEmptyFormatBean {
        @JsonFormat()
        public Date date = new Date(0L);
    }

    private ObjectMapper createMapper(ConcreteDateTimeSerializer serializer) {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(Date.class, serializer);
        mapper.registerModule(module);
        return mapper;
    }

    @Test
    public void testCreateContextual_propertyNull_returnsThis() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        JsonSerializer<?> contextual = ser.createContextual(provider, null);
        Assert.assertSame(ser, contextual);
    }

    @Test
    public void testCreateContextual_noFormatOverrides_returnsThis() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        ObjectMapper mapper = createMapper(ser);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        BeanProperty prop = new BeanProperty.Bogus();
        JsonSerializer<?> contextual = ser.createContextual(provider, prop);
        Assert.assertSame(ser, contextual);
    }

    @Test
    public void testCreateContextual_shapeNumeric_returnsTimestampSerializer() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        ObjectMapper mapper = createMapper(ser);

        String json = mapper.writeValueAsString(new DummyNumericBean());
        Assert.assertEquals("{\"date\":1000}", json);
    }

    @Test
    public void testCreateContextual_patternWithLocaleAndTz() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        ObjectMapper mapper = createMapper(ser);

        String json = mapper.writeValueAsString(new DummyPatternWithLocaleAndTzBean());
        Assert.assertEquals("{\"date\":\"1970-01-01\"}", json);
    }

    @Test
    public void testCreateContextual_patternWithDefaultLocaleAndTz() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        ObjectMapper mapper = createMapper(ser);

        String json = mapper.writeValueAsString(new DummyPatternDefaultLocaleAndTzBean());
        Assert.assertTrue(json.contains("date"));
    }

    @Test
    public void testCreateContextual_emptyFormat_returnsThis() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        ObjectMapper mapper = createMapper(ser);

        String json = mapper.writeValueAsString(new DummyEmptyFormatBean());
        Assert.assertNotNull(json);
    }

    @Test
    public void testCreateContextual_stdDateFormat_withLocaleAndTz() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        ObjectMapper mapper = createMapper(ser);
        mapper.setDateFormat(new StdDateFormat());

        String json = mapper.writeValueAsString(new DummyLocaleAndTzBean());
        Assert.assertNotNull(json);
    }

    @Test
    public void testCreateContextual_stdDateFormat_stringShape() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        ObjectMapper mapper = createMapper(ser);
        mapper.setDateFormat(new StdDateFormat());

        String json = mapper.writeValueAsString(new DummyStringShapeBean());
        Assert.assertNotNull(json);
    }

    @Test
    public void testCreateContextual_simpleDateFormat_withLocaleAndTz() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        ObjectMapper mapper = createMapper(ser);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        mapper.setDateFormat(sdf);

        String json = mapper.writeValueAsString(new DummyLocaleAndTzBean());
        Assert.assertNotNull(json);
    }

    @Test
    public void testCreateContextual_simpleDateFormat_tzOnly() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        ObjectMapper mapper = createMapper(ser);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+5"));
        mapper.setDateFormat(sdf);

        String json = mapper.writeValueAsString(new DummyTzOnlyBean());
        Assert.assertNotNull(json);
    }

    @Test
    public void testCreateContextual_nonSimpleDateFormat_throwsBadDefinition() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        ObjectMapper mapper = createMapper(ser);

        DateFormat nonStd = new DateFormat() {
            private static final long serialVersionUID = 1L;

            @Override
            public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
                return toAppendTo.append("custom");
            }

            @Override
            public Date parse(String source, ParsePosition pos) {
                return null;
            }
        };
        mapper.setDateFormat(nonStd);

        try {
            mapper.writeValueAsString(new DummyLocaleAndTzBean());
            Assert.fail("Expected JsonMappingException due to non-SimpleDateFormat DateFormat");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Configured `DateFormat`"));
        }
    }

    @Test
    public void testIsEmpty_returnsFalse() {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        Assert.assertFalse(ser.isEmpty(null, null));
        Assert.assertFalse(ser.isEmpty(null, new Date(0L)));
        Assert.assertFalse(ser.isEmpty(null, new Date(12345L)));
    }

    @Test
    public void testGetSchema_asTimestampAndAsString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ConcreteDateTimeSerializer serTimestamp = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        JsonNode numberSchema = serTimestamp.getSchema(provider, Date.class);
        Assert.assertEquals("number", numberSchema.get("type").asText());

        ConcreteDateTimeSerializer serString = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        JsonNode stringSchema = serString.getSchema(provider, Date.class);
        Assert.assertEquals("string", stringSchema.get("type").asText());
    }

    @Test
    public void testAsTimestamp_branches() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        ConcreteDateTimeSerializer serExplicitTrue = new ConcreteDateTimeSerializer(Boolean.TRUE, null);
        Assert.assertTrue(serExplicitTrue.callAsTimestamp(provider));

        ConcreteDateTimeSerializer serExplicitFalse = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        Assert.assertFalse(serExplicitFalse.callAsTimestamp(provider));

        ConcreteDateTimeSerializer serNullFormat = new ConcreteDateTimeSerializer(null, null);
        mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        Assert.assertTrue(serNullFormat.callAsTimestamp(mapper.getSerializerProviderInstance()));

        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        Assert.assertFalse(serNullFormat.callAsTimestamp(mapper.getSerializerProviderInstance()));

        ConcreteDateTimeSerializer serWithCustomFormat = new ConcreteDateTimeSerializer(null, new SimpleDateFormat("yyyy"));
        Assert.assertFalse(serWithCustomFormat.callAsTimestamp(provider));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsTimestamp_nullProvider_throwsIllegalArgumentException() {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer(null, null);
        ser.callAsTimestamp(null);
    }

    @Test
    public void testSerializeAsString_defaultAndCustomFormatWithReuse() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        JsonFactory jsonFactory = new JsonFactory();

        ConcreteDateTimeSerializer serDefault = new ConcreteDateTimeSerializer(Boolean.FALSE, null);
        StringWriter swDefault = new StringWriter();
        JsonGenerator genDefault = jsonFactory.createGenerator(swDefault);
        serDefault.callSerializeAsString(new Date(0L), genDefault, provider);
        genDefault.flush();
        Assert.assertFalse(swDefault.toString().isEmpty());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        ConcreteDateTimeSerializer serCustom = new ConcreteDateTimeSerializer(Boolean.FALSE, sdf);

        StringWriter sw1 = new StringWriter();
        JsonGenerator gen1 = jsonFactory.createGenerator(sw1);
        serCustom.callSerializeAsString(new Date(0L), gen1, provider);
        gen1.flush();
        Assert.assertEquals("\"1970_01_01\"", sw1.toString());

        StringWriter sw2 = new StringWriter();
        JsonGenerator gen2 = jsonFactory.createGenerator(sw2);
        serCustom.callSerializeAsString(new Date(86400000L), gen2, provider);
        gen2.flush();
        Assert.assertEquals("\"1970_01_02\"", sw2.toString());
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws Exception {
        ConcreteDateTimeSerializer ser = new ConcreteDateTimeSerializer();
        JavaType javaType = new ObjectMapper().constructType(Date.class);

        final boolean[] intVisited = new boolean[1];
        final boolean[] stringVisited = new boolean[1];

        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
                return new JsonIntegerFormatVisitor.Base() {
                    @Override
                    public void numberType(JsonParser.NumberType type) {
                        intVisited[0] = true;
                    }

                    @Override
                    public void format(JsonValueFormat format) {
                        intVisited[0] = true;
                    }
                };
            }

            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) {
                return new JsonStringFormatVisitor.Base() {
                    @Override
                    public void format(JsonValueFormat format) {
                        stringVisited[0] = true;
                    }
                };
            }
        };

        ser.callAcceptJsonFormatVisitor(visitor, javaType, true);
        Assert.assertTrue(intVisited[0]);

        ser.callAcceptJsonFormatVisitor(visitor, javaType, false);
        Assert.assertTrue(stringVisited[0]);

        ObjectMapper mapper = new ObjectMapper();
        visitor.setProvider(mapper.getSerializerProviderInstance());
        ser.acceptJsonFormatVisitor(visitor, javaType);
    }
}
