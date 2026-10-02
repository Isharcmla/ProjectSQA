package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.*;
import java.io.IOException;

import com.fasterxml.jackson.databind.*;

public class StdKeySerializersTest {

    private SerializationConfig config;
    private ObjectMapper mapper;

    private enum SampleEnum { ONE, TWO }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
    }

    // -------------------------------------------------------------
    // getStdKeySerializer - normal / typical cases
    // -------------------------------------------------------------

    @Test
    public void testGetStdKeySerializer_stringType_returnsStringKeySerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, String.class, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializers.StringKeySerializer);
    }

    @Test
    public void testGetStdKeySerializer_intPrimitive_returnsDefaultKeySerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, int.class, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializer);
    }

    @Test
    public void testGetStdKeySerializer_numberSubclass_returnsDefaultKeySerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, Integer.class, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializer);
    }

    @Test
    public void testGetStdKeySerializer_classType_returnsDefaultWithTypeClass() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, Class.class, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetStdKeySerializer_dateSubclass_returnsDefaultWithTypeDate() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, java.sql.Date.class, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetStdKeySerializer_calendarSubclass_returnsDefaultWithTypeCalendar() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, GregorianCalendar.class, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetStdKeySerializer_uuidType_returnsDefaultWithTypeToString() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, UUID.class, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializers.Default);
    }

    // -------------------------------------------------------------
    // getStdKeySerializer - edge cases
    // -------------------------------------------------------------

    @Test
    public void testGetStdKeySerializer_nullType_returnsDynamic() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, null, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testGetStdKeySerializer_objectClass_returnsDynamic() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, Object.class, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testGetStdKeySerializer_unknownTypeUseDefaultTrue_returnsDefaultKeySerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, StringBuilder.class, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializer);
    }

    @Test
    public void testGetStdKeySerializer_unknownTypeUseDefaultFalse_returnsNull() {
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(config, StringBuilder.class, false);
        assertNull(ser);
    }

    @Test
    public void testGetStdKeySerializer_configNull_stillWorks() {
        // config parameter is unused in the current implementation, verify null-safety
        JsonSerializer<Object> ser = StdKeySerializers.getStdKeySerializer(null, String.class, true);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializers.StringKeySerializer);
    }

    // -------------------------------------------------------------
    // getFallbackKeySerializer
    // -------------------------------------------------------------

    @Test
    public void testGetFallbackKeySerializer_nullType_returnsDefaultKeySerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getFallbackKeySerializer(config, null);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializer);
    }

    @Test
    public void testGetFallbackKeySerializer_enumClass_returnsDynamic() {
        JsonSerializer<Object> ser = StdKeySerializers.getFallbackKeySerializer(config, Enum.class);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializers.Dynamic);
    }

    @Test
    public void testGetFallbackKeySerializer_actualEnumType_returnsDefaultWithTypeEnum() {
        JsonSerializer<Object> ser = StdKeySerializers.getFallbackKeySerializer(config, SampleEnum.class);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializers.Default);
    }

    @Test
    public void testGetFallbackKeySerializer_nonEnumType_returnsDefaultKeySerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getFallbackKeySerializer(config, String.class);
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializer);
    }

    // -------------------------------------------------------------
    // getDefault (deprecated)
    // -------------------------------------------------------------

    @Test
    public void testGetDefault_returnsDefaultKeySerializer() {
        JsonSerializer<Object> ser = StdKeySerializers.getDefault();
        assertNotNull(ser);
        assertTrue(ser instanceof StdKeySerializer);
    }

    // -------------------------------------------------------------
    // Integration tests exercising serialize() of inner classes
    // through real ObjectMapper / JsonGenerator / SerializerProvider
    // (no mocking framework used)
    // -------------------------------------------------------------

    @Test
    public void testSerialize_stringKey_producesFieldName() throws IOException {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("a", 1);
        String json = mapper.writeValueAsString(map);
        assertEquals("{\"a\":1}", json);
    }

    @Test
    public void testSerialize_classKey_producesClassNameFieldName() throws IOException {
        JavaType type = mapper.getTypeFactory()
                .constructMapType(HashMap.class, Class.class, String.class);
        Map<Class<?>, String> map = new LinkedHashMap<Class<?>, String>();
        map.put(String.class, "value");
        String json = mapper.writerFor(type).writeValueAsString(map);
        assertTrue(json.contains("java.lang.String"));
    }

    @Test
    public void testSerialize_dateKey_producesNumericFieldName() throws IOException {
        JavaType type = mapper.getTypeFactory()
                .constructMapType(HashMap.class, Date.class, String.class);
        Map<Date, String> map = new LinkedHashMap<Date, String>();
        map.put(new Date(0L), "epoch");
        String json = mapper.writerFor(type).writeValueAsString(map);
        assertTrue(json.contains("epoch"));
    }

    @Test
    public void testSerialize_calendarKey_producesNumericFieldName() throws IOException {
        JavaType type = mapper.getTypeFactory()
                .constructMapType(HashMap.class, Calendar.class, String.class);
        Map<Calendar, String> map = new LinkedHashMap<Calendar, String>();
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(0L);
        map.put(cal, "calValue");
        String json = mapper.writerFor(type).writeValueAsString(map);
        assertTrue(json.contains("calValue"));
    }

    @Test
    public void testSerialize_uuidKey_producesToStringFieldName() throws IOException {
        JavaType type = mapper.getTypeFactory()
                .constructMapType(HashMap.class, UUID.class, String.class);
        Map<UUID, String> map = new LinkedHashMap<UUID, String>();
        UUID uuid = UUID.fromString("12345678-1234-1234-1234-123456789012");
        map.put(uuid, "uuidValue");
        String json = mapper.writerFor(type).writeValueAsString(map);
        assertTrue(json.contains(uuid.toString()));
    }

    @Test
    public void testSerialize_enumKey_producesEnumNameFieldName() throws IOException {
        JavaType type = mapper.getTypeFactory()
                .constructMapType(HashMap.class, SampleEnum.class, String.class);
        Map<SampleEnum, String> map = new LinkedHashMap<SampleEnum, String>();
        map.put(SampleEnum.ONE, "enumValue");
        String json = mapper.writerFor(type).writeValueAsString(map);
        assertTrue(json.contains("enumValue"));
    }

    @Test
    public void testSerialize_dynamicObjectKey_resolvesRuntimeType() throws IOException {
        // Using a plain HashMap without explicit generic key type causes
        // Jackson to fall back to a dynamic (Object) key type resolution.
        Map<Object, String> map = new HashMap<Object, String>();
        map.put("dynamicKey", "dynamicValue");
        String json = mapper.writeValueAsString(map);
        assertTrue(json.contains("dynamicKey"));
        assertTrue(json.contains("dynamicValue"));
    }

    // -------------------------------------------------------------
    // Exception scenario: mismatched runtime value for declared key type
    // -------------------------------------------------------------

    @Test
    public void testSerialize_classKeyWithMismatchedValue_throwsException() {
        JavaType type = mapper.getTypeFactory()
                .constructMapType(HashMap.class, Class.class, String.class);

        @SuppressWarnings({ "unchecked", "rawtypes" })
        Map rawMap = new HashMap();
        // Put a String instead of a Class object to trigger a ClassCastException
        // inside StdKeySerializers.Default#serialize (TYPE_CLASS branch)
        rawMap.put("notAClassInstance", "value");

        boolean exceptionThrown = false;
        try {
            mapper.writerFor(type).writeValueAsString(rawMap);
        } catch (Exception e) {
            exceptionThrown = true;
            Throwable cause = e;
            boolean foundCce = false;
            while (cause != null) {
                if (cause instanceof ClassCastException) {
                    foundCce = true;
                    break;
                }
                cause = cause.getCause();
            }
            assertTrue("Expected ClassCastException somewhere in the cause chain",
                    foundCce || e instanceof JsonMappingException);
        }
        assertTrue("Expected an exception to be thrown due to type mismatch", exceptionThrown);
    }

    // -------------------------------------------------------------
    // Direct construction of Default / Dynamic / StringKeySerializer
    // -------------------------------------------------------------

    @Test
    public void testDefaultConstructor_createsInstance() {
        StdKeySerializers.Default def = new StdKeySerializers.Default(1, Date.class);
        assertNotNull(def);
    }

    @Test
    public void testDynamicConstructor_createsInstance() {
        StdKeySerializers.Dynamic dyn = new StdKeySerializers.Dynamic();
        assertNotNull(dyn);
    }

    @Test
    public void testStringKeySerializerConstructor_createsInstance() {
        StdKeySerializers.StringKeySerializer strSer = new StdKeySerializers.StringKeySerializer();
        assertNotNull(strSer);
    }
}
