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

public class Fraction_add_751775572533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244672;
     Object term244762;

    public Fraction_add_751775572533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244672 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term244672, term244672.getClass(), "numerator", -2147483648);
        setIntField(term244672, term244672.getClass(), "denominator", -2129621310);
        term244762 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term244762, term244762.getClass(), "numerator", -2147483648);
        setIntField(term244762, term244762.getClass(), "denominator", -1529563495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term244762;
        try {
            callMethod(klass, "add", argTypes, term244672, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


