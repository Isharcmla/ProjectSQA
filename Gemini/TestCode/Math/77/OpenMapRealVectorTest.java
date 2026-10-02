package org.apache.commons.math.linear;

import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.linear.RealVector.Entry;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class OpenMapRealVectorTest {

    private static final double EPS = 1e-11;

    @Test
    public void testConstructors_allVariants() {
        OpenMapRealVector v0 = new OpenMapRealVector();
        Assert.assertEquals(0, v0.getDimension());

        OpenMapRealVector v1 = new OpenMapRealVector(5);
        Assert.assertEquals(5, v1.getDimension());

        OpenMapRealVector v2 = new OpenMapRealVector(5, 1e-6);
        Assert.assertEquals(5, v2.getDimension());

        OpenMapRealVector v3 = new OpenMapRealVector(5, 10);
        Assert.assertEquals(5, v3.getDimension());

        OpenMapRealVector v4 = new OpenMapRealVector(5, 10, 1e-6);
        Assert.assertEquals(5, v4.getDimension());

        double[] dArray = new double[]{0.0, 1.5, 0.0, 2.5};
        OpenMapRealVector v5 = new OpenMapRealVector(dArray);
        Assert.assertEquals(4, v5.getDimension());
        Assert.assertEquals(1.5, v5.getEntry(1), EPS);
        Assert.assertEquals(0.0, v5.getEntry(0), EPS);

        OpenMapRealVector v6 = new OpenMapRealVector(dArray, 1e-6);
        Assert.assertEquals(4, v6.getDimension());
        Assert.assertEquals(2.5, v6.getEntry(3), EPS);

        Double[] objArray = new Double[]{0.0, 3.5, 0.0, 4.5};
        OpenMapRealVector v7 = new OpenMapRealVector(objArray);
        Assert.assertEquals(4, v7.getDimension());
        Assert.assertEquals(3.5, v7.getEntry(1), EPS);

        OpenMapRealVector v8 = new OpenMapRealVector(objArray, 1e-6);
        Assert.assertEquals(4, v8.getDimension());
        Assert.assertEquals(4.5, v8.getEntry(3), EPS);

        OpenMapRealVector v9 = new OpenMapRealVector(v5);
        Assert.assertEquals(4, v9.getDimension());
        Assert.assertEquals(1.5, v9.getEntry(1), EPS);

        RealVector standardVector = new ArrayRealVector(new double[]{0.0, 7.0, 0.0});
        OpenMapRealVector v10 = new OpenMapRealVector(standardVector);
        Assert.assertEquals(3, v10.getDimension());
        Assert.assertEquals(7.0, v10.getEntry(1), EPS);

        OpenMapRealVector resized = new OpenMapRealVector(v5, 2);
        Assert.assertEquals(6, resized.getDimension());
        Assert.assertEquals(1.5, resized.getEntry(1), EPS);
    }

    @Test
    public void testIsDefaultValue() {
        OpenMapRealVector v = new OpenMapRealVector(3, 1e-3);
        Assert.assertTrue(v.isDefaultValue(1e-4));
        Assert.assertTrue(v.isDefaultValue(-1e-4));
        Assert.assertFalse(v.isDefaultValue(1e-2));
    }

    @Test
    public void testAdd_OpenMapRealVector_differentSizesAndKeyOverlaps() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0, 4.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 2.0, 5.0, 0.0});

        // v1 has 3 entries, v2 has 2 entries (copyThis = true)
        OpenMapRealVector res1 = v1.add(v2);
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 8.0, 4.0}, res1.getData(), EPS);

        // v2 has 2 entries, v1 has 3 entries (copyThis = false)
        OpenMapRealVector res2 = v2.add(v1);
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 8.0, 4.0}, res2.getData(), EPS);
    }

    @Test
    public void testAdd_RealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{2.0, 5.0, 1.0});

        RealVector resGeneric = v1.add(v2);
        Assert.assertArrayEquals(new double[]{3.0, 5.0, 4.0}, resGeneric.getData(), EPS);

        RealVector resOpen = v1.add((RealVector) new OpenMapRealVector(new double[]{2.0, 5.0, 1.0}));
        Assert.assertArrayEquals(new double[]{3.0, 5.0, 4.0}, resOpen.getData(), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_dimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        OpenMapRealVector v2 = new OpenMapRealVector(4);
        v1.add(v2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_genericDimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        RealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0});
        v1.add(v2);
    }

    @Test
    public void testAppend_allOverloads() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 3.0});

        OpenMapRealVector appOpen = v1.append(v2);
        Assert.assertEquals(4, appOpen.getDimension());
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 0.0, 3.0}, appOpen.getData(), EPS);

        RealVector genericVector = new ArrayRealVector(new double[]{4.0, 5.0});
        OpenMapRealVector appGeneric = v1.append(genericVector);
        Assert.assertEquals(4, appGeneric.getDimension());
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 4.0, 5.0}, appGeneric.getData(), EPS);

        OpenMapRealVector appGenericOpen = v1.append((RealVector) v2);
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 0.0, 3.0}, appGenericOpen.getData(), EPS);

        OpenMapRealVector appDouble = v1.append(9.0);
        Assert.assertEquals(3, appDouble.getDimension());
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 9.0}, appDouble.getData(), EPS);

        OpenMapRealVector appArray = v1.append(new double[]{7.0, 8.0});
        Assert.assertEquals(4, appArray.getDimension());
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 7.0, 8.0}, appArray.getData(), EPS);
    }

    @Test
    public void testCopy() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0});
        OpenMapRealVector copy = v.copy();
        Assert.assertNotSame(v, copy);
        Assert.assertEquals(v, copy);
    }

    @Test
    public void testDotProduct() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 0.0, 4.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 3.0, 5.0, 0.0});

        // v1 has 3 non-zeros, v2 has 2 non-zeros
        double dot1 = v1.dotProduct(v2);
        Assert.assertEquals(6.0, dot1, EPS);

        // v2 has 2 non-zeros, v1 has 3 non-zeros
        double dot2 = v2.dotProduct(v1);
        Assert.assertEquals(6.0, dot2, EPS);

        RealVector standardVector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        double dotGeneric = v1.dotProduct(standardVector);
        Assert.assertEquals(1.0 * 1.0 + 2.0 * 2.0 + 4.0 * 4.0, dotGeneric, EPS);

        double dotGenericOpen = v1.dotProduct((RealVector) v2);
        Assert.assertEquals(6.0, dotGenericOpen, EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDotProduct_dimensionMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        OpenMapRealVector v2 = new OpenMapRealVector(4);
        v1.dotProduct(v2);
    }

    @Test
    public void testEbeDivideAndMultiply() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{2.0, 0.0, 6.0});
        RealVector v2 = new ArrayRealVector(new double[]{2.0, 4.0, 3.0});
        double[] array = new double[]{2.0, 4.0, 3.0};

        OpenMapRealVector divVec = v1.ebeDivide(v2);
        Assert.assertArrayEquals(new double[]{1.0, 0.0, 2.0}, divVec.getData(), EPS);

        OpenMapRealVector divArr = v1.ebeDivide(array);
        Assert.assertArrayEquals(new double[]{1.0, 0.0, 2.0}, divArr.getData(), EPS);

        OpenMapRealVector mulVec = v1.ebeMultiply(v2);
        Assert.assertArrayEquals(new double[]{4.0, 0.0, 18.0}, mulVec.getData(), EPS);

        OpenMapRealVector mulArr = v1.ebeMultiply(array);
        Assert.assertArrayEquals(new double[]{4.0, 0.0, 18.0}, mulArr.getData(), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEbeDivide_dimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.ebeDivide(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEbeDivide_vectorDimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.ebeDivide(new ArrayRealVector(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEbeMultiply_dimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.ebeMultiply(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEbeMultiply_vectorDimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.ebeMultiply(new ArrayRealVector(2));
    }

    @Test
    public void testGetSubVector_validAndExceptions() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 0.0, 4.0, 5.0});
        OpenMapRealVector sub = v.getSubVector(1, 3);
        Assert.assertEquals(3, sub.getDimension());
        Assert.assertArrayEquals(new double[]{2.0, 0.0, 4.0}, sub.getData(), EPS);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubVector_invalidIndexNegative() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.getSubVector(-1, 2);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubVector_invalidEnd() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.getSubVector(3, 4);
    }

    @Test
    public void testGetDistance_allVariants() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{3.0, 0.0, 4.0, 0.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 0.0, 4.0, 4.0});

        double distOpen = v1.getDistance(v2);
        Assert.assertEquals(5.0, distOpen, EPS);

        RealVector genVector = new ArrayRealVector(new double[]{0.0, 0.0, 4.0, 4.0});
        double distGen = v1.getDistance(genVector);
        Assert.assertEquals(5.0, distGen, EPS);

        double distGenOpen = v1.getDistance((RealVector) v2);
        Assert.assertEquals(5.0, distGenOpen, EPS);

        double distArr = v1.getDistance(new double[]{0.0, 0.0, 4.0, 4.0});
        Assert.assertEquals(5.0, distArr, EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDistance_dimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.getDistance(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDistance_vectorDimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.getDistance(new ArrayRealVector(2));
    }

    @Test
    public void testGetL1Distance_allVariants() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{3.0, 0.0, 4.0, 0.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0, 0.0, 5.0});

        double l1Open = v1.getL1Distance(v2);
        Assert.assertEquals(2.0 + 2.0 + 4.0 + 5.0, l1Open, EPS);

        RealVector genVector = new ArrayRealVector(new double[]{1.0, 2.0, 0.0, 5.0});
        double l1Gen = v1.getL1Distance(genVector);
        Assert.assertEquals(13.0, l1Gen, EPS);

        double l1GenOpen = v1.getL1Distance((RealVector) v2);
        Assert.assertEquals(13.0, l1GenOpen, EPS);

        double l1Arr = v1.getL1Distance(new double[]{1.0, 2.0, 0.0, 5.0});
        Assert.assertEquals(13.0, l1Arr, EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetL1Distance_dimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.getL1Distance(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetL1Distance_vectorDimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.getL1Distance(new ArrayRealVector(2));
    }

    @Test
    public void testGetLInfNorm() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.5, 0.0, 2.5, 3.0});
        Assert.assertEquals(7.0, v.getLInfNorm(), EPS);
    }

    @Test
    public void testGetLInfDistance_allVariants() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 10.0, 0.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 12.0, 2.0, 0.0});

        // max differences: |1-0|=1, |0-12|=12, |10-2|=8 -> max is 12
        RealVector genVector = new ArrayRealVector(new double[]{0.0, 12.0, 2.0, 0.0});
        double lInfGen = v1.getLInfDistance(genVector);
        Assert.assertEquals(12.0, lInfGen, EPS);

        double lInfGenOpen = v1.getLInfDistance((RealVector) v2);
        Assert.assertEquals(12.0, lInfGenOpen, EPS);

        double lInfArr = v1.getLInfDistance(new double[]{0.0, 12.0, 2.0, 0.0});
        Assert.assertEquals(12.0, lInfArr, EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLInfDistance_dimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.getLInfDistance(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLInfDistance_vectorDimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.getLInfDistance(new ArrayRealVector(2));
    }

    @Test
    public void testIsInfiniteAndIsNaN() {
        OpenMapRealVector normal = new OpenMapRealVector(new double[]{1.0, 2.0, 0.0});
        Assert.assertFalse(normal.isInfinite());
        Assert.assertFalse(normal.isNaN());

        OpenMapRealVector withInf = new OpenMapRealVector(new double[]{1.0, Double.POSITIVE_INFINITY, 0.0});
        Assert.assertTrue(withInf.isInfinite());
        Assert.assertFalse(withInf.isNaN());

        OpenMapRealVector withNaN = new OpenMapRealVector(new double[]{1.0, Double.NaN, 0.0});
        Assert.assertFalse(withNaN.isInfinite());
        Assert.assertTrue(withNaN.isNaN());

        OpenMapRealVector withBoth = new OpenMapRealVector(new double[]{Double.POSITIVE_INFINITY, Double.NaN});
        Assert.assertFalse(withBoth.isInfinite());
        Assert.assertTrue(withBoth.isNaN());
    }

    @Test
    public void testMapAddAndMapAddToSelf() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector res = v.mapAdd(2.0);
        Assert.assertArrayEquals(new double[]{3.0, 2.0, 5.0}, res.getData(), EPS);
        Assert.assertArrayEquals(new double[]{1.0, 0.0, 3.0}, v.getData(), EPS);

        v.mapAddToSelf(2.0);
        Assert.assertArrayEquals(new double[]{3.0, 2.0, 5.0}, v.getData(), EPS);
    }

    @Test
    public void testOuterProduct() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0});
        RealMatrix matrix = v.outerProduct(new double[]{2.0, 3.0, 4.0});
        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(3, matrix.getColumnDimension());
        Assert.assertEquals(2.0, matrix.getEntry(0, 0), EPS);
        Assert.assertEquals(3.0, matrix.getEntry(0, 1), EPS);
        Assert.assertEquals(4.0, matrix.getEntry(0, 2), EPS);
        Assert.assertEquals(0.0, matrix.getEntry(1, 0), EPS);
        Assert.assertEquals(4.0, matrix.getEntry(2, 0), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOuterProduct_dimMismatch() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.outerProduct(new double[]{1.0, 2.0});
    }

    @Test
    public void testProjection() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 4.0, 0.0});

        RealVector proj = v1.projection((RealVector) v2);
        Assert.assertArrayEquals(new double[]{0.0, 2.0, 0.0}, proj.getData(), EPS);

        OpenMapRealVector projArr = v1.projection(new double[]{0.0, 4.0, 0.0});
        Assert.assertArrayEquals(new double[]{0.0, 2.0, 0.0}, projArr.getData(), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProjection_dimMismatch() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.projection(new double[]{1.0, 2.0});
    }

    @Test
    public void testSetEntry_andRemoveZero() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 5.0);
        Assert.assertEquals(5.0, v.getEntry(1), EPS);

        // Reset to 0 -> should remove entry internally
        v.setEntry(1, 0.0);
        Assert.assertEquals(0.0, v.getEntry(1), EPS);

        // Set zero on non-existing entry
        v.setEntry(2, 0.0);
        Assert.assertEquals(0.0, v.getEntry(2), EPS);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_invalidIndex() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.getEntry(3);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetEntry_invalidIndex() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(-1, 1.0);
    }

    @Test
    public void testSetSubVector_andSetConstant() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.setSubVector(1, new double[]{2.0, 3.0});
        Assert.assertArrayEquals(new double[]{0.0, 2.0, 3.0, 0.0, 0.0}, v.getData(), EPS);

        v.setSubVector(2, new ArrayRealVector(new double[]{8.0, 9.0}));
        Assert.assertArrayEquals(new double[]{0.0, 2.0, 8.0, 9.0, 0.0}, v.getData(), EPS);

        v.set(1.5);
        Assert.assertArrayEquals(new double[]{1.5, 1.5, 1.5, 1.5, 1.5}, v.getData(), EPS);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_invalidStart() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.setSubVector(-1, new double[]{1.0});
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_outOfRange() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.setSubVector(4, new double[]{1.0, 2.0});
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_vectorOutOfRange() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.setSubVector(4, new ArrayRealVector(new double[]{1.0, 2.0}));
    }

    @Test
    public void testSubtract_allVariants() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{5.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{2.0, 4.0, 0.0});

        OpenMapRealVector res = v1.subtract(v2);
        Assert.assertArrayEquals(new double[]{3.0, -4.0, 3.0}, res.getData(), EPS);

        RealVector genVector = new ArrayRealVector(new double[]{2.0, 4.0, 0.0});
        OpenMapRealVector resGen = v1.subtract(genVector);
        Assert.assertArrayEquals(new double[]{3.0, -4.0, 3.0}, resGen.getData(), EPS);

        OpenMapRealVector resGenOpen = v1.subtract((RealVector) v2);
        Assert.assertArrayEquals(new double[]{3.0, -4.0, 3.0}, resGenOpen.getData(), EPS);

        OpenMapRealVector resArr = v1.subtract(new double[]{2.0, 4.0, 0.0});
        Assert.assertArrayEquals(new double[]{3.0, -4.0, 3.0}, resArr.getData(), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_dimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.subtract(new double[]{1.0, 2.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_openDimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.subtract(new OpenMapRealVector(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_vectorDimMismatch() {
        OpenMapRealVector v1 = new OpenMapRealVector(3);
        v1.subtract(new ArrayRealVector(2));
    }

    @Test
    public void testUnitVectorAndUnitize() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 3.0, 4.0});
        OpenMapRealVector unit = v.unitVector();
        Assert.assertEquals(1.0, unit.getNorm(), EPS);
        Assert.assertEquals(0.6, unit.getEntry(1), EPS);
        Assert.assertEquals(0.8, unit.getEntry(2), EPS);

        v.unitize();
        Assert.assertEquals(1.0, v.getNorm(), EPS);
        Assert.assertEquals(0.6, v.getEntry(1), EPS);
        Assert.assertEquals(0.8, v.getEntry(2), EPS);
    }

    @Test(expected = MathRuntimeException.class)
    public void testUnitize_zeroNormThrowsException() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.unitize();
    }

    @Test
    public void testToArray() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0});
        Assert.assertArrayEquals(new double[]{1.0, 0.0, 2.0}, v.toArray(), EPS);
    }

    @Test
    public void testEqualsAndHashCode() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0}, 1e-12);
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0}, 1e-12);
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0}, 1e-5);
        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0}, 1e-12);
        OpenMapRealVector v5 = new OpenMapRealVector(new double[]{1.0, 0.0}, 1e-12);
        OpenMapRealVector v6 = new OpenMapRealVector(new double[]{1.0, 5.0, 2.0}, 1e-12);

        Assert.assertTrue(v1.equals(v1));
        Assert.assertTrue(v1.equals(v2));
        Assert.assertEquals(v1.hashCode(), v2.hashCode());

        Assert.assertFalse(v1.equals(null));
        Assert.assertFalse(v1.equals("NotAVector"));
        Assert.assertFalse(v1.equals(v5)); // virtualSize mismatch
        Assert.assertFalse(v1.equals(v3)); // epsilon mismatch
        Assert.assertFalse(v1.equals(v4)); // value mismatch
        Assert.assertFalse(v1.equals(v6)); // key in other missing in this
        Assert.assertFalse(v6.equals(v1)); // key in this missing in other
    }

    @Test
    public void testGetSparcity() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 2.0, 0.0});
        Assert.assertEquals(0.5, v.getSparcity(), EPS);
    }

    @Test
    public void testSparseIterator() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 10.0, 0.0, 20.0});
        Iterator<Entry> iter = v.sparseIterator();

        int count = 0;
        while (iter.hasNext()) {
            Entry entry = iter.next();
            int index = entry.getIndex();
            double val = entry.getValue();
            if (index == 1) {
                Assert.assertEquals(10.0, val, EPS);
                entry.setValue(15.0);
            } else if (index == 3) {
                Assert.assertEquals(20.0, val, EPS);
            } else {
                Assert.fail("Unexpected index in sparse iterator: " + index);
            }
            count++;
        }
        Assert.assertEquals(2, count);
        Assert.assertEquals(15.0, v.getEntry(1), EPS);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIterator_removeThrowsException() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        Iterator<Entry> iter = v.sparseIterator();
        iter.remove();
    }
}
