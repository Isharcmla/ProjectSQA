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

public class Period_withHours_1143441258801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3047971;

    public Period_withHours_1143441258801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3047971 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3048025 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3001679 = (Object[]) newArray("org.joda.time.DurationFieldType", 91);
        int[] term3001772 = (int[]) newIntArray(497);
        setField(term3048025, term3048025.getClass(), "iTypes", term3001679);
        setField(term3047971, term3047971.getClass(), "iType", term3048025);
        setField(term3047971, term3047971.getClass(), "iValues", term3001772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term3047971, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


