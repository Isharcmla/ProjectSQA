package org.apache.commons.collections.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetUniqueListTest {

    @Test(expected = IllegalArgumentException.class)
    public void testFactory_nullList_throwsIllegalArgumentException() {
        SetUniqueList.setUniqueList(null);
    }

    @Test
    public void testFactory_emptyList_returnsEmptySetUniqueList() {
        final List<String> list = new ArrayList<String>();
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Assert.assertTrue(uniqueList.isEmpty());
        Assert.assertEquals(0, uniqueList.size());
    }

    @Test
    public void testFactory_listWithDuplicates_removesDuplicatesPreservingOrder() {
        final List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "A", "C", "B"));
        final SetUniqueList<String> uniqueList = SetUniqueList.setUniqueList(list);
        Assert.assertEquals(3, uniqueList.size());
        Assert.assertEquals("A", uniqueList.get(0));
        Assert.assertEquals("B", uniqueList.get(1));
        Assert.assertEquals("C", uniqueList.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullSet_throwsIllegalArgumentException() {
        new SetUniqueList<String>(new ArrayList<String>(), null);
    }

    @Test
    public void testAsSet_returnsUnmodifiableSetView() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B")));
        final Set<String> setView = list.asSet();
        Assert.assertEquals(2, setView.size());
        Assert.assertTrue(setView.contains("A"));
        Assert.assertTrue(setView.contains("B"));

        try {
            setView.add("C");
            Assert.fail("Expected UnsupportedOperationException when modifying unmodifiable set");
        } catch (final UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testAdd_uniqueAndDuplicateElements() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        Assert.assertTrue(list.add("A"));
        Assert.assertFalse(list.add("A"));
        Assert.assertTrue(list.add("B"));
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
    }

    @Test
    public void testAddAtIndex_uniqueAndDuplicateElements() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "C")));
        list.add(1, "B");
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("B", list.get(1));

        // Add duplicate at index -> should not be inserted
        list.add(0, "B");
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
    }

    @Test
    public void testAddAll_collectionWithDuplicates() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B")));
        final boolean changed = list.addAll(Arrays.asList("B", "C", "D", "A", "E"));
        Assert.assertTrue(changed);
        Assert.assertEquals(5, list.size());
        Assert.assertEquals(Arrays.asList("A", "B", "C", "D", "E"), list);

        final boolean notChanged = list.addAll(Arrays.asList("A", "C"));
        Assert.assertFalse(notChanged);
        Assert.assertEquals(5, list.size());
    }

    @Test
    public void testAddAllAtIndex_collectionWithDuplicates() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "D")));
        final boolean changed = list.addAll(1, Arrays.asList("B", "A", "C", "D"));
        Assert.assertTrue(changed);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertEquals("D", list.get(3));

        final boolean notChanged = list.addAll(0, Arrays.asList("B", "C"));
        Assert.assertFalse(notChanged);
    }

    @Test
    public void testSet_newElement_replacesOldElement() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        final String old = list.set(1, "X");
        Assert.assertEquals("B", old);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(Arrays.asList("A", "X", "C"), list);
        Assert.assertTrue(list.contains("X"));
        Assert.assertFalse(list.contains("B"));
    }

    @Test
    public void testSet_sameElementAtSameIndex_noChange() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        final String old = list.set(1, "B");
        Assert.assertEquals("B", old);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(Arrays.asList("A", "B", "C"), list);
    }

    @Test
    public void testSet_existingElementAtDifferentIndex_movesElementAndRemovesOldIndex() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C", "D")));
        // Set element at index 1 ("B") to "D" (which is at index 3)
        final String old = list.set(1, "D");
        Assert.assertEquals("B", old);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(Arrays.asList("A", "D", "C"), list);
        Assert.assertFalse(list.contains("B"));
        Assert.assertTrue(list.contains("D"));
    }

    @Test
    public void testRemove_byObject() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        Assert.assertTrue(list.remove("B"));
        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("B"));
        Assert.assertFalse(list.remove("B"));
        Assert.assertFalse(list.remove("NonExistent"));
    }

    @Test
    public void testRemove_byIndex() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        final String removed = list.remove(1);
        Assert.assertEquals("B", removed);
        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("B"));
        Assert.assertEquals(Arrays.asList("A", "C"), list);
    }

    @Test
    public void testRemoveAll_partiallyMatchingCollection() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C", "D")));
        final boolean changed = list.removeAll(Arrays.asList("B", "D", "Z"));
        Assert.assertTrue(changed);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals(Arrays.asList("A", "C"), list);
        Assert.assertFalse(list.contains("B"));
        Assert.assertFalse(list.contains("D"));

        final boolean notChanged = list.removeAll(Arrays.asList("X", "Y"));
        Assert.assertFalse(notChanged);
    }

    @Test
    public void testRetainAll_allElementsRetained_returnsFalse() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B")));
        final boolean changed = list.retainAll(Arrays.asList("A", "B", "C"));
        Assert.assertFalse(changed);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testRetainAll_noElementsRetained_clearsListAndReturnsTrue() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        final boolean changed = list.retainAll(Arrays.asList("X", "Y"));
        Assert.assertTrue(changed);
        Assert.assertTrue(list.isEmpty());
        Assert.assertFalse(list.contains("A"));
    }

    @Test
    public void testRetainAll_someElementsRetained_modifiesListAndReturnsTrue() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C", "D")));
        final boolean changed = list.retainAll(Arrays.asList("B", "D", "X"));
        Assert.assertTrue(changed);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals(Arrays.asList("B", "D"), list);
        Assert.assertFalse(list.contains("A"));
        Assert.assertFalse(list.contains("C"));
    }

    @Test
    public void testClear_emptiesListAndSet() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B")));
        list.clear();
        Assert.assertEquals(0, list.size());
        Assert.assertTrue(list.isEmpty());
        Assert.assertFalse(list.contains("A"));
    }

    @Test
    public void testContains_and_containsAll() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        Assert.assertTrue(list.contains("A"));
        Assert.assertFalse(list.contains("Z"));
        Assert.assertTrue(list.containsAll(Arrays.asList("A", "C")));
        Assert.assertFalse(list.containsAll(Arrays.asList("A", "Z")));
    }

    @Test
    public void testIterator_nextAndRemove() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        final Iterator<String> it = list.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
        Assert.assertEquals("B", it.next());
        it.remove();

        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("B"));
        Assert.assertEquals("C", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testListIterator_traversalAndModification() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        final ListIterator<String> it = list.listIterator();

        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
        Assert.assertEquals("B", it.next());
        Assert.assertTrue(it.hasPrevious());
        Assert.assertEquals("B", it.previous());
        Assert.assertEquals("B", it.next());

        it.remove();
        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.contains("B"));

        it.add("D");
        Assert.assertTrue(list.contains("D"));

        // Add duplicate via ListIterator -> should not add duplicate
        it.add("A");
        Assert.assertEquals(3, list.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIterator_set_throwsUnsupportedOperationException() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B")));
        final ListIterator<String> it = list.listIterator();
        it.next();
        it.set("X");
    }

    @Test
    public void testListIteratorAtIndex() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        final ListIterator<String> it = list.listIterator(1);
        Assert.assertEquals("B", it.next());
    }

    @Test
    public void testSubList_hashSet() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>(Arrays.asList("A", "B", "C", "D")));
        final List<String> sub = list.subList(1, 3);
        Assert.assertTrue(sub instanceof SetUniqueList);
        Assert.assertEquals(2, sub.size());
        Assert.assertEquals("B", sub.get(0));
        Assert.assertEquals("C", sub.get(1));

        sub.add("E");
        Assert.assertTrue(sub.contains("E"));
        Assert.assertTrue(list.contains("E"));
    }

    @Test
    public void testSubList_customSetClasses() {
        // Test with TreeSet
        final List<String> baseList1 = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        final SetUniqueList<String> treeSetList = new SetUniqueList<String>(baseList1, new TreeSet<String>(baseList1));
        final List<String> subTree = treeSetList.subList(0, 2);
        Assert.assertEquals(2, subTree.size());
        Assert.assertTrue(subTree.contains("A"));

        // Test with LinkedHashSet
        final List<String> baseList2 = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        final SetUniqueList<String> linkedSetList = new SetUniqueList<String>(baseList2, new LinkedHashSet<String>(baseList2));
        final List<String> subLinked = linkedSetList.subList(0, 2);
        Assert.assertEquals(2, subLinked.size());
    }

    private static class PrivateConstructorSet<E> extends HashSet<E> {
        private static final long serialVersionUID = 1L;
        private PrivateConstructorSet() {
            super();
        }
    }

    private static abstract class AbstractCustomSet<E> extends HashSet<E> {
        private static final long serialVersionUID = 1L;
    }

    @Test
    public void testCreateSetBasedOnList_instantiationFailures_fallbackToHashSet() {
        // Test IllegalAccessException branch
        final SetUniqueList<String> privateSetList = new SetUniqueList<String>(
                new ArrayList<String>(Arrays.asList("A", "B")),
                new PrivateConstructorSet<String>()
        );
        final Set<String> createdSet1 = privateSetList.createSetBasedOnList(
                new PrivateConstructorSet<String>(),
                Arrays.asList("X", "Y")
        );
        Assert.assertNotNull(createdSet1);
        Assert.assertEquals(2, createdSet1.size());
        Assert.assertTrue(createdSet1.contains("X"));

        // Test InstantiationException branch
        final Set<String> createdSet2 = privateSetList.createSetBasedOnList(
                new AbstractCustomSet<String>() {},
                Arrays.asList("M", "N")
        );
        Assert.assertNotNull(createdSet2);
        Assert.assertEquals(2, createdSet2.size());
        Assert.assertTrue(createdSet2.contains("M"));
    }

    @Test
    public void testEdgeCases_nullAndEmptyElements() {
        final SetUniqueList<String> list = SetUniqueList.setUniqueList(new ArrayList<String>());
        Assert.assertTrue(list.add(null));
        Assert.assertFalse(list.add(null));
        Assert.assertEquals(1, list.size());
        Assert.assertTrue(list.contains(null));
        Assert.assertNull(list.get(0));

        Assert.assertTrue(list.add(""));
        Assert.assertFalse(list.add(""));
        Assert.assertEquals(2, list.size());
        Assert.assertTrue(list.contains(""));

        Assert.assertTrue(list.remove(null));
        Assert.assertFalse(list.contains(null));
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testEdgeCases_numbersAndNegativeValues() {
        final SetUniqueList<Integer> list = SetUniqueList.setUniqueList(new ArrayList<Integer>());
        Assert.assertTrue(list.add(0));
        Assert.assertTrue(list.add(-1));
        Assert.assertTrue(list.add(100));
        Assert.assertFalse(list.add(-1));
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(Arrays.asList(0, -1, 100), list);
    }
}
