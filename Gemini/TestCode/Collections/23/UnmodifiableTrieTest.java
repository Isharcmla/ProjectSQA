package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.Unmodifiable;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link UnmodifiableTrie}.
 */
public class UnmodifiableTrieTest {

    private Trie<String, Integer> delegate;
    private UnmodifiableTrie<String, Integer> unmodifiableTrie;

    @Before
    public void setUp() {
        delegate = new PatriciaTrie<Integer>();
        delegate.put("apple", 1);
        delegate.put("banana", 2);
        delegate.put("cherry", 3);
        unmodifiableTrie = new UnmodifiableTrie<String, Integer>(delegate);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTrie_throwsIllegalArgumentException() {
        new UnmodifiableTrie<String, Integer>(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryMethod_nullTrie_throwsIllegalArgumentException() {
        UnmodifiableTrie.unmodifiableTrie(null);
    }

    @Test
    public void testFactoryMethod_validTrie_returnsUnmodifiableTrie() {
        final Trie<String, Integer> trie = UnmodifiableTrie.unmodifiableTrie(delegate);
        assertNotNull(trie);
        assertTrue(trie instanceof UnmodifiableTrie);
        assertTrue(trie instanceof Unmodifiable);
        assertEquals(3, trie.size());
    }

    @Test
    public void testEntrySet_returnsUnmodifiableSet() {
        final Set<Map.Entry<String, Integer>> entries = unmodifiableTrie.entrySet();
        assertEquals(3, entries.size());
        try {
            entries.clear();
            fail("entrySet() should be unmodifiable");
        } catch (final UnsupportedOperationException ignored) {
            // expected
        }
    }

    @Test
    public void testKeySet_returnsUnmodifiableSet() {
        final Set<String> keys = unmodifiableTrie.keySet();
        assertEquals(3, keys.size());
        assertTrue(keys.contains("apple"));
        try {
            keys.remove("apple");
            fail("keySet() should be unmodifiable");
        } catch (final UnsupportedOperationException ignored) {
            // expected
        }
    }

    @Test
    public void testValues_returnsUnmodifiableCollection() {
        final Collection<Integer> values = unmodifiableTrie.values();
        assertEquals(3, values.size());
        assertTrue(values.contains(1));
        try {
            values.clear();
            fail("values() should be unmodifiable");
        } catch (final UnsupportedOperationException ignored) {
            // expected
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClear_alwaysThrowsUnsupportedOperationException() {
        unmodifiableTrie.clear();
    }

    @Test
    public void testContainsKey_existingAndNonExistingKey() {
        assertTrue(unmodifiableTrie.containsKey("apple"));
        assertTrue(unmodifiableTrie.containsKey("banana"));
        assertFalse(unmodifiableTrie.containsKey("orange"));
        assertFalse(unmodifiableTrie.containsKey(null));
        assertFalse(unmodifiableTrie.containsKey(123));
    }

    @Test
    public void testContainsValue_existingAndNonExistingValue() {
        assertTrue(unmodifiableTrie.containsValue(1));
        assertTrue(unmodifiableTrie.containsValue(2));
        assertFalse(unmodifiableTrie.containsValue(99));
        assertFalse(unmodifiableTrie.containsValue(null));
        assertFalse(unmodifiableTrie.containsValue("not_an_int"));
    }

    @Test
    public void testGet_existingAndNonExistingKey() {
        assertEquals(Integer.valueOf(1), unmodifiableTrie.get("apple"));
        assertEquals(Integer.valueOf(2), unmodifiableTrie.get("banana"));
        assertEquals(Integer.valueOf(3), unmodifiableTrie.get("cherry"));
        assertNull(unmodifiableTrie.get("unknown"));
        assertNull(unmodifiableTrie.get(null));
    }

    @Test
    public void testIsEmpty_nonEmptyAndEmptyTries() {
        assertFalse(unmodifiableTrie.isEmpty());

        final Trie<String, Integer> emptyDelegate = new PatriciaTrie<Integer>();
        final Trie<String, Integer> emptyTrie = UnmodifiableTrie.unmodifiableTrie(emptyDelegate);
        assertTrue(emptyTrie.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPut_alwaysThrowsUnsupportedOperationException() {
        unmodifiableTrie.put("date", 4);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPutAll_alwaysThrowsUnsupportedOperationException() {
        final Map<String, Integer> newMap = new HashMap<String, Integer>();
        newMap.put("date", 4);
        unmodifiableTrie.putAll(newMap);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_alwaysThrowsUnsupportedOperationException() {
        unmodifiableTrie.remove("apple");
    }

    @Test
    public void testSize_returnsCorrectSize() {
        assertEquals(3, unmodifiableTrie.size());

        final Trie<String, Integer> emptyTrie = UnmodifiableTrie.unmodifiableTrie(new PatriciaTrie<Integer>());
        assertEquals(0, emptyTrie.size());
    }

    @Test
    public void testFirstKey_returnsFirstKey() {
        assertEquals("apple", unmodifiableTrie.firstKey());
    }

    @Test
    public void testLastKey_returnsLastKey() {
        assertEquals("cherry", unmodifiableTrie.lastKey());
    }

    @Test
    public void testNextKey_validKeys() {
        assertEquals("banana", unmodifiableTrie.nextKey("apple"));
        assertEquals("cherry", unmodifiableTrie.nextKey("banana"));
        assertNull(unmodifiableTrie.nextKey("cherry"));
    }

    @Test
    public void testPreviousKey_validKeys() {
        assertEquals("banana", unmodifiableTrie.previousKey("cherry"));
        assertEquals("apple", unmodifiableTrie.previousKey("banana"));
        assertNull(unmodifiableTrie.previousKey("apple"));
    }

    @Test
    public void testHeadMap_returnsUnmodifiableSortedMap() {
        final SortedMap<String, Integer> head = unmodifiableTrie.headMap("cherry");
        assertEquals(2, head.size());
        assertTrue(head.containsKey("apple"));
        assertTrue(head.containsKey("banana"));
        assertFalse(head.containsKey("cherry"));

        try {
            head.clear();
            fail("headMap() should be unmodifiable");
        } catch (final UnsupportedOperationException ignored) {
            // expected
        }
    }

    @Test
    public void testSubMap_returnsUnmodifiableSortedMap() {
        final SortedMap<String, Integer> sub = unmodifiableTrie.subMap("apple", "cherry");
        assertEquals(2, sub.size());
        assertTrue(sub.containsKey("apple"));
        assertTrue(sub.containsKey("banana"));
        assertFalse(sub.containsKey("cherry"));

        try {
            sub.clear();
            fail("subMap() should be unmodifiable");
        } catch (final UnsupportedOperationException ignored) {
            // expected
        }
    }

    @Test
    public void testTailMap_returnsUnmodifiableSortedMap() {
        final SortedMap<String, Integer> tail = unmodifiableTrie.tailMap("banana");
        assertEquals(2, tail.size());
        assertFalse(tail.containsKey("apple"));
        assertTrue(tail.containsKey("banana"));
        assertTrue(tail.containsKey("cherry"));

        try {
            tail.clear();
            fail("tailMap() should be unmodifiable");
        } catch (final UnsupportedOperationException ignored) {
            // expected
        }
    }

    @Test
    public void testPrefixMap_returnsUnmodifiableSortedMap() {
        delegate.put("app", 10);
        delegate.put("application", 11);

        final SortedMap<String, Integer> prefixMap = unmodifiableTrie.prefixMap("app");
        assertEquals(3, prefixMap.size());
        assertTrue(prefixMap.containsKey("app"));
        assertTrue(prefixMap.containsKey("apple"));
        assertTrue(prefixMap.containsKey("application"));

        try {
            prefixMap.clear();
            fail("prefixMap() should be unmodifiable");
        } catch (final UnsupportedOperationException ignored) {
            // expected
        }
    }

    @Test
    public void testComparator_returnsDelegateComparator() {
        assertEquals(delegate.comparator(), unmodifiableTrie.comparator());
    }

    @Test
    public void testMapIterator_iteratesAndCannotModify() {
        final OrderedMapIterator<String, Integer> it = unmodifiableTrie.mapIterator();
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("apple", it.next());
        assertEquals(Integer.valueOf(1), it.getValue());
        assertEquals("apple", it.getKey());

        try {
            it.remove();
            fail("mapIterator should be unmodifiable");
        } catch (final UnsupportedOperationException ignored) {
            // expected
        }

        try {
            it.setValue(100);
            fail("mapIterator should be unmodifiable");
        } catch (final UnsupportedOperationException ignored) {
            // expected
        }

        assertTrue(it.hasPrevious());
        assertEquals("apple", it.previous());
    }

    @Test
    public void testEqualsAndHashCode_contract() {
        final Trie<String, Integer> anotherDelegate = new PatriciaTrie<Integer>();
        anotherDelegate.put("apple", 1);
        anotherDelegate.put("banana", 2);
        anotherDelegate.put("cherry", 3);

        final UnmodifiableTrie<String, Integer> anotherUnmodifiable =
                new UnmodifiableTrie<String, Integer>(anotherDelegate);

        assertEquals(unmodifiableTrie, unmodifiableTrie);
        assertEquals(unmodifiableTrie, delegate);
        assertEquals(unmodifiableTrie, anotherUnmodifiable);
        assertEquals(unmodifiableTrie.hashCode(), delegate.hashCode());
        assertEquals(unmodifiableTrie.hashCode(), anotherUnmodifiable.hashCode());

        assertFalse(unmodifiableTrie.equals(null));
        assertFalse(unmodifiableTrie.equals("not a trie"));
        assertFalse(unmodifiableTrie.equals(new PatriciaTrie<Integer>()));
    }

    @Test
    public void testToString_returnsDelegateToString() {
        assertEquals(delegate.toString(), unmodifiableTrie.toString());
    }

    @Test
    public void testSerialization_roundTrip() throws Exception {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(unmodifiableTrie);
        oos.close();

        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream ois = new ObjectInputStream(bais);
        @SuppressWarnings("unchecked")
        final UnmodifiableTrie<String, Integer> deserialized =
                (UnmodifiableTrie<String, Integer>) ois.readObject();
        ois.close();

        assertEquals(unmodifiableTrie, deserialized);
        assertEquals(unmodifiableTrie.size(), deserialized.size());
        assertEquals(unmodifiableTrie.get("apple"), deserialized.get("apple"));
    }
}
