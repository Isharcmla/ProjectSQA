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

public class Fraction_add_2763527042193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713606;
     Object term713688;

    public Fraction_add_2763527042193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term713606 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term713606, term713606.getClass(), "numerator", 64);
        setIntField(term713606, term713606.getClass(), "denominator", 1403998572);
        term713688 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term713688, term713688.getClass(), "numerator", -2147483648);
        setIntField(term713688, term713688.getClass(), "denominator", -1862332186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term713688;
        try {
            callMethod(klass, "add", argTypes, term713606, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


