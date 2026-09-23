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

public class Fraction_add_7517755721411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term707260;
     Object term707350;

    public Fraction_add_7517755721411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term707260 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term707260, term707260.getClass(), "numerator", 33554432);
        setIntField(term707260, term707260.getClass(), "denominator", -69191694);
        term707350 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term707350, term707350.getClass(), "numerator", 2097152);
        setIntField(term707350, term707350.getClass(), "denominator", -1969480703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term707350;
        try {
            callMethod(klass, "add", argTypes, term707260, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


