import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;

public class BisectionSolverTest {

    private UnivariateRealFunction linearFunction;
    private UnivariateRealFunction quadraticFunction;
    private BisectionSolver solver;

    @Before
    public void setUp() {
        // f(x) = x - 1, root at x = 1
        linearFunction = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 1;
            }
        };

        // f(x) = x^2 - 2, root at x = sqrt(2)
        quadraticFunction = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 2;
            }
        };

        solver = new BisectionSolver();
    }

    @Test
    public void testDefaultConstructor_create_notNull() {
        BisectionSolver s = new BisectionSolver();
        assertNotNull(s);
    }

    @Test
    public void testDeprecatedConstructorWithFunction_create_notNull() {
        BisectionSolver s = new BisectionSolver(linearFunction);
        assertNotNull(s);
    }

    @Test
    public void testSolveWithFunctionMinMax_typicalInput_returnsCorrectRoot() throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(linearFunction, 0, 2);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolveWithFunctionMinMax_quadraticFunction_returnsSqrtTwo() throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(quadraticFunction, 0, 2);
        assertEquals(Math.sqrt(2), result, 1e-6);
    }

    @Test
    public void testSolveWithFunctionMinMaxInitial_typicalInput_returnsCorrectRoot() throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(linearFunction, 0, 2, 1);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testDeprecatedSolveMinMax_typicalInput_returnsCorrectRoot() throws MaxIterationsExceededException, FunctionEvaluationException {
        BisectionSolver deprecatedSolver = new BisectionSolver(linearFunction);
        double result = deprecatedSolver.solve(0, 2);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testDeprecatedSolveMinMaxInitial_typicalInput_returnsCorrectRoot() throws MaxIterationsExceededException, FunctionEvaluationException {
        BisectionSolver deprecatedSolver = new BisectionSolver(linearFunction);
        double result = deprecatedSolver.solve(0, 2, 1);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolve_rootAtBoundaryMin_returnsMin() throws MaxIterationsExceededException, FunctionEvaluationException {
        // f(x) = x - 1, root exactly at boundary min = 1
        double result = solver.solve(linearFunction, 1, 2);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolve_rootAtBoundaryMax_returnsMax() throws MaxIterationsExceededException, FunctionEvaluationException {
        // f(x) = x - 1, root exactly at boundary max = 1
        double result = solver.solve(linearFunction, 0, 1);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolve_negativeInterval_returnsCorrectRoot() throws MaxIterationsExceededException, FunctionEvaluationException {
        // f(x) = x - 1 does not have negative root, test negative interval for another function
        // f(x) = x + 1, root at x = -1
        UnivariateRealFunction negFunction = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x + 1;
            }
        };
        double result = solver.solve(negFunction, -2, 0);
        assertEquals(-1.0, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_invalidIntervalMinGreaterThanMax_throwsException() throws MaxIterationsExceededException, FunctionEvaluationException {
        solver.solve(linearFunction, 2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_invalidIntervalMinEqualsMax_throwsException() throws MaxIterationsExceededException, FunctionEvaluationException {
        solver.solve(linearFunction, 1, 1);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_maxIterationsExceeded_throwsException() throws MaxIterationsExceededException, FunctionEvaluationException {
        // Force immediate failure by setting maximal iteration count to 0
        solver.setMaximalIterationCount(0);
        solver.solve(linearFunction, 0, 2);
    }

    @Test
    public void testSolve_functionThrowsFunctionEvaluationException_propagatesException() {
        UnivariateRealFunction throwingFunction = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(x);
            }
        };
        try {
            solver.solve(throwingFunction, 0, 2);
            fail("Expected FunctionEvaluationException to be thrown");
        } catch (FunctionEvaluationException e) {
            // expected
        } catch (MaxIterationsExceededException e) {
            fail("Expected FunctionEvaluationException but got MaxIterationsExceededException");
        }
    }

    @Test
    public void testSolve_smallInterval_convergesQuickly() throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(linearFunction, 0.999999, 1.000001);
        assertEquals(1.0, result, 1e-5);
    }

    @Test
    public void testSolve_largeInterval_convergesCorrectly() throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(linearFunction, -1000, 1000);
        assertEquals(1.0, result, 1e-5);
    }
}
