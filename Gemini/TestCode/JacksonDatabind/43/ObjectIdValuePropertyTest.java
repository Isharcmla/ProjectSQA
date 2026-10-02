package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ObjectIdValuePropertyTest {

    private ObjectMapper mapper;
    private JavaType stringType;
    private ObjectIdGenerator<?> generator;
    private SimpleObjectIdResolver resolver;
    private JsonDeserializer<Object> stringDeser;

    static class DummyTarget {
        public String id;
        public String name;
    }

    static class DummySettableProperty extends SettableBeanProperty {
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
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) {
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) {
            return instance;
        }

        @Override
        public void set(Object instance, Object value) {
            setAndReturn(instance, value);
        }

        @Override
        public Object setAndReturn(Object instance, Object value) {
            this.lastSetValue = value;
            if (instance instanceof DummyTarget) {
                ((DummyTarget) instance).id = (value == null ? null : value.toString());
            }
            return instance;
        }

        public Object getLastSetValue() {
            return lastSetValue;
        }
    }

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        stringType = TypeFactory.defaultInstance().constructType(String.class);
        generator = new ObjectIdGenerators.StringIdGenerator();
        resolver = new SimpleObjectIdResolver();
        stringDeser = mapper.getDeserializationContext().findRootValueDeserializer(stringType);
    }

    private DeserializationContext createDeserializationContext(JsonParser p) {
        DefaultDeserializationContext dsc = (DefaultDeserializationContext) mapper.getDeserializationContext();
        return dsc.createInstance(mapper.getDeserializationConfig(), p, mapper.getInjectableValues());
    }

    @Test
    public void testConstructorAndGetters_normalInput_propertiesSetCorrectly() {
        PropertyName propName = new PropertyName("idProp");
        ObjectIdReader reader = ObjectIdReader.construct(stringType, propName, generator, stringDeser, null, resolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Assert.assertEquals("idProp", prop.getName());
        Assert.assertEquals(stringType, prop.getType());
        Assert.assertEquals(PropertyMetadata.STD_REQUIRED, prop.getMetadata());
        Assert.assertNull(prop.getAnnotation(Deprecated.class));
        Assert.assertNull(prop.getMember());
    }

    @Test
    public void testWithName_validNewName_returnsNewInstanceWithUpdatedName() {
        PropertyName propName = new PropertyName("idProp");
        ObjectIdReader reader = ObjectIdReader.construct(stringType, propName, generator, stringDeser, null, resolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        PropertyName newName = new PropertyName("renamedId");
        ObjectIdValueProperty updated = prop.withName(newName);

        Assert.assertNotNull(updated);
        Assert.assertNotSame(prop, updated);
        Assert.assertEquals("renamedId", updated.getName());
        Assert.assertSame(prop.getValueDeserializer(), updated.getValueDeserializer());
    }

    @Test
    public void testWithValueDeserializer_validDeserializer_returnsNewInstanceWithUpdatedDeserializer() {
        PropertyName propName = new PropertyName("idProp");
        ObjectIdReader reader = ObjectIdReader.construct(stringType, propName, generator, stringDeser, null, resolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        JsonDeserializer<?> customDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "custom";
            }
        };

        ObjectIdValueProperty updated = prop.withValueDeserializer(customDeser);

        Assert.assertNotNull(updated);
        Assert.assertNotSame(prop, updated);
        Assert.assertSame(customDeser, updated.getValueDeserializer());
        Assert.assertEquals(prop.getName(), updated.getName());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSet_noIdProperty_throwsUnsupportedOperationException() throws IOException {
        PropertyName propName = new PropertyName("idProp");
        ObjectIdReader reader = ObjectIdReader.construct(stringType, propName, generator, stringDeser, null, resolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        prop.set(new DummyTarget(), "123");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_noIdProperty_throwsUnsupportedOperationException() throws IOException {
        PropertyName propName = new PropertyName("idProp");
        ObjectIdReader reader = ObjectIdReader.construct(stringType, propName, generator, stringDeser, null, resolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        prop.setAndReturn(new DummyTarget(), "123");
    }

    @Test
    public void testSetAndReturn_withIdProperty_delegatesToIdProperty() throws IOException {
        DummySettableProperty dummySettable = new DummySettableProperty(new PropertyName("id"), stringType);
        ObjectIdReader reader = ObjectIdReader.construct(stringType, new PropertyName("idProp"), generator, stringDeser, dummySettable, resolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        DummyTarget target = new DummyTarget();
        Object result = prop.setAndReturn(target, "my-id-val");

        Assert.assertSame(target, result);
        Assert.assertEquals("my-id-val", target.id);
        Assert.assertEquals("my-id-val", dummySettable.getLastSetValue());
    }

    @Test
    public void testSet_withIdProperty_delegatesToIdProperty() throws IOException {
        DummySettableProperty dummySettable = new DummySettableProperty(new PropertyName("id"), stringType);
        ObjectIdReader reader = ObjectIdReader.construct(stringType, new PropertyName("idProp"), generator, stringDeser, dummySettable, resolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        DummyTarget target = new DummyTarget();
        prop.set(target, "direct-set-id");

        Assert.assertEquals("direct-set-id", target.id);
        Assert.assertEquals("direct-set-id", dummySettable.getLastSetValue());
    }

    @Test
    public void testDeserializeSetAndReturn_idIsNull_returnsNull() throws IOException {
        JsonDeserializer<Object> nullDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };

        ObjectIdReader reader = ObjectIdReader.construct(stringType, new PropertyName("idProp"), generator, nullDeser, null, resolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        JsonParser parser = mapper.createParser("null");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(parser);

        DummyTarget target = new DummyTarget();
        Object result = prop.deserializeSetAndReturn(parser, ctxt, target);

        Assert.assertNull(result);
    }

    @Test
    public void testDeserializeSetAndReturn_validIdWithoutIdProperty_bindsIdAndReturnsInstance() throws IOException {
        ObjectIdReader reader = ObjectIdReader.construct(stringType, new PropertyName("idProp"), generator, stringDeser, null, resolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        JsonParser parser = mapper.createParser("\"gen-id-123\"");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(parser);

        DummyTarget target = new DummyTarget();
        Object result = prop.deserializeSetAndReturn(parser, ctxt, target);

        Assert.assertSame(target, result);
        ReadableObjectId roid = ctxt.findObjectId("gen-id-123", generator, resolver);
        Assert.assertNotNull(roid);
        Assert.assertSame(target, roid.resolve());
    }

    @Test
    public void testDeserializeSetAndReturn_validIdWithIdProperty_bindsIdAndSetsProperty() throws IOException {
        DummySettableProperty dummySettable = new DummySettableProperty(new PropertyName("id"), stringType);
        ObjectIdReader reader = ObjectIdReader.construct(stringType, new PropertyName("idProp"), generator, stringDeser, dummySettable, resolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        JsonParser parser = mapper.createParser("\"gen-id-456\"");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(parser);

        DummyTarget target = new DummyTarget();
        Object result = prop.deserializeSetAndReturn(parser, ctxt, target);

        Assert.assertSame(target, result);
        Assert.assertEquals("gen-id-456", target.id);
        Assert.assertEquals("gen-id-456", dummySettable.getLastSetValue());
    }

    @Test
    public void testDeserializeAndSet_validId_delegatesToDeserializeSetAndReturn() throws IOException {
        DummySettableProperty dummySettable = new DummySettableProperty(new PropertyName("id"), stringType);
        ObjectIdReader reader = ObjectIdReader.construct(stringType, new PropertyName("idProp"), generator, stringDeser, dummySettable, resolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        JsonParser parser = mapper.createParser("\"gen-id-789\"");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(parser);

        DummyTarget target = new DummyTarget();
        prop.deserializeAndSet(parser, ctxt, target);

        Assert.assertEquals("gen-id-789", target.id);
        Assert.assertEquals("gen-id-789", dummySettable.getLastSetValue());
    }
}
