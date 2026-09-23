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

public class Fraction_subtract_740425991351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140272;
     Object term140362;

    public Fraction_subtract_740425991351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140272 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term140272, term140272.getClass(), "numerator", 512);
        setIntField(term140272, term140272.getClass(), "denominator", 1);
        term140362 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term140362, term140362.getClass(), "numerator", 2);
        setIntField(term140362, term140362.getClass(), "denominator", -535847740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term140362;
        try {
            callMethod(klass, "subtract", argTypes, term140272, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


