package com.fasterxml.jackson.databind.deser.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeBindings;

public class MethodPropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface CustomAnnotation {
        String value() default "test";
    }

    public static class SampleBean {
        private String value;
        private Object polyValue;

        @CustomAnnotation("custom")
        @JsonProperty("value")
        public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public SampleBean setFluent(String value) {
            this.value = value;
            return this;
        }

        public void setThrowing(String value) {
            throw new IllegalArgumentException("Forced error with value: " + value);
        }

        public void setPolyValue(Object polyValue) {
            this.polyValue = polyValue;
        }

        public Object getPolyValue() {
            return polyValue;
        }
    }

    public static class NonPublicBean {
        private String secret;

        void setSecret(String secret) {
            this.secret = secret;
        }

        public String getSecret() {
            return secret;
        }
    }

    private ObjectMapper mapper;
    private DeserializationConfig config;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getDeserializationConfig();
        ctxt = mapper.getDeserializationContext();
    }

    private MethodProperty createMethodProperty(Class<?> targetClass, String methodName, Class<?> paramType, String propNameStr) throws Exception {
        Method method = targetClass.getDeclaredMethod(methodName, paramType);
        JavaType javaType = mapper.constructType(paramType);
        TypeResolutionContext typeContext = new TypeResolutionContext.Basic(mapper.getTypeFactory(), TypeBindings.emptyBindings());
        AnnotationMap annMap = new AnnotationMap();
        for (java.lang.annotation.Annotation ann : method.getDeclaredAnnotations()) {
            annMap.add(ann);
        }
        AnnotatedMethod am = new AnnotatedMethod(typeContext, method, annMap, null);
        PropertyName propName = new PropertyName(propNameStr);
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(config, am, propName);
        return new MethodProperty(propDef, javaType, null, null, am);
    }

    private MethodProperty createMethodPropertyWithTypeDeser(Class<?> targetClass, String methodName, Class<?> paramType, String propNameStr, TypeDeserializer typeDeser) throws Exception {
        Method method = targetClass.getDeclaredMethod(methodName, paramType);
        JavaType javaType = mapper.constructType(paramType);
        TypeResolutionContext typeContext = new TypeResolutionContext.Basic(mapper.getTypeFactory(), TypeBindings.emptyBindings());
        AnnotationMap annMap = new AnnotationMap();
        AnnotatedMethod am = new AnnotatedMethod(typeContext, method, annMap, null);
        PropertyName propName = new PropertyName(propNameStr);
        SimpleBeanPropertyDefinition propDef = SimpleBeanPropertyDefinition.construct(config, am, propName);
        return new MethodProperty(propDef, javaType, typeDeser, null, am);
    }

    @Test
    public void testGetAnnotation_presentAnnotation_returnsAnnotation() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        CustomAnnotation ann = prop.getAnnotation(CustomAnnotation.class);
        Assert.assertNotNull(ann);
        Assert.assertEquals("custom", ann.value());
    }

    @Test
    public void testGetAnnotation_absentAnnotation_returnsNull() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setFluent", String.class, "fluent");
        CustomAnnotation ann = prop.getAnnotation(CustomAnnotation.class);
        Assert.assertNull(ann);
    }

    @Test
    public void testGetMember_returnsAnnotatedMethod() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        Assert.assertNotNull(prop.getMember());
        Assert.assertTrue(prop.getMember() instanceof AnnotatedMethod);
        Assert.assertEquals("setValue", prop.getMember().getName());
    }

    @Test
    public void testWithName_returnsNewInstanceWithNewName() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        PropertyName newName = new PropertyName("renamedValue");
        SettableBeanProperty renamedProp = prop.withName(newName);

        Assert.assertNotSame(prop, renamedProp);
        Assert.assertEquals("renamedValue", renamedProp.getName());
        Assert.assertEquals(prop.getMember(), renamedProp.getMember());
    }

    @Test
    public void testWithValueDeserializer_sameDeserializer_returnsSameInstance() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        JsonDeserializer<?> deser = StringDeserializer.instance;
        MethodProperty withDeser = (MethodProperty) prop.withValueDeserializer(deser);

        SettableBeanProperty same = withDeser.withValueDeserializer(deser);
        Assert.assertSame(withDeser, same);
    }

    @Test
    public void testWithValueDeserializer_differentDeserializer_returnsNewInstance() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        JsonDeserializer<?> deser = StringDeserializer.instance;
        SettableBeanProperty withDeser = prop.withValueDeserializer(deser);

        Assert.assertNotSame(prop, withDeser);
        Assert.assertSame(deser, withDeser.getValueDeserializer());
    }

    @Test
    public void testWithNullProvider_returnsNewInstanceWithProvider() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        NullValueProvider nva = NullsConstantProvider.skipper();
        SettableBeanProperty withNull = prop.withNullProvider(nva);

        Assert.assertNotSame(prop, withNull);
        Assert.assertSame(nva, withNull.getNullValueProvider());
    }

    @Test
    public void testFixAccess_publicAndNonPublic_configFeatureEnabled() throws Exception {
        MethodProperty prop = createMethodProperty(NonPublicBean.class, "setSecret", String.class, "secret");
        DeserializationConfig cfg = config.with(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        prop.fixAccess(cfg);

        NonPublicBean bean = new NonPublicBean();
        prop.set(bean, "mySecret");
        Assert.assertEquals("mySecret", bean.getSecret());
    }

    @Test
    public void testSet_validValue_setsProperty() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        SampleBean bean = new SampleBean();

        prop.set(bean, "hello");
        Assert.assertEquals("hello", bean.getValue());

        prop.set(bean, null);
        Assert.assertNull(bean.getValue());
    }

    @Test(expected = JsonMappingException.class)
    public void testSet_throwingMethod_throwsJsonMappingException() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setThrowing", String.class, "throwing");
        SampleBean bean = new SampleBean();
        prop.set(bean, "error");
    }

    @Test
    public void testSetAndReturn_voidMethod_returnsInstance() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        SampleBean bean = new SampleBean();

        Object result = prop.setAndReturn(bean, "testValue");
        Assert.assertSame(bean, result);
        Assert.assertEquals("testValue", bean.getValue());
    }

    @Test
    public void testSetAndReturn_fluentMethod_returnsReturnedObject() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setFluent", String.class, "fluent");
        SampleBean bean = new SampleBean();

        Object result = prop.setAndReturn(bean, "fluentValue");
        Assert.assertSame(bean, result);
        Assert.assertEquals("fluentValue", bean.getValue());
    }

    @Test(expected = JsonMappingException.class)
    public void testSetAndReturn_throwingMethod_throwsJsonMappingException() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setThrowing", String.class, "throwing");
        SampleBean bean = new SampleBean();
        prop.setAndReturn(bean, "error");
    }

    @Test
    public void testDeserializeAndSet_normalValue_success() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        prop = (MethodProperty) prop.withValueDeserializer(StringDeserializer.instance);

        JsonParser parser = mapper.getFactory().createParser("\"someString\"");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        prop.deserializeAndSet(parser, mapper.getDeserializationContext(), bean);
        Assert.assertEquals("someString", bean.getValue());
        parser.close();
    }

    @Test
    public void testDeserializeAndSet_nullToken_skipNullsFalse_setsNull() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        prop = (MethodProperty) prop.withValueDeserializer(StringDeserializer.instance);
        prop = (MethodProperty) prop.withNullProvider(NullsConstantProvider.nuller());

        JsonParser parser = mapper.getFactory().createParser("null");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        bean.setValue("initial");
        prop.deserializeAndSet(parser, mapper.getDeserializationContext(), bean);
        Assert.assertNull(bean.getValue());
        parser.close();
    }

    @Test
    public void testDeserializeAndSet_nullToken_skipNullsTrue_doesNotSet() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        prop = (MethodProperty) prop.withValueDeserializer(StringDeserializer.instance);
        prop = (MethodProperty) prop.withNullProvider(NullsConstantProvider.skipper());

        JsonParser parser = mapper.getFactory().createParser("null");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        bean.setValue("initial");
        prop.deserializeAndSet(parser, mapper.getDeserializationContext(), bean);
        Assert.assertEquals("initial", bean.getValue());
        parser.close();
    }

    @Test
    public void testDeserializeAndSet_deserializerReturnsNull_skipNullsFalse() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        prop = (MethodProperty) prop.withValueDeserializer(NullifyingDeserializer.instance);
        prop = (MethodProperty) prop.withNullProvider(NullsConstantProvider.nuller());

        JsonParser parser = mapper.getFactory().createParser("\"ignored\"");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        bean.setValue("initial");
        prop.deserializeAndSet(parser, mapper.getDeserializationContext(), bean);
        Assert.assertNull(bean.getValue());
        parser.close();
    }

    @Test
    public void testDeserializeAndSet_deserializerReturnsNull_skipNullsTrue() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        prop = (MethodProperty) prop.withValueDeserializer(NullifyingDeserializer.instance);
        prop = (MethodProperty) prop.withNullProvider(NullsConstantProvider.skipper());

        JsonParser parser = mapper.getFactory().createParser("\"ignored\"");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        bean.setValue("initial");
        prop.deserializeAndSet(parser, mapper.getDeserializationContext(), bean);
        Assert.assertEquals("initial", bean.getValue());
        parser.close();
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeAndSet_throwingMethod_throwsJsonMappingException() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setThrowing", String.class, "throwing");
        prop = (MethodProperty) prop.withValueDeserializer(StringDeserializer.instance);

        JsonParser parser = mapper.getFactory().createParser("\"boom\"");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        prop.deserializeAndSet(parser, mapper.getDeserializationContext(), bean);
        parser.close();
    }

    @Test
    public void testDeserializeAndSet_withTypeDeserializer() throws Exception {
        TypeDeserializer typeDeser = mapper.getDeserializationConfig().findTypeDeserializer(mapper.constructType(Object.class));
        MethodProperty prop = createMethodPropertyWithTypeDeser(SampleBean.class, "setPolyValue", Object.class, "polyValue", typeDeser);
        prop = (MethodProperty) prop.withValueDeserializer(StringDeserializer.instance);

        JsonParser parser = mapper.getFactory().createParser("\"poly\"");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        prop.deserializeAndSet(parser, mapper.getDeserializationContext(), bean);
        Assert.assertEquals("poly", bean.getPolyValue());
        parser.close();
    }

    @Test
    public void testDeserializeSetAndReturn_normalValue_voidMethod_returnsInstance() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        prop = (MethodProperty) prop.withValueDeserializer(StringDeserializer.instance);

        JsonParser parser = mapper.getFactory().createParser("\"testValue\"");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        Object returned = prop.deserializeSetAndReturn(parser, mapper.getDeserializationContext(), bean);
        Assert.assertSame(bean, returned);
        Assert.assertEquals("testValue", bean.getValue());
        parser.close();
    }

    @Test
    public void testDeserializeSetAndReturn_fluentMethod_returnsResult() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setFluent", String.class, "fluent");
        prop = (MethodProperty) prop.withValueDeserializer(StringDeserializer.instance);

        JsonParser parser = mapper.getFactory().createParser("\"fluentVal\"");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        Object returned = prop.deserializeSetAndReturn(parser, mapper.getDeserializationContext(), bean);
        Assert.assertSame(bean, returned);
        Assert.assertEquals("fluentVal", bean.getValue());
        parser.close();
    }

    @Test
    public void testDeserializeSetAndReturn_nullToken_skipNullsTrue_returnsInstance() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        prop = (MethodProperty) prop.withValueDeserializer(StringDeserializer.instance);
        prop = (MethodProperty) prop.withNullProvider(NullsConstantProvider.skipper());

        JsonParser parser = mapper.getFactory().createParser("null");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        bean.setValue("preserved");
        Object returned = prop.deserializeSetAndReturn(parser, mapper.getDeserializationContext(), bean);
        Assert.assertSame(bean, returned);
        Assert.assertEquals("preserved", bean.getValue());
        parser.close();
    }

    @Test
    public void testDeserializeSetAndReturn_nullToken_skipNullsFalse_setsNull() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        prop = (MethodProperty) prop.withValueDeserializer(StringDeserializer.instance);
        prop = (MethodProperty) prop.withNullProvider(NullsConstantProvider.nuller());

        JsonParser parser = mapper.getFactory().createParser("null");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        bean.setValue("initial");
        Object returned = prop.deserializeSetAndReturn(parser, mapper.getDeserializationContext(), bean);
        Assert.assertSame(bean, returned);
        Assert.assertNull(bean.getValue());
        parser.close();
    }

    @Test
    public void testDeserializeSetAndReturn_deserializerReturnsNull_skipNullsTrue() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        prop = (MethodProperty) prop.withValueDeserializer(NullifyingDeserializer.instance);
        prop = (MethodProperty) prop.withNullProvider(NullsConstantProvider.skipper());

        JsonParser parser = mapper.getFactory().createParser("\"ignored\"");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        bean.setValue("initial");
        Object returned = prop.deserializeSetAndReturn(parser, mapper.getDeserializationContext(), bean);
        Assert.assertSame(bean, returned);
        Assert.assertEquals("initial", bean.getValue());
        parser.close();
    }

    @Test
    public void testDeserializeSetAndReturn_deserializerReturnsNull_skipNullsFalse() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        prop = (MethodProperty) prop.withValueDeserializer(NullifyingDeserializer.instance);
        prop = (MethodProperty) prop.withNullProvider(NullsConstantProvider.nuller());

        JsonParser parser = mapper.getFactory().createParser("\"ignored\"");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        bean.setValue("initial");
        Object returned = prop.deserializeSetAndReturn(parser, mapper.getDeserializationContext(), bean);
        Assert.assertSame(bean, returned);
        Assert.assertNull(bean.getValue());
        parser.close();
    }

    @Test
    public void testDeserializeSetAndReturn_withTypeDeserializer() throws Exception {
        TypeDeserializer typeDeser = mapper.getDeserializationConfig().findTypeDeserializer(mapper.constructType(Object.class));
        MethodProperty prop = createMethodPropertyWithTypeDeser(SampleBean.class, "setPolyValue", Object.class, "polyValue", typeDeser);
        prop = (MethodProperty) prop.withValueDeserializer(StringDeserializer.instance);

        JsonParser parser = mapper.getFactory().createParser("\"polyReturn\"");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        Object returned = prop.deserializeSetAndReturn(parser, mapper.getDeserializationContext(), bean);
        Assert.assertSame(bean, returned);
        Assert.assertEquals("polyReturn", bean.getPolyValue());
        parser.close();
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeSetAndReturn_throwingMethod_throwsJsonMappingException() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setThrowing", String.class, "throwing");
        prop = (MethodProperty) prop.withValueDeserializer(StringDeserializer.instance);

        JsonParser parser = mapper.getFactory().createParser("\"errorVal\"");
        parser.nextToken();

        SampleBean bean = new SampleBean();
        prop.deserializeSetAndReturn(parser, mapper.getDeserializationContext(), bean);
        parser.close();
    }

    @Test
    public void testJdkSerialization_readResolve() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(prop);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof MethodProperty);
        MethodProperty deserializedProp = (MethodProperty) deserialized;
        Assert.assertEquals(prop.getName(), deserializedProp.getName());

        SampleBean bean = new SampleBean();
        deserializedProp.set(bean, "afterDeserialization");
        Assert.assertEquals("afterDeserialization", bean.getValue());
    }

    @Test
    public void testReadResolveDirectly() throws Exception {
        MethodProperty prop = createMethodProperty(SampleBean.class, "setValue", String.class, "value");
        Object resolved = prop.readResolve();

        Assert.assertNotNull(resolved);
        Assert.assertTrue(resolved instanceof MethodProperty);
        MethodProperty resolvedProp = (MethodProperty) resolved;
        Assert.assertEquals(prop.getName(), resolvedProp.getName());
    }
}
