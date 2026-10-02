package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Assert;
import org.junit.Test;

public class BrentSolverTest {

    @Test
    public void testDeprecatedConstructorAndSolveTwoArgs() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double root = solver.solve(0.0, 4.0);
        Assert.assertEquals(2.0, root, 1e-5);
    }

    @Test
    public void testDeprecatedSolveThreeArgs() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2.0 * x - 6.0;
            }
        };
        BrentSolver solver = new BrentSolver(f);
        double root = solver.solve(0.0, 5.0, 2.5);
        Assert.assertEquals(3.0, root, 1e-5);
    }

    @Test
    public void testSolveWithInitial_initialIsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 0.0, 5.0, 2.0);
        Assert.assertEquals(2.0, root, 1e-6);
        Assert.assertEquals(0, solver.getIterationCount());
    }

    @Test
    public void testSolveWithInitial_minIsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 1.0, 5.0, 3.0);
        Assert.assertEquals(0.0, root, 1e-6);
        Assert.assertEquals(0, solver.getIterationCount());
    }

    @Test
    public void testSolveWithInitial_maxIsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 4.0);
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 2.0, 4.0, 3.0);
        Assert.assertEquals(0.0, root, 1e-6);
        Assert.assertEquals(0, solver.getIterationCount());
    }

    @Test
    public void testSolveWithInitial_minAndInitialBracketRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 1.0, 5.0, 3.0);
        Assert.assertEquals(2.0, root, 1e-5);
    }

    @Test
    public void testSolveWithInitial_initialAndMaxBracketRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.5) * (x - 3.5);
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 1.0, 4.0, 2.0);
        Assert.assertEquals(3.5, root, 1e-5);
    }

    @Test
    public void testSolveWithInitial_fullBrentAlgorithm() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, -1.0, 4.0, 0.5);
        Assert.assertEquals(0.0, root, 1e-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitial_invalidSequenceMinGreaterThanInitial() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver();
        solver.solve(f, 3.0, 5.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitial_invalidSequenceInitialGreaterThanMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver();
        solver.solve(f, 1.0, 3.0, 4.0);
    }

    @Test
    public void testSolve_minIsExactZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 0.0, 5.0);
        Assert.assertEquals(0.0, root, 1e-6);
    }

    @Test
    public void testSolve_maxIsExactZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 5.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 0.0, 5.0);
        Assert.assertEquals(5.0, root, 1e-6);
    }

    @Test
    public void testSolve_nonBracketingMinCloseToZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 1e-8 * (x - 1.0) + 1e-7;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 1.0, 2.0);
        Assert.assertEquals(1.0, root, 1e-6);
    }

    @Test
    public void testSolve_nonBracketingMaxCloseToZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x <= 1.0) ? 2.0 : 1e-8;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 0.5, 2.0);
        Assert.assertEquals(2.0, root, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_nonBracketingThrowsException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        solver.solve(f, 1.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_invalidIntervalThrowsException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver();
        solver.solve(f, 5.0, 1.0);
    }

    @Test
    public void testSolve_linearAndInverseQuadraticInterpolation() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.pow(x, 3) - 3.0 * x - 5.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 2.0, 3.0);
        Assert.assertEquals(2.27901878590674, root, 1e-5);
    }

    @Test
    public void testSolve_sinRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 3.0, 4.0);
        Assert.assertEquals(Math.PI, root, 1e-6);
    }

    @Test
    public void testSolve_negativeRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2.0 * x + 4.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, -3.0, -1.0);
        Assert.assertEquals(-2.0, root, 1e-6);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_exceedMaxIterations() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.pow(x - 1.2345678, 5);
            }
        };
        BrentSolver solver = new BrentSolver();
        solver.setMaximalIterationCount(1);
        solver.setAbsoluteAccuracy(1e-15);
        solver.setRelativeAccuracy(1e-15);
        solver.solve(f, 0.0, 2.0);
    }

    @Test
    public void testSolve_bisectionFallback() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 1.0) * (x - 1.0);
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, -1.0, 2.0);
        Assert.assertEquals(1.0, root, 1e-2);
    }

    @Test
    public void testSolve_smallDeltaBranches() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 1e-5 * x;
            }
        };
        BrentSolver solver = new BrentSolver();
        solver.setAbsoluteAccuracy(1e-3);
        solver.setFunctionValueAccuracy(1e-10);
        double root = solver.solve(f, -1.0, 1.0, 0.5);
        Assert.assertEquals(0.0, root, 1e-3);
    }
}
