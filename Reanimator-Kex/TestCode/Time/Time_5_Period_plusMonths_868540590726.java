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

public class Period_plusMonths_868540590726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1836567;

    public Period_plusMonths_868540590726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1836567 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1836621 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1835085 = (Object[]) newArray("org.joda.time.DurationFieldType", 12);
        int[] term1835099 = (int[]) newIntArray(107);
        setField(term1836621, term1836621.getClass(), "iTypes", term1835085);
        setField(term1836567, term1836567.getClass(), "iType", term1836621);
        setField(term1836567, term1836567.getClass(), "iValues", term1835099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMonths", argTypes, term1836567, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


