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

public class Period_plusYears_1965820131659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486954;

    public Period_plusYears_1965820131659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486954 = newInstance(Class.forName("org.joda.time.Period"));
        Object term487008 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term486517 = (Object[]) newArray("org.joda.time.DurationFieldType", 7);
        int[] term486526 = (int[]) newIntArray(42);
        setField(term487008, term487008.getClass(), "iTypes", term486517);
        setField(term486954, term486954.getClass(), "iType", term487008);
        setField(term486954, term486954.getClass(), "iValues", term486526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusYears", argTypes, term486954, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


