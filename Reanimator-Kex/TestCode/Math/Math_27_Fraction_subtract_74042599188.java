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

public class Fraction_subtract_74042599188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17488;
     Object term17578;

    public Fraction_subtract_74042599188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17488 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term17488, term17488.getClass(), "numerator", 1073741824);
        setIntField(term17488, term17488.getClass(), "denominator", 1);
        term17578 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term17578, term17578.getClass(), "numerator", 1073741824);
        setIntField(term17578, term17578.getClass(), "denominator", -2126252540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term17578;
        try {
            callMethod(klass, "subtract", argTypes, term17488, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


