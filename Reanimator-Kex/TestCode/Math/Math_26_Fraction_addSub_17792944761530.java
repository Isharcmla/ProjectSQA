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

public class Fraction_addSub_17792944761530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term766092;
     Object term766182;

    public Fraction_addSub_17792944761530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term766092 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term766092, term766092.getClass(), "numerator", 128);
        setIntField(term766092, term766092.getClass(), "denominator", -2049966591);
        term766182 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term766182, term766182.getClass(), "numerator", 128);
        setIntField(term766182, term766182.getClass(), "denominator", -2049965887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term766182;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term766092, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


