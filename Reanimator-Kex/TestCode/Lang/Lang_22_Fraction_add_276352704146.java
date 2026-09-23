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

public class Fraction_add_276352704146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33444;
     Object term33526;

    public Fraction_add_276352704146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33444 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term33444, term33444.getClass(), "numerator", -2147483648);
        setIntField(term33444, term33444.getClass(), "denominator", 2147483644);
        term33526 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term33526, term33526.getClass(), "numerator", -2147483648);
        setIntField(term33526, term33526.getClass(), "denominator", -2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term33526;
        try {
            callMethod(klass, "add", argTypes, term33444, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


