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

public class EventState_stepAccepted_65962665828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1962;
     Object term2938;

    public EventState_stepAccepted_65962665828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1962 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term2090 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term1962, term1962.getClass(), "t0", 0.0);
        setField(term1962, term1962.getClass(), "handler", term2090);
        term2938 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term2939 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term2939, term2939.getClass(), "endTime", 0.0);
        setField(term2938, term2938.getClass(), "handler", term2939);
        setDoubleField(term2938, term2938.getClass(), "maxCheckInterval", 0.0);
        setDoubleField(term2938, term2938.getClass(), "convergence", 0.0);
        setIntField(term2938, term2938.getClass(), "maxIterationCount", 0);
        setDoubleField(term2938, term2938.getClass(), "t0", 0.0);
        setDoubleField(term2938, term2938.getClass(), "g0", 0.0);
        setBooleanField(term2938, term2938.getClass(), "g0Positive", true);
        setBooleanField(term2938, term2938.getClass(), "pendingEvent", false);
        setDoubleField(term2938, term2938.getClass(), "pendingEventTime", 0.0);
        setDoubleField(term2938, term2938.getClass(), "previousEventTime", 0.0);
        setBooleanField(term2938, term2938.getClass(), "forward", false);
        setBooleanField(term2938, term2938.getClass(), "increasing", false);
        setIntField(term2938, term2938.getClass(), "nextAction", 3);
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
        callMethod(klass, "stepAccepted", argTypes, term1962, args);
        assertTrue(recursiveEquals(term1962, term2938));
    }

};


