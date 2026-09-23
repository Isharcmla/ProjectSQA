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

public class Period_withHours_1143441258732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1917165;

    public Period_withHours_1143441258732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1917165 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1917219 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1905838 = (Object[]) newArray("org.joda.time.DurationFieldType", 88);
        int[] term1905928 = (int[]) newIntArray(117);
        setField(term1917219, term1917219.getClass(), "iTypes", term1905838);
        setField(term1917165, term1917165.getClass(), "iType", term1917219);
        setField(term1917165, term1917165.getClass(), "iValues", term1905928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term1917165, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


