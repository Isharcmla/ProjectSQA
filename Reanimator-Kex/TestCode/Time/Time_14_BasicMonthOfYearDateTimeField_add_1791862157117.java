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
import java.lang.NumberFormatException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_add_1791862157117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24213;

    public BasicMonthOfYearDateTimeField_add_1791862157117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24213 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term24293 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        setField(term24213, term24213.getClass(), "iChronology", term24293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = 0L;
        args[1] = 2147483648L;
        try {
            callMethod(klass, "add", argTypes, term24213, args);
            assertTrue(false);
        }
        catch (NumberFormatException e) {
        }

    }

};


