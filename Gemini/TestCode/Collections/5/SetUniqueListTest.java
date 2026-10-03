package org.apache.commons.collections.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetUniqueListTest {

    @Test(expected = IllegalArgumentException.class)
    public void testDecorate_nullList_throwsException() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testDecorate_emptyList_returnsEmptySetUniqueList() {
        List list = new ArrayList();
        SetUniqueList uniqueList = SetUniqueList.decorate(list);
        Assert.assertTrue(uniqueList.isEmpty());
        Assert.assertEquals(0, uniqueList.size());
    }

    @Test
    public void testDecorate_nonEmptyListWithDuplicates_removesDuplicatesRetainingOrder() {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("B");

        SetUniqueList uniqueList = SetUniqueList.decorate(list);
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullSet_throwsException() {
        new SetUniqueList(new ArrayList(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullList_throwsException() {
        new SetUniqueList(null, new HashSet());
    }

    @Test
    public void testConstructor_validArguments_createsInstance() {
        List list = new ArrayList();
        Set set = new HashSet();
        SetUniqueList uniqueList = new SetUniqueList(list, set);
        Assert.assertNotNull(uniqueList);
        Assert.assertTrue(uniqueList.isEmpty());
    }

    @Test
    public void testAsSet_returnsUnmodifiableSetView() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");

        Set setView = uniqueList.asSet();
        Assert.assertEquals(2, setView.size());
        Assert.assertTrue(setView.contains("A"));
        Assert.assertTrue(setView.contains("B"));

        try {
            setView.add("C");
            Assert.fail("Expected UnsupportedOperationException when modifying asSet() view");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testAdd_uniqueAndDuplicateElements() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());

        Assert.assertTrue(uniqueList.add("A"));
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertTrue(uniqueList.contains("A"));

        // Adding duplicate
        Assert.assertFalse(uniqueList.add("A"));
        Assert.assertEquals(1, uniqueList.size());

        // Adding null element
        Assert.assertTrue(uniqueList.add(null));
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertFalse(uniqueList.add(null));
        Assert.assertEquals(2, uniqueList.size());
    }

    @Test
    public void testAddAtIndex_uniqueAndDuplicateElements() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("C");

        // Insert unique at index 1
        uniqueList.add(1, "B");
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(1));

        // Insert duplicate already present in list
        uniqueList.add(0, "C");
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
    }

    @Test
    public void testAddAll_collection_returnsExpectedBoolean() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");

        List toAdd = Arrays.asList("B", "C", "A");
        boolean changed = uniqueList.addAll(toAdd);
        Assert.assertTrue(changed);
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));

        // Add only duplicates
        boolean changedDuplicates = uniqueList.addAll(Arrays.asList("A", "B"));
        Assert.assertFalse(changedDuplicates);
        Assert.assertEquals(3, uniqueList.size());

        // Add empty collection
        Assert.assertFalse(uniqueList.addAll(new ArrayList()));
    }

    @Test
    public void testAddAllAtIndex_collection_returnsExpectedBoolean() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("D");

        List toAdd = Arrays.asList("B", "C", "A");
        boolean changed = uniqueList.addAll(1, toAdd);
        Assert.assertTrue(changed);
        Assert.assertEquals(4, uniqueList.size());
        Assert.assertTrue(uniqueList.contains("B"));
        Assert.assertTrue(uniqueList.contains("C"));

        boolean noChange = uniqueList.addAll(0, Arrays.asList("A", "B", "C", "D"));
        Assert.assertFalse(noChange);
    }

    @Test
    public void testSet_newElement_replacesOldElement() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        Object removed = uniqueList.set(1, "D");
        Assert.assertEquals("B", removed);
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("D", uniqueList.get(1));
        Assert.assertFalse(uniqueList.contains("B"));
        Assert.assertTrue(uniqueList.contains("D"));
    }

    @Test
    public void testSet_sameElementAtSameIndex_replacesItself() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");

        Object removed = uniqueList.set(1, "B");
        Assert.assertEquals("B", removed);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertTrue(uniqueList.contains("B"));
    }

    @Test
    public void testSet_existingElementAtDifferentIndex_removesPreviousOccurrence() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        // Set "C" into index 0: old "A" is removed from set, duplicate "C" at index 2 is removed
        Object removed = uniqueList.set(0, "C");
        Assert.assertEquals("A", removed);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertEquals("C", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertTrue(uniqueList.contains("C"));
    }

    @Test
    public void testRemove_byObject() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");

        Assert.assertTrue(uniqueList.remove("A"));
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertEquals(1, uniqueList.size());

        Assert.assertFalse(uniqueList.remove("NonExistent"));
    }

    @Test
    public void testRemove_byIndex() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");

        Object removed = uniqueList.remove(0);
        Assert.assertEquals("A", removed);
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertEquals(1, uniqueList.size());
    }

    @Test
    public void testRemoveAll() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        boolean changed = uniqueList.removeAll(Arrays.asList("A", "C", "Z"));
        Assert.assertTrue(changed);
        Assert.assertEquals(1, uniqueList.size());
        Assert.assertEquals("B", uniqueList.get(0));
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertFalse(uniqueList.contains("C"));

        boolean noChange = uniqueList.removeAll(Arrays.asList("X", "Y"));
        Assert.assertFalse(noChange);
    }

    @Test
    public void testRetainAll() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        boolean changed = uniqueList.retainAll(Arrays.asList("A", "C", "Z"));
        Assert.assertTrue(changed);
        Assert.assertEquals(2, uniqueList.size());
        Assert.assertTrue(uniqueList.contains("A"));
        Assert.assertTrue(uniqueList.contains("C"));
        Assert.assertFalse(uniqueList.contains("B"));

        boolean noChange = uniqueList.retainAll(Arrays.asList("A", "C"));
        Assert.assertFalse(noChange);
    }

    @Test
    public void testClear() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");

        uniqueList.clear();
        Assert.assertEquals(0, uniqueList.size());
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertFalse(uniqueList.contains("B"));
    }

    @Test
    public void testContains() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");

        Assert.assertTrue(uniqueList.contains("A"));
        Assert.assertFalse(uniqueList.contains("B"));
    }

    @Test
    public void testContainsAll() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");

        Assert.assertTrue(uniqueList.containsAll(Arrays.asList("A", "B")));
        Assert.assertTrue(uniqueList.containsAll(Arrays.asList("A")));
        Assert.assertFalse(uniqueList.containsAll(Arrays.asList("A", "C")));
    }

    @Test
    public void testIterator_traversalAndRemove() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");

        Iterator iterator = uniqueList.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("A", iterator.next());

        iterator.remove();
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertEquals(1, uniqueList.size());

        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("B", iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testListIterator_traversalAndOperations() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");

        ListIterator listIterator = uniqueList.listIterator();
        Assert.assertTrue(listIterator.hasNext());
        Assert.assertEquals("A", listIterator.next());

        // Previous
        Assert.assertTrue(listIterator.hasPrevious());
        Assert.assertEquals("A", listIterator.previous());
        Assert.assertEquals("A", listIterator.next());

        // Remove
        listIterator.remove();
        Assert.assertFalse(uniqueList.contains("A"));
        Assert.assertEquals(1, uniqueList.size());

        // Add unique
        listIterator.add("C");
        Assert.assertTrue(uniqueList.contains("C"));

        // Add duplicate (already in list or set)
        listIterator.add("B");
        Assert.assertEquals(2, uniqueList.size()); // "B" and "C"

        // Set is unsupported
        try {
            listIterator.set("Z");
            Assert.fail("Expected UnsupportedOperationException on ListIterator.set");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testListIteratorWithIndex() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");

        ListIterator listIterator = uniqueList.listIterator(1);
        Assert.assertEquals("B", listIterator.next());
        Assert.assertEquals("B", listIterator.previous());
    }

    @Test
    public void testSubList() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("A");
        uniqueList.add("B");
        uniqueList.add("C");
        uniqueList.add("D");

        List subList = uniqueList.subList(1, 3);
        Assert.assertTrue(subList instanceof SetUniqueList);
        Assert.assertEquals(2, subList.size());
        Assert.assertEquals("B", subList.get(0));
        Assert.assertEquals("C", subList.get(1));

        // Check adding duplicate via subList
        boolean added = subList.add("A"); // Already in parent/set
        Assert.assertFalse(added);
    }
}
