package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class SimpleTypeTest {

    @Test
    public void testConstruct_validClass_success() {
        SimpleType type = SimpleType.construct(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
        assertFalse(type.isContainerType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_mapClass_throwsIllegalArgumentException() {
        SimpleType.construct(HashMap.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_collectionClass_throwsIllegalArgumentException() {
        SimpleType.construct(ArrayList.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_arrayClass_throwsIllegalArgumentException() {
        SimpleType.construct(String[].class);
    }

    @Test
    public void testConstructUnsafe_validClass_success() {
        SimpleType type = SimpleType.constructUnsafe(Object.class);
        assertNotNull(type);
        assertEquals(Object.class, type.getRawClass());
    }

    @Test
    public void testConstructors_andCopyConstructor() {
        SimpleType base = SimpleType.construct(String.class);
        SimpleType copy = new SimpleType(base);
        assertEquals(base, copy);

        SimpleType custom = new SimpleType(
                String.class,
                TypeBindings.emptyBindings(),
                null,
                null,
                123,
                "valHandler",
                "typeHandler",
                true
        );
        assertEquals(String.class, custom.getRawClass());
        assertEquals("valHandler", custom.getValueHandler());
        assertEquals("typeHandler", custom.getTypeHandler());
        assertTrue(custom.useStaticType());

        SimpleType subConstruct = new SimpleType(
                String.class,
                TypeBindings.emptyBindings(),
                null,
                null
        );
        assertEquals(String.class, subConstruct.getRawClass());
    }

    @Test
    public void testNarrow_sameClass_returnsThis() {
        SimpleType type = SimpleType.construct(CharSequence.class);
        JavaType narrowed = type._narrow(CharSequence.class);
        assertSame(type, narrowed);
    }

    @Test
    public void testNarrow_differentClass_returnsNewInstance() {
        SimpleType type = SimpleType.construct(CharSequence.class);
        JavaType narrowed = type._narrow(String.class);
        assertNotSame(type, narrowed);
        assertEquals(String.class, narrowed.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentType_throwsIllegalArgumentException() {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentType(SimpleType.construct(Integer.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandler_throwsIllegalArgumentException() {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentTypeHandler("handler");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandler_throwsIllegalArgumentException() {
        SimpleType type = SimpleType.construct(String.class);
        type.withContentValueHandler("handler");
    }

    @Test
    public void testWithTypeHandler_sameAndDifferent() {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = "customTypeHandler";

        SimpleType withHandler = type.withTypeHandler(handler);
        assertNotSame(type, withHandler);
        assertEquals(handler, withHandler.getTypeHandler());

        SimpleType sameHandler = withHandler.withTypeHandler(handler);
        assertSame(withHandler, sameHandler);
    }

    @Test
    public void testWithValueHandler_sameAndDifferent() {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = "customValueHandler";

        SimpleType withHandler = type.withValueHandler(handler);
        assertNotSame(type, withHandler);
        assertEquals(handler, withHandler.getValueHandler());

        SimpleType sameHandler = withHandler.withValueHandler(handler);
        assertSame(withHandler, sameHandler);
    }

    @Test
    public void testWithStaticTyping_changeAndNoChange() {
        SimpleType type = SimpleType.construct(String.class);
        assertFalse(type.useStaticType());

        SimpleType staticType = type.withStaticTyping();
        assertNotSame(type, staticType);
        assertTrue(staticType.useStaticType());

        SimpleType sameStatic = staticType.withStaticTyping();
        assertSame(staticType, sameStatic);
    }

    @Test
    public void testRefine_returnsNull() {
        SimpleType type = SimpleType.construct(String.class);
        JavaType refined = type.refine(String.class, TypeBindings.emptyBindings(), null, new JavaType[0]);
        assertNull(refined);
    }

    @Test
    public void testBuildCanonicalName_withoutAndWithBindings() {
        SimpleType typeNoBindings = SimpleType.construct(String.class);
        assertEquals("java.lang.String", typeNoBindings.buildCanonicalName());

        JavaType param1 = SimpleType.construct(String.class);
        JavaType param2 = SimpleType.construct(Integer.class);
        TypeBindings bindings = TypeBindings.create(CustomPair.class, new JavaType[]{param1, param2});

        SimpleType typeWithBindings = new SimpleType(
                CustomPair.class,
                bindings,
                null,
                null,
                null,
                null,
                false
        );

        String canonical = typeWithBindings.buildCanonicalName();
        assertEquals(CustomPair.class.getName() + "<java.lang.String,java.lang.Integer>", canonical);
    }

    @Test
    public void testGetErasedSignature() {
        SimpleType type = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertSame(sb, result);
        assertEquals("Ljava/lang/String;", result.toString());
    }

    @Test
    public void testGetGenericSignature_withoutAndWithBindings() {
        SimpleType typeNoBindings = SimpleType.construct(String.class);
        StringBuilder sb1 = new StringBuilder();
        typeNoBindings.getGenericSignature(sb1);
        assertEquals("Ljava/lang/String;;", sb1.toString());

        JavaType param = SimpleType.construct(String.class);
        TypeBindings bindings = TypeBindings.create(CustomHolder.class, new JavaType[]{param});
        SimpleType typeWithBindings = new SimpleType(
                CustomHolder.class,
                bindings,
                null,
                null,
                null,
                null,
                false
        );

        StringBuilder sb2 = new StringBuilder();
        typeWithBindings.getGenericSignature(sb2);
        assertEquals("Lcom/fasterxml/jackson/databind/type/SimpleTypeTest$CustomHolder<Ljava/lang/String;;>;", sb2.toString());
    }

    @Test
    public void testToString() {
        SimpleType type = SimpleType.construct(String.class);
        assertEquals("[simple type, class java.lang.String]", type.toString());
    }

    @Test
    public void testEquals_variousConditions() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type1Copy = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(Integer.class);

        // Same instance
        assertTrue(type1.equals(type1));

        // Null comparison
        assertFalse(type1.equals(null));

        // Different class instance
        assertFalse(type1.equals("Some String"));

        // Same raw class & same bindings
        assertTrue(type1.equals(type1Copy));
        assertEquals(type1.hashCode(), type1Copy.hashCode());

        // Different raw class
        assertFalse(type1.equals(type2));

        // Different bindings
        JavaType param1 = SimpleType.construct(String.class);
        JavaType param2 = SimpleType.construct(Integer.class);
        TypeBindings bindings1 = TypeBindings.create(CustomHolder.class, new JavaType[]{param1});
        TypeBindings bindings2 = TypeBindings.create(CustomHolder.class, new JavaType[]{param2});

        SimpleType typeHolder1 = new SimpleType(CustomHolder.class, bindings1, null, null);
        SimpleType typeHolder2 = new SimpleType(CustomHolder.class, bindings2, null, null);

        assertFalse(typeHolder1.equals(typeHolder2));
    }

    private static class CustomPair<T, U> {}
    private static class CustomHolder<T> {}
}
