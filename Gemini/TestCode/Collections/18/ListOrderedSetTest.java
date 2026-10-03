package org.apache.commons.collections.set;

import static org.junit.Assert.assertArrayEquals;
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
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.collections.OrderedIterator;
import org.junit.Test;

public class ListOrderedSetTest {

    @Test
    public void testFactoryMethod_twoArgs_success() {
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        ListOrderedSet<String> orderedSet = ListOrderedSet.listOrderedSet(set, list);
        assertNotNull(orderedSet);
        assertTrue(orderedSet.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryMethod_twoArgs_nullSet_throwsException() {
        ListOrderedSet.listOrderedSet(null, new ArrayList<String>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryMethod_twoArgs_nullList_throwsException() {
        ListOrderedSet.listOrderedSet(new HashSet<String>(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryMethod_twoArgs_nonEmptySet_throwsException() {
        Set<String> set = new HashSet<String>();
        set.add("A");
        ListOrderedSet.listOrderedSet(set, new ArrayList<String>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryMethod_twoArgs_nonEmptyList_throwsException() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        ListOrderedSet.listOrderedSet(new HashSet<String>(), list);
    }

    @Test
    public void testFactoryMethod_oneArgSet_success() {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        ListOrderedSet<String> orderedSet = ListOrderedSet.listOrderedSet(set);
        assertEquals(2, orderedSet.size());
        assertTrue(orderedSet.contains("A"));
        assertTrue(orderedSet.contains("B"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryMethod_oneArgSet_null_throwsException() {
        ListOrderedSet.listOrderedSet((Set<String>) null);
    }

    @Test
    public void testFactoryMethod_oneArgList_success() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        ListOrderedSet<String> orderedSet = ListOrderedSet.listOrderedSet(list);
        assertEquals(3, orderedSet.size());
        assertEquals("A", orderedSet.get(0));
        assertEquals("B", orderedSet.get(1));
        assertEquals("C", orderedSet.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryMethod_oneArgList_null_throwsException() {
        ListOrderedSet.listOrderedSet((List<String>) null);
    }

    @Test
    public void testConstructor_default() {
        ListOrderedSet<Integer> set = new ListOrderedSet<Integer>();
        assertTrue(set.isEmpty());
        assertEquals(0, set.size());
    }

    @Test
    public void testConstructor_protectedSet() {
        Set<Integer> base = new HashSet<Integer>();
        base.add(1);
        base.add(2);
        ListOrderedSet<Integer> set = new ListOrderedSet<Integer>(base);
        assertEquals(2, set.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_protectedSetAndList_nullList_throwsException() {
        new ListOrderedSet<Integer>(new HashSet<Integer>(), null);
    }

    @Test
    public void testAsList_unmodifiable() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        List<String> list = set.asList();
        assertEquals(2, list.size());
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));

        try {
            list.add("C");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testClear() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");
        assertEquals(2, set.size());

        set.clear();
        assertEquals(0, set.size());
        assertTrue(set.isEmpty());
        assertEquals(0, set.asList().size());
    }

    @Test
    public void testAdd_andDuplicates() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        assertTrue(set.add("A"));
        assertTrue(set.add("B"));
        assertFalse(set.add("A")); // Duplicate

        assertEquals(2, set.size());
        assertEquals("A", set.get(0));
        assertEquals("B", set.get(1));
    }

    @Test
    public void testAddAll() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");

        List<String> toAdd = Arrays.asList("B", "A", "C");
        assertTrue(set.addAll(toAdd));
        assertEquals(3, set.size());
        assertEquals("A", set.get(0));
        assertEquals("B", set.get(1));
        assertEquals("C", set.get(2));

        assertFalse(set.addAll(Arrays.asList("A", "B")));
    }

    @Test
    public void testRemove_object() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        assertTrue(set.remove("B"));
        assertEquals(2, set.size());
        assertEquals("A", set.get(0));
        assertEquals("C", set.get(1));
        assertFalse(set.remove("NonExistent"));
    }

    @Test
    public void testRemoveAll() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        assertTrue(set.removeAll(Arrays.asList("A", "C", "D")));
        assertEquals(1, set.size());
        assertEquals("B", set.get(0));

        assertFalse(set.removeAll(Collections.singletonList("Z")));
    }

    @Test
    public void testRetainAll_noChange() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        assertFalse(set.retainAll(Arrays.asList("A", "B", "C")));
        assertEquals(2, set.size());
    }

    @Test
    public void testRetainAll_partialRemoval() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        assertTrue(set.retainAll(Arrays.asList("B", "D", "E")));
        assertEquals(2, set.size());
        assertEquals("B", set.get(0));
        assertEquals("D", set.get(1));
    }

    @Test
    public void testRetainAll_clearAll() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        assertTrue(set.retainAll(Collections.singletonList("Z")));
        assertTrue(set.isEmpty());
        assertEquals(0, set.asList().size());
    }

    @Test
    public void testToArray() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");

        Object[] array = set.toArray();
        assertArrayEquals(new Object[]{"A", "B"}, array);

        String[] typedArray = set.toArray(new String[0]);
        assertArrayEquals(new String[]{"A", "B"}, typedArray);

        String[] largeArray = new String[4];
        largeArray[2] = "Existing";
        String[] result = set.toArray(largeArray);
        assertEquals("A", result[0]);
        assertEquals("B", result[1]);
        assertEquals(null, result[2]); // null-terminated
    }

    @Test
    public void testGet_andIndexOf() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("Zero");
        set.add("One");
        set.add("Two");

        assertEquals("Zero", set.get(0));
        assertEquals("One", set.get(1));
        assertEquals("Two", set.get(2));

        assertEquals(0, set.indexOf("Zero"));
        assertEquals(1, set.indexOf("One"));
        assertEquals(2, set.indexOf("Two"));
        assertEquals(-1, set.indexOf("NotFound"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_outOfBounds_throwsException() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.get(0);
    }

    @Test
    public void testAdd_indexed() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("C");

        set.add(1, "B");
        assertEquals(3, set.size());
        assertEquals("A", set.get(0));
        assertEquals("B", set.get(1));
        assertEquals("C", set.get(2));

        // Add already contained element does nothing
        set.add(0, "B");
        assertEquals(3, set.size());
        assertEquals("A", set.get(0));
        assertEquals("B", set.get(1));
        assertEquals("C", set.get(2));
    }

    @Test
    public void testAddAll_indexed() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("D");

        // Insert new and duplicate elements
        boolean changed = set.addAll(1, Arrays.asList("B", "A", "C"));
        assertTrue(changed);
        assertEquals(4, set.size());
        assertEquals("A", set.get(0));
        assertEquals("B", set.get(1));
        assertEquals("C", set.get(2));
        assertEquals("D", set.get(3));

        // Insert only duplicates
        changed = set.addAll(2, Arrays.asList("A", "B", "C"));
        assertFalse(changed);
        assertEquals(4, set.size());

        // Insert empty collection
        changed = set.addAll(0, Collections.<String>emptyList());
        assertFalse(changed);
    }

    @Test
    public void testRemove_indexed() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        Object removed = set.remove(1);
        assertEquals("B", removed);
        assertEquals(2, set.size());
        assertEquals("A", set.get(0));
        assertEquals("C", set.get(1));
        assertFalse(set.contains("B"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_indexed_outOfBounds_throwsException() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.remove(0);
    }

    @Test
    public void testToString() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        assertEquals("[]", set.toString());

        set.add("A");
        set.add("B");
        assertEquals("[A, B]", set.toString());
    }

    @Test
    public void testOrderedSetIterator() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        set.add("First");
        set.add("Second");
        set.add("Third");

        OrderedIterator<String> it = set.iterator();
        assertFalse(it.hasPrevious());
        assertTrue(it.hasNext());

        assertEquals("First", it.next());
        assertTrue(it.hasPrevious());
        assertEquals("Second", it.next());

        assertEquals("Second", it.previous());
        assertEquals("Second", it.next());
        assertEquals("Third", it.next());
        assertFalse(it.hasNext());

        // Test remove via iterator
        it.remove();
        assertEquals(2, set.size());
        assertFalse(set.contains("Third"));
        assertEquals("Second", set.get(1));

        // Previous after remove
        assertTrue(it.hasPrevious());
        assertEquals("Second", it.previous());
        it.remove();
        assertEquals(1, set.size());
        assertFalse(set.contains("Second"));
        assertEquals("First", set.get(0));
    }

    @Test(expected = NoSuchElementException.class)
    public void testOrderedSetIterator_noSuchElementNext_throwsException() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        OrderedIterator<String> it = set.iterator();
        it.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void testOrderedSetIterator_noSuchElementPrevious_throwsException() {
        ListOrderedSet<String> set = new ListOrderedSet<String>();
        OrderedIterator<String> it = set.iterator();
        it.previous();
    }
}
