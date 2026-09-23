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

public class Period_getMinutes_1025828441128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term864;

    public Period_getMinutes_1025828441128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term864 = newInstance(Class.forName("org.joda.time.Period"));
        Object term865 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term878 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term879 = (int[]) newIntArray(5);
        int[] term885 = (int[]) newIntArray(6);
        setField(term865, term865.getClass(), "iName", "MjGYSRKTNF");
        setField(term865, term865.getClass(), "iTypes", term878);
        setIntElement(term879, 0, -2068769794);
        setIntElement(term879, 1, -117576464);
        setIntElement(term879, 2, -1007160944);
        setIntElement(term879, 3, 1135664017);
        setIntElement(term879, 4, 590364439);
        setField(term865, term865.getClass(), "iIndices", term879);
        setField(term864, term864.getClass(), "iType", term865);
        setField(term864, term864.getClass(), "iValues", term885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getMinutes", argTypes, term864, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


