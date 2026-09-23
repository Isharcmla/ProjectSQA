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

public class Period_minusMillis_1950165271160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2515;
     Object term2543;

    public Period_minusMillis_1950165271160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2515 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2516 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2529 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2530 = (int[]) newIntArray(5);
        int[] term2536 = (int[]) newIntArray(6);
        setField(term2516, term2516.getClass(), "iName", "MjGYSRKTNF");
        setField(term2516, term2516.getClass(), "iTypes", term2529);
        setIntElement(term2530, 0, -2068769794);
        setIntElement(term2530, 1, -117576464);
        setIntElement(term2530, 2, -1007160944);
        setIntElement(term2530, 3, 1135664017);
        setIntElement(term2530, 4, 590364439);
        setField(term2516, term2516.getClass(), "iIndices", term2530);
        setField(term2515, term2515.getClass(), "iType", term2516);
        setField(term2515, term2515.getClass(), "iValues", term2536);
        term2543 = new Integer(538259104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2543;
        try {
            callMethod(klass, "minusMillis", argTypes, term2515, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


