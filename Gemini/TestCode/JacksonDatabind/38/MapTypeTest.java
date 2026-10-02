package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class MapTypeTest {

    private TypeFactory _typeFactory;
    private JavaType _keyType;
    private JavaType _valueType;
    private JavaType _superClass;
    private JavaType[] _superInterfaces;
    private TypeBindings _bindings;

    @Before
    public void setUp() {
        _typeFactory = TypeFactory.defaultInstance();
        _keyType = _typeFactory.constructType(String.class);
        _valueType = _typeFactory.constructType(Integer.class);
        _superClass = _typeFactory.constructType(Object.class);
        _superInterfaces = new JavaType[0];
        _bindings = TypeBindings.create(Map.class, new JavaType[]{_keyType, _valueType});
    }

    @Test
    public void testConstruct_withFullParameters_createsValidInstance() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);

        assertNotNull(mapType);
        assertEquals(Map.class, mapType.getRawClass());
        assertEquals(_keyType, mapType.getKeyType());
        assertEquals(_valueType, mapType.getContentType());
        assertEquals(_bindings, mapType.getBindings());
        assertEquals(_superClass, mapType.getSuperClass());
        assertFalse(mapType.useStaticTyping());
        assertNull(mapType.getValueHandler());
        assertNull(mapType.getTypeHandler());
    }

    @Test
    public void testConstruct_withDeprecatedMethod_createsValidInstance() {
        MapType mapType = MapType.construct(HashMap.class, _keyType, _valueType);

        assertNotNull(mapType);
        assertEquals(HashMap.class, mapType.getRawClass());
        assertEquals(_keyType, mapType.getKeyType());
        assertEquals(_valueType, mapType.getContentType());
        assertFalse(mapType.useStaticTyping());
    }

    @Test
    public void testProtectedConstructor_withBaseType_createsValidInstance() {
        MapType base = MapType.construct(HashMap.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        JavaType newKeyType = _typeFactory.constructType(Long.class);
        JavaType newValueType = _typeFactory.constructType(Double.class);

        MapType customType = new MapType(base, newKeyType, newValueType);

        assertEquals(HashMap.class, customType.getRawClass());
        assertEquals(newKeyType, customType.getKeyType());
        assertEquals(newValueType, customType.getContentType());
    }

    @Test
    public void testNarrow_returnsNarrowedMapType() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        JavaType narrowed = mapType._narrow(HashMap.class);

        assertTrue(narrowed instanceof MapType);
        assertEquals(HashMap.class, narrowed.getRawClass());
        assertEquals(_keyType, narrowed.getKeyType());
        assertEquals(_valueType, narrowed.getContentType());
    }

    @Test
    public void testWithTypeHandler_setsAndClearsHandler() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        String handler = "customTypeHandler";

        MapType withHandler = mapType.withTypeHandler(handler);
        assertNotSame(mapType, withHandler);
        assertEquals(handler, withHandler.getTypeHandler());

        MapType clearedHandler = withHandler.withTypeHandler(null);
        assertNotSame(withHandler, clearedHandler);
        assertNull(clearedHandler.getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler_setsContentTypeHandler() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        Object contentHandler = "contentTypeHandler";

        MapType withContentHandler = mapType.withContentTypeHandler(contentHandler);
        assertNotSame(mapType, withContentHandler);
        assertEquals(contentHandler, withContentHandler.getContentType().getTypeHandler());

        MapType cleared = withContentHandler.withContentTypeHandler(null);
        assertNotSame(withContentHandler, cleared);
        assertNull(cleared.getContentType().getTypeHandler());
    }

    @Test
    public void testWithValueHandler_setsAndClearsValueHandler() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        String valueHandler = "customValueHandler";

        MapType withHandler = mapType.withValueHandler(valueHandler);
        assertNotSame(mapType, withHandler);
        assertEquals(valueHandler, withHandler.getValueHandler());

        MapType cleared = withHandler.withValueHandler(null);
        assertNotSame(withHandler, cleared);
        assertNull(cleared.getValueHandler());
    }

    @Test
    public void testWithContentValueHandler_setsContentValueHandler() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        Object contentValueHandler = "contentValHandler";

        MapType withContentVal = mapType.withContentValueHandler(contentValueHandler);
        assertNotSame(mapType, withContentVal);
        assertEquals(contentValueHandler, withContentVal.getContentType().getValueHandler());

        MapType cleared = withContentVal.withContentValueHandler(null);
        assertNotSame(withContentVal, cleared);
        assertNull(cleared.getContentType().getValueHandler());
    }

    @Test
    public void testWithStaticTyping_whenNotStatic_returnsNewInstanceWithStaticTyping() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        assertFalse(mapType.useStaticTyping());

        MapType staticType = mapType.withStaticTyping();
        assertNotSame(mapType, staticType);
        assertTrue(staticType.useStaticTyping());
        assertTrue(staticType.getKeyType().useStaticTyping());
        assertTrue(staticType.getContentType().useStaticTyping());
    }

    @Test
    public void testWithStaticTyping_whenAlreadyStatic_returnsSameInstance() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        MapType staticType = mapType.withStaticTyping();
        MapType staticAgain = staticType.withStaticTyping();

        assertSame(staticType, staticAgain);
    }

    @Test
    public void testWithContentType_whenSameInstance_returnsSameInstance() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        JavaType sameTypeResult = mapType.withContentType(_valueType);

        assertSame(mapType, sameTypeResult);
    }

    @Test
    public void testWithContentType_whenDifferentType_returnsNewMapType() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        JavaType newContentType = _typeFactory.constructType(Double.class);

        JavaType result = mapType.withContentType(newContentType);
        assertNotSame(mapType, result);
        assertTrue(result instanceof MapType);
        assertEquals(newContentType, result.getContentType());
        assertEquals(_keyType, result.getKeyType());
    }

    @Test
    public void testWithKeyType_whenSameInstance_returnsSameInstance() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        MapType result = mapType.withKeyType(_keyType);

        assertSame(mapType, result);
    }

    @Test
    public void testWithKeyType_whenDifferentType_returnsNewMapType() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        JavaType newKeyType = _typeFactory.constructType(Long.class);

        MapType result = mapType.withKeyType(newKeyType);
        assertNotSame(mapType, result);
        assertEquals(newKeyType, result.getKeyType());
        assertEquals(_valueType, result.getContentType());
    }

    @Test
    public void testWithKeyTypeHandler_setsAndClearsKeyTypeHandler() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        Object keyTypeHandler = "keyTypeHandlerObj";

        MapType withKeyHandler = mapType.withKeyTypeHandler(keyTypeHandler);
        assertNotSame(mapType, withKeyHandler);
        assertEquals(keyTypeHandler, withKeyHandler.getKeyType().getTypeHandler());

        MapType cleared = withKeyHandler.withKeyTypeHandler(null);
        assertNotSame(withKeyHandler, cleared);
        assertNull(cleared.getKeyType().getTypeHandler());
    }

    @Test
    public void testWithKeyValueHandler_setsAndClearsKeyValueHandler() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        Object keyValueHandler = "keyValueHandlerObj";

        MapType withKeyVal = mapType.withKeyValueHandler(keyValueHandler);
        assertNotSame(mapType, withKeyVal);
        assertEquals(keyValueHandler, withKeyVal.getKeyType().getValueHandler());

        MapType cleared = withKeyVal.withKeyValueHandler(null);
        assertNotSame(withKeyVal, cleared);
        assertNull(cleared.getKeyType().getValueHandler());
    }

    @Test
    public void testRefine_updatesClassAndBindingsProperly() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType)
                .withValueHandler("valH")
                .withTypeHandler("typeH");

        TypeBindings newBindings = TypeBindings.create(TreeMap.class, new JavaType[]{_keyType, _valueType});
        JavaType newSuperClass = _typeFactory.constructType(Object.class);
        JavaType[] newSuperInterfaces = new JavaType[]{_typeFactory.constructType(Comparable.class)};

        JavaType refined = mapType.refine(TreeMap.class, newBindings, newSuperClass, newSuperInterfaces);

        assertTrue(refined instanceof MapType);
        assertEquals(TreeMap.class, refined.getRawClass());
        assertEquals(newBindings, refined.getBindings());
        assertEquals(newSuperClass, refined.getSuperClass());
        assertEquals(1, refined.getInterfaces().size());
        assertEquals(_keyType, refined.getKeyType());
        assertEquals(_valueType, refined.getContentType());
        assertEquals("valH", refined.getValueHandler());
        assertEquals("typeH", refined.getTypeHandler());
    }

    @Test
    public void testToString_formatsCorrectly() {
        MapType mapType = MapType.construct(Map.class, _bindings, _superClass, _superInterfaces, _keyType, _valueType);
        String str = mapType.toString();

        assertEquals("[map type; class java.util.Map, " + _keyType + " -> " + _valueType + "]", str);
    }

    @Test
    public void testEdgeCase_withNullSuperTypesAndEmptyBindings() {
        TypeBindings emptyBindings = TypeBindings.emptyBindings();
        MapType mapType = MapType.construct(Map.class, emptyBindings, null, null, _keyType, _valueType);

        assertNotNull(mapType);
        assertNull(mapType.getSuperClass());
        assertTrue(mapType.getInterfaces().isEmpty());
    }
}
