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

public class EventState_evaluateStep_207906043217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public EventState_evaluateStep_207906043217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState"));
        setField(term85, term85.getClass(), "handler", null);
        setDoubleField(term85, term85.getClass(), "maxCheckInterval", 0.5279279537140873);
        setDoubleField(term85, term85.getClass(), "convergence", 0.3202192021706908);
        setIntField(term85, term85.getClass(), "maxIterationCount", -522618178);
        setDoubleField(term85, term85.getClass(), "t0", 0.22651340641904605);
        setDoubleField(term85, term85.getClass(), "g0", 0.8878841294187743);
        setBooleanField(term85, term85.getClass(), "g0Positive", true);
        setBooleanField(term85, term85.getClass(), "pendingEvent", true);
        setDoubleField(term85, term85.getClass(), "pendingEventTime", 0.6588948704887806);
        setDoubleField(term85, term85.getClass(), "previousEventTime", 0.6397214730945112);
        setBooleanField(term85, term85.getClass(), "forward", true);
        setBooleanField(term85, term85.getClass(), "increasing", true);
        setIntField(term85, term85.getClass(), "nextAction", 1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.events.EventState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.ode.sampling.StepInterpolator");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "evaluateStep", argTypes, term85, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


