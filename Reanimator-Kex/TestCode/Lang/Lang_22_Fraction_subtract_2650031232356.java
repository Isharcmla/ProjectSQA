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

public class Fraction_subtract_2650031232356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770456;
     Object term770538;

    public Fraction_subtract_2650031232356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term770456 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term770456, term770456.getClass(), "numerator", -2147483648);
        setIntField(term770456, term770456.getClass(), "denominator", -46664200);
        term770538 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term770538, term770538.getClass(), "numerator", 16777216);
        setIntField(term770538, term770538.getClass(), "denominator", 36440028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term770538;
        try {
            callMethod(klass, "subtract", argTypes, term770456, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


