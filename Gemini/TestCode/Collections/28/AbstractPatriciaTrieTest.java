package org.apache.commons.collections4.trie;

import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

public class AbstractPatriciaTrieTest {

    private static class StringTestKeyAnalyzer extends KeyAnalyzer<String> {
        private static final long serialVersionUID = 1L;
        public static final StringTestKeyAnalyzer INSTANCE = new StringTestKeyAnalyzer();

        @Override
        public int bitsPerElement() {
            return 16;
        }

        @Override
        public int lengthInBits(final String key) {
            return key != null ? key.length() * 16 : 0;
        }

        @Override
        public boolean isBitSet(final String key, final int bitIndex, final int lengthInBits) {
            if (key == null || bitIndex >= lengthInBits || bitIndex < 0) {
                return false;
            }
            final int index = bitIndex / 16;
            final int bit = bitIndex % 16;
            return (key.charAt(index) & (0x8000 >>> bit)) != 0;
        }

        @Override
        public int bitIndex(final String key, final int offsetInBits, final int lengthInBits,
                            final String other, final int otherOffsetInBits, final int otherLengthInBits) {
            final boolean isKeyEmpty = key == null || lengthInBits == 0;
            final boolean isOtherEmpty = other == null || otherLengthInBits == 0;
            if (isKeyEmpty && isOtherEmpty) {
                return KeyAnalyzer.NULL_BIT_KEY;
            }
            if (isKeyEmpty || isOtherEmpty) {
                return 0;
            }

            final int minLength = Math.min(lengthInBits, otherLengthInBits);
            for (int i = 0; i < minLength; i++) {
                if (isBitSet(key, offsetInBits + i, offsetInBits + lengthInBits) !=
                    isBitSet(other, otherOffsetInBits + i, otherOffsetInBits + otherLengthInBits)) {
                    return i;
                }
            }
            if (lengthInBits != otherLengthInBits) {
                return minLength;
            }
            return KeyAnalyzer.EQUAL_BIT_KEY;
        }

        @Override
        public int compare(final String a, final String b) {
            if (a == null) {
                return b == null ? 0 : -1;
            }
            if (b == null) {
                return 1;
            }
            return a.compareTo(b);
        }

        @Override
        public boolean isPrefix(final String prefix, final int offsetInBits, final int lengthInBits, final String key) {
            if (prefix == null || key == null) {
                return false;
            }
            if (lengthInBits > lengthInBits(key)) {
                return false;
            }
            for (int i = 0; i < lengthInBits; i++) {
                if (isBitSet(prefix, offsetInBits + i, offsetInBits + lengthInBits) !=
                    isBitSet(key, i, lengthInBits(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    private static class ConcretePatriciaTrie<V> extends AbstractPatriciaTrie<String, V> {
        private static final long serialVersionUID = 1L;

        public ConcretePatriciaTrie() {
            super(StringTestKeyAnalyzer.INSTANCE);
        }

        public ConcretePatriciaTrie(final Map<? extends String, ? extends V> map) {
            super(StringTestKeyAnalyzer.INSTANCE, map);
        }
    }

    private ConcretePatriciaTrie<Integer> trie;

    @Before
    public void setUp() {
        trie = new ConcretePatriciaTrie<Integer>();
    }

    @Test
    public void testConstructor_withMap_populatesEntries() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        final ConcretePatriciaTrie<Integer> mapTrie = new ConcretePatriciaTrie<Integer>(map);
        Assert.assertEquals(2, mapTrie.size());
        Assert.assertEquals(Integer.valueOf(1), mapTrie.get("one"));
        Assert.assertEquals(Integer.valueOf(2), mapTrie.get("two"));
    }

    @Test(expected = NullPointerException.class)
    public void testPut_nullKey_throwsNullPointerException() {
        trie.put(null, 100);
    }

    @Test
    public void testPutAndGet_emptyStringKey_success() {
        Assert.assertNull(trie.put("", 0));
        Assert.assertEquals(1, trie.size());
        Assert.assertEquals(Integer.valueOf(0), trie.get(""));

        // Overwrite root
        Assert.assertEquals(Integer.valueOf(0), trie.put("", 1));
        Assert.assertEquals(1, trie.size());
        Assert.assertEquals(Integer.valueOf(1), trie.get(""));
    }

    @Test
    public void testPutAndGet_multipleKeys_success() {
        Assert.assertNull(trie.put("alpha", 1));
        Assert.assertNull(trie.put("beta", 2));
        Assert.assertNull(trie.put("alphabet", 3));
        Assert.assertEquals(3, trie.size());

        Assert.assertEquals(Integer.valueOf(1), trie.get("alpha"));
        Assert.assertEquals(Integer.valueOf(2), trie.get("beta"));
        Assert.assertEquals(Integer.valueOf(3), trie.get("alphabet"));
        Assert.assertNull(trie.get("gamma"));
        Assert.assertNull(trie.get(null));

        // Overwrite existing key
        Assert.assertEquals(Integer.valueOf(1), trie.put("alpha", 10));
        Assert.assertEquals(Integer.valueOf(10), trie.get("alpha"));
    }

    @Test
    public void testClear_removesAllEntries() {
        trie.put("a", 1);
        trie.put("b", 2);
        trie.put("", 0);
        Assert.assertEquals(3, trie.size());

        trie.clear();
        Assert.assertEquals(0, trie.size());
        Assert.assertNull(trie.get("a"));
        Assert.assertNull(trie.get(""));
    }

    @Test
    public void testContainsKey_variousKeys() {
        Assert.assertFalse(trie.containsKey(null));
        Assert.assertFalse(trie.containsKey("unknown"));

        trie.put("hello", 1);
        trie.put("", 0);
        Assert.assertTrue(trie.containsKey("hello"));
        Assert.assertTrue(trie.containsKey(""));
        Assert.assertFalse(trie.containsKey("world"));
    }

    @Test
    public void testRemove_variousNodes() {
        Assert.assertNull(trie.remove(null));
        Assert.assertNull(trie.remove("nonexistent"));

        trie.put("", 0);
        trie.put("a", 1);
        trie.put("b", 2);
        trie.put("c", 3);
        trie.put("ab", 4);
        trie.put("abc", 5);

        Assert.assertEquals(Integer.valueOf(0), trie.remove(""));
        Assert.assertFalse(trie.containsKey(""));
        Assert.assertEquals(5, trie.size());

        Assert.assertEquals(Integer.valueOf(4), trie.remove("ab"));
        Assert.assertNull(trie.get("ab"));

        Assert.assertEquals(Integer.valueOf(1), trie.remove("a"));
        Assert.assertEquals(Integer.valueOf(5), trie.remove("abc"));
        Assert.assertEquals(Integer.valueOf(2), trie.remove("b"));
        Assert.assertEquals(Integer.valueOf(3), trie.remove("c"));
        Assert.assertEquals(0, trie.size());
    }

    @Test
    public void testSelect_andSelectKey_andSelectValue() {
        Assert.assertNull(trie.select("anything"));
        Assert.assertNull(trie.selectKey("anything"));
        Assert.assertNull(trie.selectValue("anything"));

        trie.put("cat", 10);
        trie.put("dog", 20);

        final Map.Entry<String, Integer> selected = trie.select("car");
        Assert.assertNotNull(selected);
        Assert.assertEquals("cat", trie.selectKey("car"));
        Assert.assertEquals(Integer.valueOf(10), trie.selectValue("car"));

        trie.put("", 0);
        Assert.assertEquals("", trie.selectKey(""));
    }

    @Test
    public void testFirstKey_andLastKey() {
        try {
            trie.firstKey();
            Assert.fail("Expected NoSuchElementException");
        } catch (final NoSuchElementException ignored) {
        }

        try {
            trie.lastKey();
            Assert.fail("Expected NoSuchElementException");
        } catch (final NoSuchElementException ignored) {
        }

        trie.put("b", 2);
        trie.put("a", 1);
        trie.put("c", 3);
        trie.put("", 0);

        Assert.assertEquals("", trie.firstKey());
        Assert.assertEquals("c", trie.lastKey());
    }

    @Test
    public void testNextKey_andPreviousKey() {
        try {
            trie.nextKey(null);
            Assert.fail("Expected NullPointerException");
        } catch (final NullPointerException ignored) {
        }

        try {
            trie.previousKey(null);
            Assert.fail("Expected NullPointerException");
        } catch (final NullPointerException ignored) {
        }

        Assert.assertNull(trie.nextKey("missing"));
        Assert.assertNull(trie.previousKey("missing"));

        trie.put("a", 1);
        trie.put("b", 2);
        trie.put("c", 3);

        Assert.assertEquals("b", trie.nextKey("a"));
        Assert.assertEquals("c", trie.nextKey("b"));
        Assert.assertNull(trie.nextKey("c"));

        Assert.assertNull(trie.previousKey("a"));
        Assert.assertEquals("a", trie.previousKey("b"));
        Assert.assertEquals("b", trie.previousKey("c"));
    }

    @Test
    public void testHigherCeilingLowerFloorEntry() {
        trie.put("b", 2);
        trie.put("d", 4);

        // Ceiling
        Assert.assertEquals("b", trie.ceilingEntry("a").getKey());
        Assert.assertEquals("b", trie.ceilingEntry("b").getKey());
        Assert.assertEquals("d", trie.ceilingEntry("c").getKey());
        Assert.assertNull(trie.ceilingEntry("e"));

        // Higher
        Assert.assertEquals("b", trie.higherEntry("a").getKey());
        Assert.assertEquals("d", trie.higherEntry("b").getKey());
        Assert.assertNull(trie.higherEntry("d"));

        // Floor
        Assert.assertNull(trie.floorEntry("a"));
        Assert.assertEquals("b", trie.floorEntry("b").getKey());
        Assert.assertEquals("b", trie.floorEntry("c").getKey());
        Assert.assertEquals("d", trie.floorEntry("e").getKey());

        // Lower
        Assert.assertNull(trie.lowerEntry("a"));
        Assert.assertNull(trie.lowerEntry("b"));
        Assert.assertEquals("b", trie.lowerEntry("c").getKey());
        Assert.assertEquals("d", trie.lowerEntry("e").getKey());

        // Zero-length key edge cases
        Assert.assertNull(trie.lowerEntry(""));
        Assert.assertNull(trie.floorEntry(""));
        Assert.assertEquals("b", trie.ceilingEntry("").getKey());
        Assert.assertEquals("b", trie.higherEntry("").getKey());

        trie.put("", 0);
        Assert.assertEquals("", trie.floorEntry("").getKey());
        Assert.assertEquals("", trie.ceilingEntry("").getKey());
        Assert.assertEquals("b", trie.higherEntry("").getKey());
    }

    @Test
    public void testEntrySet_viewsAndOperations() {
        trie.put("a", 1);
        trie.put("b", 2);

        final Set<Map.Entry<String, Integer>> entrySet = trie.entrySet();
        Assert.assertEquals(2, entrySet.size());

        final Map.Entry<String, Integer> dummyEntry = new AbstractPatriciaTrie.TrieEntry<String, Integer>("a", 1, 0);
        Assert.assertTrue(entrySet.contains(dummyEntry));
        Assert.assertFalse(entrySet.contains("NotAnEntry"));

        Assert.assertTrue(entrySet.remove(dummyEntry));
        Assert.assertEquals(1, trie.size());
        Assert.assertFalse(entrySet.remove(dummyEntry));

        entrySet.clear();
        Assert.assertEquals(0, trie.size());
    }

    @Test
    public void testKeySet_viewsAndOperations() {
        trie.put("k1", 10);
        trie.put("k2", 20);

        final Set<String> keySet = trie.keySet();
        Assert.assertEquals(2, keySet.size());
        Assert.assertTrue(keySet.contains("k1"));
        Assert.assertFalse(keySet.contains("k3"));

        final Iterator<String> it = keySet.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertNotNull(it.next());

        Assert.assertTrue(keySet.remove("k1"));
        Assert.assertFalse(keySet.remove("k1"));
        Assert.assertEquals(1, keySet.size());

        keySet.clear();
        Assert.assertEquals(0, keySet.size());
    }

    @Test
    public void testValues_viewsAndOperations() {
        trie.put("k1", 10);
        trie.put("k2", 20);

        Assert.assertEquals(2, trie.values().size());
        Assert.assertTrue(trie.values().contains(10));
        Assert.assertFalse(trie.values().contains(30));

        Assert.assertTrue(trie.values().remove(10));
        Assert.assertFalse(trie.values().remove(10));
        Assert.assertEquals(1, trie.size());

        trie.values().clear();
        Assert.assertEquals(0, trie.size());
    }

    @Test
    public void testTrieIterator_fastFailAndExceptions() {
        trie.put("a", 1);
        trie.put("b", 2);

        final Iterator<String> it = trie.keySet().iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("a", it.next());
        it.remove();

        try {
            it.remove();
            Assert.fail("Expected IllegalStateException on consecutive remove");
        } catch (final IllegalStateException ignored) {
        }

        trie.put("c", 3);
        try {
            it.next();
            Assert.fail("Expected ConcurrentModificationException");
        } catch (final ConcurrentModificationException ignored) {
        }
    }

    @Test
    public void testMapIterator_forwardBackwardAndModifications() {
        trie.put("a", 1);
        trie.put("b", 2);

        final OrderedMapIterator<String, Integer> mapIt = trie.mapIterator();

        try {
            mapIt.getKey();
            Assert.fail("Expected IllegalStateException before next");
        } catch (final IllegalStateException ignored) {
        }

        try {
            mapIt.previous();
            Assert.fail("Expected NoSuchElementException before move");
        } catch (final NoSuchElementException ignored) {
        }

        Assert.assertTrue(mapIt.hasNext());
        Assert.assertEquals("a", mapIt.next());
        Assert.assertEquals("a", mapIt.getKey());
        Assert.assertEquals(Integer.valueOf(1), mapIt.getValue());

        mapIt.setValue(100);
        Assert.assertEquals(Integer.valueOf(100), trie.get("a"));

        Assert.assertTrue(mapIt.hasNext());
        Assert.assertEquals("b", mapIt.next());

        Assert.assertTrue(mapIt.hasPrevious());
        Assert.assertEquals("b", mapIt.previous());
    }

    @Test
    public void testSubMap_headMap_tailMap_rangeOperations() {
        trie.put("b", 2);
        trie.put("c", 3);
        trie.put("d", 4);
        trie.put("e", 5);

        final SortedMap<String, Integer> sub = trie.subMap("c", "e");
        Assert.assertEquals(2, sub.size());
        Assert.assertEquals("c", sub.firstKey());
        Assert.assertEquals("d", sub.lastKey());
        Assert.assertTrue(sub.containsKey("c"));
        Assert.assertFalse(sub.containsKey("b"));
        Assert.assertFalse(sub.containsKey("e"));

        Assert.assertEquals(Integer.valueOf(3), sub.get("c"));
        Assert.assertNull(sub.get("b"));

        Assert.assertEquals(Integer.valueOf(3), sub.remove("c"));
        Assert.assertNull(sub.remove("b"));

        sub.put("c", 33);
        Assert.assertEquals(Integer.valueOf(33), trie.get("c"));

        try {
            sub.put("a", 1);
            Assert.fail("Expected IllegalArgumentException for out of range put");
        } catch (final IllegalArgumentException ignored) {
        }

        final SortedMap<String, Integer> head = trie.headMap("d");
        Assert.assertFalse(head.containsKey("d"));
        Assert.assertTrue(head.containsKey("b"));

        final SortedMap<String, Integer> tail = trie.tailMap("d");
        Assert.assertTrue(tail.containsKey("d"));
        Assert.assertTrue(tail.containsKey("e"));
        Assert.assertFalse(tail.containsKey("b"));

        // Range errors
        try {
            trie.subMap("e", "b");
            Assert.fail("Expected IllegalArgumentException for fromKey > toKey");
        } catch (final IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testPrefixMap_operations() {
        trie.put("app", 1);
        trie.put("apple", 2);
        trie.put("application", 3);
        trie.put("banana", 4);

        final SortedMap<String, Integer> prefixMap = trie.prefixMap("app");
        Assert.assertEquals(3, prefixMap.size());
        Assert.assertEquals("app", prefixMap.firstKey());
        Assert.assertEquals("application", prefixMap.lastKey());

        Assert.assertTrue(prefixMap.containsKey("app"));
        Assert.assertTrue(prefixMap.containsKey("apple"));
        Assert.assertFalse(prefixMap.containsKey("banana"));

        // Prefix map of root / empty string
        final SortedMap<String, Integer> fullPrefix = trie.prefixMap("");
        Assert.assertSame(trie, fullPrefix);

        // Non-existent prefix
        final SortedMap<String, Integer> emptyPrefix = trie.prefixMap("orange");
        Assert.assertEquals(0, emptyPrefix.size());
        try {
            emptyPrefix.firstKey();
            Assert.fail("Expected NoSuchElementException");
        } catch (final NoSuchElementException ignored) {
        }

        // Iterator remove on prefix map
        final Iterator<Map.Entry<String, Integer>> it = prefixMap.entrySet().iterator();
        while (it.hasNext()) {
            final Map.Entry<String, Integer> entry = it.next();
            if ("apple".equals(entry.getKey())) {
                it.remove();
            }
        }
        Assert.assertFalse(trie.containsKey("apple"));
        Assert.assertEquals(2, prefixMap.size());
    }

    @Test
    public void testTrieEntry_toString_andHelpers() {
        final AbstractPatriciaTrie.TrieEntry<String, Integer> entry =
                new AbstractPatriciaTrie.TrieEntry<String, Integer>("key", 100, 5);
        Assert.assertFalse(entry.isEmpty());
        Assert.assertTrue(entry.isExternalNode());
        Assert.assertFalse(entry.isInternalNode());

        final String str = entry.toString();
        Assert.assertTrue(str.contains("Entry("));
        Assert.assertTrue(str.contains("key=key"));

        final AbstractPatriciaTrie.TrieEntry<String, Integer> rootEntry =
                new AbstractPatriciaTrie.TrieEntry<String, Integer>(null, null, -1);
        Assert.assertTrue(rootEntry.isEmpty());
        Assert.assertTrue(rootEntry.toString().contains("RootEntry("));
    }

    @Test
    public void testSerialization_roundTrip() throws Exception {
        trie.put("ser1", 10);
        trie.put("ser2", 20);
        trie.put("", 0);

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(trie);
        oos.close();

        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream ois = new ObjectInputStream(bais);
        @SuppressWarnings("unchecked")
        final AbstractPatriciaTrie<String, Integer> deserialized =
                (AbstractPatriciaTrie<String, Integer>) ois.readObject();
        ois.close();

        Assert.assertEquals(trie.size(), deserialized.size());
        Assert.assertEquals(Integer.valueOf(10), deserialized.get("ser1"));
        Assert.assertEquals(Integer.valueOf(20), deserialized.get("ser2"));
        Assert.assertEquals(Integer.valueOf(0), deserialized.get(""));
    }

    @Test
    public void testComparator_returnsKeyAnalyzer() {
        Assert.assertSame(StringTestKeyAnalyzer.INSTANCE, trie.comparator());
    }
}
