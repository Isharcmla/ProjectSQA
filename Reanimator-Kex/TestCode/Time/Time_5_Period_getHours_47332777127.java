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

public class Period_getHours_47332777127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term815;

    public Period_getHours_47332777127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term815 = newInstance(Class.forName("org.joda.time.Period"));
        Object term816 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term829 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term830 = (int[]) newIntArray(5);
        int[] term836 = (int[]) newIntArray(6);
        setField(term816, term816.getClass(), "iName", "MjGYSRKTNF");
        setField(term816, term816.getClass(), "iTypes", term829);
        setIntElement(term830, 0, -2068769794);
        setIntElement(term830, 1, -117576464);
        setIntElement(term830, 2, -1007160944);
        setIntElement(term830, 3, 1135664017);
        setIntElement(term830, 4, 590364439);
        setField(term816, term816.getClass(), "iIndices", term830);
        setField(term815, term815.getClass(), "iType", term816);
        setField(term815, term815.getClass(), "iValues", term836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getHours", argTypes, term815, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


