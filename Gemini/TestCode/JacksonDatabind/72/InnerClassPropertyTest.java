package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class InnerClassPropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnnotation {
        String value() default "test";
    }

    public static class OuterClass {
        public InnerClass inner;

        public class InnerClass {
            public String name;

            public InnerClass() {
            }
        }

        public class ThrowingInnerClass {
            public ThrowingInnerClass() {
                throw new IllegalStateException("Simulated inner construction failure");
            }
        }
    }

    private static class DummySettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;

        private Object _assignedValue;
        private int _index = -1;

        public DummySettableBeanProperty(PropertyName name, JavaType type, PropertyMetadata metadata, JsonDeserializer<Object> deser) {
            super(name, type, metadata, deser);
        }

        protected DummySettableBeanProperty(DummySettableBeanProperty src) {
            super(src);
            this._assignedValue = src._assignedValue;
            this._index = src._index;
        }

        protected DummySettableBeanProperty(DummySettableBeanProperty src, JsonDeserializer<?> deser) {
            super(src, deser);
            this._assignedValue = src._assignedValue;
            this._index = src._index;
        }

        protected DummySettableBeanProperty(DummySettableBeanProperty src, PropertyName newName) {
            super(src, newName);
            this._assignedValue = src._assignedValue;
            this._index = src._index;
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return new DummySettableBeanProperty(this, deser);
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new DummySettableBeanProperty(this, newName);
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return this;
        }

        @Override
        public void assignIndex(int index) {
            this._index = index;
        }

        @Override
        public int getPropertyIndex() {
            return this._index;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            if (acls == TestAnnotation.class) {
                @TestAnnotation("mock")
                class AnnotatedDummy {}
                return AnnotatedDummy.class.getAnnotation(acls);
            }
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            _assignedValue = deserialize(p, ctxt);
            set(instance, _assignedValue);
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            _assignedValue = deserialize(p, ctxt);
            return setAndReturn(instance, _assignedValue);
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            this._assignedValue = value;
            if (instance instanceof OuterClass && value instanceof OuterClass.InnerClass) {
                ((OuterClass) instance).inner = (OuterClass.InnerClass) value;
            }
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            set(instance, value);
            return instance;
        }

        public Object getAssignedValue() {
            return _assignedValue;
        }
    }

    private ObjectMapper _objectMapper;
    private DummySettableBeanProperty _delegate;
    private Constructor<?> _innerCtor;
    private InnerClassProperty _innerProp;

    @Before
    public void setUp() throws Exception {
        _objectMapper = new ObjectMapper();
        JavaType type = TypeFactory.defaultInstance().constructType(OuterClass.InnerClass.class);
        JsonDeserializer<Object> deser = _objectMapper.getDeserializationContext().findRootValueDeserializer(type);
        _delegate = new DummySettableBeanProperty(PropertyName.construct("inner"), type, PropertyMetadata.STD_REQUIRED, deser);
        _innerCtor = OuterClass.InnerClass.class.getDeclaredConstructor(OuterClass.class);
        _innerProp = new InnerClassProperty(_delegate, _innerCtor);
    }

    @Test
    public void testWithName_validName_createsNewInstanceWithUpdatedName() {
        PropertyName newName = new PropertyName("renamedInner");
        InnerClassProperty renamed = _innerProp.withName(newName);

        assertNotNull(renamed);
        assertEquals("renamedInner", renamed.getName());
    }

    @Test
    public void testWithValueDeserializer_customDeserializer_createsNewInstanceWithUpdatedDeserializer() {
        JsonDeserializer<Object> customDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };

        InnerClassProperty updated = _innerProp.withValueDeserializer(customDeser);
        assertNotNull(updated);
        assertSame(customDeser, updated.getValueDeserializer());
    }

    @Test
    public void testAssignIndexAndGetPropertyIndex_validIndex_setsAndRetrievesProperly() {
        assertEquals(-1, _innerProp.getPropertyIndex());
        _innerProp.assignIndex(5);
        assertEquals(5, _innerProp.getPropertyIndex());

        _innerProp.assignIndex(0);
        assertEquals(0, _innerProp.getPropertyIndex());

        _innerProp.assignIndex(-10);
        assertEquals(-10, _innerProp.getPropertyIndex());
    }

    @Test
    public void testGetAnnotation_presentAndAbsent_returnsExpected() {
        TestAnnotation annotation = _innerProp.getAnnotation(TestAnnotation.class);
        assertNotNull(annotation);
        assertEquals("mock", annotation.value());

        Retention absent = _innerProp.getAnnotation(Retention.class);
        assertNull(absent);
    }

    @Test
    public void testGetMember_delegatesToUnderlyingProperty() {
        assertNull(_innerProp.getMember());
    }

    @Test
    public void testSetAndSetAndReturn_validInstance_setsValueProperly() throws Exception {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        _innerProp.set(outer, inner);
        assertSame(inner, outer.inner);

        OuterClass outer2 = new OuterClass();
        OuterClass.InnerClass inner2 = outer2.new InnerClass();
        Object returned = _innerProp.setAndReturn(outer2, inner2);

        assertSame(outer2, returned);
        assertSame(inner2, outer2.inner);
    }

    @Test
    public void testDeserializeAndSet_normalInput_instantiatesInnerClass() throws Exception {
        OuterClass outer = new OuterClass();
        JsonParser parser = _objectMapper.getFactory().createParser("{\"name\":\"testValue\"}");
        DeserializationContext ctxt = _objectMapper.getDeserializationContext();
        parser.nextToken();

        _innerProp.deserializeAndSet(parser, ctxt, outer);

        assertNotNull(outer.inner);
        assertEquals("testValue", outer.inner.name);
        parser.close();
    }

    @Test
    public void testDeserializeAndSet_nullToken_assignsNullValue() throws Exception {
        OuterClass outer = new OuterClass();
        outer.inner = outer.new InnerClass();

        JsonParser parser = _objectMapper.getFactory().createParser("null");
        DeserializationContext ctxt = _objectMapper.getDeserializationContext();
        parser.nextToken();

        _innerProp.deserializeAndSet(parser, ctxt, outer);

        assertNull(outer.inner);
        parser.close();
    }

    @Test
    public void testDeserializeAndSet_withTypeDeserializer_deserializesWithType() throws Exception {
        OuterClass outer = new OuterClass();
        final OuterClass.InnerClass innerInstance = outer.new InnerClass();
        innerInstance.name = "typedValue";

        JsonDeserializer<Object> typeAwareDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }

            @Override
            public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer) {
                return innerInstance;
            }
        };

        JavaType type = TypeFactory.defaultInstance().constructType(OuterClass.InnerClass.class);
        DummySettableBeanProperty dummyDelegate = new DummySettableBeanProperty(PropertyName.construct("inner"), type, PropertyMetadata.STD_REQUIRED, typeAwareDeser);

        class StubInnerClassProperty extends SettableBeanProperty {
            private static final long serialVersionUID = 1L;
            private final InnerClassProperty _base;

            public StubInnerClassProperty(InnerClassProperty base, TypeDeserializer typeDeser) {
                super(base);
                this._base = base;
                this._valueTypeDeserializer = typeDeser;
                this._valueDeserializer = base.getValueDeserializer();
            }

            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
            @Override
            public SettableBeanProperty withName(PropertyName newName) { return this; }
            @Override
            public SettableBeanProperty withNullProvider(NullValueProvider nva) { return this; }
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public AnnotatedMember getMember() { return null; }
            @Override
            public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
                _base.deserializeAndSet(p, ctxt, instance);
            }
            @Override
            public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
                return _base.deserializeSetAndReturn(p, ctxt, instance);
            }
            @Override
            public void set(Object instance, Object value) throws IOException {
                _base.set(instance, value);
            }
            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException {
                return _base.setAndReturn(instance, value);
            }
        }

        InnerClassProperty innerPropWithDeser = new InnerClassProperty(dummyDelegate, _innerCtor);
        InnerClassProperty propertyWithTypeDeser = innerPropWithDeser.withValueDeserializer(typeAwareDeser);

        java.lang.reflect.Field typeDeserField = SettableBeanProperty.class.getDeclaredField("_valueTypeDeserializer");
        typeDeserField.setAccessible(true);
        TypeDeserializer dummyTypeDeser = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(
                type, null, "@type", false, type
        );
        typeDeserField.set(propertyWithTypeDeser, dummyTypeDeser);

        JsonParser parser = _objectMapper.getFactory().createParser("{\"@type\":\"InnerClass\", \"name\":\"typedValue\"}");
        DeserializationContext ctxt = _objectMapper.getDeserializationContext();
        parser.nextToken();

        propertyWithTypeDeser.deserializeAndSet(parser, ctxt, outer);

        assertSame(innerInstance, outer.inner);
        assertEquals("typedValue", outer.inner.name);
        parser.close();
    }

    @Test
    public void testDeserializeAndSet_innerConstructorThrows_throwsIllegalArgumentException() throws Exception {
        Constructor<?> throwingCtor = OuterClass.ThrowingInnerClass.class.getDeclaredConstructor(OuterClass.class);
        InnerClassProperty throwingProp = new InnerClassProperty(_delegate, throwingCtor);

        OuterClass outer = new OuterClass();
        JsonParser parser = _objectMapper.getFactory().createParser("{\"name\":\"test\"}");
        DeserializationContext ctxt = _objectMapper.getDeserializationContext();
        parser.nextToken();

        try {
            throwingProp.deserializeAndSet(parser, ctxt, outer);
            fail("Expected IllegalArgumentException when constructor fails");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Failed to instantiate class"));
            assertTrue(e.getMessage().contains("Simulated inner construction failure"));
        } finally {
            parser.close();
        }
    }

    @Test
    public void testDeserializeSetAndReturn_validInstance_returnsUpdatedInstance() throws Exception {
        OuterClass outer = new OuterClass();
        JsonParser parser = _objectMapper.getFactory().createParser("{\"name\":\"returnedValue\"}");
        DeserializationContext ctxt = _objectMapper.getDeserializationContext();
        parser.nextToken();

        Object result = _innerProp.deserializeSetAndReturn(parser, ctxt, outer);

        assertSame(outer, result);
        assertNotNull(outer.inner);
        assertEquals("returnedValue", outer.inner.name);
        parser.close();
    }

    @Test
    public void testWriteReplaceAndReadResolve_serializationLifecycle() throws Exception {
        Object replaced = _innerProp.writeReplace();
        assertTrue(replaced instanceof InnerClassProperty);
        InnerClassProperty replacedProp = (InnerClassProperty) replaced;

        Object resolved = replacedProp.readResolve();
        assertTrue(resolved instanceof InnerClassProperty);

        Object replacedTwice = replacedProp.writeReplace();
        assertSame(replacedProp, replacedTwice);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullAnnotatedConstructor_throwsIllegalArgumentException() {
        new InnerClassProperty(_innerProp, (AnnotatedConstructor) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_annotatedConstructorWithNullReflectConstructor_throwsIllegalArgumentException() {
        TypeResolutionContext typeResCtxt = new TypeResolutionContext.Basic(TypeFactory.defaultInstance(), TypeFactory.defaultInstance().constructType(OuterClass.InnerClass.class).getBindings());
        AnnotatedConstructor emptyAnnCtor = new AnnotatedConstructor(typeResCtxt, null, new AnnotationMap(), null);
        new InnerClassProperty(_innerProp, emptyAnnCtor);
    }

    @Test
    public void testJdkSerializationRoundtrip_success() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(_innerProp);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof InnerClassProperty);
        InnerClassProperty deserializedProp = (InnerClassProperty) deserialized;
        assertEquals(_innerProp.getName(), deserializedProp.getName());
    }
}
