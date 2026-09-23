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

public class Fraction_reduce_3355035251010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290385;
     Object term290933;
     Object term290927;

    public Fraction_reduce_3355035251010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290385 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term290385, term290385.getClass(), "numerator", 1765947018);
        setIntField(term290385, term290385.getClass(), "denominator", 1087891453);
        term290933 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term290933, term290933.getClass(), "numerator", 1765947018);
        setIntField(term290933, term290933.getClass(), "denominator", 1087891453);
        setField(term290933, term290933.getClass(), "toString", null);
        setField(term290933, term290933.getClass(), "toProperString", null);
        term290927 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term290927, term290927.getClass(), "numerator", 160540638);
        setIntField(term290927, term290927.getClass(), "denominator", 98899223);
        setField(term290927, term290927.getClass(), "toString", null);
        setField(term290927, term290927.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term290385, args);
        assertTrue(recursiveEquals(term290385, term290933));
        assertTrue(recursiveEquals(retValue, term290927));
    }

};


