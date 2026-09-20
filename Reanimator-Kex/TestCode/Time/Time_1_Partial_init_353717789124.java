package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_init_353717789124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Partial_init_353717789124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56090 = newInstance(Class.forName("org.joda.time.Partial"));
        Object term56164 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term56250 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term56250, term56250.getClass(), "iBase", null);
        setField(term56164, term56164.getClass(), "iBase", term56250);
        setField(term56090, term56090.getClass(), "iChronology", term56164);
        Object term56324 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term56324, term56324.getClass(), "iNameKey", "UTC");
        setIntField(term56324, term56324.getClass(), "iWallOffset", 0);
        setIntField(term56324, term56324.getClass(), "iStandardOffset", 0);
        setField(term56324, term56324.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term56324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.joda.time.DateTimeFieldType"), 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};
