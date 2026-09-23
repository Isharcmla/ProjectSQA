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
import java.lang.Double;

public class EventState_stepAccepted_65962665819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term124;
     Object term126;

    public EventState_stepAccepted_65962665819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term111, term111.getClass(), "handler", null);
        setDoubleField(term111, term111.getClass(), "maxCheckInterval", 0.6862221294683138);
        setDoubleField(term111, term111.getClass(), "convergence", 0.15917839663695388);
        setIntField(term111, term111.getClass(), "maxIterationCount", 597278769);
        setDoubleField(term111, term111.getClass(), "t0", 0.9374115574082594);
        setDoubleField(term111, term111.getClass(), "g0", 0.8454723071922143);
        setBooleanField(term111, term111.getClass(), "g0Positive", true);
        setBooleanField(term111, term111.getClass(), "pendingEvent", true);
        setDoubleField(term111, term111.getClass(), "pendingEventTime", 0.8566567697571895);
        setDoubleField(term111, term111.getClass(), "previousEventTime", 0.9203805380592256);
        setBooleanField(term111, term111.getClass(), "forward", true);
        setBooleanField(term111, term111.getClass(), "increasing", true);
        setIntField(term111, term111.getClass(), "nextAction", -1685132342);
        term124 = new Double(0.5804948995371725);
        term126 = (double[]) newDoubleArray(4);
        setDoubleElement(term126, 0, 0.20737514139742264);
        setDoubleElement(term126, 1, 0.7919370314903882);
        setDoubleElement(term126, 2, 0.2109867221632754);
        setDoubleElement(term126, 3, 0.3227335400819148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term124;
        args[1] = term126;
        try {
            callMethod(klass, "stepAccepted", argTypes, term111, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


