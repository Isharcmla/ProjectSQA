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

public class Fraction_add_751775572101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26245;
     Object term26335;

    public Fraction_add_751775572101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26245 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term26245, term26245.getClass(), "numerator", 8);
        setIntField(term26245, term26245.getClass(), "denominator", -46159806);
        term26335 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term26335, term26335.getClass(), "numerator", 256);
        setIntField(term26335, term26335.getClass(), "denominator", -398474791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term26335;
        try {
            callMethod(klass, "add", argTypes, term26245, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


