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

public class Fraction_multiply_1924204567796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384736;
     Object term384826;

    public Fraction_multiply_1924204567796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384736 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term384736, term384736.getClass(), "numerator", -1744831106);
        term384826 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term384826, term384826.getClass(), "numerator", 4);
        setIntField(term384826, term384826.getClass(), "denominator", 1107296389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term384826;
        try {
            callMethod(klass, "multiply", argTypes, term384736, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


