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
import static org.apache.commons.math.ode.events.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.ode.events.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class EventState_stepAccepted_65962665847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5941;
     Object term6095;

    public EventState_stepAccepted_65962665847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5941 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term6069 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term5941, term5941.getClass(), "t0", 0.0);
        setDoubleField(term6069, term6069.getClass(), "endTime", 0.0);
        setField(term5941, term5941.getClass(), "handler", term6069);
        setDoubleField(term5941, term5941.getClass(), "g0", 0.0);
        setBooleanField(term5941, term5941.getClass(), "pendingEvent", true);
        setDoubleField(term5941, term5941.getClass(), "previousEventTime", 0.0);
        setBooleanField(term5941, term5941.getClass(), "increasing", true);
        setBooleanField(term5941, term5941.getClass(), "g0Positive", false);
        setBooleanField(term5941, term5941.getClass(), "forward", false);
        term6095 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term6096 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term6096, term6096.getClass(), "endTime", 0.0);
        setField(term6095, term6095.getClass(), "handler", term6096);
        setDoubleField(term6095, term6095.getClass(), "maxCheckInterval", 0.0);
        setDoubleField(term6095, term6095.getClass(), "convergence", 0.0);
        setIntField(term6095, term6095.getClass(), "maxIterationCount", 0);
        setDoubleField(term6095, term6095.getClass(), "t0", Double.NaN);
        setDoubleField(term6095, term6095.getClass(), "g0", Double.NaN);
        setBooleanField(term6095, term6095.getClass(), "g0Positive", true);
        setBooleanField(term6095, term6095.getClass(), "pendingEvent", true);
        setDoubleField(term6095, term6095.getClass(), "pendingEventTime", 0.0);
        setDoubleField(term6095, term6095.getClass(), "previousEventTime", Double.NaN);
        setBooleanField(term6095, term6095.getClass(), "forward", false);
        setBooleanField(term6095, term6095.getClass(), "increasing", true);
        setIntField(term6095, term6095.getClass(), "nextAction", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = Double.NaN;
        args[1] = null;
        callMethod(klass, "stepAccepted", argTypes, term5941, args);
        assertTrue(recursiveEquals(term5941, term6095));
    }

};


