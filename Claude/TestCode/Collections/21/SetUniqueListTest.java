import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.collections4.list.SetUniqueList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetUniqueListTest {

    private SetUniqueList<String> setUniqueList;
    private List<String> baseList;

    @Before
    public void setUp() {
        baseList = new ArrayList<String>();
        setUniqueList = SetUniqueList.setUniqueList(baseList);
    }

    // -------------------- Factory method tests --------------------

    @Test
    public void testSetUniqueList_emptyList_returnsEmptySetUniqueList() {
        List<String> list = new ArrayList<String>();
        SetUniqueList<String> result = SetUniqueList.setUniqueList(list);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testSetUniqueList_listWithDuplicates_removesDuplicates() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        SetUniqueList<String> result = SetUniqueList.setUniqueList(list);
        assertEquals(3, result.size());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetUniqueList_nullList_throwsException() {
        SetUniqueList.setUniqueList(null);
    }

    // -------------------- asSet --------------------

    @Test
    public void testAsSet_returnsUnmodifiableSetView() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Set<String> set = setUniqueList.asSet();
        assertTrue(set.contains("a"));
        assertTrue(set.contains("b"));
        assertEquals(2, set.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsSet_modifyReturnedSet_throwsException() {
        setUniqueList.add("a");
        Set<String> set = setUniqueList.asSet();
        set.add("b");
    }

    // -------------------- add(E) --------------------

    @Test
    public void testAdd_uniqueElement_returnsTrueAndAdds() {
        boolean result = setUniqueList.add("a");
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testAdd_duplicateElement_returnsFalseAndDoesNotAdd() {
        setUniqueList.add("a");
        boolean result = setUniqueList.add("a");
        assertFalse(result);
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testAdd_nullElement_addsNullOnce() {
        boolean result1 = setUniqueList.add(null);
        boolean result2 = setUniqueList.add(null);
        assertTrue(result1);
        assertFalse(result2);
        assertEquals(1, setUniqueList.size());
    }

    // -------------------- add(int, E) --------------------

    @Test
    public void testAddIndex_uniqueElement_insertsAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add("c");
        setUniqueList.add(1, "b");
        assertEquals("b", setUniqueList.get(1));
        assertEquals(3, setUniqueList.size());
    }

    @Test
    public void testAddIndex_duplicateElement_doesNotInsert() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add(0, "a"); // duplicate, should not be inserted
        assertEquals(2, setUniqueList.size());
        assertEquals("a", setUniqueList.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndex_invalidIndex_throwsException() {
        setUniqueList.add(5, "a");
    }

    // -------------------- addAll(Collection) --------------------

    @Test
    public void testAddAll_uniqueCollection_addsAllElements() {
        Collection<String> coll = Arrays.asList("a", "b", "c");
        boolean result = setUniqueList.addAll(coll);
        assertTrue(result);
        assertEquals(3, setUniqueList.size());
    }

    @Test
    public void testAddAll_collectionWithDuplicates_addsOnlyUnique() {
        setUniqueList.add("a");
        Collection<String> coll = Arrays.asList("a", "b", "b", "c");
        boolean result = setUniqueList.addAll(coll);
        assertTrue(result);
        assertEquals(3, setUniqueList.size());
    }

    @Test
    public void testAddAll_emptyCollection_returnsFalse() {
        Collection<String> coll = new ArrayList<String>();
        boolean result = setUniqueList.addAll(coll);
        assertFalse(result);
        assertEquals(0, setUniqueList.size());
    }

    // -------------------- addAll(int, Collection) --------------------

    @Test
    public void testAddAllIndex_uniqueCollection_insertsAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add("d");
        Collection<String> coll = Arrays.asList("b", "c");
        boolean result = setUniqueList.addAll(1, coll);
        assertTrue(result);
        assertEquals(4, setUniqueList.size());
        assertEquals("b", setUniqueList.get(1));
        assertEquals("c", setUniqueList.get(2));
    }

    @Test
    public void testAddAllIndex_allDuplicates_returnsFalse() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection<String> coll = Arrays.asList("a", "b");
        boolean result = setUniqueList.addAll(0, coll);
        assertFalse(result);
        assertEquals(2, setUniqueList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllIndex_invalidIndex_throwsException() {
        Collection<String> coll = Arrays.asList("a", "b");
        setUniqueList.addAll(5, coll);
    }

    // -------------------- set(int, E) --------------------

    @Test
    public void testSet_newUniqueValue_replacesAndReturnsOld() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        String removed = setUniqueList.set(0, "c");
        assertEquals("a", removed);
        assertEquals("c", setUniqueList.get(0));
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testSet_valueAlreadyExistsElsewhere_removesDuplicate() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        // set index 0 to "c" which already exists at index 2
        String removed = setUniqueList.set(0, "c");
        assertEquals("a", removed);
        assertEquals(2, setUniqueList.size());
        assertEquals("c", setUniqueList.get(0));
        assertEquals("b", setUniqueList.get(1));
    }

    @Test
    public void testSet_sameValueAtSameIndex_noChange() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        String removed = setUniqueList.set(0, "a");
        assertEquals("a", removed);
        assertEquals(2, setUniqueList.size());
        assertEquals("a", setUniqueList.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet_invalidIndex_throwsException() {
        setUniqueList.set(0, "a");
    }

    // -------------------- remove(Object) --------------------

    @Test
    public void testRemoveObject_existingElement_removesAndReturnsTrue() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        boolean result = setUniqueList.remove("a");
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testRemoveObject_nonExistingElement_returnsFalse() {
        setUniqueList.add("a");
        boolean result = setUniqueList.remove("z");
        assertFalse(result);
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testRemoveObject_nullElement_removesIfPresent() {
        setUniqueList.add(null);
        boolean result = setUniqueList.remove((Object) null);
        assertTrue(result);
        assertEquals(0, setUniqueList.size());
    }

    // -------------------- remove(int) --------------------

    @Test
    public void testRemoveIndex_validIndex_removesAndReturnsElement() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        String removed = setUniqueList.remove(0);
        assertEquals("a", removed);
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndex_invalidIndex_throwsException() {
        setUniqueList.remove(0);
    }

    // -------------------- removeAll(Collection) --------------------

    @Test
    public void testRemoveAll_someElementsExist_removesThemAndReturnsTrue() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        Collection<String> toRemove = Arrays.asList("a", "b", "z");
        boolean result = setUniqueList.removeAll(toRemove);
        assertTrue(result);
        assertEquals(1, setUniqueList.size());
        assertTrue(setUniqueList.contains("c"));
    }

    @Test
    public void testRemoveAll_noElementsExist_returnsFalse() {
        setUniqueList.add("a");
        Collection<String> toRemove = Arrays.asList("x", "y");
        boolean result = setUniqueList.removeAll(toRemove);
        assertFalse(result);
        assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testRemoveAll_emptyCollection_returnsFalse() {
        setUniqueList.add("a");
        Collection<String> toRemove = new ArrayList<String>();
        boolean result = setUniqueList.removeAll(toRemove);
        assertFalse(result);
    }

    // -------------------- retainAll(Collection) --------------------

    @Test
    public void testRetainAll_allElementsRetained_returnsFalse() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection<String> toRetain = Arrays.asList("a", "b");
        boolean result = setUniqueList.retainAll(toRetain);
        assertFalse(result);
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testRetainAll_noElementsRetained_clearsList() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection<String> toRetain = Arrays.asList("z", "y");
        boolean result = setUniqueList.retainAll(toRetain);
        assertTrue(result);
        assertEquals(0, setUniqueList.size());
    }

    @Test
    public void testRetainAll_someElementsRetained_removesOthers() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        Collection<String> toRetain = Arrays.asList("a", "c");
        boolean result = setUniqueList.retainAll(toRetain);
        assertTrue(result);
        assertEquals(2, setUniqueList.size());
        assertTrue(setUniqueList.contains("a"));
        assertTrue(setUniqueList.contains("c"));
        assertFalse(setUniqueList.contains("b"));
    }

    @Test
    public void testRetainAll_emptyList_returnsFalse() {
        Collection<String> toRetain = Arrays.asList("a", "b");
        boolean result = setUniqueList.retainAll(toRetain);
        assertFalse(result);
        assertEquals(0, setUniqueList.size());
    }

    // -------------------- clear() --------------------

    @Test
    public void testClear_nonEmptyList_clearsListAndSet() {
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

    // -------------------- contains(Object) --------------------

    @Test
    public void testContains_existingElement_returnsTrue() {
        setUniqueList.add("a");
        assertTrue(setUniqueList.contains("a"));
    }

    @Test
    public void testContains_nonExistingElement_returnsFalse() {
        assertFalse(setUniqueList.contains("z"));
    }

    // -------------------- containsAll(Collection) --------------------

    @Test
    public void testContainsAll_allElementsExist_returnsTrue() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Collection<String> coll = Arrays.asList("a", "b");
        assertTrue(setUniqueList.containsAll(coll));
    }

    @Test
    public void testContainsAll_someElementsMissing_returnsFalse() {
        setUniqueList.add("a");
        Collection<String> coll = Arrays.asList("a", "z");
        assertFalse(setUniqueList.containsAll(coll));
    }

    // -------------------- iterator() --------------------

    @Test
    public void testIterator_iterateElements_returnsAllElements() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Iterator<String> it = setUniqueList.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testIterator_remove_removesFromListAndSet() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Iterator<String> it = setUniqueList.iterator();
        it.next();
        it.remove();
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    // -------------------- listIterator() --------------------

    @Test
    public void testListIterator_iterateForward_returnsAllElements() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator<String> it = setUniqueList.listIterator();
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
        ListIterator<String> it = setUniqueList.listIterator();
        it.next();
        it.next();
        assertEquals("b", it.previous());
        assertEquals("a", it.previous());
    }

    @Test
    public void testListIterator_remove_removesFromListAndSet() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator<String> it = setUniqueList.listIterator();
        it.next();
        it.remove();
        assertEquals(1, setUniqueList.size());
        assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testListIterator_addUniqueElement_insertsElement() {
        setUniqueList.add("a");
        ListIterator<String> it = setUniqueList.listIterator();
        it.next();
        it.add("b");
        assertEquals(2, setUniqueList.size());
        assertTrue(setUniqueList.contains("b"));
    }

    @Test
    public void testListIterator_addDuplicateElement_doesNotInsert() {
        setUniqueList.add("a");
        ListIterator<String> it = setUniqueList.listIterator();
        it.next();
        it.add("a"); // duplicate, should not insert
        assertEquals(1, setUniqueList.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIterator_set_throwsUnsupportedOperationException() {
        setUniqueList.add("a");
        ListIterator<String> it = setUniqueList.listIterator();
        it.next();
        it.set("b");
    }

    // -------------------- listIterator(int) --------------------

    @Test
    public void testListIteratorIndex_startAtIndex_returnsCorrectElements() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        ListIterator<String> it = setUniqueList.listIterator(1);
        assertEquals("b", it.next());
        assertEquals("c", it.next());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIteratorIndex_invalidIndex_throwsException() {
        setUniqueList.listIterator(5);
    }

    // -------------------- subList(int, int) --------------------

    @Test
    public void testSubList_validRange_returnsSetUniqueListSubset() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        List<String> subList = setUniqueList.subList(0, 2);
        assertEquals(2, subList.size());
        assertEquals("a", subList.get(0));
        assertEquals("b", subList.get(1));
        assertTrue(subList instanceof SetUniqueList);
    }

    @Test
    public void testSubList_emptyRange_returnsEmptySubList() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        List<String> subList = setUniqueList.subList(0, 0);
        assertEquals(0, subList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubList_invalidRange_throwsException() {
        setUniqueList.add("a");
        setUniqueList.subList(0, 5);
    }

    // -------------------- createSetBasedOnList indirectly via subList with non-HashSet --------------------

    @Test
    public void testSubList_withLinkedHashSetBackedList_createsCompatibleSet() {
        List<String> list = new ArrayList<String>();
        Set<String> linkedSet = new LinkedHashSet<String>();
        SetUniqueList<String> customList = new SetUniqueListForTest<String>(list, linkedSet);
        customList.add("a");
        customList.add("b");
        customList.add("c");
        List<String> subList = customList.subList(0, 2);
        assertEquals(2, subList.size());
    }

    // helper subclass to access protected constructor for testing custom set types
    static class SetUniqueListForTest<E> extends SetUniqueList<E> {
        protected SetUniqueListForTest(List<E> list, Set<E> set) {
            super(list, set);
        }
    }

    // -------------------- Additional edge cases --------------------

    @Test
    public void testIsEmpty_newList_returnsTrue() {
        assertTrue(setUniqueList.isEmpty());
    }

    @Test
    public void testSize_afterAddingElements_returnsCorrectSize() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testGet_validIndex_returnsElement() {
        setUniqueList.add("a");
        assertEquals("a", setUniqueList.get(0));
    }
}
