import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.apache.commons.collections.list.TreeList;

public class TreeListTest {

    private TreeList<String> list;

    @Before
    public void setUp() {
        list = new TreeList<String>();
    }

    // ---------------------- Constructors ----------------------

    @Test
    public void testDefaultConstructor_emptyList() {
        TreeList<String> l = new TreeList<String>();
        Assert.assertEquals(0, l.size());
    }

    @Test
    public void testConstructorWithCollection_copiesElements() {
        List<String> src = new ArrayList<String>();
        src.add("a");
        src.add("b");
        src.add("c");
        TreeList<String> l = new TreeList<String>(src);
        Assert.assertEquals(3, l.size());
        Assert.assertEquals("a", l.get(0));
        Assert.assertEquals("b", l.get(1));
        Assert.assertEquals("c", l.get(2));
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullCollection_throwsNPE() {
        new TreeList<String>(null);
    }

    // ---------------------- add ----------------------

    @Test
    public void testAdd_normal_insertsAtEnd() {
        list.add(0, "a");
        list.add(1, "b");
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
    }

    @Test
    public void testAdd_atBeginning_shiftsElements() {
        list.add(0, "b");
        list.add(0, "a");
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
    }

    @Test
    public void testAdd_atMiddle() {
        list.add(0, "a");
        list.add(1, "c");
        list.add(1, "b");
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
        Assert.assertEquals("c", list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_indexOutOfBounds_throws() {
        list.add(5, "x");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_negativeIndex_throws() {
        list.add(-1, "x");
    }

    @Test
    public void testAdd_null_allowed() {
        list.add(0, null);
        Assert.assertNull(list.get(0));
    }

    // ---------------------- get ----------------------

    @Test
    public void testGet_normal() {
        list.add(0, "a");
        list.add(1, "b");
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_indexOutOfBounds_throws() {
        list.add(0, "a");
        list.get(5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_negativeIndex_throws() {
        list.add(0, "a");
        list.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_emptyList_throws() {
        list.get(0);
    }

    // ---------------------- size ----------------------

    @Test
    public void testSize_emptyList_returnsZero() {
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSize_afterAdds_returnsCorrectSize() {
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        Assert.assertEquals(3, list.size());
    }

    // ---------------------- set ----------------------

    @Test
    public void testSet_normal_replacesValue() {
        list.add(0, "a");
        String old = list.set(0, "b");
        Assert.assertEquals("a", old);
        Assert.assertEquals("b", list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet_indexOutOfBounds_throws() {
        list.add(0, "a");
        list.set(5, "b");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet_emptyList_throws() {
        list.set(0, "b");
    }

    // ---------------------- remove ----------------------

    @Test
    public void testRemove_normal_returnsRemovedValue() {
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        String removed = list.remove(1);
        Assert.assertEquals("b", removed);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("c", list.get(1));
    }

    @Test
    public void testRemove_firstElement() {
        list.add(0, "a");
        list.add(1, "b");
        String removed = list.remove(0);
        Assert.assertEquals("a", removed);
        Assert.assertEquals("b", list.get(0));
    }

    @Test
    public void testRemove_lastElement() {
        list.add(0, "a");
        list.add(1, "b");
        String removed = list.remove(1);
        Assert.assertEquals("b", removed);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testRemove_onlyElement_makesListEmpty() {
        list.add(0, "a");
        list.remove(0);
        Assert.assertEquals(0, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_indexOutOfBounds_throws() {
        list.add(0, "a");
        list.remove(5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_emptyList_throws() {
        list.remove(0);
    }

    // ---------------------- clear ----------------------

    @Test
    public void testClear_removesAllElements() {
        list.add(0, "a");
        list.add(1, "b");
        list.clear();
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testClear_onEmptyList_noException() {
        list.clear();
        Assert.assertEquals(0, list.size());
    }

    // ---------------------- indexOf ----------------------

    @Test
    public void testIndexOf_found_returnsCorrectIndex() {
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        Assert.assertEquals(1, list.indexOf("b"));
    }

    @Test
    public void testIndexOf_notFound_returnsMinusOne() {
        list.add(0, "a");
        Assert.assertEquals(-1, list.indexOf("z"));
    }

    @Test
    public void testIndexOf_emptyList_returnsMinusOne() {
        Assert.assertEquals(-1, list.indexOf("a"));
    }

    @Test
    public void testIndexOf_nullElement_found() {
        list.add(0, "a");
        list.add(1, null);
        Assert.assertEquals(1, list.indexOf(null));
    }

    @Test
    public void testIndexOf_nullElement_notPresent() {
        list.add(0, "a");
        Assert.assertEquals(-1, list.indexOf(null));
    }

    // ---------------------- contains ----------------------

    @Test
    public void testContains_true_whenPresent() {
        list.add(0, "a");
        Assert.assertTrue(list.contains("a"));
    }

    @Test
    public void testContains_false_whenAbsent() {
        list.add(0, "a");
        Assert.assertFalse(list.contains("z"));
    }

    @Test
    public void testContains_emptyList_returnsFalse() {
        Assert.assertFalse(list.contains("a"));
    }

    // ---------------------- toArray ----------------------

    @Test
    public void testToArray_normal_returnsAllElements() {
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        Object[] arr = list.toArray();
        Assert.assertEquals(3, arr.length);
        Assert.assertEquals("a", arr[0]);
        Assert.assertEquals("b", arr[1]);
        Assert.assertEquals("c", arr[2]);
    }

    @Test
    public void testToArray_emptyList_returnsEmptyArray() {
        Object[] arr = list.toArray();
        Assert.assertEquals(0, arr.length);
    }

    // ---------------------- iterator ----------------------

    @Test
    public void testIterator_basicTraversal() {
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        Iterator<String> it = list.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("a", it.next());
        Assert.assertEquals("b", it.next());
        Assert.assertEquals("c", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_emptyList_hasNoElements() {
        Iterator<String> it = list.iterator();
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_remove_removesElement() {
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        Iterator<String> it = list.iterator();
        it.next();
        it.remove();
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("b", list.get(0));
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_next_afterEnd_throws() {
        list.add(0, "a");
        Iterator<String> it = list.iterator();
        it.next();
        it.next();
    }

    // ---------------------- listIterator ----------------------

    @Test
    public void testListIterator_defaultStartsAtZero() {
        list.add(0, "a");
        list.add(1, "b");
        ListIterator<String> it = list.listIterator();
        Assert.assertEquals(0, it.nextIndex());
        Assert.assertEquals("a", it.next());
    }

    @Test
    public void testListIterator_fromIndex_startsCorrectly() {
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        ListIterator<String> it = list.listIterator(1);
        Assert.assertEquals(1, it.nextIndex());
        Assert.assertEquals("b", it.next());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIterator_fromIndexOutOfBounds_throws() {
        list.add(0, "a");
        list.listIterator(5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIterator_negativeFromIndex_throws() {
        list.add(0, "a");
        list.listIterator(-1);
    }

    @Test
    public void testListIterator_hasNext_trueWhenElementsRemain() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        Assert.assertTrue(it.hasNext());
    }

    @Test
    public void testListIterator_hasNext_falseAtEnd() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        it.next();
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testListIterator_hasPrevious_falseAtStart() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        Assert.assertFalse(it.hasPrevious());
    }

    @Test
    public void testListIterator_hasPrevious_trueAfterNext() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        it.next();
        Assert.assertTrue(it.hasPrevious());
    }

    @Test(expected = NoSuchElementException.class)
    public void testListIterator_next_atEnd_throws() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void testListIterator_previous_atStart_throws() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        it.previous();
    }

    @Test
    public void testListIterator_previous_afterNext_returnsSameElement() {
        list.add(0, "a");
        list.add(1, "b");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.next();
        Assert.assertEquals("b", it.previous());
        Assert.assertEquals("a", it.previous());
    }

    @Test
    public void testListIterator_previous_fromMiddleWithoutNext() {
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        ListIterator<String> it = list.listIterator(2);
        Assert.assertEquals("b", it.previous());
    }

    @Test
    public void testListIterator_nextIndex_correctValue() {
        list.add(0, "a");
        list.add(1, "b");
        ListIterator<String> it = list.listIterator();
        Assert.assertEquals(0, it.nextIndex());
        it.next();
        Assert.assertEquals(1, it.nextIndex());
    }

    @Test
    public void testListIterator_previousIndex_correctValue() {
        list.add(0, "a");
        list.add(1, "b");
        ListIterator<String> it = list.listIterator();
        Assert.assertEquals(-1, it.previousIndex());
        it.next();
        Assert.assertEquals(0, it.previousIndex());
    }

    @Test
    public void testListIterator_remove_afterNext_removesElement() {
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.remove();
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("b", list.get(0));
    }

    @Test
    public void testListIterator_remove_afterPrevious_removesElement() {
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.next();
        it.previous();
        it.remove();
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("c", list.get(1));
    }

    @Test(expected = IllegalStateException.class)
    public void testListIterator_remove_withoutNextOrPrevious_throws() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        it.remove();
    }

    @Test(expected = IllegalStateException.class)
    public void testListIterator_remove_calledTwice_throws() {
        list.add(0, "a");
        list.add(1, "b");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.remove();
        it.remove();
    }

    @Test
    public void testListIterator_set_afterNext_updatesValue() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.set("z");
        Assert.assertEquals("z", list.get(0));
    }

    @Test(expected = IllegalStateException.class)
    public void testListIterator_set_withoutNextOrPrevious_throws() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        it.set("z");
    }

    @Test
    public void testListIterator_add_insertsElement() {
        list.add(0, "a");
        list.add(1, "c");
        ListIterator<String> it = list.listIterator(1);
        it.add("b");
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
        Assert.assertEquals("c", list.get(2));
    }

    @Test
    public void testListIterator_add_thenNextReturnsCorrectElement() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        it.add("z");
        Assert.assertEquals(2, it.nextIndex());
        Assert.assertEquals("a", it.next());
    }

    // ---------------------- ConcurrentModificationException ----------------------

    @Test(expected = ConcurrentModificationException.class)
    public void testConcurrentModification_next_throwsAfterStructuralChange() {
        list.add(0, "a");
        list.add(1, "b");
        Iterator<String> it = list.iterator();
        list.add(2, "c");
        it.next();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testConcurrentModification_previous_throwsAfterStructuralChange() {
        list.add(0, "a");
        list.add(1, "b");
        ListIterator<String> it = list.listIterator(1);
        list.remove(0);
        it.previous();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testConcurrentModification_iteratorRemove_throwsAfterExternalChange() {
        list.add(0, "a");
        list.add(1, "b");
        Iterator<String> it = list.iterator();
        it.next();
        list.add(2, "c");
        it.remove();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testConcurrentModification_iteratorSet_throwsAfterExternalChange() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        it.next();
        list.add(1, "b");
        it.set("z");
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testConcurrentModification_iteratorAdd_throwsAfterExternalChange() {
        list.add(0, "a");
        ListIterator<String> it = list.listIterator();
        list.add(1, "b");
        it.add("z");
    }

    // ---------------------- Larger scale tests for AVL balancing ----------------------

    @Test
    public void testManySequentialAdds_maintainsCorrectOrder() {
        for (int i = 0; i < 100; i++) {
            list.add(i, "val" + i);
        }
        Assert.assertEquals(100, list.size());
        for (int i = 0; i < 100; i++) {
            Assert.assertEquals("val" + i, list.get(i));
        }
    }

    @Test
    public void testManyPrependAdds_maintainsCorrectOrder() {
        for (int i = 0; i < 100; i++) {
            list.add(0, "val" + i);
        }
        Assert.assertEquals(100, list.size());
        for (int i = 0; i < 100; i++) {
            Assert.assertEquals("val" + (99 - i), list.get(i));
        }
    }

    @Test
    public void testManyRandomInsertsAndRemoves_maintainsConsistency() {
        List<String> reference = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            String val = "v" + i;
            int idx = i % (list.size() + 1);
            list.add(idx, val);
            reference.add(idx, val);
        }
        Assert.assertEquals(reference.size(), list.size());
        for (int i = 0; i < reference.size(); i++) {
            Assert.assertEquals(reference.get(i), list.get(i));
        }

        // now remove every other element
        for (int i = reference.size() - 1; i >= 0; i -= 2) {
            String expected = reference.remove(i);
            String actual = list.remove(i);
            Assert.assertEquals(expected, actual);
        }
        Assert.assertEquals(reference.size(), list.size());
        for (int i = 0; i < reference.size(); i++) {
            Assert.assertEquals(reference.get(i), list.get(i));
        }
    }

    @Test
    public void testRemoveAllElementsOneByOne_fromFront() {
        for (int i = 0; i < 30; i++) {
            list.add(i, "v" + i);
        }
        for (int i = 0; i < 30; i++) {
            Assert.assertEquals("v" + i, list.remove(0));
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testRemoveAllElementsOneByOne_fromBack() {
        for (int i = 0; i < 30; i++) {
            list.add(i, "v" + i);
        }
        for (int i = 29; i >= 0; i--) {
            Assert.assertEquals("v" + i, list.remove(i));
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testAddAndRemove_triggersRebalancing() {
        // Build a sizable list to force rotations
        for (int i = 0; i < 64; i++) {
            list.add(list.size(), "n" + i);
        }
        Assert.assertEquals(64, list.size());
        // remove from middle repeatedly
        for (int i = 0; i < 32; i++) {
            list.remove(list.size() / 2);
        }
        Assert.assertEquals(32, list.size());
    }

    @Test
    public void testToArray_afterManyOperations() {
        for (int i = 0; i < 20; i++) {
            list.add(i, "x" + i);
        }
        list.remove(5);
        list.remove(0);
        Object[] arr = list.toArray();
        Assert.assertEquals(list.size(), arr.length);
        for (int i = 0; i < arr.length; i++) {
            Assert.assertEquals(list.get(i), arr[i]);
        }
    }

    @Test
    public void testIndexOf_afterManyOperations() {
        for (int i = 0; i < 20; i++) {
            list.add(i, "x" + i);
        }
        list.remove(10);
        Assert.assertEquals(9, list.indexOf("x9"));
        Assert.assertEquals(-1, list.indexOf("x10"));
        Assert.assertEquals(10, list.indexOf("x11"));
    }

    @Test
    public void testIteratorOrderedIterator_traversalMatchesGet() {
        for (int i = 0; i < 15; i++) {
            list.add(i, "e" + i);
        }
        Iterator<String> it = list.iterator();
        int idx = 0;
        while (it.hasNext()) {
            Assert.assertEquals(list.get(idx), it.next());
            idx++;
        }
        Assert.assertEquals(list.size(), idx);
    }
}
