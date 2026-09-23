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

public class Period_minusHours_917093504157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2362;
     Object term2390;

    public Period_minusHours_917093504157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2362 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2363 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2376 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2377 = (int[]) newIntArray(5);
        int[] term2383 = (int[]) newIntArray(6);
        setField(term2363, term2363.getClass(), "iName", "MjGYSRKTNF");
        setField(term2363, term2363.getClass(), "iTypes", term2376);
        setIntElement(term2377, 0, -2068769794);
        setIntElement(term2377, 1, -117576464);
        setIntElement(term2377, 2, -1007160944);
        setIntElement(term2377, 3, 1135664017);
        setIntElement(term2377, 4, 590364439);
        setField(term2363, term2363.getClass(), "iIndices", term2377);
        setField(term2362, term2362.getClass(), "iType", term2363);
        setField(term2362, term2362.getClass(), "iValues", term2383);
        term2390 = new Integer(480137250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2390;
        try {
            callMethod(klass, "minusHours", argTypes, term2362, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


