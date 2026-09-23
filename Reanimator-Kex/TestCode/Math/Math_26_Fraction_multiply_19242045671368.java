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

public class Fraction_multiply_19242045671368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681093;
     Object term681183;

    public Fraction_multiply_19242045671368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681093 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term681093, term681093.getClass(), "numerator", -1878916634);
        setIntField(term681093, term681093.getClass(), "denominator", 2188);
        term681183 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term681183, term681183.getClass(), "numerator", -2147483647);
        setIntField(term681183, term681183.getClass(), "denominator", 1121321057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term681183;
        try {
            callMethod(klass, "multiply", argTypes, term681093, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


