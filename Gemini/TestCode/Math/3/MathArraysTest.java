package org.apache.commons.math3.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class MathArraysTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<MathArrays> constructor = MathArrays.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        MathArrays instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testFunctionInterface() {
        MathArrays.Function f = new MathArrays.Function() {
            public double evaluate(double[] array) {
                return evaluate(array, 0, array.length);
            }

            public double evaluate(double[] array, int startIndex, int numElements) {
                double sum = 0;
                for (int i = startIndex; i < startIndex + numElements; i++) {
                    sum += array[i];
                }
                return sum;
            }
        };

        double[] data = { 1.0, 2.0, 3.0, 4.0 };
        Assert.assertEquals(10.0, f.evaluate(data), 1e-9);
        Assert.assertEquals(5.0, f.evaluate(data, 1, 2), 1e-9);
    }

    @Test
    public void testScale() {
        double[] arr = { 1.0, -2.0, 3.5 };
        double[] scaled = MathArrays.scale(2.0, arr);
        Assert.assertArrayEquals(new double[] { 2.0, -4.0, 7.0 }, scaled, 1e-9);
        Assert.assertEquals(1.0, arr[0], 1e-9);
    }

    @Test
    public void testScaleInPlace() {
        double[] arr = { 1.0, -2.0, 3.5 };
        MathArrays.scaleInPlace(2.0, arr);
        Assert.assertArrayEquals(new double[] { 2.0, -4.0, 7.0 }, arr, 1e-9);
    }

    @Test
    public void testEbeAdd_success() {
        double[] a = { 1.0, 2.0 };
        double[] b = { 3.0, 4.0 };
        Assert.assertArrayEquals(new double[] { 4.0, 6.0 }, MathArrays.ebeAdd(a, b), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeAdd_dimensionMismatch() {
        MathArrays.ebeAdd(new double[] { 1.0 }, new double[] { 1.0, 2.0 });
    }

    @Test
    public void testEbeSubtract_success() {
        double[] a = { 5.0, 2.0 };
        double[] b = { 3.0, 4.0 };
        Assert.assertArrayEquals(new double[] { 2.0, -2.0 }, MathArrays.ebeSubtract(a, b), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeSubtract_dimensionMismatch() {
        MathArrays.ebeSubtract(new double[] { 1.0 }, new double[] { 1.0, 2.0 });
    }

    @Test
    public void testEbeMultiply_success() {
        double[] a = { 5.0, 2.0 };
        double[] b = { 3.0, -4.0 };
        Assert.assertArrayEquals(new double[] { 15.0, -8.0 }, MathArrays.ebeMultiply(a, b), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_dimensionMismatch() {
        MathArrays.ebeMultiply(new double[] { 1.0 }, new double[] { 1.0, 2.0 });
    }

    @Test
    public void testEbeDivide_success() {
        double[] a = { 6.0, -8.0 };
        double[] b = { 3.0, 4.0 };
        Assert.assertArrayEquals(new double[] { 2.0, -2.0 }, MathArrays.ebeDivide(a, b), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_dimensionMismatch() {
        MathArrays.ebeDivide(new double[] { 1.0 }, new double[] { 1.0, 2.0 });
    }

    @Test
    public void testDistance1_double() {
        double[] p1 = { 1.0, 2.0, 3.0 };
        double[] p2 = { 4.0, 0.0, -1.0 };
        Assert.assertEquals(9.0, MathArrays.distance1(p1, p2), 1e-9);
    }

    @Test
    public void testDistance1_int() {
        int[] p1 = { 1, 2, 3 };
        int[] p2 = { 4, 0, -1 };
        Assert.assertEquals(9, MathArrays.distance1(p1, p2));
    }

    @Test
    public void testDistance_double() {
        double[] p1 = { 1.0, 2.0 };
        double[] p2 = { 4.0, 6.0 };
        Assert.assertEquals(5.0, MathArrays.distance(p1, p2), 1e-9);
    }

    @Test
    public void testDistance_int() {
        int[] p1 = { 1, 2 };
        int[] p2 = { 4, 6 };
        Assert.assertEquals(5.0, MathArrays.distance(p1, p2), 1e-9);
    }

    @Test
    public void testDistanceInf_double() {
        double[] p1 = { 1.0, 2.0, 3.0 };
        double[] p2 = { 4.0, 0.0, 8.0 };
        Assert.assertEquals(5.0, MathArrays.distanceInf(p1, p2), 1e-9);
    }

    @Test
    public void testDistanceInf_int() {
        int[] p1 = { 1, 2, 3 };
        int[] p2 = { 4, 0, 8 };
        Assert.assertEquals(5, MathArrays.distanceInf(p1, p2));
    }

    @Test
    public void testIsMonotonic_generic() {
        Integer[] incStrict = { 1, 2, 3 };
        Integer[] incNonStrict = { 1, 2, 2, 3 };
        Integer[] decStrict = { 3, 2, 1 };
        Integer[] decNonStrict = { 3, 2, 2, 1 };
        Integer[] nonMono = { 1, 3, 2 };

        Assert.assertTrue(MathArrays.isMonotonic(incStrict, MathArrays.OrderDirection.INCREASING, true));
        Assert.assertFalse(MathArrays.isMonotonic(incNonStrict, MathArrays.OrderDirection.INCREASING, true));
        Assert.assertTrue(MathArrays.isMonotonic(incNonStrict, MathArrays.OrderDirection.INCREASING, false));

        Assert.assertTrue(MathArrays.isMonotonic(decStrict, MathArrays.OrderDirection.DECREASING, true));
        Assert.assertFalse(MathArrays.isMonotonic(decNonStrict, MathArrays.OrderDirection.DECREASING, true));
        Assert.assertTrue(MathArrays.isMonotonic(decNonStrict, MathArrays.OrderDirection.DECREASING, false));

        Assert.assertFalse(MathArrays.isMonotonic(nonMono, MathArrays.OrderDirection.INCREASING, false));
        Assert.assertFalse(MathArrays.isMonotonic(nonMono, MathArrays.OrderDirection.DECREASING, false));
    }

    @Test
    public void testIsMonotonic_double() {
        double[] incStrict = { 1.0, 2.0, 3.0 };
        double[] incNonStrict = { 1.0, 2.0, 2.0, 3.0 };
        double[] decStrict = { 3.0, 2.0, 1.0 };
        double[] decNonStrict = { 3.0, 2.0, 2.0, 1.0 };
        double[] nonMono = { 1.0, 3.0, 2.0 };

        Assert.assertTrue(MathArrays.isMonotonic(incStrict, MathArrays.OrderDirection.INCREASING, true));
        Assert.assertFalse(MathArrays.isMonotonic(incNonStrict, MathArrays.OrderDirection.INCREASING, true));
        Assert.assertTrue(MathArrays.isMonotonic(incNonStrict, MathArrays.OrderDirection.INCREASING, false));

        Assert.assertTrue(MathArrays.isMonotonic(decStrict, MathArrays.OrderDirection.DECREASING, true));
        Assert.assertFalse(MathArrays.isMonotonic(decNonStrict, MathArrays.OrderDirection.DECREASING, true));
        Assert.assertTrue(MathArrays.isMonotonic(decNonStrict, MathArrays.OrderDirection.DECREASING, false));

        Assert.assertFalse(MathArrays.isMonotonic(nonMono, MathArrays.OrderDirection.INCREASING, false));
        Assert.assertFalse(MathArrays.isMonotonic(nonMono, MathArrays.OrderDirection.DECREASING, false));
    }

    @Test
    public void testCheckOrder_variations() {
        double[] valid = { 1.0, 2.0, 3.0 };
        double[] invalid = { 1.0, 3.0, 2.0 };

        MathArrays.checkOrder(valid);
        MathArrays.checkOrder(valid, MathArrays.OrderDirection.INCREASING, true);
        Assert.assertTrue(MathArrays.checkOrder(valid, MathArrays.OrderDirection.INCREASING, true, false));
        Assert.assertFalse(MathArrays.checkOrder(invalid, MathArrays.OrderDirection.INCREASING, true, false));
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder_abortException() {
        MathArrays.checkOrder(new double[] { 3.0, 2.0, 1.0 });
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder_decreasingAbortException() {
        MathArrays.checkOrder(new double[] { 1.0, 2.0 }, MathArrays.OrderDirection.DECREASING, true);
    }

    @Test
    public void testCheckRectangular_valid() {
        long[][] matrix = { { 1L, 2L }, { 3L, 4L }, { 5L, 6L } };
        MathArrays.checkRectangular(matrix);
    }

    @Test(expected = NullArgumentException.class)
    public void testCheckRectangular_null() {
        MathArrays.checkRectangular(null);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckRectangular_nonRectangular() {
        long[][] matrix = { { 1L, 2L }, { 3L } };
        MathArrays.checkRectangular(matrix);
    }

    @Test
    public void testCheckPositive_valid() {
        MathArrays.checkPositive(new double[] { 1e-10, 2.0, 100.0 });
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositive_zero() {
        MathArrays.checkPositive(new double[] { 1.0, 0.0, 2.0 });
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositive_negative() {
        MathArrays.checkPositive(new double[] { 1.0, -0.1, 2.0 });
    }

    @Test
    public void testCheckNonNegative_1D_valid() {
        MathArrays.checkNonNegative(new long[] { 0L, 1L, 2L });
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegative_1D_negative() {
        MathArrays.checkNonNegative(new long[] { 0L, -1L, 2L });
    }

    @Test
    public void testCheckNonNegative_2D_valid() {
        MathArrays.checkNonNegative(new long[][] { { 0L, 1L }, { 2L, 3L } });
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegative_2D_negative() {
        MathArrays.checkNonNegative(new long[][] { { 0L, 1L }, { -2L, 3L } });
    }

    @Test
    public void testSafeNorm_standard() {
        double[] v = { 3.0, 4.0 };
        Assert.assertEquals(5.0, MathArrays.safeNorm(v), 1e-9);
    }

    @Test
    public void testSafeNorm_zero() {
        double[] v = { 0.0, 0.0, 0.0 };
        Assert.assertEquals(0.0, MathArrays.safeNorm(v), 1e-9);
    }

    @Test
    public void testSafeNorm_underflowValues() {
        double[] vSmall = { 1e-25, 2e-25, 2e-25 };
        Assert.assertEquals(3e-25, MathArrays.safeNorm(vSmall), 1e-35);

        double[] vMixedUnderflow = { 1e-25, 1.0 };
        Assert.assertEquals(1.0, MathArrays.safeNorm(vMixedUnderflow), 1e-9);

        double[] vUnderflowScale = { 1e-25, 0.0, 1e-26 };
        Assert.assertTrue(MathArrays.safeNorm(vUnderflowScale) > 0);
    }

    @Test
    public void testSafeNorm_overflowValues() {
        double[] vLarge = { 1e25, 2e25 };
        double expected = FastMath.sqrt(5.0) * 1e25;
        Assert.assertEquals(expected, MathArrays.safeNorm(vLarge), 1e16);

        double[] vLargeDecreasing = { 2e25, 1e25 };
        Assert.assertEquals(expected, MathArrays.safeNorm(vLargeDecreasing), 1e16);
    }

    @Test
    public void testSortInPlace_singleArray() {
        double[] x = { 3.0, 1.0, 2.0 };
        MathArrays.sortInPlace(x);
        Assert.assertArrayEquals(new double[] { 1.0, 2.0, 3.0 }, x, 1e-9);
    }

    @Test
    public void testSortInPlace_multipleArraysDecreasing() {
        double[] x = { 3.0, 1.0, 2.0 };
        double[] y = { 30.0, 10.0, 20.0 };
        double[] z = { 300.0, 100.0, 200.0 };
        MathArrays.sortInPlace(x, MathArrays.OrderDirection.DECREASING, y, z);
        Assert.assertArrayEquals(new double[] { 3.0, 2.0, 1.0 }, x, 1e-9);
        Assert.assertArrayEquals(new double[] { 30.0, 20.0, 10.0 }, y, 1e-9);
        Assert.assertArrayEquals(new double[] { 300.0, 200.0, 100.0 }, z, 1e-9);
    }

    @Test(expected = NullArgumentException.class)
    public void testSortInPlace_nullX() {
        MathArrays.sortInPlace(null, new double[] { 1.0 });
    }

    @Test(expected = NullArgumentException.class)
    public void testSortInPlace_nullY() {
        MathArrays.sortInPlace(new double[] { 1.0 }, (double[]) null);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSortInPlace_dimensionMismatch() {
        MathArrays.sortInPlace(new double[] { 1.0, 2.0 }, new double[] { 1.0 });
    }

    @Test
    public void testCopyOf_int() {
        int[] original = { 1, 2, 3 };
        int[] copy1 = MathArrays.copyOf(original);
        Assert.assertArrayEquals(original, copy1);

        int[] copyTruncated = MathArrays.copyOf(original, 2);
        Assert.assertArrayEquals(new int[] { 1, 2 }, copyTruncated);

        int[] copyPadded = MathArrays.copyOf(original, 5);
        Assert.assertArrayEquals(new int[] { 1, 2, 3, 0, 0 }, copyPadded);
    }

    @Test
    public void testCopyOf_double() {
        double[] original = { 1.0, 2.0, 3.0 };
        double[] copy1 = MathArrays.copyOf(original);
        Assert.assertArrayEquals(original, copy1, 1e-9);

        double[] copyTruncated = MathArrays.copyOf(original, 2);
        Assert.assertArrayEquals(new double[] { 1.0, 2.0 }, copyTruncated, 1e-9);

        double[] copyPadded = MathArrays.copyOf(original, 5);
        Assert.assertArrayEquals(new double[] { 1.0, 2.0, 3.0, 0.0, 0.0 }, copyPadded, 1e-9);
    }

    @Test
    public void testLinearCombination_array() {
        double[] a = { 1.0, 2.0, 3.0, 4.0 };
        double[] b = { 5.0, 6.0, 7.0, 8.0 };
        Assert.assertEquals(70.0, MathArrays.linearCombination(a, b), 1e-9);

        double[] aNaN = { Double.POSITIVE_INFINITY, 1.0 };
        double[] bNaN = { 1.0, 2.0 };
        Assert.assertTrue(Double.isInfinite(MathArrays.linearCombination(aNaN, bNaN)));
    }

    @Test(expected = DimensionMismatchException.class)
    public void testLinearCombination_arrayDimensionMismatch() {
        MathArrays.linearCombination(new double[] { 1.0 }, new double[] { 1.0, 2.0 });
    }

    @Test
    public void testLinearCombination_2Terms() {
        Assert.assertEquals(1.0 * 2.0 + 3.0 * 4.0, MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0), 1e-9);
        Assert.assertTrue(Double.isInfinite(MathArrays.linearCombination(Double.POSITIVE_INFINITY, 1.0, 2.0, 3.0)));
    }

    @Test
    public void testLinearCombination_3Terms() {
        Assert.assertEquals(1.0 * 2.0 + 3.0 * 4.0 + 5.0 * 6.0,
                MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0, 5.0, 6.0), 1e-9);
        Assert.assertTrue(Double.isInfinite(MathArrays.linearCombination(Double.POSITIVE_INFINITY, 1.0, 2.0, 3.0, 4.0, 5.0)));
    }

    @Test
    public void testLinearCombination_4Terms() {
        Assert.assertEquals(1.0 * 2.0 + 3.0 * 4.0 + 5.0 * 6.0 + 7.0 * 8.0,
                MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0), 1e-9);
        Assert.assertTrue(Double.isInfinite(MathArrays.linearCombination(Double.POSITIVE_INFINITY, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0)));
    }

    @Test
    public void testEquals_float() {
        float[] a = { 1.0f, 2.0f };
        float[] b = { 1.0f, 2.0f };
        float[] c = { 1.0f, 3.0f };
        float[] d = { 1.0f };

        Assert.assertTrue(MathArrays.equals((float[]) null, (float[]) null));
        Assert.assertFalse(MathArrays.equals(a, (float[]) null));
        Assert.assertFalse(MathArrays.equals((float[]) null, a));
        Assert.assertTrue(MathArrays.equals(a, b));
        Assert.assertFalse(MathArrays.equals(a, c));
        Assert.assertFalse(MathArrays.equals(a, d));
        Assert.assertFalse(MathArrays.equals(new float[] { Float.NaN }, new float[] { Float.NaN }));
    }

    @Test
    public void testEqualsIncludingNaN_float() {
        float[] a = { 1.0f, Float.NaN };
        float[] b = { 1.0f, Float.NaN };
        float[] c = { 1.0f, 2.0f };
        float[] d = { 1.0f };

        Assert.assertTrue(MathArrays.equalsIncludingNaN((float[]) null, (float[]) null));
        Assert.assertFalse(MathArrays.equalsIncludingNaN(a, (float[]) null));
        Assert.assertFalse(MathArrays.equalsIncludingNaN((float[]) null, a));
        Assert.assertTrue(MathArrays.equalsIncludingNaN(a, b));
        Assert.assertFalse(MathArrays.equalsIncludingNaN(a, c));
        Assert.assertFalse(MathArrays.equalsIncludingNaN(a, d));
    }

    @Test
    public void testEquals_double() {
        double[] a = { 1.0, 2.0 };
        double[] b = { 1.0, 2.0 };
        double[] c = { 1.0, 3.0 };
        double[] d = { 1.0 };

        Assert.assertTrue(MathArrays.equals((double[]) null, (double[]) null));
        Assert.assertFalse(MathArrays.equals(a, (double[]) null));
        Assert.assertFalse(MathArrays.equals((double[]) null, a));
        Assert.assertTrue(MathArrays.equals(a, b));
        Assert.assertFalse(MathArrays.equals(a, c));
        Assert.assertFalse(MathArrays.equals(a, d));
        Assert.assertFalse(MathArrays.equals(new double[] { Double.NaN }, new double[] { Double.NaN }));
    }

    @Test
    public void testEqualsIncludingNaN_double() {
        double[] a = { 1.0, Double.NaN };
        double[] b = { 1.0, Double.NaN };
        double[] c = { 1.0, 2.0 };
        double[] d = { 1.0 };

        Assert.assertTrue(MathArrays.equalsIncludingNaN((double[]) null, (double[]) null));
        Assert.assertFalse(MathArrays.equalsIncludingNaN(a, (double[]) null));
        Assert.assertFalse(MathArrays.equalsIncludingNaN((double[]) null, a));
        Assert.assertTrue(MathArrays.equalsIncludingNaN(a, b));
        Assert.assertFalse(MathArrays.equalsIncludingNaN(a, c));
        Assert.assertFalse(MathArrays.equalsIncludingNaN(a, d));
    }

    @Test
    public void testNormalizeArray_valid() {
        double[] values = { 1.0, 2.0, 3.0, Double.NaN };
        double[] normalized = MathArrays.normalizeArray(values, 12.0);
        Assert.assertEquals(2.0, normalized[0], 1e-9);
        Assert.assertEquals(4.0, normalized[1], 1e-9);
        Assert.assertEquals(6.0, normalized[2], 1e-9);
        Assert.assertTrue(Double.isNaN(normalized[3]));
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArray_infiniteTargetSum() {
        MathArrays.normalizeArray(new double[] { 1.0 }, Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArray_nanTargetSum() {
        MathArrays.normalizeArray(new double[] { 1.0 }, Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArray_infiniteArrayElement() {
        MathArrays.normalizeArray(new double[] { 1.0, Double.POSITIVE_INFINITY }, 1.0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testNormalizeArray_zeroSum() {
        MathArrays.normalizeArray(new double[] { 1.0, -1.0 }, 1.0);
    }

    private static class DummyField implements Field<Double> {
        public Double getZero() {
            return 0.0;
        }

        public Double getOne() {
            return 1.0;
        }

        @SuppressWarnings("unchecked")
        public Class<? extends FieldElement<Double>> getRuntimeClass() {
            return (Class<? extends FieldElement<Double>>) (Class<?>) Double.class;
        }
    }

    @Test
    public void testBuildArray_1D() {
        DummyField field = new DummyField();
        Double[] arr = MathArrays.buildArray(field, 3);
        Assert.assertEquals(3, arr.length);
        for (Double val : arr) {
            Assert.assertEquals(0.0, val.doubleValue(), 1e-9);
        }
    }

    @Test
    public void testBuildArray_2D() {
        DummyField field = new DummyField();
        Double[][] arr = MathArrays.buildArray(field, 2, 3);
        Assert.assertEquals(2, arr.length);
        Assert.assertEquals(3, arr[0].length);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(0.0, arr[i][j].doubleValue(), 1e-9);
            }
        }

        Double[][] partialArr = MathArrays.buildArray(field, 2, -1);
        Assert.assertEquals(2, partialArr.length);
        Assert.assertNull(partialArr[0]);
    }

    @Test
    public void testConvolve_valid() {
        double[] x = { 1.0, 2.0, 3.0 };
        double[] h = { 0.5, 1.0 };
        double[] expected = { 0.5, 2.0, 3.5, 3.0 };
        Assert.assertArrayEquals(expected, MathArrays.convolve(x, h), 1e-9);
    }

    @Test(expected = NullArgumentException.class)
    public void testConvolve_nullFirstArgument() {
        MathArrays.convolve(null, new double[] { 1.0 });
    }

    @Test(expected = NullArgumentException.class)
    public void testConvolve_nullSecondArgument() {
        MathArrays.convolve(new double[] { 1.0 }, null);
    }

    @Test(expected = NoDataException.class)
    public void testConvolve_emptyFirstArgument() {
        MathArrays.convolve(new double[0], new double[] { 1.0 });
    }

    @Test(expected = NoDataException.class)
    public void testConvolve_emptySecondArgument() {
        MathArrays.convolve(new double[] { 1.0 }, new double[0]);
    }

    @Test
    public void testOrderDirectionEnum() {
        Assert.assertEquals(2, MathArrays.OrderDirection.values().length);
        Assert.assertEquals(MathArrays.OrderDirection.INCREASING, MathArrays.OrderDirection.valueOf("INCREASING"));
        Assert.assertEquals(MathArrays.OrderDirection.DECREASING, MathArrays.OrderDirection.valueOf("DECREASING"));
    }
}
