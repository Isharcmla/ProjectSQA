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

public class Fraction_add_7517755721558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term780934;
     Object term781024;

    public Fraction_add_7517755721558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term780934 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term780934, term780934.getClass(), "numerator", 2048);
        setIntField(term780934, term780934.getClass(), "denominator", -2067658030);
        term781024 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term781024, term781024.getClass(), "numerator", 4);
        setIntField(term781024, term781024.getClass(), "denominator", -1514280607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term781024;
        try {
            callMethod(klass, "add", argTypes, term780934, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


