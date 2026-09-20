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

public class Fraction_add_751775572127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43790;
     Object term43880;

    public Fraction_add_751775572127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43790 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term43790, term43790.getClass(), "numerator", -1610612736);
        setIntField(term43790, term43790.getClass(), "denominator", -1745716833);
        term43880 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term43880, term43880.getClass(), "numerator", 1610612736);
        setIntField(term43880, term43880.getClass(), "denominator", -2021515839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term43880;
        try {
            callMethod(klass, "add", argTypes, term43790, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};
