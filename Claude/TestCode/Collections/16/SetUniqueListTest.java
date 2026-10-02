import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Arrays;

import org.apache.commons.collections.list.SetUniqueList;

public class SetUniqueListTest {

    private SetUniqueList setUniqueList;

    @Before
    public void setUp() {
        setUniqueList = SetUniqueList.decorate(new ArrayList());
    }

    // ---------- decorate ----------

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

    // ---------- asSet ----------

    @Test
    public void testAsSet_returnsUnmodifiableSetView() {
        setUniqueList.add("a");
        Set set = setUniqueList.asSet();
        assertTrue(set.contains("a"));
        try {
            set.add("b");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- add(Object) ----------

    @Test
    public void testAdd_newObject_returnsTrueAndAdds() {
        boolean result = setUniqueList.add("a");
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testAdd_duplicateObject_returnsFalse() {
        setUniqueList.add("a");
        boolean result = setUniqueList.add("a");
        assertFalse(result);
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testAdd_nullObject_addsSuccessfully() {
        boolean result = setUniqueList.add(null);
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
    }

    // ---------- add(int, Object) ----------

    @Test
    public void testAddIndex_newObject_insertsAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add("c");
        setUniqueList.add(1, "b");
        assertEquals(3, setUniqueList.size());
        assertEquals("b", setUniqueList.get(1));
    }

    @Test
    public void testAddIndex_duplicateObject_doesNotInsert() {
        setUniqueList.add("a");
        setUniqueList.add(0, "a");
        assertEquals(1, setUniqueList.size());
    }

    // ---------- addAll(Collection) ----------

    @Test
    public void testAddAllCollection_withDuplicatesAndNewElements_addsOnlyUnique() {
        setUniqueList.add("a");
        List coll = Arrays.asList("a", "b", "c");
        boolean result = setUniqueList.addAll(coll);
        assertTrue(result);
        assertEquals(3, setUniqueList.size());
    }

    @Test
    public void testAddAllCollection_allDuplicates_returnsFalse() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        List coll = Arrays.asList("a", "b");
        boolean result = setUniqueList.addAll(coll);
        assertFalse(result);
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testAddAllCollection_emptyCollection_returnsFalse() {
        List coll = new ArrayList();
        boolean result = setUniqueList.addAll(coll);
        assertFalse(result);
    }

    // ---------- addAll(int, Collection) ----------

    @Test
    public void testAddAllIndex_newElementsAtIndex_insertsInOrder() {
        setUniqueList.add("a");
        setUniqueList.add("d");
        List coll = Arrays.asList("b", "c");
        boolean result = setUniqueList.addAll(1, coll);
        assertTrue(result);
        assertEquals(4, setUniqueList.size());
        assertEquals("a", setUniqueList.get(0));
        assertEquals("b", setUniqueList.get(1));
        assertEquals("c", setUniqueList.get(2));
        assertEquals("d", setUniqueList.get(3));
    }

    @Test
    public void testAddAllIndex_withDuplicateInCollection_skipsDuplicate() {
        setUniqueList.add("a");
        List coll = Arrays.asList("a", "b");
        boolean result = setUniqueList.addAll(0, coll);
        assertTrue(result);
        assertEquals(2, setUniqueList.size());
    }

    // ---------- set(int, Object) ----------

    @Test
    public void testSet_newObject_replacesAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object removed = setUniqueList.set(0, "c");
        assertEquals("a", removed);
        assertEquals("c", setUniqueList.get(0));
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testSet_objectAlreadyExistsElsewhere_removesDuplicate() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        // set index 0 to "c" which already exists at index 2
        Object removed = setUniqueList.set(0, "c");
        assertEquals("a", removed);
        assertEquals(2, setUniqueList.size());
        assertEquals("c", setUniqueList.get(0));
        assertEquals("b", setUniqueList.get(1));
    }

    @Test
    public void testSet_objectSetToItself_noRemovalOfDuplicate() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Object removed = setUniqueList.set(0, "a");
        assertEquals("a", removed);
        assertEquals(2, setUniqueList.size());
    }

    // ---------- remove(Object) ----------

    @Test
    public void testRemoveObject_existingObject_removesAndReturnsTrue() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        boolean result = setUniqueList.remove("a");
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testRemoveObject_nonExistingObject_returnsFalse() {
        setUniqueList.add("a");
        boolean result = setUniqueList.remove("z");
        assertFalse(result);
        assertEquals(1, setUniqueList.size());
    }

    // ---------- remove(int) ----------

    @Test
    public void testRemoveIndex_validIndex_removesAndReturnsElement() {
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
    public void testRemoveAll_existingElements_removesThemAndUpdatesSet() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        List coll = Arrays.asList("a", "b");
        boolean result = setUniqueList.removeAll(coll);
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
        assertFalse(setUniqueList.contains("b"));
    }

    @Test
    public void testRemoveAll_noMatchingElements_returnsFalse() {
        setUniqueList.add("a");
        List coll = Arrays.asList("z");
        boolean result = setUniqueList.removeAll(coll);
        assertFalse(result);
    }

    // ---------- retainAll(Collection) ----------

    @Test
    public void testRetainAll_someElementsRetained_removesOthers() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        List coll = Arrays.asList("a", "c");
        boolean result = setUniqueList.retainAll(coll);
        assertTrue(result);
        assertEquals(2, setUniqueList.size());
        assertTrue(setUniqueList.contains("a"));
        assertTrue(setUniqueList.contains("c"));
        assertFalse(setUniqueList.contains("b"));
    }

    @Test
    public void testRetainAll_allElementsRetained_returnsFalse() {
        setUniqueList.add("a");
        List coll = Arrays.asList("a");
        boolean result = setUniqueList.retainAll(coll);
        assertFalse(result);
        assertEquals(1, setUniqueList.size());
    }

    // ---------- clear() ----------

    @Test
    public void testClear_nonEmptyList_clearsListAndSet() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.clear();
        assertEquals(0, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    // ---------- contains(Object) ----------

    @Test
    public void testContains_existingObject_returnsTrue() {
        setUniqueList.add("a");
        assertTrue(setUniqueList.contains("a"));
    }

    @Test
    public void testContains_nonExistingObject_returnsFalse() {
        assertFalse(setUniqueList.contains("z"));
    }

    // ---------- containsAll(Collection) ----------

    @Test
    public void testContainsAll_allElementsPresent_returnsTrue() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        List coll = Arrays.asList("a", "b");
        assertTrue(setUniqueList.containsAll(coll));
    }

    @Test
    public void testContainsAll_someElementsMissing_returnsFalse() {
        setUniqueList.add("a");
        List coll = Arrays.asList("a", "z");
        assertFalse(setUniqueList.containsAll(coll));
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_iterateOverElements_returnsAllInOrder() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Iterator it = setUniqueList.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_remove_removesFromListAndSet() {
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
    public void testListIterator_noArg_iteratesForward() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator it = setUniqueList.listIterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
    }

    @Test
    public void testListIterator_previous_iteratesBackward() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.next();
        assertTrue(it.hasPrevious());
        assertEquals("b", it.previous());
        assertEquals("a", it.previous());
    }

    @Test
    public void testListIterator_remove_removesFromListAndSet() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.remove();
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testListIterator_addNewObject_addsSuccessfully() {
        setUniqueList.add("a");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.add("b");
        assertEquals(2, setUniqueList.size());
        assertTrue(setUniqueList.contains("b"));
    }

    @Test
    public void testListIterator_addDuplicateObject_doesNotAdd() {
        setUniqueList.add("a");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.add("a");
        assertEquals(1, setUniqueList.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIterator_set_throwsUnsupportedOperationException() {
        setUniqueList.add("a");
        ListIterator it = setUniqueList.listIterator();
        it.next();
        it.set("b");
    }

    // ---------- listIterator(int) ----------

    @Test
    public void testListIteratorWithIndex_startAtIndex_iteratesFromThatPoint() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        ListIterator it = setUniqueList.listIterator(1);
        assertEquals("b", it.next());
        assertEquals("c", it.next());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIteratorWithIndex_invalidIndex_throwsException() {
        setUniqueList.listIterator(5);
    }

    // ---------- subList ----------

    @Test
    public void testSubList_validRange_returnsSetUniqueList() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        List subList = setUniqueList.subList(0, 2);
        assertTrue(subList instanceof SetUniqueList);
        assertEquals(2, subList.size());
        assertEquals("a", subList.get(0));
        assertEquals("b", subList.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubList_invalidRange_throwsException() {
        setUniqueList.add("a");
        setUniqueList.subList(0, 5);
    }
}
