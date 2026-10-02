package org.apache.commons.math3.optimization.direct;

import java.lang.reflect.Constructor;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;

public class CMAESOptimizerTest {

    private static class SphereFunction implements MultivariateFunction {
        public double value(double[] point) {
            double sum = 0;
            for (double x : point) {
                sum += x * x;
            }
            return sum;
        }
    }

    private static class ConstantFunction implements MultivariateFunction {
        public double value(double[] point) {
            return 10.0;
        }
    }

    @Test
    public void testDefaultConstructor_InitializesProperly() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        Assert.assertNotNull(optimizer.getStatisticsSigmaHistory());
        Assert.assertNotNull(optimizer.getStatisticsMeanHistory());
        Assert.assertNotNull(optimizer.getStatisticsFitnessHistory());
        Assert.assertNotNull(optimizer.getStatisticsDHistory());
        Assert.assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
    }

    @Test
    public void testLambdaConstructor_InitializesProperly() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        Assert.assertNotNull(optimizer);
    }

    @Test
    public void testLambdaAndInputSigmaConstructor_InitializesProperly() {
        double[] inputSigma = new double[]{0.5, 0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, inputSigma);
        Assert.assertNotNull(optimizer);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedConstructor_InitializesProperly() {
        RandomGenerator rng = new MersenneTwister(123456L);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.2}, 100, 1e-4, true, 0, 0, rng, true);
        Assert.assertNotNull(optimizer);
    }

    @Test
    public void testFullConstructor_InitializesProperly() {
        RandomGenerator rng = new MersenneTwister(123456L);
        SimpleValueChecker checker = new SimpleValueChecker(1e-5, 1e-5);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.2}, 100, 1e-4, true, 0, 0, rng, true, checker);
        Assert.assertNotNull(optimizer);
    }

    @Test
    public void testOptimize_SphereFunction_Minimize_Success() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.2, 0.2}, 1000, 1e-10, true, 0, 0,
                new MersenneTwister(123L), true);
        double[] start = new double[]{1.0, 1.0};
        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, start);

        Assert.assertEquals(0.0, result.getValue(), 1e-2);
        Assert.assertEquals(0.0, result.getPoint()[0], 1e-1);
        Assert.assertEquals(0.0, result.getPoint()[1], 1e-1);

        List<Double> sigmas = optimizer.getStatisticsSigmaHistory();
        List<RealMatrix> means = optimizer.getStatisticsMeanHistory();
        List<Double> fitness = optimizer.getStatisticsFitnessHistory();
        List<RealMatrix> dHistory = optimizer.getStatisticsDHistory();

        Assert.assertFalse(sigmas.isEmpty());
        Assert.assertFalse(means.isEmpty());
        Assert.assertFalse(fitness.isEmpty());
        Assert.assertFalse(dHistory.isEmpty());
    }

    @Test
    public void testOptimize_SphereFunction_Maximize_Success() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.2, 0.2}, 1000, -1e-10, true, 0, 0,
                new MersenneTwister(123L), false);
        double[] start = new double[]{1.0, 1.0};
        MultivariateFunction negSphere = new MultivariateFunction() {
            public double value(double[] point) {
                return -(point[0] * point[0] + point[1] * point[1]);
            }
        };
        PointValuePair result = optimizer.optimize(
                5000, negSphere, GoalType.MAXIMIZE, start);

        Assert.assertEquals(0.0, result.getValue(), 1e-2);
        Assert.assertEquals(0.0, result.getPoint()[0], 1e-1);
        Assert.assertEquals(0.0, result.getPoint()[1], 1e-1);
    }

    @Test
    public void testOptimize_WithBoundaries_FeasibleSolution() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, new double[]{0.1, 0.1}, 1000, 1e-8, true, 0, 3,
                new MersenneTwister(42L), false);
        double[] start = new double[]{0.5, 0.5};
        double[] lower = new double[]{-1.0, -1.0};
        double[] upper = new double[]{2.0, 2.0};

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);

        Assert.assertEquals(0.0, result.getValue(), 1e-2);
        Assert.assertTrue(result.getPoint()[0] >= lower[0] && result.getPoint()[0] <= upper[0]);
        Assert.assertTrue(result.getPoint()[1] >= lower[1] && result.getPoint()[1] <= upper[1]);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_MixedFiniteAndInfiniteBoundaries_ThrowsException() {
        CMAESOptimizer optimizer = new CMAESOptimizer(5);
        double[] start = new double[]{0.5, 0.5};
        double[] lower = new double[]{0.0, Double.NEGATIVE_INFINITY};
        double[] upper = new double[]{1.0, 1.0};

        optimizer.optimize(100, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);
    }

    @Test
    public void testCheckParameters_AllInfiniteBoundaries_TreatedAsNoBoundaries() {
        CMAESOptimizer optimizer = new CMAESOptimizer(5);
        double[] start = new double[]{0.5, 0.5};
        double[] lower = new double[]{Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        double[] upper = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};

        PointValuePair result = optimizer.optimize(
                1000, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);
        Assert.assertNotNull(result);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckParameters_InputSigmaDimensionMismatch_ThrowsException() {
        double[] inputSigma = new double[]{0.5};
        CMAESOptimizer optimizer = new CMAESOptimizer(5, inputSigma);
        double[] start = new double[]{0.5, 0.5};

        optimizer.optimize(100, new SphereFunction(), GoalType.MINIMIZE, start);
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckParameters_InputSigmaNegative_ThrowsException() {
        double[] inputSigma = new double[]{0.5, -0.1};
        CMAESOptimizer optimizer = new CMAESOptimizer(5, inputSigma);
        double[] start = new double[]{0.5, 0.5};

        optimizer.optimize(100, new SphereFunction(), GoalType.MINIMIZE, start);
    }

    @Test(expected = OutOfRangeException.class)
    public void testCheckParameters_InputSigmaLargerThanBoundaryRange_ThrowsException() {
        double[] inputSigma = new double[]{0.5, 5.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(5, inputSigma);
        double[] start = new double[]{0.5, 0.5};
        double[] lower = new double[]{0.0, 0.0};
        double[] upper = new double[]{1.0, 1.0};

        optimizer.optimize(100, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);
    }

    @Test
    public void testOptimize_DiagonalOnlyMode_TransitionsProperly() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.2, 0.2}, 100, 1e-10, true, 2, 0,
                new MersenneTwister(12345L), false);
        double[] start = new double[]{1.0, 1.0};

        PointValuePair result = optimizer.optimize(
                1000, new SphereFunction(), GoalType.MINIMIZE, start);
        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimize_NonActiveCMA_Converges() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.2, 0.2}, 500, 1e-8, false, 0, 0,
                new MersenneTwister(42L), false);
        double[] start = new double[]{1.0, 1.0};

        PointValuePair result = optimizer.optimize(
                3000, new SphereFunction(), GoalType.MINIMIZE, start);
        Assert.assertEquals(0.0, result.getValue(), 1e-2);
    }

    @Test
    public void testOptimize_StopFitnessCriterion_TerminatesEarly() {
        double stopFitness = 0.5;
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, new double[]{0.1, 0.1}, 1000, stopFitness, true, 0, 0,
                new MersenneTwister(999L), false);
        double[] start = new double[]{1.0, 1.0};

        PointValuePair result = optimizer.optimize(
                5000, new SphereFunction(), GoalType.MINIMIZE, start);
        Assert.assertTrue(result.getValue() <= stopFitness);
    }

    @Test
    public void testOptimize_StopFitnessCriterion_Maximize() {
        double stopFitness = -0.5;
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, new double[]{0.1, 0.1}, 1000, stopFitness, true, 0, 0,
                new MersenneTwister(999L), false);
        double[] start = new double[]{1.0, 1.0};
        MultivariateFunction negSphere = new MultivariateFunction() {
            public double value(double[] point) {
                return -(point[0] * point[0] + point[1] * point[1]);
            }
        };
        PointValuePair result = optimizer.optimize(
                5000, negSphere, GoalType.MAXIMIZE, start);
        Assert.assertTrue(result.getValue() >= stopFitness);
    }

    @Test
    public void testOptimize_TooManyEvaluationsException_HandlesGracefully() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.2, 0.2}, 1000, 1e-12, true, 0, 0,
                new MersenneTwister(42L), false);
        double[] start = new double[]{10.0, 10.0};

        PointValuePair result = optimizer.optimize(
                15, new SphereFunction(), GoalType.MINIMIZE, start);
        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimize_CustomConvergenceChecker_TerminatesEarly() {
        ConvergenceChecker<PointValuePair> customChecker = new ConvergenceChecker<PointValuePair>() {
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                return iteration >= 3;
            }
        };

        CMAESOptimizer optimizer = new CMAESOptimizer(
                6, new double[]{0.2, 0.2}, 100, 1e-12, true, 0, 0,
                new MersenneTwister(123L), false, customChecker);
        double[] start = new double[]{1.0, 1.0};

        PointValuePair result = optimizer.optimize(
                500, new SphereFunction(), GoalType.MINIMIZE, start);
        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimize_ConstantFunction_FlatFitnessStepSizeAdjustment() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, new double[]{0.2, 0.2}, 10, 0, true, 0, 0,
                new MersenneTwister(42L), false);
        double[] start = new double[]{1.0, 1.0};

        PointValuePair result = optimizer.optimize(
                100, new ConstantFunction(), GoalType.MINIMIZE, start);
        Assert.assertEquals(10.0, result.getValue(), 1e-6);
    }

    @Test
    public void testDoubleIndex_EqualsHashCodeAndCompareTo() throws Exception {
        Class<?> innerClass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex");
        Constructor<?> ctor = innerClass.getDeclaredConstructor(double.class, int.class);
        ctor.setAccessible(true);

        Object index1 = ctor.newInstance(1.5, 0);
        Object index2 = ctor.newInstance(1.5, 1);
        Object index3 = ctor.newInstance(2.5, 2);

        Assert.assertTrue(index1.equals(index1));
        Assert.assertTrue(index1.equals(index2));
        Assert.assertFalse(index1.equals(index3));
        Assert.assertFalse(index1.equals(null));
        Assert.assertFalse(index1.equals("NotADoubleIndex"));

        Assert.assertEquals(index1.hashCode(), index2.hashCode());

        @SuppressWarnings("unchecked")
        Comparable<Object> comp1 = (Comparable<Object>) index1;
        Assert.assertEquals(0, comp1.compareTo(index2));
        Assert.assertTrue(comp1.compareTo(index3) < 0);
    }
}
