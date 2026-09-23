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

public class Period_plusDays_128237422317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156245;

    public Period_plusDays_128237422317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156245 = newInstance(Class.forName("org.joda.time.Period"));
        Object term156299 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term156056 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term156059 = (int[]) newIntArray(108);
        setField(term156299, term156299.getClass(), "iTypes", term156056);
        setField(term156245, term156245.getClass(), "iType", term156299);
        setField(term156245, term156245.getClass(), "iValues", term156059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusDays", argTypes, term156245, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


