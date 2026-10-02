import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;

import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link AbstractPatriciaTrie}, exercised through the public
 * concrete subclass {@link PatriciaTrie}.
 */
public class AbstractPatriciaTrieTest {

    private PatriciaTrie<String, String> trie;

    @Before
    public void setUp() {
        trie = new PatriciaTrie<String, String>();
    }

    // ------------------------------------------------------------------
    // put / get
    // ------------------------------------------------------------------

    @Test
    public void testPutAndGet_normalKey_returnsValue() {
        trie.put("apple", "fruit");
        assertEquals("fruit", trie.get("apple"));
        assertEquals(1, trie.size());
    }

    @Test(expected = NullPointerException.class)
    public void testPut_nullKey_throwsNullPointerException() {
        trie.put(null, "value");
    }

    @Test
    public void testPut_emptyKey_storedAtRoot() {
        trie.put("", "rootValue");
        assertEquals("rootValue", trie.get(""));
        assertEquals(1, trie.size());
    }

    @Test
    public void testPut_replaceExistingKey_returnsOldValue() {
        trie.put("a", "first");
        final String old = trie.put("a", "second");
        assertEquals("first", old);
        assertEquals("second", trie.get("a"));
        assertEquals(1, trie.size());
    }

    @Test
    public void testPut_multipleKeys_sizeIncreases() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        assertEquals(3, trie.size());
    }

    @Test
    public void testGet_nonExistingKey_returnsNull() {
        trie.put("a", "1");
        assertNull(trie.get("b"));
    }

    @Test
    public void testGet_nullKey_returnsNull() {
        assertNull(trie.get(null));
    }

    // ------------------------------------------------------------------
    // containsKey / containsValue
    // ------------------------------------------------------------------

    @Test
    public void testContainsKey_existingKey_returnsTrue() {
        trie.put("a", "1");
        assertTrue(trie.containsKey("a"));
    }

    @Test
    public void testContainsKey_nonExistingKey_returnsFalse() {
        trie.put("a", "1");
        assertFalse(trie.containsKey("b"));
    }

    @Test
    public void testContainsKey_nullKey_returnsFalse() {
        assertFalse(trie.containsKey(null));
    }

    @Test
    public void testContainsValue_existingValue_returnsTrue() {
        trie.put("a", "1");
        assertTrue(trie.containsValue("1"));
    }

    // ------------------------------------------------------------------
    // remove
    // ------------------------------------------------------------------

    @Test
    public void testRemove_existingKey_returnsValueAndRemoves() {
        trie.put("a", "1");
        final String removed = trie.remove("a");
        assertEquals("1", removed);
        assertFalse(trie.containsKey("a"));
        assertEquals(0, trie.size());
    }

    @Test
    public void testRemove_nonExistingKey_returnsNull() {
        trie.put("a", "1");
        assertNull(trie.remove("b"));
    }

    @Test
    public void testRemove_nullKey_returnsNull() {
        assertNull(trie.remove(null));
    }

    @Test
    public void testRemove_internalAndExternalEntries_worksCorrectly() {
        trie.put("aa", "1");
        trie.put("ab", "2");
        trie.put("ac", "3");
        trie.put("ad", "4");

        assertEquals("2", trie.remove("ab"));
        assertFalse(trie.containsKey("ab"));
        assertTrue(trie.containsKey("aa"));
        assertTrue(trie.containsKey("ac"));
        assertTrue(trie.containsKey("ad"));
        assertEquals(3, trie.size());

        assertEquals("1", trie.remove("aa"));
        assertEquals("3", trie.remove("ac"));
        assertEquals("4", trie.remove("ad"));
        assertEquals(0, trie.size());
    }

    // ------------------------------------------------------------------
    // clear / size / isEmpty
    // ------------------------------------------------------------------

    @Test
    public void testClear_removesAllEntries() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.clear();
        assertEquals(0, trie.size());
        assertTrue(trie.isEmpty());
        assertNull(trie.get("a"));
    }

    @Test
    public void testSize_emptyTrie_returnsZero() {
        assertEquals(0, trie.size());
    }

    // ------------------------------------------------------------------
    // keySet / values / entrySet
    // ------------------------------------------------------------------

    @Test
    public void testKeySet_containsAllKeys() {
        trie.put("a", "1");
        trie.put("b", "2");
        assertEquals(2, trie.keySet().size());
        assertTrue(trie.keySet().contains("a"));
        assertTrue(trie.keySet().contains("b"));
    }

    @Test
    public void testKeySet_removeKey_removesFromTrie() {
        trie.put("a", "1");
        trie.put("b", "2");
        final boolean removed = trie.keySet().remove("a");
        assertTrue(removed);
        assertFalse(trie.containsKey("a"));
        assertEquals(1, trie.size());
    }

    @Test
    public void testKeySet_clear_clearsTrie() {
        trie.put("a", "1");
        trie.keySet().clear();
        assertEquals(0, trie.size());
    }

    @Test
    public void testValues_containsAllValues() {
        trie.put("a", "1");
        trie.put("b", "2");
        assertEquals(2, trie.values().size());
        assertTrue(trie.values().contains("1"));
        assertTrue(trie.values().contains("2"));
    }

    @Test
    public void testValues_removeValue_removesEntry() {
        trie.put("a", "1");
        trie.put("b", "2");
        final boolean removed = trie.values().remove("1");
        assertTrue(removed);
        assertEquals(1, trie.size());
    }

    @Test
    public void testValues_clear_clearsTrie() {
        trie.put("a", "1");
        trie.values().clear();
        assertEquals(0, trie.size());
    }

    @Test
    public void testEntrySet_containsAllEntries() {
        trie.put("a", "1");
        trie.put("b", "2");
        assertEquals(2, trie.entrySet().size());
    }

    @Test
    public void testEntrySet_contains_existingEntry_returnsTrue() {
        trie.put("a", "1");
        for (final Map.Entry<String, String> entry : trie.entrySet()) {
            assertTrue(trie.entrySet().contains(entry));
        }
    }

    @Test
    public void testEntrySet_removeEntry_removesFromTrie() {
        trie.put("a", "1");
        trie.put("b", "2");
        Map.Entry<String, String> toRemove = null;
        for (final Map.Entry<String, String> entry : trie.entrySet()) {
            if (entry.getKey().equals("a")) {
                toRemove = entry;
            }
        }
        assertNotNull(toRemove);
        final boolean removed = trie.entrySet().remove(toRemove);
        assertTrue(removed);
        assertFalse(trie.containsKey("a"));
    }

    @Test
    public void testEntrySet_clear_clearsTrie() {
        trie.put("a", "1");
        trie.entrySet().clear();
        assertEquals(0, trie.size());
    }

    // ------------------------------------------------------------------
    // Iterator behavior
    // ------------------------------------------------------------------

    @Test
    public void testEntrySetIterator_iteratesAllEntries() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");

        int count = 0;
        final Iterator<Map.Entry<String, String>> it = trie.entrySet().iterator();
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testIterator_removeWithoutNext_throwsIllegalStateException() {
        trie.put("a", "1");
        final Iterator<String> it = trie.keySet().iterator();
        try {
            it.remove();
            fail("Expected IllegalStateException");
        } catch (final IllegalStateException expected) {
            // expected
        }
    }

    @Test
    public void testIterator_nextAfterExhausted_throwsNoSuchElementException() {
        trie.put("a", "1");
        final Iterator<String> it = trie.keySet().iterator();
        it.next();
        assertFalse(it.hasNext());
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (final NoSuchElementException expected) {
            // expected
        }
    }

    @Test
    public void testIterator_concurrentModification_throwsConcurrentModificationException() {
        trie.put("a", "1");
        trie.put("b", "2");
        final Iterator<String> it = trie.keySet().iterator();
        trie.put("c", "3");
        try {
            it.next();
            fail("Expected ConcurrentModificationException");
        } catch (final ConcurrentModificationException expected) {
            // expected
        }
    }

    @Test
    public void testIterator_removeEntry_updatesSizeAndAllowsContinuedIteration() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");

        final Iterator<String> it = trie.keySet().iterator();
        it.next();
        it.remove();
        assertEquals(2, trie.size());
        // continue iterating without exception
        while (it.hasNext()) {
            it.next();
        }
    }

    // ------------------------------------------------------------------
    // firstKey / lastKey
    // ------------------------------------------------------------------

    @Test
    public void testFirstKey_populatedTrie_returnsSmallestKey() {
        trie.put("b", "2");
        trie.put("a", "1");
        trie.put("c", "3");
        assertEquals("a", trie.firstKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testFirstKey_emptyTrie_throwsNoSuchElementException() {
        trie.firstKey();
    }

    @Test
    public void testLastKey_populatedTrie_returnsLargestKey() {
        trie.put("b", "2");
        trie.put("a", "1");
        trie.put("c", "3");
        assertEquals("c", trie.lastKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testLastKey_emptyTrie_throwsNoSuchElementException() {
        trie.lastKey();
    }

    // ------------------------------------------------------------------
    // nextKey / previousKey
    // ------------------------------------------------------------------

    @Test
    public void testNextKey_existingKey_returnsNextKey() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        assertEquals("b", trie.nextKey("a"));
        assertEquals("c", trie.nextKey("b"));
        assertNull(trie.nextKey("c"));
    }

    @Test
    public void testNextKey_nonExistingKey_returnsNull() {
        trie.put("a", "1");
        assertNull(trie.nextKey("z"));
    }

    @Test(expected = NullPointerException.class)
    public void testNextKey_nullKey_throwsNullPointerException() {
        trie.nextKey(null);
    }

    @Test
    public void testPreviousKey_existingKey_returnsPreviousKey() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        assertEquals("b", trie.previousKey("c"));
        assertEquals("a", trie.previousKey("b"));
        assertNull(trie.previousKey("a"));
    }

    @Test(expected = NullPointerException.class)
    public void testPreviousKey_nullKey_throwsNullPointerException() {
        trie.previousKey(null);
    }

    // ------------------------------------------------------------------
    // select / selectKey / selectValue
    // ------------------------------------------------------------------

    @Test
    public void testSelect_populatedTrie_returnsClosestEntry() {
        trie.put("a", "1");
        trie.put("b", "2");
        final Map.Entry<String, String> entry = trie.select("a");
        assertNotNull(entry);
    }

    @Test
    public void testSelectKey_populatedTrie_returnsClosestKey() {
        trie.put("a", "1");
        final String key = trie.selectKey("a");
        assertEquals("a", key);
    }

    @Test
    public void testSelectValue_populatedTrie_returnsClosestValue() {
        trie.put("a", "1");
        final String value = trie.selectValue("a");
        assertEquals("1", value);
    }

    @Test
    public void testSelectKey_emptyTrie_returnsNull() {
        assertNull(trie.selectKey("a"));
    }

    @Test
    public void testSelectValue_emptyTrie_returnsNull() {
        assertNull(trie.selectValue("a"));
    }

    // ------------------------------------------------------------------
    // comparator
    // ------------------------------------------------------------------

    @Test
    public void testComparator_returnsNonNullComparator() {
        assertNotNull(trie.comparator());
    }

    // ------------------------------------------------------------------
    // mapIterator (OrderedMapIterator)
    // ------------------------------------------------------------------

    @Test
    public void testMapIterator_forwardIteration_returnsKeysInOrder() {
        trie.put("b", "2");
        trie.put("a", "1");
        trie.put("c", "3");

        final OrderedMapIterator<String, String> it = trie.mapIterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("a", it.getKey());
        assertEquals("1", it.getValue());
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testMapIterator_backwardIteration_returnsKeysInReverseOrder() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");

        final OrderedMapIterator<String, String> it = trie.mapIterator();
        it.next();
        it.next();
        it.next();
        assertTrue(it.hasPrevious());
        assertEquals("c", it.previous());
        assertEquals("b", it.previous());
        assertEquals("a", it.previous());
        assertFalse(it.hasPrevious());
    }

    @Test
    public void testMapIterator_setValue_updatesEntry() {
        trie.put("a", "1");
        final OrderedMapIterator<String, String> it = trie.mapIterator();
        it.next();
        it.setValue("newValue");
        assertEquals("newValue", trie.get("a"));
    }

    @Test
    public void testMapIterator_getKeyBeforeNext_throwsIllegalStateException() {
        trie.put("a", "1");
        final OrderedMapIterator<String, String> it = trie.mapIterator();
        try {
            it.getKey();
            fail("Expected IllegalStateException");
        } catch (final IllegalStateException expected) {
            // expected
        }
    }

    // ------------------------------------------------------------------
    // headMap / tailMap / subMap
    // ------------------------------------------------------------------

    @Test
    public void testHeadMap_returnsKeysBeforeToKey() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        trie.put("d", "4");

        final SortedMap<String, String> head = trie.headMap("c");
        assertEquals(2, head.size());
        assertTrue(head.containsKey("a"));
        assertTrue(head.containsKey("b"));
        assertFalse(head.containsKey("c"));
    }

    @Test
    public void testTailMap_returnsKeysFromFromKey() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        trie.put("d", "4");

        final SortedMap<String, String> tail = trie.tailMap("c");
        assertEquals(2, tail.size());
        assertTrue(tail.containsKey("c"));
        assertTrue(tail.containsKey("d"));
        assertFalse(tail.containsKey("b"));
    }

    @Test
    public void testSubMap_returnsKeysInRange() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        trie.put("d", "4");

        final SortedMap<String, String> sub = trie.subMap("b", "d");
        assertEquals(2, sub.size());
        assertTrue(sub.containsKey("b"));
        assertTrue(sub.containsKey("c"));
        assertFalse(sub.containsKey("d"));
        assertFalse(sub.containsKey("a"));
    }

    @Test
    public void testHeadMap_putOutOfRange_throwsIllegalArgumentException() {
        trie.put("a", "1");
        trie.put("c", "3");
        final SortedMap<String, String> head = trie.headMap("c");
        try {
            head.put("z", "value");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testTailMap_putOutOfRange_throwsIllegalArgumentException() {
        trie.put("a", "1");
        trie.put("c", "3");
        final SortedMap<String, String> tail = trie.tailMap("c");
        try {
            tail.put("a", "value");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testHeadMap_putInRange_succeeds() {
        trie.put("a", "1");
        trie.put("d", "4");
        final SortedMap<String, String> head = trie.headMap("d");
        head.put("b", "2");
        assertTrue(trie.containsKey("b"));
    }

    @Test
    public void testSubMap_firstAndLastKey() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        trie.put("d", "4");

        final SortedMap<String, String> sub = trie.subMap("b", "d");
        assertEquals("b", sub.firstKey());
        assertEquals("c", sub.lastKey());
    }

    // ------------------------------------------------------------------
    // prefixMap
    // ------------------------------------------------------------------

    @Test
    public void testPrefixMap_returnsKeysWithPrefix() {
        trie.put("apple", "1");
        trie.put("application", "2");
        trie.put("banana", "3");

        final SortedMap<String, String> prefixed = trie.prefixMap("app");
        assertTrue(prefixed.containsKey("apple"));
        assertTrue(prefixed.containsKey("application"));
        assertFalse(prefixed.containsKey("banana"));
    }

    @Test
    public void testPrefixMap_emptyPrefix_returnsWholeTrie() {
        trie.put("a", "1");
        trie.put("b", "2");
        final SortedMap<String, String> prefixed = trie.prefixMap("");
        assertEquals(2, prefixed.size());
    }

    @Test
    public void testPrefixMap_noMatchingKeys_isEmpty() {
        trie.put("apple", "1");
        final SortedMap<String, String> prefixed = trie.prefixMap("xyz");
        assertTrue(prefixed.isEmpty());
    }

    // ------------------------------------------------------------------
    // Constructors
    // ------------------------------------------------------------------

    @Test
    public void testConstructor_withInitialMap_copiesEntries() {
        final Map<String, String> initial = new java.util.HashMap<String, String>();
        initial.put("x", "1");
        initial.put("y", "2");
        final PatriciaTrie<String, String> newTrie = new PatriciaTrie<String, String>(initial);
        assertEquals(2, newTrie.size());
        assertEquals("1", newTrie.get("x"));
        assertEquals("2", newTrie.get("y"));
    }

    // ------------------------------------------------------------------
    // Additional edge cases
    // ------------------------------------------------------------------

    @Test
    public void testPut_sharedPrefixKeys_allRetrievable() {
        trie.put("aa", "1");
        trie.put("aaa", "2");
        trie.put("aaaa", "3");
        assertEquals("1", trie.get("aa"));
        assertEquals("2", trie.get("aaa"));
        assertEquals("3", trie.get("aaaa"));
        assertEquals(3, trie.size());
    }

    @Test
    public void testRemove_rootEntry_removesSuccessfully() {
        trie.put("", "rootVal");
        assertEquals("rootVal", trie.remove(""));
        assertNull(trie.get(""));
        assertEquals(0, trie.size());
    }

    @Test
    public void testIsEmpty_afterClear_returnsTrue() {
        trie.put("a", "1");
        trie.clear();
        assertTrue(trie.isEmpty());
    }

    @Test
    public void testIsEmpty_populatedTrie_returnsFalse() {
        trie.put("a", "1");
        assertFalse(trie.isEmpty());
    }
}
