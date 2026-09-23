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

public class Fraction_add_7517755721276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522976;
     Object term523066;

    public Fraction_add_7517755721276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term522976 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term522976, term522976.getClass(), "numerator", 2);
        setIntField(term522976, term522976.getClass(), "denominator", -1994373198);
        term523066 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term523066, term523066.getClass(), "numerator", 268435456);
        setIntField(term523066, term523066.getClass(), "denominator", -1826402527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term523066;
        try {
            callMethod(klass, "add", argTypes, term522976, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


