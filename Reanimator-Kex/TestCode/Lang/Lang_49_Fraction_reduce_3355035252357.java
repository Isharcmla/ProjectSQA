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

public class Fraction_reduce_3355035252357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697499;
     Object term698284;
     Object term698281;

    public Fraction_reduce_3355035252357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term697499 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term697499, term697499.getClass(), "numerator", -939523198);
        setIntField(term697499, term697499.getClass(), "denominator", 1342177735);
        term698284 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term698284, term698284.getClass(), "numerator", -939523198);
        setIntField(term698284, term698284.getClass(), "denominator", 1342177735);
        setField(term698284, term698284.getClass(), "toString", null);
        setField(term698284, term698284.getClass(), "toProperString", null);
        term698281 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term698281, term698281.getClass(), "numerator", -939523198);
        setIntField(term698281, term698281.getClass(), "denominator", 1342177735);
        setField(term698281, term698281.getClass(), "toString", null);
        setField(term698281, term698281.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term697499, args);
        assertTrue(recursiveEquals(term697499, term698284));
        assertTrue(recursiveEquals(retValue, term698281));
    }

};


