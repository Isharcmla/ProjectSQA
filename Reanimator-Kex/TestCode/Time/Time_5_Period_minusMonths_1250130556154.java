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

public class Period_minusMonths_1250130556154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2209;
     Object term2237;

    public Period_minusMonths_1250130556154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2209 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2210 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2223 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2224 = (int[]) newIntArray(5);
        int[] term2230 = (int[]) newIntArray(6);
        setField(term2210, term2210.getClass(), "iName", "MjGYSRKTNF");
        setField(term2210, term2210.getClass(), "iTypes", term2223);
        setIntElement(term2224, 0, -2068769794);
        setIntElement(term2224, 1, -117576464);
        setIntElement(term2224, 2, -1007160944);
        setIntElement(term2224, 3, 1135664017);
        setIntElement(term2224, 4, 590364439);
        setField(term2210, term2210.getClass(), "iIndices", term2224);
        setField(term2209, term2209.getClass(), "iType", term2210);
        setField(term2209, term2209.getClass(), "iValues", term2230);
        term2237 = new Integer(53410913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2237;
        try {
            callMethod(klass, "minusMonths", argTypes, term2209, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


