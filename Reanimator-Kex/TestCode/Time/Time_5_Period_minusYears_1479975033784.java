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

public class Period_minusYears_1479975033784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2781444;

    public Period_minusYears_1479975033784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2781444 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2781498 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2774349 = (Object[]) newArray("org.joda.time.DurationFieldType", 14);
        int[] term2774365 = (int[]) newIntArray(491);
        setField(term2781498, term2781498.getClass(), "iTypes", term2774349);
        setField(term2781444, term2781444.getClass(), "iType", term2781498);
        setField(term2781444, term2781444.getClass(), "iValues", term2774365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusYears", argTypes, term2781444, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


