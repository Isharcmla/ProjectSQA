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

public class Period_getDays_1827430197126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term766;

    public Period_getDays_1827430197126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term766 = newInstance(Class.forName("org.joda.time.Period"));
        Object term767 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term780 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term781 = (int[]) newIntArray(5);
        int[] term787 = (int[]) newIntArray(6);
        setField(term767, term767.getClass(), "iName", "MjGYSRKTNF");
        setField(term767, term767.getClass(), "iTypes", term780);
        setIntElement(term781, 0, -2068769794);
        setIntElement(term781, 1, -117576464);
        setIntElement(term781, 2, -1007160944);
        setIntElement(term781, 3, 1135664017);
        setIntElement(term781, 4, 590364439);
        setField(term767, term767.getClass(), "iIndices", term781);
        setField(term766, term766.getClass(), "iType", term767);
        setField(term766, term766.getClass(), "iValues", term787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getDays", argTypes, term766, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


