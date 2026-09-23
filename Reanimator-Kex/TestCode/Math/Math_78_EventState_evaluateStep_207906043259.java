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

public class EventState_evaluateStep_207906043259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14174;
     Object term14310;

    public EventState_evaluateStep_207906043259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14174 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setBooleanField(term14174, term14174.getClass(), "forward", false);
        setDoubleField(term14174, term14174.getClass(), "t0", -9.223372036854776E18);
        setDoubleField(term14174, term14174.getClass(), "maxCheckInterval", 9.2188684372274053E18);
        setDoubleField(term14174, term14174.getClass(), "g0", 0.0);
        setDoubleField(term14174, term14174.getClass(), "convergence", 0.0);
        setField(term14174, term14174.getClass(), "handler", null);
        term14310 = newInstance(Class.forName("org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator"));
        double[] term13892 = (double[]) newDoubleArray(0);
        setBooleanField(term14310, term14310.getClass(), "forward", false);
        setDoubleField(term14310, term14310.getClass(), "currentTime", 1.52277967232303104E17);
        setDoubleField(term14310, term14310.getClass(), "interpolatedTime", 0.0);
        setBooleanField(term14310, term14310.getClass(), "dirtyState", false);
        setDoubleField(term14310, term14310.getClass(), "h", 0.0);
        setField(term14310, term14310.getClass(), "interpolatedState", term13892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.ode.sampling.StepInterpolator");
        Object[] args = new Object[1];
        args[0] = term14310;
        try {
            callMethod(klass, "evaluateStep", argTypes, term14174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


