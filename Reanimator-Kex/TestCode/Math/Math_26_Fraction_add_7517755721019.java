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

public class Fraction_add_7517755721019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497091;
     Object term497181;

    public Fraction_add_7517755721019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497091 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term497091, term497091.getClass(), "numerator", 2048);
        setIntField(term497091, term497091.getClass(), "denominator", -1802238);
        term497181 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term497181, term497181.getClass(), "numerator", 2048);
        setIntField(term497181, term497181.getClass(), "denominator", -1945768567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term497181;
        try {
            callMethod(klass, "add", argTypes, term497091, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


