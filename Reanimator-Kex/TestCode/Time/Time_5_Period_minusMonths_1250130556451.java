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

public class Period_minusMonths_1250130556451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233953;

    public Period_minusMonths_1250130556451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233953 = newInstance(Class.forName("org.joda.time.Period"));
        Object term234007 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term233884 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        setField(term234007, term234007.getClass(), "iTypes", term233884);
        setField(term233953, term233953.getClass(), "iType", term234007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term233953, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


