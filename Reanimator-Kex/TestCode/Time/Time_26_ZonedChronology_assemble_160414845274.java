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

public class ZonedChronology_assemble_160414845274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20812;
     Object term20912;

    public ZonedChronology_assemble_160414845274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20812 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term20912 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term21028 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDurationField"));
        setField(term20912, term20912.getClass(), "eras", null);
        setField(term20912, term20912.getClass(), "centuries", null);
        setField(term20912, term20912.getClass(), "years", null);
        setField(term20912, term20912.getClass(), "months", null);
        setField(term20912, term20912.getClass(), "weekyears", null);
        setField(term20912, term20912.getClass(), "weeks", term21028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term20912;
        try {
            callMethod(klass, "assemble", argTypes, term20812, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


