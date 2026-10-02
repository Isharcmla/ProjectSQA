package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class SimpleTypeTest
{
    /*
    /**********************************************************
    /* constructUnsafe tests
    /**********************************************************
     */

    @Test
    public void testConstructUnsafe_normalClass_returnsSimpleType()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertNotNull(type);
        assertEquals(String.class, type._class);
        assertFalse(type.isContainerType());
    }

    @Test
    public void testConstructUnsafe_arrayClass_returnsSimpleTypeWithoutValidation()
    {
        // edge case: constructUnsafe does not validate array types
        SimpleType type = SimpleType.constructUnsafe(int[].class);
        assertNotNull(type);
        assertEquals(int[].class, type._class);
    }

    /*
    /**********************************************************
    /* construct (deprecated) tests
    /**********************************************************
     */

    @Test
    public void testConstruct_normalClass_returnsSimpleType()
    {
        SimpleType type = SimpleType.construct(String.class);
        assertNotNull(type);
        assertEquals(String.class, type._class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_mapClass_throwsIllegalArgumentException()
    {
        SimpleType.construct(HashMap.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_collectionClass_throwsIllegalArgumentException()
    {
        SimpleType.construct(ArrayList.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_arrayClass_throwsIllegalArgumentException()
    {
        SimpleType.construct(int[].class);
    }

    @Test(expected = NullPointerException.class)
    public void testConstruct_nullClass_throwsNullPointerException()
    {
        SimpleType.construct(null);
    }

    /*
    /**********************************************************
    /* _narrow tests
    /**********************************************************
     */

    @Test
    public void test_narrow_sameClass_returnsSameInstance()
    {
        SimpleType type = SimpleType.constructUnsafe(Integer.class);
        JavaType narrowed = type._narrow(Integer.class);
        assertSame(type, narrowed);
    }

    @Test
    public void test_narrow_differentClass_returnsNewInstance()
    {
        SimpleType type = SimpleType.constructUnsafe(Integer.class);
        JavaType narrowed = type._narrow(Number.class);
        assertNotSame(type, narrowed);
        assertTrue(narrowed instanceof SimpleType);
        assertEquals(Number.class, ((SimpleType) narrowed)._class);
    }

    /*
    /**********************************************************
    /* withContentType / withContentTypeHandler / withContentValueHandler
    /**********************************************************
     */

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentType_alwaysThrowsException()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        JavaType contentType = SimpleType.constructUnsafe(Integer.class);
        type.withContentType(contentType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandler_alwaysThrowsException()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentTypeHandler(new Object());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandler_alwaysThrowsException()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentValueHandler(new Object());
    }

    /*
    /**********************************************************
    /* withTypeHandler tests
    /**********************************************************
     */

    @Test
    public void testWithTypeHandler_sameHandler_returnsSameInstance()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        // _typeHandler is null by default from constructUnsafe
        SimpleType result = type.withTypeHandler(null);
        assertSame(type, result);
    }

    @Test
    public void testWithTypeHandler_differentHandler_returnsNewInstance()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object handler = new Object();
        SimpleType result = type.withTypeHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result._typeHandler);
    }

    /*
    /**********************************************************
    /* withValueHandler tests
    /**********************************************************
     */

    @Test
    public void testWithValueHandler_sameHandler_returnsSameInstance()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        // _valueHandler is null by default from constructUnsafe
        SimpleType result = type.withValueHandler(null);
        assertSame(type, result);
    }

    @Test
    public void testWithValueHandler_differentHandler_returnsNewInstance()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object handler = new Object();
        SimpleType result = type.withValueHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result._valueHandler);
    }

    /*
    /**********************************************************
    /* withStaticTyping tests
    /**********************************************************
     */

    @Test
    public void testWithStaticTyping_notStatic_returnsNewInstance()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type._asStatic);
        SimpleType staticType = type.withStaticTyping();
        assertNotSame(type, staticType);
        assertTrue(staticType._asStatic);
    }

    @Test
    public void testWithStaticTyping_alreadyStatic_returnsSameInstance()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType staticType = type.withStaticTyping();
        SimpleType staticType2 = staticType.withStaticTyping();
        assertSame(staticType, staticType2);
    }

    /*
    /**********************************************************
    /* refine tests
    /**********************************************************
     */

    @Test
    public void testRefine_alwaysReturnsNull()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        JavaType result = type.refine(Integer.class, TypeBindings.emptyBindings(), null, null);
        assertNull(result);
    }

    /*
    /**********************************************************
    /* buildCanonicalName tests
    /**********************************************************
     */

    @Test
    public void testBuildCanonicalName_normalClass_returnsClassName()
    {
        SimpleType type = SimpleType.construct(String.class);
        String canonical = type.buildCanonicalName();
        assertEquals(String.class.getName(), canonical);
    }

    /*
    /**********************************************************
    /* isContainerType tests
    /**********************************************************
     */

    @Test
    public void testIsContainerType_alwaysFalse()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.isContainerType());
    }

    /*
    /**********************************************************
    /* getErasedSignature tests
    /**********************************************************
     */

    @Test
    public void testGetErasedSignature_returnsNonNullSignature()
    {
        SimpleType type = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    /*
    /**********************************************************
    /* getGenericSignature tests
    /**********************************************************
     */

    @Test
    public void testGetGenericSignature_returnsSignatureEndingWithSemicolon()
    {
        SimpleType type = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        assertNotNull(result);
        assertTrue(result.toString().endsWith(";"));
    }

    /*
    /**********************************************************
    /* toString tests
    /**********************************************************
     */

    @Test
    public void testToString_normalClass_returnsExpectedFormat()
    {
        SimpleType type = SimpleType.construct(String.class);
        String str = type.toString();
        assertTrue(str.startsWith("[simple type, class "));
        assertTrue(str.endsWith("]"));
        assertTrue(str.contains(String.class.getName()));
    }

    /*
    /**********************************************************
    /* equals tests
    /**********************************************************
     */

    @Test
    public void testEquals_sameInstance_returnsTrue()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertTrue(type.equals(type));
    }

    @Test
    public void testEquals_null_returnsFalse()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.equals(null));
    }

    @Test
    public void testEquals_differentObjectClass_returnsFalse()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object other = "not a SimpleType";
        assertFalse(type.equals(other));
    }

    @Test
    public void testEquals_differentRawClass_returnsFalse()
    {
        SimpleType t1 = SimpleType.constructUnsafe(String.class);
        SimpleType t2 = SimpleType.constructUnsafe(Integer.class);
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testEquals_sameRawClassSameBindings_returnsTrue()
    {
        SimpleType t1 = SimpleType.constructUnsafe(String.class);
        SimpleType t2 = SimpleType.constructUnsafe(String.class);
        assertTrue(t1.equals(t2));
    }
}
