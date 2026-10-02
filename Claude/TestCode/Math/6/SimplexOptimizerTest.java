package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;

/**
 * Unit tests for {@link SimplexOptimizer}.
 */
public class SimplexOptimizerTest {

    /** Simple quadratic function: f(x,y) = (x-1)^2 + (y-2)^2, minimum at (1,2) = 0. */
    private static class Quadratic implements MultivariateFunction {
        public double value(double[] point) {
            double dx = point[0] - 1;
            double dy = point[1] - 2;
            return dx * dx + dy * dy;
        }
    }

    /** Function used to test maximization: f(x,y) = -(x^2 + y^2), maximum at (0,0) = 0. */
    private static class NegativeSumOfSquares implements MultivariateFunction {
        public double value(double[] point) {
            double sum = 0;
            for (double v : point) {
                sum += v * v;
            }
            return -sum;
        }
    }

    @Before
    public void setUp() {
        // no shared state needed
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_withConvergenceChecker_createsInstance() {
        SimpleValueChecker checker = new SimpleValueChecker(1e-10, 1e-10);
        SimplexOptimizer optimizer = new SimplexOptimizer(checker);
        assertNotNull(optimizer);
        assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testConstructor_withRelAbsThresholds_createsInstance() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);
        assertNotNull(optimizer);
        assertNotNull(optimizer.getConvergenceChecker());
    }

    // ---------------------------------------------------------------
    // Normal / typical cases
    // ---------------------------------------------------------------

    @Test
    public void testOptimize_withNelderMeadSimplex_findsMinimum() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new Quadratic()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] {0, 0}),
                new NelderMeadSimplex(2));

        assertNotNull(result);
        assertEquals(1.0, result.getPoint()[0], 1e-3);
        assertEquals(2.0, result.getPoint()[1], 1e-3);
        assertEquals(0.0, result.getValue(), 1e-3);
    }

    @Test
    public void testOptimize_withMultiDirectionalSimplex_findsMinimum() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new Quadratic()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] {5, 5}),
                new MultiDirectionalSimplex(2));

        assertNotNull(result);
        assertEquals(1.0, result.getPoint()[0], 1e-2);
        assertEquals(2.0, result.getPoint()[1], 1e-2);
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    @Test
    public void testOptimize_maximizeGoalType_findsMaximum() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new NegativeSumOfSquares()),
                GoalType.MAXIMIZE,
                new InitialGuess(new double[] {1, 1}),
                new NelderMeadSimplex(2));

        assertNotNull(result);
        assertEquals(0.0, result.getPoint()[0], 1e-3);
        assertEquals(0.0, result.getPoint()[1], 1e-3);
        assertEquals(0.0, result.getValue(), 1e-3);
    }

    @Test
    public void testOptimize_reusePreviousSimplex_succeedsWithoutNewSimplexData() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);

        // First call sets up the simplex.
        PointValuePair firstResult = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new Quadratic()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] {0, 0}),
                new NelderMeadSimplex(2));
        assertNotNull(firstResult);

        // Second call does NOT provide a new simplex; the previous one should be reused.
        PointValuePair secondResult = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new Quadratic()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] {3, 3}));

        assertNotNull(secondResult);
        assertEquals(1.0, secondResult.getPoint()[0], 1e-2);
        assertEquals(2.0, secondResult.getPoint()[1], 1e-2);
    }

    // ---------------------------------------------------------------
    // Edge cases / exception cases
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testOptimize_withoutSimplex_throwsNullArgumentException() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);

        // No AbstractSimplex instance is provided -> simplex stays null.
        optimizer.optimize(
                new MaxEval(1000),
                new ObjectiveFunction(new Quadratic()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] {0, 0}));
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_withBounds_throwsMathUnsupportedOperationException() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);

        optimizer.optimize(
                new MaxEval(1000),
                new ObjectiveFunction(new Quadratic()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] {0, 0}),
                new NelderMeadSimplex(2),
                new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}));
    }

    @Test
    public void testOptimize_withZeroStartPoint_convergesToMinimum() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new Quadratic()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] {0, 0}),
                new NelderMeadSimplex(2));

        assertNotNull(result);
        assertEquals(1.0, result.getPoint()[0], 1e-2);
        assertEquals(2.0, result.getPoint()[1], 1e-2);
    }

    @Test
    public void testOptimize_withNegativeStartPoint_convergesToMinimum() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);

        PointValuePair result = optimizer.optimize(
                new MaxEval(10000),
                new ObjectiveFunction(new Quadratic()),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] {-10, -10}),
                new NelderMeadSimplex(2));

        assertNotNull(result);
        assertEquals(1.0, result.getPoint()[0], 1e-2);
        assertEquals(2.0, result.getPoint()[1], 1e-2);
    }
}
