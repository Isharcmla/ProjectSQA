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

public class Period_withMonths_1471682522812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3263139;

    public Period_withMonths_1471682522812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3263139 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3263193 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3262065 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term3262069 = (int[]) newIntArray(492);
        setField(term3263193, term3263193.getClass(), "iTypes", term3262065);
        setField(term3263139, term3263139.getClass(), "iType", term3263193);
        setField(term3263139, term3263139.getClass(), "iValues", term3262069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMonths", argTypes, term3263139, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


