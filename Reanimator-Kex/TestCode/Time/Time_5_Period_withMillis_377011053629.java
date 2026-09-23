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

public class Period_withMillis_377011053629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429187;

    public Period_withMillis_377011053629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429187 = newInstance(Class.forName("org.joda.time.Period"));
        Object term429241 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term428875 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        int[] term428885 = (int[]) newIntArray(20);
        setField(term429241, term429241.getClass(), "iTypes", term428875);
        setField(term429187, term429187.getClass(), "iType", term429241);
        setField(term429187, term429187.getClass(), "iValues", term428885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMillis", argTypes, term429187, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


