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

public class BasicMonthOfYearDateTimeField_getDifferenceAsLong_678434483394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117699;

    public BasicMonthOfYearDateTimeField_getDifferenceAsLong_678434483394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117699 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term117779 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        setField(term117699, term117699.getClass(), "iChronology", term117779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = 9223372036854775806L;
        args[1] = -9223372036854775808L;
        try {
            callMethod(klass, "getDifferenceAsLong", argTypes, term117699, args);
            assertTrue(false);
        }
        catch (NumberFormatException e) {
        }

    }

};


