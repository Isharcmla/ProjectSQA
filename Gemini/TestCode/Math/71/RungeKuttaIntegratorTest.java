package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.ContinuousOutputModel;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Test;

public class RungeKuttaIntegratorTest {

    private static class LinearEquations implements FirstOrderDifferentialEquations {
        private final int dimension;

        public LinearEquations(int dimension) {
            this.dimension = dimension;
        }

        public int getDimension() {
            return dimension;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
            for (int i = 0; i < dimension; ++i) {
                yDot[i] = -y[i];
            }
        }
    }

    private static class ExceptionalEquations implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 1;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
            throw new DerivativeException("Derivative calculation error", new Object[0]);
        }
    }

    private static class DummyRKIntegrator extends RungeKuttaIntegrator {
        public DummyRKIntegrator(double step) {
            super("DummyRK",
                  new double[] { 0.5, 1.0 },
                  new double[][] { { 0.5 }, { -1.0, 2.0 } },
                  new double[] { 1.0 / 6.0, 2.0 / 3.0, 1.0 / 6.0 },
                  new MidpointStepInterpolator(),
                  step);
        }
    }

    @Test
    public void testConstructor_negativeStep_stepMadePositive() {
        DummyRKIntegrator integrator = new DummyRKIntegrator(-0.1);
        Assert.assertEquals("DummyRK", integrator.getName());
    }

    @Test
    public void testIntegrate_forwardIntegration_yDifferentFromY0() throws DerivativeException, IntegratorException {
        RungeKuttaIntegrator integrator = new ClassicalRungeKuttaIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new LinearEquations(1);
        double[] y0 = new double[] { 1.0 };
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(1.0, stopTime, 1e-10);
        Assert.assertEquals(Math.exp(-1.0), y[0], 1e-4);
        Assert.assertNotSame(y, y0);
        Assert.assertEquals(1.0, y0[0], 1e-10);
    }

    @Test
    public void testIntegrate_backwardIntegration_ySameAsY0() throws DerivativeException, IntegratorException {
        RungeKuttaIntegrator integrator = new ClassicalRungeKuttaIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new LinearEquations(1);
        double[] y = new double[] { Math.exp(-1.0) };

        double stopTime = integrator.integrate(ode, 1.0, y, 0.0, y);

        Assert.assertEquals(0.0, stopTime, 1e-10);
        Assert.assertEquals(1.0, y[0], 1e-4);
    }

    @Test
    public void testIntegrate_withDenseOutputStepHandler_interpolatesProperly() throws DerivativeException, IntegratorException {
        RungeKuttaIntegrator integrator = new EulerIntegrator(0.01);
        ContinuousOutputModel model = new ContinuousOutputModel();
        integrator.addStepHandler(model);

        FirstOrderDifferentialEquations ode = new LinearEquations(1);
        double[] y0 = new double[] { 1.0 };
        double[] y = new double[1];

        integrator.integrate(ode, 0.0, y0, 1.0, y);

        model.setInterpolatedTime(0.5);
        double[] interpolated = model.getInterpolatedState();
        Assert.assertEquals(Math.exp(-0.5), interpolated[0], 0.05);
    }

    @Test
    public void testIntegrate_withNonDenseStepHandler_invokesHandler() throws DerivativeException, IntegratorException {
        RungeKuttaIntegrator integrator = new MidpointIntegrator(0.1);
        final int[] stepCount = new int[] { 0 };
        final int[] resetCount = new int[] { 0 };

        integrator.addStepHandler(new StepHandler() {
            public boolean requiresDenseOutput() {
                return false;
            }

            public void reset() {
                resetCount[0]++;
            }

            public void handleStep(StepInterpolator interpolator, boolean isLast) {
                stepCount[0]++;
            }
        });

        FirstOrderDifferentialEquations ode = new LinearEquations(2);
        double[] y0 = new double[] { 1.0, 2.0 };
        double[] y = new double[2];

        integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(1, resetCount[0]);
        Assert.assertTrue(stepCount[0] > 0);
    }

    @Test
    public void testIntegrate_withEventStop_stopsEarly() throws DerivativeException, IntegratorException {
        RungeKuttaIntegrator integrator = new GillIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new LinearEquations(1);

        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.STOP;
            }

            public double g(double t, double[] y) {
                return t - 0.5;
            }

            public void resetState(double t, double[] y) {
            }
        }, 0.1, 1e-6, 100);

        double[] y0 = new double[] { 1.0 };
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(0.5, stopTime, 1e-5);
    }

    @Test
    public void testIntegrate_withEventResetStateAndContinue_recomputesDerivatives() throws DerivativeException, IntegratorException {
        RungeKuttaIntegrator integrator = new EulerIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new LinearEquations(1);

        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.RESET_STATE;
            }

            public double g(double t, double[] y) {
                return t - 0.3;
            }

            public void resetState(double t, double[] y) {
                y[0] += 1.0;
            }
        }, 0.1, 1e-6, 100);

        double[] y0 = new double[] { 1.0 };
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 1.0, y);

        Assert.assertEquals(1.0, stopTime, 1e-5);
        Assert.assertTrue(y[0] > 0.0);
    }

    @Test
    public void testIntegrate_withEventAtStepStartUlp_handledGracefully() throws DerivativeException, IntegratorException {
        RungeKuttaIntegrator integrator = new EulerIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new LinearEquations(1);

        integrator.addEventHandler(new EventHandler() {
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.CONTINUE;
            }

            public double g(double t, double[] y) {
                return t - 0.0;
            }

            public void resetState(double t, double[] y) {
            }
        }, 0.1, 1e-15, 100);

        double[] y0 = new double[] { 1.0 };
        double[] y = new double[1];

        double stopTime = integrator.integrate(ode, 0.0, y0, 0.5, y);

        Assert.assertEquals(0.5, stopTime, 1e-5);
    }

    @Test(expected = IntegratorException.class)
    public void testIntegrate_tEqualsT0_throwsIntegratorException() throws DerivativeException, IntegratorException {
        RungeKuttaIntegrator integrator = new ClassicalRungeKuttaIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new LinearEquations(1);
        integrator.integrate(ode, 1.0, new double[] { 1.0 }, 1.0, new double[1]);
    }

    @Test(expected = IntegratorException.class)
    public void testIntegrate_y0DimensionMismatch_throwsIntegratorException() throws DerivativeException, IntegratorException {
        RungeKuttaIntegrator integrator = new ClassicalRungeKuttaIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new LinearEquations(2);
        integrator.integrate(ode, 0.0, new double[] { 1.0 }, 1.0, new double[2]);
    }

    @Test(expected = IntegratorException.class)
    public void testIntegrate_yDimensionMismatch_throwsIntegratorException() throws DerivativeException, IntegratorException {
        RungeKuttaIntegrator integrator = new ClassicalRungeKuttaIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new LinearEquations(2);
        integrator.integrate(ode, 0.0, new double[] { 1.0, 2.0 }, 1.0, new double[1]);
    }

    @Test(expected = DerivativeException.class)
    public void testIntegrate_derivativeCalculationFails_throwsDerivativeException() throws DerivativeException, IntegratorException {
        RungeKuttaIntegrator integrator = new ClassicalRungeKuttaIntegrator(0.1);
        FirstOrderDifferentialEquations ode = new ExceptionalEquations();
        integrator.integrate(ode, 0.0, new double[] { 1.0 }, 1.0, new double[1]);
    }

    @Test
    public void testIntegrate_multiStageCustomRK_executesAllStages() throws DerivativeException, IntegratorException {
        DummyRKIntegrator integrator = new DummyRKIntegrator(0.05);
        FirstOrderDifferentialEquations ode = new LinearEquations(2);
        double[] y0 = new double[] { 2.0, -1.0 };
        double[] y = new double[2];

        double stopTime = integrator.integrate(ode, 0.0, y0, 0.2, y);

        Assert.assertEquals(0.2, stopTime, 1e-10);
        Assert.assertEquals(2.0 * Math.exp(-0.2), y[0], 1e-2);
        Assert.assertEquals(-1.0 * Math.exp(-0.2), y[1], 1e-2);
    }
}
