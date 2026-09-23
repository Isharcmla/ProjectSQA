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

public class Period_withHours_1143441258848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3797660;

    public Period_withHours_1143441258848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3797660 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3797714 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3736157 = (Object[]) newArray("org.joda.time.DurationFieldType", 240);
        int[] term3736399 = (int[]) newIntArray(245);
        setField(term3797714, term3797714.getClass(), "iTypes", term3736157);
        setField(term3797660, term3797660.getClass(), "iType", term3797714);
        setField(term3797660, term3797660.getClass(), "iValues", term3736399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term3797660, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


