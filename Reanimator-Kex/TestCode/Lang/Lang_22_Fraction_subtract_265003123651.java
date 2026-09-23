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

public class Fraction_subtract_265003123651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204389;
     Object term204471;

    public Fraction_subtract_265003123651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204389 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term204389, term204389.getClass(), "numerator", 4194304);
        setIntField(term204389, term204389.getClass(), "denominator", -268623400);
        term204471 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term204471, term204471.getClass(), "numerator", 2);
        setIntField(term204471, term204471.getClass(), "denominator", 211881548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term204471;
        try {
            callMethod(klass, "subtract", argTypes, term204389, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


