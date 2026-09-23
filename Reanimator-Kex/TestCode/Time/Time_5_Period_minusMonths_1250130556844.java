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

public class Period_minusMonths_1250130556844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3736024;

    public Period_minusMonths_1250130556844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3736024 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3736078 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3733033 = (Object[]) newArray("org.joda.time.DurationFieldType", 34);
        int[] term3733069 = (int[]) newIntArray(75);
        setField(term3736078, term3736078.getClass(), "iTypes", term3733033);
        setField(term3736024, term3736024.getClass(), "iType", term3736078);
        setField(term3736024, term3736024.getClass(), "iValues", term3733069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term3736024, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


