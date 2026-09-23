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

public class Period_negated_2053373281162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2617;
     Object term66894;
     Object term66886;

    public Period_negated_2053373281162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2617 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2618 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2631 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2632 = (int[]) newIntArray(5);
        int[] term2638 = (int[]) newIntArray(6);
        setField(term2618, term2618.getClass(), "iName", "MjGYSRKTNF");
        setField(term2618, term2618.getClass(), "iTypes", term2631);
        setIntElement(term2632, 0, -2068769794);
        setIntElement(term2632, 1, -117576464);
        setIntElement(term2632, 2, -1007160944);
        setIntElement(term2632, 3, 1135664017);
        setIntElement(term2632, 4, 590364439);
        setField(term2618, term2618.getClass(), "iIndices", term2632);
        setField(term2617, term2617.getClass(), "iType", term2618);
        setField(term2617, term2617.getClass(), "iValues", term2638);
        term66894 = newInstance(Class.forName("org.joda.time.Period"));
        Object term66895 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term66898 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term66899 = (int[]) newIntArray(5);
        int[] term66900 = (int[]) newIntArray(6);
        setField(term66895, term66895.getClass(), "iName", "MjGYSRKTNF");
        setField(term66895, term66895.getClass(), "iTypes", term66898);
        setIntElement(term66899, 0, -2068769794);
        setIntElement(term66899, 1, -117576464);
        setIntElement(term66899, 2, -1007160944);
        setIntElement(term66899, 3, 1135664017);
        setIntElement(term66899, 4, 590364439);
        setField(term66895, term66895.getClass(), "iIndices", term66899);
        setField(term66894, term66894.getClass(), "iType", term66895);
        setField(term66894, term66894.getClass(), "iValues", term66900);
        term66886 = newInstance(Class.forName("org.joda.time.Period"));
        Object term66684 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term66697 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term66698 = (int[]) newIntArray(5);
        int[] term66887 = (int[]) newIntArray(6);
        setField(term66684, term66684.getClass(), "iName", "MjGYSRKTNF");
        setField(term66684, term66684.getClass(), "iTypes", term66697);
        setIntElement(term66698, 0, -2068769794);
        setIntElement(term66698, 1, -117576464);
        setIntElement(term66698, 2, -1007160944);
        setIntElement(term66698, 3, 1135664017);
        setIntElement(term66698, 4, 590364439);
        setField(term66684, term66684.getClass(), "iIndices", term66698);
        setField(term66886, term66886.getClass(), "iType", term66684);
        setField(term66886, term66886.getClass(), "iValues", term66887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negated", argTypes, term2617, args);
        assertTrue(recursiveEquals(term2617, term66894));
        assertTrue(recursiveEquals(retValue, term66886));
    }

};


