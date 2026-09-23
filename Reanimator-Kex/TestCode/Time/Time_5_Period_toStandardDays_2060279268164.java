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

public class Period_toStandardDays_2060279268164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2715;

    public Period_toStandardDays_2060279268164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2715 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2716 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2729 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2730 = (int[]) newIntArray(5);
        int[] term2736 = (int[]) newIntArray(6);
        setField(term2716, term2716.getClass(), "iName", "MjGYSRKTNF");
        setField(term2716, term2716.getClass(), "iTypes", term2729);
        setIntElement(term2730, 0, -2068769794);
        setIntElement(term2730, 1, -117576464);
        setIntElement(term2730, 2, -1007160944);
        setIntElement(term2730, 3, 1135664017);
        setIntElement(term2730, 4, 590364439);
        setField(term2716, term2716.getClass(), "iIndices", term2730);
        setField(term2715, term2715.getClass(), "iType", term2716);
        setField(term2715, term2715.getClass(), "iValues", term2736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toStandardDays", argTypes, term2715, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


