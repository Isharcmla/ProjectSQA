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

public class EventState_getMaxIterationCount_83118162715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;
     Object term591;

    public EventState_getMaxIterationCount_83118162715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term46, term46.getClass(), "handler", null);
        setDoubleField(term46, term46.getClass(), "maxCheckInterval", 0.4569171842750229);
        setDoubleField(term46, term46.getClass(), "convergence", 0.8598297828918529);
        setIntField(term46, term46.getClass(), "maxIterationCount", -2038273078);
        setDoubleField(term46, term46.getClass(), "t0", 0.43692187681405226);
        setDoubleField(term46, term46.getClass(), "g0", 0.7633268466829064);
        setBooleanField(term46, term46.getClass(), "g0Positive", false);
        setBooleanField(term46, term46.getClass(), "pendingEvent", true);
        setDoubleField(term46, term46.getClass(), "pendingEventTime", 0.13481025392611334);
        setDoubleField(term46, term46.getClass(), "previousEventTime", 0.3800088629986428);
        setBooleanField(term46, term46.getClass(), "forward", false);
        setBooleanField(term46, term46.getClass(), "increasing", false);
        setIntField(term46, term46.getClass(), "nextAction", 1227103734);
        term591 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term591, term591.getClass(), "handler", null);
        setDoubleField(term591, term591.getClass(), "maxCheckInterval", 0.4569171842750229);
        setDoubleField(term591, term591.getClass(), "convergence", 0.8598297828918529);
        setIntField(term591, term591.getClass(), "maxIterationCount", -2038273078);
        setDoubleField(term591, term591.getClass(), "t0", 0.43692187681405226);
        setDoubleField(term591, term591.getClass(), "g0", 0.7633268466829064);
        setBooleanField(term591, term591.getClass(), "g0Positive", false);
        setBooleanField(term591, term591.getClass(), "pendingEvent", true);
        setDoubleField(term591, term591.getClass(), "pendingEventTime", 0.13481025392611334);
        setDoubleField(term591, term591.getClass(), "previousEventTime", 0.3800088629986428);
        setBooleanField(term591, term591.getClass(), "forward", false);
        setBooleanField(term591, term591.getClass(), "increasing", false);
        setIntField(term591, term591.getClass(), "nextAction", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxIterationCount", argTypes, term46, args);
        assertTrue(recursiveEquals(term46, term591));
        assertTrue(recursiveEquals(retValue, -2038273078));
    }

};


