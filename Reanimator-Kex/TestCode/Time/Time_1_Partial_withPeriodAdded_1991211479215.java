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

public class Partial_withPeriodAdded_1991211479215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104113;
     Object term104159;

    public Partial_withPeriodAdded_1991211479215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104113 = newInstance(Class.forName("org.joda.time.Partial"));
        int[] term104051 = (int[]) newIntArray(0);
        setField(term104113, term104113.getClass(), "iValues", term104051);
        term104159 = newInstance(Class.forName("org.joda.time.Months"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term104159;
        args[1] = -1;
        try {
            callMethod(klass, "withPeriodAdded", argTypes, term104113, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
