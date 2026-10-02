import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;

public class MultidimensionalCounterTest {

    private MultidimensionalCounter counter;

    @Before
    public void setUp() {
        // Example from javadoc: dimensions of size 2, 4, 3 -> totalSize = 24
        counter = new MultidimensionalCounter(2, 4, 3);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalInput_createsValidCounter() {
        MultidimensionalCounter c = new MultidimensionalCounter(2, 3, 4);
        assertEquals(3, c.getDimension());
        assertEquals(24, c.getSize());
        assertArrayEquals(new int[]{2, 3, 4}, c.getSizes());
    }

    @Test
    public void testConstructor_singleDimension_createsValidCounter() {
        MultidimensionalCounter c = new MultidimensionalCounter(5);
        assertEquals(1, c.getDimension());
        assertEquals(5, c.getSize());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_zeroSize_throwsException() {
        new MultidimensionalCounter(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_negativeSize_throwsException() {
        new MultidimensionalCounter(-1);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_zeroInMiddleDimension_throwsException() {
        new MultidimensionalCounter(2, 0, 3);
    }

    // ---------- getDimension ----------

    @Test
    public void testGetDimension_typicalCounter_returnsCorrectDimension() {
        assertEquals(3, counter.getDimension());
    }

    // ---------- getSize ----------

    @Test
    public void testGetSize_typicalCounter_returnsTotalSize() {
        assertEquals(24, counter.getSize());
    }

    // ---------- getSizes ----------

    @Test
    public void testGetSizes_typicalCounter_returnsSizesArray() {
        assertArrayEquals(new int[]{2, 4, 3}, counter.getSizes());
    }

    @Test
    public void testGetSizes_returnsCopyNotReference() {
        int[] sizes1 = counter.getSizes();
        sizes1[0] = 999;
        int[] sizes2 = counter.getSizes();
        assertEquals(2, sizes2[0]);
    }

    // ---------- getCounts(int index) ----------

    @Test
    public void testGetCounts_firstIndex_returnsZeros() {
        int[] result = counter.getCounts(0);
        assertArrayEquals(new int[]{0, 0, 0}, result);
    }

    @Test
    public void testGetCounts_indexOne_returnsCorrectCounts() {
        int[] result = counter.getCounts(1);
        assertArrayEquals(new int[]{0, 0, 1}, result);
    }

    @Test
    public void testGetCounts_indexTwelve_returnsCorrectCounts() {
        int[] result = counter.getCounts(12);
        assertArrayEquals(new int[]{1, 0, 0}, result);
    }

    @Test
    public void testGetCounts_lastIndex_returnsMaxCounts() {
        int[] result = counter.getCounts(23);
        assertArrayEquals(new int[]{1, 3, 2}, result);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCounts_negativeIndex_throwsException() {
        counter.getCounts(-1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCounts_indexEqualsTotalSize_throwsException() {
        counter.getCounts(24);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCounts_indexGreaterThanTotalSize_throwsException() {
        counter.getCounts(100);
    }

    // ---------- getCount(int... c) ----------

    @Test
    public void testGetCount_zeroIndices_returnsZero() {
        assertEquals(0, counter.getCount(0, 0, 0));
    }

    @Test
    public void testGetCount_indicesOneAt3rdDim_returnsOne() {
        assertEquals(1, counter.getCount(0, 0, 1));
    }

    @Test
    public void testGetCount_maxIndices_returnsLastIndex() {
        assertEquals(23, counter.getCount(1, 3, 2));
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetCount_wrongNumberOfIndices_throwsException() {
        counter.getCount(0, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCount_negativeIndexValue_throwsException() {
        counter.getCount(-1, 0, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCount_indexValueOutOfRange_throwsException() {
        counter.getCount(0, 0, 3);
    }

    @Test
    public void testGetCount_roundTripWithGetCounts_consistentResults() {
        for (int i = 0; i < counter.getSize(); i++) {
            int[] multi = counter.getCounts(i);
            int uni = counter.getCount(multi);
            assertEquals(i, uni);
        }
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsNonEmptyString() {
        String s = counter.toString();
        assertNotNull(s);
        assertFalse(s.isEmpty());
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_notNull_returnsValidIterator() {
        MultidimensionalCounter.Iterator it = counter.iterator();
        assertNotNull(it);
    }

    @Test
    public void testIterator_hasNext_initiallyTrueForNonEmptyCounter() {
        MultidimensionalCounter.Iterator it = counter.iterator();
        assertTrue(it.hasNext());
    }

    @Test
    public void testIterator_fullIteration_matchesTotalSize() {
        MultidimensionalCounter.Iterator it = counter.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(counter.getSize(), count);
    }

    @Test
    public void testIterator_next_returnsIncrementingCount() {
        MultidimensionalCounter.Iterator it = counter.iterator();
        assertEquals(Integer.valueOf(0), it.next());
        assertEquals(Integer.valueOf(1), it.next());
        assertEquals(Integer.valueOf(2), it.next());
    }

    @Test
    public void testIterator_getCount_returnsCurrentUnidimensionalCount() {
        MultidimensionalCounter.Iterator it = counter.iterator();
        it.next();
        assertEquals(0, it.getCount());
        it.next();
        assertEquals(1, it.getCount());
    }

    @Test
    public void testIterator_getCounts_returnsCorrectMultidimensionalArray() {
        MultidimensionalCounter.Iterator it = counter.iterator();
        it.next();
        assertArrayEquals(new int[]{0, 0, 0}, it.getCounts());
    }

    @Test
    public void testIterator_getCountsAfterSeveralNext_returnsExpectedArray() {
        MultidimensionalCounter.Iterator it = counter.iterator();
        for (int i = 0; i < 13; i++) {
            it.next();
        }
        // index 12 corresponds to (1,0,0)
        assertArrayEquals(new int[]{1, 0, 0}, it.getCounts());
    }

    @Test
    public void testIterator_getCountWithDimensionIndex_returnsCorrectValue() {
        MultidimensionalCounter.Iterator it = counter.iterator();
        it.next();
        assertEquals(0, it.getCount(0));
        assertEquals(0, it.getCount(1));
        assertEquals(0, it.getCount(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIterator_getCountWithInvalidDimensionIndex_throwsException() {
        MultidimensionalCounter.Iterator it = counter.iterator();
        it.next();
        it.getCount(10);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_remove_throwsUnsupportedOperationException() {
        MultidimensionalCounter.Iterator it = counter.iterator();
        it.remove();
    }

    @Test
    public void testIterator_hasNextFalse_afterFullIteration() {
        MultidimensionalCounter.Iterator it = counter.iterator();
        while (it.hasNext()) {
            it.next();
        }
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_singleDimensionCounter_iteratesCorrectly() {
        MultidimensionalCounter single = new MultidimensionalCounter(3);
        MultidimensionalCounter.Iterator it = single.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }
}
