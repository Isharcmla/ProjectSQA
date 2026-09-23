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

public class GJChronology_getInstance_29092117961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16538;

    public GJChronology_getInstance_29092117961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16538 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.DateTimeZone");
        argTypes[1] = long.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term16538;
        args[1] = -1L;
        args[2] = 0;
        try {
            callMethod(klass, "getInstance", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


