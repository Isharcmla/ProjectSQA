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

public class Period_withMillis_377011053658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486434;

    public Period_withMillis_377011053658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486434 = newInstance(Class.forName("org.joda.time.Period"));
        Object term486488 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term485976 = (Object[]) newArray("org.joda.time.DurationFieldType", 11);
        int[] term485989 = (int[]) newIntArray(25);
        setField(term486488, term486488.getClass(), "iTypes", term485976);
        setField(term486434, term486434.getClass(), "iType", term486488);
        setField(term486434, term486434.getClass(), "iValues", term485989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMillis", argTypes, term486434, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


