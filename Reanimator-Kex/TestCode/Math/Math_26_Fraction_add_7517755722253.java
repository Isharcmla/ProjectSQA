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

public class Fraction_add_7517755722253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1117674;
     Object term1117764;

    public Fraction_add_7517755722253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1117674 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1117674, term1117674.getClass(), "numerator", 67108864);
        setIntField(term1117674, term1117674.getClass(), "denominator", -394248190);
        term1117764 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1117764, term1117764.getClass(), "numerator", 268435456);
        setIntField(term1117764, term1117764.getClass(), "denominator", -339944855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1117764;
        try {
            callMethod(klass, "add", argTypes, term1117674, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


