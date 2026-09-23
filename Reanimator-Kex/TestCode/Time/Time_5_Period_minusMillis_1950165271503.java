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

public class Period_minusMillis_1950165271503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279348;

    public Period_minusMillis_1950165271503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279348 = newInstance(Class.forName("org.joda.time.Period"));
        Object term279402 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term278278 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term278282 = (int[]) newIntArray(489);
        setField(term279402, term279402.getClass(), "iTypes", term278278);
        setField(term279348, term279348.getClass(), "iType", term279402);
        setField(term279348, term279348.getClass(), "iValues", term278282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMillis", argTypes, term279348, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


