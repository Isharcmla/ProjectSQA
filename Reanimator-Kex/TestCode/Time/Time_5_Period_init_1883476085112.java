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

public class Period_init_1883476085112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363;

    public Period_init_1883476085112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term376 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term377 = (int[]) newIntArray(3);
        setField(term363, term363.getClass(), "iName", "aJlieCFVtF");
        setField(term363, term363.getClass(), "iTypes", term376);
        setIntElement(term377, 0, -2027534003);
        setIntElement(term377, 1, 1063420942);
        setIntElement(term377, 2, 1375330971);
        setField(term363, term363.getClass(), "iIndices", term377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[2] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term363;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


