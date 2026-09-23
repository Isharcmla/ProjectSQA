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

public class Fraction_reduce_335503525713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197784;
     Object term197890;
     Object term197887;

    public Fraction_reduce_335503525713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197784 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term197784, term197784.getClass(), "numerator", 1606410110);
        setIntField(term197784, term197784.getClass(), "denominator", 2143158119);
        term197890 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term197890, term197890.getClass(), "numerator", 1606410110);
        setIntField(term197890, term197890.getClass(), "denominator", 2143158119);
        setField(term197890, term197890.getClass(), "toString", null);
        setField(term197890, term197890.getClass(), "toProperString", null);
        term197887 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term197887, term197887.getClass(), "numerator", 1606410110);
        setIntField(term197887, term197887.getClass(), "denominator", 2143158119);
        setField(term197887, term197887.getClass(), "toString", null);
        setField(term197887, term197887.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term197784, args);
        assertTrue(recursiveEquals(term197784, term197890));
        assertTrue(recursiveEquals(retValue, term197887));
    }

};


