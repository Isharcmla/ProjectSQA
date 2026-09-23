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

public class Fraction_subtract_2650031231722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558018;
     Object term558100;

    public Fraction_subtract_2650031231722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558018 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term558018, term558018.getClass(), "numerator", -2147483648);
        setIntField(term558018, term558018.getClass(), "denominator", -2078591336);
        term558100 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term558100, term558100.getClass(), "numerator", 16);
        setIntField(term558100, term558100.getClass(), "denominator", 1614192556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term558100;
        try {
            callMethod(klass, "subtract", argTypes, term558018, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


