package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ObjectIdValuePropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnnotation {
    }

    private static class DummyBean {
        public Object id;
        public String name;
    }

    private static class DummySettableProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private Object lastSetValue;

        public DummySettableProperty(PropertyName name, JavaType type) {
            super(name, type, PropertyMetadata.STD_REQUIRED, null);
        }

        protected DummySettableProperty(DummySettableProperty src, JsonDeserializer<?> deser) {
            super(src, deser);
        }

        protected DummySettableProperty(DummySettableProperty src, PropertyName newName) {
            super(src, newName);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return new DummySettableProperty(this, deser);
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new DummySettableProperty(this, newName);
        }

        @Override
        public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            deserializeSetAndReturn(p, ctxt, instance);
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            Object val = _valueDeserializer == null ? p.getText() : _valueDeserializer.deserialize(p, ctxt);
            return setAndReturn(instance, val);
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            setAndReturn(instance, value);
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            this.lastSetValue = value;
            if (instance instanceof DummyBean) {
                ((DummyBean) instance).id = value;
            }
            return instance;
        }
    }

    private ObjectMapper objectMapper;
    private JavaType idType;
    private ObjectIdGenerator<?> generator;
    private ObjectIdResolver resolver;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        idType = TypeFactory.defaultInstance().constructType(String.class);
        generator = new ObjectIdGenerators.StringIdGenerator();
        resolver = new SimpleObjectIdResolver();
    }

    @Test
    public void testConstructorAndGetters_validInput_success() {
        JsonDeserializer<Object> deser = objectMapper.getDeserializationConfig().findRootValueDeserializer(idType);
        ObjectIdReader reader = ObjectIdReader.construct(
                idType,
                new PropertyName("id"),
                generator,
                deser,
                null,
                resolver
        );

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        Assert.assertEquals("id", prop.getName());
        Assert.assertEquals(idType, prop.getType());
        Assert.assertNull(prop.getAnnotation(TestAnnotation.class));
        Assert.assertNull(prop.getMember());
        Assert.assertSame(deser, prop.getValueDeserializer());
    }

    @Test
    public void testWithName_propertyNameProvided_returnsNewInstanceWithNewName() {
        JsonDeserializer<Object> deser = objectMapper.getDeserializationConfig().findRootValueDeserializer(idType);
        ObjectIdReader reader = ObjectIdReader.construct(
                idType,
                new PropertyName("originalId"),
                generator,
                deser,
                null,
                resolver
        );

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        ObjectIdValueProperty propWithNewName = prop.withName(new PropertyName("newId"));

        Assert.assertEquals("newId", propWithNewName.getName());
        Assert.assertEquals("originalId", prop.getName());
        Assert.assertSame(prop.getValueDeserializer(), propWithNewName.getValueDeserializer());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructors_validInputs_constructsSuccessfully() {
        JsonDeserializer<Object> deser = objectMapper.getDeserializationConfig().findRootValueDeserializer(idType);
        ObjectIdReader reader = ObjectIdReader.construct(
                idType,
                new PropertyName("oldName"),
                generator,
                deser,
                null,
                resolver
        );

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        ObjectIdValueProperty propFromString = new ObjectIdValueProperty(prop, "stringName");
        ObjectIdValueProperty propFromPropertyName = new ObjectIdValueProperty(prop, new PropertyName("propName"));

        Assert.assertEquals("stringName", propFromString.getName());
        Assert.assertEquals("propName", propFromPropertyName.getName());
    }

    @Test
    public void testWithValueDeserializer_differentDeserializer_returnsNewInstanceWithNewDeserializer() {
        JsonDeserializer<Object> deser1 = objectMapper.getDeserializationConfig().findRootValueDeserializer(idType);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        JsonDeserializer<Object> deser2 = objectMapper.getDeserializationConfig().findRootValueDeserializer(intType);

        ObjectIdReader reader = ObjectIdReader.construct(
                idType,
                new PropertyName("id"),
                generator,
                deser1,
                null,
                resolver
        );

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        ObjectIdValueProperty propWithNewDeser = prop.withValueDeserializer(deser2);

        Assert.assertSame(deser2, propWithNewDeser.getValueDeserializer());
        Assert.assertSame(deser1, prop.getValueDeserializer());
    }

    @Test
    public void testDeserializeSetAndReturn_withoutIdProperty_bindsIdAndReturnsInstance() throws Exception {
        JsonDeserializer<Object> deser = objectMapper.getDeserializationConfig().findRootValueDeserializer(idType);
        ObjectIdReader reader = ObjectIdReader.construct(
                idType,
                new PropertyName("id"),
                generator,
                deser,
                null,
                resolver
        );

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        JsonParser parser = new JsonFactory().createParser("\"custom-id-123\"");
        parser.nextToken();

        DeserializationContext ctxt = objectMapper.getDeserializationContext();
        if (ctxt instanceof DefaultDeserializationContext) {
            ctxt = ((DefaultDeserializationContext) ctxt).createInstance(
                    objectMapper.getDeserializationConfig(),
                    parser,
                    objectMapper.getInjectableValues()
            );
        }

        DummyBean instance = new DummyBean();
        Object result = prop.deserializeSetAndReturn(parser, ctxt, instance);

        Assert.assertSame(instance, result);
        Assert.assertNull(instance.id);
        ReadableObjectId roid = ctxt.findObjectId("custom-id-123", generator, resolver);
        Assert.assertSame(instance, roid.resolve());
    }

    @Test
    public void testDeserializeAndSet_withUnderlyingIdProperty_bindsAndSetsProperty() throws Exception {
        JsonDeserializer<Object> deser = objectMapper.getDeserializationConfig().findRootValueDeserializer(idType);
        DummySettableProperty settableProp = new DummySettableProperty(new PropertyName("id"), idType);
        ObjectIdReader reader = ObjectIdReader.construct(
                idType,
                new PropertyName("id"),
                generator,
                deser,
                settableProp,
                resolver
        );

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        JsonParser parser = new JsonFactory().createParser("\"id-abc-456\"");
        parser.nextToken();

        DeserializationContext ctxt = objectMapper.getDeserializationContext();
        if (ctxt instanceof DefaultDeserializationContext) {
            ctxt = ((DefaultDeserializationContext) ctxt).createInstance(
                    objectMapper.getDeserializationConfig(),
                    parser,
                    objectMapper.getInjectableValues()
            );
        }

        DummyBean instance = new DummyBean();
        prop.deserializeAndSet(parser, ctxt, instance);

        Assert.assertEquals("id-abc-456", instance.id);
        Assert.assertEquals("id-abc-456", settableProp.lastSetValue);
        ReadableObjectId roid = ctxt.findObjectId("id-abc-456", generator, resolver);
        Assert.assertSame(instance, roid.resolve());
    }

    @Test
    public void testSetAndReturn_withIdProperty_setsValueSuccessfully() throws IOException {
        JsonDeserializer<Object> deser = objectMapper.getDeserializationConfig().findRootValueDeserializer(idType);
        DummySettableProperty settableProp = new DummySettableProperty(new PropertyName("id"), idType);
        ObjectIdReader reader = ObjectIdReader.construct(
                idType,
                new PropertyName("id"),
                generator,
                deser,
                settableProp,
                resolver
        );

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        DummyBean instance = new DummyBean();
        Object result = prop.setAndReturn(instance, "direct-set-value");

        Assert.assertSame(instance, result);
        Assert.assertEquals("direct-set-value", instance.id);
        Assert.assertEquals("direct-set-value", settableProp.lastSetValue);
    }

    @Test
    public void testSet_withIdProperty_setsValueSuccessfully() throws IOException {
        JsonDeserializer<Object> deser = objectMapper.getDeserializationConfig().findRootValueDeserializer(idType);
        DummySettableProperty settableProp = new DummySettableProperty(new PropertyName("id"), idType);
        ObjectIdReader reader = ObjectIdReader.construct(
                idType,
                new PropertyName("id"),
                generator,
                deser,
                settableProp,
                resolver
        );

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        DummyBean instance = new DummyBean();
        prop.set(instance, "set-method-value");

        Assert.assertEquals("set-method-value", instance.id);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_withoutIdProperty_throwsUnsupportedOperationException() throws IOException {
        JsonDeserializer<Object> deser = objectMapper.getDeserializationConfig().findRootValueDeserializer(idType);
        ObjectIdReader reader = ObjectIdReader.construct(
                idType,
                new PropertyName("id"),
                generator,
                deser,
                null,
                resolver
        );

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        prop.setAndReturn(new DummyBean(), "any-value");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSet_withoutIdProperty_throwsUnsupportedOperationException() throws IOException {
        JsonDeserializer<Object> deser = objectMapper.getDeserializationConfig().findRootValueDeserializer(idType);
        ObjectIdReader reader = ObjectIdReader.construct(
                idType,
                new PropertyName("id"),
                generator,
                deser,
                null,
                resolver
        );

        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        prop.set(new DummyBean(), "any-value");
    }
}
