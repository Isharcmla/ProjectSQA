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

public class Fraction_add_751775572908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379755;
     Object term379845;

    public Fraction_add_751775572908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379755 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term379755, term379755.getClass(), "numerator", 512);
        setIntField(term379755, term379755.getClass(), "denominator", -33484782);
        term379845 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term379845, term379845.getClass(), "numerator", 131072);
        setIntField(term379845, term379845.getClass(), "denominator", -2108705007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term379845;
        try {
            callMethod(klass, "add", argTypes, term379755, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


