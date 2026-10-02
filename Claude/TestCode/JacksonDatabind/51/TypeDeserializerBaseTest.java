package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.IOException;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TypeDeserializerBaseTest {

    // ---- Stub TypeIdResolver implementation (no mocking framework used) ----
    static class StubTypeIdResolver implements TypeIdResolver {
        @Override
        public void init(JavaType baseType) { }

        @Override
        public String idFromValue(Object value) { return null; }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) { return null; }

        @Override
        public String idFromBaseType() { return null; }

        @Override
        public JavaType typeFromId(DatabindContext context, String id) { return null; }

        @Override
        public String getDescForKnownTypeIds() { return null; }

        @Override
        public JsonTypeInfo.Id getMechanism() { return JsonTypeInfo.Id.CLASS; }

        @Override
        public String toString() { return "StubTypeIdResolver"; }
    }

    // ---- Concrete subclass to allow instantiation of abstract TypeDeserializerBase ----
    static class ConcreteTypeDeserializer extends TypeDeserializerBase {

        private static final long serialVersionUID = 1L;

        public ConcreteTypeDeserializer(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, JavaType defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        public ConcreteTypeDeserializer(TypeDeserializerBase src, BeanProperty property) {
            super(src, property);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new ConcreteTypeDeserializer(this, prop);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException("not used in this test");
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException("not used in this test");
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException("not used in this test");
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException("not used in this test");
        }

        // helper accessors exposed only for test purposes
        public BeanProperty exposedProperty() {
            return _property;
        }

        public JavaType exposedDefaultImpl() {
            return _defaultImpl;
        }

        public boolean exposedTypeIdVisible() {
            return _typeIdVisible;
        }
    }

    private JavaType stringType() {
        return TypeFactory.defaultInstance().constructType(String.class);
    }

    private JavaType numberType() {
        return TypeFactory.defaultInstance().constructType(Number.class);
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_withNullTypePropertyName_defaultsToEmptyString() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), null, false, null);
        assertEquals("", deser.getPropertyName());
    }

    @Test
    public void testConstructor_withTypePropertyName_setsCorrectValue() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "@type", true, null);
        assertEquals("@type", deser.getPropertyName());
        assertTrue(deser.exposedTypeIdVisible());
    }

    @Test
    public void testConstructor_withDefaultImpl_setsDefaultImplField() {
        JavaType defImpl = numberType();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "type", false, defImpl);
        assertEquals(Number.class, deser.getDefaultImpl());
        assertNotNull(deser.exposedDefaultImpl());
    }

    @Test
    public void testCopyConstructor_viaForProperty_copiesFieldsAndSetsProperty() {
        ConcreteTypeDeserializer original = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "type", true, numberType());

        TypeDeserializer copy = original.forProperty(null);
        assertTrue(copy instanceof ConcreteTypeDeserializer);
        ConcreteTypeDeserializer copyImpl = (ConcreteTypeDeserializer) copy;

        // property should be null since we passed null
        assertNull(copyImpl.exposedProperty());
        // other fields copied
        assertEquals(original.getPropertyName(), copyImpl.getPropertyName());
        assertEquals(original.getDefaultImpl(), copyImpl.getDefaultImpl());
        assertEquals(original.getTypeIdResolver(), copyImpl.getTypeIdResolver());
    }

    // ---------------------------------------------------------------
    // Accessor tests
    // ---------------------------------------------------------------

    @Test
    public void testBaseTypeName_returnsCorrectRawClassName() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "type", false, null);
        assertEquals(String.class.getName(), deser.baseTypeName());
    }

    @Test(expected = NullPointerException.class)
    public void testBaseTypeName_withNullBaseType_throwsNPE() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                null, new StubTypeIdResolver(), "type", false, null);
        deser.baseTypeName();
    }

    @Test
    public void testGetPropertyName_returnsTypePropertyName() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "myType", false, null);
        assertEquals("myType", deser.getPropertyName());
    }

    @Test
    public void testGetTypeIdResolver_returnsSameInstancePassedIn() {
        StubTypeIdResolver resolver = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), resolver, "type", false, null);
        assertSame(resolver, deser.getTypeIdResolver());
    }

    @Test
    public void testGetDefaultImpl_withNullDefaultImpl_returnsNull() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "type", false, null);
        assertNull(deser.getDefaultImpl());
    }

    @Test
    public void testGetDefaultImpl_withNonNullDefaultImpl_returnsRawClass() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "type", false, numberType());
        assertEquals(Number.class, deser.getDefaultImpl());
    }

    @Test
    public void testGetTypeInclusion_returnsExpectedEnumFromSubclass() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "type", false, null);
        assertEquals(JsonTypeInfo.As.PROPERTY, deser.getTypeInclusion());
    }

    @Test
    public void testForProperty_returnsNewInstanceOfSameRuntimeType() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "type", false, null);
        TypeDeserializer result = deser.forProperty(null);
        assertNotNull(result);
        assertNotSame(deser, result);
        assertTrue(result instanceof ConcreteTypeDeserializer);
    }

    // ---------------------------------------------------------------
    // toString tests
    // ---------------------------------------------------------------

    @Test
    public void testToString_containsClassNameBaseTypeAndIdResolver() {
        StubTypeIdResolver resolver = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), resolver, "type", false, null);
        String result = deser.toString();
        assertNotNull(result);
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertTrue(result.contains(deser.getClass().getName()));
        assertTrue(result.contains("base-type:"));
        assertTrue(result.contains("id-resolver:"));
        assertTrue(result.contains("StubTypeIdResolver"));
    }

    @Test
    public void testToString_withNullIdResolver_doesNotThrow() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), null, "type", false, null);
        String result = deser.toString();
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // Edge cases for typeIdVisible flag
    // ---------------------------------------------------------------

    @Test
    public void testTypeIdVisible_trueValue_isStoredCorrectly() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "type", true, null);
        assertTrue(deser.exposedTypeIdVisible());
    }

    @Test
    public void testTypeIdVisible_falseValue_isStoredCorrectly() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "type", false, null);
        assertFalse(deser.exposedTypeIdVisible());
    }

    @Test
    public void testConstructor_withEmptyStringTypePropertyName_keepsEmptyString() {
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                stringType(), new StubTypeIdResolver(), "", false, null);
        assertEquals("", deser.getPropertyName());
    }
}
