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

public class Period_plusWeeks_557625350146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1803;
     Object term1831;

    public Period_plusWeeks_557625350146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1803 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1804 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1817 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1818 = (int[]) newIntArray(5);
        int[] term1824 = (int[]) newIntArray(6);
        setField(term1804, term1804.getClass(), "iName", "MjGYSRKTNF");
        setField(term1804, term1804.getClass(), "iTypes", term1817);
        setIntElement(term1818, 0, -2068769794);
        setIntElement(term1818, 1, -117576464);
        setIntElement(term1818, 2, -1007160944);
        setIntElement(term1818, 3, 1135664017);
        setIntElement(term1818, 4, 590364439);
        setField(term1804, term1804.getClass(), "iIndices", term1818);
        setField(term1803, term1803.getClass(), "iType", term1804);
        setField(term1803, term1803.getClass(), "iValues", term1824);
        term1831 = new Integer(906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1831;
        try {
            callMethod(klass, "plusWeeks", argTypes, term1803, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


