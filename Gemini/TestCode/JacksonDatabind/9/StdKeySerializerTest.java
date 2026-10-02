package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

public class StdKeySerializerTest {

    @Test
    public void testConstructor_default_handledTypeIsObject() {
        StdKeySerializer serializer = new StdKeySerializer();
        Assert.assertEquals(Object.class, serializer.handledType());
    }

    @Test
    public void testSerialize_stringKey_writesFieldName() throws IOException {
        StdKeySerializer serializer = new StdKeySerializer();
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(writer);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        gen.writeStartObject();
        serializer.serialize("myKey", gen, provider);
        gen.writeString("myValue");
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{\"myKey\":\"myValue\"}", writer.toString());
    }

    @Test
    public void testSerialize_emptyStringKey_writesEmptyFieldName() throws IOException {
        StdKeySerializer serializer = new StdKeySerializer();
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(writer);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        gen.writeStartObject();
        serializer.serialize("", gen, provider);
        gen.writeNumber(0);
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{\"\":0}", writer.toString());
    }

    @Test
    public void testSerialize_integerKey_writesNumberAsString() throws IOException {
        StdKeySerializer serializer = new StdKeySerializer();
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(writer);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        gen.writeStartObject();
        serializer.serialize(-123, gen, provider);
        gen.writeBoolean(true);
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{\"-123\":true}", writer.toString());
    }

    @Test
    public void testSerialize_customObjectKey_usesToString() throws IOException {
        StdKeySerializer serializer = new StdKeySerializer();
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(writer);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        Object customObject = new Object() {
            @Override
            public String toString() {
                return "custom_key_representation";
            }
        };

        gen.writeStartObject();
        serializer.serialize(customObject, gen, provider);
        gen.writeNull();
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{\"custom_key_representation\":null}", writer.toString());
    }

    @Test
    public void testSerialize_dateKey_usesDefaultSerializeDateKeyAsTimestamp() throws IOException {
        StdKeySerializer serializer = new StdKeySerializer();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, true);
        StringWriter writer = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(writer);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        Date date = new Date(1609459200000L);

        gen.writeStartObject();
        serializer.serialize(date, gen, provider);
        gen.writeString("dateVal");
        gen.writeEndObject();
        gen.close();

        Assert.assertEquals("{\"1609459200000\":\"dateVal\"}", writer.toString());
    }

    @Test
    public void testSerialize_dateKey_usesDefaultSerializeDateKeyAsIso8601() throws IOException {
        StdKeySerializer serializer = new StdKeySerializer();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
        StringWriter writer = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(writer);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        Date date = new Date(0L);

        gen.writeStartObject();
        serializer.serialize(date, gen, provider);
        gen.writeString("val");
        gen.writeEndObject();
        gen.close();

        Assert.assertTrue(writer.toString().contains("1970"));
    }

    @Test
    public void testGetSchema_validProviderAndType_returnsStringSchemaNode() throws JsonMappingException {
        StdKeySerializer serializer = new StdKeySerializer();
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        JsonNode schemaNode = serializer.getSchema(provider, String.class);
        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("string", schemaNode.get("type").asText());
    }

    @Test
    public void testGetSchema_nullProviderAndType_returnsStringSchemaNode() throws JsonMappingException {
        StdKeySerializer serializer = new StdKeySerializer();
        JsonNode schemaNode = serializer.getSchema(null, null);
        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("string", schemaNode.get("type").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitor_validVisitor_expectsStringFormat() throws JsonMappingException {
        StdKeySerializer serializer = new StdKeySerializer();
        final boolean[] expectStringFormatCalled = new boolean[]{false};
        final JavaType[] capturedType = new JavaType[1];

        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) {
                expectStringFormatCalled[0] = true;
                capturedType[0] = type;
                return null;
            }
        };

        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        serializer.acceptJsonFormatVisitor(visitor, type);

        Assert.assertTrue(expectStringFormatCalled[0]);
        Assert.assertEquals(type, capturedType[0]);
    }
}
