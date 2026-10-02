import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.solvers.BrentSolver;

public class BrentSolverTest {

    private static final double DELTA = 1e-4;
    private static final double TINY_DELTA = 1e-12;

    /** Simple linear function f(x) = x - root */
    private static class LinearFunction implements UnivariateRealFunction {
        private final double root;
        LinearFunction(double root) {
            this.root = root;
        }
        public double value(double x) throws FunctionEvaluationException {
            return x - root;
        }
    }

    /** Function that is always positive, never crosses zero in tested range */
    private static class AlwaysPositiveFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return x * x + 10;
        }
    }

    /** Function f(x) = x + 10, positive for tested domain, no real root nearby */
    private static class NoRootInRangeFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return x + 10;
        }
    }

    /** Function always throwing an exception */
    private static class ThrowingFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            throw new FunctionEvaluationException(x);
        }
    }

    /** Classic cubic test function used for Brent's method: x^3 - 2x - 5 */
    private static class CubicTestFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return x * x * x - 2 * x - 5;
        }
    }

    private BrentSolver solver;

    @Before
    public void setUp() {
        solver = new BrentSolver();
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor_create_noException() {
        BrentSolver s = new BrentSolver();
        assertNotNull(s);
    }

    @Test
    public void testDeprecatedConstructorWithFunction_create_noException() {
        BrentSolver s = new BrentSolver(new LinearFunction(2.0));
        assertNotNull(s);
    }

    // ---------------------------------------------------------------
    // solve(f, min, max)
    // ---------------------------------------------------------------

    @Test
    public void testSolve_f_min_max_normalRoot_returnsRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        LinearFunction f = new LinearFunction(2.0);
        double result = solver.solve(f, 0, 5);
        assertEquals(2.0, result, DELTA);
    }

    @Test
    public void testSolve_f_min_max_cubicFunction_returnsRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        CubicTestFunction f = new CubicTestFunction();
        double result = solver.solve(f, 2, 3);
        assertEquals(2.0945514815423265, result, DELTA);
    }

    @Test
    public void testSolve_f_min_max_yMinZero_returnsMin()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        LinearFunction f = new LinearFunction(2.0);
        double result = solver.solve(f, 2.0, 5.0);
        assertEquals(2.0, result, TINY_DELTA);
    }

    @Test
    public void testSolve_f_min_max_yMaxZero_returnsMax()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        LinearFunction f = new LinearFunction(5.0);
        double result = solver.solve(f, 0.0, 5.0);
        assertEquals(5.0, result, TINY_DELTA);
    }

    @Test
    public void testSolve_f_min_max_yMinCloseToZero_returnsMin()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double root = 2.0 - 1e-7;
        LinearFunction f = new LinearFunction(root);
        double min = 2.0;
        double max = 5.0;
        double result = solver.solve(f, min, max);
        assertEquals(min, result, TINY_DELTA);
    }

    @Test
    public void testSolve_f_min_max_yMaxCloseToZero_returnsMax()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double max = 5.0;
        double root = max + 1e-7;
        LinearFunction f = new LinearFunction(root);
        double min = 0.0;
        double result = solver.solve(f, min, max);
        assertEquals(max, result, TINY_DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_f_min_max_nonBracketing_throwsIllegalArgumentException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        AlwaysPositiveFunction f = new AlwaysPositiveFunction();
        solver.solve(f, -2, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_f_min_max_invalidInterval_throwsIllegalArgumentException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        LinearFunction f = new LinearFunction(2.0);
        solver.solve(f, 5, 0);
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testSolve_f_min_max_functionThrows_propagatesException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        ThrowingFunction f = new ThrowingFunction();
        solver.solve(f, 0, 5);
    }

    // ---------------------------------------------------------------
    // solve(f, min, max, initial)
    // ---------------------------------------------------------------

    @Test
    public void testSolve_f_min_max_initial_initialCloseToZero_returnsInitial()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double root = 2.0;
        LinearFunction f = new LinearFunction(root);
        double initial = root + 1e-8;
        double result = solver.solve(f, 0.0, 5.0, initial);
        assertEquals(initial, result, TINY_DELTA);
    }

    @Test
    public void testSolve_f_min_max_initial_yMinCloseToZero_returnsTinyValue()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double root = 2.0;
        LinearFunction f = new LinearFunction(root);
        double min = root + 1e-7;
        double max = 5.0;
        double initial = 3.0;
        double result = solver.solve(f, min, max, initial);
        double expectedYMin = min - root;
        assertEquals(expectedYMin, result, TINY_DELTA);
    }

    @Test
    public void testSolve_f_min_max_initial_bracketWithMin_returnsRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        LinearFunction f = new LinearFunction(2.0);
        double result = solver.solve(f, 0.0, 5.0, 3.0);
        assertEquals(2.0, result, DELTA);
    }

    @Test
    public void testSolve_f_min_max_initial_yMaxCloseToZero_returnsTinyValue()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double root = 5.0;
        LinearFunction f = new LinearFunction(root);
        double min = 0.0;
        double max = root - 1e-7;
        double initial = 1.0;
        double result = solver.solve(f, min, max, initial);
        double expectedYMax = max - root;
        assertEquals(expectedYMax, result, TINY_DELTA);
    }

    @Test
    public void testSolve_f_min_max_initial_bracketWithMax_returnsRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        LinearFunction f = new LinearFunction(5.0);
        double result = solver.solve(f, 0.0, 10.0, 1.0);
        assertEquals(5.0, result, DELTA);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_f_min_max_initial_fullBrent_noRootInRange_throwsMaxIterationsExceeded()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        NoRootInRangeFunction f = new NoRootInRangeFunction();
        solver.solve(f, -1.0, 1.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_f_min_max_initial_initialOutOfRange_throwsIllegalArgumentException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        LinearFunction f = new LinearFunction(2.0);
        solver.solve(f, 0.0, 5.0, 10.0);
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testSolve_f_min_max_initial_functionThrows_propagatesException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        ThrowingFunction f = new ThrowingFunction();
        solver.solve(f, 0.0, 5.0, 2.0);
    }

    // ---------------------------------------------------------------
    // Deprecated solve(min, max) and solve(min, max, initial)
    // ---------------------------------------------------------------

    @Test
    public void testDeprecatedSolve_minMax_usesStoredFunction_returnsRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        BrentSolver s = new BrentSolver(new LinearFunction(2.0));
        double result = s.solve(0.0, 5.0);
        assertEquals(2.0, result, DELTA);
    }

    @Test
    public void testDeprecatedSolve_minMaxInitial_usesStoredFunction_returnsRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        BrentSolver s = new BrentSolver(new LinearFunction(2.0));
        double result = s.solve(0.0, 5.0, 3.0);
        assertEquals(2.0, result, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeprecatedSolve_minMax_nonBracketing_throwsIllegalArgumentException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        BrentSolver s = new BrentSolver(new AlwaysPositiveFunction());
        s.solve(-2.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeprecatedSolve_minMaxInitial_initialOutOfRange_throwsIllegalArgumentException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        BrentSolver s = new BrentSolver(new LinearFunction(2.0));
        s.solve(0.0, 5.0, 10.0);
    }
}
