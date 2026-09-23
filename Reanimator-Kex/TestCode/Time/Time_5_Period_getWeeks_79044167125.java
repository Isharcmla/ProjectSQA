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

public class Period_getWeeks_79044167125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717;

    public Period_getWeeks_79044167125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term717 = newInstance(Class.forName("org.joda.time.Period"));
        Object term718 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term731 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term732 = (int[]) newIntArray(5);
        int[] term738 = (int[]) newIntArray(6);
        setField(term718, term718.getClass(), "iName", "MjGYSRKTNF");
        setField(term718, term718.getClass(), "iTypes", term731);
        setIntElement(term732, 0, -2068769794);
        setIntElement(term732, 1, -117576464);
        setIntElement(term732, 2, -1007160944);
        setIntElement(term732, 3, 1135664017);
        setIntElement(term732, 4, 590364439);
        setField(term718, term718.getClass(), "iIndices", term732);
        setField(term717, term717.getClass(), "iType", term718);
        setField(term717, term717.getClass(), "iValues", term738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getWeeks", argTypes, term717, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


