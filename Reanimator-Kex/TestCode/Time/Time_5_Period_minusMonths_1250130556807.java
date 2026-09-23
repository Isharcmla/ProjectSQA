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

public class Period_minusMonths_1250130556807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3101804;

    public Period_minusMonths_1250130556807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3101804 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3101858 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3099217 = (Object[]) newArray("org.joda.time.DurationFieldType", 36);
        int[] term3099255 = (int[]) newIntArray(59);
        setField(term3101858, term3101858.getClass(), "iTypes", term3099217);
        setField(term3101804, term3101804.getClass(), "iType", term3101858);
        setField(term3101804, term3101804.getClass(), "iValues", term3099255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term3101804, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


