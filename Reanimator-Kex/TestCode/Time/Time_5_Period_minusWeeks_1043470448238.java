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

public class Period_minusWeeks_1043470448238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117062;

    public Period_minusWeeks_1043470448238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117062 = newInstance(Class.forName("org.joda.time.Period"));
        Object term117116 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term116906 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term116912 = (int[]) newIntArray(11);
        setField(term117116, term117116.getClass(), "iTypes", term116906);
        setField(term117062, term117062.getClass(), "iType", term117116);
        setField(term117062, term117062.getClass(), "iValues", term116912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusWeeks", argTypes, term117062, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


