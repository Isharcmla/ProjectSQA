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

public class EventState_reinitializeBegin_144961118941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4629;
     Object term4806;

    public EventState_reinitializeBegin_144961118941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4629 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term4757 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term4629, term4629.getClass(), "t0", 0.0);
        setDoubleField(term4757, term4757.getClass(), "endTime", 0.0);
        setField(term4629, term4629.getClass(), "handler", term4757);
        setDoubleField(term4629, term4629.getClass(), "g0", 0.0);
        term4806 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term4807 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term4807, term4807.getClass(), "endTime", 0.0);
        setField(term4806, term4806.getClass(), "handler", term4807);
        setDoubleField(term4806, term4806.getClass(), "maxCheckInterval", 0.0);
        setDoubleField(term4806, term4806.getClass(), "convergence", 0.0);
        setIntField(term4806, term4806.getClass(), "maxIterationCount", 0);
        setDoubleField(term4806, term4806.getClass(), "t0", Double.NaN);
        setDoubleField(term4806, term4806.getClass(), "g0", Double.NaN);
        setBooleanField(term4806, term4806.getClass(), "g0Positive", false);
        setBooleanField(term4806, term4806.getClass(), "pendingEvent", false);
        setDoubleField(term4806, term4806.getClass(), "pendingEventTime", 0.0);
        setDoubleField(term4806, term4806.getClass(), "previousEventTime", 0.0);
        setBooleanField(term4806, term4806.getClass(), "forward", false);
        setBooleanField(term4806, term4806.getClass(), "increasing", false);
        setIntField(term4806, term4806.getClass(), "nextAction", 0);
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
        callMethod(klass, "reinitializeBegin", argTypes, term4629, args);
        assertTrue(recursiveEquals(term4629, term4806));
    }

};


