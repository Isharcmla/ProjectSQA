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

public class Period_plusMonths_868540590570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332357;

    public Period_plusMonths_868540590570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332357 = newInstance(Class.forName("org.joda.time.Period"));
        Object term332411 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term332049 = (Object[]) newArray("org.joda.time.DurationFieldType", 11);
        int[] term332062 = (int[]) newIntArray(11);
        setField(term332411, term332411.getClass(), "iTypes", term332049);
        setField(term332357, term332357.getClass(), "iType", term332411);
        setField(term332357, term332357.getClass(), "iValues", term332062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMonths", argTypes, term332357, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


