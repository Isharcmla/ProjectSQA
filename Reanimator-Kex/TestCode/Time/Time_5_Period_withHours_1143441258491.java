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

public class Period_withHours_1143441258491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267947;

    public Period_withHours_1143441258491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267947 = newInstance(Class.forName("org.joda.time.Period"));
        Object term268001 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term267489 = (Object[]) newArray("org.joda.time.DurationFieldType", 11);
        int[] term267502 = (int[]) newIntArray(25);
        setField(term268001, term268001.getClass(), "iTypes", term267489);
        setField(term267947, term267947.getClass(), "iType", term268001);
        setField(term267947, term267947.getClass(), "iValues", term267502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term267947, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


