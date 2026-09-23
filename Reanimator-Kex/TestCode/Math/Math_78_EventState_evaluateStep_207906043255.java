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

public class EventState_evaluateStep_207906043255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10316;
     Object term10438;

    public EventState_evaluateStep_207906043255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10316 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        term10438 = newInstance(Class.forName("org.apache.commons.math.ode.nonstiff.EulerStepInterpolator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.ode.sampling.StepInterpolator");
        Object[] args = new Object[1];
        args[0] = term10438;
        try {
            callMethod(klass, "evaluateStep", argTypes, term10316, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


