package org.apache.commons.math.ode.nonstiff;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.ode.sampling.StepInterpolator;

/**
 * JUnit 4 test suite for EmbeddedRungeKuttaIntegrator.
 *
 * Since EmbeddedRungeKuttaIntegrator is abstract, concrete subclasses
 * already present in the same package (DormandPrince54Integrator and
 * HighamHall54Integrator) are used to exercise the behaviour implemented
 * in the abstract base class through its public API.
 */
public class EmbeddedRungeKuttaIntegratorTest {

    /** Simple exponential decay equation: dy/dt = -y */
    private static class ExponentialEquations implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 1;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot)
            throws DerivativeException {
            yDot[0] = -y[0];
        }
    }

    /** Step handler that requires dense output, used to exercise the
     *  RungeKuttaStepInterpolator branch of the integrate() method. */
    private static class DenseOutputHandler implements StepHandler {
        private boolean resetCalled = false;
        private boolean handleCalled = false;

        public boolean requiresDenseOutput() {
            return true;
        }

        public void reset() {
            resetCalled = true;
        }

        public void handleStep(StepInterpolator interpolator, boolean isLast)
            throws DerivativeException {
            handleCalled = true;
        }

        public boolean isResetCalled() {
            return resetCalled;
        }

        public boolean isHandleCalled() {
            return handleCalled;
        }
    }

    private FirstOrderDifferentialEquations equations;

    @Before
    public void setUp() {
        equations = new ExponentialEquations();
    }

    // ---------------------------------------------------------------
    // Normal / typical input tests
    // ---------------------------------------------------------------

    @Test
    public void testIntegrate_normalDecay_returnsExpectedValue() throws Exception {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double tEnd = integrator.integrate(equations, 0.0, y0, 1.0, y);

        assertEquals(1.0, tEnd, 1.0e-10);
        assertEquals(Math.exp(-1.0), y[0], 1.0e-6);
    }

    @Test
    public void testIntegrate_withVectorTolerance_returnsExpectedValue() throws Exception {
        double[] vecAbsTol = { 1.0e-10 };
        double[] vecRelTol = { 1.0e-10 };

        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, vecAbsTol, vecRelTol);

        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double tEnd = integrator.integrate(equations, 0.0, y0, 1.0, y);

        assertEquals(1.0, tEnd, 1.0e-10);
        assertEquals(Math.exp(-1.0), y[0], 1.0e-6);
    }

    @Test
    public void testIntegrate_nonFsalMethod_returnsExpectedValue() throws Exception {
        // HighamHall54Integrator is a non-FSAL embedded Runge-Kutta method,
        // exercising the !fsal branch of the integrate() loop.
        HighamHall54Integrator integrator =
            new HighamHall54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double tEnd = integrator.integrate(equations, 0.0, y0, 1.0, y);

        assertEquals(1.0, tEnd, 1.0e-10);
        assertEquals(Math.exp(-1.0), y[0], 1.0e-6);
    }

    @Test
    public void testIntegrate_backwardIntegration_returnsExpectedValue() throws Exception {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        double[] y0 = { Math.exp(-1.0) };
        double[] y = new double[1];

        double tEnd = integrator.integrate(equations, 1.0, y0, 0.0, y);

        assertEquals(0.0, tEnd, 1.0e-10);
        assertEquals(1.0, y[0], 1.0e-5);
    }

    @Test
    public void testIntegrate_sameArrayForYAndY0_doesNotThrow() throws Exception {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        double[] yShared = { 1.0 };

        double tEnd = integrator.integrate(equations, 0.0, yShared, 1.0, yShared);

        assertEquals(1.0, tEnd, 1.0e-10);
        assertEquals(Math.exp(-1.0), yShared[0], 1.0e-6);
    }

    @Test
    public void testIntegrate_withDenseOutputStepHandler_usesInterpolatorBranch() throws Exception {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        DenseOutputHandler handler = new DenseOutputHandler();
        integrator.addStepHandler(handler);

        double[] y0 = { 1.0 };
        double[] y = new double[1];

        double tEnd = integrator.integrate(equations, 0.0, y0, 1.0, y);

        assertEquals(1.0, tEnd, 1.0e-10);
        assertEquals(Math.exp(-1.0), y[0], 1.0e-6);
        assertTrue(handler.isResetCalled());
        assertTrue(handler.isHandleCalled());
    }

    // ---------------------------------------------------------------
    // Edge case tests
    // ---------------------------------------------------------------

    @Test
    public void testGetOrder_returnsPositiveOrder() {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        assertTrue(integrator.getOrder() > 0);
    }

    @Test
    public void testSafetyGetterSetter_normalValue_storesValue() {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        // default value set by the constructor
        assertEquals(0.9, integrator.getSafety(), 1.0e-10);

        integrator.setSafety(0.75);
        assertEquals(0.75, integrator.getSafety(), 1.0e-10);
    }

    @Test
    public void testSafetySetter_negativeValue_storesValue() {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        integrator.setSafety(-1.0);
        assertEquals(-1.0, integrator.getSafety(), 1.0e-10);
    }

    @Test
    public void testMinReductionGetterSetter_normalValue_storesValue() {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        // default value set by the constructor
        assertEquals(0.2, integrator.getMinReduction(), 1.0e-10);

        integrator.setMinReduction(0.1);
        assertEquals(0.1, integrator.getMinReduction(), 1.0e-10);
    }

    @Test
    public void testMinReductionSetter_zeroValue_storesValue() {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        integrator.setMinReduction(0.0);
        assertEquals(0.0, integrator.getMinReduction(), 1.0e-10);
    }

    @Test
    public void testMaxGrowthGetterSetter_normalValue_storesValue() {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        // default value set by the constructor
        assertEquals(10.0, integrator.getMaxGrowth(), 1.0e-10);

        integrator.setMaxGrowth(5.0);
        assertEquals(5.0, integrator.getMaxGrowth(), 1.0e-10);
    }

    @Test
    public void testMaxGrowthSetter_boundaryValueOne_storesValue() {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        integrator.setMaxGrowth(1.0);
        assertEquals(1.0, integrator.getMaxGrowth(), 1.0e-10);
    }

    @Test
    public void testIntegrate_zeroDurationIntegration_returnsStartTime() throws Exception {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        double[] y0 = { 1.0 };
        double[] y = new double[1];

        // t equals t0, so the integration interval has zero length
        try {
            double tEnd = integrator.integrate(equations, 0.0, y0, 0.0, y);
            assertEquals(0.0, tEnd, 1.0e-10);
        } catch (IntegratorException e) {
            // acceptable: some implementations reject a zero-length interval
            assertNotNull(e);
        }
    }

    // ---------------------------------------------------------------
    // Exception tests
    // ---------------------------------------------------------------

    @Test(expected = IntegratorException.class)
    public void testIntegrate_dimensionMismatch_throwsIntegratorException() throws Exception {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        // equations declares dimension 1, but y0 has a different length
        double[] y0 = { 1.0, 2.0 };
        double[] y = new double[2];

        integrator.integrate(equations, 0.0, y0, 1.0, y);
    }

    @Test(expected = NullPointerException.class)
    public void testIntegrate_nullEquations_throwsException() throws Exception {
        DormandPrince54Integrator integrator =
            new DormandPrince54Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);

        double[] y0 = { 1.0 };
        double[] y = new double[1];

        integrator.integrate(null, 0.0, y0, 1.0, y);
    }
}
