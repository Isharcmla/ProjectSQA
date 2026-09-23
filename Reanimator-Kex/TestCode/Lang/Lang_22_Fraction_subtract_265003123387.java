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

public class Fraction_subtract_265003123387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111459;
     Object term111541;

    public Fraction_subtract_265003123387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111459 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term111459, term111459.getClass(), "numerator", 131072);
        setIntField(term111459, term111459.getClass(), "denominator", -805766184);
        term111541 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term111541, term111541.getClass(), "numerator", 33554432);
        setIntField(term111541, term111541.getClass(), "denominator", 671169356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term111541;
        try {
            callMethod(klass, "subtract", argTypes, term111459, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


