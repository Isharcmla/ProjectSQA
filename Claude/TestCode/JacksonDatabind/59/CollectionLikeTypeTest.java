package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class CollectionLikeTypeTest {

    private JavaType elementType;
    private JavaType superClassType;
    private JavaType[] superInterfaces;
    private TypeBindings bindings;
    private CollectionLikeType baseType;

    @Before
    public void setUp() {
        elementType = TypeFactory.defaultInstance().constructType(String.class);
        superClassType = TypeFactory.defaultInstance().constructType(Object.class);
        superInterfaces = new JavaType[0];
        bindings = TypeBindings.emptyBindings();
        baseType = CollectionLikeType.construct(List.class, bindings, superClassType, superInterfaces, elementType);
    }

    // ---------------- construct (new factory) ----------------

    @Test
    public void testConstruct_normalInput_createsInstance() {
        CollectionLikeType type = CollectionLikeType.construct(List.class, bindings, superClassType, superInterfaces, elementType);
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertSame(elementType, type.getContentType());
    }

    @Test(expected = NullPointerException.class)
    public void testConstruct_nullElementType_throwsNullPointerException() {
        CollectionLikeType.construct(List.class, bindings, superClassType, superInterfaces, null);
    }

    // ---------------- construct (deprecated factory) ----------------

    @Test
    public void testConstructDeprecated_withSingleTypeParamRawType_createsInstance() {
        // ArrayList<E> has exactly 1 type parameter -> bindings.create branch
        CollectionLikeType type = CollectionLikeType.construct(ArrayList.class, elementType);
        assertNotNull(type);
        assertEquals(ArrayList.class, type.getRawClass());
        assertSame(elementType, type.getContentType());
    }

    @Test
    public void testConstructDeprecated_withNonSingleTypeParamRawType_createsInstance() {
        // HashMap<K,V> has 2 type parameters -> emptyBindings branch
        CollectionLikeType type = CollectionLikeType.construct(HashMap.class, elementType);
        assertNotNull(type);
        assertEquals(HashMap.class, type.getRawClass());
        assertSame(elementType, type.getContentType());
    }

    // ---------------- upgradeFrom ----------------

    @Test
    public void testUpgradeFrom_withTypeBaseInstance_createsNewCollectionLikeType() {
        JavaType newElementType = TypeFactory.defaultInstance().constructType(Integer.class);
        CollectionLikeType upgraded = CollectionLikeType.upgradeFrom(baseType, newElementType);
        assertNotNull(upgraded);
        assertSame(newElementType, upgraded.getContentType());
    }

    // Note: Testing the exception branch of upgradeFrom (baseType not instanceof TypeBase)
    // is not feasible using only the public API, since all concrete JavaType implementations
    // provided by the library extend TypeBase. Creating a non-TypeBase JavaType would require
    // either mocking (disallowed) or guessing an undocumented API, so this branch is omitted.

    // ---------------- _narrow (protected, deprecated) ----------------

    @Test
    public void testNarrow_returnsNewInstanceWithGivenSubclass() {
        JavaType narrowed = baseType._narrow(ArrayList.class);
        assertNotNull(narrowed);
        assertTrue(narrowed instanceof CollectionLikeType);
        assertEquals(ArrayList.class, narrowed.getRawClass());
    }

    // ---------------- withContentType ----------------

    @Test
    public void testWithContentType_sameType_returnsSameInstance() {
        JavaType result = baseType.withContentType(elementType);
        assertSame(baseType, result);
    }

    @Test
    public void testWithContentType_differentType_returnsNewInstance() {
        JavaType newElementType = TypeFactory.defaultInstance().constructType(Integer.class);
        JavaType result = baseType.withContentType(newElementType);
        assertNotSame(baseType, result);
        assertSame(newElementType, result.getContentType());
    }

    // ---------------- withTypeHandler ----------------

    @Test
    public void testWithTypeHandler_setsHandler() {
        Object handler = new Object();
        CollectionLikeType result = baseType.withTypeHandler(handler);
        assertNotNull(result);
        assertSame(handler, result.getTypeHandler());
    }

    // ---------------- withContentTypeHandler ----------------

    @Test
    public void testWithContentTypeHandler_setsElementTypeHandler() {
        Object handler = new Object();
        CollectionLikeType result = baseType.withContentTypeHandler(handler);
        assertNotNull(result);
        assertSame(handler, result.getContentTypeHandler());
    }

    // ---------------- withValueHandler ----------------

    @Test
    public void testWithValueHandler_setsHandler() {
        Object handler = new Object();
        CollectionLikeType result = baseType.withValueHandler(handler);
        assertNotNull(result);
        assertSame(handler, result.getValueHandler());
    }

    // ---------------- withContentValueHandler ----------------

    @Test
    public void testWithContentValueHandler_setsElementValueHandler() {
        Object handler = new Object();
        CollectionLikeType result = baseType.withContentValueHandler(handler);
        assertNotNull(result);
        assertSame(handler, result.getContentValueHandler());
    }

    // ---------------- withStaticTyping ----------------

    @Test
    public void testWithStaticTyping_notStatic_returnsNewInstanceMarkedStatic() {
        assertFalse(baseType.isStatic());
        CollectionLikeType result = baseType.withStaticTyping();
        assertNotSame(baseType, result);
        assertTrue(result.isStatic());
    }

    @Test
    public void testWithStaticTyping_alreadyStatic_returnsSameInstance() {
        CollectionLikeType staticType = baseType.withStaticTyping();
        CollectionLikeType result = staticType.withStaticTyping();
        assertSame(staticType, result);
    }

    // ---------------- refine ----------------

    @Test
    public void testRefine_returnsNewInstanceWithGivenRawTypeAndBindings() {
        JavaType result = baseType.refine(ArrayList.class, bindings, superClassType, superInterfaces);
        assertNotNull(result);
        assertTrue(result instanceof CollectionLikeType);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    // ---------------- isContainerType / isCollectionLikeType ----------------

    @Test
    public void testIsContainerType_returnsTrue() {
        assertTrue(baseType.isContainerType());
    }

    @Test
    public void testIsCollectionLikeType_returnsTrue() {
        assertTrue(baseType.isCollectionLikeType());
    }

    // ---------------- getContentType ----------------

    @Test
    public void testGetContentType_returnsElementType() {
        assertSame(elementType, baseType.getContentType());
    }

    // ---------------- getContentValueHandler / getContentTypeHandler ----------------

    @Test
    public void testGetContentValueHandler_defaultNull() {
        assertNull(baseType.getContentValueHandler());
    }

    @Test
    public void testGetContentTypeHandler_defaultNull() {
        assertNull(baseType.getContentTypeHandler());
    }

    @Test
    public void testGetContentValueHandler_afterSet_returnsHandler() {
        Object handler = new Object();
        CollectionLikeType result = baseType.withContentValueHandler(handler);
        assertSame(handler, result.getContentValueHandler());
    }

    @Test
    public void testGetContentTypeHandler_afterSet_returnsHandler() {
        Object handler = new Object();
        CollectionLikeType result = baseType.withContentTypeHandler(handler);
        assertSame(handler, result.getContentTypeHandler());
    }

    // ---------------- hasHandlers ----------------

    @Test
    public void testHasHandlers_noHandlersSet_returnsFalse() {
        assertFalse(baseType.hasHandlers());
    }

    @Test
    public void testHasHandlers_valueHandlerSet_returnsTrue() {
        CollectionLikeType result = baseType.withValueHandler(new Object());
        assertTrue(result.hasHandlers());
    }

    @Test
    public void testHasHandlers_elementTypeHasHandler_returnsTrue() {
        CollectionLikeType result = baseType.withContentValueHandler(new Object());
        assertTrue(result.hasHandlers());
    }

    // ---------------- getErasedSignature ----------------

    @Test
    public void testGetErasedSignature_returnsSignature() {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = baseType.getErasedSignature(sb);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    // ---------------- getGenericSignature ----------------

    @Test
    public void testGetGenericSignature_returnsGenericSignature() {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = baseType.getGenericSignature(sb);
        assertNotNull(result);
        assertTrue(result.toString().contains("<"));
        assertTrue(result.toString().contains(">;"));
    }

    // ---------------- buildCanonicalName / toCanonical ----------------

    @Test
    public void testToCanonical_containsClassAndElementType() {
        String canonical = baseType.toCanonical();
        assertNotNull(canonical);
        assertTrue(canonical.contains(List.class.getName()));
        assertTrue(canonical.contains(String.class.getName()));
    }

    // ---------------- isTrueCollectionType ----------------

    @Test
    public void testIsTrueCollectionType_realCollectionClass_returnsTrue() {
        assertTrue(baseType.isTrueCollectionType());
    }

    @Test
    public void testIsTrueCollectionType_nonCollectionClass_returnsFalse() {
        CollectionLikeType nonCollectionType = CollectionLikeType.construct(String.class, bindings, superClassType, superInterfaces, elementType);
        assertFalse(nonCollectionType.isTrueCollectionType());
    }

    // ---------------- equals ----------------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(baseType.equals(baseType));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(baseType.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(baseType.equals("not a CollectionLikeType"));
    }

    @Test
    public void testEquals_sameClassAndElementType_returnsTrue() {
        CollectionLikeType other = CollectionLikeType.construct(List.class, bindings, superClassType, superInterfaces, elementType);
        assertTrue(baseType.equals(other));
    }

    @Test
    public void testEquals_differentElementType_returnsFalse() {
        JavaType otherElementType = TypeFactory.defaultInstance().constructType(Integer.class);
        CollectionLikeType other = CollectionLikeType.construct(List.class, bindings, superClassType, superInterfaces, otherElementType);
        assertFalse(baseType.equals(other));
    }

    @Test
    public void testEquals_differentRawClass_returnsFalse() {
        CollectionLikeType other = CollectionLikeType.construct(ArrayList.class, bindings, superClassType, superInterfaces, elementType);
        assertFalse(baseType.equals(other));
    }

    // ---------------- toString ----------------

    @Test
    public void testToString_containsClassNameAndElementType() {
        String result = baseType.toString();
        assertNotNull(result);
        assertTrue(result.contains("collection-like type"));
        assertTrue(result.contains(List.class.getName()));
    }
}
