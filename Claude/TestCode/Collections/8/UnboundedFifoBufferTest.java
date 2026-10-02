import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.collections.buffer.UnboundedFifoBuffer;
import org.apache.commons.collections.BufferUnderflowException;

public class UnboundedFifoBufferTest {

    private UnboundedFifoBuffer buffer;

    @Before
    public void setUp() {
        buffer = new UnboundedFifoBuffer();
    }

    // ---------------------- Constructor Tests ----------------------

    @Test
    public void testDefaultConstructor_createsEmptyBuffer() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer();
        assertTrue(buf.isEmpty());
        assertEquals(0, buf.size());
    }

    @Test
    public void testConstructorWithSize_positiveSize_createsEmptyBuffer() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer(5);
        assertTrue(buf.isEmpty());
        assertEquals(0, buf.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithSize_zeroSize_throwsIllegalArgumentException() {
        new UnboundedFifoBuffer(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithSize_negativeSize_throwsIllegalArgumentException() {
        new UnboundedFifoBuffer(-1);
    }

    // ---------------------- add() Tests ----------------------

    @Test(expected = NullPointerException.class)
    public void testAdd_nullObject_throwsNullPointerException() {
        buffer.add(null);
    }

    @Test
    public void testAdd_singleElement_increasesSize() {
        assertTrue(buffer.add("A"));
        assertEquals(1, buffer.size());
        assertFalse(buffer.isEmpty());
    }

    @Test
    public void testAdd_multipleElements_maintainsOrder() {
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");
        assertEquals(3, buffer.size());
        assertEquals("A", buffer.get());
    }

    @Test
    public void testAdd_causesResize_growsBufferCorrectly() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer(2);
        buf.add("A");
        buf.add("B");
        // this addition should trigger a resize since buffer.length = 3
        buf.add("C");
        assertEquals(3, buf.size());
        assertEquals("A", buf.remove());
        assertEquals("B", buf.remove());
        assertEquals("C", buf.remove());
    }

    @Test
    public void testAdd_withWrapAround_sizeCalculatedCorrectly() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer(2); // buffer length = 3
        buf.add("A");
        buf.add("B");
        buf.remove(); // removes A, head moves to 1
        buf.add("C"); // tail wraps around to 0, head=1, tail=0 -> tail < head
        assertEquals(2, buf.size());
        assertEquals("B", buf.get());
    }

    // ---------------------- get() Tests ----------------------

    @Test
    public void testGet_nonEmptyBuffer_returnsFirstElement() {
        buffer.add("A");
        buffer.add("B");
        assertEquals("A", buffer.get());
        // get should not remove the element
        assertEquals(2, buffer.size());
    }

    @Test(expected = BufferUnderflowException.class)
    public void testGet_emptyBuffer_throwsBufferUnderflowException() {
        buffer.get();
    }

    // ---------------------- remove() Tests ----------------------

    @Test
    public void testRemove_nonEmptyBuffer_removesAndReturnsFirstElement() {
        buffer.add("A");
        buffer.add("B");
        Object removed = buffer.remove();
        assertEquals("A", removed);
        assertEquals(1, buffer.size());
        assertEquals("B", buffer.get());
    }

    @Test(expected = BufferUnderflowException.class)
    public void testRemove_emptyBuffer_throwsBufferUnderflowException() {
        buffer.remove();
    }

    @Test
    public void testRemove_allElements_bufferBecomesEmpty() {
        buffer.add("A");
        buffer.add("B");
        buffer.remove();
        buffer.remove();
        assertTrue(buffer.isEmpty());
    }

    // ---------------------- size() and isEmpty() Tests ----------------------

    @Test
    public void testSize_emptyBuffer_returnsZero() {
        assertEquals(0, buffer.size());
    }

    @Test
    public void testSize_afterAddsAndRemoves_returnsCorrectSize() {
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");
        buffer.remove();
        assertEquals(2, buffer.size());
    }

    @Test
    public void testIsEmpty_emptyBuffer_returnsTrue() {
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testIsEmpty_nonEmptyBuffer_returnsFalse() {
        buffer.add("A");
        assertFalse(buffer.isEmpty());
    }

    // ---------------------- iterator() Tests ----------------------

    @Test
    public void testIterator_emptyBuffer_hasNextReturnsFalse() {
        Iterator it = buffer.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_nonEmptyBuffer_iteratesInOrder() {
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");

        Iterator it = buffer.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertTrue(it.hasNext());
        assertEquals("B", it.next());
        assertTrue(it.hasNext());
        assertEquals("C", it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNext_noMoreElements_throwsNoSuchElementException() {
        buffer.add("A");
        Iterator it = buffer.iterator();
        it.next();
        it.next(); // should throw
    }

    @Test(expected = IllegalStateException.class)
    public void testIteratorRemove_beforeNext_throwsIllegalStateException() {
        buffer.add("A");
        Iterator it = buffer.iterator();
        it.remove();
    }

    @Test
    public void testIteratorRemove_firstElement_removesFromHead() {
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");

        Iterator it = buffer.iterator();
        it.next(); // A - this is head
        it.remove();

        assertEquals(2, buffer.size());
        assertEquals("B", buffer.get());
    }

    @Test
    public void testIteratorRemove_middleElement_shiftsSubsequentElements() {
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");

        Iterator it = buffer.iterator();
        it.next(); // A
        it.next(); // B
        it.remove(); // remove B (middle element)

        assertEquals(2, buffer.size());

        Iterator checkIt = buffer.iterator();
        assertEquals("A", checkIt.next());
        assertEquals("C", checkIt.next());
        assertFalse(checkIt.hasNext());
    }

    @Test
    public void testIteratorRemove_lastElement_removesCorrectly() {
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");

        Iterator it = buffer.iterator();
        it.next(); // A
        it.next(); // B
        it.next(); // C
        it.remove(); // remove C (last element - not head, requires shifting loop with zero iterations)

        assertEquals(2, buffer.size());
        Iterator checkIt = buffer.iterator();
        assertEquals("A", checkIt.next());
        assertEquals("B", checkIt.next());
        assertFalse(checkIt.hasNext());
    }

    @Test
    public void testIteratorRemove_withWrapAround_shiftsCorrectly() {
        UnboundedFifoBuffer buf = new UnboundedFifoBuffer(3); // buffer length = 4
        buf.add("A");
        buf.add("B");
        buf.add("C");
        buf.remove(); // head moves forward
        buf.add("D"); // causes tail to wrap around

        Iterator it = buf.iterator();
        it.next(); // B
        it.next(); // C
        it.remove(); // remove C (middle, with wrap around in underlying array)

        assertEquals(2, buf.size());
        Iterator checkIt = buf.iterator();
        assertEquals("B", checkIt.next());
        assertEquals("D", checkIt.next());
        assertFalse(checkIt.hasNext());
    }

    // ---------------------- Serialization Tests ----------------------

    @Test
    public void testSerialization_writeAndReadObject_restoresBufferCorrectly() throws IOException, ClassNotFoundException {
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(buffer);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        UnboundedFifoBuffer restored = (UnboundedFifoBuffer) ois.readObject();
        ois.close();

        assertEquals(3, restored.size());
        assertEquals("A", restored.remove());
        assertEquals("B", restored.remove());
        assertEquals("C", restored.remove());
    }

    @Test
    public void testSerialization_emptyBuffer_restoresEmptyBuffer() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(buffer);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        UnboundedFifoBuffer restored = (UnboundedFifoBuffer) ois.readObject();
        ois.close();

        assertTrue(restored.isEmpty());
        assertEquals(0, restored.size());
    }
}
