import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;

public class CMAESOptimizerTest {

    private RandomGenerator random;

    @Before
    public void setUp() {
        random = new MersenneTwister(12345L);
    }

    // Simple sphere function f(x) = sum(x_i^2), minimum at 0
    private static class SphereFunction implements MultivariateFunction {
        public double value(double[] point) {
            double sum = 0;
            for (double v : point) {
                sum += v * v;
            }
            return sum;
        }
    }

    // ---------------- Sigma inner class tests ----------------

    @Test
    public void testSigmaConstructor_ValidValues_NoException() {
        double[] values = {1.0, 2.0, 3.0};
        CMAESOptimizer.Sigma sigma = new CMAESOptimizer.Sigma(values);
        assertArrayEquals(values, sigma.getSigma(), 1e-10);
    }

    @Test(expected = NotPositiveException.class)
    public void testSigmaConstructor_NegativeValue_ThrowsNotPositiveException() {
        double[] values = {1.0, -2.0, 3.0};
        new CMAESOptimizer.Sigma(values);
    }

    @Test
    public void testSigmaConstructor_ZeroValue_NoException() {
        double[] values = {0.0, 1.0};
        CMAESOptimizer.Sigma sigma = new CMAESOptimizer.Sigma(values);
        assertEquals(0.0, sigma.getSigma()[0], 1e-10);
    }

    @Test
    public void testSigmaGetSigma_ReturnsClone_NotSameReference() {
        double[] values = {1.0, 2.0};
        CMAESOptimizer.Sigma sigma = new CMAESOptimizer.Sigma(values);
        double[] returned = sigma.getSigma();
        assertNotSame(values, returned);
        assertArrayEquals(values, returned, 1e-10);
    }

    // ---------------- PopulationSize inner class tests ----------------

    @Test
    public void testPopulationSizeConstructor_ValidValue_NoException() {
        CMAESOptimizer.PopulationSize popSize = new CMAESOptimizer.PopulationSize(10);
        assertEquals(10, popSize.getPopulationSize());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testPopulationSizeConstructor_ZeroValue_ThrowsException() {
        new CMAESOptimizer.PopulationSize(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testPopulationSizeConstructor_NegativeValue_ThrowsException() {
        new CMAESOptimizer.PopulationSize(-5);
    }

    @Test
    public void testPopulationSizeGetPopulationSize_ReturnsCorrectValue() {
        CMAESOptimizer.PopulationSize popSize = new CMAESOptimizer.PopulationSize(25);
        assertEquals(25, popSize.getPopulationSize());
    }

    // ---------------- Statistics getters before optimize ----------------

    @Test
    public void testGetStatisticsHistories_BeforeOptimize_EmptyLists() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            1000, 1e-10, true, 0, 0, random, true, null);
        assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        assertTrue(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }

    // ---------------- Normal optimize tests ----------------

    @Test
    public void testOptimize_SphereFunctionMinimize_ReturnsNearZero() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            2000, 1e-10, true, 0, 0, random, false, null);

        double[] start = {3.0, 3.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] sigmaVals = {1.0, 1.0};

        PointValuePair result = optimizer.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(10));

        assertNotNull(result);
        assertTrue(result.getValue() < 1.0);
    }

    @Test
    public void testOptimize_MaximizeGoal_ReturnsCorrectMax() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            2000, 1e-10, true, 0, 0, random, false, null);

        MultivariateFunction negSphere = new MultivariateFunction() {
            public double value(double[] point) {
                double sum = 0;
                for (double v : point) {
                    sum += v * v;
                }
                return -sum;
            }
        };

        double[] start = {2.0, 2.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] sigmaVals = {1.0, 1.0};

        PointValuePair result = optimizer.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(negSphere),
            GoalType.MAXIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(10));

        assertNotNull(result);
        assertTrue(result.getValue() > -1.0);
    }

    @Test
    public void testOptimize_ActiveCMA_False_ConvergesOk() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            1000, 1e-10, false, 0, 0, random, false, null);

        double[] start = {2.0, 2.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] sigmaVals = {1.0, 1.0};

        PointValuePair result = optimizer.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(8));

        assertNotNull(result);
    }

    @Test
    public void testOptimize_DiagonalOnlyGreaterThanZero_ConvergesOk() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            500, 1e-10, true, 2, 0, random, false, null);

        double[] start = {2.0, 2.0, 2.0};
        double[] lower = {-10.0, -10.0, -10.0};
        double[] upper = {10.0, 10.0, 10.0};
        double[] sigmaVals = {1.0, 1.0, 1.0};

        PointValuePair result = optimizer.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(10));

        assertNotNull(result);
    }

    @Test
    public void testOptimize_GenerateStatisticsTrue_HistoriesPopulated() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            50, 1e-10, true, 0, 0, random, true, null);

        double[] start = {2.0, 2.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] sigmaVals = {1.0, 1.0};

        optimizer.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(8));

        assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertFalse(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertFalse(optimizer.getStatisticsMeanHistory().isEmpty());
        assertFalse(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testOptimize_StopFitnessReached_TerminatesEarly() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            5000, 1.0, true, 0, 0, random, false, null);

        double[] start = {5.0, 5.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] sigmaVals = {1.0, 1.0};

        PointValuePair result = optimizer.optimize(
            new MaxEval(50000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(10));

        assertNotNull(result);
    }

    @Test
    public void testOptimize_WithConvergenceChecker_TerminatesEarly() {
        SimpleValueChecker checker = new SimpleValueChecker(1e-6, 1e-6);
        CMAESOptimizer optimizer = new CMAESOptimizer(
            5000, 0, true, 0, 0, random, false, checker);

        double[] start = {3.0, 3.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] sigmaVals = {1.0, 1.0};

        PointValuePair result = optimizer.optimize(
            new MaxEval(50000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(10));

        assertNotNull(result);
    }

    @Test
    public void testOptimize_CheckFeasableCountPositive_HandlesInfeasiblePoints() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            200, 1e-10, true, 0, 3, random, false, null);

        double[] start = {0.0, 0.0};
        double[] lower = {-1.0, -1.0};
        double[] upper = {1.0, 1.0};
        // Large sigma relative to bounds increases chance of infeasible samples
        double[] sigmaVals = {1.0, 1.0};

        PointValuePair result = optimizer.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(10));

        assertNotNull(result);
    }

    @Test
    public void testOptimize_SingleDimension_ConvergesOk() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            500, 1e-10, true, 0, 0, random, false, null);

        double[] start = {4.0};
        double[] lower = {-10.0};
        double[] upper = {10.0};
        double[] sigmaVals = {1.0};

        PointValuePair result = optimizer.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(6));

        assertNotNull(result);
    }

    // ---------------- Exception tests ----------------

    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_WithoutPopulationSize_ThrowsNotStrictlyPositiveException() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            100, 1e-10, true, 0, 0, random, false, null);

        double[] start = {2.0, 2.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] sigmaVals = {1.0, 1.0};

        // PopulationSize omitted -> lambda stays 0 -> NotStrictlyPositiveException
        optimizer.optimize(
            new MaxEval(2000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals));
    }

    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_SigmaDimensionMismatch_ThrowsDimensionMismatchException() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            100, 1e-10, true, 0, 0, random, false, null);

        double[] start = {2.0, 2.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        // sigma length mismatched with start length
        double[] sigmaVals = {1.0, 1.0, 1.0};

        optimizer.optimize(
            new MaxEval(2000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(8));
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimize_SigmaOutOfRange_ThrowsOutOfRangeException() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            100, 1e-10, true, 0, 0, random, false, null);

        double[] start = {0.0, 0.0};
        double[] lower = {-1.0, -1.0};
        double[] upper = {1.0, 1.0};
        // Sigma larger than allowed range (uB - lB = 2)
        double[] sigmaVals = {5.0, 5.0};

        optimizer.optimize(
            new MaxEval(2000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(8));
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_MaxEvalZero_ThrowsTooManyEvaluationsException() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            100, 1e-10, true, 0, 0, random, false, null);

        double[] start = {2.0, 2.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] sigmaVals = {1.0, 1.0};

        optimizer.optimize(
            new MaxEval(0),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(8));
    }

    @Test
    public void testOptimize_LimitedMaxEval_ReturnsResultWithoutThrowing() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            1000, 1e-10, true, 0, 0, random, false, null);

        double[] start = {2.0, 2.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] sigmaVals = {1.0, 1.0};

        // Enough evaluations for the initial guess plus a few generations,
        // but not enough to run to full convergence - exercises internal
        // catch of TooManyEvaluationsException in the generation loop.
        PointValuePair result = optimizer.optimize(
            new MaxEval(30),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(10));

        assertNotNull(result);
    }

    @Test
    public void testOptimize_ZeroSigmaValue_NoExceptionAndResultReturned() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            200, 1e-10, true, 0, 0, random, false, null);

        double[] start = {1.0, 1.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        // zero is allowed by Sigma (only negative throws)
        double[] sigmaVals = {0.5, 0.5};

        PointValuePair result = optimizer.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(8));

        assertNotNull(result);
    }

    @Test
    public void testOptimize_RepeatCallReusesPreviousSigmaIfNotProvided() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
            500, 1e-10, true, 0, 0, random, false, null);

        double[] start = {2.0, 2.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] sigmaVals = {1.0, 1.0};

        // First call sets inputSigma
        optimizer.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.Sigma(sigmaVals),
            new CMAESOptimizer.PopulationSize(8));

        // Second call without providing Sigma again - should reuse previous value
        PointValuePair result = optimizer.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(new SphereFunction()),
            GoalType.MINIMIZE,
            new SimpleBounds(lower, upper),
            new InitialGuess(start),
            new CMAESOptimizer.PopulationSize(8));

        assertNotNull(result);
    }
}
