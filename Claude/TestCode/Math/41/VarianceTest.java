import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.exception.NullArgumentException;

public class VarianceTest {

    private Variance variance;
    private final double[] testArray = {1.0, 2.0, 3.0, 4.0, 5.0};

    @Before
    public void setUp() {
        variance = new Variance();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_create_biasCorrectedTrue() {
        Variance v = new Variance();
        assertTrue(v.isBiasCorrected());
        assertEquals(0, v.getN());
    }

    @Test
    public void testSecondMomentConstructor_create_incMomentFalse() {
        SecondMoment m2 = new SecondMoment();
        Variance v = new Variance(m2);
        // incMoment is false, increment should do nothing
        v.increment(5.0);
        assertEquals(0, m2.getN());
    }

    @Test
    public void testBooleanConstructor_falseBiasCorrection_returnsFalse() {
        Variance v = new Variance(false);
        assertFalse(v.isBiasCorrected());
    }

    @Test
    public void testBooleanConstructor_trueBiasCorrection_returnsTrue() {
        Variance v = new Variance(true);
        assertTrue(v.isBiasCorrected());
    }

    @Test
    public void testBooleanAndSecondMomentConstructor_create_propertiesSet() {
        SecondMoment m2 = new SecondMoment();
        Variance v = new Variance(false, m2);
        assertFalse(v.isBiasCorrected());
        v.increment(5.0);
        assertEquals(0, m2.getN());
    }

    @Test
    public void testCopyConstructor_copyOriginal_sameValues() {
        Variance original = new Variance();
        original.increment(1.0);
        original.increment(2.0);
        original.increment(3.0);
        Variance copyVar = new Variance(original);
        assertEquals(original.getResult(), copyVar.getResult(), 1e-10);
        assertEquals(original.getN(), copyVar.getN());
        assertEquals(original.isBiasCorrected(), copyVar.isBiasCorrected());
    }

    // ---------- increment / getResult / getN / clear ----------

    @Test
    public void testIncrement_singleValue_resultZero() {
        variance.increment(5.0);
        assertEquals(0d, variance.getResult(), 1e-10);
    }

    @Test
    public void testIncrement_noValues_resultNaN() {
        assertTrue(Double.isNaN(variance.getResult()));
    }

    @Test
    public void testIncrement_multipleValues_biasCorrected() {
        variance.increment(1.0);
        variance.increment(2.0);
        variance.increment(3.0);
        // mean=2, sum sq dev=2, n-1=2 -> variance=1
        assertEquals(1.0, variance.getResult(), 1e-10);
    }

    @Test
    public void testIncrement_multipleValues_biasNotCorrected() {
        Variance v = new Variance(false);
        v.increment(1.0);
        v.increment(2.0);
        v.increment(3.0);
        // sum sq dev=2, n=3 -> variance=2/3
        assertEquals(2.0 / 3.0, v.getResult(), 1e-10);
    }

    @Test
    public void testGetN_afterIncrements_correctCount() {
        variance.increment(1.0);
        variance.increment(2.0);
        assertEquals(2, variance.getN());
    }

    @Test
    public void testClear_afterIncrement_resetsState() {
        variance.increment(1.0);
        variance.increment(2.0);
        variance.clear();
        assertEquals(0, variance.getN());
        assertTrue(Double.isNaN(variance.getResult()));
    }

    @Test
    public void testClear_withExternalSecondMoment_doesNotClear() {
        SecondMoment m2 = new SecondMoment();
        m2.increment(1.0);
        m2.increment(2.0);
        Variance v = new Variance(m2);
        v.clear();
        // incMoment is false, so clear should not affect moment
        assertEquals(2, m2.getN());
    }

    @Test
    public void testIncrementViaExternalMoment_incrementsVariance() {
        SecondMoment m2 = new SecondMoment();
        Variance v = new Variance(m2);
        m2.increment(1.0);
        m2.increment(2.0);
        m2.increment(3.0);
        assertEquals(1.0, v.getResult(), 1e-10);
    }

    // ---------- evaluate(double[]) ----------

    @Test
    public void testEvaluateArray_normalInput_correctVariance() {
        double result = variance.evaluate(testArray);
        assertEquals(2.5, result, 1e-10);
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateArray_nullArray_throwsException() {
        double[] nullArray = null;
        variance.evaluate(nullArray);
    }

    @Test
    public void testEvaluateArray_emptyArray_returnsNaN() {
        double[] emptyArray = {};
        double result = variance.evaluate(emptyArray);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testEvaluateArray_singleValue_returnsZero() {
        double[] singleValue = {5.0};
        double result = variance.evaluate(singleValue);
        assertEquals(0d, result, 1e-10);
    }

    // ---------- evaluate(double[], begin, length) ----------

    @Test
    public void testEvaluateArrayBeginLength_normalInput_correctVariance() {
        double result = variance.evaluate(testArray, 0, 5);
        assertEquals(2.5, result, 1e-10);
    }

    @Test
    public void testEvaluateArrayBeginLength_subArray_correctVariance() {
        double result = variance.evaluate(testArray, 1, 3);
        // subarray {2,3,4} mean=3, sumSqDev=2, n-1=2 -> variance=1
        assertEquals(1.0, result, 1e-10);
    }

    @Test
    public void testEvaluateArrayBeginLength_lengthZero_returnsNaN() {
        double result = variance.evaluate(testArray, 0, 0);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testEvaluateArrayBeginLength_lengthOne_returnsZero() {
        double result = variance.evaluate(testArray, 2, 1);
        assertEquals(0d, result, 1e-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateArrayBeginLength_invalidBegin_throwsException() {
        variance.evaluate(testArray, -1, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateArrayBeginLength_invalidLength_throwsException() {
        variance.evaluate(testArray, 0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateArrayBeginLength_exceedsBounds_throwsException() {
        variance.evaluate(testArray, 2, 10);
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateArrayBeginLength_nullArray_throwsException() {
        double[] nullArray = null;
        variance.evaluate(nullArray, 0, 1);
    }

    @Test
    public void testEvaluateArrayBeginLength_biasNotCorrected_correctVariance() {
        Variance v = new Variance(false);
        double result = v.evaluate(testArray, 0, 5);
        // mean = 3, sumSqDev=10, n=5 -> variance=2.0
        assertEquals(2.0, result, 1e-10);
    }

    // ---------- evaluate(double[], weights, begin, length) ----------

    @Test
    public void testEvaluateWeightedArray_normalInput_correctVariance() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double result = variance.evaluate(values, weights, 0, 3);
        assertEquals(1.0, result, 1e-10);
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateWeightedArray_nullValues_throwsException() {
        double[] weights = {1.0, 1.0};
        double[] values = null;
        variance.evaluate(values, weights, 0, 2);
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateWeightedArray_nullWeights_throwsException() {
        double[] values = {1.0, 2.0};
        double[] weights = null;
        variance.evaluate(values, weights, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateWeightedArray_mismatchedLength_throwsException() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0};
        variance.evaluate(values, weights, 0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateWeightedArray_negativeWeight_throwsException() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, -1.0, 1.0};
        variance.evaluate(values, weights, 0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateWeightedArray_NaNWeight_throwsException() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, Double.NaN, 1.0};
        variance.evaluate(values, weights, 0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateWeightedArray_InfiniteWeight_throwsException() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, Double.POSITIVE_INFINITY, 1.0};
        variance.evaluate(values, weights, 0, 3);
    }

    @Test
    public void testEvaluateWeightedArray_lengthOne_returnsZero() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double result = variance.evaluate(values, weights, 1, 1);
        assertEquals(0d, result, 1e-10);
    }

    @Test
    public void testEvaluateWeightedArray_emptyLength_returnsNaN() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double result = variance.evaluate(values, weights, 0, 0);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testEvaluateWeightedArray_differentWeights_correctVariance() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {2.0, 1.0, 2.0};
        double result = variance.evaluate(values, weights, 0, 3);
        assertFalse(Double.isNaN(result));
    }

    // ---------- evaluate(double[], weights) ----------

    @Test
    public void testEvaluateWeighted_normalInput_correctVariance() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double result = variance.evaluate(values, weights);
        assertEquals(1.0, result, 1e-10);
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateWeighted_nullValues_throwsException() {
        double[] values = null;
        double[] weights = {1.0, 1.0};
        variance.evaluate(values, weights);
    }

    // ---------- evaluate(double[], mean, begin, length) ----------

    @Test
    public void testEvaluateWithMean_normalInput_correctVariance() {
        double result = variance.evaluate(testArray, 3.0, 0, 5);
        assertEquals(2.5, result, 1e-10);
    }

    @Test
    public void testEvaluateWithMean_lengthOne_returnsZero() {
        double result = variance.evaluate(testArray, 3.0, 2, 1);
        assertEquals(0d, result, 1e-10);
    }

    @Test
    public void testEvaluateWithMean_lengthZero_returnsNaN() {
        double result = variance.evaluate(testArray, 3.0, 0, 0);
        assertTrue(Double.isNaN(result));
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateWithMean_nullArray_throwsException() {
        double[] nullArray = null;
        variance.evaluate(nullArray, 3.0, 0, 1);
    }

    @Test
    public void testEvaluateWithMean_biasNotCorrected_correctVariance() {
        Variance v = new Variance(false);
        double result = v.evaluate(testArray, 3.0, 0, 5);
        assertEquals(2.0, result, 1e-10);
    }

    // ---------- evaluate(double[], mean) ----------

    @Test
    public void testEvaluateWithMeanFullArray_normalInput_correctVariance() {
        double result = variance.evaluate(testArray, 3.0);
        assertEquals(2.5, result, 1e-10);
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateWithMeanFullArray_nullArray_throwsException() {
        double[] nullArray = null;
        variance.evaluate(nullArray, 3.0);
    }

    // ---------- evaluate(double[], weights, mean, begin, length) ----------

    @Test
    public void testEvaluateWeightedWithMean_normalInput_correctVariance() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double result = variance.evaluate(values, weights, 2.0, 0, 3);
        assertEquals(1.0, result, 1e-10);
    }

    @Test
    public void testEvaluateWeightedWithMean_lengthOne_returnsZero() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double result = variance.evaluate(values, weights, 2.0, 1, 1);
        assertEquals(0d, result, 1e-10);
    }

    @Test
    public void testEvaluateWeightedWithMean_lengthZero_returnsNaN() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double result = variance.evaluate(values, weights, 2.0, 0, 0);
        assertTrue(Double.isNaN(result));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateWeightedWithMean_mismatchedLength_throwsException() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0};
        variance.evaluate(values, weights, 2.0, 0, 3);
    }

    @Test
    public void testEvaluateWeightedWithMean_biasNotCorrected_correctVariance() {
        Variance v = new Variance(false);
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double result = v.evaluate(values, weights, 2.0, 0, 3);
        // sum sq dev=2, sumWts=3 -> variance=2/3
        assertEquals(2.0 / 3.0, result, 1e-10);
    }

    // ---------- evaluate(double[], weights, mean) ----------

    @Test
    public void testEvaluateWeightedWithMeanFullArray_normalInput_correctVariance() {
        double[] values = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double result = variance.evaluate(values, weights, 2.0);
        assertEquals(1.0, result, 1e-10);
    }

    // ---------- isBiasCorrected / setBiasCorrected ----------

    @Test
    public void testIsBiasCorrected_defaultValue_true() {
        assertTrue(variance.isBiasCorrected());
    }

    @Test
    public void testSetBiasCorrected_setFalse_returnsFalse() {
        variance.setBiasCorrected(false);
        assertFalse(variance.isBiasCorrected());
    }

    @Test
    public void testSetBiasCorrected_setTrue_returnsTrue() {
        variance.setBiasCorrected(false);
        variance.setBiasCorrected(true);
        assertTrue(variance.isBiasCorrected());
    }

    // ---------- copy() instance method ----------

    @Test
    public void testCopy_instanceMethod_createsIdenticalCopy() {
        variance.increment(1.0);
        variance.increment(2.0);
        variance.increment(3.0);
        Variance copyVar = variance.copy();
        assertEquals(variance.getResult(), copyVar.getResult(), 1e-10);
        assertEquals(variance.getN(), copyVar.getN());
        assertNotSame(variance, copyVar);
    }

    // ---------- copy(source, dest) static method ----------

    @Test
    public void testCopyStatic_validSourceAndDest_copiesCorrectly() {
        Variance source = new Variance();
        source.increment(1.0);
        source.increment(2.0);
        source.increment(3.0);
        Variance dest = new Variance();
        Variance.copy(source, dest);
        assertEquals(source.getResult(), dest.getResult(), 1e-10);
        assertEquals(source.getN(), dest.getN());
        assertEquals(source.isBiasCorrected(), dest.isBiasCorrected());
    }

    @Test(expected = NullArgumentException.class)
    public void testCopyStatic_nullSource_throwsException() {
        Variance dest = new Variance();
        Variance.copy(null, dest);
    }

    @Test(expected = NullArgumentException.class)
    public void testCopyStatic_nullDest_throwsException() {
        Variance source = new Variance();
        Variance.copy(source, null);
    }
}
