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

public class Period_minusHours_917093504618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417041;

    public Period_minusHours_917093504618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417041 = newInstance(Class.forName("org.joda.time.Period"));
        Object term417095 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term414760 = (Object[]) newArray("org.joda.time.DurationFieldType", 9);
        int[] term414771 = (int[]) newIntArray(235);
        setField(term417095, term417095.getClass(), "iTypes", term414760);
        setField(term417041, term417041.getClass(), "iType", term417095);
        setField(term417041, term417041.getClass(), "iValues", term414771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusHours", argTypes, term417041, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


