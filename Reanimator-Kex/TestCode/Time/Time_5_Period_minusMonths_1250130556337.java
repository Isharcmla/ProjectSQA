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

public class Period_minusMonths_1250130556337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164215;

    public Period_minusMonths_1250130556337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164215 = newInstance(Class.forName("org.joda.time.Period"));
        Object term164269 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term163837 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term163844 = (int[]) newIntArray(51);
        setField(term164269, term164269.getClass(), "iTypes", term163837);
        setField(term164215, term164215.getClass(), "iType", term164269);
        setField(term164215, term164215.getClass(), "iValues", term163844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term164215, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


