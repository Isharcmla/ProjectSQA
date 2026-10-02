package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link BrentSolver}.
 */
public class BrentSolverTest {

    private static final double DELTA = 1e-6;

    private BrentSolver solver;

    @Before
    public void setUp() {
        solver = new BrentSolver();
    }

    // ---------- helper functions ----------

    /** f(x) = x - root */
    private UnivariateRealFunction linear(final double root) {
        return new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - root;
            }
        };
    }

    /** f(x) = x (identity) */
    private UnivariateRealFunction identity() {
        return new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x;
            }
        };
    }

    /** f(x) = x^2 - 2 (root at sqrt(2)) */
    private UnivariateRealFunction quadraticSqrt2() {
        return new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 2;
            }
        };
    }

    /** f(x) = x^2 + 1 (never crosses zero, always positive) */
    private UnivariateRealFunction alwaysPositive() {
        return new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x + 1;
            }
        };
    }

    // =========================================================
    // Constructors
    // =========================================================

    @Test
    public void testDefaultConstructor_normalUsage_solvesRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        BrentSolver s = new BrentSolver();
        double result = s.solve(identity(), -1, 1);
        assertEquals(0.0, result, DELTA);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedConstructor_normalUsage_solvesRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        BrentSolver s = new BrentSolver(identity());
        double result = s.solve(-1, 1);
        assertEquals(0.0, result, DELTA);
    }

    // =========================================================
    // Deprecated solve(min, max) / solve(min, max, initial)
    // =========================================================

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedSolveMinMax_typicalInput_returnsRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        BrentSolver s = new BrentSolver(linear(1.0));
        double result = s.solve(-5, 5);
        assertEquals(1.0, result, DELTA);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedSolveMinMaxInitial_typicalInput_returnsRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        BrentSolver s = new BrentSolver(linear(2.0));
        double result = s.solve(-5, 5, 0);
        assertEquals(2.0, result, DELTA);
    }

    // =========================================================
    // solve(f, min, max, initial) - branch coverage
    // =========================================================

    /** (A) initial itself is close enough to zero */
    @Test
    public void testSolveWithInitial_initialCloseToZero_returnsInitial()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(identity(), -1, 2, 0.0);
        assertEquals(0.0, result, DELTA);
    }

    /** (B) yMin close enough to zero (initial not close) */
    @Test
    public void testSolveWithInitial_yMinCloseToZero_returnsNearZero()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(identity(), 0.0, 2.0, 1.0);
        assertEquals(0.0, result, DELTA);
    }

    /** (C) yInitial * yMin < 0 -> bracket reduced using min & initial */
    @Test
    public void testSolveWithInitial_bracketedByMinAndInitial_returnsRootNearZero()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(identity(), -2.0, 3.0, 1.0);
        assertEquals(0.0, result, DELTA);
    }

    /** (D) yMax close enough to zero (initial and min not close, same sign) */
    @Test
    public void testSolveWithInitial_yMaxCloseToZero_returnsNearZero()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(identity(), -5.0, 0.0, -3.0);
        assertEquals(0.0, result, DELTA);
    }

    /** (E) yInitial * yMax < 0 -> bracket reduced using initial & max */
    @Test
    public void testSolveWithInitial_bracketedByInitialAndMax_returnsRootNearFive()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(linear(5.0), 0.0, 10.0, 1.0);
        assertEquals(5.0, result, DELTA);
    }

    /** (F) yMin * yMax > 0 (non-bracketing) -> IllegalArgumentException */
    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitial_nonBracketing_throwsIllegalArgumentException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        solver.solve(alwaysPositive(), -2.0, 2.0, 0.0);
    }

    /** Edge case: initial not between min and max -> IllegalArgumentException */
    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitial_initialOutOfRange_throwsIllegalArgumentException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        solver.solve(identity(), -1.0, 1.0, 5.0);
    }

    // =========================================================
    // solve(f, min, max) - branch coverage
    // =========================================================

    /** sign < 0: normal bracketing case, full Brent algorithm used */
    @Test
    public void testSolveMinMax_normalBracketing_returnsRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(identity(), -1.0, 1.0);
        assertEquals(0.0, result, DELTA);
    }

    /** sign < 0: nonlinear function requiring iterative refinement */
    @Test
    public void testSolveMinMax_nonlinearFunction_returnsSqrt2()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(quadraticSqrt2(), 0.0, 2.0);
        assertEquals(Math.sqrt(2.0), result, 1e-5);
    }

    /** sign > 0 with yMin close to zero -> returns min */
    @Test
    public void testSolveMinMax_signPositiveYMinSmall_returnsMin()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double min = 1e-7;
        double max = 2.0;
        double result = solver.solve(identity(), min, max);
        assertEquals(min, result, DELTA);
    }

    /** sign > 0 with yMax close to zero -> returns max */
    @Test
    public void testSolveMinMax_signPositiveYMaxSmall_returnsMax()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double min = -1.0;
        double max = -5e-7;
        double result = solver.solve(identity(), min, max);
        assertEquals(max, result, DELTA);
    }

    /** sign > 0 with neither close to zero -> IllegalArgumentException */
    @Test(expected = IllegalArgumentException.class)
    public void testSolveMinMax_signPositiveNoRoot_throwsIllegalArgumentException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        solver.solve(alwaysPositive(), -2.0, 2.0);
    }

    /** sign == 0 with yMin == 0 -> returns min */
    @Test
    public void testSolveMinMax_signZeroYMinIsZero_returnsMin()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(identity(), 0.0, 1.0);
        assertEquals(0.0, result, DELTA);
    }

    /** sign == 0 with yMax == 0 (yMin != 0) -> returns max */
    @Test
    public void testSolveMinMax_signZeroYMaxIsZero_returnsMax()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(linear(1.0), -1.0, 1.0);
        assertEquals(1.0, result, DELTA);
    }

    /** Edge case: min >= max -> IllegalArgumentException from verifyInterval */
    @Test(expected = IllegalArgumentException.class)
    public void testSolveMinMax_minGreaterThanMax_throwsIllegalArgumentException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        solver.solve(identity(), 1.0, -1.0);
    }

    // =========================================================
    // MaxIterationsExceededException
    // =========================================================

    /**
     * Forcing maximalIterationCount to 0 makes the internal iterative loop
     * never execute, thereby immediately throwing MaxIterationsExceededException.
     * (Assumes setMaximalIterationCount(int) is inherited from
     * UnivariateRealSolverImpl, as it is a standard part of that API.)
     */
    @Test(expected = MaxIterationsExceededException.class)
    public void testSolveMinMax_zeroMaxIterations_throwsMaxIterationsExceededException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        solver.setMaximalIterationCount(0);
        solver.solve(identity(), -1.0, 1.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolveWithInitial_zeroMaxIterations_throwsMaxIterationsExceededException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        solver.setMaximalIterationCount(0);
        solver.solve(identity(), -2.0, 3.0, 1.0);
    }

    // =========================================================
    // Additional sanity / result accuracy checks
    // =========================================================

    @Test
    public void testSolveMinMax_cubicFunction_returnsRootWithinTolerance()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction cubic = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x * x - x - 2;
            }
        };
        double result = solver.solve(cubic, 1.0, 2.0);
        double expected = 1.5213797068; // known real root
        assertEquals(expected, result, 1e-5);
        assertTrue(Math.abs(cubic.value(result)) < 1e-4);
    }

    @Test
    public void testSolve_resultIsConsistentAcrossCalls()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        double r1 = solver.solve(linear(3.0), 0.0, 10.0);
        double r2 = solver.solve(linear(3.0), 0.0, 10.0, 1.0);
        assertEquals(r1, r2, 1e-5);
    }

    @Test
    public void testSolveWithInitial_fullBrentAlgorithmPath_returnsRoot()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        // Exercises the full Brent algorithm branch with a nonlinear function
        double result = solver.solve(quadraticSqrt2(), 0.0, 2.0, 0.1);
        assertEquals(Math.sqrt(2.0), result, 1e-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitial_initialBelowMin_throwsIllegalArgumentException()
            throws MaxIterationsExceededException, FunctionEvaluationException {
        solver.solve(identity(), 0.0, 5.0, -1.0);
    }
}
