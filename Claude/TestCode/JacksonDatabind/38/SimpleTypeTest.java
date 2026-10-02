package com.fasterxml.jackson.databind.type;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JavaType;

import java.util.*;

@SuppressWarnings("deprecation")
public class SimpleTypeTest
{
    // Helper generic class used to obtain a SimpleType with non-empty bindings
    static class GenericHolder<T> { }

    private TypeFactory typeFactory;

    @Before
    public void setUp()
    {
        typeFactory = TypeFactory.defaultInstance();
    }

    // ---------------------------------------------------------------
    // constructUnsafe()
    // ---------------------------------------------------------------

    @Test
    public void testConstructUnsafe_normalClass_returnsSimpleType()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    // ---------------------------------------------------------------
    // construct()
    // ---------------------------------------------------------------

    @Test
    public void testConstruct_normalClass_returnsSimpleType()
    {
        SimpleType type = SimpleType.construct(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_mapClass_throwsException()
    {
        SimpleType.construct(HashMap.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_collectionClass_throwsException()
    {
        SimpleType.construct(ArrayList.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_arrayClass_throwsException()
    {
        SimpleType.construct(int[].class);
    }

    // ---------------------------------------------------------------
    // _narrow()
    // ---------------------------------------------------------------

    @Test
    public void testNarrow_sameClass_returnsSameInstance()
    {
        SimpleType type = SimpleType.construct(String.class);
        JavaType narrowed = type._narrow(String.class);
        assertSame(type, narrowed);
    }

    @Test
    public void testNarrow_differentClass_returnsNewInstance()
    {
        SimpleType type = SimpleType.construct(Number.class);
        JavaType narrowed = type._narrow(Integer.class);
        assertNotNull(narrowed);
        assertNotSame(type, narrowed);
        assertEquals(Integer.class, narrowed.getRawClass());
    }

    // ---------------------------------------------------------------
    // withContentType()
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentType_alwaysThrows()
    {
        SimpleType type = SimpleType.construct(String.class);
        JavaType content = SimpleType.construct(Integer.class);
        type.withContentType(content);
    }

    // ---------------------------------------------------------------
    // withTypeHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithTypeHandler_differentHandler_returnsNewInstance()
    {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = new Object();
        SimpleType withHandler = type.withTypeHandler(handler);
        assertNotSame(type, withHandler);
        assertEquals(handler, withHandler.getTypeHandler());
    }

    @Test
    public void testWithTypeHandler_sameHandler_returnsSameInstance()
    {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = new Object();
        SimpleType withHandler = type.withTypeHandler(handler);
        SimpleType same = withHandler.withTypeHandler(handler);
        assertSame(withHandler, same);
    }

    // ---------------------------------------------------------------
    // withContentTypeHandler()
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandler_alwaysThrows()
    {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentTypeHandler(new Object());
    }

    // ---------------------------------------------------------------
    // withValueHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithValueHandler_sameHandler_returnsSameInstance()
    {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType same = type.withValueHandler(type.getValueHandler());
        assertSame(type, same);
    }

    @Test
    public void testWithValueHandler_differentHandler_returnsNewInstance()
    {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = new Object();
        SimpleType withHandler = type.withValueHandler(handler);
        assertNotNull(withHandler);
        assertNotSame(type, withHandler);
        assertEquals(handler, withHandler.getValueHandler());
    }

    // ---------------------------------------------------------------
    // withContentValueHandler()
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandler_alwaysThrows()
    {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentValueHandler(new Object());
    }

    // ---------------------------------------------------------------
    // withStaticTyping()
    // ---------------------------------------------------------------

    @Test
    public void testWithStaticTyping_notStatic_returnsNewInstance()
    {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType staticType = type.withStaticTyping();
        assertNotSame(type, staticType);
        assertNotNull(staticType);
    }

    @Test
    public void testWithStaticTyping_alreadyStatic_returnsSameInstance()
    {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType staticType = type.withStaticTyping();
        SimpleType staticType2 = staticType.withStaticTyping();
        assertSame(staticType, staticType2);
    }

    // ---------------------------------------------------------------
    // refine()
    // ---------------------------------------------------------------

    @Test
    public void testRefine_alwaysReturnsNull()
    {
        SimpleType type = SimpleType.construct(String.class);
        JavaType result = type.refine(String.class, TypeBindings.emptyBindings(), null, null);
        assertNull(result);
    }

    // ---------------------------------------------------------------
    // buildCanonicalName()
    // ---------------------------------------------------------------

    @Test
    public void testBuildCanonicalName_noBindings_returnsClassName()
    {
        SimpleType type = SimpleType.construct(String.class);
        String canonical = type.buildCanonicalName();
        assertEquals(String.class.getName(), canonical);
    }

    @Test
    public void testBuildCanonicalName_withBindings_includesGenericParams()
    {
        JavaType type = typeFactory.constructParametricType(GenericHolder.class, String.class);
        assertTrue(type instanceof SimpleType);
        SimpleType simpleType = (SimpleType) type;
        String canonical = simpleType.buildCanonicalName();
        assertTrue(canonical.contains(GenericHolder.class.getName()));
        assertTrue(canonical.contains("<"));
        assertTrue(canonical.contains(String.class.getName()));
    }

    // ---------------------------------------------------------------
    // isContainerType()
    // ---------------------------------------------------------------

    @Test
    public void testIsContainerType_returnsFalse()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.isContainerType());
    }

    // ---------------------------------------------------------------
    // getErasedSignature()
    // ---------------------------------------------------------------

    @Test
    public void testGetErasedSignature_returnsNonEmptySignature()
    {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    // ---------------------------------------------------------------
    // getGenericSignature()
    // ---------------------------------------------------------------

    @Test
    public void testGetGenericSignature_noBindings_returnsSignature()
    {
        SimpleType type = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        assertNotNull(result);
        assertTrue(result.toString().endsWith(";"));
    }

    @Test
    public void testGetGenericSignature_withBindings_returnsSignatureWithGenerics()
    {
        JavaType type = typeFactory.constructParametricType(GenericHolder.class, String.class);
        assertTrue(type instanceof SimpleType);
        SimpleType simpleType = (SimpleType) type;
        StringBuilder sb = new StringBuilder();
        StringBuilder result = simpleType.getGenericSignature(sb);
        assertNotNull(result);
        assertTrue(result.toString().contains("<"));
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_returnsExpectedFormat()
    {
        SimpleType type = SimpleType.construct(String.class);
        String str = type.toString();
        assertTrue(str.startsWith("[simple type, class"));
        assertTrue(str.endsWith("]"));
        assertTrue(str.contains(String.class.getName()));
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance_returnsTrue()
    {
        SimpleType type = SimpleType.construct(String.class);
        assertTrue(type.equals(type));
    }

    @Test
    public void testEquals_null_returnsFalse()
    {
        SimpleType type = SimpleType.construct(String.class);
        assertFalse(type.equals(null));
    }

    @Test
    public void testEquals_differentClassType_returnsFalse()
    {
        SimpleType type = SimpleType.construct(String.class);
        assertFalse(type.equals("not a SimpleType"));
    }

    @Test
    public void testEquals_differentRawClass_returnsFalse()
    {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(Number.class);
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEquals_sameRawClassSameBindings_returnsTrue()
    {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(String.class);
        assertTrue(type1.equals(type2));
    }

    @Test
    public void testEquals_differentBindings_returnsFalse()
    {
        JavaType type1 = typeFactory.constructParametricType(GenericHolder.class, String.class);
        JavaType type2 = typeFactory.constructParametricType(GenericHolder.class, Integer.class);
        assertFalse(type1.equals(type2));
    }
}
