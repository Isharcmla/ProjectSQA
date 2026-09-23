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
import java.lang.Integer;

public class Period_minusWeeks_1043470448155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2260;
     Object term2288;

    public Period_minusWeeks_1043470448155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2260 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2261 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2274 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2275 = (int[]) newIntArray(5);
        int[] term2281 = (int[]) newIntArray(6);
        setField(term2261, term2261.getClass(), "iName", "MjGYSRKTNF");
        setField(term2261, term2261.getClass(), "iTypes", term2274);
        setIntElement(term2275, 0, -2068769794);
        setIntElement(term2275, 1, -117576464);
        setIntElement(term2275, 2, -1007160944);
        setIntElement(term2275, 3, 1135664017);
        setIntElement(term2275, 4, 590364439);
        setField(term2261, term2261.getClass(), "iIndices", term2275);
        setField(term2260, term2260.getClass(), "iType", term2261);
        setField(term2260, term2260.getClass(), "iValues", term2281);
        term2288 = new Integer(-375014958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2288;
        try {
            callMethod(klass, "minusWeeks", argTypes, term2260, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


