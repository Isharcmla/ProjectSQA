package com.fasterxml.jackson.databind.type;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JavaType;

@SuppressWarnings("deprecation")
public class MapLikeTypeTest {

    private TypeFactory typeFactory;
    private JavaType keyType;
    private JavaType valueType;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        keyType = typeFactory.constructType(String.class);
        valueType = typeFactory.constructType(Integer.class);
    }

    private MapLikeType buildType() {
        return MapLikeType.construct(Map.class, keyType, valueType);
    }

    // ---------------------------------------------------------------
    // construct()
    // ---------------------------------------------------------------

    @Test
    public void testConstruct_normalInput_returnsValidType() {
        MapLikeType type = buildType();
        assertNotNull(type);
        assertEquals(keyType, type.getKeyType());
        assertEquals(valueType, type.getContentType());
        assertTrue(type.isContainerType());
        assertTrue(type.isMapLikeType());
        assertTrue(type.isTrueMapType());
    }

    @Test
    public void testConstruct_rawTypeWithTwoTypeParams_usesCreatedBindings() {
        MapLikeType type = MapLikeType.construct(HashMap.class, keyType, valueType);
        assertNotNull(type);
        assertTrue(type.isTrueMapType());
    }

    @Test
    public void testConstruct_rawTypeWithOneTypeParam_usesEmptyBindings() {
        MapLikeType type = MapLikeType.construct(List.class, keyType, valueType);
        assertNotNull(type);
    }

    @Test
    public void testConstruct_rawTypeWithNoTypeParams_usesEmptyBindings() {
        MapLikeType type = MapLikeType.construct(Object.class, keyType, valueType);
        assertNotNull(type);
    }

    // ---------------------------------------------------------------
    // isTrueMapType()
    // ---------------------------------------------------------------

    @Test
    public void testIsTrueMapType_mapSubclass_returnsTrue() {
        MapLikeType type = MapLikeType.construct(HashMap.class, keyType, valueType);
        assertTrue(type.isTrueMapType());
    }

    @Test
    public void testIsTrueMapType_nonMapClass_returnsFalse() {
        MapLikeType type = MapLikeType.construct(Object.class, keyType, valueType);
        assertFalse(type.isTrueMapType());
    }

    // ---------------------------------------------------------------
    // upgradeFrom()
    // ---------------------------------------------------------------

    @Test
    public void testUpgradeFrom_validTypeBase_returnsMapLikeType() {
        JavaType baseType = typeFactory.constructType(Object.class);
        MapLikeType upgraded = MapLikeType.upgradeFrom(baseType, keyType, valueType);
        assertNotNull(upgraded);
        assertEquals(keyType, upgraded.getKeyType());
        assertEquals(valueType, upgraded.getContentType());
    }

    @Test(expected = NullPointerException.class)
    public void testUpgradeFrom_nullBaseType_throwsNullPointerException() {
        MapLikeType.upgradeFrom(null, keyType, valueType);
    }

    // ---------------------------------------------------------------
    // _narrow() (deprecated, protected - accessible in same package)
    // ---------------------------------------------------------------

    @Test
    public void testNarrow_deprecatedMethod_returnsNewInstance() {
        MapLikeType type = buildType();
        JavaType narrowed = type._narrow(HashMap.class);
        assertNotNull(narrowed);
        assertTrue(narrowed instanceof MapLikeType);
        assertEquals(HashMap.class, narrowed.getRawClass());
    }

    // ---------------------------------------------------------------
    // withKeyType()
    // ---------------------------------------------------------------

    @Test
    public void testWithKeyType_differentType_returnsNewInstance() {
        MapLikeType type = buildType();
        JavaType newKeyType = typeFactory.constructType(Long.class);
        MapLikeType result = type.withKeyType(newKeyType);
        assertNotSame(type, result);
        assertEquals(newKeyType, result.getKeyType());
    }

    @Test
    public void testWithKeyType_sameType_returnsSameInstance() {
        MapLikeType type = buildType();
        MapLikeType result = type.withKeyType(type.getKeyType());
        assertSame(type, result);
    }

    // ---------------------------------------------------------------
    // withContentType()
    // ---------------------------------------------------------------

    @Test
    public void testWithContentType_differentType_returnsNewInstance() {
        MapLikeType type = buildType();
        JavaType newValueType = typeFactory.constructType(Double.class);
        JavaType result = type.withContentType(newValueType);
        assertNotSame(type, result);
        assertEquals(newValueType, result.getContentType());
    }

    @Test
    public void testWithContentType_sameType_returnsSameInstance() {
        MapLikeType type = buildType();
        JavaType result = type.withContentType(type.getContentType());
        assertSame(type, result);
    }

    // ---------------------------------------------------------------
    // withTypeHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithTypeHandler_setsHandler_returnsNewInstance() {
        MapLikeType type = buildType();
        Object handler = new Object();
        MapLikeType result = type.withTypeHandler(handler);
        assertNotNull(result);
        assertEquals(handler, result.getTypeHandler());
    }

    // ---------------------------------------------------------------
    // withContentTypeHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithContentTypeHandler_setsHandlerOnValueType() {
        MapLikeType type = buildType();
        Object handler = new Object();
        MapLikeType result = type.withContentTypeHandler(handler);
        assertEquals(handler, result.getContentTypeHandler());
    }

    // ---------------------------------------------------------------
    // withValueHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithValueHandler_setsHandler_returnsNewInstance() {
        MapLikeType type = buildType();
        Object handler = new Object();
        MapLikeType result = type.withValueHandler(handler);
        assertNotNull(result);
        assertEquals(handler, result.getValueHandler());
    }

    // ---------------------------------------------------------------
    // withContentValueHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithContentValueHandler_setsHandlerOnValueType() {
        MapLikeType type = buildType();
        Object handler = new Object();
        MapLikeType result = type.withContentValueHandler(handler);
        assertEquals(handler, result.getContentValueHandler());
    }

    // ---------------------------------------------------------------
    // withStaticTyping()
    // ---------------------------------------------------------------

    @Test
    public void testWithStaticTyping_notStaticInitially_returnsNewInstance() {
        MapLikeType type = buildType();
        MapLikeType result = type.withStaticTyping();
        assertNotSame(type, result);
    }

    @Test
    public void testWithStaticTyping_alreadyStatic_returnsSameInstance() {
        MapLikeType type = buildType().withStaticTyping();
        MapLikeType result = type.withStaticTyping();
        assertSame(type, result);
    }

    // ---------------------------------------------------------------
    // refine()
    // ---------------------------------------------------------------

    @Test
    public void testRefine_returnsNewMapLikeTypeWithGivenRawType() {
        MapLikeType type = buildType();
        JavaType refined = type.refine(HashMap.class, type._bindings, type._superClass,
                type._superInterfaces);
        assertNotNull(refined);
        assertTrue(refined instanceof MapLikeType);
        assertEquals(HashMap.class, refined.getRawClass());
    }

    // ---------------------------------------------------------------
    // buildCanonicalName() via toCanonical()
    // ---------------------------------------------------------------

    @Test
    public void testBuildCanonicalName_viaToCanonical_returnsExpectedFormat() {
        MapLikeType type = buildType();
        String canonical = type.toCanonical();
        assertNotNull(canonical);
        assertTrue(canonical.contains("java.util.Map"));
        assertTrue(canonical.contains("java.lang.String"));
        assertTrue(canonical.contains("java.lang.Integer"));
    }

    // ---------------------------------------------------------------
    // isContainerType() / isMapLikeType()
    // ---------------------------------------------------------------

    @Test
    public void testIsContainerType_returnsTrue() {
        MapLikeType type = buildType();
        assertTrue(type.isContainerType());
    }

    @Test
    public void testIsMapLikeType_returnsTrue() {
        MapLikeType type = buildType();
        assertTrue(type.isMapLikeType());
    }

    // ---------------------------------------------------------------
    // getKeyType() / getContentType()
    // ---------------------------------------------------------------

    @Test
    public void testGetKeyType_returnsCorrectKeyType() {
        MapLikeType type = buildType();
        assertEquals(keyType, type.getKeyType());
    }

    @Test
    public void testGetContentType_returnsCorrectValueType() {
        MapLikeType type = buildType();
        assertEquals(valueType, type.getContentType());
    }

    // ---------------------------------------------------------------
    // getContentValueHandler() / getContentTypeHandler()
    // ---------------------------------------------------------------

    @Test
    public void testGetContentValueHandler_noHandlerSet_returnsNull() {
        MapLikeType type = buildType();
        assertNull(type.getContentValueHandler());
    }

    @Test
    public void testGetContentTypeHandler_noHandlerSet_returnsNull() {
        MapLikeType type = buildType();
        assertNull(type.getContentTypeHandler());
    }

    // ---------------------------------------------------------------
    // hasHandlers()
    // ---------------------------------------------------------------

    @Test
    public void testHasHandlers_noHandlersSet_returnsFalse() {
        MapLikeType type = buildType();
        assertFalse(type.hasHandlers());
    }

    @Test
    public void testHasHandlers_withValueHandlerSet_returnsTrue() {
        MapLikeType type = buildType().withValueHandler(new Object());
        assertTrue(type.hasHandlers());
    }

    @Test
    public void testHasHandlers_withKeyValueHandlerSet_returnsTrue() {
        MapLikeType type = buildType().withKeyValueHandler(new Object());
        assertTrue(type.hasHandlers());
    }

    // ---------------------------------------------------------------
    // getErasedSignature() / getGenericSignature()
    // ---------------------------------------------------------------

    @Test
    public void testGetErasedSignature_returnsNonEmptySignature() {
        MapLikeType type = buildType();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testGetGenericSignature_returnsSignatureEndingWithSemicolon() {
        MapLikeType type = buildType();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        assertNotNull(result);
        assertTrue(result.toString().endsWith(">;"));
    }

    // ---------------------------------------------------------------
    // withKeyTypeHandler() / withKeyValueHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithKeyTypeHandler_setsHandlerOnKeyType() {
        MapLikeType type = buildType();
        Object handler = new Object();
        MapLikeType result = type.withKeyTypeHandler(handler);
        assertEquals(handler, result.getKeyType().getTypeHandler());
    }

    @Test
    public void testWithKeyValueHandler_setsHandlerOnKeyType() {
        MapLikeType type = buildType();
        Object handler = new Object();
        MapLikeType result = type.withKeyValueHandler(handler);
        assertEquals(handler, result.getKeyType().getValueHandler());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_returnsFormattedString() {
        MapLikeType type = buildType();
        String str = type.toString();
        assertNotNull(str);
        assertTrue(str.contains("map-like type"));
        assertTrue(str.contains("java.util.Map"));
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        MapLikeType type = buildType();
        assertTrue(type.equals(type));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        MapLikeType type = buildType();
        assertFalse(type.equals(null));
    }

    @Test
    public void testEquals_differentClassType_returnsFalse() {
        MapLikeType type = buildType();
        assertFalse(type.equals("not a MapLikeType"));
    }

    @Test
    public void testEquals_sameKeyValueTypesAndRawClass_returnsTrue() {
        MapLikeType type1 = buildType();
        MapLikeType type2 = buildType();
        assertTrue(type1.equals(type2));
    }

    @Test
    public void testEquals_differentKeyType_returnsFalse() {
        MapLikeType type1 = buildType();
        MapLikeType type2 = MapLikeType.construct(Map.class,
                typeFactory.constructType(Long.class), valueType);
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEquals_differentValueType_returnsFalse() {
        MapLikeType type1 = buildType();
        MapLikeType type2 = MapLikeType.construct(Map.class, keyType,
                typeFactory.constructType(Double.class));
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEquals_differentRawClass_returnsFalse() {
        MapLikeType type1 = buildType();
        MapLikeType type2 = MapLikeType.construct(HashMap.class, keyType, valueType);
        assertFalse(type1.equals(type2));
    }
}
