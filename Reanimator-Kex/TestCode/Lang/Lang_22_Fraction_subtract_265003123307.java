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

public class Fraction_subtract_265003123307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86634;
     Object term86716;

    public Fraction_subtract_265003123307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86634 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term86634, term86634.getClass(), "numerator", 1);
        setIntField(term86634, term86634.getClass(), "denominator", -866787016);
        term86716 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term86716, term86716.getClass(), "numerator", 32);
        setIntField(term86716, term86716.getClass(), "denominator", 621153660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term86716;
        try {
            callMethod(klass, "subtract", argTypes, term86634, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


