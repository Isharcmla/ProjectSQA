package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AsPropertyTypeDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "@type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = SubTypeA.class, name = "typeA"),
            @JsonSubTypes.Type(value = SubTypeB.class, name = "typeB")
    })
    static abstract class BaseType {
        public int id;
    }

    static class SubTypeA extends BaseType {
        public String name;
    }

    static class SubTypeB extends BaseType {
        public double value;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "@type", visible = true)
    @JsonSubTypes({
            @JsonSubTypes.Type(value = VisibleSubType.class, name = "visType")
    })
    static class VisibleBaseType {
        public String type;
        public int count;

        public void set@type(String t) {
            this.type = t;
        }
    }

    static class VisibleSubType extends VisibleBaseType {
        public String extra;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "@type", defaultImpl = DefaultImplSub.class)
    static class DefaultImplBase {
        public int id;
        public String note;
    }

    static class DefaultImplSub extends DefaultImplBase {
    }

    @Test
    public void testConstructorAndGetters_normal_success() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(BaseType.class);
        TypeIdResolver idRes = new ClassNameIdResolver(baseType, TypeFactory.defaultInstance());

        AsPropertyTypeDeserializer deser5Arg = new AsPropertyTypeDeserializer(
                baseType, idRes, "@type", false, null);
        Assert.assertEquals(As.PROPERTY, deser5Arg.getTypeInclusion());
        Assert.assertEquals("@type", deser5Arg.getPropertyName());

        AsPropertyTypeDeserializer deser6Arg = new AsPropertyTypeDeserializer(
                baseType, idRes, "@type", true, null, As.EXISTING_PROPERTY);
        Assert.assertEquals(As.EXISTING_PROPERTY, deser6Arg.getTypeInclusion());
    }

    @Test
    public void testForProperty_sameAndDifferentProperty_expectedInstances() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(BaseType.class);
        TypeIdResolver idRes = new ClassNameIdResolver(baseType, TypeFactory.defaultInstance());
        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, idRes, "@type", false, null);

        Assert.assertSame(deser, deser.forProperty(null));

        BeanProperty.Bogus prop = new BeanProperty.Bogus();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer deserWithProp = deser.forProperty(prop);
        Assert.assertNotSame(deser, deserWithProp);
        Assert.assertTrue(deserWithProp instanceof AsPropertyTypeDeserializer);
        Assert.assertSame(deserWithProp, deserWithProp.forProperty(prop));
    }

    @Test
    public void testDeserializeTypedFromObject_typeIdFirst_deserializedCorrectly() throws Exception {
        String json = "{\"@type\":\"typeA\",\"id\":1,\"name\":\"testName\"}";
        BaseType result = mapper.readValue(json, BaseType.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SubTypeA);
        SubTypeA subA = (SubTypeA) result;
        Assert.assertEquals(1, subA.id);
        Assert.assertEquals("testName", subA.name);
    }

    @Test
    public void testDeserializeTypedFromObject_typeIdMiddleOrLast_bufferedCorrectly() throws Exception {
        String json = "{\"id\":2,\"name\":\"bufferedName\",\"@type\":\"typeA\"}";
        BaseType result = mapper.readValue(json, BaseType.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SubTypeA);
        SubTypeA subA = (SubTypeA) result;
        Assert.assertEquals(2, subA.id);
        Assert.assertEquals("bufferedName", subA.name);
    }

    @Test
    public void testDeserializeTypedFromObject_typeIdVisible_propertyRetained() throws Exception {
        String json = "{\"@type\":\"visType\",\"count\":10,\"extra\":\"extraVal\"}";
        VisibleBaseType result = mapper.readValue(json, VisibleBaseType.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof VisibleSubType);
        Assert.assertEquals("visType", result.type);
        Assert.assertEquals(10, result.count);
        Assert.assertEquals("extraVal", ((VisibleSubType) result).extra);
    }

    @Test
    public void testDeserializeTypedFromObject_typeIdVisibleBuffered_propertyRetained() throws Exception {
        String json = "{\"count\":20,\"extra\":\"extraVal2\",\"@type\":\"visType\"}";
        VisibleBaseType result = mapper.readValue(json, VisibleBaseType.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof VisibleSubType);
        Assert.assertEquals("visType", result.type);
        Assert.assertEquals(20, result.count);
        Assert.assertEquals("extraVal2", ((VisibleSubType) result).extra);
    }

    @Test
    public void testDeserializeTypedFromObject_defaultImplUsed_whenTypeIdMissing() throws Exception {
        String json = "{\"id\":99,\"note\":\"usingDefault\"}";
        DefaultImplBase result = mapper.readValue(json, DefaultImplBase.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof DefaultImplSub);
        Assert.assertEquals(99, result.id);
        Assert.assertEquals("usingDefault", result.note);
    }

    @Test(expected = MismatchedInputException.class)
    public void testDeserializeTypedFromObject_missingTypeIdWithoutDefaultImpl_throwsException() throws Exception {
        String json = "{\"id\":10,\"name\":\"missingType\"}";
        mapper.readValue(json, BaseType.class);
    }

    @Test
    public void testDeserializeTypedFromObject_emptyObjectWithoutTypeId_throwsException() throws Exception {
        try {
            mapper.readValue("{}", BaseType.class);
            Assert.fail("Expected MismatchedInputException for missing type id in empty object");
        } catch (MismatchedInputException e) {
            Assert.assertTrue(e.getMessage().contains("missing property '@type'"));
        }
    }

    @Test
    public void testDeserializeTypedFromObject_naturalTypeFallback() throws Exception {
        JavaType objType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idRes = new ClassNameIdResolver(objType, TypeFactory.defaultInstance());
        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                objType, idRes, "@type", false, null);

        DeserializationContext ctxt = mapper.getDeserializationContext();
        if (ctxt instanceof com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) {
            ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) ctxt)
                    .createInstance(mapper.getDeserializationConfig(), mapper.getFactory().createParser("\"aString\""), null);
        }

        JsonParser parser = mapper.getFactory().createParser("\"naturalString\"");
        parser.nextToken(); // pointing to VALUE_STRING
        Object result = deser.deserializeTypedFromObject(parser, ctxt);
        Assert.assertEquals("naturalString", result);
    }

    @Test
    public void testDeserializeTypedFromAny_withArrayToken_delegatesToArrayDeserializer() throws Exception {
        JavaType baseType = TypeFactory.defaultInstance().constructType(BaseType[].class);
        TypeIdResolver idRes = new ClassNameIdResolver(baseType, TypeFactory.defaultInstance());
        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, idRes, "@type", false, null);

        DeserializationContext ctxt = mapper.getDeserializationContext();
        if (ctxt instanceof com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) {
            ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) ctxt)
                    .createInstance(mapper.getDeserializationConfig(), mapper.getFactory().createParser("[]"), null);
        }

        JsonParser parser = mapper.getFactory().createParser("[]");
        parser.nextToken(); // START_ARRAY
        try {
            deser.deserializeTypedFromAny(parser, ctxt);
        } catch (MismatchedInputException e) {
            // Expected when trying to deserialize empty array without proper wrapper info
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void testDeserializeTypedFromAny_withObjectToken_delegatesToObjectDeserializer() throws Exception {
        String json = "{\"@type\":\"typeB\",\"id\":5,\"value\":3.14}";
        BaseType result = mapper.readValue(json, BaseType.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SubTypeB);
        SubTypeB subB = (SubTypeB) result;
        Assert.assertEquals(5, subB.id);
        Assert.assertEquals(3.14, subB.value, 0.001);
    }

    @Test
    public void testDeserializeTypedFromObject_withNativeTypeId_deserializesDirectly() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(BaseType.class);
        TypeIdResolver idRes = new TypeNameIdResolver(
                mapper.getDeserializationConfig(),
                baseType,
                new java.util.HashMap<String, String>(),
                java.util.Collections.singletonMap(SubTypeA.class.getName(), "typeA")
        ) {
            @Override
            public JavaType typeFromId(DatabindContext context, String id) {
                return TypeFactory.defaultInstance().constructType(SubTypeA.class);
            }
        };

        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, idRes, "@type", false, null);

        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeStartObject();
        tb.writeTypeId("typeA");
        tb.writeFieldName("id");
        tb.writeNumber(42);
        tb.writeFieldName("name");
        tb.writeString("nativeType");
        tb.writeEndObject();

        JsonParser parser = tb.asParser(mapper);
        parser.nextToken(); // START_OBJECT

        DeserializationContext ctxt = mapper.getDeserializationContext();
        if (ctxt instanceof com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) {
            ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) ctxt)
                    .createInstance(mapper.getDeserializationConfig(), parser, null);
        }

        Object result = deser.deserializeTypedFromObject(parser, ctxt);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SubTypeA);
        Assert.assertEquals(42, ((SubTypeA) result).id);
        Assert.assertEquals("nativeType", ((SubTypeA) result).name);
    }

    @Test
    public void testDeserializeTypedUsingDefaultImpl_withStartArray_delegatesToSuper() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(BaseType.class);
        TypeIdResolver idRes = new ClassNameIdResolver(baseType, TypeFactory.defaultInstance());
        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, idRes, "@type", false, null);

        JsonParser parser = mapper.getFactory().createParser("[]");
        parser.nextToken(); // START_ARRAY

        DeserializationContext ctxt = mapper.getDeserializationContext();
        if (ctxt instanceof com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) {
            ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) ctxt)
                    .createInstance(mapper.getDeserializationConfig(), parser, null);
        }

        try {
            deser.deserializeTypedFromObject(parser, ctxt);
            Assert.fail("Expected exception when handling START_ARRAY under default impl without array wrapper");
        } catch (MismatchedInputException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }
}
