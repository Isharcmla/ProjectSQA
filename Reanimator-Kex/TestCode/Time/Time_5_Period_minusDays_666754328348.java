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

public class Period_minusDays_666754328348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173419;

    public Period_minusDays_666754328348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173419 = newInstance(Class.forName("org.joda.time.Period"));
        Object term173473 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term173041 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term173048 = (int[]) newIntArray(51);
        setField(term173473, term173473.getClass(), "iTypes", term173041);
        setField(term173419, term173419.getClass(), "iType", term173473);
        setField(term173419, term173419.getClass(), "iValues", term173048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusDays", argTypes, term173419, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


