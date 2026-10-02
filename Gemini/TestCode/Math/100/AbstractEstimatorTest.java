package org.apache.commons.math.estimation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractEstimatorTest {

    private static class DummyMeasurement extends WeightedMeasurement {
        private static final long serialVersionUID = 1L;
        private final double theoreticalValue;
        private final EstimatedParameter[] params;
        private final double[] partials;

        public DummyMeasurement(double weight, double measuredValue, double theoreticalValue,
                                EstimatedParameter[] params, double[] partials) {
            super(weight, measuredValue);
            this.theoreticalValue = theoreticalValue;
            this.params = params;
            this.partials = partials;
        }

        @Override
        public double getTheoreticalValue() {
            return theoreticalValue;
        }

        @Override
        public double getPartial(EstimatedParameter parameter) {
            if (params != null && partials != null) {
                for (int i = 0; i < params.length; i++) {
                    if (params[i] == parameter) {
                        return partials[i];
                    }
                }
            }
            return 0.0;
        }
    }

    private static class DummyProblem implements EstimationProblem {
        private final WeightedMeasurement[] measurements;
        private final EstimatedParameter[] unboundParameters;
        private final EstimatedParameter[] allParameters;

        public DummyProblem(WeightedMeasurement[] measurements,
                            EstimatedParameter[] unboundParameters,
                            EstimatedParameter[] allParameters) {
            this.measurements = measurements;
            this.unboundParameters = unboundParameters;
            this.allParameters = allParameters;
        }

        public WeightedMeasurement[] getMeasurements() {
            return measurements;
        }

        public EstimatedParameter[] getUnboundParameters() {
            return unboundParameters;
        }

        public EstimatedParameter[] getAllParameters() {
            return allParameters;
        }
    }

    private static class DummyEstimator extends AbstractEstimator {
        @Override
        public void estimate(EstimationProblem problem) throws EstimationException {
            initializeEstimate(problem);
        }

        public void callUpdateJacobian() {
            updateJacobian();
        }

        public void callIncrementJacobianEvaluationsCounter() {
            incrementJacobianEvaluationsCounter();
        }

        public void callUpdateResidualsAndCost() throws EstimationException {
            updateResidualsAndCost();
        }

        public double[] getJacobianArray() {
            return jacobian;
        }

        public double[] getResidualsArray() {
            return residuals;
        }

        public double getCostValue() {
            return cost;
        }
    }

    private DummyEstimator estimator;

    @Before
    public void setUp() {
        estimator = new DummyEstimator();
    }

    @Test
    public void testSetAndGetMaxCostEval_normalValue_returnsUpdatedValue() {
        estimator.setMaxCostEval(100);
        Assert.assertEquals(0, estimator.getCostEvaluations());
        Assert.assertEquals(0, estimator.getJacobianEvaluations());
    }

    @Test
    public void testInitializeEstimate_validProblem_initializesFieldsAndCounters() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter[] params = new EstimatedParameter[] { p1 };
        WeightedMeasurement m1 = new DummyMeasurement(1.0, 2.0, 1.0, params, new double[] { 1.0 });
        WeightedMeasurement[] measurements = new WeightedMeasurement[] { m1 };
        DummyProblem problem = new DummyProblem(measurements, params, params);

        estimator.estimate(problem);

        Assert.assertEquals(0, estimator.getCostEvaluations());
        Assert.assertEquals(0, estimator.getJacobianEvaluations());
        Assert.assertEquals(Double.POSITIVE_INFINITY, estimator.getCostValue(), 1e-10);
        Assert.assertNotNull(estimator.getJacobianArray());
        Assert.assertEquals(1, estimator.getJacobianArray().length);
        Assert.assertNotNull(estimator.getResidualsArray());
        Assert.assertEquals(1, estimator.getResidualsArray().length);
    }

    @Test
    public void testIncrementJacobianEvaluationsCounter_calledMultipleTimes_incrementsCorrectly() {
        Assert.assertEquals(0, estimator.getJacobianEvaluations());
        estimator.callIncrementJacobianEvaluationsCounter();
        estimator.callIncrementJacobianEvaluationsCounter();
        Assert.assertEquals(2, estimator.getJacobianEvaluations());
    }

    @Test
    public void testUpdateJacobian_validMeasurementsAndParameters_computesJacobianCorrectly() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        EstimatedParameter[] params = new EstimatedParameter[] { p1, p2 };

        WeightedMeasurement m1 = new DummyMeasurement(4.0, 5.0, 3.0, params, new double[] { 2.0, 3.0 });
        WeightedMeasurement m2 = new DummyMeasurement(9.0, 7.0, 1.0, params, new double[] { 4.0, 5.0 });
        WeightedMeasurement[] measurements = new WeightedMeasurement[] { m1, m2 };

        DummyProblem problem = new DummyProblem(measurements, params, params);
        estimator.estimate(problem);

        estimator.callUpdateJacobian();

        Assert.assertEquals(1, estimator.getJacobianEvaluations());
        double[] jacobian = estimator.getJacobianArray();
        Assert.assertEquals(4, jacobian.length);

        // factor1 = -sqrt(4.0) = -2.0; jacobian[0] = -2.0 * 2.0 = -4.0; jacobian[1] = -2.0 * 3.0 = -6.0
        // factor2 = -sqrt(9.0) = -3.0; jacobian[2] = -3.0 * 4.0 = -12.0; jacobian[3] = -3.0 * 5.0 = -15.0
        Assert.assertEquals(-4.0, jacobian[0], 1e-10);
        Assert.assertEquals(-6.0, jacobian[1], 1e-10);
        Assert.assertEquals(-12.0, jacobian[2], 1e-10);
        Assert.assertEquals(-15.0, jacobian[3], 1e-10);
    }

    @Test
    public void testUpdateResidualsAndCost_withinEvaluationLimit_computesCostAndResiduals() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter[] params = new EstimatedParameter[] { p1 };

        // Residual = measured - theoretical
        // m1: residual = 5.0 - 3.0 = 2.0, weight = 4.0, weighted residual = sqrt(4.0) * 2.0 = 4.0
        // m2: residual = 7.0 - 1.0 = 6.0, weight = 1.0, weighted residual = sqrt(1.0) * 6.0 = 6.0
        WeightedMeasurement m1 = new DummyMeasurement(4.0, 5.0, 3.0, params, new double[] { 1.0 });
        WeightedMeasurement m2 = new DummyMeasurement(1.0, 7.0, 1.0, params, new double[] { 1.0 });
        WeightedMeasurement[] measurements = new WeightedMeasurement[] { m1, m2 };

        DummyProblem problem = new DummyProblem(measurements, params, params);
        estimator.setMaxCostEval(5);
        estimator.estimate(problem);

        estimator.callUpdateResidualsAndCost();

        Assert.assertEquals(1, estimator.getCostEvaluations());
        double[] residuals = estimator.getResidualsArray();
        Assert.assertEquals(4.0, residuals[0], 1e-10);
        Assert.assertEquals(6.0, residuals[1], 1e-10);

        // cost = sqrt(4.0 * 2.0^2 + 1.0 * 6.0^2) = sqrt(16 + 36) = sqrt(52)
        Assert.assertEquals(Math.sqrt(52.0), estimator.getCostValue(), 1e-10);
    }

    @Test(expected = EstimationException.class)
    public void testUpdateResidualsAndCost_maxCostEvaluationsExceeded_throwsEstimationException() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter[] params = new EstimatedParameter[] { p1 };
        WeightedMeasurement m1 = new DummyMeasurement(1.0, 2.0, 1.0, params, new double[] { 1.0 });
        DummyProblem problem = new DummyProblem(new WeightedMeasurement[] { m1 }, params, params);

        estimator.setMaxCostEval(1);
        estimator.estimate(problem);

        estimator.callUpdateResidualsAndCost(); // evaluation 1 (ok)
        estimator.callUpdateResidualsAndCost(); // evaluation 2 (exceeds maxCostEval 1)
    }

    @Test
    public void testGetRMS_validProblem_returnsCorrectRootMeanSquare() {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter[] params = new EstimatedParameter[] { p1 };

        // m1: weight = 2.0, residual = 3.0 -> weight * res^2 = 2 * 9 = 18
        // m2: weight = 3.0, residual = 2.0 -> weight * res^2 = 3 * 4 = 12
        // total criterion = 30. RMS = sqrt(30 / 2) = sqrt(15)
        WeightedMeasurement m1 = new DummyMeasurement(2.0, 5.0, 2.0, params, new double[] { 1.0 });
        WeightedMeasurement m2 = new DummyMeasurement(3.0, 4.0, 2.0, params, new double[] { 1.0 });
        DummyProblem problem = new DummyProblem(new WeightedMeasurement[] { m1, m2 }, params, params);

        double rms = estimator.getRMS(problem);
        Assert.assertEquals(Math.sqrt(15.0), rms, 1e-10);
    }

    @Test
    public void testGetChiSquare_validProblem_returnsCorrectChiSquare() {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter[] params = new EstimatedParameter[] { p1 };

        // m1: weight = 2.0, residual = 4.0 -> res^2 / weight = 16 / 2 = 8
        // m2: weight = 0.5, residual = 1.0 -> res^2 / weight = 1 / 0.5 = 2
        // total chiSquare = 10.0
        WeightedMeasurement m1 = new DummyMeasurement(2.0, 6.0, 2.0, params, new double[] { 1.0 });
        WeightedMeasurement m2 = new DummyMeasurement(0.5, 3.0, 2.0, params, new double[] { 1.0 });
        DummyProblem problem = new DummyProblem(new WeightedMeasurement[] { m1, m2 }, params, params);

        double chiSquare = estimator.getChiSquare(problem);
        Assert.assertEquals(10.0, chiSquare, 1e-10);
    }

    @Test
    public void testGetCovariances_invertibleSystem_returnsCovarianceMatrix() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        EstimatedParameter[] params = new EstimatedParameter[] { p1, p2 };

        // J = [[-1, 0], [0, -2]]
        // J^T * J = [[1, 0], [0, 4]]
        // Inverse = [[1.0, 0.0], [0.0, 0.25]]
        WeightedMeasurement m1 = new DummyMeasurement(1.0, 1.0, 0.0, params, new double[] { 1.0, 0.0 });
        WeightedMeasurement m2 = new DummyMeasurement(4.0, 1.0, 0.0, params, new double[] { 0.0, 1.0 });
        DummyProblem problem = new DummyProblem(new WeightedMeasurement[] { m1, m2 }, params, params);

        estimator.estimate(problem);
        double[][] covar = estimator.getCovariances(problem);

        Assert.assertNotNull(covar);
        Assert.assertEquals(2, covar.length);
        Assert.assertEquals(2, covar[0].length);
        Assert.assertEquals(1.0, covar[0][0], 1e-10);
        Assert.assertEquals(0.0, covar[0][1], 1e-10);
        Assert.assertEquals(0.0, covar[1][0], 1e-10);
        Assert.assertEquals(0.25, covar[1][1], 1e-10);
    }

    @Test(expected = EstimationException.class)
    public void testGetCovariances_singularSystem_throwsEstimationException() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        EstimatedParameter[] params = new EstimatedParameter[] { p1, p2 };

        // All partials zero -> J is zero matrix -> J^T * J singular
        WeightedMeasurement m1 = new DummyMeasurement(1.0, 1.0, 0.0, params, new double[] { 0.0, 0.0 });
        WeightedMeasurement m2 = new DummyMeasurement(1.0, 1.0, 0.0, params, new double[] { 0.0, 0.0 });
        DummyProblem problem = new DummyProblem(new WeightedMeasurement[] { m1, m2 }, params, params);

        estimator.estimate(problem);
        estimator.getCovariances(problem);
    }

    @Test
    public void testGuessParametersErrors_moreMeasurementsThanParameters_returnsEstimatedErrors() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter[] params = new EstimatedParameter[] { p1 };

        // Measurements = 2, Parameters = 1 (m = 2, p = 1 -> m > p)
        // m1: weight = 1, residual = 2 -> res^2 / weight = 4
        // m2: weight = 1, residual = 2 -> res^2 / weight = 4
        // chiSquare = 8.0, c = sqrt(8.0 / (2 - 1)) = sqrt(8.0)
        // J = [[-2], [-1]], J^T * J = [4 + 1] = [5], covar = [1/5] = [0.2]
        // error = sqrt(0.2) * sqrt(8.0) = sqrt(1.6)
        WeightedMeasurement m1 = new DummyMeasurement(1.0, 3.0, 1.0, params, new double[] { 2.0 });
        WeightedMeasurement m2 = new DummyMeasurement(1.0, 3.0, 1.0, params, new double[] { 1.0 });
        DummyProblem problem = new DummyProblem(new WeightedMeasurement[] { m1, m2 }, params, params);

        estimator.estimate(problem);
        double[] errors = estimator.guessParametersErrors(problem);

        Assert.assertNotNull(errors);
        Assert.assertEquals(1, errors.length);
        Assert.assertEquals(Math.sqrt(1.6), errors[0], 1e-10);
    }

    @Test(expected = EstimationException.class)
    public void testGuessParametersErrors_equalMeasurementsAndParameters_throwsEstimationException() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter[] params = new EstimatedParameter[] { p1 };
        WeightedMeasurement m1 = new DummyMeasurement(1.0, 2.0, 1.0, params, new double[] { 1.0 });
        DummyProblem problem = new DummyProblem(new WeightedMeasurement[] { m1 }, params, params);

        estimator.estimate(problem);
        estimator.guessParametersErrors(problem);
    }

    @Test(expected = EstimationException.class)
    public void testGuessParametersErrors_fewerMeasurementsThanParameters_throwsEstimationException() throws EstimationException {
        EstimatedParameter p1 = new EstimatedParameter("p1", 1.0);
        EstimatedParameter p2 = new EstimatedParameter("p2", 2.0);
        EstimatedParameter[] params = new EstimatedParameter[] { p1, p2 };
        WeightedMeasurement m1 = new DummyMeasurement(1.0, 2.0, 1.0, params, new double[] { 1.0, 1.0 });
        DummyProblem problem = new DummyProblem(new WeightedMeasurement[] { m1 }, params, params);

        estimator.estimate(problem);
        estimator.guessParametersErrors(problem);
    }
}
