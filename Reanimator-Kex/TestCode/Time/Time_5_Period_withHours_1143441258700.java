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

public class Period_withHours_1143441258700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1103040;

    public Period_withHours_1143441258700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1103040 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1103094 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1092477 = (Object[]) newArray("org.joda.time.DurationFieldType", 21);
        int[] term1092500 = (int[]) newIntArray(489);
        setField(term1103094, term1103094.getClass(), "iTypes", term1092477);
        setField(term1103040, term1103040.getClass(), "iType", term1103094);
        setField(term1103040, term1103040.getClass(), "iValues", term1092500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term1103040, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


