package org.mockito.internal.matchers;

import org.junit.Test;
import static org.junit.Assert.*;

public class EqualityTest {

    @Test
    public void testAreEqual_bothNull_returnsTrue() {
        assertTrue(Equality.areEqual(null, null));
    }

    @Test
    public void testAreEqual_firstNullSecondNotNull_returnsFalse() {
        assertFalse(Equality.areEqual(null, "test"));
    }

    @Test
    public void testAreEqual_firstNotNullSecondNull_returnsFalse() {
        assertFalse(Equality.areEqual("test", null));
    }

    @Test
    public void testAreEqual_equalStrings_returnsTrue() {
        assertTrue(Equality.areEqual("hello", "hello"));
    }

    @Test
    public void testAreEqual_differentStrings_returnsFalse() {
        assertFalse(Equality.areEqual("hello", "world"));
    }

    @Test
    public void testAreEqual_equalIntegers_returnsTrue() {
        assertTrue(Equality.areEqual(Integer.valueOf(5), Integer.valueOf(5)));
    }

    @Test
    public void testAreEqual_differentIntegers_returnsFalse() {
        assertFalse(Equality.areEqual(Integer.valueOf(5), Integer.valueOf(10)));
    }

    @Test
    public void testAreEqual_sameReference_returnsTrue() {
        Object o = new Object();
        assertTrue(Equality.areEqual(o, o));
    }

    @Test
    public void testAreEqual_arrayVsNonArray_returnsFalse() {
        int[] arr = {1, 2, 3};
        assertFalse(Equality.areEqual(arr, "notAnArray"));
    }

    @Test
    public void testAreEqual_nonArrayVsArray_returnsFalse() {
        int[] arr = {1, 2, 3};
        assertFalse(Equality.areEqual("notAnArray", arr));
    }

    @Test
    public void testAreEqual_equalIntArrays_returnsTrue() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_differentIntArrays_returnsFalse() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        assertFalse(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_differentLengthArrays_returnsFalse() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2};
        assertFalse(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_emptyArrays_returnsTrue() {
        int[] arr1 = {};
        int[] arr2 = {};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_emptyVsNonEmptyArrays_returnsFalse() {
        int[] arr1 = {};
        int[] arr2 = {1};
        assertFalse(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_equalStringArrays_returnsTrue() {
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"a", "b", "c"};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_differentStringArrays_returnsFalse() {
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"a", "b", "d"};
        assertFalse(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_stringArrayWithNullElements_returnsTrue() {
        String[] arr1 = {"a", null, "c"};
        String[] arr2 = {"a", null, "c"};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_stringArrayWithDifferentNullElements_returnsFalse() {
        String[] arr1 = {"a", null, "c"};
        String[] arr2 = {"a", "b", "c"};
        assertFalse(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_nestedArraysEqual_returnsTrue() {
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{1, 2}, {3, 4}};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_nestedArraysDifferent_returnsFalse() {
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{1, 2}, {3, 5}};
        assertFalse(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_objectArraysEqual_returnsTrue() {
        Object[] arr1 = {1, "two", 3.0};
        Object[] arr2 = {1, "two", 3.0};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_objectArraysDifferent_returnsFalse() {
        Object[] arr1 = {1, "two", 3.0};
        Object[] arr2 = {1, "two", 4.0};
        assertFalse(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_doubleArraysEqual_returnsTrue() {
        double[] arr1 = {1.1, 2.2, 3.3};
        double[] arr2 = {1.1, 2.2, 3.3};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_booleanArraysEqual_returnsTrue() {
        boolean[] arr1 = {true, false, true};
        boolean[] arr2 = {true, false, true};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_charArraysEqual_returnsTrue() {
        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'a', 'b', 'c'};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_longArraysEqual_returnsTrue() {
        long[] arr1 = {1L, 2L, 3L};
        long[] arr2 = {1L, 2L, 3L};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_byteArraysEqual_returnsTrue() {
        byte[] arr1 = {1, 2, 3};
        byte[] arr2 = {1, 2, 3};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_shortArraysEqual_returnsTrue() {
        short[] arr1 = {1, 2, 3};
        short[] arr2 = {1, 2, 3};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_floatArraysEqual_returnsTrue() {
        float[] arr1 = {1.1f, 2.2f, 3.3f};
        float[] arr2 = {1.1f, 2.2f, 3.3f};
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_mixedTypeArrays_returnsFalse() {
        int[] arr1 = {1, 2, 3};
        long[] arr2 = {1L, 2L, 3L};
        // Different array types but same values - Array.get will box differently
        assertFalse(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_arrayWithNullElementVsArray_returnsFalse() {
        String[] arr1 = {"a", null};
        String[] arr2 = {"a", "b"};
        assertFalse(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreEqual_bothEmptyObjectArrays_returnsTrue() {
        Object[] arr1 = new Object[0];
        Object[] arr2 = new Object[0];
        assertTrue(Equality.areEqual(arr1, arr2));
    }

    @Test
    public void testAreArraysEqual_equalArrays_returnsTrue() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        assertTrue(Equality.areArraysEqual(arr1, arr2));
    }

    @Test
    public void testAreArraysEqual_differentArrays_returnsFalse() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        assertFalse(Equality.areArraysEqual(arr1, arr2));
    }

    @Test
    public void testAreArrayLengthsEqual_sameLengths_returnsTrue() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        assertTrue(Equality.areArrayLengthsEqual(arr1, arr2));
    }

    @Test
    public void testAreArrayLengthsEqual_differentLengths_returnsFalse() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        assertFalse(Equality.areArrayLengthsEqual(arr1, arr2));
    }

    @Test
    public void testAreArrayLengthsEqual_bothEmpty_returnsTrue() {
        int[] arr1 = {};
        int[] arr2 = {};
        assertTrue(Equality.areArrayLengthsEqual(arr1, arr2));
    }

    @Test
    public void testAreArrayElementsEqual_equalElements_returnsTrue() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        assertTrue(Equality.areArrayElementsEqual(arr1, arr2));
    }

    @Test
    public void testAreArrayElementsEqual_differentElements_returnsFalse() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        assertFalse(Equality.areArrayElementsEqual(arr1, arr2));
    }

    @Test
    public void testAreArrayElementsEqual_emptyArrays_returnsTrue() {
        int[] arr1 = {};
        int[] arr2 = {};
        assertTrue(Equality.areArrayElementsEqual(arr1, arr2));
    }

    @Test
    public void testIsArray_arrayObject_returnsTrue() {
        int[] arr = {1, 2, 3};
        assertTrue(Equality.isArray(arr));
    }

    @Test
    public void testIsArray_nonArrayObject_returnsFalse() {
        String s = "test";
        assertFalse(Equality.isArray(s));
    }

    @Test
    public void testIsArray_objectArray_returnsTrue() {
        Object[] arr = new Object[5];
        assertTrue(Equality.isArray(arr));
    }

    @Test(expected = NullPointerException.class)
    public void testIsArray_nullObject_throwsNullPointerException() {
        Equality.isArray(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAreArrayLengthsEqual_nonArrayArgument_throwsIllegalArgumentException() {
        Equality.areArrayLengthsEqual("notAnArray", "alsoNotAnArray");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAreArrayElementsEqual_nonArrayArgument_throwsIllegalArgumentException() {
        Equality.areArrayElementsEqual("notAnArray", "alsoNotAnArray");
    }
}
