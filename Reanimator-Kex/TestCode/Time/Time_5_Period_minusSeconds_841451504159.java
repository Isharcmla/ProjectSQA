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

public class Period_minusSeconds_841451504159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2464;
     Object term2492;

    public Period_minusSeconds_841451504159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2464 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2465 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2478 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2479 = (int[]) newIntArray(5);
        int[] term2485 = (int[]) newIntArray(6);
        setField(term2465, term2465.getClass(), "iName", "MjGYSRKTNF");
        setField(term2465, term2465.getClass(), "iTypes", term2478);
        setIntElement(term2479, 0, -2068769794);
        setIntElement(term2479, 1, -117576464);
        setIntElement(term2479, 2, -1007160944);
        setIntElement(term2479, 3, 1135664017);
        setIntElement(term2479, 4, 590364439);
        setField(term2465, term2465.getClass(), "iIndices", term2479);
        setField(term2464, term2464.getClass(), "iType", term2465);
        setField(term2464, term2464.getClass(), "iValues", term2485);
        term2492 = new Integer(-2015854073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2492;
        try {
            callMethod(klass, "minusSeconds", argTypes, term2464, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


