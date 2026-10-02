package org.apache.commons.math.optimization.general;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest {

    private static class DummyOptimizer extends AbstractLeastSquaresOptimizer {
        private boolean doOptimizeCalled = false;
        private VectorialPointValuePair resultToReturn = null;

        public DummyOptimizer() {
            super();
        }

        public void setResultToReturn(VectorialPointValuePair result) {
            this.resultToReturn = result;
        }

        public boolean isDoOptimizeCalled() {
            return doOptimizeCalled;
        }

        @Override
        protected VectorialPointValuePair doOptimize() throws FunctionEvaluationException, OptimizationException, IllegalArgumentException {
            doOptimizeCalled = true;
            return resultToReturn != null ? resultToReturn : new VectorialPointValuePair(point, objective);
        }

        // Expose protected methods and fields for testing
        public void publicIncrementIterationsCounter() throws OptimizationException {
            super.incrementIterationsCounter();
        }

        public void publicUpdateJacobian() throws FunctionEvaluationException {
            super.updateJacobian();
        }

        public void publicUpdateResidualsAndCost() throws FunctionEvaluationException {
            super.updateResidualsAndCost();
        }

        public double[][] getJacobianMatrix() {
            return jacobian;
        }

        public double[] getResidualsArray() {
            return residuals;
        }

        public double getCostValue() {
            return cost;
        }

        public void setPoint(double[] point) {
            this.point = point;
        }

        public void setRowsCols(int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
        }

        public void setResidualsWeights(double[] weights) {
            this.residualsWeights = weights;
        }

        public void setResiduals(double[] residuals) {
            this.residuals = residuals;
        }

        public void setJacobian(double[][] jacobian) {
            this.jacobian = jacobian;
        }
    }

    private static class LinearProblemFunction implements DifferentiableMultivariateVectorialFunction {
        private final double[][] factors;

        public LinearProblemFunction(double[][] factors) {
            this.factors = factors;
        }

        @Override
        public double[] value(double[] point) {
            double[] result = new double[factors.length];
            for (int i = 0; i < factors.length; ++i) {
                double sum = 0.0;
                for (int j = 0; j < point.length; ++j) {
                    sum += factors[i][j] * point[j];
                }
                result[i] = sum;
            }
            return result;
        }

        @Override
        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                @Override
                public double[][] value(double[] point) {
                    double[][] copy = new double[factors.length][factors[0].length];
                    for (int i = 0; i < factors.length; ++i) {
                        System.arraycopy(factors[i], 0, copy[i], 0, factors[i].length);
                    }
                    return copy;
                }
            };
        }
    }

    @Test
    public void testDefaultConstructorAndGettersSetters() {
        DummyOptimizer optimizer = new DummyOptimizer();

        Assert.assertEquals(AbstractLeastSquaresOptimizer.DEFAULT_MAX_ITERATIONS, optimizer.getMaxIterations());
        Assert.assertEquals(100, optimizer.getMaxIterations());
        Assert.assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        Assert.assertEquals(0, optimizer.getIterations());
        Assert.assertEquals(0, optimizer.getEvaluations());
        Assert.assertEquals(0, optimizer.getJacobianEvaluations());
        Assert.assertNotNull(optimizer.getConvergenceChecker());
        Assert.assertTrue(optimizer.getConvergenceChecker() instanceof SimpleVectorialValueChecker);

        optimizer.setMaxIterations(50);
        Assert.assertEquals(50, optimizer.getMaxIterations());

        optimizer.setMaxEvaluations(200);
        Assert.assertEquals(200, optimizer.getMaxEvaluations());

        VectorialConvergenceChecker customChecker = new SimpleVectorialValueChecker(1e-4, 1e-4);
        optimizer.setConvergenceChecker(customChecker);
        Assert.assertSame(customChecker, optimizer.getConvergenceChecker());

        optimizer.setConvergenceChecker(null);
        Assert.assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testIncrementIterationsCounter_normalAndExceeded() {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.setMaxIterations(2);

        try {
            optimizer.publicIncrementIterationsCounter();
            Assert.assertEquals(1, optimizer.getIterations());
            optimizer.publicIncrementIterationsCounter();
            Assert.assertEquals(2, optimizer.getIterations());
        } catch (OptimizationException e) {
            Assert.fail("Should not exceed max iterations yet");
        }

        try {
            optimizer.publicIncrementIterationsCounter();
            Assert.fail("Expected OptimizationException when max iterations exceeded");
        } catch (OptimizationException e) {
            Assert.assertEquals(3, optimizer.getIterations());
        }
    }

    @Test
    public void testOptimize_mismatchedTargetAndWeights_throwsException() {
        DummyOptimizer optimizer = new DummyOptimizer();
        DifferentiableMultivariateVectorialFunction function = new LinearProblemFunction(new double[][] {{1.0}});

        double[] target = new double[] { 1.0, 2.0 };
        double[] weights = new double[] { 1.0 };
        double[] startPoint = new double[] { 0.0 };

        try {
            optimizer.optimize(function, target, weights, startPoint);
            Assert.fail("Expected OptimizationException due to dimension mismatch");
        } catch (OptimizationException e) {
            // Expected
        } catch (FunctionEvaluationException e) {
            Assert.fail("Unexpected FunctionEvaluationException: " + e.getMessage());
        }
    }

    @Test
    public void testOptimize_successWorkflow() throws FunctionEvaluationException, OptimizationException {
        DummyOptimizer optimizer = new DummyOptimizer();
        double[][] factors = new double[][] {
            { 1.0, 2.0 },
            { 3.0, 4.0 },
            { 5.0, 6.0 }
        };
        DifferentiableMultivariateVectorialFunction function = new LinearProblemFunction(factors);

        double[] target = new double[] { 1.0, 2.0, 3.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 0.5, 0.5 };

        VectorialPointValuePair expectedPair = new VectorialPointValuePair(startPoint, new double[] { 1.5, 3.5, 5.5 });
        optimizer.setResultToReturn(expectedPair);

        VectorialPointValuePair result = optimizer.optimize(function, target, weights, startPoint);

        Assert.assertTrue(optimizer.isDoOptimizeCalled());
        Assert.assertSame(expectedPair, result);
        Assert.assertEquals(0, optimizer.getIterations());
        Assert.assertEquals(0, optimizer.getEvaluations());
        Assert.assertEquals(0, optimizer.getJacobianEvaluations());
        Assert.assertEquals(Double.POSITIVE_INFINITY, optimizer.getCostValue(), 1e-15);
    }

    @Test
    public void testUpdateResidualsAndCost_normal() throws Exception {
        DummyOptimizer optimizer = new DummyOptimizer();
        double[][] factors = new double[][] {
            { 2.0 },
            { 3.0 }
        };
        DifferentiableMultivariateVectorialFunction function = new LinearProblemFunction(factors);

        double[] target = new double[] { 5.0, 7.0 };
        double[] weights = new double[] { 2.0, 3.0 };
        double[] startPoint = new double[] { 2.0 };

        optimizer.optimize(function, target, weights, startPoint);
        optimizer.publicUpdateResidualsAndCost();

        Assert.assertEquals(1, optimizer.getEvaluations());
        double[] residuals = optimizer.getResidualsArray();
        // Point is [2.0], function value is [4.0, 6.0]
        // Target is [5.0, 7.0]
        // residuals = target - value = [1.0, 1.0]
        Assert.assertEquals(1.0, residuals[0], 1e-15);
        Assert.assertEquals(1.0, residuals[1], 1e-15);

        // cost = sqrt(2.0 * 1.0^2 + 3.0 * 1.0^2) = sqrt(5.0)
        Assert.assertEquals(Math.sqrt(5.0), optimizer.getCostValue(), 1e-15);
    }

    @Test
    public void testUpdateResidualsAndCost_maxEvaluationsExceeded() throws Exception {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.setMaxEvaluations(1);

        double[][] factors = new double[][] { { 1.0 } };
        DifferentiableMultivariateVectorialFunction function = new LinearProblemFunction(factors);

        optimizer.optimize(function, new double[] { 1.0 }, new double[] { 1.0 }, new double[] { 0.0 });
        optimizer.publicUpdateResidualsAndCost();
        Assert.assertEquals(1, optimizer.getEvaluations());

        try {
            optimizer.publicUpdateResidualsAndCost();
            Assert.fail("Expected FunctionEvaluationException due to MaxEvaluationsExceededException");
        } catch (FunctionEvaluationException e) {
            // Expected
        }
    }

    @Test
    public void testUpdateResidualsAndCost_dimensionMismatch() throws Exception {
        DummyOptimizer optimizer = new DummyOptimizer();
        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            @Override
            public double[] value(double[] point) {
                return new double[] { 1.0 }; // Returns 1 element while rows = 2
            }

            @Override
            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    @Override
                    public double[][] value(double[] point) {
                        return new double[][] { { 1.0 } };
                    }
                };
            }
        };

        optimizer.optimize(function, new double[] { 1.0, 2.0 }, new double[] { 1.0, 1.0 }, new double[] { 0.0 });
        try {
            optimizer.publicUpdateResidualsAndCost();
            Assert.fail("Expected FunctionEvaluationException due to dimension mismatch");
        } catch (FunctionEvaluationException e) {
            // Expected
        }
    }

    @Test
    public void testUpdateJacobian_normal() throws Exception {
        DummyOptimizer optimizer = new DummyOptimizer();
        double[][] factors = new double[][] {
            { 2.0, -1.0 },
            { 0.5, 3.0 }
        };
        DifferentiableMultivariateVectorialFunction function = new LinearProblemFunction(factors);

        double[] target = new double[] { 1.0, 1.0 };
        double[] weights = new double[] { 4.0, 9.0 }; // sqrt = 2.0, 3.0
        double[] startPoint = new double[] { 0.0, 0.0 };

        optimizer.optimize(function, target, weights, startPoint);
        optimizer.publicUpdateJacobian();

        Assert.assertEquals(1, optimizer.getJacobianEvaluations());
        double[][] jacobian = optimizer.getJacobianMatrix();
        // Row 0 factor = -sqrt(4) = -2.0 -> [2.0 * -2.0, -1.0 * -2.0] = [-4.0, 2.0]
        Assert.assertEquals(-4.0, jacobian[0][0], 1e-15);
        Assert.assertEquals(2.0, jacobian[0][1], 1e-15);
        // Row 1 factor = -sqrt(9) = -3.0 -> [0.5 * -3.0, 3.0 * -3.0] = [-1.5, -9.0]
        Assert.assertEquals(-1.5, jacobian[1][0], 1e-15);
        Assert.assertEquals(-9.0, jacobian[1][1], 1e-15);
    }

    @Test
    public void testUpdateJacobian_dimensionMismatch() throws Exception {
        DummyOptimizer optimizer = new DummyOptimizer();
        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            @Override
            public double[] value(double[] point) {
                return new double[] { 1.0, 2.0 };
            }

            @Override
            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    @Override
                    public double[][] value(double[] point) {
                        return new double[][] { { 1.0 } }; // Returns 1 row instead of 2
                    }
                };
            }
        };

        optimizer.optimize(function, new double[] { 1.0, 2.0 }, new double[] { 1.0, 1.0 }, new double[] { 0.0 });
        try {
            optimizer.publicUpdateJacobian();
            Assert.fail("Expected FunctionEvaluationException due to jacobian dimension mismatch");
        } catch (FunctionEvaluationException e) {
            // Expected
        }
    }

    @Test
    public void testGetRMS_and_GetChiSquare() throws Exception {
        DummyOptimizer optimizer = new DummyOptimizer();
        optimizer.setRowsCols(2, 1);
        optimizer.setResiduals(new double[] { 2.0, 4.0 });
        optimizer.setResidualsWeights(new double[] { 0.5, 2.0 });

        // RMS:
        // criterion = 2.0^2 * 0.5 + 4.0^2 * 2.0 = 4*0.5 + 16*2 = 2.0 + 32.0 = 34.0
        // RMS = sqrt(34.0 / 2) = sqrt(17.0)
        double expectedRMS = Math.sqrt(17.0);
        Assert.assertEquals(expectedRMS, optimizer.getRMS(), 1e-15);

        // ChiSquare:
        // chiSquare = 2.0^2 / 0.5 + 4.0^2 / 2.0 = 4 / 0.5 + 16 / 2 = 8.0 + 8.0 = 16.0
        double expectedChiSquare = 16.0;
        Assert.assertEquals(expectedChiSquare, optimizer.getChiSquare(), 1e-15);
    }

    @Test
    public void testGetCovariances_success() throws Exception {
        DummyOptimizer optimizer = new DummyOptimizer();
        double[][] factors = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 2.0 },
            { 1.0, 1.0 }
        };
        DifferentiableMultivariateVectorialFunction function = new LinearProblemFunction(factors);

        double[] target = new double[] { 1.0, 2.0, 3.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        optimizer.optimize(function, target, weights, startPoint);
        double[][] cov = optimizer.getCovariances();

        Assert.assertEquals(2, cov.length);
        Assert.assertEquals(2, cov[0].length);

        // J with weights = 1.0 is -factors:
        // J = [[-1, 0], [0, -2], [-1, -1]]
        // J^T * J = [[2, 1], [1, 5]]
        // det = 10 - 1 = 9
        // inv(J^T * J) = (1/9) * [[5, -1], [-1, 2]]
        Assert.assertEquals(5.0 / 9.0, cov[0][0], 1e-10);
        Assert.assertEquals(-1.0 / 9.0, cov[0][1], 1e-10);
        Assert.assertEquals(-1.0 / 9.0, cov[1][0], 1e-10);
        Assert.assertEquals(2.0 / 9.0, cov[1][1], 1e-10);
    }

    @Test
    public void testGetCovariances_singularProblem_throwsOptimizationException() throws Exception {
        DummyOptimizer optimizer = new DummyOptimizer();
        // Rank deficient factors (columns linearly dependent)
        double[][] factors = new double[][] {
            { 1.0, 2.0 },
            { 2.0, 4.0 }
        };
        DifferentiableMultivariateVectorialFunction function = new LinearProblemFunction(factors);

        double[] target = new double[] { 1.0, 2.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        optimizer.optimize(function, target, weights, startPoint);

        try {
            optimizer.getCovariances();
            Assert.fail("Expected OptimizationException for singular matrix");
        } catch (OptimizationException e) {
            // Expected
        }
    }

    @Test
    public void testGuessParametersErrors_noDegreesOfFreedom_throwsOptimizationException() throws Exception {
        DummyOptimizer optimizer = new DummyOptimizer();
        // 2 measurements, 2 parameters -> rows <= cols (2 <= 2)
        double[][] factors = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 1.0 }
        };
        DifferentiableMultivariateVectorialFunction function = new LinearProblemFunction(factors);

        double[] target = new double[] { 1.0, 2.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        optimizer.optimize(function, target, weights, startPoint);

        try {
            optimizer.guessParametersErrors();
            Assert.fail("Expected OptimizationException because rows <= cols");
        } catch (OptimizationException e) {
            // Expected
        }
    }

    @Test
    public void testGuessParametersErrors_success() throws Exception {
        DummyOptimizer optimizer = new DummyOptimizer();
        // 3 measurements, 2 parameters -> rows > cols (3 > 2)
        double[][] factors = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 2.0 },
            { 1.0, 1.0 }
        };
        DifferentiableMultivariateVectorialFunction function = new LinearProblemFunction(factors);

        double[] target = new double[] { 1.0, 2.0, 3.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        optimizer.optimize(function, target, weights, startPoint);
        optimizer.publicUpdateResidualsAndCost(); // updates residuals

        // residuals = [1.0 - 0, 2.0 - 0, 3.0 - 0] = [1.0, 2.0, 3.0]
        // chiSquare = 1^2/1 + 2^2/1 + 3^2/1 = 1 + 4 + 9 = 14.0
        // rows - cols = 3 - 2 = 1
        // c = sqrt(14.0 / 1) = sqrt(14.0)
        // cov[0][0] = 5/9, cov[1][1] = 2/9
        // errors[0] = sqrt(5/9) * sqrt(14) = sqrt(70/9)
        // errors[1] = sqrt(2/9) * sqrt(14) = sqrt(28/9)

        double[] errors = optimizer.guessParametersErrors();
        Assert.assertEquals(2, errors.length);
        Assert.assertEquals(Math.sqrt(70.0 / 9.0), errors[0], 1e-10);
        Assert.assertEquals(Math.sqrt(28.0 / 9.0), errors[1], 1e-10);
    }
}
