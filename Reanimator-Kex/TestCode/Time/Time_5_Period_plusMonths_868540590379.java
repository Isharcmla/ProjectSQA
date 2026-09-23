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

public class Period_plusMonths_868540590379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186648;

    public Period_plusMonths_868540590379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186648 = newInstance(Class.forName("org.joda.time.Period"));
        Object term186702 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term185938 = (Object[]) newArray("org.joda.time.DurationFieldType", 493);
        int[] term186433 = (int[]) newIntArray(15);
        setField(term186702, term186702.getClass(), "iTypes", term185938);
        setField(term186648, term186648.getClass(), "iType", term186702);
        setField(term186648, term186648.getClass(), "iValues", term186433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMonths", argTypes, term186648, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


