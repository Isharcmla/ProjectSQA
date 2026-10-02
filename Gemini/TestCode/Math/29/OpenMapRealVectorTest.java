package org.apache.commons.math3.linear;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class OpenMapRealVectorTest {

    private static final double EPS = 1.0e-12;

    @Test
    public void testDefaultConstructor_dimensionZero() {
        OpenMapRealVector v = new OpenMapRealVector();
        Assert.assertEquals(0, v.getDimension());
    }

    @Test
    public void testDimensionConstructor_allZeroes() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        Assert.assertEquals(5, v.getDimension());
        for (int i = 0; i < 5; i++) {
            Assert.assertEquals(0.0, v.getEntry(i), EPS);
        }
    }

    @Test
    public void testDimensionAndEpsilonConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(5, 1.0e-5);
        Assert.assertEquals(5, v.getDimension());
        Assert.assertTrue(v.isDefaultValue(1.0e-6));
        Assert.assertFalse(v.isDefaultValue(1.0e-4));
    }

    @Test
    public void testProtectedResizeConstructor() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(v1, 2);
        Assert.assertEquals(5, v2.getDimension());
        Assert.assertEquals(1.0, v2.getEntry(0), EPS);
        Assert.assertEquals(0.0, v2.getEntry(1), EPS);
        Assert.assertEquals(2.0, v2.getEntry(2), EPS);
        Assert.assertEquals(0.0, v2.getEntry(3), EPS);
        Assert.assertEquals(0.0, v2.getEntry(4), EPS);
    }

    @Test
    public void testDimensionExpectedSizeConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(10, 3);
        Assert.assertEquals(10, v.getDimension());
        v.setEntry(0, 1.0);
        v.setEntry(5, 2.0);
        Assert.assertEquals(1.0, v.getEntry(0), EPS);
        Assert.assertEquals(2.0, v.getEntry(5), EPS);
    }

    @Test
    public void testDimensionExpectedSizeEpsilonConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(10, 3, 1.0e-4);
        Assert.assertEquals(10, v.getDimension());
        v.setEntry(1, 1.0e-5); // within epsilon, should not be stored
        Assert.assertEquals(0.0, v.getEntry(1), EPS);
    }

    @Test
    public void testDoubleArrayConstructor() {
        double[] data = new double[]{0.0, 1.5, 0.0, 3.2};
        OpenMapRealVector v = new OpenMapRealVector(data);
        Assert.assertEquals(4, v.getDimension());
        Assert.assertEquals(0.0, v.getEntry(0), EPS);
        Assert.assertEquals(1.5, v.getEntry(1), EPS);
        Assert.assertEquals(0.0, v.getEntry(2), EPS);
        Assert.assertEquals(3.2, v.getEntry(3), EPS);
    }

    @Test
    public void testDoubleArrayWithEpsilonConstructor() {
        double[] data = new double[]{1.0e-6, 2.0};
        OpenMapRealVector v = new OpenMapRealVector(data, 1.0e-4);
        Assert.assertEquals(2, v.getDimension());
        Assert.assertEquals(0.0, v.getEntry(0), EPS);
        Assert.assertEquals(2.0, v.getEntry(1), EPS);
    }

    @Test
    public void testDoubleObjectArrayConstructor() {
        Double[] data = new Double[]{0.0, 2.5, 0.0};
        OpenMapRealVector v = new OpenMapRealVector(data);
        Assert.assertEquals(3, v.getDimension());
        Assert.assertEquals(2.5, v.getEntry(1), EPS);
    }

    @Test
    public void testDoubleObjectArrayWithEpsilonConstructor() {
        Double[] data = new Double[]{1.0e-6, 4.0};
        OpenMapRealVector v = new OpenMapRealVector(data, 1.0e-4);
        Assert.assertEquals(2, v.getDimension());
        Assert.assertEquals(0.0, v.getEntry(0), EPS);
        Assert.assertEquals(4.0, v.getEntry(1), EPS);
    }

    @Test
    public void testCopyConstructor_OpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(v1);
        Assert.assertEquals(v1.getDimension(), v2.getDimension());
        Assert.assertEquals(v1.getEntry(0), v2.getEntry(0), EPS);
        Assert.assertEquals(v1.getEntry(2), v2.getEntry(2), EPS);
    }

    @Test
    public void testGenericRealVectorConstructor() {
        RealVector rv = new ArrayRealVector(new double[]{0.0, 5.0, 0.0});
        OpenMapRealVector v = new OpenMapRealVector(rv);
        Assert.assertEquals(3, v.getDimension());
        Assert.assertEquals(5.0, v.getEntry(1), EPS);
    }

    @Test
    public void testAdd_OpenMapRealVector_bothBranches() {
        // Test case 1: this is larger in entry size
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0});
        OpenMapRealVector sum1 = v1.add(v2);
        Assert.assertEquals(1.0, sum1.getEntry(0), EPS);
        Assert.assertEquals(7.0, sum1.getEntry(1), EPS);
        Assert.assertEquals(3.0, sum1.getEntry(2), EPS);

        // Test case 2: v is larger in entry size
        OpenMapRealVector sum2 = v2.add(v1);
        Assert.assertEquals(1.0, sum2.getEntry(0), EPS);
        Assert.assertEquals(7.0, sum2.getEntry(1), EPS);
        Assert.assertEquals(3.0, sum2.getEntry(2), EPS);

        // Non-overlapping entries
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 0.0, 0.0});
        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{0.0, 2.0, 0.0});
        OpenMapRealVector sum3 = v3.add(v4);
        Assert.assertEquals(1.0, sum3.getEntry(0), EPS);
        Assert.assertEquals(2.0, sum3.getEntry(1), EPS);
    }

    @Test
    public void testAdd_GenericRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{0.0, 2.0, 1.0});
        RealVector sum = v1.add(v2);
        Assert.assertEquals(1.0, sum.getEntry(0), EPS);
        Assert.assertEquals(2.0, sum.getEntry(1), EPS);
        Assert.assertEquals(4.0, sum.getEntry(2), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAdd_DimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        OpenMapRealVector v2 = new OpenMapRealVector(4);
        v1.add(v2);
    }

    @Test
    public void testAppend_OpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 2.0});
        OpenMapRealVector res = v1.append(v2);
        Assert.assertEquals(4, res.getDimension());
        Assert.assertEquals(1.0, res.getEntry(0), EPS);
        Assert.assertEquals(0.0, res.getEntry(1), EPS);
        Assert.assertEquals(0.0, res.getEntry(2), EPS);
        Assert.assertEquals(2.0, res.getEntry(3), EPS);
    }

    @Test
    public void testAppend_GenericRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0});
        RealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector res = v1.append(v2);
        Assert.assertEquals(4, res.getDimension());
        Assert.assertEquals(1.0, res.getEntry(0), EPS);
        Assert.assertEquals(0.0, res.getEntry(1), EPS);
        Assert.assertEquals(3.0, res.getEntry(2), EPS);
        Assert.assertEquals(4.0, res.getEntry(3), EPS);

        // Instanceof OpenMapRealVector path inside append(RealVector)
        RealVector v3 = new OpenMapRealVector(new double[]{5.0});
        OpenMapRealVector res2 = v1.append(v3);
        Assert.assertEquals(3, res2.getDimension());
        Assert.assertEquals(5.0, res2.getEntry(2), EPS);
    }

    @Test
    public void testAppend_Double() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0});
        OpenMapRealVector res = v.append(7.5);
        Assert.assertEquals(3, res.getDimension());
        Assert.assertEquals(1.0, res.getEntry(0), EPS);
        Assert.assertEquals(0.0, res.getEntry(1), EPS);
        Assert.assertEquals(7.5, res.getEntry(2), EPS);
    }

    @Test
    public void testCopy() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector copy = v.copy();
        Assert.assertNotSame(v, copy);
        Assert.assertEquals(v, copy);
    }

    @Test
    public void testDotProduct_OpenMapRealVector_bothBranches() {
        // this is smaller
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 0.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{2.0, 3.0, 4.0});
        Assert.assertEquals(2.0, v1.dotProduct(v2), EPS);

        // this is larger
        Assert.assertEquals(2.0, v2.dotProduct(v1), EPS);
    }

    @Test
    public void testDotProduct_GenericRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 0.0});
        RealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0, 5.0});
        Assert.assertEquals(11.0, v1.dotProduct(v2), EPS);

        RealVector v3 = new OpenMapRealVector(new double[]{3.0, 4.0, 5.0});
        Assert.assertEquals(11.0, v1.dotProduct(v3), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testDotProduct_DimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(2);
        OpenMapRealVector v2 = new OpenMapRealVector(3);
        v1.dotProduct(v2);
    }

    @Test
    public void testEbeDivide() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{4.0, 0.0, 9.0});
        RealVector v2 = new ArrayRealVector(new double[]{2.0, 2.0, 3.0});
        OpenMapRealVector res = v1.ebeDivide(v2);
        Assert.assertEquals(2.0, res.getEntry(0), EPS);
        Assert.assertEquals(0.0, res.getEntry(1), EPS);
        Assert.assertEquals(3.0, res.getEntry(2), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_DimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(2);
        RealVector v2 = new ArrayRealVector(3);
        v1.ebeDivide(v2);
    }

    @Test
    public void testEbeMultiply() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{4.0, 0.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{2.0, 5.0, 3.0});
        OpenMapRealVector res = v1.ebeMultiply(v2);
        Assert.assertEquals(8.0, res.getEntry(0), EPS);
        Assert.assertEquals(0.0, res.getEntry(1), EPS);
        Assert.assertEquals(9.0, res.getEntry(2), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_DimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(2);
        RealVector v2 = new ArrayRealVector(3);
        v1.ebeMultiply(v2);
    }

    @Test
    public void testGetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0, 4.0, 0.0, 6.0});
        OpenMapRealVector sub = v.getSubVector(1, 4);
        Assert.assertEquals(4, sub.getDimension());
        Assert.assertEquals(0.0, sub.getEntry(0), EPS);
        Assert.assertEquals(3.0, sub.getEntry(1), EPS);
        Assert.assertEquals(4.0, sub.getEntry(2), EPS);
        Assert.assertEquals(0.0, sub.getEntry(3), EPS);
    }

    @Test(expected = NotPositiveException.class)
    public void testGetSubVector_NegativeLength() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.getSubVector(1, -1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_InvalidIndex() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.getSubVector(6, 1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_IndexPlusLengthOutOfBounds() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.getSubVector(3, 3);
    }

    @Test
    public void testGetDistance_OpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 0.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 2.0, 4.0});
        // distance: sqrt((1-0)^2 + (2-2)^2 + (0-4)^2) = sqrt(1 + 16) = sqrt(17)
        Assert.assertEquals(Math.sqrt(17.0), v1.getDistance(v2), EPS);
    }

    @Test
    public void testGetDistance_GenericRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 0.0});
        RealVector v2 = new ArrayRealVector(new double[]{1.0, 5.0, 0.0});
        Assert.assertEquals(3.0, v1.getDistance(v2), EPS);

        RealVector v3 = new OpenMapRealVector(new double[]{1.0, 5.0, 0.0});
        Assert.assertEquals(3.0, v1.getDistance(v3), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetDistance_DimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(2);
        RealVector v2 = new ArrayRealVector(3);
        v1.getDistance(v2);
    }

    @Test
    public void testGetL1Distance_OpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, -2.0, 0.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, -2.0, 4.0});
        // L1: |1 - 0| + |-2 - (-2)| + |0 - 4| = 1 + 0 + 4 = 5
        Assert.assertEquals(5.0, v1.getL1Distance(v2), EPS);
    }

    @Test
    public void testGetL1Distance_GenericRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0});
        RealVector v2 = new ArrayRealVector(new double[]{3.0, -4.0});
        Assert.assertEquals(6.0, v1.getL1Distance(v2), EPS);

        RealVector v3 = new OpenMapRealVector(new double[]{3.0, -4.0});
        Assert.assertEquals(6.0, v1.getL1Distance(v3), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetL1Distance_DimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(2);
        RealVector v2 = new ArrayRealVector(3);
        v1.getL1Distance(v2);
    }

    @Test
    public void testGetLInfDistance_OpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 5.0, 1.0});
        // deltas: |1-0|=1, |0-5|=5, |2-1|=1 -> max is 5
        Assert.assertEquals(5.0, v1.getLInfDistance((RealVector) v2), EPS);

        // Case where v2 has higher element not present in v1
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{0.0, 0.0});
        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{0.0, 10.0});
        Assert.assertEquals(10.0, v3.getLInfDistance((RealVector) v4), EPS);

        // Case where v2 element not in v1 is smaller than current max
        OpenMapRealVector v5 = new OpenMapRealVector(new double[]{10.0, 0.0});
        OpenMapRealVector v6 = new OpenMapRealVector(new double[]{0.0, 2.0});
        Assert.assertEquals(10.0, v5.getLInfDistance((RealVector) v6), EPS);
    }

    @Test
    public void testGetLInfDistance_GenericRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 5.0});
        RealVector v2 = new ArrayRealVector(new double[]{1.0, 1.0});
        Assert.assertEquals(4.0, v1.getLInfDistance(v2), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetLInfDistance_DimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(2);
        RealVector v2 = new ArrayRealVector(3);
        v1.getLInfDistance(v2);
    }

    @Test
    public void testGetEntry_and_SetEntry() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 5.0);
        Assert.assertEquals(5.0, v.getEntry(1), EPS);
        Assert.assertEquals(0.0, v.getEntry(0), EPS);

        // Set to default value (zero), should remove entry
        v.setEntry(1, 0.0);
        Assert.assertEquals(0.0, v.getEntry(1), EPS);

        // Set entry already default to default (no-op)
        v.setEntry(0, 0.0);
        Assert.assertEquals(0.0, v.getEntry(0), EPS);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_OutOfBounds() {
        OpenMapRealVector v = new OpenMapRealVector(2);
        v.getEntry(2);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_OutOfBounds() {
        OpenMapRealVector v = new OpenMapRealVector(2);
        v.setEntry(-1, 1.0);
    }

    @Test
    public void testIsInfinite_and_IsNaN() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        Assert.assertFalse(v.isInfinite());
        Assert.assertFalse(v.isNaN());

        v.setEntry(0, Double.POSITIVE_INFINITY);
        Assert.assertTrue(v.isInfinite());
        Assert.assertFalse(v.isNaN());

        v.setEntry(1, Double.NaN);
        Assert.assertFalse(v.isInfinite()); // NaN in entries returns false for isInfinite
        Assert.assertTrue(v.isNaN());
    }

    @Test
    public void testMapAdd_and_MapAddToSelf() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, -1.0});
        OpenMapRealVector added = v.mapAdd(2.0);
        Assert.assertEquals(3.0, added.getEntry(0), EPS);
        Assert.assertEquals(2.0, added.getEntry(1), EPS);
        Assert.assertEquals(1.0, added.getEntry(2), EPS);
        // Ensure original is unchanged
        Assert.assertEquals(1.0, v.getEntry(0), EPS);

        v.mapAddToSelf(2.0);
        Assert.assertEquals(3.0, v.getEntry(0), EPS);
        Assert.assertEquals(2.0, v.getEntry(1), EPS);
        Assert.assertEquals(1.0, v.getEntry(2), EPS);
    }

    @Test
    public void testProjection() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{0.0, 1.0, 0.0});
        RealVector proj = v1.projection(v2);
        Assert.assertEquals(0.0, proj.getEntry(0), EPS);
        Assert.assertEquals(2.0, proj.getEntry(1), EPS);
        Assert.assertEquals(0.0, proj.getEntry(2), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testProjection_DimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(2);
        RealVector v2 = new ArrayRealVector(3);
        v1.projection(v2);
    }

    @Test
    public void testSetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        RealVector sub = new ArrayRealVector(new double[]{2.0, 3.0});
        v.setSubVector(1, sub);
        Assert.assertEquals(0.0, v.getEntry(0), EPS);
        Assert.assertEquals(2.0, v.getEntry(1), EPS);
        Assert.assertEquals(3.0, v.getEntry(2), EPS);
        Assert.assertEquals(0.0, v.getEntry(3), EPS);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_OutOfBounds() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        RealVector sub = new ArrayRealVector(new double[]{1.0, 2.0});
        v.setSubVector(2, sub);
    }

    @Test
    public void testSet() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.set(5.0);
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(5.0, v.getEntry(i), EPS);
        }
    }

    @Test
    public void testSubtract_OpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{5.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{2.0, 4.0, 0.0});
        OpenMapRealVector diff = v1.subtract(v2);
        Assert.assertEquals(3.0, diff.getEntry(0), EPS);
        Assert.assertEquals(-4.0, diff.getEntry(1), EPS);
        Assert.assertEquals(3.0, diff.getEntry(2), EPS);
    }

    @Test
    public void testSubtract_GenericRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{5.0, 0.0});
        RealVector v2 = new ArrayRealVector(new double[]{2.0, 4.0});
        RealVector diff = v1.subtract(v2);
        Assert.assertEquals(3.0, diff.getEntry(0), EPS);
        Assert.assertEquals(-4.0, diff.getEntry(1), EPS);

        RealVector v3 = new OpenMapRealVector(new double[]{2.0, 4.0});
        RealVector diff2 = v1.subtract(v3);
        Assert.assertEquals(3.0, diff2.getEntry(0), EPS);
        Assert.assertEquals(-4.0, diff2.getEntry(1), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSubtract_DimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(2);
        RealVector v2 = new ArrayRealVector(3);
        v1.subtract(v2);
    }

    @Test
    public void testUnitVector_and_Unitize() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 3.0, 4.0});
        OpenMapRealVector unit = v.unitVector();
        Assert.assertEquals(1.0, unit.getNorm(), EPS);
        Assert.assertEquals(0.0, unit.getEntry(0), EPS);
        Assert.assertEquals(0.6, unit.getEntry(1), EPS);
        Assert.assertEquals(0.8, unit.getEntry(2), EPS);

        // Ensure original vector unitize
        v.unitize();
        Assert.assertEquals(1.0, v.getNorm(), EPS);
        Assert.assertEquals(0.6, v.getEntry(1), EPS);
    }

    @Test(expected = MathArithmeticException.class)
    public void testUnitize_ZeroNorm() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.unitize();
    }

    @Test
    public void testToArray() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 2.0, 0.0, 4.0});
        double[] array = v.toArray();
        Assert.assertArrayEquals(new double[]{0.0, 2.0, 0.0, 4.0}, array, EPS);
    }

    @Test
    public void testHashCode() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        Assert.assertEquals(v1.hashCode(), v2.hashCode());
    }

    @Test
    public void testEquals() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 0.0, 4.0});
        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{1.0, 0.0});
        OpenMapRealVector v5 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0}, 1.0e-5);
        OpenMapRealVector v6 = new OpenMapRealVector(new double[]{0.0, 0.0, 3.0});

        Assert.assertTrue(v1.equals(v1));
        Assert.assertTrue(v1.equals(v2));
        Assert.assertFalse(v1.equals(null));
        Assert.assertFalse(v1.equals("not a vector"));
        Assert.assertFalse(v1.equals(v3));
        Assert.assertFalse(v1.equals(v4));
        Assert.assertFalse(v1.equals(v5));
        Assert.assertFalse(v1.equals(v6));
        Assert.assertFalse(v6.equals(v1));
    }

    @Test
    public void testGetSparsity() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0, 0.0});
        Assert.assertEquals(0.5, v.getSparsity(), EPS);
    }

    @Test
    public void testSparseIterator() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 10.0, 0.0, 20.0});
        Iterator<RealVector.Entry> iter = v.sparseIterator();

        int count = 0;
        while (iter.hasNext()) {
            RealVector.Entry entry = iter.next();
            if (entry.getIndex() == 1) {
                Assert.assertEquals(10.0, entry.getValue(), EPS);
                entry.setValue(15.0);
            } else if (entry.getIndex() == 3) {
                Assert.assertEquals(20.0, entry.getValue(), EPS);
            }
            count++;
        }
        Assert.assertEquals(2, count);
        Assert.assertEquals(15.0, v.getEntry(1), EPS);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIterator_RemoveUnsupported() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        Iterator<RealVector.Entry> iter = v.sparseIterator();
        iter.remove();
    }
}
