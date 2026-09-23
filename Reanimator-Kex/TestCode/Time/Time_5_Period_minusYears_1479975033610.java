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

public class Period_minusYears_1479975033610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404189;

    public Period_minusYears_1479975033610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term404189 = newInstance(Class.forName("org.joda.time.Period"));
        Object term404243 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term402706 = (Object[]) newArray("org.joda.time.DurationFieldType", 12);
        int[] term402720 = (int[]) newIntArray(107);
        setField(term404243, term404243.getClass(), "iTypes", term402706);
        setField(term404189, term404189.getClass(), "iType", term404243);
        setField(term404189, term404189.getClass(), "iValues", term402720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusYears", argTypes, term404189, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


