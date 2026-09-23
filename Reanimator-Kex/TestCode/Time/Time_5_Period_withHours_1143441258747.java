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

public class Period_withHours_1143441258747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2066657;

    public Period_withHours_1143441258747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2066657 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2066711 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2061698 = (Object[]) newArray("org.joda.time.DurationFieldType", 51);
        int[] term2061751 = (int[]) newIntArray(85);
        setField(term2066711, term2066711.getClass(), "iTypes", term2061698);
        setField(term2066657, term2066657.getClass(), "iType", term2066711);
        setField(term2066657, term2066657.getClass(), "iValues", term2061751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term2066657, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


