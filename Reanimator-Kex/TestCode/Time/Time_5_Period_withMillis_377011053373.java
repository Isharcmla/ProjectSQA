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

public class Period_withMillis_377011053373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183765;

    public Period_withMillis_377011053373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183765 = newInstance(Class.forName("org.joda.time.Period"));
        Object term183819 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term182158 = (Object[]) newArray("org.joda.time.DurationFieldType", 13);
        int[] term182173 = (int[]) newIntArray(245);
        setField(term183819, term183819.getClass(), "iTypes", term182158);
        setField(term183765, term183765.getClass(), "iType", term183819);
        setField(term183765, term183765.getClass(), "iValues", term182173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMillis", argTypes, term183765, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


