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

public class Period_withHours_1143441258800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3001372;

    public Period_withHours_1143441258800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3001372 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3001426 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2942290 = (Object[]) newArray("org.joda.time.DurationFieldType", 227);
        int[] term2942519 = (int[]) newIntArray(249);
        setField(term3001426, term3001426.getClass(), "iTypes", term2942290);
        setField(term3001372, term3001372.getClass(), "iType", term3001426);
        setField(term3001372, term3001372.getClass(), "iValues", term2942519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term3001372, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


