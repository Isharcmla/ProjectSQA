package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Test;

public class EmbeddedRungeKuttaIntegratorTest {

    private static class DummyRungeKuttaInterpolator extends RungeKuttaStepInterpolator {
        private static final long serialVersionUID = 1L;

        public DummyRungeKuttaInterpolator() {
            super();
        }

        public DummyRungeKuttaInterpolator(DummyRungeKuttaInterpolator interpolator) {
            super(interpolator);
        }

        @Override
        protected StepInterpolator doCopy() {
            return new DummyRungeKuttaInterpolator(this);
        }

        @Override
        protected void computeInterpolatedStateAndDerivatives(double theta, double oneMinusThetaH) {
            for (int i = 0; i < interpolatedState.length; ++i) {
                interpolatedState[i] = currentState[i];
                interpolatedDerivatives[i] = (yDotK != null && yDotK.length > 0 && yDotK[0] != null) ? yDotK[0][i] : 0.0;
            }
        }
    }

    private static class ConcreteEmbeddedRungeKuttaIntegrator extends EmbeddedRungeKuttaIntegrator {
        private final int order;
        private double errorRatioToReturn = 0.5;
        private int errorEvalCount = 0;
        private double errorRatioSequence[] = null;

        public ConcreteEmbeddedRungeKuttaIntegrator(String name, boolean fsal,
                                                    double[] c, double[][] a, double[] b,
                                                    RungeKuttaStepInterpolator prototype,
                                                    double minStep, double maxStep,
                                                    double scalAbsoluteTolerance,
                                                    double scalRelativeTolerance,
                                                    int order) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
            this.order = order;
        }

        public ConcreteEmbeddedRungeKuttaIntegrator(String name, boolean fsal,
                                                    double[] c, double[][] a, double[] b,
                                                    RungeKuttaStepInterpolator prototype,
                                                    double minStep, double maxStep,
                                                    double[] vecAbsoluteTolerance,
                                                    double[] vecRelativeTolerance,
                                                    int order) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
            this.order = order;
        }

        public void setErrorRatio(double errorRatio) {
            this.errorRatioToReturn = errorRatio;
            this.errorRatioSequence = null;
        }

        public void setErrorRatioSequence(double... sequence) {
            this.errorRatioSequence = sequence;
            this.errorEvalCount = 0;
        }

        @Override
        public int getOrder() {
            return order;
        }

        @Override
        protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
            if (errorRatioSequence != null && errorEvalCount < errorRatioSequence.length) {
                return errorRatioSequence[errorEvalCount++];
            }
            return errorRatioToReturn;
        }
    }

    private static class LinearEquations implements FirstOrderDifferentialEquations {
        @Override
        public int getDimension() {
            return 1;
        }

        @Override
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = 1.0;
        }
    }

    private static class ExceptionEquations implements FirstOrderDifferentialEquations {
        @Override
        public int getDimension() {
            return 1;
        }

        @Override
        public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
            throw new DerivativeException("Derivative error test", new Object[0]);
        }
    }

    private ConcreteEmbeddedRungeKuttaIntegrator createStandardIntegrator(boolean fsal) {
        double[] c = new double[]{0.5, 1.0};
        double[][] a = new double[][]{{0.5}, {0.0, 1.0}};
        double[] b = new double[]{1.0 / 6.0, 2.0 / 3.0, 1.0 / 6.0};
        DummyRungeKuttaInterpolator prototype = new DummyRungeKuttaInterpolator();
        return new ConcreteEmbeddedRungeKuttaIntegrator("TestIntegrator", fsal, c, a, b, prototype,
                0.001, 10.0, 1.0e-6, 1.0e-6, 2);
    }

    @Test
    public void testGettersAndSetters_normalValues_correctAssignment() {
        ConcreteEmbeddedRungeKuttaIntegrator integrator = createStandardIntegrator(false);

        Assert.assertEquals(0.9, integrator.getSafety(), 1e-9);
        Assert.assertEquals(0.2, integrator.getMinReduction(), 1e-9);
        Assert.assertEquals(10.0, integrator.getMaxGrowth(), 1e-9);
        Assert.assertEquals(2, integrator.getOrder());

        integrator.setSafety(0.85);
        Assert.assertEquals(0.85, integrator.getSafety(), 1e-9);

        integrator.setMinReduction(0.1);
        Assert.assertEquals(0.1, integrator.getMinReduction(), 1e-9);

        integrator.setMaxGrowth(5.0);
        Assert.assertEquals(5.0, integrator.getMaxGrowth(), 1e-9);
    }

    @Test
    public void testGettersAndSetters_edgeValues_correctAssignment() {
        ConcreteEmbeddedRungeKuttaIntegrator integrator = createStandardIntegrator(false);

        integrator.setSafety(0.0);
        Assert.assertEquals(0.0, integrator.getSafety(), 1e-9);

        integrator.setSafety(-1.0);
        Assert.assertEquals(-1.0, integrator.getSafety(), 1e-9);

        integrator.setMinReduction(0.0);
        Assert.assertEquals(0.0, integrator.getMinReduction(), 1e-9);

        integrator.setMaxGrowth(0.0);
        Assert.assertEquals(0.0, integrator.getMaxGrowth(), 1e-9);
    }

    @Test
    public void testIntegrate_forwardScalarToleranceNonFsal_success() throws DerivativeException, IntegratorException {
        ConcreteEmbeddedRungeKuttaIntegrator integrator = createStandardIntegrator(false);
        FirstOrderDifferentialEquations ode = new LinearEquations();
        double[] y0 = new double[]{0.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 2.0, y);

        Assert.assertEquals(2.0, stopTime, 1e-6);
        Assert.assertEquals(2.0, y[0], 1e-6);
    }

    @Test
    public void testIntegrate_sameSourceAndDestinationArray_success() throws DerivativeException, IntegratorException {
        ConcreteEmbeddedRungeKuttaIntegrator integrator = createStandardIntegrator(false);
        FirstOrderDifferentialEquations ode = new LinearEquations();
        double[] y = new double[]{0.0};

        double stopTime = integrator.integrate(ode, 0.0, y, 2.0, y);

        Assert.assertEquals(2.0, stopTime, 1e-6);
        Assert.assertEquals(2.0, y[0], 1e-6);
    }

    @Test
    public void testIntegrate_backwardVectorToleranceFsal_success() throws DerivativeException, IntegratorException {
        double[] c = new double[]{0.5, 1.0};
        double[][] a = new double[][]{{0.5}, {0.0, 1.0}};
        double[] b = new double[]{1.0 / 6.0, 2.0 / 3.0, 1.0 / 6.0};
        DummyRungeKuttaInterpolator prototype = new DummyRungeKuttaInterpolator();
        double[] vecAbsTol = new double[]{1.0e-6};
        double[] vecRelTol = new double[]{1.0e-6};

        ConcreteEmbeddedRungeKuttaIntegrator integrator = new ConcreteEmbeddedRungeKuttaIntegrator(
                "FsalIntegrator", true, c, a, b, prototype, 0.001, 10.0, vecAbsTol, vecRelTol, 2);

        FirstOrderDifferentialEquations ode = new LinearEquations();
        double[] y0 = new double[]{5.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 5.0, y0, 1.0, y);

        Assert.assertEquals(1.0, stopTime, 1e-6);
        Assert.assertEquals(1.0, y[0], 1e-6);
    }

    @Test
    public void testIntegrate_stepRejectedThenAccepted_success() throws DerivativeException, IntegratorException {
        ConcreteEmbeddedRungeKuttaIntegrator integrator = createStandardIntegrator(false);
        integrator.setErrorRatioSequence(2.5, 0.5);

        FirstOrderDifferentialEquations ode = new LinearEquations();
        double[] y0 = new double[]{0.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(1.0, stopTime, 1e-6);
        Assert.assertEquals(1.0, y[0], 1e-6);
    }

    @Test
    public void testIntegrate_withStepHandlerDenseOutput_success() throws DerivativeException, IntegratorException {
        ConcreteEmbeddedRungeKuttaIntegrator integrator = createStandardIntegrator(false);
        final boolean[] handled = new boolean[]{false};
        final boolean[] resetCalled = new boolean[]{false};

        integrator.addStepHandler(new StepHandler() {
            @Override
            public boolean isDenseOutput() {
                return true;
            }

            @Override
            public void reset() {
                resetCalled[0] = true;
            }

            @Override
            public void handleStep(StepInterpolator interpolator, boolean isLast) {
                handled[0] = true;
            }
        });

        FirstOrderDifferentialEquations ode = new LinearEquations();
        double[] y0 = new double[]{0.0};
        double[] y = new double[1];

        integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertTrue(resetCalled[0]);
        Assert.assertTrue(handled[0]);
    }

    @Test
    public void testIntegrate_withEventOccurring_eventTriggersResetAndStop() throws DerivativeException, IntegratorException {
        ConcreteEmbeddedRungeKuttaIntegrator integrator = createStandardIntegrator(false);

        integrator.addEventHandler(new EventHandler() {
            @Override
            public void resetState(double t, double[] y) {
                y[0] = 10.0;
            }

            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.RESET_STATE;
            }

            @Override
            public double g(double t, double[] y) {
                return t - 0.5;
            }
        }, 0.1, 1.0e-6, 100);

        FirstOrderDifferentialEquations ode = new LinearEquations();
        double[] y0 = new double[]{0.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(1.0, stopTime, 1e-6);
        Assert.assertTrue(y[0] > 10.0);
    }

    @Test
    public void testIntegrate_withEventStopCondition_stopsEarly() throws DerivativeException, IntegratorException {
        ConcreteEmbeddedRungeKuttaIntegrator integrator = createStandardIntegrator(false);

        integrator.addEventHandler(new EventHandler() {
            @Override
            public void resetState(double t, double[] y) {}

            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.STOP;
            }

            @Override
            public double g(double t, double[] y) {
                return t - 0.5;
            }
        }, 0.1, 1.0e-6, 100);

        FirstOrderDifferentialEquations ode = new LinearEquations();
        double[] y0 = new double[]{0.0};
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(0.5, stopTime, 1e-4);
    }

    @Test(expected = DerivativeException.class)
    public void testIntegrate_derivativeException_throwsDerivativeException() throws DerivativeException, IntegratorException {
        ConcreteEmbeddedRungeKuttaIntegrator integrator = createStandardIntegrator(false);
        FirstOrderDifferentialEquations ode = new ExceptionEquations();
        double[] y0 = new double[]{0.0};
        double[] y = new double[1];

        integrator.integrate(ode, 0.0, y0, 1.0, y);
    }

    @Test(expected = IntegratorException.class)
    public void testIntegrate_dimensionMismatch_throwsIntegratorException() throws DerivativeException, IntegratorException {
        ConcreteEmbeddedRungeKuttaIntegrator integrator = createStandardIntegrator(false);
        FirstOrderDifferentialEquations ode = new LinearEquations();
        double[] y0 = new double[0];
        double[] y = new double[0];

        integrator.integrate(ode, 0.0, y0, 1.0, y);
    }
}
