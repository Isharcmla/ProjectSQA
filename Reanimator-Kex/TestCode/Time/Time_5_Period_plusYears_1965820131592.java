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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_plusYears_1965820131592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362631;

    public Period_plusYears_1965820131592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362631 = newInstance(Class.forName("org.joda.time.Period"));
        Object term362685 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term355537 = (Object[]) newArray("org.joda.time.DurationFieldType", 14);
        int[] term355553 = (int[]) newIntArray(491);
        setField(term362685, term362685.getClass(), "iTypes", term355537);
        setField(term362631, term362631.getClass(), "iType", term362685);
        setField(term362631, term362631.getClass(), "iValues", term355553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusYears", argTypes, term362631, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


