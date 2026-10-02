package com.fasterxml.jackson.databind.ser.std;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;

public class StdKeySerializersTest {

    private final JsonFactory jsonFactory = new JsonFactory();
    private ObjectMapper mapper;
    private SerializerProvider provider;
    private SerializationConfig config;

    private enum TestEnum {
        VALUE_A,
        VALUE_B {
            @Override
            public String toString() {
                return "custom_b";
            }
        }
    }

    private static class CustomObject {
        private final String val;

        public CustomObject(String val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "Custom[" + val + "]";
        }
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
        provider = mapper.getSerializerProviderInstance();
    }

    @Test
    public void testGetDefault_returnsDefaultKeySerializer() {
        @SuppressWarnings("deprecation")
        JsonSerializer<Object> ser = StdKeySerializers.getDefault();
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof StdKeySerializer);
    }

    @Test
    public void testGetStdKeySerializer_nullOrObjectClass_returnsDynamic() {
        JsonSerializer<Object> serNull = StdKeySerializers.getStdKeySerializer(config, null, true);
        Assert.assertNotNull(serNull);
        Assert.assertTrue(serNull instanceof StdKeySerializers.Dynamic);

        JsonSerializer<Object> serObject = StdKeySerializers.getStdKeySerializer(config, Object.class, false);
        Assert.assertNotNull(serObject);
        Assert.assertTrue(serObject instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testGetStdKeySerializer_stringClass_returnsStringKeySerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, String.class, false);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof StdKeySerializers.StringKeySerializer);
    }

    @Test
    public void testGetStdKeySerializer_primitivesAndNumbers_returnsDefaultKeySerializer() {
        JsonSerializer<Object> serIntPrim = StdKeySerializers.getStdKeySerializer(config, int.class, false);
        Assert.assertNotNull(serIntPrim);
        Assert.assertTrue(serIntPrim instanceof StdKeySerializer);

        JsonSerializer<Object> serLong = StdKeySerializers.getStdKeySerializer(config, Long.class, false);
        Assert.assertNotNull(serLong);
        Assert.assertTrue(serLong instanceof StdKeySerializer);

        JsonSerializer<Object> serDouble = StdKeySerializers.getStdKeySerializer(config, Double.class, false);
        Assert.assertNotNull(serDouble);
        Assert.assertTrue(serDouble instanceof StdKeySerializer);
    }

    @Test
    public void testGetStdKeySerializer_classType_returnsDefaultClassSerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, Class.class, false);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetStdKeySerializer_dateAndCalendar_returnsDefaultSerializer() {
        JsonSerializer<Object> serDate = StdKeySerializers.getStdKeySerializer(config, Date.class, false);
        Assert.assertNotNull(serDate);
        Assert.assertTrue(serDate instanceof StdKeySerializers.Default);

        JsonSerializer<Object> serCalendar = StdKeySerializers.getStdKeySerializer(config, Calendar.class, false);
        Assert.assertNotNull(serCalendar);
        Assert.assertTrue(serCalendar instanceof StdKeySerializers.Default);

        JsonSerializer<Object> serGregorian = StdKeySerializers.getStdKeySerializer(config, GregorianCalendar.class, false);
        Assert.assertNotNull(serGregorian);
        Assert.assertTrue(serGregorian instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetStdKeySerializer_uuidClass_returnsDefaultToStringSerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, UUID.class, false);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetStdKeySerializer_unhandledType_useDefaultHandling() {
        JsonSerializer<Object> serWithDefault = StdKeySerializers.getStdKeySerializer(config, CustomObject.class, true);
        Assert.assertNotNull(serWithDefault);
        Assert.assertTrue(serWithDefault instanceof StdKeySerializer);

        JsonSerializer<Object> serWithoutDefault = StdKeySerializers.getStdKeySerializer(config, CustomObject.class, false);
        Assert.assertNull(serWithoutDefault);
    }

    @Test
    public void testGetFallbackKeySerializer_nullType_returnsDefaultKeySerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getFallbackKeySerializer(config, null);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof StdKeySerializer);
    }

    @Test
    public void testGetFallbackKeySerializer_enumBaseClass_returnsDynamic() {
        JsonSerializer<Object> ser = StdKeySerializers.getFallbackKeySerializer(config, Enum.class);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testGetFallbackKeySerializer_concreteEnumClass_returnsDefaultEnumSerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getFallbackKeySerializer(config, TestEnum.class);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetFallbackKeySerializer_otherClass_returnsDefaultKeySerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getFallbackKeySerializer(config, CustomObject.class);
        Assert.assertNotNull(ser);
        Assert.assertTrue(ser instanceof StdKeySerializer);
    }

    @Test
    public void testStringKeySerializer_serialize_writesFieldName() throws Exception {
        StdKeySerializers.StringKeySerializer ser = new StdKeySerializers.StringKeySerializer();
        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        g.writeStartObject();

        ser.serialize("testKey", g, provider);
        g.writeString("value");

        ser.serialize("", g, provider);
        g.writeString("emptyKeyValue");

        g.writeEndObject();
        g.close();

        Assert.assertEquals("{\"testKey\":\"value\",\"\":\"emptyKeyValue\"}", sw.toString());
    }

    @Test
    public void testDefaultSerializer_serializeClass_writesClassName() throws Exception {
        StdKeySerializers.Default ser = new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_CLASS, Class.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        g.writeStartObject();

        ser.serialize(String.class, g, provider);
        g.writeNumber(1);

        g.writeEndObject();
        g.close();

        Assert.assertEquals("{\"java.lang.String\":1}", sw.toString());
    }

    @Test
    public void testDefaultSerializer_serializeDate_writesFormattedDateKey() throws Exception {
        StdKeySerializers.Default ser = new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_DATE, Date.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        g.writeStartObject();

        Date date = new Date(0L);
        ser.serialize(date, g, provider);
        g.writeNumber(100);

        g.writeEndObject();
        g.close();

        Assert.assertTrue(sw.toString().contains("100"));
        Assert.assertTrue(sw.toString().startsWith("{\""));
    }

    @Test
    public void testDefaultSerializer_serializeCalendar_writesFormattedDateKey() throws Exception {
        StdKeySerializers.Default ser = new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_CALENDAR, Calendar.class);
        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        g.writeStartObject();

        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(0L);
        ser.serialize(cal, g, provider);
        g.writeNumber(200);

        g.writeEndObject();
        g.close();

        Assert.assertTrue(sw.toString().contains("200"));
        Assert.assertTrue(sw.toString().startsWith("{\""));
    }

    @Test
    public void testDefaultSerializer_serializeEnum_writeEnumNameOrToString() throws Exception {
        StdKeySerializers.Default ser = new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_ENUM, TestEnum.class);

        // Case 1: WRITE_ENUMS_USING_TO_STRING disabled (default)
        StringWriter sw1 = new StringWriter();
        JsonGenerator g1 = jsonFactory.createGenerator(sw1);
        g1.writeStartObject();
        ser.serialize(TestEnum.VALUE_B, g1, provider);
        g1.writeNumber(1);
        g1.writeEndObject();
        g1.close();
        Assert.assertEquals("{\"VALUE_B\":1}", sw1.toString());

        // Case 2: WRITE_ENUMS_USING_TO_STRING enabled
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        SerializerProvider customProvider = customMapper.getSerializerProviderInstance();

        StringWriter sw2 = new StringWriter();
        JsonGenerator g2 = jsonFactory.createGenerator(sw2);
        g2.writeStartObject();
        ser.serialize(TestEnum.VALUE_B, g2, customProvider);
        g2.writeNumber(2);
        g2.writeEndObject();
        g2.close();
        Assert.assertEquals("{\"custom_b\":2}", sw2.toString());
    }

    @Test
    public void testDefaultSerializer_serializeToStringAndDefault_writesToString() throws Exception {
        StdKeySerializers.Default serToString = new StdKeySerializers.Default(StdKeySerializers.Default.TYPE_TO_STRING, UUID.class);
        UUID uuid = UUID.nameUUIDFromBytes("test".getBytes());

        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        g.writeStartObject();

        serToString.serialize(uuid, g, provider);
        g.writeNumber(1);

        StdKeySerializers.Default serOther = new StdKeySerializers.Default(999, CustomObject.class);
        serOther.serialize(new CustomObject("hello"), g, provider);
        g.writeNumber(2);

        g.writeEndObject();
        g.close();

        Assert.assertEquals("{\"" + uuid.toString() + "\":1,\"Custom[hello]\":2}", sw.toString());
    }

    @Test
    public void testDynamicSerializer_serializeMultipleTypes_cachesAndSerializes() throws Exception {
        StdKeySerializers.Dynamic dynamicSer = new StdKeySerializers.Dynamic();

        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        g.writeStartObject();

        // 1st time with String
        dynamicSer.serialize("key1", g, provider);
        g.writeNumber(1);

        // 2nd time with String (hits cached serializer in PropertySerializerMap)
        dynamicSer.serialize("key2", g, provider);
        g.writeNumber(2);

        // 3rd time with Integer (finds new dynamic serializer)
        dynamicSer.serialize(Integer.valueOf(123), g, provider);
        g.writeNumber(3);

        // 4th time with Integer (hits cached serializer)
        dynamicSer.serialize(Integer.valueOf(456), g, provider);
        g.writeNumber(4);

        // 5th time with UUID
        UUID uuid = UUID.randomUUID();
        dynamicSer.serialize(uuid, g, provider);
        g.writeNumber(5);

        g.writeEndObject();
        g.close();

        Assert.assertTrue(sw.toString().contains("\"key1\":1"));
        Assert.assertTrue(sw.toString().contains("\"key2\":2"));
        Assert.assertTrue(sw.toString().contains("\"123\":3"));
        Assert.assertTrue(sw.toString().contains("\"456\":4"));
        Assert.assertTrue(sw.toString().contains("\"" + uuid.toString() + "\":5"));
    }

    @Test
    public void testDynamicSerializer_readResolve_restoresStateAfterDeserialization() throws Exception {
        StdKeySerializers.Dynamic dynamicSer = new StdKeySerializers.Dynamic();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dynamicSer);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof StdKeySerializers.Dynamic);

        StdKeySerializers.Dynamic restoredSer = (StdKeySerializers.Dynamic) deserialized;
        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        g.writeStartObject();

        restoredSer.serialize("postDeserializationKey", g, provider);
        g.writeString("works");

        g.writeEndObject();
        g.close();

        Assert.assertEquals("{\"postDeserializationKey\":\"works\"}", sw.toString());
    }
}
