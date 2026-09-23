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

public class Fraction_subtract_1443627440801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224756;
     Object term224836;

    public Fraction_subtract_1443627440801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224756 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term224756, term224756.getClass(), "numerator", 1073741824);
        setIntField(term224756, term224756.getClass(), "denominator", -1130408616);
        term224836 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term224836, term224836.getClass(), "numerator", 1073741824);
        setIntField(term224836, term224836.getClass(), "denominator", 1607401484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term224836;
        try {
            callMethod(klass, "subtract", argTypes, term224756, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


