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

public class Period_plusHours_431248406280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135516;

    public Period_plusHours_431248406280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135516 = newInstance(Class.forName("org.joda.time.Period"));
        Object term135570 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term135327 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term135330 = (int[]) newIntArray(108);
        setField(term135570, term135570.getClass(), "iTypes", term135327);
        setField(term135516, term135516.getClass(), "iType", term135570);
        setField(term135516, term135516.getClass(), "iValues", term135330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusHours", argTypes, term135516, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


