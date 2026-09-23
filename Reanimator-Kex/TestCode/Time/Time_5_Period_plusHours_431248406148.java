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

public class Period_plusHours_431248406148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1905;
     Object term1933;

    public Period_plusHours_431248406148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1905 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1906 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1919 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1920 = (int[]) newIntArray(5);
        int[] term1926 = (int[]) newIntArray(6);
        setField(term1906, term1906.getClass(), "iName", "MjGYSRKTNF");
        setField(term1906, term1906.getClass(), "iTypes", term1919);
        setIntElement(term1920, 0, -2068769794);
        setIntElement(term1920, 1, -117576464);
        setIntElement(term1920, 2, -1007160944);
        setIntElement(term1920, 3, 1135664017);
        setIntElement(term1920, 4, 590364439);
        setField(term1906, term1906.getClass(), "iIndices", term1920);
        setField(term1905, term1905.getClass(), "iType", term1906);
        setField(term1905, term1905.getClass(), "iValues", term1926);
        term1933 = new Integer(1386130016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1933;
        try {
            callMethod(klass, "plusHours", argTypes, term1905, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


