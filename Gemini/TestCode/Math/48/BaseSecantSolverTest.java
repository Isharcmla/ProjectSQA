package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.TooManyEvaluationsException;
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

    private final UnivariateRealFunction quintic = new UnivariateRealFunction() {
        public double value(double x) {
            return (x - 1) * (x - 2) * (x - 3) * (x + 1) * (x + 2);
        }
    };

    private final UnivariateRealFunction linear = new UnivariateRealFunction() {
        public double value(double x) {
            return 2.0 * x - 4.0;
        }
    };

    private final UnivariateRealFunction decreasingLinear = new UnivariateRealFunction() {
        public double value(double x) {
            return -2.0 * x + 4.0;
        }
    };

    private final UnivariateRealFunction cubic = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x * x - x - 2.0; // root at ~1.5213797068045676
        }
    };

    @Test
    public void testConstructors_allSignatures_validInstancesCreated() {
        ConcreteSecantSolver solver1 = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        Assert.assertEquals(1e-6, solver1.getAbsoluteAccuracy(), 1e-12);
        Assert.assertEquals(1e-14, solver1.getRelativeAccuracy(), 1e-12);

        ConcreteSecantSolver solver2 = new ConcreteSecantSolver(1e-10, 1e-6, BaseSecantSolver.Method.PEGASUS);
        Assert.assertEquals(1e-10, solver2.getRelativeAccuracy(), 1e-12);
        Assert.assertEquals(1e-6, solver2.getAbsoluteAccuracy(), 1e-12);

        ConcreteSecantSolver solver3 = new ConcreteSecantSolver(1e-10, 1e-6, 1e-5, BaseSecantSolver.Method.REGULA_FALSI);
        Assert.assertEquals(1e-10, solver3.getRelativeAccuracy(), 1e-12);
        Assert.assertEquals(1e-6, solver3.getAbsoluteAccuracy(), 1e-12);
        Assert.assertEquals(1e-5, solver3.getFunctionValueAccuracy(), 1e-12);
    }

    @Test
    public void testSolve_f0IsZero_returnsMin() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(100, linear, 2.0, 5.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, result, 1e-12);
    }

    @Test
    public void testSolve_f1IsZero_returnsMax() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.PEGASUS);
        double result = solver.solve(100, linear, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, result, 1e-12);
    }

    @Test
    public void testSolve_exactRootOnFirstStep_returnsRoot() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(100, linear, 0.0, 4.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, result, 1e-12);
    }

    @Test(expected = NoBracketingException.class)
    public void testSolve_noBracketing_throwsException() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        solver.solve(100, linear, 3.0, 5.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_exceedMaxEvaluations_throwsException() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-15, BaseSecantSolver.Method.REGULA_FALSI);
        solver.solve(2, cubic, 1.0, 2.0, AllowedSolution.ANY_SIDE);
    }

    @Test
    public void testSolve_allMethods_convergeToRoot() {
        BaseSecantSolver.Method[] methods = new BaseSecantSolver.Method[]{
            BaseSecantSolver.Method.REGULA_FALSI,
            BaseSecantSolver.Method.ILLINOIS,
            BaseSecantSolver.Method.PEGASUS
        };

        for (BaseSecantSolver.Method method : methods) {
            ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, method);
            double root = solver.solve(100, cubic, 1.0, 2.0);
            Assert.assertEquals(1.5213797, root, 1e-5);
        }
    }

    @Test
    public void testSolve_threeArgSolveVariants() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double root1 = solver.solve(100, cubic, 1.0, 2.0, 1.5);
        Assert.assertEquals(1.5213797, root1, 1e-5);

        double root2 = solver.solve(100, cubic, 1.0, 2.0, 1.5, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(1.5213797, root2, 1e-5);

        double root3 = solver.solve(100, cubic, 1.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(1.5213797, root3, 1e-5);
    }

    @Test
    public void testSolve_allowedSolutions_intervalAccuracy_increasingFunction() {
        AllowedSolution[] allowed = AllowedSolution.values();
        for (AllowedSolution solutionType : allowed) {
            ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-7, 1e-15, BaseSecantSolver.Method.ILLINOIS);
            double root = solver.solve(100, cubic, 1.0, 2.0, solutionType);
            double val = cubic.value(root);

            switch (solutionType) {
                case ANY_SIDE:
                    Assert.assertEquals(0.0, val, 1e-4);
                    break;
                case LEFT_SIDE:
                    Assert.assertTrue(root <= 1.5213797068045676 + 1e-6);
                    break;
                case RIGHT_SIDE:
                    Assert.assertTrue(root >= 1.5213797068045676 - 1e-6);
                    break;
                case BELOW_SIDE:
                    Assert.assertTrue(val <= 0.0);
                    break;
                case ABOVE_SIDE:
                    Assert.assertTrue(val >= 0.0);
                    break;
            }
        }
    }

    @Test
    public void testSolve_allowedSolutions_intervalAccuracy_decreasingFunction() {
        UnivariateRealFunction invCubic = new UnivariateRealFunction() {
            public double value(double x) {
                return -(x * x * x - x - 2.0);
            }
        };

        AllowedSolution[] allowed = AllowedSolution.values();
        for (AllowedSolution solutionType : allowed) {
            ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-7, 1e-15, BaseSecantSolver.Method.PEGASUS);
            double root = solver.solve(100, invCubic, 1.0, 2.0, solutionType);
            double val = invCubic.value(root);

            switch (solutionType) {
                case ANY_SIDE:
                    Assert.assertEquals(0.0, val, 1e-4);
                    break;
                case LEFT_SIDE:
                    Assert.assertTrue(root <= 1.5213797068045676 + 1e-6);
                    break;
                case RIGHT_SIDE:
                    Assert.assertTrue(root >= 1.5213797068045676 - 1e-6);
                    break;
                case BELOW_SIDE:
                    Assert.assertTrue(val <= 0.0);
                    break;
                case ABOVE_SIDE:
                    Assert.assertTrue(val >= 0.0);
                    break;
            }
        }
    }

    @Test
    public void testSolve_functionValueAccuracyReached_allAllowedSolutions() {
        // High ftol forces FastMath.abs(f1) <= ftol branch
        for (AllowedSolution solutionType : AllowedSolution.values()) {
            ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-14, 1e-1, BaseSecantSolver.Method.ILLINOIS);
            double root = solver.solve(100, cubic, 1.0, 2.0, solutionType);
            double val = cubic.value(root);
            Assert.assertTrue(Math.abs(val) <= 1.0);
        }
    }

    @Test
    public void testSolve_functionValueAccuracy_decreasingFunction() {
        for (AllowedSolution solutionType : AllowedSolution.values()) {
            ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-14, 1e-1, BaseSecantSolver.Method.PEGASUS);
            double root = solver.solve(100, decreasingLinear, 1.0, 3.0, solutionType);
            Assert.assertEquals(2.0, root, 0.5);
        }
    }

    @Test
    public void testSolve_rootsOnQuinticFunction() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-10, BaseSecantSolver.Method.ILLINOIS);
        // Root at x = 1
        Assert.assertEquals(1.0, solver.solve(100, quintic, 0.5, 1.5), 1e-8);
        // Root at x = 2
        Assert.assertEquals(2.0, solver.solve(100, quintic, 1.5, 2.5), 1e-8);
        // Root at x = 3
        Assert.assertEquals(3.0, solver.solve(100, quintic, 2.5, 3.5), 1e-8);
        // Root at x = -1
        Assert.assertEquals(-1.0, solver.solve(100, quintic, -1.5, -0.5), 1e-8);
        // Root at x = -2
        Assert.assertEquals(-2.0, solver.solve(100, quintic, -2.5, -1.5), 1e-8);
    }
}
