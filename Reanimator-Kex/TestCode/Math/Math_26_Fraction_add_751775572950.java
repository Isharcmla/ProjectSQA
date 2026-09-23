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

public class Fraction_add_751775572950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460046;
     Object term460136;

    public Fraction_add_751775572950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460046 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term460046, term460046.getClass(), "numerator", -2147483648);
        setIntField(term460046, term460046.getClass(), "denominator", -2086665134);
        term460136 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term460136, term460136.getClass(), "numerator", -2147483648);
        setIntField(term460136, term460136.getClass(), "denominator", -2112879967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term460136;
        try {
            callMethod(klass, "add", argTypes, term460046, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


