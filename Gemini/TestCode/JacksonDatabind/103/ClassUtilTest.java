package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;

public class ClassUtilTest {

    // --- Helper Classes, Interfaces, Enums & Annotations for Testing ---

    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnnotation {
        String value() default "";
    }

    @JacksonStdImpl
    private static class AnnotatedWithJacksonStdImpl {}

    private static class UnannotatedClass {}

    private interface BaseInterface {}
    private interface SubInterface extends BaseInterface {}

    private static class ParentClass implements BaseInterface {}
    private static class ChildClass extends ParentClass implements SubInterface {}

    private enum SimpleEnum {
        VAL1,
        @TestAnnotation("annotated")
        VAL2
    }

    private enum ComplexEnum {
        A {
            @Override
            public String toString() {
                return "A";
            }
        },
        B {
            @Override
            public String toString() {
                return "B";
            }
        }
    }

    public static class PublicNoArgClass {
        public PublicNoArgClass() {}
    }

    private static class PrivateNoArgClass {
        private PrivateNoArgClass() {}
    }

    public static class ThrowingConstructorClass {
        public ThrowingConstructorClass() {
            throw new IllegalStateException("Simulated ctor failure");
        }
    }

    public static class NoDefaultCtorClass {
        public NoDefaultCtorClass(String arg) {}
    }

    public class NonStaticInnerClass {
        public NonStaticInnerClass() {}
    }

    public static class GetterTestClass {
        public int getValid() { return 1; }
        public static int getStatic() { return 1; }
        public int getWithParam(int a) { return a; }
        public void getVoid() {}
    }

    private static abstract class AbstractSample {
        public abstract void foo();
    }

    private static class NamedImpl implements Named {
        private final String name;
        public NamedImpl(String name) { this.name = name; }
        @Override
        public String getName() { return name; }
    }

    // --- Tests for Iterator Methods ---

    @Test
    public void testEmptyIterator_normal_returnsEmptyIterator() {
        Iterator<String> it = ClassUtil.emptyIterator();
        Assert.assertNotNull(it);
        Assert.assertFalse(it.hasNext());
    }

    // --- Tests for Inheritance Methods ---

    @Test
    public void testFindSuperTypes_javaType_validHierarchy() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType childType = tf.constructType(ChildClass.class);

        List<JavaType> types = ClassUtil.findSuperTypes(childType, null, true);
        Assert.assertFalse(types.isEmpty());
        Assert.assertEquals(ChildClass.class, types.get(0).getRawClass());

        // Test with endBefore
        List<JavaType> typesLimited = ClassUtil.findSuperTypes(childType, ParentClass.class, true);
        Assert.assertFalse(typesLimited.isEmpty());

        // Test with null / Object / endBefore matched directly
        Assert.assertTrue(ClassUtil.findSuperTypes((JavaType) null, null, true).isEmpty());
        Assert.assertTrue(ClassUtil.findSuperTypes(tf.constructType(Object.class), null, true).isEmpty());
        Assert.assertTrue(ClassUtil.findSuperTypes(childType, ChildClass.class, true).isEmpty());
    }

    @Test
    public void testFindRawSuperTypes_class_validHierarchy() {
        List<Class<?>> types = ClassUtil.findRawSuperTypes(ChildClass.class, null, true);
        Assert.assertTrue(types.contains(ChildClass.class));
        Assert.assertTrue(types.contains(ParentClass.class));
        Assert.assertTrue(types.contains(SubInterface.class));
        Assert.assertTrue(types.contains(BaseInterface.class));

        // Test edge cases
        Assert.assertTrue(ClassUtil.findRawSuperTypes(null, null, true).isEmpty());
        Assert.assertTrue(ClassUtil.findRawSuperTypes(Object.class, null, true).isEmpty());
        Assert.assertTrue(ClassUtil.findRawSuperTypes(ChildClass.class, ChildClass.class, true).isEmpty());
    }

    @Test
    public void testFindSuperClasses_class_validHierarchy() {
        List<Class<?>> supers = ClassUtil.findSuperClasses(ChildClass.class, null, true);
        Assert.assertEquals(3, supers.size());
        Assert.assertEquals(ChildClass.class, supers.get(0));
        Assert.assertEquals(ParentClass.class, supers.get(1));
        Assert.assertEquals(Object.class, supers.get(2));

        List<Class<?>> supersNoSelf = ClassUtil.findSuperClasses(ChildClass.class, null, false);
        Assert.assertEquals(2, supersNoSelf.size());
        Assert.assertEquals(ParentClass.class, supersNoSelf.get(0));

        List<Class<?>> supersLimited = ClassUtil.findSuperClasses(ChildClass.class, ParentClass.class, false);
        Assert.assertTrue(supersLimited.isEmpty());

        Assert.assertTrue(ClassUtil.findSuperClasses(null, null, true).isEmpty());
        Assert.assertTrue(ClassUtil.findSuperClasses(ChildClass.class, ChildClass.class, true).isEmpty());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindSuperTypes_deprecatedVariants_returnsExpected() {
        List<Class<?>> list1 = ClassUtil.findSuperTypes(ChildClass.class, null);
        Assert.assertFalse(list1.isEmpty());

        List<Class<?>> customList = new ArrayList<Class<?>>();
        List<Class<?>> list2 = ClassUtil.findSuperTypes(ChildClass.class, null, customList);
        Assert.assertSame(customList, list2);
        Assert.assertFalse(list2.isEmpty());
    }

    // --- Tests for Class Type Detection Methods ---

    @Test
    public void testCanBeABeanType_variousTypes_returnsCorrectDescription() {
        Assert.assertEquals("annotation", ClassUtil.canBeABeanType(TestAnnotation.class));
        Assert.assertEquals("array", ClassUtil.canBeABeanType(int[].class));
        Assert.assertEquals("enum", ClassUtil.canBeABeanType(SimpleEnum.class));
        Assert.assertEquals("primitive", ClassUtil.canBeABeanType(int.class));
        Assert.assertNull(ClassUtil.canBeABeanType(PublicNoArgClass.class));
    }

    @Test
    public void testIsLocalType_variousTypes_returnsCorrectStatus() {
        class MethodLocalClass {}
        Assert.assertEquals("local/anonymous", ClassUtil.isLocalType(MethodLocalClass.class, true));
        Assert.assertEquals("non-static member class", ClassUtil.isLocalType(NonStaticInnerClass.class, false));
        Assert.assertNull(ClassUtil.isLocalType(NonStaticInnerClass.class, true));
        Assert.assertNull(ClassUtil.isLocalType(PublicNoArgClass.class, false));
    }

    @Test
    public void testGetOuterClass_variousTypes_returnsEnclosingClassOrNull() {
        class MethodLocalClass {}
        Assert.assertNull(ClassUtil.getOuterClass(MethodLocalClass.class));
        Assert.assertEquals(ClassUtilTest.class, ClassUtil.getOuterClass(NonStaticInnerClass.class));
        Assert.assertNull(ClassUtil.getOuterClass(PublicNoArgClass.class));
    }

    @Test
    public void testIsProxyType_variousTypes_returnsExpected() {
        Assert.assertFalse(ClassUtil.isProxyType(String.class));
        // Mock proxy class name check
        class DummyCglibProxy implements net.sf.cglib.proxy.Factory {
            public Object newInstance(Class[] a, Object[] b, org.aopalliance.intercept.MethodInterceptor[] c) { return null; }
            public Object newInstance(org.aopalliance.intercept.MethodInterceptor[] a) { return null; }
            public Object newInstance(org.aopalliance.intercept.MethodInterceptor a) { return null; }
            public org.aopalliance.intercept.MethodInterceptor getCallback(int a) { return null; }
            public org.aopalliance.intercept.MethodInterceptor[] getCallbacks() { return null; }
            public void setCallback(int a, org.aopalliance.intercept.MethodInterceptor b) {}
            public void setCallbacks(org.aopalliance.intercept.MethodInterceptor[] a) {}
        }
        Assert.assertFalse(ClassUtil.isProxyType(DummyCglibProxy.class));
    }

    @Test
    public void testIsConcrete_classAndMember_returnsExpected() throws Exception {
        Assert.assertTrue(ClassUtil.isConcrete(PublicNoArgClass.class));
        Assert.assertFalse(ClassUtil.isConcrete(BaseInterface.class));
        Assert.assertFalse(ClassUtil.isConcrete(AbstractSample.class));

        Method concreteMethod = PublicNoArgClass.class.getMethod("toString");
        Method abstractMethod = AbstractSample.class.getMethod("foo");
        Assert.assertTrue(ClassUtil.isConcrete(concreteMethod));
        Assert.assertFalse(ClassUtil.isConcrete(abstractMethod));
    }

    @Test
    public void testIsCollectionMapOrArray_variousTypes_returnsExpected() {
        Assert.assertTrue(ClassUtil.isCollectionMapOrArray(int[].class));
        Assert.assertTrue(ClassUtil.isCollectionMapOrArray(String[].class));
        Assert.assertTrue(ClassUtil.isCollectionMapOrArray(ArrayList.class));
        Assert.assertTrue(ClassUtil.isCollectionMapOrArray(HashMap.class));
        Assert.assertFalse(ClassUtil.isCollectionMapOrArray(String.class));
        Assert.assertFalse(ClassUtil.isCollectionMapOrArray(int.class));
    }

    @Test
    public void testIsBogusClass_variousTypes_returnsExpected() {
        Assert.assertTrue(ClassUtil.isBogusClass(Void.class));
        Assert.assertTrue(ClassUtil.isBogusClass(Void.TYPE));
        Assert.assertTrue(ClassUtil.isBogusClass(NoClass.class));
        Assert.assertFalse(ClassUtil.isBogusClass(String.class));
    }

    @Test
    public void testIsNonStaticInnerClass_variousTypes_returnsExpected() {
        Assert.assertTrue(ClassUtil.isNonStaticInnerClass(NonStaticInnerClass.class));
        Assert.assertFalse(ClassUtil.isNonStaticInnerClass(PublicNoArgClass.class));
        Assert.assertFalse(ClassUtil.isNonStaticInnerClass(String.class));
    }

    @Test
    public void testIsObjectOrPrimitive_variousTypes_returnsExpected() {
        Assert.assertTrue(ClassUtil.isObjectOrPrimitive(Object.class));
        Assert.assertTrue(ClassUtil.isObjectOrPrimitive(int.class));
        Assert.assertTrue(ClassUtil.isObjectOrPrimitive(boolean.class));
        Assert.assertFalse(ClassUtil.isObjectOrPrimitive(String.class));
    }

    @Test
    public void testHasClass_variousInputs_returnsExpected() {
        Assert.assertTrue(ClassUtil.hasClass("test", String.class));
        Assert.assertFalse(ClassUtil.hasClass("test", Integer.class));
        Assert.assertFalse(ClassUtil.hasClass(null, String.class));
    }

    @Test
    public void testVerifyMustOverride_correctAndMismatchedType_throwsOrPasses() {
        ClassUtil.verifyMustOverride(String.class, "hello", "length");
        try {
            ClassUtil.verifyMustOverride(ParentClass.class, new ChildClass(), "someMethod");
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("must override method 'someMethod'"));
        }
    }

    // --- Tests for Method Detection ---

    @Test
    @SuppressWarnings("deprecation")
    public void testHasGetterSignature_variousMethods_returnsExpected() throws Exception {
        Method valid = GetterTestClass.class.getMethod("getValid");
        Method isStatic = GetterTestClass.class.getMethod("getStatic");
        Method withParam = GetterTestClass.class.getMethod("getWithParam", int.class);
        Method isVoid = GetterTestClass.class.getMethod("getVoid");

        Assert.assertTrue(ClassUtil.hasGetterSignature(valid));
        Assert.assertFalse(ClassUtil.hasGetterSignature(isStatic));
        Assert.assertFalse(ClassUtil.hasGetterSignature(withParam));
        Assert.assertFalse(ClassUtil.hasGetterSignature(isVoid));
    }

    // --- Tests for Exception Handling ---

    @Test(expected = Error.class)
    public void testThrowIfError_error_throwsError() {
        ClassUtil.throwIfError(new AssertionError("simulated error"));
    }

    @Test
    public void testThrowIfError_nonError_returnsInput() {
        Exception e = new Exception("simulated");
        Assert.assertSame(e, ClassUtil.throwIfError(e));
    }

    @Test(expected = RuntimeException.class)
    public void testThrowIfRTE_runtimeException_throwsRuntimeException() {
        ClassUtil.throwIfRTE(new IllegalArgumentException("simulated"));
    }

    @Test
    public void testThrowIfRTE_checkedException_returnsInput() {
        Exception e = new Exception("simulated");
        Assert.assertSame(e, ClassUtil.throwIfRTE(e));
    }

    @Test(expected = IOException.class)
    public void testThrowIfIOE_ioException_throwsIOException() throws IOException {
        ClassUtil.throwIfIOE(new IOException("simulated"));
    }

    @Test
    public void testThrowIfIOE_nonIOException_returnsInput() throws IOException {
        Exception e = new Exception("simulated");
        Assert.assertSame(e, ClassUtil.throwIfIOE(e));
    }

    @Test
    public void testGetRootCause_nestedCauses_returnsInnermost() {
        Exception root = new Exception("root");
        Exception mid = new Exception("mid", root);
        Exception top = new Exception("top", mid);

        Assert.assertSame(root, ClassUtil.getRootCause(top));
        Assert.assertSame(root, ClassUtil.getRootCause(root));
    }

    @Test(expected = IOException.class)
    public void testThrowRootCauseIfIOE_nestedIOException_throwsRootIOE() throws IOException {
        IOException root = new IOException("root ioe");
        Exception top = new Exception("top", root);
        ClassUtil.throwRootCauseIfIOE(top);
    }

    @Test
    public void testThrowRootCauseIfIOE_nonIOExceptionRoot_returnsRoot() throws IOException {
        Exception root = new Exception("root");
        Exception top = new Exception("top", root);
        Throwable res = ClassUtil.throwRootCauseIfIOE(top);
        Assert.assertSame(root, res);
    }

    @Test
    public void testThrowAsIAE_checkedException_wrapsInIAE() {
        Exception checked = new Exception("checked");
        try {
            ClassUtil.throwAsIAE(checked);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertSame(checked, e.getCause());
            Assert.assertEquals("checked", e.getMessage());
        }

        try {
            ClassUtil.throwAsIAE(checked, "custom msg");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertSame(checked, e.getCause());
            Assert.assertEquals("custom msg", e.getMessage());
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testThrowAsIAE_runtimeException_rethrowsAsIs() {
        ClassUtil.throwAsIAE(new IllegalStateException("runtime"));
    }

    @Test(expected = AssertionError.class)
    public void testThrowAsIAE_error_rethrowsAsIs() {
        ClassUtil.throwAsIAE(new AssertionError("error"));
    }

    @Test
    public void testThrowAsMappingException_variousInputs_throwsJsonMappingException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        JsonMappingException origJme = new JsonMappingException(null, "orig");
        try {
            ClassUtil.throwAsMappingException(ctxt, origJme);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertSame(origJme, e);
        }

        IOException ioe = new IOException("plain ioe");
        try {
            ClassUtil.throwAsMappingException(ctxt, ioe);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertSame(ioe, e.getCause());
        }
    }

    @Test
    public void testUnwrapAndThrowAsIAE_nestedChecked_wrapsInnermostInIAE() {
        Exception root = new Exception("root checked");
        Exception top = new Exception("top", root);
        try {
            ClassUtil.unwrapAndThrowAsIAE(top);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertSame(root, e.getCause());
        }

        try {
            ClassUtil.unwrapAndThrowAsIAE(top, "custom wrap");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertSame(root, e.getCause());
            Assert.assertEquals("custom wrap", e.getMessage());
        }
    }

    @Test
    public void testCloseOnFailAndThrowAsIOE_generatorAndCloseable_closesAndThrows() throws Exception {
        JsonFactory f = new JsonFactory();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator g = f.createGenerator(out);

        final boolean[] closed = new boolean[1];
        Closeable c = new Closeable() {
            @Override
            public void close() throws IOException {
                closed[0] = true;
            }
        };

        try {
            ClassUtil.closeOnFailAndThrowAsIOE(g, c, new IOException("io fail"));
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertEquals("io fail", e.getMessage());
            Assert.assertTrue(closed[0]);
            Assert.assertTrue(g.isClosed());
        }

        JsonGenerator g2 = f.createGenerator(out);
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(g2, new RuntimeException("rte fail"));
            Assert.fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            Assert.assertEquals("rte fail", e.getMessage());
            Assert.assertTrue(g2.isClosed());
        }

        // Test with secondary exception during close
        Closeable failingCloseable = new Closeable() {
            @Override
            public void close() throws IOException {
                throw new IOException("close failed");
            }
        };
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(null, failingCloseable, new Exception("primary fail"));
            Assert.fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            Assert.assertEquals(1, e.getCause().getSuppressed().length);
        }
    }

    // --- Tests for Instantiation Methods ---

    @Test
    public void testCreateInstance_publicAndPrivateClasses_instantiatesOrThrows() {
        PublicNoArgClass pub = ClassUtil.createInstance(PublicNoArgClass.class, false);
        Assert.assertNotNull(pub);

        PrivateNoArgClass priv = ClassUtil.createInstance(PrivateNoArgClass.class, true);
        Assert.assertNotNull(priv);

        try {
            ClassUtil.createInstance(PrivateNoArgClass.class, false);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("is not accessible"));
        }

        try {
            ClassUtil.createInstance(NoDefaultCtorClass.class, true);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("has no default"));
        }

        try {
            ClassUtil.createInstance(ThrowingConstructorClass.class, true);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to instantiate"));
        }
    }

    @Test
    public void testFindConstructor_variousCases_returnsConstructorOrThrows() {
        Constructor<PublicNoArgClass> ctor = ClassUtil.findConstructor(PublicNoArgClass.class, false);
        Assert.assertNotNull(ctor);

        Constructor<NoDefaultCtorClass> noCtor = ClassUtil.findConstructor(NoDefaultCtorClass.class, false);
        Assert.assertNull(noCtor);
    }

    // --- Tests for Class Name and Description Helper Methods ---

    @Test
    public void testClassOf_variousInputs_returnsClassOrNull() {
        Assert.assertNull(ClassUtil.classOf(null));
        Assert.assertEquals(String.class, ClassUtil.classOf("abc"));
    }

    @Test
    public void testRawClass_javaType_returnsRawClassOrNull() {
        Assert.assertNull(ClassUtil.rawClass(null));
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        Assert.assertEquals(String.class, ClassUtil.rawClass(type));
    }

    @Test
    public void testNonNull_variousInputs_returnsExpected() {
        Assert.assertEquals("default", ClassUtil.nonNull(null, "default"));
        Assert.assertEquals("value", ClassUtil.nonNull("value", "default"));
    }

    @Test
    public void testNullOrToString_variousInputs_returnsExpected() {
        Assert.assertNull(ClassUtil.nullOrToString(null));
        Assert.assertEquals("123", ClassUtil.nullOrToString(123));
    }

    @Test
    public void testNonNullString_variousInputs_returnsExpected() {
        Assert.assertEquals("", ClassUtil.nonNullString(null));
        Assert.assertEquals("abc", ClassUtil.nonNullString("abc"));
    }

    @Test
    public void testQuotedOr_variousInputs_returnsExpected() {
        Assert.assertEquals("NULL", ClassUtil.quotedOr(null, "NULL"));
        Assert.assertEquals("\"hello\"", ClassUtil.quotedOr("hello", "NULL"));
    }

    @Test
    public void testGetClassDescription_variousInputs_returnsExpected() {
        Assert.assertEquals("unknown", ClassUtil.getClassDescription(null));
        Assert.assertEquals("`java.lang.String`", ClassUtil.getClassDescription(String.class));
        Assert.assertEquals("`java.lang.String`", ClassUtil.getClassDescription("hello"));
    }

    @Test
    public void testClassNameOf_variousInputs_returnsExpected() {
        Assert.assertEquals("[null]", ClassUtil.classNameOf(null));
        Assert.assertEquals("`java.lang.String`", ClassUtil.classNameOf("hello"));
    }

    @Test
    public void testNameOf_classAndNamed_returnsExpected() {
        Assert.assertEquals("[null]", ClassUtil.nameOf((Class<?>) null));
        Assert.assertEquals("`int`", ClassUtil.nameOf(int.class));
        Assert.assertEquals("`int[]`", ClassUtil.nameOf(int[].class));
        Assert.assertEquals("`java.lang.String[][]`", ClassUtil.nameOf(String[][].class));

        Assert.assertEquals("[null]", ClassUtil.nameOf((Named) null));
        Assert.assertEquals("`testProp`", ClassUtil.nameOf(new NamedImpl("testProp")));
    }

    @Test
    public void testBackticked_variousInputs_returnsExpected() {
        Assert.assertNull(null, ClassUtil.backticked(null));
        Assert.assertEquals("`test`", ClassUtil.backticked("test"));
    }

    // --- Tests for Primitive Support Methods ---

    @Test
    public void testDefaultValue_allPrimitives_returnsCorrectDefaults() {
        Assert.assertEquals(Integer.valueOf(0), ClassUtil.defaultValue(int.class));
        Assert.assertEquals(Long.valueOf(0L), ClassUtil.defaultValue(long.class));
        Assert.assertEquals(Boolean.FALSE, ClassUtil.defaultValue(boolean.class));
        Assert.assertEquals(Double.valueOf(0.0), ClassUtil.defaultValue(double.class));
        Assert.assertEquals(Float.valueOf(0.0f), ClassUtil.defaultValue(float.class));
        Assert.assertEquals(Byte.valueOf((byte) 0), ClassUtil.defaultValue(byte.class));
        Assert.assertEquals(Short.valueOf((short) 0), ClassUtil.defaultValue(short.class));
        Assert.assertEquals('\0', ClassUtil.defaultValue(char.class));

        try {
            ClassUtil.defaultValue(String.class);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("is not a primitive type"));
        }
    }

    @Test
    public void testWrapperType_allPrimitives_returnsCorrectWrappers() {
        Assert.assertEquals(Integer.class, ClassUtil.wrapperType(int.class));
        Assert.assertEquals(Long.class, ClassUtil.wrapperType(long.class));
        Assert.assertEquals(Boolean.class, ClassUtil.wrapperType(boolean.class));
        Assert.assertEquals(Double.class, ClassUtil.wrapperType(double.class));
        Assert.assertEquals(Float.class, ClassUtil.wrapperType(float.class));
        Assert.assertEquals(Byte.class, ClassUtil.wrapperType(byte.class));
        Assert.assertEquals(Short.class, ClassUtil.wrapperType(short.class));
        Assert.assertEquals(Character.class, ClassUtil.wrapperType(char.class));

        try {
            ClassUtil.wrapperType(String.class);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("is not a primitive type"));
        }
    }

    @Test
    public void testPrimitiveType_allTypes_returnsCorrectPrimitive() {
        Assert.assertEquals(int.class, ClassUtil.primitiveType(int.class));
        Assert.assertEquals(int.class, ClassUtil.primitiveType(Integer.class));
        Assert.assertEquals(long.class, ClassUtil.primitiveType(Long.class));
        Assert.assertEquals(boolean.class, ClassUtil.primitiveType(Boolean.class));
        Assert.assertEquals(double.class, ClassUtil.primitiveType(Double.class));
        Assert.assertEquals(float.class, ClassUtil.primitiveType(Float.class));
        Assert.assertEquals(byte.class, ClassUtil.primitiveType(Byte.class));
        Assert.assertEquals(short.class, ClassUtil.primitiveType(Short.class));
        Assert.assertEquals(char.class, ClassUtil.primitiveType(Character.class));
        Assert.assertNull(ClassUtil.primitiveType(String.class));
    }

    // --- Tests for Access Checking Methods ---

    @Test
    @SuppressWarnings("deprecation")
    public void testCheckAndFixAccess_members_modifiesAccess() throws Exception {
        Constructor<?> ctor = PrivateNoArgClass.class.getDeclaredConstructor();
        ClassUtil.checkAndFixAccess(ctor);
        Assert.assertTrue(ctor.isAccessible());

        Method method = GetterTestClass.class.getMethod("getValid");
        ClassUtil.checkAndFixAccess(method, true);
        Assert.assertTrue(method.isAccessible());
    }

    // --- Tests for Enum Type Detection Methods ---

    @Test
    public void testFindEnumType_enumSet_returnsEnumClass() {
        EnumSet<SimpleEnum> notEmpty = EnumSet.of(SimpleEnum.VAL1);
        Assert.assertEquals(SimpleEnum.class, ClassUtil.findEnumType(notEmpty));

        EnumSet<SimpleEnum> empty = EnumSet.noneOf(SimpleEnum.class);
        Assert.assertEquals(SimpleEnum.class, ClassUtil.findEnumType(empty));
    }

    @Test
    public void testFindEnumType_enumMap_returnsEnumClass() {
        EnumMap<SimpleEnum, String> notEmpty = new EnumMap<SimpleEnum, String>(SimpleEnum.class);
        notEmpty.put(SimpleEnum.VAL1, "val");
        Assert.assertEquals(SimpleEnum.class, ClassUtil.findEnumType(notEmpty));

        EnumMap<SimpleEnum, String> empty = new EnumMap<SimpleEnum, String>(SimpleEnum.class);
        Assert.assertEquals(SimpleEnum.class, ClassUtil.findEnumType(empty));
    }

    @Test
    public void testFindEnumType_enumInstanceAndClass_handlesSimpleAndComplex() {
        Assert.assertEquals(SimpleEnum.class, ClassUtil.findEnumType(SimpleEnum.VAL1));
        Assert.assertEquals(SimpleEnum.class, ClassUtil.findEnumType(SimpleEnum.class));

        Assert.assertEquals(ComplexEnum.class, ClassUtil.findEnumType(ComplexEnum.A));
        Assert.assertEquals(ComplexEnum.class, ClassUtil.findEnumType(ComplexEnum.A.getClass()));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testFindFirstAnnotatedEnumValue_foundAndNotFound_returnsCorrectConstant() {
        Enum<?> found = ClassUtil.findFirstAnnotatedEnumValue((Class) SimpleEnum.class, TestAnnotation.class);
        Assert.assertEquals(SimpleEnum.VAL2, found);

        Enum<?> notFound = ClassUtil.findFirstAnnotatedEnumValue((Class) ComplexEnum.class, TestAnnotation.class);
        Assert.assertNull(notFound);
    }

    // --- Tests for Jackson-specific Methods ---

    @Test
    public void testIsJacksonStdImpl_variousInputs_returnsExpected() {
        Assert.assertTrue(ClassUtil.isJacksonStdImpl((Object) null));
        Assert.assertTrue(ClassUtil.isJacksonStdImpl(new AnnotatedWithJacksonStdImpl()));
        Assert.assertTrue(ClassUtil.isJacksonStdImpl(AnnotatedWithJacksonStdImpl.class));
        Assert.assertFalse(ClassUtil.isJacksonStdImpl(new UnannotatedClass()));
        Assert.assertFalse(ClassUtil.isJacksonStdImpl(UnannotatedClass.class));
    }

    // --- Tests for Reflection and Class Definition Aspect Methods ---

    @Test
    public void testGetPackageName_variousClasses_returnsPackageName() {
        Assert.assertEquals("java.lang", ClassUtil.getPackageName(String.class));
        Assert.assertEquals("com.fasterxml.jackson.databind.util", ClassUtil.getPackageName(ClassUtilTest.class));
    }

    @Test
    public void testHasEnclosingMethod_variousClasses_returnsExpected() {
        class LocalMethodClass {}
        Assert.assertTrue(ClassUtil.hasEnclosingMethod(LocalMethodClass.class));
        Assert.assertFalse(ClassUtil.hasEnclosingMethod(PublicNoArgClass.class));
        Assert.assertFalse(ClassUtil.hasEnclosingMethod(int.class));
        Assert.assertFalse(ClassUtil.hasEnclosingMethod(Object.class));
    }

    @Test
    public void testGetDeclaredFieldsAndMethods_variousClasses_returnsArrays() {
        Field[] fields = ClassUtil.getDeclaredFields(GetterTestClass.class);
        Assert.assertNotNull(fields);

        Method[] methods = ClassUtil.getDeclaredMethods(GetterTestClass.class);
        Assert.assertNotNull(methods);
        Assert.assertTrue(methods.length > 0);

        Method[] classMethods = ClassUtil.getClassMethods(GetterTestClass.class);
        Assert.assertNotNull(classMethods);
        Assert.assertTrue(classMethods.length > 0);
    }

    @Test
    public void testFindClassAnnotations_primitiveAndNormal_returnsExpected() {
        Assert.assertEquals(0, ClassUtil.findClassAnnotations(int.class).length);
        Assert.assertEquals(0, ClassUtil.findClassAnnotations(Object.class).length);

        Annotation[] annotations = ClassUtil.findClassAnnotations(AnnotatedWithJacksonStdImpl.class);
        Assert.assertEquals(1, annotations.length);
        Assert.assertEquals(JacksonStdImpl.class, annotations[0].annotationType());
    }

    @Test
    public void testGetConstructors_variousClasses_returnsCtorArray() {
        Assert.assertEquals(0, ClassUtil.getConstructors(BaseInterface.class).length);
        Assert.assertEquals(0, ClassUtil.getConstructors(int.class).length);
        Assert.assertEquals(0, ClassUtil.getConstructors(Object.class).length);

        ClassUtil.Ctor[] ctors = ClassUtil.getConstructors(PublicNoArgClass.class);
        Assert.assertEquals(1, ctors.length);
        Assert.assertEquals(PublicNoArgClass.class, ctors[0].getDeclaringClass());
        Assert.assertEquals(0, ctors[0].getParamCount());
        Assert.assertNotNull(ctors[0].getConstructor());
        Assert.assertNotNull(ctors[0].getDeclaredAnnotations());
        Assert.assertNotNull(ctors[0].getParameterAnnotations());
    }

    @Test
    public void testGetDeclaringClass_variousClasses_returnsExpected() {
        Assert.assertNull(ClassUtil.getDeclaringClass(Object.class));
        Assert.assertNull(ClassUtil.getDeclaringClass(int.class));
        Assert.assertEquals(ClassUtilTest.class, ClassUtil.getDeclaringClass(PublicNoArgClass.class));
    }

    @Test
    public void testGetGenericSuperclassAndInterfaces_variousClasses_returnsExpected() {
        Type superType = ClassUtil.getGenericSuperclass(ChildClass.class);
        Assert.assertEquals(ParentClass.class, superType);

        Type[] interfaces = ClassUtil.getGenericInterfaces(ChildClass.class);
        Assert.assertEquals(1, interfaces.length);
        Assert.assertEquals(SubInterface.class, interfaces[0]);
    }

    @Test
    public void testGetEnclosingClass_variousClasses_returnsExpected() {
        Assert.assertNull(ClassUtil.getEnclosingClass(Object.class));
        Assert.assertNull(ClassUtil.getEnclosingClass(int.class));
        Assert.assertEquals(ClassUtilTest.class, ClassUtil.getEnclosingClass(NonStaticInnerClass.class));
    }

    @Test
    public void testClassUtilInstantiation_createsInstanceSuccessfully() {
        ClassUtil util = new ClassUtil();
        Assert.assertNotNull(util);
    }
}
