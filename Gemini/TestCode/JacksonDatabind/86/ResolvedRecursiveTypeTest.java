package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResolvedRecursiveTypeTest {

    @Test
    public void testConstructor_unresolvedInitialState_returnsNullSelfReferencedType() {
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        assertNull(type.getSelfReferencedType());
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testSetReference_validJavaType_setsSuccessfully() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType refType = SimpleType.constructUnsafe(String.class);

        recursiveType.setReference(refType);

        assertSame(refType, recursiveType.getSelfReferencedType());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetReference_calledTwice_throwsIllegalStateException() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType refType1 = SimpleType.constructUnsafe(String.class);
        JavaType refType2 = SimpleType.constructUnsafe(Integer.class);

        recursiveType.setReference(refType1);
        recursiveType.setReference(refType2);
    }

    @Test
    public void testGetGenericSignature_resolved_delegatesToReferencedType() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType refType = SimpleType.constructUnsafe(String.class);
        recursiveType.setReference(refType);

        StringBuilder sb = new StringBuilder();
        StringBuilder result = recursiveType.getGenericSignature(sb);

        assertSame(sb, result);
        assertEquals("Ljava/lang/String;", result.toString());
    }

    @Test
    public void testGetErasedSignature_resolved_delegatesToReferencedType() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType refType = SimpleType.constructUnsafe(String.class);
        recursiveType.setReference(refType);

        StringBuilder sb = new StringBuilder();
        StringBuilder result = recursiveType.getErasedSignature(sb);

        assertSame(sb, result);
        assertEquals("Ljava/lang/String;", result.toString());
    }

    @Test
    public void testWithContentType_returnsThis() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType contentType = SimpleType.constructUnsafe(Integer.class);

        assertSame(recursiveType, recursiveType.withContentType(contentType));
        assertSame(recursiveType, recursiveType.withContentType(null));
    }

    @Test
    public void testWithTypeHandler_returnsThis() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        assertSame(recursiveType, recursiveType.withTypeHandler("dummyHandler"));
        assertSame(recursiveType, recursiveType.withTypeHandler(null));
    }

    @Test
    public void testWithContentTypeHandler_returnsThis() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        assertSame(recursiveType, recursiveType.withContentTypeHandler("dummyHandler"));
        assertSame(recursiveType, recursiveType.withContentTypeHandler(null));
    }

    @Test
    public void testWithValueHandler_returnsThis() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        assertSame(recursiveType, recursiveType.withValueHandler("dummyValueHandler"));
        assertSame(recursiveType, recursiveType.withValueHandler(null));
    }

    @Test
    public void testWithContentValueHandler_returnsThis() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        assertSame(recursiveType, recursiveType.withContentValueHandler("dummyValueHandler"));
        assertSame(recursiveType, recursiveType.withContentValueHandler(null));
    }

    @Test
    public void testWithStaticTyping_returnsThis() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        assertSame(recursiveType, recursiveType.withStaticTyping());
    }

    @Test
    public void testNarrow_returnsThis() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());

        assertSame(recursiveType, recursiveType._narrow(String.class));
        assertSame(recursiveType, recursiveType._narrow(null));
    }

    @Test
    public void testRefine_returnsNull() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType superClass = SimpleType.constructUnsafe(Object.class);
        JavaType[] interfaces = new JavaType[]{SimpleType.constructUnsafe(Comparable.class)};

        assertNull(recursiveType.refine(String.class, TypeBindings.emptyBindings(), superClass, interfaces));
        assertNull(recursiveType.refine(null, null, null, null));
        assertNull(recursiveType.refine(String.class, TypeBindings.emptyBindings(), null, new JavaType[0]));
    }

    @Test
    public void testIsContainerType_returnsFalse() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        assertFalse(recursiveType.isContainerType());
    }

    @Test
    public void testToString_unresolved_containsUnresolvedTag() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        assertEquals("[recursive type; UNRESOLVED", recursiveType.toString());
    }

    @Test
    public void testToString_resolved_containsReferencedRawClassName() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType refType = SimpleType.constructUnsafe(String.class);
        recursiveType.setReference(refType);

        assertEquals("[recursive type; java.lang.String", recursiveType.toString());
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        assertTrue(recursiveType.equals(recursiveType));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        assertFalse(recursiveType.equals(null));
    }

    @Test
    public void testEquals_unresolvedInstance_returnsFalse() {
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        ResolvedRecursiveType recursiveType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType refType = SimpleType.constructUnsafe(String.class);
        recursiveType.setReference(refType);

        assertFalse(recursiveType.equals("NotAResolvedRecursiveType"));
        assertFalse(recursiveType.equals(refType));
    }

    @Test
    public void testEquals_resolvedWithEqualReferences_returnsTrue() {
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        JavaType refType1 = SimpleType.constructUnsafe(String.class);
        JavaType refType2 = SimpleType.constructUnsafe(String.class);

        type1.setReference(refType1);
        type2.setReference(refType2);

        assertTrue(type1.equals(type2));
        assertTrue(type2.equals(type1));
    }

    @Test
    public void testEquals_resolvedWithDifferentReferences_returnsFalse() {
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings());

        JavaType refType1 = SimpleType.constructUnsafe(String.class);
        JavaType refType2 = SimpleType.constructUnsafe(Integer.class);

        type1.setReference(refType1);
        type2.setReference(refType2);

        assertFalse(type1.equals(type2));
        assertFalse(type2.equals(type1));
    }

    @Test
    public void testEquals_thisResolvedOtherUnresolved_returnsFalse() {
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        JavaType refType1 = SimpleType.constructUnsafe(String.class);
        type1.setReference(refType1);

        assertFalse(type1.equals(type2));
    }
}
