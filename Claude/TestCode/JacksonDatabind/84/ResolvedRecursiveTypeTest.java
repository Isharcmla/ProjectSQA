package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ResolvedRecursiveTypeTest {

    private ResolvedRecursiveType recursiveType;
    private JavaType stringType;
    private JavaType intType;

    @Before
    public void setUp() {
        recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        stringType = TypeFactory.defaultInstance().constructType(String.class);
        intType = TypeFactory.defaultInstance().constructType(Integer.class);
    }

    // ---------- Constructor ----------
    @Test
    public void testConstructor_validInput_createsInstance() {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertNotNull(type);
        assertNull(type.getSelfReferencedType());
    }

    // ---------- setReference / getSelfReferencedType ----------
    @Test
    public void testSetReference_normalInput_setsReference() {
        recursiveType.setReference(stringType);
        assertEquals(stringType, recursiveType.getSelfReferencedType());
    }

    @Test
    public void testGetSelfReferencedType_beforeSet_returnsNull() {
        assertNull(recursiveType.getSelfReferencedType());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetReference_calledTwice_throwsIllegalStateException() {
        recursiveType.setReference(stringType);
        recursiveType.setReference(intType);
    }

    // ---------- getGenericSignature ----------
    @Test
    public void testGetGenericSignature_resolvedType_returnsSignature() {
        recursiveType.setReference(stringType);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = recursiveType.getGenericSignature(sb);
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testGetGenericSignature_unresolvedType_throwsNullPointerException() {
        StringBuilder sb = new StringBuilder();
        recursiveType.getGenericSignature(sb);
    }

    // ---------- getErasedSignature ----------
    @Test
    public void testGetErasedSignature_resolvedType_returnsSignature() {
        recursiveType.setReference(stringType);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = recursiveType.getErasedSignature(sb);
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testGetErasedSignature_unresolvedType_throwsNullPointerException() {
        StringBuilder sb = new StringBuilder();
        recursiveType.getErasedSignature(sb);
    }

    // ---------- withContentType ----------
    @Test
    public void testWithContentType_anyInput_returnsSameInstance() {
        JavaType result = recursiveType.withContentType(stringType);
        assertSame(recursiveType, result);
    }

    @Test
    public void testWithContentType_nullInput_returnsSameInstance() {
        JavaType result = recursiveType.withContentType(null);
        assertSame(recursiveType, result);
    }

    // ---------- withTypeHandler ----------
    @Test
    public void testWithTypeHandler_anyInput_returnsSameInstance() {
        JavaType result = recursiveType.withTypeHandler(new Object());
        assertSame(recursiveType, result);
    }

    @Test
    public void testWithTypeHandler_nullInput_returnsSameInstance() {
        JavaType result = recursiveType.withTypeHandler(null);
        assertSame(recursiveType, result);
    }

    // ---------- withContentTypeHandler ----------
    @Test
    public void testWithContentTypeHandler_anyInput_returnsSameInstance() {
        JavaType result = recursiveType.withContentTypeHandler(new Object());
        assertSame(recursiveType, result);
    }

    @Test
    public void testWithContentTypeHandler_nullInput_returnsSameInstance() {
        JavaType result = recursiveType.withContentTypeHandler(null);
        assertSame(recursiveType, result);
    }

    // ---------- withValueHandler ----------
    @Test
    public void testWithValueHandler_anyInput_returnsSameInstance() {
        JavaType result = recursiveType.withValueHandler(new Object());
        assertSame(recursiveType, result);
    }

    @Test
    public void testWithValueHandler_nullInput_returnsSameInstance() {
        JavaType result = recursiveType.withValueHandler(null);
        assertSame(recursiveType, result);
    }

    // ---------- withContentValueHandler ----------
    @Test
    public void testWithContentValueHandler_anyInput_returnsSameInstance() {
        JavaType result = recursiveType.withContentValueHandler(new Object());
        assertSame(recursiveType, result);
    }

    @Test
    public void testWithContentValueHandler_nullInput_returnsSameInstance() {
        JavaType result = recursiveType.withContentValueHandler(null);
        assertSame(recursiveType, result);
    }

    // ---------- withStaticTyping ----------
    @Test
    public void testWithStaticTyping_noInput_returnsSameInstance() {
        JavaType result = recursiveType.withStaticTyping();
        assertSame(recursiveType, result);
    }

    // ---------- _narrow (protected, accessible via same package) ----------
    @Test
    public void testNarrow_anyClass_returnsSameInstance() {
        JavaType result = recursiveType._narrow(Integer.class);
        assertSame(recursiveType, result);
    }

    @Test
    public void testNarrow_nullInput_returnsSameInstance() {
        JavaType result = recursiveType._narrow(null);
        assertSame(recursiveType, result);
    }

    // ---------- refine ----------
    @Test
    public void testRefine_anyInput_returnsNull() {
        JavaType result = recursiveType.refine(String.class, TypeBindings.emptyBindings(), null, null);
        assertNull(result);
    }

    @Test
    public void testRefine_nullInputs_returnsNull() {
        JavaType result = recursiveType.refine(null, null, null, null);
        assertNull(result);
    }

    // ---------- isContainerType ----------
    @Test
    public void testIsContainerType_alwaysReturnsFalse() {
        assertFalse(recursiveType.isContainerType());
    }

    // ---------- toString ----------
    @Test
    public void testToString_unresolvedType_returnsUnresolvedMessage() {
        String result = recursiveType.toString();
        assertTrue(result.contains("UNRESOLVED"));
    }

    @Test
    public void testToString_resolvedType_returnsClassName() {
        recursiveType.setReference(stringType);
        String result = recursiveType.toString();
        assertTrue(result.contains(String.class.getName()));
    }

    // ---------- equals ----------
    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(recursiveType.equals(recursiveType));
    }

    @Test
    public void testEquals_nullInput_returnsFalse() {
        assertFalse(recursiveType.equals(null));
    }

    @Test
    public void testEquals_unresolvedTypeComparedToOtherObject_returnsFalse() {
        ResolvedRecursiveType other = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        other.setReference(stringType);
        assertFalse(recursiveType.equals(other));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        recursiveType.setReference(stringType);
        assertFalse(recursiveType.equals(stringType));
    }

    @Test
    public void testEquals_sameClassSameReferencedType_returnsTrue() {
        recursiveType.setReference(stringType);
        ResolvedRecursiveType other = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        other.setReference(stringType);
        assertTrue(recursiveType.equals(other));
    }

    @Test
    public void testEquals_sameClassDifferentReferencedType_returnsFalse() {
        recursiveType.setReference(stringType);
        ResolvedRecursiveType other = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        other.setReference(intType);
        assertFalse(recursiveType.equals(other));
    }
}
