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

public class Fraction_add_75177557283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16810;
     Object term16900;

    public Fraction_add_75177557283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16810 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term16810, term16810.getClass(), "numerator", -2147483648);
        setIntField(term16810, term16810.getClass(), "denominator", -29736958);
        term16900 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term16900, term16900.getClass(), "numerator", -2147483648);
        setIntField(term16900, term16900.getClass(), "denominator", -2015270823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term16900;
        try {
            callMethod(klass, "add", argTypes, term16810, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


