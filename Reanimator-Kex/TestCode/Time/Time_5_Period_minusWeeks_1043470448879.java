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

public class Period_minusWeeks_1043470448879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4050032;

    public Period_minusWeeks_1043470448879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4050032 = newInstance(Class.forName("org.joda.time.Period"));
        Object term4050086 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term4048549 = (Object[]) newArray("org.joda.time.DurationFieldType", 12);
        int[] term4048563 = (int[]) newIntArray(107);
        setField(term4050086, term4050086.getClass(), "iTypes", term4048549);
        setField(term4050032, term4050032.getClass(), "iType", term4050086);
        setField(term4050032, term4050032.getClass(), "iValues", term4048563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusWeeks", argTypes, term4050032, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


