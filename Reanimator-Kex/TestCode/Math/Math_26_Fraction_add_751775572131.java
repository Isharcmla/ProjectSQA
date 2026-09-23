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

public class Fraction_add_751775572131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39652;
     Object term39742;

    public Fraction_add_751775572131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39652 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term39652, term39652.getClass(), "numerator", -2147483648);
        setIntField(term39652, term39652.getClass(), "denominator", -14);
        term39742 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term39742, term39742.getClass(), "numerator", -2147483648);
        setIntField(term39742, term39742.getClass(), "denominator", -2147483647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term39742;
        try {
            callMethod(klass, "add", argTypes, term39652, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


