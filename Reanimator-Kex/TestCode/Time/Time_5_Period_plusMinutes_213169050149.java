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

public class Period_plusMinutes_213169050149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1956;
     Object term1984;

    public Period_plusMinutes_213169050149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1956 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1957 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1970 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1971 = (int[]) newIntArray(5);
        int[] term1977 = (int[]) newIntArray(6);
        setField(term1957, term1957.getClass(), "iName", "MjGYSRKTNF");
        setField(term1957, term1957.getClass(), "iTypes", term1970);
        setIntElement(term1971, 0, -2068769794);
        setIntElement(term1971, 1, -117576464);
        setIntElement(term1971, 2, -1007160944);
        setIntElement(term1971, 3, 1135664017);
        setIntElement(term1971, 4, 590364439);
        setField(term1957, term1957.getClass(), "iIndices", term1971);
        setField(term1956, term1956.getClass(), "iType", term1957);
        setField(term1956, term1956.getClass(), "iValues", term1977);
        term1984 = new Integer(1072005683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1984;
        try {
            callMethod(klass, "plusMinutes", argTypes, term1956, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


