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

public class Period_minusHours_917093504488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266767;

    public Period_minusHours_917093504488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266767 = newInstance(Class.forName("org.joda.time.Period"));
        Object term266821 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term266400 = (Object[]) newArray("org.joda.time.DurationFieldType", 10);
        int[] term266412 = (int[]) newIntArray(19);
        setField(term266821, term266821.getClass(), "iTypes", term266400);
        setField(term266767, term266767.getClass(), "iType", term266821);
        setField(term266767, term266767.getClass(), "iValues", term266412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusHours", argTypes, term266767, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


