package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JavaType;

public class ResolvedRecursiveTypeTest {

    @Test
    public void testConstructor_unresolvedState_success() {
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        assertEquals(String.class, type.getRawClass());
        assertNull(type.getSelfReferencedType());
        assertFalse(type.isContainerType());
        assertEquals("[recursive type; UNRESOLVED", type.toString());
    }

    @Test
    public void testSetReference_singleCall_success() {
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType refType = SimpleType.constructUnsafe(String.class);

        type.setReference(refType);

        assertSame(refType, type.getSelfReferencedType());
        assertEquals("[recursive type; java.lang.String", type.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetReference_multipleCalls_throwsIllegalStateException() {
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType refType1 = SimpleType.constructUnsafe(String.class);
        JavaType refType2 = SimpleType.constructUnsafe(Integer.class);

        type.setReference(refType1);
        type.setReference(refType2);
    }

    @Test
    public void testGetGenericSignature_delegatesToReferencedType() {
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType refType = SimpleType.constructUnsafe(String.class);
        type.setReference(refType);

        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);

        assertNotNull(result);
        assertEquals(refType.getGenericSignature(), result.toString());
    }

    @Test
    public void testGetErasedSignature_delegatesToReferencedType() {
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType refType = SimpleType.constructUnsafe(String.class);
        type.setReference(refType);

        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);

        assertNotNull(result);
        assertEquals(refType.getErasedSignature(), result.toString());
    }

    @Test
    public void testWithMethods_returnSameInstance() {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType contentType = SimpleType.constructUnsafe(String.class);

        assertSame(type, type.withContentType(contentType));
        assertSame(type, type.withContentType(null));

        assertSame(type, type.withTypeHandler("handler"));
        assertSame(type, type.withTypeHandler(null));

        assertSame(type, type.withContentTypeHandler("contentHandler"));
        assertSame(type, type.withContentTypeHandler(null));

        assertSame(type, type.withValueHandler("valueHandler"));
        assertSame(type, type.withValueHandler(null));

        assertSame(type, type.withContentValueHandler("contentValueHandler"));
        assertSame(type, type.withContentValueHandler(null));

        assertSame(type, type.withStaticTyping());

        assertSame(type, type._narrow(String.class));
    }

    @Test
    public void testRefine_returnsNull() {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType superClass = SimpleType.constructUnsafe(Object.class);
        JavaType[] superInterfaces = new JavaType[0];

        assertNull(type.refine(Object.class, TypeBindings.emptyBindings(), superClass, superInterfaces));
        assertNull(type.refine(null, null, null, null));
    }

    @Test
    public void testEquals_allBranches() {
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType type3 = new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings());

        // o == this
        assertTrue(type1.equals(type1));

        // o == null
        assertFalse(type1.equals(null));

        // this._referencedType == null (unresolved should never match)
        assertFalse(type1.equals(type2));

        JavaType refString = SimpleType.constructUnsafe(String.class);
        JavaType refInteger = SimpleType.constructUnsafe(Integer.class);

        type1.setReference(refString);

        // this is resolved, other is unresolved
        assertFalse(type1.equals(type2));

        // different class
        assertFalse(type1.equals("Some String"));
        assertFalse(type1.equals(refString));

        type2.setReference(refString);
        type3.setReference(refInteger);

        // both resolved with same referenced type
        assertTrue(type1.equals(type2));
        assertTrue(type2.equals(type1));

        // both resolved with different referenced type
        assertFalse(type1.equals(type3));
        assertFalse(type3.equals(type1));
    }
}
