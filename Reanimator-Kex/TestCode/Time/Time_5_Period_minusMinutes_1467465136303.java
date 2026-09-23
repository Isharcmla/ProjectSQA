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

public class Period_minusMinutes_1467465136303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150594;

    public Period_minusMinutes_1467465136303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150594 = newInstance(Class.forName("org.joda.time.Period"));
        Object term150648 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term150438 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term150444 = (int[]) newIntArray(11);
        setField(term150648, term150648.getClass(), "iTypes", term150438);
        setField(term150594, term150594.getClass(), "iType", term150648);
        setField(term150594, term150594.getClass(), "iValues", term150444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMinutes", argTypes, term150594, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


