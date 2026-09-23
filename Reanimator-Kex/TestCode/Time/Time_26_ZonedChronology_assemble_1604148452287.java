package org.joda.time.chrono;

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
import java.lang.IllegalArgumentException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106460;
     Object term106560;

    public ZonedChronology_assemble_1604148452287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106460 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term106560 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term106676 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term106560, term106560.getClass(), "eras", null);
        setField(term106560, term106560.getClass(), "centuries", null);
        setField(term106560, term106560.getClass(), "years", null);
        setField(term106560, term106560.getClass(), "months", null);
        setField(term106560, term106560.getClass(), "weekyears", null);
        setField(term106560, term106560.getClass(), "weeks", null);
        setField(term106560, term106560.getClass(), "days", term106676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term106560;
        try {
            callMethod(klass, "assemble", argTypes, term106460, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


