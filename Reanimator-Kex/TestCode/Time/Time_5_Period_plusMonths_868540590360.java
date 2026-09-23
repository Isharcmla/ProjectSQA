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

public class Period_plusMonths_868540590360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178198;

    public Period_plusMonths_868540590360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178198 = newInstance(Class.forName("org.joda.time.Period"));
        Object term178252 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term177821 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term177828 = (int[]) newIntArray(51);
        setField(term178252, term178252.getClass(), "iTypes", term177821);
        setField(term178198, term178198.getClass(), "iType", term178252);
        setField(term178198, term178198.getClass(), "iValues", term177828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMonths", argTypes, term178198, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


