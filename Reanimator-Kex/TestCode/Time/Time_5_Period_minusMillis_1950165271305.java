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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_minusMillis_1950165271305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151136;

    public Period_minusMillis_1950165271305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151136 = newInstance(Class.forName("org.joda.time.Period"));
        Object term151190 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term150980 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term150986 = (int[]) newIntArray(11);
        setField(term151190, term151190.getClass(), "iTypes", term150980);
        setField(term151136, term151136.getClass(), "iType", term151190);
        setField(term151136, term151136.getClass(), "iValues", term150986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMillis", argTypes, term151136, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


