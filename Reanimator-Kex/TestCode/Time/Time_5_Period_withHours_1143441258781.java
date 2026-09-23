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

public class Period_withHours_1143441258781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2771251;

    public Period_withHours_1143441258781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2771251 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2771305 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2764329 = (Object[]) newArray("org.joda.time.DurationFieldType", 54);
        int[] term2764385 = (int[]) newIntArray(116);
        setField(term2771305, term2771305.getClass(), "iTypes", term2764329);
        setField(term2771251, term2771251.getClass(), "iType", term2771305);
        setField(term2771251, term2771251.getClass(), "iValues", term2764385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term2771251, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


