package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnivariateRealSolverUtilsTest {

    // Simple linear function f(x) = x - 1.5, root at 1.5
    private static class LinearFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return x - 1.5;
        }
    }

    // Function that never crosses zero (always positive)
    private static class AlwaysPositiveFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return x * x + 1.0;
        }
    }

    // Quadratic function f(x) = x^2 - 4, roots at -2 and 2
    private static class QuadraticFunction implements UnivariateRealFunction {
        public double value(double x) throws FunctionEvaluationException {
            return x * x - 4.0;
        }
    }

    // ---------- solve(f, x0, x1) ----------

    @Test
    public void testSolve_normalInput_returnsRoot() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        double result = UnivariateRealSolverUtils.solve(f, 0.0, 3.0);
        assertEquals(1.5, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_nullFunction_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.solve(null, 0.0, 3.0);
    }

    // ---------- solve(f, x0, x1, absoluteAccuracy) ----------

    @Test
    public void testSolveWithAccuracy_normalInput_returnsRoot() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        double result = UnivariateRealSolverUtils.solve(f, 0.0, 3.0, 1e-6);
        assertEquals(1.5, result, 1e-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithAccuracy_nullFunction_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.solve(null, 0.0, 3.0, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithAccuracy_invalidAccuracy_throwsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        // negative accuracy should be invalid for the default solver
        UnivariateRealSolverUtils.solve(f, 0.0, 3.0, -1.0);
    }

    // ---------- bracket(function, initial, lowerBound, upperBound) ----------

    @Test
    public void testBracket_normalInput_returnsBracketingInterval() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        double[] result = UnivariateRealSolverUtils.bracket(f, 1.0, -10.0, 10.0);
        assertEquals(2, result.length);
        assertTrue(result[0] < 1.5);
        assertTrue(result[1] > 1.5);
        double fa = f.value(result[0]);
        double fb = f.value(result[1]);
        assertTrue(fa * fb < 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracket_nullFunction_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.bracket(null, 1.0, -10.0, 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracket_initialOutOfBounds_throwsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        UnivariateRealSolverUtils.bracket(f, 20.0, -10.0, 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracket_lowerBoundGreaterThanUpperBound_throwsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        UnivariateRealSolverUtils.bracket(f, 1.0, 10.0, -10.0);
    }

    @Test(expected = ConvergenceException.class)
    public void testBracket_noRootInInterval_throwsConvergenceException() throws Exception {
        UnivariateRealFunction f = new AlwaysPositiveFunction();
        UnivariateRealSolverUtils.bracket(f, 0.0, -5.0, 5.0);
    }

    // ---------- bracket(function, initial, lowerBound, upperBound, maximumIterations) ----------

    @Test
    public void testBracketWithMaxIterations_normalInput_returnsBracketingInterval() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        double[] result = UnivariateRealSolverUtils.bracket(f, 1.0, -10.0, 10.0, 100);
        assertEquals(2, result.length);
        double fa = f.value(result[0]);
        double fb = f.value(result[1]);
        assertTrue(fa * fb < 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketWithMaxIterations_nullFunction_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.bracket(null, 1.0, -10.0, 10.0, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketWithMaxIterations_zeroMaxIterations_throwsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        UnivariateRealSolverUtils.bracket(f, 1.0, -10.0, 10.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketWithMaxIterations_negativeMaxIterations_throwsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        UnivariateRealSolverUtils.bracket(f, 1.0, -10.0, 10.0, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketWithMaxIterations_initialBelowLowerBound_throwsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        UnivariateRealSolverUtils.bracket(f, -20.0, -10.0, 10.0, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketWithMaxIterations_initialAboveUpperBound_throwsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        UnivariateRealSolverUtils.bracket(f, 20.0, -10.0, 10.0, 100);
    }

    @Test(expected = ConvergenceException.class)
    public void testBracketWithMaxIterations_maxIterationsExceeded_throwsConvergenceException() throws Exception {
        UnivariateRealFunction f = new AlwaysPositiveFunction();
        UnivariateRealSolverUtils.bracket(f, 0.0, -100.0, 100.0, 3);
    }

    @Test
    public void testBracket_multipleRoots_findsNearestBracket() throws Exception {
        UnivariateRealFunction f = new QuadraticFunction();
        double[] result = UnivariateRealSolverUtils.bracket(f, 1.5, -10.0, 10.0, 1000);
        double fa = f.value(result[0]);
        double fb = f.value(result[1]);
        assertTrue(fa * fb <= 0.0);
    }

    @Test
    public void testBracket_initialEqualsLowerBound_bracketsCorrectly() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        double[] result = UnivariateRealSolverUtils.bracket(f, -10.0, -10.0, 10.0, 1000);
        assertEquals(2, result.length);
    }

    @Test
    public void testBracket_initialEqualsUpperBound_bracketsCorrectly() throws Exception {
        UnivariateRealFunction f = new LinearFunction();
        double[] result = UnivariateRealSolverUtils.bracket(f, 10.0, -10.0, 10.0, 1000);
        assertEquals(2, result.length);
    }

    // ---------- midpoint(a, b) ----------

    @Test
    public void testMidpoint_normalInput_returnsCorrectMidpoint() {
        double result = UnivariateRealSolverUtils.midpoint(2.0, 4.0);
        assertEquals(3.0, result, 1e-9);
    }

    @Test
    public void testMidpoint_negativeValues_returnsCorrectMidpoint() {
        double result = UnivariateRealSolverUtils.midpoint(-4.0, -2.0);
        assertEquals(-3.0, result, 1e-9);
    }

    @Test
    public void testMidpoint_zeroValues_returnsZero() {
        double result = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
        assertEquals(0.0, result, 1e-9);
    }

    @Test
    public void testMidpoint_mixedSignValues_returnsCorrectMidpoint() {
        double result = UnivariateRealSolverUtils.midpoint(-5.0, 5.0);
        assertEquals(0.0, result, 1e-9);
    }
}
