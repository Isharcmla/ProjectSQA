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

public class Fraction_subtract_2650031232539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term831937;
     Object term832019;

    public Fraction_subtract_2650031232539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term831937 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term831937, term831937.getClass(), "numerator", -2147483648);
        setIntField(term831937, term831937.getClass(), "denominator", -100712728);
        term832019 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term832019, term832019.getClass(), "numerator", 33554432);
        setIntField(term832019, term832019.getClass(), "denominator", 68548116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term832019;
        try {
            callMethod(klass, "subtract", argTypes, term831937, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


