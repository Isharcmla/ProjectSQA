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

public class Period_plusYears_1965820131144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1701;
     Object term1729;

    public Period_plusYears_1965820131144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1701 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1702 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1715 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1716 = (int[]) newIntArray(5);
        int[] term1722 = (int[]) newIntArray(6);
        setField(term1702, term1702.getClass(), "iName", "MjGYSRKTNF");
        setField(term1702, term1702.getClass(), "iTypes", term1715);
        setIntElement(term1716, 0, -2068769794);
        setIntElement(term1716, 1, -117576464);
        setIntElement(term1716, 2, -1007160944);
        setIntElement(term1716, 3, 1135664017);
        setIntElement(term1716, 4, 590364439);
        setField(term1702, term1702.getClass(), "iIndices", term1716);
        setField(term1701, term1701.getClass(), "iType", term1702);
        setField(term1701, term1701.getClass(), "iValues", term1722);
        term1729 = new Integer(-893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1729;
        try {
            callMethod(klass, "plusYears", argTypes, term1701, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


