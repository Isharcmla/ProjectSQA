package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_4574221381323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430497;
     Object term430579;

    public Fraction_multiplyBy_4574221381323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430497 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term430497, term430497.getClass(), "numerator", 1472133082);
        term430579 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term430579, term430579.getClass(), "numerator", 536936448);
        setIntField(term430579, term430579.getClass(), "denominator", 1870585585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term430579;
        try {
            callMethod(klass, "multiplyBy", argTypes, term430497, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


