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

public class Period_minusMonths_1250130556416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210558;

    public Period_minusMonths_1250130556416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210558 = newInstance(Class.forName("org.joda.time.Period"));
        Object term210612 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term206342 = (Object[]) newArray("org.joda.time.DurationFieldType", 45);
        int[] term206389 = (int[]) newIntArray(247);
        setField(term210612, term210612.getClass(), "iTypes", term206342);
        setField(term210558, term210558.getClass(), "iType", term210612);
        setField(term210558, term210558.getClass(), "iValues", term206389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term210558, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


