package org.apache.commons.lang3;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
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
        public static class NestedClass {
        }
    }

    interface PublicInterface {
        void publicInterfaceMethod();
    }

    static class PackagePrivateClass implements PublicInterface {
        @Override
        public void publicInterfaceMethod() {
        }

        public void packagePrivateOnlyMethod() {
        }
    }

    // Constructor
    // ----------------------------------------------------------------------
    @Test
    public void testConstructor_default_isInstantiable() {
        ClassUtils classUtils = new ClassUtils();
        assertNotNull(classUtils);
        Constructor<?>[] constructors = ClassUtils.class.getConstructors();
        assertEquals(1, constructors.length);
        assertTrue(Modifier.isPublic(constructors[0].getModifiers()));
    }

    // Constants
    // ----------------------------------------------------------------------
    @Test
    public void testConstants() {
        assertEquals('.', ClassUtils.PACKAGE_SEPARATOR_CHAR);
        assertEquals(".", ClassUtils.PACKAGE_SEPARATOR);
        assertEquals('$', ClassUtils.INNER_CLASS_SEPARATOR_CHAR);
        assertEquals("$", ClassUtils.INNER_CLASS_SEPARATOR);
    }

    // Short class name
    // ----------------------------------------------------------------------
    @Test
    public void testGetShortClassName_object_returnsShortClassName() {
        assertEquals("String", ClassUtils.getShortClassName("hello", "default"));
        assertEquals("ClassUtilsTest", ClassUtils.getShortClassName(this, "default"));
        assertEquals("default", ClassUtils.getShortClassName((Object) null, "default"));
        assertNull(ClassUtils.getShortClassName((Object) null, null));
    }

    @Test
    public void testGetShortClassName_class_returnsShortClassName() {
        assertEquals("ClassUtilsTest", ClassUtils.getShortClassName(ClassUtilsTest.class));
        assertEquals("Map.Entry", ClassUtils.getShortClassName(Map.Entry.class));
        assertEquals("ClassUtilsTest.InnerClass", ClassUtils.getShortClassName(InnerClass.class));
        assertEquals("ClassUtilsTest.InnerClass.NestedClass", ClassUtils.getShortClassName(InnerClass.NestedClass.class));
        assertEquals("String[]", ClassUtils.getShortClassName(String[].class));
        assertEquals("int[]", ClassUtils.getShortClassName(int[].class));
        assertEquals("int[][][]", ClassUtils.getShortClassName(int[][][].class));
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null));
    }

    @Test
    public void testGetShortClassName_string_returnsShortClassName() {
        assertEquals("String", ClassUtils.getShortClassName(String.class.getName()));
        assertEquals("Map.Entry", ClassUtils.getShortClassName("java.util.Map$Entry"));
        assertEquals("Entry", ClassUtils.getShortClassName("Entry"));
        assertEquals("Entry", ClassUtils.getShortClassName("java.lang.Entry"));
        assertEquals("int[]", ClassUtils.getShortClassName("[I"));
        assertEquals("boolean[]", ClassUtils.getShortClassName("[Z"));
        assertEquals("float[]", ClassUtils.getShortClassName("[F"));
        assertEquals("long[]", ClassUtils.getShortClassName("[J"));
        assertEquals("short[]", ClassUtils.getShortClassName("[S"));
        assertEquals("byte[]", ClassUtils.getShortClassName("[B"));
        assertEquals("double[]", ClassUtils.getShortClassName("[D"));
        assertEquals("char[]", ClassUtils.getShortClassName("[C"));
        assertEquals("String[]", ClassUtils.getShortClassName("[Ljava.lang.String;"));
        assertEquals("String[][]", ClassUtils.getShortClassName("[[Ljava.lang.String;"));
        assertEquals("int[][]", ClassUtils.getShortClassName("[[I"));
        assertEquals("String[]", ClassUtils.getShortClassName("java.lang.String[]"));
        assertEquals("String", ClassUtils.getShortClassName("Ljava.lang.String;"));
        assertEquals("", ClassUtils.getShortClassName((String) null));
        assertEquals("", ClassUtils.getShortClassName(""));
    }

    // Package name
    // ----------------------------------------------------------------------
    @Test
    public void testGetPackageName_object_returnsPackageName() {
        assertEquals("java.lang", ClassUtils.getPackageName("hello", "default"));
        assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(this, "default"));
        assertEquals("default", ClassUtils.getPackageName((Object) null, "default"));
        assertNull(ClassUtils.getPackageName((Object) null, null));
    }

    @Test
    public void testGetPackageName_class_returnsPackageName() {
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
        assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(ClassUtilsTest.class));
        assertEquals("java.util", ClassUtils.getPackageName(Map.Entry.class));
        assertEquals("java.lang", ClassUtils.getPackageName(String[].class));
        assertEquals("", ClassUtils.getPackageName(int[].class));
        assertEquals("", ClassUtils.getPackageName((Class<?>) null));
    }

    @Test
    public void testGetPackageName_string_returnsPackageName() {
        assertEquals("java.lang", ClassUtils.getPackageName("java.lang.String"));
        assertEquals("java.util", ClassUtils.getPackageName("java.util.Map$Entry"));
        assertEquals("java.lang", ClassUtils.getPackageName("[Ljava.lang.String;"));
        assertEquals("java.lang", ClassUtils.getPackageName("[[Ljava.lang.String;"));
        assertEquals("", ClassUtils.getPackageName("[I"));
        assertEquals("", ClassUtils.getPackageName("UnpackagedClass"));
        assertEquals("", ClassUtils.getPackageName((String) null));
        assertEquals("", ClassUtils.getPackageName(""));
    }

    // Superclasses/Superinterfaces
    // ----------------------------------------------------------------------
    @Test
    public void testGetAllSuperclasses_null_returnsNull() {
        assertNull(ClassUtils.getAllSuperclasses(null));
    }

    @Test
    public void testGetAllSuperclasses_class_returnsSuperclassList() {
        List<Class<?>> superclasses = ClassUtils.getAllSuperclasses(ArrayList.class);
        assertEquals(Arrays.asList(java.util.AbstractList.class, java.util.AbstractCollection.class, Object.class), superclasses);
        assertEquals(Collections.emptyList(), ClassUtils.getAllSuperclasses(Object.class));
    }

    @Test
    public void testGetAllInterfaces_null_returnsNull() {
        assertNull(ClassUtils.getAllInterfaces(null));
    }

    @Test
    public void testGetAllInterfaces_class_returnsInterfaceList() {
        List<Class<?>> interfaces = ClassUtils.getAllInterfaces(ArrayList.class);
        assertTrue(interfaces.contains(List.class));
        assertTrue(interfaces.contains(java.util.Collection.class));
        assertTrue(interfaces.contains(Iterable.class));
        assertTrue(interfaces.contains(java.util.RandomAccess.class));
        assertTrue(interfaces.contains(Cloneable.class));
        assertTrue(interfaces.contains(java.io.Serializable.class));

        List<Class<?>> objectInterfaces = ClassUtils.getAllInterfaces(Object.class);
        assertEquals(0, objectInterfaces.size());
    }

    // Convert list
    // ----------------------------------------------------------------------
    @Test
    public void testConvertClassNamesToClasses_null_returnsNull() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
    }

    @Test
    public void testConvertClassNamesToClasses_validList_returnsClassList() {
        List<String> names = Arrays.asList("java.lang.String", "java.lang.Integer", "non.existent.Class", null);
        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(names);
        assertNotNull(classes);
        assertEquals(4, classes.size());
        assertEquals(String.class, classes.get(0));
        assertEquals(Integer.class, classes.get(1));
        assertNull(classes.get(2));
        assertNull(classes.get(3));
    }

    @Test
    public void testConvertClassesToClassNames_null_returnsNull() {
        assertNull(ClassUtils.convertClassesToClassNames(null));
    }

    @Test
    public void testConvertClassesToClassNames_validList_returnsNameList() {
        List<Class<?>> classes = Arrays.asList(String.class, Integer.class, null);
        List<String> names = ClassUtils.convertClassesToClassNames(classes);
        assertNotNull(names);
        assertEquals(3, names.size());
        assertEquals("java.lang.String", names.get(0));
        assertEquals("java.lang.Integer", names.get(1));
        assertNull(names.get(2));
    }

    // Is assignable
    // ----------------------------------------------------------------------
    @Test
    public void testIsAssignable_arrays_defaultAutoboxing() {
        Class<?>[] from = new Class<?>[]{Integer.class, String.class};
        Class<?>[] to = new Class<?>[]{Number.class, Object.class};
        assertTrue(ClassUtils.isAssignable(from, to));
        assertFalse(ClassUtils.isAssignable(to, from));

        assertFalse(ClassUtils.isAssignable(new Class<?>[]{Integer.class}, new Class<?>[]{Integer.class, String.class}));
        assertTrue(ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null));
        assertTrue(ClassUtils.isAssignable(new Class<?>[0], (Class<?>[]) null));
        assertTrue(ClassUtils.isAssignable((Class<?>[]) null, new Class<?>[0]));
        assertTrue(ClassUtils.isAssignable(new Class<?>[0], new Class<?>[0]));
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{Integer.class}, new Class<?>[]{String.class}));
    }

    @Test
    public void testIsAssignable_arrays_explicitAutoboxing() {
        Class<?>[] from = new Class<?>[]{int.class, boolean.class};
        Class<?>[] to = new Class<?>[]{Integer.class, Boolean.class};
        assertTrue(ClassUtils.isAssignable(from, to, true));
        assertFalse(ClassUtils.isAssignable(from, to, false));
    }

    @Test
    public void testIsAssignable_class_defaultAutoboxing() {
        assertTrue(ClassUtils.isAssignable(Integer.class, Number.class));
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class));
        assertTrue(ClassUtils.isAssignable(Integer.class, int.class));
        assertFalse(ClassUtils.isAssignable(String.class, Integer.class));
    }

    @Test
    public void testIsAssignable_class_nullCases() {
        assertFalse(ClassUtils.isAssignable(String.class, (Class<?>) null, true));
        assertFalse(ClassUtils.isAssignable((Class<?>) null, (Class<?>) null, true));
        assertTrue(ClassUtils.isAssignable((Class<?>) null, Object.class, true));
        assertFalse(ClassUtils.isAssignable((Class<?>) null, int.class, true));
    }

    @Test
    public void testIsAssignable_class_sameClass() {
        assertTrue(ClassUtils.isAssignable(String.class, String.class, false));
        assertTrue(ClassUtils.isAssignable(int.class, int.class, false));
        assertTrue(ClassUtils.isAssignable(void.class, void.class, true));
    }

    @Test
    public void testIsAssignable_class_autoboxingDisabled() {
        assertFalse(ClassUtils.isAssignable(int.class, Integer.class, false));
        assertFalse(ClassUtils.isAssignable(Integer.class, int.class, false));
        assertFalse(ClassUtils.isAssignable(int.class, Object.class, false));
    }

    @Test
    public void testIsAssignable_class_primitiveWidenings() {
        // byte -> short, int, long, float, double
        assertTrue(ClassUtils.isAssignable(byte.class, short.class, false));
        assertTrue(ClassUtils.isAssignable(byte.class, int.class, false));
        assertTrue(ClassUtils.isAssignable(byte.class, long.class, false));
        assertTrue(ClassUtils.isAssignable(byte.class, float.class, false));
        assertTrue(ClassUtils.isAssignable(byte.class, double.class, false));
        assertFalse(ClassUtils.isAssignable(byte.class, char.class, false));
        assertFalse(ClassUtils.isAssignable(byte.class, boolean.class, false));

        // short -> int, long, float, double
        assertTrue(ClassUtils.isAssignable(short.class, int.class, false));
        assertTrue(ClassUtils.isAssignable(short.class, long.class, false));
        assertTrue(ClassUtils.isAssignable(short.class, float.class, false));
        assertTrue(ClassUtils.isAssignable(short.class, double.class, false));
        assertFalse(ClassUtils.isAssignable(short.class, byte.class, false));
        assertFalse(ClassUtils.isAssignable(short.class, char.class, false));

        // char -> int, long, float, double
        assertTrue(ClassUtils.isAssignable(char.class, int.class, false));
        assertTrue(ClassUtils.isAssignable(char.class, long.class, false));
        assertTrue(ClassUtils.isAssignable(char.class, float.class, false));
        assertTrue(ClassUtils.isAssignable(char.class, double.class, false));
        assertFalse(ClassUtils.isAssignable(char.class, short.class, false));
        assertFalse(ClassUtils.isAssignable(char.class, byte.class, false));

        // int -> long, float, double
        assertTrue(ClassUtils.isAssignable(int.class, long.class, false));
        assertTrue(ClassUtils.isAssignable(int.class, float.class, false));
        assertTrue(ClassUtils.isAssignable(int.class, double.class, false));
        assertFalse(ClassUtils.isAssignable(int.class, short.class, false));
        assertFalse(ClassUtils.isAssignable(int.class, byte.class, false));

        // long -> float, double
        assertTrue(ClassUtils.isAssignable(long.class, float.class, false));
        assertTrue(ClassUtils.isAssignable(long.class, double.class, false));
        assertFalse(ClassUtils.isAssignable(long.class, int.class, false));

        // float -> double
        assertTrue(ClassUtils.isAssignable(float.class, double.class, false));
        assertFalse(ClassUtils.isAssignable(float.class, float.class && false, false));
        assertFalse(ClassUtils.isAssignable(float.class, long.class, false));

        // double -> nothing
        assertFalse(ClassUtils.isAssignable(double.class, float.class, false));
        assertFalse(ClassUtils.isAssignable(double.class, int.class, false));

        // boolean -> nothing
        assertFalse(ClassUtils.isAssignable(boolean.class, int.class, false));
        assertFalse(ClassUtils.isAssignable(boolean.class, Object.class, false));
    }

    // Primitive / Wrapper conversions
    // ----------------------------------------------------------------------
    @Test
    public void testPrimitiveToWrapper_singleClass() {
        assertEquals(Boolean.class, ClassUtils.primitiveToWrapper(boolean.class));
        assertEquals(Byte.class, ClassUtils.primitiveToWrapper(byte.class));
        assertEquals(Character.class, ClassUtils.primitiveToWrapper(char.class));
        assertEquals(Short.class, ClassUtils.primitiveToWrapper(short.class));
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(int.class));
        assertEquals(Long.class, ClassUtils.primitiveToWrapper(long.class));
        assertEquals(Float.class, ClassUtils.primitiveToWrapper(float.class));
        assertEquals(Double.class, ClassUtils.primitiveToWrapper(double.class));
        assertEquals(Void.TYPE, ClassUtils.primitiveToWrapper(Void.TYPE));
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
        assertNull(ClassUtils.primitiveToWrapper(null));
    }

    @Test
    public void testPrimitivesToWrappers_array() {
        assertNull(ClassUtils.primitivesToWrappers(null));
        Class<?>[] empty = new Class<?>[0];
        assertSame(empty, ClassUtils.primitivesToWrappers(empty));

        Class<?>[] primitives = new Class<?>[]{int.class, boolean.class, String.class, null};
        Class<?>[] wrappers = ClassUtils.primitivesToWrappers(primitives);
        assertArrayEquals(new Class<?>[]{Integer.class, Boolean.class, String.class, null}, wrappers);
    }

    @Test
    public void testWrapperToPrimitive_singleClass() {
        assertEquals(boolean.class, ClassUtils.wrapperToPrimitive(Boolean.class));
        assertEquals(byte.class, ClassUtils.wrapperToPrimitive(Byte.class));
        assertEquals(char.class, ClassUtils.wrapperToPrimitive(Character.class));
        assertEquals(short.class, ClassUtils.wrapperToPrimitive(Short.class));
        assertEquals(int.class, ClassUtils.wrapperToPrimitive(Integer.class));
        assertEquals(long.class, ClassUtils.wrapperToPrimitive(Long.class));
        assertEquals(float.class, ClassUtils.wrapperToPrimitive(Float.class));
        assertEquals(double.class, ClassUtils.wrapperToPrimitive(Double.class));
        assertNull(ClassUtils.wrapperToPrimitive(Void.class));
        assertNull(ClassUtils.wrapperToPrimitive(Void.TYPE));
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
        assertNull(ClassUtils.wrapperToPrimitive(null));
    }

    @Test
    public void testWrappersToPrimitives_array() {
        assertNull(ClassUtils.wrappersToPrimitives(null));
        Class<?>[] empty = new Class<?>[0];
        assertSame(empty, ClassUtils.wrappersToPrimitives(empty));

        Class<?>[] wrappers = new Class<?>[]{Integer.class, Boolean.class, String.class, null};
        Class<?>[] primitives = ClassUtils.wrappersToPrimitives(wrappers);
        assertArrayEquals(new Class<?>[]{int.class, boolean.class, null, null}, primitives);
    }

    // Inner class
    // ----------------------------------------------------------------------
    @Test
    public void testIsInnerClass_variousClasses() {
        assertFalse(ClassUtils.isInnerClass(null));
        assertFalse(ClassUtils.isInnerClass(String.class));
        assertTrue(ClassUtils.isInnerClass(InnerClass.class));
        assertTrue(ClassUtils.isInnerClass(InnerClass.NestedClass.class));
        assertTrue(ClassUtils.isInnerClass(Map.Entry.class));
    }

    // Class loading
    // ----------------------------------------------------------------------
    @Test
    public void testGetClass_primitiveNames() throws ClassNotFoundException {
        assertEquals(int.class, ClassUtils.getClass("int"));
        assertEquals(boolean.class, ClassUtils.getClass("boolean"));
        assertEquals(float.class, ClassUtils.getClass("float"));
        assertEquals(long.class, ClassUtils.getClass("long"));
        assertEquals(short.class, ClassUtils.getClass("short"));
        assertEquals(byte.class, ClassUtils.getClass("byte"));
        assertEquals(double.class, ClassUtils.getClass("double"));
        assertEquals(char.class, ClassUtils.getClass("char"));
    }

    @Test
    public void testGetClass_arrayNames() throws ClassNotFoundException {
        assertEquals(int[].class, ClassUtils.getClass("int[]"));
        assertEquals(int[][].class, ClassUtils.getClass("int[][]"));
        assertEquals(String[].class, ClassUtils.getClass("java.lang.String[]"));
        assertEquals(String[][].class, ClassUtils.getClass("java.lang.String[][]"));
        assertEquals(int[].class, ClassUtils.getClass("[I"));
        assertEquals(String[].class, ClassUtils.getClass("[Ljava.lang.String;"));
    }

    @Test
    public void testGetClass_standardClasses() throws ClassNotFoundException {
        ClassLoader cl = getClass().getClassLoader();
        assertEquals(String.class, ClassUtils.getClass(cl, "java.lang.String"));
        assertEquals(String.class, ClassUtils.getClass(cl, "java.lang.String", true));
        assertEquals(String.class, ClassUtils.getClass("java.lang.String"));
        assertEquals(String.class, ClassUtils.getClass("java.lang.String", true));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testGetClass_nonExistentClass_throwsException() throws ClassNotFoundException {
        ClassUtils.getClass("non.existent.Class");
    }

    @Test(expected = NullPointerException.class)
    public void testGetClass_nullClassName_throwsException() throws ClassNotFoundException {
        ClassUtils.getClass((String) null);
    }

    // Public method
    // ----------------------------------------------------------------------
    @Test
    public void testGetPublicMethod_directPublicClass() throws Exception {
        Method method = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[0]);
        assertNotNull(method);
        assertEquals("length", method.getName());
    }

    @Test
    public void testGetPublicMethod_interfaceFromNonPublicClass() throws Exception {
        Set<String> set = Collections.unmodifiableSet(new HashSet<String>());
        Method method = ClassUtils.getPublicMethod(set.getClass(), "isEmpty", new Class<?>[0]);
        assertNotNull(method);
        assertTrue(Modifier.isPublic(method.getDeclaringClass().getModifiers()));

        PackagePrivateClass ppc = new PackagePrivateClass();
        Method interfaceMethod = ClassUtils.getPublicMethod(ppc.getClass(), "publicInterfaceMethod", new Class<?>[0]);
        assertNotNull(interfaceMethod);
        assertEquals(PublicInterface.class, interfaceMethod.getDeclaringClass());
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_nonExistentMethod_throwsException() throws Exception {
        ClassUtils.getPublicMethod(String.class, "nonExistentMethod", new Class<?>[0]);
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_packagePrivateOnlyMethod_throwsException() throws Exception {
        ClassUtils.getPublicMethod(PackagePrivateClass.class, "packagePrivateOnlyMethod", new Class<?>[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testGetPublicMethod_nullClass_throwsException() throws Exception {
        ClassUtils.getPublicMethod(null, "length", new Class<?>[0]);
    }

    // toClass
    // ----------------------------------------------------------------------
    @Test
    public void testToClass_null_returnsNull() {
        assertNull(ClassUtils.toClass(null));
    }

    @Test
    public void testToClass_emptyArray_returnsEmptyArray() {
        Class<?>[] result = ClassUtils.toClass(new Object[0]);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testToClass_validArray_returnsClasses() {
        Object[] objects = new Object[]{"hello", 123, null};
        Class<?>[] classes = ClassUtils.toClass(objects);
        assertNotNull(classes);
        assertEquals(3, classes.size() == 0 ? 0 : classes.length);
        assertEquals(String.class, classes[0]);
        assertEquals(Integer.class, classes[1]);
        assertNull(classes[2]);
    }

    // Short canonical name
    // ----------------------------------------------------------------------
    @Test
    public void testGetShortCanonicalName_object_returnsShortCanonicalName() {
        assertEquals("String", ClassUtils.getShortCanonicalName("hello", "default"));
        assertEquals("default", ClassUtils.getShortCanonicalName((Object) null, "default"));
        assertNull(ClassUtils.getShortCanonicalName((Object) null, null));
    }

    @Test
    public void testGetShortCanonicalName_class_returnsShortCanonicalName() {
        assertEquals("String", ClassUtils.getShortCanonicalName(String.class));
        assertEquals("int[]", ClassUtils.getShortCanonicalName(int[].class));
        assertEquals("String[]", ClassUtils.getShortCanonicalName(String[].class));
        assertEquals("Map.Entry", ClassUtils.getShortCanonicalName(Map.Entry.class));
        assertEquals("", ClassUtils.getShortCanonicalName((Class<?>) null));
    }

    @Test
    public void testGetShortCanonicalName_string_returnsShortCanonicalName() {
        assertEquals("String", ClassUtils.getShortCanonicalName("java.lang.String"));
        assertEquals("int[]", ClassUtils.getShortCanonicalName("[I"));
        assertEquals("int[][]", ClassUtils.getShortCanonicalName("[[I"));
        assertEquals("String[]", ClassUtils.getShortCanonicalName("[Ljava.lang.String;"));
        assertEquals("String[][]", ClassUtils.getShortCanonicalName("[[Ljava.lang.String;"));
        assertEquals("Map.Entry", ClassUtils.getShortCanonicalName("java.util.Map$Entry"));
        assertEquals("UnpackagedClass", ClassUtils.getShortCanonicalName("UnpackagedClass"));
        assertEquals("", ClassUtils.getShortCanonicalName((String) null));
        assertEquals("", ClassUtils.getShortCanonicalName(""));
    }

    // Package canonical name
    // ----------------------------------------------------------------------
    @Test
    public void testGetPackageCanonicalName_object_returnsPackageCanonicalName() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("hello", "default"));
        assertEquals("default", ClassUtils.getPackageCanonicalName((Object) null, "default"));
        assertNull(ClassUtils.getPackageCanonicalName((Object) null, null));
    }

    @Test
    public void testGetPackageCanonicalName_class_returnsPackageCanonicalName() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String.class));
        assertEquals("java.util", ClassUtils.getPackageCanonicalName(Map.Entry.class));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String[].class));
        assertEquals("", ClassUtils.getPackageCanonicalName(int[].class));
        assertEquals("", ClassUtils.getPackageCanonicalName((Class<?>) null));
    }

    @Test
    public void testGetPackageCanonicalName_string_returnsPackageCanonicalName() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("java.lang.String"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[Ljava.lang.String;"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[[Ljava.lang.String;"));
        assertEquals("java.util", ClassUtils.getPackageCanonicalName("java.util.Map$Entry"));
        assertEquals("", ClassUtils.getPackageCanonicalName("[I"));
        assertEquals("", ClassUtils.getPackageCanonicalName("[[I"));
        assertEquals("", ClassUtils.getPackageCanonicalName("UnpackagedClass"));
        assertEquals("", ClassUtils.getPackageCanonicalName((String) null));
        assertEquals("", ClassUtils.getPackageCanonicalName(""));
    }
}
