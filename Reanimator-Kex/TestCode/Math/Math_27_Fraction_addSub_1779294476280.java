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

public class Fraction_addSub_1779294476280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108568;
     Object term108658;

    public Fraction_addSub_1779294476280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108568 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term108568, term108568.getClass(), "numerator", 8388608);
        setIntField(term108568, term108568.getClass(), "denominator", -2076176383);
        term108658 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term108658, term108658.getClass(), "numerator", 8388608);
        setIntField(term108658, term108658.getClass(), "denominator", -1652156863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term108658;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term108568, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


