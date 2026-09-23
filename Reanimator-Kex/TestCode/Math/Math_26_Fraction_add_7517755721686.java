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

public class Fraction_add_7517755721686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843401;
     Object term843491;

    public Fraction_add_7517755721686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term843401 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term843401, term843401.getClass(), "numerator", 8);
        setIntField(term843401, term843401.getClass(), "denominator", -583266302);
        term843491 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term843491, term843491.getClass(), "numerator", 64);
        setIntField(term843491, term843491.getClass(), "denominator", -334409351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term843491;
        try {
            callMethod(klass, "add", argTypes, term843401, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


