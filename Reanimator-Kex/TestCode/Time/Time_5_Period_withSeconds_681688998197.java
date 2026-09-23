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

public class Period_withSeconds_681688998197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94426;

    public Period_withSeconds_681688998197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94426 = newInstance(Class.forName("org.joda.time.Period"));
        Object term94480 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term92859 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term92864 = (int[]) newIntArray(489);
        setField(term94480, term94480.getClass(), "iTypes", term92859);
        setField(term94426, term94426.getClass(), "iType", term94480);
        setField(term94426, term94426.getClass(), "iValues", term92864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withSeconds", argTypes, term94426, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


