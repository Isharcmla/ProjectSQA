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

public class Period_plusYears_1965820131429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218680;

    public Period_plusYears_1965820131429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218680 = newInstance(Class.forName("org.joda.time.Period"));
        Object term218734 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term217611 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term217615 = (int[]) newIntArray(489);
        setField(term218734, term218734.getClass(), "iTypes", term217611);
        setField(term218680, term218680.getClass(), "iType", term218734);
        setField(term218680, term218680.getClass(), "iValues", term217615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusYears", argTypes, term218680, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


