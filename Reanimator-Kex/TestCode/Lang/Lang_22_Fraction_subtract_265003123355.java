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

public class Fraction_subtract_265003123355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101844;
     Object term101926;

    public Fraction_subtract_265003123355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101844 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term101844, term101844.getClass(), "numerator", -2147483648);
        setIntField(term101844, term101844.getClass(), "denominator", -1862926536);
        term101926 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term101926, term101926.getClass(), "numerator", -2147483648);
        setIntField(term101926, term101926.getClass(), "denominator", 1412249980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term101926;
        try {
            callMethod(klass, "subtract", argTypes, term101844, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


