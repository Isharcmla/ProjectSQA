package org.apache.commons.collections.list;

import org.junit.Assert;
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
import java.util.NoSuchElementException;
import java.util.Set;

public class SetUniqueListTest {

    @Test(expected = IllegalArgumentException.class)
    public void testDecorate_nullList_throwsIllegalArgumentException() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testDecorate_emptyList_returnsEmptySetUniqueList() {
        List originalList = new ArrayList();
        SetUniqueList uniqueList = SetUniqueList.decorate(originalList);

        Assert.assertNotNull(uniqueList);
        Assert.assertTrue(uniqueList.isEmpty());
        Assert.assertEquals(0, uniqueList.size());
    }

    @Test
    public void testDecorate_nonEmptyListWithDuplicates_removesDuplicatesPreservingOrder() {
        List originalList = new ArrayList();
        originalList.add("A");
        originalList.add("B");
        originalList.add("A");
        originalList.add("C");
        originalList.add("B");

        SetUniqueList uniqueList = SetUniqueList.decorate(originalList);

        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
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
    public void testAsSet_returnsUnmodifiableSetView() {
        SetUniqueList uniqueList = SetUniqueList.decorate(new ArrayList());
        uniqueList.add("One");
        uniqueList.add("Two");

        Set setView = uniqueList.asSet();
        Assert.assertEquals(2, setView.size());
        Assert.assertTrue(setView.contains("One"));
        Assert.assertTrue(setView.contains("Two"));

        try {
            setView.add("Three");
            Assert.fail("Expected UnsupportedOperationException when modifying unmodifiable set view");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testAdd_uniqueAndDuplicateElements_returnsCorrectBoolean() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());

        Assert.assertTrue(list.add("Item1"));
        Assert.assertEquals(1, list.size());

        // Duplicate
        Assert.assertFalse(list.add("Item1"));
        Assert.assertEquals(1, list.size());

        // Null element
        Assert.assertTrue(list.add(null));
        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.add(null));
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testAddAtIndex_uniqueAndDuplicate_insertsOnlyUnique() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("C");

        list.add(1, "B");
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("B", list.get(1));

        // Attempt to insert duplicate at index 0
        list.add(0, "C");
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
    }

    @Test
    public void testAddAll_collectionWithDuplicates_addsOnlyUnique() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");

        Collection toAdd = Arrays.asList("A", "B", "C", "B", "D");
        boolean changed = list.addAll(toAdd);

        Assert.assertTrue(changed);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertEquals("D", list.get(3));

        // Add collection where all already exist
        boolean changedAgain = list.addAll(Arrays.asList("A", "B"));
        Assert.assertFalse(changedAgain);
        Assert.assertEquals(4, list.size());
    }

    @Test
    public void testAddAllAtIndex_collectionWithDuplicates_insertsCorrectly() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("Z");

        Collection toAdd = Arrays.asList("B", "A", "C", "B");
        boolean changed = list.addAll(1, toAdd);

        Assert.assertTrue(changed);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertEquals("Z", list.get(3));
    }

    @Test
    public void testSet_newElement_replacesOldElement() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        Object removed = list.set(1, "X");
        Assert.assertEquals("B", removed);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("X", list.get(1));
        Assert.assertFalse(list.contains("B"));
        Assert.assertTrue(list.contains("X"));
    }

    @Test
    public void testSet_sameElementAtSameIndex_doesNothing() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        Object removed = list.set(1, "B");
        Assert.assertEquals("B", removed);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("B", list.get(1));
    }

    @Test
    public void testSet_elementAlreadyPresentAtDifferentIndex_removesOldDuplicate() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // Set 'D' at index 1 (replacing 'B')
        // 'D' was originally at index 3, so old 'D' at index 3 will be removed
        Object removed = list.set(1, "D");
        Assert.assertEquals("B", removed);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("D", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertFalse(list.contains("B"));
    }

    @Test
    public void testRemoveByObject_presentAndAbsent() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        Assert.assertTrue(list.remove("A"));
        Assert.assertEquals(1, list.size());
        Assert.assertFalse(list.contains("A"));

        Assert.assertFalse(list.remove("NonExistent"));
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testRemoveByIndex_validIndex() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        Object removed = list.remove(0);
        Assert.assertEquals("A", removed);
        Assert.assertEquals(1, list.size());
        Assert.assertFalse(list.contains("A"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveByIndex_outOfBounds_throwsIndexOutOfBoundsException() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.remove(0);
    }

    @Test
    public void testRemoveAll_removesMatchingElementsFromListAndSet() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        boolean changed = list.removeAll(Arrays.asList("A", "C", "Z"));
        Assert.assertTrue(changed);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertFalse(list.contains("A"));
        Assert.assertFalse(list.contains("C"));
    }

    @Test
    public void testRetainAll_retainsOnlyMatchingElements() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        boolean changed = list.retainAll(Arrays.asList("B", "C", "Z"));
        Assert.assertTrue(changed);
        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("A"));
        Assert.assertTrue(list.contains("B"));
        Assert.assertTrue(list.contains("C"));
    }

    @Test
    public void testClear_clearsBothListAndSet() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        list.clear();
        Assert.assertEquals(0, list.size());
        Assert.assertFalse(list.contains("A"));
        Assert.assertFalse(list.contains("B"));
    }

    @Test
    public void testContainsAndContainsAll() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");

        Assert.assertTrue(list.contains("A"));
        Assert.assertFalse(list.contains("C"));

        Assert.assertTrue(list.containsAll(Arrays.asList("A", "B")));
        Assert.assertFalse(list.containsAll(Arrays.asList("A", "C")));
    }

    @Test
    public void testIterator_traversalAndRemove() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator it = list.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
        it.remove();

        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("A"));

        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("B", it.next());
        Assert.assertEquals("C", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testListIterator_fullTraversalAddAndRemove() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("C");

        ListIterator lit = list.listIterator();
        Assert.assertTrue(lit.hasNext());
        Assert.assertEquals("A", lit.next());

        // Add unique element via listIterator
        lit.add("B");
        Assert.assertEquals(3, list.size());
        Assert.assertTrue(list.contains("B"));

        // Attempt to add duplicate element via listIterator
        lit.add("A");
        Assert.assertEquals(3, list.size());

        // Previous and Next navigation
        Assert.assertTrue(lit.hasPrevious());
        Assert.assertEquals("B", lit.previous());
        Assert.assertEquals("B", lit.next());
        Assert.assertEquals("C", lit.next());

        // Remove element via listIterator
        lit.remove();
        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("C"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIterator_set_throwsUnsupportedOperationException() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");

        ListIterator lit = list.listIterator();
        lit.next();
        lit.set("B");
    }

    @Test
    public void testListIteratorWithIndex() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator lit = list.listIterator(1);
        Assert.assertEquals("B", lit.next());
        Assert.assertEquals("B", lit.previous());
    }

    @Test
    public void testSubList_operations() {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        List subList = list.subList(1, 3);
        Assert.assertTrue(subList instanceof SetUniqueList);
        Assert.assertEquals(2, subList.size());
        Assert.assertEquals("B", subList.get(0));
        Assert.assertEquals("C", subList.get(1));

        // Unique constraint check in subList
        subList.add("E");
        Assert.assertEquals(3, subList.size());
        Assert.assertTrue(list.contains("E"));

        subList.add("A"); // Duplicate from main list
        Assert.assertEquals(3, subList.size());
    }

    @Test
    public void testSerialization_roundTrip() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("One");
        list.add("Two");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(list);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SetUniqueList deserialized = (SetUniqueList) ois.readObject();
        ois.close();

        Assert.assertEquals(list.size(), deserialized.size());
        Assert.assertEquals(list.get(0), deserialized.get(0));
        Assert.assertEquals(list.get(1), deserialized.get(1));
        Assert.assertTrue(deserialized.contains("One"));
        Assert.assertFalse(deserialized.add("One"));
    }
}
