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

public class Fraction_subtract_74042599173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11502;
     Object term11592;

    public Fraction_subtract_74042599173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11502 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term11502, term11502.getClass(), "numerator", 1073741824);
        setIntField(term11502, term11502.getClass(), "denominator", 388164177);
        term11592 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term11592, term11592.getClass(), "numerator", 1073741824);
        setIntField(term11592, term11592.getClass(), "denominator", -1703040951);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term11592;
        try {
            callMethod(klass, "subtract", argTypes, term11502, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};
