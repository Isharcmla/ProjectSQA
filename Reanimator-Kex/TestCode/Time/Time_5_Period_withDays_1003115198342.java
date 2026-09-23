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

public class Period_withDays_1003115198342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166561;

    public Period_withDays_1003115198342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166561 = newInstance(Class.forName("org.joda.time.Period"));
        Object term166615 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term165487 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term165491 = (int[]) newIntArray(492);
        setField(term166615, term166615.getClass(), "iTypes", term165487);
        setField(term166561, term166561.getClass(), "iType", term166615);
        setField(term166561, term166561.getClass(), "iValues", term165491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withDays", argTypes, term166561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


