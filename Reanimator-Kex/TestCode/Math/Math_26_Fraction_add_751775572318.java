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

public class Fraction_add_751775572318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132902;
     Object term132992;

    public Fraction_add_751775572318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132902 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term132902, term132902.getClass(), "numerator", -2147483648);
        setIntField(term132902, term132902.getClass(), "denominator", -939376446);
        term132992 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term132992, term132992.getClass(), "numerator", 32);
        setIntField(term132992, term132992.getClass(), "denominator", -473625063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term132992;
        try {
            callMethod(klass, "add", argTypes, term132902, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


