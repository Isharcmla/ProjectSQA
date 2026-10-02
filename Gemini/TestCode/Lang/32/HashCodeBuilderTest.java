package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class HashCodeBuilderTest {

    static class TestParent {
        private final int parentInt = 10;
        transient int parentTransient = 20;
    }

    static class TestChild extends TestParent {
        private final String childStr = "test";
        static int staticField = 100;
        private final int excludedField = 42;
    }

    static class CyclicA {
        CyclicB b;
        int value = 1;
    }

    static class CyclicB {
        CyclicA a;
        int value = 2;
    }

    @Test
    public void testDefaultConstructor_success() {
        HashCodeBuilder builder = new HashCodeBuilder();
        assertEquals(17, builder.toHashCode());
        assertEquals(17, builder.hashCode());
    }

    @Test
    public void testCustomConstructor_success() {
        HashCodeBuilder builder = new HashCodeBuilder(19, 39);
        assertEquals(19, builder.toHashCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_zeroInitial_throwsException() {
        new HashCodeBuilder(0, 37);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_evenInitial_throwsException() {
        new HashCodeBuilder(2, 37);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_negativeEvenInitial_throwsException() {
        new HashCodeBuilder(-4, 37);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_zeroMultiplier_throwsException() {
        new HashCodeBuilder(17, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_evenMultiplier_throwsException() {
        new HashCodeBuilder(17, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_negativeEvenMultiplier_throwsException() {
        new HashCodeBuilder(17, -6);
    }

    @Test
    public void testConstructor_negativeOddValues_success() {
        HashCodeBuilder builder = new HashCodeBuilder(-3, -5);
        assertEquals(-3, builder.toHashCode());
    }

    @Test
    public void testAppendBoolean_values() {
        HashCodeBuilder builderTrue = new HashCodeBuilder(17, 37).append(true);
        assertEquals(17 * 37 + 0, builderTrue.toHashCode());

        HashCodeBuilder builderFalse = new HashCodeBuilder(17, 37).append(false);
        assertEquals(17 * 37 + 1, builderFalse.toHashCode());
    }

    @Test
    public void testAppendBooleanArray_nullAndEmptyAndValues() {
        HashCodeBuilder builderNull = new HashCodeBuilder(17, 37).append((boolean[]) null);
        assertEquals(17 * 37, builderNull.toHashCode());

        HashCodeBuilder builderEmpty = new HashCodeBuilder(17, 37).append(new boolean[0]);
        assertEquals(17, builderEmpty.toHashCode());

        HashCodeBuilder builderValues = new HashCodeBuilder(17, 37).append(new boolean[]{true, false});
        int expected = (17 * 37 + 0) * 37 + 1;
        assertEquals(expected, builderValues.toHashCode());
    }

    @Test
    public void testAppendByte_values() {
        byte b = 8;
        HashCodeBuilder builder = new HashCodeBuilder(17, 37).append(b);
        assertEquals(17 * 37 + 8, builder.toHashCode());
    }

    @Test
    public void testAppendByteArray_nullAndEmptyAndValues() {
        HashCodeBuilder builderNull = new HashCodeBuilder(17, 37).append((byte[]) null);
        assertEquals(17 * 37, builderNull.toHashCode());

        HashCodeBuilder builderEmpty = new HashCodeBuilder(17, 37).append(new byte[0]);
        assertEquals(17, builderEmpty.toHashCode());

        HashCodeBuilder builderValues = new HashCodeBuilder(17, 37).append(new byte[]{1, 2});
        int expected = (17 * 37 + 1) * 37 + 2;
        assertEquals(expected, builderValues.toHashCode());
    }

    @Test
    public void testAppendChar_values() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37).append('a');
        assertEquals(17 * 37 + (int) 'a', builder.toHashCode());
    }

    @Test
    public void testAppendCharArray_nullAndEmptyAndValues() {
        HashCodeBuilder builderNull = new HashCodeBuilder(17, 37).append((char[]) null);
        assertEquals(17 * 37, builderNull.toHashCode());

        HashCodeBuilder builderEmpty = new HashCodeBuilder(17, 37).append(new char[0]);
        assertEquals(17, builderEmpty.toHashCode());

        HashCodeBuilder builderValues = new HashCodeBuilder(17, 37).append(new char[]{'a', 'b'});
        int expected = (17 * 37 + (int) 'a') * 37 + (int) 'b';
        assertEquals(expected, builderValues.toHashCode());
    }

    @Test
    public void testAppendDouble_values() {
        double val = 12.34;
        long bits = Double.doubleToLongBits(val);
        int expected = 17 * 37 + ((int) (bits ^ (bits >> 32)));

        HashCodeBuilder builder = new HashCodeBuilder(17, 37).append(val);
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendDoubleArray_nullAndEmptyAndValues() {
        HashCodeBuilder builderNull = new HashCodeBuilder(17, 37).append((double[]) null);
        assertEquals(17 * 37, builderNull.toHashCode());

        HashCodeBuilder builderEmpty = new HashCodeBuilder(17, 37).append(new double[0]);
        assertEquals(17, builderEmpty.toHashCode());

        HashCodeBuilder builderValues = new HashCodeBuilder(17, 37).append(new double[]{1.0, 2.0});
        HashCodeBuilder expectedBuilder = new HashCodeBuilder(17, 37).append(1.0).append(2.0);
        assertEquals(expectedBuilder.toHashCode(), builderValues.toHashCode());
    }

    @Test
    public void testAppendFloat_values() {
        float val = 5.67f;
        int bits = Float.floatToIntBits(val);
        HashCodeBuilder builder = new HashCodeBuilder(17, 37).append(val);
        assertEquals(17 * 37 + bits, builder.toHashCode());
    }

    @Test
    public void testAppendFloatArray_nullAndEmptyAndValues() {
        HashCodeBuilder builderNull = new HashCodeBuilder(17, 37).append((float[]) null);
        assertEquals(17 * 37, builderNull.toHashCode());

        HashCodeBuilder builderEmpty = new HashCodeBuilder(17, 37).append(new float[0]);
        assertEquals(17, builderEmpty.toHashCode());

        HashCodeBuilder builderValues = new HashCodeBuilder(17, 37).append(new float[]{1.5f, 2.5f});
        int expected = (17 * 37 + Float.floatToIntBits(1.5f)) * 37 + Float.floatToIntBits(2.5f);
        assertEquals(expected, builderValues.toHashCode());
    }

    @Test
    public void testAppendInt_values() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37).append(42);
        assertEquals(17 * 37 + 42, builder.toHashCode());

        HashCodeBuilder builderNeg = new HashCodeBuilder(17, 37).append(-10);
        assertEquals(17 * 37 - 10, builderNeg.toHashCode());
    }

    @Test
    public void testAppendIntArray_nullAndEmptyAndValues() {
        HashCodeBuilder builderNull = new HashCodeBuilder(17, 37).append((int[]) null);
        assertEquals(17 * 37, builderNull.toHashCode());

        HashCodeBuilder builderEmpty = new HashCodeBuilder(17, 37).append(new int[0]);
        assertEquals(17, builderEmpty.toHashCode());

        HashCodeBuilder builderValues = new HashCodeBuilder(17, 37).append(new int[]{3, 7});
        int expected = (17 * 37 + 3) * 37 + 7;
        assertEquals(expected, builderValues.toHashCode());
    }

    @Test
    public void testAppendLong_values() {
        long val = 0x123456789ABCDEF0L;
        int expected = 17 * 37 + ((int) (val ^ (val >> 32)));
        HashCodeBuilder builder = new HashCodeBuilder(17, 37).append(val);
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendLongArray_nullAndEmptyAndValues() {
        HashCodeBuilder builderNull = new HashCodeBuilder(17, 37).append((long[]) null);
        assertEquals(17 * 37, builderNull.toHashCode());

        HashCodeBuilder builderEmpty = new HashCodeBuilder(17, 37).append(new long[0]);
        assertEquals(17, builderEmpty.toHashCode());

        HashCodeBuilder builderValues = new HashCodeBuilder(17, 37).append(new long[]{100L, 200L});
        HashCodeBuilder expectedBuilder = new HashCodeBuilder(17, 37).append(100L).append(200L);
        assertEquals(expectedBuilder.toHashCode(), builderValues.toHashCode());
    }

    @Test
    public void testAppendShort_values() {
        short val = 123;
        HashCodeBuilder builder = new HashCodeBuilder(17, 37).append(val);
        assertEquals(17 * 37 + 123, builder.toHashCode());
    }

    @Test
    public void testAppendShortArray_nullAndEmptyAndValues() {
        HashCodeBuilder builderNull = new HashCodeBuilder(17, 37).append((short[]) null);
        assertEquals(17 * 37, builderNull.toHashCode());

        HashCodeBuilder builderEmpty = new HashCodeBuilder(17, 37).append(new short[0]);
        assertEquals(17, builderEmpty.toHashCode());

        HashCodeBuilder builderValues = new HashCodeBuilder(17, 37).append(new short[]{4, 5});
        int expected = (17 * 37 + 4) * 37 + 5;
        assertEquals(expected, builderValues.toHashCode());
    }

    @Test
    public void testAppendObject_nullAndSingleObject() {
        HashCodeBuilder builderNull = new HashCodeBuilder(17, 37).append((Object) null);
        assertEquals(17 * 37, builderNull.toHashCode());

        String testObj = "hello";
        HashCodeBuilder builderObj = new HashCodeBuilder(17, 37).append((Object) testObj);
        assertEquals(17 * 37 + testObj.hashCode(), builderObj.toHashCode());
    }

    @Test
    public void testAppendObject_primitiveArraysAsObject() {
        assertEquals(new HashCodeBuilder(17, 37).append(new long[]{1L, 2L}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new long[]{1L, 2L}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new int[]{1, 2}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new int[]{1, 2}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new short[]{1, 2}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new short[]{1, 2}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new char[]{'a', 'b'}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new char[]{'a', 'b'}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new byte[]{1, 2}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new byte[]{1, 2}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new double[]{1.1, 2.2}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new double[]{1.1, 2.2}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new float[]{1.1f, 2.2f}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new float[]{1.1f, 2.2f}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new boolean[]{true, false}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new boolean[]{true, false}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new Object[]{"a", "b"}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new Object[]{"a", "b"}).toHashCode());
    }

    @Test
    public void testAppendObjectArray_nullAndEmptyAndMultiDimensional() {
        HashCodeBuilder builderNull = new HashCodeBuilder(17, 37).append((Object[]) null);
        assertEquals(17 * 37, builderNull.toHashCode());

        HashCodeBuilder builderEmpty = new HashCodeBuilder(17, 37).append(new Object[0]);
        assertEquals(17, builderEmpty.toHashCode());

        Object[][] multiDim = new Object[][]{{"str1"}, {"str2"}};
        HashCodeBuilder builderMulti = new HashCodeBuilder(17, 37).append(multiDim);
        assertNotNull(builderMulti);
        assertTrue(builderMulti.toHashCode() != 0);
    }

    @Test
    public void testAppendSuper_updatesHashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37).appendSuper(99);
        assertEquals(17 * 37 + 99, builder.toHashCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCode_nullObject_throwsException() {
        HashCodeBuilder.reflectionHashCode(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCode_nullObjectWithCustomNumbers_throwsException() {
        HashCodeBuilder.reflectionHashCode(17, 37, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCode_nullObjectAllParams_throwsException() {
        HashCodeBuilder.reflectionHashCode(17, 37, null, true, null, new String[]{"field"});
    }

    @Test
    public void testReflectionHashCode_simpleObject() {
        TestChild obj = new TestChild();
        int hash1 = HashCodeBuilder.reflectionHashCode(obj);
        int hash2 = HashCodeBuilder.reflectionHashCode(obj);
        assertEquals(hash1, hash2);
    }

    @Test
    public void testReflectionHashCode_withTransients() {
        TestChild obj = new TestChild();
        int hashWithoutTransients = HashCodeBuilder.reflectionHashCode(17, 37, obj, false);
        int hashWithTransients = HashCodeBuilder.reflectionHashCode(17, 37, obj, true);
        assertTrue(hashWithoutTransients != hashWithTransients);

        int hashWithTransientsOverload = HashCodeBuilder.reflectionHashCode(obj, true);
        assertEquals(hashWithTransients, hashWithTransientsOverload);
    }

    @Test
    public void testReflectionHashCode_withReflectUpToClass() {
        TestChild obj = new TestChild();
        int hashUpToChild = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, TestChild.class);
        int hashUpToParent = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, TestParent.class);
        int hashFull = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, null);

        assertEquals(hashUpToParent, hashFull);
        assertTrue(hashUpToChild != hashUpToParent);
    }

    @Test
    public void testReflectionHashCode_withExcludeFieldsArray() {
        TestChild obj = new TestChild();
        int hashNoExclude = HashCodeBuilder.reflectionHashCode(obj, (String[]) null);
        int hashExcluded = HashCodeBuilder.reflectionHashCode(obj, new String[]{"excludedField"});

        assertTrue(hashNoExclude != hashExcluded);

        int hashExcludedViaFullMethod = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, null, new String[]{"excludedField"});
        assertEquals(hashExcluded, hashExcludedViaFullMethod);
    }

    @Test
    public void testReflectionHashCode_withExcludeFieldsCollection() {
        TestChild obj = new TestChild();
        Collection<String> excludes = Collections.singletonList("excludedField");
        int hashExcludedCollection = HashCodeBuilder.reflectionHashCode(obj, excludes);
        int hashExcludedArray = HashCodeBuilder.reflectionHashCode(obj, new String[]{"excludedField"});

        assertEquals(hashExcludedArray, hashExcludedCollection);

        Collection<String> emptyExcludes = new ArrayList<String>();
        int hashEmptyExcludes = HashCodeBuilder.reflectionHashCode(obj, emptyExcludes);
        assertEquals(HashCodeBuilder.reflectionHashCode(obj), hashEmptyExcludes);

        int hashNullExcludes = HashCodeBuilder.reflectionHashCode(obj, (Collection<String>) null);
        assertEquals(HashCodeBuilder.reflectionHashCode(obj), hashNullExcludes);
    }

    @Test
    public void testReflectionHashCode_customOddNumbers() {
        TestChild obj = new TestChild();
        int hash1 = HashCodeBuilder.reflectionHashCode(19, 41, obj);
        int hash2 = HashCodeBuilder.reflectionHashCode(17, 37, obj);
        assertTrue(hash1 != hash2);
    }

    @Test
    public void testReflectionHashCode_cyclicalReference() {
        CyclicA a = new CyclicA();
        CyclicB b = new CyclicB();
        a.b = b;
        b.a = a;

        int hashA = HashCodeBuilder.reflectionHashCode(a);
        int hashB = HashCodeBuilder.reflectionHashCode(b);

        assertTrue(hashA != 0);
        assertTrue(hashB != 0);
    }

    @Test
    public void testRegistry_management() {
        Object obj = new Object();
        assertFalse(HashCodeBuilder.isRegistered(obj));
        
        HashCodeBuilder.register(obj);
        assertTrue(HashCodeBuilder.isRegistered(obj));
        assertTrue(HashCodeBuilder.getRegistry().contains(new IDKey(obj)));

        HashCodeBuilder.unregister(obj);
        assertFalse(HashCodeBuilder.isRegistered(obj));
    }
}
