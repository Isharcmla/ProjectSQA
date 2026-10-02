package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;

public class CreatorPropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnnotation {
        String value() default "test";
    }

    private static class DummyFallbackSetter extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        Object lastSetInstance;
        Object lastSetValue;
        boolean fixAccessCalled = false;

        public DummyFallbackSetter(PropertyName name, JavaType type) {
            super(name, type, PropertyMetadata.STD_OPTIONAL, StringDeserializer.instance);
        }

        protected DummyFallbackSetter(DummyFallbackSetter src, PropertyName newName) {
            super(src, newName);
        }

        protected DummyFallbackSetter(DummyFallbackSetter src, JsonDeserializer<?> deser, NullValueProvider nva) {
            super(src, deser, nva);
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new DummyFallbackSetter(this, newName);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return new DummyFallbackSetter(this, deser, _nullProvider);
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return new DummyFallbackSetter(this, _valueDeserializer, nva);
        }

        @Override
        public void fixAccess(DeserializationConfig config) {
            this.fixAccessCalled = true;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            this.lastSetInstance = instance;
            this.lastSetValue = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            this.lastSetInstance = instance;
            this.lastSetValue = value;
            return "returned:" + value;
        }
    }

    private static class DummyAnnotations implements Annotations {
        @Override
        public <A extends Annotation> A get(Class<A> cls) {
            return null;
        }

        @Override
        public boolean has(Class<?> cls) {
            return false;
        }

        @Override
        public boolean hasOneOf(Class<? extends Annotation>[] classes) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }
    }

    private static class DummyBean {
        public String field;
    }

    @TestAnnotation("paramAnnotation")
    private static void dummyMethod(String param) {}

    private AnnotatedParameter createAnnotatedParameter() throws Exception {
        java.lang.reflect.Method method = getClass().getDeclaredMethod("dummyMethod", String.class);
        AnnotationMap paramAnnMap = new AnnotationMap();
        paramAnnMap.add(method.getParameterAnnotations()[0][0]);
        return new AnnotatedParameter(null, TypeFactory.defaultInstance().constructType(String.class), null, paramAnnMap, 0);
    }

    @Test
    public void testConstructorAndGetters_normalInput_returnsExpectedValues() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName name = PropertyName.construct("propName");
        PropertyName wrapperName = PropertyName.construct("wrapper");
        AnnotatedParameter param = createAnnotatedParameter();
        DummyAnnotations contextAnnotations = new DummyAnnotations();
        PropertyMetadata metadata = PropertyMetadata.STD_REQUIRED;

        CreatorProperty prop = new CreatorProperty(name, type, wrapperName, null, contextAnnotations, param, 2, "injectKey", metadata);

        Assert.assertEquals("propName", prop.getName());
        Assert.assertEquals(type, prop.getType());
        Assert.assertEquals(wrapperName, prop.getWrapperName());
        Assert.assertEquals(param, prop.getMember());
        Assert.assertEquals(2, prop.getCreatorIndex());
        Assert.assertEquals("injectKey", prop.getInjectableValueId());
        Assert.assertFalse(prop.isIgnorable());
        Assert.assertEquals(metadata, prop.getMetadata());
        Assert.assertEquals("[creator property, name 'propName'; inject id 'injectKey']", prop.toString());
    }

    @Test
    public void testConstructorAndGetters_nullAndEdgeValues_handlesSafely() {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        PropertyName name = PropertyName.construct("");

        CreatorProperty prop = new CreatorProperty(name, type, null, null, null, null, -1, null, PropertyMetadata.STD_OPTIONAL);

        Assert.assertEquals("", prop.getName());
        Assert.assertEquals(type, prop.getType());
        Assert.assertNull(prop.getWrapperName());
        Assert.assertNull(prop.getMember());
        Assert.assertEquals(-1, prop.getCreatorIndex());
        Assert.assertNull(prop.getInjectableValueId());
        Assert.assertFalse(prop.isIgnorable());
        Assert.assertEquals("[creator property, name ''; inject id 'null']", prop.toString());
    }

    @Test
    public void testWithName_copiesStateCorrectly() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName name = PropertyName.construct("oldName");
        CreatorProperty prop = new CreatorProperty(name, type, null, null, null, null, 1, "id1", PropertyMetadata.STD_OPTIONAL);
        prop.markAsIgnorable();
        DummyFallbackSetter fallback = new DummyFallbackSetter(name, type);
        prop.setFallbackSetter(fallback);

        SettableBeanProperty renamed = prop.withName(PropertyName.construct("newName"));

        Assert.assertNotSame(prop, renamed);
        Assert.assertEquals("newName", renamed.getName());
        Assert.assertEquals(1, renamed.getCreatorIndex());
        Assert.assertEquals("id1", renamed.getInjectableValueId());
        Assert.assertTrue(renamed.isIgnorable());
    }

    @Test
    public void testWithValueDeserializer_sameDeserializer_returnsSelf() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);

        SettableBeanProperty same = prop.withValueDeserializer(prop.getValueDeserializer());
        Assert.assertSame(prop, same);
    }

    @Test
    public void testWithValueDeserializer_differentDeserializer_returnsNewInstance() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);

        JsonDeserializer<?> deser = StringDeserializer.instance;
        SettableBeanProperty modified = prop.withValueDeserializer(deser);

        Assert.assertNotSame(prop, modified);
        Assert.assertSame(deser, modified.getValueDeserializer());
    }

    @Test
    public void testWithNullProvider_returnsNewInstanceWithNullProvider() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        NullValueProvider nva = NullsConstantProvider.nuller();

        SettableBeanProperty modified = prop.withNullProvider(nva);

        Assert.assertNotSame(prop, modified);
        Assert.assertSame(nva, modified.getNullValueProvider());
    }

    @Test
    public void testMarkAsIgnorable_modifiesFlag() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);

        Assert.assertFalse(prop.isIgnorable());
        prop.markAsIgnorable();
        Assert.assertTrue(prop.isIgnorable());
    }

    @Test
    public void testGetAnnotation_withAndWithoutAnnotatedMember() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty propWithoutMember = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        Assert.assertNull(propWithoutMember.getAnnotation(TestAnnotation.class));

        AnnotatedParameter param = createAnnotatedParameter();
        CreatorProperty propWithMember = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, param, 0, null, PropertyMetadata.STD_OPTIONAL);
        TestAnnotation ann = propWithMember.getAnnotation(TestAnnotation.class);
        Assert.assertNotNull(ann);
        Assert.assertEquals("paramAnnotation", ann.value());
        Assert.assertNull(propWithMember.getAnnotation(Override.class));
    }

    @Test
    public void testFixAccess_withAndWithoutFallbackSetter() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);

        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();

        prop.fixAccess(config);

        DummyFallbackSetter fallback = new DummyFallbackSetter(PropertyName.construct("prop"), type);
        prop.setFallbackSetter(fallback);
        Assert.assertFalse(fallback.fixAccessCalled);

        prop.fixAccess(config);
        Assert.assertTrue(fallback.fixAccessCalled);
    }

    @Test
    public void testSetAndReturnMethods_withFallbackSetter_delegatesProperly() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName name = PropertyName.construct("prop");
        CreatorProperty prop = new CreatorProperty(name, type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        DummyFallbackSetter fallback = new DummyFallbackSetter(name, type);
        prop.setFallbackSetter(fallback);

        DummyBean bean = new DummyBean();
        prop.set(bean, "value1");
        Assert.assertSame(bean, fallback.lastSetInstance);
        Assert.assertEquals("value1", fallback.lastSetValue);

        Object returned = prop.setAndReturn(bean, "value2");
        Assert.assertSame(bean, fallback.lastSetInstance);
        Assert.assertEquals("value2", fallback.lastSetValue);
        Assert.assertEquals("returned:value2", returned);
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testSet_withoutFallbackSetter_throwsException() throws IOException {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        prop.set(new DummyBean(), "value");
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testSetAndReturn_withoutFallbackSetter_throwsException() throws IOException {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        prop.setAndReturn(new DummyBean(), "value");
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testDeserializeAndSet_withoutFallbackSetter_throwsException() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.createParser("\"testValue\"");
        DeserializationContext ctxt = mapper.getDeserializationContext();

        prop.deserializeAndSet(parser, ctxt, new DummyBean());
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testDeserializeSetAndReturn_withoutFallbackSetter_throwsException() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.createParser("\"testValue\"");
        DeserializationContext ctxt = mapper.getDeserializationContext();

        prop.deserializeSetAndReturn(parser, ctxt, new DummyBean());
    }

    @Test
    public void testDeserializeAndSet_withFallbackSetter_succeeds() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName name = PropertyName.construct("prop");
        CreatorProperty prop = new CreatorProperty(name, type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        prop = (CreatorProperty) prop.withValueDeserializer(StringDeserializer.instance);

        DummyFallbackSetter fallback = new DummyFallbackSetter(name, type);
        prop.setFallbackSetter(fallback);

        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.createParser("\"sampleJsonString\"");
        parser.nextToken();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        DummyBean bean = new DummyBean();
        prop.deserializeAndSet(parser, ctxt, bean);

        Assert.assertSame(bean, fallback.lastSetInstance);
        Assert.assertEquals("sampleJsonString", fallback.lastSetValue);
        parser.close();
    }

    @Test
    public void testDeserializeSetAndReturn_withFallbackSetter_succeeds() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName name = PropertyName.construct("prop");
        CreatorProperty prop = new CreatorProperty(name, type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        prop = (CreatorProperty) prop.withValueDeserializer(StringDeserializer.instance);

        DummyFallbackSetter fallback = new DummyFallbackSetter(name, type);
        prop.setFallbackSetter(fallback);

        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.createParser("\"sampleJsonString\"");
        parser.nextToken();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        DummyBean bean = new DummyBean();
        Object result = prop.deserializeSetAndReturn(parser, ctxt, bean);

        Assert.assertSame(bean, fallback.lastSetInstance);
        Assert.assertEquals("sampleJsonString", fallback.lastSetValue);
        Assert.assertEquals("returned:sampleJsonString", result);
        parser.close();
    }

    @Test
    public void testFindInjectableValue_whenIdConfigured_returnsValue() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, "injectKey", PropertyMetadata.STD_OPTIONAL);

        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std injectables = new InjectableValues.Std();
        injectables.addValue("injectKey", "injectedString");
        mapper.setInjectableValues(injectables);

        JsonParser parser = mapper.createParser("{}");
        DeserializationContext ctxt = mapper.getDeserializationContext();
        ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) ctxt).createInstance(mapper.getDeserializationConfig(), parser, injectables);

        DummyBean bean = new DummyBean();
        Object val = prop.findInjectableValue(ctxt, bean);
        Assert.assertEquals("injectedString", val);
        parser.close();
    }

    @Test(expected = JsonMappingException.class)
    public void testFindInjectableValue_whenIdNull_throwsException() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("prop"), type, null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);

        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.createParser("{}");
        DeserializationContext ctxt = mapper.getDeserializationContext();
        ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) ctxt).createInstance(mapper.getDeserializationConfig(), parser, new InjectableValues.Std());

        DummyBean bean = new DummyBean();
        try {
            prop.findInjectableValue(ctxt, bean);
        } finally {
            parser.close();
        }
    }

    @Test
    public void testInject_withFallbackSetter_injectsValue() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName name = PropertyName.construct("prop");
        CreatorProperty prop = new CreatorProperty(name, type, null, null, null, null, 0, "injectKey", PropertyMetadata.STD_OPTIONAL);

        DummyFallbackSetter fallback = new DummyFallbackSetter(name, type);
        prop.setFallbackSetter(fallback);

        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std injectables = new InjectableValues.Std();
        injectables.addValue("injectKey", "injectedData");

        JsonParser parser = mapper.createParser("{}");
        DeserializationContext ctxt = mapper.getDeserializationContext();
        ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) ctxt).createInstance(mapper.getDeserializationConfig(), parser, injectables);

        DummyBean bean = new DummyBean();
        prop.inject(ctxt, bean);

        Assert.assertSame(bean, fallback.lastSetInstance);
        Assert.assertEquals("injectedData", fallback.lastSetValue);
        parser.close();
    }
}
