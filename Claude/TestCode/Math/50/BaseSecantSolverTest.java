package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.junit.Test;

public class BaseSecantSolverTest {

    private static final double EPS = 1e-6;

    /** Simple function: f(x) = x^2 - 2, root at sqrt(2) ~ 1.41421356 */
    private static final UnivariateRealFunction SQUARE_MINUS_TWO = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x - 2;
        }
    };

    /** Linear function: f(x) = x, root at 0 */
    private static final UnivariateRealFunction LINEAR = new UnivariateRealFunction() {
        public double value(double x) {
            return x;
        }
    };

    /** Cubic function: f(x) = x^3 - 1, root at 1 */
    private static final UnivariateRealFunction CUBIC_MINUS_ONE = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x * x - 1;
        }
    };

    // ---------------------------------------------------------------------
    // Normal / typical input tests
    // ---------------------------------------------------------------------

    @Test
    public void testSolve_RegulaFalsi_NormalCase_returnsRoot() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double root = solver.solve(100, SQUARE_MINUS_TWO, 0, 2);
        assertEquals(Math.sqrt(2), root, 1e-4);
    }

    @Test
    public void testSolve_Illinois_NormalCase_returnsRoot() {
        IllinoisSolver solver = new IllinoisSolver();
        double root = solver.solve(100, SQUARE_MINUS_TWO, 0, 2);
        assertEquals(Math.sqrt(2), root, 1e-4);
    }

    @Test
    public void testSolve_Pegasus_NormalCase_returnsRoot() {
        PegasusSolver solver = new PegasusSolver();
        double root = solver.solve(100, SQUARE_MINUS_TWO, 0, 2);
        assertEquals(Math.sqrt(2), root, 1e-4);
    }

    @Test
    public void testSolve_WithStartValue_returnsRoot() {
        IllinoisSolver solver = new IllinoisSolver();
        double root = solver.solve(100, SQUARE_MINUS_TWO, 0, 2, 1.0);
        assertEquals(Math.sqrt(2), root, 1e-4);
    }

    @Test
    public void testSolve_WithAllowedSolutionAnySide_returnsRoot() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double root = solver.solve(100, SQUARE_MINUS_TWO, 0, 2, AllowedSolution.ANY_SIDE);
        assertEquals(Math.sqrt(2), root, 1e-4);
    }

    @Test
    public void testSolve_WithAllowedSolutionLeftSide_returnsValueLeftOfRoot() {
        PegasusSolver solver = new PegasusSolver();
        double root = solver.solve(100, SQUARE_MINUS_TWO, 0, 2, AllowedSolution.LEFT_SIDE);
        assertTrue(root <= Math.sqrt(2) + EPS);
    }

    @Test
    public void testSolve_WithAllowedSolutionRightSide_returnsValueRightOfRoot() {
        PegasusSolver solver = new PegasusSolver();
        double root = solver.solve(100, SQUARE_MINUS_TWO, 0, 2, AllowedSolution.RIGHT_SIDE);
        assertTrue(root >= Math.sqrt(2) - EPS);
    }

    @Test
    public void testSolve_WithAllowedSolutionBelowSide_returnsValueBelowRoot() {
        IllinoisSolver solver = new IllinoisSolver();
        double root = solver.solve(100, SQUARE_MINUS_TWO, 0, 2, AllowedSolution.BELOW_SIDE);
        double value = SQUARE_MINUS_TWO.value(root);
        assertTrue(value <= EPS);
    }

    @Test
    public void testSolve_WithAllowedSolutionAboveSide_returnsValueAboveRoot() {
        IllinoisSolver solver = new IllinoisSolver();
        double root = solver.solve(100, SQUARE_MINUS_TWO, 0, 2, AllowedSolution.ABOVE_SIDE);
        double value = SQUARE_MINUS_TWO.value(root);
        assertTrue(value >= -EPS);
    }

    @Test
    public void testSolve_WithStartValueAndAllowedSolution_returnsRoot() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double root = solver.solve(100, SQUARE_MINUS_TWO, 0, 2, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(Math.sqrt(2), root, 1e-4);
    }

    @Test
    public void testSolve_CubicFunction_returnsRoot() {
        PegasusSolver solver = new PegasusSolver();
        double root = solver.solve(100, CUBIC_MINUS_ONE, 0, 2);
        assertEquals(1.0, root, 1e-4);
    }

    @Test
    public void testSolve_LinearFunction_returnsZero() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double root = solver.solve(100, LINEAR, -1, 1);
        assertEquals(0.0, root, 1e-4);
    }

    // ---------------------------------------------------------------------
    // Edge cases
    // ---------------------------------------------------------------------

    @Test
    public void testSolve_MinIsExactRoot_returnsMin() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // f(min) == 0 exactly
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        double root = solver.solve(100, f, 0.0, 2.0);
        assertEquals(0.0, root, 0.0);
    }

    @Test
    public void testSolve_MaxIsExactRoot_returnsMax() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        double root = solver.solve(100, f, -2.0, 0.0);
        assertEquals(0.0, root, 0.0);
    }

    @Test
    public void testSolve_NegativeInterval_returnsRoot() {
        IllinoisSolver solver = new IllinoisSolver();
        // root is at x = -1 for f(x) = x + 1
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x + 1;
            }
        };
        double root = solver.solve(100, f, -5.0, -0.5);
        assertEquals(-1.0, root, 1e-4);
    }

    @Test
    public void testGetAbsoluteAccuracy_defaultValue_returnsExpected() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        assertEquals(BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY, solver.getAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testGetRelativeAccuracy_customValue_returnsExpected() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-10, 1e-8);
        assertEquals(1e-10, solver.getRelativeAccuracy(), 0.0);
        assertEquals(1e-8, solver.getAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testGetFunctionValueAccuracy_customValue_returnsExpected() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-10, 1e-8, 1e-9);
        assertEquals(1e-9, solver.getFunctionValueAccuracy(), 0.0);
    }

    // ---------------------------------------------------------------------
    // Exception cases
    // ---------------------------------------------------------------------

    @Test(expected = NoBracketingException.class)
    public void testSolve_NonBracketingInterval_throwsNoBracketingException() {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // f(0)=−2, f(1)=−1 -> no sign change, not bracketing
        solver.solve(100, SQUARE_MINUS_TWO, 0.0, 1.0);
    }

    @Test(expected = NoBracketingException.class)
    public void testSolve_SameSignBounds_throwsNoBracketingException() {
        IllinoisSolver solver = new IllinoisSolver();
        solver.solve(100, LINEAR, 1.0, 2.0);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testSolve_TooManyEvaluations_throwsException() {
        PegasusSolver solver = new PegasusSolver();
        // maxEval is intentionally too small to converge
        solver.solve(1, SQUARE_MINUS_TWO, 0.0, 2.0);
    }

    @Test
    public void testSolve_MethodIllinois_viaBaseSecantSolver_returnsRoot() {
        BaseSecantSolver solver = new IllinoisSolver();
        double root = solver.solve(1000, SQUARE_MINUS_TWO, -5.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(Math.sqrt(2), root, 1e-4);
    }

    @Test
    public void testSolve_MethodPegasus_viaBaseSecantSolver_returnsRoot() {
        BaseSecantSolver solver = new PegasusSolver();
        double root = solver.solve(1000, SQUARE_MINUS_TWO, -5.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(Math.sqrt(2), root, 1e-4);
    }

    @Test
    public void testSolve_MethodRegulaFalsi_viaBaseSecantSolver_returnsRoot() {
        BaseSecantSolver solver = new RegulaFalsiSolver();
        double root = solver.solve(1000, SQUARE_MINUS_TWO, -5.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(Math.sqrt(2), root, 1e-4);
    }

    @Test
    public void testSolve_ZeroInterval_handlesGracefully() {
        // min equals max but f(min)==0 handled as exact root
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 0.0;
            }
        };
        double root = solver.solve(100, f, 0.0, 0.0);
        assertEquals(0.0, root, 0.0);
    }
}
