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

public class Period_withMinutes_1304361658301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146384;

    public Period_withMinutes_1304361658301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146384 = newInstance(Class.forName("org.joda.time.Period"));
        Object term146438 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term145310 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term145314 = (int[]) newIntArray(492);
        setField(term146438, term146438.getClass(), "iTypes", term145310);
        setField(term146384, term146384.getClass(), "iType", term146438);
        setField(term146384, term146384.getClass(), "iValues", term145314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMinutes", argTypes, term146384, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


