package org.apache.commons.math.stat.descriptive;

import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.junit.Assert;
import org.junit.Test;

public class SummaryStatisticsTest {

    private static final double TOLERANCE = 1e-10;

    private static class DummyStorelessStatistic implements StorelessUnivariateStatistic {
        private double count = 0;
        private double lastVal = 0;

        public void increment(double d) {
            count++;
            lastVal = d;
        }

        public void incrementAll(double[] values) {
            if (values != null) {
                for (double v : values) {
                    increment(v);
                }
            }
        }

        public void incrementAll(double[] values, int begin, int length) {
            if (values != null) {
                for (int i = begin; i < begin + length; i++) {
                    increment(values[i]);
                }
            }
        }

        public double getResult() {
            return count;
        }

        public long getN() {
            return (long) count;
        }

        public void clear() {
            count = 0;
            lastVal = 0;
        }

        public StorelessUnivariateStatistic copy() {
            DummyStorelessStatistic copy = new DummyStorelessStatistic();
            copy.count = this.count;
            copy.lastVal = this.lastVal;
            return copy;
        }

        public double evaluate(double[] values) {
            return values.length;
        }

        public double evaluate(double[] values, int begin, int length) {
            return length;
        }
    }

    @Test
    public void testDefaultConstructorAndEmptyState() {
        SummaryStatistics stats = new SummaryStatistics();
        Assert.assertEquals(0, stats.getN());
        Assert.assertTrue(Double.isNaN(stats.getMean()));
        Assert.assertTrue(Double.isNaN(stats.getVariance()));
        Assert.assertTrue(Double.isNaN(stats.getPopulationVariance()));
        Assert.assertTrue(Double.isNaN(stats.getStandardDeviation()));
        Assert.assertTrue(Double.isNaN(stats.getMax()));
        Assert.assertTrue(Double.isNaN(stats.getMin()));
        Assert.assertTrue(Double.isNaN(stats.getSum()));
        Assert.assertTrue(Double.isNaN(stats.getSumsq()));
        Assert.assertTrue(Double.isNaN(stats.getGeometricMean()));
        Assert.assertTrue(Double.isNaN(stats.getSumOfLogs()));
        Assert.assertTrue(Double.isNaN(stats.getSecondMoment()));
    }

    @Test
    public void testAddSingleValue() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(5.0);

        Assert.assertEquals(1, stats.getN());
        Assert.assertEquals(5.0, stats.getMean(), TOLERANCE);
        Assert.assertEquals(0.0, stats.getVariance(), TOLERANCE);
        Assert.assertEquals(0.0, stats.getPopulationVariance(), TOLERANCE);
        Assert.assertEquals(0.0, stats.getStandardDeviation(), TOLERANCE);
        Assert.assertEquals(5.0, stats.getMax(), TOLERANCE);
        Assert.assertEquals(5.0, stats.getMin(), TOLERANCE);
        Assert.assertEquals(5.0, stats.getSum(), TOLERANCE);
        Assert.assertEquals(25.0, stats.getSumsq(), TOLERANCE);
        Assert.assertEquals(5.0, stats.getGeometricMean(), TOLERANCE);
        Assert.assertEquals(Math.log(5.0), stats.getSumOfLogs(), TOLERANCE);
        Assert.assertEquals(0.0, stats.getSecondMoment(), TOLERANCE);
    }

    @Test
    public void testAddMultipleValues() {
        SummaryStatistics stats = new SummaryStatistics();
        double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
        for (double v : values) {
            stats.addValue(v);
        }

        Assert.assertEquals(5, stats.getN());
        Assert.assertEquals(3.0, stats.getMean(), TOLERANCE);
        Assert.assertEquals(2.5, stats.getVariance(), TOLERANCE);
        Assert.assertEquals(2.0, stats.getPopulationVariance(), TOLERANCE);
        Assert.assertEquals(Math.sqrt(2.5), stats.getStandardDeviation(), TOLERANCE);
        Assert.assertEquals(5.0, stats.getMax(), TOLERANCE);
        Assert.assertEquals(1.0, stats.getMin(), TOLERANCE);
        Assert.assertEquals(15.0, stats.getSum(), TOLERANCE);
        Assert.assertEquals(55.0, stats.getSumsq(), TOLERANCE);
        Assert.assertEquals(10.0, stats.getSecondMoment(), TOLERANCE);
        Assert.assertTrue(stats.getGeometricMean() > 0);
        Assert.assertTrue(stats.getSumOfLogs() > 0);
    }

    @Test
    public void testGetSummary() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(10.0);
        stats.addValue(20.0);

        StatisticalSummary summary = stats.getSummary();
        Assert.assertNotNull(summary);
        Assert.assertEquals(stats.getMean(), summary.getMean(), TOLERANCE);
        Assert.assertEquals(stats.getVariance(), summary.getVariance(), TOLERANCE);
        Assert.assertEquals(stats.getN(), summary.getN());
        Assert.assertEquals(stats.getMax(), summary.getMax(), TOLERANCE);
        Assert.assertEquals(stats.getMin(), summary.getMin(), TOLERANCE);
        Assert.assertEquals(stats.getSum(), summary.getSum(), TOLERANCE);
        Assert.assertEquals(stats.getStandardDeviation(), summary.getStandardDeviation(), TOLERANCE);
    }

    @Test
    public void testToString() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(2.0);
        stats.addValue(4.0);

        String str = stats.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("SummaryStatistics:"));
        Assert.assertTrue(str.contains("n: 2"));
        Assert.assertTrue(str.contains("min: 2.0"));
        Assert.assertTrue(str.contains("max: 4.0"));
        Assert.assertTrue(str.contains("mean: 3.0"));
        Assert.assertTrue(str.contains("variance: 2.0"));
    }

    @Test
    public void testClear() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(10.0);
        stats.addValue(20.0);
        Assert.assertEquals(2, stats.getN());

        stats.clear();
        Assert.assertEquals(0, stats.getN());
        Assert.assertTrue(Double.isNaN(stats.getMean()));
        Assert.assertTrue(Double.isNaN(stats.getSum()));
        Assert.assertTrue(Double.isNaN(stats.getMin()));
        Assert.assertTrue(Double.isNaN(stats.getMax()));
    }

    @Test
    public void testClearWithCustomImplementations() {
        SummaryStatistics stats = new SummaryStatistics();
        DummyStorelessStatistic customMean = new DummyStorelessStatistic();
        DummyStorelessStatistic customVariance = new DummyStorelessStatistic();

        stats.setMeanImpl(customMean);
        stats.setVarianceImpl(customVariance);

        stats.addValue(1.0);
        stats.addValue(2.0);
        Assert.assertEquals(2, stats.getN());
        Assert.assertEquals(2.0, stats.getMean(), TOLERANCE);
        Assert.assertEquals(2.0, stats.getVariance(), TOLERANCE);

        stats.clear();
        Assert.assertEquals(0, stats.getN());
        Assert.assertEquals(0.0, stats.getMean(), TOLERANCE);
        Assert.assertEquals(0.0, stats.getVariance(), TOLERANCE);
    }

    @Test
    public void testEqualsAndHashCode() {
        SummaryStatistics stats1 = new SummaryStatistics();
        SummaryStatistics stats2 = new SummaryStatistics();

        Assert.assertTrue(stats1.equals(stats1));
        Assert.assertFalse(stats1.equals(null));
        Assert.assertFalse(stats1.equals("Some String"));
        Assert.assertTrue(stats1.equals(stats2));
        Assert.assertEquals(stats1.hashCode(), stats2.hashCode());

        stats1.addValue(5.0);
        Assert.assertFalse(stats1.equals(stats2));
        Assert.assertFalse(stats1.hashCode() == stats2.hashCode());

        stats2.addValue(5.0);
        Assert.assertTrue(stats1.equals(stats2));
        Assert.assertEquals(stats1.hashCode(), stats2.hashCode());

        stats1.addValue(10.0);
        stats2.addValue(15.0);
        Assert.assertFalse(stats1.equals(stats2));
    }

    @Test
    public void testGettersAndSettersForImplementations() {
        SummaryStatistics stats = new SummaryStatistics();

        Sum sum = new Sum();
        SumOfSquares sumsq = new SumOfSquares();
        Min min = new Min();
        Max max = new Max();
        SumOfLogs sumLog = new SumOfLogs();
        GeometricMean geoMean = new GeometricMean();
        Mean mean = new Mean();
        Variance variance = new Variance();

        stats.setSumImpl(sum);
        stats.setSumsqImpl(sumsq);
        stats.setMinImpl(min);
        stats.setMaxImpl(max);
        stats.setSumLogImpl(sumLog);
        stats.setGeoMeanImpl(geoMean);
        stats.setMeanImpl(mean);
        stats.setVarianceImpl(variance);

        Assert.assertSame(sum, stats.getSumImpl());
        Assert.assertSame(sumsq, stats.getSumsqImpl());
        Assert.assertSame(min, stats.getMinImpl());
        Assert.assertSame(max, stats.getMaxImpl());
        Assert.assertSame(sumLog, stats.getSumLogImpl());
        Assert.assertSame(geoMean, stats.getGeoMeanImpl());
        Assert.assertSame(mean, stats.getMeanImpl());
        Assert.assertSame(variance, stats.getVarianceImpl());
    }

    @Test
    public void testCustomImplementationsInAddValue() {
        SummaryStatistics stats = new SummaryStatistics();
        DummyStorelessStatistic customMean = new DummyStorelessStatistic();
        DummyStorelessStatistic customVar = new DummyStorelessStatistic();
        DummyStorelessStatistic customGeoMean = new DummyStorelessStatistic();

        stats.setMeanImpl(customMean);
        stats.setVarianceImpl(customVar);
        stats.setGeoMeanImpl(customGeoMean);

        stats.addValue(10.0);
        stats.addValue(20.0);

        Assert.assertEquals(2.0, stats.getMean(), TOLERANCE);
        Assert.assertEquals(2.0, stats.getVariance(), TOLERANCE);
        Assert.assertEquals(2.0, stats.getGeometricMean(), TOLERANCE);
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetSumImplAfterAddValueThrowsException() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.setSumImpl(new Sum());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetSumsqImplAfterAddValueThrowsException() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.setSumsqImpl(new SumOfSquares());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetMinImplAfterAddValueThrowsException() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.setMinImpl(new Min());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetMaxImplAfterAddValueThrowsException() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.setMaxImpl(new Max());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetSumLogImplAfterAddValueThrowsException() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.setSumLogImpl(new SumOfLogs());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetGeoMeanImplAfterAddValueThrowsException() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.setGeoMeanImpl(new GeometricMean());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetMeanImplAfterAddValueThrowsException() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.setMeanImpl(new Mean());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetVarianceImplAfterAddValueThrowsException() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.setVarianceImpl(new Variance());
    }

    @Test
    public void testCopyConstructorAndCopyMethod() {
        SummaryStatistics original = new SummaryStatistics();
        original.addValue(2.0);
        original.addValue(4.0);
        original.addValue(8.0);

        SummaryStatistics copy1 = new SummaryStatistics(original);
        Assert.assertEquals(original, copy1);
        Assert.assertEquals(original.getN(), copy1.getN());
        Assert.assertEquals(original.getMean(), copy1.getMean(), TOLERANCE);
        Assert.assertEquals(original.getVariance(), copy1.getVariance(), TOLERANCE);
        Assert.assertEquals(original.getSum(), copy1.getSum(), TOLERANCE);

        SummaryStatistics copy2 = original.copy();
        Assert.assertEquals(original, copy2);
        Assert.assertEquals(original.getSumsq(), copy2.getSumsq(), TOLERANCE);
        Assert.assertEquals(original.getGeometricMean(), copy2.getGeometricMean(), TOLERANCE);
        Assert.assertEquals(original.getSumOfLogs(), copy2.getSumOfLogs(), TOLERANCE);
        Assert.assertEquals(original.getSecondMoment(), copy2.getSecondMoment(), TOLERANCE);
    }

    @Test
    public void testCopyWithCustomImplementations() {
        SummaryStatistics source = new SummaryStatistics();
        DummyStorelessStatistic customMean = new DummyStorelessStatistic();
        DummyStorelessStatistic customVar = new DummyStorelessStatistic();
        DummyStorelessStatistic customGeoMean = new DummyStorelessStatistic();
        DummyStorelessStatistic customMax = new DummyStorelessStatistic();
        DummyStorelessStatistic customMin = new DummyStorelessStatistic();
        DummyStorelessStatistic customSum = new DummyStorelessStatistic();
        DummyStorelessStatistic customSumLog = new DummyStorelessStatistic();
        DummyStorelessStatistic customSumsq = new DummyStorelessStatistic();

        source.setMeanImpl(customMean);
        source.setVarianceImpl(customVar);
        source.setGeoMeanImpl(customGeoMean);
        source.setMaxImpl(customMax);
        source.setMinImpl(customMin);
        source.setSumImpl(customSum);
        source.setSumLogImpl(customSumLog);
        source.setSumsqImpl(customSumsq);

        source.addValue(10.0);
        source.addValue(20.0);

        SummaryStatistics dest = new SummaryStatistics();
        SummaryStatistics.copy(source, dest);

        Assert.assertEquals(source.getN(), dest.getN());
        Assert.assertEquals(source.getMean(), dest.getMean(), TOLERANCE);
        Assert.assertEquals(source.getVariance(), dest.getVariance(), TOLERANCE);
        Assert.assertEquals(source.getGeometricMean(), dest.getGeometricMean(), TOLERANCE);
        Assert.assertEquals(source.getMax(), dest.getMax(), TOLERANCE);
        Assert.assertEquals(source.getMin(), dest.getMin(), TOLERANCE);
        Assert.assertEquals(source.getSum(), dest.getSum(), TOLERANCE);
        Assert.assertEquals(source.getSumOfLogs(), dest.getSumOfLogs(), TOLERANCE);
        Assert.assertEquals(source.getSumsq(), dest.getSumsq(), TOLERANCE);

        Assert.assertTrue(dest.getMeanImpl() instanceof DummyStorelessStatistic);
        Assert.assertTrue(dest.getVarianceImpl() instanceof DummyStorelessStatistic);
        Assert.assertTrue(dest.getGeoMeanImpl() instanceof DummyStorelessStatistic);
        Assert.assertTrue(dest.getMaxImpl() instanceof DummyStorelessStatistic);
        Assert.assertTrue(dest.getMinImpl() instanceof DummyStorelessStatistic);
        Assert.assertTrue(dest.getSumImpl() instanceof DummyStorelessStatistic);
        Assert.assertTrue(dest.getSumLogImpl() instanceof DummyStorelessStatistic);
        Assert.assertTrue(dest.getSumsqImpl() instanceof DummyStorelessStatistic);
    }

    @Test(expected = NullArgumentException.class)
    public void testCopyNullSourceThrowsException() {
        SummaryStatistics.copy(null, new SummaryStatistics());
    }

    @Test(expected = NullArgumentException.class)
    public void testCopyNullDestThrowsException() {
        SummaryStatistics.copy(new SummaryStatistics(), null);
    }
}
