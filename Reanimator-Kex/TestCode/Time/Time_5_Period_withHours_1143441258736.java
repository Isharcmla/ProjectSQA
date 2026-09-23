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

public class Period_withHours_1143441258736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1972567;

    public Period_withHours_1143441258736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1972567 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1972621 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1970344 = (Object[]) newArray("org.joda.time.DurationFieldType", 36);
        int[] term1970382 = (int[]) newIntArray(49);
        setField(term1972621, term1972621.getClass(), "iTypes", term1970344);
        setField(term1972567, term1972567.getClass(), "iType", term1972621);
        setField(term1972567, term1972567.getClass(), "iValues", term1970382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term1972567, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


