package org.apache.commons.math.util;

import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for {@link MultidimensionalCounter}.
 */
public class MultidimensionalCounterTest {

    @Test
    public void testConstructor_validMultiDimension_shouldInitializeCorrectly() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 4, 3);
        Assert.assertEquals(3, counter.getDimension());
        Assert.assertEquals(24, counter.getSize());
        Assert.assertArrayEquals(new int[]{2, 4, 3}, counter.getSizes());
    }

    @Test
    public void testConstructor_singleDimension_shouldInitializeCorrectly() {
        MultidimensionalCounter counter = new MultidimensionalCounter(5);
        Assert.assertEquals(1, counter.getDimension());
        Assert.assertEquals(5, counter.getSize());
        Assert.assertArrayEquals(new int[]{5}, counter.getSizes());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_zeroDimensionSize_shouldThrowException() {
        new MultidimensionalCounter(2, 0, 3);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_negativeDimensionSize_shouldThrowException() {
        new MultidimensionalCounter(2, -4, 3);
    }

    @Test
    public void testGetSizes_returnedArrayIsDefensiveCopy() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        int[] sizes = counter.getSizes();
        sizes[0] = 99;
        Assert.assertEquals(2, counter.getSizes()[0]);
    }

    @Test
    public void testGetCount_multidimensionalToUniDimensional_validIndices() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 4, 3);
        Assert.assertEquals(0, counter.getCount(0, 0, 0));
        Assert.assertEquals(1, counter.getCount(0, 0, 1));
        Assert.assertEquals(2, counter.getCount(0, 0, 2));
        Assert.assertEquals(3, counter.getCount(0, 1, 0));
        Assert.assertEquals(12, counter.getCount(1, 0, 0));
        Assert.assertEquals(23, counter.getCount(1, 3, 2));
    }

    @Test
    public void testGetCount_singleDimension_validIndices() {
        MultidimensionalCounter counter = new MultidimensionalCounter(4);
        Assert.assertEquals(0, counter.getCount(0));
        Assert.assertEquals(1, counter.getCount(1));
        Assert.assertEquals(2, counter.getCount(2));
        Assert.assertEquals(3, counter.getCount(3));
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetCount_dimensionMismatchTooFew_shouldThrowException() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 4, 3);
        counter.getCount(0, 1);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetCount_dimensionMismatchTooMany_shouldThrowException() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 4, 3);
        counter.getCount(0, 1, 2, 3);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCount_negativeIndex_shouldThrowException() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 4, 3);
        counter.getCount(0, -1, 1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCount_indexEqualsSize_shouldThrowException() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 4, 3);
        counter.getCount(0, 4, 1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCount_indexGreaterThanSize_shouldThrowException() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 4, 3);
        counter.getCount(2, 1, 1);
    }

    @Test
    public void testGetCounts_uniDimensionalToMultidimensional_validIndex() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 4, 3);
        Assert.assertArrayEquals(new int[]{0, 0, 0}, counter.getCounts(0));
        Assert.assertArrayEquals(new int[]{0, 0, 1}, counter.getCounts(1));
        Assert.assertArrayEquals(new int[]{0, 0, 2}, counter.getCounts(2));
        Assert.assertArrayEquals(new int[]{0, 1, 0}, counter.getCounts(3));
        Assert.assertArrayEquals(new int[]{1, 0, 0}, counter.getCounts(12));
        Assert.assertArrayEquals(new int[]{1, 3, 2}, counter.getCounts(23));
    }

    @Test
    public void testGetCounts_singleDimension_validIndex() {
        MultidimensionalCounter counter = new MultidimensionalCounter(5);
        for (int i = 0; i < 5; i++) {
            Assert.assertArrayEquals(new int[]{i}, counter.getCounts(i));
        }
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCounts_negativeIndex_shouldThrowException() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 4, 3);
        counter.getCounts(-1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCounts_indexEqualToTotalSize_shouldThrowException() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 4, 3);
        counter.getCounts(24);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCounts_indexGreaterThanTotalSize_shouldThrowException() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 4, 3);
        counter.getCounts(25);
    }

    @Test
    public void testBidirectionalConversionConsistency() {
        MultidimensionalCounter counter = new MultidimensionalCounter(3, 2, 4);
        int totalSize = counter.getSize();
        for (int i = 0; i < totalSize; i++) {
            int[] multDim = counter.getCounts(i);
            int uniDim = counter.getCount(multDim);
            Assert.assertEquals(i, uniDim);
        }
    }

    @Test
    public void testIterator_fullIterationAndStateAccessors() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        MultidimensionalCounter.Iterator iter = counter.iterator();

        Assert.assertEquals(-1, iter.getCount());
        int expectedCount = 0;

        while (iter.hasNext()) {
            Integer nextCount = iter.next();
            Assert.assertEquals(Integer.valueOf(expectedCount), nextCount);
            Assert.assertEquals(expectedCount, iter.getCount());

            int[] counts = iter.getCounts();
            Assert.assertEquals(counter.getCounts(expectedCount)[0], counts[0]);
            Assert.assertEquals(counter.getCounts(expectedCount)[1], counts[1]);

            Assert.assertEquals(counts[0], iter.getCount(0));
            Assert.assertEquals(counts[1], iter.getCount(1));

            expectedCount++;
        }

        Assert.assertEquals(counter.getSize(), expectedCount);
        Assert.assertFalse(iter.hasNext());
    }

    @Test
    public void testIterator_getCountsDefensiveCopy() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        MultidimensionalCounter.Iterator iter = counter.iterator();
        iter.next();

        int[] counts = iter.getCounts();
        counts[0] = 999;
        Assert.assertNotEquals(999, iter.getCount(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIterator_getCountDimensionNegative_shouldThrowException() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        MultidimensionalCounter.Iterator iter = counter.iterator();
        iter.next();
        iter.getCount(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIterator_getCountDimensionTooLarge_shouldThrowException() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        MultidimensionalCounter.Iterator iter = counter.iterator();
        iter.next();
        iter.getCount(2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_remove_shouldThrowException() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        MultidimensionalCounter.Iterator iter = counter.iterator();
        iter.remove();
    }

    @Test
    public void testToString_singleDimension() {
        MultidimensionalCounter counter = new MultidimensionalCounter(3);
        Assert.assertEquals("[0]", counter.toString());
    }

    @Test(expected = DimensionMismatchException.class)
    public void testToString_multiDimension_shouldThrowDimensionMismatchDueToImplementation() {
        MultidimensionalCounter counter = new MultidimensionalCounter(2, 3);
        counter.toString();
    }
}
