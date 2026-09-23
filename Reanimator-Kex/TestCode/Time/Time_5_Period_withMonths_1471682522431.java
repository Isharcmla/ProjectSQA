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

public class Period_withMonths_1471682522431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219684;

    public Period_withMonths_1471682522431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219684 = newInstance(Class.forName("org.joda.time.Period"));
        Object term219738 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term219602 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term219605 = (int[]) newIntArray(2);
        setField(term219738, term219738.getClass(), "iTypes", term219602);
        setField(term219684, term219684.getClass(), "iType", term219738);
        setField(term219684, term219684.getClass(), "iValues", term219605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMonths", argTypes, term219684, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


