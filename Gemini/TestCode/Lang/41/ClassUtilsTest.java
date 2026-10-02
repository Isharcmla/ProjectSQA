package org.apache.commons.lang;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ClassUtilsTest {

    private static class InnerClass {
        public void publicMethod() {}
    }

    private static class SuperClassWithInterface implements SuperInterface {
        public void interfaceMethod() {}
        public void superMethod() {}
    }

    private interface SuperInterface {
        void interfaceMethod();
    }

    private interface ChildInterface extends SuperInterface {
        void childMethod();
    }

    private static class SubClass extends SuperClassWithInterface implements ChildInterface {
        public void childMethod() {}
    }

    private static class PackagePrivateClass extends SuperClassWithInterface {
        @Override
        public void superMethod() {}
    }

    @Test
    public void testConstructor() {
        assertNotNull(new ClassUtils());
        Constructor<?>[] cons = ClassUtils.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
    }

    @Test
    public void testConstants() {
        assertEquals('.', ClassUtils.PACKAGE_SEPARATOR_CHAR);
        assertEquals(".", ClassUtils.PACKAGE_SEPARATOR);
        assertEquals('$', ClassUtils.INNER_CLASS_SEPARATOR_CHAR);
        assertEquals("$", ClassUtils.INNER_CLASS_SEPARATOR);
    }

    @Test
    public void testGetShortClassName_Object() {
        assertEquals("ClassUtilsTest", ClassUtils.getShortClassName(this, "default"));
        assertEquals("default", ClassUtils.getShortClassName((Object) null, "default"));
        assertNull(ClassUtils.getShortClassName((Object) null, null));
    }

    @Test
    public void testGetShortClassName_Class() {
        assertEquals("ClassUtilsTest", ClassUtils.getShortClassName(ClassUtilsTest.class));
        assertEquals("ClassUtilsTest.InnerClass", ClassUtils.getShortClassName(InnerClass.class));
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null));
        assertEquals("int[]", ClassUtils.getShortClassName(int[].class));
        assertEquals("String[]", ClassUtils.getShortClassName(String[].class));
    }

    @Test
    public void testGetShortClassName_String() {
        assertEquals("ClassUtilsTest", ClassUtils.getShortClassName(ClassUtilsTest.class.getName()));
        assertEquals("ClassUtilsTest.InnerClass", ClassUtils.getShortClassName(InnerClass.class.getName()));
        assertEquals("String", ClassUtils.getShortClassName("java.lang.String"));
        assertEquals("UnpackagedClass", ClassUtils.getShortClassName("UnpackagedClass"));
        assertEquals("", ClassUtils.getShortClassName((String) null));
        assertEquals("", ClassUtils.getShortClassName(""));
    }

    @Test
    public void testGetPackageName_Object() {
        assertEquals("org.apache.commons.lang", ClassUtils.getPackageName(this, "default"));
        assertEquals("default", ClassUtils.getPackageName((Object) null, "default"));
        assertNull(ClassUtils.getPackageName((Object) null, null));
    }

    @Test
    public void testGetPackageName_Class() {
        assertEquals("org.apache.commons.lang", ClassUtils.getPackageName(ClassUtilsTest.class));
        assertEquals("org.apache.commons.lang", ClassUtils.getPackageName(InnerClass.class));
        assertEquals("", ClassUtils.getPackageName((Class<?>) null));
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
        assertEquals("java.lang", ClassUtils.getPackageName(String[].class));
    }

    @Test
    public void testGetPackageName_String() {
        assertEquals("org.apache.commons.lang", ClassUtils.getPackageName("org.apache.commons.lang.ClassUtilsTest"));
        assertEquals("", ClassUtils.getPackageName("UnpackagedClass"));
        assertEquals("", ClassUtils.getPackageName((String) null));
        assertEquals("", ClassUtils.getPackageName(""));
    }

    @Test
    public void testGetAllSuperclasses() {
        assertNull(ClassUtils.getAllSuperclasses(null));
        assertEquals(Collections.emptyList(), ClassUtils.getAllSuperclasses(Object.class));

        List<Class<?>> superclasses = ClassUtils.getAllSuperclasses(SubClass.class);
        assertEquals(2, superclasses.size());
        assertEquals(SuperClassWithInterface.class, superclasses.get(0));
        assertEquals(Object.class, superclasses.get(1));
    }

    @Test
    public void testGetAllInterfaces() {
        assertNull(ClassUtils.getAllInterfaces(null));
        assertEquals(Collections.emptyList(), ClassUtils.getAllInterfaces(Object.class));

        List<Class<?>> interfaces = ClassUtils.getAllInterfaces(SubClass.class);
        assertEquals(2, interfaces.size());
        assertTrue(interfaces.contains(ChildInterface.class));
        assertTrue(interfaces.contains(SuperInterface.class));
    }

    @Test
    public void testConvertClassNamesToClasses() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));

        List<String> names = new ArrayList<String>();
        names.add("java.lang.String");
        names.add("invalid.ClassName");
        names.add(null);

        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(names);
        assertNotNull(classes);
        assertEquals(3, classes.size());
        assertEquals(String.class, classes.get(0));
        assertNull(classes.get(1));
        assertNull(classes.get(2));
    }

    @Test
    public void testConvertClassesToClassNames() {
        assertNull(ClassUtils.convertClassesToClassNames(null));

        List<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(String.class);
        classes.add(null);
        classes.add(Integer.class);

        List<String> names = ClassUtils.convertClassesToClassNames(classes);
        assertNotNull(names);
        assertEquals(3, names.size());
        assertEquals("java.lang.String", names.get(0));
        assertNull(names.get(1));
        assertEquals("java.lang.Integer", names.get(2));
    }

    @Test
    public void testIsAssignable_ClassArrays() {
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{String.class}, new Class<?>[]{String.class, Integer.class}));
        assertTrue(ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null));
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{String.class}, null));
        assertFalse(ClassUtils.isAssignable(null, new Class<?>[]{String.class}));

        Class<?>[] from = new Class<?>[]{Integer.TYPE, String.class};
        Class<?>[] to = new Class<?>[]{Long.TYPE, Object.class};
        assertTrue(ClassUtils.isAssignable(from, to));

        Class<?>[] incompatible = new Class<?>[]{Double.TYPE, Object.class};
        assertFalse(ClassUtils.isAssignable(from, incompatible));
    }

    @Test
    public void testIsAssignable_ClassArraysAutoboxing() {
        Class<?>[] from = new Class<?>[]{Integer.TYPE, Double.class};
        Class<?>[] to = new Class<?>[]{Integer.class, Double.TYPE};
        assertTrue(ClassUtils.isAssignable(from, to, true));
        assertFalse(ClassUtils.isAssignable(from, to, false));
    }

    @Test
    public void testIsAssignable_NullClasses() {
        assertFalse(ClassUtils.isAssignable((Class<?>) null, null));
        assertFalse(ClassUtils.isAssignable(String.class, null));
        assertTrue(ClassUtils.isAssignable((Class<?>) null, String.class));
        assertFalse(ClassUtils.isAssignable((Class<?>) null, Integer.TYPE));
    }

    @Test
    public void testIsAssignable_PrimitiveWidenings() {
        // Integer widenings
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Long.TYPE));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Float.TYPE));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Double.TYPE));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Short.TYPE));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Byte.TYPE));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Character.TYPE));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Boolean.TYPE));

        // Long widenings
        assertTrue(ClassUtils.isAssignable(Long.TYPE, Float.TYPE));
        assertTrue(ClassUtils.isAssignable(Long.TYPE, Double.TYPE));
        assertFalse(ClassUtils.isAssignable(Long.TYPE, Integer.TYPE));

        // Boolean
        assertFalse(ClassUtils.isAssignable(Boolean.TYPE, Integer.TYPE));
        assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.TYPE));

        // Double
        assertFalse(ClassUtils.isAssignable(Double.TYPE, Float.TYPE));
        assertTrue(ClassUtils.isAssignable(Double.TYPE, Double.TYPE));

        // Float widenings
        assertTrue(ClassUtils.isAssignable(Float.TYPE, Double.TYPE));
        assertFalse(ClassUtils.isAssignable(Float.TYPE, Float.class));
        assertFalse(ClassUtils.isAssignable(Float.TYPE, Integer.TYPE));

        // Character widenings
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Integer.TYPE));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Long.TYPE));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Float.TYPE));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Double.TYPE));
        assertFalse(ClassUtils.isAssignable(Character.TYPE, Short.TYPE));
        assertFalse(ClassUtils.isAssignable(Character.TYPE, Byte.TYPE));

        // Short widenings
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Integer.TYPE));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Long.TYPE));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Float.TYPE));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Double.TYPE));
        assertFalse(ClassUtils.isAssignable(Short.TYPE, Byte.TYPE));
        assertFalse(ClassUtils.isAssignable(Short.TYPE, Character.TYPE));

        // Byte widenings
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Short.TYPE));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Integer.TYPE));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Long.TYPE));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Float.TYPE));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Double.TYPE));
        assertFalse(ClassUtils.isAssignable(Byte.TYPE, Character.TYPE));
        assertFalse(ClassUtils.isAssignable(Byte.TYPE, Boolean.TYPE));
    }

    @Test
    public void testIsAssignable_Autoboxing() {
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.class, true));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Integer.class, false));
        assertTrue(ClassUtils.isAssignable(Integer.class, Integer.TYPE, true));
        assertFalse(ClassUtils.isAssignable(Integer.class, Integer.TYPE, false));

        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Object.class, true));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Object.class, false));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Number.class, true));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Number.class, false));

        // Non wrapper object to primitive with autoboxing
        assertFalse(ClassUtils.isAssignable(String.class, Integer.TYPE, true));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, String.class, true));
    }

    @Test
    public void testIsAssignable_ReferenceTypes() {
        assertTrue(ClassUtils.isAssignable(String.class, Object.class));
        assertTrue(ClassUtils.isAssignable(SubClass.class, SuperClassWithInterface.class));
        assertTrue(ClassUtils.isAssignable(SubClass.class, SuperInterface.class));
        assertFalse(ClassUtils.isAssignable(Object.class, String.class));
    }

    @Test
    public void testPrimitiveToWrapper() {
        assertNull(ClassUtils.primitiveToWrapper(null));
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
        assertEquals(Boolean.class, ClassUtils.primitiveToWrapper(Boolean.TYPE));
        assertEquals(Byte.class, ClassUtils.primitiveToWrapper(Byte.TYPE));
        assertEquals(Character.class, ClassUtils.primitiveToWrapper(Character.TYPE));
        assertEquals(Short.class, ClassUtils.primitiveToWrapper(Short.TYPE));
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(Integer.TYPE));
        assertEquals(Long.class, ClassUtils.primitiveToWrapper(Long.TYPE));
        assertEquals(Double.class, ClassUtils.primitiveToWrapper(Double.TYPE));
        assertEquals(Float.class, ClassUtils.primitiveToWrapper(Float.TYPE));
        assertEquals(Void.TYPE, ClassUtils.primitiveToWrapper(Void.TYPE));
    }

    @Test
    public void testPrimitivesToWrappers() {
        assertNull(ClassUtils.primitivesToWrappers(null));
        assertArrayEquals(new Class<?>[0], ClassUtils.primitivesToWrappers(new Class<?>[0]));

        Class<?>[] primitives = new Class<?>[]{Integer.TYPE, String.class, null, Void.TYPE};
        Class<?>[] expected = new Class<?>[]{Integer.class, String.class, null, Void.TYPE};
        assertArrayEquals(expected, ClassUtils.primitivesToWrappers(primitives));
    }

    @Test
    public void testWrapperToPrimitive() {
        assertNull(ClassUtils.wrapperToPrimitive(null));
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
        assertNull(ClassUtils.wrapperToPrimitive(Void.class));
        assertEquals(Boolean.TYPE, ClassUtils.wrapperToPrimitive(Boolean.class));
        assertEquals(Byte.TYPE, ClassUtils.wrapperToPrimitive(Byte.class));
        assertEquals(Character.TYPE, ClassUtils.wrapperToPrimitive(Character.class));
        assertEquals(Short.TYPE, ClassUtils.wrapperToPrimitive(Short.class));
        assertEquals(Integer.TYPE, ClassUtils.wrapperToPrimitive(Integer.class));
        assertEquals(Long.TYPE, ClassUtils.wrapperToPrimitive(Long.class));
        assertEquals(Double.TYPE, ClassUtils.wrapperToPrimitive(Double.class));
        assertEquals(Float.TYPE, ClassUtils.wrapperToPrimitive(Float.class));
    }

    @Test
    public void testWrappersToPrimitives() {
        assertNull(ClassUtils.wrappersToPrimitives(null));
        assertArrayEquals(new Class<?>[0], ClassUtils.wrappersToPrimitives(new Class<?>[0]));

        Class<?>[] wrappers = new Class<?>[]{Integer.class, String.class, null, Double.class};
        Class<?>[] expected = new Class<?>[]{Integer.TYPE, null, null, Double.TYPE};
        assertArrayEquals(expected, ClassUtils.wrappersToPrimitives(wrappers));
    }

    @Test
    public void testIsInnerClass() {
        assertFalse(ClassUtils.isInnerClass(null));
        assertFalse(ClassUtils.isInnerClass(String.class));
        assertTrue(ClassUtils.isInnerClass(InnerClass.class));
        assertTrue(ClassUtils.isInnerClass(new SuperInterface() {
            public void interfaceMethod() {}
        }.getClass()));
    }

    @Test
    public void testGetClass_ClassLoaderString() throws Exception {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        assertEquals(String.class, ClassUtils.getClass(cl, "java.lang.String"));
        assertEquals(int.class, ClassUtils.getClass(cl, "int"));
        assertEquals(boolean.class, ClassUtils.getClass(cl, "boolean"));
        assertEquals(float.class, ClassUtils.getClass(cl, "float"));
        assertEquals(long.class, ClassUtils.getClass(cl, "long"));
        assertEquals(short.class, ClassUtils.getClass(cl, "short"));
        assertEquals(byte.class, ClassUtils.getClass(cl, "byte"));
        assertEquals(double.class, ClassUtils.getClass(cl, "double"));
        assertEquals(char.class, ClassUtils.getClass(cl, "char"));

        assertEquals(String[].class, ClassUtils.getClass(cl, "java.lang.String[]"));
        assertEquals(int[].class, ClassUtils.getClass(cl, "int[]"));
        assertEquals(String[][].class, ClassUtils.getClass(cl, "java.lang.String[][]"));
        assertEquals(int[][].class, ClassUtils.getClass(cl, "int[][]"));
        assertEquals(String[].class, ClassUtils.getClass(cl, "[Ljava.lang.String;"));
        assertEquals(int[].class, ClassUtils.getClass(cl, "[I"));
    }

    @Test
    public void testGetClass_String() throws Exception {
        assertEquals(String.class, ClassUtils.getClass("java.lang.String"));
        assertEquals(int.class, ClassUtils.getClass("int", true));
        assertEquals(String.class, ClassUtils.getClass("java.lang.String", false));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testGetClass_NotFound() throws Exception {
        ClassUtils.getClass("non.existent.ClassName");
    }

    @Test(expected = NullPointerException.class)
    public void testGetClass_NullString() throws Exception {
        ClassUtils.getClass((String) null);
    }

    @Test
    public void testGetPublicMethod_Direct() throws Exception {
        Method m = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[0]);
        assertNotNull(m);
        assertEquals("length", m.getName());
    }

    @Test
    public void testGetPublicMethod_FromInterface() throws Exception {
        Set<?> unmodifiableSet = Collections.unmodifiableSet(Collections.emptySet());
        Method method = ClassUtils.getPublicMethod(unmodifiableSet.getClass(), "isEmpty", new Class<?>[0]);
        assertNotNull(method);
        assertTrue(Modifier.isPublic(method.getDeclaringClass().getModifiers()));
    }

    @Test
    public void testGetPublicMethod_FromSuperclass() throws Exception {
        Method method = ClassUtils.getPublicMethod(PackagePrivateClass.class, "superMethod", new Class<?>[0]);
        assertNotNull(method);
        assertTrue(Modifier.isPublic(method.getDeclaringClass().getModifiers()));
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_NotFound() throws Exception {
        ClassUtils.getPublicMethod(String.class, "nonExistentMethod", new Class<?>[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testGetPublicMethod_NullClass() throws Exception {
        ClassUtils.getPublicMethod(null, "length", new Class<?>[0]);
    }

    @Test
    public void testToClass() {
        assertNull(ClassUtils.toClass(null));
        assertArrayEquals(new Class<?>[0], ClassUtils.toClass(new Object[0]));

        Object[] array = new Object[]{"hello", Integer.valueOf(1), Boolean.TRUE};
        Class<?>[] expected = new Class<?>[]{String.class, Integer.class, Boolean.class};
        assertArrayEquals(expected, ClassUtils.toClass(array));
    }

    @Test
    public void testGetShortCanonicalName_Object() {
        assertEquals("ClassUtilsTest", ClassUtils.getShortCanonicalName(this, "default"));
        assertEquals("default", ClassUtils.getShortCanonicalName((Object) null, "default"));
        assertNull(ClassUtils.getShortCanonicalName((Object) null, null));
    }

    @Test
    public void testGetShortCanonicalName_Class() {
        assertEquals("ClassUtilsTest", ClassUtils.getShortCanonicalName(ClassUtilsTest.class));
        assertEquals("", ClassUtils.getShortCanonicalName((Class<?>) null));
        assertEquals("int[]", ClassUtils.getShortCanonicalName(int[].class));
        assertEquals("String[]", ClassUtils.getShortCanonicalName(String[].class));
        assertEquals("String[][]", ClassUtils.getShortCanonicalName(String[][].class));
    }

    @Test
    public void testGetShortCanonicalName_String() {
        assertEquals("", ClassUtils.getShortCanonicalName((String) null));
        assertEquals("", ClassUtils.getShortCanonicalName(""));
        assertEquals("String", ClassUtils.getShortCanonicalName("java.lang.String"));
        assertEquals("String[]", ClassUtils.getShortCanonicalName("[Ljava.lang.String;"));
        assertEquals("String[]", ClassUtils.getShortCanonicalName("[Ljava.lang.String"));
        assertEquals("String[][]", ClassUtils.getShortCanonicalName("[[Ljava.lang.String;"));
        assertEquals("int[]", ClassUtils.getShortCanonicalName("[I"));
        assertEquals("int[][]", ClassUtils.getShortCanonicalName("[[I"));
        assertEquals("ClassUtilsTest.InnerClass", ClassUtils.getShortCanonicalName(InnerClass.class.getName()));
    }

    @Test
    public void testGetPackageCanonicalName_Object() {
        assertEquals("org.apache.commons.lang", ClassUtils.getPackageCanonicalName(this, "default"));
        assertEquals("default", ClassUtils.getPackageCanonicalName((Object) null, "default"));
        assertNull(ClassUtils.getPackageCanonicalName((Object) null, null));
    }

    @Test
    public void testGetPackageCanonicalName_Class() {
        assertEquals("org.apache.commons.lang", ClassUtils.getPackageCanonicalName(ClassUtilsTest.class));
        assertEquals("", ClassUtils.getPackageCanonicalName((Class<?>) null));
        assertEquals("", ClassUtils.getPackageCanonicalName(int[].class));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String[].class));
    }

    @Test
    public void testGetPackageCanonicalName_String() {
        assertEquals("", ClassUtils.getPackageCanonicalName((String) null));
        assertEquals("", ClassUtils.getPackageCanonicalName(""));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("java.lang.String"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[Ljava.lang.String;"));
        assertEquals("", ClassUtils.getPackageCanonicalName("[I"));
        assertEquals("", ClassUtils.getPackageCanonicalName("UnpackagedClass"));
    }
}
