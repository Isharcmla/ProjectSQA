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

public class Fraction_add_751775572137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39769;
     Object term39859;

    public Fraction_add_751775572137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39769 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term39769, term39769.getClass(), "numerator", 536870912);
        setIntField(term39769, term39769.getClass(), "denominator", -938446718);
        term39859 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term39859, term39859.getClass(), "numerator", -2147483648);
        setIntField(term39859, term39859.getClass(), "denominator", -1202023447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term39859;
        try {
            callMethod(klass, "add", argTypes, term39769, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


