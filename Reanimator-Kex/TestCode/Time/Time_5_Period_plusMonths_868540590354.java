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

public class Period_plusMonths_868540590354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175339;

    public Period_plusMonths_868540590354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175339 = newInstance(Class.forName("org.joda.time.Period"));
        Object term175393 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term175150 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term175153 = (int[]) newIntArray(108);
        setField(term175393, term175393.getClass(), "iTypes", term175150);
        setField(term175339, term175339.getClass(), "iType", term175393);
        setField(term175339, term175339.getClass(), "iValues", term175153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMonths", argTypes, term175339, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


