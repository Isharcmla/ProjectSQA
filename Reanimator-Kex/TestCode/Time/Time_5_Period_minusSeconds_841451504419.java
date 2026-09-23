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

public class Period_minusSeconds_841451504419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213859;

    public Period_minusSeconds_841451504419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213859 = newInstance(Class.forName("org.joda.time.Period"));
        Object term213913 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term213669 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term213672 = (int[]) newIntArray(108);
        setField(term213913, term213913.getClass(), "iTypes", term213669);
        setField(term213859, term213859.getClass(), "iType", term213913);
        setField(term213859, term213859.getClass(), "iValues", term213672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusSeconds", argTypes, term213859, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


