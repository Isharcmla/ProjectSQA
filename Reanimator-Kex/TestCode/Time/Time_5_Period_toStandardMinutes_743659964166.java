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

public class Period_toStandardMinutes_743659964166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2813;

    public Period_toStandardMinutes_743659964166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2813 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2814 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2827 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2828 = (int[]) newIntArray(5);
        int[] term2834 = (int[]) newIntArray(6);
        setField(term2814, term2814.getClass(), "iName", "MjGYSRKTNF");
        setField(term2814, term2814.getClass(), "iTypes", term2827);
        setIntElement(term2828, 0, -2068769794);
        setIntElement(term2828, 1, -117576464);
        setIntElement(term2828, 2, -1007160944);
        setIntElement(term2828, 3, 1135664017);
        setIntElement(term2828, 4, 590364439);
        setField(term2814, term2814.getClass(), "iIndices", term2828);
        setField(term2813, term2813.getClass(), "iType", term2814);
        setField(term2813, term2813.getClass(), "iValues", term2834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toStandardMinutes", argTypes, term2813, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


