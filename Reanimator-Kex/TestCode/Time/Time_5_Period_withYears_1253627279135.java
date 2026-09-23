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

public class Period_withYears_1253627279135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1244;
     Object term1272;

    public Period_withYears_1253627279135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1244 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1245 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1258 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1259 = (int[]) newIntArray(5);
        int[] term1265 = (int[]) newIntArray(6);
        setField(term1245, term1245.getClass(), "iName", "MjGYSRKTNF");
        setField(term1245, term1245.getClass(), "iTypes", term1258);
        setIntElement(term1259, 0, -2068769794);
        setIntElement(term1259, 1, -117576464);
        setIntElement(term1259, 2, -1007160944);
        setIntElement(term1259, 3, 1135664017);
        setIntElement(term1259, 4, 590364439);
        setField(term1245, term1245.getClass(), "iIndices", term1259);
        setField(term1244, term1244.getClass(), "iType", term1245);
        setField(term1244, term1244.getClass(), "iValues", term1265);
        term1272 = new Integer(-615654495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1272;
        try {
            callMethod(klass, "withYears", argTypes, term1244, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


