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

public class Fraction_subtract_14436274401222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356309;
     Object term356389;

    public Fraction_subtract_14436274401222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356309 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term356309, term356309.getClass(), "numerator", 65536);
        setIntField(term356309, term356309.getClass(), "denominator", -207093832);
        term356389 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term356389, term356389.getClass(), "numerator", 64);
        setIntField(term356389, term356389.getClass(), "denominator", 159453884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term356389;
        try {
            callMethod(klass, "subtract", argTypes, term356309, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


