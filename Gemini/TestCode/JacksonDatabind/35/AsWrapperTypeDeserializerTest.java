package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

public class AsWrapperTypeDeserializerTest {

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)
    @JsonTypeName("base")
    static class BaseType {
        public String id;
    }

    @JsonTypeName("impl")
    static class SubType extends BaseType {
        public int count;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "type", visible = true)
    @JsonTypeName("visibleImpl")
    static class VisibleType {
        public String type;
        public String value;
    }

    static class WrapperHolder {
        public BaseType item;
    }

    private ObjectMapper mapper;
    private JavaType baseJavaType;
    private TypeIdResolver typeIdResolver;
    private AsWrapperTypeDeserializer deserializer;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        mapper.registerSubtypes(new NamedType(SubType.class, "impl"));
        mapper.registerSubtypes(new NamedType(VisibleType.class, "visibleImpl"));

        baseJavaType = mapper.constructType(BaseType.class);
        typeIdResolver = ClassNameIdResolver.construct(
                baseJavaType,
                mapper.getDeserializationConfig(),
                mapper.getDeserializationConfig().getPolymorphicTypeValidator()
        );
        deserializer = new AsWrapperTypeDeserializer(baseJavaType, typeIdResolver, "type", false, SubType.class);
    }

    @Test
    public void testGetTypeInclusion_returnsWrapperObject() {
        Assert.assertEquals(JsonTypeInfo.As.WRAPPER_OBJECT, deserializer.getTypeInclusion());
    }

    @Test
    public void testForProperty_sameProperty_returnsSelf() {
        TypeDeserializer result = deserializer.forProperty(null);
        Assert.assertSame(deserializer, result);
    }

    @Test
    public void testForProperty_differentProperty_returnsNewInstance() {
        BeanProperty prop = new BeanProperty.Bogus();
        TypeDeserializer result = deserializer.forProperty(prop);
        Assert.assertNotSame(deserializer, result);
        Assert.assertSame(prop, result.getPropertyName() == null ? prop : result.getPropertyName());
        
        TypeDeserializer result2 = result.forProperty(prop);
        Assert.assertSame(result, result2);
    }

    @Test
    public void testDeserializeTypedFromObject_validWrapperObject_success() throws IOException {
        String json = "{\"impl\":{\"id\":\"test-1\",\"count\":42}}";
        BaseType result = mapper.readValue(json, BaseType.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SubType);
        SubType sub = (SubType) result;
        Assert.assertEquals("test-1", sub.id);
        Assert.assertEquals(42, sub.count);
    }

    @Test
    public void testDeserializeTypedFromArray_invokedDirectly_success() throws IOException {
        String json = "{\"impl\":{\"id\":\"arr-1\",\"count\":10}}";
        JsonParser parser = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        ctxt = mapper.createDeserializationContext(parser);

        parser.nextToken();
        Object result = deserializer.deserializeTypedFromArray(parser, ctxt);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SubType);
        Assert.assertEquals("arr-1", ((SubType) result).id);
    }

    @Test
    public void testDeserializeTypedFromScalar_invokedDirectly_success() throws IOException {
        String json = "{\"impl\":{\"id\":\"scalar-1\",\"count\":99}}";
        JsonParser parser = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.createDeserializationContext(parser);

        parser.nextToken();
        Object result = deserializer.deserializeTypedFromScalar(parser, ctxt);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SubType);
        Assert.assertEquals("scalar-1", ((SubType) result).id);
    }

    @Test
    public void testDeserializeTypedFromAny_invokedDirectly_success() throws IOException {
        String json = "{\"impl\":{\"id\":\"any-1\",\"count\":5}}";
        JsonParser parser = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.createDeserializationContext(parser);

        parser.nextToken();
        Object result = deserializer.deserializeTypedFromAny(parser, ctxt);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SubType);
        Assert.assertEquals("any-1", ((SubType) result).id);
    }

    @Test
    public void testDeserialize_withTypeIdVisible_success() throws IOException {
        String json = "{\"visibleImpl\":{\"value\":\"hello\"}}";
        VisibleType result = mapper.readValue(json, VisibleType.class);

        Assert.assertNotNull(result);
        Assert.assertEquals("visibleImpl", result.type);
        Assert.assertEquals("hello", result.value);
    }

    @Test
    public void testDeserialize_withNativeTypeId_success() throws IOException {
        String json = "{\"id\":\"native-1\",\"count\":7}";
        JsonParser baseParser = mapper.getFactory().createParser(json);
        baseParser.nextToken();

        JsonParser nativeIdParser = new JsonParserDelegate(baseParser) {
            @Override
            public boolean canReadTypeId() {
                return true;
            }

            @Override
            public Object getTypeId() {
                return "impl";
            }
        };

        DeserializationContext ctxt = mapper.createDeserializationContext(nativeIdParser);
        Object result = deserializer.deserializeTypedFromObject(nativeIdParser, ctxt);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SubType);
        Assert.assertEquals("native-1", ((SubType) result).id);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_notStartObject_throwsException() throws IOException {
        String json = "[\"impl\", {\"id\":\"test\"}]";
        mapper.readValue(json, BaseType.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_emptyObject_throwsException() throws IOException {
        String json = "{}";
        mapper.readValue(json, BaseType.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_missingClosingEndObject_throwsException() throws IOException {
        String json = "{\"impl\":{\"id\":\"test\"}, \"extraField\":\"invalid\"}";
        JsonParser parser = mapper.getFactory().createParser(json);
        DeserializationContext ctxt = mapper.createDeserializationContext(parser);
        parser.nextToken();

        deserializer.deserializeTypedFromObject(parser, ctxt);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_unknownTypeId_throwsException() throws IOException {
        String json = "{\"unknownType\":{\"id\":\"test\"}}";
        mapper.readValue(json, BaseType.class);
    }

    @Test
    public void testDeserialize_nullOrEmptyFields_success() throws IOException {
        String json = "{\"impl\":{}}";
        BaseType result = mapper.readValue(json, BaseType.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SubType);
        Assert.assertNull(result.id);
        Assert.assertEquals(0, ((SubType) result).count);
    }
}
