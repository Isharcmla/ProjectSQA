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

public class Fraction_add_7517755721477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736018;
     Object term736108;

    public Fraction_add_7517755721477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term736018 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term736018, term736018.getClass(), "numerator", 1048576);
        setIntField(term736018, term736018.getClass(), "denominator", -1618011646);
        term736108 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term736108, term736108.getClass(), "numerator", 8);
        setIntField(term736108, term736108.getClass(), "denominator", -2036566807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term736108;
        try {
            callMethod(klass, "add", argTypes, term736018, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


