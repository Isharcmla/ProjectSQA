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

public class Period_minusDays_666754328156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2311;
     Object term2339;

    public Period_minusDays_666754328156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2311 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2312 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2325 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2326 = (int[]) newIntArray(5);
        int[] term2332 = (int[]) newIntArray(6);
        setField(term2312, term2312.getClass(), "iName", "MjGYSRKTNF");
        setField(term2312, term2312.getClass(), "iTypes", term2325);
        setIntElement(term2326, 0, -2068769794);
        setIntElement(term2326, 1, -117576464);
        setIntElement(term2326, 2, -1007160944);
        setIntElement(term2326, 3, 1135664017);
        setIntElement(term2326, 4, 590364439);
        setField(term2312, term2312.getClass(), "iIndices", term2326);
        setField(term2311, term2311.getClass(), "iType", term2312);
        setField(term2311, term2311.getClass(), "iValues", term2332);
        term2339 = new Integer(1107176718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2339;
        try {
            callMethod(klass, "minusDays", argTypes, term2311, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


