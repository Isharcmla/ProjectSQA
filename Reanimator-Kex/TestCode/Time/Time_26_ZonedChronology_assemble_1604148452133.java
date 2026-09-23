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

public class ZonedChronology_assemble_1604148452133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45511;
     Object term45611;

    public ZonedChronology_assemble_1604148452133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45511 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term45611 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term45727 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDurationField"));
        setField(term45611, term45611.getClass(), "eras", null);
        setField(term45611, term45611.getClass(), "centuries", term45727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term45611;
        try {
            callMethod(klass, "assemble", argTypes, term45511, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


