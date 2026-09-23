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

public class Period_plusMinutes_213169050511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285858;

    public Period_plusMinutes_213169050511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285858 = newInstance(Class.forName("org.joda.time.Period"));
        Object term285912 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term284789 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term284793 = (int[]) newIntArray(489);
        setField(term285912, term285912.getClass(), "iTypes", term284789);
        setField(term285858, term285858.getClass(), "iType", term285912);
        setField(term285858, term285858.getClass(), "iValues", term284793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMinutes", argTypes, term285858, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


