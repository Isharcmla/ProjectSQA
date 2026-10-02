package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest {

    private static final double EPSILON = 1e-10;

    private static class ConcreteLeastSquaresOptimizer extends AbstractLeastSquaresOptimizer {

        ConcreteLeastSquaresOptimizer() {
            super(null);
        }

        ConcreteLeastSquaresOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
            super(checker);
        }

        @Override
        protected PointVectorValuePair doOptimize() {
            double[] params = getStartPoint();
            if (params == null) {
                params = new double[getTargetSize()];
            }
            double[] objective = computeObjectiveValue(params);
            double[] residuals = computeResiduals(objective);
            setCost(computeCost(residuals));
            return new PointVectorValuePair(params, objective);
        }

        public RealMatrix testComputeWeightedJacobian(double[] params) {
            return computeWeightedJacobian(params);
        }

        public double testComputeCost(double[] residuals) {
            return computeCost(residuals);
        }

        public double[] testComputeResiduals(double[] objectiveValue) {
            return computeResiduals(objectiveValue);
        }

        public void testSetCost(double cost) {
            setCost(cost);
        }
    }

    @Test
    public void testGetChiSquareAndGetRMS_validCost_correctValues() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{1.0, 2.0, 3.0, 4.0}),
            new Weight(new double[]{1.0, 1.0, 1.0, 1.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return new double[]{0.0, 0.0, 0.0, 0.0};
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{
                        {1.0, 0.0, 0.0, 0.0},
                        {0.0, 1.0, 0.0, 0.0},
                        {0.0, 0.0, 1.0, 0.0},
                        {0.0, 0.0, 0.0, 1.0}
                    };
                }
            }),
            new InitialGuess(new double[]{0.0, 0.0, 0.0, 0.0}),
            new MaxEval(100)
        );

        optimizer.testSetCost(6.0);
        Assert.assertEquals(36.0, optimizer.getChiSquare(), EPSILON);
        Assert.assertEquals(3.0, optimizer.getRMS(), EPSILON);
    }

    @Test
    public void testGetChiSquareAndGetRMS_zeroCost_returnsZero() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{1.0, 2.0}),
            new Weight(new double[]{1.0, 1.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return point;
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{{1.0, 0.0}, {0.0, 1.0}};
                }
            }),
            new InitialGuess(new double[]{1.0, 2.0}),
            new MaxEval(100)
        );

        optimizer.testSetCost(0.0);
        Assert.assertEquals(0.0, optimizer.getChiSquare(), EPSILON);
        Assert.assertEquals(0.0, optimizer.getRMS(), EPSILON);
    }

    @Test
    public void testComputeResiduals_matchingLength_returnsCorrectResiduals() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{10.0, 20.0, 30.0}),
            new Weight(new double[]{1.0, 1.0, 1.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return point;
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
                }
            }),
            new InitialGuess(new double[]{0.0, 0.0, 0.0}),
            new MaxEval(100)
        );

        double[] objectiveValue = new double[]{8.0, 25.0, 30.0};
        double[] residuals = optimizer.testComputeResiduals(objectiveValue);
        Assert.assertEquals(3, residuals.length);
        Assert.assertEquals(2.0, residuals[0], EPSILON);
        Assert.assertEquals(-5.0, residuals[1], EPSILON);
        Assert.assertEquals(0.0, residuals[2], EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testComputeResiduals_dimensionMismatch_throwsException() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{1.0, 2.0, 3.0}),
            new Weight(new double[]{1.0, 1.0, 1.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return point;
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
                }
            }),
            new InitialGuess(new double[]{0.0, 0.0, 0.0}),
            new MaxEval(100)
        );

        optimizer.testComputeResiduals(new double[]{1.0, 2.0});
    }

    @Test
    public void testComputeCost_weightedResiduals_returnsCorrectCost() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{0.0, 0.0}),
            new Weight(new DiagonalMatrix(new double[]{2.0, 3.0})),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return point;
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{{1.0, 0.0}, {0.0, 1.0}};
                }
            }),
            new InitialGuess(new double[]{0.0, 0.0}),
            new MaxEval(100)
        );

        double[] residuals = new double[]{2.0, 1.0};
        double expectedCost = FastMath.sqrt(2.0 * (2.0 * 2.0) + 3.0 * (1.0 * 1.0));
        double actualCost = optimizer.testComputeCost(residuals);
        Assert.assertEquals(expectedCost, actualCost, EPSILON);
    }

    @Test
    public void testComputeWeightedJacobian_validInput_returnsWeightedJacobian() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{0.0, 0.0}),
            new Weight(new DiagonalMatrix(new double[]{4.0, 9.0})),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return point;
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{
                        {1.0, 2.0},
                        {3.0, 4.0}
                    };
                }
            }),
            new InitialGuess(new double[]{0.0, 0.0}),
            new MaxEval(100)
        );

        RealMatrix weightedJacobian = optimizer.testComputeWeightedJacobian(new double[]{0.0, 0.0});
        Assert.assertEquals(2.0, weightedJacobian.getEntry(0, 0), EPSILON);
        Assert.assertEquals(4.0, weightedJacobian.getEntry(0, 1), EPSILON);
        Assert.assertEquals(9.0, weightedJacobian.getEntry(1, 0), EPSILON);
        Assert.assertEquals(12.0, weightedJacobian.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testGetWeightSquareRoot_returnsCopy() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{0.0, 0.0}),
            new Weight(new DiagonalMatrix(new double[]{4.0, 16.0})),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return point;
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{{1.0, 0.0}, {0.0, 1.0}};
                }
            }),
            new InitialGuess(new double[]{0.0, 0.0}),
            new MaxEval(100)
        );

        RealMatrix sqrtWeight = optimizer.getWeightSquareRoot();
        Assert.assertEquals(2.0, sqrtWeight.getEntry(0, 0), EPSILON);
        Assert.assertEquals(4.0, sqrtWeight.getEntry(1, 1), EPSILON);

        sqrtWeight.setEntry(0, 0, 99.0);
        RealMatrix sqrtWeightSecond = optimizer.getWeightSquareRoot();
        Assert.assertEquals(2.0, sqrtWeightSecond.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testComputeCovariances_nonSingular_returnsCorrectCovariances() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{0.0, 0.0}),
            new Weight(new DiagonalMatrix(new double[]{1.0, 1.0})),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return point;
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{
                        {2.0, 0.0},
                        {0.0, 3.0}
                    };
                }
            }),
            new InitialGuess(new double[]{0.0, 0.0}),
            new MaxEval(100)
        );

        double[][] covariances = optimizer.computeCovariances(new double[]{0.0, 0.0}, 1e-14);
        Assert.assertEquals(0.25, covariances[0][0], EPSILON);
        Assert.assertEquals(0.0, covariances[0][1], EPSILON);
        Assert.assertEquals(0.0, covariances[1][0], EPSILON);
        Assert.assertEquals(1.0 / 9.0, covariances[1][1], EPSILON);
    }

    @Test(expected = SingularMatrixException.class)
    public void testComputeCovariances_singular_throwsSingularMatrixException() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{0.0, 0.0}),
            new Weight(new DiagonalMatrix(new double[]{1.0, 1.0})),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return point;
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{
                        {0.0, 0.0},
                        {0.0, 0.0}
                    };
                }
            }),
            new InitialGuess(new double[]{0.0, 0.0}),
            new MaxEval(100)
        );

        optimizer.computeCovariances(new double[]{0.0, 0.0}, 1e-10);
    }

    @Test
    public void testComputeSigma_validCovariance_returnsSquareRootOfDiagonal() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{0.0, 0.0}),
            new Weight(new DiagonalMatrix(new double[]{1.0, 1.0})),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return point;
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{
                        {2.0, 0.0},
                        {0.0, 4.0}
                    };
                }
            }),
            new InitialGuess(new double[]{0.0, 0.0}),
            new MaxEval(100)
        );

        double[] sigma = optimizer.computeSigma(new double[]{0.0, 0.0}, 1e-14);
        Assert.assertEquals(0.5, sigma[0], EPSILON);
        Assert.assertEquals(0.25, sigma[1], EPSILON);
    }

    @Test
    public void testOptimize_withCheckerAndWeight_optimizesSuccessfully() {
        ConvergenceChecker<PointVectorValuePair> checker = new SimpleVectorValueChecker(1e-6, 1e-6);
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer(checker);

        PointVectorValuePair result = optimizer.optimize(
            new MaxEval(100),
            new Target(new double[]{1.0, 2.0}),
            new Weight(new Array2DRowRealMatrix(new double[][]{{1.0, 0.0}, {0.0, 1.0}})),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return new double[]{point[0] * 2.0, point[1] * 2.0};
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{{2.0, 0.0}, {0.0, 2.0}};
                }
            }),
            new InitialGuess(new double[]{0.5, 1.0})
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(0.5, result.getPoint()[0], EPSILON);
        Assert.assertEquals(1.0, result.getPoint()[1], EPSILON);
    }

    @Test
    public void testOptimize_withoutWeightData_reusesOrSkipsWeightParsing() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{1.0, 2.0}),
            new Weight(new double[]{1.0, 1.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return point;
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{{1.0, 0.0}, {0.0, 1.0}};
                }
            }),
            new InitialGuess(new double[]{1.0, 2.0}),
            new MaxEval(100)
        );

        PointVectorValuePair result = optimizer.optimize(new MaxEval(50));
        Assert.assertNotNull(result);
        Assert.assertEquals(1.0, result.getPoint()[0], EPSILON);
        Assert.assertEquals(2.0, result.getPoint()[1], EPSILON);
    }

    @Test
    public void testOptimize_multipleOptimizationDataWithoutWeight_handlesCorrectly() {
        ConcreteLeastSquaresOptimizer optimizer = new ConcreteLeastSquaresOptimizer();
        optimizer.optimize(
            new Target(new double[]{3.0}),
            new Weight(new double[]{1.0}),
            new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    return point;
                }
            }),
            new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][]{{1.0}};
                }
            }),
            new InitialGuess(new double[]{3.0}),
            new MaxEval(100)
        );

        OptimizationData[] extraData = new OptimizationData[]{
            new MaxEval(200),
            new InitialGuess(new double[]{3.0})
        };
        PointVectorValuePair result = optimizer.optimize(extraData);
        Assert.assertNotNull(result);
    }
}
