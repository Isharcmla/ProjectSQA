package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

public class NullifyingDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();
    private final JsonFactory jsonFactory = new JsonFactory();

    private static class TrackingTypeDeserializer extends TypeDeserializer {
        boolean called = false;
        Object returnedValue = "handled_by_type_deserializer";

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return this;
        }

        @Override
        public As getTypeInclusion() {
            return As.PROPERTY;
        }

        @Override
        public String getPropertyName() {
            return "@type";
        }

        @Override
        public TypeIdResolver getTypeIdResolver() {
            return null;
        }

        @Override
        public Class<?> getDefaultImpl() {
            return null;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) {
            return null;
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) {
            return null;
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) {
            return null;
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) {
            this.called = true;
            return this.returnedValue;
        }
    }

    @Test
    public void testInstanceAndConstructor_normal_nonNull() {
        NullifyingDeserializer instance = NullifyingDeserializer.instance;
        Assert.assertNotNull(instance);

        NullifyingDeserializer created = new NullifyingDeserializer();
        Assert.assertNotNull(created);
        Assert.assertEquals(Object.class, created.handledType());
    }

    @Test
    public void testDeserialize_scalarString_returnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        JsonParser p = jsonFactory.createParser("\"hello world\"");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(p, ctxt);

        Assert.assertNull(result);
        p.close();
    }

    @Test
    public void testDeserialize_scalarNumber_returnsNull() throws IOException {
        NullifyingDeserializer deser = new NullifyingDeserializer();
        JsonParser p = jsonFactory.createParser("12345");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(p, ctxt);

        Assert.assertNull(result);
        p.close();
    }

    @Test
    public void testDeserialize_scalarNegativeNumber_returnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        JsonParser p = jsonFactory.createParser("-999");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(p, ctxt);

        Assert.assertNull(result);
        p.close();
    }

    @Test
    public void testDeserialize_scalarBoolean_returnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        JsonParser p = jsonFactory.createParser("true");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(p, ctxt);

        Assert.assertNull(result);
        p.close();
    }

    @Test
    public void testDeserialize_nullLiteral_returnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        JsonParser p = jsonFactory.createParser("null");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(p, ctxt);

        Assert.assertNull(result);
        p.close();
    }

    @Test
    public void testDeserialize_emptyObject_returnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        JsonParser p = jsonFactory.createParser("{}");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(p, ctxt);

        Assert.assertNull(result);
        p.close();
    }

    @Test
    public void testDeserialize_complexObject_skipsChildrenAndReturnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        JsonParser p = jsonFactory.createParser("{\"name\":\"test\",\"nested\":{\"a\":1,\"b\":[1,2,3]}}");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(p, ctxt);

        Assert.assertNull(result);
        Assert.assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testDeserialize_emptyArray_returnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        JsonParser p = jsonFactory.createParser("[]");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(p, ctxt);

        Assert.assertNull(result);
        p.close();
    }

    @Test
    public void testDeserialize_nestedArray_skipsChildrenAndReturnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        JsonParser p = jsonFactory.createParser("[[1, 2], {\"k\": \"v\"}, [3, 4]]");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(p, ctxt);

        Assert.assertNull(result);
        Assert.assertEquals(JsonToken.END_ARRAY, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testDeserializeWithType_startObjectToken_delegatesToTypeDeserializer() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        TrackingTypeDeserializer typeDeser = new TrackingTypeDeserializer();
        JsonParser p = jsonFactory.createParser("{\"prop\":\"value\"}");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserializeWithType(p, ctxt, typeDeser);

        Assert.assertTrue(typeDeser.called);
        Assert.assertEquals("handled_by_type_deserializer", result);
        p.close();
    }

    @Test
    public void testDeserializeWithType_startArrayToken_delegatesToTypeDeserializer() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        TrackingTypeDeserializer typeDeser = new TrackingTypeDeserializer();
        JsonParser p = jsonFactory.createParser("[1, 2, 3]");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserializeWithType(p, ctxt, typeDeser);

        Assert.assertTrue(typeDeser.called);
        Assert.assertEquals("handled_by_type_deserializer", result);
        p.close();
    }

    @Test
    public void testDeserializeWithType_fieldNameToken_delegatesToTypeDeserializer() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        TrackingTypeDeserializer typeDeser = new TrackingTypeDeserializer();
        JsonParser p = jsonFactory.createParser("{\"prop\":\"value\"}");
        p.nextToken();
        p.nextToken();

        Assert.assertEquals(JsonToken.FIELD_NAME, p.getCurrentToken());

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserializeWithType(p, ctxt, typeDeser);

        Assert.assertTrue(typeDeser.called);
        Assert.assertEquals("handled_by_type_deserializer", result);
        p.close();
    }

    @Test
    public void testDeserializeWithType_scalarStringToken_returnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        TrackingTypeDeserializer typeDeser = new TrackingTypeDeserializer();
        JsonParser p = jsonFactory.createParser("\"just a string\"");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserializeWithType(p, ctxt, typeDeser);

        Assert.assertFalse(typeDeser.called);
        Assert.assertNull(result);
        p.close();
    }

    @Test
    public void testDeserializeWithType_scalarIntToken_returnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        TrackingTypeDeserializer typeDeser = new TrackingTypeDeserializer();
        JsonParser p = jsonFactory.createParser("42");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserializeWithType(p, ctxt, typeDeser);

        Assert.assertFalse(typeDeser.called);
        Assert.assertNull(result);
        p.close();
    }

    @Test
    public void testDeserializeWithType_scalarBooleanToken_returnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        TrackingTypeDeserializer typeDeser = new TrackingTypeDeserializer();
        JsonParser p = jsonFactory.createParser("false");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserializeWithType(p, ctxt, typeDeser);

        Assert.assertFalse(typeDeser.called);
        Assert.assertNull(result);
        p.close();
    }

    @Test
    public void testDeserializeWithType_nullToken_returnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        TrackingTypeDeserializer typeDeser = new TrackingTypeDeserializer();
        JsonParser p = jsonFactory.createParser("null");
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserializeWithType(p, ctxt, typeDeser);

        Assert.assertFalse(typeDeser.called);
        Assert.assertNull(result);
        p.close();
    }

    @Test
    public void testDeserializeWithType_noToken_returnsNull() throws IOException {
        NullifyingDeserializer deser = NullifyingDeserializer.instance;
        TrackingTypeDeserializer typeDeser = new TrackingTypeDeserializer();
        JsonParser p = jsonFactory.createParser("");

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserializeWithType(p, ctxt, typeDeser);

        Assert.assertFalse(typeDeser.called);
        Assert.assertNull(result);
        p.close();
    }
}
