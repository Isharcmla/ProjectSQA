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

public class Fraction_multiply_19242045671757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881666;
     Object term881756;

    public Fraction_multiply_19242045671757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term881666 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term881666, term881666.getClass(), "numerator", -1072653062);
        term881756 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term881756, term881756.getClass(), "numerator", -2147480326);
        setIntField(term881756, term881756.getClass(), "denominator", 1624520823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term881756;
        try {
            callMethod(klass, "multiply", argTypes, term881666, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


