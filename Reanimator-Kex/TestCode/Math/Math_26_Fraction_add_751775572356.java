package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_751775572356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154715;
     Object term154805;

    public Fraction_add_751775572356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154715 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term154715, term154715.getClass(), "numerator", 33554432);
        setIntField(term154715, term154715.getClass(), "denominator", -2069487278);
        term154805 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term154805, term154805.getClass(), "numerator", 32);
        setIntField(term154805, term154805.getClass(), "denominator", -1244911391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term154805;
        try {
            callMethod(klass, "add", argTypes, term154715, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


