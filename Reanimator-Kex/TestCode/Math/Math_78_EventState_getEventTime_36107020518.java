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

public class EventState_getEventTime_36107020518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;
     Object term1107;

    public EventState_getEventTime_36107020518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term98, term98.getClass(), "handler", null);
        setDoubleField(term98, term98.getClass(), "maxCheckInterval", 0.25937345430928016);
        setDoubleField(term98, term98.getClass(), "convergence", 0.5873228247510078);
        setIntField(term98, term98.getClass(), "maxIterationCount", -883034806);
        setDoubleField(term98, term98.getClass(), "t0", 0.8823181080774973);
        setDoubleField(term98, term98.getClass(), "g0", 0.2192450926212024);
        setBooleanField(term98, term98.getClass(), "g0Positive", true);
        setBooleanField(term98, term98.getClass(), "pendingEvent", false);
        setDoubleField(term98, term98.getClass(), "pendingEventTime", 0.7591353014991907);
        setDoubleField(term98, term98.getClass(), "previousEventTime", 0.791695029600875);
        setBooleanField(term98, term98.getClass(), "forward", false);
        setBooleanField(term98, term98.getClass(), "increasing", false);
        setIntField(term98, term98.getClass(), "nextAction", 1585847225);
        term1107 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term1107, term1107.getClass(), "handler", null);
        setDoubleField(term1107, term1107.getClass(), "maxCheckInterval", 0.25937345430928016);
        setDoubleField(term1107, term1107.getClass(), "convergence", 0.5873228247510078);
        setIntField(term1107, term1107.getClass(), "maxIterationCount", -883034806);
        setDoubleField(term1107, term1107.getClass(), "t0", 0.8823181080774973);
        setDoubleField(term1107, term1107.getClass(), "g0", 0.2192450926212024);
        setBooleanField(term1107, term1107.getClass(), "g0Positive", true);
        setBooleanField(term1107, term1107.getClass(), "pendingEvent", false);
        setDoubleField(term1107, term1107.getClass(), "pendingEventTime", 0.7591353014991907);
        setDoubleField(term1107, term1107.getClass(), "previousEventTime", 0.791695029600875);
        setBooleanField(term1107, term1107.getClass(), "forward", false);
        setBooleanField(term1107, term1107.getClass(), "increasing", false);
        setIntField(term1107, term1107.getClass(), "nextAction", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEventTime", argTypes, term98, args);
        assertTrue(recursiveEquals(term98, term1107));
        assertTrue(recursiveEquals(retValue, 0.7591353014991907));
    }

};


