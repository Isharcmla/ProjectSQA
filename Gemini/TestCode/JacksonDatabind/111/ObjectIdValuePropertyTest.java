package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.std.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

public class ObjectIdValuePropertyTest {

    private ObjectMapper mapper;
    private JavaType stringType;
    private JsonDeserializer<Object> stringDeser;
    private ObjectIdGenerator<?> generator;
    private ObjectIdResolver resolver;

    private static class DummySettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private Object lastSetValue;

        public DummySettableBeanProperty(PropertyName name, JavaType type) {
            super(name, type, PropertyMetadata.STD_OPTIONAL, null);
        }

        protected DummySettableBeanProperty(DummySettableBeanProperty src) {
            super(src);
            this.lastSetValue = src.lastSetValue;
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new DummySettableBeanProperty(this);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return this;
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return this;
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
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) {}

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) {
            return null;
        }

        @Override
        public void set(Object instance, Object value) {
            this.lastSetValue = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) {
            this.lastSetValue = value;
            return "setAndReturnResult:" + instance + ":" + value;
        }

        public Object getLastSetValue() {
            return lastSetValue;
        }
    }

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() {
        mapper = new ObjectMapper();
        stringType = mapper.constructType(String.class);
        stringDeser = (JsonDeserializer<Object>) (JsonDeserializer<?>) StringDeserializer.instance;
        generator = new ObjectIdGenerators.StringIdGenerator();
        resolver = new SimpleObjectIdResolver();
    }

    @Test
    public void testConstructorAndBasicProperties_normalInput_expectedValuesRetrieved() {
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                null,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Assert.assertEquals("oid", prop.getName());
        Assert.assertEquals(stringType, prop.getType());
        Assert.assertEquals(PropertyMetadata.STD_REQUIRED, prop.getMetadata());
        Assert.assertSame(stringDeser, prop.getValueDeserializer());
        Assert.assertNull(prop.getAnnotation(Deprecated.class));
        Assert.assertNull(prop.getMember());
    }

    @Test
    public void testWithName_validPropertyName_returnsNewInstanceWithUpdatedName() {
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                null,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        PropertyName newName = PropertyName.construct("newOid");
        SettableBeanProperty renamedProp = prop.withName(newName);

        Assert.assertNotSame(prop, renamedProp);
        Assert.assertTrue(renamedProp instanceof ObjectIdValueProperty);
        Assert.assertEquals("newOid", renamedProp.getName());
    }

    @Test
    public void testWithValueDeserializer_sameDeserializer_returnsSameInstance() {
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                null,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        SettableBeanProperty result = prop.withValueDeserializer(stringDeser);
        Assert.assertSame(prop, result);
    }

    @Test
    public void testWithValueDeserializer_differentDeserializer_returnsNewInstance() {
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                null,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        JsonDeserializer<?> differentDeser = new UntypedObjectDeserializer(null, null);
        SettableBeanProperty result = prop.withValueDeserializer(differentDeser);

        Assert.assertNotSame(prop, result);
        Assert.assertSame(differentDeser, result.getValueDeserializer());
    }

    @Test
    public void testWithNullProvider_customProvider_returnsNewInstanceWithProvider() {
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                null,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        NullValueProvider nullProvider = NullsConstantProvider.nuller();
        SettableBeanProperty result = prop.withNullProvider(nullProvider);

        Assert.assertNotSame(prop, result);
        Assert.assertSame(nullProvider, result.getNullValueProvider());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSet_whenNoIdProperty_throwsUnsupportedOperationException() throws IOException {
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                null,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        prop.set(new Object(), "test-id");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_whenNoIdProperty_throwsUnsupportedOperationException() throws IOException {
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                null,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        prop.setAndReturn(new Object(), "test-id");
    }

    @Test
    public void testSet_withIdProperty_delegatesToIdProperty() throws IOException {
        DummySettableBeanProperty idProp = new DummySettableBeanProperty(PropertyName.construct("id"), stringType);
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                idProp,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Object targetInstance = new Object();
        prop.set(targetInstance, "id-val-123");

        Assert.assertEquals("id-val-123", idProp.getLastSetValue());
    }

    @Test
    public void testSetAndReturn_withIdProperty_returnsResultFromIdProperty() throws IOException {
        DummySettableBeanProperty idProp = new DummySettableBeanProperty(PropertyName.construct("id"), stringType);
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                idProp,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Object result = prop.setAndReturn("testInstance", "id-val-456");

        Assert.assertEquals("setAndReturnResult:testInstance:id-val-456", result);
        Assert.assertEquals("id-val-456", idProp.getLastSetValue());
    }

    @Test
    public void testDeserializeSetAndReturn_whenJsonTokenIsNull_returnsNull() throws IOException {
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                null,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        JsonParser parser = mapper.getFactory().createParser("null");
        parser.nextToken(); // Move to JsonToken.VALUE_NULL
        DeserializationContext ctxt = mapper.getDeserializationContext();

        Object result = prop.deserializeSetAndReturn(parser, ctxt, new Object());
        Assert.assertNull(result);
    }

    @Test
    public void testDeserializeAndSet_withoutIdProperty_bindsIdAndReturnsInstance() throws IOException {
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                null,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        JsonParser parser = mapper.getFactory().createParser("\"my-id-val\"");
        parser.nextToken(); // Move to JsonToken.VALUE_STRING

        DeserializationContext ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)
                mapper.getDeserializationContext()).createInstance(
                mapper.getDeserializationConfig(), parser, null);

        Object instance = new Object();
        prop.deserializeAndSet(parser, ctxt, instance);

        // Verify that the object was bound to ReadableObjectId
        ReadableObjectId roid = ctxt.findObjectId("my-id-val", generator, resolver);
        Assert.assertSame(instance, roid.resolve());
    }

    @Test
    public void testDeserializeSetAndReturn_withoutIdProperty_returnsInstance() throws IOException {
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                null,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        JsonParser parser = mapper.getFactory().createParser("\"id-789\"");
        parser.nextToken();

        DeserializationContext ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)
                mapper.getDeserializationContext()).createInstance(
                mapper.getDeserializationConfig(), parser, null);

        Object instance = new Object();
        Object result = prop.deserializeSetAndReturn(parser, ctxt, instance);

        Assert.assertSame(instance, result);
        ReadableObjectId roid = ctxt.findObjectId("id-789", generator, resolver);
        Assert.assertSame(instance, roid.resolve());
    }

    @Test
    public void testDeserializeSetAndReturn_withIdProperty_returnsResultFromIdProperty() throws IOException {
        DummySettableBeanProperty idProp = new DummySettableBeanProperty(PropertyName.construct("id"), stringType);
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                PropertyName.construct("oid"),
                generator,
                stringDeser,
                idProp,
                resolver
        );
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        JsonParser parser = mapper.getFactory().createParser("\"bound-id-100\"");
        parser.nextToken();

        DeserializationContext ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)
                mapper.getDeserializationContext()).createInstance(
                mapper.getDeserializationConfig(), parser, null);

        Object instance = "myTargetObject";
        Object result = prop.deserializeSetAndReturn(parser, ctxt, instance);

        Assert.assertEquals("setAndReturnResult:myTargetObject:bound-id-100", result);
        Assert.assertEquals("bound-id-100", idProp.getLastSetValue());

        ReadableObjectId roid = ctxt.findObjectId("bound-id-100", generator, resolver);
        Assert.assertSame(instance, roid.resolve());
    }
}
