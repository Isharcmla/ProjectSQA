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

public class Period_plusDays_128237422859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3885385;

    public Period_plusDays_128237422859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3885385 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3885439 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3884311 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        int[] term3884321 = (int[]) newIntArray(115);
        setField(term3885439, term3885439.getClass(), "iTypes", term3884311);
        setField(term3885385, term3885385.getClass(), "iType", term3885439);
        setField(term3885385, term3885385.getClass(), "iValues", term3884321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusDays", argTypes, term3885385, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


