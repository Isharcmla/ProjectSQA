package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class BaseSecantSolverTest {

    private static class ConcreteSecantSolver extends BaseSecantSolver {
        public ConcreteSecantSolver(final double absoluteAccuracy, final Method method) {
            super(absoluteAccuracy, method);
        }

        public ConcreteSecantSolver(final double relativeAccuracy, final double absoluteAccuracy, final Method method) {
            super(relativeAccuracy, absoluteAccuracy, method);
        }

        public ConcreteSecantSolver(final double relativeAccuracy, final double absoluteAccuracy,
                                    final double functionValueAccuracy, final Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }
    }

    @Test
    public void testConstructors_validParameters_constructedSuccessfully() {
        ConcreteSecantSolver solver1 = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        Assert.assertEquals(1e-6, solver1.getAbsoluteAccuracy(), 1e-15);

        ConcreteSecantSolver solver2 = new ConcreteSecantSolver(1e-14, 1e-6, BaseSecantSolver.Method.PEGASUS);
        Assert.assertEquals(1e-14, solver2.getRelativeAccuracy(), 1e-15);
        Assert.assertEquals(1e-6, solver2.getAbsoluteAccuracy(), 1e-15);

        ConcreteSecantSolver solver3 = new ConcreteSecantSolver(1e-14, 1e-6, 1e-15, BaseSecantSolver.Method.REGULA_FALSI);
        Assert.assertEquals(1e-14, solver3.getRelativeAccuracy(), 1e-15);
        Assert.assertEquals(1e-6, solver3.getAbsoluteAccuracy(), 1e-15);
        Assert.assertEquals(1e-15, solver3.getFunctionValueAccuracy(), 1e-15);
    }

    @Test
    public void testSolve_exactRootAtMinBound_returnsMinBound() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        double root = solver.solve(100, f, 2.0, 5.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    @Test
    public void testSolve_exactRootAtMaxBound_returnsMaxBound() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 5.0;
            }
        };
        double root = solver.solve(100, f, 2.0, 5.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(5.0, root, 1e-15);
    }

    @Test
    public void testSolve_exactRootInIteration_returnsExactRoot() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2.0 * x - 4.0;
            }
        };
        double root = solver.solve(100, f, 1.0, 3.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    @Test
    public void testSolve_illinoisMethod_findsRoot() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-10, 1e-8, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        double root = solver.solve(100, f, 3.0, 4.0);
        Assert.assertEquals(FastMath.PI, root, 1e-8);
    }

    @Test
    public void testSolve_pegasusMethod_findsRoot() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-10, 1e-8, BaseSecantSolver.Method.PEGASUS);
        UnivariateRealFunction f = new SinFunction();
        double root = solver.solve(100, f, 3.0, 4.0, 3.5);
        Assert.assertEquals(FastMath.PI, root, 1e-8);
    }

    @Test
    public void testSolve_regulaFalsiMethod_findsRoot() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-10, 1e-8, BaseSecantSolver.Method.REGULA_FALSI);
        UnivariateRealFunction f = new SinFunction();
        double root = solver.solve(100, f, 3.0, 4.0, 3.5, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(FastMath.PI, root, 1e-8);
    }

    @Test
    public void testSolve_allowedSolutionLeftSide_illinois() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-7, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        double root = solver.solve(100, f, 3.0, 4.0, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue(root <= FastMath.PI);
        Assert.assertEquals(FastMath.PI, root, 1e-7);
    }

    @Test
    public void testSolve_allowedSolutionRightSide_illinois() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-7, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        double root = solver.solve(100, f, 3.0, 4.0, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue(root >= FastMath.PI);
        Assert.assertEquals(FastMath.PI, root, 1e-7);
    }

    @Test
    public void testSolve_allowedSolutionBelowSide_illinois() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-7, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        double root = solver.solve(100, f, 3.0, 4.0, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(f.value(root) <= 0.0);
        Assert.assertEquals(FastMath.PI, root, 1e-7);
    }

    @Test
    public void testSolve_allowedSolutionAboveSide_illinois() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-7, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        double root = solver.solve(100, f, 3.0, 4.0, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(f.value(root) >= 0.0);
        Assert.assertEquals(FastMath.PI, root, 1e-7);
    }

    @Test
    public void testSolve_functionValueAccuracyTermination_allAllowedSolutions() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 1.0;
            }
        };

        AllowedSolution[] solutions = new AllowedSolution[] {
            AllowedSolution.ANY_SIDE,
            AllowedSolution.LEFT_SIDE,
            AllowedSolution.RIGHT_SIDE,
            AllowedSolution.BELOW_SIDE,
            AllowedSolution.ABOVE_SIDE
        };

        for (AllowedSolution solution : solutions) {
            ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-14, 1e-1, BaseSecantSolver.Method.PEGASUS);
            double root = solver.solve(100, f, 0.0, 2.0, 0.5, solution);
            Assert.assertEquals(1.0, root, 0.1);
        }
    }

    @Test
    public void testSolve_regulaFalsiStagnation_xEqualsX1Handled() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-15, 1e-15, 1e-15, BaseSecantSolver.Method.REGULA_FALSI);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return FastMath.exp(x) - 1.0;
            }
        };
        double root = solver.solve(100, f, -1.0, 1.0);
        Assert.assertEquals(0.0, root, 1e-6);
    }

    @Test
    public void testSolve_negativeInterval_findsRoot() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x + 5.0;
            }
        };
        double root = solver.solve(100, f, -10.0, -2.0, -6.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(-5.0, root, 1e-6);
    }

    @Test(expected = NoBracketingException.class)
    public void testSolve_noBracketing_throwsException() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0;
            }
        };
        solver.solve(100, f, 1.0, 2.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testSolve_minGreaterThanMax_throwsException() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        solver.solve(100, f, 4.0, 3.0);
    }

    @Test(expected = NullArgumentException.class)
    public void testSolve_nullFunction_throwsException() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        solver.solve(100, null, 1.0, 2.0);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_exceedMaxEvaluations_throwsException() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-15, 1e-15, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        solver.solve(2, f, 3.0, 4.0);
    }

    @Test
    public void testMethodEnum_valuesAndValueOf() {
        for (BaseSecantSolver.Method method : BaseSecantSolver.Method.values()) {
            Assert.assertNotNull(method);
            Assert.assertEquals(method, BaseSecantSolver.Method.valueOf(method.name()));
        }
    }
}
