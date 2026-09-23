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

public class Period_minusYears_1479975033243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118202;

    public Period_minusYears_1479975033243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118202 = newInstance(Class.forName("org.joda.time.Period"));
        Object term118256 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term118012 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term118015 = (int[]) newIntArray(108);
        setField(term118256, term118256.getClass(), "iTypes", term118012);
        setField(term118202, term118202.getClass(), "iType", term118256);
        setField(term118202, term118202.getClass(), "iValues", term118015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusYears", argTypes, term118202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


