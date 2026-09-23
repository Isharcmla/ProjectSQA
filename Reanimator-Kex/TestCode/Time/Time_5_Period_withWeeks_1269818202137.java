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

public class Period_withWeeks_1269818202137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1346;
     Object term1374;

    public Period_withWeeks_1269818202137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1346 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1347 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1360 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1361 = (int[]) newIntArray(5);
        int[] term1367 = (int[]) newIntArray(6);
        setField(term1347, term1347.getClass(), "iName", "MjGYSRKTNF");
        setField(term1347, term1347.getClass(), "iTypes", term1360);
        setIntElement(term1361, 0, -2068769794);
        setIntElement(term1361, 1, -117576464);
        setIntElement(term1361, 2, -1007160944);
        setIntElement(term1361, 3, 1135664017);
        setIntElement(term1361, 4, 590364439);
        setField(term1347, term1347.getClass(), "iIndices", term1361);
        setField(term1346, term1346.getClass(), "iType", term1347);
        setField(term1346, term1346.getClass(), "iValues", term1367);
        term1374 = new Integer(-341962980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1374;
        try {
            callMethod(klass, "withWeeks", argTypes, term1346, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


