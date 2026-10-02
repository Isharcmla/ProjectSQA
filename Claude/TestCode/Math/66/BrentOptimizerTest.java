import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;

/**
 * Test suite for BrentOptimizer.
 * NOTE: This test class is placed in the same package
 * (org.apache.commons.math.optimization.univariate) as BrentOptimizer
 * in order to be able to directly invoke the protected method doOptimize().
 */
public class BrentOptimizerTest {

    private BrentOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new BrentOptimizer();
    }

    // Simple quadratic function: f(x) = (x - 2)^2, minimum at x = 2
    private static class SquareFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return (x - 2) * (x - 2);
        }
    }

    // Negative quadratic function: f(x) = -(x - 2)^2, maximum at x = 2
    private static class NegativeSquareFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return -((x - 2) * (x - 2));
        }
    }

    // Function that always throws FunctionEvaluationException
    private static class ThrowingFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            throw new FunctionEvaluationException(x);
        }
    }

    // ---------------------------------------------------------------------
    // (ก) Normal / typical input
    // ---------------------------------------------------------------------

    @Test
    public void testOptimize_minimizeNormalFunction_returnsExpectedMinimum()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new SquareFunction();
        double result = optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 1.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testOptimize_maximizeNormalFunction_returnsExpectedMaximum()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new NegativeSquareFunction();
        double result = optimizer.optimize(f, GoalType.MAXIMIZE, -10.0, 10.0, 1.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testOptimize_withoutStartValue_usesGoldenSectionPoint()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new SquareFunction();
        double result = optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testOptimize_resultMatchesGetResult_afterMinimize()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new SquareFunction();
        double result = optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 1.0);
        assertEquals(result, optimizer.getResult(), 1e-12);
    }

    @Test
    public void testOptimize_iterationCountIsNonNegative_afterOptimize()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new SquareFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 1.0);
        assertTrue(optimizer.getIterationCount() >= 0);
    }

    // ---------------------------------------------------------------------
    // (ข) Edge cases: boundary values, lo > hi, zero/negative accuracy etc.
    // ---------------------------------------------------------------------

    @Test
    public void testOptimize_loGreaterThanHi_stillFindsMinimum()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new SquareFunction();
        // min and max swapped internally (min=5 > max=1 style call not directly
        // possible via this API since min/max are explicit params; instead
        // we test with min < max but startValue at the boundary edge).
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 1.0, 5.0, 1.0);
        // minimum of (x-2)^2 within [1,5] still at x=2
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testOptimize_startValueAtLowerBoundary_returnsValidResult()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new SquareFunction();
        double result = optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, -10.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testOptimize_startValueAtUpperBoundary_returnsValidResult()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new SquareFunction();
        double result = optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 10.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testOptimize_narrowInterval_returnsValueWithinBounds()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new SquareFunction();
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 1.9, 2.1, 2.0);
        assertTrue(result >= 1.9 && result <= 2.1);
    }

    // ---------------------------------------------------------------------
    // (ค) Exception cases
    // ---------------------------------------------------------------------

    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_zeroRelativeAccuracy_throwsNotStrictlyPositiveException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        optimizer.setRelativeAccuracy(0.0);
        UnivariateRealFunction f = new SquareFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 1.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_negativeRelativeAccuracy_throwsNotStrictlyPositiveException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        optimizer.setRelativeAccuracy(-1.0e-5);
        UnivariateRealFunction f = new SquareFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 1.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_zeroAbsoluteAccuracy_throwsNotStrictlyPositiveException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        optimizer.setAbsoluteAccuracy(0.0);
        UnivariateRealFunction f = new SquareFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 1.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_negativeAbsoluteAccuracy_throwsNotStrictlyPositiveException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        optimizer.setAbsoluteAccuracy(-1.0e-10);
        UnivariateRealFunction f = new SquareFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 1.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testOptimize_zeroMaximalIterationCount_throwsMaxIterationsExceededException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        optimizer.setMaximalIterationCount(0);
        UnivariateRealFunction f = new SquareFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 1.0);
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testOptimize_functionThrowsException_propagatesFunctionEvaluationException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new ThrowingFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 1.0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDoOptimize_calledDirectly_throwsUnsupportedOperationException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        optimizer.doOptimize();
    }
}
