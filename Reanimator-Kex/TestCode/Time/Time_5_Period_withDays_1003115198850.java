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

public class Period_withDays_1003115198850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3801471;

    public Period_withDays_1003115198850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3801471 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3801525 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3801389 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term3801392 = (int[]) newIntArray(2);
        setField(term3801525, term3801525.getClass(), "iTypes", term3801389);
        setField(term3801471, term3801471.getClass(), "iType", term3801525);
        setField(term3801471, term3801471.getClass(), "iValues", term3801392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withDays", argTypes, term3801471, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


