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

public class Fraction_add_7517755721411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term588247;
     Object term588337;

    public Fraction_add_7517755721411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term588247 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term588247, term588247.getClass(), "numerator", 33554432);
        setIntField(term588247, term588247.getClass(), "denominator", -1585201150);
        term588337 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term588337, term588337.getClass(), "numerator", 2048);
        setIntField(term588337, term588337.getClass(), "denominator", -1514206791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term588337;
        try {
            callMethod(klass, "add", argTypes, term588247, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


