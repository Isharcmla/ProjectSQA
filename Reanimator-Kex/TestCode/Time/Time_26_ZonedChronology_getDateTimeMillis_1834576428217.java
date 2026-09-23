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

public class ZonedChronology_getDateTimeMillis_1834576428217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79700;

    public ZonedChronology_getDateTimeMillis_1834576428217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79700 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term79774 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term79700, term79700.getClass(), "iBase", null);
        setField(term79700, term79700.getClass(), "iParam", term79774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = 0L;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term79700, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


