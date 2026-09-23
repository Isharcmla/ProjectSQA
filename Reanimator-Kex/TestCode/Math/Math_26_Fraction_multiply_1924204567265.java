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

public class Fraction_multiply_1924204567265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106959;
     Object term107049;

    public Fraction_multiply_1924204567265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106959 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term106959, term106959.getClass(), "numerator", -2147385230);
        term107049 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term107049, term107049.getClass(), "numerator", -2147385230);
        setIntField(term107049, term107049.getClass(), "denominator", 1610333963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term107049;
        try {
            callMethod(klass, "multiply", argTypes, term106959, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


