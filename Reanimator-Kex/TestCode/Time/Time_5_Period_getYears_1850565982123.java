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

public class Period_getYears_1850565982123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619;

    public Period_getYears_1850565982123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term619 = newInstance(Class.forName("org.joda.time.Period"));
        Object term620 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term633 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term634 = (int[]) newIntArray(5);
        int[] term640 = (int[]) newIntArray(6);
        setField(term620, term620.getClass(), "iName", "MjGYSRKTNF");
        setField(term620, term620.getClass(), "iTypes", term633);
        setIntElement(term634, 0, -2068769794);
        setIntElement(term634, 1, -117576464);
        setIntElement(term634, 2, -1007160944);
        setIntElement(term634, 3, 1135664017);
        setIntElement(term634, 4, 590364439);
        setField(term620, term620.getClass(), "iIndices", term634);
        setField(term619, term619.getClass(), "iType", term620);
        setField(term619, term619.getClass(), "iValues", term640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getYears", argTypes, term619, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


