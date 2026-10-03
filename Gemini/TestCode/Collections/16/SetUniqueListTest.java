package org.apache.commons.collections.list;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class SetUniqueListTest {

    private List decoratedList;
    private SetUniqueList uniqueList;

    @Before
    public void setUp() {
        decoratedList = new ArrayList();
        uniqueList = new SetUniqueList(decoratedList, new HashSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecorate_nullList_throwsIllegalArgumentException() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testDecorate_emptyList_returnsEmptySetUniqueList() {
        List list = new ArrayList();
        SetUniqueList result = SetUniqueList.decorate(list);
        assertNotNull(result);
        assertTrue(result.isEmpty());
        assertEquals(0, result.size());
    }

    @Test
    public void testDecorate_nonEmptyListWithDuplicates_removesDuplicatesPreservingFirstOccurrence() {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("B");

        SetUniqueList result = SetUniqueList.decorate(list);

        assertEquals(3, result.size());
        assertEquals("A", result.get(0));
        assertEquals("B", result.get(1));
        assertEquals("C", result.get(2));
        assertTrue(result.contains("A"));
        assertTrue(result.contains("B"));
        assertTrue(result.contains("C"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullSet_throwsIllegalArgumentException() {
        new SetUniqueList(new ArrayList(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullList_throwsIllegalArgumentException() {
        new SetUniqueList(null, new HashSet());
    }

    @Test
    public void testAsSet_returnsUnmodifiableSetReflectingListContent() {
        uniqueList.add("A");
        uniqueList.add("B");

        Set setView = uniqueList.asSet();
        assertEquals(2, setView.size());
        assertTrue(setView.contains("A"));
        assertTrue(setView.contains("B"));

        try {
            setView.add("C");
            fail("Expected UnsupportedOperationException on modifying unmodifiable set view");
        } catch (UnsupportedOperationException expected) {
            // Success
        }

        try {
            setView.remove("A");
            fail("Expected UnsupportedOperationException on modifying unmodifiable set view");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testAdd_uniqueElement_returnsTrueAndElementAdded() {
        assertTrue(uniqueList.add("A"));
        assertEquals(1, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertTrue(uniqueList.contains("A"));

        assertTrue(uniqueList.add("B"));
        assertEquals(2, uniqueList.size());
        assertEquals("B", uniqueList.get(1));
    }

    @Test
    public void testAdd_duplicateElement_returnsFalseAndNotAdded() {
        assertTrue(uniqueList.add("A"));
        assertFalse(uniqueList.add("A"));
        assertEquals(1, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
    }

    @Test
    public void testAdd_nullElement_allowsSingleNull() {
        assertTrue(uniqueList.add(null));
        assertEquals(1, uniqueList.size());
        assertTrue(uniqueList.contains(null));

        assertFalse(uniqueList.add(null));
        assertEquals(1, uniqueList.size());
    }

    @Test
    public void testAddAtIndex_uniqueElement_insertedAtSpecifiedIndex() {
        uniqueList.add("A");
        uniqueList.add("C");

        uniqueList.add(1, "B");
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
    }

    @Test
    public void testAddAtIndex_duplicateElement_ignored() {
        uniqueList.add("A");
        uniqueList.add("B");

        uniqueList.add(0, "B");
        assertEquals(2, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
    }

    @Test
    public void testAddAll_collectionWithDuplicates_addsOnlyUniqueElements() {
        uniqueList.add("A");

        Collection coll = Arrays.asList("B", "A", "C", "B");
        boolean modified = uniqueList.addAll(coll);

        assertTrue(modified);
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
    }

    @Test
    public void testAddAll_allDuplicates_returnsFalseAndNoChange() {
        uniqueList.add("A");
        uniqueList.add("B");

        Collection coll = Arrays.asList("A", "B", "A");
        boolean modified = uniqueList.addAll(coll);

        assertFalse(modified);
        assertEquals(2, uniqueList.size());
    }

    @Test
    public void testAddAll_emptyCollection_returnsFalse() {
        uniqueList.add("A");
        boolean modified = uniqueList.addAll(new ArrayList());
        assertFalse(modified);
        assertEquals(1, uniqueList.size());
    }

    @Test
    public void testAddAllAtIndex_insertsAtSpecifiedIndexIncrementingCorrectly() {
        uniqueList.add("A");
        uniqueList.add("D");

        Collection coll = Arrays.asList("B", "A", "C"); // 'A' is duplicate, should be skipped
        boolean modified = uniqueList.addAll(1, coll);

        assertTrue(modified);
        assertEquals(4, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
        assertEquals("D", uniqueList.get(3));
    }

    @Test
    public void testAddAllAtIndex_allDuplicates_returnsFalse() {
        uniqueList.add("A");
        uniqueList.add("B");

        Collection coll = Arrays.asList("B", "A");
        boolean modified = uniqueList.addAll(1, coll);

        assertFalse(modified);
        assertEquals(2, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
    }

    @Test
    public void testSet_newElement_replacesOldElementAndUpdatesSet() {
        uniqueList.add("A");
        uniqueList.add("B");

        Object removed = uniqueList.set(0, "C");
        assertEquals("A", removed);
        assertEquals(2, uniqueList.size());
        assertEquals("C", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertFalse(uniqueList.contains("A"));
        assertTrue(uniqueList.contains("C"));
    }

    @Test
    public void testSet_duplicateElementDifferentIndex_movesElementAndRemovesDuplicate() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        // Set index 0 to "C" (which is at index 2)
        Object removed = uniqueList.set(0, "C");
        assertEquals("A", removed);
        assertEquals(2, uniqueList.size());
        assertEquals("C", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertFalse(uniqueList.contains("A"));
        assertTrue(uniqueList.contains("C"));
    }

    @Test
    public void testSet_sameElementSameIndex_noPosShift() {
        uniqueList.add("A");
        uniqueList.add("B");

        Object removed = uniqueList.set(0, "A");
        assertEquals("A", removed);
        assertEquals(2, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertTrue(uniqueList.contains("A"));
    }

    @Test
    public void testRemoveObject_presentInList_removesFromListAndSet() {
        uniqueList.add("A");
        uniqueList.add("B");

        boolean result = uniqueList.remove("A");
        assertTrue(result);
        assertEquals(1, uniqueList.size());
        assertEquals("B", uniqueList.get(0));
        assertFalse(uniqueList.contains("A"));
        assertTrue(uniqueList.contains("B"));
    }

    @Test
    public void testRemoveObject_notPresentInList_returnsFalse() {
        uniqueList.add("A");

        boolean result = uniqueList.remove("Z");
        assertFalse(result);
        assertEquals(1, uniqueList.size());
        assertTrue(uniqueList.contains("A"));
    }

    @Test
    public void testRemoveIndex_validIndex_removesAndReturnsElement() {
        uniqueList.add("A");
        uniqueList.add("B");

        Object removed = uniqueList.remove(0);
        assertEquals("A", removed);
        assertEquals(1, uniqueList.size());
        assertEquals("B", uniqueList.get(0));
        assertFalse(uniqueList.contains("A"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndex_invalidIndex_throwsIndexOutOfBoundsException() {
        uniqueList.add("A");
        uniqueList.remove(5);
    }

    @Test
    public void testRemoveAll_matchingElements_removesFromListAndSet() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        boolean result = uniqueList.removeAll(Arrays.asList("A", "C", "Z"));
        assertTrue(result);
        assertEquals(1, uniqueList.size());
        assertEquals("B", uniqueList.get(0));
        assertFalse(uniqueList.contains("A"));
        assertFalse(uniqueList.contains("C"));
        assertTrue(uniqueList.contains("B"));
    }

    @Test
    public void testRemoveAll_noMatchingElements_returnsFalse() {
        uniqueList.add("A");
        uniqueList.add("B");

        boolean result = uniqueList.removeAll(Arrays.asList("X", "Y"));
        assertFalse(result);
        assertEquals(2, uniqueList.size());
    }

    @Test
    public void testRetainAll_matchingElements_retainsOnlySpecified() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        boolean result = uniqueList.retainAll(Arrays.asList("A", "C", "Z"));
        assertTrue(result);
        assertEquals(2, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("C", uniqueList.get(1));
        assertTrue(uniqueList.contains("A"));
        assertFalse(uniqueList.contains("B"));
        assertTrue(uniqueList.contains("C"));
    }

    @Test
    public void testRetainAll_allElementsRetained_returnsFalse() {
        uniqueList.add("A");
        uniqueList.add("B");

        boolean result = uniqueList.retainAll(Arrays.asList("A", "B", "C"));
        assertFalse(result);
        assertEquals(2, uniqueList.size());
    }

    @Test
    public void testClear_removesAllElementsFromListAndSet() {
        uniqueList.add("A");
        uniqueList.add("B");

        uniqueList.clear();
        assertEquals(0, uniqueList.size());
        assertTrue(uniqueList.isEmpty());
        assertFalse(uniqueList.contains("A"));
        assertFalse(uniqueList.contains("B"));
    }

    @Test
    public void testContains_variousInputs() {
        uniqueList.add("A");
        uniqueList.add(null);

        assertTrue(uniqueList.contains("A"));
        assertTrue(uniqueList.contains(null));
        assertFalse(uniqueList.contains("B"));
        assertFalse(uniqueList.contains(""));
    }

    @Test
    public void testContainsAll_variousInputs() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        assertTrue(uniqueList.containsAll(Arrays.asList("A", "B")));
        assertTrue(uniqueList.containsAll(Arrays.asList("B", "C")));
        assertTrue(uniqueList.containsAll(new ArrayList()));
        assertFalse(uniqueList.containsAll(Arrays.asList("A", "D")));
    }

    @Test
    public void testIterator_traversalAndRemove_updatesListAndSet() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        Iterator it = uniqueList.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertTrue(it.hasNext());
        assertEquals("B", it.next());

        it.remove(); // removes "B"
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("B"));
        assertEquals("A", uniqueList.get(0));
        assertEquals("C", uniqueList.get(1));

        assertTrue(it.hasNext());
        assertEquals("C", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testListIterator_bidirectionalTraversalAndRemove() {
        uniqueList.add("A");
        uniqueList.add("B");

        ListIterator lit = uniqueList.listIterator();
        assertTrue(lit.hasNext());
        assertFalse(lit.hasPrevious());
        assertEquals(0, lit.nextIndex());
        assertEquals(-1, lit.previousIndex());

        assertEquals("A", lit.next());
        assertEquals(1, lit.nextIndex());
        assertEquals(0, lit.previousIndex());
        assertTrue(lit.hasPrevious());

        assertEquals("A", lit.previous());
        assertEquals("A", lit.next());
        assertEquals("B", lit.next());

        lit.remove(); // removes "B"
        assertEquals(1, uniqueList.size());
        assertFalse(uniqueList.contains("B"));
        assertTrue(uniqueList.contains("A"));
    }

    @Test
    public void testListIterator_addUnique_addsToListAndSet() {
        uniqueList.add("A");
        uniqueList.add("C");

        ListIterator lit = uniqueList.listIterator();
        assertEquals("A", lit.next());
        lit.add("B");

        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
        assertTrue(uniqueList.contains("B"));
    }

    @Test
    public void testListIterator_addDuplicate_ignored() {
        uniqueList.add("A");
        uniqueList.add("B");

        ListIterator lit = uniqueList.listIterator();
        lit.add("B"); // duplicate of existing element

        assertEquals(2, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIterator_set_throwsUnsupportedOperationException() {
        uniqueList.add("A");
        ListIterator lit = uniqueList.listIterator();
        lit.next();
        lit.set("Z");
    }

    @Test
    public void testListIteratorIndex_startsAtGivenIndex() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        ListIterator lit = uniqueList.listIterator(1);
        assertEquals(1, lit.nextIndex());
        assertEquals(0, lit.previousIndex());
        assertEquals("B", lit.next());
    }

    @Test
    public void testSubList_operationsReflectInOriginalAndUniqueEnforced() {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        uniqueList.add("D");

        List sub = uniqueList.subList(1, 3);
        assertTrue(sub instanceof SetUniqueList);
        assertEquals(2, sub.size());
        assertEquals("B", sub.get(0));
        assertEquals("C", sub.get(1));

        // Sublist contains elements present in parent set
        assertTrue(sub.contains("A"));
        assertFalse(sub.add("A")); // Duplicate rejected
        assertEquals(2, sub.size());

        assertTrue(sub.add("E"));
        assertEquals(3, sub.size());
        assertTrue(uniqueList.contains("E"));
    }

    @Test
    public void testSerialization_preservesUniqueListState() throws Exception {
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(uniqueList);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SetUniqueList deserialized = (SetUniqueList) ois.readObject();
        ois.close();

        assertEquals(uniqueList.size(), deserialized.size());
        assertEquals(uniqueList.get(0), deserialized.get(0));
        assertEquals(uniqueList.get(1), deserialized.get(1));
        assertEquals(uniqueList.get(2), deserialized.get(2));
        assertTrue(deserialized.contains("A"));
        assertTrue(deserialized.contains("B"));
        assertTrue(deserialized.contains("C"));
        assertFalse(deserialized.add("A"));
        assertTrue(deserialized.add("D"));
    }
}
