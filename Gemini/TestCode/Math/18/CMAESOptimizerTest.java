package org.apache.commons.math3.optimization.direct;

import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;

public class CMAESOptimizerTest {

    private static class SphereFunction implements MultivariateFunction {
        public double value(double[] point) {
            double sum = 0;
            for (double v : point) {
                sum += v * v;
            }
            return sum;
        }
    }

    private static class ConstantFunction implements MultivariateFunction {
        private final double constant;

        public ConstantFunction(double constant) {
            this.constant = constant;
        }

        public double value(double[] point) {
            return constant;
        }
    }

    @Test
    public void testDefaultConstructor() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        Assert.assertNotNull(optimizer);
        Assert.assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
        Assert.assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        Assert.assertTrue(optimizer.getStatisticsFitnessHistory().isEmpty());
        Assert.assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testConstructorWithLambda() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        Assert.assertNotNull(optimizer);
    }

    @Test
    public void testConstructorWithLambdaAndInputSigma() {
        double[] sigma = new double[] { 0.5, 0.5 };
        CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma);
        Assert.assertNotNull(optimizer);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructor() {
        double[] sigma = new double[] { 0.2 };
        RandomGenerator rng = new MersenneTwister(123456L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 1000, 1e-4, true, 0, 0, rng, true);
        Assert.assertNotNull(optimizer);
    }

    @Test
    public void testOptimizeMinimizeSphereWithoutBounds() {
        int dim = 2;
        double[] start = new double[] { 1.0, 1.0 };
        double[] sigma = new double[] { 0.2, 0.2 };
        RandomGenerator rng = new MersenneTwister(42L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 1000, 1e-7, true, 0, 0, rng, true, new SimpleValueChecker(1e-6, 1e-6));

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, start);

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getPoint()[0], 0.1);
        Assert.assertEquals(0.0, result.getPoint()[1], 0.1);
        Assert.assertTrue(result.getValue() < 0.1);

        List<Double> sigmaHistory = optimizer.getStatisticsSigmaHistory();
        List<Double> fitnessHistory = optimizer.getStatisticsFitnessHistory();
        List<RealMatrix> meanHistory = optimizer.getStatisticsMeanHistory();
        List<RealMatrix> dHistory = optimizer.getStatisticsDHistory();

        Assert.assertFalse(sigmaHistory.isEmpty());
        Assert.assertFalse(fitnessHistory.isEmpty());
        Assert.assertFalse(meanHistory.isEmpty());
        Assert.assertFalse(dHistory.isEmpty());
    }

    @Test
    public void testOptimizeMaximizeSphereWithoutBounds() {
        int dim = 2;
        double[] start = new double[] { 0.5, 0.5 };
        double[] sigma = new double[] { 0.1, 0.1 };
        RandomGenerator rng = new MersenneTwister(42L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 500, 0.0, true, 0, 0, rng, false, new SimpleValueChecker(1e-6, 1e-6));

        MultivariateFunction invertedSphere = new MultivariateFunction() {
            public double value(double[] point) {
                return -(point[0] * point[0] + point[1] * point[1]);
            }
        };

        PointValuePair result = optimizer.optimize(
                5000, invertedSphere, GoalType.MAXIMIZE, start);

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getPoint()[0], 0.1);
        Assert.assertEquals(0.0, result.getPoint()[1], 0.1);
        Assert.assertTrue(result.getValue() > -0.1);
    }

    @Test
    public void testOptimizeWithBoundedSimpleSearch() {
        double[] start = new double[] { 2.0, 2.0 };
        double[] lower = new double[] { 0.0, 0.0 };
        double[] upper = new double[] { 5.0, 5.0 };
        double[] sigma = new double[] { 0.5, 0.5 };
        RandomGenerator rng = new MersenneTwister(42L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 500, 1e-6, true, 0, 5, rng, false, new SimpleValueChecker(1e-6, 1e-6));

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getPoint()[0] >= lower[0] && result.getPoint()[0] <= upper[0]);
        Assert.assertTrue(result.getPoint()[1] >= lower[1] && result.getPoint()[1] <= upper[1]);
    }

    @Test
    public void testOptimizeDiagonalOnlyMode() {
        double[] start = new double[] { 1.5, 1.5 };
        double[] sigma = new double[] { 0.3, 0.3 };
        RandomGenerator rng = new MersenneTwister(1337L);
        // diagonalOnly = 1 keeps diagonal covariance matrix
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 500, 1e-6, true, 1, 0, rng, false, new SimpleValueChecker(1e-6, 1e-6));

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, start);

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getPoint()[0], 0.1);
        Assert.assertEquals(0.0, result.getPoint()[1], 0.1);
    }

    @Test
    public void testOptimizeDiagonalOnlyTransitionMode() {
        double[] start = new double[] { 1.5, 1.5 };
        double[] sigma = new double[] { 0.3, 0.3 };
        RandomGenerator rng = new MersenneTwister(1337L);
        // diagonalOnly = 2 switches to full covariance matrix after 2 iterations
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 500, 1e-6, true, 2, 0, rng, false, new SimpleValueChecker(1e-6, 1e-6));

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, start);

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getPoint()[0], 0.1);
        Assert.assertEquals(0.0, result.getPoint()[1], 0.1);
    }

    @Test
    public void testOptimizeNonActiveCMA() {
        double[] start = new double[] { 1.0, 1.0 };
        double[] sigma = new double[] { 0.2, 0.2 };
        RandomGenerator rng = new MersenneTwister(42L);
        // isActiveCMA = false
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 500, 1e-6, false, 0, 0, rng, false, new SimpleValueChecker(1e-6, 1e-6));

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, start);

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getPoint()[0], 0.1);
        Assert.assertEquals(0.0, result.getPoint()[1], 0.1);
    }

    @Test
    public void testOptimizeWithStopFitnessMinimization() {
        double[] start = new double[] { 2.0, 2.0 };
        double stopFitness = 0.5;
        RandomGenerator rng = new MersenneTwister(42L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, null, 1000, stopFitness, true, 0, 0, rng, false, null);

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, start);

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getValue() <= stopFitness + 1e-5);
    }

    @Test
    public void testOptimizeWithStopFitnessMaximization() {
        double[] start = new double[] { 2.0, 2.0 };
        double stopFitness = -0.5;
        RandomGenerator rng = new MersenneTwister(42L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, null, 1000, stopFitness, true, 0, 0, rng, false, null);

        MultivariateFunction invertedSphere = new MultivariateFunction() {
            public double value(double[] point) {
                return -(point[0] * point[0] + point[1] * point[1]);
            }
        };

        PointValuePair result = optimizer.optimize(
                5000, invertedSphere, GoalType.MAXIMIZE, start);

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getValue() >= stopFitness - 1e-5);
    }

    @Test
    public void testFlatFitnessFunction() {
        double[] start = new double[] { 1.0, 1.0 };
        RandomGenerator rng = new MersenneTwister(42L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, null, 10, 0.0, true, 0, 0, rng, false, null);

        PointValuePair result = optimizer.optimize(
                50, new ConstantFunction(5.0), GoalType.MINIMIZE, start);

        Assert.assertNotNull(result);
        Assert.assertEquals(5.0, result.getValue(), 1e-6);
    }

    @Test
    public void testTooManyEvaluationsHandledGracefully() {
        double[] start = new double[] { 5.0, 5.0 };
        RandomGenerator rng = new MersenneTwister(42L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, null, 1000, 0.0, true, 0, 0, rng, false, null);

        // Max evaluations set to only 15, should break out of loop cleanly
        PointValuePair result = optimizer.optimize(
                15, new SphereFunction(), GoalType.MINIMIZE, start);

        Assert.assertNotNull(result);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParametersMixedInfiniteAndFiniteBounds() {
        double[] start = new double[] { 1.0, 1.0 };
        double[] lower = new double[] { Double.NEGATIVE_INFINITY, 0.0 };
        double[] upper = new double[] { 10.0, 10.0 };
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.optimize(100, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testCheckParametersBoundsOverflow() {
        double[] start = new double[] { 0.0 };
        double[] lower = new double[] { -Double.MAX_VALUE / 2.0 };
        double[] upper = new double[] { Double.MAX_VALUE };
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.optimize(100, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckParametersInputSigmaDimensionMismatch() {
        double[] start = new double[] { 1.0, 1.0 };
        double[] sigma = new double[] { 0.5 }; // dimension 1 instead of 2
        CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma);
        optimizer.optimize(100, new SphereFunction(), GoalType.MINIMIZE, start);
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckParametersNegativeInputSigma() {
        double[] start = new double[] { 1.0, 1.0 };
        double[] sigma = new double[] { 0.5, -0.1 };
        CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma);
        optimizer.optimize(100, new SphereFunction(), GoalType.MINIMIZE, start);
    }

    @Test(expected = OutOfRangeException.class)
    public void testCheckParametersInputSigmaExceedsBounds() {
        double[] start = new double[] { 1.0, 1.0 };
        double[] lower = new double[] { 0.0, 0.0 };
        double[] upper = new double[] { 2.0, 2.0 };
        double[] sigma = new double[] { 0.5, 3.0 }; // 3.0 > upper - lower (2.0)
        CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma);
        optimizer.optimize(100, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);
    }

    @Test
    public void testConvergenceCheckerTermination() {
        double[] start = new double[] { 1.0, 1.0 };
        ConvergenceChecker<PointValuePair> immediateChecker = new ConvergenceChecker<PointValuePair>() {
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                return iteration >= 1;
            }
        };

        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, null, 1000, 0.0, true, 0, 0, new MersenneTwister(42L), false, immediateChecker);

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, start);

        Assert.assertNotNull(result);
    }

    @Test
    public void testPointCheckerConvergence() {
        double[] start = new double[] { 0.1, 0.1 };
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[] { 0.01, 0.01 }, 1000, 0.0, true, 0, 0,
                new MersenneTwister(42L), false, new SimplePointChecker<PointValuePair>(1e-3, 1e-3));

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, start);

        Assert.assertNotNull(result);
    }
}
