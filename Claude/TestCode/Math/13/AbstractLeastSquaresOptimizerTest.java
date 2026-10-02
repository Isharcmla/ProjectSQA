package org.apache.commons.math3.optimization.general;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.OptimizationData;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.Target;
import org.apache.commons.math3.optimization.Weight;

public class AbstractLeastSquaresOptimizerTest {

    /** Simple concrete subclass used to test the abstract base class. */
    private static class TestOptimizer extends AbstractLeastSquaresOptimizer {
        TestOptimizer() {
            super();
        }

        TestOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
            super(checker);
        }

        @Override
        protected PointVectorValuePair doOptimize() {
            final double[] startPoint = getStartPoint();
            point = startPoint.clone();
            updateJacobian();
            updateResidualsAndCost();
            double[] value = computeObjectiveValue(point);
            return new PointVectorValuePair(point, value);
        }
    }

    /** 2 outputs, 2 parameters - identity model. */
    private static class LinearProblem implements DifferentiableMultivariateVectorFunction {
        public double[] value(double[] point) {
            double[] values = new double[point.length];
            for (int i = 0; i < point.length; i++) {
                values[i] = point[i];
            }
            return values;
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    double[][] jacobian = new double[point.length][point.length];
                    for (int i = 0; i < point.length; i++) {
                        jacobian[i][i] = 1.0;
                    }
                    return jacobian;
                }
            };
        }
    }

    /** 3 outputs, 2 parameters - overdetermined linear model. */
    private static class LinearProblem2 implements DifferentiableMultivariateVectorFunction {
        public double[] value(double[] point) {
            return new double[] {
                point[0],
                point[1],
                point[0] + point[1]
            };
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][] {
                        {1.0, 0.0},
                        {0.0, 1.0},
                        {1.0, 1.0}
                    };
                }
            };
        }
    }

    /** MultivariateDifferentiableVectorFunction version of the identity model. */
    private static class LinearDSProblem implements MultivariateDifferentiableVectorFunction {
        public double[] value(double[] point) {
            return point.clone();
        }

        public DerivativeStructure[] value(DerivativeStructure[] point) {
            DerivativeStructure[] value = new DerivativeStructure[point.length];
            for (int i = 0; i < point.length; i++) {
                value[i] = point[i];
            }
            return value;
        }
    }

    private TestOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new TestOptimizer();
    }

    @Test
    public void testGetJacobianEvaluations_InitialState_ReturnsZero() {
        assertEquals(0, optimizer.getJacobianEvaluations());
    }

    @Test
    public void testOptimize_SimpleLinearProblem_ReturnsCorrectPoint() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        PointVectorValuePair result = optimizer.optimize(100, new LinearProblem(),
                                                          target, weights, startPoint);

        assertNotNull(result);
        assertArrayEquals(target, result.getPoint(), 1e-9);
        assertArrayEquals(target, result.getValue(), 1e-9);
    }

    @Test
    public void testGetJacobianEvaluations_AfterOptimize_IncreasesCount() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        assertTrue(optimizer.getJacobianEvaluations() > 0);
    }

    @Test
    public void testGetRMS_AfterOptimize_ReturnsZeroForExactFit() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {1.0, 2.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        assertEquals(0.0, optimizer.getRMS(), 1e-9);
    }

    @Test
    public void testGetChiSquare_AfterOptimize_ReturnsNonNegativeValue() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        assertTrue(optimizer.getChiSquare() >= 0.0);
    }

    @Test
    public void testGetWeightSquareRoot_ReturnsCorrectDiagonalMatrix() {
        double[] target = {1.0, 2.0};
        double[] weights = {4.0, 9.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        RealMatrix sqrtWeight = optimizer.getWeightSquareRoot();
        assertNotNull(sqrtWeight);
        assertEquals(2, sqrtWeight.getRowDimension());
        assertEquals(2, sqrtWeight.getColumnDimension());
        assertEquals(2.0, sqrtWeight.getEntry(0, 0), 1e-9);
        assertEquals(3.0, sqrtWeight.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testGetCovariances_NoThreshold_ReturnsMatrix() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        double[][] covar = optimizer.getCovariances();
        assertNotNull(covar);
        assertEquals(2, covar.length);
        assertEquals(2, covar[0].length);
    }

    @Test
    public void testGetCovariances_WithThreshold_ReturnsMatrix() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        double[][] covar = optimizer.getCovariances(1e-10);
        assertNotNull(covar);
        assertEquals(2, covar.length);
    }

    @Test
    public void testComputeCovariances_ValidInput_ReturnsMatrix() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        double[][] covar = optimizer.computeCovariances(new double[] {1.0, 2.0}, 1e-14);
        assertNotNull(covar);
        assertEquals(2, covar.length);
        assertEquals(2, covar[0].length);
    }

    @Test
    public void testComputeSigma_ValidInput_ReturnsArray() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        double[] sigma = optimizer.computeSigma(new double[] {1.0, 2.0}, 1e-14);
        assertNotNull(sigma);
        assertEquals(2, sigma.length);
        for (double s : sigma) {
            assertTrue(s >= 0.0);
        }
    }

    @Test
    public void testGuessParametersErrors_RowsGreaterThanCols_ReturnsErrors() {
        double[] target = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] startPoint = {0.5, 0.5};

        optimizer.optimize(1000, new LinearProblem2(), target, weights, startPoint);

        double[] errors = optimizer.guessParametersErrors();
        assertNotNull(errors);
        assertEquals(2, errors.length);
        for (double e : errors) {
            assertFalse(Double.isNaN(e));
        }
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testGuessParametersErrors_RowsLessOrEqualCols_ThrowsException() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        optimizer.guessParametersErrors();
    }

    @Test
    public void testOptimize_MultivariateDifferentiableVectorFunctionOverload_ReturnsCorrectPoint() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        PointVectorValuePair result = optimizer.optimize(100, new LinearDSProblem(),
                                                          target, weights, startPoint);

        assertNotNull(result);
        assertArrayEquals(target, result.getPoint(), 1e-9);
    }

    @Test
    public void testOptimizeInternal_WithOptimizationData_ReturnsCorrectPoint() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        OptimizationData[] optData = new OptimizationData[] {
            new Target(target),
            new Weight(weights),
            new InitialGuess(startPoint)
        };

        PointVectorValuePair result = optimizer.optimizeInternal(100, new LinearDSProblem(), optData);

        assertNotNull(result);
        assertArrayEquals(target, result.getPoint(), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_DimensionMismatch_ThrowsException() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);
    }

    @Test
    public void testComputeCost_ValidResiduals_ReturnsNonNegativeValue() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        double cost = optimizer.computeCost(new double[] {1.0, 1.0});
        assertTrue(cost >= 0.0);
    }

    @Test
    public void testComputeResiduals_ValidInput_ReturnsCorrectResiduals() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        double[] residuals = optimizer.computeResiduals(new double[] {0.5, 1.5});
        assertArrayEquals(new double[] {0.5, 0.5}, residuals, 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testComputeResiduals_WrongLength_ThrowsException() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        optimizer.computeResiduals(new double[] {0.5});
    }

    @Test
    public void testComputeWeightedJacobian_ValidInput_ReturnsMatrixOfCorrectDimensions() {
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, new LinearProblem(), target, weights, startPoint);

        RealMatrix jacobian = optimizer.computeWeightedJacobian(new double[] {1.0, 2.0});
        assertNotNull(jacobian);
        assertEquals(2, jacobian.getRowDimension());
        assertEquals(2, jacobian.getColumnDimension());
    }

    @Test
    public void testSetCost_ValidValue_UpdatesChiSquare() {
        optimizer.setCost(5.0);
        assertEquals(25.0, optimizer.getChiSquare(), 1e-9);
    }

    @Test
    public void testConstructor_WithConvergenceChecker_CreatesInstance() {
        TestOptimizer withChecker = new TestOptimizer(null);
        assertNotNull(withChecker);
        assertEquals(0, withChecker.getJacobianEvaluations());
    }

    @Test
    public void testOptimize_OverdeterminedProblem_ReturnsReasonableFit() {
        double[] target = {1.0, 2.0, 3.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] startPoint = {0.5, 0.5};

        PointVectorValuePair result = optimizer.optimize(1000, new LinearProblem2(),
                                                          target, weights, startPoint);

        assertNotNull(result);
        assertEquals(2, result.getPoint().length);
        assertEquals(3, result.getValue().length);
    }
}
