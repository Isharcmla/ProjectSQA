package org.apache.commons.collections.keyvalue;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.Arrays;

public class MultiKeyTest {

    private MultiKey twoKey;
    private MultiKey threeKey;
    private MultiKey fourKey;
    private MultiKey fiveKey;

    @Before
    public void setUp() {
        twoKey = new MultiKey("A", "B");
        threeKey = new MultiKey("A", "B", "C");
        fourKey = new MultiKey("A", "B", "C", "D");
        fiveKey = new MultiKey("A", "B", "C", "D", "E");
    }

    // ---------- Constructor: two keys ----------
    @Test
    public void testConstructor_twoKeys_normalInput() {
        MultiKey mk = new MultiKey("key1", "key2");
        assertEquals(2, mk.size());
        assertEquals("key1", mk.getKey(0));
        assertEquals("key2", mk.getKey(1));
    }

    @Test
    public void testConstructor_twoKeys_withNulls() {
        MultiKey mk = new MultiKey(null, null);
        assertEquals(2, mk.size());
        assertNull(mk.getKey(0));
        assertNull(mk.getKey(1));
        assertEquals(0, mk.hashCode());
    }

    // ---------- Constructor: three keys ----------
    @Test
    public void testConstructor_threeKeys_normalInput() {
        MultiKey mk = new MultiKey("key1", "key2", "key3");
        assertEquals(3, mk.size());
        assertEquals("key1", mk.getKey(0));
        assertEquals("key2", mk.getKey(1));
        assertEquals("key3", mk.getKey(2));
    }

    @Test
    public void testConstructor_threeKeys_withNulls() {
        MultiKey mk = new MultiKey(null, "key2", null);
        assertEquals(3, mk.size());
        assertNull(mk.getKey(0));
        assertEquals("key2", mk.getKey(1));
        assertNull(mk.getKey(2));
    }

    // ---------- Constructor: four keys ----------
    @Test
    public void testConstructor_fourKeys_normalInput() {
        MultiKey mk = new MultiKey("key1", "key2", "key3", "key4");
        assertEquals(4, mk.size());
        assertEquals("key1", mk.getKey(0));
        assertEquals("key2", mk.getKey(1));
        assertEquals("key3", mk.getKey(2));
        assertEquals("key4", mk.getKey(3));
    }

    @Test
    public void testConstructor_fourKeys_withNulls() {
        MultiKey mk = new MultiKey(null, null, null, null);
        assertEquals(4, mk.size());
        assertEquals(0, mk.hashCode());
    }

    // ---------- Constructor: five keys ----------
    @Test
    public void testConstructor_fiveKeys_normalInput() {
        MultiKey mk = new MultiKey("key1", "key2", "key3", "key4", "key5");
        assertEquals(5, mk.size());
        assertEquals("key1", mk.getKey(0));
        assertEquals("key2", mk.getKey(1));
        assertEquals("key3", mk.getKey(2));
        assertEquals("key4", mk.getKey(3));
        assertEquals("key5", mk.getKey(4));
    }

    @Test
    public void testConstructor_fiveKeys_withNulls() {
        MultiKey mk = new MultiKey(null, null, null, null, null);
        assertEquals(5, mk.size());
        assertEquals(0, mk.hashCode());
    }

    // ---------- Constructor: array (clones) ----------
    @Test
    public void testConstructor_arrayClone_normalInput() {
        Object[] arr = new Object[] {"A", "B", "C"};
        MultiKey mk = new MultiKey(arr);
        assertEquals(3, mk.size());
        // modify original array - should not affect MultiKey since cloned
        arr[0] = "CHANGED";
        assertEquals("A", mk.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_arrayClone_nullArray_throwsException() {
        Object[] arr = null;
        new MultiKey(arr);
    }

    // ---------- Constructor: array with makeClone flag ----------
    @Test
    public void testConstructor_arrayNoClone_normalInput() {
        Object[] arr = new Object[] {"A", "B"};
        MultiKey mk = new MultiKey(arr, false);
        assertEquals(2, mk.size());
        // modify original array - SHOULD affect MultiKey since not cloned
        arr[0] = "CHANGED";
        assertEquals("CHANGED", mk.getKey(0));
    }

    @Test
    public void testConstructor_arrayWithCloneTrue_normalInput() {
        Object[] arr = new Object[] {"A", "B"};
        MultiKey mk = new MultiKey(arr, true);
        assertEquals(2, mk.size());
        arr[0] = "CHANGED";
        assertEquals("A", mk.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_arrayWithFlag_nullArray_throwsException() {
        new MultiKey(null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_arrayWithFlagFalse_nullArray_throwsException() {
        new MultiKey(null, false);
    }

    @Test
    public void testConstructor_emptyArray_normalInput() {
        Object[] arr = new Object[0];
        MultiKey mk = new MultiKey(arr, false);
        assertEquals(0, mk.size());
        assertEquals(0, mk.hashCode());
    }

    // ---------- getKeys() ----------
    @Test
    public void testGetKeys_returnsClonedArray() {
        Object[] keys = twoKey.getKeys();
        assertEquals(2, keys.length);
        assertEquals("A", keys[0]);
        assertEquals("B", keys[1]);

        // Modifying returned array should not affect internal state
        keys[0] = "CHANGED";
        assertEquals("A", twoKey.getKey(0));
    }

    @Test
    public void testGetKeys_withNullElements() {
        MultiKey mk = new MultiKey(null, "B");
        Object[] keys = mk.getKeys();
        assertNull(keys[0]);
        assertEquals("B", keys[1]);
    }

    // ---------- getKey(index) ----------
    @Test
    public void testGetKey_validIndex_returnsCorrectValue() {
        assertEquals("A", twoKey.getKey(0));
        assertEquals("B", twoKey.getKey(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetKey_negativeIndex_throwsException() {
        twoKey.getKey(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetKey_indexOutOfBounds_throwsException() {
        twoKey.getKey(5);
    }

    // ---------- size() ----------
    @Test
    public void testSize_returnsCorrectCount() {
        assertEquals(2, twoKey.size());
        assertEquals(3, threeKey.size());
        assertEquals(4, fourKey.size());
        assertEquals(5, fiveKey.size());
    }

    // ---------- equals() ----------
    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(twoKey.equals(twoKey));
    }

    @Test
    public void testEquals_equalKeys_returnsTrue() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B");
        assertTrue(mk1.equals(mk2));
        assertTrue(mk2.equals(mk1));
    }

    @Test
    public void testEquals_differentKeys_returnsFalse() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEquals_differentSize_returnsFalse() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEquals_notMultiKeyInstance_returnsFalse() {
        assertFalse(twoKey.equals("Not a MultiKey"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(twoKey.equals(null));
    }

    @Test
    public void testEquals_withNullKeys_returnsTrue() {
        MultiKey mk1 = new MultiKey(null, null);
        MultiKey mk2 = new MultiKey(null, null);
        assertTrue(mk1.equals(mk2));
    }

    @Test
    public void testEquals_oneNullKeyDifferent_returnsFalse() {
        MultiKey mk1 = new MultiKey(null, "B");
        MultiKey mk2 = new MultiKey("A", "B");
        assertFalse(mk1.equals(mk2));
    }

    // ---------- hashCode() ----------
    @Test
    public void testHashCode_equalObjects_haveSameHashCode() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B");
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCode_cachedValue_consistentAcrossCalls() {
        int hash1 = twoKey.hashCode();
        int hash2 = twoKey.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testHashCode_withAllNullKeys_isZero() {
        MultiKey mk = new MultiKey(null, null, null);
        assertEquals(0, mk.hashCode());
    }

    @Test
    public void testHashCode_matchesXorOfKeyHashCodes() {
        String a = "A";
        String b = "B";
        MultiKey mk = new MultiKey(a, b);
        int expected = a.hashCode() ^ b.hashCode();
        assertEquals(expected, mk.hashCode());
    }

    // ---------- toString() ----------
    @Test
    public void testToString_normalInput_returnsExpectedFormat() {
        MultiKey mk = new MultiKey("A", "B");
        String result = mk.toString();
        assertEquals("MultiKey" + Arrays.asList(new Object[]{"A", "B"}).toString(), result);
    }

    @Test
    public void testToString_withNullKeys_returnsExpectedFormat() {
        MultiKey mk = new MultiKey(null, "B");
        String result = mk.toString();
        assertTrue(result.startsWith("MultiKey"));
        assertTrue(result.contains("null"));
        assertTrue(result.contains("B"));
    }

    @Test
    public void testToString_emptyArray_returnsExpectedFormat() {
        MultiKey mk = new MultiKey(new Object[0], false);
        assertEquals("MultiKey[]", mk.toString());
    }
}
