package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_1936718128544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202661;
     Object term202749;

    public Fraction_subtract_1936718128544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202661 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term202661, term202661.getClass(), "numerator", 524288);
        setIntField(term202661, term202661.getClass(), "denominator", -2147483647);
        term202749 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term202749, term202749.getClass(), "numerator", 16777216);
        setIntField(term202749, term202749.getClass(), "denominator", -2147483646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term202749;
        try {
            callMethod(klass, "subtract", argTypes, term202661, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


