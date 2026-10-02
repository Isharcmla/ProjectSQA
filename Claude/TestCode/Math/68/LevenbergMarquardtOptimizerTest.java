import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class LevenbergMarquardtOptimizerTest {

    private LevenbergMarquardtOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new LevenbergMarquardtOptimizer();
    }

    // ---------------------------------------------------------------
    // Helper test problems
    // ---------------------------------------------------------------

    /**
     * Linear problem: y = a*x + b
     */
    private static class LinearProblem implements DifferentiableMultivariateVectorialFunction {
        private final double[] x;

        LinearProblem(double[] x) {
            this.x = x;
        }

        public double[] value(double[] variables) throws FunctionEvaluationException {
            double[] y = new double[x.length];
            for (int i = 0; i < x.length; i++) {
                y[i] = variables[0] * x[i] + variables[1];
            }
            return y;
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) throws FunctionEvaluationException {
                    double[][] jac = new double[x.length][2];
                    for (int i = 0; i < x.length; i++) {
                        jac[i][0] = x[i];
                        jac[i][1] = 1.0;
                    }
                    return jac;
                }
            };
        }
    }

    /**
     * Rank deficient linear problem: y = a*x + b, third parameter unused.
     */
    private static class RankDeficientLinearProblem implements DifferentiableMultivariateVectorialFunction {
        private final double[] x;

        RankDeficientLinearProblem(double[] x) {
            this.x = x;
        }

        public double[] value(double[] variables) throws FunctionEvaluationException {
            double[] y = new double[x.length];
            for (int i = 0; i < x.length; i++) {
                y[i] = variables[0] * x[i] + variables[1];
            }
            return y;
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) throws FunctionEvaluationException {
                    double[][] jac = new double[x.length][3];
                    for (int i = 0; i < x.length; i++) {
                        jac[i][0] = x[i];
                        jac[i][1] = 1.0;
                        jac[i][2] = 0.0;
                    }
                    return jac;
                }
            };
        }
    }

    /**
     * Circle fitting problem (non linear) - parameters: cx, cy, r
     */
    private static class CircleProblem implements DifferentiableMultivariateVectorialFunction {
        private final double[] px;
        private final double[] py;

        CircleProblem(double[] px, double[] py) {
            this.px = px;
            this.py = py;
        }

        public double[] value(double[] point) throws FunctionEvaluationException {
            double cx = point[0];
            double cy = point[1];
            double r  = point[2];
            double[] residual = new double[px.length];
            for (int i = 0; i < px.length; i++) {
                double dx = px[i] - cx;
                double dy = py[i] - cy;
                residual[i] = Math.sqrt(dx * dx + dy * dy) - r;
            }
            return residual;
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) throws FunctionEvaluationException {
                    double cx = point[0];
                    double cy = point[1];
                    double[][] jac = new double[px.length][3];
                    for (int i = 0; i < px.length; i++) {
                        double dx = px[i] - cx;
                        double dy = py[i] - cy;
                        double dist = Math.sqrt(dx * dx + dy * dy);
                        if (dist == 0) {
                            dist = 1e-10;
                        }
                        jac[i][0] = -dx / dist;
                        jac[i][1] = -dy / dist;
                        jac[i][2] = -1.0;
                    }
                    return jac;
                }
            };
        }
    }

    /**
     * Function that always throws FunctionEvaluationException when evaluated.
     */
    private static class ThrowingProblem implements DifferentiableMultivariateVectorialFunction {
        public double[] value(double[] variables) throws FunctionEvaluationException {
            throw new FunctionEvaluationException(variables);
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) throws FunctionEvaluationException {
                    return new double[][] { { 1.0 } };
                }
            };
        }
    }

    // ---------------------------------------------------------------
    // Normal / typical cases
    // ---------------------------------------------------------------

    @Test
    public void testOptimize_overDeterminedLinearProblem_returnsCorrectSolution()
            throws FunctionEvaluationException, OptimizationException {
        double[] x = { 1, 2, 3, 4, 5, 6, 7, 8 };
        double a = 2.0;
        double b = 3.0;
        double[] target = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            target[i] = a * x[i] + b;
        }
        double[] weights = new double[x.length];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = 1.0;
        }
        double[] startPoint = { 0.0, 0.0 };

        LinearProblem problem = new LinearProblem(x);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
        double[] point = result.getPoint();
        assertEquals(a, point[0], 1.0e-6);
        assertEquals(b, point[1], 1.0e-6);
    }

    @Test
    public void testOptimize_exactlyDeterminedLinearProblem_returnsExactSolution()
            throws FunctionEvaluationException, OptimizationException {
        double[] x = { 1, 2 };
        double a = 5.0;
        double b = -1.0;
        double[] target = { a * x[0] + b, a * x[1] + b };
        double[] weights = { 1.0, 1.0 };
        double[] startPoint = { 0.0, 0.0 };

        LinearProblem problem = new LinearProblem(x);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
        double[] point = result.getPoint();
        assertEquals(a, point[0], 1.0e-6);
        assertEquals(b, point[1], 1.0e-6);
    }

    @Test
    public void testOptimize_nonLinearCircleProblem_convergesApproximately()
            throws FunctionEvaluationException, OptimizationException {
        double cx = 2.0;
        double cy = 3.0;
        double r  = 5.0;
        int n = 8;
        double[] px = new double[n];
        double[] py = new double[n];
        for (int i = 0; i < n; i++) {
            double angle = 2 * Math.PI * i / n;
            px[i] = cx + r * Math.cos(angle);
            py[i] = cy + r * Math.sin(angle);
        }
        double[] target = new double[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            target[i] = 0.0;
            weights[i] = 1.0;
        }
        double[] startPoint = { 1.0, 1.0, 4.0 };

        CircleProblem problem = new CircleProblem(px, py);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
        double[] point = result.getPoint();
        assertEquals(cx, point[0], 1.0e-3);
        assertEquals(cy, point[1], 1.0e-3);
        assertEquals(r,  point[2], 1.0e-3);
    }

    @Test
    public void testSetInitialStepBoundFactor_customValue_optimizeStillConverges()
            throws FunctionEvaluationException, OptimizationException {
        optimizer.setInitialStepBoundFactor(10.0);
        double[] x = { 1, 2, 3, 4 };
        double[] target = { 3, 5, 7, 9 };
        double[] weights = { 1, 1, 1, 1 };
        double[] startPoint = { 0, 0 };

        LinearProblem problem = new LinearProblem(x);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1.0e-5);
        assertEquals(1.0, result.getPoint()[1], 1.0e-5);
    }

    @Test
    public void testSetCostRelativeTolerance_customValue_optimizeStillConverges()
            throws FunctionEvaluationException, OptimizationException {
        optimizer.setCostRelativeTolerance(1.0e-8);
        double[] x = { 1, 2, 3, 4 };
        double[] target = { 3, 5, 7, 9 };
        double[] weights = { 1, 1, 1, 1 };
        double[] startPoint = { 0, 0 };

        LinearProblem problem = new LinearProblem(x);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1.0e-5);
        assertEquals(1.0, result.getPoint()[1], 1.0e-5);
    }

    @Test
    public void testSetParRelativeTolerance_customValue_optimizeStillConverges()
            throws FunctionEvaluationException, OptimizationException {
        optimizer.setParRelativeTolerance(1.0e-8);
        double[] x = { 1, 2, 3, 4 };
        double[] target = { 3, 5, 7, 9 };
        double[] weights = { 1, 1, 1, 1 };
        double[] startPoint = { 0, 0 };

        LinearProblem problem = new LinearProblem(x);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1.0e-5);
        assertEquals(1.0, result.getPoint()[1], 1.0e-5);
    }

    @Test
    public void testSetOrthoTolerance_customValue_optimizeStillConverges()
            throws FunctionEvaluationException, OptimizationException {
        optimizer.setOrthoTolerance(1.0e-8);
        double[] x = { 1, 2, 3, 4 };
        double[] target = { 3, 5, 7, 9 };
        double[] weights = { 1, 1, 1, 1 };
        double[] startPoint = { 0, 0 };

        LinearProblem problem = new LinearProblem(x);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1.0e-5);
        assertEquals(1.0, result.getPoint()[1], 1.0e-5);
    }

    // ---------------------------------------------------------------
    // Edge cases
    // ---------------------------------------------------------------

    @Test
    public void testOptimize_alreadyAtSolution_returnsImmediately()
            throws FunctionEvaluationException, OptimizationException {
        double[] x = { 1, 2, 3 };
        double[] target = { 2, 4, 6 };
        double[] weights = { 1, 1, 1 };
        // start point is already the exact solution (a=2, b=0)
        double[] startPoint = { 2.0, 0.0 };

        LinearProblem problem = new LinearProblem(x);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1.0e-6);
        assertEquals(0.0, result.getPoint()[1], 1.0e-6);
    }

    @Test
    public void testOptimize_rankDeficientJacobian_doesNotThrowAndReturnsPoint()
            throws FunctionEvaluationException, OptimizationException {
        double[] x = { 1, 2, 3, 4, 5 };
        double[] target = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            target[i] = 2 * x[i] + 1;
        }
        double[] weights = { 1, 1, 1, 1, 1 };
        double[] startPoint = { 0.0, 0.0, 0.0 };

        RankDeficientLinearProblem problem = new RankDeficientLinearProblem(x);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
        // The first two parameters should still converge to the correct values
        assertEquals(2.0, result.getPoint()[0], 1.0e-4);
        assertEquals(1.0, result.getPoint()[1], 1.0e-4);
    }

    @Test
    public void testOptimize_zeroWeights_doesNotThrow()
            throws FunctionEvaluationException, OptimizationException {
        double[] x = { 1, 2, 3 };
        double[] target = { 2, 4, 6 };
        double[] weights = { 0.0, 0.0, 0.0 };
        double[] startPoint = { 1.0, 1.0 };

        LinearProblem problem = new LinearProblem(x);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
    }

    @Test
    public void testOptimize_singlePointProblem_returnsSolution()
            throws FunctionEvaluationException, OptimizationException {
        double[] x = { 2 };
        double[] target = { 5 };
        double[] weights = { 1.0 };
        double[] startPoint = { 1.0 };

        DifferentiableMultivariateVectorialFunction problem = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] variables) throws FunctionEvaluationException {
                return new double[] { variables[0] * 2.0 };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) throws FunctionEvaluationException {
                        return new double[][] { { 2.0 } };
                    }
                };
            }
        };

        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);
        assertNotNull(result);
        assertEquals(2.5, result.getPoint()[0], 1.0e-6);
    }

    @Test
    public void testOptimize_negativeTargetValues_convergesCorrectly()
            throws FunctionEvaluationException, OptimizationException {
        double[] x = { -3, -2, -1, 0, 1, 2, 3 };
        double a = -4.0;
        double b = 2.0;
        double[] target = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            target[i] = a * x[i] + b;
        }
        double[] weights = new double[x.length];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = 1.0;
        }
        double[] startPoint = { 0.0, 0.0 };

        LinearProblem problem = new LinearProblem(x);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
        assertEquals(a, result.getPoint()[0], 1.0e-6);
        assertEquals(b, result.getPoint()[1], 1.0e-6);
    }

    // ---------------------------------------------------------------
    // Exception cases
    // ---------------------------------------------------------------

    @Test(expected = FunctionEvaluationException.class)
    public void testOptimize_functionThrowsEvaluationException_propagatesException()
            throws FunctionEvaluationException, OptimizationException {
        double[] target = { 1.0 };
        double[] weights = { 1.0 };
        double[] startPoint = { 1.0 };

        ThrowingProblem problem = new ThrowingProblem();
        optimizer.optimize(problem, target, weights, startPoint);
    }

    @Test(expected = OptimizationException.class)
    public void testOptimize_maxIterationsExceeded_throwsOptimizationException()
            throws FunctionEvaluationException, OptimizationException {
        optimizer.setMaxIterations(1);

        double cx = 2.0;
        double cy = 3.0;
        double r  = 5.0;
        int n = 10;
        double[] px = new double[n];
        double[] py = new double[n];
        for (int i = 0; i < n; i++) {
            double angle = 2 * Math.PI * i / n;
            px[i] = cx + r * Math.cos(angle) + (i % 2 == 0 ? 0.3 : -0.3);
            py[i] = cy + r * Math.sin(angle) + (i % 2 == 0 ? -0.3 : 0.3);
        }
        double[] target = new double[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            target[i] = 0.0;
            weights[i] = 1.0;
        }
        // deliberately far start point to require multiple iterations
        double[] startPoint = { -10.0, -10.0, 1.0 };

        CircleProblem problem = new CircleProblem(px, py);
        optimizer.optimize(problem, target, weights, startPoint);
    }

    @Test
    public void testOptimize_withManyIterationsAllowed_doesNotThrow()
            throws FunctionEvaluationException, OptimizationException {
        optimizer.setMaxIterations(2000);
        double[] x = { 1, 2, 3, 4, 5 };
        double[] target = { 3, 5, 7, 9, 11 };
        double[] weights = { 1, 1, 1, 1, 1 };
        double[] startPoint = { 0.0, 0.0 };

        LinearProblem problem = new LinearProblem(x);
        VectorialPointValuePair result = optimizer.optimize(problem, target, weights, startPoint);

        assertNotNull(result);
        assertTrue(Math.abs(result.getPoint()[0] - 2.0) < 1.0e-4);
        assertTrue(Math.abs(result.getPoint()[1] - 1.0) < 1.0e-4);
    }

    @Test
    public void testOptimize_nullStartPoint_throwsException() {
        double[] x = { 1, 2, 3 };
        double[] target = { 2, 4, 6 };
        double[] weights = { 1, 1, 1 };

        LinearProblem problem = new LinearProblem(x);
        try {
            optimizer.optimize(problem, target, weights, null);
            fail("Expected an exception to be thrown for null start point");
        } catch (Exception e) {
            // Expected: implementation-specific exception (NullPointerException,
            // IllegalArgumentException, etc.) depending on superclass behaviour.
            assertTrue(true);
        }
    }

    @Test
    public void testOptimize_mismatchedTargetAndWeightsLength_throwsException() {
        double[] x = { 1, 2, 3 };
        double[] target = { 2, 4, 6 };
        double[] weights = { 1, 1 }; // mismatched length

        LinearProblem problem = new LinearProblem(x);
        try {
            optimizer.optimize(problem, target, weights, new double[] { 0.0, 0.0 });
            fail("Expected an exception to be thrown for mismatched array lengths");
        } catch (Exception e) {
            // Expected: implementation-specific exception
            assertTrue(true);
        }
    }
}
