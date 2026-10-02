package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.UnresolvedId;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.PropertyReferring;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ObjectIdReferencePropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnnotation {
        String value() default "";
    }

    private static class DummySettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private Object _lastSetInstance;
        private Object _lastSetValue;
        private boolean _fixAccessCalled = false;

        public DummySettableBeanProperty(PropertyName name, JavaType type) {
            super(name, type, null, null);
        }

        protected DummySettableBeanProperty(DummySettableBeanProperty src) {
            super(src);
        }

        protected DummySettableBeanProperty(DummySettableBeanProperty src, JsonDeserializer<?> deser, NullValueProvider nva) {
            super(src, deser, nva);
        }

        protected DummySettableBeanProperty(DummySettableBeanProperty src, PropertyName newName) {
            super(src, newName);
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new DummySettableBeanProperty(this, newName);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return new DummySettableBeanProperty(this, deser, _nullProvider);
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return new DummySettableBeanProperty(this, _valueDeserializer, nva);
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            if (acls == TestAnnotation.class) {
                return acls.cast(DummySettableBeanProperty.class.getAnnotation(TestAnnotation.class));
            }
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public int getCreatorIndex() {
            return 42;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            set(instance, deserialize(p, ctxt));
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            return setAndReturn(instance, deserialize(p, ctxt));
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            _lastSetInstance = instance;
            _lastSetValue = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            set(instance, value);
            return instance;
        }

        @Override
        public void fixAccess(DeserializationConfig config) {
            _fixAccessCalled = true;
        }
    }

    @Test
    public void testConstructorsAndDelegateMethods_normalInput_success() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName propName = new PropertyName("testProp");
        DummySettableBeanProperty dummy = new DummySettableBeanProperty(propName, type);
        ObjectIdInfo info = new ObjectIdInfo(PropertyName.construct("id"), Object.class, ObjectIdGenerators.PropertyGenerator.class, null);

        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(dummy, info);

        Assert.assertEquals("testProp", prop.getName());
        Assert.assertEquals(42, prop.getCreatorIndex());
        Assert.assertNull(prop.getMember());
        Assert.assertNull(prop.getAnnotation(TestAnnotation.class));

        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        prop.fixAccess(config);
        Assert.assertTrue(dummy._fixAccessCalled);
    }

    @Test
    public void testWithName_newPropertyName_returnsNewInstance() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName propName = new PropertyName("oldName");
        DummySettableBeanProperty dummy = new DummySettableBeanProperty(propName, type);
        ObjectIdInfo info = new ObjectIdInfo(PropertyName.construct("id"), Object.class, ObjectIdGenerators.PropertyGenerator.class, null);

        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(dummy, info);
        PropertyName newName = new PropertyName("newName");
        SettableBeanProperty renamed = prop.withName(newName);

        Assert.assertNotNull(renamed);
        Assert.assertTrue(renamed instanceof ObjectIdReferenceProperty);
        Assert.assertEquals("newName", renamed.getName());
    }

    @Test
    public void testWithValueDeserializer_sameAndDifferent_handlesProperly() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        DummySettableBeanProperty dummy = new DummySettableBeanProperty(new PropertyName("prop"), type);
        ObjectIdInfo info = new ObjectIdInfo(PropertyName.construct("id"), Object.class, ObjectIdGenerators.PropertyGenerator.class, null);

        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(dummy, info);

        JsonDeserializer<Object> deser1 = FromStringDeserializer.findDeserializer(String.class);
        SettableBeanProperty propWithDeser = prop.withValueDeserializer(deser1);
        Assert.assertNotSame(prop, propWithDeser);
        Assert.assertSame(propWithDeser, propWithDeser.withValueDeserializer(deser1));

        SettableBeanProperty propWithNull = prop.withNullProvider(null);
        Assert.assertNotNull(propWithNull);
        Assert.assertTrue(propWithNull instanceof ObjectIdReferenceProperty);
    }

    @Test
    public void testSetAndSetAndReturn_normalValues_delegatesToForward() throws IOException {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        DummySettableBeanProperty dummy = new DummySettableBeanProperty(new PropertyName("prop"), type);
        ObjectIdInfo info = new ObjectIdInfo(PropertyName.construct("id"), Object.class, ObjectIdGenerators.PropertyGenerator.class, null);

        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(dummy, info);

        Object target = new Object();
        prop.set(target, "value1");
        Assert.assertSame(target, dummy._lastSetInstance);
        Assert.assertEquals("value1", dummy._lastSetValue);

        Object result = prop.setAndReturn(target, "value2");
        Assert.assertSame(target, result);
        Assert.assertEquals("value2", dummy._lastSetValue);
    }

    @Test
    public void testDeserializeAndSet_normalDeserialization_success() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        DummySettableBeanProperty dummy = new DummySettableBeanProperty(new PropertyName("prop"), type);
        dummy = (DummySettableBeanProperty) dummy.withValueDeserializer(FromStringDeserializer.findDeserializer(String.class));
        ObjectIdInfo info = new ObjectIdInfo(PropertyName.construct("id"), Object.class, ObjectIdGenerators.PropertyGenerator.class, null);

        ObjectIdReferenceProperty prop = (ObjectIdReferenceProperty) new ObjectIdReferenceProperty(dummy, info)
                .withValueDeserializer(dummy.getValueDeserializer());

        JsonParser parser = mapper.createParser("\"testValue\"");
        parser.nextToken();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        Object instance = new Object();
        prop.deserializeAndSet(parser, ctxt, instance);

        Assert.assertSame(instance, dummy._lastSetInstance);
        Assert.assertEquals("testValue", dummy._lastSetValue);
        parser.close();
    }

    @Test
    public void testDeserializeSetAndReturn_withUnresolvedForwardReference_appendsReferring() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        DummySettableBeanProperty dummy = new DummySettableBeanProperty(new PropertyName("prop"), type);

        final UnresolvedForwardReference unresolvedEx = new UnresolvedForwardReference(
                null,
                "unresolved",
                new JsonLocation("src", 0L, 0L, 1, 1),
                new ReadableObjectId(new ObjectIdGenerator.IdKey(Object.class, Object.class, "idVal"))
        );

        JsonDeserializer<Object> throwingDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                throw unresolvedEx;
            }
        };

        ObjectIdInfo info = new ObjectIdInfo(PropertyName.construct("id"), Object.class, ObjectIdGenerators.PropertyGenerator.class, null);
        ObjectIdReferenceProperty prop = (ObjectIdReferenceProperty) new ObjectIdReferenceProperty(dummy, info).withValueDeserializer(throwingDeser);

        JsonParser parser = mapper.createParser("\"test\"");
        DeserializationContext ctxt = mapper.getDeserializationContext();

        Object instance = new Object();
        Object result = prop.deserializeSetAndReturn(parser, ctxt, instance);

        Assert.assertNull(result);
        Assert.assertTrue(unresolvedEx.getRoid().hasReferringProperties());

        parser.close();
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeSetAndReturn_unresolvedWithoutIdentityInfo_throwsException() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        DummySettableBeanProperty dummy = new DummySettableBeanProperty(new PropertyName("prop"), type);

        final UnresolvedForwardReference unresolvedEx = new UnresolvedForwardReference(
                null,
                "unresolved",
                new JsonLocation("src", 0L, 0L, 1, 1),
                new ReadableObjectId(new ObjectIdGenerator.IdKey(Object.class, Object.class, "idVal"))
        );

        JsonDeserializer<Object> throwingDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                throw unresolvedEx;
            }
        };

        ObjectIdReferenceProperty prop = (ObjectIdReferenceProperty) new ObjectIdReferenceProperty(dummy, (ObjectIdInfo) null).withValueDeserializer(throwingDeser);

        JsonParser parser = mapper.createParser("\"test\"");
        DeserializationContext ctxt = mapper.getDeserializationContext();

        try {
            prop.deserializeSetAndReturn(parser, ctxt, new Object());
        } finally {
            parser.close();
        }
    }

    @Test
    public void testPropertyReferring_handleResolvedForwardReference_success() throws IOException {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        DummySettableBeanProperty dummy = new DummySettableBeanProperty(new PropertyName("prop"), type);
        ObjectIdInfo info = new ObjectIdInfo(PropertyName.construct("id"), Object.class, ObjectIdGenerators.PropertyGenerator.class, null);
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(dummy, info);

        ReadableObjectId roid = new ReadableObjectId(new ObjectIdGenerator.IdKey(Object.class, Object.class, "targetId"));
        UnresolvedForwardReference ref = new UnresolvedForwardReference(
                null,
                "unresolved",
                new JsonLocation("src", 0L, 0L, 1, 1),
                roid
        );
        ref.addUnresolvedId("targetId", Object.class, new JsonLocation("src", 0L, 0L, 1, 1));

        Object pojo = new Object();
        PropertyReferring referring = new PropertyReferring(prop, ref, String.class, pojo);

        referring.handleResolvedForwardReference("targetId", "resolvedValue");

        Assert.assertSame(pojo, dummy._lastSetInstance);
        Assert.assertEquals("resolvedValue", dummy._lastSetValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPropertyReferring_handleResolvedForwardReference_unseenIdThrowsException() throws IOException {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        DummySettableBeanProperty dummy = new DummySettableBeanProperty(new PropertyName("prop"), type);
        ObjectIdInfo info = new ObjectIdInfo(PropertyName.construct("id"), Object.class, ObjectIdGenerators.PropertyGenerator.class, null);
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(dummy, info);

        ReadableObjectId roid = new ReadableObjectId(new ObjectIdGenerator.IdKey(Object.class, Object.class, "targetId"));
        UnresolvedForwardReference ref = new UnresolvedForwardReference(
                null,
                "unresolved",
                new JsonLocation("src", 0L, 0L, 1, 1),
                roid
        );

        Object pojo = new Object();
        PropertyReferring referring = new PropertyReferring(prop, ref, String.class, pojo);

        referring.handleResolvedForwardReference("differentId", "resolvedValue");
    }
}
