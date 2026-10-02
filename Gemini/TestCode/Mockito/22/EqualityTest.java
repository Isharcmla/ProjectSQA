package org.mockito.internal.matchers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class EqualityTest {

    @Test
    public void testConstructor_instantiation_notNull() {
        Equality equality = new Equality();
        assertNotNull(equality);
    }

    @Test
    public void testAreEqual_bothNull_returnsTrue() {
        assertTrue(Equality.areEqual(null, null));
    }

    @Test
    public void testAreEqual_firstNullSecondNonNull_returnsFalse() {
        assertFalse(Equality.areEqual(null, "test"));
        assertFalse(Equality.areEqual(null, 0));
        assertFalse(Equality.areEqual(null, new Object()));
    }

    @Test
    public void testAreEqual_firstNonNullSecondNull_returnsFalse() {
        assertFalse(Equality.areEqual("test", null));
        assertFalse(Equality.areEqual(0, null));
        assertFalse(Equality.areEqual(new Object(), null));
    }

    @Test
    public void testAreEqual_sameObjectInstance_returnsTrue() {
        Object obj = new Object();
        assertTrue(Equality.areEqual(obj, obj));
    }

    @Test
    public void testAreEqual_equalObjects_returnsTrue() {
        assertTrue(Equality.areEqual("hello", "hello"));
        assertTrue(Equality.areEqual("", ""));
        assertTrue(Equality.areEqual(123, 123));
        assertTrue(Equality.areEqual(-456, -456));
        assertTrue(Equality.areEqual(0, 0));
    }

    @Test
    public void testAreEqual_differentObjects_returnsFalse() {
        assertFalse(Equality.areEqual("hello", "world"));
        assertFalse(Equality.areEqual("hello", ""));
        assertFalse(Equality.areEqual(123, 456));
        assertFalse(Equality.areEqual(1, -1));
        assertFalse(Equality.areEqual(new Object(), new Object()));
    }

    @Test
    public void testAreEqual_firstArraySecondNotArray_returnsFalse() {
        assertFalse(Equality.areEqual(new int[]{1, 2}, "not an array"));
        assertFalse(Equality.areEqual(new String[]{"a"}, 123));
        assertFalse(Equality.areEqual(new Object[]{}, new Object()));
    }

    @Test
    public void testAreEqual_firstNotArraySecondArray_returnsFalse() {
        assertFalse(Equality.areEqual("not an array", new int[]{1, 2}));
        assertFalse(Equality.areEqual(123, new String[]{"a"}));
        assertFalse(Equality.areEqual(new Object(), new Object[]{}));
    }

    @Test
    public void testAreEqual_emptyArrays_returnsTrue() {
        assertTrue(Equality.areEqual(new int[]{}, new int[]{}));
        assertTrue(Equality.areEqual(new String[]{}, new String[]{}));
        assertTrue(Equality.areEqual(new Object[]{}, new Object[]{}));
    }

    @Test
    public void testAreEqual_arraysWithDifferentLengths_returnsFalse() {
        assertFalse(Equality.areEqual(new int[]{1, 2}, new int[]{1}));
        assertFalse(Equality.areEqual(new int[]{1}, new int[]{1, 2}));
        assertFalse(Equality.areEqual(new String[]{"a", "b"}, new String[]{"a"}));
    }

    @Test
    public void testAreEqual_primitiveArraysEqualElements_returnsTrue() {
        assertTrue(Equality.areEqual(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertTrue(Equality.areEqual(new boolean[]{true, false}, new boolean[]{true, false}));
        assertTrue(Equality.areEqual(new byte[]{1, -2}, new byte[]{1, -2}));
        assertTrue(Equality.areEqual(new char[]{'a', 'b'}, new char[]{'a', 'b'}));
        assertTrue(Equality.areEqual(new short[]{10, 20}, new short[]{10, 20}));
        assertTrue(Equality.areEqual(new long[]{100L, 200L}, new long[]{100L, 200L}));
        assertTrue(Equality.areEqual(new float[]{1.0f, 2.5f}, new float[]{1.0f, 2.5f}));
        assertTrue(Equality.areEqual(new double[]{1.1, -2.2}, new double[]{1.1, -2.2}));
    }

    @Test
    public void testAreEqual_primitiveArraysDifferentElements_returnsFalse() {
        assertFalse(Equality.areEqual(new int[]{1, 2, 3}, new int[]{1, 2, 4}));
        assertFalse(Equality.areEqual(new boolean[]{true, false}, new boolean[]{true, true}));
        assertFalse(Equality.areEqual(new byte[]{1, 2}, new byte[]{1, 3}));
        assertFalse(Equality.areEqual(new char[]{'a', 'b'}, new char[]{'a', 'c'}));
        assertFalse(Equality.areEqual(new short[]{10, 20}, new short[]{10, 30}));
        assertFalse(Equality.areEqual(new long[]{100L, 200L}, new long[]{100L, 300L}));
        assertFalse(Equality.areEqual(new float[]{1.0f, 2.0f}, new float[]{1.0f, 3.0f}));
        assertFalse(Equality.areEqual(new double[]{1.1, 2.2}, new double[]{1.1, 3.3}));
    }

    @Test
    public void testAreEqual_objectArraysEqualElements_returnsTrue() {
        assertTrue(Equality.areEqual(new String[]{"a", "b", ""}, new String[]{"a", "b", ""}));
        assertTrue(Equality.areEqual(new Integer[]{1, -2, 0}, new Integer[]{1, -2, 0}));
    }

    @Test
    public void testAreEqual_objectArraysDifferentElements_returnsFalse() {
        assertFalse(Equality.areEqual(new String[]{"a", "b"}, new String[]{"a", "c"}));
        assertFalse(Equality.areEqual(new Integer[]{1, 2}, new Integer[]{1, 3}));
    }

    @Test
    public void testAreEqual_arraysWithNullElements_returnsExpected() {
        assertTrue(Equality.areEqual(new Object[]{null, "a"}, new Object[]{null, "a"}));
        assertFalse(Equality.areEqual(new Object[]{null, "a"}, new Object[]{"a", "a"}));
        assertFalse(Equality.areEqual(new Object[]{"a", null}, new Object[]{"a", "b"}));
    }

    @Test
    public void testAreEqual_nestedArrays_returnsExpected() {
        int[][] nested1 = new int[][]{{1, 2}, {3, 4}};
        int[][] nested2 = new int[][]{{1, 2}, {3, 4}};
        int[][] nested3 = new int[][]{{1, 2}, {3, 5}};

        assertTrue(Equality.areEqual(nested1, nested2));
        assertFalse(Equality.areEqual(nested1, nested3));
    }

    @Test
    public void testAreEqual_deeplyNestedArrays_returnsExpected() {
        Object[] deep1 = new Object[]{new Object[]{new int[]{1, 2}}};
        Object[] deep2 = new Object[]{new Object[]{new int[]{1, 2}}};
        Object[] deep3 = new Object[]{new Object[]{new int[]{1, 3}}};

        assertTrue(Equality.areEqual(deep1, deep2));
        assertFalse(Equality.areEqual(deep1, deep3));
    }

    @Test
    public void testAreEqual_differentArrayTypesSameLength_returnsFalse() {
        assertFalse(Equality.areEqual(new int[]{1, 2}, new long[]{1L, 2L}));
        assertFalse(Equality.areEqual(new int[]{1}, new Integer[]{1}));
    }

    @Test
    public void testPackagePrivateMethods_directCalls() {
        assertTrue(Equality.isArray(new int[]{}));
        assertFalse(Equality.isArray("string"));

        assertTrue(Equality.areArrayLengthsEqual(new int[]{1, 2}, new String[]{"a", "b"}));
        assertFalse(Equality.areArrayLengthsEqual(new int[]{1}, new int[]{1, 2}));

        assertTrue(Equality.areArrayElementsEqual(new int[]{1, 2}, new int[]{1, 2}));
        assertFalse(Equality.areArrayElementsEqual(new int[]{1, 2}, new int[]{1, 3}));

        assertTrue(Equality.areArraysEqual(new int[]{1, 2}, new int[]{1, 2}));
        assertFalse(Equality.areArraysEqual(new int[]{1, 2}, new int[]{1}));
        assertFalse(Equality.areArraysEqual(new int[]{1, 2}, new int[]{1, 3}));
    }
}
