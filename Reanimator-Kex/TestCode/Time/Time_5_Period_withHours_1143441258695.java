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

public class Period_withHours_1143441258695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1032886;

    public Period_withHours_1143441258695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1032886 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1032940 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term980246 = (Object[]) newArray("org.joda.time.DurationFieldType", 203);
        int[] term980451 = (int[]) newIntArray(248);
        setField(term1032940, term1032940.getClass(), "iTypes", term980246);
        setField(term1032886, term1032886.getClass(), "iType", term1032940);
        setField(term1032886, term1032886.getClass(), "iValues", term980451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term1032886, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


