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

public class Fraction_multiplyBy_16360464551305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382172;
     Object term382252;

    public Fraction_multiplyBy_16360464551305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382172 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term382172, term382172.getClass(), "numerator", 264863810);
        term382252 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term382252, term382252.getClass(), "numerator", 98370);
        setIntField(term382252, term382252.getClass(), "denominator", 2014458757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term382252;
        try {
            callMethod(klass, "multiplyBy", argTypes, term382172, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


