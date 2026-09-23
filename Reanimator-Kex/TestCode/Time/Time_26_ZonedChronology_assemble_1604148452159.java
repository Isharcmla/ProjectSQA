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

public class ZonedChronology_assemble_1604148452159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59257;
     Object term59357;

    public ZonedChronology_assemble_1604148452159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59257 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term59357 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term59447 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term59357, term59357.getClass(), "eras", null);
        setField(term59357, term59357.getClass(), "centuries", null);
        setField(term59357, term59357.getClass(), "years", null);
        setField(term59357, term59357.getClass(), "months", term59447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term59357;
        try {
            callMethod(klass, "assemble", argTypes, term59257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


