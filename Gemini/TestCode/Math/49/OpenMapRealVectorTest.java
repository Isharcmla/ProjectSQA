package org.apache.commons.math.linear;

import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.MathArithmeticException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class OpenMapRealVectorTest {

    private static final double EPSILON = 1.0e-12;

    @Test
    public void testDefaultConstructor_zeroDimension() {
        OpenMapRealVector v = new OpenMapRealVector();
        Assert.assertEquals(0, v.getDimension());
        Assert.assertEquals(0, v.getData().length);
    }

    @Test
    public void testDimensionConstructor_allZeroes() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        Assert.assertEquals(5, v.getDimension());
        for (int i = 0; i < 5; i++) {
            Assert.assertEquals(0.0, v.getEntry(i), EPSILON);
        }
    }

    @Test
    public void testDimensionAndEpsilonConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(3, 1.0e-5);
        Assert.assertEquals(3, v.getDimension());
        Assert.assertEquals(0.0, v.getEntry(0), 1.0e-5);
    }

    @Test
    public void testDimensionAndExpectedSizeConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(10, 3);
        Assert.assertEquals(10, v.getDimension());
        v.setEntry(2, 5.0);
        Assert.assertEquals(5.0, v.getEntry(2), EPSILON);
    }

    @Test
    public void testDimensionExpectedSizeAndEpsilonConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(10, 3, 1.0e-6);
        Assert.assertEquals(10, v.getDimension());
        v.setEntry(1, 4.0);
        Assert.assertEquals(4.0, v.getEntry(1), 1.0e-6);
    }

    @Test
    public void testDoubleArrayConstructor() {
        double[] data = new double[]{0.0, 1.0, 0.0, 2.5, 0.0};
        OpenMapRealVector v = new OpenMapRealVector(data);
        Assert.assertEquals(5, v.getDimension());
        Assert.assertEquals(1.0, v.getEntry(1), EPSILON);
        Assert.assertEquals(2.5, v.getEntry(3), EPSILON);
        Assert.assertEquals(0.0, v.getEntry(0), EPSILON);
    }

    @Test
    public void testDoubleArrayAndEpsilonConstructor() {
        double[] data = new double[]{1.0e-4, 2.0, 1.0e-6};
        OpenMapRealVector v = new OpenMapRealVector(data, 1.0e-3);
        Assert.assertEquals(3, v.getDimension());
        Assert.assertEquals(0.0, v.getEntry(0), EPSILON);
        Assert.assertEquals(2.0, v.getEntry(1), EPSILON);
        Assert.assertEquals(0.0, v.getEntry(2), EPSILON);
    }

    @Test
    public void testDoubleObjectArrayConstructor() {
        Double[] data = new Double[]{0.0, 3.0, 0.0, 4.0};
        OpenMapRealVector v = new OpenMapRealVector(data);
        Assert.assertEquals(4, v.getDimension());
        Assert.assertEquals(3.0, v.getEntry(1), EPSILON);
        Assert.assertEquals(4.0, v.getEntry(3), EPSILON);
    }

    @Test
    public void testDoubleObjectArrayAndEpsilonConstructor() {
        Double[] data = new Double[]{0.01, 5.0};
        OpenMapRealVector v = new OpenMapRealVector(data, 0.1);
        Assert.assertEquals(2, v.getDimension());
        Assert.assertEquals(0.0, v.getEntry(0), EPSILON);
        Assert.assertEquals(5.0, v.getEntry(1), EPSILON);
    }

    @Test
    public void testCopyConstructorOpenMapRealVector() {
        OpenMapRealVector original = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0});
        OpenMapRealVector copy = new OpenMapRealVector(original);
        Assert.assertEquals(original.getDimension(), copy.getDimension());
        Assert.assertEquals(1.0, copy.getEntry(0), EPSILON);
        Assert.assertEquals(2.0, copy.getEntry(2), EPSILON);
    }

    @Test
    public void testGenericRealVectorConstructor() {
        RealVector rv = new ArrayRealVector(new double[]{0.0, 7.0, 0.0, 8.0});
        OpenMapRealVector v = new OpenMapRealVector(rv);
        Assert.assertEquals(4, v.getDimension());
        Assert.assertEquals(7.0, v.getEntry(1), EPSILON);
        Assert.assertEquals(8.0, v.getEntry(3), EPSILON);
    }

    @Test
    public void testAddOpenMapRealVector_thisLarger() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0, 0.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 1.0, 0.0, 4.0});
        OpenMapRealVector result = v1.add(v2);

        Assert.assertEquals(4, result.getDimension());
        Assert.assertEquals(1.0, result.getEntry(0), EPSILON);
        Assert.assertEquals(3.0, result.getEntry(1), EPSILON);
        Assert.assertEquals(3.0, result.getEntry(2), EPSILON);
        Assert.assertEquals(4.0, result.getEntry(3), EPSILON);
    }

    @Test
    public void testAddOpenMapRealVector_otherLarger() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{0.0, 1.0, 0.0, 4.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0, 0.0});
        OpenMapRealVector result = v1.add(v2);

        Assert.assertEquals(4, result.getDimension());
        Assert.assertEquals(1.0, result.getEntry(0), EPSILON);
        Assert.assertEquals(3.0, result.getEntry(1), EPSILON);
        Assert.assertEquals(3.0, result.getEntry(2), EPSILON);
        Assert.assertEquals(4.0, result.getEntry(3), EPSILON);
    }

    @Test
    public void testAddGenericRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{2.0, 5.0, 1.0});
        RealVector result = v1.add(v2);

        Assert.assertEquals(3.0, result.getEntry(0), EPSILON);
        Assert.assertEquals(5.0, result.getEntry(1), EPSILON);
        Assert.assertEquals(4.0, result.getEntry(2), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAddDimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        OpenMapRealVector v2 = new OpenMapRealVector(4);
        v1.add(v2);
    }

    @Test
    public void testAppendOpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector res = v1.append(v2);

        Assert.assertEquals(4, res.getDimension());
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, res.getData(), EPSILON);
    }

    @Test
    public void testAppendRealVector_openMapInstance() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0});
        RealVector v2 = new OpenMapRealVector(new double[]{2.0});
        OpenMapRealVector res = v1.append(v2);

        Assert.assertEquals(2, res.getDimension());
        Assert.assertEquals(1.0, res.getEntry(0), EPSILON);
        Assert.assertEquals(2.0, res.getEntry(1), EPSILON);
    }

    @Test
    public void testAppendRealVector_arrayInstance() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0});
        RealVector v2 = new ArrayRealVector(new double[]{5.0, 6.0});
        OpenMapRealVector res = v1.append(v2);

        Assert.assertEquals(3, res.getDimension());
        Assert.assertEquals(1.0, res.getEntry(0), EPSILON);
        Assert.assertEquals(5.0, res.getEntry(1), EPSILON);
        Assert.assertEquals(6.0, res.getEntry(2), EPSILON);
    }

    @Test
    public void testAppendDouble() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector res = v.append(3.0);
        Assert.assertEquals(3, res.getDimension());
        Assert.assertEquals(3.0, res.getEntry(2), EPSILON);
    }

    @Test
    public void testAppendDoubleArray() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0});
        OpenMapRealVector res = v.append(new double[]{2.0, 3.0});
        Assert.assertEquals(3, res.getDimension());
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0}, res.getData(), EPSILON);
    }

    @Test
    public void testCopy() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector copy = v.copy();
        Assert.assertNotSame(v, copy);
        Assert.assertEquals(v, copy);
    }

    @Test
    public void testDotProduct_OpenMap_thisSmaller() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{0.0, 2.0, 0.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 3.0, 4.0});
        Assert.assertEquals(6.0, v1.dotProduct(v2), EPSILON);
    }

    @Test
    public void testDotProduct_OpenMap_otherSmaller() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 3.0, 4.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 2.0, 0.0});
        Assert.assertEquals(6.0, v1.dotProduct(v2), EPSILON);
    }

    @Test
    public void testDotProduct_GenericRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        Assert.assertEquals(32.0, v1.dotProduct(v2), EPSILON);

        RealVector v3 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
        Assert.assertEquals(32.0, v1.dotProduct(v3), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testDotProduct_DimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(2);
        OpenMapRealVector v2 = new OpenMapRealVector(3);
        v1.dotProduct(v2);
    }

    @Test
    public void testEbeDivideRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{4.0, 0.0, 9.0});
        RealVector v2 = new ArrayRealVector(new double[]{2.0, 5.0, 3.0});
        OpenMapRealVector res = v1.ebeDivide(v2);

        Assert.assertEquals(2.0, res.getEntry(0), EPSILON);
        Assert.assertEquals(0.0, res.getEntry(1), EPSILON);
        Assert.assertEquals(3.0, res.getEntry(2), EPSILON);
    }

    @Test
    public void testEbeDivideDoubleArray() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{10.0, 20.0});
        OpenMapRealVector res = v1.ebeDivide(new double[]{2.0, 5.0});

        Assert.assertEquals(5.0, res.getEntry(0), EPSILON);
        Assert.assertEquals(4.0, res.getEntry(1), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_DimensionMismatch() {
        OpenMapRealVector v = new OpenMapRealVector(2);
        v.ebeDivide(new double[]{1.0, 2.0, 3.0});
    }

    @Test
    public void testEbeMultiplyRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{2.0, 0.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        OpenMapRealVector res = v1.ebeMultiply(v2);

        Assert.assertEquals(8.0, res.getEntry(0), EPSILON);
        Assert.assertEquals(0.0, res.getEntry(1), EPSILON);
        Assert.assertEquals(18.0, res.getEntry(2), EPSILON);
    }

    @Test
    public void testEbeMultiplyDoubleArray() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector res = v1.ebeMultiply(new double[]{2.0, 3.0});

        Assert.assertEquals(6.0, res.getEntry(0), EPSILON);
        Assert.assertEquals(12.0, res.getEntry(1), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_DimensionMismatch() {
        OpenMapRealVector v = new OpenMapRealVector(2);
        v.ebeMultiply(new double[]{1.0});
    }

    @Test
    public void testGetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});
        OpenMapRealVector sub = v.getSubVector(1, 3);

        Assert.assertEquals(3, sub.getDimension());
        Assert.assertEquals(2.0, sub.getEntry(0), EPSILON);
        Assert.assertEquals(3.0, sub.getEntry(1), EPSILON);
        Assert.assertEquals(4.0, sub.getEntry(2), EPSILON);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_InvalidIndex() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.getSubVector(2, 2);
    }

    @Test
    public void testGetDistance_OpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 0.0, 4.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 2.0, 3.0, 0.0});
        // diff: (1-0)^2 + (2-2)^2 + (0-3)^2 + (4-0)^2 = 1 + 0 + 9 + 16 = 26
        Assert.assertEquals(Math.sqrt(26.0), v1.getDistance(v2), EPSILON);
    }

    @Test
    public void testGetDistance_RealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{3.0, 0.0});
        RealVector v2 = new ArrayRealVector(new double[]{0.0, 4.0});
        Assert.assertEquals(5.0, v1.getDistance(v2), EPSILON);

        RealVector v3 = new OpenMapRealVector(new double[]{0.0, 4.0});
        Assert.assertEquals(5.0, v1.getDistance(v3), EPSILON);
    }

    @Test
    public void testGetDistance_DoubleArray() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{3.0, 0.0});
        Assert.assertEquals(5.0, v1.getDistance(new double[]{0.0, 4.0}), EPSILON);
    }

    @Test
    public void testGetL1Distance_OpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 0.0, 4.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 2.0, 3.0, 0.0});
        // |1-0| + |2-2| + |0-3| + |4-0| = 1 + 0 + 3 + 4 = 8
        Assert.assertEquals(8.0, v1.getL1Distance(v2), EPSILON);
    }

    @Test
    public void testGetL1Distance_RealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, -2.0});
        RealVector v2 = new ArrayRealVector(new double[]{-1.0, 3.0});
        Assert.assertEquals(7.0, v1.getL1Distance(v2), EPSILON);

        RealVector v3 = new OpenMapRealVector(new double[]{-1.0, 3.0});
        Assert.assertEquals(7.0, v1.getL1Distance(v3), EPSILON);
    }

    @Test
    public void testGetL1Distance_DoubleArray() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, -2.0});
        Assert.assertEquals(7.0, v1.getL1Distance(new double[]{-1.0, 3.0}), EPSILON);
    }

    @Test
    public void testGetLInfDistance_OpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 0.0, 4.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 2.0, 7.0, 0.0});
        // diffs: |1-0|=1, |2-2|=0, |0-7|=7, |4-0|=4 => max is 7
        Assert.assertEquals(7.0, v1.getLInfDistance((RealVector) v2), EPSILON);
    }

    @Test
    public void testGetLInfDistance_RealVectorAndArray() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 5.0});
        RealVector v2 = new ArrayRealVector(new double[]{2.0, 1.0});
        Assert.assertEquals(4.0, v1.getLInfDistance(v2), EPSILON);

        Assert.assertEquals(4.0, v1.getLInfDistance(new double[]{2.0, 1.0}), EPSILON);
    }

    @Test
    public void testIsInfiniteAndIsNaN() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        Assert.assertFalse(v.isInfinite());
        Assert.assertFalse(v.isNaN());

        v.setEntry(1, Double.POSITIVE_INFINITY);
        Assert.assertTrue(v.isInfinite());
        Assert.assertFalse(v.isNaN());

        v.setEntry(0, Double.NaN);
        Assert.assertFalse(v.isInfinite()); // NaN check comes before Infinite check in loop
        Assert.assertTrue(v.isNaN());
    }

    @Test
    public void testMapAddAndMapAddToSelf() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, -1.0});
        OpenMapRealVector added = v.mapAdd(2.0);

        Assert.assertEquals(3.0, added.getEntry(0), EPSILON);
        Assert.assertEquals(2.0, added.getEntry(1), EPSILON);
        Assert.assertEquals(1.0, added.getEntry(2), EPSILON);

        v.mapAddToSelf(5.0);
        Assert.assertEquals(6.0, v.getEntry(0), EPSILON);
        Assert.assertEquals(5.0, v.getEntry(1), EPSILON);
        Assert.assertEquals(4.0, v.getEntry(2), EPSILON);
    }

    @Test
    public void testOuterProduct() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        RealMatrix matrix = v.outerProduct(new double[]{3.0, 4.0, 5.0});

        Assert.assertEquals(2, matrix.getRowDimension());
        Assert.assertEquals(3, matrix.getColumnDimension());
        Assert.assertEquals(3.0, matrix.getEntry(0, 0), EPSILON);
        Assert.assertEquals(4.0, matrix.getEntry(0, 1), EPSILON);
        Assert.assertEquals(5.0, matrix.getEntry(0, 2), EPSILON);
        Assert.assertEquals(6.0, matrix.getEntry(1, 0), EPSILON);
        Assert.assertEquals(8.0, matrix.getEntry(1, 1), EPSILON);
        Assert.assertEquals(10.0, matrix.getEntry(1, 2), EPSILON);
    }

    @Test
    public void testProjection() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{3.0, 4.0});
        RealVector v2 = new ArrayRealVector(new double[]{1.0, 0.0});
        RealVector proj = v1.projection(v2);

        Assert.assertEquals(3.0, proj.getEntry(0), EPSILON);
        Assert.assertEquals(0.0, proj.getEntry(1), EPSILON);

        OpenMapRealVector projArray = v1.projection(new double[]{0.0, 1.0});
        Assert.assertEquals(0.0, projArray.getEntry(0), EPSILON);
        Assert.assertEquals(4.0, projArray.getEntry(1), EPSILON);
    }

    @Test
    public void testSetEntry_removeWhenDefaultValue() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 5.0);
        Assert.assertEquals(5.0, v.getEntry(1), EPSILON);

        // Setting to default value (0.0) should remove the key
        v.setEntry(1, 0.0);
        Assert.assertEquals(0.0, v.getEntry(1), EPSILON);

        // Setting already default index to default value
        v.setEntry(2, 0.0);
        Assert.assertEquals(0.0, v.getEntry(2), EPSILON);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_OutOfRange() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(3, 1.0);
    }

    @Test
    public void testSetSubVectorRealVectorAndDoubleArray() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.setSubVector(1, new ArrayRealVector(new double[]{1.0, 2.0}));
        Assert.assertEquals(1.0, v.getEntry(1), EPSILON);
        Assert.assertEquals(2.0, v.getEntry(2), EPSILON);

        v.setSubVector(3, new double[]{3.0, 4.0});
        Assert.assertEquals(3.0, v.getEntry(3), EPSILON);
        Assert.assertEquals(4.0, v.getEntry(4), EPSILON);
    }

    @Test
    public void testSetConstant() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.set(7.5);
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(7.5, v.getEntry(i), EPSILON);
        }
    }

    @Test
    public void testSubtractOpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{5.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{2.0, 4.0, 0.0});
        OpenMapRealVector diff = v1.subtract(v2);

        Assert.assertEquals(3.0, diff.getEntry(0), EPSILON);
        Assert.assertEquals(-4.0, diff.getEntry(1), EPSILON);
        Assert.assertEquals(3.0, diff.getEntry(2), EPSILON);
    }

    @Test
    public void testSubtractRealVectorAndDoubleArray() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{5.0, 0.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector diff1 = v1.subtract(v2);
        Assert.assertEquals(4.0, diff1.getEntry(0), EPSILON);
        Assert.assertEquals(-2.0, diff1.getEntry(1), EPSILON);
        Assert.assertEquals(0.0, diff1.getEntry(2), EPSILON);

        OpenMapRealVector diff2 = v1.subtract(new double[]{1.0, 2.0, 3.0});
        Assert.assertEquals(4.0, diff2.getEntry(0), EPSILON);
        Assert.assertEquals(-2.0, diff2.getEntry(1), EPSILON);
        Assert.assertEquals(0.0, diff2.getEntry(2), EPSILON);

        RealVector v3 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector diff3 = v1.subtract(v3);
        Assert.assertEquals(4.0, diff3.getEntry(0), EPSILON);
    }

    @Test
    public void testUnitVectorAndUnitize() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector unit = v.unitVector();

        Assert.assertEquals(0.6, unit.getEntry(0), EPSILON);
        Assert.assertEquals(0.8, unit.getEntry(1), EPSILON);
        Assert.assertEquals(1.0, unit.getNorm(), EPSILON);

        v.unitize();
        Assert.assertEquals(0.6, v.getEntry(0), EPSILON);
        Assert.assertEquals(0.8, v.getEntry(1), EPSILON);
    }

    @Test(expected = MathArithmeticException.class)
    public void testUnitize_ZeroNormThrowsException() {
        OpenMapRealVector zero = new OpenMapRealVector(3);
        zero.unitize();
    }

    @Test
    public void testToArray() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0});
        double[] array = v.toArray();
        Assert.assertArrayEquals(new double[]{1.0, 0.0, 2.0}, array, EPSILON);
    }

    @Test
    public void testEqualsAndHashCode() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0});
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{1.0, 0.0});
        OpenMapRealVector v5 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0}, 1.0e-5);

        // Reflexive
        Assert.assertEquals(v1, v1);
        Assert.assertEquals(v1.hashCode(), v1.hashCode());

        // Symmetric & Equal
        Assert.assertEquals(v1, v2);
        Assert.assertEquals(v2, v1);
        Assert.assertEquals(v1.hashCode(), v2.hashCode());

        // Not equal - different contents
        Assert.assertNotEquals(v1, v3);
        // Not equal - different dimension
        Assert.assertNotEquals(v1, v4);
        // Not equal - different epsilon
        Assert.assertNotEquals(v1, v5);
        // Not equal - null or other types
        Assert.assertNotEquals(v1, null);
        Assert.assertNotEquals(v1, "not a vector");

        // Cross-key comparison branch tests
        OpenMapRealVector vA = new OpenMapRealVector(new double[]{1.0, 0.0});
        OpenMapRealVector vB = new OpenMapRealVector(new double[]{0.0, 1.0});
        Assert.assertNotEquals(vA, vB);
        Assert.assertNotEquals(vB, vA);
    }

    @Test
    public void testGetSparsity() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 1.0, 0.0, 2.0});
        Assert.assertEquals(2.0 / 4.0, v.getSparsity(), EPSILON);
    }

    @Test
    public void testSparseIterator() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0, 7.0});
        Iterator<RealVector.Entry> it = v.sparseIterator();

        int count = 0;
        while (it.hasNext()) {
            RealVector.Entry entry = it.next();
            count++;
            if (entry.getIndex() == 1) {
                Assert.assertEquals(5.0, entry.getValue(), EPSILON);
                entry.setValue(15.0);
            } else if (entry.getIndex() == 3) {
                Assert.assertEquals(7.0, entry.getValue(), EPSILON);
            }
        }
        Assert.assertEquals(2, count);
        Assert.assertEquals(15.0, v.getEntry(1), EPSILON);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIteratorRemove_ThrowsUnsupportedOperationException() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        Iterator<RealVector.Entry> it = v.sparseIterator();
        it.remove();
    }
}
