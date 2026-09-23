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

public class Period_toStandardSeconds_1824515708167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2862;

    public Period_toStandardSeconds_1824515708167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2862 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2863 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2876 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2877 = (int[]) newIntArray(5);
        int[] term2883 = (int[]) newIntArray(6);
        setField(term2863, term2863.getClass(), "iName", "MjGYSRKTNF");
        setField(term2863, term2863.getClass(), "iTypes", term2876);
        setIntElement(term2877, 0, -2068769794);
        setIntElement(term2877, 1, -117576464);
        setIntElement(term2877, 2, -1007160944);
        setIntElement(term2877, 3, 1135664017);
        setIntElement(term2877, 4, 590364439);
        setField(term2863, term2863.getClass(), "iIndices", term2877);
        setField(term2862, term2862.getClass(), "iType", term2863);
        setField(term2862, term2862.getClass(), "iValues", term2883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toStandardSeconds", argTypes, term2862, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


