package org.apache.commons.math.ode.events;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Test;

public class EventStateTest {

    private static class DummyInterpolator implements StepInterpolator {
        private double previousTime;
        private double currentTime;
        private double interpolatedTime;
        private double[] state;
        private boolean forward;
        private boolean throwDerivativeExceptionOnState;
        private boolean throwEventExceptionOnState;

        public DummyInterpolator(double previousTime, double currentTime, double[] state, boolean forward) {
            this.previousTime = previousTime;
            this.currentTime = currentTime;
            this.interpolatedTime = previousTime;
            this.state = state != null ? state.clone() : new double[0];
            this.forward = forward;
        }

        public double getPreviousTime() {
            return previousTime;
        }

        public double getCurrentTime() {
            return currentTime;
        }

        public double getInterpolatedTime() {
            return interpolatedTime;
        }

        public void setInterpolatedTime(double time) {
            this.interpolatedTime = time;
        }

        public boolean isForward() {
            return forward;
        }

        public double[] getInterpolatedState() throws DerivativeException {
            if (throwDerivativeExceptionOnState) {
                throw new DerivativeException("Derivative error");
            }
            return state;
        }

        public double[] getInterpolatedDerivatives() throws DerivativeException {
            return new double[state.length];
        }

        public StepInterpolator copy() {
            return this;
        }

        public void writeExternal(ObjectOutput out) {
        }

        public void readExternal(ObjectInput in) {
        }
    }

    private static class SimpleEventHandler implements EventHandler {
        private double eventTime;
        private int actionOnEvent = EventHandler.CONTINUE;
        private boolean resetStateCalled = false;
        private boolean throwOnG = false;

        public SimpleEventHandler(double eventTime, int actionOnEvent) {
            this.eventTime = eventTime;
            this.actionOnEvent = actionOnEvent;
        }

        public double g(double t, double[] y) throws EventException {
            if (throwOnG) {
                throw new EventException("Handler error");
            }
            return t - eventTime;
        }

        public int eventOccurred(double t, double[] y, boolean increasing) throws EventException {
            return actionOnEvent;
        }

        public void resetState(double t, double[] y) throws EventException {
            resetStateCalled = true;
            if (y != null && y.length > 0) {
                y[0] = 99.0;
            }
        }
    }

    @Test
    public void testConstructorAndGetters_normalValues_expectedInitializedState() {
        SimpleEventHandler handler = new SimpleEventHandler(5.0, EventHandler.CONTINUE);
        EventState es = new EventState(handler, 10.0, -1e-6, 100);

        Assert.assertSame(handler, es.getEventHandler());
        Assert.assertEquals(10.0, es.getMaxCheckInterval(), 1e-15);
        Assert.assertEquals(1e-6, es.getConvergence(), 1e-15);
        Assert.assertEquals(100, es.getMaxIterationCount());
        Assert.assertTrue(Double.isNaN(es.getEventTime()));
        Assert.assertFalse(es.stop());
    }

    @Test
    public void testReinitializeBegin_positiveG_setsInternalState() throws EventException {
        SimpleEventHandler handler = new SimpleEventHandler(0.0, EventHandler.CONTINUE);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        es.reinitializeBegin(5.0, new double[]{1.0});
        Assert.assertFalse(es.stop());
    }

    @Test
    public void testReinitializeBegin_negativeG_setsInternalState() throws EventException {
        SimpleEventHandler handler = new SimpleEventHandler(10.0, EventHandler.CONTINUE);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        es.reinitializeBegin(5.0, new double[]{1.0});
        Assert.assertFalse(es.stop());
    }

    @Test
    public void testEvaluateStep_noEventOccurs_returnsFalse()
            throws DerivativeException, EventException, ConvergenceException {
        SimpleEventHandler handler = new SimpleEventHandler(20.0, EventHandler.CONTINUE);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(0.0, 5.0, y, true);
        boolean eventFound = es.evaluateStep(interpolator);

        Assert.assertFalse(eventFound);
        Assert.assertTrue(Double.isNaN(es.getEventTime()));
    }

    @Test
    public void testEvaluateStep_eventOccursForward_returnsTrueAndFindsEvent()
            throws DerivativeException, EventException, ConvergenceException {
        SimpleEventHandler handler = new SimpleEventHandler(2.5, EventHandler.CONTINUE);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(0.0, 5.0, y, true);
        boolean eventFound = es.evaluateStep(interpolator);

        Assert.assertTrue(eventFound);
        Assert.assertEquals(2.5, es.getEventTime(), 1e-5);
    }

    @Test
    public void testEvaluateStep_eventOccursBackward_returnsTrueAndFindsEvent()
            throws DerivativeException, EventException, ConvergenceException {
        SimpleEventHandler handler = new SimpleEventHandler(2.5, EventHandler.CONTINUE);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(5.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(5.0, 0.0, y, false);
        boolean eventFound = es.evaluateStep(interpolator);

        Assert.assertTrue(eventFound);
        Assert.assertEquals(2.5, es.getEventTime(), 1e-5);
    }

    @Test
    public void testEvaluateStep_pendingEventAtStepEnd_returnsFalse()
            throws DerivativeException, EventException, ConvergenceException {
        SimpleEventHandler handler = new SimpleEventHandler(2.5, EventHandler.CONTINUE);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        // First evaluate with a larger step to make pendingEvent = true
        DummyInterpolator interpolator1 = new DummyInterpolator(0.0, 5.0, y, true);
        es.evaluateStep(interpolator1);

        // Next evaluate step that ends exactly at the event time
        DummyInterpolator interpolator2 = new DummyInterpolator(0.0, es.getEventTime(), y, true);
        boolean eventFound = es.evaluateStep(interpolator2);

        Assert.assertFalse(eventFound);
    }

    @Test
    public void testEvaluateStep_pastEventIgnored_returnsFalse()
            throws DerivativeException, EventException, ConvergenceException {
        SimpleEventHandler handler = new SimpleEventHandler(0.0, EventHandler.CONTINUE);
        EventState es = new EventState(handler, 10.0, 1e-3, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        DummyInterpolator interpolator1 = new DummyInterpolator(0.0, 5.0, y, true);
        es.evaluateStep(interpolator1);
        es.stepAccepted(0.0, y); // records previousEventTime = 0.0

        // Substep starting near 0.0 again with root near 0.0
        es.reinitializeBegin(0.0, y);
        DummyInterpolator interpolator2 = new DummyInterpolator(0.0, 5.0, y, true);
        boolean eventFound = es.evaluateStep(interpolator2);

        Assert.assertFalse(eventFound);
    }

    @Test(expected = DerivativeException.class)
    public void testEvaluateStep_derivativeExceptionInSolver_propagatesException()
            throws DerivativeException, EventException, ConvergenceException {
        SimpleEventHandler handler = new SimpleEventHandler(2.5, EventHandler.CONTINUE);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(0.0, 5.0, y, true) {
            @Override
            public double[] getInterpolatedState() throws DerivativeException {
                if (getInterpolatedTime() > 1.0) {
                    throw new DerivativeException("Solver derivative error");
                }
                return super.getInterpolatedState();
            }
        };

        es.evaluateStep(interpolator);
    }

    @Test(expected = EventException.class)
    public void testEvaluateStep_eventExceptionInSolver_propagatesException()
            throws DerivativeException, EventException, ConvergenceException {
        EventHandler handler = new EventHandler() {
            public double g(double t, double[] y) throws EventException {
                if (t > 1.0) {
                    throw new EventException("Solver event error");
                }
                return t - 2.5;
            }

            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.CONTINUE;
            }

            public void resetState(double t, double[] y) {
            }
        };

        EventState es = new EventState(handler, 10.0, 1e-6, 100);
        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(0.0, 5.0, y, true);
        es.evaluateStep(interpolator);
    }

    @Test(expected = EventException.class)
    public void testEvaluateStep_genericEvaluationException_wrappedInEventException()
            throws DerivativeException, EventException, ConvergenceException {
        EventHandler handler = new EventHandler() {
            public double g(double t, double[] y) throws EventException {
                if (t > 1.0) {
                    throw new RuntimeException("Generic solver error");
                }
                return t - 2.5;
            }

            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.CONTINUE;
            }

            public void resetState(double t, double[] y) {
            }
        };

        EventState es = new EventState(handler, 10.0, 1e-6, 100);
        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(0.0, 5.0, y, true);
        es.evaluateStep(interpolator);
    }

    @Test
    public void testStepAccepted_withPendingEventStop_setsStopAction()
            throws DerivativeException, EventException, ConvergenceException {
        SimpleEventHandler handler = new SimpleEventHandler(2.5, EventHandler.STOP);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(0.0, 5.0, y, true);
        es.evaluateStep(interpolator);

        es.stepAccepted(2.5, y);
        Assert.assertTrue(es.stop());
    }

    @Test
    public void testStepAccepted_withPendingEventIncreasingBackward_handlesCorrectly()
            throws DerivativeException, EventException, ConvergenceException {
        // g(t) = -(t - 2.5), for backward integration from 5.0 to 0.0:
        // at t=5.0, g = -2.5 (negative)
        // at t=0.0, g = 2.5 (positive) => gb >= ga is true (increasing=true)
        // forward is false => !(increasing ^ forward) == false
        final boolean[] receivedIncreasing = new boolean[1];
        EventHandler handler = new EventHandler() {
            public double g(double t, double[] y) {
                return -(t - 2.5);
            }

            public int eventOccurred(double t, double[] y, boolean increasing) {
                receivedIncreasing[0] = increasing;
                return EventHandler.CONTINUE;
            }

            public void resetState(double t, double[] y) {
            }
        };

        EventState es = new EventState(handler, 10.0, 1e-6, 100);
        double[] y = new double[]{1.0};
        es.reinitializeBegin(5.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(5.0, 0.0, y, false);
        es.evaluateStep(interpolator);
        es.stepAccepted(2.5, y);

        Assert.assertFalse(receivedIncreasing[0]);
    }

    @Test
    public void testStepAccepted_withoutPendingEvent_continues() throws EventException {
        SimpleEventHandler handler = new SimpleEventHandler(20.0, EventHandler.CONTINUE);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);
        es.stepAccepted(5.0, y);

        Assert.assertFalse(es.stop());
    }

    @Test
    public void testReset_noPendingEvent_returnsFalse() throws EventException {
        SimpleEventHandler handler = new SimpleEventHandler(2.5, EventHandler.RESET_STATE);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        boolean reset = es.reset(0.0, y);

        Assert.assertFalse(reset);
        Assert.assertFalse(handler.resetStateCalled);
    }

    @Test
    public void testReset_pendingEventWithResetState_invokesHandlerAndReturnsTrue()
            throws DerivativeException, EventException, ConvergenceException {
        SimpleEventHandler handler = new SimpleEventHandler(2.5, EventHandler.RESET_STATE);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(0.0, 5.0, y, true);
        es.evaluateStep(interpolator);
        es.stepAccepted(2.5, y);

        boolean reset = es.reset(2.5, y);

        Assert.assertTrue(reset);
        Assert.assertTrue(handler.resetStateCalled);
        Assert.assertEquals(99.0, y[0], 1e-15);
        Assert.assertTrue(Double.isNaN(es.getEventTime()));
    }

    @Test
    public void testReset_pendingEventWithResetDerivatives_returnsTrueWithoutResettingState()
            throws DerivativeException, EventException, ConvergenceException {
        SimpleEventHandler handler = new SimpleEventHandler(2.5, EventHandler.RESET_DERIVATIVES);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(0.0, 5.0, y, true);
        es.evaluateStep(interpolator);
        es.stepAccepted(2.5, y);

        boolean reset = es.reset(2.5, y);

        Assert.assertTrue(reset);
        Assert.assertFalse(handler.resetStateCalled);
        Assert.assertTrue(Double.isNaN(es.getEventTime()));
    }

    @Test
    public void testReset_pendingEventWithContinue_returnsFalse()
            throws DerivativeException, EventException, ConvergenceException {
        SimpleEventHandler handler = new SimpleEventHandler(2.5, EventHandler.CONTINUE);
        EventState es = new EventState(handler, 10.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(0.0, 5.0, y, true);
        es.evaluateStep(interpolator);
        es.stepAccepted(2.5, y);

        boolean reset = es.reset(2.5, y);

        Assert.assertFalse(reset);
        Assert.assertFalse(handler.resetStateCalled);
        Assert.assertTrue(Double.isNaN(es.getEventTime()));
    }

    @Test
    public void testEvaluateStep_multipleSubsteps_locatesEventInSecondSubstep()
            throws DerivativeException, EventException, ConvergenceException {
        SimpleEventHandler handler = new SimpleEventHandler(7.5, EventHandler.CONTINUE);
        // maxCheckInterval = 5.0, total interval [0.0, 10.0] -> 2 substeps
        EventState es = new EventState(handler, 5.0, 1e-6, 100);

        double[] y = new double[]{1.0};
        es.reinitializeBegin(0.0, y);

        DummyInterpolator interpolator = new DummyInterpolator(0.0, 10.0, y, true);
        boolean eventFound = es.evaluateStep(interpolator);

        Assert.assertTrue(eventFound);
        Assert.assertEquals(7.5, es.getEventTime(), 1e-5);
    }
}
