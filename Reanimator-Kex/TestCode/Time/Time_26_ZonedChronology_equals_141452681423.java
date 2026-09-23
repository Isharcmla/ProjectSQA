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

public class ZonedChronology_equals_141452681423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184752;
     Object term185062;

    public ZonedChronology_equals_141452681423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184752 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term185179 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term185218 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term185256 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term185218, term185218.getClass(), "iBase", term185218);
        setField(term185218, term185218.getClass(), "iParam", null);
        setField(term185179, term185179.getClass(), "iBase", term185218);
        setField(term185179, term185179.getClass(), "iParam", term185256);
        setField(term184752, term184752.getClass(), "iBase", term185179);
        term185062 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term185140 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term185140, term185140.getClass(), "iBase", term185179);
        setField(term185062, term185062.getClass(), "iBase", term185140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term185062;
        try {
            callMethod(klass, "equals", argTypes, term184752, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


