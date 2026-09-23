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

public class Fraction_subtract_265003123528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161732;
     Object term161814;

    public Fraction_subtract_265003123528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161732 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term161732, term161732.getClass(), "numerator", 262144);
        setIntField(term161732, term161732.getClass(), "denominator", -268566600);
        term161814 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term161814, term161814.getClass(), "numerator", 1);
        setIntField(term161814, term161814.getClass(), "denominator", 211220668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term161814;
        try {
            callMethod(klass, "subtract", argTypes, term161732, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


