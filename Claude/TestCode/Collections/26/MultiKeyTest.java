package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiKeyTest {

    // ---------- Constructor: two keys ----------
    @Test
    public void testConstructor_twoKeys_normal() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        assertEquals(2, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
    }

    @Test
    public void testConstructor_twoKeys_withNulls() {
        MultiKey<String> mk = new MultiKey<>(null, null);
        assertEquals(2, mk.size());
        assertNull(mk.getKey(0));
        assertNull(mk.getKey(1));
        assertEquals(0, mk.hashCode());
    }

    // ---------- Constructor: three keys ----------
    @Test
    public void testConstructor_threeKeys_normal() {
        MultiKey<String> mk = new MultiKey<>("A", "B", "C");
        assertEquals(3, mk.size());
        assertEquals("C", mk.getKey(2));
    }

    @Test
    public void testConstructor_threeKeys_withNull() {
        MultiKey<String> mk = new MultiKey<>("A", null, "C");
        assertEquals(3, mk.size());
        assertNull(mk.getKey(1));
    }

    // ---------- Constructor: four keys ----------
    @Test
    public void testConstructor_fourKeys_normal() {
        MultiKey<String> mk = new MultiKey<>("A", "B", "C", "D");
        assertEquals(4, mk.size());
        assertEquals("D", mk.getKey(3));
    }

    @Test
    public void testConstructor_fourKeys_withNull() {
        MultiKey<String> mk = new MultiKey<>("A", "B", null, "D");
        assertEquals(4, mk.size());
        assertNull(mk.getKey(2));
    }

    // ---------- Constructor: five keys ----------
    @Test
    public void testConstructor_fiveKeys_normal() {
        MultiKey<String> mk = new MultiKey<>("A", "B", "C", "D", "E");
        assertEquals(5, mk.size());
        assertEquals("E", mk.getKey(4));
    }

    @Test
    public void testConstructor_fiveKeys_withNull() {
        MultiKey<String> mk = new MultiKey<>("A", "B", "C", "D", null);
        assertEquals(5, mk.size());
        assertNull(mk.getKey(4));
    }

    // ---------- Constructor: array (clone) ----------
    @Test
    public void testConstructor_arrayClone_normal() {
        String[] keys = new String[] { "X", "Y", "Z" };
        MultiKey<String> mk = new MultiKey<>(keys);
        assertEquals(3, mk.size());
        assertEquals("X", mk.getKey(0));

        // modifying original array should not affect the MultiKey's internal keys
        keys[0] = "MODIFIED";
        assertEquals("X", mk.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_arrayNull_throwsException() {
        new MultiKey<Object>((Object[]) null);
    }

    // ---------- Constructor: array + makeClone boolean ----------
    @Test
    public void testConstructor_arrayNoClone_normal() {
        String[] keys = new String[] { "P", "Q" };
        MultiKey<String> mk = new MultiKey<>(keys, false);
        assertEquals(2, mk.size());
        assertEquals("P", mk.getKey(0));

        // since not cloned, modifying original array affects internal keys
        keys[0] = "MODIFIED";
        assertEquals("MODIFIED", mk.getKey(0));
    }

    @Test
    public void testConstructor_arrayWithClone_true() {
        String[] keys = new String[] { "P", "Q" };
        MultiKey<String> mk = new MultiKey<>(keys, true);
        keys[0] = "MODIFIED";
        assertEquals("P", mk.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_arrayMakeCloneNull_throwsException() {
        new MultiKey<Object>((Object[]) null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_arrayNoCloneNull_throwsException() {
        new MultiKey<Object>((Object[]) null, false);
    }

    @Test
    public void testConstructor_emptyArray_normal() {
        String[] keys = new String[0];
        MultiKey<String> mk = new MultiKey<>(keys, false);
        assertEquals(0, mk.size());
        assertEquals(0, mk.hashCode());
    }

    // ---------- getKeys() ----------
    @Test
    public void testGetKeys_returnsClone_notSameReference() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        String[] keys1 = mk.getKeys();
        String[] keys2 = mk.getKeys();
        assertNotSame(keys1, keys2);
        assertArrayEquals(keys1, keys2);
    }

    @Test
    public void testGetKeys_modifyingClone_doesNotAffectInternal() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        String[] keys = mk.getKeys();
        keys[0] = "MODIFIED";
        assertEquals("A", mk.getKey(0));
    }

    // ---------- getKey(index) ----------
    @Test
    public void testGetKey_validIndex_returnsCorrectKey() {
        MultiKey<String> mk = new MultiKey<>("A", "B", "C");
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        assertEquals("C", mk.getKey(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKey_indexOutOfBounds_throwsException() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        mk.getKey(5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKey_negativeIndex_throwsException() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        mk.getKey(-1);
    }

    // ---------- size() ----------
    @Test
    public void testSize_variousLengths_returnsCorrectSize() {
        assertEquals(2, new MultiKey<>("A", "B").size());
        assertEquals(3, new MultiKey<>("A", "B", "C").size());
        assertEquals(4, new MultiKey<>("A", "B", "C", "D").size());
        assertEquals(5, new MultiKey<>("A", "B", "C", "D", "E").size());
    }

    // ---------- equals() ----------
    @Test
    public void testEquals_sameInstance_returnsTrue() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        assertTrue(mk.equals(mk));
    }

    @Test
    public void testEquals_equalKeys_returnsTrue() {
        MultiKey<String> mk1 = new MultiKey<>("A", "B");
        MultiKey<String> mk2 = new MultiKey<>("A", "B");
        assertTrue(mk1.equals(mk2));
        assertTrue(mk2.equals(mk1));
    }

    @Test
    public void testEquals_differentKeys_returnsFalse() {
        MultiKey<String> mk1 = new MultiKey<>("A", "B");
        MultiKey<String> mk2 = new MultiKey<>("A", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEquals_differentSize_returnsFalse() {
        MultiKey<String> mk1 = new MultiKey<>("A", "B");
        MultiKey<String> mk2 = new MultiKey<>("A", "B", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEquals_notMultiKeyInstance_returnsFalse() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        assertFalse(mk.equals("Not a MultiKey"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        assertFalse(mk.equals(null));
    }

    @Test
    public void testEquals_withNullKeys_returnsTrue() {
        MultiKey<String> mk1 = new MultiKey<>(null, "B");
        MultiKey<String> mk2 = new MultiKey<>(null, "B");
        assertTrue(mk1.equals(mk2));
    }

    @Test
    public void testEquals_withDifferentNullKeys_returnsFalse() {
        MultiKey<String> mk1 = new MultiKey<>(null, "B");
        MultiKey<String> mk2 = new MultiKey<>("A", "B");
        assertFalse(mk1.equals(mk2));
    }

    // ---------- hashCode() ----------
    @Test
    public void testHashCode_equalObjects_sameHashCode() {
        MultiKey<String> mk1 = new MultiKey<>("A", "B");
        MultiKey<String> mk2 = new MultiKey<>("A", "B");
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCode_cachedValue_consistentAcrossCalls() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        int hash1 = mk.hashCode();
        int hash2 = mk.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testHashCode_withNullKey_computesWithoutError() {
        MultiKey<String> mk = new MultiKey<>(null, "B");
        int expected = "B".hashCode();
        assertEquals(expected, mk.hashCode());
    }

    @Test
    public void testHashCode_allNullKeys_returnsZero() {
        MultiKey<String> mk = new MultiKey<>((String) null, (String) null);
        assertEquals(0, mk.hashCode());
    }

    // ---------- toString() ----------
    @Test
    public void testToString_normalKeys_returnsExpectedFormat() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        String result = mk.toString();
        assertTrue(result.startsWith("MultiKey"));
        assertTrue(result.contains("A"));
        assertTrue(result.contains("B"));
    }

    @Test
    public void testToString_withNullKey_containsNullLiteral() {
        MultiKey<String> mk = new MultiKey<>(null, "B");
        String result = mk.toString();
        assertTrue(result.contains("null"));
    }

    @Test
    public void testToString_emptyArray_returnsEmptyBrackets() {
        String[] keys = new String[0];
        MultiKey<String> mk = new MultiKey<>(keys, false);
        assertEquals("MultiKey[]", mk.toString());
    }
}
