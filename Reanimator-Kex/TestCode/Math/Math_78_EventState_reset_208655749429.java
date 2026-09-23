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

public class EventState_reset_208655749429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2195;
     Object term2956;

    public EventState_reset_208655749429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2195 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setBooleanField(term2195, term2195.getClass(), "pendingEvent", false);
        term2956 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term2956, term2956.getClass(), "handler", null);
        setDoubleField(term2956, term2956.getClass(), "maxCheckInterval", 0.0);
        setDoubleField(term2956, term2956.getClass(), "convergence", 0.0);
        setIntField(term2956, term2956.getClass(), "maxIterationCount", 0);
        setDoubleField(term2956, term2956.getClass(), "t0", 0.0);
        setDoubleField(term2956, term2956.getClass(), "g0", 0.0);
        setBooleanField(term2956, term2956.getClass(), "g0Positive", false);
        setBooleanField(term2956, term2956.getClass(), "pendingEvent", false);
        setDoubleField(term2956, term2956.getClass(), "pendingEventTime", 0.0);
        setDoubleField(term2956, term2956.getClass(), "previousEventTime", 0.0);
        setBooleanField(term2956, term2956.getClass(), "forward", false);
        setBooleanField(term2956, term2956.getClass(), "increasing", false);
        setIntField(term2956, term2956.getClass(), "nextAction", 0);
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
        Object retValue = callMethod(klass, "reset", argTypes, term2195, args);
        assertTrue(recursiveEquals(term2195, term2956));
        assertTrue(recursiveEquals(retValue, false));
    }

};


