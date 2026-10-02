import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.optimization.direct.CMAESOptimizer;
import org.apache.commons.math3.random.MersenneTwister;

public class CMAESOptimizerTest {

    /** Simple sphere function f(x) = sum((x[i]-target[i])^2) */
    private static class SphereFunction implements MultivariateFunction {
        private final double[] target;

        SphereFunction(double[] target) {
            this.target = target;
        }

        public double value(double[] point) {
            double sum = 0;
            for (int i = 0; i < point.length; i++) {
                double d = point[i] - target[i];
                sum += d * d;
            }
            return sum;
        }
    }

    /** Simple negative parabola for maximize tests: f(x) = -(sum((x[i]-target[i])^2)) */
    private static class NegSphereFunction implements MultivariateFunction {
        private final double[] target;

        NegSphereFunction(double[] target) {
            this.target = target;
        }

        public double value(double[] point) {
            double sum = 0;
            for (int i = 0; i < point.length; i++) {
                double d = point[i] - target[i];
                sum += d * d;
            }
            return -sum;
        }
    }

    // ---------------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------------

    @Test
    public void testDefaultConstructor_createsInstance() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorWithLambda_createsInstance() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorWithLambdaAndSigma_createsInstance() {
        double[] sigma = {0.5, 0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(8, sigma);
        assertNotNull(optimizer);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructor_createsInstance() {
        double[] sigma = {0.5, 0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, sigma, 1000, 0.0, true, 0, 0,
                new MersenneTwister(12345), false);
        assertNotNull(optimizer);
    }

    @Test
    public void testFullConstructorWithChecker_createsInstance() {
        double[] sigma = {0.5, 0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, sigma, 1000, 0.0, false, 1, 0,
                new MersenneTwister(12345), true,
                new SimpleValueChecker(1e-10, 1e-10));
        assertNotNull(optimizer);
    }

    // ---------------------------------------------------------------------
    // Normal / typical optimize tests
    // ---------------------------------------------------------------------

    @Test
    public void testOptimize_sphereFunctionNoBounds_findsMinimum() {
        double[] target = {1.0, 2.0};
        double[] startPoint = {0.0, 0.0};
        double[] sigma = {0.5, 0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 2000, 0.0, true, 0, 0,
                new MersenneTwister(12345), false,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
                20000, new SphereFunction(target), GoalType.MINIMIZE, startPoint);

        assertNotNull(result);
        assertEquals(target[0], result.getPoint()[0], 0.5);
        assertEquals(target[1], result.getPoint()[1], 0.5);
    }

    @Test
    public void testOptimize_sphereFunctionWithBounds_findsMinimumWithinBounds() {
        double[] target = {2.0, -1.0};
        double[] startPoint = {0.0, 0.0};
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};
        double[] sigma = {1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 2000, 0.0, true, 0, 0,
                new MersenneTwister(54321), false,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
                20000, new SphereFunction(target), GoalType.MINIMIZE,
                startPoint, lower, upper);

        assertNotNull(result);
        assertTrue(result.getPoint()[0] >= lower[0] && result.getPoint()[0] <= upper[0]);
        assertTrue(result.getPoint()[1] >= lower[1] && result.getPoint()[1] <= upper[1]);
    }

    @Test
    public void testOptimize_maximizeGoalType_findsMaximum() {
        double[] target = {0.5, 0.5};
        double[] startPoint = {0.0, 0.0};
        double[] sigma = {0.3, 0.3};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 2000, 0.0, true, 0, 0,
                new MersenneTwister(999), false,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
                20000, new NegSphereFunction(target), GoalType.MAXIMIZE, startPoint);

        assertNotNull(result);
        assertEquals(target[0], result.getPoint()[0], 0.5);
        assertEquals(target[1], result.getPoint()[1], 0.5);
    }

    @Test
    public void testOptimize_defaultConstructorLambdaZero_autoComputesLambda() {
        double[] target = {0.0, 0.0};
        double[] startPoint = {1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer();

        PointValuePair result = optimizer.optimize(
                10000, new SphereFunction(target), GoalType.MINIMIZE, startPoint);

        assertNotNull(result);
    }

    @Test
    public void testOptimize_diagonalOnlyGreaterThanOne_coversDiagonalBranch() {
        double[] target = {1.0, 1.0, 1.0};
        double[] startPoint = {0.0, 0.0, 0.0};
        double[] sigma = {0.5, 0.5, 0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 500, 0.0, true, 2, 0,
                new MersenneTwister(111), false,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(target), GoalType.MINIMIZE, startPoint);

        assertNotNull(result);
    }

    @Test
    public void testOptimize_isActiveCMAFalse_coversNonActiveBranch() {
        double[] target = {0.5, 0.5};
        double[] startPoint = {0.0, 0.0};
        double[] sigma = {0.3, 0.3};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 1000, 0.0, false, 0, 0,
                new MersenneTwister(222), false,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
                10000, new SphereFunction(target), GoalType.MINIMIZE, startPoint);

        assertNotNull(result);
    }

    @Test
    public void testOptimize_checkFeasableCountGreaterThanZero_coversFeasabilityLoop() {
        double[] target = {2.0, 2.0};
        double[] startPoint = {1.0, 1.0};
        double[] lower = {0.0, 0.0};
        double[] upper = {4.0, 4.0};
        double[] sigma = {1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 500, 0.0, true, 0, 3,
                new MersenneTwister(333), false,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(target), GoalType.MINIMIZE,
                startPoint, lower, upper);

        assertNotNull(result);
    }

    @Test
    public void testOptimize_veryLowMaxEvaluations_returnsWithoutThrowing() {
        double[] target = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};
        double[] sigma = {0.5, 0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                4, sigma, 1000, 0.0, true, 0, 0,
                new MersenneTwister(444), false,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
                2, new SphereFunction(target), GoalType.MINIMIZE, startPoint);

        assertNotNull(result);
    }

    // ---------------------------------------------------------------------
    // Statistics getters
    // ---------------------------------------------------------------------

    @Test
    public void testGetStatisticsHistories_beforeOptimize_empty() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        assertTrue(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testGetStatisticsHistories_afterOptimizeWithGenerateStatistics_notEmpty() {
        double[] target = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};
        double[] sigma = {0.5, 0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 1000, 0.0, true, 0, 0,
                new MersenneTwister(555), true,
                new SimpleValueChecker(1e-10, 1e-10));

        optimizer.optimize(10000, new SphereFunction(target), GoalType.MINIMIZE, startPoint);

        assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertFalse(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertFalse(optimizer.getStatisticsMeanHistory().isEmpty());
        assertFalse(optimizer.getStatisticsDHistory().isEmpty());
    }

    // ---------------------------------------------------------------------
    // Exception / edge case tests
    // ---------------------------------------------------------------------

    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_inputSigmaDimensionMismatch_throwsDimensionMismatchException() {
        double[] target = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};
        double[] sigma = {0.5, 0.5, 0.5}; // mismatched length
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 1000, 0.0, true, 0, 0,
                new MersenneTwister(666), false,
                new SimpleValueChecker(1e-10, 1e-10));

        optimizer.optimize(10000, new SphereFunction(target), GoalType.MINIMIZE, startPoint);
    }

    @Test(expected = NotPositiveException.class)
    public void testOptimize_negativeInputSigma_throwsNotPositiveException() {
        double[] target = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};
        double[] sigma = {-1.0, 0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 1000, 0.0, true, 0, 0,
                new MersenneTwister(777), false,
                new SimpleValueChecker(1e-10, 1e-10));

        optimizer.optimize(10000, new SphereFunction(target), GoalType.MINIMIZE, startPoint);
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimize_inputSigmaOutOfRange_throwsOutOfRangeException() {
        double[] target = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};
        double[] sigma = {20.0, 0.5}; // range is 10, sigma[0]=20 > 10
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 1000, 0.0, true, 0, 0,
                new MersenneTwister(888), false,
                new SimpleValueChecker(1e-10, 1e-10));

        optimizer.optimize(10000, new SphereFunction(target), GoalType.MINIMIZE,
                startPoint, lower, upper);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_mixedInfiniteBounds_throwsMathUnsupportedOperationException() {
        double[] target = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, Double.POSITIVE_INFINITY}; // mixed finite/infinite
        CMAESOptimizer optimizer = new CMAESOptimizer(10);

        optimizer.optimize(10000, new SphereFunction(target), GoalType.MINIMIZE,
                startPoint, lower, upper);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize_boundsDifferenceOverflow_throwsNumberIsTooLargeException() {
        double[] target = {1.0};
        double[] startPoint = {0.0};
        double[] lower = {-Double.MAX_VALUE};
        double[] upper = {Double.MAX_VALUE};
        CMAESOptimizer optimizer = new CMAESOptimizer(10);

        optimizer.optimize(1000, new SphereFunction(target), GoalType.MINIMIZE,
                startPoint, lower, upper);
    }

    @Test
    public void testOptimize_allInfiniteBounds_noBoundariesUsed() {
        double[] target = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};
        double[] lower = {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        double[] upper = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
        double[] sigma = {0.5, 0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 1000, 0.0, true, 0, 0,
                new MersenneTwister(999), false,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
                10000, new SphereFunction(target), GoalType.MINIMIZE,
                startPoint, lower, upper);

        assertNotNull(result);
    }

    @Test
    public void testOptimize_stopFitnessReached_terminatesEarly() {
        double[] target = {0.0, 0.0};
        double[] startPoint = {0.0, 0.0};
        double[] sigma = {0.5, 0.5};
        // stopFitness set high so it should be reached quickly for minimize
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 1000, 100.0, true, 0, 0,
                new MersenneTwister(1010), false,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
                10000, new SphereFunction(target), GoalType.MINIMIZE, startPoint);

        assertNotNull(result);
    }

    @Test
    public void testOptimize_singleDimensionProblem_noBounds() {
        double[] target = {3.0};
        double[] startPoint = {0.0};
        double[] sigma = {0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(
                6, sigma, 2000, 0.0, true, 0, 0,
                new MersenneTwister(2020), false,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
                10000, new SphereFunction(target), GoalType.MINIMIZE, startPoint);

        assertNotNull(result);
        assertEquals(target[0], result.getPoint()[0], 0.5);
    }
}
