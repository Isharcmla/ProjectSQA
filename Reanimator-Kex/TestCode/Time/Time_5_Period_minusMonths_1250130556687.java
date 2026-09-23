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

public class Period_minusMonths_1250130556687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811361;

    public Period_minusMonths_1250130556687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term811361 = newInstance(Class.forName("org.joda.time.Period"));
        Object term811415 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term798243 = (Object[]) newArray("org.joda.time.DurationFieldType", 26);
        int[] term798271 = (int[]) newIntArray(491);
        setField(term811415, term811415.getClass(), "iTypes", term798243);
        setField(term811361, term811361.getClass(), "iType", term811415);
        setField(term811361, term811361.getClass(), "iValues", term798271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term811361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


