package org.apache.commons.math.ode.events;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.apache.commons.math.ode.events.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EventState_evaluateStep_207906043257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11506;
     Object term11642;

    public EventState_evaluateStep_207906043257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11506 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setBooleanField(term11506, term11506.getClass(), "forward", false);
        setDoubleField(term11506, term11506.getClass(), "t0", 4.591416487209599E18);
        setDoubleField(term11506, term11506.getClass(), "maxCheckInterval", -4.6831806689543444E18);
        setDoubleField(term11506, term11506.getClass(), "g0", 0.0);
        setDoubleField(term11506, term11506.getClass(), "convergence", 0.0);
        setField(term11506, term11506.getClass(), "handler", null);
        term11642 = newInstance(Class.forName("org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator"));
        double[] term10729 = (double[]) newDoubleArray(489);
        setBooleanField(term11642, term11642.getClass(), "forward", false);
        setDoubleField(term11642, term11642.getClass(), "currentTime", -4.6143598224002253E18);
        setDoubleField(term11642, term11642.getClass(), "interpolatedTime", 0.0);
        setBooleanField(term11642, term11642.getClass(), "dirtyState", false);
        setDoubleField(term11642, term11642.getClass(), "h", 0.0);
        setField(term11642, term11642.getClass(), "interpolatedState", term10729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.ode.sampling.StepInterpolator");
        Object[] args = new Object[1];
        args[0] = term11642;
        try {
            callMethod(klass, "evaluateStep", argTypes, term11506, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


