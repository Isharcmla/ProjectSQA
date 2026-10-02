package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class BracketingNthOrderBrentSolverTest {

    @Test
    public void testConstructor_default_success() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        Assert.assertEquals(5, solver.getMaximalOrder());
        Assert.assertEquals(1e-6, solver.getAbsoluteAccuracy(), 1e-12);
        Assert.assertEquals(1e-14, solver.getRelativeAccuracy(), 1e-16);
        Assert.assertEquals(1e-15, solver.getFunctionValueAccuracy(), 1e-17);
    }

    @Test
    public void testConstructor_twoArgs_success() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 3);
        Assert.assertEquals(3, solver.getMaximalOrder());
        Assert.assertEquals(1e-8, solver.getAbsoluteAccuracy(), 1e-12);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_twoArgs_tooSmallOrder_throwsException() {
        new BracketingNthOrderBrentSolver(1e-6, 1);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_twoArgs_negativeOrder_throwsException() {
        new BracketingNthOrderBrentSolver(1e-6, -5);
    }

    @Test
    public void testConstructor_threeArgs_success() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-10, 1e-8, 4);
        Assert.assertEquals(4, solver.getMaximalOrder());
        Assert.assertEquals(1e-10, solver.getRelativeAccuracy(), 1e-14);
        Assert.assertEquals(1e-8, solver.getAbsoluteAccuracy(), 1e-12);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_threeArgs_tooSmallOrder_throwsException() {
        new BracketingNthOrderBrentSolver(1e-10, 1e-8, 1);
    }

    @Test
    public void testConstructor_fourArgs_success() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-10, 1e-8, 1e-6, 6);
        Assert.assertEquals(6, solver.getMaximalOrder());
        Assert.assertEquals(1e-10, solver.getRelativeAccuracy(), 1e-14);
        Assert.assertEquals(1e-8, solver.getAbsoluteAccuracy(), 1e-12);
        Assert.assertEquals(1e-6, solver.getFunctionValueAccuracy(), 1e-10);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_fourArgs_tooSmallOrder_throwsException() {
        new BracketingNthOrderBrentSolver(1e-10, 1e-8, 1e-6, 0);
    }

    @Test
    public void testGetMaximalOrder_returnsConfiguredValue() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-5, 8);
        Assert.assertEquals(8, solver.getMaximalOrder());
    }

    @Test
    public void testSolve_exactRootAtStartValue_returnsStartValue() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-6, 3);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        double root = solver.solve(100, f, 0.0, 5.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-12);
        Assert.assertEquals(1, solver.getEvaluations());
    }

    @Test
    public void testSolve_exactRootAtMin_returnsMin() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-6, 3);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        double root = solver.solve(100, f, 1.0, 5.0, 3.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(1.0, root, 1e-12);
        Assert.assertEquals(2, solver.getEvaluations());
    }

    @Test
    public void testSolve_exactRootAtMax_returnsMax() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-6, 3);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x - 5.0;
            }
        };
        double root = solver.solve(100, f, 1.0, 5.0, 3.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(5.0, root, 1e-12);
        Assert.assertEquals(3, solver.getEvaluations());
    }

    @Test(expected = NoBracketingException.class)
    public void testSolve_noRootInInterval_throwsNoBracketingException() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-6, 3);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x + 1.0;
            }
        };
        solver.solve(100, f, 1.0, 5.0, 3.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testSolve_invalidSequenceMinGreaterThanMax_throwsException() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x;
            }
        };
        solver.solve(100, f, 5.0, 1.0, 3.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_exceedMaxEvaluations_throwsTooManyEvaluationsException() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-15, 1e-15, 5);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return FastMath.sin(x);
            }
        };
        solver.solve(2, f, 3.0, 4.0, AllowedSolution.ANY_SIDE);
    }

    @Test
    public void testSolve_rootBetweenMinAndStartValue_solvedCorrectly() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x - 2.0; // root at sqrt(2) ~ 1.41421356
            }
        };
        double root = solver.solve(100, f, 1.0, 3.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(FastMath.sqrt(2.0), root, 1e-7);
    }

    @Test
    public void testSolve_rootBetweenStartValueAndMax_solvedCorrectly() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x - 5.0; // root at sqrt(5) ~ 2.236
            }
        };
        double root = solver.solve(100, f, 1.0, 3.0, 1.5, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(FastMath.sqrt(5.0), root, 1e-7);
    }

    @Test
    public void testSolve_withoutExplicitStartValue_fourArgsOverload() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return FastMath.cos(x) - x;
            }
        };
        double root = solver.solve(100, f, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(0.7390851332, root, 1e-7);
    }

    @Test
    public void testSolve_allowedSolutionsOptions() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-4, 1e-4, 1e-15, 3);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return FastMath.sin(x);
            }
        };

        double min = 3.0;
        double max = 4.0;
        double exactRoot = FastMath.PI;

        double rootAny = solver.solve(100, f, min, max, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(exactRoot, rootAny, 1e-4);

        double rootLeft = solver.solve(100, f, min, max, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue(rootLeft <= exactRoot);

        double rootRight = solver.solve(100, f, min, max, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue(rootRight >= exactRoot);

        // For sin(x) between 3 and 4: sin is positive below PI and negative above PI
        // Below side: f(x) <= 0 => right side (above PI)
        double rootBelow = solver.solve(100, f, min, max, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(f.value(rootBelow) <= 0.0);

        // Above side: f(x) >= 0 => left side (below PI)
        double rootAbove = solver.solve(100, f, min, max, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(f.value(rootAbove) >= 0.0);

        // Decreasing function: f(x) = -x
        UnivariateFunction fDec = new UnivariateFunction() {
            public double value(double x) {
                return -x;
            }
        };
        double rootBelowDec = solver.solve(100, fDec, -1.0, 1.0, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(fDec.value(rootBelowDec) <= 0.0);

        double rootAboveDec = solver.solve(100, fDec, -1.0, 1.0, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(fDec.value(rootAboveDec) >= 0.0);
    }

    @Test
    public void testSolve_exactRootFoundDuringIteration() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-12, 5);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 1.5) * (x - 1.5) * (x - 1.5);
            }
        };
        double root = solver.solve(100, f, 1.0, 2.0, AllowedSolution.LEFT_SIDE);
        Assert.assertEquals(1.5, root, 1e-10);
    }

    @Test
    public void testSolve_polynomialFunctionAgingAndArrayDrop() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-12, 1e-12, 1e-15, 3);
        // f(x) = x^9 - 0.5
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return FastMath.pow(x, 9) - 0.5;
            }
        };
        double expected = FastMath.pow(0.5, 1.0 / 9.0);
        double root = solver.solve(200, f, 0.0, 1.0, 0.9, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(expected, root, 1e-10);
    }

    @Test
    public void testSolve_highOrderAndStepReduction() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-14, 1e-14, 1e-15, 10);
        UnivariateFunction f = new PolynomialFunction(new double[] { -1.0, 0.0, 0.0, 0.0, 0.0, 1.0 }); // x^5 - 1 = 0
        double root = solver.solve(100, f, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(1.0, root, 1e-12);
    }

    @Test
    public void testSolve_convergenceOnFunctionValueAccuracy() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-1, 1e-1, 1e-3, 5);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return 0.0001 * (x - 2.0);
            }
        };
        double root = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        Assert.assertTrue(FastMath.abs(f.value(root)) < 1e-3);
    }

    @Test(expected = NullArgumentException.class)
    public void testSolve_nullFunction_throwsNullArgumentException() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        solver.solve(100, null, 0.0, 1.0, AllowedSolution.ANY_SIDE);
    }
}
