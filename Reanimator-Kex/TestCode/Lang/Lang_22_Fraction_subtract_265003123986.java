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

public class Fraction_subtract_265003123986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315648;
     Object term315730;

    public Fraction_subtract_265003123986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315648 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term315648, term315648.getClass(), "numerator", 67108864);
        setIntField(term315648, term315648.getClass(), "denominator", -1382064136);
        term315730 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term315730, term315730.getClass(), "numerator", 134217728);
        setIntField(term315730, term315730.getClass(), "denominator", 1149265884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term315730;
        try {
            callMethod(klass, "subtract", argTypes, term315648, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


