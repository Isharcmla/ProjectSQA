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

public class EventState_stop_130976681320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;
     Object term1375;

    public EventState_stop_130976681320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term135, term135.getClass(), "handler", null);
        setDoubleField(term135, term135.getClass(), "maxCheckInterval", 0.43337207054070237);
        setDoubleField(term135, term135.getClass(), "convergence", 0.13246999699526574);
        setIntField(term135, term135.getClass(), "maxIterationCount", -1456670397);
        setDoubleField(term135, term135.getClass(), "t0", 0.9126850255993704);
        setDoubleField(term135, term135.getClass(), "g0", 0.11179067076100713);
        setBooleanField(term135, term135.getClass(), "g0Positive", true);
        setBooleanField(term135, term135.getClass(), "pendingEvent", true);
        setDoubleField(term135, term135.getClass(), "pendingEventTime", 0.5306473989087822);
        setDoubleField(term135, term135.getClass(), "previousEventTime", 0.022483645678509023);
        setBooleanField(term135, term135.getClass(), "forward", false);
        setBooleanField(term135, term135.getClass(), "increasing", true);
        setIntField(term135, term135.getClass(), "nextAction", 1622346318);
        term1375 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term1375, term1375.getClass(), "handler", null);
        setDoubleField(term1375, term1375.getClass(), "maxCheckInterval", 0.43337207054070237);
        setDoubleField(term1375, term1375.getClass(), "convergence", 0.13246999699526574);
        setIntField(term1375, term1375.getClass(), "maxIterationCount", -1456670397);
        setDoubleField(term1375, term1375.getClass(), "t0", 0.9126850255993704);
        setDoubleField(term1375, term1375.getClass(), "g0", 0.11179067076100713);
        setBooleanField(term1375, term1375.getClass(), "g0Positive", true);
        setBooleanField(term1375, term1375.getClass(), "pendingEvent", true);
        setDoubleField(term1375, term1375.getClass(), "pendingEventTime", 0.5306473989087822);
        setDoubleField(term1375, term1375.getClass(), "previousEventTime", 0.022483645678509023);
        setBooleanField(term1375, term1375.getClass(), "forward", false);
        setBooleanField(term1375, term1375.getClass(), "increasing", true);
        setIntField(term1375, term1375.getClass(), "nextAction", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "stop", argTypes, term135, args);
        assertTrue(recursiveEquals(term135, term1375));
        assertTrue(recursiveEquals(retValue, false));
    }

};


