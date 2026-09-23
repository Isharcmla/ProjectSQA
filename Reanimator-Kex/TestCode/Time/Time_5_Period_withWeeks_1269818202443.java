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

public class Period_withWeeks_1269818202443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229551;

    public Period_withWeeks_1269818202443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229551 = newInstance(Class.forName("org.joda.time.Period"));
        Object term229605 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term227944 = (Object[]) newArray("org.joda.time.DurationFieldType", 13);
        int[] term227959 = (int[]) newIntArray(245);
        setField(term229605, term229605.getClass(), "iTypes", term227944);
        setField(term229551, term229551.getClass(), "iType", term229605);
        setField(term229551, term229551.getClass(), "iValues", term227959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withWeeks", argTypes, term229551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


