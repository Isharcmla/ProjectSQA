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

public class Fraction_add_14549770211604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471122;
     Object term471202;

    public Fraction_add_14549770211604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471122 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term471122, term471122.getClass(), "numerator", 262144);
        setIntField(term471122, term471122.getClass(), "denominator", 1566983572);
        term471202 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term471202, term471202.getClass(), "numerator", 268435456);
        setIntField(term471202, term471202.getClass(), "denominator", -2009702630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term471202;
        try {
            callMethod(klass, "add", argTypes, term471122, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


