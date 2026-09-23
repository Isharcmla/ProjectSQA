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

public class Period_minusHours_917093504523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297046;

    public Period_minusHours_917093504523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297046 = newInstance(Class.forName("org.joda.time.Period"));
        Object term297100 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term295971 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        int[] term295981 = (int[]) newIntArray(115);
        setField(term297100, term297100.getClass(), "iTypes", term295971);
        setField(term297046, term297046.getClass(), "iType", term297100);
        setField(term297046, term297046.getClass(), "iValues", term295981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusHours", argTypes, term297046, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


