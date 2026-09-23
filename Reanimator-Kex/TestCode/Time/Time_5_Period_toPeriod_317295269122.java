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

public class Period_toPeriod_317295269122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570;
     Object term51148;

    public Period_toPeriod_317295269122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570 = newInstance(Class.forName("org.joda.time.Period"));
        Object term571 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term584 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term585 = (int[]) newIntArray(5);
        int[] term591 = (int[]) newIntArray(6);
        setField(term571, term571.getClass(), "iName", "MjGYSRKTNF");
        setField(term571, term571.getClass(), "iTypes", term584);
        setIntElement(term585, 0, -2068769794);
        setIntElement(term585, 1, -117576464);
        setIntElement(term585, 2, -1007160944);
        setIntElement(term585, 3, 1135664017);
        setIntElement(term585, 4, 590364439);
        setField(term571, term571.getClass(), "iIndices", term585);
        setField(term570, term570.getClass(), "iType", term571);
        setField(term570, term570.getClass(), "iValues", term591);
        term51148 = newInstance(Class.forName("org.joda.time.Period"));
        Object term51149 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term51152 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term51153 = (int[]) newIntArray(5);
        int[] term51154 = (int[]) newIntArray(6);
        setField(term51149, term51149.getClass(), "iName", "MjGYSRKTNF");
        setField(term51149, term51149.getClass(), "iTypes", term51152);
        setIntElement(term51153, 0, -2068769794);
        setIntElement(term51153, 1, -117576464);
        setIntElement(term51153, 2, -1007160944);
        setIntElement(term51153, 3, 1135664017);
        setIntElement(term51153, 4, 590364439);
        setField(term51149, term51149.getClass(), "iIndices", term51153);
        setField(term51148, term51148.getClass(), "iType", term51149);
        setField(term51148, term51148.getClass(), "iValues", term51154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toPeriod", argTypes, term570, args);
        assertTrue(recursiveEquals(term570, term51148));
    }

};


