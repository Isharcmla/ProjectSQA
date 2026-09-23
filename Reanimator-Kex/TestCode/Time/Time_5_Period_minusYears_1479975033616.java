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

public class Period_minusYears_1479975033616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414467;

    public Period_minusYears_1479975033616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term414467 = newInstance(Class.forName("org.joda.time.Period"));
        Object term414521 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term412186 = (Object[]) newArray("org.joda.time.DurationFieldType", 9);
        int[] term412197 = (int[]) newIntArray(235);
        setField(term414521, term414521.getClass(), "iTypes", term412186);
        setField(term414467, term414467.getClass(), "iType", term414521);
        setField(term414467, term414467.getClass(), "iValues", term412197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusYears", argTypes, term414467, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


