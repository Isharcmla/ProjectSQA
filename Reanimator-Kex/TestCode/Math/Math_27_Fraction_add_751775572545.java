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

public class Fraction_add_751775572545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217853;
     Object term217943;

    public Fraction_add_751775572545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217853 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term217853, term217853.getClass(), "numerator", 512);
        setIntField(term217853, term217853.getClass(), "denominator", -126222190);
        term217943 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term217943, term217943.getClass(), "numerator", 536870912);
        setIntField(term217943, term217943.getClass(), "denominator", -1815347503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term217943;
        try {
            callMethod(klass, "add", argTypes, term217853, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


