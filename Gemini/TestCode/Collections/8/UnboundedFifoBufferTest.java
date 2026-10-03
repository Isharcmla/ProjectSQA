package org.apache.commons.collections.buffer;

import org.apache.commons.collections.BufferUnderflowException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class UnboundedFifoBufferTest {

    @Test
    public void testDefaultConstructor_validState_initializesCorrectly() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        Assert.assertTrue(buffer.isEmpty());
        Assert.assertEquals(0, buffer.size());
    }

    @Test
    public void testCustomCapacityConstructor_validCapacity_initializesCorrectly() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(5);
        Assert.assertTrue(buffer.isEmpty());
        Assert.assertEquals(0, buffer.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCustomCapacityConstructor_zeroCapacity_throwsIllegalArgumentException() {
        new UnboundedFifoBuffer(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCustomCapacityConstructor_negativeCapacity_throwsIllegalArgumentException() {
        new UnboundedFifoBuffer(-1);
    }

    @Test
    public void testAddAndSize_elementsAdded_sizesMatch() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);
        Assert.assertTrue(buffer.add("A"));
        Assert.assertEquals(1, buffer.size());
        Assert.assertFalse(buffer.isEmpty());

        Assert.assertTrue(buffer.add("B"));
        Assert.assertEquals(2, buffer.size());

        // Trigger array resizing
        Assert.assertTrue(buffer.add("C"));
        Assert.assertEquals(3, buffer.size());
    }

    @Test(expected = NullPointerException.class)
    public void testAdd_nullElement_throwsNullPointerException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add(null);
    }

    @Test
    public void testGet_nonEmptyBuffer_returnsHeadElementWithoutRemoving() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("A");
        buffer.add("B");

        Assert.assertEquals("A", buffer.get());
        Assert.assertEquals("A", buffer.get());
        Assert.assertEquals(2, buffer.size());
    }

    @Test(expected = BufferUnderflowException.class)
    public void testGet_emptyBuffer_throwsBufferUnderflowException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.get();
    }

    @Test
    public void testRemove_nonEmptyBuffer_removesAndReturnsHeadElement() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("A");
        buffer.add("B");

        Assert.assertEquals("A", buffer.remove());
        Assert.assertEquals(1, buffer.size());
        Assert.assertEquals("B", buffer.get());

        Assert.assertEquals("B", buffer.remove());
        Assert.assertEquals(0, buffer.size());
        Assert.assertTrue(buffer.isEmpty());
    }

    @Test(expected = BufferUnderflowException.class)
    public void testRemove_emptyBuffer_throwsBufferUnderflowException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.remove();
    }

    @Test
    public void testBufferWrapAround_addAndRemove_calculatesSizeCorrectly() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);
        buffer.add("A");
        buffer.add("B");
        Assert.assertEquals("A", buffer.remove()); // head = 1, tail = 2

        buffer.add("C"); // tail wraps to 0; tail < head
        Assert.assertEquals(2, buffer.size());
        Assert.assertEquals("B", buffer.get());

        Assert.assertEquals("B", buffer.remove());
        Assert.assertEquals("C", buffer.remove());
        Assert.assertTrue(buffer.isEmpty());
    }

    @Test
    public void testBufferResizingWhenWrapped_expandsAndPreservesOrder() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);
        buffer.add("A");
        buffer.add("B");
        Assert.assertEquals("A", buffer.remove()); // head=1, tail=2

        buffer.add("C"); // tail=0 (wrapped)
        buffer.add("D"); // triggers expansion while head > tail

        Assert.assertEquals(3, buffer.size());
        Assert.assertEquals("B", buffer.remove());
        Assert.assertEquals("C", buffer.remove());
        Assert.assertEquals("D", buffer.remove());
        Assert.assertTrue(buffer.isEmpty());
    }

    @Test
    public void testIterator_traversal_returnsElementsInOrder() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");

        Iterator it = buffer.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("B", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("C", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextBeyondEnd_throwsNoSuchElementException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        Iterator it = buffer.iterator();
        it.next();
    }

    @Test(expected = IllegalStateException.class)
    public void testIterator_removeBeforeNext_throwsIllegalStateException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("A");
        Iterator it = buffer.iterator();
        it.remove();
    }

    @Test(expected = IllegalStateException.class)
    public void testIterator_removeCalledTwiceConsecutively_throwsIllegalStateException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("A");
        buffer.add("B");
        Iterator it = buffer.iterator();
        it.next();
        it.remove();
        it.remove();
    }

    @Test
    public void testIterator_removeHeadElement_removesSuccessfully() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");

        Iterator it = buffer.iterator();
        Assert.assertEquals("A", it.next());
        it.remove();

        Assert.assertEquals(2, buffer.size());
        Assert.assertEquals("B", buffer.get());
        Assert.assertEquals("B", it.next());
    }

    @Test
    public void testIterator_removeMiddleElement_removesAndShiftsCorrectly() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");
        buffer.add("D");

        Iterator it = buffer.iterator();
        Assert.assertEquals("A", it.next());
        Assert.assertEquals("B", it.next());
        it.remove(); // Remove 'B'

        Assert.assertEquals(3, buffer.size());
        Assert.assertEquals("C", it.next());
        Assert.assertEquals("D", it.next());
        Assert.assertFalse(it.hasNext());

        Assert.assertEquals("A", buffer.remove());
        Assert.assertEquals("C", buffer.remove());
        Assert.assertEquals("D", buffer.remove());
    }

    @Test
    public void testIterator_removeLastElement_removesSuccessfully() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");

        Iterator it = buffer.iterator();
        Assert.assertEquals("A", it.next());
        Assert.assertEquals("B", it.next());
        Assert.assertEquals("C", it.next());
        it.remove(); // Remove 'C'

        Assert.assertEquals(2, buffer.size());
        Assert.assertFalse(it.hasNext());
        Assert.assertEquals("A", buffer.remove());
        Assert.assertEquals("B", buffer.remove());
        Assert.assertTrue(buffer.isEmpty());
    }

    @Test
    public void testIterator_removeWithWrappedBuffer_decrementsIndexCorrectly() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(3);
        buffer.add("A");
        buffer.add("B");
        buffer.remove(); // head=1
        buffer.add("C");
        buffer.add("D"); // buffer wrapped around

        Iterator it = buffer.iterator();
        Assert.assertEquals("B", it.next());
        Assert.assertEquals("C", it.next());
        it.remove(); // remove 'C'

        Assert.assertEquals(2, buffer.size());
        Assert.assertEquals("D", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testSerialization_emptyAndPopulatedBuffer_restoresCorrectly() throws Exception {
        UnboundedFifoBuffer original = new UnboundedFifoBuffer();
        original.add("Item1");
        original.add("Item2");
        original.add("Item3");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        UnboundedFifoBuffer deserialized = (UnboundedFifoBuffer) ois.readObject();
        ois.close();

        Assert.assertEquals(original.size(), deserialized.size());
        Assert.assertEquals("Item1", deserialized.remove());
        Assert.assertEquals("Item2", deserialized.remove());
        Assert.assertEquals("Item3", deserialized.remove());
        Assert.assertTrue(deserialized.isEmpty());
    }
}
