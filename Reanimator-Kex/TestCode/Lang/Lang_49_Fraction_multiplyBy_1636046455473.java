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

public class Fraction_multiplyBy_1636046455473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130461;
     Object term130541;

    public Fraction_multiplyBy_1636046455473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130461 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term130461, term130461.getClass(), "numerator", 530464762);
        setIntField(term130461, term130461.getClass(), "denominator", 3218683);
        term130541 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term130541, term130541.getClass(), "numerator", 6406146);
        setIntField(term130541, term130541.getClass(), "denominator", 2011598337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term130541;
        try {
            callMethod(klass, "multiplyBy", argTypes, term130461, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


