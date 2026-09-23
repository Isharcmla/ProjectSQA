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

public class Period_withMinutes_1304361658140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1499;
     Object term1527;

    public Period_withMinutes_1304361658140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1499 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1500 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1513 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1514 = (int[]) newIntArray(5);
        int[] term1520 = (int[]) newIntArray(6);
        setField(term1500, term1500.getClass(), "iName", "MjGYSRKTNF");
        setField(term1500, term1500.getClass(), "iTypes", term1513);
        setIntElement(term1514, 0, -2068769794);
        setIntElement(term1514, 1, -117576464);
        setIntElement(term1514, 2, -1007160944);
        setIntElement(term1514, 3, 1135664017);
        setIntElement(term1514, 4, 590364439);
        setField(term1500, term1500.getClass(), "iIndices", term1514);
        setField(term1499, term1499.getClass(), "iType", term1500);
        setField(term1499, term1499.getClass(), "iValues", term1520);
        term1527 = new Integer(1141317871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1527;
        try {
            callMethod(klass, "withMinutes", argTypes, term1499, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


