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

public class Period_minusMonths_1250130556793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2936253;

    public Period_minusMonths_1250130556793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2936253 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2936307 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2932107 = (Object[]) newArray("org.joda.time.DurationFieldType", 40);
        int[] term2932149 = (int[]) newIntArray(91);
        setField(term2936307, term2936307.getClass(), "iTypes", term2932107);
        setField(term2936253, term2936253.getClass(), "iType", term2936307);
        setField(term2936253, term2936253.getClass(), "iValues", term2932149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term2936253, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


