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

public class Period_minusWeeks_1043470448565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327923;

    public Period_minusWeeks_1043470448565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327923 = newInstance(Class.forName("org.joda.time.Period"));
        Object term327977 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term326853 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term326857 = (int[]) newIntArray(489);
        setField(term327977, term327977.getClass(), "iTypes", term326853);
        setField(term327923, term327923.getClass(), "iType", term327977);
        setField(term327923, term327923.getClass(), "iValues", term326857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusWeeks", argTypes, term327923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


