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

public class Period_plusMonths_868540590514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289069;

    public Period_plusMonths_868540590514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289069 = newInstance(Class.forName("org.joda.time.Period"));
        Object term289123 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term288940 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term288945 = (int[]) newIntArray(9);
        setField(term289123, term289123.getClass(), "iTypes", term288940);
        setField(term289069, term289069.getClass(), "iType", term289123);
        setField(term289069, term289069.getClass(), "iValues", term288945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMonths", argTypes, term289069, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


