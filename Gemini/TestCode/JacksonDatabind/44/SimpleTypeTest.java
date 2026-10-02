package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.databind.JavaType;

public class SimpleTypeTest {

    static class BaseClass {}
    static class MiddleClass extends BaseClass {}
    static class SubClass extends MiddleClass {}
    static class GenericHolder<T, U> {}

    @Test
    public void testConstruct_withStandardClass_returnsSimpleType() {
        SimpleType type = SimpleType.construct(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
        assertFalse(type.isContainerType());
    }

    @Test
    public void testConstruct_withHierarchy_buildsSuperClassesCorrectly() {
        SimpleType type = SimpleType.construct(SubClass.class);
        assertNotNull(type);
        assertEquals(SubClass.class, type.getRawClass());

        JavaType superClass = type.getSuperClass();
        assertNotNull(superClass);
        assertEquals(MiddleClass.class, superClass.getRawClass());

        JavaType baseClass = superClass.getSuperClass();
        assertNotNull(baseClass);
        assertEquals(BaseClass.class, baseClass.getRawClass());

        JavaType objectClass = baseClass.getSuperClass();
        assertNotNull(objectClass);
        assertEquals(Object.class, objectClass.getRawClass());
        assertNull(objectClass.getSuperClass());
    }

    @Test
    public void testConstruct_withObjectClass_superClassIsNull() {
        SimpleType type = SimpleType.construct(Object.class);
        assertNotNull(type);
        assertEquals(Object.class, type.getRawClass());
        assertNull(type.getSuperClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_withMapClass_throwsIllegalArgumentException() {
        SimpleType.construct(HashMap.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_withCollectionClass_throwsIllegalArgumentException() {
        SimpleType.construct(ArrayList.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstruct_withArrayClass_throwsIllegalArgumentException() {
        SimpleType.construct(String[].class);
    }

    @Test
    public void testConstructUnsafe_validClass_createsSimpleType() {
        SimpleType type = SimpleType.constructUnsafe(Integer.class);
        assertNotNull(type);
        assertEquals(Integer.class, type.getRawClass());
        assertNull(type.getSuperClass());
    }

    @Test
    public void testProtectedConstructors_directInvocation() {
        SimpleType t1 = new SimpleType(String.class);
        assertEquals(String.class, t1.getRawClass());

        SimpleType t2 = new SimpleType(String.class, TypeBindings.emptyBindings(), null, null);
        assertEquals(String.class, t2.getRawClass());

        SimpleType t3 = new SimpleType(t1);
        assertEquals(String.class, t3.getRawClass());

        SimpleType t4 = new SimpleType(String.class, TypeBindings.emptyBindings(), null, null, 123, "valHandler", "typeHandler", true);
        assertEquals(String.class, t4.getRawClass());
        assertEquals("valHandler", t4.getValueHandler());
        assertEquals("typeHandler", t4.getTypeHandler());
        assertTrue(t4.useStaticType());
    }

    @Test
    public void testNarrow_sameClass_returnsSameInstance() {
        SimpleType type = SimpleType.constructUnsafe(BaseClass.class);
        JavaType narrowed = type._narrow(BaseClass.class);
        assertSame(type, narrowed);
    }

    @Test
    public void testNarrow_subClass_returnsNarrowedType() {
        SimpleType type = SimpleType.constructUnsafe(BaseClass.class);
        JavaType narrowed = type._narrow(SubClass.class);
        assertNotSame(type, narrowed);
        assertEquals(SubClass.class, narrowed.getRawClass());
        assertSame(type, narrowed.getSuperClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentType_throwsIllegalArgumentException() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentType(SimpleType.constructUnsafe(Integer.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandler_throwsIllegalArgumentException() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentTypeHandler("handler");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandler_throwsIllegalArgumentException() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentValueHandler("handler");
    }

    @Test
    public void testWithTypeHandler_sameHandler_returnsThis() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertSame(type, type.withTypeHandler(null));

        SimpleType withHandler = type.withTypeHandler("customHandler");
        assertSame(withHandler, withHandler.withTypeHandler("customHandler"));
    }

    @Test
    public void testWithTypeHandler_differentHandler_returnsNewInstance() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType withHandler = type.withTypeHandler("customHandler");

        assertNotSame(type, withHandler);
        assertEquals("customHandler", withHandler.getTypeHandler());
    }

    @Test
    public void testWithValueHandler_sameHandler_returnsThis() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertSame(type, type.withValueHandler(null));

        SimpleType withHandler = type.withValueHandler("customValue");
        assertSame(withHandler, withHandler.withValueHandler("customValue"));
    }

    @Test
    public void testWithValueHandler_differentHandler_returnsNewInstance() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType withHandler = type.withValueHandler("customValue");

        assertNotSame(type, withHandler);
        assertEquals("customValue", withHandler.getValueHandler());
    }

    @Test
    public void testWithStaticTyping_togglesCorrectly() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.useStaticType());

        SimpleType staticType = type.withStaticTyping();
        assertNotSame(type, staticType);
        assertTrue(staticType.useStaticType());

        assertSame(staticType, staticType.withStaticTyping());
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
    public void testGetGenericSignature_withoutBindings() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = new StringBuilder();
        type.getGenericSignature(sb);
        assertEquals("Ljava/lang/String;;", sb.toString());
    }

    @Test
    public void testGetGenericSignature_withBindings() {
        JavaType param1 = SimpleType.constructUnsafe(String.class);
        JavaType param2 = SimpleType.constructUnsafe(Integer.class);
        TypeBindings bindings = TypeBindings.create(GenericHolder.class, new JavaType[]{param1, param2});

        SimpleType type = new SimpleType(GenericHolder.class, bindings, null, null, null, null, false);
        StringBuilder sb = new StringBuilder();
        type.getGenericSignature(sb);

        assertEquals("Lcom/fasterxml/jackson/databind/type/SimpleTypeTest$GenericHolder<Ljava/lang/String;;Ljava/lang/Integer;;>;", sb.toString());
    }

    @Test
    public void testBuildCanonicalName_withBindings() {
        JavaType param1 = SimpleType.constructUnsafe(String.class);
        JavaType param2 = SimpleType.constructUnsafe(Integer.class);
        TypeBindings bindings = TypeBindings.create(GenericHolder.class, new JavaType[]{param1, param2});

        SimpleType type = new SimpleType(GenericHolder.class, bindings, null, null, null, null, false);
        String canonical = type.buildCanonicalName();
        assertEquals("com.fasterxml.jackson.databind.type.SimpleTypeTest$GenericHolder<java.lang.String,java.lang.Integer>", canonical);
    }

    @Test
    public void testToString() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertEquals("[simple type, class java.lang.String]", type.toString());
    }

    @Test
    public void testEquals_variousScenarios() {
        SimpleType type1 = SimpleType.constructUnsafe(String.class);
        SimpleType type2 = SimpleType.constructUnsafe(String.class);
        SimpleType typeInt = SimpleType.constructUnsafe(Integer.class);

        JavaType param1 = SimpleType.constructUnsafe(String.class);
        JavaType param2 = SimpleType.constructUnsafe(Integer.class);
        TypeBindings b1 = TypeBindings.create(GenericHolder.class, new JavaType[]{param1, param2});
        TypeBindings b2 = TypeBindings.create(GenericHolder.class, new JavaType[]{param1, param1});

        SimpleType generic1 = new SimpleType(GenericHolder.class, b1, null, null, null, null, false);
        SimpleType generic1Same = new SimpleType(GenericHolder.class, b1, null, null, null, null, false);
        SimpleType generic2 = new SimpleType(GenericHolder.class, b2, null, null, null, null, false);

        assertEquals(type1, type1);
        assertNotEquals(type1, null);
        assertNotEquals(type1, "not a SimpleType");
        assertNotEquals(type1, typeInt);
        assertEquals(type1, type2);

        assertEquals(generic1, generic1Same);
        assertNotEquals(generic1, generic2);
    }
}
