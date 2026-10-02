package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Assert;
import org.junit.Test;

public class BisectionSolverTest {

    @Test
    public void testDeprecatedConstructor_validFunction_solvesCorrectly() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };

        BisectionSolver solver = new BisectionSolver(f);
        double result = solver.solve(1.0, 3.0);
        Assert.assertEquals(2.0, result, 1E-6);
        Assert.assertEquals(2.0, solver.getResult(), 1E-6);
        Assert.assertTrue(solver.getIterationCount() > 0);
    }

    @Test
    public void testSolve_deprecatedTwoArgs_returnsRoot() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4.0;
            }
        };

        BisectionSolver solver = new BisectionSolver(f);
        double result = solver.solve(0.0, 5.0);
        Assert.assertEquals(2.0, result, 1E-6);
    }

    @Test
    public void testSolve_deprecatedThreeArgs_returnsRoot() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2.0 * x - 6.0;
            }
        };

        BisectionSolver solver = new BisectionSolver(f);
        double result = solver.solve(0.0, 5.0, 2.5);
        Assert.assertEquals(3.0, result, 1E-6);
    }

    @Test
    public void testSolve_fourArgs_withPreconfiguredFunction_returnsRoot() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };

        BisectionSolver solver = new BisectionSolver(f);
        double result = solver.solve(f, 3.0, 4.0, 3.5);
        Assert.assertEquals(Math.PI, result, 1E-6);
    }

    @Test(expected = NullPointerException.class)
    public void testSolve_fourArgs_withDefaultConstructor_throwsNullPointerException() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };

        BisectionSolver solver = new BisectionSolver();
        // Since solve(f, min, max, initial) delegates to solve(min, max),
        // and default constructor leaves internal field 'f' null, it throws NPE.
        solver.solve(f, -1.0, 1.0, 0.0);
    }

    @Test
    public void testSolve_defaultConstructor_sinFunction_returnsRoot() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };

        BisectionSolver solver = new BisectionSolver();
        double result = solver.solve(f, 3.0, 4.0);
        Assert.assertEquals(Math.PI, result, 1E-6);
    }

    @Test
    public void testSolve_bothBranchesOfBisection_converges() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 27.0;
            }
        };

        BisectionSolver solver = new BisectionSolver();
        // Root is 3.0, within interval [0.0, 8.0]
        // This exercises both fm * fmin > 0 and fm * fmin <= 0 branches
        double result = solver.solve(f, 0.0, 8.0);
        Assert.assertEquals(3.0, result, 1E-6);
    }

    @Test
    public void testSolve_negativeInterval_returnsNegativeRoot() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x + 5.0;
            }
        };

        BisectionSolver solver = new BisectionSolver();
        double result = solver.solve(f, -10.0, -2.0);
        Assert.assertEquals(-5.0, result, 1E-6);
    }

    @Test
    public void testSolve_rootAtZero_returnsZero() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };

        BisectionSolver solver = new BisectionSolver();
        double result = solver.solve(f, -1.0, 1.0);
        Assert.assertEquals(0.0, result, 1E-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_minEqualMax_throwsIllegalArgumentException() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };

        BisectionSolver solver = new BisectionSolver();
        solver.solve(f, 2.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_minGreaterThanMax_throwsIllegalArgumentException() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };

        BisectionSolver solver = new BisectionSolver();
        solver.solve(f, 5.0, 2.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_exceedMaximalIterationCount_throwsMaxIterationsExceededException() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 0.5;
            }
        };

        BisectionSolver solver = new BisectionSolver();
        solver.setMaximalIterationCount(1);
        solver.setAbsoluteAccuracy(1E-12);
        solver.solve(f, 0.0, 100.0);
    }

    @Test
    public void testSolve_customAccuracy_returnsAccurateResult() 
            throws MaxIterationsExceededException, FunctionEvaluationException {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.23456789;
            }
        };

        BisectionSolver solver = new BisectionSolver();
        solver.setAbsoluteAccuracy(1E-10);
        solver.setMaximalIterationCount(100);
        double result = solver.solve(f, 1.0, 2.0);
        Assert.assertEquals(1.23456789, result, 1E-9);
    }
}
