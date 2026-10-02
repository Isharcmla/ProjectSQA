package org.apache.commons.lang3;

import org.junit.Test;

import java.util.AbstractMap;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ArrayUtilsTest {

    private static final double DELTA = 0.0001;
    private static final float FLOAT_DELTA = 0.0001f;

    @Test
    public void testConstantsAndConstructor() {
        assertNotNull(new ArrayUtils());
        assertEquals(0, ArrayUtils.EMPTY_OBJECT_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_CLASS_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_STRING_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_LONG_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_LONG_OBJECT_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_INT_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_SHORT_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_BYTE_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_DOUBLE_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_FLOAT_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_BOOLEAN_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_CHAR_ARRAY.length);
        assertEquals(0, ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY.length);
        assertEquals(-1, ArrayUtils.INDEX_NOT_FOUND);
    }

    @Test
    public void testToString() {
        assertEquals("{}", ArrayUtils.toString(null));
        assertEquals("nullValue", ArrayUtils.toString(null, "nullValue"));
        assertEquals("{1,2}", ArrayUtils.toString(new int[]{1, 2}));
        assertEquals("{a,b}", ArrayUtils.toString(new String[]{"a", "b"}, "nullValue"));
    }

    @Test
    public void testIsEquals() {
        assertTrue(ArrayUtils.isEquals(null, null));
        assertFalse(ArrayUtils.isEquals(new int[]{1}, null));
        assertFalse(ArrayUtils.isEquals(null, new int[]{1}));
        assertTrue(ArrayUtils.isEquals(new int[]{1, 2}, new int[]{1, 2}));
        assertFalse(ArrayUtils.isEquals(new int[]{1, 2}, new int[]{1, 3}));
        assertTrue(ArrayUtils.isEquals(new int[][]{{1, 2}, {3}}, new int[][]{{1, 2}, {3}}));
    }

    @Test
    public void testToMap_validInputs() {
        assertNull(ArrayUtils.toMap(null));

        Map<Object, Object> emptyMap = ArrayUtils.toMap(new Object[0]);
        assertNotNull(emptyMap);
        assertTrue(emptyMap.isEmpty());

        Object[] arrayWithEntries = new Object[]{
                new AbstractMap.SimpleEntry<String, String>("k1", "v1"),
                new String[]{"k2", "v2", "extraIgnored"}
        };
        Map<Object, Object> map = ArrayUtils.toMap(arrayWithEntries);
        assertEquals(2, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v2", map.get("k2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMap_arrayElementTooShort_throwsException() {
        ArrayUtils.toMap(new Object[]{new String[]{"onlyKey"}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMap_invalidElementType_throwsException() {
        ArrayUtils.toMap(new Object[]{"invalidStringElement"});
    }

    @Test
    public void testClone_object() {
        assertNull(ArrayUtils.clone((String[]) null));
        String[] original = new String[]{"a", "b"};
        String[] cloned = ArrayUtils.clone(original);
        assertArrayEquals(original, cloned);
        assertTrue(original != cloned);
    }

    @Test
    public void testClone_primitives() {
        assertNull(ArrayUtils.clone((long[]) null));
        long[] l = new long[]{1L, 2L};
        assertArrayEquals(l, ArrayUtils.clone(l));

        assertNull(ArrayUtils.clone((int[]) null));
        int[] i = new int[]{1, 2};
        assertArrayEquals(i, ArrayUtils.clone(i));

        assertNull(ArrayUtils.clone((short[]) null));
        short[] s = new short[]{1, 2};
        assertArrayEquals(s, ArrayUtils.clone(s));

        assertNull(ArrayUtils.clone((char[]) null));
        char[] c = new char[]{'a', 'b'};
        assertArrayEquals(c, ArrayUtils.clone(c));

        assertNull(ArrayUtils.clone((byte[]) null));
        byte[] b = new byte[]{1, 2};
        assertArrayEquals(b, ArrayUtils.clone(b));

        assertNull(ArrayUtils.clone((double[]) null));
        double[] d = new double[]{1.0, 2.0};
        assertArrayEquals(d, ArrayUtils.clone(d), DELTA);

        assertNull(ArrayUtils.clone((float[]) null));
        float[] f = new float[]{1.0f, 2.0f};
        assertArrayEquals(f, ArrayUtils.clone(f), FLOAT_DELTA);

        assertNull(ArrayUtils.clone((boolean[]) null));
        boolean[] bool = new boolean[]{true, false};
        assertTrue(ArrayUtils.isEquals(bool, ArrayUtils.clone(bool)));
    }

    @Test
    public void testSubarray_object() {
        assertNull(ArrayUtils.subarray((String[]) null, 0, 1));
        String[] array = new String[]{"a", "b", "c", "d"};
        assertArrayEquals(new String[]{"b", "c"}, ArrayUtils.subarray(array, 1, 3));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.subarray(array, -2, 2));
        assertArrayEquals(new String[]{"c", "d"}, ArrayUtils.subarray(array, 2, 10));
        assertArrayEquals(new String[0], ArrayUtils.subarray(array, 3, 2));
    }

    @Test
    public void testSubarray_primitives() {
        assertNull(ArrayUtils.subarray((long[]) null, 0, 1));
        long[] l = new long[]{1L, 2L, 3L};
        assertArrayEquals(new long[]{2L, 3L}, ArrayUtils.subarray(l, 1, 5));
        assertArrayEquals(new long[]{1L, 2L}, ArrayUtils.subarray(l, -1, 2));
        assertArrayEquals(new long[0], ArrayUtils.subarray(l, 2, 1));

        assertNull(ArrayUtils.subarray((int[]) null, 0, 1));
        int[] i = new int[]{1, 2, 3};
        assertArrayEquals(new int[]{2L != 0 ? 2 : 0, 3}, ArrayUtils.subarray(i, 1, 5));
        assertArrayEquals(new int[]{1, 2}, ArrayUtils.subarray(i, -1, 2));
        assertArrayEquals(new int[0], ArrayUtils.subarray(i, 2, 1));

        assertNull(ArrayUtils.subarray((short[]) null, 0, 1));
        short[] s = new short[]{1, 2, 3};
        assertArrayEquals(new short[]{2, 3}, ArrayUtils.subarray(s, 1, 5));
        assertArrayEquals(new short[]{1, 2}, ArrayUtils.subarray(s, -1, 2));
        assertArrayEquals(new short[0], ArrayUtils.subarray(s, 2, 1));

        assertNull(ArrayUtils.subarray((char[]) null, 0, 1));
        char[] c = new char[]{'a', 'b', 'c'};
        assertArrayEquals(new char[]{'b', 'c'}, ArrayUtils.subarray(c, 1, 5));
        assertArrayEquals(new char[]{'a', 'b'}, ArrayUtils.subarray(c, -1, 2));
        assertArrayEquals(new char[0], ArrayUtils.subarray(c, 2, 1));

        assertNull(ArrayUtils.subarray((byte[]) null, 0, 1));
        byte[] by = new byte[]{1, 2, 3};
        assertArrayEquals(new byte[]{2, 3}, ArrayUtils.subarray(by, 1, 5));
        assertArrayEquals(new byte[]{1, 2}, ArrayUtils.subarray(by, -1, 2));
        assertArrayEquals(new byte[0], ArrayUtils.subarray(by, 2, 1));

        assertNull(ArrayUtils.subarray((double[]) null, 0, 1));
        double[] d = new double[]{1.0, 2.0, 3.0};
        assertArrayEquals(new double[]{2.0, 3.0}, ArrayUtils.subarray(d, 1, 5), DELTA);
        assertArrayEquals(new double[]{1.0, 2.0}, ArrayUtils.subarray(d, -1, 2), DELTA);
        assertArrayEquals(new double[0], ArrayUtils.subarray(d, 2, 1), DELTA);

        assertNull(ArrayUtils.subarray((float[]) null, 0, 1));
        float[] f = new float[]{1.0f, 2.0f, 3.0f};
        assertArrayEquals(new float[]{2.0f, 3.0f}, ArrayUtils.subarray(f, 1, 5), FLOAT_DELTA);
        assertArrayEquals(new float[]{1.0f, 2.0f}, ArrayUtils.subarray(f, -1, 2), FLOAT_DELTA);
        assertArrayEquals(new float[0], ArrayUtils.subarray(f, 2, 1), FLOAT_DELTA);

        assertNull(ArrayUtils.subarray((boolean[]) null, 0, 1));
        boolean[] bool = new boolean[]{true, false, true};
        assertTrue(ArrayUtils.isEquals(new boolean[]{false, true}, ArrayUtils.subarray(bool, 1, 5)));
        assertTrue(ArrayUtils.isEquals(new boolean[]{true, false}, ArrayUtils.subarray(bool, -1, 2)));
        assertTrue(ArrayUtils.isEquals(new boolean[0], ArrayUtils.subarray(bool, 2, 1)));
    }

    @Test
    public void testIsSameLength() {
        assertTrue(ArrayUtils.isSameLength((Object[]) null, (Object[]) null));
        assertTrue(ArrayUtils.isSameLength(new Object[0], (Object[]) null));
        assertTrue(ArrayUtils.isSameLength((Object[]) null, new Object[0]));
        assertFalse(ArrayUtils.isSameLength(new Object[1], (Object[]) null));
        assertFalse(ArrayUtils.isSameLength((Object[]) null, new Object[1]));
        assertTrue(ArrayUtils.isSameLength(new Object[2], new Object[2]));
        assertFalse(ArrayUtils.isSameLength(new Object[1], new Object[2]));

        assertTrue(ArrayUtils.isSameLength((long[]) null, (long[]) null));
        assertFalse(ArrayUtils.isSameLength(new long[1], (long[]) null));
        assertFalse(ArrayUtils.isSameLength((long[]) null, new long[1]));
        assertTrue(ArrayUtils.isSameLength(new long[1], new long[1]));
        assertFalse(ArrayUtils.isSameLength(new long[1], new long[2]));

        assertTrue(ArrayUtils.isSameLength((int[]) null, (int[]) null));
        assertFalse(ArrayUtils.isSameLength(new int[1], (int[]) null));
        assertFalse(ArrayUtils.isSameLength((int[]) null, new int[1]));
        assertTrue(ArrayUtils.isSameLength(new int[1], new int[1]));
        assertFalse(ArrayUtils.isSameLength(new int[1], new int[2]));

        assertTrue(ArrayUtils.isSameLength((short[]) null, (short[]) null));
        assertFalse(ArrayUtils.isSameLength(new short[1], (short[]) null));
        assertFalse(ArrayUtils.isSameLength((short[]) null, new short[1]));
        assertTrue(ArrayUtils.isSameLength(new short[1], new short[1]));
        assertFalse(ArrayUtils.isSameLength(new short[1], new short[2]));

        assertTrue(ArrayUtils.isSameLength((char[]) null, (char[]) null));
        assertFalse(ArrayUtils.isSameLength(new char[1], (char[]) null));
        assertFalse(ArrayUtils.isSameLength((char[]) null, new char[1]));
        assertTrue(ArrayUtils.isSameLength(new char[1], new char[1]));
        assertFalse(ArrayUtils.isSameLength(new char[1], new char[2]));

        assertTrue(ArrayUtils.isSameLength((byte[]) null, (byte[]) null));
        assertFalse(ArrayUtils.isSameLength(new byte[1], (byte[]) null));
        assertFalse(ArrayUtils.isSameLength((byte[]) null, new byte[1]));
        assertTrue(ArrayUtils.isSameLength(new byte[1], new byte[1]));
        assertFalse(ArrayUtils.isSameLength(new byte[1], new byte[2]));

        assertTrue(ArrayUtils.isSameLength((double[]) null, (double[]) null));
        assertFalse(ArrayUtils.isSameLength(new double[1], (double[]) null));
        assertFalse(ArrayUtils.isSameLength((double[]) null, new double[1]));
        assertTrue(ArrayUtils.isSameLength(new double[1], new double[1]));
        assertFalse(ArrayUtils.isSameLength(new double[1], new double[2]));

        assertTrue(ArrayUtils.isSameLength((float[]) null, (float[]) null));
        assertFalse(ArrayUtils.isSameLength(new float[1], (float[]) null));
        assertFalse(ArrayUtils.isSameLength((float[]) null, new float[1]));
        assertTrue(ArrayUtils.isSameLength(new float[1], new float[1]));
        assertFalse(ArrayUtils.isSameLength(new float[1], new float[2]));

        assertTrue(ArrayUtils.isSameLength((boolean[]) null, (boolean[]) null));
        assertFalse(ArrayUtils.isSameLength(new boolean[1], (boolean[]) null));
        assertFalse(ArrayUtils.isSameLength((boolean[]) null, new boolean[1]));
        assertTrue(ArrayUtils.isSameLength(new boolean[1], new boolean[1]));
        assertFalse(ArrayUtils.isSameLength(new boolean[1], new boolean[2]));
    }

    @Test
    public void testGetLength() {
        assertEquals(0, ArrayUtils.getLength(null));
        assertEquals(2, ArrayUtils.getLength(new int[]{1, 2}));
        assertEquals(1, ArrayUtils.getLength(new String[]{"a"}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLength_notArray_throwsException() {
        ArrayUtils.getLength("notAnArray");
    }

    @Test
    public void testIsSameType() {
        assertTrue(ArrayUtils.isSameType(new int[]{1}, new int[]{2, 3}));
        assertFalse(ArrayUtils.isSameType(new int[]{1}, new long[]{1L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameType_nullFirst_throwsException() {
        ArrayUtils.isSameType(null, new int[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameType_nullSecond_throwsException() {
        ArrayUtils.isSameType(new int[]{1}, null);
    }

    @Test
    public void testReverse() {
        ArrayUtils.reverse((Object[]) null);
        String[] s = new String[]{"a", "b", "c"};
        ArrayUtils.reverse(s);
        assertArrayEquals(new String[]{"c", "b", "a"}, s);

        ArrayUtils.reverse((long[]) null);
        long[] l = new long[]{1L, 2L};
        ArrayUtils.reverse(l);
        assertArrayEquals(new long[]{2L, 1L}, l);

        ArrayUtils.reverse((int[]) null);
        int[] i = new int[]{1, 2, 3};
        ArrayUtils.reverse(i);
        assertArrayEquals(new int[]{3, 2, 1}, i);

        ArrayUtils.reverse((short[]) null);
        short[] sh = new short[]{1, 2};
        ArrayUtils.reverse(sh);
        assertArrayEquals(new short[]{2, 1}, sh);

        ArrayUtils.reverse((char[]) null);
        char[] c = new char[]{'a', 'b'};
        ArrayUtils.reverse(c);
        assertArrayEquals(new char[]{'b', 'a'}, c);

        ArrayUtils.reverse((byte[]) null);
        byte[] b = new byte[]{1, 2};
        ArrayUtils.reverse(b);
        assertArrayEquals(new byte[]{2, 1}, b);

        ArrayUtils.reverse((double[]) null);
        double[] d = new double[]{1.0, 2.0};
        ArrayUtils.reverse(d);
        assertArrayEquals(new double[]{2.0, 1.0}, d, DELTA);

        ArrayUtils.reverse((float[]) null);
        float[] f = new float[]{1.0f, 2.0f};
        ArrayUtils.reverse(f);
        assertArrayEquals(new float[]{2.0f, 1.0f}, f, FLOAT_DELTA);

        ArrayUtils.reverse((boolean[]) null);
        boolean[] bool = new boolean[]{true, false};
        ArrayUtils.reverse(bool);
        assertTrue(ArrayUtils.isEquals(new boolean[]{false, true}, bool));
    }

    @Test
    public void testIndexOfAndLastIndexOf_object() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((Object[]) null, "a"));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((Object[]) null, "a"));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new String[]{"a"}, "a", -1));

        String[] array = new String[]{"a", null, "b", "a", null};
        assertEquals(0, ArrayUtils.indexOf(array, "a"));
        assertEquals(3, ArrayUtils.indexOf(array, "a", 1));
        assertEquals(0, ArrayUtils.indexOf(array, "a", -5));
        assertEquals(1, ArrayUtils.indexOf(array, null));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(array, "c"));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(array, 123)); // incompatible type

        assertEquals(3, ArrayUtils.lastIndexOf(array, "a"));
        assertEquals(0, ArrayUtils.lastIndexOf(array, "a", 2));
        assertEquals(3, ArrayUtils.lastIndexOf(array, "a", 10));
        assertEquals(4, ArrayUtils.lastIndexOf(array, null));
        assertEquals(1, ArrayUtils.lastIndexOf(array, null, 2));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(array, "c"));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(array, 123));

        assertTrue(ArrayUtils.contains(array, "b"));
        assertFalse(ArrayUtils.contains(array, "z"));
    }

    @Test
    public void testIndexOfAndLastIndexOf_long() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((long[]) null, 1L));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((long[]) null, 1L));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new long[]{1L}, 1L, -1));

        long[] l = new long[]{1L, 2L, 1L};
        assertEquals(0, ArrayUtils.indexOf(l, 1L));
        assertEquals(2, ArrayUtils.indexOf(l, 1L, 1));
        assertEquals(0, ArrayUtils.indexOf(l, 1L, -1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(l, 3L));

        assertEquals(2, ArrayUtils.lastIndexOf(l, 1L));
        assertEquals(0, ArrayUtils.lastIndexOf(l, 1L, 1));
        assertEquals(2, ArrayUtils.lastIndexOf(l, 1L, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(l, 3L));

        assertTrue(ArrayUtils.contains(l, 2L));
        assertFalse(ArrayUtils.contains(l, 3L));
    }

    @Test
    public void testIndexOfAndLastIndexOf_int() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((int[]) null, 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((int[]) null, 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new int[]{1}, 1, -1));

        int[] i = new int[]{1, 2, 1};
        assertEquals(0, ArrayUtils.indexOf(i, 1));
        assertEquals(2, ArrayUtils.indexOf(i, 1, 1));
        assertEquals(0, ArrayUtils.indexOf(i, 1, -1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(i, 3));

        assertEquals(2, ArrayUtils.lastIndexOf(i, 1));
        assertEquals(0, ArrayUtils.lastIndexOf(i, 1, 1));
        assertEquals(2, ArrayUtils.lastIndexOf(i, 1, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(i, 3));

        assertTrue(ArrayUtils.contains(i, 2));
        assertFalse(ArrayUtils.contains(i, 3));
    }

    @Test
    public void testIndexOfAndLastIndexOf_short() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((short[]) null, (short) 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((short[]) null, (short) 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new short[]{1}, (short) 1, -1));

        short[] s = new short[]{1, 2, 1};
        assertEquals(0, ArrayUtils.indexOf(s, (short) 1));
        assertEquals(2, ArrayUtils.indexOf(s, (short) 1, 1));
        assertEquals(0, ArrayUtils.indexOf(s, (short) 1, -1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(s, (short) 3));

        assertEquals(2, ArrayUtils.lastIndexOf(s, (short) 1));
        assertEquals(0, ArrayUtils.lastIndexOf(s, (short) 1, 1));
        assertEquals(2, ArrayUtils.lastIndexOf(s, (short) 1, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(s, (short) 3));

        assertTrue(ArrayUtils.contains(s, (short) 2));
        assertFalse(ArrayUtils.contains(s, (short) 3));
    }

    @Test
    public void testIndexOfAndLastIndexOf_char() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((char[]) null, 'a'));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((char[]) null, 'a'));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new char[]{'a'}, 'a', -1));

        char[] c = new char[]{'a', 'b', 'a'};
        assertEquals(0, ArrayUtils.indexOf(c, 'a'));
        assertEquals(2, ArrayUtils.indexOf(c, 'a', 1));
        assertEquals(0, ArrayUtils.indexOf(c, 'a', -1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(c, 'z'));

        assertEquals(2, ArrayUtils.lastIndexOf(c, 'a'));
        assertEquals(0, ArrayUtils.lastIndexOf(c, 'a', 1));
        assertEquals(2, ArrayUtils.lastIndexOf(c, 'a', 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(c, 'z'));

        assertTrue(ArrayUtils.contains(c, 'b'));
        assertFalse(ArrayUtils.contains(c, 'z'));
    }

    @Test
    public void testIndexOfAndLastIndexOf_byte() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((byte[]) null, (byte) 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((byte[]) null, (byte) 1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new byte[]{1}, (byte) 1, -1));

        byte[] b = new byte[]{1, 2, 1};
        assertEquals(0, ArrayUtils.indexOf(b, (byte) 1));
        assertEquals(2, ArrayUtils.indexOf(b, (byte) 1, 1));
        assertEquals(0, ArrayUtils.indexOf(b, (byte) 1, -1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(b, (byte) 3));

        assertEquals(2, ArrayUtils.lastIndexOf(b, (byte) 1));
        assertEquals(0, ArrayUtils.lastIndexOf(b, (byte) 1, 1));
        assertEquals(2, ArrayUtils.lastIndexOf(b, (byte) 1, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(b, (byte) 3));

        assertTrue(ArrayUtils.contains(b, (byte) 2));
        assertFalse(ArrayUtils.contains(b, (byte) 3));
    }

    @Test
    public void testIndexOfAndLastIndexOf_double() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((double[]) null, 1.0));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((double[]) null, 1.0, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((double[]) null, 1.0));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((double[]) null, 1.0, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new double[]{1.0}, 1.0, -1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new double[]{1.0}, 1.0, -1, 0.1));

        double[] d = new double[]{1.0, 2.0, 1.05};
        assertEquals(0, ArrayUtils.indexOf(d, 1.0));
        assertEquals(0, ArrayUtils.indexOf(d, 1.0, -1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(d, 3.0));

        assertEquals(0, ArrayUtils.indexOf(d, 1.0, 0.1));
        assertEquals(2, ArrayUtils.indexOf(d, 1.0, 1, 0.1));
        assertEquals(0, ArrayUtils.indexOf(d, 1.0, -1, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(d, 5.0, 0.1));

        assertEquals(0, ArrayUtils.lastIndexOf(d, 1.0));
        assertEquals(0, ArrayUtils.lastIndexOf(d, 1.0, 1));
        assertEquals(0, ArrayUtils.lastIndexOf(d, 1.0, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(d, 3.0));

        assertEquals(2, ArrayUtils.lastIndexOf(d, 1.0, 0.1));
        assertEquals(0, ArrayUtils.lastIndexOf(d, 1.0, 1, 0.1));
        assertEquals(2, ArrayUtils.lastIndexOf(d, 1.0, 5, 0.1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(d, 5.0, 0.1));

        assertTrue(ArrayUtils.contains(d, 2.0));
        assertFalse(ArrayUtils.contains(d, 3.0));
        assertTrue(ArrayUtils.contains(d, 1.0, 0.1));
        assertFalse(ArrayUtils.contains(d, 5.0, 0.1));
    }

    @Test
    public void testIndexOfAndLastIndexOf_float() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((float[]) null, 1.0f));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((float[]) null, 1.0f));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new float[]{1.0f}, 1.0f, -1));

        float[] f = new float[]{1.0f, 2.0f, 1.0f};
        assertEquals(0, ArrayUtils.indexOf(f, 1.0f));
        assertEquals(2, ArrayUtils.indexOf(f, 1.0f, 1));
        assertEquals(0, ArrayUtils.indexOf(f, 1.0f, -1));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(f, 3.0f));

        assertEquals(2, ArrayUtils.lastIndexOf(f, 1.0f));
        assertEquals(0, ArrayUtils.lastIndexOf(f, 1.0f, 1));
        assertEquals(2, ArrayUtils.lastIndexOf(f, 1.0f, 5));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(f, 3.0f));

        assertTrue(ArrayUtils.contains(f, 2.0f));
        assertFalse(ArrayUtils.contains(f, 3.0f));
    }

    @Test
    public void testIndexOfAndLastIndexOf_boolean() {
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf((boolean[]) null, true));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf((boolean[]) null, true));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.lastIndexOf(new boolean[]{true}, true, -1));

        boolean[] bool = new boolean[]{true, false, true};
        assertEquals(0, ArrayUtils.indexOf(bool, true));
        assertEquals(2, ArrayUtils.indexOf(bool, true, 1));
        assertEquals(0, ArrayUtils.indexOf(bool, true, -1));
        assertEquals(1, ArrayUtils.indexOf(bool, false));

        assertEquals(2, ArrayUtils.lastIndexOf(bool, true));
        assertEquals(0, ArrayUtils.lastIndexOf(bool, true, 1));
        assertEquals(2, ArrayUtils.lastIndexOf(bool, true, 5));
        assertEquals(1, ArrayUtils.lastIndexOf(bool, false));

        assertTrue(ArrayUtils.contains(bool, true));
        assertFalse(ArrayUtils.contains(new boolean[]{false}, true));
    }

    @Test
    public void testToPrimitiveAndToObject_character() {
        assertNull(ArrayUtils.toPrimitive((Character[]) null));
        assertArrayEquals(new char[0], ArrayUtils.toPrimitive(new Character[0]));
        assertArrayEquals(new char[]{'a', 'b'}, ArrayUtils.toPrimitive(new Character[]{'a', 'b'}));

        assertNull(ArrayUtils.toPrimitive((Character[]) null, 'x'));
        assertArrayEquals(new char[0], ArrayUtils.toPrimitive(new Character[0], 'x'));
        assertArrayEquals(new char[]{'a', 'x'}, ArrayUtils.toPrimitive(new Character[]{'a', null}, 'x'));

        assertNull(ArrayUtils.toObject((char[]) null));
        assertArrayEquals(new Character[0], ArrayUtils.toObject(new char[0]));
        assertArrayEquals(new Character[]{'a', 'b'}, ArrayUtils.toObject(new char[]{'a', 'b'}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitive_characterWithNull_throwsException() {
        ArrayUtils.toPrimitive(new Character[]{'a', null});
    }

    @Test
    public void testToPrimitiveAndToObject_long() {
        assertNull(ArrayUtils.toPrimitive((Long[]) null));
        assertArrayEquals(new long[0], ArrayUtils.toPrimitive(new Long[0]));
        assertArrayEquals(new long[]{1L, 2L}, ArrayUtils.toPrimitive(new Long[]{1L, 2L}));

        assertNull(ArrayUtils.toPrimitive((Long[]) null, 0L));
        assertArrayEquals(new long[0], ArrayUtils.toPrimitive(new Long[0], 0L));
        assertArrayEquals(new long[]{1L, 99L}, ArrayUtils.toPrimitive(new Long[]{1L, null}, 99L));

        assertNull(ArrayUtils.toObject((long[]) null));
        assertArrayEquals(new Long[0], ArrayUtils.toObject(new long[0]));
        assertArrayEquals(new Long[]{1L, 2L}, ArrayUtils.toObject(new long[]{1L, 2L}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitive_longWithNull_throwsException() {
        ArrayUtils.toPrimitive(new Long[]{1L, null});
    }

    @Test
    public void testToPrimitiveAndToObject_int() {
        assertNull(ArrayUtils.toPrimitive((Integer[]) null));
        assertArrayEquals(new int[0], ArrayUtils.toPrimitive(new Integer[0]));
        assertArrayEquals(new int[]{1, 2}, ArrayUtils.toPrimitive(new Integer[]{1, 2}));

        assertNull(ArrayUtils.toPrimitive((Integer[]) null, 0));
        assertArrayEquals(new int[0], ArrayUtils.toPrimitive(new Integer[0], 0));
        assertArrayEquals(new int[]{1, 99}, ArrayUtils.toPrimitive(new Integer[]{1, null}, 99));

        assertNull(ArrayUtils.toObject((int[]) null));
        assertArrayEquals(new Integer[0], ArrayUtils.toObject(new int[0]));
        assertArrayEquals(new Integer[]{1, 2}, ArrayUtils.toObject(new int[]{1, 2}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitive_intWithNull_throwsException() {
        ArrayUtils.toPrimitive(new Integer[]{1, null});
    }

    @Test
    public void testToPrimitiveAndToObject_short() {
        assertNull(ArrayUtils.toPrimitive((Short[]) null));
        assertArrayEquals(new short[0], ArrayUtils.toPrimitive(new Short[0]));
        assertArrayEquals(new short[]{1, 2}, ArrayUtils.toPrimitive(new Short[]{1, 2}));

        assertNull(ArrayUtils.toPrimitive((Short[]) null, (short) 0));
        assertArrayEquals(new short[0], ArrayUtils.toPrimitive(new Short[0], (short) 0));
        assertArrayEquals(new short[]{1, 99}, ArrayUtils.toPrimitive(new Short[]{1, null}, (short) 99));

        assertNull(ArrayUtils.toObject((short[]) null));
        assertArrayEquals(new Short[0], ArrayUtils.toObject(new short[0]));
        assertArrayEquals(new Short[]{1, 2}, ArrayUtils.toObject(new short[]{1, 2}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitive_shortWithNull_throwsException() {
        ArrayUtils.toPrimitive(new Short[]{1, null});
    }

    @Test
    public void testToPrimitiveAndToObject_byte() {
        assertNull(ArrayUtils.toPrimitive((Byte[]) null));
        assertArrayEquals(new byte[0], ArrayUtils.toPrimitive(new Byte[0]));
        assertArrayEquals(new byte[]{1, 2}, ArrayUtils.toPrimitive(new Byte[]{1, 2}));

        assertNull(ArrayUtils.toPrimitive((Byte[]) null, (byte) 0));
        assertArrayEquals(new byte[0], ArrayUtils.toPrimitive(new Byte[0], (byte) 0));
        assertArrayEquals(new byte[]{1, 99}, ArrayUtils.toPrimitive(new Byte[]{1, null}, (byte) 99));

        assertNull(ArrayUtils.toObject((byte[]) null));
        assertArrayEquals(new Byte[0], ArrayUtils.toObject(new byte[0]));
        assertArrayEquals(new Byte[]{1, 2}, ArrayUtils.toObject(new byte[]{1, 2}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitive_byteWithNull_throwsException() {
        ArrayUtils.toPrimitive(new Byte[]{1, null});
    }

    @Test
    public void testToPrimitiveAndToObject_double() {
        assertNull(ArrayUtils.toPrimitive((Double[]) null));
        assertArrayEquals(new double[0], ArrayUtils.toPrimitive(new Double[0]), DELTA);
        assertArrayEquals(new double[]{1.0, 2.0}, ArrayUtils.toPrimitive(new Double[]{1.0, 2.0}), DELTA);

        assertNull(ArrayUtils.toPrimitive((Double[]) null, 0.0));
        assertArrayEquals(new double[0], ArrayUtils.toPrimitive(new Double[0], 0.0), DELTA);
        assertArrayEquals(new double[]{1.0, 99.0}, ArrayUtils.toPrimitive(new Double[]{1.0, null}, 99.0), DELTA);

        assertNull(ArrayUtils.toObject((double[]) null));
        assertArrayEquals(new Double[0], ArrayUtils.toObject(new double[0]));
        assertArrayEquals(new Double[]{1.0, 2.0}, ArrayUtils.toObject(new double[]{1.0, 2.0}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitive_doubleWithNull_throwsException() {
        ArrayUtils.toPrimitive(new Double[]{1.0, null});
    }

    @Test
    public void testToPrimitiveAndToObject_float() {
        assertNull(ArrayUtils.toPrimitive((Float[]) null));
        assertArrayEquals(new float[0], ArrayUtils.toPrimitive(new Float[0]), FLOAT_DELTA);
        assertArrayEquals(new float[]{1.0f, 2.0f}, ArrayUtils.toPrimitive(new Float[]{1.0f, 2.0f}), FLOAT_DELTA);

        assertNull(ArrayUtils.toPrimitive((Float[]) null, 0.0f));
        assertArrayEquals(new float[0], ArrayUtils.toPrimitive(new Float[0], 0.0f), FLOAT_DELTA);
        assertArrayEquals(new float[]{1.0f, 99.0f}, ArrayUtils.toPrimitive(new Float[]{1.0f, null}, 99.0f), FLOAT_DELTA);

        assertNull(ArrayUtils.toObject((float[]) null));
        assertArrayEquals(new Float[0], ArrayUtils.toObject(new float[0]));
        assertArrayEquals(new Float[]{1.0f, 2.0f}, ArrayUtils.toObject(new float[]{1.0f, 2.0f}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitive_floatWithNull_throwsException() {
        ArrayUtils.toPrimitive(new Float[]{1.0f, null});
    }

    @Test
    public void testToPrimitiveAndToObject_boolean() {
        assertNull(ArrayUtils.toPrimitive((Boolean[]) null));
        assertTrue(ArrayUtils.isEquals(new boolean[0], ArrayUtils.toPrimitive(new Boolean[0])));
        assertTrue(ArrayUtils.isEquals(new boolean[]{true, false}, ArrayUtils.toPrimitive(new Boolean[]{true, false})));

        assertNull(ArrayUtils.toPrimitive((Boolean[]) null, true));
        assertTrue(ArrayUtils.isEquals(new boolean[0], ArrayUtils.toPrimitive(new Boolean[0], true)));
        assertTrue(ArrayUtils.isEquals(new boolean[]{true, false}, ArrayUtils.toPrimitive(new Boolean[]{true, null}, false)));

        assertNull(ArrayUtils.toObject((boolean[]) null));
        assertArrayEquals(new Boolean[0], ArrayUtils.toObject(new boolean[0]));
        assertArrayEquals(new Boolean[]{Boolean.TRUE, Boolean.FALSE}, ArrayUtils.toObject(new boolean[]{true, false}));
    }

    @Test(expected = NullPointerException.class)
    public void testToPrimitive_booleanWithNull_throwsException() {
        ArrayUtils.toPrimitive(new Boolean[]{true, null});
    }

    @Test
    public void testIsEmpty() {
        assertTrue(ArrayUtils.isEmpty((Object[]) null));
        assertTrue(ArrayUtils.isEmpty(new Object[0]));
        assertFalse(ArrayUtils.isEmpty(new Object[]{"a"}));

        assertTrue(ArrayUtils.isEmpty((long[]) null));
        assertTrue(ArrayUtils.isEmpty(new long[0]));
        assertFalse(ArrayUtils.isEmpty(new long[]{1L}));

        assertTrue(ArrayUtils.isEmpty((int[]) null));
        assertTrue(ArrayUtils.isEmpty(new int[0]));
        assertFalse(ArrayUtils.isEmpty(new int[]{1}));

        assertTrue(ArrayUtils.isEmpty((short[]) null));
        assertTrue(ArrayUtils.isEmpty(new short[0]));
        assertFalse(ArrayUtils.isEmpty(new short[]{1}));

        assertTrue(ArrayUtils.isEmpty((char[]) null));
        assertTrue(ArrayUtils.isEmpty(new char[0]));
        assertFalse(ArrayUtils.isEmpty(new char[]{'a'}));

        assertTrue(ArrayUtils.isEmpty((byte[]) null));
        assertTrue(ArrayUtils.isEmpty(new byte[0]));
        assertFalse(ArrayUtils.isEmpty(new byte[]{1}));

        assertTrue(ArrayUtils.isEmpty((double[]) null));
        assertTrue(ArrayUtils.isEmpty(new double[0]));
        assertFalse(ArrayUtils.isEmpty(new double[]{1.0}));

        assertTrue(ArrayUtils.isEmpty((float[]) null));
        assertTrue(ArrayUtils.isEmpty(new float[0]));
        assertFalse(ArrayUtils.isEmpty(new float[]{1.0f}));

        assertTrue(ArrayUtils.isEmpty((boolean[]) null));
        assertTrue(ArrayUtils.isEmpty(new boolean[0]));
        assertFalse(ArrayUtils.isEmpty(new boolean[]{true}));
    }

    @Test
    public void testAddAll() {
        assertNull(ArrayUtils.addAll((String[]) null, (String[]) null));
        assertArrayEquals(new String[]{"a"}, ArrayUtils.addAll(new String[]{"a"}, (String[]) null));
        assertArrayEquals(new String[]{"b"}, ArrayUtils.addAll((String[]) null, new String[]{"b"}));
        assertArrayEquals(new String[]{"a", "b", "c"}, ArrayUtils.addAll(new String[]{"a"}, "b", "c"));

        assertNull(ArrayUtils.addAll((boolean[]) null, (boolean[]) null));
        assertTrue(ArrayUtils.isEquals(new boolean[]{true}, ArrayUtils.addAll(new boolean[]{true}, (boolean[]) null)));
        assertTrue(ArrayUtils.isEquals(new boolean[]{false}, ArrayUtils.addAll((boolean[]) null, new boolean[]{false})));
        assertTrue(ArrayUtils.isEquals(new boolean[]{true, false}, ArrayUtils.addAll(new boolean[]{true}, false)));

        assertNull(ArrayUtils.addAll((char[]) null, (char[]) null));
        assertArrayEquals(new char[]{'a'}, ArrayUtils.addAll(new char[]{'a'}, (char[]) null));
        assertArrayEquals(new char[]{'b'}, ArrayUtils.addAll((char[]) null, new char[]{'b'}));
        assertArrayEquals(new char[]{'a', 'b'}, ArrayUtils.addAll(new char[]{'a'}, 'b'));

        assertNull(ArrayUtils.addAll((byte[]) null, (byte[]) null));
        assertArrayEquals(new byte[]{1}, ArrayUtils.addAll(new byte[]{1}, (byte[]) null));
        assertArrayEquals(new byte[]{2}, ArrayUtils.addAll((byte[]) null, new byte[]{2}));
        assertArrayEquals(new byte[]{1, 2}, ArrayUtils.addAll(new byte[]{1}, (byte) 2));

        assertNull(ArrayUtils.addAll((short[]) null, (short[]) null));
        assertArrayEquals(new short[]{1}, ArrayUtils.addAll(new short[]{1}, (short[]) null));
        assertArrayEquals(new short[]{2}, ArrayUtils.addAll((short[]) null, new short[]{2}));
        assertArrayEquals(new short[]{1, 2}, ArrayUtils.addAll(new short[]{1}, (short) 2));

        assertNull(ArrayUtils.addAll((int[]) null, (int[]) null));
        assertArrayEquals(new int[]{1}, ArrayUtils.addAll(new int[]{1}, (int[]) null));
        assertArrayEquals(new int[]{2}, ArrayUtils.addAll((int[]) null, new int[]{2}));
        assertArrayEquals(new int[]{1, 2}, ArrayUtils.addAll(new int[]{1}, 2));

        assertNull(ArrayUtils.addAll((long[]) null, (long[]) null));
        assertArrayEquals(new long[]{1L}, ArrayUtils.addAll(new long[]{1L}, (long[]) null));
        assertArrayEquals(new long[]{2L}, ArrayUtils.addAll((long[]) null, new long[]{2L}));
        assertArrayEquals(new long[]{1L, 2L}, ArrayUtils.addAll(new long[]{1L}, 2L));

        assertNull(ArrayUtils.addAll((float[]) null, (float[]) null));
        assertArrayEquals(new float[]{1.0f}, ArrayUtils.addAll(new float[]{1.0f}, (float[]) null), FLOAT_DELTA);
        assertArrayEquals(new float[]{2.0f}, ArrayUtils.addAll((float[]) null, new float[]{2.0f}), FLOAT_DELTA);
        assertArrayEquals(new float[]{1.0f, 2.0f}, ArrayUtils.addAll(new float[]{1.0f}, 2.0f), FLOAT_DELTA);

        assertNull(ArrayUtils.addAll((double[]) null, (double[]) null));
        assertArrayEquals(new double[]{1.0}, ArrayUtils.addAll(new double[]{1.0}, (double[]) null), DELTA);
        assertArrayEquals(new double[]{2.0}, ArrayUtils.addAll((double[]) null, new double[]{2.0}), DELTA);
        assertArrayEquals(new double[]{1.0, 2.0}, ArrayUtils.addAll(new double[]{1.0}, 2.0), DELTA);
    }

    @Test
    public void testAdd_append() {
        assertArrayEquals(new String[]{null}, ArrayUtils.add((String[]) null, null));
        assertArrayEquals(new String[]{"a"}, ArrayUtils.add((String[]) null, "a"));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.add(new String[]{"a"}, "b"));

        assertTrue(ArrayUtils.isEquals(new boolean[]{true}, ArrayUtils.add((boolean[]) null, true)));
        assertTrue(ArrayUtils.isEquals(new boolean[]{true, false}, ArrayUtils.add(new boolean[]{true}, false)));

        assertArrayEquals(new byte[]{1}, ArrayUtils.add((byte[]) null, (byte) 1));
        assertArrayEquals(new byte[]{1, 2}, ArrayUtils.add(new byte[]{1}, (byte) 2));

        assertArrayEquals(new char[]{'a'}, ArrayUtils.add((char[]) null, 'a'));
        assertArrayEquals(new char[]{'a', 'b'}, ArrayUtils.add(new char[]{'a'}, 'b'));

        assertArrayEquals(new double[]{1.0}, ArrayUtils.add((double[]) null, 1.0), DELTA);
        assertArrayEquals(new double[]{1.0, 2.0}, ArrayUtils.add(new double[]{1.0}, 2.0), DELTA);

        assertArrayEquals(new float[]{1.0f}, ArrayUtils.add((float[]) null, 1.0f), FLOAT_DELTA);
        assertArrayEquals(new float[]{1.0f, 2.0f}, ArrayUtils.add(new float[]{1.0f}, 2.0f), FLOAT_DELTA);

        assertArrayEquals(new int[]{1}, ArrayUtils.add((int[]) null, 1));
        assertArrayEquals(new int[]{1, 2}, ArrayUtils.add(new int[]{1}, 2));

        assertArrayEquals(new long[]{1L}, ArrayUtils.add((long[]) null, 1L));
        assertArrayEquals(new long[]{1L, 2L}, ArrayUtils.add(new long[]{1L}, 2L));

        assertArrayEquals(new short[]{1}, ArrayUtils.add((short[]) null, (short) 1));
        assertArrayEquals(new short[]{1, 2}, ArrayUtils.add(new short[]{1}, (short) 2));
    }

    @Test
    public void testAdd_atIndex() {
        assertArrayEquals(new Object[]{null}, ArrayUtils.add((Object[]) null, 0, null));
        assertArrayEquals(new String[]{"a"}, ArrayUtils.add((String[]) null, 0, "a"));
        assertArrayEquals(new String[]{"b", "a"}, ArrayUtils.add(new String[]{"a"}, 0, "b"));
        assertArrayEquals(new String[]{"a", "b"}, ArrayUtils.add(new String[]{"a"}, 1, "b"));
        assertArrayEquals(new String[]{"a", "b", "c"}, ArrayUtils.add(new String[]{"a", "c"}, 1, "b"));

        assertTrue(ArrayUtils.isEquals(new boolean[]{true}, ArrayUtils.add((boolean[]) null, 0, true)));
        assertTrue(ArrayUtils.isEquals(new boolean[]{true, false}, ArrayUtils.add(new boolean[]{true}, 1, false)));
        assertTrue(ArrayUtils.isEquals(new boolean[]{true, false, true}, ArrayUtils.add(new boolean[]{true, true}, 1, false)));

        assertArrayEquals(new byte[]{1}, ArrayUtils.add((byte[]) null, 0, (byte) 1));
        assertArrayEquals(new byte[]{1, 2, 3}, ArrayUtils.add(new byte[]{1, 3}, 1, (byte) 2));

        assertArrayEquals(new char[]{'a'}, ArrayUtils.add((char[]) null, 0, 'a'));
        assertArrayEquals(new char[]{'a', 'b', 'c'}, ArrayUtils.add(new char[]{'a', 'c'}, 1, 'b'));

        assertArrayEquals(new double[]{1.0}, ArrayUtils.add((double[]) null, 0, 1.0), DELTA);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, ArrayUtils.add(new double[]{1.0, 3.0}, 1, 2.0), DELTA);

        assertArrayEquals(new float[]{1.0f}, ArrayUtils.add((float[]) null, 0, 1.0f), FLOAT_DELTA);
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f}, ArrayUtils.add(new float[]{1.0f, 3.0f}, 1, 2.0f), FLOAT_DELTA);

        assertArrayEquals(new int[]{1}, ArrayUtils.add((int[]) null, 0, 1));
        assertArrayEquals(new int[]{1, 2, 3}, ArrayUtils.add(new int[]{1, 3}, 1, 2));

        assertArrayEquals(new long[]{1L}, ArrayUtils.add((long[]) null, 0, 1L));
        assertArrayEquals(new long[]{1L, 2L, 3L}, ArrayUtils.add(new long[]{1L, 3L}, 1, 2L));

        assertArrayEquals(new short[]{1}, ArrayUtils.add((short[]) null, 0, (short) 1));
        assertArrayEquals(new short[]{1, 2, 3}, ArrayUtils.add(new short[]{1, 3}, 1, (short) 2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_nullArrayNonZeroIndex_throwsException() {
        ArrayUtils.add((String[]) null, 1, "a");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_negativeIndex_throwsException() {
        ArrayUtils.add(new String[]{"a"}, -1, "b");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_indexGreaterThanLength_throwsException() {
        ArrayUtils.add(new String[]{"a"}, 2, "b");
    }

    @Test
    public void testRemove_index() {
        assertArrayEquals(new String[]{"b"}, ArrayUtils.remove(new String[]{"a", "b"}, 0));
        assertArrayEquals(new String[]{"a"}, ArrayUtils.remove(new String[]{"a", "b"}, 1));
        assertArrayEquals(new String[]{"a", "c"}, ArrayUtils.remove(new String[]{"a", "b", "c"}, 1));

        assertTrue(ArrayUtils.isEquals(new boolean[]{false}, ArrayUtils.remove(new boolean[]{true, false}, 0)));
        assertTrue(ArrayUtils.isEquals(new boolean[]{true}, ArrayUtils.remove(new boolean[]{true, false}, 1)));

        assertArrayEquals(new byte[]{2}, ArrayUtils.remove(new byte[]{1, 2}, 0));
        assertArrayEquals(new char[]{'b'}, ArrayUtils.remove(new char[]{'a', 'b'}, 0));
        assertArrayEquals(new double[]{2.0}, ArrayUtils.remove(new double[]{1.0, 2.0}, 0), DELTA);
        assertArrayEquals(new float[]{2.0f}, ArrayUtils.remove(new float[]{1.0f, 2.0f}, 0), FLOAT_DELTA);
        assertArrayEquals(new int[]{2}, ArrayUtils.remove(new int[]{1, 2}, 0));
        assertArrayEquals(new long[]{2L}, ArrayUtils.remove(new long[]{1L, 2L}, 0));
        assertArrayEquals(new short[]{2}, ArrayUtils.remove(new short[]{1, 2}, 0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_nullArray_throwsException() {
        ArrayUtils.remove((String[]) null, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_indexOutOfBounds_throwsException() {
        ArrayUtils.remove(new String[]{"a"}, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_negativeIndex_throwsException() {
        ArrayUtils.remove(new String[]{"a"}, -1);
    }

    @Test
    public void testRemoveElement() {
        assertNull(ArrayUtils.removeElement((String[]) null, "a"));
        assertArrayEquals(new String[]{"a"}, ArrayUtils.removeElement(new String[]{"a"}, "b"));
        assertArrayEquals(new String[]{"b"}, ArrayUtils.removeElement(new String[]{"a", "b"}, "a"));

        assertNull(ArrayUtils.removeElement((boolean[]) null, true));
        assertTrue(ArrayUtils.isEquals(new boolean[]{true}, ArrayUtils.removeElement(new boolean[]{true}, false)));
        assertTrue(ArrayUtils.isEquals(new boolean[]{false}, ArrayUtils.removeElement(new boolean[]{true, false}, true)));

        assertNull(ArrayUtils.removeElement((byte[]) null, (byte) 1));
        assertArrayEquals(new byte[]{1}, ArrayUtils.removeElement(new byte[]{1}, (byte) 2));
        assertArrayEquals(new byte[]{2}, ArrayUtils.removeElement(new byte[]{1, 2}, (byte) 1));

        assertNull(ArrayUtils.removeElement((char[]) null, 'a'));
        assertArrayEquals(new char[]{'a'}, ArrayUtils.removeElement(new char[]{'a'}, 'b'));
        assertArrayEquals(new char[]{'b'}, ArrayUtils.removeElement(new char[]{'a', 'b'}, 'a'));

        assertNull(ArrayUtils.removeElement((double[]) null, 1.0));
        assertArrayEquals(new double[]{1.0}, ArrayUtils.removeElement(new double[]{1.0}, 2.0), DELTA);
        assertArrayEquals(new double[]{2.0}, ArrayUtils.removeElement(new double[]{1.0, 2.0}, 1.0), DELTA);

        assertNull(ArrayUtils.removeElement((float[]) null, 1.0f));
        assertArrayEquals(new float[]{1.0f}, ArrayUtils.removeElement(new float[]{1.0f}, 2.0f), FLOAT_DELTA);
        assertArrayEquals(new float[]{2.0f}, ArrayUtils.removeElement(new float[]{1.0f, 2.0f}, 1.0f), FLOAT_DELTA);

        assertNull(ArrayUtils.removeElement((int[]) null, 1));
        assertArrayEquals(new int[]{1}, ArrayUtils.removeElement(new int[]{1}, 2));
        assertArrayEquals(new int[]{2}, ArrayUtils.removeElement(new int[]{1, 2}, 1));

        assertNull(ArrayUtils.removeElement((long[]) null, 1L));
        assertArrayEquals(new long[]{1L}, ArrayUtils.removeElement(new long[]{1L}, 2L));
        assertArrayEquals(new long[]{2L}, ArrayUtils.removeElement(new long[]{1L, 2L}, 1L));

        assertNull(ArrayUtils.removeElement((short[]) null, (short) 1));
        assertArrayEquals(new short[]{1}, ArrayUtils.removeElement(new short[]{1}, (short) 2));
        assertArrayEquals(new short[]{2}, ArrayUtils.removeElement(new short[]{1, 2}, (short) 1));
    }
}
