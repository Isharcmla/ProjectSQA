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

public class EventState_stop_130976681333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3062;
     Object term3371;

    public EventState_stop_130976681333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3062 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setIntField(term3062, term3062.getClass(), "nextAction", 0);
        term3371 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term3371, term3371.getClass(), "handler", null);
        setDoubleField(term3371, term3371.getClass(), "maxCheckInterval", 0.0);
        setDoubleField(term3371, term3371.getClass(), "convergence", 0.0);
        setIntField(term3371, term3371.getClass(), "maxIterationCount", 0);
        setDoubleField(term3371, term3371.getClass(), "t0", 0.0);
        setDoubleField(term3371, term3371.getClass(), "g0", 0.0);
        setBooleanField(term3371, term3371.getClass(), "g0Positive", false);
        setBooleanField(term3371, term3371.getClass(), "pendingEvent", false);
        setDoubleField(term3371, term3371.getClass(), "pendingEventTime", 0.0);
        setDoubleField(term3371, term3371.getClass(), "previousEventTime", 0.0);
        setBooleanField(term3371, term3371.getClass(), "forward", false);
        setBooleanField(term3371, term3371.getClass(), "increasing", false);
        setIntField(term3371, term3371.getClass(), "nextAction", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "stop", argTypes, term3062, args);
        assertTrue(recursiveEquals(term3062, term3371));
        assertTrue(recursiveEquals(retValue, true));
    }

};


