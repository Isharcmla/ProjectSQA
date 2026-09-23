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

public class Fraction_subtract_7404259912331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1158127;
     Object term1158217;

    public Fraction_subtract_7404259912331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1158127 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1158127, term1158127.getClass(), "numerator", 4096);
        setIntField(term1158127, term1158127.getClass(), "denominator", 1);
        term1158217 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1158217, term1158217.getClass(), "numerator", 268435456);
        setIntField(term1158217, term1158217.getClass(), "denominator", -1600548804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1158217;
        try {
            callMethod(klass, "subtract", argTypes, term1158127, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


