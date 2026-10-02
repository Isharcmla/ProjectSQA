import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ClassUtilsTest {

    // Helper classes for testing
    public static class OuterClass {
        public class InnerClass {
        }
    }

    public interface TestInterface {
        void doSomething();
    }

    public static class TestImpl implements TestInterface {
        public void doSomething() {
        }
    }

    public static class ParentClass {
    }

    public static class ChildClass extends ParentClass {
    }

    // -------------------- getShortClassName(Object, String) --------------------

    @Test
    public void testGetShortClassName_ObjectNull_ReturnsValueIfNull() {
        String result = ClassUtils.getShortClassName((Object) null, "NULL");
        Assert.assertEquals("NULL", result);
    }

    @Test
    public void testGetShortClassName_ObjectValid_ReturnsShortName() {
        String result = ClassUtils.getShortClassName(new String("test"), "NULL");
        Assert.assertEquals("String", result);
    }

    // -------------------- getShortClassName(Class) --------------------

    @Test
    public void testGetShortClassName_ClassNull_ReturnsEmpty() {
        String result = ClassUtils.getShortClassName((Class<?>) null);
        Assert.assertEquals("", result);
    }

    @Test
    public void testGetShortClassName_ClassValid_ReturnsShortName() {
        String result = ClassUtils.getShortClassName(String.class);
        Assert.assertEquals("String", result);
    }

    @Test
    public void testGetShortClassName_InnerClass_ReturnsDotSeparated() {
        String result = ClassUtils.getShortClassName(OuterClass.InnerClass.class);
        Assert.assertTrue(result.contains("."));
    }

    @Test
    public void testGetShortClassName_ArrayClass_ReturnsWithBrackets() {
        String result = ClassUtils.getShortClassName(String[].class);
        Assert.assertEquals("String[]", result);
    }

    @Test
    public void testGetShortClassName_PrimitiveArrayClass_ReturnsAbbreviation() {
        String result = ClassUtils.getShortClassName(int[].class);
        Assert.assertEquals("int[]", result);
    }

    // -------------------- getShortClassName(String) --------------------

    @Test
    public void testGetShortClassName_StringNull_ReturnsEmpty() {
        String result = ClassUtils.getShortClassName((String) null);
        Assert.assertEquals("", result);
    }

    @Test
    public void testGetShortClassName_StringEmpty_ReturnsEmpty() {
        String result = ClassUtils.getShortClassName("");
        Assert.assertEquals("", result);
    }

    @Test
    public void testGetShortClassName_StringNormal_ReturnsShortName() {
        String result = ClassUtils.getShortClassName("java.lang.String");
        Assert.assertEquals("String", result);
    }

    @Test
    public void testGetShortClassName_StringNoPackage_ReturnsSameName() {
        String result = ClassUtils.getShortClassName("String");
        Assert.assertEquals("String", result);
    }

    @Test
    public void testGetShortClassName_StringArrayEncoding_ReturnsShortNameWithBrackets() {
        String result = ClassUtils.getShortClassName("[Ljava.lang.String;");
        Assert.assertEquals("String[]", result);
    }

    @Test
    public void testGetShortClassName_StringPrimitiveArrayEncoding_ReturnsAbbrevWithBrackets() {
        String result = ClassUtils.getShortClassName("[I");
        Assert.assertEquals("int[]", result);
    }

    @Test
    public void testGetShortClassName_StringMultiDimArray_ReturnsMultipleBrackets() {
        String result = ClassUtils.getShortClassName("[[Ljava.lang.String;");
        Assert.assertEquals("String[][]", result);
    }

    // -------------------- getPackageName(Object, String) --------------------

    @Test
    public void testGetPackageName_ObjectNull_ReturnsValueIfNull() {
        String result = ClassUtils.getPackageName((Object) null, "NULL");
        Assert.assertEquals("NULL", result);
    }

    @Test
    public void testGetPackageName_ObjectValid_ReturnsPackageName() {
        String result = ClassUtils.getPackageName(new String("test"), "NULL");
        Assert.assertEquals("java.lang", result);
    }

    // -------------------- getPackageName(Class) --------------------

    @Test
    public void testGetPackageName_ClassNull_ReturnsEmpty() {
        String result = ClassUtils.getPackageName((Class<?>) null);
        Assert.assertEquals("", result);
    }

    @Test
    public void testGetPackageName_ClassValid_ReturnsPackageName() {
        String result = ClassUtils.getPackageName(String.class);
        Assert.assertEquals("java.lang", result);
    }

    // -------------------- getPackageName(String) --------------------

    @Test
    public void testGetPackageName_StringNull_ReturnsEmpty() {
        String result = ClassUtils.getPackageName((String) null);
        Assert.assertEquals("", result);
    }

    @Test
    public void testGetPackageName_StringEmpty_ReturnsEmpty() {
        String result = ClassUtils.getPackageName("");
        Assert.assertEquals("", result);
    }

    @Test
    public void testGetPackageName_StringNoPackage_ReturnsEmpty() {
        String result = ClassUtils.getPackageName("String");
        Assert.assertEquals("", result);
    }

    @Test
    public void testGetPackageName_StringNormal_ReturnsPackageName() {
        String result = ClassUtils.getPackageName("java.lang.String");
        Assert.assertEquals("java.lang", result);
    }

    @Test
    public void testGetPackageName_StringArrayEncoding_ReturnsPackageName() {
        String result = ClassUtils.getPackageName("[Ljava.lang.String;");
        Assert.assertEquals("java.lang", result);
    }

    // -------------------- getAllSuperclasses --------------------

    @Test
    public void testGetAllSuperclasses_Null_ReturnsNull() {
        List<Class<?>> result = ClassUtils.getAllSuperclasses(null);
        Assert.assertNull(result);
    }

    @Test
    public void testGetAllSuperclasses_ChildClass_ReturnsSuperclassesList() {
        List<Class<?>> result = ClassUtils.getAllSuperclasses(ChildClass.class);
        Assert.assertTrue(result.contains(ParentClass.class));
        Assert.assertTrue(result.contains(Object.class));
    }

    @Test
    public void testGetAllSuperclasses_ObjectClass_ReturnsEmptyList() {
        List<Class<?>> result = ClassUtils.getAllSuperclasses(Object.class);
        Assert.assertTrue(result.isEmpty());
    }

    // -------------------- getAllInterfaces --------------------

    @Test
    public void testGetAllInterfaces_Null_ReturnsNull() {
        List<Class<?>> result = ClassUtils.getAllInterfaces(null);
        Assert.assertNull(result);
    }

    @Test
    public void testGetAllInterfaces_ImplClass_ReturnsInterfaceList() {
        List<Class<?>> result = ClassUtils.getAllInterfaces(TestImpl.class);
        Assert.assertTrue(result.contains(TestInterface.class));
    }

    @Test
    public void testGetAllInterfaces_NoInterfaces_ReturnsEmptyList() {
        List<Class<?>> result = ClassUtils.getAllInterfaces(ParentClass.class);
        Assert.assertTrue(result.isEmpty());
    }

    // -------------------- convertClassNamesToClasses --------------------

    @Test
    public void testConvertClassNamesToClasses_Null_ReturnsNull() {
        List<Class<?>> result = ClassUtils.convertClassNamesToClasses(null);
        Assert.assertNull(result);
    }

    @Test
    public void testConvertClassNamesToClasses_ValidNames_ReturnsClasses() {
        List<String> names = new ArrayList<String>();
        names.add("java.lang.String");
        names.add("java.lang.Integer");
        List<Class<?>> result = ClassUtils.convertClassNamesToClasses(names);
        Assert.assertEquals(String.class, result.get(0));
        Assert.assertEquals(Integer.class, result.get(1));
    }

    @Test
    public void testConvertClassNamesToClasses_InvalidName_ReturnsNullElement() {
        List<String> names = new ArrayList<String>();
        names.add("non.existent.ClassName");
        List<Class<?>> result = ClassUtils.convertClassNamesToClasses(names);
        Assert.assertNull(result.get(0));
    }

    @Test
    public void testConvertClassNamesToClasses_EmptyList_ReturnsEmptyList() {
        List<String> names = new ArrayList<String>();
        List<Class<?>> result = ClassUtils.convertClassNamesToClasses(names);
        Assert.assertTrue(result.isEmpty());
    }

    // -------------------- convertClassesToClassNames --------------------

    @Test
    public void testConvertClassesToClassNames_Null_ReturnsNull() {
        List<String> result = ClassUtils.convertClassesToClassNames(null);
        Assert.assertNull(result);
    }

    @Test
    public void testConvertClassesToClassNames_ValidClasses_ReturnsNames() {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(String.class);
        classes.add(Integer.class);
        List<String> result = ClassUtils.convertClassesToClassNames(classes);
        Assert.assertEquals("java.lang.String", result.get(0));
        Assert.assertEquals("java.lang.Integer", result.get(1));
    }

    @Test
    public void testConvertClassesToClassNames_NullElement_ReturnsNullElement() {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(null);
        List<String> result = ClassUtils.convertClassesToClassNames(classes);
        Assert.assertNull(result.get(0));
    }

    // -------------------- isAssignable(Class[], Class[]) --------------------

    @Test
    public void testIsAssignable_ArraysDefaultAutoboxing_ReturnsTrue() {
        Class<?>[] classArray = new Class<?>[]{Integer.class};
        Class<?>[] toClassArray = new Class<?>[]{Integer.class};
        Assert.assertTrue(ClassUtils.isAssignable(classArray, toClassArray));
    }

    // -------------------- isAssignable(Class[], Class[], boolean) --------------------

    @Test
    public void testIsAssignable_ArraysDifferentLength_ReturnsFalse() {
        Class<?>[] classArray = new Class<?>[]{String.class};
        Class<?>[] toClassArray = new Class<?>[]{String.class, Integer.class};
        Assert.assertFalse(ClassUtils.isAssignable(classArray, toClassArray, true));
    }

    @Test
    public void testIsAssignable_ArraysNullBoth_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null, true));
    }

    @Test
    public void testIsAssignable_ArraysNullClassArray_ReturnsTrueIfEmptyExpected() {
        Assert.assertTrue(ClassUtils.isAssignable(null, new Class<?>[0], true));
    }

    @Test
    public void testIsAssignable_ArraysNullToClassArray_ReturnsTrueIfEmpty() {
        Assert.assertTrue(ClassUtils.isAssignable(new Class<?>[0], null, true));
    }

    @Test
    public void testIsAssignable_ArraysValidAssignable_ReturnsTrue() {
        Class<?>[] classArray = new Class<?>[]{String.class, Integer.TYPE};
        Class<?>[] toClassArray = new Class<?>[]{Object.class, Long.TYPE};
        Assert.assertTrue(ClassUtils.isAssignable(classArray, toClassArray, true));
    }

    @Test
    public void testIsAssignable_ArraysNotAssignable_ReturnsFalse() {
        Class<?>[] classArray = new Class<?>[]{String.class};
        Class<?>[] toClassArray = new Class<?>[]{Integer.class};
        Assert.assertFalse(ClassUtils.isAssignable(classArray, toClassArray, true));
    }

    // -------------------- isAssignable(Class, Class) --------------------

    @Test
    public void testIsAssignable_ClassDefault_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Integer.class, Object.class));
    }

    // -------------------- isAssignable(Class, Class, boolean) --------------------

    @Test
    public void testIsAssignable_ToClassNull_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(String.class, null, true));
    }

    @Test
    public void testIsAssignable_ClsNullToClassNonPrimitive_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(null, String.class, true));
    }

    @Test
    public void testIsAssignable_ClsNullToClassPrimitive_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(null, Integer.TYPE, true));
    }

    @Test
    public void testIsAssignable_AutoboxingPrimitiveToWrapper_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.class, true));
    }

    @Test
    public void testIsAssignable_AutoboxingWrapperToPrimitive_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Integer.class, Integer.TYPE, true));
    }

    @Test
    public void testIsAssignable_AutoboxingVoidTypeToWrapper_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(Void.TYPE, String.class, true));
    }

    @Test
    public void testIsAssignable_NoAutoboxingWrapperNotAssignableToPrimitive_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(Integer.class, Integer.TYPE, false));
    }

    @Test
    public void testIsAssignable_SameClass_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(String.class, String.class, true));
    }

    @Test
    public void testIsAssignable_PrimitiveToNonPrimitiveNotSame_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(Integer.TYPE, String.class, false));
    }

    @Test
    public void testIsAssignable_IntToLong_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Integer.TYPE, Long.TYPE, false));
    }

    @Test
    public void testIsAssignable_IntToFloat_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Integer.TYPE, Float.TYPE, false));
    }

    @Test
    public void testIsAssignable_IntToDouble_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Integer.TYPE, Double.TYPE, false));
    }

    @Test
    public void testIsAssignable_IntToBoolean_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(Integer.TYPE, Boolean.TYPE, false));
    }

    @Test
    public void testIsAssignable_LongToFloat_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Long.TYPE, Float.TYPE, false));
    }

    @Test
    public void testIsAssignable_LongToDouble_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Long.TYPE, Double.TYPE, false));
    }

    @Test
    public void testIsAssignable_LongToInt_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(Long.TYPE, Integer.TYPE, false));
    }

    @Test
    public void testIsAssignable_BooleanToBoolean_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.TYPE, false));
    }

    @Test
    public void testIsAssignable_BooleanToInt_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(Boolean.TYPE, Integer.TYPE, false));
    }

    @Test
    public void testIsAssignable_DoubleToDouble_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Double.TYPE, Double.TYPE, false));
    }

    @Test
    public void testIsAssignable_DoubleToFloat_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(Double.TYPE, Float.TYPE, false));
    }

    @Test
    public void testIsAssignable_FloatToDouble_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Float.TYPE, Double.TYPE, false));
    }

    @Test
    public void testIsAssignable_FloatToInt_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(Float.TYPE, Integer.TYPE, false));
    }

    @Test
    public void testIsAssignable_CharToInt_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Character.TYPE, Integer.TYPE, false));
    }

    @Test
    public void testIsAssignable_CharToLong_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Character.TYPE, Long.TYPE, false));
    }

    @Test
    public void testIsAssignable_CharToFloat_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Character.TYPE, Float.TYPE, false));
    }

    @Test
    public void testIsAssignable_CharToDouble_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Character.TYPE, Double.TYPE, false));
    }

    @Test
    public void testIsAssignable_CharToBoolean_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(Character.TYPE, Boolean.TYPE, false));
    }

    @Test
    public void testIsAssignable_ShortToInt_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Short.TYPE, Integer.TYPE, false));
    }

    @Test
    public void testIsAssignable_ShortToLong_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Short.TYPE, Long.TYPE, false));
    }

    @Test
    public void testIsAssignable_ShortToFloat_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Short.TYPE, Float.TYPE, false));
    }

    @Test
    public void testIsAssignable_ShortToDouble_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Short.TYPE, Double.TYPE, false));
    }

    @Test
    public void testIsAssignable_ShortToByte_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(Short.TYPE, Byte.TYPE, false));
    }

    @Test
    public void testIsAssignable_ByteToShort_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Byte.TYPE, Short.TYPE, false));
    }

    @Test
    public void testIsAssignable_ByteToInt_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Byte.TYPE, Integer.TYPE, false));
    }

    @Test
    public void testIsAssignable_ByteToLong_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Byte.TYPE, Long.TYPE, false));
    }

    @Test
    public void testIsAssignable_ByteToFloat_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Byte.TYPE, Float.TYPE, false));
    }

    @Test
    public void testIsAssignable_ByteToDouble_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(Byte.TYPE, Double.TYPE, false));
    }

    @Test
    public void testIsAssignable_ByteToBoolean_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(Byte.TYPE, Boolean.TYPE, false));
    }

    @Test
    public void testIsAssignable_ReferenceTypeAssignableFrom_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isAssignable(ChildClass.class, ParentClass.class, true));
    }

    @Test
    public void testIsAssignable_ReferenceTypeNotAssignableFrom_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isAssignable(ParentClass.class, ChildClass.class, true));
    }

    // -------------------- primitiveToWrapper --------------------

    @Test
    public void testPrimitiveToWrapper_Null_ReturnsNull() {
        Assert.assertNull(ClassUtils.primitiveToWrapper(null));
    }

    @Test
    public void testPrimitiveToWrapper_Primitive_ReturnsWrapper() {
        Assert.assertEquals(Integer.class, ClassUtils.primitiveToWrapper(Integer.TYPE));
    }

    @Test
    public void testPrimitiveToWrapper_NonPrimitive_ReturnsSameClass() {
        Assert.assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
    }

    @Test
    public void testPrimitiveToWrapper_VoidType_ReturnsVoidType() {
        Assert.assertEquals(Void.TYPE, ClassUtils.primitiveToWrapper(Void.TYPE));
    }

    // -------------------- primitivesToWrappers --------------------

    @Test
    public void testPrimitivesToWrappers_Null_ReturnsNull() {
        Assert.assertNull(ClassUtils.primitivesToWrappers(null));
    }

    @Test
    public void testPrimitivesToWrappers_Empty_ReturnsEmptyArray() {
        Class<?>[] input = new Class<?>[0];
        Class<?>[] result = ClassUtils.primitivesToWrappers(input);
        Assert.assertArrayEquals(input, result);
    }

    @Test
    public void testPrimitivesToWrappers_ValidArray_ReturnsWrappersArray() {
        Class<?>[] input = new Class<?>[]{Integer.TYPE, Boolean.TYPE};
        Class<?>[] result = ClassUtils.primitivesToWrappers(input);
        Assert.assertArrayEquals(new Class<?>[]{Integer.class, Boolean.class}, result);
    }

    // -------------------- wrapperToPrimitive --------------------

    @Test
    public void testWrapperToPrimitive_Wrapper_ReturnsPrimitive() {
        Assert.assertEquals(Integer.TYPE, ClassUtils.wrapperToPrimitive(Integer.class));
    }

    @Test
    public void testWrapperToPrimitive_NonWrapper_ReturnsNull() {
        Assert.assertNull(ClassUtils.wrapperToPrimitive(String.class));
    }

    @Test
    public void testWrapperToPrimitive_Null_ReturnsNull() {
        Assert.assertNull(ClassUtils.wrapperToPrimitive(null));
    }

    // -------------------- wrappersToPrimitives --------------------

    @Test
    public void testWrappersToPrimitives_Null_ReturnsNull() {
        Assert.assertNull(ClassUtils.wrappersToPrimitives(null));
    }

    @Test
    public void testWrappersToPrimitives_Empty_ReturnsEmptyArray() {
        Class<?>[] input = new Class<?>[0];
        Class<?>[] result = ClassUtils.wrappersToPrimitives(input);
        Assert.assertArrayEquals(input, result);
    }

    @Test
    public void testWrappersToPrimitives_ValidArray_ReturnsPrimitivesArray() {
        Class<?>[] input = new Class<?>[]{Integer.class, Boolean.class};
        Class<?>[] result = ClassUtils.wrappersToPrimitives(input);
        Assert.assertArrayEquals(new Class<?>[]{Integer.TYPE, Boolean.TYPE}, result);
    }

    @Test
    public void testWrappersToPrimitives_NonWrapperElement_ReturnsNullElement() {
        Class<?>[] input = new Class<?>[]{String.class};
        Class<?>[] result = ClassUtils.wrappersToPrimitives(input);
        Assert.assertNull(result[0]);
    }

    // -------------------- isInnerClass --------------------

    @Test
    public void testIsInnerClass_Null_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isInnerClass(null));
    }

    @Test
    public void testIsInnerClass_InnerClass_ReturnsTrue() {
        Assert.assertTrue(ClassUtils.isInnerClass(OuterClass.InnerClass.class));
    }

    @Test
    public void testIsInnerClass_TopLevelClass_ReturnsFalse() {
        Assert.assertFalse(ClassUtils.isInnerClass(String.class));
    }

    // -------------------- getClass(ClassLoader, String, boolean) --------------------

    @Test
    public void testGetClass_ClassLoaderStringBoolean_ValidClassName_ReturnsClass() throws ClassNotFoundException {
        ClassLoader cl = this.getClass().getClassLoader();
        Class<?> result = ClassUtils.getClass(cl, "java.lang.String", true);
        Assert.assertEquals(String.class, result);
    }

    @Test
    public void testGetClass_ClassLoaderStringBoolean_PrimitiveAbbreviation_ReturnsPrimitiveClass() throws ClassNotFoundException {
        ClassLoader cl = this.getClass().getClassLoader();
        Class<?> result = ClassUtils.getClass(cl, "int", true);
        Assert.assertEquals(Integer.TYPE, result);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testGetClass_ClassLoaderStringBoolean_InvalidClassName_ThrowsException() throws ClassNotFoundException {
        ClassLoader cl = this.getClass().getClassLoader();
        ClassUtils.getClass(cl, "non.existent.ClassName", true);
    }

    @Test
    public void testGetClass_ClassLoaderStringBoolean_ArrayClassName_ReturnsArrayClass() throws ClassNotFoundException {
        ClassLoader cl = this.getClass().getClassLoader();
        Class<?> result = ClassUtils.getClass(cl, "java.lang.String[]", true);
        Assert.assertEquals(String[].class, result);
    }

    // -------------------- getClass(ClassLoader, String) --------------------

    @Test
    public void testGetClass_ClassLoaderString_ValidClassName_ReturnsClass() throws ClassNotFoundException {
        ClassLoader cl = this.getClass().getClassLoader();
        Class<?> result = ClassUtils.getClass(cl, "java.lang.Integer");
        Assert.assertEquals(Integer.class, result);
    }

    // -------------------- getClass(String) --------------------

    @Test
    public void testGetClass_String_ValidClassName_ReturnsClass() throws ClassNotFoundException {
        Class<?> result = ClassUtils.getClass("java.lang.String");
        Assert.assertEquals(String.class, result);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testGetClass_String_InvalidClassName_ThrowsException() throws ClassNotFoundException {
        ClassUtils.getClass("non.existent.ClassName");
    }

    // -------------------- getClass(String, boolean) --------------------

    @Test
    public void testGetClass_StringBoolean_ValidClassName_ReturnsClass() throws ClassNotFoundException {
        Class<?> result = ClassUtils.getClass("java.lang.Long", false);
        Assert.assertEquals(Long.class, result);
    }

    // -------------------- getPublicMethod --------------------

    @Test
    public void testGetPublicMethod_PublicMethod_ReturnsMethod() throws Exception {
        Method method = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[0]);
        Assert.assertNotNull(method);
        Assert.assertEquals("length", method.getName());
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_NonExistentMethod_ThrowsException() throws Exception {
        ClassUtils.getPublicMethod(String.class, "nonExistentMethod", new Class<?>[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testGetPublicMethod_NullClass_ThrowsException() throws Exception {
        ClassUtils.getPublicMethod(null, "toString", new Class<?>[0]);
    }

    // -------------------- toClass --------------------

    @Test
    public void testToClass_Null_ReturnsNull() {
        Assert.assertNull(ClassUtils.toClass(null));
    }

    @Test
    public void testToClass_EmptyArray_ReturnsEmptyArray() {
        Object[] input = new Object[0];
        Class<?>[] result = ClassUtils.toClass(input);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void testToClass_ValidArray_ReturnsClassesArray() {
        Object[] input = new Object[]{"string", Integer.valueOf(1)};
        Class<?>[] result = ClassUtils.toClass(input);
        Assert.assertArrayEquals(new Class<?>[]{String.class, Integer.class}, result);
    }

    // -------------------- getShortCanonicalName --------------------

    @Test
    public void testGetShortCanonicalName_ObjectNull_ReturnsValueIfNull() {
        String result = ClassUtils.getShortCanonicalName((Object) null, "NULL");
        Assert.assertEquals("NULL", result);
    }

    @Test
    public void testGetShortCanonicalName_ObjectValid_ReturnsShortName() {
        String result = ClassUtils.getShortCanonicalName(new String("test"), "NULL");
        Assert.assertEquals("String", result);
    }

    @Test
    public void testGetShortCanonicalName_ClassNull_ReturnsEmpty() {
        String result = ClassUtils.getShortCanonicalName((Class<?>) null);
        Assert.assertEquals("", result);
    }

    @Test
    public void testGetShortCanonicalName_ClassValid_ReturnsShortName() {
        String result = ClassUtils.getShortCanonicalName(String.class);
        Assert.assertEquals("String", result);
    }

    @Test
    public void testGetShortCanonicalName_ClassArray_ReturnsShortNameWithBrackets() {
        String result = ClassUtils.getShortCanonicalName(String[].class);
        Assert.assertEquals("String[]", result);
    }

    @Test
    public void testGetShortCanonicalName_StringNormal_ReturnsShortName() {
        String result = ClassUtils.getShortCanonicalName("java.lang.String");
        Assert.assertEquals("String", result);
    }

    @Test
    public void testGetShortCanonicalName_StringArrayEncoding_ReturnsShortNameWithBrackets() {
        String result = ClassUtils.getShortCanonicalName("[Ljava.lang.String;");
        Assert.assertEquals("String[]", result);
    }

    @Test
    public void testGetShortCanonicalName_StringPrimitiveArrayEncoding_ReturnsAbbrevWithBrackets() {
        String result = ClassUtils.getShortCanonicalName("[I");
        Assert.assertEquals("int[]", result);
    }

    // -------------------- getPackageCanonicalName --------------------

    @Test
    public void testGetPackageCanonicalName_ObjectNull_ReturnsValueIfNull() {
        String result = ClassUtils.getPackageCanonicalName((Object) null, "NULL");
        Assert.assertEquals("NULL", result);
    }

    @Test
    public void testGetPackageCanonicalName_ObjectValid_ReturnsPackageName() {
        String result = ClassUtils.getPackageCanonicalName(new String("test"), "NULL");
        Assert.assertEquals("java.lang", result);
    }

    @Test
    public void testGetPackageCanonicalName_ClassNull_ReturnsEmpty() {
        String result = ClassUtils.getPackageCanonicalName((Class<?>) null);
        Assert.assertEquals("", result);
    }

    @Test
    public void testGetPackageCanonicalName_ClassValid_ReturnsPackageName() {
        String result = ClassUtils.getPackageCanonicalName(String.class);
        Assert.assertEquals("java.lang", result);
    }

    @Test
    public void testGetPackageCanonicalName_ClassArray_ReturnsPackageName() {
        String result = ClassUtils.getPackageCanonicalName(String[].class);
        Assert.assertEquals("java.lang", result);
    }

    @Test
    public void testGetPackageCanonicalName_StringArrayEncoding_ReturnsPackageName() {
        String result = ClassUtils.getPackageCanonicalName("[Ljava.lang.String;");
        Assert.assertEquals("java.lang", result);
    }

    @Test
    public void testGetPackageCanonicalName_StringPrimitiveArrayEncoding_ReturnsEmpty() {
        String result = ClassUtils.getPackageCanonicalName("[I");
        Assert.assertEquals("", result);
    }

    @Test
    public void testGetPackageCanonicalName_StringNormal_ReturnsPackageName() {
        String result = ClassUtils.getPackageCanonicalName("java.lang.String");
        Assert.assertEquals("java.lang", result);
    }

    // -------------------- Constructor --------------------

    @Test
    public void testConstructor_DefaultConstructor_CreatesInstance() {
        ClassUtils instance = new ClassUtils();
        Assert.assertNotNull(instance);
    }
}
