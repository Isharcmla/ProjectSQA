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

public class Period_withMillis_377011053142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1601;
     Object term1629;

    public Period_withMillis_377011053142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1601 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1602 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1615 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1616 = (int[]) newIntArray(5);
        int[] term1622 = (int[]) newIntArray(6);
        setField(term1602, term1602.getClass(), "iName", "MjGYSRKTNF");
        setField(term1602, term1602.getClass(), "iTypes", term1615);
        setIntElement(term1616, 0, -2068769794);
        setIntElement(term1616, 1, -117576464);
        setIntElement(term1616, 2, -1007160944);
        setIntElement(term1616, 3, 1135664017);
        setIntElement(term1616, 4, 590364439);
        setField(term1602, term1602.getClass(), "iIndices", term1616);
        setField(term1601, term1601.getClass(), "iType", term1602);
        setField(term1601, term1601.getClass(), "iValues", term1622);
        term1629 = new Integer(691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1629;
        try {
            callMethod(klass, "withMillis", argTypes, term1601, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


