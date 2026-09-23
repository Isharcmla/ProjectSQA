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

public class EventState_evaluateStep_207906043251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7347;
     Object term7467;

    public EventState_evaluateStep_207906043251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7347 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setBooleanField(term7347, term7347.getClass(), "forward", false);
        setDoubleField(term7347, term7347.getClass(), "t0", -4.503599627370496E15);
        setDoubleField(term7347, term7347.getClass(), "maxCheckInterval", -7.2057594037907408E16);
        setDoubleField(term7347, term7347.getClass(), "g0", 0.0);
        setDoubleField(term7347, term7347.getClass(), "convergence", 0.0);
        setField(term7347, term7347.getClass(), "handler", null);
        term7467 = newInstance(Class.forName("org.apache.commons.math.ode.nonstiff.GillStepInterpolator"));
        double[] term6642 = (double[]) newDoubleArray(489);
        setBooleanField(term7467, term7467.getClass(), "forward", false);
        setDoubleField(term7467, term7467.getClass(), "currentTime", -4.503599627370496E15);
        setDoubleField(term7467, term7467.getClass(), "interpolatedTime", 0.0);
        setBooleanField(term7467, term7467.getClass(), "dirtyState", false);
        setDoubleField(term7467, term7467.getClass(), "h", 0.0);
        setField(term7467, term7467.getClass(), "interpolatedState", term6642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.ode.sampling.StepInterpolator");
        Object[] args = new Object[1];
        args[0] = term7467;
        try {
            callMethod(klass, "evaluateStep", argTypes, term7347, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


