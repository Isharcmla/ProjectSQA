package org.apache.commons.math.estimation;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit4 test suite for {@link AbstractEstimator}.
 * <p>Since AbstractEstimator is abstract, a minimal concrete subclass
 * {@code TestEstimator} is used to exercise its protected/public API.
 * Helper implementations of {@code WeightedMeasurement} and
 * {@code EstimationProblem} are created locally based on the public
 * contracts described by the Apache Commons Math 1.2
 * org.apache.commons.math.estimation package.</p>
 */
public class AbstractEstimatorTest {

    /** Simple linear measurement: y = a*x + b. */
    private static class LinearMeasurement extends WeightedMeasurement {

        private final double x;
        private final EstimatedParameter a;
        private final EstimatedParameter b;

        LinearMeasurement(double weight, double measuredValue, double x,
                           EstimatedParameter a, EstimatedParameter b) {
            super(weight, measuredValue);
            this.x = x;
            this.a = a;
            this.b = b;
        }

        public double getTheoreticalValue() {
            return a.getEstimate() * x + b.getEstimate();
        }

        public double getPartial(EstimatedParameter p) {
            if (p == a) {
                return x;
            }
            if (p == b) {
                return 1.0;
            }
            return 0.0;
        }
    }

    /** Measurement whose partial derivatives are always zero (used to force a singular matrix). */
    private static class ZeroPartialMeasurement extends WeightedMeasurement {

        ZeroPartialMeasurement(double weight, double measuredValue) {
            super(weight, measuredValue);
        }

        public double getTheoreticalValue() {
            return 0.0;
        }

        public double getPartial(EstimatedParameter p) {
            return 0.0;
        }
    }

    /** Minimal EstimationProblem implementation. */
    private static class SimpleProblem implements EstimationProblem {

        private final WeightedMeasurement[] measurements;
        private final EstimatedParameter[] allParameters;
        private final EstimatedParameter[] unboundParameters;

        SimpleProblem(WeightedMeasurement[] measurements,
                      EstimatedParameter[] allParameters,
                      EstimatedParameter[] unboundParameters) {
            this.measurements = measurements;
            this.allParameters = allParameters;
            this.unboundParameters = unboundParameters;
        }

        public WeightedMeasurement[] getMeasurements() {
            return measurements;
        }

        public EstimatedParameter[] getAllParameters() {
            return allParameters;
        }

        public EstimatedParameter[] getUnboundParameters() {
            return unboundParameters;
        }
    }

    /** Concrete estimator used purely for testing the abstract base class. */
    private static class TestEstimator extends AbstractEstimator {

        public void estimate(EstimationProblem problem) throws EstimationException {
            initializeEstimate(problem);
            updateJacobian();
            updateResidualsAndCost();
        }

        void init(EstimationProblem problem) {
            initializeEstimate(problem);
        }
    }

    private EstimatedParameter paramA;
    private EstimatedParameter paramB;
    private SimpleProblem exactProblem;

    @Before
    public void setUp() {
        paramA = new EstimatedParameter("a", 2.0);
        paramB = new EstimatedParameter("b", 3.0);

        double[] xs = {1, 2, 3, 4, 5};
        WeightedMeasurement[] measurements = new WeightedMeasurement[xs.length];
        for (int i = 0; i < xs.length; i++) {
            double y = 2.0 * xs[i] + 3.0; // exact fit -> residual = 0
            measurements[i] = new LinearMeasurement(1.0, y, xs[i], paramA, paramB);
        }
        EstimatedParameter[] all = new EstimatedParameter[] { paramA, paramB };
        exactProblem = new SimpleProblem(measurements, all, all);
    }

    // ---------------------------------------------------------------
    // Normal / typical cases
    // ---------------------------------------------------------------

    @Test
    public void testGetCostEvaluations_initialValue_isZero() {
        TestEstimator estimator = new TestEstimator();
        assertEquals(0, estimator.getCostEvaluations());
    }

    @Test
    public void testGetJacobianEvaluations_initialValue_isZero() {
        TestEstimator estimator = new TestEstimator();
        assertEquals(0, estimator.getJacobianEvaluations());
    }

    @Test
    public void testSetMaxCostEval_normalInput_allowsEstimation() throws EstimationException {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(10);
        estimator.estimate(exactProblem);
        assertEquals(1, estimator.getCostEvaluations());
        assertEquals(1, estimator.getJacobianEvaluations());
    }

    @Test
    public void testEstimate_normalLinearProblem_zeroResidualsAndCost() throws EstimationException {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(10);
        estimator.estimate(exactProblem);
        assertEquals(0.0, estimator.cost, 1e-9);
    }

    @Test
    public void testGetRMS_exactFitProblem_returnsZero() {
        TestEstimator estimator = new TestEstimator();
        double rms = estimator.getRMS(exactProblem);
        assertEquals(0.0, rms, 1e-9);
    }

    @Test
    public void testGetRMS_problemWithResidual_returnsExpectedValue() {
        double[] xs = {1, 2, 3};
        WeightedMeasurement[] measurements = new WeightedMeasurement[xs.length];
        for (int i = 0; i < xs.length; i++) {
            double y = 2.0 * xs[i] + 3.0 + 1.0; // residual of 1 for each measurement
            measurements[i] = new LinearMeasurement(1.0, y, xs[i], paramA, paramB);
        }
        EstimatedParameter[] all = new EstimatedParameter[] { paramA, paramB };
        SimpleProblem problem = new SimpleProblem(measurements, all, all);

        TestEstimator estimator = new TestEstimator();
        double rms = estimator.getRMS(problem);
        assertEquals(1.0, rms, 1e-9);
    }

    @Test
    public void testGetChiSquare_exactFitProblem_returnsZero() {
        TestEstimator estimator = new TestEstimator();
        double chiSquare = estimator.getChiSquare(exactProblem);
        assertEquals(0.0, chiSquare, 1e-9);
    }

    @Test
    public void testGetChiSquare_problemWithResidual_returnsExpectedValue() {
        double[] xs = {1, 2, 3};
        WeightedMeasurement[] measurements = new WeightedMeasurement[xs.length];
        for (int i = 0; i < xs.length; i++) {
            double y = 2.0 * xs[i] + 3.0 + 2.0; // residual of 2 for each measurement
            measurements[i] = new LinearMeasurement(1.0, y, xs[i], paramA, paramB);
        }
        EstimatedParameter[] all = new EstimatedParameter[] { paramA, paramB };
        SimpleProblem problem = new SimpleProblem(measurements, all, all);

        TestEstimator estimator = new TestEstimator();
        double chiSquare = estimator.getChiSquare(problem);
        // residual=2, weight=1 -> term = 4 each, 3 measurements -> 12
        assertEquals(12.0, chiSquare, 1e-9);
    }

    @Test
    public void testGetCovariances_normalProblem_returnsMatrix() throws EstimationException {
        TestEstimator estimator = new TestEstimator();
        estimator.init(exactProblem);
        double[][] covariances = estimator.getCovariances(exactProblem);
        assertNotNull(covariances);
        assertEquals(2, covariances.length);
        assertEquals(2, covariances[0].length);
    }

    @Test
    public void testGuessParametersErrors_normalProblem_returnsErrorsArray() throws EstimationException {
        TestEstimator estimator = new TestEstimator();
        estimator.init(exactProblem);
        double[] errors = estimator.guessParametersErrors(exactProblem);
        assertEquals(2, errors.length);
    }

    @Test
    public void testMultipleEstimations_incrementCountersEachTime() throws EstimationException {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(10);
        estimator.estimate(exactProblem);
        estimator.estimate(exactProblem);
        assertEquals(2, estimator.getJacobianEvaluations());
        assertEquals(2, estimator.getCostEvaluations());
    }

    // ---------------------------------------------------------------
    // Edge cases: zero / boundary values
    // ---------------------------------------------------------------

    @Test
    public void testGetRMS_zeroMeasurements_returnsNaN() {
        EstimatedParameter[] all = new EstimatedParameter[] { paramA, paramB };
        SimpleProblem problem = new SimpleProblem(new WeightedMeasurement[0], all, all);

        TestEstimator estimator = new TestEstimator();
        double rms = estimator.getRMS(problem);
        assertTrue(Double.isNaN(rms));
    }

    @Test
    public void testGetChiSquare_zeroMeasurements_returnsZero() {
        EstimatedParameter[] all = new EstimatedParameter[] { paramA, paramB };
        SimpleProblem problem = new SimpleProblem(new WeightedMeasurement[0], all, all);

        TestEstimator estimator = new TestEstimator();
        double chiSquare = estimator.getChiSquare(problem);
        assertEquals(0.0, chiSquare, 1e-9);
    }

    @Test
    public void testSetMaxCostEval_zeroValue_throwsOnFirstEvaluation() {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(0);
        try {
            estimator.estimate(exactProblem);
            fail("Expected EstimationException when maxCostEval is 0");
        } catch (EstimationException e) {
            // expected
        }
    }

    @Test
    public void testSetMaxCostEval_negativeValue_throwsImmediately() {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(-1);
        try {
            estimator.estimate(exactProblem);
            fail("Expected EstimationException when maxCostEval is negative");
        } catch (EstimationException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // Exception cases
    // ---------------------------------------------------------------

    @Test
    public void testUpdateResidualsAndCost_exceedsMaxCostEval_throwsEstimationException() {
        TestEstimator estimator = new TestEstimator();
        estimator.setMaxCostEval(0);
        try {
            estimator.estimate(exactProblem);
            fail("Expected EstimationException");
        } catch (EstimationException e) {
            // expected
        }
    }

    @Test
    public void testGetCovariances_singularProblem_throwsEstimationException() {
        WeightedMeasurement[] measurements = new WeightedMeasurement[] {
            new ZeroPartialMeasurement(1.0, 1.0),
            new ZeroPartialMeasurement(1.0, 2.0),
            new ZeroPartialMeasurement(1.0, 3.0)
        };
        EstimatedParameter[] all = new EstimatedParameter[] { paramA, paramB };
        SimpleProblem problem = new SimpleProblem(measurements, all, all);

        TestEstimator estimator = new TestEstimator();
        estimator.init(problem);
        try {
            estimator.getCovariances(problem);
            fail("Expected EstimationException due to singular matrix");
        } catch (EstimationException e) {
            // expected
        }
    }

    @Test
    public void testGuessParametersErrors_insufficientDegreesOfFreedom_throwsEstimationException() {
        double[] xs = {1};
        WeightedMeasurement[] measurements = new WeightedMeasurement[] {
            new LinearMeasurement(1.0, 5.0, xs[0], paramA, paramB)
        };
        EstimatedParameter[] all = new EstimatedParameter[] { paramA, paramB };
        SimpleProblem problem = new SimpleProblem(measurements, all, all);

        TestEstimator estimator = new TestEstimator();
        estimator.init(problem);
        try {
            estimator.guessParametersErrors(problem);
            fail("Expected EstimationException due to insufficient degrees of freedom");
        } catch (EstimationException e) {
            // expected
        }
    }

    @Test(expected = EstimationException.class)
    public void testGuessParametersErrors_equalMeasurementsAndParameters_throwsEstimationException()
        throws EstimationException {
        double[] xs = {1, 2};
        WeightedMeasurement[] measurements = new WeightedMeasurement[] {
            new LinearMeasurement(1.0, 5.0, xs[0], paramA, paramB),
            new LinearMeasurement(1.0, 7.0, xs[1], paramA, paramB)
        };
        EstimatedParameter[] all = new EstimatedParameter[] { paramA, paramB };
        SimpleProblem problem = new SimpleProblem(measurements, all, all);

        TestEstimator estimator = new TestEstimator();
        estimator.init(problem);
        estimator.guessParametersErrors(problem);
    }
}
