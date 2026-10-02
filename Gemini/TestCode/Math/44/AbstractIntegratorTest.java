package org.apache.commons.math.ode;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;

import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.MaxCountExceededException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.junit.Assert;
import org.junit.Test;

public class AbstractIntegratorTest {

    private static class ConcreteIntegrator extends AbstractIntegrator {

        public ConcreteIntegrator(String name) {
            super(name);
        }

        public ConcreteIntegrator() {
            super();
        }

        public void setStepStart(double stepStart) {
            this.stepStart = stepStart;
        }

        public void setStepSize(double stepSize) {
            this.stepSize = stepSize;
        }

        public boolean isLastStep() {
            return this.isLastStep;
        }

        public boolean isResetOccurred() {
            return this.resetOccurred;
        }

        @Override
        public void resetEvaluations() {
            super.resetEvaluations();
        }

        @Override
        public void setEquations(ExpandableStatefulODE equations) {
            super.setEquations(equations);
        }

        @Override
        public void setStateInitialized(boolean stateInitialized) {
            super.setStateInitialized(stateInitialized);
        }

        @Override
        public double acceptStep(AbstractStepInterpolator interpolator, double[] y, double[] yDot, double tEnd) {
            return super.acceptStep(interpolator, y, yDot, tEnd);
        }

        @Override
        public void sanityChecks(ExpandableStatefulODE equations, double t) throws NumberIsTooSmallException {
            super.sanityChecks(equations, t);
        }

        @Override
        public void integrate(ExpandableStatefulODE equations, double t) {
            sanityChecks(equations, t);
            setEquations(equations);
            resetEvaluations();
            double t0 = equations.getTime();
            double[] y = equations.getCompleteState();
            double[] yDot = new double[y.length];
            computeDerivatives(t0, y, yDot);
            equations.setTime(t);
            for (int i = 0; i < y.length; ++i) {
                y[i] += yDot[i] * (t - t0);
            }
            equations.setCompleteState(y);
        }
    }

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
                yDot[i] = 1.0;
            }
        }
    }

    private static class DummyInterpolator extends AbstractStepInterpolator {
        public DummyInterpolator() {
            super();
        }

        public DummyInterpolator(double[] y, boolean forward) {
            this.currentState = y.clone();
            this.interpolatedState = y.clone();
            this.interpolatedDerivatives = new double[y.length];
            this.forward = forward;
            this.finalized = true;
        }

        public DummyInterpolator(DummyInterpolator interpolator) {
            super(interpolator);
        }

        @Override
        protected AbstractStepInterpolator doCopy() {
            return new DummyInterpolator(this);
        }

        @Override
        protected void computeInterpolatedStateAndDerivatives(double theta, double oneMinusThetaH) {
            for (int i = 0; i < currentState.length; i++) {
                interpolatedState[i] = currentState[i] + theta * (globalCurrentTime - globalPreviousTime);
                interpolatedDerivatives[i] = 1.0;
            }
        }

        public void setTimes(double t0, double t1) {
            this.globalPreviousTime = t0;
            this.globalCurrentTime = t1;
            this.softPreviousTime = t0;
            this.softCurrentTime = t1;
            this.h = t1 - t0;
        }

        @Override
        public void writeExternal(ObjectOutput out) {
        }

        @Override
        public void readExternal(ObjectInput in) {
        }
    }

    private static class DummyStepHandler implements StepHandler {
        private int stepCount = 0;
        private boolean lastStepHandled = false;

        public void init(double t0, double[] y0, double t) {
        }

        public void handleStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator, boolean isLast) {
            stepCount++;
            lastStepHandled = isLast;
        }
    }

    private static class TestEventHandler implements EventHandler {
        private final double eventTime;
        private final Action actionOnEvent;
        private int eventCount = 0;

        public TestEventHandler(double eventTime, Action actionOnEvent) {
            this.eventTime = eventTime;
            this.actionOnEvent = actionOnEvent;
        }

        public void init(double t0, double[] y0, double t) {
        }

        public double g(double t, double[] y) {
            return t - eventTime;
        }

        public Action eventOccurred(double t, double[] y, boolean increasing) {
            eventCount++;
            return actionOnEvent;
        }

        public void resetState(double t, double[] y) {
            for (int i = 0; i < y.length; i++) {
                y[i] = y[i] + 10.0;
            }
        }
    }

    @Test
    public void testConstructorsAndName() {
        ConcreteIntegrator integratorWithName = new ConcreteIntegrator("TestIntegrator");
        Assert.assertEquals("TestIntegrator", integratorWithName.getName());

        ConcreteIntegrator defaultIntegrator = new ConcreteIntegrator();
        Assert.assertNull(defaultIntegrator.getName());
    }

    @Test
    public void testStepHandlersManagement() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("Test");
        Assert.assertEquals(0, integrator.getStepHandlers().size());

        StepHandler handler1 = new DummyStepHandler();
        StepHandler handler2 = new DummyStepHandler();

        integrator.addStepHandler(handler1);
        integrator.addStepHandler(handler2);

        Collection<StepHandler> handlers = integrator.getStepHandlers();
        Assert.assertEquals(2, handlers.size());
        Assert.assertTrue(handlers.contains(handler1));
        Assert.assertTrue(handlers.contains(handler2));

        try {
            handlers.add(new DummyStepHandler());
            Assert.fail("getStepHandlers should return an unmodifiable collection");
        } catch (UnsupportedOperationException expected) {
        }

        integrator.clearStepHandlers();
        Assert.assertEquals(0, integrator.getStepHandlers().size());
    }

    @Test
    public void testEventHandlersManagement() {
        ConcreteIntegrator integrator = new ConcreteIntegrator("Test");
        Assert.assertEquals(0, integrator.getEventHandlers().size());

        EventHandler handler1 = new TestEventHandler(1.0, EventHandler.Action.CONTINUE);
        EventHandler handler2 = new TestEventHandler(2.0, EventHandler.Action.STOP);

        integrator.addEventHandler(handler1, 1.0, 1e-6, 100);
        integrator.addEventHandler(handler2, 1.0, 1e-6, 100, new BracketingNthOrderBrentSolver(1e-6, 5));

        Collection<EventHandler> handlers = integrator.getEventHandlers();
        Assert.assertEquals(2, handlers.size());
        Assert.assertTrue(handlers.contains(handler1));
        Assert.assertTrue(handlers.contains(handler2));

        try {
            handlers.add(new TestEventHandler(3.0, EventHandler.Action.CONTINUE));
            Assert.fail("getEventHandlers should return an unmodifiable collection");
        } catch (UnsupportedOperationException expected) {
        }

        integrator.clearEventHandlers();
        Assert.assertEquals(0, integrator.getEventHandlers().size());
    }

    @Test
    public void testStepStartAndSignedStepSize() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        Assert.assertTrue(Double.isNaN(integrator.getCurrentStepStart()));
        Assert.assertTrue(Double.isNaN(integrator.getCurrentSignedStepsize()));

        integrator.setStepStart(2.5);
        integrator.setStepSize(0.5);

        Assert.assertEquals(2.5, integrator.getCurrentStepStart(), 1e-12);
        Assert.assertEquals(0.5, integrator.getCurrentSignedStepsize(), 1e-12);
    }

    @Test
    public void testEvaluationsCounter() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        Assert.assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
        Assert.assertEquals(0, integrator.getEvaluations());

        integrator.setMaxEvaluations(10);
        Assert.assertEquals(10, integrator.getMaxEvaluations());

        integrator.setMaxEvaluations(-5);
        Assert.assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());

        integrator.setMaxEvaluations(2);
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.setEquations(ode);

        double[] y = new double[]{0.0};
        double[] yDot = new double[]{0.0};

        integrator.computeDerivatives(0.0, y, yDot);
        Assert.assertEquals(1, integrator.getEvaluations());

        integrator.computeDerivatives(0.1, y, yDot);
        Assert.assertEquals(2, integrator.getEvaluations());

        try {
            integrator.computeDerivatives(0.2, y, yDot);
            Assert.fail("Expected MaxCountExceededException");
        } catch (MaxCountExceededException e) {
            Assert.assertEquals(2, e.getMax());
        }

        integrator.resetEvaluations();
        Assert.assertEquals(0, integrator.getEvaluations());
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrateDimensionMismatchY0() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        DummyODE ode = new DummyODE(2);
        integrator.integrate(ode, 0.0, new double[]{1.0}, 1.0, new double[2]);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrateDimensionMismatchY() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        DummyODE ode = new DummyODE(2);
        integrator.integrate(ode, 0.0, new double[]{1.0, 2.0}, 1.0, new double[1]);
    }

    @Test
    public void testIntegrateSuccess() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        DummyODE ode = new DummyODE(2);
        double[] y0 = new double[]{1.0, 2.0};
        double[] y = new double[2];

        double stopTime = integrator.integrate(ode, 0.0, y0, 3.0, y);
        Assert.assertEquals(3.0, stopTime, 1e-12);
        Assert.assertEquals(4.0, y[0], 1e-12);
        Assert.assertEquals(5.0, y[1], 1e-12);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSanityChecksThrowsExceptionWhenIntervalTooSmall() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        ode.setTime(10.0);
        integrator.sanityChecks(ode, 10.0);
    }

    @Test
    public void testSanityChecksSuccess() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        ode.setTime(0.0);
        integrator.sanityChecks(ode, 1.0);
    }

    @Test
    public void testAcceptStepNoEventsForward() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.setEquations(ode);

        DummyStepHandler stepHandler = new DummyStepHandler();
        integrator.addStepHandler(stepHandler);

        DummyInterpolator interpolator = new DummyInterpolator(new double[]{0.0}, true);
        interpolator.setTimes(0.0, 1.0);

        double[] y = new double[]{1.0};
        double[] yDot = new double[]{1.0};
        double finalTime = integrator.acceptStep(interpolator, y, yDot, 1.0);

        Assert.assertEquals(1.0, finalTime, 1e-12);
        Assert.assertEquals(1, stepHandler.stepCount);
        Assert.assertTrue(stepHandler.lastStepHandled);
        Assert.assertTrue(integrator.isLastStep());
    }

    @Test
    public void testAcceptStepNoEventsBackward() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.setEquations(ode);

        DummyInterpolator interpolator = new DummyInterpolator(new double[]{0.0}, false);
        interpolator.setTimes(1.0, 0.0);

        double[] y = new double[]{1.0};
        double[] yDot = new double[]{1.0};
        double finalTime = integrator.acceptStep(interpolator, y, yDot, 0.0);

        Assert.assertEquals(0.0, finalTime, 1e-12);
        Assert.assertTrue(integrator.isLastStep());
    }

    @Test
    public void testAcceptStepWithStopEvent() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.setEquations(ode);

        TestEventHandler eventHandler = new TestEventHandler(0.5, EventHandler.Action.STOP);
        integrator.addEventHandler(eventHandler, 0.1, 1e-9, 100);

        DummyInterpolator interpolator = new DummyInterpolator(new double[]{0.0}, true);
        interpolator.setTimes(0.0, 1.0);

        double[] y = new double[1];
        double[] yDot = new double[1];
        double eventTime = integrator.acceptStep(interpolator, y, yDot, 1.0);

        Assert.assertEquals(0.5, eventTime, 1e-6);
        Assert.assertTrue(integrator.isLastStep());
        Assert.assertEquals(1, eventHandler.eventCount);
    }

    @Test
    public void testAcceptStepWithResetDerivativesEvent() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.setEquations(ode);

        TestEventHandler eventHandler = new TestEventHandler(0.5, EventHandler.Action.RESET_DERIVATIVES);
        integrator.addEventHandler(eventHandler, 0.1, 1e-9, 100);

        DummyInterpolator interpolator = new DummyInterpolator(new double[]{0.0}, true);
        interpolator.setTimes(0.0, 1.0);

        double[] y = new double[1];
        double[] yDot = new double[1];
        double eventTime = integrator.acceptStep(interpolator, y, yDot, 1.0);

        Assert.assertEquals(0.5, eventTime, 1e-6);
        Assert.assertTrue(integrator.isResetOccurred());
        Assert.assertEquals(1, eventHandler.eventCount);
    }

    @Test
    public void testAcceptStepWithResetStateEvent() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.setEquations(ode);

        TestEventHandler eventHandler = new TestEventHandler(0.4, EventHandler.Action.RESET_STATE);
        integrator.addEventHandler(eventHandler, 0.1, 1e-9, 100);

        DummyInterpolator interpolator = new DummyInterpolator(new double[]{0.0}, true);
        interpolator.setTimes(0.0, 1.0);

        double[] y = new double[1];
        double[] yDot = new double[1];
        double eventTime = integrator.acceptStep(interpolator, y, yDot, 1.0);

        Assert.assertEquals(0.4, eventTime, 1e-6);
        Assert.assertTrue(integrator.isResetOccurred());
        Assert.assertEquals(10.4, y[0], 1e-6);
    }

    @Test
    public void testAcceptStepMultipleEventsOrderingBackward() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.setEquations(ode);

        TestEventHandler event1 = new TestEventHandler(0.6, EventHandler.Action.CONTINUE);
        TestEventHandler event2 = new TestEventHandler(0.3, EventHandler.Action.STOP);
        integrator.addEventHandler(event1, 0.1, 1e-9, 100);
        integrator.addEventHandler(event2, 0.1, 1e-9, 100);

        DummyInterpolator interpolator = new DummyInterpolator(new double[]{0.0}, false);
        interpolator.setTimes(1.0, 0.0);

        double[] y = new double[1];
        double[] yDot = new double[1];
        double stopTime = integrator.acceptStep(interpolator, y, yDot, 0.0);

        Assert.assertEquals(0.3, stopTime, 1e-6);
        Assert.assertEquals(1, event1.eventCount);
        Assert.assertEquals(1, event2.eventCount);
        Assert.assertTrue(integrator.isLastStep());
    }

    @Test
    public void testSetStateInitialized() {
        ConcreteIntegrator integrator = new ConcreteIntegrator();
        ExpandableStatefulODE ode = new ExpandableStatefulODE(new DummyODE(1));
        integrator.setEquations(ode);

        TestEventHandler eventHandler = new TestEventHandler(0.5, EventHandler.Action.CONTINUE);
        integrator.addEventHandler(eventHandler, 0.1, 1e-9, 100);

        integrator.setStateInitialized(true);

        DummyInterpolator interpolator = new DummyInterpolator(new double[]{0.0}, true);
        interpolator.setTimes(0.0, 1.0);

        double[] y = new double[1];
        double[] yDot = new double[1];
        integrator.acceptStep(interpolator, y, yDot, 1.0);

        integrator.setStateInitialized(false);
        integrator.acceptStep(interpolator, y, yDot, 1.0);
    }
}
