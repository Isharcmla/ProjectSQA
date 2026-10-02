package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Unit tests for {@link BaseSecantSolver}.
 *
 * Since BaseSecantSolver is abstract, a minimal concrete subclass is used
 * to expose its protected constructors for testing purposes.
 */
public class BaseSecantSolverTest {

    /** Simple concrete subclass used to instantiate BaseSecantSolver. */
    private static class ConcreteSecantSolver extends BaseSecantSolver {

        ConcreteSecantSolver() {
            super(DEFAULT_ABSOLUTE_ACCURACY, Method.REGULA_FALSI);
        }

        ConcreteSecantSolver(final double absoluteAccuracy, final Method method) {
            super(absoluteAccuracy, method);
        }

        ConcreteSecantSolver(final double relativeAccuracy,
                             final double absoluteAccuracy,
                             final Method method) {
            super(relativeAccuracy, absoluteAccuracy, method);
        }

        ConcreteSecantSolver(final double relativeAccuracy,
                             final double absoluteAccuracy,
                             final double functionValueAccuracy,
                             final Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }
    }

    /** f(x) = x^2 - 2, root at sqrt(2) ~= 1.41421356 */
    private static final UnivariateRealFunction QUADRATIC = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x - 2;
        }
    };

    /** f(x) = x - 2, root at 2 (used for exact-bound tests). */
    private static final UnivariateRealFunction LINEAR_ROOT_AT_2 = new UnivariateRealFunction() {
        public double value(double x) {
            return x - 2;
        }
    };

    /** f(x) = x - 5, root at 5 (used for exact-bound tests). */
    private static final UnivariateRealFunction LINEAR_ROOT_AT_5 = new UnivariateRealFunction() {
        public double value(double x) {
            return x - 5;
        }
    };

    /** f(x) = x^2 + 1, always positive, no root -> used for bracketing failure. */
    private static final UnivariateRealFunction NO_ROOT = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x + 1;
        }
    };

    private static final double SQRT2 = Math.sqrt(2.0);

    private ConcreteSecantSolver regulaFalsiSolver;
    private ConcreteSecantSolver illinoisSolver;
    private ConcreteSecantSolver pegasusSolver;

    @Before
    public void setUp() {
        regulaFalsiSolver = new ConcreteSecantSolver(1e-9, BaseSecantSolver.Method.REGULA_FALSI);
        illinoisSolver = new ConcreteSecantSolver(1e-9, BaseSecantSolver.Method.ILLINOIS);
        pegasusSolver = new ConcreteSecantSolver(1e-9, BaseSecantSolver.Method.PEGASUS);
    }

    // ---------------------------------------------------------------
    // Normal / typical input tests
    // ---------------------------------------------------------------

    @Test
    public void testSolve_regulaFalsiMethod_convergesToRoot() {
        double result = regulaFalsiSolver.solve(1000, QUADRATIC, 0, 2);
        assertEquals(SQRT2, result, 1e-3);
    }

    @Test
    public void testSolve_illinoisMethod_convergesToRoot() {
        double result = illinoisSolver.solve(1000, QUADRATIC, 0, 2);
        assertEquals(SQRT2, result, 1e-3);
    }

    @Test
    public void testSolve_pegasusMethod_convergesToRoot() {
        double result = pegasusSolver.solve(1000, QUADRATIC, 0, 2);
        assertEquals(SQRT2, result, 1e-3);
    }

    @Test
    public void testSolve_withStartValueAndAllowedSolution_returnsRoot() {
        double result = regulaFalsiSolver.solve(1000, QUADRATIC, 0, 2, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 1e-3);
    }

    @Test
    public void testSolve_withoutStartValue_usesMidpointAndReturnsRoot() {
        double result = illinoisSolver.solve(1000, QUADRATIC, 0, 2, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 1e-3);
    }

    @Test
    public void testSolve_withStartValue_defaultAllowedSolution() {
        double result = pegasusSolver.solve(1000, QUADRATIC, 0, 2, 0.5);
        assertEquals(SQRT2, result, 1e-3);
    }

    // ---------------------------------------------------------------
    // AllowedSolution variants
    // ---------------------------------------------------------------

    @Test
    public void testSolve_allowedSolutionAnySide_returnsCloseToRoot() {
        double result = illinoisSolver.solve(1000, QUADRATIC, 0, 2, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 1e-3);
    }

    @Test
    public void testSolve_allowedSolutionLeftSide_returnsCloseToRoot() {
        double result = illinoisSolver.solve(1000, QUADRATIC, 0, 2, AllowedSolution.LEFT_SIDE);
        assertEquals(SQRT2, result, 1e-2);
    }

    @Test
    public void testSolve_allowedSolutionRightSide_returnsCloseToRoot() {
        double result = illinoisSolver.solve(1000, QUADRATIC, 0, 2, AllowedSolution.RIGHT_SIDE);
        assertEquals(SQRT2, result, 1e-2);
    }

    @Test
    public void testSolve_allowedSolutionBelowSide_returnsCloseToRoot() {
        double result = illinoisSolver.solve(1000, QUADRATIC, 0, 2, AllowedSolution.BELOW_SIDE);
        assertEquals(SQRT2, result, 1e-2);
    }

    @Test
    public void testSolve_allowedSolutionAboveSide_returnsCloseToRoot() {
        double result = illinoisSolver.solve(1000, QUADRATIC, 0, 2, AllowedSolution.ABOVE_SIDE);
        assertEquals(SQRT2, result, 1e-2);
    }

    @Test
    public void testSolve_pegasus_allowedSolutionLeftSide_returnsCloseToRoot() {
        double result = pegasusSolver.solve(1000, QUADRATIC, 0, 2, AllowedSolution.LEFT_SIDE);
        assertEquals(SQRT2, result, 1e-2);
    }

    @Test
    public void testSolve_pegasus_allowedSolutionRightSide_returnsCloseToRoot() {
        double result = pegasusSolver.solve(1000, QUADRATIC, 0, 2, AllowedSolution.RIGHT_SIDE);
        assertEquals(SQRT2, result, 1e-2);
    }

    @Test
    public void testSolve_regulaFalsi_allowedSolutionBelowSide_returnsCloseToRoot() {
        double result = regulaFalsiSolver.solve(1000, QUADRATIC, 0, 2, AllowedSolution.BELOW_SIDE);
        assertEquals(SQRT2, result, 1e-2);
    }

    @Test
    public void testSolve_regulaFalsi_allowedSolutionAboveSide_returnsCloseToRoot() {
        double result = regulaFalsiSolver.solve(1000, QUADRATIC, 0, 2, AllowedSolution.ABOVE_SIDE);
        assertEquals(SQRT2, result, 1e-2);
    }

    // ---------------------------------------------------------------
    // Edge cases: exact root at one of the bounds
    // ---------------------------------------------------------------

    @Test
    public void testDoSolve_functionZeroAtMin_returnsMin() {
        double result = regulaFalsiSolver.solve(100, LINEAR_ROOT_AT_2, 2, 5);
        assertEquals(2.0, result, 1e-12);
    }

    @Test
    public void testDoSolve_functionZeroAtMax_returnsMax() {
        double result = regulaFalsiSolver.solve(100, LINEAR_ROOT_AT_5, 2, 5);
        assertEquals(5.0, result, 1e-12);
    }

    // ---------------------------------------------------------------
    // Edge case: functionValueAccuracy triggers early return
    // ---------------------------------------------------------------

    @Test
    public void testSolve_largeFunctionValueAccuracy_earlyReturn() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-9, 1e-9, 0.5, BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(1000, QUADRATIC, 0, 2, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, 0.5);
    }

    // ---------------------------------------------------------------
    // Exception / failure cases
    // ---------------------------------------------------------------

    @Test(expected = RuntimeException.class)
    public void testDoSolve_noBracketing_throwsException() {
        regulaFalsiSolver.solve(100, NO_ROOT, -1, 1);
    }

    @Test
    public void testDoSolve_noBracketing_throwsExceptionCaught() {
        try {
            illinoisSolver.solve(100, NO_ROOT, -1, 1);
            fail("Expected an exception due to no bracketing of the root.");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }

    // ---------------------------------------------------------------
    // Constructors coverage
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_absoluteAccuracyOnly_createsSolver() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(1000, QUADRATIC, 0, 2);
        assertEquals(SQRT2, result, 1e-3);
    }

    @Test
    public void testConstructor_relativeAndAbsoluteAccuracy_createsSolver() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-9, 1e-9, BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(1000, QUADRATIC, 0, 2);
        assertEquals(SQRT2, result, 1e-3);
    }

    @Test
    public void testConstructor_defaultNoArgParams_createsSolver() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver();
        double result = solver.solve(1000, QUADRATIC, 0, 2);
        assertEquals(SQRT2, result, 1e-3);
    }

    @Test
    public void testConstructor_fullParams_createsSolver() {
        ConcreteSecantSolver solver = new ConcreteSecantSolver(1e-9, 1e-9, 1e-12, BaseSecantSolver.Method.PEGASUS);
        double result = solver.solve(1000, QUADRATIC, 0, 2);
        assertEquals(SQRT2, result, 1e-3);
    }

    // ---------------------------------------------------------------
    // Method enum coverage
    // ---------------------------------------------------------------

    @Test
    public void testMethodEnum_valuesAndValueOf_workCorrectly() {
        BaseSecantSolver.Method[] values = BaseSecantSolver.Method.values();
        assertEquals(3, values.length);
        assertEquals(BaseSecantSolver.Method.REGULA_FALSI,
                      BaseSecantSolver.Method.valueOf("REGULA_FALSI"));
        assertEquals(BaseSecantSolver.Method.ILLINOIS,
                      BaseSecantSolver.Method.valueOf("ILLINOIS"));
        assertEquals(BaseSecantSolver.Method.PEGASUS,
                      BaseSecantSolver.Method.valueOf("PEGASUS"));
    }
}
