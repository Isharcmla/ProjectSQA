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

public class EventState_getConvergence_72329154514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;
     Object term576;

    public EventState_getConvergence_72329154514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term33, term33.getClass(), "handler", null);
        setDoubleField(term33, term33.getClass(), "maxCheckInterval", 0.7031006357544823);
        setDoubleField(term33, term33.getClass(), "convergence", 0.9527281779865117);
        setIntField(term33, term33.getClass(), "maxIterationCount", -616727354);
        setDoubleField(term33, term33.getClass(), "t0", 0.9828442029246764);
        setDoubleField(term33, term33.getClass(), "g0", 0.2779719046761513);
        setBooleanField(term33, term33.getClass(), "g0Positive", false);
        setBooleanField(term33, term33.getClass(), "pendingEvent", true);
        setDoubleField(term33, term33.getClass(), "pendingEventTime", 0.6436713023569729);
        setDoubleField(term33, term33.getClass(), "previousEventTime", 0.7332741045694002);
        setBooleanField(term33, term33.getClass(), "forward", false);
        setBooleanField(term33, term33.getClass(), "increasing", true);
        setIntField(term33, term33.getClass(), "nextAction", -1955890973);
        term576 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term576, term576.getClass(), "handler", null);
        setDoubleField(term576, term576.getClass(), "maxCheckInterval", 0.7031006357544823);
        setDoubleField(term576, term576.getClass(), "convergence", 0.9527281779865117);
        setIntField(term576, term576.getClass(), "maxIterationCount", -616727354);
        setDoubleField(term576, term576.getClass(), "t0", 0.9828442029246764);
        setDoubleField(term576, term576.getClass(), "g0", 0.2779719046761513);
        setBooleanField(term576, term576.getClass(), "g0Positive", false);
        setBooleanField(term576, term576.getClass(), "pendingEvent", true);
        setDoubleField(term576, term576.getClass(), "pendingEventTime", 0.6436713023569729);
        setDoubleField(term576, term576.getClass(), "previousEventTime", 0.7332741045694002);
        setBooleanField(term576, term576.getClass(), "forward", false);
        setBooleanField(term576, term576.getClass(), "increasing", true);
        setIntField(term576, term576.getClass(), "nextAction", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getConvergence", argTypes, term33, args);
        assertTrue(recursiveEquals(term33, term576));
        assertTrue(recursiveEquals(retValue, 0.9527281779865117));
    }

};


