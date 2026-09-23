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

public class EventState_stepAccepted_65962665838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3742;
     Object term4508;

    public EventState_stepAccepted_65962665838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3742 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term3870 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term3742, term3742.getClass(), "t0", 0.0);
        setDoubleField(term3870, term3870.getClass(), "endTime", 0.0);
        setField(term3742, term3742.getClass(), "handler", term3870);
        setDoubleField(term3742, term3742.getClass(), "g0", 0.0);
        setBooleanField(term3742, term3742.getClass(), "pendingEvent", false);
        term4508 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        Object term4509 = newInstance(Class.forName("org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker"));
        setDoubleField(term4509, term4509.getClass(), "endTime", 0.0);
        setField(term4508, term4508.getClass(), "handler", term4509);
        setDoubleField(term4508, term4508.getClass(), "maxCheckInterval", 0.0);
        setDoubleField(term4508, term4508.getClass(), "convergence", 0.0);
        setIntField(term4508, term4508.getClass(), "maxIterationCount", 0);
        setDoubleField(term4508, term4508.getClass(), "t0", Double.NaN);
        setDoubleField(term4508, term4508.getClass(), "g0", Double.NaN);
        setBooleanField(term4508, term4508.getClass(), "g0Positive", false);
        setBooleanField(term4508, term4508.getClass(), "pendingEvent", false);
        setDoubleField(term4508, term4508.getClass(), "pendingEventTime", 0.0);
        setDoubleField(term4508, term4508.getClass(), "previousEventTime", 0.0);
        setBooleanField(term4508, term4508.getClass(), "forward", false);
        setBooleanField(term4508, term4508.getClass(), "increasing", false);
        setIntField(term4508, term4508.getClass(), "nextAction", 3);
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
        callMethod(klass, "stepAccepted", argTypes, term3742, args);
        assertTrue(recursiveEquals(term3742, term4508));
    }

};


