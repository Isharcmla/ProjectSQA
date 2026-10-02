import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.StatisticalSummary;
import org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.NullArgumentException;

public class SummaryStatisticsTest {

    private SummaryStatistics stats;

    @Before
    public void setUp() {
        stats = new SummaryStatistics();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_newInstance_hasZeroN() {
        SummaryStatistics s = new SummaryStatistics();
        assertEquals(0, s.getN());
    }

    @Test
    public void testCopyConstructor_withValues_copiesState() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        SummaryStatistics copyStats = new SummaryStatistics(stats);
        assertEquals(stats.getN(), copyStats.getN());
        assertEquals(stats.getSum(), copyStats.getSum(), 1e-10);
        assertEquals(stats.getMean(), copyStats.getMean(), 1e-10);
        assertEquals(stats.getMax(), copyStats.getMax(), 1e-10);
        assertEquals(stats.getMin(), copyStats.getMin(), 1e-10);
    }

    // ---------- addValue and basic getters ----------

    @Test
    public void testAddValue_normalInputs_computesCorrectStatistics() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        assertEquals(3, stats.getN());
        assertEquals(6.0, stats.getSum(), 1e-10);
        assertEquals(2.0, stats.getMean(), 1e-10);
        assertEquals(1.0, stats.getMin(), 1e-10);
        assertEquals(3.0, stats.getMax(), 1e-10);
        assertEquals(14.0, stats.getSumsq(), 1e-10);
    }

    @Test
    public void testAddValue_negativeValues_computesCorrectStatistics() {
        stats.addValue(-1.0);
        stats.addValue(-2.0);
        stats.addValue(-3.0);
        assertEquals(3, stats.getN());
        assertEquals(-6.0, stats.getSum(), 1e-10);
        assertEquals(-2.0, stats.getMean(), 1e-10);
        assertEquals(-3.0, stats.getMin(), 1e-10);
        assertEquals(-1.0, stats.getMax(), 1e-10);
    }

    @Test
    public void testAddValue_zeroValue_computesCorrectStatistics() {
        stats.addValue(0.0);
        assertEquals(1, stats.getN());
        assertEquals(0.0, stats.getSum(), 1e-10);
        assertEquals(0.0, stats.getMean(), 1e-10);
    }

    @Test
    public void testGetN_noValuesAdded_returnsZero() {
        assertEquals(0, stats.getN());
    }

    @Test
    public void testGetSum_noValuesAdded_returnsZero() {
        // Sum of no values is 0.0 per commons-math Sum implementation
        assertEquals(0.0, stats.getSum(), 1e-10);
    }

    @Test
    public void testGetMean_noValuesAdded_returnsNaN() {
        assertTrue(Double.isNaN(stats.getMean()));
    }

    @Test
    public void testGetMax_noValuesAdded_returnsNaN() {
        assertTrue(Double.isNaN(stats.getMax()));
    }

    @Test
    public void testGetMin_noValuesAdded_returnsNaN() {
        assertTrue(Double.isNaN(stats.getMin()));
    }

    @Test
    public void testGetVariance_noValuesAdded_returnsNaN() {
        assertTrue(Double.isNaN(stats.getVariance()));
    }

    @Test
    public void testGetVariance_singleValue_returnsZero() {
        stats.addValue(5.0);
        assertEquals(0.0, stats.getVariance(), 1e-10);
    }

    @Test
    public void testGetPopulationVariance_withValues_computesCorrectly() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        double popVar = stats.getPopulationVariance();
        assertEquals(2.0 / 3.0, popVar, 1e-10);
    }

    @Test
    public void testGetStandardDeviation_noValuesAdded_returnsNaN() {
        assertTrue(Double.isNaN(stats.getStandardDeviation()));
    }

    @Test
    public void testGetStandardDeviation_singleValue_returnsZero() {
        stats.addValue(5.0);
        assertEquals(0.0, stats.getStandardDeviation(), 1e-10);
    }

    @Test
    public void testGetStandardDeviation_multipleValues_returnsSqrtOfVariance() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        double expected = Math.sqrt(stats.getVariance());
        assertEquals(expected, stats.getStandardDeviation(), 1e-10);
    }

    @Test
    public void testGetGeometricMean_noValuesAdded_returnsNaN() {
        assertTrue(Double.isNaN(stats.getGeometricMean()));
    }

    @Test
    public void testGetGeometricMean_withPositiveValues_computesCorrectly() {
        stats.addValue(2.0);
        stats.addValue(8.0);
        double expected = Math.sqrt(16.0);
        assertEquals(expected, stats.getGeometricMean(), 1e-10);
    }

    @Test
    public void testGetSumOfLogs_noValuesAdded_returnsNaN() {
        assertTrue(Double.isNaN(stats.getSumOfLogs()));
    }

    @Test
    public void testGetSumOfLogs_withValues_computesCorrectly() {
        stats.addValue(1.0);
        stats.addValue(Math.E);
        double expected = Math.log(1.0) + Math.log(Math.E);
        assertEquals(expected, stats.getSumOfLogs(), 1e-10);
    }

    @Test
    public void testGetSecondMoment_noValuesAdded_returnsNaN() {
        assertTrue(Double.isNaN(stats.getSecondMoment()));
    }

    @Test
    public void testGetSecondMoment_singleValue_returnsZero() {
        stats.addValue(5.0);
        assertEquals(0.0, stats.getSecondMoment(), 1e-10);
    }

    @Test
    public void testGetSecondMoment_multipleValues_computesCorrectly() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        // sum of squared deviations from mean(2.0): 1 + 0 + 1 = 2
        assertEquals(2.0, stats.getSecondMoment(), 1e-10);
    }

    @Test
    public void testGetSumsq_noValuesAdded_returnsZero() {
        assertEquals(0.0, stats.getSumsq(), 1e-10);
    }

    // ---------- getSummary ----------

    @Test
    public void testGetSummary_withValues_returnsCorrectStatisticalSummary() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        StatisticalSummary summary = stats.getSummary();
        assertEquals(stats.getMean(), summary.getMean(), 1e-10);
        assertEquals(stats.getVariance(), summary.getVariance(), 1e-10);
        assertEquals(stats.getN(), summary.getN());
        assertEquals(stats.getMax(), summary.getMax(), 1e-10);
        assertEquals(stats.getMin(), summary.getMin(), 1e-10);
        assertEquals(stats.getSum(), summary.getSum(), 1e-10);
    }

    // ---------- toString ----------

    @Test
    public void testToString_withValues_containsExpectedLabels() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        String result = stats.toString();
        assertTrue(result.contains("SummaryStatistics:"));
        assertTrue(result.contains("n: "));
        assertTrue(result.contains("min: "));
        assertTrue(result.contains("max: "));
        assertTrue(result.contains("mean: "));
        assertTrue(result.contains("geometric mean: "));
        assertTrue(result.contains("variance: "));
        assertTrue(result.contains("sum of squares: "));
        assertTrue(result.contains("standard deviation: "));
        assertTrue(result.contains("sum of logs: "));
    }

    @Test
    public void testToString_noValuesAdded_doesNotThrow() {
        String result = stats.toString();
        assertNotNull(result);
    }

    // ---------- clear ----------

    @Test
    public void testClear_afterAddingValues_resetsState() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.clear();
        assertEquals(0, stats.getN());
        assertTrue(Double.isNaN(stats.getMean()));
        assertTrue(Double.isNaN(stats.getMax()));
        assertTrue(Double.isNaN(stats.getMin()));
    }

    @Test
    public void testClear_withCustomMeanImpl_clearsCustomImpl() {
        Mean customMean = new Mean();
        stats.setMeanImpl(customMean);
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.clear();
        assertEquals(0, stats.getN());
    }

    @Test
    public void testClear_withCustomVarianceImpl_clearsCustomImpl() {
        Variance customVariance = new Variance();
        stats.setVarianceImpl(customVariance);
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.clear();
        assertEquals(0, stats.getN());
    }

    @Test
    public void testClear_afterClear_canAddValuesAgain() {
        stats.addValue(1.0);
        stats.clear();
        stats.addValue(5.0);
        assertEquals(1, stats.getN());
        assertEquals(5.0, stats.getMean(), 1e-10);
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(stats.equals(stats));
    }

    @Test
    public void testEquals_nonSummaryStatisticsObject_returnsFalse() {
        assertFalse(stats.equals("not a summary statistics"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(stats.equals(null));
    }

    @Test
    public void testEquals_equivalentStatistics_returnsTrue() {
        SummaryStatistics s1 = new SummaryStatistics();
        SummaryStatistics s2 = new SummaryStatistics();
        s1.addValue(1.0);
        s1.addValue(2.0);
        s2.addValue(1.0);
        s2.addValue(2.0);
        assertTrue(s1.equals(s2));
        assertTrue(s2.equals(s1));
    }

    @Test
    public void testEquals_differentStatistics_returnsFalse() {
        SummaryStatistics s1 = new SummaryStatistics();
        SummaryStatistics s2 = new SummaryStatistics();
        s1.addValue(1.0);
        s2.addValue(2.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testHashCode_equivalentStatistics_haveSameHashCode() {
        SummaryStatistics s1 = new SummaryStatistics();
        SummaryStatistics s2 = new SummaryStatistics();
        s1.addValue(1.0);
        s1.addValue(2.0);
        s2.addValue(1.0);
        s2.addValue(2.0);
        assertEquals(s1.hashCode(), s2.hashCode());
    }

    @Test
    public void testHashCode_noValuesAdded_doesNotThrow() {
        int code = stats.hashCode();
        assertTrue(true); // just verify no exception thrown
    }

    // ---------- Getter / setter impls ----------

    @Test
    public void testGetSetSumImpl_customImplementation_setsCorrectly() {
        Sum customSum = new Sum();
        stats.setSumImpl(customSum);
        assertSame(customSum, stats.getSumImpl());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetSumImpl_afterAddingValues_throwsException() {
        stats.addValue(1.0);
        stats.setSumImpl(new Sum());
    }

    @Test
    public void testGetSetSumsqImpl_customImplementation_setsCorrectly() {
        SumOfSquares customSumsq = new SumOfSquares();
        stats.setSumsqImpl(customSumsq);
        assertSame(customSumsq, stats.getSumsqImpl());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetSumsqImpl_afterAddingValues_throwsException() {
        stats.addValue(1.0);
        stats.setSumsqImpl(new SumOfSquares());
    }

    @Test
    public void testGetSetMinImpl_customImplementation_setsCorrectly() {
        Min customMin = new Min();
        stats.setMinImpl(customMin);
        assertSame(customMin, stats.getMinImpl());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetMinImpl_afterAddingValues_throwsException() {
        stats.addValue(1.0);
        stats.setMinImpl(new Min());
    }

    @Test
    public void testGetSetMaxImpl_customImplementation_setsCorrectly() {
        Max customMax = new Max();
        stats.setMaxImpl(customMax);
        assertSame(customMax, stats.getMaxImpl());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetMaxImpl_afterAddingValues_throwsException() {
        stats.addValue(1.0);
        stats.setMaxImpl(new Max());
    }

    @Test
    public void testGetSetSumLogImpl_customImplementation_setsCorrectly() {
        SumOfLogs customSumLog = new SumOfLogs();
        stats.setSumLogImpl(customSumLog);
        assertSame(customSumLog, stats.getSumLogImpl());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetSumLogImpl_afterAddingValues_throwsException() {
        stats.addValue(1.0);
        stats.setSumLogImpl(new SumOfLogs());
    }

    @Test
    public void testGetSetGeoMeanImpl_customImplementation_setsCorrectly() {
        GeometricMean customGeoMean = new GeometricMean();
        stats.setGeoMeanImpl(customGeoMean);
        assertSame(customGeoMean, stats.getGeoMeanImpl());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetGeoMeanImpl_afterAddingValues_throwsException() {
        stats.addValue(1.0);
        stats.setGeoMeanImpl(new GeometricMean());
    }

    @Test
    public void testGetSetMeanImpl_customImplementation_setsCorrectly() {
        Mean customMean = new Mean();
        stats.setMeanImpl(customMean);
        assertSame(customMean, stats.getMeanImpl());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetMeanImpl_afterAddingValues_throwsException() {
        stats.addValue(1.0);
        stats.setMeanImpl(new Mean());
    }

    @Test
    public void testGetSetVarianceImpl_customImplementation_setsCorrectly() {
        Variance customVariance = new Variance();
        stats.setVarianceImpl(customVariance);
        assertSame(customVariance, stats.getVarianceImpl());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetVarianceImpl_afterAddingValues_throwsException() {
        stats.addValue(1.0);
        stats.setVarianceImpl(new Variance());
    }

    @Test
    public void testAddValue_withCustomMeanImpl_incrementsCustomImpl() {
        Mean customMean = new Mean();
        stats.setMeanImpl(customMean);
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        assertEquals(2.0, stats.getMean(), 1e-10);
    }

    @Test
    public void testAddValue_withCustomVarianceImpl_incrementsCustomImpl() {
        Variance customVariance = new Variance();
        stats.setVarianceImpl(customVariance);
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        assertEquals(1.0, stats.getVariance(), 1e-10);
    }

    @Test
    public void testAddValue_withCustomGeoMeanImpl_incrementsCustomImpl() {
        GeometricMean customGeoMean = new GeometricMean();
        stats.setGeoMeanImpl(customGeoMean);
        stats.addValue(2.0);
        stats.addValue(8.0);
        assertEquals(4.0, stats.getGeometricMean(), 1e-10);
    }

    // ---------- copy() instance method ----------

    @Test
    public void testCopy_instanceMethod_returnsEqualCopy() {
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        SummaryStatistics copyStats = stats.copy();
        assertEquals(stats.getN(), copyStats.getN());
        assertEquals(stats.getMean(), copyStats.getMean(), 1e-10);
        assertEquals(stats.getVariance(), copyStats.getVariance(), 1e-10);
        assertEquals(stats.getSum(), copyStats.getSum(), 1e-10);
        assertTrue(stats.equals(copyStats));
    }

    // ---------- static copy(source, dest) ----------

    @Test
    public void testStaticCopy_validSourceAndDest_copiesCorrectly() {
        SummaryStatistics source = new SummaryStatistics();
        source.addValue(10.0);
        source.addValue(20.0);
        SummaryStatistics dest = new SummaryStatistics();
        SummaryStatistics.copy(source, dest);
        assertEquals(source.getN(), dest.getN());
        assertEquals(source.getMean(), dest.getMean(), 1e-10);
        assertEquals(source.getSum(), dest.getSum(), 1e-10);
    }

    @Test
    public void testStaticCopy_withCustomVarianceImpl_copiesCustomImpl() {
        SummaryStatistics source = new SummaryStatistics();
        Variance customVariance = new Variance();
        source.setVarianceImpl(customVariance);
        source.addValue(1.0);
        source.addValue(2.0);
        SummaryStatistics dest = new SummaryStatistics();
        SummaryStatistics.copy(source, dest);
        assertEquals(source.getVariance(), dest.getVariance(), 1e-10);
    }

    @Test
    public void testStaticCopy_withCustomMeanImpl_copiesCustomImpl() {
        SummaryStatistics source = new SummaryStatistics();
        Mean customMean = new Mean();
        source.setMeanImpl(customMean);
        source.addValue(1.0);
        source.addValue(2.0);
        SummaryStatistics dest = new SummaryStatistics();
        SummaryStatistics.copy(source, dest);
        assertEquals(source.getMean(), dest.getMean(), 1e-10);
    }

    @Test
    public void testStaticCopy_withCustomGeoMeanImpl_copiesCustomImpl() {
        SummaryStatistics source = new SummaryStatistics();
        GeometricMean customGeoMean = new GeometricMean();
        source.setGeoMeanImpl(customGeoMean);
        source.addValue(2.0);
        source.addValue(8.0);
        SummaryStatistics dest = new SummaryStatistics();
        SummaryStatistics.copy(source, dest);
        assertEquals(source.getGeometricMean(), dest.getGeometricMean(), 1e-10);
    }

    @Test(expected = NullArgumentException.class)
    public void testStaticCopy_nullSource_throwsNullArgumentException() {
        SummaryStatistics dest = new SummaryStatistics();
        SummaryStatistics.copy(null, dest);
    }

    @Test(expected = NullArgumentException.class)
    public void testStaticCopy_nullDest_throwsNullArgumentException() {
        SummaryStatistics source = new SummaryStatistics();
        SummaryStatistics.copy(source, null);
    }

    @Test
    public void testStaticCopy_sameMaxInstanceAsImpl_copiesReferenceCorrectly() {
        SummaryStatistics source = new SummaryStatistics();
        source.addValue(1.0);
        source.addValue(5.0);
        SummaryStatistics dest = new SummaryStatistics();
        SummaryStatistics.copy(source, dest);
        assertEquals(source.getMax(), dest.getMax(), 1e-10);
        assertEquals(source.getMin(), dest.getMin(), 1e-10);
    }
}
