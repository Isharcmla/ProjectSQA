package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayRealVectorTest {

    private static final double EPSILON = 1e-12;

    /**
     * Dummy RealVector implementation to test branches where input is RealVector
     * but not an instance of ArrayRealVector.
     */
    private static class DummyRealVector extends AbstractRealVector {
        private final double[] values;

        public DummyRealVector(double[] values) {
            this.values = values.clone();
        }

        public AbstractRealVector copy() {
            return new DummyRealVector(values);
        }

        public RealVector add(RealVector v) {
            throw new UnsupportedOperationException();
        }

        public RealVector add(double[] v) {
            throw new UnsupportedOperationException();
        }

        public RealVector subtract(RealVector v) {
            throw new UnsupportedOperationException();
        }

        public RealVector subtract(double[] v) {
            throw new UnsupportedOperationException();
        }

        public RealVector mapAddToSelf(double d) {
            throw new UnsupportedOperationException();
        }

        public RealVector mapSubtractToSelf(double d) {
            throw new UnsupportedOperationException();
        }

        public RealVector mapMultiplyToSelf(double d) {
            throw new UnsupportedOperationException();
        }

        public RealVector mapDivideToSelf(double d) {
            throw new UnsupportedOperationException();
        }

        public RealVector mapPowToSelf(double d) {
            throw new UnsupportedOperationException();
        }

        public RealVector mapExpToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapExpm1ToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapLogToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapLog10ToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapLog1pToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapCoshToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapSinhToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapTanhToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapCosToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapSinToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapTanToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapAcosToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapAsinToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapAtanToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapInvToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapAbsToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapSqrtToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapCbrtToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapCeilToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapFloorToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapRintToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapSignumToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector mapUlpToSelf() {
            throw new UnsupportedOperationException();
        }

        public RealVector ebeMultiply(RealVector v) {
            throw new UnsupportedOperationException();
        }

        public RealVector ebeMultiply(double[] v) {
            throw new UnsupportedOperationException();
        }

        public RealVector ebeDivide(RealVector v) {
            throw new UnsupportedOperationException();
        }

        public RealVector ebeDivide(double[] v) {
            throw new UnsupportedOperationException();
        }

        public double[] getData() {
            return values.clone();
        }

        public double dotProduct(RealVector v) {
            throw new UnsupportedOperationException();
        }

        public double dotProduct(double[] v) {
            throw new UnsupportedOperationException();
        }

        public double getNorm() {
            throw new UnsupportedOperationException();
        }

        public double getL1Norm() {
            throw new UnsupportedOperationException();
        }

        public double getLInfNorm() {
            throw new UnsupportedOperationException();
        }

        public double getDistance(RealVector v) {
            throw new UnsupportedOperationException();
        }

        public double getDistance(double[] v) {
            throw new UnsupportedOperationException();
        }

        public double getL1Distance(RealVector v) {
            throw new UnsupportedOperationException();
        }

        public double getL1Distance(double[] v) {
            throw new UnsupportedOperationException();
        }

        public double getLInfDistance(RealVector v) {
            throw new UnsupportedOperationException();
        }

        public double getLInfDistance(double[] v) {
            throw new UnsupportedOperationException();
        }

        public RealVector unitVector() {
            throw new UnsupportedOperationException();
        }

        public void unitize() {
            throw new UnsupportedOperationException();
        }

        public RealVector projection(RealVector v) {
            throw new UnsupportedOperationException();
        }

        public RealVector projection(double[] v) {
            throw new UnsupportedOperationException();
        }

        public RealMatrix outerProduct(RealVector v) {
            throw new UnsupportedOperationException();
        }

        public RealMatrix outerProduct(double[] v) {
            throw new UnsupportedOperationException();
        }

        public double getEntry(int index) {
            return values[index];
        }

        public int getDimension() {
            return values.length;
        }

        public RealVector append(RealVector v) {
            throw new UnsupportedOperationException();
        }

        public RealVector append(double d) {
            throw new UnsupportedOperationException();
        }

        public RealVector append(double[] a) {
            throw new UnsupportedOperationException();
        }

        public RealVector getSubVector(int index, int n) {
            throw new UnsupportedOperationException();
        }

        public void setEntry(int index, double value) {
            values[index] = value;
        }

        public void setSubVector(int index, RealVector v) {
            throw new UnsupportedOperationException();
        }

        public void setSubVector(int index, double[] v) {
            throw new UnsupportedOperationException();
        }

        public void set(double value) {
            java.util.Arrays.fill(values, value);
        }

        public double[] toArray() {
            return values.clone();
        }

        public boolean isNaN() {
            for (double v : values) {
                if (Double.isNaN(v)) return true;
            }
            return false;
        }

        public boolean isInfinite() {
            if (isNaN()) return false;
            for (double v : values) {
                if (Double.isInfinite(v)) return true;
            }
            return false;
        }

        @Override
        public Iterator<Entry> sparseIterator() {
            return new Iterator<Entry>() {
                private int i = 0;
                private final Entry entry = new Entry();

                public boolean hasNext() {
                    return i < values.length;
                }

                public Entry next() {
                    if (!hasNext()) throw new NoSuchElementException();
                    entry.setIndex(i);
                    i++;
                    return entry;
                }

                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }
    }

    @Test
    public void testDefaultConstructor_noArgs_dimensionIsZero() {
        ArrayRealVector v = new ArrayRealVector();
        Assert.assertEquals(0, v.getDimension());
    }

    @Test
    public void testConstructor_sizeOnly_allZeros() {
        ArrayRealVector v = new ArrayRealVector(3);
        Assert.assertEquals(3, v.getDimension());
        Assert.assertArrayEquals(new double[]{0.0, 0.0, 0.0}, v.getData(), EPSILON);
    }

    @Test
    public void testConstructor_sizeAndPreset_filledWithPreset() {
        ArrayRealVector v = new ArrayRealVector(3, 5.5);
        Assert.assertEquals(3, v.getDimension());
        Assert.assertArrayEquals(new double[]{5.5, 5.5, 5.5}, v.getData(), EPSILON);
    }

    @Test
    public void testConstructor_doubleArray_clonesArray() {
        double[] data = new double[]{1.0, 2.0, 3.0};
        ArrayRealVector v = new ArrayRealVector(data);
        data[0] = 99.0;
        Assert.assertEquals(1.0, v.getEntry(0), EPSILON);
    }

    @Test
    public void testConstructor_doubleArrayAndCopyFlag_referenceVsCopy() {
        double[] data1 = new double[]{1.0, 2.0};
        ArrayRealVector vCopied = new ArrayRealVector(data1, true);
        data1[0] = 99.0;
        Assert.assertEquals(1.0, vCopied.getEntry(0), EPSILON);

        double[] data2 = new double[]{1.0, 2.0};
        ArrayRealVector vRef = new ArrayRealVector(data2, false);
        data2[0] = 99.0;
        Assert.assertEquals(99.0, vRef.getEntry(0), EPSILON);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_doubleArrayNull_throwsNPE() {
        new ArrayRealVector((double[]) null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_doubleArrayEmpty_throwsIllegalArgumentException() {
        new ArrayRealVector(new double[0], true);
    }

    @Test
    public void testConstructor_doubleArraySubArray_validRange() {
        double[] data = new double[]{10.0, 20.0, 30.0, 40.0};
        ArrayRealVector v = new ArrayRealVector(data, 1, 2);
        Assert.assertEquals(2, v.getDimension());
        Assert.assertArrayEquals(new double[]{20.0, 30.0}, v.getData(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_doubleArraySubArray_invalidRange() {
        double[] data = new double[]{10.0, 20.0};
        new ArrayRealVector(data, 1, 2);
    }

    @Test
    public void testConstructor_DoubleObjectArray_valid() {
        Double[] data = new Double[]{1.5, 2.5, 3.5};
        ArrayRealVector v = new ArrayRealVector(data);
        Assert.assertEquals(3, v.getDimension());
        Assert.assertArrayEquals(new double[]{1.5, 2.5, 3.5}, v.getData(), EPSILON);
    }

    @Test
    public void testConstructor_DoubleObjectSubArray_validRange() {
        Double[] data = new Double[]{1.5, 2.5, 3.5, 4.5};
        ArrayRealVector v = new ArrayRealVector(data, 1, 2);
        Assert.assertEquals(2, v.getDimension());
        Assert.assertArrayEquals(new double[]{2.5, 3.5}, v.getData(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_DoubleObjectSubArray_invalidRange() {
        Double[] data = new Double[]{1.5, 2.5};
        new ArrayRealVector(data, 1, 2);
    }

    @Test
    public void testConstructor_fromRealVector_genericAndArrayRealVector() {
        RealVector dummy = new DummyRealVector(new double[]{1.0, 2.0});
        ArrayRealVector vFromDummy = new ArrayRealVector(dummy);
        Assert.assertArrayEquals(new double[]{1.0, 2.0}, vFromDummy.getData(), EPSILON);

        ArrayRealVector vSource = new ArrayRealVector(new double[]{3.0, 4.0});
        ArrayRealVector vDeepCopy = new ArrayRealVector(vSource);
        Assert.assertArrayEquals(new double[]{3.0, 4.0}, vDeepCopy.getData(), EPSILON);

        ArrayRealVector vShallowCopy = new ArrayRealVector(vSource, false);
        Assert.assertSame(vSource.getDataRef(), vShallowCopy.getDataRef());

        ArrayRealVector vDeepCopyExplicit = new ArrayRealVector(vSource, true);
        Assert.assertNotSame(vSource.getDataRef(), vDeepCopyExplicit.getDataRef());
    }

    @Test
    public void testConstructors_appendCombinations() {
        ArrayRealVector av1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector av2 = new ArrayRealVector(new double[]{3.0, 4.0});
        RealVector rv = new DummyRealVector(new double[]{5.0, 6.0});
        double[] da = new double[]{7.0, 8.0};

        Assert.assertArrayEquals(new double[]{1, 2, 3, 4}, new ArrayRealVector(av1, av2).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{1, 2, 5, 6}, new ArrayRealVector(av1, rv).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{5, 6, 1, 2}, new ArrayRealVector(rv, av1).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{1, 2, 7, 8}, new ArrayRealVector(av1, da).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{7, 8, 1, 2}, new ArrayRealVector(da, av1).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{7, 8, 1, 2}, new ArrayRealVector(da, new double[]{1, 2}).getData(), EPSILON);
    }

    @Test
    public void testCopy_clonedSuccessfully() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        AbstractRealVector copy = v.copy();
        Assert.assertTrue(copy instanceof ArrayRealVector);
        Assert.assertNotSame(v.getDataRef(), ((ArrayRealVector) copy).getDataRef());
        Assert.assertArrayEquals(v.getData(), copy.getData(), EPSILON);
    }

    @Test
    public void testAdd_variousInputs() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        DummyRealVector dummy = new DummyRealVector(new double[]{5.0, 6.0});
        double[] array = new double[]{7.0, 8.0};

        Assert.assertArrayEquals(new double[]{4.0, 6.0}, v1.add(v2).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{6.0, 8.0}, v1.add((RealVector) dummy).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{8.0, 10.0}, v1.add(array).getData(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_dimensionMismatchRealVector_throwsException() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        DummyRealVector dummy = new DummyRealVector(new double[]{1.0});
        v1.add(dummy);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_dimensionMismatchArray_throwsException() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        v1.add(new double[]{1.0});
    }

    @Test
    public void testSubtract_variousInputs() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{10.0, 20.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0});
        DummyRealVector dummy = new DummyRealVector(new double[]{3.0, 4.0});
        double[] array = new double[]{5.0, 6.0};

        Assert.assertArrayEquals(new double[]{9.0, 18.0}, v1.subtract(v2).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{7.0, 16.0}, v1.subtract((RealVector) dummy).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{5.0, 14.0}, v1.subtract(array).getData(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_dimensionMismatchRealVector_throwsException() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        DummyRealVector dummy = new DummyRealVector(new double[]{1.0});
        v1.subtract(dummy);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_dimensionMismatchArray_throwsException() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        v1.subtract(new double[]{1.0});
    }

    @Test
    public void testMapToSelfMethods() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        Assert.assertSame(v, v.mapAddToSelf(3.0));
        Assert.assertArrayEquals(new double[]{4.0, 5.0}, v.getData(), EPSILON);

        Assert.assertSame(v, v.mapSubtractToSelf(1.0));
        Assert.assertArrayEquals(new double[]{3.0, 4.0}, v.getData(), EPSILON);

        Assert.assertSame(v, v.mapMultiplyToSelf(2.0));
        Assert.assertArrayEquals(new double[]{6.0, 8.0}, v.getData(), EPSILON);

        Assert.assertSame(v, v.mapDivideToSelf(2.0));
        Assert.assertArrayEquals(new double[]{3.0, 4.0}, v.getData(), EPSILON);

        Assert.assertSame(v, v.mapPowToSelf(2.0));
        Assert.assertArrayEquals(new double[]{9.0, 16.0}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapExpToSelf();
        Assert.assertArrayEquals(new double[]{Math.exp(0), Math.exp(1)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapExpm1ToSelf();
        Assert.assertArrayEquals(new double[]{Math.expm1(0), Math.expm1(1)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{1.0, Math.E});
        v.mapLogToSelf();
        Assert.assertArrayEquals(new double[]{0.0, 1.0}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{1.0, 100.0});
        v.mapLog10ToSelf();
        Assert.assertArrayEquals(new double[]{0.0, 2.0}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapLog1pToSelf();
        Assert.assertArrayEquals(new double[]{Math.log1p(0), Math.log1p(1)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.5, 1.5});
        v.mapCoshToSelf();
        Assert.assertArrayEquals(new double[]{Math.cosh(0.5), Math.cosh(1.5)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.5, 1.5});
        v.mapSinhToSelf();
        Assert.assertArrayEquals(new double[]{Math.sinh(0.5), Math.sinh(1.5)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.5, 1.5});
        v.mapTanhToSelf();
        Assert.assertArrayEquals(new double[]{Math.tanh(0.5), Math.tanh(1.5)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.0, Math.PI / 2});
        v.mapCosToSelf();
        Assert.assertArrayEquals(new double[]{Math.cos(0.0), Math.cos(Math.PI / 2)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.0, Math.PI / 2});
        v.mapSinToSelf();
        Assert.assertArrayEquals(new double[]{Math.sin(0.0), Math.sin(Math.PI / 2)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.0, Math.PI / 4});
        v.mapTanToSelf();
        Assert.assertArrayEquals(new double[]{Math.tan(0.0), Math.tan(Math.PI / 4)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapAcosToSelf();
        Assert.assertArrayEquals(new double[]{Math.acos(0.0), Math.acos(1.0)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapAsinToSelf();
        Assert.assertArrayEquals(new double[]{Math.asin(0.0), Math.asin(1.0)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapAtanToSelf();
        Assert.assertArrayEquals(new double[]{Math.atan(0.0), Math.atan(1.0)}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{2.0, 4.0});
        v.mapInvToSelf();
        Assert.assertArrayEquals(new double[]{0.5, 0.25}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{-2.5, 3.5});
        v.mapAbsToSelf();
        Assert.assertArrayEquals(new double[]{2.5, 3.5}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{4.0, 16.0});
        v.mapSqrtToSelf();
        Assert.assertArrayEquals(new double[]{2.0, 4.0}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{8.0, 27.0});
        v.mapCbrtToSelf();
        Assert.assertArrayEquals(new double[]{2.0, 3.0}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{1.2, -1.8});
        v.mapCeilToSelf();
        Assert.assertArrayEquals(new double[]{2.0, -1.0}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{1.8, -1.2});
        v.mapFloorToSelf();
        Assert.assertArrayEquals(new double[]{1.0, -2.0}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{1.2, 1.8});
        v.mapRintToSelf();
        Assert.assertArrayEquals(new double[]{1.0, 2.0}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{-5.0, 0.0, 5.0});
        v.mapSignumToSelf();
        Assert.assertArrayEquals(new double[]{-1.0, 0.0, 1.0}, v.getData(), EPSILON);

        v = new ArrayRealVector(new double[]{1.0, 2.0});
        v.mapUlpToSelf();
        Assert.assertArrayEquals(new double[]{Math.ulp(1.0), Math.ulp(2.0)}, v.getData(), EPSILON);
    }

    @Test
    public void testEbeMultiply_allVariants() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{2.0, 3.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{4.0, 5.0});
        DummyRealVector dummy = new DummyRealVector(new double[]{6.0, 7.0});
        double[] array = new double[]{8.0, 9.0};

        Assert.assertArrayEquals(new double[]{8.0, 15.0}, v1.ebeMultiply(v2).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{12.0, 21.0}, v1.ebeMultiply((RealVector) dummy).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{16.0, 27.0}, v1.ebeMultiply(array).getData(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEbeMultiply_dimensionMismatch_throwsException() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        v.ebeMultiply(new DummyRealVector(new double[]{1.0}));
    }

    @Test
    public void testEbeDivide_allVariants() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{12.0, 20.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        DummyRealVector dummy = new DummyRealVector(new double[]{2.0, 5.0});
        double[] array = new double[]{4.0, 2.0};

        Assert.assertArrayEquals(new double[]{4.0, 5.0}, v1.ebeDivide(v2).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{6.0, 4.0}, v1.ebeDivide((RealVector) dummy).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{3.0, 10.0}, v1.ebeDivide(array).getData(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEbeDivide_dimensionMismatch_throwsException() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        v.ebeDivide(new DummyRealVector(new double[]{1.0}));
    }

    @Test
    public void testDotProduct_allVariants() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        DummyRealVector dummy = new DummyRealVector(new double[]{4.0, 5.0, 6.0});
        double[] array = new double[]{4.0, 5.0, 6.0};

        Assert.assertEquals(32.0, v1.dotProduct(v2), EPSILON);
        Assert.assertEquals(32.0, v1.dotProduct((RealVector) dummy), EPSILON);
        Assert.assertEquals(32.0, v1.dotProduct(array), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDotProduct_dimensionMismatch_throwsException() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        v.dotProduct(new DummyRealVector(new double[]{1.0}));
    }

    @Test
    public void testNorms() {
        ArrayRealVector v = new ArrayRealVector(new double[]{-3.0, 4.0});
        Assert.assertEquals(5.0, v.getNorm(), EPSILON);
        Assert.assertEquals(7.0, v.getL1Norm(), EPSILON);
        Assert.assertEquals(7.0, v.getLInfNorm(), EPSILON); // Note: implementation sums max in getLInfNorm
    }

    @Test
    public void testDistances_allVariants() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{4.0, 6.0});
        DummyRealVector dummy = new DummyRealVector(new double[]{4.0, 6.0});
        double[] array = new double[]{4.0, 6.0};

        Assert.assertEquals(5.0, v1.getDistance(v2), EPSILON);
        Assert.assertEquals(5.0, v1.getDistance((RealVector) dummy), EPSILON);
        Assert.assertEquals(5.0, v1.getDistance(array), EPSILON);

        Assert.assertEquals(7.0, v1.getL1Distance(v2), EPSILON);
        Assert.assertEquals(7.0, v1.getL1Distance((RealVector) dummy), EPSILON);
        Assert.assertEquals(7.0, v1.getL1Distance(array), EPSILON);

        Assert.assertEquals(4.0, v1.getLInfDistance(v2), EPSILON);
        Assert.assertEquals(4.0, v1.getLInfDistance((RealVector) dummy), EPSILON);
        Assert.assertEquals(4.0, v1.getLInfDistance(array), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDistance_dimensionMismatch_throwsException() {
        new ArrayRealVector(new double[]{1.0, 2.0}).getDistance(new DummyRealVector(new double[]{1.0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetL1Distance_dimensionMismatch_throwsException() {
        new ArrayRealVector(new double[]{1.0, 2.0}).getL1Distance(new DummyRealVector(new double[]{1.0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLInfDistance_dimensionMismatch_throwsException() {
        new ArrayRealVector(new double[]{1.0, 2.0}).getLInfDistance(new DummyRealVector(new double[]{1.0}));
    }

    @Test
    public void testUnitVectorAndUnitize_success() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 3.0, 4.0});
        RealVector unit = v.unitVector();
        Assert.assertArrayEquals(new double[]{0.0, 0.6, 0.8}, unit.getData(), EPSILON);

        v.unitize();
        Assert.assertArrayEquals(new double[]{0.0, 0.6, 0.8}, v.getData(), EPSILON);
    }

    @Test(expected = ArithmeticException.class)
    public void testUnitVector_zeroNorm_throwsException() {
        new ArrayRealVector(new double[]{0.0, 0.0}).unitVector();
    }

    @Test(expected = ArithmeticException.class)
    public void testUnitize_zeroNorm_throwsException() {
        new ArrayRealVector(new double[]{0.0, 0.0}).unitize();
    }

    @Test
    public void testProjection_allVariants() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{0.0, 4.0});
        DummyRealVector dummy = new DummyRealVector(new double[]{0.0, 4.0});
        double[] array = new double[]{0.0, 4.0};

        Assert.assertArrayEquals(new double[]{0.0, 2.0}, v1.projection(v2).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{0.0, 2.0}, v1.projection(array).getData(), EPSILON);
    }

    @Test
    public void testOuterProduct_allVariants() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        DummyRealVector dummy = new DummyRealVector(new double[]{3.0, 4.0});
        double[] array = new double[]{3.0, 4.0};

        RealMatrix m1 = v1.outerProduct(v2);
        Assert.assertEquals(3.0, m1.getEntry(0, 0), EPSILON);
        Assert.assertEquals(4.0, m1.getEntry(0, 1), EPSILON);
        Assert.assertEquals(6.0, m1.getEntry(1, 0), EPSILON);
        Assert.assertEquals(8.0, m1.getEntry(1, 1), EPSILON);

        RealMatrix m2 = v1.outerProduct((RealVector) dummy);
        Assert.assertEquals(3.0, m2.getEntry(0, 0), EPSILON);
        Assert.assertEquals(8.0, m2.getEntry(1, 1), EPSILON);

        RealMatrix m3 = v1.outerProduct(array);
        Assert.assertEquals(3.0, m3.getEntry(0, 0), EPSILON);
        Assert.assertEquals(8.0, m3.getEntry(1, 1), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOuterProduct_dimensionMismatch_throwsException() {
        new ArrayRealVector(new double[]{1.0, 2.0}).outerProduct(new DummyRealVector(new double[]{1.0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOuterProduct_dimensionMismatchArray_throwsException() {
        new ArrayRealVector(new double[]{1.0, 2.0}).outerProduct(new double[]{1.0});
    }

    @Test
    public void testAppendMethods() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0}, v.append(3.0).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, v.append(new double[]{3.0, 4.0}).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, v.append(new ArrayRealVector(new double[]{3.0, 4.0})).getData(), EPSILON);
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, v.append((RealVector) new DummyRealVector(new double[]{3.0, 4.0})).getData(), EPSILON);
    }

    @Test
    public void testSubVectorAndSetMethods() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});
        RealVector sub = v.getSubVector(1, 3);
        Assert.assertArrayEquals(new double[]{2.0, 3.0, 4.0}, sub.getData(), EPSILON);

        v.setEntry(0, 10.0);
        Assert.assertEquals(10.0, v.getEntry(0), EPSILON);

        v.setSubVector(1, new double[]{20.0, 30.0});
        Assert.assertEquals(20.0, v.getEntry(1), EPSILON);
        Assert.assertEquals(30.0, v.getEntry(2), EPSILON);

        v.setSubVector(1, new ArrayRealVector(new double[]{22.0, 33.0}));
        Assert.assertEquals(22.0, v.getEntry(1), EPSILON);
        Assert.assertEquals(33.0, v.getEntry(2), EPSILON);

        v.setSubVector(1, (RealVector) new DummyRealVector(new double[]{25.0, 35.0}));
        Assert.assertEquals(25.0, v.getEntry(1), EPSILON);
        Assert.assertEquals(35.0, v.getEntry(2), EPSILON);

        v.set(1, new ArrayRealVector(new double[]{26.0, 36.0}));
        Assert.assertEquals(26.0, v.getEntry(1), EPSILON);
        Assert.assertEquals(36.0, v.getEntry(2), EPSILON);

        v.set(9.0);
        Assert.assertArrayEquals(new double[]{9.0, 9.0, 9.0, 9.0, 9.0}, v.toArray(), EPSILON);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_invalidIndex_throwsException() {
        new ArrayRealVector(new double[]{1.0, 2.0}).getEntry(5);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetEntry_invalidIndex_throwsException() {
        new ArrayRealVector(new double[]{1.0, 2.0}).setEntry(5, 1.0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubVector_invalidRange_throwsException() {
        new ArrayRealVector(new double[]{1.0, 2.0}).getSubVector(1, 5);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubVectorArray_invalidRange_throwsException() {
        new ArrayRealVector(new double[]{1.0, 2.0}).setSubVector(1, new double[]{1.0, 2.0, 3.0});
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubVectorRealVector_invalidRange_throwsException() {
        new ArrayRealVector(new double[]{1.0, 2.0}).setSubVector(1, new DummyRealVector(new double[]{1.0, 2.0, 3.0}));
    }

    @Test
    public void testToString_notNullOrEmpty() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        String s = v.toString();
        Assert.assertNotNull(s);
        Assert.assertTrue(s.length() > 0);
    }

    @Test
    public void testIsNaNAndIsInfinite() {
        ArrayRealVector vNormal = new ArrayRealVector(new double[]{1.0, 2.0});
        Assert.assertFalse(vNormal.isNaN());
        Assert.assertFalse(vNormal.isInfinite());

        ArrayRealVector vNaN = new ArrayRealVector(new double[]{1.0, Double.NaN});
        Assert.assertTrue(vNaN.isNaN());
        Assert.assertFalse(vNaN.isInfinite());

        ArrayRealVector vInf = new ArrayRealVector(new double[]{1.0, Double.POSITIVE_INFINITY});
        Assert.assertFalse(vInf.isNaN());
        Assert.assertTrue(vInf.isInfinite());

        ArrayRealVector vBoth = new ArrayRealVector(new double[]{Double.NaN, Double.POSITIVE_INFINITY});
        Assert.assertTrue(vBoth.isNaN());
        Assert.assertFalse(vBoth.isInfinite());
    }

    @Test
    public void testEqualsAndHashCode() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector vDiffVal = new ArrayRealVector(new double[]{1.0, 3.0});
        ArrayRealVector vDiffDim = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector vNaN1 = new ArrayRealVector(new double[]{1.0, Double.NaN});
        ArrayRealVector vNaN2 = new ArrayRealVector(new double[]{Double.NaN, 2.0});

        // equals reflexive & symmetric
        Assert.assertTrue(v1.equals(v1));
        Assert.assertTrue(v1.equals(v2));
        Assert.assertTrue(v2.equals(v1));
        Assert.assertEquals(v1.hashCode(), v2.hashCode());

        // not equals null or other type
        Assert.assertFalse(v1.equals(null));
        Assert.assertFalse(v1.equals("string"));

        // dimension mismatch
        Assert.assertFalse(v1.equals(vDiffDim));

        // value mismatch
        Assert.assertFalse(v1.equals(vDiffVal));

        // NaN equality rule
        Assert.assertTrue(vNaN1.equals(vNaN2));
        Assert.assertFalse(v1.equals(vNaN1));
        Assert.assertFalse(vNaN1.equals(v1));
        Assert.assertEquals(9, vNaN1.hashCode());
    }

    @Test
    public void testCheckVectorDimensions_mismatch_throwsException() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        try {
            v.checkVectorDimensions(3);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            v.checkVectorDimensions(new DummyRealVector(new double[]{1.0}));
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}
