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

public class Period_withWeeks_1269818202815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3266222;

    public Period_withWeeks_1269818202815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3266222 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3266276 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3265916 = (Object[]) newArray("org.joda.time.DurationFieldType", 9);
        int[] term3265927 = (int[]) newIntArray(16);
        setField(term3266276, term3266276.getClass(), "iTypes", term3265916);
        setField(term3266222, term3266222.getClass(), "iType", term3266276);
        setField(term3266222, term3266222.getClass(), "iValues", term3265927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withWeeks", argTypes, term3266222, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


