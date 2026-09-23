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

public class Period_normalizedStandard_1121683174171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3080;
     Object term3108;

    public Period_normalizedStandard_1121683174171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3080 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3081 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3094 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term3095 = (int[]) newIntArray(5);
        int[] term3101 = (int[]) newIntArray(6);
        setField(term3081, term3081.getClass(), "iName", "MjGYSRKTNF");
        setField(term3081, term3081.getClass(), "iTypes", term3094);
        setIntElement(term3095, 0, -2068769794);
        setIntElement(term3095, 1, -117576464);
        setIntElement(term3095, 2, -1007160944);
        setIntElement(term3095, 3, 1135664017);
        setIntElement(term3095, 4, 590364439);
        setField(term3081, term3081.getClass(), "iIndices", term3095);
        setField(term3080, term3080.getClass(), "iType", term3081);
        setField(term3080, term3080.getClass(), "iValues", term3101);
        term3108 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3121 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        int[] term3122 = (int[]) newIntArray(6);
        setField(term3108, term3108.getClass(), "iName", "eZFUvlxvGV");
        setField(term3108, term3108.getClass(), "iTypes", term3121);
        setIntElement(term3122, 0, -343325701);
        setIntElement(term3122, 1, 107945604);
        setIntElement(term3122, 2, -1963464809);
        setIntElement(term3122, 3, 71190297);
        setIntElement(term3122, 4, 1202361360);
        setIntElement(term3122, 5, -2015048153);
        setField(term3108, term3108.getClass(), "iIndices", term3122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[1];
        args[0] = term3108;
        try {
            callMethod(klass, "normalizedStandard", argTypes, term3080, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


