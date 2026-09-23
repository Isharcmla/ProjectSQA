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

public class Fraction_multiply_1924204567456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204020;
     Object term204110;

    public Fraction_multiply_1924204567456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204020 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term204020, term204020.getClass(), "numerator", -804191294);
        term204110 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term204110, term204110.getClass(), "numerator", -804256894);
        setIntField(term204110, term204110.getClass(), "denominator", 1897027059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term204110;
        try {
            callMethod(klass, "multiply", argTypes, term204020, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


