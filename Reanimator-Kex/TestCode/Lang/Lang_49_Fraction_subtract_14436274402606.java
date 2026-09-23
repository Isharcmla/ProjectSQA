package org.apache.commons.lang.math;

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
import java.lang.ArithmeticException;
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_14436274402606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term777727;
     Object term777807;

    public Fraction_subtract_14436274402606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term777727 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term777727, term777727.getClass(), "numerator", 2);
        setIntField(term777727, term777727.getClass(), "denominator", -1060157928);
        term777807 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term777807, term777807.getClass(), "numerator", 131072);
        setIntField(term777807, term777807.getClass(), "denominator", 1207448684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term777807;
        try {
            callMethod(klass, "subtract", argTypes, term777727, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


