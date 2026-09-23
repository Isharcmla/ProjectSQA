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

public class EventState_reinitializeBegin_144961118931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2554;
     Object term3084;

    public EventState_reinitializeBegin_144961118931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2554 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term2682 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term2554, term2554.getClass(), "t0", 0.0);
        setField(term2554, term2554.getClass(), "handler", term2682);
        term3084 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term3085 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term3085, term3085.getClass(), "endTime", 0.0);
        setField(term3084, term3084.getClass(), "handler", term3085);
        setDoubleField(term3084, term3084.getClass(), "maxCheckInterval", 0.0);
        setDoubleField(term3084, term3084.getClass(), "convergence", 0.0);
        setIntField(term3084, term3084.getClass(), "maxIterationCount", 0);
        setDoubleField(term3084, term3084.getClass(), "t0", 0.0);
        setDoubleField(term3084, term3084.getClass(), "g0", 0.0);
        setBooleanField(term3084, term3084.getClass(), "g0Positive", true);
        setBooleanField(term3084, term3084.getClass(), "pendingEvent", false);
        setDoubleField(term3084, term3084.getClass(), "pendingEventTime", 0.0);
        setDoubleField(term3084, term3084.getClass(), "previousEventTime", 0.0);
        setBooleanField(term3084, term3084.getClass(), "forward", false);
        setBooleanField(term3084, term3084.getClass(), "increasing", false);
        setIntField(term3084, term3084.getClass(), "nextAction", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 0.0;
        args[1] = null;
        callMethod(klass, "reinitializeBegin", argTypes, term2554, args);
        assertTrue(recursiveEquals(term2554, term3084));
    }

};


