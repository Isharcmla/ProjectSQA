package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;

/**
 * Test suite for RungeKuttaIntegrator (abstract class).
 * Since RungeKuttaIntegrator is abstract, we exercise its behavior
 * through the concrete subclass EulerIntegrator which is part of the
 * same library and directly extends RungeKuttaIntegrator without
 * overriding the integrate() method.
 */
public class RungeKuttaIntegratorTest {

    /** Simple decay equation: dy/dt = -y */
    private static class DecayEquations implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 1;
        }
        public void computeDerivatives(double t, double[] y, double[] yDot)
                throws DerivativeException {
            yDot[0] = -y[0];
        }
    }

    /** Equation with dimension 2, used to test mismatched dimension errors. */
    private static class TwoDimEquations implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 2;
        }
        public void computeDerivatives(double t, double[] y, double[] yDot)
                throws DerivativeException {
            yDot[0] = -y[0];
            yDot[1] = -y[1];
        }
    }

    /** Simple counting step handler, dense output not required. */
    private static class CountingStepHandler implements StepHandler {
        int resetCount = 0;
        int handleStepCount = 0;
        boolean lastSeen = false;

        public boolean requiresDenseOutput() {
            return false;
        }

        public void reset() {
            resetCount++;
        }

        public void handleStep(StepInterpolator interpolator, boolean isLast)
                throws DerivativeException {
            handleStepCount++;
            lastSeen = isLast;
        }
    }

    /** Step handler that requires dense output, to exercise the
     * RungeKuttaStepInterpolator branch inside integrate(). */
    private static class DenseOutputStepHandler implements StepHandler {
        int handleStepCount = 0;

        public boolean requiresDenseOutput() {
            return true;
        }

        public void reset() {
            // nothing to do
        }

        public void handleStep(StepInterpolator interpolator, boolean isLast)
                throws DerivativeException {
            handleStepCount++;
            // exercise interpolator API a bit
            double t = interpolator.getCurrentTime();
            assertFalse(Double.isNaN(t));
        }
    }

    private DecayEquations decayEquations;

    @Before
    public void setUp() {
        decayEquations = new DecayEquations();
    }

    // -----------------------------------------------------------------
    // (ก) Normal / typical input cases
    // -----------------------------------------------------------------

    @Test
    public void testIntegrate_forwardIntegration_returnsFinalTime()
            throws DerivativeException, IntegratorException {
        EulerIntegrator integrator = new EulerIntegrator(0.1);
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double result = integrator.integrate(decayEquations, 0.0, y0, 1.0, y);

        assertEquals(1.0, result, 1.0e-10);
        // Euler method with step 0.1 over 10 steps: y = (0.9)^10
        double expected = Math.pow(0.9, 10);
        assertEquals(expected, y[0], 1.0e-9);
    }

    @Test
    public void testIntegrate_backwardIntegration_returnsFinalTime()
            throws DerivativeException, IntegratorException {
        EulerIntegrator integrator = new EulerIntegrator(0.1);
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double result = integrator.integrate(decayEquations, 1.0, y0, 0.0, y);

        assertEquals(0.0, result, 1.0e-10);
        // Backward Euler stepping: y multiplies by (1 + 0.1) each of 10 steps
        double expected = Math.pow(1.1, 10);
        assertEquals(expected, y[0], 1.0e-9);
    }

    @Test
    public void testIntegrate_withStepHandler_handlerInvokedProperly()
            throws DerivativeException, IntegratorException {
        EulerIntegrator integrator = new EulerIntegrator(0.5);
        CountingStepHandler handler = new CountingStepHandler();
        integrator.addStepHandler(handler);

        double[] y0 = { 2.0 };
        double[] y = new double[1];

        double result = integrator.integrate(decayEquations, 0.0, y0, 1.0, y);

        assertEquals(1.0, result, 1.0e-10);
        assertTrue(handler.resetCount >= 1);
        assertTrue(handler.handleStepCount >= 1);
        assertTrue(handler.lastSeen);
    }

    @Test
    public void testIntegrate_withDenseOutputStepHandler_usesInterpolator()
            throws DerivativeException, IntegratorException {
        EulerIntegrator integrator = new EulerIntegrator(0.25);
        DenseOutputStepHandler handler = new DenseOutputStepHandler();
        integrator.addStepHandler(handler);

        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double result = integrator.integrate(decayEquations, 0.0, y0, 1.0, y);

        assertEquals(1.0, result, 1.0e-10);
        assertTrue(handler.handleStepCount >= 1);
    }

    // -----------------------------------------------------------------
    // (ข) Edge cases: same array reference, zero-length-like boundary
    // -----------------------------------------------------------------

    @Test
    public void testIntegrate_sameArrayReferenceForYAndY0_updatesInPlace()
            throws DerivativeException, IntegratorException {
        EulerIntegrator integrator = new EulerIntegrator(0.1);
        double[] y = { 1.0 };

        // pass same array reference for y0 and y to skip the arraycopy branch
        double result = integrator.integrate(decayEquations, 0.0, y, 1.0, y);

        assertEquals(1.0, result, 1.0e-10);
        double expected = Math.pow(0.9, 10);
        assertEquals(expected, y[0], 1.0e-9);
    }

    @Test
    public void testIntegrate_verySmallInterval_stillCompletes()
            throws DerivativeException, IntegratorException {
        EulerIntegrator integrator = new EulerIntegrator(0.01);
        double[] y0 = { 5.0 };
        double[] y = new double[1];

        double result = integrator.integrate(decayEquations, 0.0, y0, 0.05, y);

        assertEquals(0.05, result, 1.0e-9);
        assertTrue(y[0] < 5.0);
        assertTrue(y[0] > 0.0);
    }

    @Test
    public void testIntegrate_largeStepLargerThanInterval_singleStepClamped()
            throws DerivativeException, IntegratorException {
        // step larger than the whole interval: integrator should still
        // complete using an adjusted step internally.
        EulerIntegrator integrator = new EulerIntegrator(10.0);
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double result = integrator.integrate(decayEquations, 0.0, y0, 1.0, y);

        assertEquals(1.0, result, 1.0e-9);
    }

    // -----------------------------------------------------------------
    // (ค) Exception cases
    // -----------------------------------------------------------------

    @Test(expected = IntegratorException.class)
    public void testIntegrate_dimensionMismatch_throwsIntegratorException()
            throws DerivativeException, IntegratorException {
        EulerIntegrator integrator = new EulerIntegrator(0.1);
        TwoDimEquations eqs = new TwoDimEquations();
        // y0 length (1) does not match equations dimension (2)
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        integrator.integrate(eqs, 0.0, y0, 1.0, y);
    }

    @Test(expected = IntegratorException.class)
    public void testIntegrate_equalStartAndEndTime_throwsIntegratorException()
            throws DerivativeException, IntegratorException {
        EulerIntegrator integrator = new EulerIntegrator(0.1);
        double[] y0 = { 1.0 };
        double[] y = new double[1];

        // t0 == t -> integration interval too small, should trigger
        // a sanity check failure from AbstractIntegrator.sanityChecks
        integrator.integrate(decayEquations, 0.0, y0, 0.0, y);
    }

    @Test(expected = IntegratorException.class)
    public void testIntegrate_mismatchedResultArrayLength_throwsIntegratorException()
            throws DerivativeException, IntegratorException {
        EulerIntegrator integrator = new EulerIntegrator(0.1);
        double[] y0 = { 1.0 };
        // y has wrong length compared to y0/equations dimension
        double[] y = new double[2];

        integrator.integrate(decayEquations, 0.0, y0, 1.0, y);
    }
}
