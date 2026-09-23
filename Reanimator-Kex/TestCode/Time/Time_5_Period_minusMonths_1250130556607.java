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

public class Period_minusMonths_1250130556607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399609;

    public Period_minusMonths_1250130556607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399609 = newInstance(Class.forName("org.joda.time.Period"));
        Object term399663 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term386692 = (Object[]) newArray("org.joda.time.DurationFieldType", 25);
        int[] term386719 = (int[]) newIntArray(503);
        setField(term399663, term399663.getClass(), "iTypes", term386692);
        setField(term399609, term399609.getClass(), "iType", term399663);
        setField(term399609, term399609.getClass(), "iValues", term386719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term399609, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


