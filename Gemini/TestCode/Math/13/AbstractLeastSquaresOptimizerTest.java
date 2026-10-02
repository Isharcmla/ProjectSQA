package org.apache.commons.math3.optimization.general;

import org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.SimpleVectorValueChecker;
import org.apache.commons.math3.optimization.Target;
import org.apache.commons.math3.optimization.Weight;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest {

    private static class ConcreteLeastSquaresOptimizer extends AbstractLeastSquaresOptimizer {
        private boolean doOptimizeCalled = false;

        public ConcreteLeastSquaresOptimizer() {
            super();
        }

        public ConcreteLeastSquaresOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
            super(checker);
        }

        @Override
        protected PointVectorValuePair doOptimize() {
            doOptimizeCalled = true;
            updateResidualsAndCost();
            updateJacobian();
            return new PointVectorValuePair(point, objective);
        }

        // Expose protected fields & methods for direct assertions
        public void callSetUp() {
            super.setUp();
        }

        public void callUpdateJacobian() {
            super.updateJacobian();
        }

        public RealMatrix callComputeWeightedJacobian(double[] params) {
            return super.computeWeightedJacobian(params);
        }

        public void callUpdateResidualsAndCost() {
            super.updateResidualsAndCost();
        }

        public double callComputeCost(double[] residuals) {
            return super.computeCost(residuals);
        }

        public void callSetCost(double cost) {
            super.setCost(cost);
        }

        public double[] callComputeResiduals(double[] objectiveValue) {
            return super.computeResiduals(objectiveValue);
        }

        public double[][] getWeightedResidualJacobian() {
            return this.weightedResidualJacobian;
        }

        public double[] getWeightedResiduals() {
            return this.weightedResiduals;
        }

        public double[] getPoint() {
            return this.point;
        }

        public void setPoint(double[] point) {
            this.point = point;
        }

        public void setRowsCols(int r, int c) {
            this.rows = r;
            this.cols = c;
        }
    }

    private static class SimpleLinearProblem implements MultivariateDifferentiableVectorFunction, DifferentiableMultivariateVectorFunction {
        @Override
        public double[] value(double[] point) {
            return new double[] {
                2.0 * point[0] + point[1],
                3.0 * point[0] - point[1],
                point[0] + 4.0 * point[1]
            };
        }

        @Override
        public DerivativeStructure[] value(DerivativeStructure[] point) {
            return new DerivativeStructure[] {
                point[0].multiply(2.0).add(point[1]),
                point[0].multiply(3.0).subtract(point[1]),
                point[0].add(point[1].multiply(4.0))
            };
        }

        @Override
        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                @Override
                public double[][] value(double[] point) {
                    return new double[][] {
                        { 2.0, 1.0 },
                        { 3.0, -1.0 },
                        { 1.0, 4.0 }
                    };
                }
            };
        }
    }

    private static class MismatchedDimensionFunction implements MultivariateDifferentiableVectorFunction, DifferentiableMultivariateVectorFunction {
        @Override
        public double[] value(double[] point) {
            return new double[] { point[0] };
        }

        @Override
        public DerivativeStructure[] value(DerivativeStructure[] point) {
            return new DerivativeStructure[] { point[0] };
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
    }

    @Test
    public void testConstructors() {
        ConcreteLeastSquaresOptimizer opt1 = new ConcreteLeastSquaresOptimizer();
        Assert.assertNotNull(opt1);

        SimpleVectorValueChecker checker = new SimpleVectorValueChecker(1e-6, 1e-6);
        ConcreteLeastSquaresOptimizer opt2 = new ConcreteLeastSquaresOptimizer(checker);
        Assert.assertEquals(checker, opt2.getConvergenceChecker());
    }

    @Test
    public void testOptimizeWithDifferentiableMultivariateVectorFunction() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        SimpleLinearProblem problem = new SimpleLinearProblem();
        double[] target = new double[] { 5.0, 5.0, 9.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        PointVectorValuePair result = optimizer.optimize(100, (DifferentiableMultivariateVectorFunction) problem, target, weights, startPoint);

        Assert.assertTrue(optimizer.doOptimizeCalled);
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(startPoint, result.getPoint(), 1e-10);
        Assert.assertEquals(1, optimizer.getJacobianEvaluations());
    }

    @Test
    public void testOptimizeWithMultivariateDifferentiableVectorFunction() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        SimpleLinearProblem problem = new SimpleLinearProblem();
        double[] target = new double[] { 5.0, 5.0, 9.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 2.0, 1.0 };

        PointVectorValuePair result = optimizer.optimize(100, (MultivariateDifferentiableVectorFunction) problem, target, weights, startPoint);

        Assert.assertTrue(optimizer.doOptimizeCalled);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getPoint().length);
    }

    @Test
    public void testComputeWeightedJacobianAndUpdateJacobian() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        SimpleLinearProblem problem = new SimpleLinearProblem();
        double[] target = new double[] { 5.0, 5.0, 9.0 };
        double[] weights = new double[] { 1.0, 4.0, 1.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        optimizer.optimize(100, problem, target, weights, startPoint);

        RealMatrix wJ = optimizer.callComputeWeightedJacobian(startPoint);
        Assert.assertEquals(3, wJ.getRowDimension());
        Assert.assertEquals(2, wJ.getColumnDimension());
        // row 1 multiplied by sqrt(4) = 2 -> [6.0, -2.0]
        Assert.assertEquals(6.0, wJ.getEntry(1, 0), 1e-10);
        Assert.assertEquals(-2.0, wJ.getEntry(1, 1), 1e-10);

        optimizer.callUpdateJacobian();
        double[][] wrj = optimizer.getWeightedResidualJacobian();
        Assert.assertEquals(-6.0, wrj[1][0], 1e-10);
        Assert.assertEquals(2.0, wrj[1][1], 1e-10);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testComputeWeightedJacobian_DimensionMismatch() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        MismatchedDimensionFunction problem = new MismatchedDimensionFunction();
        double[] target = new double[] { 5.0, 5.0 }; // size 2, function returns size 1
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 1.0 };

        optimizer.optimizeInternal(100, problem, new Target(target), new Weight(weights), new InitialGuess(startPoint));
        optimizer.callComputeWeightedJacobian(startPoint);
    }

    @Test
    public void testCostResidualsAndRMS() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        SimpleLinearProblem problem = new SimpleLinearProblem();
        double[] target = new double[] { 3.0, 2.0, 5.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        optimizer.optimize(100, problem, target, weights, startPoint);

        optimizer.callUpdateResidualsAndCost();
        Assert.assertEquals(0.0, optimizer.getChiSquare(), 1e-10);
        Assert.assertEquals(0.0, optimizer.getRMS(), 1e-10);

        optimizer.callSetCost(3.0);
        Assert.assertEquals(9.0, optimizer.getChiSquare(), 1e-10);
        Assert.assertEquals(FastMath.sqrt(9.0 / 3.0), optimizer.getRMS(), 1e-10);

        double[] manualResiduals = new double[] { 1.0, 2.0, 3.0 };
        double computedCost = optimizer.callComputeCost(manualResiduals);
        Assert.assertEquals(FastMath.sqrt(1 + 4 + 9), computedCost, 1e-10);

        double[] res = optimizer.callComputeResiduals(new double[] { 1.0, 1.0, 1.0 });
        Assert.assertArrayEquals(new double[] { 2.0, 1.0, 4.0 }, res, 1e-10);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testComputeResiduals_DimensionMismatch() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        SimpleLinearProblem problem = new SimpleLinearProblem();
        double[] target = new double[] { 3.0, 2.0, 5.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        optimizer.optimize(100, problem, target, weights, startPoint);
        optimizer.callComputeResiduals(new double[] { 1.0, 2.0 });
    }

    @Test
    public void testGetWeightSquareRoot() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        SimpleLinearProblem problem = new SimpleLinearProblem();
        double[] target = new double[] { 3.0, 2.0, 5.0 };
        double[] weights = new double[] { 4.0, 9.0, 16.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        optimizer.optimize(100, problem, target, weights, startPoint);

        RealMatrix sqrtW = optimizer.getWeightSquareRoot();
        Assert.assertEquals(2.0, sqrtW.getEntry(0, 0), 1e-10);
        Assert.assertEquals(3.0, sqrtW.getEntry(1, 1), 1e-10);
        Assert.assertEquals(4.0, sqrtW.getEntry(2, 2), 1e-10);
    }

    @Test
    public void testCovariancesAndSigma() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        SimpleLinearProblem problem = new SimpleLinearProblem();
        double[] target = new double[] { 3.0, 2.0, 5.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        optimizer.optimize(100, problem, target, weights, startPoint);

        double[][] cov1 = optimizer.getCovariances();
        double[][] cov2 = optimizer.getCovariances(1e-12);
        double[][] cov3 = optimizer.computeCovariances(startPoint, 1e-12);

        Assert.assertEquals(2, cov1.length);
        Assert.assertEquals(cov1[0][0], cov2[0][0], 1e-10);
        Assert.assertEquals(cov2[0][0], cov3[0][0], 1e-10);

        double[] sigma = optimizer.computeSigma(startPoint, 1e-12);
        Assert.assertEquals(2, sigma.length);
        Assert.assertEquals(FastMath.sqrt(cov1[0][0]), sigma[0], 1e-10);
        Assert.assertEquals(FastMath.sqrt(cov1[1][1]), sigma[1], 1e-10);
    }

    @Test(expected = SingularMatrixException.class)
    public void testComputeCovariances_Singular() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        // Colinear rows / dependent variables resulting in singular J^T * J
        MultivariateDifferentiableVectorFunction singularProblem = new MultivariateDifferentiableVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return new double[] { point[0] + point[1], 2 * point[0] + 2 * point[1] };
            }

            @Override
            public DerivativeStructure[] value(DerivativeStructure[] point) {
                return new DerivativeStructure[] {
                    point[0].add(point[1]),
                    point[0].multiply(2.0).add(point[1].multiply(2.0))
                };
            }
        };

        optimizer.optimize(100, singularProblem, new double[] { 1.0, 2.0 }, new double[] { 1.0, 1.0 }, new double[] { 0.0, 0.0 });
        optimizer.computeCovariances(new double[] { 0.0, 0.0 }, 1e-14);
    }

    @Test
    public void testGuessParametersErrors_Valid() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        SimpleLinearProblem problem = new SimpleLinearProblem();
        double[] target = new double[] { 3.0, 2.0, 6.0 }; // non-zero residual
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        optimizer.optimize(100, problem, target, weights, startPoint);
        optimizer.callSetCost(2.0); // chi-square = 4.0, rows = 3, cols = 2, df = 1

        double[] errors = optimizer.guessParametersErrors();
        Assert.assertEquals(2, errors.length);
        Assert.assertTrue(errors[0] > 0);
        Assert.assertTrue(errors[1] > 0);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testGuessParametersErrors_NoDegreesOfFreedom() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        SimpleLinearProblem problem = new SimpleLinearProblem();
        double[] target = new double[] { 3.0, 2.0, 5.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        optimizer.optimize(100, problem, target, weights, startPoint);
        // Force rows <= cols
        optimizer.setRowsCols(2, 2);
        optimizer.guessParametersErrors();
    }
}
