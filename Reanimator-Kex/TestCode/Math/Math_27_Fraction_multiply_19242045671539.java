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

public class Fraction_multiply_19242045671539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term641383;
     Object term641473;

    public Fraction_multiply_19242045671539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term641383 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term641383, term641383.getClass(), "numerator", -17825826);
        setIntField(term641383, term641383.getClass(), "denominator", 24732);
        term641473 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term641473, term641473.getClass(), "numerator", -2147483647);
        setIntField(term641473, term641473.getClass(), "denominator", 2006449621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term641473;
        try {
            callMethod(klass, "multiply", argTypes, term641383, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


