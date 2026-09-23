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

public class Fraction_subtract_1936718128828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310123;
     Object term310211;

    public Fraction_subtract_1936718128828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310123 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term310123, term310123.getClass(), "numerator", 1048576);
        setIntField(term310123, term310123.getClass(), "denominator", -2147483648);
        term310211 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term310211, term310211.getClass(), "numerator", 268435456);
        setIntField(term310211, term310211.getClass(), "denominator", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term310211;
        try {
            callMethod(klass, "subtract", argTypes, term310123, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


