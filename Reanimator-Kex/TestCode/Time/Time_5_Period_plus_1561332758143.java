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

public class Period_plus_1561332758143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1652;
     Object term59187;
     Object term59159;

    public Period_plus_1561332758143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1652 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1653 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1666 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1667 = (int[]) newIntArray(5);
        int[] term1673 = (int[]) newIntArray(6);
        setField(term1653, term1653.getClass(), "iName", "MjGYSRKTNF");
        setField(term1653, term1653.getClass(), "iTypes", term1666);
        setIntElement(term1667, 0, -2068769794);
        setIntElement(term1667, 1, -117576464);
        setIntElement(term1667, 2, -1007160944);
        setIntElement(term1667, 3, 1135664017);
        setIntElement(term1667, 4, 590364439);
        setField(term1653, term1653.getClass(), "iIndices", term1667);
        setField(term1652, term1652.getClass(), "iType", term1653);
        setField(term1652, term1652.getClass(), "iValues", term1673);
        term59187 = newInstance(Class.forName("org.joda.time.Period"));
        Object term59188 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term59191 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term59192 = (int[]) newIntArray(5);
        int[] term59193 = (int[]) newIntArray(6);
        setField(term59188, term59188.getClass(), "iName", "MjGYSRKTNF");
        setField(term59188, term59188.getClass(), "iTypes", term59191);
        setIntElement(term59192, 0, -2068769794);
        setIntElement(term59192, 1, -117576464);
        setIntElement(term59192, 2, -1007160944);
        setIntElement(term59192, 3, 1135664017);
        setIntElement(term59192, 4, 590364439);
        setField(term59188, term59188.getClass(), "iIndices", term59192);
        setField(term59187, term59187.getClass(), "iType", term59188);
        setField(term59187, term59187.getClass(), "iValues", term59193);
        term59159 = newInstance(Class.forName("org.joda.time.Period"));
        Object term59160 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term59173 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term59174 = (int[]) newIntArray(5);
        int[] term59180 = (int[]) newIntArray(6);
        setField(term59160, term59160.getClass(), "iName", "MjGYSRKTNF");
        setField(term59160, term59160.getClass(), "iTypes", term59173);
        setIntElement(term59174, 0, -2068769794);
        setIntElement(term59174, 1, -117576464);
        setIntElement(term59174, 2, -1007160944);
        setIntElement(term59174, 3, 1135664017);
        setIntElement(term59174, 4, 590364439);
        setField(term59160, term59160.getClass(), "iIndices", term59174);
        setField(term59159, term59159.getClass(), "iType", term59160);
        setField(term59159, term59159.getClass(), "iValues", term59180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "plus", argTypes, term1652, args);
        assertTrue(recursiveEquals(term1652, term59187));
        assertTrue(recursiveEquals(retValue, term59159));
    }

};


