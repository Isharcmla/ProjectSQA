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

public class Period_plusMonths_868540590145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1752;
     Object term1780;

    public Period_plusMonths_868540590145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1752 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1753 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1766 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1767 = (int[]) newIntArray(5);
        int[] term1773 = (int[]) newIntArray(6);
        setField(term1753, term1753.getClass(), "iName", "MjGYSRKTNF");
        setField(term1753, term1753.getClass(), "iTypes", term1766);
        setIntElement(term1767, 0, -2068769794);
        setIntElement(term1767, 1, -117576464);
        setIntElement(term1767, 2, -1007160944);
        setIntElement(term1767, 3, 1135664017);
        setIntElement(term1767, 4, 590364439);
        setField(term1753, term1753.getClass(), "iIndices", term1767);
        setField(term1752, term1752.getClass(), "iType", term1753);
        setField(term1752, term1752.getClass(), "iValues", term1773);
        term1780 = new Integer(-1963434938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1780;
        try {
            callMethod(klass, "plusMonths", argTypes, term1752, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


