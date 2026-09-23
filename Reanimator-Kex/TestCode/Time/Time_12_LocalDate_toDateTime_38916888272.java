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

public class LocalDate_toDateTime_38916888272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140825;
     Object term140955;

    public LocalDate_toDateTime_38916888272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140825 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term140903 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        setField(term140825, term140825.getClass(), "iChronology", term140903);
        term140955 = newInstance(Class.forName("org.joda.time.LocalTime"));
        Object term141017 = newInstance(Class.forName("org.joda.time.DateTimeZone$1"));
        setField(term140955, term140955.getClass(), "iChronology", term141017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.LocalTime");
        argTypes[1] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[2];
        args[0] = term140955;
        args[1] = null;
        try {
            callMethod(klass, "toDateTime", argTypes, term140825, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


