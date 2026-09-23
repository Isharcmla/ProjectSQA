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

public class Period_withYears_1253627279435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223715;

    public Period_withYears_1253627279435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223715 = newInstance(Class.forName("org.joda.time.Period"));
        Object term223769 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term222148 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term222153 = (int[]) newIntArray(489);
        setField(term223769, term223769.getClass(), "iTypes", term222148);
        setField(term223715, term223715.getClass(), "iType", term223769);
        setField(term223715, term223715.getClass(), "iValues", term222153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withYears", argTypes, term223715, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


