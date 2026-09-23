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

public class Period_withHours_1143441258222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112646;

    public Period_withHours_1143441258222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112646 = newInstance(Class.forName("org.joda.time.Period"));
        Object term112700 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term112468 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term112474 = (int[]) newIntArray(17);
        setField(term112700, term112700.getClass(), "iTypes", term112468);
        setField(term112646, term112646.getClass(), "iType", term112700);
        setField(term112646, term112646.getClass(), "iValues", term112474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term112646, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


