package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_3355035252818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term841909;
     Object term842923;
     Object term842920;

    public Fraction_reduce_3355035252818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term841909 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term841909, term841909.getClass(), "numerator", 1451976546);
        setIntField(term841909, term841909.getClass(), "denominator", 112863577);
        term842923 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term842923, term842923.getClass(), "numerator", 1451976546);
        setIntField(term842923, term842923.getClass(), "denominator", 112863577);
        setField(term842923, term842923.getClass(), "toString", null);
        setField(term842923, term842923.getClass(), "toProperString", null);
        term842920 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term842920, term842920.getClass(), "numerator", 1451976546);
        setIntField(term842920, term842920.getClass(), "denominator", 112863577);
        setField(term842920, term842920.getClass(), "toString", null);
        setField(term842920, term842920.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term841909, args);
        assertTrue(recursiveEquals(term841909, term842923));
        assertTrue(recursiveEquals(retValue, term842920));
    }

};


