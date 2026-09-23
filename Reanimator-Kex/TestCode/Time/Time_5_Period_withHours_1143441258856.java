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

public class Period_withHours_1143441258856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3874028;

    public Period_withHours_1143441258856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3874028 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3874082 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3811967 = (Object[]) newArray("org.joda.time.DurationFieldType", 124);
        int[] term3812093 = (int[]) newIntArray(489);
        setField(term3874082, term3874082.getClass(), "iTypes", term3811967);
        setField(term3874028, term3874028.getClass(), "iType", term3874082);
        setField(term3874028, term3874028.getClass(), "iValues", term3812093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term3874028, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


