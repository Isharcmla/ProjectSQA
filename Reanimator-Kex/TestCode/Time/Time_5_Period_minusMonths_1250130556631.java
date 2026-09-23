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

public class Period_minusMonths_1250130556631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term449015;

    public Period_minusMonths_1250130556631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term449015 = newInstance(Class.forName("org.joda.time.Period"));
        Object term449069 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term429265 = (Object[]) newArray("org.joda.time.DurationFieldType", 38);
        int[] term429305 = (int[]) newIntArray(507);
        setField(term449069, term449069.getClass(), "iTypes", term429265);
        setField(term449015, term449015.getClass(), "iType", term449069);
        setField(term449015, term449015.getClass(), "iValues", term429305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term449015, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


