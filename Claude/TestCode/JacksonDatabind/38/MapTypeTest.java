import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JavaType;

public class MapTypeTest {

    private TypeFactory typeFactory;
    private MapType baseType;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        baseType = typeFactory.constructMapType(HashMap.class, String.class, Integer.class);
    }

    // ---------- construct(...) - modern factory method ----------

    @Test
    public void testConstruct_normalInput_returnsMapType() {
        assertNotNull(baseType);
        assertEquals(HashMap.class, baseType.getRawClass());
        assertEquals(String.class, baseType.getKeyType().getRawClass());
        assertEquals(Integer.class, baseType.getContentType().getRawClass());
    }

    @Test
    public void testConstruct_withBindingsAndSuperClass_returnsMapType() {
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = typeFactory.constructType(Object.class);
        JavaType[] superInterfaces = new JavaType[0];
        JavaType keyType = typeFactory.constructType(String.class);
        JavaType valueType = typeFactory.constructType(Integer.class);

        MapType mt = MapType.construct(HashMap.class, bindings, superClass, superInterfaces,
                keyType, valueType);

        assertNotNull(mt);
        assertEquals(HashMap.class, mt.getRawClass());
        assertSame(keyType, mt.getKeyType());
        assertSame(valueType, mt.getContentType());
    }

    // ---------- deprecated construct(...) ----------

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructDeprecated_normalInput_returnsMapType() {
        JavaType keyType = typeFactory.constructType(String.class);
        JavaType valueType = typeFactory.constructType(Integer.class);

        MapType mt = MapType.construct(HashMap.class, keyType, valueType);

        assertNotNull(mt);
        assertEquals(HashMap.class, mt.getRawClass());
    }

    // ---------- _narrow(...) (deprecated, protected, same package) ----------

    @SuppressWarnings("deprecation")
    @Test
    public void testNarrow_deprecated_returnsNewMapTypeWithSubclass() {
        JavaType narrowed = baseType._narrow(HashMap.class);
        assertNotNull(narrowed);
        assertTrue(narrowed instanceof MapType);
        assertEquals(HashMap.class, narrowed.getRawClass());
    }

    // ---------- withTypeHandler ----------

    @Test
    public void testWithTypeHandler_normalHandler_setsHandler() {
        Object handler = new Object();
        MapType result = baseType.withTypeHandler(handler);

        assertSame(handler, result.getTypeHandler());
        assertNotSame(baseType, result);
    }

    @Test
    public void testWithTypeHandler_nullHandler_setsNullHandler() {
        MapType result = baseType.withTypeHandler(null);
        assertNull(result.getTypeHandler());
    }

    // ---------- withContentTypeHandler ----------

    @Test
    public void testWithContentTypeHandler_normalHandler_setsContentTypeHandler() {
        Object handler = new Object();
        MapType result = baseType.withContentTypeHandler(handler);

        assertSame(handler, result.getContentType().getTypeHandler());
    }

    @Test(expected = NullPointerException.class)
    public void testWithContentTypeHandler_nullContentType_throwsNPE() {
        MapType nullContentType = (MapType) baseType.withContentType(null);
        // _valueType is now null, calling withTypeHandler on it should NPE
        nullContentType.withContentTypeHandler(new Object());
    }

    // ---------- withValueHandler ----------

    @Test
    public void testWithValueHandler_normalHandler_setsValueHandler() {
        Object handler = new Object();
        MapType result = baseType.withValueHandler(handler);

        assertSame(handler, result.getValueHandler());
    }

    @Test
    public void testWithValueHandler_nullHandler_setsNullValueHandler() {
        MapType result = baseType.withValueHandler(null);
        assertNull(result.getValueHandler());
    }

    // ---------- withContentValueHandler ----------

    @Test
    public void testWithContentValueHandler_normalHandler_setsContentValueHandler() {
        Object handler = new Object();
        MapType result = baseType.withContentValueHandler(handler);

        assertSame(handler, result.getContentType().getValueHandler());
    }

    // ---------- withStaticTyping ----------

    @Test
    public void testWithStaticTyping_notStatic_returnsNewStaticInstance() {
        MapType staticType = baseType.withStaticTyping();
        assertNotSame(baseType, staticType);
        assertNotNull(staticType);
    }

    @Test
    public void testWithStaticTyping_alreadyStatic_returnsSameInstance() {
        MapType staticType = baseType.withStaticTyping();
        MapType staticType2 = staticType.withStaticTyping();
        assertSame(staticType, staticType2);
    }

    // ---------- withContentType ----------

    @Test
    public void testWithContentType_differentType_returnsNewInstance() {
        JavaType newContentType = typeFactory.constructType(Long.class);
        JavaType result = baseType.withContentType(newContentType);

        assertNotSame(baseType, result);
        assertSame(newContentType, result.getContentType());
    }

    @Test
    public void testWithContentType_sameType_returnsSameInstance() {
        JavaType sameContentType = baseType.getContentType();
        JavaType result = baseType.withContentType(sameContentType);

        assertSame(baseType, result);
    }

    @Test
    public void testWithContentType_nullType_returnsMapTypeWithNullContent() {
        JavaType result = baseType.withContentType(null);
        assertNull(result.getContentType());
    }

    // ---------- withKeyType ----------

    @Test
    public void testWithKeyType_differentType_returnsNewInstance() {
        JavaType newKeyType = typeFactory.constructType(Long.class);
        MapType result = baseType.withKeyType(newKeyType);

        assertNotSame(baseType, result);
        assertSame(newKeyType, result.getKeyType());
    }

    @Test
    public void testWithKeyType_sameType_returnsSameInstance() {
        JavaType sameKeyType = baseType.getKeyType();
        MapType result = baseType.withKeyType(sameKeyType);

        assertSame(baseType, result);
    }

    @Test
    public void testWithKeyType_nullType_returnsMapTypeWithNullKey() {
        MapType result = baseType.withKeyType(null);
        assertNull(result.getKeyType());
    }

    // ---------- refine ----------

    @Test
    public void testRefine_normalInput_returnsMapType() {
        JavaType superClass = typeFactory.constructType(Object.class);
        JavaType[] superInterfaces = new JavaType[0];

        JavaType refined = baseType.refine(HashMap.class, baseType.getBindings(),
                superClass, superInterfaces);

        assertNotNull(refined);
        assertTrue(refined instanceof MapType);
        assertEquals(HashMap.class, refined.getRawClass());
    }

    // ---------- withKeyTypeHandler ----------

    @Test
    public void testWithKeyTypeHandler_normalHandler_setsKeyTypeHandler() {
        Object handler = new Object();
        MapType result = baseType.withKeyTypeHandler(handler);

        assertSame(handler, result.getKeyType().getTypeHandler());
    }

    @Test(expected = NullPointerException.class)
    public void testWithKeyTypeHandler_nullKeyType_throwsNPE() {
        MapType nullKeyType = baseType.withKeyType(null);
        // _keyType is now null, calling withTypeHandler on it should NPE
        nullKeyType.withKeyTypeHandler(new Object());
    }

    // ---------- withKeyValueHandler ----------

    @Test
    public void testWithKeyValueHandler_normalHandler_setsKeyValueHandler() {
        Object handler = new Object();
        MapType result = baseType.withKeyValueHandler(handler);

        assertSame(handler, result.getKeyType().getValueHandler());
    }

    @Test(expected = NullPointerException.class)
    public void testWithKeyValueHandler_nullKeyType_throwsNPE() {
        MapType nullKeyType = baseType.withKeyType(null);
        nullKeyType.withKeyValueHandler(new Object());
    }

    // ---------- toString ----------

    @Test
    public void testToString_normalInput_returnsFormattedString() {
        String result = baseType.toString();

        assertNotNull(result);
        assertTrue(result.contains("map type"));
        assertTrue(result.contains(HashMap.class.getName()));
    }

    // ---------- generic sanity check using raw Map interface ----------

    @Test
    public void testConstructMapType_withMapInterface_typicalUsage() {
        MapType mt = typeFactory.constructMapType(Map.class, String.class, String.class);

        assertNotNull(mt);
        assertEquals(Map.class, mt.getRawClass());
        assertEquals(String.class, mt.getKeyType().getRawClass());
        assertEquals(String.class, mt.getContentType().getRawClass());
    }
}
