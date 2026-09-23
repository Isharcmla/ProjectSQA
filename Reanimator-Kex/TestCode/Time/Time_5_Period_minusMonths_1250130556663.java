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

public class Period_minusMonths_1250130556663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488773;

    public Period_minusMonths_1250130556663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488773 = newInstance(Class.forName("org.joda.time.Period"));
        Object term488827 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term488406 = (Object[]) newArray("org.joda.time.DurationFieldType", 10);
        int[] term488418 = (int[]) newIntArray(19);
        setField(term488827, term488827.getClass(), "iTypes", term488406);
        setField(term488773, term488773.getClass(), "iType", term488827);
        setField(term488773, term488773.getClass(), "iValues", term488418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term488773, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


