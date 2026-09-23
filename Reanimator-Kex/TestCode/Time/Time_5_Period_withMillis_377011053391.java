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

public class Period_withMillis_377011053391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193100;

    public Period_withMillis_377011053391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193100 = newInstance(Class.forName("org.joda.time.Period"));
        Object term193154 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term191533 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term191538 = (int[]) newIntArray(489);
        setField(term193154, term193154.getClass(), "iTypes", term191533);
        setField(term193100, term193100.getClass(), "iType", term193154);
        setField(term193100, term193100.getClass(), "iValues", term191538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMillis", argTypes, term193100, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


