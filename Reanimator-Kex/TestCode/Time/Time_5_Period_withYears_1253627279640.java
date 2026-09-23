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

public class Period_withYears_1253627279640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458889;

    public Period_withYears_1253627279640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458889 = newInstance(Class.forName("org.joda.time.Period"));
        Object term458943 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term457282 = (Object[]) newArray("org.joda.time.DurationFieldType", 13);
        int[] term457297 = (int[]) newIntArray(245);
        setField(term458943, term458943.getClass(), "iTypes", term457282);
        setField(term458889, term458889.getClass(), "iType", term458943);
        setField(term458889, term458889.getClass(), "iValues", term457297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withYears", argTypes, term458889, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


