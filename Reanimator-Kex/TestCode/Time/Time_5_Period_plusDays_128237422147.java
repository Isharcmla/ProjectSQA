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

public class Period_plusDays_128237422147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1854;
     Object term1882;

    public Period_plusDays_128237422147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1854 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1855 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1868 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1869 = (int[]) newIntArray(5);
        int[] term1875 = (int[]) newIntArray(6);
        setField(term1855, term1855.getClass(), "iName", "MjGYSRKTNF");
        setField(term1855, term1855.getClass(), "iTypes", term1868);
        setIntElement(term1869, 0, -2068769794);
        setIntElement(term1869, 1, -117576464);
        setIntElement(term1869, 2, -1007160944);
        setIntElement(term1869, 3, 1135664017);
        setIntElement(term1869, 4, 590364439);
        setField(term1855, term1855.getClass(), "iIndices", term1869);
        setField(term1854, term1854.getClass(), "iType", term1855);
        setField(term1854, term1854.getClass(), "iValues", term1875);
        term1882 = new Integer(1045657203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1882;
        try {
            callMethod(klass, "plusDays", argTypes, term1854, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


