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

public class Fraction_addSub_1779294476493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197024;
     Object term197114;

    public Fraction_addSub_1779294476493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197024 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term197024, term197024.getClass(), "numerator", 1048576);
        setIntField(term197024, term197024.getClass(), "denominator", -1673427455);
        term197114 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term197114, term197114.getClass(), "numerator", 16384);
        setIntField(term197114, term197114.getClass(), "denominator", -472748479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term197114;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term197024, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


