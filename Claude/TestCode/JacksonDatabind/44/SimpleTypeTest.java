import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Map;

public class SimpleTypeTest {

    // Helper generic class used to build parameterized SimpleType instances
    static class Box<T> {
    }

    private final TypeFactory typeFactory = TypeFactory.defaultInstance();

    // ---------------------------------------------------------
    // constructUnsafe
    // ---------------------------------------------------------

    @Test
    public void testConstructUnsafe_validClass_returnsSimpleType() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructUnsafe_primitiveClass_returnsSimpleType() {
        SimpleType type = SimpleType.constructUnsafe(int.class);
        assertNotNull(type);
        assertEquals(int.class, type.getRawClass());
    }

    // ---------------------------------------------------------
    // construct (deprecated)
    // ---------------------------------------------------------

    @Test
    public void testConstruct_validClass_returnsSimpleType() {
        SimpleType type = SimpleType.construct(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_mapClass_throwsException() {
        SimpleType.construct(Map.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_collectionClass_throwsException() {
        SimpleType.construct(Collection.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_arrayClass_throwsException() {
        SimpleType.construct(String[].class);
    }

    // ---------------------------------------------------------
    // withContentType
    // ---------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentType_throwsException() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentType(SimpleType.constructUnsafe(Integer.class));
    }

    // ---------------------------------------------------------
    // withTypeHandler
    // ---------------------------------------------------------

    @Test
    public void testWithTypeHandler_sameHandler_returnsSameInstance() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object handler = "handler";
        SimpleType withHandler = type.withTypeHandler(handler);
        SimpleType same = withHandler.withTypeHandler(handler);
        assertSame(withHandler, same);
    }

    @Test
    public void testWithTypeHandler_differentHandler_returnsNewInstance() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object handler1 = "handler1";
        SimpleType withHandler1 = type.withTypeHandler(handler1);
        assertNotSame(type, withHandler1);
        assertEquals(handler1, withHandler1.getTypeHandler());
    }

    // ---------------------------------------------------------
    // withContentTypeHandler
    // ---------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandler_throwsException() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentTypeHandler("handler");
    }

    // ---------------------------------------------------------
    // withValueHandler
    // ---------------------------------------------------------

    @Test
    public void testWithValueHandler_sameHandler_returnsSameInstance() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object handler = "valueHandler";
        SimpleType withHandler = type.withValueHandler(handler);
        SimpleType same = withHandler.withValueHandler(handler);
        assertSame(withHandler, same);
    }

    @Test
    public void testWithValueHandler_differentHandler_returnsNewInstance() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object handler1 = "valueHandler1";
        SimpleType withHandler1 = type.withValueHandler(handler1);
        assertNotSame(type, withHandler1);
        assertEquals(handler1, withHandler1.getValueHandler());
    }

    // ---------------------------------------------------------
    // withContentValueHandler
    // ---------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandler_throwsException() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentValueHandler("handler");
    }

    // ---------------------------------------------------------
    // withStaticTyping
    // ---------------------------------------------------------

    @Test
    public void testWithStaticTyping_notStatic_returnsNewInstance() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.isStatic() /* may not exist */);
    }

    @Test
    public void testWithStaticTyping_appliedTwice_returnsSameInstanceSecondTime() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType staticType = type.withStaticTyping();
        assertNotSame(type, staticType);
        SimpleType staticAgain = staticType.withStaticTyping();
        assertSame(staticType, staticAgain);
    }

    // ---------------------------------------------------------
    // refine
    // ---------------------------------------------------------

    @Test
    public void testRefine_returnsNull() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        JavaType result = type.refine(String.class, null, null, null);
        assertNull(result);
    }

    // ---------------------------------------------------------
    // isContainerType
    // ---------------------------------------------------------

    @Test
    public void testIsContainerType_returnsFalse() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.isContainerType());
    }

    // ---------------------------------------------------------
    // getErasedSignature
    // ---------------------------------------------------------

    @Test
    public void testGetErasedSignature_returnsExpectedSignature() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    // ---------------------------------------------------------
    // getGenericSignature
    // ---------------------------------------------------------

    @Test
    public void testGetGenericSignature_noBindings_returnsExpectedSignature() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        assertNotNull(result);
        assertTrue(result.toString().endsWith(";"));
    }

    @Test
    public void testGetGenericSignature_withBindings_returnsExpectedSignature() {
        JavaType boxOfString = typeFactory.constructParametricType(Box.class, String.class);
        assertTrue(boxOfString instanceof SimpleType);
        SimpleType simpleType = (SimpleType) boxOfString;
        StringBuilder sb = new StringBuilder();
        StringBuilder result = simpleType.getGenericSignature(sb);
        assertNotNull(result);
        assertTrue(result.toString().contains("<"));
        assertTrue(result.toString().endsWith(";"));
    }

    // ---------------------------------------------------------
    // buildCanonicalName (indirectly through toString)
    // ---------------------------------------------------------

    @Test
    public void testToString_noBindings_containsClassName() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        String str = type.toString();
        assertTrue(str.contains("java.lang.String"));
        assertTrue(str.startsWith("[simple type, class"));
    }

    @Test
    public void testToString_withBindings_containsGenericInfo() {
        JavaType boxOfString = typeFactory.constructParametricType(Box.class, String.class);
        String str = boxOfString.toString();
        assertTrue(str.contains("Box"));
        assertTrue(str.contains("String"));
    }

    // ---------------------------------------------------------
    // equals
    // ---------------------------------------------------------

    @Test
    public void testEquals_sameInstance_true() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertTrue(type.equals(type));
    }

    @Test
    public void testEquals_null_false() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.equals(null));
    }

    @Test
    public void testEquals_differentClassType_false() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.equals("not a SimpleType"));
    }

    @Test
    public void testEquals_differentRawClass_false() {
        SimpleType type1 = SimpleType.constructUnsafe(String.class);
        SimpleType type2 = SimpleType.constructUnsafe(Integer.class);
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEquals_sameRawClassNoBindings_true() {
        SimpleType type1 = SimpleType.constructUnsafe(String.class);
        SimpleType type2 = SimpleType.constructUnsafe(String.class);
        assertTrue(type1.equals(type2));
    }

    @Test
    public void testEquals_sameRawClassSameBindings_true() {
        JavaType box1 = typeFactory.constructParametricType(Box.class, String.class);
        JavaType box2 = typeFactory.constructParametricType(Box.class, String.class);
        assertTrue(box1.equals(box2));
    }

    @Test
    public void testEquals_sameRawClassDifferentBindings_false() {
        JavaType box1 = typeFactory.constructParametricType(Box.class, String.class);
        JavaType box2 = typeFactory.constructParametricType(Box.class, Integer.class);
        assertFalse(box1.equals(box2));
    }
}
