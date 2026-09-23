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

public class Period_withHours_1143441258139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1448;
     Object term1476;

    public Period_withHours_1143441258139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1448 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1449 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1462 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1463 = (int[]) newIntArray(5);
        int[] term1469 = (int[]) newIntArray(6);
        setField(term1449, term1449.getClass(), "iName", "MjGYSRKTNF");
        setField(term1449, term1449.getClass(), "iTypes", term1462);
        setIntElement(term1463, 0, -2068769794);
        setIntElement(term1463, 1, -117576464);
        setIntElement(term1463, 2, -1007160944);
        setIntElement(term1463, 3, 1135664017);
        setIntElement(term1463, 4, 590364439);
        setField(term1449, term1449.getClass(), "iIndices", term1463);
        setField(term1448, term1448.getClass(), "iType", term1449);
        setField(term1448, term1448.getClass(), "iValues", term1469);
        term1476 = new Integer(-1801760683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1476;
        try {
            callMethod(klass, "withHours", argTypes, term1448, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


