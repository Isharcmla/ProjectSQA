package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.*;
import org.junit.Test;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;

import java.util.List;

public class CMAESOptimizerTest {

    /** Simple sphere function f(x) = sum(x_i^2), used for most normal-case tests. */
    private static class SphereFunction implements MultivariateFunction {
        public double value(double[] x) {
            double sum = 0;
            for (double v : x) {
                sum += v * v;
            }
            return sum;
        }
    }

    /** Negated sphere function, used to test maximization goal type. */
    private static class NegSphereFunction implements MultivariateFunction {
        public double value(double[] x) {
            double sum = 0;
            for (double v : x) {
                sum += v * v;
            }
            return -sum;
        }
    }

    // ---------------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------------

    @Test
    public void testDefaultConstructor_createsInstance_notNull() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertNotNull(optimizer);
    }

    @Test
    public void testLambdaConstructor_createsInstance_notNull() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        assertNotNull(optimizer);
    }

    @Test
    public void testLambdaSigmaConstructor_createsInstance_notNull() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.5, 0.5});
        assertNotNull(optimizer);
    }

    @Test
    public void testDeprecatedFullConstructor_createsInstance_notNull() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.5, 0.5},
                1000, 0.0, true, 0, 0, rg, false);
        assertNotNull(optimizer);
    }

    @Test
    public void testFullConstructorWithChecker_createsInstance_notNull() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.5, 0.5},
                1000, 0.0, true, 0, 0, rg, false, new SimpleValueChecker(1e-10, 1e-10));
        assertNotNull(optimizer);
    }

    // ---------------------------------------------------------------------
    // Normal / typical optimize cases
    // ---------------------------------------------------------------------

    @Test
    public void testOptimize_sphereFunctionMinimize_normalCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(0, null, 10000, 1e-10, true, 0, 0, rg, false);
        PointValuePair result = optimizer.optimize(10000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{1.0, 1.0});
        assertNotNull(result);
        assertNotNull(result.getPoint());
    }

    @Test
    public void testOptimize_sphereFunctionMaximize_normalCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(0, null, 10000, 0.0, true, 0, 0, rg, false);
        PointValuePair result = optimizer.optimize(10000, new NegSphereFunction(), GoalType.MAXIMIZE,
                new double[]{1.0, 1.0});
        assertNotNull(result);
    }

    @Test
    public void testOptimize_withBoundaries_normalCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 2000, 0.0, true, 0, 0, rg, false);
        PointValuePair result = optimizer.optimize(5000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{0.5, 0.5}, new double[]{-5.0, -5.0}, new double[]{5.0, 5.0});
        assertNotNull(result);
    }

    @Test
    public void testOptimize_diagonalOnly_normalCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 2000, 0.0, true, 1, 0, rg, false);
        PointValuePair result = optimizer.optimize(3000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{1.0, 1.0, 1.0});
        assertNotNull(result);
    }

    @Test
    public void testOptimize_diagonalOnlySwitchToFull_normalCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        // diagonalOnly > 1 triggers switch back to full covariance after some iterations
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 3000, 0.0, true, 3, 0, rg, false);
        PointValuePair result = optimizer.optimize(5000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{1.0, 1.0, 1.0});
        assertNotNull(result);
    }

    @Test
    public void testOptimize_nonActiveCMA_normalCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 2000, 0.0, false, 0, 0, rg, false);
        PointValuePair result = optimizer.optimize(3000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{1.0, 1.0});
        assertNotNull(result);
    }

    @Test
    public void testOptimize_checkFeasableCountWithBounds_normalCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 2000, 0.0, true, 0, 3, rg, false);
        PointValuePair result = optimizer.optimize(3000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{0.5, 0.5}, new double[]{-2.0, -2.0}, new double[]{2.0, 2.0});
        assertNotNull(result);
    }

    @Test
    public void testOptimize_singleDimension_normalCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 1000, 0.0, true, 0, 0, rg, false);
        PointValuePair result = optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{2.0});
        assertNotNull(result);
        assertEquals(1, result.getPoint().length);
    }

    @Test
    public void testOptimize_convergenceChecker_normalCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 5000, 0.0, true, 0, 0, rg, false,
                new SimpleValueChecker(1e-6, 1e-6));
        PointValuePair result = optimizer.optimize(5000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{1.0, 1.0});
        assertNotNull(result);
    }

    // ---------------------------------------------------------------------
    // Edge cases
    // ---------------------------------------------------------------------

    @Test
    public void testOptimize_zeroInputSigma_edgeCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(5, new double[]{0.0, 0.5}, 1000, 0.0, true, 0, 0, rg, false);
        PointValuePair result = optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{1.0, 1.0});
        assertNotNull(result);
    }

    @Test
    public void testOptimize_stopFitnessReachedImmediately_edgeCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        // Very high stopFitness relative to the sphere function values near the start
        // point should cause the generation loop to terminate early.
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 1000, 1000.0, true, 0, 0, rg, false);
        PointValuePair result = optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{1.0, 1.0});
        assertNotNull(result);
    }

    @Test
    public void testOptimize_veryLowMaxEvaluations_edgeCase() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 1000, 0.0, true, 0, 0, rg, false);
        // maxEval is smaller than population size, should trigger
        // TooManyEvaluationsException caught internally and break out early.
        PointValuePair result = optimizer.optimize(3, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{1.0, 1.0});
        assertNotNull(result);
    }

    @Test
    public void testOptimize_lambdaZero_defaultPopulationComputed() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(0, null, 1000, 0.0, true, 0, 0, rg, false);
        PointValuePair result = optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{1.0, 1.0});
        assertNotNull(result);
    }

    @Test
    public void testOptimize_inputSigmaNull_usesDefaultSigma() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 1000, 0.0, true, 0, 0, rg, false);
        PointValuePair result = optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{1.0, 1.0});
        assertNotNull(result);
    }

    // ---------------------------------------------------------------------
    // Exception cases
    // ---------------------------------------------------------------------

    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_inputSigmaDimensionMismatch_throwsException() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(5, new double[]{0.5}, 1000, 0.0, true, 0, 0, rg, false);
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
    }

    @Test(expected = NotPositiveException.class)
    public void testOptimize_negativeInputSigma_throwsException() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(5, new double[]{-0.5, 0.5}, 1000, 0.0, true, 0, 0, rg, false);
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_mixedFiniteInfiniteBounds_throwsException() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 1000, 0.0, true, 0, 0, rg, false);
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{0.5, 0.5}, new double[]{-5.0, Double.NEGATIVE_INFINITY},
                new double[]{5.0, Double.POSITIVE_INFINITY});
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimize_inputSigmaOutOfRange_throwsException() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(5, new double[]{20.0, 0.5}, 1000, 0.0, true, 0, 0, rg, false);
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE,
                new double[]{0.5, 0.5}, new double[]{-5.0, -5.0}, new double[]{5.0, 5.0});
    }

    // ---------------------------------------------------------------------
    // Statistics history tests (generateStatistics = true)
    // ---------------------------------------------------------------------

    @Test
    public void testGetStatisticsSigmaHistory_afterOptimization_notNull() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 1000, 0.0, true, 0, 0, rg, true);
        optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
        List<Double> history = optimizer.getStatisticsSigmaHistory();
        assertNotNull(history);
    }

    @Test
    public void testGetStatisticsMeanHistory_afterOptimization_notNull() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 1000, 0.0, true, 0, 0, rg, true);
        optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
        List<RealMatrix> history = optimizer.getStatisticsMeanHistory();
        assertNotNull(history);
    }

    @Test
    public void testGetStatisticsFitnessHistory_afterOptimization_notNull() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 1000, 0.0, true, 0, 0, rg, true);
        optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
        List<Double> history = optimizer.getStatisticsFitnessHistory();
        assertNotNull(history);
    }

    @Test
    public void testGetStatisticsDHistory_afterOptimization_notNull() {
        RandomGenerator rg = new MersenneTwister(12345);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 1000, 0.0, true, 0, 0, rg, true);
        optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
        List<RealMatrix> history = optimizer.getStatisticsDHistory();
        assertNotNull(history);
    }

    @Test
    public void testGetStatisticsHistories_noOptimizationRun_emptyLists() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        assertTrue(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }
}
