import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.collections.list.SetUniqueList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetUniqueListTest {

    private SetUniqueList setUniqueList;

    @Before
    public void setUp() {
        setUniqueList = SetUniqueList.decorate(new ArrayList());
    }

    // ---------------- decorate() ----------------

    @Test(expected = IllegalArgumentException.class)
    public void testDecorate_nullList_throwsException() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testDecorate_emptyList_returnsEmptySetUniqueList() {
        SetUniqueList result = SetUniqueList.decorate(new ArrayList());
        assertNotNull(result);
        assertTrue(result.isEmpty());
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

    // ---------------- asSet() ----------------

    @Test
    public void testAsSet_returnsUnmodifiableSetView() {
        setUniqueList.add("a");
        Set set = setUniqueList.asSet();
        assertTrue(set.contains("a"));
        assertEquals(1, set.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsSet_modifyReturnedSet_throwsException() {
        setUniqueList.add("a");
        Set set = setUniqueList.asSet();
        set.add("b");
    }

    // ---------------- add(Object) ----------------

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
    public void testAdd_nullElement_addsSuccessfully() {
        boolean result = setUniqueList.add(null);
        assertTrue(result);
        assertTrue(setUniqueList.contains(null));
    }

    // ---------------- add(int, Object) ----------------

    @Test
    public void testAddIndex_newElement_insertedAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add("c");
        setUniqueList.add(1, "b");
        assertEquals("b", setUniqueList.get(1));
        assertEquals(3, setUniqueList.size());
    }

    @Test
    public void testAddIndex_duplicateElement_notInserted() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add(0, "a");
        assertEquals(2, setUniqueList.size());
        assertEquals("a", setUniqueList.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndex_negativeIndex_throwsException() {
        setUniqueList.add(-1, "a");
    }

    // ---------------- addAll(Collection) ----------------

    @Test
    public void testAddAllCollection_newElements_returnsTrue() {
        Collection coll = Arrays.asList("a", "b", "c");
        boolean result = setUniqueList.addAll(coll);
        assertTrue(result);
        assertEquals(3, setUniqueList.size());
    }

    @Test
    public void testAddAllCollection_withDuplicates_onlyUniqueAdded() {
        setUniqueList.add("a");
        Collection coll = Arrays.asList("a", "b", "b", "c");
        boolean result = setUniqueList.addAll(coll);
        assertTrue(result);
        assertEquals(3, setUniqueList.size());
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

    // ---------------- addAll(int, Collection) ----------------

    @Test
    public void testAddAllIndex_newElements_insertedInOrder() {
        setUniqueList.add("a");
        setUniqueList.add("d");
        Collection coll = Arrays.asList("b", "c");
        boolean result = setUniqueList.addAll(1, coll);
        assertTrue(result);
        assertEquals(4, setUniqueList.size());
        assertEquals("a", setUniqueList.get(0));
        assertEquals("b", setUniqueList.get(1));
        assertEquals("c", setUniqueList.get(2));
        assertEquals("d", setUniqueList.get(3));
    }

    @Test
    public void testAddAllIndex_withDuplicatesInCollection_skipsDuplicates() {
        setUniqueList.add("a");
        Collection coll = Arrays.asList("a", "b");
        boolean result = setUniqueList.addAll(0, coll);
        assertTrue(result);
        assertEquals(2, setUniqueList.size());
    }

    // ---------------- set(int, Object) ----------------

    @Test
    public void testSet_newObjectNotInList_replacesNormally() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object removed = setUniqueList.set(0, "c");
        assertEquals("a", removed);
        assertEquals(2, setUniqueList.size());
        assertEquals("c", setUniqueList.get(0));
    }

    @Test
    public void testSet_sameObjectSameIndex_returnsRemovedObject() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object removed = setUniqueList.set(0, "a");
        assertEquals("a", removed);
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testSet_objectAlreadyExistsAtDifferentIndex_removesOldDuplicate() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        Object removed = setUniqueList.set(0, "c");
        assertEquals("a", removed);
        assertEquals(2, setUniqueList.size());
        assertEquals("c", setUniqueList.get(0));
        assertEquals("b", setUniqueList.get(1));
    }

    // ---------------- remove(Object) ----------------

    @Test
    public void testRemoveObject_existingElement_returnsTrueAndRemoves() {
        setUniqueList.add("a");
        boolean result = setUniqueList.remove("a");
        assertTrue(result);
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testRemoveObject_nonExistingElement_returnsFalse() {
        boolean result = setUniqueList.remove("a");
        assertFalse(result);
    }

    // ---------------- remove(int) ----------------

    @Test
    public void testRemoveIndex_validIndex_removesAndReturnsElement() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object result = setUniqueList.remove(0);
        assertEquals("a", result);
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndex_invalidIndex_throwsException() {
        setUniqueList.remove(0);
    }

    // ---------------- removeAll(Collection) ----------------

    @Test
    public void testRemoveAll_existingElements_removesAndReturnsTrue() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        Collection coll = Arrays.asList("a", "b");
        boolean result = setUniqueList.removeAll(coll);
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
        assertTrue(setUniqueList.contains("c"));
    }

    @Test
    public void testRemoveAll_nonExistingElements_returnsFalse() {
        setUniqueList.add("a");
        Collection coll = Arrays.asList("x", "y");
        boolean result = setUniqueList.removeAll(coll);
        assertFalse(result);
        assertEquals(1, setUniqueList.size());
    }

    // ---------------- retainAll(Collection) ----------------

    @Test
    public void testRetainAll_partialMatch_retainsOnlyMatched() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        Collection coll = Arrays.asList("a", "c");
        boolean result = setUniqueList.retainAll(coll);
        assertTrue(result);
        assertEquals(2, setUniqueList.size());
        assertTrue(setUniqueList.contains("a"));
        assertTrue(setUniqueList.contains("c"));
        assertFalse(setUniqueList.contains("b"));
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

    // ---------------- clear() ----------------

    @Test
    public void testClear_nonEmptyList_removesAllElements() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.clear();
        assertEquals(0, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testClear_emptyList_remainsEmpty() {
        setUniqueList.clear();
        assertEquals(0, setUniqueList.size());
    }

    // ---------------- contains(Object) ----------------

    @Test
    public void testContains_existingElement_returnsTrue() {
        setUniqueList.add("a");
        assertTrue(setUniqueList.contains("a"));
    }

    @Test
    public void testContains_nonExistingElement_returnsFalse() {
        assertFalse(setUniqueList.contains("a"));
    }

    // ---------------- containsAll(Collection) ----------------

    @Test
    public void testContainsAll_allPresent_returnsTrue() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection coll = Arrays.asList("a", "b");
        assertTrue(setUniqueList.containsAll(coll));
    }

    @Test
    public void testContainsAll_notAllPresent_returnsFalse() {
        setUniqueList.add("a");
        Collection coll = Arrays.asList("a", "b");
        assertFalse(setUniqueList.containsAll(coll));
    }

    // ---------------- iterator() ----------------

    @Test
    public void testIterator_iterateElements_returnsInOrder() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Iterator it = setUniqueList.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_removeElement_removesFromListAndSet() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Iterator it = setUniqueList.iterator();
        it.next();
        it.remove();
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    // ---------------- listIterator() ----------------

    @Test
    public void testListIterator_iterateElements_returnsInOrder() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator it = setUniqueList.listIterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
    }

    @Test
    public void testListIterator_previous_returnsPreviousElement() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.next();
        assertTrue(it.hasPrevious());
        assertEquals("b", it.previous());
    }

    @Test
    public void testListIterator_removeElement_removesFromListAndSet() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.remove();
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testListIterator_addNewElement_addsSuccessfully() {
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
        it.add("a");
        assertEquals(1, setUniqueList.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIterator_setElement_throwsException() {
        setUniqueList.add("a");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.set("b");
    }

    // ---------------- listIterator(int) ----------------

    @Test
    public void testListIteratorIndex_startAtSpecificIndex_iteratesFromThere() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        ListIterator it = setUniqueList.listIterator(1);
        assertEquals("b", it.next());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIteratorIndex_invalidIndex_throwsException() {
        setUniqueList.listIterator(5);
    }

    // ---------------- subList() ----------------

    @Test
    public void testSubList_validRange_returnsSetUniqueListSubset() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        List subList = setUniqueList.subList(0, 2);
        assertEquals(2, subList.size());
        assertTrue(subList instanceof SetUniqueList);
        assertEquals("a", subList.get(0));
        assertEquals("b", subList.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubList_invalidRange_throwsException() {
        setUniqueList.add("a");
        setUniqueList.subList(0, 5);
    }
}
