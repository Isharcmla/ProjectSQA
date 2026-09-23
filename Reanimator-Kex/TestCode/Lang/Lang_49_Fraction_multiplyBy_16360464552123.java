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

public class Fraction_multiplyBy_16360464552123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624455;
     Object term624535;

    public Fraction_multiplyBy_16360464552123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624455 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term624455, term624455.getClass(), "numerator", 494689842);
        term624535 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term624535, term624535.getClass(), "numerator", 270537218);
        setIntField(term624535, term624535.getClass(), "denominator", 807421813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term624535;
        try {
            callMethod(klass, "multiplyBy", argTypes, term624455, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


