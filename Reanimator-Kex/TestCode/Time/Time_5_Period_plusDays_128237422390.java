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

public class Period_plusDays_128237422390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190390;

    public Period_plusDays_128237422390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190390 = newInstance(Class.forName("org.joda.time.Period"));
        Object term190444 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term189321 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term189325 = (int[]) newIntArray(489);
        setField(term190444, term190444.getClass(), "iTypes", term189321);
        setField(term190390, term190390.getClass(), "iType", term190444);
        setField(term190390, term190390.getClass(), "iValues", term189325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusDays", argTypes, term190390, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


