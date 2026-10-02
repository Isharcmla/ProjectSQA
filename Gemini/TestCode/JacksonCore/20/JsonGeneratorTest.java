package com.fasterxml.jackson.core;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;

public class JsonGeneratorTest {

    private TestGenerator gen;

    @Before
    public void setUp() {
        gen = new TestGenerator();
    }

    // =========================================================================
    // Feature Enum Tests
    // =========================================================================

    @Test
    public void testFeature_collectDefaults_returnsCorrectBitmask() {
        int defaults = JsonGenerator.Feature.collectDefaults();
        for (JsonGenerator.Feature f : JsonGenerator.Feature.values()) {
            if (f.enabledByDefault()) {
                assertTrue(f.enabledIn(defaults));
            } else {
                assertFalse(f.enabledIn(defaults));
            }
        }
    }

    @Test
    public void testFeature_masksAndDefaults() {
        for (JsonGenerator.Feature f : JsonGenerator.Feature.values()) {
            assertEquals(1 << f.ordinal(), f.getMask());
            assertTrue(f.enabledIn(f.getMask()));
            assertFalse(f.enabledIn(0));
        }
    }

    // =========================================================================
    // Configuration & Feature Configuration Tests
    // =========================================================================

    @Test
    public void testConfigure_enablingAndDisablingFeature() {
        gen.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, true);
        assertTrue(gen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));

        gen.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
        assertFalse(gen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testOverrideStdFeatures() {
        gen.setFeatureMask(0);
        int mask = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask() | JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.getMask();
        int values = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();

        gen.overrideStdFeatures(values, mask);
        assertEquals(values, gen.getFeatureMask());
        assertTrue(gen.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        assertFalse(gen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
    }

    @Test
    public void testGetFormatFeatures_returnsZeroByDefault() {
        assertEquals(0, gen.getFormatFeatures());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOverrideFormatFeatures_throwsException() {
        gen.overrideFormatFeatures(1, 1);
    }

    // =========================================================================
    // Schema Configuration Tests
    // =========================================================================

    @Test(expected = UnsupportedOperationException.class)
    public void testSetSchema_throwsUnsupportedOperationException() {
        FormatSchema schema = new FormatSchema() {
            @Override
            public String getSchemaType() {
                return "TEST_SCHEMA";
            }
        };
        gen.setSchema(schema);
    }

    @Test
    public void testGetSchema_returnsNullByDefault() {
        assertNull(gen.getSchema());
    }

    @Test
    public void testCanUseSchema_returnsFalseByDefault() {
        assertFalse(gen.canUseSchema(null));
    }

    // =========================================================================
    // Pretty Printer & Character Escapes & Misc Configuration Tests
    // =========================================================================

    @Test
    public void testPrettyPrinter_getAndSet() {
        assertNull(gen.getPrettyPrinter());
        PrettyPrinter pp = new PrettyPrinter() {
            @Override
            public void writeRootValueSeparator(JsonGenerator g) throws IOException {}
            @Override
            public void writeStartObject(JsonGenerator g) throws IOException {}
            @Override
            public void writeEndObject(JsonGenerator g, int nrOfValues) throws IOException {}
            @Override
            public void writeObjectEntrySeparator(JsonGenerator g) throws IOException {}
            @Override
            public void writeObjectFieldValueSeparator(JsonGenerator g) throws IOException {}
            @Override
            public void writeStartArray(JsonGenerator g) throws IOException {}
            @Override
            public void writeEndArray(JsonGenerator g, int nrOfValues) throws IOException {}
            @Override
            public void writeArrayValueSeparator(JsonGenerator g) throws IOException {}
            @Override
            public void beforeArrayValues(JsonGenerator g) throws IOException {}
            @Override
            public void beforeObjectEntries(JsonGenerator g) throws IOException {}
        };
        assertSame(gen, gen.setPrettyPrinter(pp));
        assertSame(pp, gen.getPrettyPrinter());

        gen.setPrettyPrinter(null);
        assertNull(gen.getPrettyPrinter());
    }

    @Test
    public void testSetHighestNonEscapedCharAndGetHighestEscapedChar() {
        assertSame(gen, gen.setHighestNonEscapedChar(127));
        assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testGetAndSetCharacterEscapes() {
        assertNull(gen.getCharacterEscapes());
        CharacterEscapes escapes = new CharacterEscapes() {
            private static final long serialVersionUID = 1L;
            @Override
            public int[] getEscapeCodesForAscii() { return new int[128]; }
            @Override
            public SerializableString getEscapeSequence(int ch) { return null; }
        };
        assertSame(gen, gen.setCharacterEscapes(escapes));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetRootValueSeparator_throwsUnsupportedOperationException() {
        gen.setRootValueSeparator(new SerializedString("/"));
    }

    // =========================================================================
    // Output State & CurrentValue Tests
    // =========================================================================

    @Test
    public void testGetOutputTargetAndBuffered() {
        assertNull(gen.getOutputTarget());
        assertEquals(-1, gen.getOutputBuffered());
    }

    @Test
    public void testGetCurrentValueAndSetCurrentValue_withNullContext() {
        gen.context = null;
        assertNull(gen.getCurrentValue());
        gen.setCurrentValue("value");
        assertNull(gen.getCurrentValue());
    }

    @Test
    public void testGetCurrentValueAndSetCurrentValue_withContext() {
        gen.context = new TestStreamContext();
        assertNull(gen.getCurrentValue());
        Object val = new Object();
        gen.setCurrentValue(val);
        assertSame(val, gen.getCurrentValue());
    }

    // =========================================================================
    // Introspection Methods
    // =========================================================================

    @Test
    public void testCapabilityIntrospectionDefaults() {
        assertFalse(gen.canWriteObjectId());
        assertFalse(gen.canWriteTypeId());
        assertFalse(gen.canWriteBinaryNatively());
        assertTrue(gen.canOmitFields());
        assertFalse(gen.canWriteFormattedNumbers());
    }

    // =========================================================================
    // Write Methods: Structural & IDs
    // =========================================================================

    @Test
    public void testWriteStartArrayWithSize_delegatesToStartArray() throws IOException {
        gen.writeStartArray(5);
        assertEquals("[startArray]", gen.getEventsAsString());
    }

    @Test
    public void testWriteStartObjectWithForValue_setsCurrentValue() throws IOException {
        gen.context = new TestStreamContext();
        Object obj = "my-value";
        gen.writeStartObject(obj);
        assertEquals("[startObject]", gen.getEventsAsString());
        assertSame(obj, gen.getCurrentValue());
    }

    @Test
    public void testWriteFieldId_callsWriteFieldNameWithString() throws IOException {
        gen.writeFieldId(123456789L);
        assertEquals("[fieldName:123456789]", gen.getEventsAsString());
    }

    // =========================================================================
    // Write Methods: Scalar Arrays
    // =========================================================================

    @Test
    public void testWriteArray_intArray_valid() throws IOException {
        int[] arr = { 1, 2, 3, 4, 5 };
        gen.writeArray(arr, 1, 3);
        assertEquals("[startArray, number:2, number:3, number:4, endArray]", gen.getEventsAsString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArray_intArray_null() throws IOException {
        gen.writeArray((int[]) null, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArray_intArray_negativeOffset() throws IOException {
        gen.writeArray(new int[]{ 1, 2 }, -1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArray_intArray_outOfBounds() throws IOException {
        gen.writeArray(new int[]{ 1, 2 }, 1, 2);
    }

    @Test
    public void testWriteArray_longArray_valid() throws IOException {
        long[] arr = { 10L, 20L, 30L };
        gen.writeArray(arr, 0, 2);
        assertEquals("[startArray, number:10, number:20, endArray]", gen.getEventsAsString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArray_longArray_null() throws IOException {
        gen.writeArray((long[]) null, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArray_longArray_invalidLength() throws IOException {
        gen.writeArray(new long[]{ 1L }, 0, 2);
    }

    @Test
    public void testWriteArray_doubleArray_valid() throws IOException {
        double[] arr = { 1.1, 2.2, 3.3 };
        gen.writeArray(arr, 0, 3);
        assertEquals("[startArray, number:1.1, number:2.2, number:3.3, endArray]", gen.getEventsAsString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArray_doubleArray_null() throws IOException {
        gen.writeArray((double[]) null, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArray_doubleArray_invalidOffset() throws IOException {
        gen.writeArray(new double[]{ 1.1 }, 2, 0);
    }

    // =========================================================================
    // Write Methods: Raw & Binary
    // =========================================================================

    @Test
    public void testWriteRaw_serializableString() throws IOException {
        gen.writeRaw(new SerializedString("raw_content"));
        assertEquals("[raw:raw_content]", gen.getEventsAsString());
    }

    @Test
    public void testWriteRawValue_serializableString() throws IOException {
        gen.writeRawValue(new SerializedString("raw_val"));
        assertEquals("[rawValue:raw_val]", gen.getEventsAsString());
    }

    @Test
    public void testWriteBinary_byteArrayDefaults() throws IOException {
        byte[] data = new byte[]{ 1, 2, 3, 4 };
        gen.writeBinary(data);
        gen.writeBinary(data, 1, 2);
        assertEquals("[binary:1,2,3,4, binary:2,3]", gen.getEventsAsString());
    }

    @Test
    public void testWriteBinary_inputStreamDefaults() throws IOException {
        byte[] data = new byte[]{ 5, 6 };
        InputStream in = new ByteArrayInputStream(data);
        int bytes = gen.writeBinary(in, 2);
        assertEquals(2, bytes);
        assertEquals("[binaryStream:2]", gen.getEventsAsString());
    }

    // =========================================================================
    // Write Methods: Numbers & Unsupported Types
    // =========================================================================

    @Test
    public void testWriteNumber_short() throws IOException {
        gen.writeNumber((short) 42);
        assertEquals("[number:42]", gen.getEventsAsString());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEmbeddedObject_throwsException() throws IOException {
        gen.writeEmbeddedObject("custom");
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteObjectId_throwsException() throws IOException {
        gen.writeObjectId("id1");
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteObjectRef_throwsException() throws IOException {
        gen.writeObjectRef("id1");
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteTypeId_throwsException() throws IOException {
        gen.writeTypeId("type1");
    }

    // =========================================================================
    // Field Write Convenience Methods
    // =========================================================================

    @Test
    public void testConvenienceFieldWriters() throws IOException {
        gen.writeStringField("f1", "v1");
        gen.writeBooleanField("f2", true);
        gen.writeNullField("f3");
        gen.writeNumberField("f4", 10);
        gen.writeNumberField("f5", 20L);
        gen.writeNumberField("f6", 30.5);
        gen.writeNumberField("f7", 40.5f);
        gen.writeNumberField("f8", new BigDecimal("50.5"));
        gen.writeBinaryField("f9", new byte[]{ 1 });
        gen.writeArrayFieldStart("f10");
        gen.writeObjectFieldStart("f11");
        gen.writeObjectField("f12", "pojo");
        gen.writeOmittedField("f13"); // should be no-op

        String expected = "[fieldName:f1, string:v1, " +
                "fieldName:f2, bool:true, " +
                "fieldName:f3, null, " +
                "fieldName:f4, number:10, " +
                "fieldName:f5, number:20, " +
                "fieldName:f6, number:30.5, " +
                "fieldName:f7, number:40.5, " +
                "fieldName:f8, number:50.5, " +
                "fieldName:f9, binary:1, " +
                "fieldName:f10, startArray, " +
                "fieldName:f11, startObject, " +
                "fieldName:f12, object:pojo]";
        assertEquals(expected, gen.getEventsAsString());
    }

    // =========================================================================
    // Helper Methods: _writeSimpleObject
    // =========================================================================

    @Test
    public void testWriteSimpleObject_allSupportedTypes() throws IOException {
        gen.callWriteSimpleObject(null);
        gen.callWriteSimpleObject("hello");
        gen.callWriteSimpleObject(100);
        gen.callWriteSimpleObject(200L);
        gen.callWriteSimpleObject(300.5d);
        gen.callWriteSimpleObject(400.5f);
        gen.callWriteSimpleObject((short) 500);
        gen.callWriteSimpleObject((byte) 12);
        gen.callWriteSimpleObject(new BigInteger("12345678901234567890"));
        gen.callWriteSimpleObject(new BigDecimal("999.999"));
        gen.callWriteSimpleObject(new AtomicInteger(42));
        gen.callWriteSimpleObject(new AtomicLong(84L));
        gen.callWriteSimpleObject(new byte[]{ 9 });
        gen.callWriteSimpleObject(Boolean.TRUE);
        gen.callWriteSimpleObject(new AtomicBoolean(false));

        String expected = "[null, string:hello, number:100, number:200, number:300.5, number:400.5, " +
                "number:500, number:12, number:12345678901234567890, number:999.999, number:42, number:84, " +
                "binary:9, bool:true, bool:false]";
        assertEquals(expected, gen.getEventsAsString());
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteSimpleObject_unsupportedType_throwsException() throws IOException {
        gen.callWriteSimpleObject(new Object());
    }

    // =========================================================================
    // Helper Methods: _reportError, _reportUnsupportedOperation, _throwInternal
    // =========================================================================

    @Test(expected = JsonGenerationException.class)
    public void testReportError() throws JsonGenerationException {
        gen.callReportError("custom error");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testReportUnsupportedOperation() {
        gen.callReportUnsupportedOperation();
    }

    @Test(expected = RuntimeException.class)
    public void testThrowInternal() {
        gen.callThrowInternal();
    }

    @Test
    public void testVerifyOffsets_valid() {
        gen.callVerifyOffsets(10, 0, 10);
        gen.callVerifyOffsets(10, 5, 5);
        gen.callVerifyOffsets(0, 0, 0);
    }

    // =========================================================================
    // Copy Current Event & Structure Tests
    // =========================================================================

    @Test(expected = JsonGenerationException.class)
    public void testCopyCurrentEvent_nullToken_throwsException() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("123");
        // token is not initialized yet (p.currentToken() is null)
        gen.copyCurrentEvent(p);
    }

    @Test
    public void testCopyCurrentEvent_allTokens() throws IOException {
        JsonFactory f = new JsonFactory();
        String json = "{\"str\":\"val\", \"intVal\":123, \"longVal\":999999999999999, \"bigInt\":123456789012345678901234567890, " +
                "\"floatVal\":12.34, \"bigDec\":1234567890.1234567890, \"boolT\":true, \"boolF\":false, \"nullVal\":null, \"arr\":[]}";

        JsonParser p = f.createParser(json);
        while (p.nextToken() != null) {
            gen.copyCurrentEvent(p);
        }

        assertTrue(gen.events.contains("startObject"));
        assertTrue(gen.events.contains("fieldName:str"));
        assertTrue(gen.events.contains("string:val"));
        assertTrue(gen.events.contains("fieldName:intVal"));
        assertTrue(gen.events.contains("number:123"));
        assertTrue(gen.events.contains("fieldName:longVal"));
        assertTrue(gen.events.contains("fieldName:bigInt"));
        assertTrue(gen.events.contains("fieldName:floatVal"));
        assertTrue(gen.events.contains("fieldName:bigDec"));
        assertTrue(gen.events.contains("bool:true"));
        assertTrue(gen.events.contains("bool:false"));
        assertTrue(gen.events.contains("null"));
        assertTrue(gen.events.contains("startArray"));
        assertTrue(gen.events.contains("endArray"));
        assertTrue(gen.events.contains("endObject"));
    }

    @Test
    public void testCopyCurrentEvent_floatNumbers() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("12.5");
        p.nextToken();
        gen.copyCurrentEvent(p);
        assertEquals("[number:12.5]", gen.getEventsAsString());
    }

    @Test
    public void testCopyCurrentStructure_complexNestedJson() throws IOException {
        JsonFactory f = new JsonFactory();
        String json = "{\"field1\":[1, {\"innerKey\":\"innerVal\"}], \"field2\":true}";
        JsonParser p = f.createParser(json);
        p.nextToken(); // points to START_OBJECT

        gen.copyCurrentStructure(p);

        String expected = "[startObject, fieldName:field1, startArray, number:1, " +
                "startObject, fieldName:innerKey, string:innerVal, endObject, endArray, " +
                "fieldName:field2, bool:true, endObject]";
        assertEquals(expected, gen.getEventsAsString());
    }

    @Test
    public void testCopyCurrentStructure_standaloneArray() throws IOException {
        JsonFactory f = new JsonFactory();
        String json = "[10, 20]";
        JsonParser p = f.createParser(json);
        p.nextToken(); // points to START_ARRAY

        gen.copyCurrentStructure(p);

        assertEquals("[startArray, number:10, number:20, endArray]", gen.getEventsAsString());
    }

    @Test
    public void testCopyCurrentStructure_standaloneScalar() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("\"just text\"");
        p.nextToken(); // points to VALUE_STRING

        gen.copyCurrentStructure(p);

        assertEquals("[string:just text]", gen.getEventsAsString());
    }

    @Test
    public void testCopyCurrentStructure_startingAtFieldName() throws IOException {
        JsonFactory f = new JsonFactory();
        String json = "{\"name\":\"Alice\"}";
        JsonParser p = f.createParser(json);
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME "name"

        gen.copyCurrentStructure(p);

        assertEquals("[fieldName:name, string:Alice]", gen.getEventsAsString());
    }

    @Test(expected = JsonGenerationException.class)
    public void testCopyCurrentStructure_nullToken_throwsException() throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser("[]");
        gen.copyCurrentStructure(p);
    }

    // =========================================================================
    // Test Subclasses & Helpers
    // =========================================================================

    private static class TestStreamContext extends JsonStreamContext {
        private Object currentValue;

        @Override
        public String getCurrentName() { return null; }

        @Override
        public Object getCurrentValue() { return currentValue; }

        @Override
        public void setCurrentValue(Object v) { this.currentValue = v; }
    }

    private static class TestGenerator extends JsonGenerator {
        private int features = 0;
        private boolean closed = false;
        private ObjectCodec codec;
        public JsonStreamContext context;
        public final List<String> events = new ArrayList<String>();

        public String getEventsAsString() {
            return events.toString();
        }

        public void callWriteSimpleObject(Object value) throws IOException {
            _writeSimpleObject(value);
        }

        public void callReportError(String msg) throws JsonGenerationException {
            _reportError(msg);
        }

        public void callReportUnsupportedOperation() {
            _reportUnsupportedOperation();
        }

        public void callThrowInternal() {
            _throwInternal();
        }

        public void callVerifyOffsets(int arrayLength, int offset, int length) {
            _verifyOffsets(arrayLength, offset, length);
        }

        @Override
        public JsonGenerator setCodec(ObjectCodec oc) {
            this.codec = oc;
            return this;
        }

        @Override
        public ObjectCodec getCodec() { return codec; }

        @Override
        public Version version() { return Version.unknownVersion(); }

        @Override
        public JsonGenerator enable(Feature f) {
            features |= f.getMask();
            return this;
        }

        @Override
        public JsonGenerator disable(Feature f) {
            features &= ~f.getMask();
            return this;
        }

        @Override
        public boolean isEnabled(Feature f) {
            return (features & f.getMask()) != 0;
        }

        @Override
        public int getFeatureMask() { return features; }

        @Override
        public JsonGenerator setFeatureMask(int values) {
            this.features = values;
            return this;
        }

        @Override
        public JsonGenerator useDefaultPrettyPrinter() {
            return this;
        }

        @Override
        public JsonStreamContext getOutputContext() {
            return context;
        }

        @Override
        public void writeStartArray() throws IOException {
            events.add("startArray");
        }

        @Override
        public void writeEndArray() throws IOException {
            events.add("endArray");
        }

        @Override
        public void writeStartObject() throws IOException {
            events.add("startObject");
        }

        @Override
        public void writeEndObject() throws IOException {
            events.add("endObject");
        }

        @Override
        public void writeFieldName(String name) throws IOException {
            events.add("fieldName:" + name);
        }

        @Override
        public void writeFieldName(SerializableString name) throws IOException {
            events.add("fieldName:" + name.getValue());
        }

        @Override
        public void writeString(String text) throws IOException {
            events.add("string:" + text);
        }

        @Override
        public void writeString(char[] text, int offset, int len) throws IOException {
            events.add("string:" + new String(text, offset, len));
        }

        @Override
        public void writeString(SerializableString text) throws IOException {
            events.add("string:" + text.getValue());
        }

        @Override
        public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {
            events.add("rawUTF8:" + new String(text, offset, length, "UTF-8"));
        }

        @Override
        public void writeUTF8String(byte[] text, int offset, int length) throws IOException {
            events.add("utf8:" + new String(text, offset, length, "UTF-8"));
        }

        @Override
        public void writeRaw(String text) throws IOException {
            events.add("raw:" + text);
        }

        @Override
        public void writeRaw(String text, int offset, int len) throws IOException {
            events.add("raw:" + text.substring(offset, offset + len));
        }

        @Override
        public void writeRaw(char[] text, int offset, int len) throws IOException {
            events.add("raw:" + new String(text, offset, len));
        }

        @Override
        public void writeRaw(char c) throws IOException {
            events.add("raw:" + c);
        }

        @Override
        public void writeRawValue(String text) throws IOException {
            events.add("rawValue:" + text);
        }

        @Override
        public void writeRawValue(String text, int offset, int len) throws IOException {
            events.add("rawValue:" + text.substring(offset, offset + len));
        }

        @Override
        public void writeRawValue(char[] text, int offset, int len) throws IOException {
            events.add("rawValue:" + new String(text, offset, len));
        }

        @Override
        public void writeBinary(Base64Variant bv, byte[] data, int offset, int len) throws IOException {
            StringBuilder sb = new StringBuilder("binary:");
            for (int i = offset; i < offset + len; i++) {
                if (i > offset) sb.append(",");
                sb.append(data[i]);
            }
            events.add(sb.toString());
        }

        @Override
        public int writeBinary(Base64Variant bv, InputStream data, int dataLength) throws IOException {
            events.add("binaryStream:" + dataLength);
            return dataLength;
        }

        @Override
        public void writeNumber(int v) throws IOException {
            events.add("number:" + v);
        }

        @Override
        public void writeNumber(long v) throws IOException {
            events.add("number:" + v);
        }

        @Override
        public void writeNumber(BigInteger v) throws IOException {
            events.add("number:" + v);
        }

        @Override
        public void writeNumber(double v) throws IOException {
            events.add("number:" + v);
        }

        @Override
        public void writeNumber(float v) throws IOException {
            events.add("number:" + v);
        }

        @Override
        public void writeNumber(BigDecimal v) throws IOException {
            events.add("number:" + v);
        }

        @Override
        public void writeNumber(String encodedValue) throws IOException {
            events.add("number:" + encodedValue);
        }

        @Override
        public void writeBoolean(boolean state) throws IOException {
            events.add("bool:" + state);
        }

        @Override
        public void writeNull() throws IOException {
            events.add("null");
        }

        @Override
        public void writeObject(Object pojo) throws IOException {
            events.add("object:" + pojo);
        }

        @Override
        public void writeTree(TreeNode rootNode) throws IOException {
            events.add("tree:" + rootNode);
        }

        @Override
        public void flush() throws IOException {
            events.add("flush");
        }

        @Override
        public boolean isClosed() {
            return closed;
        }

        @Override
        public void close() throws IOException {
            closed = true;
            events.add("close");
        }
    }
}
