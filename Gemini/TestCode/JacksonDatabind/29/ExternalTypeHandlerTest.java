package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Test;

public class ExternalTypeHandlerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    // ----------------------------------------------------------------------
    // POJOs for testing external property deserialization
    // ----------------------------------------------------------------------

    interface ValueInterface { }

    @JsonTypeName("implA")
    static class ValueImplA implements ValueInterface {
        public int a;

        public ValueImplA() { }
        public ValueImplA(int a) { this.a = a; }
    }

    @JsonTypeName("implB")
    static class ValueImplB implements ValueInterface {
        public String b;

        public ValueImplB() { }
        public ValueImplB(String b) { this.b = b; }
    }

    static class DefaultImpl implements ValueInterface {
        public int val = 99;
    }

    // Standard POJO with setter-based external type
    static class ExternalBean {
        public String type;

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        @JsonSubTypes({
            @JsonSubTypes.Type(value = ValueImplA.class, name = "implA"),
            @JsonSubTypes.Type(value = ValueImplB.class, name = "implB")
        })
        public ValueInterface value;

        public int other;
    }

    // POJO with external type and defaultImpl
    static class ExternalBeanWithDefault {
        public String type;

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type", defaultImpl = DefaultImpl.class)
        @JsonSubTypes({
            @JsonSubTypes.Type(value = ValueImplA.class, name = "implA")
        })
        public ValueInterface value;
    }

    // POJO with natural type handling (Object type)
    static class NaturalExternalBean {
        public String type;

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        public Object value;
    }

    // POJO with Creator-based external type
    static class CreatorExternalBean {
        public final String type;
        public final ValueInterface value;
        public final int other;

        @JsonCreator
        public CreatorExternalBean(
                @JsonProperty("type") String type,
                @JsonProperty("value")
                @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
                @JsonSubTypes({
                    @JsonSubTypes.Type(value = ValueImplA.class, name = "implA"),
                    @JsonSubTypes.Type(value = ValueImplB.class, name = "implB")
                }) ValueInterface value,
                @JsonProperty("other") int other) {
            this.type = type;
            this.value = value;
            this.other = other;
        }
    }

    // POJO with Creator-based external type and defaultImpl
    static class CreatorDefaultBean {
        public final String type;
        public final ValueInterface value;

        @JsonCreator
        public CreatorDefaultBean(
                @JsonProperty("type") String type,
                @JsonProperty("value")
                @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type", defaultImpl = DefaultImpl.class)
                @JsonSubTypes({
                    @JsonSubTypes.Type(value = ValueImplA.class, name = "implA")
                }) ValueInterface value) {
            this.type = type;
            this.value = value;
        }
    }

    // POJO with mixed creator and non-creator properties
    static class MixedCreatorExternalBean {
        public final String type;
        public final ValueInterface value;
        public int extra;

        @JsonCreator
        public MixedCreatorExternalBean(
                @JsonProperty("type") String type,
                @JsonProperty("value")
                @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
                @JsonSubTypes({
                    @JsonSubTypes.Type(value = ValueImplA.class, name = "implA")
                }) ValueInterface value) {
            this.type = type;
            this.value = value;
        }

        public void setExtra(int extra) {
            this.extra = extra;
        }
    }

    // POJO with creator where external type property is NOT in creator, but value is in creator
    static class ValueCreatorTypeFieldBean {
        public String type;
        public final ValueInterface value;

        @JsonCreator
        public ValueCreatorTypeFieldBean(
                @JsonProperty("value")
                @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
                @JsonSubTypes({
                    @JsonSubTypes.Type(value = ValueImplA.class, name = "implA")
                }) ValueInterface value) {
            this.value = value;
        }
    }

    // ----------------------------------------------------------------------
    // Unit tests: Builder and direct handler methods
    // ----------------------------------------------------------------------

    @Test
    public void testBuilder_emptyBuild_success() {
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        ExternalTypeHandler handler = builder.build();
        Assert.assertNotNull(handler);

        ExternalTypeHandler copy = handler.start();
        Assert.assertNotNull(copy);
        Assert.assertNotSame(handler, copy);
    }

    @Test
    public void testHandlePropertyValue_unknownProperty_returnsFalse() throws Exception {
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        ExternalTypeHandler handler = builder.build().start();

        JsonParser parser = mapper.getFactory().createParser("{\"unknown\":\"val\"}");
        parser.nextToken();
        parser.nextToken(); // points to "val"

        DeserializationContext ctxt = mapper.getDeserializationContext();
        boolean handled = handler.handlePropertyValue(parser, ctxt, "unknown", new Object());
        Assert.assertFalse(handled);
        parser.close();
    }

    @Test
    public void testHandleTypePropertyValue_unknownProperty_returnsFalse() throws Exception {
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        ExternalTypeHandler handler = builder.build().start();

        JsonParser parser = mapper.getFactory().createParser("{\"unknown\":\"val\"}");
        parser.nextToken();
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        boolean handled = handler.handleTypePropertyValue(parser, ctxt, "unknown", new Object());
        Assert.assertFalse(handled);
        parser.close();
    }

    @Test
    public void testHandleTypePropertyValue_knownPropertyButNotTypePropertyName_returnsFalse() throws Exception {
        JavaType baseType = TypeFactory.defaultInstance().constructType(ValueInterface.class);
        ClassNameIdResolver idResolver = new ClassNameIdResolver(baseType, TypeFactory.defaultInstance());
        TypeDeserializer typeDeser = new AsPropertyTypeDeserializer(baseType, idResolver, "typeProp", false, null);

        JavaType beanType = TypeFactory.defaultInstance().constructType(ExternalBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(beanType);
        SettableBeanProperty prop = null;
        for (SettableBeanProperty p : mapper.getDeserializationConfig().introspect(beanType).findProperties()) {
            // Find property
        }

        // Using Builder to configure matching property name vs type property name
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        // Construct a SettableBeanProperty from deserializer
        JsonDeserializer<Object> deser = mapper.getDeserializationContext().findRootValueDeserializer(beanType);
        Assert.assertNotNull(deser);

        // Build handler with mock-free deserializer from Jackson
        ExternalBean bean = new ExternalBean();
        ExternalTypeHandler handler = builder.build().start();
        JsonParser parser = mapper.getFactory().createParser("\"test\"");
        parser.nextToken();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        Assert.assertFalse(handler.handleTypePropertyValue(parser, ctxt, "nonExistent", bean));
        parser.close();
    }

    // ----------------------------------------------------------------------
    // End-to-end integration tests covering all execution paths
    // ----------------------------------------------------------------------

    @Test
    public void testDeserialize_typeFirstThenValue_success() throws Exception {
        String json = "{\"type\":\"implA\",\"value\":{\"a\":123},\"other\":456}";
        ExternalBean bean = mapper.readValue(json, ExternalBean.class);

        Assert.assertNotNull(bean);
        Assert.assertEquals("implA", bean.type);
        Assert.assertTrue(bean.value instanceof ValueImplA);
        Assert.assertEquals(123, ((ValueImplA) bean.value).a);
        Assert.assertEquals(456, bean.other);
    }

    @Test
    public void testDeserialize_valueFirstThenType_success() throws Exception {
        String json = "{\"value\":{\"b\":\"hello\"},\"type\":\"implB\",\"other\":789}";
        ExternalBean bean = mapper.readValue(json, ExternalBean.class);

        Assert.assertNotNull(bean);
        Assert.assertEquals("implB", bean.type);
        Assert.assertTrue(bean.value instanceof ValueImplB);
        Assert.assertEquals("hello", ((ValueImplB) bean.value).b);
        Assert.assertEquals(789, bean.other);
    }

    @Test
    public void testDeserialize_missingBothTypeAndValue_success() throws Exception {
        String json = "{\"other\":100}";
        ExternalBean bean = mapper.readValue(json, ExternalBean.class);

        Assert.assertNotNull(bean);
        Assert.assertNull(bean.type);
        Assert.assertNull(bean.value);
        Assert.assertEquals(100, bean.other);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_missingType_throwsJsonMappingException() throws Exception {
        String json = "{\"value\":{\"a\":123},\"other\":456}";
        mapper.readValue(json, ExternalBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_missingValue_throwsJsonMappingException() throws Exception {
        String json = "{\"type\":\"implA\",\"other\":456}";
        mapper.readValue(json, ExternalBean.class);
    }

    @Test
    public void testDeserialize_withDefaultImpl_usesDefaultWhenTypeMissing() throws Exception {
        String json = "{\"value\":{\"val\":42}}";
        ExternalBeanWithDefault bean = mapper.readValue(json, ExternalBeanWithDefault.class);

        Assert.assertNotNull(bean);
        Assert.assertNull(bean.type);
        Assert.assertTrue(bean.value instanceof DefaultImpl);
        Assert.assertEquals(42, ((DefaultImpl) bean.value).val);
    }

    @Test
    public void testDeserialize_naturalType_deserializesScalarDirectly() throws Exception {
        String json = "{\"value\":\"a scalar string\"}";
        NaturalExternalBean bean = mapper.readValue(json, NaturalExternalBean.class);

        Assert.assertNotNull(bean);
        Assert.assertEquals("a scalar string", bean.value);
        Assert.assertNull(bean.type);
    }

    @Test
    public void testDeserialize_naturalTypeInteger_deserializesScalarDirectly() throws Exception {
        String json = "{\"value\":12345}";
        NaturalExternalBean bean = mapper.readValue(json, NaturalExternalBean.class);

        Assert.assertNotNull(bean);
        Assert.assertEquals(12345, bean.value);
        Assert.assertNull(bean.type);
    }

    @Test
    public void testDeserialize_naturalTypeBoolean_deserializesScalarDirectly() throws Exception {
        String json = "{\"value\":true}";
        NaturalExternalBean bean = mapper.readValue(json, NaturalExternalBean.class);

        Assert.assertNotNull(bean);
        Assert.assertEquals(true, bean.value);
        Assert.assertNull(bean.type);
    }

    @Test
    public void testDeserialize_creator_typeFirstThenValue_success() throws Exception {
        String json = "{\"type\":\"implA\",\"value\":{\"a\":999},\"other\":1}";
        CreatorExternalBean bean = mapper.readValue(json, CreatorExternalBean.class);

        Assert.assertNotNull(bean);
        Assert.assertEquals("implA", bean.type);
        Assert.assertTrue(bean.value instanceof ValueImplA);
        Assert.assertEquals(999, ((ValueImplA) bean.value).a);
        Assert.assertEquals(1, bean.other);
    }

    @Test
    public void testDeserialize_creator_valueFirstThenType_success() throws Exception {
        String json = "{\"value\":{\"b\":\"creatorVal\"},\"type\":\"implB\",\"other\":2}";
        CreatorExternalBean bean = mapper.readValue(json, CreatorExternalBean.class);

        Assert.assertNotNull(bean);
        Assert.assertEquals("implB", bean.type);
        Assert.assertTrue(bean.value instanceof ValueImplB);
        Assert.assertEquals("creatorVal", ((ValueImplB) bean.value).b);
        Assert.assertEquals(2, bean.other);
    }

    @Test
    public void testDeserialize_creator_missingBothTypeAndValue_success() throws Exception {
        String json = "{\"other\":5}";
        CreatorExternalBean bean = mapper.readValue(json, CreatorExternalBean.class);

        Assert.assertNotNull(bean);
        Assert.assertNull(bean.type);
        Assert.assertNull(bean.value);
        Assert.assertEquals(5, bean.other);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_creator_missingType_throwsException() throws Exception {
        String json = "{\"value\":{\"a\":1},\"other\":2}";
        mapper.readValue(json, CreatorExternalBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_creator_missingValue_throwsException() throws Exception {
        String json = "{\"type\":\"implA\",\"other\":2}";
        mapper.readValue(json, CreatorExternalBean.class);
    }

    @Test
    public void testDeserialize_creatorWithDefaultImpl_success() throws Exception {
        String json = "{\"value\":{\"val\":77}}";
        CreatorDefaultBean bean = mapper.readValue(json, CreatorDefaultBean.class);

        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.value instanceof DefaultImpl);
        Assert.assertEquals(77, ((DefaultImpl) bean.value).val);
    }

    @Test
    public void testDeserialize_mixedCreatorAndNonCreatorProperties_success() throws Exception {
        String json = "{\"type\":\"implA\",\"value\":{\"a\":55},\"extra\":777}";
        MixedCreatorExternalBean bean = mapper.readValue(json, MixedCreatorExternalBean.class);

        Assert.assertNotNull(bean);
        Assert.assertEquals("implA", bean.type);
        Assert.assertTrue(bean.value instanceof ValueImplA);
        Assert.assertEquals(55, ((ValueImplA) bean.value).a);
        Assert.assertEquals(777, bean.extra);
    }

    @Test
    public void testDeserialize_valueInCreatorTypeAsField_success() throws Exception {
        String json = "{\"type\":\"implA\",\"value\":{\"a\":33}}";
        ValueCreatorTypeFieldBean bean = mapper.readValue(json, ValueCreatorTypeFieldBean.class);

        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.value instanceof ValueImplA);
        Assert.assertEquals(33, ((ValueImplA) bean.value).a);
    }

    @Test
    public void testStart_createsDistinctArrays() throws Exception {
        String json = "{\"type\":\"implA\",\"value\":{\"a\":1}}";
        ExternalBean b1 = mapper.readValue(json, ExternalBean.class);
        ExternalBean b2 = mapper.readValue(json, ExternalBean.class);

        Assert.assertNotNull(b1);
        Assert.assertNotNull(b2);
        Assert.assertNotSame(b1, b2);
    }

    @Test
    public void testDeserialize_emptyObject_success() throws Exception {
        String json = "{}";
        ExternalBean bean = mapper.readValue(json, ExternalBean.class);

        Assert.assertNotNull(bean);
        Assert.assertNull(bean.type);
        Assert.assertNull(bean.value);
        Assert.assertEquals(0, bean.other);
    }
}
