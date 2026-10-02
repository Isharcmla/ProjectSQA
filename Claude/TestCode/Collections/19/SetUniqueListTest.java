import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.apache.commons.collections.list.SetUniqueList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetUniqueListTest {

    private SetUniqueList<String> setUniqueList;

    @Before
    public void setUp() {
        List<String> list = new ArrayList<String>();
        setUniqueList = SetUniqueList.setUniqueList(list);
    }

    // ---------------------- Factory method tests ----------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetUniqueList_withNullList_throwsException() {
        SetUniqueList.setUniqueList(null);
    }

    @Test
    public void testSetUniqueList_withEmptyList_returnsEmptySetUniqueList() {
        List<String> list = new ArrayList<String>();
        SetUniqueList<String> result = SetUniqueList.setUniqueList(list);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testSetUniqueList_withDuplicates_removesDuplicates() {
        List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "a", "c", "b"));
        SetUniqueList<String> result = SetUniqueList.setUniqueList(list);
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.contains("a"));
        Assert.assertTrue(result.contains("b"));
        Assert.assertTrue(result.contains("c"));
    }

    // ---------------------- asSet ----------------------

    @Test
    public void testAsSet_returnsUnmodifiableSet() {
        setUniqueList.add("x");
        Set<String> asSet = setUniqueList.asSet();
        Assert.assertTrue(asSet.contains("x"));
        try {
            asSet.add("y");
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------------------- add(E) ----------------------

    @Test
    public void testAdd_uniqueElement_returnsTrue() {
        boolean result = setUniqueList.add("a");
        Assert.assertTrue(result);
        Assert.assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testAdd_duplicateElement_returnsFalse() {
        setUniqueList.add("a");
        boolean result = setUniqueList.add("a");
        Assert.assertFalse(result);
        Assert.assertEquals(1, setUniqueList.size());
    }

    // ---------------------- add(int, E) ----------------------

    @Test
    public void testAddIndex_uniqueElement_addsAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add(0, "b");
        Assert.assertEquals("b", setUniqueList.get(0));
        Assert.assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testAddIndex_duplicateElement_notAdded() {
        setUniqueList.add("a");
        setUniqueList.add(0, "a");
        Assert.assertEquals(1, setUniqueList.size());
    }

    // ---------------------- addAll(Collection) ----------------------

    @Test
    public void testAddAll_withDuplicates_onlyAddsUnique() {
        setUniqueList.add("a");
        List<String> toAdd = Arrays.asList("a", "b", "c", "b");
        boolean changed = setUniqueList.addAll(toAdd);
        Assert.assertTrue(changed);
        Assert.assertEquals(3, setUniqueList.size());
        Assert.assertTrue(setUniqueList.contains("b"));
        Assert.assertTrue(setUniqueList.contains("c"));
    }

    @Test
    public void testAddAll_withAllDuplicates_returnsFalse() {
        setUniqueList.add("a");
        List<String> toAdd = Arrays.asList("a");
        boolean changed = setUniqueList.addAll(toAdd);
        Assert.assertFalse(changed);
        Assert.assertEquals(1, setUniqueList.size());
    }

    // ---------------------- addAll(int, Collection) ----------------------

    @Test
    public void testAddAllIndex_withDuplicates_onlyAddsUnique() {
        setUniqueList.add("a");
        setUniqueList.add("z");
        List<String> toAdd = Arrays.asList("a", "b", "c");
        boolean changed = setUniqueList.addAll(1, toAdd);
        Assert.assertTrue(changed);
        Assert.assertEquals(4, setUniqueList.size());
        Assert.assertEquals("b", setUniqueList.get(1));
        Assert.assertEquals("c", setUniqueList.get(2));
    }

    // ---------------------- set(int, E) ----------------------

    @Test
    public void testSet_replaceWithNewValue() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        String removed = setUniqueList.set(0, "c");
        Assert.assertEquals("a", removed);
        Assert.assertEquals("c", setUniqueList.get(0));
        Assert.assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testSet_replaceWithDuplicateValue_removesOldDuplicate() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        // set index 0 to "c" which already exists at index 2
        String removed = setUniqueList.set(0, "c");
        Assert.assertEquals("a", removed);
        Assert.assertEquals(2, setUniqueList.size());
        Assert.assertEquals("c", setUniqueList.get(0));
        Assert.assertTrue(setUniqueList.contains("b"));
        Assert.assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testSet_replaceWithSameValueAtSameIndex_noRemoval() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        String removed = setUniqueList.set(0, "a");
        Assert.assertEquals("a", removed);
        Assert.assertEquals(2, setUniqueList.size());
    }

    // ---------------------- remove(Object) ----------------------

    @Test
    public void testRemoveObject_existing_returnsTrue() {
        setUniqueList.add("a");
        boolean result = setUniqueList.remove("a");
        Assert.assertTrue(result);
        Assert.assertEquals(0, setUniqueList.size());
    }

    @Test
    public void testRemoveObject_notExisting_returnsFalse() {
        setUniqueList.add("a");
        boolean result = setUniqueList.remove("b");
        Assert.assertFalse(result);
        Assert.assertEquals(1, setUniqueList.size());
    }

    // ---------------------- remove(int) ----------------------

    @Test
    public void testRemoveIndex_returnsElement() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        String removed = setUniqueList.remove(0);
        Assert.assertEquals("a", removed);
        Assert.assertEquals(1, setUniqueList.size());
        Assert.assertFalse(setUniqueList.contains("a"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndex_outOfBounds_throwsException() {
        setUniqueList.remove(0);
    }

    // ---------------------- removeAll(Collection) ----------------------

    @Test
    public void testRemoveAll_removesMatchingElements() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        boolean result = setUniqueList.removeAll(Arrays.asList("a", "c"));
        Assert.assertTrue(result);
        Assert.assertEquals(1, setUniqueList.size());
        Assert.assertTrue(setUniqueList.contains("b"));
    }

    @Test
    public void testRemoveAll_noMatchingElements_returnsFalse() {
        setUniqueList.add("a");
        boolean result = setUniqueList.removeAll(Arrays.asList("z"));
        Assert.assertFalse(result);
    }

    // ---------------------- retainAll(Collection) ----------------------

    @Test
    public void testRetainAll_allRetained_returnsFalse() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        boolean result = setUniqueList.retainAll(Arrays.asList("a", "b"));
        Assert.assertFalse(result);
        Assert.assertEquals(2, setUniqueList.size());
    }

    @Test
    public void testRetainAll_noneRetained_clearsList() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        boolean result = setUniqueList.retainAll(Arrays.asList("z", "y"));
        Assert.assertTrue(result);
        Assert.assertEquals(0, setUniqueList.size());
    }

    @Test
    public void testRetainAll_someRetained_removesOthers() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        boolean result = setUniqueList.retainAll(Arrays.asList("a", "c"));
        Assert.assertTrue(result);
        Assert.assertEquals(2, setUniqueList.size());
        Assert.assertTrue(setUniqueList.contains("a"));
        Assert.assertTrue(setUniqueList.contains("c"));
        Assert.assertFalse(setUniqueList.contains("b"));
    }

    // ---------------------- clear ----------------------

    @Test
    public void testClear_emptiesListAndSet() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.clear();
        Assert.assertEquals(0, setUniqueList.size());
        Assert.assertFalse(setUniqueList.contains("a"));
    }

    // ---------------------- contains ----------------------

    @Test
    public void testContains_existingElement_returnsTrue() {
        setUniqueList.add("a");
        Assert.assertTrue(setUniqueList.contains("a"));
    }

    @Test
    public void testContains_notExistingElement_returnsFalse() {
        Assert.assertFalse(setUniqueList.contains("a"));
    }

    // ---------------------- containsAll ----------------------

    @Test
    public void testContainsAll_allPresent_returnsTrue() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Assert.assertTrue(setUniqueList.containsAll(Arrays.asList("a", "b")));
    }

    @Test
    public void testContainsAll_notAllPresent_returnsFalse() {
        setUniqueList.add("a");
        Assert.assertFalse(setUniqueList.containsAll(Arrays.asList("a", "b")));
    }

    // ---------------------- iterator ----------------------

    @Test
    public void testIterator_iteratesElements() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Iterator<String> it = setUniqueList.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("a", it.next());
        Assert.assertEquals("b", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_remove_removesFromSetAndList() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        Iterator<String> it = setUniqueList.iterator();
        it.next();
        it.remove();
        Assert.assertEquals(1, setUniqueList.size());
        Assert.assertFalse(setUniqueList.contains("a"));
        // now "a" can be added again since it was removed from set
        setUniqueList.add("a");
        Assert.assertTrue(setUniqueList.contains("a"));
    }

    // ---------------------- listIterator ----------------------

    @Test
    public void testListIterator_noArgs_iteratesElements() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator<String> it = setUniqueList.listIterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("a", it.next());
        Assert.assertEquals("b", it.next());
    }

    @Test
    public void testListIterator_withIndex_startsAtIndex() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        ListIterator<String> it = setUniqueList.listIterator(1);
        Assert.assertEquals("b", it.next());
    }

    @Test
    public void testListIterator_previous_returnsCorrectElement() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator<String> it = setUniqueList.listIterator();
        it.next();
        it.next();
        String prev = it.previous();
        Assert.assertEquals("b", prev);
    }

    @Test
    public void testListIterator_remove_removesFromSetAndList() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        ListIterator<String> it = setUniqueList.listIterator();
        it.next();
        it.remove();
        Assert.assertEquals(1, setUniqueList.size());
        Assert.assertFalse(setUniqueList.contains("a"));
    }

    @Test
    public void testListIterator_addUniqueElement_addsSuccessfully() {
        setUniqueList.add("a");
        ListIterator<String> it = setUniqueList.listIterator();
        it.next();
        it.add("b");
        Assert.assertEquals(2, setUniqueList.size());
        Assert.assertTrue(setUniqueList.contains("b"));
    }

    @Test
    public void testListIterator_addDuplicateElement_notAdded() {
        setUniqueList.add("a");
        ListIterator<String> it = setUniqueList.listIterator();
        it.next();
        it.add("a");
        Assert.assertEquals(1, setUniqueList.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIterator_setMethod_throwsException() {
        setUniqueList.add("a");
        ListIterator<String> it = setUniqueList.listIterator();
        it.next();
        it.set("b");
    }

    // ---------------------- subList ----------------------

    @Test
    public void testSubList_returnsSetUniqueListSubList() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        List<String> subList = setUniqueList.subList(0, 2);
        Assert.assertEquals(2, subList.size());
        Assert.assertTrue(subList instanceof SetUniqueList);
        Assert.assertEquals("a", subList.get(0));
        Assert.assertEquals("b", subList.get(1));
    }

    @Test
    public void testSubList_containsCorrectElements() {
        setUniqueList.add("a");
        setUniqueList.add("b");
        setUniqueList.add("c");
        List<String> subList = setUniqueList.subList(1, 3);
        Assert.assertTrue(subList.contains("b"));
        Assert.assertTrue(subList.contains("c"));
        Assert.assertFalse(subList.contains("a"));
    }

    // ---------------------- combined / additional edge cases ----------------------

    @Test
    public void testAdd_nullElement_addedOnce() {
        boolean firstAdd = setUniqueList.add(null);
        boolean secondAdd = setUniqueList.add(null);
        Assert.assertTrue(firstAdd);
        Assert.assertFalse(secondAdd);
        Assert.assertEquals(1, setUniqueList.size());
    }

    @Test
    public void testRemove_nullElement() {
        setUniqueList.add(null);
        boolean result = setUniqueList.remove(null);
        Assert.assertTrue(result);
        Assert.assertEquals(0, setUniqueList.size());
    }

    @Test
    public void testAddAll_emptyCollection_returnsFalse() {
        boolean result = setUniqueList.addAll(new ArrayList<String>());
        Assert.assertFalse(result);
        Assert.assertEquals(0, setUniqueList.size());
    }
}
