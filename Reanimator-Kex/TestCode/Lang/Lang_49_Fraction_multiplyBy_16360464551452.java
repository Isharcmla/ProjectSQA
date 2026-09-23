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
import java.lang.ArithmeticException;
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_16360464551452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424484;
     Object term424564;

    public Fraction_multiplyBy_16360464551452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424484 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term424484, term424484.getClass(), "numerator", 1912931666);
        setIntField(term424484, term424484.getClass(), "denominator", 536870912);
        term424564 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term424564, term424564.getClass(), "numerator", 536870913);
        setIntField(term424564, term424564.getClass(), "denominator", 1010901341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term424564;
        try {
            callMethod(klass, "multiplyBy", argTypes, term424484, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


