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

public class Period_plusDays_128237422439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227394;

    public Period_plusDays_128237422439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227394 = newInstance(Class.forName("org.joda.time.Period"));
        Object term227448 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term227017 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term227024 = (int[]) newIntArray(51);
        setField(term227448, term227448.getClass(), "iTypes", term227017);
        setField(term227394, term227394.getClass(), "iType", term227448);
        setField(term227394, term227394.getClass(), "iValues", term227024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusDays", argTypes, term227394, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


