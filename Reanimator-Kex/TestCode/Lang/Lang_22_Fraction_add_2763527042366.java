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

public class Fraction_add_2763527042366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773471;
     Object term773553;

    public Fraction_add_2763527042366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term773471 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term773471, term773471.getClass(), "numerator", -2147483648);
        setIntField(term773471, term773471.getClass(), "denominator", 649935036);
        term773553 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term773553, term773553.getClass(), "numerator", 134217728);
        setIntField(term773553, term773553.getClass(), "denominator", -873466418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term773553;
        try {
            callMethod(klass, "add", argTypes, term773471, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


