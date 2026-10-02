import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.Trie;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

import static org.junit.Assert.*;

public class UnmodifiableTrieTest {

    private PatriciaTrie<String, String> delegateTrie;
    private UnmodifiableTrie<String, String> unmodifiableTrie;

    @Before
    public void setUp() {
        delegateTrie = new PatriciaTrie<String, String>();
        delegateTrie.put("Anna", "1");
        delegateTrie.put("Anael", "2");
        delegateTrie.put("Analu", "3");
        delegateTrie.put("Andrew", "4");
        delegateTrie.put("Andy", "5");
        delegateTrie.put("Angela", "6");
        delegateTrie.put("Angie", "7");

        unmodifiableTrie = new UnmodifiableTrie<String, String>(delegateTrie);
    }

    // --------------------- Constructor Tests ---------------------

    @Test
    public void testConstructor_validTrie_createsInstance() {
        UnmodifiableTrie<String, String> trie = new UnmodifiableTrie<String, String>(delegateTrie);
        assertNotNull(trie);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullTrie_throwsIllegalArgumentException() {
        new UnmodifiableTrie<String, String>(null);
    }

    // --------------------- Factory Method Tests ---------------------

    @Test
    public void testUnmodifiableTrie_validTrie_returnsUnmodifiableTrie() {
        UnmodifiableTrie<String, String> trie = UnmodifiableTrie.unmodifiableTrie(delegateTrie);
        assertNotNull(trie);
        assertEquals(delegateTrie.size(), trie.size());
    }

    // --------------------- entrySet Tests ---------------------

    @Test
    public void testEntrySet_normalCase_returnsCorrectSize() {
        Set<Map.Entry<String, String>> entries = unmodifiableTrie.entrySet();
        assertEquals(delegateTrie.entrySet().size(), entries.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testEntrySet_attemptModification_throwsUnsupportedOperationException() {
        Set<Map.Entry<String, String>> entries = unmodifiableTrie.entrySet();
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        it.remove();
    }

    // --------------------- keySet Tests ---------------------

    @Test
    public void testKeySet_normalCase_returnsCorrectSize() {
        Set<String> keys = unmodifiableTrie.keySet();
        assertEquals(delegateTrie.keySet().size(), keys.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testKeySet_attemptModification_throwsUnsupportedOperationException() {
        Set<String> keys = unmodifiableTrie.keySet();
        keys.remove("Anna");
    }

    // --------------------- values Tests ---------------------

    @Test
    public void testValues_normalCase_returnsCorrectSize() {
        Collection<String> values = unmodifiableTrie.values();
        assertEquals(delegateTrie.values().size(), values.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testValues_attemptModification_throwsUnsupportedOperationException() {
        Collection<String> values = unmodifiableTrie.values();
        values.remove("1");
    }

    // --------------------- clear Tests ---------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testClear_alwaysThrowsUnsupportedOperationException() {
        unmodifiableTrie.clear();
    }

    // --------------------- containsKey Tests ---------------------

    @Test
    public void testContainsKey_existingKey_returnsTrue() {
        assertTrue(unmodifiableTrie.containsKey("Anna"));
    }

    @Test
    public void testContainsKey_nonExistingKey_returnsFalse() {
        assertFalse(unmodifiableTrie.containsKey("NonExisting"));
    }

    // --------------------- containsValue Tests ---------------------

    @Test
    public void testContainsValue_existingValue_returnsTrue() {
        assertTrue(unmodifiableTrie.containsValue("1"));
    }

    @Test
    public void testContainsValue_nonExistingValue_returnsFalse() {
        assertFalse(unmodifiableTrie.containsValue("NonExisting"));
    }

    // --------------------- get Tests ---------------------

    @Test
    public void testGet_existingKey_returnsCorrectValue() {
        assertEquals("1", unmodifiableTrie.get("Anna"));
    }

    @Test
    public void testGet_nonExistingKey_returnsNull() {
        assertNull(unmodifiableTrie.get("NonExisting"));
    }

    // --------------------- isEmpty Tests ---------------------

    @Test
    public void testIsEmpty_nonEmptyTrie_returnsFalse() {
        assertFalse(unmodifiableTrie.isEmpty());
    }

    @Test
    public void testIsEmpty_emptyTrie_returnsTrue() {
        PatriciaTrie<String, String> emptyDelegate = new PatriciaTrie<String, String>();
        UnmodifiableTrie<String, String> emptyTrie = new UnmodifiableTrie<String, String>(emptyDelegate);
        assertTrue(emptyTrie.isEmpty());
    }

    // --------------------- put Tests ---------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testPut_alwaysThrowsUnsupportedOperationException() {
        unmodifiableTrie.put("NewKey", "NewValue");
    }

    // --------------------- putAll Tests ---------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testPutAll_alwaysThrowsUnsupportedOperationException() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("NewKey", "NewValue");
        unmodifiableTrie.putAll(map);
    }

    // --------------------- remove Tests ---------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_alwaysThrowsUnsupportedOperationException() {
        unmodifiableTrie.remove("Anna");
    }

    // --------------------- size Tests ---------------------

    @Test
    public void testSize_normalCase_returnsCorrectSize() {
        assertEquals(delegateTrie.size(), unmodifiableTrie.size());
    }

    @Test
    public void testSize_emptyTrie_returnsZero() {
        PatriciaTrie<String, String> emptyDelegate = new PatriciaTrie<String, String>();
        UnmodifiableTrie<String, String> emptyTrie = new UnmodifiableTrie<String, String>(emptyDelegate);
        assertEquals(0, emptyTrie.size());
    }

    // --------------------- firstKey Tests ---------------------

    @Test
    public void testFirstKey_normalCase_returnsCorrectKey() {
        assertEquals(delegateTrie.firstKey(), unmodifiableTrie.firstKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testFirstKey_emptyTrie_throwsNoSuchElementException() {
        PatriciaTrie<String, String> emptyDelegate = new PatriciaTrie<String, String>();
        UnmodifiableTrie<String, String> emptyTrie = new UnmodifiableTrie<String, String>(emptyDelegate);
        emptyTrie.firstKey();
    }

    // --------------------- headMap Tests ---------------------

    @Test
    public void testHeadMap_normalCase_returnsCorrectSubMap() {
        SortedMap<String, String> headMap = unmodifiableTrie.headMap("Andrew");
        assertEquals(delegateTrie.headMap("Andrew").size(), headMap.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testHeadMap_attemptModification_throwsUnsupportedOperationException() {
        SortedMap<String, String> headMap = unmodifiableTrie.headMap("Andrew");
        headMap.put("NewKey", "NewValue");
    }

    // --------------------- lastKey Tests ---------------------

    @Test
    public void testLastKey_normalCase_returnsCorrectKey() {
        assertEquals(delegateTrie.lastKey(), unmodifiableTrie.lastKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testLastKey_emptyTrie_throwsNoSuchElementException() {
        PatriciaTrie<String, String> emptyDelegate = new PatriciaTrie<String, String>();
        UnmodifiableTrie<String, String> emptyTrie = new UnmodifiableTrie<String, String>(emptyDelegate);
        emptyTrie.lastKey();
    }

    // --------------------- subMap Tests ---------------------

    @Test
    public void testSubMap_normalCase_returnsCorrectSubMap() {
        SortedMap<String, String> subMap = unmodifiableTrie.subMap("Anael", "Andrew");
        assertEquals(delegateTrie.subMap("Anael", "Andrew").size(), subMap.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSubMap_attemptModification_throwsUnsupportedOperationException() {
        SortedMap<String, String> subMap = unmodifiableTrie.subMap("Anael", "Andrew");
        subMap.put("NewKey", "NewValue");
    }

    // --------------------- tailMap Tests ---------------------

    @Test
    public void testTailMap_normalCase_returnsCorrectSubMap() {
        SortedMap<String, String> tailMap = unmodifiableTrie.tailMap("Andrew");
        assertEquals(delegateTrie.tailMap("Andrew").size(), tailMap.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testTailMap_attemptModification_throwsUnsupportedOperationException() {
        SortedMap<String, String> tailMap = unmodifiableTrie.tailMap("Andrew");
        tailMap.put("NewKey", "NewValue");
    }

    // --------------------- prefixMap Tests ---------------------

    @Test
    public void testPrefixMap_normalCase_returnsCorrectPrefixMap() {
        SortedMap<String, String> prefixMap = unmodifiableTrie.prefixMap("An");
        assertEquals(delegateTrie.prefixMap("An").size(), prefixMap.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrefixMap_attemptModification_throwsUnsupportedOperationException() {
        SortedMap<String, String> prefixMap = unmodifiableTrie.prefixMap("An");
        prefixMap.put("NewKey", "NewValue");
    }

    // --------------------- comparator Tests ---------------------

    @Test
    public void testComparator_normalCase_returnsSameComparator() {
        Comparator<? super String> comparator = unmodifiableTrie.comparator();
        assertEquals(delegateTrie.comparator(), comparator);
    }

    // --------------------- mapIterator Tests ---------------------

    @Test
    public void testMapIterator_normalCase_returnsWorkingIterator() {
        OrderedMapIterator<String, String> it = unmodifiableTrie.mapIterator();
        assertNotNull(it);
        assertTrue(it.hasNext());
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(delegateTrie.size(), count);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testMapIterator_attemptSetValue_throwsUnsupportedOperationException() {
        OrderedMapIterator<String, String> it = unmodifiableTrie.mapIterator();
        it.next();
        it.setValue("NewValue");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testMapIterator_attemptRemove_throwsUnsupportedOperationException() {
        OrderedMapIterator<String, String> it = unmodifiableTrie.mapIterator();
        it.next();
        it.remove();
    }

    // --------------------- nextKey Tests ---------------------

    @Test
    public void testNextKey_normalCase_returnsCorrectKey() {
        assertEquals(delegateTrie.nextKey("Anna"), unmodifiableTrie.nextKey("Anna"));
    }

    @Test
    public void testNextKey_lastKey_returnsNull() {
        String last = delegateTrie.lastKey();
        assertNull(unmodifiableTrie.nextKey(last));
    }

    // --------------------- previousKey Tests ---------------------

    @Test
    public void testPreviousKey_normalCase_returnsCorrectKey() {
        assertEquals(delegateTrie.previousKey("Anna"), unmodifiableTrie.previousKey("Anna"));
    }

    @Test
    public void testPreviousKey_firstKey_returnsNull() {
        String first = delegateTrie.firstKey();
        assertNull(unmodifiableTrie.previousKey(first));
    }

    // --------------------- hashCode Tests ---------------------

    @Test
    public void testHashCode_normalCase_matchesDelegateHashCode() {
        assertEquals(delegateTrie.hashCode(), unmodifiableTrie.hashCode());
    }

    // --------------------- equals Tests ---------------------

    @Test
    public void testEquals_sameDelegate_returnsTrue() {
        assertTrue(unmodifiableTrie.equals(delegateTrie));
    }

    @Test
    public void testEquals_differentObject_returnsFalse() {
        assertFalse(unmodifiableTrie.equals("NotATrie"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(unmodifiableTrie.equals(null));
    }

    // --------------------- toString Tests ---------------------

    @Test
    public void testToString_normalCase_matchesDelegateToString() {
        assertEquals(delegateTrie.toString(), unmodifiableTrie.toString());
    }
}
