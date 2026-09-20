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

public class Fraction_subtract_74042599179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14678;
     Object term14768;

    public Fraction_subtract_74042599179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14678 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term14678, term14678.getClass(), "numerator", 1073741824);
        setIntField(term14678, term14678.getClass(), "denominator", 747152567);
        term14768 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term14768, term14768.getClass(), "numerator", 1073741824);
        setIntField(term14768, term14768.getClass(), "denominator", -218319686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term14768;
        try {
            callMethod(klass, "subtract", argTypes, term14678, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};
