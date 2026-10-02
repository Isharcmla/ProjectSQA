package org.apache.commons.math3.optimization.direct;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CMAESOptimizerTest {

    private static class SphereFunction implements MultivariateFunction {
        public double value(double[] point) {
            double sum = 0.0;
            for (double x : point) {
                sum += x * x;
            }
            return sum;
        }
    }

    private static class ConstantFunction implements MultivariateFunction {
        public double value(double[] point) {
            return 42.0;
        }
    }

    @Test
    public void testConstructorsAndGetters() {
        CMAESOptimizer optDefault = new CMAESOptimizer();
        Assert.assertNotNull(optDefault.getStatisticsSigmaHistory());
        Assert.assertNotNull(optDefault.getStatisticsMeanHistory());
        Assert.assertNotNull(optDefault.getStatisticsFitnessHistory());
        Assert.assertNotNull(optDefault.getStatisticsDHistory());

        CMAESOptimizer optLambda = new CMAESOptimizer(10);
        Assert.assertNotNull(optLambda);

        CMAESOptimizer optLambdaSigma = new CMAESOptimizer(10, new double[]{0.2, 0.2});
        Assert.assertNotNull(optLambdaSigma);

        CMAESOptimizer optDep = new CMAESOptimizer(
                10, new double[]{0.2}, 100, 1e-4, true, 0, 0,
                new MersenneTwister(42L), true);
        Assert.assertNotNull(optDep);

        CMAESOptimizer optFull = new CMAESOptimizer(
                10, new double[]{0.2}, 100, 1e-4, true, 0, 0,
                new MersenneTwister(42L), true, new SimpleValueChecker(1e-3, 1e-3));
        Assert.assertNotNull(optFull);
    }

    @Test
    public void testOptimize_minimizeUnbounded() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.5, 0.5}, 1000, 1e-8, true, 0, 0,
                new MersenneTwister(42L), true);
        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-1);
        Assert.assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsMeanHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsFitnessHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testOptimize_maximizeBounded() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.2, 0.2}, 500, 0, false, 0, 2,
                new MersenneTwister(42L), false);
        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MAXIMIZE, new double[]{0.5, 0.5},
                new double[]{-2.0, -2.0}, new double[]{2.0, 2.0});

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getValue() > 0.0);
    }

    @Test
    public void testOptimize_diagonalOnlyActive() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.3, 0.3}, 200, 1e-6, true, 1, 0,
                new MersenneTwister(42L), false);
        PointValuePair result = optimizer.optimize(
                2000, new SphereFunction(), GoalType.MINIMIZE, new double[]{0.5, -0.5});

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-1);
    }

    @Test
    public void testOptimize_diagonalOnlySwitchToFull() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.3, 0.3}, 100, 1e-6, true, 2, 0,
                new MersenneTwister(42L), false);
        PointValuePair result = optimizer.optimize(
                2000, new SphereFunction(), GoalType.MINIMIZE, new double[]{0.5, 0.5});

        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimize_nonActiveCMA() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, new double[]{0.2, 0.2}, 200, 1e-5, false, 0, 0,
                new MersenneTwister(42L), false);
        PointValuePair result = optimizer.optimize(
                2000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-1);
    }

    @Test
    public void testOptimize_withCustomConvergenceChecker() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.5, 0.5}, 500, 0, true, 0, 0,
                new MersenneTwister(42L), false,
                new SimplePointChecker<PointValuePair>(1e-2, 1e-2));
        PointValuePair result = optimizer.optimize(
                2000, new SphereFunction(), GoalType.MINIMIZE, new double[]{0.8, 0.8});

        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimize_flatFitnessAdjustment() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.5}, 10, 0, true, 0, 0,
                new MersenneTwister(42L), false);
        PointValuePair result = optimizer.optimize(
                100, new ConstantFunction(), GoalType.MINIMIZE, new double[]{1.0});

        Assert.assertNotNull(result);
        Assert.assertEquals(42.0, result.getValue(), 1e-5);
    }

    @Test
    public void testOptimize_defaultLambdaAndNoInputSigma() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        PointValuePair result = optimizer.optimize(
                500, new SphereFunction(), GoalType.MINIMIZE, new double[]{0.5, 0.5});

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-1);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_maxEvaluationsExceeded() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.5}, 1000, 1e-9, true, 0, 0,
                new MersenneTwister(42L), false);
        optimizer.optimize(5, new SphereFunction(), GoalType.MINIMIZE, new double[]{10.0});
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_mixedFiniteAndInfiniteBounds() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.5, 0.5}, 100, 0, true, 0, 0,
                new MersenneTwister(42L), false);
        optimizer.optimize(
                1000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0},
                new double[]{0.0, Double.NEGATIVE_INFINITY}, new double[]{2.0, 2.0});
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckParameters_inputSigmaDimensionMismatch() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.5, 0.5, 0.5}, 100, 0, true, 0, 0,
                new MersenneTwister(42L), false);
        optimizer.optimize(
                1000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckParameters_negativeInputSigma() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{-0.5, 0.5}, 100, 0, true, 0, 0,
                new MersenneTwister(42L), false);
        optimizer.optimize(
                1000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
    }

    @Test(expected = OutOfRangeException.class)
    public void testCheckParameters_inputSigmaExceedsBoundsRange() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{5.0, 0.5}, 100, 0, true, 0, 0,
                new MersenneTwister(42L), false);
        optimizer.optimize(
                1000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0},
                new double[]{0.0, 0.0}, new double[]{2.0, 2.0});
    }

    @Test
    public void testOptimize_boundedBoundaryRepairAndPenalty() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.1, 0.1}, 50, 0, true, 0, 1,
                new MersenneTwister(42L), false);
        PointValuePair result = optimizer.optimize(
                1000, new SphereFunction(), GoalType.MINIMIZE, new double[]{0.5, 0.5},
                new double[]{0.0, 0.0}, new double[]{1.0, 1.0});

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getPoint()[0] >= 0.0 && result.getPoint()[0] <= 1.0);
        Assert.assertTrue(result.getPoint()[1] >= 0.0 && result.getPoint()[1] <= 1.0);
    }
}
