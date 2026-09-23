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
import java.lang.Double;

public class EventState_reset_208655749410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term161;
     Object term163;

    public EventState_reset_208655749410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term148, term148.getClass(), "handler", null);
        setDoubleField(term148, term148.getClass(), "maxCheckInterval", 0.025133051616627267);
        setDoubleField(term148, term148.getClass(), "convergence", 0.016575281023182953);
        setIntField(term148, term148.getClass(), "maxIterationCount", 1048535127);
        setDoubleField(term148, term148.getClass(), "t0", 0.5308350402051779);
        setDoubleField(term148, term148.getClass(), "g0", 0.7154795600170818);
        setBooleanField(term148, term148.getClass(), "g0Positive", true);
        setBooleanField(term148, term148.getClass(), "pendingEvent", true);
        setDoubleField(term148, term148.getClass(), "pendingEventTime", 0.6355029654528058);
        setDoubleField(term148, term148.getClass(), "previousEventTime", 0.0022646783892913414);
        setBooleanField(term148, term148.getClass(), "forward", true);
        setBooleanField(term148, term148.getClass(), "increasing", false);
        setIntField(term148, term148.getClass(), "nextAction", -655067527);
        term161 = new Double(0.36226058076369927);
        term163 = (double[]) newDoubleArray(3);
        setDoubleElement(term163, 0, 0.03699061125289671);
        setDoubleElement(term163, 1, 0.6047137830113202);
        setDoubleElement(term163, 2, 0.6767213143579776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term161;
        args[1] = term163;
        callMethod(klass, "reset", argTypes, term148, args);
    }

};


