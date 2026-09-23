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

public class Period_minus_488730944152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2109;
     Object term62801;
     Object term62773;

    public Period_minus_488730944152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2109 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2110 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2123 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2124 = (int[]) newIntArray(5);
        int[] term2130 = (int[]) newIntArray(6);
        setField(term2110, term2110.getClass(), "iName", "MjGYSRKTNF");
        setField(term2110, term2110.getClass(), "iTypes", term2123);
        setIntElement(term2124, 0, -2068769794);
        setIntElement(term2124, 1, -117576464);
        setIntElement(term2124, 2, -1007160944);
        setIntElement(term2124, 3, 1135664017);
        setIntElement(term2124, 4, 590364439);
        setField(term2110, term2110.getClass(), "iIndices", term2124);
        setField(term2109, term2109.getClass(), "iType", term2110);
        setField(term2109, term2109.getClass(), "iValues", term2130);
        term62801 = newInstance(Class.forName("org.joda.time.Period"));
        Object term62802 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term62805 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term62806 = (int[]) newIntArray(5);
        int[] term62807 = (int[]) newIntArray(6);
        setField(term62802, term62802.getClass(), "iName", "MjGYSRKTNF");
        setField(term62802, term62802.getClass(), "iTypes", term62805);
        setIntElement(term62806, 0, -2068769794);
        setIntElement(term62806, 1, -117576464);
        setIntElement(term62806, 2, -1007160944);
        setIntElement(term62806, 3, 1135664017);
        setIntElement(term62806, 4, 590364439);
        setField(term62802, term62802.getClass(), "iIndices", term62806);
        setField(term62801, term62801.getClass(), "iType", term62802);
        setField(term62801, term62801.getClass(), "iValues", term62807);
        term62773 = newInstance(Class.forName("org.joda.time.Period"));
        Object term62774 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term62787 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term62788 = (int[]) newIntArray(5);
        int[] term62794 = (int[]) newIntArray(6);
        setField(term62774, term62774.getClass(), "iName", "MjGYSRKTNF");
        setField(term62774, term62774.getClass(), "iTypes", term62787);
        setIntElement(term62788, 0, -2068769794);
        setIntElement(term62788, 1, -117576464);
        setIntElement(term62788, 2, -1007160944);
        setIntElement(term62788, 3, 1135664017);
        setIntElement(term62788, 4, 590364439);
        setField(term62774, term62774.getClass(), "iIndices", term62788);
        setField(term62773, term62773.getClass(), "iType", term62774);
        setField(term62773, term62773.getClass(), "iValues", term62794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "minus", argTypes, term2109, args);
        assertTrue(recursiveEquals(term2109, term62801));
        assertTrue(recursiveEquals(retValue, term62773));
    }

};


