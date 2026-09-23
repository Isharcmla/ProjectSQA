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

public class ZonedChronology_assemble_1604148452107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36327;
     Object term36427;

    public ZonedChronology_assemble_1604148452107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36327 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term36427 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term36517 = newInstance(Class.forName("org.joda.time.field.DecoratedDurationField"));
        setField(term36427, term36427.getClass(), "eras", null);
        setField(term36427, term36427.getClass(), "centuries", null);
        setField(term36427, term36427.getClass(), "years", null);
        setField(term36427, term36427.getClass(), "months", null);
        setField(term36427, term36427.getClass(), "weekyears", null);
        setField(term36427, term36427.getClass(), "weeks", null);
        setField(term36427, term36427.getClass(), "days", null);
        setField(term36427, term36427.getClass(), "halfdays", null);
        setField(term36427, term36427.getClass(), "hours", term36517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term36427;
        try {
            callMethod(klass, "assemble", argTypes, term36327, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


