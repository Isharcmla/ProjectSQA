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

public class Fraction_multiplyBy_16360464552786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832098;
     Object term832178;

    public Fraction_multiplyBy_16360464552786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term832098 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term832098, term832098.getClass(), "numerator", 149846994);
        term832178 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term832178, term832178.getClass(), "numerator", 149846994);
        setIntField(term832178, term832178.getClass(), "denominator", 570441749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term832178;
        try {
            callMethod(klass, "multiplyBy", argTypes, term832098, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


