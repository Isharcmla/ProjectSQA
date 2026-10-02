package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class SimpleTypeTest {

    @Test
    public void testConstructUnsafe_validClass_createsSimpleType() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
        assertTrue(type.getBindings().isEmpty());
        assertNull(type.getSuperClass());
        assertNull(type.getValueHandler());
        assertNull(type.getTypeHandler());
        assertFalse(type.useStaticType());
    }

    @Test
    public void testConstruct_validClass_createsSimpleTypeWithBogusSuperClass() {
        SimpleType type = SimpleType.construct(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
        assertNotNull(type.getSuperClass());
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
    public void testConstructors_coverage() {
        SimpleType base = new SimpleType(String.class);
        assertEquals(String.class, base.getRawClass());

        JavaType[] interfaces = new JavaType[] { SimpleType.constructUnsafe(Comparable.class) };
        JavaType superClass = SimpleType.constructUnsafe(Object.class);
        TypeBindings bindings = TypeBindings.emptyBindings();

        SimpleType typeWithSuper = new SimpleType(String.class, bindings, superClass, interfaces);
        assertEquals(superClass, typeWithSuper.getSuperClass());
        assertEquals(1, typeWithSuper.getInterfaces().size());

        SimpleType copyType = new SimpleType(typeWithSuper);
        assertEquals(typeWithSuper, copyType);

        SimpleType fullType = new SimpleType(String.class, bindings, superClass, interfaces, "valHandler", "typeHandler", true);
        assertEquals("valHandler", fullType.getValueHandler());
        assertEquals("typeHandler", fullType.getTypeHandler());
        assertTrue(fullType.useStaticType());

        SimpleType extraHashType = new SimpleType(String.class, bindings, superClass, interfaces, 123, "valHandler", "typeHandler", true);
        assertEquals("valHandler", extraHashType.getValueHandler());
        assertEquals("typeHandler", extraHashType.getTypeHandler());
        assertTrue(extraHashType.useStaticType());
    }

    @Test
    public void testNarrow_sameClass_returnsThis() {
        SimpleType type = SimpleType.constructUnsafe(CharSequence.class);
        JavaType narrowed = type._narrow(CharSequence.class);
        assertSame(type, narrowed);
    }

    @Test
    public void testNarrow_subClass_returnsNewSimpleTypeWithOldAsSuperClass() {
        SimpleType type = SimpleType.constructUnsafe(CharSequence.class);
        JavaType narrowed = type._narrow(String.class);
        assertNotEquals(type, narrowed);
        assertEquals(String.class, narrowed.getRawClass());
        assertEquals(type, narrowed.getSuperClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentType_throwsIllegalArgumentException() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentType(SimpleType.constructUnsafe(Integer.class));
    }

    @Test
    public void testWithTypeHandler_sameHandler_returnsThis() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType withNull = type.withTypeHandler(null);
        assertSame(type, withNull);

        SimpleType withHandler = type.withTypeHandler("handler1");
        SimpleType withSameHandler = withHandler.withTypeHandler("handler1");
        assertSame(withHandler, withSameHandler);
    }

    @Test
    public void testWithTypeHandler_differentHandler_returnsNewInstance() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType withHandler = type.withTypeHandler("handler1");
        assertNotEquals(type, withHandler);
        assertEquals("handler1", withHandler.getTypeHandler());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandler_throwsIllegalArgumentException() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentTypeHandler("handler");
    }

    @Test
    public void testWithValueHandler_sameHandler_returnsThis() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType withNull = type.withValueHandler(null);
        assertSame(type, withNull);

        SimpleType withHandler = type.withValueHandler("val1");
        SimpleType withSameHandler = withHandler.withValueHandler("val1");
        assertSame(withHandler, withSameHandler);
    }

    @Test
    public void testWithValueHandler_differentHandler_returnsNewInstance() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType withHandler = type.withValueHandler("val1");
        assertNotEquals(type, withHandler);
        assertEquals("val1", withHandler.getValueHandler());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandler_throwsIllegalArgumentException() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentValueHandler("handler");
    }

    @Test
    public void testWithStaticTyping_fromNonStatic_returnsNewInstance() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.useStaticType());

        SimpleType staticType = type.withStaticTyping();
        assertTrue(staticType.useStaticType());
        assertNotEquals(type, staticType);

        SimpleType staticSame = staticType.withStaticTyping();
        assertSame(staticType, staticSame);
    }

    @Test
    public void testRefine_returnsNull() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        JavaType refined = type.refine(String.class, TypeBindings.emptyBindings(), null, null);
        assertNull(refined);
    }

    @Test
    public void testIsContainerType_returnsFalse() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.isContainerType());
    }

    @Test
    public void testGetErasedSignature() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = new StringBuilder();
        type.getErasedSignature(sb);
        assertEquals("Ljava/lang/String;", sb.toString());
    }

    @Test
    public void testGetGenericSignature_noBindings() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = new StringBuilder();
        type.getGenericSignature(sb);
        assertEquals("Ljava/lang/String;;", sb.toString());
    }

    @Test
    public void testBuildCanonicalName_and_GenericSignature_withBindings() {
        JavaType param1 = SimpleType.constructUnsafe(String.class);
        JavaType param2 = SimpleType.constructUnsafe(Integer.class);
        TypeBindings bindings = TypeBindings.create(Map.class, new JavaType[] { param1, param2 });

        SimpleType typeWithParams = new SimpleType(Map.class, bindings, null, null);

        String canonical = typeWithParams.buildCanonicalName();
        assertEquals("java.util.Map<java.lang.String,java.lang.Integer>", canonical);

        StringBuilder sb = new StringBuilder();
        typeWithParams.getGenericSignature(sb);
        assertEquals("Ljava/util/Map<Ljava/lang/String;;Ljava/lang/Integer;;>;", sb.toString());
    }

    @Test
    public void testBuildCanonicalName_withSingleBinding() {
        JavaType param = SimpleType.constructUnsafe(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, new JavaType[] { param });

        SimpleType typeWithParam = new SimpleType(List.class, bindings, null, null);
        String canonical = typeWithParam.buildCanonicalName();
        assertEquals("java.util.List<java.lang.String>", canonical);
    }

    @Test
    public void testToString() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertEquals("[simple type, class java.lang.String]", type.toString());
    }

    @Test
    public void testEquals() {
        SimpleType type1 = SimpleType.constructUnsafe(String.class);
        SimpleType type2 = SimpleType.constructUnsafe(String.class);
        SimpleType typeInt = SimpleType.constructUnsafe(Integer.class);

        assertTrue(type1.equals(type1));
        assertTrue(type1.equals(type2));
        assertFalse(type1.equals(null));
        assertFalse(type1.equals("not a type"));
        assertFalse(type1.equals(typeInt));

        TypeBindings bindings1 = TypeBindings.create(List.class, new JavaType[] { SimpleType.constructUnsafe(String.class) });
        TypeBindings bindings2 = TypeBindings.create(List.class, new JavaType[] { SimpleType.constructUnsafe(Integer.class) });

        SimpleType boundType1 = new SimpleType(List.class, bindings1, null, null);
        SimpleType boundType2 = new SimpleType(List.class, bindings2, null, null);
        SimpleType boundType1Copy = new SimpleType(List.class, bindings1, null, null);

        assertTrue(boundType1.equals(boundType1Copy));
        assertFalse(boundType1.equals(boundType2));
    }
}
