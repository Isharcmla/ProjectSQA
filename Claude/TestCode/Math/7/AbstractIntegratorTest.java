import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.AbstractIntegrator;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;

import java.util.Collection;

public class AbstractIntegratorTest {

    /** Simple ODE: dy/dt = 1, dimension = 1 */
    private static class SimpleODE implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 1;
        }
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = 1.0;
        }
    }

    /** ODE with configurable dimension */
    private static class DimensionODE implements FirstOrderDifferentialEquations {
        private final int dim;
        public DimensionODE(int dim) {
            this.dim = dim;
        }
        public int getDimension() {
            return dim;
        }
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < dim; i++) {
                yDot[i] = 1.0;
            }
        }
    }

    /** Minimal StepHandler that records whether init/handleStep were called */
    private static class FlagStepHandler implements StepHandler {
        boolean initCalled = false;
        boolean handleStepCalled = false;
        public void init(double t0, double[] y0, double t) {
            initCalled = true;
        }
        public void handleStep(StepInterpolator interpolator, boolean isLast) {
            handleStepCalled = true;
        }
    }

    /** Minimal EventHandler that records whether init was called */
    private static class FlagEventHandler implements EventHandler {
        boolean initCalled = false;
        public void init(double t0, double[] y0, double t) {
            initCalled = true;
        }
        public double g(double t, double[] y) {
            return 1.0;
        }
        public Action eventOccurred(double t, double[] y, boolean increasing) {
            return Action.CONTINUE;
        }
        public void resetState(double t, double[] y) {
            // no-op
        }
    }

    /** Concrete integrator implementation for testing purposes.
     *  Implements a trivial (explicit Euler, single-step) integration
     *  so the abstract contract can be exercised without needing
     *  AbstractStepInterpolator (whose API is not provided).
     */
    private static class TestIntegrator extends AbstractIntegrator {

        public TestIntegrator(String name) {
            super(name);
        }

        public TestIntegrator() {
            super();
        }

        @Override
        public void integrate(ExpandableStatefulODE equations, double t)
            throws NumberIsTooSmallException, DimensionMismatchException,
                   MaxCountExceededException {

            sanityChecks(equations, t);
            setEquations(equations);

            double t0 = equations.getTime();
            double[] y0 = equations.getPrimaryState();

            initIntegration(t0, y0, t);

            double[] yDot = new double[y0.length];
            computeDerivatives(t0, y0, yDot);

            double[] y = new double[y0.length];
            for (int i = 0; i < y0.length; i++) {
                y[i] = y0[i] + (t - t0) * yDot[i];
            }

            equations.setTime(t);
            equations.setPrimaryState(y);

            stepStart = t;
            stepSize = t - t0;
            isLastStep = true;
        }

        /** Expose protected setEquations for test purposes. */
        public void prepareEquations(ExpandableStatefulODE eq) {
            setEquations(eq);
        }

        /** Expose protected sanityChecks for test purposes. */
        public void callSanityChecks(ExpandableStatefulODE eq, double t) {
            sanityChecks(eq, t);
        }

        /** Expose protected initIntegration for test purposes. */
        public void callInitIntegration(double t0, double[] y0, double t) {
            initIntegration(t0, y0, t);
        }
    }

    private TestIntegrator integrator;

    @Before
    public void setUp() {
        integrator = new TestIntegrator("TestMethod");
    }

    // ---------------------------------------------------------------
    // getName
    // ---------------------------------------------------------------

    @Test
    public void testGetName_withName_returnsName() {
        assertEquals("TestMethod", integrator.getName());
    }

    @Test
    public void testGetName_withNullName_returnsNull() {
        TestIntegrator nullNamed = new TestIntegrator();
        assertNull(nullNamed.getName());
    }

    // ---------------------------------------------------------------
    // Step handlers
    // ---------------------------------------------------------------

    @Test
    public void testAddStepHandler_addsHandler() {
        FlagStepHandler handler = new FlagStepHandler();
        integrator.addStepHandler(handler);
        assertEquals(1, integrator.getStepHandlers().size());
        assertTrue(integrator.getStepHandlers().contains(handler));
    }

    @Test
    public void testGetStepHandlers_initiallyEmpty() {
        assertTrue(integrator.getStepHandlers().isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetStepHandlers_returnsUnmodifiableCollection_throwsOnModify() {
        Collection<StepHandler> handlers = integrator.getStepHandlers();
        handlers.add(new FlagStepHandler());
    }

    @Test
    public void testClearStepHandlers_clearsAll() {
        integrator.addStepHandler(new FlagStepHandler());
        integrator.addStepHandler(new FlagStepHandler());
        assertEquals(2, integrator.getStepHandlers().size());
        integrator.clearStepHandlers();
        assertTrue(integrator.getStepHandlers().isEmpty());
    }

    // ---------------------------------------------------------------
    // Event handlers
    // ---------------------------------------------------------------

    @Test
    public void testAddEventHandler_withDefaultSolver_addsHandler() {
        FlagEventHandler handler = new FlagEventHandler();
        integrator.addEventHandler(handler, 1.0, 1.0e-6, 100);
        assertEquals(1, integrator.getEventHandlers().size());
        assertTrue(integrator.getEventHandlers().contains(handler));
    }

    @Test
    public void testAddEventHandler_withCustomSolver_addsHandler() {
        FlagEventHandler handler = new FlagEventHandler();
        UnivariateSolver solver = new BracketingNthOrderBrentSolver(1.0e-6, 5);
        integrator.addEventHandler(handler, 1.0, 1.0e-6, 100, solver);
        assertEquals(1, integrator.getEventHandlers().size());
        assertTrue(integrator.getEventHandlers().contains(handler));
    }

    @Test
    public void testGetEventHandlers_initiallyEmpty() {
        assertTrue(integrator.getEventHandlers().isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetEventHandlers_returnsUnmodifiableCollection_throwsOnModify() {
        FlagEventHandler handler = new FlagEventHandler();
        integrator.addEventHandler(handler, 1.0, 1.0e-6, 100);
        Collection<EventHandler> handlers = integrator.getEventHandlers();
        handlers.add(new FlagEventHandler());
    }

    @Test
    public void testClearEventHandlers_clearsAll() {
        integrator.addEventHandler(new FlagEventHandler(), 1.0, 1.0e-6, 100);
        integrator.addEventHandler(new FlagEventHandler(), 1.0, 1.0e-6, 100);
        assertEquals(2, integrator.getEventHandlers().size());
        integrator.clearEventHandlers();
        assertTrue(integrator.getEventHandlers().isEmpty());
    }

    // ---------------------------------------------------------------
    // Step start / step size getters
    // ---------------------------------------------------------------

    @Test
    public void testGetCurrentStepStart_initialValue_isNaN() {
        assertTrue(Double.isNaN(integrator.getCurrentStepStart()));
    }

    @Test
    public void testGetCurrentSignedStepsize_initialValue_isNaN() {
        assertTrue(Double.isNaN(integrator.getCurrentSignedStepsize()));
    }

    @Test
    public void testGetCurrentStepStart_afterIntegration_returnsFinalTime() {
        ExpandableStatefulODE equations = new ExpandableStatefulODE(new SimpleODE());
        equations.setTime(0.0);
        equations.setPrimaryState(new double[]{0.0});
        integrator.integrate(equations, 5.0);
        assertEquals(5.0, integrator.getCurrentStepStart(), 1.0e-10);
    }

    @Test
    public void testGetCurrentSignedStepsize_afterIntegration_returnsStepSize() {
        ExpandableStatefulODE equations = new ExpandableStatefulODE(new SimpleODE());
        equations.setTime(0.0);
        equations.setPrimaryState(new double[]{0.0});
        integrator.integrate(equations, 5.0);
        assertEquals(5.0, integrator.getCurrentSignedStepsize(), 1.0e-10);
    }

    // ---------------------------------------------------------------
    // Max evaluations
    // ---------------------------------------------------------------

    @Test
    public void testSetMaxEvaluations_positiveValue_setsMax() {
        integrator.setMaxEvaluations(100);
        assertEquals(100, integrator.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluations_negativeValue_setsIntegerMax() {
        integrator.setMaxEvaluations(-5);
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluations_zeroValue_setsZero() {
        integrator.setMaxEvaluations(0);
        assertEquals(0, integrator.getMaxEvaluations());
    }

    @Test
    public void testGetMaxEvaluations_defaultConstructor_isIntegerMax() {
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
    }

    // ---------------------------------------------------------------
    // Evaluations count
    // ---------------------------------------------------------------

    @Test
    public void testGetEvaluations_initial_returnsZero() {
        assertEquals(0, integrator.getEvaluations());
    }

    @Test
    public void testComputeDerivatives_incrementsEvaluationCount() {
        ExpandableStatefulODE equations = new ExpandableStatefulODE(new SimpleODE());
        equations.setTime(0.0);
        equations.setPrimaryState(new double[]{0.0});
        integrator.prepareEquations(equations);

        double[] y = new double[]{0.0};
        double[] yDot = new double[1];
        integrator.computeDerivatives(0.0, y, yDot);

        assertEquals(1, integrator.getEvaluations());
        assertEquals(1.0, yDot[0], 1.0e-10);
    }

    @Test(expected = MaxCountExceededException.class)
    public void testComputeDerivatives_exceedsMaxEvaluations_throwsMaxCountExceededException() {
        ExpandableStatefulODE equations = new ExpandableStatefulODE(new SimpleODE());
        equations.setTime(0.0);
        equations.setPrimaryState(new double[]{0.0});
        integrator.prepareEquations(equations);
        integrator.setMaxEvaluations(1);

        double[] y = new double[]{0.0};
        double[] yDot = new double[1];

        integrator.computeDerivatives(0.0, y, yDot);
        integrator.computeDerivatives(0.0, y, yDot);
    }

    // ---------------------------------------------------------------
    // sanityChecks
    // ---------------------------------------------------------------

    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks_tooSmallInterval_throwsNumberIsTooSmallException() {
        ExpandableStatefulODE equations = new ExpandableStatefulODE(new SimpleODE());
        equations.setTime(0.0);
        equations.setPrimaryState(new double[]{0.0});
        integrator.callSanityChecks(equations, 0.0);
    }

    @Test
    public void testSanityChecks_validInterval_doesNotThrow() {
        ExpandableStatefulODE equations = new ExpandableStatefulODE(new SimpleODE());
        equations.setTime(0.0);
        equations.setPrimaryState(new double[]{0.0});
        integrator.callSanityChecks(equations, 10.0);
        // no exception expected
    }

    // ---------------------------------------------------------------
    // initIntegration
    // ---------------------------------------------------------------

    @Test
    public void testInitIntegration_callsInitOnHandlers() {
        FlagStepHandler stepHandler = new FlagStepHandler();
        FlagEventHandler eventHandler = new FlagEventHandler();
        integrator.addStepHandler(stepHandler);
        integrator.addEventHandler(eventHandler, 1.0, 1.0e-6, 100);

        integrator.callInitIntegration(0.0, new double[]{0.0}, 5.0);

        assertTrue(stepHandler.initCalled);
        assertTrue(eventHandler.initCalled);
    }

    // ---------------------------------------------------------------
    // integrate(ExpandableStatefulODE, double)
    // ---------------------------------------------------------------

    @Test
    public void testIntegrateExpandable_normalCase_updatesStateAndTime() {
        ExpandableStatefulODE equations = new ExpandableStatefulODE(new SimpleODE());
        equations.setTime(0.0);
        equations.setPrimaryState(new double[]{0.0});

        integrator.integrate(equations, 5.0);

        assertEquals(5.0, equations.getTime(), 1.0e-10);
        assertEquals(5.0, equations.getPrimaryState()[0], 1.0e-10);
    }

    // ---------------------------------------------------------------
    // integrate(FirstOrderDifferentialEquations, t0, y0, t, y)
    // ---------------------------------------------------------------

    @Test
    public void testIntegrate_normalCase_returnsFinalTime() {
        double[] y0 = new double[]{0.0};
        double[] y = new double[1];

        double finalTime = integrator.integrate(new SimpleODE(), 0.0, y0, 5.0, y);

        assertEquals(5.0, finalTime, 1.0e-10);
        assertEquals(5.0, y[0], 1.0e-10);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_withMismatchedY0Dimension_throwsDimensionMismatchException() {
        double[] y0 = new double[]{0.0, 0.0}; // wrong dimension
        double[] y = new double[1];

        integrator.integrate(new DimensionODE(1), 0.0, y0, 5.0, y);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_withMismatchedYDimension_throwsDimensionMismatchException() {
        double[] y0 = new double[]{0.0};
        double[] y = new double[2]; // wrong dimension

        integrator.integrate(new DimensionODE(1), 0.0, y0, 5.0, y);
    }

    @Test
    public void testIntegrate_withMultiDimensionODE_returnsCorrectResults() {
        double[] y0 = new double[]{0.0, 1.0, 2.0};
        double[] y = new double[3];

        double finalTime = integrator.integrate(new DimensionODE(3), 0.0, y0, 3.0, y);

        assertEquals(3.0, finalTime, 1.0e-10);
        assertEquals(3.0, y[0], 1.0e-10);
        assertEquals(4.0, y[1], 1.0e-10);
        assertEquals(5.0, y[2], 1.0e-10);
    }
}
