package org.apache.commons.math.analysis;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.junit.Test;
import org.junit.Assert;

public class BrentSolverTest {

    // f(x) = x - 2 ; root at 2
    private static final UnivariateRealFunction LINEAR = new UnivariateRealFunction() {
        public double value(double x) throws FunctionEvaluationException {
            return x - 2;
        }
    };

    // f(x) = x^3 - 2x - 5 ; classic Brent's method test function, root ~2.0945514815423265
    private static final UnivariateRealFunction CUBIC = new UnivariateRealFunction() {
        public double value(double x) throws FunctionEvaluationException {
            return x * x * x - 2 * x - 5;
        }
    };

    // f(x) = x^2 - 2 ; roots at +/- sqrt(2)
    private static final UnivariateRealFunction SQRT2 = new UnivariateRealFunction() {
        public double value(double x) throws FunctionEvaluationException {
            return x * x - 2;
        }
    };

    // f(x) = sin(x) ; root at pi
    private static final UnivariateRealFunction SIN = new UnivariateRealFunction() {
        public double value(double x) throws FunctionEvaluationException {
            return Math.sin(x);
        }
    };

    // f(x) = x^2 + 1 ; no real root (always positive)
    private static final UnivariateRealFunction NO_ROOT = new UnivariateRealFunction() {
        public double value(double x) throws FunctionEvaluationException {
            return x * x + 1;
        }
    };

    // f(x) = x^2 - 5x + 4 = (x-1)(x-4) ; roots at 1 and 4
    private static final UnivariateRealFunction TWO_ROOTS = new UnivariateRealFunction() {
        public double value(double x) throws FunctionEvaluationException {
            return x * x - 5 * x + 4;
        }
    };

    // f(x) = x - 1 ; root exactly at 1
    private static final UnivariateRealFunction LINEAR_ROOT_AT_1 = new UnivariateRealFunction() {
        public double value(double x) throws FunctionEvaluationException {
            return x - 1;
        }
    };

    // f(x) = x - 5 ; root exactly at 5
    private static final UnivariateRealFunction LINEAR_ROOT_AT_5 = new UnivariateRealFunction() {
        public double value(double x) throws FunctionEvaluationException {
            return x - 5;
        }
    };

    // ---------------------------------------------------------------
    // Tests for solve(min, max, initial)
    // ---------------------------------------------------------------

    @Test
    public void testSolveWithInitial_InitialIsRoot_ReturnsInitial() throws Exception {
        BrentSolver solver = new BrentSolver(LINEAR);
        double result = solver.solve(0, 5, 2);
        Assert.assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testSolveWithInitial_MinIsRootExact_ReturnsZero() throws Exception {
        // min = 1 is exact root; yInitial (at x=3) is not small; yMin is small -> returns yMin (0.0)
        BrentSolver solver = new BrentSolver(LINEAR_ROOT_AT_1);
        double result = solver.solve(1, 5, 3);
        Assert.assertEquals(0.0, result, 1e-12);
    }

    @Test
    public void testSolveWithInitial_BracketMinInitial_FindsPositiveRoot() throws Exception {
        // min=0,max=3,initial=2 -> yMin=-2, yInitial=2 -> opposite signs, bracket triggered
        BrentSolver solver = new BrentSolver(SQRT2);
        double result = solver.solve(0, 3, 2);
        Assert.assertEquals(Math.sqrt(2), result, 1e-6);
    }

    @Test
    public void testSolveWithInitial_MaxIsRootExact_ReturnsZero() throws Exception {
        // min=0,initial=1,max=5: max is exact root; others are not small or bracketing
        BrentSolver solver = new BrentSolver(LINEAR_ROOT_AT_5);
        double result = solver.solve(0, 5, 1);
        Assert.assertEquals(0.0, result, 1e-12);
    }

    @Test
    public void testSolveWithInitial_BracketInitialMax_FindsNegativeRoot() throws Exception {
        // min=-5,initial=-2,max=0: yMin=23,yInitial=2,yMax=-2 -> yInitial*yMax<0 bracket triggered
        BrentSolver solver = new BrentSolver(SQRT2);
        double result = solver.solve(-5, 0, -2);
        Assert.assertEquals(-Math.sqrt(2), result, 1e-6);
    }

    @Test
    public void testSolveWithInitial_FullBrentFallback_FindsRoot() throws Exception {
        // min=0,max=5,initial=4.5: yMin=4,yMax=4,yInitial=1.75 all same sign -> full fallback branch
        BrentSolver solver = new BrentSolver(TWO_ROOTS);
        double result = solver.solve(0, 5, 4.5);
        boolean nearRoot1 = Math.abs(result - 1.0) < 1e-3;
        boolean nearRoot4 = Math.abs(result - 4.0) < 1e-3;
        Assert.assertTrue("Result should converge near one of the roots (1 or 4), got: " + result,
                nearRoot1 || nearRoot4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitial_InitialOutsideRange_ThrowsIllegalArgumentException() throws Exception {
        BrentSolver solver = new BrentSolver(LINEAR);
        solver.solve(0, 5, 10);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolveWithInitial_MaxIterationsZero_ThrowsMaxIterationsExceededException() throws Exception {
        BrentSolver solver = new BrentSolver(SQRT2);
        solver.setMaximalIterationCount(0);
        solver.solve(0, 3, 2);
    }

    // ---------------------------------------------------------------
    // Tests for solve(min, max)
    // ---------------------------------------------------------------

    @Test
    public void testSolve_NormalCase_FindsRoot() throws Exception {
        BrentSolver solver = new BrentSolver(LINEAR);
        double result = solver.solve(0, 5);
        Assert.assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testSolve_CubicFunction_FindsRoot() throws Exception {
        BrentSolver solver = new BrentSolver(CUBIC);
        double result = solver.solve(2, 3);
        Assert.assertEquals(2.0945514815423265, result, 1e-6);
    }

    @Test
    public void testSolve_SinFunction_FindsRootNearPi() throws Exception {
        BrentSolver solver = new BrentSolver(SIN);
        double result = solver.solve(3, 4);
        Assert.assertEquals(Math.PI, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_SameSignEndpoints_ThrowsIllegalArgumentException() throws Exception {
        BrentSolver solver = new BrentSolver(NO_ROOT);
        solver.solve(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_MinGreaterThanMax_ThrowsIllegalArgumentException() throws Exception {
        BrentSolver solver = new BrentSolver(LINEAR);
        solver.solve(5, 0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_MaxIterationsZero_ThrowsMaxIterationsExceededException() throws Exception {
        BrentSolver solver = new BrentSolver(LINEAR);
        solver.setMaximalIterationCount(0);
        solver.solve(0, 5);
    }

    // ---------------------------------------------------------------
    // Additional edge cases
    // ---------------------------------------------------------------

    @Test
    public void testSolveWithInitial_InitialEqualsMin_NoExceptionThrown() throws Exception {
        // initial == min should not throw since (initial-min)*(max-initial) = 0, not < 0
        BrentSolver solver = new BrentSolver(LINEAR);
        double result = solver.solve(0, 5, 0);
        Assert.assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testSolveWithInitial_InitialEqualsMax_NoExceptionThrown() throws Exception {
        // initial == max should not throw since (initial-min)*(max-initial) = 0, not < 0
        BrentSolver solver = new BrentSolver(LINEAR);
        double result = solver.solve(0, 5, 5);
        Assert.assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testConstructor_CreatesValidSolver() throws Exception {
        BrentSolver solver = new BrentSolver(LINEAR);
        Assert.assertNotNull(solver);
    }
}
