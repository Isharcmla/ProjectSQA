package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.junit.Assert;
import org.junit.Test;

public class BaseSecantSolverTest {

    private static class DummySecantSolver extends BaseSecantSolver {
        public DummySecantSolver(final double absoluteAccuracy, final Method method) {
            super(absoluteAccuracy, method);
        }

        public DummySecantSolver(final double relativeAccuracy, final double absoluteAccuracy, final Method method) {
            super(relativeAccuracy, absoluteAccuracy, method);
        }

        public DummySecantSolver(final double relativeAccuracy, final double absoluteAccuracy,
                                 final double functionValueAccuracy, final Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }
    }

    private static final UnivariateRealFunction LINEAR = new UnivariateRealFunction() {
        public double value(double x) {
            return x - 2.0; // root at x = 2
        }
    };

    private static final UnivariateRealFunction QUADRATIC = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x - 4.0; // roots at -2, 2
        }
    };

    private static final UnivariateRealFunction SIN = new UnivariateRealFunction() {
        public double value(double x) {
            return Math.sin(x);
        }
    };

    @Test
    public void testConstructors() {
        BaseSecantSolver solver1 = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        Assert.assertEquals(1e-6, solver1.getAbsoluteAccuracy(), 1e-15);

        BaseSecantSolver solver2 = new DummySecantSolver(1e-14, 1e-6, BaseSecantSolver.Method.PEGASUS);
        Assert.assertEquals(1e-14, solver2.getRelativeAccuracy(), 1e-15);
        Assert.assertEquals(1e-6, solver2.getAbsoluteAccuracy(), 1e-15);

        BaseSecantSolver solver3 = new DummySecantSolver(1e-14, 1e-6, 1e-15, BaseSecantSolver.Method.REGULA_FALSI);
        Assert.assertEquals(1e-14, solver3.getRelativeAccuracy(), 1e-15);
        Assert.assertEquals(1e-6, solver3.getAbsoluteAccuracy(), 1e-15);
        Assert.assertEquals(1e-15, solver3.getFunctionValueAccuracy(), 1e-15);
    }

    @Test
    public void testSolve_exactRootAtMin_returnsMin() {
        BaseSecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double root = solver.solve(100, LINEAR, 2.0, 5.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    @Test
    public void testSolve_exactRootAtMax_returnsMax() {
        BaseSecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double root = solver.solve(100, LINEAR, -1.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    @Test
    public void testSolve_exactRootInIteration_returnsExactRoot() {
        BaseSecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        // Linear function hits exact root in the very first secant step
        double root = solver.solve(100, LINEAR, 0.0, 4.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    @Test
    public void testSolve_fourParametersMethod_success() {
        BaseSecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double root = solver.solve(100, QUADRATIC, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-5);
    }

    @Test
    public void testSolve_fiveParametersWithoutAllowedSolution_success() {
        BaseSecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double root = solver.solve(100, QUADRATIC, 0.0, 5.0, 1.0);
        Assert.assertEquals(2.0, root, 1e-5);
    }

    @Test
    public void testSolve_allMethodsIllinoisPegasusRegulaFalsi() {
        BaseSecantSolver solverIll = new DummySecantSolver(1e-10, 1e-8, BaseSecantSolver.Method.ILLINOIS);
        double rootIll = solverIll.solve(100, QUADRATIC, 1.0, 4.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, rootIll, 1e-6);

        BaseSecantSolver solverPeg = new DummySecantSolver(1e-10, 1e-8, BaseSecantSolver.Method.PEGASUS);
        double rootPeg = solverPeg.solve(100, QUADRATIC, 1.0, 4.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, rootPeg, 1e-6);

        BaseSecantSolver solverReg = new DummySecantSolver(1e-10, 1e-8, BaseSecantSolver.Method.REGULA_FALSI);
        double rootReg = solverReg.solve(100, QUADRATIC, 1.0, 4.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, rootReg, 1e-6);
    }

    @Test
    public void testSolve_allowedSolutions_intervalAccuracy() {
        BaseSecantSolver solver = new DummySecantSolver(1e-14, 1e-5, 1e-15, BaseSecantSolver.Method.ILLINOIS);

        double rootAny = solver.solve(100, SIN, 3.0, 4.0, 3.2, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(Math.PI, rootAny, 1e-4);

        double rootLeft = solver.solve(100, SIN, 3.0, 4.0, 3.2, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue(rootLeft <= Math.PI);

        double rootRight = solver.solve(100, SIN, 3.0, 4.0, 3.2, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue(rootRight >= Math.PI);

        double rootBelow = solver.solve(100, SIN, 3.0, 4.0, 3.2, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(SIN.value(rootBelow) <= 0.0);

        double rootAbove = solver.solve(100, SIN, 3.0, 4.0, 3.2, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(SIN.value(rootAbove) >= 0.0);
    }

    @Test
    public void testSolve_allowedSolutions_functionValueAccuracy() {
        // High ftol forces termination via abs(f1) <= ftol
        BaseSecantSolver solver = new DummySecantSolver(1e-14, 1e-14, 0.5, BaseSecantSolver.Method.ILLINOIS);

        double rootAny = solver.solve(100, SIN, 3.0, 4.0, 3.2, AllowedSolution.ANY_SIDE);
        Assert.assertTrue(Math.abs(SIN.value(rootAny)) <= 0.5);

        double rootLeft = solver.solve(100, SIN, 3.0, 4.0, 3.2, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue(rootLeft <= Math.PI);

        double rootRight = solver.solve(100, SIN, 3.0, 4.0, 3.2, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue(rootRight >= Math.PI);

        double rootBelow = solver.solve(100, SIN, 3.0, 4.0, 3.2, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(SIN.value(rootBelow) <= 0.0);

        double rootAbove = solver.solve(100, SIN, 3.0, 4.0, 3.2, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(SIN.value(rootAbove) >= 0.0);
    }

    @Test(expected = NoBracketingException.class)
    public void testSolve_noBracketing_throwsException() {
        BaseSecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        solver.solve(100, QUADRATIC, 3.0, 5.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_exceedMaxEvaluations_throwsException() {
        BaseSecantSolver solver = new DummySecantSolver(1e-15, 1e-15, 1e-15, BaseSecantSolver.Method.REGULA_FALSI);
        solver.solve(2, QUADRATIC, 1.0, 5.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testSolve_minLargerThanMax_throwsException() {
        BaseSecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        solver.solve(100, QUADRATIC, 5.0, 1.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = NullArgumentException.class)
    public void testSolve_nullFunction_throwsException() {
        BaseSecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        solver.solve(100, null, 1.0, 5.0, AllowedSolution.ANY_SIDE);
    }

    @Test
    public void testMethodEnumValues() {
        BaseSecantSolver.Method[] methods = BaseSecantSolver.Method.values();
        Assert.assertEquals(3, methods.length);
        Assert.assertEquals(BaseSecantSolver.Method.REGULA_FALSI, BaseSecantSolver.Method.valueOf("REGULA_FALSI"));
        Assert.assertEquals(BaseSecantSolver.Method.ILLINOIS, BaseSecantSolver.Method.valueOf("ILLINOIS"));
        Assert.assertEquals(BaseSecantSolver.Method.PEGASUS, BaseSecantSolver.Method.valueOf("PEGASUS"));
    }
}
