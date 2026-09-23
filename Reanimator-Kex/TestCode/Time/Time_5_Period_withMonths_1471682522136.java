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

public class Period_withMonths_1471682522136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1295;
     Object term1323;

    public Period_withMonths_1471682522136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1295 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1296 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1309 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1310 = (int[]) newIntArray(5);
        int[] term1316 = (int[]) newIntArray(6);
        setField(term1296, term1296.getClass(), "iName", "MjGYSRKTNF");
        setField(term1296, term1296.getClass(), "iTypes", term1309);
        setIntElement(term1310, 0, -2068769794);
        setIntElement(term1310, 1, -117576464);
        setIntElement(term1310, 2, -1007160944);
        setIntElement(term1310, 3, 1135664017);
        setIntElement(term1310, 4, 590364439);
        setField(term1296, term1296.getClass(), "iIndices", term1310);
        setField(term1295, term1295.getClass(), "iType", term1296);
        setField(term1295, term1295.getClass(), "iValues", term1316);
        term1323 = new Integer(-1476117762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1323;
        try {
            callMethod(klass, "withMonths", argTypes, term1295, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


