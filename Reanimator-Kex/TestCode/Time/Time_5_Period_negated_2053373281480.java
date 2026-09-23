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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class Period_negated_2053373281480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258816;
     Object term263375;
     Object term263367;

    public Period_negated_2053373281480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258816 = newInstance(Class.forName("org.joda.time.Period"));
        Object term258870 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term258693 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term258694 = (int[]) newIntArray(5);
        int[] term258700 = (int[]) newIntArray(6);
        setField(term258870, term258870.getClass(), "iName", "MjGYSRKTNF");
        setField(term258870, term258870.getClass(), "iTypes", term258693);
        setIntElement(term258694, 0, -2068769794);
        setIntElement(term258694, 1, -117576464);
        setIntElement(term258694, 2, -1007160944);
        setIntElement(term258694, 3, 1135664017);
        setIntElement(term258694, 4, 590364439);
        setField(term258870, term258870.getClass(), "iIndices", term258694);
        setField(term258816, term258816.getClass(), "iType", term258870);
        setField(term258816, term258816.getClass(), "iValues", term258700);
        term263375 = newInstance(Class.forName("org.joda.time.Period"));
        Object term263376 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term263379 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term263380 = (int[]) newIntArray(5);
        int[] term263381 = (int[]) newIntArray(6);
        setField(term263376, term263376.getClass(), "iName", "MjGYSRKTNF");
        setField(term263376, term263376.getClass(), "iTypes", term263379);
        setIntElement(term263380, 0, -2068769794);
        setIntElement(term263380, 1, -117576464);
        setIntElement(term263380, 2, -1007160944);
        setIntElement(term263380, 3, 1135664017);
        setIntElement(term263380, 4, 590364439);
        setField(term263376, term263376.getClass(), "iIndices", term263380);
        setField(term263375, term263375.getClass(), "iType", term263376);
        setField(term263375, term263375.getClass(), "iValues", term263381);
        term263367 = newInstance(Class.forName("org.joda.time.Period"));
        Object term263165 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term263178 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term263179 = (int[]) newIntArray(5);
        int[] term263368 = (int[]) newIntArray(6);
        setField(term263165, term263165.getClass(), "iName", "MjGYSRKTNF");
        setField(term263165, term263165.getClass(), "iTypes", term263178);
        setIntElement(term263179, 0, -2068769794);
        setIntElement(term263179, 1, -117576464);
        setIntElement(term263179, 2, -1007160944);
        setIntElement(term263179, 3, 1135664017);
        setIntElement(term263179, 4, 590364439);
        setField(term263165, term263165.getClass(), "iIndices", term263179);
        setField(term263367, term263367.getClass(), "iType", term263165);
        setField(term263367, term263367.getClass(), "iValues", term263368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negated", argTypes, term258816, args);
        assertTrue(recursiveEquals(term258816, term263375));
        assertTrue(recursiveEquals(retValue, term263367));
    }

};


