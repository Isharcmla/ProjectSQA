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

public class Fraction_addSub_17792944761360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564252;
     Object term564342;

    public Fraction_addSub_17792944761360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term564252 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term564252, term564252.getClass(), "numerator", 536870912);
        setIntField(term564252, term564252.getClass(), "denominator", -1091044415);
        term564342 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term564342, term564342.getClass(), "numerator", 536870912);
        setIntField(term564342, term564342.getClass(), "denominator", -1021834239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term564342;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term564252, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


