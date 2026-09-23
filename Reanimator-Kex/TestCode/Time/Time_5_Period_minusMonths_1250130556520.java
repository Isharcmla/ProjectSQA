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

public class Period_minusMonths_1250130556520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294789;

    public Period_minusMonths_1250130556520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294789 = newInstance(Class.forName("org.joda.time.Period"));
        Object term294843 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term293306 = (Object[]) newArray("org.joda.time.DurationFieldType", 12);
        int[] term293320 = (int[]) newIntArray(107);
        setField(term294843, term294843.getClass(), "iTypes", term293306);
        setField(term294789, term294789.getClass(), "iType", term294843);
        setField(term294789, term294789.getClass(), "iValues", term293320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term294789, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


