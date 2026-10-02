package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.BoundedCollection;
import org.junit.Before;
import org.junit.Test;

public class UnmodifiableBoundedCollectionTest {

    /**
     * Simple concrete implementation of BoundedCollection used to test
     * UnmodifiableBoundedCollection without relying on any mocking framework.
     */
    private static class SimpleBoundedCollection<E> extends ArrayList<E> implements BoundedCollection<E> {
        private static final long serialVersionUID = 1L;
        private final int maxSize;

        SimpleBoundedCollection(final int maxSize) {
            this.maxSize = maxSize;
        }

        public boolean isFull() {
            return size() >= maxSize;
        }

        public int maxSize() {
            return maxSize;
        }
    }

    private SimpleBoundedCollection<String> baseCollection;
    private BoundedCollection<String> unmodifiableCollection;

    @Before
    public void setUp() {
        baseCollection = new SimpleBoundedCollection<String>(3);
        baseCollection.add("a");
        baseCollection.add("b");
        unmodifiableCollection = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(baseCollection);
    }

    // ---------------------------------------------------------------------
    // Factory method tests: unmodifiableBoundedCollection(BoundedCollection)
    // ---------------------------------------------------------------------

    @Test
    public void testUnmodifiableBoundedCollection_factoryWithBoundedCollection_returnsWrapped() {
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection((BoundedCollection<String>) baseCollection);
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    // ---------------------------------------------------------------------
    // Factory method tests: unmodifiableBoundedCollection(Collection)
    // ---------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection_factoryWithNullCollection_throwsException() {
        final Collection<String> nullColl = null;
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(nullColl);
    }

    @Test
    public void testUnmodifiableBoundedCollection_factoryWithCollectionThatIsBounded_returnsWrapped() {
        final BoundedCollection<String> result =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) baseCollection);
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection_factoryWithNonBoundedCollection_throwsException() {
        final Collection<String> plainList = new ArrayList<String>();
        plainList.add("x");
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(plainList);
    }

    // ---------------------------------------------------------------------
    // iterator() tests
    // ---------------------------------------------------------------------

    @Test
    public void testIterator_returnsUnmodifiableIterator() {
        final Iterator<String> it = unmodifiableCollection.iterator();
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_removeCall_throwsException() {
        final Iterator<String> it = unmodifiableCollection.iterator();
        it.next();
        it.remove();
    }

    // ---------------------------------------------------------------------
    // Mutating methods should all throw UnsupportedOperationException
    // ---------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_throwsUnsupportedOperationException() {
        unmodifiableCollection.add("c");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddAll_throwsUnsupportedOperationException() {
        final List<String> toAdd = new ArrayList<String>();
        toAdd.add("c");
        unmodifiableCollection.addAll(toAdd);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClear_throwsUnsupportedOperationException() {
        unmodifiableCollection.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_throwsUnsupportedOperationException() {
        unmodifiableCollection.remove("a");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveAll_throwsUnsupportedOperationException() {
        final List<String> toRemove = new ArrayList<String>();
        toRemove.add("a");
        unmodifiableCollection.removeAll(toRemove);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRetainAll_throwsUnsupportedOperationException() {
        final List<String> toRetain = new ArrayList<String>();
        toRetain.add("a");
        unmodifiableCollection.retainAll(toRetain);
    }

    // ---------------------------------------------------------------------
    // isFull() / maxSize() tests
    // ---------------------------------------------------------------------

    @Test
    public void testIsFull_notFull_returnsFalse() {
        assertFalse(unmodifiableCollection.isFull());
    }

    @Test
    public void testIsFull_full_returnsTrue() {
        baseCollection.add("c");
        assertTrue(unmodifiableCollection.isFull());
    }

    @Test
    public void testMaxSize_returnsCorrectMaxSize() {
        assertEquals(3, unmodifiableCollection.maxSize());
    }

    // ---------------------------------------------------------------------
    // Additional edge case: empty bounded collection
    // ---------------------------------------------------------------------

    @Test
    public void testIsFull_emptyCollectionWithZeroMaxSize_returnsTrue() {
        final SimpleBoundedCollection<String> emptyBounded = new SimpleBoundedCollection<String>(0);
        final BoundedCollection<String> wrapped =
                UnmodifiableBoundedCollection.unmodifiableBoundedCollection(emptyBounded);
        assertTrue(wrapped.isFull());
        assertEquals(0, wrapped.maxSize());
        assertEquals(0, wrapped.size());
    }
}
