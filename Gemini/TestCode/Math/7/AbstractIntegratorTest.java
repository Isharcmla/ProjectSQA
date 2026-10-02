package org.apache.commons.math3.ode;

import java.util.Collection;
import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.EventState;
import org.apache.commons.math3.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math3.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Test;

public class AbstractIntegratorTest {

    private static class DummyODE implements FirstOrderDifferentialEquations {
        private final int dimension;

        public DummyODE(int dimension) {
            this.dimension = dimension;
        }

        public int getDimension() {
            return dimension;
        }

        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < dimension; i++) {
                yDot[i] = y[i];
            }
        }
    }

    private static class DummyIntegrator extends AbstractIntegrator {

        public DummyIntegrator() {
            super();
        }

        public DummyIntegrator(String name) {
            super(name);
        }

        @Override
        public void integrate(ExpandableStatefulODE equations, double t)
            throws NumberIsTooSmallException, DimensionMismatchException,
                   MaxCountExceededException, NoBracketingException {
            sanityChecks(equations, t);
            setEquations(equations);
            final double t0 = equations.getTime();
            final double[] y0 = equations.getPrimaryState();
            final double[] y = y0.clone();
            final double[] yDot = new double[y.length];

            initIntegration(t0, y0, t);
            computeDerivatives(t0, y0, yDot);

            stepStart = t0;
            stepSize = t - t0;

            DummyStepInterpolator interpolator = new DummyStepInterpolator(y, yDot, t >= t0);
            interpolator.storeTime(t0);
            interpolator.storeTime(t);

            acceptStep(interpolator, y, yDot, t);

            equations.setTime(t);
            equations.setPrimaryState(y);
        }

        public void callSanityChecks(ExpandableStatefulODE equations, double t) {
            sanityChecks(equations, t);
        }

        public void callSetEquations(ExpandableStatefulODE equations) {
            setEquations(equations);
        }

        public void callInitIntegration(double t0, double[] y0, double t) {
            initIntegration(t0, y0, t);
        }

        public void callSetStateInitialized(boolean stateInitialized) {
            setStateInitialized(stateInitialized);
        }

        public double callAcceptStep(AbstractStepInterpolator interpolator, double[] y, double[] yDot, double tEnd) {
            return acceptStep(interpolator, y, yDot, tEnd);
        }

        public void setStepStart(double stepStart) {
            this.stepStart = stepStart;
        }

        public void setStepSize(double stepSize) {
            this.stepSize = stepSize;
        }

        public boolean isLastStep() {
            return isLastStep;
        }

        public boolean isResetOccurred() {
            return resetOccurred;
        }
    }

    private static class DummyStepHandler implements StepHandler {
        private boolean initCalled = false;
        private int handleStepCalls = 0;
        private boolean lastStepReceived = false;

        public void init(double t0, double[] y0, double t) {
            initCalled = true;
        }

        public void handleStep(StepInterpolator interpolator, boolean isLast) {
            handleStepCalls++;
            lastStepReceived = isLast;
        }
    }

    private static class DummyEventHandler implements EventHandler {
        private final double eventTime;
        private final Action action;
        private boolean initCalled = false;
        private boolean eventOccurredCalled = false;
        private boolean resetStateCalled = false;

        public DummyEventHandler(double eventTime, Action action) {
            this.eventTime = eventTime;
            this.action = action;
        }

        public void init(double t0, double[] y0, double t) {
            initCalled = true;
        }

        public double g(double t, double[] y) {
            return t - eventTime;
        }

        public Action eventOccurred(double t, double[] y, boolean increasing) {
            eventOccurredCalled = true;
            return action;
        }

        public void resetState(double t, double[] y) {
            resetStateCalled = true;
            y[0] += 1.0;
        }
    }

    @Test
    public void testConstructor_withName_getNameReturnsName() {
        AbstractIntegrator integrator = new DummyIntegrator("Euler");
        Assert.assertEquals("Euler", integrator.getName());
        Assert.assertTrue(Double.isNaN(integrator.getCurrentStepStart()));
        Assert.assertTrue(Double.isNaN(integrator.getCurrentSignedStepsize()));
    }

    @Test
    public void testConstructor_default_getNameReturnsNull() {
        AbstractIntegrator integrator = new DummyIntegrator();
        Assert.assertNull(integrator.getName());
    }

    @Test
    public void testStepHandlers_addGetClear() {
        AbstractIntegrator integrator = new DummyIntegrator("Test");
        Assert.assertTrue(integrator.getStepHandlers().isEmpty());

        StepHandler handler1 = new DummyStepHandler();
        StepHandler handler2 = new DummyStepHandler();

        integrator.addStepHandler(handler1);
        integrator.addStepHandler(handler2);

        Collection<StepHandler> handlers = integrator.getStepHandlers();
        Assert.assertEquals(2, handlers.size());
        Assert.assertTrue(handlers.contains(handler1));
        Assert.assertTrue(handlers.contains(handler2));

        integrator.clearStepHandlers();
        Assert.assertTrue(integrator.getStepHandlers().isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetStepHandlers_unmodifiableCollection_throwsException() {
        AbstractIntegrator integrator = new DummyIntegrator("Test");
        integrator.getStepHandlers().add(new DummyStepHandler());
    }

    @Test
    public void testEventHandlers_addGetClear() {
        AbstractIntegrator integrator = new DummyIntegrator("Test");
        Assert.assertTrue(integrator.getEventHandlers().isEmpty());

        EventHandler handler1 = new DummyEventHandler(1.0, EventHandler.Action.CONTINUE);
        EventHandler handler2 = new DummyEventHandler(2.0, EventHandler.Action.STOP);
        UnivariateSolver solver = new BracketingNthOrderBrentSolver(1.0e-8, 5);

        integrator.addEventHandler(handler1, 1.0, 1.0e-6, 100);
        integrator.addEventHandler(handler2, 1.0, 1.0e-6, 100, solver);

        Collection<EventHandler> handlers = integrator.getEventHandlers();
        Assert.assertEquals(2, handlers.size());
        Assert.assertTrue(handlers.contains(handler1));
        Assert.assertTrue(handlers.contains(handler2));

        integrator.clearEventHandlers();
        Assert.assertTrue(integrator.getEventHandlers().isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetEventHandlers_unmodifiableCollection_throwsException() {
        AbstractIntegrator integrator = new DummyIntegrator("Test");
        integrator.getEventHandlers().add(new DummyEventHandler(1.0, EventHandler.Action.CONTINUE));
    }

    @Test
    public void testEvaluations_defaultAndLimits() {
        AbstractIntegrator integrator = new DummyIntegrator("Test");
        Assert.assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
        Assert.assertEquals(0, integrator.getEvaluations());

        integrator.setMaxEvaluations(100);
        Assert.assertEquals(100, integrator.getMaxEvaluations());

        integrator.setMaxEvaluations(-5);
        Assert.assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
    }

    @Test
    public void testComputeDerivatives_incrementsCount() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(2));
        integrator.callSetEquations(ode);

        double[] y = new double[] { 1.0, 2.0 };
        double[] yDot = new double[2];

        Assert.assertEquals(0, integrator.getEvaluations());
        integrator.computeDerivatives(0.0, y, yDot);
        Assert.assertEquals(1, integrator.getEvaluations());
        Assert.assertEquals(1.0, yDot[0], 1.0e-10);
        Assert.assertEquals(2.0, yDot[1], 1.0e-10);

        integrator.computeDerivatives(0.0, y, yDot);
        Assert.assertEquals(2, integrator.getEvaluations());
    }

    @Test(expected = MaxCountExceededException.class)
    public void testComputeDerivatives_exceedsMaxEvaluations_throwsException() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.callSetEquations(ode);
        integrator.setMaxEvaluations(1);

        double[] y = new double[] { 1.0 };
        double[] yDot = new double[1];

        integrator.computeDerivatives(0.0, y, yDot);
        integrator.computeDerivatives(0.0, y, yDot);
    }

    @Test
    public void testStepStartAndStepSize_getters() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        integrator.setStepStart(2.5);
        integrator.setStepSize(0.125);

        Assert.assertEquals(2.5, integrator.getCurrentStepStart(), 1.0e-10);
        Assert.assertEquals(0.125, integrator.getCurrentSignedStepsize(), 1.0e-10);
    }

    @Test
    public void testInitIntegration_initializesHandlersAndResetsCount() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.callSetEquations(ode);

        DummyStepHandler stepHandler = new DummyStepHandler();
        DummyEventHandler eventHandler = new DummyEventHandler(5.0, EventHandler.Action.CONTINUE);

        integrator.addStepHandler(stepHandler);
        integrator.addEventHandler(eventHandler, 1.0, 1.0e-6, 100);

        integrator.computeDerivatives(0.0, new double[] { 1.0 }, new double[1]);
        Assert.assertEquals(1, integrator.getEvaluations());

        integrator.callInitIntegration(0.0, new double[] { 1.0 }, 10.0);

        Assert.assertEquals(0, integrator.getEvaluations());
        Assert.assertTrue(stepHandler.initCalled);
        Assert.assertTrue(eventHandler.initCalled);
    }

    @Test
    public void testSanityChecks_validInterval_noException() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        ode.setTime(0.0);

        integrator.callSanityChecks(ode, 1.0);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecks_intervalTooSmall_throwsException() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        ode.setTime(1.0);

        integrator.callSanityChecks(ode, 1.0);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_y0DimensionMismatch_throwsException() {
        AbstractIntegrator integrator = new DummyIntegrator("Test");
        FirstOrderDifferentialEquations ode = new DummyODE(2);
        double[] y0 = new double[1];
        double[] y = new double[2];

        integrator.integrate(ode, 0.0, y0, 1.0, y);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_yDimensionMismatch_throwsException() {
        AbstractIntegrator integrator = new DummyIntegrator("Test");
        FirstOrderDifferentialEquations ode = new DummyODE(2);
        double[] y0 = new double[2];
        double[] y = new double[1];

        integrator.integrate(ode, 0.0, y0, 1.0, y);
    }

    @Test
    public void testIntegrate_successfulIntegration() {
        AbstractIntegrator integrator = new DummyIntegrator("Test");
        FirstOrderDifferentialEquations ode = new DummyODE(2);
        double[] y0 = new double[] { 1.0, 2.0 };
        double[] y = new double[2];

        double stopTime = integrator.integrate(ode, 0.0, y0, 2.5, y);

        Assert.assertEquals(2.5, stopTime, 1.0e-10);
        Assert.assertEquals(1.0, y[0], 1.0e-10);
        Assert.assertEquals(2.0, y[1], 1.0e-10);
    }

    @Test
    public void testAcceptStep_noEvents_forwardIntegration() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        DummyStepHandler stepHandler = new DummyStepHandler();
        integrator.addStepHandler(stepHandler);

        double[] y = new double[] { 1.0 };
        double[] yDot = new double[] { 0.0 };
        DummyStepInterpolator interpolator = new DummyStepInterpolator(y, yDot, true);
        interpolator.storeTime(0.0);
        interpolator.storeTime(1.0);

        double endTime = integrator.callAcceptStep(interpolator, y, yDot, 1.0);

        Assert.assertEquals(1.0, endTime, 1.0e-10);
        Assert.assertEquals(1, stepHandler.handleStepCalls);
        Assert.assertTrue(stepHandler.lastStepReceived);
        Assert.assertTrue(integrator.isLastStep());
    }

    @Test
    public void testAcceptStep_noEvents_backwardIntegration() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        DummyStepHandler stepHandler = new DummyStepHandler();
        integrator.addStepHandler(stepHandler);

        double[] y = new double[] { 1.0 };
        double[] yDot = new double[] { 0.0 };
        DummyStepInterpolator interpolator = new DummyStepInterpolator(y, yDot, false);
        interpolator.storeTime(1.0);
        interpolator.storeTime(0.0);

        double endTime = integrator.callAcceptStep(interpolator, y, yDot, 0.0);

        Assert.assertEquals(0.0, endTime, 1.0e-10);
        Assert.assertEquals(1, stepHandler.handleStepCalls);
        Assert.assertTrue(stepHandler.lastStepReceived);
    }

    @Test
    public void testAcceptStep_eventStopsIntegration() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        DummyStepHandler stepHandler = new DummyStepHandler();
        DummyEventHandler eventHandler = new DummyEventHandler(0.5, EventHandler.Action.STOP);

        integrator.addStepHandler(stepHandler);
        integrator.addEventHandler(eventHandler, 0.1, 1.0e-6, 100);

        double[] y = new double[] { 1.0 };
        double[] yDot = new double[] { 0.0 };
        DummyStepInterpolator interpolator = new DummyStepInterpolator(y, yDot, true);
        interpolator.storeTime(0.0);
        interpolator.storeTime(1.0);

        double stopTime = integrator.callAcceptStep(interpolator, y, yDot, 1.0);

        Assert.assertEquals(0.5, stopTime, 1.0e-5);
        Assert.assertTrue(eventHandler.eventOccurredCalled);
        Assert.assertTrue(integrator.isLastStep());
        Assert.assertTrue(stepHandler.handleStepCalls >= 1);
    }

    @Test
    public void testAcceptStep_eventResetsState() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.callSetEquations(ode);

        DummyStepHandler stepHandler = new DummyStepHandler();
        DummyEventHandler eventHandler = new DummyEventHandler(0.5, EventHandler.Action.RESET_STATE);

        integrator.addStepHandler(stepHandler);
        integrator.addEventHandler(eventHandler, 0.1, 1.0e-6, 100);

        double[] y = new double[] { 1.0 };
        double[] yDot = new double[] { 0.0 };
        DummyStepInterpolator interpolator = new DummyStepInterpolator(y, yDot, true);
        interpolator.storeTime(0.0);
        interpolator.storeTime(1.0);

        double stopTime = integrator.callAcceptStep(interpolator, y, yDot, 1.0);

        Assert.assertEquals(0.5, stopTime, 1.0e-5);
        Assert.assertTrue(eventHandler.eventOccurredCalled);
        Assert.assertTrue(eventHandler.resetStateCalled);
        Assert.assertTrue(integrator.isResetOccurred());
        Assert.assertEquals(2.0, y[0], 1.0e-5);
    }

    @Test
    public void testAcceptStep_eventResetsDerivatives() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.callSetEquations(ode);

        DummyEventHandler eventHandler = new DummyEventHandler(0.5, EventHandler.Action.RESET_DERIVATIVES);
        integrator.addEventHandler(eventHandler, 0.1, 1.0e-6, 100);

        double[] y = new double[] { 1.0 };
        double[] yDot = new double[] { 0.0 };
        DummyStepInterpolator interpolator = new DummyStepInterpolator(y, yDot, true);
        interpolator.storeTime(0.0);
        interpolator.storeTime(1.0);

        double stopTime = integrator.callAcceptStep(interpolator, y, yDot, 1.0);

        Assert.assertEquals(0.5, stopTime, 1.0e-5);
        Assert.assertTrue(eventHandler.eventOccurredCalled);
        Assert.assertTrue(integrator.isResetOccurred());
    }

    @Test
    public void testAcceptStep_multipleEventsInStep_forwardAndBackwardOrdering() {
        DummyIntegrator integrator = new DummyIntegrator("Test");
        DummyEventHandler handler1 = new DummyEventHandler(0.3, EventHandler.Action.CONTINUE);
        DummyEventHandler handler2 = new DummyEventHandler(0.7, EventHandler.Action.CONTINUE);

        integrator.addEventHandler(handler1, 0.1, 1.0e-6, 100);
        integrator.addEventHandler(handler2, 0.1, 1.0e-6, 100);

        double[] y = new double[] { 1.0 };
        double[] yDot = new double[] { 0.0 };
        DummyStepInterpolator interpolatorForward = new DummyStepInterpolator(y, yDot, true);
        interpolatorForward.storeTime(0.0);
        interpolatorForward.storeTime(1.0);

        double endTimeForward = integrator.callAcceptStep(interpolatorForward, y, yDot, 1.0);
        Assert.assertEquals(1.0, endTimeForward, 1.0e-10);
        Assert.assertTrue(handler1.eventOccurredCalled);
        Assert.assertTrue(handler2.eventOccurredCalled);

        integrator.clearEventHandlers();
        DummyEventHandler handlerBack1 = new DummyEventHandler(0.7, EventHandler.Action.CONTINUE);
        DummyEventHandler handlerBack2 = new DummyEventHandler(0.3, EventHandler.Action.CONTINUE);
        integrator.addEventHandler(handlerBack1, 0.1, 1.0e-6, 100);
        integrator.addEventHandler(handlerBack2, 0.1, 1.0e-6, 100);
        integrator.callSetStateInitialized(false);

        DummyStepInterpolator interpolatorBackward = new DummyStepInterpolator(y, yDot, false);
        interpolatorBackward.storeTime(1.0);
        interpolatorBackward.storeTime(0.0);

        double endTimeBackward = integrator.callAcceptStep(interpolatorBackward, y, yDot, 0.0);
        Assert.assertEquals(0.0, endTimeBackward, 1.0e-10);
        Assert.assertTrue(handlerBack1.eventOccurredCalled);
        Assert.assertTrue(handlerBack2.eventOccurredCalled);
    }
}
