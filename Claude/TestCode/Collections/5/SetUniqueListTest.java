import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.collections.list.SetUniqueList;

public class SetUniqueListTest {

    private SetUniqueList setUniqueList;
    private List backingList;

    @Before
    public void setUp() {
        backingList = new ArrayList();
        setUniqueList = SetUniqueList.decorate(backingList);
    }

    // ---------- decorate() ----------

    @Test(expected = IllegalArgumentException.class)
    public void testDecorate_nullList_throwsException() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testDecorate_emptyList_returnsEmptySetUniqueList() {
        List list = new ArrayList();
        SetUniqueList result = SetUniqueList.decorate(list);
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testDecorate_listWithDuplicates_removesDuplicates() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        SetUniqueList result = SetUniqueList.decorate(list);
        assertEquals(3, result.size());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
    }

    @Test
    public void testDecorate_listWithoutDuplicates_keepsAllElements() {
        List list = new ArrayList();
        list.add("x");
        list.add("y");
        SetUniqueList result = SetUniqueList.decorate(list);
        assertEquals(2, result.size());
    }

    // ---------- asSet() ----------

    @Test
    public void testAsSet_returnsUnmodifiableSetView() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Set asSet = setUniqueList.asSet();
        assertEquals(2, asSet.size());
        assertTrue(asSet.contains("a"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsSet_attemptModify_throwsException() {
        setUniqueList.add("a");
        Set asSet = setUniqueList.asSet();
        asSet.add("b");
    }

    // ---------- add(Object) ----------

    @Test
    public void testAdd_newElement_returnsTrue() {
        boolean result = setUniqueList.add("a");
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testAdd_duplicateElement_returnsFalse() {
        setUniqueList.add("a");
        boolean result = setUniqueList.add("a");
        assertFalse(result);
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testAdd_nullElement_addedOnce() {
        boolean firstAdd = setUniqueList.add(null);
        boolean secondAdd = setUniqueList.add(null);
        assertTrue(firstAdd);
        assertFalse(secondAdd);
        assertEquals(1, setUniqueList.size());
    }

    // ---------- add(int, Object) ----------

    @Test
    public void testAddIndex_newElement_insertedAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add(0, "c");
        assertEquals("c", setUniqueList.get(0));
        assertEquals(3, setUniqueList.size());
    }

    @Test
    public void testAddIndex_duplicateElement_notInserted() {
        setUniqueList.add("a");
        setUniqueList.add(0, "a");
        assertEquals(1, setUniqueList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndex_invalidIndex_throwsException() {
        setUniqueList.add(5, "a");
    }

    // ---------- addAll(Collection) ----------

    @Test
    public void testAddAllCollection_uniqueElements_addsAll() {
        Collection coll = Arrays.asList("a", "b", "c");
        boolean result = setUniqueList.addAll(coll);
        assertTrue(result);
        assertEquals(3, setUniqueList.size());
    }

    @Test
    public void testAddAllCollection_withDuplicates_addsOnlyUnique() {
        setUniqueList.add("a");
        Collection coll = Arrays.asList("a", "b", "b");
        boolean result = setUniqueList.addAll(coll);
        assertTrue(result);
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testAddAllCollection_emptyCollection_returnsFalse() {
        Collection coll = new ArrayList();
        boolean result = setUniqueList.addAll(coll);
        assertFalse(result);
        assertEquals(0, setUniqueList.size());
    }

    @Test
    public void testAddAllCollection_allDuplicates_returnsFalse() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection coll = Arrays.asList("a", "b");
        boolean result = setUniqueList.addAll(coll);
        assertFalse(result);
        assertEquals(2, setUniqueList.size());
    }

    // ---------- addAll(int, Collection) ----------

    @Test
    public void testAddAllIndex_uniqueElements_insertsAll() {
        setUniqueList.add("z");
        Collection coll = Arrays.asList("a", "b");
        boolean result = setUniqueList.addAll(0, coll);
        assertTrue(result);
        assertEquals(3, setUniqueList.size());
    }

    @Test
    public void testAddAllIndex_emptyCollection_returnsFalse() {
        boolean result = setUniqueList.addAll(0, new ArrayList());
        assertFalse(result);
    }

    // ---------- set(int, Object) ----------

    @Test
    public void testSet_newObject_setsAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object removed = setUniqueList.set(0, "c");
        assertEquals("a", removed);
        assertEquals("c", setUniqueList.get(0));
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testSet_sameIndexSameObject_noChange() {
        setUniqueList.add("a");
        Object removed = setUniqueList.set(0, "a");
        assertEquals("a", removed);
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testSet_duplicateAtDifferentIndex_removesOldDuplicate() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        // set index 0 to "c" which already exists at index 2
        Object removed = setUniqueList.set(0, "c");
        assertEquals("c", removed);
        assertEquals(2, setUniqueList.size());
        assertEquals("c", setUniqueList.get(0));
        assertFalse(setUniqueList.contains("a"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet_invalidIndex_throwsException() {
        setUniqueList.set(0, "a");
    }

    // ---------- remove(Object) ----------

    @Test
    public void testRemoveObject_existingElement_removesAndReturnsTrue() {
        setUniqueList.add("a");
        boolean result = setUniqueList.remove("a");
        assertTrue(result);
        assertEquals(0, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testRemoveObject_nonExistingElement_returnsFalse() {
        boolean result = setUniqueList.remove("nonexistent");
        assertFalse(result);
    }

    // ---------- remove(int) ----------

    @Test
    public void testRemoveIndex_validIndex_removesElement() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object removed = setUniqueList.remove(0);
        assertEquals("a", removed);
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndex_invalidIndex_throwsException() {
        setUniqueList.remove(0);
    }

    // ---------- removeAll(Collection) ----------

    @Test
    public void testRemoveAll_existingElements_removesAndReturnsTrue() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        Collection coll = Arrays.asList("a", "b");
        boolean result = setUniqueList.removeAll(coll);
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
        assertFalse(setUniqueList.contains("b"));
    }

    @Test
    public void testRemoveAll_noMatchingElements_returnsFalse() {
        setUniqueList.add("a");
        Collection coll = Arrays.asList("x", "y");
        boolean result = setUniqueList.removeAll(coll);
        assertFalse(result);
        assertEquals(1, setUniqueList.size());
    }

    // ---------- retainAll(Collection) ----------

    @Test
    public void testRetainAll_partialMatch_retainsOnlySpecified() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        Collection coll = Arrays.asList("a", "b");
        boolean result = setUniqueList.retainAll(coll);
        assertTrue(result);
        assertEquals(2, setUniqueList.size());
        assertFalse(setUniqueList.contains("c"));
    }

    @Test
    public void testRetainAll_allMatch_returnsFalse() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection coll = Arrays.asList("a", "b");
        boolean result = setUniqueList.retainAll(coll);
        assertFalse(result);
        assertEquals(2, setUniqueList.size());
    }

    // ---------- clear() ----------

    @Test
    public void testClear_nonEmptyList_clearsListAndSet() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.clear();
        assertEquals(0, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
        assertEquals(0, setUniqueList.asSet().size());
    }

    @Test
    public void testClear_emptyList_noError() {
        setUniqueList.clear();
        assertEquals(0, setUniqueList.size());
    }

    // ---------- contains(Object) ----------

    @Test
    public void testContains_existingElement_returnsTrue() {
        setUniqueList.add("a");
        assertTrue(setUniqueList.contains("a"));
    }

    @Test
    public void testContains_nonExistingElement_returnsFalse() {
        assertFalse(setUniqueList.contains("a"));
    }

    // ---------- containsAll(Collection) ----------

    @Test
    public void testContainsAll_allElementsPresent_returnsTrue() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection coll = Arrays.asList("a", "b");
        assertTrue(setUniqueList.containsAll(coll));
    }

    @Test
    public void testContainsAll_someElementsMissing_returnsFalse() {
        setUniqueList.add("a");
        Collection coll = Arrays.asList("a", "b");
        assertFalse(setUniqueList.containsAll(coll));
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_traversal_returnsAllElements() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Iterator it = setUniqueList.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testIterator_remove_removesFromSetAndList() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Iterator it = setUniqueList.iterator();
        it.next();
        it.remove();
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    // ---------- listIterator() ----------

    @Test
    public void testListIterator_traversal_returnsAllElements() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator it = setUniqueList.listIterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testListIterator_previous_returnsElementsInReverse() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.next();
        Object prev = it.previous();
        assertEquals("b", prev);
    }

    @Test
    public void testListIterator_remove_removesFromSetAndList() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.remove();
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testListIterator_addUniqueElement_addsSuccessfully() {
        setUniqueList.add("a");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.add("b");
        assertEquals(2, setUniqueList.size());
        assertTrue(setUniqueList.contains("b"));
    }

    @Test
    public void testListIterator_addDuplicateElement_notAdded() {
        setUniqueList.add("a");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.add("a");
        assertEquals(1, setUniqueList.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIterator_setOperation_throwsException() {
        setUniqueList.add("a");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.set("b");
    }

    // ---------- listIterator(int) ----------

    @Test
    public void testListIteratorIndex_validIndex_startsAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        ListIterator it = setUniqueList.listIterator(1);
        Object next = it.next();
        assertEquals("b", next);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIteratorIndex_invalidIndex_throwsException() {
        setUniqueList.listIterator(5);
    }

    // ---------- subList(int, int) ----------

    @Test
    public void testSubList_validRange_returnsSetUniqueList() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        List sub = setUniqueList.subList(0, 2);
        assertTrue(sub instanceof SetUniqueList);
        assertEquals(2, sub.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubList_invalidRange_throwsException() {
        setUniqueList.add("a");
        setUniqueList.subList(0, 5);
    }

    @Test
    public void testSubList_addUniqueViaSubList_reflectsInOriginalSet() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        List sub = setUniqueList.subList(0, 1);
        sub.add("c");
        assertTrue(setUniqueList.contains("c"));
    }
}
