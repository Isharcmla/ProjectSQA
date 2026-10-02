package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Test;

public class EmbeddedRungeKuttaIntegratorTest {

    private static class DummyRKInterpolator extends RungeKuttaStepInterpolator {
        private static final long serialVersionUID = 1L;

        public DummyRKInterpolator() {
            super();
        }

        public DummyRKInterpolator(final DummyRKInterpolator interpolator) {
            super(interpolator);
        }

        @Override
        protected StepInterpolator doCopy() {
            return new DummyRKInterpolator(this);
        }

        @Override
        public void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH) {
            if (currentState != null && interpolatedState != null) {
                System.arraycopy(currentState, 0, interpolatedState, 0, currentState.length);
            }
            if (yDotK != null && yDotK.length > 0 && yDotK[0] != null && interpolatedDerivatives != null) {
                System.arraycopy(yDotK[0], 0, interpolatedDerivatives, 0, interpolatedDerivatives.length);
            }
        }
    }

    private static class TestEmbeddedRKIntegrator extends EmbeddedRungeKuttaIntegrator {
        private final int order;
        private double fixedErrorRatio = 0.5;
        private int errorEvalCount = 0;
        private int rejectCountTarget = 0;

        public TestEmbeddedRKIntegrator(final String name, final boolean fsal,
                                        final double[] c, final double[][] a, final double[] b,
                                        final RungeKuttaStepInterpolator prototype,
                                        final double minStep, final double maxStep,
                                        final double scalAbsoluteTolerance,
                                        final double scalRelativeTolerance,
                                        final int order) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
            this.order = order;
        }

        public TestEmbeddedRKIntegrator(final String name, final boolean fsal,
                                        final double[] c, final double[][] a, final double[] b,
                                        final RungeKuttaStepInterpolator prototype,
                                        final double minStep, final double maxStep,
                                        final double[] vecAbsoluteTolerance,
                                        final double[] vecRelativeTolerance,
                                        final int order) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
            this.order = order;
        }

        public void setFixedErrorRatio(final double error) {
            this.fixedErrorRatio = error;
        }

        public void setRejectCountTarget(final int count) {
            this.rejectCountTarget = count;
        }

        @Override
        public int getOrder() {
            return order;
        }

        @Override
        protected double estimateError(final double[][] yDotK, final double[] y0, final double[] y1, final double h) {
            errorEvalCount++;
            if (errorEvalCount <= rejectCountTarget) {
                return 2.0; // Trigger step rejection
            }
            return fixedErrorRatio;
        }
    }

    private static class SimpleLinearODE implements FirstOrderDifferentialEquations {
        private final double rate;

        public SimpleLinearODE(final double rate) {
            this.rate = rate;
        }

        public int getDimension() {
            return 1;
        }

        public void computeDerivatives(final double t, final double[] y, final double[] yDot) {
            yDot[0] = rate * y[0];
        }
    }

    private static class ExceptionODE implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 1;
        }

        public void computeDerivatives(final double t, final double[] y, final double[] yDot) throws DerivativeException {
            throw new DerivativeException("Test derivative failure", new Object[0]);
        }
    }

    private TestEmbeddedRKIntegrator createDefaultIntegrator(final boolean fsal, final double minStep, final double maxStep) {
        final double[] c = new double[]{1.0};
        final double[][] a = new double[][]{{1.0}};
        final double[] b = new double[]{0.5, 0.5};
        final DummyRKInterpolator prototype = new DummyRKInterpolator();
        return new TestEmbeddedRKIntegrator("TestRK", fsal, c, a, b, prototype, minStep, maxStep, 1.0e-6, 1.0e-6, 2);
    }

    private TestEmbeddedRKIntegrator createVectorToleranceIntegrator(final boolean fsal, final double minStep, final double maxStep) {
        final double[] c = new double[]{1.0};
        final double[][] a = new double[][]{{1.0}};
        final double[] b = new double[]{0.5, 0.5};
        final DummyRKInterpolator prototype = new DummyRKInterpolator();
        final double[] vecAbsTol = new double[]{1.0e-6};
        final double[] vecRelTol = new double[]{1.0e-6};
        return new TestEmbeddedRKIntegrator("TestRKVec", fsal, c, a, b, prototype, minStep, maxStep, vecAbsTol, vecRelTol, 2);
    }

    @Test
    public void testGettersAndSetters_normalValues_expectedState() {
        final TestEmbeddedRKIntegrator integrator = createDefaultIntegrator(false, 0.001, 1.0);

        Assert.assertEquals(0.9, integrator.getSafety(), 1.0e-10);
        integrator.setSafety(0.85);
        Assert.assertEquals(0.85, integrator.getSafety(), 1.0e-10);

        Assert.assertEquals(0.2, integrator.getMinReduction(), 1.0e-10);
        integrator.setMinReduction(0.1);
        Assert.assertEquals(0.1, integrator.getMinReduction(), 1.0e-10);

        Assert.assertEquals(10.0, integrator.getMaxGrowth(), 1.0e-10);
        integrator.setMaxGrowth(5.0);
        Assert.assertEquals(5.0, integrator.getMaxGrowth(), 1.0e-10);

        Assert.assertEquals(2, integrator.getOrder());
    }

    @Test
    public void testIntegrate_scalarTolerance_forward_sameArray() throws IntegratorException, DerivativeException {
        final TestEmbeddedRKIntegrator integrator = createDefaultIntegrator(false, 0.001, 1.0);
        final FirstOrderDifferentialEquations ode = new SimpleLinearODE(1.0);
        final double[] y = new double[]{1.0};

        final double stopTime = integrator.integrate(ode, 0.0, y, 1.0, y);
        Assert.assertEquals(1.0, stopTime, 1.0e-10);
        Assert.assertTrue(y[0] > 1.0);
    }

    @Test
    public void testIntegrate_vectorTolerance_forward_differentArray() throws IntegratorException, DerivativeException {
        final TestEmbeddedRKIntegrator integrator = createVectorToleranceIntegrator(true, 0.001, 1.0);
        final FirstOrderDifferentialEquations ode = new SimpleLinearODE(1.0);
        final double[] y0 = new double[]{2.0};
        final double[] y = new double[1];

        final double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);
        Assert.assertEquals(1.0, stopTime, 1.0e-10);
        Assert.assertEquals(2.0, y0[0], 1.0e-10);
        Assert.assertTrue(y[0] > 2.0);
    }

    @Test
    public void testIntegrate_backwardIntegration_success() throws IntegratorException, DerivativeException {
        final TestEmbeddedRKIntegrator integrator = createDefaultIntegrator(true, 0.001, 1.0);
        final FirstOrderDifferentialEquations ode = new SimpleLinearODE(1.0);
        final double[] y0 = new double[]{1.0};
        final double[] y = new double[1];

        final double stopTime = integrator.integrate(ode, 1.0, y0, 0.0, y);
        Assert.assertEquals(0.0, stopTime, 1.0e-10);
        Assert.assertTrue(y[0] < 1.0);
    }

    @Test
    public void testIntegrate_stepRejectionAndStepSizeReduction_success() throws IntegratorException, DerivativeException {
        final TestEmbeddedRKIntegrator integrator = createDefaultIntegrator(false, 0.0001, 1.0);
        integrator.setRejectCountTarget(2); // reject first 2 step attempts
        final FirstOrderDifferentialEquations ode = new SimpleLinearODE(-0.5);
        final double[] y = new double[]{10.0};

        final double stopTime = integrator.integrate(ode, 0.0, y, 1.0, y);
        Assert.assertEquals(1.0, stopTime, 1.0e-10);
        Assert.assertTrue(y[0] < 10.0);
    }

    @Test
    public void testIntegrate_withStepHandler_handlerMethodsInvoked() throws IntegratorException, DerivativeException {
        final TestEmbeddedRKIntegrator integrator = createDefaultIntegrator(false, 0.01, 1.0);
        final FirstOrderDifferentialEquations ode = new SimpleLinearODE(1.0);

        final boolean[] handlerFlags = new boolean[]{false, false, false};
        integrator.addStepHandler(new StepHandler() {
            public boolean isDenseOutput() {
                handlerFlags[0] = true;
                return true;
            }

            public void reset() {
                handlerFlags[1] = true;
            }

            public void handleStep(final StepInterpolator interpolator, final boolean isLast) {
                handlerFlags[2] = true;
                Assert.assertNotNull(interpolator);
            }
        });

        final double[] y = new double[]{1.0};
        integrator.integrate(ode, 0.0, y, 0.5, y);

        Assert.assertTrue(handlerFlags[0]);
        Assert.assertTrue(handlerFlags[1]);
        Assert.assertTrue(handlerFlags[2]);
    }

    @Test
    public void testIntegrate_withEventHandlerStop_stopsEarly() throws IntegratorException, DerivativeException {
        final TestEmbeddedRKIntegrator integrator = createDefaultIntegrator(false, 0.001, 1.0);
        final FirstOrderDifferentialEquations ode = new SimpleLinearODE(1.0);

        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(final double t, final double[] y, final boolean increasing) {
                return STOP;
            }

            public double g(final double t, final double[] y) {
                return t - 0.4;
            }

            public void resetState(final double t, final double[] y) {
            }
        }, 1.0, 1.0e-6, 100);

        final double[] y = new double[]{1.0};
        final double stopTime = integrator.integrate(ode, 0.0, y, 1.0, y);
        Assert.assertEquals(0.4, stopTime, 1.0e-4);
    }

    @Test
    public void testIntegrate_withEventHandlerResetDerivatives_continuesIntegration() throws IntegratorException, DerivativeException {
        final TestEmbeddedRKIntegrator integrator = createDefaultIntegrator(true, 0.001, 1.0);
        final FirstOrderDifferentialEquations ode = new SimpleLinearODE(1.0);

        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(final double t, final double[] y, final boolean increasing) {
                return RESET_DERIVATIVES;
            }

            public double g(final double t, final double[] y) {
                return t - 0.3;
            }

            public void resetState(final double t, final double[] y) {
                y[0] += 1.0;
            }
        }, 1.0, 1.0e-6, 100);

        final double[] y = new double[]{1.0};
        final double stopTime = integrator.integrate(ode, 0.0, y, 1.0, y);
        Assert.assertEquals(1.0, stopTime, 1.0e-10);
    }

    @Test
    public void testIntegrate_withEventHandlerTinyDt_handlesZeroSizeStep() throws IntegratorException, DerivativeException {
        final TestEmbeddedRKIntegrator integrator = createDefaultIntegrator(false, 0.001, 1.0);
        final FirstOrderDifferentialEquations ode = new SimpleLinearODE(1.0);

        // Event occurs practically at stepStart
        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(final double t, final double[] y, final boolean increasing) {
                return CONTINUE;
            }

            public double g(final double t, final double[] y) {
                return t <= 0.0 ? 0.0 : 1.0;
            }

            public void resetState(final double t, final double[] y) {
            }
        }, 1.0, 1.0e-15, 100);

        final double[] y = new double[]{1.0};
        final double stopTime = integrator.integrate(ode, 0.0, y, 0.5, y);
        Assert.assertEquals(0.5, stopTime, 1.0e-10);
    }

    @Test(expected = IntegratorException.class)
    public void testIntegrate_dimensionMismatch_throwsIntegratorException() throws IntegratorException, DerivativeException {
        final TestEmbeddedRKIntegrator integrator = createDefaultIntegrator(false, 0.001, 1.0);
        final FirstOrderDifferentialEquations ode = new SimpleLinearODE(1.0);
        final double[] yWrongDim = new double[]{1.0, 2.0};

        integrator.integrate(ode, 0.0, yWrongDim, 1.0, yWrongDim);
    }

    @Test(expected = DerivativeException.class)
    public void testIntegrate_derivativeException_throwsDerivativeException() throws IntegratorException, DerivativeException {
        final TestEmbeddedRKIntegrator integrator = createDefaultIntegrator(false, 0.001, 1.0);
        final FirstOrderDifferentialEquations ode = new ExceptionODE();
        final double[] y = new double[]{1.0};

        integrator.integrate(ode, 0.0, y, 1.0, y);
    }
}
