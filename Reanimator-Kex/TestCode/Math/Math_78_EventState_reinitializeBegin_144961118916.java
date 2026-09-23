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

public class EventState_reinitializeBegin_144961118916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term72;
     Object term74;

    public EventState_reinitializeBegin_144961118916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term59, term59.getClass(), "handler", null);
        setDoubleField(term59, term59.getClass(), "maxCheckInterval", 0.5840714198152577);
        setDoubleField(term59, term59.getClass(), "convergence", 0.7559240768573477);
        setIntField(term59, term59.getClass(), "maxIterationCount", -1339778481);
        setDoubleField(term59, term59.getClass(), "t0", 0.10667076642995188);
        setDoubleField(term59, term59.getClass(), "g0", 0.11493000848982304);
        setBooleanField(term59, term59.getClass(), "g0Positive", true);
        setBooleanField(term59, term59.getClass(), "pendingEvent", true);
        setDoubleField(term59, term59.getClass(), "pendingEventTime", 0.37161417339133307);
        setDoubleField(term59, term59.getClass(), "previousEventTime", 0.6805867182029153);
        setBooleanField(term59, term59.getClass(), "forward", false);
        setBooleanField(term59, term59.getClass(), "increasing", false);
        setIntField(term59, term59.getClass(), "nextAction", 1725571209);
        term72 = new Double(0.2852810965221698);
        term74 = (double[]) newDoubleArray(5);
        setDoubleElement(term74, 0, 0.6300849762307866);
        setDoubleElement(term74, 1, 0.9737083944266686);
        setDoubleElement(term74, 2, 0.0668892744806211);
        setDoubleElement(term74, 3, 0.3587267442738795);
        setDoubleElement(term74, 4, 0.07802449704920456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term72;
        args[1] = term74;
        try {
            callMethod(klass, "reinitializeBegin", argTypes, term59, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


