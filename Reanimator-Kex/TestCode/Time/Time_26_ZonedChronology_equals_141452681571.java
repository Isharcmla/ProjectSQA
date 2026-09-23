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

public class ZonedChronology_equals_141452681571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259846;
     Object term259729;

    public ZonedChronology_equals_141452681571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259846 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term259885 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term259885, term259885.getClass(), "iBase", term259846);
        setField(term259885, term259885.getClass(), "iParam", null);
        setField(term259846, term259846.getClass(), "iBase", term259885);
        term259729 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term259807 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term259959 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term259807, term259807.getClass(), "iBase", term259846);
        setField(term259807, term259807.getClass(), "iParam", term259959);
        setField(term259729, term259729.getClass(), "iBase", term259807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term259729;
        try {
            callMethod(klass, "equals", argTypes, term259846, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


