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

public class Period_minusMillis_1950165271318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156541;

    public Period_minusMillis_1950165271318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156541 = newInstance(Class.forName("org.joda.time.Period"));
        Object term156595 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term156411 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term156416 = (int[]) newIntArray(9);
        setField(term156595, term156595.getClass(), "iTypes", term156411);
        setField(term156541, term156541.getClass(), "iType", term156595);
        setField(term156541, term156541.getClass(), "iValues", term156416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMillis", argTypes, term156541, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


