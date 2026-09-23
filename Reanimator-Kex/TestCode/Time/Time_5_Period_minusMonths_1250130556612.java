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

public class Period_minusMonths_1250130556612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405295;

    public Period_minusMonths_1250130556612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405295 = newInstance(Class.forName("org.joda.time.Period"));
        Object term405349 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term404354 = (Object[]) newArray("org.joda.time.DurationFieldType", 19);
        int[] term404375 = (int[]) newIntArray(35);
        setField(term405349, term405349.getClass(), "iTypes", term404354);
        setField(term405295, term405295.getClass(), "iType", term405349);
        setField(term405295, term405295.getClass(), "iValues", term404375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term405295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


