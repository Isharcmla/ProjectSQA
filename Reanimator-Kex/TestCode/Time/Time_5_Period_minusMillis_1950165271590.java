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

public class Period_minusMillis_1950165271590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354833;

    public Period_minusMillis_1950165271590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354833 = newInstance(Class.forName("org.joda.time.Period"));
        Object term354887 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term354643 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term354646 = (int[]) newIntArray(108);
        setField(term354887, term354887.getClass(), "iTypes", term354643);
        setField(term354833, term354833.getClass(), "iType", term354887);
        setField(term354833, term354833.getClass(), "iValues", term354646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMillis", argTypes, term354833, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


