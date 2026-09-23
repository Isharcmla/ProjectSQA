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

public class Period_minusMonths_1250130556625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428183;

    public Period_minusMonths_1250130556625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term428183 = newInstance(Class.forName("org.joda.time.Period"));
        Object term428237 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term426244 = (Object[]) newArray("org.joda.time.DurationFieldType", 24);
        int[] term426270 = (int[]) newIntArray(67);
        setField(term428237, term428237.getClass(), "iTypes", term426244);
        setField(term428183, term428183.getClass(), "iType", term428237);
        setField(term428183, term428183.getClass(), "iValues", term426270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term428183, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


