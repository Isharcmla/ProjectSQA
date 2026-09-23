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

public class EventState_getEventHandler_76234927812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term546;

    public EventState_getEventHandler_76234927812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term7, term7.getClass(), "handler", null);
        setDoubleField(term7, term7.getClass(), "maxCheckInterval", 0.5523635872663106);
        setDoubleField(term7, term7.getClass(), "convergence", 0.544608645520025);
        setIntField(term7, term7.getClass(), "maxIterationCount", 1162663216);
        setDoubleField(term7, term7.getClass(), "t0", 0.28570734989730284);
        setDoubleField(term7, term7.getClass(), "g0", 0.40176586625454525);
        setBooleanField(term7, term7.getClass(), "g0Positive", false);
        setBooleanField(term7, term7.getClass(), "pendingEvent", false);
        setDoubleField(term7, term7.getClass(), "pendingEventTime", 0.2641345529914265);
        setDoubleField(term7, term7.getClass(), "previousEventTime", 0.36923381893433327);
        setBooleanField(term7, term7.getClass(), "forward", false);
        setBooleanField(term7, term7.getClass(), "increasing", false);
        setIntField(term7, term7.getClass(), "nextAction", 1484323161);
        term546 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term546, term546.getClass(), "handler", null);
        setDoubleField(term546, term546.getClass(), "maxCheckInterval", 0.5523635872663106);
        setDoubleField(term546, term546.getClass(), "convergence", 0.544608645520025);
        setIntField(term546, term546.getClass(), "maxIterationCount", 1162663216);
        setDoubleField(term546, term546.getClass(), "t0", 0.28570734989730284);
        setDoubleField(term546, term546.getClass(), "g0", 0.40176586625454525);
        setBooleanField(term546, term546.getClass(), "g0Positive", false);
        setBooleanField(term546, term546.getClass(), "pendingEvent", false);
        setDoubleField(term546, term546.getClass(), "pendingEventTime", 0.2641345529914265);
        setDoubleField(term546, term546.getClass(), "previousEventTime", 0.36923381893433327);
        setBooleanField(term546, term546.getClass(), "forward", false);
        setBooleanField(term546, term546.getClass(), "increasing", false);
        setIntField(term546, term546.getClass(), "nextAction", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEventHandler", argTypes, term7, args);
        assertTrue(recursiveEquals(term7, term546));
        assertTrue(recursiveEquals(retValue, null));
    }

};


