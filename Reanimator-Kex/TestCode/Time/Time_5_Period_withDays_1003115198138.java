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

public class Period_withDays_1003115198138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1397;
     Object term1425;

    public Period_withDays_1003115198138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1397 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1398 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1411 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1412 = (int[]) newIntArray(5);
        int[] term1418 = (int[]) newIntArray(6);
        setField(term1398, term1398.getClass(), "iName", "MjGYSRKTNF");
        setField(term1398, term1398.getClass(), "iTypes", term1411);
        setIntElement(term1412, 0, -2068769794);
        setIntElement(term1412, 1, -117576464);
        setIntElement(term1412, 2, -1007160944);
        setIntElement(term1412, 3, 1135664017);
        setIntElement(term1412, 4, 590364439);
        setField(term1398, term1398.getClass(), "iIndices", term1412);
        setField(term1397, term1397.getClass(), "iType", term1398);
        setField(term1397, term1397.getClass(), "iValues", term1418);
        term1425 = new Integer(1532716628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1425;
        try {
            callMethod(klass, "withDays", argTypes, term1397, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


