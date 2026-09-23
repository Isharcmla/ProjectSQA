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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Period_minusMinutes_1467465136158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2413;
     Object term2441;

    public Period_minusMinutes_1467465136158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2413 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2414 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2427 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2428 = (int[]) newIntArray(5);
        int[] term2434 = (int[]) newIntArray(6);
        setField(term2414, term2414.getClass(), "iName", "MjGYSRKTNF");
        setField(term2414, term2414.getClass(), "iTypes", term2427);
        setIntElement(term2428, 0, -2068769794);
        setIntElement(term2428, 1, -117576464);
        setIntElement(term2428, 2, -1007160944);
        setIntElement(term2428, 3, 1135664017);
        setIntElement(term2428, 4, 590364439);
        setField(term2414, term2414.getClass(), "iIndices", term2428);
        setField(term2413, term2413.getClass(), "iType", term2414);
        setField(term2413, term2413.getClass(), "iValues", term2434);
        term2441 = new Integer(-341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2441;
        try {
            callMethod(klass, "minusMinutes", argTypes, term2413, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


