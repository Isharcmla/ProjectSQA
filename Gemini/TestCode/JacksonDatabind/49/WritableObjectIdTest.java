package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class WritableObjectIdTest {

    private ObjectMapper objectMapper;
    private SerializerProvider serializerProvider;
    private JsonFactory jsonFactory;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        serializerProvider = objectMapper.getSerializerProviderInstance();
        jsonFactory = new JsonFactory();
    }

    private static class TrackingSerializer extends JsonSerializer<Object> {
        Object serializedValue;
        int callCount = 0;

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            this.serializedValue = value;
            this.callCount++;
            gen.writeNumber(value == null ? 0 : ((Number) value).intValue());
        }
    }

    private static class NativeIdJsonGenerator extends JsonGeneratorDelegate {
        Object writtenObjectId;
        Object writtenObjectRef;

        NativeIdJsonGenerator(JsonGenerator delegate) {
            super(delegate);
        }

        @Override
        public boolean canWriteObjectId() {
            return true;
        }

        @Override
        public void writeObjectId(Object id) throws IOException {
            this.writtenObjectId = id;
        }

        @Override
        public void writeObjectRef(Object id) throws IOException {
            this.writtenObjectRef = id;
        }
    }

    private ObjectIdWriter createObjectIdWriter(SerializableString propertyName,
                                                ObjectIdGenerator<?> generator,
                                                JsonSerializer<?> serializer,
                                                boolean alwaysAsId) {
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);
        return new ObjectIdWriter(type, propertyName, generator, serializer, alwaysAsId);
    }

    @Test
    public void testConstructor_initialState_fieldsCorrectlySet() {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);

        Assert.assertSame(generator, writableObjectId.generator);
        Assert.assertNull(writableObjectId.id);
        Assert.assertFalse(writableObjectId.idWritten);
    }

    @Test
    public void testGenerateId_validPojo_generatesAndStoresId() {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);

        Object pojo = new Object();
        Object generatedId = writableObjectId.generateId(pojo);

        Assert.assertNotNull(generatedId);
        Assert.assertEquals(1, generatedId);
        Assert.assertEquals(generatedId, writableObjectId.id);
    }

    @Test
    public void testGenerateId_nullPojo_generatesAndStoresId() {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);

        Object generatedId = writableObjectId.generateId(null);

        Assert.assertNotNull(generatedId);
        Assert.assertEquals(1, generatedId);
        Assert.assertEquals(generatedId, writableObjectId.id);
    }

    @Test
    public void testWriteAsId_idIsNull_returnsFalse() throws IOException {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);
        TrackingSerializer serializer = new TrackingSerializer();
        ObjectIdWriter writer = createObjectIdWriter(new SerializedString("id"), generator, serializer, true);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);

        boolean result = writableObjectId.writeAsId(gen, serializerProvider, writer);

        Assert.assertFalse(result);
        Assert.assertEquals(0, serializer.callCount);
    }

    @Test
    public void testWriteAsId_idNotNullIdNotWrittenAlwaysAsIdFalse_returnsFalse() throws IOException {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);
        writableObjectId.id = 123;
        TrackingSerializer serializer = new TrackingSerializer();
        ObjectIdWriter writer = createObjectIdWriter(new SerializedString("id"), generator, serializer, false);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);

        boolean result = writableObjectId.writeAsId(gen, serializerProvider, writer);

        Assert.assertFalse(result);
        Assert.assertEquals(0, serializer.callCount);
    }

    @Test
    public void testWriteAsId_idWrittenTrueNativeIdFalse_serializesIdAndReturnsTrue() throws IOException {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);
        writableObjectId.id = 456;
        writableObjectId.idWritten = true;

        TrackingSerializer serializer = new TrackingSerializer();
        ObjectIdWriter writer = createObjectIdWriter(new SerializedString("id"), generator, serializer, false);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);

        boolean result = writableObjectId.writeAsId(gen, serializerProvider, writer);

        Assert.assertTrue(result);
        Assert.assertEquals(1, serializer.callCount);
        Assert.assertEquals(456, serializer.serializedValue);
    }

    @Test
    public void testWriteAsId_idWrittenTrueNativeIdTrue_writesObjectRefAndReturnsTrue() throws IOException {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);
        writableObjectId.id = 789;
        writableObjectId.idWritten = true;

        TrackingSerializer serializer = new TrackingSerializer();
        ObjectIdWriter writer = createObjectIdWriter(new SerializedString("id"), generator, serializer, false);

        StringWriter sw = new StringWriter();
        NativeIdJsonGenerator gen = new NativeIdJsonGenerator(jsonFactory.createGenerator(sw));

        boolean result = writableObjectId.writeAsId(gen, serializerProvider, writer);

        Assert.assertTrue(result);
        Assert.assertEquals(0, serializer.callCount);
        Assert.assertEquals("789", gen.writtenObjectRef);
    }

    @Test
    public void testWriteAsId_alwaysAsIdTrueNativeIdFalse_serializesIdAndReturnsTrue() throws IOException {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);
        writableObjectId.id = 100;
        writableObjectId.idWritten = false;

        TrackingSerializer serializer = new TrackingSerializer();
        ObjectIdWriter writer = createObjectIdWriter(new SerializedString("id"), generator, serializer, true);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);

        boolean result = writableObjectId.writeAsId(gen, serializerProvider, writer);

        Assert.assertTrue(result);
        Assert.assertEquals(1, serializer.callCount);
        Assert.assertEquals(100, serializer.serializedValue);
    }

    @Test
    public void testWriteAsId_alwaysAsIdTrueNativeIdTrue_writesObjectRefAndReturnsTrue() throws IOException {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);
        writableObjectId.id = 200;
        writableObjectId.idWritten = false;

        TrackingSerializer serializer = new TrackingSerializer();
        ObjectIdWriter writer = createObjectIdWriter(new SerializedString("id"), generator, serializer, true);

        StringWriter sw = new StringWriter();
        NativeIdJsonGenerator gen = new NativeIdJsonGenerator(jsonFactory.createGenerator(sw));

        boolean result = writableObjectId.writeAsId(gen, serializerProvider, writer);

        Assert.assertTrue(result);
        Assert.assertEquals(0, serializer.callCount);
        Assert.assertEquals("200", gen.writtenObjectRef);
    }

    @Test
    public void testWriteAsField_nativeIdTrue_writesObjectIdAndMarksWritten() throws IOException {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);
        writableObjectId.id = 300;

        TrackingSerializer serializer = new TrackingSerializer();
        ObjectIdWriter writer = createObjectIdWriter(new SerializedString("id"), generator, serializer, false);

        StringWriter sw = new StringWriter();
        NativeIdJsonGenerator gen = new NativeIdJsonGenerator(jsonFactory.createGenerator(sw));

        writableObjectId.writeAsField(gen, serializerProvider, writer);

        Assert.assertTrue(writableObjectId.idWritten);
        Assert.assertEquals("300", gen.writtenObjectId);
        Assert.assertEquals(0, serializer.callCount);
    }

    @Test
    public void testWriteAsField_nativeIdFalseWithPropertyName_writesFieldAndSerializesId() throws IOException {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);
        writableObjectId.id = 400;

        TrackingSerializer serializer = new TrackingSerializer();
        ObjectIdWriter writer = createObjectIdWriter(new SerializedString("customId"), generator, serializer, false);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        gen.writeStartObject();

        writableObjectId.writeAsField(gen, serializerProvider, writer);

        gen.writeEndObject();
        gen.flush();

        Assert.assertTrue(writableObjectId.idWritten);
        Assert.assertEquals(1, serializer.callCount);
        Assert.assertEquals(400, serializer.serializedValue);
        Assert.assertEquals("{\"customId\":400}", sw.toString());
    }

    @Test
    public void testWriteAsField_nativeIdFalseNullPropertyName_marksWrittenWithoutSerializing() throws IOException {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);
        writableObjectId.id = 500;

        TrackingSerializer serializer = new TrackingSerializer();
        ObjectIdWriter writer = createObjectIdWriter(null, generator, serializer, false);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        gen.writeStartObject();

        writableObjectId.writeAsField(gen, serializerProvider, writer);

        gen.writeEndObject();
        gen.flush();

        Assert.assertTrue(writableObjectId.idWritten);
        Assert.assertEquals(0, serializer.callCount);
        Assert.assertEquals("{}", sw.toString());
    }

    @Test
    public void testWriteAsField_withZeroAndNegativeAndEmptyStringIds() throws IOException {
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator();
        WritableObjectId writableObjectId = new WritableObjectId(generator);

        // Test with 0
        writableObjectId.id = 0;
        StringWriter sw1 = new StringWriter();
        NativeIdJsonGenerator gen1 = new NativeIdJsonGenerator(jsonFactory.createGenerator(sw1));
        writableObjectId.writeAsField(gen1, serializerProvider, createObjectIdWriter(new SerializedString("id"), generator, new TrackingSerializer(), false));
        Assert.assertEquals("0", gen1.writtenObjectId);

        // Test with negative number
        writableObjectId.id = -1;
        StringWriter sw2 = new StringWriter();
        NativeIdJsonGenerator gen2 = new NativeIdJsonGenerator(jsonFactory.createGenerator(sw2));
        writableObjectId.writeAsField(gen2, serializerProvider, createObjectIdWriter(new SerializedString("id"), generator, new TrackingSerializer(), false));
        Assert.assertEquals("-1", gen2.writtenObjectId);

        // Test with empty string
        writableObjectId.id = "";
        StringWriter sw3 = new StringWriter();
        NativeIdJsonGenerator gen3 = new NativeIdJsonGenerator(jsonFactory.createGenerator(sw3));
        writableObjectId.writeAsField(gen3, serializerProvider, createObjectIdWriter(new SerializedString("id"), generator, new TrackingSerializer(), false));
        Assert.assertEquals("", gen3.writtenObjectId);
    }
}
