package org.apache.commons.collections.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class TreeListTest {

    @Test
    public void testConstructor_default_createsEmptyList() {
        TreeList<String> list = new TreeList<String>();
        Assert.assertEquals(0, list.size());
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testConstructor_withCollection_copiesElementsInOrder() {
        Collection<String> coll = Arrays.asList("A", "B", "C");
        TreeList<String> list = new TreeList<String>(coll);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullCollection_throwsNullPointerException() {
        new TreeList<String>(null);
    }

    @Test
    public void testGet_validIndices_returnsCorrectElements() {
        TreeList<Integer> list = new TreeList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        Assert.assertEquals(Integer.valueOf(10), list.get(0));
        Assert.assertEquals(Integer.valueOf(20), list.get(1));
        Assert.assertEquals(Integer.valueOf(30), list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_negativeIndex_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_indexEqualToSize_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.get(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_emptyList_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.get(0);
    }

    @Test
    public void testAdd_atSpecificIndices_maintainsCorrectOrder() {
        TreeList<String> list = new TreeList<String>();
        list.add(0, "A"); // [A]
        list.add(1, "C"); // [A, C]
        list.add(1, "B"); // [A, B, C]
        list.add(0, "First"); // [First, A, B, C]
        list.add(4, "Last"); // [First, A, B, C, Last]

        Assert.assertEquals(5, list.size());
        Assert.assertEquals("First", list.get(0));
        Assert.assertEquals("A", list.get(1));
        Assert.assertEquals("B", list.get(2));
        Assert.assertEquals("C", list.get(3));
        Assert.assertEquals("Last", list.get(4));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_negativeIndex_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add(-1, "A");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_indexGreaterThanSize_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add(1, "A");
    }

    @Test
    public void testAdd_avlRotations() {
        // Test AVL rotations (Right-Right, Left-Left, Right-Left, Left-Right)
        
        // Ascending inserts: triggers rotateLeft (RR)
        TreeList<Integer> listRR = new TreeList<Integer>();
        for (int i = 0; i < 31; i++) {
            listRR.add(i);
        }
        for (int i = 0; i < 31; i++) {
            Assert.assertEquals(Integer.valueOf(i), listRR.get(i));
        }

        // Descending inserts: triggers rotateRight (LL)
        TreeList<Integer> listLL = new TreeList<Integer>();
        for (int i = 30; i >= 0; i--) {
            listLL.add(0, i);
        }
        for (int i = 0; i < 31; i++) {
            Assert.assertEquals(Integer.valueOf(i), listLL.get(i));
        }

        // Zig-Zag Left-Right (LR)
        TreeList<Integer> listLR = new TreeList<Integer>();
        listLR.add(0, 10);
        listLR.add(0, 5);
        listLR.add(1, 8); // Causes LR rotation
        Assert.assertEquals(Integer.valueOf(5), listLR.get(0));
        Assert.assertEquals(Integer.valueOf(8), listLR.get(1));
        Assert.assertEquals(Integer.valueOf(10), listLR.get(2));

        // Zig-Zag Right-Left (RL)
        TreeList<Integer> listRL = new TreeList<Integer>();
        listRL.add(0, 10);
        listRL.add(1, 20);
        listRL.add(1, 15); // Causes RL rotation
        Assert.assertEquals(Integer.valueOf(10), listRL.get(0));
        Assert.assertEquals(Integer.valueOf(15), listRL.get(1));
        Assert.assertEquals(Integer.valueOf(20), listRL.get(2));
    }

    @Test
    public void testSet_validIndex_replacesValueAndReturnsOldValue() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        String oldVal = list.set(1, "Updated");
        Assert.assertEquals("B", oldVal);
        Assert.assertEquals("Updated", list.get(1));
        Assert.assertEquals(3, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet_negativeIndex_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.set(-1, "X");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet_indexEqualToSize_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.set(1, "X");
    }

    @Test
    public void testRemove_variousPositionsAndNodes() {
        TreeList<Integer> list = new TreeList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        // Remove from middle (two children cases)
        Integer removed = list.remove(10);
        Assert.assertEquals(Integer.valueOf(10), removed);
        Assert.assertEquals(19, list.size());

        // Remove from start (leftmost / min cases)
        removed = list.remove(0);
        Assert.assertEquals(Integer.valueOf(0), removed);
        Assert.assertEquals(18, list.size());

        // Remove from end (rightmost / max cases)
        removed = list.remove(list.size() - 1);
        Assert.assertEquals(Integer.valueOf(19), removed);
        Assert.assertEquals(17, list.size());

        // Remove remaining elements one by one to cover all remove scenarios
        while (!list.isEmpty()) {
            list.remove(list.size() / 2);
        }
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testRemove_singleChildAndDoubleLinkCases() {
        // Construct specific trees to hit remove branch conditions
        TreeList<Integer> list = new TreeList<Integer>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(0, 5);
        list.add(0, 2);
        list.add(0, 1);

        // Remove elements causing relativePosition adjustments
        list.remove(2); // remove node
        list.remove(0); // remove min
        list.remove(list.size() - 1); // remove max
        Assert.assertEquals(2, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_negativeIndex_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.remove(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_indexEqualToSize_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.remove(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_emptyList_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.remove(0);
    }

    @Test
    public void testClear_removesAllElements() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.clear();

        Assert.assertEquals(0, list.size());
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(-1, list.indexOf("A"));
    }

    @Test
    public void testIndexOf_and_contains() {
        TreeList<String> list = new TreeList<String>();
        
        // Empty list checks
        Assert.assertEquals(-1, list.indexOf("A"));
        Assert.assertFalse(list.contains("A"));
        Assert.assertEquals(-1, list.indexOf(null));
        Assert.assertFalse(list.contains(null));

        list.add("A");
        list.add(null);
        list.add("B");
        list.add("C");
        list.add("A"); // Duplicate

        Assert.assertEquals(0, list.indexOf("A"));
        Assert.assertEquals(1, list.indexOf(null));
        Assert.assertEquals(2, list.indexOf("B"));
        Assert.assertEquals(3, list.indexOf("C"));
        Assert.assertEquals(-1, list.indexOf("NonExistent"));

        Assert.assertTrue(list.contains("A"));
        Assert.assertTrue(list.contains(null));
        Assert.assertTrue(list.contains("B"));
        Assert.assertFalse(list.contains("Z"));
    }

    @Test
    public void testToArray_emptyAndPopulated() {
        TreeList<String> list = new TreeList<String>();
        Object[] emptyArray = list.toArray();
        Assert.assertEquals(0, emptyArray.length);

        list.add("X");
        list.add("Y");
        list.add("Z");
        Object[] array = list.toArray();
        Assert.assertArrayEquals(new Object[]{"X", "Y", "Z"}, array);
    }

    @Test
    public void testIterator_fullTraversal() {
        TreeList<String> list = new TreeList<String>();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator<String> it = list.iterator();
        List<String> collected = new ArrayList<String>();
        while (it.hasNext()) {
            collected.add(it.next());
        }
        Assert.assertEquals(Arrays.asList("1", "2", "3"), collected);
    }

    @Test
    public void testListIterator_traversalForwardAndBackward() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator();
        Assert.assertEquals(0, it.nextIndex());
        Assert.assertEquals(-1, it.previousIndex());
        Assert.assertTrue(it.hasNext());
        Assert.assertFalse(it.hasPrevious());

        Assert.assertEquals("A", it.next());
        Assert.assertEquals(1, it.nextIndex());
        Assert.assertEquals(0, it.previousIndex());
        Assert.assertTrue(it.hasPrevious());

        Assert.assertEquals("B", it.next());
        Assert.assertEquals("C", it.next());
        Assert.assertFalse(it.hasNext());
        Assert.assertEquals(3, it.nextIndex());
        Assert.assertEquals(2, it.previousIndex());

        Assert.assertEquals("C", it.previous());
        Assert.assertEquals("B", it.previous());
        Assert.assertEquals("A", it.previous());
        Assert.assertFalse(it.hasPrevious());
    }

    @Test
    public void testListIterator_fromIndex() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator(1);
        Assert.assertEquals(1, it.nextIndex());
        Assert.assertEquals("B", it.next());

        ListIterator<String> itEnd = list.listIterator(3);
        Assert.assertEquals(3, itEnd.nextIndex());
        Assert.assertFalse(itEnd.hasNext());
        Assert.assertEquals("C", itEnd.previous());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIterator_fromIndexNegative_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.listIterator(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIterator_fromIndexGreaterThanSize_throwsIndexOutOfBoundsException() {
        TreeList<String> list = new TreeList<String>();
        list.listIterator(1);
    }

    @Test(expected = NoSuchElementException.class)
    public void testListIterator_nextExhausted_throwsNoSuchElementException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void testListIterator_previousAtStart_throwsNoSuchElementException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        it.previous();
    }

    @Test
    public void testListIterator_set_afterNextAndPrevious() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");

        ListIterator<String> it = list.listIterator();
        it.next();
        it.set("A_Modified");
        Assert.assertEquals("A_Modified", list.get(0));

        it.next();
        it.previous();
        it.set("B_Modified");
        Assert.assertEquals("B_Modified", list.get(1));
    }

    @Test(expected = IllegalStateException.class)
    public void testListIterator_setWithoutNextOrPrevious_throwsIllegalStateException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        it.set("Invalid");
    }

    @Test
    public void testListIterator_remove_afterNext() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator();
        Assert.assertEquals("A", it.next());
        it.remove();

        Assert.assertEquals(2, list.size());
        Assert.assertEquals("B", list.get(0));
        Assert.assertEquals("B", it.next());
    }

    @Test
    public void testListIterator_remove_afterPrevious() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator(2); // points before C
        Assert.assertEquals("B", it.previous());
        it.remove();

        Assert.assertEquals(2, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("C", list.get(1));
        Assert.assertEquals("C", it.next());
    }

    @Test(expected = IllegalStateException.class)
    public void testListIterator_removeWithoutNextOrPrevious_throwsIllegalStateException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        it.remove();
    }

    @Test(expected = IllegalStateException.class)
    public void testListIterator_doubleRemove_throwsIllegalStateException() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        it.next();
        it.remove();
        it.remove();
    }

    @Test
    public void testListIterator_add_insertsCorrectly() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        list.add("C");

        ListIterator<String> it = list.listIterator(1);
        it.add("B");

        Assert.assertEquals(3, list.size());
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertEquals("C", it.next());
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testListIterator_concurrentModification_next_throwsCME() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        list.add("B");
        it.next();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testListIterator_concurrentModification_previous_throwsCME() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator(1);
        list.add("B");
        it.previous();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testListIterator_concurrentModification_remove_throwsCME() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        it.next();
        list.add("B");
        it.remove();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testListIterator_concurrentModification_set_throwsCME() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        it.next();
        list.add("B");
        it.set("C");
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testListIterator_concurrentModification_add_throwsCME() {
        TreeList<String> list = new TreeList<String>();
        list.add("A");
        ListIterator<String> it = list.listIterator();
        list.add("B");
        it.add("C");
    }

    @Test
    public void testAVLNode_toString() {
        TreeList<String> list = new TreeList<String>();
        list.add("root");
        list.add("left");
        list.add("right");

        TreeList.AVLNode<String> node = new TreeList.AVLNode<String>(0, "test", null, null);
        String str = node.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("AVLNode"));
        Assert.assertTrue(str.contains("test"));
    }
}
