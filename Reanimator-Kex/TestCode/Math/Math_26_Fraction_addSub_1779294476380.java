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

public class Fraction_addSub_1779294476380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166967;
     Object term167057;

    public Fraction_addSub_1779294476380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166967 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term166967, term166967.getClass(), "numerator", -2147483648);
        setIntField(term166967, term166967.getClass(), "denominator", -1756758783);
        term167057 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term167057, term167057.getClass(), "numerator", -2147483648);
        setIntField(term167057, term167057.getClass(), "denominator", -1756757311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term167057;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term166967, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


