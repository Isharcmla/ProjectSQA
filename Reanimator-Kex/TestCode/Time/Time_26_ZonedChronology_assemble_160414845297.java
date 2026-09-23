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
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_160414845297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33823;
     Object term33923;

    public ZonedChronology_assemble_160414845297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33823 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term33923 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term34009 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        setField(term33923, term33923.getClass(), "eras", null);
        setField(term33923, term33923.getClass(), "centuries", null);
        setField(term33923, term33923.getClass(), "years", null);
        setField(term33923, term33923.getClass(), "months", term34009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term33923;
        try {
            callMethod(klass, "assemble", argTypes, term33823, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


