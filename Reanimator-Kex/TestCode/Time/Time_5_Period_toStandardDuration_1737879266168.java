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

public class Period_toStandardDuration_1737879266168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2911;

    public Period_toStandardDuration_1737879266168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2911 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2912 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2925 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2926 = (int[]) newIntArray(5);
        int[] term2932 = (int[]) newIntArray(6);
        setField(term2912, term2912.getClass(), "iName", "MjGYSRKTNF");
        setField(term2912, term2912.getClass(), "iTypes", term2925);
        setIntElement(term2926, 0, -2068769794);
        setIntElement(term2926, 1, -117576464);
        setIntElement(term2926, 2, -1007160944);
        setIntElement(term2926, 3, 1135664017);
        setIntElement(term2926, 4, 590364439);
        setField(term2912, term2912.getClass(), "iIndices", term2926);
        setField(term2911, term2911.getClass(), "iType", term2912);
        setField(term2911, term2911.getClass(), "iValues", term2932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toStandardDuration", argTypes, term2911, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


