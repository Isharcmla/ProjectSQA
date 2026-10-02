import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.MaxCountExceededException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.ode.events.EventHandler;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class AbstractIntegratorTest {

    /** Simple concrete subclass used to exercise AbstractIntegrator behavior. */
    private static class TestIntegrator extends AbstractIntegrator {

        public TestIntegrator(String name) {
            super(name);
        }

        public TestIntegrator() {
            super();
        }

        @Override
        public void integrate(ExpandableStatefulODE equations, double t)
            throws org.apache.commons.math.exception.MathIllegalStateException,
                   org.apache.commons.math.exception.MathIllegalArgumentException {

            sanityChecks(equations, t);
            setEquations(equations);
            setStateInitialized(false);

            stepStart = equations.getTime();
            stepSize = t - stepStart;
            isLastStep = false;

            double[] y = equations.getPrimaryState();
            double[] yDot = new double[y.length];
            computeDerivatives(stepStart, y, yDot);

            // simple explicit Euler step, single step integration
            for (int i = 0; i < y.length; i++) {
                y[i] += stepSize * yDot[i];
            }

            equations.setPrimaryState(y);
            equations.setTime(t);
            isLastStep = true;
        }

        // expose protected methods for direct testing
        public void callSanityChecks(ExpandableStatefulODE equations, double t) {
            sanityChecks(equations, t);
        }

        public void callComputeDerivatives(double t, double[] y, double[] yDot) {
            computeDerivatives(t, y, yDot);
        }

        public void callSetEquations(ExpandableStatefulODE equations) {
            setEquations(equations);
        }
    }

    /** Simple linear differential equation for testing: y' = constant. */
    private static class LinearEquations implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 2;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = 1.0;
            yDot[1] = 2.0;
        }
    }

    /** Dummy event handler implementation based on known commons-math EventHandler API. */
    private static class DummyEventHandler implements EventHandler {
        public void init(double t0, double[] y0, double t) {
            // no-op
        }

        public double g(double t, double[] y) {
            return 1.0;
        }

        public int eventOccurred(double t, double[] y, boolean increasing) {
            return EventHandler.CONTINUE;
        }

        public void resetState(double t, double[] y) {
            // no-op
        }
    }

    private TestIntegrator integrator;

    @Before
    public void setUp() {
        integrator = new TestIntegrator("testIntegrator");
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_withName_nameIsSet() {
        TestIntegrator ti = new TestIntegrator("myIntegrator");
        assertEquals("myIntegrator", ti.getName());
    }

    @Test
    public void testConstructor_noArg_nameIsNull() {
        TestIntegrator ti = new TestIntegrator();
        assertNull(ti.getName());
    }

    // ---------------------------------------------------------------
    // getName
    // ---------------------------------------------------------------

    @Test
    public void testGetName_normalInput_returnsCorrectName() {
        assertEquals("testIntegrator", integrator.getName());
    }

    // ---------------------------------------------------------------
    // StepHandler related
    // ---------------------------------------------------------------

    @Test
    public void testAddStepHandler_normalInput_handlerAdded() {
        org.apache.commons.math.ode.sampling.StepHandler handler =
            new org.apache.commons.math.ode.sampling.StepHandler() {
                public void init(double t0, double[] y0, double t) {}
                public void handleStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator,
                                        boolean isLast) {}
            };
        integrator.addStepHandler(handler);
        Collection<org.apache.commons.math.ode.sampling.StepHandler> handlers = integrator.getStepHandlers();
        assertEquals(1, handlers.size());
        assertTrue(handlers.contains(handler));
    }

    @Test
    public void testGetStepHandlers_emptyByDefault_returnsEmptyCollection() {
        Collection<org.apache.commons.math.ode.sampling.StepHandler> handlers = integrator.getStepHandlers();
        assertNotNull(handlers);
        assertTrue(handlers.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetStepHandlers_unmodifiableCollection_throwsException() {
        Collection<org.apache.commons.math.ode.sampling.StepHandler> handlers = integrator.getStepHandlers();
        handlers.clear();
    }

    @Test
    public void testClearStepHandlers_afterAdding_collectionIsEmpty() {
        org.apache.commons.math.ode.sampling.StepHandler handler =
            new org.apache.commons.math.ode.sampling.StepHandler() {
                public void init(double t0, double[] y0, double t) {}
                public void handleStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator,
                                        boolean isLast) {}
            };
        integrator.addStepHandler(handler);
        integrator.clearStepHandlers();
        assertTrue(integrator.getStepHandlers().isEmpty());
    }

    // ---------------------------------------------------------------
    // EventHandler related
    // ---------------------------------------------------------------

    @Test
    public void testAddEventHandler_withoutSolver_handlerAdded() {
        EventHandler handler = new DummyEventHandler();
        integrator.addEventHandler(handler, 1.0, 1.0e-6, 100);
        Collection<EventHandler> handlers = integrator.getEventHandlers();
        assertEquals(1, handlers.size());
        assertTrue(handlers.contains(handler));
    }

    @Test
    public void testAddEventHandler_withSolver_handlerAdded() {
        EventHandler handler = new DummyEventHandler();
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1.0e-6, 5);
        integrator.addEventHandler(handler, 1.0, 1.0e-6, 100, solver);
        Collection<EventHandler> handlers = integrator.getEventHandlers();
        assertEquals(1, handlers.size());
        assertTrue(handlers.contains(handler));
    }

    @Test
    public void testGetEventHandlers_emptyByDefault_returnsEmptyCollection() {
        Collection<EventHandler> handlers = integrator.getEventHandlers();
        assertNotNull(handlers);
        assertTrue(handlers.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetEventHandlers_unmodifiableCollection_throwsException() {
        Collection<EventHandler> handlers = integrator.getEventHandlers();
        handlers.clear();
    }

    @Test
    public void testClearEventHandlers_afterAdding_collectionIsEmpty() {
        EventHandler handler = new DummyEventHandler();
        integrator.addEventHandler(handler, 1.0, 1.0e-6, 100);
        integrator.clearEventHandlers();
        assertTrue(integrator.getEventHandlers().isEmpty());
    }

    // ---------------------------------------------------------------
    // Current step start / stepsize
    // ---------------------------------------------------------------

    @Test
    public void testGetCurrentStepStart_beforeIntegration_isNaN() {
        assertTrue(Double.isNaN(integrator.getCurrentStepStart()));
    }

    @Test
    public void testGetCurrentSignedStepsize_beforeIntegration_isNaN() {
        assertTrue(Double.isNaN(integrator.getCurrentSignedStepsize()));
    }

    @Test
    public void testGetCurrentStepStart_afterIntegration_isSet() {
        LinearEquations eqs = new LinearEquations();
        double[] y0 = {0.0, 0.0};
        double[] y = new double[2];
        integrator.integrate(eqs, 0.0, y0, 1.0, y);
        assertEquals(0.0, integrator.getCurrentStepStart(), 1.0e-10);
    }

    // ---------------------------------------------------------------
    // Max evaluations
    // ---------------------------------------------------------------

    @Test
    public void testSetMaxEvaluations_positiveValue_setsCorrectly() {
        integrator.setMaxEvaluations(100);
        assertEquals(100, integrator.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluations_negativeValue_setsToIntegerMax() {
        integrator.setMaxEvaluations(-5);
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluations_zeroValue_setsToZero() {
        integrator.setMaxEvaluations(0);
        assertEquals(0, integrator.getMaxEvaluations());
    }

    // ---------------------------------------------------------------
    // Evaluations counting
    // ---------------------------------------------------------------

    @Test
    public void testGetEvaluations_beforeAnyComputation_isZero() {
        assertEquals(0, integrator.getEvaluations());
    }

    @Test
    public void testGetEvaluations_afterComputeDerivatives_incremented() {
        LinearEquations eqs = new LinearEquations();
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(eqs);
        expandable.setTime(0.0);
        expandable.setPrimaryState(new double[]{0.0, 0.0});
        integrator.callSetEquations(expandable);

        double[] y = {0.0, 0.0};
        double[] yDot = new double[2];
        integrator.callComputeDerivatives(0.0, y, yDot);

        assertEquals(1, integrator.getEvaluations());
        assertEquals(1.0, yDot[0], 1.0e-10);
        assertEquals(2.0, yDot[1], 1.0e-10);
    }

    @Test(expected = MaxCountExceededException.class)
    public void testComputeDerivatives_exceedMaxEvaluations_throwsException() {
        LinearEquations eqs = new LinearEquations();
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(eqs);
        expandable.setTime(0.0);
        expandable.setPrimaryState(new double[]{0.0, 0.0});
        integrator.callSetEquations(expandable);
        integrator.setMaxEvaluations(1);

        double[] y = {0.0, 0.0};
        double[] yDot = new double[2];
        integrator.callComputeDerivatives(0.0, y, yDot);
        // second call should exceed max evaluations
        integrator.callComputeDerivatives(0.0, y, yDot);
    }

    // ---------------------------------------------------------------
    // integrate(FirstOrderDifferentialEquations, ...)
    // ---------------------------------------------------------------

    @Test
    public void testIntegrate_normalInput_returnsCorrectResult() {
        LinearEquations eqs = new LinearEquations();
        double[] y0 = {0.0, 0.0};
        double[] y = new double[2];
        double finalT = integrator.integrate(eqs, 0.0, y0, 1.0, y);

        assertEquals(1.0, finalT, 1.0e-10);
        assertEquals(1.0, y[0], 1.0e-10);
        assertEquals(2.0, y[1], 1.0e-10);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_y0DimensionMismatch_throwsException() {
        LinearEquations eqs = new LinearEquations();
        double[] y0 = {0.0}; // wrong dimension
        double[] y = new double[2];
        integrator.integrate(eqs, 0.0, y0, 1.0, y);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_yDimensionMismatch_throwsException() {
        LinearEquations eqs = new LinearEquations();
        double[] y0 = {0.0, 0.0};
        double[] y = new double[1]; // wrong dimension
        integrator.integrate(eqs, 0.0, y0, 1.0, y);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate_tooSmallIntegrationSpan_throwsException() {
        LinearEquations eqs = new LinearEquations();
        double[] y0 = {0.0, 0.0};
        double[] y = new double[2];
        // t0 == t -> too small interval
        integrator.integrate(eqs, 0.0, y0, 0.0, y);
    }

    // ---------------------------------------------------------------
    // integrate(ExpandableStatefulODE, double) - abstract method via subclass
    // ---------------------------------------------------------------

    @Test
    public void testIntegrateExpandable_normalInput_updatesState() {
        LinearEquations eqs = new LinearEquations();
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(eqs);
        expandable.setTime(0.0);
        expandable.setPrimaryState(new double[]{5.0, 5.0});

        integrator.integrate(expandable, 2.0);

        assertEquals(2.0, expandable.getTime(), 1.0e-10);
        assertEquals(7.0, expandable.getPrimaryState()[0], 1.0e-10);
        assertEquals(9.0, expandable.getPrimaryState()[1], 1.0e-10);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrateExpandable_tooSmallSpan_throwsException() {
        LinearEquations eqs = new LinearEquations();
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(eqs);
        expandable.setTime(0.0);
        expandable.setPrimaryState(new double[]{0.0, 0.0});

        integrator.integrate(expandable, 0.0);
    }

    // ---------------------------------------------------------------
    // sanityChecks direct testing
    // ---------------------------------------------------------------

    @Test
    public void testSanityChecks_validSpan_doesNotThrow() {
        LinearEquations eqs = new LinearEquations();
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(eqs);
        expandable.setTime(0.0);
        expandable.setPrimaryState(new double[]{0.0, 0.0});

        integrator.callSanityChecks(expandable, 10.0);
        // no exception expected
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks_zeroSpan_throwsException() {
        LinearEquations eqs = new LinearEquations();
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(eqs);
        expandable.setTime(5.0);
        expandable.setPrimaryState(new double[]{0.0, 0.0});

        integrator.callSanityChecks(expandable, 5.0);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks_negativeSmallSpan_throwsException() {
        LinearEquations eqs = new LinearEquations();
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(eqs);
        expandable.setTime(-1.0);
        expandable.setPrimaryState(new double[]{0.0, 0.0});

        integrator.callSanityChecks(expandable, -1.0);
    }

    // ---------------------------------------------------------------
    // Backward integration edge case
    // ---------------------------------------------------------------

    @Test
    public void testIntegrate_backwardIntegration_returnsCorrectResult() {
        LinearEquations eqs = new LinearEquations();
        double[] y0 = {10.0, 10.0};
        double[] y = new double[2];
        double finalT = integrator.integrate(eqs, 5.0, y0, 0.0, y);

        assertEquals(0.0, finalT, 1.0e-10);
        assertEquals(10.0 - 5.0, y[0], 1.0e-10);
        assertEquals(10.0 - 10.0, y[1], 1.0e-10);
    }
}
