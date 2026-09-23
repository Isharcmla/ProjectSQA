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

public class Fraction_reduce_335503525863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244568;
     Object term245076;
     Object term245073;

    public Fraction_reduce_335503525863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244568 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term244568, term244568.getClass(), "numerator", 1886901762);
        setIntField(term244568, term244568.getClass(), "denominator", 1174690697);
        term245076 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term245076, term245076.getClass(), "numerator", 1886901762);
        setIntField(term245076, term245076.getClass(), "denominator", 1174690697);
        setField(term245076, term245076.getClass(), "toString", null);
        setField(term245076, term245076.getClass(), "toProperString", null);
        term245073 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term245073, term245073.getClass(), "numerator", 1886901762);
        setIntField(term245073, term245073.getClass(), "denominator", 1174690697);
        setField(term245073, term245073.getClass(), "toString", null);
        setField(term245073, term245073.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term244568, args);
        assertTrue(recursiveEquals(term244568, term245076));
        assertTrue(recursiveEquals(retValue, term245073));
    }

};


