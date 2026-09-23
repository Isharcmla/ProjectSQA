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

public class Period_minusYears_1479975033423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216520;

    public Period_minusYears_1479975033423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216520 = newInstance(Class.forName("org.joda.time.Period"));
        Object term216574 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term216364 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term216370 = (int[]) newIntArray(11);
        setField(term216574, term216574.getClass(), "iTypes", term216364);
        setField(term216520, term216520.getClass(), "iType", term216574);
        setField(term216520, term216520.getClass(), "iValues", term216370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusYears", argTypes, term216520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


