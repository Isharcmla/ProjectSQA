package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class SetUniqueListTest {

    private List<String> backingList;
    private SetUniqueList<String> uniqueList;

    @Before
    public void setUp() {
        backingList = new ArrayList<String>();
        uniqueList = SetUniqueList.setUniqueList(backingList);
    }

    @Test
    public void testFactory_nullList_throwsException() {
        try {
            SetUniqueList.setUniqueList(null);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }

    @Test
    public void testFactory_emptyList_createsEmptySetUniqueList() {
        final List<Integer> list = new ArrayList<Integer>();
        final SetUniqueList<Integer> result = SetUniqueList.setUniqueList(list);
        assertNotNull(result);
        assertTrue(result.isEmpty());
        assertEquals(0, result.size());
    }

    @Test
    public void testFactory_listWithDuplicates_removesDuplicatesRetainingOrder() {
        final List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "A", "C", "B"));
        final SetUniqueList<String> result = SetUniqueList.setUniqueList(list);
        assertEquals(3, result.size());
        assertEquals("A", result.get(0));
        assertEquals("B", result.get(1));
        assertEquals("C", result.get(2));
    }

    @Test
    public void testConstructor_nullSet_throwsException() {
        try {
            new SetUniqueList<String>(new ArrayList<String>(), null);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Set must not be null", e.getMessage());
        }
    }

    @Test
    public void testAsSet_returnsUnmodifiableSetView() {
        uniqueList.add("A");
        uniqueList.add("B");
        final Set<String> setView = uniqueList.asSet();

        assertEquals(2, setView.size());
        assertTrue(setView.contains("A"));
        assertTrue(setView.contains("B"));

        try {
            setView.add("C");
            fail("Expected UnsupportedOperationException on unmodifiable set");
        } catch (final UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAdd_uniqueAndDuplicateElements() {
        assertTrue(uniqueList.add("A"));
        assertEquals(1, uniqueList.size());

        assertFalse(uniqueList.add("A"));
        assertEquals(1, uniqueList.size());

        assertTrue(uniqueList.add(null));
        assertEquals(2, uniqueList.size());

        assertFalse(uniqueList.add(null));
        assertEquals(2, uniqueList.size());

        assertTrue(uniqueList.add("B"));
        assertEquals(3, uniqueList.size());
    }

    @Test
    public void testAddAtIndex_uniqueAndDuplicateElements() {
        uniqueList.add(0, "A");
        uniqueList.add(1, "C");
        assertEquals(2, uniqueList.size());

        uniqueList.add(1, "B");
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));

        // Inserting duplicate does nothing
        uniqueList.add(0, "C");
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
    }

    @Test
    public void testAddAll_collection() {
        final List<String> toAdd = Arrays.asList("A", "B", "A", "C");
        assertTrue(uniqueList.addAll(toAdd));
        assertEquals(3, uniqueList.size());

        assertFalse(uniqueList.addAll(Arrays.asList("A", "B", "C")));
        assertEquals(3, uniqueList.size());

        assertFalse(uniqueList.addAll(Collections.<String>emptyList()));
        assertEquals(3, uniqueList.size());
    }

    @Test
    public void testAddAllAtIndex_collection() {
        uniqueList.addAll(Arrays.asList("A", "D"));

        final List<String> toInsert = Arrays.asList("B", "C", "A");
        assertTrue(uniqueList.addAll(1, toInsert));
        assertEquals(4, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
        assertEquals("D", uniqueList.get(3));

        assertFalse(uniqueList.addAll(1, Arrays.asList("B", "D")));
        assertEquals(4, uniqueList.size());
    }

    @Test
    public void testSet_differentElementNotPresent() {
        uniqueList.addAll(Arrays.asList("A", "B", "C"));
        final String old = uniqueList.set(1, "D");
        assertEquals("B", old);
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("D", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
        assertFalse(uniqueList.contains("B"));
        assertTrue(uniqueList.contains("D"));
    }

    @Test
    public void testSet_sameElementSameIndex() {
        uniqueList.addAll(Arrays.asList("A", "B", "C"));
        final String old = uniqueList.set(1, "B");
        assertEquals("B", old);
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
    }

    @Test
    public void testSet_existingElementDifferentIndex() {
        uniqueList.addAll(Arrays.asList("A", "B", "C", "D"));
        // Set element "A" (which is at index 0) into index 2 (currently "C")
        final String old = uniqueList.set(2, "A");
        assertEquals("C", old);
        assertEquals(3, uniqueList.size());
        assertEquals("B", uniqueList.get(0));
        assertEquals("A", uniqueList.get(1));
        assertEquals("D", uniqueList.get(2));
        assertFalse(uniqueList.contains("C"));
    }

    @Test
    public void testRemove_byObject() {
        uniqueList.addAll(Arrays.asList("A", "B", "C"));

        assertTrue(uniqueList.remove("B"));
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("B"));
        assertEquals("A", uniqueList.get(0));
        assertEquals("C", uniqueList.get(1));

        assertFalse(uniqueList.remove("NonExistent"));
        assertEquals(2, uniqueList.size());
    }

    @Test
    public void testRemove_byIndex() {
        uniqueList.addAll(Arrays.asList("A", "B", "C"));

        final String removed = uniqueList.remove(1);
        assertEquals("B", removed);
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("B"));
        assertEquals("A", uniqueList.get(0));
        assertEquals("C", uniqueList.get(1));
    }

    @Test
    public void testRemoveAll() {
        uniqueList.addAll(Arrays.asList("A", "B", "C", "D"));

        assertFalse(uniqueList.removeAll(Arrays.asList("X", "Y")));
        assertEquals(4, uniqueList.size());

        assertTrue(uniqueList.removeAll(Arrays.asList("B", "D", "Z")));
        assertEquals(2, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("C", uniqueList.get(1));
        assertFalse(uniqueList.contains("B"));
        assertFalse(uniqueList.contains("D"));
    }

    @Test
    public void testRetainAll_allRetainedReturnsFalse() {
        uniqueList.addAll(Arrays.asList("A", "B", "C"));
        assertFalse(uniqueList.retainAll(Arrays.asList("A", "B", "C", "D")));
        assertEquals(3, uniqueList.size());
    }

    @Test
    public void testRetainAll_noneRetainedClearsList() {
        uniqueList.addAll(Arrays.asList("A", "B", "C"));
        assertTrue(uniqueList.retainAll(Arrays.asList("X", "Y", "Z")));
        assertEquals(0, uniqueList.size());
        assertTrue(uniqueList.isEmpty());
        assertFalse(uniqueList.contains("A"));
    }

    @Test
    public void testRetainAll_partialRetained() {
        uniqueList.addAll(Arrays.asList("A", "B", "C", "D"));
        assertTrue(uniqueList.retainAll(Arrays.asList("B", "D", "X")));
        assertEquals(2, uniqueList.size());
        assertEquals("B", uniqueList.get(0));
        assertEquals("D", uniqueList.get(1));
        assertFalse(uniqueList.contains("A"));
        assertFalse(uniqueList.contains("C"));
    }

    @Test
    public void testClear() {
        uniqueList.addAll(Arrays.asList("A", "B", "C"));
        uniqueList.clear();
        assertEquals(0, uniqueList.size());
        assertTrue(uniqueList.isEmpty());
        assertFalse(uniqueList.contains("A"));
        assertFalse(uniqueList.contains("B"));
        assertFalse(uniqueList.contains("C"));
    }

    @Test
    public void testContainsAndContainsAll() {
        uniqueList.addAll(Arrays.asList("A", "B", "C"));

        assertTrue(uniqueList.contains("A"));
        assertFalse(uniqueList.contains("D"));

        assertTrue(uniqueList.containsAll(Arrays.asList("A", "C")));
        assertFalse(uniqueList.containsAll(Arrays.asList("A", "D")));
    }

    @Test
    public void testIterator_nextAndRemove() {
        uniqueList.addAll(Arrays.asList("A", "B", "C"));
        final Iterator<String> it = uniqueList.iterator();

        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertEquals("B", it.next());
        it.remove();

        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("B"));
        assertEquals("A", uniqueList.get(0));
        assertEquals("C", uniqueList.get(1));

        assertTrue(it.hasNext());
        assertEquals("C", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testListIterator_traversalAndRemove() {
        uniqueList.addAll(Arrays.asList("A", "B", "C"));
        final ListIterator<String> it = uniqueList.listIterator();

        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertEquals("B", it.next());
        assertEquals("B", it.previous());
        assertEquals("B", it.next());
        it.remove();

        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("B"));

        final ListIterator<String> itIndex = uniqueList.listIterator(1);
        assertEquals("C", itIndex.next());
    }

    @Test
    public void testListIterator_addUniqueAndDuplicate() {
        uniqueList.addAll(Arrays.asList("A", "C"));
        final ListIterator<String> it = uniqueList.listIterator(1);

        it.add("B");
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("B", uniqueList.get(1));
        assertEquals("C", uniqueList.get(2));
        assertTrue(uniqueList.contains("B"));

        it.add("A"); // Duplicate, should not be added
        assertEquals(3, uniqueList.size());
    }

    @Test
    public void testListIterator_set_throwsUnsupportedOperationException() {
        uniqueList.addAll(Arrays.asList("A", "B"));
        final ListIterator<String> it = uniqueList.listIterator();
        it.next();
        try {
            it.set("X");
            fail("Expected UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            assertEquals("ListIterator does not support set", e.getMessage());
        }
    }

    @Test
    public void testSubList() {
        uniqueList.addAll(Arrays.asList("A", "B", "C", "D"));
        final List<String> sub = uniqueList.subList(1, 3);

        assertEquals(2, sub.size());
        assertEquals("B", sub.get(0));
        assertEquals("C", sub.get(1));
        assertTrue(sub.contains("B"));
        assertTrue(sub.contains("C"));
        assertFalse(sub.contains("A"));
    }

    @Test
    public void testCreateSetBasedOnList_withNonHashSet() {
        final List<String> list = new ArrayList<String>(Arrays.asList("B", "A"));
        final Set<String> treeSet = new TreeSet<String>(list);
        final SetUniqueList<String> customSetList = new SetUniqueList<String>(list, treeSet);

        final List<String> sub = customSetList.subList(0, 1);
        assertEquals(1, sub.size());
        assertEquals("B", sub.get(0));
    }

    private static class PrivateSet<E> extends HashSet<E> {
        private static final long serialVersionUID = 1L;

        private PrivateSet() {
            super();
        }
    }

    private static class NoDefaultConstructorSet<E> extends HashSet<E> {
        private static final long serialVersionUID = 1L;

        public NoDefaultConstructorSet(final int size) {
            super(size);
        }
    }

    @Test
    public void testCreateSetBasedOnList_instantiationAndIllegalAccessHandling() {
        final List<String> dummyList = Arrays.asList("X", "Y");

        final SetUniqueList<String> testList = new SetUniqueList<String>(new ArrayList<String>(), new HashSet<String>());

        // Test InstantiationException branch (NoDefaultConstructorSet)
        final Set<String> resultSet1 = testList.createSetBasedOnList(new NoDefaultConstructorSet<String>(10), dummyList);
        assertNotNull(resultSet1);
        assertEquals(2, resultSet1.size());
        assertTrue(resultSet1.contains("X"));
        assertTrue(resultSet1.contains("Y"));

        // Test IllegalAccessException branch (PrivateSet)
        final Set<String> resultSet2 = testList.createSetBasedOnList(new PrivateSet<String>(), dummyList);
        assertNotNull(resultSet2);
        assertEquals(2, resultSet2.size());
        assertTrue(resultSet2.contains("X"));
        assertTrue(resultSet2.contains("Y"));
    }
}
