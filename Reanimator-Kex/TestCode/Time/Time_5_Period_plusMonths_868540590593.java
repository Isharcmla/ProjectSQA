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

public class Period_plusMonths_868540590593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363617;

    public Period_plusMonths_868540590593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363617 = newInstance(Class.forName("org.joda.time.Period"));
        Object term363671 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term363180 = (Object[]) newArray("org.joda.time.DurationFieldType", 7);
        int[] term363189 = (int[]) newIntArray(42);
        setField(term363671, term363671.getClass(), "iTypes", term363180);
        setField(term363617, term363617.getClass(), "iType", term363671);
        setField(term363617, term363617.getClass(), "iValues", term363189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMonths", argTypes, term363617, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


