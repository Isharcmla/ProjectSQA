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

public class Fraction_add_751775572616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283825;
     Object term283915;

    public Fraction_add_751775572616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283825 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term283825, term283825.getClass(), "numerator", -2147483648);
        setIntField(term283825, term283825.getClass(), "denominator", -1894179598);
        term283915 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term283915, term283915.getClass(), "numerator", 16777216);
        setIntField(term283915, term283915.getClass(), "denominator", -1737464063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term283915;
        try {
            callMethod(klass, "add", argTypes, term283825, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


