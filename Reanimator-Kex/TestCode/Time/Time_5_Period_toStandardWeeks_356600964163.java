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

public class Period_toStandardWeeks_356600964163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2666;

    public Period_toStandardWeeks_356600964163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2666 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2667 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2680 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2681 = (int[]) newIntArray(5);
        int[] term2687 = (int[]) newIntArray(6);
        setField(term2667, term2667.getClass(), "iName", "MjGYSRKTNF");
        setField(term2667, term2667.getClass(), "iTypes", term2680);
        setIntElement(term2681, 0, -2068769794);
        setIntElement(term2681, 1, -117576464);
        setIntElement(term2681, 2, -1007160944);
        setIntElement(term2681, 3, 1135664017);
        setIntElement(term2681, 4, 590364439);
        setField(term2667, term2667.getClass(), "iIndices", term2681);
        setField(term2666, term2666.getClass(), "iType", term2667);
        setField(term2666, term2666.getClass(), "iValues", term2687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toStandardWeeks", argTypes, term2666, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


