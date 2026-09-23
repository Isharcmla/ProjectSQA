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

public class Fraction_multiply_1924204567393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158046;
     Object term158136;

    public Fraction_multiply_1924204567393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158046 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term158046, term158046.getClass(), "numerator", -574134346);
        term158136 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term158136, term158136.getClass(), "numerator", 4);
        setIntField(term158136, term158136.getClass(), "denominator", 1615734289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term158136;
        try {
            callMethod(klass, "multiply", argTypes, term158046, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


