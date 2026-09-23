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

public class Period_plusSeconds_2095747590150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2007;
     Object term2035;

    public Period_plusSeconds_2095747590150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2007 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2008 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2021 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2022 = (int[]) newIntArray(5);
        int[] term2028 = (int[]) newIntArray(6);
        setField(term2008, term2008.getClass(), "iName", "MjGYSRKTNF");
        setField(term2008, term2008.getClass(), "iTypes", term2021);
        setIntElement(term2022, 0, -2068769794);
        setIntElement(term2022, 1, -117576464);
        setIntElement(term2022, 2, -1007160944);
        setIntElement(term2022, 3, 1135664017);
        setIntElement(term2022, 4, 590364439);
        setField(term2008, term2008.getClass(), "iIndices", term2022);
        setField(term2007, term2007.getClass(), "iType", term2008);
        setField(term2007, term2007.getClass(), "iValues", term2028);
        term2035 = new Integer(1861318859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2035;
        try {
            callMethod(klass, "plusSeconds", argTypes, term2007, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


