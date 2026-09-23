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

public class Fraction_add_7517755722094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1042720;
     Object term1042810;

    public Fraction_add_7517755722094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1042720 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1042720, term1042720.getClass(), "numerator", 134217728);
        setIntField(term1042720, term1042720.getClass(), "denominator", -1711275862);
        term1042810 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1042810, term1042810.getClass(), "numerator", 536870912);
        setIntField(term1042810, term1042810.getClass(), "denominator", -1200169087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1042810;
        try {
            callMethod(klass, "add", argTypes, term1042720, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


