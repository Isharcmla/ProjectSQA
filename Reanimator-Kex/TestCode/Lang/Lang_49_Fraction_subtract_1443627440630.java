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

public class Fraction_subtract_1443627440630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174715;
     Object term174795;

    public Fraction_subtract_1443627440630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174715 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term174715, term174715.getClass(), "numerator", 33554432);
        setIntField(term174715, term174715.getClass(), "denominator", -86098520);
        term174795 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term174795, term174795.getClass(), "numerator", 536870912);
        setIntField(term174795, term174795.getClass(), "denominator", 114594420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term174795;
        try {
            callMethod(klass, "subtract", argTypes, term174715, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


