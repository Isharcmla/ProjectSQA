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

public class Fraction_add_751775572135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43325;
     Object term43415;

    public Fraction_add_751775572135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43325 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term43325, term43325.getClass(), "numerator", 1);
        setIntField(term43325, term43325.getClass(), "denominator", -58720558);
        term43415 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term43415, term43415.getClass(), "numerator", -2147483648);
        setIntField(term43415, term43415.getClass(), "denominator", -2143289043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term43415;
        try {
            callMethod(klass, "add", argTypes, term43325, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


