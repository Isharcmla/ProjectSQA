import org.junit.Test;
import org.junit.Assert;

import org.apache.commons.math3.Field;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.BigReal;

public class MathArraysTest {

    // ---------- scale ----------
    @Test
    public void testScale_normal_returnsScaledCopy() {
        double[] arr = {1.0, 2.0, 3.0};
        double[] result = MathArrays.scale(2.0, arr);
        Assert.assertArrayEquals(new double[]{2.0, 4.0, 6.0}, result, 1e-12);
        // original unchanged
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0}, arr, 1e-12);
    }

    @Test
    public void testScale_emptyArray_returnsEmpty() {
        double[] arr = {};
        double[] result = MathArrays.scale(5.0, arr);
        Assert.assertEquals(0, result.length);
    }

    // ---------- scaleInPlace ----------
    @Test
    public void testScaleInPlace_normal_modifiesArray() {
        double[] arr = {1.0, 2.0, 3.0};
        MathArrays.scaleInPlace(3.0, arr);
        Assert.assertArrayEquals(new double[]{3.0, 6.0, 9.0}, arr, 1e-12);
    }

    // ---------- ebeAdd ----------
    @Test
    public void testEbeAdd_normal_returnsSum() {
        double[] a = {1.0, 2.0};
        double[] b = {3.0, 4.0};
        double[] result = MathArrays.ebeAdd(a, b);
        Assert.assertArrayEquals(new double[]{4.0, 6.0}, result, 1e-12);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeAdd_differentLengths_throwsException() {
        MathArrays.ebeAdd(new double[]{1.0}, new double[]{1.0, 2.0});
    }

    // ---------- ebeSubtract ----------
    @Test
    public void testEbeSubtract_normal_returnsDifference() {
        double[] a = {5.0, 7.0};
        double[] b = {2.0, 3.0};
        double[] result = MathArrays.ebeSubtract(a, b);
        Assert.assertArrayEquals(new double[]{3.0, 4.0}, result, 1e-12);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeSubtract_differentLengths_throwsException() {
        MathArrays.ebeSubtract(new double[]{1.0}, new double[]{1.0, 2.0});
    }

    // ---------- ebeMultiply ----------
    @Test
    public void testEbeMultiply_normal_returnsProduct() {
        double[] a = {2.0, 3.0};
        double[] b = {4.0, 5.0};
        double[] result = MathArrays.ebeMultiply(a, b);
        Assert.assertArrayEquals(new double[]{8.0, 15.0}, result, 1e-12);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_differentLengths_throwsException() {
        MathArrays.ebeMultiply(new double[]{1.0}, new double[]{1.0, 2.0});
    }

    // ---------- ebeDivide ----------
    @Test
    public void testEbeDivide_normal_returnsQuotient() {
        double[] a = {8.0, 9.0};
        double[] b = {4.0, 3.0};
        double[] result = MathArrays.ebeDivide(a, b);
        Assert.assertArrayEquals(new double[]{2.0, 3.0}, result, 1e-12);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_differentLengths_throwsException() {
        MathArrays.ebeDivide(new double[]{1.0}, new double[]{1.0, 2.0});
    }

    // ---------- distance1 double ----------
    @Test
    public void testDistance1Double_normal_returnsSumOfAbsDiff() {
        double[] p1 = {0.0, 0.0};
        double[] p2 = {3.0, 4.0};
        Assert.assertEquals(7.0, MathArrays.distance1(p1, p2), 1e-12);
    }

    // ---------- distance1 int ----------
    @Test
    public void testDistance1Int_normal_returnsSumOfAbsDiff() {
        int[] p1 = {0, 0};
        int[] p2 = {3, 4};
        Assert.assertEquals(7, MathArrays.distance1(p1, p2));
    }

    // ---------- distance double ----------
    @Test
    public void testDistanceDouble_normal_returnsEuclideanDistance() {
        double[] p1 = {0.0, 0.0};
        double[] p2 = {3.0, 4.0};
        Assert.assertEquals(5.0, MathArrays.distance(p1, p2), 1e-12);
    }

    // ---------- distance int ----------
    @Test
    public void testDistanceInt_normal_returnsEuclideanDistance() {
        int[] p1 = {0, 0};
        int[] p2 = {3, 4};
        Assert.assertEquals(5.0, MathArrays.distance(p1, p2), 1e-12);
    }

    // ---------- distanceInf double ----------
    @Test
    public void testDistanceInfDouble_normal_returnsMaxAbsDiff() {
        double[] p1 = {0.0, 0.0};
        double[] p2 = {3.0, 4.0};
        Assert.assertEquals(4.0, MathArrays.distanceInf(p1, p2), 1e-12);
    }

    // ---------- distanceInf int ----------
    @Test
    public void testDistanceInfInt_normal_returnsMaxAbsDiff() {
        int[] p1 = {0, 0};
        int[] p2 = {3, 4};
        Assert.assertEquals(4, MathArrays.distanceInf(p1, p2));
    }

    // ---------- isMonotonic (Comparable[]) ----------
    @Test
    public void testIsMonotonicComparable_strictIncreasing_true() {
        Integer[] arr = {1, 2, 3, 4};
        Assert.assertTrue(MathArrays.isMonotonic(arr, MathArrays.OrderDirection.INCREASING, true));
    }

    @Test
    public void testIsMonotonicComparable_strictIncreasingWithEqual_false() {
        Integer[] arr = {1, 2, 2, 4};
        Assert.assertFalse(MathArrays.isMonotonic(arr, MathArrays.OrderDirection.INCREASING, true));
    }

    @Test
    public void testIsMonotonicComparable_nonStrictIncreasingWithEqual_true() {
        Integer[] arr = {1, 2, 2, 4};
        Assert.assertTrue(MathArrays.isMonotonic(arr, MathArrays.OrderDirection.INCREASING, false));
    }

    @Test
    public void testIsMonotonicComparable_nonStrictIncreasingDecreasingViolation_false() {
        Integer[] arr = {1, 3, 2};
        Assert.assertFalse(MathArrays.isMonotonic(arr, MathArrays.OrderDirection.INCREASING, false));
    }

    @Test
    public void testIsMonotonicComparable_strictDecreasing_true() {
        Integer[] arr = {4, 3, 2, 1};
        Assert.assertTrue(MathArrays.isMonotonic(arr, MathArrays.OrderDirection.DECREASING, true));
    }

    @Test
    public void testIsMonotonicComparable_strictDecreasingWithEqual_false() {
        Integer[] arr = {4, 3, 3, 1};
        Assert.assertFalse(MathArrays.isMonotonic(arr, MathArrays.OrderDirection.DECREASING, true));
    }

    @Test
    public void testIsMonotonicComparable_nonStrictDecreasingWithEqual_true() {
        Integer[] arr = {4, 3, 3, 1};
        Assert.assertTrue(MathArrays.isMonotonic(arr, MathArrays.OrderDirection.DECREASING, false));
    }

    @Test
    public void testIsMonotonicComparable_nonStrictDecreasingViolation_false() {
        Integer[] arr = {4, 1, 3};
        Assert.assertFalse(MathArrays.isMonotonic(arr, MathArrays.OrderDirection.DECREASING, false));
    }

    // ---------- isMonotonic (double[]) ----------
    @Test
    public void testIsMonotonicDouble_increasingStrict_true() {
        double[] arr = {1.0, 2.0, 3.0};
        Assert.assertTrue(MathArrays.isMonotonic(arr, MathArrays.OrderDirection.INCREASING, true));
    }

    @Test
    public void testIsMonotonicDouble_violatesOrder_false() {
        double[] arr = {3.0, 1.0, 2.0};
        Assert.assertFalse(MathArrays.isMonotonic(arr, MathArrays.OrderDirection.INCREASING, true));
    }

    // ---------- checkOrder(double[], dir, strict, abort) ----------
    @Test
    public void testCheckOrder_increasingStrictValid_returnsTrue() {
        double[] arr = {1.0, 2.0, 3.0};
        Assert.assertTrue(MathArrays.checkOrder(arr, MathArrays.OrderDirection.INCREASING, true, false));
    }

    @Test
    public void testCheckOrder_increasingStrictInvalidNoAbort_returnsFalse() {
        double[] arr = {1.0, 1.0, 3.0};
        Assert.assertFalse(MathArrays.checkOrder(arr, MathArrays.OrderDirection.INCREASING, true, false));
    }

    @Test
    public void testCheckOrder_increasingNonStrictValid_returnsTrue() {
        double[] arr = {1.0, 1.0, 3.0};
        Assert.assertTrue(MathArrays.checkOrder(arr, MathArrays.OrderDirection.INCREASING, false, false));
    }

    @Test
    public void testCheckOrder_increasingNonStrictInvalid_returnsFalse() {
        double[] arr = {1.0, 0.5, 3.0};
        Assert.assertFalse(MathArrays.checkOrder(arr, MathArrays.OrderDirection.INCREASING, false, false));
    }

    @Test
    public void testCheckOrder_decreasingStrictValid_returnsTrue() {
        double[] arr = {3.0, 2.0, 1.0};
        Assert.assertTrue(MathArrays.checkOrder(arr, MathArrays.OrderDirection.DECREASING, true, false));
    }

    @Test
    public void testCheckOrder_decreasingStrictInvalid_returnsFalse() {
        double[] arr = {3.0, 3.0, 1.0};
        Assert.assertFalse(MathArrays.checkOrder(arr, MathArrays.OrderDirection.DECREASING, true, false));
    }

    @Test
    public void testCheckOrder_decreasingNonStrictValid_returnsTrue() {
        double[] arr = {3.0, 3.0, 1.0};
        Assert.assertTrue(MathArrays.checkOrder(arr, MathArrays.OrderDirection.DECREASING, false, false));
    }

    @Test
    public void testCheckOrder_decreasingNonStrictInvalid_returnsFalse() {
        double[] arr = {3.0, 4.0, 1.0};
        Assert.assertFalse(MathArrays.checkOrder(arr, MathArrays.OrderDirection.DECREASING, false, false));
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder_invalidWithAbort_throwsException() {
        double[] arr = {1.0, 0.5, 3.0};
        MathArrays.checkOrder(arr, MathArrays.OrderDirection.INCREASING, true, true);
    }

    // ---------- checkOrder(double[], dir, strict) ----------
    @Test
    public void testCheckOrderThreeArg_valid_doesNotThrow() {
        double[] arr = {1.0, 2.0, 3.0};
        MathArrays.checkOrder(arr, MathArrays.OrderDirection.INCREASING, true);
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderThreeArg_invalid_throwsException() {
        double[] arr = {3.0, 2.0, 1.0};
        MathArrays.checkOrder(arr, MathArrays.OrderDirection.INCREASING, true);
    }

    // ---------- checkOrder(double[]) ----------
    @Test
    public void testCheckOrderOneArg_valid_doesNotThrow() {
        double[] arr = {1.0, 2.0, 3.0};
        MathArrays.checkOrder(arr);
    }

    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderOneArg_invalid_throwsException() {
        double[] arr = {3.0, 2.0, 1.0};
        MathArrays.checkOrder(arr);
    }

    // ---------- checkRectangular ----------
    @Test
    public void testCheckRectangular_valid_doesNotThrow() {
        long[][] arr = {{1, 2}, {3, 4}};
        MathArrays.checkRectangular(arr);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckRectangular_invalid_throwsException() {
        long[][] arr = {{1, 2}, {3}};
        MathArrays.checkRectangular(arr);
    }

    @Test(expected = NullArgumentException.class)
    public void testCheckRectangular_null_throwsException() {
        MathArrays.checkRectangular(null);
    }

    // ---------- checkPositive ----------
    @Test
    public void testCheckPositive_valid_doesNotThrow() {
        double[] arr = {1.0, 2.0, 3.0};
        MathArrays.checkPositive(arr);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositive_zero_throwsException() {
        double[] arr = {1.0, 0.0};
        MathArrays.checkPositive(arr);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositive_negative_throwsException() {
        double[] arr = {1.0, -1.0};
        MathArrays.checkPositive(arr);
    }

    // ---------- checkNonNegative(long[]) ----------
    @Test
    public void testCheckNonNegativeArray_valid_doesNotThrow() {
        long[] arr = {0, 1, 2};
        MathArrays.checkNonNegative(arr);
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegativeArray_negative_throwsException() {
        long[] arr = {0, -1};
        MathArrays.checkNonNegative(arr);
    }

    // ---------- checkNonNegative(long[][]) ----------
    @Test
    public void testCheckNonNegative2DArray_valid_doesNotThrow() {
        long[][] arr = {{0, 1}, {2, 3}};
        MathArrays.checkNonNegative(arr);
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegative2DArray_negative_throwsException() {
        long[][] arr = {{0, 1}, {-2, 3}};
        MathArrays.checkNonNegative(arr);
    }

    // ---------- safeNorm ----------
    @Test
    public void testSafeNorm_normal_returnsEuclideanNorm() {
        double[] v = {3.0, 4.0};
        Assert.assertEquals(5.0, MathArrays.safeNorm(v), 1e-9);
    }

    @Test
    public void testSafeNorm_withZeroVector_returnsZero() {
        double[] v = {0.0, 0.0, 0.0};
        Assert.assertEquals(0.0, MathArrays.safeNorm(v), 1e-9);
    }

    @Test
    public void testSafeNorm_largeValues_returnsCorrectNorm() {
        double[] v = {1e300, 1e300};
        double norm = MathArrays.safeNorm(v);
        Assert.assertTrue(norm > 0);
    }

    @Test
    public void testSafeNorm_smallValues_returnsCorrectNorm() {
        double[] v = {1e-300, 1e-300};
        double norm = MathArrays.safeNorm(v);
        Assert.assertTrue(norm >= 0);
    }

    // ---------- sortInPlace(double[], double[]...) ----------
    @Test
    public void testSortInPlace_normal_sortsAndPermutes() {
        double[] x = {3.0, 1.0, 2.0};
        double[] y = {1.0, 2.0, 3.0};
        double[] z = {0.0, 5.0, 7.0};
        MathArrays.sortInPlace(x, y, z);
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0}, x, 1e-12);
        Assert.assertArrayEquals(new double[]{2.0, 3.0, 1.0}, y, 1e-12);
        Assert.assertArrayEquals(new double[]{5.0, 7.0, 0.0}, z, 1e-12);
    }

    @Test(expected = NullArgumentException.class)
    public void testSortInPlace_nullX_throwsException() {
        double[] y = {1.0};
        MathArrays.sortInPlace(null, y);
    }

    @Test(expected = NullArgumentException.class)
    public void testSortInPlace_nullY_throwsException() {
        double[] x = {1.0, 2.0};
        double[] y = null;
        MathArrays.sortInPlace(x, y);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSortInPlace_mismatchedLength_throwsException() {
        double[] x = {1.0, 2.0};
        double[] y = {1.0};
        MathArrays.sortInPlace(x, y);
    }

    // ---------- sortInPlace(double[], OrderDirection, double[]...) ----------
    @Test
    public void testSortInPlaceWithDirection_decreasing_sortsCorrectly() {
        double[] x = {1.0, 3.0, 2.0};
        double[] y = {10.0, 30.0, 20.0};
        MathArrays.sortInPlace(x, MathArrays.OrderDirection.DECREASING, y);
        Assert.assertArrayEquals(new double[]{3.0, 2.0, 1.0}, x, 1e-12);
        Assert.assertArrayEquals(new double[]{30.0, 20.0, 10.0}, y, 1e-12);
    }

    @Test
    public void testSortInPlaceWithDirection_noYArrays_sortsX() {
        double[] x = {3.0, 1.0, 2.0};
        MathArrays.sortInPlace(x, MathArrays.OrderDirection.INCREASING);
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 3.0}, x, 1e-12);
    }

    // ---------- copyOf(int[]) ----------
    @Test
    public void testCopyOfInt_normal_returnsCopy() {
        int[] source = {1, 2, 3};
        int[] copy = MathArrays.copyOf(source);
        Assert.assertArrayEquals(source, copy);
        Assert.assertNotSame(source, copy);
    }

    // ---------- copyOf(double[]) ----------
    @Test
    public void testCopyOfDouble_normal_returnsCopy() {
        double[] source = {1.0, 2.0, 3.0};
        double[] copy = MathArrays.copyOf(source);
        Assert.assertArrayEquals(source, copy, 1e-12);
        Assert.assertNotSame(source, copy);
    }

    // ---------- copyOf(int[], int) ----------
    @Test
    public void testCopyOfIntWithLen_truncate_returnsTruncatedCopy() {
        int[] source = {1, 2, 3};
        int[] copy = MathArrays.copyOf(source, 2);
        Assert.assertArrayEquals(new int[]{1, 2}, copy);
    }

    @Test
    public void testCopyOfIntWithLen_pad_returnsPaddedCopy() {
        int[] source = {1, 2};
        int[] copy = MathArrays.copyOf(source, 4);
        Assert.assertArrayEquals(new int[]{1, 2, 0, 0}, copy);
    }

    // ---------- copyOf(double[], int) ----------
    @Test
    public void testCopyOfDoubleWithLen_truncate_returnsTruncatedCopy() {
        double[] source = {1.0, 2.0, 3.0};
        double[] copy = MathArrays.copyOf(source, 2);
        Assert.assertArrayEquals(new double[]{1.0, 2.0}, copy, 1e-12);
    }

    @Test
    public void testCopyOfDoubleWithLen_pad_returnsPaddedCopy() {
        double[] source = {1.0, 2.0};
        double[] copy = MathArrays.copyOf(source, 4);
        Assert.assertArrayEquals(new double[]{1.0, 2.0, 0.0, 0.0}, copy, 1e-12);
    }

    // ---------- linearCombination(double[], double[]) ----------
    @Test
    public void testLinearCombinationArrays_normal_returnsDotProduct() {
        double[] a = {1.0, 2.0, 3.0};
        double[] b = {4.0, 5.0, 6.0};
        double result = MathArrays.linearCombination(a, b);
        Assert.assertEquals(32.0, result, 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testLinearCombinationArrays_mismatchedLength_throwsException() {
        double[] a = {1.0, 2.0};
        double[] b = {1.0};
        MathArrays.linearCombination(a, b);
    }

    @Test
    public void testLinearCombinationArrays_withNaN_fallsBackToNaive() {
        double[] a = {1.0, Double.NaN};
        double[] b = {2.0, 3.0};
        double result = MathArrays.linearCombination(a, b);
        Assert.assertTrue(Double.isNaN(result));
    }

    // ---------- linearCombination(a1,b1,a2,b2) ----------
    @Test
    public void testLinearCombination2Terms_normal_returnsCorrectValue() {
        double result = MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0);
        Assert.assertEquals(14.0, result, 1e-9);
    }

    @Test
    public void testLinearCombination2Terms_withInfinite_fallsBackToNaive() {
        double result = MathArrays.linearCombination(Double.POSITIVE_INFINITY, 1.0, 1.0, 1.0);
        Assert.assertTrue(Double.isInfinite(result));
    }

    // ---------- linearCombination(a1,b1,a2,b2,a3,b3) ----------
    @Test
    public void testLinearCombination3Terms_normal_returnsCorrectValue() {
        double result = MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        Assert.assertEquals(44.0, result, 1e-9);
    }

    @Test
    public void testLinearCombination3Terms_withNaN_fallsBackToNaive() {
        double result = MathArrays.linearCombination(Double.NaN, 1.0, 1.0, 1.0, 1.0, 1.0);
        Assert.assertTrue(Double.isNaN(result));
    }

    // ---------- linearCombination(a1,b1,a2,b2,a3,b3,a4,b4) ----------
    @Test
    public void testLinearCombination4Terms_normal_returnsCorrectValue() {
        double result = MathArrays.linearCombination(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
        Assert.assertEquals(100.0, result, 1e-9);
    }

    @Test
    public void testLinearCombination4Terms_withInfinite_fallsBackToNaive() {
        double result = MathArrays.linearCombination(Double.POSITIVE_INFINITY, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
        Assert.assertTrue(Double.isInfinite(result));
    }

    // ---------- equals(float[], float[]) ----------
    @Test
    public void testEqualsFloat_bothNull_returnsTrue() {
        Assert.assertTrue(MathArrays.equals((float[]) null, (float[]) null));
    }

    @Test
    public void testEqualsFloat_oneNull_returnsFalse() {
        Assert.assertFalse(MathArrays.equals(new float[]{1.0f}, null));
        Assert.assertFalse(MathArrays.equals(null, new float[]{1.0f}));
    }

    @Test
    public void testEqualsFloat_differentLength_returnsFalse() {
        Assert.assertFalse(MathArrays.equals(new float[]{1.0f}, new float[]{1.0f, 2.0f}));
    }

    @Test
    public void testEqualsFloat_equalValues_returnsTrue() {
        Assert.assertTrue(MathArrays.equals(new float[]{1.0f, 2.0f}, new float[]{1.0f, 2.0f}));
    }

    @Test
    public void testEqualsFloat_differentValues_returnsFalse() {
        Assert.assertFalse(MathArrays.equals(new float[]{1.0f, 2.0f}, new float[]{1.0f, 3.0f}));
    }

    // ---------- equalsIncludingNaN(float[], float[]) ----------
    @Test
    public void testEqualsIncludingNaNFloat_bothNull_returnsTrue() {
        Assert.assertTrue(MathArrays.equalsIncludingNaN((float[]) null, (float[]) null));
    }

    @Test
    public void testEqualsIncludingNaNFloat_oneNull_returnsFalse() {
        Assert.assertFalse(MathArrays.equalsIncludingNaN(new float[]{1.0f}, null));
    }

    @Test
    public void testEqualsIncludingNaNFloat_differentLength_returnsFalse() {
        Assert.assertFalse(MathArrays.equalsIncludingNaN(new float[]{1.0f}, new float[]{1.0f, 2.0f}));
    }

    @Test
    public void testEqualsIncludingNaNFloat_withNaN_returnsTrue() {
        Assert.assertTrue(MathArrays.equalsIncludingNaN(new float[]{Float.NaN, 2.0f}, new float[]{Float.NaN, 2.0f}));
    }

    @Test
    public void testEqualsIncludingNaNFloat_differentValues_returnsFalse() {
        Assert.assertFalse(MathArrays.equalsIncludingNaN(new float[]{1.0f, 2.0f}, new float[]{1.0f, 3.0f}));
    }

    // ---------- equals(double[], double[]) ----------
    @Test
    public void testEqualsDouble_bothNull_returnsTrue() {
        Assert.assertTrue(MathArrays.equals((double[]) null, (double[]) null));
    }

    @Test
    public void testEqualsDouble_oneNull_returnsFalse() {
        Assert.assertFalse(MathArrays.equals(new double[]{1.0}, null));
    }

    @Test
    public void testEqualsDouble_differentLength_returnsFalse() {
        Assert.assertFalse(MathArrays.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
    }

    @Test
    public void testEqualsDouble_equalValues_returnsTrue() {
        Assert.assertTrue(MathArrays.equals(new double[]{1.0, 2.0}, new double[]{1.0, 2.0}));
    }

    @Test
    public void testEqualsDouble_differentValues_returnsFalse() {
        Assert.assertFalse(MathArrays.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
    }

    // ---------- equalsIncludingNaN(double[], double[]) ----------
    @Test
    public void testEqualsIncludingNaNDouble_bothNull_returnsTrue() {
        Assert.assertTrue(MathArrays.equalsIncludingNaN((double[]) null, (double[]) null));
    }

    @Test
    public void testEqualsIncludingNaNDouble_oneNull_returnsFalse() {
        Assert.assertFalse(MathArrays.equalsIncludingNaN(new double[]{1.0}, null));
    }

    @Test
    public void testEqualsIncludingNaNDouble_differentLength_returnsFalse() {
        Assert.assertFalse(MathArrays.equalsIncludingNaN(new double[]{1.0}, new double[]{1.0, 2.0}));
    }

    @Test
    public void testEqualsIncludingNaNDouble_withNaN_returnsTrue() {
        Assert.assertTrue(MathArrays.equalsIncludingNaN(new double[]{Double.NaN, 2.0}, new double[]{Double.NaN, 2.0}));
    }

    @Test
    public void testEqualsIncludingNaNDouble_differentValues_returnsFalse() {
        Assert.assertFalse(MathArrays.equalsIncludingNaN(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
    }

    // ---------- normalizeArray ----------
    @Test
    public void testNormalizeArray_normal_returnsNormalizedArray() {
        double[] values = {1.0, 2.0, 3.0};
        double[] result = MathArrays.normalizeArray(values, 12.0);
        double sum = 0;
        for (double v : result) {
            sum += v;
        }
        Assert.assertEquals(12.0, sum, 1e-9);
    }

    @Test
    public void testNormalizeArray_withNaNElement_keepsNaN() {
        double[] values = {1.0, Double.NaN, 3.0};
        double[] result = MathArrays.normalizeArray(values, 10.0);
        Assert.assertTrue(Double.isNaN(result[1]));
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArray_infiniteNormalizedSum_throwsException() {
        double[] values = {1.0, 2.0};
        MathArrays.normalizeArray(values, Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArray_nanNormalizedSum_throwsException() {
        double[] values = {1.0, 2.0};
        MathArrays.normalizeArray(values, Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArray_infiniteArrayElement_throwsException() {
        double[] values = {1.0, Double.POSITIVE_INFINITY};
        MathArrays.normalizeArray(values, 10.0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testNormalizeArray_sumZero_throwsException() {
        double[] values = {1.0, -1.0};
        MathArrays.normalizeArray(values, 10.0);
    }

    // ---------- buildArray(Field, int) ----------
    @Test
    public void testBuildArray1D_normal_returnsArrayFilledWithZero() {
        Field<BigReal> field = BigReal.ZERO.getField();
        BigReal[] array = MathArrays.buildArray(field, 3);
        Assert.assertEquals(3, array.length);
        for (BigReal b : array) {
            Assert.assertEquals(BigReal.ZERO, b);
        }
    }

    // ---------- buildArray(Field, int, int) ----------
    @Test
    public void testBuildArray2D_positiveColumns_returnsFilledArray() {
        Field<BigReal> field = BigReal.ZERO.getField();
        BigReal[][] array = MathArrays.buildArray(field, 2, 3);
        Assert.assertEquals(2, array.length);
        for (BigReal[] row : array) {
            Assert.assertEquals(3, row.length);
            for (BigReal b : row) {
                Assert.assertEquals(BigReal.ZERO, b);
            }
        }
    }

    @Test
    public void testBuildArray2D_negativeColumns_returnsPartialArray() {
        Field<BigReal> field = BigReal.ZERO.getField();
        BigReal[][] array = MathArrays.buildArray(field, 3, -1);
        Assert.assertEquals(3, array.length);
        for (BigReal[] row : array) {
            Assert.assertNull(row);
        }
    }

    // ---------- convolve ----------
    @Test
    public void testConvolve_normal_returnsConvolution() {
        double[] x = {1.0, 2.0, 3.0};
        double[] h = {0.0, 1.0, 0.5};
        double[] result = MathArrays.convolve(x, h);
        Assert.assertEquals(x.length + h.length - 1, result.length);
        // y[0] = x[0]*h[0] = 0
        Assert.assertEquals(0.0, result[0], 1e-9);
        // y[1] = x[0]*h[1] + x[1]*h[0] = 1
        Assert.assertEquals(1.0, result[1], 1e-9);
    }

    @Test(expected = NullArgumentException.class)
    public void testConvolve_nullX_throwsException() {
        MathArrays.convolve(null, new double[]{1.0});
    }

    @Test(expected = NullArgumentException.class)
    public void testConvolve_nullH_throwsException() {
        MathArrays.convolve(new double[]{1.0}, null);
    }

    @Test(expected = NoDataException.class)
    public void testConvolve_emptyX_throwsException() {
        MathArrays.convolve(new double[]{}, new double[]{1.0});
    }

    @Test(expected = NoDataException.class)
    public void testConvolve_emptyH_throwsException() {
        MathArrays.convolve(new double[]{1.0}, new double[]{});
    }
}
