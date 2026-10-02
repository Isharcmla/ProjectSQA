package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Assert;
import org.junit.Test;

public class BrentSolverTest {

    @Test
    public void testDefaultConstructorAndSolveSinFunction() throws Exception {
        UnivariateRealFunction f = new SinFunction();
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 3.0, 4.0);
        Assert.assertEquals(Math.PI, root, 1e-6);
    }

    @Test
    public void testDeprecatedConstructorAndSolve() throws Exception {
        UnivariateRealFunction f = new SinFunction();
        BrentSolver solver = new BrentSolver(f);
        double root = solver.solve(3.0, 4.0);
        Assert.assertEquals(Math.PI, root, 1e-6);

        double rootWithInitial = solver.solve(3.0, 4.0, 3.14);
        Assert.assertEquals(Math.PI, rootWithInitial, 1e-6);
    }

    @Test
    public void testSolve_exactEndpoints() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * (x - 2.0);
            }
        };
        BrentSolver solver = new BrentSolver();

        // yMin == 0.0
        double rootMin = solver.solve(f, 0.0, 3.0);
        Assert.assertEquals(0.0, rootMin, 1e-6);

        // yMax == 0.0
        double rootMax = solver.solve(f, -1.0, 0.0);
        Assert.assertEquals(0.0, rootMax, 1e-6);
    }

    @Test
    public void testSolve_approximateEndpointsWithinAccuracy() throws Exception {
        UnivariateRealFunction fMinClose = new UnivariateRealFunction() {
            public double value(double x) {
                return (x == 1.0) ? 1e-10 : 2.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root1 = solver.solve(fMinClose, 1.0, 2.0);
        Assert.assertEquals(1.0, root1, 1e-6);

        UnivariateRealFunction fMaxClose = new UnivariateRealFunction() {
            public double value(double x) {
                return (x == 2.0) ? 1e-10 : 2.0;
            }
        };
        double root2 = solver.solve(fMaxClose, 1.0, 2.0);
        Assert.assertEquals(2.0, root2, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_nonBracketingThrowsException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        solver.solve(f, 1.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_invalidIntervalThrowsException() throws Exception {
        UnivariateRealFunction f = new SinFunction();
        BrentSolver solver = new BrentSolver();
        solver.solve(f, 4.0, 3.0);
    }

    @Test
    public void testSolveWithInitial_goodInitialGuess() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 1.0, 3.0, 2.0);
        Assert.assertEquals(2.0, root, 1e-6);
    }

    @Test
    public void testSolveWithInitial_goodMinGuess() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x == 1.0) ? 1e-10 : (x - 2.0);
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 1.0, 3.0, 2.5);
        Assert.assertEquals(1e-10, root, 1e-6);
    }

    @Test
    public void testSolveWithInitial_goodMaxGuess() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x == 3.0) ? 1e-10 : 1.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 1.0, 3.0, 2.0);
        Assert.assertEquals(1e-10, root, 1e-6);
    }

    @Test
    public void testSolveWithInitial_minAndInitialBracketRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.5;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 1.0, 3.0, 2.0);
        Assert.assertEquals(1.5, root, 1e-6);
    }

    @Test
    public void testSolveWithInitial_initialAndMaxBracketRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x == 1.0) ? 5.0 : (x - 2.5);
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 1.0, 3.0, 2.0);
        Assert.assertEquals(2.5, root, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitial_allSameSignThrowsException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        solver.solve(f, 1.0, 3.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitial_invalidSequenceThrowsException() throws Exception {
        UnivariateRealFunction f = new SinFunction();
        BrentSolver solver = new BrentSolver();
        solver.solve(f, 3.0, 2.0, 1.0);
    }

    @Test
    public void testSolve_inverseQuadraticAndLinearInterpolation() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.pow(x, 3) - 2 * x - 5;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, 2.0, 3.0);
        Assert.assertEquals(2.09455148154233, root, 1e-6);
    }

    @Test
    public void testSolve_negativeRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x + 5.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(f, -10.0, 0.0);
        Assert.assertEquals(-5.0, root, 1e-6);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_maxIterationsExceeded() throws Exception {
        UnivariateRealFunction f = new SinFunction();
        BrentSolver solver = new BrentSolver();
        solver.setMaximalIterationCount(1);
        solver.setAbsoluteAccuracy(1e-15);
        solver.setRelativeAccuracy(1e-15);
        solver.setFunctionValueAccuracy(1e-15);
        solver.solve(f, 3.0, 4.0);
    }
}
