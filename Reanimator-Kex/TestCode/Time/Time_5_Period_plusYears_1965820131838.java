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

public class Period_plusYears_1965820131838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3706744;

    public Period_plusYears_1965820131838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3706744 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3706798 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3705560 = (Object[]) newArray("org.joda.time.DurationFieldType", 13);
        int[] term3705575 = (int[]) newIntArray(75);
        setField(term3706798, term3706798.getClass(), "iTypes", term3705560);
        setField(term3706744, term3706744.getClass(), "iType", term3706798);
        setField(term3706744, term3706744.getClass(), "iValues", term3705575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusYears", argTypes, term3706744, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


