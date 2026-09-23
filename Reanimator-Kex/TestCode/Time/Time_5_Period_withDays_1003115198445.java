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

public class Period_withDays_1003115198445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230257;

    public Period_withDays_1003115198445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230257 = newInstance(Class.forName("org.joda.time.Period"));
        Object term230311 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term230079 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term230085 = (int[]) newIntArray(17);
        setField(term230311, term230311.getClass(), "iTypes", term230079);
        setField(term230257, term230257.getClass(), "iType", term230311);
        setField(term230257, term230257.getClass(), "iValues", term230085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withDays", argTypes, term230257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


