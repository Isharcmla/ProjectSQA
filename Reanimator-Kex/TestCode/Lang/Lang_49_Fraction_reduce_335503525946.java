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

public class Fraction_reduce_335503525946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271496;
     Object term272087;
     Object term272081;

    public Fraction_reduce_335503525946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271496 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term271496, term271496.getClass(), "numerator", -299347570);
        setIntField(term271496, term271496.getClass(), "denominator", 1973730705);
        term272087 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term272087, term272087.getClass(), "numerator", -299347570);
        setIntField(term272087, term272087.getClass(), "denominator", 1973730705);
        setField(term272087, term272087.getClass(), "toString", null);
        setField(term272087, term272087.getClass(), "toProperString", null);
        term272081 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term272081, term272081.getClass(), "numerator", -59869514);
        setIntField(term272081, term272081.getClass(), "denominator", 394746141);
        setField(term272081, term272081.getClass(), "toString", null);
        setField(term272081, term272081.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term271496, args);
        assertTrue(recursiveEquals(term271496, term272087));
        assertTrue(recursiveEquals(retValue, term272081));
    }

};


