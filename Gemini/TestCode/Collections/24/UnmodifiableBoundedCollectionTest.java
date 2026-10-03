package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.apache.commons.collections4.BoundedCollection;
import org.junit.Before;
import org.junit.Test;

public class UnmodifiableBoundedCollectionTest {

    private static class MockBoundedCollection<E> extends ArrayList<E> implements BoundedCollection<E> {
        private static final long serialVersionUID = 1L;
        private final int max;

        public MockBoundedCollection(final int max) {
            super();
            this.max = max;
        }

        public MockBoundedCollection(final int max, final Collection<? extends E> coll) {
            super(coll);
            this.max = max;
        }

        @Override
        public boolean isFull() {
            return size() >= max;
        }

        @Override
        public int maxSize() {
            return max;
        }
    }

    private static class DummyCollectionDecorator<E> extends AbstractCollectionDecorator<E> {
        private static final long serialVersionUID = 1L;

        public DummyCollectionDecorator(final Collection<E> coll) {
            super(coll);
        }
    }

    private MockBoundedCollection<String> mockBounded;

    @Before
    public void setUp() {
        mockBounded = new MockBoundedCollection<String>(3);
        mockBounded.add("A");
        mockBounded.add("B");
    }

    @Test(expected = NullPointerException.class)
    public void testUnmodifiableBoundedCollection_boundedCollNull_throwsException() {
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection((BoundedCollection<String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection_collectionNull_throwsIllegalArgumentException() {
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection((Collection<String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection_nonBoundedCollection_throwsIllegalArgumentException() {
        final Collection<String> list = new ArrayList<String>();
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableBoundedCollection_nestedNonBoundedCollection_throwsIllegalArgumentException() {
        final Collection<String> decorated = new DummyCollectionDecorator<String>(new ArrayList<String>());
        UnmodifiableBoundedCollection.unmodifiableBoundedCollection(decorated);
    }

    @Test
    public void testUnmodifiableBoundedCollection_directBoundedCollection_success() {
        final BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBounded);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(3, result.maxSize());
        assertFalse(result.isFull());
    }

    @Test
    public void testUnmodifiableBoundedCollection_fromCollectionMethod_success() {
        final Collection<String> coll = mockBounded;
        final BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(coll);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(3, result.maxSize());
    }

    @Test
    public void testUnmodifiableBoundedCollection_nestedInAbstractCollectionDecorator_success() {
        final Collection<String> decorated = new DummyCollectionDecorator<String>(mockBounded);
        final BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(decorated);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(3, result.maxSize());
    }

    @Test
    public void testUnmodifiableBoundedCollection_nestedInSynchronizedCollection_success() {
        final Collection<String> synch = SynchronizedCollection.synchronizedCollection(mockBounded);
        final BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(synch);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(3, result.maxSize());
    }

    @Test
    public void testUnmodifiableBoundedCollection_multiLevelNesting_success() {
        final Collection<String> synch = SynchronizedCollection.synchronizedCollection(mockBounded);
        final Collection<String> decorated = new DummyCollectionDecorator<String>(synch);
        final BoundedCollection<String> result = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(decorated);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(3, result.maxSize());
    }

    @Test
    public void testIterator_traversalAndImmutability() {
        final BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBounded);
        final Iterator<String> iterator = bounded.iterator();

        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("B", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemove_throwsUnsupportedOperationException() {
        final BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBounded);
        final Iterator<String> iterator = bounded.iterator();
        iterator.next();
        iterator.remove();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_throwsUnsupportedOperationException() {
        final BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBounded);
        bounded.add("C");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddAll_throwsUnsupportedOperationException() {
        final BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBounded);
        bounded.addAll(Collections.singletonList("C"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClear_throwsUnsupportedOperationException() {
        final BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBounded);
        bounded.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_throwsUnsupportedOperationException() {
        final BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBounded);
        bounded.remove("A");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveAll_throwsUnsupportedOperationException() {
        final BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBounded);
        bounded.removeAll(Collections.singletonList("A"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRetainAll_throwsUnsupportedOperationException() {
        final BoundedCollection<String> bounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBounded);
        bounded.retainAll(Collections.singletonList("A"));
    }

    @Test
    public void testIsFull_and_MaxSize() {
        final MockBoundedCollection<Integer> fullMock = new MockBoundedCollection<Integer>(2, Arrays.asList(1, 2));
        final BoundedCollection<Integer> fullBounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(fullMock);

        assertTrue(fullBounded.isFull());
        assertEquals(2, fullBounded.maxSize());

        final MockBoundedCollection<Integer> emptyMock = new MockBoundedCollection<Integer>(0);
        final BoundedCollection<Integer> emptyBounded = UnmodifiableBoundedCollection.unmodifiableBoundedCollection(emptyMock);

        assertTrue(emptyBounded.isFull());
        assertEquals(0, emptyBounded.maxSize());
    }

    @Test
    public void testDecorated_accessibleAndMatchesOriginal() {
        final UnmodifiableBoundedCollection<String> unmodifiable =
                (UnmodifiableBoundedCollection<String>) UnmodifiableBoundedCollection.unmodifiableBoundedCollection(mockBounded);
        assertEquals(mockBounded, unmodifiable.decorated());
    }
}
