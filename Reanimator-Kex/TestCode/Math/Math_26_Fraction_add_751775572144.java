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

public class Fraction_add_751775572144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47036;
     Object term47126;

    public Fraction_add_751775572144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47036 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term47036, term47036.getClass(), "numerator", -2147483648);
        setIntField(term47036, term47036.getClass(), "denominator", -536575486);
        term47126 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term47126, term47126.getClass(), "numerator", -2147483648);
        setIntField(term47126, term47126.getClass(), "denominator", -1879171383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term47126;
        try {
            callMethod(klass, "add", argTypes, term47036, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


