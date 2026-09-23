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
import java.lang.Object;
import java.lang.Double;

public class EventState_stepAccepted_65962665840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3987;
     Object term4783;

    public EventState_stepAccepted_65962665840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3987 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term4115 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term3987, term3987.getClass(), "t0", 0.0);
        setDoubleField(term4115, term4115.getClass(), "endTime", 0.0);
        setField(term3987, term3987.getClass(), "handler", term4115);
        setDoubleField(term3987, term3987.getClass(), "g0", 0.0);
        setBooleanField(term3987, term3987.getClass(), "pendingEvent", true);
        term4783 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term4784 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term4784, term4784.getClass(), "endTime", 0.0);
        setField(term4783, term4783.getClass(), "handler", term4784);
        setDoubleField(term4783, term4783.getClass(), "maxCheckInterval", 0.0);
        setDoubleField(term4783, term4783.getClass(), "convergence", 0.0);
        setIntField(term4783, term4783.getClass(), "maxIterationCount", 0);
        setDoubleField(term4783, term4783.getClass(), "t0", Double.NaN);
        setDoubleField(term4783, term4783.getClass(), "g0", Double.NaN);
        setBooleanField(term4783, term4783.getClass(), "g0Positive", false);
        setBooleanField(term4783, term4783.getClass(), "pendingEvent", true);
        setDoubleField(term4783, term4783.getClass(), "pendingEventTime", 0.0);
        setDoubleField(term4783, term4783.getClass(), "previousEventTime", Double.NaN);
        setBooleanField(term4783, term4783.getClass(), "forward", false);
        setBooleanField(term4783, term4783.getClass(), "increasing", false);
        setIntField(term4783, term4783.getClass(), "nextAction", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = Double.NaN;
        args[1] = null;
        callMethod(klass, "stepAccepted", argTypes, term3987, args);
        assertTrue(recursiveEquals(term3987, term4783));
    }

};


