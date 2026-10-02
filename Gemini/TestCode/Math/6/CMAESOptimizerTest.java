package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
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
    public void testSigma_validInput_createsSuccessfully() {
        double[] input = new double[]{0.5, 1.2, 0.0};
        CMAESOptimizer.Sigma sigma = new CMAESOptimizer.Sigma(input);
        Assert.assertArrayEquals(input, sigma.getSigma(), 1e-12);

        // Verify defensive copy
        input[0] = 9.9;
        Assert.assertEquals(0.5, sigma.getSigma()[0], 1e-12);
    }

    @Test(expected = NotPositiveException.class)
    public void testSigma_negativeValue_throwsNotPositiveException() {
        new CMAESOptimizer.Sigma(new double[]{0.5, -0.1, 1.0});
    }

    @Test
    public void testPopulationSize_validValue_returnsCorrectSize() {
        CMAESOptimizer.PopulationSize popSize = new CMAESOptimizer.PopulationSize(10);
        Assert.assertEquals(10, popSize.getPopulationSize());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testPopulationSize_zeroValue_throwsNotStrictlyPositiveException() {
        new CMAESOptimizer.PopulationSize(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testPopulationSize_negativeValue_throwsNotStrictlyPositiveException() {
        new CMAESOptimizer.PopulationSize(-5);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_sigmaDimensionMismatch_throwsDimensionMismatchException() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                100, 1e-6, true, 0, 0,
                new MersenneTwister(42L), false, null
        );

        optimizer.optimize(
                new MaxEval(1000),
                new ObjectiveFunction(new SphereFunction()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0, 2.0}),
                new CMAESOptimizer.PopulationSize(10),
                new CMAESOptimizer.Sigma(new double[]{0.5}),
                new SimpleBounds(new double[]{-10.0, -10.0}, new double[]{10.0, 10.0})
        );
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimize_sigmaOutOfRange_throwsOutOfRangeException() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                100, 1e-6, true, 0, 0,
                new MersenneTwister(42L), false, null
        );

        optimizer.optimize(
                new MaxEval(1000),
                new ObjectiveFunction(new SphereFunction()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0, 2.0}),
                new CMAESOptimizer.PopulationSize(10),
                new CMAESOptimizer.Sigma(new double[]{25.0, 1.0}),
                new SimpleBounds(new double[]{-10.0, -10.0}, new double[]{10.0, 10.0})
        );
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_missingPopulationSize_throwsNotStrictlyPositiveException() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                100, 1e-6, true, 0, 0,
                new MersenneTwister(42L), false, null
        );

        optimizer.optimize(
                new MaxEval(1000),
                new ObjectiveFunction(new SphereFunction()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0, 2.0}),
                new CMAESOptimizer.Sigma(new double[]{0.5, 0.5}),
                new SimpleBounds(new double[]{-10.0, -10.0}, new double[]{10.0, 10.0})
        );
    }

    @Test
    public void testOptimize_minimizeActiveCMA_findsOptimumAndGeneratesStatistics() {
        RandomGenerator rng = new Well19937c(123456L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                300, 1e-9, true, 0, 0,
                rng, true, new SimpleValueChecker(1e-6, 1e-6)
        );

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new SphereFunction()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{2.0, -3.0}),
                new CMAESOptimizer.PopulationSize(10),
                new CMAESOptimizer.Sigma(new double[]{0.5, 0.5}),
                new SimpleBounds(new double[]{-10.0, -10.0}, new double[]{10.0, 10.0})
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-1);
        Assert.assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsFitnessHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsMeanHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testOptimize_maximizeNonActiveCMA_findsOptimum() {
        RandomGenerator rng = new Well19937c(654321L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                300, 0.0, false, 0, 0,
                rng, false, null
        );

        // Inverted sphere to test MAXIMIZE
        MultivariateFunction invertedSphere = new MultivariateFunction() {
            public double value(double[] point) {
                return -(point[0] * point[0] + point[1] * point[1]);
            }
        };

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(invertedSphere),
                GoalType.MAXIMIZE,
                new InitialGuess(new double[]{1.5, -1.5}),
                new CMAESOptimizer.PopulationSize(10),
                new CMAESOptimizer.Sigma(new double[]{0.5, 0.5}),
                new SimpleBounds(new double[]{-5.0, -5.0}, new double[]{5.0, 5.0})
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-1);
        Assert.assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
        Assert.assertTrue(optimizer.getStatisticsFitnessHistory().isEmpty());
        Assert.assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        Assert.assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testOptimize_diagonalOnlyAlways_converges() {
        RandomGenerator rng = new MersenneTwister(98765L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                300, 1e-8, true, 1, 0,
                rng, false, null
        );

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new SphereFunction()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0, 1.0, 1.0}),
                new CMAESOptimizer.PopulationSize(12),
                new CMAESOptimizer.Sigma(new double[]{0.3, 0.3, 0.3}),
                new SimpleBounds(new double[]{-5.0, -5.0, -5.0}, new double[]{5.0, 5.0, 5.0})
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-1);
    }

    @Test
    public void testOptimize_diagonalOnlyInitialIterations_switchesToFullCovariance() {
        RandomGenerator rng = new MersenneTwister(54321L);
        // diagonalOnly = 2, so after 2 iterations it switches to diagonalOnly = 0
        CMAESOptimizer optimizer = new CMAESOptimizer(
                300, 1e-8, true, 2, 0,
                rng, false, null
        );

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new SphereFunction()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0, -1.0}),
                new CMAESOptimizer.PopulationSize(10),
                new CMAESOptimizer.Sigma(new double[]{0.5, 0.5}),
                new SimpleBounds(new double[]{-5.0, -5.0}, new double[]{5.0, 5.0})
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-1);
    }

    @Test
    public void testOptimize_withFeasibilityCheckAndBoundRepairs_converges() {
        RandomGenerator rng = new MersenneTwister(111L);
        // checkFeasableCount > 0
        CMAESOptimizer optimizer = new CMAESOptimizer(
                200, 1e-8, true, 0, 5,
                rng, false, null
        );

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new SphereFunction()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{4.5, 4.5}),
                new CMAESOptimizer.PopulationSize(10),
                new CMAESOptimizer.Sigma(new double[]{1.0, 1.0}),
                new SimpleBounds(new double[]{-5.0, -5.0}, new double[]{5.0, 5.0})
        );

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getPoint()[0] <= 5.0 && result.getPoint()[0] >= -5.0);
        Assert.assertTrue(result.getPoint()[1] <= 5.0 && result.getPoint()[1] >= -5.0);
    }

    @Test
    public void testOptimize_flatFitnessFunction_adjustsSigmaAndTerminates() {
        RandomGenerator rng = new MersenneTwister(222L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, 0.0, true, 0, 0,
                rng, false, null
        );

        PointValuePair result = optimizer.optimize(
                new MaxEval(500),
                new ObjectiveFunction(new ConstantFunction(5.0)),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0, 2.0}),
                new CMAESOptimizer.PopulationSize(8),
                new CMAESOptimizer.Sigma(new double[]{0.5, 0.5}),
                new SimpleBounds(new double[]{-10.0, -10.0}, new double[]{10.0, 10.0})
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(5.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_earlyTerminationByConvergenceChecker() {
        ConvergenceChecker<PointValuePair> customChecker = new ConvergenceChecker<PointValuePair>() {
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                return iteration >= 3;
            }
        };

        CMAESOptimizer optimizer = new CMAESOptimizer(
                100, 0.0, true, 0, 0,
                new MersenneTwister(333L), false, customChecker
        );

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new SphereFunction()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{3.0, 3.0}),
                new CMAESOptimizer.PopulationSize(10),
                new CMAESOptimizer.Sigma(new double[]{0.5, 0.5}),
                new SimpleBounds(new double[]{-10.0, -10.0}, new double[]{10.0, 10.0})
        );

        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimize_stopFitnessThresholdReached_breaksEarly() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                500, 2.0, true, 0, 0,
                new MersenneTwister(444L), false, null
        );

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new SphereFunction()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{5.0, 5.0}),
                new CMAESOptimizer.PopulationSize(10),
                new CMAESOptimizer.Sigma(new double[]{0.5, 0.5}),
                new SimpleBounds(new double[]{-10.0, -10.0}, new double[]{10.0, 10.0})
        );

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getValue() <= 2.0);
    }

    @Test
    public void testOptimize_maxEvalExceeded_terminatesGracefully() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                500, 1e-12, true, 0, 0,
                new MersenneTwister(555L), false, null
        );

        PointValuePair result = optimizer.optimize(
                new MaxEval(15),
                new ObjectiveFunction(new SphereFunction()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{3.0, 3.0}),
                new CMAESOptimizer.PopulationSize(10),
                new CMAESOptimizer.Sigma(new double[]{0.5, 0.5}),
                new SimpleBounds(new double[]{-10.0, -10.0}, new double[]{10.0, 10.0})
        );

        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimize_withPointChecker_converges() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                100, 0.0, true, 0, 0,
                new MersenneTwister(666L), false, new SimplePointChecker<PointValuePair>(1e-1, 1e-1)
        );

        PointValuePair result = optimizer.optimize(
                new MaxEval(5000),
                new ObjectiveFunction(new SphereFunction()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{0.5, 0.5}),
                new CMAESOptimizer.PopulationSize(8),
                new CMAESOptimizer.Sigma(new double[]{0.2, 0.2}),
                new SimpleBounds(new double[]{-5.0, -5.0}, new double[]{5.0, 5.0})
        );

        Assert.assertNotNull(result);
    }
}
