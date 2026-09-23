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

public class Fraction_subtract_2650031232206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718171;
     Object term718253;

    public Fraction_subtract_2650031232206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term718171 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term718171, term718171.getClass(), "numerator", 1073741824);
        setIntField(term718171, term718171.getClass(), "denominator", -1285963832);
        term718253 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term718253, term718253.getClass(), "numerator", 1073741824);
        setIntField(term718253, term718253.getClass(), "denominator", 1038065668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term718253;
        try {
            callMethod(klass, "subtract", argTypes, term718171, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


