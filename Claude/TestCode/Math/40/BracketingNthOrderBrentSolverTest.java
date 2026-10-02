package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.junit.Assert;
import org.junit.Test;

public class BracketingNthOrderBrentSolverTest {

    private static final double EPS = 1e-6;

    // ---------- Helper functions ----------

    private UnivariateFunction linearRootAtOne() {
        return new UnivariateFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
    }

    private UnivariateFunction linearRootAtZero() {
        return new UnivariateFunction() {
            public double value(double x) {
                return x;
            }
        };
    }

    private UnivariateFunction linearRootAtTwo() {
        return new UnivariateFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
    }

    private UnivariateFunction alwaysPositive() {
        return new UnivariateFunction() {
            public double value(double x) {
                return x * x + 1.0;
            }
        };
    }

    private UnivariateFunction cubicRoot() {
        return new UnivariateFunction() {
            public double value(double x) {
                return x * x * x - 2.0;
            }
        };
    }

    private UnivariateFunction sineFunction() {
        return new UnivariateFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_createsWithDefaultMaximalOrder() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        Assert.assertEquals(5, solver.getMaximalOrder());
    }

    @Test
    public void testConstructorAbsoluteAccuracyAndOrder_validOrder_createsSolver() {
        BracketingNthOrderBrentSolver solver =
            new BracketingNthOrderBrentSolver(1e-6, 3);
        Assert.assertEquals(3, solver.getMaximalOrder());
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorAbsoluteAccuracyAndOrder_invalidOrder_throwsException() {
        new BracketingNthOrderBrentSolver(1e-6, 1);
    }

    @Test
    public void testConstructorRelativeAbsoluteAccuracyAndOrder_validOrder_createsSolver() {
        BracketingNthOrderBrentSolver solver =
            new BracketingNthOrderBrentSolver(1e-9, 1e-6, 4);
        Assert.assertEquals(4, solver.getMaximalOrder());
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelativeAbsoluteAccuracyAndOrder_invalidOrder_throwsException() {
        new BracketingNthOrderBrentSolver(1e-9, 1e-6, 0);
    }

    @Test
    public void testConstructorFullAccuracyAndOrder_validOrder_createsSolver() {
        BracketingNthOrderBrentSolver solver =
            new BracketingNthOrderBrentSolver(1e-9, 1e-6, 1e-10, 2);
        Assert.assertEquals(2, solver.getMaximalOrder());
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorFullAccuracyAndOrder_invalidOrder_throwsException() {
        new BracketingNthOrderBrentSolver(1e-9, 1e-6, 1e-10, -5);
    }

    @Test
    public void testGetMaximalOrder_returnsConstructedValue() {
        BracketingNthOrderBrentSolver solver =
            new BracketingNthOrderBrentSolver(1e-6, 7);
        Assert.assertEquals(7, solver.getMaximalOrder());
    }

    // ---------- solve(maxEval, f, min, max, allowedSolution) ----------

    @Test
    public void testSolve_linearFunction_signChangeAtEndpoints_findsRoot() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, linearRootAtOne(), 0.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(1.0, root, EPS);
    }

    @Test
    public void testSolve_signChangeBetweenMinAndStart_findsRoot() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        // min=0 (f=-1), startValue=2 (f=1) => sign change before endpoint evaluation
        double root = solver.solve(1000, linearRootAtOne(), 0.0, 3.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(1.0, root, EPS);
    }

    @Test
    public void testSolve_startValueIsExactRoot_returnsStartValueImmediately() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, linearRootAtOne(), 0.0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(1.0, root, 0.0);
    }

    @Test
    public void testSolve_minIsExactRoot_returnsMinImmediately() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, linearRootAtZero(), 0.0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(0.0, root, 0.0);
    }

    @Test
    public void testSolve_maxIsExactRoot_returnsMaxImmediately() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, linearRootAtTwo(), 0.0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 0.0);
    }

    @Test(expected = NoBracketingException.class)
    public void testSolve_noSignChangeAnywhere_throwsNoBracketingException() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        solver.solve(1000, alwaysPositive(), -2.0, 2.0, 0.0, AllowedSolution.ANY_SIDE);
    }

    @Test
    public void testSolve_allowedSolutionLeftSide_returnsLeftBracket() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, linearRootAtOne(), 0.0, 2.0, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue(root <= 1.0 + EPS);
    }

    @Test
    public void testSolve_allowedSolutionRightSide_returnsRightBracket() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, linearRootAtOne(), 0.0, 2.0, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue(root >= 1.0 - EPS);
    }

    @Test
    public void testSolve_allowedSolutionBelowSide_returnsNonPositiveSide() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, linearRootAtOne(), 0.0, 2.0, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(linearRootAtOne().value(root) <= EPS);
    }

    @Test
    public void testSolve_allowedSolutionAboveSide_returnsNonNegativeSide() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, linearRootAtOne(), 0.0, 2.0, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(linearRootAtOne().value(root) >= -EPS);
    }

    @Test
    public void testSolve_cubicFunction_higherOrderInterpolation_findsRoot() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, cubicRoot(), 0.0, 2.0, AllowedSolution.ANY_SIDE);
        double expected = Math.cbrt(2.0);
        Assert.assertEquals(expected, root, 1e-5);
    }

    @Test
    public void testSolve_sineFunction_withStartValue_findsRoot() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, sineFunction(), -1.0, 4.0, 0.5, AllowedSolution.ANY_SIDE);
        // root could be at 0 or PI
        boolean nearZero = Math.abs(root) < 1e-3;
        boolean nearPi = Math.abs(root - Math.PI) < 1e-3;
        Assert.assertTrue(nearZero || nearPi);
    }

    @Test
    public void testSolve_minimalMaximalOrder_findsRoot() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-9, 2);
        double root = solver.solve(1000, linearRootAtOne(), 0.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(1.0, root, EPS);
    }

    @Test
    public void testSolve_functionValueAccuracyTriggersConvergence() {
        BracketingNthOrderBrentSolver solver =
            new BracketingNthOrderBrentSolver(1e-14, 1e-14, 0.5, 2);
        double root = solver.solve(1000, linearRootAtOne(), 0.0, 3.0, 1.5, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(1.0, root, 0.6);
    }

    @Test
    public void testSolve_highOrderPolynomialManyIterations_findsRoot() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return Math.pow(x, 5) - 3 * x - 1;
            }
        };
        double root = solver.solve(2000, f, 1.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertTrue(f.value(root - 1e-3) * f.value(root + 1e-3) <= 0 ||
                           Math.abs(f.value(root)) < 1e-3);
    }

    @Test
    public void testSolve_negativeInterval_findsRoot() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x + 5.0;
            }
        };
        double root = solver.solve(1000, f, -10.0, 0.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(-5.0, root, EPS);
    }
}
