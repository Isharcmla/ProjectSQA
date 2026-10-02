import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.OrderedIterator;
import java.util.Set;

import org.apache.commons.collections.OrderedIterator;
import org.apache.commons.collections.set.ListOrderedSet;

public class ListOrderedSetTest {

    private ListOrderedSet<String> set;

    @Before
    public void setUp() {
        set = new ListOrderedSet<String>();
    }

    // ---------- Factory method: listOrderedSet(Set, List) ----------

    @Test
    public void testListOrderedSetFactory_setAndList_normal_returnsEmptySet() {
        Set<String> s = new HashSet<String>();
        List<String> l = new ArrayList<String>();
        ListOrderedSet<String> result = ListOrderedSet.listOrderedSet(s, l);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSetFactory_setNull_throwsException() {
        List<String> l = new ArrayList<String>();
        ListOrderedSet.listOrderedSet((Set<String>) null, l);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSetFactory_listNull_throwsException() {
        Set<String> s = new HashSet<String>();
        ListOrderedSet.listOrderedSet(s, (List<String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSetFactory_setNotEmpty_throwsException() {
        Set<String> s = new HashSet<String>();
        s.add("a");
        List<String> l = new ArrayList<String>();
        ListOrderedSet.listOrderedSet(s, l);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSetFactory_listNotEmpty_throwsException() {
        Set<String> s = new HashSet<String>();
        List<String> l = new ArrayList<String>();
        l.add("a");
        ListOrderedSet.listOrderedSet(s, l);
    }

    // ---------- Factory method: listOrderedSet(Set) ----------

    @Test
    public void testListOrderedSetFactory_setOnly_normal_returnsSetWithElements() {
        Set<String> s = new HashSet<String>();
        s.add("a");
        s.add("b");
        ListOrderedSet<String> result = ListOrderedSet.listOrderedSet(s);
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    // ---------- Factory method: listOrderedSet(List) ----------

    @Test
    public void testListOrderedSetFactory_listOnly_normal_returnsOrderedSet() {
        List<String> l = new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add("a"); // duplicate
        ListOrderedSet<String> result = ListOrderedSet.listOrderedSet(l);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("a", result.get(0));
        assertEquals("b", result.get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSetFactory_listOnlyNull_throwsException() {
        ListOrderedSet.listOrderedSet((List<String>) null);
    }

    // ---------- asList() ----------

    @Test
    public void testAsList_normal_returnsUnmodifiableListWithSameOrder() {
        set.add("x");
        set.add("y");
        List<String> list = set.asList();
        assertEquals(2, list.size());
        assertEquals("x", list.get(0));
        assertEquals("y", list.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsList_modifyReturnedList_throwsException() {
        set.add("x");
        List<String> list = set.asList();
        list.add("z");
    }

    // ---------- clear() ----------

    @Test
    public void testClear_normal_emptiesSet() {
        set.add("a");
        set.add("b");
        set.clear();
        assertTrue(set.isEmpty());
        assertEquals(0, set.asList().size());
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_normal_iteratesInOrder() {
        set.add("a");
        set.add("b");
        set.add("c");
        OrderedIterator<String> it = set.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_hasPreviousAndPrevious_normal_returnsCorrectValues() {
        set.add("a");
        set.add("b");
        OrderedIterator<String> it = set.iterator();
        it.next();
        it.next();
        assertTrue(it.hasPrevious());
        assertEquals("b", it.previous());
        assertEquals("a", it.previous());
        assertFalse(it.hasPrevious());
    }

    @Test
    public void testIterator_remove_removesFromSetAndOrder() {
        set.add("a");
        set.add("b");
        set.add("c");
        OrderedIterator<String> it = set.iterator();
        it.next();
        it.remove();
        assertEquals(2, set.size());
        assertFalse(set.contains("a"));
        assertEquals("b", set.get(0));
    }

    // ---------- add(E) ----------

    @Test
    public void testAdd_newElement_returnsTrueAndAddsElement() {
        boolean result = set.add("a");
        assertTrue(result);
        assertEquals(1, set.size());
        assertEquals("a", set.get(0));
    }

    @Test
    public void testAdd_duplicateElement_returnsFalseAndDoesNotAdd() {
        set.add("a");
        boolean result = set.add("a");
        assertFalse(result);
        assertEquals(1, set.size());
    }

    // ---------- addAll(Collection) ----------

    @Test
    public void testAddAll_newElements_returnsTrueAndAddsAll() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        boolean result = set.addAll(coll);
        assertTrue(result);
        assertEquals(2, set.size());
    }

    @Test
    public void testAddAll_emptyCollection_returnsFalse() {
        Collection<String> coll = new ArrayList<String>();
        boolean result = set.addAll(coll);
        assertFalse(result);
        assertEquals(0, set.size());
    }

    @Test
    public void testAddAll_someDuplicates_returnsTrue() {
        set.add("a");
        Collection<String> coll = new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        boolean result = set.addAll(coll);
        assertTrue(result);
        assertEquals(2, set.size());
    }

    // ---------- remove(Object) ----------

    @Test
    public void testRemove_existingElement_returnsTrueAndRemoves() {
        set.add("a");
        set.add("b");
        boolean result = set.remove("a");
        assertTrue(result);
        assertEquals(1, set.size());
        assertFalse(set.contains("a"));
    }

    @Test
    public void testRemove_nonExistingElement_returnsFalse() {
        set.add("a");
        boolean result = set.remove("z");
        assertFalse(result);
        assertEquals(1, set.size());
    }

    // ---------- removeAll(Collection) ----------

    @Test
    public void testRemoveAll_existingElements_returnsTrueAndRemovesAll() {
        set.add("a");
        set.add("b");
        set.add("c");
        Collection<String> coll = new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        boolean result = set.removeAll(coll);
        assertTrue(result);
        assertEquals(1, set.size());
        assertTrue(set.contains("c"));
    }

    @Test
    public void testRemoveAll_noMatchingElements_returnsFalse() {
        set.add("a");
        Collection<String> coll = new ArrayList<String>();
        coll.add("z");
        boolean result = set.removeAll(coll);
        assertFalse(result);
        assertEquals(1, set.size());
    }

    // ---------- retainAll(Collection) ----------

    @Test
    public void testRetainAll_partialRetain_returnsTrueAndKeepsIntersection() {
        set.add("a");
        set.add("b");
        set.add("c");
        Collection<String> coll = new ArrayList<String>();
        coll.add("a");
        coll.add("c");
        boolean result = set.retainAll(coll);
        assertTrue(result);
        assertEquals(2, set.size());
        assertTrue(set.contains("a"));
        assertTrue(set.contains("c"));
        assertFalse(set.contains("b"));
    }

    @Test
    public void testRetainAll_retainAllElements_returnsFalse() {
        set.add("a");
        set.add("b");
        Collection<String> coll = new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        boolean result = set.retainAll(coll);
        assertFalse(result);
        assertEquals(2, set.size());
    }

    @Test
    public void testRetainAll_retainNone_clearsSetOrder() {
        set.add("a");
        set.add("b");
        Collection<String> coll = new ArrayList<String>();
        coll.add("z");
        boolean result = set.retainAll(coll);
        assertTrue(result);
        assertEquals(0, set.size());
        assertEquals(0, set.asList().size());
    }

    // ---------- toArray() ----------

    @Test
    public void testToArray_normal_returnsArrayInOrder() {
        set.add("a");
        set.add("b");
        Object[] arr = set.toArray();
        assertEquals(2, arr.length);
        assertEquals("a", arr[0]);
        assertEquals("b", arr[1]);
    }

    @Test
    public void testToArray_emptySet_returnsEmptyArray() {
        Object[] arr = set.toArray();
        assertEquals(0, arr.length);
    }

    // ---------- toArray(T[]) ----------

    @Test
    public void testToArrayTyped_normal_returnsTypedArrayInOrder() {
        set.add("a");
        set.add("b");
        String[] arr = set.toArray(new String[0]);
        assertEquals(2, arr.length);
        assertEquals("a", arr[0]);
        assertEquals("b", arr[1]);
    }

    // ---------- get(int) ----------

    @Test
    public void testGet_validIndex_returnsCorrectElement() {
        set.add("a");
        set.add("b");
        assertEquals("a", set.get(0));
        assertEquals("b", set.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_invalidIndex_throwsException() {
        set.add("a");
        set.get(5);
    }

    // ---------- indexOf(Object) ----------

    @Test
    public void testIndexOf_existingElement_returnsCorrectIndex() {
        set.add("a");
        set.add("b");
        assertEquals(1, set.indexOf("b"));
    }

    @Test
    public void testIndexOf_nonExistingElement_returnsNegativeOne() {
        set.add("a");
        assertEquals(-1, set.indexOf("z"));
    }

    // ---------- add(int, E) ----------

    @Test
    public void testAddIndexed_newElement_insertsAtIndex() {
        set.add("a");
        set.add("c");
        set.add(1, "b");
        assertEquals(3, set.size());
        assertEquals("a", set.get(0));
        assertEquals("b", set.get(1));
        assertEquals("c", set.get(2));
    }

    @Test
    public void testAddIndexed_duplicateElement_doesNotInsert() {
        set.add("a");
        set.add("b");
        set.add(0, "b");
        assertEquals(2, set.size());
        assertEquals("a", set.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndexed_invalidIndex_throwsException() {
        set.add(5, "x");
    }

    // ---------- addAll(int, Collection) ----------

    @Test
    public void testAddAllIndexed_newElements_insertsAllAtIndex() {
        set.add("a");
        set.add("d");
        Collection<String> coll = new ArrayList<String>();
        coll.add("b");
        coll.add("c");
        boolean result = set.addAll(1, coll);
        assertTrue(result);
        assertEquals(4, set.size());
        assertEquals("a", set.get(0));
        assertEquals("b", set.get(1));
        assertEquals("c", set.get(2));
        assertEquals("d", set.get(3));
    }

    @Test
    public void testAddAllIndexed_allDuplicates_returnsFalse() {
        set.add("a");
        set.add("b");
        Collection<String> coll = new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        boolean result = set.addAll(0, coll);
        assertFalse(result);
        assertEquals(2, set.size());
    }

    @Test
    public void testAddAllIndexed_emptyCollection_returnsFalse() {
        set.add("a");
        Collection<String> coll = new ArrayList<String>();
        boolean result = set.addAll(0, coll);
        assertFalse(result);
        assertEquals(1, set.size());
    }

    // ---------- remove(int) ----------

    @Test
    public void testRemoveIndexed_validIndex_removesAndReturnsElement() {
        set.add("a");
        set.add("b");
        set.add("c");
        Object removed = set.remove(1);
        assertEquals("b", removed);
        assertEquals(2, set.size());
        assertFalse(set.contains("b"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndexed_invalidIndex_throwsException() {
        set.add("a");
        set.remove(10);
    }

    // ---------- toString() ----------

    @Test
    public void testToString_normal_returnsOrderedRepresentation() {
        set.add("a");
        set.add("b");
        String str = set.toString();
        assertEquals("[a, b]", str);
    }

    @Test
    public void testToString_emptySet_returnsEmptyBrackets() {
        String str = set.toString();
        assertEquals("[]", str);
    }

    // ---------- contains / size / isEmpty via inherited decorator ----------

    @Test
    public void testContains_afterAdd_returnsTrue() {
        set.add("a");
        assertTrue(set.contains("a"));
    }

    @Test
    public void testIsEmpty_newSet_returnsTrue() {
        assertTrue(set.isEmpty());
    }

    @Test
    public void testSize_afterMultipleAdds_returnsCorrectSize() {
        set.add("a");
        set.add("b");
        set.add("c");
        assertEquals(3, set.size());
    }
}
