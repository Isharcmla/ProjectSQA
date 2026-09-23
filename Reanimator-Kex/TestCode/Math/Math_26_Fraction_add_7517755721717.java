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

public class Fraction_add_7517755721717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861402;
     Object term861492;

    public Fraction_add_7517755721717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term861402 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term861402, term861402.getClass(), "numerator", 1073741824);
        setIntField(term861402, term861402.getClass(), "denominator", -2147483630);
        term861492 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term861492, term861492.getClass(), "numerator", 16777216);
        setIntField(term861492, term861492.getClass(), "denominator", -2147483631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term861492;
        try {
            callMethod(klass, "add", argTypes, term861402, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


