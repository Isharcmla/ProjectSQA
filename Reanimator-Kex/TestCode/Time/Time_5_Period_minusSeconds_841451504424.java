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

public class Period_minusSeconds_841451504424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216719;

    public Period_minusSeconds_841451504424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216719 = newInstance(Class.forName("org.joda.time.Period"));
        Object term216773 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term216589 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term216594 = (int[]) newIntArray(9);
        setField(term216773, term216773.getClass(), "iTypes", term216589);
        setField(term216719, term216719.getClass(), "iType", term216773);
        setField(term216719, term216719.getClass(), "iValues", term216594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusSeconds", argTypes, term216719, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


