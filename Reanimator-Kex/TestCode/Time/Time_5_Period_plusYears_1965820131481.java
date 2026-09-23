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

public class Period_plusYears_1965820131481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259001;

    public Period_plusYears_1965820131481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259001 = newInstance(Class.forName("org.joda.time.Period"));
        Object term259055 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term258933 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        setField(term259055, term259055.getClass(), "iTypes", term258933);
        setField(term259001, term259001.getClass(), "iType", term259055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusYears", argTypes, term259001, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


