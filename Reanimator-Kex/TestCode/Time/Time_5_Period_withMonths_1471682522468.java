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

public class Period_withMonths_1471682522468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250263;

    public Period_withMonths_1471682522468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250263 = newInstance(Class.forName("org.joda.time.Period"));
        Object term250317 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term248656 = (Object[]) newArray("org.joda.time.DurationFieldType", 13);
        int[] term248671 = (int[]) newIntArray(245);
        setField(term250317, term250317.getClass(), "iTypes", term248656);
        setField(term250263, term250263.getClass(), "iType", term250317);
        setField(term250263, term250263.getClass(), "iValues", term248671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMonths", argTypes, term250263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


