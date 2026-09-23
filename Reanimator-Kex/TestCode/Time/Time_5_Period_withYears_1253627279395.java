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

public class Period_withYears_1253627279395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199427;

    public Period_withYears_1253627279395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199427 = newInstance(Class.forName("org.joda.time.Period"));
        Object term199481 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term199249 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term199255 = (int[]) newIntArray(17);
        setField(term199481, term199481.getClass(), "iTypes", term199249);
        setField(term199427, term199427.getClass(), "iType", term199481);
        setField(term199427, term199427.getClass(), "iValues", term199255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withYears", argTypes, term199427, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


