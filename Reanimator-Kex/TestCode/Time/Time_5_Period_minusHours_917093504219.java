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

public class Period_minusHours_917093504219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111765;

    public Period_minusHours_917093504219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111765 = newInstance(Class.forName("org.joda.time.Period"));
        Object term111819 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term111609 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term111615 = (int[]) newIntArray(11);
        setField(term111819, term111819.getClass(), "iTypes", term111609);
        setField(term111765, term111765.getClass(), "iType", term111819);
        setField(term111765, term111765.getClass(), "iValues", term111615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusHours", argTypes, term111765, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


