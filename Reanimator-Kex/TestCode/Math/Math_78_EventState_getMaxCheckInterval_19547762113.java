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

public class EventState_getMaxCheckInterval_19547762113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term561;

    public EventState_getMaxCheckInterval_19547762113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term20, term20.getClass(), "handler", null);
        setDoubleField(term20, term20.getClass(), "maxCheckInterval", 0.6076495596892013);
        setDoubleField(term20, term20.getClass(), "convergence", 0.37773193782763337);
        setIntField(term20, term20.getClass(), "maxIterationCount", 391863371);
        setDoubleField(term20, term20.getClass(), "t0", 0.8474802076607362);
        setDoubleField(term20, term20.getClass(), "g0", 0.5183269973490326);
        setBooleanField(term20, term20.getClass(), "g0Positive", true);
        setBooleanField(term20, term20.getClass(), "pendingEvent", true);
        setDoubleField(term20, term20.getClass(), "pendingEventTime", 0.7655020693602768);
        setDoubleField(term20, term20.getClass(), "previousEventTime", 0.1374549299694151);
        setBooleanField(term20, term20.getClass(), "forward", true);
        setBooleanField(term20, term20.getClass(), "increasing", true);
        setIntField(term20, term20.getClass(), "nextAction", -1922583790);
        term561 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term561, term561.getClass(), "handler", null);
        setDoubleField(term561, term561.getClass(), "maxCheckInterval", 0.6076495596892013);
        setDoubleField(term561, term561.getClass(), "convergence", 0.37773193782763337);
        setIntField(term561, term561.getClass(), "maxIterationCount", 391863371);
        setDoubleField(term561, term561.getClass(), "t0", 0.8474802076607362);
        setDoubleField(term561, term561.getClass(), "g0", 0.5183269973490326);
        setBooleanField(term561, term561.getClass(), "g0Positive", true);
        setBooleanField(term561, term561.getClass(), "pendingEvent", true);
        setDoubleField(term561, term561.getClass(), "pendingEventTime", 0.7655020693602768);
        setDoubleField(term561, term561.getClass(), "previousEventTime", 0.1374549299694151);
        setBooleanField(term561, term561.getClass(), "forward", true);
        setBooleanField(term561, term561.getClass(), "increasing", true);
        setIntField(term561, term561.getClass(), "nextAction", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxCheckInterval", argTypes, term20, args);
        assertTrue(recursiveEquals(term20, term561));
        assertTrue(recursiveEquals(retValue, 0.6076495596892013));
    }

};


