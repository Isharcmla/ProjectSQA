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

public class Period_minusHours_917093504647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477049;

    public Period_minusHours_917093504647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term477049 = newInstance(Class.forName("org.joda.time.Period"));
        Object term477103 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term475566 = (Object[]) newArray("org.joda.time.DurationFieldType", 12);
        int[] term475580 = (int[]) newIntArray(107);
        setField(term477103, term477103.getClass(), "iTypes", term475566);
        setField(term477049, term477049.getClass(), "iType", term477103);
        setField(term477049, term477049.getClass(), "iValues", term475580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusHours", argTypes, term477049, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


