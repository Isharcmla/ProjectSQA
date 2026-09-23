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

public class Fraction_multiplyBy_16360464551880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551334;
     Object term551414;

    public Fraction_multiplyBy_16360464551880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551334 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term551334, term551334.getClass(), "numerator", 1726403586);
        term551414 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term551414, term551414.getClass(), "numerator", 545685506);
        setIntField(term551414, term551414.getClass(), "denominator", 1099725629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term551414;
        try {
            callMethod(klass, "multiplyBy", argTypes, term551334, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


