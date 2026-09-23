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

public class Period_toStandardHours_216684708165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2764;

    public Period_toStandardHours_216684708165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2764 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2765 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2778 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2779 = (int[]) newIntArray(5);
        int[] term2785 = (int[]) newIntArray(6);
        setField(term2765, term2765.getClass(), "iName", "MjGYSRKTNF");
        setField(term2765, term2765.getClass(), "iTypes", term2778);
        setIntElement(term2779, 0, -2068769794);
        setIntElement(term2779, 1, -117576464);
        setIntElement(term2779, 2, -1007160944);
        setIntElement(term2779, 3, 1135664017);
        setIntElement(term2779, 4, 590364439);
        setField(term2765, term2765.getClass(), "iIndices", term2779);
        setField(term2764, term2764.getClass(), "iType", term2765);
        setField(term2764, term2764.getClass(), "iValues", term2785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toStandardHours", argTypes, term2764, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


