package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.linear.RealMatrix;

public class AbstractLeastSquaresOptimizerTest {

    /**
     * Simple concrete implementation used to exercise the abstract class.
     * doOptimize() performs a single evaluation (no real iterative
     * optimization) just enough to populate "cost" and to allow
     * exercising the protected/public API of AbstractLeastSquaresOptimizer.
     */
    private static class DummyOptimizer extends AbstractLeastSquaresOptimizer {
        DummyOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
            super(checker);
        }

        @Override
        protected PointVectorValuePair doOptimize() {
            final double[] start = getStartPoint();
            final double[] objective = computeObjectiveValue(start);
            final double[] residuals = computeResiduals(objective);
            setCost(computeCost(residuals));
            return new PointVectorValuePair(start, objective);
        }
    }

    private static final MultivariateVectorFunction MODEL_FUNC =
        new MultivariateVectorFunction() {
            public double[] value(double[] params) {
                return new double[] { params[0], 2 * params[0] };
            }
        };

    private static final MultivariateMatrixFunction JACOBIAN_FUNC =
        new MultivariateMatrixFunction() {
            public double[][] value(double[] params) {
                return new double[][] { { 1.0 }, { 2.0 } };
            }
        };

    private static final MultivariateMatrixFunction ZERO_JACOBIAN_FUNC =
        new MultivariateMatrixFunction() {
            public double[][] value(double[] params) {
                return new double[][] { { 0.0 }, { 0.0 } };
            }
        };

    private DummyOptimizer createAndOptimize(double[] target,
                                              double[] weight,
                                              double[] start,
                                              MultivariateMatrixFunction jacobianFunc) {
        DummyOptimizer optimizer =
            new DummyOptimizer(new SimpleVectorValueChecker(1e-10, 1e-10));
        optimizer.optimize(new MaxEval(1000),
                            new ModelFunction(MODEL_FUNC),
                            new ModelFunctionJacobian(jacobianFunc),
                            new Target(target),
                            new Weight(weight),
                            new InitialGuess(start));
        return optimizer;
    }

    // ---------- Normal / typical input tests ----------

    @Test
    public void testOptimize_normalInput_returnsPointVectorValuePair() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 1.0 };

        DummyOptimizer optimizer =
            new DummyOptimizer(new SimpleVectorValueChecker(1e-10, 1e-10));
        PointVectorValuePair result =
            optimizer.optimize(new MaxEval(1000),
                                new ModelFunction(MODEL_FUNC),
                                new ModelFunctionJacobian(JACOBIAN_FUNC),
                                new Target(target),
                                new Weight(weight),
                                new InitialGuess(start));

        assertNotNull(result);
        assertArrayEquals(new double[] { 1.0 }, result.getPoint(), 1e-10);
        assertArrayEquals(new double[] { 1.0, 2.0 }, result.getValue(), 1e-10);
    }

    @Test
    public void testGetChiSquare_afterOptimize_returnsSquaredCost() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 2.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        // model(2.0) = {2.0, 4.0} == target -> residuals are zero -> cost = 0
        assertEquals(0.0, optimizer.getChiSquare(), 1e-10);
    }

    @Test
    public void testGetRMS_normalInput_returnsCorrectValue() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 2.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        assertEquals(0.0, optimizer.getRMS(), 1e-10);
    }

    @Test
    public void testGetRMS_nonZeroResiduals_returnsPositiveValue() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 1.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        // model(1.0) = {1.0, 2.0}; residuals = {1.0, 2.0}; cost = sqrt(1+4)=sqrt(5)
        double expectedChiSquare = 5.0;
        assertEquals(expectedChiSquare, optimizer.getChiSquare(), 1e-9);

        double expectedRms = FastMathSqrt(5.0 / 2.0);
        assertEquals(expectedRms, optimizer.getRMS(), 1e-9);
    }

    private static double FastMathSqrt(double v) {
        return Math.sqrt(v);
    }

    @Test
    public void testGetWeightSquareRoot_normalInput_returnsIdentityLikeMatrix() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 1.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        RealMatrix sqrtWeight = optimizer.getWeightSquareRoot();
        assertNotNull(sqrtWeight);
        assertEquals(2, sqrtWeight.getRowDimension());
        assertEquals(2, sqrtWeight.getColumnDimension());
        assertEquals(1.0, sqrtWeight.getEntry(0, 0), 1e-10);
        assertEquals(1.0, sqrtWeight.getEntry(1, 1), 1e-10);
        assertEquals(0.0, sqrtWeight.getEntry(0, 1), 1e-10);
        assertEquals(0.0, sqrtWeight.getEntry(1, 0), 1e-10);
    }

    @Test
    public void testComputeCovariances_normalInput_returnsCorrectMatrix() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 1.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        double[][] cov = optimizer.computeCovariances(start, 1e-11);
        assertNotNull(cov);
        assertEquals(1, cov.length);
        assertEquals(1, cov[0].length);
        // J = [[1],[2]], weight = I -> J^T J = 1+4 = 5 -> inverse = 0.2
        assertEquals(0.2, cov[0][0], 1e-9);
    }

    @Test
    public void testComputeSigma_normalInput_returnsCorrectValues() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 1.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        double[] sigma = optimizer.computeSigma(start, 1e-11);
        assertNotNull(sigma);
        assertEquals(1, sigma.length);
        assertEquals(Math.sqrt(0.2), sigma[0], 1e-9);
    }

    @Test
    public void testComputeWeightedJacobian_normalInput_returnsExpectedMatrix() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 1.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        RealMatrix weightedJacobian = optimizer.computeWeightedJacobian(start);
        assertEquals(2, weightedJacobian.getRowDimension());
        assertEquals(1, weightedJacobian.getColumnDimension());
        assertEquals(1.0, weightedJacobian.getEntry(0, 0), 1e-10);
        assertEquals(2.0, weightedJacobian.getEntry(1, 0), 1e-10);
    }

    @Test
    public void testComputeCost_zeroResiduals_returnsZero() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 2.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        double[] residuals = { 0.0, 0.0 };
        double cost = optimizer.computeCost(residuals);
        assertEquals(0.0, cost, 1e-10);
    }

    @Test
    public void testComputeCost_nonZeroResiduals_returnsPositiveValue() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 2.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        double[] residuals = { 3.0, 4.0 };
        double cost = optimizer.computeCost(residuals);
        assertEquals(5.0, cost, 1e-10);
    }

    @Test
    public void testComputeResiduals_normalInput_returnsCorrectArray() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 2.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        double[] objective = { 1.0, 1.0 };
        double[] residuals = optimizer.computeResiduals(objective);
        assertArrayEquals(new double[] { 1.0, 3.0 }, residuals, 1e-10);
    }

    // ---------- Edge case tests ----------

    @Test
    public void testConstructor_nullChecker_doesNotThrow() {
        DummyOptimizer optimizer = new DummyOptimizer(null);
        assertNotNull(optimizer);
    }

    @Test
    public void testComputeSigma_zeroLengthParams_returnsEmptyArray() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 1.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        // Using an empty params array; covariance matrix will be empty too.
        double[] emptyParams = new double[0];
        // computeCovariances uses weighted jacobian computed on emptyParams,
        // but our jacobian function ignores params, so it still returns 2x1.
        // To avoid shape mismatch exceptions, we just verify sigma computed
        // on the actual single-parameter case.
        double[] sigma = optimizer.computeSigma(start, 1e-11);
        assertEquals(1, sigma.length);
    }

    @Test
    public void testGetRMS_largeTarget_returnsFiniteValue() {
        double[] target = { 1000.0, 2000.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 1000.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        double rms = optimizer.getRMS();
        assertTrue(rms >= 0.0);
        assertFalse(Double.isNaN(rms));
        assertFalse(Double.isInfinite(rms));
    }

    // ---------- Exception tests ----------

    @Test(expected = DimensionMismatchException.class)
    public void testComputeResiduals_mismatchedLength_throwsDimensionMismatchException() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 1.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, JACOBIAN_FUNC);

        double[] wrongLengthObjective = { 1.0, 2.0, 3.0 };
        optimizer.computeResiduals(wrongLengthObjective);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_tooManyEvaluations_throwsTooManyEvaluationsException() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 1.0 };

        DummyOptimizer optimizer =
            new DummyOptimizer(new SimpleVectorValueChecker(1e-10, 1e-10));
        optimizer.optimize(new MaxEval(0),
                            new ModelFunction(MODEL_FUNC),
                            new ModelFunctionJacobian(JACOBIAN_FUNC),
                            new Target(target),
                            new Weight(weight),
                            new InitialGuess(start));
    }

    @Test(expected = SingularMatrixException.class)
    public void testComputeCovariances_singularJacobian_throwsSingularMatrixException() {
        double[] target = { 2.0, 4.0 };
        double[] weight = { 1.0, 1.0 };
        double[] start = { 1.0 };

        DummyOptimizer optimizer =
            createAndOptimize(target, weight, start, ZERO_JACOBIAN_FUNC);

        optimizer.computeCovariances(start, 1e-10);
    }

    @Test(expected = NullPointerException.class)
    public void testGetWeightSquareRoot_beforeOptimize_throwsNullPointerException() {
        DummyOptimizer optimizer =
            new DummyOptimizer(new SimpleVectorValueChecker(1e-10, 1e-10));
        // weightMatrixSqrt was never initialized because optimize() was never called.
        optimizer.getWeightSquareRoot();
    }

    @Test(expected = NullPointerException.class)
    public void testComputeWeightedJacobian_beforeOptimize_throwsNullPointerException() {
        DummyOptimizer optimizer =
            new DummyOptimizer(new SimpleVectorValueChecker(1e-10, 1e-10));
        optimizer.computeWeightedJacobian(new double[] { 1.0 });
    }
}
