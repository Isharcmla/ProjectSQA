package org.apache.commons.math.analysis;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.junit.Assert;
import org.junit.Test;

public class BrentSolverTest {

    @Test
    public void testConstructor() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        Assert.assertNotNull(solver);
        Assert.assertEquals(100, solver.getMaximalIterationCount());
        Assert.assertEquals(1E-6, solver.getAbsoluteAccuracy(), 1E-10);
    }

    @Test
    public void testSolveTwoArgs_validBracket_findsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 2 * x - 5;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(2.0, 3.0);
        Assert.assertEquals(2.0945514815, result, 1E-5);
        Assert.assertEquals(0.0, f.value(result), 1E-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArgs_minGreaterThanMax_throwsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(3.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArgs_sameSignEndpoints_throwsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(1.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveThreeArgs_initialLessThanMin_throwsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(1.0, 5.0, 0.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveThreeArgs_initialGreaterThanMax_throwsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(1.0, 5.0, 5.5);
    }

    @Test
    public void testSolveThreeArgs_initialIsRoot_returnsInitial() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(1.0, 3.0, 2.0);
        Assert.assertEquals(2.0, result, 1E-10);
    }

    @Test
    public void testSolveThreeArgs_minIsRoot_returnsMin() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(1.0, 3.0, 2.5);
        Assert.assertEquals(0.0, result, 1E-10);
    }

    @Test
    public void testSolveThreeArgs_initialAndMinBracket_findsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.5;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(1.0, 5.0, 2.0);
        Assert.assertEquals(1.5, result, 1E-5);
    }

    @Test
    public void testSolveThreeArgs_maxIsRoot_returnsMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                if (Math.abs(x - 5.0) < 1E-9) {
                    return 0.0;
                }
                return 1.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(1.0, 5.0, 2.0);
        Assert.assertEquals(0.0, result, 1E-10);
    }

    @Test
    public void testSolveThreeArgs_initialAndMaxBracket_findsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 4.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(1.0, 5.0, 2.0);
        Assert.assertEquals(4.0, result, 1E-5);
    }

    @Test
    public void testSolveThreeArgs_fullBrentAlgorithm_findsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 0.5) * (x - 0.5) - 0.25;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(-1.0, 2.0, 0.2);
        Assert.assertEquals(0.0, result, 1E-5);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_maxIterationsExceeded_throwsMaxIterationsExceededException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x) - 0.1;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.setMaximalIterationCount(1);
        solver.solve(0.0, 1.0);
    }

    @Test
    public void testSolve_linearAndInverseQuadraticInterpolationBranches() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x) - 0.5;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.setAbsoluteAccuracy(1E-12);
        solver.setRelativeAccuracy(1E-12);
        solver.setFunctionValueAccuracy(1E-12);
        double result = solver.solve(0.0, 1.0);
        Assert.assertEquals(Math.PI / 6.0, result, 1E-6);
    }

    @Test
    public void testSolve_polynomialWithNegativeRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2 * x + 4;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(-5.0, 0.0);
        Assert.assertEquals(-2.0, result, 1E-6);
    }

    @Test
    public void testSolve_rootWithSmallToleranceSteps() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.pow(x - 1.0, 3);
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(-1.0, 3.0, 0.0);
        Assert.assertEquals(1.0, result, 1E-2);
    }

    @Test
    public void testSolve_stepDirectionBranches() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.exp(x) - 3.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(1.0, 2.0);
        Assert.assertEquals(Math.log(3.0), result, 1E-6);
    }
}
