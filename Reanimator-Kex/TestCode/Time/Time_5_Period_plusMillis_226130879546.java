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

public class Period_plusMillis_226130879546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313658;

    public Period_plusMillis_226130879546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313658 = newInstance(Class.forName("org.joda.time.Period"));
        Object term313712 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term313281 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term313288 = (int[]) newIntArray(51);
        setField(term313712, term313712.getClass(), "iTypes", term313281);
        setField(term313658, term313658.getClass(), "iType", term313712);
        setField(term313658, term313658.getClass(), "iValues", term313288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMillis", argTypes, term313658, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


