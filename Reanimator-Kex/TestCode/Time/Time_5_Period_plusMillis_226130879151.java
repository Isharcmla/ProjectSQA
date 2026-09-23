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

public class Period_plusMillis_226130879151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2058;
     Object term2086;

    public Period_plusMillis_226130879151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2058 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2059 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2072 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2073 = (int[]) newIntArray(5);
        int[] term2079 = (int[]) newIntArray(6);
        setField(term2059, term2059.getClass(), "iName", "MjGYSRKTNF");
        setField(term2059, term2059.getClass(), "iTypes", term2072);
        setIntElement(term2073, 0, -2068769794);
        setIntElement(term2073, 1, -117576464);
        setIntElement(term2073, 2, -1007160944);
        setIntElement(term2073, 3, 1135664017);
        setIntElement(term2073, 4, 590364439);
        setField(term2059, term2059.getClass(), "iIndices", term2073);
        setField(term2058, term2058.getClass(), "iType", term2059);
        setField(term2058, term2058.getClass(), "iValues", term2079);
        term2086 = new Integer(1474524152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2086;
        try {
            callMethod(klass, "plusMillis", argTypes, term2058, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


