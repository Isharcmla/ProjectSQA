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

public class Fraction_subtract_2650031231298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420206;
     Object term420288;

    public Fraction_subtract_2650031231298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term420206 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term420206, term420206.getClass(), "numerator", 1073741824);
        setIntField(term420206, term420206.getClass(), "denominator", -1963475016);
        term420288 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term420288, term420288.getClass(), "numerator", 1073741824);
        setIntField(term420288, term420288.getClass(), "denominator", 1050409916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term420288;
        try {
            callMethod(klass, "subtract", argTypes, term420206, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


