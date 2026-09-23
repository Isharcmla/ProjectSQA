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

public class Period_minusWeeks_1043470448378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185829;

    public Period_minusWeeks_1043470448378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185829 = newInstance(Class.forName("org.joda.time.Period"));
        Object term185883 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term185451 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term185458 = (int[]) newIntArray(51);
        setField(term185883, term185883.getClass(), "iTypes", term185451);
        setField(term185829, term185829.getClass(), "iType", term185883);
        setField(term185829, term185829.getClass(), "iValues", term185458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusWeeks", argTypes, term185829, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


