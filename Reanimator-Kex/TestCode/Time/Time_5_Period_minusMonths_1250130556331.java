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

public class Period_minusMonths_1250130556331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162599;

    public Period_minusMonths_1250130556331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162599 = newInstance(Class.forName("org.joda.time.Period"));
        Object term162653 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term162469 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term162474 = (int[]) newIntArray(9);
        setField(term162653, term162653.getClass(), "iTypes", term162469);
        setField(term162599, term162599.getClass(), "iType", term162653);
        setField(term162599, term162599.getClass(), "iValues", term162474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term162599, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


