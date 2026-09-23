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

public class Period_plusHours_431248406399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201790;

    public Period_plusHours_431248406399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201790 = newInstance(Class.forName("org.joda.time.Period"));
        Object term201844 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term201635 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term201641 = (int[]) newIntArray(11);
        setField(term201844, term201844.getClass(), "iTypes", term201635);
        setField(term201790, term201790.getClass(), "iType", term201844);
        setField(term201790, term201790.getClass(), "iValues", term201641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusHours", argTypes, term201790, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


