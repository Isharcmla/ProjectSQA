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

public class Period_plusMonths_868540590212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105195;

    public Period_plusMonths_868540590212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105195 = newInstance(Class.forName("org.joda.time.Period"));
        Object term105249 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term104126 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term104130 = (int[]) newIntArray(489);
        setField(term105249, term105249.getClass(), "iTypes", term104126);
        setField(term105195, term105195.getClass(), "iType", term105249);
        setField(term105195, term105195.getClass(), "iValues", term104130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMonths", argTypes, term105195, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


