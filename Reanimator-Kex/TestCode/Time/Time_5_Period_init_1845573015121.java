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

public class Period_init_1845573015121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534;
     Object term540;
     Object term51062;
     Object term51069;
     Object term51070;

    public Period_init_1845573015121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534 = (int[]) newIntArray(5);
        setIntElement(term534, 0, -1263114719);
        setIntElement(term534, 1, -894662986);
        setIntElement(term534, 2, 304775596);
        setIntElement(term534, 3, -1347665717);
        setIntElement(term534, 4, -1888585309);
        term540 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term553 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term554 = (int[]) newIntArray(0);
        setField(term540, term540.getClass(), "iName", "hNxWaHcfhY");
        setField(term540, term540.getClass(), "iTypes", term553);
        setField(term540, term540.getClass(), "iIndices", term554);
        term51062 = newInstance(Class.forName("org.joda.time.Period"));
        Object term51063 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term51066 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term51067 = (int[]) newIntArray(0);
        int[] term51068 = (int[]) newIntArray(5);
        setField(term51063, term51063.getClass(), "iName", "hNxWaHcfhY");
        setField(term51063, term51063.getClass(), "iTypes", term51066);
        setField(term51063, term51063.getClass(), "iIndices", term51067);
        setField(term51062, term51062.getClass(), "iType", term51063);
        setIntElement(term51068, 0, -1263114719);
        setIntElement(term51068, 1, -894662986);
        setIntElement(term51068, 2, 304775596);
        setIntElement(term51068, 3, -1347665717);
        setIntElement(term51068, 4, -1888585309);
        setField(term51062, term51062.getClass(), "iValues", term51068);
        term51069 = (int[]) newIntArray(5);
        setIntElement(term51069, 0, -1263114719);
        setIntElement(term51069, 1, -894662986);
        setIntElement(term51069, 2, 304775596);
        setIntElement(term51069, 3, -1347665717);
        setIntElement(term51069, 4, -1888585309);
        term51070 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term51073 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term51074 = (int[]) newIntArray(0);
        setField(term51070, term51070.getClass(), "iName", "hNxWaHcfhY");
        setField(term51070, term51070.getClass(), "iTypes", term51073);
        setField(term51070, term51070.getClass(), "iIndices", term51074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[2];
        args[0] = term534;
        args[1] = term540;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term51062));
        assertTrue(recursiveEquals(term534, term51069));
        assertTrue(recursiveEquals(term540, term51070));
    }

};


