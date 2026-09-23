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

public class Fraction_multiplyBy_1636046455996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285885;
     Object term285965;

    public Fraction_multiplyBy_1636046455996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285885 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term285885, term285885.getClass(), "numerator", 553676898);
        setIntField(term285885, term285885.getClass(), "denominator", 1048576);
        term285965 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term285965, term285965.getClass(), "numerator", 134217729);
        setIntField(term285965, term285965.getClass(), "denominator", 1619015733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term285965;
        try {
            callMethod(klass, "multiplyBy", argTypes, term285885, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


