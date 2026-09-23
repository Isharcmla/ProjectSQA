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

public class ZonedChronology_assemble_1604148452200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73028;
     Object term73128;

    public ZonedChronology_assemble_1604148452200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73028 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term73128 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term73218 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term73128, term73128.getClass(), "eras", null);
        setField(term73128, term73128.getClass(), "centuries", null);
        setField(term73128, term73128.getClass(), "years", null);
        setField(term73128, term73128.getClass(), "months", null);
        setField(term73128, term73128.getClass(), "weekyears", null);
        setField(term73128, term73128.getClass(), "weeks", term73218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term73128;
        try {
            callMethod(klass, "assemble", argTypes, term73028, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


